/* Component3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component3
/**
 * RENAMED from `Class148` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2037;
    Component3 aClass148_2038;
    static int[] anIntArray2039 = {1, 0, -1, 0};
    Component327 aClass318_Sub1_Sub3_2040;
    static int anInt2041;
    static Component169 aClass196_2042 = new Component169();
    static int anInt2043;

    static final boolean method1197(int i, int i_0_) {
        if (i != -12081) return true;
        anInt2041++;
        if (i_0_ == 21 || i_0_ == 10 || i_0_ == 47 || i_0_ == 22 || i_0_ == 5) return true;
        return i_0_ == 49 || i_0_ == 1010;
    }

    public static void method1198(int i) {
        if (i == 1010) {
            anIntArray2039 = null;
            aClass196_2042 = null;
        }
    }

    final void method1199(byte i) {
        anInt2043++;
        if (i == -106 && GlToolkitSub2.anInt7722 < 500) {
            this.aClass318_Sub1_Sub3_2040 = null;
            this.aClass148_2038 = Component110.aClass148_231;
            Component110.aClass148_231 = this;
            GlToolkitSub2.anInt7722++;
        }
    }
}
