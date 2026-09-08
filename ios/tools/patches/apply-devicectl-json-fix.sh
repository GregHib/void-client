#!/usr/bin/env bash
# Recompile DeviceCtl.java into robovm-gradle-plugin-2.3.25-patched.jar.
# Fixes AppLauncher NumberFormatException on oversized devicectl JSON integers
# (e.g. cpuType.subtype = 18446744071562067970).
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
JAR="$ROOT/robovm-gradle-plugin-2.3.25-patched.jar"
SRC="$(cd "$(dirname "$0")" && pwd)/DeviceCtl.java"
TMP="$(mktemp -d)"
trap 'rm -rf "$TMP"' EXIT

test -f "$JAR" || { echo "missing $JAR" >&2; exit 1; }
test -f "$SRC" || { echo "missing $SRC" >&2; exit 1; }

mkdir -p "$TMP/classes"
javac --release 8 -cp "$JAR" -d "$TMP/classes" "$SRC"
( cd "$TMP/classes" && jar uf "$JAR" org/robovm/compiler/target/ios/devicectl/DeviceCtl.class )
echo "updated $JAR"
javap -p -cp "$JAR" org.robovm.compiler.target.ios.devicectl.DeviceCtl | grep parseDevicectlJson
