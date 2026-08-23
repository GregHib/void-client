# Void Client

Deobfuscated 634 2010-12-14 client

# Build

Build the client with Gradle, no install needed:

```gradle
./gradlew shadowJar
```

You will find the built `void-client.jar` in `/client/build/libs`.

If you're having issues with OpenGL/DirectX make sure you're using or running with a 32bit jre.

```bash
java -jar void-client.jar -d32
```

# Profiling

The client is slowest to diagnose by guessing, so two layers of profiling are built in:

## Built-in frame profiler (quick triage)

Launch with `--profile` (or type `profile` in the in-game debug console) to get a
5-second breakdown of where each frame goes, printed to stdout:

```
[profiler] 48.2 fps | frame active 6.1ms (max 41ms): logic 1.2 render 4.6 other 0.3 | wait 14.5ms | 8 ticks | 2 slow frames >33ms | gc 12ms | heap 61/512MB
```

How to read it:
- **wait** high, active low → the engine's frame cap is the limiter; the client isn't actually slow.
- **render** dominates → graphics-bound (renderer/pipeline; try the `renderer` console command to see which backend is active).
- **logic** dominates → game-tick processing is the cost.
- **gc** high or heap near max → allocation pressure; raise `-Xmx`.

## JDK Flight Recorder (deep dive)

For method-level detail, record a JFR profile (no code changes, ~1% overhead):

```bash
./gradlew run -Pjfr                       # writes client/client.jfr on exit
# or against the built jar:
java -XX:StartFlightRecording=filename=client.jfr,settings=profile,dumponexit=true -jar void-client.jar
```

Open the `.jfr` in [JDK Mission Control](https://adoptium.net/jmc/), or summarise from the CLI:
`jfr print --events jdk.ExecutionSample client.jfr`.

For flame graphs, [async-profiler](https://github.com/async-profiler/async-profiler) attaches
to a running client and captures native/JNI frames JFR misses:

```bash
asprof -d 30 -e wall -f flame.html <pid>   # wall-clock mode: best for finding render stalls
```

# Hardware rendering (macOS / Linux / Windows)

The original client needed Jagex's 2011-era native libraries (`jaggl`, `jaclib`)
for OpenGL - Windows/x86 binaries that can't load on modern macOS. This repo
replaces them with pure-Java implementations backed by LWJGL 3 + lwjgl3-awt
(`client/src/jaggl`, `client/src/jaclib`), which shadow the classes in
`libs/clientlibs.jar`. No native code to build; Linux and Windows come along
for free via LWJGL's bundled natives.

```bash
./gradlew run --args="--gl"          # force the OpenGL renderer
./gradlew run --args="--gl --profile"  # + frame profiler
./gradlew run --args="--software"    # force the pure-Java software renderer
./gradlew run --args="--resizable"   # force the resizable HUD
./gradlew run --args="--gl --gldebug"  # verbose GL diagnostics (slow)
```

Notes:
- On Apple Silicon this runs on Apple's GL-2.1-on-Metal stack (`renderer`
  console command shows the backend). In-world performance sits at the
  engine's 50fps cap.
- The shim adapts several 2011 assumptions for modern drivers: dynamic
  geometry goes through VBOs (mixed client-array draws crash Apple's driver),
  `glMapBufferARB` is emulated with a persistent scratch buffer, VBO deletes
  are deferred two frames, data stores are padded, and the per-frame
  `glFinish` becomes `glFlush` on macOS.
- Known cosmetic issue: non-power-of-two `GL_ALPHA` textures (some
  shadow/light maps) are rejected by the Apple driver (`GL ERROR 0x502`).
- Selecting "Software" in the in-game settings tries the `sw3d`-native
  renderer, fails harmlessly, and falls back to GL.
