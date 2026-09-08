#!/usr/bin/env bash
# Recompile SDK.java + IOSTarget.java into robovm-gradle-plugin-2.3.25-patched.jar
# for AppleTVOS.sdk support (-Drobovm.iosPlatform=AppleTVOS).
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
JAR="$ROOT/robovm-gradle-plugin-2.3.25-patched.jar"
PATCH_DIR="$(cd "$(dirname "$0")" && pwd)"
TMP="$(mktemp -d)"
trap 'rm -rf "$TMP"' EXIT

test -f "$JAR" || { echo "missing $JAR" >&2; exit 1; }
test -f "$PATCH_DIR/SDK.java" || { echo "missing SDK.java" >&2; exit 1; }
test -f "$PATCH_DIR/IOSTarget.java" || { echo "missing IOSTarget.java" >&2; exit 1; }

if [[ -f "$PATCH_DIR/DeviceCtl.java" ]]; then
  mkdir -p "$TMP/devicectl"
  javac --release 8 -cp "$JAR" -d "$TMP/devicectl" "$PATCH_DIR/DeviceCtl.java"
  ( cd "$TMP/devicectl" && jar uf "$JAR" org/robovm/compiler/target/ios/devicectl/DeviceCtl.class )
fi

mkdir -p "$TMP/classes"
javac --release 8 -cp "$JAR" -d "$TMP/classes" \
  "$PATCH_DIR/SDK.java" \
  "$PATCH_DIR/IOSTarget.java"

( cd "$TMP/classes" && jar uf "$JAR" $(find org -name '*.class') )

echo "updated $JAR (tvOS SDK + DeviceCtl)"
javap -public -cp "$JAR" org.robovm.compiler.target.ios.SDK | grep -E 'listDevice|isTvOS|devicePlatform' || true
