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

See `refactor-notes/progress.csv` for live status. **853/853 files done —
all 86 batches complete.** Batches 1-6 (60 files, commonMain
`Abstract*`/early-alphabet classes), batches 7-16 (100 files, remaining
commonMain alphabet tail through `V*` and jvmMain `Abstract*` through
`Camera*`), batches 17-26 (100 files, jvmMain `Cell*` through `Font*`,
including the three largest files in the repo: `Client.kt` 5381 lines,
`ChatCommandProcessor.kt` 5486 lines, `DisplaySettingsConfig.kt` 5541
lines), batches 27-46 (200 files, jvmMain `Font*`/`G*` through `N*`),
batches 47-56 (100 files, jvmMain `Native*` through `RenderConfigFactory.kt`),
batches 57-66 (100 files, jvmMain `RenderListTextureNode.kt` through
`SpriteDefinition.kt`, i.e. `Render*`/`Rsa*`/`Scene*`/`Script*`/`Shader*`/
`Skeletal*`/`Socket*`/`Software*`/`Sound*`/`Sprite*`), batches 67-76 (100
files, jvmMain `SpriteImage.kt` through `WorldMapScene.kt`, i.e. remaining
`Sprite*`/`Terrain*`/`Texture*`/`Tile*`/`Timed*`/`Vertex*`/`Vorbis*`/
`Wall*`/`Water*`/`Widget*`/`WorldMap*`), and batches 77-86 (100 files, the
vendored `jagtheora`/`jaclib`/`jagdx`/`jaggl`/`direct/sound` ports) are all
done. Every `csv_output` path in `progress.csv` exists and is non-empty.

This completes the analysis pass. The next step (out of scope here, per the
"never rename in source files" rule above) is a future automated find/replace
or IDE-refactor pass to apply the recommended names from the per-file CSVs.

Notes for the next pass:
- Several jvmMain "`*Statics`" companion files turned out to hold content
  unrelated to their paired commonMain class (decompiler merged unrelated
  statics into the wrong file) — flagged per-file in notes rather than
  forced into a false pairing. This "decompiler-merged wrong content"
  pattern is very common in jvmMain companion objects generally (not just
  `*Statics` files, and not just companions — batches 51-56 found several
  cases where a class's *instance* methods are unrelated to its name, e.g.
  `ParticleEmitterNode.kt`'s instance methods are actually an audio/sound
  channel node, and `ParticleSystemRenderer.kt`'s instance methods are a
  minimap hint-arrow/compass overlay renderer) — expect it in most
  remaining jvmMain batches.
- A number of classes are legitimately empty (marker interfaces/pure field
  bags) and have header-only CSVs — not errors (e.g. `Rectangle.kt` in
  batch 56).
- `ChatCommandProcessor.kt` is misleadingly named — it's actually the
  client's CS2 (ClientScript2) bytecode VM/interpreter, not a chat-command
  dispatcher (that logic lives in `ConfigArchiveLoader.kt`).
- For OpenGL/Direct3D "twin" implementation classes (`OpenGlRenderer.kt` vs
  `NativeRenderer.kt`, `OpenGlModel.kt` vs `SoftwareModel`/`AbstractModel`),
  cross-referencing the already-documented sibling/abstract-parent CSV lets
  most methods be named with high confidence by matching shared abstract
  method signatures rather than re-deriving from scratch — reuse this
  technique for remaining GL/D3D twins.
- Confirmed dead/opaque-predicate code: `NodeDequeStatics.method1991`
  (self-recursive tail call gated by a bool every real call site always
  passes as `false`); `ParticleDetailOptionState.method1716` has
  `if (anInt3138 < 0 && anInt3138 > 4)` — logically impossible, clamp never
  runs, possibly a mangled `||`.
- Recurring low-confidence spots worth a second look later: `TerrainTile.kt`
  (`U`/`method3978` tile-baking), `AbstractRenderPass.kt` (abstract methods
  with no live subclass to confirm), `ActorEntity.kt` companion rasterizer
  methods, `BoundingBoxNode.kt` unresolved data tables, `Client.kt`'s
  `method3201` (~1730-line packet dispatcher, only partially traced) and
  `method107`/`method2991` (large dense dispatch/tick methods),
  `CompositeNpcModelBuilder.method1226` (21-param model builder, single
  call site — also echoed by `Player.method2459`, a similarly composite
  model builder), `OpenGlModel.kt`'s private GL geometry-cache helpers
  (`method679/683/686/688/691`, inferred from call-site shape only), and
  `ProjectionCameraTransform.kt`'s 12-float 3x3 rotation+translation matrix
  (axis identity for the incremental-rotate/reset methods inferred
  structurally, not independently confirmed).
- Batches 57-66 findings: the "decompiler-merged wrong content" pattern now
  also shows up on whole top-level `object`s, not just companions/instance
  methods (`SoundCacheState.kt` is almost entirely unrelated widget/hint-icon
  code). `SoftwareRenderer.kt` vs. the already-documented `OpenGlRenderer.kt`
  (same abstract `Renderer` base) diverge behaviorally on several shared
  method slots (`method3628`, `L`, `ra`, `b`, `method3631`, `method3663`) —
  worth reconciling in a follow-up pass rather than trusting either csv's
  name blindly. Two likely genuine bugs (not obfuscation artifacts) flagged:
  `SimpleBinaryOptionState`'s explicit-value constructor drops its `i` param
  when calling `super(...)`, unlike every sibling `*OptionState` class; and
  `SoftwareFontPalette.method2592`'s row-advance line doubles `srcIndex`
  instead of adding `srcRowSkip`, unlike the correct analogous line in
  `SoftwareFontPlain.method2587`. More confirmed dead self-recursive decoys:
  `SoundEnvelope.method1544`, `SpriteArchiveLoader.method311`,
  `SceneTileBounds`'s single method, and `SpotAnimEntity.method2511` (whose
  dead branch would NPE if ever taken).
- Batches 67-76 findings: the class-name/content mismatch pattern kept
  showing up hard — `SpriteArchiveLoader.kt` and `SpriteStore.kt` are audio-
  sample/widget-text-config loaders despite their names; `VideoStreamDecoder.kt`
  contains no video decoding (it's a terrain lightmap/heightmap streaming
  builder); `VideoAdChecker.kt`'s real method is a terrain shading-index
  packer; `WidgetDefinition.kt` is more likely a model/kit-part definition
  for character customization than a UI widget record; `VorbisCommentHeader.kt`
  actually decodes the libvorbis *mapping* header, not the comment header;
  `TrackedGroundDecor.kt` (despite extending `GroundDecorEntity`) implements
  ballistic-projectile motion and is almost certainly the real `Projectile`
  class. `TerrainTileShape.kt` and its GL2/GL3 shadow-builder siblings turned
  out to be a point-light/shadow-caster abstraction, not tile geometry.
  Likely genuine bugs (not obfuscation artifacts): `TextureMipDescriptor.method3462`'s
  decoy branch would NPE if ever triggered (passes null arrays into an
  array-dereferencing sort). One naming inconsistency flagged between two
  already-completed CSVs: `SceneObjectEntity.csv` calls a shared virtual slot
  `renderWithTarget` while `GroundDecorSceneEntity.csv`'s implementation shows
  it's actually `mergeNormals` — needs reconciliation in a later pass.
  `WorldMapAreaLabel.method3570`'s `bool=true` branch was checked against all
  15 call sites in the repo — every one passes `false` (confirmed dead).
