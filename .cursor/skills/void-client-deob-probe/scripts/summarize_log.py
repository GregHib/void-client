#!/usr/bin/env python3
"""Summarise a DeobProbe NDJSON log for deobfuscation hypothesis review.

Usage (from void-client/):
  python3 .cursor/skills/void-client-deob-probe/scripts/summarize_log.py [log.ndjson]

Reads one or more NDJSON files (default: deob-log.ndjson in cwd) and prints,
grouped by (hypothesisId, location):

  - fired count
  - first / last timestamp (as mm:ss.mmm since session start)
  - message(s) seen
  - union of data keys captured (so you know what evidence exists)
  - one sample line per location

Also reports the top hot methods from `kind:"count"` lines (runtime
call-frequency discovery), independent of any hypothesis.

Exit code is non-zero only on a hard IO error; malformed lines are skipped
with a warning so one bad line doesn't lose the rest.
"""
from __future__ import annotations

import json
import sys
from collections import defaultdict
from pathlib import Path

DEFAULT_LOG = "deob-log.ndjson"


def load_session_start(log_path: Path) -> int | None:
    try:
        for line in log_path.read_text(errors="replace").splitlines():
            line = line.strip()
            if not line:
                continue
            try:
                obj = json.loads(line)
            except json.JSONDecodeError:
                continue
            if obj.get("kind") == "session":
                return obj.get("timestamp")
    except FileNotFoundError:
        pass
    return None


def fmt_ts(ts: int, start: int | None) -> str:
    if start is None:
        return str(ts)
    delta = ts - start
    secs = delta // 1000
    ms = delta % 1000
    return f"{secs:02d}:{ms:03d}"


def main() -> int:
    paths = [Path(p) for p in sys.argv[1:]] or [Path(DEFAULT_LOG)]
    probes: dict[tuple[str, str], dict] = {}
    counts: dict[str, int] = defaultdict(int)
    session_start: int | None = None

    for p in paths:
        if not p.is_file():
            print(f"! missing log: {p}", file=sys.stderr)
            continue
        if session_start is None:
            session_start = load_session_start(p)
        for ln, raw in enumerate(p.read_text(errors="replace").splitlines(), 1):
            raw = raw.strip()
            if not raw:
                continue
            try:
                obj = json.loads(raw)
            except json.JSONDecodeError as e:
                print(f"! skip malformed line {ln} in {p.name}: {e}",
                      file=sys.stderr)
                continue
            kind = obj.get("kind")
            if kind == "count":
                loc = obj.get("location", "?")
                try:
                    counts[loc] += int(obj.get("data", {}).get("count", 0))
                except (TypeError, ValueError):
                    pass
                continue
            if kind not in ("probe", "session"):
                continue
            loc = obj.get("location", "?")
            data = obj.get("data", {}) or {}
            hid = data.get("hypothesisId", "-")
            key = (str(hid), str(loc))
            bucket = probes.setdefault(key, {
                "count": 0,
                "messages": set(),
                "keys": set(),
                "samples": [],
                "first": obj.get("timestamp"),
                "last": obj.get("timestamp"),
            })
            bucket["count"] += 1
            bucket["messages"].add(obj.get("message", ""))
            for k in data:
                if k not in ("hypothesisId", "runId"):
                    bucket["keys"].add(k)
            bucket["first"] = min(bucket["first"], obj.get("timestamp"))
            bucket["last"] = max(bucket["last"], obj.get("timestamp"))
            if len(bucket["samples"]) < 3:
                bucket["samples"].append(obj)

    if not probes and not counts:
        print("no probe/count lines found")
        return 0

    print("=== hypothesis probes ===")
    for (hid, loc), b in sorted(probes.items(),
                                key=lambda kv: (-kv[1]["count"], kv[0])):
        span = ""
        if b["first"] is not None:
            span = f" [{fmt_ts(b['first'], session_start)}–{fmt_ts(b['last'], session_start)}]"
        print(f"\n[{hid}] {loc}  ×{b['count']}{span}")
        for m in sorted(b["messages"]):
            print(f"    msg: {m}")
        print(f"    data keys: {', '.join(sorted(b['keys'])) or '(none)'}")
        for s in b["samples"]:
            sd = {k: v for k, v in (s.get("data", {}) or {}).items()
                  if k not in ("hypothesisId", "runId")}
            print(f"    sample: {s.get('message', '')}  {json.dumps(sd, ensure_ascii=False)}")

    if counts:
        print("\n=== hot methods (runtime call count) ===")
        for loc, n in sorted(counts.items(), key=lambda kv: -kv[1])[:25]:
            print(f"  {n:>8}  {loc}")

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
