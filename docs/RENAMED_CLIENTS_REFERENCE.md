# Renamed / Refactored RS Client References (local inventory)

This file is a quick index of other RuneScape client codebases under `/home/joao/dev/rs` that already contain meaningful naming/refactors, or that carry mapping/annotation infrastructure we can reuse when renaming `2011-634/void-client`.

If you add/remove repos, regenerate the “quick scan” with:

```bash
find /home/joao/dev/rs -maxdepth 4 -type d \( -iname '*refactor*' -o -iname '*refactored*' -o -iname '*deob*' -o -iname '*renam*' -o -name 'deob-annotations' \) -print | sort
```

## Closest-era (RT5 / 2011-ish) references

### 2011Scape (build 667) — canonical naming + packaging

- Path: `/home/joao/dev/rs/2011-667/2011Scape/2011scape-client`
- Why it matters: explicitly uses “Jagex canonical naming scheme … sourced from various leaks” and restores exception messages; lots of subsystems refactored (protocol, JS5, CS2, audio, UI, etc).
- Key files:
  - `README.md` (naming philosophy + what’s refactored)
  - `runescape/src/main/java/**` (packaged, named code we can mine for terminology)

### 2011Scape (build 667) — OpenRS2 deob profile + baseline deob client

- Path: `/home/joao/dev/rs/2011-667/2011Scape/runetek5-client`
- Why it matters: contains an OpenRS2 deob profile we can likely adapt to build/mapping workflows.
- Key files:
  - `share/deob/profile.yaml` (transformer/exclusion config)
  - `nonfree/lib/runescape-b667-2011-09-29-13-06-20-openrs2#31438.pack200` (client library input referenced by profile)
  - `deob-annotations/` (OpenRS2 annotations used for mapping in other projects)

### RT5-Client (branch 578) — small, concrete rename examples

- Path: `/home/joao/dev/rs/2011-578/RT5-Client`
- Why it matters: includes a small “rename:” list and notes on deob settings (useful as a pattern for tracking manual renames/fixes).
- Key files:
  - `ref/openrs2-deob-fixes.txt` (explicit class rename examples + other fixes)
  - `README.md` (OpenRS2 deob settings notes)

### “rename666” (older 666-ish work) — misc reference dump

- Path: `/home/joao/dev/rs/2011-667/2011Scape/rename666`
- Notes: looks like an older project snapshot (includes `params.txt`, `odadump.txt`, shader sources, etc). Might contain historical naming hints, but not obviously a modern refactor/mapping pipeline.

## Earlier RS2 refactors (useful patterns, different era)

### 317refactor (rev 317) — educational refactor

- Path: `/home/joao/dev/rs/2005-317/317refactor`
- Why it matters: smaller client where naming/refactoring patterns may be easy to lift (class splitting, grouping, etc), but it’s a much older codebase.

### refactored-client-377 (rev 377) — “refactoring the 377 deob”

- Path: `/home/joao/dev/rs/2006-377/refactored-client-377`
- Key file: `README.md`

### RuneJS refactored-client-435 (rev 435) — packaged Gradle client

- Path: `/home/joao/dev/rs/2006-435/runejs/refactored-client-435`
- Key file: `README.md`

## Later RS2 refactors / ongoing work

### RT4-Client (rev 530 fork) — OpenRS2 annotations kept for mapping

- Path: `/home/joao/dev/rs/2009-530/rt4-client`
- Why it matters: README explicitly calls out keeping OpenRS2 annotations to build a deob map and regenerate a renamed deob.
- Key file: `README.md`
- Mapping infra: `deob-annotations/`

### Darkan client (build 727) — WIP refactor

- Path: `/home/joao/dev/rs/2012-727/Darkan/client`
- Key file: `README.md`

### 2019Scape-Client (build 930) — naming + packaging process notes

- Path: `/home/joao/dev/rs/2019-930/2019Scape/2019Scape-Client`
- Why it matters: README has a concrete “packaging process” description and notes about class ordering/grouping being stable across revisions.
- Key file: `README.md`
- Reference data folder: `ref/` (various text artifacts like `obforder.txt`, `nxt.txt`, etc)

## OSRS ecosystem (tooling + deobfuscators)

### meteor-client — includes `deobfuscator/`

- Path: `/home/joao/dev/rs/osrs/meteor-client`
- Key file: `README.md`

### devious-client — includes `deobfuscator/`

- Path: `/home/joao/dev/rs/osrs/devious-client`
- Key files:
  - `README.md`
  - `deobfuscator/` (and `deobfuscator/deobfuscator.gradle.kts`)

### OSRS-Refactored (rev ~60) — older refactor snapshot

- Path: `/home/joao/dev/rs/osrs/OSRS-Refactored`
- Key file: `README.md`

