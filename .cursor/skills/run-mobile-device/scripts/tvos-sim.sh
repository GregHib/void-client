#!/usr/bin/env bash
# Build tvOS flavor for arm64-simulator, then install/launch on Apple TV Simulator.
# RoboVM's launchIPhoneSimulator only matches iPhone/iPad families, so we let it
# assemble Void.app (prepareLaunch) against a dummy iPhone name, ignore that launch,
# then simctl-install onto an Apple TV runtime.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/../../../.." && pwd)"
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
IOS="$ROOT/ios"
JAVA_17="${JAVA_17:-$HOME/.jdks/jdk-17.0.20.1+1/Contents/Home}"
# Dummy name so RoboVM's iPhone family matcher succeeds; we never keep that launch.
BUILD_DEVICE="${TVOS_SIM_BUILD_DEVICE:-iPhone 17 Pro}"
TV_NAME="${TVOS_DEVICE:-Apple TV}"
BUNDLE="${TVOS_BUNDLE:-world.gregs.voidosrs.tvos}"

if [[ ! -x "$JAVA_17/bin/java" ]]; then
  echo "missing arm64 JDK 17 at JAVA_17=$JAVA_17" >&2
  exit 1
fi

cd "$IOS"
# Drop stale app wraps so prepareLaunch rewrites them; keep classes/tmp for speed.
rm -rf "$IOS/build/robovm/Void.app" "$IOS/build/robovm.tmp/Void.app" 2>/dev/null || true

# skipLaunch=false: prepareLaunch must run to produce Void.app + Info.plist.
# Launch onto iPhone will fail (binary stamped TVOSSIMULATOR) — ignore that.
set +e
JAVA_HOME="$JAVA_17" PATH="$JAVA_17/bin:$PATH" ./gradlew --no-daemon launchIPhoneSimulator \
  -Pvoid.platform=tvos \
  -Probovm.arch=arm64 \
  -Probovm.device.name="$BUILD_DEVICE" \
  -Probovm.skipLaunch=false \
  -x test
set -e

APP=""
for candidate in \
  "$IOS/build/robovm.tmp/Void.app" \
  "$IOS/build/robovm/Void.app"; do
  if [[ -d "$candidate" && -x "$candidate/Void" ]]; then
    APP="$candidate"
    break
  fi
done
# Fallback: wrap flat installDir if RoboVM left one.
if [[ -z "$APP" && -x "$IOS/build/robovm/Void" && -f "$IOS/build/robovm/Info.plist" ]]; then
  APP="$IOS/build/robovm/Void.app"
  mkdir -p "$APP"
  # shellcheck disable=SC2012
  for item in "$IOS/build/robovm"/*; do
    base="$(basename "$item")"
    case "$base" in
      Void.app|.gitkeep|ipabuild|*.ipa|*.dSYM) continue ;;
    esac
    mv "$item" "$APP/" 2>/dev/null || true
  done
fi
if [[ -z "$APP" || ! -x "$APP/Void" ]]; then
  echo "simulator build finished but Void.app not found under ios/build/" >&2
  find "$IOS/build" -name 'Void' -o -name 'Void.app' 2>/dev/null | head -30 >&2 || true
  exit 1
fi

# RoboVM actool targets iphoneos — replace Assets.car with tvOS brandassets.
bash "$SCRIPT_DIR/inject-tvos-icons.sh" "$APP"

# Ensure Mach-O is TVOSSIMULATOR (platform 8).
if ! xcrun vtool -show-build "$APP/Void" 2>/dev/null | grep -q TVOSSIMULATOR; then
  echo "stamping $APP/Void as TVOSSIMULATOR (vtool platform 8)..."
  xcrun vtool -set-build-version 8 13.0 26.2 -replace -output "$APP/Void.tvos" "$APP/Void"
  mv "$APP/Void.tvos" "$APP/Void"
  codesign --force --sign - "$APP" >/dev/null
fi

UDID="$(xcrun simctl list devices available | awk -v n="$TV_NAME" '
  index($0, n " (") > 0 && $0 ~ /\([0-9A-F-]{36}\)/ {
    if (match($0, /\([0-9A-F-]{36}\)/)) {
      print substr($0, RSTART+1, RLENGTH-2)
      exit
    }
  }')"
if [[ -z "$UDID" ]]; then
  UDID="$(xcrun simctl list devices available | awk '
    /Apple TV/ && $0 ~ /\([0-9A-F-]{36}\)/ {
      if (match($0, /\([0-9A-F-]{36}\)/)) {
        print substr($0, RSTART+1, RLENGTH-2)
        exit
      }
    }')"
fi
if [[ -z "$UDID" ]]; then
  echo "no available simulator named '$TV_NAME'" >&2
  xcrun simctl list devices available | grep -i 'Apple TV' >&2 || true
  exit 1
fi

echo "booting Apple TV simulator $TV_NAME ($UDID)..."
xcrun simctl boot "$UDID" 2>/dev/null || true
open -a Simulator --args -CurrentDeviceUDID "$UDID" 2>/dev/null || open -a Simulator

echo "installing $APP..."
xcrun simctl install "$UDID" "$APP"
echo "launching $BUNDLE..."
# Prefer non-blocking launch so the script returns; use CONSOLE=1 for logs.
if [[ "${CONSOLE:-0}" == "1" ]]; then
  xcrun simctl launch --console-pty "$UDID" "$BUNDLE" || xcrun simctl launch "$UDID" "$BUNDLE"
else
  xcrun simctl launch "$UDID" "$BUNDLE"
fi
echo "OK - $BUNDLE on Apple TV Simulator ($UDID)"
