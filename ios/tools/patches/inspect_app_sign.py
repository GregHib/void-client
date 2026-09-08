#!/usr/bin/env python3
import plistlib, subprocess, sys
from pathlib import Path

app = Path(sys.argv[1] if len(sys.argv) > 1 else
           "/Users/matheussilva/repos/void-osrs/void-client/ios/build/robovm/Void.app")
prov = app / "embedded.mobileprovision"
raw = subprocess.check_output(["/usr/bin/security", "cms", "-D", "-i", str(prov)])
pl = plistlib.loads(raw)
print("Name:", pl.get("Name"))
print("UUID:", pl.get("UUID"))
print("Platform:", pl.get("Platform"))
print("AppID:", pl.get("Entitlements", {}).get("application-identifier"))
print("Team:", pl.get("TeamIdentifier"))
devs = pl.get("ProvisionedDevices") or []
print("devices:", len(devs), "tv=", "7d5160e9f84ba36ad9abee5c1aff2fd89c2e7b07" in devs)
print("---- codesign ----")
print(subprocess.check_output(["codesign", "-dv", "--verbose=4", str(app)], stderr=subprocess.STDOUT, text=True))
