/* aa_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aa_Sub2 extends aa {
    static int anInt5194;
    static int anInt5195;
    Interface18_Impl3 anInterface18_Impl3_5196;
    static String[] aStringArray5197 = new String[100];
    static int anInt5198;
    static Class161 aClass161_5199;

    public static void method162(byte i) {
        aStringArray5197 = null;
        if (i >= -67)
            aClass161_5199 = null;
        aClass161_5199 = null;
    }

    static final int method163(int i) {
        anInt5198++;
        if (i != 512)
            method165(122, 62, -125, 72, -74, 116, 43, (byte) 104, 62, -115);
        return Class51.aClass311_897.method2325((byte) -98);
    }

    static final boolean method164(int i, int i_0_, byte i_1_, int i_2_) {
        anInt5195++;
        if (!Class348_Sub40_Sub23.aBoolean9307 || !Class23.aBoolean351)
            return false;
        if (Class225.anInt2946 < 100)
            return false;
        int i_3_ = Class354.anIntArrayArrayArray4356[i][i_0_][i_2_];
        if (i_3_ == -Class234.anInt3049)
            return false;
        if (Class234.anInt3049 == i_3_)
            return true;
        if (Class332.aSArray4142 == aa_Sub1.aSArray5191)
            return false;
        int i_4_ = i_0_ << Class362.anInt4459;
        int i_5_ = i_2_ << Class362.anInt4459;
        if (i_1_ != -97)
            method163(-4);
        if ((Class286_Sub7.method2169
                (i_4_ - -1, i_4_ - (-Class270.anInt3465 - -1), 1 + i_5_, 1 + i_4_,
                        -1 + (i_5_ - -Class270.anInt3465),
                        aa_Sub1.aSArray5191[i].method3982((byte) -86, 1 + i_2_, i_0_),
                        aa_Sub1.aSArray5191[i].method3982((byte) -86, 1 + i_2_,
                                1 + i_0_),
                        aa_Sub1.aSArray5191[i].method3982((byte) -86, i_2_, i_0_),
                        -1 + Class270.anInt3465 + i_5_, false))
                && (Class286_Sub7.method2169
                (1 + i_4_, Class270.anInt3465 + (i_4_ + -1), i_5_ + 1,
                        Class270.anInt3465 + (i_4_ - 1),
                        i_5_ + Class270.anInt3465 - 1,
                        aa_Sub1.aSArray5191[i].method3982((byte) -86, i_2_ - -1,
                                1 + i_0_),
                        aa_Sub1.aSArray5191[i].method3982((byte) -86, i_2_, i_0_ + 1),
                        aa_Sub1.aSArray5191[i].method3982((byte) -86, i_2_, i_0_),
                        1 + i_5_, false))) {
            Class348_Sub23_Sub2.anInt9039++;
            Class354.anIntArrayArrayArray4356[i][i_0_][i_2_]
                    = Class234.anInt3049;
            return true;
        }
        Class354.anIntArrayArrayArray4356[i][i_0_][i_2_] = -Class234.anInt3049;
        return false;
    }

    static final void method165(int i, int i_6_, int i_7_, int i_8_, int i_9_,
                                int i_10_, int i_11_, byte i_12_, int i_13_,
                                int i_14_) {
        anInt5194++;
        if (i_9_ < 512 || i_11_ < 512
                || (-2 + Class367_Sub4.anInt7319) * 512 < i_9_
                || (-2 + Class348_Sub40_Sub3.anInt9109) * 512 < i_11_)
            Class239_Sub21.anIntArray6062[0]
                    = Class239_Sub21.anIntArray6062[1] = -1;
        else if (i_12_ >= 22) {
            int i_15_ = Class275.method2064(i_9_, i, 11219, i_11_) - i_7_;
            if (Class59_Sub1.aBoolean5300)
                Class107.method1010(false, true);
            else {
                Class157.aClass101_2123.method891(i_10_, 0, 0);
                Class348_Sub8.aHa6654.method3638(Class157.aClass101_2123);
            }
            if (!Class305.aBoolean3870)
                Class348_Sub8.aHa6654.da(i_9_, i_15_, i_11_,
                        Class239_Sub21.anIntArray6062);
            else
                Class348_Sub8.aHa6654.HA(i_9_, i_15_, i_11_,
                        Class132.anInt1906,
                        Class239_Sub21.anIntArray6062);
            if (Class59_Sub1.aBoolean5300)
                Class285_Sub1.method2129((byte) 60);
            else {
                Class157.aClass101_2123.method891(-i_10_, 0, 0);
                Class348_Sub8.aHa6654.method3638(Class157.aClass101_2123);
            }
        }
    }

    aa_Sub2(ha_Sub3 var_ha_Sub3, int i, int i_16_, byte[] is) {
        try {
            this.anInterface18_Impl3_5196
                    = var_ha_Sub3.method3944(is, i,
                    Class348_Sub40_Sub38.aClass304_9471,
                    2, false, i_16_);
            this.anInterface18_Impl3_5196.method66(false, false,
                    25688);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("lp.<init>("
                            + (var_ha_Sub3 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_16_ + ','
                            + (is != null ? "{...}" : "null")
                            + ')'));
        }
    }

    aa_Sub2(ha_Sub3 var_ha_Sub3, int i, int i_17_, int[] is) {
        try {
            this.anInterface18_Impl3_5196
                    = var_ha_Sub3.method3839(i_17_, i, -15137, false, is);
            this.anInterface18_Impl3_5196.method66(false, false,
                    25688);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("lp.<init>("
                            + (var_ha_Sub3 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_17_ + ','
                            + (is != null ? "{...}" : "null")
                            + ')'));
        }
    }
}
