/* DisplayModeManagerContainer310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer310
/**
 * RENAMED from `Class24` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt354;
    static NodeCache aClass60_355 = new NodeCache(260);
    static int anInt356;
    static Component327[] aClass318_Sub1_Sub3Array357;
    static byte[][] aByteArrayArray358 = new byte[1000][];
    static int anInt359;

    public static void method296(byte i) {
        if (i != -99) method298(false, 24, -128, 22, -7);
        aClass60_355 = null;
        aByteArrayArray358 = null;
        aClass318_Sub1_Sub3Array357 = null;
    }

    static final void method297(boolean bool) {
        if (bool != false) aClass60_355 = null;
        Component298.aClass60_4636.clear(0);
        anInt356++;
    }

    static final void method298(boolean bool, int i, int i_0_, int i_1_, int i_2_) {
        anInt354++;
        if (Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350) == 0) HashNodeSub3.method3177(-98, false);
        else {
            Component331.anInt1720 = Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350);
            SoftwareFallbackShader.method3553(true, (byte) 103, 0);
        }
        TheoraVideoPlayer.aBoolean1500 = bool;
        NewsFetcher.anInt4202 = i;
        Component60.anInt5909 = i_0_;
        DisplayModeManagerContainer229.selectArea(i_1_);
        if (i_2_ > -41) method297(true);
    }
}
