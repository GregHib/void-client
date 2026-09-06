/**
 * Local scene object edited by the optional scene editor.
 *
 * <p>This model deliberately does not depend on the obfuscated renderer classes.
 * It can therefore be persisted and tested without starting the client.</p>
 */
final class SceneObject {
    static final int MAX_ID = 0x7fffffff;

    final long id;
    int objectId;
    int x;
    int y;
    int z;
    int plane;
    int rotation;
    /** Fractional tile offsets applied to the live renderable after placement. */
    float offsetX;
    float offsetY;
    boolean visible = true;
    boolean collision = true;
    String name;

    SceneObject(long id, int objectId, int x, int y, int z, int plane) {
        this.id = id;
        this.objectId = objectId;
        this.x = x;
        this.y = y;
        this.z = z;
        this.plane = plane;
        validate();
    }

    SceneObject copy() {
        SceneObject copy = new SceneObject(id, objectId, x, y, z, plane);
        copy.rotation = rotation;
        copy.offsetX = offsetX;
        copy.offsetY = offsetY;
        copy.visible = visible;
        copy.collision = collision;
        copy.name = name;
        return copy;
    }

    /** Move within a tile; crossing a tile boundary carries into x/y. */
    void nudge(float dx, float dy) {
        if (Float.isNaN(dx) || Float.isInfinite(dx) || Float.isNaN(dy) || Float.isInfinite(dy)) {
            throw new IllegalArgumentException("invalid fractional offset");
        }
        offsetX += dx;
        offsetY += dy;
        normalizeOffsets();
    }


    void validate() {
        if (id < 0 || id > MAX_ID || objectId < 0 || objectId > MAX_ID) {
            throw new IllegalArgumentException("invalid scene object id");
        }
        if (plane < 0 || plane > 3) {
            throw new IllegalArgumentException("plane must be between 0 and 3");
        }
        if (Float.isNaN(offsetX) || Float.isInfinite(offsetX)
                || Float.isNaN(offsetY) || Float.isInfinite(offsetY)) {
            throw new IllegalArgumentException("invalid fractional offset");
        }
        normalizeOffsets();
        rotation &= 2047;
    }

    private void normalizeOffsets() {
        while (offsetX >= 1.0f) {
            x++;
            offsetX -= 1.0f;
        }
        while (offsetX < 0.0f) {
            x--;
            offsetX += 1.0f;
        }
        while (offsetY >= 1.0f) {
            y++;
            offsetY -= 1.0f;
        }
        while (offsetY < 0.0f) {
            y--;
            offsetY += 1.0f;
        }
    }
}
