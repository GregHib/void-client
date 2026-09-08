#!/usr/bin/env python3
"""Count unique method#### tokens under client/."""
from __future__ import annotations

import re
import sys
from pathlib import Path

# scripts/ → skill → skills → .cursor → void-client
ROOT = Path(__file__).resolve().parents[4] / "client"
if not ROOT.is_dir():
    print(f"missing client dir: {ROOT}", file=sys.stderr)
    sys.exit(1)

methods: set[str] = set()
files = 0
for path in ROOT.rglob("*.java"):
    files += 1
    methods.update(re.findall(r"\bmethod\d+\b", path.read_text(errors="replace")))

print(f"java files: {files}")
print(f"unique method####: {len(methods)}")
