# Web client performance

The browser build is CPU-bound in the draw path. On a crowded scene with the OpenGL backend,
measured 2026-09-19:

```
tick = 0.5ms     draw = 25.5ms
```

Game logic is free. Everything that matters happens between the tick and the present.

## What this branch changes

All of it is in `src/jsMain/`. Nothing in `commonMain` or `jvmMain` is touched, so the desktop
client is unaffected by construction rather than by argument.

### Redundant GL state filtering — measured at -3.3ms, -11%

`OpenGlRenderer` was deliberately stripped of its own GL redundancy caches — see the "Always
re-issue rather than eliding" comments on `method3728` and `method3729`. That is correct for a
native driver, which dedupes redundant state almost for free. In WebGL every call is a JS to browser
boundary crossing with validation, and nothing had taken over the job. The shim does now.

- `jaggl/GlState.js.kt` — the dirty flags are value-based. `glEnable(GL_LIGHTING)` when lighting is
  already on no longer marks the light block dirty, so the 42-uniform re-upload that ran once per
  model and per terrain chunk is gone. Same for texenv, which `method3729` re-sent twice per call
  and three times per glyph. Also: the modelview uniform is version-gated (it was the only matrix
  uploaded unconditionally), `useProgram` is mirrored, and `bindSampler` no longer rebinds the
  reserved 3D/cube units on every draw.
- `jaggl/OpenGL.js.kt` — a mirror over the non-programmable state: blend, depth, cull, colour mask,
  scissor, stencil, and the capability enables. `glBindTexture` and `glActiveTexture` skip redundant
  binds; `glDeleteTextures` clears the mirrors, since GL unbinds a deleted texture everywhere.

**The invariant, learned the hard way.** A mirror may only ever hold a *fact* about GL. Every
mirrored boolean is a tri-state (`UNKNOWN`/`OFF`/`ON`) and every reset means *unknown*, never a
default. An earlier version of this code reset to definite values once a frame in `presentOpaque`,
which meant the next `glDisable(GL_BLEND)` was elided against a GL that still had blending on, and
the next `glDepthMask(true)` against one that still had depth writes off — a washed-out scene with
geometry in the wrong depth order. If the shim cannot know a value, it must say so and ask.

### Immediate-mode batching — measured at -0.7ms, -3%

`jaggl/ImmediateModeEmulator.js.kt` defers its flush. `glEnd()` no longer draws; the next `glBegin`
appends to the same batch when the mode is the same and concatenable, so a run of same-state
primitives goes out as one draw. Only independent-primitive modes concatenate — strips, fans and
polygons define triangles by adjacency, so joining two runs would weld them together.

Deferral is only correct if the batch is drawn *before* anything changes the state it was recorded
under. Draining therefore happens at three kinds of point, two of them structural:

1. **The `gl` accessor** in `OpenGL.js.kt`. Every real WebGL call in that file reads the context
   through it, so anything that reaches the driver drains the batch first.
2. **The value-gated setters in `GlState`**, on the change path only. This covers shim-side state
   that never reaches WebGL on its own.
3. **Explicit `flushBatch()` calls** for shim state with no cheap redundancy check: the matrix
   stack, the ARB program binding and its local parameters, fog, `glAlphaFunc`, and the display-list
   boundaries. Each is commented at its call site.

Note the rule in `exec`: it deliberately does **not** flush. Flushing there was tried and is wrong in
practice — the per-quad preamble in `GlSpriteRenderer` is a run of state calls that are all no-ops
the second time round, so a blanket flush fires on every quad without a single GL call having been
issued, and the batching buys nothing.

Interface text does not batch, and that is correct: `GlFontDisplayList` brackets every glyph with
`glTranslatef` … `glLoadIdentity`, and a modelview change is a real uniform change.

### Three defects fixed along the way

Not performance claims — bugs.

- `awt/EventQueue.js.kt` — `peekEvent` now consumes. Nothing on JS ever dispatched what `postEvent`
  stored, so the field stayed set forever once anything had been posted, and
  `WorldMapPolygonIconLabel.method3578` ran its full 50-iteration drain at the end of *every* game
  tick and every audio-mixer tick.
- `jaclib/memory/heap/NativeHeap.js.kt` — heap slots are freed through a `FinalizationRegistry`.
  `NativeHeapBuffer.finalize()` does this on the JVM and finalizers never run on JS, so every buffer
  `OpenGlTerrainTile` allocated per textured terrain batch leaked for the life of the session.
- `SoftRef.js.kt` — `WeakRef` plus a bounded ring of recently-touched referents. It held its
  referent strongly and forever, which made every cache in the client unbounded:
  `SizeBoundedSoftCache` demotes entries into soft references once its byte budget is exceeded, so
  on JS nothing was ever released.

## Tried and rejected

Recorded so nobody re-derives them.

- **A VAO cache for the client-array configuration.** Measured at **exactly zero** while removing
  ~30,000 WebGL calls a frame, and it carries the nastiest invariant in the shim: a VAO captures the
  `ELEMENT_ARRAY_BUFFER` binding, so every path that switches one must re-apply the index buffer or
  a draw silently reads the wrong indices. One caveat for the record — that measurement was taken
  while every animated model was given a fresh vertex buffer each frame, which made the cache miss
  by construction. If attribute setup ever looks expensive, this is the first thing to re-test.
- **`requestAnimationFrame` frame pacing**, with a tick catch-up cap and a time-budgeted map-archive
  decode loop. Never measured. Moving to rAF also *lowers* the FPS reading — vsync quantises the
  draw rate to divisors of the refresh rate, so 25ms of work reads as 30fps where the `setTimeout`
  chain showed ~40.
- **Round 2**: serving `presentOpaque` from the mirror instead of three `getParameter` and an
  `isEnabled` per frame; reusing model vertex buffers instead of building a new GL buffer per
  rebuild; releasing GL buffers on collect. It produced widespread visual bugs. Two causes were
  found and fixed, but none of it was ever shown to help. The **findings** are worth keeping:
  `OpenGlModel.method688`'s non-dynamic branch really does build a brand-new GL buffer object per
  rebuild, a rotating model really is rebuilt every frame, and `GlVertexBufferBase.finalize()` —
  the only caller of the only route to `glDeleteBuffersARB` — really is dead code on JS, so no
  vertex or index buffer is ever deleted on the web target.
- **Unmeasured cleanups** dropped for lack of evidence, each fine on its own terms and each worth
  re-landing with a number attached: `MatrixStack` level pooling, dense `HandleTable` and
  `DisplayList` storage, a `DataView`-based float write path, and a fused `ImageData` conversion in
  the software present path.

The archive of all of it is the `fix/performance-improvements` branch.

## Where the remaining time goes

From the same measurement session:

- **~2480 draw calls per frame at roughly 6 microseconds each** — about 15ms of the 25ms. Per-call
  overhead is now filtered; what is left is the cost of issuing that many draws. Cutting it means
  fewer draws: instancing repeated scenery, a UI sprite atlas, atlasing the up-to-169-per-plane
  terrain shadow chunks, or coarsening the terrain material key at `OpenGlTerrainTile.kt:617`.
  Terrain is **already** merged by material, so that is not a remaining win.
- **~10ms that is not draw submission at all**, and has never been profiled. That is the largest
  unexamined part of the frame. Start there, with a Chrome DevTools CPU profile read bottom-up by
  self time — not with more counters.

## Measuring

There is no profiler on this branch; it was tooling, not product. To measure, restore it from the
archive into the working tree, take the reading, and throw it away:

```sh
git checkout fix/performance-improvements -- \
  src/commonMain/kotlin/FrameProfiler.kt src/jsMain/kotlin/FrameProfiler.js.kt \
  src/jvmMain/kotlin/FrameProfiler.jvm.kt src/jsMain/kotlin/jaggl/GlCallStats.js.kt
# ... build, measure via window.voidPerf, then:
git checkout . && git clean -f src
```

Two things that will mislead you if you skip them:

- **Measure the production bundle.** The development bundle is unminified with every module
  `eval`-wrapped; V8 optimises it far worse and the numbers do not transfer.
- **Measure frame time in milliseconds, not FPS.** The client's own counter is a 32-frame mean, which
  hides exactly the tail that stutter lives in, and under vsync the draw rate is quantised — a frame
  time falling from 25ms to 18ms shows up as no change at all.
