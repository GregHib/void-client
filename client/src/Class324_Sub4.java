/* Class324_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class324_Sub4 extends Class324 {
    private final int[] anIntArray6503;
    private final byte[][] aByteArrayArray6504;
    private final int[] anIntArray6505;
    private ha_Sub1 aHa_Sub1_6506;
    private final int[] anIntArray6507;
    private final int[] anIntArray6508;

    Class324_Sub4(ha_Sub1 var_ha_Sub1, Class143 class143, Class207[] class207s,
                  int[] is, int[] is_0_) {
        super(var_ha_Sub1, class143);
        aHa_Sub1_6506 = var_ha_Sub1;
        aHa_Sub1_6506 = var_ha_Sub1;
        anIntArray6503 = is;
        anIntArray6505 = is_0_;
        aByteArrayArray6504 = new byte[class207s.length][];
        anIntArray6508 = new int[class207s.length];
        anIntArray6507 = new int[class207s.length];
        for (int i = 0; i < class207s.length; i++) {
            Class207 class207 = class207s[i];
            if (class207.aByteArray2695 != null)
                aByteArrayArray6504[i] = class207.aByteArray2695;
            else {
                byte[] is_1_ = class207.aByteArray2699;
                byte[] is_2_ = aByteArrayArray6504[i] = new byte[is_1_.length];
                for (int i_3_ = 0; i_3_ < is_1_.length; i_3_++)
                    is_2_[i_3_] = (byte) (is_1_[i_3_] == 0 ? 0 : -1);
            }
            anIntArray6508[i] = class207.anInt2700;
            anIntArray6507[i] = class207.anInt2703;
        }
    }

    private final void method2594(byte[] is, int[] is_4_, int i, int i_5_,
                                  int i_6_, int i_7_, int i_8_, int i_9_,
                                  int i_10_, int i_11_, int i_12_, int i_13_,
                                  aa var_aa, int i_14_, int i_15_) {
        aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
        int[] is_16_ = var_aa_Sub3.anIntArray5201;
        int[] is_17_ = var_aa_Sub3.anIntArray5202;
        int i_18_ = i_11_ - aHa_Sub1_6506.anInt7496;
        int i_19_ = i_12_;
        if (i_15_ > i_19_) {
            i_19_ = i_15_;
            i_6_ += (i_15_ - i_12_) * aHa_Sub1_6506.anInt7477;
            i_5_ += (i_15_ - i_12_) * i_13_;
        }
        int i_20_ = (i_15_ + is_16_.length < i_12_ + i_8_
                ? i_15_ + is_16_.length : i_12_ + i_8_);
        for (int i_21_ = i_19_; i_21_ < i_20_; i_21_++) {
            int i_22_ = is_16_[i_21_ - i_15_] + i_14_;
            int i_23_ = is_17_[i_21_ - i_15_];
            int i_24_ = i_7_;
            if (i_18_ > i_22_) {
                int i_25_ = i_18_ - i_22_;
                if (i_25_ >= i_23_) {
                    i_5_ += i_7_ + i_10_;
                    i_6_ += i_7_ + i_9_;
                    continue;
                }
                i_23_ -= i_25_;
            } else {
                int i_26_ = i_22_ - i_18_;
                if (i_26_ >= i_7_) {
                    i_5_ += i_7_ + i_10_;
                    i_6_ += i_7_ + i_9_;
                    continue;
                }
                i_5_ += i_26_;
                i_24_ -= i_26_;
                i_6_ += i_26_;
            }
            int i_27_ = 0;
            if (i_24_ < i_23_)
                i_23_ = i_24_;
            else
                i_27_ = i_24_ - i_23_;
            for (int i_28_ = -i_23_; i_28_ < 0; i_28_++) {
                int i_29_ = is[i_5_++] & 0xff;
                if (i_29_ != 0) {
                    int i_30_ = ((((i & 0xff00ff) * i_29_ & ~0xff00ff)
                            + ((i & 0xff00) * i_29_ & 0xff0000))
                            >> 8);
                    i_29_ = 256 - i_29_;
                    int i_31_ = is_4_[i_6_];
                    is_4_[i_6_++] = ((((i_31_ & 0xff00ff) * i_29_ & ~0xff00ff)
                            + ((i_31_ & 0xff00) * i_29_ & 0xff0000))
                            >> 8) + i_30_;
                } else
                    i_6_++;
            }
            i_5_ += i_27_ + i_10_;
            i_6_ += i_27_ + i_9_;
        }
    }

    private final void method2595(byte[] is, int[] is_32_, int i, int i_33_,
                                  int i_34_, int i_35_, int i_36_, int i_37_,
                                  int i_38_) {
        for (int i_39_ = -i_36_; i_39_ < 0; i_39_++) {
            for (int i_40_ = -i_35_; i_40_ < 0; i_40_++) {
                int i_41_ = is[i_33_++] & 0xff;
                if (i_41_ != 0) {
                    int i_42_ = ((((i & 0xff00ff) * i_41_ & ~0xff00ff)
                            + ((i & 0xff00) * i_41_ & 0xff0000))
                            >> 8);
                    i_41_ = 256 - i_41_;
                    int i_43_ = is_32_[i_34_];
                    is_32_[i_34_++]
                            = ((((i_43_ & 0xff00ff) * i_41_ & ~0xff00ff)
                            + ((i_43_ & 0xff00) * i_41_ & 0xff0000))
                            >> 8) + i_42_;
                } else
                    i_34_++;
            }
            i_34_ += i_37_;
            i_33_ += i_38_;
        }
    }

    final void method2578(char c, int i, int i_44_, int i_45_, boolean bool,
                          aa var_aa, int i_46_, int i_47_) {
        if (var_aa == null)
            fa(c, i, i_44_, i_45_, bool);
        else {
            i += anIntArray6507[c];
            i_44_ += anIntArray6508[c];
            int i_48_ = anIntArray6503[c];
            int i_49_ = anIntArray6505[c];
            int i_50_ = aHa_Sub1_6506.anInt7477;
            int i_51_ = i + i_44_ * i_50_;
            int i_52_ = i_50_ - i_48_;
            int i_53_ = 0;
            int i_54_ = 0;
            if (i_44_ < aHa_Sub1_6506.anInt7476) {
                int i_55_ = aHa_Sub1_6506.anInt7476 - i_44_;
                i_49_ -= i_55_;
                i_44_ = aHa_Sub1_6506.anInt7476;
                i_54_ += i_55_ * i_48_;
                i_51_ += i_55_ * i_50_;
            }
            if (i_44_ + i_49_ > aHa_Sub1_6506.anInt7503)
                i_49_ -= i_44_ + i_49_ - aHa_Sub1_6506.anInt7503;
            if (i < aHa_Sub1_6506.anInt7496) {
                int i_56_ = aHa_Sub1_6506.anInt7496 - i;
                i_48_ -= i_56_;
                i = aHa_Sub1_6506.anInt7496;
                i_54_ += i_56_;
                i_51_ += i_56_;
                i_53_ += i_56_;
                i_52_ += i_56_;
            }
            if (i + i_48_ > aHa_Sub1_6506.anInt7507) {
                int i_57_ = i + i_48_ - aHa_Sub1_6506.anInt7507;
                i_48_ -= i_57_;
                i_53_ += i_57_;
                i_52_ += i_57_;
            }
            if (i_48_ > 0 && i_49_ > 0)
                method2594(aByteArrayArray6504[c],
                        aHa_Sub1_6506.anIntArray7483, i_45_,
                        i_54_, i_51_, i_48_, i_49_, i_52_, i_53_, i, i_44_,
                        anIntArray6503[c], var_aa, i_46_, i_47_);
        }
    }

    final void fa(char c, int i, int i_58_, int i_59_, boolean bool) {
        i += anIntArray6507[c];
        i_58_ += anIntArray6508[c];
        int i_60_ = anIntArray6503[c];
        int i_61_ = anIntArray6505[c];
        int i_62_ = aHa_Sub1_6506.anInt7477;
        int i_63_ = i + i_58_ * i_62_;
        int i_64_ = i_62_ - i_60_;
        int i_65_ = 0;
        int i_66_ = 0;
        if (i_58_ < aHa_Sub1_6506.anInt7476) {
            int i_67_ = aHa_Sub1_6506.anInt7476 - i_58_;
            i_61_ -= i_67_;
            i_58_ = aHa_Sub1_6506.anInt7476;
            i_66_ += i_67_ * i_60_;
            i_63_ += i_67_ * i_62_;
        }
        if (i_58_ + i_61_ > aHa_Sub1_6506.anInt7503)
            i_61_ -= i_58_ + i_61_ - aHa_Sub1_6506.anInt7503;
        if (i < aHa_Sub1_6506.anInt7496) {
            int i_68_ = aHa_Sub1_6506.anInt7496 - i;
            i_60_ -= i_68_;
            i = aHa_Sub1_6506.anInt7496;
            i_66_ += i_68_;
            i_63_ += i_68_;
            i_65_ += i_68_;
            i_64_ += i_68_;
        }
        if (i + i_60_ > aHa_Sub1_6506.anInt7507) {
            int i_69_ = i + i_60_ - aHa_Sub1_6506.anInt7507;
            i_60_ -= i_69_;
            i_65_ += i_69_;
            i_64_ += i_69_;
        }
        if (i_60_ > 0 && i_61_ > 0)
            method2595(aByteArrayArray6504[c],
                    aHa_Sub1_6506.anIntArray7483, i_59_, i_66_,
                    i_63_, i_60_, i_61_, i_64_, i_65_);
    }
}
