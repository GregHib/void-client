/* Class239_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub2 extends Class239 {
    static int anInt5851;
    static int anInt5852;
    static int anInt5853;
    static int anInt5854;
    static int anInt5855;
    static int anInt5856;
    static Class105[] aClass105Array5857;

    final int method1714(int i, int i_0_) {
        anInt5851++;
        if (i != 3)
            return -26;
        return 3;
    }

    final void method1716(boolean bool) {
        anInt5854++;
        ((Class239) this).anInt3138 = method1710(20014);
        if (bool != false)
            aClass105Array5857 = null;
    }

    final int method1710(int i) {
        if (i != 20014)
            method1716(true);
        anInt5853++;
        if (!((Class239) this).aClass348_Sub51_3136.method3425(-76))
            return 0;
        return 1;
    }

    Class239_Sub2(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    public static void method1724(int i) {
        aClass105Array5857 = null;
        if (i != -4)
            aClass105Array5857 = null;
    }

    static final void method1725(int i) {
        anInt5855++;
        int i_1_ = 1024;
        int i_2_ = 3072;
        if (Class305.aBoolean3870) {
            i_2_ = 4096;
            if (Class348_Sub49_Sub1.aBoolean9746)
                i_1_ = 2048;
        }
        if (Class76.aFloat1287 < (float) i_1_)
            Class76.aFloat1287 = (float) i_1_;
        if (Class76.aFloat1287 > (float) i_2_)
            Class76.aFloat1287 = (float) i_2_;
        for (/**/; Class314.aFloat3938 >= 16384.0F;
                 Class314.aFloat3938 -= 16384.0F) {
            /* empty */
        }
        for (/**/; Class314.aFloat3938 < 0.0F;
                 Class314.aFloat3938 += 16384.0F) {
            /* empty */
        }
        int i_3_ = Class130_Sub1.anInt5799 >> 927495497;
        int i_4_ = Class192.anInt2578 >> -170949527;
        int i_5_
                = Class275.method2064(Class130_Sub1.anInt5799, Class355.anInt4372,
                11219, Class192.anInt2578);
        int i_6_ = 0;
        if (i_3_ > 3 && (i_4_ ^ 0xffffffff) < -4
                && -4 + Class367_Sub4.anInt7319 > i_3_
                && Class348_Sub40_Sub3.anInt9109 - 4 > i_4_) {
            for (int i_7_ = i_3_ - 4; i_3_ - -4 >= i_7_; i_7_++) {
                for (int i_8_ = -4 + i_4_; i_8_ <= 4 + i_4_; i_8_++) {
                    int i_9_ = Class355.anInt4372;
                    if ((i_9_ ^ 0xffffffff) > -4
                            && Class79.method802(i_8_, i_7_, true))
                        i_9_++;
                    int i_10_ = 0;
                    if ((((Class237) Class338.aClass237_Sub1_4197)
                            .aByteArrayArrayArray3104) != null
                            && (((Class237) Class338.aClass237_Sub1_4197)
                            .aByteArrayArrayArray3104[i_9_]) != null)
                        i_10_ = 8 * ((((Class237) Class338.aClass237_Sub1_4197)
                                .aByteArrayArrayArray3104[i_9_][i_7_]
                                [i_8_])
                                & 0xff) << 1138837506;
                    if (aa_Sub1.aSArray5191 != null
                            && aa_Sub1.aSArray5191[i_9_] != null) {
                        int i_11_
                                = (i_5_ + i_10_
                                + -aa_Sub1.aSArray5191[i_9_]
                                .method3982((byte) -86, i_8_, i_7_));
                        if (i_6_ < i_11_)
                            i_6_ = i_11_;
                    }
                }
            }
        }
        int i_12_ = 1536 * (i_6_ >> -437446494);
        if ((i_12_ ^ 0xffffffff) < -786433)
            i_12_ = 786432;
        if (i_12_ < i)
            i_12_ = 262144;
        if ((i_12_ ^ 0xffffffff) < (Class348_Sub35.anInt6979 ^ 0xffffffff))
            Class348_Sub35.anInt6979
                    += (i_12_ - Class348_Sub35.anInt6979) / 24;
        else if (Class348_Sub35.anInt6979 > i_12_)
            Class348_Sub35.anInt6979
                    += (-Class348_Sub35.anInt6979 + i_12_) / 80;
    }

    final void method1712(int i, int i_13_) {
        int i_14_ = 87 / ((82 - i) / 35);
        ((Class239) this).anInt3138 = i_13_;
        anInt5852++;
    }

    final int method1726(int i) {
        anInt5856++;
        if (i != -32350)
            aClass105Array5857 = null;
        return ((Class239) this).anInt3138;
    }

    Class239_Sub2(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }
}
