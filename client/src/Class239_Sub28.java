/* Class239_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub28 extends Class239 {
    static int anInt6134;
    static int anInt6135;
    static int anInt6136;
    static int anInt6137;
    static int anInt6138;
    static int anInt6139;
    static int anInt6140;
    static int anInt6141;
    static int anInt6142;
    static int anInt6143;

    static final boolean method1842(int i, int i_0_, int i_1_, int i_2_,
                                    int i_3_, int i_4_, int i_5_, int i_6_,
                                    int i_7_) {
        anInt6134++;
        if (i_1_ != -1)
            return false;
        if (i_3_ >= i + i_5_
                || i_3_ - -i_6_ <= i_5_)
            return false;
        return i_0_ + i_7_ > i_4_
                && i_0_ < i_2_ + i_4_;
    }

    static final void method1843(int i, int i_8_, Class46 class46,
                                 boolean bool, int i_9_) {
        anInt6135++;
        if (i_8_ != -326)
            method1844(32, -33, false, 1, false, 64, -83);
        int i_10_ = class46.anInt709;
        int i_11_ = class46.anInt789;
        if (class46.aByte778 == 0)
            class46.anInt709 = class46.anInt842;
        else if (class46.aByte778 != 1) {
            if (class46.aByte778 == 2)
                class46.anInt709
                        = class46.anInt842 * i >> -2118078482;
        } else
            class46.anInt709 = -class46.anInt842 + i;
        if (class46.aByte724 != 0) {
            if (class46.aByte724 != 1) {
                if (class46.aByte724 == 2)
                    class46.anInt789
                            = class46.anInt728 * i_9_ >> -1100535122;
            } else
                class46.anInt789
                        = i_9_ - class46.anInt728;
        } else
            class46.anInt789 = class46.anInt728;
        if (class46.aByte778 == 4)
            class46.anInt709
                    = (class46.anInt789 * class46.anInt710
                    / class46.anInt775);
        if (class46.aByte724 == 4)
            class46.anInt789
                    = (class46.anInt775 * class46.anInt709
                    / class46.anInt710);
        if (Class299_Sub2.aBoolean6327
                && (client.method105(class46).anInt7098 != 0
                || class46.anInt774 == 0)) {
            if (class46.anInt789 < 5
                    && class46.anInt709 < 5) {
                class46.anInt789 = 5;
                class46.anInt709 = 5;
            } else {
                if (class46.anInt789 <= 0)
                    class46.anInt789 = 5;
                if (class46.anInt709 <= 0)
                    class46.anInt709 = 5;
            }
        }
        if (Class239_Sub10.anInt5943 == class46.anInt765)
            Class348_Sub1.aClass46_6561 = class46;
        if (bool && class46.anObjectArray727 != null
                && (i_10_ != class46.anInt709
                || (i_11_ != class46.anInt789))) {
            Class348_Sub36 class348_sub36 = new Class348_Sub36();
            class348_sub36.aClass46_6989 = class46;
            class348_sub36.anObjectArray6987
                    = class46.anObjectArray727;
            Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36,
                    -20180);
        }
    }

    static final void method1844(int i, int i_12_, boolean bool, int i_13_,
                                 boolean bool_14_, int i_15_, int i_16_) {
        Class348_Sub42_Sub4.anInt9515 = i_13_;
        Class275.anInt3550 = i_16_;
        if (bool_14_ == false) {
            Class348_Sub40_Sub31.anInt9406 = i;
            anInt6136++;
            Class348_Sub35.anInt6981 = i_12_;
            Class258_Sub2.anInt8537 = i_15_;
            if (bool && Class258_Sub2.anInt8537 >= 100) {
                Class59_Sub2_Sub2.anInt8685 = 256 + 512 * Class275.anInt3550;
                Class286_Sub4.anInt6246 = 256 + Class348_Sub35.anInt6981 * 512;
                Class305.anInt3855
                        = (Class275.method2064(Class286_Sub4.anInt6246,
                        Class355.anInt4372, 11219,
                        Class59_Sub2_Sub2.anInt8685)
                        + -Class348_Sub42_Sub4.anInt9515);
            }
            Class348_Sub40_Sub21.anInt9282 = 2;
            Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
        }
    }

    Class239_Sub28(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    final int method1714(int i, int i_17_) {
        if (i != 3)
            method1712(-55, 59);
        anInt6139++;
        return 1;
    }

    Class239_Sub28(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void method1716(boolean bool) {
        if (bool != false)
            method1847(null, 64);
        anInt6142++;
        if (this.anInt3138 != 1
                && this.anInt3138 != 0)
            this.anInt3138 = method1710(20014);
    }

    final int method1710(int i) {
        if (i != 20014)
            return 52;
        anInt6138++;
        return 1;
    }

    final int method1845(int i) {
        anInt6141++;
        if (i != -32350)
            return -127;
        return this.anInt3138;
    }

    static final boolean method1846(int i, int i_18_, int i_19_) {
        if (i_19_ <= 42)
            return true;
        anInt6143++;
        return Class278.method2075(i_18_, -126, i) | (0x40000 & i_18_) != 0
                || Class273.method2056(i_18_, 122, i);
    }

    static final String[] method1847(String[] strings, int i) {
        anInt6140++;
        String[] strings_20_ = new String[5];
        for (int i_21_ = i; i_21_ < 5; i_21_++) {
            strings_20_[i_21_] = i_21_ + ": ";
            if (strings != null && strings[i_21_] != null)
                strings_20_[i_21_] = strings_20_[i_21_] + strings[i_21_];
        }
        return strings_20_;
    }

    final void method1712(int i, int i_22_) {
        int i_23_ = -89 / ((82 - i) / 35);
        anInt6137++;
        this.anInt3138 = i_22_;
    }
}
