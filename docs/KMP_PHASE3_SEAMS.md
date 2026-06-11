# Phase 3 — Remaining Seam Backlog

Snapshot of platform dependencies still in `jvmMain`, ranked as candidate seams. Counts are *files importing the type*. Done so far this phase: `Rect` (java.awt.Rectangle), loading-bar `Color[]`→`IntArray`, `GlyphRasterizer` (NativeFontRasterizer over Class323), `IOException` (expect/actual typealias), `java.awt.Font`/`FontMetrics` holdouts (Class199/Class294/Class351 routed through `GlyphRasterizer`/`RasterFont` — `AwtGlyphRasterizer.wrap()` + `RasterFont.toAwtFont()` extension for `setFont` call sites, `charWidth` summation replaces `FontMetrics.stringWidth`).

The two proven seam shapes:
- **Value seam** — replace a small platform value type with a plain commonMain class/primitive (Rect, packed-int colors).
- **Service-interface seam** — interface in commonMain, JVM impl wraps existing AWT/JNI code, inject at call sites (GlyphRasterizer).
- **expect/actual typealias** — when JVM behaviour must stay byte-identical (IOException).

Rule of thumb: a type is a *clean leaf seam* only if its values don't flow straight into a platform sink (`java.awt.Graphics`, `Component`, `Canvas`, a JNI call). Anything that does needs the big `GameSurface`/`InputSource`/`GlApi` interfaces and is **not** a quick win.

---

## Tier 1 — clean mechanical leaves (do next)

### EOFException — 5 files ✅ DONE (commit 4fb1fa6)
`Class137, Class202, Class234, Class374, Class376, Class78`. Pure `throw EOFException()` / `catch (e: EOFException)`. Identical treatment to IOException: `expect open class EOFException : IOException` in commonMain, `actual typealias EOFException = java.io.EOFException` in jvmMain, drop imports. **Effort: ~20 min. Risk: low.** Natural follow-on to the IOException seam (it already subclasses IOException on JVM).

### java.lang.ref.SoftReference — 2 files ✅ DONE (commit af03a2b)
`Class348_Sub42_Sub8_Sub1, Class348_Sub42_Sub9_Sub2`. Trivial wrapper: holds an object, `.get()` may return null. Define `expect class SoftRef<T>(value: T) { fun get(): T? }`; JVM actual wraps `java.lang.ref.SoftReference`; native/web can degrade to a strong ref initially. **Effort: ~20 min. Risk: low.** Both files just store/get one reference.

### Locale.getDefault() — ✅ DONE (commit 98dcd3e)
All 29 `.lowercase(Locale.getDefault())` sites across 10 files (Applet_Sub1, Class272_Sub2, Class279_Sub1, Class297, Class348_Sub24, Class348_Sub4, Class348_Sub49_Sub1, Class377, Class66, ha_Sub2) → bare `.lowercase()` (Locale.ROOT). All were technical-token normalization (OS/GL vendor strings, system properties, host/extension matching, chat-token filtering) — none user-facing. Bonus: removes the Turkish-I hazard where `Locale.getDefault()` could break the "microsoft"/"sun"/etc. substring checks. `import java.util.*` wildcards stay (still used for Vector/Hashtable). No `Locale` reference remains anywhere in src/.

---

## Tier 2 — small service interfaces (real but contained)

### java.util.Date / Calendar / GregorianCalendar / TimeZone — ✅ DONE (commit 820b991)
Done as a **wrapper expect/actual** (`CalendarShim`), NOT kotlinx-datetime — kept the JVM byte-identical and avoided wiring the first commonMain dependency for a Tier-2 step. `expect class CalendarShim` (commonMain/CalendarShim.kt) exposes only the used surface: `clear()`, `set(field,v)`, `set(y,mo,d)`, `setTimeMillis(Long)` (was `setTime(Date(m))`), `get(field): Int`, `getTimeMillis(): Long` (was `getTime().getTime()`), companion field consts (YEAR=1, MONTH=2 0-based, DAY_OF_MONTH=5, DAY_OF_WEEK=7 1-based Sun=1, HOUR_OF_DAY=11, MINUTE=12, SECOND=13) and factories `gmt()` / `local()`. JVM actual (CalendarShim.jvm.kt) delegates straight to `java.util.Calendar`: `gmt()`→`Calendar.getInstance(TimeZone.getTimeZone("GMT"))`, `local()`→`Calendar.getInstance()` (Class66 used that; Client used `GregorianCalendar()` but only reads h/m/s so the calendar-system choice is moot there). Call sites kept the raw field ints (1,2,5,7,11,12,13) → zero behaviour change. Swapped Class286_Sub3 (shared GMT field), Applet_Sub1, Class348_Sub42_Sub16_Sub1, Class66, Client. No Calendar/Date/TimeZone left in src. **Off-JVM still needs a real pure-Kotlin actual** reproducing java.util.Calendar's proleptic-Gregorian field math — deferred to the relevant platform phase.

### java.io streams — InputStream/OutputStream/DataInputStream — ~11 files
`OutputStream_Sub1/2, Class202, Class272*, Class248, ...`. Overlaps with the eventual `CacheStorage`/`GameConnection` work. Could seam behind common byte-stream abstractions (or kotlinx-io). **Effort: 2–3 days. Risk: medium.** Better done *as part of* the CacheStorage/connection interfaces than standalone.

---

## Tier 3 — the big §4 service interfaces (each is a mini-project)

These are the heavy structural seams from the migration plan. Not leaf swaps; each touches hub classes.

- **GameSurface** ← `java.awt.Canvas` (27) / `Frame` (9) / `Container` (6) / `Graphics` (4) / `Image` (3) / `image.*` (BufferedImage, PixelGrabber, DirectColorModel…). The largest cluster. Unblocks moving `ha_Sub1` (software renderer) to common.
- **InputSource** ← `java.awt.event.*` (Key/Mouse/Focus/Window listeners+events) + `Component` (20). The client already queues events — adapt, don't redesign.
- **GameConnection** ← `java.net.Socket` (9) / `InetAddress` (2). JVM keeps NIO; web needs WebSocket→TCP proxy.
- **HttpFetch** ← `java.net.URL` remaining in `GameApplet`/`Applet_Sub1`/`Loader`/`Client`/`Class297`/`Class348_Sub16_Sub3`/`Class88` for `showDocument(URL, target)` calls. These are `SystemServices` territory — deferred to that seam. `Class297.method2237` now takes `String?` (URL object dropped); `Class339`/`Class156` call sites updated.
- **CacheStorage** ← `java.io.File` (13) / `RandomAccessFile` (2) — Class201/Class234/Class297.
- **AudioSink** ← `javax.sound.sampled` (1, Class279_Sub1). The synth itself is already portable.
- **SystemServices** ← `java.awt.datatransfer.*` (clipboard, 5), `Toolkit/Robot/GraphicsEnvironment/DisplayMode` (browser/AWT integration). Mostly stubs off-JVM.
- **GlApi** ← `jaggl.OpenGL` JNI. Only when the HW renderer is ported (Phase 6).

---

## Do NOT seam (JVM-only forever / dead code)

- **Reflection anti-cheat** — `Class228`, `Class348_Sub40_Sub1` (`java.lang.{Byte,Double,Float,Long,Short}.TYPE`, `Class.forName`, `Field/Method/Constructor`, `ClassLoader.nativeLibraries`), `Client.kt` reflection block (`java.lang.Long.toHexString`, `getClassLoader() as Vector`). Server-driven; stub to "unsupported" on other targets. The `Hashtable` fields on `Player`/`Class275` are consumed here via `.keys()/Enumeration` — must stay Hashtable (see Phase 2 notes).
- **com.ms.* / WComponentPeer.java** — dead Microsoft-JVM-era code; delete, don't migrate.
- **jagtheora** video — recommend dropping.

---

## Suggested order

1. EOFException (Tier 1) — finishes the I/O-exception family.
2. SoftReference (Tier 1) — trivial, removes `java.lang.ref`.
3. Locale audit (Tier 1) — mop up the rest of the casing work.
4. Date/Calendar shim (Tier 2) — the last self-contained `java.util` cluster.
5. Then commit to one Tier-3 interface — **GameSurface first**, since it unblocks the `ha_Sub1` move (the plan's key Phase 3 goal).
