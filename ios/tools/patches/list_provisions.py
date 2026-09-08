#!/usr/bin/env python3
"""List local provisioning profiles (name, app id, platforms, Apple TV UDID)."""
import plistlib
import subprocess
from pathlib import Path

TV_UDID = "7d5160e9f84ba36ad9abee5c1aff2fd89c2e7b07"
base = Path.home() / "Library/Developer/Xcode/UserData/Provisioning Profiles"
for f in sorted(base.glob("*.mobileprovision")):
    raw = subprocess.check_output(["/usr/bin/security", "cms", "-D", "-i", str(f)])
    pl = plistlib.loads(raw)
    name = pl.get("Name")
    ent = pl.get("Entitlements", {})
    appid = ent.get("application-identifier")
    plats = pl.get("Platform")
    devices = pl.get("ProvisionedDevices") or []
    has_tv = TV_UDID in devices
    print(f"{f.stem} | {name} | {appid} | plat={plats} | tv={has_tv} | ndev={len(devices)}")
