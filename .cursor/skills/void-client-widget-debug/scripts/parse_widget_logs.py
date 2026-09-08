#!/usr/bin/env python3
"""Summarize void-client widget / joy-alias debug lines from a terminal log."""

from __future__ import annotations

import argparse
import re
import sys
from collections import Counter, OrderedDict

PATTERNS = (
    ("ifPress", re.compile(r"ifPress id=(\d+)")),
    ("DUMP", re.compile(
        r"(?:PRAY-DUMP|ORB-SCAN|widget-dump) packed=(\d+)\s+child=(-?\d+).*?opts=(.*)$"
    )),
    ("INJECT", re.compile(
        r"INJECT kind=(\S+) shown='([^']*)' action='([^']*)' packed=(\d+) child=(-?\d+)"
    )),
    ("FIRE", re.compile(r"fire option '([^']*)' packed=(\d+) child=(-?\d+)")),
    ("LEARN", re.compile(
        r"learn armed kind=(\S+) action=(\S+) packed=(-?\d+) child=(-?\d+) display=(.*)$"
    )),
    ("MISS", re.compile(r"(widget not found|not found\.)", re.I)),
)

OPT_RE = re.compile(r"\[(\d+)\]='([^']*)'(?:→(\S+))?")


def decode_packed(p: int) -> str:
    return f"group={p >> 16} childId={p & 0xFFFF}"


def main() -> int:
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("log", help="Path to terminal .txt or any log file")
    ap.add_argument("-n", type=int, default=40, help="Max unique dump lines to print")
    args = ap.parse_args()

    try:
        text = open(args.log, encoding="utf-8", errors="replace").read()
    except OSError as e:
        print(f"error: {e}", file=sys.stderr)
        return 1

    if_press: Counter[str] = Counter()
    dumps: "OrderedDict[str, str]" = OrderedDict()
    injects: Counter[str] = Counter()
    fires: Counter[str] = Counter()
    learns: list[str] = []
    misses = 0

    for line in text.splitlines():
        if "ifPress id=" in line:
            m = PATTERNS[0][1].search(line)
            if m:
                if_press[m.group(1)] += 1
        if any(k in line for k in ("PRAY-DUMP", "ORB-SCAN", "widget-dump")):
            m = PATTERNS[1][1].search(line)
            if m:
                key = f"packed={m.group(1)} child={m.group(2)} | {m.group(3).strip()}"
                dumps[key] = key
        if "INJECT kind=" in line:
            m = PATTERNS[2][1].search(line)
            if m:
                injects[
                    f"{m.group(1)} action='{m.group(3)}' packed={m.group(4)} child={m.group(5)}"
                ] += 1
        if "fire option" in line:
            m = PATTERNS[3][1].search(line)
            if m:
                fires[f"'{m.group(1)}' packed={m.group(2)} child={m.group(3)}"] += 1
        if "learn armed" in line:
            m = PATTERNS[4][1].search(line)
            if m:
                learns.append(
                    f"{m.group(1)} action={m.group(2)} packed={m.group(3)} "
                    f"child={m.group(4)} display={m.group(5).strip()}"
                )
        if PATTERNS[5][1].search(line) and "joy-alias" in line:
            misses += 1

    print("=== ifPress packedIds (top) ===")
    for pid, n in if_press.most_common(15):
        print(f"  {n:4d}x  id={pid}  ({decode_packed(int(pid))})")

    print("\n=== unique dumps (last wins) ===")
    items = list(dumps.values())
    for row in items[-args.n :]:
        print(f"  {row}")
        pm = re.search(r"packed=(\d+)", row)
        if pm:
            print(f"       → {decode_packed(int(pm.group(1)))}")

    print("\n=== INJECT ===")
    for k, n in injects.most_common(20):
        print(f"  {n:4d}x  {k}")

    print("\n=== fire ===")
    for k, n in fires.most_common(20):
        print(f"  {n:4d}x  {k}")

    print("\n=== learn armed ===")
    for row in learns[-10:]:
        print(f"  {row}")

    print(f"\n=== misses (not found) ===\n  {misses}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
