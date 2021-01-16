/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class22 {
    static int anInt328;
    static int anInt329;
    static Class114 aClass114_330 = new Class114(65, -1);
    int anInt331 = -1;
    int anInt332;
    static int anInt333;
    boolean aBoolean334;
    int anInt335;
    int anInt336 = 512;
    private int anInt337 = 0;
    static int anInt338;
    static int anInt339;
    static int anInt340;
    int anInt341;
    boolean aBoolean342;
    int anInt343;

    final void method290(Class348_Sub49 class348_sub49, int i) {
        if (i != -1)
            ((Class22) this).anInt332 = 25;
        for (; ; ) {
            int i_0_ = class348_sub49.method3387(255);
            if ((i_0_ ^ 0xffffffff) == -1)
                break;
            method291(i_0_, -4, class348_sub49);
        }
        anInt329++;
    }

    private final void method291(int i, int i_1_,
                                 Class348_Sub49 class348_sub49) {
        if ((i ^ 0xffffffff) != -2) {
            if (i == 2) {
                ((Class22) this).anInt331
                        = class348_sub49.method3330(i_1_ + 842397948);
                if (((Class22) this).anInt331 == 65535)
                    ((Class22) this).anInt331 = -1;
            } else if ((i ^ 0xffffffff) != -4) {
                if ((i ^ 0xffffffff) != -5) {
                    if (i == 5)
                        ((Class22) this).aBoolean334 = false;
                } else
                    ((Class22) this).aBoolean342 = false;
            } else
                ((Class22) this).anInt336
                        = class348_sub49.method3330(842397944) << -1659645310;
        } else {
            anInt337 = class348_sub49.method3351(-1);
            method292(anInt337, (byte) 117);
        }
        if (i_1_ != -4)
            method290(null, 12);
        anInt333++;
    }

    private final void method292(int i, byte i_2_) {
        anInt340++;
        double d = (double) (0xff & i >> -1657899472) / 256.0;
        double d_3_ = (double) ((0xff2b & i) >> -2095055736) / 256.0;
        double d_4_ = (double) (0xff & i) / 256.0;
        double d_5_ = d;
        if (d_3_ < d_5_)
            d_5_ = d_3_;
        if (d_4_ < d_5_)
            d_5_ = d_4_;
        double d_6_ = d;
        if (d_3_ > d_6_)
            d_6_ = d_3_;
        if (d_4_ > d_6_)
            d_6_ = d_4_;
        double d_7_ = 0.0;
        double d_8_ = 0.0;
        double d_9_ = (d_5_ + d_6_) / 2.0;
        if (d_6_ != d_5_) {
            if (d_9_ < 0.5)
                d_8_ = (d_6_ - d_5_) / (d_5_ + d_6_);
            if (d != d_6_) {
                if (d_6_ != d_3_) {
                    if (d_6_ == d_4_)
                        d_7_ = (d - d_3_) / (-d_5_ + d_6_) + 4.0;
                } else
                    d_7_ = (-d + d_4_) / (d_6_ - d_5_) + 2.0;
            } else
                d_7_ = (-d_4_ + d_3_) / (d_6_ - d_5_);
            if (d_9_ >= 0.5)
                d_8_ = (d_6_ - d_5_) / (-d_5_ + (2.0 - d_6_));
        }
        ((Class22) this).anInt332 = (int) (256.0 * d_8_);
        d_7_ /= 6.0;
        ((Class22) this).anInt335 = (int) (256.0 * d_9_);
        if (((Class22) this).anInt332 >= 0) {
            if ((((Class22) this).anInt332 ^ 0xffffffff) < -256)
                ((Class22) this).anInt332 = 255;
        } else
            ((Class22) this).anInt332 = 0;
        if (d_9_ > 0.5)
            ((Class22) this).anInt343 = (int) (512.0 * ((1.0 - d_9_) * d_8_));
        else
            ((Class22) this).anInt343 = (int) (512.0 * (d_9_ * d_8_));
        if ((((Class22) this).anInt335 ^ 0xffffffff) > -1)
            ((Class22) this).anInt335 = 0;
        else if (((Class22) this).anInt335 > 255)
            ((Class22) this).anInt335 = 255;
        if ((((Class22) this).anInt343 ^ 0xffffffff) > -2)
            ((Class22) this).anInt343 = 1;
        int i_10_ = 39 % ((i_2_ - 61) / 55);
        ((Class22) this).anInt341
                = (int) (d_7_ * (double) ((Class22) this).anInt343);
    }

    public static void method293(byte i) {
        aClass114_330 = null;
        if (i >= -40)
            method295(-6, -74, -119, null, -35, null, 125, 67, -102);
    }

    static final void method294(ha var_ha, int i) {
        anInt328++;
        if (Class5_Sub1_Sub1.aClass262_9931.method1998(i) != 0) {
            if ((((Class348_Sub51) Class316.aClass348_Sub51_3959)
                    .aClass239_Sub25_7271.method1829(-32350)
                    ^ 0xffffffff)
                    == -1) {
                for (Class348_Sub7 class348_sub7
                     = ((Class348_Sub7)
                        Class5_Sub1_Sub1.aClass262_9931.method1995(4));
                     class348_sub7 != null;
                     class348_sub7
                             = (Class348_Sub7) Class5_Sub1_Sub1.aClass262_9931
                             .method1990((byte) 31)) {
                    Exception_Sub1.aClass255_112.method1932
                            (var_ha, ((Class348_Sub7) class348_sub7).anInt6647,
                                    ((Class348_Sub7) class348_sub7).anInt6648,
                                    Class240.aClass324_4684,
                                    (!((Class348_Sub7) class348_sub7).aBoolean6650 ? null
                                            : (((Class318_Sub1_Sub3_Sub3_Sub2)
                                            Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907)
                                            .aClass154_10536)),
                                    ((Class348_Sub7) class348_sub7).anInt6642, false,
                                    (byte) 83, var_ha,
                                    ((Class348_Sub7) class348_sub7).anInt6649, false,
                                    ((Class348_Sub7) class348_sub7).anInt6645);
                    class348_sub7.method2715((byte) 29);
                }
                Class354.method3466(i + -113);
            } else {
                if (Class348_Sub34.aHa6968 == null) {
                    Canvas canvas = new Canvas();
                    canvas.setSize(36, 32);
                    Class348_Sub34.aHa6968
                            = Class104.method958(true, 0,
                            Class348_Sub40_Sub4.aD9113, 0,
                            canvas, Class136.aClass45_4796);
                    Class348_Sub40_Sub9.aClass324_9173
                            = (Class348_Sub34.aHa6968.method3686
                            (Class239_Sub23.method1819(Class56.anInt1044, 0,
                                    -44,
                                    Class104.aClass45_1627),
                                    Class207.method1519(Class21.aClass45_322,
                                            Class56.anInt1044, 0),
                                    true));
                }
                for (Class348_Sub7 class348_sub7
                     = ((Class348_Sub7)
                        Class5_Sub1_Sub1.aClass262_9931.method1995(i + 4));
                     class348_sub7 != null;
                     class348_sub7
                             = (Class348_Sub7) Class5_Sub1_Sub1.aClass262_9931
                             .method1990((byte) 118)) {
                    Exception_Sub1.aClass255_112.method1932
                            (Class348_Sub34.aHa6968,
                                    ((Class348_Sub7) class348_sub7).anInt6647,
                                    ((Class348_Sub7) class348_sub7).anInt6648,
                                    Class348_Sub40_Sub9.aClass324_9173,
                                    (((Class348_Sub7) class348_sub7).aBoolean6650
                                            ? (((Class318_Sub1_Sub3_Sub3_Sub2)
                                            Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907)
                                            .aClass154_10536)
                                            : null),
                                    ((Class348_Sub7) class348_sub7).anInt6642, false,
                                    (byte) 83, var_ha,
                                    ((Class348_Sub7) class348_sub7).anInt6649, false,
                                    ((Class348_Sub7) class348_sub7).anInt6645);
                    class348_sub7.method2715((byte) 21);
                }
            }
        }
    }

    static final void method295(int i, int i_11_, int i_12_, byte[] is,
                                int i_13_, byte[] is_14_, int i_15_, int i_16_,
                                int i_17_) {
        try {
            anInt338++;
            int i_18_ = -(i_13_ >> 2077359746);
            i_13_ = -(0x3 & i_13_);
            if (i_12_ != 256)
                anInt339 = -63;
            for (int i_19_ = -i_15_; (i_19_ ^ 0xffffffff) > -1; i_19_++) {
                for (int i_20_ = i_18_; i_20_ < 0; i_20_++) {
                    is_14_[i_16_++] += is[i_11_++];
                    is_14_[i_16_++] += is[i_11_++];
                    is_14_[i_16_++] += is[i_11_++];
                    is_14_[i_16_++] += is[i_11_++];
                }
                for (int i_21_ = i_13_; (i_21_ ^ 0xffffffff) > -1; i_21_++)
                    is_14_[i_16_++] += is[i_11_++];
                i_16_ += i_17_;
                i_11_ += i;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("hk.E(" + i + ',' + i_11_ + ','
                            + i_12_ + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_13_ + ','
                            + (is_14_ != null ? "{...}"
                            : "null")
                            + ',' + i_15_ + ',' + i_16_ + ','
                            + i_17_ + ')'));
        }
    }

    public Class22() {
        ((Class22) this).aBoolean334 = true;
        ((Class22) this).aBoolean342 = true;
    }
}
