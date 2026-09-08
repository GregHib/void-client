#!/usr/bin/env bash
# Build + sign via robovmInstall (tvOS / AppleTVOS.sdk), wrap into Void.app,
# then install/launch on Apple TV via devicectl.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/../../../.." && pwd)"
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
IOS="$ROOT/ios"
INSTALL_DIR="$IOS/build/robovm"
APP="$INSTALL_DIR/Void.app"
JAVA_17="${JAVA_17:-$HOME/.jdks/jdk-17.0.20.1+1/Contents/Home}"
# TV Sala - Gois (AppleTV5,3) hardware UDID — not the Identifier from `list devices`.
UDID="${TVOS_UDID:-7d5160e9f84ba36ad9abee5c1aff2fd89c2e7b07}"
SIGN_ID="${IOS_SIGN_IDENTITY:-Apple Development: Matheus Gois (885DD2XQL9)}"
# tvOS Team Provisioning Profile: * (includes Apple TV)
PROFILE="${TVOS_PROVISIONING_PROFILE:-39f19b56-ca6f-4e80-90f5-187667971c3e}"
BUNDLE="${TVOS_BUNDLE:-world.gregs.voidosrs.tvos}"

if [[ ! -x "$JAVA_17/bin/java" ]]; then
  echo "missing arm64 JDK 17 at JAVA_17=$JAVA_17" >&2
  exit 1
fi
if ! "$JAVA_17/bin/java" -XshowSettings:properties -version 2>&1 | grep -q 'os.arch = aarch64'; then
  echo "JAVA_17 must be arm64 (os.arch=aarch64)" >&2
  exit 1
fi

# robovmInstall always writes flat into INSTALL_DIR (or Void.app). A leftover
# Void.app / .gitkeep from the previous wrap must not be reinstalled.
rm -rf "$APP"
rm -f "$INSTALL_DIR/.gitkeep"

cd "$IOS"
JAVA_HOME="$JAVA_17" PATH="$JAVA_17/bin:$PATH" ./gradlew --no-daemon robovmInstall \
  -Pvoid.platform=tvos \
  -Probovm.arch=arm64 \
  -Probovm.iosSkipSigning=false \
  -Probovm.iosSignIdentity="$SIGN_ID" \
  -Probovm.iosProvisioningProfile="$PROFILE" \
  -Drobovm.iosPlatform=AppleTVOS

# Prefer an already-assembled .app from robovmInstall; otherwise wrap flat install.
if [[ -d "$APP" && -x "$APP/Void" ]]; then
  echo "using robovmInstall bundle $APP"
else
  if [[ ! -x "$INSTALL_DIR/Void" || ! -f "$INSTALL_DIR/Info.plist" ]]; then
    echo "build finished but flat install missing ($INSTALL_DIR/Void)" >&2
    ls -la "$INSTALL_DIR" >&2 || true
    exit 1
  fi
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
fi

rm -f "$APP/.gitkeep"

if [[ ! -x "$APP/Void" ]]; then
  echo "failed to assemble $APP" >&2
  ls -la "$APP" >&2 || true
  exit 1
fi

# RoboVM actool targets iphoneos — replace Assets.car with tvOS brandassets.
bash "$SCRIPT_DIR/inject-tvos-icons.sh" "$APP"

# Fix DT* metadata if RoboVM left iphoneos stamps (linked against iPhoneOS.sdk).
/usr/bin/plutil -replace DTPlatformName -string appletvos "$APP/Info.plist" 2>/dev/null || true
/usr/bin/plutil -replace DTSDKName -string appletvos26.2 "$APP/Info.plist" 2>/dev/null || true

# Re-sign after Assets.car / Info.plist changes.
PROF_FILE="$HOME/Library/Developer/Xcode/UserData/Provisioning Profiles/${PROFILE}.mobileprovision"
if [[ ! -f "$PROF_FILE" ]]; then
  # Some Xcode installs use .provisionprofile for tvOS.
  PROF_FILE="$HOME/Library/Developer/Xcode/UserData/Provisioning Profiles/${PROFILE}.provisionprofile"
fi
if [[ ! -f "$PROF_FILE" ]]; then
  echo "missing provisioning profile $PROFILE under ~/Library/Developer/Xcode/UserData/Provisioning Profiles/" >&2
  exit 1
fi
ENT=$(mktemp)
cat > "$ENT" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
	<key>application-identifier</key>
	<string>CTAFH43K36.${BUNDLE}</string>
	<key>com.apple.developer.team-identifier</key>
	<string>CTAFH43K36</string>
	<key>get-task-allow</key>
	<true/>
	<key>keychain-access-groups</key>
	<array>
		<string>CTAFH43K36.*</string>
	</array>
</dict>
</plist>
EOF
cp "$PROF_FILE" "$APP/embedded.mobileprovision"
rm -f "$APP/.gitkeep"
codesign -f -s "$SIGN_ID" --entitlements "$ENT" --generate-entitlement-der "$APP"
rm -f "$ENT"
codesign --verify --verbose=2 "$APP"

echo "installing $APP ($(du -sh "$APP/Void" | awk '{print $1}')) on Apple TV ${UDID}..."
xcrun devicectl device install app --device "$UDID" "$APP"
if ! xcrun devicectl device process launch --device "$UDID" "$BUNDLE"; then
  echo "install OK - wake the Apple TV and relaunch:" >&2
  echo "  xcrun devicectl device process launch --device $UDID $BUNDLE" >&2
  exit 1
fi
echo "OK - launched $BUNDLE on $UDID"
