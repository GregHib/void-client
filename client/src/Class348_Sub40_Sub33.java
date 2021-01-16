/* Class348_Sub40_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub33 extends Class348_Sub40 {
    static int anInt9425;
    static int anInt9426;
    static Class46[][] aClass46ArrayArray9427;
    static int anInt9428;
    static int anInt9429;
    static int anInt9430;

    static final boolean method3137(boolean bool, byte i) {
        anInt9426++;
        boolean bool_0_ = Class348_Sub8.aHa6654.method3666();
        if (i != -24)
            return true;
        if (!bool_0_ == !bool)
            return true;
        if (!bool)
            Class348_Sub8.aHa6654.method3710();
        else if (!Class348_Sub8.aHa6654.method3671())
            bool = false;
        if (bool_0_ == bool)
            return false;
        Class316.aClass348_Sub51_3959.method3429((byte) 74,
                (Class316
                        .aClass348_Sub51_3959
                        .aClass239_Sub12_7243),
                bool ? 1 : 0);
        Class14_Sub2.method243(37);
        return true;
    }

    public static void method3138(byte i) {
        aClass46ArrayArray9427 = null;
        int i_1_ = 93 % ((-58 - i) / 55);
    }

    final int[][] method3047(int i, int i_2_) {
        anInt9429++;
        int[][] is = this.aClass322_7033.method2557(-97, i);
        if (i_2_ != -1564599039)
            aClass46ArrayArray9427 = null;
        if (this.aClass322_7033.aBoolean4035) {
            int[] is_3_ = is[0];
            int[] is_4_ = is[1];
            int[] is_5_ = is[2];
            for (int i_6_ = 0;
                 ((i_6_ ^ 0xffffffff)
                         > (Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff));
                 i_6_++) {
                method3139(i_6_, i, (byte) -31);
                int[][] is_7_
                        = this.method3039((byte) 43, Class344.anInt4265, 0);
                is_3_[i_6_] = is_7_[0][Class121.anInt1796];
                is_4_[i_6_] = is_7_[1][Class121.anInt1796];
                is_5_[i_6_] = is_7_[2][Class121.anInt1796];
            }
        }
        return is;
    }

    final int[] method3042(int i, int i_8_) {
        anInt9428++;
        if (i_8_ != 255)
            aClass46ArrayArray9427 = null;
        int[] is = this.aClass191_7032.method1433(0, i);
        if (this.aClass191_7032.aBoolean2570) {
            for (int i_9_ = 0; ((Class348_Sub40_Sub6.anInt9139 ^ 0xffffffff)
                    < (i_9_ ^ 0xffffffff)); i_9_++) {
                method3139(i_9_, i, (byte) -31);
                int[] is_10_ = this.method3048(Class344.anInt4265,
                        i_8_ ^ 0x25c5979e, 0);
                is[i_9_] = is_10_[Class121.anInt1796];
            }
        }
        return is;
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_11_) {
        if (i_11_ != 31015)
            aClass46ArrayArray9427 = null;
        anInt9430++;
        if (i == 0)
            this.aBoolean7045
                    = class348_sub49.method3387(255) == 1;
    }

    public Class348_Sub40_Sub33() {
        super(1, false);
    }

    private final void method3139(int i, int i_12_, byte i_13_) {
        anInt9425++;
        int i_14_ = Class318_Sub6.anIntArray6432[i];
        int i_15_ = Class239_Sub18.anIntArray6035[i_12_];
        if (i_13_ != -31)
            method3139(-44, -111, (byte) 48);
        float f = (float) Math.atan2(i_14_ + -2048,
                i_15_ + -2048);
        if ((double) f >= -3.141592653589793
                && (double) f <= -2.356194490192345) {
            Class344.anInt4265 = i_12_;
            Class121.anInt1796 = i;
        } else if (!((double) f <= -1.5707963267948966)
                || !((double) f >= -2.356194490192345)) {
            if (!((double) f <= -0.7853981633974483)
                    || !((double) f >= -1.5707963267948966)) {
                if (!(f <= 0.0F) || !((double) f >= -0.7853981633974483)) {
                    if (!(f >= 0.0F) || !((double) f <= 0.7853981633974483)) {
                        if (!((double) f >= 0.7853981633974483)
                                || !((double) f <= 1.5707963267948966)) {
                            if ((double) f >= 1.5707963267948966
                                    && (double) f <= 2.356194490192345) {
                                Class344.anInt4265
                                        = Class286_Sub2.anInt6212 + -i;
                                Class121.anInt1796 = i_12_;
                            } else if ((double) f >= 2.356194490192345
                                    && (double) f <= 3.141592653589793) {
                                Class344.anInt4265 = i_12_;
                                Class121.anInt1796
                                        = -i + Class348_Sub40_Sub6.anInt9139;
                            }
                        } else {
                            Class121.anInt1796
                                    = -i_12_ + Class348_Sub40_Sub6.anInt9139;
                            Class344.anInt4265 = -i + Class286_Sub2.anInt6212;
                        }
                    } else {
                        Class121.anInt1796
                                = -i + Class348_Sub40_Sub6.anInt9139;
                        Class344.anInt4265 = -i_12_ + Class286_Sub2.anInt6212;
                    }
                } else {
                    Class121.anInt1796 = i;
                    Class344.anInt4265 = Class286_Sub2.anInt6212 - i_12_;
                }
            } else {
                Class121.anInt1796 = Class348_Sub40_Sub6.anInt9139 - i_12_;
                Class344.anInt4265 = i;
            }
        } else {
            Class344.anInt4265 = i;
            Class121.anInt1796 = i_12_;
        }
        Class344.anInt4265 &= Class299_Sub2.anInt6325;
        Class121.anInt1796 &= Class239_Sub22.anInt6076;
    }
}
