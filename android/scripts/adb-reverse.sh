#!/usr/bin/env bash
# Keep JS5/login reachable on a USB-connected phone.
set -euo pipefail
PORT="${1:-43594}"
adb wait-for-device
adb reverse tcp:$PORT tcp:$PORT
adb reverse --list
echo "OK — phone 127.0.0.1:$PORT -> host :$PORT"
