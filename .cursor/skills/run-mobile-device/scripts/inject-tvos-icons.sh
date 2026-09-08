#!/usr/bin/env bash
# Compile tvOS brandassets (App Icon + Top Shelf) into Assets.car and merge
# the actool partial Info.plist into the app. RoboVM's actool always targets
# iphoneos, so this must run after the .app is assembled.
set -euo pipefail

APP="${1:?usage: inject-tvos-icons.sh /path/to/Void.app}"
ROOT="$(cd "$(dirname "$0")/../../../.." && pwd)"
ASSETS="$ROOT/ios/data/Assets.xcassets"
TMP="$(mktemp -d "${TMPDIR:-/tmp}/void-tvos-icons.XXXXXX")"
trap 'rm -rf "$TMP"' EXIT

if [[ ! -d "$ASSETS/App Icon & Top Shelf Image.brandassets" ]]; then
  echo "missing tvOS brandassets under $ASSETS" >&2
  exit 1
fi
if [[ ! -d "$APP" || ! -f "$APP/Info.plist" ]]; then
  echo "not an app bundle: $APP" >&2
  exit 1
fi

xcrun actool "$ASSETS" \
  --compile "$TMP" \
  --platform appletvos \
  --minimum-deployment-target 13.0 \
  --target-device tv \
  --app-icon "App Icon & Top Shelf Image" \
  --output-partial-info-plist "$TMP/partial.plist" \
  --compress-pngs \
  --errors --warnings \
  --output-format human-readable-text >/dev/null

if [[ ! -f "$TMP/Assets.car" ]]; then
  echo "actool did not produce Assets.car" >&2
  exit 1
fi

cp "$TMP/Assets.car" "$APP/Assets.car"

# Merge CFBundleIcons + TVTopShelfImage from actool partial into Info.plist.
python3 - "$APP/Info.plist" "$TMP/partial.plist" <<'PY'
import plistlib, sys
app_path, partial_path = sys.argv[1], sys.argv[2]
with open(app_path, "rb") as f:
    info = plistlib.load(f)
with open(partial_path, "rb") as f:
    partial = plistlib.load(f)
for key in ("CFBundleIcons", "TVTopShelfImage"):
    if key in partial:
        info[key] = partial[key]
info["CFBundleIconName"] = "App Icon & Top Shelf Image"
with open(app_path, "wb") as f:
    plistlib.dump(info, f)
PY

echo "injected tvOS App Icon + Top Shelf into $APP"
