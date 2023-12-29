/* Class105_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class105_Sub3 extends Class105 {
    static int anInt8450;
    static int anInt8451;
    static int anInt8452;
    static int anInt8453;
    int anInt8454;
    private static int anInt8455;
    int anInt8456;
    static int anInt8457;
    static int anInt8458;
    private static int anInt8459;
    ha_Sub1 aHa_Sub1_8460;
    int anInt8461;
    private int[] anIntArray8462;
    static int anInt8463;
    int anInt8464;
    static int anInt8465 = 0;
    private static int anInt8466;
    static int anInt8467;
    static int anInt8468;
    static int anInt8469;
    int anInt8470;
    int anInt8471;
    static int anInt8472;
    private static int anInt8473;
    static int anInt8474 = 0;
    static int anInt8475;
    private static int anInt8476;
    static int anInt8477;
    static int anInt8478;
    static int anInt8479;
    static int anInt8480;
    static int anInt8481;
    private static int anInt8482;

    abstract void method964(int i, int i_0_, int i_1_, int i_2_, int i_3_);

    final int method971() {
        return this.anInt8471;
    }

    final void method984(int[] is) {
        is[0] = this.anInt8461;
        is[1] = this.anInt8464;
        is[2] = this.anInt8454;
        is[3] = this.anInt8456;
    }

    final void method965(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        if (this.aHa_Sub1_8460.method3716()) throw new IllegalStateException();
        if (anIntArray8462 == null) anIntArray8462 = new int[4];
        this.aHa_Sub1_8460.K(anIntArray8462);
        this.aHa_Sub1_8460.T(this.aHa_Sub1_8460.anInt7496, this.aHa_Sub1_8460.anInt7476, i + i_5_, i_4_ + i_6_);
        int i_10_ = scaleWidth();
        int i_11_ = method980();
        int i_12_ = (i_5_ + i_10_ - 1) / i_10_;
        int i_13_ = (i_6_ + i_11_ - 1) / i_11_;
        for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
            int i_15_ = i_14_ * i_11_;
            for (int i_16_ = 0; i_16_ < i_12_; i_16_++)
                method964(i + i_16_ * i_10_, i_4_ + i_15_, i_7_, i_8_, i_9_);
        }
        this.aHa_Sub1_8460.KA(anIntArray8462[0], anIntArray8462[1], anIntArray8462[2], anIntArray8462[3]);
    }

    final void method983(float f, float f_17_, float f_18_, float f_19_, float f_20_, float f_21_, int i, aa var_aa, int i_22_, int i_23_) {
        if (this.aHa_Sub1_8460.method3716()) throw new IllegalStateException();
        if (method997(f, f_17_, f_18_, f_19_, f_20_, f_21_)) {
            aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
            method995(var_aa_Sub3.anIntArray5201, var_aa_Sub3.anIntArray5202, anInt8473 - i_22_, -i_23_ - (anInt8468 - anInt8466));
        }
    }

    final void method985(int i, int i_24_, int i_25_, int i_26_) {
        this.anInt8461 = i;
        this.anInt8464 = i_24_;
        this.anInt8454 = i_25_;
        this.anInt8456 = i_26_;
    }

    abstract void method994(int i, int i_27_);

    abstract void method995(int[] is, int[] is_28_, int i, int i_29_);

    final void method962(float f, float f_30_, float f_31_, float f_32_, float f_33_, float f_34_, int i, int i_35_, int i_36_, int i_37_) {
        if (this.aHa_Sub1_8460.method3716()) throw new IllegalStateException();
        if (method997(f, f_30_, f_31_, f_32_, f_33_, f_34_)) {
            anInt8480 = i_35_;
            if (i != 1) {
                anInt8477 = i_35_ >>> 24;
                anInt8472 = 256 - anInt8477;
                if (i == 0) {
                    anInt8469 = (i_35_ & 0xff0000) >> 16;
                    anInt8463 = (i_35_ & 0xff00) >> 8;
                    anInt8465 = i_35_ & 0xff;
                } else if (i == 2) {
                    anInt8459 = i_35_ >>> 24;
                    anInt8455 = 256 - anInt8459;
                    int i_38_ = (i_35_ & 0xff00ff) * anInt8455 & ~0xff00ff;
                    int i_39_ = (i_35_ & 0xff00) * anInt8455 & 0xff0000;
                    anInt8474 = (i_38_ | i_39_) >>> 8;
                }
            }
            if (i == 1) {
                if (i_36_ == 0) method994(1, 0);
                else if (i_36_ == 1) method994(1, 1);
                else if (i_36_ == 2) method994(1, 2);
            } else if (i == 0) {
                if (i_36_ == 0) method994(0, 0);
                else if (i_36_ == 1) method994(0, 1);
                else if (i_36_ == 2) method994(0, 2);
            } else if (i == 3) {
                if (i_36_ == 0) method994(3, 0);
                else if (i_36_ == 1) method994(3, 1);
                else if (i_36_ == 2) method994(3, 2);
            } else if (i == 2) {
                if (i_36_ == 0) method994(2, 0);
                else if (i_36_ == 1) method994(2, 1);
                else if (i_36_ == 2) method994(2, 2);
            }
        }
    }

    abstract void method996(int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_);

    abstract void method982(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_);

    final int method969() {
        return this.anInt8470;
    }

    final int method980() {
        return (this.anInt8464 + this.anInt8470 + this.anInt8456);
    }

    Class105_Sub3(ha_Sub1 var_ha_Sub1, int i, int i_55_) {
        this.aHa_Sub1_8460 = var_ha_Sub1;
        this.anInt8471 = i;
        this.anInt8470 = i_55_;
    }

    final int scaleWidth() {
        return (this.anInt8461 + this.anInt8471 + this.anInt8454);
    }

    abstract void method963(int i, int i_56_, aa var_aa, int i_57_, int i_58_);

    private final boolean method997(float f, float f_59_, float f_60_, float f_61_, float f_62_, float f_63_) {
        int i = (this.anInt8461 + this.anInt8471 + this.anInt8454);
        int i_64_ = (this.anInt8464 + this.anInt8470 + this.anInt8456);
        if (i != this.anInt8471 || i_64_ != this.anInt8470) {
            float f_65_ = (f_60_ - f) / (float) i;
            float f_66_ = (f_61_ - f_59_) / (float) i;
            float f_67_ = (f_62_ - f) / (float) i_64_;
            float f_68_ = (f_63_ - f_59_) / (float) i_64_;
            float f_69_ = f_67_ * (float) this.anInt8464;
            float f_70_ = f_68_ * (float) this.anInt8464;
            float f_71_ = f_65_ * (float) this.anInt8461;
            float f_72_ = f_66_ * (float) this.anInt8461;
            float f_73_ = -f_65_ * (float) this.anInt8454;
            float f_74_ = -f_66_ * (float) this.anInt8454;
            float f_75_ = -f_67_ * (float) this.anInt8456;
            float f_76_ = -f_68_ * (float) this.anInt8456;
            f += f_71_ + f_69_;
            f_59_ += f_72_ + f_70_;
            f_60_ += f_73_ + f_69_;
            f_61_ += f_74_ + f_70_;
            f_62_ += f_71_ + f_75_;
            f_63_ += f_72_ + f_76_;
        }
        float f_77_ = f_62_ + (f_60_ - f);
        float f_78_ = f_61_ + (f_63_ - f_59_);
        float f_79_;
        float f_80_;
        if (f < f_60_) {
            f_79_ = f;
            f_80_ = f_60_;
        } else {
            f_79_ = f_60_;
            f_80_ = f;
        }
        if (f_62_ < f_79_) f_79_ = f_62_;
        if (f_77_ < f_79_) f_79_ = f_77_;
        if (f_62_ > f_80_) f_80_ = f_62_;
        if (f_77_ > f_80_) f_80_ = f_77_;
        float f_81_;
        float f_82_;
        if (f_59_ < f_61_) {
            f_81_ = f_59_;
            f_82_ = f_61_;
        } else {
            f_81_ = f_61_;
            f_82_ = f_59_;
        }
        if (f_63_ < f_81_) f_81_ = f_63_;
        if (f_78_ < f_81_) f_81_ = f_78_;
        if (f_63_ > f_82_) f_82_ = f_63_;
        if (f_78_ > f_82_) f_82_ = f_78_;
        if (f_79_ < (float) (this.aHa_Sub1_8460.anInt7496)) f_79_ = (float) (this.aHa_Sub1_8460.anInt7496);
        if (f_80_ > (float) (this.aHa_Sub1_8460.anInt7507)) f_80_ = (float) (this.aHa_Sub1_8460.anInt7507);
        if (f_81_ < (float) (this.aHa_Sub1_8460.anInt7476)) f_81_ = (float) (this.aHa_Sub1_8460.anInt7476);
        if (f_82_ > (float) (this.aHa_Sub1_8460.anInt7503)) f_82_ = (float) (this.aHa_Sub1_8460.anInt7503);
        f_80_ = f_79_ - f_80_;
        if (f_80_ >= 0.0F) return false;
        f_82_ = f_81_ - f_82_;
        if (f_82_ >= 0.0F) return false;
        anInt8453 = this.aHa_Sub1_8460.anInt7477;
        anInt8451 = (int) ((float) ((int) f_81_ * anInt8453) + f_79_);
        float f_83_ = (f_60_ - f) * (f_63_ - f_59_) - (f_61_ - f_59_) * (f_62_ - f);
        float f_84_ = (f_62_ - f) * (f_61_ - f_59_) - (f_63_ - f_59_) * (f_60_ - f);
        anInt8481 = (int) ((f_63_ - f_59_) * 4096.0F * (float) this.anInt8471 / f_83_);
        anInt8450 = (int) ((f_61_ - f_59_) * 4096.0F * (float) this.anInt8470 / f_84_);
        anInt8457 = (int) ((f_62_ - f) * 4096.0F * (float) this.anInt8471 / f_84_);
        anInt8452 = (int) ((f_60_ - f) * 4096.0F * (float) this.anInt8470 / f_83_);
        anInt8476 = (int) (f_79_ * 16.0F + 8.0F - (f + f_60_ + f_62_ + f_77_) / 4.0F * 16.0F);
        anInt8482 = (int) (f_81_ * 16.0F + 8.0F - (f_59_ + f_61_ + f_63_ + f_78_) / 4.0F * 16.0F);
        anInt8458 = ((this.anInt8471 >> 1 << 12) + (anInt8482 * anInt8457 >> 4));
        anInt8467 = ((this.anInt8470 >> 1 << 12) + (anInt8482 * anInt8452 >> 4));
        anInt8479 = anInt8476 * anInt8481 >> 4;
        anInt8475 = anInt8476 * anInt8450 >> 4;
        anInt8473 = (int) f_79_;
        anInt8478 = (int) f_80_;
        anInt8466 = (int) f_81_;
        anInt8468 = (int) f_82_;
        return true;
    }

    static {
        anInt8472 = 0;
        anInt8463 = 0;
        anInt8469 = 0;
        anInt8477 = 0;
        anInt8459 = 0;
        anInt8455 = 0;
    }
}
