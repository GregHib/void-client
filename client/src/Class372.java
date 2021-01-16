/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class372 {
    private ha_Sub3 aHa_Sub3_4526;
    static int anInt4527;
    private d aD4528;
    static int anInt4529;
    static int anInt4530;
    private Class60 aClass60_4531 = new Class60(256);
    static int anInt4532 = 1407;

    final void method3585(int i) {
        anInt4530++;
        if (i == 7271)
            aClass60_4531.method590(0);
    }

    final void method3586(int i) {
        aClass60_4531.method578(2, 5);
        if (i != -16130)
            method3586(-94);
        anInt4527++;
    }

    final Interface18_Impl3 method3587(byte i, int i_0_) {
        anInt4529++;
        Object object = aClass60_4531.method583((long) i_0_, 107);
        if (object != null)
            return (Interface18_Impl3) object;
        if (!aD4528.method4(-7953, i_0_))
            return null;
        if (i > -30)
            anInt4532 = 37;
        Class12 class12 = aD4528.method3(i_0_, -6662);
        int i_1_ = (!((Class12) class12).aBoolean199
                ? ((ha_Sub3) aHa_Sub3_4526).anInt8150 : 64);
        Interface18_Impl3 interface18_impl3;
        if (((Class12) class12).aBoolean218 && aHa_Sub3_4526.method3666()) {
            float[] fs = aD4528.method1(i_1_, 0.7F, false, -30824, i_1_, i_0_);
            interface18_impl3
                    = aHa_Sub3_4526.method3891(fs, i_1_, i_1_,
                    Class108.aClass304_1662, -109,
                    (((Class12) class12).aByte205
                            ^ 0xffffffff) != -1);
        } else {
            int[] is;
            if (((Class12) class12).anInt200 == 2
                    || !Class251.method1915((byte) 4,
                    ((Class12) class12).aByte213))
                is = aD4528.method6(-21540, i_1_, 0.7F, i_0_, false, i_1_);
            else
                is = aD4528.method5(true, i_0_, 0.7F, i_1_, i_1_, 83);
            interface18_impl3
                    = aHa_Sub3_4526.method3839(i_1_, i_1_, -15137,
                    (((Class12) class12).aByte205
                            ^ 0xffffffff) != -1,
                    is);
        }
        interface18_impl3.method66(((Class12) class12).aBoolean217,
                ((Class12) class12).aBoolean215, 25688);
        aClass60_4531.method582(interface18_impl3, (long) i_0_, (byte) -107);
        return interface18_impl3;
    }

    Class372(ha_Sub3 var_ha_Sub3, d var_d) {
        try {
            aHa_Sub3_4526 = var_ha_Sub3;
            aD4528 = var_d;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("fw.<init>("
                            + (var_ha_Sub3 != null ? "{...}"
                            : "null")
                            + ','
                            + (var_d != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }
}
