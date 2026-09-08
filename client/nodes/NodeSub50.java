/* NodeSub50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub50
/**
 * RENAMED from `Class348_Sub50` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    static int anInt7210;
    /** Payload string — typically an enum String value. */
    String stringValue;
    static byte[][] aByteArrayArray7212;
    static int anInt7213 = 0;
    static int anInt7214;

    public static void method3418(int i) {
        if (i >= 108) aByteArrayArray7212 = null;
    }

    static final void method3419(int i) {
        ClientSystemInfo.anIntArray6878 = null;
        FriendLoginMessage.anIntArray8785 = null;
        DefinitionSub6.anIntArray9135 = null;
        anInt7210++;
        if (i != 13022) method3418(-79);
        HashNodeSub3.aBoolean9498 = false;
        DisplayModeManagerContainer232.anIntArray4692 = null;
        NodeSub8.anIntArray6655 = null;
    }

    public NodeSub50() {
        /* empty */
    }

    NodeSub50(String string) {
        this.stringValue = string;
    }

    static final int method3420(int i) {
        if (i != 0) method3420(101);
        anInt7214++;
        return DisplayModeManagerContainer207.method3405(2012104999, false);
    }
}
