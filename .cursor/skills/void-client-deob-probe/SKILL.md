---
name: void-client-deob-probe
description: >-
  Runtime hypothesis logging for void-client (RS 634) deobfuscation. Instrument
  a suspicious obfuscated method with DeobProbe, run the desktop client, and
  read NDJSON evidence to CONFIRM or REJECT what the method/class actually does.
  Use when static analysis stalls (thousands of method#### remain), when you need
  runtime proof of a rename hypothesis, or to discover hot methods at runtime.
  Companion to void-client-deobfuscate. Adapted from DebugSwift's
  swift-agent-debug-log NDJSON protocol.
---

# void-client deobfuscation probe

Static deob (the `void-client-deobfuscate` skill) gets you far, but many
`method####` / `anInt####` have ambiguous role until you watch them run.
This skill is the **runtime evidence** layer: instrument → reproduce → read →
confirm/reject.

The harness is `client/deob/DeobProbe.java` (compiled into the desktop jar).
It appends one **NDJSON** line per probe — never chatty `println` that you
have to grep by eye.

Logging is **asynchronous**: each probe does a non-blocking `queue.offer` onto
a bounded (4096-line) queue and returns immediately. A single daemon writer
thread (`DeobProbe-writer`) drains the queue to disk and flushes. This keeps
probes free of the game/render loop — a probe inside a per-frame method costs
only an `offer`, never a disk write. If the queue fills (disk slow / logger
starved), lines are dropped and counted; on JVM shutdown the harness prints
`DeobProbe: queue saturated — wrote N, dropped M` to stderr so you know a burst
outran the writer. A clean exit drains the queue via a shutdown hook; for a
hard exit call `DeobProbe.flush()`. In normal deob use (sparse probes) drops
are rare — they only appear if you probe a per-frame method millions of times
in a short window.

## When to use

- You have a hypothesis from `docs/deobfuscation/islands/findings.md` but no
  static proof (e.g. "method3429 = applyPreferences").
- Two equally-plausible names and call sites don't disambiguate.
- You want to know **which** obfuscated methods actually run on the title
  screen (hot-method discovery) to prioritise lotes.

## Log path strategy

| Runtime | Where the client writes | How the agent reads |
|---|---|---|
| Desktop (jar) | path from `-Dvoid.deob.log=…` or env `VOID_DEOB_LOG`, default `deob-log.ndjson` in cwd | read the file directly |
| Disabled | no-op (set `-Dvoid.deob.disabled=true` or `VOID_DEOB_DISABLED=1`) | — |

Never hardcode an absolute repo path inside a probe — the value comes from the
env/property at runtime, so the same instrumentation works on any machine.

## Instrumentation (minimal)

Add a probe at the top of the suspect method, wrapped so it's trivial to strip:

```java
// #region agent log
DeobProbe.log("H1", "NodeSub51.method3429",
    "commit preferences + rebuild",
    "arg0", i, "arg1", class239, "arg2", i_7_, "retval", ret);
// #endregion
```

- **`H1`** — your `hypothesisId`. Pick one letter/number per hypothesis so you
  can filter later.
- **`NodeSub51.method3429`** — the **obfuscated** `location`. Keep it
  obfuscated on purpose: after you rename the method, this string is still
  greppable and ties the evidence to the old name.
- **`data`** — the runtime proof. Log argument types/values, return value, and
  any relevant field before/after. Truncate big arrays/strings (the harness
  does it for you).
- **`runId`** — defaults to `pre-fix`; override with `-Dvoid.deob.run=post-fix`
  when re-running after a rename to compare.

### Hot-method discovery (no code changes needed)

`DeobProbe.tick("Class.method")` just counts. Sprinkle it in a method body; the
harness flushes aggregates every 1024 calls. After a run, `summarize_log.py`
reports which obfuscated methods ran most.

## Run

```bash
# one hypothesis
VOID_DEOB_LOG=deob-H1.ndjson make desktop-log

# or via the make target default
make desktop-clear-log && make desktop-log

# compare before/after a rename
make desktop-log VOID_DEOB_LOG=deob-prefix.ndjson
# … rename method3429 -> applyPreferences …
make desktop-log VOID_DEOB_LOG=deob-postfix.ndjson
```

The client needs a game server on `:43594`; see the repo README. Reaching the
title screen already exercises model loading, sprite raster, CS2 init — enough
to confirm lotes 50/51/52 hypotheses.

## Read

```bash
python3 .cursor/skills/void-client-deob-probe/scripts/summarize_log.py deob-H1.ndjson
```

Groups by `hypothesisId` + `location`, shows:
- how many times each fired,
- the span (first/last timestamp),
- the union of `data` keys seen (so you know what you actually captured),
- a sample line per location.

Use the output to **confirm** ("arg1 is always a Component339 → it's a prefs
commit") or **reject** ("retval is a float[], not a Model → not getModel").

## Agent workflow

1. Inspect `docs/deobfuscation/islands/findings.md` / `top-tokens.md` for the
   target and its current hypothesis status.
2. Form a hypothesis id (`Hn`) + guessed English name.
3. Add `DeobProbe.log(...)` + `// #region agent log` wrapper at the method.
4. `make desktop-clear-log && make desktop-log` (with `VOID_DEOB_LOG`).
5. Reproduce in the client (boot, do the action).
6. `summarize_log.py <log>` — read evidence.
7. **Confirmed** → rename per `void-client-deobfuscate` (mind reflection!),
   update `docs/deobfuscation/islands/findings.md`, strip the probe.
   **Rejected** → refine hypothesis, new id, re-run.
8. Always strip `// #region agent log … // #endregion` before committing
   (unless the user asks to keep them).

## NDJSON line schema

```json
{
  "sessionId": "522bed",
  "kind": "probe",
  "location": "SpriteSub3.anInt8477",
  "message": "extract alpha from ARGB",
  "data": { "argb": -16711936, "alpha": 255, "hypothesisId": "H2", "runId": "pre-fix" },
  "timestamp": 1733456789000,
  "thread": "GameThread"
}
```

`kind` is one of `session`, `probe`, `count` (the last is the aggregate
hot-method counter).

## Anti-patterns

- Logging without a `hypothesisId` — you can't filter later.
- "Renaming" based on the log alone without checking call sites / reflection
  (the deobfuscate skill's evidence rules still apply).
- Leaving probes in committed code (strip the `// #region agent log` blocks).
- Forgetting that the desktop client needs a server on `:43594`.
- Treating a single sample as proof — look at the key union / multiple lines.
