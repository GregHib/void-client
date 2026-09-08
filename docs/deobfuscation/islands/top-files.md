# Top hot-spot files (by `method####` references)

Use this to pick the next lote. Higher count = more renames per file = more
clarity per unit of work.

| Rank | File | `method####` refs | Domain / role | Reflection? |
|---:|---|---:|---|---|
| 1 | `client/src/client.java` | 670 | Bootstrap / main loop / frame pump | yes — many |
| 2 | `client/toolkit/base/GlToolkitSub3.java` | 602 | OpenGL binding base (jaclib + jagex3 NativeInterface) | yes — `anInt7477` (canvasWidth) |
| 3 | `client/toolkit/gl/GlToolkitSub2.java` | 573 | OpenGL renderer (jaggl + state cache) | yes — `anInt7666` (canvasHeight), `anInt7477` |
| 4 | `client/script/ClientScriptExecutor.java` | 490 | CS2 (clientscript) interpreter | no |
| 5 | `client/misc/DisplayModeManagerContainer190.java` | 263 | Display-mode FSM (Sub2) | no direct, but uses `GlToolkitSub2.anInt7666` |
| 6 | `client/sprites/SpriteSub1.java` | 229 | Sprite rasterizer (Sub1) — distinct from `SpriteSub3` | no |
| 7 | `client/misc/DisplayModeManagerContainer282.java` | 214 | Display-mode FSM (Sub3) | no direct |
| 8 | `client/src/CollisionMap.java` | 208 | Scene collision / clip flag grid (was misnamed TeleportHandler) | no |
| 9 | `client/net/packet/PacketReader.java` | 202 | Incoming server packet reader | yes — `anInt10432` (canvasHeight) |
| 10 | `client/misc/DisplayModeManagerContainer164.java` | 187 | Display-mode FSM (Sub1) | no direct |
| 11 | `client/toolkit/software/GlToolkitSub1.java` | 169 | Software (CPU) renderer fallback | no |
| 12 | `client/net/http/BrowserUrlOpener.java` | 163 | Opens external URLs via JS / `openjs` | no |
| 13 | `client/components/Component8.java` | 157 | Scene-graph node (model container) | no |
| 14 | `client/toolkit/d3d/D3DToolkit.java` | 156 | Direct3D renderer (Windows only) | no |
| 15 | `client/toolkit/gl/GlExtensionManager.java` | 148 | OpenGL extension loader / capability table | no |

## Domain summary

The top-15 splits into 5 clear buckets:

### Bootstrap (1 file)
- **`client.java`** — the whole game loop. Touches everything. Reflection-heavy.

### Renderer (5 files)
- **`GlToolkitSub3`** + **`GlToolkitSub2`** — OpenGL. Reflection: `anInt7477`
  (canvasWidth), `anInt7666` (canvasHeight).
- **`GlToolkitSub1`** — software fallback.
- **`D3DToolkit`** — Direct3D (Windows).
- **`GlExtensionManager`** — capability detection.

### Display mode (3 files — same FSM family)
- **`DisplayModeManagerContainer164/190/282`** — the window / fullscreen /
  draw-distance FSM. Sub1, Sub2, Sub3 of `DisplayModeManagerContainer370`.

### Sprites (2 files)
- **`SpriteSub1`** — Sub1 sprite (different rasterizer from SpriteSub3).
- **`SpriteSub3`** family (`SpriteSub3.java` + 3 subclasses in the
  same dir) — the hot alpha-blend scanline rasterizer. Lote 52 target.

### Network / IO (2 files)
- **`PacketReader`** — incoming server packets. Has reflective `anInt10432`.
- **`BrowserUrlOpener`** — opens URLs (e.g. `loggedout` page).

### Other (3 files)
- **`ClientScriptExecutor`** — CS2 interpreter (lote 51 + 57).
- **`CollisionMap`** — scene collision / clip flag grid (was misnamed TeleportHandler).
- **`Component8`** — model container.
- **`BrowserUrlOpener`** — URL launcher.

## Notes on reflection in hot files

**Files that have reflective members — must update mobile hosts on rename:**

1. `client.java` (1, 2, 3 below are read/written from `AwtHost` via this
   file's class members)
2. `GlToolkitSub3` / `GlToolkitSub2` — `anInt7477`, `anInt7666`
3. `PacketReader` — `anInt10432`
4. (See `findings.md §5` for the full list of 10 still-obfuscated
   reflective fields.)

**Files that are reflection-safe:**

- All 3 `DisplayModeManagerContainer*` — they read the toolkit's
  reflective fields but don't expose anything themselves.
- `ClientScriptExecutor` — pure logic, not touched by hosts.
- `TeleportHandler`, `Component8`, `BrowserUrlOpener` — pure logic.
- All sprite rasterizers.
