/* DefinitionSub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub4
/**
 * RENAMED from `Class348_Sub40_Sub4` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    /** Linked list of open {@link MenuEntry} rows for the current hover. */
    static NodeList menuEntries = new NodeList();
    static int occludedCpCount;
    static d modelProvider;
    static DisplayModeManagerContainer204 aClass101_9114;
    static int anInt9115;

    final int[] getMonochromeOutput(int i, int i_0_) {
        anInt9115++;
        if (i_0_ != 255) menuEntries = null;
        int[] is = this.imageCache.getPixels(0, i);
        if (this.imageCache.cacheMiss) Component313.method1579(is, 0, DefinitionSub6.anInt9139, Component302.anIntArray6035[i]);
        return is;
    }

    public static void method3057(byte i) {
        if (i > -32) method3058(-76, 25, -12);
        aClass101_9114 = null;
        menuEntries = null;
        modelProvider = null;
    }

    public DefinitionSub4() {
        super(0, true);
    }

    static final void method3058(int i, int i_1_, int i_2_) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_1_][i_2_];
        if (class357 != null) {
            Component191.method1376(class357.aClass318_Sub1_Sub4_4406);
            Component191.method1376(class357.aClass318_Sub1_Sub4_4403);
            if (class357.aClass318_Sub1_Sub4_4406 != null) class357.aClass318_Sub1_Sub4_4406 = null;
            if (class357.aClass318_Sub1_Sub4_4403 != null) class357.aClass318_Sub1_Sub4_4403 = null;
        }
    }
}
