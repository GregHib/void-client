# Client architecture

Canonical **RuneScape 634** (2010-12-14) Java client sources for Void. Same tree drives desktop JVM, Android (ART), and iOS (RoboVM AOT). Mobile hosts rewrite `java.awt` → `voidawt` (and friends); game logic stays here.

Repo-level mobile host details (AWT shim, audio, `adb reverse`, RoboVM patches): see [`../ARCHITECTURE.md`](../ARCHITECTURE.md).

```
                    ┌──────────────────────────────────────────┐
                    │  client/  (this tree — Java 8, unnamed    │
                    │  package; leaf dirs are Gradle srcDirs)  │
                    └────────────────────┬─────────────────────┘
                                         │
              ┌──────────────────────────┼──────────────────────────┐
              │                          │                          │
     ┌────────▼────────┐      ┌──────────▼──────────┐    ┌─────────▼─────────┐
     │ Desktop         │      │ Android             │    │ iOS               │
     │ :client:run /   │      │ prepareClientSources│    │ prepareClientSources
     │ shadowJar       │      │ → ART + SurfaceView │    │ → RoboVM + UIKit  │
     │ real AWT/OpenGL │      │ software ha_* only  │    │ software ha_* only│
     └─────────────────┘      └─────────────────────┘    └───────────────────┘
                                         │
                              TCP 43594 → Void game (JS5 + login)
```

---

## Package model (critical)

All 634 types live in the Java **unnamed (default) package**. Nested folders on disk are **not** Java packages.

Each leaf that holds `.java` is registered as its own Gradle `srcDir` in `build.gradle.kts`, so the folder name is never treated as a package. A named package (e.g. `package microbot`) **cannot** reference default-package types — keep new helpers default-package too.

Android/iOS `prepareClientSources` flattens `client/**/*.java` into generated output and rewrites JDK imports (`java.awt` → `voidawt`, etc.).

**Do not** invent package declarations under `client/`.

---

## Source roots (domain map)

| Dir | Role |
|-----|------|
| `src/` | Bootstrap / host loop: `Loader`, `client`, `Applet_*`, loading, debug, console (`CommandHandler`), friends list helpers |
| `void/` | Void-specific bridges: `LoginPrefs`, `MobileKeyboard` |
| `microbot/` | Bot runtime / HUD / mouse backends (see `microbot/README.md`) |
| `rs2/` | `Rs2*` scripting API used by microbot |
| `input/` | Mouse handlers (`MouseHandler`, AWT / basic backends) |
| `menu/` | `MenuEntry`, `DefaultClickSwapper`, `MenuOpener` |
| `fonts/` | `BitmapFont` + software / OpenGL / jaclib backends |
| `text/` | Text builders / formatters / CP1252 helpers |
| `display/` | Display / screen mode managers |
| `toolkit/base/` | `GraphicsToolkit`, `ToolkitFactory`, matrices, abstract `ha_*` |
| `toolkit/gl/` | OpenGL toolkit (`ha_Sub2`, `Gl*`, textures) |
| `toolkit/software/` | Software rasterizer (`ha_Sub1`) — **path used on mobile** |
| `toolkit/d3d/` | Direct3D toolkit (desktop / stubbed on mobile) |
| `shaders/base/` | Shader programs, compilers, abstract shaders |
| `shaders/gl/` | OpenGL / water shaders |
| `shaders/d3d/` | D3D shaders |
| `sprites/` | Sprite hierarchy + related UI blit helpers |
| `scene/graph/` | Scene graph: `Renderable*`, overlays, friend login messages |
| `scene/particles/` | Particle systems / shaders |
| `scene/buffers/` | Heightmap / buffer-cache (`s*`, `t`) |
| `entities/` | `Player`, `Npc`, shared entity parents |
| `nodes/` | Linked structures: `Node*`, `HashNode*`, `HashTable` |
| `defs/` | Config definitions (`*Definition`, `Definition*`) |
| `cache/` | Disk/JS5 store: `CacheStore`, `CacheFileStore`, LRU, inflate, seekable files |
| `net/socket/` | TCP connectors, streams, request processors |
| `net/crypto/` | RSA / login crypto |
| `net/http/` | Browser URL opener, news, cookies |
| `net/packet/` | `Buffer`, `PacketReader`, abstract buffers |
| `media/audio/` | Mixer / PCM lines (desktop JavaSound; mobile → `voidsound`) |
| `media/ogg/` | Ogg streams |
| `media/video/` | Theora / video ads |
| `script/` | `ClientScriptExecutor` (CS2) |
| `ifaces/` | Interface contracts + small impls (`Interface1`–…) |
| `native/` | JNI peers / native library loaders (`za*`, `ya`, …) |
| `components/` | Large opaque `Component*` staging (UI, JS5, prefs, enums, …) — heavy deob target |
| `misc/` | Unclassified leftovers (`DisplayModeManagerContainer*`, enums like `GameType`, `BuildType`) |
| `resources/` | Non-Java resources on the classpath |

Approximate scale: hundreds of classes under `components/` + `misc/`; toolkit/scene/net are smaller but hot on the frame and IO paths.

---

## Boot sequence

1. **`Loader`** (`src/Loader.java`) — application entry (`mainClass = "Loader"`). Sets server address (`Loader.address` / `--address` / `void.server`), size, applet params (`modewhere`, world, …), hosts the applet.
2. **`Applet_Sub1` / `client`** — applet lifecycle: `init` → cache dir under `user.home` → JS5 connect → title → login → game.
3. **Toolkit pick** — `ToolkitFactory` / display-mode prefs choose GL, D3D, or software. Mobile stubs force **software** (`ha_Sub1`) and present via `AwtHost`.
4. **Game loop** — pulse networking, CS2, scene compose, blit pixel buffer (or GPU swap on desktop).

Client state is gated by obfuscated globals (e.g. `Component49.clientState`); post-login vs title changes which subsystems run (console commands, world list, etc.).

---

## Networking

Both **JS5** (cache download) and **game login** use **TCP 43594** against a Void-compatible game process.

| Layer | Location | Notes |
|-------|----------|--------|
| Connect / streams | `net/socket/` | IPv4 connect quirks kept minimal for mobile |
| Packet IO | `net/packet/Buffer.java`, `PacketReader` | Opcode decode, ISAAC, buffer pool |
| JS5 TCP session | `components/` (e.g. archive fetch / handshake writers) | Priority queues, XOR key, disconnect codes |
| Disk cache worker | `cache/` + disk-job helpers in `misc/`/`components/` | Enqueue read/write, reference tables, RSA on ref table |
| HTTP extras | `net/http/` | External browser / news — not the game socket |
| Crypto | `net/crypto/` | Login RSA |

Defaults by host (overridable via `void.server` / `ServerPrefs` / in-app picker):

| Host | Default target |
|------|----------------|
| Desktop | `127.0.0.1` |
| Android emulator | `10.0.2.2` |
| Android USB | `127.0.0.1` via **adb reverse** |
| iOS Simulator | `127.0.0.1` |
| Physical phone | LAN / saved history |

`Loader.modewhere=0` (LIVE) keeps port 43594. LOCAL (`4`) remaps to `40000+worldid` — avoid unless ports are patched.

---

## Cache / assets

```
JS5 TCP ──► in-memory queues ──► CacheFileStore / CacheStore ──► disk under user.home
                                      │
                                      ▼
                              ReferenceTable + group inflate
                                      │
                    ┌─────────────────┼─────────────────┐
                    ▼                 ▼                 ▼
               models/anims      maps/locs         audio/fonts/…
```

- First launch: cold JS5 download (slow).
- Warm cache: title/login much faster.
- Music / SFX need the right archive indexes; silence with working PCM often means missing JS5 groups, not the audio device.

---

## Rendering pipeline

```
Scene graph (scene/graph) + entities
        │
        ▼
Toolkit (toolkit/*)  ── desktop: GL / D3D / software
                     ── mobile: software only (natives stubbed)
        │
        ▼
2D overlay: sprites, fonts, interfaces, menu tip
        │
        ▼
Pixel buffer / swap  ── desktop: AWT / GPU present
                     ── mobile: AwtHost.present → Bitmap / UIImage
```

- **Shaders** live under `shaders/` and plug into GL/D3D toolkits.
- **Particles** (`scene/particles`) and **buffers** (`scene/buffers`) feed the scene compose.
- Do not reintroduce real jaggl/DX on mobile without replacing the whole present path.

---

## Input & UI

| Concern | Where |
|---------|--------|
| Raw mouse / keys | `input/`, AWT listeners on desktop; mobile injects via `AwtHost` |
| Right-click / long-press | Host maps long-press → button 3 + modifiers; menu built in `menu/` |
| Default left-click tip | `DefaultClickSwapper` + `~/.void-osrs/default-click.properties` |
| Soft keyboard | `void/MobileKeyboard.java` — open only for type-4 single-line text; chat `liftPx`; hosts call `setKeyboardInset` |
| Dev console | `` ` `` / four-finger tap → open/close; `CommandHandler` parses lines |
| Interfaces / CS2 | `script/ClientScriptExecutor`, interface trees in `components/` |
| Login prefs | `void/LoginPrefs.java` (`~/void-login.txt` auto-login) |

Mobile gesture map (hosts, not this folder): tap = left, long-press = right, drag = camera, pinch = zoom.

---

## Audio

Desktop: `javax.sound.sampled` via `media/audio/`.  
Mobile: rewritten to `voidsound` (`PcmSourceDataLine` → AudioTrack / AudioQueue). Soft synth + SFX still mix in this tree; only the line implementation is host-specific.

---

## Microbot / Rs2

- `microbot/` — overlay bot runtime, panels, mouse backends.
- `rs2/` — high-level scripting helpers calling into 634 types.
- Same unnamed-package rule; see `microbot/README.md`.

---

## Build & run (this module)

```bash
# from void-client/
./gradlew :client:compileJava          # desktop compile gate
./gradlew :client:run                  # Loader → 127.0.0.1:43594
./gradlew :client:shadowJar            # fat jar (Java 8 toolchain)

# iOS compile gate (after class renames: prefer clean)
cd ios && ./gradlew compileJava
# or: ./gradlew clean compileJava
```

Toolchain: **Java 8** for `:client`. Android/iOS use JDK 17+ for their Gradle wrappers but consume rewritten copies of these sources.

Native Jagex libs: `../libs/clientlibs.jar` on the desktop classpath; mobile uses generated stubs (`android/scripts/gen_stubs.py`).

---

## Deobfuscation conventions

Ongoing rename work: evidence-based names + dense comments (see `.cursor/rules/void-client-deobfuscate.mdc`).

- Rename only with evidence of role (call sites, protocol, strings).
- Comment class headers, non-obvious methods, magic constants.
- Do **not** rename JNI `native` method names.
- Skip opaque `anInt++` counters with no semantic use.
- After class renames / reflection string changes: update Android stubs if needed; run iOS `clean compileJava` (stale `ios/build/generated`).
- Prefer whole-word, quote-aware renames; after field renames that collide with params, use `this.field = field`.

Staging leftovers: most remaining `Component*` / `DisplayModeManagerContainer*` / `method####` live under `components/` and `misc/`.

---

## Maintenance cheat sheet

| I want to… | Touch |
|------------|--------|
| Change game / protocol / UI logic | Files under `client/` (prefer clear domain folder) |
| Change soft-keyboard open rules / chat lift | `void/MobileKeyboard.java` |
| Change auto-login file format | `void/LoginPrefs.java` |
| Change console commands | `src/CommandHandler.java` |
| Change packet shapes | `net/packet/` + call sites in `components/` / `PacketReader` |
| Change cache layout / JS5 | `cache/` + JS5 session classes in `components/` |
| Change renderer backend | `toolkit/*`, `shaders/*` (mobile must stay software-capable) |
| Change bot API | `microbot/`, `rs2/` |
| Change AWT present / touch / IME host | `android/` or `ios/` (not here) — see root `ARCHITECTURE.md` |
| Add a Gradle source root | New leaf dir + entry in `client/build.gradle.kts` `java.srcDirs` |

---

## Related docs

| Doc | Scope |
|-----|--------|
| [`../ARCHITECTURE.md`](../ARCHITECTURE.md) | Mobile hosts, voidawt, audio, networking ops, RoboVM |
| [`../README.md`](../README.md) | Quick start (desktop / Android / iOS) |
| [`microbot/README.md`](microbot/README.md) | Bot + srcDir domain map (source of the table above) |
| [`../android/README.md`](../android/README.md) | Android deploy |
| [`../ios/README.md`](../ios/README.md) | iOS deploy |
