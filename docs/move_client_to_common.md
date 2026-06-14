# Plan v2: Move `Client.kt` into `commonMain` — the tractable version

**Verified against source on 2026-06-14.** This supersedes `move_client_to_common.md`, whose
Steps 1–4 are **done** (see commits `e098ef1`, `8925183`, `66087c2`) but whose Step 5 ("just move
the file") was attempted and is the cause of the current red build.

## The actual situation (measured, not assumed)

`Client.kt` is **already physically in `src/commonMain/kotlin/`** — but it does **not compile**.
`get_file_problems` reports **2,955 errors / 1,309 distinct unresolved references**. Client's own
platform surface really is clean (the old plan was right about that); the problem is **transitive**:

| Fact | Value |
|---|---|
| Distinct top-level symbols Client imports | 462 jvm + 8 common |
| Of Client's *direct* jvm deps: hard-platform leaves | **~101** |
| Of Client's *direct* jvm deps: platform-clean game logic | **~360** |
| jvm `.kt` files total / common / js | 826 / 159 / 38 |

Client is a **god-object orchestrator**: it names ~460 classes, and those classes name each other
densely (the "graph is densely coupled" warning from the Phase-2 memory). Kotlin enforces source-set
boundaries, so **commonMain cannot reference a single jvmMain symbol**. Therefore Client cannot
compile in commonMain until its *entire platform-clean transitive closure* is also in commonMain and
every edge that reaches a genuinely platform-bound class crosses a **seam**.

**This is why "move Client" is intractable as one step — and why the unit of work must change.**
Do not try to move Client. Move the closure underneath it, leaf-first, and Client falls out for free
at the end.

## Key realisation: the irreducible jvm core is small and already abstracted

Categorising Client's ~101 hard-platform direct leaves by *what* binds them:

| Cluster | ~count | Binding | Disposition |
|---|---|---|---|
| **Hardware renderer** — `ha_Sub2`, `ha_Sub3`, `Class14_Sub*`, `Class286_Sub*`, `Class258_Sub*`, `Class367_Sub*`, `Class377`, `za_Sub2`, `s_Sub2`, … | ~45 | `jaggl`/`jagdx` | **Stays jvm.** Client only reaches these through the **already-abstract `ha` toolkit** + `haStatics` dispatcher. Cut this edge and 45 leaves vanish from the closure. |
| **Video** — `Class348_Sub23[_Sub*]`, `Class55` | ~6 | `jagtheora` | **Stays jvm** (migration doc §2: "drop jagtheora"). Seam or stub the login-video entry point. |
| **AWT window/font/input** — `Loader`, `Canvas_Sub1`, `Class199`/`294` (fonts), `Class346_Sub1`/`373_Sub2` (input), `Class348_Sub31` (surface), `Class305Statics`/`93Statics`/`haStatics` | ~30 | `java.awt`/`javax.swing` | **Mostly already seamed** (GameSurface, GlyphRasterizer, InputSource, WindowShell, SystemClipboard). Remaining ones get the same treatment. |
| **`java.util`-only** — `Class66`, `Class348_Sub4`, `Class348_Sub49_Sub1`, `Player`, `ha_Sub3` | ~12 | `java.util.*` | **Not real leaves.** Mechanical swap to kotlin stdlib collections → they become movable. |
| **`java.io`/`java.net` stream & socket plumbing** — `InputStream_Sub1/2`, `OutputStream_Sub1/2`, `Class59`, `Class82`, `Class169`, `Class272`, `Class297`, `Class327` | ~15 | `java.io`/`java.net` | Route through existing `CacheStore`/`HttpFetch`/`Class238`/`Sleeper` seams; a few keep jvm impls behind those interfaces. |

So the **genuinely irreducible jvm residue is the ~50-class jaggl/jagtheora hardware+video cluster**,
plus the AWT window shell (`Loader` and friends) — and Client already talks to all of it through
abstractions (`ha`, `WindowShell`, the service interfaces). The remaining ~360 "clean" classes plus
the ~12 `java.util`-only and the stream plumbing are all **movable** once their own sub-dependencies
move. That is a big bulk job, but it is **mechanical and compiler-driven**, not architectural.

---

## Strategy: leaf-first waves, compiler as the worklist, Client moves last

Bottom-up, never top-down. At every moment the JVM build stays green (it is the oracle). A class is
**ready to move** when *all* the symbols it references already resolve in `commonMain` (or are
seamed). The Kotlin compiler tells you exactly which those are — that is the worklist generator.

### Step 0 — Un-break the build: move Client back to jvmMain (temporarily)

The current tree is red, which makes the compiler useless as an oracle. **Revert the premature
lift**: move `src/commonMain/kotlin/Client.kt` → `src/jvmMain/kotlin/Client.kt` (git mv from the
IntelliJ terminal — not sed/Python, per the CRLF rule). Also review the dirty working tree
(`git status` shows ~dozens of modified `Class*.kt`) — decide per file whether each modification is a
half-finished move to keep or revert; commit a known-green baseline before doing anything else.

Confirm `compileKotlinJvm` **and** `compileKotlinJs` are both green. This is the baseline every
subsequent wave must preserve. Commit.

### Step 1 — Seal the seams Client needs so its frontier is finite

Before mass-moving, make sure every *hard-leaf cluster* Client touches is reachable through a
commonMain abstraction, so the closure has a clean boundary. Most exist already; close the gaps:

1. **Hardware renderer (`ha_Sub2`/`Sub3` + jaggl cluster).** Confirm Client never names a concrete
   GL class — only `ha` (abstract, already common) and `haStatics`. Per the Phase-4 memory, the
   software-toolkit construction was to be extracted into a common `SoftwareToolkitFactory` with the
   GL/D3D branches left jvm-only. Finish that: Client must obtain its toolkit through a common
   factory/`WindowShells` accessor, with **zero** direct `ha_Sub2`/`Class377`/`Class14_Sub*`
   references. (Grep Client for each name in the "Hardware renderer" row above → must be zero.)
2. **Video (`jagtheora`).** Find Client's login-video touchpoint (`Class348_Sub23` family). Put it
   behind a `LoginVideo`/`CutscenePlayer` interface in commonMain with a no-op default; JVM actual
   keeps the jagtheora impl, JS/native get the no-op. (Same shape as `NativeLibraryProbe`.)
3. **AWT window/input/font/surface.** Verify the already-built seams (`GameSurface`,
   `GlyphRasterizer`/`GlyphRasterizers.factory`, `InputSource`/`Class346`/`Class373`, `WindowShell`,
   `SystemClipboard`) cover every AWT site Client reaches. The remaining named AWT leaves
   (`Class262Statics`, `Class305Statics`, `Class348_Sub5Statics`, `Class93Statics`,
   `Class369_Sub3_Sub1Statics`) follow the established **split-the-companion-into-`*Statics`** move —
   seam the *member* Client uses, not the whole class.

Deliverable of Step 1: a written list (in this doc, appendix) of **every hard-leaf edge** crossing
Client's frontier and the seam that absorbs it. After this, the movable closure is well-defined.

Rebuild both targets after each seam. Commit per seam (small commits — the Phase-3 hygiene rule).

### Step 2 — Generate the dependency-ordered move worklist

Build the move order mechanically so waves are correct by construction:

1. Snapshot the `import X.member` graph over all `.kt` (the `import ClassName` default-package form).
2. Mark every class `commonMain` / `jvmMain` / `jsMain` and flag the **hard leaves** from Step 1
   (`^import (java|javax|jaggl|jagdx|jagtheora|com.ms)` or `external fun`) plus their `*Statics`.
3. Compute, restricted to jvmMain non-leaf classes in Client's transitive closure, a topological
   order. A class's **wave number** = longest dependency path to a class that is already common or a
   seam. Wave 1 = classes whose deps are *all* already-common/seamed; wave 2 depends only on
   wave ≤1; etc.
4. Detect cycles (the graph has them — Phase-2 memory: "densely coupled"). Each strongly-connected
   component **moves as a single unit** (you cannot move half a cycle and keep JVM green). Output
   SCCs as grouped move-units.

The output is an ordered list of move-units (singletons + SCC clusters), each annotated with its
size and the seams it still needs. *This script is the plan's engine* — keep it in `tools/` and
re-run it after every wave to regenerate the next ready set. (Mind that the bash mount over the repo
is flaky for bulk reads — drive the graph build from the IntelliJ side or a one-shot copy, and
validate counts against `compileKotlinJvm` errors, which are the real oracle.)

### Step 3 — Move in waves (the bulk of the work)

Repeat until the closure is empty:

1. Take the next ready move-unit(s) from the Step-2 worklist (a wave can be many singletons + a few
   SCC clusters that are all simultaneously ready).
2. `git mv` each file `jvmMain/kotlin/ → commonMain/kotlin/` (IDE move or terminal git mv).
3. Build `compileKotlinJvm`. New unresolved errors = symbols the moved unit needs that aren't common
   yet → either (a) they're a missed dependency (add to a later wave — the topo order should prevent
   this), or (b) they're a hard-leaf member that needs a *new* `*Statics`/interface seam (do it now,
   the leaf-seam pattern). Resolve, rebuild.
4. Build `compileKotlinJs`. JS unresolved = a `ClassNNNStatics` lacking a `.js.kt` actual → add the
   JS actual (usually a trivial stub/`null`, per the `Class126Statics` example). The `js` target is
   the second oracle that keeps the move honest.
5. When both targets are green, **commit the wave** (one commit per wave, so a bad wave reverts
   cleanly — Phase-3 commit hygiene). Re-run the Step-2 script for the next ready set.

Expect the early waves (leaf game-logic: math, buffers, definitions, collision, the already-Phase-2
neighbours) to be large and easy. Expect mid-graph SCC clusters to be the hard, lumpy ones — budget
for them. Track progress as "jvmMain file count down / commonMain up" each wave (start: 826 / 159).

### Step 4 — Mechanical `java.util` sweep (parallelisable with Step 3)

The ~12 `java.util`-only "leaves" (`Class66`, `Class348_Sub4`, `Class348_Sub49_Sub1`, `Player`,
`ha_Sub3`, …) are not real leaves. Replace `Hashtable`/`Vector`/`LinkedList`/`Random`/`Calendar`
with kotlin stdlib + the existing `JavaRandom`/`CalendarShim` shims (Phase-2 already did this for
37 files — same playbook). Each becomes an ordinary movable class and rejoins the Step-3 waves.

### Step 5 — Client is now trivial to move

When the Step-2 worklist is empty, every symbol Client imports resolves in commonMain or crosses a
seam. `git mv Client.kt` back to `commonMain` (it's already there conceptually — this is the lift the
old plan's Step 5 attempted, now actually safe). Build both targets. The 2,955 errors are gone
because their causes were moved/seamed in Steps 3–4, not because Client changed.

Then re-verify the three things the old plan's Step 5/6 called out: `getPulseComponent(): DisplayTarget?`
returns the common type; the `GameApplet`/`AppletWindowCallbacks` overrides still satisfy the
(common) `Applet_Sub1` contract; and `grep Client.kt -E 'java\.|javax\.|::class\.java|jaggl|jagdx'`
returns zero.

### Step 6 — Verification

- `compileKotlinJvm` **and** `compileKotlinJs` clean.
- Run the JVM oracle to the login screen — no behavioural regression (especially the `method81`
  diagnostic string from the old Step 2, and the input/toolkit wiring).
- Final grep of `commonMain/kotlin/Client.kt` for any platform token → zero.
- Update `KMP_MIGRATION.md` Phase 4 Step 1 (Client now common; file counts) and tick the waves.
- Consider a `tools/` commit of the Step-2 worklist script for the *next* god-class (this same engine
  retires `Applet_Sub1`'s remaining tail and future moves).

---

## Why this is tractable where "move Client" was not

1. **The unit of work is a dependency-ordered wave, not the 2,700-line god-object.** Each wave is
   small, compiler-validated, independently committable, and revertible.
2. **The irreducible jvm core is ~50 classes (jaggl/jagtheora) + the AWT shell**, and Client already
   reaches all of it through abstractions — so the closure has a *finite, known frontier* (Step 1)
   rather than an open-ended one.
3. **The compiler generates the worklist** (Step 2 script + `compileKotlin{Jvm,Js}` errors), so you
   never guess what's ready — no manual dependency bookkeeping across hundreds of classes.
4. **It reuses the proven Phase-2/3 playbook verbatim**: `*Statics` companion splits, expect/actual
   leaf seams, service interfaces, move-don't-copy, small commits, JVM-as-oracle. Nothing new to
   invent — only applied at scale and in the right order.

## Risk notes

- **SCC clusters are the cost driver.** A large strongly-connected component must move atomically; if
  one is, say, 40 classes wide, that's one big scary wave. The Step-2 script must surface SCC sizes
  up front so you can plan (and possibly break a cycle with an interface *before* the wave).
- **JS actuals are a per-wave tax.** Every moved `*Statics` needs a `.js.kt` actual or JS goes red.
  Most are trivial stubs, but the count adds up — keep them in the same wave commit.
- **The bash mount is flaky for bulk repo reads** (observed during analysis). Drive the graph
  tooling from IntelliJ MCP or a single verified copy, and treat `compileKotlinJvm` errors — not the
  script — as the source of truth for "what's still unresolved."
- **Don't recurse past hard leaves in the closure** — the moment the script follows an edge *into*
  `ha_Sub2`/jaggl, the closure explodes to the whole renderer. Step 1's seams are what keep the
  closure bounded; verify them before trusting any closure count.
