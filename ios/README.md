# iOS / tvOS

Same client as Android, AOT via MobiVM/RoboVM. Root runbook: **[README.md](../README.md)**.

Needs **arm64** JDK 17 (`make` checks `JAVA_17`, default `~/.jdks/jdk-17.0.20.1+1`).

```bash
make ios           # iPad Simulator
make ios-relaunch  # reinstall + launch after SpringBoard crash
make ios-device    # physical iPad
make tvos-sim      # Apple TV Simulator
make tvos-device   # physical Apple TV
make tvos-clean    # clean (same ios/ module)
```

Simulator → `127.0.0.1`. Device → set `void.server` before boot, use the in-app **Server** picker, or edit the default in `GameController`.

## Apple TV details

| Item | Value |
|------|-------|
| Bundle id | `world.gregs.voidosrs.tvos` |
| Flavor | `-Pvoid.platform=tvos` → `robovm-tvos.xml` + `Info-tvos.plist.xml` |
| SDK | `AppleTVOS` via `-Drobovm.iosPlatform=AppleTVOS` (patched plugin) |
| Device family | `UIDeviceFamily` = `3` (Apple TV) |
| Min OS | 13.0 |
| Deploy script | `.cursor/skills/run-mobile-device/scripts/tvos-device.sh` |

### Build / install flow (device)

1. `robovmInstall` with tvOS signing + provisioning profile.
2. Wrap flat output into a fresh `Void.app` (never reuse a previous wrap).
3. `inject-tvos-icons.sh` — RoboVM’s actool targets `iphoneos`; this recompiles `Assets.xcassets` for `appletvos`, injects `Assets.car`, merges icon / Top Shelf keys into `Info.plist`.
4. Re-sign, then `devicectl install` + `launch`.

Defaults (override with env): `TVOS_UDID`, `TVOS_PROVISIONING_PROFILE`, `IOS_SIGN_IDENTITY`, `JAVA_17`.

### Simulator note

RoboVM only matches iPhone/iPad device families for launch, so `tvos-sim.sh` builds with `skipLaunch`, then installs via `simctl` onto an Apple TV runtime (Mach-O stamped `TVOSSIMULATOR`).

### Input

- DualShock / Xbox / MFi through `GCController` (drawn cursor + click / zoom / camera).
- Siri Remote through `GCMicroGamepad` (touch surface → cursor, click → left, Play/Pause → right).
- Soft keyboard: system `UITextField` path on login/chat; gameplay sets `controllerUserInteractionEnabled=false` so UIKit does not steal Select.

Runtime detection: `TvHost.isTvOS()` (`void.platform=tvos` and/or `UIUserInterfaceIdiom.TV`).

### App Icon + Top Shelf

Brandassets: `data/Assets.xcassets/App Icon & Top Shelf Image.brandassets/`.

Canonical sources under `assets-src/`:

- `Icon-tv-source.png` — layered app icon stacks
- `topshelf-lumbridge-battle.png` — Home Screen Top Shelf wallpaper when Void is focused

Required pixel sizes: Top Shelf `1920×720` (+ `@2x`), Wide `2320×720` (+ `@2x`). Center-crop from the source when regenerating.

`Info-tvos.plist.xml` sets `CFBundleIconName` to `App Icon & Top Shelf Image`; actool partial plist supplies `CFBundleIcons` / `TVTopShelfImage` at inject time.

### RoboVM tvOS patch

Stock 2.3.25 has no Apple TV SDK selection. Re-apply after regenerating the patched jar:

```bash
python3 ios/tools/patches/apply_tvos_robovm_patch.py
```

Helpers under `ios/tools/patches/` (`resign_*`, `inspect_*`, `convert_robovm_libs_tvos.sh`, etc.) are for debugging signing / Mach-O platform stamps — day-to-day deploy is still `make tvos-device`.
