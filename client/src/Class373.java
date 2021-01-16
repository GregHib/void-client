/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class373 {
    static int anInt4533;
    static int anInt4534;
    static int anInt4535;

    abstract boolean method3588(int i);

    abstract void method3589(int i);

    public Class373() {
        /* empty */
    }

    abstract boolean method3590(byte i);

    static final Class181 method3591(int i, int i_0_) {
        anInt4535++;
        Class181 class181
                = (Class181) Class5.aClass60_4636.method583(i, i_0_ + -128);
        if (class181 != null)
            return class181;
        byte[] is = Class239_Sub12.aClass45_5964.method410(-1860, i_0_, i);
        class181 = new Class181();
        if (is != null)
            class181.method1370(24, new Class348_Sub49(is));
        class181.method1371(4);
        Class5.aClass60_4636.method582(class181, i, (byte) -103);
        return class181;
    }

    abstract void method3592(int i);

    final boolean method3593(int i) {
        anInt4533++;
        if (i <= 91)
            method3593(53);
        return method3595(-83) || method3588(-121) || method3590((byte) 125);
    }

    abstract int method3594(byte i);

    abstract boolean method3595(int i);

    abstract Class348_Sub45 method3596(int i);

    abstract int method3597(boolean bool);
}
