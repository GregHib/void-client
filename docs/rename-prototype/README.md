# Rename Prototype (634 → 667)

This folder contains a *prototype* mapping pass that tries to match classes in the obfuscated `2011-634/void-client` jar to classes in a named/refactored jar (currently 2011Scape build 667).

## What it does

`tools/rs_rename_mapper.py` compares classes using:

- String constants overlap (weighted by rarity in the destination jar; best anchors).
- Bytecode opcode histogram cosine similarity (shape matching).
- Normalized method/field descriptor overlap (object types collapsed to avoid “renamed types” dominating).

It outputs:

- JSON: full per-class top matches + evidence
- TSV: high-confidence best matches (easy to eyeball)

## Run it

From repo root:

```bash
python3 tools/rs_rename_mapper.py \
  --src-jar void-client-0.0.7.jar \
  --dst-jar /home/joao/dev/rs/2011-667/2011Scape/2011scape-client/runescape/build/libs/runescape.jar \
  --out docs/rename-prototype/mapping_634_to_667_refactored.json \
  --out-tsv docs/rename-prototype/mapping_634_to_667_refactored.tsv \
  --top 3 \
  --min-score 0.35
```

## Interpreting results

- Start with the TSV: it’s “best match per class above threshold”.
- Look at `anchor_strings`: these are the rare shared strings that usually explain *why* it matched.
- For anything suspicious, open the JSON entry and compare opcode similarity + sizes.

## Next step (once we trust the map)

1. Lock in class-level renames (only) into a mapping file.
2. Apply the mapping to a jar (remap), then re-decompile for a clean renamed source dump.
3. Repeat with better matching once some names/types stabilize (graph propagation becomes stronger).

## Replayable renames (manifest)

The applied “wave 1” class renames are captured in `docs/rename-prototype/class_renames.json`.

To re-apply them from a clean state, checkout the manifest’s `base_commit` and run:

```bash
git checkout 01d46f0
python3 tools/apply_class_renames.py \
  --manifest docs/rename-prototype/class_renames.json \
  --src-dir client/src \
  --report docs/rename-prototype/rename_report.md
```
