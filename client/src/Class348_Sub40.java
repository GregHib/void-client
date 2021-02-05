/* Class348_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class348_Sub40 extends Class348 {
    static int anInt7026;
    static int anInt7027;
    static int anInt7028;
    static int anInt7029;
    static int anInt7030;
    Class348_Sub40[] aClass348_Sub40Array7031;
    Class191 aClass191_7032;
    Class322 aClass322_7033;
    static int anInt7034;
    static int anInt7035;
    int anInt7036;
    static int anInt7037;
    static int anInt7038;
    static int anInt7039;
    static int anInt7040;
    static Class356 aClass356_7041 = new Class356(32);
    static Class279 aClass279_7042;
    static int anInt7043;
    static int anInt7044;
    boolean aBoolean7045;

    static final Class50_Sub2 method3036(Class348_Sub49 class348_sub49, int i) {
        anInt7026++;
        if (i > -4) return null;
        return new Class50_Sub2(class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255));
    }

    int method3037(int i) {
        if (i >= -113) method3048(-125, -85, 60);
        anInt7027++;
        return -1;
    }

    static final void method3038(int i) {
        anInt7044++;
        int i_0_ = 0;
        if (Class316.aClass348_Sub51_3959.aClass239_Sub28_7230.method1845(-32350) == 1) {
            i_0_ |= 0x1;
            i_0_ |= 0x10;
            i_0_ |= 0x20;
            i_0_ |= 0x2;
            i_0_ |= 0x4;
        }
        if ((~Class316.aClass348_Sub51_3959.aClass239_Sub24_7235.method1820(-32350)) == i) i_0_ |= 0x40;
        Class318_Sub1_Sub3_Sub3.method2420(i_0_, i);
        Class348_Sub40_Sub12.aClass263_9195.method2009(i_0_, (byte) 109);
        Exception_Sub1.aClass255_112.method1942(i_0_, (byte) -125);
        Class189.aClass278_2529.method2073(-25032, i_0_);
        Class348_Sub40_Sub18.aClass319_9245.method2541(119, i_0_);
        Class367_Sub1.method3535(i_0_, ~i);
        Class269.method2040(i_0_, true);
        Class69.method720(i_0_, i + 1227);
        Class239_Sub8.method1750(14056, i_0_);
        Class348_Sub20.method2953((byte) -106);
    }

    final int[][] method3039(byte i, int i_1_, int i_2_) {
        anInt7039++;
        int i_3_ = 9 / ((6 - i) / 37);
        if (this.aClass348_Sub40Array7031[i_2_].aBoolean7045) {
            int[] is = this.aClass348_Sub40Array7031[i_2_].method3042(i_1_, 255);
            int[][] is_4_ = new int[3][];
            is_4_[2] = is;
            is_4_[1] = is;
            is_4_[0] = is;
            return is_4_;
        }
        return this.aClass348_Sub40Array7031[i_2_].method3047(i_1_, -1564599039);
    }

    public static void method3040(boolean bool) {
        aClass279_7042 = null;
        if (bool != true) method3036(null, -43);
        aClass356_7041 = null;
    }

    static final void method3041(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        anInt7030++;
        int i_12_ = 0;
        int i_13_ = i_8_;
        int i_14_ = 0;
        int i_15_ = -i_11_ + i;
        int i_16_ = i_8_ - i_11_;
        int i_17_ = i * i;
        int i_18_ = i_8_ * i_8_;
        int i_19_ = i_15_ * i_15_;
        int i_20_ = i_16_ * i_16_;
        int i_21_ = i_18_ << 1;
        int i_22_ = i_17_ << 1;
        int i_23_ = i_20_ << 1;
        int i_24_ = i_19_ << 1;
        int i_25_ = i_8_ << 1;
        int i_26_ = i_16_ << 1;
        int i_27_ = i_21_ + i_17_ * (-i_25_ + 1);
        int i_28_ = i_18_ + -(i_22_ * (-1 + i_25_));
        int i_29_ = (1 - i_26_) * i_19_ + i_23_;
        int i_30_ = i_20_ + -(i_24_ * (-1 + i_26_));
        int i_31_ = i_17_ << 2;
        int i_32_ = i_18_ << 2;
        int i_33_ = i_19_ << 2;
        int i_34_ = i_20_ << 2;
        int i_35_ = 3 * i_21_;
        int i_36_ = i_22_ * (-3 + i_25_);
        int i_37_ = 3 * i_23_;
        int i_38_ = (i_26_ - 3) * i_24_;
        int i_39_ = i_32_;
        int i_40_ = i_31_ * (i_7_ + i_8_);
        int i_41_ = i_34_;
        int i_42_ = i_33_ * (-1 + i_16_);
        if (i_6_ >= Class132.anInt1910 && Class38.anInt513 >= i_6_) {
            int[] is = Class17.anIntArrayArray255[i_6_];
            int i_43_ = Class85.method831(Class113.anInt1745, i_5_ + -i, Class369.anInt4960, 77);
            int i_44_ = Class85.method831(Class113.anInt1745, i + i_5_, Class369.anInt4960, -68);
            int i_45_ = Class85.method831(Class113.anInt1745, i_5_ + -i_15_, Class369.anInt4960, i_7_ + -115);
            int i_46_ = Class85.method831(Class113.anInt1745, i_5_ + i_15_, Class369.anInt4960, 97);
            Class135_Sub2.method1156(-27, i_45_, is, i_43_, i_10_);
            Class135_Sub2.method1156(-27, i_46_, is, i_45_, i_9_);
            Class135_Sub2.method1156(-27, i_44_, is, i_46_, i_10_);
        }
        while (i_13_ > 0) {
            boolean bool = i_16_ >= i_13_;
            if (bool) {
                if (i_29_ < 0) {
                    while (i_29_ < 0) {
                        i_29_ += i_37_;
                        i_30_ += i_41_;
                        i_41_ += i_34_;
                        i_14_++;
                        i_37_ += i_34_;
                    }
                }
                if (i_30_ < 0) {
                    i_29_ += i_37_;
                    i_30_ += i_41_;
                    i_41_ += i_34_;
                    i_37_ += i_34_;
                    i_14_++;
                }
                i_29_ += -i_42_;
                i_30_ += -i_38_;
                i_42_ -= i_33_;
                i_38_ -= i_33_;
            }
            if (i_27_ < 0) {
                while (i_27_ < 0) {
                    i_27_ += i_35_;
                    i_28_ += i_39_;
                    i_12_++;
                    i_39_ += i_32_;
                    i_35_ += i_32_;
                }
            }
            if (i_28_ < 0) {
                i_28_ += i_39_;
                i_27_ += i_35_;
                i_35_ += i_32_;
                i_12_++;
                i_39_ += i_32_;
            }
            i_27_ += -i_40_;
            i_28_ += -i_36_;
            i_13_--;
            i_36_ -= i_31_;
            i_40_ -= i_31_;
            int i_47_ = -i_13_ + i_6_;
            int i_48_ = i_13_ + i_6_;
            if (i_48_ >= Class132.anInt1910 && Class38.anInt513 >= i_47_) {
                int i_49_ = Class85.method831(Class113.anInt1745, i_12_ + i_5_, Class369.anInt4960, 36);
                int i_50_ = Class85.method831(Class113.anInt1745, -i_12_ + i_5_, Class369.anInt4960, 97);
                if (bool) {
                    int i_51_ = Class85.method831(Class113.anInt1745, i_5_ - -i_14_, Class369.anInt4960, i_7_ ^ ~0x5c);
                    int i_52_ = Class85.method831(Class113.anInt1745, -i_14_ + i_5_, Class369.anInt4960, 32);
                    if (Class132.anInt1910 <= i_47_) {
                        int[] is = Class17.anIntArrayArray255[i_47_];
                        Class135_Sub2.method1156(-27, i_52_, is, i_50_, i_10_);
                        Class135_Sub2.method1156(-27, i_51_, is, i_52_, i_9_);
                        Class135_Sub2.method1156(i_7_ + -26, i_49_, is, i_51_, i_10_);
                    }
                    if (Class38.anInt513 >= i_48_) {
                        int[] is = Class17.anIntArrayArray255[i_48_];
                        Class135_Sub2.method1156(i_7_ ^ 0x1a, i_52_, is, i_50_, i_10_);
                        Class135_Sub2.method1156(-27, i_51_, is, i_52_, i_9_);
                        Class135_Sub2.method1156(-27, i_49_, is, i_51_, i_10_);
                    }
                } else {
                    if (i_47_ >= Class132.anInt1910) Class135_Sub2.method1156(-27, i_49_, (Class17.anIntArrayArray255[i_47_]), i_50_, i_10_);
                    if (i_48_ <= Class38.anInt513) Class135_Sub2.method1156(-27, i_49_, (Class17.anIntArrayArray255[i_48_]), i_50_, i_10_);
                }
            }
        }
    }

    int[] method3042(int i, int i_53_) {
        if (i_53_ != 255) return null;
        anInt7035++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    int method3043(int i) {
        anInt7037++;
        if (i != -1) this.aClass322_7033 = null;
        return -1;
    }

    void method3044(int i) {
        if (i <= 108) this.aClass191_7032 = null;
        anInt7029++;
    }

    void method3045(int i, int i_54_, int i_55_) {
        anInt7043++;
        int i_56_ = (i_55_ != (~this.anInt7036) ? this.anInt7036 : i_54_);
        if (this.aBoolean7045) this.aClass191_7032 = new Class191(i_56_, i_54_, i);
        else this.aClass322_7033 = new Class322(i_56_, i_54_, i);
    }

    void method3046(byte i) {
        anInt7038++;
        if (i > -102) method3046((byte) -112);
        if (this.aBoolean7045) {
            this.aClass191_7032.method1432((byte) 124);
            this.aClass191_7032 = null;
        } else {
            this.aClass322_7033.method2558(6144);
            this.aClass322_7033 = null;
        }
    }

    int[][] method3047(int i, int i_57_) {
        anInt7040++;
        if (i_57_ != -1564599039) method3048(-4, -64, 20);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    final int[] method3048(int i, int i_58_, int i_59_) {
        anInt7034++;
        if (i_58_ != 633706337) this.aClass191_7032 = null;
        if (!this.aClass348_Sub40Array7031[i_59_].aBoolean7045) return (this.aClass348_Sub40Array7031[i_59_].method3047(i, -1564599039)[0]);
        return this.aClass348_Sub40Array7031[i_59_].method3042(i, i_58_ + -633706082);
    }

    void method3049(Class348_Sub49 class348_sub49, int i, int i_60_) {
        anInt7028++;
        if (i_60_ != 31015) method3038(-16);
    }

    Class348_Sub40(int i, boolean bool) {
        this.aClass348_Sub40Array7031 = new Class348_Sub40[i];
        this.aBoolean7045 = bool;
    }
}
