#!/usr/bin/env python3
"""Run make tvos-device and tee output to ios/build/tvos-device.log."""
import os
import subprocess
import sys
from pathlib import Path

root = Path(__file__).resolve().parents[3]  # void-client
log = root / "ios" / "build" / "tvos-device.log"
log.parent.mkdir(parents=True, exist_ok=True)
env = os.environ.copy()
java = env.get("JAVA_17", str(Path.home() / ".jdks/jdk-17.0.20.1+1/Contents/Home"))
env["JAVA_HOME"] = java
env["PATH"] = f"{java}/bin:/usr/bin:/bin:" + env.get("PATH", "")

with log.open("w") as f:
    f.write(f"cwd={root}\n")
    f.flush()
    p = subprocess.Popen(
        ["make", "tvos-device"],
        cwd=str(root),
        env=env,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
        encoding="utf-8",
        errors="replace",
        bufsize=1,
    )
    assert p.stdout is not None
    for line in p.stdout:
        sys.stdout.write(line)
        f.write(line)
        f.flush()
    rc = p.wait()
    f.write(f"\nexit={rc}\n")
print(f"log={log} exit={rc}")
sys.exit(rc)
