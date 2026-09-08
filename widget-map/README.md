# Widget map (auto, no clicks)

Identity = **`iface=group:child`** (cache IF archive), not a Java `.java` file.

## Fully automatic flow

1. Desktop running with dump armed:
   ```bash
   VOID_WIDGET_DUMP=widget-dumps make desktop-run SERVER_IP=…
   ```
2. Be in the screen you want mapped (login **or** in-game HUD).
3. Agent / you trigger (no Shift+click):
   ```bash
   make widget-dump-request   # client writes crops + group-*.txt trees
   make widget-map           # builds MAP.md + catalog.jsonl + by-group/
   ```

`WidgetDump` walks **all** `openInterfaces` groups, writes trees for containers
(even fullscreen layers the PNG crop pass skips), and mirrors `group-*.txt`
into this folder.

## Outputs

| file | meaning |
|------|---------|
| `MAP.md` | summary by group + named/interactive widgets |
| `catalog.jsonl` | unique `iface` rows |
| `by-group/<id>.md` | per IF group detail |
| `group-<id>.txt` | live hierarchy from last dump (when client wrote trees) |
| `picks.jsonl` | optional Shift+click extras |

## Current snapshot

Regenerated from the latest dump under `widget-dumps/` (see `MAP.md` header).
If that dump was login-only, gameframe `746` will appear after an in-game dump.
