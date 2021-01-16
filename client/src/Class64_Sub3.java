/* Class64_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaggl.OpenGL;

final class Class64_Sub3 extends Class64 {
    private boolean aBoolean5527;
    private int[] anIntArray5528;
    private int anInt5529;
    static int anInt5530;
    static int anInt5531;
    static int anInt5532;
    static int anInt5533;
    static int anInt5534;
    static int anInt5535;
    private int anInt5536;
    private int anInt5537 = 0;
    static int anInt5538;
    private int[][] anIntArrayArray5539;
    private short aShort5540;
    private Class342[] aClass342Array5541;
    private byte[] aByteArray5542;
    private int[] anIntArray5543;
    private short aShort5544;
    static int anInt5545;
    static int anInt5546;
    static int anInt5547;
    static int anInt5548;
    static int anInt5549;
    static int anInt5550;
    static int anInt5551;
    private float[] aFloatArray5552;
    private int[][] anIntArrayArray5553;
    private Interface2 anInterface2_5554;
    private boolean aBoolean5555 = true;
    private int anInt5556;
    private int anInt5557;
    static Class261 aClass261_5558;
    private short aShort5559;
    static int anInt5560;
    static int anInt5561;
    static int anInt5562;
    private Class123 aClass123_5563;
    private short[] aShortArray5564;
    static int anInt5565;
    private short[] aShortArray5566;
    static int anInt5567;
    static int anInt5568;
    static int anInt5569;
    static int anInt5570;
    private float[] aFloatArray5571;
    private Class139 aClass139_5572;
    private short[] aShortArray5573;
    static int anInt5574;
    private Class270 aClass270_5575;
    private short[] aShortArray5576;
    static int anInt5577;
    static int anInt5578;
    private short[] aShortArray5579;
    private short[] aShortArray5580;
    private byte aByte5581;
    static int anInt5582;
    private short[] aShortArray5583;
    static int anInt5584;
    static int anInt5585;
    private short aShort5586;
    static int anInt5587;
    static int anInt5588;
    static int anInt5589;
    static int anInt5590;
    private short aShort5591;
    private short[] aShortArray5592;
    private int[] anIntArray5593;
    private byte[] aByteArray5594;
    private boolean aBoolean5595 = false;
    private Class48[] aClass48Array5596;
    static int anInt5597;
    private final ha_Sub2 aHa_Sub2_5598;
    static int anInt5599;
    static String aString5600 = "";
    private short[] aShortArray5601;
    static int anInt5602;
    static int anInt5603;
    static int anInt5604;
    private Class123 aClass123_5605;
    static int anInt5606;
    static int anInt5607;
    private short[] aShortArray5608;
    static boolean aBoolean5609;
    private Class123 aClass123_5610;
    static int anInt5611;
    static int anInt5612;
    static int anInt5613;
    static int anInt5614;
    static int anInt5615;
    static int anInt5616;
    private short aShort5617;
    static int anInt5618;
    static int anInt5619;
    private Class123 aClass123_5620;
    private Class118[] aClass118Array5621;
    static int anInt5622;
    static int anInt5623;
    static int anInt5624;
    static int anInt5625;
    private int[] anIntArray5626;
    private int[][] anIntArrayArray5627;
    static int anInt5628;
    private short aShort5629;
    static int anInt5630;
    static int anInt5631;
    private int anInt5632;
    static int anInt5633;
    private short aShort5634;
    static int anInt5635;
    static int anInt5636;
    static int anInt5637;
    private boolean aBoolean5638;
    static int anInt5639;
    private Class129[] aClass129Array5640;
    static int anInt5641;
    private int anInt5642;
    static int anInt5643;
    private int[] anIntArray5644;
    private short aShort5645;
    private short aShort5646;
    private Interface8 anInterface8_5647;
    private int anInt5648;
    private short[] aShortArray5649;
    static int anInt5650;
    static int anInt5651;

    final void FA(int i) {
        anInt5650++;
        int i_0_ = Class70.anIntArray1207[i];
        int i_1_ = Class70.anIntArray1204[i];
        for (int i_2_ = 0; i_2_ < anInt5557;
			 i_2_++) {
            int i_3_
                    = (-(i_0_ * anIntArray5644[i_2_]) + anIntArray5593[i_2_] * i_1_
                    >> -2002392914);
            anIntArray5644[i_2_]
                    = (anIntArray5593[i_2_] * i_0_ - -(anIntArray5644[i_2_] * i_1_)
                    >> -498805202);
            anIntArray5593[i_2_] = i_3_;
        }
        if (aClass123_5605 != null)
            aClass123_5605.anInterface2_1811 = null;
        aBoolean5527 = false;
    }

    final Class64 method614(byte i, int i_4_, boolean bool) {
        anInt5615++;
        Class64_Sub3 class64_sub3_5_;
        Class64_Sub3 class64_sub3_6_;
        if (i == 1) {
            class64_sub3_6_ = aHa_Sub2_5598.aClass64_Sub3_7864;
            class64_sub3_5_ = aHa_Sub2_5598.aClass64_Sub3_7780;
        } else if (i == 2) {
            class64_sub3_5_ = aHa_Sub2_5598.aClass64_Sub3_7802;
            class64_sub3_6_ = aHa_Sub2_5598.aClass64_Sub3_7838;
        } else if (i == 3) {
            class64_sub3_6_ = aHa_Sub2_5598.aClass64_Sub3_7803;
            class64_sub3_5_ = aHa_Sub2_5598.aClass64_Sub3_7821;
        } else {
            if (i == 4) {
                class64_sub3_6_ = aHa_Sub2_5598.aClass64_Sub3_7834;
                class64_sub3_5_ = aHa_Sub2_5598.aClass64_Sub3_7844;
            } else if (i == 5) {
                class64_sub3_6_ = aHa_Sub2_5598.aClass64_Sub3_7840;
                class64_sub3_5_ = aHa_Sub2_5598.aClass64_Sub3_7785;
            } else
                class64_sub3_6_ = class64_sub3_5_
                        = new Class64_Sub3(aHa_Sub2_5598);
        }
		return method686(class64_sub3_6_, i_4_, 0, bool, class64_sub3_5_,
                i != 0);
    }

    private final void method677(byte i) {
        anInt5619++;
        if (anInt5537 != 0 && i > 125) {
            if (aByte5581 != 0)
                method688(5, true);
            method688(5, false);
            if (aClass270_5575 != null) {
                if (aClass270_5575.anInterface8_3463 == null)
                    method678((aByte5581 & 0x10) != 0, (byte) 27);
                if (aClass270_5575.anInterface8_3463 != null) {
                    aHa_Sub2_5598.method3728(aClass123_5563 != null, 118);
                    aHa_Sub2_5598.method3794(aClass123_5605, aClass123_5610,
                            -26411, aClass123_5620,
                            aClass123_5563);
                    int i_7_ = -1 + anIntArray5626.length;
                    for (int i_8_ = 0;
						 i_7_ > i_8_; i_8_++) {
                        int i_9_ = anIntArray5626[i_8_];
                        int i_10_ = anIntArray5626[i_8_ + 1];
                        int i_11_ = aShortArray5601[i_9_] & 0xffff;
                        if (i_11_ == 65535)
                            i_11_ = -1;
                        aHa_Sub2_5598.method3801(aClass123_5563 != null, i_11_,
                                125);
                        aHa_Sub2_5598.method3759((-i_9_ + i_10_) * 3, -128, 4,
                                (aClass270_5575
                                        .anInterface8_3463),
                                i_9_ * 3);
                    }
                }
            }
            method691((byte) 110);
        }
    }

    private final void method678(boolean bool, byte i) {
        if (6 * anInt5537 > (aHa_Sub2_5598
                .aClass348_Sub49_Sub1_7798
                .aByteArray7154).length)
            aHa_Sub2_5598.aClass348_Sub49_Sub1_7798
                    = new Class348_Sub49_Sub1(6 * (anInt5537 - -100));
        else
            aHa_Sub2_5598.aClass348_Sub49_Sub1_7798.anInt7197
                    = 0;
        anInt5630++;
        if (i != 27)
            WA();
        Class348_Sub49_Sub1 class348_sub49_sub1
                = aHa_Sub2_5598.aClass348_Sub49_Sub1_7798;
        if (aHa_Sub2_5598.aBoolean7775) {
            for (int i_12_ = 0; i_12_ < anInt5537; i_12_++) {
                class348_sub49_sub1.method3337((byte) 107,
                        aShortArray5592[i_12_]);
                class348_sub49_sub1.method3337((byte) 107,
                        aShortArray5579[i_12_]);
                class348_sub49_sub1.method3337((byte) 107,
                        aShortArray5566[i_12_]);
            }
        } else {
            for (int i_13_ = 0;
				 i_13_ < anInt5537; i_13_++) {
                class348_sub49_sub1.method3397(122, aShortArray5592[i_13_]);
                class348_sub49_sub1.method3397(67, aShortArray5579[i_13_]);
                class348_sub49_sub1.method3397(31, aShortArray5566[i_13_]);
            }
        }
        if (class348_sub49_sub1.anInt7197 != 0) {
            if (bool) {
                if (anInterface8_5647 == null)
                    anInterface8_5647
                            = aHa_Sub2_5598.method3733(5123, -39,
                            (class348_sub49_sub1
                                    .anInt7197),
                            (class348_sub49_sub1
                                    .aByteArray7154),
                            true);
                else
                    anInterface8_5647.method35
                            (class348_sub49_sub1.aByteArray7154,
                                    5123, i ^ 0x23,
                                    class348_sub49_sub1.anInt7197);
                aClass270_5575.anInterface8_3463
                        = anInterface8_5647;
            } else aClass270_5575.anInterface8_3463
					= (aHa_Sub2_5598.method3733
					(5123, i + -65,
							class348_sub49_sub1.anInt7197,
							class348_sub49_sub1.aByteArray7154,
							false));
			if (!bool)
                aBoolean5555 = true;
        }
    }

    final boolean method628(int i, int i_14_, Class101 class101, boolean bool,
                            int i_15_) {
        try {
            anInt5533++;
            return method684(bool, 1566382404, -1, i_14_, i_15_, i, class101);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.MA(" + i + ',' + i_14_ + ','
                            + (class101 != null ? "{...}"
                            : "null")
                            + ',' + bool + ',' + i_15_
                            + ')'));
        }
    }

    private final boolean method679(int i, int i_16_, int i_17_, int i_18_,
                                    int i_19_, int i_20_, int i_21_, int i_22_,
                                    int i_23_) {
        anInt5651++;
        if (i_20_ > i && i < i_18_ && i_23_ > i)
            return false;
        if (i > i_20_ && i_18_ < i && i > i_23_)
            return false;
        if (i_22_ < i_19_ && i_16_ > i_22_
                && i_17_ > i_22_)
            return false;
        int i_24_ = -65 / ((i_21_ - 57) / 62);
		return i_19_ >= i_22_ || i_22_ <= i_16_
				|| i_17_ >= i_22_;
	}

    final void VA(int i) {
        anInt5561++;
        int i_25_ = Class70.anIntArray1207[i];
        int i_26_ = Class70.anIntArray1204[i];
        for (int i_27_ = 0; anInt5557 > i_27_; i_27_++) {
            int i_28_ = ((anIntArray5543[i_27_] * i_26_
                    + i_25_ * anIntArray5593[i_27_])
                    >> -1217648946);
            anIntArray5593[i_27_]
                    = (-(i_25_ * anIntArray5543[i_27_])
                    + anIntArray5593[i_27_] * i_26_) >> 916118766;
            anIntArray5543[i_27_] = i_28_;
        }
        if (aClass123_5605 != null)
            aClass123_5605.anInterface2_1811 = null;
        aBoolean5527 = false;
    }

    private final int method680(int i, int i_29_, byte i_30_, short i_31_,
                                int i_32_) {
        if (i != 19995)
            return -13;
        anInt5582++;
        int i_33_ = (Class10.anIntArray179
                [Class184.method1384(i_32_, i ^ 0x54b313bc, i_29_)]);
        if (i_31_ != -1) {
            Class12 class12
                    = aHa_Sub2_5598.aD4579.method3(i_31_ & 0xffff, -6662);
            int i_34_ = 0xff & class12.aByte201;
            if (i_34_ != 0) {
                int i_35_;
                if (i_29_ >= 0) {
                    if (i_29_ > 127)
                        i_35_ = 16777215;
                    else
                        i_35_ = 131586 * i_29_;
                } else
                    i_35_ = 0;
                if (i_34_ != 256) {
                    int i_36_ = i_34_;
                    int i_37_ = -i_34_ + 256;
                    i_33_
                            = ((((i_35_ & 0xff00ff) * i_36_ - -(i_37_ * (0xff00ff
                            & i_33_))
                            & ~0xff00ff)
                            - -(0xff0000 & ((0xff00 & i_35_) * i_36_
                            + (i_33_ & 0xff00) * i_37_)))
                            >> -442870488);
                } else
                    i_33_ = i_35_;
            }
            int i_38_ = 0xff & class12.aByte216;
            if (i_38_ != 0) {
                i_38_ += 256;
                int i_39_ = ((0xff0000 & i_33_) >> -336731376) * i_38_;
                if (i_39_ > 65535)
                    i_39_ = 65535;
                int i_40_ = i_38_ * (i_33_ >> -153584568 & 0xff);
                if (i_40_ > 65535)
                    i_40_ = 65535;
                int i_41_ = (0xff & i_33_) * i_38_;
                if (i_41_ > 65535)
                    i_41_ = 65535;
                i_33_ = (i_41_ >> 1063563368) + (((~0x5bff00ff & i_39_)
                        << -598599416)
                        - -(0xff00 & i_40_));
            }
        }
        return (i_33_ << 1358092424) - (i_30_ & 0xff) - -255;
    }

    final boolean method618() {
        anInt5551++;
        if (aShortArray5601 == null)
            return true;
        for (int i = 0;
			 i < aShortArray5601.length; i++) {
            if (aShortArray5601[i] != -1
                    && !aHa_Sub2_5598.aD4579.method4(-7953,
                    aShortArray5601[i]))
                return false;
        }
        return true;
    }

    final void method613(Class64 class64, int i, int i_42_, int i_43_,
                         boolean bool) {
        try {
            anInt5589++;
            Class64_Sub3 class64_sub3_44_ = (Class64_Sub3) class64;
            if (anInt5632 != 0
                    && class64_sub3_44_.anInt5632 != 0) {
                int i_45_ = class64_sub3_44_.anInt5557;
                int[] is = class64_sub3_44_.anIntArray5543;
                int[] is_46_ = class64_sub3_44_.anIntArray5593;
                int[] is_47_ = class64_sub3_44_.anIntArray5644;
                short[] is_48_ = class64_sub3_44_.aShortArray5564;
                short[] is_49_ = class64_sub3_44_.aShortArray5583;
                short[] is_50_ = class64_sub3_44_.aShortArray5576;
                byte[] is_51_ = class64_sub3_44_.aByteArray5594;
                short[] is_52_;
                short[] is_53_;
                byte[] is_54_;
                short[] is_55_;
                if (aClass139_5572 == null) {
                    is_52_ = null;
                    is_53_ = null;
                    is_54_ = null;
                    is_55_ = null;
                } else {
                    is_55_ = aClass139_5572.aShortArray1954;
                    is_54_ = aClass139_5572.aByteArray1948;
                    is_53_ = aClass139_5572.aShortArray1951;
                    is_52_ = aClass139_5572.aShortArray1953;
                }
				byte[] is_56_;
                short[] is_57_;
                short[] is_58_;
                short[] is_59_;
                if (class64_sub3_44_.aClass139_5572 == null) {
                    is_56_ = null;
                    is_57_ = null;
                    is_58_ = null;
                    is_59_ = null;
                } else {
                    is_59_ = (class64_sub3_44_.aClass139_5572
                            .aShortArray1953);
                    is_56_ = (class64_sub3_44_.aClass139_5572
                            .aByteArray1948);
                    is_58_ = (class64_sub3_44_.aClass139_5572
                            .aShortArray1954);
                    is_57_ = (class64_sub3_44_.aClass139_5572
                            .aShortArray1951);
                }
				int[] is_60_ = class64_sub3_44_.anIntArray5528;
                short[] is_61_ = class64_sub3_44_.aShortArray5649;
                if (!class64_sub3_44_.aBoolean5527)
                    class64_sub3_44_.method692((byte) -123);
                int i_62_ = class64_sub3_44_.aShort5591;
                int i_63_ = class64_sub3_44_.aShort5629;
                int i_64_ = class64_sub3_44_.aShort5540;
                int i_65_ = class64_sub3_44_.aShort5586;
                int i_66_ = class64_sub3_44_.aShort5617;
                int i_67_ = class64_sub3_44_.aShort5646;
                for (int i_68_ = 0;
					 i_68_ < anInt5557;
                     i_68_++) {
                    int i_69_ = -i_42_ + anIntArray5593[i_68_];
                    if (i_62_ <= i_69_
                            && i_69_ <= i_63_) {
                        int i_70_ = -i + anIntArray5543[i_68_];
                        if (i_70_ >= i_64_ && i_70_ <= i_65_) {
                            int i_71_ = anIntArray5644[i_68_] + -i_43_;
                            if (i_66_ <= i_71_
                                    && i_71_ <= i_67_) {
                                int i_72_ = -1;
                                int i_73_ = anIntArray5528[i_68_];
                                int i_74_ = anIntArray5528[i_68_ + 1];
                                for (int i_75_ = i_73_;
                                     (i_74_ > i_75_);
                                     i_75_++) {
                                    i_72_ = aShortArray5649[i_75_] - 1;
                                    if (i_72_ == -1 || aByteArray5594[i_72_] != 0)
                                        break;
                                }
                                if (i_72_ != -1) {
                                    for (int i_76_ = 0;
                                         (i_76_ < i_45_);
                                         i_76_++) {
                                        if (is[i_76_] == i_70_
                                                && i_71_ == is_47_[i_76_]
                                                && is_46_[i_76_] == i_69_) {
                                            i_74_ = is_60_[i_76_ - -1];
                                            int i_77_ = -1;
                                            i_73_ = is_60_[i_76_];
                                            for (int i_78_ = i_73_;
                                                 i_74_ > i_78_; i_78_++) {
                                                i_77_ = -1 + is_61_[i_78_];
                                                if (i_77_ == -1
                                                        || is_51_[i_77_] != 0)
                                                    break;
                                            }
                                            if (i_77_ != -1) {
                                                if (is_55_ == null) {
                                                    aClass139_5572
                                                            = new Class139();
                                                    is_55_
                                                            = aClass139_5572
                                                            .aShortArray1954
                                                            = (Class50_Sub3
                                                            .method470
                                                                    (aShortArray5564,
                                                                            (byte) -120));
                                                    is_53_
                                                            = aClass139_5572
                                                            .aShortArray1951
                                                            = (Class50_Sub3
                                                            .method470
                                                                    (aShortArray5583,
                                                                            (byte) -109));
                                                    is_52_
                                                            = aClass139_5572
                                                            .aShortArray1953
                                                            = (Class50_Sub3
                                                            .method470
                                                                    (aShortArray5576,
                                                                            (byte) -107));
                                                    is_54_
                                                            = aClass139_5572
                                                            .aByteArray1948
                                                            = (Class309.method2309
                                                            (-37,
                                                                    aByteArray5594));
                                                }
                                                if (is_58_ == null) {
                                                    Class139 class139
                                                            = (class64_sub3_44_
                                                            .aClass139_5572
                                                            = new Class139());
                                                    is_58_
                                                            = class139
                                                            .aShortArray1954
                                                            = (Class50_Sub3
                                                            .method470
                                                                    (is_48_,
                                                                            (byte) -127));
                                                    is_57_
                                                            = class139
                                                            .aShortArray1951
                                                            = (Class50_Sub3
                                                            .method470
                                                                    (is_49_,
                                                                            (byte) -111));
                                                    is_59_
                                                            = class139
                                                            .aShortArray1953
                                                            = (Class50_Sub3
                                                            .method470
                                                                    (is_50_,
                                                                            (byte) -120));
                                                    is_56_
                                                            = class139
                                                            .aByteArray1948
                                                            = (Class309.method2309
                                                            (-91, is_51_));
                                                }
                                                short i_79_
                                                        = aShortArray5564[i_72_];
                                                short i_80_
                                                        = aShortArray5583[i_72_];
                                                short i_81_
                                                        = aShortArray5576[i_72_];
                                                byte i_82_
                                                        = aByteArray5594[i_72_];
                                                i_73_ = is_60_[i_76_];
                                                i_74_ = is_60_[i_76_ - -1];
                                                for (int i_83_ = i_73_;
                                                     (i_74_ > i_83_);
                                                     i_83_++) {
                                                    int i_84_
                                                            = -1 + is_61_[i_83_];
                                                    if (i_84_ == -1)
                                                        break;
                                                    if (is_56_[i_84_] != 0) {
                                                        is_58_[i_84_] += i_79_;
                                                        is_57_[i_84_] += i_80_;
                                                        is_59_[i_84_] += i_81_;
                                                        is_56_[i_84_] += i_82_;
                                                    }
                                                }
                                                i_80_ = is_49_[i_77_];
                                                i_81_ = is_50_[i_77_];
                                                i_82_ = is_51_[i_77_];
                                                i_73_ = anIntArray5528[i_68_];
                                                i_74_ = (anIntArray5528
                                                        [1 + i_68_]);
                                                i_79_ = is_48_[i_77_];
                                                for (int i_85_ = i_73_;
                                                     (i_85_ < i_74_);
                                                     i_85_++) {
                                                    int i_86_
                                                            = ((aShortArray5649
                                                            [i_85_])
                                                            + -1);
                                                    if (i_86_ == -1)
                                                        break;
                                                    if (is_54_[i_86_] != 0) {
                                                        is_55_[i_86_] += i_79_;
                                                        is_53_[i_86_] += i_80_;
                                                        is_52_[i_86_] += i_81_;
                                                        is_54_[i_86_] += i_82_;
                                                    }
                                                }
                                                if (aClass123_5563 == null
                                                        && aClass123_5610 != null)
                                                    aClass123_5610
                                                            .anInterface2_1811
                                                            = null;
                                                if (aClass123_5563 != null)
                                                    aClass123_5563
                                                            .anInterface2_1811
                                                            = null;
                                                if ((class64_sub3_44_
                                                        .aClass123_5563) == null
                                                        && ((class64_sub3_44_
                                                        .aClass123_5610)
                                                        != null))
                                                    class64_sub3_44_
															.aClass123_5610
                                                            .anInterface2_1811
                                                            = null;
                                                if ((class64_sub3_44_
                                                        .aClass123_5563)
                                                        != null)
                                                    class64_sub3_44_
															.aClass123_5563
                                                            .anInterface2_1811
                                                            = null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.PA("
                            + (class64 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_42_ + ','
                            + i_43_ + ',' + bool + ')'));
        }
    }

    final boolean method623(int i, int i_87_, Class101 class101, boolean bool,
                            int i_88_, int i_89_) {
        try {
            anInt5633++;
            return method684(bool, 1566382404, i_89_, i_87_, i_88_, i,
                    class101);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.OA(" + i + ',' + i_87_ + ','
                            + (class101 != null ? "{...}"
                            : "null")
                            + ',' + bool + ',' + i_88_ + ','
                            + i_89_ + ')'));
        }
    }

    public static void method681(int i) {
        aClass261_5558 = null;
        if (i <= 75)
            aString5600 = null;
        aString5600 = null;
    }

    private final void method682(boolean bool) {
        if (aClass118Array5621 != null) {
            Class101_Sub3 class101_sub3
                    = aHa_Sub2_5598.aClass101_Sub3_7729;
            aHa_Sub2_5598.method3788(-18516);
            aHa_Sub2_5598.C(!aBoolean5595);
            aHa_Sub2_5598.method3728(false, 35);
            aHa_Sub2_5598.method3794(aHa_Sub2_5598.aClass123_7849,
                    null, -26411,
                    aHa_Sub2_5598.aClass123_7833,
                    null);
            for (int i = 0; i < anInt5536; i++) {
                Class118 class118 = aClass118Array5621[i];
                Class48 class48 = aClass48Array5596[i];
                if (!class118.aBoolean1791
                        || !aHa_Sub2_5598.method3666()) {
                    float f
                            = ((float) ((anIntArray5543
                            [class118.anInt1782])
                            + ((anIntArray5543
                            [class118.anInt1788])
                            + (anIntArray5543
                            [class118.anInt1781])))
                            * 0.3333333F);
                    float f_90_
                            = ((float) ((anIntArray5593
                            [class118.anInt1788])
                            + ((anIntArray5593
                            [class118.anInt1781])
                            + (anIntArray5593
                            [class118.anInt1782])))
                            * 0.3333333F);
                    float f_91_
                            = ((float) ((anIntArray5644
                            [class118.anInt1788])
                            + (anIntArray5644
                            [class118.anInt1781])
                            + (anIntArray5644
                            [class118.anInt1782]))
                            * 0.3333333F);
                    float f_92_ = (Class190.aFloat2555
                            + (f_91_ * Class313.aFloat3935
                            + (f_90_ * Class299_Sub1_Sub1.aFloat8696
                            + Class167.aFloat2203 * f)));
                    float f_93_ = (Class156.aFloat2111
                            + (Class215.aFloat2836 * f_91_
                            + (f_90_ * Class252.aFloat3242
                            + Class314.aFloat3943 * f)));
                    float f_94_ = (f * Class318_Sub9_Sub1.aFloat8784
                            + f_90_ * Class320.aFloat3994
                            + f_91_ * Class286_Sub8.aFloat6304
                            + Class49.aFloat4720);
                    float f_95_
                            = ((float) (1.0
                            / Math.sqrt(f_94_ * f_94_
                            + (f_93_ * f_93_
                            + (f_92_
                            * f_92_))))
                            * (float) class118.anInt1784);
                    class101_sub3.method939
                            (-f_94_ + f_94_ * f_95_,
                                    (class118.aShort1785
                                            * class48.anInt856) >> -647544441,
                                    (-(f_92_ * f_95_)
                                            + (f_92_ + (float) class48.anInt854)),
                                    (class118.aShort1790
                                            * class48.anInt857) >> -1444250169,
                                    class48.anInt853, 90,
                                    (f_95_ * f_93_
                                            + (-f_93_ + (float) class48.anInt847)));
                    aHa_Sub2_5598.method3766((byte) 55, class101_sub3);
                    int i_96_ = class48.anInt858;
                    OpenGL.glColor4ub((byte) (i_96_ >> -1284244496),
                            (byte) (i_96_ >> -349426456),
                            (byte) i_96_,
                            (byte) (i_96_ >> -184573064));
                    aHa_Sub2_5598.method3757(class118.aShort1787,
                            -77);
                    aHa_Sub2_5598.method3753(class118.aByte1789,
                            1);
                    aHa_Sub2_5598.method3756(4, 7, 0, 93);
                }
            }
            aHa_Sub2_5598.C(true);
            aHa_Sub2_5598.method3734(true);
        }
        if (bool != true)
            aShort5540 = (short) 69;
        anInt5549++;
    }

    private final short method683(int i, int i_97_, long l, int i_98_,
                                  Class124 class124, int i_99_, float f,
                                  int i_100_, int i_101_, float f_102_) {
        try {
            anInt5599++;
            int i_103_ = anIntArray5528[i_101_];
            int i_104_ = anIntArray5528[1 + i_101_];
            int i_105_ = i_100_;
            for (int i_106_ = i_103_;
				 i_104_ > i_106_; i_106_++) {
                short i_107_ = aShortArray5649[i_106_];
                if (i_107_ == 0) {
                    i_105_ = i_106_;
                    break;
                }
                if (l == Class258_Sub2.aLongArray8530[i_106_])
                    return (short) (i_107_ - 1);
            }
            aShortArray5649[i_105_] = (short) (anInt5529 + 1);
            Class258_Sub2.aLongArray8530[i_105_] = l;
            aShortArray5564[anInt5529] = (short) i_98_;
            aShortArray5583[anInt5529] = (short) i;
            aShortArray5576[anInt5529] = (short) i_97_;
            aByteArray5594[anInt5529] = (byte) i_99_;
            aFloatArray5552[anInt5529] = f;
            aFloatArray5571[anInt5529] = f_102_;
            return (short) anInt5529++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.R(" + i + ',' + i_97_ + ','
                            + l + ',' + i_98_ + ','
                            + (class124 != null ? "{...}"
                            : "null")
                            + ',' + i_99_ + ',' + f + ','
                            + i_100_ + ',' + i_101_ + ','
                            + f_102_ + ')'));
        }
    }

    final int EA() {
        anInt5637++;
        if (!aBoolean5527)
            method692((byte) -123);
        return aShort5629;
    }

    private final boolean method684(boolean bool, int i, int i_108_,
                                    int i_109_, int i_110_, int i_111_,
                                    Class101 class101) {
        try {
            anInt5641++;
            Class101_Sub3 class101_sub3 = (Class101_Sub3) class101;
            Class101_Sub3 class101_sub3_112_
                    = aHa_Sub2_5598.aClass101_Sub3_7760;
            float f = (class101_sub3_112_.aFloat5747
                    + ((class101_sub3.aFloat5751
                    * class101_sub3_112_.aFloat5781)
                    + ((class101_sub3_112_.aFloat5770
                    * class101_sub3.aFloat5747)
                    + (class101_sub3.aFloat5772
                    * (class101_sub3_112_
                    .aFloat5750)))));
            float f_113_
                    = (class101_sub3_112_.aFloat5772
                    + ((class101_sub3.aFloat5751
                    * class101_sub3_112_.aFloat5762)
                    + ((class101_sub3.aFloat5747
                    * class101_sub3_112_.aFloat5761)
                    + (class101_sub3.aFloat5772
                    * (class101_sub3_112_
                    .aFloat5769)))));
            Class299_Sub1_Sub1.aFloat8696
                    = ((class101_sub3_112_.aFloat5781
                    * class101_sub3.aFloat5754)
                    + ((class101_sub3.aFloat5769
                    * class101_sub3_112_.aFloat5750)
                    + (class101_sub3_112_.aFloat5770
                    * class101_sub3.aFloat5750)));
            Class215.aFloat2836
                    = ((class101_sub3.aFloat5781
                    * class101_sub3_112_.aFloat5761)
                    + (class101_sub3_112_.aFloat5769
                    * class101_sub3.aFloat5762)
                    + (class101_sub3_112_.aFloat5762
                    * class101_sub3.aFloat5784));
            Class318_Sub9_Sub1.aFloat8784
                    = ((class101_sub3_112_.aFloat5754
                    * class101_sub3.aFloat5761)
                    + (class101_sub3.aFloat5770
                    * class101_sub3_112_.aFloat5756)
                    + (class101_sub3.aFloat5756
                    * class101_sub3_112_.aFloat5784));
            Class286_Sub8.aFloat6304
                    = ((class101_sub3.aFloat5781
                    * class101_sub3_112_.aFloat5756)
                    + (class101_sub3.aFloat5762
                    * class101_sub3_112_.aFloat5754)
                    + (class101_sub3_112_.aFloat5784
                    * class101_sub3.aFloat5784));
            float f_114_
                    = ((class101_sub3_112_.aFloat5756
                    * class101_sub3.aFloat5747)
                    + (class101_sub3_112_.aFloat5754
                    * class101_sub3.aFloat5772)
                    + (class101_sub3.aFloat5751
                    * class101_sub3_112_.aFloat5784)
                    + class101_sub3_112_.aFloat5751);
            Class252.aFloat3242
                    = ((class101_sub3_112_.aFloat5761
                    * class101_sub3.aFloat5750)
                    + (class101_sub3_112_.aFloat5769
                    * class101_sub3.aFloat5769)
                    + (class101_sub3_112_.aFloat5762
                    * class101_sub3.aFloat5754));
            Class314.aFloat3943
                    = ((class101_sub3.aFloat5756
                    * class101_sub3_112_.aFloat5762)
                    + ((class101_sub3.aFloat5761
                    * class101_sub3_112_.aFloat5769)
                    + (class101_sub3_112_.aFloat5761
                    * class101_sub3.aFloat5770)));
            Class313.aFloat3935
                    = ((class101_sub3_112_.aFloat5750
                    * class101_sub3.aFloat5762)
                    + (class101_sub3_112_.aFloat5770
                    * class101_sub3.aFloat5781)
                    + (class101_sub3.aFloat5784
                    * class101_sub3_112_.aFloat5781));
            Class167.aFloat2203
                    = ((class101_sub3.aFloat5756
                    * class101_sub3_112_.aFloat5781)
                    + ((class101_sub3.aFloat5770
                    * class101_sub3_112_.aFloat5770)
                    + (class101_sub3.aFloat5761
                    * class101_sub3_112_.aFloat5750)));
            Class320.aFloat3994
                    = ((class101_sub3_112_.aFloat5784
                    * class101_sub3.aFloat5754)
                    + ((class101_sub3.aFloat5769
                    * class101_sub3_112_.aFloat5754)
                    + (class101_sub3.aFloat5750
                    * class101_sub3_112_.aFloat5756)));
            boolean bool_115_ = false;
            float f_116_ = 3.4028235E38F;
            float f_117_ = -3.4028235E38F;
            float f_118_ = 3.4028235E38F;
            float f_119_ = -3.4028235E38F;
            int i_120_ = aHa_Sub2_5598.anInt7771;
            int i_121_ = aHa_Sub2_5598.anInt7794;
            if (!aBoolean5527)
                method692((byte) -123);
            int i_122_ = -aShort5540 + aShort5586 >> -721971071;
            int i_123_ = aShort5629 + -aShort5591 >> 419615521;
            int i_124_ = aShort5646 + -aShort5617 >> 1381756865;
            int i_125_ = aShort5540 + i_122_;
            int i_126_ = aShort5591 - -i_123_;
            int i_127_ = i_124_ + aShort5617;
            int i_128_ = -(i_122_ << i_110_) + i_125_;
            int i_129_ = i_126_ + -(i_123_ << i_110_);
            int i_130_ = i_127_ - (i_124_ << i_110_);
            int i_131_ = i_125_ + (i_122_ << i_110_);
            int i_132_ = (i_123_ << i_110_) + i_126_;
            int i_133_ = (i_124_ << i_110_) + i_127_;
            Class318_Sub2.anIntArray6393[0] = i_128_;
            IOException_Sub1.anIntArray91[0] = i_129_;
            Class318_Sub2.anIntArray6393[1] = i_131_;
            Class244.anIntArray4623[0] = i_130_;
            IOException_Sub1.anIntArray91[1] = i_129_;
            Class318_Sub2.anIntArray6393[2] = i_128_;
            if (i != 1566382404)
                method621();
            Class244.anIntArray4623[1] = i_130_;
            IOException_Sub1.anIntArray91[2] = i_132_;
            Class244.anIntArray4623[2] = i_130_;
            Class318_Sub2.anIntArray6393[3] = i_131_;
            IOException_Sub1.anIntArray91[3] = i_132_;
            Class318_Sub2.anIntArray6393[4] = i_128_;
            Class244.anIntArray4623[3] = i_130_;
            IOException_Sub1.anIntArray91[4] = i_129_;
            Class244.anIntArray4623[4] = i_133_;
            Class318_Sub2.anIntArray6393[5] = i_131_;
            IOException_Sub1.anIntArray91[5] = i_129_;
            Class244.anIntArray4623[5] = i_133_;
            Class318_Sub2.anIntArray6393[6] = i_128_;
            IOException_Sub1.anIntArray91[6] = i_132_;
            Class318_Sub2.anIntArray6393[7] = i_131_;
            Class244.anIntArray4623[6] = i_133_;
            IOException_Sub1.anIntArray91[7] = i_132_;
            Class244.anIntArray4623[7] = i_133_;
            for (int i_134_ = 0; i_134_ < 8; i_134_++) {
                float f_135_ = (float) Class244.anIntArray4623[i_134_];
                float f_136_ = (float) IOException_Sub1.anIntArray91[i_134_];
                float f_137_ = (float) Class318_Sub2.anIntArray6393[i_134_];
                float f_138_ = (Class286_Sub8.aFloat6304 * f_135_
                        + (f_137_ * Class318_Sub9_Sub1.aFloat8784
                        + Class320.aFloat3994 * f_136_)
                        + f_114_);
                float f_139_ = f_113_ + (Class314.aFloat3943 * f_137_
                        + Class252.aFloat3242 * f_136_
                        + Class215.aFloat2836 * f_135_);
                float f_140_ = f + (Class299_Sub1_Sub1.aFloat8696 * f_136_
                        + f_137_ * Class167.aFloat2203
                        + Class313.aFloat3935 * f_135_);
                if ((float) aHa_Sub2_5598.anInt7826 <= f_138_) {
                    if (i_108_ > 0)
                        f_138_ = (float) i_108_;
                    float f_141_
                            = (f_140_ * (float) i_120_ / f_138_
                            + (float) aHa_Sub2_5598.anInt7853);
                    if (f_141_ < f_116_)
                        f_116_ = f_141_;
                    if (f_141_ > f_117_)
                        f_117_ = f_141_;
                    float f_142_
                            = (f_139_ * (float) i_121_ / f_138_
                            + (float) aHa_Sub2_5598.anInt7810);
                    if (f_142_ > f_119_)
                        f_119_ = f_142_;
                    bool_115_ = true;
                    if (f_142_ < f_118_)
                        f_118_ = f_142_;
                }
            }
            if (bool_115_ && (float) i_111_ > f_116_ && (float) i_111_ < f_117_
                    && (float) i_109_ > f_118_ && (float) i_109_ < f_119_) {
                if (bool)
                    return true;
                if (anInt5529 > aHa_Sub2_5598.anIntArray7880.length) {
                    aHa_Sub2_5598.anIntArray7883
                            = new int[anInt5529];
                    aHa_Sub2_5598.anIntArray7880
                            = new int[anInt5529];
                }
                int[] is = aHa_Sub2_5598.anIntArray7880;
                int[] is_143_ = aHa_Sub2_5598.anIntArray7883;
                for (int i_144_ = 0;
					 i_144_ < anInt5557;
                     i_144_++) {
                    float f_145_ = (float) anIntArray5543[i_144_];
                    float f_146_ = (float) anIntArray5644[i_144_];
                    float f_147_ = (float) anIntArray5593[i_144_];
                    float f_148_
                            = f_114_ + (f_146_ * Class286_Sub8.aFloat6304
                            + (Class318_Sub9_Sub1.aFloat8784 * f_145_
                            + f_147_ * Class320.aFloat3994));
                    float f_149_ = f + (f_147_ * Class299_Sub1_Sub1.aFloat8696
                            + f_145_ * Class167.aFloat2203
                            + Class313.aFloat3935 * f_146_);
                    float f_150_ = f_113_ + (Class252.aFloat3242 * f_147_
                            + f_145_ * Class314.aFloat3943
                            + f_146_ * Class215.aFloat2836);
                    if (f_148_
							>= (float) aHa_Sub2_5598.anInt7826) {
								if (i_108_ > 0)
									f_148_ = (float) i_108_;
								int i_155_
										= (int) ((float) (aHa_Sub2_5598
										.anInt7853)
										+ f_149_ * (float) i_120_ / f_148_);
								int i_156_
										= (int) ((float) (aHa_Sub2_5598
										.anInt7810)
										+ (float) i_121_ * f_150_ / f_148_);
								int i_157_ = anIntArray5528[i_144_];
								int i_158_ = anIntArray5528[1 + i_144_];
								for (int i_159_ = i_157_;
									 i_159_ < i_158_;
									 i_159_++) {
									int i_160_ = -1 + aShortArray5649[i_159_];
									if (i_160_ == -1)
										break;
									is[i_160_] = i_155_;
									is_143_[i_160_] = i_156_;
								}
							} else {
                        int i_151_ = anIntArray5528[i_144_];
                        int i_152_ = anIntArray5528[1 + i_144_];
                        for (int i_153_ = i_151_;
							 i_152_ > i_153_;
                             i_153_++) {
                            int i_154_ = aShortArray5649[i_153_] - 1;
                            if (i_154_ == -1)
                                break;
                            is[aShortArray5649[i_153_] - 1] = -999999;
                        }
                    }
				}
                for (int i_161_ = 0; i_161_ < anInt5632; i_161_++) {
                    if (is[aShortArray5592[i_161_]] != -999999
                            && is[aShortArray5579[i_161_]] != -999999
                            && is[aShortArray5566[i_161_]] != -999999
                            && method679(i_109_, is[aShortArray5579[i_161_]],
                            is[aShortArray5566[i_161_]],
                            is_143_[aShortArray5579[i_161_]],
                            is[aShortArray5592[i_161_]],
                            is_143_[aShortArray5592[i_161_]], 125,
                            i_111_, is_143_[aShortArray5566[i_161_]]))
                        return true;
                }
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.SA(" + bool + ',' + i + ','
                            + i_108_ + ',' + i_109_ + ','
                            + i_110_ + ',' + i_111_ + ','
                            + (class101 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void O(int i, int i_162_, int i_163_) {
        anInt5618++;
        for (int i_164_ = 0; anInt5557 > i_164_; i_164_++) {
            if (i != 128)
                anIntArray5543[i_164_]
                        = i * anIntArray5543[i_164_] >> 216727719;
            if (i_162_ != 128)
                anIntArray5593[i_164_]
                        = anIntArray5593[i_164_] * i_162_ >> -909240761;
            if (i_163_ != 128)
                anIntArray5644[i_164_]
                        = anIntArray5644[i_164_] * i_163_ >> 1866001863;
        }
        if (aClass123_5605 != null)
            aClass123_5605.anInterface2_1811 = null;
        aBoolean5527 = false;
    }

    final r ba(r var_r) {
        try {
            anInt5562++;
            if (anInt5529 == 0)
                return null;
            if (!aBoolean5527)
                method692((byte) -123);
            int i;
            int i_165_;
            if (aHa_Sub2_5598.anInt7772 > 0) {
                i = (-(aShort5629 * aHa_Sub2_5598.anInt7772
                        >> 2019324136) + aShort5540
                        >> aHa_Sub2_5598.anInt7731);
                i_165_ = ((aShort5586
                        + -(aShort5591 * aHa_Sub2_5598.anInt7772
                        >> 343653448))
                        >> aHa_Sub2_5598.anInt7731);
            } else {
                i = (-(aShort5591 * aHa_Sub2_5598.anInt7772
                        >> 1513519656) + aShort5540
                        >> aHa_Sub2_5598.anInt7731);
                i_165_ = ((aShort5586
                        + -(aHa_Sub2_5598.anInt7772 * aShort5629
                        >> 627247144))
                        >> aHa_Sub2_5598.anInt7731);
            }
            int i_166_;
            int i_167_;
            if (aHa_Sub2_5598.anInt7777 > 0) {
                i_166_ = (-(aHa_Sub2_5598.anInt7777 * aShort5629
                        >> 1276490888) + aShort5617
                        >> aHa_Sub2_5598.anInt7731);
                i_167_ = ((aShort5646
                        - (aShort5591 * aHa_Sub2_5598.anInt7777
                        >> 1713748072))
                        >> aHa_Sub2_5598.anInt7731);
            } else {
                i_166_ = (-(aHa_Sub2_5598.anInt7777 * aShort5591
                        >> -1440833304) + aShort5617
                        >> aHa_Sub2_5598.anInt7731);
                i_167_ = (-(aHa_Sub2_5598.anInt7777 * aShort5629
                        >> -1649336024) + aShort5646
                        >> aHa_Sub2_5598.anInt7731);
            }
            int i_168_ = i_165_ - i - -1;
            int i_169_ = -i_166_ + i_167_ - -1;
            r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
            r_Sub2 var_r_Sub2_170_;
            if (var_r_Sub2 == null
                    || !var_r_Sub2.method3296((byte) -47, i_169_, i_168_))
                var_r_Sub2_170_ = new r_Sub2(aHa_Sub2_5598, i_168_, i_169_);
            else {
                var_r_Sub2_170_ = var_r_Sub2;
                var_r_Sub2_170_.method3293((byte) 0);
            }
            var_r_Sub2_170_.method3292(i_167_, i_165_, i_166_, 25053, i);
            method685((byte) 118, var_r_Sub2_170_);
            return var_r_Sub2_170_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "paa.ba(" + (var_r != null
                            ? "{...}"
                            : "null") + ')');
        }
    }

    final void method612() {
        anInt5560++;
        if (anInt5529 > 0 && anInt5537 > 0) {
            method688(5, false);
            if ((aByte5581 & 0x10) == 0
                    && aClass270_5575.anInterface8_3463 == null)
                method678(false, (byte) 27);
            method691((byte) 124);
        }
    }

    final int na() {
        if (!aBoolean5527)
            method692((byte) -123);
        anInt5578++;
        return aShort5634;
    }

    final void k(int i) {
        anInt5622++;
        int i_171_ = Class70.anIntArray1207[i];
        int i_172_ = Class70.anIntArray1204[i];
        for (int i_173_ = 0; i_173_ < anInt5557;
			 i_173_++) {
            int i_174_ = ((anIntArray5543[i_173_] * i_172_
                    + anIntArray5644[i_173_] * i_171_)
                    >> 212706478);
            anIntArray5644[i_173_]
                    = anIntArray5644[i_173_] * i_172_ + -(anIntArray5543[i_173_]
                    * i_171_) >> 2058190;
            anIntArray5543[i_173_] = i_174_;
        }
        for (int i_175_ = 0; i_175_ < anInt5529; i_175_++) {
            int i_176_ = ((aShortArray5564[i_175_] * i_172_
                    + aShortArray5576[i_175_] * i_171_)
                    >> -50398098);
            aShortArray5576[i_175_]
                    = (short) ((i_172_ * aShortArray5576[i_175_]
                    + -(i_171_ * aShortArray5564[i_175_]))
                    >> 867198894);
            aShortArray5564[i_175_] = (short) i_176_;
        }
        if (aClass123_5563 == null && aClass123_5610 != null)
            aClass123_5610.anInterface2_1811 = null;
        if (aClass123_5563 != null)
            aClass123_5563.anInterface2_1811 = null;
        if (aClass123_5605 != null)
            aClass123_5605.anInterface2_1811 = null;
        aBoolean5527 = false;
    }

    private final void method685(byte i, r_Sub2 var_r_Sub2) {
        try {
            if (aHa_Sub2_5598.anIntArray7880.length < anInt5529) {
                aHa_Sub2_5598.anIntArray7883 = new int[anInt5529];
                aHa_Sub2_5598.anIntArray7880 = new int[anInt5529];
            }
            anInt5530++;
            int[] is = aHa_Sub2_5598.anIntArray7880;
            if (i < 91)
                method619();
            int[] is_177_ = aHa_Sub2_5598.anIntArray7883;
            for (int i_178_ = 0;
				 anInt5557 > i_178_; i_178_++) {
                int i_179_ = ((-((aHa_Sub2_5598.anInt7772
                        * anIntArray5593[i_178_])
                        >> 1278542952) + anIntArray5543[i_178_]
                        >> aHa_Sub2_5598.anInt7731)
                        - var_r_Sub2.anInt10489);
                int i_180_ = (((anIntArray5644[i_178_]
                        + -((aHa_Sub2_5598.anInt7777
                        * anIntArray5593[i_178_])
                        >> 1797551784))
                        >> aHa_Sub2_5598.anInt7731)
                        + -var_r_Sub2.anInt10484);
                int i_181_ = anIntArray5528[i_178_];
                int i_182_ = anIntArray5528[1 + i_178_];
                for (int i_183_ = i_181_; i_182_ > i_183_; i_183_++) {
                    int i_184_ = aShortArray5649[i_183_] + -1;
                    if (i_184_ == -1)
                        break;
                    is[i_184_] = i_179_;
                    is_177_[i_184_] = i_180_;
                }
            }
            for (int i_185_ = 0; i_185_ < anInt5537; i_185_++) {
                if (aByteArray5542 == null
                        || aByteArray5542[i_185_] <= 128) {
                    short i_186_ = aShortArray5592[i_185_];
                    short i_187_ = aShortArray5579[i_185_];
                    short i_188_ = aShortArray5566[i_185_];
                    int i_189_ = is[i_186_];
                    int i_190_ = is[i_187_];
                    int i_191_ = is[i_188_];
                    int i_192_ = is_177_[i_186_];
                    int i_193_ = is_177_[i_187_];
                    int i_194_ = is_177_[i_188_];
                    if (((i_189_ + -i_190_) * (-i_194_ + i_193_)
                            - (-i_190_ + i_191_) * (-i_192_ + i_193_))
                            > 0)
                        var_r_Sub2.method3294(i_191_, i_189_, i_192_, 28,
                                i_190_, i_194_, i_193_);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.U(" + i + ','
                            + (var_r_Sub2 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method624(int i, int i_195_, int i_196_, int i_197_) {
        anInt5534++;
        for (int i_198_ = 0; anInt5632 > i_198_; i_198_++) {
            int i_199_ = 0xffff & aShortArray5580[i_198_];
            int i_200_ = (i_199_ & 0xfd9e) >> 1107300586;
            int i_201_ = i_199_ >> -942433721 & 0x7;
            if (i != -1)
                i_200_ = (i_197_ * (-i_200_ + i) >> -838697721) + i_200_;
            int i_202_ = i_199_ & 0x7f;
            if (i_195_ != -1)
                i_201_ = (i_197_ * (i_195_ - i_201_) >> 369627111) + i_201_;
            if (i_196_ != -1)
                i_202_ += (i_196_ + -i_202_) * i_197_ >> -1261204825;
            aShortArray5580[i_198_]
                    = (short) (Class273.method2057
                    (Class273.method2057(i_201_ << 1165960167,
                            i_200_ << -3437622),
                            i_202_));
        }
        if (aClass118Array5621 != null) {
            for (int i_203_ = 0;
				 i_203_ < anInt5536; i_203_++) {
                Class118 class118 = aClass118Array5621[i_203_];
                Class48 class48 = aClass48Array5596[i_203_];
                class48.anInt858
                        = ((0xffffff
                        & (Class10.anIntArray179
                        [0xffff & (aShortArray5580
                        [class118.anInt1783])]))
                        | class48.anInt858 & ~0xffffff);
            }
        }
        if (aClass123_5610 != null)
            aClass123_5610.anInterface2_1811 = null;
    }

    final void H(int i, int i_204_, int i_205_) {
        anInt5547++;
        for (int i_206_ = 0; anInt5557 > i_206_; i_206_++) {
            if (i != 0)
                anIntArray5543[i_206_] += i;
            if (i_204_ != 0)
                anIntArray5593[i_206_] += i_204_;
            if (i_205_ != 0)
                anIntArray5644[i_206_] += i_205_;
        }
        aBoolean5527 = false;
        if (aClass123_5605 != null)
            aClass123_5605.anInterface2_1811 = null;
    }

    final void a(int i) {
        anInt5538++;
        int i_207_ = Class70.anIntArray1207[i];
        int i_208_ = Class70.anIntArray1204[i];
        for (int i_209_ = 0; anInt5557 > i_209_; i_209_++) {
            int i_210_ = ((i_208_ * anIntArray5543[i_209_]
                    + i_207_ * anIntArray5644[i_209_])
                    >> 1329302382);
            anIntArray5644[i_209_]
                    = anIntArray5644[i_209_] * i_208_ + -(anIntArray5543[i_209_]
                    * i_207_) >> 1890890734;
            anIntArray5543[i_209_] = i_210_;
        }
        aBoolean5527 = false;
        if (aClass123_5605 != null)
            aClass123_5605.anInterface2_1811 = null;
    }

    final boolean F() {
        anInt5612++;
        return aBoolean5595;
    }

    final void method622() {
        anInt5613++;
    }

    private final Class64 method686
            (Class64_Sub3 class64_sub3_211_, int i, int i_212_, boolean bool,
             Class64_Sub3 class64_sub3_213_, boolean bool_214_) {
        try {
            anInt5628++;
            class64_sub3_211_.anInt5642 = anInt5642;
            class64_sub3_211_.anInt5556 = anInt5556;
            class64_sub3_211_.anInt5536 = anInt5536;
            class64_sub3_211_.aByte5581 = (byte) 0;
            class64_sub3_211_.aShort5544 = aShort5544;
            class64_sub3_211_.anInt5529 = anInt5529;
            class64_sub3_211_.aBoolean5638 = aBoolean5638;
            class64_sub3_211_.anInt5648 = i;
            class64_sub3_211_.aShort5645 = aShort5645;
            class64_sub3_211_.anInt5632 = anInt5632;
            class64_sub3_211_.anInt5537 = anInt5537;
            class64_sub3_211_.anInt5557 = anInt5557;
            if ((i & 0x100) == 0)
                class64_sub3_211_.aBoolean5595 = aBoolean5595;
            else
                class64_sub3_211_.aBoolean5595 = true;
            boolean bool_215_ = Class348.method2709(anInt5556, i, -1);
            boolean bool_216_ = Class223.method1613(false, anInt5556, i);
            boolean bool_217_ = Class299_Sub1.method2259(i_212_, anInt5556, i);
            boolean bool_218_ = bool_217_ | (bool_216_ | bool_215_);
            if (bool_218_) {
                if (!bool_215_)
                    class64_sub3_211_.anIntArray5543 = anIntArray5543;
                else if (class64_sub3_213_.anIntArray5543 != null
                        && (class64_sub3_213_.anIntArray5543.length
                        >= anInt5642))
                    class64_sub3_211_.anIntArray5543
                            = class64_sub3_213_.anIntArray5543;
                else
                    class64_sub3_211_.anIntArray5543
                            = class64_sub3_213_.anIntArray5543
                            = new int[anInt5642];
                if (bool_216_) {
                    if (class64_sub3_213_.anIntArray5593 != null
                            && (anInt5642
                            <= class64_sub3_213_.anIntArray5593.length))
                        class64_sub3_211_.anIntArray5593
                                = class64_sub3_213_.anIntArray5593;
                    else
                        class64_sub3_211_.anIntArray5593
                                = class64_sub3_213_.anIntArray5593
                                = new int[anInt5642];
                } else
                    class64_sub3_211_.anIntArray5593 = anIntArray5593;
                if (bool_217_) {
                    if (class64_sub3_213_.anIntArray5644 == null
                            || (class64_sub3_213_.anIntArray5644.length < anInt5642))
                        class64_sub3_211_.anIntArray5644
                                = class64_sub3_213_.anIntArray5644
                                = new int[anInt5642];
                    else
                        class64_sub3_211_.anIntArray5644
                                = class64_sub3_213_.anIntArray5644;
                } else
                    class64_sub3_211_.anIntArray5644 = anIntArray5644;
                for (int i_219_ = 0;
					 anInt5642 > i_219_;
                     i_219_++) {
                    if (bool_215_)
                        class64_sub3_211_.anIntArray5543[i_219_]
                                = anIntArray5543[i_219_];
                    if (bool_216_)
                        class64_sub3_211_.anIntArray5593[i_219_]
                                = anIntArray5593[i_219_];
                    if (bool_217_)
                        class64_sub3_211_.anIntArray5644[i_219_]
                                = anIntArray5644[i_219_];
                }
            } else {
                class64_sub3_211_.anIntArray5644 = anIntArray5644;
                class64_sub3_211_.anIntArray5593 = anIntArray5593;
                class64_sub3_211_.anIntArray5543 = anIntArray5543;
            }
			if (Class288.method2187(i, -79, anInt5556)) {
				class64_sub3_211_.aClass123_5605
						= class64_sub3_213_.aClass123_5605;
				if (bool_214_)
					class64_sub3_211_.aByte5581 |= 0x1;
				class64_sub3_211_.aClass123_5605.anInterface2_1811
						= aClass123_5605.anInterface2_1811;
				class64_sub3_211_.aClass123_5605.aByte1812
						= aClass123_5605.aByte1812;
			} else {
				if (!Class64.method616(i_212_ + 2, i, anInt5556))
					class64_sub3_211_.aClass123_5605 = null;
				else
					class64_sub3_211_.aClass123_5605 = aClass123_5605;
			}
			if (Class122.method1087(12644, anInt5556, i)) {
                if (class64_sub3_213_.aShortArray5580 != null
                        && (class64_sub3_213_.aShortArray5580.length >= anInt5632))
                    class64_sub3_211_.aShortArray5580
                            = class64_sub3_213_.aShortArray5580;
                else
                    class64_sub3_211_.aShortArray5580
                            = class64_sub3_213_.aShortArray5580
                            = new short[anInt5632];
                for (int i_220_ = 0; i_220_ < anInt5632; i_220_++)
                    class64_sub3_211_.aShortArray5580[i_220_]
                            = aShortArray5580[i_220_];
            } else
                class64_sub3_211_.aShortArray5580 = aShortArray5580;
            if (Class278.method2075(i, -128, anInt5556)) {
                if (class64_sub3_213_.aByteArray5542 == null
                        || (class64_sub3_213_.aByteArray5542.length < anInt5632))
                    class64_sub3_211_.aByteArray5542
                            = class64_sub3_213_.aByteArray5542
                            = new byte[anInt5632];
                else
                    class64_sub3_211_.aByteArray5542
                            = class64_sub3_213_.aByteArray5542;
                for (int i_221_ = 0; anInt5632 > i_221_; i_221_++)
                    class64_sub3_211_.aByteArray5542[i_221_]
                            = aByteArray5542[i_221_];
            } else class64_sub3_211_.aByteArray5542 = aByteArray5542;
			if (Class273.method2056(i, 108, anInt5556)) {
                class64_sub3_211_.aClass123_5610
                        = class64_sub3_213_.aClass123_5610;
                if (bool_214_)
                    class64_sub3_211_.aByte5581 |= 0x2;
                class64_sub3_211_.aClass123_5610.anInterface2_1811
                        = aClass123_5610.anInterface2_1811;
                class64_sub3_211_.aClass123_5610.aByte1812
                        = aClass123_5610.aByte1812;
            } else if (Class146.method1193(anInt5556, i, true))
                class64_sub3_211_.aClass123_5610 = aClass123_5610;
            else
                class64_sub3_211_.aClass123_5610 = null;
            if (Class156.method1241(anInt5556, i, -119)) {
                if (class64_sub3_213_.aShortArray5564 != null
                        && class64_sub3_213_.aShortArray5564.length >= anInt5529) {
                    class64_sub3_211_.aShortArray5564
                            = class64_sub3_213_.aShortArray5564;
                    class64_sub3_211_.aShortArray5583
                            = class64_sub3_213_.aShortArray5583;
                    class64_sub3_211_.aShortArray5576
                            = class64_sub3_213_.aShortArray5576;
                } else {
                    int i_222_ = anInt5529;
                    class64_sub3_211_.aShortArray5583
                            = class64_sub3_213_.aShortArray5583
                            = new short[i_222_];
                    class64_sub3_211_.aShortArray5564
                            = class64_sub3_213_.aShortArray5564
                            = new short[i_222_];
                    class64_sub3_211_.aShortArray5576
                            = class64_sub3_213_.aShortArray5576
                            = new short[i_222_];
                }
                if (aClass139_5572 == null) {
                    for (int i_223_ = 0; i_223_ < anInt5529; i_223_++) {
                        class64_sub3_211_.aShortArray5564[i_223_]
                                = aShortArray5564[i_223_];
                        class64_sub3_211_.aShortArray5583[i_223_]
                                = aShortArray5583[i_223_];
                        class64_sub3_211_.aShortArray5576[i_223_]
                                = aShortArray5576[i_223_];
                    }
                } else {
                    if (class64_sub3_213_.aClass139_5572 == null)
                        class64_sub3_213_.aClass139_5572 = new Class139();
                    Class139 class139 = (class64_sub3_211_.aClass139_5572
                            = class64_sub3_213_.aClass139_5572);
                    if (class139.aShortArray1954 == null
                            || (anInt5529
                            > class139.aShortArray1954.length)) {
                        int i_224_ = anInt5529;
                        class139.aShortArray1951
                                = new short[i_224_];
                        class139.aShortArray1953
                                = new short[i_224_];
                        class139.aShortArray1954
                                = new short[i_224_];
                        class139.aByteArray1948
                                = new byte[i_224_];
                    }
                    for (int i_225_ = 0; anInt5529 > i_225_; i_225_++) {
                        class64_sub3_211_.aShortArray5564[i_225_]
                                = aShortArray5564[i_225_];
                        class64_sub3_211_.aShortArray5583[i_225_]
                                = aShortArray5583[i_225_];
                        class64_sub3_211_.aShortArray5576[i_225_]
                                = aShortArray5576[i_225_];
                        class139.aShortArray1954[i_225_]
                                = (aClass139_5572.aShortArray1954
                                [i_225_]);
                        class139.aShortArray1951[i_225_]
                                = (aClass139_5572.aShortArray1951
                                [i_225_]);
                        class139.aShortArray1953[i_225_]
                                = (aClass139_5572.aShortArray1953
                                [i_225_]);
                        class139.aByteArray1948[i_225_]
                                = (aClass139_5572.aByteArray1948
                                [i_225_]);
                    }
                }
                class64_sub3_211_.aByteArray5594 = aByteArray5594;
            } else {
                class64_sub3_211_.aShortArray5564 = aShortArray5564;
                class64_sub3_211_.aShortArray5583 = aShortArray5583;
                class64_sub3_211_.aClass139_5572 = aClass139_5572;
                class64_sub3_211_.aByteArray5594 = aByteArray5594;
                class64_sub3_211_.aShortArray5576 = aShortArray5576;
            }
			if (Class348_Sub47.method3325(i, anInt5556, true)) {
                if (bool_214_)
                    class64_sub3_211_.aByte5581 |= 0x4;
                class64_sub3_211_.aClass123_5563
                        = class64_sub3_213_.aClass123_5563;
                class64_sub3_211_.aClass123_5563.anInterface2_1811
                        = aClass123_5563.anInterface2_1811;
                class64_sub3_211_.aClass123_5563.aByte1812
                        = aClass123_5563.aByte1812;
            } else if (!aa_Sub3.method166((byte) 108, anInt5556, i))
                class64_sub3_211_.aClass123_5563 = null;
            else
                class64_sub3_211_.aClass123_5563 = aClass123_5563;
            if (Class286_Sub9.method2174((byte) 121, i, anInt5556)) {
                if (class64_sub3_213_.aFloatArray5552 != null
                        && (class64_sub3_213_.aFloatArray5552.length >= anInt5632)) {
                    class64_sub3_211_.aFloatArray5571
                            = class64_sub3_213_.aFloatArray5571;
                    class64_sub3_211_.aFloatArray5552
                            = class64_sub3_213_.aFloatArray5552;
                } else {
                    int i_226_ = anInt5529;
                    class64_sub3_211_.aFloatArray5571
                            = class64_sub3_213_.aFloatArray5571
                            = new float[i_226_];
                    class64_sub3_211_.aFloatArray5552
                            = class64_sub3_213_.aFloatArray5552
                            = new float[i_226_];
                }
                for (int i_227_ = 0; i_227_ < anInt5529; i_227_++) {
                    class64_sub3_211_.aFloatArray5552[i_227_]
                            = aFloatArray5552[i_227_];
                    class64_sub3_211_.aFloatArray5571[i_227_]
                            = aFloatArray5571[i_227_];
                }
            } else {
                class64_sub3_211_.aFloatArray5571 = aFloatArray5571;
                class64_sub3_211_.aFloatArray5552 = aFloatArray5552;
            }
            if (Class202.method1475((byte) -96, anInt5556, i)) {
                class64_sub3_211_.aClass123_5620
                        = class64_sub3_213_.aClass123_5620;
                if (bool_214_)
                    class64_sub3_211_.aByte5581 |= 0x8;
                class64_sub3_211_.aClass123_5620.anInterface2_1811
                        = aClass123_5620.anInterface2_1811;
                class64_sub3_211_.aClass123_5620.aByte1812
                        = aClass123_5620.aByte1812;
            } else if (Class137.method1163(anInt5556, (byte) -60, i))
                class64_sub3_211_.aClass123_5620 = aClass123_5620;
            else
                class64_sub3_211_.aClass123_5620 = null;
            if (Class314_Sub1.method2352(-19, anInt5556, i)) {
                if (class64_sub3_213_.aShortArray5592 != null
                        && (anInt5632 <= class64_sub3_213_.aShortArray5592.length)) {
                    class64_sub3_211_.aShortArray5579
                            = class64_sub3_213_.aShortArray5579;
                    class64_sub3_211_.aShortArray5592
                            = class64_sub3_213_.aShortArray5592;
                    class64_sub3_211_.aShortArray5566
                            = class64_sub3_213_.aShortArray5566;
                } else {
                    int i_228_ = anInt5632;
                    class64_sub3_211_.aShortArray5566
                            = class64_sub3_213_.aShortArray5566
                            = new short[i_228_];
                    class64_sub3_211_.aShortArray5592
                            = class64_sub3_213_.aShortArray5592
                            = new short[i_228_];
                    class64_sub3_211_.aShortArray5579
                            = class64_sub3_213_.aShortArray5579
                            = new short[i_228_];
                }
                for (int i_229_ = 0;
					 anInt5632 > i_229_;
                     i_229_++) {
                    class64_sub3_211_.aShortArray5592[i_229_]
                            = aShortArray5592[i_229_];
                    class64_sub3_211_.aShortArray5579[i_229_]
                            = aShortArray5579[i_229_];
                    class64_sub3_211_.aShortArray5566[i_229_]
                            = aShortArray5566[i_229_];
                }
            } else {
                class64_sub3_211_.aShortArray5566 = aShortArray5566;
                class64_sub3_211_.aShortArray5579 = aShortArray5579;
                class64_sub3_211_.aShortArray5592 = aShortArray5592;
            }
			if (Class69.method723(i, anInt5556, (byte) -70)) {
                if (bool_214_)
                    class64_sub3_211_.aByte5581 |= 0x10;
                class64_sub3_211_.aClass270_5575
                        = class64_sub3_213_.aClass270_5575;
                class64_sub3_211_.aClass270_5575.anInterface8_3463
                        = aClass270_5575.anInterface8_3463;
            } else if (!Class156.method1238(i, anInt5556, -93))
                class64_sub3_211_.aClass270_5575 = null;
            else
                class64_sub3_211_.aClass270_5575 = aClass270_5575;
            if (Class230.method1637(anInt5556, 32768, i)) {
                if (class64_sub3_213_.aShortArray5601 == null
                        || class64_sub3_213_.aShortArray5601.length < anInt5632) {
                    int i_230_ = anInt5632;
                    class64_sub3_211_.aShortArray5601
                            = class64_sub3_213_.aShortArray5601
                            = new short[i_230_];
                } else
                    class64_sub3_211_.aShortArray5601
                            = class64_sub3_213_.aShortArray5601;
                for (int i_231_ = 0; anInt5632 > i_231_; i_231_++)
                    class64_sub3_211_.aShortArray5601[i_231_]
                            = aShortArray5601[i_231_];
            } else class64_sub3_211_.aShortArray5601 = aShortArray5601;
			if (Class219.method1599((byte) -113, i, anInt5556)) {
                if (class64_sub3_213_.aClass48Array5596 != null
                        && (class64_sub3_213_.aClass48Array5596.length >= anInt5536)) {
                    class64_sub3_211_.aClass48Array5596
                            = class64_sub3_213_.aClass48Array5596;
                    for (int i_232_ = 0; i_232_ < anInt5536; i_232_++)
                        class64_sub3_211_.aClass48Array5596[i_232_]
                                .method451(aClass48Array5596[i_232_], (byte) -110);
                } else {
                    int i_233_ = anInt5536;
                    class64_sub3_211_.aClass48Array5596
                            = class64_sub3_213_.aClass48Array5596
                            = new Class48[i_233_];
                    for (int i_234_ = 0; anInt5536 > i_234_; i_234_++)
                        class64_sub3_211_.aClass48Array5596[i_234_]
                                = aClass48Array5596[i_234_].method452(true);
                }
            } else
                class64_sub3_211_.aClass48Array5596 = aClass48Array5596;
            class64_sub3_211_.anIntArray5528 = anIntArray5528;
            class64_sub3_211_.aClass342Array5541 = aClass342Array5541;
            class64_sub3_211_.anIntArray5626 = anIntArray5626;
            if (aBoolean5527) {
                class64_sub3_211_.aShort5540 = aShort5540;
                class64_sub3_211_.aShort5559 = aShort5559;
                class64_sub3_211_.aShort5617 = aShort5617;
                class64_sub3_211_.aShort5586 = aShort5586;
                class64_sub3_211_.aShort5629 = aShort5629;
                class64_sub3_211_.aShort5591 = aShort5591;
                class64_sub3_211_.aBoolean5527 = true;
                class64_sub3_211_.aShort5634 = aShort5634;
                class64_sub3_211_.aShort5646 = aShort5646;
            } else class64_sub3_211_.aBoolean5527 = false;
			class64_sub3_211_.aClass118Array5621 = aClass118Array5621;
            class64_sub3_211_.aShortArray5608 = aShortArray5608;
            class64_sub3_211_.anIntArrayArray5539 = anIntArrayArray5539;
            class64_sub3_211_.aShortArray5649 = aShortArray5649;
            class64_sub3_211_.anIntArrayArray5553 = anIntArrayArray5553;
            class64_sub3_211_.aShortArray5573 = aShortArray5573;
            class64_sub3_211_.anIntArrayArray5627 = anIntArrayArray5627;
            class64_sub3_211_.aClass129Array5640 = aClass129Array5640;
            return class64_sub3_211_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.K("
                            + (class64_sub3_211_ != null
                            ? "{...}" : "null")
                            + ',' + i + ',' + i_212_ + ','
                            + bool + ','
                            + (class64_sub3_213_ != null
                            ? "{...}" : "null")
                            + ',' + bool_214_ + ')'));
        }
    }

    final void LA(int i) {
        if (aClass123_5610 != null)
            aClass123_5610.anInterface2_1811 = null;
        anInt5623++;
        aShort5645 = (short) i;
        if (aClass123_5563 != null)
            aClass123_5563.anInterface2_1811 = null;
    }

    final void wa() {
        for (int i = 0; i < anInt5642; i++) {
            anIntArray5543[i] = 7 + anIntArray5543[i] >> -543272860;
            anIntArray5593[i] = 7 + anIntArray5593[i] >> -904992892;
            anIntArray5644[i] = anIntArray5644[i] - -7 >> -863411356;
        }
        anInt5585++;
        if (aClass123_5605 != null)
            aClass123_5605.anInterface2_1811 = null;
        aBoolean5527 = false;
    }

    final void method608(Class101 class101, Class318_Sub3 class318_sub3, int i,
                         int i_235_) {
        try {
            anInt5639++;
            if (anInt5529 != 0) {
                Class101_Sub3 class101_sub3
                        = aHa_Sub2_5598.aClass101_Sub3_7760;
                Class101_Sub3 class101_sub3_236_ = (Class101_Sub3) class101;
                if (!aBoolean5527)
                    method692((byte) -123);
                Class320.aFloat3994
                        = ((class101_sub3_236_.aFloat5750
                        * class101_sub3.aFloat5756)
                        + (class101_sub3.aFloat5754
                        * class101_sub3_236_.aFloat5769)
                        + (class101_sub3.aFloat5784
                        * class101_sub3_236_.aFloat5754));
                Class49.aFloat4720
                        = ((class101_sub3_236_.aFloat5751
                        * class101_sub3.aFloat5784)
                        + ((class101_sub3.aFloat5756
                        * class101_sub3_236_.aFloat5747)
                        + (class101_sub3_236_.aFloat5772
                        * class101_sub3.aFloat5754))
                        + class101_sub3.aFloat5751);
                float f = (Class49.aFloat4720
                        + Class320.aFloat3994 * (float) aShort5591);
                float f_237_ = (Class320.aFloat3994 * (float) aShort5629
                        + Class49.aFloat4720);
                float f_238_;
                float f_239_;
                if (f > f_237_) {
                    f_238_ = f + (float) aShort5634;
                    f_239_ = (float) -aShort5634 + f_237_;
                } else {
                    f_238_ = (float) aShort5634 + f_237_;
                    f_239_ = f - (float) aShort5634;
                }
				if (!(f_239_ >= aHa_Sub2_5598.aFloat7875)
                        && !((float) aHa_Sub2_5598.anInt7826
                        >= f_238_)) {
                    Class299_Sub1_Sub1.aFloat8696
                            = ((class101_sub3.aFloat5781
                            * class101_sub3_236_.aFloat5754)
                            + ((class101_sub3_236_.aFloat5769
                            * class101_sub3.aFloat5750)
                            + ((class101_sub3_236_
                            .aFloat5750)
                            * (class101_sub3
                            .aFloat5770))));
                    Class190.aFloat2555
                            = ((class101_sub3.aFloat5781
                            * class101_sub3_236_.aFloat5751)
                            + ((class101_sub3_236_.aFloat5772
                            * class101_sub3.aFloat5750)
                            + (class101_sub3.aFloat5770
                            * (class101_sub3_236_
                            .aFloat5747)))
                            + class101_sub3.aFloat5747);
                    float f_240_ = (Class190.aFloat2555
                            + ((float) aShort5591
                            * Class299_Sub1_Sub1.aFloat8696));
                    float f_241_ = (Class190.aFloat2555
                            + ((float) aShort5629
                            * Class299_Sub1_Sub1.aFloat8696));
                    float f_242_;
                    float f_243_;
                    if (f_240_ > f_241_) {
                        f_242_ = ((float) aHa_Sub2_5598.anInt7771
                                * (f_240_ + (float) aShort5634));
                        f_243_ = ((float) aHa_Sub2_5598.anInt7771
                                * (f_241_ - (float) aShort5634));
                    } else {
                        f_243_ = ((float) aHa_Sub2_5598.anInt7771
                                * ((float) -aShort5634 + f_240_));
                        f_242_ = ((float) aHa_Sub2_5598.anInt7771
                                * (f_241_ + (float) aShort5634));
                    }
					if (!(aHa_Sub2_5598.aFloat7835
                            <= f_243_ / (float) i)
                            && !(f_242_ / (float) i
                            <= aHa_Sub2_5598.aFloat7872)) {
                        Class252.aFloat3242
                                = ((class101_sub3.aFloat5769
                                * (class101_sub3_236_
                                .aFloat5769))
                                + ((class101_sub3_236_
                                .aFloat5750)
                                * class101_sub3.aFloat5761)
                                + ((class101_sub3_236_
                                .aFloat5754)
                                * (class101_sub3
                                .aFloat5762)));
                        Class156.aFloat2111
                                = (class101_sub3.aFloat5772
                                + ((class101_sub3.aFloat5762
                                * (class101_sub3_236_
                                .aFloat5751))
                                + (((class101_sub3
                                .aFloat5769)
                                * (class101_sub3_236_
                                .aFloat5772))
                                + ((class101_sub3
                                .aFloat5761)
                                * (class101_sub3_236_
                                .aFloat5747)))));
                        float f_244_
                                = (Class252.aFloat3242 * (float) aShort5591
                                + Class156.aFloat2111);
                        float f_245_
                                = (Class156.aFloat2111
                                + (float) aShort5629 * Class252.aFloat3242);
                        float f_246_;
                        float f_247_;
                        if (f_245_ < f_244_) {
                            f_247_ = (((float) -aShort5634 + f_245_)
                                    * (float) (aHa_Sub2_5598
                                    .anInt7794));
                            f_246_
                                    = ((float) aHa_Sub2_5598.anInt7794
                                    * ((float) aShort5634 + f_244_));
                        } else {
                            f_246_
                                    = ((float) aHa_Sub2_5598.anInt7794
                                    * (f_245_ + (float) aShort5634));
                            f_247_
                                    = ((float) aHa_Sub2_5598.anInt7794
                                    * (f_244_ - (float) aShort5634));
                        }
                        if (!(f_247_ / (float) i
                                >= aHa_Sub2_5598.aFloat7830)
                                && !(aHa_Sub2_5598.aFloat7836
                                >= f_246_ / (float) i)) {
                            if (class318_sub3 != null
                                    || aClass118Array5621 != null) {
                                Class314.aFloat3943
                                        = (((class101_sub3_236_
                                        .aFloat5770)
                                        * (class101_sub3
                                        .aFloat5761))
                                        + ((class101_sub3
                                        .aFloat5769)
                                        * class101_sub3_236_.aFloat5761)
                                        + ((class101_sub3_236_
                                        .aFloat5756)
                                        * (class101_sub3
                                        .aFloat5762)));
                                Class313.aFloat3935
                                        = (((class101_sub3
                                        .aFloat5781)
                                        * (class101_sub3_236_
                                        .aFloat5784))
                                        + ((class101_sub3_236_.aFloat5781
                                        * (class101_sub3
                                        .aFloat5770))
                                        + ((class101_sub3
                                        .aFloat5750)
                                        * (class101_sub3_236_
                                        .aFloat5762))));
                                Class318_Sub9_Sub1.aFloat8784
                                        = (((class101_sub3
                                        .aFloat5784)
                                        * (class101_sub3_236_
                                        .aFloat5756))
                                        + ((class101_sub3_236_.aFloat5770
                                        * (class101_sub3
                                        .aFloat5756))
                                        + ((class101_sub3
                                        .aFloat5754)
                                        * (class101_sub3_236_
                                        .aFloat5761))));
                                Class215.aFloat2836
                                        = (((class101_sub3_236_
                                        .aFloat5762)
                                        * (class101_sub3
                                        .aFloat5769))
                                        + ((class101_sub3_236_
                                        .aFloat5781)
                                        * (class101_sub3
                                        .aFloat5761))
                                        + ((class101_sub3
                                        .aFloat5762)
                                        * class101_sub3_236_.aFloat5784));
                                Class286_Sub8.aFloat6304
                                        = (((class101_sub3
                                        .aFloat5784)
                                        * (class101_sub3_236_
                                        .aFloat5784))
                                        + ((class101_sub3_236_.aFloat5762
                                        * (class101_sub3
                                        .aFloat5754))
                                        + (class101_sub3_236_.aFloat5781
                                        * (class101_sub3
                                        .aFloat5756))));
                                Class167.aFloat2203
                                        = (((class101_sub3_236_
                                        .aFloat5756)
                                        * (class101_sub3
                                        .aFloat5781))
                                        + ((class101_sub3_236_.aFloat5761
                                        * (class101_sub3
                                        .aFloat5750))
                                        + (class101_sub3_236_.aFloat5770
                                        * (class101_sub3
                                        .aFloat5770))));
                            }
                            if (class318_sub3 != null) {
                                int i_248_
                                        = aShort5586 + aShort5540 >> 1492058945;
                                int i_249_
                                        = aShort5617 + aShort5646 >> 55862785;
                                int i_250_
                                        = (int) (((float) aShort5591
                                        * Class299_Sub1_Sub1.aFloat8696)
                                        + (((float) i_248_
                                        * Class167.aFloat2203)
                                        + Class190.aFloat2555)
                                        + (Class313.aFloat3935
                                        * (float) i_249_));
                                int i_251_ = (int) (Class156.aFloat2111
                                        + ((float) i_248_
                                        * Class314.aFloat3943)
                                        + (Class252.aFloat3242
                                        * (float) aShort5591)
                                        + (Class215.aFloat2836
                                        * (float) i_249_));
                                int i_252_ = (int) (Class49.aFloat4720
                                        + ((float) i_248_
                                        * (Class318_Sub9_Sub1
                                        .aFloat8784))
                                        + (Class320.aFloat3994
                                        * (float) aShort5591)
                                        + (Class286_Sub8.aFloat6304
                                        * (float) i_249_));
                                int i_253_
                                        = (int) ((Class313.aFloat3935
                                        * (float) i_249_)
                                        + ((Class299_Sub1_Sub1.aFloat8696
                                        * (float) aShort5629)
                                        + (Class190.aFloat2555
                                        + (Class167.aFloat2203
                                        * (float) i_248_))));
                                int i_254_ = (int) (Class156.aFloat2111
                                        + (Class314.aFloat3943
                                        * (float) i_248_)
                                        + (Class252.aFloat3242
                                        * (float) aShort5629)
                                        + ((float) i_249_
                                        * Class215.aFloat2836));
                                class318_sub3.anInt6405
                                        = (aHa_Sub2_5598.anInt7853
                                        - -(i_250_ * (aHa_Sub2_5598
                                        .anInt7771) / i));
                                class318_sub3.anInt6402
                                        = ((i_251_
                                        * aHa_Sub2_5598.anInt7794
                                        / i)
                                        + aHa_Sub2_5598.anInt7810);
                                class318_sub3.anInt6404
                                        = (aHa_Sub2_5598.anInt7810
                                        + (i_254_
                                        * aHa_Sub2_5598.anInt7794
                                        / i));
                                int i_255_
                                        = (int) (((float) i_249_
                                        * Class286_Sub8.aFloat6304)
                                        + ((Class320.aFloat3994
                                        * (float) aShort5629)
                                        + (((Class318_Sub9_Sub1
                                        .aFloat8784)
                                        * (float) i_248_)
                                        + Class49.aFloat4720)));
                                class318_sub3.anInt6406
                                        = (aHa_Sub2_5598.anInt7853
                                        + (i_253_
                                        * aHa_Sub2_5598.anInt7771
                                        / i));
                                if (i_252_ >= aHa_Sub2_5598.anInt7826
                                        || i_255_ >= (aHa_Sub2_5598
                                        .anInt7826)) {
                                    class318_sub3
                                            .aBoolean6401
                                            = true;
                                    class318_sub3.anInt6403
                                            = (-(class318_sub3
                                            .anInt6405)
                                            + ((aHa_Sub2_5598
                                            .anInt7853)
                                            + ((aHa_Sub2_5598
                                            .anInt7771)
                                            * (aShort5634 + i_250_)
                                            / i)));
                                }
                            }
                            aHa_Sub2_5598.method3789((byte) -122, (float) i);
                            aHa_Sub2_5598.method3760(1);
                            aHa_Sub2_5598.method3758(false,
                                    class101_sub3_236_);
                            method677((byte) 127);
                            aHa_Sub2_5598.method3734(true);
                            method682(true);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.Q("
                            + (class101 != null ? "{...}"
                            : "null")
                            + ','
                            + (class318_sub3 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_235_ + ')'));
        }
    }

    final int da() {
        anInt5636++;
        return aShort5645;
    }

    final boolean NA() {
        anInt5643++;
        if (anIntArrayArray5539 == null)
            return false;
        for (int i = 0; i < anInt5642; i++) {
            anIntArray5543[i] <<= 4;
            anIntArray5593[i] <<= 4;
            anIntArray5644[i] <<= 4;
        }
        Class221.anInt2880 = 0;
        za.anInt7275 = 0;
        Class181.anInt2398 = 0;
        return true;
    }

    final int RA() {
        if (!aBoolean5527)
            method692((byte) -123);
        anInt5587++;
        return aShort5586;
    }

    final int G() {
        anInt5631++;
        if (!aBoolean5527)
            method692((byte) -123);
        return aShort5646;
    }

    final void p(int i, int i_256_, s var_s, s var_s_257_, int i_258_,
                 int i_259_, int i_260_) {
        do {
            try {
                anInt5532++;
                if (!aBoolean5527)
                    method692((byte) -123);
                int i_261_ = aShort5540 + i_258_;
                int i_262_ = i_258_ - -aShort5586;
                int i_263_ = i_260_ - -aShort5617;
                int i_264_ = aShort5646 + i_260_;
                if ((i != 1 && i != 2 && i != 3
                        && i != 5)
                        || (i_261_ >= 0
                        && (var_s.anInt4587
                        > (var_s.anInt4592 + i_262_
                        >> var_s.anInt4588))
                        && i_263_ >= 0
                        && (var_s.anInt4590
                        > (i_264_ - -var_s.anInt4592
                        >> var_s.anInt4588)))) {
                    if (i != 4 && i != 5) {
                        i_261_ >>= var_s.anInt4588;
                        i_262_ = (i_262_ - -var_s.anInt4592 - 1
                                >> var_s.anInt4588);
                        i_263_ >>= var_s.anInt4588;
                        i_264_ = (i_264_ + var_s.anInt4592 + -1
                                >> var_s.anInt4588);
                        if (i_259_ == var_s.method3982((byte) -86, i_263_, i_261_)
                                && i_259_ == var_s.method3982((byte) -86, i_263_, i_262_)
                                && i_259_ == var_s.method3982((byte) -86, i_264_,
                                i_261_)
                                && (var_s.method3982((byte) -86, i_264_,
								i_262_) == i_259_))
                            break;
                    } else if (var_s_257_ == null
                            || (i_261_ < 0
                            || (((i_262_
							- -var_s_257_.anInt4592)
							>> var_s_257_.anInt4588) >= var_s_257_.anInt4587)
                            || i_263_ < 0
                            || (var_s_257_.anInt4590
                            <= (var_s_257_.anInt4592 + i_264_
                            >> var_s_257_.anInt4588))))
                        break;
                    if (i == 1) {
                        for (int i_265_ = 0; i_265_ < anInt5557; i_265_++)
                            anIntArray5593[i_265_]
                                    = (-i_259_ + anIntArray5593[i_265_]
                                    + var_s.method3986((anIntArray5543[i_265_]
                                            + i_258_),
                                    i_260_ + (anIntArray5644
                                            [i_265_]),
                                    (byte) -93));
                    } else if (i == 2) {
                        int i_279_ = aShort5591;
                        if (i_279_ == 0)
                            break;
                        for (int i_280_ = 0; anInt5557 > i_280_; i_280_++) {
                            int i_281_
                                    = ((anIntArray5593[i_280_] << -677349360)
                                    / i_279_);
                            if (i_281_ < i_256_)
                                anIntArray5593[i_280_]
                                        = (anIntArray5593[i_280_]
                                        - -((-i_259_
                                        + (var_s.method3986
                                        ((anIntArray5543[i_280_]
                                                        - -i_258_),
                                                (i_260_
                                                        + anIntArray5644[i_280_]),
                                                (byte) -94)))
                                        * (-i_281_ + i_256_) / i_256_));
                        }
                    } else {
                        if (i == 3) {
                            int i_266_ = (0xff & i_256_) * 4;
                            int i_267_ = 4 * ((0xff0e & i_256_) >> 868096648);
                            int i_268_
                                    = 0x3fc0 & i_256_ >> 903606352 << -1374367962;
                            int i_269_
                                    = (0xff & i_256_ >> 2096473112) << 2050264870;
                            if (i_258_ + -(i_266_ >> 1400445505) < 0
                                    || (((i_266_ >> 96965825)
                                    + (i_258_ - -var_s.anInt4592))
                                    >= (var_s.anInt4587
                                    << var_s.anInt4588))
                                    || -(i_267_ >> -1445996511) + i_260_ < 0
                                    || ((var_s.anInt4590
									<< var_s.anInt4588) <= ((i_267_ >> -295450847) + i_260_
									+ var_s.anInt4592)))
                                break;
                            this.method626(i_266_, 10947, i_269_, i_258_,
                                    i_267_, i_259_, i_268_, var_s,
                                    i_260_);
                        } else if (i == 4) {
                            int i_277_ = aShort5629 - aShort5591;
                            for (int i_278_ = 0; anInt5557 > i_278_; i_278_++)
                                anIntArray5593[i_278_]
                                        = (anIntArray5593[i_278_]
                                        - (-(var_s_257_.method3986
                                        (anIntArray5543[i_278_] + i_258_,
                                                anIntArray5644[i_278_] + i_260_,
                                                (byte) 71))
                                        - -i_259_ - i_277_));
                        } else {
                            if (i == 5) {
                                int i_270_ = -aShort5591 + aShort5629;
                                for (int i_271_ = 0; anInt5557 > i_271_;
                                     i_271_++) {
                                    int i_272_
                                            = anIntArray5543[i_271_] + i_258_;
                                    int i_273_
                                            = anIntArray5644[i_271_] + i_260_;
                                    int i_274_
                                            = var_s.method3986(i_272_, i_273_,
                                            (byte) -100);
                                    int i_275_
                                            = var_s_257_.method3986(i_272_, i_273_,
                                            (byte) 93);
                                    int i_276_ = -i_256_ + i_274_ + -i_275_;
                                    anIntArray5593[i_271_]
                                            = i_274_ + (-i_259_
                                            + (((anIntArray5593[i_271_]
                                            << 1328901672)
                                            / i_270_ * i_276_)
                                            >> 70889512));
                                }
                            }
                        }
					}
					aBoolean5527 = false;
                    if (aClass123_5605 == null)
                        break;
                    aClass123_5605.anInterface2_1811 = null;
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("paa.p(" + i + ',' + i_256_
                                + ','
                                + (var_s != null ? "{...}"
                                : "null")
                                + ','
                                + (var_s_257_ != null
                                ? "{...}" : "null")
                                + ',' + i_258_ + ',' + i_259_
                                + ',' + i_260_ + ')'));
            }
            break;
        } while (false);
    }

    static final void method687(byte i, int i_282_) {
        int i_283_ = 113 / ((-63 - i) / 53);
        anInt5570++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(i_282_, (byte) 105, 5);
        class348_sub42_sub15.method3251(-16058);
    }

    final void aa(short i, short i_284_) {
        anInt5590++;
        d var_d = aHa_Sub2_5598.aD4579;
        for (int i_285_ = 0; i_285_ < anInt5632; i_285_++) {
            if (aShortArray5601[i_285_] == i)
                aShortArray5601[i_285_] = i_284_;
        }
        byte i_286_ = 0;
        byte i_287_ = 0;
        if (i != -1) {
            Class12 class12 = var_d.method3(0xffff & i, -6662);
            i_287_ = class12.aByte216;
            i_286_ = class12.aByte201;
        }
        byte i_288_ = 0;
        byte i_289_ = 0;
        if (i_284_ != -1) {
            Class12 class12 = var_d.method3(i_284_ & 0xffff, -6662);
            if (class12.aByte198 != 0
                    || class12.aByte211 != 0)
                aBoolean5638 = true;
            i_288_ = class12.aByte201;
            i_289_ = class12.aByte216;
        }
        if (i_287_ != i_289_
                | i_286_ != i_288_) {
            if (aClass118Array5621 != null) {
                for (int i_290_ = 0; i_290_ < anInt5536; i_290_++) {
                    Class118 class118 = aClass118Array5621[i_290_];
                    Class48 class48 = aClass48Array5596[i_290_];
                    class48.anInt858
                            = ((0xffffff
                            & (Class10.anIntArray179
                            [0xffff & (aShortArray5580
                            [class118.anInt1783])]))
                            | class48.anInt858 & ~0xffffff);
                }
            }
            if (aClass123_5610 != null)
                aClass123_5610.anInterface2_1811 = null;
        }
    }

    private final void method688(int i, boolean bool) {
        anInt5588++;
        boolean bool_291_
                = (aClass123_5610 != null
                && aClass123_5610.anInterface2_1811 == null);
        boolean bool_292_
                = (aClass123_5563 != null
                && aClass123_5563.anInterface2_1811 == null);
        boolean bool_293_
                = (aClass123_5605 != null
                && aClass123_5605.anInterface2_1811 == null);
        boolean bool_294_
                = (aClass123_5620 != null
                && aClass123_5620.anInterface2_1811 == null);
        if (bool) {
            bool_294_ = bool_294_ & (aByte5581 & 0x8) != 0;
            bool_292_ = bool_292_ & (aByte5581 & 0x4) != 0;
            bool_291_ = bool_291_ & (0x2 & aByte5581) != 0;
            bool_293_ = bool_293_ & (0x1 & aByte5581) != 0;
        }
        byte i_295_ = 0;
        if (i == 5) {
            byte i_296_ = 0;
            byte i_297_ = 0;
            byte i_298_ = 0;
            if (bool_293_) {
                i_296_ = i_295_;
                i_295_ += 12;
            }
            byte i_299_ = 0;
            if (bool_291_) {
                i_297_ = i_295_;
                i_295_ += 4;
            }
            if (bool_292_) {
                i_298_ = i_295_;
                i_295_ += 12;
            }
            if (bool_294_) {
                i_299_ = i_295_;
                i_295_ += 8;
            }
            if (i_295_ != 0) {
                if (anInt5529 * i_295_ > (aHa_Sub2_5598.aClass348_Sub49_Sub1_7798
						.aByteArray7154).length)
                    aHa_Sub2_5598.aClass348_Sub49_Sub1_7798
                            = new Class348_Sub49_Sub1(i_295_ * (100 + anInt5529));
                else
                    aHa_Sub2_5598
                            .aClass348_Sub49_Sub1_7798.anInt7197
                            = 0;
                Class348_Sub49_Sub1 class348_sub49_sub1
                        = aHa_Sub2_5598.aClass348_Sub49_Sub1_7798;
                if (bool_293_) {
                    if (aHa_Sub2_5598.aBoolean7775) {
                        for (int i_300_ = 0;
							 anInt5557 > i_300_;
                             i_300_++) {
                            int i_301_ = (Stream.floatToRawIntBits
                                    ((float) anIntArray5543[i_300_]));
                            int i_302_ = (Stream.floatToRawIntBits
                                    ((float) anIntArray5593[i_300_]));
                            int i_303_ = (Stream.floatToRawIntBits
                                    ((float) anIntArray5644[i_300_]));
                            int i_304_ = anIntArray5528[i_300_];
                            int i_305_ = anIntArray5528[i_300_ - -1];
                            for (int i_306_ = i_304_; i_306_ < i_305_;
                                 i_306_++) {
                                int i_307_ = -1 + aShortArray5649[i_306_];
                                if (i_307_ == -1)
                                    break;
                                class348_sub49_sub1
                                        .anInt7197
                                        = i_295_ * i_307_;
                                class348_sub49_sub1.method3391((byte) 111,
                                        i_301_);
                                class348_sub49_sub1.method3391((byte) 109,
                                        i_302_);
                                class348_sub49_sub1.method3391((byte) 116,
                                        i_303_);
                            }
                        }
                    } else {
                        for (int i_308_ = 0; anInt5557 > i_308_; i_308_++) {
                            int i_309_ = (Stream.floatToRawIntBits
                                    ((float) anIntArray5543[i_308_]));
                            int i_310_ = (Stream.floatToRawIntBits
                                    ((float) anIntArray5593[i_308_]));
                            int i_311_ = (Stream.floatToRawIntBits
                                    ((float) anIntArray5644[i_308_]));
                            int i_312_ = anIntArray5528[i_308_];
                            int i_313_ = anIntArray5528[1 + i_308_];
                            for (int i_314_ = i_312_; i_314_ < i_313_;
                                 i_314_++) {
                                int i_315_ = -1 + aShortArray5649[i_314_];
                                if (i_315_ == -1)
                                    break;
                                class348_sub49_sub1
                                        .anInt7197
                                        = i_295_ * i_315_;
                                class348_sub49_sub1.method3394(-23892, i_309_);
                                class348_sub49_sub1.method3394(i + -23897,
                                        i_310_);
                                class348_sub49_sub1.method3394(-23892, i_311_);
                            }
                        }
                    }
                }
                if (bool_291_) {
                    if (aClass123_5563 == null) {
                        short[] is;
                        byte[] is_316_;
                        short[] is_317_;
                        short[] is_318_;
                        if (aClass139_5572 == null) {
                            is = aShortArray5576;
                            is_316_ = aByteArray5594;
                            is_317_ = aShortArray5583;
                            is_318_ = aShortArray5564;
                        } else {
                            is_318_
                                    = aClass139_5572.aShortArray1954;
                            is = aClass139_5572.aShortArray1953;
                            is_317_
                                    = aClass139_5572.aShortArray1951;
                            is_316_
                                    = aClass139_5572.aByteArray1948;
                        }
						float f = aHa_Sub2_5598.aFloatArray7825[0];
                        float f_319_
                                = aHa_Sub2_5598.aFloatArray7825[1];
                        float f_320_
                                = aHa_Sub2_5598.aFloatArray7825[2];
                        float f_321_ = aHa_Sub2_5598.aFloat7768;
                        float f_322_ = (aHa_Sub2_5598.aFloat7832
                                * 768.0F / (float) aShort5645);
                        float f_323_ = (aHa_Sub2_5598.aFloat7871
                                * 768.0F / (float) aShort5645);
                        for (int i_324_ = 0; anInt5632 > i_324_; i_324_++) {
                            int i_325_ = method680(19995, aShort5544,
                                    aByteArray5542[i_324_],
                                    aShortArray5601[i_324_],
                                    aShortArray5580[i_324_]);
                            float f_326_
                                    = (aHa_Sub2_5598.aFloat7781
                                    * (float) (i_325_ >>> 1893072216));
                            float f_327_
                                    = ((float) (0xff & i_325_ >> -934101304)
                                    * aHa_Sub2_5598.aFloat7823);
                            float f_328_
                                    = ((float) ((0xff88e4 & i_325_) >> 1887530576)
                                    * aHa_Sub2_5598.aFloat7816);
                            int i_329_ = aShortArray5592[i_324_];
                            short i_330_ = is_316_[i_329_];
                            float f_331_;
                            if (i_330_ != 0)
                                f_331_ = ((f_319_ * (float) is_317_[i_329_]
                                        + f * (float) is_318_[i_329_]
                                        + f_320_ * (float) is[i_329_])
                                        / (float) (256 * i_330_));
                            else
                                f_331_ = (0.0026041667F
                                        * ((float) is[i_329_] * f_320_
                                        + (f * (float) is_318_[i_329_]
                                        + ((float) is_317_[i_329_]
                                        * f_319_))));
                            float f_332_
                                    = f_321_ + f_331_ * (!(f_331_ < 0.0F) ? f_322_
                                    : f_323_);
                            int i_333_ = (int) (f_332_ * f_326_);
                            int i_334_ = (int) (f_332_ * f_328_);
                            if (i_333_ >= 0) {
                                if (i_333_ > 255)
                                    i_333_ = 255;
                            } else
                                i_333_ = 0;
                            int i_335_ = (int) (f_332_ * f_327_);
                            if (i_334_ >= 0) {
                                if (i_334_ > 255)
                                    i_334_ = 255;
                            } else
                                i_334_ = 0;
                            class348_sub49_sub1.anInt7197
                                    = i_329_ * i_295_ + i_297_;
                            if (i_335_ < 0)
                                i_335_ = 0;
                            else if (i_335_ > 255)
                                i_335_ = 255;
                            class348_sub49_sub1.method3378(false, i_333_);
                            class348_sub49_sub1.method3378(false, i_334_);
                            class348_sub49_sub1.method3378(false, i_335_);
                            class348_sub49_sub1.method3378(false,
                                    (255
                                            + -((aByteArray5542
                                            [i_324_])
                                            & 0xff)));
                            i_329_ = aShortArray5579[i_324_];
                            i_330_ = is_316_[i_329_];
                            if (i_330_ != 0)
                                f_331_
                                        = (((float) is[i_329_] * f_320_
                                        + (f * (float) is_318_[i_329_]
                                        + (float) is_317_[i_329_] * f_319_))
                                        / (float) (i_330_ * 256));
                            else
                                f_331_ = ((f * (float) is_318_[i_329_]
                                        + (float) is_317_[i_329_] * f_319_
                                        + f_320_ * (float) is[i_329_])
                                        * 0.0026041667F);
                            f_332_ = f_321_ + f_331_ * (f_331_ < 0.0F ? f_323_
                                    : f_322_);
                            i_333_ = (int) (f_326_ * f_332_);
                            i_334_ = (int) (f_332_ * f_328_);
                            if (i_333_ < 0)
                                i_333_ = 0;
                            else if (i_333_ > 255)
                                i_333_ = 255;
                            if (i_334_ < 0)
                                i_334_ = 0;
                            else if (i_334_ > 255)
                                i_334_ = 255;
                            i_335_ = (int) (f_332_ * f_327_);
                            class348_sub49_sub1.anInt7197
                                    = i_297_ - -(i_329_ * i_295_);
                            if (i_335_ < 0)
                                i_335_ = 0;
                            else if (i_335_ > 255)
                                i_335_ = 255;
                            class348_sub49_sub1.method3378(false, i_333_);
                            class348_sub49_sub1.method3378(false, i_334_);
                            class348_sub49_sub1.method3378(false, i_335_);
                            class348_sub49_sub1.method3378
                                    (false, 255 - (aByteArray5542[i_324_] & 0xff));
                            i_329_ = aShortArray5566[i_324_];
                            i_330_ = is_316_[i_329_];
                            if (i_330_ != 0)
                                f_331_ = (((float) is[i_329_] * f_320_
                                        + ((float) is_317_[i_329_] * f_319_
                                        + (float) is_318_[i_329_] * f))
                                        / (float) (256 * i_330_));
                            else
                                f_331_
                                        = (0.0026041667F
                                        * ((float) is[i_329_] * f_320_
                                        + ((float) is_317_[i_329_] * f_319_
                                        + f * (float) is_318_[i_329_])));
                            f_332_ = f_321_ + (!(f_331_ < 0.0F) ? f_322_
                                    : f_323_) * f_331_;
                            i_333_ = (int) (f_332_ * f_326_);
                            i_334_ = (int) (f_332_ * f_328_);
                            if (i_333_ >= 0) {
                                if (i_333_ > 255)
                                    i_333_ = 255;
                            } else
                                i_333_ = 0;
                            if (i_334_ >= 0) {
                                if (i_334_ > 255)
                                    i_334_ = 255;
                            } else
                                i_334_ = 0;
                            i_335_ = (int) (f_327_ * f_332_);
                            if (i_335_ >= 0) {
                                if (i_335_ > 255)
                                    i_335_ = 255;
                            } else
                                i_335_ = 0;
                            class348_sub49_sub1.anInt7197
                                    = i_295_ * i_329_ + i_297_;
                            class348_sub49_sub1.method3378(false, i_333_);
                            class348_sub49_sub1.method3378(false, i_334_);
                            class348_sub49_sub1.method3378(false, i_335_);
                            class348_sub49_sub1.method3378(false,
                                    (-(0xff
                                            & (aByteArray5542
                                            [i_324_]))
                                            + 255));
                        }
                    } else {
                        for (int i_336_ = 0; i_336_ < anInt5632; i_336_++) {
                            int i_337_ = method680(i + 19990, aShort5544,
                                    aByteArray5542[i_336_],
                                    aShortArray5601[i_336_],
                                    aShortArray5580[i_336_]);
                            class348_sub49_sub1.anInt7197
                                    = i_297_ + aShortArray5592[i_336_] * i_295_;
                            class348_sub49_sub1.method3391((byte) 105, i_337_);
                            class348_sub49_sub1.anInt7197
                                    = i_297_ - -(aShortArray5579[i_336_] * i_295_);
                            class348_sub49_sub1.method3391((byte) 87, i_337_);
                            class348_sub49_sub1.anInt7197
                                    = i_297_ - -(i_295_ * aShortArray5566[i_336_]);
                            class348_sub49_sub1.method3391((byte) 120, i_337_);
                        }
                    }
                }
                if (bool_292_) {
                    byte[] is;
                    short[] is_338_;
                    short[] is_339_;
                    short[] is_340_;
                    if (aClass139_5572 == null) {
                        is_340_ = aShortArray5564;
                        is_338_ = aShortArray5583;
                        is = aByteArray5594;
                        is_339_ = aShortArray5576;
                    } else {
                        is = aClass139_5572.aByteArray1948;
                        is_338_ = aClass139_5572.aShortArray1951;
                        is_339_ = aClass139_5572.aShortArray1953;
                        is_340_ = aClass139_5572.aShortArray1954;
                    }
                    float f = 3.0F / (float) aShort5645;
                    class348_sub49_sub1.anInt7197 = i_298_;
                    float f_341_
                            = 3.0F / (float) (aShort5645 / 2 + aShort5645);
                    if (aHa_Sub2_5598.aBoolean7775) {
                        for (int i_345_ = 0; anInt5529 > i_345_; i_345_++) {
                            int i_346_ = is[i_345_] & 0xff;
                            if (i_346_ == 0) {
                                class348_sub49_sub1.method3400
                                        (f_341_ * (float) is_340_[i_345_],
                                                (byte) -96);
                                class348_sub49_sub1.method3400
                                        ((float) is_338_[i_345_] * f_341_,
                                                (byte) -101);
                                class348_sub49_sub1.method3400
                                        (f_341_ * (float) is_339_[i_345_],
                                                (byte) -95);
                            } else {
                                float f_347_ = f / (float) i_346_;
                                class348_sub49_sub1.method3400
                                        ((float) is_340_[i_345_] * f_347_,
                                                (byte) -102);
                                class348_sub49_sub1.method3400
                                        (f_347_ * (float) is_338_[i_345_],
                                                (byte) -127);
                                class348_sub49_sub1.method3400
                                        ((float) is_339_[i_345_] * f_347_,
                                                (byte) -84);
                            }
							class348_sub49_sub1.anInt7197
                                    += -12 + i_295_;
                        }
                    } else {
                        for (int i_342_ = 0;
							 i_342_ < anInt5529;
                             i_342_++) {
                            int i_343_ = 0xff & is[i_342_];
                            if (i_343_ == 0) {
                                class348_sub49_sub1.method3399
                                        (18291, (float) is_340_[i_342_] * f_341_);
                                class348_sub49_sub1.method3399
                                        (18291, (float) is_338_[i_342_] * f_341_);
                                class348_sub49_sub1.method3399
                                        (i + 18286,
                                                f_341_ * (float) is_339_[i_342_]);
                            } else {
                                float f_344_ = f / (float) i_343_;
                                class348_sub49_sub1.method3399
                                        (i ^ 0x4776,
                                                (float) is_340_[i_342_] * f_344_);
                                class348_sub49_sub1.method3399
                                        (18291, f_344_ * (float) is_338_[i_342_]);
                                class348_sub49_sub1.method3399
                                        (18291, f_344_ * (float) is_339_[i_342_]);
                            }
							class348_sub49_sub1.anInt7197
                                    += -12 + i_295_;
                        }
                    }
				}
                if (bool_294_) {
                    class348_sub49_sub1.anInt7197 = i_299_;
                    if (aHa_Sub2_5598.aBoolean7775) {
                        for (int i_348_ = 0;
							 i_348_ < anInt5529;
                             i_348_++) {
                            class348_sub49_sub1.method3400((aFloatArray5552
                                            [i_348_]),
                                    (byte) -127);
                            class348_sub49_sub1.method3400((aFloatArray5571
                                            [i_348_]),
                                    (byte) -126);
                            class348_sub49_sub1.anInt7197
                                    += i_295_ + -8;
                        }
                    } else {
                        for (int i_349_ = 0; i_349_ < anInt5529; i_349_++) {
                            class348_sub49_sub1.method3399(i ^ 0x4776,
                                    (aFloatArray5552
                                            [i_349_]));
                            class348_sub49_sub1
                                    .method3399(18291, aFloatArray5571[i_349_]);
                            class348_sub49_sub1.anInt7197
                                    += -8 + i_295_;
                        }
                    }
                }
                class348_sub49_sub1.anInt7197
                        = anInt5529 * i_295_;
                Interface2 interface2;
                if (bool) {
                    if (anInterface2_5554 != null)
                        anInterface2_5554.method11
                                (i_295_,
                                        class348_sub49_sub1.anInt7197,
                                        (class348_sub49_sub1
                                                .aByteArray7154),
                                        -9894);
                    else
                        anInterface2_5554
                                = aHa_Sub2_5598.method3731(2, true, i_295_,
                                (class348_sub49_sub1
                                        .aByteArray7154),
                                (class348_sub49_sub1
                                        .anInt7197));
                    interface2 = anInterface2_5554;
                    aByte5581 = (byte) 0;
                } else {
                    interface2
                            = aHa_Sub2_5598.method3731(2, false, i_295_,
                            (class348_sub49_sub1
                                    .aByteArray7154),
                            (class348_sub49_sub1
                                    .anInt7197));
                    aBoolean5555 = true;
                }
                if (bool_293_) {
                    aClass123_5605.aByte1812 = i_296_;
                    aClass123_5605.anInterface2_1811 = interface2;
                }
                if (bool_294_) {
                    aClass123_5620.aByte1812 = i_299_;
                    aClass123_5620.anInterface2_1811 = interface2;
                }
                if (bool_291_) {
                    aClass123_5610.aByte1812 = i_297_;
                    aClass123_5610.anInterface2_1811 = interface2;
                }
                if (bool_292_) {
                    aClass123_5563.aByte1812 = i_298_;
                    aClass123_5563.anInterface2_1811 = interface2;
                }
            }
        }
    }

    final void method615(Class101 class101, Class318_Sub3 class318_sub3,
                         int i) {
        try {
            anInt5611++;
            if (anInt5529 != 0) {
                Class101_Sub3 class101_sub3
                        = aHa_Sub2_5598.aClass101_Sub3_7760;
                if (!aBoolean5527)
                    method692((byte) -123);
                Class101_Sub3 class101_sub3_350_ = (Class101_Sub3) class101;
                Class320.aFloat3994
                        = ((class101_sub3_350_.aFloat5754
                        * class101_sub3.aFloat5784)
                        + ((class101_sub3_350_.aFloat5750
                        * class101_sub3.aFloat5756)
                        + (class101_sub3_350_.aFloat5769
                        * class101_sub3.aFloat5754)));
                Class49.aFloat4720
                        = (class101_sub3.aFloat5751
                        + ((class101_sub3.aFloat5756
                        * class101_sub3_350_.aFloat5747)
                        + (class101_sub3_350_.aFloat5772
                        * class101_sub3.aFloat5754)
                        + (class101_sub3_350_.aFloat5751
                        * class101_sub3.aFloat5784)));
                float f = (Class49.aFloat4720
                        + Class320.aFloat3994 * (float) aShort5591);
                float f_351_ = (Class320.aFloat3994 * (float) aShort5629
                        + Class49.aFloat4720);
                float f_352_;
                float f_353_;
                if (f > f_351_) {
                    f_352_ = f_351_ - (float) aShort5634;
                    f_353_ = f + (float) aShort5634;
                } else {
                    f_352_ = (float) -aShort5634 + f;
                    f_353_ = f_351_ + (float) aShort5634;
                }
                if (!(aHa_Sub2_5598.aFloat7874 <= f_352_)
                        && !((float) aHa_Sub2_5598.anInt7826
                        >= f_353_)) {
                    Class299_Sub1_Sub1.aFloat8696
                            = ((class101_sub3.aFloat5750
                            * class101_sub3_350_.aFloat5769)
                            + (class101_sub3_350_.aFloat5750
                            * class101_sub3.aFloat5770)
                            + (class101_sub3.aFloat5781
                            * (class101_sub3_350_
                            .aFloat5754)));
                    Class190.aFloat2555
                            = (class101_sub3.aFloat5747
                            + ((class101_sub3.aFloat5781
                            * (class101_sub3_350_
                            .aFloat5751))
                            + ((class101_sub3.aFloat5770
                            * (class101_sub3_350_
                            .aFloat5747))
                            + ((class101_sub3_350_
                            .aFloat5772)
                            * (class101_sub3
                            .aFloat5750)))));
                    float f_354_
                            = ((float) aShort5591 * Class299_Sub1_Sub1.aFloat8696
                            + Class190.aFloat2555);
                    float f_355_
                            = ((float) aShort5629 * Class299_Sub1_Sub1.aFloat8696
                            + Class190.aFloat2555);
                    float f_356_;
                    float f_357_;
                    if (f_354_ > f_355_) {
                        f_356_ = ((float) aHa_Sub2_5598.anInt7771
                                * ((float) -aShort5634 + f_355_));
                        f_357_ = ((float) aHa_Sub2_5598.anInt7771
                                * ((float) aShort5634 + f_354_));
                    } else {
                        f_357_ = ((float) aHa_Sub2_5598.anInt7771
                                * (f_355_ + (float) aShort5634));
                        f_356_
                                = (((float) -aShort5634 + f_354_)
                                * (float) aHa_Sub2_5598.anInt7771);
                    }
					if (!(aHa_Sub2_5598.aFloat7835
                            <= f_356_ / f_353_)
                            && !(f_357_ / f_353_
                            <= aHa_Sub2_5598.aFloat7872)) {
                        Class156.aFloat2111
                                = ((class101_sub3_350_.aFloat5772
                                * class101_sub3.aFloat5769)
                                + ((class101_sub3_350_
                                .aFloat5747)
                                * class101_sub3.aFloat5761)
                                + (class101_sub3.aFloat5762
                                * (class101_sub3_350_
                                .aFloat5751))
                                + class101_sub3.aFloat5772);
                        Class252.aFloat3242
                                = ((class101_sub3.aFloat5761
                                * (class101_sub3_350_
                                .aFloat5750))
                                + (class101_sub3.aFloat5769
                                * (class101_sub3_350_
                                .aFloat5769))
                                + (class101_sub3.aFloat5762
                                * (class101_sub3_350_
                                .aFloat5754)));
                        float f_358_
                                = (Class156.aFloat2111
                                + Class252.aFloat3242 * (float) aShort5591);
                        float f_359_
                                = (Class156.aFloat2111
                                + (float) aShort5629 * Class252.aFloat3242);
                        float f_360_;
                        float f_361_;
                        if (f_358_ > f_359_) {
                            f_360_ = (((float) aShort5634 + f_358_)
                                    * (float) (aHa_Sub2_5598
                                    .anInt7794));
                            f_361_
                                    = ((float) aHa_Sub2_5598.anInt7794
                                    * (f_359_ - (float) aShort5634));
                        } else {
                            f_360_ = (((float) aShort5634 + f_359_)
                                    * (float) (aHa_Sub2_5598
                                    .anInt7794));
                            f_361_
                                    = ((float) aHa_Sub2_5598.anInt7794
                                    * (f_358_ - (float) aShort5634));
                        }
						if (!(f_361_ / f_353_
                                >= aHa_Sub2_5598.aFloat7830)
                                && !(aHa_Sub2_5598.aFloat7836
                                >= f_360_ / f_353_)) {
                            if (class318_sub3 != null
                                    || aClass118Array5621 != null) {
                                Class286_Sub8.aFloat6304
                                        = (((class101_sub3_350_
                                        .aFloat5762)
                                        * (class101_sub3
                                        .aFloat5754))
                                        + ((class101_sub3_350_
                                        .aFloat5781)
                                        * (class101_sub3
                                        .aFloat5756))
                                        + ((class101_sub3_350_
                                        .aFloat5784)
                                        * (class101_sub3
                                        .aFloat5784)));
                                Class318_Sub9_Sub1.aFloat8784
                                        = (((class101_sub3
                                        .aFloat5784)
                                        * (class101_sub3_350_
                                        .aFloat5756))
                                        + ((class101_sub3_350_.aFloat5770
                                        * (class101_sub3
                                        .aFloat5756))
                                        + ((class101_sub3
                                        .aFloat5754)
                                        * (class101_sub3_350_
                                        .aFloat5761))));
                                Class313.aFloat3935
                                        = (((class101_sub3
                                        .aFloat5781)
                                        * (class101_sub3_350_
                                        .aFloat5784))
                                        + ((class101_sub3_350_.aFloat5762
                                        * (class101_sub3
                                        .aFloat5750))
                                        + (class101_sub3_350_.aFloat5781
                                        * (class101_sub3
                                        .aFloat5770))));
                                Class314.aFloat3943
                                        = (((class101_sub3
                                        .aFloat5761)
                                        * (class101_sub3_350_
                                        .aFloat5770))
                                        + ((class101_sub3_350_
                                        .aFloat5761)
                                        * (class101_sub3
                                        .aFloat5769))
                                        + ((class101_sub3_350_
                                        .aFloat5756)
                                        * (class101_sub3
                                        .aFloat5762)));
                                Class167.aFloat2203
                                        = (((class101_sub3_350_
                                        .aFloat5761)
                                        * (class101_sub3
                                        .aFloat5750))
                                        + ((class101_sub3
                                        .aFloat5770)
                                        * class101_sub3_350_.aFloat5770)
                                        + ((class101_sub3
                                        .aFloat5781)
                                        * class101_sub3_350_.aFloat5756));
                                Class215.aFloat2836
                                        = (((class101_sub3_350_
                                        .aFloat5784)
                                        * (class101_sub3
                                        .aFloat5762))
                                        + (((class101_sub3
                                        .aFloat5769)
                                        * class101_sub3_350_.aFloat5762)
                                        + ((class101_sub3
                                        .aFloat5761)
                                        * (class101_sub3_350_
                                        .aFloat5781))));
                            }
                            if (class318_sub3 != null) {
                                boolean bool = false;
                                boolean bool_362_ = true;
                                int i_363_
                                        = aShort5540 - -aShort5586 >> -1340005887;
                                int i_364_
                                        = aShort5617 - -aShort5646 >> -1674565887;
                                int i_365_ = (int) (((float) i_364_
                                        * Class313.aFloat3935)
                                        + ((Class167.aFloat2203
                                        * (float) i_363_)
                                        + Class190.aFloat2555
                                        + ((float) aShort5591
                                        * (Class299_Sub1_Sub1
                                        .aFloat8696))));
                                int i_366_ = (int) (Class156.aFloat2111
                                        + ((float) i_363_
                                        * Class314.aFloat3943)
                                        + ((float) aShort5591
                                        * Class252.aFloat3242)
                                        + ((float) i_364_
                                        * Class215.aFloat2836));
                                int i_367_
                                        = (int) ((Class318_Sub9_Sub1.aFloat8784
                                        * (float) i_363_)
                                        + Class49.aFloat4720
                                        + (Class320.aFloat3994
                                        * (float) aShort5591)
                                        + (Class286_Sub8.aFloat6304
                                        * (float) i_364_));
                                if (aHa_Sub2_5598.anInt7826 <= i_367_) {
                                    class318_sub3.anInt6405
                                            = (i_365_ * (aHa_Sub2_5598
                                            .anInt7771) / i_367_
                                            + (aHa_Sub2_5598
                                            .anInt7853));
                                    class318_sub3.anInt6402
                                            = (i_366_ * (aHa_Sub2_5598
                                            .anInt7794) / i_367_
                                            + (aHa_Sub2_5598
                                            .anInt7810));
                                } else
                                    bool = true;
                                int i_368_
                                        = (int) (Class190.aFloat2555
                                        + (Class167.aFloat2203
                                        * (float) i_363_)
                                        + (Class299_Sub1_Sub1.aFloat8696
                                        * (float) aShort5629)
                                        + (Class313.aFloat3935
                                        * (float) i_364_));
                                int i_369_
                                        = (int) (((float) i_364_
                                        * Class215.aFloat2836)
                                        + ((Class252.aFloat3242
                                        * (float) aShort5629)
                                        + (Class156.aFloat2111
                                        + (Class314.aFloat3943
                                        * (float) i_363_))));
                                int i_370_
                                        = (int) ((Class286_Sub8.aFloat6304
                                        * (float) i_364_)
                                        + (((float) i_363_
                                        * (Class318_Sub9_Sub1
                                        .aFloat8784))
                                        + Class49.aFloat4720
                                        + ((float) aShort5629
                                        * Class320.aFloat3994)));
                                if (i_370_
                                        >= aHa_Sub2_5598.anInt7826) {
                                    class318_sub3.anInt6406
                                            = (i_368_ * (aHa_Sub2_5598
                                            .anInt7771) / i_370_
                                            + (aHa_Sub2_5598
                                            .anInt7853));
                                    class318_sub3.anInt6404
                                            = (i_369_ * (aHa_Sub2_5598
                                            .anInt7794) / i_370_
                                            + (aHa_Sub2_5598
                                            .anInt7810));
                                } else
                                    bool = true;
                                if (bool) {
                                    if ((aHa_Sub2_5598.anInt7826
                                            <= i_367_)
                                            || ((aHa_Sub2_5598
											.anInt7826) <= i_370_)) {
                                        if (i_367_ < (aHa_Sub2_5598
												.anInt7826)) {
                                            int i_371_
                                                    = ((-(aHa_Sub2_5598
                                                    .anInt7826) + i_370_
                                                    << -1013182224)
                                                    / (i_370_ + -i_367_));
                                            int i_372_
                                                    = (((-i_365_ + i_368_) * i_371_
                                                    >> 1581219760)
                                                    + i_368_);
                                            class318_sub3
                                                    .anInt6405
                                                    = ((aHa_Sub2_5598
                                                    .anInt7853)
                                                    - -(i_372_
                                                    * (aHa_Sub2_5598
                                                    .anInt7771)
                                                    / (aHa_Sub2_5598
                                                    .anInt7826)));
                                            int i_373_
                                                    = ((i_371_ * (i_369_ - i_366_)
                                                    >> 772203088)
                                                    + i_369_);
                                            class318_sub3
                                                    .anInt6402
                                                    = ((i_373_
                                                    * aHa_Sub2_5598.anInt7794
                                                    / (aHa_Sub2_5598
                                                    .anInt7826))
                                                    + (aHa_Sub2_5598
                                                    .anInt7810));
                                        } else if (i_370_ < (aHa_Sub2_5598
												.anInt7826)) {
                                            int i_374_
                                                    = ((-(aHa_Sub2_5598
                                                    .anInt7826) + i_367_
                                                    << -101347024)
                                                    / (i_367_ - i_370_));
                                            int i_375_
                                                    = (i_365_
                                                    - -(i_374_ * (-i_368_
                                                    + i_365_)
                                                    >> 588244880));
                                            int i_376_
                                                    = (((i_366_ - i_369_) * i_374_
                                                    >> -896012944)
                                                    + i_366_);
                                            class318_sub3
                                                    .anInt6405
                                                    = ((i_375_
                                                    * aHa_Sub2_5598.anInt7771
                                                    / (aHa_Sub2_5598
                                                    .anInt7826))
                                                    + (aHa_Sub2_5598
                                                    .anInt7853));
                                            class318_sub3
                                                    .anInt6402
                                                    = ((aHa_Sub2_5598
                                                    .anInt7810)
                                                    + (aHa_Sub2_5598.anInt7794
                                                    * i_376_
                                                    / (aHa_Sub2_5598
                                                    .anInt7826)));
                                        }
                                    } else
                                        bool_362_ = false;
                                }
                                if (bool_362_) {
                                    if (i_370_ < i_367_)
                                        class318_sub3
                                                .anInt6403
                                                = ((aHa_Sub2_5598
                                                .anInt7853)
                                                + ((aHa_Sub2_5598
                                                .anInt7771)
                                                * (i_365_ - -aShort5634)
                                                / i_367_)
                                                - class318_sub3.anInt6405);
                                    else
                                        class318_sub3
                                                .anInt6403
                                                = ((aHa_Sub2_5598
                                                .anInt7853)
                                                - -((aHa_Sub2_5598
                                                .anInt7771)
                                                * (aShort5634 + i_368_)
                                                / i_370_)
                                                + -class318_sub3.anInt6406);
                                    class318_sub3
                                            .aBoolean6401
                                            = true;
                                }
                            }
                            aHa_Sub2_5598.method3784((byte) -62);
                            aHa_Sub2_5598.method3758(false,
                                    class101_sub3_350_);
                            method677((byte) 127);
                            aHa_Sub2_5598.method3734(true);
                            method682(true);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.KA("
                            + (class101 != null ? "{...}"
                            : "null")
                            + ','
                            + (class318_sub3 != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    final int WA() {
        anInt5545++;
        return aShort5544;
    }

    static final void method689(byte i, int i_377_) {
        Class48.anInt859 = -1;
        Class244.anInt4609 = -1;
        if (i != -59)
            anInt5584 = 77;
        anInt5577++;
        Class348_Sub36.anInt6992 = i_377_;
        Class348_Sub15.method2811(false);
    }

    static final void method690(byte i, int i_378_) {
        anInt5565++;
        Class348_Sub15 class348_sub15
                = ((Class348_Sub15)
                Class27.aClass356_389.method3480(i_378_, -6008));
        int i_379_ = -8 % ((i - -49) / 44);
        if (class348_sub15 != null) {
            class348_sub15.aClass55_Sub1_6768.method508(1);
            Class303.method2285(class348_sub15.aBoolean6776,
                    (byte) -114,
                    class348_sub15.anInt6773);
            class348_sub15.method2715((byte) 52);
        }
    }

    private final void method691(byte i) {
        anInt5531++;
        if (aBoolean5555) {
            aBoolean5555 = false;
            if (aClass129Array5640 == null && aClass342Array5541 == null
                    && aClass118Array5621 == null) {
                if (anIntArray5543 != null
                        && !Class337.method2659((byte) 123, anInt5648,
                        anInt5556)) {
                    if (aClass123_5605 == null
                            || (aClass123_5605.anInterface2_1811
                            != null)) {
                        if (!aBoolean5527)
                            method692((byte) -123);
                        anIntArray5543 = null;
                    } else
                        aBoolean5555 = true;
                }
                if (anIntArray5593 != null
                        && !s_Sub2.method3999(anInt5556, anInt5648, 458752)) {
                    if (aClass123_5605 != null
                            && (aClass123_5605.anInterface2_1811
                            == null))
                        aBoolean5555 = true;
                    else {
                        if (!aBoolean5527)
                            method692((byte) -123);
                        anIntArray5593 = null;
                    }
                }
                if (anIntArray5644 != null
                        && !Class153.method1221(-3157, anInt5648, anInt5556)) {
                    if (aClass123_5605 == null
                            || (aClass123_5605.anInterface2_1811
                            != null)) {
                        if (!aBoolean5527)
                            method692((byte) -123);
                        anIntArray5644 = null;
                    } else
                        aBoolean5555 = true;
                }
            }
            if (aShortArray5649 != null && anIntArray5543 == null
                    && anIntArray5593 == null && anIntArray5644 == null) {
                aShortArray5649 = null;
                anIntArray5528 = null;
            }
            if (aByteArray5594 != null
                    && !Class105_Sub1.method989(anInt5648, -385, anInt5556)) {
                if (aClass123_5563 == null) {
                    if (aClass123_5610 == null
                            || (aClass123_5610.anInterface2_1811
                            != null)) {
                        aByteArray5594 = null;
                        aShortArray5564 = aShortArray5583 = aShortArray5576
                                = null;
                    } else
                        aBoolean5555 = true;
                } else if (aClass123_5563.anInterface2_1811
                        == null)
                    aBoolean5555 = true;
                else {
                    aByteArray5594 = null;
                    aShortArray5564 = aShortArray5583 = aShortArray5576 = null;
                }
            }
            if (aShortArray5580 != null
                    && !Class315.method2358(-116, anInt5648, anInt5556)) {
                if (aClass123_5610 == null
                        || aClass123_5610.anInterface2_1811 != null)
                    aShortArray5580 = null;
                else
                    aBoolean5555 = true;
            }
            if (aByteArray5542 != null
                    && !Class239_Sub28.method1846(anInt5556, anInt5648, 74)) {
                if (aClass123_5610 == null
                        || aClass123_5610.anInterface2_1811 != null)
                    aByteArray5542 = null;
                else
                    aBoolean5555 = true;
            }
            if (aFloatArray5552 != null
                    && !Class98.method877(anInt5648, anInt5556, (byte) -127)) {
                if (aClass123_5620 != null
                        && aClass123_5620.anInterface2_1811 == null)
                    aBoolean5555 = true;
                else
                    aFloatArray5552 = aFloatArray5571 = null;
            }
            int i_380_ = -117 / ((69 - i) / 41);
            if (aShortArray5601 != null
                    && !Class348_Sub40_Sub19.method3100(anInt5556, false,
                    anInt5648)) {
                if (aClass123_5610 != null
                        && aClass123_5610.anInterface2_1811 == null)
                    aBoolean5555 = true;
                else
                    aShortArray5601 = null;
            }
            if (aShortArray5592 != null
                    && !Class69.method724(anInt5648, anInt5556, 393216)) {
                if ((aClass270_5575 != null
                        && aClass270_5575.anInterface8_3463 == null)
                        || aClass123_5610 != null && (aClass123_5610
                        .anInterface2_1811) == null)
                    aBoolean5555 = true;
                else
                    aShortArray5592 = aShortArray5579 = aShortArray5566 = null;
            }
            if (anIntArrayArray5553 != null
                    && !Class40.method371(anInt5648, 256, anInt5556)) {
                aShortArray5573 = null;
                anIntArrayArray5553 = null;
            }
            if (anIntArrayArray5539 != null
                    && !Class312.method2332(anInt5556, (byte) 124, anInt5648)) {
                anIntArrayArray5539 = null;
                aShortArray5608 = null;
            }
            if (anIntArrayArray5627 != null
                    && !Class229.method1633(false, anInt5648, anInt5556))
                anIntArrayArray5627 = null;
            if (anIntArray5626 != null && (anInt5648 & 0x800) == 0
                    && (anInt5648 & 0x40000) == 0)
                anIntArray5626 = null;
        }
    }

    final void method621() {
        anInt5606++;
    }

    final void ia(short i, short i_381_) {
        anInt5603++;
        for (int i_382_ = 0; anInt5632 > i_382_; i_382_++) {
            if (i == aShortArray5580[i_382_])
                aShortArray5580[i_382_] = i_381_;
        }
        if (aClass118Array5621 != null) {
            for (int i_383_ = 0; i_383_ < anInt5536; i_383_++) {
                Class118 class118 = aClass118Array5621[i_383_];
                Class48 class48 = aClass48Array5596[i_383_];
                class48.anInt858
                        = ((Class10.anIntArray179
                        [(aShortArray5580[class118.anInt1783]
                        & 0xffff)]) & 0xffffff
                        | ~0xffffff & class48.anInt858);
            }
        }
        if (aClass123_5610 != null)
            aClass123_5610.anInterface2_1811 = null;
    }

    final Class129[] method619() {
        anInt5625++;
        return aClass129Array5640;
    }

    final Class342[] method604() {
        anInt5569++;
        return aClass342Array5541;
    }

    final int V() {
        anInt5607++;
        if (!aBoolean5527)
            method692((byte) -123);
        return aShort5540;
    }

    final boolean r() {
        anInt5624++;
        return aBoolean5638;
    }

    final void method620(Class101 class101) {
        do {
            try {
                anInt5548++;
                Class101_Sub3 class101_sub3 = (Class101_Sub3) class101;
                if (aClass129Array5640 != null) {
                    for (int i = 0; i < aClass129Array5640.length; i++) {
                        Class129 class129 = aClass129Array5640[i];
                        Class129 class129_384_ = class129;
                        if (class129.aClass129_1888 != null)
                            class129_384_
                                    = class129.aClass129_1888;
                        class129_384_.anInt1882
                                = (int) (class101_sub3.aFloat5747
                                + (((float) (anIntArray5593
                                [(class129
                                .anInt1881)])
                                * (class101_sub3
                                .aFloat5750))
                                + ((class101_sub3
                                .aFloat5770)
                                * (float) (anIntArray5543
                                [(class129
                                .anInt1881)]))
                                + ((float) (anIntArray5644
                                [(class129
                                .anInt1881)])
                                * (class101_sub3
                                .aFloat5781))));
                        class129_384_.anInt1891
                                = (int) (class101_sub3.aFloat5772
                                + (((float) (anIntArray5593
                                [(class129
                                .anInt1881)])
                                * (class101_sub3
                                .aFloat5769))
                                + ((class101_sub3
                                .aFloat5761)
                                * (float) (anIntArray5543
                                [(class129
                                .anInt1881)]))
                                + ((float) (anIntArray5644
                                [(class129
                                .anInt1881)])
                                * (class101_sub3
                                .aFloat5762))));
                        class129_384_.anInt1889
                                = (int) (class101_sub3.aFloat5751
                                + (((float) (anIntArray5543
                                [(class129
                                .anInt1881)])
                                * (class101_sub3
                                .aFloat5756))
                                + ((class101_sub3
                                .aFloat5754)
                                * (float) (anIntArray5593
                                [(class129
                                .anInt1881)]))
                                + ((float) (anIntArray5644
                                [(class129
                                .anInt1881)])
                                * (class101_sub3
                                .aFloat5784))));
                        class129_384_.anInt1883
                                = (int) (class101_sub3.aFloat5747
                                + (((class101_sub3
                                .aFloat5770)
                                * (float) (anIntArray5543
                                [(class129
                                .anInt1877)]))
                                + ((float) (anIntArray5593
                                [(class129
                                .anInt1877)])
                                * (class101_sub3
                                .aFloat5750))
                                + ((float) (anIntArray5644
                                [(class129
                                .anInt1877)])
                                * (class101_sub3
                                .aFloat5781))));
                        class129_384_.anInt1890
                                = (int) (class101_sub3.aFloat5772
                                + (((class101_sub3
                                .aFloat5762)
                                * (float) (anIntArray5644
                                [(class129
                                .anInt1877)]))
                                + (((float) (anIntArray5543
                                [(class129
                                .anInt1877)])
                                * (class101_sub3
                                .aFloat5761))
                                + ((float) (anIntArray5593
                                [(class129
                                .anInt1877)])
                                * class101_sub3.aFloat5769))));
                        class129_384_.anInt1880
                                = (int) (class101_sub3.aFloat5751
                                + (((class101_sub3
                                .aFloat5784)
                                * (float) (anIntArray5644
                                [(class129
                                .anInt1877)]))
                                + (((class101_sub3
                                .aFloat5754)
                                * (float) (anIntArray5593
                                [(class129
                                .anInt1877)]))
                                + ((float) (anIntArray5543
                                [(class129
                                .anInt1877)])
                                * class101_sub3.aFloat5756))));
                        class129_384_.anInt1876
                                = (int) (class101_sub3.aFloat5747
                                + (((float) (anIntArray5593
                                [(class129
                                .anInt1892)])
                                * (class101_sub3
                                .aFloat5750))
                                + ((float) (anIntArray5543
                                [(class129
                                .anInt1892)])
                                * (class101_sub3
                                .aFloat5770))
                                + ((class101_sub3
                                .aFloat5781)
                                * (float) (anIntArray5644
                                [(class129
                                .anInt1892)]))));
                        class129_384_.anInt1874
                                = (int) (class101_sub3.aFloat5772
                                + (((float) (anIntArray5644
                                [(class129
                                .anInt1892)])
                                * (class101_sub3
                                .aFloat5762))
                                + (((class101_sub3
                                .aFloat5761)
                                * (float) (anIntArray5543
                                [(class129
                                .anInt1892)]))
                                + ((class101_sub3
                                .aFloat5769)
                                * (float) (anIntArray5593
                                [(class129
                                .anInt1892)])))));
                        class129_384_.anInt1884
                                = (int) (((class101_sub3
                                .aFloat5754)
                                * (float) (anIntArray5593
                                [(class129
                                .anInt1892)]))
                                + ((class101_sub3
                                .aFloat5756)
                                * (float) (anIntArray5543
                                [(class129
                                .anInt1892)]))
                                + ((float) (anIntArray5644
                                [(class129
                                .anInt1892)])
                                * (class101_sub3
                                .aFloat5784))
                                + (class101_sub3
                                .aFloat5751));
                    }
                }
                if (aClass342Array5541 == null)
                    break;
                for (int i = 0; aClass342Array5541.length > i; i++) {
                    Class342 class342 = aClass342Array5541[i];
                    Class342 class342_385_ = class342;
                    if (class342.aClass342_4248 != null)
                        class342_385_ = class342.aClass342_4248;
                    if (class342.aClass101_4252 == null)
                        class342.aClass101_4252
                                = class101_sub3.method907();
                    else
                        class342.aClass101_4252
                                .method898(class101_sub3);
                    class342_385_.anInt4238
                            = (int) (class101_sub3.aFloat5747
                            + (((float) (anIntArray5644
                            [(class342
                            .anInt4244)])
                            * (class101_sub3
                            .aFloat5781))
                            + (((float) (anIntArray5543
                            [(class342
                            .anInt4244)])
                            * (class101_sub3
                            .aFloat5770))
                            + ((class101_sub3
                            .aFloat5750)
                            * (float) (anIntArray5593
                            [(class342
                            .anInt4244)])))));
                    class342_385_.anInt4239
                            = (int) (class101_sub3.aFloat5772
                            + (((float) (anIntArray5593
                            [(class342
                            .anInt4244)])
                            * (class101_sub3
                            .aFloat5769))
                            + ((class101_sub3
                            .aFloat5761)
                            * (float) (anIntArray5543
                            [(class342
                            .anInt4244)]))
                            + ((float) (anIntArray5644
                            [(class342
                            .anInt4244)])
                            * (class101_sub3
                            .aFloat5762))));
                    class342_385_.anInt4240
                            = (int) (class101_sub3.aFloat5751
                            + (((float) (anIntArray5644
                            [(class342
                            .anInt4244)])
                            * (class101_sub3
                            .aFloat5784))
                            + (((float) (anIntArray5543
                            [(class342
                            .anInt4244)])
                            * (class101_sub3
                            .aFloat5756))
                            + ((float) (anIntArray5593
                            [(class342
                            .anInt4244)])
                            * (class101_sub3
                            .aFloat5754)))));
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        "paa.J(" + (class101 != null
                                ? "{...}"
                                : "null") + ')');
            }
            break;
        } while (false);
    }

    final int ma() {
        if (!aBoolean5527)
            method692((byte) -123);
        anInt5546++;
        return aShort5559;
    }

    final void method605(int i, int[] is, int i_386_, int i_387_, int i_388_,
                         int i_389_, boolean bool) {
        try {
            anInt5614++;
            int i_390_ = is.length;
            if (i == 0) {
                i_388_ <<= 4;
                i_387_ <<= 4;
                i_386_ <<= 4;
                Class181.anInt2398 = 0;
                int i_391_ = 0;
                Class221.anInt2880 = 0;
                za.anInt7275 = 0;
                for (int i_392_ = 0; i_392_ < i_390_; i_392_++) {
                    int i_393_ = is[i_392_];
                    if (i_393_ < anIntArrayArray5539.length) {
                        int[] is_394_ = anIntArrayArray5539[i_393_];
                        for (int i_395_ = 0;
                             (i_395_ < is_394_.length);
                             i_395_++) {
                            int i_396_ = is_394_[i_395_];
                            za.anInt7275 += anIntArray5543[i_396_];
                            Class221.anInt2880 += anIntArray5593[i_396_];
                            i_391_++;
                            Class181.anInt2398 += anIntArray5644[i_396_];
                        }
                    }
                }
                if (i_391_ <= 0) {
                    Class221.anInt2880 = i_387_;
                    Class181.anInt2398 = i_388_;
                    za.anInt7275 = i_386_;
                } else {
                    Class221.anInt2880 = i_387_ + Class221.anInt2880 / i_391_;
                    za.anInt7275 = za.anInt7275 / i_391_ + i_386_;
                    Class181.anInt2398 = i_388_ + Class181.anInt2398 / i_391_;
                }
            } else if (i == 1) {
                i_386_ <<= 4;
                i_387_ <<= 4;
                i_388_ <<= 4;
                for (int i_397_ = 0; i_390_ > i_397_; i_397_++) {
                    int i_398_ = is[i_397_];
                    if (i_398_ < anIntArrayArray5539.length) {
                        int[] is_399_ = anIntArrayArray5539[i_398_];
                        for (int i_400_ = 0; i_400_ < is_399_.length;
                             i_400_++) {
                            int i_401_ = is_399_[i_400_];
                            anIntArray5543[i_401_] += i_386_;
                            anIntArray5593[i_401_] += i_387_;
                            anIntArray5644[i_401_] += i_388_;
                        }
                    }
                }
            } else if (i == 2) {
                for (int i_402_ = 0;
					 i_390_ > i_402_; i_402_++) {
                    int i_403_ = is[i_402_];
                    if (anIntArrayArray5539.length > i_403_) {
                        int[] is_404_ = anIntArrayArray5539[i_403_];
                        if ((0x1 & i_389_) == 0) {
                            for (int i_416_ = 0;
                                 (is_404_.length > i_416_);
                                 i_416_++) {
                                int i_417_ = is_404_[i_416_];
                                anIntArray5543[i_417_] -= za.anInt7275;
                                anIntArray5593[i_417_] -= Class221.anInt2880;
                                anIntArray5644[i_417_] -= Class181.anInt2398;
                                if (i_388_ != 0) {
                                    int i_418_
                                            = Class70.anIntArray1207[i_388_];
                                    int i_419_
                                            = Class70.anIntArray1204[i_388_];
                                    int i_420_
                                            = ((anIntArray5543[i_417_] * i_419_
                                            + i_418_ * anIntArray5593[i_417_]
                                            - -16383)
                                            >> -490604178);
                                    anIntArray5593[i_417_]
                                            = (anIntArray5593[i_417_] * i_419_
                                            + -(i_418_ * anIntArray5543[i_417_])
                                            - -16383) >> 2075224046;
                                    anIntArray5543[i_417_] = i_420_;
                                }
                                if (i_386_ != 0) {
                                    int i_421_
                                            = Class70.anIntArray1207[i_386_];
                                    int i_422_
                                            = Class70.anIntArray1204[i_386_];
                                    int i_423_
                                            = ((-(anIntArray5644[i_417_] * i_421_)
                                            + (i_422_ * anIntArray5593[i_417_]
                                            + 16383))
                                            >> -1510355730);
                                    anIntArray5644[i_417_]
                                            = ((16383
                                            + i_422_ * anIntArray5644[i_417_]
                                            + i_421_ * anIntArray5593[i_417_])
                                            >> 1908961134);
                                    anIntArray5593[i_417_] = i_423_;
                                }
                                if (i_387_ != 0) {
                                    int i_424_
                                            = Class70.anIntArray1207[i_387_];
                                    int i_425_
                                            = Class70.anIntArray1204[i_387_];
                                    int i_426_
                                            = (i_424_ * anIntArray5644[i_417_]
                                            - -(i_425_ * anIntArray5543[i_417_])
                                            + 16383) >> 1139608366;
                                    anIntArray5644[i_417_]
                                            = (16383
                                            + (anIntArray5644[i_417_] * i_425_
                                            - (anIntArray5543[i_417_]
                                            * i_424_))) >> 1801422350;
                                    anIntArray5543[i_417_] = i_426_;
                                }
                                anIntArray5543[i_417_] += za.anInt7275;
                                anIntArray5593[i_417_] += Class221.anInt2880;
                                anIntArray5644[i_417_] += Class181.anInt2398;
                            }
                        } else {
                            for (int i_405_ = 0; is_404_.length > i_405_;
                                 i_405_++) {
                                int i_406_ = is_404_[i_405_];
                                anIntArray5543[i_406_] -= za.anInt7275;
                                anIntArray5593[i_406_] -= Class221.anInt2880;
                                anIntArray5644[i_406_] -= Class181.anInt2398;
                                if (i_386_ != 0) {
                                    int i_407_
                                            = Class70.anIntArray1207[i_386_];
                                    int i_408_
                                            = Class70.anIntArray1204[i_386_];
                                    int i_409_
                                            = ((16383
                                            + (i_408_ * anIntArray5593[i_406_]
                                            + -(anIntArray5644[i_406_]
                                            * i_407_)))
                                            >> -1249797970);
                                    anIntArray5644[i_406_]
                                            = ((16383
                                            + (anIntArray5593[i_406_] * i_407_
                                            - -(i_408_
                                            * anIntArray5644[i_406_])))
                                            >> -1513317202);
                                    anIntArray5593[i_406_] = i_409_;
                                }
                                if (i_388_ != 0) {
                                    int i_410_
                                            = Class70.anIntArray1207[i_388_];
                                    int i_411_
                                            = Class70.anIntArray1204[i_388_];
                                    int i_412_
                                            = ((16383
                                            + (anIntArray5543[i_406_] * i_411_
                                            + (i_410_
                                            * anIntArray5593[i_406_])))
                                            >> -355692498);
                                    anIntArray5593[i_406_]
                                            = (-(i_410_ * anIntArray5543[i_406_])
                                            + (anIntArray5593[i_406_] * i_411_
                                            - -16383)) >> -2042452178;
                                    anIntArray5543[i_406_] = i_412_;
                                }
                                if (i_387_ != 0) {
                                    int i_413_
                                            = Class70.anIntArray1207[i_387_];
                                    int i_414_
                                            = Class70.anIntArray1204[i_387_];
                                    int i_415_
                                            = ((i_413_ * anIntArray5644[i_406_]
                                            - (-(anIntArray5543[i_406_]
                                            * i_414_)
                                            - 16383))
                                            >> -1672359602);
                                    anIntArray5644[i_406_]
                                            = (anIntArray5644[i_406_] * i_414_
                                            + (-(i_413_
                                            * anIntArray5543[i_406_])
                                            - -16383)) >> 695139310;
                                    anIntArray5543[i_406_] = i_415_;
                                }
                                anIntArray5543[i_406_] += za.anInt7275;
                                anIntArray5593[i_406_] += Class221.anInt2880;
                                anIntArray5644[i_406_] += Class181.anInt2398;
                            }
                        }
					}
                }
                if (bool) {
                    for (int i_427_ = 0; i_427_ < i_390_; i_427_++) {
                        int i_428_ = is[i_427_];
                        if (i_428_ < anIntArrayArray5539.length) {
                            int[] is_429_ = anIntArrayArray5539[i_428_];
                            for (int i_430_ = 0; i_430_ < is_429_.length;
                                 i_430_++) {
                                int i_431_ = is_429_[i_430_];
                                int i_432_ = anIntArray5528[i_431_];
                                int i_433_ = anIntArray5528[i_431_ - -1];
                                for (int i_434_ = i_432_; i_433_ > i_434_;
                                     i_434_++) {
                                    int i_435_ = aShortArray5649[i_434_] - 1;
                                    if (i_435_ == -1)
                                        break;
                                    if (i_388_ != 0) {
                                        int i_436_
                                                = Class70.anIntArray1207[i_388_];
                                        int i_437_
                                                = Class70.anIntArray1204[i_388_];
                                        int i_438_
                                                = ((16383
                                                + (i_437_
                                                * aShortArray5564[i_435_])
                                                + (aShortArray5583[i_435_]
                                                * i_436_))
                                                >> 404129998);
                                        aShortArray5583[i_435_]
                                                = (short) ((16383
                                                + (i_437_
                                                * (aShortArray5583
                                                [i_435_]))
                                                + -((aShortArray5564
                                                [i_435_])
                                                * i_436_))
                                                >> 1420334286);
                                        aShortArray5564[i_435_]
                                                = (short) i_438_;
                                    }
                                    if (i_386_ != 0) {
                                        int i_439_
                                                = Class70.anIntArray1207[i_386_];
                                        int i_440_
                                                = Class70.anIntArray1204[i_386_];
                                        int i_441_
                                                = (i_440_ * aShortArray5583[i_435_]
                                                - ((aShortArray5576[i_435_]
                                                * i_439_)
                                                + -16383)) >> 10302990;
                                        aShortArray5576[i_435_]
                                                = (short) ((16383
                                                + ((i_440_
                                                * (aShortArray5576
                                                [i_435_]))
                                                + (i_439_
                                                * (aShortArray5583
                                                [i_435_]))))
                                                >> -1413086674);
                                        aShortArray5583[i_435_]
                                                = (short) i_441_;
                                    }
                                    if (i_387_ != 0) {
                                        int i_442_
                                                = Class70.anIntArray1207[i_387_];
                                        int i_443_
                                                = Class70.anIntArray1204[i_387_];
                                        int i_444_
                                                = ((16383
                                                + (i_442_
                                                * aShortArray5576[i_435_])
                                                + (aShortArray5564[i_435_]
                                                * i_443_))
                                                >> -1546997874);
                                        aShortArray5576[i_435_]
                                                = (short) ((16383
                                                + (-((aShortArray5564
                                                [i_435_])
                                                * i_442_)
                                                + ((aShortArray5576
                                                [i_435_])
                                                * i_443_)))
                                                >> -1818064274);
                                        aShortArray5564[i_435_]
                                                = (short) i_444_;
                                    }
                                }
                            }
                        }
                    }
                    if (aClass123_5563 == null && aClass123_5610 != null)
                        aClass123_5610.anInterface2_1811 = null;
                    if (aClass123_5563 != null)
                        aClass123_5563.anInterface2_1811 = null;
                }
            } else if (i == 3) {
                for (int i_445_ = 0;
					 i_445_ < i_390_; i_445_++) {
                    int i_446_ = is[i_445_];
                    if (i_446_ < anIntArrayArray5539.length) {
                        int[] is_447_ = anIntArrayArray5539[i_446_];
                        for (int i_448_ = 0; i_448_ < is_447_.length;
                             i_448_++) {
                            int i_449_ = is_447_[i_448_];
                            anIntArray5543[i_449_] -= za.anInt7275;
                            anIntArray5593[i_449_] -= Class221.anInt2880;
                            anIntArray5644[i_449_] -= Class181.anInt2398;
                            anIntArray5543[i_449_]
                                    = i_386_ * anIntArray5543[i_449_] >> 779157575;
                            anIntArray5593[i_449_]
                                    = anIntArray5593[i_449_] * i_387_ >> 392581767;
                            anIntArray5644[i_449_]
                                    = anIntArray5644[i_449_] * i_388_ >> 962191751;
                            anIntArray5543[i_449_] += za.anInt7275;
                            anIntArray5593[i_449_] += Class221.anInt2880;
                            anIntArray5644[i_449_] += Class181.anInt2398;
                        }
                    }
                }
            } else if (i == 5) {
                if (anIntArrayArray5553 != null) {
                    for (int i_450_ = 0;
						 i_390_ > i_450_;
                         i_450_++) {
                        int i_451_ = is[i_450_];
                        if (anIntArrayArray5553.length > i_451_) {
                            int[] is_452_ = anIntArrayArray5553[i_451_];
                            for (int i_453_ = 0; i_453_ < is_452_.length;
                                 i_453_++) {
                                int i_454_ = is_452_[i_453_];
                                int i_455_ = ((0xff & aByteArray5542[i_454_])
                                        + 8 * i_386_);
                                if (i_455_ < 0)
                                    i_455_ = 0;
                                else if (i_455_ > 255)
                                    i_455_ = 255;
                                aByteArray5542[i_454_] = (byte) i_455_;
                            }
                            if (is_452_.length > 0
                                    && aClass123_5610 != null)
                                aClass123_5610.anInterface2_1811
                                        = null;
                        }
                    }
                    if (aClass118Array5621 != null) {
                        for (int i_456_ = 0; i_456_ < anInt5536; i_456_++) {
                            Class118 class118 = aClass118Array5621[i_456_];
                            Class48 class48 = aClass48Array5596[i_456_];
                            class48.anInt858
                                    = (255 + -((aByteArray5542
                                    [class118.anInt1783])
                                    & 0xff) << -879246056
                                    | 0xffffff & class48.anInt858);
                        }
                    }
                }
            } else if (i == 7) {
                if (anIntArrayArray5553 != null) {
                    for (int i_457_ = 0;
						 i_390_ > i_457_;
                         i_457_++) {
                        int i_458_ = is[i_457_];
                        if (i_458_ < anIntArrayArray5553.length) {
                            int[] is_459_ = anIntArrayArray5553[i_458_];
                            for (int i_460_ = 0; i_460_ < is_459_.length;
                                 i_460_++) {
                                int i_461_ = is_459_[i_460_];
                                int i_462_ = aShortArray5580[i_461_] & 0xffff;
                                int i_463_ = (i_462_ & 0xfc8a) >> -1010039702;
                                int i_464_ = 0x7 & i_462_ >> -266127705;
                                i_464_ += i_387_ / 4;
                                i_463_ = 0x3f & i_463_ + i_386_;
                                int i_465_ = i_462_ & 0x7f;
                                i_465_ += i_388_;
                                if (i_464_ >= 0) {
                                    if (i_464_ > 7)
                                        i_464_ = 7;
                                } else
                                    i_464_ = 0;
                                if (i_465_ < 0)
                                    i_465_ = 0;
                                else if (i_465_ > 127)
                                    i_465_ = 127;
                                aShortArray5580[i_461_]
                                        = (short) (Class273.method2057
                                        ((Class273.method2057
                                                        (i_464_ << 569683559,
                                                                i_463_ << -1259831766)),
                                                i_465_));
                            }
                            if (is_459_.length > 0
                                    && aClass123_5610 != null)
                                aClass123_5610.anInterface2_1811
                                        = null;
                        }
                    }
                    if (aClass118Array5621 != null) {
                        for (int i_466_ = 0;
							 anInt5536 > i_466_;
                             i_466_++) {
                            Class118 class118 = aClass118Array5621[i_466_];
                            Class48 class48 = aClass48Array5596[i_466_];
                            class48.anInt858
                                    = (0xffffff & (Class10.anIntArray179
                                    [(aShortArray5580
                                    [(class118
                                    .anInt1783)]) & 0xffff])
                                    | ~0xffffff & class48.anInt858);
                        }
                    }
                }
            } else if (i == 8) {
                if (anIntArrayArray5627 != null) {
                    for (int i_467_ = 0;
						 i_467_ < i_390_;
                         i_467_++) {
                        int i_468_ = is[i_467_];
                        if (i_468_ < anIntArrayArray5627.length) {
                            int[] is_469_ = anIntArrayArray5627[i_468_];
                            for (int i_470_ = 0; i_470_ < is_469_.length;
                                 i_470_++) {
                                Class48 class48
                                        = aClass48Array5596[is_469_[i_470_]];
                                class48.anInt854 += i_386_;
                                class48.anInt847 += i_387_;
                            }
                        }
                    }
                }
            } else if (i == 10) {
                if (anIntArrayArray5627 != null) {
                    for (int i_471_ = 0; i_471_ < i_390_; i_471_++) {
                        int i_472_ = is[i_471_];
                        if (i_472_ < anIntArrayArray5627.length) {
                            int[] is_473_ = anIntArrayArray5627[i_472_];
                            for (int i_474_ = 0;
                                 (i_474_ < is_473_.length);
                                 i_474_++) {
                                Class48 class48
                                        = aClass48Array5596[is_473_[i_474_]];
                                class48.anInt856
                                        = (i_386_ * class48.anInt856
                                        >> -1460665785);
                                class48.anInt857
                                        = (class48.anInt857 * i_387_
                                        >> 74633895);
                            }
                        }
                    }
                }
            } else if (i == 9) {
                if (anIntArrayArray5627 != null) {
                    for (int i_475_ = 0; i_475_ < i_390_; i_475_++) {
                        int i_476_ = is[i_475_];
                        if (anIntArrayArray5627.length > i_476_) {
                            int[] is_477_ = anIntArrayArray5627[i_476_];
                            for (int i_478_ = 0; is_477_.length > i_478_;
                                 i_478_++) {
                                Class48 class48
                                        = aClass48Array5596[is_477_[i_478_]];
                                class48.anInt853
                                        = (class48.anInt853 + i_386_
                                        & 0x3fff);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.BB(" + i + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_386_ + ',' + i_387_
                            + ',' + i_388_ + ',' + i_389_
                            + ',' + bool + ')'));
        }
    }

    final int HA() {
        anInt5574++;
        if (!aBoolean5527)
            method692((byte) -123);
        return aShort5617;
    }

    final int ua() {
        anInt5616++;
        return anInt5648;
    }

    final void P(int i, int i_479_, int i_480_, int i_481_) {
        anInt5567++;
        if (i == 0) {
            za.anInt7275 = 0;
            Class181.anInt2398 = 0;
            Class221.anInt2880 = 0;
            int i_482_ = 0;
            for (int i_483_ = 0; i_483_ < anInt5557; i_483_++) {
                za.anInt7275 += anIntArray5543[i_483_];
                Class221.anInt2880 += anIntArray5593[i_483_];
                i_482_++;
                Class181.anInt2398 += anIntArray5644[i_483_];
            }
            if (i_482_ <= 0) {
                Class221.anInt2880 = i_480_;
                Class181.anInt2398 = i_481_;
                za.anInt7275 = i_479_;
            } else {
                Class221.anInt2880 = Class221.anInt2880 / i_482_ - -i_480_;
                za.anInt7275 = i_479_ + za.anInt7275 / i_482_;
                Class181.anInt2398 = Class181.anInt2398 / i_482_ + i_481_;
            }
        } else if (i == 1) {
            for (int i_484_ = 0; i_484_ < anInt5557; i_484_++) {
                anIntArray5543[i_484_] += i_479_;
                anIntArray5593[i_484_] += i_480_;
                anIntArray5644[i_484_] += i_481_;
            }
        } else if (i == 2) {
            for (int i_485_ = 0; i_485_ < anInt5557; i_485_++) {
                anIntArray5543[i_485_] -= za.anInt7275;
                anIntArray5593[i_485_] -= Class221.anInt2880;
                anIntArray5644[i_485_] -= Class181.anInt2398;
                if (i_481_ != 0) {
                    int i_486_ = Class70.anIntArray1207[i_481_];
                    int i_487_ = Class70.anIntArray1204[i_481_];
                    int i_488_ = (16383 + (i_487_ * anIntArray5543[i_485_]
                            + anIntArray5593[i_485_] * i_486_)
                            >> 335180878);
                    anIntArray5593[i_485_]
                            = ((-(anIntArray5543[i_485_] * i_486_)
                            + anIntArray5593[i_485_] * i_487_ + 16383)
                            >> 865954062);
                    anIntArray5543[i_485_] = i_488_;
                }
                if (i_479_ != 0) {
                    int i_489_ = Class70.anIntArray1207[i_479_];
                    int i_490_ = Class70.anIntArray1204[i_479_];
                    int i_491_ = ((-(anIntArray5644[i_485_] * i_489_)
                            + i_490_ * anIntArray5593[i_485_] + 16383)
                            >> 1523641006);
                    anIntArray5644[i_485_]
                            = ((i_489_ * anIntArray5593[i_485_]
                            - (-(i_490_ * anIntArray5644[i_485_]) + -16383))
                            >> -949806578);
                    anIntArray5593[i_485_] = i_491_;
                }
                if (i_480_ != 0) {
                    int i_492_ = Class70.anIntArray1207[i_480_];
                    int i_493_ = Class70.anIntArray1204[i_480_];
                    int i_494_
                            = (16383 + (anIntArray5644[i_485_] * i_492_
                            - -(i_493_ * anIntArray5543[i_485_]))
                            >> -616309682);
                    anIntArray5644[i_485_]
                            = (16383 + (-(anIntArray5543[i_485_] * i_492_)
                            + i_493_ * anIntArray5644[i_485_])
                            >> -2052985394);
                    anIntArray5543[i_485_] = i_494_;
                }
                anIntArray5543[i_485_] += za.anInt7275;
                anIntArray5593[i_485_] += Class221.anInt2880;
                anIntArray5644[i_485_] += Class181.anInt2398;
            }
        } else if (i == 3) {
            for (int i_495_ = 0;
				 i_495_ < anInt5557; i_495_++) {
                anIntArray5543[i_495_] -= za.anInt7275;
                anIntArray5593[i_495_] -= Class221.anInt2880;
                anIntArray5644[i_495_] -= Class181.anInt2398;
                anIntArray5543[i_495_] = i_479_ * anIntArray5543[i_495_] / 128;
                anIntArray5593[i_495_] = i_480_ * anIntArray5593[i_495_] / 128;
                anIntArray5644[i_495_] = anIntArray5644[i_495_] * i_481_ / 128;
                anIntArray5543[i_495_] += za.anInt7275;
                anIntArray5593[i_495_] += Class221.anInt2880;
                anIntArray5644[i_495_] += Class181.anInt2398;
            }
        } else if (i == 5) {
            for (int i_496_ = 0; i_496_ < anInt5632; i_496_++) {
                int i_497_ = (aByteArray5542[i_496_] & 0xff) + i_479_ * 8;
                if (i_497_ >= 0) {
                    if (i_497_ > 255)
                        i_497_ = 255;
                } else
                    i_497_ = 0;
                aByteArray5542[i_496_] = (byte) i_497_;
            }
            if (aClass123_5610 != null)
                aClass123_5610.anInterface2_1811 = null;
            if (aClass118Array5621 != null) {
                for (int i_498_ = 0;
					 i_498_ < anInt5536;
                     i_498_++) {
                    Class118 class118 = aClass118Array5621[i_498_];
                    Class48 class48 = aClass48Array5596[i_498_];
                    class48.anInt858
                            = (0xffffff & class48.anInt858
                            | (-(0xff & aByteArray5542[(class118
                            .anInt1783)]) + 255
                            << 1935224280));
                }
            }
        } else if (i == 7) {
            for (int i_499_ = 0; anInt5632 > i_499_; i_499_++) {
                int i_500_ = aShortArray5580[i_499_] & 0xffff;
                int i_501_ = 0x3f & i_500_ >> 421346794;
                int i_502_ = (i_500_ & 0x3ba) >> -573261017;
                i_501_ = i_501_ + i_479_ & 0x3f;
                int i_503_ = i_500_ & 0x7f;
                i_502_ += i_480_ / 4;
                i_503_ += i_481_;
                if (i_502_ >= 0) {
                    if (i_502_ > 7)
                        i_502_ = 7;
                } else
                    i_502_ = 0;
                if (i_503_ >= 0) {
                    if (i_503_ > 127)
                        i_503_ = 127;
                } else
                    i_503_ = 0;
                aShortArray5580[i_499_]
                        = (short) (Class273.method2057
                        (i_503_,
                                Class273.method2057(i_502_ << -1099514361,
                                        i_501_ << -1246866806)));
            }
            if (aClass123_5610 != null)
                aClass123_5610.anInterface2_1811 = null;
            if (aClass118Array5621 != null) {
                for (int i_504_ = 0; i_504_ < anInt5536; i_504_++) {
                    Class118 class118 = aClass118Array5621[i_504_];
                    Class48 class48 = aClass48Array5596[i_504_];
                    class48.anInt858
                            = (((Class10.anIntArray179
                            [0xffff & (aShortArray5580
                            [class118.anInt1783])])
                            & 0xffffff)
                            | class48.anInt858 & ~0xffffff);
                }
            }
        } else if (i == 8) {
            for (int i_505_ = 0;
				 i_505_ < anInt5536; i_505_++) {
                Class48 class48 = aClass48Array5596[i_505_];
                class48.anInt847 += i_480_;
                class48.anInt854 += i_479_;
            }
        } else if (i == 10) {
            for (int i_506_ = 0;
				 anInt5536 > i_506_; i_506_++) {
                Class48 class48 = aClass48Array5596[i_506_];
                class48.anInt856
                        = class48.anInt856 * i_479_ >> -1065439225;
                class48.anInt857
                        = i_480_ * class48.anInt857 >> 507326855;
            }
        } else if (i == 9) {
            for (int i_507_ = 0; i_507_ < anInt5536; i_507_++) {
                Class48 class48 = aClass48Array5596[i_507_];
                class48.anInt853
                        = class48.anInt853 + i_479_ & 0x3fff;
            }
        }
    }

    final void s(int i) {
        anInt5648 = i;
        anInt5597++;
        if (aClass139_5572 != null
                && (0x10000 & anInt5648) == 0) {
            aShortArray5576 = aClass139_5572.aShortArray1953;
            aByteArray5594 = aClass139_5572.aByteArray1948;
            aShortArray5564 = aClass139_5572.aShortArray1954;
            aShortArray5583 = aClass139_5572.aShortArray1951;
            aClass139_5572 = null;
        }
        aBoolean5555 = true;
        method691((byte) -62);
    }

    final void C(int i) {
        anInt5602++;
        aShort5544 = (short) i;
        if (aClass123_5610 != null)
            aClass123_5610.anInterface2_1811 = null;
    }

    final void v() {
        anInt5535++;
        for (int i = 0; anInt5557 > i; i++)
            anIntArray5644[i] = -anIntArray5644[i];
        for (int i = 0; anInt5529 > i; i++)
            aShortArray5576[i] = (short) -aShortArray5576[i];
        for (int i = 0; anInt5632 > i; i++) {
            short i_508_ = aShortArray5592[i];
            aShortArray5592[i] = aShortArray5566[i];
            aShortArray5566[i] = i_508_;
        }
        if (aClass123_5563 == null && aClass123_5610 != null)
            aClass123_5610.anInterface2_1811 = null;
        if (aClass123_5563 != null)
            aClass123_5563.anInterface2_1811 = null;
        aBoolean5527 = false;
        if (aClass270_5575 != null)
            aClass270_5575.anInterface8_3463 = null;
        if (aClass123_5605 != null)
            aClass123_5605.anInterface2_1811 = null;
    }

    final void method610(Class101 class101, int i, boolean bool) {
        try {
            anInt5550++;
            if (aShortArray5608 != null) {
                int[] is = new int[3];
                for (int i_509_ = 0;
					 i_509_ < anInt5557;
                     i_509_++) {
                    if ((i & aShortArray5608[i_509_]) != 0) {
                        if (!bool)
                            class101.method897(anIntArray5543[i_509_],
                                    anIntArray5593[i_509_],
                                    anIntArray5644[i_509_], is);
                        else
                            class101.method892(anIntArray5543[i_509_],
                                    anIntArray5593[i_509_],
                                    anIntArray5644[i_509_], is);
                        anIntArray5543[i_509_] = is[0];
                        anIntArray5593[i_509_] = is[1];
                        anIntArray5644[i_509_] = is[2];
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.za("
                            + (class101 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + bool + ')'));
        }
    }

    final void I(int i, int[] is, int i_510_, int i_511_, int i_512_,
                 boolean bool, int i_513_, int[] is_514_) {
        try {
            anInt5604++;
            int i_515_ = is.length;
            if (i == 0) {
                i_511_ <<= 4;
                i_512_ <<= 4;
                i_510_ <<= 4;
                int i_516_ = 0;
                za.anInt7275 = 0;
                Class221.anInt2880 = 0;
                Class181.anInt2398 = 0;
                for (int i_517_ = 0; i_515_ > i_517_; i_517_++) {
                    int i_518_ = is[i_517_];
                    if (anIntArrayArray5539.length > i_518_) {
                        int[] is_519_ = anIntArrayArray5539[i_518_];
                        for (int i_520_ = 0; i_520_ < is_519_.length;
                             i_520_++) {
                            int i_521_ = is_519_[i_520_];
                            if (aShortArray5608 == null
                                    || (i_513_ & aShortArray5608[i_521_]) != 0) {
                                za.anInt7275 += anIntArray5543[i_521_];
                                Class221.anInt2880 += anIntArray5593[i_521_];
                                i_516_++;
                                Class181.anInt2398 += anIntArray5644[i_521_];
                            }
                        }
                    }
                }
                if (i_516_ <= 0) {
                    za.anInt7275 = i_510_;
                    Class181.anInt2398 = i_512_;
                    Class221.anInt2880 = i_511_;
                } else {
                    za.anInt7275 = i_510_ + za.anInt7275 / i_516_;
                    Class221.anInt2880 = Class221.anInt2880 / i_516_ - -i_511_;
                    Class181.anInt2398 = i_512_ + Class181.anInt2398 / i_516_;
                    Class348_Sub42_Sub16_Sub1.aBoolean10450 = true;
                }
            } else if (i == 1) {
                if (is_514_ != null) {
                    int i_522_ = ((is_514_[2] * i_512_ + is_514_[0] * i_510_
                            + (i_511_ * is_514_[1] + 8192))
                            >> 1419305870);
                    int i_523_
                            = ((8192 + i_511_ * is_514_[4]
                            + (i_510_ * is_514_[3] - -(is_514_[5] * i_512_)))
                            >> -1589857234);
                    int i_524_ = ((i_512_ * is_514_[8] + i_510_ * is_514_[6]
                            + (i_511_ * is_514_[7] + 8192))
                            >> 1737388558);
                    i_510_ = i_522_;
                    i_512_ = i_524_;
                    i_511_ = i_523_;
                }
                i_510_ <<= 4;
                i_512_ <<= 4;
                i_511_ <<= 4;
                for (int i_525_ = 0;
					 i_525_ < i_515_; i_525_++) {
                    int i_526_ = is[i_525_];
                    if (i_526_ < anIntArrayArray5539.length) {
                        int[] is_527_ = anIntArrayArray5539[i_526_];
                        for (int i_528_ = 0; is_527_.length > i_528_;
                             i_528_++) {
                            int i_529_ = is_527_[i_528_];
                            if (aShortArray5608 == null
                                    || (aShortArray5608[i_529_] & i_513_) != 0) {
                                anIntArray5543[i_529_] += i_510_;
                                anIntArray5593[i_529_] += i_511_;
                                anIntArray5644[i_529_] += i_512_;
                            }
                        }
                    }
                }
            } else if (i == 2) {
                if (is_514_ == null) {
                    for (int i_530_ = 0;
						 i_515_ > i_530_;
                         i_530_++) {
                        int i_531_ = is[i_530_];
                        if (i_531_ < anIntArrayArray5539.length) {
                            int[] is_532_ = anIntArrayArray5539[i_531_];
                            for (int i_533_ = 0; is_532_.length > i_533_;
                                 i_533_++) {
                                int i_534_ = is_532_[i_533_];
                                if (aShortArray5608 == null
                                        || ((i_513_ & aShortArray5608[i_534_])
                                        != 0)) {
                                    anIntArray5543[i_534_] -= za.anInt7275;
                                    anIntArray5593[i_534_]
                                            -= Class221.anInt2880;
                                    anIntArray5644[i_534_]
                                            -= Class181.anInt2398;
                                    if (i_512_ != 0) {
                                        int i_535_
                                                = Class70.anIntArray1207[i_512_];
                                        int i_536_
                                                = Class70.anIntArray1204[i_512_];
                                        int i_537_
                                                = ((i_535_ * anIntArray5593[i_534_]
                                                - (-(anIntArray5543[i_534_]
                                                * i_536_)
                                                - 16383))
                                                >> -637810130);
                                        anIntArray5593[i_534_]
                                                = (-(anIntArray5543[i_534_]
                                                * i_535_)
                                                + (anIntArray5593[i_534_]
                                                * i_536_)
                                                + 16383) >> -1532978610;
                                        anIntArray5543[i_534_] = i_537_;
                                    }
                                    if (i_510_ != 0) {
                                        int i_538_
                                                = Class70.anIntArray1207[i_510_];
                                        int i_539_
                                                = Class70.anIntArray1204[i_510_];
                                        int i_540_
                                                = ((-(anIntArray5644[i_534_]
                                                * i_538_)
                                                + (i_539_
                                                * anIntArray5593[i_534_])
                                                + 16383)
                                                >> 1901871214);
                                        anIntArray5644[i_534_]
                                                = (16383
                                                + ((i_538_
                                                * anIntArray5593[i_534_])
                                                + (anIntArray5644[i_534_]
                                                * i_539_))) >> -400701938;
                                        anIntArray5593[i_534_] = i_540_;
                                    }
                                    if (i_511_ != 0) {
                                        int i_541_
                                                = Class70.anIntArray1207[i_511_];
                                        int i_542_
                                                = Class70.anIntArray1204[i_511_];
                                        int i_543_
                                                = ((i_541_ * anIntArray5644[i_534_]
                                                + ((i_542_
                                                * anIntArray5543[i_534_])
                                                - -16383))
                                                >> 1352881166);
                                        anIntArray5644[i_534_]
                                                = ((16383
                                                + ((anIntArray5644[i_534_]
                                                * i_542_)
                                                + -(anIntArray5543[i_534_]
                                                * i_541_)))
                                                >> 1127993806);
                                        anIntArray5543[i_534_] = i_543_;
                                    }
                                    anIntArray5543[i_534_] += za.anInt7275;
                                    anIntArray5593[i_534_]
                                            += Class221.anInt2880;
                                    anIntArray5644[i_534_]
                                            += Class181.anInt2398;
                                }
                            }
                        }
                    }
                    if (bool) {
                        for (int i_544_ = 0; i_544_ < i_515_; i_544_++) {
                            int i_545_ = is[i_544_];
                            if (i_545_ < anIntArrayArray5539.length) {
                                int[] is_546_ = anIntArrayArray5539[i_545_];
                                for (int i_547_ = 0; is_546_.length > i_547_;
                                     i_547_++) {
                                    int i_548_ = is_546_[i_547_];
                                    if (aShortArray5608 == null
                                            || ((aShortArray5608[i_548_] & i_513_)
                                            != 0)) {
                                        int i_549_ = anIntArray5528[i_548_];
                                        int i_550_
                                                = anIntArray5528[i_548_ + 1];
                                        for (int i_551_ = i_549_;
                                             i_550_ > i_551_; i_551_++) {
                                            int i_552_
                                                    = aShortArray5649[i_551_] + -1;
                                            if (i_552_ == -1)
                                                break;
                                            if (i_512_ != 0) {
                                                int i_553_
                                                        = (Class70.anIntArray1207
                                                        [i_512_]);
                                                int i_554_
                                                        = (Class70.anIntArray1204
                                                        [i_512_]);
                                                int i_555_
                                                        = ((16383
                                                        + (aShortArray5564
                                                        [i_552_]) * i_554_
                                                        + (aShortArray5583
                                                        [i_552_]) * i_553_)
                                                        >> 147055854);
                                                aShortArray5583[i_552_]
                                                        = (short) ((16383
                                                        + ((i_554_
                                                        * (aShortArray5583
                                                        [i_552_]))
                                                        + -(i_553_
                                                        * (aShortArray5564
                                                        [i_552_]))))
                                                        >> 2032654094);
                                                aShortArray5564[i_552_]
                                                        = (short) i_555_;
                                            }
                                            if (i_510_ != 0) {
                                                int i_556_
                                                        = (Class70.anIntArray1207
                                                        [i_510_]);
                                                int i_557_
                                                        = (Class70.anIntArray1204
                                                        [i_510_]);
                                                int i_558_
                                                        = ((16383
                                                        + (-(i_556_
                                                        * (aShortArray5576
                                                        [i_552_]))
                                                        + ((aShortArray5583
                                                        [i_552_])
                                                        * i_557_)))
                                                        >> 1557730510);
                                                aShortArray5576[i_552_]
                                                        = (short) (((i_556_
                                                        * (aShortArray5583
                                                        [i_552_]))
                                                        + (i_557_
                                                        * (aShortArray5576
                                                        [i_552_]))
                                                        + 16383)
                                                        >> 1739041326);
                                                aShortArray5583[i_552_]
                                                        = (short) i_558_;
                                            }
                                            if (i_511_ != 0) {
                                                int i_559_
                                                        = (Class70.anIntArray1207
                                                        [i_511_]);
                                                int i_560_
                                                        = (Class70.anIntArray1204
                                                        [i_511_]);
                                                int i_561_
                                                        = ((16383
                                                        + (i_560_
                                                        * (aShortArray5564
                                                        [i_552_]))
                                                        + (i_559_
                                                        * (aShortArray5576
                                                        [i_552_])))
                                                        >> -529572498);
                                                aShortArray5576[i_552_]
                                                        = (short) ((((aShortArray5576
                                                        [i_552_])
                                                        * i_560_)
                                                        + -(i_559_
                                                        * (aShortArray5564
                                                        [i_552_]))
                                                        + 16383)
                                                        >> 943081742);
                                                aShortArray5564[i_552_]
                                                        = (short) i_561_;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (aClass123_5563 == null && aClass123_5610 != null)
                            aClass123_5610.anInterface2_1811
                                    = null;
                        if (aClass123_5563 != null)
                            aClass123_5563.anInterface2_1811
                                    = null;
                    }
                } else {
                    int i_562_ = is_514_[9] << 563861572;
                    int i_563_ = is_514_[10] << 2071696452;
                    int i_564_ = is_514_[11] << -1244625340;
                    int i_565_ = is_514_[12] << -2078930780;
                    int i_566_ = is_514_[13] << -1806148028;
                    int i_567_ = is_514_[14] << -819034908;
                    if (Class348_Sub42_Sub16_Sub1.aBoolean10450) {
                        int i_568_
                                = ((za.anInt7275 * is_514_[0]
                                - -(is_514_[3] * Class221.anInt2880)
                                - -(is_514_[6] * Class181.anInt2398) - -8192)
                                >> -1539593938);
                        int i_569_
                                = ((is_514_[1] * za.anInt7275
                                - -(Class221.anInt2880 * is_514_[4])
                                - (-(is_514_[7] * Class181.anInt2398) - 8192))
                                >> 1283506798);
                        i_568_ += i_565_;
                        i_569_ += i_566_;
                        int i_570_
                                = (8192 + (Class181.anInt2398 * is_514_[8]
                                + is_514_[2] * za.anInt7275
                                + is_514_[5] * Class221.anInt2880)
                                >> 1839993582);
                        i_570_ += i_567_;
                        za.anInt7275 = i_568_;
                        Class221.anInt2880 = i_569_;
                        Class181.anInt2398 = i_570_;
                        Class348_Sub42_Sub16_Sub1.aBoolean10450 = false;
                    }
                    int[] is_571_ = new int[9];
                    int i_572_ = Class70.anIntArray1204[i_510_];
                    int i_573_ = Class70.anIntArray1207[i_510_];
                    int i_574_ = Class70.anIntArray1204[i_511_];
                    int i_575_ = Class70.anIntArray1207[i_511_];
                    int i_576_ = Class70.anIntArray1204[i_512_];
                    int i_577_ = Class70.anIntArray1207[i_512_];
                    int i_578_ = 8192 + i_576_ * i_573_ >> -1358416082;
                    int i_579_ = 8192 + i_573_ * i_577_ >> -156709842;
                    is_571_[6] = (8192 + (i_579_ * i_574_ + i_576_ * -i_575_)
                            >> -1205020754);
                    is_571_[8] = 8192 + i_572_ * i_574_ >> -912787058;
                    is_571_[4] = 8192 + i_572_ * i_576_ >> -1722808818;
                    is_571_[1] = (8192 + i_577_ * -i_574_ - -(i_578_ * i_575_)
                            >> 17192558);
                    is_571_[3] = i_572_ * i_577_ + 8192 >> 371247790;
                    is_571_[5] = -i_573_;
                    is_571_[0] = (8192 + (i_575_ * i_579_ + i_576_ * i_574_)
                            >> 2012268110);
                    is_571_[7] = (8192 + i_574_ * i_578_ + i_577_ * i_575_
                            >> -310130898);
                    is_571_[2] = i_575_ * i_572_ - -8192 >> -33618354;
                    int i_580_
                            = ((is_571_[1] * -Class221.anInt2880
                            + -za.anInt7275 * is_571_[0]
                            - (-(-Class181.anInt2398 * is_571_[2]) + -8192))
                            >> 1861082990);
                    int i_581_
                            = ((-za.anInt7275 * is_571_[3]
                            + is_571_[4] * -Class221.anInt2880
                            - -(is_571_[5] * -Class181.anInt2398) + 8192)
                            >> -1274857714);
                    int i_582_ = ((-Class181.anInt2398 * is_571_[8]
                            + (is_571_[6] * -za.anInt7275
                            - -(is_571_[7] * -Class221.anInt2880))
                            - -8192)
                            >> -203239634);
                    int i_583_ = i_580_ - -za.anInt7275;
                    int i_584_ = i_581_ - -Class221.anInt2880;
                    int i_585_ = Class181.anInt2398 + i_582_;
                    int[] is_586_ = new int[9];
                    for (int i_587_ = 0; i_587_ < 3; i_587_++) {
                        for (int i_588_ = 0; i_588_ < 3; i_588_++) {
                            int i_589_ = 0;
                            for (int i_590_ = 0; i_590_ < 3;
								 i_590_++)
                                i_589_ += (is_514_[3 * i_588_ - -i_590_]
                                        * is_571_[i_587_ * 3 - -i_590_]);
                            is_586_[i_588_ + 3 * i_587_]
                                    = i_589_ - -8192 >> 741433902;
                        }
                    }
                    int i_591_
                            = (is_571_[2] * i_567_ + (i_565_ * is_571_[0]
                            + i_566_ * is_571_[1] + 8192)
                            >> -1832864370);
                    int i_592_
                            = (8192 + (i_566_ * is_571_[4] + is_571_[3] * i_565_
                            + is_571_[5] * i_567_)
                            >> 1439981934);
                    int i_593_ = ((is_571_[8] * i_567_ + is_571_[7] * i_566_
                            + (is_571_[6] * i_565_ - -8192))
                            >> -1620814450);
                    i_592_ += i_584_;
                    i_591_ += i_583_;
                    i_593_ += i_585_;
                    int[] is_594_ = new int[9];
                    for (int i_595_ = 0; i_595_ < 3;
						 i_595_++) {
                        for (int i_596_ = 0; i_596_ < 3; i_596_++) {
                            int i_597_ = 0;
                            for (int i_598_ = 0; i_598_ < 3;
								 i_598_++)
                                i_597_ += (is_514_[3 * i_595_ + i_598_]
                                        * is_586_[3 * i_598_ + i_596_]);
                            is_594_[3 * i_595_ - -i_596_]
                                    = 8192 + i_597_ >> 1092908750;
                        }
                    }
                    int i_599_
                            = (8192 + is_514_[2] * i_593_ + (i_592_ * is_514_[1]
                            + i_591_ * is_514_[0])
                            >> 1107836206);
                    int i_600_
                            = (8192 + (is_514_[3] * i_591_ - -(is_514_[4] * i_592_)
                            - -(is_514_[5] * i_593_))
                            >> 733622254);
                    i_600_ += i_563_;
                    int i_601_
                            = (8192 + i_593_ * is_514_[8] + (is_514_[7] * i_592_
                            + i_591_ * is_514_[6])
                            >> -100917010);
                    i_599_ += i_562_;
                    i_601_ += i_564_;
                    for (int i_602_ = 0;
						 i_602_ < i_515_;
                         i_602_++) {
                        int i_603_ = is[i_602_];
                        if (i_603_ < anIntArrayArray5539.length) {
                            int[] is_604_ = anIntArrayArray5539[i_603_];
                            for (int i_605_ = 0;
                                 (i_605_ < is_604_.length);
                                 i_605_++) {
                                int i_606_ = is_604_[i_605_];
                                if (aShortArray5608 == null
                                        || (aShortArray5608[i_606_] & i_513_) != 0) {
                                    int i_607_
                                            = ((8192
                                            + (is_594_[2]
                                            * anIntArray5644[i_606_])
                                            + ((is_594_[1]
                                            * anIntArray5593[i_606_])
                                            + (is_594_[0]
                                            * anIntArray5543[i_606_])))
                                            >> -398271314);
                                    int i_608_
                                            = ((is_594_[5] * anIntArray5644[i_606_]
                                            + ((anIntArray5543[i_606_]
                                            * is_594_[3])
                                            + (is_594_[4]
                                            * anIntArray5593[i_606_]))
                                            + 8192)
                                            >> -739697650);
                                    i_607_ += i_599_;
                                    i_608_ += i_600_;
                                    int i_609_
                                            = ((8192
                                            + (is_594_[8]
                                            * anIntArray5644[i_606_])
                                            + ((anIntArray5543[i_606_]
                                            * is_594_[6])
                                            + (is_594_[7]
                                            * anIntArray5593[i_606_])))
                                            >> -1089303730);
                                    i_609_ += i_601_;
                                    anIntArray5543[i_606_] = i_607_;
                                    anIntArray5593[i_606_] = i_608_;
                                    anIntArray5644[i_606_] = i_609_;
                                }
                            }
                        }
                    }
                }
            } else if (i == 3) {
                if (is_514_ == null) {
                    for (int i_648_ = 0; i_515_ > i_648_; i_648_++) {
                        int i_649_ = is[i_648_];
                        if (i_649_ < anIntArrayArray5539.length) {
                            int[] is_650_ = anIntArrayArray5539[i_649_];
                            for (int i_651_ = 0;
                                 (i_651_ < is_650_.length);
                                 i_651_++) {
                                int i_652_ = is_650_[i_651_];
                                if (aShortArray5608 == null
                                        || ((i_513_ & aShortArray5608[i_652_])
                                        != 0)) {
                                    anIntArray5543[i_652_] -= za.anInt7275;
                                    anIntArray5593[i_652_]
                                            -= Class221.anInt2880;
                                    anIntArray5644[i_652_]
                                            -= Class181.anInt2398;
                                    anIntArray5543[i_652_]
                                            = (anIntArray5543[i_652_] * i_510_
                                            >> -344014361);
                                    anIntArray5593[i_652_]
                                            = (anIntArray5593[i_652_] * i_511_
                                            >> -2070406681);
                                    anIntArray5644[i_652_]
                                            = (i_512_ * anIntArray5644[i_652_]
                                            >> 651777543);
                                    anIntArray5543[i_652_] += za.anInt7275;
                                    anIntArray5593[i_652_]
                                            += Class221.anInt2880;
                                    anIntArray5644[i_652_]
                                            += Class181.anInt2398;
                                }
                            }
                        }
                    }
                } else {
                    int i_610_ = is_514_[9] << 1892600196;
                    int i_611_ = is_514_[10] << -1931033436;
                    int i_612_ = is_514_[11] << 1566382404;
                    int i_613_ = is_514_[12] << -691155644;
                    int i_614_ = is_514_[13] << 1440290980;
                    int i_615_ = is_514_[14] << -1500829340;
                    if (Class348_Sub42_Sub16_Sub1.aBoolean10450) {
                        int i_616_
                                = (8192 + (za.anInt7275 * is_514_[0]
                                - -(Class221.anInt2880 * is_514_[3])
                                - -(is_514_[6] * Class181.anInt2398))
                                >> -38788754);
                        int i_617_
                                = (8192 + (is_514_[7] * Class181.anInt2398
                                + (Class221.anInt2880 * is_514_[4]
                                + is_514_[1] * za.anInt7275))
                                >> 997809166);
                        i_617_ += i_614_;
                        int i_618_
                                = ((is_514_[5] * Class221.anInt2880
                                + za.anInt7275 * is_514_[2]
                                + is_514_[8] * Class181.anInt2398 - -8192)
                                >> -891982354);
                        i_616_ += i_613_;
                        Class221.anInt2880 = i_617_;
                        i_618_ += i_615_;
                        za.anInt7275 = i_616_;
                        Class348_Sub42_Sub16_Sub1.aBoolean10450 = false;
                        Class181.anInt2398 = i_618_;
                    }
                    int i_619_ = i_510_ << 202759983 >> -1386794041;
                    int i_620_ = i_511_ << 2104933359 >> -1503182073;
                    int i_621_ = i_512_ << 1788191215 >> -817909977;
                    int i_622_ = -za.anInt7275 * i_619_ + 8192 >> -118019794;
                    int i_623_
                            = i_620_ * -Class221.anInt2880 + 8192 >> -911667282;
                    int i_624_
                            = -Class181.anInt2398 * i_621_ - -8192 >> -1189048658;
                    int i_625_ = i_622_ + za.anInt7275;
                    int i_626_ = i_623_ - -Class221.anInt2880;
                    int i_627_ = Class181.anInt2398 + i_624_;
                    int[] is_628_ = new int[9];
                    is_628_[1] = 8192 + is_514_[3] * i_619_ >> -1866878354;
                    is_628_[0] = is_514_[0] * i_619_ - -8192 >> -1790764946;
                    is_628_[2] = i_619_ * is_514_[6] + 8192 >> 1511134510;
                    is_628_[6] = i_621_ * is_514_[2] - -8192 >> -889945906;
                    is_628_[5] = i_620_ * is_514_[7] - -8192 >> -672738162;
                    is_628_[4] = i_620_ * is_514_[4] - -8192 >> 167519118;
                    is_628_[3] = 8192 + i_620_ * is_514_[1] >> 247072462;
                    is_628_[7] = i_621_ * is_514_[5] + 8192 >> 236565806;
                    is_628_[8] = 8192 + i_621_ * is_514_[8] >> -1305154578;
                    int i_629_ = 8192 + i_619_ * i_613_ >> -476199474;
                    int i_630_ = i_620_ * i_614_ - -8192 >> -2031762706;
                    i_630_ += i_626_;
                    int i_631_ = 8192 + i_615_ * i_621_ >> 1120807918;
                    i_629_ += i_625_;
                    i_631_ += i_627_;
                    int[] is_632_ = new int[9];
                    for (int i_633_ = 0; i_633_ < 3;
						 i_633_++) {
                        for (int i_634_ = 0; i_634_ < 3; i_634_++) {
                            int i_635_ = 0;
                            for (int i_636_ = 0; i_636_ < 3; i_636_++)
                                i_635_ += (is_514_[3 * i_633_ - -i_636_]
                                        * is_628_[3 * i_636_ + i_634_]);
                            is_632_[i_633_ * 3 + i_634_]
                                    = 8192 + i_635_ >> -708849746;
                        }
                    }
                    int i_637_ = ((is_514_[1] * i_630_ + is_514_[0] * i_629_
                            + i_631_ * is_514_[2] + 8192)
                            >> -835508466);
                    int i_638_
                            = ((8192 + (i_631_ * is_514_[5] + is_514_[3] * i_629_)
                            - -(is_514_[4] * i_630_))
                            >> 1925912078);
                    int i_639_
                            = (i_629_ * is_514_[6] + (i_630_ * is_514_[7]
                            - (-(is_514_[8] * i_631_)
                            - 8192))
                            >> -1985374162);
                    i_637_ += i_610_;
                    i_638_ += i_611_;
                    i_639_ += i_612_;
                    for (int i_640_ = 0;
						 i_640_ < i_515_;
                         i_640_++) {
                        int i_641_ = is[i_640_];
                        if (anIntArrayArray5539.length > i_641_) {
                            int[] is_642_ = anIntArrayArray5539[i_641_];
                            for (int i_643_ = 0; is_642_.length > i_643_;
                                 i_643_++) {
                                int i_644_ = is_642_[i_643_];
                                if (aShortArray5608 == null
                                        || (aShortArray5608[i_644_] & i_513_) != 0) {
                                    int i_645_
                                            = ((8192
                                            + (is_632_[1]
                                            * anIntArray5593[i_644_])
                                            + ((is_632_[0]
                                            * anIntArray5543[i_644_])
                                            + (is_632_[2]
                                            * anIntArray5644[i_644_])))
                                            >> 523527118);
                                    int i_646_
                                            = ((is_632_[4] * anIntArray5593[i_644_]
                                            + (anIntArray5543[i_644_]
                                            * is_632_[3])
                                            - (-(is_632_[5]
                                            * anIntArray5644[i_644_])
                                            - 8192))
                                            >> -1345847666);
                                    i_645_ += i_637_;
                                    i_646_ += i_638_;
                                    int i_647_
                                            = ((is_632_[7] * anIntArray5593[i_644_]
                                            + (is_632_[6]
                                            * anIntArray5543[i_644_])
                                            - -(is_632_[8]
                                            * anIntArray5644[i_644_])
                                            - -8192)
                                            >> -300118258);
                                    anIntArray5543[i_644_] = i_645_;
                                    i_647_ += i_639_;
                                    anIntArray5593[i_644_] = i_646_;
                                    anIntArray5644[i_644_] = i_647_;
                                }
                            }
                        }
                    }
                }
			} else if (i == 5) {
                if (anIntArrayArray5553 != null) {
                    for (int i_653_ = 0;
						 i_653_ < i_515_;
                         i_653_++) {
                        int i_654_ = is[i_653_];
                        if (i_654_ < anIntArrayArray5553.length) {
                            int[] is_655_ = anIntArrayArray5553[i_654_];
                            for (int i_656_ = 0; is_655_.length > i_656_;
                                 i_656_++) {
                                int i_657_ = is_655_[i_656_];
                                if (aShortArray5573 == null
                                        || (aShortArray5573[i_657_] & i_513_) != 0) {
                                    int i_658_
                                            = ((aByteArray5542[i_657_] & 0xff)
                                            - -(8 * i_510_));
                                    if (i_658_ < 0)
                                        i_658_ = 0;
                                    else if (i_658_ > 255)
                                        i_658_ = 255;
                                    aByteArray5542[i_657_] = (byte) i_658_;
                                    if (aClass123_5610 != null)
                                        aClass123_5610
                                                .anInterface2_1811
                                                = null;
                                }
                            }
                        }
                    }
                    if (aClass118Array5621 != null) {
                        for (int i_659_ = 0; i_659_ < anInt5536; i_659_++) {
                            Class118 class118 = aClass118Array5621[i_659_];
                            Class48 class48 = aClass48Array5596[i_659_];
                            class48.anInt858
                                    = ((255 + -(0xff & (aByteArray5542
                                    [(class118
                                    .anInt1783)]))
                                    << -324942696)
                                    | class48.anInt858 & 0xffffff);
                        }
                    }
                }
            } else if (i == 7) {
                if (anIntArrayArray5553 != null) {
                    for (int i_660_ = 0;
						 i_515_ > i_660_;
                         i_660_++) {
                        int i_661_ = is[i_660_];
                        if (anIntArrayArray5553.length > i_661_) {
                            int[] is_662_ = anIntArrayArray5553[i_661_];
                            for (int i_663_ = 0;
                                 (is_662_.length > i_663_);
                                 i_663_++) {
                                int i_664_ = is_662_[i_663_];
                                if (aShortArray5573 == null
                                        || (aShortArray5573[i_664_] & i_513_) != 0) {
                                    int i_665_
                                            = aShortArray5580[i_664_] & 0xffff;
                                    int i_666_
                                            = (0xfc7e & i_665_) >> 1469740010;
                                    int i_667_ = (i_665_ & 0x3ed) >> -41924633;
                                    i_667_ += i_511_ / 4;
                                    int i_668_ = 0x7f & i_665_;
                                    i_666_ = i_666_ + i_510_ & 0x3f;
                                    if (i_667_ < 0)
                                        i_667_ = 0;
                                    else if (i_667_ > 7)
                                        i_667_ = 7;
                                    i_668_ += i_512_;
                                    if (i_668_ < 0)
                                        i_668_ = 0;
                                    else if (i_668_ > 127)
                                        i_668_ = 127;
                                    aShortArray5580[i_664_]
                                            = (short) (Class273.method2057
                                            (i_668_,
                                                    (Class273.method2057
                                                            (i_666_ << 1117163370,
                                                                    i_667_ << 1083573575))));
                                    if (aClass123_5610 != null)
                                        aClass123_5610
                                                .anInterface2_1811
                                                = null;
                                }
                            }
                        }
                    }
                    if (aClass118Array5621 != null) {
                        for (int i_669_ = 0;
							 anInt5536 > i_669_;
                             i_669_++) {
                            Class118 class118 = aClass118Array5621[i_669_];
                            Class48 class48 = aClass48Array5596[i_669_];
                            class48.anInt858
                                    = (0xffffff & (Class10.anIntArray179
                                    [(aShortArray5580
                                    [(class118
                                    .anInt1783)]) & 0xffff])
                                    | class48.anInt858 & ~0xffffff);
                        }
                    }
                }
            } else if (i == 8) {
                if (anIntArrayArray5627 != null) {
                    for (int i_670_ = 0; i_515_ > i_670_; i_670_++) {
                        int i_671_ = is[i_670_];
                        if (i_671_ < anIntArrayArray5627.length) {
                            int[] is_672_ = anIntArrayArray5627[i_671_];
                            for (int i_673_ = 0; is_672_.length > i_673_;
                                 i_673_++) {
                                Class48 class48
                                        = aClass48Array5596[is_672_[i_673_]];
                                class48.anInt847 += i_511_;
                                class48.anInt854 += i_510_;
                            }
                        }
                    }
                }
            } else if (i == 10) {
                if (anIntArrayArray5627 != null) {
                    for (int i_674_ = 0;
						 i_674_ < i_515_;
                         i_674_++) {
                        int i_675_ = is[i_674_];
                        if (i_675_ < anIntArrayArray5627.length) {
                            int[] is_676_ = anIntArrayArray5627[i_675_];
                            for (int i_677_ = 0; i_677_ < is_676_.length;
                                 i_677_++) {
                                Class48 class48
                                        = aClass48Array5596[is_676_[i_677_]];
                                class48.anInt857
                                        = (i_511_ * class48.anInt857
                                        >> 1471674151);
                                class48.anInt856
                                        = (i_510_ * class48.anInt856
                                        >> -1297445913);
                            }
                        }
                    }
                }
            } else if (i == 9) {
                if (anIntArrayArray5627 != null) {
                    for (int i_678_ = 0;
						 i_678_ < i_515_;
                         i_678_++) {
                        int i_679_ = is[i_678_];
                        if (i_679_ < anIntArrayArray5627.length) {
                            int[] is_680_ = anIntArrayArray5627[i_679_];
                            for (int i_681_ = 0; is_680_.length > i_681_;
                                 i_681_++) {
                                Class48 class48
                                        = aClass48Array5596[is_680_[i_681_]];
                                class48.anInt853
                                        = 0x3fff & (class48.anInt853
                                        + i_510_);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.I(" + i + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_510_ + ',' + i_511_
                            + ',' + i_512_ + ',' + bool + ','
                            + i_513_ + ','
                            + (is_514_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    private final void method692(byte i) {
        anInt5568++;
        int i_682_ = 32767;
        int i_683_ = 32767;
        int i_684_ = 32767;
        int i_685_ = -32768;
        int i_686_ = -32768;
        int i_687_ = -32768;
        int i_688_ = 0;
        int i_689_ = 0;
        for (int i_690_ = 0; i_690_ < anInt5557; i_690_++) {
            int i_691_ = anIntArray5543[i_690_];
            int i_692_ = anIntArray5593[i_690_];
            if (i_692_ > i_686_)
                i_686_ = i_692_;
            if (i_692_ < i_683_)
                i_683_ = i_692_;
            int i_693_ = anIntArray5644[i_690_];
            if (i_685_ < i_691_)
                i_685_ = i_691_;
            if (i_682_ > i_691_)
                i_682_ = i_691_;
            if (i_693_ > i_687_)
                i_687_ = i_693_;
            if (i_684_ > i_693_)
                i_684_ = i_693_;
            int i_694_ = i_691_ * i_691_ + i_693_ * i_693_;
            if (i_694_ > i_688_)
                i_688_ = i_694_;
            i_694_ = i_693_ * i_693_ + (i_691_ * i_691_ + i_692_ * i_692_);
            if (i_694_ > i_689_)
                i_689_ = i_694_;
        }
        aShort5591 = (short) i_683_;
        aShort5617 = (short) i_684_;
        if (i != -123)
            method618();
        aShort5646 = (short) i_687_;
        aShort5540 = (short) i_682_;
        aShort5629 = (short) i_686_;
        aShort5586 = (short) i_685_;
        aShort5634 = (short) (int) (0.99 + Math.sqrt(i_688_));
        aShort5559 = (short) (int) (0.99 + Math.sqrt(i_689_));
        aBoolean5527 = true;
    }

    final int fa() {
        anInt5635++;
        if (!aBoolean5527)
            method692((byte) -123);
        return aShort5591;
    }

    Class64_Sub3(ha_Sub2 var_ha_Sub2) {
        aBoolean5527 = false;
        anInt5529 = 0;
        anInt5632 = 0;
        anInt5557 = 0;
        anInt5642 = 0;
        aBoolean5638 = false;
        try {
            aHa_Sub2_5598 = var_ha_Sub2;
            aClass123_5605 = new Class123(null, 5126, 3, 0);
            aClass123_5620 = new Class123(null, 5126, 2, 0);
            aClass123_5563 = new Class123(null, 5126, 3, 0);
            aClass123_5610 = new Class123(null, 5121, 4, 0);
            aClass270_5575 = new Class270();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("paa.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    Class64_Sub3(ha_Sub2 var_ha_Sub2, Class124 class124, int i, int i_695_,
                 int i_696_, int i_697_) {
        aBoolean5527 = false;
        anInt5529 = 0;
        anInt5632 = 0;
        anInt5557 = 0;
        anInt5642 = 0;
        aBoolean5638 = false;
        do {
            try {
                anInt5556 = i_697_;
                anInt5648 = i;
                aHa_Sub2_5598 = var_ha_Sub2;
                if (Class64.method616(2, i, i_697_))
                    aClass123_5605 = new Class123(null, 5126, 3, 0);
                if (Class137.method1163(i_697_, (byte) 78, i))
                    aClass123_5620 = new Class123(null, 5126, 2, 0);
                if (aa_Sub3.method166((byte) 69, i_697_, i))
                    aClass123_5563 = new Class123(null, 5126, 3, 0);
                if (Class146.method1193(i_697_, i, true))
                    aClass123_5610 = new Class123(null, 5121, 4, 0);
                if (Class156.method1238(i, i_697_, -31))
                    aClass270_5575 = new Class270();
                d var_d = var_ha_Sub2.aD4579;
                anIntArray5528 = new int[class124.anInt1821 + 1];
                int[] is = new int[class124.anInt1817];
                for (int i_698_ = 0;
                     (i_698_ < class124.anInt1817);
                     i_698_++) {
                    if (class124.aByteArray1843 == null
                            || class124.aByteArray1843[i_698_] != 2) {
                        if (class124.aShortArray1822 != null
                                && (class124.aShortArray1822[i_698_]
                                != -1)) {
                            Class12 class12
                                    = var_d.method3(((class124
                                            .aShortArray1822[i_698_])
                                            & 0xffff),
                                    -6662);
                            if (((anInt5556 & 0x40) == 0
                                    || !class12.aBoolean209)
                                    && class12.aBoolean204)
                                continue;
                        }
                        is[anInt5632++] = i_698_;
                        anIntArray5528[(class124.aShortArray1863
                                [i_698_])]++;
                        anIntArray5528[(class124.aShortArray1835
                                [i_698_])]++;
                        anIntArray5528[(class124.aShortArray1855
                                [i_698_])]++;
                    }
                }
                anInt5537 = anInt5632;
                long[] ls = new long[anInt5632];
                boolean bool = (0x100 & anInt5648) != 0;
                for (int i_699_ = 0; anInt5632 > i_699_; i_699_++) {
                    int i_700_ = is[i_699_];
                    Class12 class12 = null;
                    int i_701_ = 0;
                    int i_702_ = 0;
                    int i_703_ = 0;
                    int i_704_ = 0;
                    if (class124.aClass162Array1832 != null) {
                        boolean bool_705_ = false;
                        for (int i_706_ = 0;
                             (class124.aClass162Array1832.length
                                     > i_706_);
                             i_706_++) {
                            Class162 class162 = (class124
                                    .aClass162Array1832[i_706_]);
                            if (i_700_ == class162.anInt2155) {
                                Class189 class189
                                        = Class73.method742(104,
                                        (class162
                                                .anInt2153));
                                if (class189.aBoolean2531)
                                    bool_705_ = true;
                                if (class189.anInt2525 != -1) {
                                    Class12 class12_707_
                                            = var_d.method3((class189
                                                    .anInt2525),
                                            -6662);
                                    if (class12_707_.anInt200 == 2)
                                        aBoolean5595 = true;
                                }
                            }
                        }
                        if (bool_705_) {
                            ls[i_699_] = 9223372036854775807L;
                            anInt5537--;
                            continue;
                        }
                    }
                    int i_708_ = -1;
                    if (class124.aShortArray1822 != null) {
                        i_708_ = class124.aShortArray1822[i_700_];
                        if (i_708_ != -1) {
                            class12 = var_d.method3(i_708_ & 0xffff, -6662);
                            if ((anInt5556 & 0x40) != 0
                                    && class12.aBoolean209) {
                                i_708_ = -1;
                                class12 = null;
                            } else {
                                i_704_ = class12.aByte202;
                                if (class12.aByte198 != 0
                                        || class12.aByte211 != 0)
                                    aBoolean5638 = true;
                                i_703_ = class12.aByte213;
                            }
                        }
                    }
                    boolean bool_709_
                            = ((class124.aByteArray1834 != null
                            && (class124.aByteArray1834[i_700_]
                            != 0))
                            || (class12 != null
                            && class12.anInt200 != 0));
                    if ((bool || bool_709_)
                            && class124.aByteArray1839 != null)
                        i_701_ += (class124.aByteArray1839[i_700_]
                                << 1029512945);
                    if (bool_709_)
                        i_701_ += 65536;
                    i_701_ += (0xff & i_703_) << 1613450920;
                    i_701_ += i_704_ & 0xff;
                    i_702_ += (i_708_ & 0xffff) << -1265253552;
                    i_702_ += i_699_ & 0xffff;
                    ls[i_699_]
                            = ((long) i_701_ << -1817124384) - -(long) i_702_;
                    Class64_Sub3 class64_sub3_710_ = this;
                    class64_sub3_710_.aBoolean5638
                            = (class64_sub3_710_.aBoolean5638
                            | (class12 != null
                            && (class12.aByte198 != 0
                            || class12.aByte211 != 0)));
                    aBoolean5595 |= bool_709_;
                }
                Class348_Sub16_Sub2.method2832(is, ls, 0);
                anIntArray5644 = class124.anIntArray1852;
                anIntArray5593 = class124.anIntArray1847;
                anInt5642 = class124.anInt1836;
                anIntArray5543 = class124.anIntArray1841;
                aShortArray5608 = class124.aShortArray1842;
                anInt5557 = class124.anInt1821;
                aClass342Array5541 = class124.aClass342Array1866;
                Class8[] class8s = new Class8[anInt5557];
                aClass129Array5640 = class124.aClass129Array1846;
                if (class124.aClass162Array1832 != null) {
                    anInt5536
                            = class124.aClass162Array1832.length;
                    aClass48Array5596 = new Class48[anInt5536];
                    aClass118Array5621 = new Class118[anInt5536];
                    for (int i_711_ = 0;
						 anInt5536 > i_711_;
                         i_711_++) {
                        Class162 class162
                                = class124.aClass162Array1832[i_711_];
                        Class189 class189
                                = Class73.method742(104, (class162
                                .anInt2153));
                        int i_712_ = -1;
                        for (int i_713_ = 0;
							 i_713_ < anInt5632;
                             i_713_++) {
                            if (class162.anInt2155 == is[i_713_]) {
                                i_712_ = i_713_;
                                break;
                            }
                        }
                        if (i_712_ == -1)
                            throw new RuntimeException();
                        int i_714_
                                = ((Class10.anIntArray179
                                [0xffff & (class124
                                .aShortArray1862
                                [class162.anInt2155])])
                                & 0xffffff);
                        i_714_ = i_714_ | (255 + -((class124
                                .aByteArray1834) == null
                                ? 0
                                : (class124
                                .aByteArray1834
                                [(class162
                                .anInt2155)]))
                                << -1265180360);
                        aClass118Array5621[i_711_]
                                = new Class118(i_712_,
                                (class124
                                        .aShortArray1863
                                        [class162.anInt2155]),
                                (class124
                                        .aShortArray1835
                                        [class162.anInt2155]),
                                (class124
                                        .aShortArray1855
                                        [class162.anInt2155]),
                                class189.anInt2526,
                                class189.anInt2530,
                                class189.anInt2525,
                                class189.anInt2533,
                                class189.anInt2534,
                                class189.aBoolean2531,
                                class189.aBoolean2522,
                                class162.anInt2158);
                        aClass48Array5596[i_711_] = new Class48(i_714_);
                    }
                }
                int i_715_ = anInt5632 * 3;
                aShortArray5649 = new short[i_715_];
                Class258_Sub2.aLongArray8530 = new long[i_715_];
                aShortArray5601 = new short[anInt5632];
                aFloatArray5571 = new float[i_715_];
                aShortArray5564 = new short[i_715_];
                aShortArray5576 = new short[i_715_];
                aByteArray5594 = new byte[i_715_];
                aShortArray5583 = new short[i_715_];
                if (class124.aShortArray1856 != null)
                    aShortArray5573 = new short[anInt5632];
                aShort5544 = (short) i_695_;
                aShortArray5580 = new short[anInt5632];
                aShortArray5579 = new short[anInt5632];
                aShortArray5592 = new short[anInt5632];
                aShort5645 = (short) i_696_;
                aByteArray5542 = new byte[anInt5632];
                aFloatArray5552 = new float[i_715_];
                aShortArray5566 = new short[anInt5632];
                int i_716_ = 0;
                for (int i_717_ = 0; i_717_ < class124.anInt1821;
                     i_717_++) {
                    int i_718_ = anIntArray5528[i_717_];
                    anIntArray5528[i_717_] = i_716_;
                    class8s[i_717_] = new Class8();
                    i_716_ += i_718_;
                }
                anIntArray5528[class124.anInt1821] = i_716_;
                Class358 class358 = Class59_Sub2_Sub1.method565(255, anInt5632,
                        class124, is);
                Class347[] class347s
                        = new Class347[class124.anInt1817];
                for (int i_719_ = 0; class124.anInt1817 > i_719_;
                     i_719_++) {
                    short i_720_
                            = class124.aShortArray1863[i_719_];
                    short i_721_
                            = class124.aShortArray1835[i_719_];
                    short i_722_
                            = class124.aShortArray1855[i_719_];
                    int i_723_
                            = anIntArray5543[i_721_] + -anIntArray5543[i_720_];
                    int i_724_
                            = anIntArray5593[i_721_] - anIntArray5593[i_720_];
                    int i_725_
                            = -anIntArray5644[i_720_] + anIntArray5644[i_721_];
                    int i_726_
                            = -anIntArray5543[i_720_] + anIntArray5543[i_722_];
                    int i_727_
                            = anIntArray5593[i_722_] + -anIntArray5593[i_720_];
                    int i_728_
                            = -anIntArray5644[i_720_] + anIntArray5644[i_722_];
                    int i_729_ = i_724_ * i_728_ + -(i_727_ * i_725_);
                    int i_730_ = -(i_728_ * i_723_) + i_726_ * i_725_;
                    int i_731_;
                    for (i_731_ = -(i_724_ * i_726_) + i_727_ * i_723_;
                         (i_729_ > 8192
                                 || i_730_ > 8192 || i_731_ > 8192
                                 || i_729_ < -8192 || i_730_ < -8192
                                 || i_731_ < -8192);
                         i_730_ >>= 1) {
                        i_729_ >>= 1;
                        i_731_ >>= 1;
                    }
                    int i_732_ = (int) Math.sqrt(i_731_ * i_731_
                            + i_730_ * i_730_
                            + i_729_ * i_729_);
                    if (i_732_ <= 0)
                        i_732_ = 1;
                    i_731_ = i_731_ * 256 / i_732_;
                    i_729_ = i_729_ * 256 / i_732_;
                    i_730_ = 256 * i_730_ / i_732_;
                    byte i_733_
                            = (class124.aByteArray1843 == null
                            ? (byte) 0
                            : class124.aByteArray1843[i_719_]);
                    if (i_733_ == 0) {
                        Class8 class8 = class8s[i_720_];
                        class8.anInt162 += i_730_;
                        class8.anInt159 += i_731_;
                        class8.anInt160++;
                        class8.anInt161 += i_729_;
                        class8 = class8s[i_721_];
                        class8.anInt161 += i_729_;
                        class8.anInt162 += i_730_;
                        class8.anInt160++;
                        class8.anInt159 += i_731_;
                        class8 = class8s[i_722_];
                        class8.anInt160++;
                        class8.anInt159 += i_731_;
                        class8.anInt162 += i_730_;
                        class8.anInt161 += i_729_;
                    } else if (i_733_ == 1) {
                        Class347 class347 = class347s[i_719_] = new Class347();
                        class347.anInt4283 = i_731_;
                        class347.anInt4279 = i_730_;
                        class347.anInt4282 = i_729_;
                    }
                }
                for (int i_734_ = 0; anInt5632 > i_734_; i_734_++) {
                    int i_735_ = is[i_734_];
                    int i_736_ = (class124.aShortArray1862[i_735_]
                            & 0xffff);
                    int i_737_;
                    if (class124.aByteArray1820 != null)
                        i_737_ = class124.aByteArray1820[i_735_];
                    else
                        i_737_ = -1;
                    int i_738_;
                    if (class124.aByteArray1834 != null)
                        i_738_ = 0xff & (class124.aByteArray1834
                                [i_735_]);
                    else
                        i_738_ = 0;
                    short i_739_
                            = (class124.aShortArray1822 == null
                            ? (short) -1
                            : class124.aShortArray1822[i_735_]);
                    if (i_739_ != -1
                            && (0x40 & anInt5556) != 0) {
                        Class12 class12
                                = var_d.method3(i_739_ & 0xffff, -6662);
                        if (class12.aBoolean209)
                            i_739_ = (short) -1;
                    }
                    float f = 0.0F;
                    float f_740_ = 0.0F;
                    float f_741_ = 0.0F;
                    float f_742_ = 0.0F;
                    float f_743_ = 0.0F;
                    float f_744_ = 0.0F;
                    int i_745_ = 0;
                    int i_746_ = 0;
                    int i_747_ = 0;
                    if (i_739_ != -1) {
                        if (i_737_ == -1) {
                            f_742_ = 1.0F;
                            i_746_ = 2;
                            f_744_ = 0.0F;
                            i_745_ = 1;
                            f_740_ = 1.0F;
                            f = 0.0F;
                            f_743_ = 0.0F;
                            f_741_ = 1.0F;
                        } else {
                            i_737_ &= 0xff;
                            byte i_748_
                                    = class124.aByteArray1823[i_737_];
                            if (i_748_ == 0) {
                                short i_749_ = (class124
                                        .aShortArray1863[i_735_]);
                                short i_750_ = (class124
                                        .aShortArray1835[i_735_]);
                                short i_751_ = (class124
                                        .aShortArray1855[i_735_]);
                                short i_752_ = (class124
                                        .aShortArray1829[i_737_]);
                                short i_753_ = (class124
                                        .aShortArray1849[i_737_]);
                                short i_754_ = (class124
                                        .aShortArray1825[i_737_]);
                                float f_755_
                                        = (float) (class124
                                        .anIntArray1841[i_752_]);
                                float f_756_
                                        = (float) (class124
                                        .anIntArray1847[i_752_]);
                                float f_757_
                                        = (float) (class124
                                        .anIntArray1852[i_752_]);
                                float f_758_
                                        = ((float) (class124
                                        .anIntArray1841[i_753_])
                                        - f_755_);
                                float f_759_
                                        = ((float) (class124
                                        .anIntArray1847[i_753_])
                                        - f_756_);
                                float f_760_
                                        = (-f_757_
                                        + (float) (class124
                                        .anIntArray1852[i_753_]));
                                float f_761_
                                        = ((float) (class124
                                        .anIntArray1841[i_754_])
                                        - f_755_);
                                float f_762_
                                        = (-f_756_
                                        + (float) (class124
                                        .anIntArray1847[i_754_]));
                                float f_763_
                                        = (-f_757_
                                        + (float) (class124
                                        .anIntArray1852[i_754_]));
                                float f_764_
                                        = (-f_755_
                                        + (float) (class124
                                        .anIntArray1841[i_749_]));
                                float f_765_
                                        = ((float) (class124
                                        .anIntArray1847[i_749_])
                                        - f_756_);
                                float f_766_
                                        = ((float) (class124
                                        .anIntArray1852[i_749_])
                                        - f_757_);
                                float f_767_
                                        = (-f_755_
                                        + (float) (class124
                                        .anIntArray1841[i_750_]));
                                float f_768_
                                        = (-f_756_
                                        + (float) (class124
                                        .anIntArray1847[i_750_]));
                                float f_769_
                                        = (-f_757_
                                        + (float) (class124
                                        .anIntArray1852[i_750_]));
                                float f_770_
                                        = (-f_755_
                                        + (float) (class124
                                        .anIntArray1841[i_751_]));
                                float f_771_
                                        = (-f_756_
                                        + (float) (class124
                                        .anIntArray1847[i_751_]));
                                float f_772_
                                        = (-f_757_
                                        + (float) (class124
                                        .anIntArray1852[i_751_]));
                                float f_773_
                                        = -(f_760_ * f_762_) + f_759_ * f_763_;
                                float f_774_
                                        = -(f_763_ * f_758_) + f_761_ * f_760_;
                                float f_775_
                                        = f_762_ * f_758_ - f_761_ * f_759_;
                                float f_776_
                                        = -(f_763_ * f_774_) + f_775_ * f_762_;
                                float f_777_
                                        = -(f_761_ * f_775_) + f_763_ * f_773_;
                                float f_778_
                                        = f_774_ * f_761_ - f_762_ * f_773_;
                                float f_779_ = 1.0F / (f_760_ * f_778_
                                        + (f_759_ * f_777_
                                        + f_776_ * f_758_));
                                f_743_ = f_779_ * (f_770_ * f_776_
                                        + f_777_ * f_771_
                                        + f_772_ * f_778_);
                                f = f_779_ * (f_776_ * f_764_ + f_777_ * f_765_
                                        + f_778_ * f_766_);
                                f_741_ = f_779_ * (f_769_ * f_778_
                                        + (f_767_ * f_776_
                                        + f_777_ * f_768_));
                                f_778_ = -(f_773_ * f_759_) + f_758_ * f_774_;
                                f_776_ = f_759_ * f_775_ - f_774_ * f_760_;
                                f_777_ = f_760_ * f_773_ - f_775_ * f_758_;
                                f_779_ = 1.0F / (f_763_ * f_778_
                                        + (f_761_ * f_776_
                                        + f_777_ * f_762_));
                                f_742_ = (f_767_ * f_776_ + f_777_ * f_768_
                                        + f_778_ * f_769_) * f_779_;
                                f_740_ = (f_778_ * f_766_
                                        + (f_777_ * f_765_
                                        + f_764_ * f_776_)) * f_779_;
                                f_744_ = (f_777_ * f_771_ + f_776_ * f_770_
                                        + f_772_ * f_778_) * f_779_;
                            } else {
                                short i_780_ = (class124
                                        .aShortArray1863[i_735_]);
                                short i_781_ = (class124
                                        .aShortArray1835[i_735_]);
                                short i_782_ = (class124
                                        .aShortArray1855[i_735_]);
                                int i_783_ = (class358
                                        .anIntArray4416[i_737_]);
                                int i_784_ = (class358
                                        .anIntArray4415[i_737_]);
                                int i_785_ = (class358
                                        .anIntArray4414[i_737_]);
                                float[] fs = (class358
                                        .aFloatArrayArray4412[i_737_]);
                                byte i_786_ = (class124
                                        .aByteArray1853[i_737_]);
                                float f_787_
                                        = ((float) (class124
                                        .anIntArray1867[i_737_])
                                        / 256.0F);
                                if (i_748_ == 1) {
                                    float f_805_
                                            = ((float) (class124
                                            .anIntArray1844[i_737_])
                                            / 1024.0F);
                                    Class246.method1885
                                            (i_785_,
                                                    (class124.anIntArray1852
                                                            [i_780_]),
                                                    i_786_, 8,
                                                    (class124.anIntArray1841
                                                            [i_780_]),
                                                    Class152.aFloatArray2075,
                                                    (class124.anIntArray1847
                                                            [i_780_]),
                                                    f_787_, i_784_, i_783_, f_805_, fs);
                                    f = Class152.aFloatArray2075[0];
                                    f_740_ = Class152.aFloatArray2075[1];
                                    Class246.method1885
                                            (i_785_,
                                                    (class124.anIntArray1852
                                                            [i_781_]),
                                                    i_786_, 8,
                                                    (class124.anIntArray1841
                                                            [i_781_]),
                                                    Class152.aFloatArray2075,
                                                    (class124.anIntArray1847
                                                            [i_781_]),
                                                    f_787_, i_784_, i_783_, f_805_, fs);
                                    f_741_ = Class152.aFloatArray2075[0];
                                    f_742_ = Class152.aFloatArray2075[1];
                                    Class246.method1885
                                            (i_785_,
                                                    (class124.anIntArray1852
                                                            [i_782_]),
                                                    i_786_, 8,
                                                    (class124.anIntArray1841
                                                            [i_782_]),
                                                    Class152.aFloatArray2075,
                                                    (class124.anIntArray1847
                                                            [i_782_]),
                                                    f_787_, i_784_, i_783_, f_805_, fs);
                                    f_743_ = Class152.aFloatArray2075[0];
                                    f_744_ = Class152.aFloatArray2075[1];
                                    float f_806_ = f_805_ / 2.0F;
                                    if ((0x1 & i_786_) == 0) {
                                        if (f_806_ < -f + f_743_) {
                                            f_743_ -= f_805_;
                                            i_746_ = 1;
                                        } else {
                                            if (f_806_ < f - f_743_) {
                                                f_743_ += f_805_;
                                                i_746_ = 2;
                                            }
                                        }
										if (f_741_ - f > f_806_) {
                                            i_745_ = 1;
                                            f_741_ -= f_805_;
                                        } else {
                                            if (-f_741_ + f > f_806_) {
                                                i_745_ = 2;
                                                f_741_ += f_805_;
                                            }
                                        }
									} else {
                                        if (f_742_ - f_740_ > f_806_) {
                                            f_742_ -= f_805_;
                                            i_745_ = 1;
                                        } else {
                                            if (f_740_ - f_742_ > f_806_) {
                                                i_745_ = 2;
                                                f_742_ += f_805_;
                                            }
                                        }
										if (f_806_ < -f_740_ + f_744_) {
                                            i_746_ = 1;
                                            f_744_ -= f_805_;
                                        } else {
                                            if (-f_744_ + f_740_ > f_806_) {
                                                i_746_ = 2;
                                                f_744_ += f_805_;
                                            }
                                        }
									}
								} else {
                                    if (i_748_ == 2) {
                                        float f_788_
                                                = ((float) (class124
                                                .anIntArray1857
                                                [i_737_])
                                                / 256.0F);
                                        float f_789_
                                                = ((float) (class124
                                                .anIntArray1865
                                                [i_737_])
                                                / 256.0F);
                                        int i_790_
                                                = (-(class124
                                                .anIntArray1841[i_780_])
                                                + (class124
                                                .anIntArray1841[i_781_]));
                                        int i_791_
                                                = ((class124
                                                .anIntArray1847[i_781_])
                                                + -(class124
                                                .anIntArray1847[i_780_]));
                                        int i_792_
                                                = (-(class124
                                                .anIntArray1852[i_780_])
                                                + (class124
                                                .anIntArray1852[i_781_]));
                                        int i_793_
                                                = ((class124
                                                .anIntArray1841[i_782_])
                                                - (class124
                                                .anIntArray1841[i_780_]));
                                        int i_794_
                                                = ((class124
                                                .anIntArray1847[i_782_])
                                                + -(class124
                                                .anIntArray1847[i_780_]));
                                        int i_795_
                                                = (-(class124
                                                .anIntArray1852[i_780_])
                                                + (class124
                                                .anIntArray1852[i_782_]));
                                        int i_796_ = (-(i_792_ * i_794_)
                                                + i_791_ * i_795_);
                                        int i_797_ = (i_793_ * i_792_
                                                + -(i_795_ * i_790_));
                                        int i_798_ = (i_794_ * i_790_
                                                + -(i_793_ * i_791_));
                                        float f_799_
                                                = (64.0F
                                                / (float) (class124
                                                .anIntArray1859
                                                [i_737_]));
                                        float f_800_
                                                = (64.0F
                                                / (float) (class124
                                                .anIntArray1816
                                                [i_737_]));
                                        float f_801_
                                                = (64.0F
                                                / (float) (class124
                                                .anIntArray1844
                                                [i_737_]));
                                        float f_802_
                                                = ((fs[2] * (float) i_798_
                                                + ((float) i_797_ * fs[1]
                                                + (float) i_796_ * fs[0]))
                                                / f_799_);
                                        float f_803_
                                                = ((fs[5] * (float) i_798_
                                                + ((float) i_797_ * fs[4]
                                                + fs[3] * (float) i_796_))
                                                / f_800_);
                                        float f_804_
                                                = (((float) i_798_ * fs[8]
                                                + (fs[7] * (float) i_797_
                                                + (float) i_796_ * fs[6]))
                                                / f_801_);
                                        i_747_ = Class331.method2635(f_803_,
                                                false,
                                                f_804_,
                                                f_802_);
                                        Class262.method1991
                                                (f_789_, f_787_, fs,
                                                        (class124
                                                                .anIntArray1852[i_780_]),
                                                        i_785_, false, i_786_, i_783_,
                                                        (class124
                                                                .anIntArray1841[i_780_]),
                                                        (class124
                                                                .anIntArray1847[i_780_]),
                                                        f_788_, Class152.aFloatArray2075,
                                                        i_784_, i_747_);
                                        f_740_ = Class152.aFloatArray2075[1];
                                        f = Class152.aFloatArray2075[0];
                                        Class262.method1991
                                                (f_789_, f_787_, fs,
                                                        (class124
                                                                .anIntArray1852[i_781_]),
                                                        i_785_, false, i_786_, i_783_,
                                                        (class124
                                                                .anIntArray1841[i_781_]),
                                                        (class124
                                                                .anIntArray1847[i_781_]),
                                                        f_788_, Class152.aFloatArray2075,
                                                        i_784_, i_747_);
                                        f_742_ = Class152.aFloatArray2075[1];
                                        f_741_ = Class152.aFloatArray2075[0];
                                        Class262.method1991
                                                (f_789_, f_787_, fs,
                                                        (class124
                                                                .anIntArray1852[i_782_]),
                                                        i_785_, false, i_786_, i_783_,
                                                        (class124
                                                                .anIntArray1841[i_782_]),
                                                        (class124
                                                                .anIntArray1847[i_782_]),
                                                        f_788_, Class152.aFloatArray2075,
                                                        i_784_, i_747_);
                                        f_743_ = Class152.aFloatArray2075[0];
                                        f_744_ = Class152.aFloatArray2075[1];
                                    } else {
                                        if (i_748_ == 3) {
                                            Class181.method1367
                                                    (i_785_, i_786_, f_787_,
                                                            (class124
                                                                    .anIntArray1841[i_780_]),
                                                            Class152.aFloatArray2075,
                                                            (class124
                                                                    .anIntArray1852[i_780_]),
                                                            i_783_,
                                                            (class124
                                                                    .anIntArray1847[i_780_]),
                                                            i_784_, -4, fs);
                                            f_740_
                                                    = Class152.aFloatArray2075[1];
                                            f = Class152.aFloatArray2075[0];
                                            Class181.method1367
                                                    (i_785_, i_786_, f_787_,
                                                            (class124
                                                                    .anIntArray1841[i_781_]),
                                                            Class152.aFloatArray2075,
                                                            (class124
                                                                    .anIntArray1852[i_781_]),
                                                            i_783_,
                                                            (class124
                                                                    .anIntArray1847[i_781_]),
                                                            i_784_, -4, fs);
                                            f_741_
                                                    = Class152.aFloatArray2075[0];
                                            f_742_
                                                    = Class152.aFloatArray2075[1];
                                            Class181.method1367
                                                    (i_785_, i_786_, f_787_,
                                                            (class124
                                                                    .anIntArray1841[i_782_]),
                                                            Class152.aFloatArray2075,
                                                            (class124
                                                                    .anIntArray1852[i_782_]),
                                                            i_783_,
                                                            (class124
                                                                    .anIntArray1847[i_782_]),
                                                            i_784_, -4, fs);
                                            f_744_
                                                    = Class152.aFloatArray2075[1];
                                            f_743_
                                                    = Class152.aFloatArray2075[0];
                                            if ((0x1 & i_786_) == 0) {
                                                if (-f + f_743_ > 0.5F) {
                                                    i_746_ = 1;
                                                    f_743_--;
                                                } else {
                                                    if (f - f_743_ > 0.5F) {
                                                        i_746_ = 2;
                                                        f_743_++;
                                                    }
                                                }
												if (f_741_ - f > 0.5F) {
                                                    i_745_ = 1;
                                                    f_741_--;
                                                } else {
                                                    if (-f_741_ + f > 0.5F) {
                                                        i_745_ = 2;
                                                        f_741_++;
                                                    }
                                                }
											} else {
                                                if (-f_740_ + f_742_ > 0.5F) {
                                                    i_745_ = 1;
                                                    f_742_--;
                                                } else if (f_740_ - f_742_
                                                        > 0.5F) {
                                                    f_742_++;
                                                    i_745_ = 2;
                                                }
                                                if (f_744_ - f_740_
														> 0.5F) {
                                                    f_744_--;
                                                    i_746_ = 1;
                                                } else {
                                                    if (f_740_ - f_744_
                                                            > 0.5F) {
                                                        i_746_ = 2;
                                                        f_744_++;
                                                    }
                                                }
											}
										}
                                    }
								}
							}
                        }
                    }
                    byte i_807_;
                    if (class124.aByteArray1843 != null)
                        i_807_ = class124.aByteArray1843[i_735_];
                    else
                        i_807_ = (byte) 0;
                    if (i_807_ == 0) {
                        long l = ((((long) (i_736_ << -1679364184)
                                + ((long) (i_747_ << -397949608)
                                + (long) i_738_))
                                << 672519904)
                                + (long) (i_737_ << 1048775714));
                        short i_808_
                                = class124.aShortArray1863[i_735_];
                        short i_809_
                                = class124.aShortArray1835[i_735_];
                        short i_810_
                                = class124.aShortArray1855[i_735_];
                        Class8 class8 = class8s[i_808_];
                        aShortArray5592[i_734_]
                                = method683(class8.anInt162,
                                class8.anInt159, l,
                                class8.anInt161, class124,
                                class8.anInt160, f, 0,
                                i_808_, f_740_);
                        class8 = class8s[i_809_];
                        aShortArray5579[i_734_]
                                = method683(class8.anInt162,
                                class8.anInt159,
                                (long) i_745_ + l,
                                class8.anInt161, class124,
                                class8.anInt160, f_741_, 0,
                                i_809_, f_742_);
                        class8 = class8s[i_810_];
                        aShortArray5566[i_734_]
                                = method683(class8.anInt162,
                                class8.anInt159,
                                l + (long) i_746_,
                                class8.anInt161, class124,
                                class8.anInt160, f_743_, 0,
                                i_810_, f_744_);
                    } else {
                        if (i_807_ == 1) {
                            Class347 class347 = class347s[i_735_];
                            long l
                                    = ((((long) (i_736_ << -1343350136)
                                    + (long) (i_747_ << -900388712)
                                    + (long) i_738_)
                                    << -940119520)
                                    + (long) (((class347.anInt4282
                                    > 0)
                                    ? 1024 : 2048)
                                    + (i_737_ << -976265246)
                                    + ((class347
                                    .anInt4279) + 256
                                    << 1923798252)
                                    - -(256 + (class347
                                    .anInt4283)
                                    << -604250250)));
                            aShortArray5592[i_734_]
                                    = method683(class347.anInt4279,
                                    class347.anInt4283, l,
                                    class347.anInt4282,
                                    class124, 0, f, 0,
                                    (class124
                                            .aShortArray1863[i_735_]),
                                    f_740_);
                            aShortArray5579[i_734_]
                                    = method683(class347.anInt4279,
                                    class347.anInt4283,
                                    l + (long) i_745_,
                                    class347.anInt4282,
                                    class124, 0, f_741_, 0,
                                    (class124
                                            .aShortArray1835[i_735_]),
                                    f_742_);
                            aShortArray5566[i_734_]
                                    = method683(class347.anInt4279,
                                    class347.anInt4283,
                                    l + (long) i_746_,
                                    class347.anInt4282,
                                    class124, 0, f_743_, 0,
                                    (class124
                                            .aShortArray1855[i_735_]),
                                    f_744_);
                        }
                    }
					if (class124.aByteArray1834 != null)
                        aByteArray5542[i_734_]
                                = class124.aByteArray1834[i_735_];
                    if (class124.aShortArray1856 != null)
                        aShortArray5573[i_734_]
                                = class124.aShortArray1856[i_735_];
                    aShortArray5580[i_734_]
                            = class124.aShortArray1862[i_735_];
                    aShortArray5601[i_734_] = i_739_;
                }
                int i_811_ = 0;
                short i_812_ = -10000;
                for (int i_813_ = 0; i_813_ < anInt5537; i_813_++) {
                    short i_814_ = aShortArray5601[i_813_];
                    if (i_812_ != i_814_) {
                        i_811_++;
                        i_812_ = i_814_;
                    }
                }
                anIntArray5626 = new int[1 + i_811_];
                i_811_ = 0;
                i_812_ = (short) -10000;
                for (int i_815_ = 0; anInt5537 > i_815_; i_815_++) {
                    short i_816_ = aShortArray5601[i_815_];
                    if (i_816_ != i_812_) {
                        anIntArray5626[i_811_++] = i_815_;
                        i_812_ = i_816_;
                    }
                }
                anIntArray5626[i_811_] = anInt5537;
                Class258_Sub2.aLongArray8530 = null;
                aShortArray5564 = Class119_Sub2.method1078(aShortArray5564,
                        anInt5529, 114);
                aShortArray5583 = Class119_Sub2.method1078(aShortArray5583,
                        anInt5529, 126);
                aShortArray5576 = Class119_Sub2.method1078(aShortArray5576,
                        anInt5529, 100);
                aByteArray5594
                        = Class93.method863(anInt5529, (byte) 113, aByteArray5594);
                aFloatArray5552
                        = Class231.method1638(anInt5529, aFloatArray5552, -1);
                aFloatArray5571
                        = Class231.method1638(anInt5529, aFloatArray5571, -1);
                if (class124.anIntArray1868 != null
                        && Class312.method2332(anInt5556, (byte) 125, i))
                    anIntArrayArray5539 = class124.method1100(false, -42);
                if (class124.aClass162Array1832 != null
                        && Class229.method1633(false, i, anInt5556))
                    anIntArrayArray5627 = class124.method1093((byte) -69);
                if (class124.anIntArray1824 == null
                        || !Class40.method371(i, 256, anInt5556))
                    break;
                int i_817_ = 0;
                int[] is_818_ = new int[256];
                for (int i_819_ = 0;
					 anInt5632 > i_819_;
                     i_819_++) {
                    int i_820_
                            = class124.anIntArray1824[is[i_819_]];
                    if (i_820_ >= 0) {
                        if (i_817_ < i_820_)
                            i_817_ = i_820_;
                        is_818_[i_820_]++;
                    }
                }
                anIntArrayArray5553 = new int[i_817_ + 1][];
                for (int i_821_ = 0; i_821_ <= i_817_; i_821_++) {
                    anIntArrayArray5553[i_821_] = new int[is_818_[i_821_]];
                    is_818_[i_821_] = 0;
                }
                for (int i_822_ = 0; i_822_ < anInt5632; i_822_++) {
                    int i_823_
                            = class124.anIntArray1824[is[i_822_]];
                    if (i_823_ >= 0)
                        anIntArrayArray5553[i_823_][is_818_[i_823_]++]
                                = i_822_;
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("paa.<init>("
                                + (var_ha_Sub2 != null
                                ? "{...}" : "null")
                                + ','
                                + (class124 != null ? "{...}"
                                : "null")
                                + ',' + i + ',' + i_695_ + ','
                                + i_696_ + ',' + i_697_
                                + ')'));
            }
            break;
        } while (false);
    }
}
