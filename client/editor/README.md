# Local scene editor

Device-local object scene editor: model + JSON persistence + **live placer** +
**searchable City Assets component** + **right-click edit**. Never writes JS5 and never sends packets.

Placed objects **stay in the world** when you turn the editor off. Only
`ed clear` / Remove clears them. Edits autosave to `~/void-scenes/autosave.json`
and restore on the next login.

## In-game

1. Microbot → **Editor: ON** (or `ed mode editor`).
2. Open the right-side **City Assets** component.
3. Type an asset name in **Search all objects...**, select a result, and inspect its preview.
4. Click **Done** to spawn the selected asset at the player tile and leave editor mode.
5. Click empty ground to place the current asset at another tile.
6. **Right-click** any scenery → **Move** / **Remove** / **Rotate**.
7. **Ctrl+click** scenery → claim + drag (including stock world objects).
8. In **Move**, click destinations repeatedly or use the arrow buttons for one-tile steps; click **Done** to finish.
9. In City Assets, **Save** runs `ed save demo`; **Undo** and **Redo** update the live scene and autosave.
10. Turn **Editor: OFF** — objects remain. Named save: `ed save demo`.

## Persistence

| When | What happens |
|---|---|
| Place / move / rotate / remove | model updates + autosave |
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
| `SceneEditorMenu` | Right-click Move/Remove/Rotate |

## Limits

- Scenery type 10; free `z` / scale stored only
- Stock objects you **Remove** without owning come back on region reload
- City Assets are indexed asynchronously from every cached LocType; search returns up to 100 matches

## Build

```bash
./gradlew :client:compileJava
make desktop-run SERVER_IP=…
```
