# jvmMain Feature & Platform-Boundary Analysis

**Project:** `void-client` (Kotlin Multiplatform 2.2.20, JVM target only at present)
**Scope analysed:** `src/jvmMain/kotlin` — 829 `.kt` files, ~176k LOC. `commonMain` and `webMain` are currently **empty**, so *all* code lives in `jvmMain` today.
**Goal:** group code by feature and define the boundary needed to isolate JVM-specific code for a Kotlin Multiplatform (KMP) port.

> This is a decompiled Jagex (RuneScape) client. Names are obfuscated (`method3625`, `aHa_Sub3_8322`, `hb`, `ue`). Package names are the most reliable signal of intent: `com.ms.directX` / `jagdx` = DirectX, `jaggl` = OpenGL, `jaclib` = native memory + peer lifecycle, `jagtheora` = Theora/Vorbis/Ogg video.

---

## 1. Executive summary

The good news for a KMP port: **the architecture already has most of the seams you need.** This is a client that was designed at the C/JNI era to run three graphics backends and two audio backends behind abstract base classes. The abstraction points already exist:

| Concern | Existing abstract seam | Concrete JVM impls |
|---|---|---|
| Rendering | `Renderer` (abstract, ~417 LOC) + `NativeRenderer` | `SoftwareRenderer`, `OpenGlRenderer`, `GlRenderDevice`, `D3dRenderDevice` |
| Models / tiles / sprites | `AbstractModel`, `TerrainTile`, `Sprite` (abstract) | `SoftwareModel`/`OpenGlModel`/`Direct3dModel`, `SoftwareTerrainTile`/`OpenGlTerrainTile`/`NativeTerrainTile` |
| Framebuffer | `AbstractFrameBufferSurface` | `BufferedImageSurface`, `ProducerImageSurface` |
| Timing | `NanoTimer` / `BufferPositionTracker` | `NanoTimerSystem`, `NanoTimerJagex`, `SystemNanoTimer`, `GameClock` |
| Networking | `SocketFactory` (abstract) | `DirectSocketFactory`, `ProxySocketFactory` |
| Audio | `SoundChannelMixer` / `AudioDeviceController` | `JavaSoundOutput`, `DirectSoundAudioChannel` |

So the boundary work is **less "carve seams into a monolith" and more "lift the existing abstract base classes into `commonMain` and re-home the concrete platform classes"**.

The bad news: a few seams **leak platform types into otherwise-shared code** (AWT `Canvas`/`Component` appears in abstract method signatures; `IDirect3DDevice` / `OpenGL` handles are referenced from the renderer base), and the **irreducibly-native layer is large** — ~450 D3D9 external methods + ~120 OpenGL external methods + the `jaclib` peer/heap lifecycle, none of which has portable logic. That layer must be *rewritten per target*, not ported.

The two hardest boundaries — exactly as you flagged — are **(A) AWT/windowing**, because the game loop and lifecycle are welded to `Applet`/`Panel`/`Runnable`, and **(B) the native renderers**, because they are direct 1:1 JNI bindings with no vendor-neutral layer.

---

## 2. Feature groups (method/member level)

### 2.1 Rendering — the central feature, ~1.5M+ chars across the largest files

**Abstraction (lift to `commonMain`):**

- **`Renderer`** (abstract, 417 LOC) — top-level rendering API. Defines ~70 abstract methods. The *factory seam* is four methods:
  - `method3625(ModelDefinition, …): AbstractModel` — make a backend model
  - `method3648(int, int, IntArray[], …): TerrainTile` — make a terrain tile
  - `method3661(int, int, IntArray[], IntArray[]): Sprite` — make a sprite
  - `method3629(int, int, bool): AbstractModelRenderer` — make a model renderer
  - Plus draw ops (`method3636` sprite blit, `method3628` rectangle) and **`method3707(Rectangle[], …)` which takes AWT `Rectangle` — a leak**.
- **`AbstractModel`** (~28k LOC — the single biggest unit) — geometry, animation, vertex transforms, matrix math. **Pure logic, no platform API.** Prime `commonMain` candidate.
- **`AbstractModelRenderer`** (~102 LOC), **`TerrainTile`** (~80 LOC), **`Sprite`** (~77 LOC) — abstract bases, mostly portable.
- **Backend selection:** `Renderer.method3692(int)` dispatches on an int (from `DisplaySettingsConfig`): `5 → OpenGL (JagGlToolkitFactory)`, `3 → Direct3D (JagDxToolkitFactory)`, `1 → software`, `2 → world-map renderer`. Fallback chain D3D → GL → software, gated by native-library availability checks.

**Concrete backends (re-home per platform):**

- **Software (CPU rasteriser, portable in principle):** `SoftwareRenderer` (117k chars), `SoftwareModel`, `SoftwareTerrainTile` (165k chars), `SoftwareRgbSpriteRenderer` / `SoftwarePalettedSpriteRenderer` / `SoftwareAlphaSpriteRenderer` (~190k chars each), `WorldMapSceneSoftware`. These do int-array rasterisation and only touch AWT at the *final blit* (`Graphics.drawImage`). **No `jaclib`/`jagdx`/`jaggl` imports** — this backend is the easiest to make multiplatform (rasterise to an `IntArray`, hand to a platform present-surface).
- **OpenGL:** `OpenGlRenderer` (196k chars), `OpenGlModel` (240k chars), `OpenGlTerrainTile`, `GlRenderDevice` (59k chars, extends `NativeRenderer`), the `GlTexture*` family, `GlSpriteRenderer`, `GlVertexBufferArb`, `MapBuffer`. Bind to `jaggl.OpenGL` (~120 `external` methods) + `jaclib.memory`.
- **DirectX:** `Direct3dModel` (228k chars), `NativeTerrainTile`, `D3dRenderDevice` (extends `NativeRenderer`), `D3DBaseTexture`/`D3DTexture2D`/`D3DCubeTexture`/`D3DVolumeTexture`. Bind to `jagdx.*` + `com.ms.directX.*`.
- **Shared GPU base:** `NativeRenderer` (122k chars) holds `NativeInterface` (JNI mesh transforms), `NativeHeap` (off-heap memory) and the per-pass `RenderConfigFactory[]`. It's *common to both GPU backends* but references native handles — it straddles the seam.

**Seam verdict:** The factory pattern is clean. The leaks to fix before lifting `Renderer` to common: AWT `Rectangle`/`Canvas` in signatures, and `NativeRenderer`'s direct references to `OpenGL`/`IDirect3DDevice` handles.

### 2.2 Windowing / lifecycle / input — AWT, the hardest structural boundary

~74 files import `java.awt`; ~45 reference `Applet`; 1 uses Swing.

**Entry & lifecycle (deep coupling):**

- **`Loader`** (167 LOC) — `extends Panel implements GameApplet`. Thin bootstrap: `init()→doApplet()`, `doFrame()` builds a `JFrame`+`JPanel`, `startClient()` news up `Client`. **Shallow — easy to replace.**
- **`GameAppletFrame`** (582 LOC) — `extends Panel implements GameApplet, Runnable, FocusListener, WindowListener`. **This is the deep one.** The entire game loop is `run()` (lines ~289–354): spin until clock expiry, `method84()` frame tick, `method88()` loop mgmt, dispatch render. `paint()`/`update()` are the render gate; `start()/stop()/destroy()` are applet lifecycle; window/focus events mutate game state directly. `method87()` creates a `DelegatingRenderCanvas`, adds it to the AWT hierarchy, wires focus listeners.
- **`Client`** (160k chars) — `extends GameAppletFrame`. Implements `init/start/stop/destroy/run` + focus/window callbacks. Pulls the system clipboard via `getToolkit().getSystemClipboard()` and wraps `Canvas` input via reflection.

**Input (medium coupling — already queue-buffered, which helps):**

- **`AwtKeyboardListener`** (228 LOC) — `KeyListener, FocusListener`; `keyPressed/Released/Typed` (all `@Synchronized`) remap via a lookup array and post `KeyEventNode` into a `NodeDeque`. Game logic reads the deque, not AWT.
- **`MouseInputTracker`** (265 LOC) — `MouseListener, MouseMotionListener`; decodes modifier bits from `MouseEvent.getModifiers()`, posts to a `NodeDeque`.
- **`MouseWheelInputTracker`** (180 LOC) — adds `MouseWheelListener`, consumes the event, posts wheel rotation.
- The **`NodeDeque` event-queue indirection is a gift**: listeners are the only AWT-typed code; everything downstream reads platform-neutral event nodes.

**Drawing surface & system integration:**

- **`DelegatingRenderCanvas`** (123 LOC) — `extends Canvas`, pure paint/update delegator. Clean seam.
- **`BufferedImageSurface`** (38 LOC) / **`ProducerImageSurface`** (~80 LOC) — concrete `AbstractFrameBufferSurface`; `BufferedImage`+`Raster`+`DataBufferInt`, blit via `Graphics.drawImage`, or push pixels via `ImageProducer`/`ImageConsumer`.
- **`FullscreenDisplayController`** (~102 LOC, **deep**) — `GraphicsEnvironment`/`GraphicsDevice`/`DisplayMode`, `setDisplayMode()`, plus a reflection hack on `GraphicsDevice.valid`.
- **`GameDisplayManager`** — canvas sizing from `Container.getSize()` + insets.
- **Clipboard** cached in `BlendTextureNode.aClipboard9357` (single `Toolkit` call — shallow).

**Seam verdict:** Input and framebuffer are shallow/wrappable. The blocker is `GameAppletFrame.run()` — the game loop must be extracted into a platform-neutral `GameLoop` and the applet/window lifecycle hidden behind a `GameWindow` interface.

### 2.3 Native interop (`jaclib`, `jagdx`, `jaggl`, `com.ms.*`) — irreducibly native

This is the **rewrite-per-target** layer. No portable logic; every method is a C binding.

**Peer / object lifecycle (`jaclib.peer`, 8 files):** COM-style ref-counted handles. `PeerReference` stores a 64-bit `peer: Long` (native pointer; **x64-only**), extends `WeakReference`, declares `abstract external releasePeer(Long): Long`. `Peer` is the base wrapper; `IUnknownReference` / `NativeHeapPeerReference` provide native release; `hb` drains a `ReferenceQueue` and dispatches native finalisers via hardcoded "magic" int constants. GC ↔ native heap ↔ COM are deeply intertwined here.

**Native memory (`jaclib.memory`, 6 files):** `NativeBuffer` (raw `get/put` at a `Long` address), `NativeHeap` (`external allocateHeap/allocateBuffer/deallocateBuffer/getBufferAddress` — OS-specific VirtualAlloc/mmap), `NativeHeapBuffer`. Pure JNI shims.

**DirectX (`jagdx`, 26 files, ~450 external methods):** `IDirect3D` (factory + caps), `IDirect3DDevice` (263 LOC, ~40 external methods — the entire D3D9 device vtable: Begin/EndScene, Draw(Indexed)Primitive, SetRenderState, shaders, textures, buffers, surfaces), vertex/index/texture/surface/swapchain wrappers, and struct mirrors (`D3DCAPS`, `D3DPRESENT_PARAMETERS`, `D3DLIGHT`, …). Links `d3d9.dll`. **Windows-only.**

**OpenGL (`jaggl`, 2 files):** `OpenGL.kt` (571 LOC) — context/pbuffer mgmt (`init`, `attachPeer`, `swapBuffers`, `setSwapInterval`) + thread-local `Hashtable<Thread,OpenGL>` + ~120 `external` GL 1.x/ARB/EXT functions (matrix, vertex arrays, textures, lighting, FBOs, ARB VBOs, ARB shaders). `MapBuffer` wraps `glMapBufferARB`.

**MS COM/Win32 (`com.ms.*`):** mostly empty stubs except **`User32`** (48 LOC — `SetWindowLong`, `SetCursor`, `SetCursorPos`, `LoadCursor`, `SendMessage`, `CallWindowProc`; links `user32.dll`) and the `com.ms.directX` `DirectDraw`/`DirectSound` stubs/structs.

**Compute JNI (`jagex3.graphics2.hw.NativeInterface`, 31 LOC):** SIMD mesh transforms — `copyPositions`/`copyNormals`/`copyColours`/`copyTexCoords`/`copyLighting`, plus scene lighting setters. Hot-path, hand-vectorised in native code.

**Video codecs (`jagtheora`, 15 files):** `SimplePeer`-based Theora/Vorbis/Ogg handles (`DecoderContext`, `OggSyncState`, etc.), `external init/clear/decode…`. Assumes a native codec lib.

**Hardware info (`jaclib.hardware_info.HardwareInfo`, 17 LOC):** `external` props for GPU list (DXDiag), CPU flags, GL props, system props.

**Seam verdict:** This whole layer is the `actual` side. For a non-Windows / web target it cannot be "ported" — it must be **re-implemented** against WebGL/WebGPU/Vulkan/Metal and a portable allocator. Budget for it as new code (rough order: ~800–1000 LOC of HAL just to re-cover the surface, more for correctness of the fragile peer-lifetime contract).

### 2.4 Threading — hand-rolled `Thread` + `synchronized`/`wait`/`notify`

**No `java.util.concurrent` at all.** ~88 files use `synchronized`/`@Synchronized`; the worker pattern is consistent: a class `implements Runnable`, holds a `Thread`, and uses `(x as Object).wait()/notify()` on a `NodeDeque`/lock.

Workers: `BackgroundWorkerThread`, `HostPingThread`, `MapRegionLoaderThread`, `ResourceLoaderThread`, `SceneLoaderThread`, `ScriptCompilerThread`, `SocketStreamWorker`, `BufferedOutputStreamWorker`, `PrivilegedOperationWorker`. Each: `start()` spins a thread; `run()` loops on a guarded queue; producers `notify()`.

**Seam verdict:** `Thread`, `Runnable`, `synchronized`, `Object.wait/notify` are all JVM-only. KMP has `kotlinx.coroutines` + `kotlin.concurrent` atomics, but the `wait/notify`-on-monitor idiom has no common equivalent — these workers need re-expression as coroutine/channel patterns (the `NodeDeque` hand-off maps naturally to a `Channel`). Medium effort, mechanical but pervasive.

### 2.5 Clocks / timing

`GameClock.method599` → `System.currentTimeMillis()`. `NanoTimerSystem`/`SystemNanoTimer` → `System.nanoTime()`. `NanoTimerJagex` → `jagex3.jagmisc.jagmisc.nanoTime` (native). All sit behind abstract `NanoTimer`/`BufferPositionTracker`. Only ~5 files touch a raw time source, and `Thread.sleep` appears once.

**Seam verdict:** Trivial. `expect fun nowMillis()/nowNanos()` (or `kotlin.time.TimeSource`) drops straight in behind the existing `NanoTimer` abstraction.

### 2.6 File access (`java.io`)

~23 files. `RandomAccessFileOnDisk` wraps `RandomAccessFile` (`read/seek/write/close`); `FileStoreLocator` opens cache files `"rw"`; `BufferedRandomAccessFile`, `BufferedFileReader`, `FileIoUtil`, `ConfigArchiveLoader`, `ItemDefinitionLoader`, `NativeLibraryUnloader`. `PrivilegedOperationWorker` centralises privileged file+socket ops (wraps several `RandomAccessFileOnDisk`).

**Seam verdict:** Already concentrated behind a few wrapper classes. `RandomAccessFileOnDisk` / `FileStoreLocator` are the natural `expect`/`actual` boundary (web has no random-access disk → IndexedDB/OPFS backing). Medium effort but well-contained.

### 2.7 Networking (`java.net`)

`SocketFactory` (abstract, `method2050(): Socket?`) with `DirectSocketFactory` (10 LOC, direct `Socket`) and `ProxySocketFactory` (131 LOC, SOCKS/HTTP proxy via `java.net.Proxy`). `SocketGameConnection`, `SocketStreamWorker`, `HostPingThread` consume the factory; `PrivilegedOperationWorker` builds `Socket(InetAddress.getByName(...))`.

**Seam verdict:** **Already a clean factory seam.** Lift `SocketFactory` to common as an `expect`/interface; provide `actual` socket impls (JVM `Socket`, web `WebSocket`). The return type `java.net.Socket` is the only leak to abstract (wrap in a `Connection` interface exposing read/write streams).

### 2.8 Audio

`SoundChannelMixer` / `AudioDeviceController` abstract bases with `JavaSoundOutput` (`javax.sound.sampled` `SourceDataLine`) and `DirectSoundAudioChannel` (`com.ms.directX.DirectSound`). `MidiSequencePlayer` (54k chars), `SampledVoice`, `VorbisOggDecoder`/`NullOggStream` feed the mixer.

**Seam verdict:** Same story as rendering/net — abstract base already present, two platform impls. Lift the base; re-home `JavaSoundOutput`/`DirectSoundAudioChannel`; add a web (WebAudio) actual.

### 2.9 Reflection & privileged ops

~7 files use `java.lang.reflect` / `Class.forName`: `FullscreenDisplayController` (the `GraphicsDevice.valid` hack), `NativeLibraryUnloader`, `PrivilegedOperationWorker`, `DisplaySettingsConfig`, `NativeCursorCallback`, plus a few config loaders. Tied to applet-era `AccessController`/privilege and native-lib (un)loading.

**Seam verdict:** Small, but every use is platform-specific (display hacks, native lib lifecycle, security manager). Treat as JVM-only glue to be deleted/replaced, not ported.

---

## 3. The isolation boundary — what goes where

### `commonMain` (platform-agnostic, the prize)
- `AbstractModel` (~28k LOC of geometry/animation), `AbstractModelRenderer`, model definition loading/caching, camera & projection transforms, scene graph, collision/heightmap math.
- The **abstract contracts**: `Renderer`, `TerrainTile`, `Sprite`, `AbstractFrameBufferSurface`, `NanoTimer`, `SocketFactory`, `SoundChannelMixer`/`AudioDeviceController` — **once their platform-type leaks are removed** (see §4).
- Game-logic data: definitions (`NpcType`, `ModelDefinition`, configs), the `NodeDeque` event/queue infrastructure, protocol/packet handling.
- The software rasteriser's *math* (rasterise into an `IntArray`), keeping only the final present off in platform code.

### `jvmMain` (`actual` / platform impls — stays)
- AWT lifecycle: `Loader`, `GameAppletFrame`, `Client` window glue, `DelegatingRenderCanvas`, `BufferedImageSurface`, `FullscreenDisplayController`, `GameDisplayManager`.
- AWT input listeners: `AwtKeyboardListener`, `MouseInputTracker`, `MouseWheelInputTracker`.
- Native renderers: `GlRenderDevice`+`jaggl`, `D3dRenderDevice`+`jagdx`+`com.ms.directX`, `NativeRenderer`, `jaclib.*`, `jagex3.graphics2.hw.NativeInterface`, `jagtheora.*`.
- JVM IO/net/audio/timing actuals: `RandomAccessFileOnDisk`, `FileStoreLocator`, `DirectSocketFactory`/`ProxySocketFactory`, `JavaSoundOutput`/`DirectSoundAudioChannel`, `NanoTimerSystem`, the thread workers.

### `webMain` / future targets (`actual` — new code)
- WebGL/WebGPU renderer implementing the `Renderer` contract; OPFS/IndexedDB file backing; WebSocket `Connection`; WebAudio mixer; coroutine-based workers; `Performance.now()` timer.

---

## 4. Leaks to fix before lifting contracts to `commonMain`

These are the specific places where a JVM type appears in code that otherwise belongs in `common`:

1. **AWT in render signatures.** `Renderer.method3707(Rectangle[], …)` and `method3636(…)` carry `java.awt.Rectangle`; framebuffer/canvas plumbing carries `Canvas`/`Component`/`Graphics`. Replace with a neutral `Rect`/`PresentSurface` type.
2. **Native handles on the GPU base.** `NativeRenderer` (intended common-ish base for both GPU backends) references `OpenGL` and `IDirect3DDevice`-shaped state. Push those into the backend subclasses; keep only neutral state on the base.
3. **`java.net.Socket` return type** on `SocketFactory.method2050`. Wrap in a `Connection` interface.
4. **`Component` parameters in audio** (`JavaSoundOutput.method2095(Component?)`, `DirectSoundAudioChannel.method78(…, Component?, …)`) — drop the AWT arg from the abstract contract.
5. **`Object.wait/notify` monitor idiom** across the thread workers — no `common` equivalent; convert the `NodeDeque` hand-offs to `Channel`s.
6. **Reflection/privilege/display hacks** — JVM-only; don't lift, replace.

---

## 5. Difficulty ranking (effort to isolate)

| Rank | Boundary | Why | Strategy |
|---|---|---|---|
| 1 (hardest) | **Native renderers (D3D/GL) + `jaclib`** | ~570 external methods, x64 pointer/peer lifecycle, no vendor-neutral layer | Rewrite per target against WebGL/WebGPU/Vulkan; keep JVM impl as-is behind `Renderer` |
| 2 | **AWT lifecycle / game loop** | `GameAppletFrame.run()` welds the loop to `Applet`/`Runnable`; window events mutate state | Extract `GameLoop`; hide window behind `GameWindow`; keep input listeners as JVM actuals |
| 3 | **Threading** | pervasive `synchronized`/`wait`/`notify`, no `j.u.c.` | Mechanical conversion of `NodeDeque` workers → coroutines/`Channel` |
| 4 | **File access** | random-access disk has no web analogue | `expect` around `RandomAccessFileOnDisk`/`FileStoreLocator` |
| 5 | **Audio** | abstract base exists; two impls | Lift base (drop `Component` arg); add WebAudio actual |
| 6 | **Networking** | clean `SocketFactory` already | Lift factory; wrap `Socket` in `Connection` |
| 7 (easiest) | **Clocks** | one-line time sources behind `NanoTimer` | `expect fun nowNanos()` |

---

## 6. Recommended sequencing for the port

1. **Timing + networking + audio first** — small, already-abstracted, build muscle memory for the `expect`/`actual` workflow.
2. **Pure logic next** — move `AbstractModel` and the geometry/animation/scene math into `commonMain` (no platform deps, huge LOC win, de-risks the build setup).
3. **Fix the contract leaks (§4)** so `Renderer`/`TerrainTile`/`Sprite`/framebuffer can move to common.
4. **Software renderer to common math + platform present** — gives you a working cross-platform path *without* touching JNI.
5. **Extract the game loop** out of `GameAppletFrame` into a neutral `GameLoop`; wrap window/input behind `GameWindow`.
6. **Threading conversion** to coroutines/channels.
7. **Native renderers last** — by now the `Renderer` contract is clean, so each target's GPU backend is additive, not a refactor.

---

*Counts and line numbers are from the obfuscated decompilation and are indicative. The named seams (`Renderer`, `NanoTimer`, `SocketFactory`, `SoundChannelMixer`, `AbstractFrameBufferSurface`) are the load-bearing ones to build the KMP boundary around.*
