/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class211 {
    int anInt2731;
    static int anInt2732;
    static int anInt2733;
    int anInt2734;
    private int anInt2735;
    static int anInt2736;
    boolean aBoolean2737;
    private int anInt2738;
    private int anInt2739;
    private int anInt2740;
    static int anInt2741;
    short[] aShortArray2742;
    private int anInt2743;
    static int[] anIntArray2744 = new int[2];
    Class348_Sub1 aClass348_Sub1_2745;
    static int anInt2746;
    static int anInt2747;
    static int anInt2748;
    boolean aBoolean2749;

    static final boolean method1538(int i, byte i_0_,
                                    Class348_Sub49_Sub2 class348_sub49_sub2) {
        anInt2732++;
        int i_1_ = class348_sub49_sub2.method3410((byte) -24, 2);
        if ((i_1_ ^ 0xffffffff) == -1) {
            if (class348_sub49_sub2.method3410((byte) -24, 1) != 0)
                method1538(i, (byte) 105, class348_sub49_sub2);
            int i_2_ = class348_sub49_sub2.method3410((byte) -24, 6);
            int i_3_ = class348_sub49_sub2.method3410((byte) -24, 6);
            boolean bool
                    = ((class348_sub49_sub2.method3410((byte) -24, 1) ^ 0xffffffff)
                    == -2);
            if (bool)
                Class18.anIntArray279[Class101_Sub3.anInt5768++] = i;
            if (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i] != null)
                throw new RuntimeException("hr:lr");
            Class359 class359 = Class348_Sub17.aClass359Array6802[i];
            Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2
                    = (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i]
                    = new Class318_Sub1_Sub3_Sub3_Sub2());
            ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2).anInt10290
                    = i;
            if (Class154.aClass348_Sub49Array2105[i] != null)
                class318_sub1_sub3_sub3_sub2.method2452
                        ((byte) 84, Class154.aClass348_Sub49Array2105[i]);
            class318_sub1_sub3_sub3_sub2.method2435((byte) -108,
                    (((Class359) class359)
                            .anInt4423),
                    true);
            ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2).anInt10275
                    = ((Class359) class359).anInt4425;
            int i_4_ = ((Class359) class359).anInt4420;
            int i_5_ = i_4_ >> 1728102396;
            int i_6_ = (0x3fcd8e & i_4_) >> 2011097998;
            int i_7_ = 0xff & i_4_;
            int i_8_ = -za_Sub2.anInt9780 + i_2_ + (i_6_ << -895287706);
            ((Class318_Sub1_Sub3_Sub3_Sub2) class318_sub1_sub3_sub3_sub2)
                    .aBoolean10554
                    = ((Class359) class359).aBoolean4426;
            int i_9_ = -Class90.anInt1517 + i_3_ + (i_7_ << 501837894);
            ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
                    .aByteArray10321[0]
                    = Class259.aByteArray3300[i];
            ((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6381
                    = ((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6376
                    = (byte) i_5_;
            if (Class79.method802(i_9_, i_8_, true))
                ((Class318_Sub1) class318_sub1_sub3_sub3_sub2).aByte6376++;
            class318_sub1_sub3_sub3_sub2.method2449(i_9_, i_8_, (byte) 102);
            ((Class318_Sub1_Sub3_Sub3_Sub2) class318_sub1_sub3_sub3_sub2)
                    .aBoolean10539
                    = false;
            Class348_Sub17.aClass359Array6802[i] = null;
            return true;
        }
        if ((i_1_ ^ 0xffffffff) == -2) {
            int i_10_ = class348_sub49_sub2.method3410((byte) -24, 2);
            int i_11_
                    = ((Class359) Class348_Sub17.aClass359Array6802[i]).anInt4420;
            ((Class359) Class348_Sub17.aClass359Array6802[i]).anInt4420
                    = (0xfffffff & i_11_) + (((i_11_ >> 260957884) + i_10_ & 0x3)
                    << 1400337884);
            return false;
        }
        if (i_1_ == 2) {
            int i_12_ = class348_sub49_sub2.method3410((byte) -24, 5);
            int i_13_ = i_12_ >> -135563069;
            int i_14_ = 0x7 & i_12_;
            int i_15_
                    = ((Class359) Class348_Sub17.aClass359Array6802[i]).anInt4420;
            int i_16_ = 0x3 & i_13_ + (i_15_ >> -890531620);
            int i_17_ = (i_15_ & 0x3fd366) >> -1713508850;
            int i_18_ = 0xff & i_15_;
            if ((i_14_ ^ 0xffffffff) == -1) {
                i_17_--;
                i_18_--;
            }
            if ((i_14_ ^ 0xffffffff) == -2)
                i_18_--;
            if ((i_14_ ^ 0xffffffff) == -3) {
                i_18_--;
                i_17_++;
            }
            if (i_14_ == 3)
                i_17_--;
            if ((i_14_ ^ 0xffffffff) == -5)
                i_17_++;
            if (i_14_ == 5) {
                i_17_--;
                i_18_++;
            }
            if (i_14_ == 6)
                i_18_++;
            if ((i_14_ ^ 0xffffffff) == -8) {
                i_17_++;
                i_18_++;
            }
            ((Class359) Class348_Sub17.aClass359Array6802[i]).anInt4420
                    = i_18_ + ((i_16_ << 165004252) + (i_17_ << 706528398));
            return false;
        }
        int i_19_ = class348_sub49_sub2.method3410((byte) -24, 18);
        int i_20_ = i_19_ >> 672217744;
        int i_21_ = 0xff & i_19_ >> 618722952;
        int i_22_ = 0xff & i_19_;
        int i_23_
                = ((Class359) Class348_Sub17.aClass359Array6802[i]).anInt4420;
        int i_24_ = 0x3 & (i_23_ >> -595563684) - -i_20_;
        int i_25_ = i_21_ + (i_23_ >> -753926354) & 0xff;
        if (i_0_ != 105)
            anIntArray2744 = null;
        int i_26_ = 0xff & i_23_ + i_22_;
        ((Class359) Class348_Sub17.aClass359Array6802[i]).anInt4420
                = i_26_ + (i_24_ << -1791143364) - -(i_25_ << 1982417070);
        return false;
    }

    final void method1539(int i, byte i_27_, int i_28_, int i_29_, int i_30_) {
        anInt2741++;
        if (i_27_ <= 114)
            method1538(-108, (byte) -46, null);
        anInt2735 = i_28_;
        anInt2738 = i;
        anInt2743 = i_30_;
        anInt2740 = i_29_;
    }

    static final void method1540(int i, int i_31_, int i_32_) {
        anInt2746++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(i_31_, (byte) 105, 13);
        class348_sub42_sub15.method3246(-25490);
        ((Class348_Sub42_Sub15) class348_sub42_sub15).anInt9652 = i_32_;
        if (i >= -84)
            anIntArray2744 = null;
    }

    private final void method1541(int i, ha var_ha, int i_33_, int i_34_,
                                  int i_35_, int i_36_, int i_37_) {
        anInt2736++;
        if (i_35_ == 3)
            ((Class211) this).aClass348_Sub1_2745
                    = var_ha.method3690(i_34_, i, i_33_, i_37_, i_36_, 1.0F);
    }

    private final void method1542(int i) {
        int i_38_ = ((Class211) this).anInt2734;
        while_70_:
        do {
            while_69_:
            do {
                while_68_:
                do {
                    while_67_:
                    do {
                        while_66_:
                        do {
                            while_65_:
                            do {
                                while_64_:
                                do {
                                    while_63_:
                                    do {
                                        while_62_:
                                        do {
                                            while_61_:
                                            do {
                                                while_60_:
                                                do {
                                                    while_59_:
                                                    do {
                                                        while_58_:
                                                        do {
                                                            while_57_:
                                                            do {
                                                                do {
                                                                    if (i_38_
                                                                            != 2) {
                                                                        if ((i_38_
                                                                                ^ 0xffffffff)
                                                                                != -4) {
                                                                            if (i_38_ != 4) {
                                                                                if ((i_38_ ^ 0xffffffff) != -6) {
                                                                                    if ((i_38_ ^ 0xffffffff) != -13) {
                                                                                        if ((i_38_ ^ 0xffffffff) != -14) {
                                                                                            if (i_38_ != 10) {
                                                                                                if ((i_38_ ^ 0xffffffff) != -12) {
                                                                                                    if ((i_38_ ^ 0xffffffff) != -7) {
                                                                                                        if (i_38_ != 7) {
                                                                                                            if ((i_38_ ^ 0xffffffff) != -9) {
                                                                                                                if ((i_38_ ^ 0xffffffff) != -10) {
                                                                                                                    if ((i_38_ ^ 0xffffffff) != -15) {
                                                                                                                        if (i_38_ != 15) {
                                                                                                                            if (i_38_ == 16)
                                                                                                                                break while_68_;
                                                                                                                            break while_69_;
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        break while_66_;
                                                                                                                    break while_67_;
                                                                                                                }
                                                                                                            } else
                                                                                                                break while_64_;
                                                                                                            break while_65_;
                                                                                                        }
                                                                                                    } else
                                                                                                        break while_62_;
                                                                                                    break while_63_;
                                                                                                }
                                                                                            } else
                                                                                                break while_60_;
                                                                                            break while_61_;
                                                                                        }
                                                                                    } else
                                                                                        break while_58_;
                                                                                    break while_59_;
                                                                                }
                                                                            } else
                                                                                break;
                                                                            break while_57_;
                                                                        }
                                                                    } else {
                                                                        anInt2743
                                                                                = 2048;
                                                                        anInt2738
                                                                                = 0;
                                                                        anInt2735
                                                                                = 2048;
                                                                        anInt2740
                                                                                = 1;
                                                                        break while_70_;
                                                                    }
                                                                    anInt2738
                                                                            = 0;
                                                                    anInt2743
                                                                            = 2048;
                                                                    anInt2740
                                                                            = 1;
                                                                    anInt2735
                                                                            = 4096;
                                                                    break while_70_;
                                                                } while (false);
                                                                anInt2738 = 0;
                                                                anInt2740 = 4;
                                                                anInt2743
                                                                        = 2048;
                                                                anInt2735
                                                                        = 2048;
                                                                break while_70_;
                                                            } while (false);
                                                            anInt2735 = 8192;
                                                            anInt2740 = 4;
                                                            anInt2743 = 2048;
                                                            anInt2738 = 0;
                                                            break while_70_;
                                                        } while (false);
                                                        anInt2735 = 2048;
                                                        anInt2740 = 2;
                                                        anInt2738 = 0;
                                                        anInt2743 = 2048;
                                                        break while_70_;
                                                    } while (false);
                                                    anInt2743 = 2048;
                                                    anInt2738 = 0;
                                                    anInt2740 = 2;
                                                    anInt2735 = 8192;
                                                    break while_70_;
                                                } while (false);
                                                anInt2743 = 512;
                                                anInt2740 = 3;
                                                anInt2738 = 1536;
                                                anInt2735 = 2048;
                                                break while_70_;
                                            } while (false);
                                            anInt2740 = 3;
                                            anInt2743 = 512;
                                            anInt2738 = 1536;
                                            anInt2735 = 4096;
                                            break while_70_;
                                        } while (false);
                                        anInt2738 = 1280;
                                        anInt2740 = 3;
                                        anInt2743 = 768;
                                        anInt2735 = 2048;
                                        break while_70_;
                                    } while (false);
                                    anInt2738 = 1280;
                                    anInt2740 = 3;
                                    anInt2735 = 4096;
                                    anInt2743 = 768;
                                    break while_70_;
                                } while (false);
                                anInt2738 = 1024;
                                anInt2735 = 2048;
                                anInt2743 = 1024;
                                anInt2740 = 3;
                                break while_70_;
                            } while (false);
                            anInt2743 = 1024;
                            anInt2735 = 4096;
                            anInt2740 = 3;
                            anInt2738 = 1024;
                            break while_70_;
                        } while (false);
                        anInt2740 = 1;
                        anInt2738 = 1280;
                        anInt2735 = 2048;
                        anInt2743 = 768;
                        break while_70_;
                    } while (false);
                    anInt2735 = 4096;
                    anInt2743 = 512;
                    anInt2740 = 1;
                    anInt2738 = 1536;
                    break while_70_;
                } while (false);
                anInt2735 = 8192;
                anInt2740 = 1;
                anInt2743 = 256;
                anInt2738 = 1792;
                break while_70_;
            } while (false);
            anInt2735 = 2048;
            anInt2743 = 2048;
            anInt2738 = 0;
            anInt2740 = 0;
        } while (false);
        if (i == 32402)
            anInt2748++;
    }

    public static void method1543(int i) {
        anIntArray2744 = null;
        if (i != -4524)
            anInt2747 = 24;
    }

    final void method1544(int i, boolean bool, int i_39_) {
        if (i != 8688)
            method1544(86, false, 92);
        anInt2733++;
        int i_40_;
        while_74_:
        do {
            if (bool)
                i_40_ = 2048;
            else {
                int i_41_ = 0x7ff & anInt2735 * i_39_ / 50 + anInt2739;
                int i_42_ = anInt2740;
                while_73_:
                do {
                    while_72_:
                    do {
                        while_71_:
                        do {
                            do {
                                if (i_42_ != 1) {
                                    if ((i_42_ ^ 0xffffffff) != -4) {
                                        if (i_42_ != 4) {
                                            if ((i_42_ ^ 0xffffffff) != -3) {
                                                if (i_42_ == 5)
                                                    break while_72_;
                                                break while_73_;
                                            }
                                        } else
                                            break;
                                        break while_71_;
                                    }
                                } else {
                                    i_40_ = ((Class70.anIntArray1207
                                            [i_41_ << 680948963])
                                            >> 2080897156) + 1024;
                                    break while_74_;
                                }
                                i_40_ = (Class291.anIntArray3726[i_41_]
                                        >> -813205215);
                                break while_74_;
                            } while (false);
                            i_40_ = i_41_ >> -294230678 << 611113515;
                            break while_74_;
                        } while (false);
                        i_40_ = i_41_;
                        break while_74_;
                    } while (false);
                    i_40_ = ((i_41_ ^ 0xffffffff) <= -1025 ? -i_41_ + 2048
                            : i_41_) << -203822847;
                    break while_74_;
                } while (false);
                i_40_ = 2048;
            }
        } while (false);
        ((Class211) this).aClass348_Sub1_2745.method2716
                (-1, ((float) ((anInt2743 * i_40_ >> -1367360181) + anInt2738)
                        / 2048.0F));
    }

    protected Class211() {
        if (Class291.anIntArray3726 == null)
            Class141.method1177((byte) 122);
        method1542(32402);
    }

    Class211(ha var_ha, Class348_Sub49 class348_sub49, int i) {
        try {
            if (Class291.anIntArray3726 == null)
                Class141.method1177((byte) 122);
            ((Class211) this).anInt2731 = class348_sub49.method3387(255);
            ((Class211) this).aBoolean2737
                    = (0x8 & ((Class211) this).anInt2731) != 0;
            ((Class211) this).aBoolean2749
                    = (((Class211) this).anInt2731 & 0x10 ^ 0xffffffff) != -1;
            ((Class211) this).anInt2731 = 0x7 & ((Class211) this).anInt2731;
            int i_43_ = class348_sub49.method3330(842397944) << i;
            int i_44_ = class348_sub49.method3330(842397944) << i;
            int i_45_ = class348_sub49.method3330(842397944) << i;
            int i_46_ = class348_sub49.method3387(255);
            int i_47_ = 1 + i_46_ * 2;
            ((Class211) this).aShortArray2742 = new short[i_47_];
            for (int i_48_ = 0;
                 ((((Class211) this).aShortArray2742.length ^ 0xffffffff)
                         < (i_48_ ^ 0xffffffff));
                 i_48_++) {
                int i_49_ = (short) class348_sub49.method3330(842397944);
                int i_50_ = i_49_ >>> 1797513576;
                if ((i_50_ ^ 0xffffffff) <= (i_47_ ^ 0xffffffff))
                    i_50_ = i_47_ - 1;
                int i_51_ = 0xff & i_49_;
                if (-i_50_ + i_47_ < i_51_)
                    i_51_ = i_47_ - i_50_;
                ((Class211) this).aShortArray2742[i_48_]
                        = (short) Class273.method2057(i_51_, i_50_ << 775681064);
            }
            i_46_ = ((i_46_ << Class362.anInt4459)
                    + Class348_Sub23_Sub2.anInt9037);
            int i_52_
                    = (Class10.anIntArray179 == null
                    ? (Class126.anIntArray4983
                    [Class25.method303(class348_sub49.method3330(842397944),
                    30) & 0xffff])
                    : (Class10.anIntArray179
                    [class348_sub49.method3330(842397944)]));
            int i_53_ = class348_sub49.method3387(255);
            anInt2739 = (0xe0 & i_53_) << -607684957;
            ((Class211) this).anInt2734 = 0x1f & i_53_;
            if (((Class211) this).anInt2734 != 31)
                method1542(32402);
            method1541(i_45_, var_ha, i_44_, i_43_, 3, i_52_, i_46_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ro.<init>("
                            + (var_ha != null ? "{...}"
                            : "null")
                            + ','
                            + (class348_sub49 != null
                            ? "{...}" : "null")
                            + ',' + i + ')'));
        }
    }
}
