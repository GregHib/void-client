/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class8 {
    int anInt159;
    int anInt160;
    int anInt161;
    int anInt162;
    static int anInt163;
    static int[] anIntArray164 = {4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
    static Class364 aClass364_165;
    static int anInt166 = 0;

    public static void method213(byte i) {
        anIntArray164 = null;
        if (i != -106) method214(null, 18);
        aClass364_165 = null;
    }

    static final int method214(Npc npc, int i) {
        anInt163++;
        NPCDefinition NPCDefinition = (npc.aNPCDefinition_10505);
        if (NPCDefinition.anIntArray1377 != null) {
            NPCDefinition = NPCDefinition.method794(Class318_Sub1_Sub3_Sub3.aClass170_10209, i);
            if (NPCDefinition == null) return -1;
        }
        int i_0_ = NPCDefinition.anInt1364;
        if (i != -1) return 14;
        Class225 class225 = npc.method2422((byte) 72);
        if ((npc.anInt10268) != -1 && !(npc.aBoolean10213)) {
            if ((npc.anInt10268) != class225.anInt2919 && (class225.anInt2920 != npc.anInt10268) && (class225.anInt2949 != npc.anInt10268) && (class225.anInt2914 != (npc.anInt10268))) {
                if ((class225.anInt2940 == npc.anInt10268) || (class225.anInt2924 == npc.anInt10268) || (npc.anInt10268 == class225.anInt2947) || (npc.anInt10268 == class225.anInt2958))
                    i_0_ = NPCDefinition.anInt1395;
            } else i_0_ = NPCDefinition.anInt1327;
        } else i_0_ = NPCDefinition.anInt1343;
        return i_0_;
    }

    public Class8() {
        /* empty */
    }
}
