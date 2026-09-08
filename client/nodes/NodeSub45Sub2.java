/* NodeSub45Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Fallback mouse event ({@link BasicMouseHandler}) when AWT wheel handler is unavailable.
 * Fields mirror {@link NodeSub45} getters.
 */
final class NodeSub45Sub2 extends NodeSub45 {
    /** AWT click count (or 0). */
    int clickCount;
    static int anInt9731;
    static int anInt9732;
    /** Canvas Y. */
    int y;
    /** Enqueue time (client millis). */
    long when;
    static int anInt9735;
    /** See {@link NodeSub45#getEventType}. */
    int eventType;
    static int anInt9737;
    static int anInt9738;
    /** Canvas X. */
    int x;
    static int anInt9740;

    final int getEventType(int i) {
        anInt9731++;
        if (i < 50) this.x = 69;
        return this.eventType;
    }

    static final void method3316(int i, int i_0_) {
        anInt9732++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i_0_, (byte) 105, 3);
        if (i > 108) class348_sub42_sub15.method3251(-16058);
    }

    final int getY(int i) {
        anInt9740++;
        int i_1_ = 49 / ((-61 - i) / 40);
        return this.y;
    }

    final int getX(byte i) {
        anInt9735++;
        if (i > -126) this.x = 25;
        return this.x;
    }

    final long getWhen(byte i) {
        if (i > -79) return 102L;
        anInt9737++;
        return this.when;
    }

    final int getClickCount(int i) {
        if (i != 0) this.x = 66;
        anInt9738++;
        return this.clickCount;
    }
}
