---
name: void-client-widget-debug
description: >-
  Identify and debug RS634 interface widgets in void-client by dumping real
  optionLabels, packedId/childIndex, and ifPress hits. Use when Learn alias /
  menu inject misses a control, option text is unknown, quick prayer / orbs /
  prayer book / inventory widgets "not found", or the user asks to dump,
  scan, or identify a widget from desktop logs.
---

# void-client — widget identify & debug

Work from **`void-client/`**. Goal: capture **real** widget identity + option
text before writing matchers. Never assume classic OSRS strings.

## When to use

- Menu row missing (`Learn alias`, inject, clear)
- Fire says widget / option **not found**
- Several icons share one `packedId` (prayer book)
- Option text changes by state (`Turn quick prayers on` → `Turn prayers off`)
- User pastes desktop console logs / asks to identify a click target

## Core model

| Field | Meaning |
|-------|---------|
| `packedId` | `(groupId << 16) \| childId` of the component (or parent layer) |
| `childIndex` | Index in parent.`children[]` — **unique** when siblings share `packedId` |
| `itemId` | Inventory item; `-1` / `0` for pure UI widgets |
| `optionLabels[i]` | Raw right-click slots `0..9` |
| `Component63.getComponentOption(i, c, true)` | May **hide** / null disabled slots — always fall back to raw `optionLabels` |
| `DefinitionSub33.openInterfaces` | Live roots: `DisplayModeManagerContainer57[][]` |

Menu build path that can inject dumps:

`Component66.buildComponentMenu` → `JoystickAlias.injectItemMenu` (and similar).

Click path for hit testing: `MobileKeyboard` / `ifPress` logs (`id=` = `packedId`).
**Shift+left-click** any widget → `void-osrs widget-pick … iface=group:child … parents=…`
(group/childId/sprite/contentType/size + container chain). Appends to `widget-map/picks.jsonl`.

**Ctrl+Shift+click** the same → also dumps the whole IF group tree to console and
`widget-map/group-<id>.txt` (containers `t0` + children). Use this to map an open
interface from the view in one gesture.

Identity is **never** a Java filename — it is `iface=group:child` (cache archive path).
Known constants live in `MicrobotWidgets` once confirmed.

Resolve child the same way CC_OP does:

`NodeSub22.getChildComponent(childIndex, (byte) -54, packedId)`.

## Workflow (do this order)

```
Task:
- [ ] 1. Desktop dump build
- [ ] 2. Reproduce (right-click OR openInterfaces scan)
- [ ] 3. Parse logs → real option text + ids
- [ ] 4. Fix matchers / fire path from evidence
- [ ] 5. Re-test both UI states (on + off)
- [ ] 6. Strip or throttle temporary dump spam
```

### 1. Desktop dump build

```bash
JAVA_HOME="${JAVA_17:-$HOME/.jdks/jdk-17.0.20.1+1/Contents/Home}"
PATH="$JAVA_HOME/bin:$PATH"
./gradlew :client:shadowJar -q
pkill -f 'void-client-1.2.0.jar' 2>/dev/null || true
"$JAVA_HOME/bin/java" -jar client/build/libs/void-client-1.2.0.jar --address "${SERVER_IP:-192.168.18.188}"
```

Prefer temporary `System.out.println` with prefix `void-osrs joy-alias` / `void-osrs widget-dump` so logs are greppable.

### 2. Reproduce

**A. Right-click the control** — triggers `buildComponentMenu` → inject/dump.

**B. If nothing dumps** — the widget may not go through that path, or the user
clicked the wrong surface (e.g. prayer **book** icons instead of minimap **orb**).
Add a throttled **openInterfaces scan** that prints candidates matching keywords
(`quick`, `setup`, `select`, `pray`, target verb). See [reference.md](reference.md).

Also use `ifPress` lines to see which `packedId` the cursor actually hit.

### 3. Parse logs

```bash
python3 .cursor/skills/void-client-widget-debug/scripts/parse_widget_logs.py \
  /path/to/terminals/N.txt
```

Or:

```bash
grep -E 'PRAY-DUMP|ORB-SCAN|INJECT|ifPress id=|widget-dump|not found|fire option' \
  /path/to/terminals/N.txt | sort | uniq | head -80
```

Extract:

1. Real option strings (both states if toggle)
2. `packedId` + `childIndex`
3. Whether `getComponentOption` vs raw labels differ
4. Whether Learn/fire classified correctly (`→QUICK_PRAYER` / `→null`)

### 4. Fix from evidence

- Match **observed** strings (case-insensitive, tolerate spacing/`-`)
- State variants: on-label **and** off-label (often drops a word, e.g. `quick`)
- Skip setup/select/choose options when the intent is toggle
- Persist `packedId` (+ `childIndex` when siblings share packed id) on learn
- Fire on **client thread** only (queue from pad → drain in `clientTick`) — off-thread CC_OP freezes UI
- Prefer official lookup (`getChildComponent` / `MicrobotWidgets.get`) over inventing tree walks

### 5. Re-test

Toggle twice (off→on and on→off). Confirm inject + fire logs, no "not found".

### 6. Cleanup

Remove or heavily throttle dump/scan once matchers are correct. Do not leave
per-frame `PRAY-DUMP` spam in production paths.

## Dump snippet (temporary)

```java
// Prefer one line per open; fall back to raw labels.
for (int i = 0; i <= 9; i++) {
    String opt = Component63.getComponentOption(i, c, true);
    String raw = (c.optionLabels != null && i < c.optionLabels.length)
            ? c.optionLabels[i] : null;
    if ((opt == null || opt.length() == 0) && (raw == null || raw.trim().length() == 0))
        continue;
    String use = (opt != null && opt.length() > 0 && !opt.startsWith("Hidden-")) ? opt : raw;
    System.out.println("void-osrs widget-dump packed=" + c.packedId
            + " child=" + c.childIndex + " item=" + c.itemId
            + " [" + i + "]='" + use + "'");
}
```

Scan template and ID math: [reference.md](reference.md).  
Worked example (quick prayer orb): [examples.md](examples.md).

## Related

- Alias system: `client/menu/JoystickAlias.java`
- Menu build: `client/components/Component66.java`
- After you learn what a type/field does → also run **void-client-deobfuscate**
- Device deploy: **run-mobile-device**
