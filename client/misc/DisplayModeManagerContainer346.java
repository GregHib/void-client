/* DisplayModeManagerContainer346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer346
/**
 * RENAMED from `Class151` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    short[] aShortArray2058;
    static int anInt2059;
    short[] aShortArray2060;
    static int anInt2061 = 0;
    static int[] anIntArray2062 = new int[4];
    static int anInt2063;
    static int anInt2064;
    static int anInt2065;
    static int anInt2066;
    short[] aShortArray2067;
    static Component183 aClass114_2068 = new Component183(68, 6);
    byte[] aByteArray2069;

    public static void method1209(int i) {
        int i_0_ = 95 / ((-21 - i) / 45);
        anIntArray2062 = null;
        aClass114_2068 = null;
    }

    static final boolean method1210(byte i, int i_1_) {
        anInt2066++;
        if (i > -93) anInt2061 = -39;
        return i_1_ == 0 || i_1_ == 2;
    }

    static final void method1211(int i, Component24 class105, int i_2_, DisplayModeManagerContainer57 class46, Shader var_aa, int i_3_, int i_4_, int i_5_) {
        try {
            anInt2064++;
            if (class105 != null) {
                int i_6_;
                if (DefinitionSub21.cameraMode != 4)
                    i_6_ = (0x3fff & (int) Component112.cameraYaw - -CacheNodeSub2.anInt10483);
                else i_6_ = 0x3fff & (int) Component112.cameraYaw;
                int i_7_ = 10 + Math.max(class46.width / 2, class46.height / i_4_);
                int i_8_ = i_5_ * i_5_ - -(i_3_ * i_3_);
                if (i_7_ * i_7_ >= i_8_) {
                    int i_9_ = DisplayModeManagerContainer88.anIntArray1207[i_6_];
                    int i_10_ = DisplayModeManagerContainer88.anIntArray1204[i_6_];
                    if (DefinitionSub21.cameraMode != 4) {
                        i_10_ = 256 * i_10_ / (Component182.anInt9750 - -256);
                        i_9_ = i_9_ * 256 / (Component182.anInt9750 - -256);
                    }
                    int i_11_ = i_5_ * i_10_ + i_3_ * i_9_ >> 14;
                    int i_12_ = i_3_ * i_10_ + -(i_9_ * i_5_) >> 14;
                    class105.method963((i_11_ + (class46.width / 2 + (i_2_ + -(class105.method966() / 2)))), (i - -(class46.height / 2) + (-i_12_ + -(class105.method980() / 2))), var_aa, i_2_, i);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ok.C(" + i + ',' + (class105 != null ? "{...}" : "null") + ',' + i_2_ + ',' + (class46 != null ? "{...}" : "null") + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
        }
    }

    static final void method1212(int i, int i_13_, int i_14_, int i_15_) {
        anInt2059++;
        i = Component192.preferences.aClass239_Sub26_7260.method1838(-32350) * i >> 8;
        if (i_14_ == i_13_ && !DisplayModeManagerContainer238.aBoolean1236) Component65.method960(1);
        else if (i_13_ != -1 && (i_13_ != Component119.anInt3428 || !Component385.method1296(true)) && i != 0 && !DisplayModeManagerContainer238.aBoolean1236) {
            DisplayModeManagerContainer172.method368(i, 18002, false, i_13_, Component54.aClass45_8667, 0, i_15_);
            DefinitionSub17Sub1.method3093(93);
        }
        if (Component119.anInt3428 != i_13_) Component246.aClass348_Sub16_Sub3_2718 = null;
        Component119.anInt3428 = i_13_;
    }

    static final void method1213(String string, String string_16_, int i) {
        try {
            if (i > -48) aClass114_2068 = null;
            anInt2063++;
            RuntimeException_Sub1.anInt4596 = -1;
            Component205.anInt5969 = Loader.skipLobby ? 2 : 1;
            Component72.method1138(string, false, string_16_, (byte) -95);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ok.E(" + (string != null ? "{...}" : "null") + ',' + (string_16_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }
}
