/* s_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class s_Sub3 extends s {
    private final Class262 aClass262_8286;
    static int anInt8287;
    static int anInt8288;
    static int anInt8289;
    static int anInt8290;
    private int[][][] anIntArrayArrayArray8291;
    static int anInt8292;
    static int anInt8293;
    int anInt8294;
    static int anInt8295;
    int[][][] anIntArrayArrayArray8296;
    static int anInt8297;
    static int anInt8298;
    short[][] aShortArrayArray8299;
    static int anInt8300;
    private int anInt8301;
    private final int anInt8302;
    private int anInt8303;
    static int anInt8304;
    private float aFloat8305 = -3.4028235E38F;
    private float aFloat8306 = 3.4028235E38F;
    private Class330 aClass330_8307;
    private int[][][] anIntArrayArrayArray8308;
    static int anInt8309;
    static int anInt8310;
    private final int anInt8311;
    private Class348_Sub3[][][] aClass348_Sub3ArrayArrayArray8312;
    int[][][] anIntArrayArrayArray8313;
    private int[][][] anIntArrayArrayArray8314;
    static int anInt8315;
    static int anInt8316;
    private final byte[][] aByteArrayArray8317;
    static int anInt8318;
    static int anInt8319;
    static Class21 aClass21_8320 = new Class21();
    int[][][] anIntArrayArrayArray8321;
    ha_Sub3 aHa_Sub3_8322;
    private float[][] aFloatArrayArray8323;
    Class130 aClass130_8324;
    private Class356 aClass356_8325;
    private Interface5_Impl1 anInterface5_Impl1_8326;
    private Interface5_Impl1 anInterface5_Impl1_8327;
    private Class348_Sub3[] aClass348_Sub3Array8328;
    private int anInt8329;
    private byte[][] aByteArrayArray8330;
    private int anInt8331;
    private float[][] aFloatArrayArray8332;
    private float[][] aFloatArrayArray8333;

    final r fa(int i, int i_0_, r var_r) {
        anInt8290++;
        if ((aByteArrayArray8317[i][i_0_] & 0x1 ^ 0xffffffff) == -1)
            return null;
        int i_1_ = (this.anInt4592
                >> this.aHa_Sub3_8322.anInt8107);
        r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
        r_Sub1 var_r_Sub1_2_;
        if (var_r_Sub1 != null
                && var_r_Sub1.method3291(i_1_, i_1_, (byte) -59)) {
            var_r_Sub1_2_ = var_r_Sub1;
            var_r_Sub1_2_.method3289(11);
        } else
            var_r_Sub1_2_
                    = new r_Sub1(this.aHa_Sub3_8322, i_1_, i_1_);
        var_r_Sub1_2_.method3286(i_1_, -97, i_1_, 0, 0);
        method4005(var_r_Sub1_2_, i_0_, i, 21722);
        return var_r_Sub1_2_;
    }

    static final void method4004(int i, int i_3_, int i_4_, int i_5_, int i_6_,
                                 int i_7_, int i_8_, int i_9_) {
        anInt8292++;
        int i_10_ = Class85.method831(Class38.anInt513, i_4_,
                Class132.anInt1910, -118);
        int i_11_
                = Class85.method831(Class38.anInt513, i, Class132.anInt1910, 72);
        int i_12_ = Class85.method831(Class113.anInt1745, i_8_,
                Class369.anInt4960, -80);
        int i_13_ = Class85.method831(Class113.anInt1745, i_3_,
                Class369.anInt4960, -101);
        int i_14_ = Class85.method831(Class38.anInt513, i_4_ + i_6_,
                Class132.anInt1910, -110);
        int i_15_ = Class85.method831(Class38.anInt513, i + -i_6_,
                Class132.anInt1910, 28);
        if (i_7_ < -33) {
            for (int i_16_ = i_10_;
                 (i_14_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++)
                Class135_Sub2.method1156(-27, i_13_,
                        Class17.anIntArrayArray255[i_16_],
                        i_12_, i_9_);
            for (int i_17_ = i_11_; i_17_ > i_15_; i_17_--)
                Class135_Sub2.method1156(-27, i_13_,
                        Class17.anIntArrayArray255[i_17_],
                        i_12_, i_9_);
            int i_18_ = Class85.method831(Class113.anInt1745, i_8_ + i_6_,
                    Class369.anInt4960, 114);
            int i_19_ = Class85.method831(Class113.anInt1745, -i_6_ + i_3_,
                    Class369.anInt4960, 34);
            for (int i_20_ = i_14_; i_20_ <= i_15_; i_20_++) {
                int[] is = Class17.anIntArrayArray255[i_20_];
                Class135_Sub2.method1156(-27, i_18_, is, i_12_, i_9_);
                Class135_Sub2.method1156(-27, i_19_, is, i_18_, i_5_);
                Class135_Sub2.method1156(-27, i_13_, is, i_19_, i_9_);
            }
        }
    }

    private final void method4005(r_Sub1 var_r_Sub1, int i, int i_21_,
                                  int i_22_) {
        anInt8310++;
        if (i_22_ != 21722)
            fa(16, 8, null);
        int[] is = this.anIntArrayArrayArray8321[i_21_][i];
        int[] is_23_ = this.anIntArrayArrayArray8313[i_21_][i];
        int i_24_ = is.length;
        if (Class30.anIntArray407.length < i_24_) {
            Class30.anIntArray407 = new int[i_24_];
            Class232.anIntArray3014 = new int[i_24_];
        }
        for (int i_25_ = 0; (i_24_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff);
             i_25_++) {
            Class30.anIntArray407[i_25_]
                    = (is[i_25_]
                    >> this.aHa_Sub3_8322.anInt8107);
            Class232.anIntArray3014[i_25_]
                    = (is_23_[i_25_]
                    >> this.aHa_Sub3_8322.anInt8107);
        }
        int i_26_ = 0;
        while (i_24_ > i_26_) {
            int i_27_ = Class30.anIntArray407[i_26_];
            int i_28_ = Class232.anIntArray3014[i_26_++];
            int i_29_ = Class30.anIntArray407[i_26_];
            int i_30_ = Class232.anIntArray3014[i_26_++];
            int i_31_ = Class30.anIntArray407[i_26_];
            int i_32_ = Class232.anIntArray3014[i_26_++];
            if (((-((-i_29_ + i_31_) * (i_30_ - i_28_))
                    + (i_27_ - i_29_) * (i_30_ - i_32_))
                    ^ 0xffffffff)
                    < -1)
                var_r_Sub1.method3287(i_28_, i_22_ + -21622, i_27_, i_29_,
                        i_30_, i_32_, i_31_);
        }
    }

    final void wa(r var_r, int i, int i_33_, int i_34_, int i_35_,
                  boolean bool) {
        anInt8315++;
        if (aClass330_8307 != null && var_r != null) {
            int i_36_
                    = (i + -(i_33_ * (this.aHa_Sub3_8322
                    .anInt8133)
                    >> 461407496)
                    >> this.aHa_Sub3_8322.anInt8107);
            int i_37_
                    = (i_34_ - ((this.aHa_Sub3_8322
                    .anInt8114) * i_33_
                    >> 689813064)
                    >> this.aHa_Sub3_8322.anInt8107);
            aClass330_8307.method2629(i_37_, var_r, 1, i_36_);
        }
    }

    final void method3979(int i, int i_38_) {
        anInt8293++;
    }

    final void CA(r var_r, int i, int i_39_, int i_40_, int i_41_,
                  boolean bool) {
        anInt8319++;
        if (aClass330_8307 != null && var_r != null) {
            int i_42_
                    = (i + -((this.aHa_Sub3_8322.anInt8133
                    * i_39_)
                    >> -1458073752)
                    >> this.aHa_Sub3_8322.anInt8107);
            int i_43_
                    = (-((this.aHa_Sub3_8322.anInt8114
                    * i_39_)
                    >> -2146527224) + i_40_
                    >> this.aHa_Sub3_8322.anInt8107);
            aClass330_8307.method2633(287, i_42_, var_r, i_43_);
        }
    }

    public static void method4006(int i) {
        aClass21_8320 = null;
        if (i > -42)
            aClass21_8320 = null;
    }

    final void YA() {
        if (anInt8329 <= 0)
            aClass330_8307 = null;
        else {
            byte[][] is
                    = new byte[1 + this.anInt4587][this.anInt4590 + 1];
            for (int i = 1;
                 (i ^ 0xffffffff) > (this.anInt4587 ^ 0xffffffff); i++) {
                for (int i_44_ = 1; i_44_ < this.anInt4590; i_44_++)
                    is[i][i_44_]
                            = (byte) ((aByteArrayArray8330[i][-1 + i_44_]
                            >> 119244098)
                            + (aByteArrayArray8330[1 + i][i_44_]
                            >> 808633315)
                            + ((aByteArrayArray8330[i + -1][i_44_]
                            >> 1065603234)
                            + (aByteArrayArray8330[i][1 + i_44_]
                            >> 1691981219))
                            + (aByteArrayArray8330[i][i_44_]
                            >> -1926185375));
            }
            Class348_Sub3[] class348_sub3s
                    = new Class348_Sub3[aClass356_8325.method3474(1)];
            aClass356_8325.method3477(3, class348_sub3s);
            for (int i = 0; i < class348_sub3s.length; i++)
                class348_sub3s[i].method2736((byte) -57, anInt8329);
            int i = 20;
            if (anIntArrayArrayArray8314 != null)
                i += 4;
            if ((this.anInt8294 & 0x7 ^ 0xffffffff) != -1)
                i += 12;
            jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer
                    = this.aHa_Sub3_8322.aNativeHeap7891
                    .a(anInt8329 * 4, false);
            jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_45_
                    = this.aHa_Sub3_8322.aNativeHeap7891
                    .a(anInt8329 * i, false);
            Stream stream = new Stream(nativeheapbuffer_45_);
            Stream stream_46_ = new Stream(nativeheapbuffer);
            Class348_Sub3[] class348_sub3s_47_ = new Class348_Sub3[anInt8329];
            int i_48_ = Class348_Sub40_Sub1.method3051(anInt8329 / 4, 4096);
            if (i_48_ < 1)
                i_48_ = 1;
            Class356 class356 = new Class356(i_48_);
            Class348_Sub3[] class348_sub3s_49_ = new Class348_Sub3[anInt8331];
            for (int i_50_ = 0; i_50_ < this.anInt4587; i_50_++) {
                for (int i_51_ = 0; ((this.anInt4590 ^ 0xffffffff)
                        < (i_51_ ^ 0xffffffff)); i_51_++) {
                    if (this.anIntArrayArrayArray8296[i_50_][i_51_]
                            != null) {
                        Class348_Sub3[] class348_sub3s_52_
                                = aClass348_Sub3ArrayArrayArray8312[i_50_][i_51_];
                        int[] is_53_
                                = (this.anIntArrayArrayArray8321[i_50_]
                                [i_51_]);
                        int[] is_54_
                                = (this.anIntArrayArrayArray8313[i_50_]
                                [i_51_]);
                        int[] is_55_ = anIntArrayArrayArray8291[i_50_][i_51_];
                        int[] is_56_
                                = (this.anIntArrayArrayArray8296[i_50_]
                                [i_51_]);
                        int[] is_57_
                                = (anIntArrayArrayArray8308 == null ? null
                                : anIntArrayArrayArray8308[i_50_][i_51_]);
                        int[] is_58_
                                = (anIntArrayArrayArray8314 != null
                                ? anIntArrayArrayArray8314[i_50_][i_51_]
                                : null);
                        if (is_55_ == null)
                            is_55_ = is_56_;
                        float f = aFloatArrayArray8333[i_50_][i_51_];
                        float f_59_ = aFloatArrayArray8332[i_50_][i_51_];
                        float f_60_ = aFloatArrayArray8323[i_50_][i_51_];
                        float f_61_ = aFloatArrayArray8333[i_50_][1 + i_51_];
                        float f_62_ = aFloatArrayArray8332[i_50_][i_51_ - -1];
                        float f_63_ = aFloatArrayArray8323[i_50_][i_51_ - -1];
                        float f_64_
                                = aFloatArrayArray8333[i_50_ - -1][1 + i_51_];
                        float f_65_
                                = aFloatArrayArray8332[1 + i_50_][1 + i_51_];
                        float f_66_
                                = aFloatArrayArray8323[i_50_ + 1][1 + i_51_];
                        float f_67_ = aFloatArrayArray8333[1 + i_50_][i_51_];
                        float f_68_ = aFloatArrayArray8332[i_50_ + 1][i_51_];
                        float f_69_ = aFloatArrayArray8323[1 + i_50_][i_51_];
                        int i_70_ = is[i_50_][i_51_] & 0xff;
                        int i_71_ = 0xff & is[i_50_][1 + i_51_];
                        int i_72_ = 0xff & is[i_50_ + 1][1 + i_51_];
                        int i_73_ = 0xff & is[1 + i_50_][i_51_];
                        int i_74_ = 0;
                        while_241_:
                        for (int i_75_ = 0; i_75_ < is_56_.length; i_75_++) {
                            Class348_Sub3 class348_sub3
                                    = class348_sub3s_52_[i_75_];
                            for (int i_76_ = 0;
                                 (i_74_ ^ 0xffffffff) < (i_76_ ^ 0xffffffff);
                                 i_76_++) {
                                if (class348_sub3 == class348_sub3s_49_[i_76_])
                                    continue while_241_;
                            }
                            class348_sub3s_49_[i_74_++] = class348_sub3;
                        }
                        short[] is_77_
                                = (this.aShortArrayArray8299
                                [i_51_ * this.anInt4587 - -i_50_]
                                = new short[is_56_.length]);
                        for (int i_78_ = 0; i_78_ < is_56_.length; i_78_++) {
                            int i_79_ = ((i_50_ << this.anInt4588)
                                    + is_53_[i_78_]);
                            int i_80_ = ((i_51_ << this.anInt4588)
                                    - -is_54_[i_78_]);
                            int i_81_ = i_79_ >> anInt8302;
                            int i_82_ = i_80_ >> anInt8302;
                            int i_83_ = is_56_[i_78_];
                            int i_84_ = is_55_[i_78_];
                            int i_85_ = is_57_ != null ? is_57_[i_78_] : 0;
                            long l = ((long) i_82_
                                    | ((long) i_83_ << -1629459168
                                    | (long) i_84_ << 1206159984
                                    | (long) (i_81_ << 1658580592)));
                            int i_86_ = is_53_[i_78_];
                            int i_87_ = is_54_[i_78_];
                            int i_88_ = 74;
                            int i_89_ = 0;
                            float f_90_;
                            float f_91_;
                            float f_92_;
                            if ((i_86_ ^ 0xffffffff) != -1 || i_87_ != 0) {
                                if (i_86_ != 0 || ((i_87_ ^ 0xffffffff)
                                        != (this.anInt4592
                                        ^ 0xffffffff))) {
                                    if (((this.anInt4592 ^ 0xffffffff)
                                            == (i_86_ ^ 0xffffffff))
                                            && this.anInt4592 == i_87_) {
                                        f_91_ = f_64_;
                                        f_92_ = f_66_;
                                        f_90_ = f_65_;
                                        i_88_ -= i_72_;
                                    } else if (((i_86_ ^ 0xffffffff)
                                            != (this.anInt4592
                                            ^ 0xffffffff))
                                            || (i_87_ ^ 0xffffffff) != -1) {
                                        float f_93_
                                                = ((float) i_86_
                                                / (float) this.anInt4592);
                                        float f_94_
                                                = ((float) i_87_
                                                / (float) this.anInt4592);
                                        float f_95_ = f + (f_67_ - f) * f_93_;
                                        float f_96_
                                                = f_59_ + (-f_59_ + f_68_) * f_93_;
                                        float f_97_
                                                = f_93_ * (f_69_ - f_60_) + f_60_;
                                        float f_98_
                                                = f_93_ * (-f_61_ + f_64_) + f_61_;
                                        float f_99_
                                                = f_62_ + (f_65_ - f_62_) * f_93_;
                                        f_91_
                                                = f_95_ + f_94_ * (-f_95_ + f_98_);
                                        f_90_
                                                = f_96_ + f_94_ * (f_99_ - f_96_);
                                        float f_100_
                                                = f_63_ + (-f_63_ + f_66_) * f_93_;
                                        f_92_
                                                = f_97_ + f_94_ * (f_100_ - f_97_);
                                        int i_101_ = (((-i_70_ + i_73_) * i_86_
                                                >> this.anInt4588)
                                                + i_70_);
                                        int i_102_
                                                = (i_71_
                                                + (i_86_ * (-i_71_ + i_72_)
                                                >> this.anInt4588));
                                        i_88_
                                                -= (i_101_
                                                - -(i_87_ * (-i_101_ + i_102_)
                                                >> this.anInt4588));
                                    } else {
                                        f_92_ = f_69_;
                                        f_91_ = f_67_;
                                        f_90_ = f_68_;
                                        i_88_ -= i_73_;
                                    }
                                } else {
                                    i_88_ -= i_71_;
                                    f_91_ = f_61_;
                                    f_90_ = f_62_;
                                    f_92_ = f_63_;
                                }
                            } else {
                                i_88_ -= i_70_;
                                f_90_ = f_59_;
                                f_91_ = f;
                                f_92_ = f_60_;
                            }
                            float f_103_ = 1.0F;
                            if (i_83_ != -1) {
                                int i_104_
                                        = i_88_ * (i_83_ & 0x7f) >> -1853998553;
                                if ((i_104_ ^ 0xffffffff) > -3)
                                    i_104_ = 2;
                                else if ((i_104_ ^ 0xffffffff) < -127)
                                    i_104_ = 126;
                                i_89_ = (Class10.anIntArray179
                                        [i_104_ | i_83_ & 0xff80]);
                                if ((this.anInt8294 & 0x7
                                        ^ 0xffffffff)
                                        == -1) {
                                    f_103_ = ((f_91_
                                            * (this
                                            .aHa_Sub3_8322
                                            .aFloatArray8170[0]))
                                            + f_90_ * (this
                                                    .aHa_Sub3_8322
                                            .aFloatArray8170[1])
                                            + (this
                                            .aHa_Sub3_8322
                                            .aFloatArray8170[2]) * f_92_);
                                    f_103_
                                            = ((f_103_
                                            * (!(f_103_ > 0.0F)
                                            ? (this
                                            .aHa_Sub3_8322
                                            .aFloat8186)
                                            : (this
                                            .aHa_Sub3_8322
                                            .aFloat8174)))
                                            + (this.aHa_Sub3_8322
                                            .aFloat8093));
                                }
                            }
                            Class348 class348 = null;
                            if ((i_79_ & anInt8311 - 1) == 0
                                    && (-1 + anInt8311 & i_80_) == 0)
                                class348 = class356.method3480(l, -6008);
                            int i_105_;
                            if (class348 == null) {
                                int i_106_;
                                if (i_84_ != i_83_) {
                                    int i_107_
                                            = (0x7f & i_84_) * i_88_ >> 1053960583;
                                    if ((i_107_ ^ 0xffffffff) <= -3) {
                                        if (i_107_ > 126)
                                            i_107_ = 126;
                                    } else
                                        i_107_ = 2;
                                    i_106_ = (Class10.anIntArray179
                                            [i_107_ | i_84_ & 0xff80]);
                                    if ((0x7 & this.anInt8294
                                            ^ 0xffffffff)
                                            == -1) {
                                        float f_108_
                                                = ((this.aHa_Sub3_8322
                                                .aFloatArray8170[2]) * f_92_
                                                + (f_90_ * (this
                                                        .aHa_Sub3_8322
                                                .aFloatArray8170[1])
                                                + ((this
                                                        .aHa_Sub3_8322
                                                .aFloatArray8170[0])
                                                * f_91_)));
                                        f_108_
                                                = ((this.aHa_Sub3_8322
                                                .aFloat8093)
                                                + (f_103_ > 0.0F
                                                ? (this
                                                        .aHa_Sub3_8322
                                                .aFloat8174)
                                                : (this
                                                        .aHa_Sub3_8322
                                                .aFloat8186)) * f_103_);
                                        int i_109_
                                                = 0xff & i_106_ >> -223316368;
                                        int i_110_
                                                = (i_106_ & 0xff04) >> -1875435064;
                                        int i_111_ = 0xff & i_106_;
                                        i_109_ *= f_108_;
                                        i_110_ *= f_108_;
                                        if (i_109_ < 0)
                                            i_109_ = 0;
                                        else if ((i_109_ ^ 0xffffffff) < -256)
                                            i_109_ = 255;
                                        i_111_ *= f_108_;
                                        if ((i_110_ ^ 0xffffffff) <= -1) {
                                            if (i_110_ > 255)
                                                i_110_ = 255;
                                        } else
                                            i_110_ = 0;
                                        if (i_111_ >= 0) {
                                            if ((i_111_ ^ 0xffffffff) < -256)
                                                i_111_ = 255;
                                        } else
                                            i_111_ = 0;
                                        i_106_
                                                = (i_109_ << -760619632
                                                | i_110_ << 87188040 | i_111_);
                                    }
                                } else
                                    i_106_ = i_89_;
                                if (Stream.c()) {
                                    stream.a((float) i_79_);
                                    stream.a((float) (i_85_ + (this.method3986
                                            (i_79_, i_80_,
                                                    (byte) 126))));
                                    stream.a((float) i_80_);
                                    stream.a((float) i_79_);
                                    stream.a((float) i_80_);
                                    if (anIntArrayArrayArray8314 != null)
                                        stream.a((float) (is_58_ != null
                                                ? is_58_[i_78_] - 1
                                                : 0));
                                    if ((0x7 & this.anInt8294)
                                            != 0) {
                                        stream.a(f_91_);
                                        stream.a(f_90_);
                                        stream.a(f_92_);
                                    }
                                } else {
                                    stream.b((float) i_79_);
                                    stream.b
                                            ((float) (this.method3986(i_79_, i_80_,
                                                    (byte) -15)
                                                    + i_85_));
                                    stream.b((float) i_80_);
                                    stream.b((float) i_79_);
                                    stream.b((float) i_80_);
                                    if (anIntArrayArrayArray8314 != null)
                                        stream.b((float) (is_58_ == null ? 0
                                                : -1 + (is_58_
                                                [i_78_])));
                                    if ((this.anInt8294 & 0x7)
                                            != 0) {
                                        stream.b(f_91_);
                                        stream.b(f_90_);
                                        stream.b(f_92_);
                                    }
                                }
                                if (((this.aHa_Sub3_8322
                                        .anInt8178)
                                        ^ 0xffffffff)
                                        == -1)
                                    stream_46_.b(~0xffffff | i_106_);
                                else
                                    stream_46_.c(i_106_ | ~0xffffff);
                                i_105_ = anInt8303++;
                                is_77_[i_78_] = (short) i_105_;
                                if (i_83_ != -1)
                                    class348_sub3s_47_[i_105_]
                                            = class348_sub3s_52_[i_78_];
                                class356.method3483
                                        ((byte) 108, l,
                                                new Class348_Sub29(is_77_[i_78_]));
                            } else {
                                is_77_[i_78_]
                                        = ((Class348_Sub29) class348).aShort6911;
                                i_105_ = 0xffff & is_77_[i_78_];
                                if (i_83_ != -1
                                        && ((class348_sub3s_52_[i_78_].aLong4291
                                        ^ 0xffffffffffffffffL)
                                        > (class348_sub3s_47_
                                        [i_105_].aLong4291
                                        ^ 0xffffffffffffffffL)))
                                    class348_sub3s_47_[i_105_]
                                            = class348_sub3s_52_[i_78_];
                            }
                            for (int i_112_ = 0;
                                 (i_112_ ^ 0xffffffff) > (i_74_ ^ 0xffffffff);
                                 i_112_++)
                                class348_sub3s_49_[i_112_].method2741(i_105_,
                                        f_103_,
                                        1624,
                                        i_88_,
                                        i_89_);
                            anInt8301++;
                        }
                    }
                }
            }
            for (int i_113_ = 0;
                 (anInt8303 ^ 0xffffffff) < (i_113_ ^ 0xffffffff); i_113_++) {
                Class348_Sub3 class348_sub3 = class348_sub3s_47_[i_113_];
                if (class348_sub3 != null)
                    class348_sub3.method2744((byte) -125, i_113_);
            }
            for (int i_114_ = 0;
                 (i_114_ ^ 0xffffffff) > (this.anInt4587 ^ 0xffffffff);
                 i_114_++) {
                for (int i_115_ = 0; i_115_ < this.anInt4590; i_115_++) {
                    short[] is_116_
                            = (this.aShortArrayArray8299
                            [i_115_ * this.anInt4587 - -i_114_]);
                    if (is_116_ != null) {
                        int i_117_ = 0;
                        int i_118_ = 0;
                        while (is_116_.length > i_118_) {
                            int i_119_ = is_116_[i_118_++] & 0xffff;
                            int i_120_ = 0xffff & is_116_[i_118_++];
                            int i_121_ = 0xffff & is_116_[i_118_++];
                            Class348_Sub3 class348_sub3
                                    = class348_sub3s_47_[i_119_];
                            Class348_Sub3 class348_sub3_122_
                                    = class348_sub3s_47_[i_120_];
                            Class348_Sub3 class348_sub3_123_
                                    = class348_sub3s_47_[i_121_];
                            Class348_Sub3 class348_sub3_124_ = null;
                            if (class348_sub3 != null) {
                                class348_sub3_124_ = class348_sub3;
                                class348_sub3.method2742(i_117_, i_115_,
                                        i_114_, (byte) -80);
                            }
                            if (class348_sub3_122_ != null) {
                                class348_sub3_122_.method2742(i_117_, i_115_,
                                        i_114_,
                                        (byte) -69);
                                if (class348_sub3_124_ == null
                                        || ((class348_sub3_124_
                                        .aLong4291)
                                        > (class348_sub3_122_
                                        .aLong4291)))
                                    class348_sub3_124_ = class348_sub3_122_;
                            }
                            if (class348_sub3_123_ != null) {
                                class348_sub3_123_.method2742(i_117_, i_115_,
                                        i_114_,
                                        (byte) -79);
                                if (class348_sub3_124_ == null
                                        || ((class348_sub3_124_
                                        .aLong4291)
                                        > (class348_sub3_123_
                                        .aLong4291)))
                                    class348_sub3_124_ = class348_sub3_123_;
                            }
                            if (class348_sub3_124_ != null) {
                                if (class348_sub3 != null)
                                    class348_sub3_124_.method2744((byte) -113,
                                            i_119_);
                                if (class348_sub3_122_ != null)
                                    class348_sub3_124_.method2744((byte) -111,
                                            i_120_);
                                if (class348_sub3_123_ != null)
                                    class348_sub3_124_.method2744((byte) -116,
                                            i_121_);
                                class348_sub3_124_.method2742(i_117_, i_115_,
                                        i_114_,
                                        (byte) -107);
                            }
                            i_117_++;
                        }
                    }
                }
            }
            stream.a();
            stream_46_.a();
            anInterface5_Impl1_8326
                    = this.aHa_Sub3_8322.method3889(false, 16711680);
            anInterface5_Impl1_8326.method17(nativeheapbuffer, 4,
                    anInt8303 * 4, (byte) -126);
            anInterface5_Impl1_8327
                    = this.aHa_Sub3_8322.method3889(false, 16711680);
            anInterface5_Impl1_8327.method17(nativeheapbuffer_45_, i,
                    i * anInt8303, (byte) -59);
            if ((0x7 & this.anInt8294 ^ 0xffffffff) == -1) {
                if (anIntArrayArrayArray8314 == null)
                    this.aClass130_8324
                            = (this.aHa_Sub3_8322.method3812
                            (0, (new Class58[]
                                    {new Class58(new Class325[]
                                            {Class325.aClass325_4073,
                                                    Class325.aClass325_4078}),
                                            new Class58(Class325.aClass325_4076)})));
                else
                    this.aClass130_8324
                            = (this.aHa_Sub3_8322.method3812
                            (0, (new Class58[]
                                    {new Class58(new Class325[]
                                            {Class325.aClass325_4073,
                                                    Class325.aClass325_4078,
                                                    Class325.aClass325_4077}),
                                            new Class58(Class325.aClass325_4076)})));
            } else if (anIntArrayArrayArray8314 != null)
                this.aClass130_8324
                        = (this.aHa_Sub3_8322.method3812
                        (0, (new Class58[]
                                {new Class58(new Class325[]
                                        {Class325.aClass325_4073,
                                                Class325.aClass325_4078,
                                                Class325.aClass325_4077,
                                                Class325.aClass325_4075}),
                                        new Class58(Class325.aClass325_4076)})));
            else
                this.aClass130_8324
                        = (this.aHa_Sub3_8322.method3812
                        (0, (new Class58[]
                                {new Class58(new Class325[]
                                        {Class325.aClass325_4073,
                                                Class325.aClass325_4078,
                                                Class325.aClass325_4075}),
                                        new Class58(Class325.aClass325_4076)})));
            int i_125_ = 0;
            for (int i_126_ = 0; i_126_ < class348_sub3s.length; i_126_++) {
                if ((class348_sub3s[i_126_].anInt6589
                        ^ 0xffffffff)
                        < -1)
                    class348_sub3s[i_125_++] = class348_sub3s[i_126_];
            }
            aClass348_Sub3Array8328 = new Class348_Sub3[i_125_];
            long[] ls = new long[i_125_];
            for (int i_127_ = 0; (i_127_ ^ 0xffffffff) > (i_125_ ^ 0xffffffff);
                 i_127_++) {
                Class348_Sub3 class348_sub3 = class348_sub3s[i_127_];
                ls[i_127_] = class348_sub3.aLong4291;
                aClass348_Sub3Array8328[i_127_] = class348_sub3;
                class348_sub3.method2740(-84, anInt8303);
            }
            Class339.method2669(aClass348_Sub3Array8328, ls, -101);
            if (aClass330_8307 != null)
                aClass330_8307.method2632(128);
        }
        anInt8298++;
        anIntArrayArrayArray8308 = null;
        aClass356_8325 = null;
        anIntArrayArrayArray8291 = null;
        aClass348_Sub3ArrayArrayArray8312 = null;
        aFloatArrayArray8333 = aFloatArrayArray8332 = aFloatArrayArray8323
                = null;
        this.anIntArrayArrayArray8296 = null;
        aByteArrayArray8330 = null;
        anIntArrayArrayArray8314 = null;
        this.anIntArrayArrayArray8321
                = this.anIntArrayArrayArray8313 = null;
    }

    final boolean method3989(r var_r, int i, int i_128_, int i_129_,
                             int i_130_, boolean bool) {
        anInt8316++;
        if (aClass330_8307 == null || var_r == null)
            return false;
        int i_131_
                = (-(this.aHa_Sub3_8322.anInt8133 * i_128_
                >> 798650088) + i
                >> this.aHa_Sub3_8322.anInt8107);
        int i_132_
                = (i_129_ + -((this.aHa_Sub3_8322.anInt8114
                * i_128_)
                >> 10128456)
                >> this.aHa_Sub3_8322.anInt8107);
        return aClass330_8307.method2628(i_131_, (byte) 69, var_r, i_132_);
    }

    final void ka(int i, int i_133_, int i_134_) {
        if ((i_134_ ^ 0xffffffff)
                < (aByteArrayArray8330[i][i_133_] & 0xff ^ 0xffffffff))
            aByteArrayArray8330[i][i_133_] = (byte) i_134_;
        anInt8309++;
    }

    final void method3984(int i, int i_135_, int i_136_, boolean[][] bools,
                          boolean bool, int i_137_, int i_138_) {
        method4007(i, i_135_, i_137_, bool, bools, -1, i_138_, i_136_);
        anInt8318++;
    }

    s_Sub3(ha_Sub3 var_ha_Sub3, int i, int i_139_, int i_140_, int i_141_,
           int[][] is, int[][] is_142_, int i_143_) {
        super(i_140_, i_141_, i_143_, is);
        aClass262_8286 = new Class262();
        do {
            try {
                anInt8302 = this.anInt4588 - 2;
                this.aHa_Sub3_8322 = var_ha_Sub3;
                anIntArrayArrayArray8308 = new int[i_140_][i_141_][];
                anIntArrayArrayArray8291 = new int[i_140_][i_141_][];
                this.anIntArrayArrayArray8296
                        = new int[i_140_][i_141_][];
                aFloatArrayArray8333 = (new float[this.anInt4587 - -1]
                        [this.anInt4590 - -1]);
                aClass348_Sub3ArrayArrayArray8312
                        = new Class348_Sub3[i_140_][i_141_][];
                aByteArrayArray8317 = new byte[i_140_][i_141_];
                anInt8311 = 1 << anInt8302;
                this.aShortArrayArray8299
                        = new short[i_140_ * i_141_][];
                aByteArrayArray8330 = new byte[1 + i_140_][1 + i_141_];
                this.anIntArrayArrayArray8313
                        = new int[i_140_][i_141_][];
                aFloatArrayArray8332 = (new float[this.anInt4587 + 1]
                        [this.anInt4590 + 1]);
                this.anIntArrayArrayArray8321
                        = new int[i_140_][i_141_][];
                this.anInt8294 = i_139_;
                aFloatArrayArray8323 = (new float[1 + this.anInt4587]
                        [1 + this.anInt4590]);
                for (int i_144_ = 0;
                     ((i_144_ ^ 0xffffffff)
                             >= (this.anInt4590 ^ 0xffffffff));
                     i_144_++) {
                    for (int i_145_ = 0; this.anInt4587 >= i_145_;
                         i_145_++) {
                        int i_146_
                                = this.anIntArrayArray4584[i_145_][i_144_];
                        if ((float) i_146_ > aFloat8305)
                            aFloat8305 = (float) i_146_;
                        if ((float) i_146_ < aFloat8306)
                            aFloat8306 = (float) i_146_;
                        if (i_145_ > 0 && i_144_ > 0
                                && ((this.anInt4587 ^ 0xffffffff)
                                < (i_145_ ^ 0xffffffff))
                                && (i_144_ ^ 0xffffffff) > (this.anInt4590
                                ^ 0xffffffff)) {
                            int i_147_ = (-is_142_[-1 + i_145_][i_144_]
                                    + is_142_[1 + i_145_][i_144_]);
                            int i_148_ = (-is_142_[i_145_][-1 + i_144_]
                                    + is_142_[i_145_][1 + i_144_]);
                            float f
                                    = (float) (1.0
                                    / (Math.sqrt
                                    (4 * (i_143_ * i_143_)
                                            + (i_147_ * i_147_
                                            - -(i_148_
                                            * i_148_)))));
                            aFloatArrayArray8333[i_145_][i_144_]
                                    = (float) i_147_ * f;
                            aFloatArrayArray8332[i_145_][i_144_]
                                    = (float) (-i_143_ * 2) * f;
                            aFloatArrayArray8323[i_145_][i_144_]
                                    = f * (float) i_148_;
                        }
                    }
                }
                aFloat8306--;
                aFloat8305++;
                aClass356_8325 = new Class356(128);
                if ((this.anInt8294 & 0x10 ^ 0xffffffff) == -1)
                    break;
                aClass330_8307
                        = new Class330(this.aHa_Sub3_8322, this);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("qm.<init>("
                                + (var_ha_Sub3 != null
                                ? "{...}" : "null")
                                + ',' + i + ',' + i_139_ + ','
                                + i_140_ + ',' + i_141_ + ','
                                + (is != null ? "{...}"
                                : "null")
                                + ','
                                + (is_142_ != null ? "{...}"
                                : "null")
                                + ',' + i_143_ + ')'));
            }
            break;
        } while (false);
    }

    private final void method4007(int i, int i_149_, int i_150_, boolean bool,
                                  boolean[][] bools, int i_151_, int i_152_,
                                  int i_153_) {
        if (i_151_ == -1) {
            if (aClass348_Sub3Array8328 != null) {
                int i_154_ = i_153_ - -i_153_ + 1;
                i_154_ *= i_154_;
                if ((Class286_Sub1.anIntArray6189.length ^ 0xffffffff)
                        > (i_154_ ^ 0xffffffff))
                    Class286_Sub1.anIntArray6189 = new int[i_154_];
                int i_155_ = -i_153_ + i;
                int i_156_ = i_155_;
                if (i_155_ < 0)
                    i_155_ = 0;
                int i_157_ = i_149_ + -i_153_;
                int i_158_ = i_157_;
                if (i_157_ < 0)
                    i_157_ = 0;
                int i_159_ = i_153_ + i;
                if (this.anInt4587 - 1 < i_159_)
                    i_159_ = this.anInt4587 - 1;
                int i_160_ = i_149_ + i_153_;
                if ((this.anInt4590 - 1 ^ 0xffffffff)
                        > (i_160_ ^ 0xffffffff))
                    i_160_ = this.anInt4590 - 1;
                Class348_Sub48.anInt7133 = 0;
                for (int i_161_ = i_155_;
                     (i_159_ ^ 0xffffffff) <= (i_161_ ^ 0xffffffff);
                     i_161_++) {
                    boolean[] bools_162_ = bools[i_161_ - i_156_];
                    for (int i_163_ = i_157_;
                         (i_163_ ^ 0xffffffff) >= (i_160_ ^ 0xffffffff);
                         i_163_++) {
                        if (bools_162_[i_163_ - i_158_])
                            Class286_Sub1.anIntArray6189
                                    [Class348_Sub48.anInt7133++]
                                    = i_161_ + this.anInt4587 * i_163_;
                    }
                }
                if ((i_150_ ^ 0xffffffff) == 0)
                    this.aHa_Sub3_8322.method3825(8);
                else {
                    this.aHa_Sub3_8322.method3867((float) i_150_,
                            101);
                    this.aHa_Sub3_8322.method3857((byte) -71);
                }
                this.aHa_Sub3_8322.method3942(5);
                this.aHa_Sub3_8322.method3866(((this
                                .anInt8294) & 0x7
                                ^ 0xffffffff) != -1,
                        true);
                this.aHa_Sub3_8322.method3814(false, false, -1,
                        (byte) 101);
                this.aHa_Sub3_8322
                        .method3925(112, anInterface5_Impl1_8327, 0);
                for (int i_164_ = 0; i_164_ < aClass348_Sub3Array8328.length;
                     i_164_++)
                    aClass348_Sub3Array8328[i_164_].method2737
                            ((byte) -30, Class286_Sub1.anIntArray6189,
                                    Class348_Sub48.anInt7133);
                Class101_Sub2 class101_sub2
                        = this.aHa_Sub3_8322.method3934(-97);
                class101_sub2.method894(0, -1, 0);
                this.aHa_Sub3_8322.method3915(0);
                if (!aClass262_8286.method2002((byte) 18)) {
                    int i_165_
                            = this.aHa_Sub3_8322.anInt8144;
                    int i_166_
                            = this.aHa_Sub3_8322.anInt8091;
                    this.aHa_Sub3_8322.L
                            (0, i_166_,
                                    this.aHa_Sub3_8322.anInt8105);
                    this.aHa_Sub3_8322.method3866(false, true);
                    this.aHa_Sub3_8322.method3946(-32, false);
                    this.aHa_Sub3_8322.method3817(60, 128);
                    this.aHa_Sub3_8322.method3814(false, false, -2,
                            (byte) 100);
                    this.aHa_Sub3_8322.method3850
                            ((byte) 63, (this.aHa_Sub3_8322
                                    .anInterface18_8147));
                    this.aHa_Sub3_8322.method3874
                            (Class328_Sub3.aClass229_6519, 116,
                                    Class167.aClass229_2207);
                    this.aHa_Sub3_8322.method3849
                            ((byte) 47, 0, Class348_Sub40_Sub39.aClass70_9485);
                    this.aHa_Sub3_8322
                            .method3885(0, true, Class285_Sub2.aClass70_8503);
                    for (Class348 class348
                         = aClass262_8286.method1995(i_151_ + 5);
                         class348 != null;
                         class348 = aClass262_8286.method1990((byte) 106)) {
                        Class348_Sub38 class348_sub38
                                = (Class348_Sub38) class348;
                        class348_sub38.method3032(i_149_, i_153_, bools, false,
                                i);
                    }
                    this.aHa_Sub3_8322
                            .method3849((byte) 47, 0, Class342.aClass70_4247);
                    this.aHa_Sub3_8322
                            .method3885(0, true, Class342.aClass70_4247);
                    this.aHa_Sub3_8322.method3850((byte) 90, null);
                    this.aHa_Sub3_8322.L
                            (i_165_, i_166_,
                                    this.aHa_Sub3_8322.anInt8105);
                }
                if (aClass330_8307 != null) {
                    this.aHa_Sub3_8322
                            .method3925(-91, anInterface5_Impl1_8327, 0);
                    this.aHa_Sub3_8322
                            .method3925(-71, anInterface5_Impl1_8326, 1);
                    this.aHa_Sub3_8322
                            .method3862(0, this.aClass130_8324);
                    aClass330_8307.method2630(128, i_153_, i, bool, bools,
                            i_149_);
                }
            }
            anInt8297++;
        }
    }

    final void method3981(Class348_Sub1 class348_sub1, int[] is) {
        try {
            aClass262_8286.method1999(new Class348_Sub38((this
                            .aHa_Sub3_8322),
                            this, class348_sub1,
                            is),
                    -20180);
            anInt8287++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("qm.L("
                            + (class348_sub1 != null ? "{...}"
                            : "null")
                            + ','
                            + (is != null ? "{...}" : "null")
                            + ')'));
        }
    }

    final void U(int i, int i_167_, int[] is, int[] is_168_, int[] is_169_,
                 int[] is_170_, int[] is_171_, int[] is_172_, int[] is_173_,
                 int[] is_174_, int i_175_, int i_176_, int i_177_,
                 boolean bool) {
        try {
            anInt8295++;
            d var_d = this.aHa_Sub3_8322.aD4579;
            if (is_170_ != null && anIntArrayArrayArray8314 == null)
                anIntArrayArrayArray8314
                        = new int[this.anInt4587][this.anInt4590][];
            if (is_168_ != null && anIntArrayArrayArray8308 == null)
                anIntArrayArrayArray8308
                        = new int[this.anInt4587][this.anInt4590][];
            this.anIntArrayArrayArray8321[i][i_167_] = is;
            this.anIntArrayArrayArray8313[i][i_167_] = is_169_;
            this.anIntArrayArrayArray8296[i][i_167_] = is_171_;
            anIntArrayArrayArray8291[i][i_167_] = is_172_;
            if (anIntArrayArrayArray8314 != null)
                anIntArrayArrayArray8314[i][i_167_] = is_170_;
            if (anIntArrayArrayArray8308 != null)
                anIntArrayArrayArray8308[i][i_167_] = is_168_;
            Class348_Sub3[] class348_sub3s
                    = (aClass348_Sub3ArrayArrayArray8312[i][i_167_]
                    = new Class348_Sub3[is_171_.length]);
            for (int i_178_ = 0;
                 (is_171_.length ^ 0xffffffff) < (i_178_ ^ 0xffffffff);
                 i_178_++) {
                int i_179_ = is_173_[i_178_];
                int i_180_ = is_174_[i_178_];
                if ((this.anInt8294 & 0x20) != 0
                        && (i_179_ ^ 0xffffffff) != 0
                        && var_d.method3(i_179_, -6662).aBoolean209) {
                    i_180_ = 128;
                    i_179_ = -1;
                }
                long l = (long) i_179_ | ((long) (i_180_ << 1189038766)
                        | ((long) i_176_ << -2011064086
                        | (long) i_177_ << -868607312
                        | (long) i_175_ << 1882483100));
                Class348 class348;
                for (class348 = aClass356_8325.method3480(l, -6008);
                     class348 != null;
                     class348 = aClass356_8325.method3476(true)) {
                    Class348_Sub3 class348_sub3 = (Class348_Sub3) class348;
                    if (i_179_ == class348_sub3.anInt6567
                            && (class348_sub3.aFloat6582
                            == (float) i_180_)
                            && (class348_sub3.anInt6571
                            ^ 0xffffffff) == (i_175_ ^ 0xffffffff)
                            && class348_sub3.anInt6575 == i_176_
                            && class348_sub3.anInt6569 == i_177_)
                        break;
                }
                if (class348 != null)
                    class348_sub3s[i_178_] = (Class348_Sub3) class348;
                else {
                    class348_sub3s[i_178_]
                            = new Class348_Sub3(this, i_179_, i_180_, i_175_,
                            i_176_, i_177_);
                    aClass356_8325.method3483((byte) 27, l,
                            class348_sub3s[i_178_]);
                }
            }
            if (bool)
                aByteArrayArray8317[i][i_167_]
                        = (byte) Class273.method2057((aByteArrayArray8317[i]
                                [i_167_]),
                        1);
            if ((anInt8331 ^ 0xffffffff) > (is_171_.length ^ 0xffffffff))
                anInt8331 = is_171_.length;
            anInt8329 += is_171_.length;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("qm.U(" + i + ',' + i_167_ + ','
                                    + (is != null ? "{...}" : "null") + ','
                                    + (is_168_ != null ? "{...}" : "null") + ','
                                    + (is_169_ != null ? "{...}" : "null") + ','
                                    + (is_170_ != null ? "{...}" : "null") + ','
                                    + (is_171_ != null ? "{...}" : "null") + ','
                                    + (is_172_ != null ? "{...}" : "null") + ','
                                    + (is_173_ != null ? "{...}" : "null") + ','
                                    + (is_174_ != null ? "{...}" : "null") + ',' + i_175_
                                    + ',' + i_176_ + ',' + i_177_ + ',' + bool + ')'));
        }
    }

    final void method3983(int i, int i_181_, int i_182_, boolean[][] bools,
                          boolean bool, int i_183_) {
        method4007(i, i_181_, -1, bool, bools, -1, i_183_, i_182_);
        anInt8288++;
    }

    final void method3978(int i, int i_184_, int[] is, int[] is_185_,
                          int[] is_186_, int[] is_187_, int[] is_188_,
                          int[] is_189_, int[] is_190_, int[] is_191_,
                          int[] is_192_, int[] is_193_, int[] is_194_,
                          int i_195_, int i_196_, int i_197_, boolean bool) {
        try {
            anInt8300++;
            int i_198_ = is_191_.length;
            int[] is_199_ = new int[i_198_ * 3];
            int[] is_200_ = new int[i_198_ * 3];
            int[] is_201_ = new int[i_198_ * 3];
            int[] is_202_ = new int[3 * i_198_];
            int[] is_203_ = new int[3 * i_198_];
            int[] is_204_ = new int[3 * i_198_];
            int[] is_205_ = is_185_ == null ? null : new int[i_198_ * 3];
            int[] is_206_ = is_187_ == null ? null : new int[3 * i_198_];
            int i_207_ = 0;
            for (int i_208_ = 0; i_208_ < i_198_; i_208_++) {
                int i_209_ = is_188_[i_208_];
                int i_210_ = is_189_[i_208_];
                int i_211_ = is_190_[i_208_];
                is_199_[i_207_] = is[i_209_];
                is_200_[i_207_] = is_186_[i_209_];
                is_201_[i_207_] = is_191_[i_208_];
                is_203_[i_207_] = is_193_[i_208_];
                is_204_[i_207_] = is_194_[i_208_];
                is_202_[i_207_]
                        = is_192_ == null ? is_191_[i_208_] : is_192_[i_208_];
                if (is_185_ != null)
                    is_205_[i_207_] = is_185_[i_209_];
                if (is_187_ != null)
                    is_206_[i_207_] = is_187_[i_209_];
                i_207_++;
                is_199_[i_207_] = is[i_210_];
                is_200_[i_207_] = is_186_[i_210_];
                is_201_[i_207_] = is_191_[i_208_];
                is_203_[i_207_] = is_193_[i_208_];
                is_204_[i_207_] = is_194_[i_208_];
                is_202_[i_207_]
                        = is_192_ == null ? is_191_[i_208_] : is_192_[i_208_];
                if (is_185_ != null)
                    is_205_[i_207_] = is_185_[i_210_];
                if (is_187_ != null)
                    is_206_[i_207_] = is_187_[i_210_];
                i_207_++;
                is_199_[i_207_] = is[i_211_];
                is_200_[i_207_] = is_186_[i_211_];
                is_201_[i_207_] = is_191_[i_208_];
                is_203_[i_207_] = is_193_[i_208_];
                is_204_[i_207_] = is_194_[i_208_];
                is_202_[i_207_]
                        = is_192_ == null ? is_191_[i_208_] : is_192_[i_208_];
                if (is_185_ != null)
                    is_205_[i_207_] = is_185_[i_211_];
                if (is_187_ != null)
                    is_206_[i_207_] = is_187_[i_211_];
                i_207_++;
            }
            U(i, i_184_, is_199_, is_205_, is_200_, is_206_, is_201_, is_202_,
                    is_203_, is_204_, i_195_, i_196_, i_197_, bool);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("qm.E(" + i + ',' + i_184_ + ','
                                    + (is != null ? "{...}" : "null") + ','
                                    + (is_185_ != null ? "{...}" : "null") + ','
                                    + (is_186_ != null ? "{...}" : "null") + ','
                                    + (is_187_ != null ? "{...}" : "null") + ','
                                    + (is_188_ != null ? "{...}" : "null") + ','
                                    + (is_189_ != null ? "{...}" : "null") + ','
                                    + (is_190_ != null ? "{...}" : "null") + ','
                                    + (is_191_ != null ? "{...}" : "null") + ','
                                    + (is_192_ != null ? "{...}" : "null") + ','
                                    + (is_193_ != null ? "{...}" : "null") + ','
                                    + (is_194_ != null ? "{...}" : "null") + ',' + i_195_
                                    + ',' + i_196_ + ',' + i_197_ + ',' + bool + ')'));
        }
    }

    final void method3987(int i, int i_212_, int i_213_, int i_214_,
                          int i_215_, int i_216_, int i_217_,
                          boolean[][] bools) {
        anInt8304++;
        if (anInt8329 > 0) {
            Interface5_Impl2 interface5_impl2
                    = this.aHa_Sub3_8322.method3822(28, anInt8301);
            int i_218_ = 0;
            int i_219_ = 32767;
            int i_220_ = -32768;
            for (int i_221_ = 0; i_221_ < 4; i_221_++) {
                i_218_ = 0;
                Buffer buffer = interface5_impl2.method24(true, false);
                if (buffer != null) {
                    Stream stream
                            = this.aHa_Sub3_8322.method3893(buffer,
                            9179);
                    if (!Stream.c()) {
                        for (int i_222_ = i_215_; i_217_ > i_222_; i_222_++) {
                            int i_223_
                                    = i_214_ + i_222_ * this.anInt4587;
                            for (int i_224_ = i_214_; i_224_ < i_216_;
                                 i_224_++) {
                                if (bools[i_224_ - i_214_][-i_215_ + i_222_]) {
                                    short[] is
                                            = (this.aShortArrayArray8299
                                            [i_223_]);
                                    if (is != null) {
                                        for (int i_225_ = 0;
                                             ((is.length ^ 0xffffffff)
                                                     < (i_225_ ^ 0xffffffff));
                                             i_225_++) {
                                            int i_226_ = 0xffff & is[i_225_];
                                            stream.a(i_226_);
                                            if (i_220_ < i_226_)
                                                i_220_ = i_226_;
                                            i_218_++;
                                            if ((i_226_ ^ 0xffffffff)
                                                    > (i_219_ ^ 0xffffffff))
                                                i_219_ = i_226_;
                                        }
                                    }
                                }
                                i_223_++;
                            }
                        }
                    } else {
                        for (int i_227_ = i_215_;
                             (i_227_ ^ 0xffffffff) > (i_217_ ^ 0xffffffff);
                             i_227_++) {
                            int i_228_
                                    = i_227_ * this.anInt4587 - -i_214_;
                            for (int i_229_ = i_214_; i_229_ < i_216_;
                                 i_229_++) {
                                if (bools[i_229_ + -i_214_][i_227_ - i_215_]) {
                                    short[] is
                                            = (this.aShortArrayArray8299
                                            [i_228_]);
                                    if (is != null) {
                                        for (int i_230_ = 0;
                                             is.length > i_230_; i_230_++) {
                                            int i_231_ = is[i_230_] & 0xffff;
                                            stream.d(i_231_);
                                            if (i_231_ > i_220_)
                                                i_220_ = i_231_;
                                            i_218_++;
                                            if (i_231_ < i_219_)
                                                i_219_ = i_231_;
                                        }
                                    }
                                }
                                i_228_++;
                            }
                        }
                    }
                    stream.a();
                    if (interface5_impl2.method22(-23))
                        break;
                }
            }
            if (i_218_ > 0) {
                this.aHa_Sub3_8322.method3932((byte) -127);
                this.aHa_Sub3_8322.method3838(true, false);
                this.aHa_Sub3_8322.method3866(false, true);
                this.aHa_Sub3_8322.method3890(false, (byte) 113);
                this.aHa_Sub3_8322.method3946(-32, false);
                this.aHa_Sub3_8322.method3817(61, 0);
                this.aHa_Sub3_8322.method3814(false, false, -2,
                        (byte) 98);
                this.aHa_Sub3_8322.method3850((byte) -22, null);
                Class101_Sub2 class101_sub2
                        = this.aHa_Sub3_8322.method3934(-71);
                float[] fs = this.aHa_Sub3_8322.method3837(true);
                fs[6] = 0.0F;
                fs[13] = -(((float) (2 * i_212_)
                        + (float) (i_213_ * i_217_) / 128.0F)
                        / (float) (this.aHa_Sub3_8322
                        .anInt7962)) + 1.0F;
                fs[11] = 0.0F;
                fs[0] = ((float) i_213_
                        / ((float) (this.aHa_Sub3_8322
                        .anInt7931)
                        * ((float) this.anInt4592 * 128.0F)));
                fs[14] = -aFloat8306 / (aFloat8305 - aFloat8306);
                fs[2] = 0.0F;
                fs[15] = 1.0F;
                fs[5]
                        = ((float) i_213_
                        / ((float) this.anInt4592 * 128.0F
                        * (float) (this.aHa_Sub3_8322
                        .anInt7962)));
                fs[4] = 0.0F;
                fs[3] = 0.0F;
                fs[8] = 0.0F;
                fs[7] = 0.0F;
                fs[10] = 1.0F / (aFloat8305 - aFloat8306);
                fs[9] = 0.0F;
                fs[12] = -1.0F - (((float) (i_213_ * i_214_) / 128.0F
                        - (float) (2 * i))
                        / (float) (this.aHa_Sub3_8322
                        .anInt7931));
                fs[1] = 0.0F;
                class101_sub2.method935(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
                        0.0F, 1.0F, 1.0F, 0);
                this.aHa_Sub3_8322.method3821(-4845);
                this.aHa_Sub3_8322.method3915(0);
                if ((0x7 & this.anInt8294) != 0) {
                    this.aHa_Sub3_8322.method3866(true, true);
                    this.aHa_Sub3_8322.method3892(0);
                } else
                    this.aHa_Sub3_8322.method3866(false, true);
                this.aHa_Sub3_8322.method3926((byte) 59, false);
                this.aHa_Sub3_8322
                        .method3925(63, anInterface5_Impl1_8327, 0);
                this.aHa_Sub3_8322
                        .method3925(-90, anInterface5_Impl1_8326, 1);
                this.aHa_Sub3_8322
                        .method3862(0, this.aClass130_8324);
                this.aHa_Sub3_8322.method3938
                        (Class247.aClass21_3181, i_218_ / 3, interface5_impl2,
                                i_219_, 0, -i_219_ + i_220_ - -1, 114);
                this.aHa_Sub3_8322.method3926((byte) 82, true);
            }
        }
    }

    static final int method4008(byte i) {
        anInt8289++;
        if (i >= -121)
            aClass21_8320 = null;
        if ((Class348_Sub49.anInt7207 ^ 0xffffffff) == -2)
            return Class339.anInt4211;
        return 0;
    }
}
