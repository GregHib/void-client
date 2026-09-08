/* VideoAdDisplay - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class247` (JODE-obfuscated).
 * Video advertisement display. Owns the 'showingVideoAd' state and drives ad playback surfaces for the client's video-ad integration.
 */

final class VideoAdDisplay {
    static int anInt3180;
    static Component158 aClass21_3181 = new Component158();
    static double aDouble3182;
    static CacheStore aClass45_3183;
    static int anInt3184;

    public static void method1889(int i) {
        if (i != 255) method1889(-18);
        aClass21_3181 = null;
        aClass45_3183 = null;
    }

    static final int method1890(int i, byte i_0_, int i_1_, int i_2_) {
        anInt3180++;
        int i_3_ = 88 % (-i_0_ / 55);
        if (i > 243) i_1_ >>= 4;
        else if (i <= 217) {
            if (i > 192) i_1_ >>= 2;
            else if (i > 179) i_1_ >>= 1;
        } else i_1_ >>= 3;
        return ((i >> 1) + (i_1_ >> 5 << 7) + ((0xff & i_2_) >> 2 << 10));
    }

    static final boolean method1891(int i) {
        if (i != 314376967) method1890(-22, (byte) -36, 19, 113);
        anInt3184++;
        if (Component156.aBoolean3697) {
            try {
                return !((Boolean) AppletInvoker.callAppletNoArgs((byte) 125, ToolkitFactory.anApplet1530, "showingVideoAd")).booleanValue();
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        return true;
    }
}
