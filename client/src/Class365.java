/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class365 {
    String aString4470;
    long aLong4471;
    String aString4472;
    static Class262 aClass262_4473;
    static int anInt4474 = 0;
    int anInt4475;
    int anInt4476;
    static Class114 aClass114_4477;

    public static void method3518(int i) {
        aClass262_4473 = null;
        if (i != 88) method3518(-49);
        aClass114_4477 = null;
    }

    Class365(int i, String string, int i_0_, String string_1_, long l) {
        try {
            this.aLong4471 = l;
            this.anInt4475 = i_0_;
            this.anInt4476 = i;
            this.aString4472 = string_1_;
            this.aString4470 = string;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("fia.<init>(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_0_ + ',' + (string_1_ != null ? "{...}" : "null") + ',' + l + ')'));
        }
    }

    static {
        aClass262_4473 = new Class262();
        aClass114_4477 = new Class114(88, 10);
    }
}
