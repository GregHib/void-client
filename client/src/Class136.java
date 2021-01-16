/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class136 implements Interface7 {
    static Class65 aClass65_4787;
    private final String aString4788;
    private final Class45 aClass45_4789;
    static int anInt4790;
    static short[][] aShortArrayArray4791;
    static int anInt4792;
    static int anInt4793 = 1405;
    static int anInt4794;
    static int anInt4795;
    static Class45 aClass45_4796;

    public static void method1159(byte i) {
        aShortArrayArray4791 = null;
        aClass65_4787 = null;
        if (i >= 36)
            aClass45_4796 = null;
    }

    Class136(Class45 class45, String string) {
        try {
            aString4788 = string;
            aClass45_4789 = class45;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("nv.<init>("
                            + (class45 != null ? "{...}"
                            : "null")
                            + ','
                            + (string != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public final Class69 method32(int i) {
        anInt4794++;
        if (i != -15004)
            method1159((byte) -110);
        return Class69.aClass69_1198;
    }

    public final int method31(int i) {
        anInt4790++;
        if (aClass45_4789.method413(100, aString4788))
            return 100;
        int i_0_ = 31 % ((-43 - i) / 62);
        return aClass45_4789.method397(aString4788, 0);
    }
}
