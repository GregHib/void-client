/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class233 {
    static float[] aFloatArray3015 = new float[16];
    static int anInt3016;
    static int anInt3017;
    static int anInt3018;
    static int anInt3019;
    private final Class348_Sub49_Sub1 aClass348_Sub49_Sub1_3020;
    static int anInt3021;
    static Class107 aClass107_3022 = new Class107();
    static int anInt3023;
    private final float[] aFloatArray3024 = new float[16];
    private Class123 aClass123_3025;
    private final int anInt3026;
    private Interface2 anInterface2_3027;
    private Class123 aClass123_3028;
    private Class123 aClass123_3029;
    private final Class318_Sub9_Sub2[][] aClass318_Sub9_Sub2ArrayArray3030;
    private final Class318_Sub9_Sub2[][] aClass318_Sub9_Sub2ArrayArray3031;
    private final int[] anIntArray3032;
    private final int[] anIntArray3033;
    private int anInt3034;
    private final int[] anIntArray3035;

    private final void method1649(ha_Sub2 var_ha_Sub2, int i, int i_0_) {
        anInt3019++;
        Class86.aFloat1478 = var_ha_Sub2.aFloat7768;
        if (i_0_ != 24484)
            method1655(null, -66, 67);
        var_ha_Sub2.method3789((byte) -119, (float) i);
        var_ha_Sub2.method3760(i_0_ + -24483);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        var_ha_Sub2.method3748(0, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    private final void method1650(ha_Sub2 var_ha_Sub2, byte i) {
        var_ha_Sub2.method3748(0, true);
        anInt3016++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (i != -5)
            aFloatArray3015 = null;
        if (Class86.aFloat1478 != var_ha_Sub2.aFloat7768)
            var_ha_Sub2.xa(Class86.aFloat1478);
    }

    final void method1651(ha_Sub2 var_ha_Sub2, byte i, int i_1_,
                          Class98 class98) {
        try {
            anInt3017++;
            if (var_ha_Sub2.aClass101_Sub3_7760 != null) {
                if (i_1_ >= 0)
                    method1649(var_ha_Sub2, i_1_, 24484);
                else
                    method1652(false, var_ha_Sub2);
                float f = (var_ha_Sub2.aClass101_Sub3_7760
                        .aFloat5756);
                float f_2_ = (var_ha_Sub2.aClass101_Sub3_7760
                        .aFloat5754);
                float f_3_ = (var_ha_Sub2.aClass101_Sub3_7760
                        .aFloat5784);
                float f_4_ = (var_ha_Sub2.aClass101_Sub3_7760
                        .aFloat5751);
                try {
                    int i_5_ = 0;
                    int i_6_ = 2147483647;
                    int i_7_ = 0;
                    Class318_Sub9 class318_sub9
                            = (class98.aClass88_1569
                            .aClass318_Sub9_1503);
                    for (Class318_Sub9 class318_sub9_8_
                         = (class318_sub9
                            .aClass318_Sub9_6469);
                         class318_sub9_8_ != class318_sub9;
                         class318_sub9_8_ = (class318_sub9_8_
                                 .aClass318_Sub9_6469)) {
                        Class318_Sub9_Sub2 class318_sub9_sub2
                                = (Class318_Sub9_Sub2) class318_sub9_8_;
                        int i_9_
                                = (int) (f_4_
                                + ((float) (class318_sub9_sub2.anInt8796
                                >> -271966900) * f_2_
                                + (float) ((class318_sub9_sub2
                                .anInt8791)
                                >> 1348930796) * f
                                + (float) ((class318_sub9_sub2
                                .anInt8789)
                                >> 643267468) * f_3_));
                        if (i_7_ < i_9_)
                            i_7_ = i_9_;
                        if (i_6_ > i_9_)
                            i_6_ = i_9_;
                        anIntArray3032[i_5_++] = i_9_;
                    }
                    int i_10_ = i_7_ - i_6_;
                    int i_11_;
                    if ((2 + i_10_ ^ 0xffffffff) < -1601) {
                        i_11_
                                = 1 - -Class299.method2253(i_10_, -86) - anInt3026;
                        i_10_ = (i_10_ >> i_11_) + 2;
                    } else {
                        i_10_ += 2;
                        i_11_ = 0;
                    }
                    i_5_ = 0;
                    Class318_Sub9 class318_sub9_12_
                            = class318_sub9.aClass318_Sub9_6469;
                    int i_13_ = -2;
                    if (i > -23)
                        aClass107_3022 = null;
                    boolean bool = true;
                    boolean bool_14_ = true;
                    while (class318_sub9 != class318_sub9_12_) {
                        anInt3034 = 0;
                        for (int i_15_ = 0;
                             (i_15_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff);
                             i_15_++)
                            anIntArray3033[i_15_] = 0;
                        for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -65;
                             i_16_++)
                            anIntArray3035[i_16_] = 0;
                        for (/**/; class318_sub9 != class318_sub9_12_;
                                 class318_sub9_12_
                                         = (class318_sub9_12_
                                         .aClass318_Sub9_6469)) {
                            Class318_Sub9_Sub2 class318_sub9_sub2
                                    = (Class318_Sub9_Sub2) class318_sub9_12_;
                            if (bool_14_) {
                                bool = class318_sub9_sub2.aBoolean8794;
                                i_13_ = class318_sub9_sub2.anInt8792;
                                bool_14_ = false;
                            }
                            if ((i_5_ ^ 0xffffffff) < -1
                                    && ((class318_sub9_sub2
                                    .anInt8792) != i_13_
                                    || (class318_sub9_sub2.aBoolean8794
                                    == !bool))) {
                                bool_14_ = true;
                                break;
                            }
                            int i_17_
                                    = anIntArray3032[i_5_++] + -i_6_ >> i_11_;
                            if ((i_17_ ^ 0xffffffff) > -1601) {
                                if ((anIntArray3033[i_17_] ^ 0xffffffff) > -65)
                                    aClass318_Sub9_Sub2ArrayArray3031
                                            [i_17_][anIntArray3033[i_17_]++]
                                            = class318_sub9_sub2;
                                else {
                                    if (anIntArray3033[i_17_] == 64) {
                                        if (anInt3034 == 64)
                                            continue;
                                        anIntArray3033[i_17_]
                                                += anInt3034++ + 1;
                                    }
                                    aClass318_Sub9_Sub2ArrayArray3030
                                            [-1 + (-64 + anIntArray3033[i_17_])]
                                            [anIntArray3035[(anIntArray3033[i_17_]
                                            - 64 + -1)]++]
                                            = class318_sub9_sub2;
                                }
                            }
                        }
                        if ((i_13_ ^ 0xffffffff) > -1)
                            var_ha_Sub2.method3757(-1, -124);
                        else
                            var_ha_Sub2.method3757(i_13_, -100);
                        if (!bool || (Class86.aFloat1478
                                == var_ha_Sub2.aFloat7768)) {
                            if (var_ha_Sub2.aFloat7768 != 1.0F)
                                var_ha_Sub2.xa(1.0F);
                        } else
                            var_ha_Sub2.xa(Class86.aFloat1478);
                        method1655(var_ha_Sub2, i_10_, 785980556);
                    }
                } catch (Exception exception) {
                    /* empty */
                }
                method1650(var_ha_Sub2, (byte) -5);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("sn.G("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_1_ + ','
                            + (class98 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    private final void method1652(boolean bool, ha_Sub2 var_ha_Sub2) {
        Class86.aFloat1478 = var_ha_Sub2.aFloat7768;
        anInt3021++;
        var_ha_Sub2.method3784((byte) -62);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        var_ha_Sub2.method3748(0, bool);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    public static void method1653(int i) {
        aClass107_3022 = null;
        aFloatArray3015 = null;
        if (i != 1489574736)
            aClass107_3022 = null;
    }

    final void method1654(int i, ha_Sub2 var_ha_Sub2) {
        if (i == 643267468) {
            anInt3023++;
            anInterface2_3027
                    = var_ha_Sub2.method3731(2, true, 24, null, 196584);
            aClass123_3025 = new Class123(anInterface2_3027, 5126, 2, 0);
            aClass123_3029 = new Class123(anInterface2_3027, 5126, 3, 8);
            aClass123_3028 = new Class123(anInterface2_3027, 5121, 4, 20);
        }
    }

    private final void method1655(ha_Sub2 var_ha_Sub2, int i, int i_18_) {
        anInt3018++;
        if (i_18_ == 785980556) {
            OpenGL.glGetFloatv(2982, aFloatArray3024, 0);
            float f = aFloatArray3024[0];
            float f_19_ = aFloatArray3024[4];
            float f_20_ = aFloatArray3024[8];
            float f_21_ = aFloatArray3024[1];
            float f_22_ = aFloatArray3024[5];
            float f_23_ = aFloatArray3024[9];
            float f_24_ = f_21_ + f;
            float f_25_ = f_22_ + f_19_;
            float f_26_ = f_23_ + f_20_;
            float f_27_ = f - f_21_;
            float f_28_ = -f_22_ + f_19_;
            float f_29_ = -f_23_ + f_20_;
            float f_30_ = -f + f_21_;
            float f_31_ = -f_19_ + f_22_;
            aClass348_Sub49_Sub1_3020.anInt7197 = 0;
            float f_32_ = -f_20_ + f_23_;
            if (!var_ha_Sub2.aBoolean7775) {
                for (int i_33_ = -1 + i; i_33_ >= 0; i_33_--) {
                    int i_34_ = ((anIntArray3033[i_33_] ^ 0xffffffff) >= -65
                            ? anIntArray3033[i_33_] : 64);
                    if (i_34_ > 0) {
                        for (int i_35_ = -1 + i_34_;
                             (i_35_ ^ 0xffffffff) <= -1; i_35_--) {
                            Class318_Sub9_Sub2 class318_sub9_sub2
                                    = (aClass318_Sub9_Sub2ArrayArray3031[i_33_]
                                    [i_35_]);
                            int i_36_
                                    = (class318_sub9_sub2
                                    .anInt8790);
                            byte i_37_ = (byte) (i_36_ >> 1489574736);
                            byte i_38_ = (byte) (i_36_ >> 744331240);
                            byte i_39_ = (byte) i_36_;
                            byte i_40_ = (byte) (i_36_ >>> 630665784);
                            float f_41_
                                    = (float) (class318_sub9_sub2.anInt8791
                                    >> 662455084);
                            float f_42_
                                    = (float) (class318_sub9_sub2.anInt8796
                                    >> -1266192340);
                            float f_43_
                                    = (float) (class318_sub9_sub2.anInt8789
                                    >> -1918646804);
                            int i_44_
                                    = ((class318_sub9_sub2
                                    .anInt8793)
                                    >> 145880268);
                            aClass348_Sub49_Sub1_3020.method3399(18291, 0.0F);
                            aClass348_Sub49_Sub1_3020.method3399(18291, 0.0F);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, (float) -i_44_ * f_24_ + f_41_);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, (float) -i_44_ * f_25_ + f_42_);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, f_26_ * (float) -i_44_ + f_43_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_37_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_38_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_39_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_40_);
                            aClass348_Sub49_Sub1_3020.method3399(18291, 1.0F);
                            aClass348_Sub49_Sub1_3020.method3399(18291, 0.0F);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, f_41_ + f_27_ * (float) i_44_);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, f_42_ + f_28_ * (float) i_44_);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, f_43_ + f_29_ * (float) i_44_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_37_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_38_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_39_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_40_);
                            aClass348_Sub49_Sub1_3020.method3399(18291, 1.0F);
                            aClass348_Sub49_Sub1_3020
                                    .method3399(i_18_ + -785962265, 1.0F);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, (float) i_44_ * f_24_ + f_41_);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, f_42_ + (float) i_44_ * f_25_);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (i_18_ ^ 0x2ed95bff,
                                            f_43_ + f_26_ * (float) i_44_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_37_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_38_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_39_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_40_);
                            aClass348_Sub49_Sub1_3020.method3399(18291, 0.0F);
                            aClass348_Sub49_Sub1_3020
                                    .method3399(i_18_ + -785962265, 1.0F);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, f_41_ + f_30_ * (float) i_44_);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (18291, (float) i_44_ * f_31_ + f_42_);
                            aClass348_Sub49_Sub1_3020.method3399
                                    (i_18_ ^ 0x2ed95bff,
                                            (float) i_44_ * f_32_ + f_43_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_37_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_38_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_39_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_40_);
                        }
                        if (anIntArray3033[i_33_] > 64) {
                            int i_45_ = -65 + anIntArray3033[i_33_];
                            for (int i_46_ = -1 + anIntArray3035[i_45_];
                                 i_46_ >= 0; i_46_--) {
                                Class318_Sub9_Sub2 class318_sub9_sub2
                                        = (aClass318_Sub9_Sub2ArrayArray3030[i_45_]
                                        [i_46_]);
                                int i_47_ = (class318_sub9_sub2
                                        .anInt8790);
                                byte i_48_ = (byte) (i_47_ >> -677345808);
                                byte i_49_ = (byte) (i_47_ >> -641259768);
                                byte i_50_ = (byte) i_47_;
                                byte i_51_ = (byte) (i_47_ >>> -1739606664);
                                float f_52_
                                        = (float) (class318_sub9_sub2.anInt8791
                                        >> -259728660);
                                float f_53_
                                        = (float) (class318_sub9_sub2.anInt8796
                                        >> 785980556);
                                float f_54_
                                        = (float) (class318_sub9_sub2.anInt8789
                                        >> 1677319308);
                                int i_55_ = (class318_sub9_sub2.anInt8793
                                        >> 1896095500);
                                aClass348_Sub49_Sub1_3020
                                        .method3399(i_18_ + -785962265, 0.0F);
                                aClass348_Sub49_Sub1_3020.method3399(18291,
                                        0.0F);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (i_18_ ^ 0x2ed95bff,
                                                f_52_ + (float) -i_55_ * f_24_);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (18291, f_53_ + f_25_ * (float) -i_55_);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (18291, f_54_ + f_26_ * (float) -i_55_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_48_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_49_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_50_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_51_);
                                aClass348_Sub49_Sub1_3020.method3399(18291,
                                        1.0F);
                                aClass348_Sub49_Sub1_3020.method3399(18291,
                                        0.0F);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (i_18_ ^ 0x2ed95bff,
                                                f_27_ * (float) i_55_ + f_52_);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (18291, (float) i_55_ * f_28_ + f_53_);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (18291, f_29_ * (float) i_55_ + f_54_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_48_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_49_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_50_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_51_);
                                aClass348_Sub49_Sub1_3020.method3399(18291,
                                        1.0F);
                                aClass348_Sub49_Sub1_3020
                                        .method3399(i_18_ ^ 0x2ed95bff, 1.0F);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (i_18_ ^ 0x2ed95bff,
                                                (float) i_55_ * f_24_ + f_52_);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (18291, (float) i_55_ * f_25_ + f_53_);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (18291, (float) i_55_ * f_26_ + f_54_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_48_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_49_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_50_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_51_);
                                aClass348_Sub49_Sub1_3020
                                        .method3399(i_18_ ^ 0x2ed95bff, 0.0F);
                                aClass348_Sub49_Sub1_3020.method3399(18291,
                                        1.0F);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (i_18_ + -785962265,
                                                (float) i_55_ * f_30_ + f_52_);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (18291, (float) i_55_ * f_31_ + f_53_);
                                aClass348_Sub49_Sub1_3020.method3399
                                        (18291, (float) i_55_ * f_32_ + f_54_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_48_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_49_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_50_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_51_);
                            }
                        }
                    }
                }
            } else {
                for (int i_56_ = i - 1; i_56_ >= 0; i_56_--) {
                    int i_57_ = ((anIntArray3033[i_56_] ^ 0xffffffff) < -65
                            ? 64 : anIntArray3033[i_56_]);
                    if (i_57_ > 0) {
                        for (int i_58_ = -1 + i_57_;
                             (i_58_ ^ 0xffffffff) <= -1; i_58_--) {
                            Class318_Sub9_Sub2 class318_sub9_sub2
                                    = (aClass318_Sub9_Sub2ArrayArray3031[i_56_]
                                    [i_58_]);
                            int i_59_
                                    = (class318_sub9_sub2
                                    .anInt8790);
                            byte i_60_ = (byte) (i_59_ >> -319015984);
                            byte i_61_ = (byte) (i_59_ >> 104964232);
                            byte i_62_ = (byte) i_59_;
                            byte i_63_ = (byte) (i_59_ >>> -900582568);
                            float f_64_
                                    = (float) (class318_sub9_sub2.anInt8791
                                    >> 452963788);
                            float f_65_
                                    = (float) (class318_sub9_sub2.anInt8796
                                    >> -2131197972);
                            float f_66_
                                    = (float) (class318_sub9_sub2.anInt8789
                                    >> 1052672716);
                            int i_67_
                                    = ((class318_sub9_sub2
                                    .anInt8793)
                                    >> 1855056108);
                            aClass348_Sub49_Sub1_3020.method3400(0.0F,
                                    (byte) -88);
                            aClass348_Sub49_Sub1_3020.method3400(0.0F,
                                    (byte) -96);
                            aClass348_Sub49_Sub1_3020.method3400
                                    ((float) -i_67_ * f_24_ + f_64_, (byte) -96);
                            aClass348_Sub49_Sub1_3020.method3400
                                    (f_65_ + f_25_ * (float) -i_67_, (byte) -84);
                            aClass348_Sub49_Sub1_3020.method3400
                                    (f_66_ + f_26_ * (float) -i_67_, (byte) -119);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_60_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_61_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_62_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_63_);
                            aClass348_Sub49_Sub1_3020.method3400(1.0F,
                                    (byte) -114);
                            aClass348_Sub49_Sub1_3020.method3400(0.0F,
                                    (byte) -116);
                            aClass348_Sub49_Sub1_3020.method3400
                                    ((float) i_67_ * f_27_ + f_64_, (byte) -121);
                            aClass348_Sub49_Sub1_3020.method3400
                                    ((float) i_67_ * f_28_ + f_65_, (byte) -95);
                            aClass348_Sub49_Sub1_3020.method3400
                                    (f_66_ + (float) i_67_ * f_29_, (byte) -78);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_60_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_61_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_62_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_63_);
                            aClass348_Sub49_Sub1_3020.method3400(1.0F,
                                    (byte) -128);
                            aClass348_Sub49_Sub1_3020.method3400(1.0F,
                                    (byte) -91);
                            aClass348_Sub49_Sub1_3020.method3400
                                    (f_64_ + f_24_ * (float) i_67_, (byte) -101);
                            aClass348_Sub49_Sub1_3020.method3400
                                    (f_25_ * (float) i_67_ + f_65_, (byte) -128);
                            aClass348_Sub49_Sub1_3020.method3400
                                    (f_66_ + (float) i_67_ * f_26_, (byte) -123);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_60_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_61_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_62_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_63_);
                            aClass348_Sub49_Sub1_3020.method3400(0.0F,
                                    (byte) -94);
                            aClass348_Sub49_Sub1_3020.method3400(1.0F,
                                    (byte) -101);
                            aClass348_Sub49_Sub1_3020.method3400
                                    (f_30_ * (float) i_67_ + f_64_, (byte) -84);
                            aClass348_Sub49_Sub1_3020.method3400
                                    (f_65_ + f_31_ * (float) i_67_, (byte) -87);
                            aClass348_Sub49_Sub1_3020.method3400
                                    (f_32_ * (float) i_67_ + f_66_, (byte) -120);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_60_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_61_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_62_);
                            aClass348_Sub49_Sub1_3020.method3378(false, i_63_);
                        }
                        if ((anIntArray3033[i_56_] ^ 0xffffffff) < -65) {
                            int i_68_ = -64 + anIntArray3033[i_56_] - 1;
                            for (int i_69_ = anIntArray3035[i_68_] - 1;
                                 (i_69_ ^ 0xffffffff) <= -1; i_69_--) {
                                Class318_Sub9_Sub2 class318_sub9_sub2
                                        = (aClass318_Sub9_Sub2ArrayArray3030[i_68_]
                                        [i_69_]);
                                int i_70_ = (class318_sub9_sub2
                                        .anInt8790);
                                byte i_71_ = (byte) (i_70_ >> 1542759504);
                                byte i_72_ = (byte) (i_70_ >> -755379768);
                                byte i_73_ = (byte) i_70_;
                                byte i_74_ = (byte) (i_70_ >>> 1724620856);
                                float f_75_
                                        = (float) (class318_sub9_sub2.anInt8791
                                        >> 632083564);
                                float f_76_
                                        = (float) (class318_sub9_sub2.anInt8796
                                        >> -551087476);
                                float f_77_
                                        = (float) (class318_sub9_sub2.anInt8789
                                        >> 1855739532);
                                int i_78_ = (class318_sub9_sub2.anInt8793
                                        >> 1572201996);
                                aClass348_Sub49_Sub1_3020
                                        .method3400(0.0F, (byte) -77);
                                aClass348_Sub49_Sub1_3020
                                        .method3400(0.0F, (byte) -103);
                                aClass348_Sub49_Sub1_3020.method3400
                                        ((float) -i_78_ * f_24_ + f_75_,
                                                (byte) -79);
                                aClass348_Sub49_Sub1_3020.method3400
                                        (f_76_ + f_25_ * (float) -i_78_,
                                                (byte) -102);
                                aClass348_Sub49_Sub1_3020.method3400
                                        (f_77_ + f_26_ * (float) -i_78_,
                                                (byte) -79);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_71_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_72_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_73_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_74_);
                                aClass348_Sub49_Sub1_3020
                                        .method3400(1.0F, (byte) -119);
                                aClass348_Sub49_Sub1_3020
                                        .method3400(0.0F, (byte) -118);
                                aClass348_Sub49_Sub1_3020.method3400
                                        ((float) i_78_ * f_27_ + f_75_,
                                                (byte) -126);
                                aClass348_Sub49_Sub1_3020.method3400
                                        (f_76_ + f_28_ * (float) i_78_,
                                                (byte) -103);
                                aClass348_Sub49_Sub1_3020.method3400
                                        (f_77_ + (float) i_78_ * f_29_,
                                                (byte) -94);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_71_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_72_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_73_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_74_);
                                aClass348_Sub49_Sub1_3020
                                        .method3400(1.0F, (byte) -128);
                                aClass348_Sub49_Sub1_3020
                                        .method3400(1.0F, (byte) -127);
                                aClass348_Sub49_Sub1_3020.method3400
                                        (f_24_ * (float) i_78_ + f_75_,
                                                (byte) -125);
                                aClass348_Sub49_Sub1_3020.method3400
                                        (f_25_ * (float) i_78_ + f_76_,
                                                (byte) -98);
                                aClass348_Sub49_Sub1_3020.method3400
                                        (f_77_ + (float) i_78_ * f_26_,
                                                (byte) -119);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_71_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_72_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_73_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_74_);
                                aClass348_Sub49_Sub1_3020
                                        .method3400(0.0F, (byte) -116);
                                aClass348_Sub49_Sub1_3020
                                        .method3400(1.0F, (byte) -116);
                                aClass348_Sub49_Sub1_3020.method3400
                                        ((float) i_78_ * f_30_ + f_75_,
                                                (byte) -124);
                                aClass348_Sub49_Sub1_3020.method3400
                                        ((float) i_78_ * f_31_ + f_76_,
                                                (byte) -83);
                                aClass348_Sub49_Sub1_3020.method3400
                                        ((float) i_78_ * f_32_ + f_77_,
                                                (byte) -80);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_71_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_72_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_73_);
                                aClass348_Sub49_Sub1_3020.method3378(false,
                                        i_74_);
                            }
                        }
                    }
                }
            }
            if ((aClass348_Sub49_Sub1_3020.anInt7197
                    ^ 0xffffffff)
                    != -1) {
                anInterface2_3027.method11
                        (24,
                                aClass348_Sub49_Sub1_3020.anInt7197,
                                (aClass348_Sub49_Sub1_3020
                                        .aByteArray7154),
                                -9894);
                var_ha_Sub2.method3794(aClass123_3029, aClass123_3028,
                        i_18_ + -786006967, aClass123_3025,
                        null);
                var_ha_Sub2.method3756((aClass348_Sub49_Sub1_3020.anInt7197
                                / 24),
                        7, 0, 120);
            }
        }
    }

    Class233() {
        aClass348_Sub49_Sub1_3020 = new Class348_Sub49_Sub1(786336);
        anInt3026 = Class299.method2253(1600, 124);
        anIntArray3032 = new int[8191];
        aClass318_Sub9_Sub2ArrayArray3031 = new Class318_Sub9_Sub2[1600][64];
        anIntArray3033 = new int[1600];
        anInt3034 = 0;
        aClass318_Sub9_Sub2ArrayArray3030 = new Class318_Sub9_Sub2[64][768];
        anIntArray3035 = new int[64];
    }
}
