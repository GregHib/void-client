# Microbot (void-client)

Bot runtime + HUD / mouse backends for the RS634 client.

**Why this folder, no `package microbot`?**  
The 634 sources live in the Java *unnamed* (default) package. A named package cannot
reference those types. So these files stay default-package but sit in a separate
Gradle source root for clarity.

`Rs2*` scripting helpers live next door in `rs2/` (same rule).

## Client source roots

Nested folders on disk; **each leaf that holds `.java` is its own Gradle `srcDir`**
so the path is never treated as a package name.

| Dir | Contents |
|-----|----------|
| `src` | Bootstrap / host loop (`Loader`, `client`, `Applet_*`, loading, debug) |
| `fonts` | `BitmapFont` + software / OpenGL / jaclib backends |
| `input` | `MouseHandler`, `AwtMouseHandler`, `BasicMouseHandler` |
| `menu` | `MenuEntry`, `DefaultClickSwapper`, `MenuOpener` |
| `void` | `LoginPrefs`, `MobileKeyboard` |
| `microbot` | bot runtime / panel / mouse backends |
| `rs2` | `Rs2*` scripting API (used by microbot) |
| `toolkit/base` | `ha`, `ha_Sub3`, `ToolkitFactory`, matrix helpers |
| `toolkit/gl` | `oa`, `ha_Sub2`, `Gl*`, `AbstractGlTexture*` |
| `toolkit/software` | `ha_Sub1` |
| `toolkit/d3d` | `D3DToolkit`, `dxVertexLayout`, peers |
| `shaders/base` | `aa*`, `AbstractShader*`, `ShaderProgram*`, compilers |
| `shaders/gl` | OpenGL / water shaders |
| `shaders/d3d` | `D3DShader` |
| `sprites` | `Sprite*` + `Component24` tree |
| `scene/graph` | `Renderable*`, `SceneManager`, overlays |
| `scene/particles` | `Particle*` |
| `scene/buffers` | `s*`, `t` heightmap / buffer-cache |
| `entities` | `Player`, `Npc`, shared parents |
| `nodes` | `Node*`, `HashNode*`, `HashTable` |
| `defs` | `Definition*`, `*Definition` |
| `cache` | `Cache*`, LRU, seekable file, inflate |
| `net/socket` | streams, connectors, request processor |
| `net/crypto` | RSA |
| `net/http` | browser / news / cookies |
| `net/packet` | `Buffer`, `PacketReader`, abstract buffers |
| `media/audio` | audio lines / mixer |
| `media/ogg` | Ogg streams |
| `media/video` | Theora / video ads |
| `script` | `ClientScriptExecutor` |
| `ifaces` | `Interface1`–`21` + impls |
| `native` | `za*` / `ya` / `r*` JNI peers + loaders |
| `text` | text builders / formatters |
| `display` | `DisplayModeManager`, `ScreenModeManager` |
| `components` | opaque `Component*` staging |
| `misc` | unclassified `DisplayModeManagerContainer*` |

Wired from:
- `client/build.gradle.kts` → `java.srcDirs(...)` lists every leaf above
- Android / iOS `prepareClientSources` flattens `client/**/*.java` into `generated/client`
