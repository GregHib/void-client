/* Class239_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub27 extends Class239 {
    static int anInt6127;
    static Class341 aClass341_6128;
    static int anInt6129;
    static int anInt6130;
    static int anInt6131;
    static int anInt6132;
    static int anInt6133;

    static final void method1839(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                 int i_4_) {
        anInt6129++;
        int i_5_ = 0;
        int i_6_ = i_0_;
        int i_7_ = i_4_ * i_4_;
        int i_8_ = i_0_ * i_0_;
        int i_9_ = i_8_ << 765849473;
        int i_10_ = i_7_ << -649030495;
        int i_11_ = i_0_ << 1286114497;
        int i_12_ = i_9_ + i_7_ * (-i_11_ + 1);
        int i_13_ = -((i_11_ + i_2_) * i_10_) + i_8_;
        int i_14_ = i_7_ << -1966395806;
        int i_15_ = i_8_ << 1292060706;
        int i_16_ = i_9_ * (3 + (i_5_ << 246696897));
        int i_17_ = i_10_ * (-3 + (i_6_ << -1484615583));
        int i_18_ = i_15_ * (i_5_ - -1);
        if ((i_1_ ^ 0xffffffff) <= (Class132.anInt1910 ^ 0xffffffff)
                && (i_1_ ^ 0xffffffff) >= (Class38.anInt513 ^ 0xffffffff)) {
            int i_19_ = Class85.method831(Class113.anInt1745, i + i_4_,
                    Class369.anInt4960, -89);
            int i_20_ = Class85.method831(Class113.anInt1745, -i_4_ + i,
                    Class369.anInt4960, -116);
            Class135_Sub2.method1156(-27, i_19_,
                    Class17.anIntArrayArray255[i_1_], i_20_,
                    i_3_);
        }
        int i_21_ = i_14_ * (i_6_ - 1);
        while ((i_6_ ^ 0xffffffff) < -1) {
            if ((i_12_ ^ 0xffffffff) > -1) {
                while ((i_12_ ^ 0xffffffff) > -1) {
                    i_13_ += i_18_;
                    i_12_ += i_16_;
                    i_5_++;
                    i_16_ += i_15_;
                    i_18_ += i_15_;
                }
            }
            if ((i_13_ ^ 0xffffffff) > -1) {
                i_12_ += i_16_;
                i_13_ += i_18_;
                i_16_ += i_15_;
                i_18_ += i_15_;
                i_5_++;
            }
            i_13_ += -i_17_;
            i_12_ += -i_21_;
            i_21_ -= i_14_;
            i_17_ -= i_14_;
            i_6_--;
            int i_22_ = i_1_ + -i_6_;
            int i_23_ = i_6_ + i_1_;
            if ((Class132.anInt1910 ^ 0xffffffff) >= (i_23_ ^ 0xffffffff)
                    && (Class38.anInt513 ^ 0xffffffff) <= (i_22_ ^ 0xffffffff)) {
                int i_24_ = Class85.method831(Class113.anInt1745, i + i_5_,
                        Class369.anInt4960, 86);
                int i_25_ = Class85.method831(Class113.anInt1745, -i_5_ + i,
                        Class369.anInt4960, 32);
                if ((i_22_ ^ 0xffffffff) <= (Class132.anInt1910 ^ 0xffffffff))
                    Class135_Sub2.method1156(i_2_ + -26, i_24_,
                            Class17.anIntArrayArray255[i_22_],
                            i_25_, i_3_);
                if ((i_23_ ^ 0xffffffff) >= (Class38.anInt513 ^ 0xffffffff))
                    Class135_Sub2.method1156(-27, i_24_,
                            Class17.anIntArrayArray255[i_23_],
                            i_25_, i_3_);
            }
        }
    }

    final int method1840(int i) {
        anInt6127++;
        if (i != -32350)
            aClass341_6128 = null;
        return this.anInt3138;
    }

    public static void method1841(int i) {
        if (i != 16878)
            method1839(-83, -10, 27, 111, 41, 109);
        aClass341_6128 = null;
    }

    final void method1712(int i, int i_26_) {
        this.anInt3138 = i_26_;
        anInt6132++;
        int i_27_ = 123 / ((82 - i) / 35);
    }

    final int method1714(int i, int i_28_) {
        if (i != 3)
            aClass341_6128 = null;
        anInt6130++;
        return 3;
    }

    Class239_Sub27(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    Class239_Sub27(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    final int method1710(int i) {
        anInt6133++;
        if (i != 20014)
            method1716(true);
        if ((this.aClass348_Sub51_3136.method3422(674)
                == Class10.aClass230_186)
                && this.aClass348_Sub51_3136.method3425(-111))
            return 0;
        return 1;
    }

    final void method1716(boolean bool) {
        anInt6131++;
        this.anInt3138 = method1710(20014);
        if (bool != false)
            method1710(98);
    }
}
