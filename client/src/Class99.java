/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class99 {
    static boolean[][] aBooleanArrayArray1572;
    static int anInt1573;
    static int[] anIntArray1574 = new int[3];
    static int anInt1575;
    static int anInt1576;

    static final void method880(int i, byte[] is, byte[] is_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        try {
            anInt1575++;
            int i_7_ = -(i >> -1209643998);
            i = -(i & 0x3);
            if (i_2_ != 13880) method880(9, null, null, -128, 85, -75, 62, 85, -51);
            for (int i_8_ = -i_3_; i_8_ < 0; i_8_++) {
                for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
                    is[i_4_++] += is_0_[i_1_++];
                    is[i_4_++] += is_0_[i_1_++];
                    is[i_4_++] += is_0_[i_1_++];
                    is[i_4_++] += is_0_[i_1_++];
                }
                for (int i_10_ = i; i_10_ < 0; i_10_++)
                    is[i_4_++] += is_0_[i_1_++];
                i_4_ += i_5_;
                i_1_ += i_6_;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("me.D(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (is_0_ != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
        }
    }

    static final void method881(Class348_Sub42_Sub13 class348_sub42_sub13, int i, boolean bool, int i_11_) {
        anInt1576++;
        if (Class5_Sub1.aBoolean8335) {
            int i_12_ = 0;
            for (Class348_Sub42_Sub12 class348_sub42_sub12 = ((Class348_Sub42_Sub12) class348_sub42_sub13.aClass107_9621.method1011(-59)); class348_sub42_sub12 != null; class348_sub42_sub12 = ((Class348_Sub42_Sub12) class348_sub42_sub13.aClass107_9621.method1003((byte) 108))) {
                int i_13_ = OutputStream_Sub2.method138(class348_sub42_sub12, false);
                if (i_13_ > i_12_) i_12_ = i_13_;
            }
            i_12_ += 8;
            if (bool == true) {
                Class177.anInt4669 = 16 * (class348_sub42_sub13.anInt9615) + (!Class71.aBoolean1211 ? 22 : 26);
                int i_14_ = 21 + (class348_sub42_sub13.anInt9615) * 16;
                int i_15_ = Class63.anInt1117 + Class135_Sub1.anInt4717;
                if (i_12_ + i_15_ > Class321.anInt4017) i_15_ = -i_12_ + Class135_Sub1.anInt4717;
                if (i_15_ < 0) i_15_ = 0;
                int i_16_ = !Class71.aBoolean1211 ? 31 : 33;
                int i_17_ = 13 + i_11_ + -i_16_;
                if (i_17_ + i_14_ > Class348_Sub42_Sub8_Sub2.anInt10432) i_17_ = Class348_Sub42_Sub8_Sub2.anInt10432 - i_14_;
                Class50_Sub3.anInt5252 = i_15_;
                if (i_17_ < 0) i_17_ = 0;
                Class242.aClass348_Sub42_Sub13_3152 = class348_sub42_sub13;
                Class348_Sub1_Sub1.anInt8806 = i_12_;
                Class373.anInt4534 = i_17_;
            }
        }
    }

    static final void method882(byte i) {
        if (i != 11) method882((byte) -62);
        Class348_Sub40_Sub33.aClass46ArrayArray9427 = new Class46[Class229.aClass45_2978.method414(-1)][];
        anInt1573++;
        Class369_Sub2.aClass46ArrayArray8584 = new Class46[Class229.aClass45_2978.method414(-1)][];
        Class163.aBooleanArray2162 = new boolean[Class229.aClass45_2978.method414(-1)];
    }

    public static void method883(byte i) {
        aBooleanArrayArray1572 = null;
        anIntArray1574 = null;
        int i_18_ = -74 / ((i - 17) / 46);
    }
}
