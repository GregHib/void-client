/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class160 {
    static int anInt2129;
    static boolean aBoolean2130;
    static float[] aFloatArray2131;
    char aChar2132;
    static boolean[][] aBooleanArrayArray2133
            = {{true, true, true, true, true, true, true, true, true, true, true,
            true, true},
            {true, true, true, false, false, false, true, true, false, false,
                    false, false, true},
            {true, false, false, false, false, true, true, true, false, false,
                    false, false, false},
            {false, false, true, true, true, true, false, false, false, false,
                    false, false, false},
            {true, true, true, true, true, true, false, false, false, false,
                    false, false, false},
            {true, true, true, false, false, true, true, true, false, false,
                    false, false, false},
            {true, true, false, false, false, true, true, true, false, false,
                    false, false, true},
            {true, true, false, false, false, false, false, true, false,
                    false, false, false, false},
            {false, true, true, true, true, true, true, true, false, false,
                    false, false, false},
            {true, false, false, false, true, true, true, true, true, true,
                    false, false, false},
            {true, true, true, true, true, false, false, false, true, true,
                    false, false, false},
            {true, true, true, false, false, false, false, false, false,
                    false, true, true, false},
            new boolean[13],
            {true, true, true, true, true, true, true, true, true, true, true,
                    true, true},
            new boolean[13]};
    static int anInt2134;
    int anInt2135 = 1;
    static int anInt2136;
    static float aFloat2137;

    public static void method1254(byte i) {
        aBooleanArrayArray2133 = null;
        aFloatArray2131 = null;
        if (i <= 11)
            aBooleanArrayArray2133 = null;
    }

    final void method1255(Class348_Sub49 class348_sub49, int i) {
        for (; ; ) {
            int i_0_ = class348_sub49.method3387(255);
            if ((i_0_ ^ 0xffffffff) == -1)
                break;
            method1256(-90, i_0_, class348_sub49);
        }
        if (i != -1)
            aBoolean2130 = false;
        anInt2129++;
    }

    private final void method1256(int i, int i_1_,
                                  Class348_Sub49 class348_sub49) {
        anInt2136++;
        if ((i_1_ ^ 0xffffffff) != -2) {
            if (i_1_ == 2)
                ((Class160) this).anInt2135 = 0;
        } else
            ((Class160) this).aChar2132
                    = Class50_Sub1.method462(class348_sub49.method3388(-119),
                    -128);
        if (i >= -73)
            method1255(null, -43);
    }

    static final boolean method1257(int i, int i_2_, int i_3_) {
        if (i > -23)
            aBooleanArrayArray2133 = null;
        anInt2134++;
        if ((0x20 & i_3_ ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    public Class160() {
        /* empty */
    }

    static {
        aFloatArray2131 = new float[4];
        aBoolean2130 = false;
    }
}
