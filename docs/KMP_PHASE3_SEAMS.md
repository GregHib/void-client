# Phase 3 — Remaining Seam Backlog

Snapshot of platform dependencies still in `jvmMain`, ranked as candidate seams. Counts are *files importing the type*. Done so far this phase: `Rect` (java.awt.Rectangle), loading-bar `Color[]`→`IntArray`, `GlyphRasterizer` (NativeFontRasterizer over Class323), `IOException` (expect/actual typealias).

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

### Locale.getDefault() — but already mostly handled
29 hits are all `Locale.getDefault()` feeding `.lowercase()/.uppercase()`. Phase 2 already converted the locale-invariant cases to bare `.lowercase()`. Audit the remaining `Locale.getDefault()` call sites; any that are locale-invariant string-casing → drop the Locale arg (multiplatform). **Effort: ~30 min. Risk: low** (verify none are genuinely locale-sensitive, e.g. user-facing formatting).

---

## Tier 2 — small service interfaces (real but contained)

### java.util.Date / Calendar / GregorianCalendar / TimeZone — ~5 files
`Class286_Sub3 (shared GMT calendar field), Applet_Sub1, Class348_Sub42_Sub16_Sub1, Class66 (heavy mutation), Client (GregorianCalendar)`. Deferred from Phase 2. Needs kotlinx-datetime + a small Calendar-compat shim (0-based month, 1=Sunday day-of-week, GMT, `clear/set/setTime/get(field)`, `getTime().getTime()/86400000`). **Effort: 1–2 days. Risk: medium** (date math is easy to get subtly wrong; these are JVM hub files so they won't *move*, but the API becomes portable).

### java.io streams — InputStream/OutputStream/DataInputStream — ~11 files
`OutputStream_Sub1/2, Class202, Class272*, Class248, ...`. Overlaps with the eventual `CacheStorage`/`GameConnection` work. Could seam behind common byte-stream abstractions (or kotlinx-io). **Effort: 2–3 days. Risk: medium.** Better done *as part of* the CacheStorage/connection interfaces than standalone.

---

## Tier 3 — the big §4 service interfaces (each is a mini-project)

These are the heavy structural seams from the migration plan. Not leaf swaps; each touches hub classes.

- **GameSurface** ← `java.awt.Canvas` (27) / `Frame` (9) / `Container` (6) / `Graphics` (4) / `Image` (3) / `image.*` (BufferedImage, PixelGrabber, DirectColorModel…). The largest cluster. Unblocks moving `ha_Sub1` (software renderer) to common.
- **InputSource** ← `java.awt.event.*` (Key/Mouse/Focus/Window listeners+events) + `Component` (20). The client already queues events — adapt, don't redesign.
- **GameConnection** ← `java.net.Socket` (9) / `InetAddress` (2). JVM keeps NIO; web needs WebSocket→TCP proxy.
- **HttpFetch** ← `java.net.URL` (9) / `MalformedURLException`. JS5-over-HTTP, world list.
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
