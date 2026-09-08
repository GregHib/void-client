/* DisplayModeManagerContainer204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DisplayModeManagerContainer204
/**
 * RENAMED from `Class101` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int[] anIntArray1593 = new int[1];
    static int anInt1594;
    static int anInt1595;
    static int anInt1596;
    static int anInt1597 = 0;
    static int anInt1598;
    static int anInt1599;

    abstract void method890(int[] is);

    abstract void method891(int i, int i_0_, int i_1_);

    public DisplayModeManagerContainer204() {
        /* empty */
    }

    abstract void method892(int i, int i_2_, int i_3_, int[] is);

    static final void method893(byte i) {
        DefinitionSub22.method3111(91, Component192.preferences.aClass239_Sub6_7226.method1743(-32350));
        anInt1595++;
        int i_4_ = ((WaterSurfaceShader.anInt6246 >> 12) - -(NodeBaseSub2.regionTileX >> 3));
        int i_5_ = ((Component330.regionTileY >> 3) + (Component317.anInt8685 >> 12));
        Component117.anInt4372 = Component72.localPlayer.plane = (byte) 0;
        Component72.localPlayer.setMovementState(8, 8, (byte) 118);
        if (i != -49) anInt1597 = 115;
        int i_6_ = 18;
        ImageCacheStore.anIntArray4031 = new int[i_6_];
        NodeSub50.aByteArrayArray7212 = new byte[i_6_][];
        Component31.anIntArrayArray5894 = new int[i_6_][4];
        ShaderSub1.anIntArray5192 = new int[i_6_];
        WorldNameText.aByteArrayArray8642 = new byte[i_6_][];
        OggStreamReader.anIntArray9042 = new int[i_6_];
        r.anIntArray9724 = new int[i_6_];
        DisplayModeManagerContainer61.anIntArray3759 = new int[i_6_];
        DisplayModeManagerContainer322.aByteArrayArray4281 = new byte[i_6_][];
        Applet_Sub1.anIntArray38 = new int[i_6_];
        OggUrlStream.aByteArrayArray8996 = new byte[i_6_][];
        Component30.aByteArrayArray1887 = new byte[i_6_][];
        i_6_ = 0;
        for (int i_7_ = (i_4_ + -(AbstractShaderSub4.anInt7319 >> 4)) / 8; (i_4_ - -(AbstractShaderSub4.anInt7319 >> 4)) / 8 >= i_7_; i_7_++) {
            for (int i_8_ = (-(ParametricDefinition.anInt9109 >> 4) + i_5_) / 8; ((i_5_ + (ParametricDefinition.anInt9109 >> 4)) / 8 >= i_8_); i_8_++) {
                int i_9_ = i_8_ + (i_7_ << 8);
                OggStreamReader.anIntArray9042[i_6_] = i_9_;
                ShaderSub1.anIntArray5192[i_6_] = SoftwareFallbackShader.aClass45_7382.getGroupId("m" + i_7_ + "_" + i_8_, i + 49);
                Applet_Sub1.anIntArray38[i_6_] = SoftwareFallbackShader.aClass45_7382.getGroupId("l" + i_7_ + "_" + i_8_, 0);
                ImageCacheStore.anIntArray4031[i_6_] = SoftwareFallbackShader.aClass45_7382.getGroupId("n" + i_7_ + "_" + i_8_, 0);
                DisplayModeManagerContainer61.anIntArray3759[i_6_] = SoftwareFallbackShader.aClass45_7382.getGroupId("um" + i_7_ + "_" + i_8_, 0);
                r.anIntArray9724[i_6_] = (SoftwareFallbackShader.aClass45_7382.getGroupId("ul" + i_7_ + "_" + i_8_, NodeSub21.bitwiseXor(i, -49)));
                if (ImageCacheStore.anIntArray4031[i_6_] == -1) {
                    ShaderSub1.anIntArray5192[i_6_] = -1;
                    Applet_Sub1.anIntArray38[i_6_] = -1;
                    DisplayModeManagerContainer61.anIntArray3759[i_6_] = -1;
                    r.anIntArray9724[i_6_] = -1;
                }
                i_6_++;
            }
        }
        for (int i_10_ = i_6_; ImageCacheStore.anIntArray4031.length > i_10_; i_10_++) {
            ImageCacheStore.anIntArray4031[i_10_] = -1;
            ShaderSub1.anIntArray5192[i_10_] = -1;
            Applet_Sub1.anIntArray38[i_10_] = -1;
            DisplayModeManagerContainer61.anIntArray3759[i_10_] = -1;
            r.anIntArray9724[i_10_] = -1;
        }
        int i_11_;
        if (Component49.clientState != 3) i_11_ = 8;
        else i_11_ = 4;
        NodeSub41.method3157(i_5_, (byte) 123, i_4_, i_11_, false);
    }

    abstract void method894(int i, int i_12_, int i_13_);

    abstract void method895(int i);

    abstract void method896(int i);

    abstract void method897(int i, int i_14_, int i_15_, int[] is);

    abstract void method898(DisplayModeManagerContainer204 class101_16_);

    abstract void method899(int i);

    abstract void method900(int i);

    static final void method901(Component24[] class105s, int i) {
        try {
            anInt1599++;
            Component175.anInt5850 = class105s.length;
            Component143.anIntArray2330 = new int[Component175.anInt5850 + 10];
            DisplayModeManagerContainer196.aClass105Array4234 = new Component24[Component175.anInt5850 + 10];
            Component313.arraycopyObjects(class105s, 0, DisplayModeManagerContainer196.aClass105Array4234, 0, Component175.anInt5850);
            for (int i_17_ = 0; Component175.anInt5850 > i_17_; i_17_++)
                Component143.anIntArray2330[i_17_] = DisplayModeManagerContainer196.aClass105Array4234[i_17_].method980();
            if (i != 515880227) anInt1597 = 49;
            for (int i_18_ = Component175.anInt5850; (i_18_ < DisplayModeManagerContainer196.aClass105Array4234.length); i_18_++)
                Component143.anIntArray2330[i_18_] = 12;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bca.RA(" + (class105s != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    abstract void method902(int i);

    abstract void method903(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_);

    static final GlRectangleTexture method904(int i, GlToolkitSub2 var_ha_Sub2, int i_24_, int i_25_, int i_26_) {
        try {
            anInt1594++;
            if (i <= 42) method906(123);
            if (var_ha_Sub2.aBoolean7793 || (Component353.method1436(82, i_25_) && Component353.method1436(81, i_26_))) return new GlRectangleTexture(var_ha_Sub2, 3553, i_24_, i_25_, i_26_);
            if (var_ha_Sub2.aBoolean7837) return new GlRectangleTexture(var_ha_Sub2, 34037, i_24_, i_25_, i_26_);
            return new GlRectangleTexture(var_ha_Sub2, i_24_, i_25_, i_26_, Component373.nextPowerOfTwo(i_25_, (byte) 108), Component373.nextPowerOfTwo(i_26_, (byte) 108));
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bca.TA(" + i + ',' + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
        }
    }

    abstract void method905(int i, int i_27_, int i_28_, int[] is);

    public static void method906(int i) {
        anIntArray1593 = null;
        if (i != -31777) method901(null, -89);
    }

    abstract DisplayModeManagerContainer204 method907();

    abstract void method908(int i);

    static final void method909(int i) {
        anInt1598++;
        if (DefinitionSub30.aBoolean9403 && i == 3553) {
            while (ScreenModeManager.anInt2834 < Component304.aClass110_Sub1Array1146.length) {
                Component362 class110_sub1 = Component304.aClass110_Sub1Array1146[ScreenModeManager.anInt2834];
                if (class110_sub1 == null || class110_sub1.anInt5788 != -1) ScreenModeManager.anInt2834++;
                else {
                    if (Component218.aClass348_Sub26_2332 == null) Component218.aClass348_Sub26_2332 = (DisplayModeManagerContainer154.aClass169_1286.enqueue(i ^ ~0x1967, class110_sub1.aString5794));
                    int i_29_ = (Component218.aClass348_Sub26_2332.anInt6887);
                    if (i_29_ == -1) break;
                    class110_sub1.anInt5788 = i_29_;
                    ScreenModeManager.anInt2834++;
                    Component218.aClass348_Sub26_2332 = null;
                }
            }
        }
    }

    abstract void method910();
}
