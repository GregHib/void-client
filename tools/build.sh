#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

SRC_DIR="${SRC_DIR:-"$ROOT_DIR/client/src"}"
BUILD_DIR="${BUILD_DIR:-"$ROOT_DIR/build"}"
CLASSES_DIR="${CLASSES_DIR:-"$BUILD_DIR/classes"}"
SOURCES_FILE="${SOURCES_FILE:-"$BUILD_DIR/sources.txt"}"

LIBS="${LIBS:-"$ROOT_DIR/libs/clientlibs.jar"}"
MAIN_CLASS="${MAIN_CLASS:-Loader}"
OUT_JAR="${OUT_JAR:-"$BUILD_DIR/void-client.jar"}"

JAVA_BIN="${JAVA_HOME:+$JAVA_HOME/bin/}java"
JAVAC_BIN="${JAVA_HOME:+$JAVA_HOME/bin/}javac"
JAR_BIN="${JAVA_HOME:+$JAVA_HOME/bin/}jar"

EXCLUDE_REGEX="${EXCLUDE_REGEX:-}"

mkdir -p "$BUILD_DIR" "$CLASSES_DIR"

find "$SRC_DIR" -maxdepth 1 -name '*.java' -print | sort > "$SOURCES_FILE"
if [[ -n "$EXCLUDE_REGEX" ]]; then
  grep -Ev "$EXCLUDE_REGEX" "$SOURCES_FILE" > "$SOURCES_FILE.tmp"
  mv "$SOURCES_FILE.tmp" "$SOURCES_FILE"
fi

echo "Sources: $(wc -l < "$SOURCES_FILE") ($SOURCES_FILE)"
echo "JAVAC: $JAVAC_BIN"

"$JAVAC_BIN" -Xlint:none -cp "$LIBS" -d "$CLASSES_DIR" @"$SOURCES_FILE"

echo "JAR: $OUT_JAR"
"$JAR_BIN" cfe "$OUT_JAR" "$MAIN_CLASS" -C "$CLASSES_DIR" .

echo "Done. Run with:"
echo "  $JAVA_BIN -cp $OUT_JAR:$LIBS $MAIN_CLASS"

