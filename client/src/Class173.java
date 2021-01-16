/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class173 {
    static int anInt2282;
    static int anInt2283;
    static int anInt2284;
    static Class114 aClass114_2285 = new Class114(77, 4);
    static long aLong2286 = 0L;

    public final String toString() {
        anInt2282++;
        throw new IllegalStateException();
    }

    public static void method1329(int i) {
        if (i != 4)
            method1329(95);
        aClass114_2285 = null;
    }

    static final void method1330(int i, int i_0_, int i_1_) {
        anInt2284++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(i_1_, (byte) 105, 5);
        class348_sub42_sub15.method3246(-25490);
        if (i_0_ != -19906)
            method1329(71);
        ((Class348_Sub42_Sub15) class348_sub42_sub15).anInt9652 = i;
    }

    static final byte[] method1331(byte i, Object object, int i_2_, int i_3_) {
        anInt2283++;
        if (object == null)
            return null;
        if (object instanceof byte[]) {
            byte[] is = (byte[]) object;
            return Class93.method864(i_2_, is, i_3_, -104);
        }
        if (i < 89)
            aClass114_2285 = null;
        if (object instanceof Class344) {
            Class344 class344 = (Class344) object;
            return class344.method2689(2, i_3_, i_2_);
        }
        throw new IllegalArgumentException();
    }

    public Class173() {
        /* empty */
    }
}
