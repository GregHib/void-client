/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98 {
    static Class348_Sub16_Sub3 aClass348_Sub16_Sub3_1564;
    static int anInt1565;
    static int[][] anIntArrayArray1566 = {{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
    static int anInt1567;
    static int anInt1568;
    Class88 aClass88_1569 = new Class88();
    static int anInt1570;
    static int anInt1571;

    static final boolean method877(int i, int i_0_, byte i_1_) {
        if (i_1_ != -127) anIntArrayArray1566 = null;
        anInt1567++;
        return Class286_Sub9.method2174((byte) 126, i, i_0_) || Class202.method1475((byte) -107, i_0_, i);
    }

    static final byte[] method878(String string, int i) {
        anInt1571++;
        int i_2_ = string.length();
        if (i_2_ == 0) return new byte[0];
        int i_3_ = ~0x3 & 3 + i_2_;
        int i_4_ = i_3_ / 4 * 3;
        if (i_3_ + -2 >= i_2_ || Class186_Sub1.method1399(7, string.charAt(i_3_ + -2)) == -1) i_4_ -= 2;
        else if (i_2_ <= i_3_ + -1 || Class186_Sub1.method1399(7, string.charAt(i_3_ - 1)) == -1) i_4_--;
        if (i > -92) method877(-51, -45, (byte) -74);
        byte[] is = new byte[i_4_];
        Class318_Sub2.method2497(is, (byte) 0, string, 0);
        return is;
    }

    public Class98() {
        /* empty */
    }

    public static void method879(int i) {
        aClass348_Sub16_Sub3_1564 = null;
        if (i > 67) anIntArrayArray1566 = null;
    }

    static {
        anInt1565 = 0;
    }
}
