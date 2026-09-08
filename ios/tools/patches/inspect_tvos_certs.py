#!/usr/bin/env python3
import plistlib, subprocess, tempfile
from pathlib import Path

prov = Path.home() / "Library/Developer/Xcode/UserData/Provisioning Profiles/39f19b56-ca6f-4e80-90f5-187667971c3e.mobileprovision"
raw = subprocess.check_output(["/usr/bin/security", "cms", "-D", "-i", str(prov)])
pl = plistlib.loads(raw)
certs = pl.get("DeveloperCertificates") or []
for i, c in enumerate(certs):
    with tempfile.NamedTemporaryFile(suffix=".cer", delete=False) as f:
        f.write(c.data if hasattr(c, "data") else c)
        path = f.name
    out = subprocess.check_output(["openssl", "x509", "-inform", "DER", "-in", path, "-noout", "-subject", "-fingerprint"], text=True)
    print(f"--- cert {i} ---")
    print(out)
