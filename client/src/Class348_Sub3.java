/* Class348_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

final class Class348_Sub3 extends Class348 {
    private s_Sub3 aS_Sub3_6566;
    int anInt6567;
    static int anInt6568;
    int anInt6569;
    static int anInt6570;
    int anInt6571;
    private NativeHeapBuffer aNativeHeapBuffer6572;
    private int[] anIntArray6573;
    private Stream aStream6574;
    int anInt6575;
    static int anInt6576;
    private Interface5_Impl1 anInterface5_Impl1_6577;
    static int anInt6578;
    static int anInt6579;
    static int anInt6580;
    static Class323 aClass323_6581;
    float aFloat6582;
    static int anInt6583;
    static Class114 aClass114_6584 = null;
    static int anInt6585;
    static float aFloat6586;
    static int anInt6587;
    static int anInt6588;
    int anInt6589 = 0;
    private ha_Sub3 aHa_Sub3_6590;

    final void method2736(byte i, int i_0_) {
        if (i != -57)
            method2736((byte) 25, -39);
        anInt6580++;
        aNativeHeapBuffer6572
                = aHa_Sub3_6590.method3869((byte) 77, true, i_0_ * 4);
        aStream6574 = new Stream(aNativeHeapBuffer6572, 0, 4 * i_0_);
    }

    final void method2737(byte i, int[] is, int i_1_) {
        anInt6583++;
        Interface5_Impl2 interface5_impl2
                = aHa_Sub3_6590.method3822(47,
                ((Class348_Sub3) this).anInt6589 * 3);
        Buffer buffer = interface5_impl2.method24(true, false);
        if (buffer != null) {
            if (i != -30)
                method2736((byte) 116, 72);
            Stream stream = aHa_Sub3_6590.method3893(buffer, 9179);
            int i_2_ = 0;
            int i_3_ = 32767;
            int i_4_ = -32768;
            if (Stream.c()) {
                for (int i_5_ = 0; i_1_ > i_5_; i_5_++) {
                    int i_6_ = is[i_5_];
                    short[] is_7_
                            = ((s_Sub3) aS_Sub3_6566).aShortArrayArray8299[i_6_];
                    int i_8_ = anIntArray6573[i_6_];
                    if ((i_8_ ^ 0xffffffff) != -1 && is_7_ != null) {
                        int i_9_ = 0;
                        int i_10_ = 0;
                        while ((is_7_.length ^ 0xffffffff)
                                < (i_10_ ^ 0xffffffff)) {
                            if ((i_8_ & 1 << i_9_++ ^ 0xffffffff) == -1)
                                i_10_ += 3;
                            else {
                                i_2_++;
                                for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -4;
                                     i_11_++) {
                                    int i_12_ = 0xffff & is_7_[i_10_++];
                                    if ((i_3_ ^ 0xffffffff)
                                            < (i_12_ ^ 0xffffffff))
                                        i_3_ = i_12_;
                                    stream.d(i_12_);
                                    if ((i_12_ ^ 0xffffffff)
                                            < (i_4_ ^ 0xffffffff))
                                        i_4_ = i_12_;
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i_13_ = 0; i_1_ > i_13_; i_13_++) {
                    int i_14_ = is[i_13_];
                    short[] is_15_
                            = ((s_Sub3) aS_Sub3_6566).aShortArrayArray8299[i_14_];
                    int i_16_ = anIntArray6573[i_14_];
                    if ((i_16_ ^ 0xffffffff) != -1 && is_15_ != null) {
                        int i_17_ = 0;
                        int i_18_ = 0;
                        while ((i_18_ ^ 0xffffffff)
                                > (is_15_.length ^ 0xffffffff)) {
                            if ((1 << i_17_++ & i_16_ ^ 0xffffffff) != -1) {
                                i_2_++;
                                for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -4;
                                     i_19_++) {
                                    int i_20_ = 0xffff & is_15_[i_18_++];
                                    if ((i_20_ ^ 0xffffffff)
                                            > (i_3_ ^ 0xffffffff))
                                        i_3_ = i_20_;
                                    stream.a(i_20_);
                                    if ((i_4_ ^ 0xffffffff)
                                            > (i_20_ ^ 0xffffffff))
                                        i_4_ = i_20_;
                                }
                            } else
                                i_18_ += 3;
                        }
                    }
                }
            }
            stream.a();
            if (interface5_impl2.method22(i + 7) && (i_2_ ^ 0xffffffff) < -1) {
                aHa_Sub3_6590.method3814((((s_Sub3) aS_Sub3_6566).anInt8294
                                & 0x8) != 0,
                        ((0x7
                                & ((s_Sub3) aS_Sub3_6566).anInt8294)
                                ^ 0xffffffff) != -1,
                        ((Class348_Sub3) this).anInt6567,
                        (byte) 48);
                if (((ha_Sub3) aHa_Sub3_6590).aBoolean8160)
                    aHa_Sub3_6590.EA(2147483647,
                            ((Class348_Sub3) this).anInt6571,
                            ((Class348_Sub3) this).anInt6575,
                            ((Class348_Sub3) this).anInt6569);
                Class101_Sub2 class101_sub2 = aHa_Sub3_6590.method3820(false);
                class101_sub2.method932
                        (1.0F, 1.0F / ((Class348_Sub3) this).aFloat6582,
                                1.0F / ((Class348_Sub3) this).aFloat6582, (byte) -80);
                aHa_Sub3_6590.method3853(i + -2,
                        Class239_Sub18.aClass251_6030);
                aHa_Sub3_6590.method3925(55, anInterface5_Impl1_6577, 1);
                aHa_Sub3_6590.method3862(i + 30, (((s_Sub3) aS_Sub3_6566)
                        .aClass130_8324));
                aHa_Sub3_6590.method3938(Class247.aClass21_3181, i_2_,
                        interface5_impl2, i_3_, 0,
                        1 + -i_3_ + i_4_, 104);
                aHa_Sub3_6590.method3879(-8629);
            }
        }
    }

    public static void method2738(byte i) {
        aClass114_6584 = null;
        aClass323_6581 = null;
        int i_21_ = 89 / ((19 - i) / 43);
    }

    static final void method2739(int i) {
        Class348_Sub40_Sub13.aClass262_9201.method1996(98);
        anInt6579++;
        Class348_Sub34.anInt6969 = i;
    }

    final void method2740(int i, int i_22_) {
        anInt6576++;
        aStream6574.a();
        anInterface5_Impl1_6577 = aHa_Sub3_6590.method3889(false, 16711680);
        anInterface5_Impl1_6577.method17(aNativeHeapBuffer6572, 4, 4 * i_22_,
                (byte) -110);
        int i_23_ = 44 % ((i - 19) / 33);
        aNativeHeapBuffer6572 = null;
        aStream6574 = null;
    }

    final void method2741(int i, float f, int i_24_, int i_25_, int i_26_) {
        if ((((Class348_Sub3) this).anInt6567 ^ 0xffffffff) != 0) {
            Class12 class12
                    = ((ha) aHa_Sub3_6590).aD4579
                    .method3(((Class348_Sub3) this).anInt6567, -6662);
            int i_27_ = ((Class12) class12).aByte201 & 0xff;
            if ((i_27_ ^ 0xffffffff) != -1
                    && ((Class12) class12).aByte213 != 4) {
                int i_28_;
                if ((i_25_ ^ 0xffffffff) > -1)
                    i_28_ = 0;
                else if ((i_25_ ^ 0xffffffff) >= -128)
                    i_28_ = i_25_ * 131586;
                else
                    i_28_ = 16777215;
                if (i_27_ != 256) {
                    int i_29_ = i_27_;
                    int i_30_ = -i_27_ + 256;
                    i_26_
                            = ((i_30_ * (i_26_ & 0xff00) + i_29_ * (0xff00 & i_28_)
                            & 0xff0000)
                            + (~0xff00ff & (i_29_ * (i_28_ & 0xff00ff)
                            - -((i_26_ & 0xff00ff)
                            * i_30_)))) >> -683106776;
                } else
                    i_26_ = i_28_;
            }
            int i_31_ = 0xff & ((Class12) class12).aByte216;
            if ((i_31_ ^ 0xffffffff) != -1) {
                i_31_ += 256;
                int i_32_ = (0xff & i_26_ >> 630532432) * i_31_;
                if (i_32_ > 65535)
                    i_32_ = 65535;
                int i_33_ = ((0xff00 & i_26_) >> 1910004264) * i_31_;
                if (i_33_ > 65535)
                    i_33_ = 65535;
                int i_34_ = i_31_ * (0xff & i_26_);
                if (i_34_ > 65535)
                    i_34_ = 65535;
                i_26_ = (i_34_ >> 1825910888) + ((i_33_ & 0xff00)
                        + ((0x5400ff00 & i_32_)
                        << -559127800));
            }
        }
        anInt6588++;
        aStream6574.e(i * 4);
        if (f != 1.0F) {
            int i_35_ = i_26_ >> -1703890928 & 0xff;
            int i_36_ = 0xff & i_26_ >> -1859876792;
            i_35_ *= f;
            int i_37_ = 0xff & i_26_;
            if (i_35_ < 0)
                i_35_ = 0;
            else if ((i_35_ ^ 0xffffffff) < -256)
                i_35_ = 255;
            i_36_ *= f;
            if (i_36_ < 0)
                i_36_ = 0;
            else if ((i_36_ ^ 0xffffffff) < -256)
                i_36_ = 255;
            i_37_ *= f;
            if (i_37_ < 0)
                i_37_ = 0;
            else if ((i_37_ ^ 0xffffffff) < -256)
                i_37_ = 255;
            i_26_ = i_37_ | (i_35_ << -1175233776 | i_36_ << 456301160);
        }
        if (i_24_ != 1624)
            method2743(null, (byte) 67);
        if (((ha_Sub3) aHa_Sub3_6590).anInt8178 == 0) {
            aStream6574.f((byte) i_26_);
            aStream6574.f((byte) (i_26_ >> -550100824));
            aStream6574.f((byte) (i_26_ >> 2173840));
        } else {
            aStream6574.f((byte) (i_26_ >> -903092176));
            aStream6574.f((byte) (i_26_ >> -815618520));
            aStream6574.f((byte) i_26_);
        }
    }

    final void method2742(int i, int i_38_, int i_39_, byte i_40_) {
        anInt6570++;
        anIntArray6573[i_38_ * ((s) aS_Sub3_6566).anInt4587 - -i_39_]
                = Class273.method2057((anIntArray6573
                        [(i_38_ * ((s) aS_Sub3_6566).anInt4587
                        - -i_39_)]),
                1 << i);
        if (i_40_ > -65)
            aFloat6586 = -1.0413289F;
        ((Class348_Sub3) this).anInt6589++;
    }

    static final Class346 method2743(Component component, byte i) {
        anInt6587++;
        int i_41_ = -16 % ((i - -58) / 63);
        return new Class346_Sub1(component);
    }

    final void method2744(byte i, int i_42_) {
        anInt6578++;
        if (i > -106)
            ((Class348_Sub3) this).anInt6571 = -80;
        aStream6574.e(4 * i_42_ + 3);
        aStream6574.f(-1);
    }

    Class348_Sub3(s_Sub3 var_s_Sub3, int i, int i_43_, int i_44_, int i_45_,
                  int i_46_) {
        aS_Sub3_6566 = var_s_Sub3;
        ((Class348_Sub3) this).anInt6569 = i_46_;
        ((Class348_Sub3) this).aFloat6582 = (float) i_43_;
        aHa_Sub3_6590 = ((s_Sub3) aS_Sub3_6566).aHa_Sub3_8322;
        ((Class348_Sub3) this).anInt6575 = i_45_;
        ((Class348_Sub3) this).anInt6567 = i;
        anIntArray6573 = new int[(((s) aS_Sub3_6566).anInt4590
                * ((s) aS_Sub3_6566).anInt4587)];
        ((Class348_Sub3) this).anInt6571 = i_44_;
    }
}
