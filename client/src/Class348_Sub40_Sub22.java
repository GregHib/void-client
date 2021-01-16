/* Class348_Sub40_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class348_Sub40_Sub22 extends Class348_Sub40 {
    private int anInt9284 = 1024;
    static Class114 aClass114_9285 = new Class114(104, 1);
    private int[][] anIntArrayArray9286;
    private int[][] anIntArrayArray9287;
    private int anInt9288 = 1024;
    static int anInt9289;
    static int anInt9290;
    private int anInt9291;
    static int anInt9292;
    private int anInt9293 = 0;
    private int anInt9294;
    static int anInt9295;
    static int anInt9296;
    private int[] anIntArray9297;
    private int anInt9298;
    private int anInt9299 = 4;
    private int anInt9300;
    private int anInt9301;
    private int anInt9302;
    static Class304 aClass304_9303 = new Class304(1);
    static Class351 aClass351_9304 = new Class351(20, -1);
    private int anInt9305;

    private final void method3109(byte i) {
        anInt9289++;
        Random random = new Random(anInt9301);
        anInt9298 = anInt9294 / 2;
        anInt9291 = 4096 / anInt9299;
        anInt9300 = 4096 / anInt9301;
        int i_0_ = anInt9291 / 2;
        anIntArray9297 = new int[anInt9301 + 1];
        int i_1_ = anInt9300 / 2;
        anIntArrayArray9287 = new int[anInt9301][1 + anInt9299];
        anIntArrayArray9286 = new int[anInt9301][anInt9299];
        anIntArray9297[0] = 0;
        if (i >= -111)
            method3109((byte) 67);
        for (int i_2_ = 0; i_2_ < anInt9301; i_2_++) {
            if (i_2_ > 0) {
                int i_3_ = anInt9300;
                int i_4_ = ((Class124.method1097((byte) 90, 4096, random)
                        - 2048) * anInt9305
                        >> -1633784916);
                i_3_ += i_4_ * i_1_ >> 48155276;
                anIntArray9297[i_2_] = i_3_ + anIntArray9297[-1 + i_2_];
            }
            anIntArrayArray9287[i_2_][0] = 0;
            for (int i_5_ = 0; anInt9299 > i_5_; i_5_++) {
                if (i_5_ > 0) {
                    int i_6_ = anInt9291;
                    int i_7_ = ((Class124.method1097((byte) 117, 4096, random)
                            - 2048) * anInt9302
                            >> -1511824500);
                    i_6_ += i_0_ * i_7_ >> -176195412;
                    anIntArrayArray9287[i_2_][i_5_]
                            = anIntArrayArray9287[i_2_][i_5_ + -1] + i_6_;
                }
                anIntArrayArray9286[i_2_][i_5_]
                        = (anInt9284 <= 0 ? 4096
                        : (-Class124.method1097((byte) 124, anInt9284, random)
                        + 4096));
            }
            anIntArrayArray9287[i_2_][anInt9299] = 4096;
        }
        anIntArray9297[anInt9301] = 4096;
    }

    public Class348_Sub40_Sub22() {
        super(0, true);
        anInt9294 = 81;
        anInt9302 = 409;
        anInt9305 = 204;
        anInt9301 = 8;
    }

    public static void method3110(int i) {
        aClass351_9304 = null;
        aClass304_9303 = null;
        if (i != -1633784916)
            aClass304_9303 = null;
        aClass114_9285 = null;
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_8_) {
        anInt9292++;
        if (i_8_ != 31015)
            method3111(106, 16);
        int i_9_ = i;
        while_189_:
        do {
            while_188_:
            do {
                while_187_:
                do {
                    while_186_:
                    do {
                        while_185_:
                        do {
                            while_184_:
                            do {
                                do {
                                    if (i_9_ == 0) {
                                        anInt9299
                                                = class348_sub49.method3387(255);
                                        return;
                                    } else {
                                        if (i_9_ != 1) {
                                            if (i_9_ != 2) {
                                                if (i_9_ != 3) {
                                                    if (i_9_ != 4) {
                                                        if (i_9_ != 5) {
                                                            if (i_9_ != 6) {
                                                                if (i_9_ != 7)
                                                                    break while_189_;
                                                            } else
                                                                break while_187_;
                                                            break while_188_;
                                                        }
                                                    } else
                                                        break while_185_;
                                                    break while_186_;
                                                }
                                            } else
                                                break;
                                            break while_184_;
                                        }
                                    }
                                    anInt9301 = class348_sub49.method3387(255);
                                    return;
                                } while (false);
                                anInt9302
                                        = class348_sub49.method3330(842397944);
                                return;
                            } while (false);
                            anInt9305 = class348_sub49.method3330(842397944);
                            return;
                        } while (false);
                        anInt9288 = class348_sub49.method3330(842397944);
                        return;
                    } while (false);
                    anInt9293 = class348_sub49.method3330(842397944);
                    return;
                } while (false);
                anInt9294 = class348_sub49.method3330(842397944);
                return;
            } while (false);
            anInt9284 = class348_sub49.method3330(i_8_ + 842366929);
        } while (false);
    }

    final int[] method3042(int i, int i_10_) {
        anInt9296++;
        int[] is = this.aClass191_7032.method1433(0, i);
        if (this.aClass191_7032.aBoolean2570) {
            int i_11_ = 0;
            int i_12_;
            for (i_12_ = anInt9293 + Class239_Sub18.anIntArray6035[i];
                 i_12_ < 0; i_12_ += 4096) {
                /* empty */
            }
            for (/**/; i_12_ > 4096; i_12_ -= 4096) {
                /* empty */
            }
            for (/**/; i_11_ < anInt9301;
                     i_11_++) {
                if (i_12_ < anIntArray9297[i_11_])
                    break;
            }
            int i_13_ = -1 + i_11_;
            boolean bool = (0x1 & i_11_) == 0;
            int i_14_ = anIntArray9297[i_11_];
            int i_15_ = anIntArray9297[i_11_ - 1];
            if (anInt9298 + i_15_ < i_12_
                    && i_12_ < i_14_ - anInt9298) {
                for (int i_16_ = 0; Class348_Sub40_Sub6.anInt9139 > i_16_;
                     i_16_++) {
                    int i_17_ = 0;
                    int i_18_ = !bool ? -anInt9288 : anInt9288;
                    int i_19_;
                    for (i_19_ = (Class318_Sub6.anIntArray6432[i_16_]
                            + (i_18_ * anInt9291 >> -742925460));
                         i_19_ < 0; i_19_ += 4096) {
                        /* empty */
                    }
                    for (/**/; i_19_ > 4096; i_19_ -= 4096) {
                        /* empty */
                    }
                    for (/**/; i_17_ < anInt9299;
                             i_17_++) {
                        if (anIntArrayArray9287[i_13_][i_17_] > i_19_)
                            break;
                    }
                    int i_20_ = i_17_ - 1;
                    int i_21_ = anIntArrayArray9287[i_13_][i_20_];
                    int i_22_ = anIntArrayArray9287[i_13_][i_17_];
                    if (anInt9298 + i_21_ >= i_19_
                            || i_19_ >= -anInt9298 + i_22_)
                        is[i_16_] = 0;
                    else
                        is[i_16_] = anIntArrayArray9286[i_13_][i_20_];
                }
            } else
                Class214.method1579(is, 0, Class348_Sub40_Sub6.anInt9139, 0);
        }
        if (i_10_ != 255)
            method3110(44);
        return is;
    }

    static final void method3111(int i, int i_23_) {
        anInt9290++;
        if (i_23_ != Class348_Sub15.anInt6769) {
            if (i < 18)
                aClass304_9303 = null;
            Class367_Sub4.anInt7319 = Class348_Sub40_Sub3.anInt9109
                    = Class73.anIntArray4780[i_23_];
            Class290.method2196((byte) -9);
            Class62.anIntArrayArrayArray1116
                    = (new int[4][Class367_Sub4.anInt7319 >> 629360931]
                    [Class348_Sub40_Sub3.anInt9109 >> -1129488413]);
            Class239_Sub8.anIntArrayArray5921
                    = (new int[Class367_Sub4.anInt7319]
                    [Class348_Sub40_Sub3.anInt9109]);
            Class348_Sub42_Sub17.anIntArrayArray9678
                    = (new int[Class367_Sub4.anInt7319]
                    [Class348_Sub40_Sub3.anInt9109]);
            for (int i_24_ = 0; i_24_ < 4; i_24_++)
                Class348_Sub45.aClass361Array7108[i_24_]
                        = Class105_Sub1.method988(Class348_Sub40_Sub3.anInt9109, 1,
                        Class367_Sub4.anInt7319);
            Class289.aByteArrayArrayArray3700
                    = (new byte[4][Class367_Sub4.anInt7319]
                    [Class348_Sub40_Sub3.anInt9109]);
            Class239.method1717(19278, Class348_Sub40_Sub3.anInt9109,
                    Class367_Sub4.anInt7319, 4);
            Class97.method873(Class367_Sub4.anInt7319 >> 1025673859, 21719,
                    Class348_Sub8.aHa6654,
                    Class348_Sub40_Sub3.anInt9109 >> -184361181);
            Class348_Sub15.anInt6769 = i_23_;
        }
    }

    final void method3044(int i) {
        if (i <= 108)
            method3111(-110, -119);
        anInt9295++;
        method3109((byte) -125);
    }
}
