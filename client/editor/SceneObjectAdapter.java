import java.util.ArrayList;
import java.util.List;

/**
 * Places / removes local editor objects in the live tile graph.
 * <p>
 * Wraps {@link SceneManager#method1591} only — never writes JS5 and never sends
 * packets. Coordinates are absolute world tiles ({@link SceneObject#x}/{@link SceneObject#y});
 * they are converted to the current region-local tile space before placement.
 * <p>
 * Stock placer supports rotation 0–3 and terrain height. Fractional x/y/z and
 * per-instance {@code scale} are applied to the native renderable after placement.
 */
final class SceneObjectAdapter {
    /** {@link SceneManager#method1591} removeCategory for scenery (type 10/11). */
    static final int CATEGORY_SCENERY = 2;
    /** Default place type: interactive scenery. */
    static final int TYPE_SCENERY = 10;
    /** Opaque junk arg — callers of method1591 pass {@code >= 12}. */
    private static final int JUNK = 50;

    private SceneObjectAdapter() {
    }

    /** Absolute world tile → local scene tile X, or {@code Integer.MIN_VALUE} if unknown. */
    static int toLocalX(int absX) {
        return absX - NodeBaseSub2.regionTileX;
    }

    /** Absolute world tile → local scene tile Y. */
    static int toLocalY(int absY) {
        return absY - Component330.regionTileY;
    }

    static boolean inSceneBounds(int localX, int localY) {
        return localX >= 1 && localY >= 1
                && localX <= AbstractShaderSub4.anInt7319 - 2
                && localY <= ParametricDefinition.anInt9109 - 2
                && Component335.aClass357ArrayArrayArray2029 != null
                && Component103.aClass237_Sub1_4197 != null
                && NodeSub8.toolkit != null;
    }

    /**
     * Remove scenery at the object's tile, then place {@code objectId} if {@code >= 0}.
     *
     * @return true when the tile was inside the loaded scene
     */
    static boolean place(SceneObject object) {
        if (object == null || !object.visible) {
            return false;
        }
        int lx = toLocalX(object.x);
        int ly = toLocalY(object.y);
        if (!inSceneBounds(lx, ly)) {
            return false;
        }
        int rot = object.rotation & 3;
        int id = object.objectId;
        SceneManager.method1591(lx, JUNK, CATEGORY_SCENERY, -1, id, TYPE_SCENERY, ly, rot, object.plane);
        try {
            applyFractionalOffset(object, lx, ly);
        } catch (RuntimeException transformFailure) {
            System.out.println("scene-editor transform: " + transformFailure.getMessage());
        }
        return true;
    }

    /** Apply fractional position and per-instance scale to the native renderable. */
    private static void applyFractionalOffset(SceneObject object, int localX, int localY) {
        if (object.offsetX == 0.0f && object.offsetY == 0.0f
                && object.offsetZ == 0.0f && object.scale == 1.0f) {
            return;
        }
        Component327 renderable = DisplayModeManagerContainer249.method1353(
                object.plane, localX, localY, Component327.class);
        if (renderable == null) {
            return;
        }
        renderable.x += Math.round(object.offsetX * 512.0f);
        renderable.y += Math.round(object.offsetY * 512.0f);
        renderable.anInt6382 += Math.round((object.z + object.offsetZ) * 512.0f);

        DisplayModeManagerContainer370 model = null;
        if (renderable instanceof Component349) {
            model = ((Component349) renderable).aClass64_10028;
        } else if (renderable instanceof Component29 && NodeSub8.toolkit != null) {
            Component29 staticObject = (Component29) renderable;
            if (staticObject.editorModel != null) {
                model = staticObject.editorModel;
            } else if (staticObject.aClass235_10045 != null) {
                model = staticObject.aClass235_10045.method1668(false, true, -127, 2048, NodeSub8.toolkit);
            }
        }
        if (model != null && object.scale != 1.0f) {
            int scale = Math.round(object.scale * 128.0f);
            if ((model.ua() & 7) != 7) {
                model = model.createRenderPass((byte) 0, model.ua() | 7, true);
                if (renderable instanceof Component349) {
                    ((Component349) renderable).aClass64_10028 = model;
                } else if (renderable instanceof Component29) {
                    ((Component29) renderable).editorModel = model;
                }
            }
            model.O(scale, scale, scale);
        }
    }

    /** Remove scenery category at the object's absolute tile (no place). */
    static boolean remove(SceneObject object) {
        if (object == null) {
            return false;
        }
        int lx = toLocalX(object.x);
        int ly = toLocalY(object.y);
        if (!inSceneBounds(lx, ly)) {
            return false;
        }
        SceneManager.method1591(lx, JUNK, CATEGORY_SCENERY, -1, -1, TYPE_SCENERY, ly, 0, object.plane);
        // Clear a possible stale editor placement left by an earlier failed resync.
        SceneManager.method1591(lx, JUNK, CATEGORY_SCENERY, -1, -1, TYPE_SCENERY, ly, 0, object.plane);
        return true;
    }

    /** Lookup LocType name for console feedback (may be null). */
    static String nameOf(int objectId) {
        try {
            if (GradientPreset.aClass263_9195 == null) {
                return null;
            }
            ObjectDefinition def = GradientPreset.aClass263_9195.getObjectDefinition(0, objectId);
            return def != null ? def.aString884 : null;
        } catch (Throwable t) {
            return null;
        }
    }
}

/**
 * Keeps previously placed local editor objects in sync with the live scene.
 * On each {@link #resync(Scene)} call: remove last placements, then place current.
 */
final class LiveSceneBridge {
    private static final List<SceneObject> live = new ArrayList<SceneObject>();

    private LiveSceneBridge() {
    }

    static void clearLive() {
        for (int i = 0; i < live.size(); i++) {
            SceneObjectAdapter.remove(live.get(i));
        }
        live.clear();
    }

    /**
     * Re-apply every object in {@code scene}. Returns how many placements
     * succeeded (tile in loaded region).
     */
    static int resync(Scene scene) {
        clearLive();
        if (scene == null) {
            return 0;
        }
        int placed = 0;
        for (SceneObject object : scene.objects()) {
            SceneObject snap = object.copy();
            if (SceneObjectAdapter.place(snap)) {
                live.add(snap);
                placed++;
            }
        }
        return placed;
    }

    static int liveCount() {
        return live.size();
    }
}
