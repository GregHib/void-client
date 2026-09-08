/* HashNodeSub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashNodeSub3
/**
 * RENAMED from `Class348_Sub42_Sub3` (JODE-obfuscated).
 * Evidence: subclass of HashNode (hierarchy)
 */ extends HashNode {
    static boolean aBoolean9498;
    byte[] aByteArray9499;
    static int anInt9500;
    static int anInt9501;
    static short[] aShortArray9502;
    static Component183 aClass114_9503;
    static int translucentOnscreenCount;
    static int[] anIntArray9505 = new int[3];
    static int anInt9506;
    static int anInt9507;
    static int anInt9508;
    static int anInt9509;

    static final void method3174(int i, int i_0_, int i_1_, boolean bool, byte i_2_, int i_3_) {
        if (i_1_ < 1) i_1_ = 1;
        anInt9507++;
        if (i_3_ < 1) i_3_ = 1;
        int i_4_ = i_3_ - 334;
        if (i_4_ < 0) i_4_ = 0;
        else if (i_4_ > 100) i_4_ = 100;
        int adjustedZoom = ((-Component338.aShort1700 + Component39.aShort2250) * i_4_ / 100 + Component338.aShort1700);
        int base = adjustedZoom;
        if (Component233.zoomStep != 0) adjustedZoom += Component233.zoomStep;
        int min = Component338.aShort1700 * Loader.FOV_MIN_FACTOR_NUM / Loader.FOV_MIN_FACTOR_DEN;
        int max = Component39.aShort2250 * Loader.FOV_MAX_FACTOR_NUM / Loader.FOV_MAX_FACTOR_DEN;
        if (min < Loader.FOV_MIN_ABS) min = Loader.FOV_MIN_ABS;
        if (min > max) {
            int tmp = min;
            min = max;
            max = tmp;
        }
        if (adjustedZoom < min) adjustedZoom = min;
        else if (adjustedZoom > max) adjustedZoom = max;
        if (Component233.zoomStep != 0) Component233.zoomStep = adjustedZoom - base;
        if (adjustedZoom < CacheNode.aShort9555) adjustedZoom = CacheNode.aShort9555;
        else if (Component377.aShort851 < adjustedZoom) adjustedZoom = Component377.aShort851;
        int i_6_ = 512 * adjustedZoom * i_3_ / (i_1_ * 334);
        if (i_6_ >= WaterShaderSub8.aShort7355) {
            if (i_6_ > Component382.aShort2269) {
                i_6_ = Component382.aShort2269;
                adjustedZoom = i_1_ * i_6_ * 334 / (i_3_ * 512);
                if (adjustedZoom < CacheNode.aShort9555) {
                    adjustedZoom = CacheNode.aShort9555;
                    int i_7_ = i_6_ * (i_1_ * 334) / (adjustedZoom * 512);
                    int i_8_ = (-i_7_ + i_3_) / 2;
                    if (bool) {
                        NodeSub8.toolkit.la();
                        NodeSub8.toolkit.method3675(i_1_, (byte) -125, i, i_0_, i_8_, -16777216);
                        NodeSub8.toolkit.method3675(i_1_, (byte) -125, i, i_3_ + i_0_ - i_8_, i_8_, -16777216);
                    }
                    i_0_ += i_8_;
                    i_3_ -= 2 * i_8_;
                }
            }
        } else {
            i_6_ = WaterShaderSub8.aShort7355;
            adjustedZoom = i_6_ * (i_1_ * 334) / (i_3_ * 512);
            if (Component377.aShort851 < adjustedZoom) {
                adjustedZoom = Component377.aShort851;
                int i_9_ = adjustedZoom * i_3_ * 512 / (334 * i_6_);
                int i_10_ = (i_1_ + -i_9_) / 2;
                if (bool) {
                    NodeSub8.toolkit.la();
                    NodeSub8.toolkit.method3675(i_10_, (byte) -125, i, i_0_, i_3_, -16777216);
                    NodeSub8.toolkit.method3675(i_10_, (byte) -125, -i_10_ + i + i_1_, i_0_, i_3_, -16777216);
                }
                i += i_10_;
                i_1_ -= i_10_ * 2;
            }
        }
        Component263.anInt1550 = i_3_ * adjustedZoom / 334;
        RandomAccessFileReader.anInt3047 = i_0_;
        Component333.anInt3643 = (short) i_3_;
        Component296.anInt4656 = (short) i_1_;
        DisplayModeManagerContainer61.anInt3764 = i;
        int i_11_ = -3 % ((-8 - i_2_) / 56);
    }

    static final void method3175(byte i) {
        if (!CacheNode.method3196(Component49.clientState, -114) && !CacheFileStore.isReconnectState(Component49.clientState, -103)) {
            int i_12_ = ((Component72.localPlayer.anIntArray10320[0]) >> 3);
            int i_13_ = ((Component72.localPlayer.anIntArray10317[0]) >> 3);
            if (i_12_ < 0 || AbstractShaderSub4.anInt7319 >> 3 <= i_12_ || i_13_ < 0 || (ParametricDefinition.anInt9109 >> 3 <= i_13_)) KeyFocusHandler.setClientVarp(0, AbstractShaderSub4.anInt7319 >> 4, (ParametricDefinition.anInt9109 >> 4), (byte) -13);
            else KeyFocusHandler.setClientVarp(5000, i_12_, i_13_, (byte) -13);
        } else KeyFocusHandler.setClientVarp(5000, WaterSurfaceShader.anInt6246 >> 12, Component317.anInt8685 >> 12, (byte) -13);
        anInt9509++;
        DefinitionSub32.method3134(-1);
        Component179.method2988(true);
        int i_14_ = -8 % ((-30 - i) / 38);
        DefinitionSub30.method3126((byte) 98);
        DisplayModeManagerContainer273.method1131(117);
    }

    HashNodeSub3(byte[] is) {
        this.aByteArray9499 = is;
    }

    public static void method3176(boolean bool) {
        anIntArray9505 = null;
        aShortArray9502 = null;
        if (bool != true) aShortArray9502 = null;
        aClass114_9503 = null;
    }

    static final void method3177(int i, boolean bool) {
        if (!bool || DisplayModeManagerContainer229.aClass348_Sub42_Sub14_1243 == null) Component266.anInt5976 = -1;
        else Component266.anInt5976 = (DisplayModeManagerContainer229.aClass348_Sub42_Sub14_1243.anInt9628);
        anInt9500++;
        DisplayModeManagerContainer229.aClass348_Sub42_Sub14_1243 = null;
        Component39.aClass46_2249 = null;
        Node.anInt4290 = 0;
        Component156.aClass262_3705 = null;
        DisplayModeManagerContainer229.clearBuffers();
        DisplayModeManagerContainer229.aClass262_1254.clear(127);
        DebugPanic.helveticaGlyphs22 = null;
        Component39.helveticaGlyphs17 = null;
        VideoAdPlayer.aClass105_4643 = null;
        Component15.helveticaGlyphs11 = null;
        Component218.helveticaGlyphs19 = null;
        NodeSub3.helveticaGlyphs26 = null;
        DisplayModeManagerContainer271.helveticaGlyphs14 = null;
        DisplayModeManagerContainer229.aClass252_1246 = null;
        WorldNameText.helveticaGlyphs12 = null;
        Component377.anInt859 = -1;
        if (i <= -44) {
            ModelStore.anInt4609 = -1;
            Component49.helveticaGlyphs30 = null;
            if (DisplayModeManagerContainer229.aClass153_1238 != null) {
                DisplayModeManagerContainer229.aClass153_1238.method1219(7851);
                DisplayModeManagerContainer229.aClass153_1238.method1220((byte) -100, 64, 128);
            }
            if (DisplayModeManagerContainer229.aClass141_1242 != null) DisplayModeManagerContainer229.aClass141_1242.method1178(64, 1, 64);
            if (DisplayModeManagerContainer229.aClass263_1245 != null) DisplayModeManagerContainer229.aClass263_1245.method2014(64, true);
            Component267.aClass194_2981.method1444(64, -124);
        }
    }

    static final void method3178(CacheStore class45, int i, int[] is, CacheStore class45_15_) {
        try {
            anInt9506++;
            if (is != null) NodeSub1.anIntArray6547 = is;
            s.aClass45_4585 = class45;
            if (i >= -6) method3177(-36, true);
            DisplayModeManagerContainer271.aClass45_518 = class45_15_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lk.F(" + (class45 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + (class45_15_ != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method3179(int i) {
        Component223.method175((byte) -50);
        anInt9508++;
        int i_16_ = Component192.preferences.aClass239_Sub3_7222.method1727(-32350);
        do {
            if (i_16_ == 2) {
                Component221.method1083(NodeSub8.toolkit, 100, (byte) 9, PacketReader.canvasHeight, 100, Component236.canvasWidth);
                break;
            } else if (i_16_ != 3) break;
            DisplayModeManagerContainer220.method282(2, NodeSub8.toolkit, Component236.canvasWidth, (byte) 73, CacheStore.anInt666, Component134.anInt5812, PacketReader.canvasHeight, 2);
        } while (false);
        if (Component192.preferences.aClass239_Sub3_7222.method1735(false)) s.method3980(i + 93, DisplayModeManagerContainer50.gameCanvas);
        if (NodeSub8.toolkit != null) Component200.method2196((byte) -9);
        DisplayModeManagerContainer50.aBoolean3870 = i != Component192.preferences.aClass239_Sub3_7222.method1727(-32350);
        Component210.gameCanvasAttached = Component192.preferences.aClass239_Sub3_7222.method1735(false);
    }

    static {
        anInt9501 = 0;
        aShortArray9502 = new short[256];
        aClass114_9503 = new Component183(9, -1);
    }
}
