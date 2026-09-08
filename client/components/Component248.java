/* Component248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component248
/**
 * RENAMED from `Class19` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static Component183 aClass114_304;
    static int anInt305;
    String aString306;
    static int anInt307;
    int anInt308;
    static int anInt309;
    byte aByte310;
    static RadixParser[] aClass174Array311 = new RadixParser[16];
    String aString312;
    String aString313;
    String aString314;
    static Component183 aClass114_315;

    static final void method283(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        for (RenderableSub5 class318_sub5 = (RenderableSub5) Component241.aClass243_2957.method1872(8); class318_sub5 != null; class318_sub5 = ((RenderableSub5) Component241.aClass243_2957.method1878((byte) 0))) {
            if (class318_sub5.anInt6421 <= OpenGlShader.clientCycle) class318_sub5.unlink(false);
            else {
                RenderableSub5.method2505(i_0_ >> 1, class318_sub5.anInt6420 * 2, 0, i_5_, i_2_ >> 1, class318_sub5.anInt6418, 256 + (class318_sub5.anInt6422 << 9), i_1_, (class318_sub5.anInt6419 << 9) + 256);
                NodeList.aClass324_3326.drawTextCentred((byte) 122, i_3_ - -Component71.anIntArray6062[0], ~0xffffff | class318_sub5.anInt6415, class318_sub5.aString6416, 0, i_4_ - -Component71.anIntArray6062[1]);
            }
        }
        anInt305++;
        if (i >= -108) aClass114_304 = null;
    }

    public static void method284(byte i) {
        aClass114_315 = null;
        aClass114_304 = null;
        if (i == 51) aClass174Array311 = null;
    }

    static final DisplayModeManagerContainer369[] method285(int i) {
        anInt309++;
        if (i > -62) getDisplayModes((byte) 66, null);
        return (new DisplayModeManagerContainer369[]{Component386.aClass223_2868, Buffer.aClass223_7175, Component55.aClass223_3934, Component316.aClass223_2489, MatrixSub1.aClass223_5689, DefinitionSub21.aClass223_9274, DisplayModeManagerContainer332.aClass223_4997, RadixParser.aClass223_2307, Component90.aClass223_2045, Component38.aClass223_2507});
    }

    /** Query host display modes via {@link ReflectionInvoker#getLocalHost} result ints. */
    static final DisplayModeInfo[] getDisplayModes(byte i, ReflectionInvoker class297) {
        anInt307++;
        if (!class297.hasFullscreenSupport(-4)) return new DisplayModeInfo[0];
        int i_6_ = 52 / ((39 - i) / 61);
        Task class144 = class297.getLocalHost(972476528);
        while (class144.status == 0) SpriteAtlasShader.sleep((byte) -97, 10L);
        if (class144.status == 2) return new DisplayModeInfo[0];
        int[] is = (int[]) class144.result;
        DisplayModeInfo[] class57s = new DisplayModeInfo[is.length >> 2];
        for (int i_7_ = 0; class57s.length > i_7_; i_7_++) {
            DisplayModeInfo class57 = new DisplayModeInfo();
            class57s[i_7_] = class57;
            class57.width = is[i_7_ << 2];
            class57.height = is[1 + (i_7_ << 2)];
            class57.bitDepth = is[2 + (i_7_ << 2)];
            class57.refreshRate = is[(i_7_ << 2) + 3];
        }
        return class57s;
    }

    public Component248() {
        /* empty */
    }

    static {
        aClass114_304 = new Component183(70, -2);
        aClass114_315 = new Component183(15, 16);
    }
}
