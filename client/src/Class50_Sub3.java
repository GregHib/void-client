/* Class50_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Color;

final class Class50_Sub3 extends Class50 {
    private int anInt5236;
    private int anInt5237;
    static int anInt5238;
    static int anInt5239;
    static int anInt5240;
    static int[] anIntArray5241 = new int[14];
    static Color[] aColorArray5242
            = {new Color(16777215), new Color(16777215), new Color(16741381),
            new Color(16741381)};
    private int anInt5243;
    static int anInt5244;
    private int anInt5245;
    private int anInt5246;
    private int anInt5247;
    static int anInt5248;
    private int anInt5249;
    private int anInt5250;
    static int anInt5251;
    static int anInt5252;
    static int anInt5253;
    static int anInt5254;

    static final void method465(int i) {
        if (i != -1636518164)
            anInt5252 = -40;
        Class158.aClass356_4934.method3481(0);
        anInt5251++;
        Class348_Sub42_Sub9_Sub1.aClass356_10442.method3481(0);
    }

    static final void method466(boolean bool, String string, int i, byte i_0_,
                                boolean bool_1_, int i_2_, int i_3_,
                                boolean bool_4_, int i_5_, long l,
                                String string_6_, long l_7_, int i_8_) {
        try {
            anInt5238++;
            if (!Class5_Sub1.aBoolean8335 && Class73.anInt4776 < 500) {
                i_8_ = (i_8_ ^ 0xffffffff) != 0 ? i_8_ : Class362.anInt4458;
                if (i_0_ >= -65)
                    method469((byte) 19);
                Class348_Sub42_Sub12 class348_sub42_sub12
                        = new Class348_Sub42_Sub12(string_6_, string, i_8_, i_5_,
                        i_3_, l_7_, i_2_, i, bool_4_,
                        bool, l, bool_1_);
                ha_Sub2.method3743((byte) 6, class348_sub42_sub12);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("hc.B(" + bool + ','
                            + (string != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_0_ + ','
                            + bool_1_ + ',' + i_2_ + ','
                            + i_3_ + ',' + bool_4_ + ','
                            + i_5_ + ',' + l + ','
                            + (string_6_ != null ? "{...}"
                            : "null")
                            + ',' + l_7_ + ',' + i_8_ + ')'));
        }
    }

    static final void method467(int i, int i_9_, int i_10_) {
        if (i_9_ == -18075) {
            anInt5248++;
            Class348_Sub42_Sub15 class348_sub42_sub15
                    = Class318_Sub9_Sub1.method2516(i, (byte) 105, 1);
            class348_sub42_sub15.method3246(-25490);
            ((Class348_Sub42_Sub15) class348_sub42_sub15).anInt9652 = i_10_;
        }
    }

    static final boolean method468(String string, int i) {
        int i_11_ = -91 % ((-35 - i) / 52);
        anInt5239++;
        return Class174.method1332(true, true, 10, string);
    }

    final void method457(int i, int i_12_, int i_13_) {
        anInt5254++;
        int i_14_ = anInt5246 * i_12_ >> 875302988;
        int i_15_ = anInt5250 * i >> -121302612;
        int i_16_ = anInt5245 * i_12_ >> 621620332;
        int i_17_ = anInt5247 * i >> -1857421396;
        int i_18_ = i_12_ * anInt5236 >> -1636518164;
        int i_19_ = anInt5237 * i >> -300138580;
        int i_20_ = i_12_ * anInt5243 >> -932753684;
        if (i_13_ > -29)
            anInt5252 = -91;
        int i_21_ = anInt5249 * i >> 1645563660;
        Class367_Sub3.method3540(i_15_, i_17_, ((Class50) this).anInt865,
                i_21_, i_16_, i_14_, i_18_, i_19_, i_20_,
                true);
    }

    Class50_Sub3(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_,
                 int i_27_, int i_28_, int i_29_, int i_30_) {
        super(-1, i_29_, i_30_);
        anInt5243 = i_27_;
        anInt5246 = i;
        anInt5250 = i_22_;
        anInt5249 = i_28_;
        anInt5247 = i_24_;
        anInt5236 = i_25_;
        anInt5245 = i_23_;
        anInt5237 = i_26_;
    }

    final void method456(int i, int i_31_, int i_32_) {
        anInt5244++;
        if (i < 87)
            anInt5247 = 18;
    }

    public static void method469(byte i) {
        int i_33_ = -24 / ((i - -12) / 41);
        aColorArray5242 = null;
        anIntArray5241 = null;
    }

    static final short[] method470(short[] is, byte i) {
        anInt5253++;
        if (is == null)
            return null;
        short[] is_34_ = new short[is.length];
        Class214.method1576(is, 0, is_34_, 0, is.length);
        if (i >= -103)
            method470(null, (byte) -35);
        return is_34_;
    }

    final void method455(int i, int i_35_, int i_36_) {
        anInt5240++;
        if (i_36_ >= -98)
            method470(null, (byte) -17);
    }
}
