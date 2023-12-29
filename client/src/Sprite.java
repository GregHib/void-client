/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Sprite implements Interface3 {
    private final void method961(float f, float f_0_, float f_1_, float f_2_, int i, int i_3_, int i_4_, int i_5_, int i_6_) {
        if (i != 0) {
            double d = (double) (i_3_ & 0xffff) * 9.587379924285257E-5;
            float f_7_ = (float) Math.sin(d) * (float) i;
            float f_8_ = (float) Math.cos(d) * (float) i;
            float f_9_ = (-f_1_ * f_8_ + -f_2_ * f_7_) / 4096.0F + f;
            float f_10_ = (f_1_ * f_7_ + -f_2_ * f_8_) / 4096.0F + f_0_;
            float f_11_ = ((((float) scaleWidth() - f_1_) * f_8_ + -f_2_ * f_7_) / 4096.0F + f);
            float f_12_ = ((-((float) scaleWidth() - f_1_) * f_7_ + -f_2_ * f_8_) / 4096.0F + f_0_);
            float f_13_ = ((-f_1_ * f_8_ + ((float) method980() - f_2_) * f_7_) / 4096.0F + f);
            float f_14_ = (((f_1_ * f_7_ + ((float) method980() - f_2_) * f_8_) / 4096.0F) + f_0_);
            method978(f_9_, f_10_, f_11_, f_12_, f_13_, f_14_, i_4_, i_5_, i_6_);
        }
    }

    abstract void method962(float f, float f_15_, float f_16_, float f_17_, float f_18_, float f_19_, int i, int i_20_, int i_21_, int i_22_);

    abstract void method963(int i, int i_23_, aa var_aa, int i_24_, int i_25_);

    abstract void method964(int i, int i_26_, int i_27_, int i_28_, int i_29_);

    abstract void method965(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_);

    abstract int scaleWidth();

    final void method967(float f, float f_36_, float f_37_, float f_38_, int i, int i_39_, aa var_aa, int i_40_, int i_41_) {
        if (i != 0) {
            double d = (double) (i_39_ & 0xffff) * 9.587379924285257E-5;
            float f_42_ = (float) Math.sin(d) * (float) i;
            float f_43_ = (float) Math.cos(d) * (float) i;
            float f_44_ = (-f_37_ * f_43_ + -f_38_ * f_42_) / 4096.0F + f;
            float f_45_ = (f_37_ * f_42_ + -f_38_ * f_43_) / 4096.0F + f_36_;
            float f_46_ = ((((float) scaleWidth() - f_37_) * f_43_ + -f_38_ * f_42_) / 4096.0F + f);
            float f_47_ = ((-((float) scaleWidth() - f_37_) * f_42_ + -f_38_ * f_43_) / 4096.0F + f_36_);
            float f_48_ = ((-f_37_ * f_43_ + ((float) method980() - f_38_) * f_42_) / 4096.0F + f);
            float f_49_ = ((f_37_ * f_42_ + ((float) method980() - f_38_) * f_43_) / 4096.0F + f_36_);
            method975(f_44_, f_45_, f_46_, f_47_, f_48_, f_49_, var_aa, i_40_, i_41_);
        }
    }

    abstract void method968(int i, int i_50_, int i_51_);

    abstract int method969();

    final void method970(int i, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_) {
        method982(i, i_52_, i_53_, i_54_, i_55_, i_56_, i_57_, 1);
    }

    abstract int method971();

    final void method972(int i, int i_58_, int i_59_, int i_60_) {
        method965(i, i_58_, i_59_, i_60_, 1, 0, 1);
    }

    final void method973(int i, int i_61_, int i_62_, int i_63_) {
        method982(i, i_61_, i_62_, i_63_, 1, 0, 1, 1);
    }

    final void method974(int i, int i_64_) {
        method964(i, i_64_, 1, 0, 1);
    }

    private final void method975(float f, float f_65_, float f_66_, float f_67_, float f_68_, float f_69_, aa var_aa, int i, int i_70_) {
        method983(f, f_65_, f_66_, f_67_, f_68_, f_69_, 1, var_aa, i, i_70_);
    }

    final void method976(float f, float f_71_, int i, int i_72_, aa var_aa, int i_73_, int i_74_) {
        method967(f, f_71_, (float) scaleWidth() / 2.0F, (float) method980() / 2.0F, i, i_72_, var_aa, i_73_, i_74_);
    }

    final void method977(float f, float f_75_, int i, int i_76_, int i_77_, int i_78_, int i_79_) {
        method961(f, f_75_, (float) scaleWidth() / 2.0F, (float) method980() / 2.0F, i, i_76_, i_77_, i_78_, i_79_);
    }

    private final void method978(float f, float f_80_, float f_81_, float f_82_, float f_83_, float f_84_, int i, int i_85_, int i_86_) {
        method962(f, f_80_, f_81_, f_82_, f_83_, f_84_, i, i_85_, i_86_, 1);
    }

    abstract void method979(int i, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_);

    abstract int method980();

    final void method981(float f, float f_92_, int i, int i_93_) {
        method961(f, f_92_, (float) scaleWidth() / 2.0F, (float) method980() / 2.0F, i, i_93_, 1, 0, 1);
    }

    abstract void method982(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_);

    abstract void method983(float f, float f_101_, float f_102_, float f_103_, float f_104_, float f_105_, int i, aa var_aa, int i_106_, int i_107_);

    abstract void method984(int[] is);

    public Sprite() {
        /* empty */
    }

    abstract void method985(int i, int i_108_, int i_109_, int i_110_);
}
