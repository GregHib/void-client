/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class262 {
    static Class45 aClass45_3323;
    static int anInt3324;
    static int anInt3325;
    static Class324 aClass324_3326;
    static int anInt3327;
    static int anInt3328;
    static int anInt3329;
    static int anInt3330;
    static Object anObject3331;
    static int anInt3332;
    static int anInt3333;
    Class348 aClass348_3334 = new Class348();
    static Class190[][] aClass190ArrayArray3335;
    static int anInt3336;
    static int anInt3337;
    static int anInt3338;
    static int anInt3339;
    static int anInt3340;
    static int anInt3341;
    private Class348 aClass348_3342;

    final void method1988(Class262 class262_0_, byte i) {
        if (i != -115)
            method1995(-53);
        method1989((((Class348) ((Class262) this).aClass348_3334)
                        .aClass348_4294),
                false, class262_0_);
        anInt3340++;
    }

    private final void method1989(Class348 class348, boolean bool,
                                  Class262 class262_1_) {
        do {
            try {
                anInt3325++;
                Class348 class348_2_
                        = (((Class348) ((Class262) this).aClass348_3334)
                        .aClass348_4295);
                ((Class348) ((Class262) this).aClass348_3334).aClass348_4295
                        = ((Class348) class348).aClass348_4295;
                ((Class348) ((Class348) class348).aClass348_4295)
                        .aClass348_4294
                        = ((Class262) this).aClass348_3334;
                if (((Class262) this).aClass348_3334 != class348) {
                    ((Class348) class348).aClass348_4295
                            = (((Class348) ((Class262) class262_1_).aClass348_3334)
                            .aClass348_4295);
                    ((Class348) ((Class348) class348).aClass348_4295)
                            .aClass348_4294
                            = class348;
                    ((Class348) ((Class262) class262_1_).aClass348_3334)
                            .aClass348_4295
                            = class348_2_;
                    ((Class348) class348_2_).aClass348_4294
                            = ((Class262) class262_1_).aClass348_3334;
                }
                if (bool == false)
                    break;
                aClass45_3323 = null;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("uh.K("
                                + (class348 != null ? "{...}"
                                : "null")
                                + ',' + bool + ','
                                + (class262_1_ != null
                                ? "{...}" : "null")
                                + ')'));
            }
            break;
        } while (false);
    }

    final Class348 method1990(byte i) {
        anInt3329++;
        if (i < 29)
            aClass348_3342 = null;
        Class348 class348 = aClass348_3342;
        if (((Class262) this).aClass348_3334 == class348) {
            aClass348_3342 = null;
            return null;
        }
        aClass348_3342 = ((Class348) class348).aClass348_4294;
        return class348;
    }

    static final void method1991(float f, float f_3_, float[] fs, int i,
                                 int i_4_, boolean bool, int i_5_, int i_6_,
                                 int i_7_, int i_8_, float f_9_,
                                 float[] fs_10_, int i_11_, int i_12_) {
        do {
            try {
                anInt3338++;
                i_7_ -= i_6_;
                i -= i_4_;
                i_8_ -= i_11_;
                float f_13_ = fs[2] * (float) i + (fs[1] * (float) i_8_
                        + fs[0] * (float) i_7_);
                float f_14_ = ((float) i_7_ * fs[3] + (float) i_8_ * fs[4]
                        + (float) i * fs[5]);
                float f_15_ = fs[8] * (float) i + (fs[6] * (float) i_7_
                        + (float) i_8_ * fs[7]);
                float f_16_;
                float f_17_;
                if ((i_12_ ^ 0xffffffff) != -1) {
                    if ((i_12_ ^ 0xffffffff) == -2) {
                        f_17_ = 0.5F + (f_15_ + f);
                        f_16_ = 0.5F + (f_3_ + f_13_);
                    } else if ((i_12_ ^ 0xffffffff) != -3) {
                        if (i_12_ != 3) {
                            if ((i_12_ ^ 0xffffffff) == -5) {
                                f_16_ = f_15_ + f + 0.5F;
                                f_17_ = -f_14_ + f_9_ + 0.5F;
                            } else {
                                f_16_ = 0.5F + (f + -f_15_);
                                f_17_ = -f_14_ + f_9_ + 0.5F;
                            }
                        } else {
                            f_17_ = -f_14_ + f_9_ + 0.5F;
                            f_16_ = f_13_ + f_3_ + 0.5F;
                        }
                    } else {
                        f_16_ = 0.5F + (-f_13_ + f_3_);
                        f_17_ = -f_14_ + f_9_ + 0.5F;
                    }
                } else {
                    f_16_ = 0.5F + (f_3_ + f_13_);
                    f_17_ = -f_15_ + f + 0.5F;
                }
                if (i_5_ == 1) {
                    float f_18_ = f_16_;
                    f_16_ = -f_17_;
                    f_17_ = f_18_;
                } else if ((i_5_ ^ 0xffffffff) != -3) {
                    if (i_5_ == 3) {
                        float f_19_ = f_16_;
                        f_16_ = f_17_;
                        f_17_ = -f_19_;
                    }
                } else {
                    f_17_ = -f_17_;
                    f_16_ = -f_16_;
                }
                fs_10_[1] = f_17_;
                fs_10_[0] = f_16_;
                if (bool == false)
                    break;
                method1991(0.31271333F, 1.5829445F, null, -17, 88, true, -70,
                        -107, 8, 5, -0.347415F, null, -24, -19);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("uh.B(" + f + ',' + f_3_ + ','
                                + (fs != null ? "{...}"
                                : "null")
                                + ',' + i + ',' + i_4_ + ','
                                + bool + ',' + i_5_ + ','
                                + i_6_ + ',' + i_7_ + ','
                                + i_8_ + ',' + f_9_ + ','
                                + (fs_10_ != null ? "{...}"
                                : "null")
                                + ',' + i_11_ + ',' + i_12_
                                + ')'));
            }
            break;
        } while (false);
    }

    static final void method1992(Class318_Sub1 class318_sub1, int i, int i_20_,
                                 int i_21_) {
        if (i_20_ < Class318_Sub7.anInt6451) {
            Class357 class357
                    = Class147.aClass357ArrayArrayArray2029[i][i_20_ + 1][i_21_];
            if (class357 != null
                    && ((Class357) class357).aClass318_Sub1_Sub1_4402 != null
                    && ((Class357) class357).aClass318_Sub1_Sub1_4402
                    .method2388(-107))
                class318_sub1.method2380(Class9.aHa171, 0, true,
                        (((Class357) class357)
                                .aClass318_Sub1_Sub1_4402),
                        0, (byte) -116, Class270.anInt3465);
        }
        if (i_21_ < Class318_Sub7.anInt6451) {
            Class357 class357
                    = Class147.aClass357ArrayArrayArray2029[i][i_20_][i_21_ + 1];
            if (class357 != null
                    && ((Class357) class357).aClass318_Sub1_Sub1_4402 != null
                    && ((Class357) class357).aClass318_Sub1_Sub1_4402
                    .method2388(-92))
                class318_sub1.method2380(Class9.aHa171, 0, true,
                        (((Class357) class357)
                                .aClass318_Sub1_Sub1_4402),
                        Class270.anInt3465, (byte) -128, 0);
        }
        if (i_20_ < Class318_Sub7.anInt6451
                && i_21_ < Class348_Sub41.anInt7054) {
            Class357 class357 = (Class147.aClass357ArrayArrayArray2029[i]
                    [i_20_ + 1][i_21_ + 1]);
            if (class357 != null
                    && ((Class357) class357).aClass318_Sub1_Sub1_4402 != null
                    && ((Class357) class357).aClass318_Sub1_Sub1_4402
                    .method2388(-107))
                class318_sub1.method2380(Class9.aHa171, 0, true,
                        (((Class357) class357)
                                .aClass318_Sub1_Sub1_4402),
                        Class270.anInt3465, (byte) -117,
                        Class270.anInt3465);
        }
        if (i_20_ < Class318_Sub7.anInt6451 && i_21_ > 0) {
            Class357 class357 = (Class147.aClass357ArrayArrayArray2029[i]
                    [i_20_ + 1][i_21_ - 1]);
            if (class357 != null
                    && ((Class357) class357).aClass318_Sub1_Sub1_4402 != null
                    && ((Class357) class357).aClass318_Sub1_Sub1_4402
                    .method2388(-90))
                class318_sub1.method2380(Class9.aHa171, 0, true,
                        (((Class357) class357)
                                .aClass318_Sub1_Sub1_4402),
                        -Class270.anInt3465, (byte) -116,
                        Class270.anInt3465);
        }
    }

    final Class348 method1993(int i) {
        anInt3336++;
        Class348 class348
                = ((Class348) ((Class262) this).aClass348_3334).aClass348_4295;
        if (((Class262) this).aClass348_3334 == class348) {
            aClass348_3342 = null;
            return null;
        }
        aClass348_3342 = ((Class348) class348).aClass348_4295;
        if (i > -65)
            method1993(67);
        return class348;
    }

    public static void method1994(int i) {
        aClass190ArrayArray3335 = null;
        anObject3331 = null;
        if (i != -13722)
            method2000(-104, 106, null, null);
        aClass45_3323 = null;
        aClass324_3326 = null;
    }

    final Class348 method1995(int i) {
        if (i != 4)
            method2001(null, -30);
        anInt3332++;
        Class348 class348
                = ((Class348) ((Class262) this).aClass348_3334).aClass348_4294;
        if (class348 == ((Class262) this).aClass348_3334) {
            aClass348_3342 = null;
            return null;
        }
        aClass348_3342 = ((Class348) class348).aClass348_4294;
        return class348;
    }

    final void method1996(int i) {
        if (i > 97) {
            anInt3339++;
            for (; ; ) {
                Class348 class348
                        = (((Class348) ((Class262) this).aClass348_3334)
                        .aClass348_4294);
                if (((Class262) this).aClass348_3334 == class348)
                    break;
                class348.method2715((byte) 24);
            }
            aClass348_3342 = null;
        }
    }

    final Class348 method1997(int i) {
        anInt3341++;
        if (i != 8)
            aClass190ArrayArray3335 = null;
        Class348 class348
                = ((Class348) ((Class262) this).aClass348_3334).aClass348_4294;
        if (((Class262) this).aClass348_3334 == class348)
            return null;
        class348.method2715((byte) 114);
        return class348;
    }

    final int method1998(int i) {
        anInt3333++;
        int i_22_ = i;
        Class348 class348
                = ((Class348) ((Class262) this).aClass348_3334).aClass348_4294;
        while (class348 != ((Class262) this).aClass348_3334) {
            class348 = ((Class348) class348).aClass348_4294;
            i_22_++;
        }
        return i_22_;
    }

    final void method1999(Class348 class348, int i) {
        if (((Class348) class348).aClass348_4295 != null)
            class348.method2715((byte) 91);
        anInt3328++;
        ((Class348) class348).aClass348_4294
                = ((Class262) this).aClass348_3334;
        ((Class348) class348).aClass348_4295
                = ((Class348) ((Class262) this).aClass348_3334).aClass348_4295;
        ((Class348) ((Class348) class348).aClass348_4295).aClass348_4294
                = class348;
        if (i != -20180)
            method2001(null, -94);
        ((Class348) ((Class348) class348).aClass348_4294).aClass348_4295
                = class348;
    }

    static final ha method2000(int i, int i_23_, Canvas canvas, d var_d) {
        try {
            anInt3324++;
            if (i != 3)
                method1992(null, -40, 69, -1);
            return new ha_Sub2(canvas, var_d, i_23_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("uh.D(" + i + ',' + i_23_ + ','
                            + (canvas != null ? "{...}"
                            : "null")
                            + ','
                            + (var_d != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method2001(Class348 class348, int i) {
        anInt3330++;
        if (((Class348) class348).aClass348_4295 != null)
            class348.method2715((byte) 63);
        ((Class348) class348).aClass348_4295
                = ((Class262) this).aClass348_3334;
        ((Class348) class348).aClass348_4294
                = ((Class348) ((Class262) this).aClass348_3334).aClass348_4294;
        if (i > -89)
            aClass324_3326 = null;
        ((Class348) ((Class348) class348).aClass348_4295).aClass348_4294
                = class348;
        ((Class348) ((Class348) class348).aClass348_4294).aClass348_4295
                = class348;
    }

    final boolean method2002(byte i) {
        if (i != 18)
            aClass190ArrayArray3335 = null;
        anInt3327++;
        if (((Class262) this).aClass348_3334
                != ((Class348) ((Class262) this).aClass348_3334).aClass348_4294)
            return false;
        return true;
    }

    final Class348 method2003(int i) {
        anInt3337++;
        Class348 class348 = aClass348_3342;
        if (class348 == ((Class262) this).aClass348_3334) {
            aClass348_3342 = null;
            return null;
        }
        int i_24_ = -111 / ((i - -88) / 38);
        aClass348_3342 = ((Class348) class348).aClass348_4295;
        return class348;
    }

    public Class262() {
        ((Class348) ((Class262) this).aClass348_3334).aClass348_4295
                = ((Class262) this).aClass348_3334;
        ((Class348) ((Class262) this).aClass348_3334).aClass348_4294
                = ((Class262) this).aClass348_3334;
    }
}
