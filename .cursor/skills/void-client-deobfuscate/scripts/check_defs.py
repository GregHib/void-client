#!/usr/bin/env python3
"""List definition sites for method#### tokens (uniqueness gate before rename)."""
from __future__ import annotations

import re
import sys
from pathlib import Path

# scripts/ → skill → skills → .cursor → void-client
ROOT = Path(__file__).resolve().parents[4] / "client"
DECL = re.compile(
    r"(?:(?:public|private|protected|static|final|synchronized)\s+)*"
    r"[\w.\[\]]+\s+(method\d+)\s*\("
)


def defs_for(token: str) -> list[str]:
    out: list[str] = []
    pat = re.compile(rf"\b{re.escape(token)}\s*\(")
    for path in ROOT.rglob("*.java"):
        text = path.read_text(errors="replace")
        if token not in text:
            continue
        for i, line in enumerate(text.splitlines(), 1):
            if not pat.search(line):
                continue
            if DECL.search(line) or re.search(
                rf"(?:void|boolean|int|long|float|double|String|byte|short|char|[\w.]+)\s+{re.escape(token)}\s*\(",
                line,
            ):
                # Heuristic: looks like a declaration, not only a call
                if re.search(
                    r"\b(static|final|void|boolean|int|private|public|protected|abstract)\b",
                    line,
                ) and "(" in line:
                    stripped = line.strip()
                    if stripped.startswith("if ") or stripped.startswith("for ") or stripped.startswith("while "):
                        continue
                    if re.search(rf"\.\s*{re.escape(token)}\s*\(", line) and "static" not in line and "void" not in line.split(token)[0][-20:]:
                        # ClassName.method( — usually a call
                        if not re.search(rf"(void|boolean|int|[\w.]+)\s+{re.escape(token)}\s*\(", line):
                            continue
                    out.append(f"{path.relative_to(ROOT)}:{i}:{stripped[:120]}")
    return out


def main() -> int:
    if len(sys.argv) < 2:
        print("usage: check_defs.py method123 [method456 ...]", file=sys.stderr)
        return 2
    if not ROOT.is_dir():
        print(f"missing client dir: {ROOT}", file=sys.stderr)
        return 1
    bad = 0
    for token in sys.argv[1:]:
        found = defs_for(token)
        print(f"=== {token} ({len(found)} decl-like) ===")
        for row in found:
            print(row)
        if len(found) != 1:
            bad += 1
            print(f"WARN: expected exactly 1 definition for {token}")
    return 1 if bad else 0


if __name__ == "__main__":
    raise SystemExit(main())
