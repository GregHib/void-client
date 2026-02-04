#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

BUILD_DIR="${BUILD_DIR:-"$ROOT_DIR/build"}"
LIBS="${LIBS:-"$ROOT_DIR/libs/clientlibs.jar"}"
MAIN_CLASS="${MAIN_CLASS:-Loader}"
OUT_JAR="${OUT_JAR:-"$BUILD_DIR/void-client.jar"}"

JAVA_BIN="${JAVA_HOME:+$JAVA_HOME/bin/}java"

if [[ ! -f "$OUT_JAR" ]]; then
  echo "Missing $OUT_JAR. Build first with:"
  echo "  make jar"
  echo "or"
  echo "  tools/build.sh"
  exit 1
fi

exec "$JAVA_BIN" -cp "$OUT_JAR:$LIBS" "$MAIN_CLASS" "$@"

