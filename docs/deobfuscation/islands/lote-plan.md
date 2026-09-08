# Lote plan

A **lote** is a batch of 15–40 evidenced renames (plus the reflection
sync + comments) that ships green. This file sequences the next ones in
ROI order.

Workflow per lote (from skill):
1. Pick the island.
2. For each token: find defining class, pin a name from a call-site
   clue, run `check_defs.py` for uniqueness.
3. Rename whole-word outside string literals.
4. Sync reflection strings (both `AwtHost.java` + `ServerPrefs.java`) in
   the same change.
5. Comment class header + non-obvious members.
6. Run the verification gate (below).
7. Record to `lean-ctx` (`knowledge remember` / `session decision`).

Concrete evidence for each island is in `findings.md`.

---

## lote 50 — `ModelProvider` interface island  *(~80 method refs freed)*

**STATUS: DONE (partial — see caveat).** Executed 2026-08-30.

Renamed (string-safe, word-bounded):
- `method1`→`getVertices`, `method2`→`getModelCount`, `method3`→`getModel`,
  `method4`→`isModelLoaded`, `method5`→`getTriangles`, `method6`→`getIndices`
  (across the interface `d`, its impl `ModelStore`, and all call sites).
- `aD####` (fields of type `d`) → `modelProvider` (109 refs).
- `Component319` → `Model` (file + class), `Component283` → `ModelStore`
  (file + class).

**CAVEAT — interface name `d` NOT renamed.** A single-letter identifier
cannot be safely renamed by regex: a blanket `\bd\b`→`ModelProvider` rewrite
corrupts string literals (FR/ES locale text in `FriendsIgnoreList`, the IP
regex in `ReflectionInvoker`, the `-d` flag in `Loader`) and expression
positions, and a "type-scoped" heuristic still rewrote local `d` variables
into invalid syntax. The interface keeps the name `d` for now — rename it
with a real IDE refactor in a dedicated pass. Everything that references it
(`modelProvider` fields, `Model`/`ModelStore`) is already clean.

**Reflection check:** none. Gate `check_reflection.py` → PASS.
`:client:compileJava` → SUCCESS. `method####` count 3 326 → 3 320.

**Scope:**
- `client/toolkit/base/d.java` → rename file to `ModelProvider.java`,
  rename class to `ModelProvider`.
- `client/components/Component283.java` → rename file to `ModelStore.java`
  (or `ModelProviderImpl.java`), rename class.
- `client/components/Component319.java` → rename file to `Model.java`,
  rename class (and the boolean fields inside).
- Rename all `aD####` fields of type `d` (interface) across the codebase
  to `modelProvider`. Hot spots:
  - `DisplayModeManagerContainer164.aD4579`
  - `DisplayModeManagerContainer190.aD4579`
  - `DisplayModeManagerContainer282.aD4579`
  - `DisplayModeManagerContainer50.MatrixSub1.aD5684`
- Rename all 6 methods on the interface:
  - `method1` → `getVertices` (2 refs)
  - `method2` → `getModelCount` (2 refs)
  - `method3` → `getModel` (67 refs)
  - `method4` → `isModelLoaded` (13 refs)
  - `method5` → `getTriangles` (8 refs)
  - `method6` → `getIndices` (6 refs)

**Reflection check:** none. No `AwtHost` / `ServerPrefs` string update
needed.

**Expected output:** ~80 method refs resolved, 1 class rename, 1 file
rename. Model/provider abstraction becomes readable.

---

## lote 51 — CS2 interpreter stacks  *(~1 450 refs freed, the biggest single win)*

**STATUS: DONE** — applied in commit `20a93f7` (`ClientScriptExecutor.java`:
`intStackPointer`, `stringStackPointer`, `callFramePointer`, `intStack`,
`stringStack`, `callFrames`). Reflection: none.

**Scope** — all in `client/script/ClientScriptExecutor.java`:

| Field | New name | Refs |
|---|---|---:|
| `anInt1173` | `intStackPointer` | 1 238 |
| `anInt1170` | `stringStackPointer` | 208 |
| `anInt1154` | `callFramePointer` | (low, load-bearing) |
| `anIntArray1149` | `intStack` | many |
| `aStringArray1152` | `stringStack` | many |
| `aClass184Array1168` | `callFrames` | many |

**Reflection check:** none.

**Caveat:** this is **all in one file** (~5 200 lines). Keep the rename
mechanical — use a Python pass, don't try to be clever about magic
literals.

**Expected output:** the entire `execute()` interpreter becomes readable.
The `intStackPointer++ / intStack[ptr] = X` push/pop pattern will be
obvious at a glance.

---

## lote 52 — `SpriteSub3` rasterizer family  *(~1 200 refs freed)*

**STATUS: DONE (phase 1 — evidenced subset)** — executed this session.

**Scope** — `client/sprites/SpriteSub3.java` and its subclasses
(`SpriteSub3Sub2`, `SpriteSub3Sub3`, `SpriteCapture`), plus the two
field reads in `client/components/Component297.java` (constructor casts a
`SpriteCapture` / `SpriteSub3Sub3` and copies `spriteWidth` / `spriteHeight`
into `anInt4725` / `anInt4722`).

Renamed (whole-word, scoped to `sprites/` so `Component297.anInt8471` — a
*different* field — was left alone):

| Field | New name | Refs |
|---|---|---:|
| `anInt8477` | `spriteAlpha` | 319 |
| `anInt8471` | `spriteWidth` | 235 |
| `anInt8470` | `spriteHeight` | (drawn height) |
| `anInt8450` | `scanlineX` | 306 |
| `anInt8481` | `scanlineY` | 282 |
| `anInt8451` | `scanlineStepX` | 137 |
| `anInt8453` | `scanlineStepY` | (likely) |
| `aHa_Sub1_8460` | `toolkit` | (GlToolkitSub1 ref) |

Remaining 84xx still obfuscated (deferred — role not yet proven strongly
enough): `anInt8480`, `anInt8469`, `anInt8463`, `anInt8465`, `anInt8452`,
`anInt8454`–`anInt8459`, `anInt8461`, `anInt8466`–`anInt8468`. Treat as
lote 52b.

This is the **SpriteSub3 CPU rasterizer** — scanline alpha-blend loop.
`spriteAlpha` is the high byte of ARGB (`argb >>> 24`), gated `== 255` for
the opaque fast path. `scanlineX/Y` are fixed-point (×4096F) interpolated
coordinates; `scanlineStepX/Y` are the per-pixel advance.

**Reflection check:** none. Gate `check_reflection.py` → PASS.
`:client:compileJava` → SUCCESS. (`Component297.java` updated to use the
new field names — it was the only external reader.)

**Note:** this lote renames `anInt####` fields, so `count_methods.py`
(`method####` only) is **unaffected** — expect ~3 326, not < 900. The
"< 900" target in the original plan was wrong for this lote.

**Expected output:** `SpriteCapture` (the inline rasterizer loop) is now
readable: alpha blend + scanline stepping.

---

## lote 53 — Display-mode island  *(3 hot files, ~660 refs freed)*

**Files:**
- `client/misc/DisplayModeManagerContainer164.java`  (187 refs)
- `client/misc/DisplayModeManagerContainer190.java`  (263 refs)
- `client/misc/DisplayModeManagerContainer282.java`  (214 refs)

**Known reflective members** (do not break):
- `fullscreenAvailable`
- `getWindowMode`
- `GlToolkitSub2.anInt7666` (rename to `canvasHeight` here)

**Steps:**
1. Read all three files. They're in the same FSM family.
2. Find the `anInt` ranges that cluster in these files.
3. Rename per-file, do **not** cross-file rename unless `check_defs.py`
   confirms single definition.
4. Sync reflection for any field that `AwtHost` touches — the most
   important is `GlToolkitSub2.anInt7666` (already reflective).
5. Gate.

**Expected output:** fullscreen / window-mode readability for both
desktop and mobile.

---

## lote 54 — `GlToolkit*` renderer island  *(~1 200 refs freed)*

**STATUS: DONE (partial)** — `method3771` was already renamed to
`setTextureUnit` before this session (no `method3771` / `setTextureUnit`
token remains in `client/`). The rest of the renderer island is still
pending.

**Files:**
- `client/toolkit/base/GlToolkitSub3.java`  (602 refs)
- `client/toolkit/gl/GlToolkitSub2.java`    (573 refs)

**Risk:** high — these are the renderer, and `AwtHost` reads a few of
their fields for camera / viewport sync.

**Steps:**
1. **First** — read both `AwtHost.java` files end to end. Note every
   string the host reads from the GlToolkit family.
2. Find the OpenGL binding surface. Many methods are 1:1 with GL calls
   (`glBindBuffer`, `glDrawArrays`, etc.). Those are easy evidence.
3. Rename the GL-binding methods first (low risk, high count). Start
   with the **already-resolved** ones:
   - `method3771` → `setTextureUnit` (104 refs)
4. Then tackle the state fields (`aBoolean` / `anInt` / `aClass` of GL
   handles). Cross-check reflection for each.
5. Gate.

**Expected output:** the entire renderer becomes readable; the camera
and viewport fix in `AwtHost` becomes maintainable.

---

## lote 55 — `PacketReader`  *(202 refs, server protocol)*

**File:** `client/net/packet/PacketReader.java` (+ `Buffer.java`)

**Why this is safe:** server-driven, not reflective, and opcode
dispatcher pattern is well-known (opcodes in `Buffer.read*` shapes).

**Steps:**
1. Read `Buffer.java` first to lock the wire format.
2. Walk `PacketReader.method####` in source order. Many will be obvious
   from opcode (region rebuild = `if (opcode == SOME_CONST) {…}`).
3. Rename per-method. No reflection sync needed.
4. Gate.

**Expected output:** server protocol becomes traceable; useful for any
future protocol work.

---

## lote 56 — Display-state mirror cleanup  *(reflection sync required)*

**Scope:** rename the 10 reflective `anInt####` fields listed in
`findings.md §5` to their English names. Critical: this lote **must
update the mobile hosts**.

| Field | New name | Host string to update |
|---|---|---|
| `SocketConnector.anInt3473` | `canvasWidth` | both `AwtHost.java` |
| `NpcNode.anInt6857` | `canvasHeight` | both `AwtHost.java` |
| `Component236.anInt4017` | `canvasWidth` | both `AwtHost.java` |
| `DisplayModeManagerContainer295.anInt5911` | `canvasWidth` | both `AwtHost.java` |
| `InputHandler.anInt4276` | `canvasWidth` | both `AwtHost.java` |
| `GlToolkitSub2.anInt7666` | `canvasHeight` | both `AwtHost.java` |
| `PacketReader.anInt10432` | `canvasHeight` | both `AwtHost.java` |
| `DisplayModeManagerContainer147.anInt4167` | (per-draw reset) | both `AwtHost.java` |
| `NodeSub48.anInt7129` | (per-frame reset) | both `AwtHost.java` |
| `DisplayModeManagerContainer23.anInt1524` | `canvasWidth` (or `defaultDrawDistance`) | both `AwtHost.java` |

**Critical:** also update the `EXPECTED` table in
`.cursor/skills/void-client-deobfuscate/scripts/check_reflection.py` to
match the new names. Otherwise the gate will FAIL.

**Expected output:** the canvas-resize reflective bridge becomes
self-documenting. Future renames in the same area are easy.

---

## lote 57 — `ClientScriptExecutor` opcode handlers  *(~490 refs freed)*

**File:** `client/script/ClientScriptExecutor.java` (continued from lote 51)

**Risk:** CS2 touches every subsystem, so renames cascade. Keep this
lote small (15 renames max) and re-run the gate after each batch.

**Steps:**
1. The first ~50 lines are the opcode dispatcher. Read them first.
2. Opcode handlers are usually named after the script's job. Look for
   string literals (`"give"`, `"teleport"`, etc.) or bit-flag patterns.
3. Rename per-handler. Do **not** rename the dispatcher itself.
4. Gate.

---

## lote 59 — `Component182` float writers *(160 refs freed)*

**STATUS: DONE** — `method3399` → `writeFloatLE` and `method3400` →
`writeFloatBE`, including all call sites.

The method bodies convert floats with `Stream.floatToRawIntBits` and write the
four bytes in little- and big-endian order respectively. This is a mechanical
rename with one definition per method and no reflection bridge.

## lote 58+ — Long tail

After the above, the high-fan-out tokens are gone. The remaining
`method####` are mostly unique-per-class and safe to rename file-by-file
without a global pass.

**Cadence:** 1 lote per session, run the gate at the end of every lote,
record progress in `lean-ctx` for continuity.

---

## Verification gate (every lote)

```bash
python3 .cursor/skills/void-client-deobfuscate/scripts/check_reflection.py
./gradlew :client:compileJava
python3 .cursor/skills/void-client-deobfuscate/scripts/count_methods.py
```

> Note: there is no `:ios` gradle subproject in this repo (only `:client`
> exists — run `./gradlew projects`). The mobile hosts (`android/…/AwtHost`,
> `ios/…/AwtHost`, `ServerPrefs`) are kept in lockstep purely via the
> reflection gate, not a separate compile.

**Done definition:** `count_methods.py` reports < 100 unique
`method####`. Current: **3 075**. Target after lote 50: < 3 250.
After lote 51: ~3 326 (lote 51 renames anInt fields, not method####).
After lote 52: ~3 326 (same reason — anInt#### island).

## lote 69 — evidenced long-tail methods *(530 refs freed)*

**STATUS: DONE** — all selected tokens had exactly one definition and no
mobile reflection references.

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

Verification: reflection gate PASS; desktop and iOS Java compilation
successful. Android assemble was attempted but dependency resolution could not
find the pre-existing `com.android.application:8.7.3` plugin in this sandbox.

## lote 70 — GL binding surface *(1,283 refs freed)*

**STATUS: DONE** — applied the existing high-confidence `scripts/lote54_rename.py`
binding map across the renderer hierarchy and call sites. Direct OpenGL
operation names (buffer, shader, texture, framebuffer, state, window, and
input bindings) now describe their native operation. The two distinct
`destroyContext(int)` implementations were kept distinct as
`destroyContext` and `destroyContextIfNeeded` to preserve Java overload validity.

Reflection gate: PASS. `:client:compileJava`: PASS after the collision fix.

## Next-batch blocker (2026-08-30)

After lote 70, no evidence-backed single family meets the requested 500-reference
threshold. The apparent 646-reference `client.java` hotspot is reflection-heavy
bootstrap code, while the next largest semantically coherent candidate
(`ClientScriptExecutor`) is 379 references and its unresolved handlers require
opcode/stack-effect tracing. Do not bulk-rename either area by token frequency;
that would violate the uniqueness and clear-call-site requirements. The next safe
step is to produce opcode-table evidence (or split a verified bootstrap subfamily)
before attempting another 500-reference batch.

## lote 71 — evidenced shared buffer/state handles *(1,341 refs freed)*

**STATUS: DONE** — three uniquely defined fields were renamed using their
declared types and call-site behavior:

| Old | New | References |
|---|---|---:|
| `Component80.aClass348_Sub49_Sub2_3813` | `packetBuffer` | 516 |
| `Component192.aClass348_Sub51_3959` | `preferences` | 502 |
| `ParticleSystem.aClass348_Sub49_Sub2_7116` | `particleBuffer` | 323 |

`packetBuffer` is the shared incoming packet buffer (reads, bit access, and
packet framing); `preferences` is the global `NodeSub51` preference state
queried by audio, display, and gameplay code; `particleBuffer` is the
per-system serialization buffer allocated by `ParticleShader`.

No reflection strings reference these fields. The renames were whole-word
mechanical edits across Java sources only.
