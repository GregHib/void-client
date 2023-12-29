/* Class324_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FontRenderer_Sub3 extends FontRenderer {
    private final int[] anIntArray6496;
    private final int[] anIntArray6497;
    private final int[] anIntArray6498;
    private ha_Sub1 aHa_Sub1_6499;
    private final int[] anIntArray6500;
    private final int[] anIntArray6501;
    private final byte[][] aByteArrayArray6502;

    private final void method2590(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        int i_7_ = -(i_3_ >> 2);
        i_3_ = -(i_3_ & 0x3);
        for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
            for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
                if (is[i_1_++] != 0) is_0_[i_2_++] = i;
                else i_2_++;
                if (is[i_1_++] != 0) is_0_[i_2_++] = i;
                else i_2_++;
                if (is[i_1_++] != 0) is_0_[i_2_++] = i;
                else i_2_++;
                if (is[i_1_++] != 0) is_0_[i_2_++] = i;
                else i_2_++;
            }
            for (int i_10_ = i_3_; i_10_ < 0; i_10_++) {
                if (is[i_1_++] != 0) is_0_[i_2_++] = i;
                else i_2_++;
            }
            i_2_ += i_5_;
            i_1_ += i_6_;
        }
    }

    private final void method2591(byte[] is, int[] is_11_, int[] is_12_, int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
        int i_18_ = -(i_14_ >> 2);
        i_14_ = -(i_14_ & 0x3);
        boolean bool = false;
        for (int i_19_ = -i_15_; i_19_ < 0; i_19_++) {
            for (int i_20_ = i_18_; i_20_ < 0; i_20_++) {
                int i_21_;
                if ((i_21_ = is[i++]) != 0) is_11_[i_13_++] = is_12_[i_21_ & 0xff];
                else i_13_++;
                if ((i_21_ = is[i++]) != 0) is_11_[i_13_++] = is_12_[i_21_ & 0xff];
                else i_13_++;
                if ((i_21_ = is[i++]) != 0) is_11_[i_13_++] = is_12_[i_21_ & 0xff];
                else i_13_++;
                if ((i_21_ = is[i++]) != 0) is_11_[i_13_++] = is_12_[i_21_ & 0xff];
                else i_13_++;
            }
            for (int i_22_ = i_14_; i_22_ < 0; i_22_++) {
                int i_23_;
                if ((i_23_ = is[i++]) != 0) is_11_[i_13_++] = is_12_[i_23_ & 0xff];
                else i_13_++;
            }
            i_13_ += i_16_;
            i += i_17_;
        }
    }

    private final void method2592(byte[] is, int[] is_24_, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, aa var_aa, int i_34_, int i_35_) {
        aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
        int[] is_36_ = var_aa_Sub3.anIntArray5201;
        int[] is_37_ = var_aa_Sub3.anIntArray5202;
        int i_38_ = i_31_ - aHa_Sub1_6499.anInt7496;
        int i_39_ = i_32_;
        if (i_35_ > i_39_) {
            i_39_ = i_35_;
            i_26_ += (i_35_ - i_32_) * aHa_Sub1_6499.anInt7477;
            i_25_ += (i_35_ - i_32_) * i_33_;
        }
        int i_40_ = (Math.min(i_35_ + is_36_.length, i_32_ + i_28_));
        for (int i_41_ = i_39_; i_41_ < i_40_; i_41_++) {
            int i_42_ = is_36_[i_41_ - i_35_] + i_34_;
            int i_43_ = is_37_[i_41_ - i_35_];
            int i_44_ = i_27_;
            if (i_38_ > i_42_) {
                int i_45_ = i_38_ - i_42_;
                if (i_45_ >= i_43_) {
                    i_25_ += i_27_ + i_30_;
                    i_26_ += i_27_ + i_29_;
                    continue;
                }
                i_43_ -= i_45_;
            } else {
                int i_46_ = i_42_ - i_38_;
                if (i_46_ >= i_27_) {
                    i_25_ += i_27_ + i_30_;
                    i_26_ += i_27_ + i_29_;
                    continue;
                }
                i_25_ += i_46_;
                i_44_ -= i_46_;
                i_26_ += i_46_;
            }
            int i_47_ = 0;
            if (i_44_ < i_43_) i_43_ = i_44_;
            else i_47_ = i_44_ - i_43_;
            for (int i_48_ = -i_43_; i_48_ < 0; i_48_++) {
                if (is[i_25_++] != 0) is_24_[i_26_++] = i;
                else i_26_++;
            }
            i_25_ += i_47_ + i_25_;
            i_26_ += i_47_ + i_29_;
        }
    }

    FontRenderer_Sub3(ha_Sub1 var_ha_Sub1, FontMetrics fontMetrics, Class207[] class207s, int[] is, int[] is_49_) {
        super(var_ha_Sub1, fontMetrics);
        aHa_Sub1_6499 = var_ha_Sub1;
        aHa_Sub1_6499 = var_ha_Sub1;
        anIntArray6500 = is;
        anIntArray6497 = is_49_;
        aByteArrayArray6502 = new byte[class207s.length][];
        anIntArray6501 = new int[class207s.length];
        anIntArray6498 = new int[class207s.length];
        for (int i = 0; i < class207s.length; i++) {
            aByteArrayArray6502[i] = class207s[i].aByteArray2699;
            anIntArray6501[i] = class207s[i].anInt2700;
            anIntArray6498[i] = class207s[i].anInt2703;
        }
        anIntArray6496 = class207s[0].anIntArray2697;
    }

    final void method2578(char c, int i, int i_50_, int i_51_, boolean bool, aa var_aa, int i_52_, int i_53_) {
        if (var_aa == null) fa(c, i, i_50_, i_51_, bool);
        else {
            i += anIntArray6498[c];
            i_50_ += anIntArray6501[c];
            int i_54_ = anIntArray6500[c];
            int i_55_ = anIntArray6497[c];
            int i_56_ = aHa_Sub1_6499.anInt7477;
            int i_57_ = i + i_50_ * i_56_;
            int i_58_ = i_56_ - i_54_;
            int i_59_ = 0;
            int i_60_ = 0;
            if (i_50_ < aHa_Sub1_6499.anInt7476) {
                int i_61_ = aHa_Sub1_6499.anInt7476 - i_50_;
                i_55_ -= i_61_;
                i_50_ = aHa_Sub1_6499.anInt7476;
                i_60_ += i_61_ * i_54_;
                i_57_ += i_61_ * i_56_;
            }
            if (i_50_ + i_55_ > aHa_Sub1_6499.anInt7503) i_55_ -= i_50_ + i_55_ - aHa_Sub1_6499.anInt7503;
            if (i < aHa_Sub1_6499.anInt7496) {
                int i_62_ = aHa_Sub1_6499.anInt7496 - i;
                i_54_ -= i_62_;
                i = aHa_Sub1_6499.anInt7496;
                i_60_ += i_62_;
                i_57_ += i_62_;
                i_59_ += i_62_;
                i_58_ += i_62_;
            }
            if (i + i_54_ > aHa_Sub1_6499.anInt7507) {
                int i_63_ = i + i_54_ - aHa_Sub1_6499.anInt7507;
                i_54_ -= i_63_;
                i_59_ += i_63_;
                i_58_ += i_63_;
            }
            if (i_54_ > 0 && i_55_ > 0) {
                if (bool) method2592(aByteArrayArray6502[c], aHa_Sub1_6499.anIntArray7483, i_51_, i_60_, i_57_, i_54_, i_55_, i_58_, i_59_, i, i_50_, anIntArray6500[c], var_aa, i_52_, i_53_);
                else method2593(aByteArrayArray6502[c], aHa_Sub1_6499.anIntArray7483, anIntArray6496, i_51_, i_60_, i_57_, i_54_, i_55_, i_58_, i_59_, i, i_50_, anIntArray6500[c], var_aa, i_52_, i_53_);
            }
        }
    }

    final void fa(char c, int i, int i_64_, int i_65_, boolean bool) {
        i += anIntArray6498[c];
        i_64_ += anIntArray6501[c];
        int i_66_ = anIntArray6500[c];
        int i_67_ = anIntArray6497[c];
        int i_68_ = aHa_Sub1_6499.anInt7477;
        int i_69_ = i + i_64_ * i_68_;
        int i_70_ = i_68_ - i_66_;
        int i_71_ = 0;
        int i_72_ = 0;
        if (i_64_ < aHa_Sub1_6499.anInt7476) {
            int i_73_ = aHa_Sub1_6499.anInt7476 - i_64_;
            i_67_ -= i_73_;
            i_64_ = aHa_Sub1_6499.anInt7476;
            i_72_ += i_73_ * i_66_;
            i_69_ += i_73_ * i_68_;
        }
        if (i_64_ + i_67_ > aHa_Sub1_6499.anInt7503) i_67_ -= i_64_ + i_67_ - aHa_Sub1_6499.anInt7503;
        if (i < aHa_Sub1_6499.anInt7496) {
            int i_74_ = aHa_Sub1_6499.anInt7496 - i;
            i_66_ -= i_74_;
            i = aHa_Sub1_6499.anInt7496;
            i_72_ += i_74_;
            i_69_ += i_74_;
            i_71_ += i_74_;
            i_70_ += i_74_;
        }
        if (i + i_66_ > aHa_Sub1_6499.anInt7507) {
            int i_75_ = i + i_66_ - aHa_Sub1_6499.anInt7507;
            i_66_ -= i_75_;
            i_71_ += i_75_;
            i_70_ += i_75_;
        }
        if (i_66_ > 0 && i_67_ > 0) {
            if (bool) method2590(aByteArrayArray6502[c], aHa_Sub1_6499.anIntArray7483, i_65_, i_72_, i_69_, i_66_, i_67_, i_70_, i_71_);
            else method2591(aByteArrayArray6502[c], aHa_Sub1_6499.anIntArray7483, anIntArray6496, i_72_, i_69_, i_66_, i_67_, i_70_, i_71_);
        }
    }

    private final void method2593(byte[] is, int[] is_76_, int[] is_77_, int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, aa var_aa, int i_87_, int i_88_) {
        aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
        int[] is_89_ = var_aa_Sub3.anIntArray5201;
        int[] is_90_ = var_aa_Sub3.anIntArray5202;
        int i_91_ = i_84_ - aHa_Sub1_6499.anInt7496;
        int i_92_ = i_85_;
        if (i_88_ > i_92_) {
            i_92_ = i_88_;
            i_79_ += (i_88_ - i_85_) * aHa_Sub1_6499.anInt7477;
            i_78_ += (i_88_ - i_85_) * i_86_;
        }
        int i_93_ = (Math.min(i_88_ + is_89_.length, i_85_ + i_81_));
        boolean bool = false;
        for (int i_94_ = i_92_; i_94_ < i_93_; i_94_++) {
            int i_95_ = is_89_[i_94_ - i_88_] + i_87_;
            int i_96_ = is_90_[i_94_ - i_88_];
            int i_97_ = i_80_;
            if (i_91_ > i_95_) {
                int i_98_ = i_91_ - i_95_;
                if (i_98_ >= i_96_) {
                    i_78_ += i_80_ + i_83_;
                    i_79_ += i_80_ + i_82_;
                    continue;
                }
                i_96_ -= i_98_;
            } else {
                int i_99_ = i_95_ - i_91_;
                if (i_99_ >= i_80_) {
                    i_78_ += i_80_ + i_83_;
                    i_79_ += i_80_ + i_82_;
                    continue;
                }
                i_78_ += i_99_;
                i_97_ -= i_99_;
                i_79_ += i_99_;
            }
            int i_100_ = 0;
            if (i_97_ < i_96_) i_96_ = i_97_;
            else i_100_ = i_97_ - i_96_;
            for (int i_101_ = -i_96_; i_101_ < 0; i_101_++) {
                int i_102_;
                if ((i_102_ = is[i_78_++]) != 0) is_76_[i_79_++] = is_77_[i_102_ & 0xff];
                else i_79_++;
            }
            i_78_ += i_100_ + i_83_;
            i_79_ += i_100_ + i_82_;
        }
    }
}
