/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class329 {
    private static int anInt4102;
    private static int anInt4103;
    private static int anInt4104;
    private static int anInt4105;
    private static int anInt4106;
    private static int[] anIntArray4107;
    private static int anInt4108;
    private static int anInt4109;

    private static final void method2618(int i) {
        if (anInt4105 < 0) {
            anInt4104 = anInt4102 = anInt4109 = 0;
            anInt4103 = 2147483646;
        } else {
            method2625(0, anInt4105);
            int i_0_ = anIntArray4107[1];
            if (i_0_ < i) i_0_ = i;
            int i_1_ = 0;
            int i_2_;
            for (i_2_ = 0; i_2_ < anInt4105; i_2_ += 4) {
                int i_3_ = anIntArray4107[i_2_ + 1];
                if (i_0_ < i_3_) break;
                int i_4_ = anIntArray4107[i_2_];
                int i_5_ = anIntArray4107[i_2_ + 2];
                int i_6_ = anIntArray4107[i_2_ + 3];
                int i_7_ = (i_5_ - i_4_ << 16) / (i_6_ - i_3_);
                int i_8_ = (i_4_ << 16) + 32768;
                anIntArray4107[i_2_] = i_8_ + (i_0_ - i_3_) * i_7_;
                anIntArray4107[i_2_ + 2] = i_7_;
            }
            anInt4104 = i_1_;
            anInt4102 = i_2_;
            anInt4109 = i_2_;
            anInt4103 = i_0_ - 1;
        }
    }

    static final void method2619(ha var_ha, int[] is, int i, int[] is_9_, int[] is_10_) {
        method2623(var_ha, is, 0, is.length, i, is_9_, is_10_);
    }

    static final void method2620(ha var_ha, int[] is, int i) {
        method2623(var_ha, is, 0, is.length, i, null, null);
    }

    public static void method2621() {
        anIntArray4107 = null;
    }

    private static final void method2622(int[] is, int i, int i_11_) {
        int i_12_ = anInt4105 + (i_11_ << 1);
        if (anIntArray4107 == null || anIntArray4107.length < i_12_) {
            int[] is_13_ = new int[i_12_];
            for (int i_14_ = 0; i_14_ < anInt4105; i_14_++)
                is_13_[i_14_] = anIntArray4107[i_14_];
            anIntArray4107 = is_13_;
        }
        i_11_ += i;
        int i_15_ = i_11_ - 2;
        for (int i_16_ = i; i_16_ < i_11_; i_16_ += 2) {
            int i_17_ = is[i_15_ + 1];
            int i_18_ = is[i_16_ + 1];
            if (i_17_ < i_18_) {
                anIntArray4107[anInt4105++] = is[i_15_];
                anIntArray4107[anInt4105++] = i_17_;
                anIntArray4107[anInt4105++] = is[i_16_];
                anIntArray4107[anInt4105++] = i_18_;
            } else if (i_18_ < i_17_) {
                anIntArray4107[anInt4105++] = is[i_16_];
                anIntArray4107[anInt4105++] = i_18_;
                anIntArray4107[anInt4105++] = is[i_15_];
                anIntArray4107[anInt4105++] = i_17_;
            }
            i_15_ = i_16_;
        }
    }

    private static final void method2623(ha var_ha, int[] is, int i, int i_19_, int i_20_, int[] is_21_, int[] is_22_) {
        int[] is_23_ = new int[4];
        var_ha.K(is_23_);
        if (is_21_ != null && is_23_[3] - is_23_[1] != is_21_.length) throw new IllegalStateException();
        method2624();
        method2622(is, i, i_19_);
        method2618(is_23_[1]);
        while (method2627(is_23_[3])) {
            int i_24_ = anInt4106;
            int i_25_ = anInt4108;
            int i_26_ = anInt4103;
            if (is_21_ != null) {
                int i_27_ = i_26_ - is_23_[1];
                if (i_24_ < is_21_[i_27_] + is_23_[0]) i_24_ = is_21_[i_27_] + is_23_[0];
                if (i_25_ > is_21_[i_27_] + is_22_[i_27_] + is_23_[0]) i_25_ = is_21_[i_27_] + is_22_[i_27_] + is_23_[0];
                if (i_25_ - i_24_ <= 0) continue;
            }
            var_ha.U(i_24_, i_26_, i_25_ - i_24_, i_20_, 1);
        }
    }

    private static final void method2624() {
        anInt4105 = 0;
    }

    private static final void method2625(int i, int i_28_) {
        if (i_28_ > i + 4) {
            int i_29_ = i;
            int i_30_ = anIntArray4107[i_29_];
            int i_31_ = anIntArray4107[i_29_ + 1];
            int i_32_ = anIntArray4107[i_29_ + 2];
            int i_33_ = anIntArray4107[i_29_ + 3];
            for (int i_34_ = i + 4; i_34_ < i_28_; i_34_ += 4) {
                int i_35_ = anIntArray4107[i_34_ + 1];
                if (i_35_ < i_31_) {
                    anIntArray4107[i_29_] = anIntArray4107[i_34_];
                    anIntArray4107[i_29_ + 1] = i_35_;
                    anIntArray4107[i_29_ + 2] = anIntArray4107[i_34_ + 2];
                    anIntArray4107[i_29_ + 3] = anIntArray4107[i_34_ + 3];
                    i_29_ += 4;
                    anIntArray4107[i_34_] = anIntArray4107[i_29_];
                    anIntArray4107[i_34_ + 1] = anIntArray4107[i_29_ + 1];
                    anIntArray4107[i_34_ + 2] = anIntArray4107[i_29_ + 2];
                    anIntArray4107[i_34_ + 3] = anIntArray4107[i_29_ + 3];
                }
            }
            anIntArray4107[i_29_] = i_30_;
            anIntArray4107[i_29_ + 1] = i_31_;
            anIntArray4107[i_29_ + 2] = i_32_;
            anIntArray4107[i_29_ + 3] = i_33_;
            method2625(i, i_29_);
            method2625(i_29_ + 4, i_28_);
        }
    }

    private static final void method2626(int i, int i_36_) {
        for (/**/; i_36_ >= i + 8; i_36_ -= 4) {
            boolean bool = true;
            for (int i_37_ = i + 4; i_37_ < i_36_; i_37_ += 4) {
                int i_38_ = anIntArray4107[i_37_ - 4];
                int i_39_ = anIntArray4107[i_37_];
                if (i_38_ > i_39_) {
                    bool = false;
                    anIntArray4107[i_37_ - 4] = i_39_;
                    anIntArray4107[i_37_] = i_38_;
                    i_38_ = anIntArray4107[i_37_ - 2];
                    anIntArray4107[i_37_ - 2] = anIntArray4107[i_37_ + 2];
                    anIntArray4107[i_37_ + 2] = i_38_;
                    i_38_ = anIntArray4107[i_37_ - 1];
                    anIntArray4107[i_37_ - 1] = anIntArray4107[i_37_ + 3];
                    anIntArray4107[i_37_ + 3] = i_38_;
                }
            }
            if (bool) break;
        }
    }

    private static final boolean method2627(int i) {
        int i_40_ = anInt4102;
        int i_41_ = anInt4109;
        int i_42_ = anInt4103;
        int i_43_;
        for (/**/; i_41_ >= i_40_; i_41_ = i_43_) {
            anInt4103 = ++i_42_;
            if (i_42_ >= i) return false;
            i_43_ = anInt4104;
            for (/**/; i_40_ < anInt4105; i_40_ += 4) {
                int i_44_ = anIntArray4107[i_40_ + 1];
                if (i_42_ < i_44_) break;
                int i_45_ = anIntArray4107[i_40_];
                int i_46_ = anIntArray4107[i_40_ + 2];
                int i_47_ = anIntArray4107[i_40_ + 3];
                int i_48_ = (i_46_ - i_45_ << 16) / (i_47_ - i_44_);
                int i_49_ = (i_45_ << 16) + 32768;
                anIntArray4107[i_40_] = i_49_;
                anIntArray4107[i_40_ + 2] = i_48_;
            }
            for (int i_50_ = i_43_; i_50_ < i_40_; i_50_ += 4) {
                int i_51_ = anIntArray4107[i_50_ + 3];
                if (i_42_ >= i_51_) {
                    anIntArray4107[i_50_] = anIntArray4107[i_43_];
                    anIntArray4107[i_50_ + 1] = anIntArray4107[i_43_ + 1];
                    anIntArray4107[i_50_ + 2] = anIntArray4107[i_43_ + 2];
                    anIntArray4107[i_50_ + 3] = anIntArray4107[i_43_ + 3];
                    i_43_ += 4;
                }
            }
            if (i_43_ == anInt4105) {
                anInt4105 = 0;
                return false;
            }
            method2626(i_43_, i_40_);
            anInt4104 = i_43_;
            anInt4102 = i_40_;
        }
        anInt4106 = anIntArray4107[i_41_] >> 16;
        anInt4108 = anIntArray4107[i_41_ + 4] >> 16;
        anIntArray4107[i_41_] += anIntArray4107[i_41_ + 2];
        anIntArray4107[i_41_ + 4] += anIntArray4107[i_41_ + 6];
        i_41_ += 8;
        anInt4109 = i_41_;
        return true;
    }
}
