/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class132 {
    static int anInt1905 = 4;
    static int anInt1906;
    static Player aPlayer_1907;
    static int anInt1908;
    static int[] anIntArray1909;
    static int anInt1910 = 0;
    static int anInt1911 = 7000;

    public static void method1137(int i) {
        if (i != 3) method1138(null, true, null, (byte) 70);
        anIntArray1909 = null;
        aPlayer_1907 = null;
    }

    static final void method1138(String string, boolean bool, String string_0_, byte i) {
        try {
            anInt1908++;
            Class64_Sub3.aString5600 = string;
            Class186.aString2496 = string_0_;
            Class318_Sub1_Sub3_Sub3.aBoolean10238 = bool;
            if (!Class318_Sub1_Sub3_Sub3.aBoolean10238 && (Class64_Sub3.aString5600.equals("") || Class186.aString2496.equals(""))) Class14_Sub4.method254(3, (byte) -100);
            else {
                int i_1_ = 34 % ((16 - i) / 55);
                if (Class239_Sub12.anInt5969 != 1) {
                    Class63.anInt1121 = 0;
                    Class348_Sub42_Sub7.anInt9541 = -1;
                }
                Class110.aBoolean1712 = false;
                Class14_Sub4.method254(-3, (byte) -94);
                Class225.anInt2955 = 1;
                Class11.anInt197 = 0;
                Class318_Sub1_Sub1_Sub2.anInt9971 = 0;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("nr.A(" + (string != null ? "{...}" : "null") + ',' + bool + ',' + (string_0_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    static {
        anInt1906 = anInt1911;
    }
}
