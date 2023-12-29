/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151 {
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
    static Class114 aClass114_2068 = new Class114(68, 6);
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

    static final void method1211(int i, Sprite sprite, int i_2_, Class46 class46, aa var_aa, int i_3_, int i_4_, int i_5_) {
        try {
            anInt2064++;
            if (sprite != null) {
                int i_6_;
                if (Class348_Sub40_Sub21.anInt9282 != 4)
                    i_6_ = (0x3fff & (int) Class314.aFloat3938 - -r_Sub2.anInt10483);
                else i_6_ = 0x3fff & (int) Class314.aFloat3938;
                int i_7_ = 10 + Math.max(class46.anInt709 / 2, class46.anInt789 / i_4_);
                int i_8_ = i_5_ * i_5_ - -(i_3_ * i_3_);
                if (i_7_ * i_7_ >= i_8_) {
                    int i_9_ = Class70.anIntArray1207[i_6_];
                    int i_10_ = Class70.anIntArray1204[i_6_];
                    if (Class348_Sub40_Sub21.anInt9282 != 4) {
                        i_10_ = 256 * i_10_ / (Class348_Sub49_Sub1.anInt9750 - -256);
                        i_9_ = i_9_ * 256 / (Class348_Sub49_Sub1.anInt9750 - -256);
                    }
                    int i_11_ = i_5_ * i_10_ + i_3_ * i_9_ >> 14;
                    int i_12_ = i_3_ * i_10_ + -(i_9_ * i_5_) >> 14;
                    sprite.method963((i_11_ + (class46.anInt709 / 2 + (i_2_ + -(sprite.scaleWidth() / 2)))), (i - -(class46.anInt789 / 2) + (-i_12_ + -(sprite.method980() / 2))), var_aa, i_2_, i);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ok.C(" + i + ',' + (sprite != null ? "{...}" : "null") + ',' + i_2_ + ',' + (class46 != null ? "{...}" : "null") + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
        }
    }

    static final void method1212(int i, int i_13_, int i_14_, int i_15_) {
        anInt2059++;
        i = Class316.aClass348_Sub51_3959.aClass239_Sub26_7260.method1838(-32350) * i >> 8;
        if (i_14_ == i_13_ && !Class74.aBoolean1236) Class104.method960(1);
        else if (i_13_ != -1 && (i_13_ != Class267.anInt3428 || !Class167.method1296(true)) && i != 0 && !Class74.aBoolean1236) {
            Class40.method368(i, 18002, false, i_13_, Class59_Sub2_Sub1.MUSIC, 0, i_15_);
            Class348_Sub40_Sub17_Sub1.method3093(93);
        }
        if (Class267.anInt3428 != i_13_) Class209.aClass348_Sub16_Sub3_2718 = null;
        Class267.anInt3428 = i_13_;
    }

    static final void method1213(String string, String string_16_, int i) {
        try {
            if (i > -48) aClass114_2068 = null;
            anInt2063++;
            RuntimeException_Sub1.anInt4596 = -1;
            Class239_Sub12.anInt5969 = Loader.skipLobby ? 2 : 1;
            Class132.method1138(string, false, string_16_, (byte) -95);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ok.E(" + (string != null ? "{...}" : "null") + ',' + (string_16_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }
}
