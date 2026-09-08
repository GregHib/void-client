/* Component90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component90
/**
 * RENAMED from `Class149` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2044;
    static DisplayModeManagerContainer369 aClass223_2045 = new DisplayModeManagerContainer369(8, 1);
    static int anInt2046;

    public static void method1200(boolean bool) {
        aClass223_2045 = null;
        if (bool != false) anInt2046 = 37;
    }

    static final int method1201(int i, int i_0_, int i_1_, int i_2_) {
        i_2_ &= 0x3;
        anInt2044++;
        if (i_2_ == 0) return i_0_;
        if ((~i_2_) == i_1_) return i;
        if (i_2_ == 2) return -i_0_ + 4095;
        return -i + 4095;
    }
}
