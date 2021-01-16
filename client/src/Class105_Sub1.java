/* Class105_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class105_Sub1 extends Class105 {
    static int anInt8390;
    private final boolean aBoolean8391;
    static int anInt8392;
    static int anInt8393;
    static int anInt8394;
    static int anInt8395;
    private final boolean aBoolean8396;
    private int anInt8397 = 0;
    static int anInt8398 = 0;
    static int anInt8399;
    private int anInt8400;
    static int anInt8401;
    static int anInt8402;
    private final Interface18_Impl3 anInterface18_Impl3_8403;
    static int anInt8404;
    static int anInt8405;
    static int anInt8406;
    private final ha_Sub3 aHa_Sub3_8407;
    private final boolean aBoolean8408;
    static int anInt8409;
    private final boolean aBoolean8410;
    private final int anInt8411;
    static int anInt8412;
    static int anInt8413;
    static int anInt8414;
    static int anInt8415;
    private int anInt8416 = 0;
    private final int anInt8417;
    private boolean aBoolean8418;
    private int anInt8419 = 0;
    static int anInt8420;
    static int anInt8421;
    static int anInt8422;
    static int anInt8423;

    final int method980() {
        anInt8402++;
        return anInt8417 + (anInt8419 + anInt8397);
    }

    final void method985(int i, int i_0_, int i_1_, int i_2_) {
        anInt8413++;
        anInt8419 = i_0_;
        anInt8397 = i_2_;
        anInt8400 = i;
        anInt8416 = i_1_;
        aBoolean8418 = (anInt8400 != 0 || (anInt8419 ^ 0xffffffff) != -1
                || (anInt8416 ^ 0xffffffff) != -1
                || (anInt8397 ^ 0xffffffff) != -1);
    }

    private final void method986(int i, int i_3_, int i_4_, int i_5_, int[] is,
                                 int i_6_, int i_7_) {
        anInt8394++;
        anInterface18_Impl3_8403.method68(i_7_, 22809, is, i, i_6_, i_4_, i_3_,
                i_5_);
    }

    static final Class369_Sub2 method987(int i,
                                         Class348_Sub49 class348_sub49) {
        anInt8405++;
        Class369 class369
                = Class348_Sub16_Sub2.method2834((byte) -118, class348_sub49);
        if (i != 743571200)
            method989(-21, 36, 81);
        int i_8_ = class348_sub49.method3385((byte) -126);
        int i_9_ = class348_sub49.method3385((byte) -126);
        return new Class369_Sub2(class369.aClass221_4968,
                class369.aClass341_4973,
                class369.anInt4970,
                class369.anInt4959,
                class369.anInt4971,
                class369.anInt4963,
                class369.anInt4966,
                class369.anInt4965,
                class369.anInt4961, i_8_, i_9_);
    }

    final int method966() {
        anInt8399++;
        return anInt8416 + anInt8400 + anInt8411;
    }

    final int method969() {
        anInt8404++;
        return anInt8417;
    }

    static final Class361 method988(int i, int i_10_, int i_11_) {
        anInt8415++;
        Class361 class361 = new Class361();
        class361.anInt4437 = 6 + i_11_;
        class361.anInt4453 = -1;
        class361.anInt4443 = 5 + (i - -1);
        if (i_10_ != 1)
            return null;
        class361.anInt4441 = -1;
        class361.anIntArrayArray4438
                = (new int[class361.anInt4437]
                [class361.anInt4443]);
        class361.method3500(700);
        return class361;
    }

    final void method962(float f, float f_12_, float f_13_, float f_14_,
                         float f_15_, float f_16_, int i, int i_17_, int i_18_,
                         int i_19_) {
        anInt8393++;
        Class101_Sub2 class101_sub2 = aHa_Sub3_8407.method3934(-114);
        Class101_Sub2 class101_sub2_20_ = aHa_Sub3_8407.method3820(false);
        anInterface18_Impl3_8403.method64(((aBoolean8410 || aBoolean8408
                        || ((0x1 & i_19_ ^ 0xffffffff)
                        == -1))
                        ? Class206.aClass209_4874
                        : Class71.aClass209_1212),
                -22095);
        aHa_Sub3_8407.method3864(-5);
        aHa_Sub3_8407.method3850((byte) 78, anInterface18_Impl3_8403);
        aHa_Sub3_8407.method3817(81, i_18_);
        aHa_Sub3_8407.method3923(true, i);
        aHa_Sub3_8407.method3849((byte) 47, 1,
                Class348_Sub40_Sub39.aClass70_9485);
        aHa_Sub3_8407.method3885(1, true, Class348_Sub40_Sub39.aClass70_9485);
        aHa_Sub3_8407.method3894(-28186, i_17_);
        if (aBoolean8418) {
            float f_21_ = (float) method966();
            float f_22_ = (float) method980();
            float f_23_ = (-f + f_13_) / f_21_;
            float f_24_ = (-f_12_ + f_14_) / f_21_;
            float f_25_ = (f_15_ - f) / f_22_;
            float f_26_ = (f_16_ - f_12_) / f_22_;
            float f_27_ = (float) anInt8419 * f_25_;
            float f_28_ = (float) anInt8419 * f_26_;
            float f_29_ = f_23_ * (float) anInt8400;
            float f_30_ = f_24_ * (float) anInt8400;
            float f_31_ = -f_23_ * (float) anInt8416;
            float f_32_ = -f_24_ * (float) anInt8416;
            float f_33_ = -f_25_ * (float) anInt8397;
            float f_34_ = (float) anInt8397 * -f_26_;
            f = f_27_ + (f + f_29_);
            f_15_ = f_29_ + f_15_ + f_33_;
            f_14_ = f_14_ + f_32_ + f_28_;
            f_13_ = f_27_ + (f_13_ + f_31_);
            f_12_ = f_28_ + (f_12_ + f_30_);
            f_16_ = f_16_ + f_30_ + f_34_;
        }
        class101_sub2.method935(1.0F, f_14_ - f_12_, -f + f_15_, 0.0F, 0.0F,
                -f_12_ + f_16_, 0.0F, 0.0F, f_13_ - f, 0);
        class101_sub2.method920(f_12_, false, 0.0F, f);
        class101_sub2_20_.method932
                (1.0F,
                        anInterface18_Impl3_8403.method71((byte) -47, (float) anInt8417),
                        anInterface18_Impl3_8403.method67((float) anInt8411, 123),
                        (byte) -66);
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
        aHa_Sub3_8407.method3915(0);
        aHa_Sub3_8407.method3933(-44);
        aHa_Sub3_8407.method3879(-8629);
        aHa_Sub3_8407.method3849((byte) 47, 1,
                Class318_Sub1_Sub2.aClass70_8737);
        aHa_Sub3_8407.method3885(1, true, Class318_Sub1_Sub2.aClass70_8737);
    }

    final void method965(int i, int i_35_, int i_36_, int i_37_, int i_38_,
                         int i_39_, int i_40_) {
        anInt8423++;
        Class101_Sub2 class101_sub2 = aHa_Sub3_8407.method3934(-80);
        Class101_Sub2 class101_sub2_41_ = aHa_Sub3_8407.method3820(false);
        anInterface18_Impl3_8403.method64(Class206.aClass209_4874, -22095);
        aHa_Sub3_8407.method3864(-20);
        aHa_Sub3_8407.method3850((byte) -46, anInterface18_Impl3_8403);
        aHa_Sub3_8407.method3817(98, i_40_);
        aHa_Sub3_8407.method3923(true, i_38_);
        aHa_Sub3_8407.method3849((byte) 47, 1,
                Class348_Sub40_Sub39.aClass70_9485);
        aHa_Sub3_8407.method3885(1, true, Class348_Sub40_Sub39.aClass70_9485);
        aHa_Sub3_8407.method3894(-28186, i_39_);
        boolean bool
                = aBoolean8391 && anInt8419 == 0 && (anInt8397 ^ 0xffffffff) == -1;
        boolean bool_42_ = (aBoolean8396 && (anInt8400 ^ 0xffffffff) == -1
                && (anInt8416 ^ 0xffffffff) == -1);
        if (!(bool_42_ & bool)) {
            if (bool_42_) {
                int i_43_ = i_37_ + i_35_;
                int i_44_ = method980();
                class101_sub2_41_.method932
                        (1.0F,
                                anInterface18_Impl3_8403.method71((byte) -99,
                                        (float) anInt8417),
                                anInterface18_Impl3_8403.method67((float) i_36_, 110),
                                (byte) -120);
                aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
                int i_45_ = anInt8419 + i_35_;
                int i_46_ = i_45_ - -anInt8417;
                while (i_46_ <= i_43_) {
                    class101_sub2.method932(0.0F, (float) anInt8417,
                            (float) i_36_, (byte) -32);
                    class101_sub2.method891(i, i_45_, 0);
                    aHa_Sub3_8407.method3915(0);
                    i_46_ += i_44_;
                    i_45_ += i_44_;
                    aHa_Sub3_8407.method3933(-57);
                }
                if ((i_45_ ^ 0xffffffff) > (i_43_ ^ 0xffffffff)) {
                    int i_47_ = i_43_ - i_45_;
                    class101_sub2_41_.method932
                            (1.0F,
                                    anInterface18_Impl3_8403.method71((byte) -81,
                                            (float) i_47_),
                                    anInterface18_Impl3_8403.method67((float) i_36_, 127),
                                    (byte) -16);
                    aHa_Sub3_8407.method3853(-32,
                            Class239_Sub18.aClass251_6030);
                    class101_sub2.method932(0.0F, (float) i_47_, (float) i_36_,
                            (byte) -101);
                    class101_sub2.method891(i, i_45_, 0);
                    aHa_Sub3_8407.method3915(0);
                    aHa_Sub3_8407.method3933(-91);
                }
            } else if (!bool) {
                int i_48_ = i_37_ + i_35_;
                int i_49_ = i + i_36_;
                int i_50_ = method966();
                int i_51_ = method980();
                int i_52_ = anInt8419 + i_35_;
                int i_53_ = i_52_ + anInt8417;
                while (i_48_ >= i_53_) {
                    class101_sub2_41_.method932
                            (1.0F,
                                    anInterface18_Impl3_8403.method71((byte) -89,
                                            (float) anInt8417),
                                    anInterface18_Impl3_8403.method67((float) anInt8411,
                                            88),
                                    (byte) -16);
                    aHa_Sub3_8407.method3853(-32,
                            Class239_Sub18.aClass251_6030);
                    int i_54_ = anInt8400 + i;
                    for (int i_55_ = i_54_ - -anInt8411;
                         (i_49_ ^ 0xffffffff) <= (i_55_ ^ 0xffffffff);
                         i_55_ += i_50_) {
                        class101_sub2.method932(0.0F, (float) anInt8417,
                                (float) anInt8411, (byte) -65);
                        class101_sub2.method891(i_54_, i_52_, 0);
                        aHa_Sub3_8407.method3915(0);
                        i_54_ += i_50_;
                        aHa_Sub3_8407.method3933(-113);
                    }
                    if (i_49_ > i_54_) {
                        int i_56_ = -i_54_ + i_49_;
                        class101_sub2_41_.method932
                                (1.0F,
                                        anInterface18_Impl3_8403
                                                .method71((byte) -82, (float) anInt8417),
                                        anInterface18_Impl3_8403.method67((float) i_56_,
                                                86),
                                        (byte) -35);
                        aHa_Sub3_8407
                                .method3853(-32, Class239_Sub18.aClass251_6030);
                        class101_sub2.method932(0.0F, (float) anInt8417,
                                (float) i_56_, (byte) -26);
                        class101_sub2.method891(i_54_, i_52_, 0);
                        aHa_Sub3_8407.method3915(0);
                        aHa_Sub3_8407.method3933(-79);
                    }
                    i_53_ += i_51_;
                    i_52_ += i_51_;
                }
                if ((i_48_ ^ 0xffffffff) < (i_52_ ^ 0xffffffff)) {
                    int i_57_ = i_48_ + -i_52_;
                    class101_sub2_41_.method932
                            (1.0F,
                                    anInterface18_Impl3_8403.method71((byte) -121,
                                            (float) i_57_),
                                    anInterface18_Impl3_8403.method67((float) anInt8411,
                                            102),
                                    (byte) -59);
                    aHa_Sub3_8407.method3853(-32,
                            Class239_Sub18.aClass251_6030);
                    int i_58_ = anInt8400 + i;
                    int i_59_ = anInt8411 + i_58_;
                    while (i_49_ >= i_59_) {
                        class101_sub2.method932(0.0F, (float) i_57_,
                                (float) anInt8411, (byte) -98);
                        class101_sub2.method891(i_58_, i_52_, 0);
                        aHa_Sub3_8407.method3915(0);
                        i_58_ += i_50_;
                        i_59_ += i_50_;
                        aHa_Sub3_8407.method3933(-69);
                    }
                    if ((i_58_ ^ 0xffffffff) > (i_49_ ^ 0xffffffff)) {
                        int i_60_ = i_49_ - i_58_;
                        class101_sub2_41_.method932
                                (1.0F,
                                        anInterface18_Impl3_8403.method71((byte) -102,
                                                (float) i_57_),
                                        anInterface18_Impl3_8403.method67((float) i_60_,
                                                115),
                                        (byte) -90);
                        aHa_Sub3_8407
                                .method3853(-32, Class239_Sub18.aClass251_6030);
                        class101_sub2.method932(0.0F, (float) i_57_,
                                (float) i_60_, (byte) -95);
                        class101_sub2.method891(i_58_, i_52_, 0);
                        aHa_Sub3_8407.method3915(0);
                        aHa_Sub3_8407.method3933(-54);
                    }
                }
            } else {
                int i_61_ = i - -i_36_;
                int i_62_ = method966();
                class101_sub2_41_.method932
                        (1.0F,
                                anInterface18_Impl3_8403.method71((byte) -121,
                                        (float) i_37_),
                                anInterface18_Impl3_8403.method67((float) anInt8411, 77),
                                (byte) -27);
                aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
                int i_63_ = i - -anInt8400;
                for (int i_64_ = anInt8411 + i_63_; i_64_ <= i_61_;
                     i_64_ += i_62_) {
                    class101_sub2.method932(0.0F, (float) i_37_,
                            (float) anInt8411, (byte) -69);
                    class101_sub2.method891(i_63_, i_35_, 0);
                    aHa_Sub3_8407.method3915(0);
                    i_63_ += i_62_;
                    aHa_Sub3_8407.method3933(-40);
                }
                if (i_63_ < i_61_) {
                    int i_65_ = -i_63_ + i_61_;
                    class101_sub2_41_.method932
                            (1.0F,
                                    anInterface18_Impl3_8403.method71((byte) -62,
                                            (float) i_37_),
                                    anInterface18_Impl3_8403.method67((float) i_65_, 119),
                                    (byte) -10);
                    aHa_Sub3_8407.method3853(-32,
                            Class239_Sub18.aClass251_6030);
                    class101_sub2.method932(0.0F, (float) i_37_, (float) i_65_,
                            (byte) -120);
                    class101_sub2.method891(i_63_, i_35_, 0);
                    aHa_Sub3_8407.method3915(0);
                    aHa_Sub3_8407.method3933(-57);
                }
            }
        } else {
            class101_sub2_41_.method932
                    (1.0F,
                            anInterface18_Impl3_8403.method71((byte) -26, (float) i_37_),
                            anInterface18_Impl3_8403.method67((float) i_36_, 118),
                            (byte) -75);
            class101_sub2.method932(0.0F, (float) i_37_, (float) i_36_,
                    (byte) -83);
            class101_sub2.method891(i, i_35_, 0);
            aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
            aHa_Sub3_8407.method3915(0);
            aHa_Sub3_8407.method3933(-63);
        }
        aHa_Sub3_8407.method3879(-8629);
        aHa_Sub3_8407.method3849((byte) 47, 1,
                Class318_Sub1_Sub2.aClass70_8737);
        aHa_Sub3_8407.method3885(1, true, Class318_Sub1_Sub2.aClass70_8737);
    }

    final void method983(float f, float f_66_, float f_67_, float f_68_,
                         float f_69_, float f_70_, int i, aa var_aa, int i_71_,
                         int i_72_) {
        anInt8390++;
        Class101_Sub2 class101_sub2 = aHa_Sub3_8407.method3934(-121);
        Class101_Sub2 class101_sub2_73_ = aHa_Sub3_8407.method3820(false);
        aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
        Interface18_Impl3 interface18_impl3
                = var_aa_Sub2.anInterface18_Impl3_5196;
        anInterface18_Impl3_8403.method64(((aBoolean8410 || aBoolean8408
                        || (0x1 & i) == 0)
                        ? Class206.aClass209_4874
                        : Class71.aClass209_1212),
                -22095);
        aHa_Sub3_8407.method3864(101);
        aHa_Sub3_8407.method3850((byte) -102, anInterface18_Impl3_8403);
        aHa_Sub3_8407.method3817(86, 1);
        aHa_Sub3_8407.method3923(true, 1);
        if (aBoolean8418) {
            float f_74_ = (float) anInt8411 / (float) method966();
            float f_75_ = (float) anInt8417 / (float) method980();
            class101_sub2.method935(1.0F, f_74_ * (-f_66_ + f_68_),
                    f_75_ * (-f + f_69_), 0.0F, 0.0F,
                    f_75_ * (f_70_ - f_66_), 0.0F, 0.0F,
                    (f_67_ - f) * f_74_, 0);
            class101_sub2.method920(((float) anInt8419 + f_66_) * f_75_, false,
                    0.0F, ((float) anInt8400 + f) * f_74_);
        } else {
            class101_sub2.method935(1.0F, -f_66_ + f_68_, f_69_ - f, 0.0F,
                    0.0F, -f_66_ + f_70_, 0.0F, 0.0F,
                    f_67_ - f, 0);
            class101_sub2.method920(f_66_, false, 0.0F, f);
        }
        class101_sub2_73_.method932
                (1.0F,
                        anInterface18_Impl3_8403.method71((byte) -87, (float) anInt8417),
                        anInterface18_Impl3_8403.method67((float) anInt8411, 75),
                        (byte) -60);
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
        aHa_Sub3_8407.method3897(1, -4382);
        aHa_Sub3_8407.method3850((byte) -31, interface18_impl3);
        aHa_Sub3_8407.method3874(Class167.aClass229_2207, 127,
                Class328_Sub3.aClass229_6519);
        aHa_Sub3_8407.method3849((byte) 47, 0,
                Class318_Sub1_Sub2.aClass70_8737);
        Class101_Sub2 class101_sub2_76_ = aHa_Sub3_8407.method3820(false);
        class101_sub2_76_.method898(class101_sub2);
        class101_sub2_76_.method891(-i_71_, -i_72_, 0);
        class101_sub2_76_.method914(interface18_impl3.method71((byte) -32,
                1.0F),
                1.0F, 0,
                interface18_impl3.method67(1.0F, 71));
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
        aHa_Sub3_8407.method3915(0);
        aHa_Sub3_8407.method3933(-109);
        aHa_Sub3_8407.method3879(-8629);
        aHa_Sub3_8407.method3849((byte) 47, 0, Class342.aClass70_4247);
        aHa_Sub3_8407.method3874(Class167.aClass229_2207, 118,
                Class167.aClass229_2207);
        aHa_Sub3_8407.method3850((byte) 98, null);
        aHa_Sub3_8407.method3897(0, -4382);
        aHa_Sub3_8407.method3879(-8629);
    }

    final void method968(int i, int i_77_, int i_78_) {
        anInt8406++;
        int[] is = aHa_Sub3_8407.na(i, i_77_, anInt8411, anInt8417);
        int[] is_79_ = new int[anInt8417 * anInt8411];
        anInterface18_Impl3_8403.method65(0, is_79_, anInt8411, 0, anInt8417,
                (byte) 112, 0);
        if ((i_78_ ^ 0xffffffff) == -1) {
            for (int i_80_ = 0;
                 (i_80_ ^ 0xffffffff) > (anInt8417 ^ 0xffffffff); i_80_++) {
                int i_81_ = i_80_ * anInt8411;
                for (int i_82_ = 0; i_82_ < anInt8411; i_82_++)
                    is_79_[i_81_ + i_82_]
                            = (Class273.method2057
                            ((Class139.method1166(1828651008,
                                    is[i_81_ - -i_82_])
                                            << 1430274504),
                                    Class139.method1166(is_79_[i_81_ - -i_82_],
                                            16777215)));
            }
        } else if (i_78_ == 1) {
            for (int i_83_ = 0;
                 (i_83_ ^ 0xffffffff) > (anInt8417 ^ 0xffffffff); i_83_++) {
                int i_84_ = i_83_ * anInt8411;
                for (int i_85_ = 0; anInt8411 > i_85_; i_85_++)
                    is_79_[i_85_ + i_84_]
                            = (Class273.method2057
                            (Class139.method1166(is_79_[i_85_ + i_84_],
                                    16777215),
                                    (Class139.method1166(is[i_84_ - -i_85_], 743571200)
                                            << -86836496)));
            }
        } else if ((i_78_ ^ 0xffffffff) != -3) {
            if (i_78_ == 3) {
                for (int i_86_ = 0;
                     (i_86_ ^ 0xffffffff) > (anInt8417 ^ 0xffffffff);
                     i_86_++) {
                    int i_87_ = i_86_ * anInt8411;
                    for (int i_88_ = 0; i_88_ < anInt8411; i_88_++)
                        is_79_[i_88_ + i_87_]
                                = (Class273.method2057
                                (is[i_88_ + i_87_] != 0 ? -16777216 : 0,
                                        Class139.method1166(16777215,
                                                is_79_[i_88_ + i_87_])));
                }
            }
        } else {
            for (int i_89_ = 0; anInt8417 > i_89_; i_89_++) {
                int i_90_ = i_89_ * anInt8411;
                for (int i_91_ = 0;
                     (anInt8411 ^ 0xffffffff) < (i_91_ ^ 0xffffffff); i_91_++)
                    is_79_[i_90_ + i_91_]
                            = (Class273.method2057
                            (Class139.method1166(is_79_[i_90_ + i_91_],
                                    16777215),
                                    Class139.method1166(-3725444, (is[i_91_ + i_90_]
                                            << -903347560))));
            }
        }
        method986(0, 0, anInt8411, anInt8417, is_79_, 0, anInt8411);
    }

    static final boolean method989(int i, int i_92_, int i_93_) {
        anInt8401++;
        if (Class156.method1241(i_93_, i, i_92_ ^ 0x1fe) | (0x10000 & i) != 0
                || Class348_Sub47.method3325(i, i_93_, true))
            return true;
        if (i_92_ != -385)
            return false;
		return (i_93_ & 0x37) == 0 && Class273.method2056(i, 120, i_93_);
	}

    final void method982(int i, int i_94_, int i_95_, int i_96_, int i_97_,
                         int i_98_, int i_99_, int i_100_) {
        anInt8395++;
        Class101_Sub2 class101_sub2 = aHa_Sub3_8407.method3934(-95);
        Class101_Sub2 class101_sub2_101_ = aHa_Sub3_8407.method3820(false);
        anInterface18_Impl3_8403.method64(((aBoolean8410 || aBoolean8408
                        || ((i_100_ & 0x1 ^ 0xffffffff)
                        == -1))
                        ? Class206.aClass209_4874
                        : Class71.aClass209_1212),
                -22095);
        aHa_Sub3_8407.method3864(81);
        aHa_Sub3_8407.method3850((byte) 65, anInterface18_Impl3_8403);
        aHa_Sub3_8407.method3817(58, i_99_);
        aHa_Sub3_8407.method3923(true, i_97_);
        aHa_Sub3_8407.method3849((byte) 47, 1,
                Class348_Sub40_Sub39.aClass70_9485);
        aHa_Sub3_8407.method3885(1, true, Class348_Sub40_Sub39.aClass70_9485);
        aHa_Sub3_8407.method3894(-28186, i_98_);
        class101_sub2_101_.method932
                (1.0F,
                        anInterface18_Impl3_8403.method71((byte) -44, (float) anInt8417),
                        anInterface18_Impl3_8403.method67((float) anInt8411, 101),
                        (byte) -30);
        if (aBoolean8418) {
            i_95_ = i_95_ * anInt8411 / method966();
            i_96_ = anInt8417 * i_96_ / method980();
            i += anInt8400 * i_95_ / anInt8411;
            i_94_ += anInt8419 * i_96_ / anInt8417;
        }
        class101_sub2.method932(0.0F, (float) i_96_, (float) i_95_,
                (byte) -100);
        class101_sub2.method891(i, i_94_, 0);
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
        aHa_Sub3_8407.method3915(0);
        aHa_Sub3_8407.method3933(-118);
        aHa_Sub3_8407.method3879(-8629);
        aHa_Sub3_8407.method3849((byte) 47, 1,
                Class318_Sub1_Sub2.aClass70_8737);
        aHa_Sub3_8407.method3885(1, true, Class318_Sub1_Sub2.aClass70_8737);
    }

    final void method984(int[] is) {
        is[0] = anInt8400;
        is[1] = anInt8419;
        anInt8421++;
        is[3] = anInt8397;
        is[2] = anInt8416;
    }

    final void method964(int i, int i_102_, int i_103_, int i_104_,
                         int i_105_) {
        anInt8409++;
        Class101_Sub2 class101_sub2 = aHa_Sub3_8407.method3934(-92);
        Class101_Sub2 class101_sub2_106_ = aHa_Sub3_8407.method3820(false);
        i += anInt8400;
        i_102_ += anInt8419;
        anInterface18_Impl3_8403.method64(Class206.aClass209_4874, -22095);
        aHa_Sub3_8407.method3864(-82);
        aHa_Sub3_8407.method3850((byte) -67, anInterface18_Impl3_8403);
        aHa_Sub3_8407.method3817(96, i_105_);
        aHa_Sub3_8407.method3923(true, i_103_);
        aHa_Sub3_8407.method3849((byte) 47, 1,
                Class348_Sub40_Sub39.aClass70_9485);
        aHa_Sub3_8407.method3885(1, true, Class348_Sub40_Sub39.aClass70_9485);
        aHa_Sub3_8407.method3894(-28186, i_104_);
        class101_sub2.method932(0.0F, (float) anInt8417, (float) anInt8411,
                (byte) -44);
        class101_sub2.method891(i, i_102_, 0);
        class101_sub2_106_.method932
                (1.0F,
                        anInterface18_Impl3_8403.method71((byte) -125, (float) anInt8417),
                        anInterface18_Impl3_8403.method67((float) anInt8411, 111),
                        (byte) -19);
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
        aHa_Sub3_8407.method3915(0);
        aHa_Sub3_8407.method3933(-41);
        aHa_Sub3_8407.method3879(-8629);
        aHa_Sub3_8407.method3849((byte) 47, 1,
                Class318_Sub1_Sub2.aClass70_8737);
        aHa_Sub3_8407.method3885(1, true, Class318_Sub1_Sub2.aClass70_8737);
    }

    final int method971() {
        anInt8420++;
        return anInt8411;
    }

    final void method979(int i, int i_107_, int i_108_, int i_109_, int i_110_,
                         int i_111_) {
        anInt8392++;
        int[] is = aHa_Sub3_8407.na(i_110_, i_111_, i_108_, i_109_);
        if (is != null) {
            for (int i_112_ = 0; i_112_ < is.length; i_112_++)
                is[i_112_] = Class273.method2057(is[i_112_], -16777216);
            method986(i, i_107_, i_108_, i_109_, is, 0, i_108_);
        }
    }

    final void method963(int i, int i_113_, aa var_aa, int i_114_,
                         int i_115_) {
        anInt8414++;
        aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
        i_113_ += anInt8419;
        i += anInt8400;
        Interface18_Impl3 interface18_impl3
                = var_aa_Sub2.anInterface18_Impl3_5196;
        anInterface18_Impl3_8403.method64(Class206.aClass209_4874, -22095);
        aHa_Sub3_8407.method3864(-81);
        aHa_Sub3_8407.method3850((byte) -35, anInterface18_Impl3_8403);
        aHa_Sub3_8407.method3817(110, 1);
        aHa_Sub3_8407.method3923(true, 1);
        Class101_Sub2 class101_sub2 = aHa_Sub3_8407.method3934(-120);
        class101_sub2.method932(0.0F, (float) anInt8417, (float) anInt8411,
                (byte) -55);
        class101_sub2.method891(i, i_113_, 0);
        aHa_Sub3_8407.method3915(0);
        Class101_Sub2 class101_sub2_116_ = aHa_Sub3_8407.method3820(false);
        class101_sub2_116_.method932
                (1.0F,
                        anInterface18_Impl3_8403.method71((byte) -102, (float) anInt8417),
                        anInterface18_Impl3_8403.method67((float) anInt8411, 106),
                        (byte) -33);
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
        aHa_Sub3_8407.method3897(1, -4382);
        aHa_Sub3_8407.method3850((byte) 101, interface18_impl3);
        aHa_Sub3_8407.method3874(Class167.aClass229_2207, 110,
                Class328_Sub3.aClass229_6519);
        aHa_Sub3_8407.method3849((byte) 47, 0,
                Class318_Sub1_Sub2.aClass70_8737);
        Class101_Sub2 class101_sub2_117_ = aHa_Sub3_8407.method3820(false);
        class101_sub2_117_.method932
                (1.0F, interface18_impl3.method71((byte) -108, (float) anInt8417),
                        interface18_impl3.method67((float) anInt8411, 95), (byte) -81);
        class101_sub2_117_.method920
                (interface18_impl3.method71((byte) -27,
                        (float) (i_113_ + -i_115_)),
                        false, 0.0F,
                        interface18_impl3.method67((float) (i - i_114_), 122));
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030);
        aHa_Sub3_8407.method3933(-81);
        aHa_Sub3_8407.method3879(-8629);
        aHa_Sub3_8407.method3849((byte) 47, 0, Class342.aClass70_4247);
        aHa_Sub3_8407.method3874(Class167.aClass229_2207, 127,
                Class167.aClass229_2207);
        aHa_Sub3_8407.method3850((byte) -84, null);
        aHa_Sub3_8407.method3897(0, -4382);
        aHa_Sub3_8407.method3879(-8629);
    }

    Class105_Sub1(ha_Sub3 var_ha_Sub3, int i, int i_118_, boolean bool) {
        aBoolean8418 = false;
        anInt8400 = 0;
        anInt8417 = i_118_;
        anInt8411 = i;
        aHa_Sub3_8407 = var_ha_Sub3;
        anInterface18_Impl3_8403
                = var_ha_Sub3.method3861(i_118_, (byte) -84, i,
                Class68.aClass68_1183,
                (bool ? Class108.aClass304_1662
                        : Class348_Sub45.aClass304_7103));
        anInterface18_Impl3_8403.method66(true, true, 25688);
        aBoolean8410 = ((anInterface18_Impl3_8403.method69(false) ^ 0xffffffff)
                != (i ^ 0xffffffff));
        aBoolean8408 = ((anInterface18_Impl3_8403.method72(-39) ^ 0xffffffff)
                != (i_118_ ^ 0xffffffff));
        aBoolean8396 = !aBoolean8410 && anInterface18_Impl3_8403.method73(97);
        aBoolean8391 = !aBoolean8408 && anInterface18_Impl3_8403.method73(119);
    }

    Class105_Sub1(ha_Sub3 var_ha_Sub3, int i, int i_119_, int[] is, int i_120_,
                  int i_121_) {
        aBoolean8418 = false;
        anInt8400 = 0;
        try {
            aHa_Sub3_8407 = var_ha_Sub3;
            anInt8411 = i;
            anInt8417 = i_119_;
            anInterface18_Impl3_8403
                    = var_ha_Sub3.method3830(i, is, false, (byte) -116, i_120_,
                    i_121_, i_119_);
            anInterface18_Impl3_8403.method66(true, true, 25688);
            aBoolean8410 = (anInterface18_Impl3_8403.method69(false)
                    ^ 0xffffffff) != (i ^ 0xffffffff);
            aBoolean8408 = anInterface18_Impl3_8403.method72(-74) != i_119_;
            aBoolean8396
                    = !aBoolean8410 && anInterface18_Impl3_8403.method73(91);
            aBoolean8391
                    = !aBoolean8408 && anInterface18_Impl3_8403.method73(101);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("jd.<init>("
                            + (var_ha_Sub3 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_119_ + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_120_ + ',' + i_121_
                            + ')'));
        }
    }
}
