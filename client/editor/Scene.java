import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/** Versioned, local-only collection of objects for the scene editor. */
final class Scene {
    static final int FORMAT_VERSION = 1;
    static final int MAX_OBJECTS = 10000;

    String name;
    int region;
    private final LinkedHashMap<Long, SceneObject> objects = new LinkedHashMap<Long, SceneObject>();
    /** Stock LocTypes deleted from the world (key = {@link SceneRemoval#key()}). */
    private final LinkedHashMap<Long, SceneRemoval> removals = new LinkedHashMap<Long, SceneRemoval>();

    Scene(String name) {
        this.name = name == null || name.length() == 0 ? "default" : name;
    }

    Scene copy() {
        Scene copy = new Scene(name);
        copy.region = region;
        for (SceneObject object : objects.values()) {
            copy.objects.put(object.id, object.copy());
        }
        for (Map.Entry<Long, SceneRemoval> e : removals.entrySet()) {
            copy.removals.put(e.getKey(), e.getValue().copy());
        }
        return copy;
    }

    Collection<SceneObject> objects() {
        return new ArrayList<SceneObject>(objects.values());
    }

    Collection<SceneRemoval> removals() {
        return new ArrayList<SceneRemoval>(removals.values());
    }

    SceneObject get(long id) {
        return objects.get(id);
    }

    void add(SceneObject object) {
        if (object == null) throw new IllegalArgumentException("object is null");
        object.validate();
        if (objects.size() >= MAX_OBJECTS) {
            throw new IllegalArgumentException("scene object limit exceeded");
        }
        if (objects.containsKey(object.id)) {
            throw new IllegalArgumentException("duplicate scene object id: " + object.id);
        }
        objects.put(object.id, object);
    }

    SceneObject remove(long id) {
        return objects.remove(id);
    }

    /**
     * Remember that a world LocType was taken/deleted at this tile so admin save
     * can {@code scene_remove} it (clears server collision + JS5).
     */
    void recordRemoval(int objectId, int x, int y, int plane, int rotation, int shape) {
        SceneRemoval r = new SceneRemoval(objectId, x, y, plane, rotation, shape);
        removals.put(r.key(), r);
    }

    void recordRemoval(SceneObject object) {
        if (object == null) {
            return;
        }
        recordRemoval(object.objectId, object.x, object.y, object.plane,
                object.rotation, SceneObjectAdapter.TYPE_SCENERY);
    }

    void validate() {
        if (name == null || name.length() == 0 || name.length() > 128) {
            throw new IllegalArgumentException("invalid scene name");
        }
        if (region < 0) throw new IllegalArgumentException("invalid region");
        for (Map.Entry<Long, SceneObject> entry : objects.entrySet()) {
            if (entry.getKey().longValue() != entry.getValue().id) {
                throw new IllegalArgumentException("invalid scene object index");
            }
            entry.getValue().validate();
        }
    }
}
