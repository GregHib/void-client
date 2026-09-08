#!/usr/bin/env bash
set -euo pipefail
LIB="$HOME/.m2/repository/com/mobidevelop/robovm/robovm-dist/2.3.25/unpacked/robovm-2.3.25/lib/vm/ios/arm64/librobovm-rt.a"
TMP=$(mktemp -d)
cd "$TMP"
ar x "$LIB"
OBJ=$(ls *.o | head -1)
echo "obj=$OBJ"
otool -l "$OBJ" | grep -A6 -iE 'LC_BUILD_VERSION|LC_VERSION_MIN|platform' | head -50
rm -rf "$TMP"
