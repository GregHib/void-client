/* Class105_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class105_Sub3_Sub1 extends Class105_Sub3 {
    int[] anIntArray9933;

    final void method994(int i, int i_0_) {
        int[] is
                = this.aHa_Sub1_8460.anIntArray7483;
        if (Class105_Sub3.anInt8481 == 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_1_ = Class105_Sub3.anInt8468;
                while (i_1_ < 0) {
                    int i_2_ = Class105_Sub3.anInt8451;
                    int i_3_ = Class105_Sub3.anInt8458;
                    int i_4_ = Class105_Sub3.anInt8467;
                    int i_5_ = Class105_Sub3.anInt8478;
                    if (i_3_ >= 0 && i_4_ >= 0
                            && i_3_ - (this.anInt8471 << 12) < 0
                            && (i_4_ - (this.anInt8470 << 12)
                            < 0)) {
                        for (/**/; i_5_ < 0; i_5_++) {
                            int i_6_ = (((i_4_ >> 12)
                                    * this.anInt8471)
                                    + (i_3_ >> 12));
                            int i_7_ = i_2_++;
                            int[] is_8_ = is;
                            int i_9_ = i;
                            int i_10_ = i_0_;
                            if (i_10_ == 0) {
                                if (i_9_ == 1)
                                    is_8_[i_7_] = (this
                                            .anIntArray9933[i_6_]);
                                else if (i_9_ == 0) {
                                    int i_11_ = (this
                                            .anIntArray9933[i_6_++]);
                                    int i_12_ = (((i_11_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_13_ = (((i_11_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_14_ = (((i_11_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_8_[i_7_]
                                            = (i_12_ | i_13_ | i_14_) >>> 8;
                                } else if (i_9_ == 3) {
                                    int i_15_ = (this
                                            .anIntArray9933[i_6_++]);
                                    int i_16_ = Class105_Sub3.anInt8480;
                                    int i_17_ = i_15_ + i_16_;
                                    int i_18_ = ((i_15_ & 0xff00ff)
                                            + (i_16_ & 0xff00ff));
                                    int i_19_ = ((i_18_ & 0x1000100)
                                            + (i_17_ - i_18_ & 0x10000));
                                    is_8_[i_7_]
                                            = i_17_ - i_19_ | i_19_ - (i_19_
                                            >>> 8);
                                } else if (i_9_ == 2) {
                                    int i_20_ = (this
                                            .anIntArray9933[i_6_]);
                                    int i_21_ = (((i_20_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_22_ = (((i_20_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_8_[i_7_] = (((i_21_ | i_22_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_10_ == 1) {
                                if (i_9_ == 1) {
                                    int i_23_ = (this
                                            .anIntArray9933[i_6_]);
                                    if (i_23_ != 0)
                                        is_8_[i_7_] = i_23_;
                                } else if (i_9_ == 0) {
                                    int i_24_ = (this
                                            .anIntArray9933[i_6_]);
                                    if (i_24_ != 0) {
                                        if ((Class105_Sub3.anInt8480
                                                & 0xffffff)
                                                == 16777215) {
                                            int i_25_
                                                    = (Class105_Sub3.anInt8480
                                                    >>> 24);
                                            int i_26_ = 256 - i_25_;
                                            int i_27_ = is_8_[i_7_];
                                            is_8_[i_7_]
                                                    = ((((i_24_ & 0xff00ff) * i_25_
                                                    + ((i_27_ & 0xff00ff)
                                                    * i_26_))
                                                    & ~0xff00ff)
                                                    + (((i_24_ & 0xff00) * i_25_
                                                    + ((i_27_ & 0xff00)
                                                    * i_26_))
                                                    & 0xff0000)) >> 8;
                                        } else if (Class105_Sub3.anInt8477
                                                != 255) {
                                            int i_28_
                                                    = (((i_24_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_29_
                                                    = (((i_24_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_30_
                                                    = (((i_24_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            i_24_ = ((i_28_ | i_29_ | i_30_)
                                                    >>> 8);
                                            int i_31_ = is_8_[i_7_];
                                            is_8_[i_7_]
                                                    = (((((i_24_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_31_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & ~0xff00ff)
                                                    + ((((i_24_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_31_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & 0xff0000)) >> 8;
                                        } else {
                                            int i_32_
                                                    = (((i_24_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_33_
                                                    = (((i_24_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_34_
                                                    = (((i_24_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            is_8_[i_7_] = (i_32_ | i_33_
                                                    | i_34_) >>> 8;
                                        }
                                    }
                                } else if (i_9_ == 3) {
                                    int i_35_ = (this
                                            .anIntArray9933[i_6_]);
                                    int i_36_ = Class105_Sub3.anInt8480;
                                    int i_37_ = i_35_ + i_36_;
                                    int i_38_ = ((i_35_ & 0xff00ff)
                                            + (i_36_ & 0xff00ff));
                                    int i_39_ = ((i_38_ & 0x1000100)
                                            + (i_37_ - i_38_ & 0x10000));
                                    i_39_ = i_37_ - i_39_ | i_39_ - (i_39_
                                            >>> 8);
                                    if (i_35_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_35_ = i_39_;
                                        i_39_ = is_8_[i_7_];
                                        i_39_
                                                = (((((i_35_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_39_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_35_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_39_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_8_[i_7_] = i_39_;
                                } else if (i_9_ == 2) {
                                    int i_40_ = (this
                                            .anIntArray9933[i_6_]);
                                    if (i_40_ != 0) {
                                        int i_41_
                                                = (((i_40_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_42_
                                                = (((i_40_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        is_8_[i_7_++]
                                                = (((i_41_ | i_42_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_10_ == 2) {
                                if (i_9_ == 1) {
                                    int i_43_ = (this
                                            .anIntArray9933[i_6_]);
                                    if (i_43_ != 0) {
                                        int i_44_ = is_8_[i_7_];
                                        int i_45_ = i_43_ + i_44_;
                                        int i_46_ = ((i_43_ & 0xff00ff)
                                                + (i_44_ & 0xff00ff));
                                        i_44_ = ((i_46_ & 0x1000100)
                                                + (i_45_ - i_46_ & 0x10000));
                                        is_8_[i_7_]
                                                = i_45_ - i_44_ | i_44_ - (i_44_
                                                >>> 8);
                                    }
                                } else if (i_9_ == 0) {
                                    int i_47_ = (this
                                            .anIntArray9933[i_6_]);
                                    if (i_47_ != 0) {
                                        int i_48_
                                                = (((i_47_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_49_
                                                = (((i_47_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_50_
                                                = (((i_47_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_47_ = (i_48_ | i_49_ | i_50_) >>> 8;
                                        int i_51_ = is_8_[i_7_];
                                        int i_52_ = i_47_ + i_51_;
                                        int i_53_ = ((i_47_ & 0xff00ff)
                                                + (i_51_ & 0xff00ff));
                                        i_51_ = ((i_53_ & 0x1000100)
                                                + (i_52_ - i_53_ & 0x10000));
                                        is_8_[i_7_]
                                                = i_52_ - i_51_ | i_51_ - (i_51_
                                                >>> 8);
                                    }
                                } else if (i_9_ == 3) {
                                    int i_54_ = (this
                                            .anIntArray9933[i_6_]);
                                    int i_55_ = Class105_Sub3.anInt8480;
                                    int i_56_ = i_54_ + i_55_;
                                    int i_57_ = ((i_54_ & 0xff00ff)
                                            + (i_55_ & 0xff00ff));
                                    int i_58_ = ((i_57_ & 0x1000100)
                                            + (i_56_ - i_57_ & 0x10000));
                                    i_54_ = i_56_ - i_58_ | i_58_ - (i_58_
                                            >>> 8);
                                    i_58_ = is_8_[i_7_];
                                    i_56_ = i_54_ + i_58_;
                                    i_57_ = (i_54_ & 0xff00ff) + (i_58_
                                            & 0xff00ff);
                                    i_58_
                                            = (i_57_ & 0x1000100) + (i_56_ - i_57_
                                            & 0x10000);
                                    is_8_[i_7_]
                                            = i_56_ - i_58_ | i_58_ - (i_58_
                                            >>> 8);
                                } else if (i_9_ == 2) {
                                    int i_59_ = (this
                                            .anIntArray9933[i_6_]);
                                    if (i_59_ != 0) {
                                        int i_60_
                                                = (((i_59_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_61_
                                                = (((i_59_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        i_59_ = (((i_60_ | i_61_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                        int i_62_ = is_8_[i_7_];
                                        int i_63_ = i_59_ + i_62_;
                                        int i_64_ = ((i_59_ & 0xff00ff)
                                                + (i_62_ & 0xff00ff));
                                        i_62_ = ((i_64_ & 0x1000100)
                                                + (i_63_ - i_64_ & 0x10000));
                                        is_8_[i_7_]
                                                = i_63_ - i_62_ | i_62_ - (i_62_
                                                >>> 8);
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                        }
                    }
                    i_1_++;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_65_ = Class105_Sub3.anInt8468;
                while (i_65_ < 0) {
                    int i_66_ = Class105_Sub3.anInt8451;
                    int i_67_ = Class105_Sub3.anInt8458;
                    int i_68_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_69_ = Class105_Sub3.anInt8478;
                    if (i_67_ >= 0 && i_67_ - (this.anInt8471
                            << 12) < 0) {
                        int i_70_;
                        if ((i_70_ = i_68_ - (this.anInt8470
                                << 12))
                                >= 0) {
                            i_70_ = ((Class105_Sub3.anInt8450 - i_70_)
                                    / Class105_Sub3.anInt8450);
                            i_69_ += i_70_;
                            i_68_ += Class105_Sub3.anInt8450 * i_70_;
                            i_66_ += i_70_;
                        }
                        if ((i_70_ = ((i_68_ - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_69_)
                            i_69_ = i_70_;
                        for (/**/; i_69_ < 0; i_69_++) {
                            int i_71_ = (((i_68_ >> 12)
                                    * this.anInt8471)
                                    + (i_67_ >> 12));
                            int i_72_ = i_66_++;
                            int[] is_73_ = is;
                            int i_74_ = i;
                            int i_75_ = i_0_;
                            if (i_75_ == 0) {
                                if (i_74_ == 1)
                                    is_73_[i_72_]
                                            = (this
                                            .anIntArray9933[i_71_]);
                                else if (i_74_ == 0) {
                                    int i_76_ = (this
                                            .anIntArray9933[i_71_++]);
                                    int i_77_ = (((i_76_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_78_ = (((i_76_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_79_ = (((i_76_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_73_[i_72_]
                                            = (i_77_ | i_78_ | i_79_) >>> 8;
                                } else if (i_74_ == 3) {
                                    int i_80_ = (this
                                            .anIntArray9933[i_71_++]);
                                    int i_81_ = Class105_Sub3.anInt8480;
                                    int i_82_ = i_80_ + i_81_;
                                    int i_83_ = ((i_80_ & 0xff00ff)
                                            + (i_81_ & 0xff00ff));
                                    int i_84_ = ((i_83_ & 0x1000100)
                                            + (i_82_ - i_83_ & 0x10000));
                                    is_73_[i_72_]
                                            = i_82_ - i_84_ | i_84_ - (i_84_
                                            >>> 8);
                                } else if (i_74_ == 2) {
                                    int i_85_ = (this
                                            .anIntArray9933[i_71_]);
                                    int i_86_ = (((i_85_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_87_ = (((i_85_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_73_[i_72_]
                                            = (((i_86_ | i_87_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_75_ == 1) {
                                if (i_74_ == 1) {
                                    int i_88_ = (this
                                            .anIntArray9933[i_71_]);
                                    if (i_88_ != 0)
                                        is_73_[i_72_] = i_88_;
                                } else if (i_74_ == 0) {
                                    int i_89_ = (this
                                            .anIntArray9933[i_71_]);
                                    if (i_89_ != 0) {
                                        if ((Class105_Sub3.anInt8480
                                                & 0xffffff)
                                                == 16777215) {
                                            int i_90_
                                                    = (Class105_Sub3.anInt8480
                                                    >>> 24);
                                            int i_91_ = 256 - i_90_;
                                            int i_92_ = is_73_[i_72_];
                                            is_73_[i_72_]
                                                    = ((((i_89_ & 0xff00ff) * i_90_
                                                    + ((i_92_ & 0xff00ff)
                                                    * i_91_))
                                                    & ~0xff00ff)
                                                    + (((i_89_ & 0xff00) * i_90_
                                                    + ((i_92_ & 0xff00)
                                                    * i_91_))
                                                    & 0xff0000)) >> 8;
                                        } else if (Class105_Sub3.anInt8477
                                                != 255) {
                                            int i_93_
                                                    = (((i_89_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_94_
                                                    = (((i_89_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_95_
                                                    = (((i_89_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            i_89_ = ((i_93_ | i_94_ | i_95_)
                                                    >>> 8);
                                            int i_96_ = is_73_[i_72_];
                                            is_73_[i_72_]
                                                    = (((((i_89_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_96_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & ~0xff00ff)
                                                    + ((((i_89_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_96_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & 0xff0000)) >> 8;
                                        } else {
                                            int i_97_
                                                    = (((i_89_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_98_
                                                    = (((i_89_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_99_
                                                    = (((i_89_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            is_73_[i_72_] = (i_97_ | i_98_
                                                    | i_99_) >>> 8;
                                        }
                                    }
                                } else if (i_74_ == 3) {
                                    int i_100_ = (this
                                            .anIntArray9933[i_71_]);
                                    int i_101_ = Class105_Sub3.anInt8480;
                                    int i_102_ = i_100_ + i_101_;
                                    int i_103_ = ((i_100_ & 0xff00ff)
                                            + (i_101_ & 0xff00ff));
                                    int i_104_
                                            = ((i_103_ & 0x1000100)
                                            + (i_102_ - i_103_ & 0x10000));
                                    i_104_
                                            = i_102_ - i_104_ | i_104_ - (i_104_
                                            >>> 8);
                                    if (i_100_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_100_ = i_104_;
                                        i_104_ = is_73_[i_72_];
                                        i_104_
                                                = (((((i_100_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_104_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_100_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_104_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_73_[i_72_] = i_104_;
                                } else if (i_74_ == 2) {
                                    int i_105_ = (this
                                            .anIntArray9933[i_71_]);
                                    if (i_105_ != 0) {
                                        int i_106_
                                                = (((i_105_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_107_
                                                = (((i_105_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        is_73_[i_72_++]
                                                = (((i_106_ | i_107_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_75_ == 2) {
                                if (i_74_ == 1) {
                                    int i_108_ = (this
                                            .anIntArray9933[i_71_]);
                                    if (i_108_ != 0) {
                                        int i_109_ = is_73_[i_72_];
                                        int i_110_ = i_108_ + i_109_;
                                        int i_111_ = ((i_108_ & 0xff00ff)
                                                + (i_109_ & 0xff00ff));
                                        i_109_
                                                = ((i_111_ & 0x1000100)
                                                + (i_110_ - i_111_ & 0x10000));
                                        is_73_[i_72_]
                                                = (i_110_ - i_109_
                                                | i_109_ - (i_109_ >>> 8));
                                    }
                                } else if (i_74_ == 0) {
                                    int i_112_ = (this
                                            .anIntArray9933[i_71_]);
                                    if (i_112_ != 0) {
                                        int i_113_
                                                = (((i_112_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_114_
                                                = (((i_112_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_115_
                                                = (((i_112_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_112_
                                                = (i_113_ | i_114_ | i_115_) >>> 8;
                                        int i_116_ = is_73_[i_72_];
                                        int i_117_ = i_112_ + i_116_;
                                        int i_118_ = ((i_112_ & 0xff00ff)
                                                + (i_116_ & 0xff00ff));
                                        i_116_
                                                = ((i_118_ & 0x1000100)
                                                + (i_117_ - i_118_ & 0x10000));
                                        is_73_[i_72_]
                                                = (i_117_ - i_116_
                                                | i_116_ - (i_116_ >>> 8));
                                    }
                                } else if (i_74_ == 3) {
                                    int i_119_ = (this
                                            .anIntArray9933[i_71_]);
                                    int i_120_ = Class105_Sub3.anInt8480;
                                    int i_121_ = i_119_ + i_120_;
                                    int i_122_ = ((i_119_ & 0xff00ff)
                                            + (i_120_ & 0xff00ff));
                                    int i_123_
                                            = ((i_122_ & 0x1000100)
                                            + (i_121_ - i_122_ & 0x10000));
                                    i_119_
                                            = i_121_ - i_123_ | i_123_ - (i_123_
                                            >>> 8);
                                    i_123_ = is_73_[i_72_];
                                    i_121_ = i_119_ + i_123_;
                                    i_122_
                                            = (i_119_ & 0xff00ff) + (i_123_
                                            & 0xff00ff);
                                    i_123_ = ((i_122_ & 0x1000100)
                                            + (i_121_ - i_122_ & 0x10000));
                                    is_73_[i_72_]
                                            = i_121_ - i_123_ | i_123_ - (i_123_
                                            >>> 8);
                                } else if (i_74_ == 2) {
                                    int i_124_ = (this
                                            .anIntArray9933[i_71_]);
                                    if (i_124_ != 0) {
                                        int i_125_
                                                = (((i_124_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_126_
                                                = (((i_124_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        i_124_ = (((i_125_ | i_126_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                        int i_127_ = is_73_[i_72_];
                                        int i_128_ = i_124_ + i_127_;
                                        int i_129_ = ((i_124_ & 0xff00ff)
                                                + (i_127_ & 0xff00ff));
                                        i_127_
                                                = ((i_129_ & 0x1000100)
                                                + (i_128_ - i_129_ & 0x10000));
                                        is_73_[i_72_]
                                                = (i_128_ - i_127_
                                                | i_127_ - (i_127_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_68_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_65_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_130_ = Class105_Sub3.anInt8468;
                while (i_130_ < 0) {
                    int i_131_ = Class105_Sub3.anInt8451;
                    int i_132_ = Class105_Sub3.anInt8458;
                    int i_133_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_134_ = Class105_Sub3.anInt8478;
                    if (i_132_ >= 0
                            && (i_132_ - (this.anInt8471 << 12)
                            < 0)) {
                        if (i_133_ < 0) {
                            int i_135_
                                    = ((Class105_Sub3.anInt8450 - 1 - i_133_)
                                    / Class105_Sub3.anInt8450);
                            i_134_ += i_135_;
                            i_133_ += Class105_Sub3.anInt8450 * i_135_;
                            i_131_ += i_135_;
                        }
                        int i_136_;
                        if ((i_136_
                                = ((1 + i_133_
                                - (this.anInt8470 << 12)
                                - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_134_)
                            i_134_ = i_136_;
                        for (/**/; i_134_ < 0; i_134_++) {
                            int i_137_ = (((i_133_ >> 12)
                                    * this.anInt8471)
                                    + (i_132_ >> 12));
                            int i_138_ = i_131_++;
                            int[] is_139_ = is;
                            int i_140_ = i;
                            int i_141_ = i_0_;
                            if (i_141_ == 0) {
                                if (i_140_ == 1)
                                    is_139_[i_138_]
                                            = (this
                                            .anIntArray9933[i_137_]);
                                else if (i_140_ == 0) {
                                    int i_142_ = (this
                                            .anIntArray9933[i_137_++]);
                                    int i_143_ = (((i_142_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_144_ = (((i_142_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_145_ = (((i_142_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_139_[i_138_]
                                            = (i_143_ | i_144_ | i_145_) >>> 8;
                                } else if (i_140_ == 3) {
                                    int i_146_ = (this
                                            .anIntArray9933[i_137_++]);
                                    int i_147_ = Class105_Sub3.anInt8480;
                                    int i_148_ = i_146_ + i_147_;
                                    int i_149_ = ((i_146_ & 0xff00ff)
                                            + (i_147_ & 0xff00ff));
                                    int i_150_
                                            = ((i_149_ & 0x1000100)
                                            + (i_148_ - i_149_ & 0x10000));
                                    is_139_[i_138_]
                                            = i_148_ - i_150_ | i_150_ - (i_150_
                                            >>> 8);
                                } else if (i_140_ == 2) {
                                    int i_151_ = (this
                                            .anIntArray9933[i_137_]);
                                    int i_152_ = (((i_151_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_153_ = (((i_151_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_139_[i_138_]
                                            = (((i_152_ | i_153_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_141_ == 1) {
                                if (i_140_ == 1) {
                                    int i_154_ = (this
                                            .anIntArray9933[i_137_]);
                                    if (i_154_ != 0)
                                        is_139_[i_138_] = i_154_;
                                } else if (i_140_ == 0) {
                                    int i_155_ = (this
                                            .anIntArray9933[i_137_]);
                                    if (i_155_ != 0) {
                                        if ((Class105_Sub3.anInt8480
                                                & 0xffffff)
                                                == 16777215) {
                                            int i_156_
                                                    = (Class105_Sub3.anInt8480
                                                    >>> 24);
                                            int i_157_ = 256 - i_156_;
                                            int i_158_ = is_139_[i_138_];
                                            is_139_[i_138_]
                                                    = (((((i_155_ & 0xff00ff)
                                                    * i_156_)
                                                    + ((i_158_ & 0xff00ff)
                                                    * i_157_))
                                                    & ~0xff00ff)
                                                    + ((((i_155_ & 0xff00)
                                                    * i_156_)
                                                    + ((i_158_ & 0xff00)
                                                    * i_157_))
                                                    & 0xff0000)) >> 8;
                                        } else if (Class105_Sub3.anInt8477
                                                != 255) {
                                            int i_159_
                                                    = (((i_155_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_160_
                                                    = (((i_155_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_161_
                                                    = (((i_155_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            i_155_ = (i_159_ | i_160_
                                                    | i_161_) >>> 8;
                                            int i_162_ = is_139_[i_138_];
                                            is_139_[i_138_]
                                                    = (((((i_155_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_162_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & ~0xff00ff)
                                                    + ((((i_155_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_162_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & 0xff0000)) >> 8;
                                        } else {
                                            int i_163_
                                                    = (((i_155_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_164_
                                                    = (((i_155_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_165_
                                                    = (((i_155_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            is_139_[i_138_] = (i_163_ | i_164_
                                                    | i_165_) >>> 8;
                                        }
                                    }
                                } else if (i_140_ == 3) {
                                    int i_166_ = (this
                                            .anIntArray9933[i_137_]);
                                    int i_167_ = Class105_Sub3.anInt8480;
                                    int i_168_ = i_166_ + i_167_;
                                    int i_169_ = ((i_166_ & 0xff00ff)
                                            + (i_167_ & 0xff00ff));
                                    int i_170_
                                            = ((i_169_ & 0x1000100)
                                            + (i_168_ - i_169_ & 0x10000));
                                    i_170_
                                            = i_168_ - i_170_ | i_170_ - (i_170_
                                            >>> 8);
                                    if (i_166_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_166_ = i_170_;
                                        i_170_ = is_139_[i_138_];
                                        i_170_
                                                = (((((i_166_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_170_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_166_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_170_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_139_[i_138_] = i_170_;
                                } else if (i_140_ == 2) {
                                    int i_171_ = (this
                                            .anIntArray9933[i_137_]);
                                    if (i_171_ != 0) {
                                        int i_172_
                                                = (((i_171_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_173_
                                                = (((i_171_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        is_139_[i_138_++]
                                                = (((i_172_ | i_173_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_141_ == 2) {
                                if (i_140_ == 1) {
                                    int i_174_ = (this
                                            .anIntArray9933[i_137_]);
                                    if (i_174_ != 0) {
                                        int i_175_ = is_139_[i_138_];
                                        int i_176_ = i_174_ + i_175_;
                                        int i_177_ = ((i_174_ & 0xff00ff)
                                                + (i_175_ & 0xff00ff));
                                        i_175_
                                                = ((i_177_ & 0x1000100)
                                                + (i_176_ - i_177_ & 0x10000));
                                        is_139_[i_138_]
                                                = (i_176_ - i_175_
                                                | i_175_ - (i_175_ >>> 8));
                                    }
                                } else if (i_140_ == 0) {
                                    int i_178_ = (this
                                            .anIntArray9933[i_137_]);
                                    if (i_178_ != 0) {
                                        int i_179_
                                                = (((i_178_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_180_
                                                = (((i_178_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_181_
                                                = (((i_178_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_178_
                                                = (i_179_ | i_180_ | i_181_) >>> 8;
                                        int i_182_ = is_139_[i_138_];
                                        int i_183_ = i_178_ + i_182_;
                                        int i_184_ = ((i_178_ & 0xff00ff)
                                                + (i_182_ & 0xff00ff));
                                        i_182_
                                                = ((i_184_ & 0x1000100)
                                                + (i_183_ - i_184_ & 0x10000));
                                        is_139_[i_138_]
                                                = (i_183_ - i_182_
                                                | i_182_ - (i_182_ >>> 8));
                                    }
                                } else if (i_140_ == 3) {
                                    int i_185_ = (this
                                            .anIntArray9933[i_137_]);
                                    int i_186_ = Class105_Sub3.anInt8480;
                                    int i_187_ = i_185_ + i_186_;
                                    int i_188_ = ((i_185_ & 0xff00ff)
                                            + (i_186_ & 0xff00ff));
                                    int i_189_
                                            = ((i_188_ & 0x1000100)
                                            + (i_187_ - i_188_ & 0x10000));
                                    i_185_
                                            = i_187_ - i_189_ | i_189_ - (i_189_
                                            >>> 8);
                                    i_189_ = is_139_[i_138_];
                                    i_187_ = i_185_ + i_189_;
                                    i_188_
                                            = (i_185_ & 0xff00ff) + (i_189_
                                            & 0xff00ff);
                                    i_189_ = ((i_188_ & 0x1000100)
                                            + (i_187_ - i_188_ & 0x10000));
                                    is_139_[i_138_]
                                            = i_187_ - i_189_ | i_189_ - (i_189_
                                            >>> 8);
                                } else if (i_140_ == 2) {
                                    int i_190_ = (this
                                            .anIntArray9933[i_137_]);
                                    if (i_190_ != 0) {
                                        int i_191_
                                                = (((i_190_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_192_
                                                = (((i_190_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        i_190_ = (((i_191_ | i_192_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                        int i_193_ = is_139_[i_138_];
                                        int i_194_ = i_190_ + i_193_;
                                        int i_195_ = ((i_190_ & 0xff00ff)
                                                + (i_193_ & 0xff00ff));
                                        i_193_
                                                = ((i_195_ & 0x1000100)
                                                + (i_194_ - i_195_ & 0x10000));
                                        is_139_[i_138_]
                                                = (i_194_ - i_193_
                                                | i_193_ - (i_193_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_133_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_130_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8481 < 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_196_ = Class105_Sub3.anInt8468;
                while (i_196_ < 0) {
                    int i_197_ = Class105_Sub3.anInt8451;
                    int i_198_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_199_ = Class105_Sub3.anInt8467;
                    int i_200_ = Class105_Sub3.anInt8478;
                    if (i_199_ >= 0
                            && (i_199_ - (this.anInt8470 << 12)
                            < 0)) {
                        int i_201_;
                        if ((i_201_
                                = i_198_ - (this.anInt8471
                                << 12))
                                >= 0) {
                            i_201_ = ((Class105_Sub3.anInt8481 - i_201_)
                                    / Class105_Sub3.anInt8481);
                            i_200_ += i_201_;
                            i_198_ += Class105_Sub3.anInt8481 * i_201_;
                            i_197_ += i_201_;
                        }
                        if ((i_201_ = ((i_198_ - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_200_)
                            i_200_ = i_201_;
                        for (/**/; i_200_ < 0; i_200_++) {
                            int i_202_ = (((i_199_ >> 12)
                                    * this.anInt8471)
                                    + (i_198_ >> 12));
                            int i_203_ = i_197_++;
                            int[] is_204_ = is;
                            int i_205_ = i;
                            int i_206_ = i_0_;
                            if (i_206_ == 0) {
                                if (i_205_ == 1)
                                    is_204_[i_203_]
                                            = (this
                                            .anIntArray9933[i_202_]);
                                else if (i_205_ == 0) {
                                    int i_207_ = (this
                                            .anIntArray9933[i_202_++]);
                                    int i_208_ = (((i_207_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_209_ = (((i_207_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_210_ = (((i_207_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_204_[i_203_]
                                            = (i_208_ | i_209_ | i_210_) >>> 8;
                                } else if (i_205_ == 3) {
                                    int i_211_ = (this
                                            .anIntArray9933[i_202_++]);
                                    int i_212_ = Class105_Sub3.anInt8480;
                                    int i_213_ = i_211_ + i_212_;
                                    int i_214_ = ((i_211_ & 0xff00ff)
                                            + (i_212_ & 0xff00ff));
                                    int i_215_
                                            = ((i_214_ & 0x1000100)
                                            + (i_213_ - i_214_ & 0x10000));
                                    is_204_[i_203_]
                                            = i_213_ - i_215_ | i_215_ - (i_215_
                                            >>> 8);
                                } else if (i_205_ == 2) {
                                    int i_216_ = (this
                                            .anIntArray9933[i_202_]);
                                    int i_217_ = (((i_216_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_218_ = (((i_216_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_204_[i_203_]
                                            = (((i_217_ | i_218_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_206_ == 1) {
                                if (i_205_ == 1) {
                                    int i_219_ = (this
                                            .anIntArray9933[i_202_]);
                                    if (i_219_ != 0)
                                        is_204_[i_203_] = i_219_;
                                } else if (i_205_ == 0) {
                                    int i_220_ = (this
                                            .anIntArray9933[i_202_]);
                                    if (i_220_ != 0) {
                                        if ((Class105_Sub3.anInt8480
                                                & 0xffffff)
                                                == 16777215) {
                                            int i_221_
                                                    = (Class105_Sub3.anInt8480
                                                    >>> 24);
                                            int i_222_ = 256 - i_221_;
                                            int i_223_ = is_204_[i_203_];
                                            is_204_[i_203_]
                                                    = (((((i_220_ & 0xff00ff)
                                                    * i_221_)
                                                    + ((i_223_ & 0xff00ff)
                                                    * i_222_))
                                                    & ~0xff00ff)
                                                    + ((((i_220_ & 0xff00)
                                                    * i_221_)
                                                    + ((i_223_ & 0xff00)
                                                    * i_222_))
                                                    & 0xff0000)) >> 8;
                                        } else if (Class105_Sub3.anInt8477
                                                != 255) {
                                            int i_224_
                                                    = (((i_220_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_225_
                                                    = (((i_220_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_226_
                                                    = (((i_220_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            i_220_ = (i_224_ | i_225_
                                                    | i_226_) >>> 8;
                                            int i_227_ = is_204_[i_203_];
                                            is_204_[i_203_]
                                                    = (((((i_220_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_227_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & ~0xff00ff)
                                                    + ((((i_220_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_227_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & 0xff0000)) >> 8;
                                        } else {
                                            int i_228_
                                                    = (((i_220_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_229_
                                                    = (((i_220_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_230_
                                                    = (((i_220_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            is_204_[i_203_] = (i_228_ | i_229_
                                                    | i_230_) >>> 8;
                                        }
                                    }
                                } else if (i_205_ == 3) {
                                    int i_231_ = (this
                                            .anIntArray9933[i_202_]);
                                    int i_232_ = Class105_Sub3.anInt8480;
                                    int i_233_ = i_231_ + i_232_;
                                    int i_234_ = ((i_231_ & 0xff00ff)
                                            + (i_232_ & 0xff00ff));
                                    int i_235_
                                            = ((i_234_ & 0x1000100)
                                            + (i_233_ - i_234_ & 0x10000));
                                    i_235_
                                            = i_233_ - i_235_ | i_235_ - (i_235_
                                            >>> 8);
                                    if (i_231_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_231_ = i_235_;
                                        i_235_ = is_204_[i_203_];
                                        i_235_
                                                = (((((i_231_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_235_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_231_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_235_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_204_[i_203_] = i_235_;
                                } else if (i_205_ == 2) {
                                    int i_236_ = (this
                                            .anIntArray9933[i_202_]);
                                    if (i_236_ != 0) {
                                        int i_237_
                                                = (((i_236_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_238_
                                                = (((i_236_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        is_204_[i_203_++]
                                                = (((i_237_ | i_238_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_206_ == 2) {
                                if (i_205_ == 1) {
                                    int i_239_ = (this
                                            .anIntArray9933[i_202_]);
                                    if (i_239_ != 0) {
                                        int i_240_ = is_204_[i_203_];
                                        int i_241_ = i_239_ + i_240_;
                                        int i_242_ = ((i_239_ & 0xff00ff)
                                                + (i_240_ & 0xff00ff));
                                        i_240_
                                                = ((i_242_ & 0x1000100)
                                                + (i_241_ - i_242_ & 0x10000));
                                        is_204_[i_203_]
                                                = (i_241_ - i_240_
                                                | i_240_ - (i_240_ >>> 8));
                                    }
                                } else if (i_205_ == 0) {
                                    int i_243_ = (this
                                            .anIntArray9933[i_202_]);
                                    if (i_243_ != 0) {
                                        int i_244_
                                                = (((i_243_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_245_
                                                = (((i_243_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_246_
                                                = (((i_243_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_243_
                                                = (i_244_ | i_245_ | i_246_) >>> 8;
                                        int i_247_ = is_204_[i_203_];
                                        int i_248_ = i_243_ + i_247_;
                                        int i_249_ = ((i_243_ & 0xff00ff)
                                                + (i_247_ & 0xff00ff));
                                        i_247_
                                                = ((i_249_ & 0x1000100)
                                                + (i_248_ - i_249_ & 0x10000));
                                        is_204_[i_203_]
                                                = (i_248_ - i_247_
                                                | i_247_ - (i_247_ >>> 8));
                                    }
                                } else if (i_205_ == 3) {
                                    int i_250_ = (this
                                            .anIntArray9933[i_202_]);
                                    int i_251_ = Class105_Sub3.anInt8480;
                                    int i_252_ = i_250_ + i_251_;
                                    int i_253_ = ((i_250_ & 0xff00ff)
                                            + (i_251_ & 0xff00ff));
                                    int i_254_
                                            = ((i_253_ & 0x1000100)
                                            + (i_252_ - i_253_ & 0x10000));
                                    i_250_
                                            = i_252_ - i_254_ | i_254_ - (i_254_
                                            >>> 8);
                                    i_254_ = is_204_[i_203_];
                                    i_252_ = i_250_ + i_254_;
                                    i_253_
                                            = (i_250_ & 0xff00ff) + (i_254_
                                            & 0xff00ff);
                                    i_254_ = ((i_253_ & 0x1000100)
                                            + (i_252_ - i_253_ & 0x10000));
                                    is_204_[i_203_]
                                            = i_252_ - i_254_ | i_254_ - (i_254_
                                            >>> 8);
                                } else if (i_205_ == 2) {
                                    int i_255_ = (this
                                            .anIntArray9933[i_202_]);
                                    if (i_255_ != 0) {
                                        int i_256_
                                                = (((i_255_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_257_
                                                = (((i_255_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        i_255_ = (((i_256_ | i_257_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                        int i_258_ = is_204_[i_203_];
                                        int i_259_ = i_255_ + i_258_;
                                        int i_260_ = ((i_255_ & 0xff00ff)
                                                + (i_258_ & 0xff00ff));
                                        i_258_
                                                = ((i_260_ & 0x1000100)
                                                + (i_259_ - i_260_ & 0x10000));
                                        is_204_[i_203_]
                                                = (i_259_ - i_258_
                                                | i_258_ - (i_258_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_198_ += Class105_Sub3.anInt8481;
                        }
                    }
                    i_196_++;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_261_ = Class105_Sub3.anInt8468;
                while (i_261_ < 0) {
                    int i_262_ = Class105_Sub3.anInt8451;
                    int i_263_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_264_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_265_ = Class105_Sub3.anInt8478;
                    int i_266_;
                    if ((i_266_
                            = i_263_ - (this.anInt8471 << 12))
                            >= 0) {
                        i_266_ = ((Class105_Sub3.anInt8481 - i_266_)
                                / Class105_Sub3.anInt8481);
                        i_265_ += i_266_;
                        i_263_ += Class105_Sub3.anInt8481 * i_266_;
                        i_264_ += Class105_Sub3.anInt8450 * i_266_;
                        i_262_ += i_266_;
                    }
                    if ((i_266_ = ((i_263_ - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_265_)
                        i_265_ = i_266_;
                    if ((i_266_
                            = i_264_ - (this.anInt8470 << 12))
                            >= 0) {
                        i_266_ = ((Class105_Sub3.anInt8450 - i_266_)
                                / Class105_Sub3.anInt8450);
                        i_265_ += i_266_;
                        i_263_ += Class105_Sub3.anInt8481 * i_266_;
                        i_264_ += Class105_Sub3.anInt8450 * i_266_;
                        i_262_ += i_266_;
                    }
                    if ((i_266_ = ((i_264_ - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_265_)
                        i_265_ = i_266_;
                    for (/**/; i_265_ < 0; i_265_++) {
                        int i_267_ = (((i_264_ >> 12)
                                * this.anInt8471)
                                + (i_263_ >> 12));
                        int i_268_ = i_262_++;
                        int[] is_269_ = is;
                        int i_270_ = i;
                        int i_271_ = i_0_;
                        if (i_271_ == 0) {
                            if (i_270_ == 1)
                                is_269_[i_268_] = (this
                                        .anIntArray9933[i_267_]);
                            else if (i_270_ == 0) {
                                int i_272_ = (this
                                        .anIntArray9933[i_267_++]);
                                int i_273_ = (((i_272_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_274_ = (((i_272_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_275_ = (((i_272_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_269_[i_268_]
                                        = (i_273_ | i_274_ | i_275_) >>> 8;
                            } else if (i_270_ == 3) {
                                int i_276_ = (this
                                        .anIntArray9933[i_267_++]);
                                int i_277_ = Class105_Sub3.anInt8480;
                                int i_278_ = i_276_ + i_277_;
                                int i_279_ = ((i_276_ & 0xff00ff)
                                        + (i_277_ & 0xff00ff));
                                int i_280_ = ((i_279_ & 0x1000100)
                                        + (i_278_ - i_279_ & 0x10000));
                                is_269_[i_268_]
                                        = i_278_ - i_280_ | i_280_ - (i_280_
                                        >>> 8);
                            } else if (i_270_ == 2) {
                                int i_281_ = (this
                                        .anIntArray9933[i_267_]);
                                int i_282_ = (((i_281_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_283_ = (((i_281_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_269_[i_268_] = (((i_282_ | i_283_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_271_ == 1) {
                            if (i_270_ == 1) {
                                int i_284_ = (this
                                        .anIntArray9933[i_267_]);
                                if (i_284_ != 0)
                                    is_269_[i_268_] = i_284_;
                            } else if (i_270_ == 0) {
                                int i_285_ = (this
                                        .anIntArray9933[i_267_]);
                                if (i_285_ != 0) {
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_286_
                                                = Class105_Sub3.anInt8480 >>> 24;
                                        int i_287_ = 256 - i_286_;
                                        int i_288_ = is_269_[i_268_];
                                        is_269_[i_268_]
                                                = ((((i_285_ & 0xff00ff) * i_286_
                                                + ((i_288_ & 0xff00ff)
                                                * i_287_))
                                                & ~0xff00ff)
                                                + (((i_285_ & 0xff00) * i_286_
                                                + ((i_288_ & 0xff00)
                                                * i_287_))
                                                & 0xff0000)) >> 8;
                                    } else if (Class105_Sub3.anInt8477
                                            != 255) {
                                        int i_289_
                                                = (((i_285_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_290_
                                                = (((i_285_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_291_
                                                = (((i_285_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_285_
                                                = (i_289_ | i_290_ | i_291_) >>> 8;
                                        int i_292_ = is_269_[i_268_];
                                        is_269_[i_268_]
                                                = (((((i_285_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_292_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_285_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_292_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_293_
                                                = (((i_285_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_294_
                                                = (((i_285_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_295_
                                                = (((i_285_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_269_[i_268_]
                                                = (i_293_ | i_294_ | i_295_) >>> 8;
                                    }
                                }
                            } else if (i_270_ == 3) {
                                int i_296_ = (this
                                        .anIntArray9933[i_267_]);
                                int i_297_ = Class105_Sub3.anInt8480;
                                int i_298_ = i_296_ + i_297_;
                                int i_299_ = ((i_296_ & 0xff00ff)
                                        + (i_297_ & 0xff00ff));
                                int i_300_ = ((i_299_ & 0x1000100)
                                        + (i_298_ - i_299_ & 0x10000));
                                i_300_ = i_298_ - i_300_ | i_300_ - (i_300_
                                        >>> 8);
                                if (i_296_ == 0
                                        && Class105_Sub3.anInt8477 != 255) {
                                    i_296_ = i_300_;
                                    i_300_ = is_269_[i_268_];
                                    i_300_
                                            = (((((i_296_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_300_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_296_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_300_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                }
                                is_269_[i_268_] = i_300_;
                            } else if (i_270_ == 2) {
                                int i_301_ = (this
                                        .anIntArray9933[i_267_]);
                                if (i_301_ != 0) {
                                    int i_302_ = (((i_301_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_303_ = (((i_301_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_269_[i_268_++]
                                            = (((i_302_ | i_303_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_271_ == 2) {
                            if (i_270_ == 1) {
                                int i_304_ = (this
                                        .anIntArray9933[i_267_]);
                                if (i_304_ != 0) {
                                    int i_305_ = is_269_[i_268_];
                                    int i_306_ = i_304_ + i_305_;
                                    int i_307_ = ((i_304_ & 0xff00ff)
                                            + (i_305_ & 0xff00ff));
                                    i_305_ = ((i_307_ & 0x1000100)
                                            + (i_306_ - i_307_ & 0x10000));
                                    is_269_[i_268_]
                                            = i_306_ - i_305_ | i_305_ - (i_305_
                                            >>> 8);
                                }
                            } else if (i_270_ == 0) {
                                int i_308_ = (this
                                        .anIntArray9933[i_267_]);
                                if (i_308_ != 0) {
                                    int i_309_ = (((i_308_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_310_ = (((i_308_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_311_ = (((i_308_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_308_ = (i_309_ | i_310_ | i_311_) >>> 8;
                                    int i_312_ = is_269_[i_268_];
                                    int i_313_ = i_308_ + i_312_;
                                    int i_314_ = ((i_308_ & 0xff00ff)
                                            + (i_312_ & 0xff00ff));
                                    i_312_ = ((i_314_ & 0x1000100)
                                            + (i_313_ - i_314_ & 0x10000));
                                    is_269_[i_268_]
                                            = i_313_ - i_312_ | i_312_ - (i_312_
                                            >>> 8);
                                }
                            } else if (i_270_ == 3) {
                                int i_315_ = (this
                                        .anIntArray9933[i_267_]);
                                int i_316_ = Class105_Sub3.anInt8480;
                                int i_317_ = i_315_ + i_316_;
                                int i_318_ = ((i_315_ & 0xff00ff)
                                        + (i_316_ & 0xff00ff));
                                int i_319_ = ((i_318_ & 0x1000100)
                                        + (i_317_ - i_318_ & 0x10000));
                                i_315_ = i_317_ - i_319_ | i_319_ - (i_319_
                                        >>> 8);
                                i_319_ = is_269_[i_268_];
                                i_317_ = i_315_ + i_319_;
                                i_318_ = (i_315_ & 0xff00ff) + (i_319_
                                        & 0xff00ff);
                                i_319_
                                        = (i_318_ & 0x1000100) + (i_317_ - i_318_
                                        & 0x10000);
                                is_269_[i_268_]
                                        = i_317_ - i_319_ | i_319_ - (i_319_
                                        >>> 8);
                            } else if (i_270_ == 2) {
                                int i_320_ = (this
                                        .anIntArray9933[i_267_]);
                                if (i_320_ != 0) {
                                    int i_321_ = (((i_320_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_322_ = (((i_320_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_320_ = (((i_321_ | i_322_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_323_ = is_269_[i_268_];
                                    int i_324_ = i_320_ + i_323_;
                                    int i_325_ = ((i_320_ & 0xff00ff)
                                            + (i_323_ & 0xff00ff));
                                    i_323_ = ((i_325_ & 0x1000100)
                                            + (i_324_ - i_325_ & 0x10000));
                                    is_269_[i_268_]
                                            = i_324_ - i_323_ | i_323_ - (i_323_
                                            >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_263_ += Class105_Sub3.anInt8481;
                        i_264_ += Class105_Sub3.anInt8450;
                    }
                    i_261_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_326_ = Class105_Sub3.anInt8468;
                while (i_326_ < 0) {
                    int i_327_ = Class105_Sub3.anInt8451;
                    int i_328_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_329_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_330_ = Class105_Sub3.anInt8478;
                    int i_331_;
                    if ((i_331_
                            = i_328_ - (this.anInt8471 << 12))
                            >= 0) {
                        i_331_ = ((Class105_Sub3.anInt8481 - i_331_)
                                / Class105_Sub3.anInt8481);
                        i_330_ += i_331_;
                        i_328_ += Class105_Sub3.anInt8481 * i_331_;
                        i_329_ += Class105_Sub3.anInt8450 * i_331_;
                        i_327_ += i_331_;
                    }
                    if ((i_331_ = ((i_328_ - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_330_)
                        i_330_ = i_331_;
                    if (i_329_ < 0) {
                        i_331_ = ((Class105_Sub3.anInt8450 - 1 - i_329_)
                                / Class105_Sub3.anInt8450);
                        i_330_ += i_331_;
                        i_328_ += Class105_Sub3.anInt8481 * i_331_;
                        i_329_ += Class105_Sub3.anInt8450 * i_331_;
                        i_327_ += i_331_;
                    }
                    if ((i_331_ = ((1 + i_329_
                            - (this.anInt8470 << 12)
                            - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_330_)
                        i_330_ = i_331_;
                    for (/**/; i_330_ < 0; i_330_++) {
                        int i_332_ = (((i_329_ >> 12)
                                * this.anInt8471)
                                + (i_328_ >> 12));
                        int i_333_ = i_327_++;
                        int[] is_334_ = is;
                        int i_335_ = i;
                        int i_336_ = i_0_;
                        if (i_336_ == 0) {
                            if (i_335_ == 1)
                                is_334_[i_333_] = (this
                                        .anIntArray9933[i_332_]);
                            else if (i_335_ == 0) {
                                int i_337_ = (this
                                        .anIntArray9933[i_332_++]);
                                int i_338_ = (((i_337_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_339_ = (((i_337_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_340_ = (((i_337_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_334_[i_333_]
                                        = (i_338_ | i_339_ | i_340_) >>> 8;
                            } else if (i_335_ == 3) {
                                int i_341_ = (this
                                        .anIntArray9933[i_332_++]);
                                int i_342_ = Class105_Sub3.anInt8480;
                                int i_343_ = i_341_ + i_342_;
                                int i_344_ = ((i_341_ & 0xff00ff)
                                        + (i_342_ & 0xff00ff));
                                int i_345_ = ((i_344_ & 0x1000100)
                                        + (i_343_ - i_344_ & 0x10000));
                                is_334_[i_333_]
                                        = i_343_ - i_345_ | i_345_ - (i_345_
                                        >>> 8);
                            } else if (i_335_ == 2) {
                                int i_346_ = (this
                                        .anIntArray9933[i_332_]);
                                int i_347_ = (((i_346_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_348_ = (((i_346_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_334_[i_333_] = (((i_347_ | i_348_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_336_ == 1) {
                            if (i_335_ == 1) {
                                int i_349_ = (this
                                        .anIntArray9933[i_332_]);
                                if (i_349_ != 0)
                                    is_334_[i_333_] = i_349_;
                            } else if (i_335_ == 0) {
                                int i_350_ = (this
                                        .anIntArray9933[i_332_]);
                                if (i_350_ != 0) {
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_351_
                                                = Class105_Sub3.anInt8480 >>> 24;
                                        int i_352_ = 256 - i_351_;
                                        int i_353_ = is_334_[i_333_];
                                        is_334_[i_333_]
                                                = ((((i_350_ & 0xff00ff) * i_351_
                                                + ((i_353_ & 0xff00ff)
                                                * i_352_))
                                                & ~0xff00ff)
                                                + (((i_350_ & 0xff00) * i_351_
                                                + ((i_353_ & 0xff00)
                                                * i_352_))
                                                & 0xff0000)) >> 8;
                                    } else if (Class105_Sub3.anInt8477
                                            != 255) {
                                        int i_354_
                                                = (((i_350_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_355_
                                                = (((i_350_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_356_
                                                = (((i_350_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_350_
                                                = (i_354_ | i_355_ | i_356_) >>> 8;
                                        int i_357_ = is_334_[i_333_];
                                        is_334_[i_333_]
                                                = (((((i_350_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_357_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_350_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_357_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_358_
                                                = (((i_350_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_359_
                                                = (((i_350_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_360_
                                                = (((i_350_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_334_[i_333_]
                                                = (i_358_ | i_359_ | i_360_) >>> 8;
                                    }
                                }
                            } else if (i_335_ == 3) {
                                int i_361_ = (this
                                        .anIntArray9933[i_332_]);
                                int i_362_ = Class105_Sub3.anInt8480;
                                int i_363_ = i_361_ + i_362_;
                                int i_364_ = ((i_361_ & 0xff00ff)
                                        + (i_362_ & 0xff00ff));
                                int i_365_ = ((i_364_ & 0x1000100)
                                        + (i_363_ - i_364_ & 0x10000));
                                i_365_ = i_363_ - i_365_ | i_365_ - (i_365_
                                        >>> 8);
                                if (i_361_ == 0
                                        && Class105_Sub3.anInt8477 != 255) {
                                    i_361_ = i_365_;
                                    i_365_ = is_334_[i_333_];
                                    i_365_
                                            = (((((i_361_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_365_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_361_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_365_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                }
                                is_334_[i_333_] = i_365_;
                            } else if (i_335_ == 2) {
                                int i_366_ = (this
                                        .anIntArray9933[i_332_]);
                                if (i_366_ != 0) {
                                    int i_367_ = (((i_366_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_368_ = (((i_366_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_334_[i_333_++]
                                            = (((i_367_ | i_368_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_336_ == 2) {
                            if (i_335_ == 1) {
                                int i_369_ = (this
                                        .anIntArray9933[i_332_]);
                                if (i_369_ != 0) {
                                    int i_370_ = is_334_[i_333_];
                                    int i_371_ = i_369_ + i_370_;
                                    int i_372_ = ((i_369_ & 0xff00ff)
                                            + (i_370_ & 0xff00ff));
                                    i_370_ = ((i_372_ & 0x1000100)
                                            + (i_371_ - i_372_ & 0x10000));
                                    is_334_[i_333_]
                                            = i_371_ - i_370_ | i_370_ - (i_370_
                                            >>> 8);
                                }
                            } else if (i_335_ == 0) {
                                int i_373_ = (this
                                        .anIntArray9933[i_332_]);
                                if (i_373_ != 0) {
                                    int i_374_ = (((i_373_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_375_ = (((i_373_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_376_ = (((i_373_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_373_ = (i_374_ | i_375_ | i_376_) >>> 8;
                                    int i_377_ = is_334_[i_333_];
                                    int i_378_ = i_373_ + i_377_;
                                    int i_379_ = ((i_373_ & 0xff00ff)
                                            + (i_377_ & 0xff00ff));
                                    i_377_ = ((i_379_ & 0x1000100)
                                            + (i_378_ - i_379_ & 0x10000));
                                    is_334_[i_333_]
                                            = i_378_ - i_377_ | i_377_ - (i_377_
                                            >>> 8);
                                }
                            } else if (i_335_ == 3) {
                                int i_380_ = (this
                                        .anIntArray9933[i_332_]);
                                int i_381_ = Class105_Sub3.anInt8480;
                                int i_382_ = i_380_ + i_381_;
                                int i_383_ = ((i_380_ & 0xff00ff)
                                        + (i_381_ & 0xff00ff));
                                int i_384_ = ((i_383_ & 0x1000100)
                                        + (i_382_ - i_383_ & 0x10000));
                                i_380_ = i_382_ - i_384_ | i_384_ - (i_384_
                                        >>> 8);
                                i_384_ = is_334_[i_333_];
                                i_382_ = i_380_ + i_384_;
                                i_383_ = (i_380_ & 0xff00ff) + (i_384_
                                        & 0xff00ff);
                                i_384_
                                        = (i_383_ & 0x1000100) + (i_382_ - i_383_
                                        & 0x10000);
                                is_334_[i_333_]
                                        = i_382_ - i_384_ | i_384_ - (i_384_
                                        >>> 8);
                            } else if (i_335_ == 2) {
                                int i_385_ = (this
                                        .anIntArray9933[i_332_]);
                                if (i_385_ != 0) {
                                    int i_386_ = (((i_385_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_387_ = (((i_385_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_385_ = (((i_386_ | i_387_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_388_ = is_334_[i_333_];
                                    int i_389_ = i_385_ + i_388_;
                                    int i_390_ = ((i_385_ & 0xff00ff)
                                            + (i_388_ & 0xff00ff));
                                    i_388_ = ((i_390_ & 0x1000100)
                                            + (i_389_ - i_390_ & 0x10000));
                                    is_334_[i_333_]
                                            = i_389_ - i_388_ | i_388_ - (i_388_
                                            >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_328_ += Class105_Sub3.anInt8481;
                        i_329_ += Class105_Sub3.anInt8450;
                    }
                    i_326_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8450 == 0) {
            int i_391_ = Class105_Sub3.anInt8468;
            while (i_391_ < 0) {
                int i_392_ = Class105_Sub3.anInt8451;
                int i_393_ = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                int i_394_ = Class105_Sub3.anInt8467;
                int i_395_ = Class105_Sub3.anInt8478;
                if (i_394_ >= 0
                        && i_394_ - (this.anInt8470 << 12) < 0) {
                    if (i_393_ < 0) {
                        int i_396_ = ((Class105_Sub3.anInt8481 - 1 - i_393_)
                                / Class105_Sub3.anInt8481);
                        i_395_ += i_396_;
                        i_393_ += Class105_Sub3.anInt8481 * i_396_;
                        i_392_ += i_396_;
                    }
                    int i_397_;
                    if ((i_397_ = ((1 + i_393_
                            - (this.anInt8471 << 12)
                            - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_395_)
                        i_395_ = i_397_;
                    for (/**/; i_395_ < 0; i_395_++) {
                        int i_398_ = (((i_394_ >> 12)
                                * this.anInt8471)
                                + (i_393_ >> 12));
                        int i_399_ = i_392_++;
                        int[] is_400_ = is;
                        int i_401_ = i;
                        int i_402_ = i_0_;
                        if (i_402_ == 0) {
                            if (i_401_ == 1)
                                is_400_[i_399_] = (this
                                        .anIntArray9933[i_398_]);
                            else if (i_401_ == 0) {
                                int i_403_ = (this
                                        .anIntArray9933[i_398_++]);
                                int i_404_ = (((i_403_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_405_ = (((i_403_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_406_ = (((i_403_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_400_[i_399_]
                                        = (i_404_ | i_405_ | i_406_) >>> 8;
                            } else if (i_401_ == 3) {
                                int i_407_ = (this
                                        .anIntArray9933[i_398_++]);
                                int i_408_ = Class105_Sub3.anInt8480;
                                int i_409_ = i_407_ + i_408_;
                                int i_410_ = ((i_407_ & 0xff00ff)
                                        + (i_408_ & 0xff00ff));
                                int i_411_ = ((i_410_ & 0x1000100)
                                        + (i_409_ - i_410_ & 0x10000));
                                is_400_[i_399_]
                                        = i_409_ - i_411_ | i_411_ - (i_411_
                                        >>> 8);
                            } else if (i_401_ == 2) {
                                int i_412_ = (this
                                        .anIntArray9933[i_398_]);
                                int i_413_ = (((i_412_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_414_ = (((i_412_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_400_[i_399_] = (((i_413_ | i_414_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_402_ == 1) {
                            if (i_401_ == 1) {
                                int i_415_ = (this
                                        .anIntArray9933[i_398_]);
                                if (i_415_ != 0)
                                    is_400_[i_399_] = i_415_;
                            } else if (i_401_ == 0) {
                                int i_416_ = (this
                                        .anIntArray9933[i_398_]);
                                if (i_416_ != 0) {
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_417_
                                                = Class105_Sub3.anInt8480 >>> 24;
                                        int i_418_ = 256 - i_417_;
                                        int i_419_ = is_400_[i_399_];
                                        is_400_[i_399_]
                                                = ((((i_416_ & 0xff00ff) * i_417_
                                                + ((i_419_ & 0xff00ff)
                                                * i_418_))
                                                & ~0xff00ff)
                                                + (((i_416_ & 0xff00) * i_417_
                                                + ((i_419_ & 0xff00)
                                                * i_418_))
                                                & 0xff0000)) >> 8;
                                    } else if (Class105_Sub3.anInt8477
                                            != 255) {
                                        int i_420_
                                                = (((i_416_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_421_
                                                = (((i_416_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_422_
                                                = (((i_416_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_416_
                                                = (i_420_ | i_421_ | i_422_) >>> 8;
                                        int i_423_ = is_400_[i_399_];
                                        is_400_[i_399_]
                                                = (((((i_416_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_423_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_416_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_423_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_424_
                                                = (((i_416_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_425_
                                                = (((i_416_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_426_
                                                = (((i_416_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_400_[i_399_]
                                                = (i_424_ | i_425_ | i_426_) >>> 8;
                                    }
                                }
                            } else if (i_401_ == 3) {
                                int i_427_ = (this
                                        .anIntArray9933[i_398_]);
                                int i_428_ = Class105_Sub3.anInt8480;
                                int i_429_ = i_427_ + i_428_;
                                int i_430_ = ((i_427_ & 0xff00ff)
                                        + (i_428_ & 0xff00ff));
                                int i_431_ = ((i_430_ & 0x1000100)
                                        + (i_429_ - i_430_ & 0x10000));
                                i_431_ = i_429_ - i_431_ | i_431_ - (i_431_
                                        >>> 8);
                                if (i_427_ == 0
                                        && Class105_Sub3.anInt8477 != 255) {
                                    i_427_ = i_431_;
                                    i_431_ = is_400_[i_399_];
                                    i_431_
                                            = (((((i_427_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_431_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_427_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_431_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                }
                                is_400_[i_399_] = i_431_;
                            } else if (i_401_ == 2) {
                                int i_432_ = (this
                                        .anIntArray9933[i_398_]);
                                if (i_432_ != 0) {
                                    int i_433_ = (((i_432_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_434_ = (((i_432_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_400_[i_399_++]
                                            = (((i_433_ | i_434_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_402_ == 2) {
                            if (i_401_ == 1) {
                                int i_435_ = (this
                                        .anIntArray9933[i_398_]);
                                if (i_435_ != 0) {
                                    int i_436_ = is_400_[i_399_];
                                    int i_437_ = i_435_ + i_436_;
                                    int i_438_ = ((i_435_ & 0xff00ff)
                                            + (i_436_ & 0xff00ff));
                                    i_436_ = ((i_438_ & 0x1000100)
                                            + (i_437_ - i_438_ & 0x10000));
                                    is_400_[i_399_]
                                            = i_437_ - i_436_ | i_436_ - (i_436_
                                            >>> 8);
                                }
                            } else if (i_401_ == 0) {
                                int i_439_ = (this
                                        .anIntArray9933[i_398_]);
                                if (i_439_ != 0) {
                                    int i_440_ = (((i_439_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_441_ = (((i_439_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_442_ = (((i_439_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_439_ = (i_440_ | i_441_ | i_442_) >>> 8;
                                    int i_443_ = is_400_[i_399_];
                                    int i_444_ = i_439_ + i_443_;
                                    int i_445_ = ((i_439_ & 0xff00ff)
                                            + (i_443_ & 0xff00ff));
                                    i_443_ = ((i_445_ & 0x1000100)
                                            + (i_444_ - i_445_ & 0x10000));
                                    is_400_[i_399_]
                                            = i_444_ - i_443_ | i_443_ - (i_443_
                                            >>> 8);
                                }
                            } else if (i_401_ == 3) {
                                int i_446_ = (this
                                        .anIntArray9933[i_398_]);
                                int i_447_ = Class105_Sub3.anInt8480;
                                int i_448_ = i_446_ + i_447_;
                                int i_449_ = ((i_446_ & 0xff00ff)
                                        + (i_447_ & 0xff00ff));
                                int i_450_ = ((i_449_ & 0x1000100)
                                        + (i_448_ - i_449_ & 0x10000));
                                i_446_ = i_448_ - i_450_ | i_450_ - (i_450_
                                        >>> 8);
                                i_450_ = is_400_[i_399_];
                                i_448_ = i_446_ + i_450_;
                                i_449_ = (i_446_ & 0xff00ff) + (i_450_
                                        & 0xff00ff);
                                i_450_
                                        = (i_449_ & 0x1000100) + (i_448_ - i_449_
                                        & 0x10000);
                                is_400_[i_399_]
                                        = i_448_ - i_450_ | i_450_ - (i_450_
                                        >>> 8);
                            } else if (i_401_ == 2) {
                                int i_451_ = (this
                                        .anIntArray9933[i_398_]);
                                if (i_451_ != 0) {
                                    int i_452_ = (((i_451_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_453_ = (((i_451_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_451_ = (((i_452_ | i_453_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_454_ = is_400_[i_399_];
                                    int i_455_ = i_451_ + i_454_;
                                    int i_456_ = ((i_451_ & 0xff00ff)
                                            + (i_454_ & 0xff00ff));
                                    i_454_ = ((i_456_ & 0x1000100)
                                            + (i_455_ - i_456_ & 0x10000));
                                    is_400_[i_399_]
                                            = i_455_ - i_454_ | i_454_ - (i_454_
                                            >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_393_ += Class105_Sub3.anInt8481;
                    }
                }
                i_391_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else if (Class105_Sub3.anInt8450 < 0) {
            for (int i_457_ = Class105_Sub3.anInt8468; i_457_ < 0; i_457_++) {
                int i_458_ = Class105_Sub3.anInt8451;
                int i_459_ = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                int i_460_ = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                int i_461_ = Class105_Sub3.anInt8478;
                if (i_459_ < 0) {
                    int i_462_ = ((Class105_Sub3.anInt8481 - 1 - i_459_)
                            / Class105_Sub3.anInt8481);
                    i_461_ += i_462_;
                    i_459_ += Class105_Sub3.anInt8481 * i_462_;
                    i_460_ += Class105_Sub3.anInt8450 * i_462_;
                    i_458_ += i_462_;
                }
                int i_463_;
                if ((i_463_
                        = (1 + i_459_ - (this.anInt8471 << 12)
                        - Class105_Sub3.anInt8481) / Class105_Sub3.anInt8481)
                        > i_461_)
                    i_461_ = i_463_;
                if ((i_463_
                        = i_460_ - (this.anInt8470 << 12))
                        >= 0) {
                    i_463_ = ((Class105_Sub3.anInt8450 - i_463_)
                            / Class105_Sub3.anInt8450);
                    i_461_ += i_463_;
                    i_459_ += Class105_Sub3.anInt8481 * i_463_;
                    i_460_ += Class105_Sub3.anInt8450 * i_463_;
                    i_458_ += i_463_;
                }
                if ((i_463_ = ((i_460_ - Class105_Sub3.anInt8450)
                        / Class105_Sub3.anInt8450))
                        > i_461_)
                    i_461_ = i_463_;
                for (/**/; i_461_ < 0; i_461_++) {
                    int i_464_
                            = ((i_460_ >> 12) * this.anInt8471
                            + (i_459_ >> 12));
                    int i_465_ = i_458_++;
                    int[] is_466_ = is;
                    int i_467_ = i;
                    int i_468_ = i_0_;
                    if (i_468_ == 0) {
                        if (i_467_ == 1)
                            is_466_[i_465_] = (this
                                    .anIntArray9933[i_464_]);
                        else if (i_467_ == 0) {
                            int i_469_ = (this
                                    .anIntArray9933[i_464_++]);
                            int i_470_ = (((i_469_ & 0xff0000)
                                    * Class105_Sub3.anInt8469)
                                    & ~0xffffff);
                            int i_471_
                                    = ((i_469_ & 0xff00) * Class105_Sub3.anInt8463
                                    & 0xff0000);
                            int i_472_
                                    = ((i_469_ & 0xff) * Class105_Sub3.anInt8465
                                    & 0xff00);
                            is_466_[i_465_] = (i_470_ | i_471_ | i_472_) >>> 8;
                        } else if (i_467_ == 3) {
                            int i_473_ = (this
                                    .anIntArray9933[i_464_++]);
                            int i_474_ = Class105_Sub3.anInt8480;
                            int i_475_ = i_473_ + i_474_;
                            int i_476_
                                    = (i_473_ & 0xff00ff) + (i_474_ & 0xff00ff);
                            int i_477_ = ((i_476_ & 0x1000100)
                                    + (i_475_ - i_476_ & 0x10000));
                            is_466_[i_465_]
                                    = i_475_ - i_477_ | i_477_ - (i_477_ >>> 8);
                        } else if (i_467_ == 2) {
                            int i_478_ = (this
                                    .anIntArray9933[i_464_]);
                            int i_479_ = (((i_478_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_480_
                                    = ((i_478_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            is_466_[i_465_] = (((i_479_ | i_480_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_468_ == 1) {
                        if (i_467_ == 1) {
                            int i_481_ = (this
                                    .anIntArray9933[i_464_]);
                            if (i_481_ != 0)
                                is_466_[i_465_] = i_481_;
                        } else if (i_467_ == 0) {
                            int i_482_ = (this
                                    .anIntArray9933[i_464_]);
                            if (i_482_ != 0) {
                                if ((Class105_Sub3.anInt8480 & 0xffffff)
                                        == 16777215) {
                                    int i_483_
                                            = Class105_Sub3.anInt8480 >>> 24;
                                    int i_484_ = 256 - i_483_;
                                    int i_485_ = is_466_[i_465_];
                                    is_466_[i_465_]
                                            = ((((i_482_ & 0xff00ff) * i_483_
                                            + (i_485_ & 0xff00ff) * i_484_)
                                            & ~0xff00ff)
                                            + (((i_482_ & 0xff00) * i_483_
                                            + (i_485_ & 0xff00) * i_484_)
                                            & 0xff0000)) >> 8;
                                } else if (Class105_Sub3.anInt8477 != 255) {
                                    int i_486_ = (((i_482_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_487_ = (((i_482_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_488_ = (((i_482_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_482_ = (i_486_ | i_487_ | i_488_) >>> 8;
                                    int i_489_ = is_466_[i_465_];
                                    is_466_[i_465_]
                                            = (((((i_482_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_489_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_482_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_489_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                } else {
                                    int i_490_ = (((i_482_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_491_ = (((i_482_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_492_ = (((i_482_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_466_[i_465_]
                                            = (i_490_ | i_491_ | i_492_) >>> 8;
                                }
                            }
                        } else if (i_467_ == 3) {
                            int i_493_ = (this
                                    .anIntArray9933[i_464_]);
                            int i_494_ = Class105_Sub3.anInt8480;
                            int i_495_ = i_493_ + i_494_;
                            int i_496_
                                    = (i_493_ & 0xff00ff) + (i_494_ & 0xff00ff);
                            int i_497_ = ((i_496_ & 0x1000100)
                                    + (i_495_ - i_496_ & 0x10000));
                            i_497_ = i_495_ - i_497_ | i_497_ - (i_497_ >>> 8);
                            if (i_493_ == 0
                                    && Class105_Sub3.anInt8477 != 255) {
                                i_493_ = i_497_;
                                i_497_ = is_466_[i_465_];
                                i_497_ = (((((i_493_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_497_ & 0xff00ff)
                                        * Class105_Sub3.anInt8472))
                                        & ~0xff00ff)
                                        + ((((i_493_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_497_ & 0xff00)
                                        * Class105_Sub3.anInt8472))
                                        & 0xff0000)) >> 8;
                            }
                            is_466_[i_465_] = i_497_;
                        } else if (i_467_ == 2) {
                            int i_498_ = (this
                                    .anIntArray9933[i_464_]);
                            if (i_498_ != 0) {
                                int i_499_ = (((i_498_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_500_ = (((i_498_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_466_[i_465_++]
                                        = (((i_499_ | i_500_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_468_ == 2) {
                        if (i_467_ == 1) {
                            int i_501_ = (this
                                    .anIntArray9933[i_464_]);
                            if (i_501_ != 0) {
                                int i_502_ = is_466_[i_465_];
                                int i_503_ = i_501_ + i_502_;
                                int i_504_ = ((i_501_ & 0xff00ff)
                                        + (i_502_ & 0xff00ff));
                                i_502_
                                        = (i_504_ & 0x1000100) + (i_503_ - i_504_
                                        & 0x10000);
                                is_466_[i_465_]
                                        = i_503_ - i_502_ | i_502_ - (i_502_
                                        >>> 8);
                            }
                        } else if (i_467_ == 0) {
                            int i_505_ = (this
                                    .anIntArray9933[i_464_]);
                            if (i_505_ != 0) {
                                int i_506_ = (((i_505_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_507_ = (((i_505_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_508_ = (((i_505_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                i_505_ = (i_506_ | i_507_ | i_508_) >>> 8;
                                int i_509_ = is_466_[i_465_];
                                int i_510_ = i_505_ + i_509_;
                                int i_511_ = ((i_505_ & 0xff00ff)
                                        + (i_509_ & 0xff00ff));
                                i_509_
                                        = (i_511_ & 0x1000100) + (i_510_ - i_511_
                                        & 0x10000);
                                is_466_[i_465_]
                                        = i_510_ - i_509_ | i_509_ - (i_509_
                                        >>> 8);
                            }
                        } else if (i_467_ == 3) {
                            int i_512_ = (this
                                    .anIntArray9933[i_464_]);
                            int i_513_ = Class105_Sub3.anInt8480;
                            int i_514_ = i_512_ + i_513_;
                            int i_515_
                                    = (i_512_ & 0xff00ff) + (i_513_ & 0xff00ff);
                            int i_516_ = ((i_515_ & 0x1000100)
                                    + (i_514_ - i_515_ & 0x10000));
                            i_512_ = i_514_ - i_516_ | i_516_ - (i_516_ >>> 8);
                            i_516_ = is_466_[i_465_];
                            i_514_ = i_512_ + i_516_;
                            i_515_ = (i_512_ & 0xff00ff) + (i_516_ & 0xff00ff);
                            i_516_ = (i_515_ & 0x1000100) + (i_514_ - i_515_
                                    & 0x10000);
                            is_466_[i_465_]
                                    = i_514_ - i_516_ | i_516_ - (i_516_ >>> 8);
                        } else if (i_467_ == 2) {
                            int i_517_ = (this
                                    .anIntArray9933[i_464_]);
                            if (i_517_ != 0) {
                                int i_518_ = (((i_517_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_519_ = (((i_517_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_517_ = (((i_518_ | i_519_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_520_ = is_466_[i_465_];
                                int i_521_ = i_517_ + i_520_;
                                int i_522_ = ((i_517_ & 0xff00ff)
                                        + (i_520_ & 0xff00ff));
                                i_520_
                                        = (i_522_ & 0x1000100) + (i_521_ - i_522_
                                        & 0x10000);
                                is_466_[i_465_]
                                        = i_521_ - i_520_ | i_520_ - (i_520_
                                        >>> 8);
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_459_ += Class105_Sub3.anInt8481;
                    i_460_ += Class105_Sub3.anInt8450;
                }
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else {
            for (int i_523_ = Class105_Sub3.anInt8468; i_523_ < 0; i_523_++) {
                int i_524_ = Class105_Sub3.anInt8451;
                int i_525_ = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                int i_526_ = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                int i_527_ = Class105_Sub3.anInt8478;
                if (i_525_ < 0) {
                    int i_528_ = ((Class105_Sub3.anInt8481 - 1 - i_525_)
                            / Class105_Sub3.anInt8481);
                    i_527_ += i_528_;
                    i_525_ += Class105_Sub3.anInt8481 * i_528_;
                    i_526_ += Class105_Sub3.anInt8450 * i_528_;
                    i_524_ += i_528_;
                }
                int i_529_;
                if ((i_529_
                        = (1 + i_525_ - (this.anInt8471 << 12)
                        - Class105_Sub3.anInt8481) / Class105_Sub3.anInt8481)
                        > i_527_)
                    i_527_ = i_529_;
                if (i_526_ < 0) {
                    i_529_ = ((Class105_Sub3.anInt8450 - 1 - i_526_)
                            / Class105_Sub3.anInt8450);
                    i_527_ += i_529_;
                    i_525_ += Class105_Sub3.anInt8481 * i_529_;
                    i_526_ += Class105_Sub3.anInt8450 * i_529_;
                    i_524_ += i_529_;
                }
                if ((i_529_
                        = (1 + i_526_ - (this.anInt8470 << 12)
                        - Class105_Sub3.anInt8450) / Class105_Sub3.anInt8450)
                        > i_527_)
                    i_527_ = i_529_;
                for (/**/; i_527_ < 0; i_527_++) {
                    int i_530_
                            = ((i_526_ >> 12) * this.anInt8471
                            + (i_525_ >> 12));
                    int i_531_ = i_524_++;
                    int[] is_532_ = is;
                    int i_533_ = i;
                    int i_534_ = i_0_;
                    if (i_534_ == 0) {
                        if (i_533_ == 1)
                            is_532_[i_531_] = (this
                                    .anIntArray9933[i_530_]);
                        else if (i_533_ == 0) {
                            int i_535_ = (this
                                    .anIntArray9933[i_530_++]);
                            int i_536_ = (((i_535_ & 0xff0000)
                                    * Class105_Sub3.anInt8469)
                                    & ~0xffffff);
                            int i_537_
                                    = ((i_535_ & 0xff00) * Class105_Sub3.anInt8463
                                    & 0xff0000);
                            int i_538_
                                    = ((i_535_ & 0xff) * Class105_Sub3.anInt8465
                                    & 0xff00);
                            is_532_[i_531_] = (i_536_ | i_537_ | i_538_) >>> 8;
                        } else if (i_533_ == 3) {
                            int i_539_ = (this
                                    .anIntArray9933[i_530_++]);
                            int i_540_ = Class105_Sub3.anInt8480;
                            int i_541_ = i_539_ + i_540_;
                            int i_542_
                                    = (i_539_ & 0xff00ff) + (i_540_ & 0xff00ff);
                            int i_543_ = ((i_542_ & 0x1000100)
                                    + (i_541_ - i_542_ & 0x10000));
                            is_532_[i_531_]
                                    = i_541_ - i_543_ | i_543_ - (i_543_ >>> 8);
                        } else if (i_533_ == 2) {
                            int i_544_ = (this
                                    .anIntArray9933[i_530_]);
                            int i_545_ = (((i_544_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_546_
                                    = ((i_544_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            is_532_[i_531_] = (((i_545_ | i_546_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_534_ == 1) {
                        if (i_533_ == 1) {
                            int i_547_ = (this
                                    .anIntArray9933[i_530_]);
                            if (i_547_ != 0)
                                is_532_[i_531_] = i_547_;
                        } else if (i_533_ == 0) {
                            int i_548_ = (this
                                    .anIntArray9933[i_530_]);
                            if (i_548_ != 0) {
                                if ((Class105_Sub3.anInt8480 & 0xffffff)
                                        == 16777215) {
                                    int i_549_
                                            = Class105_Sub3.anInt8480 >>> 24;
                                    int i_550_ = 256 - i_549_;
                                    int i_551_ = is_532_[i_531_];
                                    is_532_[i_531_]
                                            = ((((i_548_ & 0xff00ff) * i_549_
                                            + (i_551_ & 0xff00ff) * i_550_)
                                            & ~0xff00ff)
                                            + (((i_548_ & 0xff00) * i_549_
                                            + (i_551_ & 0xff00) * i_550_)
                                            & 0xff0000)) >> 8;
                                } else if (Class105_Sub3.anInt8477 != 255) {
                                    int i_552_ = (((i_548_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_553_ = (((i_548_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_554_ = (((i_548_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_548_ = (i_552_ | i_553_ | i_554_) >>> 8;
                                    int i_555_ = is_532_[i_531_];
                                    is_532_[i_531_]
                                            = (((((i_548_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_555_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_548_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_555_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                } else {
                                    int i_556_ = (((i_548_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_557_ = (((i_548_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_558_ = (((i_548_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_532_[i_531_]
                                            = (i_556_ | i_557_ | i_558_) >>> 8;
                                }
                            }
                        } else if (i_533_ == 3) {
                            int i_559_ = (this
                                    .anIntArray9933[i_530_]);
                            int i_560_ = Class105_Sub3.anInt8480;
                            int i_561_ = i_559_ + i_560_;
                            int i_562_
                                    = (i_559_ & 0xff00ff) + (i_560_ & 0xff00ff);
                            int i_563_ = ((i_562_ & 0x1000100)
                                    + (i_561_ - i_562_ & 0x10000));
                            i_563_ = i_561_ - i_563_ | i_563_ - (i_563_ >>> 8);
                            if (i_559_ == 0
                                    && Class105_Sub3.anInt8477 != 255) {
                                i_559_ = i_563_;
                                i_563_ = is_532_[i_531_];
                                i_563_ = (((((i_559_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_563_ & 0xff00ff)
                                        * Class105_Sub3.anInt8472))
                                        & ~0xff00ff)
                                        + ((((i_559_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_563_ & 0xff00)
                                        * Class105_Sub3.anInt8472))
                                        & 0xff0000)) >> 8;
                            }
                            is_532_[i_531_] = i_563_;
                        } else if (i_533_ == 2) {
                            int i_564_ = (this
                                    .anIntArray9933[i_530_]);
                            if (i_564_ != 0) {
                                int i_565_ = (((i_564_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_566_ = (((i_564_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_532_[i_531_++]
                                        = (((i_565_ | i_566_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_534_ == 2) {
                        if (i_533_ == 1) {
                            int i_567_ = (this
                                    .anIntArray9933[i_530_]);
                            if (i_567_ != 0) {
                                int i_568_ = is_532_[i_531_];
                                int i_569_ = i_567_ + i_568_;
                                int i_570_ = ((i_567_ & 0xff00ff)
                                        + (i_568_ & 0xff00ff));
                                i_568_
                                        = (i_570_ & 0x1000100) + (i_569_ - i_570_
                                        & 0x10000);
                                is_532_[i_531_]
                                        = i_569_ - i_568_ | i_568_ - (i_568_
                                        >>> 8);
                            }
                        } else if (i_533_ == 0) {
                            int i_571_ = (this
                                    .anIntArray9933[i_530_]);
                            if (i_571_ != 0) {
                                int i_572_ = (((i_571_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_573_ = (((i_571_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_574_ = (((i_571_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                i_571_ = (i_572_ | i_573_ | i_574_) >>> 8;
                                int i_575_ = is_532_[i_531_];
                                int i_576_ = i_571_ + i_575_;
                                int i_577_ = ((i_571_ & 0xff00ff)
                                        + (i_575_ & 0xff00ff));
                                i_575_
                                        = (i_577_ & 0x1000100) + (i_576_ - i_577_
                                        & 0x10000);
                                is_532_[i_531_]
                                        = i_576_ - i_575_ | i_575_ - (i_575_
                                        >>> 8);
                            }
                        } else if (i_533_ == 3) {
                            int i_578_ = (this
                                    .anIntArray9933[i_530_]);
                            int i_579_ = Class105_Sub3.anInt8480;
                            int i_580_ = i_578_ + i_579_;
                            int i_581_
                                    = (i_578_ & 0xff00ff) + (i_579_ & 0xff00ff);
                            int i_582_ = ((i_581_ & 0x1000100)
                                    + (i_580_ - i_581_ & 0x10000));
                            i_578_ = i_580_ - i_582_ | i_582_ - (i_582_ >>> 8);
                            i_582_ = is_532_[i_531_];
                            i_580_ = i_578_ + i_582_;
                            i_581_ = (i_578_ & 0xff00ff) + (i_582_ & 0xff00ff);
                            i_582_ = (i_581_ & 0x1000100) + (i_580_ - i_581_
                                    & 0x10000);
                            is_532_[i_531_]
                                    = i_580_ - i_582_ | i_582_ - (i_582_ >>> 8);
                        } else if (i_533_ == 2) {
                            int i_583_ = (this
                                    .anIntArray9933[i_530_]);
                            if (i_583_ != 0) {
                                int i_584_ = (((i_583_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_585_ = (((i_583_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_583_ = (((i_584_ | i_585_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_586_ = is_532_[i_531_];
                                int i_587_ = i_583_ + i_586_;
                                int i_588_ = ((i_583_ & 0xff00ff)
                                        + (i_586_ & 0xff00ff));
                                i_586_
                                        = (i_588_ & 0x1000100) + (i_587_ - i_588_
                                        & 0x10000);
                                is_532_[i_531_]
                                        = i_587_ - i_586_ | i_586_ - (i_586_
                                        >>> 8);
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_525_ += Class105_Sub3.anInt8481;
                    i_526_ += Class105_Sub3.anInt8450;
                }
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        }
    }

    final void method979(int i, int i_589_, int i_590_, int i_591_, int i_592_,
                         int i_593_) {
        int[] is
                = this.aHa_Sub1_8460.anIntArray7483;
        for (int i_594_ = 0; i_594_ < i_591_; i_594_++) {
            int i_595_
                    = (i_589_ + i_594_) * this.anInt8471 + i;
            int i_596_
                    = ((i_593_ + i_594_) * this
                    .aHa_Sub1_8460.anInt7477
                    + i_592_);
            for (int i_597_ = 0; i_597_ < i_590_; i_597_++)
                this.anIntArray9933[i_595_ + i_597_]
                        = is[i_596_ + i_597_];
        }
    }

    final void method982(int i, int i_598_, int i_599_, int i_600_, int i_601_,
                         int i_602_, int i_603_, int i_604_) {
        if (this.aHa_Sub1_8460.method3716())
            throw new IllegalStateException();
        if (i_599_ > 0 && i_600_ > 0) {
            int i_605_ = 0;
            int i_606_ = 0;
            int i_607_
                    = this.aHa_Sub1_8460.anInt7477;
            int i_608_ = (this.anInt8461
                    + this.anInt8471
                    + this.anInt8454);
            int i_609_ = (this.anInt8464
                    + this.anInt8470
                    + this.anInt8456);
            int i_610_ = (i_608_ << 16) / i_599_;
            int i_611_ = (i_609_ << 16) / i_600_;
            if (this.anInt8461 > 0) {
                int i_612_
                        = (((this.anInt8461 << 16) + i_610_ - 1)
                        / i_610_);
                i += i_612_;
                i_605_ += i_612_ * i_610_ - (this.anInt8461
                        << 16);
            }
            if (this.anInt8464 > 0) {
                int i_613_
                        = (((this.anInt8464 << 16) + i_611_ - 1)
                        / i_611_);
                i_598_ += i_613_;
                i_606_ += i_613_ * i_611_ - (this.anInt8464
                        << 16);
            }
            if (this.anInt8471 < i_608_)
                i_599_ = ((this.anInt8471 << 16) - i_605_
                        + i_610_ - 1) / i_610_;
            if (this.anInt8470 < i_609_)
                i_600_ = ((this.anInt8470 << 16) - i_606_
                        + i_611_ - 1) / i_611_;
            int i_614_ = i + i_598_ * i_607_;
            int i_615_ = i_607_ - i_599_;
            if (i_598_ + i_600_
                    > this.aHa_Sub1_8460.anInt7503)
                i_600_ -= (i_598_ + i_600_
                        - (this.aHa_Sub1_8460
                        .anInt7503));
            if (i_598_
                    < this.aHa_Sub1_8460.anInt7476) {
                int i_616_ = ((this.aHa_Sub1_8460
                        .anInt7476)
                        - i_598_);
                i_600_ -= i_616_;
                i_614_ += i_616_ * i_607_;
                i_606_ += i_611_ * i_616_;
            }
            if (i + i_599_
                    > this.aHa_Sub1_8460.anInt7507) {
                int i_617_
                        = (i + i_599_
                        - (this.aHa_Sub1_8460
                        .anInt7507));
                i_599_ -= i_617_;
                i_615_ += i_617_;
            }
            if (i
                    < this.aHa_Sub1_8460.anInt7496) {
                int i_618_ = ((this.aHa_Sub1_8460
                        .anInt7496)
                        - i);
                i_599_ -= i_618_;
                i_614_ += i_618_;
                i_605_ += i_610_ * i_618_;
                i_615_ += i_618_;
            }
            int[] is = (this.aHa_Sub1_8460
                    .anIntArray7483);
            if (i_603_ == 0) {
                if (i_601_ == 1) {
                    int i_619_ = i_605_;
                    for (int i_620_ = -i_600_; i_620_ < 0; i_620_++) {
                        int i_621_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_622_ = -i_599_; i_622_ < 0; i_622_++) {
                            is[i_614_++]
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_621_]);
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_619_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                if (i_601_ == 0) {
                    int i_623_ = (i_602_ & 0xff0000) >> 16;
                    int i_624_ = (i_602_ & 0xff00) >> 8;
                    int i_625_ = i_602_ & 0xff;
                    int i_626_ = i_605_;
                    for (int i_627_ = -i_600_; i_627_ < 0; i_627_++) {
                        int i_628_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_629_ = -i_599_; i_629_ < 0; i_629_++) {
                            int i_630_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_628_]);
                            int i_631_
                                    = (i_630_ & 0xff0000) * i_623_ & ~0xffffff;
                            int i_632_ = (i_630_ & 0xff00) * i_624_ & 0xff0000;
                            int i_633_ = (i_630_ & 0xff) * i_625_ & 0xff00;
                            is[i_614_++] = (i_631_ | i_632_ | i_633_) >>> 8;
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_626_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                if (i_601_ == 3) {
                    int i_634_ = i_605_;
                    for (int i_635_ = -i_600_; i_635_ < 0; i_635_++) {
                        int i_636_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_637_ = -i_599_; i_637_ < 0; i_637_++) {
                            int i_638_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_636_]);
                            int i_639_ = i_638_ + i_602_;
                            int i_640_
                                    = (i_638_ & 0xff00ff) + (i_602_ & 0xff00ff);
                            int i_641_ = ((i_640_ & 0x1000100)
                                    + (i_639_ - i_640_ & 0x10000));
                            is[i_614_++]
                                    = i_639_ - i_641_ | i_641_ - (i_641_ >>> 8);
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_634_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                if (i_601_ == 2) {
                    int i_642_ = i_602_ >>> 24;
                    int i_643_ = 256 - i_642_;
                    int i_644_ = (i_602_ & 0xff00ff) * i_643_ & ~0xff00ff;
                    int i_645_ = (i_602_ & 0xff00) * i_643_ & 0xff0000;
                    i_602_ = (i_644_ | i_645_) >>> 8;
                    int i_646_ = i_605_;
                    for (int i_647_ = -i_600_; i_647_ < 0; i_647_++) {
                        int i_648_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_649_ = -i_599_; i_649_ < 0; i_649_++) {
                            int i_650_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_648_]);
                            i_644_ = (i_650_ & 0xff00ff) * i_642_ & ~0xff00ff;
                            i_645_ = (i_650_ & 0xff00) * i_642_ & 0xff0000;
                            is[i_614_++] = ((i_644_ | i_645_) >>> 8) + i_602_;
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_646_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_603_ == 1) {
                if (i_601_ == 1) {
                    int i_651_ = i_605_;
                    for (int i_652_ = -i_600_; i_652_ < 0; i_652_++) {
                        int i_653_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_654_ = -i_599_; i_654_ < 0; i_654_++) {
                            int i_655_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_653_]);
                            if (i_655_ != 0)
                                is[i_614_++] = i_655_;
                            else
                                i_614_++;
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_651_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                if (i_601_ == 0) {
                    int i_656_ = i_605_;
                    if ((i_602_ & 0xffffff) == 16777215) {
                        int i_657_ = i_602_ >>> 24;
                        int i_658_ = 256 - i_657_;
                        for (int i_659_ = -i_600_; i_659_ < 0; i_659_++) {
                            int i_660_ = ((i_606_ >> 16)
                                    * this.anInt8471);
                            for (int i_661_ = -i_599_; i_661_ < 0; i_661_++) {
                                int i_662_ = (this
                                        .anIntArray9933
                                        [(i_605_ >> 16) + i_660_]);
                                if (i_662_ != 0) {
                                    int i_663_ = is[i_614_];
                                    is[i_614_++]
                                            = ((((i_662_ & 0xff00ff) * i_657_
                                            + (i_663_ & 0xff00ff) * i_658_)
                                            & ~0xff00ff)
                                            + (((i_662_ & 0xff00) * i_657_
                                            + (i_663_ & 0xff00) * i_658_)
                                            & 0xff0000)) >> 8;
                                } else
                                    i_614_++;
                                i_605_ += i_610_;
                            }
                            i_606_ += i_611_;
                            i_605_ = i_656_;
                            i_614_ += i_615_;
                        }
                    } else {
                        int i_664_ = (i_602_ & 0xff0000) >> 16;
                        int i_665_ = (i_602_ & 0xff00) >> 8;
                        int i_666_ = i_602_ & 0xff;
                        int i_667_ = i_602_ >>> 24;
                        int i_668_ = 256 - i_667_;
                        for (int i_669_ = -i_600_; i_669_ < 0; i_669_++) {
                            int i_670_ = ((i_606_ >> 16)
                                    * this.anInt8471);
                            for (int i_671_ = -i_599_; i_671_ < 0; i_671_++) {
                                int i_672_ = (this
                                        .anIntArray9933
                                        [(i_605_ >> 16) + i_670_]);
                                if (i_672_ != 0) {
                                    if (i_667_ != 255) {
                                        int i_673_
                                                = ((i_672_ & 0xff0000) * i_664_
                                                & ~0xffffff);
                                        int i_674_
                                                = ((i_672_ & 0xff00) * i_665_
                                                & 0xff0000);
                                        int i_675_ = ((i_672_ & 0xff) * i_666_
                                                & 0xff00);
                                        i_672_
                                                = (i_673_ | i_674_ | i_675_) >>> 8;
                                        int i_676_ = is[i_614_];
                                        is[i_614_++]
                                                = ((((i_672_ & 0xff00ff) * i_667_
                                                + ((i_676_ & 0xff00ff)
                                                * i_668_))
                                                & ~0xff00ff)
                                                + (((i_672_ & 0xff00) * i_667_
                                                + ((i_676_ & 0xff00)
                                                * i_668_))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_677_
                                                = ((i_672_ & 0xff0000) * i_664_
                                                & ~0xffffff);
                                        int i_678_
                                                = ((i_672_ & 0xff00) * i_665_
                                                & 0xff0000);
                                        int i_679_ = ((i_672_ & 0xff) * i_666_
                                                & 0xff00);
                                        is[i_614_++]
                                                = (i_677_ | i_678_ | i_679_) >>> 8;
                                    }
                                } else
                                    i_614_++;
                                i_605_ += i_610_;
                            }
                            i_606_ += i_611_;
                            i_605_ = i_656_;
                            i_614_ += i_615_;
                        }
                        return;
                    }
                    return;
                }
                if (i_601_ == 3) {
                    int i_680_ = i_605_;
                    int i_681_ = i_602_ >>> 24;
                    int i_682_ = 256 - i_681_;
                    for (int i_683_ = -i_600_; i_683_ < 0; i_683_++) {
                        int i_684_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_685_ = -i_599_; i_685_ < 0; i_685_++) {
                            int i_686_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_684_]);
                            int i_687_ = i_686_ + i_602_;
                            int i_688_
                                    = (i_686_ & 0xff00ff) + (i_602_ & 0xff00ff);
                            int i_689_ = ((i_688_ & 0x1000100)
                                    + (i_687_ - i_688_ & 0x10000));
                            i_689_ = i_687_ - i_689_ | i_689_ - (i_689_ >>> 8);
                            if (i_686_ == 0 && i_681_ != 255) {
                                i_686_ = i_689_;
                                i_689_ = is[i_614_];
                                i_689_ = ((((i_686_ & 0xff00ff) * i_681_
                                        + (i_689_ & 0xff00ff) * i_682_)
                                        & ~0xff00ff)
                                        + (((i_686_ & 0xff00) * i_681_
                                        + (i_689_ & 0xff00) * i_682_)
                                        & 0xff0000)) >> 8;
                            }
                            is[i_614_++] = i_689_;
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_680_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                if (i_601_ == 2) {
                    int i_690_ = i_602_ >>> 24;
                    int i_691_ = 256 - i_690_;
                    int i_692_ = (i_602_ & 0xff00ff) * i_691_ & ~0xff00ff;
                    int i_693_ = (i_602_ & 0xff00) * i_691_ & 0xff0000;
                    i_602_ = (i_692_ | i_693_) >>> 8;
                    int i_694_ = i_605_;
                    for (int i_695_ = -i_600_; i_695_ < 0; i_695_++) {
                        int i_696_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_697_ = -i_599_; i_697_ < 0; i_697_++) {
                            int i_698_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_696_]);
                            if (i_698_ != 0) {
                                i_692_
                                        = (i_698_ & 0xff00ff) * i_690_ & ~0xff00ff;
                                i_693_ = (i_698_ & 0xff00) * i_690_ & 0xff0000;
                                is[i_614_++]
                                        = ((i_692_ | i_693_) >>> 8) + i_602_;
                            } else
                                i_614_++;
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_694_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_603_ == 2) {
                if (i_601_ == 1) {
                    int i_699_ = i_605_;
                    for (int i_700_ = -i_600_; i_700_ < 0; i_700_++) {
                        int i_701_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_702_ = -i_599_; i_702_ < 0; i_702_++) {
                            int i_703_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_701_]);
                            if (i_703_ != 0) {
                                int i_704_ = is[i_614_];
                                int i_705_ = i_703_ + i_704_;
                                int i_706_ = ((i_703_ & 0xff00ff)
                                        + (i_704_ & 0xff00ff));
                                i_704_
                                        = (i_706_ & 0x1000100) + (i_705_ - i_706_
                                        & 0x10000);
                                is[i_614_++]
                                        = i_705_ - i_704_ | i_704_ - (i_704_
                                        >>> 8);
                            } else
                                i_614_++;
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_699_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                if (i_601_ == 0) {
                    int i_707_ = i_605_;
                    int i_708_ = (i_602_ & 0xff0000) >> 16;
                    int i_709_ = (i_602_ & 0xff00) >> 8;
                    int i_710_ = i_602_ & 0xff;
                    for (int i_711_ = -i_600_; i_711_ < 0; i_711_++) {
                        int i_712_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_713_ = -i_599_; i_713_ < 0; i_713_++) {
                            int i_714_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_712_]);
                            if (i_714_ != 0) {
                                int i_715_
                                        = (i_714_ & 0xff0000) * i_708_ & ~0xffffff;
                                int i_716_
                                        = (i_714_ & 0xff00) * i_709_ & 0xff0000;
                                int i_717_ = (i_714_ & 0xff) * i_710_ & 0xff00;
                                i_714_ = (i_715_ | i_716_ | i_717_) >>> 8;
                                int i_718_ = is[i_614_];
                                int i_719_ = i_714_ + i_718_;
                                int i_720_ = ((i_714_ & 0xff00ff)
                                        + (i_718_ & 0xff00ff));
                                i_718_
                                        = (i_720_ & 0x1000100) + (i_719_ - i_720_
                                        & 0x10000);
                                is[i_614_++]
                                        = i_719_ - i_718_ | i_718_ - (i_718_
                                        >>> 8);
                            } else
                                i_614_++;
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_707_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                if (i_601_ == 3) {
                    int i_721_ = i_605_;
                    for (int i_722_ = -i_600_; i_722_ < 0; i_722_++) {
                        int i_723_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_724_ = -i_599_; i_724_ < 0; i_724_++) {
                            int i_725_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_723_]);
                            int i_726_ = i_725_ + i_602_;
                            int i_727_
                                    = (i_725_ & 0xff00ff) + (i_602_ & 0xff00ff);
                            int i_728_ = ((i_727_ & 0x1000100)
                                    + (i_726_ - i_727_ & 0x10000));
                            i_725_ = i_726_ - i_728_ | i_728_ - (i_728_ >>> 8);
                            i_728_ = is[i_614_];
                            i_726_ = i_725_ + i_728_;
                            i_727_ = (i_725_ & 0xff00ff) + (i_728_ & 0xff00ff);
                            i_728_ = (i_727_ & 0x1000100) + (i_726_ - i_727_
                                    & 0x10000);
                            is[i_614_++]
                                    = i_726_ - i_728_ | i_728_ - (i_728_ >>> 8);
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_721_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                if (i_601_ == 2) {
                    int i_729_ = i_602_ >>> 24;
                    int i_730_ = 256 - i_729_;
                    int i_731_ = (i_602_ & 0xff00ff) * i_730_ & ~0xff00ff;
                    int i_732_ = (i_602_ & 0xff00) * i_730_ & 0xff0000;
                    i_602_ = (i_731_ | i_732_) >>> 8;
                    int i_733_ = i_605_;
                    for (int i_734_ = -i_600_; i_734_ < 0; i_734_++) {
                        int i_735_ = ((i_606_ >> 16)
                                * this.anInt8471);
                        for (int i_736_ = -i_599_; i_736_ < 0; i_736_++) {
                            int i_737_
                                    = (this.anIntArray9933
                                    [(i_605_ >> 16) + i_735_]);
                            if (i_737_ != 0) {
                                i_731_
                                        = (i_737_ & 0xff00ff) * i_729_ & ~0xff00ff;
                                i_732_ = (i_737_ & 0xff00) * i_729_ & 0xff0000;
                                i_737_ = ((i_731_ | i_732_) >>> 8) + i_602_;
                                int i_738_ = is[i_614_];
                                int i_739_ = i_737_ + i_738_;
                                int i_740_ = ((i_737_ & 0xff00ff)
                                        + (i_738_ & 0xff00ff));
                                i_738_
                                        = (i_740_ & 0x1000100) + (i_739_ - i_740_
                                        & 0x10000);
                                is[i_614_++]
                                        = i_739_ - i_738_ | i_738_ - (i_738_
                                        >>> 8);
                            } else
                                i_614_++;
                            i_605_ += i_610_;
                        }
                        i_606_ += i_611_;
                        i_605_ = i_733_;
                        i_614_ += i_615_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method968(int i, int i_741_, int i_742_) {
        throw new IllegalStateException
                ("Can't capture alpha into a java_sprite_24");
    }

    Class105_Sub3_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_743_) {
        super(var_ha_Sub1, i, i_743_);
        this.anIntArray9933 = new int[i * i_743_];
    }

    Class105_Sub3_Sub1(ha_Sub1 var_ha_Sub1, int[] is, int i, int i_744_,
                       int i_745_, int i_746_, boolean bool) {
        super(var_ha_Sub1, i_745_, i_746_);
        if (bool)
            this.anIntArray9933
                    = new int[i_745_ * i_746_];
        else
            this.anIntArray9933 = is;
        i_744_ -= this.anInt8471;
        int i_747_ = 0;
        for (int i_748_ = 0; i_748_ < i_746_; i_748_++) {
            for (int i_749_ = 0; i_749_ < i_745_; i_749_++) {
                int i_750_ = is[i++];
                if (i_750_ >>> 24 == 255)
                    this.anIntArray9933[i_747_++]
                            = (i_750_ & 0xffffff) == 0 ? -16777215 : i_750_;
                else
                    this.anIntArray9933[i_747_++] = 0;
            }
            i += i_744_;
        }
    }

    Class105_Sub3_Sub1(ha_Sub1 var_ha_Sub1, int[] is, int i, int i_751_) {
        super(var_ha_Sub1, i, i_751_);
        this.anIntArray9933 = is;
    }

    final void method995(int[] is, int[] is_752_, int i, int i_753_) {
        int[] is_754_
                = this.aHa_Sub1_8460.anIntArray7483;
        if (Class105_Sub3.anInt8481 == 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_755_ = Class105_Sub3.anInt8468;
                while (i_755_ < 0) {
                    int i_756_ = i_755_ + i_753_;
                    if (i_756_ >= 0) {
                        if (i_756_ >= is.length)
                            break;
                        int i_757_ = Class105_Sub3.anInt8451;
                        int i_758_ = Class105_Sub3.anInt8458;
                        int i_759_ = Class105_Sub3.anInt8467;
                        int i_760_ = Class105_Sub3.anInt8478;
                        if (i_758_ >= 0 && i_759_ >= 0
                                && i_758_ - (this.anInt8471
                                << 12) < 0
                                && i_759_ - (this.anInt8470
                                << 12) < 0) {
                            int i_761_ = is[i_756_] - i;
                            int i_762_ = -is_752_[i_756_];
                            int i_763_
                                    = i_761_ - (i_757_ - Class105_Sub3.anInt8451);
                            if (i_763_ > 0) {
                                i_757_ += i_763_;
                                i_760_ += i_763_;
                                i_758_ += Class105_Sub3.anInt8481 * i_763_;
                                i_759_ += Class105_Sub3.anInt8450 * i_763_;
                            } else
                                i_762_ -= i_763_;
                            if (i_760_ < i_762_)
                                i_760_ = i_762_;
                            for (/**/; i_760_ < 0; i_760_++) {
                                int i_764_
                                        = (this
                                        .anIntArray9933
                                        [(((i_759_ >> 12)
                                        * this.anInt8471)
                                        + (i_758_ >> 12))]);
                                if (i_764_ != 0)
                                    is_754_[i_757_++] = i_764_;
                                else
                                    i_757_++;
                            }
                        }
                    }
                    i_755_++;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_765_ = Class105_Sub3.anInt8468;
                while (i_765_ < 0) {
                    int i_766_ = i_765_ + i_753_;
                    if (i_766_ >= 0) {
                        if (i_766_ >= is.length)
                            break;
                        int i_767_ = Class105_Sub3.anInt8451;
                        int i_768_ = Class105_Sub3.anInt8458;
                        int i_769_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_770_ = Class105_Sub3.anInt8478;
                        if (i_768_ >= 0
                                && i_768_ - (this.anInt8471
                                << 12) < 0) {
                            int i_771_;
                            if ((i_771_
                                    = i_769_ - (this.anInt8470
                                    << 12))
                                    >= 0) {
                                i_771_ = ((Class105_Sub3.anInt8450 - i_771_)
                                        / Class105_Sub3.anInt8450);
                                i_770_ += i_771_;
                                i_769_ += Class105_Sub3.anInt8450 * i_771_;
                                i_767_ += i_771_;
                            }
                            if ((i_771_ = ((i_769_ - Class105_Sub3.anInt8450)
                                    / Class105_Sub3.anInt8450))
                                    > i_770_)
                                i_770_ = i_771_;
                            int i_772_ = is[i_766_] - i;
                            int i_773_ = -is_752_[i_766_];
                            int i_774_
                                    = i_772_ - (i_767_ - Class105_Sub3.anInt8451);
                            if (i_774_ > 0) {
                                i_767_ += i_774_;
                                i_770_ += i_774_;
                                i_768_ += Class105_Sub3.anInt8481 * i_774_;
                                i_769_ += Class105_Sub3.anInt8450 * i_774_;
                            } else
                                i_773_ -= i_774_;
                            if (i_770_ < i_773_)
                                i_770_ = i_773_;
                            for (/**/; i_770_ < 0; i_770_++) {
                                int i_775_
                                        = (this
                                        .anIntArray9933
                                        [(((i_769_ >> 12)
                                        * this.anInt8471)
                                        + (i_768_ >> 12))]);
                                if (i_775_ != 0)
                                    is_754_[i_767_++] = i_775_;
                                else
                                    i_767_++;
                                i_769_ += Class105_Sub3.anInt8450;
                            }
                        }
                    }
                    i_765_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_776_ = Class105_Sub3.anInt8468;
                while (i_776_ < 0) {
                    int i_777_ = i_776_ + i_753_;
                    if (i_777_ >= 0) {
                        if (i_777_ >= is.length)
                            break;
                        int i_778_ = Class105_Sub3.anInt8451;
                        int i_779_ = Class105_Sub3.anInt8458;
                        int i_780_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_781_ = Class105_Sub3.anInt8478;
                        if (i_779_ >= 0
                                && i_779_ - (this.anInt8471
                                << 12) < 0) {
                            if (i_780_ < 0) {
                                int i_782_
                                        = ((Class105_Sub3.anInt8450 - 1 - i_780_)
                                        / Class105_Sub3.anInt8450);
                                i_781_ += i_782_;
                                i_780_ += Class105_Sub3.anInt8450 * i_782_;
                                i_778_ += i_782_;
                            }
                            int i_783_;
                            if ((i_783_
                                    = ((1 + i_780_
                                    - (this.anInt8470 << 12)
                                    - Class105_Sub3.anInt8450)
                                    / Class105_Sub3.anInt8450))
                                    > i_781_)
                                i_781_ = i_783_;
                            int i_784_ = is[i_777_] - i;
                            int i_785_ = -is_752_[i_777_];
                            int i_786_
                                    = i_784_ - (i_778_ - Class105_Sub3.anInt8451);
                            if (i_786_ > 0) {
                                i_778_ += i_786_;
                                i_781_ += i_786_;
                                i_779_ += Class105_Sub3.anInt8481 * i_786_;
                                i_780_ += Class105_Sub3.anInt8450 * i_786_;
                            } else
                                i_785_ -= i_786_;
                            if (i_781_ < i_785_)
                                i_781_ = i_785_;
                            for (/**/; i_781_ < 0; i_781_++) {
                                int i_787_
                                        = (this
                                        .anIntArray9933
                                        [(((i_780_ >> 12)
                                        * this.anInt8471)
                                        + (i_779_ >> 12))]);
                                if (i_787_ != 0)
                                    is_754_[i_778_++] = i_787_;
                                else
                                    i_778_++;
                                i_780_ += Class105_Sub3.anInt8450;
                            }
                        }
                    }
                    i_776_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8481 < 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_788_ = Class105_Sub3.anInt8468;
                while (i_788_ < 0) {
                    int i_789_ = i_788_ + i_753_;
                    if (i_789_ >= 0) {
                        if (i_789_ >= is.length)
                            break;
                        int i_790_ = Class105_Sub3.anInt8451;
                        int i_791_ = (Class105_Sub3.anInt8458
                                + Class105_Sub3.anInt8479);
                        int i_792_ = Class105_Sub3.anInt8467;
                        int i_793_ = Class105_Sub3.anInt8478;
                        if (i_792_ >= 0
                                && i_792_ - (this.anInt8470
                                << 12) < 0) {
                            int i_794_;
                            if ((i_794_
                                    = i_791_ - (this.anInt8471
                                    << 12))
                                    >= 0) {
                                i_794_ = ((Class105_Sub3.anInt8481 - i_794_)
                                        / Class105_Sub3.anInt8481);
                                i_793_ += i_794_;
                                i_791_ += Class105_Sub3.anInt8481 * i_794_;
                                i_790_ += i_794_;
                            }
                            if ((i_794_ = ((i_791_ - Class105_Sub3.anInt8481)
                                    / Class105_Sub3.anInt8481))
                                    > i_793_)
                                i_793_ = i_794_;
                            int i_795_ = is[i_789_] - i;
                            int i_796_ = -is_752_[i_789_];
                            int i_797_
                                    = i_795_ - (i_790_ - Class105_Sub3.anInt8451);
                            if (i_797_ > 0) {
                                i_790_ += i_797_;
                                i_793_ += i_797_;
                                i_791_ += Class105_Sub3.anInt8481 * i_797_;
                                i_792_ += Class105_Sub3.anInt8450 * i_797_;
                            } else
                                i_796_ -= i_797_;
                            if (i_793_ < i_796_)
                                i_793_ = i_796_;
                            for (/**/; i_793_ < 0; i_793_++) {
                                int i_798_
                                        = (this
                                        .anIntArray9933
                                        [(((i_792_ >> 12)
                                        * this.anInt8471)
                                        + (i_791_ >> 12))]);
                                if (i_798_ != 0)
                                    is_754_[i_790_++] = i_798_;
                                else
                                    i_790_++;
                                i_791_ += Class105_Sub3.anInt8481;
                            }
                        }
                    }
                    i_788_++;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_799_ = Class105_Sub3.anInt8468;
                while (i_799_ < 0) {
                    int i_800_ = i_799_ + i_753_;
                    if (i_800_ >= 0) {
                        if (i_800_ >= is.length)
                            break;
                        int i_801_ = Class105_Sub3.anInt8451;
                        int i_802_ = (Class105_Sub3.anInt8458
                                + Class105_Sub3.anInt8479);
                        int i_803_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_804_ = Class105_Sub3.anInt8478;
                        int i_805_;
                        if ((i_805_
                                = i_802_ - (this.anInt8471
                                << 12))
                                >= 0) {
                            i_805_ = ((Class105_Sub3.anInt8481 - i_805_)
                                    / Class105_Sub3.anInt8481);
                            i_804_ += i_805_;
                            i_802_ += Class105_Sub3.anInt8481 * i_805_;
                            i_803_ += Class105_Sub3.anInt8450 * i_805_;
                            i_801_ += i_805_;
                        }
                        if ((i_805_ = ((i_802_ - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_804_)
                            i_804_ = i_805_;
                        if ((i_805_
                                = i_803_ - (this.anInt8470
                                << 12))
                                >= 0) {
                            i_805_ = ((Class105_Sub3.anInt8450 - i_805_)
                                    / Class105_Sub3.anInt8450);
                            i_804_ += i_805_;
                            i_802_ += Class105_Sub3.anInt8481 * i_805_;
                            i_803_ += Class105_Sub3.anInt8450 * i_805_;
                            i_801_ += i_805_;
                        }
                        if ((i_805_ = ((i_803_ - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_804_)
                            i_804_ = i_805_;
                        int i_806_ = is[i_800_] - i;
                        int i_807_ = -is_752_[i_800_];
                        int i_808_
                                = i_806_ - (i_801_ - Class105_Sub3.anInt8451);
                        if (i_808_ > 0) {
                            i_801_ += i_808_;
                            i_804_ += i_808_;
                            i_802_ += Class105_Sub3.anInt8481 * i_808_;
                            i_803_ += Class105_Sub3.anInt8450 * i_808_;
                        } else
                            i_807_ -= i_808_;
                        if (i_804_ < i_807_)
                            i_804_ = i_807_;
                        for (/**/; i_804_ < 0; i_804_++) {
                            int i_809_
                                    = (this.anIntArray9933
                                    [(((i_803_ >> 12)
                                    * this.anInt8471)
                                    + (i_802_ >> 12))]);
                            if (i_809_ != 0)
                                is_754_[i_801_++] = i_809_;
                            else
                                i_801_++;
                            i_802_ += Class105_Sub3.anInt8481;
                            i_803_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_799_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_810_ = Class105_Sub3.anInt8468;
                while (i_810_ < 0) {
                    int i_811_ = i_810_ + i_753_;
                    if (i_811_ >= 0) {
                        if (i_811_ >= is.length)
                            break;
                        int i_812_ = Class105_Sub3.anInt8451;
                        int i_813_ = (Class105_Sub3.anInt8458
                                + Class105_Sub3.anInt8479);
                        int i_814_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_815_ = Class105_Sub3.anInt8478;
                        int i_816_;
                        if ((i_816_
                                = i_813_ - (this.anInt8471
                                << 12))
                                >= 0) {
                            i_816_ = ((Class105_Sub3.anInt8481 - i_816_)
                                    / Class105_Sub3.anInt8481);
                            i_815_ += i_816_;
                            i_813_ += Class105_Sub3.anInt8481 * i_816_;
                            i_814_ += Class105_Sub3.anInt8450 * i_816_;
                            i_812_ += i_816_;
                        }
                        if ((i_816_ = ((i_813_ - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_815_)
                            i_815_ = i_816_;
                        if (i_814_ < 0) {
                            i_816_ = ((Class105_Sub3.anInt8450 - 1 - i_814_)
                                    / Class105_Sub3.anInt8450);
                            i_815_ += i_816_;
                            i_813_ += Class105_Sub3.anInt8481 * i_816_;
                            i_814_ += Class105_Sub3.anInt8450 * i_816_;
                            i_812_ += i_816_;
                        }
                        if ((i_816_
                                = ((1 + i_814_
                                - (this.anInt8470 << 12)
                                - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_815_)
                            i_815_ = i_816_;
                        int i_817_ = is[i_811_] - i;
                        int i_818_ = -is_752_[i_811_];
                        int i_819_
                                = i_817_ - (i_812_ - Class105_Sub3.anInt8451);
                        if (i_819_ > 0) {
                            i_812_ += i_819_;
                            i_815_ += i_819_;
                            i_813_ += Class105_Sub3.anInt8481 * i_819_;
                            i_814_ += Class105_Sub3.anInt8450 * i_819_;
                        } else
                            i_818_ -= i_819_;
                        if (i_815_ < i_818_)
                            i_815_ = i_818_;
                        for (/**/; i_815_ < 0; i_815_++) {
                            int i_820_
                                    = (this.anIntArray9933
                                    [(((i_814_ >> 12)
                                    * this.anInt8471)
                                    + (i_813_ >> 12))]);
                            if (i_820_ != 0)
                                is_754_[i_812_++] = i_820_;
                            else
                                i_812_++;
                            i_813_ += Class105_Sub3.anInt8481;
                            i_814_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_810_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8450 == 0) {
            int i_821_ = Class105_Sub3.anInt8468;
            while (i_821_ < 0) {
                int i_822_ = i_821_ + i_753_;
                if (i_822_ >= 0) {
                    if (i_822_ >= is.length)
                        break;
                    int i_823_ = Class105_Sub3.anInt8451;
                    int i_824_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_825_ = Class105_Sub3.anInt8467;
                    int i_826_ = Class105_Sub3.anInt8478;
                    if (i_825_ >= 0
                            && (i_825_ - (this.anInt8470 << 12)
                            < 0)) {
                        if (i_824_ < 0) {
                            int i_827_
                                    = ((Class105_Sub3.anInt8481 - 1 - i_824_)
                                    / Class105_Sub3.anInt8481);
                            i_826_ += i_827_;
                            i_824_ += Class105_Sub3.anInt8481 * i_827_;
                            i_823_ += i_827_;
                        }
                        int i_828_;
                        if ((i_828_
                                = ((1 + i_824_
                                - (this.anInt8471 << 12)
                                - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_826_)
                            i_826_ = i_828_;
                        int i_829_ = is[i_822_] - i;
                        int i_830_ = -is_752_[i_822_];
                        int i_831_
                                = i_829_ - (i_823_ - Class105_Sub3.anInt8451);
                        if (i_831_ > 0) {
                            i_823_ += i_831_;
                            i_826_ += i_831_;
                            i_824_ += Class105_Sub3.anInt8481 * i_831_;
                            i_825_ += Class105_Sub3.anInt8450 * i_831_;
                        } else
                            i_830_ -= i_831_;
                        if (i_826_ < i_830_)
                            i_826_ = i_830_;
                        for (/**/; i_826_ < 0; i_826_++) {
                            int i_832_
                                    = (this.anIntArray9933
                                    [(((i_825_ >> 12)
                                    * this.anInt8471)
                                    + (i_824_ >> 12))]);
                            if (i_832_ != 0)
                                is_754_[i_823_++] = i_832_;
                            else
                                i_823_++;
                            i_824_ += Class105_Sub3.anInt8481;
                        }
                    }
                }
                i_821_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else if (Class105_Sub3.anInt8450 < 0) {
            int i_833_ = Class105_Sub3.anInt8468;
            while (i_833_ < 0) {
                int i_834_ = i_833_ + i_753_;
                if (i_834_ >= 0) {
                    if (i_834_ >= is.length)
                        break;
                    int i_835_ = Class105_Sub3.anInt8451;
                    int i_836_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_837_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_838_ = Class105_Sub3.anInt8478;
                    if (i_836_ < 0) {
                        int i_839_ = ((Class105_Sub3.anInt8481 - 1 - i_836_)
                                / Class105_Sub3.anInt8481);
                        i_838_ += i_839_;
                        i_836_ += Class105_Sub3.anInt8481 * i_839_;
                        i_837_ += Class105_Sub3.anInt8450 * i_839_;
                        i_835_ += i_839_;
                    }
                    int i_840_;
                    if ((i_840_ = ((1 + i_836_
                            - (this.anInt8471 << 12)
                            - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_838_)
                        i_838_ = i_840_;
                    if ((i_840_
                            = i_837_ - (this.anInt8470 << 12))
                            >= 0) {
                        i_840_ = ((Class105_Sub3.anInt8450 - i_840_)
                                / Class105_Sub3.anInt8450);
                        i_838_ += i_840_;
                        i_836_ += Class105_Sub3.anInt8481 * i_840_;
                        i_837_ += Class105_Sub3.anInt8450 * i_840_;
                        i_835_ += i_840_;
                    }
                    if ((i_840_ = ((i_837_ - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_838_)
                        i_838_ = i_840_;
                    int i_841_ = is[i_834_] - i;
                    int i_842_ = -is_752_[i_834_];
                    int i_843_ = i_841_ - (i_835_ - Class105_Sub3.anInt8451);
                    if (i_843_ > 0) {
                        i_835_ += i_843_;
                        i_838_ += i_843_;
                        i_836_ += Class105_Sub3.anInt8481 * i_843_;
                        i_837_ += Class105_Sub3.anInt8450 * i_843_;
                    } else
                        i_842_ -= i_843_;
                    if (i_838_ < i_842_)
                        i_838_ = i_842_;
                    for (/**/; i_838_ < 0; i_838_++) {
                        int i_844_
                                = (this.anIntArray9933
                                [(((i_837_ >> 12)
                                * this.anInt8471)
                                + (i_836_ >> 12))]);
                        if (i_844_ != 0)
                            is_754_[i_835_++] = i_844_;
                        else
                            i_835_++;
                        i_836_ += Class105_Sub3.anInt8481;
                        i_837_ += Class105_Sub3.anInt8450;
                    }
                }
                i_833_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else {
            int i_845_ = Class105_Sub3.anInt8468;
            while (i_845_ < 0) {
                int i_846_ = i_845_ + i_753_;
                if (i_846_ >= 0) {
                    if (i_846_ >= is.length)
                        break;
                    int i_847_ = Class105_Sub3.anInt8451;
                    int i_848_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_849_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_850_ = Class105_Sub3.anInt8478;
                    if (i_848_ < 0) {
                        int i_851_ = ((Class105_Sub3.anInt8481 - 1 - i_848_)
                                / Class105_Sub3.anInt8481);
                        i_850_ += i_851_;
                        i_848_ += Class105_Sub3.anInt8481 * i_851_;
                        i_849_ += Class105_Sub3.anInt8450 * i_851_;
                        i_847_ += i_851_;
                    }
                    int i_852_;
                    if ((i_852_ = ((1 + i_848_
                            - (this.anInt8471 << 12)
                            - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_850_)
                        i_850_ = i_852_;
                    if (i_849_ < 0) {
                        i_852_ = ((Class105_Sub3.anInt8450 - 1 - i_849_)
                                / Class105_Sub3.anInt8450);
                        i_850_ += i_852_;
                        i_848_ += Class105_Sub3.anInt8481 * i_852_;
                        i_849_ += Class105_Sub3.anInt8450 * i_852_;
                        i_847_ += i_852_;
                    }
                    if ((i_852_ = ((1 + i_849_
                            - (this.anInt8470 << 12)
                            - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_850_)
                        i_850_ = i_852_;
                    int i_853_ = is[i_846_] - i;
                    int i_854_ = -is_752_[i_846_];
                    int i_855_ = i_853_ - (i_847_ - Class105_Sub3.anInt8451);
                    if (i_855_ > 0) {
                        i_847_ += i_855_;
                        i_850_ += i_855_;
                        i_848_ += Class105_Sub3.anInt8481 * i_855_;
                        i_849_ += Class105_Sub3.anInt8450 * i_855_;
                    } else
                        i_854_ -= i_855_;
                    if (i_850_ < i_854_)
                        i_850_ = i_854_;
                    for (/**/; i_850_ < 0; i_850_++) {
                        int i_856_
                                = (this.anIntArray9933
                                [(((i_849_ >> 12)
                                * this.anInt8471)
                                + (i_848_ >> 12))]);
                        if (i_856_ != 0)
                            is_754_[i_847_++] = i_856_;
                        else
                            i_847_++;
                        i_848_ += Class105_Sub3.anInt8481;
                        i_849_ += Class105_Sub3.anInt8450;
                    }
                }
                i_845_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        }
    }

    final void method963(int i, int i_857_, aa var_aa, int i_858_,
                         int i_859_) {
        if (this.aHa_Sub1_8460.method3716())
            throw new IllegalStateException();
        i += this.anInt8461;
        i_857_ += this.anInt8464;
        int i_860_ = 0;
        int i_861_
                = this.aHa_Sub1_8460.anInt7477;
        int i_862_ = this.anInt8471;
        int i_863_ = this.anInt8470;
        int i_864_ = i_861_ - i_862_;
        int i_865_ = 0;
        int i_866_ = i + i_857_ * i_861_;
        if (i_857_
                < this.aHa_Sub1_8460.anInt7476) {
            int i_867_
                    = (this.aHa_Sub1_8460.anInt7476
                    - i_857_);
            i_863_ -= i_867_;
            i_857_
                    = this.aHa_Sub1_8460.anInt7476;
            i_860_ += i_867_ * i_862_;
            i_866_ += i_867_ * i_861_;
        }
        if (i_857_ + i_863_
                > this.aHa_Sub1_8460.anInt7503)
            i_863_ -= i_857_ + i_863_ - this
                    .aHa_Sub1_8460.anInt7503;
        if (i < this.aHa_Sub1_8460.anInt7496) {
            int i_868_
                    = (this.aHa_Sub1_8460.anInt7496
                    - i);
            i_862_ -= i_868_;
            i = this.aHa_Sub1_8460.anInt7496;
            i_860_ += i_868_;
            i_866_ += i_868_;
            i_865_ += i_868_;
            i_864_ += i_868_;
        }
        if (i + i_862_
                > this.aHa_Sub1_8460.anInt7507) {
            int i_869_ = (i + i_862_
                    - (this.aHa_Sub1_8460
                    .anInt7507));
            i_862_ -= i_869_;
            i_865_ += i_869_;
            i_864_ += i_869_;
        }
        if (i_862_ > 0 && i_863_ > 0) {
            aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
            int[] is = var_aa_Sub3.anIntArray5201;
            int[] is_870_ = var_aa_Sub3.anIntArray5202;
            int[] is_871_ = (this.aHa_Sub1_8460
                    .anIntArray7483);
            int i_872_ = i_857_;
            if (i_859_ > i_872_) {
                i_872_ = i_859_;
                i_866_ += (i_859_ - i_857_) * i_861_;
                i_860_ += (i_859_ - i_857_) * this.anInt8471;
            }
            int i_873_ = (i_859_ + is.length < i_857_ + i_863_
                    ? i_859_ + is.length : i_857_ + i_863_);
            for (int i_874_ = i_872_; i_874_ < i_873_; i_874_++) {
                int i_875_ = is[i_874_ - i_859_] + i_858_;
                int i_876_ = is_870_[i_874_ - i_859_];
                int i_877_ = i_862_;
                if (i > i_875_) {
                    int i_878_ = i - i_875_;
                    if (i_878_ >= i_876_) {
                        i_860_ += i_862_ + i_865_;
                        i_866_ += i_862_ + i_864_;
                        continue;
                    }
                    i_876_ -= i_878_;
                } else {
                    int i_879_ = i_875_ - i;
                    if (i_879_ >= i_862_) {
                        i_860_ += i_862_ + i_865_;
                        i_866_ += i_862_ + i_864_;
                        continue;
                    }
                    i_860_ += i_879_;
                    i_877_ -= i_879_;
                    i_866_ += i_879_;
                }
                int i_880_ = 0;
                if (i_877_ < i_876_)
                    i_876_ = i_877_;
                else
                    i_880_ = i_877_ - i_876_;
                for (int i_881_ = -i_876_; i_881_ < 0; i_881_++) {
                    int i_882_
                            = this.anIntArray9933[i_860_++];
                    if (i_882_ != 0)
                        is_871_[i_866_++] = i_882_;
                    else
                        i_866_++;
                }
                i_860_ += i_880_ + i_865_;
                i_866_ += i_880_ + i_864_;
            }
        }
    }

    final void method964(int i, int i_883_, int i_884_, int i_885_,
                         int i_886_) {
        if (this.aHa_Sub1_8460.method3716())
            throw new IllegalStateException();
        int i_887_
                = this.aHa_Sub1_8460.anInt7477;
        i += this.anInt8461;
        i_883_ += this.anInt8464;
        int i_888_ = i_883_ * i_887_ + i;
        int i_889_ = 0;
        int i_890_ = this.anInt8470;
        int i_891_ = this.anInt8471;
        int i_892_ = i_887_ - i_891_;
        int i_893_ = 0;
        if (i_883_
                < this.aHa_Sub1_8460.anInt7476) {
            int i_894_
                    = (this.aHa_Sub1_8460.anInt7476
                    - i_883_);
            i_890_ -= i_894_;
            i_883_
                    = this.aHa_Sub1_8460.anInt7476;
            i_889_ += i_894_ * i_891_;
            i_888_ += i_894_ * i_887_;
        }
        if (i_883_ + i_890_
                > this.aHa_Sub1_8460.anInt7503)
            i_890_ -= i_883_ + i_890_ - this
                    .aHa_Sub1_8460.anInt7503;
        if (i < this.aHa_Sub1_8460.anInt7496) {
            int i_895_
                    = (this.aHa_Sub1_8460.anInt7496
                    - i);
            i_891_ -= i_895_;
            i = this.aHa_Sub1_8460.anInt7496;
            i_889_ += i_895_;
            i_888_ += i_895_;
            i_893_ += i_895_;
            i_892_ += i_895_;
        }
        if (i + i_891_
                > this.aHa_Sub1_8460.anInt7507) {
            int i_896_ = (i + i_891_
                    - (this.aHa_Sub1_8460
                    .anInt7507));
            i_891_ -= i_896_;
            i_893_ += i_896_;
            i_892_ += i_896_;
        }
        if (i_891_ > 0 && i_890_ > 0) {
            int[] is = (this.aHa_Sub1_8460
                    .anIntArray7483);
            if (i_886_ == 0) {
                if (i_884_ == 1) {
                    for (int i_897_ = -i_890_; i_897_ < 0; i_897_++) {
                        int i_898_ = i_888_ + i_891_ - 3;
                        while (i_888_ < i_898_) {
                            is[i_888_++] = (this
                                    .anIntArray9933[i_889_++]);
                            is[i_888_++] = (this
                                    .anIntArray9933[i_889_++]);
                            is[i_888_++] = (this
                                    .anIntArray9933[i_889_++]);
                            is[i_888_++] = (this
                                    .anIntArray9933[i_889_++]);
                        }
                        i_898_ += 3;
                        while (i_888_ < i_898_)
                            is[i_888_++] = (this
                                    .anIntArray9933[i_889_++]);
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                if (i_884_ == 0) {
                    int i_899_ = (i_885_ & 0xff0000) >> 16;
                    int i_900_ = (i_885_ & 0xff00) >> 8;
                    int i_901_ = i_885_ & 0xff;
                    for (int i_902_ = -i_890_; i_902_ < 0; i_902_++) {
                        for (int i_903_ = -i_891_; i_903_ < 0; i_903_++) {
                            int i_904_ = (this
                                    .anIntArray9933[i_889_++]);
                            int i_905_
                                    = (i_904_ & 0xff0000) * i_899_ & ~0xffffff;
                            int i_906_ = (i_904_ & 0xff00) * i_900_ & 0xff0000;
                            int i_907_ = (i_904_ & 0xff) * i_901_ & 0xff00;
                            is[i_888_++] = (i_905_ | i_906_ | i_907_) >>> 8;
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                if (i_884_ == 3) {
                    for (int i_908_ = -i_890_; i_908_ < 0; i_908_++) {
                        for (int i_909_ = -i_891_; i_909_ < 0; i_909_++) {
                            int i_910_ = (this
                                    .anIntArray9933[i_889_++]);
                            int i_911_ = i_910_ + i_885_;
                            int i_912_
                                    = (i_910_ & 0xff00ff) + (i_885_ & 0xff00ff);
                            int i_913_ = ((i_912_ & 0x1000100)
                                    + (i_911_ - i_912_ & 0x10000));
                            is[i_888_++]
                                    = i_911_ - i_913_ | i_913_ - (i_913_ >>> 8);
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                if (i_884_ == 2) {
                    int i_914_ = i_885_ >>> 24;
                    int i_915_ = 256 - i_914_;
                    int i_916_ = (i_885_ & 0xff00ff) * i_915_ & ~0xff00ff;
                    int i_917_ = (i_885_ & 0xff00) * i_915_ & 0xff0000;
                    i_885_ = (i_916_ | i_917_) >>> 8;
                    for (int i_918_ = -i_890_; i_918_ < 0; i_918_++) {
                        for (int i_919_ = -i_891_; i_919_ < 0; i_919_++) {
                            int i_920_ = (this
                                    .anIntArray9933[i_889_++]);
                            i_916_ = (i_920_ & 0xff00ff) * i_914_ & ~0xff00ff;
                            i_917_ = (i_920_ & 0xff00) * i_914_ & 0xff0000;
                            is[i_888_++] = ((i_916_ | i_917_) >>> 8) + i_885_;
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_886_ == 1) {
                if (i_884_ == 1) {
                    for (int i_921_ = -i_890_; i_921_ < 0; i_921_++) {
                        int i_922_ = i_888_ + i_891_ - 3;
                        while (i_888_ < i_922_) {
                            int i_923_ = (this
                                    .anIntArray9933[i_889_++]);
                            if (i_923_ != 0)
                                is[i_888_++] = i_923_;
                            else
                                i_888_++;
                            i_923_ = (this
                                    .anIntArray9933[i_889_++]);
                            if (i_923_ != 0)
                                is[i_888_++] = i_923_;
                            else
                                i_888_++;
                            i_923_ = (this
                                    .anIntArray9933[i_889_++]);
                            if (i_923_ != 0)
                                is[i_888_++] = i_923_;
                            else
                                i_888_++;
                            i_923_ = (this
                                    .anIntArray9933[i_889_++]);
                            if (i_923_ != 0)
                                is[i_888_++] = i_923_;
                            else
                                i_888_++;
                        }
                        i_922_ += 3;
                        while (i_888_ < i_922_) {
                            int i_924_ = (this
                                    .anIntArray9933[i_889_++]);
                            if (i_924_ != 0)
                                is[i_888_++] = i_924_;
                            else
                                i_888_++;
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                if (i_884_ == 0) {
                    if ((i_885_ & 0xffffff) == 16777215) {
                        int i_925_ = i_885_ >>> 24;
                        int i_926_ = 256 - i_925_;
                        for (int i_927_ = -i_890_; i_927_ < 0; i_927_++) {
                            for (int i_928_ = -i_891_; i_928_ < 0; i_928_++) {
                                int i_929_ = (this
                                        .anIntArray9933[i_889_++]);
                                if (i_929_ != 0) {
                                    int i_930_ = is[i_888_];
                                    is[i_888_++]
                                            = ((((i_929_ & 0xff00ff) * i_925_
                                            + (i_930_ & 0xff00ff) * i_926_)
                                            & ~0xff00ff)
                                            + (((i_929_ & 0xff00) * i_925_
                                            + (i_930_ & 0xff00) * i_926_)
                                            & 0xff0000)) >> 8;
                                } else
                                    i_888_++;
                            }
                            i_888_ += i_892_;
                            i_889_ += i_893_;
                        }
                    } else {
                        int i_931_ = (i_885_ & 0xff0000) >> 16;
                        int i_932_ = (i_885_ & 0xff00) >> 8;
                        int i_933_ = i_885_ & 0xff;
                        int i_934_ = i_885_ >>> 24;
                        int i_935_ = 256 - i_934_;
                        for (int i_936_ = -i_890_; i_936_ < 0; i_936_++) {
                            for (int i_937_ = -i_891_; i_937_ < 0; i_937_++) {
                                int i_938_ = (this
                                        .anIntArray9933[i_889_++]);
                                if (i_938_ != 0) {
                                    if (i_934_ != 255) {
                                        int i_939_
                                                = ((i_938_ & 0xff0000) * i_931_
                                                & ~0xffffff);
                                        int i_940_
                                                = ((i_938_ & 0xff00) * i_932_
                                                & 0xff0000);
                                        int i_941_ = ((i_938_ & 0xff) * i_933_
                                                & 0xff00);
                                        i_938_
                                                = (i_939_ | i_940_ | i_941_) >>> 8;
                                        int i_942_ = is[i_888_];
                                        is[i_888_++]
                                                = ((((i_938_ & 0xff00ff) * i_934_
                                                + ((i_942_ & 0xff00ff)
                                                * i_935_))
                                                & ~0xff00ff)
                                                + (((i_938_ & 0xff00) * i_934_
                                                + ((i_942_ & 0xff00)
                                                * i_935_))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_943_
                                                = ((i_938_ & 0xff0000) * i_931_
                                                & ~0xffffff);
                                        int i_944_
                                                = ((i_938_ & 0xff00) * i_932_
                                                & 0xff0000);
                                        int i_945_ = ((i_938_ & 0xff) * i_933_
                                                & 0xff00);
                                        is[i_888_++]
                                                = (i_943_ | i_944_ | i_945_) >>> 8;
                                    }
                                } else
                                    i_888_++;
                            }
                            i_888_ += i_892_;
                            i_889_ += i_893_;
                        }
                        return;
                    }
                    return;
                }
                if (i_884_ == 3) {
                    int i_946_ = i_885_ >>> 24;
                    int i_947_ = 256 - i_946_;
                    for (int i_948_ = -i_890_; i_948_ < 0; i_948_++) {
                        for (int i_949_ = -i_891_; i_949_ < 0; i_949_++) {
                            int i_950_ = (this
                                    .anIntArray9933[i_889_++]);
                            int i_951_ = i_950_ + i_885_;
                            int i_952_
                                    = (i_950_ & 0xff00ff) + (i_885_ & 0xff00ff);
                            int i_953_ = ((i_952_ & 0x1000100)
                                    + (i_951_ - i_952_ & 0x10000));
                            i_953_ = i_951_ - i_953_ | i_953_ - (i_953_ >>> 8);
                            if (i_950_ == 0 && i_946_ != 255) {
                                i_950_ = i_953_;
                                i_953_ = is[i_888_];
                                i_953_ = ((((i_950_ & 0xff00ff) * i_946_
                                        + (i_953_ & 0xff00ff) * i_947_)
                                        & ~0xff00ff)
                                        + (((i_950_ & 0xff00) * i_946_
                                        + (i_953_ & 0xff00) * i_947_)
                                        & 0xff0000)) >> 8;
                            }
                            is[i_888_++] = i_953_;
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                if (i_884_ == 2) {
                    int i_954_ = i_885_ >>> 24;
                    int i_955_ = 256 - i_954_;
                    int i_956_ = (i_885_ & 0xff00ff) * i_955_ & ~0xff00ff;
                    int i_957_ = (i_885_ & 0xff00) * i_955_ & 0xff0000;
                    i_885_ = (i_956_ | i_957_) >>> 8;
                    for (int i_958_ = -i_890_; i_958_ < 0; i_958_++) {
                        for (int i_959_ = -i_891_; i_959_ < 0; i_959_++) {
                            int i_960_ = (this
                                    .anIntArray9933[i_889_++]);
                            if (i_960_ != 0) {
                                i_956_
                                        = (i_960_ & 0xff00ff) * i_954_ & ~0xff00ff;
                                i_957_ = (i_960_ & 0xff00) * i_954_ & 0xff0000;
                                is[i_888_++]
                                        = ((i_956_ | i_957_) >>> 8) + i_885_;
                            } else
                                i_888_++;
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_886_ == 2) {
                if (i_884_ == 1) {
                    for (int i_961_ = -i_890_; i_961_ < 0; i_961_++) {
                        for (int i_962_ = -i_891_; i_962_ < 0; i_962_++) {
                            int i_963_ = (this
                                    .anIntArray9933[i_889_++]);
                            if (i_963_ != 0) {
                                int i_964_ = is[i_888_];
                                int i_965_ = i_963_ + i_964_;
                                int i_966_ = ((i_963_ & 0xff00ff)
                                        + (i_964_ & 0xff00ff));
                                i_964_
                                        = (i_966_ & 0x1000100) + (i_965_ - i_966_
                                        & 0x10000);
                                is[i_888_++]
                                        = i_965_ - i_964_ | i_964_ - (i_964_
                                        >>> 8);
                            } else
                                i_888_++;
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                if (i_884_ == 0) {
                    int i_967_ = (i_885_ & 0xff0000) >> 16;
                    int i_968_ = (i_885_ & 0xff00) >> 8;
                    int i_969_ = i_885_ & 0xff;
                    for (int i_970_ = -i_890_; i_970_ < 0; i_970_++) {
                        for (int i_971_ = -i_891_; i_971_ < 0; i_971_++) {
                            int i_972_ = (this
                                    .anIntArray9933[i_889_++]);
                            if (i_972_ != 0) {
                                int i_973_
                                        = (i_972_ & 0xff0000) * i_967_ & ~0xffffff;
                                int i_974_
                                        = (i_972_ & 0xff00) * i_968_ & 0xff0000;
                                int i_975_ = (i_972_ & 0xff) * i_969_ & 0xff00;
                                i_972_ = (i_973_ | i_974_ | i_975_) >>> 8;
                                int i_976_ = is[i_888_];
                                int i_977_ = i_972_ + i_976_;
                                int i_978_ = ((i_972_ & 0xff00ff)
                                        + (i_976_ & 0xff00ff));
                                i_976_
                                        = (i_978_ & 0x1000100) + (i_977_ - i_978_
                                        & 0x10000);
                                is[i_888_++]
                                        = i_977_ - i_976_ | i_976_ - (i_976_
                                        >>> 8);
                            } else
                                i_888_++;
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                if (i_884_ == 3) {
                    for (int i_979_ = -i_890_; i_979_ < 0; i_979_++) {
                        for (int i_980_ = -i_891_; i_980_ < 0; i_980_++) {
                            int i_981_ = (this
                                    .anIntArray9933[i_889_++]);
                            int i_982_ = i_981_ + i_885_;
                            int i_983_
                                    = (i_981_ & 0xff00ff) + (i_885_ & 0xff00ff);
                            int i_984_ = ((i_983_ & 0x1000100)
                                    + (i_982_ - i_983_ & 0x10000));
                            i_981_ = i_982_ - i_984_ | i_984_ - (i_984_ >>> 8);
                            i_984_ = is[i_888_];
                            i_982_ = i_981_ + i_984_;
                            i_983_ = (i_981_ & 0xff00ff) + (i_984_ & 0xff00ff);
                            i_984_ = (i_983_ & 0x1000100) + (i_982_ - i_983_
                                    & 0x10000);
                            is[i_888_++]
                                    = i_982_ - i_984_ | i_984_ - (i_984_ >>> 8);
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                if (i_884_ == 2) {
                    int i_985_ = i_885_ >>> 24;
                    int i_986_ = 256 - i_985_;
                    int i_987_ = (i_885_ & 0xff00ff) * i_986_ & ~0xff00ff;
                    int i_988_ = (i_885_ & 0xff00) * i_986_ & 0xff0000;
                    i_885_ = (i_987_ | i_988_) >>> 8;
                    for (int i_989_ = -i_890_; i_989_ < 0; i_989_++) {
                        for (int i_990_ = -i_891_; i_990_ < 0; i_990_++) {
                            int i_991_ = (this
                                    .anIntArray9933[i_889_++]);
                            if (i_991_ != 0) {
                                i_987_
                                        = (i_991_ & 0xff00ff) * i_985_ & ~0xff00ff;
                                i_988_ = (i_991_ & 0xff00) * i_985_ & 0xff0000;
                                i_991_ = ((i_987_ | i_988_) >>> 8) + i_885_;
                                int i_992_ = is[i_888_];
                                int i_993_ = i_991_ + i_992_;
                                int i_994_ = ((i_991_ & 0xff00ff)
                                        + (i_992_ & 0xff00ff));
                                i_992_
                                        = (i_994_ & 0x1000100) + (i_993_ - i_994_
                                        & 0x10000);
                                is[i_888_++]
                                        = i_993_ - i_992_ | i_992_ - (i_992_
                                        >>> 8);
                            } else
                                i_888_++;
                        }
                        i_888_ += i_892_;
                        i_889_ += i_893_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method996(int i, int i_995_, int i_996_, int i_997_, int i_998_,
                         int i_999_, int i_1000_, int i_1001_, int i_1002_) {
        if (i_997_ > 0 && i_998_ > 0) {
            int i_1003_ = 0;
            int i_1004_ = 0;
            int i_1005_ = (this.anInt8461
                    + this.anInt8471
                    + this.anInt8454);
            int i_1006_ = (this.anInt8464
                    + this.anInt8470
                    + this.anInt8456);
            int i_1007_ = (i_1005_ << 16) / i_997_;
            int i_1008_ = (i_1006_ << 16) / i_998_;
            if (this.anInt8461 > 0) {
                int i_1009_
                        = (((this.anInt8461 << 16) + i_1007_ - 1)
                        / i_1007_);
                i += i_1009_;
                i_1003_
                        += i_1009_ * i_1007_ - (this.anInt8461
                        << 16);
            }
            if (this.anInt8464 > 0) {
                int i_1010_
                        = (((this.anInt8464 << 16) + i_1008_ - 1)
                        / i_1008_);
                i_995_ += i_1010_;
                i_1004_
                        += i_1010_ * i_1008_ - (this.anInt8464
                        << 16);
            }
            if (this.anInt8471 < i_1005_)
                i_997_ = ((this.anInt8471 << 16) - i_1003_
                        + i_1007_ - 1) / i_1007_;
            if (this.anInt8470 < i_1006_)
                i_998_ = ((this.anInt8470 << 16) - i_1004_
                        + i_1008_ - 1) / i_1008_;
            int i_1011_ = i + i_995_ * this
                    .aHa_Sub1_8460.anInt7477;
            int i_1012_
                    = (this.aHa_Sub1_8460.anInt7477
                    - i_997_);
            if (i_995_ + i_998_
                    > this.aHa_Sub1_8460.anInt7503)
                i_998_ -= (i_995_ + i_998_
                        - (this.aHa_Sub1_8460
                        .anInt7503));
            if (i_995_
                    < this.aHa_Sub1_8460.anInt7476) {
                int i_1013_ = (this.aHa_Sub1_8460
                        .anInt7476) - i_995_;
                i_998_ -= i_1013_;
                i_1011_ += i_1013_ * this
                        .aHa_Sub1_8460.anInt7477;
                i_1004_ += i_1008_ * i_1013_;
            }
            if (i + i_997_
                    > this.aHa_Sub1_8460.anInt7507) {
                int i_1014_
                        = (i + i_997_
                        - (this.aHa_Sub1_8460
                        .anInt7507));
                i_997_ -= i_1014_;
                i_1012_ += i_1014_;
            }
            if (i
                    < this.aHa_Sub1_8460.anInt7496) {
                int i_1015_ = (this.aHa_Sub1_8460
                        .anInt7496) - i;
                i_997_ -= i_1015_;
                i_1011_ += i_1015_;
                i_1003_ += i_1007_ * i_1015_;
                i_1012_ += i_1015_;
            }
            float[] fs = (this.aHa_Sub1_8460
                    .aFloatArray7511);
            int[] is = (this.aHa_Sub1_8460
                    .anIntArray7483);
            if (i_1001_ == 0) {
                if (i_999_ == 1) {
                    int i_1016_ = i_1003_;
                    for (int i_1017_ = -i_998_; i_1017_ < 0; i_1017_++) {
                        int i_1018_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1019_ = -i_997_; i_1019_ < 0; i_1019_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                is[i_1011_] = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1018_]);
                                fs[i_1011_] = (float) i_996_;
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1016_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                if (i_999_ == 0) {
                    int i_1020_ = (i_1000_ & 0xff0000) >> 16;
                    int i_1021_ = (i_1000_ & 0xff00) >> 8;
                    int i_1022_ = i_1000_ & 0xff;
                    int i_1023_ = i_1003_;
                    for (int i_1024_ = -i_998_; i_1024_ < 0; i_1024_++) {
                        int i_1025_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1026_ = -i_997_; i_1026_ < 0; i_1026_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1027_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1025_]);
                                int i_1028_ = ((i_1027_ & 0xff0000) * i_1020_
                                        & ~0xffffff);
                                int i_1029_
                                        = (i_1027_ & 0xff00) * i_1021_ & 0xff0000;
                                int i_1030_
                                        = (i_1027_ & 0xff) * i_1022_ & 0xff00;
                                is[i_1011_]
                                        = (i_1028_ | i_1029_ | i_1030_) >>> 8;
                                fs[i_1011_] = (float) i_996_;
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1023_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                if (i_999_ == 3) {
                    int i_1031_ = i_1003_;
                    for (int i_1032_ = -i_998_; i_1032_ < 0; i_1032_++) {
                        int i_1033_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1034_ = -i_997_; i_1034_ < 0; i_1034_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1035_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1033_]);
                                int i_1036_ = i_1035_ + i_1000_;
                                int i_1037_ = ((i_1035_ & 0xff00ff)
                                        + (i_1000_ & 0xff00ff));
                                int i_1038_
                                        = ((i_1037_ & 0x1000100)
                                        + (i_1036_ - i_1037_ & 0x10000));
                                is[i_1011_]
                                        = i_1036_ - i_1038_ | i_1038_ - (i_1038_
                                        >>> 8);
                                fs[i_1011_] = (float) i_996_;
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1031_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                if (i_999_ == 2) {
                    int i_1039_ = i_1000_ >>> 24;
                    int i_1040_ = 256 - i_1039_;
                    int i_1041_ = (i_1000_ & 0xff00ff) * i_1040_ & ~0xff00ff;
                    int i_1042_ = (i_1000_ & 0xff00) * i_1040_ & 0xff0000;
                    i_1000_ = (i_1041_ | i_1042_) >>> 8;
                    int i_1043_ = i_1003_;
                    for (int i_1044_ = -i_998_; i_1044_ < 0; i_1044_++) {
                        int i_1045_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1046_ = -i_997_; i_1046_ < 0; i_1046_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1047_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1045_]);
                                i_1041_ = ((i_1047_ & 0xff00ff) * i_1039_
                                        & ~0xff00ff);
                                i_1042_
                                        = (i_1047_ & 0xff00) * i_1039_ & 0xff0000;
                                is[i_1011_]
                                        = ((i_1041_ | i_1042_) >>> 8) + i_1000_;
                                fs[i_1011_] = (float) i_996_;
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1043_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_1001_ == 1) {
                if (i_999_ == 1) {
                    int i_1048_ = i_1003_;
                    for (int i_1049_ = -i_998_; i_1049_ < 0; i_1049_++) {
                        int i_1050_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1051_ = -i_997_; i_1051_ < 0; i_1051_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1052_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1050_]);
                                if (i_1052_ != 0) {
                                    is[i_1011_] = i_1052_;
                                    fs[i_1011_] = (float) i_996_;
                                }
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1048_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                if (i_999_ == 0) {
                    int i_1053_ = i_1003_;
                    if ((i_1000_ & 0xffffff) == 16777215) {
                        int i_1054_ = i_1000_ >>> 24;
                        int i_1055_ = 256 - i_1054_;
                        for (int i_1056_ = -i_998_; i_1056_ < 0; i_1056_++) {
                            int i_1057_ = ((i_1004_ >> 16)
                                    * this.anInt8471);
                            for (int i_1058_ = -i_997_; i_1058_ < 0;
                                 i_1058_++) {
                                if ((float) i_996_ < fs[i_1011_]) {
                                    int i_1059_
                                            = (this
                                            .anIntArray9933
                                            [(i_1003_ >> 16) + i_1057_]);
                                    if (i_1059_ != 0) {
                                        int i_1060_ = is[i_1011_];
                                        is[i_1011_]
                                                = ((((i_1059_ & 0xff00ff) * i_1054_
                                                + ((i_1060_ & 0xff00ff)
                                                * i_1055_))
                                                & ~0xff00ff)
                                                + (((i_1059_ & 0xff00) * i_1054_
                                                + ((i_1060_ & 0xff00)
                                                * i_1055_))
                                                & 0xff0000)) >> 8;
                                        fs[i_1011_] = (float) i_996_;
                                    }
                                }
                                i_1003_ += i_1007_;
                                i_1011_++;
                            }
                            i_1004_ += i_1008_;
                            i_1003_ = i_1053_;
                            i_1011_ += i_1012_;
                        }
                    } else {
                        int i_1061_ = (i_1000_ & 0xff0000) >> 16;
                        int i_1062_ = (i_1000_ & 0xff00) >> 8;
                        int i_1063_ = i_1000_ & 0xff;
                        int i_1064_ = i_1000_ >>> 24;
                        int i_1065_ = 256 - i_1064_;
                        for (int i_1066_ = -i_998_; i_1066_ < 0; i_1066_++) {
                            int i_1067_ = ((i_1004_ >> 16)
                                    * this.anInt8471);
                            for (int i_1068_ = -i_997_; i_1068_ < 0;
                                 i_1068_++) {
                                if ((float) i_996_ < fs[i_1011_]) {
                                    int i_1069_
                                            = (this
                                            .anIntArray9933
                                            [(i_1003_ >> 16) + i_1067_]);
                                    if (i_1069_ != 0) {
                                        if (i_1064_ != 255) {
                                            int i_1070_
                                                    = (((i_1069_ & 0xff0000)
                                                    * i_1061_)
                                                    & ~0xffffff);
                                            int i_1071_
                                                    = ((i_1069_ & 0xff00) * i_1062_
                                                    & 0xff0000);
                                            int i_1072_
                                                    = ((i_1069_ & 0xff) * i_1063_
                                                    & 0xff00);
                                            i_1069_ = (i_1070_ | i_1071_
                                                    | i_1072_) >>> 8;
                                            int i_1073_ = is[i_1011_];
                                            is[i_1011_]
                                                    = (((((i_1069_ & 0xff00ff)
                                                    * i_1064_)
                                                    + ((i_1073_ & 0xff00ff)
                                                    * i_1065_))
                                                    & ~0xff00ff)
                                                    + ((((i_1069_ & 0xff00)
                                                    * i_1064_)
                                                    + ((i_1073_ & 0xff00)
                                                    * i_1065_))
                                                    & 0xff0000)) >> 8;
                                            fs[i_1011_] = (float) i_996_;
                                        } else {
                                            int i_1074_
                                                    = (((i_1069_ & 0xff0000)
                                                    * i_1061_)
                                                    & ~0xffffff);
                                            int i_1075_
                                                    = ((i_1069_ & 0xff00) * i_1062_
                                                    & 0xff0000);
                                            int i_1076_
                                                    = ((i_1069_ & 0xff) * i_1063_
                                                    & 0xff00);
                                            is[i_1011_] = (i_1074_ | i_1075_
                                                    | i_1076_) >>> 8;
                                            fs[i_1011_] = (float) i_996_;
                                        }
                                    }
                                }
                                i_1003_ += i_1007_;
                                i_1011_++;
                            }
                            i_1004_ += i_1008_;
                            i_1003_ = i_1053_;
                            i_1011_ += i_1012_;
                        }
                        return;
                    }
                    return;
                }
                if (i_999_ == 3) {
                    int i_1077_ = i_1003_;
                    int i_1078_ = i_1000_ >>> 24;
                    int i_1079_ = 256 - i_1078_;
                    for (int i_1080_ = -i_998_; i_1080_ < 0; i_1080_++) {
                        int i_1081_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1082_ = -i_997_; i_1082_ < 0; i_1082_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1083_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1081_]);
                                int i_1084_ = i_1083_ + i_1000_;
                                int i_1085_ = ((i_1083_ & 0xff00ff)
                                        + (i_1000_ & 0xff00ff));
                                int i_1086_
                                        = ((i_1085_ & 0x1000100)
                                        + (i_1084_ - i_1085_ & 0x10000));
                                i_1086_
                                        = i_1084_ - i_1086_ | i_1086_ - (i_1086_
                                        >>> 8);
                                if (i_1083_ == 0 && i_1078_ != 255) {
                                    i_1083_ = i_1086_;
                                    i_1086_ = is[i_1011_];
                                    i_1086_
                                            = ((((i_1083_ & 0xff00ff) * i_1078_
                                            + (i_1086_ & 0xff00ff) * i_1079_)
                                            & ~0xff00ff)
                                            + (((i_1083_ & 0xff00) * i_1078_
                                            + (i_1086_ & 0xff00) * i_1079_)
                                            & 0xff0000)) >> 8;
                                }
                                is[i_1011_] = i_1086_;
                                fs[i_1011_] = (float) i_996_;
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1077_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                if (i_999_ == 2) {
                    int i_1087_ = i_1000_ >>> 24;
                    int i_1088_ = 256 - i_1087_;
                    int i_1089_ = (i_1000_ & 0xff00ff) * i_1088_ & ~0xff00ff;
                    int i_1090_ = (i_1000_ & 0xff00) * i_1088_ & 0xff0000;
                    i_1000_ = (i_1089_ | i_1090_) >>> 8;
                    int i_1091_ = i_1003_;
                    for (int i_1092_ = -i_998_; i_1092_ < 0; i_1092_++) {
                        int i_1093_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1094_ = -i_997_; i_1094_ < 0; i_1094_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1095_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1093_]);
                                if (i_1095_ != 0) {
                                    i_1089_ = ((i_1095_ & 0xff00ff) * i_1087_
                                            & ~0xff00ff);
                                    i_1090_ = ((i_1095_ & 0xff00) * i_1087_
                                            & 0xff0000);
                                    is[i_1011_] = (((i_1089_ | i_1090_) >>> 8)
                                            + i_1000_);
                                    fs[i_1011_] = (float) i_996_;
                                }
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1091_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_1001_ == 2) {
                if (i_999_ == 1) {
                    int i_1096_ = i_1003_;
                    for (int i_1097_ = -i_998_; i_1097_ < 0; i_1097_++) {
                        int i_1098_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1099_ = -i_997_; i_1099_ < 0; i_1099_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1100_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1098_]);
                                if (i_1100_ != 0) {
                                    int i_1101_ = is[i_1011_];
                                    int i_1102_ = i_1100_ + i_1101_;
                                    int i_1103_ = ((i_1100_ & 0xff00ff)
                                            + (i_1101_ & 0xff00ff));
                                    i_1101_
                                            = ((i_1103_ & 0x1000100)
                                            + (i_1102_ - i_1103_ & 0x10000));
                                    is[i_1011_]
                                            = (i_1102_ - i_1101_
                                            | i_1101_ - (i_1101_ >>> 8));
                                    fs[i_1011_] = (float) i_996_;
                                }
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1096_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                if (i_999_ == 0) {
                    int i_1104_ = i_1003_;
                    int i_1105_ = (i_1000_ & 0xff0000) >> 16;
                    int i_1106_ = (i_1000_ & 0xff00) >> 8;
                    int i_1107_ = i_1000_ & 0xff;
                    for (int i_1108_ = -i_998_; i_1108_ < 0; i_1108_++) {
                        int i_1109_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1110_ = -i_997_; i_1110_ < 0; i_1110_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1111_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1109_]);
                                if (i_1111_ != 0) {
                                    int i_1112_
                                            = ((i_1111_ & 0xff0000) * i_1105_
                                            & ~0xffffff);
                                    int i_1113_ = ((i_1111_ & 0xff00) * i_1106_
                                            & 0xff0000);
                                    int i_1114_
                                            = (i_1111_ & 0xff) * i_1107_ & 0xff00;
                                    i_1111_
                                            = (i_1112_ | i_1113_ | i_1114_) >>> 8;
                                    int i_1115_ = is[i_1011_];
                                    int i_1116_ = i_1111_ + i_1115_;
                                    int i_1117_ = ((i_1111_ & 0xff00ff)
                                            + (i_1115_ & 0xff00ff));
                                    i_1115_
                                            = ((i_1117_ & 0x1000100)
                                            + (i_1116_ - i_1117_ & 0x10000));
                                    is[i_1011_]
                                            = (i_1116_ - i_1115_
                                            | i_1115_ - (i_1115_ >>> 8));
                                    fs[i_1011_] = (float) i_996_;
                                }
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1104_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                if (i_999_ == 3) {
                    int i_1118_ = i_1003_;
                    for (int i_1119_ = -i_998_; i_1119_ < 0; i_1119_++) {
                        int i_1120_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1121_ = -i_997_; i_1121_ < 0; i_1121_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1122_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1120_]);
                                int i_1123_ = i_1122_ + i_1000_;
                                int i_1124_ = ((i_1122_ & 0xff00ff)
                                        + (i_1000_ & 0xff00ff));
                                int i_1125_
                                        = ((i_1124_ & 0x1000100)
                                        + (i_1123_ - i_1124_ & 0x10000));
                                i_1122_
                                        = i_1123_ - i_1125_ | i_1125_ - (i_1125_
                                        >>> 8);
                                i_1125_ = is[i_1011_];
                                i_1123_ = i_1122_ + i_1125_;
                                i_1124_ = (i_1122_ & 0xff00ff) + (i_1125_
                                        & 0xff00ff);
                                i_1125_ = ((i_1124_ & 0x1000100)
                                        + (i_1123_ - i_1124_ & 0x10000));
                                is[i_1011_]
                                        = i_1123_ - i_1125_ | i_1125_ - (i_1125_
                                        >>> 8);
                                fs[i_1011_] = (float) i_996_;
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1118_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                if (i_999_ == 2) {
                    int i_1126_ = i_1000_ >>> 24;
                    int i_1127_ = 256 - i_1126_;
                    int i_1128_ = (i_1000_ & 0xff00ff) * i_1127_ & ~0xff00ff;
                    int i_1129_ = (i_1000_ & 0xff00) * i_1127_ & 0xff0000;
                    i_1000_ = (i_1128_ | i_1129_) >>> 8;
                    int i_1130_ = i_1003_;
                    for (int i_1131_ = -i_998_; i_1131_ < 0; i_1131_++) {
                        int i_1132_ = ((i_1004_ >> 16)
                                * this.anInt8471);
                        for (int i_1133_ = -i_997_; i_1133_ < 0; i_1133_++) {
                            if ((float) i_996_ < fs[i_1011_]) {
                                int i_1134_ = (this
                                        .anIntArray9933
                                        [(i_1003_ >> 16) + i_1132_]);
                                if (i_1134_ != 0) {
                                    i_1128_ = ((i_1134_ & 0xff00ff) * i_1126_
                                            & ~0xff00ff);
                                    i_1129_ = ((i_1134_ & 0xff00) * i_1126_
                                            & 0xff0000);
                                    i_1134_ = (((i_1128_ | i_1129_) >>> 8)
                                            + i_1000_);
                                    int i_1135_ = is[i_1011_];
                                    int i_1136_ = i_1134_ + i_1135_;
                                    int i_1137_ = ((i_1134_ & 0xff00ff)
                                            + (i_1135_ & 0xff00ff));
                                    i_1135_
                                            = ((i_1137_ & 0x1000100)
                                            + (i_1136_ - i_1137_ & 0x10000));
                                    is[i_1011_]
                                            = (i_1136_ - i_1135_
                                            | i_1135_ - (i_1135_ >>> 8));
                                    fs[i_1011_] = (float) i_996_;
                                }
                            }
                            i_1003_ += i_1007_;
                            i_1011_++;
                        }
                        i_1004_ += i_1008_;
                        i_1003_ = i_1130_;
                        i_1011_ += i_1012_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }
}
