# Phase 4 — "Login screen via software renderer in browser": move/stay/seam analysis

**Date:** 2026-06-12
**Milestone under analysis:** Phase 4 §3 — *login screen via software renderer in browser.*
**Question:** Phase 3 left the software renderer (`ha_Sub1`) in `commonMain`, but the code that *drives* it to the login screen still lives almost entirely in `jvmMain`. This document inventories what must **move** to `commonMain`, what must **stay** in `jvmMain`, and what still needs **seaming**, so the milestone is actually achievable.

---

## 0. TL;DR

The renderer is done; the **orchestration spine that calls the renderer is not**. To reach the login screen on web you must get this chain runnable in `commonMain`:

```
Loader.main → Applet_Sub1.run/runFrame → Client.init/method84/method88 → Class348_Sub5.method2753 (builds ha_Sub1) → ha_Sub1 draw → GameSurface.blit
```

Everything in bold below is the new work for this milestone:

- **Move to commonMain:** `Client` (2,681 LOC), `Applet_Sub1`, `GameApplet`, `Class348_Sub5`, and their portable renderer collaborators (`Class216`, `Class305`, `s_Sub1`, the `*Base` host files, etc.). These are portable game logic that is in `jvmMain` only by transitive coupling.
- **Stay in jvmMain:** the JNI renderers (`ha_Sub2`/`ha_Sub3`/`Class377`/`Class378` + the 166 JNI files), the AWT window shell (`Loader`, `Canvas_Sub1`, `AwtDisplayTarget`, the `Class348_Sub31` blit hierarchy), `javax.sound`, raw sockets/files. None of these are on the software-login draw path except the surface, which is already seamed.
- **New seams needed (the actual blockers):** a **`WindowShell`/applet-bootstrap seam** (the `Frame`/`Applet`/`Canvas`-grabbing code inside `Loader`/`Applet_Sub1`/`Client`), the **`GameConnection` web impl over WebSocket** (login needs a socket), an **`InputSource` wiring** for the canvas, and **font/glyph** confirmation. Most are small; the window-shell seam is the one structural piece left.

The headline: this milestone is **~70% a "move portable code" exercise and ~30% a "three small new seams" exercise.** No large new platform abstraction is missing — the hard seams (Surface, Cache, Clock, Connection base, Audio, Locking) were all landed in Phase 3.

---

## 1. Current source-set reality

| Source set | Files | What's there |
|---|---|---|
| `commonMain` | **95** | service seams (Clock/Locking/Surface/Cache/Audio/Connection base/HTTP/Font…), `ha` + `ha_Sub1` (software renderer, import-clean), and ~40 already-moved game-logic classes |
| `jvmMain` | **812** | everything else, including the entire boot/orchestration spine |

Of the 812 `jvmMain` files, **559 (69%) have no `java.*`/`javax.*`/JNI imports at all** — they are portable code awaiting a move, gated only by transitive coupling (Gradle is the oracle). **253 (31%) are genuinely platform-bound**, and those break down as:

| Platform binding | Files | On the software-login path? |
|---|---|---|
| JNI (`jaggl`/`jagdx`/`jaclib`/`jagtheora`/`external fun`) | 166 | **No** — all hardware-render / video / native-buffer |
| `java.awt` / `javax.swing` | 65 | **Partly** — only the window shell + surface (already seamed) |
| `java.io` (file/cache) | 21 | No — behind `CacheStorage` seam |
| `java.util.*` | 18 | Incidental; mechanical replacement |
| Threading | 9 | No — behind `WorkerFactory`/`GameLoop`/`Sleeper` seams |
| `java.net` | 8 | **Yes** — login needs a connection (see §4) |
| reflect | 4 | One site on path (`Client` AWT-canvas grab) |
| `com.ms.*` (dead) | 5 | No — delete candidates |

The point: **most of the 31% platform-bound bucket is the GL/D3D renderers and JNI, none of which the software login screen touches.** The software path threads a narrow corridor through the codebase.

---

## 2. The login-screen path, class by class

Reaching the login screen in this (obfuscated RS 634) client is the **boot → applet shell → render driver → `ha_Sub1` → blit** chain. There is no literal `login()`/`password` method — the login screen is a server-driven cs2 interface rendered through the generic frame/render pipeline. So the "login path" is the boot-to-first-frame path plus a live `GameConnection`.

| # | Class | Now | Target | Action |
|---|---|---|---|---|
| 1 | `Loader` | JVM | **jvmMain (app-jvm)** | **STAY.** Pure JFrame/JPanel shell. Web gets a parallel `app-web` bootstrap. |
| 2 | `GameApplet` | JVM | **commonMain** (minus `Component`) | **MOVE + SEAM.** Only dep is `java.awt.Component` via `getPulseComponent()`. Seam that out. |
| 3 | `Applet_Sub1` | JVM | **commonMain core + jvm shell** | **SPLIT.** `runFrame()` body is portable; the `Frame`/`Panel`/`FocusListener`/`WindowListener` plumbing + `"jaclib"` probe is jvm. |
| 4 | `Client` (2,681 LOC) | JVM | **commonMain** (minus 4 AWT sites) | **MOVE + SEAM.** Only 5 platform imports; AWT used in exactly 4 shallow spots (§3). The bulk is portable game/render logic. |
| 5 | `Class348_Sub5` | JVM | **commonMain** | **MOVE.** `method2753` builds `ha_Sub1` via injected factories; sole jvm import is `java.awt.Canvas` (one signature). |
| 6 | `ha` | COMMON | — | **DONE.** Abstract base, import-clean. |
| 7 | **`ha_Sub1`** | COMMON | — | **DONE.** Software renderer, zero AWT/JNI, fully factory-injected. |
| 8 | `GameSurface`/`GameSurfaceFactory`/`DisplayTarget` | COMMON | — | **DONE.** The render seam. |
| 9 | `AwtGameSurfaceFactory` | JVM | jvmMain | **STAY** (jvm actual). Web writes `WebGlSurfaceFactory`/`CanvasSurfaceFactory`. |
| 10 | `Class348_Sub31` (+`_Sub1` BufferedImage, `_Sub2` ImageProducer) | JVM | jvmMain | **STAY.** The real AWT blit boundary, already behind `GameSurface`. Web gets a `<canvas>` `putImageData` impl. |
| 11 | `Canvas_Sub1`, `AwtDisplayTarget`, `Class305` | JVM | jvmMain | **STAY** (jvm window/canvas). `Class305` holds the canvas handle — its *interface* is common, the AWT field is jvm. |
| 12 | `Class369_Sub3_Sub1` | JVM | commonMain? | **MOVE** likely — only `java.awt.event.ActionEvent` import; frame blit dispatcher otherwise portable. |
| 13 | `Class297` (signlink) | JVM | jvmMain | **STAY.** `java.awt.*`, `datatransfer`, `reflect`, `java.net.Socket` — this is the platform integration hub. Its *seams* (Cache/Clipboard/Connection) are already common. |
| 14 | `Class216`, `s_Sub1`, `Class60`, `Class124`, `Class143`, `Class64`, `s`, `Class324`, `Class229`, `Class241`, `Class348_Sub8` | JVM | **commonMain** | **MOVE.** Renderer collaborators / clock / `*Base` host files. **No `java.*`/`javax.*`/JNI imports** — jvm only by transitive coupling. |

**Not on the software path (stay jvm, ignore for this milestone):** `ha_Sub2`, `ha_Sub3`, `Class377`, `Class378` (GL/D3D + JNI), `Class286_Sub8` (GL reset), `Class59_Sub2_Sub1` (audio init), `jagtheora` video, the 166 JNI files.

---

## 3. Client.kt — the one big move, and why it's tractable

`Client.kt` is 2,681 lines but holds **only 5 platform imports** (`java.awt.{Canvas,Component,Container,Frame}` + `java.util.*`), and AWT is referenced in exactly **four shallow sites**:

1. **`val frame = Frame("Jagex")`** (~line 631) — fullscreen-window creation. → behind a `WindowShell` seam.
2. **AWT-reflection canvas grab** (~lines 1638–1645): `field.get(Class93.anApplet1530) as? Canvas` then `AwtDisplayTarget(it)`. This is the applet→canvas bridge. → web supplies its canvas directly; seam as `DisplayTarget provideSurface()`.
3. **`container = applet as? Container`** (~line 1670) — same applet-shell concern.
4. **`override fun getPulseComponent(): Component?`** (~line 1841) — returns the focus component for input. → change return type to a common `FocusTarget`/`DisplayTarget` seam type.

`java.util.*` resolves to only ~3 real uses (Hashtable/Vector/Random class) — mechanical.

**So the 2,681-line move is gated by ~4 lines of AWT, all of which belong to one new seam (the window shell).** Once that seam exists, `Client` is a `commonMain` class. This is the single highest-leverage move in the whole milestone.

---

## 4. New seams required for this milestone

Phase 3 delivered the heavy seams. Four pieces remain before a browser login screen can draw and authenticate:

### 4.1 `WindowShell` / applet-bootstrap seam — **structural, required**
The `Frame("Jagex")` creation, the applet-reflection canvas grab, the `Container`/`Component` casts, and `getPulseComponent()` are the last AWT cluster wired *into game logic* (`Client`, `Applet_Sub1`, `GameApplet`). Define a small `commonMain` interface — create/own the display surface, expose a focus target, report dimensions — with `AwtWindowShell` (jvm, wraps `Frame`/`Canvas_Sub1`) and `CanvasWindowShell` (web, wraps the DOM `<canvas>`). This unblocks the `Client`/`Applet_Sub1`/`GameApplet` moves.

### 4.2 `GameConnection` web impl over WebSocket — **required for login (not just the screen)**
The connection **base** `Class238` is already common and JS5/game-connect already flow through it (Phase 3). What's missing is a **non-JVM actual**: browsers can't open TCP, so login requires a **WebSocket→TCP proxy** + a `WebSocketGameConnection` web impl. *If the goal is only to render the login screen (no auth), this can be stubbed; if "login" means a successful handshake, the proxy is mandatory infra* — this is the Phase 4 §2 / open-question-1 dependency. Flag it explicitly: **rendering the login screen ≠ logging in.**

### 4.3 `InputSource` canvas wiring — **small**
Input *bases* (`Class346`, `Class373`) are already common (Phase 3). The login screen needs keyboard/mouse to type credentials, so the web `InputSource` actual (DOM `keydown`/`mousemove` → the existing event queue) must exist. The AWT actual already does. Low risk — the queue design is already shared.

### 4.4 Font / glyph confirmation — **verify, likely small**
`GlyphRasterizer`/`RasterFont` seam exists with an AWT actual (Phase 3). Confirm the login screen's text uses the **bitmap-font** path (already seamed) and not the AWT `Font`/`FontMetrics` holdouts (`Class199`, `Class294` — the noted font holdouts). If login text is bitmap-font, no new work; if it needs vector fonts, a web `canvas2d` glyph actual is required.

---

## 5. File-splitting needs (keep jvm-specific code in separate files)

Your stated preference — *jvm-specific things in separate files for ease of migration* — is already the established pattern (`haStatics`, `Class234Statics`, `Class238Statics`, `Class348Statics`, `Class64_Sub1Statics`, the `*Base` interface files). For this milestone, the splits to make are:

| Class | Split out to jvm | Common remainder |
|---|---|---|
| `Applet_Sub1` | `AwtAppletShell` — `Frame`/`Panel`/`FocusListener`/`WindowListener`, `"jaclib"` native probe | `runFrame()` + loop body |
| `Client` | nothing new if §4.1 seam lands — the 4 AWT sites route through `WindowShell` | the whole class |
| `GameApplet` | `getPulseComponent()`'s `Component` type → seam type | the rest |
| `Class348_Sub5` | the one `Canvas` signature → `DisplayTarget` | `method2753` |

Don't pre-split the 559 zero-import files — most need no split at all; they just **move** once Gradle confirms their graph is common-clean. Split only where a file genuinely mixes portable logic with a `java.*` touchpoint.

---

## 6. Recommended order for the milestone

1. **`WindowShell` seam** (§4.1) — wrap the `Frame`/applet/canvas-grab/`getPulseComponent` cluster; JVM actual wraps existing AWT. JVM stays green. *This is the keystone.*
2. **Move the spine to commonMain**, bottom-up, Gradle as oracle: collaborators first (`Class216`, `s_Sub1`, `*Base` hosts, `Class229/241/348_Sub8`, `Class348_Sub5`, `Class369_Sub3_Sub1`), then `GameApplet`, then `Applet_Sub1` (post-split), then **`Client`**. Each move keeps `compileKotlinJvm` clean.
3. **Confirm fonts/input** (§4.3, §4.4) — verify login text + credential input route through already-common seams.
4. **Add `js()`/`wasmJs()` + `webMain`** with `CanvasWindowShell`, `CanvasSurfaceFactory`, web `InputSource`, OPFS `CacheStorage`. Render the login screen with **no connection** first (stub `GameConnection`) — this proves the renderer+surface+input in-browser.
5. **WebSocket proxy + `WebSocketGameConnection`** (§4.2) — only needed to progress from "screen visible" to "actually logging in".

Step 4's stubbed-connection checkpoint is the true "login screen via software renderer in browser" milestone; step 5 is "login works."

---

## 7. Risks specific to this milestone

| Risk | Severity | Note |
|---|---|---|
| `Client` (2,681 LOC) hides transitive jvm deps beyond the 4 AWT sites | Med | Gradle move will surface them; expect a few collaborator classes to need moving first |
| "Login screen" conflated with "login works" — the former needs no socket, the latter needs the WebSocket proxy | High (scoping) | Decide which milestone you're targeting *before* building proxy infra |
| Web single-threadedness vs. the spine's loop assumptions | Med | Phase 3 `GameLoop`/`WorkerFactory` seams already address this; validate `runFrame()` drives from `requestAnimationFrame` |
| Login-screen fonts use the AWT `Font` holdouts (`Class199`/`Class294`), not the bitmap path | Low–Med | Verify early (§4.4); if so, add a web glyph actual |
| Applet-reflection canvas grab (`Class93.anApplet1530`) has no web analogue | Low | Web supplies the canvas directly; the reflection branch becomes jvm-only behind `WindowShell` |

---

## 8. Bottom line

Nothing large is architecturally missing. The Phase 3 seams cover the platform surface this milestone needs, **except one new structural seam (`WindowShell`) and one piece of infrastructure (WebSocket proxy, only if "login" means authentication).** The dominant work is **moving the orchestration spine — above all `Client` — from `jvmMain` to `commonMain`**, which is unlocked by the `WindowShell` seam plus the routine bottom-up collaborator moves you've been doing all through Phase 3. The 166 JNI files and the GL/D3D renderers stay in `jvmMain` and are simply **not on the software-login path** — they can be ignored entirely for this milestone.
