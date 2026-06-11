# GameSurface seam — scoping

Phase 3, Tier 3. Goal: define the `GameSurface` seam so the software renderer (`ha_Sub1`)
can move to `commonMain`. This is the plan's headline Phase-3 deliverable (KMP_MIGRATION §5
Phase 3.3). This document scopes the work; it does **not** implement it.

## TL;DR of the finding

`ha_Sub1` barely touches AWT itself. The real AWT boundary for the software path is a small,
well-isolated blit object — the **`Class348_Sub31` family** — which owns the pixel buffer and
pushes it to the screen. If we seam that family plus the two Canvas leaks in `ha_Sub1`, the
software renderer becomes platform-free. The hardware toolkits (`ha_Sub2` GL, `ha_Sub3`/`Class378`
D3D) keep their Canvas use and stay in `jvmMain` untouched.

## The actual AWT boundary (software path)

### `ha_Sub1` (software renderer) — only TWO Canvas uses
The renderer is otherwise pure integer/float pixel math. Its only AWT touchpoints:
1. `canvas.hashCode()` — used purely as a **cache key** into `aClass356_7467` (an id→object map)
   to find the per-canvas backing surface. Methods: `method3643` (create), `method3669` (resize),
   `method3677` (attach/detach), `method3701` (dispose).
2. `canvas.getSize()` → `dimension.width/height` — to read the surface size on attach/resize.

Everything else delegates to the backing surface object (`Class348_Sub31`).

### `Class348_Sub31` (abstract) — the blit surface = the real seam
Fields: `anIntArray6916` (the ARGB pixel buffer), `anInt6917` (width), `anInt6920` (height).
Two abstract methods:
- `method3008(canvas, flag, width, height)` — allocate the buffer + platform image for a canvas.
- `method3011(y, ?, h, graphics, flag, x, w, srcY)` — **blit a sub-rect of the buffer to the screen**,
  with clipping.

Two concrete impls (chosen by try/fallback in `Class110.method1035`):
- **`Class348_Sub31_Sub1`** (preferred): wraps the `IntArray` in a `BufferedImage` via
  `DataBufferInt` + `DirectColorModel(32, 0xFF0000, 0xFF00, 0xFF)` + `Raster.createWritableRaster`.
  `method3011` does `graphics.setClip(rect)` → `graphics.drawImage(image, dx, dy, canvas)` → restore clip.
- **`Class348_Sub31_Sub2`** (fallback): implements `java.awt.image.ImageProducer`; feeds the same
  `IntArray` to an `ImageConsumer` via `setPixels`, backs `canvas.createImage(this)`; `method3011`
  re-pushes pixels then `graphics.drawImage(...)`. Used only when the BufferedImage path throws.

Both are pure "here is an ARGB IntArray of size w×h; present it to a rectangular region of the
display, with clip" — i.e. exactly a `GameSurface.present(...)` operation.

### Windowing / canvas creation (separate, smaller concern)
- `Class305.aCanvas3869` holds the game canvas; `Canvas_Sub1` is the `Canvas` subclass that
  forwards `paint`/`update` to a `Component`. Frame/Panel bootstrap is in `Loader`/`Applet_Sub1`/`GameApplet`.
- Several factories thread a `Canvas?` purely as an opaque handle into toolkit construction
  (`Class104.method958`, `Class262.method2000`, `Class306.method2297`, `Class93.method862`,
  `Class96.method870`, `Class378.createToolkit`, `ha.method3692`). For the software path these can
  take a `GameSurface` handle instead; for the HW path they keep `Canvas`.

## Proposed seam shape

A plain injected interface (not expect/actual) — matches plan §4 ("prefer interfaces for the large
seams; testable, mockable"). Two interfaces, because creation and presentation are distinct:

```kotlin
// commonMain
interface GameSurface {
    val width: Int
    val height: Int
    /** ARGB8888 pixel buffer, length width*height; the renderer writes into this directly. */
    val pixels: IntArray
    /** Present a sub-rectangle of [pixels] to the display, with clip. Mirrors method3011. */
    fun present(srcX: Int, srcY: Int, dstX: Int, dstY: Int, w: Int, h: Int)
    fun dispose()
}

interface GameSurfaceFactory {
    /** Allocate a surface of w*h bound to the given display target. Mirrors Class110.method1035. */
    fun create(target: DisplayTarget, w: Int, h: Int): GameSurface
}
```

- `DisplayTarget` = the opaque per-platform handle the surface presents into (JVM: the `Canvas` +
  its `Graphics`; web: a `<canvas>`/2D context; native: a GL-textured quad). On JVM it also supplies
  the identity used today as `canvas.hashCode()` and the size used today as `canvas.getSize()`.
- The `aClass356_7467` hashCode→surface cache in `ha_Sub1` becomes a `Map<DisplayTarget, GameSurface>`
  (or just hold the single active `GameSurface` — the cache exists because one renderer can serve
  multiple canvases; verify whether >1 is ever live before simplifying).

### JVM actuals (wrap existing code, keep byte-identical)
- `AwtGameSurface` ← merge `Class348_Sub31_Sub1` (+ `_Sub2` fallback) almost verbatim; `present` = the
  current `method3011` body; `pixels` = `anIntArray6916`.
- `AwtGameSurfaceFactory` ← `Class110.method1035`'s try/fallback (BufferedImage then ImageProducer).
- `DisplayTarget` JVM impl wraps `Canvas` (+ supplies `Graphics` at present time, identity, size).

The ARGB layout already matches: `DirectColorModel(32, 0xFF0000, 0xFF00, 0xFF)` is packed
0x00RRGGBB / 0xAARRGGBB — same packing as the `Rect`/loading-bar int-color seams done earlier, so
no pixel-format conversion is needed.

## Move plan (suggested order, each step keeps JVM green)

1. ✅ **DONE (commit 8a95962) — interfaces in commonMain.** `GameSurface` (width/height/pixels/
   present/dispose), `GameSurfaceFactory.create(target,w,h)`, `DisplayTarget` (width/height). Purely
   additive; nothing implements or consumes them. `present(clipX, clipY, width, height, srcX, srcY,
   restoreClip)` mirrors `Class348_Sub31.method3011(i, i_0_, i_1_, graphics, i_2_, i_3_, i_4_, i_5_)`:
   clipX=i_3_, clipY=i, width=i_4_, height=i_1_, srcX=i_0_, srcY=i_5_, restoreClip=(i_2_==-1). The two
   call sites in ha_Sub1 (lines ~2050, ~2347) always pass the restore flag (-1).
2. **JVM actuals wrapping the existing classes** — `AwtGameSurface`/`Factory`/`DisplayTarget`
   delegating to the unchanged `Class348_Sub31*` + `Class110.method1035`. Wire them at the few
   factory call sites behind the existing `Canvas` (adapter: `Canvas` → `DisplayTarget`). JVM still
   uses the exact same blit code; build stays green.
3. **Re-point `ha_Sub1`** from `Canvas`/`Class348_Sub31` to `GameSurface`/`GameSurfaceFactory`
   (replace the 4 Canvas methods + the 2 `getSize`/`hashCode` leaks). Still in jvmMain, still green.
4. **Move `ha_Sub1` to commonMain.** At this point it should have no `java.awt` import left. The
   blit lives behind `GameSurface`; the AWT impl stays in jvmMain. Confirm via `compileKotlinJvm`
   and a no-`java.awt`-import grep on the moved file.
5. (Later phases) add web/native `GameSurface` impls; HW toolkits untouched.

## Scope boundaries / non-goals

- **Do NOT touch `ha_Sub2` (GL) or `ha_Sub3`/`Class377`/`Class378` (D3D).** They consume `Canvas`
  directly into JNI/GL context creation — out of scope, stay in jvmMain.
- **InputSource is a separate seam.** This doc is presentation only; key/mouse/focus event wiring
  (`Canvas_Sub1`, the AWT listeners, `Component` in ~20 files) is the `InputSource` seam — scope
  it next, not here.
- **Windowing (Frame/Panel bootstrap in Loader/GameApplet) stays jvmMain** for now; the web/native
  app shells will provide their own `DisplayTarget`. Only the surface/blit boundary is in scope.

## Open questions — RESOLVED (investigation, this session)

### Q1 — one canvas per `ha_Sub1`? → YES, effectively 1:1. ✅
The `ha_Sub1` constructor (ha_Sub1.kt:1311) binds the instance to a single canvas:
`method3643(canvas)` + `method3677(canvas)`. Each toolkit is built fresh by
`Class104.method958` → `ha.method3692` → `Class348_Sub5.method2753` → `ha_Sub1(canvas, …)`
for one canvas. There are up to ~3 *separate* `ha` instances live at once — `Class21.aHa326`
(main, on `Class305.aCanvas3869`), `Class348_Sub8.aHa6654` (also on `aCanvas3869`),
`Class348_Sub34.aHa6968` (offscreen 36×32 throwaway `Canvas` from Class22; Class284 makes a
transient 100×100 too) — but each instance only ever sees its OWN canvas. External callers
(`Class124.method1108`, `s.method3980`, `Class348_Sub47`, `Class215`, `Class367_Sub11`) always
pass that same canvas. **Conclusion:** the `aClass356_7467` hashCode→surface map holds one live
entry per renderer; the multi-canvas generality is never exercised, so `GameSurface` can model a
single active surface per `ha_Sub1` (map collapses to one field). Keeping the map is also safe and
lower-diff — decide at implementation time.

### Q2 — is the `Sub2` ImageProducer fallback ever hit? → NO on any modern JVM. ✅
`Class348_Sub31_Sub2` is instantiated only in `Class110.method1035`'s `catch (throwable)`, i.e.
only if `Class348_Sub31_Sub1()` / its `method3008` throws. `Sub1.method3008` uses only core
java.desktop APIs (`DataBufferInt`, `DirectColorModel(32,…)`, `Raster.createWritableRaster`,
`BufferedImage`) that don't throw on any standard desktop JVM ≥1.4. The fallback is 2010-applet-era
defensive code for ancient/headless VMs. **Conclusion:** `Sub1` (BufferedImage) is always taken;
keep `Sub2` in the JVM actual for fidelity but DON'T shape the common seam around it.

### Q3 — is `aClass49_7475` a second presentation path? → NO, it's a portable in-memory target. ✅
`aClass49_7475` is a `Class49` (`Interface4`) set via `method3687(Interface4)` (ha_Sub1.kt:1405).
It's an OFF-SCREEN render target: when non-null, ha_Sub1 swaps its active pixel buffer
(`anIntArray7483`) to `class49.anIntArray4731` and renders there instead of the canvas surface.
`Class49` is pure `IntArray`/`FloatArray` memory with a back-ref to ha_Sub1 — **no AWT**. The
`aClass49_7475 == null` checks in method3677/method3669 just mean "targeting the screen surface vs
an off-screen buffer." **Conclusion:** `GameSurface` only needs to cover the canvas-backed path
(`aClass49_7475 == null`); the off-screen path is already common-ready and needs no seam.

### Net effect on the plan
All three resolutions *shrink* the work: single surface per renderer (Q1), no need to design around
the ImageProducer fallback (Q2), and the off-screen render path is already portable (Q3). The seam
is purely: wrap `Class348_Sub31_Sub1`'s buffer+blit as the JVM `GameSurface`, and replace ha_Sub1's
single canvas binding. Effort estimate holds at the low end (~3 days).

## Effort estimate

Steps 1–4 (software path to commonMain): ~3–5 focused days, low-to-medium risk because the JVM
actuals are near-verbatim moves of `Class348_Sub31*`. The risk is in `ha_Sub1`'s canvas-cache
plumbing and the factory call-site rewiring, not in the pixel code. Verify with the existing
oracle (`compileKotlinJvm`) after each step and a boot-to-login smoke test once `ha_Sub1` moves.
