/* DisplayModeInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from {@code Class57} (JODE-obfuscated).
 * Packed display mode from {@link Component248#getDisplayModes}: width×height, bit depth, refresh.
 */
final class DisplayModeInfo {
    /** Colour depth in bits (prefer ≥24). */
    int bitDepth;
    /** Mode width in pixels. */
    int width;
    static DisplayModeManagerContainer167[] aClass17Array1048 = new DisplayModeManagerContainer167[14];
    static int anInt1049;
    static ImageTagText aClass163_1050;
    static Component111 aClass251_1051 = new Component111();
    /** Vertical refresh rate in Hz (0 = any). */
    int refreshRate;
    static int anInt1053;
    /** Mode height in pixels. */
    int height;
    static Component150 aClass227_1055;

    static final void method529(int i, boolean bool) {
        anInt1053++;
        if (bool != true) method530(-105);
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i, (byte) 105, 2);
        class348_sub42_sub15.method3251(-16058);
    }

    public static void method530(int i) {
        aClass17Array1048 = null;
        aClass227_1055 = null;
        aClass163_1050 = null;
        aClass251_1051 = null;
        if (i != 14) aClass251_1051 = null;
    }

    static final int method531(byte i, DisplayModeManagerContainer88 class70) {
        int i_0_ = -45 / ((i - 54) / 43);
        anInt1049++;
        if (DisplayModeManagerContainer173.aClass70_4247 != class70) {
            if (class70 != DebugPanicSub2.aClass70_8503) {
                if (DisplayModeManagerContainer343.aClass70_8737 != class70) {
                    if (DefinitionSub39.aClass70_9485 == class70) return 34166;
                } else return 34168;
            } else return 34167;
        } else return 5890;
        throw new IllegalArgumentException();
    }

    public DisplayModeInfo() {
        /* empty */
    }
}
