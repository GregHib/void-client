/* Class105_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class105_Sub3_Sub3 extends Class105_Sub3 {
    int[] anIntArray9936;

    Class105_Sub3_Sub3(ha_Sub1 var_ha_Sub1, int[] is, int i, int i_0_) {
        super(var_ha_Sub1, i, i_0_);
        ((Class105_Sub3_Sub3) this).anIntArray9936 = is;
    }

    Class105_Sub3_Sub3(ha_Sub1 var_ha_Sub1, int[] is, int i, int i_1_,
                       int i_2_, int i_3_, boolean bool) {
        super(var_ha_Sub1, i_2_, i_3_);
        if (bool)
            ((Class105_Sub3_Sub3) this).anIntArray9936 = new int[i_2_ * i_3_];
        else
            ((Class105_Sub3_Sub3) this).anIntArray9936 = is;
        i_1_ -= ((Class105_Sub3) this).anInt8471;
        int i_4_ = 0;
        for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
            for (int i_6_ = 0; i_6_ < i_2_; i_6_++)
                ((Class105_Sub3_Sub3) this).anIntArray9936[i_4_++] = is[i++];
            i += i_1_;
        }
    }

    final void method995(int[] is, int[] is_7_, int i, int i_8_) {
        int[] is_9_
                = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anIntArray7483;
        if (Class105_Sub3.anInt8481 == 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_10_ = Class105_Sub3.anInt8468;
                while (i_10_ < 0) {
                    int i_11_ = i_10_ + i_8_;
                    if (i_11_ >= 0) {
                        if (i_11_ >= is.length)
                            break;
                        int i_12_ = Class105_Sub3.anInt8451;
                        int i_13_ = Class105_Sub3.anInt8458;
                        int i_14_ = Class105_Sub3.anInt8467;
                        int i_15_ = Class105_Sub3.anInt8478;
                        if (i_13_ >= 0 && i_14_ >= 0
                                && i_13_ - (((Class105_Sub3) this).anInt8471
                                << 12) < 0
                                && i_14_ - (((Class105_Sub3) this).anInt8470
                                << 12) < 0) {
                            int i_16_ = is[i_11_] - i;
                            int i_17_ = -is_7_[i_11_];
                            int i_18_
                                    = i_16_ - (i_12_ - Class105_Sub3.anInt8451);
                            if (i_18_ > 0) {
                                i_12_ += i_18_;
                                i_15_ += i_18_;
                                i_13_ += Class105_Sub3.anInt8481 * i_18_;
                                i_14_ += Class105_Sub3.anInt8450 * i_18_;
                            } else
                                i_17_ -= i_18_;
                            if (i_15_ < i_17_)
                                i_15_ = i_17_;
                            for (/**/; i_15_ < 0; i_15_++) {
                                int i_19_
                                        = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(((i_14_ >> 12)
                                        * ((Class105_Sub3) this).anInt8471)
                                        + (i_13_ >> 12))]);
                                int i_20_ = i_19_ >>> 24;
                                int i_21_ = 256 - i_20_;
                                int i_22_ = is_9_[i_12_];
                                is_9_[i_12_++]
                                        = ((((i_19_ & 0xff00ff) * i_20_
                                        + (i_22_ & 0xff00ff) * i_21_)
                                        & ~0xff00ff)
                                        + (((i_19_ & 0xff00) * i_20_
                                        + (i_22_ & 0xff00) * i_21_)
                                        & 0xff0000)) >> 8;
                            }
                        }
                    }
                    i_10_++;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_23_ = Class105_Sub3.anInt8468;
                while (i_23_ < 0) {
                    int i_24_ = i_23_ + i_8_;
                    if (i_24_ >= 0) {
                        if (i_24_ >= is.length)
                            break;
                        int i_25_ = Class105_Sub3.anInt8451;
                        int i_26_ = Class105_Sub3.anInt8458;
                        int i_27_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_28_ = Class105_Sub3.anInt8478;
                        if (i_26_ >= 0
                                && i_26_ - (((Class105_Sub3) this).anInt8471
                                << 12) < 0) {
                            int i_29_;
                            if ((i_29_
                                    = i_27_ - (((Class105_Sub3) this).anInt8470
                                    << 12))
                                    >= 0) {
                                i_29_ = ((Class105_Sub3.anInt8450 - i_29_)
                                        / Class105_Sub3.anInt8450);
                                i_28_ += i_29_;
                                i_27_ += Class105_Sub3.anInt8450 * i_29_;
                                i_25_ += i_29_;
                            }
                            if ((i_29_ = ((i_27_ - Class105_Sub3.anInt8450)
                                    / Class105_Sub3.anInt8450))
                                    > i_28_)
                                i_28_ = i_29_;
                            int i_30_ = is[i_24_] - i;
                            int i_31_ = -is_7_[i_24_];
                            int i_32_
                                    = i_30_ - (i_25_ - Class105_Sub3.anInt8451);
                            if (i_32_ > 0) {
                                i_25_ += i_32_;
                                i_28_ += i_32_;
                                i_26_ += Class105_Sub3.anInt8481 * i_32_;
                                i_27_ += Class105_Sub3.anInt8450 * i_32_;
                            } else
                                i_31_ -= i_32_;
                            if (i_28_ < i_31_)
                                i_28_ = i_31_;
                            for (/**/; i_28_ < 0; i_28_++) {
                                int i_33_
                                        = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(((i_27_ >> 12)
                                        * ((Class105_Sub3) this).anInt8471)
                                        + (i_26_ >> 12))]);
                                int i_34_ = i_33_ >>> 24;
                                int i_35_ = 256 - i_34_;
                                int i_36_ = is_9_[i_25_];
                                is_9_[i_25_++]
                                        = ((((i_33_ & 0xff00ff) * i_34_
                                        + (i_36_ & 0xff00ff) * i_35_)
                                        & ~0xff00ff)
                                        + (((i_33_ & 0xff00) * i_34_
                                        + (i_36_ & 0xff00) * i_35_)
                                        & 0xff0000)) >> 8;
                                i_27_ += Class105_Sub3.anInt8450;
                            }
                        }
                    }
                    i_23_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_37_ = Class105_Sub3.anInt8468;
                while (i_37_ < 0) {
                    int i_38_ = i_37_ + i_8_;
                    if (i_38_ >= 0) {
                        if (i_38_ >= is.length)
                            break;
                        int i_39_ = Class105_Sub3.anInt8451;
                        int i_40_ = Class105_Sub3.anInt8458;
                        int i_41_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_42_ = Class105_Sub3.anInt8478;
                        if (i_40_ >= 0
                                && i_40_ - (((Class105_Sub3) this).anInt8471
                                << 12) < 0) {
                            if (i_41_ < 0) {
                                int i_43_
                                        = ((Class105_Sub3.anInt8450 - 1 - i_41_)
                                        / Class105_Sub3.anInt8450);
                                i_42_ += i_43_;
                                i_41_ += Class105_Sub3.anInt8450 * i_43_;
                                i_39_ += i_43_;
                            }
                            int i_44_;
                            if ((i_44_
                                    = ((1 + i_41_
                                    - (((Class105_Sub3) this).anInt8470 << 12)
                                    - Class105_Sub3.anInt8450)
                                    / Class105_Sub3.anInt8450))
                                    > i_42_)
                                i_42_ = i_44_;
                            int i_45_ = is[i_38_] - i;
                            int i_46_ = -is_7_[i_38_];
                            int i_47_
                                    = i_45_ - (i_39_ - Class105_Sub3.anInt8451);
                            if (i_47_ > 0) {
                                i_39_ += i_47_;
                                i_42_ += i_47_;
                                i_40_ += Class105_Sub3.anInt8481 * i_47_;
                                i_41_ += Class105_Sub3.anInt8450 * i_47_;
                            } else
                                i_46_ -= i_47_;
                            if (i_42_ < i_46_)
                                i_42_ = i_46_;
                            for (/**/; i_42_ < 0; i_42_++) {
                                int i_48_
                                        = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(((i_41_ >> 12)
                                        * ((Class105_Sub3) this).anInt8471)
                                        + (i_40_ >> 12))]);
                                int i_49_ = i_48_ >>> 24;
                                int i_50_ = 256 - i_49_;
                                int i_51_ = is_9_[i_39_];
                                is_9_[i_39_++]
                                        = ((((i_48_ & 0xff00ff) * i_49_
                                        + (i_51_ & 0xff00ff) * i_50_)
                                        & ~0xff00ff)
                                        + (((i_48_ & 0xff00) * i_49_
                                        + (i_51_ & 0xff00) * i_50_)
                                        & 0xff0000)) >> 8;
                                i_41_ += Class105_Sub3.anInt8450;
                            }
                        }
                    }
                    i_37_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8481 < 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_52_ = Class105_Sub3.anInt8468;
                while (i_52_ < 0) {
                    int i_53_ = i_52_ + i_8_;
                    if (i_53_ >= 0) {
                        if (i_53_ >= is.length)
                            break;
                        int i_54_ = Class105_Sub3.anInt8451;
                        int i_55_ = (Class105_Sub3.anInt8458
                                + Class105_Sub3.anInt8479);
                        int i_56_ = Class105_Sub3.anInt8467;
                        int i_57_ = Class105_Sub3.anInt8478;
                        if (i_56_ >= 0
                                && i_56_ - (((Class105_Sub3) this).anInt8470
                                << 12) < 0) {
                            int i_58_;
                            if ((i_58_
                                    = i_55_ - (((Class105_Sub3) this).anInt8471
                                    << 12))
                                    >= 0) {
                                i_58_ = ((Class105_Sub3.anInt8481 - i_58_)
                                        / Class105_Sub3.anInt8481);
                                i_57_ += i_58_;
                                i_55_ += Class105_Sub3.anInt8481 * i_58_;
                                i_54_ += i_58_;
                            }
                            if ((i_58_ = ((i_55_ - Class105_Sub3.anInt8481)
                                    / Class105_Sub3.anInt8481))
                                    > i_57_)
                                i_57_ = i_58_;
                            int i_59_ = is[i_53_] - i;
                            int i_60_ = -is_7_[i_53_];
                            int i_61_
                                    = i_59_ - (i_54_ - Class105_Sub3.anInt8451);
                            if (i_61_ > 0) {
                                i_54_ += i_61_;
                                i_57_ += i_61_;
                                i_55_ += Class105_Sub3.anInt8481 * i_61_;
                                i_56_ += Class105_Sub3.anInt8450 * i_61_;
                            } else
                                i_60_ -= i_61_;
                            if (i_57_ < i_60_)
                                i_57_ = i_60_;
                            for (/**/; i_57_ < 0; i_57_++) {
                                int i_62_
                                        = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(((i_56_ >> 12)
                                        * ((Class105_Sub3) this).anInt8471)
                                        + (i_55_ >> 12))]);
                                int i_63_ = i_62_ >>> 24;
                                int i_64_ = 256 - i_63_;
                                int i_65_ = is_9_[i_54_];
                                is_9_[i_54_++]
                                        = ((((i_62_ & 0xff00ff) * i_63_
                                        + (i_65_ & 0xff00ff) * i_64_)
                                        & ~0xff00ff)
                                        + (((i_62_ & 0xff00) * i_63_
                                        + (i_65_ & 0xff00) * i_64_)
                                        & 0xff0000)) >> 8;
                                i_55_ += Class105_Sub3.anInt8481;
                            }
                        }
                    }
                    i_52_++;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_66_ = Class105_Sub3.anInt8468;
                while (i_66_ < 0) {
                    int i_67_ = i_66_ + i_8_;
                    if (i_67_ >= 0) {
                        if (i_67_ >= is.length)
                            break;
                        int i_68_ = Class105_Sub3.anInt8451;
                        int i_69_ = (Class105_Sub3.anInt8458
                                + Class105_Sub3.anInt8479);
                        int i_70_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_71_ = Class105_Sub3.anInt8478;
                        int i_72_;
                        if ((i_72_ = i_69_ - (((Class105_Sub3) this).anInt8471
                                << 12))
                                >= 0) {
                            i_72_ = ((Class105_Sub3.anInt8481 - i_72_)
                                    / Class105_Sub3.anInt8481);
                            i_71_ += i_72_;
                            i_69_ += Class105_Sub3.anInt8481 * i_72_;
                            i_70_ += Class105_Sub3.anInt8450 * i_72_;
                            i_68_ += i_72_;
                        }
                        if ((i_72_ = ((i_69_ - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_71_)
                            i_71_ = i_72_;
                        if ((i_72_ = i_70_ - (((Class105_Sub3) this).anInt8470
                                << 12))
                                >= 0) {
                            i_72_ = ((Class105_Sub3.anInt8450 - i_72_)
                                    / Class105_Sub3.anInt8450);
                            i_71_ += i_72_;
                            i_69_ += Class105_Sub3.anInt8481 * i_72_;
                            i_70_ += Class105_Sub3.anInt8450 * i_72_;
                            i_68_ += i_72_;
                        }
                        if ((i_72_ = ((i_70_ - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_71_)
                            i_71_ = i_72_;
                        int i_73_ = is[i_67_] - i;
                        int i_74_ = -is_7_[i_67_];
                        int i_75_ = i_73_ - (i_68_ - Class105_Sub3.anInt8451);
                        if (i_75_ > 0) {
                            i_68_ += i_75_;
                            i_71_ += i_75_;
                            i_69_ += Class105_Sub3.anInt8481 * i_75_;
                            i_70_ += Class105_Sub3.anInt8450 * i_75_;
                        } else
                            i_74_ -= i_75_;
                        if (i_71_ < i_74_)
                            i_71_ = i_74_;
                        for (/**/; i_71_ < 0; i_71_++) {
                            int i_76_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(((i_70_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_69_ >> 12))]);
                            int i_77_ = i_76_ >>> 24;
                            int i_78_ = 256 - i_77_;
                            int i_79_ = is_9_[i_68_];
                            is_9_[i_68_++] = ((((i_76_ & 0xff00ff) * i_77_
                                    + (i_79_ & 0xff00ff) * i_78_)
                                    & ~0xff00ff)
                                    + (((i_76_ & 0xff00) * i_77_
                                    + (i_79_ & 0xff00) * i_78_)
                                    & 0xff0000)) >> 8;
                            i_69_ += Class105_Sub3.anInt8481;
                            i_70_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_66_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_80_ = Class105_Sub3.anInt8468;
                while (i_80_ < 0) {
                    int i_81_ = i_80_ + i_8_;
                    if (i_81_ >= 0) {
                        if (i_81_ >= is.length)
                            break;
                        int i_82_ = Class105_Sub3.anInt8451;
                        int i_83_ = (Class105_Sub3.anInt8458
                                + Class105_Sub3.anInt8479);
                        int i_84_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_85_ = Class105_Sub3.anInt8478;
                        int i_86_;
                        if ((i_86_ = i_83_ - (((Class105_Sub3) this).anInt8471
                                << 12))
                                >= 0) {
                            i_86_ = ((Class105_Sub3.anInt8481 - i_86_)
                                    / Class105_Sub3.anInt8481);
                            i_85_ += i_86_;
                            i_83_ += Class105_Sub3.anInt8481 * i_86_;
                            i_84_ += Class105_Sub3.anInt8450 * i_86_;
                            i_82_ += i_86_;
                        }
                        if ((i_86_ = ((i_83_ - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_85_)
                            i_85_ = i_86_;
                        if (i_84_ < 0) {
                            i_86_ = ((Class105_Sub3.anInt8450 - 1 - i_84_)
                                    / Class105_Sub3.anInt8450);
                            i_85_ += i_86_;
                            i_83_ += Class105_Sub3.anInt8481 * i_86_;
                            i_84_ += Class105_Sub3.anInt8450 * i_86_;
                            i_82_ += i_86_;
                        }
                        if ((i_86_
                                = ((1 + i_84_
                                - (((Class105_Sub3) this).anInt8470 << 12)
                                - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_85_)
                            i_85_ = i_86_;
                        int i_87_ = is[i_81_] - i;
                        int i_88_ = -is_7_[i_81_];
                        int i_89_ = i_87_ - (i_82_ - Class105_Sub3.anInt8451);
                        if (i_89_ > 0) {
                            i_82_ += i_89_;
                            i_85_ += i_89_;
                            i_83_ += Class105_Sub3.anInt8481 * i_89_;
                            i_84_ += Class105_Sub3.anInt8450 * i_89_;
                        } else
                            i_88_ -= i_89_;
                        if (i_85_ < i_88_)
                            i_85_ = i_88_;
                        for (/**/; i_85_ < 0; i_85_++) {
                            int i_90_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(((i_84_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_83_ >> 12))]);
                            int i_91_ = i_90_ >>> 24;
                            int i_92_ = 256 - i_91_;
                            int i_93_ = is_9_[i_82_];
                            is_9_[i_82_++] = ((((i_90_ & 0xff00ff) * i_91_
                                    + (i_93_ & 0xff00ff) * i_92_)
                                    & ~0xff00ff)
                                    + (((i_90_ & 0xff00) * i_91_
                                    + (i_93_ & 0xff00) * i_92_)
                                    & 0xff0000)) >> 8;
                            i_83_ += Class105_Sub3.anInt8481;
                            i_84_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_80_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8450 == 0) {
            int i_94_ = Class105_Sub3.anInt8468;
            while (i_94_ < 0) {
                int i_95_ = i_94_ + i_8_;
                if (i_95_ >= 0) {
                    if (i_95_ >= is.length)
                        break;
                    int i_96_ = Class105_Sub3.anInt8451;
                    int i_97_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_98_ = Class105_Sub3.anInt8467;
                    int i_99_ = Class105_Sub3.anInt8478;
                    if (i_98_ >= 0 && i_98_ - (((Class105_Sub3) this).anInt8470
                            << 12) < 0) {
                        if (i_97_ < 0) {
                            int i_100_ = ((Class105_Sub3.anInt8481 - 1 - i_97_)
                                    / Class105_Sub3.anInt8481);
                            i_99_ += i_100_;
                            i_97_ += Class105_Sub3.anInt8481 * i_100_;
                            i_96_ += i_100_;
                        }
                        int i_101_;
                        if ((i_101_
                                = ((1 + i_97_
                                - (((Class105_Sub3) this).anInt8471 << 12)
                                - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_99_)
                            i_99_ = i_101_;
                        int i_102_ = is[i_95_] - i;
                        int i_103_ = -is_7_[i_95_];
                        int i_104_
                                = i_102_ - (i_96_ - Class105_Sub3.anInt8451);
                        if (i_104_ > 0) {
                            i_96_ += i_104_;
                            i_99_ += i_104_;
                            i_97_ += Class105_Sub3.anInt8481 * i_104_;
                            i_98_ += Class105_Sub3.anInt8450 * i_104_;
                        } else
                            i_103_ -= i_104_;
                        if (i_99_ < i_103_)
                            i_99_ = i_103_;
                        for (/**/; i_99_ < 0; i_99_++) {
                            int i_105_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(((i_98_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_97_ >> 12))]);
                            int i_106_ = i_105_ >>> 24;
                            int i_107_ = 256 - i_106_;
                            int i_108_ = is_9_[i_96_];
                            is_9_[i_96_++] = ((((i_105_ & 0xff00ff) * i_106_
                                    + (i_108_ & 0xff00ff) * i_107_)
                                    & ~0xff00ff)
                                    + (((i_105_ & 0xff00) * i_106_
                                    + (i_108_ & 0xff00) * i_107_)
                                    & 0xff0000)) >> 8;
                            i_97_ += Class105_Sub3.anInt8481;
                        }
                    }
                }
                i_94_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else if (Class105_Sub3.anInt8450 < 0) {
            int i_109_ = Class105_Sub3.anInt8468;
            while (i_109_ < 0) {
                int i_110_ = i_109_ + i_8_;
                if (i_110_ >= 0) {
                    if (i_110_ >= is.length)
                        break;
                    int i_111_ = Class105_Sub3.anInt8451;
                    int i_112_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_113_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_114_ = Class105_Sub3.anInt8478;
                    if (i_112_ < 0) {
                        int i_115_ = ((Class105_Sub3.anInt8481 - 1 - i_112_)
                                / Class105_Sub3.anInt8481);
                        i_114_ += i_115_;
                        i_112_ += Class105_Sub3.anInt8481 * i_115_;
                        i_113_ += Class105_Sub3.anInt8450 * i_115_;
                        i_111_ += i_115_;
                    }
                    int i_116_;
                    if ((i_116_ = ((1 + i_112_
                            - (((Class105_Sub3) this).anInt8471 << 12)
                            - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_114_)
                        i_114_ = i_116_;
                    if ((i_116_
                            = i_113_ - (((Class105_Sub3) this).anInt8470 << 12))
                            >= 0) {
                        i_116_ = ((Class105_Sub3.anInt8450 - i_116_)
                                / Class105_Sub3.anInt8450);
                        i_114_ += i_116_;
                        i_112_ += Class105_Sub3.anInt8481 * i_116_;
                        i_113_ += Class105_Sub3.anInt8450 * i_116_;
                        i_111_ += i_116_;
                    }
                    if ((i_116_ = ((i_113_ - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_114_)
                        i_114_ = i_116_;
                    int i_117_ = is[i_110_] - i;
                    int i_118_ = -is_7_[i_110_];
                    int i_119_ = i_117_ - (i_111_ - Class105_Sub3.anInt8451);
                    if (i_119_ > 0) {
                        i_111_ += i_119_;
                        i_114_ += i_119_;
                        i_112_ += Class105_Sub3.anInt8481 * i_119_;
                        i_113_ += Class105_Sub3.anInt8450 * i_119_;
                    } else
                        i_118_ -= i_119_;
                    if (i_114_ < i_118_)
                        i_114_ = i_118_;
                    for (/**/; i_114_ < 0; i_114_++) {
                        int i_120_
                                = (((Class105_Sub3_Sub3) this).anIntArray9936
                                [(((i_113_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_112_ >> 12))]);
                        int i_121_ = i_120_ >>> 24;
                        int i_122_ = 256 - i_121_;
                        int i_123_ = is_9_[i_111_];
                        is_9_[i_111_++] = ((((i_120_ & 0xff00ff) * i_121_
                                + (i_123_ & 0xff00ff) * i_122_)
                                & ~0xff00ff)
                                + (((i_120_ & 0xff00) * i_121_
                                + (i_123_ & 0xff00) * i_122_)
                                & 0xff0000)) >> 8;
                        i_112_ += Class105_Sub3.anInt8481;
                        i_113_ += Class105_Sub3.anInt8450;
                    }
                }
                i_109_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else {
            int i_124_ = Class105_Sub3.anInt8468;
            while (i_124_ < 0) {
                int i_125_ = i_124_ + i_8_;
                if (i_125_ >= 0) {
                    if (i_125_ >= is.length)
                        break;
                    int i_126_ = Class105_Sub3.anInt8451;
                    int i_127_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_128_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_129_ = Class105_Sub3.anInt8478;
                    if (i_127_ < 0) {
                        int i_130_ = ((Class105_Sub3.anInt8481 - 1 - i_127_)
                                / Class105_Sub3.anInt8481);
                        i_129_ += i_130_;
                        i_127_ += Class105_Sub3.anInt8481 * i_130_;
                        i_128_ += Class105_Sub3.anInt8450 * i_130_;
                        i_126_ += i_130_;
                    }
                    int i_131_;
                    if ((i_131_ = ((1 + i_127_
                            - (((Class105_Sub3) this).anInt8471 << 12)
                            - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_129_)
                        i_129_ = i_131_;
                    if (i_128_ < 0) {
                        i_131_ = ((Class105_Sub3.anInt8450 - 1 - i_128_)
                                / Class105_Sub3.anInt8450);
                        i_129_ += i_131_;
                        i_127_ += Class105_Sub3.anInt8481 * i_131_;
                        i_128_ += Class105_Sub3.anInt8450 * i_131_;
                        i_126_ += i_131_;
                    }
                    if ((i_131_ = ((1 + i_128_
                            - (((Class105_Sub3) this).anInt8470 << 12)
                            - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_129_)
                        i_129_ = i_131_;
                    int i_132_ = is[i_125_] - i;
                    int i_133_ = -is_7_[i_125_];
                    int i_134_ = i_132_ - (i_126_ - Class105_Sub3.anInt8451);
                    if (i_134_ > 0) {
                        i_126_ += i_134_;
                        i_129_ += i_134_;
                        i_127_ += Class105_Sub3.anInt8481 * i_134_;
                        i_128_ += Class105_Sub3.anInt8450 * i_134_;
                    } else
                        i_133_ -= i_134_;
                    if (i_129_ < i_133_)
                        i_129_ = i_133_;
                    for (/**/; i_129_ < 0; i_129_++) {
                        int i_135_
                                = (((Class105_Sub3_Sub3) this).anIntArray9936
                                [(((i_128_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_127_ >> 12))]);
                        int i_136_ = i_135_ >>> 24;
                        int i_137_ = 256 - i_136_;
                        int i_138_ = is_9_[i_126_];
                        is_9_[i_126_++] = ((((i_135_ & 0xff00ff) * i_136_
                                + (i_138_ & 0xff00ff) * i_137_)
                                & ~0xff00ff)
                                + (((i_135_ & 0xff00) * i_136_
                                + (i_138_ & 0xff00) * i_137_)
                                & 0xff0000)) >> 8;
                        i_127_ += Class105_Sub3.anInt8481;
                        i_128_ += Class105_Sub3.anInt8450;
                    }
                }
                i_124_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        }
    }

    final void method979(int i, int i_139_, int i_140_, int i_141_, int i_142_,
                         int i_143_) {
        int[] is
                = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anIntArray7483;
        for (int i_144_ = 0; i_144_ < i_141_; i_144_++) {
            int i_145_ = (i_139_ + i_144_) * i_140_ + i;
            int i_146_ = (i_143_ + i_144_) * i_140_ + i_142_;
            for (int i_147_ = 0; i_147_ < i_140_; i_147_++)
                ((Class105_Sub3_Sub3) this).anIntArray9936[i_145_ + i_147_]
                        = is[i_146_ + i_147_] & 0xffffff;
        }
    }

    final void method964(int i, int i_148_, int i_149_, int i_150_,
                         int i_151_) {
        if (((Class105_Sub3) this).aHa_Sub1_8460.method3716())
            throw new IllegalStateException();
        int i_152_
                = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7477;
        i += ((Class105_Sub3) this).anInt8461;
        i_148_ += ((Class105_Sub3) this).anInt8464;
        int i_153_ = i_148_ * i_152_ + i;
        int i_154_ = 0;
        int i_155_ = ((Class105_Sub3) this).anInt8470;
        int i_156_ = ((Class105_Sub3) this).anInt8471;
        int i_157_ = i_152_ - i_156_;
        int i_158_ = 0;
        if (i_148_
                < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476) {
            int i_159_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476
                    - i_148_);
            i_155_ -= i_159_;
            i_148_
                    = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476;
            i_154_ += i_159_ * i_156_;
            i_153_ += i_159_ * i_152_;
        }
        if (i_148_ + i_155_
                > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7503)
            i_155_ -= i_148_ + i_155_ - ((ha_Sub1) (((Class105_Sub3) this)
                    .aHa_Sub1_8460)).anInt7503;
        if (i < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496) {
            int i_160_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496
                    - i);
            i_156_ -= i_160_;
            i = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496;
            i_154_ += i_160_;
            i_153_ += i_160_;
            i_158_ += i_160_;
            i_157_ += i_160_;
        }
        if (i + i_156_
                > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7507) {
            int i_161_ = (i + i_156_
                    - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anInt7507));
            i_156_ -= i_161_;
            i_158_ += i_161_;
            i_157_ += i_161_;
        }
        if (i_156_ > 0 && i_155_ > 0) {
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            if (i_151_ == 0) {
                if (i_149_ == 1) {
                    for (int i_162_ = -i_155_; i_162_ < 0; i_162_++) {
                        int i_163_ = i_153_ + i_156_ - 3;
                        while (i_153_ < i_163_) {
                            is[i_153_++] = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            is[i_153_++] = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            is[i_153_++] = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            is[i_153_++] = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                        }
                        i_163_ += 3;
                        while (i_153_ < i_163_)
                            is[i_153_++] = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                if (i_149_ == 0) {
                    int i_164_ = (i_150_ & 0xff0000) >> 16;
                    int i_165_ = (i_150_ & 0xff00) >> 8;
                    int i_166_ = i_150_ & 0xff;
                    for (int i_167_ = -i_155_; i_167_ < 0; i_167_++) {
                        for (int i_168_ = -i_156_; i_168_ < 0; i_168_++) {
                            int i_169_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            int i_170_
                                    = (i_169_ & 0xff0000) * i_164_ & ~0xffffff;
                            int i_171_ = (i_169_ & 0xff00) * i_165_ & 0xff0000;
                            int i_172_ = (i_169_ & 0xff) * i_166_ & 0xff00;
                            is[i_153_++] = (i_170_ | i_171_ | i_172_) >>> 8;
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                if (i_149_ == 3) {
                    for (int i_173_ = -i_155_; i_173_ < 0; i_173_++) {
                        for (int i_174_ = -i_156_; i_174_ < 0; i_174_++) {
                            int i_175_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            int i_176_ = i_175_ + i_150_;
                            int i_177_
                                    = (i_175_ & 0xff00ff) + (i_150_ & 0xff00ff);
                            int i_178_ = ((i_177_ & 0x1000100)
                                    + (i_176_ - i_177_ & 0x10000));
                            is[i_153_++]
                                    = i_176_ - i_178_ | i_178_ - (i_178_ >>> 8);
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                if (i_149_ == 2) {
                    int i_179_ = i_150_ >>> 24;
                    int i_180_ = 256 - i_179_;
                    int i_181_ = (i_150_ & 0xff00ff) * i_180_ & ~0xff00ff;
                    int i_182_ = (i_150_ & 0xff00) * i_180_ & 0xff0000;
                    i_150_ = (i_181_ | i_182_) >>> 8;
                    for (int i_183_ = -i_155_; i_183_ < 0; i_183_++) {
                        for (int i_184_ = -i_156_; i_184_ < 0; i_184_++) {
                            int i_185_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            i_181_ = (i_185_ & 0xff00ff) * i_179_ & ~0xff00ff;
                            i_182_ = (i_185_ & 0xff00) * i_179_ & 0xff0000;
                            is[i_153_++] = ((i_181_ | i_182_) >>> 8) + i_150_;
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_151_ == 1) {
                if (i_149_ == 1) {
                    for (int i_186_ = -i_155_; i_186_ < 0; i_186_++) {
                        for (int i_187_ = -i_156_; i_187_ < 0; i_187_++) {
                            int i_188_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            int i_189_ = i_188_ >>> 24;
                            int i_190_ = 256 - i_189_;
                            int i_191_ = is[i_153_];
                            is[i_153_++]
                                    = (((((i_188_ & 0xff00ff) * i_189_
                                    + (i_191_ & 0xff00ff) * i_190_)
                                    & ~0xff00ff)
                                    >> 8)
                                    + ((((i_188_ & ~0xff00ff) >>> 8) * i_189_
                                    + ((i_191_ & ~0xff00ff) >>> 8) * i_190_)
                                    & ~0xff00ff));
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                if (i_149_ == 0) {
                    if ((i_150_ & 0xffffff) == 16777215) {
                        for (int i_192_ = -i_155_; i_192_ < 0; i_192_++) {
                            for (int i_193_ = -i_156_; i_193_ < 0; i_193_++) {
                                int i_194_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_154_++]);
                                int i_195_
                                        = (i_194_ >>> 24) * (i_150_ >>> 24) >> 8;
                                int i_196_ = 256 - i_195_;
                                int i_197_ = is[i_153_];
                                is[i_153_++]
                                        = ((((i_194_ & 0xff00ff) * i_195_
                                        + (i_197_ & 0xff00ff) * i_196_)
                                        & ~0xff00ff)
                                        + (((i_194_ & 0xff00) * i_195_
                                        + (i_197_ & 0xff00) * i_196_)
                                        & 0xff0000)) >> 8;
                            }
                            i_153_ += i_157_;
                            i_154_ += i_158_;
                        }
                    } else {
                        int i_198_ = (i_150_ & 0xff0000) >> 16;
                        int i_199_ = (i_150_ & 0xff00) >> 8;
                        int i_200_ = i_150_ & 0xff;
                        for (int i_201_ = -i_155_; i_201_ < 0; i_201_++) {
                            for (int i_202_ = -i_156_; i_202_ < 0; i_202_++) {
                                int i_203_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_154_++]);
                                int i_204_
                                        = (i_203_ >>> 24) * (i_150_ >>> 24) >> 8;
                                int i_205_ = 256 - i_204_;
                                if (i_204_ != 255) {
                                    int i_206_ = ((i_203_ & 0xff0000) * i_198_
                                            & ~0xffffff);
                                    int i_207_ = ((i_203_ & 0xff00) * i_199_
                                            & 0xff0000);
                                    int i_208_
                                            = (i_203_ & 0xff) * i_200_ & 0xff00;
                                    i_203_ = (i_206_ | i_207_ | i_208_) >>> 8;
                                    int i_209_ = is[i_153_];
                                    is[i_153_++]
                                            = ((((i_203_ & 0xff00ff) * i_204_
                                            + (i_209_ & 0xff00ff) * i_205_)
                                            & ~0xff00ff)
                                            + (((i_203_ & 0xff00) * i_204_
                                            + (i_209_ & 0xff00) * i_205_)
                                            & 0xff0000)) >> 8;
                                } else {
                                    int i_210_ = ((i_203_ & 0xff0000) * i_198_
                                            & ~0xffffff);
                                    int i_211_ = ((i_203_ & 0xff00) * i_199_
                                            & 0xff0000);
                                    int i_212_
                                            = (i_203_ & 0xff) * i_200_ & 0xff00;
                                    is[i_153_++]
                                            = (i_210_ | i_211_ | i_212_) >>> 8;
                                }
                            }
                            i_153_ += i_157_;
                            i_154_ += i_158_;
                        }
                        return;
                    }
                    return;
                }
                if (i_149_ == 3) {
                    for (int i_213_ = -i_155_; i_213_ < 0; i_213_++) {
                        for (int i_214_ = -i_156_; i_214_ < 0; i_214_++) {
                            int i_215_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            int i_216_ = i_215_ + i_150_;
                            int i_217_
                                    = (i_215_ & 0xff00ff) + (i_150_ & 0xff00ff);
                            int i_218_ = ((i_217_ & 0x1000100)
                                    + (i_216_ - i_217_ & 0x10000));
                            i_218_ = i_216_ - i_218_ | i_218_ - (i_218_ >>> 8);
                            int i_219_
                                    = (i_218_ >>> 24) * (i_150_ >>> 24) >> 8;
                            int i_220_ = 256 - i_219_;
                            if (i_219_ != 255) {
                                i_215_ = i_218_;
                                i_218_ = is[i_153_];
                                i_218_ = ((((i_215_ & 0xff00ff) * i_219_
                                        + (i_218_ & 0xff00ff) * i_220_)
                                        & ~0xff00ff)
                                        + (((i_215_ & 0xff00) * i_219_
                                        + (i_218_ & 0xff00) * i_220_)
                                        & 0xff0000)) >> 8;
                            }
                            is[i_153_++] = i_218_;
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                if (i_149_ == 2) {
                    int i_221_ = i_150_ >>> 24;
                    int i_222_ = 256 - i_221_;
                    int i_223_ = (i_150_ & 0xff00ff) * i_222_ & ~0xff00ff;
                    int i_224_ = (i_150_ & 0xff00) * i_222_ & 0xff0000;
                    i_150_ = (i_223_ | i_224_) >>> 8;
                    for (int i_225_ = -i_155_; i_225_ < 0; i_225_++) {
                        for (int i_226_ = -i_156_; i_226_ < 0; i_226_++) {
                            int i_227_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            int i_228_ = i_227_ >>> 24;
                            int i_229_ = 256 - i_228_;
                            i_223_ = (i_227_ & 0xff00ff) * i_221_ & ~0xff00ff;
                            i_224_ = (i_227_ & 0xff00) * i_221_ & 0xff0000;
                            i_227_ = ((i_223_ | i_224_) >>> 8) + i_150_;
                            int i_230_ = is[i_153_];
                            is[i_153_++] = ((((i_227_ & 0xff00ff) * i_228_
                                    + (i_230_ & 0xff00ff) * i_229_)
                                    & ~0xff00ff)
                                    + (((i_227_ & 0xff00) * i_228_
                                    + (i_230_ & 0xff00) * i_229_)
                                    & 0xff0000)) >> 8;
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_151_ == 2) {
                if (i_149_ == 1) {
                    for (int i_231_ = -i_155_; i_231_ < 0; i_231_++) {
                        for (int i_232_ = -i_156_; i_232_ < 0; i_232_++) {
                            int i_233_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            if (i_233_ != 0) {
                                int i_234_ = is[i_153_];
                                int i_235_ = i_233_ + i_234_;
                                int i_236_ = ((i_233_ & 0xff00ff)
                                        + (i_234_ & 0xff00ff));
                                i_234_
                                        = (i_236_ & 0x1000100) + (i_235_ - i_236_
                                        & 0x10000);
                                is[i_153_++]
                                        = i_235_ - i_234_ | i_234_ - (i_234_
                                        >>> 8);
                            } else
                                i_153_++;
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                if (i_149_ == 0) {
                    int i_237_ = (i_150_ & 0xff0000) >> 16;
                    int i_238_ = (i_150_ & 0xff00) >> 8;
                    int i_239_ = i_150_ & 0xff;
                    for (int i_240_ = -i_155_; i_240_ < 0; i_240_++) {
                        for (int i_241_ = -i_156_; i_241_ < 0; i_241_++) {
                            int i_242_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            if (i_242_ != 0) {
                                int i_243_
                                        = (i_242_ & 0xff0000) * i_237_ & ~0xffffff;
                                int i_244_
                                        = (i_242_ & 0xff00) * i_238_ & 0xff0000;
                                int i_245_ = (i_242_ & 0xff) * i_239_ & 0xff00;
                                i_242_ = (i_243_ | i_244_ | i_245_) >>> 8;
                                int i_246_ = is[i_153_];
                                int i_247_ = i_242_ + i_246_;
                                int i_248_ = ((i_242_ & 0xff00ff)
                                        + (i_246_ & 0xff00ff));
                                i_246_
                                        = (i_248_ & 0x1000100) + (i_247_ - i_248_
                                        & 0x10000);
                                is[i_153_++]
                                        = i_247_ - i_246_ | i_246_ - (i_246_
                                        >>> 8);
                            } else
                                i_153_++;
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                if (i_149_ == 3) {
                    for (int i_249_ = -i_155_; i_249_ < 0; i_249_++) {
                        for (int i_250_ = -i_156_; i_250_ < 0; i_250_++) {
                            int i_251_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            int i_252_ = i_251_ + i_150_;
                            int i_253_
                                    = (i_251_ & 0xff00ff) + (i_150_ & 0xff00ff);
                            int i_254_ = ((i_253_ & 0x1000100)
                                    + (i_252_ - i_253_ & 0x10000));
                            i_251_ = i_252_ - i_254_ | i_254_ - (i_254_ >>> 8);
                            i_254_ = is[i_153_];
                            i_252_ = i_251_ + i_254_;
                            i_253_ = (i_251_ & 0xff00ff) + (i_254_ & 0xff00ff);
                            i_254_ = (i_253_ & 0x1000100) + (i_252_ - i_253_
                                    & 0x10000);
                            is[i_153_++]
                                    = i_252_ - i_254_ | i_254_ - (i_254_ >>> 8);
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                if (i_149_ == 2) {
                    int i_255_ = i_150_ >>> 24;
                    int i_256_ = 256 - i_255_;
                    int i_257_ = (i_150_ & 0xff00ff) * i_256_ & ~0xff00ff;
                    int i_258_ = (i_150_ & 0xff00) * i_256_ & 0xff0000;
                    i_150_ = (i_257_ | i_258_) >>> 8;
                    for (int i_259_ = -i_155_; i_259_ < 0; i_259_++) {
                        for (int i_260_ = -i_156_; i_260_ < 0; i_260_++) {
                            int i_261_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_154_++]);
                            if (i_261_ != 0) {
                                i_257_
                                        = (i_261_ & 0xff00ff) * i_255_ & ~0xff00ff;
                                i_258_ = (i_261_ & 0xff00) * i_255_ & 0xff0000;
                                i_261_ = ((i_257_ | i_258_) >>> 8) + i_150_;
                                int i_262_ = is[i_153_];
                                int i_263_ = i_261_ + i_262_;
                                int i_264_ = ((i_261_ & 0xff00ff)
                                        + (i_262_ & 0xff00ff));
                                i_262_
                                        = (i_264_ & 0x1000100) + (i_263_ - i_264_
                                        & 0x10000);
                                is[i_153_++]
                                        = i_263_ - i_262_ | i_262_ - (i_262_
                                        >>> 8);
                            } else
                                i_153_++;
                        }
                        i_153_ += i_157_;
                        i_154_ += i_158_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method963(int i, int i_265_, aa var_aa, int i_266_,
                         int i_267_) {
        if (((Class105_Sub3) this).aHa_Sub1_8460.method3716())
            throw new IllegalStateException();
        i += ((Class105_Sub3) this).anInt8461;
        i_265_ += ((Class105_Sub3) this).anInt8464;
        int i_268_ = 0;
        int i_269_
                = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7477;
        int i_270_ = ((Class105_Sub3) this).anInt8471;
        int i_271_ = ((Class105_Sub3) this).anInt8470;
        int i_272_ = i_269_ - i_270_;
        int i_273_ = 0;
        int i_274_ = i + i_265_ * i_269_;
        if (i_265_
                < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476) {
            int i_275_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476
                    - i_265_);
            i_271_ -= i_275_;
            i_265_
                    = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476;
            i_268_ += i_275_ * i_270_;
            i_274_ += i_275_ * i_269_;
        }
        if (i_265_ + i_271_
                > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7503)
            i_271_ -= i_265_ + i_271_ - ((ha_Sub1) (((Class105_Sub3) this)
                    .aHa_Sub1_8460)).anInt7503;
        if (i < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496) {
            int i_276_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496
                    - i);
            i_270_ -= i_276_;
            i = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496;
            i_268_ += i_276_;
            i_274_ += i_276_;
            i_273_ += i_276_;
            i_272_ += i_276_;
        }
        if (i + i_270_
                > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7507) {
            int i_277_ = (i + i_270_
                    - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anInt7507));
            i_270_ -= i_277_;
            i_273_ += i_277_;
            i_272_ += i_277_;
        }
        if (i_270_ > 0 && i_271_ > 0) {
            aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
            int[] is = ((aa_Sub3) var_aa_Sub3).anIntArray5201;
            int[] is_278_ = ((aa_Sub3) var_aa_Sub3).anIntArray5202;
            int[] is_279_ = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            int i_280_ = i_265_;
            if (i_267_ > i_280_) {
                i_280_ = i_267_;
                i_274_ += (i_267_ - i_265_) * i_269_;
                i_268_ += (i_267_ - i_265_) * ((Class105_Sub3) this).anInt8471;
            }
            int i_281_ = (i_267_ + is.length < i_265_ + i_271_
                    ? i_267_ + is.length : i_265_ + i_271_);
            for (int i_282_ = i_280_; i_282_ < i_281_; i_282_++) {
                int i_283_ = is[i_282_ - i_267_] + i_266_;
                int i_284_ = is_278_[i_282_ - i_267_];
                int i_285_ = i_270_;
                if (i > i_283_) {
                    int i_286_ = i - i_283_;
                    if (i_286_ >= i_284_) {
                        i_268_ += i_270_ + i_273_;
                        i_274_ += i_270_ + i_272_;
                        continue;
                    }
                    i_284_ -= i_286_;
                } else {
                    int i_287_ = i_283_ - i;
                    if (i_287_ >= i_270_) {
                        i_268_ += i_270_ + i_273_;
                        i_274_ += i_270_ + i_272_;
                        continue;
                    }
                    i_268_ += i_287_;
                    i_285_ -= i_287_;
                    i_274_ += i_287_;
                }
                int i_288_ = 0;
                if (i_285_ < i_284_)
                    i_284_ = i_285_;
                else
                    i_288_ = i_285_ - i_284_;
                for (int i_289_ = -i_284_; i_289_ < 0; i_289_++) {
                    int i_290_
                            = ((Class105_Sub3_Sub3) this).anIntArray9936[i_268_++];
                    int i_291_ = i_290_ >>> 24;
                    int i_292_ = 256 - i_291_;
                    int i_293_ = is_279_[i_274_];
                    is_279_[i_274_++] = ((((i_290_ & 0xff00ff) * i_291_
                            + (i_293_ & 0xff00ff) * i_292_)
                            & ~0xff00ff)
                            + (((i_290_ & 0xff00) * i_291_
                            + (i_293_ & 0xff00) * i_292_)
                            & 0xff0000)) >> 8;
                }
                i_268_ += i_288_ + i_273_;
                i_274_ += i_288_ + i_272_;
            }
        }
    }

    final void method982(int i, int i_294_, int i_295_, int i_296_, int i_297_,
                         int i_298_, int i_299_, int i_300_) {
        if (((Class105_Sub3) this).aHa_Sub1_8460.method3716())
            throw new IllegalStateException();
        if (i_295_ > 0 && i_296_ > 0) {
            int i_301_ = 0;
            int i_302_ = 0;
            int i_303_
                    = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7477;
            int i_304_ = (((Class105_Sub3) this).anInt8461
                    + ((Class105_Sub3) this).anInt8471
                    + ((Class105_Sub3) this).anInt8454);
            int i_305_ = (((Class105_Sub3) this).anInt8464
                    + ((Class105_Sub3) this).anInt8470
                    + ((Class105_Sub3) this).anInt8456);
            int i_306_ = (i_304_ << 16) / i_295_;
            int i_307_ = (i_305_ << 16) / i_296_;
            if (((Class105_Sub3) this).anInt8461 > 0) {
                int i_308_
                        = (((((Class105_Sub3) this).anInt8461 << 16) + i_306_ - 1)
                        / i_306_);
                i += i_308_;
                i_301_ += i_308_ * i_306_ - (((Class105_Sub3) this).anInt8461
                        << 16);
            }
            if (((Class105_Sub3) this).anInt8464 > 0) {
                int i_309_
                        = (((((Class105_Sub3) this).anInt8464 << 16) + i_307_ - 1)
                        / i_307_);
                i_294_ += i_309_;
                i_302_ += i_309_ * i_307_ - (((Class105_Sub3) this).anInt8464
                        << 16);
            }
            if (((Class105_Sub3) this).anInt8471 < i_304_)
                i_295_ = ((((Class105_Sub3) this).anInt8471 << 16) - i_301_
                        + i_306_ - 1) / i_306_;
            if (((Class105_Sub3) this).anInt8470 < i_305_)
                i_296_ = ((((Class105_Sub3) this).anInt8470 << 16) - i_302_
                        + i_307_ - 1) / i_307_;
            int i_310_ = i + i_294_ * i_303_;
            int i_311_ = i_303_ - i_295_;
            if (i_294_ + i_296_
                    > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7503)
                i_296_ -= (i_294_ + i_296_
                        - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7503));
            if (i_294_
                    < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476) {
                int i_312_ = ((((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7476)
                        - i_294_);
                i_296_ -= i_312_;
                i_310_ += i_312_ * i_303_;
                i_302_ += i_307_ * i_312_;
            }
            if (i + i_295_
                    > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7507) {
                int i_313_
                        = (i + i_295_
                        - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7507));
                i_295_ -= i_313_;
                i_311_ += i_313_;
            }
            if (i
                    < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496) {
                int i_314_ = ((((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7496)
                        - i);
                i_295_ -= i_314_;
                i_310_ += i_314_;
                i_301_ += i_306_ * i_314_;
                i_311_ += i_314_;
            }
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            if (i_299_ == 0) {
                if (i_297_ == 1) {
                    int i_315_ = i_301_;
                    for (int i_316_ = -i_296_; i_316_ < 0; i_316_++) {
                        int i_317_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_318_ = -i_295_; i_318_ < 0; i_318_++) {
                            is[i_310_++]
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_317_]);
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_315_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                if (i_297_ == 0) {
                    int i_319_ = (i_298_ & 0xff0000) >> 16;
                    int i_320_ = (i_298_ & 0xff00) >> 8;
                    int i_321_ = i_298_ & 0xff;
                    int i_322_ = i_301_;
                    for (int i_323_ = -i_296_; i_323_ < 0; i_323_++) {
                        int i_324_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_325_ = -i_295_; i_325_ < 0; i_325_++) {
                            int i_326_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_324_]);
                            int i_327_
                                    = (i_326_ & 0xff0000) * i_319_ & ~0xffffff;
                            int i_328_ = (i_326_ & 0xff00) * i_320_ & 0xff0000;
                            int i_329_ = (i_326_ & 0xff) * i_321_ & 0xff00;
                            is[i_310_++] = (i_327_ | i_328_ | i_329_) >>> 8;
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_322_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                if (i_297_ == 3) {
                    int i_330_ = i_301_;
                    for (int i_331_ = -i_296_; i_331_ < 0; i_331_++) {
                        int i_332_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_333_ = -i_295_; i_333_ < 0; i_333_++) {
                            int i_334_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_332_]);
                            int i_335_ = i_334_ + i_298_;
                            int i_336_
                                    = (i_334_ & 0xff00ff) + (i_298_ & 0xff00ff);
                            int i_337_ = ((i_336_ & 0x1000100)
                                    + (i_335_ - i_336_ & 0x10000));
                            is[i_310_++]
                                    = i_335_ - i_337_ | i_337_ - (i_337_ >>> 8);
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_330_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                if (i_297_ == 2) {
                    int i_338_ = i_298_ >>> 24;
                    int i_339_ = 256 - i_338_;
                    int i_340_ = (i_298_ & 0xff00ff) * i_339_ & ~0xff00ff;
                    int i_341_ = (i_298_ & 0xff00) * i_339_ & 0xff0000;
                    i_298_ = (i_340_ | i_341_) >>> 8;
                    int i_342_ = i_301_;
                    for (int i_343_ = -i_296_; i_343_ < 0; i_343_++) {
                        int i_344_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_345_ = -i_295_; i_345_ < 0; i_345_++) {
                            int i_346_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_344_]);
                            i_340_ = (i_346_ & 0xff00ff) * i_338_ & ~0xff00ff;
                            i_341_ = (i_346_ & 0xff00) * i_338_ & 0xff0000;
                            is[i_310_++] = ((i_340_ | i_341_) >>> 8) + i_298_;
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_342_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_299_ == 1) {
                if (i_297_ == 1) {
                    int i_347_ = i_301_;
                    for (int i_348_ = -i_296_; i_348_ < 0; i_348_++) {
                        int i_349_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_350_ = -i_295_; i_350_ < 0; i_350_++) {
                            int i_351_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_349_]);
                            int i_352_ = i_351_ >>> 24;
                            int i_353_ = 256 - i_352_;
                            int i_354_ = is[i_310_];
                            is[i_310_++]
                                    = (((((i_351_ & 0xff00ff) * i_352_
                                    + (i_354_ & 0xff00ff) * i_353_)
                                    & ~0xff00ff)
                                    >> 8)
                                    + ((((i_351_ & ~0xff00ff) >>> 8) * i_352_
                                    + ((i_354_ & ~0xff00ff) >>> 8) * i_353_)
                                    & ~0xff00ff));
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_347_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                if (i_297_ == 0) {
                    int i_355_ = i_301_;
                    if ((i_298_ & 0xffffff) == 16777215) {
                        for (int i_356_ = -i_296_; i_356_ < 0; i_356_++) {
                            int i_357_ = ((i_302_ >> 16)
                                    * ((Class105_Sub3) this).anInt8471);
                            for (int i_358_ = -i_295_; i_358_ < 0; i_358_++) {
                                int i_359_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_301_ >> 16) + i_357_]);
                                int i_360_
                                        = (i_359_ >>> 24) * (i_298_ >>> 24) >> 8;
                                int i_361_ = 256 - i_360_;
                                int i_362_ = is[i_310_];
                                is[i_310_++]
                                        = ((((i_359_ & 0xff00ff) * i_360_
                                        + (i_362_ & 0xff00ff) * i_361_)
                                        & ~0xff00ff)
                                        + (((i_359_ & 0xff00) * i_360_
                                        + (i_362_ & 0xff00) * i_361_)
                                        & 0xff0000)) >> 8;
                                i_301_ += i_306_;
                            }
                            i_302_ += i_307_;
                            i_301_ = i_355_;
                            i_310_ += i_311_;
                        }
                    } else {
                        int i_363_ = (i_298_ & 0xff0000) >> 16;
                        int i_364_ = (i_298_ & 0xff00) >> 8;
                        int i_365_ = i_298_ & 0xff;
                        for (int i_366_ = -i_296_; i_366_ < 0; i_366_++) {
                            int i_367_ = ((i_302_ >> 16)
                                    * ((Class105_Sub3) this).anInt8471);
                            for (int i_368_ = -i_295_; i_368_ < 0; i_368_++) {
                                int i_369_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_301_ >> 16) + i_367_]);
                                int i_370_
                                        = (i_369_ >>> 24) * (i_298_ >>> 24) >> 8;
                                int i_371_ = 256 - i_370_;
                                if (i_370_ != 255) {
                                    int i_372_ = ((i_369_ & 0xff0000) * i_363_
                                            & ~0xffffff);
                                    int i_373_ = ((i_369_ & 0xff00) * i_364_
                                            & 0xff0000);
                                    int i_374_
                                            = (i_369_ & 0xff) * i_365_ & 0xff00;
                                    i_369_ = (i_372_ | i_373_ | i_374_) >>> 8;
                                    int i_375_ = is[i_310_];
                                    is[i_310_++]
                                            = ((((i_369_ & 0xff00ff) * i_370_
                                            + (i_375_ & 0xff00ff) * i_371_)
                                            & ~0xff00ff)
                                            + (((i_369_ & 0xff00) * i_370_
                                            + (i_375_ & 0xff00) * i_371_)
                                            & 0xff0000)) >> 8;
                                } else {
                                    int i_376_ = ((i_369_ & 0xff0000) * i_363_
                                            & ~0xffffff);
                                    int i_377_ = ((i_369_ & 0xff00) * i_364_
                                            & 0xff0000);
                                    int i_378_
                                            = (i_369_ & 0xff) * i_365_ & 0xff00;
                                    is[i_310_++]
                                            = (i_376_ | i_377_ | i_378_) >>> 8;
                                }
                                i_301_ += i_306_;
                            }
                            i_302_ += i_307_;
                            i_301_ = i_355_;
                            i_310_ += i_311_;
                        }
                        return;
                    }
                    return;
                }
                if (i_297_ == 3) {
                    int i_379_ = i_301_;
                    for (int i_380_ = -i_296_; i_380_ < 0; i_380_++) {
                        int i_381_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_382_ = -i_295_; i_382_ < 0; i_382_++) {
                            int i_383_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_381_]);
                            int i_384_ = i_383_ + i_298_;
                            int i_385_
                                    = (i_383_ & 0xff00ff) + (i_298_ & 0xff00ff);
                            int i_386_ = ((i_385_ & 0x1000100)
                                    + (i_384_ - i_385_ & 0x10000));
                            i_386_ = i_384_ - i_386_ | i_386_ - (i_386_ >>> 8);
                            int i_387_
                                    = (i_386_ >>> 24) * (i_298_ >>> 24) >> 8;
                            int i_388_ = 256 - i_387_;
                            if (i_387_ != 255) {
                                i_383_ = i_386_;
                                i_386_ = is[i_310_];
                                i_386_ = ((((i_383_ & 0xff00ff) * i_387_
                                        + (i_386_ & 0xff00ff) * i_388_)
                                        & ~0xff00ff)
                                        + (((i_383_ & 0xff00) * i_387_
                                        + (i_386_ & 0xff00) * i_388_)
                                        & 0xff0000)) >> 8;
                            }
                            is[i_310_++] = i_386_;
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_379_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                if (i_297_ == 2) {
                    int i_389_ = i_298_ >>> 24;
                    int i_390_ = 256 - i_389_;
                    int i_391_ = (i_298_ & 0xff00ff) * i_390_ & ~0xff00ff;
                    int i_392_ = (i_298_ & 0xff00) * i_390_ & 0xff0000;
                    i_298_ = (i_391_ | i_392_) >>> 8;
                    int i_393_ = i_301_;
                    for (int i_394_ = -i_296_; i_394_ < 0; i_394_++) {
                        int i_395_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_396_ = -i_295_; i_396_ < 0; i_396_++) {
                            int i_397_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_395_]);
                            int i_398_ = i_397_ >>> 24;
                            int i_399_ = 256 - i_398_;
                            i_391_ = (i_397_ & 0xff00ff) * i_389_ & ~0xff00ff;
                            i_392_ = (i_397_ & 0xff00) * i_389_ & 0xff0000;
                            i_397_ = ((i_391_ | i_392_) >>> 8) + i_298_;
                            int i_400_ = is[i_310_];
                            is[i_310_++] = ((((i_397_ & 0xff00ff) * i_398_
                                    + (i_400_ & 0xff00ff) * i_399_)
                                    & ~0xff00ff)
                                    + (((i_397_ & 0xff00) * i_398_
                                    + (i_400_ & 0xff00) * i_399_)
                                    & 0xff0000)) >> 8;
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_393_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_299_ == 2) {
                if (i_297_ == 1) {
                    int i_401_ = i_301_;
                    for (int i_402_ = -i_296_; i_402_ < 0; i_402_++) {
                        int i_403_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_404_ = -i_295_; i_404_ < 0; i_404_++) {
                            int i_405_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_403_]);
                            if (i_405_ != 0) {
                                int i_406_ = is[i_310_];
                                int i_407_ = i_405_ + i_406_;
                                int i_408_ = ((i_405_ & 0xff00ff)
                                        + (i_406_ & 0xff00ff));
                                i_406_
                                        = (i_408_ & 0x1000100) + (i_407_ - i_408_
                                        & 0x10000);
                                is[i_310_++]
                                        = i_407_ - i_406_ | i_406_ - (i_406_
                                        >>> 8);
                            } else
                                i_310_++;
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_401_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                if (i_297_ == 0) {
                    int i_409_ = i_301_;
                    int i_410_ = (i_298_ & 0xff0000) >> 16;
                    int i_411_ = (i_298_ & 0xff00) >> 8;
                    int i_412_ = i_298_ & 0xff;
                    for (int i_413_ = -i_296_; i_413_ < 0; i_413_++) {
                        int i_414_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_415_ = -i_295_; i_415_ < 0; i_415_++) {
                            int i_416_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_414_]);
                            if (i_416_ != 0) {
                                int i_417_
                                        = (i_416_ & 0xff0000) * i_410_ & ~0xffffff;
                                int i_418_
                                        = (i_416_ & 0xff00) * i_411_ & 0xff0000;
                                int i_419_ = (i_416_ & 0xff) * i_412_ & 0xff00;
                                i_416_ = (i_417_ | i_418_ | i_419_) >>> 8;
                                int i_420_ = is[i_310_];
                                int i_421_ = i_416_ + i_420_;
                                int i_422_ = ((i_416_ & 0xff00ff)
                                        + (i_420_ & 0xff00ff));
                                i_420_
                                        = (i_422_ & 0x1000100) + (i_421_ - i_422_
                                        & 0x10000);
                                is[i_310_++]
                                        = i_421_ - i_420_ | i_420_ - (i_420_
                                        >>> 8);
                            } else
                                i_310_++;
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_409_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                if (i_297_ == 3) {
                    int i_423_ = i_301_;
                    for (int i_424_ = -i_296_; i_424_ < 0; i_424_++) {
                        int i_425_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_426_ = -i_295_; i_426_ < 0; i_426_++) {
                            int i_427_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_425_]);
                            int i_428_ = i_427_ + i_298_;
                            int i_429_
                                    = (i_427_ & 0xff00ff) + (i_298_ & 0xff00ff);
                            int i_430_ = ((i_429_ & 0x1000100)
                                    + (i_428_ - i_429_ & 0x10000));
                            i_427_ = i_428_ - i_430_ | i_430_ - (i_430_ >>> 8);
                            i_430_ = is[i_310_];
                            i_428_ = i_427_ + i_430_;
                            i_429_ = (i_427_ & 0xff00ff) + (i_430_ & 0xff00ff);
                            i_430_ = (i_429_ & 0x1000100) + (i_428_ - i_429_
                                    & 0x10000);
                            is[i_310_++]
                                    = i_428_ - i_430_ | i_430_ - (i_430_ >>> 8);
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_423_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                if (i_297_ == 2) {
                    int i_431_ = i_298_ >>> 24;
                    int i_432_ = 256 - i_431_;
                    int i_433_ = (i_298_ & 0xff00ff) * i_432_ & ~0xff00ff;
                    int i_434_ = (i_298_ & 0xff00) * i_432_ & 0xff0000;
                    i_298_ = (i_433_ | i_434_) >>> 8;
                    int i_435_ = i_301_;
                    for (int i_436_ = -i_296_; i_436_ < 0; i_436_++) {
                        int i_437_ = ((i_302_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_438_ = -i_295_; i_438_ < 0; i_438_++) {
                            int i_439_
                                    = (((Class105_Sub3_Sub3) this).anIntArray9936
                                    [(i_301_ >> 16) + i_437_]);
                            if (i_439_ != 0) {
                                i_433_
                                        = (i_439_ & 0xff00ff) * i_431_ & ~0xff00ff;
                                i_434_ = (i_439_ & 0xff00) * i_431_ & 0xff0000;
                                i_439_ = ((i_433_ | i_434_) >>> 8) + i_298_;
                                int i_440_ = is[i_310_];
                                int i_441_ = i_439_ + i_440_;
                                int i_442_ = ((i_439_ & 0xff00ff)
                                        + (i_440_ & 0xff00ff));
                                i_440_
                                        = (i_442_ & 0x1000100) + (i_441_ - i_442_
                                        & 0x10000);
                                is[i_310_++]
                                        = i_441_ - i_440_ | i_440_ - (i_440_
                                        >>> 8);
                            } else
                                i_310_++;
                            i_301_ += i_306_;
                        }
                        i_302_ += i_307_;
                        i_301_ = i_435_;
                        i_310_ += i_311_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    Class105_Sub3_Sub3(ha_Sub1 var_ha_Sub1, int i, int i_443_) {
        super(var_ha_Sub1, i, i_443_);
        ((Class105_Sub3_Sub3) this).anIntArray9936 = new int[i * i_443_];
    }

    final void method996(int i, int i_444_, int i_445_, int i_446_, int i_447_,
                         int i_448_, int i_449_, int i_450_, int i_451_) {
        if (i_446_ > 0 && i_447_ > 0) {
            int i_452_ = 0;
            int i_453_ = 0;
            int i_454_ = (((Class105_Sub3) this).anInt8461
                    + ((Class105_Sub3) this).anInt8471
                    + ((Class105_Sub3) this).anInt8454);
            int i_455_ = (((Class105_Sub3) this).anInt8464
                    + ((Class105_Sub3) this).anInt8470
                    + ((Class105_Sub3) this).anInt8456);
            int i_456_ = (i_454_ << 16) / i_446_;
            int i_457_ = (i_455_ << 16) / i_447_;
            if (((Class105_Sub3) this).anInt8461 > 0) {
                int i_458_
                        = (((((Class105_Sub3) this).anInt8461 << 16) + i_456_ - 1)
                        / i_456_);
                i += i_458_;
                i_452_ += i_458_ * i_456_ - (((Class105_Sub3) this).anInt8461
                        << 16);
            }
            if (((Class105_Sub3) this).anInt8464 > 0) {
                int i_459_
                        = (((((Class105_Sub3) this).anInt8464 << 16) + i_457_ - 1)
                        / i_457_);
                i_444_ += i_459_;
                i_453_ += i_459_ * i_457_ - (((Class105_Sub3) this).anInt8464
                        << 16);
            }
            if (((Class105_Sub3) this).anInt8471 < i_454_)
                i_446_ = ((((Class105_Sub3) this).anInt8471 << 16) - i_452_
                        + i_456_ - 1) / i_456_;
            if (((Class105_Sub3) this).anInt8470 < i_455_)
                i_447_ = ((((Class105_Sub3) this).anInt8470 << 16) - i_453_
                        + i_457_ - 1) / i_457_;
            int i_460_ = i + i_444_ * ((ha_Sub1) (((Class105_Sub3) this)
                    .aHa_Sub1_8460)).anInt7477;
            int i_461_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7477
                    - i_446_);
            if (i_444_ + i_447_
                    > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7503)
                i_447_ -= (i_444_ + i_447_
                        - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7503));
            if (i_444_
                    < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476) {
                int i_462_ = ((((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7476)
                        - i_444_);
                i_447_ -= i_462_;
                i_460_ += i_462_ * ((ha_Sub1) (((Class105_Sub3) this)
                        .aHa_Sub1_8460)).anInt7477;
                i_453_ += i_457_ * i_462_;
            }
            if (i + i_446_
                    > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7507) {
                int i_463_
                        = (i + i_446_
                        - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7507));
                i_446_ -= i_463_;
                i_461_ += i_463_;
            }
            if (i
                    < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496) {
                int i_464_ = ((((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7496)
                        - i);
                i_446_ -= i_464_;
                i_460_ += i_464_;
                i_452_ += i_456_ * i_464_;
                i_461_ += i_464_;
            }
            float[] fs = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .aFloatArray7511);
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            if (i_450_ == 0) {
                if (i_448_ == 1) {
                    int i_465_ = i_452_;
                    for (int i_466_ = -i_447_; i_466_ < 0; i_466_++) {
                        int i_467_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_468_ = -i_446_; i_468_ < 0; i_468_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                is[i_460_] = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_467_]);
                                fs[i_460_] = (float) i_445_;
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_465_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                if (i_448_ == 0) {
                    int i_469_ = (i_449_ & 0xff0000) >> 16;
                    int i_470_ = (i_449_ & 0xff00) >> 8;
                    int i_471_ = i_449_ & 0xff;
                    int i_472_ = i_452_;
                    for (int i_473_ = -i_447_; i_473_ < 0; i_473_++) {
                        int i_474_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_475_ = -i_446_; i_475_ < 0; i_475_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_476_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_474_]);
                                int i_477_
                                        = (i_476_ & 0xff0000) * i_469_ & ~0xffffff;
                                int i_478_
                                        = (i_476_ & 0xff00) * i_470_ & 0xff0000;
                                int i_479_ = (i_476_ & 0xff) * i_471_ & 0xff00;
                                is[i_460_] = (i_477_ | i_478_ | i_479_) >>> 8;
                                fs[i_460_] = (float) i_445_;
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_472_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                if (i_448_ == 3) {
                    int i_480_ = i_452_;
                    for (int i_481_ = -i_447_; i_481_ < 0; i_481_++) {
                        int i_482_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_483_ = -i_446_; i_483_ < 0; i_483_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_484_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_482_]);
                                int i_485_ = i_484_ + i_449_;
                                int i_486_ = ((i_484_ & 0xff00ff)
                                        + (i_449_ & 0xff00ff));
                                int i_487_ = ((i_486_ & 0x1000100)
                                        + (i_485_ - i_486_ & 0x10000));
                                is[i_460_]
                                        = i_485_ - i_487_ | i_487_ - (i_487_
                                        >>> 8);
                                fs[i_460_] = (float) i_445_;
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_480_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                if (i_448_ == 2) {
                    int i_488_ = i_449_ >>> 24;
                    int i_489_ = 256 - i_488_;
                    int i_490_ = (i_449_ & 0xff00ff) * i_489_ & ~0xff00ff;
                    int i_491_ = (i_449_ & 0xff00) * i_489_ & 0xff0000;
                    i_449_ = (i_490_ | i_491_) >>> 8;
                    int i_492_ = i_452_;
                    for (int i_493_ = -i_447_; i_493_ < 0; i_493_++) {
                        int i_494_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_495_ = -i_446_; i_495_ < 0; i_495_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_496_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_494_]);
                                i_490_
                                        = (i_496_ & 0xff00ff) * i_488_ & ~0xff00ff;
                                i_491_ = (i_496_ & 0xff00) * i_488_ & 0xff0000;
                                is[i_460_]
                                        = ((i_490_ | i_491_) >>> 8) + i_449_;
                                fs[i_460_] = (float) i_445_;
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_492_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_450_ == 1) {
                if (i_448_ == 1) {
                    int i_497_ = i_452_;
                    for (int i_498_ = -i_447_; i_498_ < 0; i_498_++) {
                        int i_499_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_500_ = -i_446_; i_500_ < 0; i_500_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_501_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_499_]);
                                int i_502_ = i_501_ >>> 24;
                                int i_503_ = 256 - i_502_;
                                int i_504_ = is[i_460_];
                                is[i_460_]
                                        = (((((i_501_ & 0xff00ff) * i_502_
                                        + (i_504_ & 0xff00ff) * i_503_)
                                        & ~0xff00ff)
                                        >> 8)
                                        + (((((i_501_ & ~0xff00ff) >>> 8)
                                        * i_502_)
                                        + (((i_504_ & ~0xff00ff) >>> 8)
                                        * i_503_))
                                        & ~0xff00ff));
                                fs[i_460_] = (float) i_445_;
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_497_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                if (i_448_ == 0) {
                    int i_505_ = i_452_;
                    if ((i_449_ & 0xffffff) == 16777215) {
                        for (int i_506_ = -i_447_; i_506_ < 0; i_506_++) {
                            int i_507_ = ((i_453_ >> 16)
                                    * ((Class105_Sub3) this).anInt8471);
                            for (int i_508_ = -i_446_; i_508_ < 0; i_508_++) {
                                if ((float) i_445_ < fs[i_460_]) {
                                    int i_509_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936
                                            [(i_452_ >> 16) + i_507_]);
                                    int i_510_
                                            = ((i_509_ >>> 24) * (i_449_ >>> 24)
                                            >> 8);
                                    int i_511_ = 256 - i_510_;
                                    int i_512_ = is[i_460_];
                                    is[i_460_]
                                            = ((((i_509_ & 0xff00ff) * i_510_
                                            + (i_512_ & 0xff00ff) * i_511_)
                                            & ~0xff00ff)
                                            + (((i_509_ & 0xff00) * i_510_
                                            + (i_512_ & 0xff00) * i_511_)
                                            & 0xff0000)) >> 8;
                                    fs[i_460_] = (float) i_445_;
                                }
                                i_452_ += i_456_;
                                i_460_++;
                            }
                            i_453_ += i_457_;
                            i_452_ = i_505_;
                            i_460_ += i_461_;
                        }
                    } else {
                        int i_513_ = (i_449_ & 0xff0000) >> 16;
                        int i_514_ = (i_449_ & 0xff00) >> 8;
                        int i_515_ = i_449_ & 0xff;
                        for (int i_516_ = -i_447_; i_516_ < 0; i_516_++) {
                            int i_517_ = ((i_453_ >> 16)
                                    * ((Class105_Sub3) this).anInt8471);
                            for (int i_518_ = -i_446_; i_518_ < 0; i_518_++) {
                                if ((float) i_445_ < fs[i_460_]) {
                                    int i_519_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936
                                            [(i_452_ >> 16) + i_517_]);
                                    int i_520_
                                            = ((i_519_ >>> 24) * (i_449_ >>> 24)
                                            >> 8);
                                    int i_521_ = 256 - i_520_;
                                    if (i_520_ != 255) {
                                        int i_522_
                                                = ((i_519_ & 0xff0000) * i_513_
                                                & ~0xffffff);
                                        int i_523_
                                                = ((i_519_ & 0xff00) * i_514_
                                                & 0xff0000);
                                        int i_524_ = ((i_519_ & 0xff) * i_515_
                                                & 0xff00);
                                        i_519_
                                                = (i_522_ | i_523_ | i_524_) >>> 8;
                                        int i_525_ = is[i_460_];
                                        is[i_460_]
                                                = ((((i_519_ & 0xff00ff) * i_520_
                                                + ((i_525_ & 0xff00ff)
                                                * i_521_))
                                                & ~0xff00ff)
                                                + (((i_519_ & 0xff00) * i_520_
                                                + ((i_525_ & 0xff00)
                                                * i_521_))
                                                & 0xff0000)) >> 8;
                                        fs[i_460_] = (float) i_445_;
                                    } else {
                                        int i_526_
                                                = ((i_519_ & 0xff0000) * i_513_
                                                & ~0xffffff);
                                        int i_527_
                                                = ((i_519_ & 0xff00) * i_514_
                                                & 0xff0000);
                                        int i_528_ = ((i_519_ & 0xff) * i_515_
                                                & 0xff00);
                                        is[i_460_]
                                                = (i_526_ | i_527_ | i_528_) >>> 8;
                                        fs[i_460_] = (float) i_445_;
                                    }
                                }
                                i_452_ += i_456_;
                                i_460_++;
                            }
                            i_453_ += i_457_;
                            i_452_ = i_505_;
                            i_460_ += i_461_;
                        }
                        return;
                    }
                    return;
                }
                if (i_448_ == 3) {
                    int i_529_ = i_452_;
                    for (int i_530_ = -i_447_; i_530_ < 0; i_530_++) {
                        int i_531_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_532_ = -i_446_; i_532_ < 0; i_532_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_533_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_531_]);
                                int i_534_ = i_533_ + i_449_;
                                int i_535_ = ((i_533_ & 0xff00ff)
                                        + (i_449_ & 0xff00ff));
                                int i_536_ = ((i_535_ & 0x1000100)
                                        + (i_534_ - i_535_ & 0x10000));
                                i_536_ = i_534_ - i_536_ | i_536_ - (i_536_
                                        >>> 8);
                                int i_537_
                                        = (i_536_ >>> 24) * (i_449_ >>> 24) >> 8;
                                int i_538_ = 256 - i_537_;
                                if (i_537_ != 255) {
                                    i_533_ = i_536_;
                                    i_536_ = is[i_460_];
                                    i_536_ = ((((i_533_ & 0xff00ff) * i_537_
                                            + (i_536_ & 0xff00ff) * i_538_)
                                            & ~0xff00ff)
                                            + (((i_533_ & 0xff00) * i_537_
                                            + (i_536_ & 0xff00) * i_538_)
                                            & 0xff0000)) >> 8;
                                }
                                is[i_460_] = i_536_;
                                fs[i_460_] = (float) i_445_;
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_529_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                if (i_448_ == 2) {
                    int i_539_ = i_449_ >>> 24;
                    int i_540_ = 256 - i_539_;
                    int i_541_ = (i_449_ & 0xff00ff) * i_540_ & ~0xff00ff;
                    int i_542_ = (i_449_ & 0xff00) * i_540_ & 0xff0000;
                    i_449_ = (i_541_ | i_542_) >>> 8;
                    int i_543_ = i_452_;
                    for (int i_544_ = -i_447_; i_544_ < 0; i_544_++) {
                        int i_545_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_546_ = -i_446_; i_546_ < 0; i_546_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_547_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_545_]);
                                int i_548_ = i_547_ >>> 24;
                                int i_549_ = 256 - i_548_;
                                i_541_
                                        = (i_547_ & 0xff00ff) * i_539_ & ~0xff00ff;
                                i_542_ = (i_547_ & 0xff00) * i_539_ & 0xff0000;
                                i_547_ = ((i_541_ | i_542_) >>> 8) + i_449_;
                                int i_550_ = is[i_460_];
                                is[i_460_] = ((((i_547_ & 0xff00ff) * i_548_
                                        + (i_550_ & 0xff00ff) * i_549_)
                                        & ~0xff00ff)
                                        + (((i_547_ & 0xff00) * i_548_
                                        + (i_550_ & 0xff00) * i_549_)
                                        & 0xff0000)) >> 8;
                                fs[i_460_] = (float) i_445_;
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_543_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_450_ == 2) {
                if (i_448_ == 1) {
                    int i_551_ = i_452_;
                    for (int i_552_ = -i_447_; i_552_ < 0; i_552_++) {
                        int i_553_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_554_ = -i_446_; i_554_ < 0; i_554_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_555_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_553_]);
                                if (i_555_ != 0) {
                                    int i_556_ = is[i_460_];
                                    int i_557_ = i_555_ + i_556_;
                                    int i_558_ = ((i_555_ & 0xff00ff)
                                            + (i_556_ & 0xff00ff));
                                    i_556_ = ((i_558_ & 0x1000100)
                                            + (i_557_ - i_558_ & 0x10000));
                                    is[i_460_]
                                            = i_557_ - i_556_ | i_556_ - (i_556_
                                            >>> 8);
                                    fs[i_460_] = (float) i_445_;
                                }
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_551_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                if (i_448_ == 0) {
                    int i_559_ = i_452_;
                    int i_560_ = (i_449_ & 0xff0000) >> 16;
                    int i_561_ = (i_449_ & 0xff00) >> 8;
                    int i_562_ = i_449_ & 0xff;
                    for (int i_563_ = -i_447_; i_563_ < 0; i_563_++) {
                        int i_564_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_565_ = -i_446_; i_565_ < 0; i_565_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_566_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_564_]);
                                if (i_566_ != 0) {
                                    int i_567_ = ((i_566_ & 0xff0000) * i_560_
                                            & ~0xffffff);
                                    int i_568_ = ((i_566_ & 0xff00) * i_561_
                                            & 0xff0000);
                                    int i_569_
                                            = (i_566_ & 0xff) * i_562_ & 0xff00;
                                    i_566_ = (i_567_ | i_568_ | i_569_) >>> 8;
                                    int i_570_ = is[i_460_];
                                    int i_571_ = i_566_ + i_570_;
                                    int i_572_ = ((i_566_ & 0xff00ff)
                                            + (i_570_ & 0xff00ff));
                                    i_570_ = ((i_572_ & 0x1000100)
                                            + (i_571_ - i_572_ & 0x10000));
                                    is[i_460_]
                                            = i_571_ - i_570_ | i_570_ - (i_570_
                                            >>> 8);
                                    fs[i_460_] = (float) i_445_;
                                }
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_559_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                if (i_448_ == 3) {
                    int i_573_ = i_452_;
                    for (int i_574_ = -i_447_; i_574_ < 0; i_574_++) {
                        int i_575_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_576_ = -i_446_; i_576_ < 0; i_576_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_577_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_575_]);
                                int i_578_ = i_577_ + i_449_;
                                int i_579_ = ((i_577_ & 0xff00ff)
                                        + (i_449_ & 0xff00ff));
                                int i_580_ = ((i_579_ & 0x1000100)
                                        + (i_578_ - i_579_ & 0x10000));
                                i_577_ = i_578_ - i_580_ | i_580_ - (i_580_
                                        >>> 8);
                                i_580_ = is[i_460_];
                                i_578_ = i_577_ + i_580_;
                                i_579_ = (i_577_ & 0xff00ff) + (i_580_
                                        & 0xff00ff);
                                i_580_
                                        = (i_579_ & 0x1000100) + (i_578_ - i_579_
                                        & 0x10000);
                                is[i_460_]
                                        = i_578_ - i_580_ | i_580_ - (i_580_
                                        >>> 8);
                                fs[i_460_] = (float) i_445_;
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_573_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                if (i_448_ == 2) {
                    int i_581_ = i_449_ >>> 24;
                    int i_582_ = 256 - i_581_;
                    int i_583_ = (i_449_ & 0xff00ff) * i_582_ & ~0xff00ff;
                    int i_584_ = (i_449_ & 0xff00) * i_582_ & 0xff0000;
                    i_449_ = (i_583_ | i_584_) >>> 8;
                    int i_585_ = i_452_;
                    for (int i_586_ = -i_447_; i_586_ < 0; i_586_++) {
                        int i_587_ = ((i_453_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_588_ = -i_446_; i_588_ < 0; i_588_++) {
                            if ((float) i_445_ < fs[i_460_]) {
                                int i_589_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936
                                        [(i_452_ >> 16) + i_587_]);
                                if (i_589_ != 0) {
                                    i_583_ = ((i_589_ & 0xff00ff) * i_581_
                                            & ~0xff00ff);
                                    i_584_ = ((i_589_ & 0xff00) * i_581_
                                            & 0xff0000);
                                    i_589_
                                            = ((i_583_ | i_584_) >>> 8) + i_449_;
                                    int i_590_ = is[i_460_];
                                    int i_591_ = i_589_ + i_590_;
                                    int i_592_ = ((i_589_ & 0xff00ff)
                                            + (i_590_ & 0xff00ff));
                                    i_590_ = ((i_592_ & 0x1000100)
                                            + (i_591_ - i_592_ & 0x10000));
                                    is[i_460_]
                                            = i_591_ - i_590_ | i_590_ - (i_590_
                                            >>> 8);
                                    fs[i_460_] = (float) i_445_;
                                }
                            }
                            i_452_ += i_456_;
                            i_460_++;
                        }
                        i_453_ += i_457_;
                        i_452_ = i_585_;
                        i_460_ += i_461_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method968(int i, int i_593_, int i_594_) {
        if (i_594_ == 0) {
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            for (int i_595_ = 0; i_595_ < ((Class105_Sub3) this).anInt8470;
                 i_595_++) {
                int i_596_ = i_595_ * ((Class105_Sub3) this).anInt8471;
                int i_597_
                        = (((i_593_ + i_595_)
                        * (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7477))
                        + i);
                for (int i_598_ = 0; i_598_ < ((Class105_Sub3) this).anInt8471;
                     i_598_++)
                    ((Class105_Sub3_Sub3) this).anIntArray9936[i_596_ + i_598_]
                            = ((((Class105_Sub3_Sub3) this).anIntArray9936
                            [i_596_ + i_598_]) & 0xffffff
                            | is[i_597_ + i_598_] << 8 & ~0xffffff);
            }
        } else if (i_594_ == 1) {
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            for (int i_599_ = 0; i_599_ < ((Class105_Sub3) this).anInt8470;
                 i_599_++) {
                int i_600_ = i_599_ * ((Class105_Sub3) this).anInt8471;
                int i_601_
                        = (((i_593_ + i_599_)
                        * (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7477))
                        + i);
                for (int i_602_ = 0; i_602_ < ((Class105_Sub3) this).anInt8471;
                     i_602_++)
                    ((Class105_Sub3_Sub3) this).anIntArray9936[i_600_ + i_602_]
                            = ((((Class105_Sub3_Sub3) this).anIntArray9936
                            [i_600_ + i_602_]) & 0xffffff
                            | is[i_601_ + i_602_] << 16 & ~0xffffff);
            }
        } else if (i_594_ == 2) {
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            for (int i_603_ = 0; i_603_ < ((Class105_Sub3) this).anInt8470;
                 i_603_++) {
                int i_604_ = i_603_ * ((Class105_Sub3) this).anInt8471;
                int i_605_
                        = (((i_593_ + i_603_)
                        * (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7477))
                        + i);
                for (int i_606_ = 0; i_606_ < ((Class105_Sub3) this).anInt8471;
                     i_606_++)
                    ((Class105_Sub3_Sub3) this).anIntArray9936[i_604_ + i_606_]
                            = ((((Class105_Sub3_Sub3) this).anIntArray9936
                            [i_604_ + i_606_]) & 0xffffff
                            | is[i_605_ + i_606_] << 24 & ~0xffffff);
            }
        } else if (i_594_ == 3) {
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            for (int i_607_ = 0; i_607_ < ((Class105_Sub3) this).anInt8470;
                 i_607_++) {
                int i_608_ = i_607_ * ((Class105_Sub3) this).anInt8471;
                int i_609_
                        = (((i_593_ + i_607_)
                        * (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7477))
                        + i);
                for (int i_610_ = 0; i_610_ < ((Class105_Sub3) this).anInt8471;
                     i_610_++)
                    ((Class105_Sub3_Sub3) this).anIntArray9936[i_608_ + i_610_]
                            = ((((Class105_Sub3_Sub3) this).anIntArray9936
                            [i_608_ + i_610_]) & 0xffffff
                            | (is[i_609_ + i_610_] != 0 ? -16777216 : 0));
            }
        }
    }

    final void method994(int i, int i_611_) {
        int[] is
                = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anIntArray7483;
        if (Class105_Sub3.anInt8481 == 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_612_ = Class105_Sub3.anInt8468;
                while (i_612_ < 0) {
                    int i_613_ = Class105_Sub3.anInt8451;
                    int i_614_ = Class105_Sub3.anInt8458;
                    int i_615_ = Class105_Sub3.anInt8467;
                    int i_616_ = Class105_Sub3.anInt8478;
                    if (i_614_ >= 0 && i_615_ >= 0
                            && (i_614_ - (((Class105_Sub3) this).anInt8471 << 12)
                            < 0)
                            && (i_615_ - (((Class105_Sub3) this).anInt8470 << 12)
                            < 0)) {
                        for (/**/; i_616_ < 0; i_616_++) {
                            int i_617_ = (((i_615_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_614_ >> 12));
                            int i_618_ = i_613_++;
                            int[] is_619_ = is;
                            int i_620_ = i;
                            int i_621_ = i_611_;
                            if (i_621_ == 0) {
                                if (i_620_ == 1)
                                    is_619_[i_618_]
                                            = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                else if (i_620_ == 0) {
                                    int i_622_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_++]);
                                    int i_623_ = (((i_622_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_624_ = (((i_622_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_625_ = (((i_622_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_619_[i_618_]
                                            = (i_623_ | i_624_ | i_625_) >>> 8;
                                } else if (i_620_ == 3) {
                                    int i_626_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_++]);
                                    int i_627_ = Class105_Sub3.anInt8480;
                                    int i_628_ = i_626_ + i_627_;
                                    int i_629_ = ((i_626_ & 0xff00ff)
                                            + (i_627_ & 0xff00ff));
                                    int i_630_
                                            = ((i_629_ & 0x1000100)
                                            + (i_628_ - i_629_ & 0x10000));
                                    is_619_[i_618_]
                                            = i_628_ - i_630_ | i_630_ - (i_630_
                                            >>> 8);
                                } else if (i_620_ == 2) {
                                    int i_631_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                    int i_632_ = (((i_631_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_633_ = (((i_631_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_619_[i_618_]
                                            = (((i_632_ | i_633_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_621_ == 1) {
                                if (i_620_ == 1) {
                                    int i_634_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                    int i_635_ = i_634_ >>> 24;
                                    int i_636_ = 256 - i_635_;
                                    int i_637_ = is_619_[i_618_];
                                    is_619_[i_618_]
                                            = ((((i_634_ & 0xff00ff) * i_635_
                                            + (i_637_ & 0xff00ff) * i_636_)
                                            & ~0xff00ff)
                                            + (((i_634_ & 0xff00) * i_635_
                                            + (i_637_ & 0xff00) * i_636_)
                                            & 0xff0000)) >> 8;
                                } else if (i_620_ == 0) {
                                    int i_638_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                    int i_639_ = (((i_638_ >>> 24)
                                            * Class105_Sub3.anInt8477)
                                            >> 8);
                                    int i_640_ = 256 - i_639_;
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_641_ = is_619_[i_618_];
                                        is_619_[i_618_]
                                                = ((((i_638_ & 0xff00ff) * i_639_
                                                + ((i_641_ & 0xff00ff)
                                                * i_640_))
                                                & ~0xff00ff)
                                                + (((i_638_ & 0xff00) * i_639_
                                                + ((i_641_ & 0xff00)
                                                * i_640_))
                                                & 0xff0000)) >> 8;
                                    } else if (i_639_ != 255) {
                                        int i_642_
                                                = (((i_638_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_643_
                                                = (((i_638_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_644_
                                                = (((i_638_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_638_
                                                = (i_642_ | i_643_ | i_644_) >>> 8;
                                        int i_645_ = is_619_[i_618_];
                                        is_619_[i_618_]
                                                = ((((i_638_ & 0xff00ff) * i_639_
                                                + ((i_645_ & 0xff00ff)
                                                * i_640_))
                                                & ~0xff00ff)
                                                + (((i_638_ & 0xff00) * i_639_
                                                + ((i_645_ & 0xff00)
                                                * i_640_))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_646_
                                                = (((i_638_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_647_
                                                = (((i_638_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_648_
                                                = (((i_638_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_619_[i_618_]
                                                = (i_646_ | i_647_ | i_648_) >>> 8;
                                    }
                                } else if (i_620_ == 3) {
                                    int i_649_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                    int i_650_ = Class105_Sub3.anInt8480;
                                    int i_651_ = i_649_ + i_650_;
                                    int i_652_ = ((i_649_ & 0xff00ff)
                                            + (i_650_ & 0xff00ff));
                                    int i_653_
                                            = ((i_652_ & 0x1000100)
                                            + (i_651_ - i_652_ & 0x10000));
                                    i_653_
                                            = i_651_ - i_653_ | i_653_ - (i_653_
                                            >>> 8);
                                    int i_654_ = (((i_649_ >>> 24)
                                            * Class105_Sub3.anInt8477)
                                            >> 8);
                                    int i_655_ = 256 - i_654_;
                                    if (i_654_ != 255) {
                                        i_649_ = i_653_;
                                        i_653_ = is_619_[i_618_];
                                        i_653_
                                                = ((((i_649_ & 0xff00ff) * i_654_
                                                + ((i_653_ & 0xff00ff)
                                                * i_655_))
                                                & ~0xff00ff)
                                                + (((i_649_ & 0xff00) * i_654_
                                                + ((i_653_ & 0xff00)
                                                * i_655_))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_619_[i_618_] = i_653_;
                                } else if (i_620_ == 2) {
                                    int i_656_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                    int i_657_ = i_656_ >>> 24;
                                    int i_658_ = 256 - i_657_;
                                    int i_659_ = (((i_656_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_660_ = (((i_656_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_656_ = (((i_659_ | i_660_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_661_ = is_619_[i_618_];
                                    is_619_[i_618_]
                                            = ((((i_656_ & 0xff00ff) * i_657_
                                            + (i_661_ & 0xff00ff) * i_658_)
                                            & ~0xff00ff)
                                            + (((i_656_ & 0xff00) * i_657_
                                            + (i_661_ & 0xff00) * i_658_)
                                            & 0xff0000)) >> 8;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_621_ == 2) {
                                if (i_620_ == 1) {
                                    int i_662_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                    int i_663_ = is_619_[i_618_];
                                    int i_664_ = i_662_ + i_663_;
                                    int i_665_ = ((i_662_ & 0xff00ff)
                                            + (i_663_ & 0xff00ff));
                                    i_663_ = ((i_665_ & 0x1000100)
                                            + (i_664_ - i_665_ & 0x10000));
                                    is_619_[i_618_]
                                            = i_664_ - i_663_ | i_663_ - (i_663_
                                            >>> 8);
                                } else if (i_620_ == 0) {
                                    int i_666_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                    int i_667_ = (((i_666_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_668_ = (((i_666_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_669_ = (((i_666_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_666_ = (i_667_ | i_668_ | i_669_) >>> 8;
                                    int i_670_ = is_619_[i_618_];
                                    int i_671_ = i_666_ + i_670_;
                                    int i_672_ = ((i_666_ & 0xff00ff)
                                            + (i_670_ & 0xff00ff));
                                    i_670_ = ((i_672_ & 0x1000100)
                                            + (i_671_ - i_672_ & 0x10000));
                                    is_619_[i_618_]
                                            = i_671_ - i_670_ | i_670_ - (i_670_
                                            >>> 8);
                                } else if (i_620_ == 3) {
                                    int i_673_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                    int i_674_ = Class105_Sub3.anInt8480;
                                    int i_675_ = i_673_ + i_674_;
                                    int i_676_ = ((i_673_ & 0xff00ff)
                                            + (i_674_ & 0xff00ff));
                                    int i_677_
                                            = ((i_676_ & 0x1000100)
                                            + (i_675_ - i_676_ & 0x10000));
                                    i_673_
                                            = i_675_ - i_677_ | i_677_ - (i_677_
                                            >>> 8);
                                    i_677_ = is_619_[i_618_];
                                    i_675_ = i_673_ + i_677_;
                                    i_676_
                                            = (i_673_ & 0xff00ff) + (i_677_
                                            & 0xff00ff);
                                    i_677_ = ((i_676_ & 0x1000100)
                                            + (i_675_ - i_676_ & 0x10000));
                                    is_619_[i_618_]
                                            = i_675_ - i_677_ | i_677_ - (i_677_
                                            >>> 8);
                                } else if (i_620_ == 2) {
                                    int i_678_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_617_]);
                                    int i_679_ = (((i_678_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_680_ = (((i_678_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_678_ = (((i_679_ | i_680_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_681_ = is_619_[i_618_];
                                    int i_682_ = i_678_ + i_681_;
                                    int i_683_ = ((i_678_ & 0xff00ff)
                                            + (i_681_ & 0xff00ff));
                                    i_681_ = ((i_683_ & 0x1000100)
                                            + (i_682_ - i_683_ & 0x10000));
                                    is_619_[i_618_]
                                            = i_682_ - i_681_ | i_681_ - (i_681_
                                            >>> 8);
                                }
                            } else
                                throw new IllegalArgumentException();
                        }
                    }
                    i_612_++;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_684_ = Class105_Sub3.anInt8468;
                while (i_684_ < 0) {
                    int i_685_ = Class105_Sub3.anInt8451;
                    int i_686_ = Class105_Sub3.anInt8458;
                    int i_687_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_688_ = Class105_Sub3.anInt8478;
                    if (i_686_ >= 0
                            && (i_686_ - (((Class105_Sub3) this).anInt8471 << 12)
                            < 0)) {
                        int i_689_;
                        if ((i_689_
                                = i_687_ - (((Class105_Sub3) this).anInt8470
                                << 12))
                                >= 0) {
                            i_689_ = ((Class105_Sub3.anInt8450 - i_689_)
                                    / Class105_Sub3.anInt8450);
                            i_688_ += i_689_;
                            i_687_ += Class105_Sub3.anInt8450 * i_689_;
                            i_685_ += i_689_;
                        }
                        if ((i_689_ = ((i_687_ - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_688_)
                            i_688_ = i_689_;
                        for (/**/; i_688_ < 0; i_688_++) {
                            int i_690_ = (((i_687_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_686_ >> 12));
                            int i_691_ = i_685_++;
                            int[] is_692_ = is;
                            int i_693_ = i;
                            int i_694_ = i_611_;
                            if (i_694_ == 0) {
                                if (i_693_ == 1)
                                    is_692_[i_691_]
                                            = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                else if (i_693_ == 0) {
                                    int i_695_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_++]);
                                    int i_696_ = (((i_695_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_697_ = (((i_695_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_698_ = (((i_695_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_692_[i_691_]
                                            = (i_696_ | i_697_ | i_698_) >>> 8;
                                } else if (i_693_ == 3) {
                                    int i_699_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_++]);
                                    int i_700_ = Class105_Sub3.anInt8480;
                                    int i_701_ = i_699_ + i_700_;
                                    int i_702_ = ((i_699_ & 0xff00ff)
                                            + (i_700_ & 0xff00ff));
                                    int i_703_
                                            = ((i_702_ & 0x1000100)
                                            + (i_701_ - i_702_ & 0x10000));
                                    is_692_[i_691_]
                                            = i_701_ - i_703_ | i_703_ - (i_703_
                                            >>> 8);
                                } else if (i_693_ == 2) {
                                    int i_704_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                    int i_705_ = (((i_704_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_706_ = (((i_704_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_692_[i_691_]
                                            = (((i_705_ | i_706_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_694_ == 1) {
                                if (i_693_ == 1) {
                                    int i_707_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                    int i_708_ = i_707_ >>> 24;
                                    int i_709_ = 256 - i_708_;
                                    int i_710_ = is_692_[i_691_];
                                    is_692_[i_691_]
                                            = ((((i_707_ & 0xff00ff) * i_708_
                                            + (i_710_ & 0xff00ff) * i_709_)
                                            & ~0xff00ff)
                                            + (((i_707_ & 0xff00) * i_708_
                                            + (i_710_ & 0xff00) * i_709_)
                                            & 0xff0000)) >> 8;
                                } else if (i_693_ == 0) {
                                    int i_711_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                    int i_712_ = (((i_711_ >>> 24)
                                            * Class105_Sub3.anInt8477)
                                            >> 8);
                                    int i_713_ = 256 - i_712_;
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_714_ = is_692_[i_691_];
                                        is_692_[i_691_]
                                                = ((((i_711_ & 0xff00ff) * i_712_
                                                + ((i_714_ & 0xff00ff)
                                                * i_713_))
                                                & ~0xff00ff)
                                                + (((i_711_ & 0xff00) * i_712_
                                                + ((i_714_ & 0xff00)
                                                * i_713_))
                                                & 0xff0000)) >> 8;
                                    } else if (i_712_ != 255) {
                                        int i_715_
                                                = (((i_711_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_716_
                                                = (((i_711_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_717_
                                                = (((i_711_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_711_
                                                = (i_715_ | i_716_ | i_717_) >>> 8;
                                        int i_718_ = is_692_[i_691_];
                                        is_692_[i_691_]
                                                = ((((i_711_ & 0xff00ff) * i_712_
                                                + ((i_718_ & 0xff00ff)
                                                * i_713_))
                                                & ~0xff00ff)
                                                + (((i_711_ & 0xff00) * i_712_
                                                + ((i_718_ & 0xff00)
                                                * i_713_))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_719_
                                                = (((i_711_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_720_
                                                = (((i_711_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_721_
                                                = (((i_711_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_692_[i_691_]
                                                = (i_719_ | i_720_ | i_721_) >>> 8;
                                    }
                                } else if (i_693_ == 3) {
                                    int i_722_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                    int i_723_ = Class105_Sub3.anInt8480;
                                    int i_724_ = i_722_ + i_723_;
                                    int i_725_ = ((i_722_ & 0xff00ff)
                                            + (i_723_ & 0xff00ff));
                                    int i_726_
                                            = ((i_725_ & 0x1000100)
                                            + (i_724_ - i_725_ & 0x10000));
                                    i_726_
                                            = i_724_ - i_726_ | i_726_ - (i_726_
                                            >>> 8);
                                    int i_727_ = (((i_722_ >>> 24)
                                            * Class105_Sub3.anInt8477)
                                            >> 8);
                                    int i_728_ = 256 - i_727_;
                                    if (i_727_ != 255) {
                                        i_722_ = i_726_;
                                        i_726_ = is_692_[i_691_];
                                        i_726_
                                                = ((((i_722_ & 0xff00ff) * i_727_
                                                + ((i_726_ & 0xff00ff)
                                                * i_728_))
                                                & ~0xff00ff)
                                                + (((i_722_ & 0xff00) * i_727_
                                                + ((i_726_ & 0xff00)
                                                * i_728_))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_692_[i_691_] = i_726_;
                                } else if (i_693_ == 2) {
                                    int i_729_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                    int i_730_ = i_729_ >>> 24;
                                    int i_731_ = 256 - i_730_;
                                    int i_732_ = (((i_729_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_733_ = (((i_729_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_729_ = (((i_732_ | i_733_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_734_ = is_692_[i_691_];
                                    is_692_[i_691_]
                                            = ((((i_729_ & 0xff00ff) * i_730_
                                            + (i_734_ & 0xff00ff) * i_731_)
                                            & ~0xff00ff)
                                            + (((i_729_ & 0xff00) * i_730_
                                            + (i_734_ & 0xff00) * i_731_)
                                            & 0xff0000)) >> 8;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_694_ == 2) {
                                if (i_693_ == 1) {
                                    int i_735_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                    int i_736_ = is_692_[i_691_];
                                    int i_737_ = i_735_ + i_736_;
                                    int i_738_ = ((i_735_ & 0xff00ff)
                                            + (i_736_ & 0xff00ff));
                                    i_736_ = ((i_738_ & 0x1000100)
                                            + (i_737_ - i_738_ & 0x10000));
                                    is_692_[i_691_]
                                            = i_737_ - i_736_ | i_736_ - (i_736_
                                            >>> 8);
                                } else if (i_693_ == 0) {
                                    int i_739_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                    int i_740_ = (((i_739_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_741_ = (((i_739_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_742_ = (((i_739_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_739_ = (i_740_ | i_741_ | i_742_) >>> 8;
                                    int i_743_ = is_692_[i_691_];
                                    int i_744_ = i_739_ + i_743_;
                                    int i_745_ = ((i_739_ & 0xff00ff)
                                            + (i_743_ & 0xff00ff));
                                    i_743_ = ((i_745_ & 0x1000100)
                                            + (i_744_ - i_745_ & 0x10000));
                                    is_692_[i_691_]
                                            = i_744_ - i_743_ | i_743_ - (i_743_
                                            >>> 8);
                                } else if (i_693_ == 3) {
                                    int i_746_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                    int i_747_ = Class105_Sub3.anInt8480;
                                    int i_748_ = i_746_ + i_747_;
                                    int i_749_ = ((i_746_ & 0xff00ff)
                                            + (i_747_ & 0xff00ff));
                                    int i_750_
                                            = ((i_749_ & 0x1000100)
                                            + (i_748_ - i_749_ & 0x10000));
                                    i_746_
                                            = i_748_ - i_750_ | i_750_ - (i_750_
                                            >>> 8);
                                    i_750_ = is_692_[i_691_];
                                    i_748_ = i_746_ + i_750_;
                                    i_749_
                                            = (i_746_ & 0xff00ff) + (i_750_
                                            & 0xff00ff);
                                    i_750_ = ((i_749_ & 0x1000100)
                                            + (i_748_ - i_749_ & 0x10000));
                                    is_692_[i_691_]
                                            = i_748_ - i_750_ | i_750_ - (i_750_
                                            >>> 8);
                                } else if (i_693_ == 2) {
                                    int i_751_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_690_]);
                                    int i_752_ = (((i_751_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_753_ = (((i_751_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_751_ = (((i_752_ | i_753_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_754_ = is_692_[i_691_];
                                    int i_755_ = i_751_ + i_754_;
                                    int i_756_ = ((i_751_ & 0xff00ff)
                                            + (i_754_ & 0xff00ff));
                                    i_754_ = ((i_756_ & 0x1000100)
                                            + (i_755_ - i_756_ & 0x10000));
                                    is_692_[i_691_]
                                            = i_755_ - i_754_ | i_754_ - (i_754_
                                            >>> 8);
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_687_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_684_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_757_ = Class105_Sub3.anInt8468;
                while (i_757_ < 0) {
                    int i_758_ = Class105_Sub3.anInt8451;
                    int i_759_ = Class105_Sub3.anInt8458;
                    int i_760_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_761_ = Class105_Sub3.anInt8478;
                    if (i_759_ >= 0
                            && (i_759_ - (((Class105_Sub3) this).anInt8471 << 12)
                            < 0)) {
                        if (i_760_ < 0) {
                            int i_762_
                                    = ((Class105_Sub3.anInt8450 - 1 - i_760_)
                                    / Class105_Sub3.anInt8450);
                            i_761_ += i_762_;
                            i_760_ += Class105_Sub3.anInt8450 * i_762_;
                            i_758_ += i_762_;
                        }
                        int i_763_;
                        if ((i_763_
                                = ((1 + i_760_
                                - (((Class105_Sub3) this).anInt8470 << 12)
                                - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_761_)
                            i_761_ = i_763_;
                        for (/**/; i_761_ < 0; i_761_++) {
                            int i_764_ = (((i_760_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_759_ >> 12));
                            int i_765_ = i_758_++;
                            int[] is_766_ = is;
                            int i_767_ = i;
                            int i_768_ = i_611_;
                            if (i_768_ == 0) {
                                if (i_767_ == 1)
                                    is_766_[i_765_]
                                            = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                else if (i_767_ == 0) {
                                    int i_769_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_++]);
                                    int i_770_ = (((i_769_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_771_ = (((i_769_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_772_ = (((i_769_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_766_[i_765_]
                                            = (i_770_ | i_771_ | i_772_) >>> 8;
                                } else if (i_767_ == 3) {
                                    int i_773_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_++]);
                                    int i_774_ = Class105_Sub3.anInt8480;
                                    int i_775_ = i_773_ + i_774_;
                                    int i_776_ = ((i_773_ & 0xff00ff)
                                            + (i_774_ & 0xff00ff));
                                    int i_777_
                                            = ((i_776_ & 0x1000100)
                                            + (i_775_ - i_776_ & 0x10000));
                                    is_766_[i_765_]
                                            = i_775_ - i_777_ | i_777_ - (i_777_
                                            >>> 8);
                                } else if (i_767_ == 2) {
                                    int i_778_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                    int i_779_ = (((i_778_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_780_ = (((i_778_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_766_[i_765_]
                                            = (((i_779_ | i_780_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_768_ == 1) {
                                if (i_767_ == 1) {
                                    int i_781_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                    int i_782_ = i_781_ >>> 24;
                                    int i_783_ = 256 - i_782_;
                                    int i_784_ = is_766_[i_765_];
                                    is_766_[i_765_]
                                            = ((((i_781_ & 0xff00ff) * i_782_
                                            + (i_784_ & 0xff00ff) * i_783_)
                                            & ~0xff00ff)
                                            + (((i_781_ & 0xff00) * i_782_
                                            + (i_784_ & 0xff00) * i_783_)
                                            & 0xff0000)) >> 8;
                                } else if (i_767_ == 0) {
                                    int i_785_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                    int i_786_ = (((i_785_ >>> 24)
                                            * Class105_Sub3.anInt8477)
                                            >> 8);
                                    int i_787_ = 256 - i_786_;
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_788_ = is_766_[i_765_];
                                        is_766_[i_765_]
                                                = ((((i_785_ & 0xff00ff) * i_786_
                                                + ((i_788_ & 0xff00ff)
                                                * i_787_))
                                                & ~0xff00ff)
                                                + (((i_785_ & 0xff00) * i_786_
                                                + ((i_788_ & 0xff00)
                                                * i_787_))
                                                & 0xff0000)) >> 8;
                                    } else if (i_786_ != 255) {
                                        int i_789_
                                                = (((i_785_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_790_
                                                = (((i_785_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_791_
                                                = (((i_785_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_785_
                                                = (i_789_ | i_790_ | i_791_) >>> 8;
                                        int i_792_ = is_766_[i_765_];
                                        is_766_[i_765_]
                                                = ((((i_785_ & 0xff00ff) * i_786_
                                                + ((i_792_ & 0xff00ff)
                                                * i_787_))
                                                & ~0xff00ff)
                                                + (((i_785_ & 0xff00) * i_786_
                                                + ((i_792_ & 0xff00)
                                                * i_787_))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_793_
                                                = (((i_785_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_794_
                                                = (((i_785_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_795_
                                                = (((i_785_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_766_[i_765_]
                                                = (i_793_ | i_794_ | i_795_) >>> 8;
                                    }
                                } else if (i_767_ == 3) {
                                    int i_796_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                    int i_797_ = Class105_Sub3.anInt8480;
                                    int i_798_ = i_796_ + i_797_;
                                    int i_799_ = ((i_796_ & 0xff00ff)
                                            + (i_797_ & 0xff00ff));
                                    int i_800_
                                            = ((i_799_ & 0x1000100)
                                            + (i_798_ - i_799_ & 0x10000));
                                    i_800_
                                            = i_798_ - i_800_ | i_800_ - (i_800_
                                            >>> 8);
                                    int i_801_ = (((i_796_ >>> 24)
                                            * Class105_Sub3.anInt8477)
                                            >> 8);
                                    int i_802_ = 256 - i_801_;
                                    if (i_801_ != 255) {
                                        i_796_ = i_800_;
                                        i_800_ = is_766_[i_765_];
                                        i_800_
                                                = ((((i_796_ & 0xff00ff) * i_801_
                                                + ((i_800_ & 0xff00ff)
                                                * i_802_))
                                                & ~0xff00ff)
                                                + (((i_796_ & 0xff00) * i_801_
                                                + ((i_800_ & 0xff00)
                                                * i_802_))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_766_[i_765_] = i_800_;
                                } else if (i_767_ == 2) {
                                    int i_803_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                    int i_804_ = i_803_ >>> 24;
                                    int i_805_ = 256 - i_804_;
                                    int i_806_ = (((i_803_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_807_ = (((i_803_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_803_ = (((i_806_ | i_807_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_808_ = is_766_[i_765_];
                                    is_766_[i_765_]
                                            = ((((i_803_ & 0xff00ff) * i_804_
                                            + (i_808_ & 0xff00ff) * i_805_)
                                            & ~0xff00ff)
                                            + (((i_803_ & 0xff00) * i_804_
                                            + (i_808_ & 0xff00) * i_805_)
                                            & 0xff0000)) >> 8;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_768_ == 2) {
                                if (i_767_ == 1) {
                                    int i_809_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                    int i_810_ = is_766_[i_765_];
                                    int i_811_ = i_809_ + i_810_;
                                    int i_812_ = ((i_809_ & 0xff00ff)
                                            + (i_810_ & 0xff00ff));
                                    i_810_ = ((i_812_ & 0x1000100)
                                            + (i_811_ - i_812_ & 0x10000));
                                    is_766_[i_765_]
                                            = i_811_ - i_810_ | i_810_ - (i_810_
                                            >>> 8);
                                } else if (i_767_ == 0) {
                                    int i_813_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                    int i_814_ = (((i_813_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_815_ = (((i_813_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_816_ = (((i_813_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_813_ = (i_814_ | i_815_ | i_816_) >>> 8;
                                    int i_817_ = is_766_[i_765_];
                                    int i_818_ = i_813_ + i_817_;
                                    int i_819_ = ((i_813_ & 0xff00ff)
                                            + (i_817_ & 0xff00ff));
                                    i_817_ = ((i_819_ & 0x1000100)
                                            + (i_818_ - i_819_ & 0x10000));
                                    is_766_[i_765_]
                                            = i_818_ - i_817_ | i_817_ - (i_817_
                                            >>> 8);
                                } else if (i_767_ == 3) {
                                    int i_820_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                    int i_821_ = Class105_Sub3.anInt8480;
                                    int i_822_ = i_820_ + i_821_;
                                    int i_823_ = ((i_820_ & 0xff00ff)
                                            + (i_821_ & 0xff00ff));
                                    int i_824_
                                            = ((i_823_ & 0x1000100)
                                            + (i_822_ - i_823_ & 0x10000));
                                    i_820_
                                            = i_822_ - i_824_ | i_824_ - (i_824_
                                            >>> 8);
                                    i_824_ = is_766_[i_765_];
                                    i_822_ = i_820_ + i_824_;
                                    i_823_
                                            = (i_820_ & 0xff00ff) + (i_824_
                                            & 0xff00ff);
                                    i_824_ = ((i_823_ & 0x1000100)
                                            + (i_822_ - i_823_ & 0x10000));
                                    is_766_[i_765_]
                                            = i_822_ - i_824_ | i_824_ - (i_824_
                                            >>> 8);
                                } else if (i_767_ == 2) {
                                    int i_825_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_764_]);
                                    int i_826_ = (((i_825_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_827_ = (((i_825_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_825_ = (((i_826_ | i_827_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_828_ = is_766_[i_765_];
                                    int i_829_ = i_825_ + i_828_;
                                    int i_830_ = ((i_825_ & 0xff00ff)
                                            + (i_828_ & 0xff00ff));
                                    i_828_ = ((i_830_ & 0x1000100)
                                            + (i_829_ - i_830_ & 0x10000));
                                    is_766_[i_765_]
                                            = i_829_ - i_828_ | i_828_ - (i_828_
                                            >>> 8);
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_760_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_757_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8481 < 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_831_ = Class105_Sub3.anInt8468;
                while (i_831_ < 0) {
                    int i_832_ = Class105_Sub3.anInt8451;
                    int i_833_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_834_ = Class105_Sub3.anInt8467;
                    int i_835_ = Class105_Sub3.anInt8478;
                    if (i_834_ >= 0
                            && (i_834_ - (((Class105_Sub3) this).anInt8470 << 12)
                            < 0)) {
                        int i_836_;
                        if ((i_836_
                                = i_833_ - (((Class105_Sub3) this).anInt8471
                                << 12))
                                >= 0) {
                            i_836_ = ((Class105_Sub3.anInt8481 - i_836_)
                                    / Class105_Sub3.anInt8481);
                            i_835_ += i_836_;
                            i_833_ += Class105_Sub3.anInt8481 * i_836_;
                            i_832_ += i_836_;
                        }
                        if ((i_836_ = ((i_833_ - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_835_)
                            i_835_ = i_836_;
                        for (/**/; i_835_ < 0; i_835_++) {
                            int i_837_ = (((i_834_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_833_ >> 12));
                            int i_838_ = i_832_++;
                            int[] is_839_ = is;
                            int i_840_ = i;
                            int i_841_ = i_611_;
                            if (i_841_ == 0) {
                                if (i_840_ == 1)
                                    is_839_[i_838_]
                                            = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                else if (i_840_ == 0) {
                                    int i_842_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_++]);
                                    int i_843_ = (((i_842_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_844_ = (((i_842_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_845_ = (((i_842_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_839_[i_838_]
                                            = (i_843_ | i_844_ | i_845_) >>> 8;
                                } else if (i_840_ == 3) {
                                    int i_846_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_++]);
                                    int i_847_ = Class105_Sub3.anInt8480;
                                    int i_848_ = i_846_ + i_847_;
                                    int i_849_ = ((i_846_ & 0xff00ff)
                                            + (i_847_ & 0xff00ff));
                                    int i_850_
                                            = ((i_849_ & 0x1000100)
                                            + (i_848_ - i_849_ & 0x10000));
                                    is_839_[i_838_]
                                            = i_848_ - i_850_ | i_850_ - (i_850_
                                            >>> 8);
                                } else if (i_840_ == 2) {
                                    int i_851_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                    int i_852_ = (((i_851_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_853_ = (((i_851_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_839_[i_838_]
                                            = (((i_852_ | i_853_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_841_ == 1) {
                                if (i_840_ == 1) {
                                    int i_854_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                    int i_855_ = i_854_ >>> 24;
                                    int i_856_ = 256 - i_855_;
                                    int i_857_ = is_839_[i_838_];
                                    is_839_[i_838_]
                                            = ((((i_854_ & 0xff00ff) * i_855_
                                            + (i_857_ & 0xff00ff) * i_856_)
                                            & ~0xff00ff)
                                            + (((i_854_ & 0xff00) * i_855_
                                            + (i_857_ & 0xff00) * i_856_)
                                            & 0xff0000)) >> 8;
                                } else if (i_840_ == 0) {
                                    int i_858_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                    int i_859_ = (((i_858_ >>> 24)
                                            * Class105_Sub3.anInt8477)
                                            >> 8);
                                    int i_860_ = 256 - i_859_;
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_861_ = is_839_[i_838_];
                                        is_839_[i_838_]
                                                = ((((i_858_ & 0xff00ff) * i_859_
                                                + ((i_861_ & 0xff00ff)
                                                * i_860_))
                                                & ~0xff00ff)
                                                + (((i_858_ & 0xff00) * i_859_
                                                + ((i_861_ & 0xff00)
                                                * i_860_))
                                                & 0xff0000)) >> 8;
                                    } else if (i_859_ != 255) {
                                        int i_862_
                                                = (((i_858_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_863_
                                                = (((i_858_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_864_
                                                = (((i_858_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_858_
                                                = (i_862_ | i_863_ | i_864_) >>> 8;
                                        int i_865_ = is_839_[i_838_];
                                        is_839_[i_838_]
                                                = ((((i_858_ & 0xff00ff) * i_859_
                                                + ((i_865_ & 0xff00ff)
                                                * i_860_))
                                                & ~0xff00ff)
                                                + (((i_858_ & 0xff00) * i_859_
                                                + ((i_865_ & 0xff00)
                                                * i_860_))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_866_
                                                = (((i_858_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_867_
                                                = (((i_858_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_868_
                                                = (((i_858_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_839_[i_838_]
                                                = (i_866_ | i_867_ | i_868_) >>> 8;
                                    }
                                } else if (i_840_ == 3) {
                                    int i_869_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                    int i_870_ = Class105_Sub3.anInt8480;
                                    int i_871_ = i_869_ + i_870_;
                                    int i_872_ = ((i_869_ & 0xff00ff)
                                            + (i_870_ & 0xff00ff));
                                    int i_873_
                                            = ((i_872_ & 0x1000100)
                                            + (i_871_ - i_872_ & 0x10000));
                                    i_873_
                                            = i_871_ - i_873_ | i_873_ - (i_873_
                                            >>> 8);
                                    int i_874_ = (((i_869_ >>> 24)
                                            * Class105_Sub3.anInt8477)
                                            >> 8);
                                    int i_875_ = 256 - i_874_;
                                    if (i_874_ != 255) {
                                        i_869_ = i_873_;
                                        i_873_ = is_839_[i_838_];
                                        i_873_
                                                = ((((i_869_ & 0xff00ff) * i_874_
                                                + ((i_873_ & 0xff00ff)
                                                * i_875_))
                                                & ~0xff00ff)
                                                + (((i_869_ & 0xff00) * i_874_
                                                + ((i_873_ & 0xff00)
                                                * i_875_))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_839_[i_838_] = i_873_;
                                } else if (i_840_ == 2) {
                                    int i_876_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                    int i_877_ = i_876_ >>> 24;
                                    int i_878_ = 256 - i_877_;
                                    int i_879_ = (((i_876_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_880_ = (((i_876_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_876_ = (((i_879_ | i_880_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_881_ = is_839_[i_838_];
                                    is_839_[i_838_]
                                            = ((((i_876_ & 0xff00ff) * i_877_
                                            + (i_881_ & 0xff00ff) * i_878_)
                                            & ~0xff00ff)
                                            + (((i_876_ & 0xff00) * i_877_
                                            + (i_881_ & 0xff00) * i_878_)
                                            & 0xff0000)) >> 8;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_841_ == 2) {
                                if (i_840_ == 1) {
                                    int i_882_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                    int i_883_ = is_839_[i_838_];
                                    int i_884_ = i_882_ + i_883_;
                                    int i_885_ = ((i_882_ & 0xff00ff)
                                            + (i_883_ & 0xff00ff));
                                    i_883_ = ((i_885_ & 0x1000100)
                                            + (i_884_ - i_885_ & 0x10000));
                                    is_839_[i_838_]
                                            = i_884_ - i_883_ | i_883_ - (i_883_
                                            >>> 8);
                                } else if (i_840_ == 0) {
                                    int i_886_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                    int i_887_ = (((i_886_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_888_ = (((i_886_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_889_ = (((i_886_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_886_ = (i_887_ | i_888_ | i_889_) >>> 8;
                                    int i_890_ = is_839_[i_838_];
                                    int i_891_ = i_886_ + i_890_;
                                    int i_892_ = ((i_886_ & 0xff00ff)
                                            + (i_890_ & 0xff00ff));
                                    i_890_ = ((i_892_ & 0x1000100)
                                            + (i_891_ - i_892_ & 0x10000));
                                    is_839_[i_838_]
                                            = i_891_ - i_890_ | i_890_ - (i_890_
                                            >>> 8);
                                } else if (i_840_ == 3) {
                                    int i_893_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                    int i_894_ = Class105_Sub3.anInt8480;
                                    int i_895_ = i_893_ + i_894_;
                                    int i_896_ = ((i_893_ & 0xff00ff)
                                            + (i_894_ & 0xff00ff));
                                    int i_897_
                                            = ((i_896_ & 0x1000100)
                                            + (i_895_ - i_896_ & 0x10000));
                                    i_893_
                                            = i_895_ - i_897_ | i_897_ - (i_897_
                                            >>> 8);
                                    i_897_ = is_839_[i_838_];
                                    i_895_ = i_893_ + i_897_;
                                    i_896_
                                            = (i_893_ & 0xff00ff) + (i_897_
                                            & 0xff00ff);
                                    i_897_ = ((i_896_ & 0x1000100)
                                            + (i_895_ - i_896_ & 0x10000));
                                    is_839_[i_838_]
                                            = i_895_ - i_897_ | i_897_ - (i_897_
                                            >>> 8);
                                } else if (i_840_ == 2) {
                                    int i_898_ = (((Class105_Sub3_Sub3) this)
                                            .anIntArray9936[i_837_]);
                                    int i_899_ = (((i_898_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_900_ = (((i_898_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_898_ = (((i_899_ | i_900_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_901_ = is_839_[i_838_];
                                    int i_902_ = i_898_ + i_901_;
                                    int i_903_ = ((i_898_ & 0xff00ff)
                                            + (i_901_ & 0xff00ff));
                                    i_901_ = ((i_903_ & 0x1000100)
                                            + (i_902_ - i_903_ & 0x10000));
                                    is_839_[i_838_]
                                            = i_902_ - i_901_ | i_901_ - (i_901_
                                            >>> 8);
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_833_ += Class105_Sub3.anInt8481;
                        }
                    }
                    i_831_++;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_904_ = Class105_Sub3.anInt8468;
                while (i_904_ < 0) {
                    int i_905_ = Class105_Sub3.anInt8451;
                    int i_906_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_907_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_908_ = Class105_Sub3.anInt8478;
                    int i_909_;
                    if ((i_909_
                            = i_906_ - (((Class105_Sub3) this).anInt8471 << 12))
                            >= 0) {
                        i_909_ = ((Class105_Sub3.anInt8481 - i_909_)
                                / Class105_Sub3.anInt8481);
                        i_908_ += i_909_;
                        i_906_ += Class105_Sub3.anInt8481 * i_909_;
                        i_907_ += Class105_Sub3.anInt8450 * i_909_;
                        i_905_ += i_909_;
                    }
                    if ((i_909_ = ((i_906_ - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_908_)
                        i_908_ = i_909_;
                    if ((i_909_
                            = i_907_ - (((Class105_Sub3) this).anInt8470 << 12))
                            >= 0) {
                        i_909_ = ((Class105_Sub3.anInt8450 - i_909_)
                                / Class105_Sub3.anInt8450);
                        i_908_ += i_909_;
                        i_906_ += Class105_Sub3.anInt8481 * i_909_;
                        i_907_ += Class105_Sub3.anInt8450 * i_909_;
                        i_905_ += i_909_;
                    }
                    if ((i_909_ = ((i_907_ - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_908_)
                        i_908_ = i_909_;
                    for (/**/; i_908_ < 0; i_908_++) {
                        int i_910_ = (((i_907_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_906_ >> 12));
                        int i_911_ = i_905_++;
                        int[] is_912_ = is;
                        int i_913_ = i;
                        int i_914_ = i_611_;
                        if (i_914_ == 0) {
                            if (i_913_ == 1)
                                is_912_[i_911_] = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                            else if (i_913_ == 0) {
                                int i_915_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_++]);
                                int i_916_ = (((i_915_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_917_ = (((i_915_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_918_ = (((i_915_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_912_[i_911_]
                                        = (i_916_ | i_917_ | i_918_) >>> 8;
                            } else if (i_913_ == 3) {
                                int i_919_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_++]);
                                int i_920_ = Class105_Sub3.anInt8480;
                                int i_921_ = i_919_ + i_920_;
                                int i_922_ = ((i_919_ & 0xff00ff)
                                        + (i_920_ & 0xff00ff));
                                int i_923_ = ((i_922_ & 0x1000100)
                                        + (i_921_ - i_922_ & 0x10000));
                                is_912_[i_911_]
                                        = i_921_ - i_923_ | i_923_ - (i_923_
                                        >>> 8);
                            } else if (i_913_ == 2) {
                                int i_924_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                                int i_925_ = (((i_924_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_926_ = (((i_924_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_912_[i_911_] = (((i_925_ | i_926_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_914_ == 1) {
                            if (i_913_ == 1) {
                                int i_927_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                                int i_928_ = i_927_ >>> 24;
                                int i_929_ = 256 - i_928_;
                                int i_930_ = is_912_[i_911_];
                                is_912_[i_911_]
                                        = ((((i_927_ & 0xff00ff) * i_928_
                                        + (i_930_ & 0xff00ff) * i_929_)
                                        & ~0xff00ff)
                                        + (((i_927_ & 0xff00) * i_928_
                                        + (i_930_ & 0xff00) * i_929_)
                                        & 0xff0000)) >> 8;
                            } else if (i_913_ == 0) {
                                int i_931_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                                int i_932_ = (((i_931_ >>> 24)
                                        * Class105_Sub3.anInt8477)
                                        >> 8);
                                int i_933_ = 256 - i_932_;
                                if ((Class105_Sub3.anInt8480 & 0xffffff)
                                        == 16777215) {
                                    int i_934_ = is_912_[i_911_];
                                    is_912_[i_911_]
                                            = ((((i_931_ & 0xff00ff) * i_932_
                                            + (i_934_ & 0xff00ff) * i_933_)
                                            & ~0xff00ff)
                                            + (((i_931_ & 0xff00) * i_932_
                                            + (i_934_ & 0xff00) * i_933_)
                                            & 0xff0000)) >> 8;
                                } else if (i_932_ != 255) {
                                    int i_935_ = (((i_931_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_936_ = (((i_931_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_937_ = (((i_931_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_931_ = (i_935_ | i_936_ | i_937_) >>> 8;
                                    int i_938_ = is_912_[i_911_];
                                    is_912_[i_911_]
                                            = ((((i_931_ & 0xff00ff) * i_932_
                                            + (i_938_ & 0xff00ff) * i_933_)
                                            & ~0xff00ff)
                                            + (((i_931_ & 0xff00) * i_932_
                                            + (i_938_ & 0xff00) * i_933_)
                                            & 0xff0000)) >> 8;
                                } else {
                                    int i_939_ = (((i_931_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_940_ = (((i_931_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_941_ = (((i_931_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_912_[i_911_]
                                            = (i_939_ | i_940_ | i_941_) >>> 8;
                                }
                            } else if (i_913_ == 3) {
                                int i_942_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                                int i_943_ = Class105_Sub3.anInt8480;
                                int i_944_ = i_942_ + i_943_;
                                int i_945_ = ((i_942_ & 0xff00ff)
                                        + (i_943_ & 0xff00ff));
                                int i_946_ = ((i_945_ & 0x1000100)
                                        + (i_944_ - i_945_ & 0x10000));
                                i_946_ = i_944_ - i_946_ | i_946_ - (i_946_
                                        >>> 8);
                                int i_947_ = (((i_942_ >>> 24)
                                        * Class105_Sub3.anInt8477)
                                        >> 8);
                                int i_948_ = 256 - i_947_;
                                if (i_947_ != 255) {
                                    i_942_ = i_946_;
                                    i_946_ = is_912_[i_911_];
                                    i_946_ = ((((i_942_ & 0xff00ff) * i_947_
                                            + (i_946_ & 0xff00ff) * i_948_)
                                            & ~0xff00ff)
                                            + (((i_942_ & 0xff00) * i_947_
                                            + (i_946_ & 0xff00) * i_948_)
                                            & 0xff0000)) >> 8;
                                }
                                is_912_[i_911_] = i_946_;
                            } else if (i_913_ == 2) {
                                int i_949_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                                int i_950_ = i_949_ >>> 24;
                                int i_951_ = 256 - i_950_;
                                int i_952_ = (((i_949_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_953_ = (((i_949_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_949_ = (((i_952_ | i_953_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_954_ = is_912_[i_911_];
                                is_912_[i_911_]
                                        = ((((i_949_ & 0xff00ff) * i_950_
                                        + (i_954_ & 0xff00ff) * i_951_)
                                        & ~0xff00ff)
                                        + (((i_949_ & 0xff00) * i_950_
                                        + (i_954_ & 0xff00) * i_951_)
                                        & 0xff0000)) >> 8;
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_914_ == 2) {
                            if (i_913_ == 1) {
                                int i_955_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                                int i_956_ = is_912_[i_911_];
                                int i_957_ = i_955_ + i_956_;
                                int i_958_ = ((i_955_ & 0xff00ff)
                                        + (i_956_ & 0xff00ff));
                                i_956_
                                        = (i_958_ & 0x1000100) + (i_957_ - i_958_
                                        & 0x10000);
                                is_912_[i_911_]
                                        = i_957_ - i_956_ | i_956_ - (i_956_
                                        >>> 8);
                            } else if (i_913_ == 0) {
                                int i_959_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                                int i_960_ = (((i_959_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_961_ = (((i_959_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_962_ = (((i_959_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                i_959_ = (i_960_ | i_961_ | i_962_) >>> 8;
                                int i_963_ = is_912_[i_911_];
                                int i_964_ = i_959_ + i_963_;
                                int i_965_ = ((i_959_ & 0xff00ff)
                                        + (i_963_ & 0xff00ff));
                                i_963_
                                        = (i_965_ & 0x1000100) + (i_964_ - i_965_
                                        & 0x10000);
                                is_912_[i_911_]
                                        = i_964_ - i_963_ | i_963_ - (i_963_
                                        >>> 8);
                            } else if (i_913_ == 3) {
                                int i_966_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                                int i_967_ = Class105_Sub3.anInt8480;
                                int i_968_ = i_966_ + i_967_;
                                int i_969_ = ((i_966_ & 0xff00ff)
                                        + (i_967_ & 0xff00ff));
                                int i_970_ = ((i_969_ & 0x1000100)
                                        + (i_968_ - i_969_ & 0x10000));
                                i_966_ = i_968_ - i_970_ | i_970_ - (i_970_
                                        >>> 8);
                                i_970_ = is_912_[i_911_];
                                i_968_ = i_966_ + i_970_;
                                i_969_ = (i_966_ & 0xff00ff) + (i_970_
                                        & 0xff00ff);
                                i_970_
                                        = (i_969_ & 0x1000100) + (i_968_ - i_969_
                                        & 0x10000);
                                is_912_[i_911_]
                                        = i_968_ - i_970_ | i_970_ - (i_970_
                                        >>> 8);
                            } else if (i_913_ == 2) {
                                int i_971_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_910_]);
                                int i_972_ = (((i_971_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_973_ = (((i_971_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_971_ = (((i_972_ | i_973_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_974_ = is_912_[i_911_];
                                int i_975_ = i_971_ + i_974_;
                                int i_976_ = ((i_971_ & 0xff00ff)
                                        + (i_974_ & 0xff00ff));
                                i_974_
                                        = (i_976_ & 0x1000100) + (i_975_ - i_976_
                                        & 0x10000);
                                is_912_[i_911_]
                                        = i_975_ - i_974_ | i_974_ - (i_974_
                                        >>> 8);
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_906_ += Class105_Sub3.anInt8481;
                        i_907_ += Class105_Sub3.anInt8450;
                    }
                    i_904_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_977_ = Class105_Sub3.anInt8468;
                while (i_977_ < 0) {
                    int i_978_ = Class105_Sub3.anInt8451;
                    int i_979_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_980_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_981_ = Class105_Sub3.anInt8478;
                    int i_982_;
                    if ((i_982_
                            = i_979_ - (((Class105_Sub3) this).anInt8471 << 12))
                            >= 0) {
                        i_982_ = ((Class105_Sub3.anInt8481 - i_982_)
                                / Class105_Sub3.anInt8481);
                        i_981_ += i_982_;
                        i_979_ += Class105_Sub3.anInt8481 * i_982_;
                        i_980_ += Class105_Sub3.anInt8450 * i_982_;
                        i_978_ += i_982_;
                    }
                    if ((i_982_ = ((i_979_ - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_981_)
                        i_981_ = i_982_;
                    if (i_980_ < 0) {
                        i_982_ = ((Class105_Sub3.anInt8450 - 1 - i_980_)
                                / Class105_Sub3.anInt8450);
                        i_981_ += i_982_;
                        i_979_ += Class105_Sub3.anInt8481 * i_982_;
                        i_980_ += Class105_Sub3.anInt8450 * i_982_;
                        i_978_ += i_982_;
                    }
                    if ((i_982_ = ((1 + i_980_
                            - (((Class105_Sub3) this).anInt8470 << 12)
                            - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_981_)
                        i_981_ = i_982_;
                    for (/**/; i_981_ < 0; i_981_++) {
                        int i_983_ = (((i_980_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_979_ >> 12));
                        int i_984_ = i_978_++;
                        int[] is_985_ = is;
                        int i_986_ = i;
                        int i_987_ = i_611_;
                        if (i_987_ == 0) {
                            if (i_986_ == 1)
                                is_985_[i_984_] = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                            else if (i_986_ == 0) {
                                int i_988_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_++]);
                                int i_989_ = (((i_988_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_990_ = (((i_988_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_991_ = (((i_988_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_985_[i_984_]
                                        = (i_989_ | i_990_ | i_991_) >>> 8;
                            } else if (i_986_ == 3) {
                                int i_992_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_++]);
                                int i_993_ = Class105_Sub3.anInt8480;
                                int i_994_ = i_992_ + i_993_;
                                int i_995_ = ((i_992_ & 0xff00ff)
                                        + (i_993_ & 0xff00ff));
                                int i_996_ = ((i_995_ & 0x1000100)
                                        + (i_994_ - i_995_ & 0x10000));
                                is_985_[i_984_]
                                        = i_994_ - i_996_ | i_996_ - (i_996_
                                        >>> 8);
                            } else if (i_986_ == 2) {
                                int i_997_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                                int i_998_ = (((i_997_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_999_ = (((i_997_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_985_[i_984_] = (((i_998_ | i_999_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_987_ == 1) {
                            if (i_986_ == 1) {
                                int i_1000_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                                int i_1001_ = i_1000_ >>> 24;
                                int i_1002_ = 256 - i_1001_;
                                int i_1003_ = is_985_[i_984_];
                                is_985_[i_984_]
                                        = ((((i_1000_ & 0xff00ff) * i_1001_
                                        + (i_1003_ & 0xff00ff) * i_1002_)
                                        & ~0xff00ff)
                                        + (((i_1000_ & 0xff00) * i_1001_
                                        + (i_1003_ & 0xff00) * i_1002_)
                                        & 0xff0000)) >> 8;
                            } else if (i_986_ == 0) {
                                int i_1004_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                                int i_1005_ = (((i_1004_ >>> 24)
                                        * Class105_Sub3.anInt8477)
                                        >> 8);
                                int i_1006_ = 256 - i_1005_;
                                if ((Class105_Sub3.anInt8480 & 0xffffff)
                                        == 16777215) {
                                    int i_1007_ = is_985_[i_984_];
                                    is_985_[i_984_]
                                            = ((((i_1004_ & 0xff00ff) * i_1005_
                                            + (i_1007_ & 0xff00ff) * i_1006_)
                                            & ~0xff00ff)
                                            + (((i_1004_ & 0xff00) * i_1005_
                                            + (i_1007_ & 0xff00) * i_1006_)
                                            & 0xff0000)) >> 8;
                                } else if (i_1005_ != 255) {
                                    int i_1008_ = (((i_1004_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_1009_ = (((i_1004_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_1010_ = (((i_1004_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_1004_
                                            = (i_1008_ | i_1009_ | i_1010_) >>> 8;
                                    int i_1011_ = is_985_[i_984_];
                                    is_985_[i_984_]
                                            = ((((i_1004_ & 0xff00ff) * i_1005_
                                            + (i_1011_ & 0xff00ff) * i_1006_)
                                            & ~0xff00ff)
                                            + (((i_1004_ & 0xff00) * i_1005_
                                            + (i_1011_ & 0xff00) * i_1006_)
                                            & 0xff0000)) >> 8;
                                } else {
                                    int i_1012_ = (((i_1004_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_1013_ = (((i_1004_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_1014_ = (((i_1004_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_985_[i_984_]
                                            = (i_1012_ | i_1013_ | i_1014_) >>> 8;
                                }
                            } else if (i_986_ == 3) {
                                int i_1015_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                                int i_1016_ = Class105_Sub3.anInt8480;
                                int i_1017_ = i_1015_ + i_1016_;
                                int i_1018_ = ((i_1015_ & 0xff00ff)
                                        + (i_1016_ & 0xff00ff));
                                int i_1019_
                                        = ((i_1018_ & 0x1000100)
                                        + (i_1017_ - i_1018_ & 0x10000));
                                i_1019_
                                        = i_1017_ - i_1019_ | i_1019_ - (i_1019_
                                        >>> 8);
                                int i_1020_ = (((i_1015_ >>> 24)
                                        * Class105_Sub3.anInt8477)
                                        >> 8);
                                int i_1021_ = 256 - i_1020_;
                                if (i_1020_ != 255) {
                                    i_1015_ = i_1019_;
                                    i_1019_ = is_985_[i_984_];
                                    i_1019_
                                            = ((((i_1015_ & 0xff00ff) * i_1020_
                                            + (i_1019_ & 0xff00ff) * i_1021_)
                                            & ~0xff00ff)
                                            + (((i_1015_ & 0xff00) * i_1020_
                                            + (i_1019_ & 0xff00) * i_1021_)
                                            & 0xff0000)) >> 8;
                                }
                                is_985_[i_984_] = i_1019_;
                            } else if (i_986_ == 2) {
                                int i_1022_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                                int i_1023_ = i_1022_ >>> 24;
                                int i_1024_ = 256 - i_1023_;
                                int i_1025_ = (((i_1022_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_1026_ = (((i_1022_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_1022_ = (((i_1025_ | i_1026_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_1027_ = is_985_[i_984_];
                                is_985_[i_984_]
                                        = ((((i_1022_ & 0xff00ff) * i_1023_
                                        + (i_1027_ & 0xff00ff) * i_1024_)
                                        & ~0xff00ff)
                                        + (((i_1022_ & 0xff00) * i_1023_
                                        + (i_1027_ & 0xff00) * i_1024_)
                                        & 0xff0000)) >> 8;
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_987_ == 2) {
                            if (i_986_ == 1) {
                                int i_1028_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                                int i_1029_ = is_985_[i_984_];
                                int i_1030_ = i_1028_ + i_1029_;
                                int i_1031_ = ((i_1028_ & 0xff00ff)
                                        + (i_1029_ & 0xff00ff));
                                i_1029_ = ((i_1031_ & 0x1000100)
                                        + (i_1030_ - i_1031_ & 0x10000));
                                is_985_[i_984_]
                                        = i_1030_ - i_1029_ | i_1029_ - (i_1029_
                                        >>> 8);
                            } else if (i_986_ == 0) {
                                int i_1032_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                                int i_1033_ = (((i_1032_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_1034_ = (((i_1032_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_1035_ = (((i_1032_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                i_1032_ = (i_1033_ | i_1034_ | i_1035_) >>> 8;
                                int i_1036_ = is_985_[i_984_];
                                int i_1037_ = i_1032_ + i_1036_;
                                int i_1038_ = ((i_1032_ & 0xff00ff)
                                        + (i_1036_ & 0xff00ff));
                                i_1036_ = ((i_1038_ & 0x1000100)
                                        + (i_1037_ - i_1038_ & 0x10000));
                                is_985_[i_984_]
                                        = i_1037_ - i_1036_ | i_1036_ - (i_1036_
                                        >>> 8);
                            } else if (i_986_ == 3) {
                                int i_1039_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                                int i_1040_ = Class105_Sub3.anInt8480;
                                int i_1041_ = i_1039_ + i_1040_;
                                int i_1042_ = ((i_1039_ & 0xff00ff)
                                        + (i_1040_ & 0xff00ff));
                                int i_1043_
                                        = ((i_1042_ & 0x1000100)
                                        + (i_1041_ - i_1042_ & 0x10000));
                                i_1039_
                                        = i_1041_ - i_1043_ | i_1043_ - (i_1043_
                                        >>> 8);
                                i_1043_ = is_985_[i_984_];
                                i_1041_ = i_1039_ + i_1043_;
                                i_1042_ = (i_1039_ & 0xff00ff) + (i_1043_
                                        & 0xff00ff);
                                i_1043_ = ((i_1042_ & 0x1000100)
                                        + (i_1041_ - i_1042_ & 0x10000));
                                is_985_[i_984_]
                                        = i_1041_ - i_1043_ | i_1043_ - (i_1043_
                                        >>> 8);
                            } else if (i_986_ == 2) {
                                int i_1044_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_983_]);
                                int i_1045_ = (((i_1044_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_1046_ = (((i_1044_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_1044_ = (((i_1045_ | i_1046_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_1047_ = is_985_[i_984_];
                                int i_1048_ = i_1044_ + i_1047_;
                                int i_1049_ = ((i_1044_ & 0xff00ff)
                                        + (i_1047_ & 0xff00ff));
                                i_1047_ = ((i_1049_ & 0x1000100)
                                        + (i_1048_ - i_1049_ & 0x10000));
                                is_985_[i_984_]
                                        = i_1048_ - i_1047_ | i_1047_ - (i_1047_
                                        >>> 8);
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_979_ += Class105_Sub3.anInt8481;
                        i_980_ += Class105_Sub3.anInt8450;
                    }
                    i_977_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8450 == 0) {
            int i_1050_ = Class105_Sub3.anInt8468;
            while (i_1050_ < 0) {
                int i_1051_ = Class105_Sub3.anInt8451;
                int i_1052_
                        = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                int i_1053_ = Class105_Sub3.anInt8467;
                int i_1054_ = Class105_Sub3.anInt8478;
                if (i_1053_ >= 0 && i_1053_ - (((Class105_Sub3) this).anInt8470
                        << 12) < 0) {
                    if (i_1052_ < 0) {
                        int i_1055_ = ((Class105_Sub3.anInt8481 - 1 - i_1052_)
                                / Class105_Sub3.anInt8481);
                        i_1054_ += i_1055_;
                        i_1052_ += Class105_Sub3.anInt8481 * i_1055_;
                        i_1051_ += i_1055_;
                    }
                    int i_1056_;
                    if ((i_1056_ = ((1 + i_1052_
                            - (((Class105_Sub3) this).anInt8471 << 12)
                            - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_1054_)
                        i_1054_ = i_1056_;
                    for (/**/; i_1054_ < 0; i_1054_++) {
                        int i_1057_ = (((i_1053_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_1052_ >> 12));
                        int i_1058_ = i_1051_++;
                        int[] is_1059_ = is;
                        int i_1060_ = i;
                        int i_1061_ = i_611_;
                        if (i_1061_ == 0) {
                            if (i_1060_ == 1)
                                is_1059_[i_1058_]
                                        = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                            else if (i_1060_ == 0) {
                                int i_1062_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_++]);
                                int i_1063_ = (((i_1062_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_1064_ = (((i_1062_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_1065_ = (((i_1062_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_1059_[i_1058_]
                                        = (i_1063_ | i_1064_ | i_1065_) >>> 8;
                            } else if (i_1060_ == 3) {
                                int i_1066_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_++]);
                                int i_1067_ = Class105_Sub3.anInt8480;
                                int i_1068_ = i_1066_ + i_1067_;
                                int i_1069_ = ((i_1066_ & 0xff00ff)
                                        + (i_1067_ & 0xff00ff));
                                int i_1070_
                                        = ((i_1069_ & 0x1000100)
                                        + (i_1068_ - i_1069_ & 0x10000));
                                is_1059_[i_1058_]
                                        = i_1068_ - i_1070_ | i_1070_ - (i_1070_
                                        >>> 8);
                            } else if (i_1060_ == 2) {
                                int i_1071_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                                int i_1072_ = (((i_1071_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_1073_ = (((i_1071_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_1059_[i_1058_]
                                        = (((i_1072_ | i_1073_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_1061_ == 1) {
                            if (i_1060_ == 1) {
                                int i_1074_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                                int i_1075_ = i_1074_ >>> 24;
                                int i_1076_ = 256 - i_1075_;
                                int i_1077_ = is_1059_[i_1058_];
                                is_1059_[i_1058_]
                                        = ((((i_1074_ & 0xff00ff) * i_1075_
                                        + (i_1077_ & 0xff00ff) * i_1076_)
                                        & ~0xff00ff)
                                        + (((i_1074_ & 0xff00) * i_1075_
                                        + (i_1077_ & 0xff00) * i_1076_)
                                        & 0xff0000)) >> 8;
                            } else if (i_1060_ == 0) {
                                int i_1078_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                                int i_1079_ = (((i_1078_ >>> 24)
                                        * Class105_Sub3.anInt8477)
                                        >> 8);
                                int i_1080_ = 256 - i_1079_;
                                if ((Class105_Sub3.anInt8480 & 0xffffff)
                                        == 16777215) {
                                    int i_1081_ = is_1059_[i_1058_];
                                    is_1059_[i_1058_]
                                            = ((((i_1078_ & 0xff00ff) * i_1079_
                                            + (i_1081_ & 0xff00ff) * i_1080_)
                                            & ~0xff00ff)
                                            + (((i_1078_ & 0xff00) * i_1079_
                                            + (i_1081_ & 0xff00) * i_1080_)
                                            & 0xff0000)) >> 8;
                                } else if (i_1079_ != 255) {
                                    int i_1082_ = (((i_1078_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_1083_ = (((i_1078_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_1084_ = (((i_1078_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_1078_
                                            = (i_1082_ | i_1083_ | i_1084_) >>> 8;
                                    int i_1085_ = is_1059_[i_1058_];
                                    is_1059_[i_1058_]
                                            = ((((i_1078_ & 0xff00ff) * i_1079_
                                            + (i_1085_ & 0xff00ff) * i_1080_)
                                            & ~0xff00ff)
                                            + (((i_1078_ & 0xff00) * i_1079_
                                            + (i_1085_ & 0xff00) * i_1080_)
                                            & 0xff0000)) >> 8;
                                } else {
                                    int i_1086_ = (((i_1078_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_1087_ = (((i_1078_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_1088_ = (((i_1078_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_1059_[i_1058_]
                                            = (i_1086_ | i_1087_ | i_1088_) >>> 8;
                                }
                            } else if (i_1060_ == 3) {
                                int i_1089_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                                int i_1090_ = Class105_Sub3.anInt8480;
                                int i_1091_ = i_1089_ + i_1090_;
                                int i_1092_ = ((i_1089_ & 0xff00ff)
                                        + (i_1090_ & 0xff00ff));
                                int i_1093_
                                        = ((i_1092_ & 0x1000100)
                                        + (i_1091_ - i_1092_ & 0x10000));
                                i_1093_
                                        = i_1091_ - i_1093_ | i_1093_ - (i_1093_
                                        >>> 8);
                                int i_1094_ = (((i_1089_ >>> 24)
                                        * Class105_Sub3.anInt8477)
                                        >> 8);
                                int i_1095_ = 256 - i_1094_;
                                if (i_1094_ != 255) {
                                    i_1089_ = i_1093_;
                                    i_1093_ = is_1059_[i_1058_];
                                    i_1093_
                                            = ((((i_1089_ & 0xff00ff) * i_1094_
                                            + (i_1093_ & 0xff00ff) * i_1095_)
                                            & ~0xff00ff)
                                            + (((i_1089_ & 0xff00) * i_1094_
                                            + (i_1093_ & 0xff00) * i_1095_)
                                            & 0xff0000)) >> 8;
                                }
                                is_1059_[i_1058_] = i_1093_;
                            } else if (i_1060_ == 2) {
                                int i_1096_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                                int i_1097_ = i_1096_ >>> 24;
                                int i_1098_ = 256 - i_1097_;
                                int i_1099_ = (((i_1096_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_1100_ = (((i_1096_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_1096_ = (((i_1099_ | i_1100_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_1101_ = is_1059_[i_1058_];
                                is_1059_[i_1058_]
                                        = ((((i_1096_ & 0xff00ff) * i_1097_
                                        + (i_1101_ & 0xff00ff) * i_1098_)
                                        & ~0xff00ff)
                                        + (((i_1096_ & 0xff00) * i_1097_
                                        + (i_1101_ & 0xff00) * i_1098_)
                                        & 0xff0000)) >> 8;
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_1061_ == 2) {
                            if (i_1060_ == 1) {
                                int i_1102_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                                int i_1103_ = is_1059_[i_1058_];
                                int i_1104_ = i_1102_ + i_1103_;
                                int i_1105_ = ((i_1102_ & 0xff00ff)
                                        + (i_1103_ & 0xff00ff));
                                i_1103_ = ((i_1105_ & 0x1000100)
                                        + (i_1104_ - i_1105_ & 0x10000));
                                is_1059_[i_1058_]
                                        = i_1104_ - i_1103_ | i_1103_ - (i_1103_
                                        >>> 8);
                            } else if (i_1060_ == 0) {
                                int i_1106_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                                int i_1107_ = (((i_1106_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_1108_ = (((i_1106_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_1109_ = (((i_1106_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                i_1106_ = (i_1107_ | i_1108_ | i_1109_) >>> 8;
                                int i_1110_ = is_1059_[i_1058_];
                                int i_1111_ = i_1106_ + i_1110_;
                                int i_1112_ = ((i_1106_ & 0xff00ff)
                                        + (i_1110_ & 0xff00ff));
                                i_1110_ = ((i_1112_ & 0x1000100)
                                        + (i_1111_ - i_1112_ & 0x10000));
                                is_1059_[i_1058_]
                                        = i_1111_ - i_1110_ | i_1110_ - (i_1110_
                                        >>> 8);
                            } else if (i_1060_ == 3) {
                                int i_1113_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                                int i_1114_ = Class105_Sub3.anInt8480;
                                int i_1115_ = i_1113_ + i_1114_;
                                int i_1116_ = ((i_1113_ & 0xff00ff)
                                        + (i_1114_ & 0xff00ff));
                                int i_1117_
                                        = ((i_1116_ & 0x1000100)
                                        + (i_1115_ - i_1116_ & 0x10000));
                                i_1113_
                                        = i_1115_ - i_1117_ | i_1117_ - (i_1117_
                                        >>> 8);
                                i_1117_ = is_1059_[i_1058_];
                                i_1115_ = i_1113_ + i_1117_;
                                i_1116_ = (i_1113_ & 0xff00ff) + (i_1117_
                                        & 0xff00ff);
                                i_1117_ = ((i_1116_ & 0x1000100)
                                        + (i_1115_ - i_1116_ & 0x10000));
                                is_1059_[i_1058_]
                                        = i_1115_ - i_1117_ | i_1117_ - (i_1117_
                                        >>> 8);
                            } else if (i_1060_ == 2) {
                                int i_1118_ = (((Class105_Sub3_Sub3) this)
                                        .anIntArray9936[i_1057_]);
                                int i_1119_ = (((i_1118_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_1120_ = (((i_1118_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_1118_ = (((i_1119_ | i_1120_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_1121_ = is_1059_[i_1058_];
                                int i_1122_ = i_1118_ + i_1121_;
                                int i_1123_ = ((i_1118_ & 0xff00ff)
                                        + (i_1121_ & 0xff00ff));
                                i_1121_ = ((i_1123_ & 0x1000100)
                                        + (i_1122_ - i_1123_ & 0x10000));
                                is_1059_[i_1058_]
                                        = i_1122_ - i_1121_ | i_1121_ - (i_1121_
                                        >>> 8);
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_1052_ += Class105_Sub3.anInt8481;
                    }
                }
                i_1050_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else if (Class105_Sub3.anInt8450 < 0) {
            for (int i_1124_ = Class105_Sub3.anInt8468; i_1124_ < 0;
                 i_1124_++) {
                int i_1125_ = Class105_Sub3.anInt8451;
                int i_1126_
                        = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                int i_1127_
                        = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                int i_1128_ = Class105_Sub3.anInt8478;
                if (i_1126_ < 0) {
                    int i_1129_ = ((Class105_Sub3.anInt8481 - 1 - i_1126_)
                            / Class105_Sub3.anInt8481);
                    i_1128_ += i_1129_;
                    i_1126_ += Class105_Sub3.anInt8481 * i_1129_;
                    i_1127_ += Class105_Sub3.anInt8450 * i_1129_;
                    i_1125_ += i_1129_;
                }
                int i_1130_;
                if ((i_1130_
                        = (1 + i_1126_ - (((Class105_Sub3) this).anInt8471 << 12)
                        - Class105_Sub3.anInt8481) / Class105_Sub3.anInt8481)
                        > i_1128_)
                    i_1128_ = i_1130_;
                if ((i_1130_
                        = i_1127_ - (((Class105_Sub3) this).anInt8470 << 12))
                        >= 0) {
                    i_1130_ = ((Class105_Sub3.anInt8450 - i_1130_)
                            / Class105_Sub3.anInt8450);
                    i_1128_ += i_1130_;
                    i_1126_ += Class105_Sub3.anInt8481 * i_1130_;
                    i_1127_ += Class105_Sub3.anInt8450 * i_1130_;
                    i_1125_ += i_1130_;
                }
                if ((i_1130_ = ((i_1127_ - Class105_Sub3.anInt8450)
                        / Class105_Sub3.anInt8450))
                        > i_1128_)
                    i_1128_ = i_1130_;
                for (/**/; i_1128_ < 0; i_1128_++) {
                    int i_1131_
                            = ((i_1127_ >> 12) * ((Class105_Sub3) this).anInt8471
                            + (i_1126_ >> 12));
                    int i_1132_ = i_1125_++;
                    int[] is_1133_ = is;
                    int i_1134_ = i;
                    int i_1135_ = i_611_;
                    if (i_1135_ == 0) {
                        if (i_1134_ == 1)
                            is_1133_[i_1132_] = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                        else if (i_1134_ == 0) {
                            int i_1136_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_++]);
                            int i_1137_ = (((i_1136_ & 0xff0000)
                                    * Class105_Sub3.anInt8469)
                                    & ~0xffffff);
                            int i_1138_
                                    = ((i_1136_ & 0xff00) * Class105_Sub3.anInt8463
                                    & 0xff0000);
                            int i_1139_
                                    = ((i_1136_ & 0xff) * Class105_Sub3.anInt8465
                                    & 0xff00);
                            is_1133_[i_1132_]
                                    = (i_1137_ | i_1138_ | i_1139_) >>> 8;
                        } else if (i_1134_ == 3) {
                            int i_1140_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_++]);
                            int i_1141_ = Class105_Sub3.anInt8480;
                            int i_1142_ = i_1140_ + i_1141_;
                            int i_1143_
                                    = (i_1140_ & 0xff00ff) + (i_1141_ & 0xff00ff);
                            int i_1144_ = ((i_1143_ & 0x1000100)
                                    + (i_1142_ - i_1143_ & 0x10000));
                            is_1133_[i_1132_]
                                    = i_1142_ - i_1144_ | i_1144_ - (i_1144_
                                    >>> 8);
                        } else if (i_1134_ == 2) {
                            int i_1145_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                            int i_1146_ = (((i_1145_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_1147_
                                    = ((i_1145_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            is_1133_[i_1132_] = (((i_1146_ | i_1147_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1135_ == 1) {
                        if (i_1134_ == 1) {
                            int i_1148_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                            int i_1149_ = i_1148_ >>> 24;
                            int i_1150_ = 256 - i_1149_;
                            int i_1151_ = is_1133_[i_1132_];
                            is_1133_[i_1132_]
                                    = ((((i_1148_ & 0xff00ff) * i_1149_
                                    + (i_1151_ & 0xff00ff) * i_1150_)
                                    & ~0xff00ff)
                                    + (((i_1148_ & 0xff00) * i_1149_
                                    + (i_1151_ & 0xff00) * i_1150_)
                                    & 0xff0000)) >> 8;
                        } else if (i_1134_ == 0) {
                            int i_1152_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                            int i_1153_
                                    = ((i_1152_ >>> 24) * Class105_Sub3.anInt8477
                                    >> 8);
                            int i_1154_ = 256 - i_1153_;
                            if ((Class105_Sub3.anInt8480 & 0xffffff)
                                    == 16777215) {
                                int i_1155_ = is_1133_[i_1132_];
                                is_1133_[i_1132_]
                                        = ((((i_1152_ & 0xff00ff) * i_1153_
                                        + (i_1155_ & 0xff00ff) * i_1154_)
                                        & ~0xff00ff)
                                        + (((i_1152_ & 0xff00) * i_1153_
                                        + (i_1155_ & 0xff00) * i_1154_)
                                        & 0xff0000)) >> 8;
                            } else if (i_1153_ != 255) {
                                int i_1156_ = (((i_1152_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_1157_ = (((i_1152_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_1158_ = (((i_1152_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                i_1152_ = (i_1156_ | i_1157_ | i_1158_) >>> 8;
                                int i_1159_ = is_1133_[i_1132_];
                                is_1133_[i_1132_]
                                        = ((((i_1152_ & 0xff00ff) * i_1153_
                                        + (i_1159_ & 0xff00ff) * i_1154_)
                                        & ~0xff00ff)
                                        + (((i_1152_ & 0xff00) * i_1153_
                                        + (i_1159_ & 0xff00) * i_1154_)
                                        & 0xff0000)) >> 8;
                            } else {
                                int i_1160_ = (((i_1152_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_1161_ = (((i_1152_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_1162_ = (((i_1152_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_1133_[i_1132_]
                                        = (i_1160_ | i_1161_ | i_1162_) >>> 8;
                            }
                        } else if (i_1134_ == 3) {
                            int i_1163_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                            int i_1164_ = Class105_Sub3.anInt8480;
                            int i_1165_ = i_1163_ + i_1164_;
                            int i_1166_
                                    = (i_1163_ & 0xff00ff) + (i_1164_ & 0xff00ff);
                            int i_1167_ = ((i_1166_ & 0x1000100)
                                    + (i_1165_ - i_1166_ & 0x10000));
                            i_1167_ = i_1165_ - i_1167_ | i_1167_ - (i_1167_
                                    >>> 8);
                            int i_1168_
                                    = ((i_1163_ >>> 24) * Class105_Sub3.anInt8477
                                    >> 8);
                            int i_1169_ = 256 - i_1168_;
                            if (i_1168_ != 255) {
                                i_1163_ = i_1167_;
                                i_1167_ = is_1133_[i_1132_];
                                i_1167_ = ((((i_1163_ & 0xff00ff) * i_1168_
                                        + (i_1167_ & 0xff00ff) * i_1169_)
                                        & ~0xff00ff)
                                        + (((i_1163_ & 0xff00) * i_1168_
                                        + (i_1167_ & 0xff00) * i_1169_)
                                        & 0xff0000)) >> 8;
                            }
                            is_1133_[i_1132_] = i_1167_;
                        } else if (i_1134_ == 2) {
                            int i_1170_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                            int i_1171_ = i_1170_ >>> 24;
                            int i_1172_ = 256 - i_1171_;
                            int i_1173_ = (((i_1170_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_1174_
                                    = ((i_1170_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            i_1170_ = (((i_1173_ | i_1174_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                            int i_1175_ = is_1133_[i_1132_];
                            is_1133_[i_1132_]
                                    = ((((i_1170_ & 0xff00ff) * i_1171_
                                    + (i_1175_ & 0xff00ff) * i_1172_)
                                    & ~0xff00ff)
                                    + (((i_1170_ & 0xff00) * i_1171_
                                    + (i_1175_ & 0xff00) * i_1172_)
                                    & 0xff0000)) >> 8;
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1135_ == 2) {
                        if (i_1134_ == 1) {
                            int i_1176_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                            int i_1177_ = is_1133_[i_1132_];
                            int i_1178_ = i_1176_ + i_1177_;
                            int i_1179_
                                    = (i_1176_ & 0xff00ff) + (i_1177_ & 0xff00ff);
                            i_1177_
                                    = (i_1179_ & 0x1000100) + (i_1178_ - i_1179_
                                    & 0x10000);
                            is_1133_[i_1132_]
                                    = i_1178_ - i_1177_ | i_1177_ - (i_1177_
                                    >>> 8);
                        } else if (i_1134_ == 0) {
                            int i_1180_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                            int i_1181_ = (((i_1180_ & 0xff0000)
                                    * Class105_Sub3.anInt8469)
                                    & ~0xffffff);
                            int i_1182_
                                    = ((i_1180_ & 0xff00) * Class105_Sub3.anInt8463
                                    & 0xff0000);
                            int i_1183_
                                    = ((i_1180_ & 0xff) * Class105_Sub3.anInt8465
                                    & 0xff00);
                            i_1180_ = (i_1181_ | i_1182_ | i_1183_) >>> 8;
                            int i_1184_ = is_1133_[i_1132_];
                            int i_1185_ = i_1180_ + i_1184_;
                            int i_1186_
                                    = (i_1180_ & 0xff00ff) + (i_1184_ & 0xff00ff);
                            i_1184_
                                    = (i_1186_ & 0x1000100) + (i_1185_ - i_1186_
                                    & 0x10000);
                            is_1133_[i_1132_]
                                    = i_1185_ - i_1184_ | i_1184_ - (i_1184_
                                    >>> 8);
                        } else if (i_1134_ == 3) {
                            int i_1187_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                            int i_1188_ = Class105_Sub3.anInt8480;
                            int i_1189_ = i_1187_ + i_1188_;
                            int i_1190_
                                    = (i_1187_ & 0xff00ff) + (i_1188_ & 0xff00ff);
                            int i_1191_ = ((i_1190_ & 0x1000100)
                                    + (i_1189_ - i_1190_ & 0x10000));
                            i_1187_ = i_1189_ - i_1191_ | i_1191_ - (i_1191_
                                    >>> 8);
                            i_1191_ = is_1133_[i_1132_];
                            i_1189_ = i_1187_ + i_1191_;
                            i_1190_
                                    = (i_1187_ & 0xff00ff) + (i_1191_ & 0xff00ff);
                            i_1191_
                                    = (i_1190_ & 0x1000100) + (i_1189_ - i_1190_
                                    & 0x10000);
                            is_1133_[i_1132_]
                                    = i_1189_ - i_1191_ | i_1191_ - (i_1191_
                                    >>> 8);
                        } else if (i_1134_ == 2) {
                            int i_1192_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1131_]);
                            int i_1193_ = (((i_1192_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_1194_
                                    = ((i_1192_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            i_1192_ = (((i_1193_ | i_1194_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                            int i_1195_ = is_1133_[i_1132_];
                            int i_1196_ = i_1192_ + i_1195_;
                            int i_1197_
                                    = (i_1192_ & 0xff00ff) + (i_1195_ & 0xff00ff);
                            i_1195_
                                    = (i_1197_ & 0x1000100) + (i_1196_ - i_1197_
                                    & 0x10000);
                            is_1133_[i_1132_]
                                    = i_1196_ - i_1195_ | i_1195_ - (i_1195_
                                    >>> 8);
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_1126_ += Class105_Sub3.anInt8481;
                    i_1127_ += Class105_Sub3.anInt8450;
                }
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else {
            for (int i_1198_ = Class105_Sub3.anInt8468; i_1198_ < 0;
                 i_1198_++) {
                int i_1199_ = Class105_Sub3.anInt8451;
                int i_1200_
                        = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                int i_1201_
                        = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                int i_1202_ = Class105_Sub3.anInt8478;
                if (i_1200_ < 0) {
                    int i_1203_ = ((Class105_Sub3.anInt8481 - 1 - i_1200_)
                            / Class105_Sub3.anInt8481);
                    i_1202_ += i_1203_;
                    i_1200_ += Class105_Sub3.anInt8481 * i_1203_;
                    i_1201_ += Class105_Sub3.anInt8450 * i_1203_;
                    i_1199_ += i_1203_;
                }
                int i_1204_;
                if ((i_1204_
                        = (1 + i_1200_ - (((Class105_Sub3) this).anInt8471 << 12)
                        - Class105_Sub3.anInt8481) / Class105_Sub3.anInt8481)
                        > i_1202_)
                    i_1202_ = i_1204_;
                if (i_1201_ < 0) {
                    i_1204_ = ((Class105_Sub3.anInt8450 - 1 - i_1201_)
                            / Class105_Sub3.anInt8450);
                    i_1202_ += i_1204_;
                    i_1200_ += Class105_Sub3.anInt8481 * i_1204_;
                    i_1201_ += Class105_Sub3.anInt8450 * i_1204_;
                    i_1199_ += i_1204_;
                }
                if ((i_1204_
                        = (1 + i_1201_ - (((Class105_Sub3) this).anInt8470 << 12)
                        - Class105_Sub3.anInt8450) / Class105_Sub3.anInt8450)
                        > i_1202_)
                    i_1202_ = i_1204_;
                for (/**/; i_1202_ < 0; i_1202_++) {
                    int i_1205_
                            = ((i_1201_ >> 12) * ((Class105_Sub3) this).anInt8471
                            + (i_1200_ >> 12));
                    int i_1206_ = i_1199_++;
                    int[] is_1207_ = is;
                    int i_1208_ = i;
                    int i_1209_ = i_611_;
                    if (i_1209_ == 0) {
                        if (i_1208_ == 1)
                            is_1207_[i_1206_] = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                        else if (i_1208_ == 0) {
                            int i_1210_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_++]);
                            int i_1211_ = (((i_1210_ & 0xff0000)
                                    * Class105_Sub3.anInt8469)
                                    & ~0xffffff);
                            int i_1212_
                                    = ((i_1210_ & 0xff00) * Class105_Sub3.anInt8463
                                    & 0xff0000);
                            int i_1213_
                                    = ((i_1210_ & 0xff) * Class105_Sub3.anInt8465
                                    & 0xff00);
                            is_1207_[i_1206_]
                                    = (i_1211_ | i_1212_ | i_1213_) >>> 8;
                        } else if (i_1208_ == 3) {
                            int i_1214_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_++]);
                            int i_1215_ = Class105_Sub3.anInt8480;
                            int i_1216_ = i_1214_ + i_1215_;
                            int i_1217_
                                    = (i_1214_ & 0xff00ff) + (i_1215_ & 0xff00ff);
                            int i_1218_ = ((i_1217_ & 0x1000100)
                                    + (i_1216_ - i_1217_ & 0x10000));
                            is_1207_[i_1206_]
                                    = i_1216_ - i_1218_ | i_1218_ - (i_1218_
                                    >>> 8);
                        } else if (i_1208_ == 2) {
                            int i_1219_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                            int i_1220_ = (((i_1219_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_1221_
                                    = ((i_1219_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            is_1207_[i_1206_] = (((i_1220_ | i_1221_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1209_ == 1) {
                        if (i_1208_ == 1) {
                            int i_1222_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                            int i_1223_ = i_1222_ >>> 24;
                            int i_1224_ = 256 - i_1223_;
                            int i_1225_ = is_1207_[i_1206_];
                            is_1207_[i_1206_]
                                    = ((((i_1222_ & 0xff00ff) * i_1223_
                                    + (i_1225_ & 0xff00ff) * i_1224_)
                                    & ~0xff00ff)
                                    + (((i_1222_ & 0xff00) * i_1223_
                                    + (i_1225_ & 0xff00) * i_1224_)
                                    & 0xff0000)) >> 8;
                        } else if (i_1208_ == 0) {
                            int i_1226_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                            int i_1227_
                                    = ((i_1226_ >>> 24) * Class105_Sub3.anInt8477
                                    >> 8);
                            int i_1228_ = 256 - i_1227_;
                            if ((Class105_Sub3.anInt8480 & 0xffffff)
                                    == 16777215) {
                                int i_1229_ = is_1207_[i_1206_];
                                is_1207_[i_1206_]
                                        = ((((i_1226_ & 0xff00ff) * i_1227_
                                        + (i_1229_ & 0xff00ff) * i_1228_)
                                        & ~0xff00ff)
                                        + (((i_1226_ & 0xff00) * i_1227_
                                        + (i_1229_ & 0xff00) * i_1228_)
                                        & 0xff0000)) >> 8;
                            } else if (i_1227_ != 255) {
                                int i_1230_ = (((i_1226_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_1231_ = (((i_1226_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_1232_ = (((i_1226_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                i_1226_ = (i_1230_ | i_1231_ | i_1232_) >>> 8;
                                int i_1233_ = is_1207_[i_1206_];
                                is_1207_[i_1206_]
                                        = ((((i_1226_ & 0xff00ff) * i_1227_
                                        + (i_1233_ & 0xff00ff) * i_1228_)
                                        & ~0xff00ff)
                                        + (((i_1226_ & 0xff00) * i_1227_
                                        + (i_1233_ & 0xff00) * i_1228_)
                                        & 0xff0000)) >> 8;
                            } else {
                                int i_1234_ = (((i_1226_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_1235_ = (((i_1226_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_1236_ = (((i_1226_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_1207_[i_1206_]
                                        = (i_1234_ | i_1235_ | i_1236_) >>> 8;
                            }
                        } else if (i_1208_ == 3) {
                            int i_1237_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                            int i_1238_ = Class105_Sub3.anInt8480;
                            int i_1239_ = i_1237_ + i_1238_;
                            int i_1240_
                                    = (i_1237_ & 0xff00ff) + (i_1238_ & 0xff00ff);
                            int i_1241_ = ((i_1240_ & 0x1000100)
                                    + (i_1239_ - i_1240_ & 0x10000));
                            i_1241_ = i_1239_ - i_1241_ | i_1241_ - (i_1241_
                                    >>> 8);
                            int i_1242_
                                    = ((i_1237_ >>> 24) * Class105_Sub3.anInt8477
                                    >> 8);
                            int i_1243_ = 256 - i_1242_;
                            if (i_1242_ != 255) {
                                i_1237_ = i_1241_;
                                i_1241_ = is_1207_[i_1206_];
                                i_1241_ = ((((i_1237_ & 0xff00ff) * i_1242_
                                        + (i_1241_ & 0xff00ff) * i_1243_)
                                        & ~0xff00ff)
                                        + (((i_1237_ & 0xff00) * i_1242_
                                        + (i_1241_ & 0xff00) * i_1243_)
                                        & 0xff0000)) >> 8;
                            }
                            is_1207_[i_1206_] = i_1241_;
                        } else if (i_1208_ == 2) {
                            int i_1244_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                            int i_1245_ = i_1244_ >>> 24;
                            int i_1246_ = 256 - i_1245_;
                            int i_1247_ = (((i_1244_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_1248_
                                    = ((i_1244_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            i_1244_ = (((i_1247_ | i_1248_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                            int i_1249_ = is_1207_[i_1206_];
                            is_1207_[i_1206_]
                                    = ((((i_1244_ & 0xff00ff) * i_1245_
                                    + (i_1249_ & 0xff00ff) * i_1246_)
                                    & ~0xff00ff)
                                    + (((i_1244_ & 0xff00) * i_1245_
                                    + (i_1249_ & 0xff00) * i_1246_)
                                    & 0xff0000)) >> 8;
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1209_ == 2) {
                        if (i_1208_ == 1) {
                            int i_1250_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                            int i_1251_ = is_1207_[i_1206_];
                            int i_1252_ = i_1250_ + i_1251_;
                            int i_1253_
                                    = (i_1250_ & 0xff00ff) + (i_1251_ & 0xff00ff);
                            i_1251_
                                    = (i_1253_ & 0x1000100) + (i_1252_ - i_1253_
                                    & 0x10000);
                            is_1207_[i_1206_]
                                    = i_1252_ - i_1251_ | i_1251_ - (i_1251_
                                    >>> 8);
                        } else if (i_1208_ == 0) {
                            int i_1254_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                            int i_1255_ = (((i_1254_ & 0xff0000)
                                    * Class105_Sub3.anInt8469)
                                    & ~0xffffff);
                            int i_1256_
                                    = ((i_1254_ & 0xff00) * Class105_Sub3.anInt8463
                                    & 0xff0000);
                            int i_1257_
                                    = ((i_1254_ & 0xff) * Class105_Sub3.anInt8465
                                    & 0xff00);
                            i_1254_ = (i_1255_ | i_1256_ | i_1257_) >>> 8;
                            int i_1258_ = is_1207_[i_1206_];
                            int i_1259_ = i_1254_ + i_1258_;
                            int i_1260_
                                    = (i_1254_ & 0xff00ff) + (i_1258_ & 0xff00ff);
                            i_1258_
                                    = (i_1260_ & 0x1000100) + (i_1259_ - i_1260_
                                    & 0x10000);
                            is_1207_[i_1206_]
                                    = i_1259_ - i_1258_ | i_1258_ - (i_1258_
                                    >>> 8);
                        } else if (i_1208_ == 3) {
                            int i_1261_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                            int i_1262_ = Class105_Sub3.anInt8480;
                            int i_1263_ = i_1261_ + i_1262_;
                            int i_1264_
                                    = (i_1261_ & 0xff00ff) + (i_1262_ & 0xff00ff);
                            int i_1265_ = ((i_1264_ & 0x1000100)
                                    + (i_1263_ - i_1264_ & 0x10000));
                            i_1261_ = i_1263_ - i_1265_ | i_1265_ - (i_1265_
                                    >>> 8);
                            i_1265_ = is_1207_[i_1206_];
                            i_1263_ = i_1261_ + i_1265_;
                            i_1264_
                                    = (i_1261_ & 0xff00ff) + (i_1265_ & 0xff00ff);
                            i_1265_
                                    = (i_1264_ & 0x1000100) + (i_1263_ - i_1264_
                                    & 0x10000);
                            is_1207_[i_1206_]
                                    = i_1263_ - i_1265_ | i_1265_ - (i_1265_
                                    >>> 8);
                        } else if (i_1208_ == 2) {
                            int i_1266_ = (((Class105_Sub3_Sub3) this)
                                    .anIntArray9936[i_1205_]);
                            int i_1267_ = (((i_1266_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_1268_
                                    = ((i_1266_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            i_1266_ = (((i_1267_ | i_1268_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                            int i_1269_ = is_1207_[i_1206_];
                            int i_1270_ = i_1266_ + i_1269_;
                            int i_1271_
                                    = (i_1266_ & 0xff00ff) + (i_1269_ & 0xff00ff);
                            i_1269_
                                    = (i_1271_ & 0x1000100) + (i_1270_ - i_1271_
                                    & 0x10000);
                            is_1207_[i_1206_]
                                    = i_1270_ - i_1269_ | i_1269_ - (i_1269_
                                    >>> 8);
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_1200_ += Class105_Sub3.anInt8481;
                    i_1201_ += Class105_Sub3.anInt8450;
                }
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        }
    }
}
