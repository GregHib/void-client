/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class168 {
    static Class114 aClass114_2248;
    static Class46 aClass46_2249;
    static short aShort2250 = 205;
    static int anInt2251;
    static Class323 aClass323_2252;
    static int anInt2253;
    static int anInt2254 = 0;
    static Class114 aClass114_2255;
    static volatile Object anObject2256;

    public static void method1298(int i) {
        if (i != -1)
            aClass46_2249 = null;
        anObject2256 = null;
        aClass114_2255 = null;
        aClass46_2249 = null;
        aClass114_2248 = null;
        aClass323_2252 = null;
    }

    static final boolean method1299(int i, int i_0_, int i_1_) {
        anInt2253++;
        if (i != 393216)
            anInt2251 = -106;
        return Class348_Sub42_Sub16_Sub1.method3262(i_0_, i_1_, 102)
                | (i_0_ & 0x60000 ^ 0xffffffff) != -1
                || Class348_Sub9.method2783(i_1_, (byte) -99, i_0_);
    }

    static {
        aClass114_2248 = new Class114(25, 6);
        aClass114_2255 = new Class114(99, -1);
        anObject2256 = null;
    }
}
