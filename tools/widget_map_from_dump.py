#!/usr/bin/env python3
"""Build widget-map/ from a WidgetDump run (no clicks needed).

Reads manifest.jsonl (+ optional group-*.txt trees) and writes:
  widget-map/MAP.md          — human summary by IF group
  widget-map/catalog.jsonl   — one row per unique iface
  widget-map/by-group/*.md   — per-group detail

Usage:
  python3 tools/widget_map_from_dump.py
  python3 tools/widget_map_from_dump.py widget-dumps/20260830-155615
  python3 tools/widget_map_from_dump.py --latest
"""
from __future__ import annotations

import argparse
import json
import re
from collections import defaultdict
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
DUMPS = ROOT / "widget-dumps"
OUT = ROOT / "widget-map"

TYPE_NAME = {
    0: "layer",
    2: "inv",
    3: "rect",
    4: "text",
    5: "sprite",
    6: "model",
    9: "line",
}


def has_real_options(opts) -> bool:
    if not isinstance(opts, list):
        return False
    for o in opts:
        if isinstance(o, str) and o.strip():
            return True
    return False


def is_named(e: dict) -> bool:
    if has_real_options(e.get("options")):
        return True
    lab = e.get("label") or ""
    return bool(lab) and not lab.startswith(
        ("iface:", "layer:", "sprite:", "item:", "contentType:")
    )


def iface(packed: int) -> str:
    return f"{packed >> 16}:{packed & 0xFFFF}"


def label_of(row: dict) -> str:
    for key in ("debugName", "text", "textContent"):
        v = row.get(key)
        if isinstance(v, str) and v.strip():
            return v.strip()[:64]
    opts = row.get("options") or []
    if isinstance(opts, list):
        for o in opts:
            if isinstance(o, str) and o.strip():
                return o.strip()[:64]
    spr = row.get("spriteId", -1)
    if isinstance(spr, int) and spr >= 0:
        return f"sprite:{spr}"
    item = row.get("itemId", -1)
    if isinstance(item, int) and item > 0:
        return f"item:{item}"
    ct = row.get("contentType", 0)
    if ct:
        return f"contentType:{ct}"
    t = row.get("type", -1)
    if t == 0:
        return f"layer:{iface(row['packedId'])}"
    return f"iface:{iface(row['packedId'])}"


def latest_dump() -> Path | None:
    latest = DUMPS / "LATEST"
    if latest.is_file():
        stamp = latest.read_text().strip()
        p = DUMPS / stamp
        if p.is_dir():
            return p
    runs = sorted(
        [d for d in DUMPS.iterdir() if d.is_dir() and (d / "manifest.jsonl").is_file()],
        key=lambda d: d.name,
        reverse=True,
    )
    return runs[0] if runs else None


def load_manifest(run: Path) -> list[dict]:
    rows = []
    path = run / "manifest.jsonl"
    if not path.is_file():
        return rows
    for line in path.read_text().splitlines():
        line = line.strip()
        if not line:
            continue
        try:
            rows.append(json.loads(line))
        except json.JSONDecodeError:
            continue
    return rows


def load_trees(run: Path) -> dict[int, str]:
    trees = {}
    for p in sorted(run.glob("group-*.txt")):
        m = re.match(r"group-(\d+)\.txt", p.name)
        if not m:
            continue
        trees[int(m.group(1))] = p.read_text()
    # Also accept widget-map copies written beside dumps.
    for p in sorted((OUT).glob("group-*.txt")) if OUT.is_dir() else []:
        m = re.match(r"group-(\d+)\.txt", p.name)
        if not m:
            continue
        gid = int(m.group(1))
        if gid not in trees:
            trees[gid] = p.read_text()
    return trees


# tree line: "746:80 t5 'sprite:1796' 64x64 @571,89 spr=1796"
_TREE_LINE = re.compile(
    r"^\s*(\d+):(\d+)\s+t(\d+)\s+'([^']*)'\s+(\d+)x(\d+)\s+@(-?\d+),(-?\d+)"
    r"(?:.*?\bspr=(-?\d+))?"
    r"(?:.*?\bct=(-?\d+))?"
    r"(?:.*?\bopt='([^']*)')?"
)


def rows_from_trees(trees: dict[int, str]) -> list[dict]:
    """Promote group-*.txt nodes into catalog rows (covers containers crops skip)."""
    rows: list[dict] = []
    for text in trees.values():
        for line in text.splitlines():
            m = _TREE_LINE.match(line)
            if not m:
                continue
            group, child, typ, label, w, h, x, y = (
                int(m.group(1)),
                int(m.group(2)),
                int(m.group(3)),
                m.group(4),
                int(m.group(5)),
                int(m.group(6)),
                int(m.group(7)),
                int(m.group(8)),
            )
            spr = int(m.group(9)) if m.group(9) is not None else -1
            ct = int(m.group(10)) if m.group(10) is not None else 0
            opt = m.group(11)
            opts = [opt] if opt and opt.strip() else []
            packed = (group << 16) | child
            rows.append(
                {
                    "packedId": packed,
                    "childIndex": -1,
                    "type": typ,
                    "spriteId": spr,
                    "contentType": ct,
                    "itemId": -1,
                    "x": x,
                    "y": y,
                    "w": w,
                    "h": h,
                    "text": label if not label.startswith(("sprite:", "layer", "iface", "contentType:")) else "",
                    "textContent": "",
                    "debugName": None,
                    "options": opts,
                    "file": None,
                    "_treeLabel": label,
                }
            )
    return rows


def synthesize(rows: list[dict]) -> list[dict]:
    """Dedupe by iface[+childIndex when siblings share packedId]."""
    best: dict[str, dict] = {}
    for r in rows:
        pid = r.get("packedId")
        if not isinstance(pid, int):
            continue
        ci = r.get("childIndex", -1)
        if not isinstance(ci, int):
            ci = -1
        # Dynamic children (inv slots, quest rows) share packedId — keep each index.
        key = iface(pid) if ci < 0 else f"{iface(pid)}#{ci}"
        lab = label_of(r)
        if r.get("_treeLabel") and (
            not lab or lab.startswith(("iface:", "layer:", "sprite:", "item:", "contentType:"))
        ):
            lab = r["_treeLabel"]
        entry = {
            "iface": iface(pid),
            "group": pid >> 16,
            "child": pid & 0xFFFF,
            "packedId": pid,
            "childIndex": ci,
            "type": r.get("type", -1),
            "typeName": TYPE_NAME.get(r.get("type", -1), f"t{r.get('type')}"),
            "spriteId": r.get("spriteId", -1),
            "contentType": r.get("contentType", 0),
            "itemId": r.get("itemId", -1),
            "x": r.get("x", 0),
            "y": r.get("y", 0),
            "w": r.get("w", 0),
            "h": r.get("h", 0),
            "label": lab,
            "options": [o for o in (r.get("options") or []) if isinstance(o, str) and o.strip()],
            "file": r.get("file"),
        }
        prev = best.get(key)
        if prev is None:
            best[key] = entry
            continue
        score = (1 if has_real_options(entry["options"]) else 0) + (
            1 if entry["spriteId"] >= 0 else 0
        ) + (
            1 if entry["label"] and not entry["label"].startswith(("iface:", "layer:", "sprite:")) else 0
        ) + (1 if entry["file"] else 0)
        prev_score = (1 if has_real_options(prev["options"]) else 0) + (
            1 if prev["spriteId"] >= 0 else 0
        ) + (
            1 if prev["label"] and not prev["label"].startswith(("iface:", "layer:", "sprite:")) else 0
        ) + (1 if prev["file"] else 0)
        if score >= prev_score:
            best[key] = entry
    return sorted(best.values(), key=lambda e: (e["group"], e["child"], e["childIndex"]))


def write_outputs(catalog: list[dict], trees: dict[int, str], run: Path) -> None:
    OUT.mkdir(parents=True, exist_ok=True)
    by_group_dir = OUT / "by-group"
    if by_group_dir.is_dir():
        for old in by_group_dir.glob("*.md"):
            old.unlink()
    by_group_dir.mkdir(exist_ok=True)

    catalog_path = OUT / "catalog.jsonl"
    with catalog_path.open("w") as f:
        for e in catalog:
            f.write(json.dumps(e, ensure_ascii=False) + "\n")

    by_group: dict[int, list[dict]] = defaultdict(list)
    for e in catalog:
        by_group[e["group"]].append(e)

    lines = [
        "# Widget map (auto)",
        "",
        f"Source dump: `{run.relative_to(ROOT) if run.is_relative_to(ROOT) else run}`",
        f"Unique ifaces: **{len(catalog)}** across **{len(by_group)}** groups.",
        "",
        "Identity = `iface=group:child` (cache IF). Not a Java filename.",
        "",
        "## Groups",
        "",
        "| group | widgets | notable |",
        "|------:|--------:|---------|",
    ]
    for gid in sorted(by_group):
        items = by_group[gid]
        notable = []
        for e in items:
            if is_named(e):
                notable.append(e["label"])
            if len(notable) >= 4:
                break
        note = ", ".join(notable) if notable else "—"
        lines.append(f"| {gid} | {len(items)} | {note} |")
        # per-group md
        gpath = by_group_dir / f"{gid}.md"
        glines = [
            f"# IF group {gid}",
            "",
            f"{len(items)} widgets from dump `{run.name}`.",
            "",
            "| iface | type | label | size | sprite | opts |",
            "|-------|------|-------|------|-------:|------|",
        ]
        for e in items:
            opts = ", ".join(str(o) for o in (e["options"] or [])[:4])
            glines.append(
                f"| `{e['iface']}` | {e['typeName']} | {e['label']} | "
                f"{e['w']}x{e['h']} | {e['spriteId']} | {opts or '—'} |"
            )
        if gid in trees:
            glines += ["", "## Live tree", "", "```", trees[gid].rstrip(), "```"]
        gpath.write_text("\n".join(glines) + "\n")

    lines += [
        "",
        "## Named / interactive (options or text)",
        "",
        "| iface | type | label | opts |",
        "|-------|------|-------|------|",
    ]
    named = [e for e in catalog if is_named(e)]
    for e in named[:200]:
        opts = ", ".join(str(o) for o in (e["options"] or [])[:4])
        lines.append(f"| `{e['iface']}` | {e['typeName']} | {e['label']} | {opts or '—'} |")
    if len(named) > 200:
        lines.append(f"| … | … | _{len(named) - 200} more_ | … |")

    lines += [
        "",
        "## Files",
        "",
        "- `catalog.jsonl` — full unique iface catalog",
        "- `by-group/<id>.md` — per IF group",
        "",
        "Regenerate: `python3 tools/widget_map_from_dump.py --latest`",
        "",
    ]
    (OUT / "MAP.md").write_text("\n".join(lines))
    print(f"wrote {catalog_path.relative_to(ROOT)} ({len(catalog)} ifaces)")
    print(f"wrote {(OUT / 'MAP.md').relative_to(ROOT)} ({len(by_group)} groups)")
    print(f"wrote {by_group_dir.relative_to(ROOT)}/*.md")


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("dump", nargs="?", help="dump run dir")
    ap.add_argument("--latest", action="store_true", help="use widget-dumps/LATEST")
    args = ap.parse_args()

    if args.dump:
        run = Path(args.dump)
        if not run.is_absolute():
            run = ROOT / run
    else:
        run = latest_dump()
    if run is None or not run.is_dir():
        print("no dump found under widget-dumps/")
        return 1

    rows = load_manifest(run)
    trees = load_trees(run)
    rows.extend(rows_from_trees(trees))
    if not rows:
        print(f"empty manifest/trees in {run}")
        return 1
    catalog = synthesize(rows)
    write_outputs(catalog, trees, run)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
