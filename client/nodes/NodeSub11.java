/* NodeSub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Keyboard event node produced by {@link KeyFocusHandler}.
 * Implements {@link Interface6} getters over the packed fields below.
 */
final class NodeSub11 extends Node implements Interface6 {
    static int anInt4760;
    /** Typed character ({@code '\0'} if none). */
    char keyChar;
    static int anInt4762;
    static int anInt4763;
    /** Enqueue time (client millis). */
    long when;
    static int anInt4765;
    /** Modifier flags snapshot. */
    int modifiers;
    /** Mapped key code / key index. */
    int keyCode;
    static int anInt4768;
    static int anInt4769;
    static CacheStore aClass45_4770;
    /** See {@link Interface6#getEventType}. */
    int eventType;

    public final int getEventType(int i) {
        if (i != 26276) getEventType(113);
        anInt4769++;
        return this.eventType;
    }

    public final char getKeyChar(byte i) {
        anInt4768++;
        if (i < 8) getEventType(113);
        return this.keyChar;
    }

    public final int getModifiers(int i) {
        anInt4762++;
        if (i != -7616) getWhen((byte) 38);
        return this.modifiers;
    }

    public final long getWhen(byte i) {
        int i_0_ = 17 / ((i - 46) / 58);
        anInt4765++;
        return this.when;
    }

    public static void method2796(byte i) {
        aClass45_4770 = null;
        if (i != 104) method2796((byte) -6);
    }

    static final boolean method2797(String string, byte i) {
        anInt4763++;
        if (string == null) return false;
        for (int i_1_ = 0; (i_1_ < DefinitionSub30.friendCount); i_1_++) {
            if (string.equalsIgnoreCase(Component178.friendNames[i_1_])) return true;
        }
        if (string.equalsIgnoreCase(Component72.localPlayer.username)) return true;
        if (i != -63) return false;
        return false;
    }

    public final int getKeyCode(boolean bool) {
        anInt4760++;
        if (bool != false) return -114;
        return this.keyCode;
    }
}
