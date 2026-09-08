#!/usr/bin/env python3
"""
Fix cross-references after lote 53 renames.
Updates external files that reference the renamed static fields.
"""

import re
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent / "client"

# Cross-reference fixes: {filepath: {old: new}}
CROSS_REFS = {
    "components/Component385.java": {
        "DisplayModeManagerContainer164.anInt5350": "DisplayModeManagerContainer164.FIXED_POINT_SCALE2",
        "DisplayModeManagerContainer164.anInt5346": "DisplayModeManagerContainer164.FIXED_POINT_SCALE",
    },
    "toolkit/software/GlToolkitSub1.java": {
        "DisplayModeManagerContainer164.anInt5346": "DisplayModeManagerContainer164.FIXED_POINT_SCALE",
        "DisplayModeManagerContainer164.anInt5350": "DisplayModeManagerContainer164.FIXED_POINT_SCALE2",
    },
}

# Static field renames for 190 and 282 that are referenced externally
# We need to rename the static fields in the class files AND update cross-refs
STATIC_RENAMES_190 = {
    # From DisplayModeManagerContainer273 references
    "anInt5403": "staticField5403",
    "anInt5405": "staticField5405",
    "anInt5407": "staticField5407",
    "anInt5408": "staticField5408",
    "anInt5409": "staticField5409",
    "anInt5410": "staticField5410",
    "anInt5411": "staticField5411",
    "anInt5414": "staticField5414",
    "anInt5417": "staticField5417",
    "anInt5421": "staticField5421",
    "anInt5422": "staticField5422",
    "anInt5425": "staticField5425",
    "anInt5426": "staticField5426",
    "anInt5430": "staticField5430",
    "anInt5431": "staticField5431",
    "anInt5434": "staticField5434",
    "anInt5435": "staticField5435",
    "anInt5440": "staticField5440",
    "anInt5441": "staticField5441",
    "anInt5444": "staticField5444",
    "anInt5445": "staticField5445",
    "anInt5446": "staticField5446",
    "anInt5447": "staticField5447",
    "anInt5448": "staticField5448",
    "anInt5449": "staticField5449",
    "anInt5450": "staticField5450",
    "anInt5451": "staticField5451",
    "anInt5453": "staticField5453",
    "anInt5454": "staticField5454",
    "anInt5456": "staticField5456",
    "anInt5458": "staticField5458",
    "anInt5459": "staticField5459",
    "anInt5464": "staticField5464",
    "anInt5465": "staticField5465",
    "anInt5466": "staticField5466",
    "anInt5468": "staticField5468",
    "anInt5469": "staticField5469",
    "anInt5471": "staticField5471",
    "anInt5479": "staticField5479",
    "anInt5480": "staticField5480",
    "anInt5481": "staticField5481",
    "anInt5483": "staticField5483",
    "anInt5484": "staticField5484",
    "anInt5487": "staticField5487",
    "anInt5488": "staticField5488",
    "anInt5489": "staticField5489",
    "anInt5490": "staticField5490",
    "anInt5491": "staticField5491",
    "anInt5496": "staticField5496",
    "anInt5498": "staticField5498",
    "anInt5500": "staticField5500",
    "anInt5501": "staticField5501",
    "anInt5504": "staticField5504",
    "anInt5505": "staticField5505",
    "anInt5513": "staticField5513",
    "anInt5514": "staticField5514",
    "anInt5517": "staticField5517",
    "anInt5518": "staticField5518",
    "anInt5521": "staticField5521",
    "anInt5522": "staticField5522",
    "anInt5523": "staticField5523",
    "anInt5525": "staticField5525",
    "anInt5526": "staticField5526",
}

STATIC_RENAMES_282 = {
    "anInt5530": "staticField5530",
    "anInt5531": "staticField5531",
    "anInt5532": "staticField5532",
    "anInt5533": "staticField5533",
    "anInt5534": "staticField5534",
    "anInt5535": "staticField5535",
    "anInt5545": "staticField5545",
    "anInt5546": "staticField5546",
    "anInt5547": "staticField5547",
    "anInt5548": "staticField5548",
    "anInt5549": "staticField5549",
    "anInt5550": "staticField5550",
    "anInt5551": "staticField5551",
    "anInt5560": "staticField5560",
    "anInt5561": "staticField5561",
    "anInt5562": "staticField5562",
    "anInt5565": "staticField5565",
    "anInt5567": "staticField5567",
    "anInt5568": "staticField5568",
    "anInt5569": "staticField5569",
    "anInt5570": "staticField5570",
    "anInt5574": "staticField5574",
    "anInt5577": "staticField5577",
    "anInt5578": "staticField5578",
    "anInt5582": "staticField5582",
    "anInt5584": "staticField5584",
    "anInt5585": "staticField5585",
    "anInt5587": "staticField5587",
    "anInt5588": "staticField5588",
    "anInt5589": "staticField5589",
    "anInt5590": "staticField5590",
    "anInt5597": "staticField5597",
    "anInt5599": "staticField5599",
    "anInt5602": "staticField5602",
    "anInt5603": "staticField5603",
    "anInt5604": "staticField5604",
    "anInt5606": "staticField5606",
    "anInt5607": "staticField5607",
    "anInt5611": "staticField5611",
    "anInt5612": "staticField5612",
    "anInt5613": "staticField5613",
    "anInt5614": "staticField5614",
    "anInt5615": "staticField5615",
    "anInt5616": "staticField5616",
    "anInt5618": "staticField5618",
    "anInt5619": "staticField5619",
    "anInt5622": "staticField5622",
    "anInt5623": "staticField5623",
    "anInt5624": "staticField5624",
    "anInt5625": "staticField5625",
    "anInt5628": "staticField5628",
    "anInt5630": "staticField5630",
    "anInt5631": "staticField5631",
    "anInt5633": "staticField5633",
    "anInt5635": "staticField5635",
    "anInt5636": "staticField5636",
    "anInt5637": "staticField5637",
    "anInt5639": "staticField5639",
    "anInt5641": "staticField5641",
    "anInt5643": "staticField5643",
    "anInt5650": "staticField5650",
    "anInt5651": "staticField5651",
}

def rename_in_file(filepath: Path, renames: dict) -> int:
    """Rename tokens in a single file. Returns number of replacements."""
    text = filepath.read_text(encoding="utf-8")
    original = text
    count = 0
    for old, new in renames.items():
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
    
    # Fix cross-references
    print("=== Fixing cross-references ===")
    for rel_path, renames in CROSS_REFS.items():
        filepath = ROOT / rel_path
        if filepath.exists():
            print(f"\n{rel_path}:")
            total += rename_in_file(filepath, renames)
        else:
            print(f"NOT FOUND: {filepath}")
    
    # Rename static fields in 190 and 282
    print("\n=== Renaming static fields in 190 ===")
    total += rename_in_file(ROOT / "misc" / "DisplayModeManagerContainer190.java", STATIC_RENAMES_190)
    
    print("\n=== Renaming static fields in 282 ===")
    total += rename_in_file(ROOT / "misc" / "DisplayModeManagerContainer282.java", STATIC_RENAMES_282)
    
    # Fix DisplayModeManagerContainer273 cross-references
    print("\n=== Fixing DisplayModeManagerContainer273 cross-references ===")
    all_static_renames = {}
    all_static_renames.update({f"DisplayModeManagerContainer190.{k}": f"DisplayModeManagerContainer190.{v}" for k, v in STATIC_RENAMES_190.items()})
    all_static_renames.update({f"DisplayModeManagerContainer282.{k}": f"DisplayModeManagerContainer282.{v}" for k, v in STATIC_RENAMES_282.items()})
    total += rename_in_file(ROOT / "misc" / "DisplayModeManagerContainer273.java", all_static_renames)
    
    # Fix ClientScriptExecutor and LoginPrefs for 282.anInt5584
    print("\n=== Fixing ClientScriptExecutor and LoginPrefs ===")
    total += rename_in_file(ROOT / "script" / "ClientScriptExecutor.java", {
        "DisplayModeManagerContainer282.anInt5584": "DisplayModeManagerContainer282.staticField5584",
    })
    total += rename_in_file(ROOT / "void" / "LoginPrefs.java", {
        "DisplayModeManagerContainer282.anInt5584": "DisplayModeManagerContainer282.staticField5584",
    })
    
    print(f"\nTotal replacements: {total}")

if __name__ == "__main__":
    main()