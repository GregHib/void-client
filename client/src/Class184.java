/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class184 {
    int[] anIntArray2468;
    static boolean aBoolean2469;
    static int anInt2470;
    static int[] anIntArray2471 = new int[14];
    static int anInt2472;
    String[] aStringArray2473;
    Class348_Sub42_Sub19 aClass348_Sub42_Sub19_2474;
    static int anInt2475;
    static int anInt2476;
    int anInt2477 = -1;
    /*synthetic*/ static Class aClass2478;

    static final int method1384(int i, int i_0_, int i_1_) {
        i_1_ = (0x7f & i) * i_1_ >> 1421041063;
        if (i_0_ != 1421041063)
            return -72;
        anInt2476++;
        if (i_1_ >= 2) {
            if (i_1_ > 126)
                i_1_ = 126;
        } else
            i_1_ = 2;
        return i_1_ + (0xff80 & i);
    }

    static final void method1385(boolean bool, byte[] is, byte i) {
        anInt2475++;
        if (Class299_Sub1_Sub2.aClass348_Sub49_8698 == null)
            Class299_Sub1_Sub2.aClass348_Sub49_8698
                    = new Class348_Sub49(20000);
        Class299_Sub1_Sub2.aClass348_Sub49_8698.method3380(is.length, 0, is,
                97);
        if (bool) {
            Class167.method1294((byte) -113,
                    (Class299_Sub1_Sub2.aClass348_Sub49_8698
                            .aByteArray7154));
            Class65.aClass110_Sub1Array1146
                    = new Class110_Sub1[Class225.anInt2956];
            int i_2_ = 0;
            for (int i_3_ = Class318_Sub1_Sub2.anInt8731;
                 (Class239_Sub29.anInt6151 >= i_3_);
                 i_3_++) {
                Class110_Sub1 class110_sub1
                        = Class239_Sub5.method1742(false, i_3_);
                if (class110_sub1 != null)
                    Class65.aClass110_Sub1Array1146[i_2_++] = class110_sub1;
            }
            Class130.aBoolean1899 = false;
            Class240.aLong4683 = Class62.method599(-92);
            Class299_Sub1_Sub2.aClass348_Sub49_8698 = null;
        }
        if (i > -21)
            aBoolean2469 = true;
    }

    public static void method1386(boolean bool) {
        anIntArray2471 = null;
        if (bool != true)
            aBoolean2469 = true;
    }

    static final void method1387(int i, Class348_Sub27 class348_sub27) {
        anInt2470++;
        if (Class147.aClass357ArrayArrayArray2029 != null) {
            if (i >= -38)
                method1384(-77, 22, 77);
            Interface10 interface10 = null;
            if (class348_sub27.anInt6904 == 0)
                interface10
                        = ((Interface10)
                        r_Sub2.method3297((class348_sub27
                                        .anInt6899),
                                (class348_sub27
                                        .anInt6905),
                                (class348_sub27
                                        .anInt6896)));
            if (class348_sub27.anInt6904 == 1)
                interface10
                        = ((Interface10)
                        (Class348_Sub40_Sub32.method3135
                                (class348_sub27.anInt6899,
                                        class348_sub27.anInt6905,
                                        class348_sub27.anInt6896)));
            if (class348_sub27.anInt6904 == 2)
                interface10
                        = ((Interface10)
                        (Class177.method1353
                                (class348_sub27.anInt6899,
                                        class348_sub27.anInt6905,
                                        class348_sub27.anInt6896,
                                        (aClass2478 != null ? aClass2478
                                                : (aClass2478 = method1389("Interface10"))))));
            if (class348_sub27.anInt6904 == 3)
                interface10
                        = ((Interface10)
                        (Class348_Sub16_Sub3.method2878
                                (class348_sub27.anInt6899,
                                        class348_sub27.anInt6905,
                                        class348_sub27.anInt6896)));
            if (interface10 == null) {
                class348_sub27.anInt6892 = 0;
                class348_sub27.anInt6902 = -1;
                class348_sub27.anInt6903 = 0;
            } else {
                class348_sub27.anInt6902
                        = interface10.method42(-103);
                class348_sub27.anInt6903
                        = interface10.method39(111);
                class348_sub27.anInt6892
                        = interface10.method41(-32228);
            }
        }
    }

    static final void method1388(int i, int i_4_, int i_5_, int i_6_, int i_7_,
                                 int i_8_) {
        Class135_Sub2.method1156(-27, i_6_, Class17.anIntArrayArray255[i++],
                i_7_, i_4_);
        anInt2472++;
        Class135_Sub2.method1156(-27, i_6_, Class17.anIntArrayArray255[i_8_--],
                i_7_, i_4_);
        int i_9_ = -52 / ((i_5_ - -32) / 55);
        for (int i_10_ = i; i_8_ >= i_10_; i_10_++) {
            int[] is = Class17.anIntArrayArray255[i_10_];
            is[i_7_] = is[i_6_] = i_4_;
        }
    }

    /*synthetic*/
    static Class method1389(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception
                    .getMessage());
        }
    }

    static {
        aBoolean2469 = false;
    }
}
