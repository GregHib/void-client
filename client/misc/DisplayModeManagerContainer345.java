/* DisplayModeManagerContainer345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer345
/**
 * RENAMED from `Class8` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int anInt159;
    int anInt160;
    int anInt161;
    int anInt162;
    static int anInt163;
    static int[] anIntArray164 = {4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
    static NamedInteger aClass364_165;
    static int anInt166 = 0;

    public static void method213(byte i) {
        anIntArray164 = null;
        if (i != -106) method214(null, 18);
        aClass364_165 = null;
    }

    static final int method214(Npc npc, int i) {
        anInt163++;
        NpcComposition class79 = (npc.definition);
        if (class79.anIntArray1377 != null) {
            class79 = class79.method794(DisplayModeManagerContainer58.aClass170_10209, i);
            if (class79 == null) return -1;
        }
        int i_0_ = class79.anInt1364;
        if (i != -1) return 14;
        Component241 class225 = npc.getDefinition((byte) 72);
        if ((npc.anInt10268) != -1 && !(npc.aBoolean10213)) {
            if ((npc.anInt10268) != class225.anInt2919 && (class225.anInt2920 != npc.anInt10268) && (class225.anInt2949 != npc.anInt10268) && (class225.anInt2914 != (npc.anInt10268))) {
                if ((class225.anInt2940 == npc.anInt10268) || (class225.anInt2924 == npc.anInt10268) || (npc.anInt10268 == class225.anInt2947) || (npc.anInt10268 == class225.anInt2958))
                    i_0_ = class79.anInt1395;
            } else i_0_ = class79.anInt1327;
        } else i_0_ = class79.anInt1343;
        return i_0_;
    }

    public DisplayModeManagerContainer345() {
        /* empty */
    }
}
