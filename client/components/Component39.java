/* Component39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component39
/**
 * RENAMED from `Class168` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static Component183 aClass114_2248;
    static DisplayModeManagerContainer57 aClass46_2249;
    static short aShort2250 = 205;
    static int anInt2251;
        /** World-map Helvetica glyph cache at 17pt. */
    static FontGlyphCache helveticaGlyphs17;
    static int anInt2253;
    /**
     * Developer-console purple overlay fade (0 → ~102).
     * Reset on open ({@link Component192#openDevConsole}); ramps in
     * {@link PauseTimer#processDevConsoleInput}; packed into fill alpha as {@code << 24}.
     */
    static int consoleFadeAlpha = 0;
    static Component183 aClass114_2255;
    static volatile Object anObject2256;

    public static void method1298(int i) {
        if (i != -1) aClass46_2249 = null;
        anObject2256 = null;
        aClass114_2255 = null;
        aClass46_2249 = null;
        aClass114_2248 = null;
        helveticaGlyphs17 = null;
    }

    static final boolean method1299(int i, int i_0_, int i_1_) {
        anInt2253++;
        if (i != 393216) anInt2251 = -106;
        return HashNodeSub16Sub1.hasFlag0x10(i_0_, i_1_, 102) | (i_0_ & 0x60000) != 0 || SceneNode.method2783(i_1_, (byte) -99, i_0_);
    }

    static {
        aClass114_2248 = new Component183(25, 6);
        aClass114_2255 = new Component183(99, -1);
        anObject2256 = null;
    }
}
