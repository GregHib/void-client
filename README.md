# Void Client

> [!WARNING]
> **Non-Affiliation Disclaimer**
>
> Void is a non-commercial, non-profit, community-run preservation project.
>
> **Trademarks** — "RuneScape", "Jagex", and all related names, characters, artwork, music, and game terminology are trademarks or copyrights of Jagex Ltd. or their respective owners. Any use here is descriptive and nominative — we are not the rights holders and we make no claim to that ownership.
>
> **We are not affiliated** — Void has not been endorsed, authorised, licensed, sponsored, or officially communicated with by Jagex Ltd., its parents, subsidiaries, or staff. Any opinions expressed here are those of the contributors, not of Jagex.
>
> **No money changes hands** — This project is free in every direction: $0 to play, $0 to host, $0 to develop. We do not sell membership, in-game currency, items, accounts, services, advertising, or merchandise. We do not solicit donations to operate the game. There is no "premium" tier and there never will be.
>
> **This is not a place to play current RuneScape** — You cannot access official RuneScape servers, character data, the Grand Exchange, or any other live Jagex service from this client. To play the official game, use Jagex's official channels.
>
> **Original implementation** — The server software is independently written from scratch in our own codebase, based on publicly available research, screenshots, and community knowledge.
>
> **Preservation framing** — The knowledge-base articles, screenshots, and news archives published with this project are reproductions of historical RuneScape website content, hosted for educational and archival purposes consistent with the principles of digital preservation. We make no commercial use of this material.
>
> **Use at your own risk** — This client is provided "as-is", without warranty of any kind. Never reuse a password between this client and any other service — including the official RuneScape account. We are volunteers, not a security-audited operator.
>
> **Rights-holder contact** — If you are a rights holder and believe any content in this project infringes your rights, contact the project maintainers. We respond promptly and remove specifically identified material on receipt of a good-faith request, without requiring formal legal process.

Deobfuscated 634 (2010-12-14) client — desktop JVM, plus Android and iOS ports of the same software renderer.

Architecture / maintenance: **[ARCHITECTURE.md](ARCHITECTURE.md)**.

https://github.com/user-attachments/assets/10381f43-aba1-4b22-b725-282112065ff2

https://github.com/user-attachments/assets/8af3c16e-3fdd-4318-8e53-485b70628348

https://github.com/user-attachments/assets/6ce421c3-5856-49f1-9daa-08f2341a6bbc

https://github.com/user-attachments/assets/379d17f0-9077-4746-84fc-c9c4796f1507

https://github.com/user-attachments/assets/bf26cd8f-5d09-42ab-b063-3d21a18ae926

https://github.com/user-attachments/assets/2ae3b176-a325-4cb9-9b4d-3c74d764bc92


## What's new

### Apple TV
tvOS build (`make tvos-sim` / `make tvos-device`): DualShock + Siri Remote, LAN server picker, layered App Icon, and Top Shelf wallpaper on the Home Screen. Details in the [Apple TV](#apple-tv-tvos) section below.

### Auto-login
Credentials are saved on login (`~/void-login.txt`). On the next cold start the title screen restores them and connects once graphics Auto Setup is ready. “Exit to login” stays on the title — auto-login does not loop.

### Default left-click
Long-press (right-click) an NPC, object, inventory item, or bank item → **Default: …** (lilac). That action becomes the next tap / left-click tip. **Default: Reset** clears it. Skipped when the target only has one real option. Stored in `~/.void-osrs/default-click.properties`.

### Mobile controls extras
- Soft keyboard on login / chat fields; chat lift above the IME
- DualShock / Xbox / MFi: left stick moves a cursor, ✕ left-click, ○ right-click, R2 zoom in / L2 zoom out, right stick camera, L1/□/△/… aliases (desktop JVM + Android + iOS)

---

## Server

Clients expect a [Void](https://github.com/GregHib/void) (or compatible) game server on **TCP 43594** (JS5 + login). Run that separately, then point each client at the host IP (defaults below).

```bash
make help
```

---

## Desktop

```bash
make desktop              # ./gradlew :client:run → 127.0.0.1:43594
make desktop-jar          # shadow jar
make desktop-run SERVER_IP=192.168.1.10
# or: java -jar client/build/libs/void-client-1.2.0.jar --address 192.168.1.10
```

**Limitation (gamepad):** connect the DualShock / Xbox / etc. **before** launching the desktop client. Hotplug after start is unreliable on macOS (SDL may see the pad as disconnected until restart).

---

## Android

Needs JDK 17+ and Android SDK / `adb`.

```bash
make android              # installDebug + adb reverse + launch
make android-log
make android-server SERVER_IP=192.168.1.10   # setprop + relaunch
```

### Prebuilt APK

Don't want to build? Just sideload the APK shipped in this repo — no Android SDK needed:

1. Download [`resources/app-debug.apk`](resources/app-debug.apk) onto your device
2. Open it on the device and allow "Install from unknown sources" when prompted
3. Launch **Void OSRS** from your app drawer

Or via `adb` from a computer with the device plugged in:

```bash
adb install -r resources/app-debug.apk
adb shell am start -n world.gregs.voidosrs.android/.MainActivity
```

Want to rebuild it? `make android-apk` runs `assembleDebug` and copies the output to `resources/`.

### Server IP

| Setup | Default | Override |
|-------|---------|----------|
| USB + `adb reverse` | `127.0.0.1` | usually none |
| Emulator | `10.0.2.2` | — |
| Device on LAN (no reverse) | probe then LAN fallback | `make android-server SERVER_IP=…` |

Also: `adb shell setprop debug.void.server <ip>` then force-stop / relaunch.

### Controls

Tap = left click · long-press = right click · pinch = zoom · drag = camera · tap login/chat field = soft keyboard.

More: [android/README.md](android/README.md).

---

## iOS (iPad)

Needs Xcode and an **arm64** JDK 17 (`os.arch=aarch64`). Default path: `~/.jdks/jdk-17.0.20.1+1` (override with `JAVA_17=…`).

```bash
make ios                  # Simulator → 127.0.0.1:43594
make ios-relaunch         # after SpringBoard crash
make ios-device            # physical iPad (sign + devicectl)
```

### Server IP

| Setup | Default |
|-------|---------|
| Simulator | `127.0.0.1` |
| Physical device | LAN fallback — set `System.setProperty("void.server", "<ip>")` before boot, or change the default in `GameController` |

### Controls

Same as Android. Soft keyboard opens on text-field taps.

More: [ios/README.md](ios/README.md).

---

## Component Lab

The repository contains many opaque, decompiled `Component*` classes. The
dependency-free Component Lab provides a safe, one-class-at-a-time source
browser and creates deterministic SVG image cards suitable for visual AI
analysis. It does not instantiate client classes or connect to a server, so
experiments cannot corrupt a live game session.

```bash
make component-lab                         # open http://127.0.0.1:8765
make component-lab-images OUT=/tmp/cards   # export one card per component
python3 tools/component_lab.py --buffer /absolute/path/data.bin
```

Select a class in the browser, inspect its source and open its image card.
With `--buffer`, open `/buffer.svg` to inspect a local binary buffer as bounded
hex/ASCII plus little-endian and big-endian float previews. SVG files remain
text-based and can be archived alongside deobfuscation notes. The workflow is
also available as the `void-client-component-lab` skill.

---

## Apple TV (tvOS)

Same RoboVM host as iPad, built against **AppleTVOS.sdk** (`-Pvoid.platform=tvos`). Bundle id: `world.gregs.voidosrs.tvos`.

```bash
make tvos / make tvos-sim   # Apple TV Simulator (simctl; no signing)
make tvos-device            # physical Apple TV (sign + inject icons + install + launch)
make tvos-clean             # clean ios/ module
```

Requires the **patched** RoboVM plugin (`ios/tools/robovm-gradle-plugin-2.3.25-patched.jar`). After regenerating the jar:

```bash
python3 ios/tools/patches/apply_tvos_robovm_patch.py
```

### Server IP

| Setup | Default |
|-------|---------|
| Simulator | `127.0.0.1` |
| Physical Apple TV | LAN IP of the Mac running the game server (`:43594`) — pick in-app **Server**, or set `void.server` before boot |

There is no `adb reverse` on tvOS; the TV and the Mac must share a LAN (or VPN) path to the game process.

### Controls

- **DualShock / Xbox / MFi**: left stick = cursor, ✕ left-click, ○ right-click, L2/R2 zoom, right stick camera (same mapping as iPad/Android).
- **Siri Remote**: touch-surface swipe = cursor, firm click = left-click, Play/Pause = right-click (`GCMicroGamepad`).
- **Login / chat**: near-invisible `UITextField` + system keyboard (focus-friendly). Gameplay disables UIKit focus steal so the pad/remote keep the drawn cursor.

### Home Screen (App Icon + Top Shelf)

tvOS brandassets live under:

`ios/data/Assets.xcassets/App Icon & Top Shelf Image.brandassets/`

| Asset | Role | Sizes (1x / 2x) |
|-------|------|-----------------|
| App Icon - Large / Small | Home row icon (layered stack) | 1280×768 / 400×240 |
| Top Shelf Image | Focused-app wallpaper | 1920×720 / 3840×1440 |
| Top Shelf Image Wide | Wide Top Shelf | 2320×720 / 4640×1440 |

Source art for regeneration:

- Icon: `ios/assets-src/Icon-tv-source.png`
- Top Shelf wallpaper: `ios/assets-src/topshelf-lumbridge-battle.png`

RoboVM’s `actool` always targets `iphoneos`, so `tvos-device.sh` runs `inject-tvos-icons.sh` after the `.app` is assembled: compiles brandassets for `appletvos`, copies `Assets.car`, merges `CFBundleIcons` + `TVTopShelfImage` into `Info.plist`, then re-signs.

Focus the Void tile on the Apple TV Home Screen to see the Top Shelf background. If an old image sticks, leave and re-focus the icon (tvOS caches Top Shelf).

More: [ios/README.md](ios/README.md), [ARCHITECTURE.md](ARCHITECTURE.md).
