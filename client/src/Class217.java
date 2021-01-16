/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class217 {
    static int anInt2840;
    static int anInt2841;
    private Class45 aClass45_2842;
    static int anInt2843;
    static Class60 aClass60_2844 = new Class60(64);
    int anInt2845;
    static int anInt2846;
    static int anInt2847;
    private Class60 aClass60_2848 = new Class60(64);

    public static void method1585(int i) {
        if (i != -1)
            method1585(-34);
        aClass60_2844 = null;
    }

    static final void method1586(boolean bool, byte i, String string) {
        if (i >= -51)
            aClass60_2844 = null;
        anInt2840++;
        Class16.method259(-1, 113, bool, string, -1);
    }

    final void method1587(int i, int i_0_) {
        if (i_0_ != 3758)
            aClass60_2848 = null;
        synchronized (aClass60_2848) {
            aClass60_2848.method578(2, i);
        }
        anInt2841++;
    }

    final Class159 method1588(int i, int i_1_) {
        anInt2847++;
        Class159 class159;
        synchronized (aClass60_2848) {
            class159 = (Class159) aClass60_2848.method583((long) i_1_, -126);
        }
        if (class159 != null)
            return class159;
        byte[] is;
        synchronized (aClass45_2842) {
            is = aClass45_2842.method410(-1860, 16, i_1_);
            if (i >= -17)
                aClass60_2848 = null;
        }
        class159 = new Class159();
        if (is != null)
            class159.method1253(new Class348_Sub49(is), true);
        synchronized (aClass60_2848) {
            aClass60_2848.method582(class159, (long) i_1_, (byte) -124);
        }
        return class159;
    }

    final void method1589(byte i) {
        anInt2843++;
        synchronized (aClass60_2848) {
            aClass60_2848.method590(0);
        }
        if (i < 126)
            method1588(-98, -35);
    }

    final void method1590(int i) {
        anInt2846++;
        if (i != 0)
            ((Class217) this).anInt2845 = -97;
        synchronized (aClass60_2848) {
            aClass60_2848.method587(i ^ ~0x6b);
        }
    }

    Class217(Class230 class230, int i, Class45 class45) {
        try {
            aClass45_2842 = class45;
            if (aClass45_2842 != null)
                ((Class217) this).anInt2845 = aClass45_2842.method407(0, 16);
            else
                ((Class217) this).anInt2845 = 0;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("rv.<init>("
                            + (class230 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (class45 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }
}
