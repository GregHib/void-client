# Method Renaming Analysis — Work Plan

## Background

This codebase is a deobfuscated RuneScape client. **Class names are already
mostly meaningful** (e.g. `CollisionMap`, `ActorEntity`, `SceneProjector`),
but most **method names, parameter names, and many field names are still
obfuscated** (`method3493`, `i_6_`, `anInt4437`, etc.), companion object
methods are often unrelated to the class and method bodies are frequently
full of dead/opaque-predicate branches left over from the original
obfuscator. The goal of this pass is *not* to rewrite code — it is to
**recommend** better names and record them in a CSV per source file, so a
future pass can apply the renames safely (e.g. with a Kotlin-aware
find/replace or IDE refactor).

## Scope

- 853 source files total (`src/commonMain/kotlin`, `src/jvmMain/kotlin`,
  `src/webMain/kotlin` — webMain is currently empty).
- All packages in scope, including vendored ports (`jagtheora`, `jaclib`,
  `jagdx`, `jaggl`, `direct/sound`) per user decision — these still get
  best-effort naming even though they mirror external C libraries.
- Split into **86 batches of ~10 files each**, grouped by source set +
  package + filename so related classes land in the same batch (e.g. all
  `Abstract*` classes together, all `jagtheora/ogg/*` together).

## Tracking

- `refactor-notes/progress.csv` — master manifest. One row per file:
  `batch, sourceset, package, filename, src_path, csv_output, status`.
  `status` is one of `pending`, `in_progress`, `done`.
- Update this file's `status` column as batches are completed (whole batch at
  a time is fine).
- Per-file CSVs live under `refactor-notes/<sourceset>/<package>/<Class>.csv`,
  mirroring `src/<sourceset>/kotlin/<package>/<Class>.kt`.

## Per-file CSV schema

One row per method in the class (including companion object / static
methods). Columns:

| column | meaning |
|---|---|
| `current_name` | exact current method name (as declared) |
| `recommended_name` | proposed new name, camelCase, verb-first for actions (`calculateDistance`, `isTileBlocked`), `get`/`set`/`is`/`has` prefixes only where idiomatic |
| `current_params` | current parameter list as declared, e.g. `i: Int, i_6_: Int, bool: Boolean` |
| `recommended_params` | proposed parameter names in the same order, e.g. `x: Int, z: Int, isWide: Boolean` |
| `confidence` | `high` / `medium` / `low` — how sure the analysis is |
| `notes` | what the method does, key evidence used (call sites, field names touched, bit-flag meanings, math patterns), and anything suspicious (e.g. "this branch looks like a dead opaque-predicate, never true at call sites") |

## Methodology for each file

1. Read the whole file.
2. For each method:
   - If it's a trivial getter/setter/simple delegation, name it directly.
   - If it's non-obvious (bit manipulation, math, control flow, multiple
     unrelated branches selected by magic-number params), **grep its usages**
     across the repo (`grep -rn "\.methodName(\|methodName("`) to see what
     values callers actually pass and how the result is used — obfuscated
     RS2 code often reuses one parameter purely as a decoy/opaque-predicate
     check (e.g. `if (i_5_ != -6496) method3494(...)` recursing into itself —
     these decoy params should be noted, not over-interpreted).
   - Use field names/usages in the same class (even if obfuscated, e.g.
     `anIntArrayArray4438` used as a 2D collision-flag grid) plus companion
     object statics for context.
   - Cross-reference class name and surrounding methods — a method's
     neighbors in the same class are usually related (e.g. in `CollisionMap`,
     several methods that set/clear specific bits in `anIntArrayArray4438`
     are almost certainly `flagTile`/`unflagTile`/`isTileBlocked` variants).
3. Record best-effort names even under uncertainty — mark `confidence: low`
   and explain the uncertainty in `notes` rather than skipping the row.
4. Never rename anything in the actual source files during this pass — CSV
   only. No code edits.

## Batch dispatch

Batches are assigned to subagents a handful at a time. Each agent:
1. Reads its assigned rows from `refactor-notes/progress.csv`.
2. Produces one CSV per file at the `csv_output` path (create parent dirs if
   missing — they already exist from the initial scaffold, but subpackages
   discovered later may need `mkdir -p`).
3. Updates `status` to `done` for its rows in `progress.csv` when finished.

## Status

See `refactor-notes/progress.csv` for live status. 260/853 files done
(batches 1-26): batches 1-6 (60 files, commonMain `Abstract*`/early-alphabet
classes), batches 7-16 (100 files, remaining commonMain alphabet tail
through `V*` and jvmMain `Abstract*` through `Camera*`), and batches 17-26
(100 files, jvmMain `Cell*` through `Font*`, including the three largest
files in the repo: `Client.kt` 5381 lines, `ChatCommandProcessor.kt` 5486
lines, `DisplaySettingsConfig.kt` 5541 lines). Batches 27-86 (593 files)
remain pending.

Notes for the next pass:
- Several jvmMain "`*Statics`" companion files turned out to hold content
  unrelated to their paired commonMain class (decompiler merged unrelated
  statics into the wrong file) — flagged per-file in notes rather than
  forced into a false pairing. This "decompiler-merged wrong content"
  pattern is very common in jvmMain companion objects generally (not just
  `*Statics` files) — expect it in most remaining jvmMain batches.
- A number of classes are legitimately empty (marker interfaces/pure field
  bags) and have header-only CSVs — not errors.
- `ChatCommandProcessor.kt` is misleadingly named — it's actually the
  client's CS2 (ClientScript2) bytecode VM/interpreter, not a chat-command
  dispatcher (that logic lives in `ConfigArchiveLoader.kt`).
- Recurring low-confidence spots worth a second look later: `TerrainTile.kt`
  (`U`/`method3978` tile-baking), `AbstractRenderPass.kt` (abstract methods
  with no live subclass to confirm), `ActorEntity.kt` companion rasterizer
  methods, `BoundingBoxNode.kt` unresolved data tables, `Client.kt`'s
  `method3201` (~1730-line packet dispatcher, only partially traced) and
  `method107`/`method2991` (large dense dispatch/tick methods), and
  `CompositeNpcModelBuilder.method1226` (21-param model builder, single
  call site).
