---
name: void-client-deobfuscate
description: >-
  Evidence-based rename of obfuscated Java fields/methods in void-client
  (RS634), with aggressive comments, reflection-string sync for mobile hosts,
  and desktop/iOS compile gates. Use when the user asks to deobfuscate, rename
  obfuscated code, continue deob, lote/batch renames, or clarify
  Class*/method####/anInt#### names — especially after camera/viewport/input
  renames that touch AwtHost reflection.
---

# void-client deobfuscation

Work from **`void-client/`** (this repo). Canonical sources: **`client/`**.

Also follow the workspace rule [`void-client-deobfuscate.mdc`](../../../../.cursor/rules/void-client-deobfuscate.mdc) (rename + comment when you understand something). Domain map: [`client/Architecture.md`](../../../client/Architecture.md).

## Goal

Rename obfuscated types/fields/methods to descriptive English names **only with evidence**, add dense comments, keep **desktop + iOS** compiling, and **keep mobile reflection strings in sync**. Do **not** treat the job as done while thousands of `method####` remain (check with the script below).

Commit / push **only when the user asks**. Message style:

```
Rename evidenced fields and methods across client deobfuscation.
```

## Package model (critical)

- All 634 types live in the Java **unnamed package**.
- Nested folders under `client/` are Gradle **`srcDir`s**, not packages — never add `package …`.
- Android/iOS flatten + rewrite imports (`java.awt` → `voidawt`, etc.). Edit game logic in `client/` only.

## Lote workflow

Repeat until the user stops or the island is exhausted:

1. **Find** high-evidence islands (`method####`, `anInt####`, `aBoolean####`, `aClass####`, opaque classes).
2. **Prove** uniqueness of each short token (one definition) before global replace.
3. **Rename** whole-word, outside string literals; fix `this.field = field` after field renames.
4. **Sync reflection** if the old name appears in mobile host string literals (mandatory — see below).
5. **Comment** class headers, non-obvious methods, magic constants, “why” on dense blocks.
6. **Verify** reflection check + both compiles (below).
7. Optionally `lean-ctx knowledge remember` / `session decision` for continuity.

Typical lote: **~15–40** renames with clear evidence — not a blind mass rename.

### Evidence that counts

| Signal | Examples |
|--------|----------|
| Strings / UI | console commands, `printConsole`, localized tips |
| Protocol / IO | `Buffer` read/write shapes, UPDATE_INV slots, JS5 |
| Call-site role | camera lerp, FPS ring, ignore list, world map |
| Bit math / flags | `0x800`, `0x18`, plane/bridge flags |
| Stdlib | `quickSort`, `Math.atan2`, `Runtime` memory |

**Skip:** opaque `anInt++` counters; JNI **`native`** method names; guesses without call-site proof.

### Unsafe short names

Tokens like `method83` / `method121` may exist on **multiple** classes. Before `\bmethodNNN\b` replace:

```bash
python3 .cursor/skills/void-client-deobfuscate/scripts/check_defs.py method2284 method1913
```

If more than one definition → rename only the defining file + `ThatClass.method` / override chain (`Applet_Sub1` + `client`).

### Rename mechanics

Prefer a small Python pass: longest-old-first, `\b…\b`, skip `"…"` / `'…'` string ranges.

**String literals that are reflection targets must still be updated** (hosts look up members by name). After any rename that might touch camera, viewport, console, or game state, run the reflection gate.

Class renames: update Android stubs under `android/` if shared; iOS prefer:

```bash
cd ios && ./gradlew clean compileJava
```

(Stale `ios/build/generated` breaks builds after renames.)

## Reflection bridge (mandatory gate)

Mobile hosts do **not** call client fields directly. They use `Class.forName` + `getDeclaredField` / `getDeclaredMethod` / `setStaticInt` with **string names**. Failures are swallowed (`catch (Throwable ignored)`), so renames silently kill features:

| Symptom | Broken reflection |
|---------|-------------------|
| 1-finger / right-stick camera dead | `cameraYaw` / `cameraPitch` / `clampCameraAngles` |
| Resize / FS mode wrong | `GlToolkitSub2.anInt7666`, `fullscreenAvailable` |
| Server picker never shows | `Component49.clientState`, `errorCount` |
| Dev console open/close flaky | `openDevConsole` / `closeDevConsole` |

### Hotspots to update with the rename

| File | Role |
|------|------|
| `ios/src/main/java/voidawt/AwtHost.java` | camera orbit, viewport sync, console |
| `android/app/src/main/java/voidawt/AwtHost.java` | same (keep in lockstep with iOS) |
| `android/app/src/main/java/world/gregs/voidosrs/ServerPrefs.java` | `clientState` / JS5 `errorCount` (iOS copies this via Gradle) |

When renaming a field/method/class used there: update **both** AwtHosts (and ServerPrefs if applicable) in the **same lote**. Prefer updating the reflective string + a short comment naming the client member.

### Check before claiming lote done

```bash
python3 .cursor/skills/void-client-deobfuscate/scripts/check_reflection.py
```

Must print `PASS`. If you add a new reflective bridge, extend `EXPECTED` / `STALE_STRINGS` in that script.

## Verify (every lote)

From `void-client/`:

```bash
python3 .cursor/skills/void-client-deobfuscate/scripts/check_reflection.py
./gradlew :client:compileJava
cd ios && ./gradlew compileJava
```

Desktop must be green. iOS must be green before claiming the lote done. After class renames use iOS `clean compileJava`.

Count remaining:

```bash
python3 .cursor/skills/void-client-deobfuscate/scripts/count_methods.py
```

# Scene editor preview and world-position island

The optional scene editor lives under `client/editor/` and keeps the Java unnamed-package convention. The main UI is `SceneEditorUi.java`.

## City Assets panel geometry

`SceneEditorUi` computes the custom City Assets HUD rather than loading a server-defined widget:

- `PANEL_W` is the panel width; `paletteX()` anchors it to the right side of the canvas and `paletteY()` sets its top edge.
- `searchX()` is the inner left edge of the panel.
- `previewY()` is the top edge of the preview box.
- `searchY()`, `listY()`, `doneY()`, `actionY()`, and `listControlsX()` place the search field, result rows, footer actions, Done button, and paging controls.
- `drawPalette(...)` draws the complete City Assets panel; `drawMovePanel(...)` replaces it while Move mode is armed.

When changing layout, adjust these geometry helpers/constants instead of scattering screen coordinates through input handlers. Hit testing uses the same helpers (`hitPalette`, `hitSearch`, `hitDone`, `hitAction`, and `hitListArrow`), so drawing and input must remain aligned.

## Object preview rendering

`drawPreview(...)` delegates ordinary location-object previews to `drawObjectModelPreview(...)`. Do not use `Component119.method2028(...)` as the general object preview path: that path expects a map-scene/interface model ID (`ObjectDefinition.anInt875`), not a normal location object model.

The evidence-backed location-object path is:

1. Load the object definition with `ObjectDefinitionProvider.getObjectDefinition(0, objectId)`.
2. Read the display name from `ObjectDefinition.aString884`; null, empty, or the literal `"null"` should be presented as an unnamed object.
3. Build the location model with `ObjectDefinition.buildLocationModel(...)`, trying the supported object model types as needed.
4. Render `Component245.aClass64_119` using the interface projection and matrix.

The preview's model center is controlled by:

```java
int centerX = x + width / 2;
int centerY = y + PREVIEW_H / 2;
```

Use small explicit preview offsets when tuning visual placement; do not change `SceneObject.x`/`y`, because those are world coordinates. Large models are fitted by measuring `RA() - V()`, `EA() - fa()`, and `G() - HA()` and deriving `previewDepth` from the fixed preview height.

### Matrix rotation units

`MatrixSub1`, `MatrixSub2`, and `MatrixSub3` mask rotation arguments with `0x3fff` and index 14-bit sine/cosine tables. Therefore one full turn is 16384 units:

- `method896(2048)` is approximately 45 degrees.
- `method896(4096)` is approximately 90 degrees.
- `method896(8192)` is approximately 180 degrees.

For the City Assets preview, `method896(...)` is the horizontal orientation adjustment. Keep the pitch setup in `method902(...)` separate from horizontal orientation; `method900(...)` is another matrix-axis rotation and should not be changed casually while tuning the front view.

## Scene object world positions

`SceneObject.java` is the renderer-independent editor model:

- `objectId`: cache object definition ID.
- `x`, `y`: absolute tile coordinates.
- `z`: fine vertical offset.
- `plane`: level, validated from 0 to 3.
- `rotation`: object orientation, masked to the client rotation range.

`drawWorldOverlay(...)` highlights selected objects by passing `selected.x`, `selected.y`, and `selected.plane` to `projectAndBox(...)`. That method converts absolute coordinates with `SceneObjectAdapter.toLocalX/Y(...)`, projects them through `ShaderSub2.method165(...)`, and reads screen coordinates from `Component71.anIntArray6062`.

Changing preview placement and changing an object's world position are intentionally separate operations: preview layout belongs in `SceneEditorUi`, while object placement belongs in `SceneObject`/`SceneObjectAdapter` and the scene store.

## Hot areas (still dense)

| Area | Path hints |
|------|------------|
| Bootstrap / loop | `client/src/client.java`, `Applet_Sub1`, `LoadingManager` |
| Packets | `client/net/packet/PacketReader`, `Buffer` |
| CS2 | `client/script/ClientScriptExecutor` |
| Staging | `client/components/Component*`, `client/misc/DisplayModeManagerContainer*` |
| Toolkit | `client/toolkit/**`, `client/shaders/**` |

Already clarified islands (do not regress names): camera (`cameraYaw`/`cameraPitch`/`clampCameraAngles`/`cameraFocusX`/…), containers (`NodeSub13.itemIds`/`amounts`, `setContainerSlot`), applet lifecycle (`initializeClient`/`pulseGame`/…), loading (`pulseLoading`, `currentLoadingState`), window mode (`fullscreenAvailable`, `getWindowMode`), game FSM (`Component49.clientState`).

## Deploy (only if user asks)

Physical iPad: skill **`run-mobile-device`** → `bash .cursor/skills/run-mobile-device/scripts/ios-device.sh`.

## Anti-patterns

- Renaming without reading call sites
- Global replace of non-unique `methodNNN`
- Renaming JNI natives
- Adding Java packages under `client/`
- Renaming client members used via reflection **without** updating `AwtHost` / `ServerPrefs` strings
- Assuming desktop compile proves mobile input/viewport still works (reflection fails silently)
- Committing unprompted
- Marking “deob complete” while `count_methods.py` still shows thousands
- If the member is looked up by **string reflection** in `voidawt.AwtHost` or `ServerPrefs`, update those strings in the same change (failures are swallowed — camera/viewport/server-picker die silently). Gate: `python3 .cursor/skills/void-client-deobfuscate/scripts/check_reflection.py`.
