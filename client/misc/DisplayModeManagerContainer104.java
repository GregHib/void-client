/* DisplayModeManagerContainer104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class DisplayModeManagerContainer104
/**
 * RENAMED from `Class318_Sub1_Sub3_Sub4` (JODE-obfuscated).
 * Evidence: subclass of Component327 (hierarchy)
 */ extends Component327 {
    static int anInt10328;
    static int anInt10329;
    static Component103[] aClass338Array10330;
    private int anInt10331;
    private DisplayModeManagerContainer167 aClass17_10332;
    static int anInt10333;
    private int anInt10334;
    private int anInt10335 = 0;
    static DisplayModeManagerContainer57 aClass46_10336 = null;
    static int anInt10337;
    private boolean aBoolean10338;
    private int anInt10339 = 0;
    static int anInt10340;
    private RenderableSub10 aClass318_Sub10_10341;
    static int anInt10342;
    static int anInt10343;
    static int anInt10344;
    boolean aBoolean10345;
    static int anInt10346;
    static int anInt10347;
    static int anInt10348;
    int anInt10349;
    private final int anInt10350;
    static int anInt10351;
    static int anInt10352;
    static int anInt10353;
    static int anInt10354;
    private final int anInt10355;
    private int anInt10356;
    static int anInt10357;
    static int anInt10358;
    static int anInt10359;
    static int anInt10360;
    static int anInt10361;
    static int anInt10362;
    static int anInt10363;
    static int anInt10364;

    final RenderableSub4 method2386(int i, GraphicsToolkit var_ha) {
        anInt10352++;
        DisplayModeManagerContainer370 class64 = buildRenderable(var_ha, anInt10355, (anInt10334 == 0 ? 0 : 5) | 0x800, (byte) -82);
        if (class64 == null) return null;
        if (anInt10334 != 0) class64.a(anInt10334 * 2048);
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        class101.method894(this.x, this.anInt6382, this.y);
        method2467(class64, var_ha, -1, class101);
        RenderableSub4 class318_sub4 = OutputStream_Sub2.method136(i, false, false);
        if (DisplayModeManagerContainer50.aBoolean3870) class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[0]), Component72.anInt1906, 0);
        else class64.render(class101, (class318_sub4.aClass318_Sub3Array6414[0]), 0);
        if (aClass318_Sub10_10341 != null) {
            Component122 class98 = aClass318_Sub10_10341.method2525();
            if (!DisplayModeManagerContainer50.aBoolean3870) var_ha.renderModel(class98);
            else var_ha.renderModelEx(class98, Component72.anInt1906);
        }
        aBoolean10338 = class64.F();
        anInt10331 = class64.fa();
        anInt10356 = class64.ma();
        return class318_sub4;
    }

    final int method2394(boolean bool) {
        if (bool != true) return 18;
        anInt10337++;
        return anInt10331;
    }

    static final void clearSub6(RenderableSub6 class318_sub6, boolean bool) {
        if (bool != true) aClass46_10336 = null;
        class318_sub6.aClass318_Sub1_Sub3_Sub3_6431 = null;
        anInt10361++;
        if (Component6.anInt4474 < 20) {
            Component240.aClass243_1114.method1869(-89, class318_sub6);
            Component6.anInt4474++;
        }
    }

    final void method2380(GraphicsToolkit var_ha, int i, boolean bool, RenderableObject class318_sub1, int i_0_, byte i_1_, int i_2_) {
        try {
            anInt10347++;
            if (i_1_ > -106) this.aBoolean10345 = false;
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lf.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
        }
    }

    protected final void finalize() {
        anInt10329++;
        if (aClass318_Sub10_10341 != null) aClass318_Sub10_10341.method2534();
    }

    final void method2392(boolean bool) {
        anInt10343++;
        if (bool != true) aClass17_10332 = null;
        throw new IllegalStateException();
    }

    static final int generateTerrainHeight(int i, int i_3_, int i_4_) {
        anInt10351++;
        int i_5_ = (Component281.method2278(4, 91923 + i_4_, (byte) 120, i_3_ + 45365) - 128 + ((Component281.method2278(2, 37821 + i_4_, (byte) 122, 10294 + i_3_) - 128 >> 1) + (-128 + Component281.method2278(1, i_4_, (byte) 120, i_3_) >> 2)));
        i_5_ = (int) (0.3 * (double) i_5_) + 35;
        if (i_5_ >= 10) {
            if (i_5_ > 60) i_5_ = 60;
        } else i_5_ = 10;
        if (i >= -35) createFrame(36, -58, null, 49, -2, 122);
        return i_5_;
    }

    final boolean method2376(int i) {
        if (i > -12) return false;
        anInt10362++;
        return false;
    }

    static final Frame createFrame(int i, int i_6_, ReflectionInvoker class297, int i_7_, int i_8_, int i_9_) {
        anInt10344++;
        if (!class297.hasFullscreenSupport(-4)) return null;
        if (i_7_ == 0) {
            DisplayModeInfo[] class57s = Component248.getDisplayModes((byte) -49, class297);
            if (class57s == null) return null;
            boolean bool = false;
            for (int i_10_ = 0; class57s.length > i_10_; i_10_++) {
                if (i_6_ == class57s[i_10_].width && (i == class57s[i_10_].height) && (i_9_ == 0 || (class57s[i_10_].refreshRate == i_9_)) && (!bool || (class57s[i_10_].bitDepth > i_7_))) {
                    i_7_ = class57s[i_10_].bitDepth;
                    bool = true;
                }
            }
            if (!bool) return null;
        }
        Task class144 = class297.createFullscreenFrame(i_9_, i, i_7_, i_6_, (byte) -11);
        while (class144.status == 0) SpriteAtlasShader.sleep((byte) 19, 10L);
        Frame frame = (Frame) class144.result;
        if (frame == null) return null;
        if (i_8_ != 14199) return null;
        if (class144.status == 2) {
            LoadingState.startLoadingTask(frame, class297, false);
            return null;
        }
        return frame;
    }

    static final void loadStatic(byte i, int i_11_, int i_12_, int i_13_, GraphicsToolkit var_ha, int i_14_, d var_d) {
        do {
            try {
                anInt10357++;
                if (Node.anInt4290 < 100) StaticElementRenderer.method2512(var_d, var_ha, i ^ 0x74);
                var_ha.KA(i_11_, i_14_, i_12_ + i_11_, i_14_ + i_13_);
                if (Node.anInt4290 < 100) {
                    int i_15_ = 20;
                    int i_16_ = i_12_ / 2 + i_11_;
                    int i_17_ = i_14_ - -(i_13_ / 2) - 18 - i_15_;
                    var_ha.fillRect2D(i_11_, i_14_, i_12_, i_13_, -16777216, 0);
                    var_ha.fillRect3D(-152 + i_16_, i_17_, 304, 34, DefinitionSub8.aColorArray9163[CursorDefinition.anInt2884].getRGB(), 0);
                    var_ha.fillRect2D(i_16_ - 150, 2 + i_17_, Node.anInt4290 * 3, 30, Component137.aColorArray1928[CursorDefinition.anInt2884].getRGB(), 0);
                    NodeList.aClass324_3326.drawTextCentred((byte) -116, i_16_, DisplayModeManagerContainer368.aColorArray5242[CursorDefinition.anInt2884].getRGB(), FriendsIgnoreList.aClass274_3501.getLocalized(ObjectDeserializer.languageId, i + 551), -1, i_15_ + i_17_);
                } else {
                    int i_18_ = (NodeSub36.anInt6992 + -(int) ((float) i_12_ / DisplayModeManagerContainer229.aFloat1247));
                    int i_19_ = ((int) ((float) i_13_ / DisplayModeManagerContainer229.aFloat1247) + DebugOverlay.anInt3170);
                    int i_20_ = ((int) ((float) i_12_ / DisplayModeManagerContainer229.aFloat1247) + NodeSub36.anInt6992);
                    DisplayModeManagerContainer34.anInt8665 = DebugOverlay.anInt3170 + -(int) ((float) i_13_ / DisplayModeManagerContainer229.aFloat1247);
                    Component63.anInt4509 = (NodeSub36.anInt6992 + -(int) ((float) i_12_ / DisplayModeManagerContainer229.aFloat1247));
                    int i_21_ = (DebugOverlay.anInt3170 + -(int) ((float) i_13_ / DisplayModeManagerContainer229.aFloat1247));
                    Component280.anInt2446 = (int) ((float) (2 * i_13_) / DisplayModeManagerContainer229.aFloat1247);
                    Component361.anInt370 = (int) ((float) (i_12_ * 2) / DisplayModeManagerContainer229.aFloat1247);
                    DisplayModeManagerContainer229.setWorldBounds(i_18_ + DisplayModeManagerContainer229.anInt1266, i_19_ + DisplayModeManagerContainer229.anInt1263, i_20_ - -DisplayModeManagerContainer229.anInt1266, DisplayModeManagerContainer229.anInt1263 + i_21_, i_11_, i_14_, i_12_ + i_11_, i_13_ + i_14_ + 1);
                    DisplayModeManagerContainer229.computeTransform(var_ha);
                    if (i != -7) generateTerrainHeight(63, -7, -14);
                    NodeList class262 = DisplayModeManagerContainer229.getRenderList(var_ha);
                    DisplayModeManagerContainer74.method2312(-13084, 0, class262, 0, var_ha);
                    if (WaterShader.anInt7379 > 0) {
                        LoadingManager.anInt2173--;
                        if (LoadingManager.anInt2173 == 0) {
                            WaterShader.anInt7379--;
                            LoadingManager.anInt2173 = 20;
                        }
                    }
                    if (!Component10.fpsOverlayEnabled) break;
                    int i_22_ = -5 + i_11_ + i_12_;
                    int i_23_ = -8 + i_13_ + i_14_;
                    Applet_Sub1.aClass324_20.drawTextRightAligned("Fps:" + (DisplayModeManagerContainer348.fps), i_23_, 16776960, i_22_, i + -116, -1);
                    i_23_ -= 15;
                    Runtime runtime = Runtime.getRuntime();
                    int i_24_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                    int i_25_ = 16776960;
                    if (i_24_ > 65536) i_25_ = 16711680;
                    Applet_Sub1.aClass324_20.drawTextRightAligned("Mem:" + i_24_ + "k", i_23_, i_25_, i_22_, -127, -1);
                    i_23_ -= 15;
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("lf.L(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_14_ + ',' + (var_d != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    private final DisplayModeManagerContainer370 buildRenderable(GraphicsToolkit var_ha, int i, int i_26_, byte i_27_) {
        anInt10353++;
        if (i_27_ != -82) return null;
        Component63 class368 = NsnDefinition.aClass319_9245.method2543((byte) 122, i);
        s var_s = NodeSub1Sub1.aSArray8801[this.plane];
        s var_s_28_ = (this.aByte6376 < 3 ? (NodeSub1Sub1.aSArray8801[1 + this.aByte6376]) : null);
        if (!this.aBoolean10345) return class368.method3565(anInt10339, anInt10335, this.anInt6382, i_26_, true, var_ha, anInt10350, this.x, -129, RunescapeInfo.aClass87_191, var_s_28_, this.y, var_s);
        return class368.method3565(0, -1, this.anInt6382, i_26_, true, var_ha, -1, this.x, -129, RunescapeInfo.aClass87_191, var_s_28_, this.y, var_s);
    }

    final void unload(boolean bool) {
        if (bool == false) {
            if (aClass318_Sub10_10341 != null) aClass318_Sub10_10341.method2534();
            anInt10359++;
        }
    }

    final boolean method2377(byte i) {
        anInt10358++;
        if (i != 122) method2388(-40);
        return aBoolean10338;
    }

    private final void method2467(DisplayModeManagerContainer370 class64, GraphicsToolkit var_ha, int i, DisplayModeManagerContainer204 class101) {
        do {
            try {
                class64.transformVertices(class101);
                anInt10360++;
                Component30[] class129s = class64.method619();
                DisplayModeManagerContainer173[] class342s = class64.method604();
                if (i == -1) {
                    if ((aClass318_Sub10_10341 == null || (aClass318_Sub10_10341.aBoolean6470)) && (class129s != null || class342s != null)) aClass318_Sub10_10341 = RenderableSub10.method2526(OpenGlShader.clientCycle, true);
                    if (aClass318_Sub10_10341 == null) break;
                    aClass318_Sub10_10341.method2536(var_ha, OpenGlShader.clientCycle, class129s, class342s, false);
                    aClass318_Sub10_10341.method2533(this.plane, this.aShort8743, this.aShort8751, this.aShort8750, this.aShort8747);
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("lf.BA(" + (class64 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + (class101 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final int method2379(int i) {
        anInt10342++;
        if (i != -25675) anInt10334 = 73;
        return anInt10356;
    }

    final ComponentDownloader method2381(GraphicsToolkit var_ha, int i) {
        if (i != 7) method2387(null, -106);
        anInt10363++;
        return null;
    }

    final boolean method2388(int i) {
        if (i >= -65) return false;
        anInt10328++;
        return false;
    }

    final void method2387(GraphicsToolkit var_ha, int i) {
        if (i >= -125) anInt10331 = 38;
        anInt10354++;
        DisplayModeManagerContainer370 class64 = buildRenderable(var_ha, anInt10355, 0, (byte) -82);
        if (class64 != null) {
            DisplayModeManagerContainer204 class101 = var_ha.method3705();
            class101.method894(this.x, this.anInt6382, this.y);
            method2467(class64, var_ha, -1, class101);
        }
    }

    final boolean method2391(GraphicsToolkit var_ha, int i, int i_29_, int i_30_) {
        anInt10346++;
        if (i_30_ != 0) return false;
        return false;
    }

    static final void method2468(int i) {
        anInt10348++;
        if (i == 3613) {
            int i_31_ = 0;
            for (int i_32_ = 0; AbstractShaderSub4.anInt7319 > i_32_; i_32_++) {
                for (int i_33_ = 0; ParametricDefinition.anInt9109 > i_33_; i_33_++) {
                    if (AbstractShaderSub4.method3542(i_33_, Component335.aClass357ArrayArrayArray2029, i_32_, 0, i_31_, true)) i_31_++;
                    if (i_31_ >= 512) return;
                }
            }
        }
    }

    public static void method2469(boolean bool) {
        aClass46_10336 = null;
        if (bool == true) aClass338Array10330 = null;
    }

    DisplayModeManagerContainer104(int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_) {
        super(i_36_, i_37_, i_38_, i_39_, i_40_, i_41_, i_42_, i_43_, i_44_, false, (byte) 0);
        aBoolean10338 = true;
        this.aBoolean10345 = false;
        anInt10331 = 0;
        anInt10334 = 0;
        anInt10350 = -1;
        anInt10356 = 0;
        anInt10355 = i;
        anInt10334 = i_45_;
        this.anInt10349 = i_35_ + i_34_;
        Component63 class368 = NsnDefinition.aClass319_9245.method2543((byte) 57, anInt10355);
        int i_46_ = class368.anInt4503;
        if (i_46_ == -1) this.aBoolean10345 = true;
        else {
            aClass17_10332 = RunescapeInfo.aClass87_191.getSequence(i_46_, 7);
            this.aBoolean10345 = false;
        }
        if (this.anInt10349 == i_35_) DisplayModeManagerContainer260.method2178(this, anInt10335, aClass17_10332, -99);
    }

    final void method2470(int i, byte i_47_) {
        if (i_47_ <= -14) {
            anInt10333++;
            if (!this.aBoolean10345) {
                anInt10339 += i;
                while (aClass17_10332.anIntArray267[anInt10335] < anInt10339) {
                    anInt10339 -= (aClass17_10332.anIntArray267[anInt10335]);
                    anInt10335++;
                    if (aClass17_10332.anIntArray237.length <= anInt10335) {
                        this.aBoolean10345 = true;
                        break;
                    }
                }
                if (!this.aBoolean10345) DisplayModeManagerContainer260.method2178(this, anInt10335, aClass17_10332, -59);
            }
        }
    }
}
