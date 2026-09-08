/* Component279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component279
/**
 * RENAMED from `Class15` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static NodeCache aClass60_225 = new NodeCache(4);
    static int anInt226;
    static int anInt227;
    static int anInt228;
    static Component183 aClass114_229 = new Component183(51, 17);

    public static void method255(int i) {
        aClass60_225 = null;
        if (i != 6725) aClass60_225 = null;
        aClass114_229 = null;
    }

    static final int method256(int i, byte i_0_) {
        anInt228++;
        if (i_0_ < 61) countChar(-27, null, 'G');
        return i >>> 7;
    }

    /** Count occurrences of {@code c} in {@code string}. */
    static final int countChar(int i, String string, char c) {
        anInt227++;
        int i_1_ = 0;
        if (i != 4) aClass114_229 = null;
        int i_2_ = string.length();
        for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
            if (c == string.charAt(i_3_)) i_1_++;
        }
        return i_1_;
    }
}
