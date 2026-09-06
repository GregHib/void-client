import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/** Deterministic command facade for UI, gamepad, and future AI adapters. */
final class SceneEditor {
    enum Mode { GAME, EDITOR, PREVIEW }
    private static final int HISTORY_LIMIT = 100;
    private final SceneStore store;
    private Scene scene = new Scene("default");
    private final Deque<Scene> undo = new ArrayDeque<Scene>();
    private final Deque<Scene> redo = new ArrayDeque<Scene>();
    private long nextId = 1;
    private Mode mode = Mode.GAME;
    private boolean dirty;

    SceneEditor(SceneStore store) { this.store = store; }
    Scene scene() { return scene; }
    Mode mode() { return mode; }
    boolean isDirty() { return dirty; }
    void setMode(Mode mode) { this.mode = mode == null ? Mode.GAME : mode; }

    SceneObject add(int objectId, int x, int y, int z, int plane) {
        final long id = nextId;
        final SceneObject object = new SceneObject(id, objectId, x, y, z, plane);
        change(new Runnable() { public void run() { scene.add(object); }});
        nextId = id + 1;
        return object;
    }

    /**
     * Own a stock LocType: queue a world removal at the tile and add an editor
     * object in one undo frame (so undo restores both).
     */
    SceneObject claimStock(int objectId, int x, int y, int z, int plane, int rotation, int shape) {
        final long id = nextId;
        final SceneObject object = new SceneObject(id, objectId, x, y, z, plane);
        object.rotation = rotation & 3;
        final int rot = rotation & 3;
        final int shp = shape;
        change(new Runnable() {
            public void run() {
                scene.recordRemoval(objectId, x, y, plane, rot, shp);
                scene.add(object);
            }
        });
        nextId = id + 1;
        return object;
    }
    void remove(final long id) {
        change(new Runnable() { public void run() {
            if (scene.remove(id) == null) throw new IllegalArgumentException("object not found: " + id);
        }});
    }
    void move(final long id, final int x, final int y, final int z) {
        change(new Runnable() { public void run() {
            SceneObject o = required(id); o.x = x; o.y = y; o.z = z; o.validate();
        }});
    }
    void nudge(final long id, final float dx, final float dy) {
        change(new Runnable() { public void run() {
            SceneObject object = required(id);
            object.nudge(dx, dy);
            object.validate();
        }});
    }
    void rotate(final long id, final int rotation) {
        change(new Runnable() { public void run() { SceneObject o = required(id); o.rotation = rotation; o.validate(); }});
    }
    void undo() {
        if (!undo.isEmpty()) {
            redo.push(scene);
            while (redo.size() > HISTORY_LIMIT) redo.removeLast();
            scene = undo.pop();
            dirty = true;
        }
    }
    void redo() {
        if (!redo.isEmpty()) {
            undo.push(scene);
            while (undo.size() > HISTORY_LIMIT) undo.removeLast();
            scene = redo.pop();
            dirty = true;
        }
    }
    void save(String name) throws IOException { store.save(name, scene); dirty = false; }
    void load(String name) throws IOException {
        scene = store.load(name);
        undo.clear();
        redo.clear();
        dirty = false;
        nextId = 1;
        for (SceneObject object : scene.objects()) {
            if (object.id + 1 > nextId) {
                nextId = object.id + 1;
            }
        }
    }
    /** Drop every object; preserves scene name / region. Pushes one undo frame. */
    void clearObjects() {
        change(new Runnable() {
            public void run() {
                java.util.ArrayList<Long> ids = new java.util.ArrayList<Long>();
                for (SceneObject object : scene.objects()) {
                    ids.add(Long.valueOf(object.id));
                }
                for (int i = 0; i < ids.size(); i++) {
                    scene.remove(ids.get(i).longValue());
                }
            }
        });
    }
    void autosave() throws IOException { store.autosave(scene); }

    /** Parses only local, deterministic commands; no arbitrary code or file paths are accepted. */
    String command(String input) throws IOException {
        if (input == null) throw new IllegalArgumentException("empty command");
        String[] p = input.trim().split("\\s+");
        if (p.length == 0) throw new IllegalArgumentException("empty command");
        if ("add".equals(p[0]) && p.length == 6) return "added " + add(Integer.parseInt(p[1]), Integer.parseInt(p[2]), Integer.parseInt(p[3]), Integer.parseInt(p[4]), Integer.parseInt(p[5])).id;
        if ("move".equals(p[0]) && p.length == 5) { move(Long.parseLong(p[1]), Integer.parseInt(p[2]), Integer.parseInt(p[3]), Integer.parseInt(p[4])); return "moved"; }
        if ("rotate".equals(p[0]) && p.length == 3) { rotate(Long.parseLong(p[1]), Integer.parseInt(p[2])); return "rotated"; }
        if ("remove".equals(p[0]) && p.length == 2) { remove(Long.parseLong(p[1])); return "removed"; }
        if ("undo".equals(p[0]) && p.length == 1) { undo(); return "undone"; }
        if ("redo".equals(p[0]) && p.length == 1) { redo(); return "redone"; }
        if ("save".equals(p[0]) && p.length == 2) { save(p[1]); return "saved"; }
        throw new IllegalArgumentException("unsupported editor command");
    }

    private SceneObject required(long id) {
        SceneObject o = scene.get(id);
        if (o == null) throw new IllegalArgumentException("object not found: " + id);
        return o;
    }
    private void change(Runnable operation) {
        Scene before = scene.copy();
        operation.run();
        undo.push(before);
        while (undo.size() > HISTORY_LIMIT) undo.removeLast();
        redo.clear();
        dirty = true;
    }
}
