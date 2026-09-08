#!/usr/bin/env bash
set -euo pipefail
APP=/Users/matheussilva/repos/void-osrs/void-client/ios/build/robovm/Void.app
SIGN_ID="Apple Development: Matheus Gois (885DD2XQL9)"
PROF="$HOME/Library/Developer/Xcode/UserData/Provisioning Profiles/20c0b817-a39e-4e86-8c6e-33194208a372.mobileprovision"

# CodeResources still lists .gitkeep from installDir — restore empty file so seal matches,
# or delete from resources by resigning without it. Create empty so verify passes, then resign.
touch "$APP/.gitkeep"

/usr/bin/plutil -replace DTPlatformName -string appletvos "$APP/Info.plist"
/usr/bin/plutil -replace DTSDKName -string appletvos26.2 "$APP/Info.plist"

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
# Prefer not shipping .gitkeep — remove before resign so CodeResources regenerates clean.
rm -f "$APP/.gitkeep"
codesign -f -s "$SIGN_ID" --entitlements "$ENT" --generate-entitlement-der "$APP"
rm -f "$ENT"
codesign --verify --verbose=4 "$APP"
echo "OK signed"
