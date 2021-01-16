/* Class348_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.io.IOException;
import java.net.Socket;

abstract class Class348_Sub5 extends Class348 {
    ha_Sub2 aHa_Sub2_6618;
    static int anInt6619;
    static int anInt6620;
    boolean aBoolean6621;
    static int anInt6622;
    static int anInt6623;
    static byte[] aByteArray6624 = new byte[2048];
    static int anInt6625;
    static int anInt6626;
    static Class105 aClass105_6627;
    static int anInt6628;
    static int anInt6629;

    abstract void method2750(Class258_Sub3 class258_sub3,
                             Class258_Sub3 class258_sub3_0_, int i, byte i_1_);

    abstract boolean method2751(boolean bool);

    static final Class138 method2752(int i, int i_2_) {
        anInt6625++;
        Class138[] class138s = Class348_Sub27.method3002((byte) -97);
        for (int i_3_ = i_2_; class138s.length > i_3_; i_3_++) {
            if (i == class138s[i_3_].anInt1941)
                return class138s[i_3_];
        }
        return null;
    }

    static final ha method2753(boolean bool, int i, int i_4_, Canvas canvas,
                               d var_d) {
        try {
            anInt6628++;
            if (bool != true)
                aByteArray6624 = null;
            return new ha_Sub1(canvas, var_d, i_4_, i);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("fba.M(" + bool + ',' + i + ','
                            + i_4_ + ','
                            + (canvas != null ? "{...}"
                            : "null")
                            + ','
                            + (var_d != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    abstract void method2754(int i, byte i_5_, int i_6_);

    static final void method2755(int i, int i_7_, int i_8_) {
        anInt6629++;
        if ((Class348_Sub43.anInt7068 ^ 0xffffffff) != i) {
            if (i_8_ >= 0)
                Class367_Sub3.anIntArray7299[i_8_] = i_7_;
            else {
                for (int i_9_ = 0; i_9_ < 16; i_9_++)
                    Class367_Sub3.anIntArray7299[i_9_] = i_7_;
            }
        }
        Class98.aClass348_Sub16_Sub3_1564.method2843(i_7_, i_8_, -7836);
    }

    abstract void method2756(byte i, int i_10_);

    static final void method2757(int i) {
        anInt6620++;
        if (Class367_Sub2.anInt7297 != 0) {
            try {
                if (i >= 82) {
                    if (++Class169.anInt2264 > 2000) {
                        if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                            Class348_Sub40_Sub8.aClass238_9165
                                    .method1700((byte) 36);
                            Class348_Sub40_Sub8.aClass238_9165 = null;
                        }
                        if (Class105_Sub1.anInt8398 >= 2) {
                            Class367_Sub2.anInt7297 = 0;
                            Class352.anInt4337 = -5;
                            return;
                        }
                        Class255.aClass161_3285.method1259(0);
                        Class367_Sub2.anInt7297 = 1;
                        Class169.anInt2264 = 0;
                        Class105_Sub1.anInt8398++;
                    }
                    if (Class367_Sub2.anInt7297 == 1) {
                        Class130_Sub1.aClass144_5800
                                = (Class255.aClass161_3285.method1262
                                (Class348_Sub23_Sub1.aClass297_8992,
                                        (byte) 36));
                        Class367_Sub2.anInt7297 = 2;
                    }
                    if (Class367_Sub2.anInt7297 == 2) {
                        if (Class130_Sub1.aClass144_5800.anInt1997 == 2)
                            throw new IOException();
                        if (Class130_Sub1.aClass144_5800.anInt1997 != 1)
                            return;
                        Class348_Sub40_Sub8.aClass238_9165
                                = Class348_Sub23_Sub3.method2982(((Socket)
                                        (Class130_Sub1
                                                .aClass144_5800
                                                .anObject1998)),
                                (byte) 24, 7500);
                        Class130_Sub1.aClass144_5800 = null;
                        Class239_Sub18.method1802(0);
                        Class367_Sub2.anInt7297 = 4;
                    }
                    if (Class367_Sub2.anInt7297 == 4) {
                        if (Class348_Sub40_Sub8.aClass238_9165
                                .method1705(1, 104)) {
                            Class348_Sub40_Sub8.aClass238_9165.method1701
                                    (1, 0, (byte) -116,
                                            (Class299.aClass348_Sub49_Sub2_3813
                                                    .aByteArray7154));
                            int i_11_
                                    = 0xff & (Class299.aClass348_Sub49_Sub2_3813
                                    .aByteArray7154[0]);
                            Class352.anInt4337 = i_11_;
                            Class367_Sub2.anInt7297 = 0;
                            Class348_Sub40_Sub8.aClass238_9165
                                    .method1700((byte) 36);
                            Class348_Sub40_Sub8.aClass238_9165 = null;
                        }
                    }
                }
            } catch (IOException ioexception) {
                if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                    Class348_Sub40_Sub8.aClass238_9165.method1700((byte) 36);
                    Class348_Sub40_Sub8.aClass238_9165 = null;
                }
                if (Class105_Sub1.anInt8398 < 2) {
                    Class255.aClass161_3285.method1259(0);
                    Class169.anInt2264 = 0;
                    Class105_Sub1.anInt8398++;
                    Class367_Sub2.anInt7297 = 1;
                } else {
                    Class352.anInt4337 = -4;
                    Class367_Sub2.anInt7297 = 0;
                }
            }
        }
    }

    abstract boolean method2758(int i);

    final boolean method2759(int i) {
        if (i != 1)
            return true;
        anInt6626++;
        return false;
    }

    final boolean method2760(byte i) {
        if (i != 1)
            method2763((byte) 37);
        anInt6619++;
        return this.aBoolean6621;
    }

    int method2761(boolean bool) {
        anInt6622++;
        if (bool != true)
            method2757(-63);
        return 0;
    }

    public static void method2762(int i) {
        aByteArray6624 = null;
        aClass105_6627 = null;
        int i_12_ = -23 % ((i - -24) / 47);
    }

    abstract void method2763(byte i);

    Class348_Sub5(ha_Sub2 var_ha_Sub2) {
        this.aHa_Sub2_6618 = var_ha_Sub2;
    }

    final int method2764(int i) {
        if (i != 1)
            aByteArray6624 = null;
        anInt6623++;
        return 1;
    }
}
