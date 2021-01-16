/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class58 {
    static int anInt1056;
    private long aLong1057;
    private int anInt1058;
    static int anInt1059;
    static int anInt1060;
    static int anInt1061;
    static int anInt1062;
    static int anInt1063;
    static int anInt1064 = -2;
    static int anInt1065;
    static int anInt1066;
    static int anInt1067;

    static final int method532(int i, int i_0_, boolean bool, int i_1_) {
        anInt1061++;
        Class348_Sub13 class348_sub13
                = Class258_Sub4.method1974((byte) -120, i_0_, bool);
        if (class348_sub13 == null)
            return 0;
        if (i == -1)
            return 0;
        int i_2_ = 0;
        for (int i_3_ = 0;
             ((class348_sub13.anIntArray6758.length
                     ^ 0xffffffff)
                     < (i_3_ ^ 0xffffffff));
             i_3_++) {
            if ((i ^ 0xffffffff)
                    == (class348_sub13.anIntArray6757[i_3_]
                    ^ 0xffffffff))
                i_2_ += class348_sub13.anIntArray6758[i_3_];
        }
        int i_4_ = 73 % ((i_1_ - -52) / 63);
        return i_2_;
    }

    private final void method533(Class325 class325, int i) {
        aLong1057 |= class325.anInt4070
                << anInt1058++ * Class325.anInt4081;
        anInt1063++;
        int i_5_ = 0 % ((28 - i) / 59);
    }

    private final int method534(byte i, int i_6_) {
        anInt1065++;
        if (i != 0)
            return -115;
        return (int) (aLong1057 >> Class325.anInt4081 * i_6_) & 0xf;
    }

    static final void method535(int i, int i_7_, int i_8_, int i_9_, int i_10_,
                                int i_11_, byte i_12_) {
        anInt1062++;
        int i_13_ = Class85.method831(Class38.anInt513, i_11_,
                Class132.anInt1910, 111);
        int i_14_ = Class85.method831(Class38.anInt513, i_7_,
                Class132.anInt1910, -104);
        if (i_12_ >= -62)
            method535(80, -63, -10, 41, -65, 39, (byte) -89);
        int i_15_ = Class85.method831(Class113.anInt1745, i,
                Class369.anInt4960, -79);
        int i_16_ = Class85.method831(Class113.anInt1745, i_9_,
                Class369.anInt4960, 92);
        int i_17_ = Class85.method831(Class38.anInt513, i_11_ + i_8_,
                Class132.anInt1910, 32);
        int i_18_ = Class85.method831(Class38.anInt513, -i_8_ + i_7_,
                Class132.anInt1910, 41);
        for (int i_19_ = i_13_; (i_19_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff);
             i_19_++)
            Class135_Sub2.method1156(-27, i_16_,
                    Class17.anIntArrayArray255[i_19_], i_15_,
                    i_10_);
        for (int i_20_ = i_14_; i_18_ < i_20_; i_20_--)
            Class135_Sub2.method1156(-27, i_16_,
                    Class17.anIntArrayArray255[i_20_], i_15_,
                    i_10_);
        int i_21_ = Class85.method831(Class113.anInt1745, i_8_ + i,
                Class369.anInt4960, 121);
        int i_22_ = Class85.method831(Class113.anInt1745, -i_8_ + i_9_,
                Class369.anInt4960, -101);
        for (int i_23_ = i_17_; (i_18_ ^ 0xffffffff) <= (i_23_ ^ 0xffffffff);
             i_23_++) {
            int[] is = Class17.anIntArrayArray255[i_23_];
            Class135_Sub2.method1156(-27, i_21_, is, i_15_, i_10_);
            Class135_Sub2.method1156(-27, i_16_, is, i_22_, i_10_);
        }
    }

    Class58(Class325 class325) {
        aLong1057 = class325.anInt4070;
        anInt1058 = 1;
    }

    Class58(Class325[] class325s) {
        for (int i = 0; i < class325s.length; i++)
            method533(class325s[i], 92);
    }

    static final boolean method536(int i, boolean bool, int i_24_, int i_25_,
                                   int i_26_) {
        if (bool != false)
            method536(-65, true, 105, -126, 39);
        anInt1066++;
        if ((Class348_Sub33.aByteArrayArrayArray6962[0][i_24_][i] & 0x2
                ^ 0xffffffff)
                != -1)
            return true;
        if ((0x10 & Class348_Sub33.aByteArrayArrayArray6962[i_26_][i_24_][i])
                != 0)
            return false;
		return i_25_ == Class239_Sub10.method1762(-55, i_26_, i, i_24_);
	}

    final Class325 method537(int i, int i_27_) {
        anInt1060++;
        int i_28_ = 4 % ((-35 - i_27_) / 53);
        return Class325.method2598(method534((byte) 0, i), -109);
    }

    final int method538(byte i) {
        anInt1056++;
        if (i >= -114)
            method538((byte) 105);
        return anInt1058;
    }
}
