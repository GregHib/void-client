#!/usr/bin/env bash
# Install debug APK, adb reverse :43594, launch MainActivity.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/../../../.." && pwd)"

devices="$(adb devices | awk 'NR>1 && $2=="device" {print $1}')"
if [[ -z "$devices" ]]; then
  echo "no Android device (adb devices empty / unauthorized). Plug in USB and authorize." >&2
  adb devices -l >&2
  exit 1
fi

cd "$ROOT"
make android
echo "OK — android launched"
