/* Class105_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class105_Sub3_Sub2 extends Class105_Sub3 {
    private byte[] aByteArray9934;
    private int[] anIntArray9935;

    final void method979(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                         int i_4_) {
        throw new IllegalStateException();
    }

    final void method968(int i, int i_5_, int i_6_) {
        throw new IllegalStateException();
    }

    final void method996(int i, int i_7_, int i_8_, int i_9_, int i_10_,
                         int i_11_, int i_12_, int i_13_, int i_14_) {
        if (i_9_ > 0 && i_10_ > 0) {
            int i_15_ = 0;
            int i_16_ = 0;
            int i_17_ = (((Class105_Sub3) this).anInt8461
                    + ((Class105_Sub3) this).anInt8471
                    + ((Class105_Sub3) this).anInt8454);
            int i_18_ = (((Class105_Sub3) this).anInt8464
                    + ((Class105_Sub3) this).anInt8470
                    + ((Class105_Sub3) this).anInt8456);
            int i_19_ = (i_17_ << 16) / i_9_;
            int i_20_ = (i_18_ << 16) / i_10_;
            if (((Class105_Sub3) this).anInt8461 > 0) {
                int i_21_
                        = (((((Class105_Sub3) this).anInt8461 << 16) + i_19_ - 1)
                        / i_19_);
                i += i_21_;
                i_15_ += i_21_ * i_19_ - (((Class105_Sub3) this).anInt8461
                        << 16);
            }
            if (((Class105_Sub3) this).anInt8464 > 0) {
                int i_22_
                        = (((((Class105_Sub3) this).anInt8464 << 16) + i_20_ - 1)
                        / i_20_);
                i_7_ += i_22_;
                i_16_ += i_22_ * i_20_ - (((Class105_Sub3) this).anInt8464
                        << 16);
            }
            if (((Class105_Sub3) this).anInt8471 < i_17_)
                i_9_ = ((((Class105_Sub3) this).anInt8471 << 16) - i_15_
                        + i_19_ - 1) / i_19_;
            if (((Class105_Sub3) this).anInt8470 < i_18_)
                i_10_ = ((((Class105_Sub3) this).anInt8470 << 16) - i_16_
                        + i_20_ - 1) / i_20_;
            int i_23_
                    = i + i_7_ * (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anInt7477);
            int i_24_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7477
                    - i_9_);
            if (i_7_ + i_10_
                    > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7503)
                i_10_ -= i_7_ + i_10_ - ((ha_Sub1) (((Class105_Sub3) this)
                        .aHa_Sub1_8460)).anInt7503;
            if (i_7_
                    < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476) {
                int i_25_ = ((((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7476)
                        - i_7_);
                i_10_ -= i_25_;
                i_23_ += i_25_ * ((ha_Sub1) (((Class105_Sub3) this)
                        .aHa_Sub1_8460)).anInt7477;
                i_16_ += i_20_ * i_25_;
            }
            if (i + i_9_
                    > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7507) {
                int i_26_ = i + i_9_ - ((ha_Sub1) (((Class105_Sub3) this)
                        .aHa_Sub1_8460)).anInt7507;
                i_9_ -= i_26_;
                i_24_ += i_26_;
            }
            if (i
                    < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496) {
                int i_27_ = ((((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7496)
                        - i);
                i_9_ -= i_27_;
                i_23_ += i_27_;
                i_15_ += i_19_ * i_27_;
                i_24_ += i_27_;
            }
            float[] fs = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .aFloatArray7511);
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            if (i_13_ == 0) {
                if (i_11_ == 1) {
                    int i_28_ = i_15_;
                    for (int i_29_ = -i_10_; i_29_ < 0; i_29_++) {
                        int i_30_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_31_ = -i_9_; i_31_ < 0; i_31_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                is[i_23_]
                                        = (anIntArray9935
                                        [(aByteArray9934[(i_15_ >> 16) + i_30_]
                                        & 0xff)]);
                                fs[i_23_] = (float) i_8_;
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_28_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                if (i_11_ == 0) {
                    int i_32_ = (i_12_ & 0xff0000) >> 16;
                    int i_33_ = (i_12_ & 0xff00) >> 8;
                    int i_34_ = i_12_ & 0xff;
                    int i_35_ = i_15_;
                    for (int i_36_ = -i_10_; i_36_ < 0; i_36_++) {
                        int i_37_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_38_ = -i_9_; i_38_ < 0; i_38_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                int i_39_
                                        = (anIntArray9935
                                        [(aByteArray9934[(i_15_ >> 16) + i_37_]
                                        & 0xff)]);
                                int i_40_
                                        = (i_39_ & 0xff0000) * i_32_ & ~0xffffff;
                                int i_41_
                                        = (i_39_ & 0xff00) * i_33_ & 0xff0000;
                                int i_42_ = (i_39_ & 0xff) * i_34_ & 0xff00;
                                is[i_23_] = (i_40_ | i_41_ | i_42_) >>> 8;
                                fs[i_23_] = (float) i_8_;
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_35_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                if (i_11_ == 3) {
                    int i_43_ = i_15_;
                    for (int i_44_ = -i_10_; i_44_ < 0; i_44_++) {
                        int i_45_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_46_ = -i_9_; i_46_ < 0; i_46_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                byte i_47_
                                        = aByteArray9934[(i_15_ >> 16) + i_45_];
                                int i_48_
                                        = i_47_ > 0 ? anIntArray9935[i_47_] : 0;
                                int i_49_ = i_48_ + i_12_;
                                int i_50_
                                        = (i_48_ & 0xff00ff) + (i_12_ & 0xff00ff);
                                int i_51_ = ((i_50_ & 0x1000100)
                                        + (i_49_ - i_50_ & 0x10000));
                                is[i_23_]
                                        = i_49_ - i_51_ | i_51_ - (i_51_ >>> 8);
                                fs[i_23_] = (float) i_8_;
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_43_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                if (i_11_ == 2) {
                    int i_52_ = i_12_ >>> 24;
                    int i_53_ = 256 - i_52_;
                    int i_54_ = (i_12_ & 0xff00ff) * i_53_ & ~0xff00ff;
                    int i_55_ = (i_12_ & 0xff00) * i_53_ & 0xff0000;
                    i_12_ = (i_54_ | i_55_) >>> 8;
                    int i_56_ = i_15_;
                    for (int i_57_ = -i_10_; i_57_ < 0; i_57_++) {
                        int i_58_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_59_ = -i_9_; i_59_ < 0; i_59_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                int i_60_
                                        = (anIntArray9935
                                        [(aByteArray9934[(i_15_ >> 16) + i_58_]
                                        & 0xff)]);
                                i_54_ = (i_60_ & 0xff00ff) * i_52_ & ~0xff00ff;
                                i_55_ = (i_60_ & 0xff00) * i_52_ & 0xff0000;
                                is[i_23_] = ((i_54_ | i_55_) >>> 8) + i_12_;
                                fs[i_23_] = (float) i_8_;
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_56_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_13_ == 1) {
                if (i_11_ == 1) {
                    int i_61_ = i_15_;
                    for (int i_62_ = -i_10_; i_62_ < 0; i_62_++) {
                        int i_63_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_64_ = -i_9_; i_64_ < 0; i_64_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                int i_65_
                                        = aByteArray9934[(i_15_ >> 16) + i_63_];
                                if (i_65_ != 0) {
                                    is[i_23_] = anIntArray9935[i_65_ & 0xff];
                                    fs[i_23_] = (float) i_8_;
                                }
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_61_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                if (i_11_ == 0) {
                    int i_66_ = i_15_;
                    if ((i_12_ & 0xffffff) == 16777215) {
                        int i_67_ = i_12_ >>> 24;
                        int i_68_ = 256 - i_67_;
                        for (int i_69_ = -i_10_; i_69_ < 0; i_69_++) {
                            int i_70_ = ((i_16_ >> 16)
                                    * ((Class105_Sub3) this).anInt8471);
                            for (int i_71_ = -i_9_; i_71_ < 0; i_71_++) {
                                if ((float) i_8_ < fs[i_23_]) {
                                    int i_72_ = (aByteArray9934
                                            [(i_15_ >> 16) + i_70_]);
                                    if (i_72_ != 0) {
                                        int i_73_
                                                = anIntArray9935[i_72_ & 0xff];
                                        int i_74_ = is[i_23_];
                                        is[i_23_]
                                                = ((((i_73_ & 0xff00ff) * i_67_
                                                + (i_74_ & 0xff00ff) * i_68_)
                                                & ~0xff00ff)
                                                + (((i_73_ & 0xff00) * i_67_
                                                + (i_74_ & 0xff00) * i_68_)
                                                & 0xff0000)) >> 8;
                                        fs[i_23_] = (float) i_8_;
                                    }
                                }
                                i_15_ += i_19_;
                                i_23_++;
                            }
                            i_16_ += i_20_;
                            i_15_ = i_66_;
                            i_23_ += i_24_;
                        }
                    } else {
                        int i_75_ = (i_12_ & 0xff0000) >> 16;
                        int i_76_ = (i_12_ & 0xff00) >> 8;
                        int i_77_ = i_12_ & 0xff;
                        int i_78_ = i_12_ >>> 24;
                        int i_79_ = 256 - i_78_;
                        for (int i_80_ = -i_10_; i_80_ < 0; i_80_++) {
                            int i_81_ = ((i_16_ >> 16)
                                    * ((Class105_Sub3) this).anInt8471);
                            for (int i_82_ = -i_9_; i_82_ < 0; i_82_++) {
                                if ((float) i_8_ < fs[i_23_]) {
                                    int i_83_ = (aByteArray9934
                                            [(i_15_ >> 16) + i_81_]);
                                    if (i_83_ != 0) {
                                        int i_84_
                                                = anIntArray9935[i_83_ & 0xff];
                                        if (i_78_ != 255) {
                                            int i_85_
                                                    = ((i_84_ & 0xff0000) * i_75_
                                                    & ~0xffffff);
                                            int i_86_
                                                    = ((i_84_ & 0xff00) * i_76_
                                                    & 0xff0000);
                                            int i_87_ = ((i_84_ & 0xff) * i_77_
                                                    & 0xff00);
                                            i_84_ = ((i_85_ | i_86_ | i_87_)
                                                    >>> 8);
                                            int i_88_ = is[i_23_];
                                            is[i_23_]
                                                    = ((((i_84_ & 0xff00ff) * i_78_
                                                    + ((i_88_ & 0xff00ff)
                                                    * i_79_))
                                                    & ~0xff00ff)
                                                    + (((i_84_ & 0xff00) * i_78_
                                                    + ((i_88_ & 0xff00)
                                                    * i_79_))
                                                    & 0xff0000)) >> 8;
                                            fs[i_23_] = (float) i_8_;
                                        } else {
                                            int i_89_
                                                    = ((i_84_ & 0xff0000) * i_75_
                                                    & ~0xffffff);
                                            int i_90_
                                                    = ((i_84_ & 0xff00) * i_76_
                                                    & 0xff0000);
                                            int i_91_ = ((i_84_ & 0xff) * i_77_
                                                    & 0xff00);
                                            is[i_23_] = (i_89_ | i_90_
                                                    | i_91_) >>> 8;
                                            fs[i_23_] = (float) i_8_;
                                        }
                                    }
                                }
                                i_15_ += i_19_;
                                i_23_++;
                            }
                            i_16_ += i_20_;
                            i_15_ = i_66_;
                            i_23_ += i_24_;
                        }
                        return;
                    }
                    return;
                }
                if (i_11_ == 3) {
                    int i_92_ = i_15_;
                    int i_93_ = i_12_ >>> 24;
                    int i_94_ = 256 - i_93_;
                    for (int i_95_ = -i_10_; i_95_ < 0; i_95_++) {
                        int i_96_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_97_ = -i_9_; i_97_ < 0; i_97_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                byte i_98_
                                        = aByteArray9934[(i_15_ >> 16) + i_96_];
                                int i_99_
                                        = i_98_ > 0 ? anIntArray9935[i_98_] : 0;
                                int i_100_ = i_99_ + i_12_;
                                int i_101_
                                        = (i_99_ & 0xff00ff) + (i_12_ & 0xff00ff);
                                int i_102_ = ((i_101_ & 0x1000100)
                                        + (i_100_ - i_101_ & 0x10000));
                                i_102_ = i_100_ - i_102_ | i_102_ - (i_102_
                                        >>> 8);
                                if (i_99_ == 0 && i_93_ != 255) {
                                    i_99_ = i_102_;
                                    i_102_ = is[i_23_];
                                    i_102_ = ((((i_99_ & 0xff00ff) * i_93_
                                            + (i_102_ & 0xff00ff) * i_94_)
                                            & ~0xff00ff)
                                            + (((i_99_ & 0xff00) * i_93_
                                            + (i_102_ & 0xff00) * i_94_)
                                            & 0xff0000)) >> 8;
                                }
                                is[i_23_] = i_102_;
                                fs[i_23_] = (float) i_8_;
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_92_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                if (i_11_ == 2) {
                    int i_103_ = i_12_ >>> 24;
                    int i_104_ = 256 - i_103_;
                    int i_105_ = (i_12_ & 0xff00ff) * i_104_ & ~0xff00ff;
                    int i_106_ = (i_12_ & 0xff00) * i_104_ & 0xff0000;
                    i_12_ = (i_105_ | i_106_) >>> 8;
                    int i_107_ = i_15_;
                    for (int i_108_ = -i_10_; i_108_ < 0; i_108_++) {
                        int i_109_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_110_ = -i_9_; i_110_ < 0; i_110_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                int i_111_
                                        = aByteArray9934[(i_15_ >> 16) + i_109_];
                                if (i_111_ != 0) {
                                    int i_112_ = anIntArray9935[i_111_ & 0xff];
                                    i_105_ = ((i_112_ & 0xff00ff) * i_103_
                                            & ~0xff00ff);
                                    i_106_ = ((i_112_ & 0xff00) * i_103_
                                            & 0xff0000);
                                    is[i_23_]
                                            = ((i_105_ | i_106_) >>> 8) + i_12_;
                                    fs[i_23_] = (float) i_8_;
                                }
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_107_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_13_ == 2) {
                if (i_11_ == 1) {
                    int i_113_ = i_15_;
                    for (int i_114_ = -i_10_; i_114_ < 0; i_114_++) {
                        int i_115_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_116_ = -i_9_; i_116_ < 0; i_116_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                int i_117_
                                        = aByteArray9934[(i_15_ >> 16) + i_115_];
                                if (i_117_ != 0) {
                                    int i_118_ = anIntArray9935[i_117_ & 0xff];
                                    int i_119_ = is[i_23_];
                                    int i_120_ = i_118_ + i_119_;
                                    int i_121_ = ((i_118_ & 0xff00ff)
                                            + (i_119_ & 0xff00ff));
                                    i_119_ = ((i_121_ & 0x1000100)
                                            + (i_120_ - i_121_ & 0x10000));
                                    is[i_23_]
                                            = i_120_ - i_119_ | i_119_ - (i_119_
                                            >>> 8);
                                    fs[i_23_] = (float) i_8_;
                                }
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_113_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                if (i_11_ == 0) {
                    int i_122_ = i_15_;
                    int i_123_ = (i_12_ & 0xff0000) >> 16;
                    int i_124_ = (i_12_ & 0xff00) >> 8;
                    int i_125_ = i_12_ & 0xff;
                    for (int i_126_ = -i_10_; i_126_ < 0; i_126_++) {
                        int i_127_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_128_ = -i_9_; i_128_ < 0; i_128_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                int i_129_
                                        = aByteArray9934[(i_15_ >> 16) + i_127_];
                                if (i_129_ != 0) {
                                    int i_130_ = anIntArray9935[i_129_ & 0xff];
                                    int i_131_ = ((i_130_ & 0xff0000) * i_123_
                                            & ~0xffffff);
                                    int i_132_ = ((i_130_ & 0xff00) * i_124_
                                            & 0xff0000);
                                    int i_133_
                                            = (i_130_ & 0xff) * i_125_ & 0xff00;
                                    i_130_ = (i_131_ | i_132_ | i_133_) >>> 8;
                                    int i_134_ = is[i_23_];
                                    int i_135_ = i_130_ + i_134_;
                                    int i_136_ = ((i_130_ & 0xff00ff)
                                            + (i_134_ & 0xff00ff));
                                    i_134_ = ((i_136_ & 0x1000100)
                                            + (i_135_ - i_136_ & 0x10000));
                                    is[i_23_]
                                            = i_135_ - i_134_ | i_134_ - (i_134_
                                            >>> 8);
                                    fs[i_23_] = (float) i_8_;
                                }
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_122_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                if (i_11_ == 3) {
                    int i_137_ = i_15_;
                    for (int i_138_ = -i_10_; i_138_ < 0; i_138_++) {
                        int i_139_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_140_ = -i_9_; i_140_ < 0; i_140_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                byte i_141_
                                        = aByteArray9934[(i_15_ >> 16) + i_139_];
                                int i_142_
                                        = i_141_ > 0 ? anIntArray9935[i_141_] : 0;
                                int i_143_ = i_142_ + i_12_;
                                int i_144_
                                        = (i_142_ & 0xff00ff) + (i_12_ & 0xff00ff);
                                int i_145_ = ((i_144_ & 0x1000100)
                                        + (i_143_ - i_144_ & 0x10000));
                                i_142_ = i_143_ - i_145_ | i_145_ - (i_145_
                                        >>> 8);
                                i_145_ = is[i_23_];
                                i_143_ = i_142_ + i_145_;
                                i_144_ = (i_142_ & 0xff00ff) + (i_145_
                                        & 0xff00ff);
                                i_145_
                                        = (i_144_ & 0x1000100) + (i_143_ - i_144_
                                        & 0x10000);
                                is[i_23_] = i_143_ - i_145_ | i_145_ - (i_145_
                                        >>> 8);
                                fs[i_23_] = (float) i_8_;
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_137_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                if (i_11_ == 2) {
                    int i_146_ = i_12_ >>> 24;
                    int i_147_ = 256 - i_146_;
                    int i_148_ = (i_12_ & 0xff00ff) * i_147_ & ~0xff00ff;
                    int i_149_ = (i_12_ & 0xff00) * i_147_ & 0xff0000;
                    i_12_ = (i_148_ | i_149_) >>> 8;
                    int i_150_ = i_15_;
                    for (int i_151_ = -i_10_; i_151_ < 0; i_151_++) {
                        int i_152_
                                = (i_16_ >> 16) * ((Class105_Sub3) this).anInt8471;
                        for (int i_153_ = -i_9_; i_153_ < 0; i_153_++) {
                            if ((float) i_8_ < fs[i_23_]) {
                                int i_154_
                                        = aByteArray9934[(i_15_ >> 16) + i_152_];
                                if (i_154_ != 0) {
                                    int i_155_ = anIntArray9935[i_154_ & 0xff];
                                    i_148_ = ((i_155_ & 0xff00ff) * i_146_
                                            & ~0xff00ff);
                                    i_149_ = ((i_155_ & 0xff00) * i_146_
                                            & 0xff0000);
                                    i_155_ = ((i_148_ | i_149_) >>> 8) + i_12_;
                                    int i_156_ = is[i_23_];
                                    int i_157_ = i_155_ + i_156_;
                                    int i_158_ = ((i_155_ & 0xff00ff)
                                            + (i_156_ & 0xff00ff));
                                    i_156_ = ((i_158_ & 0x1000100)
                                            + (i_157_ - i_158_ & 0x10000));
                                    is[i_23_]
                                            = i_157_ - i_156_ | i_156_ - (i_156_
                                            >>> 8);
                                    fs[i_23_] = (float) i_8_;
                                }
                            }
                            i_15_ += i_19_;
                            i_23_++;
                        }
                        i_16_ += i_20_;
                        i_15_ = i_150_;
                        i_23_ += i_24_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method982(int i, int i_159_, int i_160_, int i_161_, int i_162_,
                         int i_163_, int i_164_, int i_165_) {
        if (((Class105_Sub3) this).aHa_Sub1_8460.method3716())
            throw new IllegalStateException();
        if (i_160_ > 0 && i_161_ > 0) {
            int i_166_ = 0;
            int i_167_ = 0;
            int i_168_
                    = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7477;
            int i_169_ = (((Class105_Sub3) this).anInt8461
                    + ((Class105_Sub3) this).anInt8471
                    + ((Class105_Sub3) this).anInt8454);
            int i_170_ = (((Class105_Sub3) this).anInt8464
                    + ((Class105_Sub3) this).anInt8470
                    + ((Class105_Sub3) this).anInt8456);
            int i_171_ = (i_169_ << 16) / i_160_;
            int i_172_ = (i_170_ << 16) / i_161_;
            if (((Class105_Sub3) this).anInt8461 > 0) {
                int i_173_
                        = (((((Class105_Sub3) this).anInt8461 << 16) + i_171_ - 1)
                        / i_171_);
                i += i_173_;
                i_166_ += i_173_ * i_171_ - (((Class105_Sub3) this).anInt8461
                        << 16);
            }
            if (((Class105_Sub3) this).anInt8464 > 0) {
                int i_174_
                        = (((((Class105_Sub3) this).anInt8464 << 16) + i_172_ - 1)
                        / i_172_);
                i_159_ += i_174_;
                i_167_ += i_174_ * i_172_ - (((Class105_Sub3) this).anInt8464
                        << 16);
            }
            if (((Class105_Sub3) this).anInt8471 < i_169_)
                i_160_ = ((((Class105_Sub3) this).anInt8471 << 16) - i_166_
                        + i_171_ - 1) / i_171_;
            if (((Class105_Sub3) this).anInt8470 < i_170_)
                i_161_ = ((((Class105_Sub3) this).anInt8470 << 16) - i_167_
                        + i_172_ - 1) / i_172_;
            int i_175_ = i + i_159_ * i_168_;
            int i_176_ = i_168_ - i_160_;
            if (i_159_ + i_161_
                    > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7503)
                i_161_ -= (i_159_ + i_161_
                        - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7503));
            if (i_159_
                    < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476) {
                int i_177_ = ((((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7476)
                        - i_159_);
                i_161_ -= i_177_;
                i_175_ += i_177_ * i_168_;
                i_167_ += i_172_ * i_177_;
            }
            if (i + i_160_
                    > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7507) {
                int i_178_
                        = (i + i_160_
                        - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7507));
                i_160_ -= i_178_;
                i_176_ += i_178_;
            }
            if (i
                    < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496) {
                int i_179_ = ((((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                        .anInt7496)
                        - i);
                i_160_ -= i_179_;
                i_175_ += i_179_;
                i_166_ += i_171_ * i_179_;
                i_176_ += i_179_;
            }
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            if (i_164_ == 0) {
                if (i_162_ == 1) {
                    int i_180_ = i_166_;
                    for (int i_181_ = -i_161_; i_181_ < 0; i_181_++) {
                        int i_182_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_183_ = -i_160_; i_183_ < 0; i_183_++) {
                            is[i_175_++]
                                    = (anIntArray9935
                                    [(aByteArray9934[(i_166_ >> 16) + i_182_]
                                    & 0xff)]);
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_180_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                if (i_162_ == 0) {
                    int i_184_ = (i_163_ & 0xff0000) >> 16;
                    int i_185_ = (i_163_ & 0xff00) >> 8;
                    int i_186_ = i_163_ & 0xff;
                    int i_187_ = i_166_;
                    for (int i_188_ = -i_161_; i_188_ < 0; i_188_++) {
                        int i_189_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_190_ = -i_160_; i_190_ < 0; i_190_++) {
                            int i_191_
                                    = (anIntArray9935
                                    [(aByteArray9934[(i_166_ >> 16) + i_189_]
                                    & 0xff)]);
                            int i_192_
                                    = (i_191_ & 0xff0000) * i_184_ & ~0xffffff;
                            int i_193_ = (i_191_ & 0xff00) * i_185_ & 0xff0000;
                            int i_194_ = (i_191_ & 0xff) * i_186_ & 0xff00;
                            is[i_175_++] = (i_192_ | i_193_ | i_194_) >>> 8;
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_187_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                if (i_162_ == 3) {
                    int i_195_ = i_166_;
                    for (int i_196_ = -i_161_; i_196_ < 0; i_196_++) {
                        int i_197_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_198_ = -i_160_; i_198_ < 0; i_198_++) {
                            byte i_199_
                                    = aByteArray9934[(i_166_ >> 16) + i_197_];
                            int i_200_
                                    = i_199_ > 0 ? anIntArray9935[i_199_] : 0;
                            int i_201_ = i_200_ + i_163_;
                            int i_202_
                                    = (i_200_ & 0xff00ff) + (i_163_ & 0xff00ff);
                            int i_203_ = ((i_202_ & 0x1000100)
                                    + (i_201_ - i_202_ & 0x10000));
                            is[i_175_++]
                                    = i_201_ - i_203_ | i_203_ - (i_203_ >>> 8);
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_195_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                if (i_162_ == 2) {
                    int i_204_ = i_163_ >>> 24;
                    int i_205_ = 256 - i_204_;
                    int i_206_ = (i_163_ & 0xff00ff) * i_205_ & ~0xff00ff;
                    int i_207_ = (i_163_ & 0xff00) * i_205_ & 0xff0000;
                    i_163_ = (i_206_ | i_207_) >>> 8;
                    int i_208_ = i_166_;
                    for (int i_209_ = -i_161_; i_209_ < 0; i_209_++) {
                        int i_210_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_211_ = -i_160_; i_211_ < 0; i_211_++) {
                            int i_212_
                                    = (anIntArray9935
                                    [(aByteArray9934[(i_166_ >> 16) + i_210_]
                                    & 0xff)]);
                            i_206_ = (i_212_ & 0xff00ff) * i_204_ & ~0xff00ff;
                            i_207_ = (i_212_ & 0xff00) * i_204_ & 0xff0000;
                            is[i_175_++] = ((i_206_ | i_207_) >>> 8) + i_163_;
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_208_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_164_ == 1) {
                if (i_162_ == 1) {
                    int i_213_ = i_166_;
                    for (int i_214_ = -i_161_; i_214_ < 0; i_214_++) {
                        int i_215_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_216_ = -i_160_; i_216_ < 0; i_216_++) {
                            int i_217_
                                    = aByteArray9934[(i_166_ >> 16) + i_215_];
                            if (i_217_ != 0)
                                is[i_175_++] = anIntArray9935[i_217_ & 0xff];
                            else
                                i_175_++;
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_213_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                if (i_162_ == 0) {
                    int i_218_ = i_166_;
                    if ((i_163_ & 0xffffff) == 16777215) {
                        int i_219_ = i_163_ >>> 24;
                        int i_220_ = 256 - i_219_;
                        for (int i_221_ = -i_161_; i_221_ < 0; i_221_++) {
                            int i_222_ = ((i_167_ >> 16)
                                    * ((Class105_Sub3) this).anInt8471);
                            for (int i_223_ = -i_160_; i_223_ < 0; i_223_++) {
                                int i_224_
                                        = aByteArray9934[(i_166_ >> 16) + i_222_];
                                if (i_224_ != 0) {
                                    int i_225_ = anIntArray9935[i_224_ & 0xff];
                                    int i_226_ = is[i_175_];
                                    is[i_175_++]
                                            = ((((i_225_ & 0xff00ff) * i_219_
                                            + (i_226_ & 0xff00ff) * i_220_)
                                            & ~0xff00ff)
                                            + (((i_225_ & 0xff00) * i_219_
                                            + (i_226_ & 0xff00) * i_220_)
                                            & 0xff0000)) >> 8;
                                } else
                                    i_175_++;
                                i_166_ += i_171_;
                            }
                            i_167_ += i_172_;
                            i_166_ = i_218_;
                            i_175_ += i_176_;
                        }
                    } else {
                        int i_227_ = (i_163_ & 0xff0000) >> 16;
                        int i_228_ = (i_163_ & 0xff00) >> 8;
                        int i_229_ = i_163_ & 0xff;
                        int i_230_ = i_163_ >>> 24;
                        int i_231_ = 256 - i_230_;
                        for (int i_232_ = -i_161_; i_232_ < 0; i_232_++) {
                            int i_233_ = ((i_167_ >> 16)
                                    * ((Class105_Sub3) this).anInt8471);
                            for (int i_234_ = -i_160_; i_234_ < 0; i_234_++) {
                                int i_235_
                                        = aByteArray9934[(i_166_ >> 16) + i_233_];
                                if (i_235_ != 0) {
                                    int i_236_ = anIntArray9935[i_235_ & 0xff];
                                    if (i_230_ != 255) {
                                        int i_237_
                                                = ((i_236_ & 0xff0000) * i_227_
                                                & ~0xffffff);
                                        int i_238_
                                                = ((i_236_ & 0xff00) * i_228_
                                                & 0xff0000);
                                        int i_239_ = ((i_236_ & 0xff) * i_229_
                                                & 0xff00);
                                        i_236_
                                                = (i_237_ | i_238_ | i_239_) >>> 8;
                                        int i_240_ = is[i_175_];
                                        is[i_175_++]
                                                = ((((i_236_ & 0xff00ff) * i_230_
                                                + ((i_240_ & 0xff00ff)
                                                * i_231_))
                                                & ~0xff00ff)
                                                + (((i_236_ & 0xff00) * i_230_
                                                + ((i_240_ & 0xff00)
                                                * i_231_))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_241_
                                                = ((i_236_ & 0xff0000) * i_227_
                                                & ~0xffffff);
                                        int i_242_
                                                = ((i_236_ & 0xff00) * i_228_
                                                & 0xff0000);
                                        int i_243_ = ((i_236_ & 0xff) * i_229_
                                                & 0xff00);
                                        is[i_175_++]
                                                = (i_241_ | i_242_ | i_243_) >>> 8;
                                    }
                                } else
                                    i_175_++;
                                i_166_ += i_171_;
                            }
                            i_167_ += i_172_;
                            i_166_ = i_218_;
                            i_175_ += i_176_;
                        }
                        return;
                    }
                    return;
                }
                if (i_162_ == 3) {
                    int i_244_ = i_166_;
                    int i_245_ = i_163_ >>> 24;
                    int i_246_ = 256 - i_245_;
                    for (int i_247_ = -i_161_; i_247_ < 0; i_247_++) {
                        int i_248_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_249_ = -i_160_; i_249_ < 0; i_249_++) {
                            byte i_250_
                                    = aByteArray9934[(i_166_ >> 16) + i_248_];
                            int i_251_
                                    = i_250_ > 0 ? anIntArray9935[i_250_] : 0;
                            int i_252_ = i_251_ + i_163_;
                            int i_253_
                                    = (i_251_ & 0xff00ff) + (i_163_ & 0xff00ff);
                            int i_254_ = ((i_253_ & 0x1000100)
                                    + (i_252_ - i_253_ & 0x10000));
                            i_254_ = i_252_ - i_254_ | i_254_ - (i_254_ >>> 8);
                            if (i_251_ == 0 && i_245_ != 255) {
                                i_251_ = i_254_;
                                i_254_ = is[i_175_];
                                i_254_ = ((((i_251_ & 0xff00ff) * i_245_
                                        + (i_254_ & 0xff00ff) * i_246_)
                                        & ~0xff00ff)
                                        + (((i_251_ & 0xff00) * i_245_
                                        + (i_254_ & 0xff00) * i_246_)
                                        & 0xff0000)) >> 8;
                            }
                            is[i_175_++] = i_254_;
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_244_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                if (i_162_ == 2) {
                    int i_255_ = i_163_ >>> 24;
                    int i_256_ = 256 - i_255_;
                    int i_257_ = (i_163_ & 0xff00ff) * i_256_ & ~0xff00ff;
                    int i_258_ = (i_163_ & 0xff00) * i_256_ & 0xff0000;
                    i_163_ = (i_257_ | i_258_) >>> 8;
                    int i_259_ = i_166_;
                    for (int i_260_ = -i_161_; i_260_ < 0; i_260_++) {
                        int i_261_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_262_ = -i_160_; i_262_ < 0; i_262_++) {
                            int i_263_
                                    = aByteArray9934[(i_166_ >> 16) + i_261_];
                            if (i_263_ != 0) {
                                int i_264_ = anIntArray9935[i_263_ & 0xff];
                                i_257_
                                        = (i_264_ & 0xff00ff) * i_255_ & ~0xff00ff;
                                i_258_ = (i_264_ & 0xff00) * i_255_ & 0xff0000;
                                is[i_175_++]
                                        = ((i_257_ | i_258_) >>> 8) + i_163_;
                            } else
                                i_175_++;
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_259_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_164_ == 2) {
                if (i_162_ == 1) {
                    int i_265_ = i_166_;
                    for (int i_266_ = -i_161_; i_266_ < 0; i_266_++) {
                        int i_267_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_268_ = -i_160_; i_268_ < 0; i_268_++) {
                            int i_269_
                                    = aByteArray9934[(i_166_ >> 16) + i_267_];
                            if (i_269_ != 0) {
                                int i_270_ = anIntArray9935[i_269_ & 0xff];
                                int i_271_ = is[i_175_];
                                int i_272_ = i_270_ + i_271_;
                                int i_273_ = ((i_270_ & 0xff00ff)
                                        + (i_271_ & 0xff00ff));
                                i_271_
                                        = (i_273_ & 0x1000100) + (i_272_ - i_273_
                                        & 0x10000);
                                is[i_175_++]
                                        = i_272_ - i_271_ | i_271_ - (i_271_
                                        >>> 8);
                            } else
                                i_175_++;
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_265_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                if (i_162_ == 0) {
                    int i_274_ = i_166_;
                    int i_275_ = (i_163_ & 0xff0000) >> 16;
                    int i_276_ = (i_163_ & 0xff00) >> 8;
                    int i_277_ = i_163_ & 0xff;
                    for (int i_278_ = -i_161_; i_278_ < 0; i_278_++) {
                        int i_279_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_280_ = -i_160_; i_280_ < 0; i_280_++) {
                            int i_281_
                                    = aByteArray9934[(i_166_ >> 16) + i_279_];
                            if (i_281_ != 0) {
                                int i_282_ = anIntArray9935[i_281_ & 0xff];
                                int i_283_
                                        = (i_282_ & 0xff0000) * i_275_ & ~0xffffff;
                                int i_284_
                                        = (i_282_ & 0xff00) * i_276_ & 0xff0000;
                                int i_285_ = (i_282_ & 0xff) * i_277_ & 0xff00;
                                i_282_ = (i_283_ | i_284_ | i_285_) >>> 8;
                                int i_286_ = is[i_175_];
                                int i_287_ = i_282_ + i_286_;
                                int i_288_ = ((i_282_ & 0xff00ff)
                                        + (i_286_ & 0xff00ff));
                                i_286_
                                        = (i_288_ & 0x1000100) + (i_287_ - i_288_
                                        & 0x10000);
                                is[i_175_++]
                                        = i_287_ - i_286_ | i_286_ - (i_286_
                                        >>> 8);
                            } else
                                i_175_++;
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_274_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                if (i_162_ == 3) {
                    int i_289_ = i_166_;
                    for (int i_290_ = -i_161_; i_290_ < 0; i_290_++) {
                        int i_291_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_292_ = -i_160_; i_292_ < 0; i_292_++) {
                            byte i_293_
                                    = aByteArray9934[(i_166_ >> 16) + i_291_];
                            int i_294_
                                    = i_293_ > 0 ? anIntArray9935[i_293_] : 0;
                            int i_295_ = i_294_ + i_163_;
                            int i_296_
                                    = (i_294_ & 0xff00ff) + (i_163_ & 0xff00ff);
                            int i_297_ = ((i_296_ & 0x1000100)
                                    + (i_295_ - i_296_ & 0x10000));
                            i_294_ = i_295_ - i_297_ | i_297_ - (i_297_ >>> 8);
                            i_297_ = is[i_175_];
                            i_295_ = i_294_ + i_297_;
                            i_296_ = (i_294_ & 0xff00ff) + (i_297_ & 0xff00ff);
                            i_297_ = (i_296_ & 0x1000100) + (i_295_ - i_296_
                                    & 0x10000);
                            is[i_175_++]
                                    = i_295_ - i_297_ | i_297_ - (i_297_ >>> 8);
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_289_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                if (i_162_ == 2) {
                    int i_298_ = i_163_ >>> 24;
                    int i_299_ = 256 - i_298_;
                    int i_300_ = (i_163_ & 0xff00ff) * i_299_ & ~0xff00ff;
                    int i_301_ = (i_163_ & 0xff00) * i_299_ & 0xff0000;
                    i_163_ = (i_300_ | i_301_) >>> 8;
                    int i_302_ = i_166_;
                    for (int i_303_ = -i_161_; i_303_ < 0; i_303_++) {
                        int i_304_ = ((i_167_ >> 16)
                                * ((Class105_Sub3) this).anInt8471);
                        for (int i_305_ = -i_160_; i_305_ < 0; i_305_++) {
                            int i_306_
                                    = aByteArray9934[(i_166_ >> 16) + i_304_];
                            if (i_306_ != 0) {
                                int i_307_ = anIntArray9935[i_306_ & 0xff];
                                i_300_
                                        = (i_307_ & 0xff00ff) * i_298_ & ~0xff00ff;
                                i_301_ = (i_307_ & 0xff00) * i_298_ & 0xff0000;
                                i_307_ = ((i_300_ | i_301_) >>> 8) + i_163_;
                                int i_308_ = is[i_175_];
                                int i_309_ = i_307_ + i_308_;
                                int i_310_ = ((i_307_ & 0xff00ff)
                                        + (i_308_ & 0xff00ff));
                                i_308_
                                        = (i_310_ & 0x1000100) + (i_309_ - i_310_
                                        & 0x10000);
                                is[i_175_++]
                                        = i_309_ - i_308_ | i_308_ - (i_308_
                                        >>> 8);
                            } else
                                i_175_++;
                            i_166_ += i_171_;
                        }
                        i_167_ += i_172_;
                        i_166_ = i_302_;
                        i_175_ += i_176_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method995(int[] is, int[] is_311_, int i, int i_312_) {
        int[] is_313_
                = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anIntArray7483;
        if (Class105_Sub3.anInt8481 == 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_314_ = Class105_Sub3.anInt8468;
                while (i_314_ < 0) {
                    int i_315_ = i_314_ + i_312_;
                    if (i_315_ >= 0) {
                        if (i_315_ >= is.length)
                            break;
                        int i_316_ = Class105_Sub3.anInt8451;
                        int i_317_ = Class105_Sub3.anInt8458;
                        int i_318_ = Class105_Sub3.anInt8467;
                        int i_319_ = Class105_Sub3.anInt8478;
                        if (i_317_ >= 0 && i_318_ >= 0
                                && i_317_ - (((Class105_Sub3) this).anInt8471
                                << 12) < 0
                                && i_318_ - (((Class105_Sub3) this).anInt8470
                                << 12) < 0) {
                            int i_320_ = is[i_315_] - i;
                            int i_321_ = -is_311_[i_315_];
                            int i_322_
                                    = i_320_ - (i_316_ - Class105_Sub3.anInt8451);
                            if (i_322_ > 0) {
                                i_316_ += i_322_;
                                i_319_ += i_322_;
                                i_317_ += Class105_Sub3.anInt8481 * i_322_;
                                i_318_ += Class105_Sub3.anInt8450 * i_322_;
                            } else
                                i_321_ -= i_322_;
                            if (i_319_ < i_321_)
                                i_319_ = i_321_;
                            for (/**/; i_319_ < 0; i_319_++) {
                                int i_323_
                                        = (aByteArray9934
                                        [(((i_318_ >> 12)
                                        * ((Class105_Sub3) this).anInt8471)
                                        + (i_317_ >> 12))]);
                                if (i_323_ != 0)
                                    is_313_[i_316_++]
                                            = anIntArray9935[i_323_ & 0xff];
                                else
                                    i_316_++;
                            }
                        }
                    }
                    i_314_++;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_324_ = Class105_Sub3.anInt8468;
                while (i_324_ < 0) {
                    int i_325_ = i_324_ + i_312_;
                    if (i_325_ >= 0) {
                        if (i_325_ >= is.length)
                            break;
                        int i_326_ = Class105_Sub3.anInt8451;
                        int i_327_ = Class105_Sub3.anInt8458;
                        int i_328_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_329_ = Class105_Sub3.anInt8478;
                        if (i_327_ >= 0
                                && i_327_ - (((Class105_Sub3) this).anInt8471
                                << 12) < 0) {
                            int i_330_;
                            if ((i_330_
                                    = i_328_ - (((Class105_Sub3) this).anInt8470
                                    << 12))
                                    >= 0) {
                                i_330_ = ((Class105_Sub3.anInt8450 - i_330_)
                                        / Class105_Sub3.anInt8450);
                                i_329_ += i_330_;
                                i_328_ += Class105_Sub3.anInt8450 * i_330_;
                                i_326_ += i_330_;
                            }
                            if ((i_330_ = ((i_328_ - Class105_Sub3.anInt8450)
                                    / Class105_Sub3.anInt8450))
                                    > i_329_)
                                i_329_ = i_330_;
                            int i_331_ = is[i_325_] - i;
                            int i_332_ = -is_311_[i_325_];
                            int i_333_
                                    = i_331_ - (i_326_ - Class105_Sub3.anInt8451);
                            if (i_333_ > 0) {
                                i_326_ += i_333_;
                                i_329_ += i_333_;
                                i_327_ += Class105_Sub3.anInt8481 * i_333_;
                                i_328_ += Class105_Sub3.anInt8450 * i_333_;
                            } else
                                i_332_ -= i_333_;
                            if (i_329_ < i_332_)
                                i_329_ = i_332_;
                            for (/**/; i_329_ < 0; i_329_++) {
                                int i_334_
                                        = (aByteArray9934
                                        [(((i_328_ >> 12)
                                        * ((Class105_Sub3) this).anInt8471)
                                        + (i_327_ >> 12))]);
                                if (i_334_ != 0)
                                    is_313_[i_326_++]
                                            = anIntArray9935[i_334_ & 0xff];
                                else
                                    i_326_++;
                                i_328_ += Class105_Sub3.anInt8450;
                            }
                        }
                    }
                    i_324_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_335_ = Class105_Sub3.anInt8468;
                while (i_335_ < 0) {
                    int i_336_ = i_335_ + i_312_;
                    if (i_336_ >= 0) {
                        if (i_336_ >= is.length)
                            break;
                        int i_337_ = Class105_Sub3.anInt8451;
                        int i_338_ = Class105_Sub3.anInt8458;
                        int i_339_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_340_ = Class105_Sub3.anInt8478;
                        if (i_338_ >= 0
                                && i_338_ - (((Class105_Sub3) this).anInt8471
                                << 12) < 0) {
                            if (i_339_ < 0) {
                                int i_341_
                                        = ((Class105_Sub3.anInt8450 - 1 - i_339_)
                                        / Class105_Sub3.anInt8450);
                                i_340_ += i_341_;
                                i_339_ += Class105_Sub3.anInt8450 * i_341_;
                                i_337_ += i_341_;
                            }
                            int i_342_;
                            if ((i_342_
                                    = ((1 + i_339_
                                    - (((Class105_Sub3) this).anInt8470 << 12)
                                    - Class105_Sub3.anInt8450)
                                    / Class105_Sub3.anInt8450))
                                    > i_340_)
                                i_340_ = i_342_;
                            int i_343_ = is[i_336_] - i;
                            int i_344_ = -is_311_[i_336_];
                            int i_345_
                                    = i_343_ - (i_337_ - Class105_Sub3.anInt8451);
                            if (i_345_ > 0) {
                                i_337_ += i_345_;
                                i_340_ += i_345_;
                                i_338_ += Class105_Sub3.anInt8481 * i_345_;
                                i_339_ += Class105_Sub3.anInt8450 * i_345_;
                            } else
                                i_344_ -= i_345_;
                            if (i_340_ < i_344_)
                                i_340_ = i_344_;
                            for (/**/; i_340_ < 0; i_340_++) {
                                int i_346_
                                        = (aByteArray9934
                                        [(((i_339_ >> 12)
                                        * ((Class105_Sub3) this).anInt8471)
                                        + (i_338_ >> 12))]);
                                if (i_346_ != 0)
                                    is_313_[i_337_++]
                                            = anIntArray9935[i_346_ & 0xff];
                                else
                                    i_337_++;
                                i_339_ += Class105_Sub3.anInt8450;
                            }
                        }
                    }
                    i_335_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8481 < 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_347_ = Class105_Sub3.anInt8468;
                while (i_347_ < 0) {
                    int i_348_ = i_347_ + i_312_;
                    if (i_348_ >= 0) {
                        if (i_348_ >= is.length)
                            break;
                        int i_349_ = Class105_Sub3.anInt8451;
                        int i_350_ = (Class105_Sub3.anInt8458
                                + Class105_Sub3.anInt8479);
                        int i_351_ = Class105_Sub3.anInt8467;
                        int i_352_ = Class105_Sub3.anInt8478;
                        if (i_351_ >= 0
                                && i_351_ - (((Class105_Sub3) this).anInt8470
                                << 12) < 0) {
                            int i_353_;
                            if ((i_353_
                                    = i_350_ - (((Class105_Sub3) this).anInt8471
                                    << 12))
                                    >= 0) {
                                i_353_ = ((Class105_Sub3.anInt8481 - i_353_)
                                        / Class105_Sub3.anInt8481);
                                i_352_ += i_353_;
                                i_350_ += Class105_Sub3.anInt8481 * i_353_;
                                i_349_ += i_353_;
                            }
                            if ((i_353_ = ((i_350_ - Class105_Sub3.anInt8481)
                                    / Class105_Sub3.anInt8481))
                                    > i_352_)
                                i_352_ = i_353_;
                            int i_354_ = is[i_348_] - i;
                            int i_355_ = -is_311_[i_348_];
                            int i_356_
                                    = i_354_ - (i_349_ - Class105_Sub3.anInt8451);
                            if (i_356_ > 0) {
                                i_349_ += i_356_;
                                i_352_ += i_356_;
                                i_350_ += Class105_Sub3.anInt8481 * i_356_;
                                i_351_ += Class105_Sub3.anInt8450 * i_356_;
                            } else
                                i_355_ -= i_356_;
                            if (i_352_ < i_355_)
                                i_352_ = i_355_;
                            for (/**/; i_352_ < 0; i_352_++) {
                                int i_357_
                                        = (aByteArray9934
                                        [(((i_351_ >> 12)
                                        * ((Class105_Sub3) this).anInt8471)
                                        + (i_350_ >> 12))]);
                                if (i_357_ != 0)
                                    is_313_[i_349_++]
                                            = anIntArray9935[i_357_ & 0xff];
                                else
                                    i_349_++;
                                i_350_ += Class105_Sub3.anInt8481;
                            }
                        }
                    }
                    i_347_++;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_358_ = Class105_Sub3.anInt8468;
                while (i_358_ < 0) {
                    int i_359_ = i_358_ + i_312_;
                    if (i_359_ >= 0) {
                        if (i_359_ >= is.length)
                            break;
                        int i_360_ = Class105_Sub3.anInt8451;
                        int i_361_ = (Class105_Sub3.anInt8458
                                + Class105_Sub3.anInt8479);
                        int i_362_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_363_ = Class105_Sub3.anInt8478;
                        int i_364_;
                        if ((i_364_
                                = i_361_ - (((Class105_Sub3) this).anInt8471
                                << 12))
                                >= 0) {
                            i_364_ = ((Class105_Sub3.anInt8481 - i_364_)
                                    / Class105_Sub3.anInt8481);
                            i_363_ += i_364_;
                            i_361_ += Class105_Sub3.anInt8481 * i_364_;
                            i_362_ += Class105_Sub3.anInt8450 * i_364_;
                            i_360_ += i_364_;
                        }
                        if ((i_364_ = ((i_361_ - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_363_)
                            i_363_ = i_364_;
                        if ((i_364_
                                = i_362_ - (((Class105_Sub3) this).anInt8470
                                << 12))
                                >= 0) {
                            i_364_ = ((Class105_Sub3.anInt8450 - i_364_)
                                    / Class105_Sub3.anInt8450);
                            i_363_ += i_364_;
                            i_361_ += Class105_Sub3.anInt8481 * i_364_;
                            i_362_ += Class105_Sub3.anInt8450 * i_364_;
                            i_360_ += i_364_;
                        }
                        if ((i_364_ = ((i_362_ - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_363_)
                            i_363_ = i_364_;
                        int i_365_ = is[i_359_] - i;
                        int i_366_ = -is_311_[i_359_];
                        int i_367_
                                = i_365_ - (i_360_ - Class105_Sub3.anInt8451);
                        if (i_367_ > 0) {
                            i_360_ += i_367_;
                            i_363_ += i_367_;
                            i_361_ += Class105_Sub3.anInt8481 * i_367_;
                            i_362_ += Class105_Sub3.anInt8450 * i_367_;
                        } else
                            i_366_ -= i_367_;
                        if (i_363_ < i_366_)
                            i_363_ = i_366_;
                        for (/**/; i_363_ < 0; i_363_++) {
                            int i_368_
                                    = (aByteArray9934
                                    [(((i_362_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_361_ >> 12))]);
                            if (i_368_ != 0)
                                is_313_[i_360_++]
                                        = anIntArray9935[i_368_ & 0xff];
                            else
                                i_360_++;
                            i_361_ += Class105_Sub3.anInt8481;
                            i_362_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_358_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_369_ = Class105_Sub3.anInt8468;
                while (i_369_ < 0) {
                    int i_370_ = i_369_ + i_312_;
                    if (i_370_ >= 0) {
                        if (i_370_ >= is.length)
                            break;
                        int i_371_ = Class105_Sub3.anInt8451;
                        int i_372_ = (Class105_Sub3.anInt8458
                                + Class105_Sub3.anInt8479);
                        int i_373_ = (Class105_Sub3.anInt8467
                                + Class105_Sub3.anInt8475);
                        int i_374_ = Class105_Sub3.anInt8478;
                        int i_375_;
                        if ((i_375_
                                = i_372_ - (((Class105_Sub3) this).anInt8471
                                << 12))
                                >= 0) {
                            i_375_ = ((Class105_Sub3.anInt8481 - i_375_)
                                    / Class105_Sub3.anInt8481);
                            i_374_ += i_375_;
                            i_372_ += Class105_Sub3.anInt8481 * i_375_;
                            i_373_ += Class105_Sub3.anInt8450 * i_375_;
                            i_371_ += i_375_;
                        }
                        if ((i_375_ = ((i_372_ - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_374_)
                            i_374_ = i_375_;
                        if (i_373_ < 0) {
                            i_375_ = ((Class105_Sub3.anInt8450 - 1 - i_373_)
                                    / Class105_Sub3.anInt8450);
                            i_374_ += i_375_;
                            i_372_ += Class105_Sub3.anInt8481 * i_375_;
                            i_373_ += Class105_Sub3.anInt8450 * i_375_;
                            i_371_ += i_375_;
                        }
                        if ((i_375_
                                = ((1 + i_373_
                                - (((Class105_Sub3) this).anInt8470 << 12)
                                - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_374_)
                            i_374_ = i_375_;
                        int i_376_ = is[i_370_] - i;
                        int i_377_ = -is_311_[i_370_];
                        int i_378_
                                = i_376_ - (i_371_ - Class105_Sub3.anInt8451);
                        if (i_378_ > 0) {
                            i_371_ += i_378_;
                            i_374_ += i_378_;
                            i_372_ += Class105_Sub3.anInt8481 * i_378_;
                            i_373_ += Class105_Sub3.anInt8450 * i_378_;
                        } else
                            i_377_ -= i_378_;
                        if (i_374_ < i_377_)
                            i_374_ = i_377_;
                        for (/**/; i_374_ < 0; i_374_++) {
                            int i_379_
                                    = (aByteArray9934
                                    [(((i_373_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_372_ >> 12))]);
                            if (i_379_ != 0)
                                is_313_[i_371_++]
                                        = anIntArray9935[i_379_ & 0xff];
                            else
                                i_371_++;
                            i_372_ += Class105_Sub3.anInt8481;
                            i_373_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_369_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8450 == 0) {
            int i_380_ = Class105_Sub3.anInt8468;
            while (i_380_ < 0) {
                int i_381_ = i_380_ + i_312_;
                if (i_381_ >= 0) {
                    if (i_381_ >= is.length)
                        break;
                    int i_382_ = Class105_Sub3.anInt8451;
                    int i_383_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_384_ = Class105_Sub3.anInt8467;
                    int i_385_ = Class105_Sub3.anInt8478;
                    if (i_384_ >= 0
                            && (i_384_ - (((Class105_Sub3) this).anInt8470 << 12)
                            < 0)) {
                        if (i_383_ < 0) {
                            int i_386_
                                    = ((Class105_Sub3.anInt8481 - 1 - i_383_)
                                    / Class105_Sub3.anInt8481);
                            i_385_ += i_386_;
                            i_383_ += Class105_Sub3.anInt8481 * i_386_;
                            i_382_ += i_386_;
                        }
                        int i_387_;
                        if ((i_387_
                                = ((1 + i_383_
                                - (((Class105_Sub3) this).anInt8471 << 12)
                                - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_385_)
                            i_385_ = i_387_;
                        int i_388_ = is[i_381_] - i;
                        int i_389_ = -is_311_[i_381_];
                        int i_390_
                                = i_388_ - (i_382_ - Class105_Sub3.anInt8451);
                        if (i_390_ > 0) {
                            i_382_ += i_390_;
                            i_385_ += i_390_;
                            i_383_ += Class105_Sub3.anInt8481 * i_390_;
                            i_384_ += Class105_Sub3.anInt8450 * i_390_;
                        } else
                            i_389_ -= i_390_;
                        if (i_385_ < i_389_)
                            i_385_ = i_389_;
                        for (/**/; i_385_ < 0; i_385_++) {
                            int i_391_
                                    = (aByteArray9934
                                    [(((i_384_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_383_ >> 12))]);
                            if (i_391_ != 0)
                                is_313_[i_382_++]
                                        = anIntArray9935[i_391_ & 0xff];
                            else
                                i_382_++;
                            i_383_ += Class105_Sub3.anInt8481;
                        }
                    }
                }
                i_380_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else if (Class105_Sub3.anInt8450 < 0) {
            int i_392_ = Class105_Sub3.anInt8468;
            while (i_392_ < 0) {
                int i_393_ = i_392_ + i_312_;
                if (i_393_ >= 0) {
                    if (i_393_ >= is.length)
                        break;
                    int i_394_ = Class105_Sub3.anInt8451;
                    int i_395_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_396_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_397_ = Class105_Sub3.anInt8478;
                    if (i_395_ < 0) {
                        int i_398_ = ((Class105_Sub3.anInt8481 - 1 - i_395_)
                                / Class105_Sub3.anInt8481);
                        i_397_ += i_398_;
                        i_395_ += Class105_Sub3.anInt8481 * i_398_;
                        i_396_ += Class105_Sub3.anInt8450 * i_398_;
                        i_394_ += i_398_;
                    }
                    int i_399_;
                    if ((i_399_ = ((1 + i_395_
                            - (((Class105_Sub3) this).anInt8471 << 12)
                            - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_397_)
                        i_397_ = i_399_;
                    if ((i_399_
                            = i_396_ - (((Class105_Sub3) this).anInt8470 << 12))
                            >= 0) {
                        i_399_ = ((Class105_Sub3.anInt8450 - i_399_)
                                / Class105_Sub3.anInt8450);
                        i_397_ += i_399_;
                        i_395_ += Class105_Sub3.anInt8481 * i_399_;
                        i_396_ += Class105_Sub3.anInt8450 * i_399_;
                        i_394_ += i_399_;
                    }
                    if ((i_399_ = ((i_396_ - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_397_)
                        i_397_ = i_399_;
                    int i_400_ = is[i_393_] - i;
                    int i_401_ = -is_311_[i_393_];
                    int i_402_ = i_400_ - (i_394_ - Class105_Sub3.anInt8451);
                    if (i_402_ > 0) {
                        i_394_ += i_402_;
                        i_397_ += i_402_;
                        i_395_ += Class105_Sub3.anInt8481 * i_402_;
                        i_396_ += Class105_Sub3.anInt8450 * i_402_;
                    } else
                        i_401_ -= i_402_;
                    if (i_397_ < i_401_)
                        i_397_ = i_401_;
                    for (/**/; i_397_ < 0; i_397_++) {
                        int i_403_ = (aByteArray9934
                                [(((i_396_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_395_ >> 12))]);
                        if (i_403_ != 0)
                            is_313_[i_394_++] = anIntArray9935[i_403_ & 0xff];
                        else
                            i_394_++;
                        i_395_ += Class105_Sub3.anInt8481;
                        i_396_ += Class105_Sub3.anInt8450;
                    }
                }
                i_392_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else {
            int i_404_ = Class105_Sub3.anInt8468;
            while (i_404_ < 0) {
                int i_405_ = i_404_ + i_312_;
                if (i_405_ >= 0) {
                    if (i_405_ >= is.length)
                        break;
                    int i_406_ = Class105_Sub3.anInt8451;
                    int i_407_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_408_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_409_ = Class105_Sub3.anInt8478;
                    if (i_407_ < 0) {
                        int i_410_ = ((Class105_Sub3.anInt8481 - 1 - i_407_)
                                / Class105_Sub3.anInt8481);
                        i_409_ += i_410_;
                        i_407_ += Class105_Sub3.anInt8481 * i_410_;
                        i_408_ += Class105_Sub3.anInt8450 * i_410_;
                        i_406_ += i_410_;
                    }
                    int i_411_;
                    if ((i_411_ = ((1 + i_407_
                            - (((Class105_Sub3) this).anInt8471 << 12)
                            - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_409_)
                        i_409_ = i_411_;
                    if (i_408_ < 0) {
                        i_411_ = ((Class105_Sub3.anInt8450 - 1 - i_408_)
                                / Class105_Sub3.anInt8450);
                        i_409_ += i_411_;
                        i_407_ += Class105_Sub3.anInt8481 * i_411_;
                        i_408_ += Class105_Sub3.anInt8450 * i_411_;
                        i_406_ += i_411_;
                    }
                    if ((i_411_ = ((1 + i_408_
                            - (((Class105_Sub3) this).anInt8470 << 12)
                            - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_409_)
                        i_409_ = i_411_;
                    int i_412_ = is[i_405_] - i;
                    int i_413_ = -is_311_[i_405_];
                    int i_414_ = i_412_ - (i_406_ - Class105_Sub3.anInt8451);
                    if (i_414_ > 0) {
                        i_406_ += i_414_;
                        i_409_ += i_414_;
                        i_407_ += Class105_Sub3.anInt8481 * i_414_;
                        i_408_ += Class105_Sub3.anInt8450 * i_414_;
                    } else
                        i_413_ -= i_414_;
                    if (i_409_ < i_413_)
                        i_409_ = i_413_;
                    for (/**/; i_409_ < 0; i_409_++) {
                        int i_415_ = (aByteArray9934
                                [(((i_408_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_407_ >> 12))]);
                        if (i_415_ != 0)
                            is_313_[i_406_++] = anIntArray9935[i_415_ & 0xff];
                        else
                            i_406_++;
                        i_407_ += Class105_Sub3.anInt8481;
                        i_408_ += Class105_Sub3.anInt8450;
                    }
                }
                i_404_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        }
    }

    Class105_Sub3_Sub2(ha_Sub1 var_ha_Sub1, byte[] is, int[] is_416_, int i,
                       int i_417_) {
        super(var_ha_Sub1, i, i_417_);
        aByteArray9934 = is;
        anIntArray9935 = is_416_;
    }

    final void method994(int i, int i_418_) {
        int[] is
                = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anIntArray7483;
        if (Class105_Sub3.anInt8481 == 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_419_ = Class105_Sub3.anInt8468;
                while (i_419_ < 0) {
                    int i_420_ = Class105_Sub3.anInt8451;
                    int i_421_ = Class105_Sub3.anInt8458;
                    int i_422_ = Class105_Sub3.anInt8467;
                    int i_423_ = Class105_Sub3.anInt8478;
                    if (i_421_ >= 0 && i_422_ >= 0
                            && (i_421_ - (((Class105_Sub3) this).anInt8471 << 12)
                            < 0)
                            && (i_422_ - (((Class105_Sub3) this).anInt8470 << 12)
                            < 0)) {
                        for (/**/; i_423_ < 0; i_423_++) {
                            int i_424_ = (((i_422_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_421_ >> 12));
                            int i_425_ = i_420_++;
                            int[] is_426_ = is;
                            int i_427_ = i;
                            int i_428_ = i_418_;
                            if (i_428_ == 0) {
                                if (i_427_ == 1)
                                    is_426_[i_425_]
                                            = (anIntArray9935
                                            [aByteArray9934[i_424_] & 0xff]);
                                else if (i_427_ == 0) {
                                    int i_429_
                                            = (anIntArray9935
                                            [aByteArray9934[i_424_] & 0xff]);
                                    int i_430_ = (((i_429_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_431_ = (((i_429_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_432_ = (((i_429_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_426_[i_425_]
                                            = (i_430_ | i_431_ | i_432_) >>> 8;
                                } else if (i_427_ == 3) {
                                    int i_433_
                                            = (anIntArray9935
                                            [aByteArray9934[i_424_] & 0xff]);
                                    int i_434_ = Class105_Sub3.anInt8480;
                                    int i_435_ = i_433_ + i_434_;
                                    int i_436_ = ((i_433_ & 0xff00ff)
                                            + (i_434_ & 0xff00ff));
                                    int i_437_
                                            = ((i_436_ & 0x1000100)
                                            + (i_435_ - i_436_ & 0x10000));
                                    is_426_[i_425_]
                                            = i_435_ - i_437_ | i_437_ - (i_437_
                                            >>> 8);
                                } else if (i_427_ == 2) {
                                    int i_438_
                                            = (anIntArray9935
                                            [aByteArray9934[i_424_] & 0xff]);
                                    int i_439_ = (((i_438_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_440_ = (((i_438_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_426_[i_425_]
                                            = (((i_439_ | i_440_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_428_ == 1) {
                                if (i_427_ == 1) {
                                    int i_441_ = aByteArray9934[i_424_];
                                    if (i_441_ != 0)
                                        is_426_[i_425_]
                                                = anIntArray9935[i_441_ & 0xff];
                                } else if (i_427_ == 0) {
                                    int i_442_ = aByteArray9934[i_424_];
                                    if (i_442_ != 0) {
                                        int i_443_
                                                = anIntArray9935[i_442_ & 0xff];
                                        if ((Class105_Sub3.anInt8480
                                                & 0xffffff)
                                                == 16777215) {
                                            int i_444_
                                                    = (Class105_Sub3.anInt8480
                                                    >>> 24);
                                            int i_445_ = 256 - i_444_;
                                            int i_446_ = is_426_[i_425_];
                                            is_426_[i_425_]
                                                    = (((((i_443_ & 0xff00ff)
                                                    * i_444_)
                                                    + ((i_446_ & 0xff00ff)
                                                    * i_445_))
                                                    & ~0xff00ff)
                                                    + ((((i_443_ & 0xff00)
                                                    * i_444_)
                                                    + ((i_446_ & 0xff00)
                                                    * i_445_))
                                                    & 0xff0000)) >> 8;
                                        } else if (Class105_Sub3.anInt8477
                                                != 255) {
                                            int i_447_
                                                    = (((i_443_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_448_
                                                    = (((i_443_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_449_
                                                    = (((i_443_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            i_443_ = (i_447_ | i_448_
                                                    | i_449_) >>> 8;
                                            int i_450_ = is_426_[i_425_];
                                            is_426_[i_425_]
                                                    = (((((i_443_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_450_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & ~0xff00ff)
                                                    + ((((i_443_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_450_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & 0xff0000)) >> 8;
                                        } else {
                                            int i_451_
                                                    = (((i_443_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_452_
                                                    = (((i_443_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_453_
                                                    = (((i_443_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            is_426_[i_425_] = (i_451_ | i_452_
                                                    | i_453_) >>> 8;
                                        }
                                    }
                                } else if (i_427_ == 3) {
                                    byte i_454_ = aByteArray9934[i_424_];
                                    int i_455_
                                            = (i_454_ > 0 ? anIntArray9935[i_454_]
                                            : 0);
                                    int i_456_ = Class105_Sub3.anInt8480;
                                    int i_457_ = i_455_ + i_456_;
                                    int i_458_ = ((i_455_ & 0xff00ff)
                                            + (i_456_ & 0xff00ff));
                                    int i_459_
                                            = ((i_458_ & 0x1000100)
                                            + (i_457_ - i_458_ & 0x10000));
                                    i_459_
                                            = i_457_ - i_459_ | i_459_ - (i_459_
                                            >>> 8);
                                    if (i_455_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_455_ = i_459_;
                                        i_459_ = is_426_[i_425_];
                                        i_459_
                                                = (((((i_455_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_459_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_455_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_459_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_426_[i_425_] = i_459_;
                                } else if (i_427_ == 2) {
                                    int i_460_ = aByteArray9934[i_424_];
                                    if (i_460_ != 0) {
                                        int i_461_
                                                = anIntArray9935[i_460_ & 0xff];
                                        int i_462_
                                                = (((i_461_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_463_
                                                = (((i_461_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        is_426_[i_425_++]
                                                = (((i_462_ | i_463_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_428_ == 2) {
                                if (i_427_ == 1) {
                                    int i_464_ = aByteArray9934[i_424_];
                                    if (i_464_ != 0) {
                                        int i_465_
                                                = anIntArray9935[i_464_ & 0xff];
                                        int i_466_ = is_426_[i_425_];
                                        int i_467_ = i_465_ + i_466_;
                                        int i_468_ = ((i_465_ & 0xff00ff)
                                                + (i_466_ & 0xff00ff));
                                        i_466_
                                                = ((i_468_ & 0x1000100)
                                                + (i_467_ - i_468_ & 0x10000));
                                        is_426_[i_425_]
                                                = (i_467_ - i_466_
                                                | i_466_ - (i_466_ >>> 8));
                                    }
                                } else if (i_427_ == 0) {
                                    int i_469_ = aByteArray9934[i_424_];
                                    if (i_469_ != 0) {
                                        int i_470_
                                                = anIntArray9935[i_469_ & 0xff];
                                        int i_471_
                                                = (((i_470_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_472_
                                                = (((i_470_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_473_
                                                = (((i_470_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_470_
                                                = (i_471_ | i_472_ | i_473_) >>> 8;
                                        int i_474_ = is_426_[i_425_];
                                        int i_475_ = i_470_ + i_474_;
                                        int i_476_ = ((i_470_ & 0xff00ff)
                                                + (i_474_ & 0xff00ff));
                                        i_474_
                                                = ((i_476_ & 0x1000100)
                                                + (i_475_ - i_476_ & 0x10000));
                                        is_426_[i_425_]
                                                = (i_475_ - i_474_
                                                | i_474_ - (i_474_ >>> 8));
                                    }
                                } else if (i_427_ == 3) {
                                    byte i_477_ = aByteArray9934[i_424_];
                                    int i_478_
                                            = (i_477_ > 0 ? anIntArray9935[i_477_]
                                            : 0);
                                    int i_479_ = Class105_Sub3.anInt8480;
                                    int i_480_ = i_478_ + i_479_;
                                    int i_481_ = ((i_478_ & 0xff00ff)
                                            + (i_479_ & 0xff00ff));
                                    int i_482_
                                            = ((i_481_ & 0x1000100)
                                            + (i_480_ - i_481_ & 0x10000));
                                    i_482_
                                            = i_480_ - i_482_ | i_482_ - (i_482_
                                            >>> 8);
                                    if (i_478_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_478_ = i_482_;
                                        i_482_ = is_426_[i_425_];
                                        i_482_
                                                = (((((i_478_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_482_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_478_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_482_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_426_[i_425_] = i_482_;
                                } else if (i_427_ == 2) {
                                    int i_483_ = aByteArray9934[i_424_];
                                    if (i_483_ != 0) {
                                        int i_484_
                                                = anIntArray9935[i_483_ & 0xff];
                                        int i_485_
                                                = (((i_484_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_486_
                                                = (((i_484_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        i_484_ = (((i_485_ | i_486_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                        int i_487_ = is_426_[i_425_];
                                        int i_488_ = i_484_ + i_487_;
                                        int i_489_ = ((i_484_ & 0xff00ff)
                                                + (i_487_ & 0xff00ff));
                                        i_487_
                                                = ((i_489_ & 0x1000100)
                                                + (i_488_ - i_489_ & 0x10000));
                                        is_426_[i_425_]
                                                = (i_488_ - i_487_
                                                | i_487_ - (i_487_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                        }
                    }
                    i_419_++;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_490_ = Class105_Sub3.anInt8468;
                while (i_490_ < 0) {
                    int i_491_ = Class105_Sub3.anInt8451;
                    int i_492_ = Class105_Sub3.anInt8458;
                    int i_493_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_494_ = Class105_Sub3.anInt8478;
                    if (i_492_ >= 0
                            && (i_492_ - (((Class105_Sub3) this).anInt8471 << 12)
                            < 0)) {
                        int i_495_;
                        if ((i_495_
                                = i_493_ - (((Class105_Sub3) this).anInt8470
                                << 12))
                                >= 0) {
                            i_495_ = ((Class105_Sub3.anInt8450 - i_495_)
                                    / Class105_Sub3.anInt8450);
                            i_494_ += i_495_;
                            i_493_ += Class105_Sub3.anInt8450 * i_495_;
                            i_491_ += i_495_;
                        }
                        if ((i_495_ = ((i_493_ - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_494_)
                            i_494_ = i_495_;
                        for (/**/; i_494_ < 0; i_494_++) {
                            int i_496_ = (((i_493_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_492_ >> 12));
                            int i_497_ = i_491_++;
                            int[] is_498_ = is;
                            int i_499_ = i;
                            int i_500_ = i_418_;
                            if (i_500_ == 0) {
                                if (i_499_ == 1)
                                    is_498_[i_497_]
                                            = (anIntArray9935
                                            [aByteArray9934[i_496_] & 0xff]);
                                else if (i_499_ == 0) {
                                    int i_501_
                                            = (anIntArray9935
                                            [aByteArray9934[i_496_] & 0xff]);
                                    int i_502_ = (((i_501_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_503_ = (((i_501_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_504_ = (((i_501_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_498_[i_497_]
                                            = (i_502_ | i_503_ | i_504_) >>> 8;
                                } else if (i_499_ == 3) {
                                    int i_505_
                                            = (anIntArray9935
                                            [aByteArray9934[i_496_] & 0xff]);
                                    int i_506_ = Class105_Sub3.anInt8480;
                                    int i_507_ = i_505_ + i_506_;
                                    int i_508_ = ((i_505_ & 0xff00ff)
                                            + (i_506_ & 0xff00ff));
                                    int i_509_
                                            = ((i_508_ & 0x1000100)
                                            + (i_507_ - i_508_ & 0x10000));
                                    is_498_[i_497_]
                                            = i_507_ - i_509_ | i_509_ - (i_509_
                                            >>> 8);
                                } else if (i_499_ == 2) {
                                    int i_510_
                                            = (anIntArray9935
                                            [aByteArray9934[i_496_] & 0xff]);
                                    int i_511_ = (((i_510_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_512_ = (((i_510_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_498_[i_497_]
                                            = (((i_511_ | i_512_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_500_ == 1) {
                                if (i_499_ == 1) {
                                    int i_513_ = aByteArray9934[i_496_];
                                    if (i_513_ != 0)
                                        is_498_[i_497_]
                                                = anIntArray9935[i_513_ & 0xff];
                                } else if (i_499_ == 0) {
                                    int i_514_ = aByteArray9934[i_496_];
                                    if (i_514_ != 0) {
                                        int i_515_
                                                = anIntArray9935[i_514_ & 0xff];
                                        if ((Class105_Sub3.anInt8480
                                                & 0xffffff)
                                                == 16777215) {
                                            int i_516_
                                                    = (Class105_Sub3.anInt8480
                                                    >>> 24);
                                            int i_517_ = 256 - i_516_;
                                            int i_518_ = is_498_[i_497_];
                                            is_498_[i_497_]
                                                    = (((((i_515_ & 0xff00ff)
                                                    * i_516_)
                                                    + ((i_518_ & 0xff00ff)
                                                    * i_517_))
                                                    & ~0xff00ff)
                                                    + ((((i_515_ & 0xff00)
                                                    * i_516_)
                                                    + ((i_518_ & 0xff00)
                                                    * i_517_))
                                                    & 0xff0000)) >> 8;
                                        } else if (Class105_Sub3.anInt8477
                                                != 255) {
                                            int i_519_
                                                    = (((i_515_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_520_
                                                    = (((i_515_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_521_
                                                    = (((i_515_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            i_515_ = (i_519_ | i_520_
                                                    | i_521_) >>> 8;
                                            int i_522_ = is_498_[i_497_];
                                            is_498_[i_497_]
                                                    = (((((i_515_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_522_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & ~0xff00ff)
                                                    + ((((i_515_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_522_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & 0xff0000)) >> 8;
                                        } else {
                                            int i_523_
                                                    = (((i_515_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_524_
                                                    = (((i_515_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_525_
                                                    = (((i_515_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            is_498_[i_497_] = (i_523_ | i_524_
                                                    | i_525_) >>> 8;
                                        }
                                    }
                                } else if (i_499_ == 3) {
                                    byte i_526_ = aByteArray9934[i_496_];
                                    int i_527_
                                            = (i_526_ > 0 ? anIntArray9935[i_526_]
                                            : 0);
                                    int i_528_ = Class105_Sub3.anInt8480;
                                    int i_529_ = i_527_ + i_528_;
                                    int i_530_ = ((i_527_ & 0xff00ff)
                                            + (i_528_ & 0xff00ff));
                                    int i_531_
                                            = ((i_530_ & 0x1000100)
                                            + (i_529_ - i_530_ & 0x10000));
                                    i_531_
                                            = i_529_ - i_531_ | i_531_ - (i_531_
                                            >>> 8);
                                    if (i_527_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_527_ = i_531_;
                                        i_531_ = is_498_[i_497_];
                                        i_531_
                                                = (((((i_527_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_531_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_527_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_531_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_498_[i_497_] = i_531_;
                                } else if (i_499_ == 2) {
                                    int i_532_ = aByteArray9934[i_496_];
                                    if (i_532_ != 0) {
                                        int i_533_
                                                = anIntArray9935[i_532_ & 0xff];
                                        int i_534_
                                                = (((i_533_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_535_
                                                = (((i_533_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        is_498_[i_497_++]
                                                = (((i_534_ | i_535_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_500_ == 2) {
                                if (i_499_ == 1) {
                                    int i_536_ = aByteArray9934[i_496_];
                                    if (i_536_ != 0) {
                                        int i_537_
                                                = anIntArray9935[i_536_ & 0xff];
                                        int i_538_ = is_498_[i_497_];
                                        int i_539_ = i_537_ + i_538_;
                                        int i_540_ = ((i_537_ & 0xff00ff)
                                                + (i_538_ & 0xff00ff));
                                        i_538_
                                                = ((i_540_ & 0x1000100)
                                                + (i_539_ - i_540_ & 0x10000));
                                        is_498_[i_497_]
                                                = (i_539_ - i_538_
                                                | i_538_ - (i_538_ >>> 8));
                                    }
                                } else if (i_499_ == 0) {
                                    int i_541_ = aByteArray9934[i_496_];
                                    if (i_541_ != 0) {
                                        int i_542_
                                                = anIntArray9935[i_541_ & 0xff];
                                        int i_543_
                                                = (((i_542_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_544_
                                                = (((i_542_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_545_
                                                = (((i_542_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_542_
                                                = (i_543_ | i_544_ | i_545_) >>> 8;
                                        int i_546_ = is_498_[i_497_];
                                        int i_547_ = i_542_ + i_546_;
                                        int i_548_ = ((i_542_ & 0xff00ff)
                                                + (i_546_ & 0xff00ff));
                                        i_546_
                                                = ((i_548_ & 0x1000100)
                                                + (i_547_ - i_548_ & 0x10000));
                                        is_498_[i_497_]
                                                = (i_547_ - i_546_
                                                | i_546_ - (i_546_ >>> 8));
                                    }
                                } else if (i_499_ == 3) {
                                    byte i_549_ = aByteArray9934[i_496_];
                                    int i_550_
                                            = (i_549_ > 0 ? anIntArray9935[i_549_]
                                            : 0);
                                    int i_551_ = Class105_Sub3.anInt8480;
                                    int i_552_ = i_550_ + i_551_;
                                    int i_553_ = ((i_550_ & 0xff00ff)
                                            + (i_551_ & 0xff00ff));
                                    int i_554_
                                            = ((i_553_ & 0x1000100)
                                            + (i_552_ - i_553_ & 0x10000));
                                    i_554_
                                            = i_552_ - i_554_ | i_554_ - (i_554_
                                            >>> 8);
                                    if (i_550_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_550_ = i_554_;
                                        i_554_ = is_498_[i_497_];
                                        i_554_
                                                = (((((i_550_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_554_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_550_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_554_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_498_[i_497_] = i_554_;
                                } else if (i_499_ == 2) {
                                    int i_555_ = aByteArray9934[i_496_];
                                    if (i_555_ != 0) {
                                        int i_556_
                                                = anIntArray9935[i_555_ & 0xff];
                                        int i_557_
                                                = (((i_556_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_558_
                                                = (((i_556_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        i_556_ = (((i_557_ | i_558_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                        int i_559_ = is_498_[i_497_];
                                        int i_560_ = i_556_ + i_559_;
                                        int i_561_ = ((i_556_ & 0xff00ff)
                                                + (i_559_ & 0xff00ff));
                                        i_559_
                                                = ((i_561_ & 0x1000100)
                                                + (i_560_ - i_561_ & 0x10000));
                                        is_498_[i_497_]
                                                = (i_560_ - i_559_
                                                | i_559_ - (i_559_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_493_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_490_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_562_ = Class105_Sub3.anInt8468;
                while (i_562_ < 0) {
                    int i_563_ = Class105_Sub3.anInt8451;
                    int i_564_ = Class105_Sub3.anInt8458;
                    int i_565_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_566_ = Class105_Sub3.anInt8478;
                    if (i_564_ >= 0
                            && (i_564_ - (((Class105_Sub3) this).anInt8471 << 12)
                            < 0)) {
                        if (i_565_ < 0) {
                            int i_567_
                                    = ((Class105_Sub3.anInt8450 - 1 - i_565_)
                                    / Class105_Sub3.anInt8450);
                            i_566_ += i_567_;
                            i_565_ += Class105_Sub3.anInt8450 * i_567_;
                            i_563_ += i_567_;
                        }
                        int i_568_;
                        if ((i_568_
                                = ((1 + i_565_
                                - (((Class105_Sub3) this).anInt8470 << 12)
                                - Class105_Sub3.anInt8450)
                                / Class105_Sub3.anInt8450))
                                > i_566_)
                            i_566_ = i_568_;
                        for (/**/; i_566_ < 0; i_566_++) {
                            int i_569_ = (((i_565_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_564_ >> 12));
                            int i_570_ = i_563_++;
                            int[] is_571_ = is;
                            int i_572_ = i;
                            int i_573_ = i_418_;
                            if (i_573_ == 0) {
                                if (i_572_ == 1)
                                    is_571_[i_570_]
                                            = (anIntArray9935
                                            [aByteArray9934[i_569_] & 0xff]);
                                else if (i_572_ == 0) {
                                    int i_574_
                                            = (anIntArray9935
                                            [aByteArray9934[i_569_] & 0xff]);
                                    int i_575_ = (((i_574_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_576_ = (((i_574_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_577_ = (((i_574_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_571_[i_570_]
                                            = (i_575_ | i_576_ | i_577_) >>> 8;
                                } else if (i_572_ == 3) {
                                    int i_578_
                                            = (anIntArray9935
                                            [aByteArray9934[i_569_] & 0xff]);
                                    int i_579_ = Class105_Sub3.anInt8480;
                                    int i_580_ = i_578_ + i_579_;
                                    int i_581_ = ((i_578_ & 0xff00ff)
                                            + (i_579_ & 0xff00ff));
                                    int i_582_
                                            = ((i_581_ & 0x1000100)
                                            + (i_580_ - i_581_ & 0x10000));
                                    is_571_[i_570_]
                                            = i_580_ - i_582_ | i_582_ - (i_582_
                                            >>> 8);
                                } else if (i_572_ == 2) {
                                    int i_583_
                                            = (anIntArray9935
                                            [aByteArray9934[i_569_] & 0xff]);
                                    int i_584_ = (((i_583_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_585_ = (((i_583_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_571_[i_570_]
                                            = (((i_584_ | i_585_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_573_ == 1) {
                                if (i_572_ == 1) {
                                    int i_586_ = aByteArray9934[i_569_];
                                    if (i_586_ != 0)
                                        is_571_[i_570_]
                                                = anIntArray9935[i_586_ & 0xff];
                                } else if (i_572_ == 0) {
                                    int i_587_ = aByteArray9934[i_569_];
                                    if (i_587_ != 0) {
                                        int i_588_
                                                = anIntArray9935[i_587_ & 0xff];
                                        if ((Class105_Sub3.anInt8480
                                                & 0xffffff)
                                                == 16777215) {
                                            int i_589_
                                                    = (Class105_Sub3.anInt8480
                                                    >>> 24);
                                            int i_590_ = 256 - i_589_;
                                            int i_591_ = is_571_[i_570_];
                                            is_571_[i_570_]
                                                    = (((((i_588_ & 0xff00ff)
                                                    * i_589_)
                                                    + ((i_591_ & 0xff00ff)
                                                    * i_590_))
                                                    & ~0xff00ff)
                                                    + ((((i_588_ & 0xff00)
                                                    * i_589_)
                                                    + ((i_591_ & 0xff00)
                                                    * i_590_))
                                                    & 0xff0000)) >> 8;
                                        } else if (Class105_Sub3.anInt8477
                                                != 255) {
                                            int i_592_
                                                    = (((i_588_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_593_
                                                    = (((i_588_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_594_
                                                    = (((i_588_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            i_588_ = (i_592_ | i_593_
                                                    | i_594_) >>> 8;
                                            int i_595_ = is_571_[i_570_];
                                            is_571_[i_570_]
                                                    = (((((i_588_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_595_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & ~0xff00ff)
                                                    + ((((i_588_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_595_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & 0xff0000)) >> 8;
                                        } else {
                                            int i_596_
                                                    = (((i_588_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_597_
                                                    = (((i_588_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_598_
                                                    = (((i_588_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            is_571_[i_570_] = (i_596_ | i_597_
                                                    | i_598_) >>> 8;
                                        }
                                    }
                                } else if (i_572_ == 3) {
                                    byte i_599_ = aByteArray9934[i_569_];
                                    int i_600_
                                            = (i_599_ > 0 ? anIntArray9935[i_599_]
                                            : 0);
                                    int i_601_ = Class105_Sub3.anInt8480;
                                    int i_602_ = i_600_ + i_601_;
                                    int i_603_ = ((i_600_ & 0xff00ff)
                                            + (i_601_ & 0xff00ff));
                                    int i_604_
                                            = ((i_603_ & 0x1000100)
                                            + (i_602_ - i_603_ & 0x10000));
                                    i_604_
                                            = i_602_ - i_604_ | i_604_ - (i_604_
                                            >>> 8);
                                    if (i_600_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_600_ = i_604_;
                                        i_604_ = is_571_[i_570_];
                                        i_604_
                                                = (((((i_600_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_604_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_600_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_604_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_571_[i_570_] = i_604_;
                                } else if (i_572_ == 2) {
                                    int i_605_ = aByteArray9934[i_569_];
                                    if (i_605_ != 0) {
                                        int i_606_
                                                = anIntArray9935[i_605_ & 0xff];
                                        int i_607_
                                                = (((i_606_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_608_
                                                = (((i_606_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        is_571_[i_570_++]
                                                = (((i_607_ | i_608_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_573_ == 2) {
                                if (i_572_ == 1) {
                                    int i_609_ = aByteArray9934[i_569_];
                                    if (i_609_ != 0) {
                                        int i_610_
                                                = anIntArray9935[i_609_ & 0xff];
                                        int i_611_ = is_571_[i_570_];
                                        int i_612_ = i_610_ + i_611_;
                                        int i_613_ = ((i_610_ & 0xff00ff)
                                                + (i_611_ & 0xff00ff));
                                        i_611_
                                                = ((i_613_ & 0x1000100)
                                                + (i_612_ - i_613_ & 0x10000));
                                        is_571_[i_570_]
                                                = (i_612_ - i_611_
                                                | i_611_ - (i_611_ >>> 8));
                                    }
                                } else if (i_572_ == 0) {
                                    int i_614_ = aByteArray9934[i_569_];
                                    if (i_614_ != 0) {
                                        int i_615_
                                                = anIntArray9935[i_614_ & 0xff];
                                        int i_616_
                                                = (((i_615_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_617_
                                                = (((i_615_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_618_
                                                = (((i_615_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_615_
                                                = (i_616_ | i_617_ | i_618_) >>> 8;
                                        int i_619_ = is_571_[i_570_];
                                        int i_620_ = i_615_ + i_619_;
                                        int i_621_ = ((i_615_ & 0xff00ff)
                                                + (i_619_ & 0xff00ff));
                                        i_619_
                                                = ((i_621_ & 0x1000100)
                                                + (i_620_ - i_621_ & 0x10000));
                                        is_571_[i_570_]
                                                = (i_620_ - i_619_
                                                | i_619_ - (i_619_ >>> 8));
                                    }
                                } else if (i_572_ == 3) {
                                    byte i_622_ = aByteArray9934[i_569_];
                                    int i_623_
                                            = (i_622_ > 0 ? anIntArray9935[i_622_]
                                            : 0);
                                    int i_624_ = Class105_Sub3.anInt8480;
                                    int i_625_ = i_623_ + i_624_;
                                    int i_626_ = ((i_623_ & 0xff00ff)
                                            + (i_624_ & 0xff00ff));
                                    int i_627_
                                            = ((i_626_ & 0x1000100)
                                            + (i_625_ - i_626_ & 0x10000));
                                    i_627_
                                            = i_625_ - i_627_ | i_627_ - (i_627_
                                            >>> 8);
                                    if (i_623_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_623_ = i_627_;
                                        i_627_ = is_571_[i_570_];
                                        i_627_
                                                = (((((i_623_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_627_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_623_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_627_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_571_[i_570_] = i_627_;
                                } else if (i_572_ == 2) {
                                    int i_628_ = aByteArray9934[i_569_];
                                    if (i_628_ != 0) {
                                        int i_629_
                                                = anIntArray9935[i_628_ & 0xff];
                                        int i_630_
                                                = (((i_629_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_631_
                                                = (((i_629_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        i_629_ = (((i_630_ | i_631_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                        int i_632_ = is_571_[i_570_];
                                        int i_633_ = i_629_ + i_632_;
                                        int i_634_ = ((i_629_ & 0xff00ff)
                                                + (i_632_ & 0xff00ff));
                                        i_632_
                                                = ((i_634_ & 0x1000100)
                                                + (i_633_ - i_634_ & 0x10000));
                                        is_571_[i_570_]
                                                = (i_633_ - i_632_
                                                | i_632_ - (i_632_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_565_ += Class105_Sub3.anInt8450;
                        }
                    }
                    i_562_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8481 < 0) {
            if (Class105_Sub3.anInt8450 == 0) {
                int i_635_ = Class105_Sub3.anInt8468;
                while (i_635_ < 0) {
                    int i_636_ = Class105_Sub3.anInt8451;
                    int i_637_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_638_ = Class105_Sub3.anInt8467;
                    int i_639_ = Class105_Sub3.anInt8478;
                    if (i_638_ >= 0
                            && (i_638_ - (((Class105_Sub3) this).anInt8470 << 12)
                            < 0)) {
                        int i_640_;
                        if ((i_640_
                                = i_637_ - (((Class105_Sub3) this).anInt8471
                                << 12))
                                >= 0) {
                            i_640_ = ((Class105_Sub3.anInt8481 - i_640_)
                                    / Class105_Sub3.anInt8481);
                            i_639_ += i_640_;
                            i_637_ += Class105_Sub3.anInt8481 * i_640_;
                            i_636_ += i_640_;
                        }
                        if ((i_640_ = ((i_637_ - Class105_Sub3.anInt8481)
                                / Class105_Sub3.anInt8481))
                                > i_639_)
                            i_639_ = i_640_;
                        for (/**/; i_639_ < 0; i_639_++) {
                            int i_641_ = (((i_638_ >> 12)
                                    * ((Class105_Sub3) this).anInt8471)
                                    + (i_637_ >> 12));
                            int i_642_ = i_636_++;
                            int[] is_643_ = is;
                            int i_644_ = i;
                            int i_645_ = i_418_;
                            if (i_645_ == 0) {
                                if (i_644_ == 1)
                                    is_643_[i_642_]
                                            = (anIntArray9935
                                            [aByteArray9934[i_641_] & 0xff]);
                                else if (i_644_ == 0) {
                                    int i_646_
                                            = (anIntArray9935
                                            [aByteArray9934[i_641_] & 0xff]);
                                    int i_647_ = (((i_646_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_648_ = (((i_646_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_649_ = (((i_646_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_643_[i_642_]
                                            = (i_647_ | i_648_ | i_649_) >>> 8;
                                } else if (i_644_ == 3) {
                                    int i_650_
                                            = (anIntArray9935
                                            [aByteArray9934[i_641_] & 0xff]);
                                    int i_651_ = Class105_Sub3.anInt8480;
                                    int i_652_ = i_650_ + i_651_;
                                    int i_653_ = ((i_650_ & 0xff00ff)
                                            + (i_651_ & 0xff00ff));
                                    int i_654_
                                            = ((i_653_ & 0x1000100)
                                            + (i_652_ - i_653_ & 0x10000));
                                    is_643_[i_642_]
                                            = i_652_ - i_654_ | i_654_ - (i_654_
                                            >>> 8);
                                } else if (i_644_ == 2) {
                                    int i_655_
                                            = (anIntArray9935
                                            [aByteArray9934[i_641_] & 0xff]);
                                    int i_656_ = (((i_655_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_657_ = (((i_655_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_643_[i_642_]
                                            = (((i_656_ | i_657_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_645_ == 1) {
                                if (i_644_ == 1) {
                                    int i_658_ = aByteArray9934[i_641_];
                                    if (i_658_ != 0)
                                        is_643_[i_642_]
                                                = anIntArray9935[i_658_ & 0xff];
                                } else if (i_644_ == 0) {
                                    int i_659_ = aByteArray9934[i_641_];
                                    if (i_659_ != 0) {
                                        int i_660_
                                                = anIntArray9935[i_659_ & 0xff];
                                        if ((Class105_Sub3.anInt8480
                                                & 0xffffff)
                                                == 16777215) {
                                            int i_661_
                                                    = (Class105_Sub3.anInt8480
                                                    >>> 24);
                                            int i_662_ = 256 - i_661_;
                                            int i_663_ = is_643_[i_642_];
                                            is_643_[i_642_]
                                                    = (((((i_660_ & 0xff00ff)
                                                    * i_661_)
                                                    + ((i_663_ & 0xff00ff)
                                                    * i_662_))
                                                    & ~0xff00ff)
                                                    + ((((i_660_ & 0xff00)
                                                    * i_661_)
                                                    + ((i_663_ & 0xff00)
                                                    * i_662_))
                                                    & 0xff0000)) >> 8;
                                        } else if (Class105_Sub3.anInt8477
                                                != 255) {
                                            int i_664_
                                                    = (((i_660_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_665_
                                                    = (((i_660_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_666_
                                                    = (((i_660_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            i_660_ = (i_664_ | i_665_
                                                    | i_666_) >>> 8;
                                            int i_667_ = is_643_[i_642_];
                                            is_643_[i_642_]
                                                    = (((((i_660_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_667_ & 0xff00ff)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & ~0xff00ff)
                                                    + ((((i_660_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8477))
                                                    + ((i_667_ & 0xff00)
                                                    * (Class105_Sub3
                                                    .anInt8472)))
                                                    & 0xff0000)) >> 8;
                                        } else {
                                            int i_668_
                                                    = (((i_660_ & 0xff0000)
                                                    * Class105_Sub3.anInt8469)
                                                    & ~0xffffff);
                                            int i_669_
                                                    = (((i_660_ & 0xff00)
                                                    * Class105_Sub3.anInt8463)
                                                    & 0xff0000);
                                            int i_670_
                                                    = (((i_660_ & 0xff)
                                                    * Class105_Sub3.anInt8465)
                                                    & 0xff00);
                                            is_643_[i_642_] = (i_668_ | i_669_
                                                    | i_670_) >>> 8;
                                        }
                                    }
                                } else if (i_644_ == 3) {
                                    byte i_671_ = aByteArray9934[i_641_];
                                    int i_672_
                                            = (i_671_ > 0 ? anIntArray9935[i_671_]
                                            : 0);
                                    int i_673_ = Class105_Sub3.anInt8480;
                                    int i_674_ = i_672_ + i_673_;
                                    int i_675_ = ((i_672_ & 0xff00ff)
                                            + (i_673_ & 0xff00ff));
                                    int i_676_
                                            = ((i_675_ & 0x1000100)
                                            + (i_674_ - i_675_ & 0x10000));
                                    i_676_
                                            = i_674_ - i_676_ | i_676_ - (i_676_
                                            >>> 8);
                                    if (i_672_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_672_ = i_676_;
                                        i_676_ = is_643_[i_642_];
                                        i_676_
                                                = (((((i_672_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_676_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_672_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_676_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_643_[i_642_] = i_676_;
                                } else if (i_644_ == 2) {
                                    int i_677_ = aByteArray9934[i_641_];
                                    if (i_677_ != 0) {
                                        int i_678_
                                                = anIntArray9935[i_677_ & 0xff];
                                        int i_679_
                                                = (((i_678_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_680_
                                                = (((i_678_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        is_643_[i_642_++]
                                                = (((i_679_ | i_680_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (i_645_ == 2) {
                                if (i_644_ == 1) {
                                    int i_681_ = aByteArray9934[i_641_];
                                    if (i_681_ != 0) {
                                        int i_682_
                                                = anIntArray9935[i_681_ & 0xff];
                                        int i_683_ = is_643_[i_642_];
                                        int i_684_ = i_682_ + i_683_;
                                        int i_685_ = ((i_682_ & 0xff00ff)
                                                + (i_683_ & 0xff00ff));
                                        i_683_
                                                = ((i_685_ & 0x1000100)
                                                + (i_684_ - i_685_ & 0x10000));
                                        is_643_[i_642_]
                                                = (i_684_ - i_683_
                                                | i_683_ - (i_683_ >>> 8));
                                    }
                                } else if (i_644_ == 0) {
                                    int i_686_ = aByteArray9934[i_641_];
                                    if (i_686_ != 0) {
                                        int i_687_
                                                = anIntArray9935[i_686_ & 0xff];
                                        int i_688_
                                                = (((i_687_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_689_
                                                = (((i_687_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_690_
                                                = (((i_687_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_687_
                                                = (i_688_ | i_689_ | i_690_) >>> 8;
                                        int i_691_ = is_643_[i_642_];
                                        int i_692_ = i_687_ + i_691_;
                                        int i_693_ = ((i_687_ & 0xff00ff)
                                                + (i_691_ & 0xff00ff));
                                        i_691_
                                                = ((i_693_ & 0x1000100)
                                                + (i_692_ - i_693_ & 0x10000));
                                        is_643_[i_642_]
                                                = (i_692_ - i_691_
                                                | i_691_ - (i_691_ >>> 8));
                                    }
                                } else if (i_644_ == 3) {
                                    byte i_694_ = aByteArray9934[i_641_];
                                    int i_695_
                                            = (i_694_ > 0 ? anIntArray9935[i_694_]
                                            : 0);
                                    int i_696_ = Class105_Sub3.anInt8480;
                                    int i_697_ = i_695_ + i_696_;
                                    int i_698_ = ((i_695_ & 0xff00ff)
                                            + (i_696_ & 0xff00ff));
                                    int i_699_
                                            = ((i_698_ & 0x1000100)
                                            + (i_697_ - i_698_ & 0x10000));
                                    i_699_
                                            = i_697_ - i_699_ | i_699_ - (i_699_
                                            >>> 8);
                                    if (i_695_ == 0
                                            && Class105_Sub3.anInt8477 != 255) {
                                        i_695_ = i_699_;
                                        i_699_ = is_643_[i_642_];
                                        i_699_
                                                = (((((i_695_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_699_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_695_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_699_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    }
                                    is_643_[i_642_] = i_699_;
                                } else if (i_644_ == 2) {
                                    int i_700_ = aByteArray9934[i_641_];
                                    if (i_700_ != 0) {
                                        int i_701_
                                                = anIntArray9935[i_700_ & 0xff];
                                        int i_702_
                                                = (((i_701_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                & ~0xff00ff);
                                        int i_703_
                                                = (((i_701_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                & 0xff0000);
                                        i_701_ = (((i_702_ | i_703_) >>> 8)
                                                + Class105_Sub3.anInt8474);
                                        int i_704_ = is_643_[i_642_];
                                        int i_705_ = i_701_ + i_704_;
                                        int i_706_ = ((i_701_ & 0xff00ff)
                                                + (i_704_ & 0xff00ff));
                                        i_704_
                                                = ((i_706_ & 0x1000100)
                                                + (i_705_ - i_706_ & 0x10000));
                                        is_643_[i_642_]
                                                = (i_705_ - i_704_
                                                | i_704_ - (i_704_ >>> 8));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            i_637_ += Class105_Sub3.anInt8481;
                        }
                    }
                    i_635_++;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else if (Class105_Sub3.anInt8450 < 0) {
                int i_707_ = Class105_Sub3.anInt8468;
                while (i_707_ < 0) {
                    int i_708_ = Class105_Sub3.anInt8451;
                    int i_709_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_710_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_711_ = Class105_Sub3.anInt8478;
                    int i_712_;
                    if ((i_712_
                            = i_709_ - (((Class105_Sub3) this).anInt8471 << 12))
                            >= 0) {
                        i_712_ = ((Class105_Sub3.anInt8481 - i_712_)
                                / Class105_Sub3.anInt8481);
                        i_711_ += i_712_;
                        i_709_ += Class105_Sub3.anInt8481 * i_712_;
                        i_710_ += Class105_Sub3.anInt8450 * i_712_;
                        i_708_ += i_712_;
                    }
                    if ((i_712_ = ((i_709_ - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_711_)
                        i_711_ = i_712_;
                    if ((i_712_
                            = i_710_ - (((Class105_Sub3) this).anInt8470 << 12))
                            >= 0) {
                        i_712_ = ((Class105_Sub3.anInt8450 - i_712_)
                                / Class105_Sub3.anInt8450);
                        i_711_ += i_712_;
                        i_709_ += Class105_Sub3.anInt8481 * i_712_;
                        i_710_ += Class105_Sub3.anInt8450 * i_712_;
                        i_708_ += i_712_;
                    }
                    if ((i_712_ = ((i_710_ - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_711_)
                        i_711_ = i_712_;
                    for (/**/; i_711_ < 0; i_711_++) {
                        int i_713_ = (((i_710_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_709_ >> 12));
                        int i_714_ = i_708_++;
                        int[] is_715_ = is;
                        int i_716_ = i;
                        int i_717_ = i_418_;
                        if (i_717_ == 0) {
                            if (i_716_ == 1)
                                is_715_[i_714_]
                                        = (anIntArray9935
                                        [aByteArray9934[i_713_] & 0xff]);
                            else if (i_716_ == 0) {
                                int i_718_ = (anIntArray9935
                                        [aByteArray9934[i_713_] & 0xff]);
                                int i_719_ = (((i_718_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_720_ = (((i_718_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_721_ = (((i_718_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_715_[i_714_]
                                        = (i_719_ | i_720_ | i_721_) >>> 8;
                            } else if (i_716_ == 3) {
                                int i_722_ = (anIntArray9935
                                        [aByteArray9934[i_713_] & 0xff]);
                                int i_723_ = Class105_Sub3.anInt8480;
                                int i_724_ = i_722_ + i_723_;
                                int i_725_ = ((i_722_ & 0xff00ff)
                                        + (i_723_ & 0xff00ff));
                                int i_726_ = ((i_725_ & 0x1000100)
                                        + (i_724_ - i_725_ & 0x10000));
                                is_715_[i_714_]
                                        = i_724_ - i_726_ | i_726_ - (i_726_
                                        >>> 8);
                            } else if (i_716_ == 2) {
                                int i_727_ = (anIntArray9935
                                        [aByteArray9934[i_713_] & 0xff]);
                                int i_728_ = (((i_727_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_729_ = (((i_727_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_715_[i_714_] = (((i_728_ | i_729_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_717_ == 1) {
                            if (i_716_ == 1) {
                                int i_730_ = aByteArray9934[i_713_];
                                if (i_730_ != 0)
                                    is_715_[i_714_]
                                            = anIntArray9935[i_730_ & 0xff];
                            } else if (i_716_ == 0) {
                                int i_731_ = aByteArray9934[i_713_];
                                if (i_731_ != 0) {
                                    int i_732_ = anIntArray9935[i_731_ & 0xff];
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_733_
                                                = Class105_Sub3.anInt8480 >>> 24;
                                        int i_734_ = 256 - i_733_;
                                        int i_735_ = is_715_[i_714_];
                                        is_715_[i_714_]
                                                = ((((i_732_ & 0xff00ff) * i_733_
                                                + ((i_735_ & 0xff00ff)
                                                * i_734_))
                                                & ~0xff00ff)
                                                + (((i_732_ & 0xff00) * i_733_
                                                + ((i_735_ & 0xff00)
                                                * i_734_))
                                                & 0xff0000)) >> 8;
                                    } else if (Class105_Sub3.anInt8477
                                            != 255) {
                                        int i_736_
                                                = (((i_732_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_737_
                                                = (((i_732_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_738_
                                                = (((i_732_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_732_
                                                = (i_736_ | i_737_ | i_738_) >>> 8;
                                        int i_739_ = is_715_[i_714_];
                                        is_715_[i_714_]
                                                = (((((i_732_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_739_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_732_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_739_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_740_
                                                = (((i_732_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_741_
                                                = (((i_732_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_742_
                                                = (((i_732_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_715_[i_714_]
                                                = (i_740_ | i_741_ | i_742_) >>> 8;
                                    }
                                }
                            } else if (i_716_ == 3) {
                                byte i_743_ = aByteArray9934[i_713_];
                                int i_744_
                                        = i_743_ > 0 ? anIntArray9935[i_743_] : 0;
                                int i_745_ = Class105_Sub3.anInt8480;
                                int i_746_ = i_744_ + i_745_;
                                int i_747_ = ((i_744_ & 0xff00ff)
                                        + (i_745_ & 0xff00ff));
                                int i_748_ = ((i_747_ & 0x1000100)
                                        + (i_746_ - i_747_ & 0x10000));
                                i_748_ = i_746_ - i_748_ | i_748_ - (i_748_
                                        >>> 8);
                                if (i_744_ == 0
                                        && Class105_Sub3.anInt8477 != 255) {
                                    i_744_ = i_748_;
                                    i_748_ = is_715_[i_714_];
                                    i_748_
                                            = (((((i_744_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_748_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_744_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_748_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                }
                                is_715_[i_714_] = i_748_;
                            } else if (i_716_ == 2) {
                                int i_749_ = aByteArray9934[i_713_];
                                if (i_749_ != 0) {
                                    int i_750_ = anIntArray9935[i_749_ & 0xff];
                                    int i_751_ = (((i_750_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_752_ = (((i_750_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_715_[i_714_++]
                                            = (((i_751_ | i_752_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_717_ == 2) {
                            if (i_716_ == 1) {
                                int i_753_ = aByteArray9934[i_713_];
                                if (i_753_ != 0) {
                                    int i_754_ = anIntArray9935[i_753_ & 0xff];
                                    int i_755_ = is_715_[i_714_];
                                    int i_756_ = i_754_ + i_755_;
                                    int i_757_ = ((i_754_ & 0xff00ff)
                                            + (i_755_ & 0xff00ff));
                                    i_755_ = ((i_757_ & 0x1000100)
                                            + (i_756_ - i_757_ & 0x10000));
                                    is_715_[i_714_]
                                            = i_756_ - i_755_ | i_755_ - (i_755_
                                            >>> 8);
                                }
                            } else if (i_716_ == 0) {
                                int i_758_ = aByteArray9934[i_713_];
                                if (i_758_ != 0) {
                                    int i_759_ = anIntArray9935[i_758_ & 0xff];
                                    int i_760_ = (((i_759_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_761_ = (((i_759_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_762_ = (((i_759_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_759_ = (i_760_ | i_761_ | i_762_) >>> 8;
                                    int i_763_ = is_715_[i_714_];
                                    int i_764_ = i_759_ + i_763_;
                                    int i_765_ = ((i_759_ & 0xff00ff)
                                            + (i_763_ & 0xff00ff));
                                    i_763_ = ((i_765_ & 0x1000100)
                                            + (i_764_ - i_765_ & 0x10000));
                                    is_715_[i_714_]
                                            = i_764_ - i_763_ | i_763_ - (i_763_
                                            >>> 8);
                                }
                            } else if (i_716_ == 3) {
                                byte i_766_ = aByteArray9934[i_713_];
                                int i_767_
                                        = i_766_ > 0 ? anIntArray9935[i_766_] : 0;
                                int i_768_ = Class105_Sub3.anInt8480;
                                int i_769_ = i_767_ + i_768_;
                                int i_770_ = ((i_767_ & 0xff00ff)
                                        + (i_768_ & 0xff00ff));
                                int i_771_ = ((i_770_ & 0x1000100)
                                        + (i_769_ - i_770_ & 0x10000));
                                i_771_ = i_769_ - i_771_ | i_771_ - (i_771_
                                        >>> 8);
                                if (i_767_ == 0
                                        && Class105_Sub3.anInt8477 != 255) {
                                    i_767_ = i_771_;
                                    i_771_ = is_715_[i_714_];
                                    i_771_
                                            = (((((i_767_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_771_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_767_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_771_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                }
                                is_715_[i_714_] = i_771_;
                            } else if (i_716_ == 2) {
                                int i_772_ = aByteArray9934[i_713_];
                                if (i_772_ != 0) {
                                    int i_773_ = anIntArray9935[i_772_ & 0xff];
                                    int i_774_ = (((i_773_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_775_ = (((i_773_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_773_ = (((i_774_ | i_775_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_776_ = is_715_[i_714_];
                                    int i_777_ = i_773_ + i_776_;
                                    int i_778_ = ((i_773_ & 0xff00ff)
                                            + (i_776_ & 0xff00ff));
                                    i_776_ = ((i_778_ & 0x1000100)
                                            + (i_777_ - i_778_ & 0x10000));
                                    is_715_[i_714_]
                                            = i_777_ - i_776_ | i_776_ - (i_776_
                                            >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_709_ += Class105_Sub3.anInt8481;
                        i_710_ += Class105_Sub3.anInt8450;
                    }
                    i_707_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            } else {
                int i_779_ = Class105_Sub3.anInt8468;
                while (i_779_ < 0) {
                    int i_780_ = Class105_Sub3.anInt8451;
                    int i_781_
                            = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                    int i_782_
                            = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                    int i_783_ = Class105_Sub3.anInt8478;
                    int i_784_;
                    if ((i_784_
                            = i_781_ - (((Class105_Sub3) this).anInt8471 << 12))
                            >= 0) {
                        i_784_ = ((Class105_Sub3.anInt8481 - i_784_)
                                / Class105_Sub3.anInt8481);
                        i_783_ += i_784_;
                        i_781_ += Class105_Sub3.anInt8481 * i_784_;
                        i_782_ += Class105_Sub3.anInt8450 * i_784_;
                        i_780_ += i_784_;
                    }
                    if ((i_784_ = ((i_781_ - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_783_)
                        i_783_ = i_784_;
                    if (i_782_ < 0) {
                        i_784_ = ((Class105_Sub3.anInt8450 - 1 - i_782_)
                                / Class105_Sub3.anInt8450);
                        i_783_ += i_784_;
                        i_781_ += Class105_Sub3.anInt8481 * i_784_;
                        i_782_ += Class105_Sub3.anInt8450 * i_784_;
                        i_780_ += i_784_;
                    }
                    if ((i_784_ = ((1 + i_782_
                            - (((Class105_Sub3) this).anInt8470 << 12)
                            - Class105_Sub3.anInt8450)
                            / Class105_Sub3.anInt8450))
                            > i_783_)
                        i_783_ = i_784_;
                    for (/**/; i_783_ < 0; i_783_++) {
                        int i_785_ = (((i_782_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_781_ >> 12));
                        int i_786_ = i_780_++;
                        int[] is_787_ = is;
                        int i_788_ = i;
                        int i_789_ = i_418_;
                        if (i_789_ == 0) {
                            if (i_788_ == 1)
                                is_787_[i_786_]
                                        = (anIntArray9935
                                        [aByteArray9934[i_785_] & 0xff]);
                            else if (i_788_ == 0) {
                                int i_790_ = (anIntArray9935
                                        [aByteArray9934[i_785_] & 0xff]);
                                int i_791_ = (((i_790_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_792_ = (((i_790_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_793_ = (((i_790_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_787_[i_786_]
                                        = (i_791_ | i_792_ | i_793_) >>> 8;
                            } else if (i_788_ == 3) {
                                int i_794_ = (anIntArray9935
                                        [aByteArray9934[i_785_] & 0xff]);
                                int i_795_ = Class105_Sub3.anInt8480;
                                int i_796_ = i_794_ + i_795_;
                                int i_797_ = ((i_794_ & 0xff00ff)
                                        + (i_795_ & 0xff00ff));
                                int i_798_ = ((i_797_ & 0x1000100)
                                        + (i_796_ - i_797_ & 0x10000));
                                is_787_[i_786_]
                                        = i_796_ - i_798_ | i_798_ - (i_798_
                                        >>> 8);
                            } else if (i_788_ == 2) {
                                int i_799_ = (anIntArray9935
                                        [aByteArray9934[i_785_] & 0xff]);
                                int i_800_ = (((i_799_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_801_ = (((i_799_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_787_[i_786_] = (((i_800_ | i_801_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_789_ == 1) {
                            if (i_788_ == 1) {
                                int i_802_ = aByteArray9934[i_785_];
                                if (i_802_ != 0)
                                    is_787_[i_786_]
                                            = anIntArray9935[i_802_ & 0xff];
                            } else if (i_788_ == 0) {
                                int i_803_ = aByteArray9934[i_785_];
                                if (i_803_ != 0) {
                                    int i_804_ = anIntArray9935[i_803_ & 0xff];
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_805_
                                                = Class105_Sub3.anInt8480 >>> 24;
                                        int i_806_ = 256 - i_805_;
                                        int i_807_ = is_787_[i_786_];
                                        is_787_[i_786_]
                                                = ((((i_804_ & 0xff00ff) * i_805_
                                                + ((i_807_ & 0xff00ff)
                                                * i_806_))
                                                & ~0xff00ff)
                                                + (((i_804_ & 0xff00) * i_805_
                                                + ((i_807_ & 0xff00)
                                                * i_806_))
                                                & 0xff0000)) >> 8;
                                    } else if (Class105_Sub3.anInt8477
                                            != 255) {
                                        int i_808_
                                                = (((i_804_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_809_
                                                = (((i_804_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_810_
                                                = (((i_804_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_804_
                                                = (i_808_ | i_809_ | i_810_) >>> 8;
                                        int i_811_ = is_787_[i_786_];
                                        is_787_[i_786_]
                                                = (((((i_804_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_811_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_804_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_811_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_812_
                                                = (((i_804_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_813_
                                                = (((i_804_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_814_
                                                = (((i_804_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_787_[i_786_]
                                                = (i_812_ | i_813_ | i_814_) >>> 8;
                                    }
                                }
                            } else if (i_788_ == 3) {
                                byte i_815_ = aByteArray9934[i_785_];
                                int i_816_
                                        = i_815_ > 0 ? anIntArray9935[i_815_] : 0;
                                int i_817_ = Class105_Sub3.anInt8480;
                                int i_818_ = i_816_ + i_817_;
                                int i_819_ = ((i_816_ & 0xff00ff)
                                        + (i_817_ & 0xff00ff));
                                int i_820_ = ((i_819_ & 0x1000100)
                                        + (i_818_ - i_819_ & 0x10000));
                                i_820_ = i_818_ - i_820_ | i_820_ - (i_820_
                                        >>> 8);
                                if (i_816_ == 0
                                        && Class105_Sub3.anInt8477 != 255) {
                                    i_816_ = i_820_;
                                    i_820_ = is_787_[i_786_];
                                    i_820_
                                            = (((((i_816_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_820_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_816_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_820_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                }
                                is_787_[i_786_] = i_820_;
                            } else if (i_788_ == 2) {
                                int i_821_ = aByteArray9934[i_785_];
                                if (i_821_ != 0) {
                                    int i_822_ = anIntArray9935[i_821_ & 0xff];
                                    int i_823_ = (((i_822_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_824_ = (((i_822_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_787_[i_786_++]
                                            = (((i_823_ | i_824_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_789_ == 2) {
                            if (i_788_ == 1) {
                                int i_825_ = aByteArray9934[i_785_];
                                if (i_825_ != 0) {
                                    int i_826_ = anIntArray9935[i_825_ & 0xff];
                                    int i_827_ = is_787_[i_786_];
                                    int i_828_ = i_826_ + i_827_;
                                    int i_829_ = ((i_826_ & 0xff00ff)
                                            + (i_827_ & 0xff00ff));
                                    i_827_ = ((i_829_ & 0x1000100)
                                            + (i_828_ - i_829_ & 0x10000));
                                    is_787_[i_786_]
                                            = i_828_ - i_827_ | i_827_ - (i_827_
                                            >>> 8);
                                }
                            } else if (i_788_ == 0) {
                                int i_830_ = aByteArray9934[i_785_];
                                if (i_830_ != 0) {
                                    int i_831_ = anIntArray9935[i_830_ & 0xff];
                                    int i_832_ = (((i_831_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_833_ = (((i_831_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_834_ = (((i_831_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_831_ = (i_832_ | i_833_ | i_834_) >>> 8;
                                    int i_835_ = is_787_[i_786_];
                                    int i_836_ = i_831_ + i_835_;
                                    int i_837_ = ((i_831_ & 0xff00ff)
                                            + (i_835_ & 0xff00ff));
                                    i_835_ = ((i_837_ & 0x1000100)
                                            + (i_836_ - i_837_ & 0x10000));
                                    is_787_[i_786_]
                                            = i_836_ - i_835_ | i_835_ - (i_835_
                                            >>> 8);
                                }
                            } else if (i_788_ == 3) {
                                byte i_838_ = aByteArray9934[i_785_];
                                int i_839_
                                        = i_838_ > 0 ? anIntArray9935[i_838_] : 0;
                                int i_840_ = Class105_Sub3.anInt8480;
                                int i_841_ = i_839_ + i_840_;
                                int i_842_ = ((i_839_ & 0xff00ff)
                                        + (i_840_ & 0xff00ff));
                                int i_843_ = ((i_842_ & 0x1000100)
                                        + (i_841_ - i_842_ & 0x10000));
                                i_843_ = i_841_ - i_843_ | i_843_ - (i_843_
                                        >>> 8);
                                if (i_839_ == 0
                                        && Class105_Sub3.anInt8477 != 255) {
                                    i_839_ = i_843_;
                                    i_843_ = is_787_[i_786_];
                                    i_843_
                                            = (((((i_839_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_843_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_839_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_843_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                }
                                is_787_[i_786_] = i_843_;
                            } else if (i_788_ == 2) {
                                int i_844_ = aByteArray9934[i_785_];
                                if (i_844_ != 0) {
                                    int i_845_ = anIntArray9935[i_844_ & 0xff];
                                    int i_846_ = (((i_845_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_847_ = (((i_845_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_845_ = (((i_846_ | i_847_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_848_ = is_787_[i_786_];
                                    int i_849_ = i_845_ + i_848_;
                                    int i_850_ = ((i_845_ & 0xff00ff)
                                            + (i_848_ & 0xff00ff));
                                    i_848_ = ((i_850_ & 0x1000100)
                                            + (i_849_ - i_850_ & 0x10000));
                                    is_787_[i_786_]
                                            = i_849_ - i_848_ | i_848_ - (i_848_
                                            >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_781_ += Class105_Sub3.anInt8481;
                        i_782_ += Class105_Sub3.anInt8450;
                    }
                    i_779_++;
                    Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                    Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                    Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
                }
            }
        } else if (Class105_Sub3.anInt8450 == 0) {
            int i_851_ = Class105_Sub3.anInt8468;
            while (i_851_ < 0) {
                int i_852_ = Class105_Sub3.anInt8451;
                int i_853_ = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                int i_854_ = Class105_Sub3.anInt8467;
                int i_855_ = Class105_Sub3.anInt8478;
                if (i_854_ >= 0
                        && i_854_ - (((Class105_Sub3) this).anInt8470 << 12) < 0) {
                    if (i_853_ < 0) {
                        int i_856_ = ((Class105_Sub3.anInt8481 - 1 - i_853_)
                                / Class105_Sub3.anInt8481);
                        i_855_ += i_856_;
                        i_853_ += Class105_Sub3.anInt8481 * i_856_;
                        i_852_ += i_856_;
                    }
                    int i_857_;
                    if ((i_857_ = ((1 + i_853_
                            - (((Class105_Sub3) this).anInt8471 << 12)
                            - Class105_Sub3.anInt8481)
                            / Class105_Sub3.anInt8481))
                            > i_855_)
                        i_855_ = i_857_;
                    for (/**/; i_855_ < 0; i_855_++) {
                        int i_858_ = (((i_854_ >> 12)
                                * ((Class105_Sub3) this).anInt8471)
                                + (i_853_ >> 12));
                        int i_859_ = i_852_++;
                        int[] is_860_ = is;
                        int i_861_ = i;
                        int i_862_ = i_418_;
                        if (i_862_ == 0) {
                            if (i_861_ == 1)
                                is_860_[i_859_]
                                        = (anIntArray9935
                                        [aByteArray9934[i_858_] & 0xff]);
                            else if (i_861_ == 0) {
                                int i_863_ = (anIntArray9935
                                        [aByteArray9934[i_858_] & 0xff]);
                                int i_864_ = (((i_863_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_865_ = (((i_863_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_866_ = (((i_863_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                is_860_[i_859_]
                                        = (i_864_ | i_865_ | i_866_) >>> 8;
                            } else if (i_861_ == 3) {
                                int i_867_ = (anIntArray9935
                                        [aByteArray9934[i_858_] & 0xff]);
                                int i_868_ = Class105_Sub3.anInt8480;
                                int i_869_ = i_867_ + i_868_;
                                int i_870_ = ((i_867_ & 0xff00ff)
                                        + (i_868_ & 0xff00ff));
                                int i_871_ = ((i_870_ & 0x1000100)
                                        + (i_869_ - i_870_ & 0x10000));
                                is_860_[i_859_]
                                        = i_869_ - i_871_ | i_871_ - (i_871_
                                        >>> 8);
                            } else if (i_861_ == 2) {
                                int i_872_ = (anIntArray9935
                                        [aByteArray9934[i_858_] & 0xff]);
                                int i_873_ = (((i_872_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_874_ = (((i_872_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_860_[i_859_] = (((i_873_ | i_874_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_862_ == 1) {
                            if (i_861_ == 1) {
                                int i_875_ = aByteArray9934[i_858_];
                                if (i_875_ != 0)
                                    is_860_[i_859_]
                                            = anIntArray9935[i_875_ & 0xff];
                            } else if (i_861_ == 0) {
                                int i_876_ = aByteArray9934[i_858_];
                                if (i_876_ != 0) {
                                    int i_877_ = anIntArray9935[i_876_ & 0xff];
                                    if ((Class105_Sub3.anInt8480 & 0xffffff)
                                            == 16777215) {
                                        int i_878_
                                                = Class105_Sub3.anInt8480 >>> 24;
                                        int i_879_ = 256 - i_878_;
                                        int i_880_ = is_860_[i_859_];
                                        is_860_[i_859_]
                                                = ((((i_877_ & 0xff00ff) * i_878_
                                                + ((i_880_ & 0xff00ff)
                                                * i_879_))
                                                & ~0xff00ff)
                                                + (((i_877_ & 0xff00) * i_878_
                                                + ((i_880_ & 0xff00)
                                                * i_879_))
                                                & 0xff0000)) >> 8;
                                    } else if (Class105_Sub3.anInt8477
                                            != 255) {
                                        int i_881_
                                                = (((i_877_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_882_
                                                = (((i_877_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_883_
                                                = (((i_877_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        i_877_
                                                = (i_881_ | i_882_ | i_883_) >>> 8;
                                        int i_884_ = is_860_[i_859_];
                                        is_860_[i_859_]
                                                = (((((i_877_ & 0xff00ff)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_884_ & 0xff00ff)
                                                * Class105_Sub3.anInt8472))
                                                & ~0xff00ff)
                                                + ((((i_877_ & 0xff00)
                                                * Class105_Sub3.anInt8477)
                                                + ((i_884_ & 0xff00)
                                                * (Class105_Sub3
                                                .anInt8472)))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_885_
                                                = (((i_877_ & 0xff0000)
                                                * Class105_Sub3.anInt8469)
                                                & ~0xffffff);
                                        int i_886_
                                                = (((i_877_ & 0xff00)
                                                * Class105_Sub3.anInt8463)
                                                & 0xff0000);
                                        int i_887_
                                                = (((i_877_ & 0xff)
                                                * Class105_Sub3.anInt8465)
                                                & 0xff00);
                                        is_860_[i_859_]
                                                = (i_885_ | i_886_ | i_887_) >>> 8;
                                    }
                                }
                            } else if (i_861_ == 3) {
                                byte i_888_ = aByteArray9934[i_858_];
                                int i_889_
                                        = i_888_ > 0 ? anIntArray9935[i_888_] : 0;
                                int i_890_ = Class105_Sub3.anInt8480;
                                int i_891_ = i_889_ + i_890_;
                                int i_892_ = ((i_889_ & 0xff00ff)
                                        + (i_890_ & 0xff00ff));
                                int i_893_ = ((i_892_ & 0x1000100)
                                        + (i_891_ - i_892_ & 0x10000));
                                i_893_ = i_891_ - i_893_ | i_893_ - (i_893_
                                        >>> 8);
                                if (i_889_ == 0
                                        && Class105_Sub3.anInt8477 != 255) {
                                    i_889_ = i_893_;
                                    i_893_ = is_860_[i_859_];
                                    i_893_
                                            = (((((i_889_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_893_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_889_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_893_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                }
                                is_860_[i_859_] = i_893_;
                            } else if (i_861_ == 2) {
                                int i_894_ = aByteArray9934[i_858_];
                                if (i_894_ != 0) {
                                    int i_895_ = anIntArray9935[i_894_ & 0xff];
                                    int i_896_ = (((i_895_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_897_ = (((i_895_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    is_860_[i_859_++]
                                            = (((i_896_ | i_897_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (i_862_ == 2) {
                            if (i_861_ == 1) {
                                int i_898_ = aByteArray9934[i_858_];
                                if (i_898_ != 0) {
                                    int i_899_ = anIntArray9935[i_898_ & 0xff];
                                    int i_900_ = is_860_[i_859_];
                                    int i_901_ = i_899_ + i_900_;
                                    int i_902_ = ((i_899_ & 0xff00ff)
                                            + (i_900_ & 0xff00ff));
                                    i_900_ = ((i_902_ & 0x1000100)
                                            + (i_901_ - i_902_ & 0x10000));
                                    is_860_[i_859_]
                                            = i_901_ - i_900_ | i_900_ - (i_900_
                                            >>> 8);
                                }
                            } else if (i_861_ == 0) {
                                int i_903_ = aByteArray9934[i_858_];
                                if (i_903_ != 0) {
                                    int i_904_ = anIntArray9935[i_903_ & 0xff];
                                    int i_905_ = (((i_904_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_906_ = (((i_904_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_907_ = (((i_904_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_904_ = (i_905_ | i_906_ | i_907_) >>> 8;
                                    int i_908_ = is_860_[i_859_];
                                    int i_909_ = i_904_ + i_908_;
                                    int i_910_ = ((i_904_ & 0xff00ff)
                                            + (i_908_ & 0xff00ff));
                                    i_908_ = ((i_910_ & 0x1000100)
                                            + (i_909_ - i_910_ & 0x10000));
                                    is_860_[i_859_]
                                            = i_909_ - i_908_ | i_908_ - (i_908_
                                            >>> 8);
                                }
                            } else if (i_861_ == 3) {
                                byte i_911_ = aByteArray9934[i_858_];
                                int i_912_
                                        = i_911_ > 0 ? anIntArray9935[i_911_] : 0;
                                int i_913_ = Class105_Sub3.anInt8480;
                                int i_914_ = i_912_ + i_913_;
                                int i_915_ = ((i_912_ & 0xff00ff)
                                        + (i_913_ & 0xff00ff));
                                int i_916_ = ((i_915_ & 0x1000100)
                                        + (i_914_ - i_915_ & 0x10000));
                                i_916_ = i_914_ - i_916_ | i_916_ - (i_916_
                                        >>> 8);
                                if (i_912_ == 0
                                        && Class105_Sub3.anInt8477 != 255) {
                                    i_912_ = i_916_;
                                    i_916_ = is_860_[i_859_];
                                    i_916_
                                            = (((((i_912_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_916_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_912_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_916_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                }
                                is_860_[i_859_] = i_916_;
                            } else if (i_861_ == 2) {
                                int i_917_ = aByteArray9934[i_858_];
                                if (i_917_ != 0) {
                                    int i_918_ = anIntArray9935[i_917_ & 0xff];
                                    int i_919_ = (((i_918_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            & ~0xff00ff);
                                    int i_920_ = (((i_918_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            & 0xff0000);
                                    i_918_ = (((i_919_ | i_920_) >>> 8)
                                            + Class105_Sub3.anInt8474);
                                    int i_921_ = is_860_[i_859_];
                                    int i_922_ = i_918_ + i_921_;
                                    int i_923_ = ((i_918_ & 0xff00ff)
                                            + (i_921_ & 0xff00ff));
                                    i_921_ = ((i_923_ & 0x1000100)
                                            + (i_922_ - i_923_ & 0x10000));
                                    is_860_[i_859_]
                                            = i_922_ - i_921_ | i_921_ - (i_921_
                                            >>> 8);
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        i_853_ += Class105_Sub3.anInt8481;
                    }
                }
                i_851_++;
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else if (Class105_Sub3.anInt8450 < 0) {
            for (int i_924_ = Class105_Sub3.anInt8468; i_924_ < 0; i_924_++) {
                int i_925_ = Class105_Sub3.anInt8451;
                int i_926_ = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                int i_927_ = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                int i_928_ = Class105_Sub3.anInt8478;
                if (i_926_ < 0) {
                    int i_929_ = ((Class105_Sub3.anInt8481 - 1 - i_926_)
                            / Class105_Sub3.anInt8481);
                    i_928_ += i_929_;
                    i_926_ += Class105_Sub3.anInt8481 * i_929_;
                    i_927_ += Class105_Sub3.anInt8450 * i_929_;
                    i_925_ += i_929_;
                }
                int i_930_;
                if ((i_930_
                        = (1 + i_926_ - (((Class105_Sub3) this).anInt8471 << 12)
                        - Class105_Sub3.anInt8481) / Class105_Sub3.anInt8481)
                        > i_928_)
                    i_928_ = i_930_;
                if ((i_930_
                        = i_927_ - (((Class105_Sub3) this).anInt8470 << 12))
                        >= 0) {
                    i_930_ = ((Class105_Sub3.anInt8450 - i_930_)
                            / Class105_Sub3.anInt8450);
                    i_928_ += i_930_;
                    i_926_ += Class105_Sub3.anInt8481 * i_930_;
                    i_927_ += Class105_Sub3.anInt8450 * i_930_;
                    i_925_ += i_930_;
                }
                if ((i_930_ = ((i_927_ - Class105_Sub3.anInt8450)
                        / Class105_Sub3.anInt8450))
                        > i_928_)
                    i_928_ = i_930_;
                for (/**/; i_928_ < 0; i_928_++) {
                    int i_931_
                            = ((i_927_ >> 12) * ((Class105_Sub3) this).anInt8471
                            + (i_926_ >> 12));
                    int i_932_ = i_925_++;
                    int[] is_933_ = is;
                    int i_934_ = i;
                    int i_935_ = i_418_;
                    if (i_935_ == 0) {
                        if (i_934_ == 1)
                            is_933_[i_932_]
                                    = (anIntArray9935
                                    [aByteArray9934[i_931_] & 0xff]);
                        else if (i_934_ == 0) {
                            int i_936_ = (anIntArray9935
                                    [aByteArray9934[i_931_] & 0xff]);
                            int i_937_ = (((i_936_ & 0xff0000)
                                    * Class105_Sub3.anInt8469)
                                    & ~0xffffff);
                            int i_938_
                                    = ((i_936_ & 0xff00) * Class105_Sub3.anInt8463
                                    & 0xff0000);
                            int i_939_
                                    = ((i_936_ & 0xff) * Class105_Sub3.anInt8465
                                    & 0xff00);
                            is_933_[i_932_] = (i_937_ | i_938_ | i_939_) >>> 8;
                        } else if (i_934_ == 3) {
                            int i_940_ = (anIntArray9935
                                    [aByteArray9934[i_931_] & 0xff]);
                            int i_941_ = Class105_Sub3.anInt8480;
                            int i_942_ = i_940_ + i_941_;
                            int i_943_
                                    = (i_940_ & 0xff00ff) + (i_941_ & 0xff00ff);
                            int i_944_ = ((i_943_ & 0x1000100)
                                    + (i_942_ - i_943_ & 0x10000));
                            is_933_[i_932_]
                                    = i_942_ - i_944_ | i_944_ - (i_944_ >>> 8);
                        } else if (i_934_ == 2) {
                            int i_945_ = (anIntArray9935
                                    [aByteArray9934[i_931_] & 0xff]);
                            int i_946_ = (((i_945_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_947_
                                    = ((i_945_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            is_933_[i_932_] = (((i_946_ | i_947_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_935_ == 1) {
                        if (i_934_ == 1) {
                            int i_948_ = aByteArray9934[i_931_];
                            if (i_948_ != 0)
                                is_933_[i_932_]
                                        = anIntArray9935[i_948_ & 0xff];
                        } else if (i_934_ == 0) {
                            int i_949_ = aByteArray9934[i_931_];
                            if (i_949_ != 0) {
                                int i_950_ = anIntArray9935[i_949_ & 0xff];
                                if ((Class105_Sub3.anInt8480 & 0xffffff)
                                        == 16777215) {
                                    int i_951_
                                            = Class105_Sub3.anInt8480 >>> 24;
                                    int i_952_ = 256 - i_951_;
                                    int i_953_ = is_933_[i_932_];
                                    is_933_[i_932_]
                                            = ((((i_950_ & 0xff00ff) * i_951_
                                            + (i_953_ & 0xff00ff) * i_952_)
                                            & ~0xff00ff)
                                            + (((i_950_ & 0xff00) * i_951_
                                            + (i_953_ & 0xff00) * i_952_)
                                            & 0xff0000)) >> 8;
                                } else if (Class105_Sub3.anInt8477 != 255) {
                                    int i_954_ = (((i_950_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_955_ = (((i_950_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_956_ = (((i_950_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_950_ = (i_954_ | i_955_ | i_956_) >>> 8;
                                    int i_957_ = is_933_[i_932_];
                                    is_933_[i_932_]
                                            = (((((i_950_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_957_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_950_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_957_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                } else {
                                    int i_958_ = (((i_950_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_959_ = (((i_950_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_960_ = (((i_950_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_933_[i_932_]
                                            = (i_958_ | i_959_ | i_960_) >>> 8;
                                }
                            }
                        } else if (i_934_ == 3) {
                            byte i_961_ = aByteArray9934[i_931_];
                            int i_962_
                                    = i_961_ > 0 ? anIntArray9935[i_961_] : 0;
                            int i_963_ = Class105_Sub3.anInt8480;
                            int i_964_ = i_962_ + i_963_;
                            int i_965_
                                    = (i_962_ & 0xff00ff) + (i_963_ & 0xff00ff);
                            int i_966_ = ((i_965_ & 0x1000100)
                                    + (i_964_ - i_965_ & 0x10000));
                            i_966_ = i_964_ - i_966_ | i_966_ - (i_966_ >>> 8);
                            if (i_962_ == 0
                                    && Class105_Sub3.anInt8477 != 255) {
                                i_962_ = i_966_;
                                i_966_ = is_933_[i_932_];
                                i_966_ = (((((i_962_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_966_ & 0xff00ff)
                                        * Class105_Sub3.anInt8472))
                                        & ~0xff00ff)
                                        + ((((i_962_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_966_ & 0xff00)
                                        * Class105_Sub3.anInt8472))
                                        & 0xff0000)) >> 8;
                            }
                            is_933_[i_932_] = i_966_;
                        } else if (i_934_ == 2) {
                            int i_967_ = aByteArray9934[i_931_];
                            if (i_967_ != 0) {
                                int i_968_ = anIntArray9935[i_967_ & 0xff];
                                int i_969_ = (((i_968_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_970_ = (((i_968_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_933_[i_932_++]
                                        = (((i_969_ | i_970_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_935_ == 2) {
                        if (i_934_ == 1) {
                            int i_971_ = aByteArray9934[i_931_];
                            if (i_971_ != 0) {
                                int i_972_ = anIntArray9935[i_971_ & 0xff];
                                int i_973_ = is_933_[i_932_];
                                int i_974_ = i_972_ + i_973_;
                                int i_975_ = ((i_972_ & 0xff00ff)
                                        + (i_973_ & 0xff00ff));
                                i_973_
                                        = (i_975_ & 0x1000100) + (i_974_ - i_975_
                                        & 0x10000);
                                is_933_[i_932_]
                                        = i_974_ - i_973_ | i_973_ - (i_973_
                                        >>> 8);
                            }
                        } else if (i_934_ == 0) {
                            int i_976_ = aByteArray9934[i_931_];
                            if (i_976_ != 0) {
                                int i_977_ = anIntArray9935[i_976_ & 0xff];
                                int i_978_ = (((i_977_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_979_ = (((i_977_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_980_ = (((i_977_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                i_977_ = (i_978_ | i_979_ | i_980_) >>> 8;
                                int i_981_ = is_933_[i_932_];
                                int i_982_ = i_977_ + i_981_;
                                int i_983_ = ((i_977_ & 0xff00ff)
                                        + (i_981_ & 0xff00ff));
                                i_981_
                                        = (i_983_ & 0x1000100) + (i_982_ - i_983_
                                        & 0x10000);
                                is_933_[i_932_]
                                        = i_982_ - i_981_ | i_981_ - (i_981_
                                        >>> 8);
                            }
                        } else if (i_934_ == 3) {
                            byte i_984_ = aByteArray9934[i_931_];
                            int i_985_
                                    = i_984_ > 0 ? anIntArray9935[i_984_] : 0;
                            int i_986_ = Class105_Sub3.anInt8480;
                            int i_987_ = i_985_ + i_986_;
                            int i_988_
                                    = (i_985_ & 0xff00ff) + (i_986_ & 0xff00ff);
                            int i_989_ = ((i_988_ & 0x1000100)
                                    + (i_987_ - i_988_ & 0x10000));
                            i_989_ = i_987_ - i_989_ | i_989_ - (i_989_ >>> 8);
                            if (i_985_ == 0
                                    && Class105_Sub3.anInt8477 != 255) {
                                i_985_ = i_989_;
                                i_989_ = is_933_[i_932_];
                                i_989_ = (((((i_985_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_989_ & 0xff00ff)
                                        * Class105_Sub3.anInt8472))
                                        & ~0xff00ff)
                                        + ((((i_985_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_989_ & 0xff00)
                                        * Class105_Sub3.anInt8472))
                                        & 0xff0000)) >> 8;
                            }
                            is_933_[i_932_] = i_989_;
                        } else if (i_934_ == 2) {
                            int i_990_ = aByteArray9934[i_931_];
                            if (i_990_ != 0) {
                                int i_991_ = anIntArray9935[i_990_ & 0xff];
                                int i_992_ = (((i_991_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_993_ = (((i_991_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_991_ = (((i_992_ | i_993_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_994_ = is_933_[i_932_];
                                int i_995_ = i_991_ + i_994_;
                                int i_996_ = ((i_991_ & 0xff00ff)
                                        + (i_994_ & 0xff00ff));
                                i_994_
                                        = (i_996_ & 0x1000100) + (i_995_ - i_996_
                                        & 0x10000);
                                is_933_[i_932_]
                                        = i_995_ - i_994_ | i_994_ - (i_994_
                                        >>> 8);
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_926_ += Class105_Sub3.anInt8481;
                    i_927_ += Class105_Sub3.anInt8450;
                }
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        } else {
            for (int i_997_ = Class105_Sub3.anInt8468; i_997_ < 0; i_997_++) {
                int i_998_ = Class105_Sub3.anInt8451;
                int i_999_ = Class105_Sub3.anInt8458 + Class105_Sub3.anInt8479;
                int i_1000_
                        = Class105_Sub3.anInt8467 + Class105_Sub3.anInt8475;
                int i_1001_ = Class105_Sub3.anInt8478;
                if (i_999_ < 0) {
                    int i_1002_ = ((Class105_Sub3.anInt8481 - 1 - i_999_)
                            / Class105_Sub3.anInt8481);
                    i_1001_ += i_1002_;
                    i_999_ += Class105_Sub3.anInt8481 * i_1002_;
                    i_1000_ += Class105_Sub3.anInt8450 * i_1002_;
                    i_998_ += i_1002_;
                }
                int i_1003_;
                if ((i_1003_
                        = (1 + i_999_ - (((Class105_Sub3) this).anInt8471 << 12)
                        - Class105_Sub3.anInt8481) / Class105_Sub3.anInt8481)
                        > i_1001_)
                    i_1001_ = i_1003_;
                if (i_1000_ < 0) {
                    i_1003_ = ((Class105_Sub3.anInt8450 - 1 - i_1000_)
                            / Class105_Sub3.anInt8450);
                    i_1001_ += i_1003_;
                    i_999_ += Class105_Sub3.anInt8481 * i_1003_;
                    i_1000_ += Class105_Sub3.anInt8450 * i_1003_;
                    i_998_ += i_1003_;
                }
                if ((i_1003_
                        = (1 + i_1000_ - (((Class105_Sub3) this).anInt8470 << 12)
                        - Class105_Sub3.anInt8450) / Class105_Sub3.anInt8450)
                        > i_1001_)
                    i_1001_ = i_1003_;
                for (/**/; i_1001_ < 0; i_1001_++) {
                    int i_1004_
                            = ((i_1000_ >> 12) * ((Class105_Sub3) this).anInt8471
                            + (i_999_ >> 12));
                    int i_1005_ = i_998_++;
                    int[] is_1006_ = is;
                    int i_1007_ = i;
                    int i_1008_ = i_418_;
                    if (i_1008_ == 0) {
                        if (i_1007_ == 1)
                            is_1006_[i_1005_]
                                    = (anIntArray9935
                                    [aByteArray9934[i_1004_] & 0xff]);
                        else if (i_1007_ == 0) {
                            int i_1009_ = (anIntArray9935
                                    [aByteArray9934[i_1004_] & 0xff]);
                            int i_1010_ = (((i_1009_ & 0xff0000)
                                    * Class105_Sub3.anInt8469)
                                    & ~0xffffff);
                            int i_1011_
                                    = ((i_1009_ & 0xff00) * Class105_Sub3.anInt8463
                                    & 0xff0000);
                            int i_1012_
                                    = ((i_1009_ & 0xff) * Class105_Sub3.anInt8465
                                    & 0xff00);
                            is_1006_[i_1005_]
                                    = (i_1010_ | i_1011_ | i_1012_) >>> 8;
                        } else if (i_1007_ == 3) {
                            int i_1013_ = (anIntArray9935
                                    [aByteArray9934[i_1004_] & 0xff]);
                            int i_1014_ = Class105_Sub3.anInt8480;
                            int i_1015_ = i_1013_ + i_1014_;
                            int i_1016_
                                    = (i_1013_ & 0xff00ff) + (i_1014_ & 0xff00ff);
                            int i_1017_ = ((i_1016_ & 0x1000100)
                                    + (i_1015_ - i_1016_ & 0x10000));
                            is_1006_[i_1005_]
                                    = i_1015_ - i_1017_ | i_1017_ - (i_1017_
                                    >>> 8);
                        } else if (i_1007_ == 2) {
                            int i_1018_ = (anIntArray9935
                                    [aByteArray9934[i_1004_] & 0xff]);
                            int i_1019_ = (((i_1018_ & 0xff00ff)
                                    * Class105_Sub3.anInt8477)
                                    & ~0xff00ff);
                            int i_1020_
                                    = ((i_1018_ & 0xff00) * Class105_Sub3.anInt8477
                                    & 0xff0000);
                            is_1006_[i_1005_] = (((i_1019_ | i_1020_) >>> 8)
                                    + Class105_Sub3.anInt8474);
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1008_ == 1) {
                        if (i_1007_ == 1) {
                            int i_1021_ = aByteArray9934[i_1004_];
                            if (i_1021_ != 0)
                                is_1006_[i_1005_]
                                        = anIntArray9935[i_1021_ & 0xff];
                        } else if (i_1007_ == 0) {
                            int i_1022_ = aByteArray9934[i_1004_];
                            if (i_1022_ != 0) {
                                int i_1023_ = anIntArray9935[i_1022_ & 0xff];
                                if ((Class105_Sub3.anInt8480 & 0xffffff)
                                        == 16777215) {
                                    int i_1024_
                                            = Class105_Sub3.anInt8480 >>> 24;
                                    int i_1025_ = 256 - i_1024_;
                                    int i_1026_ = is_1006_[i_1005_];
                                    is_1006_[i_1005_]
                                            = ((((i_1023_ & 0xff00ff) * i_1024_
                                            + (i_1026_ & 0xff00ff) * i_1025_)
                                            & ~0xff00ff)
                                            + (((i_1023_ & 0xff00) * i_1024_
                                            + (i_1026_ & 0xff00) * i_1025_)
                                            & 0xff0000)) >> 8;
                                } else if (Class105_Sub3.anInt8477 != 255) {
                                    int i_1027_ = (((i_1023_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_1028_ = (((i_1023_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_1029_ = (((i_1023_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    i_1023_
                                            = (i_1027_ | i_1028_ | i_1029_) >>> 8;
                                    int i_1030_ = is_1006_[i_1005_];
                                    is_1006_[i_1005_]
                                            = (((((i_1023_ & 0xff00ff)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_1030_ & 0xff00ff)
                                            * Class105_Sub3.anInt8472))
                                            & ~0xff00ff)
                                            + ((((i_1023_ & 0xff00)
                                            * Class105_Sub3.anInt8477)
                                            + ((i_1030_ & 0xff00)
                                            * Class105_Sub3.anInt8472))
                                            & 0xff0000)) >> 8;
                                } else {
                                    int i_1031_ = (((i_1023_ & 0xff0000)
                                            * Class105_Sub3.anInt8469)
                                            & ~0xffffff);
                                    int i_1032_ = (((i_1023_ & 0xff00)
                                            * Class105_Sub3.anInt8463)
                                            & 0xff0000);
                                    int i_1033_ = (((i_1023_ & 0xff)
                                            * Class105_Sub3.anInt8465)
                                            & 0xff00);
                                    is_1006_[i_1005_]
                                            = (i_1031_ | i_1032_ | i_1033_) >>> 8;
                                }
                            }
                        } else if (i_1007_ == 3) {
                            byte i_1034_ = aByteArray9934[i_1004_];
                            int i_1035_
                                    = i_1034_ > 0 ? anIntArray9935[i_1034_] : 0;
                            int i_1036_ = Class105_Sub3.anInt8480;
                            int i_1037_ = i_1035_ + i_1036_;
                            int i_1038_
                                    = (i_1035_ & 0xff00ff) + (i_1036_ & 0xff00ff);
                            int i_1039_ = ((i_1038_ & 0x1000100)
                                    + (i_1037_ - i_1038_ & 0x10000));
                            i_1039_ = i_1037_ - i_1039_ | i_1039_ - (i_1039_
                                    >>> 8);
                            if (i_1035_ == 0
                                    && Class105_Sub3.anInt8477 != 255) {
                                i_1035_ = i_1039_;
                                i_1039_ = is_1006_[i_1005_];
                                i_1039_ = (((((i_1035_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_1039_ & 0xff00ff)
                                        * Class105_Sub3.anInt8472))
                                        & ~0xff00ff)
                                        + ((((i_1035_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_1039_ & 0xff00)
                                        * Class105_Sub3.anInt8472))
                                        & 0xff0000)) >> 8;
                            }
                            is_1006_[i_1005_] = i_1039_;
                        } else if (i_1007_ == 2) {
                            int i_1040_ = aByteArray9934[i_1004_];
                            if (i_1040_ != 0) {
                                int i_1041_ = anIntArray9935[i_1040_ & 0xff];
                                int i_1042_ = (((i_1041_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_1043_ = (((i_1041_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                is_1006_[i_1005_++]
                                        = (((i_1042_ | i_1043_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (i_1008_ == 2) {
                        if (i_1007_ == 1) {
                            int i_1044_ = aByteArray9934[i_1004_];
                            if (i_1044_ != 0) {
                                int i_1045_ = anIntArray9935[i_1044_ & 0xff];
                                int i_1046_ = is_1006_[i_1005_];
                                int i_1047_ = i_1045_ + i_1046_;
                                int i_1048_ = ((i_1045_ & 0xff00ff)
                                        + (i_1046_ & 0xff00ff));
                                i_1046_ = ((i_1048_ & 0x1000100)
                                        + (i_1047_ - i_1048_ & 0x10000));
                                is_1006_[i_1005_]
                                        = i_1047_ - i_1046_ | i_1046_ - (i_1046_
                                        >>> 8);
                            }
                        } else if (i_1007_ == 0) {
                            int i_1049_ = aByteArray9934[i_1004_];
                            if (i_1049_ != 0) {
                                int i_1050_ = anIntArray9935[i_1049_ & 0xff];
                                int i_1051_ = (((i_1050_ & 0xff0000)
                                        * Class105_Sub3.anInt8469)
                                        & ~0xffffff);
                                int i_1052_ = (((i_1050_ & 0xff00)
                                        * Class105_Sub3.anInt8463)
                                        & 0xff0000);
                                int i_1053_ = (((i_1050_ & 0xff)
                                        * Class105_Sub3.anInt8465)
                                        & 0xff00);
                                i_1050_ = (i_1051_ | i_1052_ | i_1053_) >>> 8;
                                int i_1054_ = is_1006_[i_1005_];
                                int i_1055_ = i_1050_ + i_1054_;
                                int i_1056_ = ((i_1050_ & 0xff00ff)
                                        + (i_1054_ & 0xff00ff));
                                i_1054_ = ((i_1056_ & 0x1000100)
                                        + (i_1055_ - i_1056_ & 0x10000));
                                is_1006_[i_1005_]
                                        = i_1055_ - i_1054_ | i_1054_ - (i_1054_
                                        >>> 8);
                            }
                        } else if (i_1007_ == 3) {
                            byte i_1057_ = aByteArray9934[i_1004_];
                            int i_1058_
                                    = i_1057_ > 0 ? anIntArray9935[i_1057_] : 0;
                            int i_1059_ = Class105_Sub3.anInt8480;
                            int i_1060_ = i_1058_ + i_1059_;
                            int i_1061_
                                    = (i_1058_ & 0xff00ff) + (i_1059_ & 0xff00ff);
                            int i_1062_ = ((i_1061_ & 0x1000100)
                                    + (i_1060_ - i_1061_ & 0x10000));
                            i_1062_ = i_1060_ - i_1062_ | i_1062_ - (i_1062_
                                    >>> 8);
                            if (i_1058_ == 0
                                    && Class105_Sub3.anInt8477 != 255) {
                                i_1058_ = i_1062_;
                                i_1062_ = is_1006_[i_1005_];
                                i_1062_ = (((((i_1058_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_1062_ & 0xff00ff)
                                        * Class105_Sub3.anInt8472))
                                        & ~0xff00ff)
                                        + ((((i_1058_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        + ((i_1062_ & 0xff00)
                                        * Class105_Sub3.anInt8472))
                                        & 0xff0000)) >> 8;
                            }
                            is_1006_[i_1005_] = i_1062_;
                        } else if (i_1007_ == 2) {
                            int i_1063_ = aByteArray9934[i_1004_];
                            if (i_1063_ != 0) {
                                int i_1064_ = anIntArray9935[i_1063_ & 0xff];
                                int i_1065_ = (((i_1064_ & 0xff00ff)
                                        * Class105_Sub3.anInt8477)
                                        & ~0xff00ff);
                                int i_1066_ = (((i_1064_ & 0xff00)
                                        * Class105_Sub3.anInt8477)
                                        & 0xff0000);
                                i_1064_ = (((i_1065_ | i_1066_) >>> 8)
                                        + Class105_Sub3.anInt8474);
                                int i_1067_ = is_1006_[i_1005_];
                                int i_1068_ = i_1064_ + i_1067_;
                                int i_1069_ = ((i_1064_ & 0xff00ff)
                                        + (i_1067_ & 0xff00ff));
                                i_1067_ = ((i_1069_ & 0x1000100)
                                        + (i_1068_ - i_1069_ & 0x10000));
                                is_1006_[i_1005_]
                                        = i_1068_ - i_1067_ | i_1067_ - (i_1067_
                                        >>> 8);
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    i_999_ += Class105_Sub3.anInt8481;
                    i_1000_ += Class105_Sub3.anInt8450;
                }
                Class105_Sub3.anInt8458 += Class105_Sub3.anInt8457;
                Class105_Sub3.anInt8467 += Class105_Sub3.anInt8452;
                Class105_Sub3.anInt8451 += Class105_Sub3.anInt8453;
            }
        }
    }

    final void method963(int i, int i_1070_, aa var_aa, int i_1071_,
                         int i_1072_) {
        if (((Class105_Sub3) this).aHa_Sub1_8460.method3716())
            throw new IllegalStateException();
        i += ((Class105_Sub3) this).anInt8461;
        i_1070_ += ((Class105_Sub3) this).anInt8464;
        int i_1073_ = 0;
        int i_1074_
                = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7477;
        int i_1075_ = ((Class105_Sub3) this).anInt8471;
        int i_1076_ = ((Class105_Sub3) this).anInt8470;
        int i_1077_ = i_1074_ - i_1075_;
        int i_1078_ = 0;
        int i_1079_ = i + i_1070_ * i_1074_;
        if (i_1070_
                < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476) {
            int i_1080_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476
                    - i_1070_);
            i_1076_ -= i_1080_;
            i_1070_
                    = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476;
            i_1073_ += i_1080_ * i_1075_;
            i_1079_ += i_1080_ * i_1074_;
        }
        if (i_1070_ + i_1076_
                > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7503)
            i_1076_
                    -= i_1070_ + i_1076_ - ((ha_Sub1) (((Class105_Sub3) this)
                    .aHa_Sub1_8460)).anInt7503;
        if (i < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496) {
            int i_1081_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496
                    - i);
            i_1075_ -= i_1081_;
            i = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496;
            i_1073_ += i_1081_;
            i_1079_ += i_1081_;
            i_1078_ += i_1081_;
            i_1077_ += i_1081_;
        }
        if (i + i_1075_
                > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7507) {
            int i_1082_ = (i + i_1075_
                    - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anInt7507));
            i_1075_ -= i_1082_;
            i_1078_ += i_1082_;
            i_1077_ += i_1082_;
        }
        if (i_1075_ > 0 && i_1076_ > 0) {
            aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
            int[] is = ((aa_Sub3) var_aa_Sub3).anIntArray5201;
            int[] is_1083_ = ((aa_Sub3) var_aa_Sub3).anIntArray5202;
            int[] is_1084_ = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            int i_1085_ = i_1070_;
            if (i_1072_ > i_1085_) {
                i_1085_ = i_1072_;
                i_1079_ += (i_1072_ - i_1070_) * i_1074_;
                i_1073_
                        += (i_1072_ - i_1070_) * ((Class105_Sub3) this).anInt8471;
            }
            int i_1086_ = (i_1072_ + is.length < i_1070_ + i_1076_
                    ? i_1072_ + is.length : i_1070_ + i_1076_);
            for (int i_1087_ = i_1085_; i_1087_ < i_1086_; i_1087_++) {
                int i_1088_ = is[i_1087_ - i_1072_] + i_1071_;
                int i_1089_ = is_1083_[i_1087_ - i_1072_];
                int i_1090_ = i_1075_;
                if (i > i_1088_) {
                    int i_1091_ = i - i_1088_;
                    if (i_1091_ >= i_1089_) {
                        i_1073_ += i_1075_ + i_1078_;
                        i_1079_ += i_1075_ + i_1077_;
                        continue;
                    }
                    i_1089_ -= i_1091_;
                } else {
                    int i_1092_ = i_1088_ - i;
                    if (i_1092_ >= i_1075_) {
                        i_1073_ += i_1075_ + i_1078_;
                        i_1079_ += i_1075_ + i_1077_;
                        continue;
                    }
                    i_1073_ += i_1092_;
                    i_1090_ -= i_1092_;
                    i_1079_ += i_1092_;
                }
                int i_1093_ = 0;
                if (i_1090_ < i_1089_)
                    i_1089_ = i_1090_;
                else
                    i_1093_ = i_1090_ - i_1089_;
                for (int i_1094_ = -i_1089_; i_1094_ < 0; i_1094_++) {
                    int i_1095_ = aByteArray9934[i_1073_++];
                    if (i_1095_ != 0)
                        is_1084_[i_1079_++] = anIntArray9935[i_1095_ & 0xff];
                    else
                        i_1079_++;
                }
                i_1073_ += i_1093_ + i_1078_;
                i_1079_ += i_1093_ + i_1077_;
            }
        }
    }

    final void method964(int i, int i_1096_, int i_1097_, int i_1098_,
                         int i_1099_) {
        if (((Class105_Sub3) this).aHa_Sub1_8460.method3716())
            throw new IllegalStateException();
        int i_1100_
                = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7477;
        i += ((Class105_Sub3) this).anInt8461;
        i_1096_ += ((Class105_Sub3) this).anInt8464;
        int i_1101_ = i_1096_ * i_1100_ + i;
        int i_1102_ = 0;
        int i_1103_ = ((Class105_Sub3) this).anInt8470;
        int i_1104_ = ((Class105_Sub3) this).anInt8471;
        int i_1105_ = i_1100_ - i_1104_;
        int i_1106_ = 0;
        if (i_1096_
                < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476) {
            int i_1107_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476
                    - i_1096_);
            i_1103_ -= i_1107_;
            i_1096_
                    = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7476;
            i_1102_ += i_1107_ * i_1104_;
            i_1101_ += i_1107_ * i_1100_;
        }
        if (i_1096_ + i_1103_
                > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7503)
            i_1103_
                    -= i_1096_ + i_1103_ - ((ha_Sub1) (((Class105_Sub3) this)
                    .aHa_Sub1_8460)).anInt7503;
        if (i < ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496) {
            int i_1108_
                    = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496
                    - i);
            i_1104_ -= i_1108_;
            i = ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7496;
            i_1102_ += i_1108_;
            i_1101_ += i_1108_;
            i_1106_ += i_1108_;
            i_1105_ += i_1108_;
        }
        if (i + i_1104_
                > ((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460).anInt7507) {
            int i_1109_ = (i + i_1104_
                    - (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anInt7507));
            i_1104_ -= i_1109_;
            i_1106_ += i_1109_;
            i_1105_ += i_1109_;
        }
        if (i_1104_ > 0 && i_1103_ > 0) {
            int[] is = (((ha_Sub1) ((Class105_Sub3) this).aHa_Sub1_8460)
                    .anIntArray7483);
            if (i_1099_ == 0) {
                if (i_1097_ == 1) {
                    for (int i_1110_ = -i_1103_; i_1110_ < 0; i_1110_++) {
                        int i_1111_ = i_1101_ + i_1104_ - 3;
                        while (i_1101_ < i_1111_) {
                            is[i_1101_++]
                                    = (anIntArray9935
                                    [aByteArray9934[i_1102_++] & 0xff]);
                            is[i_1101_++]
                                    = (anIntArray9935
                                    [aByteArray9934[i_1102_++] & 0xff]);
                            is[i_1101_++]
                                    = (anIntArray9935
                                    [aByteArray9934[i_1102_++] & 0xff]);
                            is[i_1101_++]
                                    = (anIntArray9935
                                    [aByteArray9934[i_1102_++] & 0xff]);
                        }
                        i_1111_ += 3;
                        while (i_1101_ < i_1111_)
                            is[i_1101_++]
                                    = (anIntArray9935
                                    [aByteArray9934[i_1102_++] & 0xff]);
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                if (i_1097_ == 0) {
                    int i_1112_ = (i_1098_ & 0xff0000) >> 16;
                    int i_1113_ = (i_1098_ & 0xff00) >> 8;
                    int i_1114_ = i_1098_ & 0xff;
                    for (int i_1115_ = -i_1103_; i_1115_ < 0; i_1115_++) {
                        for (int i_1116_ = -i_1104_; i_1116_ < 0; i_1116_++) {
                            int i_1117_ = (anIntArray9935
                                    [aByteArray9934[i_1102_++] & 0xff]);
                            int i_1118_
                                    = (i_1117_ & 0xff0000) * i_1112_ & ~0xffffff;
                            int i_1119_
                                    = (i_1117_ & 0xff00) * i_1113_ & 0xff0000;
                            int i_1120_ = (i_1117_ & 0xff) * i_1114_ & 0xff00;
                            is[i_1101_++]
                                    = (i_1118_ | i_1119_ | i_1120_) >>> 8;
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                if (i_1097_ == 3) {
                    for (int i_1121_ = -i_1103_; i_1121_ < 0; i_1121_++) {
                        for (int i_1122_ = -i_1104_; i_1122_ < 0; i_1122_++) {
                            int i_1123_ = (anIntArray9935
                                    [aByteArray9934[i_1102_++] & 0xff]);
                            int i_1124_ = i_1123_ + i_1098_;
                            int i_1125_
                                    = (i_1123_ & 0xff00ff) + (i_1098_ & 0xff00ff);
                            int i_1126_ = ((i_1125_ & 0x1000100)
                                    + (i_1124_ - i_1125_ & 0x10000));
                            is[i_1101_++]
                                    = i_1124_ - i_1126_ | i_1126_ - (i_1126_
                                    >>> 8);
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                if (i_1097_ == 2) {
                    int i_1127_ = i_1098_ >>> 24;
                    int i_1128_ = 256 - i_1127_;
                    int i_1129_ = (i_1098_ & 0xff00ff) * i_1128_ & ~0xff00ff;
                    int i_1130_ = (i_1098_ & 0xff00) * i_1128_ & 0xff0000;
                    i_1098_ = (i_1129_ | i_1130_) >>> 8;
                    for (int i_1131_ = -i_1103_; i_1131_ < 0; i_1131_++) {
                        for (int i_1132_ = -i_1104_; i_1132_ < 0; i_1132_++) {
                            int i_1133_ = (anIntArray9935
                                    [aByteArray9934[i_1102_++] & 0xff]);
                            i_1129_
                                    = (i_1133_ & 0xff00ff) * i_1127_ & ~0xff00ff;
                            i_1130_ = (i_1133_ & 0xff00) * i_1127_ & 0xff0000;
                            is[i_1101_++]
                                    = ((i_1129_ | i_1130_) >>> 8) + i_1098_;
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_1099_ == 1) {
                if (i_1097_ == 1) {
                    for (int i_1134_ = -i_1103_; i_1134_ < 0; i_1134_++) {
                        for (int i_1135_ = -i_1104_; i_1135_ < 0; i_1135_++) {
                            int i_1136_ = aByteArray9934[i_1102_++];
                            if (i_1136_ != 0) {
                                int i_1137_ = (anIntArray9935[i_1136_ & 0xff]
                                        | ~0xffffff);
                                int i_1138_ = 255;
                                int i_1139_ = 0;
                                int i_1140_ = is[i_1101_];
                                is[i_1101_++]
                                        = (((((i_1137_ & 0xff00ff) * i_1138_
                                        + (i_1140_ & 0xff00ff) * i_1139_)
                                        & ~0xff00ff)
                                        >> 8)
                                        + (((((i_1137_ & ~0xff00ff) >>> 8)
                                        * i_1138_)
                                        + (((i_1140_ & ~0xff00ff) >>> 8)
                                        * i_1139_))
                                        & ~0xff00ff));
                            } else
                                i_1101_++;
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                if (i_1097_ == 0) {
                    if ((i_1098_ & 0xffffff) == 16777215) {
                        int i_1141_ = i_1098_ >>> 24;
                        int i_1142_ = 256 - i_1141_;
                        for (int i_1143_ = -i_1103_; i_1143_ < 0; i_1143_++) {
                            for (int i_1144_ = -i_1104_; i_1144_ < 0;
                                 i_1144_++) {
                                int i_1145_ = aByteArray9934[i_1102_++];
                                if (i_1145_ != 0) {
                                    int i_1146_
                                            = anIntArray9935[i_1145_ & 0xff];
                                    int i_1147_ = is[i_1101_];
                                    is[i_1101_++]
                                            = ((((i_1146_ & 0xff00ff) * i_1141_
                                            + (i_1147_ & 0xff00ff) * i_1142_)
                                            & ~0xff00ff)
                                            + (((i_1146_ & 0xff00) * i_1141_
                                            + (i_1147_ & 0xff00) * i_1142_)
                                            & 0xff0000)) >> 8;
                                } else
                                    i_1101_++;
                            }
                            i_1101_ += i_1105_;
                            i_1102_ += i_1106_;
                        }
                    } else {
                        int i_1148_ = (i_1098_ & 0xff0000) >> 16;
                        int i_1149_ = (i_1098_ & 0xff00) >> 8;
                        int i_1150_ = i_1098_ & 0xff;
                        int i_1151_ = i_1098_ >>> 24;
                        int i_1152_ = 256 - i_1151_;
                        for (int i_1153_ = -i_1103_; i_1153_ < 0; i_1153_++) {
                            for (int i_1154_ = -i_1104_; i_1154_ < 0;
                                 i_1154_++) {
                                int i_1155_ = aByteArray9934[i_1102_++];
                                if (i_1155_ != 0) {
                                    int i_1156_
                                            = anIntArray9935[i_1155_ & 0xff];
                                    if (i_1151_ != 255) {
                                        int i_1157_
                                                = ((i_1156_ & 0xff0000) * i_1148_
                                                & ~0xffffff);
                                        int i_1158_
                                                = ((i_1156_ & 0xff00) * i_1149_
                                                & 0xff0000);
                                        int i_1159_
                                                = ((i_1156_ & 0xff) * i_1150_
                                                & 0xff00);
                                        i_1156_ = (i_1157_ | i_1158_
                                                | i_1159_) >>> 8;
                                        int i_1160_ = is[i_1101_];
                                        is[i_1101_++]
                                                = ((((i_1156_ & 0xff00ff) * i_1151_
                                                + ((i_1160_ & 0xff00ff)
                                                * i_1152_))
                                                & ~0xff00ff)
                                                + (((i_1156_ & 0xff00) * i_1151_
                                                + ((i_1160_ & 0xff00)
                                                * i_1152_))
                                                & 0xff0000)) >> 8;
                                    } else {
                                        int i_1161_
                                                = ((i_1156_ & 0xff0000) * i_1148_
                                                & ~0xffffff);
                                        int i_1162_
                                                = ((i_1156_ & 0xff00) * i_1149_
                                                & 0xff0000);
                                        int i_1163_
                                                = ((i_1156_ & 0xff) * i_1150_
                                                & 0xff00);
                                        is[i_1101_++] = (i_1161_ | i_1162_
                                                | i_1163_) >>> 8;
                                    }
                                } else
                                    i_1101_++;
                            }
                            i_1101_ += i_1105_;
                            i_1102_ += i_1106_;
                        }
                        return;
                    }
                    return;
                }
                if (i_1097_ == 3) {
                    int i_1164_ = i_1098_ >>> 24;
                    int i_1165_ = 256 - i_1164_;
                    for (int i_1166_ = -i_1103_; i_1166_ < 0; i_1166_++) {
                        for (int i_1167_ = -i_1104_; i_1167_ < 0; i_1167_++) {
                            byte i_1168_ = aByteArray9934[i_1102_++];
                            int i_1169_
                                    = i_1168_ > 0 ? anIntArray9935[i_1168_] : 0;
                            int i_1170_ = i_1169_ + i_1098_;
                            int i_1171_
                                    = (i_1169_ & 0xff00ff) + (i_1098_ & 0xff00ff);
                            int i_1172_ = ((i_1171_ & 0x1000100)
                                    + (i_1170_ - i_1171_ & 0x10000));
                            i_1172_ = i_1170_ - i_1172_ | i_1172_ - (i_1172_
                                    >>> 8);
                            if (i_1169_ == 0 && i_1164_ != 255) {
                                i_1169_ = i_1172_;
                                i_1172_ = is[i_1101_];
                                i_1172_ = ((((i_1169_ & 0xff00ff) * i_1164_
                                        + (i_1172_ & 0xff00ff) * i_1165_)
                                        & ~0xff00ff)
                                        + (((i_1169_ & 0xff00) * i_1164_
                                        + (i_1172_ & 0xff00) * i_1165_)
                                        & 0xff0000)) >> 8;
                            }
                            is[i_1101_++] = i_1172_;
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                if (i_1097_ == 2) {
                    int i_1173_ = i_1098_ >>> 24;
                    int i_1174_ = 256 - i_1173_;
                    int i_1175_ = (i_1098_ & 0xff00ff) * i_1174_ & ~0xff00ff;
                    int i_1176_ = (i_1098_ & 0xff00) * i_1174_ & 0xff0000;
                    i_1098_ = (i_1175_ | i_1176_) >>> 8;
                    for (int i_1177_ = -i_1103_; i_1177_ < 0; i_1177_++) {
                        for (int i_1178_ = -i_1104_; i_1178_ < 0; i_1178_++) {
                            int i_1179_ = aByteArray9934[i_1102_++];
                            if (i_1179_ != 0) {
                                int i_1180_ = anIntArray9935[i_1179_ & 0xff];
                                i_1175_ = ((i_1180_ & 0xff00ff) * i_1173_
                                        & ~0xff00ff);
                                i_1176_
                                        = (i_1180_ & 0xff00) * i_1173_ & 0xff0000;
                                is[i_1101_++]
                                        = ((i_1175_ | i_1176_) >>> 8) + i_1098_;
                            } else
                                i_1101_++;
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (i_1099_ == 2) {
                if (i_1097_ == 1) {
                    for (int i_1181_ = -i_1103_; i_1181_ < 0; i_1181_++) {
                        for (int i_1182_ = -i_1104_; i_1182_ < 0; i_1182_++) {
                            int i_1183_ = aByteArray9934[i_1102_++];
                            if (i_1183_ != 0) {
                                int i_1184_ = anIntArray9935[i_1183_ & 0xff];
                                int i_1185_ = is[i_1101_];
                                int i_1186_ = i_1184_ + i_1185_;
                                int i_1187_ = ((i_1184_ & 0xff00ff)
                                        + (i_1185_ & 0xff00ff));
                                i_1185_ = ((i_1187_ & 0x1000100)
                                        + (i_1186_ - i_1187_ & 0x10000));
                                is[i_1101_++]
                                        = i_1186_ - i_1185_ | i_1185_ - (i_1185_
                                        >>> 8);
                            } else
                                i_1101_++;
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                if (i_1097_ == 0) {
                    int i_1188_ = (i_1098_ & 0xff0000) >> 16;
                    int i_1189_ = (i_1098_ & 0xff00) >> 8;
                    int i_1190_ = i_1098_ & 0xff;
                    for (int i_1191_ = -i_1103_; i_1191_ < 0; i_1191_++) {
                        for (int i_1192_ = -i_1104_; i_1192_ < 0; i_1192_++) {
                            int i_1193_ = aByteArray9934[i_1102_++];
                            if (i_1193_ != 0) {
                                int i_1194_ = anIntArray9935[i_1193_ & 0xff];
                                int i_1195_ = ((i_1194_ & 0xff0000) * i_1188_
                                        & ~0xffffff);
                                int i_1196_
                                        = (i_1194_ & 0xff00) * i_1189_ & 0xff0000;
                                int i_1197_
                                        = (i_1194_ & 0xff) * i_1190_ & 0xff00;
                                i_1194_ = (i_1195_ | i_1196_ | i_1197_) >>> 8;
                                int i_1198_ = is[i_1101_];
                                int i_1199_ = i_1194_ + i_1198_;
                                int i_1200_ = ((i_1194_ & 0xff00ff)
                                        + (i_1198_ & 0xff00ff));
                                i_1198_ = ((i_1200_ & 0x1000100)
                                        + (i_1199_ - i_1200_ & 0x10000));
                                is[i_1101_++]
                                        = i_1199_ - i_1198_ | i_1198_ - (i_1198_
                                        >>> 8);
                            } else
                                i_1101_++;
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                if (i_1097_ == 3) {
                    for (int i_1201_ = -i_1103_; i_1201_ < 0; i_1201_++) {
                        for (int i_1202_ = -i_1104_; i_1202_ < 0; i_1202_++) {
                            byte i_1203_ = aByteArray9934[i_1102_++];
                            int i_1204_
                                    = i_1203_ > 0 ? anIntArray9935[i_1203_] : 0;
                            int i_1205_ = i_1204_ + i_1098_;
                            int i_1206_
                                    = (i_1204_ & 0xff00ff) + (i_1098_ & 0xff00ff);
                            int i_1207_ = ((i_1206_ & 0x1000100)
                                    + (i_1205_ - i_1206_ & 0x10000));
                            i_1204_ = i_1205_ - i_1207_ | i_1207_ - (i_1207_
                                    >>> 8);
                            i_1207_ = is[i_1101_];
                            i_1205_ = i_1204_ + i_1207_;
                            i_1206_
                                    = (i_1204_ & 0xff00ff) + (i_1207_ & 0xff00ff);
                            i_1207_
                                    = (i_1206_ & 0x1000100) + (i_1205_ - i_1206_
                                    & 0x10000);
                            is[i_1101_++]
                                    = i_1205_ - i_1207_ | i_1207_ - (i_1207_
                                    >>> 8);
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                if (i_1097_ == 2) {
                    int i_1208_ = i_1098_ >>> 24;
                    int i_1209_ = 256 - i_1208_;
                    int i_1210_ = (i_1098_ & 0xff00ff) * i_1209_ & ~0xff00ff;
                    int i_1211_ = (i_1098_ & 0xff00) * i_1209_ & 0xff0000;
                    i_1098_ = (i_1210_ | i_1211_) >>> 8;
                    for (int i_1212_ = -i_1103_; i_1212_ < 0; i_1212_++) {
                        for (int i_1213_ = -i_1104_; i_1213_ < 0; i_1213_++) {
                            int i_1214_ = aByteArray9934[i_1102_++];
                            if (i_1214_ != 0) {
                                int i_1215_ = anIntArray9935[i_1214_ & 0xff];
                                i_1210_ = ((i_1215_ & 0xff00ff) * i_1208_
                                        & ~0xff00ff);
                                i_1211_
                                        = (i_1215_ & 0xff00) * i_1208_ & 0xff0000;
                                i_1215_
                                        = ((i_1210_ | i_1211_) >>> 8) + i_1098_;
                                int i_1216_ = is[i_1101_];
                                int i_1217_ = i_1215_ + i_1216_;
                                int i_1218_ = ((i_1215_ & 0xff00ff)
                                        + (i_1216_ & 0xff00ff));
                                i_1216_ = ((i_1218_ & 0x1000100)
                                        + (i_1217_ - i_1218_ & 0x10000));
                                is[i_1101_++]
                                        = i_1217_ - i_1216_ | i_1216_ - (i_1216_
                                        >>> 8);
                            } else
                                i_1101_++;
                        }
                        i_1101_ += i_1105_;
                        i_1102_ += i_1106_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }
}
