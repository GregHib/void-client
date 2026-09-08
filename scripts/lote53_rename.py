#!/usr/bin/env python3
"""
Lote 53: Display-mode island rename.
Renames anInt#### fields in DisplayModeManagerContainer164, 190, 282.
"""

import re
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent / "client"

# Mappings for each file: {old_name: new_name}
RENAMES_164 = {
    # Core geometry
    "anInt5340": "vertexCount",
    "anInt5351": "faceCount",
    "anInt5338": "centerX",
    "anInt5375": "centerY",
    "anInt5342": "centerZ",
    # State & flags
    "anInt5316": "flags",
    "anInt5354": "buildState",
    "anInt5341": "visitMark",
    # Batching / sub-meshes
    "anInt5387": "batchCount",
    "anInt5389": "groupCount",
    # Scale / distance
    "anInt5344": "packScale",
    "anInt5349": "viewDistance",
    # Constants
    "anInt5346": "FIXED_POINT_SCALE",
    "anInt5350": "FIXED_POINT_SCALE2",
}

RENAMES_190 = {
    # Core geometry
    "anInt5497": "vertexCount",
    "anInt5475": "faceCount",
    "anInt5478": "indexCount",  # used with aShortArray5486
    "anInt5406": "particleCount",
    "anInt5433": "batchCount",
    # State & flags
    "anInt5472": "flags",
    "anInt5463": "vertexFlags",
    "anInt5437": "buildState",  # used in synchronizedBuild
    # Scale / other
    "anInt5480": "packScale",  # guess
    "anInt5481": "viewDistance",  # guess
}

RENAMES_282 = {
    # Core geometry
    "anInt5642": "vertexCount",
    "anInt5557": "vertexCount2",  # duplicate?
    "anInt5529": "faceCount",
    "anInt5537": "batchCount",
    # State & flags
    "anInt5556": "flags",
    "anInt5536": "vertexFlags",
    "anInt5527": "buildState",  # aBoolean5527 used with computeBoundingBox2
    # Other
    "anInt5632": "indexCount",
    "anInt5538": "groupCount",
}

ALL_RENAMES = {
    "DisplayModeManagerContainer164.java": RENAMES_164,
    "DisplayModeManagerContainer190.java": RENAMES_190,
    "DisplayModeManagerContainer282.java": RENAMES_282,
}

def rename_in_file(filepath: Path, renames: dict) -> int:
    """Rename tokens in a single file. Returns number of replacements."""
    text = filepath.read_text(encoding="utf-8")
    original = text
    count = 0
    for old, new in renames.items():
        # Whole word replacement (not inside string literals or larger identifiers)
        pattern = rf"\b{re.escape(old)}\b"
        new_text, n = re.subn(pattern, new, text)
        if n > 0:
            text = new_text
            count += n
            print(f"  {old} -> {new}: {n} replacements")
    if text != original:
        filepath.write_text(text, encoding="utf-8")
    return count

def main():
    total = 0
    for filename, renames in ALL_RENAMES.items():
        filepath = ROOT / "misc" / filename
        if not filepath.exists():
            print(f"NOT FOUND: {filepath}")
            continue
        print(f"\n=== {filename} ===")
        total += rename_in_file(filepath, renames)
    print(f"\nTotal replacements: {total}")

if __name__ == "__main__":
    main()