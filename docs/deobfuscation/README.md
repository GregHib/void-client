# Deobfuscation map — void-client (RS 634)

Evidence-driven rename plan for the 790 obfuscated Java files under `client/`.
Counts, hot-spots, and concrete evidence below were captured during the
discovery pass. See `islands/findings.md` for the live research log.

Skill: [`.cursor/skills/void-client-deobfuscate/SKILL.md`](../../.cursor/skills/void-client-deobfuscate/SKILL.md).

---

## 1. Current state

| Metric | Value |
|---|---:|
| Java files under `client/` | 798 |
| Unique `method####` tokens | 3 075 |
| Unique `anInt####` tokens | 6 287 |
| Unique `aClass####` tokens | 26 |
| Reflection-gate (`check_reflection.py`) | **PASS** (25 live targets / 51 unique refs) |
| Desktop compile (`:client:compileJava`) | **green** |
| iOS compile (`ios/compileJava`) | **green** |
| Android assemble (`:app:assembleDebug`) | **green** (fresh APK 3.36 MB) |

> The job is **not** done while `method####` and `anInt####` counts stay in the
> thousands. Re-run `count_methods.py` after every lote.

### What's already clear (do not regress)

Already-clarified islands (from session log: lotes 47–49):

| Island | Members | Refs |
|---|---|---:|
| Camera orbit | `cameraYaw`, `cameraPitch`, `clampCameraAngles`, `cameraFocusX` | 67 |
| Game FSM | `Component49.clientState` | 98 |
| JS5 / server picker | `errorCount` | 17 |
| Window mode | `fullscreenAvailable`, `getWindowMode` | 6 |
| Applet lifecycle | `initializeClient`, `pulseGame` | 7 |
| Loading FSM | `pulseLoading`, `currentLoadingState` | 45 |
| Dev console | `openDevConsole`, `closeDevConsole` | 5 |
| Containers | `NodeSub13.itemIds`, `amounts`, `setContainerSlot` | 38 |
| **Model provider (lote 50, ready)** | `d.method3`→`getModel`, `method4`→`isModelLoaded`, `Component283`→`ModelStore`, `Component319`→`Model` | ~98 |
| **CS2 interpreter (lote 51, ready)** | `anInt1173`→`intStackPointer`, `anInt1170`→`stringStackPointer`, `anInt1154`→`callFramePointer` | ~1 450 |
| **Sprite rasterizer (lote 52, ready)** | `anInt8477`→`spriteAlpha`, `anInt8471`→`spriteWidth`, `anInt8450/8481`→`scanlineStart*` | ~1 200 |
| **OpenGL renderer (lote 54, ready)** | `method3771`→`setTextureUnit`, `method3243`→`registerParticle`, `method2148`→`createParticleSystem` | ~400 |
| **Display-state mirrors (lote 56, ready)** | 10 reflective `anInt####` fields → `canvasWidth`/`canvasHeight` (see findings §5) | 10 fields |

### Latest batch (lote 69)

The long-tail pass renamed 11 uniquely defined methods with evidence from
bitstream parsing, ARGB compositing, cache lifecycle, sprite drawing, texture
state, preference loading, and matrix construction. Together these names
remove 530 obfuscated method references without changing behavior.

---

## 2. Top hot-spots (where renames pay off most)

Files that contain the most `method####` references — these are the highest
ROI targets for the next lotes.

| Rank | File | `method####` refs | Domain |
|---:|---|---:|---|
| 1 | `client/src/client.java` | 670 | Bootstrap / main loop |
| 2 | `client/toolkit/base/GlToolkitSub3.java` | 602 | OpenGL binding base |
| 3 | `client/toolkit/gl/GlToolkitSub2.java` | 573 | OpenGL renderer |
| 4 | `client/script/ClientScriptExecutor.java` | 490 | CS2 interpreter (lote 51+57) |
| 5 | `client/misc/DisplayModeManagerContainer190.java` | 263 | Display mode FSM |
| 6 | `client/sprites/SpriteSub1.java` | 229 | Sprite rasterizer (Sub1) |
| 7 | `client/misc/DisplayModeManagerContainer282.java` | 214 | Display mode FSM |
| 8 | `client/src/TeleportHandler.java` | 208 | Teleports |
| 9 | `client/net/packet/PacketReader.java` | 202 | Server packets |
| 10 | `client/misc/DisplayModeManagerContainer164.java` | 187 | Display mode FSM |

> See `islands/top-files.md` for the full ranked list + per-file notes.

### Top shared `method####` (highest fan-out)

Renaming these is high-leverage because every call-site is replaced:

| Token | Call-sites | Status | Inferred name |
|---|---:|---|---|
| `method3429` | 149 | ✅ ready | `applyPreferences` (NodeSub51) |
| `method3771` | 104 | ✅ ready | `setTextureUnit` (GlToolkitSub2) |
| `method2436` | 104 | ✅ ready | `getSkillLevel` (2 defs) |
| `method3243` | 103 | ✅ ready | `registerParticle` (HashNodeSub14) |
| `method2148` | 100 | ✅ ready | `createParticleSystem` (ParticleShader) |
| `method3` | 74 | ✅ ready | `getModel` (interface `d` = `ModelProvider`) |
| `method3982` | 92 | TBD | investigate |
| `method3494` | 87 | TBD | likely paired with `method3493` |
| `method3738` | 83 | TBD | investigate |
| `method3850` | 77 | TBD | investigate |
| `method3849` | 58 | TBD | investigate |
| `method835` | 69 | TBD | investigate |
| `method3400` | 0 | ✅ resolved | `writeFloatBE` (Component182) |
| `method3399` | 0 | ✅ resolved | `writeFloatLE` (Component182) |

### Top shared `anInt####` (state fields)

| Token | Refs | Status | Inferred name | Where |
|---|---:|---|---|---|
| `anInt1173` | 1 238 | ✅ ready | `intStackPointer` | CS2 executor |
| `anInt8477` | 319 | ✅ ready | `spriteAlpha` | SpriteSub3 |
| `anInt8450` | 306 | ✅ ready | `scanlineStartX` | SpriteSub3 |
| `anInt8481` | 282 | ✅ ready | `scanlineStartY` | SpriteSub3 |
| `anInt8471` | 235 | ✅ ready | `spriteWidth` | SpriteSub3 |
| `anInt1170` | 208 | ✅ ready | `stringStackPointer` | CS2 executor |
| `anInt4592` | 207 | TBD | — | 4xxx range |
| `anInt3138` | 174 | TBD | — | 3xxx range |
| `anInt8451` | 137 | ✅ ready | `scanlineAdvanceX` | SpriteSub3 |
| `anInt9139` | 132 | TBD | — | 9xxx — interface/widget |
| `anInt4588` | 132 | TBD | — | 4xxx range |

**`anInt1173` is the single biggest pending rename** (1 238 refs).
**`anInt8477` is the second** (319 refs, sprite alpha, hot path).

> The full table is in `islands/top-tokens.md`. The evidence behind
> each "ready" row is in `islands/findings.md`.

---

## 3. Domain map (concrete, not abstract)

What each major area of `client/` actually does — the evidence-backed
naming from this session's discovery.

```
client/
├── src/                    ← bootstrap (client.java, Applet_Sub1, LoadingManager)
│                              + InputHandler, BuildInfo, HardwareProbe, TeleportHandler
├── toolkit/                ← renderers
│   ├── base/               ← GlToolkitSub3 (binding base, NativeInterface)
│   ├── gl/                 ← GlToolkitSub2 (OpenGL state, anInt7477=canvasWidth, anInt7666=canvasHeight)
│   ├── software/           ← GlToolkitSub1 (CPU rasterizer)
│   ├── d3d/                ← D3DToolkit (Windows Direct3D)
│   └── gl/GlExtensionManager ← extension capability table
│
├── sprites/                ← 2D sprite rasterizers
│   ├── SpriteSub1          ← Sub1 rasterizer (top-6 hot file, 229 method####)
│   └── SpriteSub3 + SpriteSub3Sub2/3 + SpriteCapture
│                              ← hot alpha-blend scanline rasterizer (84xx anInt range)
│
├── components/             ← ~200+ ComponentNNN UI containers
│   ├── Component8          ← scene-graph model container
│   ├── Component49         ← has clientState (reflective)
│   ├── Component192        ← menu/console/bezier utility (already half-named)
│   └── …
│
├── misc/                   ← display mode + sub-containers
│   ├── DisplayModeManagerContainer164/190/282 ← display FSM (3 of top-15 hot files)
│   └── DisplayModeManagerContainer* (200+)
│
├── script/                 ← CS2 (clientscript) runtime
│   └── ClientScriptExecutor ← interpreter with intStack/stringStack/callFrames
│
├── net/
│   ├── packet/             ← server IO (PacketReader, Buffer)
│   ├── http/               ← URL opener, etc.
│   └── socket/             ← SocketConnector
│
├── nodes/                  ← Node hierarchy
│   ├── NodeSub51           ← preferences singleton (top method3429 lives here)
│   └── …
│
├── scene/                  ← world/region/collision
├── entities/               ← NPCs, objects, players
├── world/                  ← region, collision, pathing
├── text/                   ← StringCache, Cp1252Decoder
├── shaders/                ← GLSL shader pipeline
├── script/                 ← CS2 executor (re-listed)
├── toolkit/                ← (re-listed)
├── void/                   ← voidawt / voidswing / MobileKeyboard shims
├── menu/                   ← menus + JoystickAlias
└── (… ~30 more domains)
```

### Mobile bridge — reflection only

```
                       ┌──────────────────────────────┐
                       │  android/.../voidawt/        │
                       │      AwtHost.java            │
                       │  ios/.../voidawt/            │  ← must stay in
                       │      AwtHost.java            │    lockstep
                       │  android/.../ServerPrefs.java│
                       └──────────────┬───────────────┘
                                      │
                          Class.forName("…")
                          getDeclaredField("…")
                          getDeclaredMethod("…")
                          setStaticInt("…", …)
                                      │
                                      ▼
                       ┌──────────────────────────────┐
                       │  client/**  (renamed members)│
                       └──────────────────────────────┘
```

**Failure mode** — `AwtHost` catches `Throwable` and swallows it. A stale
string silently kills camera / viewport / server-picker / dev console. The
reflection gate `check_reflection.py` is the only thing that catches this
before runtime.

---

## 4. Lote plan (next batches)

Ordered by ROI. Each entry is one `lote` (~15–40 renames typical, some
are larger when the island is contained). Full steps and exact rename
targets in `islands/lote-plan.md`.

| # | Lote | Expected freed | Reflection? | Notes |
|---:|---|---:|---|---|
| 50 | `ModelProvider` interface island | ~80 method refs + 1 class rename | none | `d.java`, `Component283`, `Component319` |
| 51 | CS2 interpreter stacks | **~1 450 refs** | none | `anInt1173`/`anInt1170`/`anInt1154` + stack arrays |
| 52 | `SpriteSub3` rasterizer family | **~1 200 refs** | none | the 84xx anInt range + fields |
| 53 | Display-mode FSM (3 files) | ~660 refs | yes — `anInt7666` | the 3 top-15 `DisplayModeManagerContainer*` |
| 54 | `GlToolkit*` renderer | ~1 200 refs | yes — `anInt7477`, `anInt7666` | starts with `method3771`→`setTextureUnit` |
| 55 | `PacketReader` (server protocol) | ~200 refs | yes — `anInt10432` | safe, server-driven |
| 56 | Display-state mirror cleanup | 10 reflective fields | **yes — critical** | rename all 10 anInt#### in `findings.md §5` |
| 57 | `ClientScriptExecutor` opcode handlers | ~490 refs | none | keep small, re-gate after each batch |
| 58+ | Long tail | rest | varies | per-class renames |

**Cumulative target after lote 55:** < 1 500 `method####` (from 3 331).
**Cumulative target after lote 56:** < 100 `anInt####` in the
high-fan-out list.

---

## 5. What must change to keep the build green

The Android build is currently green (lote 49 fixed `Class38` ↔
`Interface6` mismatch). The rules below apply to **every** future lote.

| Change | Where | Why |
|---|---|---|
| Field / method renamed in `client/` | `android/.../voidawt/AwtHost.java` AND `ios/.../voidawt/AwtHost.java` (lockstep) | Mobile hosts look up by name |
| `clientState` / `errorCount` / canvas state touched | `ServerPrefs.java` | Same — used by JS5 / server picker / canvas mirror |
| Class renamed (not just member) | `ios/` requires `./gradlew clean compileJava` | Stale `ios/build/generated` after class renames |
| New reflective bridge | update `EXPECTED` in `check_reflection.py` | Catches stale reflection strings |
| Renamed member is in `EXPECTED` | update the table from `OldFoo` → `NewFoo` | Gate will FAIL until updated |

### Reflection table — current 25 live targets

(From `check_reflection.py` output, captured 2026-08-29.)

| Client member (current name) | Looked up in |
|---|---|
| `Component225.aFrame476` | both hosts |
| `InputHandler.anInt4276` | both hosts |
| `DisplayModeManagerContainer295.anInt5911` | both hosts |
| `DisplayModeManagerContainer23.anInt1524` | both hosts |
| `GlToolkitSub2.anInt7666` | both hosts |
| `Component236.anInt4017` | both hosts |
| `PacketReader.anInt10432` | both hosts |
| `SocketConnector.anInt3473` | both hosts |
| `NpcNode.anInt6857` | both hosts |
| `NodeSub48.anInt7129` | both hosts |
| `DisplayModeManagerContainer147.anInt4167` | both hosts |
| `Cp1252Decoder.fullscreenAvailable` | both hosts |
| `Component112.cameraYaw` | both hosts |
| `DisplayModeManagerContainer154.cameraPitch` | both hosts |
| `DisplayModeManagerContainer199.clampCameraAngles` | both hosts |
| `StringCache.devConsoleOpen` | both hosts |
| `Component192.openDevConsole` | both hosts |
| `AbstractShaderSub4.closeDevConsole` | both hosts |
| `BuildInfo.isConsolePromptTap` | both hosts |
| `Component49.clientState` | both hosts + `ServerPrefs` |
| `HardwareProbe.aClass248_6601` | both hosts |
| `Component253.errorCount` | `ServerPrefs` |
| `JoystickAlias.padConnected` | both hosts |
| `JoystickAlias.onPadButton` | both hosts |
| `MobileKeyboard.setInset` | both hosts |

**10 of these (the canvas-state mirrors) are still in `anInt####` form
and have English names ready in `findings.md §5`. They will be renamed
in lote 56.**

### Lote 56 pre-flight (rename of all 10)

This lote is special — it requires the **largest single touch** to the
mobile hosts in one go. The plan:

1. Rename all 10 fields in `client/` to `canvasWidth` / `canvasHeight` /
   per-frame reset.
2. Update both `AwtHost.java` files to use the new strings.
3. Update the `EXPECTED` table in `check_reflection.py` to match.
4. Run the gate. It should print `PASS` with all 25 still listed (now
   under new names).

If step 4 fails, the most common cause is forgetting one host file —
`ios/` and `android/` `AwtHost.java` must be in lockstep.

---

## 6. Evidence rules (from skill)

A rename is **allowed** when one of these is true:

- The token sits next to a string literal that names the concept
  (`printConsole`, `"fps"`, command list, localized tip).
- The Buffer/IO shape pins the role (UPDATE_INV slot index, JS5 opcode).
- The call-site role is clear from neighbours (camera lerp, FPS ring,
  ignore list, world map).
- Bit math pins flags (`0x800` = plane flag, `0x18` = bridge flag, etc.).
- Stdlib call pins the role (`quickSort`, `Math.atan2`, `Runtime` memory).
- **Magic-number extract** (`>>> 24` = alpha, `* 4096F` = fixed-point,
  `& 0xffff` = id mask).
- **Struct access pattern** (`aClass_NNN[i] = aClass_MMM[...]` =
  container update).

**Skip:** opaque increment counters, JNI `native` methods, anything
without call-site proof.

### Unsafe short tokens

Tokens like `method83` / `method121` can exist on multiple classes. Before
any global replace:

```bash
python3 .cursor/skills/void-client-deobfuscate/scripts/check_defs.py method2284 method1913
```

If the script prints more than one definition site → rename only the
defining file + override chain (`Applet_Sub1` + `client`).

### Already-resolved interface pattern

`method3` is special: it's defined on the `d` interface (single-letter
JODE name) and implemented by `Component283`. **Always** check for the
interface first when seeing a low-numbered method with multiple
implementations — it may be the public API of an entire subsystem
(renderer primitives, model provider, etc.).

---

## 7. Verification gate (run after every lote)

From repo root:

```bash
# 1. Reflection bridge intact
python3 .cursor/skills/void-client-deobfuscate/scripts/check_reflection.py
# → must print PASS

# 2. Desktop compile
./gradlew :client:compileJava

# 3. iOS compile
cd ios && ./gradlew compileJava && cd ..
# (use `clean compileJava` after class renames)

# 4. Remaining count
python3 .cursor/skills/void-client-deobfuscate/scripts/count_methods.py
# target: method#### trending down each lote
```

The job is **not** done while the script reports thousands of `method####`.
Current: **3 331 unique** — target after lote 50: < 3 250.
After lote 51: < 2 100. After lote 52: < 900.

---

## 8. Folder map

```
docs/deobfuscation/
├── README.md                      ← this file (overview)
└── islands/
    ├── findings.md                ← live research log (evidence per token)
    ├── top-files.md               ← top-15 hot files + per-file notes
    ├── top-tokens.md              ← top-20 method#### + anInt#### with status
    ├── dependency-graph.md        ← repo + mobile-bridge + compile-time graphs
    └── lote-plan.md               ← detailed lote 50-58 with exact renames
```
