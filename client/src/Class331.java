/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class331 {
    static int[] anIntArray4128 = new int[5];
    static String[] aStringArray4129
            = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
            "Oct", "Nov", "Dec"};
    static Class46 aClass46_4130;
    static int anInt4131;
    static int anInt4132;
    static int anInt4133 = 0;
    static int anInt4134;
    static int anInt4135;
    static int anInt4136;
    static int anInt4137;

    static final int method2635(float f, boolean bool, float f_0_,
                                float f_1_) {
        anInt4131++;
        float f_2_ = !(f_1_ < 0.0F) ? f_1_ : -f_1_;
        float f_3_ = f < 0.0F ? -f : f;
        if (bool != false)
            method2637(-85);
        float f_4_ = !(f_0_ < 0.0F) ? f_0_ : -f_0_;
        if (!(f_2_ < f_3_) || !(f_3_ > f_4_)) {
            if (!(f_4_ > f_2_) || !(f_3_ < f_4_)) {
                if (!(f_1_ > 0.0F))
                    return 5;
                return 4;
            }
            if (f_0_ > 0.0F)
                return 2;
            return 3;
        }
        if (f > 0.0F)
            return 0;
        return 1;
    }

    static final void method2636(int i) {
        int i_5_ = -114 % ((i - 22) / 33);
        anInt4137++;
        Class100.aClass356_1585.method3481(0);
        s_Sub2.aClass107_8241.method1009(2110355138);
        Class367_Sub4.aClass107_7325.method1009(2110355138);
    }

    public static void method2637(int i) {
        aStringArray4129 = null;
        aClass46_4130 = null;
        if (i != 0)
            aClass46_4130 = null;
        anIntArray4128 = null;
    }

    static final void method2638(int i) {
        synchronized (Class24.aClass60_355) {
            Class24.aClass60_355.method587(-98);
        }
        anInt4136++;
        synchronized (Class130.aClass60_1894) {
            Class130.aClass60_1894.method587(i + 4530);
        }
        if (i != -4631)
            anInt4135 = 37;
    }

    static final short[] method2639(byte i, short[] is, int i_6_) {
        int i_7_ = 77 / ((i - -32) / 47);
        anInt4132++;
        short[] is_8_ = new short[i_6_];
        Class214.method1576(is, 0, is_8_, 0, i_6_);
        return is_8_;
    }

    static {
        aClass46_4130 = null;
    }
}
