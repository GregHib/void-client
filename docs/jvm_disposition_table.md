# jvmMain per-file disposition table

**Generated from source, 2026-06-14.** Every one of the **827 `.kt` files** in `src/jvmMain/kotlin`
is listed below, grouped by the action it needs. Classification is mechanical: import scan for
`java.*`/`javax.*`/`jaggl`/`jagdx`/`jagtheora`/`jaclib`/`jagex3`/`com.ms` and `external` declarations,
plus per-symbol live-usage detection to find the actual touchpoint.

## Totals

| Action | Files | Meaning |
|---|---:|---|
| **MOVE NOW** | 596 | Platform-free already. `git mv` to `commonMain` any time, in any order. |
| **JNI — KEEP jvm** | 136 | Native binding cluster (GL/D3D/video/jaclib). Never moves. |
| **REWIRE** | 56 | One or two platform touchpoints to route through an existing seam, then movable. |
| **DELETE** | 16 | Dead Microsoft-JVM DirectX/DirectDraw code. |
| **KEEP — seam impl** | 15 | The platform-side implementations of the seams. Stay jvm by design. |
| **SPLIT into `*Statics`** | 5 | Companion holds a platform member; split it, common half moves. |
| **UTIL sweep** | 2 | `java.util` collection swap → then movable. |
| **REFLECT stub** | 1 | `expect/actual` anti-cheat stub. |

The migration's *entire* hand-work is the **REWIRE (56) + SPLIT (5) + UTIL (2) + REFLECT (1) = 64
files**, plus deleting 16. Everything else either moves freely (596) or stays put by design (136
JNI + 15 seam impls). Client is not special — once the 64 are seamed it's one of the 596.

---

## ✅ Verification status — 2026-06-15 (compileKotlinJvm green)

Audited every named REWIRE / SPLIT / UTIL / REFLECT / DELETE / KEEP file against current source
(`grep` import+usage scan, confirmed with `compileKotlinJvm`). Legend:
**DONE** = rewired/cleared, platform import gone or dead; **KEEP** = deliberate jvm seam/JNI impl, by
design; **TODO** = real hand-work still remaining.

### Done since the table was generated (12 files)
`Class66`, `Player` (UTIL sweep) · `Class110`, `Class306`, `Class96`, `Class193`, `Class279`,
`Class279_Sub1`, `Class279_Sub2`, `Interface20`, `Class166`, `Class272_Sub1` — no longer name a
platform API. `Class208` and `Class376` are **already moved to `commonMain`** (stream seams landed).
`InputStream_Sub1/Sub2`, `OutputStream_Sub1/Sub2` now implement the `CommonInputStream`/
`CommonOutputStream` seams (the `java.io` base is the deliberate adapter — treat as KEEP/DONE).
`Class158`, `Class239_Sub24`, `Class59`, `Class299_Sub1` carry only a **dead** `java.io` import (drop
the import → ready to move).

### DELETE section — correctly NOT actioned
All 16 `com.ms`/DirectDraw files (incl. `Callback_Sub1`, `Class1`, `Class134`) are **still present**,
as required (deletions deferred). No change.

### Outstanding hand-work before the bulk move (the remaining list)

These still name a platform API in live code and must be seamed/split first:

| File | Remaining touch | Route through |
|---|---|---|
| `Class22` | constructs `Canvas()` → `method958(Canvas)` | `GameSurface`/`DisplayTarget` |
| `Class284` | constructs `Canvas()` → `method958(Canvas)` | `GameSurface`/`DisplayTarget` |
| `Class33` | `Point` as real ctor arg in `method2238` | common point/coord type |
| `Class140` | `Color.black` + `Frame.getInsets/getGraphics` | int-ARGB + `WindowShell` |
| `Class294` | `Color`/`Image` live fields | `GlyphRasterizer` + image seam |
| `Class342` | `Image` field + return type | image seam |
| `Class34` | `Frame` field/insets | `WindowShell` |
| `Class52` | `aFrame4904: Frame?` field | `WindowShell` |
| `Class56` | `Frame` ctor/method param | `WindowShell` |
| `Class318_Sub1_Sub3_Sub4` | `Frame` fullscreen calls | `WindowShell` |
| `Class7` | `DisplayMode`/`GraphicsDevice`/`GraphicsEnvironment`/`Frame` | `WindowShell` fullscreen/display query |
| `Class165` | `Robot`/`Component`/`Point`/`BufferedImage` screenshot | new `WindowShell.capture()` seam |
| `Class348_Sub18` | `Component` passed to `Constructor.newInstance` | `DisplayTarget` + reflect stub |
| `Class348_Sub40_Sub1` | raw `Class.forName` + `*.TYPE` (anti-cheat) | **expect/actual reflect stub — not yet created** |
| `Class348_Sub33` | `Field`/`Method`/`InvocationTargetException` (anti-cheat invoke) | expect/actual reflect stub, or KEEP jvm |
| `Class348_Sub24` | `java.io.File` + `java.util.*`, direct `File()` (591 LOC) | `CacheStore` (full rewire) |
| `Class374` | `FileInputStream`/`DataInputStream` binary reader (`method3610`) | stream/`CacheStore` seam — **note: NOT a dead import as the table guessed; it's a live file reader. Either KEEP as io impl or route through the stream seam** |
| `Class272` | returns `java.net.Socket` from `method2047` | abstract return to `Class238`/`SocketOpener` |
| `Class272_Sub2` | `Socket` + proxy/`java.util.*` world-list HTTP | `SocketOpener` + `HttpFetch` + kotlin text |

### SPLIT into `*Statics` — 4 of 5 NOT yet split
Only `Class262` is split correctly: host `Class262` is in `commonMain` and platform-free; its
`Class262Statics` (still names `Canvas` in `method2000`) correctly stays jvm. **Still TODO:**

| File | State |
|---|---|
| `Class124Statics` | still jvm, no `commonMain` half; host `Class124` still jvm |
| `Class305Statics` | still jvm, no `commonMain` half; host `Class305` still jvm |
| `Class348_Sub5Statics` | still jvm, no `commonMain` half; host `Class348_Sub5` still jvm |
| `Class369_Sub3_Sub1Statics` | `commonMain` half exists, **but** jvm half still names `ActionEvent` and host `Class369_Sub3_Sub1` is still jvm — finish/verify the split |

### Confirmed KEEP (no action — deliberate jvm seam/adapter impls)
`Canvas_Sub1`, `Class346_Sub1`, `Class373_Sub1`, `Class373_Sub2`, `Class348_Sub31`,
`Class348_Sub31_Sub1`, `Class348_Sub31_Sub2` (input/surface adapters behind `InputSource`/
`GameSurface`); `Class238_Sub1` (Class238 socket impl); `Class297` (signlink); `Class228`,
`Class348_Sub6` (native-lib unpack); `Class327` (File use routes via `Class374`/`Sleeper`, verify).
Also the 15 listed seam impls and 136 JNI files — unchanged.

### Net remaining before the one-shot move
≈ **19 REWIRE TODOs + 4 SPLIT TODOs + 2 reflect stubs** (`Class348_Sub40_Sub1`, `Class348_Sub33`
overlap the REWIRE list). Everything else named in this table is either already done or a deliberate
KEEP. After these ~23 files are seamed, re-run the classifier scan; the expectation is that **no
off-allowlist file names a platform API**, and the 596+ movable set (incl. Client) can move in one go.

---

## MOVE NOW — 596 files (no action but the move)

These contain no platform import and no `external`. Their entire dependency surface is either other
`commonMain`-eligible classes or already-built seams. **Move them whenever convenient** — alone,
batched, or left in place; the build stays green either way because nothing in them reaches a bare
platform symbol. This is the bucket Client joins once the 64 below are done.

> Full list omitted here for length (587 entries) — it is every `jvmMain` `.kt` file **not** named in
> any section below. Generate the authoritative list with:
> `grep -rLE '^import (java|javax|jaggl|jagdx|jagtheora|jaclib|jagex3|jagmisc|com\.ms)|external (fun|val|var)' src/jvmMain/kotlin`
> then subtract the DELETE/KEEP/SPLIT/REWIRE/UTIL/REFLECT names below.

---

## JNI — KEEP in jvmMain forever — 136 files

The native binding cluster. These import `jaggl`/`jagdx`/`jagtheora`/`jaclib`/`jagex3` or declare
`external` functions. They are the irreducible platform core; common code reaches their capabilities
only through the `ha`/`SoftwareToolkitFactory`/`LoginVideo`/`GlApi` seams. **No action — do not move.**

### GL — `jaggl` (55)
`Class104, Class105_Sub2, Class119, Class119_Sub1, Class135, Class135_Sub1, Class14, Class142,
Class14_Sub1, Class14_Sub2, Class14_Sub3, Class14_Sub4, Class164, Class169, Class18, Class186_Sub1,
Class188, Class206, Class233, Class258, Class258_Sub1, Class258_Sub2, Class258_Sub3, Class258_Sub4,
Class280, Class285, Class285_Sub1, Class285_Sub2, Class286_Sub1, Class286_Sub3..Sub9, Class299_Sub1_Sub2,
Class310, Class310_Sub1..Sub3, Class318_Sub1_Sub5_Sub2, Class324Statics, Class324_Sub2, Class324_Sub5,
Class328, Class330, Class348_Sub20, Class348_Sub38, Class353, Class366, Class367_Sub2/5/6/7/9/11,
Class50, Class53, Class61, Class64_Sub2, Class64_Sub3, Class97, ha_Sub2, ha_Sub3, jaggl/OpenGL,
jaggl/MapBuffer, a, h, i, j, n, na, oa, p, s_Sub2, s_Sub3, t, wa, xa, ya, za_Sub1, za_Sub2`

### D3D — `jagdx` (30)
`Class348_Sub42_Sub15, Class348_Sub5_Sub1, Class377, Class378, dxVertexLayout,
jagdx/D3DLIGHT, jagdx/D3DPRESENT_PARAMETERS, jagdx/GeometryBuffer, jagdx/IDirect3D,
jagdx/IDirect3DBaseTexture, …CubeTexture, …Device, …EventQuery, …IndexBuffer, …PixelShader,
…Surface, …SwapChain, …Texture, …VertexBuffer, …VertexDeclaration, …VertexShader, …VolumeTexture,
jagdx/PixelBuffer, jagdx/VertexElementCollection` (+ the GL-shared subs that also touch jagdx)

### Native memory / peers — `jaclib` (34)
`jaclib/memory/NativeBuffer, …/Stream, …/heap/NativeHeap, …/heap/NativeHeapBuffer,
jaclib/peer/IUnknown, jaclib/peer/Peer, jaclib/peer/PeerReference, jaclib/peer/hb,
Class348_Sub4, Class348_Sub49_Sub1, Class59_Sub1, Class96` and the remaining `jaclib`-importing subs.

### Video — `jagtheora` (21)
`Class55, Class348_Sub23, Class348_Sub23_Sub1..Sub4, jagtheora/misc/SimplePeer,
jagtheora/ogg/{OggPacket,OggPage,OggStreamState,OggSyncState},
jagtheora/theora/{DecoderContext,Frame,GranulePos,SetupInfo,TheoraComment,TheoraInfo},
jagtheora/vorbis/{DSPState,VorbisBlock,VorbisComment,VorbisInfo}` — already behind `LoginVideo`.

### Native interface — `jagex3` (5)
`jagex3/graphics2/hw/NativeInterface, jagex3/jagmisc/jagmisc` + 3 importers.

---

## DELETE — 16 files (dead Microsoft-JVM code)

Microsoft-JVM-era DirectX / DirectDraw / Win32 path, unreachable on any modern JVM. Confirm no live
reference (`search_in_files_by_text` each type name), then delete outright.

`com/ms/com/ComFailException, com/ms/com/IUnknown, com/ms/directX/DDSurfaceDesc,
com/ms/directX/DirectDraw, com/ms/directX/DirectSound, com/ms/directX/DirectSoundBuffer,
com/ms/directX/DSBufferDesc, com/ms/directX/DSCursors, com/ms/directX/IEnumModesCallback,
com/ms/directX/WaveFormatEx, com/ms/dll/Callback, com/ms/dll/Root, com/ms/win32/User32,
Callback_Sub1, Class1, Class134`

`Callback_Sub1`/`Class1`/`Class134` are the client-side users of that DirectDraw/User32 path and die
with it. (`DirectDraw`/`DirectSound` were the two `com.ms` files the JNI scan mislabeled — they belong
here, not in JNI-keep.)

---

## KEEP — seam implementations — 15 files

These **are** the platform side of the seams — the only non-JNI files allowed to name a platform API.
They stay in `jvmMain` by design; their `commonMain` interface/`expect` counterpart is what everyone
else depends on. **No action** (beyond keeping them on the tier-3 allowlist).

| File | Implements (common seam) | Platform API |
|---|---|---|
| `AwtClipboard` | `SystemClipboard` | `java.awt.datatransfer` |
| `AwtWindowShell` | `WindowShell` | `java.awt` window |
| `AwtDisplayTarget` | `DisplayTarget` | `java.awt` |
| `AwtGlyphRasterizer` | `GlyphRasterizer` | `java.awt.Font` |
| `JvmHttpFetch` | `HttpFetch` | `java.net.URL` |
| `JvmSocketOpener` | `SocketOpener`/`Class238` | `java.net.Socket` |
| `JavaSoundAudioSink` | `AudioSink` | `javax.sound` |
| `FileCacheStorage` | `CacheStorageFactory`/`CacheStore` | `java.io` |
| `JvmGameLogger` | `GameLogger` | `java.io` |
| `JvmNativeLibraryProbe` | `NativeLibraryProbe` | reflection/`java.util` |
| `CalendarShim.jvm` | `CalendarShim` (actual) | `java.util.Calendar` |
| `SoftRef.jvm` | `SoftRef` (actual) | — |
| `haStatics` | software/GL toolkit dispatcher | `java.awt.Canvas` |
| `sStatics` | sprite-sheet statics | `java.awt` |
| `Loader` | app bootstrap (`main`) | `java.awt`/`javax.swing` |

---

## SPLIT into `*Statics` — 5 files

The companion/object holds a platform member while the rest is platform-free. Apply the proven
pattern: move the jvm-only member into a jvm `ClassNNNStatics`, leave a `commonMain` `ClassNNNStatics`
with the platform-free state, add a JS actual (usually a trivial stub). Seam the **member**, not the
class. After the split, the host class becomes ready to move.

| File | Platform touchpoint | Action |
|---|---|---|
| `Class124Statics` | `java.awt` member | split AWT member to jvm `Statics`, common half holds plain state |
| `Class262Statics` | `java.awt` (113 LOC) | largest split; isolate the AWT members behind `WindowShell`/`GameSurface` |
| `Class305Statics` | `java.awt` (6 LOC) | tiny — move the one AWT member to jvm, common stub |
| `Class348_Sub5Statics` | `java.awt` toolkit construction | route through `SoftwareToolkitFactory`; jvm keeps GL/D3D branch |
| `Class369_Sub3_Sub1Statics` | `java.awt` member | split member to jvm `Statics` |

---

## UTIL sweep — 2 files

Wildcard `java.util.*` import with collection/Random/Calendar use only. Swap to kotlin stdlib +
existing `JavaRandom`/`CalendarShim` shims (identical to the Phase-2 sweep of 37 files).

| File | Note |
|---|---|
| `Class66` (5250 LOC) | large but mechanical — collections only; biggest single util swap |
| `Player` (680 LOC) | wildcard `import java.util.*`, few real uses |

---

## REFLECT stub — 1 file

| File | Touchpoint | Action                                                                                        |
|---|---|-----------------------------------------------------------------------------------------------|
| `Class348_Sub40_Sub1` | `Class.forName`/`Boolean.TYPE` anti-cheat | `expect/actual`: jvm keeps reflection, off-jvm returns "unsupported"; host then ready to move |

---

## REWIRE — 56 files (the core isolation work)

Each has a small, identified platform touchpoint. Route it through the named existing seam, drop the
import, and the file becomes read to move. Grouped by seam. **`@N`** = number of usage sites.

### A. AWT `Canvas`/`Component`/`Graphics` → `GameSurface` / `DisplayTarget` / `InputSource` (24)

These name an AWT canvas/component, mostly as a parameter or field type. Replace the type with the
common `DisplayTarget`/`GameSurface` (for Canvas/Graphics) or route the component through
`InputSource`/`WindowShell`; the concrete AWT object is supplied jvm-side.

| File | Touchpoint | Seam |
|---|---|---|
| `Canvas_Sub1` | `Canvas`, `Component`, `Graphics@2` | `GameSurface` (this is close to a seam impl — may KEEP) |
| `Class110` | `Canvas@1` | `DisplayTarget` |
| `Class22` | `Canvas@1` | `DisplayTarget` |
| `Class284` | `Canvas@1` | `DisplayTarget` |
| `Class306` | `Canvas@1` | `DisplayTarget` |
| `Class96` | `Canvas@1` | `DisplayTarget` |
| `Class193` | `Component@1` | `WindowShell`/`InputSource` |
| `Class279` | `Component@1` | `InputSource` (audio focus) |
| `Class279_Sub1` | `Component@1` | `InputSource` |
| `Class279_Sub2` | `Component@1` | `InputSource` |
| `Interface20` | `Component@1` (in `method78` sig) | change sig param to `DisplayTarget?` |
| `Class33` | `Point@2` | common point/coord type |
| `Class140` | `Color@1` | int-ARGB (drop `java.awt.Color`) |
| `Class348_Sub22` | `Color@1` | int-ARGB |
| `Class199` | `Color@7` (font) | int-ARGB; rasterize via `GlyphRasterizer` |
| `Class294` | `Color@2`, `Image@19` | `GlyphRasterizer` + surface image seam |
| `Class342` | `Image@1` | image seam |
| `Class34` | `Frame@1` | `WindowShell` |
| `Class52` | `Frame@1` | `WindowShell` |
| `Class56` | `Frame@1` (live param in `method527`) | `WindowShell` |
| `Class318_Sub1_Sub3_Sub4` | `Frame@2` | `WindowShell` |
| `Class7` | `DisplayMode`,`Frame`,`GraphicsDevice`,`GraphicsEnvironment` | `WindowShell` (fullscreen/display query) |
| `Class165` | `Robot`,`Component`,`Point`,`BufferedImage` | screenshot path → `WindowShell.capture()` seam (new small method) |
| `D3DPRESENT_PARAMETERS` | `Canvas@1` | jagdx-adjacent — KEEP with jagdx instead (move to JNI list) |

### B. AWT input/surface impls → already seamed, verify then mostly KEEP (6)

These are the concrete `InputSource`/`GameSurface` adapters. They genuinely implement the seam — keep
jvm; just ensure no tier-1 file names them directly.

| File | Role |
|---|---|
| `Class346_Sub1` | keyboard adapter (`KeyListener`/`FocusListener`) — KEEP behind `InputSource` |
| `Class373_Sub1` | mouse adapter (`Component`) — KEEP behind `InputSource` |
| `Class373_Sub2` | mouse adapter (`MouseListener`/`MouseMotionListener`) — KEEP behind `InputSource` |
| `Class348_Sub31` | software-renderer blit surface (`Canvas`/`Graphics`) — KEEP behind `GameSurface` |
| `Class348_Sub31_Sub1` | `BufferedImage`/`Raster` pixel buffer — KEEP (surface impl) |
| `Class348_Sub31_Sub2` | `ImageConsumer`/`ImageProducer` blit — KEEP (surface impl) |

### C. `java.io` streams/files → `CacheStore` / stream seam (16)

| File | Touchpoint | Seam / action                                       |
|---|---|-----------------------------------------------------|
| `InputStream_Sub1` | `InputStream@1` | stream seam (or KEEP as io impl)                    |
| `InputStream_Sub2` | `InputStream@1` | stream seam                                         |
| `OutputStream_Sub1` | `OutputStream@1` | stream seam                                         |
| `OutputStream_Sub2` | `OutputStream@1` | stream seam                                         |
| `Class208` | `OutputStream@1` | stream seam                                         |
| `Class376` | `InputStream@1` | stream seam                                         |
| `Class299_Sub1` | `FileOutputStream@1` | `CacheStore` write                                  |
| `Class158` | `File@1` (only in commented heap-dump) | drop import → ready to move                 |
| `Class166` | `File@1` | `CacheStore`                                        |
| `Class228` | `File@1` | `CacheStore`                                        |
| `Class239_Sub24` | `File@1` | `CacheStore`                                        |
| `Class327` | `File@1` (sleep already on `Sleeper`) | `CacheStore` for the File use                       |
| `Class348_Sub6` | `File@1` (native-lib extraction) | `NativeLibraryProbe` — likely KEEP (jvm lib unpack) |
| `Class348_Sub24` | `File@1` (591 LOC cache) | `CacheStore` — large; may KEEP as cache impl        |
| `Class59` | `File@1` (313 LOC) | `CacheStore`                                        |
| `Class374` | `java.io.*` wildcard (only `IOException`) | drop wildcard → ready to move                            |

### D. `java.net` sockets → `Class238` / `SocketOpener` (5)

| File | Touchpoint | Action |
|---|---|---|
| `Class272` | `Socket@3` (returns `Socket`) | abstract return type to `Class238`/`SocketOpener` |
| `Class272_Sub1` | `Socket@1` (override returns `Socket?`) | follow `Class272`'s abstracted type |
| `Class272_Sub2` | `BufferedReader`/`InputStreamReader`/`StandardCharsets@2` | world-list HTTP → `HttpFetch` + kotlin text |
| `Class238_Sub1` | `Socket@1` | the `Class238` jvm impl — KEEP behind `Class238` |
| `Class376` | (also io) | `SocketOpener` |

### E. Signlink / privileged-IO — KEEP jvm (1)

| File | Touchpoint | Action |
|---|---|---|
| `Class297` | `Transferable`,`Method`,`InetAddress@4`,`Socket@4` (477 LOC) | the "signlink" — clipboard+DNS+socket+reflection. **KEEP jvm** behind `SystemClipboard`/`SocketOpener`/`HttpFetch`; ensure tier-1 reaches it only via those. |

### F. `java.nio` (1)

| File | Touchpoint | Action |
|---|---|---|
| `Class344_Sub1` | `ByteBuffer@2` | buffer seam or kotlin `ByteArray`; then ready to move |

### G. reflection in io/awt files (folded into above)

`Class110`, `Class158`, `Class228`, `Class348_Sub18`, `Class348_Sub33`, `Class7` also carry a
`reflect` touch alongside their main binding — handle with the same `expect/actual` stub as
`Class348_Sub40_Sub1` where the reflection is anti-cheat, or drop if dead. `Class348_Sub33`
(`Field`/`Method`/`InvocationTargetException`) is reflection-heavy → KEEP jvm or stub.

---

## How to read this for execution

1. The **596 MOVE-NOW** files need no seam work — move them (and Client, once it joins them) freely.
2. The hand-work is the **64 files** in REWIRE/SPLIT/UTIL/REFLECT. Several of the "REWIRE" rows are
   actually **KEEP seam impls** on inspection (flagged inline: `Canvas_Sub1`, the `Sub31`/input
   adapters, `Class297`, `Class238_Sub1`, `Class348_Sub6/Sub24`) — those don't move, they just need
   to be the *only* place their platform API is named.
3. After the 64 are seamed/split/swept and the 16 deleted, **no off-allowlist file names a platform
   API**, and every remaining `jvmMain` file is either a deliberate tier-3 impl or trivially movable.
4. Re-derive these buckets any time with the classifier (`tools/` — the import+usage scan that
   produced this table); `compileKotlinJvm` is the final oracle.
