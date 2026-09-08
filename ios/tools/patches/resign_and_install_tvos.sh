#!/usr/bin/env bash
set -euo pipefail
APP=/Users/matheussilva/repos/void-osrs/void-client/ios/build/robovm/Void.app
SIGN_ID="Apple Development: Matheus Gois (885DD2XQL9)"
PROF="$HOME/Library/Developer/Xcode/UserData/Provisioning Profiles/39f19b56-ca6f-4e80-90f5-187667971c3e.mobileprovision"
UDID=7d5160e9f84ba36ad9abee5c1aff2fd89c2e7b07
BUNDLE=world.gregs.voidosrs.tvos

rm -f "$APP/.gitkeep"
/usr/bin/plutil -replace DTPlatformName -string appletvos "$APP/Info.plist" 2>/dev/null || true
/usr/bin/plutil -replace DTSDKName -string appletvos26.2 "$APP/Info.plist" 2>/dev/null || true

ENT=$(mktemp)
cat > "$ENT" <<'XML'
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
	<key>application-identifier</key>
	<string>CTAFH43K36.world.gregs.voidosrs.tvos</string>
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
XML

cp "$PROF" "$APP/embedded.mobileprovision"
codesign -f -s "$SIGN_ID" --entitlements "$ENT" --generate-entitlement-der "$APP"
rm -f "$ENT"
codesign --verify --verbose=4 "$APP"
echo "installing…"
xcrun devicectl device install app --device "$UDID" "$APP"
xcrun devicectl device process launch --device "$UDID" "$BUNDLE"
echo "OK"
