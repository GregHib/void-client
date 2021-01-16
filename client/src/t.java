/* t - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class t extends s implements Interface19 {
    long nativeid;
    private final Class262 aClass262_5149 = new Class262();
    private final oa anOa5150;
    private int anInt5151 = -1;

    final void method3984(int i, int i_0_, int i_1_, boolean[][] bools,
                          boolean bool, int i_2_, int i_3_) {
        anInt5151 = i_2_;
        int i_4_ = 0;
        float[] fs = new float[aClass262_5149.method1998(0)];
        for (Class348_Sub1 class348_sub1
             = (Class348_Sub1) aClass262_5149.method1995(4);
             class348_sub1 != null;
             class348_sub1
                     = (Class348_Sub1) aClass262_5149.method1990((byte) 34))
            fs[i_4_++] = class348_sub1.method2721(-37);
        q(fs);
        for (int i_5_ = 0; i_5_ < i_1_ + i_1_; i_5_++) {
            for (int i_6_ = 0; i_6_ < i_1_ + i_1_; i_6_++) {
                if (bools[i_5_][i_6_]) {
                    int i_7_ = i - i_1_ + i_5_;
                    int i_8_ = i_0_ - i_1_ + i_6_;
                    if (i_7_ >= 0 && i_7_ < this.anInt4587 && i_8_ >= 0
                            && i_8_ < this.anInt4590)
                        method3979(i_7_, i_8_);
                }
            }
        }
    }

    final native void wa(r var_r, int i, int i_9_, int i_10_, int i_11_,
                         boolean bool);

    final void method3979(int i, int i_12_) {
        if (anInt5151 < 0)
            anOa5150.method3973().method142(this, i, i_12_);
        else
            anOa5150.method3973().method147(this, i, i_12_, anInt5151);
    }

    public final native void w(boolean bool);

    final void method3978(int i, int i_13_, int[] is, int[] is_14_,
                          int[] is_15_, int[] is_16_, int[] is_17_,
                          int[] is_18_, int[] is_19_, int[] is_20_,
                          int[] is_21_, int[] is_22_, int[] is_23_, int i_24_,
                          int i_25_, int i_26_, boolean bool) {
        boolean bool_27_ = false;
        if (is_20_ != null) {
            int[] is_28_ = is_20_;
            for (int i_29_ = 0; i_29_ < is_28_.length; i_29_++) {
                int i_30_ = is_28_[i_29_];
                if (i_30_ != -1) {
                    bool_27_ = true;
                    break;
                }
            }
        }
        int i_31_ = is_20_.length;
        int[] is_32_ = new int[i_31_ * 3];
        int[] is_33_ = new int[i_31_ * 3];
        int[] is_34_ = new int[i_31_ * 3];
        int[] is_35_ = new int[i_31_ * 3];
        int[] is_36_ = new int[i_31_ * 3];
        int[] is_37_ = is_21_ != null ? new int[i_31_ * 3] : null;
        int[] is_38_ = is_14_ != null ? new int[i_31_ * 3] : null;
        int[] is_39_ = is_16_ != null ? new int[i_31_ * 3] : null;
        int i_40_ = 0;
        for (int i_41_ = 0; i_41_ < i_31_; i_41_++) {
            int i_42_ = is_17_[i_41_];
            int i_43_ = is_18_[i_41_];
            int i_44_ = is_19_[i_41_];
            is_32_[i_40_] = is[i_42_];
            is_33_[i_40_] = is_15_[i_42_];
            is_34_[i_40_] = is_20_[i_41_];
            is_35_[i_40_] = is_22_[i_41_];
            is_36_[i_40_] = is_23_[i_41_];
            if (is_21_ != null)
                is_37_[i_40_] = is_21_[i_41_];
            if (is_14_ != null)
                is_38_[i_40_] = is_14_[i_42_];
            if (is_16_ != null)
                is_39_[i_40_] = is_16_[i_42_];
            i_40_++;
            is_32_[i_40_] = is[i_43_];
            is_33_[i_40_] = is_15_[i_43_];
            is_34_[i_40_] = is_20_[i_41_];
            is_35_[i_40_] = is_22_[i_41_];
            is_36_[i_40_] = is_23_[i_41_];
            if (is_21_ != null)
                is_37_[i_40_] = is_21_[i_41_];
            if (is_14_ != null)
                is_38_[i_40_] = is_14_[i_43_];
            if (is_16_ != null)
                is_39_[i_40_] = is_16_[i_43_];
            i_40_++;
            is_32_[i_40_] = is[i_44_];
            is_33_[i_40_] = is_15_[i_44_];
            is_34_[i_40_] = is_20_[i_41_];
            is_35_[i_40_] = is_22_[i_41_];
            is_36_[i_40_] = is_23_[i_41_];
            if (is_21_ != null)
                is_37_[i_40_] = is_21_[i_41_];
            if (is_14_ != null)
                is_38_[i_40_] = is_14_[i_44_];
            if (is_16_ != null)
                is_39_[i_40_] = is_16_[i_44_];
            i_40_++;
        }
        if (bool_27_ || is_37_ != null)
            U(i, i_13_, is_32_, is_38_, is_33_, is_39_, is_34_, is_37_, is_35_,
                    is_36_, i_24_, i_25_, i_26_, bool);
    }

    final void method3981(Class348_Sub1 class348_sub1, int[] is) {
        aClass262_5149.method1999(class348_sub1, -20180);
        V(class348_sub1.hashCode(), class348_sub1.method2724(-1),
                class348_sub1.method2722(124), class348_sub1.method2717((byte) 83),
                class348_sub1.method2723(-1), class348_sub1.method2720(-1), is);
    }

    final native void CA(r var_r, int i, int i_45_, int i_46_, int i_47_,
                         boolean bool);

    private final native void q(float[] fs);

    final native void ka(int i, int i_48_, int i_49_);

    t(oa var_oa, ya var_ya, int i, int i_50_, int[][] is, int[][] is_51_,
      int i_52_, int i_53_, int i_54_) {
        super(i, i_50_, i_52_, is);
        anOa5150 = var_oa;
        ga(anOa5150, var_ya, i, i_50_, this.anIntArrayArray4584, is_51_,
                i_52_, i_53_, i_54_);
    }

    final boolean method3989(r var_r, int i, int i_55_, int i_56_, int i_57_,
                             boolean bool) {
        return true;
    }

    private final native void V(int i, int i_58_, int i_59_, int i_60_,
                                int i_61_, int i_62_, int[] is);

    final native void YA();

    final void method3983(int i, int i_63_, int i_64_, boolean[][] bools,
                          boolean bool, int i_65_) {
        anInt5151 = -1;
        int i_66_ = 0;
        float[] fs = new float[aClass262_5149.method1998(0)];
        for (Class348_Sub1 class348_sub1
             = (Class348_Sub1) aClass262_5149.method1995(4);
             class348_sub1 != null;
             class348_sub1
                     = (Class348_Sub1) aClass262_5149.method1990((byte) 40))
            fs[i_66_++] = class348_sub1.method2721(-65);
        q(fs);
        for (int i_67_ = 0; i_67_ < i_64_ + i_64_; i_67_++) {
            for (int i_68_ = 0; i_68_ < i_64_ + i_64_; i_68_++) {
                if (bools[i_67_][i_68_]) {
                    int i_69_ = i - i_64_ + i_67_;
                    int i_70_ = i_63_ - i_64_ + i_68_;
                    if (i_69_ >= 0 && i_69_ < this.anInt4587
                            && i_70_ >= 0 && i_70_ < this.anInt4590)
                        method3979(i_69_, i_70_);
                }
            }
        }
    }

    final native r fa(int i, int i_71_, r var_r);

    protected final void finalize() {
        if (this.nativeid != 0L)
            Class257.method1947(0, this);
    }

    private final native void ga(oa var_oa, ya var_ya, int i, int i_72_,
                                 int[][] is, int[][] is_73_, int i_74_,
                                 int i_75_, int i_76_);

    final native void U(int i, int i_77_, int[] is, int[] is_78_, int[] is_79_,
                        int[] is_80_, int[] is_81_, int[] is_82_, int[] is_83_,
                        int[] is_84_, int i_85_, int i_86_, int i_87_,
                        boolean bool);

    final void method3987(int i, int i_88_, int i_89_, int i_90_, int i_91_,
                          int i_92_, int i_93_, boolean[][] bools) {
        anOa5150.method3973().method148(this, i, i_88_, i_89_, i_90_, i_91_,
                i_92_, i_93_, bools);
    }
}
