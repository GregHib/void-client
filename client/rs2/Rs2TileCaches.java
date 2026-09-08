/**
 * Tick-scoped tile-object / ground-item cache stubs.
 * Full queryable streams deferred — {@link Rs2GameObject} / {@link Rs2GroundItem}
 * scan the scene live for MVP.
 */
final class Rs2TileObjectCache {

    private int lastTick = -1;

    Rs2TileObjectCache() {
    }

    void refreshIfNeeded() {
        int tick = OpenGlShader.clientCycle;
        if (tick == lastTick) {
            return;
        }
        lastTick = tick;
        // Scene walk is done on demand in Rs2GameObject.findNearest
    }
}

final class Rs2TileItemCache {

    private int lastTick = -1;

    Rs2TileItemCache() {
    }

    void refreshIfNeeded() {
        int tick = OpenGlShader.clientCycle;
        if (tick == lastTick) {
            return;
        }
        lastTick = tick;
    }
}
