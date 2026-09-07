# Local scene editor

Device-local object scene editor: model + JSON persistence + **live placer** +
**searchable City Assets component** + **right-click edit**. Never writes JS5 and never sends packets.

Placed objects **stay in the world** when you turn the editor off. Only
`ed clear` / Remove clears them. Edits autosave to `~/void-scenes/autosave.json`
and restore on the next login.

## In-game

1. Microbot → **Editor: ON** (or `ed mode editor`).
2. Open the right-side **City Assets** component.
3. Type an asset name or an exact ID (for example `2365`, `#2365`, or `id:2365`) in **Search all objects...**, select a result, inspect its preview, and use the up/down arrows to advance one visible page of results.
4. Click **Done** to leave editor mode without spawning another asset. Use Enter or click the world while editing to spawn/place the selected asset.
5. Click empty ground to place the current asset at another tile.
6. **Right-click** any scenery → **Move** / **Duplicate** / **Remove** / **Rotate**.
7. **Ctrl+click** scenery → claim + drag (including stock world objects).
8. In **Move**, click destinations repeatedly or use the arrow buttons for one-tile steps; click **Done** to finish.
   Enable **Micro Adjust** to make the arrow buttons move by `0.1` tile instead.
9. In City Assets, **Save** runs `ed save demo`; **Undo** and **Redo** update the live scene and autosave.
10. Turn **Editor: OFF** — objects remain. Named save: `ed save demo`.

## Persistence

| When | What happens |
|---|---|
| Place / duplicate / move / micro-adjust / rotate / remove | model updates + autosave |
| Editor OFF | objects stay live locally; autosave |
| `ed save <name>` (player) | local JSON only |
| `ed save <name>` (**admin**) | local JSON + `scene_place` each object + `scene_flush` → server GameObjects, `data/area/scene/editor.obj-spawns.toml`, JS5 `lX_Y` |
| Walk to new region | auto re-apply from local model |
| Next login | restore `autosave.json` and apply |

Chop / interact only work on **server** objects → turn Editor OFF after an admin save.
## Console

```text
ed mode editor|game
ed spawn 1276
ed apply
ed save demo
ed load demo
ed status
```

## Layers

| Piece | Role |
|---|---|
| `Scene` / `SceneObject` | Versioned model |
| `SceneStore` | `~/void-scenes/*.json` (+ `.bak`) |
| `SceneEditor` | Commands + undo/redo |
| `SceneObjectAdapter` / `LiveSceneBridge` | `SceneManager.method1591` sync |
| `SceneEditorHost` | Console / claim / tick (region + restore) |
| `SceneEditorUi` | Searchable City Assets panel, object preview, selection, Done spawn, click/drag editing |
| `SceneEditorMenu` | Right-click Move/Duplicate/Remove/Rotate |

## Limits

- Scenery type 10; fractional x/y editor movement is available through Micro Adjust
- Stock objects you **Remove** without owning come back on region reload
- City Assets, NPCs, and Items are indexed asynchronously from their cached definitions; searches match names or exact IDs and return up to 400 matches.

## Build

```bash
./gradlew :client:compileJava
make desktop-run SERVER_IP=…
```
