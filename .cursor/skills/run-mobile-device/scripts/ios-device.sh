#!/usr/bin/env bash
# Build + sign via robovmInstall, wrap flat installDir into Void.app, then
# install/launch on iPad via devicectl (no AppLauncher --console hang).
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/../../../.." && pwd)"
IOS="$ROOT/ios"
INSTALL_DIR="$IOS/build/robovm"
APP="$INSTALL_DIR/Void.app"
JAVA_17="${JAVA_17:-$HOME/.jdks/jdk-17.0.20.1+1/Contents/Home}"
UDID="${IOS_UDID:-00008120-000E7D8830214932}"
SIGN_ID="${IOS_SIGN_IDENTITY:-Apple Development: Matheus Gois (885DD2XQL9)}"
PROFILE="${IOS_PROVISIONING_PROFILE:-bdd4f76c-78f2-493c-b2e0-66f72e688f77}"
BUNDLE="${IOS_BUNDLE:-world.gregs.voidosrs.ios}"

if [[ ! -x "$JAVA_17/bin/java" ]]; then
  echo "missing arm64 JDK 17 at JAVA_17=$JAVA_17" >&2
  exit 1
fi
if ! "$JAVA_17/bin/java" -XshowSettings:properties -version 2>&1 | grep -q 'os.arch = aarch64'; then
  echo "JAVA_17 must be arm64 (os.arch=aarch64)" >&2
  "$JAVA_17/bin/java" -XshowSettings:properties -version 2>&1 | grep os.arch >&2 || true
  exit 1
fi

# robovmInstall always writes flat into INSTALL_DIR. A leftover Void.app from the
# previous wrap makes getAppDir prefer it and our old script would install that
# stale bundle instead of the freshly linked binary.
rm -rf "$APP"

cd "$IOS"
JAVA_HOME="$JAVA_17" PATH="$JAVA_17/bin:$PATH" ./gradlew --no-daemon robovmInstall \
  -Probovm.arch=arm64 \
  -Probovm.iosSkipSigning=false \
  -Probovm.iosSignIdentity="$SIGN_ID" \
  -Probovm.iosProvisioningProfile="$PROFILE"

if [[ ! -x "$INSTALL_DIR/Void" || ! -f "$INSTALL_DIR/Info.plist" ]]; then
  echo "build finished but flat install missing ($INSTALL_DIR/Void)" >&2
  ls -la "$INSTALL_DIR" >&2 || true
  exit 1
fi

# Wrap flat installDir → Void.app for devicectl (every run, never reuse stale wrap).
mkdir -p "$APP"
shopt -s nullglob
for item in "$INSTALL_DIR"/*; do
  base="$(basename "$item")"
  case "$base" in
    Void.app|.gitkeep|ipabuild|*.ipa) continue ;;
  esac
  mv "$item" "$APP/"
done
shopt -u nullglob

if [[ ! -x "$APP/Void" ]]; then
  echo "failed to assemble $APP" >&2
  ls -la "$APP" >&2 || true
  exit 1
fi

echo "installing $APP ($(du -sh "$APP/Void" | awk '{print $1}'))…"
xcrun devicectl device install app --device "$UDID" "$APP"
if ! xcrun devicectl device process launch --device "$UDID" "$BUNDLE"; then
  echo "install OK — unlock the iPad and relaunch:" >&2
  echo "  xcrun devicectl device process launch --device $UDID $BUNDLE" >&2
  exit 1
fi
echo "OK — launched $BUNDLE on $UDID"
