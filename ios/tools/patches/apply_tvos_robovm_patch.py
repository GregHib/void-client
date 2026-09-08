#!/usr/bin/env python3
"""Compile SDK.java + IOSTarget.java (+ DeviceCtl) into the patched RoboVM plugin jar."""
import os
import subprocess
import sys
import tempfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
JAR = ROOT / "robovm-gradle-plugin-2.3.25-patched.jar"
PATCH = Path(__file__).resolve().parent
JAVA_HOME = Path(os.environ.get("JAVA_HOME", str(Path.home() / ".jdks/jdk-17.0.20.1+1/Contents/Home")))
JAVAC = JAVA_HOME / "bin/javac"
JAR_BIN = JAVA_HOME / "bin/jar"
JAVAP = JAVA_HOME / "bin/javap"


def run(cmd, cwd=None):
    print("+", " ".join(str(c) for c in cmd))
    subprocess.check_call(cmd, cwd=cwd)


def main():
    if not JAR.is_file():
        sys.exit(f"missing {JAR}")
    with tempfile.TemporaryDirectory() as tmp:
        tmp = Path(tmp)
        classes = tmp / "classes"
        classes.mkdir()

        dc = PATCH / "DeviceCtl.java"
        if dc.is_file():
            dc_out = tmp / "devicectl"
            dc_out.mkdir()
            run([str(JAVAC), "--release", "8", "-cp", str(JAR), "-d", str(dc_out), str(dc)])
            run([str(JAR_BIN), "uf", str(JAR), "org/robovm/compiler/target/ios/devicectl/DeviceCtl.class"], cwd=dc_out)

        run([
            str(JAVAC), "--release", "8", "-cp", str(JAR), "-d", str(classes),
            "-proc:none",
            str(PATCH / "SDK.java"),
            str(PATCH / "IOSTarget.java"),
        ])
        class_files = sorted(p.relative_to(classes).as_posix() for p in classes.rglob("*.class"))
        if not class_files:
            sys.exit("no class files produced")
        run([str(JAR_BIN), "uf", str(JAR), *class_files], cwd=classes)

    print(f"updated {JAR}")
    subprocess.call([str(JAVAP), "-public", "-cp", str(JAR), "org.robovm.compiler.target.ios.SDK"])


if __name__ == "__main__":
    main()
