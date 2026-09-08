# Void mobile architecture (Android + iOS / tvOS)

The desktop client is a decompiled **RuneScape 634** Java applet (`client/src`). Android, iPad, and Apple TV run that **same Java**, with a software renderer and a thin native host. OpenGL / DirectX / jaggl natives are stubbed so the toolkit falls back to the CPU pixel buffer.

All mobile hosts talk to the Void game process on **TCP 43594** (JS5 + login). Start `:game:run` on the Mac before launching the app.

```
                    ┌─────────────────────────────────────────┐
                    │  void-client/client/src  (Java 634)     │
                    │  Loader → applet → software ha_*        │
                    └────────────────┬────────────────────────┘
                                     │ Gradle rewrite
                                     │ java.awt → voidawt, …
                    ┌────────────────┴────────────────────────┐
                    │  voidawt / voidapplet / stubs           │
                    │  (shared; Android is source of truth)   │
                    └────────────┬───────────────┬────────────┘
                                 │               │
                    ┌────────────▼──────┐  ┌─────▼──────────────┐
                    │ Android ART       │  │ iOS RoboVM AOT     │
                    │ MainActivity      │  │ Main / GameController
                    │ SurfaceView       │  │ UIImageView        │
                    │ Bitmap present    │  │ ArgbBridge present │
                    └───────────────────┘  └────────────────────┘
```

## Layout

| Path | Role |
|------|------|
| `client/src` | Canonical 634 sources. Keep using `java.awt` here. |
| `android/` | Android Gradle app. Owns **shared** `voidawt`, JNI stubs, `MainActivity`. |
| `android/scripts/gen_stubs.py` | Regenerates `jagdx` / `jaggl` / `jaclib` / `jagtheora` / `jagex3` stubs from `refs/2011scape-client`. |
| `ios/` | MobiVM/RoboVM 2.3.25 project. Copies Android Java, overlays iOS/tvOS-only files. |
| `ios/src/main/java` | iOS/tvOS host + `voidawt` that cannot compile on Android (`Graphics`, `Font`, `Toolkit`, `AwtHost`). |
| `ios/robovm-tvos.xml` / `Info-tvos.plist.xml` | Apple TV flavor (`-Pvoid.platform=tvos`, bundle `world.gregs.voidosrs.tvos`). |
| `ios/data/Assets.xcassets/App Icon & Top Shelf Image.brandassets/` | tvOS layered App Icon + Top Shelf wallpaper (injected post-build). |
| `ios/assets-src/` | Canonical icon / Top Shelf source PNGs for regeneration. |
| `ios/tools/robovm-gradle-plugin-2.3.25-patched.jar` | Required compiler plugin (see [RoboVM patches](#robovm-patches)); includes AppleTVOS SDK selection. |

Do **not** edit `android/app/build/generated` or `ios/build/generated`. They are rewrite output.

## What was built

### 1. Package rewrite (both platforms)

The 634 code imports desktop JDK types Android/iOS do not provide. `prepareClientSources` copies `client/src` and rewrites imports:

| Original | Replacement | Why |
|----------|-------------|-----|
| `java.awt` | `voidawt` | No AWT on ART / RoboVM UIKit |
| `javax.swing` | `voidswing` | Loader still constructs a `JFrame` on desktop; mobile stubs it |
| `javax.sound` | `voidsound` | No JavaSound — real PCM out (see [Audio](#5-audio-voidsound)) |
| `java.applet` | `voidapplet` | No applet container |
| `java.lang.management` / `com.sun.management` | `voidmgmt` / `voidsun.management` | No MXBeans |
| `sun.net` | `voidsun.net` | Internal HTTP auth types |

Android: `android/app/build.gradle.kts`.  
iOS: `ios/build.gradle` (`prepareClientSources` + `prepareSharedSources`).

`Loader` is still the entry: hosts set `Loader.address`, call `setSize`, `init`. Cache lives under `user.home` (Android app files dir / iOS Documents).

### 2. AWT shim (`voidawt`)

A minimal AWT: `Component`, `Canvas`, `Graphics`, `Image`, mouse/key events, `Toolkit` PNG decode.

The software renderer writes an `int[]` ARGB buffer. `Canvas` / `Graphics` call `AwtHost.present(...)`. The native host blits that buffer to the screen every frame.

`AwtHost` also:

- Tracks logical size (`GAME_WIDTH` / `GAME_HEIGHT`, default **800×600** fullscreen).
- Optionally caps the long edge (`LOGICAL_MAX_EDGE`; `0` = fill the view until FS frame locks size).
- Pushes viewport ints into obfuscated statics (`Class92.anInt1524`, …) so HUD/splash match the surface.
- Injects mouse, wheel, keys, and camera orbit (`Class314` / `Class76`) via reflection.

**Android-only files** (use `android.graphics`): `AwtHost`, `Graphics`, `Font`, `FontMetrics`, `Toolkit`.  
**iOS-only overlays** of those five, plus `ArgbBridge`, `Main`, `GameController`, `GameView`. iOS `Graphics.drawString` uses CoreText/`UIFont` (not a handmade bitmap font).

Everything else under `android/app/src/main/java` (stubs, `voidapplet`, events) is copied to iOS as-is.

### 3. Native library stubs

The client links Jagex JNI (`jaggl`, `jagdx`, `jaclib`, `jagtheora`). Natives are stubbed so GPU paths fail closed and **software `ha_*` runs**.

Regenerate (needs `refs/2011scape-client`):

```bash
python3 void-client/android/scripts/gen_stubs.py
```

Do not reintroduce real Direct3D/OpenGL on mobile unless you replace the whole present path.

### 4. Input

Mapped to AWT so `Class373_Sub1` / `Class373_Sub2` keep working.

| Gesture | AWT |
|---------|-----|
| Tap | Left click (`BUTTON1`) |
| Long-press (~400–500ms) | Right click (`BUTTON3` + `META_MASK` / modifier `0x4`) |
| Drag (one finger, past slop) | Camera yaw/pitch |
| Pinch (2+ fingers) | Mouse wheel (zoom) |
| Four-finger tap | Developer console toggle (same as `` ` ``); opens/closes soft keyboard |
| Tap while console open | Soft keyboard toggle |
| Tap while soft keyboard open (outside text) | Dismiss IME (Android + iOS) |

`Class373_Sub2` reads **modifiers**, not only `getButton()`. `AwtHost.injectMouse` must set:

- button 1 → `0x10` (`BUTTON1_MASK`)
- button 2 → `0x08`
- button 3 → `0x04` (`BUTTON3_MASK` / `META_MASK`)

Android long-press: `Handler.postDelayed` in `MainActivity.GameView`.  
iOS long-press: `UILongPressGestureRecognizer` on `GameView` (GCD timers were cancelled by tiny finger jitter).

#### Soft keyboard (`MobileKeyboard` + host IME)

Hosts keep a 1px IME field (`EditText` / `UITextField`) and call `AwtHost.requestSoftKeyboard` / `requestHideSoftKeyboard`. The **634** side decides *when* to open:

| File | Role |
|------|------|
| `client/src/MobileKeyboard.java` | On interface press: open only for **type-4 single-line** text widgets (height ≤ 48). Login root layers have a keyListener and must **not** open IME. |
| `client.java` / `Class348_Sub40_Sub7` | Apply `MobileKeyboard.liftPx` so chatbox draw + hit-test move up with the keyboard |
| `AwtHost.setKeyboardInset` | Host reports IME overlap in **view** pixels; client converts to game Y |

Chat lift: only the gameframe chat band (not login, not fullscreen layers). Canvas size stays fixed — do **not** pan/resize the whole surface for the keyboard (that letterboxed Android).

Keyboard FAB / ball is hidden; IME opens from text-field taps. Tap-outside dismiss mirrors Android (`SOFT_KEYBOARD_OPEN` / `keyboardOpen`).

### 5. Audio (voidsound)

Desktop uses `javax.sound.sampled` (`Class279_Sub1` → `SourceDataLine`). Mobile rewrites that to `voidsound`. Early stubs threw on `AudioSystem.getLine()`, so the mixer fell through to DirectSound / empty `Class279` and produced **no PCM**.

Both platforms now implement a real line:

| Piece | Role |
|-------|------|
| `AudioSystem.getLine` | Returns `PcmSourceDataLine` with format + buffer size from `DataLine.Info` |
| `ByteRing` | JavaSound-style ring; `available()` = **free** bytes (what `Class279_Sub1.method2081` expects) |
| Game mixer | Soft synth + SFX still run in `client/src` (`Class279_Sub1`, `Class348_Sub16_Sub3`, title track “scape main”) |

#### Android

- `android/.../voidsound/sampled/PcmSourceDataLine.java` → `AudioTrack` stream + pump thread.
- Resamples **22050→44100** when the device rejects 22050.
- `USAGE_MEDIA` / full volume; `MainActivity.requestAudioFocus()` on create/resume.
- Shared sources live under Android; iOS copies them except the platform line (below).

```bash
adb logcat -s void-osrs:I | rg 'audio open|peak='
# Healthy after title music loads: peak > 0 (early peak=0 during splash is normal)
```

#### iOS

- Own `ios/.../voidsound/sampled/PcmSourceDataLine.java` (Android `AudioTrack` version is **excluded** in `ios/build.gradle`).
- **AudioQueue** (16-bit PCM), not `AVAudioEngine` — RoboVM’s `setAudioData(byte[])` only *points* at the Java array; copy into the native `AudioQueueBuffer` via `VM.newDirectByteBuffer`.
- Create/dispose the queue on the **main** thread (`DispatchQueue`) — `AudioQueueNewOutput` from the mixer thread crashes (`objc_retain`).
- Keep `AudioQueue.OutputCallback` as a strong field so the block marshaler cannot GC it.
- `Main` activates `AVAudioSession` category **Playback** at launch.
- Frameworks in `robovm.xml`: `AVFoundation`, `AudioToolbox`, `CoreAudio`.

```bash
# Simulator: look for
# void-osrs audio open (AudioQueue/main) …
# void-osrs audio write#N … peak=NNNN   (NNNN > 0 once music/SFX mix)
```

Title music needs JS5 archives (index 6 + instruments). Silence with working hardware usually means cache/music state, not the output path.

### 6. Networking (JS5 + login)

Both JS5 (cache) and login use **TCP 43594** against the Void game process (`:game:run` on the Mac). `Loader.modewhere=0` (LIVE) keeps that port; do **not** switch to LOCAL (`4`) unless ports are patched — LOCAL rewrites to `40000+worldid`.

| Host | Default |
|------|---------|
| Android emulator | `10.0.2.2` (host loopback) |
| Android **device** | Probe `127.0.0.1` first (**adb reverse**), then saved / LAN history |
| iOS Simulator | `127.0.0.1` |
| iOS device | Saved / LAN history (or in-app server picker) |

Overrides / persistence (first match wins for boot):

- `-Dvoid.server=<ip>` / `System.setProperty("void.server", …)`
- `adb shell setprop debug.void.server <ip>`
- `ServerPrefs` → `user.home/void-server.txt` (newest first, max 5) — shared Android + iOS (`world.gregs.voidosrs.ServerPrefs`)

Login-screen **Change server** overlay (both hosts) edits that history without rebuilding. Prefer that over hardcoding a LAN IP in source.

ATS is off for local HTTP (`NSAllowsArbitraryLoads`). Android uses cleartext in debug.

#### Physical Android **requires** `adb reverse`

Mac Wi‑Fi firewall typically **blocks** inbound `:43594` from the phone. USB reverse maps phone `127.0.0.1:43594` → host `:43594`:

```bash
./void-client/android/scripts/adb-reverse.sh
# or: adb reverse tcp:43594 tcp:43594
```

**Re-run after every USB reconnect.** Without reverse, logs show `probe FAIL` / `Connect FAIL … ECONNREFUSED` and the UI ends on `error_game_js5connect`.

`java.net.preferIPv4Stack=true` is set in `MainActivity` (adb reverse is IPv4-only). `Class297` connects IPv4 literals via `InetAddress.getByAddress` + `Socket.connect(..., 5000)`.

#### JS5 client knobs (`client/src`)

| Class | Change | Why |
|-------|--------|-----|
| `Class248` | in-flight queue 20→48; idle timeout 30s→90s | Fewer stalls on slow USB reverse |
| `Class314_Sub1` | local disk queue cap 250→512 | Cache warm path on device |

Device cache lives at  
`/data/data/world.gregs.voidosrs.android/files/.jagex_cache_32/runescape/` (~hundreds of MB after first fill).

#### Loading stages (what “Checking for updates X%” means)

`Class56` / `Class164` / `Class52` drive the splash. Useful landmarks:

| Stage id | Meaning |
|----------|---------|
| 0 | GC / memory settle |
| **1** | Waiting on JS5 **master index** (`Class340.method2674` / archive 255) — stuck here ⇒ no connect |
| 2–3 | Title sprites (archives 13/33/32\|34) — stuck ~3% ⇒ connected but archives not flowing |
| 8+ | Bulk “Checking / Fetching Updates” |
| 19→20 | Fetching done → leave splash |

Handshake FSM in `client.method101` (`Class47.anInt846`): 0 queue TCP → 1 wait socket → 2 send revision → 3 wait ack → 4 bind `Class248`. Failures go through `method103` then `method82("js5connect"|"js5io"|…)`.

Debug codes we log: `1000` socket fail, `1001` handshake timeout, `1002` IOException. Four hard fails → fatal `error_game_js5connect` (`Applet_Sub1.aBoolean27`); **must restart the app** after fixing network.

Healthy phone boot (with reverse): probe/boot → `Connect OK` → stages 1→19 in ~20–30s when cache is warm.

### 7. Android host

- Package `world.gregs.voidosrs.android`; device under test: Moto G 50 5G.
- `MainActivity`: landscape `SurfaceView`, present `Bitmap` on the UI thread.
- Soft keyboard: hidden `EditText` IME → `AwtHost.injectKey`; FAB hidden (opens via `MobileKeyboard`).
- Server picker overlay + `ServerPrefs` history; login-screen change-server button polled while on title.
- Touch: leftover finger after pinch ignored until fresh `DOWN`; long-press = right-click.
- Display: pin exclusive FS size across resume/IME inset; crop oversized present buffers so stretch fills (no letterbox).
- `minSdk 26`, `compileSdk 35`, Java 11 bytecode.
- Boot thread: `Class.forName("Loader")`, sets `Loader.address` / `port` / `debug` / `trace`.

```bash
# Preferred (install + reverse + launch):
cd void-client && bash .cursor/skills/run-mobile-device/scripts/android-device.sh
# or: make android
adb logcat -s void-osrs:I
```

#### Android debug surface

- `System.out` / `err` bridged to logcat tag **`void-osrs`**.
- Bottom on-screen HUD shows last `boot` / `Connect` / `js5` / `load` / `error_game_` line.
- Client (when `Loader.debug`): `Connect:` / `Connect OK:` / `Connect FAIL:`, `js5 fail code=…`, `load … stage=…`.

#### Display mode / fullscreen fill (mobile patches in `client/src`)

CS2 compares requested window mode to `Class348_Sub42_Sub12.method3229()`. Lying about resizable while Fixed (wm1) made `getDisplayMode` return 2 → **"Unable to enter display mode"**.

| File | Behavior |
|------|----------|
| `Class215` | Honest `aBoolean5219 = i_2_ >= 2`; FS fail falls back to **wm2** (not preferred, avoids recurse) |
| `Class164` | After load: prefs **3** + `method830(3, 800, …, 600)` |
| `Class239_Sub8.method1710` | Default display mode **3** (fullscreen) |
| `Class286_Sub5.method2158` | Canvas fill (no letterbox caps) |
| `voidawt.AwtHost` | Default logical **800×600**; `setDisplaySize` locks to FS dims while `Class34.aFrame476` is set |
| `voidawt.GraphicsDevice.getDisplayModes()` | Includes `{800,600}` first for toolkit / CS2 probes |

#### Critical Android pitfalls (already hit in production)

1. **`Class311` loading-thread deadlock**  
   Splash renderer (`Class311.run`) used to `synchronized (this)` around the whole draw. The game thread then blocked on `method2316` / `method2326` → stuck at “Checking for updates 1%” with **no** `Connect:` logs even when reverse was fine.  
   **Fix:** `method2316` / `method2326` unsynchronized; `run()` no longer holds the instance lock across draw. `aBoolean3908` is `volatile`.

2. **`jagex3.jagmisc.jagmisc.nanoTime()` stub returned `0`**  
   `Class241_Sub2` ctor throws on 0 and falls back; after “fixing” it to a real clock, prefer keeping `System.nanoTime()`. Broken timers stall `Applet_Sub1`’s frame pump (`method1861`).

3. **`Graphics.drawString` used to allocate a full-frame `Bitmap` every call**  
   On phone resolution that made the splash thread pathologically slow (and worsened lock contention). Now draws into a tight glyph-sized bitmap and blits.

4. **`error_game_*` is terminal** for that process — fix reverse/server, force-stop, relaunch.

5. **Gradle JDK transform flake** (`IllegalArgumentException: …/jdkImage`): `./gradlew --stop` and delete the bad `~/.gradle/caches/.../transforms/...` entry, retry.

### 8. iOS / tvOS host

RoboVM **AOT-compiles Java 8** to an arm64 Simulator/device binary (MobiVM 2.3.25).

- `Main` → `GameController` → `GameView` (`UIImageView`).
- `ArgbBridge` converts `int[]` ARGB → `UIImage` (and PNG decode for `Toolkit`).
- Soft keyboard: near-invisible `UITextField` (must not be `hidden` or `becomeFirstResponder` fails); keyboard notifications → `setKeyboardInset` (no full-canvas pan).
- Server picker overlay + shared `ServerPrefs` (same as Android).
- Fonts: CoreText / `UIFont` (`Font` / `FontMetrics` / `Graphics.drawString`); handmade `BitmapFont` removed. Link `CoreText` in `robovm.xml`.
- Force-link `MobileKeyboard` in `robovm.xml` (reflection from `AwtHost`).
- Landscape only; cache under Documents (`user.home`).
- Simulator: `iosSkipSigning = true`. Physical iPad: signing + `devicectl` (see below).

**tvOS flavor** (`make tvos-device` / `tvos-sim`):

- Same Java host; `TvHost.isTvOS()` gates focus / HUD / remote behavior.
- Config: `robovm-tvos.xml`, `Info-tvos.plist.xml`, bundle `world.gregs.voidosrs.tvos`, `UIDeviceFamily` 3.
- Input: DualShock/`GCController` + Siri Remote `GCMicroGamepad`; gameplay keeps `controllerUserInteractionEnabled=false` so UIKit does not steal Select.
- **App Icon + Top Shelf**: brandassets under `Assets.xcassets/App Icon & Top Shelf Image.brandassets/` (layered icon + 1920×720 / 2320×720 wallpaper). RoboVM actool is iPhone-only, so `inject-tvos-icons.sh` recompiles for `appletvos`, drops `Assets.car` into the `.app`, merges `CFBundleIcons` / `TVTopShelfImage`, then the device script re-signs.
- Source art: `ios/assets-src/Icon-tv-source.png`, `ios/assets-src/topshelf-lumbridge-battle.png`.
- No USB reverse — Apple TV reaches the game server over LAN.

**JDK must be arm64** (`uname` / `os.arch = aarch64`). An x86_64 Homebrew JDK makes RoboVM look for `x86_64-simulator` and fail on modern iOS runtimes.

```bash
# Simulator
export JAVA_HOME="$HOME/.jdks/jdk-17.0.20.1+1/Contents/Home"
cd void-client && make ios

# Physical iPad (sign + install + launch)
cd void-client && make ios-device
# Physical Apple TV (AppleTVOS.sdk + sign + Top Shelf inject + install + launch)
cd void-client && make tvos-device
# or: bash .cursor/skills/run-mobile-device/scripts/tvos-device.sh
# or: bash .cursor/skills/run-mobile-device/scripts/ios-device.sh
```

`gradle.properties` already sets `robovm.arch=arm64` and the device name. Give the daemon **8GB** (`org.gradle.jvmargs=-Xmx8g`). First AOT is slow; later runs reuse `~/.robovm/cache`.

If `launchIPhoneSimulator` signs the `.app` but SpringBoard crashes, reboot the sim and:

```bash
xcrun simctl install booted ios/build/robovm.tmp/Void.app
xcrun simctl launch booted world.gregs.voidosrs.ios
```

### RoboVM patches

Stock 2.3.25 cannot AOT this client:

1. **`forceLinkClasses`**: a lone `**` pulled the world and hung Soot on invokedynamic. Current `ios/robovm.xml` uses `*` plus explicit Jagex / `voidawt` / SSL provider patterns so reflection still finds `Class373_Sub1`, etc.
2. **Invokedynamic transformer**: the client is Java 8 (no bootstrap methods). The plugin’s indy pass is a no-op in the patched jar.
3. **Soot `Typing.minimize`**: obfuscated methods (e.g. `Class66`, `Class237_Sub1`) explode the typing worklist (`O(n²)` ancestor checks). The patched plugin **returns immediately** from `soot.jimple.toolkits.typing.fast.Typing.minimize`. Without that, AOT never finishes.
4. **`DeviceCtl` JSON overflow**: `devicectl` emits unsigned 64-bit ints (e.g. `cpuType.subtype` = `18446744071562067970`) that `json-simple` cannot parse as `Long`. Patched `DeviceCtl` quotes those literals before parsing. Source + reapply: `ios/tools/patches/` (`apply-devicectl-json-fix.sh`).
5. **Device deploy uses `robovmInstall`**: `ios-device.sh` / `tvos-device.sh` delete any prior `Void.app`, build a signed flat bundle in `build/robovm/`, re-wrap into a fresh `Void.app`, then `devicectl` installs/launches. Reusing an old wrap installs a stale binary. Avoid `launchIOSDevice` (`--console` hangs).
6. **AppleTVOS SDK selection**: patched `IOSTarget` / `SDK` honor `-Drobovm.iosPlatform=AppleTVOS` (and simulator `TVOSSIMULATOR`). Re-apply with `python3 ios/tools/patches/apply_tvos_robovm_patch.py` after regenerating the jar.

The fat jar is `ios/tools/robovm-gradle-plugin-2.3.25-patched.jar` (`build.gradle` `classpath files(...)`). Do not swap back to Maven `com.mobidevelop.robovm:robovm-gradle-plugin` without re-applying those patches.

## How to maintain

**Change game logic / 634 behavior** in `client/src` only. Rebuild the mobile app so `prepareClientSources` rewrites it. Prefer not to fork copies of `Class*.java` inside `android/` or `ios/`. Mobile-specific 634 patches that must ship on phone (display fill, JS5 queues, `Class311` locking, `Class297` IPv4 connect) still live in `client/src` so desktop and mobile stay one tree — keep them minimal and commented.

**Change AWT / events / stubs** in `android/app/src/main/java`, except the five Android-graphics files. iOS picks those up via `prepareSharedSources`. If you add a new Android-only API (e.g. `android.util.Log`), exclude it in `ios/build.gradle` or the iOS compile will fail.

**Change present, fonts, PNG, or threading** in both `AwtHost`/`Graphics`/`Toolkit` trees. Keep the `Presenter` contract: Android `Bitmap`, iOS `int[]` + `ArgbBridge`. Avoid full-frame allocations on the hot path (`drawString` already learned this the hard way).

**Change touch** in `MainActivity.GameView` (Android) and `ios/.../GameView.java` (iOS). Keep the mouse-button + modifier mapping in **both** `AwtHost.injectMouse` implementations.

**Change networking defaults / debug HUD** in `MainActivity` / `GameController` + `ServerPrefs`. Device workflow: `.cursor/skills/run-mobile-device/` (or `make android` / `make ios-device`).

**Change soft keyboard open rules / chat lift** in `client/src/MobileKeyboard.java` (and keep host `setKeyboardInset` in sync). Do not pan the whole canvas.

**New Jagex native class** after a client bump: extend `gen_stubs.py` packages or add a hand stub next to the others. Software renderer must still be the path that runs. Keep `jagmisc.nanoTime()` returning a real clock (`System.nanoTime()`), never `0`.

**iOS AOT hang** on a new huge method: confirm the patched `Typing.minimize` is the plugin on the classpath (Gradle transform cache can resurrect the stock jar if you switch back to Maven).

**Do not** enable ProGuard/R8 minify on Android until you keep every reflected `ClassNNN` field. **Do not** strip RoboVM `forceLinkClasses` patterns used by `Class.forName` / `getDeclaredConstructor` (include `MobileKeyboard`).

## Known limits

- Software renderer only; no jaggl/DX.
- No JavaSound on desktop path; mobile uses `voidsound` PCM (see §5).
- First launch downloads cache over JS5 (slow); later boots ~20–30s with warm cache + reverse.
- Physical Android depends on **USB + adb reverse** unless Mac firewall allows LAN `:43594`.
- Server IP history is local (`void-server.txt`); empty history still needs a reachable probe/fallback.
- `Loader` has no `canvas` field — `client.method87` reflection fails harmlessly (falls through to `super.method87`).
- iOS plugin jar is large (~61MB) and custom; treat it as part of the toolchain.
- Desktop `./gradlew shadowJar` is unchanged: still a 32-bit-friendly JVM client.

## Quick map

| I want to… | Touch |
|------------|--------|
| Fix a 634 bug | `client/src` |
| Fix left/right click on Android | `MainActivity.java` + `android/.../AwtHost.java` |
| Fix left/right click on iOS | `ios/.../GameView.java` + `ios/.../AwtHost.java` |
| Fix login / chat soft keyboard | `MobileKeyboard.java` + host IME (`MainActivity` / `GameController`) |
| Fix chatbox behind keyboard | `MobileKeyboard.liftPx` + `setKeyboardInset` (not canvas pan) |
| Fix server IP / probe | `ServerPrefs` + host picker / `pickReachableServer` |
| Deploy physical iPad | `make ios-device` / `run-mobile-device` iOS script |
| Deploy physical Apple TV | `make tvos-device` / `run-mobile-device` tvOS script |
| Deploy Android USB | `run-mobile-device` Android script / `make android` |
| Fix frame not showing | `Graphics`/`Canvas` present + host `Presenter` |
| Fix letterbox after resume / IME | Android `AwtHost` pin FS size + present crop |
| Fix “Unable to enter display mode” | Honest `aBoolean5219` / `method3229`; default FS 800×600 via prefs + Frame |
| Fix stuck “Checking for updates” 1% | Reverse + `Class311` locks + `Connect` logs; see §6 |
| Fix `error_game_js5connect` | Reverse/server up, then **restart app** |
| Watch Android client | `adb logcat -s void-osrs:I` + bottom HUD |
| Fix iOS compile/AOT | `ios/build.gradle`, `robovm.xml`, patched plugin, arm64 JDK |
| Fix missing JNI class | `android/scripts/gen_stubs.py` |
