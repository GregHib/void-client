#!/usr/bin/env python3
import plistlib, subprocess
from datetime import datetime, timezone
from pathlib import Path

prov = Path.home() / "Library/Developer/Xcode/UserData/Provisioning Profiles/20c0b817-a39e-4e86-8c6e-33194208a372.mobileprovision"
raw = subprocess.check_output(["/usr/bin/security", "cms", "-D", "-i", str(prov)])
pl = plistlib.loads(raw)
print("Name:", pl.get("Name"))
print("CreationDate:", pl.get("CreationDate"))
print("ExpirationDate:", pl.get("ExpirationDate"))
print("Platform:", pl.get("Platform"))
print("DeveloperCertificates count:", len(pl.get("DeveloperCertificates") or []))
print("Entitlements:", pl.get("Entitlements"))
print("ProvisionedDevices:", pl.get("ProvisionedDevices"))
print("now UTC:", datetime.now(timezone.utc))
