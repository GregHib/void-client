/* Class318_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub9_Sub1 extends Class318_Sub9 {
    static int anInt8782;
    String aString8783;
    static float aFloat8784;
    static int[] anIntArray8785;
    short aShort8786;
    int anInt8787 = (int) (Class62.method599(-92) / 1000L);
    static int anInt8788;

    static final Class57[] method2515(int i) {
        if (i != 1494)
            method2515(-18);
        anInt8782++;
        if (Class228.aClass57Array2974 == null) {
            Class57[] class57s
                    = Class19.method286((byte) -107,
                    Class348_Sub23_Sub1.aClass297_8992);
            Class57[] class57s_0_ = new Class57[class57s.length];
            int i_1_ = 0;
            int i_2_ = ((Class348_Sub51) Class316.aClass348_Sub51_3959)
                    .aClass239_Sub23_7231.method1818(-32350);
            while_108_:
            for (int i_3_ = 0; class57s.length > i_3_; i_3_++) {
                Class57 class57 = class57s[i_3_];
                if (((((Class57) class57).anInt1046 ^ 0xffffffff) >= -1
                        || (((Class57) class57).anInt1046 ^ 0xffffffff) <= -25)
                        && (((Class57) class57).anInt1047 ^ 0xffffffff) <= -801
                        && (((Class57) class57).anInt1054 ^ 0xffffffff) <= -601
                        && ((i_2_ ^ 0xffffffff) != -3
                        || ((((Class57) class57).anInt1047 ^ 0xffffffff)
                        >= -801) && ((Class57) class57).anInt1054 <= 600)
                        && ((i_2_ ^ 0xffffffff) != -2
                        || (((((Class57) class57).anInt1047 ^ 0xffffffff)
                        >= -1025)
                        && ((((Class57) class57).anInt1054 ^ 0xffffffff)
                        >= -769)))) {
                    for (int i_4_ = 0;
                         (i_1_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
                        Class57 class57_5_ = class57s_0_[i_4_];
                        if ((((Class57) class57_5_).anInt1047
                                == ((Class57) class57).anInt1047)
                                && ((((Class57) class57).anInt1054 ^ 0xffffffff)
                                == (((Class57) class57_5_).anInt1054
                                ^ 0xffffffff))) {
                            if ((((Class57) class57_5_).anInt1046 ^ 0xffffffff)
                                    > (((Class57) class57).anInt1046 ^ 0xffffffff))
                                class57s_0_[i_4_] = class57;
                            continue while_108_;
                        }
                    }
                    class57s_0_[i_1_] = class57;
                    i_1_++;
                }
            }
            Class228.aClass57Array2974 = new Class57[i_1_];
            Class214.method1575(class57s_0_, 0, Class228.aClass57Array2974, 0,
                    i_1_);
            int[] is = new int[Class228.aClass57Array2974.length];
            for (int i_6_ = 0;
                 ((i_6_ ^ 0xffffffff)
                         > (Class228.aClass57Array2974.length ^ 0xffffffff));
                 i_6_++) {
                Class57 class57 = Class228.aClass57Array2974[i_6_];
                is[i_6_] = (((Class57) class57).anInt1047
                        * ((Class57) class57).anInt1054);
            }
            Class39.method366(Class228.aClass57Array2974, (byte) -123, is);
        }
        return Class228.aClass57Array2974;
    }

    static final Class348_Sub42_Sub15 method2516(int i, byte i_7_, int i_8_) {
        anInt8788++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = ((Class348_Sub42_Sub15)
                Class100.aClass356_1585.method3480(((long) i_8_ << 354613216
                                | (long) i),
                        i_7_ ^ ~0x171e));
        if (i_7_ != 105)
            aFloat8784 = 0.99212307F;
        if (class348_sub42_sub15 == null) {
            class348_sub42_sub15 = new Class348_Sub42_Sub15(i_8_, i);
            Class100.aClass356_1585.method3483((byte) 91,
                    (((Class348)
                            class348_sub42_sub15)
                            .aLong4291),
                    class348_sub42_sub15);
        }
        return class348_sub42_sub15;
    }

    public static void method2517(byte i) {
        if (i != 4)
            anIntArray8785 = null;
        anIntArray8785 = null;
    }

    Class318_Sub9_Sub1(String string, int i) {
        ((Class318_Sub9_Sub1) this).aString8783 = string;
        ((Class318_Sub9_Sub1) this).aShort8786 = (short) i;
    }
}
