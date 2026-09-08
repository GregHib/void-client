#!/usr/bin/env python3
"""Compare android generated/client flat tree vs client/ sources."""
from pathlib import Path

client = Path(__file__).resolve().parents[2] / "client"
gen = Path(__file__).resolve().parents[1] / "app/build/generated/client"

cn = {p.name for p in client.rglob("*.java") if "build" not in p.parts}
gn = {p.name for p in gen.glob("*.java")} if gen.exists() else set()
exclude = {"DesktopGamepad.java", "DesktopAffiliationDisclaimer.java"}
stale = sorted(gn - cn - exclude)
missing = sorted(cn - gn - exclude)

print(f"client={len(cn)} gen={len(gn)} stale={len(stale)} missing={len(missing)}")
print("--- stale (in gen, not in client) ---")
for n in stale:
    print(n)
print("--- missing in gen ---")
for n in missing:
    print(n)
