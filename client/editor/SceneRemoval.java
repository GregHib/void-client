/**
 * Record that a stock (or previously world) LocType was deleted at a tile.
 * Survives undo via {@link Scene#copy()} and is pushed as {@code scene_remove}
 * on admin save so server collision / JS5 stay in sync.
 */
final class SceneRemoval {
    final int objectId;
    final int x;
    final int y;
    final int plane;
    final int rotation;
    final int shape;

    SceneRemoval(int objectId, int x, int y, int plane, int rotation, int shape) {
        this.objectId = objectId;
        this.x = x;
        this.y = y;
        this.plane = plane;
        this.rotation = rotation & 3;
        this.shape = shape;
    }

    SceneRemoval copy() {
        return new SceneRemoval(objectId, x, y, plane, rotation, shape);
    }

    /** Stable map key — one removal per tile+shape (last wins). */
    long key() {
        return (x & 0x3fffL)
                | ((y & 0x3fffL) << 14)
                | ((plane & 3L) << 28)
                | ((shape & 0x1fL) << 30);
    }
}
