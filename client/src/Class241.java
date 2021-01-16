/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class241 {
    static int anInt3148;
    static int anInt3149;
    static Class351 aClass351_3150 = new Class351(71, 2);

    abstract void method1856(byte i);

    static final long method1857(byte i) {
        anInt3148++;
        if (i != -45)
            return -58L;
        return Class348_Sub8.aClass241_6660.method1862(-18931);
    }

    abstract long method1858(int i);

    abstract int method1859(int i, long l);

    public static void method1860(byte i) {
        aClass351_3150 = null;
        int i_0_ = -52 / ((-22 - i) / 55);
    }

    public Class241() {
        /* empty */
    }

    final int method1861(int i, long l) {
        try {
            anInt3149++;
            long l_1_ = method1858(-73);
            if ((long) i < l_1_)
                Class286_Sub5.method2161((byte) 61, l_1_);
            return method1859(71, l);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "tb.H(" + i + ',' + l + ')');
        }
    }

    abstract long method1862(int i);
}
