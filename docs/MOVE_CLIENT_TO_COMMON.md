# Plan: Move `Client.kt` into `commonMain`

**Verified against source on 2026-06-14.** Supersedes Step 1 of Phase 4 in `KMP_MIGRATION.md`,
which is stale: the three AWT touchpoints it named are already seamed and the
`java.awt.Toolkit`/`Frame`/`Canvas` imports are already gone. The real remaining blockers are
different (Class305 AWT fields + the `method81` reflection block).

`Client.kt` lives at `src/jvmMain/kotlin/Client.kt` (~2,700 LOC). Its only platform-bound surface
today is:

| Site | Code | Status |
|---|---|---|
| L538 | `import java.util.*` | only live use is `Vector` in `method81` |
| L628 | `WindowShells.instance?.forceToolkitInit()` | **already seamed** (common) |
| L682-area clipboard | via `SystemClipboard` | **already seamed** (common) |
| L675-676 | `Class305.aCanvas3869` passed to input factories | **blocker** — AWT-typed field |
| L1699 | `Class305.aCanvas3869 == null` guard | **blocker** — AWT-typed field |
| L1700 | `WindowShells.instance?.tryAdoptHostCanvas()` | **already seamed** (common) |
| L1830-1865 | `method81` native-lib reflection | **blocker** — `ClassLoader`/`Vector`/`Client::class.java` |
| L1883 | `getPulseComponent()` returns `Class305.aDisplayTarget3869` | **blocker** — `AwtDisplayTarget` typed |
| L1911 | `aClass5189: Class<*>?` companion field | **blocker** — JVM `Class` token |

Each step keeps `compileKotlinJvm` **and** `compileKotlinJs` green, then gradle build + commit
(build via the `void-client [compileKotlinJvm]` / `[compileKotlinJs]` run configs; commit from the
IntelliJ terminal, not bash).

---

## Step 1 — De-AWT the `Class305` companion fields

`Class305` (jvmMain, imports `java.awt.Canvas`) holds the two fields Client touches:

```kotlin
var aCanvas3869: Canvas? = null
var aDisplayTarget3869: AwtDisplayTarget? = null
```

`aDisplayTarget3869` is already conceptually a `DisplayTarget` (the AWT one); retype it to the
common `DisplayTarget` interface so Client's `getPulseComponent()` returns the common type:

```kotlin
var aDisplayTarget3869: DisplayTarget? = null   // was AwtDisplayTarget?
```

The `aCanvas3869: Canvas?` field is consumed by Client at L675-676 (passed into
`Class348_Sub3.method2743(...)` and `method2941(...)`, the keyboard/mouse input factories) and as a
null-guard at L1699. Two options, pick by checking what `method2743`/`method2941` actually need:

- **(a) Preferred** — those input factories already take an AWT `Canvas` only because the AWT
  `InputSource` path needs it. Route them through the existing `WindowShells.instance`/
  `DisplayTarget` seam (the input bases `Class346`/`Class373` are already common per the
  InputSource seam memory). Replace `Class305.aCanvas3869` arguments with the common display
  target / a `WindowShells` accessor. The L1699 guard becomes
  `WindowShells.instance?.currentDisplayTarget == null` (or an equivalent common predicate).
- **(b) Fallback** — if `method2743`/`method2941` genuinely need the AWT canvas, keep
  `aCanvas3869` in a jvm-only `Class305Statics` and have the JVM input factory read it there, while
  Client only ever references the common display target. (Same "split the companion into a
  `*Statics`" move used for Class221/Class341/Class238/ha.)

Whichever path: `Class305.kt` keeps `import java.awt.Canvas` only if (b); under (a) it can drop it
and `Class305` itself becomes a move candidate later. Do **not** move Class305 in this step — only
retype `aDisplayTarget3869` and relocate/replace `aCanvas3869` so **Client** stops naming AWT types.

Rebuild JVM (oracle). Commit.

## Step 2 — Replace the `method81` native-library reflection with a seam

`method81` (L1813-1880) builds a server-bound diagnostic string; the inner block at L1830-1865 is
the only genuinely JVM-only part. It reflects into `ClassLoader`'s private `nativeLibraries`
`Vector`, finds the entry whose `name` contains `sw3d.dll`, and appends its `handle` as hex
(`"|16)" + Long.toHexString(...)`). This is the D3D anti-cheat probe and is meaningless off-JVM.

Introduce a common seam (mirrors the `Class348_Sub40_Sub1` `Class.forName` anti-cheat note in §2 of
the migration doc — both are server-driven reflection that stubs to "unsupported" off-JVM):

```kotlin
// commonMain — NativeLibraryProbe.kt
interface NativeLibraryProbe { fun hexHandleFor(substr: String): String? }
object NativeLibraryProbes { var instance: NativeLibraryProbe? = null }
```

- **JVM actual** (`JvmNativeLibraryProbe`, jvmMain): move the L1830-1865 reflection body verbatim
  here, returning the hex string or `null`. Install it in the JVM bootstrap (alongside the other
  `Loader.startClient()` / `ClientBootstrap.installCommon` installs).
- **JS**: leave `NativeLibraryProbes.instance` null → the call returns `null` → no `16)` segment,
  which is correct (there is no `sw3d.dll`).

In `method81`, replace the whole `try { ... ClassLoader ... }` block with:

```kotlin
if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 2) {
    NativeLibraryProbes.instance?.hexHandleFor("sw3d.dll")?.let { string += "|16)$it" }
}
```

This removes the `ClassLoader`, `Vector`, `Client::class.java`, and `java.lang.Long` uses from
Client. Rebuild JVM, confirm the diagnostic string is byte-identical when `sw3d.dll` is loaded
(D3D path) — this is on the anti-cheat critical path, so verify against the oracle. Commit.

## Step 3 — Remove the `aClass5189: Class<*>?` companion field

`aClass5189` (L1911) exists only to cache `Client::class.java` for the Step-2 reflection
(`field.get(... aClass5189 ...)`). Once Step 2 moves that reflection into `JvmNativeLibraryProbe`,
`aClass5189` is dead in Client — delete it. (If the probe still needs the classloader, it can use
its own `JvmNativeLibraryProbe::class.java.classLoader` on the JVM side.)

Grep the project for any other `aClass5189` reader before deleting. Rebuild JVM. Commit.

## Step 4 — Drop the `java.util.*` import and audit residual JDK references

With `Vector` gone (Step 2), the only thing `import java.util.*` provided is unused. Confirm
`CalendarShim.local()` (L1614) covers the calendar use and that the local `gregoriancalendar`
binding doesn't need a `java.util.Calendar` type annotation; if it does, retype it to the
`CalendarShim` return type.

Then do a final sweep on Client for any `java.`/`javax.`/`Class<`/`::class.java`/`Thread`/
`System.` reference (`grep -nE 'java\.|javax\.|::class\.java|Class<|Thread\.|System\.'`). Resolve
each through an existing common seam (Clock/SystemProperties/RuntimeInfo/etc.). Remove
`import java.util.*`. Rebuild **both** targets. Commit.

## Step 5 — Move `Client.kt` from `jvmMain` to `commonMain`

With zero platform references remaining, move the file:

`src/jvmMain/kotlin/Client.kt` → `src/commonMain/kotlin/Client.kt`

(Use `mcp__intellij__rename_refactoring` / an IDE move, or git mv from the IntelliJ terminal — **not**
sed/Python, per the CRLF rule.) Then:

- Verify every type Client names now resolves in `commonMain`: `Canvas_Sub1` (L2-3 companion
  imports), `Class182`/`Class258_Sub4`/`Class348_Sub3`/`Class316`/`Class305`/`Class93`/`Class272`
  /`za_Sub2`/`Class90`/etc. Any that are still jvmMain-only become **new blockers** — expect a
  short tail of one-member companion seams (the pattern from every prior phase: seam the *member*,
  not the whole class). Triage with `compileKotlinJvm` errors as the worklist.
- Confirm `getPulseComponent(): DisplayTarget?` (now returning the common `Class305.aDisplayTarget3869`
  from Step 1) and the `GameApplet`/`AppletWindowCallbacks` overrides still satisfy the
  (already-common) `Applet_Sub1` contract.

Rebuild **both** `compileKotlinJvm` and `compileKotlinJs`. Commit.

## Step 6 — Verification

- `compileKotlinJvm` clean **and** `compileKotlinJs` clean.
- Run the JVM oracle to a login screen; confirm no behavioural regression (especially the
  `method81` diagnostic string and the input-factory wiring from Step 1).
- Grep `src/commonMain/kotlin/Client.kt` for `java.`/`javax.`/`::class.java` → expect zero.
- Update `KMP_MIGRATION.md` Phase 4 Step 1 to reflect that Client is now common, and move the
  file counts (commonMain +1, jvmMain −1).

---

### Risk notes

- **Biggest unknown is Step 5's type tail.** The migration doc claims Client is "~99% common-ready,"
  but that was written before the Class305/`method81`/`aClass5189` blockers were catalogued. The
  honest expectation is a handful of additional one-member companion seams surfaced by the compiler
  on the move — budget for them rather than assuming a clean lift.
- **`method81` is anti-cheat-sensitive.** The server compares this string; verify the JVM output is
  identical post-refactor (Step 2). On JS the missing `16)` segment is expected and acceptable
  (no D3D there).
- Keep each step as its own commit so a bad type-tail discovery in Step 5 doesn't force re-doing
  Steps 1-4.
