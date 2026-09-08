# Top shared obfuscated tokens

Status: **resolved** means the rename target is confirmed; **TBD** still
needs investigation. See `findings.md` for evidence on each.

## `method####` (top by call-site count)

The preference option family (`method1710/1712/1714/1716/1718`) is resolved as
`getDefaultValue/setValue/getValue/validateValue/applyValue`; see findings §17.

| Token | Refs | Status | Defining class | Inferred name | Notes |
|---|---:|---|---|---|---|
| `method3429` | 149 | **resolved** | `NodeSub51` (Preferences) | `applyPreferences` | commits prefs + rebuilds |
| `method3771` | 104 | **resolved** | `GlToolkitSub2` | `setTextureUnit` | `glEnable/glDisable/glBindTexture` |
| `method2436` | 104 | **resolved** | `DisplayModeManagerContainer58` (2 defs) | `getSkillLevel` | returns `anInt10280`; `anInt10207 == -32768` = base |
| `method3243` | 103 | **resolved** | `HashNodeSub14` | `registerParticle` | adds to `aClass262_9201` list |
| `method2148` | 100 | **resolved** | `ParticleShader` | `createParticleSystem` | factory: `obtainParticleSystem` + packet encode |
| `method3982` | 92 | TBD | — | — | |
| `method3494` | 87 | TBD | — | — | likely paired with `method3493` (86 refs) |
| `method3493` | 86 | TBD | — | — | probably `method3494`'s pair |
| `method3738` | 83 | TBD | — | — | |
| `method3850` | 77 | TBD | — | — | |
| `method3` | 74 | **resolved** | `toolkit/base/d.java` (interface) | `getModel` | see `findings.md` §1 — whole `d` interface is the ModelProvider |
| `method3400` | 0 | **resolved** | `Component182` (`Buffer`) | `writeFloatBE` | big-endian IEEE-754 float writer |
| `method3399` | 0 | **resolved** | `Component182` (`Buffer`) | `writeFloatLE` | little-endian IEEE-754 float writer |
| `method835` | 69 | TBD | — | — | already-named in `Component192` callsites as `lookup`? check |
| `method1710` | 64 | TBD | — | — | |
| `method3849` | 58 | TBD | — | — | |
| `method831` | 57 | TBD | — | — | |
| `method3986` | 56 | TBD | — | — | |
| `method2789` | 54 | TBD | — | — | |
| `method243` | 53 | TBD | — | — | 3-digit, possibly `Component192.aClass239_SubN_####` accessor |

## `anInt####` (top by call-site count)

| Token | Refs | Status | Class | Inferred name | Notes |
|---|---:|---|---|---|---|
| `anInt1173` | 1 238 | **resolved** | `ClientScriptExecutor` | `intStackPointer` | push/pop into `anIntArray1149[1000]` |
| `anInt8477` | 319 | **resolved** | `SpriteSub3` | `spriteAlpha` | `>>> 24` extract, `== 255` gate |
| `anInt8450` | 306 | **resolved** | `SpriteSub3` | `scanlineStartX` (or similar) | `* 4096F` fixed-point |
| `anInt8481` | 282 | **resolved** | `SpriteSub3` | `scanlineStartY` (or similar) | pair of `anInt8450` |
| `anInt8471` | 235 | **resolved** | `SpriteSub3` | `spriteWidth` | instance field from `i` arg |
| `anInt1170` | 208 | **resolved** | `ClientScriptExecutor` | `stringStackPointer` | push/pop into `aStringArray1152[1000]` |
| `anInt4592` | 207 | TBD | — | — | 4xxx range — likely NPC/entity array |
| `anInt3138` | 174 | TBD | — | — | 3xxx range — likely particle count or scan counter |
| `anInt8451` | 137 | **resolved** | `SpriteSub3` | `scanlineAdvance` | `+= anInt8453` in pixel stepping |
| `anInt7496` | 135 | TBD | — | — | 7xxx range — GlToolkit field |
| `anInt9139` | 132 | TBD | — | — | 9xxx range — likely widget/interface |
| `anInt4588` | 132 | TBD | — | — | 4xxx range — likely NPC/entity pair |
| `anInt8480` | 128 | **resolved** | `SpriteSub3` | (per-frame color/alpha init) | `= i_35_` |
| `anInt1678` | 124 | **resolved** | `Component8` | `canvasWidth` | read from `aHa_Sub1_####.anInt7477` (= toolkit's canvas width constant) |
| `anInt8983` | 123 | TBD | — | — | 9xxx — likely interface/region |
| `anInt7477` | (high) | **resolved** | `GlToolkitSub1/Sub2` (per canvas impl) | `canvasWidth` | stride multiplier: `i + y * canvasWidth` |
| `anInt8469` | 111 | **resolved** | `SpriteSub3` | (sprite counter) | SpriteSub3 family |
| `anInt8463` | 111 | **resolved** | `SpriteSub3` | (sprite counter) | SpriteSub3 family |
| `anInt7507` | 110 | TBD | — | — | 7xxx — toolkit |
| `anInt8465` | 110 | **resolved** | `SpriteSub3` | (init `= 0`) | SpriteSub3 family |

## Investigation protocol

For each `method####` / `anInt####` in this list, before adding to a lote:

1. **Find its defining class** — `grep -rE '(int|void|float|...) method####' --include='*.java' | head`
2. **Find a call-site with a clue** — pick the highest-fan-out caller
   (usually `client.java`) and read the surrounding context.
3. **Pin a name** — look for: nearby string literal, math pattern
   (`& 0x…`, `>>> 24`, `* 4096F`), Buffer shape, or stdlib call
   (`Math.atan2`, `quickSort`).
4. **Run `check_defs.py`** to confirm single definition site (or rename
   per-class if not).
5. **Check reflection** — `grep -n token android/.../AwtHost.java
   ios/.../AwtHost.java android/.../ServerPrefs.java`. If any match, the
   string in that host must move to the new name in the **same lote**.
6. **Rename + re-run the gate** (`check_reflection.py`,
   `:client:compileJava`, `ios/compileJava`).
