/* NodeSub45Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * AWT-backed mouse event ({@link AwtMouseHandler}).
 * Fields mirror {@link NodeSub45} getters.
 */
final class NodeSub45Sub1 extends NodeSub45 {
    /** Canvas Y. */
    int y;
    /** Enqueue time (client millis). */
    long when;
    /** AWT click count. */
    int clickCount;
    /** See {@link NodeSub45#getEventType}. */
    int eventType;
    /** Canvas X. */
    int x;

    final int getEventType(int i) {
        if (i < 50) return 113;
        return this.eventType;
    }

    final long getWhen(byte i) {
        if (i > -79) getX((byte) -8);
        return this.when;
    }

    final int getY(int i) {
        int i_0_ = 48 % ((i - -61) / 40);
        return this.y;
    }

    final int getClickCount(int i) {
        if (i != 0) return 57;
        return this.clickCount;
    }

    final int getX(byte i) {
        if (i >= -126) return -80;
        return this.x;
    }
}
