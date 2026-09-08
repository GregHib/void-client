#!/usr/bin/env python3
"""Download a URL to a local file."""
import sys
import urllib.request
from pathlib import Path

url, dest = sys.argv[1], Path(sys.argv[2])
dest.parent.mkdir(parents=True, exist_ok=True)
with urllib.request.urlopen(url) as r:
    data = r.read()
dest.write_bytes(data)
print(f"wrote {len(data)} bytes -> {dest}")
