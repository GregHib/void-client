/* Class299_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class299_Sub1_Sub1 extends Class299_Sub1 {
    private int anInt8686;
    static int anInt8687;
    private Class258_Sub2 aClass258_Sub2_8688;
    private int anInt8689;
    private int anInt8690;
    private int anInt8691;
    static int anInt8692;
    private ha_Sub2 aHa_Sub2_8693;
    static long aLong8694;
    private int anInt8695;
    static float aFloat8696;
    private int anInt8697;

    final Class258_Sub2 method2256(byte i) {
        anInt8692++;
        if (i != -121)
            method2256((byte) 33);
        if (aClass258_Sub2_8688 == null) {
            d var_d = ((ha) aHa_Sub2_8693).aD4579;
            Class308.anIntArray3883[3] = anInt8690;
            Class308.anIntArray3883[4] = anInt8686;
            Class308.anIntArray3883[2] = anInt8691;
            Class308.anIntArray3883[5] = anInt8697;
            Class308.anIntArray3883[1] = anInt8695;
            Class308.anIntArray3883[0] = anInt8689;
            boolean bool = false;
            int i_0_ = 0;
            for (int i_1_ = 0; i_1_ < 6; i_1_++) {
                if (!var_d.method4(i ^ 0x1f68, Class308.anIntArray3883[i_1_]))
                    return null;
                Class12 class12
                        = var_d.method3(Class308.anIntArray3883[i_1_], -6662);
                int i_2_ = !((Class12) class12).aBoolean199 ? 128 : 64;
                if (i_0_ < i_2_)
                    i_0_ = i_2_;
                if ((((Class12) class12).aByte205 ^ 0xffffffff) < -1)
                    bool = true;
            }
            for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -7; i_3_++)
                Class341.anIntArrayArray4233[i_3_]
                        = var_d.method5(false, Class308.anIntArray3883[i_3_], 1.0F,
                        i_0_, i_0_, i + 192);
            aClass258_Sub2_8688
                    = new Class258_Sub2(aHa_Sub2_8693, 6407, i_0_, bool,
                    Class341.anIntArrayArray4233);
        }
        return aClass258_Sub2_8688;
    }

    static final void method2260(int i, int i_4_, long l, int i_5_,
                                 boolean bool, Class45 class45, byte i_6_,
                                 int i_7_) {
        do {
            try {
                Class239_Sub14.anInt5994 = 10000;
                Class124.aClass45_1848 = class45;
                Class58.anInt1059 = i_7_;
                Class318_Sub1_Sub4_Sub1.anInt10074 = i;
                Class346.aBoolean4275 = bool;
                Class285.aClass348_Sub16_Sub3_4743 = null;
                Class318.anInt3971 = i_4_;
                anInt8687++;
                Class239_Sub12.aLong5971 = l;
                Class348_Sub43.anInt7068 = 1;
                Class348_Sub40_Sub35.anInt9444 = i_5_;
                if (i_6_ >= 54)
                    break;
                method2260(36, 99, 61L, 90, false, null, (byte) 126, -67);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("dq.E(" + i + ',' + i_4_ + ','
                                + l + ',' + i_5_ + ',' + bool
                                + ','
                                + (class45 != null ? "{...}"
                                : "null")
                                + ',' + i_6_ + ',' + i_7_
                                + ')'));
            }
            break;
        } while (false);
    }

    Class299_Sub1_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_8_, int i_9_,
                       int i_10_, int i_11_, int i_12_) {
        anInt8691 = i_9_;
        anInt8690 = i_10_;
        anInt8697 = i_12_;
        anInt8689 = i;
        anInt8695 = i_8_;
        anInt8686 = i_11_;
        aHa_Sub2_8693 = var_ha_Sub2;
    }
}
