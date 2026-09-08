---
name: void-client-component-lab
description: >-
  Inspect opaque client components, browse live widget PNG dumps, and render a
  local binary buffer for deobfuscation evidence.
---

# Component Lab workflow

## Source cards (opaque `Component*` classes)

1. Start the browser with `make component-lab`.
2. Select the candidate `ComponentNNN` and inspect its source and method list.
   To scope to one class: `python3 tools/component_lab.py --component Component2`.
   Export only that card:
   `python3 tools/component_lab.py --component Component2 --export-dir component-cards`.
3. If a captured binary buffer is available (or a small cache index), run:
   `python3 tools/component_lab.py --buffer /absolute/path/data.bin`
4. Open `/buffer.svg` from the lab page (or export it with
   `--export-buffer /absolute/path/buffer.svg`). The card shows a bounded
   hex/ASCII view and the first four bytes interpreted in both float byte
   orders.
5. Compare the buffer read/write shape with call sites and related classes.
6. Rename only when the role is supported by evidence; record the old token,
   proposed name, and evidence in `docs/deobfuscation/islands/findings.md`.

Source cards never execute client Java. `--buffer` only reads the explicit local
file, limits the view to 4096 bytes, and escapes data before placing it in SVG.

## Live widget gallery (visual ID)

RS interface widgets (`DisplayModeManagerContainer57`) are **not** the same as
`Component*.java`. To see what each open widget looks like:

1. Rebuild + run desktop with dump enabled:
   `VOID_WIDGET_DUMP=widget-dumps make desktop-run SERVER_IP=…`
2. In-game, open the UI you care about (orbs, world map button, …).
3. Request a dump: `make widget-dump-request`
4. Console should print `void-osrs widget-dump: wrote N crops…`
5. Browse: `make widget-lab` → http://127.0.0.1:8767/widgets  
   Filter by packedId / spriteId / option text / debugName.

Each dump run lands in `widget-dumps/<timestamp>/` with `_frame.png`, per-widget
PNG crops (max edge 400px), and `manifest.jsonl`. Desktop-only (`WidgetDump`
uses AWT Robot; excluded from Android/iOS sync).
