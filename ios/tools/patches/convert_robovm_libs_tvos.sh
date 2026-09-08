#!/usr/bin/env bash
# Convert RoboVM ios/arm64 .a → tvos/arm64 via ld -r with tvOS platform_version.
set -euo pipefail

SRC="${ROBOVM_VM_IOS:-$HOME/.m2/repository/com/mobidevelop/robovm/robovm-dist/2.3.25/unpacked/robovm-2.3.25/lib/vm/ios/arm64}"
DEST="${1:-$HOME/.m2/repository/com/mobidevelop/robovm/robovm-dist/2.3.25/unpacked/robovm-2.3.25/lib/vm/tvos/arm64}"
SDK=$(xcrun --sdk appletvos --show-sdk-path)
TVOS_MIN="${TVOS_MIN:-13.0}"
TVOS_SDK=$(xcrun --sdk appletvos --show-sdk-version)

test -d "$SRC" || { echo "missing $SRC" >&2; exit 1; }
mkdir -p "$DEST"
TMP=$(mktemp -d)
trap 'rm -rf "$TMP"' EXIT

for lib in "$SRC"/*.a; do
  base=$(basename "$lib")
  echo "converting $base → tvOS ($TVOS_MIN / SDK $TVOS_SDK)…"
  rm -rf "$TMP/obj" "$TMP/out"
  mkdir -p "$TMP/obj" "$TMP/out"
  (
    cd "$TMP/obj"
    ar x "$lib"
    for o in *.o; do
      # Relink as relocatable with tvOS platform — replaces iOS version_min.
      xcrun -sdk appletvos ld -r -arch arm64 \
        -syslibroot "$SDK" \
        -platform_version tvos "$TVOS_MIN" "$TVOS_SDK" \
        -o "$TMP/out/$o" "$o"
    done
    rm -f "$DEST/$base"
    ( cd "$TMP/out" && ar rcs "$DEST/$base" *.o )
  )
done

echo "wrote → $DEST"
ls -la "$DEST"
(
  cd "$TMP"
  mkdir -p check && cd check && ar x "$DEST/librobovm-rt.a"
  OBJ=$(ls *.o | head -1)
  echo "sample $OBJ:"
  otool -l "$OBJ" | grep -A6 -iE 'LC_BUILD_VERSION|LC_VERSION_MIN|platform' | head -40
)
