/* DebugOverlay - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class245` (JODE-obfuscated).
 * On-screen debug/diagnostics overlay. Draws render-stats text via GraphicsToolkit ('Total Opaque Onscreen', 'Occluders', 'Occluded', 'Occlude Calc Took'); also provides Renderable scene-graph linking (linkRenderable).
 */

final class DebugOverlay {
    private static int[] anIntArray3169 = new int[3];
    static int anInt3170;
    static int anInt3171;
    static float aFloat3172;

    public static void clear(int i) {
        if (i != 25365) anInt3170 = 100;
        anIntArray3169 = null;
    }

    static final void linkRenderable(Renderable class318, Renderable class318_0_, boolean bool) {
        try {
            anInt3171++;
            if (class318_0_.previous != null) class318_0_.unlink(false);
            class318_0_.next = class318;
            if (bool != true) anIntArray3169 = null;
            class318_0_.previous = class318.previous;
            class318_0_.previous.next = class318_0_;
            class318_0_.next.previous = class318_0_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("te.B(" + (class318 != null ? "{...}" : "null") + ',' + (class318_0_ != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    static final void drawStats() {
        int i = 10;
        int i_1_ = 30;
        if (NodeSub18.anInt6818 != 0 && Component149.debugOverlayFont != null) {
            JaclibLoader.toolkit.K(DefinitionSub10.anIntArray9183);
            for (int i_2_ = 0; i_2_ < DisplayModeManagerContainer167.anIntArray256.length; i_2_++)
                JaclibLoader.toolkit.method3660((DisplayModeManagerContainer167.anIntArray256[i_2_] + Component35.anIntArray4271[i_2_]), -256, (DefinitionSub10.anIntArray9183[3] - DefinitionSub10.anIntArray9183[1]), DefinitionSub10.anIntArray9183[1], true);
            for (int i_3_ = 0; i_3_ < HashNodeSub10.activeOccluderCount; i_3_++) {
                Component103 class338 = HashNodeSub19.aClass338Array9700[i_3_];
                JaclibLoader.toolkit.H(class338.anIntArray4187[0], class338.anIntArray4191[0], class338.anIntArray4184[0], DisplayModeManagerContainer249.anIntArray4670);
                JaclibLoader.toolkit.H(class338.anIntArray4187[1], class338.anIntArray4191[1], class338.anIntArray4184[1], Component354.anIntArray222);
                JaclibLoader.toolkit.H(class338.anIntArray4187[2], class338.anIntArray4191[2], class338.anIntArray4184[2], anIntArray3169);
                JaclibLoader.toolkit.H(class338.anIntArray4187[3], class338.anIntArray4191[3], class338.anIntArray4184[3], DisplayModeManagerContainer153.anIntArray1574);
                if (DisplayModeManagerContainer249.anIntArray4670[2] != -1 && Component354.anIntArray222[2] != -1 && anIntArray3169[2] != -1 && DisplayModeManagerContainer153.anIntArray1574[2] != -1) {
                    int i_4_ = -65536;
                    if (class338.aByte4192 == 4) i_4_ = -16776961;
                    JaclibLoader.toolkit.method3645(DisplayModeManagerContainer249.anIntArray4670[1], DisplayModeManagerContainer249.anIntArray4670[0], Component354.anIntArray222[0], -8003, i_4_, Component354.anIntArray222[1]);
                    JaclibLoader.toolkit.method3645(Component354.anIntArray222[1], Component354.anIntArray222[0], anIntArray3169[0], -8003, i_4_, anIntArray3169[1]);
                    JaclibLoader.toolkit.method3645(anIntArray3169[1], anIntArray3169[0], DisplayModeManagerContainer153.anIntArray1574[0], -8003, i_4_, DisplayModeManagerContainer153.anIntArray1574[1]);
                    JaclibLoader.toolkit.method3645(DisplayModeManagerContainer153.anIntArray1574[1], DisplayModeManagerContainer153.anIntArray1574[0], DisplayModeManagerContainer249.anIntArray4670[0], -8003, i_4_, DisplayModeManagerContainer249.anIntArray4670[1]);
                    JaclibLoader.toolkit.method3645(DisplayModeManagerContainer249.anIntArray4670[1], DisplayModeManagerContainer249.anIntArray4670[0], anIntArray3169[0], -8003, i_4_, anIntArray3169[1]);
                }
            }
            Component149.debugOverlayFont.drawText(("Dynamic: " + Component328.dynamicOnscreenCount + "/" + 5000), -256, i_1_ + 45, i, -16777216, -120);
            Component149.debugOverlayFont.drawText(("Total Opaque Onscreen: " + Component305.opaqueOnscreenCount + "/" + 10000), -256, i_1_ + 60, i, -16777216, -124);
            Component149.debugOverlayFont.drawText(("Total Trans Onscreen: " + HashNodeSub3.translucentOnscreenCount + "/" + 5000), -256, i_1_ + 75, i, -16777216, -111);
            Component149.debugOverlayFont.drawText(("Occluders: " + (RadixText.occluderCountA + Component325.occluderCountB) + " Active: " + (HashNodeSub10.activeOccluderCount)), -256, i_1_ + 90, i, -16777216, -111);
            Component149.debugOverlayFont.drawText(("Occluded: Ground:" + DisplayModeManagerContainer64.occludedGroundCount + " Walls: " + Component274.occludedWallCount + " CPs: " + DefinitionSub4.occludedCpCount + " Pixels: " + Component241.occludedPixelCount), -256, i_1_ + 105, i, -16777216, -115);
            Component149.debugOverlayFont.drawText(("Occlude Calc Took: " + (WaterShaderProgram.occludeCalcNanos / 1000L) + "us"), -256, i_1_ + 120, i, -16777216, -123);
            if (NodeSub18.anInt6818 == 2 && DisplayModeManagerContainer194.anIntArray5091 != null) {
                for (int i_5_ = 0; i_5_ < DisplayModeManagerContainer194.anIntArray5091.length; i_5_++) {
                    float f = (float) DisplayModeManagerContainer194.anIntArray5091[i_5_];
                    f /= 4194304.0F;
                    if (f > 1.0F) f = 1.0F;
                    f *= 255.0F;
                    f = 255.0F - f;
                    int i_6_ = (int) f;
                    DisplayModeManagerContainer194.anIntArray5091[i_5_] = i_6_ | i_6_ << 8 | i_6_ << 16 | ~0xffffff;
                }
                Component24 class105 = JaclibLoader.toolkit.method3662(Component314.anInt3872, DisplayModeManagerContainer194.anIntArray5091, (byte) 94, 0, Component314.anInt3872, Component328.anInt1480);
                class105.method964(i, 170, 1, 0, 0);
            }
        }
    }
}
