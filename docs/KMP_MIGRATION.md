# Kotlin Multiplatform Migration — Analysis & Plan

**Scope:** Migrate the void-client (deobfuscated RS 634, 2010-12-14) from Kotlin/JVM to Kotlin Multiplatform.
**Targets:** Web (Kotlin/Wasm + JS fallback) and Desktop Native (linuxX64, mingwX64, macosX64/macosArm64), with the existing Desktop JVM build kept working throughout as the reference implementation.
**Rendering strategy:** Keep the existing JNI backends on JVM; modern GL (WebGL2) on web; cinterop GL on native.

---

## 1. Codebase inventory

| Metric | Value |
|---|---|
| Source files | 830 `.kt`, 1 `.java` (`com/ms/awt/WComponentPeer.java`) |
| Lines of code | ~176,000 |
| Build | Single-module Kotlin/JVM, Kotlin 2.2.20, JVM toolchain 24, fat-jar `Loader` main class |
| Naming state | Partially deobfuscated: `Client`, `Player`, `Npc`, `Loader`, `GameApplet` named; ~700 files still `ClassNNN[_SubN]` / single-letter (`ha`, `aa`, `s`, …) |

### Architecture (as it exists)

- **`Loader`** — JFrame/Panel bootstrap replacing the browser applet; sets fake applet params, starts the client.
- **`Applet_Sub1` / `GameApplet` / `Client`** — game shell: main loop, login, packet handling, world rendering orchestration (Client.kt ~2,700 lines).
- **`ha`** — the abstract graphics toolkit (Jagex "Toolkit" pattern). Concrete implementations:
  - `ha_Sub1` (~2,400 lines) — **pure software renderer** (CPU rasterizer, no GL/D3D imports).
  - `ha_Sub2` (~4,100 lines) — **OpenGL renderer** via `jaggl` JNI bindings (fixed-function GL 1.x: `glBegin/glEnd`, matrix stack, display lists).
  - `ha_Sub3` (~3,000 lines, abstract) + `Class377`, `Class378` — hardware toolkits; `Class378` is the **Direct3D9** path via `jagdx`.
- **`Class297`** — the "signlink" equivalent: a privileged-I/O thread handling cache files, sockets, DNS, clipboard, browser interop.
- **`Class201` / `Class234`** — disk cache store (`RandomAccessFile` over `.jagex_cache_32` / `.file_store_32`, hardcoded `c:/rscache/`-style search paths).
- **`jaclib`, `jaggl`, `jagdx`, `jagtheora`, `jagex3`, `jagmisc`, `com.ms.*`** — JNI binding layers (see §2).

### Code-style obstacles (independent of platform APIs)

These affect migration cost more than any single API does:

- Pervasive **mutable global state**: most state lives in `@JvmField` companion/object fields, mutated from anywhere (e.g. 24 files import `Class348_Sub17.Companion.method2929`).
- **Cross-class spaghetti imports** of companion methods — no module boundaries exist; everything can touch everything.
- Obfuscated names make seam-finding slow; renaming is a prerequisite for safely splitting source sets.
- `@JvmField`/`@JvmStatic`/`@Volatile` are fine in common code (they're optional-expectation annotations, ignored off-JVM) — low friction there.

---

## 2. Platform-dependency inventory

Everything below must end up in `jvmMain`, behind an interface, or be deleted.

| Dependency | Footprint | What it does | Migration path |
|---|---|---|---|
| `java.awt.*` | **74 files** (Canvas in 27, Component in 21, Frame in 9, Rectangle, Color, events) | Window, canvas, input events, fonts (`Font`/`FontMetrics` in 4 files: Class199, Class294, Class323, Class351), images (`BufferedImage`/`PixelGrabber` in ~8 files), clipboard | `GameSurface` + `InputSource` + `NativeFont` interfaces. JVM impl wraps AWT; web impl wraps `<canvas>` + DOM events; native impl wraps GLFW |
| JNI `external fun` | **432 functions** across `jaggl` (OpenGL), `jagdx` (D3D9), `jaclib.memory`/`jaclib.peer` (native buffers, COM peers), `jagtheora` (Ogg/Theora/Vorbis video), `jagex3.jagmisc` (µs timer), `jagex3.graphics2.hw`, `com.ms.*` (legacy MS JVM) | Hardware rendering, native memory, cutscene video, precise timing | Stays in `jvmMain` untouched. Web/native get new backends (§4). `com.ms.*` + `WComponentPeer.java` are dead Microsoft-JVM-era code — delete |
| `java.net.Socket` / `URL` | 9 files sockets (Class202, Class272[_Sub1], Class297, Client, …), 10 files URL | Game-server TCP (430/443/proxy fallback), JS5 content fetch, web requests | `GameConnection` interface. JVM: keep. Native: ktor-network or POSIX. **Web: browsers cannot open TCP — requires a WebSocket→TCP proxy server** (new infrastructure) |
| `java.io.File` / `RandomAccessFile` | 13 / 2 files (Class201, Class234, Class297, Class348_Sub24) | Disk cache, preferences file, native-lib extraction (Class348_Sub6 `System.load`) | `CacheStorage` interface. JVM: keep. Native: kotlinx-io/POSIX. Web: OPFS (Origin Private File System) or IndexedDB |
| `java.lang.Thread` | 13 files (decoder thread, audio thread, signlink, GL worker `oa`, `s_Sub1`, Class169, Class208, …) | Worker threads + busy-wait loops | Coroutines or `expect` thread shim on native. **Web is single-threaded** — main loop must become cooperative (`requestAnimationFrame`); Wasm threads not assumed |
| `javax.sound.sampled` | 1 file (Class279_Sub1, `SourceDataLine`) | PCM audio sink for the (pure-Kotlin) synth engine | `AudioSink` interface: JVM keep; web = WebAudio `AudioWorklet`; native = OpenAL/miniaudio cinterop. The synthesizer itself is portable code |
| `java.math.BigInteger` | 10 files | RSA for login block, JAR/update verification | [ionspin kotlin-multiplatform-bignum](https://github.com/ionspin/kotlin-multiplatform-bignum) or a small fixed-size Montgomery RSA in common code |
| `java.util.zip` | 2 files (Class152: `Inflater`, Class287: `CRC32`) | Cache container decompression + integrity checks | Pure-Kotlin inflate + CRC32 (korlibs-compression or small port; both are well-understood algorithms). Web alternative: `DecompressionStream` |
| `java.util.*` (Hashtable, Vector, Calendar, Random…) | 37 files | Collections, time | Mechanical replacement: kotlin collections, kotlinx-datetime, kotlin.random |
| Reflection | 1 file (Class348_Sub40_Sub1 `Class.forName`) | Server-driven reflection anti-cheat checks | JVM-only; stub to "unsupported" reply on other targets |
| Clipboard / `showDocument` / browser params | ~9 files | Applet-era browser integration | `SystemServices` interface; mostly trivially stubbed |
| `jagtheora` video | 1 JNI package + decoder plumbing | Login-screen / cutscene video | **Recommend dropping** from common scope; web could use `<video>` if ever needed |

---

## 3. Target feasibility

### Desktop JVM (kept, reference)
No change. Remains the oracle for regression testing. All JNI backends (`jaggl`, `jagdx`, `jaclib`) live on here.

### Web — wasmJs (+ js fallback)
- **Toolchain:** Kotlin/Wasm is Beta as of Kotlin 2.2.20 and remains Beta through Kotlin 2.4.0 (June 2026); WasmGC runs in all major browsers since Dec 2024. Sharing source between `wasmJs` and `js` targets is well-supported; recommend building both (`webMain` shared source set) and treating `js` as the compatibility fallback.
- **Rendering:** WebGL2. **Critical caveat:** `ha_Sub2` is fixed-function GL 1.x; WebGL has no fixed-function pipeline. Options: (a) ship the **software renderer (`ha_Sub1`) first** — it's pure code, needs only a `putPixels(IntArray)` blit to a canvas; (b) then write a WebGL2 backend either as a new `ha` toolkit or as a fixed-function emulation layer (matrix stack + immediate-mode batching + shader pair) under the existing GL call surface. (a) is dramatically cheaper and de-risks everything else.
- **Networking:** No raw TCP in browsers. Requires a **WebSocket→TCP proxy** (~100 lines of Ktor/Netty server) or a server that speaks the game protocol over WebSocket natively. Frame the abstraction as message/byte-stream, not Socket.
- **Storage:** Cache (~hundreds of MB potential) → OPFS via `navigator.storage.getDirectory()`; IndexedDB fallback.
- **Threading:** none. The client's busy-wait main loop and worker threads must become coroutine-based with `requestAnimationFrame` driving the frame callback. This is the single largest *structural* change the web target forces, and it benefits every target.
- **Audio:** WebAudio AudioWorklet fed by the portable synth.

### Desktop Native (linuxX64, mingwX64, macosX64/Arm64)
- **Rendering:** GLFW + OpenGL via cinterop (or SDL2). Same GL-surface abstraction as web; a desktop GL 2.1/3.3 backend can share most of the WebGL2 backend's design.
- **Networking:** ktor-network (TCP supported on native) or direct POSIX sockets.
- **Storage/threads:** kotlinx-io + `kotlin.concurrent`/coroutines; native has real threads.
- **Risk:** Kotlin/Native compile times and debugging ergonomics on a 176k-LOC codebase; macOS requires GL-deprecation acceptance (GL 2.1 still works) or ANGLE/Metal later.

---

## 4. Target architecture

```
void-client/
├── core/                      # KMP module — the goal: ~80% of code here
│   └── src/
│       ├── commonMain/        # game logic, protocol, cache format, config decoding,
│       │                      # software renderer, synth, collision/path, interfaces
│       ├── jvmMain/           # AWT surface, JNI toolkits (jaggl/jagdx/jaclib), java.net,
│       │                      # RandomAccessFile cache, javax.sound
│       ├── webMain/           # shared js+wasmJs: canvas surface, WebGL2, WebSocket,
│       │   ├── jsMain/        #   OPFS cache, WebAudio
│       │   └── wasmJsMain/
│       └── nativeMain/        # GLFW surface, cinterop GL, POSIX/ktor sockets, kotlinx-io
│           ├── linuxMain/ mingwMain/ macosMain/
├── app-jvm/                   # Loader (JFrame), packaging — current behaviour
├── app-web/                   # index.html, JS bootstrap, OPFS init
├── app-native/                # per-OS executables
└── proxy/                     # WebSocket→TCP proxy (Ktor, JVM) for the web target
```

### Platform service interfaces (the seams)

Prefer plain interfaces injected at startup over `expect/actual` for the large seams (testable, mockable); reserve `expect/actual` for tiny leaf functions (time, nanoTime, gc hints).

| Interface | Replaces | Notes |
|---|---|---|
| `GameSurface` | `java.awt.Canvas/Frame` | create/resize, `blit(IntArray)`, fullscreen, cursor |
| `InputSource` | AWT event listeners | key/mouse/focus event queue (the client already queues events — adapt, don't redesign) |
| `GlApi` | `jaggl.OpenGL` (static externals) | Only needed when the HW path is ported; JVM actual delegates to existing JNI object |
| `GameConnection` | `java.net.Socket` | suspend read/write of ByteArrays; impls: NIO socket, WebSocket, POSIX |
| `HttpFetch` | `java.net.URL` | JS5-over-HTTP fallback, world list |
| `CacheStorage` | `File`/`RandomAccessFile` (Class201/Class234) | open/read/write/length on named stores |
| `AudioSink` | `javax.sound.sampled` (Class279_Sub1) | `write(pcm: ShortArray)`, latency query |
| `NativeFontRasterizer` | `java.awt.Font` (Class199/294/323/351) | rasterize glyphs to IntArray; web = canvas2d measure/draw, native = stb_truetype |
| `SystemServices` | clipboard, `showDocument`, `user.home` | mostly stubs off-JVM |
| `Clock` | `System.currentTimeMillis`, `jagmisc.nanoTime` | expect/actual is fine here |

### Rendering decision (per chosen strategy)

- `ha_Sub1` (software) → **commonMain**, becomes the first renderer on every new target. Only dependency to remove: its AWT image/Canvas touchpoints (move presentation behind `GameSurface`).
- `ha_Sub2` (jaggl GL) → stays **jvmMain** as-is.
- `ha_Sub3`/`Class377`/`Class378` (D3D9 etc.) → stays **jvmMain**, candidate for deletion later.
- New `ha` subclass `HaWebGl` in `webMain` (and `HaGl33` in `nativeMain`) written against `GlApi`, implemented after the software renderer ships.
- `jaclib.memory` native buffers (used by HW toolkits, 16+ files) → only needed by JVM HW paths; common code uses `ByteArray`.

---

## 5. Phased plan

Each phase keeps the JVM desktop build green and shippable. Do not branch long-lived; migrate in-place.

### Phase 0 — Safety net & build conversion (1–2 weeks)
1. Convert build to `kotlin("multiplatform")` with only `jvm()` — zero source moves; everything in `jvmMain`. Verify fat jar still runs and connects.
2. Pin a regression harness: deterministic boot to login screen + screenshot diff of the software renderer; cache-decode unit tests against known archives; record/replay of a JS5 handshake.
3. CI for all future targets.

### Phase 1 — Completed

### Phase 2 — Common-ready core (4–8 weeks)
1. Bottom-up extraction to `commonMain`: byte buffers/packets, cache container codec (inflate + CRC32 via MP library), JS5 protocol state machine, config/definition decoders, collision map, pathfinding, model/animation math, the audio synth.
2. Replace `java.util.*` (37 files), `BigInteger` (10 files), `Inflater` (2 files) in extracted code.
3. Each extraction must not break the JVM run.

### Phase 3 — Service seams (3–5 weeks) — **~85% complete (as of 2026-06-12)**

Original objectives:
1. Define the §4 interfaces; implement JVM versions by *wrapping existing code* (signlink `Class297` becomes the JVM impl of `CacheStorage` + `SystemServices` + `GameConnection` factory).
2. Restructure the main loop: replace `Thread.sleep` busy-wait with a `GameLoop` driven externally (JVM: timer thread; web: `requestAnimationFrame`). Convert the decoder/audio worker threads to coroutines with a JVM dispatcher; design so web can run them on the main loop.
3. Move `ha_Sub1` software renderer to common behind `GameSurface`.

#### Status — what is DONE

All service seams are defined in `commonMain` and have JVM actuals that wrap the existing code, with the JVM build staying green throughout (`compileKotlinJvm` clean as of 2026-06-12):

| Seam | commonMain | JVM actual | Notes |
|---|---|---|---|
| Clock | `Clock.kt` (`clockMillis`/`clockNanos`) | expect/actual | replaces `System.currentTimeMillis`/`nanoTime` |
| Locking | `Locking.kt` (`withLock` inline) | expect/actual | replaced **all** `synchronized` blocks (0 left in jvmMain) |
| Thread identity | `CurrentThread.kt` (`currentThread(): Any`) | expect/actual | — |
| Sleep | `Sleeper.kt` (`Sleepers.sleep`) | `ThreadSleeper` | the single `Thread.sleep` site (Class327) routes here |
| Workers | `WorkerFactory.kt` | `ThreadWorkerFactory` | daemon worker spawns funnel through `Workers.start` |
| Frame loop | `GameLoop.kt` (`GameFrame.runFrame`) | blocking driver | `Applet_Sub1` frame body extracted to `runFrame()` |
| Cache | `CacheStore.kt` + `CacheStorageFactory.kt` | `FileCacheStorage` (+ `Class234Statics`) | Class234/Class201 folded in; `RandomAccessFile` in 1 file |
| Audio | `AudioSink.kt` | `JavaSoundAudioSink` (Class279_Sub1 adapter) | synth engine (Class279) stays jvm (too coupled) |
| Clipboard | `SystemClipboard.kt` | `AwtClipboard` | — |
| HTTP | `HttpFetch.kt` | `JvmHttpFetch` | wraps `URL.openStream`; `java.net.URL` in 2 files |
| Connection | `Class238.kt` (abstract base) | Class238_Sub1/Class272/Class297 | **JS5 (Class202) ported off raw Socket** onto Class238; `java.net.Socket` now in 6 JVM plumbing files; commonMain net-clean |
| System props | `SystemProperties.kt` | expect/actual | — |
| Inflate / CRC32 / BigInt / Random / Calendar | `Inflate.kt`/`Crc32.kt`/`BigInt.kt`/`JavaRandom.kt`/`CalendarShim.kt` | pure / shim | `java.util.zip` = 0 files, `java.math.BigInteger` = 0 files |
| **Surface** | `GameSurface.kt` (`GameSurface`/`DisplayTarget`/`GameSurfaceFactory`) | `AwtGameSurfaceFactory` + `AwtDisplayTarget` (wrap `Class348_Sub31`) | **interface complete and `ha_Sub1` already consumes it** |
| Font raster | `GlyphRasterizer.kt` (`GlyphRasterizer`/`RasterFont`) | `AwtGlyphRasterizer` | Class323/351 bitmap-font path seamed |

Decisive structural result: **`ha_Sub1` (software renderer, ~2,400 LOC) has been fully rewritten against the seams** — it takes a `GameSurfaceFactory`, holds `GameSurface`/`DisplayTarget`, reads `.pixels`/`.width`/`.height` through the interface, and now has **zero `java.awt`/`javax` imports**. The abstract base `ha.kt` (328 LOC, 110 abstract members) is likewise **import-clean** with no AWT/JNI references. The jvm-only companion has already been split out to `haStatics`.

`commonMain` now holds **73 files**; `jvmMain` **813**. Remaining AWT footprint in jvmMain: 65 files (down from the §2 baseline of 74), concentrated in the genuinely platform-bound classes (Loader/GameApplet window shell, ha_Sub2/3 GL/D3D toolkits, the AWT input listeners, the legacy ImageProducer/Color font path).

#### Status — Phase 3 completed

### Phase 4 — Web target (4–8 weeks)
1. Add `js()` + `wasmJs()` targets, `webMain` shared source set, `app-web` bootstrap (canvas, input bindings, OPFS `CacheStorage`, WebAudio `AudioSink`).
2. Build the `proxy/` WebSocket→TCP bridge; `GameConnection` web impl over WebSocket.
3. Milestone: **login screen via software renderer in browser**; then world login, then playability pass (perf: software renderer at 765×503 is fine even in Wasm; profile before optimizing).
4. Optional within phase: WebGL2 `ha` backend if software perf or visuals demand it.

### Phase 5 — Desktop native (3–6 weeks)
1. `linuxX64` first (best K/N tooling), then `mingwX64`, then macOS.
2. GLFW cinterop window/input; reuse the common software renderer (blit via GL textured quad); kotlinx-io cache; ktor/POSIX sockets; miniaudio or OpenAL sink.
3. Decide whether native ever gets the GL renderer or stays software (the 2010 software renderer is cheap on 2026 CPUs).

### Phase 6 — Hardware GL backends + cleanup (optional, open-ended)
1. Shared `GlApi` design; WebGL2 + GL 3.3 backends with a small fixed-function emulation (matrix stack, immediate-mode batcher, single shader pair) — or a fresh renderer written against the `ha` contract.
2. Retire `jagdx`/D3D9 and decide the fate of `jaggl` on JVM.

**Total: roughly 4–8 months of focused solo work to a playable web build (Phases 0–4); native adds 1–2 months.** Phase 6 is unbounded and optional.

---

## 6. Risks & open questions

| Risk | Severity | Mitigation |
|---|---|---|
| Global-mutable-state refactor breaks subtle behaviour | High | Phase 0 regression harness *before* moving anything; small PRs; JVM stays the oracle |
| Web has no TCP | High (hard blocker) | Proxy is mandatory infra; decide who hosts it; consider JS5-over-HTTP for content to cut proxy traffic |
| Kotlin/Wasm still Beta (as of Kotlin 2.4.0) | Medium | Ship `js` target as fallback from the same `webMain` source set |
| Single-threaded web vs. client's thread assumptions | High | Phase 3 main-loop restructure is done before the web target exists, validated on JVM |
| Fixed-function GL doesn't map to WebGL | Medium | Software renderer first; GL backends deferred to Phase 6 |
| K/N build times & debugging on 176k LOC | Medium | Keep native last; lean on JVM for development loop |
| Cache size vs. browser storage quotas | Low | OPFS quotas are generous; stream JS5 on demand as the live client did |
| RSA/login crypto correctness off-JVM | Low | bignum library + fixture tests against known login blocks |
| `jagtheora` video | Low | Drop it |

**Open questions to resolve before Phase 2:**
1. Is the target server the official protocol (proxy required) or your own server (could speak WebSocket natively — kills the proxy)?
2. Is D3D9 (`jagdx`, `ha_Sub3`) worth keeping on JVM at all, or delete in Phase 1?
3. How much deobfuscation do you want as an end in itself? (It compounds: every renamed class makes the next phase cheaper.)

---

## 7. Library matrix

| Need | Library | Targets |
|---|---|---|
| Coroutines/loop | kotlinx-coroutines | all |
| I/O primitives | kotlinx-io (or okio) | jvm, native, js/wasm (in-memory) |
| BigInteger/RSA | ionspin/kotlin-multiplatform-bignum | all |
| Inflate | korlibs compression (or small port) | all |
| Sockets (native) | ktor-network | jvm, native |
| WebSocket client | ktor-client / browser `WebSocket` | web |
| Date/time | kotlinx-datetime | all |
| Serialization (settings) | kotlinx-serialization | all |
| Window/input (native) | GLFW via cinterop (or SDL2) | native |
| Audio (native) | miniaudio or OpenAL cinterop | native |
| Atomics | kotlinx-atomicfu | all |

References: [Kotlin/Wasm overview](https://kotlinlang.org/docs/wasm-overview.html), [Kotlin 2.4.0 release](https://blog.jetbrains.com/kotlin/2026/06/kotlin-2-4-0-released/), [Ktor client supported platforms](https://ktor.io/docs/client-supported-platforms.html), [Kotlin for Web roadmap](https://blog.jetbrains.com/kotlin/2025/05/present-and-future-kotlin-for-web/).
