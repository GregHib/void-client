/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class354 {
    static int anInt4352;
    static int anInt4353;
    static int anInt4354;
    private ha_Sub2 aHa_Sub2_4355;
    static int[][][] anIntArrayArrayArray4356;
    static int anInt4357;
    static int anInt4358;
    private d aD4359;
    static int anInt4360;
    private Class60 aClass60_4361 = new Class60(256);

    final void method3463(byte i) {
        anInt4360++;
        aClass60_4361.method590(0);
        if (i != -110)
            aClass60_4361 = null;
    }

    static final byte method3464(char c, boolean bool) {
        anInt4354++;
        if (bool != false)
            method3464('\uffe1', false);
        byte i;
        if ((c <= 0 || c >= 128) && (c < 160 || c > 255)) {
            if ((c ^ 0xffffffff) != -8365) {
                if (c != 8218) {
                    if ((c ^ 0xffffffff) == -403)
                        i = (byte) -125;
                    else if (c == 8222)
                        i = (byte) -124;
                    else if ((c ^ 0xffffffff) == -8231)
                        i = (byte) -123;
                    else if (c == 8224)
                        i = (byte) -122;
                    else if ((c ^ 0xffffffff) == -8226)
                        i = (byte) -121;
                    else if ((c ^ 0xffffffff) != -711) {
                        if ((c ^ 0xffffffff) == -8241)
                            i = (byte) -119;
                        else if (c == 352)
                            i = (byte) -118;
                        else if ((c ^ 0xffffffff) == -8250)
                            i = (byte) -117;
                        else if (c == 338)
                            i = (byte) -116;
                        else if ((c ^ 0xffffffff) != -382) {
                            if (c != 8216) {
                                if ((c ^ 0xffffffff) == -8218)
                                    i = (byte) -110;
                                else if (c != 8220) {
                                    if (c != 8221) {
                                        if (c == 8226)
                                            i = (byte) -107;
                                        else if (c != 8211) {
                                            if (c != 8212) {
                                                if (c == 732)
                                                    i = (byte) -104;
                                                else if (c == 8482)
                                                    i = (byte) -103;
                                                else if (c == 353)
                                                    i = (byte) -102;
                                                else if (c != 8250) {
                                                    if ((c ^ 0xffffffff)
                                                            != -340) {
                                                        if ((c ^ 0xffffffff)
                                                                == -383)
                                                            i = (byte) -98;
                                                        else if ((c
                                                                ^ 0xffffffff)
                                                                == -377)
                                                            i = (byte) -97;
                                                        else
                                                            i = (byte) 63;
                                                    } else
                                                        i = (byte) -100;
                                                } else
                                                    i = (byte) -101;
                                            } else
                                                i = (byte) -105;
                                        } else
                                            i = (byte) -106;
                                    } else
                                        i = (byte) -108;
                                } else
                                    i = (byte) -109;
                            } else
                                i = (byte) -111;
                        } else
                            i = (byte) -114;
                    } else
                        i = (byte) -120;
                } else
                    i = (byte) -126;
            } else
                i = (byte) -128;
        } else
            i = (byte) c;
        return i;
    }

    static final boolean method3465(int i, int i_0_, Class338 class338) {
        anInt4358++;
        Class348_Sub40_Sub4.aClass101_9114.method897
                (((Class338) class338).anIntArray4187[i],
                        ((Class338) class338).anIntArray4191[i],
                        ((Class338) class338).anIntArray4184[i],
                        Class318_Sub1_Sub5_Sub2.anIntArray10172);
        int i_1_ = Class318_Sub1_Sub5_Sub2.anIntArray10172[2];
        if ((i_1_ ^ 0xffffffff) > -51)
            return false;
        ((Class338) class338).aShortArray4194[i]
                = (short) (Class69.anInt1202
                + (Class318_Sub1_Sub5_Sub2.anIntArray10172[0]
                * Class140.anInt1962 / i_1_));
        ((Class338) class338).aShortArray4183[i]
                = (short) ((Class285_Sub2.anInt8498
                * Class318_Sub1_Sub5_Sub2.anIntArray10172[i_0_] / i_1_)
                + Class348_Sub49_Sub2.anInt9759);
        ((Class338) class338).aShortArray4188[i] = (short) i_1_;
        return true;
    }

    static final void method3466(int i) {
        int i_2_ = 22 / ((-2 - i) / 52);
        anInt4352++;
        for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -101; i_3_++)
            Class152.aBooleanArray2076[i_3_] = true;
    }

    final Class258_Sub3 method3467(int i, int i_4_) {
        anInt4357++;
        Object object = aClass60_4361.method583((long) i, -127);
        if (object != null)
            return (Class258_Sub3) object;
        if (!aD4359.method4(-7953, i))
            return null;
        Class12 class12 = aD4359.method3(i, -6662);
        int i_5_ = (!((Class12) class12).aBoolean199
                ? ((ha_Sub2) aHa_Sub2_4355).anInt7712 : 64);
        Class258_Sub3 class258_sub3;
        if (((Class12) class12).aBoolean218 && aHa_Sub2_4355.method3666()) {
            float[] fs = aD4359.method1(i_5_, 0.7F, false, -30824, i_5_, i);
            class258_sub3
                    = new Class258_Sub3(aHa_Sub2_4355, 3553, 34842, i_5_, i_5_,
                    (((Class12) class12).aByte205
                            ^ 0xffffffff) != -1,
                    fs, 6408);
        } else {
            int[] is;
            if ((((Class12) class12).anInt200 ^ 0xffffffff) == -3
                    || !Class251.method1915((byte) 4,
                    ((Class12) class12).aByte213))
                is = aD4359.method6(-21540, i_5_, 0.7F, i, false, i_5_);
            else
                is = aD4359.method5(true, i, 0.7F, i_5_, i_5_, i_4_ + -196);
            class258_sub3
                    = new Class258_Sub3(aHa_Sub2_4355, 3553, 6408, i_5_, i_5_,
                    ((Class12) class12).aByte205 != 0, is, 0,
                    0, false);
        }
        class258_sub3.method1965(((Class12) class12).aBoolean215,
                ((Class12) class12).aBoolean217, 10243);
        if (i_4_ != 256)
            method3466(22);
        aClass60_4361.method582(class258_sub3, (long) i, (byte) -114);
        return class258_sub3;
    }

    public static void method3468(int i) {
        anIntArrayArrayArray4356 = null;
        if (i != -1401)
            anIntArrayArrayArray4356 = null;
    }

    final void method3469(int i) {
        if (i == 8218) {
            anInt4353++;
            aClass60_4361.method578(2, 5);
        }
    }

    Class354(ha_Sub2 var_ha_Sub2, d var_d) {
        try {
            aHa_Sub2_4355 = var_ha_Sub2;
            aD4359 = var_d;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("eo.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ','
                            + (var_d != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }
}
