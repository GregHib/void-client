/* Component257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component257
/**
 * RENAMED from `Class136` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface7 {
    static Component304 aClass65_4787;
    private final String aString4788;
    private final CacheStore aClass45_4789;
    static int anInt4790;
    static short[][] aShortArrayArray4791;
    static int anInt4792;
    static int anInt4793 = 1405;
    static int anInt4794;
    static int anInt4795;
    static CacheStore aClass45_4796;

    public static void method1159(byte i) {
        aShortArrayArray4791 = null;
        aClass65_4787 = null;
        if (i >= 36) aClass45_4796 = null;
    }

    Component257(CacheStore class45, String string) {
        try {
            aString4788 = string;
            aClass45_4789 = class45;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nv.<init>(" + (class45 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    public final Component325 method32(int i) {
        anInt4794++;
        if (i != -15004) method1159((byte) -110);
        return Component325.aClass69_1198;
    }

    public final int method31(int i) {
        anInt4790++;
        if (aClass45_4789.isGroupReadyByName(100, aString4788)) return 100;
        int i_0_ = 31 % ((-43 - i) / 62);
        return aClass45_4789.getNamedGroupLoadPercent(aString4788, 0);
    }
}
