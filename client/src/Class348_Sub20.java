/* Class348_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

final class Class348_Sub20 extends Class348 {
    int anInt6825;
    int anInt6826;
    static int anInt6827;
    static int anInt6828;
    static int anInt6829;
    static int[] anIntArray6830 = {16, 32, 64, 128};
    private ha_Sub2 aHa_Sub2_6831;
    float aFloat6832;
    int anInt6833;
    static int anInt6834;
    static float aFloat6835;
    static int anInt6836;
    static int anInt6837;
    static int anInt6838;
    private final s_Sub2 aS_Sub2_6839;
    private NativeHeapBuffer aNativeHeapBuffer6840;
    int anInt6841;
    private final int[] anIntArray6842;
    private final Class119_Sub2 aClass119_Sub2_6843;
    private Class123 aClass123_6844;
    static int anInt6845;
    private Stream aStream6846;

    final void method2945(int i, byte i_0_, int i_1_, int i_2_) {
        anInt6845++;
        if (i_0_ != 18)
            this.anInt6825 = 85;
        anIntArray6842[i_1_ * aS_Sub2_6839.anInt4587 + i]
                = Class273.method2057((anIntArray6842
                        [i_1_ * aS_Sub2_6839.anInt4587 + i]),
                1 << i_2_);
    }

    final void method2946(int i, int i_3_) {
        aNativeHeapBuffer6840
                = aHa_Sub2_6831.aNativeHeap7730.a(4 * i_3_, true);
        anInt6834++;
        if (i != 2147483647)
            aHa_Sub2_6831 = null;
        aStream6846 = new Stream(aNativeHeapBuffer6840);
    }

    static final void method2947(boolean bool, int i, int i_4_, int i_5_,
                                 int i_6_, int i_7_) {
        anInt6837++;
        if (bool != true)
            method2950(121);
        if ((Class316.aClass348_Sub51_3959
                .aClass239_Sub26_7272.method1838(-32350)
                ^ 0xffffffff) != -1
                && i_5_ != 0 && Class147.anInt2021 < 50 && i_4_ != -1)
            Class258_Sub2.aClass10Array8531[Class147.anInt2021++]
                    = new Class10((byte) 1, i_4_, i_5_, i_6_, i, 0, i_7_, null);
    }

    final void method2948(int i, int i_8_, int[] is) {
        anInt6829++;
        int i_9_ = 0;
        Class348_Sub49_Sub1 class348_sub49_sub1
                = aHa_Sub2_6831.aClass348_Sub49_Sub1_7798;
        class348_sub49_sub1.anInt7197 = 0;
        if (aHa_Sub2_6831.aBoolean7775) {
            for (int i_10_ = 0; i_8_ > i_10_; i_10_++) {
                int i_11_ = is[i_10_];
                short[] is_12_
                        = aS_Sub2_6839.aShortArrayArray8267[i_11_];
                int i_13_ = anIntArray6842[i_11_];
                if ((i_13_ ^ 0xffffffff) != -1 && is_12_ != null) {
                    int i_14_ = 0;
                    int i_15_ = 0;
                    while (is_12_.length > i_15_) {
                        if ((i_13_ & 1 << i_14_++) == 0)
                            i_15_ += 3;
                        else {
                            class348_sub49_sub1.method3337((byte) 107,
                                    (is_12_[i_15_++]
                                            & 0xffff));
                            i_9_++;
                            class348_sub49_sub1.method3337((byte) 107,
                                    (is_12_[i_15_++]
                                            & 0xffff));
                            i_9_++;
                            i_9_++;
                            class348_sub49_sub1.method3337((byte) 107,
                                    (0xffff
                                            & (is_12_
                                            [i_15_++])));
                        }
                    }
                }
            }
        } else {
            for (int i_16_ = 0; i_8_ > i_16_; i_16_++) {
                int i_17_ = is[i_16_];
                int i_18_ = anIntArray6842[i_17_];
                short[] is_19_
                        = aS_Sub2_6839.aShortArrayArray8267[i_17_];
                if ((i_18_ ^ 0xffffffff) != -1 && is_19_ != null) {
                    int i_20_ = 0;
                    int i_21_ = 0;
                    while (i_21_ < is_19_.length) {
                        if ((i_18_ & 1 << i_20_++) == 0)
                            i_21_ += 3;
                        else {
                            i_9_++;
                            class348_sub49_sub1
                                    .method3397(97, 0xffff & is_19_[i_21_++]);
                            class348_sub49_sub1
                                    .method3397(125, 0xffff & is_19_[i_21_++]);
                            i_9_++;
                            i_9_++;
                            class348_sub49_sub1.method3397(i ^ 0x142f,
                                    (is_19_[i_21_++]
                                            & 0xffff));
                        }
                    }
                }
            }
        }
        if (i_9_ > 0) {
            aClass119_Sub2_6843.method35
                    (class348_sub49_sub1.aByteArray7154, 5123,
                            64, class348_sub49_sub1.anInt7197);
            aHa_Sub2_6831.method3794(aS_Sub2_6839.aClass123_8276,
                    aClass123_6844, -26411,
                    aS_Sub2_6839.aClass123_8277,
                    aS_Sub2_6839.aClass123_8275);
            aHa_Sub2_6831.method3746(((0x7 & aS_Sub2_6839.anInt8235)
                            != 0),
                    this.anInt6841,
                    ((aS_Sub2_6839.anInt8235 & 0x8)
                            != 0),
                    112);
            if (aHa_Sub2_6831.aBoolean7846)
                aHa_Sub2_6831.EA(2147483647, this.anInt6825,
                        this.anInt6833,
                        this.anInt6826);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.aFloat6832,
                    1.0F / this.aFloat6832, 1.0F);
            OpenGL.glMatrixMode(5888);
            aHa_Sub2_6831.method3794(aS_Sub2_6839.aClass123_8276,
                    aClass123_6844, -26411,
                    aS_Sub2_6839.aClass123_8277,
                    aS_Sub2_6839.aClass123_8275);
            aHa_Sub2_6831.method3759(i_9_, -128, 4, aClass119_Sub2_6843, 0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (i != 5123)
            this.anInt6826 = 66;
    }

    final void method2949(byte i, int i_22_, int i_23_, int i_24_, float f) {
        if (i == 97) {
            if ((this.anInt6841 ^ 0xffffffff) != 0) {
                Class12 class12
                        = aHa_Sub2_6831.aD4579
                        .method3(this.anInt6841, -6662);
                int i_25_ = 0xff & class12.aByte201;
                if ((i_25_ ^ 0xffffffff) != -1
                        && (class12.aByte213 ^ 0xffffffff) != -5) {
                    int i_26_;
                    if ((i_23_ ^ 0xffffffff) <= -1) {
                        if (i_23_ > 127)
                            i_26_ = 16777215;
                        else
                            i_26_ = 131586 * i_23_;
                    } else
                        i_26_ = 0;
                    if ((i_25_ ^ 0xffffffff) != -257) {
                        int i_27_ = i_25_;
                        int i_28_ = -i_25_ + 256;
                        i_24_ = ((((i_28_ * (i_24_ & 0xff00ff)
                                + (i_26_ & 0xff00ff) * i_27_)
                                & ~0xff00ff)
                                - -(0xff0000 & (i_28_ * (0xff00 & i_24_)
                                + i_27_ * (0xff00 & i_26_))))
                                >> -1929427256);
                    } else
                        i_24_ = i_26_;
                }
                int i_29_ = 0xff & class12.aByte216;
                if ((i_29_ ^ 0xffffffff) != -1) {
                    i_29_ += 256;
                    int i_30_ = i_29_ * ((0xff0000 & i_24_) >> -1137372912);
                    if ((i_30_ ^ 0xffffffff) < -65536)
                        i_30_ = 65535;
                    int i_31_ = ((i_24_ & 0xff00) >> -277346296) * i_29_;
                    if ((i_31_ ^ 0xffffffff) < -65536)
                        i_31_ = 65535;
                    int i_32_ = (0xff & i_24_) * i_29_;
                    if ((i_32_ ^ 0xffffffff) < -65536)
                        i_32_ = 65535;
                    i_24_ = (0xff00 & i_31_) + (((~0x5ff00ff & i_30_)
                            << -139080152)
                            - -(i_32_ >> 58668744));
                }
            }
            anInt6838++;
            aStream6846.e(i_22_ * 4);
            if (f != 1.0F) {
                int i_33_ = (i_24_ & 0xff1a66) >> -1042733616;
                int i_34_ = (0xff1d & i_24_) >> 1425386248;
                int i_35_ = i_24_ & 0xff;
                i_33_ *= f;
                if (i_33_ < 0)
                    i_33_ = 0;
                else if ((i_33_ ^ 0xffffffff) < -256)
                    i_33_ = 255;
                i_34_ *= f;
                i_35_ *= f;
                if (i_34_ < 0)
                    i_34_ = 0;
                else if ((i_34_ ^ 0xffffffff) < -256)
                    i_34_ = 255;
                if ((i_35_ ^ 0xffffffff) > -1)
                    i_35_ = 0;
                else if ((i_35_ ^ 0xffffffff) < -256)
                    i_35_ = 255;
                i_24_ = i_34_ << -832692120 | i_33_ << 2030250768 | i_35_;
            }
            aStream6846.f((byte) (i_24_ >> 1252730704));
            aStream6846.f((byte) (i_24_ >> -185996824));
            aStream6846.f((byte) i_24_);
        }
    }

    public static void method2950(int i) {
        if (i <= 37)
            aFloat6835 = 2.1337976F;
        anIntArray6830 = null;
    }

    final void method2951(int i, int i_36_) {
        aStream6846.e(i_36_ * 4 + i);
        anInt6827++;
        aStream6846.f(-1);
    }

    final void method2952(int i, int i_37_) {
        if (i == 17795) {
            aStream6846.a();
            anInt6828++;
            Interface2 interface2
                    = aHa_Sub2_6831.method3739(8448, aNativeHeapBuffer6840, false,
                    4, i_37_ * 4);
            aClass123_6844 = new Class123(interface2, 5121, 4, 0);
            aStream6846 = null;
            aNativeHeapBuffer6840 = null;
        }
    }

    static final void method2953(byte i) {
        if (i > -102)
            anIntArray6830 = null;
        anInt6836++;
        if (Class240.anInt4674 == 3)
            Class348_Sub49.method3379(2, 4);
        else if (Class240.anInt4674 != 7) {
            if ((Class240.anInt4674 ^ 0xffffffff) == -11)
                Class348_Sub49.method3379(2, 11);
        } else
            Class348_Sub49.method3379(2, 8);
    }

    Class348_Sub20(s_Sub2 var_s_Sub2, int i, int i_38_, int i_39_, int i_40_,
                   int i_41_) {
        aS_Sub2_6839 = var_s_Sub2;
        anIntArray6842 = new int[(aS_Sub2_6839.anInt4587
                * aS_Sub2_6839.anInt4590)];
        this.anInt6825 = i_39_;
        this.aFloat6832 = (float) i_38_;
        aHa_Sub2_6831 = aS_Sub2_6839.aHa_Sub2_8272;
        this.anInt6841 = i;
        this.anInt6833 = i_40_;
        this.anInt6826 = i_41_;
        aClass119_Sub2_6843 = new Class119_Sub2(aHa_Sub2_6831, 5123, null, 1);
    }
}
