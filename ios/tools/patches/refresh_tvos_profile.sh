#!/usr/bin/env bash
# Tiny tvOS app build to force Xcode to refresh the Team Provisioning Profile
# for CTAFH43K36 including the current Apple Development cert + Apple TV UDID.
set -euo pipefail

ROOT=$(mktemp -d)
trap 'rm -rf "$ROOT"' EXIT
APP=VoidTvSign
mkdir -p "$ROOT/$APP.xcodeproj" "$ROOT/$APP"

cat > "$ROOT/$APP/AppDelegate.swift" <<'SWIFT'
import UIKit
@main
class AppDelegate: UIResponder, UIApplicationDelegate {
    var window: UIWindow?
    func application(_ application: UIApplication,
                     didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        window = UIWindow(frame: UIScreen.main.bounds)
        window?.rootViewController = UIViewController()
        window?.rootViewController?.view.backgroundColor = .black
        window?.makeKeyAndVisible()
        return true
    }
}
SWIFT

cat > "$ROOT/$APP/Info.plist" <<'PLIST'
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
	<key>CFBundleExecutable</key>
	<string>$(EXECUTABLE_NAME)</string>
	<key>CFBundleIdentifier</key>
	<string>$(PRODUCT_BUNDLE_IDENTIFIER)</string>
	<key>CFBundleName</key>
	<string>$(PRODUCT_NAME)</string>
	<key>CFBundlePackageType</key>
	<string>APPL</string>
	<key>CFBundleShortVersionString</key>
	<string>1.0</string>
	<key>CFBundleVersion</key>
	<string>1</string>
	<key>UILaunchScreen</key>
	<dict/>
	<key>UIRequiredDeviceCapabilities</key>
	<array>
		<string>arm64</string>
	</array>
</dict>
</plist>
PLIST

# Minimal pbxproj
cat > "$ROOT/$APP.xcodeproj/project.pbxproj" <<'PBX'
// !$*UTF8*$!
{
	archiveVersion = 1;
	classes = {};
	objectVersion = 56;
	objects = {
		A10000000000000000000001 /* AppDelegate.swift */ = {isa = PBXFileReference; lastKnownFileType = sourcecode.swift; path = AppDelegate.swift; sourceTree = "<group>"; };
		A10000000000000000000002 /* Info.plist */ = {isa = PBXFileReference; lastKnownFileType = text.plist.xml; path = Info.plist; sourceTree = "<group>"; };
		A10000000000000000000003 /* VoidTvSign.app */ = {isa = PBXFileReference; explicitFileType = wrapper.application; includeInIndex = 0; path = VoidTvSign.app; sourceTree = BUILT_PRODUCTS_DIR; };
		A10000000000000000000010 /* Sources */ = {
			isa = PBXSourcesBuildPhase;
			buildActionMask = 2147483647;
			files = ( A10000000000000000000011 /* AppDelegate.swift in Sources */, );
			runOnlyForDeploymentPostprocessing = 0;
		};
		A10000000000000000000011 /* AppDelegate.swift in Sources */ = {isa = PBXBuildFile; fileRef = A10000000000000000000001 /* AppDelegate.swift */; };
		A10000000000000000000020 /* Frameworks */ = {
			isa = PBXFrameworksBuildPhase;
			buildActionMask = 2147483647;
			files = ( );
			runOnlyForDeploymentPostprocessing = 0;
		};
		A10000000000000000000030 /* Resources */ = {
			isa = PBXResourcesBuildPhase;
			buildActionMask = 2147483647;
			files = ( );
			runOnlyForDeploymentPostprocessing = 0;
		};
		A10000000000000000000040 /* Products */ = {
			isa = PBXGroup;
			children = ( A10000000000000000000003 /* VoidTvSign.app */, );
			name = Products;
			sourceTree = "<group>";
		};
		A10000000000000000000050 /* VoidTvSign */ = {
			isa = PBXGroup;
			children = (
				A10000000000000000000001 /* AppDelegate.swift */,
				A10000000000000000000002 /* Info.plist */,
			);
			path = VoidTvSign;
			sourceTree = "<group>";
		};
		A10000000000000000000060 = {
			isa = PBXGroup;
			children = (
				A10000000000000000000050 /* VoidTvSign */,
				A10000000000000000000040 /* Products */,
			);
			sourceTree = "<group>";
		};
		A10000000000000000000070 /* VoidTvSign */ = {
			isa = PBXNativeTarget;
			buildConfigurationList = A10000000000000000000090 /* Build config list */;
			buildPhases = (
				A10000000000000000000010 /* Sources */,
				A10000000000000000000020 /* Frameworks */,
				A10000000000000000000030 /* Resources */,
			);
			buildRules = ( );
			dependencies = ( );
			name = VoidTvSign;
			productName = VoidTvSign;
			productReference = A10000000000000000000003 /* VoidTvSign.app */;
			productType = "com.apple.product-type.application";
		};
		A10000000000000000000080 /* Project object */ = {
			isa = PBXProject;
			attributes = { BuildIndependentTargetsInParallel = 1; LastSwiftUpdateCheck = 1600; LastUpgradeCheck = 1600; };
			buildConfigurationList = A100000000000000000000A0 /* Project configs */;
			compatibilityVersion = "Xcode 14.0";
			developmentRegion = en;
			hasScannedForEncodings = 0;
			knownRegions = ( en, Base, );
			mainGroup = A10000000000000000000060;
			productRefGroup = A10000000000000000000040 /* Products */;
			projectDirPath = "";
			projectRoot = "";
			targets = ( A10000000000000000000070 /* VoidTvSign */, );
		};
		A10000000000000000000091 /* Debug */ = {
			isa = XCBuildConfiguration;
			buildSettings = {
				ALWAYS_SEARCH_USER_PATHS = NO;
				CODE_SIGN_STYLE = Automatic;
				DEVELOPMENT_TEAM = CTAFH43K36;
				SDKROOT = appletvos;
				TVOS_DEPLOYMENT_TARGET = 13.0;
			};
			name = Debug;
		};
		A10000000000000000000092 /* Release */ = {
			isa = XCBuildConfiguration;
			buildSettings = {
				ALWAYS_SEARCH_USER_PATHS = NO;
				CODE_SIGN_STYLE = Automatic;
				DEVELOPMENT_TEAM = CTAFH43K36;
				SDKROOT = appletvos;
				TVOS_DEPLOYMENT_TARGET = 13.0;
			};
			name = Release;
		};
		A10000000000000000000093 /* Debug */ = {
			isa = XCBuildConfiguration;
			buildSettings = {
				CODE_SIGN_STYLE = Automatic;
				DEVELOPMENT_TEAM = CTAFH43K36;
				INFOPLIST_FILE = VoidTvSign/Info.plist;
				LD_RUNPATH_SEARCH_PATHS = ( "$(inherited)", "@executable_path/Frameworks", );
				PRODUCT_BUNDLE_IDENTIFIER = world.gregs.voidosrs.tvos;
				PRODUCT_NAME = "$(TARGET_NAME)";
				SDKROOT = appletvos;
				SWIFT_VERSION = 5.0;
				TARGETED_DEVICE_FAMILY = 3;
				TVOS_DEPLOYMENT_TARGET = 13.0;
			};
			name = Debug;
		};
		A10000000000000000000094 /* Release */ = {
			isa = XCBuildConfiguration;
			buildSettings = {
				CODE_SIGN_STYLE = Automatic;
				DEVELOPMENT_TEAM = CTAFH43K36;
				INFOPLIST_FILE = VoidTvSign/Info.plist;
				LD_RUNPATH_SEARCH_PATHS = ( "$(inherited)", "@executable_path/Frameworks", );
				PRODUCT_BUNDLE_IDENTIFIER = world.gregs.voidosrs.tvos;
				PRODUCT_NAME = "$(TARGET_NAME)";
				SDKROOT = appletvos;
				SWIFT_VERSION = 5.0;
				TARGETED_DEVICE_FAMILY = 3;
				TVOS_DEPLOYMENT_TARGET = 13.0;
			};
			name = Release;
		};
		A10000000000000000000090 /* Build config list */ = {
			isa = XCConfigurationList;
			buildConfigurations = (
				A10000000000000000000093 /* Debug */,
				A10000000000000000000094 /* Release */,
			);
			defaultConfigurationIsVisible = 0;
			defaultConfigurationName = Release;
		};
		A100000000000000000000A0 /* Project configs */ = {
			isa = XCConfigurationList;
			buildConfigurations = (
				A10000000000000000000091 /* Debug */,
				A10000000000000000000092 /* Release */,
			);
			defaultConfigurationIsVisible = 0;
			defaultConfigurationName = Release;
		};
	};
	rootObject = A10000000000000000000080 /* Project object */;
}
PBX

echo "Building dummy tvOS app to refresh provisioning (team CTAFH43K36)…"
xcodebuild -project "$ROOT/$APP.xcodeproj" -target VoidTvSign \
  -destination 'generic/platform=tvOS' \
  -allowProvisioningUpdates \
  -configuration Debug \
  CODE_SIGN_STYLE=Automatic \
  DEVELOPMENT_TEAM=CTAFH43K36 \
  SWIFT_VERSION=5.0 \
  build 2>&1 | tail -80

echo "==== newest tvOS profiles ===="
/usr/bin/python3 /Users/matheussilva/repos/void-osrs/void-client/ios/tools/patches/list_provisions.py | grep -i tvos || true
