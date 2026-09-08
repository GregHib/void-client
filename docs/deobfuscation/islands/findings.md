# Concrete findings (session discovery)

This file is the live **research log** — concrete evidence discovered during
the deobfuscation discovery pass. Use it as the input for lote planning.

Last updated: 2026-08-30 (lote 70 executed; lote 51/54/59/65/69 marked done).

---

## 1. lote 50 — `method3` island (CONFIRMED)

**Interface:** `client/toolkit/base/d.java` (single-letter JODE name — deep obfuscation)
**Implementer:** `client/components/Component283.java` (formerly `Class244`)
**Field type on the toolkit:** `aD####` (e.g. `aD4579`, `aD5684`)

**Method map (the interface has 6 methods, all in low-numbered `method1`–`method6`):**

| Interface method | Signature | Returns | Inferred name | Evidence |
|---|---|---|---|---|
| `method1` | `(int, float, boolean, int, int, int)` | `float[]` | `getVertices` | pattern `0.7F` = scale, returns vertex array |
| `method2` | `(boolean)` | `int` | `getModelCount` | returns `anInt4625` (constructor-loaded count) |
| `method3` | `(int id, int magic)` | `Component319` | `getModel` | 67 call-sites, all `id & 0xffff`, magic arg always `-6662` |
| `method4` | `(int, int)` | `boolean` | `isModelLoaded` | gate check before fetching model |
| `method5` | `(boolean, int, float, int, int, int)` | `int[]` | `getTriangles` | texture/material lookup |
| `method6` | `(int, int, float, int, boolean, int)` | `int[]` | `getIndices` | vertex index list |

**Component319 (formerly `Class12`)** is the **Model / Renderable** struct.
Fields `aBoolean207` (loaded), `aBoolean209` (visible?), etc.

**Reflection:** zero — `method3` family is not touched by `AwtHost` or `ServerPrefs`. Safe rename without host sync.

**Suggested full rename (one lote):**
- `d` → `ModelProvider`
- `Component283` → `ModelStore` (or keep `ModelProviderImpl`)
- `Component319` → `Model`
- `aD####` → `modelProvider`
- `method1`–`method6` as above

**Lote size:** ~80 method refs + ~15 field refs + 1 class rename.

---

## 2. lote 51 — CS2 interpreter stacks (CONFIRMED)

`ClientScriptExecutor.java` (formerly `Class66`) is the **CS2 (clientscript)
interpreter** with three stacks. The `anInt1170`/`anInt1173`/`anInt1154`
cluster is the **stack-machine state** of the interpreter.

| Field | Stack it points into | Inferred name | Refs |
|---|---|---|---:|
| `anIntArray1149` (int[1000]) | int stack (data) | `intStack` | — |
| `aStringArray1152` (String[1000]) | string stack (data) | `stringStack` | — |
| `aClass184Array1168` (Component357[]) | call frames | `callFrames` | — |
| **`anInt1173`** | `intStack` | **`intStackPointer`** | **1 238** |
| **`anInt1170`** | `stringStack` | **`stringStackPointer`** | **208** |
| **`anInt1154`** | `callFrames` | **`callFramePointer`** | (low refs, but load-bearing) |

**Evidence:** line 4920 `anInt1173 = 0;` at the start of `execute()` (reset
all three). Lines 4907, 4909, 4933, 4943: textbook `anIntArray1149[anInt1173++]`
(push) and `anInt1173 -= 2` (pop 2) patterns.

**Reflection:** zero. Safe to rename.

**Lote size:** ~1 240 + 200 + small = ~1 450 ref renames. Single file.

**Bonus:** in the same lote, also rename the stack arrays:
`anIntArray1149` → `intStack`, `aStringArray1152` → `stringStack`,
`aClass184Array1168` → `callFrames`, and the dispatcher fields
(`aStringArray1155`, `aStringArray1176`, `anIntArray1175`).

---

## 3. Top method#### resolved (5 of top-6) — DONE 2026-08-29

| Token | Defining class | Renamed to | Evidence |
|---|---|---|---|
| `method3429` (149→0) | `NodeSub51` (Preferences) | `applyPreference` | calls `method1718` + `method3426` commit |
| `method3771` (104→0) | `GlToolkitSub2` | `bindTexture` | `glEnable/glDisable/glBindTexture` |
| `method2436` (104→0) | `DisplayModeManagerContainer58` + `Player` | `getSize` | returns tile footprint; Player overrides via appearance |
| `method3243` (103→0) | `HashNodeSub14` | `enqueueOutboundPacket` | queues write buffer; **not** particles |
| `method2148` (100→0) | `ParticleShader` | `createOutboundPacket` | factory + `"Encode packet"` log |

Also renamed `anInt10280` → `size` on the entity base.

**Correction vs earlier draft:** `method2148`/`method3243` are outbound **packet** helpers (type still named `ParticleSystem`). Do not call them particle FX.

---

## 3b. CS2 stacks — DONE 2026-08-29 (lote 51)

| Old | New |
|---|---|
| `anIntArray1149` | `intStack` |
| `aStringArray1152` | `stringStack` |
| `aClass184Array1168` | `callFrames` |
| `anInt1173` | `intStackPointer` |
| `anInt1170` | `stringStackPointer` |
| `anInt1154` | `callFramePointer` |

Reflection: none. Desktop + iOS compile green after lote.

---

## 4. `SpriteSub3` family — rasterizer (NEW ISLAND)

`client/sprites/SpriteSub3.java` (formerly `Class105_Sub3`) extends
`Component24` (Sprite base). **This is the CPU rasterizer for sprites** —
the biggest hot path in 2D rendering.

| Field | Inferred name | Evidence |
|---|---|---|
| `anInt8477` (319 refs) | `spriteAlpha` | `i_35_ >>> 24` (extract alpha from ARGB), `== 255` (opaque gate) |
| `anInt8471` (235 refs) | `spriteWidth` | instance field set from `i` arg; used in stride calc |
| `anInt8450`, `anInt8481` | `scanlineStart*` | `(f - f) * 4096F * anInt8470 / f` (fixed-point) |
| `anInt8451`, `anInt8453` | `scanlineAdvance*` | `+= anInt8453` in pixel-stepping loops |
| `aHa_Sub1_8460` | `toolkit` | `GlToolkitSub1` reference |

The whole **84xx range** is `SpriteSub3`'s fields. The **sub-files**
(`SpriteSub3Sub2`, `SpriteSub3Sub3`, `SpriteCapture`) inherit them all.
~200+ anInt tokens can be renamed in a single targeted lote, with high
confidence because the role is well-known (rasterizer scanline state).

**Reflection:** none directly. (Note: `GlToolkitSub2.anInt7666` is
reflective and is the toolkit's canvasHeight, not a SpriteSub3 field.)

---

## 5. Reflection bridge — 10 fields still obfuscated

The reflection gate currently tracks 25 members. **10 are still in
`anInt####` form** — these are the display-state mirrors that the mobile
host writes when the canvas resizes (via `ScreenModeManager`).

| Field | Role | Suggested name | Refs |
|---|---|---|---:|
| `SocketConnector.anInt3473` | **source** — canvas width | `canvasWidth` | low (just a holder) |
| `NpcNode.anInt6857` | **source** — canvas height | `canvasHeight` | low |
| `Component236.anInt4017` | mirror → `SocketConnector.anInt3473` | `canvasWidth` | low |
| `DisplayModeManagerContainer147.anInt4167` | reset to 0 between draw calls | `spriteBatchReset` (?) | low |
| `DisplayModeManagerContainer23.anInt1524` | init `= 765` → `= canvasWidth` | `defaultDrawDistance` (or `canvasWidth`) | low |
| `DisplayModeManagerContainer295.anInt5911` | mirror → `canvasWidth` | `canvasWidth` | low |
| `GlToolkitSub2.anInt7666` | mirror → `canvasHeight` | `canvasHeight` | low |
| `InputHandler.anInt4276` | mirror → `canvasWidth` | `canvasWidth` | low |
| `NodeSub48.anInt7129` | reset to 0 between frames | (per-frame reset) | low |
| `PacketReader.anInt10432` | mirror → `canvasHeight` | `canvasHeight` | low |

**Pattern:** `ScreenModeManager.applyMode()` writes `container.getSize().width`
→ `SocketConnector.anInt3473`, and that cascades into all the other holders.
`NpcNode.anInt6857` similarly from `height`. Then `OpenGlShader` /
`SpriteAtlasShader` copy the values into per-frame fields that get reset.

**Important:** when these get renamed, the **mobile host** (which currently
sends the obfuscated string literals) must move to the new names. The
reflection gate (`check_reflection.py`) will catch any miss.

The `EXPECTED` table in the script will need updating as the renames land:
replace `(field, "SocketConnector", "anInt3473")` with
`(field, "SocketConnector", "canvasWidth")`, etc.

---

## 5b. lote 52 — `SpriteSub3` rasterizer (CONFIRMED, executed)

**File:** `client/sprites/SpriteSub3.java` + subclasses `SpriteSub3Sub2`,
`SpriteSub3Sub3`, `SpriteCapture`. Also `client/components/Component297.java`
(constructor reads `spriteWidth`/`spriteHeight`).

This is the **CPU sprite rasterizer** — a scanline alpha-blend loop. Proof
(grep on the 84xx fields in `SpriteSub3.java`):

| Token | New name | Evidence |
|---|---|---|
| `anInt8477` | `spriteAlpha` | `int i = argb >>> 24;` then `if (i == 255) { opaque fast path }` — high byte = alpha |
| `anInt8471` | `spriteWidth` | bound to the drawn width (`i` arg), used in stride `i_3_ * anInt8471` |
| `anInt8470` | `spriteHeight` | `anInt8464 + anInt8470 + anInt8456` (top+height+bottom) |
| `anInt8450` | `scanlineX` | `(int) ((f_61_ - f_59_) * 4096.0F * (float) anInt8470 / f_84_)` fixed-point scanline coord |
| `anInt8481` | `scanlineY` | same shape as `scanlineX`, paired in the rasterizer step |
| `anInt8451` | `scanlineStepX` | `anInt8451 += anInt8453` per-pixel advance |
| `anInt8453` | `scanlineStepY` | the step added into `scanlineStepX` each pixel |
| `aHa_Sub1_8460` | `toolkit` | declared `GlToolkitSub1 aHa_Sub1_8460;` — the toolkit used for canvas-width math |

**Reflection:** none. **Gate result:** `check_reflection.py` PASS,
`:client:compileJava` SUCCESS (2026-08-30). `Component297.java` was the
only external reader and was updated in the same change.

**Deferred (lote 52b):** `anInt8480`, `anInt8469`, `anInt8463`, `anInt8465`
and the `anInt8452`/`anInt8454`–`anInt8459`/`anInt8461`/`anInt8466`–`anInt8468`
range — role not yet proven strongly enough to rename blindly.

---

## 6. `Component192` — already half-named utility (RECORDED)

`Component192.java` (formerly `Class316`) is the **menu/console/bezier
utility** class. Header comment from prior lote already names:

- `menuTip` (left-click tip)
- `openDevConsole`
- `drawBezier`
- `formatMenuEntry`
- `lookup` (open-addressed hash)
- `clearStatics`, `clearSoftCache`

The field `aClass348_Sub51_3959` is a `NodeSub51` (Preferences) reference —
rename to `preferences`. `NodeSub51` itself (formerly `Class348_Sub51`)
holds the 30+ `aClass239_SubN_NNNN` sub-preference fields.

---

## 7. Lote 59 — `Component182` float writers (CONFIRMED, executed)

`Component182` is a `Buffer` subclass. Its paired methods serialize an IEEE-754
float into the buffer using opposite byte orders:

| Old token | New name | Evidence |
|---|---|---|
| `method3399` | `writeFloatLE` | `floatToRawIntBits`, then bytes are emitted least-significant first |
| `method3400` | `writeFloatBE` | `floatToRawIntBits`, then bytes are emitted most-significant first |

Both methods have one definition and their call sites are limited to
`Component182` users. No reflection strings reference them. This resolves
160 call-site tokens without changing wire behavior.

## 8. Lote 65 — `Component182` scene renderer (CONFIRMED, executed)

`method3398` is the scene-rendering pass called by
`AbstractGlTextureSub1.method1960` for both primary and alternate rendering
modes. It collects opaque and translucent renderables, updates visibility
maps, draws scene layers, and flushes the toolkit when required. It is now
named `renderScene`; the two call sites are unchanged in behavior.

## 9. Unresolved tokens (need more work)

These remain TBD from the top-tokens list:

- `method3738` (high call-site count, not yet investigated)
- `anInt9139`, `anInt8983` (9xxx range — usually widgets / interfaces)

**Resolved in lote 66:** `method3493/3494/3495/3505/3506`, `method3850/3849`,
`method835`, `anInt3138`, `anInt4592/4588/4587/4590`, scene height helpers.

**Next session** can pick: `method3738` → widget `anInt9139/8983` → more
GlToolkitSub3 texture-unit state (`anInt8175`).

---

## 10. Lote 66 — scene floor + prefs + collision + GL texture (CONFIRMED, executed)

| Old | New | Evidence |
|---|---|---|
| `s.anInt4587` | `tileWidth` | ctor arg; bounds in `getInterpolatedHeight` |
| `s.anInt4590` | `tileLength` | ctor arg; Z extent |
| `s.anInt4592` | `tileSize` | `1 << bits` (usually 512) |
| `s.anInt4588` | `tileSizeBits` | world→tile shift / lerp shift |
| `s.anIntArrayArray4584` | `heights` | bilinear height samples |
| `method3982` | `getHeight` | returns `heights[x][z]` |
| `method3986` | `getInterpolatedHeight` | four-corner lerp |
| `Component339.anInt3138` | `preferenceValue` | option value clamped by subclasses |
| `aClass348_Sub51_3136` | `preferences` | owning `NodeSub51` |
| `TeleportHandler` | `CollisionMap` | clip bitfield grid (misnamed for `tele` string) |
| `anIntArrayArray4438` | `collisionFlags` | OR/AND with wall bits `0x2c01xx` |
| `method3493/3494` | `clear/setCollisionFlag` | `~bits` / OR into flags |
| `method3495` | `reachedWall` | wall-reach walkability |
| `method3505/3506` | `flagSolid` / `unflagWall` | rectangle solid / wall clear |
| `method3850` | `setActiveTexture` | binds `Interface18` on unit `anInt8175` |
| `method3849` | `setTextureCombineMode` | wraps `method3924` |
| `method835` | `getSequence` | cache load of seq def |

Reflection: none of these tokens. Class rename requires iOS `clean compileJava`
(stale `ios/build/generated` still had `TeleportHandler`).

---

## 11. lote 50 executed — interface name `d` DEFERRED (IMPORTANT)

lote 50 renamed `method1-6`→`getVertices/getModelCount/getModel/isModelLoaded/
getTriangles/getIndices`, `aD####`→`modelProvider`, `Component319`→`Model`,
`Component283`→`ModelStore`. The interface itself (`client/toolkit/base/d.java`)
keeps the name `d`.

**Do NOT rename `d`→`ModelProvider` by regex.** A single-letter identifier
collides with hundreds of local `d` variables and with string literals
(`FriendsIgnoreList` FR/ES text, `ReflectionInvoker` IP regex `"\\d+..."`,
`Loader` `-d` flag). A blanket or "type-scoped" regex rewrite breaks the
build. Rename `d` only with a real IDE refactoring tool in a dedicated pass.

---

## 12. lote 67 — world-map Helvetica `FontGlyphCache` (CONFIRMED, executed)

Evidence from iOS broken map labels + `StaticElementRenderer` bake ladder
(state 70–100) + `DisplayModeManagerContainer213` draw path.

| Old | New | Evidence |
|---|---|---|
| `method2559` | `bakeGlyph` | AWT `drawString` + `PixelGrabber` + `method3662` |
| `method2560` | `getBaselineAscent` | `maxAscent - topInkRow` |
| `method2561` | `drawStringRaw` | glyph blit + optional shadow |
| `method2562` | `clearCharsetMap` | nulls static char map |
| `method2563` | `drawCenteredString` | center + clip gate (map labels) |
| `method2564` | `measureStringWidth` | sum advances |
| `method2565` | `getLineHeight` | `fontHeight - 1` |
| `method1782` | `selectMapLabelFont` | zoom×tier → pt cache |
| `aClass323_4921`…`4672` | `helveticaGlyphs11`…`30` | ctor point sizes 11–30 |
| fields `anInt4040/41`, arrays | `fontHeight` / `baselineAscent` / `glyphAdvances` / `glyphSprites` / `charToGlyphIndex` / `clipBoundsScratch` | bake + draw |

Also extracted `CHARSET` string constant; documented iOS `UIGraphics` bake
requirement on `FontGlyphCache` header.

Reflection: none. Desktop + iOS compile required after lote.

---

## 14. lote 69 — evidenced long-tail methods (CONFIRMED, executed)

Each selected token had exactly one definition and no mobile reflection
references. The call-site evidence supports the following names:

| Old | New | Evidence |
|---|---|---|
| `LogicError.method831` | `clamp` | lower/upper bound checks and `Math.min` |
| `NodeSub10.method2789` | `readBits` | consumes the shared bitstream cursor |
| `DisplayModeManagerContainer389.method243` | `savePreferences` | serializes preferences into the cache file |
| `BuildInfo.method206` | `blendArgb` | alpha extraction and channel compositing |
| `NodeCache.method587` | `purgeSoftReferences` | removes cleared soft entries from LRU history |
| `GlToolkitSub3.method3885` | `setTextureEnvironment` | configures texture environment and alpha operation |
| `GlToolkitSub3.method3897` | `setActiveTextureUnit` | changes the active texture-unit index |
| `Component256.method1829` | `getPreferenceValue` | returns the preference's selected value |
| `Component24.method974` | `drawAt` | draws a sprite at native dimensions |
| `Component309.method2005` | `getDefinition` | loads and caches a scene-object definition |
| `MatrixSub2.method932` | `setScale` | writes a diagonal scale transform |

The batch removes 530 obfuscated method references while preserving behavior.
Reflection gate, desktop compilation, and iOS compilation pass.

## 15. lote 70 — GL binding surface (CONFIRMED, executed)

The existing renderer mapping in `scripts/lote54_rename.py` was applied
mechanically to the GL toolkit hierarchy and all client call sites. It changed
1,283 method references, covering the evidenced native-operation families:
frame/swap, texture and sampler state, shader/program lifecycle, vertex and
index buffers, framebuffer/renderbuffer operations, uniforms, viewport/clear,
window/input bindings, and event processing. The mapping is grounded in the
corresponding `OpenGL` calls and the shared abstract toolkit contract.

One naming collision exposed two distinct `destroyContext(int)` bodies in
`GlToolkitSub3`; the second was named `destroyContextIfNeeded`, with its sole
call site updated. Reflection gate and client compilation pass.

## 16. Remaining-batch assessment (2026-08-30)

The requested next batch of at least 500 `method####` references is currently
blocked by evidence quality, not by tooling. The post-lote-70 inventory reports
2,895 unique obfuscated method references, but no remaining single coherent
family has 500 references with uniquely defined methods and proven call-site
semantics:

* `client/src/client.java` has 646 references, but is the bootstrap/main loop
  and is reflection-sensitive; its methods cross virtually every subsystem.
* `ClientScriptExecutor` has 379 references and is the CS2 dispatcher. The
  remaining handlers are opcode-specific and cannot be named safely without
  tracing opcode tables and stack effects.
* `PacketReader` has 159 references; although protocol-shaped, it is below the
  threshold and several handlers are shared/dispatch-driven.
* The remaining renderer/display files contain fewer than 500 references each,
  and their high-confidence GL surface was already consumed by lote 70.

No code rename was made speculatively. A qualifying batch requires either
opcode-table evidence for the CS2 handlers or a reflection-safe, semantically
isolated bootstrap subfamily; neither is present in the current source/docs.

## 17. lote 71 — preference option contract (CONFIRMED, executed)

The `Component339` preference base class and its 29 concrete option classes
share one virtual contract. Constructor/default-value paths, validation clamps,
and `NodeSub51`'s commit path establish the meanings below; the methods only
carry opaque guard integers and do not alter the wire format.

| Old | New | Evidence |
|---|---|---|
| `method1710(int)` | `getDefaultValue(int)` | returns the option's default |
| `method1712(int,int)` | `setValue(int,int)` | decodes/stores the option value |
| `method1714(int,int)` | `getValue(int,int)` | returns the selected value |
| `method1716(boolean)` | `validateValue(boolean)` | clamps invalid preference values |
| `method1718(int,int)` | `applyValue(int,int)` | validates then commits an option |

The rename was restricted to the preference override family (30 Java files),
avoiding unrelated methods with the same obfuscated token. It replaced 181
method references. No reflection strings reference this contract.

---

## 13. lote 68 — IF widget ids from `widget-map/` (CONFIRMED, executed)

Evidence: live dump `widget-dumps/20260830-164259` + Shift+click picks +
prior orb dump strings. Promoted into `MicrobotWidgets` (no OSRS globval copy).

| Constant | Value | Evidence |
|---|---|---|
| `NOTES_GROUP` | 34 | "Notes" / Add note / Delete |
| `CHAT_GROUP` | 137 | Quick Chat / Submit |
| `INVENTORY_GROUP` | 149 | backpack; slots share `149:0` + childIndex |
| `MUSIC_GROUP` | 187 | track list under `187:1` |
| `QUESTS_GROUP` | 190 | Quests / filter / rows on `190:18` |
| `MAGIC_GROUP` | 192 | Defensive Casting + Cast/Autocast spells |
| `OPTIONS_GROUP` | 261 | Toggle Run / chat / graphics |
| `PRAYER_GROUP` | 271 | quick-prayer setup / book |
| `COMBAT_STYLES_GROUP` | 320 | attack styles panel |
| `FRIENDS_GROUP` | 550 | Friends List |
| `IGNORE_GROUP` | 551 | Ignore List |
| `CLAN_CHAT_GROUP` | 589 | Talking in / Owner |
| `GAMEFRAME_GROUP` | 746 | HUD root |
| `QUICK_PRAYER_ORB_GROUP` | 749 | minimap orb group |
| `COMBAT_OVERLAY_GROUP` | 884 | Unarmed / Combat Lvl |
| `WORLD_MAP_BUTTON` | `746:178` | Shift+click sprite 1777 |
| `QUICK_PRAYER_ORB` | `749:1` | packed `49086465` |
| `PRAYER_BOOK_ICONS` | `271:8` | packed `17760264` |

`JoystickAlias`: World Map + quick-prayer fire prefer these packed ids before
full `openInterfaces` scan.

Reflection: none. Desktop + iOS compile required after lote.
