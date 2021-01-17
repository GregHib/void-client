/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class122 {
    static boolean aBoolean1801;
    static int anInt1802;
    static int anInt1803;
    static int anInt1804;
    static int anInt1805;
    static boolean[] aBooleanArray1806 = new boolean[200];
    static int anInt1807;
    static String[] aStringArray1808;
    static int anInt1809;

    static final void method1085(int i, int i_0_, byte i_1_, int i_2_, int i_3_) {
        anInt1805++;
        Class348_Sub42_Sub15 class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_3_, (byte) 105, 8);
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9652 = i_0_;
        if (i_1_ < -57) {
            class348_sub42_sub15.anInt9650 = i;
            class348_sub42_sub15.anInt9651 = i_2_;
        }
    }

    public static void method1086(boolean bool) {
        if (bool != true) anInt1803 = -25;
        aStringArray1808 = null;
        aBooleanArray1806 = null;
    }

    static final boolean method1087(int i, int i_4_, int i_5_) {
        if (i != 12644) method1085(55, -60, (byte) -29, -35, -112);
        anInt1809++;
        return (0x84080 & i_5_) != 0;
    }

    static final int method1088(int i, byte i_6_, int i_7_, int i_8_, int i_9_) {
        anInt1804++;
        int i_10_ = -Class70.anIntArray1204[8192 * i_8_ / i_7_] + 65536 >> 1;
        if (i_6_ != 22) return -73;
        return ((i_10_ * i >> 16) + (i_9_ * (65536 + -i_10_) >> 16));
    }

    static final boolean method1089(int i, char c) {
        anInt1807++;
        if (i >= -107) aBooleanArray1806 = null;
        if (c > 0 && c < 128 || c >= 160 && c <= 255) return true;
        if (c != 0) {
            char[] cs = Class44.aCharArray625;
            for (int i_11_ = 0; cs.length > i_11_; i_11_++) {
                int i_12_ = cs[i_11_];
                if (c == i_12_) return true;
            }
        }
        return false;
    }

    static final void method1090(byte[][] is, int i, Class237_Sub1 class237_sub1) {
        try {
            anInt1802++;
            int i_13_ = Class347.aByteArrayArray4281.length;
            if (i == 65536) {
                for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
                    byte[] is_15_ = is[i_14_];
                    if (is_15_ != null) {
                        int i_16_ = (64 * (Class348_Sub23_Sub3.anIntArray9042[i_14_] >> 8) + -za_Sub2.anInt9780);
                        int i_17_ = ((Class348_Sub23_Sub3.anIntArray9042[i_14_] & 0xff) * 64 - Class90.anInt1517);
                        Class369_Sub1.method3570(false);
                        class237_sub1.method1695(is_15_, (Class348_Sub45.aClass361Array7108), i_17_, Class348_Sub8.aHa6654, i_16_, i ^ 0x1054f);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("nga.C(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (class237_sub1 != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        anInt1803 = 0;
        aStringArray1808 = new String[100];
    }
}
