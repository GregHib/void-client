#!/usr/bin/env bash
# Relaunch Void on Apple TV and capture --console stdout for ~25s.
set -euo pipefail
UDID="${TVOS_UDID:-7d5160e9f84ba36ad9abee5c1aff2fd89c2e7b07}"
BUNDLE="${TVOS_BUNDLE:-world.gregs.voidosrs.tvos}"
LOG="${1:-/Users/matheussilva/repos/void-osrs/void-client/ios/build/tvos-console.log}"
mkdir -p "$(dirname "$LOG")"
# Kill existing instance if any
xcrun devicectl device process terminate --device "$UDID" "$BUNDLE" 2>/dev/null || true
sleep 1
# Launch with console; kill after timeout so we get a log slice
(
  xcrun devicectl device process launch --device "$UDID" --console --terminate-existing "$BUNDLE" 2>&1
) > "$LOG" &
PID=$!
sleep 25
kill -INT "$PID" 2>/dev/null || true
wait "$PID" 2>/dev/null || true
echo "==== log ($LOG) ===="
wc -l "$LOG"
tail -120 "$LOG"
