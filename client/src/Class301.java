/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class301 {
    static Class351 aClass351_3825;
    static int anInt3826;
    static int anInt3827;
    static int anInt3828;
    static int anInt3829 = -1;
    static int anInt3830;

    static final int method2278(int i, int i_0_, byte i_1_, int i_2_) {
        anInt3830++;
        int i_3_ = -114 / ((i_1_ - 74) / 45);
        int i_4_ = i_2_ / i;
        int i_5_ = -1 + i & i_2_;
        int i_6_ = i_0_ / i;
        int i_7_ = i_0_ & -1 + i;
        int i_8_ = Class44.method384(i_4_, -1, i_6_);
        int i_9_ = Class44.method384(i_4_ - -1, -1, i_6_);
        int i_10_ = Class44.method384(i_4_, -1, 1 + i_6_);
        int i_11_ = Class44.method384(i_4_ + 1, -1, i_6_ + 1);
        int i_12_ = Class122.method1088(i_9_, (byte) 22, i, i_5_, i_8_);
        int i_13_ = Class122.method1088(i_11_, (byte) 22, i, i_5_, i_10_);
        return Class122.method1088(i_13_, (byte) 22, i, i_7_, i_12_);
    }

    static final int method2279(boolean bool, int i, int i_14_, int i_15_, int i_16_) {
        anInt3828++;
        int i_17_ = i & 0xf;
        if (bool != true) aClass351_3825 = null;
        int i_18_ = i_17_ < 8 ? i_16_ : i_15_;
        int i_19_ = (i_17_ < 4 ? i_15_ : i_17_ == 12 || i_17_ == 14 ? i_16_ : i_14_);
        return (((i_17_ & 0x1) != 0 ? -i_18_ : i_18_) - -((0x2 & i_17_) == 0 ? i_19_ : -i_19_));
    }

    static final void method2280(byte i, int i_20_) {
        anInt3826++;
        if (Class289.aByteArrayArrayArray3700 == null) Class289.aByteArrayArrayArray3700 = (new byte[4][Class367_Sub4.anInt7319]
                [Class348_Sub40_Sub3.anInt9109]);
        if (i_20_ != 28587) method2278(35, -47, (byte) 56, -93);
        for (int i_21_ = 0; i_21_ < 4; i_21_++) {
            for (int i_22_ = 0; Class367_Sub4.anInt7319 > i_22_; i_22_++) {
                for (int i_23_ = 0; (Class348_Sub40_Sub3.anInt9109 > i_23_); i_23_++)
                    Class289.aByteArrayArrayArray3700[i_21_][i_22_][i_23_] = i;
            }
        }
    }

    public static void method2281(int i) {
        aClass351_3825 = null;
        if (i != 1) method2278(-115, 106, (byte) -74, -75);
    }

    static final void method2282(int i) {
        anInt3827++;
        Class348_Sub42_Sub3.method3177(i ^ 0x315e, false);
        if (i == -12648) {
            if (Class111.anInt1720 >= 0 && Class111.anInt1720 != 0) {
                Class367_Sub10.method3553(false, (byte) 116, Class111.anInt1720);
                Class111.anInt1720 = -1;
            }
        }
    }

    static {
        aClass351_3825 = new Class351(82, 18);
    }
}
