/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24 {
    static int anInt354;
    static Class60 aClass60_355 = new Class60(260);
    static int anInt356;
    static Class318_Sub1_Sub3[] aClass318_Sub1_Sub3Array357;
    static byte[][] aByteArrayArray358 = new byte[1000][];
    static int anInt359;

    public static void method296(byte i) {
        if (i != -99)
            method298(false, 24, -128, 22, -7);
        aClass60_355 = null;
        aByteArrayArray358 = null;
        aClass318_Sub1_Sub3Array357 = null;
    }

    static final void method297(boolean bool) {
        if (bool != false)
            aClass60_355 = null;
        Class5.aClass60_4636.method590(0);
        anInt356++;
    }

    static final void method298(boolean bool, int i, int i_0_, int i_1_,
                                int i_2_) {
        anInt354++;
        if (Class316.aClass348_Sub51_3959
                .aClass239_Sub25_7271.method1829(-32350)
                == 0)
            Class348_Sub42_Sub3.method3177(-98, false);
        else {
            Class111.anInt1720
                    = Class316.aClass348_Sub51_3959
                    .aClass239_Sub25_7271.method1829(-32350);
            Class367_Sub10.method3553(true, (byte) 103, 0);
        }
        Class88.aBoolean1500 = bool;
        Class339.anInt4202 = i;
        Class239_Sub7.anInt5909 = i_0_;
        Class75.method754(i_1_);
        if (i_2_ > -41)
            method297(true);
    }
}
