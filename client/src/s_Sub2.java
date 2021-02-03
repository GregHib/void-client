/* s_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaggl.OpenGL;

import java.io.IOException;

final class s_Sub2 extends s {
    int[][][] anIntArrayArrayArray8234;
    int anInt8235;
    static int anInt8236;
    static int anInt8237;
    static int anInt8238;
    static int anInt8239;
    private final byte[][] aByteArrayArray8240;
    static Class107 aClass107_8241 = new Class107();
    static int anInt8242;
    private Class348_Sub20[][][] aClass348_Sub20ArrayArrayArray8243;
    static int anInt8244;
    private int[][][] anIntArrayArrayArray8245;
    private int anInt8246;
    static int anInt8247;
    static int anInt8248;
    static int anInt8249;
    static int anInt8250;
    static int anInt8251;
    private int[][][] anIntArrayArrayArray8252;
    int[][][] anIntArrayArrayArray8253;
    static int anInt8254;
    static int anInt8255;
    private final Class262 aClass262_8256 = new Class262();
    private int anInt8257;
    private int[][][] anIntArrayArrayArray8258;
    static int anInt8259;
    private final int anInt8260;
    static int anInt8261;
    static int anInt8262;
    static int anInt8263;
    private final int anInt8264;
    static String aString8265;
    private Class104 aClass104_8266;
    short[][] aShortArrayArray8267;
    int[][][] anIntArrayArrayArray8268;
    static int[] anIntArray8269;
    static int anInt8270 = -1;
    static int anInt8271;
    ha_Sub2 aHa_Sub2_8272;
    private byte[][] aByteArrayArray8273;
    private Class123 aClass123_8274;
    Class123 aClass123_8275;
    Class123 aClass123_8276;
    Class123 aClass123_8277;
    private Class356 aClass356_8278;
    private Interface2 anInterface2_8279;
    private int anInt8280;
    private float[][] aFloatArrayArray8281;
    private Class348_Sub20[] aClass348_Sub20Array8282;
    private float[][] aFloatArrayArray8283;
    private int anInt8284;
    private float[][] aFloatArrayArray8285;

    final void wa(r var_r, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
        anInt8251++;
        if (aClass104_8266 != null && var_r != null) {
            int i_3_ = (i - ((this.aHa_Sub2_8272.anInt7772 * i_0_) >> 8) >> this.aHa_Sub2_8272.anInt7731);
            int i_4_ = (-(i_0_ * this.aHa_Sub2_8272.anInt7777 >> 8) + i_1_ >> this.aHa_Sub2_8272.anInt7731);
            aClass104_8266.method951(var_r, i_3_, i_4_, 70);
        }
    }

    final void method3978(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int i_16_, int i_17_, int i_18_, boolean bool) {
        try {
            anInt8249++;
            int i_19_ = is_12_.length;
            int[] is_20_ = new int[3 * i_19_];
            int[] is_21_ = new int[3 * i_19_];
            int[] is_22_ = new int[i_19_ * 3];
            int[] is_23_ = new int[3 * i_19_];
            int[] is_24_ = new int[i_19_ * 3];
            int[] is_25_ = new int[3 * i_19_];
            int[] is_26_ = is_6_ != null ? new int[i_19_ * 3] : null;
            int[] is_27_ = is_8_ != null ? new int[3 * i_19_] : null;
            int i_28_ = 0;
            for (int i_29_ = 0; i_29_ < i_19_; i_29_++) {
                int i_30_ = is_9_[i_29_];
                int i_31_ = is_10_[i_29_];
                int i_32_ = is_11_[i_29_];
                is_20_[i_28_] = is[i_30_];
                is_21_[i_28_] = is_7_[i_30_];
                is_22_[i_28_] = is_12_[i_29_];
                is_24_[i_28_] = is_14_[i_29_];
                is_25_[i_28_] = is_15_[i_29_];
                is_23_[i_28_] = is_13_ != null ? is_13_[i_29_] : is_12_[i_29_];
                if (is_6_ != null) is_26_[i_28_] = is_6_[i_30_];
                if (is_8_ != null) is_27_[i_28_] = is_8_[i_30_];
                i_28_++;
                is_20_[i_28_] = is[i_31_];
                is_21_[i_28_] = is_7_[i_31_];
                is_22_[i_28_] = is_12_[i_29_];
                is_24_[i_28_] = is_14_[i_29_];
                is_25_[i_28_] = is_15_[i_29_];
                is_23_[i_28_] = is_13_ == null ? is_12_[i_29_] : is_13_[i_29_];
                if (is_6_ != null) is_26_[i_28_] = is_6_[i_31_];
                if (is_8_ != null) is_27_[i_28_] = is_8_[i_31_];
                i_28_++;
                is_20_[i_28_] = is[i_32_];
                is_21_[i_28_] = is_7_[i_32_];
                is_22_[i_28_] = is_12_[i_29_];
                is_24_[i_28_] = is_14_[i_29_];
                is_25_[i_28_] = is_15_[i_29_];
                is_23_[i_28_] = is_13_ != null ? is_13_[i_29_] : is_12_[i_29_];
                if (is_6_ != null) is_26_[i_28_] = is_6_[i_32_];
                if (is_8_ != null) is_27_[i_28_] = is_8_[i_32_];
                i_28_++;
            }
            U(i, i_5_, is_20_, is_26_, is_21_, is_27_, is_22_, is_23_, is_24_, is_25_, i_16_, i_17_, i_18_, bool);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ed.E(" + i + ',' + i_5_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_6_ != null ? "{...}" : "null") + ',' + (is_7_ != null ? "{...}" : "null") + ',' + (is_8_ != null ? "{...}" : "null") + ',' + (is_9_ != null ? "{...}" : "null") + ',' + (is_10_ != null ? "{...}" : "null") + ',' + (is_11_ != null ? "{...}" : "null") + ',' + (is_12_ != null ? "{...}" : "null") + ',' + (is_13_ != null ? "{...}" : "null") + ',' + (is_14_ != null ? "{...}" : "null") + ',' + (is_15_ != null ? "{...}" : "null") + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + bool + ')'));
        }
    }

    final void YA() {
        if (anInt8284 <= 0) aClass104_8266 = null;
        else {
            byte[][] is = new byte[1 + this.anInt4587][this.anInt4590 + 1];
            for (int i = 1; i < this.anInt4587; i++) {
                for (int i_33_ = 1; i_33_ < this.anInt4590; i_33_++)
                    is[i][i_33_] = (byte) ((aByteArrayArray8273[i][1 + i_33_] >> 3) + (aByteArrayArray8273[i][-1 + i_33_] >> 2) + ((aByteArrayArray8273[i + 1][i_33_] >> 3) + ((aByteArrayArray8273[i - 1][i_33_] >> 2) + (aByteArrayArray8273[i][i_33_] >> 1))));
            }
            aClass348_Sub20Array8282 = new Class348_Sub20[aClass356_8278.method3474(1)];
            aClass356_8278.method3477(3, aClass348_Sub20Array8282);
            for (int i = 0; aClass348_Sub20Array8282.length > i; i++)
                aClass348_Sub20Array8282[i].method2946(2147483647, anInt8284);
            int i = 24;
            if (anIntArrayArrayArray8252 != null) i += 4;
            if ((0x7 & this.anInt8235) != 0) i += 12;
            jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = this.aHa_Sub2_8272.aNativeHeap7730.a(anInt8284 * i, false);
            Stream stream = new Stream(nativeheapbuffer);
            Class348_Sub20[] class348_sub20s = new Class348_Sub20[anInt8284];
            int i_34_ = Class348_Sub40_Sub1.method3051(anInt8284 / 4, 4096);
            if (i_34_ < 1) i_34_ = 1;
            Class356 class356 = new Class356(i_34_);
            Class348_Sub20[] class348_sub20s_35_ = new Class348_Sub20[anInt8280];
            for (int i_36_ = 0; this.anInt4587 > i_36_; i_36_++) {
                for (int i_37_ = 0; (this.anInt4590 > i_37_); i_37_++) {
                    if (this.anIntArrayArrayArray8253[i_36_][i_37_] != null) {
                        Class348_Sub20[] class348_sub20s_38_ = aClass348_Sub20ArrayArrayArray8243[i_36_][i_37_];
                        int[] is_39_ = (this.anIntArrayArrayArray8268[i_36_][i_37_]);
                        int[] is_40_ = (this.anIntArrayArrayArray8234[i_36_][i_37_]);
                        int[] is_41_ = anIntArrayArrayArray8245[i_36_][i_37_];
                        int[] is_42_ = (this.anIntArrayArrayArray8253[i_36_][i_37_]);
                        int[] is_43_ = (anIntArrayArrayArray8258 != null ? anIntArrayArrayArray8258[i_36_][i_37_] : null);
                        if (is_41_ == null) is_41_ = is_42_;
                        int[] is_44_ = (anIntArrayArrayArray8252 != null ? anIntArrayArrayArray8252[i_36_][i_37_] : null);
                        float f = aFloatArrayArray8285[i_36_][i_37_];
                        float f_45_ = aFloatArrayArray8281[i_36_][i_37_];
                        float f_46_ = aFloatArrayArray8283[i_36_][i_37_];
                        float f_47_ = aFloatArrayArray8285[i_36_][i_37_ - -1];
                        float f_48_ = aFloatArrayArray8281[i_36_][1 + i_37_];
                        float f_49_ = aFloatArrayArray8283[i_36_][1 + i_37_];
                        float f_50_ = aFloatArrayArray8285[i_36_ - -1][1 + i_37_];
                        float f_51_ = aFloatArrayArray8281[1 + i_36_][1 + i_37_];
                        float f_52_ = aFloatArrayArray8283[i_36_ + 1][i_37_ - -1];
                        float f_53_ = aFloatArrayArray8285[1 + i_36_][i_37_];
                        float f_54_ = aFloatArrayArray8281[1 + i_36_][i_37_];
                        float f_55_ = aFloatArrayArray8283[i_36_ + 1][i_37_];
                        int i_56_ = 0xff & is[i_36_][i_37_];
                        int i_57_ = 0xff & is[i_36_][1 + i_37_];
                        int i_58_ = is[1 + i_36_][i_37_ - -1] & 0xff;
                        int i_59_ = 0xff & is[1 + i_36_][i_37_];
                        int i_60_ = 0;
                        while_239_:
                        for (int i_61_ = 0; i_61_ < is_42_.length; i_61_++) {
                            Class348_Sub20 class348_sub20 = class348_sub20s_38_[i_61_];
                            for (int i_62_ = 0; i_60_ > i_62_; i_62_++) {
                                if (class348_sub20s_35_[i_62_] == class348_sub20) continue while_239_;
                            }
                            class348_sub20s_35_[i_60_++] = class348_sub20;
                        }
                        short[] is_63_ = (this.aShortArrayArray8267[this.anInt4587 * i_37_ + i_36_] = new short[is_42_.length]);
                        for (int i_64_ = 0; (is_42_.length > i_64_); i_64_++) {
                            int i_65_ = ((i_36_ << this.anInt4588) + is_39_[i_64_]);
                            int i_66_ = ((i_37_ << this.anInt4588) - -is_40_[i_64_]);
                            int i_67_ = i_65_ >> anInt8264;
                            int i_68_ = i_66_ >> anInt8264;
                            int i_69_ = is_42_[i_64_];
                            int i_70_ = is_41_[i_64_];
                            int i_71_ = is_43_ != null ? is_43_[i_64_] : 0;
                            long l = ((long) (i_67_ << 16) | ((long) i_69_ << 32 | (long) i_70_ << 48) | (long) i_68_);
                            int i_72_ = is_39_[i_64_];
                            int i_73_ = is_40_[i_64_];
                            int i_74_ = 74;
                            int i_75_ = 0;
                            float f_76_;
                            float f_77_;
                            float f_78_;
                            if (i_72_ != 0 || i_73_ != 0) {
                                if (i_72_ != 0 || i_73_ != this.anInt4592) {
                                    if ((i_72_ != this.anInt4592) || i_73_ != this.anInt4592) {
                                        if ((i_72_ == this.anInt4592) && i_73_ == 0) {
                                            f_76_ = f_54_;
                                            f_78_ = f_55_;
                                            f_77_ = f_53_;
                                            i_74_ -= i_59_;
                                        } else {
                                            float f_79_ = ((float) i_72_ / (float) (this.anInt4592));
                                            float f_80_ = ((float) i_73_ / (float) (this.anInt4592));
                                            float f_81_ = (-f + f_53_) * f_79_ + f;
                                            float f_82_ = ((f_54_ - f_45_) * f_79_ + f_45_);
                                            float f_83_ = (f_79_ * (-f_46_ + f_55_) + f_46_);
                                            float f_84_ = (f_79_ * (f_50_ - f_47_) + f_47_);
                                            float f_85_ = (f_48_ + (-f_48_ + f_51_) * f_79_);
                                            float f_86_ = ((f_52_ - f_49_) * f_79_ + f_49_);
                                            f_76_ = f_82_ + ((f_85_ - f_82_) * f_80_);
                                            f_77_ = (f_80_ * (-f_81_ + f_84_) + f_81_);
                                            f_78_ = f_83_ + ((-f_83_ + f_86_) * f_80_);
                                            int i_87_ = (((i_59_ + -i_56_) * i_72_ >> this.anInt4588) + i_56_);
                                            int i_88_ = ((i_72_ * (-i_57_ + i_58_) >> this.anInt4588) + i_57_);
                                            i_74_ -= i_87_ - -(((-i_87_ + i_88_) * i_73_) >> (this.anInt4588));
                                        }
                                    } else {
                                        f_77_ = f_50_;
                                        f_76_ = f_51_;
                                        f_78_ = f_52_;
                                        i_74_ -= i_58_;
                                    }
                                } else {
                                    f_78_ = f_49_;
                                    f_76_ = f_48_;
                                    i_74_ -= i_57_;
                                    f_77_ = f_47_;
                                }
                            } else {
                                f_76_ = f_45_;
                                f_77_ = f;
                                i_74_ -= i_56_;
                                f_78_ = f_46_;
                            }
                            float f_89_ = 1.0F;
                            if (i_69_ != -1) {
                                int i_90_ = (0x7f & i_69_) * i_74_ >> 7;
                                if (i_90_ >= 2) {
                                    if (i_90_ > 126) i_90_ = 126;
                                } else i_90_ = 2;
                                if ((0x7 & this.anInt8235) == 0) {
                                    f_89_ = ((this.aHa_Sub2_8272.aFloatArray7825[2]) * f_78_ + (f_77_ * (this.aHa_Sub2_8272.aFloatArray7825[0]) + f_76_ * (this.aHa_Sub2_8272.aFloatArray7825[1])));
                                    f_89_ = ((this.aHa_Sub2_8272.aFloat7768) + (f_89_ > 0.0F ? (this.aHa_Sub2_8272.aFloat7832) : (this.aHa_Sub2_8272.aFloat7871)) * f_89_);
                                }
                                i_75_ = (Class10.anIntArray179[0xff80 & i_69_ | i_90_]);
                            }
                            Class348 class348 = null;
                            if ((i_65_ & -1 + anInt8260) == 0 && (anInt8260 + -1 & i_66_) == 0) class348 = class356.method3480(l, -6008);
                            int i_91_;
                            if (class348 == null) {
                                int i_92_;
                                if (i_69_ != i_70_) {
                                    int i_93_ = (i_70_ & 0x7f) * i_74_ >> 7;
                                    if (i_93_ < 2) i_93_ = 2;
                                    else if (i_93_ > 126) i_93_ = 126;
                                    i_92_ = (Class10.anIntArray179[0xff80 & i_70_ | i_93_]);
                                    if ((0x7 & this.anInt8235) == 0) {
                                        float f_94_ = ((this.aHa_Sub2_8272.aFloatArray7825[0]) * f_77_ + f_76_ * (this.aHa_Sub2_8272.aFloatArray7825[1]) + f_78_ * (this.aHa_Sub2_8272.aFloatArray7825[2]));
                                        f_94_ = ((f_89_ > 0.0F ? (this.aHa_Sub2_8272.aFloat7832) : (this.aHa_Sub2_8272.aFloat7871)) * f_89_ + (this.aHa_Sub2_8272.aFloat7768));
                                        int i_95_ = (i_92_ & 0xffcb9e) >> 16;
                                        int i_96_ = (0xff29 & i_92_) >> 8;
                                        int i_97_ = 0xff & i_92_;
                                        i_95_ *= f_94_;
                                        i_96_ *= f_94_;
                                        if (i_95_ < 0) i_95_ = 0;
                                        else if (i_95_ > 255) i_95_ = 255;
                                        if (i_96_ >= 0) {
                                            if (i_96_ > 255) i_96_ = 255;
                                        } else i_96_ = 0;
                                        i_97_ *= f_94_;
                                        if (i_97_ < 0) i_97_ = 0;
                                        else if (i_97_ > 255) i_97_ = 255;
                                        i_92_ = (i_95_ << 16 | i_96_ << 8 | i_97_);
                                    }
                                } else i_92_ = i_75_;
                                if (this.aHa_Sub2_8272.aBoolean7775) {
                                    stream.a((float) i_65_);
                                    stream.a((float) (this.method3986(i_65_, i_66_, (byte) -121) + i_71_));
                                    stream.a((float) i_66_);
                                    stream.f((byte) (i_92_ >> 16));
                                    stream.f((byte) (i_92_ >> 8));
                                    stream.f((byte) i_92_);
                                    stream.f(-1);
                                    stream.a((float) i_65_);
                                    stream.a((float) i_66_);
                                    if (anIntArrayArrayArray8252 != null) stream.a((float) (is_44_ == null ? 0 : -1 + (is_44_[i_64_])));
                                    if ((0x7 & this.anInt8235) != 0) {
                                        stream.a(f_77_);
                                        stream.a(f_76_);
                                        stream.a(f_78_);
                                    }
                                } else {
                                    stream.b((float) i_65_);
                                    stream.b((float) (this.method3986(i_65_, i_66_, (byte) -101) - -i_71_));
                                    stream.b((float) i_66_);
                                    stream.f((byte) (i_92_ >> 16));
                                    stream.f((byte) (i_92_ >> 8));
                                    stream.f((byte) i_92_);
                                    stream.f(-1);
                                    stream.b((float) i_65_);
                                    stream.b((float) i_66_);
                                    if (anIntArrayArrayArray8252 != null) stream.b((float) (is_44_ != null ? is_44_[i_64_] + -1 : 0));
                                    if ((0x7 & this.anInt8235) != 0) {
                                        stream.b(f_77_);
                                        stream.b(f_76_);
                                        stream.b(f_78_);
                                    }
                                }
                                i_91_ = anInt8246++;
                                is_63_[i_64_] = (short) i_91_;
                                if (i_69_ != -1) class348_sub20s[i_91_] = class348_sub20s_38_[i_64_];
                                class356.method3483((byte) 114, l, new Class348_Sub29(is_63_[i_64_]));
                            } else {
                                is_63_[i_64_] = ((Class348_Sub29) class348).aShort6911;
                                i_91_ = 0xffff & is_63_[i_64_];
                                if (i_69_ != -1 && ((class348_sub20s[i_91_].aLong4291) > class348_sub20s_38_[i_64_].aLong4291)) class348_sub20s[i_91_] = class348_sub20s_38_[i_64_];
                            }
                            for (int i_98_ = 0; i_98_ < i_60_; i_98_++)
                                class348_sub20s_35_[i_98_].method2949((byte) 97, i_91_, i_74_, i_75_, f_89_);
                            anInt8257++;
                        }
                    }
                }
            }
            for (int i_99_ = 0; anInt8246 > i_99_; i_99_++) {
                Class348_Sub20 class348_sub20 = class348_sub20s[i_99_];
                if (class348_sub20 != null) class348_sub20.method2951(3, i_99_);
            }
            for (int i_100_ = 0; this.anInt4587 > i_100_; i_100_++) {
                for (int i_101_ = 0; i_101_ < this.anInt4590; i_101_++) {
                    short[] is_102_ = (this.aShortArrayArray8267[i_101_ * this.anInt4587 + i_100_]);
                    if (is_102_ != null) {
                        int i_103_ = 0;
                        int i_104_ = 0;
                        while (is_102_.length > i_104_) {
                            int i_105_ = is_102_[i_104_++] & 0xffff;
                            int i_106_ = is_102_[i_104_++] & 0xffff;
                            int i_107_ = 0xffff & is_102_[i_104_++];
                            Class348_Sub20 class348_sub20 = class348_sub20s[i_105_];
                            Class348_Sub20 class348_sub20_108_ = class348_sub20s[i_106_];
                            Class348_Sub20 class348_sub20_109_ = class348_sub20s[i_107_];
                            Class348_Sub20 class348_sub20_110_ = null;
                            if (class348_sub20 != null) {
                                class348_sub20.method2945(i_100_, (byte) 18, i_101_, i_103_);
                                class348_sub20_110_ = class348_sub20;
                            }
                            if (class348_sub20_108_ != null) {
                                class348_sub20_108_.method2945(i_100_, (byte) 18, i_101_, i_103_);
                                if (class348_sub20_110_ == null || ((class348_sub20_110_.aLong4291) > (class348_sub20_108_.aLong4291))) class348_sub20_110_ = class348_sub20_108_;
                            }
                            if (class348_sub20_109_ != null) {
                                class348_sub20_109_.method2945(i_100_, (byte) 18, i_101_, i_103_);
                                if (class348_sub20_110_ == null || ((class348_sub20_109_.aLong4291) < (class348_sub20_110_.aLong4291))) class348_sub20_110_ = class348_sub20_109_;
                            }
                            if (class348_sub20_110_ != null) {
                                if (class348_sub20 != null) class348_sub20_110_.method2951(3, i_105_);
                                if (class348_sub20_108_ != null) class348_sub20_110_.method2951(3, i_106_);
                                if (class348_sub20_109_ != null) class348_sub20_110_.method2951(3, i_107_);
                                class348_sub20_110_.method2945(i_100_, (byte) 18, i_101_, i_103_);
                            }
                            i_103_++;
                        }
                    }
                }
            }
            stream.a();
            anInterface2_8279 = this.aHa_Sub2_8272.method3739(8448, nativeheapbuffer, false, i, stream.b());
            this.aClass123_8276 = new Class123(anInterface2_8279, 5126, 3, 0);
            aClass123_8274 = new Class123(anInterface2_8279, 5121, 4, 12);
            int i_111_;
            if (anIntArrayArrayArray8252 == null) {
                i_111_ = 24;
                this.aClass123_8277 = new Class123(anInterface2_8279, 5126, 2, 16);
            } else {
                i_111_ = 28;
                this.aClass123_8277 = new Class123(anInterface2_8279, 5126, 3, 16);
            }
            if ((0x7 & this.anInt8235) != 0) this.aClass123_8275 = new Class123(anInterface2_8279, 5126, 3, i_111_);
            long[] ls = new long[aClass348_Sub20Array8282.length];
            for (int i_112_ = 0; i_112_ < aClass348_Sub20Array8282.length; i_112_++) {
                Class348_Sub20 class348_sub20 = aClass348_Sub20Array8282[i_112_];
                ls[i_112_] = class348_sub20.aLong4291;
                class348_sub20.method2952(17795, anInt8246);
            }
            Class339.method2669(aClass348_Sub20Array8282, ls, -21);
            if (aClass104_8266 != null) aClass104_8266.method957(0);
        }
        anInt8247++;
        anIntArrayArrayArray8258 = null;
        aFloatArrayArray8285 = aFloatArrayArray8281 = aFloatArrayArray8283 = null;
        anIntArrayArrayArray8252 = null;
        aClass348_Sub20ArrayArrayArray8243 = null;
        this.anIntArrayArrayArray8253 = null;
        aByteArrayArray8273 = null;
        aClass356_8278 = null;
        anIntArrayArrayArray8245 = null;
        this.anIntArrayArrayArray8268 = this.anIntArrayArrayArray8234 = null;
    }

    private final void method3998(byte i, int i_113_, int i_114_, r_Sub2 var_r_Sub2) {
        anInt8254++;
        int[] is = this.anIntArrayArrayArray8268[i_113_][i_114_];
        if (i != -82) method3981(null, null);
        int[] is_115_ = this.anIntArrayArrayArray8234[i_113_][i_114_];
        int i_116_ = is.length;
        if (this.aHa_Sub2_8272.anIntArray7880.length < i_116_) {
            this.aHa_Sub2_8272.anIntArray7883 = new int[i_116_];
            this.aHa_Sub2_8272.anIntArray7880 = new int[i_116_];
        }
        int[] is_117_ = this.aHa_Sub2_8272.anIntArray7880;
        int[] is_118_ = this.aHa_Sub2_8272.anIntArray7883;
        for (int i_119_ = 0; i_119_ < i_116_; i_119_++) {
            is_117_[i_119_] = (is[i_119_] >> this.aHa_Sub2_8272.anInt7731);
            is_118_[i_119_] = (is_115_[i_119_] >> this.aHa_Sub2_8272.anInt7731);
        }
        int i_120_ = 0;
        while (i_120_ < i_116_) {
            int i_121_ = is_117_[i_120_];
            int i_122_ = is_118_[i_120_++];
            int i_123_ = is_117_[i_120_];
            int i_124_ = is_118_[i_120_++];
            int i_125_ = is_117_[i_120_];
            int i_126_ = is_118_[i_120_++];
            if (((-i_123_ + i_121_) * (i_124_ + -i_126_) - (i_125_ - i_123_) * (i_124_ - i_122_)) > 0) var_r_Sub2.method3294(i_125_, i_121_, i_122_, 63, i_123_, i_126_, i_124_);
        }
    }

    final void method3979(int i, int i_127_) {
        anInt8239++;
    }

    final void CA(r var_r, int i, int i_128_, int i_129_, int i_130_, boolean bool) {
        anInt8236++;
        if (aClass104_8266 != null && var_r != null) {
            int i_131_ = (i - ((i_128_ * this.aHa_Sub2_8272.anInt7772) >> 8) >> this.aHa_Sub2_8272.anInt7731);
            int i_132_ = (-((this.aHa_Sub2_8272.anInt7777 * i_128_) >> 8) + i_129_ >> this.aHa_Sub2_8272.anInt7731);
            aClass104_8266.method959(i_131_, i_132_, (byte) 107, var_r);
        }
    }

    s_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_133_, int i_134_, int i_135_, int[][] is, int[][] is_136_, int i_137_) {
        super(i_134_, i_135_, i_137_, is);
        do {
            try {
                this.aHa_Sub2_8272 = var_ha_Sub2;
                anInt8264 = this.anInt4588 + -2;
                anIntArrayArrayArray8245 = new int[i_134_][i_135_][];
                aByteArrayArray8240 = new byte[i_134_][i_135_];
                this.anIntArrayArrayArray8268 = new int[i_134_][i_135_][];
                this.anIntArrayArrayArray8253 = new int[i_134_][i_135_][];
                aFloatArrayArray8285 = (new float[1 + this.anInt4587]
                        [this.anInt4590 + 1]);
                aClass348_Sub20ArrayArrayArray8243 = new Class348_Sub20[i_134_][i_135_][];
                anIntArrayArrayArray8258 = new int[i_134_][i_135_][];
                aFloatArrayArray8281 = (new float[1 + this.anInt4587]
                        [1 + this.anInt4590]);
                aByteArrayArray8273 = new byte[1 + i_134_][i_135_ - -1];
                this.aShortArrayArray8267 = new short[i_135_ * i_134_][];
                anInt8260 = 1 << anInt8264;
                this.anIntArrayArrayArray8234 = new int[i_134_][i_135_][];
                aFloatArrayArray8283 = (new float[1 + this.anInt4587]
                        [1 + this.anInt4590]);
                this.anInt8235 = i_133_;
                for (int i_138_ = 1; this.anInt4590 > i_138_; i_138_++) {
                    for (int i_139_ = 1; this.anInt4587 > i_139_; i_139_++) {
                        int i_140_ = (is_136_[1 + i_139_][i_138_] + -is_136_[-1 + i_139_][i_138_]);
                        int i_141_ = (is_136_[i_139_][1 + i_138_] + -is_136_[i_139_][i_138_ - 1]);
                        float f = (float) (1.0 / Math.sqrt(i_141_ * i_141_ + (i_137_ * i_137_ * 4) + (i_140_ * i_140_)));
                        aFloatArrayArray8285[i_139_][i_138_] = f * (float) i_140_;
                        aFloatArrayArray8281[i_139_][i_138_] = f * (float) (-i_137_ * 2);
                        aFloatArrayArray8283[i_139_][i_138_] = (float) i_141_ * f;
                    }
                }
                aClass356_8278 = new Class356(128);
                if ((0x10 & this.anInt8235) == 0) break;
                aClass104_8266 = new Class104(this.aHa_Sub2_8272, this);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("ed.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_133_ + ',' + i_134_ + ',' + i_135_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_136_ != null ? "{...}" : "null") + ',' + i_137_ + ')'));
            }
            break;
        } while (false);
    }

    final boolean method3989(r var_r, int i, int i_142_, int i_143_, int i_144_, boolean bool) {
        anInt8244++;
        if (aClass104_8266 == null || var_r == null) return false;
        int i_145_ = (-(i_142_ * this.aHa_Sub2_8272.anInt7772 >> 8) + i >> this.aHa_Sub2_8272.anInt7731);
        int i_146_ = (i_143_ + -((this.aHa_Sub2_8272.anInt7777 * i_142_) >> 8) >> this.aHa_Sub2_8272.anInt7731);
        return aClass104_8266.method954(i_145_, (byte) 88, i_146_, var_r);
    }

    static final boolean method3999(int i, int i_147_, int i_148_) {
        if (i_148_ != 458752) anInt8237 = -28;
        anInt8238++;
        return (0x70000 & i_147_) != 0 | Class223.method1613(false, i, i_147_) || Class288.method2187(i_147_, -121, i);
    }

    final void method3983(int i, int i_149_, int i_150_, boolean[][] bools, boolean bool, int i_151_) {
        method4003(-1, i_150_, bool, -49, i, i_151_, bools, i_149_);
        anInt8255++;
    }

    public static void method4000(int i) {
        if (i != 8448) aString8265 = null;
        anIntArray8269 = null;
        aString8265 = null;
        aClass107_8241 = null;
    }

    final void method3987(int i, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, boolean[][] bools) {
        anInt8262++;
        if (anInt8284 > 0) {
            this.aHa_Sub2_8272.method3755(-32);
            this.aHa_Sub2_8272.method3807(false, 2);
            this.aHa_Sub2_8272.method3728(false, 92);
            this.aHa_Sub2_8272.method3752(117, false);
            this.aHa_Sub2_8272.method3748(0, false);
            this.aHa_Sub2_8272.method3753(0, 1);
            this.aHa_Sub2_8272.method3757(-2, -100);
            this.aHa_Sub2_8272.method3771((byte) -86, null);
            Class73.aFloatArray4772[0] = ((float) i_153_ / ((float) (this.aHa_Sub2_8272.anInt7688) * ((float) this.anInt4592 * 128.0F)));
            Class73.aFloatArray4772[8] = 0.0F;
            Class73.aFloatArray4772[13] = 1.0F - (((float) (i_157_ * i_153_) / 128.0F + (float) (i_152_ * 2)) / (float) (this.aHa_Sub2_8272.anInt7641));
            Class73.aFloatArray4772[7] = 0.0F;
            Class73.aFloatArray4772[6] = 0.0F;
            Class73.aFloatArray4772[5] = ((float) i_153_ / ((float) (this.aHa_Sub2_8272.anInt7641) * ((float) this.anInt4592 * 128.0F)));
            Class73.aFloatArray4772[1] = 0.0F;
            Class73.aFloatArray4772[4] = 0.0F;
            Class73.aFloatArray4772[14] = 0.0F;
            Class73.aFloatArray4772[12] = -(((float) (i_153_ * i_154_) / 128.0F - (float) (2 * i)) / (float) (this.aHa_Sub2_8272.anInt7688)) + -1.0F;
            Class73.aFloatArray4772[10] = 0.0F;
            Class73.aFloatArray4772[15] = 1.0F;
            Class73.aFloatArray4772[3] = 0.0F;
            Class73.aFloatArray4772[2] = 0.0F;
            Class73.aFloatArray4772[9] = 0.0F;
            Class73.aFloatArray4772[11] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(Class73.aFloatArray4772, 0);
            Class73.aFloatArray4772[12] = 0.0F;
            Class73.aFloatArray4772[4] = 0.0F;
            Class73.aFloatArray4772[0] = 1.0F;
            Class73.aFloatArray4772[14] = 0.0F;
            Class73.aFloatArray4772[6] = 1.0F;
            Class73.aFloatArray4772[8] = 0.0F;
            Class73.aFloatArray4772[11] = 0.0F;
            Class73.aFloatArray4772[13] = 0.0F;
            Class73.aFloatArray4772[7] = 0.0F;
            Class73.aFloatArray4772[5] = 0.0F;
            Class73.aFloatArray4772[15] = 1.0F;
            Class73.aFloatArray4772[2] = 0.0F;
            Class73.aFloatArray4772[3] = 0.0F;
            Class73.aFloatArray4772[9] = 1.0F;
            Class73.aFloatArray4772[10] = 0.0F;
            Class73.aFloatArray4772[1] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(Class73.aFloatArray4772, 0);
            if ((0x7 & this.anInt8235) == 0) this.aHa_Sub2_8272.method3728(false, 56);
            else {
                this.aHa_Sub2_8272.method3728(true, 91);
                this.aHa_Sub2_8272.method3796(16384);
            }
            this.aHa_Sub2_8272.method3794(this.aClass123_8276, aClass123_8274, -26411, this.aClass123_8277, this.aClass123_8275);
            if (this.aHa_Sub2_8272.aClass348_Sub49_Sub1_7798.aByteArray7154.length < anInt8257 * 2) this.aHa_Sub2_8272.aClass348_Sub49_Sub1_7798 = new Class348_Sub49_Sub1(anInt8257 * 2);
            else this.aHa_Sub2_8272.aClass348_Sub49_Sub1_7798.anInt7197 = 0;
            int i_158_ = 0;
            Class348_Sub49_Sub1 class348_sub49_sub1 = (this.aHa_Sub2_8272.aClass348_Sub49_Sub1_7798);
            if (this.aHa_Sub2_8272.aBoolean7775) {
                for (int i_159_ = i_155_; i_159_ < i_157_; i_159_++) {
                    int i_160_ = i_159_ * this.anInt4587 + i_154_;
                    for (int i_161_ = i_154_; i_156_ > i_161_; i_161_++) {
                        if (bools[-i_154_ + i_161_][-i_155_ + i_159_]) {
                            short[] is = this.aShortArrayArray8267[i_160_];
                            if (is != null) {
                                for (int i_162_ = 0; i_162_ < is.length; i_162_++) {
                                    class348_sub49_sub1.writeShort((byte) 107, (is[i_162_] & 0xffff));
                                    i_158_++;
                                }
                            }
                        }
                        i_160_++;
                    }
                }
            } else {
                for (int i_163_ = i_155_; i_163_ < i_157_; i_163_++) {
                    int i_164_ = i_154_ + i_163_ * this.anInt4587;
                    for (int i_165_ = i_154_; i_156_ > i_165_; i_165_++) {
                        if (bools[i_165_ + -i_154_][i_163_ + -i_155_]) {
                            short[] is = this.aShortArrayArray8267[i_164_];
                            if (is != null) {
                                for (int i_166_ = 0; i_166_ < is.length; i_166_++) {
                                    class348_sub49_sub1.method3397(84, 0xffff & is[i_166_]);
                                    i_158_++;
                                }
                            }
                        }
                        i_164_++;
                    }
                }
            }
            if (i_158_ > 0) {
                Class119_Sub2 class119_sub2 = new Class119_Sub2(this.aHa_Sub2_8272, 5123, (class348_sub49_sub1.aByteArray7154), (class348_sub49_sub1.anInt7197));
                this.aHa_Sub2_8272.method3759(i_158_, -128, 4, class119_sub2, 0);
            }
        }
    }

    static final void method4001(Class318_Sub1 class318_sub1) {
        Class9.aHa171.H(class318_sub1.anInt6377, (class318_sub1.anInt6382 + (class318_sub1.method2394(true) >> 1)), class318_sub1.anInt6388, Class348_Sub42_Sub3.anIntArray9505);
        class318_sub1.anInt6386 = Class348_Sub42_Sub3.anIntArray9505[0];
        class318_sub1.anInt6380 = Class348_Sub42_Sub3.anIntArray9505[1];
        class318_sub1.anInt6389 = Class348_Sub42_Sub3.anIntArray9505[2];
    }

    final r fa(int i, int i_167_, r var_r) {
        anInt8259++;
        if ((0x1 & aByteArrayArray8240[i][i_167_]) == 0) return null;
        int i_168_ = (this.anInt4592 >> this.aHa_Sub2_8272.anInt7731);
        r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
        r_Sub2 var_r_Sub2_169_;
        if (var_r_Sub2 == null || !var_r_Sub2.method3296((byte) 104, i_168_, i_168_)) var_r_Sub2_169_ = new r_Sub2(this.aHa_Sub2_8272, i_168_, i_168_);
        else {
            var_r_Sub2_169_ = var_r_Sub2;
            var_r_Sub2_169_.method3293((byte) 0);
        }
        var_r_Sub2_169_.method3292(i_168_, i_168_, 0, 25053, 0);
        method3998((byte) -82, i, i_167_, var_r_Sub2_169_);
        return var_r_Sub2_169_;
    }

    static final void method4002(Class348_Sub49 class348_sub49, byte i) {
        anInt8248++;
        byte[] is = new byte[24];
        if (i == 55) {
            if (Class374.aClass78_4538 != null) {
                try {
                    Class374.aClass78_4538.method789(0L, (byte) -120);
                    Class374.aClass78_4538.method784(-89, is);
                    int i_170_;
                    for (i_170_ = 0; i_170_ < 24; i_170_++) {
                        if (is[i_170_] != 0) break;
                    }
                    if (i_170_ >= 24) throw new IOException();
                } catch (Exception exception) {
                    for (int i_171_ = 0; i_171_ < 24; i_171_++)
                        is[i_171_] = (byte) -1;
                }
            }
            class348_sub49.writeBytes(24, 0, is, i ^ 0x8);
        }
    }

    final void method3984(int i, int i_172_, int i_173_, boolean[][] bools, boolean bool, int i_174_, int i_175_) {
        anInt8263++;
        method4003(i_174_, i_173_, bool, -62, i, i_175_, bools, i_172_);
    }

    final void method3981(Class348_Sub1 class348_sub1, int[] is) {
        try {
            anInt8271++;
            aClass262_8256.method1999(new Class348_Sub32((this.aHa_Sub2_8272), this, class348_sub1, is), -20180);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ed.L(" + (class348_sub1 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    final void U(int i, int i_176_, int[] is, int[] is_177_, int[] is_178_, int[] is_179_, int[] is_180_, int[] is_181_, int[] is_182_, int[] is_183_, int i_184_, int i_185_, int i_186_, boolean bool) {
        try {
            anInt8261++;
            if (is_177_ != null && anIntArrayArrayArray8258 == null) anIntArrayArrayArray8258 = new int[this.anInt4587][this.anInt4590][];
            d var_d = this.aHa_Sub2_8272.aD4579;
            if (is_179_ != null && anIntArrayArrayArray8252 == null) anIntArrayArrayArray8252 = new int[this.anInt4587][this.anInt4590][];
            this.anIntArrayArrayArray8268[i][i_176_] = is;
            this.anIntArrayArrayArray8234[i][i_176_] = is_178_;
            this.anIntArrayArrayArray8253[i][i_176_] = is_180_;
            anIntArrayArrayArray8245[i][i_176_] = is_181_;
            if (anIntArrayArrayArray8252 != null) anIntArrayArrayArray8252[i][i_176_] = is_179_;
            if (anIntArrayArrayArray8258 != null) anIntArrayArrayArray8258[i][i_176_] = is_177_;
            Class348_Sub20[] class348_sub20s = (aClass348_Sub20ArrayArrayArray8243[i][i_176_] = new Class348_Sub20[is_180_.length]);
            for (int i_187_ = 0; i_187_ < is_180_.length; i_187_++) {
                int i_188_ = is_182_[i_187_];
                int i_189_ = is_183_[i_187_];
                if ((0x20 & this.anInt8235) != 0 && i_188_ != -1 && var_d.method3(i_188_, -6662).aBoolean209) {
                    i_188_ = -1;
                    i_189_ = 128;
                }
                long l = ((long) i_184_ << 28 | ((long) i_185_ << 42 | (long) i_186_ << 48) | (long) (i_189_ << 14) | (long) i_188_);
                Class348 class348;
                for (class348 = aClass356_8278.method3480(l, -6008); class348 != null; class348 = aClass356_8278.method3476(true)) {
                    Class348_Sub20 class348_sub20 = (Class348_Sub20) class348;
                    if (i_188_ == class348_sub20.anInt6841 && (class348_sub20.aFloat6832 == (float) i_189_) && (class348_sub20.anInt6825 == i_184_) && (i_185_ == class348_sub20.anInt6833) && (class348_sub20.anInt6826 == i_186_)) break;
                }
                if (class348 == null) {
                    class348_sub20s[i_187_] = new Class348_Sub20(this, i_188_, i_189_, i_184_, i_185_, i_186_);
                    aClass356_8278.method3483((byte) 99, l, class348_sub20s[i_187_]);
                } else class348_sub20s[i_187_] = (Class348_Sub20) class348;
            }
            if (bool) aByteArrayArray8240[i][i_176_] = (byte) Class273.method2057((aByteArrayArray8240[i][i_176_]), 1);
            if (is_180_.length > anInt8280) anInt8280 = is_180_.length;
            anInt8284 += is_180_.length;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ed.U(" + i + ',' + i_176_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_177_ != null ? "{...}" : "null") + ',' + (is_178_ != null ? "{...}" : "null") + ',' + (is_179_ != null ? "{...}" : "null") + ',' + (is_180_ != null ? "{...}" : "null") + ',' + (is_181_ != null ? "{...}" : "null") + ',' + (is_182_ != null ? "{...}" : "null") + ',' + (is_183_ != null ? "{...}" : "null") + ',' + i_184_ + ',' + i_185_ + ',' + i_186_ + ',' + bool + ')'));
        }
    }

    final void ka(int i, int i_190_, int i_191_) {
        if (i_191_ > (0xff & aByteArrayArray8273[i][i_190_])) aByteArrayArray8273[i][i_190_] = (byte) i_191_;
        anInt8242++;
    }

    private final void method4003(int i, int i_192_, boolean bool, int i_193_, int i_194_, int i_195_, boolean[][] bools, int i_196_) {
        anInt8250++;
        if (i_193_ >= -39) anInt8280 = -20;
        if (aClass348_Sub20Array8282 != null) {
            int i_197_ = i_192_ + i_192_ - -1;
            i_197_ *= i_197_;
            if (this.aHa_Sub2_8272.anIntArray7882.length < i_197_) this.aHa_Sub2_8272.anIntArray7882 = new int[i_197_];
            if (anInt8257 * 2 > (this.aHa_Sub2_8272.aClass348_Sub49_Sub1_7798.aByteArray7154).length) this.aHa_Sub2_8272.aClass348_Sub49_Sub1_7798 = new Class348_Sub49_Sub1(2 * anInt8257);
            int i_198_ = -i_192_ + i_194_;
            int i_199_ = i_198_;
            if (i_198_ < 0) i_198_ = 0;
            int i_200_ = i_196_ - i_192_;
            int i_201_ = i_200_;
            if (i_200_ < 0) i_200_ = 0;
            int i_202_ = i_192_ + i_194_;
            if (i_202_ > this.anInt4587 - 1) i_202_ = -1 + this.anInt4587;
            int i_203_ = i_196_ + i_192_;
            if (-1 + this.anInt4590 < i_203_) i_203_ = this.anInt4590 + -1;
            int i_204_ = 0;
            int[] is = this.aHa_Sub2_8272.anIntArray7882;
            for (int i_205_ = i_198_; i_202_ >= i_205_; i_205_++) {
                boolean[] bools_206_ = bools[-i_199_ + i_205_];
                for (int i_207_ = i_200_; i_203_ >= i_207_; i_207_++) {
                    if (bools_206_[-i_201_ + i_207_]) is[i_204_++] = i_205_ + i_207_ * this.anInt4587;
                }
            }
            if (i != -1) {
                this.aHa_Sub2_8272.method3789((byte) -120, (float) i);
                this.aHa_Sub2_8272.method3760(1);
            } else this.aHa_Sub2_8272.method3784((byte) -62);
            this.aHa_Sub2_8272.method3728((0x7 & (this.anInt8235)) != 0, 120);
            for (int i_208_ = 0; aClass348_Sub20Array8282.length > i_208_; i_208_++)
                aClass348_Sub20Array8282[i_208_].method2948(5123, i_204_, is);
            if (!aClass262_8256.method2002((byte) 18)) {
                int i_209_ = this.aHa_Sub2_8272.anInt7856;
                int i_210_ = this.aHa_Sub2_8272.anInt7782;
                this.aHa_Sub2_8272.L(0, i_210_, (this.aHa_Sub2_8272.anInt7813));
                this.aHa_Sub2_8272.method3728(false, 97);
                this.aHa_Sub2_8272.method3748(0, false);
                this.aHa_Sub2_8272.method3753(128, 1);
                this.aHa_Sub2_8272.method3757(-2, -88);
                this.aHa_Sub2_8272.method3771((byte) -124, (this.aHa_Sub2_8272.aClass258_Sub3_7827));
                this.aHa_Sub2_8272.method3729(8448, (byte) 98, 7681);
                this.aHa_Sub2_8272.method3762(34166, 770, (byte) -87, 0);
                this.aHa_Sub2_8272.method3775(false, 0, 770, 34167);
                for (Class348 class348 = aClass262_8256.method1995(4); class348 != null; class348 = aClass262_8256.method1990((byte) 92)) {
                    Class348_Sub32 class348_sub32 = (Class348_Sub32) class348;
                    class348_sub32.method3023(bools, 255, i_194_, i_196_, i_192_);
                }
                this.aHa_Sub2_8272.method3762(5890, 768, (byte) -87, 0);
                this.aHa_Sub2_8272.method3775(false, 0, 770, 5890);
                this.aHa_Sub2_8272.method3771((byte) -96, null);
                this.aHa_Sub2_8272.L(i_209_, i_210_, (this.aHa_Sub2_8272.anInt7813));
            }
            if (aClass104_8266 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.aHa_Sub2_8272.method3794(this.aClass123_8276, null, -26411, this.aClass123_8277, null);
                aClass104_8266.method956(bool, 112, bools, i_192_, i_196_, i_194_);
                OpenGL.glPopMatrix();
            }
        }
    }

    static {
        anIntArray8269 = new int[8];
    }
}
