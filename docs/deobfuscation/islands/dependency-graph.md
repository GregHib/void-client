# Dependency graph

## Repo-level

```
void-client/
├── client/                  ← deobfuscation target (790 .java files, unnamed package)
│   ├── src/                 ← bootstrap (client.java, Applet_Sub1, LoadingManager,
│   │                          InputHandler, BuildInfo, HardwareProbe, TeleportHandler)
│   ├── toolkit/             ← renderers
│   │   ├── base/            ← GlToolkitSub3 (binding base, jaclib + jagex3)
│   │   ├── gl/              ← GlToolkitSub2 (OpenGL state, anInt7477=canvasWidth, anInt7666=canvasHeight)
│   │   ├── software/        ← GlToolkitSub1 (CPU rasterizer)
│   │   └── d3d/             ← D3DToolkit (Windows Direct3D)
│   ├── components/          ← ~200+ ComponentNNN UI containers
│   │   ├── Component8       ← scene-graph model container
│   │   ├── Component49      ← game state FSM (clientState — reflective)
│   │   ├── Component192     ← menu/console/bezier utility (already half-named)
│   │   ├── Component283     ← ModelStore (will rename in lote 50)
│   │   └── …
│   ├── sprites/             ← 2D sprite rasterizers
│   │   ├── SpriteSub1       ← Sub1 rasterizer
│   │   └── SpriteSub3*      ← alpha-blend scanline rasterizer (lote 52)
│   ├── script/              ← CS2 executor (lote 51+57)
│   ├── net/                 ← packets, http, socket
│   ├── misc/                ← display mode + 200+ sub-containers
│   ├── entities/            ← NPCs, objects, players
│   ├── world/               ← region, collision, pathing
│   ├── nodes/               ← Node hierarchy (NodeSub51 = preferences)
│   ├── text/                ← StringCache, Cp1252Decoder
│   ├── shaders/             ← GLSL shader pipeline
│   ├── menu/                ← menus + JoystickAlias (padConnected — reflective)
│   └── (… ~25 more domains)
│
├── android/                 ← Android host, NO direct client refs
│   └── app/src/main/java/voidawt/AwtHost.java          ← reflective bridge
│   └── app/src/main/java/world/gregs/voidosrs/ServerPrefs.java
│
├── ios/                     ← iOS host, NO direct client refs
│   └── src/main/java/voidawt/AwtHost.java              ← reflective bridge
│
├── resources/               ← prebuilt APK for sideload
│
└── docs/deobfuscation/      ← this folder
```

## Within `client/` (call density)

```
client/src/client.java (670 method####)
   ├─► toolkit/             (GlToolkit*, 3 hot files in top-15)
   ├─► components/          (ComponentNNN, 200+ containers)
   ├─► sprites/             (SpriteSub1, SpriteSub3 family)
   ├─► net/packet/          (PacketReader, Buffer)
   ├─► script/              (ClientScriptExecutor)
   ├─► misc/                (DisplayModeManager*, 3 of top-15)
   └─► (everything else)
```

The top-4 hot files by `method####` count are all reachable from
`client.java`. Renaming inside one tends to clarify the others, because
the calls flow downstream.

### Reflection-aware edges

These are the edges that **silently break** if the client member is
renamed without updating the host string:

```
client/src/InputHandler.java ──────────────► android/.../AwtHost.java
   .anInt4276 (canvasWidth mirror)              .setStaticInt("InputHandler",
                                                       "anInt4276", w)

client/toolkit/gl/GlToolkitSub2.java ───────► ios/.../AwtHost.java
   .anInt7666 (canvasHeight)                    .setStaticInt("GlToolkitSub2",
                                                       "anInt7666", h)
   .anInt7477 (canvasWidth)                     .setStaticInt("GlToolkitSub2",
                                                       "anInt7477", w)

client/net/socket/SocketConnector.java ─────► android/.../AwtHost.java
   .anInt3473 (canvasWidth source)              .setStaticInt("SocketConnector",
                                                       "anInt3473", w)

client/net/packet/PacketReader.java ────────► ios/.../AwtHost.java
   .anInt10432 (canvasHeight mirror)            .setStaticInt("PacketReader",
                                                       "anInt10432", h)

client/components/Component112.java ───────► both AwtHost.java
   .cameraYaw (already renamed)                 .setStaticInt("Component112",
                                                       "cameraYaw", yaw)
```

The full map of 25 reflective members is in
`../../.cursor/skills/void-client-deobfuscate/scripts/check_reflection.py`
(`EXPECTED` table).

## Within `client/` — by island (lote order)

### lote 50 — ModelProvider interface
```
toolkit/base/d.java            [ModelProvider interface, 6 methods]
        ▲ implements
components/Component283.java   [ModelStore]
        │ reads from
        ├──► cache/CacheStore  (×3)
        ├──► components/DefinitionGroup (loaded by id)
        └──► components/Component319 [Model, the renderable struct]
                  ▲ read by
                  ├──► DisplayModeManagerContainer164.aD4579
                  ├──► DisplayModeManagerContainer190.aD4579
                  ├──► DisplayModeManagerContainer282.aD4579
                  └──► misc/DisplayModeManagerContainer50
                            (via MatrixSub1.aD5684)
```

### lote 51 — CS2 interpreter stacks
```
script/ClientScriptExecutor.java
   ├── intStack (anIntArray1149, 1000 entries)
   │      ▲ push/pop via intStackPointer (anInt1173, 1238 refs)
   ├── stringStack (aStringArray1152, 1000 entries)
   │      ▲ push/pop via stringStackPointer (anInt1170, 208 refs)
   └── callFrames (aClass184Array1168)
          ▲ push/pop via callFramePointer (anInt1154)
```

### lote 52 — SpriteSub3 rasterizer
```
sprites/SpriteSub3.java              [abstract — base rasterizer]
   ├── spriteAlpha (anInt8477, 319 refs) — ARGB high byte
   ├── spriteWidth (anInt8471, 235 refs)
   ├── scanlineStartX/Y (anInt8450/8481)
   ├── scanlineAdvanceX/Y (anInt8451/8453)
   └── toolkit (aHa_Sub1_8460)
        ▲ extends
        ├── sprites/SpriteSub3Sub2   [concrete impl]
        ├── sprites/SpriteSub3Sub3   [concrete impl]
        └── sprites/SpriteCapture    [inline rasterizer — hottest file in
                                       the family, ~1k method refs]
```

### lote 54 — GlToolkit renderer
```
toolkit/base/GlToolkitSub3.java      [binding base, 602 method####]
   └── toolkit/gl/GlToolkitSub2.java   [OpenGL state, 573 method####]
            ├── canvasWidth (anInt7477) — reflective
            ├── canvasHeight (anInt7666) — reflective
            ├── setTextureUnit (method3771, 104 refs) — will rename lote 54
            └── texture-state arrays
                  ▲ read by
                  ├── cookies/CookieManager (uses method3771)
                  ├── scene/particles/ParticleShader
                  └── shaders/* (mount textures)
```

### lote 56 — Display-state mirrors (canvas resize)
```
display/ScreenModeManager.java
   │ on resize: copies container.getSize()
   ├──► SocketConnector.anInt3473  = width
   ├──► NpcNode.anInt6857          = height
   │
   │ then OpenGlShader / SpriteAtlasShader propagate
   ├──► Component236.anInt4017           = width
   ├──► DisplayModeManagerContainer295   = width
   ├──► InputHandler.anInt4276           = width
   ├──► DisplayModeManagerContainer23    = width (or defaultDrawDistance)
   ├──► DisplayModeManagerContainer147   = 0  (per-draw reset)
   ├──► GlToolkitSub2.anInt7666          = height
   ├──► PacketReader.anInt10432          = height
   └──► NodeSub48.anInt7129              = 0  (per-frame reset)
            ▲ read via reflection by
            └── both AwtHost.java (write the new value on canvas resize)
```

## Compile-time only edges

| From | To | Notes |
|---|---|---|
| `android/app/src` | `android/app/build/generated/client` | Flattened copy of `client/src/`. Built by `prepareClientSources` Gradle task. |
| `ios/src` | `ios/build/generated/…` | Same flatten pattern. Stale on rename — use `clean compileJava`. |
| `android/app/src` | `java.awt.*` | Rewritten to `voidawt.*` at flatten time. |
| `android/app/src` | `javax.swing.*` | Rewritten to `voidswing.*`. |
