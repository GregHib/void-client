/* DisplayModeManagerContainer190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class DisplayModeManagerContainer190
/**
 * RENAMED from `Class64_Sub2` (JODE-obfuscated).
 * Evidence: subclass of DisplayModeManagerContainer370 (hierarchy)
 */ extends DisplayModeManagerContainer370 {
    private int anInt5401;
    private boolean aBoolean5402 = true;
    static int anInt5403;
    private int[] anIntArray5404;
    static int anInt5405;
    private int anInt5406;
    static int anInt5407;
    static int anInt5408;
    static int anInt5409;
    static int anInt5410;
    static int anInt5411;
    private int[][] anIntArrayArray5412;
    private int[][] anIntArrayArray5413;
    static int anInt5414;
    private int[] anIntArray5415;
    private short[] aShortArray5416;
    static int anInt5417;
    private int anInt5418;
    private final GlToolkitSub3 aHa_Sub3_5419;
    static String aString5420;
    static int anInt5421;
    static int anInt5422;
    private short[] aShortArray5423;
    private Component200 aClass290_5424;
    static int anInt5425;
    static int anInt5426;
    private short aShort5427;
    private boolean aBoolean5428;
    private int[] vertexZ;
    static int anInt5430;
    static int anInt5431;
    private short[] aShortArray5432;
    private int anInt5433 = 0;
    static int anInt5434;
    static int anInt5435;
    private short[] aShortArray5436;
    static int anInt5437;
    private short[] aShortArray5438;
    private short[] aShortArray5439;
    static int anInt5440;
    static int anInt5441;
    private NativeLibLoader[] aClass334Array5442;
    private int anInt5443;
    static int anInt5444;
    static int anInt5445;
    static int anInt5446;
    static int anInt5447;
    static int anInt5448;
    static int anInt5449;
    static int anInt5450;
    static int anInt5451;
    private short aShort5452;
    static int anInt5453;
    static int anInt5454;
    private int[] anIntArray5455;
    static int anInt5456;
    private Component30[] aClass129Array5457;
    static int anInt5458;
    static int anInt5459;
    private Component200 aClass290_5460;
    private int anInt5461;
    private boolean aBoolean5462;
    private int anInt5463;
    static int anInt5464;
    static int anInt5465;
    static int anInt5466;
    private int anInt5467;
    static int anInt5468;
    static int anInt5469;
    private short[] aShortArray5470;
    static int anInt5471;
    private int anInt5472;
    private int[] anIntArray5473;
    private DisplayModeManagerContainer173[] aClass342Array5474;
    private int anInt5475;
    private float[] aFloatArray5476;
    private boolean aBoolean5477;
    private int anInt5478;
    static int anInt5479;
    static int anInt5480;
    static int anInt5481;
    private Component200 aClass290_5482;
    static int anInt5483;
    static int anInt5484;
    private Component353 aClass192_5485;
    private short[] aShortArray5486;
    static int anInt5487;
    static int anInt5488;
    static int anInt5489;
    static int anInt5490;
    static int anInt5491;
    private int[][] anIntArrayArray5492;
    private short[] aShortArray5493;
    private short[] aShortArray5494;
    private short[] aShortArray5495;
    static int anInt5496;
    private int anInt5497;
    static int anInt5498;
    private byte[] aByteArray5499;
    static int anInt5500;
    static int anInt5501;
    private boolean aBoolean5502;
    private DisplayModeManagerContainer346 aClass151_5503;
    static int anInt5504;
    static int anInt5505;
    private float[] aFloatArray5506;
    private int anInt5507;
    private short[] aShortArray5508;
    private int anInt5509;
    private int anInt5510;
    private int[] vertexX;
    private short[] aShortArray5512;
    static int anInt5513;
    static int anInt5514;
    private byte[] aByteArray5515;
    private int anInt5516;
    static int anInt5517;
    static int anInt5518;
    private int[] vertexY;
    private Component200 aClass290_5520;
    static int anInt5521;
    static int anInt5522;
    static int anInt5523;
    private Component45[] aClass353Array5524;
    static int anInt5525;
    static int anInt5526;

    private final void renderParticles(int i) {
        if (aClass353Array5524 != null) {
            aHa_Sub3_5419.C(!aBoolean5428);
            aHa_Sub3_5419.getFramebufferParameter(false, true);
            aHa_Sub3_5419.setTextureCombineMode((byte) 47, 1, DefinitionSub39.aClass70_9485);
            aHa_Sub3_5419.setTextureEnvironment(1, true, DefinitionSub39.aClass70_9485);
            for (int i_0_ = 0; anInt5406 > i_0_; i_0_++) {
                Component45 class353 = aClass353Array5524[i_0_];
                NativeLibLoader class334 = aClass334Array5442[i_0_];
                if (!class353.aBoolean4350 || !aHa_Sub3_5419.method3666()) {
                    float f = (0.3333333F * (float) ((vertexX[class353.anInt4349]) - -(vertexX[class353.anInt4344]) + (vertexX[class353.anInt4339])));
                    float f_1_ = (0.3333333F * (float) ((vertexY[class353.anInt4344]) + (vertexY[class353.anInt4349]) + (vertexY[class353.anInt4339])));
                    float f_2_ = (0.3333333F * (float) ((vertexZ[class353.anInt4339]) + (vertexZ[class353.anInt4344]) + (vertexZ[class353.anInt4349])));
                    float f_3_ = (f_2_ * HashNodeSub4.aFloat9516 + (JagTheoraDecoder.aFloat1010 * f + f_1_ * Component252.aFloat10199) + Component35.aFloat4268);
                    float f_4_ = (NodeSub12.aFloat6752 + (RenderableSub6.aFloat6430 * f_2_ + (NodeSub20.aFloat6835 * f + f_1_ * Component200.aFloat3710)));
                    float f_5_ = Component49.aFloat4673 + (Component45.aFloat4338 * f_1_ + f * ShaderCompilerSub3.aFloat6523 + f_2_ * GraphicsToolkit.aFloat4582);
                    float f_6_ = ((float) (1.0 / Math.sqrt(f_5_ * f_5_ + (f_4_ * f_4_ + f_3_ * f_3_))) * (float) class353.anInt4347);
                    MatrixSub2 class101_sub2 = aHa_Sub3_5419.getClipboard(-96);
                    class101_sub2.method936(class334.anInt4151, 0, (class353.aShort4340 * class334.anInt4162) >> 7, (-(f_3_ * f_6_) + ((float) class334.anInt4158 + f_3_)), -(f_6_ * f_5_) + f_5_, ((float) class334.anInt4154 + f_4_ - f_4_ * f_6_), (class334.anInt4165 * class353.aShort4341) >> 7);
                    class101_sub2.method917((aHa_Sub3_5419.aClass101_Sub2_8082), (byte) 112);
                    aHa_Sub3_5419.setDrawable(0);
                    int i_7_ = class334.anInt4156;
                    aHa_Sub3_5419.disableShader(false, false, class353.aShort4348, (byte) 108);
                    aHa_Sub3_5419.linkProgram(92, class353.aByte4343);
                    aHa_Sub3_5419.uniformMatrix4fv(-28186, i_7_);
                    aHa_Sub3_5419.warpPointer(-114);
                }
            }
            aHa_Sub3_5419.setTextureEnvironment(1, true, DisplayModeManagerContainer343.aClass70_8737);
            aHa_Sub3_5419.setTextureCombineMode((byte) 47, 1, DisplayModeManagerContainer343.aClass70_8737);
            aHa_Sub3_5419.C(true);
        }
        if (i < 70) ia((short) 112, (short) 86);
        anInt5454++;
    }

    private final boolean checkVisibility(int i) {
        anInt5440++;
        boolean bool = !aClass290_5482.aBoolean3714;
        boolean bool_8_ = ((anInt5472 & 0x37) != 0 && !aClass290_5424.aBoolean3714);
        boolean bool_9_ = !aClass290_5520.aBoolean3714;
        boolean bool_10_ = !aClass290_5460.aBoolean3714;
        if (!bool_9_ && !bool && !bool_8_ && !bool_10_) return true;
        boolean bool_11_ = true;
        if (bool_9_) {
            if (aClass290_5520.anInterface5_Impl1_3708 == null) aClass290_5520.anInterface5_Impl1_3708 = aHa_Sub3_5419.uniform4f(aBoolean5462, 16711680);
            Interface5_Impl1 interface5_impl1 = aClass290_5520.anInterface5_Impl1_3708;
            interface5_impl1.method20(12 * anInt5475, (byte) 125, 12);
            Buffer buffer = interface5_impl1.method19(true, 26775);
            if (buffer != null) {
                aHa_Sub3_5419.aNativeInterface7924.copyPositions(vertexX, vertexY, vertexZ, aShortArray5470, 0, 12, anInt5475, buffer.getAddress());
                if (interface5_impl1.method18(6331)) {
                    aClass290_5520.anInterface5_Impl1_3711 = interface5_impl1;
                    aClass290_5520.aBoolean3714 = true;
                } else bool_11_ = false;
            } else bool_11_ = false;
        }
        if (bool) {
            if (aClass290_5482.anInterface5_Impl1_3708 == null) aClass290_5482.anInterface5_Impl1_3708 = aHa_Sub3_5419.uniform4f(aBoolean5462, 16711680);
            Interface5_Impl1 interface5_impl1 = aClass290_5482.anInterface5_Impl1_3708;
            interface5_impl1.method20(4 * anInt5475, (byte) 125, 4);
            Buffer buffer = interface5_impl1.method19(true, 26775);
            if (buffer == null) bool_11_ = false;
            else {
                if ((anInt5472 & 0x37) == 0) {
                    short[] is;
                    short[] is_12_;
                    byte[] is_13_;
                    short[] is_14_;
                    if (aClass151_5503 == null) {
                        is_13_ = aByteArray5499;
                        is = aShortArray5436;
                        is_14_ = aShortArray5493;
                        is_12_ = aShortArray5438;
                    } else {
                        is = aClass151_5503.aShortArray2058;
                        is_12_ = aClass151_5503.aShortArray2060;
                        is_13_ = aClass151_5503.aByteArray2069;
                        is_14_ = aClass151_5503.aShortArray2067;
                    }
                    aHa_Sub3_5419.aNativeInterface7924.copyLighting(aShortArray5486, aByteArray5515, aShortArray5423, is_14_, is_12_, is, is_13_, aShort5452, aShort5427, aShortArray5416, 0, 4, anInt5475, buffer.getAddress());
                } else aHa_Sub3_5419.aNativeInterface7924.copyColours(aShortArray5486, aByteArray5515, aShortArray5423, aShort5452, aShortArray5416, 0, 4, anInt5475, buffer.getAddress());
                if (interface5_impl1.method18(6331)) {
                    aClass290_5482.aBoolean3714 = true;
                    aClass290_5482.anInterface5_Impl1_3711 = interface5_impl1;
                } else bool_11_ = false;
            }
        }
        if (bool_8_) {
            if (aClass290_5424.anInterface5_Impl1_3708 == null) aClass290_5424.anInterface5_Impl1_3708 = aHa_Sub3_5419.uniform4f(aBoolean5462, 16711680);
            Interface5_Impl1 interface5_impl1 = aClass290_5424.anInterface5_Impl1_3708;
            interface5_impl1.method20(anInt5475 * 12, (byte) 125, 12);
            Buffer buffer = interface5_impl1.method19(true, 26775);
            if (buffer == null) bool_11_ = false;
            else {
                short[] is;
                short[] is_15_;
                byte[] is_16_;
                short[] is_17_;
                if (aClass151_5503 == null) {
                    is = aShortArray5436;
                    is_15_ = aShortArray5493;
                    is_16_ = aByteArray5499;
                    is_17_ = aShortArray5438;
                } else {
                    is_16_ = aClass151_5503.aByteArray2069;
                    is = aClass151_5503.aShortArray2058;
                    is_15_ = aClass151_5503.aShortArray2067;
                    is_17_ = aClass151_5503.aShortArray2060;
                }
                aHa_Sub3_5419.aNativeInterface7924.copyNormals(is_15_, is_17_, is, is_16_, 3.0F / (float) aShort5427, 3.0F / (float) (aShort5427 + aShort5427 / 2), 0, 12, anInt5475, buffer.getAddress());
                if (interface5_impl1.method18(6331)) {
                    aClass290_5424.aBoolean3714 = true;
                    aClass290_5424.anInterface5_Impl1_3711 = interface5_impl1;
                } else bool_11_ = false;
            }
        }
        if (bool_10_) {
            if (aClass290_5460.anInterface5_Impl1_3708 == null) aClass290_5460.anInterface5_Impl1_3708 = aHa_Sub3_5419.uniform4f(aBoolean5462, 16711680);
            Interface5_Impl1 interface5_impl1 = aClass290_5460.anInterface5_Impl1_3708;
            interface5_impl1.method20(anInt5475 * 8, (byte) 126, 8);
            Buffer buffer = interface5_impl1.method19(true, 26775);
            if (buffer != null) {
                aHa_Sub3_5419.aNativeInterface7924.copyTexCoords(aFloatArray5476, aFloatArray5506, 0, 8, anInt5475, buffer.getAddress());
                if (interface5_impl1.method18(6331)) {
                    aClass290_5460.anInterface5_Impl1_3711 = interface5_impl1;
                    aClass290_5460.aBoolean3714 = true;
                } else bool_11_ = false;
            } else bool_11_ = false;
        }
        if (i >= -70) isInFrustumExt(-91, -89, null, false, 4, -45);
        return bool_11_;
    }

    final int ShaderImpl() {
        anInt5523++;
        if (!aBoolean5477) computeBoundingBox(0);
        return anInt5510;
    }

    final boolean NA() {
        anInt5430++;
        if (anIntArrayArray5413 == null) return false;
        for (int i = 0; anInt5497 > i; i++) {
            vertexX[i] <<= 4;
            vertexY[i] <<= 4;
            vertexZ[i] <<= 4;
        }
        Component257.anInt4795 = 0;
        InputHandler.anInt4274 = 0;
        AssetCacheLoader.anInt386 = 0;
        return true;
    }

    final void acquireRenderLock() {
        anInt5456++;
    }

    final DisplayModeManagerContainer173[] method604() {
        anInt5449++;
        return aClass342Array5474;
    }

    final void LA(int i) {
        aShort5427 = (short) i;
        anInt5431++;
        setVisible(0);
        updateState((byte) 65);
    }

    static final void resetNodeStates(byte i) {
        anInt5466++;
        for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.first(-93)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.next((byte) 46))) {
            if (class348_sub42_sub13.anInt9615 > 1) {
                class348_sub42_sub13.anInt9615 = 0;
                Component293.aClass60_3301.putOne(class348_sub42_sub13, ((MenuEntry) class348_sub42_sub13.aClass107_9621.sentinel.next).groupKey, (byte) -124);
                class348_sub42_sub13.aClass107_9621.clear(2110355138);
            }
        }
        DisplayModeManagerContainer345.anInt166 = 0;
        if (i < 92) resetNodeStates((byte) 114);
        DisplayModeManagerContainer306.menuEntryCount = 0;
        DefinitionSub4.menuEntries.clear(115);
        MenuEntry.aClass356_9603.clear(0);
        Component237.aClass107_3022.clear(2110355138);
        GlToolkitSub2.appendMenuEntry((byte) 6, ImageDefinition.aMenuEntry_9144);
    }

    final void VA(int i) {
        anInt5479++;
        int i_18_ = DisplayModeManagerContainer88.anIntArray1207[i];
        int i_19_ = DisplayModeManagerContainer88.anIntArray1204[i];
        for (int i_20_ = 0; anInt5433 > i_20_; i_20_++) {
            int i_21_ = ((vertexX[i_20_] * i_19_ + i_18_ * vertexY[i_20_]) >> 14);
            vertexY[i_20_] = (i_19_ * vertexY[i_20_] + -(i_18_ * vertexX[i_20_]) >> 14);
            vertexX[i_20_] = i_21_;
        }
        setVisible(0);
        aBoolean5477 = false;
    }

    final boolean isInFrustumExtended(int i, int i_22_, DisplayModeManagerContainer204 class101, boolean bool, int i_23_) {
        try {
            anInt5414++;
            return isInFrustum2(i, i_23_, -1, 127, i_22_, bool, class101);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.MA(" + i + ',' + i_22_ + ',' + (class101 != null ? "{...}" : "null") + ',' + bool + ',' + i_23_ + ')'));
        }
    }

    final r BufferedToolkit(r var_r) {
        try {
            anInt5513++;
            if (anInt5475 == 0) return null;
            if (!aBoolean5477) computeBoundingBox(0);
            int i;
            int i_24_;
            if (aHa_Sub3_5419.anInt8133 <= 0) {
                i = (-(anInt5461 * aHa_Sub3_5419.anInt8133 >> 8) + anInt5507 >> aHa_Sub3_5419.anInt8107);
                i_24_ = ((anInt5467 - (aHa_Sub3_5419.anInt8133 * anInt5509 >> 8)) >> aHa_Sub3_5419.anInt8107);
            } else {
                i = (-(anInt5509 * aHa_Sub3_5419.anInt8133 >> 8) + anInt5507 >> aHa_Sub3_5419.anInt8107);
                i_24_ = ((anInt5467 - (anInt5461 * aHa_Sub3_5419.anInt8133 >> 8)) >> aHa_Sub3_5419.anInt8107);
            }
            int i_25_;
            int i_26_;
            if (aHa_Sub3_5419.anInt8114 > 0) {
                i_25_ = ((anInt5418 - (anInt5509 * aHa_Sub3_5419.anInt8114 >> 8)) >> aHa_Sub3_5419.anInt8107);
                i_26_ = (-(anInt5461 * aHa_Sub3_5419.anInt8114 >> 8) + anInt5443 >> aHa_Sub3_5419.anInt8107);
            } else {
                i_25_ = ((anInt5418 - (anInt5461 * aHa_Sub3_5419.anInt8114 >> 8)) >> aHa_Sub3_5419.anInt8107);
                i_26_ = ((anInt5443 + -(anInt5509 * aHa_Sub3_5419.anInt8114 >> 8)) >> aHa_Sub3_5419.anInt8107);
            }
            int i_27_ = 1 + (i_24_ - i);
            int i_28_ = 1 + -i_25_ + i_26_;
            CacheNodeSub1 var_r_Sub1 = (CacheNodeSub1) var_r;
            CacheNodeSub1 var_r_Sub1_29_;
            if (var_r_Sub1 == null || !var_r_Sub1.method3291(i_27_, i_28_, (byte) -59)) var_r_Sub1_29_ = new CacheNodeSub1(aHa_Sub3_5419, i_27_, i_28_);
            else {
                var_r_Sub1_29_ = var_r_Sub1;
                var_r_Sub1_29_.method3289(108);
            }
            var_r_Sub1_29_.method3286(i_24_, -98, i_26_, i_25_, i);
            allocateBuffers(41, var_r_Sub1_29_);
            return var_r_Sub1_29_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "nca.ba(" + (var_r != null ? "{...}" : "null") + ')');
        }
    }

    final void Interface4Impl() {
        anInt5484++;
        for (int i = 0; anInt5497 > i; i++) {
            vertexX[i] = vertexX[i] + 7 >> 4;
            vertexY[i] = 7 + vertexY[i] >> 4;
            vertexZ[i] = 7 + vertexZ[i] >> 4;
        }
        setVisible(0);
        aBoolean5477 = false;
    }

    final int EA() {
        anInt5408++;
        if (!aBoolean5477) computeBoundingBox(0);
        return anInt5509;
    }

    private final boolean isInFrustum2(int i, int i_30_, int i_31_, int i_32_, int i_33_, boolean bool, DisplayModeManagerContainer204 class101) {
        try {
            anInt5450++;
            MatrixSub2 class101_sub2 = (MatrixSub2) class101;
            MatrixSub2 class101_sub2_34_ = aHa_Sub3_5419.aClass101_Sub2_8080;
            float f = (class101_sub2_34_.aFloat5729 + ((class101_sub2_34_.aFloat5711 * class101_sub2.aFloat5729) + (class101_sub2_34_.aFloat5700 * class101_sub2.aFloat5710) + (class101_sub2_34_.aFloat5704 * class101_sub2.aFloat5724)));
            float f_35_ = ((class101_sub2_34_.aFloat5732 * class101_sub2.aFloat5724) + ((class101_sub2.aFloat5710 * class101_sub2_34_.aFloat5722) + (class101_sub2.aFloat5729 * class101_sub2_34_.aFloat5708)) + class101_sub2_34_.aFloat5710);
            HashNodeSub4.aFloat9516 = ((class101_sub2_34_.aFloat5704 * class101_sub2.aFloat5716) + ((class101_sub2.aFloat5704 * class101_sub2_34_.aFloat5711) + (class101_sub2.aFloat5732 * class101_sub2_34_.aFloat5700)));
            ShaderCompilerSub3.aFloat6523 = ((class101_sub2.aFloat5736 * class101_sub2_34_.aFloat5716) + ((class101_sub2_34_.aFloat5691 * class101_sub2.aFloat5708) + (class101_sub2.aFloat5711 * class101_sub2_34_.aFloat5736)));
            Component200.aFloat3710 = ((class101_sub2.aFloat5722 * class101_sub2_34_.aFloat5722) + (class101_sub2_34_.aFloat5708 * class101_sub2.aFloat5700) + (class101_sub2_34_.aFloat5732 * class101_sub2.aFloat5691));
            GraphicsToolkit.aFloat4582 = ((class101_sub2.aFloat5704 * class101_sub2_34_.aFloat5736) + (class101_sub2_34_.aFloat5691 * class101_sub2.aFloat5732) + (class101_sub2.aFloat5716 * class101_sub2_34_.aFloat5716));
            Component252.aFloat10199 = ((class101_sub2.aFloat5691 * class101_sub2_34_.aFloat5704) + ((class101_sub2_34_.aFloat5711 * class101_sub2.aFloat5700) + (class101_sub2_34_.aFloat5700 * class101_sub2.aFloat5722)));
            NodeSub20.aFloat6835 = ((class101_sub2_34_.aFloat5732 * class101_sub2.aFloat5736) + ((class101_sub2.aFloat5711 * class101_sub2_34_.aFloat5708) + (class101_sub2.aFloat5708 * class101_sub2_34_.aFloat5722)));
            JagTheoraDecoder.aFloat1010 = ((class101_sub2_34_.aFloat5704 * class101_sub2.aFloat5736) + ((class101_sub2_34_.aFloat5700 * class101_sub2.aFloat5708) + (class101_sub2.aFloat5711 * class101_sub2_34_.aFloat5711)));
            float f_36_ = (class101_sub2_34_.aFloat5724 + ((class101_sub2_34_.aFloat5716 * class101_sub2.aFloat5724) + ((class101_sub2_34_.aFloat5736 * class101_sub2.aFloat5729) + (class101_sub2.aFloat5710 * (class101_sub2_34_.aFloat5691)))));
            RenderableSub6.aFloat6430 = ((class101_sub2_34_.aFloat5722 * class101_sub2.aFloat5732) + (class101_sub2.aFloat5704 * class101_sub2_34_.aFloat5708) + (class101_sub2.aFloat5716 * class101_sub2_34_.aFloat5732));
            Component45.aFloat4338 = ((class101_sub2_34_.aFloat5691 * class101_sub2.aFloat5722) + (class101_sub2.aFloat5700 * class101_sub2_34_.aFloat5736) + (class101_sub2.aFloat5691 * class101_sub2_34_.aFloat5716));
            boolean bool_37_ = false;
            float f_38_ = 3.4028235E38F;
            float f_39_ = -3.4028235E38F;
            float f_40_ = 3.4028235E38F;
            float f_41_ = -3.4028235E38F;
            int i_42_ = aHa_Sub3_5419.anInt8129;
            int i_43_ = aHa_Sub3_5419.anInt8134;
            if (!aBoolean5477) computeBoundingBox(0);
            int i_44_ = -anInt5507 + anInt5467 >> 1;
            int i_45_ = anInt5509 + -anInt5461 >> 1;
            if (i_32_ <= 121) O(86, -105, 66);
            int i_46_ = -anInt5418 + anInt5443 >> 1;
            int i_47_ = i_44_ + anInt5507;
            int i_48_ = i_45_ + anInt5461;
            int i_49_ = i_46_ + anInt5418;
            int i_50_ = i_47_ - (i_44_ << i_30_);
            int i_51_ = i_48_ - (i_45_ << i_30_);
            int i_52_ = -(i_46_ << i_30_) + i_49_;
            int i_53_ = (i_44_ << i_30_) + i_47_;
            int i_54_ = i_48_ + (i_45_ << i_30_);
            BufferCacheSub2.anIntArray8269[0] = i_50_;
            int i_55_ = (i_46_ << i_30_) + i_49_;
            MenuEntry.anIntArray9612[0] = i_51_;
            BufferCacheSub2.anIntArray8269[1] = i_53_;
            Component126.anIntArray4463[0] = i_52_;
            MenuEntry.anIntArray9612[1] = i_51_;
            Component126.anIntArray4463[1] = i_52_;
            BufferCacheSub2.anIntArray8269[2] = i_50_;
            MenuEntry.anIntArray9612[2] = i_54_;
            Component126.anIntArray4463[2] = i_52_;
            BufferCacheSub2.anIntArray8269[3] = i_53_;
            MenuEntry.anIntArray9612[3] = i_54_;
            Component126.anIntArray4463[3] = i_52_;
            BufferCacheSub2.anIntArray8269[4] = i_50_;
            MenuEntry.anIntArray9612[4] = i_51_;
            Component126.anIntArray4463[4] = i_55_;
            BufferCacheSub2.anIntArray8269[5] = i_53_;
            MenuEntry.anIntArray9612[5] = i_51_;
            Component126.anIntArray4463[5] = i_55_;
            BufferCacheSub2.anIntArray8269[6] = i_50_;
            MenuEntry.anIntArray9612[6] = i_54_;
            BufferCacheSub2.anIntArray8269[7] = i_53_;
            Component126.anIntArray4463[6] = i_55_;
            MenuEntry.anIntArray9612[7] = i_54_;
            Component126.anIntArray4463[7] = i_55_;
            for (int i_56_ = 0; i_56_ < 8; i_56_++) {
                float f_57_ = (float) BufferCacheSub2.anIntArray8269[i_56_];
                float f_58_ = (float) Component126.anIntArray4463[i_56_];
                float f_59_ = (float) MenuEntry.anIntArray9612[i_56_];
                float f_60_ = (f_57_ * NodeSub20.aFloat6835 + f_59_ * Component200.aFloat3710 + RenderableSub6.aFloat6430 * f_58_ + f_35_);
                float f_61_ = (JagTheoraDecoder.aFloat1010 * f_57_ + f_59_ * Component252.aFloat10199 + f_58_ * HashNodeSub4.aFloat9516 + f);
                float f_62_ = f_36_ + (f_58_ * GraphicsToolkit.aFloat4582 + (Component45.aFloat4338 * f_59_ + ShaderCompilerSub3.aFloat6523 * f_57_));
                if (f_62_ >= (float) aHa_Sub3_5419.anInt8095) {
                    if (i_31_ > 0) f_62_ = (float) i_31_;
                    float f_63_ = (f_61_ * (float) i_42_ / f_62_ + (float) aHa_Sub3_5419.anInt8094);
                    float f_64_ = ((float) aHa_Sub3_5419.anInt8130 + (float) i_43_ * f_60_ / f_62_);
                    if (f_63_ < f_38_) f_38_ = f_63_;
                    if (f_63_ > f_39_) f_39_ = f_63_;
                    if (f_64_ < f_40_) f_40_ = f_64_;
                    bool_37_ = true;
                    if (f_41_ < f_64_) f_41_ = f_64_;
                }
            }
            if (bool_37_ && f_38_ < (float) i && f_39_ > (float) i && f_40_ < (float) i_33_ && f_41_ > (float) i_33_) {
                if (bool) return true;
                if (anInt5475 > Component141.anIntArray9949.length) {
                    DisplayModeManagerContainer204.anIntArray1593 = new int[anInt5475];
                    Component141.anIntArray9949 = new int[anInt5475];
                }
                for (int i_65_ = 0; i_65_ < anInt5433; i_65_++) {
                    float f_66_ = (float) vertexZ[i_65_];
                    float f_67_ = (float) vertexY[i_65_];
                    float f_68_ = (float) vertexX[i_65_];
                    float f_69_ = (GraphicsToolkit.aFloat4582 * f_66_ + (f_68_ * ShaderCompilerSub3.aFloat6523 + Component45.aFloat4338 * f_67_) + f_36_);
                    float f_70_ = f + (Component252.aFloat10199 * f_67_ + JagTheoraDecoder.aFloat1010 * f_68_ + f_66_ * HashNodeSub4.aFloat9516);
                    float f_71_ = (RenderableSub6.aFloat6430 * f_66_ + (f_68_ * NodeSub20.aFloat6835 + Component200.aFloat3710 * f_67_) + f_35_);
                    if (f_69_ >= (float) aHa_Sub3_5419.anInt8095) {
                        if (i_31_ > 0) f_69_ = (float) i_31_;
                        int i_72_ = (int) ((float) i_42_ * f_70_ / f_69_ + (float) (aHa_Sub3_5419.anInt8094));
                        int i_73_ = (int) ((float) (aHa_Sub3_5419.anInt8130) + f_71_ * (float) i_43_ / f_69_);
                        int i_74_ = anIntArray5455[i_65_];
                        int i_75_ = anIntArray5455[i_65_ + 1];
                        for (int i_76_ = i_74_; i_76_ < i_75_; i_76_++) {
                            int i_77_ = -1 + aShortArray5439[i_76_];
                            if (i_77_ == -1) break;
                            Component141.anIntArray9949[i_77_] = i_72_;
                            DisplayModeManagerContainer204.anIntArray1593[i_77_] = i_73_;
                        }
                    } else {
                        int i_78_ = anIntArray5455[i_65_];
                        int i_79_ = anIntArray5455[i_65_ + 1];
                        for (int i_80_ = i_78_; i_79_ > i_80_; i_80_++) {
                            int i_81_ = aShortArray5439[i_80_] + -1;
                            if (i_81_ == -1) break;
                            Component141.anIntArray9949[aShortArray5439[i_80_] - 1] = -999999;
                        }
                    }
                }
                for (int i_82_ = 0; anInt5478 > i_82_; i_82_++) {
                    if ((Component141.anIntArray9949[aShortArray5508[i_82_]]) != -999999 && (Component141.anIntArray9949[aShortArray5495[i_82_]]) != -999999 && (Component141.anIntArray9949[aShortArray5512[i_82_]]) != -999999 && boundsCheck(i, (Component141.anIntArray9949[aShortArray5512[i_82_]]), (Component141.anIntArray9949[aShortArray5495[i_82_]]), (DisplayModeManagerContainer204.anIntArray1593[aShortArray5512[i_82_]]), (DisplayModeManagerContainer204.anIntArray1593[aShortArray5508[i_82_]]), i_33_, 0, (Component141.anIntArray9949[aShortArray5508[i_82_]]), (DisplayModeManagerContainer204.anIntArray1593[aShortArray5495[i_82_]])))
                        return true;
                }
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.AB(" + i + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + bool + ',' + (class101 != null ? "{...}" : "null") + ')'));
        }
    }

    private final void beginFrame(int i) {
        anInt5500++;
        if (aBoolean5402) {
            aBoolean5402 = false;
            if (aClass129Array5457 == null && aClass342Array5474 == null && aClass353Array5524 == null) {
                if (vertexX != null && !DisplayModeManagerContainer292.method1317(anInt5472, (byte) -91, anInt5463)) {
                    if (aClass290_5520 == null || aClass290_5520.method2197((byte) -62)) {
                        if (!aBoolean5477) computeBoundingBox(0);
                        vertexX = null;
                    } else aBoolean5402 = true;
                }
                if (vertexY != null && !Component163.method1887(0, anInt5472, anInt5463)) {
                    if (aClass290_5520 == null || aClass290_5520.method2197((byte) -87)) {
                        if (!aBoolean5477) computeBoundingBox(0);
                        vertexY = null;
                    } else aBoolean5402 = true;
                }
                if (vertexZ != null && !OutputStream_Sub2.method137(anInt5472, -96, anInt5463)) {
                    if (aClass290_5520 == null || aClass290_5520.method2197((byte) -34)) {
                        if (!aBoolean5477) computeBoundingBox(0);
                        vertexZ = null;
                    } else aBoolean5402 = true;
                }
            }
            if (aShortArray5439 != null && vertexX == null && vertexY == null && vertexZ == null) {
                anIntArray5455 = null;
                aShortArray5439 = null;
            }
            if (aByteArray5499 != null && !DisplayModeManagerContainer123.method776(anInt5472, anInt5463, i + -196608)) {
                if ((0x37 & anInt5472) != 0 ? (aClass290_5424 == null || aClass290_5424.method2197((byte) -10)) : (aClass290_5482 == null || aClass290_5482.method2197((byte) -73))) {
                    aShortArray5493 = aShortArray5438 = aShortArray5436 = null;
                    aByteArray5499 = null;
                } else aBoolean5402 = true;
            }
            if (aShortArray5486 != null && !DisplayModeManagerContainer348.method1740(anInt5472, anInt5463, false)) {
                if (aClass290_5482 != null && !aClass290_5482.method2197((byte) -74)) aBoolean5402 = true;
                else aShortArray5486 = null;
            }
            if (aByteArray5515 != null && !DefinitionSub29.method3124(anInt5472, (byte) -119, anInt5463)) {
                if (aClass290_5482 == null || aClass290_5482.method2197((byte) -20)) aByteArray5515 = null;
                else aBoolean5402 = true;
            }
            if (aFloatArray5476 != null && !DisplayModeManagerContainer273.method1132(1673, anInt5472, anInt5463)) {
                if (aClass290_5460 == null || aClass290_5460.method2197((byte) -66)) aFloatArray5476 = aFloatArray5506 = null;
                else aBoolean5402 = true;
            }
            if (aShortArray5423 != null && !RunescapeInfo.hasOverlayFlag(anInt5463, false, anInt5472)) {
                if (aClass290_5482 != null && !aClass290_5482.method2197((byte) -125)) aBoolean5402 = true;
                else aShortArray5423 = null;
            }
            if (i != 262144) isInFrustumExt(-95, 94, null, true, 116, 62);
            if (aShortArray5508 != null && !Component39.method1299(i + 131072, anInt5463, anInt5472)) {
                if ((aClass192_5485 == null || aClass192_5485.method1437((byte) -100)) && (aClass290_5482 == null || aClass290_5482.method2197((byte) -56))) aShortArray5508 = aShortArray5495 = aShortArray5512 = null;
                else aBoolean5402 = true;
            }
            if (aShortArray5470 != null) {
                if (aClass290_5520 == null || aClass290_5520.method2197((byte) -83)) aShortArray5470 = null;
                else aBoolean5402 = true;
            }
            if (aShortArray5416 != null) {
                if (aClass290_5482 == null || aClass290_5482.method2197((byte) -36)) aShortArray5416 = null;
                else aBoolean5402 = true;
            }
            if (anIntArrayArray5492 != null && !MenuOpener.method1158(anInt5472, -1, anInt5463)) {
                aShortArray5432 = null;
                anIntArrayArray5492 = null;
            }
            if (anIntArrayArray5413 != null && !Component214.method1257(-83, anInt5472, anInt5463)) {
                anIntArrayArray5413 = null;
                aShortArray5494 = null;
            }
            if (anIntArrayArray5412 != null && !DisplayModeManagerContainer123.method780(anInt5472, 0, anInt5463)) anIntArrayArray5412 = null;
            if (anIntArray5404 != null && (0x800 & anInt5463) == 0 && (anInt5463 & 0x40000) == 0) {
                anIntArray5404 = null;
                anIntArray5473 = null;
                anIntArray5415 = null;
            }
        }
    }

    final void a(int i) {
        anInt5435++;
        int i_83_ = DisplayModeManagerContainer88.anIntArray1207[i];
        int i_84_ = DisplayModeManagerContainer88.anIntArray1204[i];
        for (int i_85_ = 0; anInt5433 > i_85_; i_85_++) {
            int i_86_ = ((i_84_ * vertexX[i_85_] + vertexZ[i_85_] * i_83_) >> 14);
            vertexZ[i_85_] = (i_84_ * vertexZ[i_85_] + -(i_83_ * vertexX[i_85_]) >> 14);
            vertexX[i_85_] = i_86_;
        }
        setVisible(0);
        aBoolean5477 = false;
    }

    final void FA(int i) {
        anInt5488++;
        int i_87_ = DisplayModeManagerContainer88.anIntArray1207[i];
        int i_88_ = DisplayModeManagerContainer88.anIntArray1204[i];
        for (int i_89_ = 0; i_89_ < anInt5433; i_89_++) {
            int i_90_ = (vertexY[i_89_] * i_88_ + -(vertexZ[i_89_] * i_87_) >> 14);
            vertexZ[i_89_] = (vertexZ[i_89_] * i_88_ + vertexY[i_89_] * i_87_) >> 14;
            vertexY[i_89_] = i_90_;
        }
        setVisible(0);
        aBoolean5477 = false;
    }

    final int ua() {
        anInt5504++;
        return anInt5463;
    }

    final int G() {
        anInt5437++;
        if (!aBoolean5477) computeBoundingBox(0);
        return anInt5443;
    }

    final void resetObjects(int i) {
        anInt5483++;
        if (aClass290_5520 != null) aClass290_5520.method2195(false);
        if (aClass290_5460 != null) aClass290_5460.method2195(false);
        if (aClass290_5482 != null) aClass290_5482.method2195(false);
        if (i != -23755) aBoolean5477 = false;
        if (aClass290_5424 != null) aClass290_5424.method2195(false);
        if (aClass192_5485 != null) aClass192_5485.method1435((byte) -95);
    }

    final Component30[] method619() {
        anInt5469++;
        return aClass129Array5457;
    }

    final void P(int i, int i_91_, int i_92_, int i_93_) {
        anInt5480++;
        if (i == 0) {
            int i_94_ = 0;
            Component257.anInt4795 = 0;
            InputHandler.anInt4274 = 0;
            AssetCacheLoader.anInt386 = 0;
            for (int i_95_ = 0; i_95_ < anInt5433; i_95_++) {
                Component257.anInt4795 += vertexX[i_95_];
                AssetCacheLoader.anInt386 += vertexY[i_95_];
                InputHandler.anInt4274 += vertexZ[i_95_];
                i_94_++;
            }
            if (i_94_ > 0) {
                InputHandler.anInt4274 = i_93_ + InputHandler.anInt4274 / i_94_;
                AssetCacheLoader.anInt386 = i_92_ + AssetCacheLoader.anInt386 / i_94_;
                Component257.anInt4795 = i_91_ + Component257.anInt4795 / i_94_;
            } else {
                AssetCacheLoader.anInt386 = i_92_;
                InputHandler.anInt4274 = i_93_;
                Component257.anInt4795 = i_91_;
            }
        } else if (i == 1) {
            for (int i_96_ = 0; i_96_ < anInt5433; i_96_++) {
                vertexX[i_96_] += i_91_;
                vertexY[i_96_] += i_92_;
                vertexZ[i_96_] += i_93_;
            }
        } else if (i == 2) {
            for (int i_97_ = 0; anInt5433 > i_97_; i_97_++) {
                vertexX[i_97_] -= Component257.anInt4795;
                vertexY[i_97_] -= AssetCacheLoader.anInt386;
                vertexZ[i_97_] -= InputHandler.anInt4274;
                if (i_93_ != 0) {
                    int i_98_ = DisplayModeManagerContainer88.anIntArray1207[i_93_];
                    int i_99_ = DisplayModeManagerContainer88.anIntArray1204[i_93_];
                    int i_100_ = ((16383 + i_99_ * vertexX[i_97_] + vertexY[i_97_] * i_98_) >> 14);
                    vertexY[i_97_] = (16383 + (-(vertexX[i_97_] * i_98_) + vertexY[i_97_] * i_99_) >> 14);
                    vertexX[i_97_] = i_100_;
                }
                if (i_91_ != 0) {
                    int i_101_ = DisplayModeManagerContainer88.anIntArray1207[i_91_];
                    int i_102_ = DisplayModeManagerContainer88.anIntArray1204[i_91_];
                    int i_103_ = (16383 + (vertexY[i_97_] * i_102_ + -(i_101_ * vertexZ[i_97_])) >> 14);
                    vertexZ[i_97_] = (vertexZ[i_97_] * i_102_ + (vertexY[i_97_] * i_101_ - -16383)) >> 14;
                    vertexY[i_97_] = i_103_;
                }
                if (i_92_ != 0) {
                    int i_104_ = DisplayModeManagerContainer88.anIntArray1207[i_92_];
                    int i_105_ = DisplayModeManagerContainer88.anIntArray1204[i_92_];
                    int i_106_ = ((i_105_ * vertexX[i_97_] + vertexZ[i_97_] * i_104_ + 16383) >> 14);
                    vertexZ[i_97_] = (16383 + -(i_104_ * vertexX[i_97_]) + i_105_ * vertexZ[i_97_]) >> 14;
                    vertexX[i_97_] = i_106_;
                }
                vertexX[i_97_] += Component257.anInt4795;
                vertexY[i_97_] += AssetCacheLoader.anInt386;
                vertexZ[i_97_] += InputHandler.anInt4274;
            }
        } else if (i == 3) {
            for (int i_107_ = 0; i_107_ < anInt5433; i_107_++) {
                vertexX[i_107_] -= Component257.anInt4795;
                vertexY[i_107_] -= AssetCacheLoader.anInt386;
                vertexZ[i_107_] -= InputHandler.anInt4274;
                vertexX[i_107_] = vertexX[i_107_] * i_91_ / 128;
                vertexY[i_107_] = vertexY[i_107_] * i_92_ / 128;
                vertexZ[i_107_] = vertexZ[i_107_] * i_93_ / 128;
                vertexX[i_107_] += Component257.anInt4795;
                vertexY[i_107_] += AssetCacheLoader.anInt386;
                vertexZ[i_107_] += InputHandler.anInt4274;
            }
        } else if (i == 5) {
            for (int i_108_ = 0; anInt5478 > i_108_; i_108_++) {
                int i_109_ = i_91_ * 8 + (0xff & aByteArray5515[i_108_]);
                if (i_109_ >= 0) {
                    if (i_109_ > 255) i_109_ = 255;
                } else i_109_ = 0;
                aByteArray5515[i_108_] = (byte) i_109_;
            }
            if (aClass353Array5524 != null) {
                for (int i_110_ = 0; anInt5406 > i_110_; i_110_++) {
                    Component45 class353 = aClass353Array5524[i_110_];
                    NativeLibLoader class334 = aClass334Array5442[i_110_];
                    class334.anInt4156 = (class334.anInt4156 & 0xffffff | 255 - ((aByteArray5515[class353.anInt4342]) & 0xff) << 24);
                }
            }
            clearVisibility(-89);
        } else if (i == 7) {
            for (int i_111_ = 0; i_111_ < anInt5478; i_111_++) {
                int i_112_ = 0xffff & aShortArray5486[i_111_];
                int i_113_ = 0x3f & i_112_ >> 10;
                int i_114_ = (i_112_ & 0x3e6) >> 7;
                i_114_ += i_92_ / 4;
                int i_115_ = 0x7f & i_112_;
                i_113_ = 0x3f & i_113_ + i_91_;
                i_115_ += i_93_;
                if (i_114_ >= 0) {
                    if (i_114_ > 7) i_114_ = 7;
                } else i_114_ = 0;
                if (i_115_ < 0) i_115_ = 0;
                else if (i_115_ > 127) i_115_ = 127;
                aShortArray5486[i_111_] = (short) (Component224.bitwiseOr(Component224.bitwiseOr(i_114_ << 7, i_113_ << 10), i_115_));
            }
            if (aClass353Array5524 != null) {
                for (int i_116_ = 0; i_116_ < anInt5406; i_116_++) {
                    Component45 class353 = aClass353Array5524[i_116_];
                    NativeLibLoader class334 = aClass334Array5442[i_116_];
                    class334.anInt4156 = ((RunescapeInfo.anIntArray179[(aShortArray5486[class353.anInt4342] & 0xffff)]) & 0xffffff | ~0xffffff & class334.anInt4156);
                }
            }
            clearVisibility(-109);
        } else if (i == 8) {
            for (int i_117_ = 0; anInt5406 > i_117_; i_117_++) {
                NativeLibLoader class334 = aClass334Array5442[i_117_];
                class334.anInt4154 += i_92_;
                class334.anInt4158 += i_91_;
            }
        } else if (i == 10) {
            for (int i_118_ = 0; anInt5406 > i_118_; i_118_++) {
                NativeLibLoader class334 = aClass334Array5442[i_118_];
                class334.anInt4162 = class334.anInt4162 * i_92_ >> 7;
                class334.anInt4165 = class334.anInt4165 * i_91_ >> 7;
            }
        } else if (i == 9) {
            for (int i_119_ = 0; anInt5406 > i_119_; i_119_++) {
                NativeLibLoader class334 = aClass334Array5442[i_119_];
                class334.anInt4151 = class334.anInt4151 + i_91_ & 0x3fff;
            }
        }
    }

    final void O(int i, int i_120_, int i_121_) {
        for (int i_122_ = 0; anInt5433 > i_122_; i_122_++) {
            if (i != 128) vertexX[i_122_] = i * vertexX[i_122_] >> 7;
            if (i_120_ != 128) vertexY[i_122_] = i_120_ * vertexY[i_122_] >> 7;
            if (i_121_ != 128) vertexZ[i_122_] = i_121_ * vertexZ[i_122_] >> 7;
        }
        anInt5525++;
        setVisible(0);
        aBoolean5477 = false;
    }

    private final void allocateBuffers(int i, CacheNodeSub1 var_r_Sub1) {
        try {
            if (anInt5475 > Component141.anIntArray9949.length) {
                DisplayModeManagerContainer204.anIntArray1593 = new int[anInt5475];
                Component141.anIntArray9949 = new int[anInt5475];
            }
            anInt5453++;
            if (i >= 0) {
                for (int i_123_ = 0; anInt5433 > i_123_; i_123_++) {
                    int i_124_ = (-var_r_Sub1.anInt10468 + ((vertexX[i_123_] + -((aHa_Sub3_5419.anInt8133 * vertexY[i_123_]) >> 8)) >> aHa_Sub3_5419.anInt8107));
                    int i_125_ = (((vertexZ[i_123_] + -((aHa_Sub3_5419.anInt8114 * vertexY[i_123_]) >> 8)) >> aHa_Sub3_5419.anInt8107) + -var_r_Sub1.anInt10474);
                    int i_126_ = anIntArray5455[i_123_];
                    int i_127_ = anIntArray5455[i_123_ - -1];
                    for (int i_128_ = i_126_; i_128_ < i_127_; i_128_++) {
                        int i_129_ = aShortArray5439[i_128_] - 1;
                        if (i_129_ == -1) break;
                        Component141.anIntArray9949[i_129_] = i_124_;
                        DisplayModeManagerContainer204.anIntArray1593[i_129_] = i_125_;
                    }
                }
                for (int i_130_ = 0; anInt5516 > i_130_; i_130_++) {
                    if (aByteArray5515 == null || aByteArray5515[i_130_] <= 128) {
                        short i_131_ = aShortArray5508[i_130_];
                        short i_132_ = aShortArray5495[i_130_];
                        short i_133_ = aShortArray5512[i_130_];
                        int i_134_ = Component141.anIntArray9949[i_131_];
                        int i_135_ = Component141.anIntArray9949[i_132_];
                        int i_136_ = Component141.anIntArray9949[i_133_];
                        int i_137_ = DisplayModeManagerContainer204.anIntArray1593[i_131_];
                        int i_138_ = DisplayModeManagerContainer204.anIntArray1593[i_132_];
                        int i_139_ = DisplayModeManagerContainer204.anIntArray1593[i_133_];
                        if ((-((i_136_ - i_135_) * (-i_137_ + i_138_)) + (i_138_ - i_139_) * (-i_135_ + i_134_)) > 0) var_r_Sub1.method3287(i_137_, 50, i_134_, i_135_, i_138_, i_139_, i_136_);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.B(" + i + ',' + (var_r_Sub1 != null ? "{...}" : "null") + ')'));
        }
    }

    final void k(int i) {
        anInt5490++;
        int i_140_ = DisplayModeManagerContainer88.anIntArray1207[i];
        int i_141_ = DisplayModeManagerContainer88.anIntArray1204[i];
        for (int i_142_ = 0; i_142_ < anInt5433; i_142_++) {
            int i_143_ = ((vertexX[i_142_] * i_141_ + vertexZ[i_142_] * i_140_) >> 14);
            vertexZ[i_142_] = (i_141_ * vertexZ[i_142_] + -(i_140_ * vertexX[i_142_])) >> 14;
            vertexX[i_142_] = i_143_;
        }
        for (int i_144_ = 0; i_144_ < anInt5475; i_144_++) {
            int i_145_ = (aShortArray5436[i_144_] * i_140_ - -(aShortArray5493[i_144_] * i_141_) >> 14);
            aShortArray5436[i_144_] = (short) ((i_141_ * aShortArray5436[i_144_] + -(i_140_ * aShortArray5493[i_144_])) >> 14);
            aShortArray5493[i_144_] = (short) i_145_;
        }
        setVisible(0);
        updateState((byte) 112);
        aBoolean5477 = false;
    }

    private final boolean ensureInterface(int i) {
        anInt5421++;
        if (aClass192_5485.aBoolean2577) return true;
        if (aClass192_5485.anInterface5_Impl2_2576 == null) aClass192_5485.anInterface5_Impl2_2576 = aHa_Sub3_5419.blitFramebuffer(-28633, aBoolean5462);
        Interface5_Impl2 interface5_impl2 = aClass192_5485.anInterface5_Impl2_2576;
        interface5_impl2.method23(15959, 6 * anInt5516);
        Buffer buffer = interface5_impl2.method24(true, false);
        int i_146_ = 84 / ((-70 - i) / 49);
        if (buffer != null) {
            Stream stream = aHa_Sub3_5419.uniform4i(buffer, 9179);
            if (Stream.c()) {
                for (int i_148_ = 0; anInt5516 > i_148_; i_148_++) {
                    stream.d(aShortArray5508[i_148_]);
                    stream.d(aShortArray5495[i_148_]);
                    stream.d(aShortArray5512[i_148_]);
                }
            } else {
                for (int i_147_ = 0; anInt5516 > i_147_; i_147_++) {
                    stream.a(aShortArray5508[i_147_]);
                    stream.a(aShortArray5495[i_147_]);
                    stream.a(aShortArray5512[i_147_]);
                }
            }
            stream.a();
            if (interface5_impl2.method22(-23)) {
                aClass192_5485.aBoolean2577 = true;
                aBoolean5402 = true;
                aClass192_5485.anInterface5_Impl2_2572 = interface5_impl2;
                return true;
            }
        }
        return false;
    }

    final void clipVertices(DisplayModeManagerContainer204 class101, int i, boolean bool) {
        try {
            anInt5434++;
            if (aShortArray5494 != null) {
                int[] is = new int[3];
                for (int i_149_ = 0; i_149_ < anInt5433; i_149_++) {
                    if ((i & aShortArray5494[i_149_]) != 0) {
                        if (!bool) class101.method897(vertexX[i_149_], vertexY[i_149_], vertexZ[i_149_], is);
                        else class101.method892(vertexX[i_149_], vertexY[i_149_], vertexZ[i_149_], is);
                        vertexX[i_149_] = is[0];
                        vertexY[i_149_] = is[1];
                        vertexZ[i_149_] = is[2];
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.za(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
        }
    }

    private final void setVisible(int i) {
        anInt5491++;
        if (i == 0) {
            if (aClass290_5520 != null) aClass290_5520.aBoolean3714 = false;
        }
    }

    final void H(int i, int i_150_, int i_151_) {
        anInt5481++;
        for (int i_152_ = 0; anInt5433 > i_152_; i_152_++) {
            if (i != 0) vertexX[i_152_] += i;
            if (i_150_ != 0) vertexY[i_152_] += i_150_;
            if (i_151_ != 0) vertexZ[i_152_] += i_151_;
        }
        setVisible(0);
        aBoolean5477 = false;
    }

    private final DisplayModeManagerContainer370 copyTo(boolean bool, DisplayModeManagerContainer190 class64_sub2_153_, DisplayModeManagerContainer190 class64_sub2_154_, int i, boolean bool_155_, int i_156_) {
        try {
            class64_sub2_154_.anInt5497 = anInt5497;
            class64_sub2_154_.anInt5478 = anInt5478;
            class64_sub2_154_.anInt5475 = anInt5475;
            class64_sub2_154_.aShort5427 = aShort5427;
            class64_sub2_154_.anInt5433 = anInt5433;
            anInt5411++;
            class64_sub2_154_.anInt5516 = anInt5516;
            class64_sub2_154_.anInt5463 = i;
            class64_sub2_154_.anInt5472 = anInt5472;
            class64_sub2_154_.anInt5406 = anInt5406;
            class64_sub2_154_.aBoolean5502 = aBoolean5502;
            if ((0x100 & i) == 0) class64_sub2_154_.aBoolean5428 = aBoolean5428;
            else class64_sub2_154_.aBoolean5428 = true;
            class64_sub2_154_.aShort5452 = aShort5452;
            boolean bool_157_ = InterfaceRenderer.method2217(anInt5472, i, 0);
            boolean bool_158_ = ParametricDefinition.method3056(i_156_ + -26704, i, anInt5472);
            boolean bool_159_ = DefinitionSub9.method3073(anInt5472, i, (byte) 50);
            boolean bool_160_ = bool_157_ | bool_158_ | bool_159_;
            if (bool_160_) {
                if (bool_157_) {
                    if (class64_sub2_153_.vertexX != null && anInt5497 <= class64_sub2_153_.vertexX.length) class64_sub2_154_.vertexX = class64_sub2_153_.vertexX;
                    else class64_sub2_154_.vertexX = class64_sub2_153_.vertexX = new int[anInt5497];
                } else class64_sub2_154_.vertexX = vertexX;
                if (bool_158_) {
                    if (class64_sub2_153_.vertexY != null && (anInt5497 <= class64_sub2_153_.vertexY.length)) class64_sub2_154_.vertexY = class64_sub2_153_.vertexY;
                    else class64_sub2_154_.vertexY = class64_sub2_153_.vertexY = new int[anInt5497];
                } else class64_sub2_154_.vertexY = vertexY;
                if (bool_159_) {
                    if (class64_sub2_153_.vertexZ == null || anInt5497 > class64_sub2_153_.vertexZ.length) class64_sub2_154_.vertexZ = class64_sub2_153_.vertexZ = new int[anInt5497];
                    else class64_sub2_154_.vertexZ = class64_sub2_153_.vertexZ;
                } else class64_sub2_154_.vertexZ = vertexZ;
                for (int i_161_ = 0; anInt5497 > i_161_; i_161_++) {
                    if (bool_157_) class64_sub2_154_.vertexX[i_161_] = vertexX[i_161_];
                    if (bool_158_) class64_sub2_154_.vertexY[i_161_] = vertexY[i_161_];
                    if (bool_159_) class64_sub2_154_.vertexZ[i_161_] = vertexZ[i_161_];
                }
            } else {
                class64_sub2_154_.vertexX = vertexX;
                class64_sub2_154_.vertexZ = vertexZ;
                class64_sub2_154_.vertexY = vertexY;
            }
            if (Component235.method2015(i, anInt5472, 7)) {
                class64_sub2_154_.aClass290_5520 = class64_sub2_153_.aClass290_5520;
                class64_sub2_154_.aClass290_5520.anInterface5_Impl1_3711 = aClass290_5520.anInterface5_Impl1_3711;
                class64_sub2_154_.aClass290_5520.aBoolean3714 = aClass290_5520.aBoolean3714;
                class64_sub2_154_.aClass290_5520.aBoolean3709 = true;
            } else if (!DisplayModeManagerContainer254.method1258(i, -9301, anInt5472)) class64_sub2_154_.aClass290_5520 = null;
            else class64_sub2_154_.aClass290_5520 = aClass290_5520;
            if (RadixText.method1833((byte) -122, i, anInt5472)) {
                if (class64_sub2_153_.aShortArray5486 != null && (anInt5478 <= class64_sub2_153_.aShortArray5486.length)) class64_sub2_154_.aShortArray5486 = class64_sub2_153_.aShortArray5486;
                else class64_sub2_154_.aShortArray5486 = class64_sub2_153_.aShortArray5486 = new short[anInt5478];
                for (int i_162_ = 0; anInt5478 > i_162_; i_162_++)
                    class64_sub2_154_.aShortArray5486[i_162_] = aShortArray5486[i_162_];
            } else class64_sub2_154_.aShortArray5486 = aShortArray5486;
            if (Component179.method2985(-31735, anInt5472, i)) {
                if (class64_sub2_153_.aByteArray5515 == null || class64_sub2_153_.aByteArray5515.length < anInt5478) class64_sub2_154_.aByteArray5515 = class64_sub2_153_.aByteArray5515 = new byte[anInt5478];
                else class64_sub2_154_.aByteArray5515 = class64_sub2_153_.aByteArray5515;
                for (int i_163_ = 0; i_163_ < anInt5478; i_163_++)
                    class64_sub2_154_.aByteArray5515[i_163_] = aByteArray5515[i_163_];
            } else class64_sub2_154_.aByteArray5515 = aByteArray5515;
            if (PacketReader.isPacketAllowed(i, anInt5472, (byte) -75)) {
                class64_sub2_154_.aClass290_5482 = class64_sub2_153_.aClass290_5482;
                class64_sub2_154_.aClass290_5482.aBoolean3709 = true;
                class64_sub2_154_.aClass290_5482.aBoolean3714 = aClass290_5482.aBoolean3714;
                class64_sub2_154_.aClass290_5482.anInterface5_Impl1_3711 = aClass290_5482.anInterface5_Impl1_3711;
            } else if (HuffmanDecoder.method2224(i, (byte) 117, anInt5472)) class64_sub2_154_.aClass290_5482 = aClass290_5482;
            else class64_sub2_154_.aClass290_5482 = null;
            if (FriendsIgnoreList.hasCollisionBlockFlags(i, anInt5472, 116)) {
                if (class64_sub2_153_.aShortArray5493 == null || (anInt5475 > class64_sub2_153_.aShortArray5493.length)) {
                    int i_164_ = anInt5475;
                    class64_sub2_154_.aShortArray5436 = class64_sub2_153_.aShortArray5436 = new short[i_164_];
                    class64_sub2_154_.aShortArray5493 = class64_sub2_153_.aShortArray5493 = new short[i_164_];
                    class64_sub2_154_.aShortArray5438 = class64_sub2_153_.aShortArray5438 = new short[i_164_];
                } else {
                    class64_sub2_154_.aShortArray5436 = class64_sub2_153_.aShortArray5436;
                    class64_sub2_154_.aShortArray5493 = class64_sub2_153_.aShortArray5493;
                    class64_sub2_154_.aShortArray5438 = class64_sub2_153_.aShortArray5438;
                }
                if (aClass151_5503 == null) {
                    class64_sub2_154_.aClass151_5503 = null;
                    for (int i_165_ = 0; anInt5475 > i_165_; i_165_++) {
                        class64_sub2_154_.aShortArray5493[i_165_] = aShortArray5493[i_165_];
                        class64_sub2_154_.aShortArray5438[i_165_] = aShortArray5438[i_165_];
                        class64_sub2_154_.aShortArray5436[i_165_] = aShortArray5436[i_165_];
                    }
                } else {
                    if (class64_sub2_153_.aClass151_5503 == null) class64_sub2_153_.aClass151_5503 = new DisplayModeManagerContainer346();
                    DisplayModeManagerContainer346 class151 = (class64_sub2_154_.aClass151_5503 = class64_sub2_153_.aClass151_5503);
                    if (class151.aShortArray2067 == null || (class151.aShortArray2067.length < anInt5475)) {
                        int i_166_ = anInt5475;
                        class151.aByteArray2069 = new byte[i_166_];
                        class151.aShortArray2067 = new short[i_166_];
                        class151.aShortArray2058 = new short[i_166_];
                        class151.aShortArray2060 = new short[i_166_];
                    }
                    for (int i_167_ = 0; i_167_ < anInt5475; i_167_++) {
                        class64_sub2_154_.aShortArray5493[i_167_] = aShortArray5493[i_167_];
                        class64_sub2_154_.aShortArray5438[i_167_] = aShortArray5438[i_167_];
                        class64_sub2_154_.aShortArray5436[i_167_] = aShortArray5436[i_167_];
                        class151.aShortArray2067[i_167_] = (aClass151_5503.aShortArray2067[i_167_]);
                        class151.aShortArray2060[i_167_] = (aClass151_5503.aShortArray2060[i_167_]);
                        class151.aShortArray2058[i_167_] = (aClass151_5503.aShortArray2058[i_167_]);
                        class151.aByteArray2069[i_167_] = (aClass151_5503.aByteArray2069[i_167_]);
                    }
                }
                class64_sub2_154_.aByteArray5499 = aByteArray5499;
            } else {
                class64_sub2_154_.aByteArray5499 = aByteArray5499;
                class64_sub2_154_.aClass151_5503 = aClass151_5503;
                class64_sub2_154_.aShortArray5436 = aShortArray5436;
                class64_sub2_154_.aShortArray5493 = aShortArray5493;
                class64_sub2_154_.aShortArray5438 = aShortArray5438;
            }
            if (Component380.method1113(i, anInt5472, -30)) {
                class64_sub2_154_.aClass290_5424 = class64_sub2_153_.aClass290_5424;
                class64_sub2_154_.aClass290_5424.anInterface5_Impl1_3711 = aClass290_5424.anInterface5_Impl1_3711;
                class64_sub2_154_.aClass290_5424.aBoolean3709 = true;
                class64_sub2_154_.aClass290_5424.aBoolean3714 = aClass290_5424.aBoolean3714;
            } else if (!ReliefShader.method1412((byte) -35, anInt5472, i)) class64_sub2_154_.aClass290_5424 = null;
            else class64_sub2_154_.aClass290_5424 = aClass290_5424;
            if (CacheNode.method3194(i, anInt5472, (byte) 121)) {
                if (class64_sub2_153_.aFloatArray5476 == null || (class64_sub2_153_.aFloatArray5476.length < anInt5478)) {
                    int i_168_ = anInt5475;
                    class64_sub2_154_.aFloatArray5506 = class64_sub2_153_.aFloatArray5506 = new float[i_168_];
                    class64_sub2_154_.aFloatArray5476 = class64_sub2_153_.aFloatArray5476 = new float[i_168_];
                } else {
                    class64_sub2_154_.aFloatArray5476 = class64_sub2_153_.aFloatArray5476;
                    class64_sub2_154_.aFloatArray5506 = class64_sub2_153_.aFloatArray5506;
                }
                for (int i_169_ = 0; i_169_ < anInt5475; i_169_++) {
                    class64_sub2_154_.aFloatArray5476[i_169_] = aFloatArray5476[i_169_];
                    class64_sub2_154_.aFloatArray5506[i_169_] = aFloatArray5506[i_169_];
                }
            } else {
                class64_sub2_154_.aFloatArray5476 = aFloatArray5476;
                class64_sub2_154_.aFloatArray5506 = aFloatArray5506;
            }
            if (Component191.method1379(4, anInt5472, i)) {
                class64_sub2_154_.aClass290_5460 = class64_sub2_153_.aClass290_5460;
                class64_sub2_154_.aClass290_5460.anInterface5_Impl1_3711 = aClass290_5460.anInterface5_Impl1_3711;
                class64_sub2_154_.aClass290_5460.aBoolean3714 = aClass290_5460.aBoolean3714;
                class64_sub2_154_.aClass290_5460.aBoolean3709 = true;
            } else if (RadixText.method1837(anInt5472, 56, i)) class64_sub2_154_.aClass290_5460 = aClass290_5460;
            else class64_sub2_154_.aClass290_5460 = null;
            if (HashNodeSub16Sub1.hasFlag0x10(i, anInt5472, 94)) {
                if (class64_sub2_153_.aShortArray5508 != null && (class64_sub2_153_.aShortArray5508.length >= anInt5478)) {
                    class64_sub2_154_.aShortArray5508 = class64_sub2_153_.aShortArray5508;
                    class64_sub2_154_.aShortArray5495 = class64_sub2_153_.aShortArray5495;
                    class64_sub2_154_.aShortArray5512 = class64_sub2_153_.aShortArray5512;
                } else {
                    int i_170_ = anInt5478;
                    class64_sub2_154_.aShortArray5512 = class64_sub2_153_.aShortArray5512 = new short[i_170_];
                    class64_sub2_154_.aShortArray5495 = class64_sub2_153_.aShortArray5495 = new short[i_170_];
                    class64_sub2_154_.aShortArray5508 = class64_sub2_153_.aShortArray5508 = new short[i_170_];
                }
                for (int i_171_ = 0; i_171_ < anInt5478; i_171_++) {
                    class64_sub2_154_.aShortArray5508[i_171_] = aShortArray5508[i_171_];
                    class64_sub2_154_.aShortArray5495[i_171_] = aShortArray5495[i_171_];
                    class64_sub2_154_.aShortArray5512[i_171_] = aShortArray5512[i_171_];
                }
            } else {
                class64_sub2_154_.aShortArray5495 = aShortArray5495;
                class64_sub2_154_.aShortArray5512 = aShortArray5512;
                class64_sub2_154_.aShortArray5508 = aShortArray5508;
            }
            if (SceneNode.method2783(anInt5472, (byte) 80, i)) {
                class64_sub2_154_.aClass192_5485 = class64_sub2_153_.aClass192_5485;
                class64_sub2_154_.aClass192_5485.aBoolean2577 = aClass192_5485.aBoolean2577;
                class64_sub2_154_.aClass192_5485.aBoolean2574 = true;
                class64_sub2_154_.aClass192_5485.anInterface5_Impl2_2572 = aClass192_5485.anInterface5_Impl2_2572;
            } else if (Component63.method3563(i, (byte) 56, anInt5472)) class64_sub2_154_.aClass192_5485 = aClass192_5485;
            else class64_sub2_154_.aClass192_5485 = null;
            if (DisplayModeManagerContainer347.method2077(-122, anInt5472, i)) {
                if (class64_sub2_153_.aShortArray5423 != null && class64_sub2_153_.aShortArray5423.length >= anInt5478) class64_sub2_154_.aShortArray5423 = class64_sub2_153_.aShortArray5423;
                else {
                    int i_172_ = anInt5478;
                    class64_sub2_154_.aShortArray5423 = class64_sub2_153_.aShortArray5423 = new short[i_172_];
                }
                for (int i_173_ = 0; anInt5478 > i_173_; i_173_++)
                    class64_sub2_154_.aShortArray5423[i_173_] = aShortArray5423[i_173_];
            } else class64_sub2_154_.aShortArray5423 = aShortArray5423;
            if (DefinitionSub26.method3119(i, i_156_ ^ 0x6897, anInt5472)) {
                if (class64_sub2_153_.aClass334Array5442 != null && (anInt5406 <= class64_sub2_153_.aClass334Array5442.length)) {
                    class64_sub2_154_.aClass334Array5442 = class64_sub2_153_.aClass334Array5442;
                    for (int i_174_ = 0; anInt5406 > i_174_; i_174_++)
                        class64_sub2_154_.aClass334Array5442[i_174_].copyFrom(aClass334Array5442[i_174_], (byte) 118);
                } else {
                    int i_175_ = anInt5406;
                    class64_sub2_154_.aClass334Array5442 = class64_sub2_153_.aClass334Array5442 = new NativeLibLoader[i_175_];
                    for (int i_176_ = 0; i_176_ < anInt5406; i_176_++)
                        class64_sub2_154_.aClass334Array5442[i_176_] = (aClass334Array5442[i_176_].copy(NodeSub21.bitwiseXor(i_156_, 26792)));
                }
            } else class64_sub2_154_.aClass334Array5442 = aClass334Array5442;
            if (aBoolean5477) {
                class64_sub2_154_.anInt5418 = anInt5418;
                class64_sub2_154_.anInt5510 = anInt5510;
                class64_sub2_154_.anInt5467 = anInt5467;
                class64_sub2_154_.anInt5509 = anInt5509;
                class64_sub2_154_.aBoolean5477 = true;
                class64_sub2_154_.anInt5401 = anInt5401;
                class64_sub2_154_.anInt5461 = anInt5461;
                class64_sub2_154_.anInt5507 = anInt5507;
                class64_sub2_154_.anInt5443 = anInt5443;
            } else class64_sub2_154_.aBoolean5477 = false;
            class64_sub2_154_.aClass342Array5474 = aClass342Array5474;
            class64_sub2_154_.aShortArray5432 = aShortArray5432;
            class64_sub2_154_.anIntArrayArray5492 = anIntArrayArray5492;
            class64_sub2_154_.anIntArray5455 = anIntArray5455;
            class64_sub2_154_.aShortArray5416 = aShortArray5416;
            class64_sub2_154_.aShortArray5494 = aShortArray5494;
            class64_sub2_154_.anIntArray5404 = anIntArray5404;
            class64_sub2_154_.aShortArray5439 = aShortArray5439;
            if (i_156_ != 26794) return null;
            class64_sub2_154_.anIntArray5473 = anIntArray5473;
            class64_sub2_154_.aClass353Array5524 = aClass353Array5524;
            class64_sub2_154_.anIntArrayArray5413 = anIntArrayArray5413;
            class64_sub2_154_.anIntArray5415 = anIntArray5415;
            class64_sub2_154_.aClass129Array5457 = aClass129Array5457;
            class64_sub2_154_.anIntArrayArray5412 = anIntArrayArray5412;
            class64_sub2_154_.aShortArray5470 = aShortArray5470;
            return class64_sub2_154_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.U(" + bool + ',' + (class64_sub2_153_ != null ? "{...}" : "null") + ',' + (class64_sub2_154_ != null ? "{...}" : "null") + ',' + i + ',' + bool_155_ + ',' + i_156_ + ')'));
        }
    }

    final int ma() {
        if (!aBoolean5477) computeBoundingBox(0);
        anInt5468++;
        return anInt5401;
    }

    final int WA() {
        anInt5496++;
        return aShort5452;
    }

    final void transformVertices(DisplayModeManagerContainer204 class101) {
        do {
            try {
                anInt5444++;
                MatrixSub2 class101_sub2 = (MatrixSub2) class101;
                if (aClass129Array5457 != null) {
                    for (int i = 0; (aClass129Array5457.length > i); i++) {
                        Component30 class129 = aClass129Array5457[i];
                        Component30 class129_177_ = class129;
                        if (class129.aClass129_1888 != null) class129_177_ = class129.aClass129_1888;
                        class129_177_.anInt1882 = (int) (class101_sub2.aFloat5729 + (((float) (vertexZ[(class129.anInt1881)]) * (class101_sub2.aFloat5704)) + (((float) (vertexX[(class129.anInt1881)]) * (class101_sub2.aFloat5711)) + ((class101_sub2.aFloat5700) * (float) (vertexY[(class129.anInt1881)])))));
                        class129_177_.anInt1891 = (int) (class101_sub2.aFloat5710 + (((float) (vertexZ[(class129.anInt1881)]) * (class101_sub2.aFloat5732)) + (((float) (vertexX[(class129.anInt1881)]) * (class101_sub2.aFloat5708)) + ((float) (vertexY[(class129.anInt1881)]) * class101_sub2.aFloat5722))));
                        class129_177_.anInt1889 = (int) (((float) (vertexY[(class129.anInt1881)]) * (class101_sub2.aFloat5691)) + ((class101_sub2.aFloat5736) * (float) (vertexX[(class129.anInt1881)])) + ((float) (vertexZ[(class129.anInt1881)]) * (class101_sub2.aFloat5716)) + (class101_sub2.aFloat5724));
                        class129_177_.anInt1883 = (int) (((class101_sub2.aFloat5711) * (float) (vertexX[(class129.anInt1877)])) + ((float) (vertexY[(class129.anInt1877)]) * (class101_sub2.aFloat5700)) + ((float) (vertexZ[(class129.anInt1877)]) * (class101_sub2.aFloat5704)) + (class101_sub2.aFloat5729));
                        class129_177_.anInt1890 = (int) (class101_sub2.aFloat5710 + (((float) (vertexZ[(class129.anInt1877)]) * (class101_sub2.aFloat5732)) + (((class101_sub2.aFloat5708) * (float) (vertexX[(class129.anInt1877)])) + ((class101_sub2.aFloat5722) * (float) (vertexY[(class129.anInt1877)])))));
                        class129_177_.anInt1880 = (int) (class101_sub2.aFloat5724 + (((class101_sub2.aFloat5716) * (float) (vertexZ[(class129.anInt1877)])) + (((class101_sub2.aFloat5691) * (float) (vertexY[(class129.anInt1877)])) + ((class101_sub2.aFloat5736) * (float) (vertexX[(class129.anInt1877)])))));
                        class129_177_.anInt1876 = (int) (class101_sub2.aFloat5729 + (((class101_sub2.aFloat5700) * (float) (vertexY[(class129.anInt1892)])) + ((float) (vertexX[(class129.anInt1892)]) * (class101_sub2.aFloat5711)) + ((float) (vertexZ[(class129.anInt1892)]) * (class101_sub2.aFloat5704))));
                        class129_177_.anInt1874 = (int) (((float) (vertexZ[(class129.anInt1892)]) * (class101_sub2.aFloat5732)) + (((float) (vertexY[(class129.anInt1892)]) * (class101_sub2.aFloat5722)) + ((class101_sub2.aFloat5708) * (float) (vertexX[(class129.anInt1892)]))) + (class101_sub2.aFloat5710));
                        class129_177_.anInt1884 = (int) (((class101_sub2.aFloat5736) * (float) (vertexX[(class129.anInt1892)])) + ((class101_sub2.aFloat5691) * (float) (vertexY[(class129.anInt1892)])) + ((float) (vertexZ[(class129.anInt1892)]) * (class101_sub2.aFloat5716)) + (class101_sub2.aFloat5724));
                    }
                }
                if (aClass342Array5474 == null) break;
                for (int i = 0; aClass342Array5474.length > i; i++) {
                    DisplayModeManagerContainer173 class342 = aClass342Array5474[i];
                    DisplayModeManagerContainer173 class342_178_ = class342;
                    if (class342.aClass342_4248 != null) class342_178_ = class342.aClass342_4248;
                    if (class342.aClass101_4252 != null) class342.aClass101_4252.method898(class101_sub2);
                    else class342.aClass101_4252 = class101_sub2.method907();
                    class342_178_.anInt4238 = (int) (((float) (vertexY[class342.anInt4244]) * class101_sub2.aFloat5700) + ((float) (vertexX[class342.anInt4244]) * (class101_sub2.aFloat5711)) + ((float) (vertexZ[class342.anInt4244]) * (class101_sub2.aFloat5704)) + class101_sub2.aFloat5729);
                    class342_178_.anInt4239 = (int) (((float) (vertexZ[class342.anInt4244]) * class101_sub2.aFloat5732) + ((class101_sub2.aFloat5722 * (float) (vertexY[(class342.anInt4244)])) + ((float) (vertexX[(class342.anInt4244)]) * (class101_sub2.aFloat5708))) + class101_sub2.aFloat5710);
                    class342_178_.anInt4240 = (int) (((float) (vertexY[class342.anInt4244]) * class101_sub2.aFloat5691) + ((float) (vertexX[class342.anInt4244]) * (class101_sub2.aFloat5736)) + ((float) (vertexZ[class342.anInt4244]) * (class101_sub2.aFloat5716)) + class101_sub2.aFloat5724);
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, "nca.J(" + (class101 != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }

    final int HA() {
        if (!aBoolean5477) computeBoundingBox(0);
        anInt5465++;
        return anInt5418;
    }

    final void method608(DisplayModeManagerContainer204 class101, RenderableSub3 class318_sub3, int i, int i_179_) {
        try {
            anInt5487++;
            if (anInt5475 != 0) {
                MatrixSub2 class101_sub2 = aHa_Sub3_5419.aClass101_Sub2_8080;
                MatrixSub2 class101_sub2_180_ = (MatrixSub2) class101;
                if (!aBoolean5477) computeBoundingBox(0);
                Component49.aFloat4673 = (class101_sub2.aFloat5724 + ((class101_sub2_180_.aFloat5710 * class101_sub2.aFloat5691) + (class101_sub2_180_.aFloat5729 * class101_sub2.aFloat5736) + (class101_sub2_180_.aFloat5724 * class101_sub2.aFloat5716)));
                Component45.aFloat4338 = ((class101_sub2.aFloat5691 * class101_sub2_180_.aFloat5722) + (class101_sub2.aFloat5736 * class101_sub2_180_.aFloat5700) + (class101_sub2.aFloat5716 * class101_sub2_180_.aFloat5691));
                float f = (Component49.aFloat4673 + (float) anInt5461 * Component45.aFloat4338);
                float f_181_ = (Component45.aFloat4338 * (float) anInt5509 + Component49.aFloat4673);
                float f_182_;
                float f_183_;
                if (f_181_ < f) {
                    f_183_ = f + (float) anInt5510;
                    f_182_ = (float) -anInt5510 + f_181_;
                } else {
                    f_182_ = (float) -anInt5510 + f;
                    f_183_ = (float) anInt5510 + f_181_;
                }
                if (!(aHa_Sub3_5419.aFloat8089 <= f_182_) && !((float) aHa_Sub3_5419.anInt8095 >= f_183_)) {
                    Component252.aFloat10199 = ((class101_sub2.aFloat5711 * class101_sub2_180_.aFloat5700) + (class101_sub2_180_.aFloat5722 * class101_sub2.aFloat5700) + (class101_sub2_180_.aFloat5691 * class101_sub2.aFloat5704));
                    Component35.aFloat4268 = ((class101_sub2_180_.aFloat5710 * class101_sub2.aFloat5700) + (class101_sub2.aFloat5711 * (class101_sub2_180_.aFloat5729)) + (class101_sub2.aFloat5704 * (class101_sub2_180_.aFloat5724)) + class101_sub2.aFloat5729);
                    float f_184_ = (((float) anInt5461 * Component252.aFloat10199) + Component35.aFloat4268);
                    float f_185_ = ((Component252.aFloat10199 * (float) anInt5509) + Component35.aFloat4268);
                    float f_186_;
                    float f_187_;
                    if (f_185_ < f_184_) {
                        f_186_ = ((float) aHa_Sub3_5419.anInt8129 * ((float) anInt5510 + f_184_));
                        f_187_ = ((float) aHa_Sub3_5419.anInt8129 * (f_185_ - (float) anInt5510));
                    } else {
                        f_186_ = ((float) aHa_Sub3_5419.anInt8129 * ((float) anInt5510 + f_185_));
                        f_187_ = (((float) -anInt5510 + f_184_) * (float) aHa_Sub3_5419.anInt8129);
                    }
                    if (!(aHa_Sub3_5419.aFloat8158 <= f_187_ / (float) i) && !(f_186_ / (float) i <= aHa_Sub3_5419.aFloat8126)) {
                        Component200.aFloat3710 = ((class101_sub2_180_.aFloat5691 * class101_sub2.aFloat5732) + ((class101_sub2.aFloat5722 * (class101_sub2_180_.aFloat5722)) + ((class101_sub2_180_.aFloat5700) * (class101_sub2.aFloat5708))));
                        NodeSub12.aFloat6752 = (class101_sub2.aFloat5710 + ((class101_sub2.aFloat5708 * (class101_sub2_180_.aFloat5729)) + ((class101_sub2_180_.aFloat5710) * (class101_sub2.aFloat5722)) + ((class101_sub2_180_.aFloat5724) * (class101_sub2.aFloat5732))));
                        float f_188_ = (NodeSub12.aFloat6752 + Component200.aFloat3710 * (float) anInt5461);
                        float f_189_ = ((float) anInt5509 * Component200.aFloat3710 + NodeSub12.aFloat6752);
                        float f_190_;
                        float f_191_;
                        if (f_189_ < f_188_) {
                            f_190_ = ((float) aHa_Sub3_5419.anInt8134 * (f_188_ + (float) anInt5510));
                            f_191_ = (((float) -anInt5510 + f_189_) * (float) (aHa_Sub3_5419.anInt8134));
                        } else {
                            f_190_ = ((f_189_ + (float) anInt5510) * (float) (aHa_Sub3_5419.anInt8134));
                            f_191_ = ((float) aHa_Sub3_5419.anInt8134 * (f_188_ - (float) anInt5510));
                        }
                        if (!(f_191_ / (float) i >= aHa_Sub3_5419.aFloat8185) && !(f_190_ / (float) i <= aHa_Sub3_5419.aFloat8103)) {
                            if (class318_sub3 != null || aClass353Array5524 != null) {
                                JagTheoraDecoder.aFloat1010 = (((class101_sub2.aFloat5700) * (class101_sub2_180_.aFloat5708)) + ((class101_sub2.aFloat5711) * class101_sub2_180_.aFloat5711) + ((class101_sub2.aFloat5704) * class101_sub2_180_.aFloat5736));
                                HashNodeSub4.aFloat9516 = (((class101_sub2.aFloat5711) * (class101_sub2_180_.aFloat5704)) + ((class101_sub2_180_.aFloat5732) * (class101_sub2.aFloat5700)) + ((class101_sub2_180_.aFloat5716) * (class101_sub2.aFloat5704)));
                                RenderableSub6.aFloat6430 = (((class101_sub2.aFloat5708) * (class101_sub2_180_.aFloat5704)) + ((class101_sub2.aFloat5722) * class101_sub2_180_.aFloat5732) + ((class101_sub2.aFloat5732) * class101_sub2_180_.aFloat5716));
                                ShaderCompilerSub3.aFloat6523 = (((class101_sub2_180_.aFloat5736) * (class101_sub2.aFloat5716)) + (((class101_sub2.aFloat5691) * class101_sub2_180_.aFloat5708) + ((class101_sub2.aFloat5736) * (class101_sub2_180_.aFloat5711))));
                                NodeSub20.aFloat6835 = (((class101_sub2_180_.aFloat5711) * (class101_sub2.aFloat5708)) + ((class101_sub2_180_.aFloat5708) * (class101_sub2.aFloat5722)) + ((class101_sub2.aFloat5732) * class101_sub2_180_.aFloat5736));
                                GraphicsToolkit.aFloat4582 = (((class101_sub2.aFloat5736) * (class101_sub2_180_.aFloat5704)) + ((class101_sub2.aFloat5691) * class101_sub2_180_.aFloat5732) + ((class101_sub2_180_.aFloat5716) * (class101_sub2.aFloat5716)));
                            }
                            if (class318_sub3 != null) {
                                int i_192_ = anInt5467 + anInt5507 >> 1;
                                int i_193_ = anInt5418 + anInt5443 >> 1;
                                int i_194_ = (int) (Component35.aFloat4268 + ((float) i_192_ * JagTheoraDecoder.aFloat1010) + ((Component252.aFloat10199) * (float) anInt5461) + ((float) i_193_ * (HashNodeSub4.aFloat9516)));
                                int i_195_ = (int) (NodeSub12.aFloat6752 + (NodeSub20.aFloat6835 * (float) i_192_) + ((float) anInt5461 * Component200.aFloat3710) + (RenderableSub6.aFloat6430 * (float) i_193_));
                                int i_196_ = (int) (((float) anInt5461 * Component45.aFloat4338) + ((ShaderCompilerSub3.aFloat6523 * (float) i_192_) + Component49.aFloat4673) + (float) i_193_ * GraphicsToolkit.aFloat4582);
                                int i_197_ = (int) (((float) anInt5509 * (Component252.aFloat10199)) + (Component35.aFloat4268 + (JagTheoraDecoder.aFloat1010 * (float) i_192_)) + (HashNodeSub4.aFloat9516 * (float) i_193_));
                                int i_198_ = (int) ((RenderableSub6.aFloat6430 * (float) i_193_) + (NodeSub12.aFloat6752 + (NodeSub20.aFloat6835 * (float) i_192_) + (Component200.aFloat3710 * (float) anInt5509)));
                                class318_sub3.anInt6402 = ((i_195_ * aHa_Sub3_5419.anInt8134 / i) + aHa_Sub3_5419.anInt8130);
                                class318_sub3.anInt6405 = (aHa_Sub3_5419.anInt8094 - -(i_194_ * (aHa_Sub3_5419.anInt8129) / i));
                                class318_sub3.anInt6404 = (aHa_Sub3_5419.anInt8130 - -(aHa_Sub3_5419.anInt8134 * i_198_ / i));
                                class318_sub3.anInt6406 = ((i_197_ * aHa_Sub3_5419.anInt8129 / i) + aHa_Sub3_5419.anInt8094);
                                int i_199_ = (int) (GraphicsToolkit.aFloat4582 * (float) i_193_ + (((float) anInt5509 * Component45.aFloat4338) + ((ShaderCompilerSub3.aFloat6523 * (float) i_192_) + Component49.aFloat4673)));
                                if (i_196_ >= aHa_Sub3_5419.anInt8095 || (aHa_Sub3_5419.anInt8095 <= i_199_)) {
                                    class318_sub3.anInt6403 = (aHa_Sub3_5419.anInt8094 + (((anInt5510 + i_194_) * (aHa_Sub3_5419.anInt8129) / i) + -class318_sub3.anInt6405));
                                    class318_sub3.aBoolean6401 = true;
                                }
                            }
                            aHa_Sub3_5419.getRenderbufferParameter((float) i, -68);
                            aHa_Sub3_5419.bindBufferBase((byte) -21);
                            aHa_Sub3_5419.setShaderUniform(0, class101_sub2_180_);
                            tick(416776206);
                            renderParticles(94);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.Q(" + (class101 != null ? "{...}" : "null") + ',' + (class318_sub3 != null ? "{...}" : "null") + ',' + i + ',' + i_179_ + ')'));
        }
    }

    private final short method669(int i, long l, int i_200_, int i_201_, int i_202_, int i_203_, float f, int i_204_, float f_205_, DisplayModeManagerContainer77 class124, int i_206_) {
        try {
            if (i_203_ >= -49) vertexY = null;
            anInt5407++;
            int i_207_ = anIntArray5455[i_204_];
            int i_208_ = anIntArray5455[i_204_ + 1];
            int i_209_ = 0;
            for (int i_210_ = i_207_; i_210_ < i_208_; i_210_++) {
                short i_211_ = aShortArray5439[i_210_];
                if (i_211_ == 0) {
                    i_209_ = i_210_;
                    break;
                }
                if (DefinitionSub37.aLongArray9465[i_210_] == l) return (short) (-1 + i_211_);
            }
            aShortArray5439[i_209_] = (short) (1 + anInt5475);
            DefinitionSub37.aLongArray9465[i_209_] = l;
            aShortArray5416[anInt5475] = (short) i_200_;
            aShortArray5470[anInt5475] = (short) i_204_;
            aShortArray5493[anInt5475] = (short) i_202_;
            aShortArray5438[anInt5475] = (short) i_206_;
            aShortArray5436[anInt5475] = (short) i;
            aByteArray5499[anInt5475] = (byte) i_201_;
            aFloatArray5476[anInt5475] = f;
            aFloatArray5506[anInt5475] = f_205_;
            return (short) anInt5475++;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.SA(" + i + ',' + l + ',' + i_200_ + ',' + i_201_ + ',' + i_202_ + ',' + i_203_ + ',' + f + ',' + i_204_ + ',' + f_205_ + ',' + (class124 != null ? "{...}" : "null") + ',' + i_206_ + ')'));
        }
    }

    final boolean r() {
        anInt5422++;
        return aBoolean5502;
    }

    final int da() {
        anInt5409++;
        return aShort5427;
    }

    final int RA() {
        if (!aBoolean5477) computeBoundingBox(0);
        anInt5489++;
        return anInt5467;
    }

    final int fa() {
        anInt5526++;
        if (!aBoolean5477) computeBoundingBox(0);
        return anInt5461;
    }

    private final void clearVisibility(int i) {
        if (aClass290_5482 != null) aClass290_5482.aBoolean3714 = false;
        if (i > -82) LA(97);
        anInt5458++;
    }

    final void method605(int i, int[] is, int i_212_, int i_213_, int i_214_, int i_215_, boolean bool) {
        try {
            anInt5498++;
            int i_216_ = is.length;
            if (i == 0) {
                i_213_ <<= 4;
                i_212_ <<= 4;
                i_214_ <<= 4;
                AssetCacheLoader.anInt386 = 0;
                Component257.anInt4795 = 0;
                int i_217_ = 0;
                InputHandler.anInt4274 = 0;
                for (int i_218_ = 0; i_218_ < i_216_; i_218_++) {
                    int i_219_ = is[i_218_];
                    if (i_219_ < anIntArrayArray5413.length) {
                        int[] is_220_ = anIntArrayArray5413[i_219_];
                        for (int i_221_ = 0; i_221_ < is_220_.length; i_221_++) {
                            int i_222_ = is_220_[i_221_];
                            Component257.anInt4795 += vertexX[i_222_];
                            AssetCacheLoader.anInt386 += vertexY[i_222_];
                            InputHandler.anInt4274 += vertexZ[i_222_];
                            i_217_++;
                        }
                    }
                }
                if (i_217_ > 0) {
                    AssetCacheLoader.anInt386 = AssetCacheLoader.anInt386 / i_217_ - -i_213_;
                    InputHandler.anInt4274 = InputHandler.anInt4274 / i_217_ + i_214_;
                    Component257.anInt4795 = Component257.anInt4795 / i_217_ - -i_212_;
                } else {
                    AssetCacheLoader.anInt386 = i_213_;
                    InputHandler.anInt4274 = i_214_;
                    Component257.anInt4795 = i_212_;
                }
            } else if (i == 1) {
                i_213_ <<= 4;
                i_212_ <<= 4;
                i_214_ <<= 4;
                for (int i_223_ = 0; i_216_ > i_223_; i_223_++) {
                    int i_224_ = is[i_223_];
                    if (anIntArrayArray5413.length > i_224_) {
                        int[] is_225_ = anIntArrayArray5413[i_224_];
                        for (int i_226_ = 0; (i_226_ < is_225_.length); i_226_++) {
                            int i_227_ = is_225_[i_226_];
                            vertexX[i_227_] += i_212_;
                            vertexY[i_227_] += i_213_;
                            vertexZ[i_227_] += i_214_;
                        }
                    }
                }
            } else if (i == 2) {
                for (int i_228_ = 0; i_228_ < i_216_; i_228_++) {
                    int i_229_ = is[i_228_];
                    if (anIntArrayArray5413.length > i_229_) {
                        int[] is_230_ = anIntArrayArray5413[i_229_];
                        if ((0x1 & i_215_) == 0) {
                            for (int i_231_ = 0; (is_230_.length > i_231_); i_231_++) {
                                int i_232_ = is_230_[i_231_];
                                vertexX[i_232_] -= Component257.anInt4795;
                                vertexY[i_232_] -= AssetCacheLoader.anInt386;
                                vertexZ[i_232_] -= InputHandler.anInt4274;
                                if (i_214_ != 0) {
                                    int i_233_ = DisplayModeManagerContainer88.anIntArray1207[i_214_];
                                    int i_234_ = DisplayModeManagerContainer88.anIntArray1204[i_214_];
                                    int i_235_ = ((16383 + (i_234_ * vertexX[i_232_] + (vertexY[i_232_] * i_233_))) >> 14);
                                    vertexY[i_232_] = ((16383 + (i_234_ * vertexY[i_232_] + -(i_233_ * vertexX[i_232_]))) >> 14);
                                    vertexX[i_232_] = i_235_;
                                }
                                if (i_212_ != 0) {
                                    int i_236_ = DisplayModeManagerContainer88.anIntArray1207[i_212_];
                                    int i_237_ = DisplayModeManagerContainer88.anIntArray1204[i_212_];
                                    int i_238_ = (16383 + (-(i_236_ * vertexZ[i_232_]) + i_237_ * (vertexY[i_232_])) >> 14);
                                    vertexZ[i_232_] = (16383 + (i_236_ * vertexY[i_232_] - -(vertexZ[i_232_] * i_237_))) >> 14;
                                    vertexY[i_232_] = i_238_;
                                }
                                if (i_213_ != 0) {
                                    int i_239_ = DisplayModeManagerContainer88.anIntArray1207[i_213_];
                                    int i_240_ = DisplayModeManagerContainer88.anIntArray1204[i_213_];
                                    int i_241_ = ((i_239_ * vertexZ[i_232_] + i_240_ * vertexX[i_232_] + 16383) >> 14);
                                    vertexZ[i_232_] = (16383 + (-(i_239_ * vertexX[i_232_]) + i_240_ * (vertexZ[i_232_])) >> 14);
                                    vertexX[i_232_] = i_241_;
                                }
                                vertexX[i_232_] += Component257.anInt4795;
                                vertexY[i_232_] += AssetCacheLoader.anInt386;
                                vertexZ[i_232_] += InputHandler.anInt4274;
                            }
                        } else {
                            for (int i_242_ = 0; i_242_ < is_230_.length; i_242_++) {
                                int i_243_ = is_230_[i_242_];
                                vertexX[i_243_] -= Component257.anInt4795;
                                vertexY[i_243_] -= AssetCacheLoader.anInt386;
                                vertexZ[i_243_] -= InputHandler.anInt4274;
                                if (i_212_ != 0) {
                                    int i_244_ = DisplayModeManagerContainer88.anIntArray1207[i_212_];
                                    int i_245_ = DisplayModeManagerContainer88.anIntArray1204[i_212_];
                                    int i_246_ = (vertexY[i_243_] * i_245_ + -(i_244_ * vertexZ[i_243_]) + 16383) >> 14;
                                    vertexZ[i_243_] = ((16383 + vertexZ[i_243_] * i_245_ + i_244_ * vertexY[i_243_]) >> 14);
                                    vertexY[i_243_] = i_246_;
                                }
                                if (i_214_ != 0) {
                                    int i_247_ = DisplayModeManagerContainer88.anIntArray1207[i_214_];
                                    int i_248_ = DisplayModeManagerContainer88.anIntArray1204[i_214_];
                                    int i_249_ = ((i_248_ * vertexX[i_243_] + i_247_ * vertexY[i_243_] + 16383) >> 14);
                                    vertexY[i_243_] = (vertexY[i_243_] * i_248_ - (vertexX[i_243_] * i_247_ + -16383)) >> 14;
                                    vertexX[i_243_] = i_249_;
                                }
                                if (i_213_ != 0) {
                                    int i_250_ = DisplayModeManagerContainer88.anIntArray1207[i_213_];
                                    int i_251_ = DisplayModeManagerContainer88.anIntArray1204[i_213_];
                                    int i_252_ = ((i_251_ * vertexX[i_243_] + i_250_ * vertexZ[i_243_] - -16383) >> 14);
                                    vertexZ[i_243_] = ((16383 + -(vertexX[i_243_] * i_250_) + vertexZ[i_243_] * i_251_) >> 14);
                                    vertexX[i_243_] = i_252_;
                                }
                                vertexX[i_243_] += Component257.anInt4795;
                                vertexY[i_243_] += AssetCacheLoader.anInt386;
                                vertexZ[i_243_] += InputHandler.anInt4274;
                            }
                        }
                    }
                }
                if (bool) {
                    for (int i_253_ = 0; i_216_ > i_253_; i_253_++) {
                        int i_254_ = is[i_253_];
                        if (i_254_ < anIntArrayArray5413.length) {
                            int[] is_255_ = anIntArrayArray5413[i_254_];
                            for (int i_256_ = 0; i_256_ < is_255_.length; i_256_++) {
                                int i_257_ = is_255_[i_256_];
                                int i_258_ = anIntArray5455[i_257_];
                                int i_259_ = anIntArray5455[1 + i_257_];
                                for (int i_260_ = i_258_; (i_259_ > i_260_); i_260_++) {
                                    int i_261_ = aShortArray5439[i_260_] + -1;
                                    if (i_261_ == -1) break;
                                    if (i_214_ != 0) {
                                        int i_262_ = DisplayModeManagerContainer88.anIntArray1207[i_214_];
                                        int i_263_ = DisplayModeManagerContainer88.anIntArray1204[i_214_];
                                        int i_264_ = ((16383 + (aShortArray5438[i_261_] * i_262_) + (aShortArray5493[i_261_] * i_263_)) >> 14);
                                        aShortArray5438[i_261_] = (short) (((i_263_ * (aShortArray5438[i_261_])) + -((aShortArray5493[i_261_]) * i_262_) + 16383) >> 14);
                                        aShortArray5493[i_261_] = (short) i_264_;
                                    }
                                    if (i_212_ != 0) {
                                        int i_265_ = DisplayModeManagerContainer88.anIntArray1207[i_212_];
                                        int i_266_ = DisplayModeManagerContainer88.anIntArray1204[i_212_];
                                        int i_267_ = ((16383 + (aShortArray5438[i_261_] * i_266_) + -(i_265_ * aShortArray5436[i_261_])) >> 14);
                                        aShortArray5436[i_261_] = (short) ((16383 + ((i_266_ * (aShortArray5436[i_261_])) + ((aShortArray5438[i_261_]) * i_265_))) >> 14);
                                        aShortArray5438[i_261_] = (short) i_267_;
                                    }
                                    if (i_213_ != 0) {
                                        int i_268_ = DisplayModeManagerContainer88.anIntArray1207[i_213_];
                                        int i_269_ = DisplayModeManagerContainer88.anIntArray1204[i_213_];
                                        int i_270_ = (i_269_ * aShortArray5493[i_261_] + (i_268_ * aShortArray5436[i_261_]) - -16383) >> 14;
                                        aShortArray5436[i_261_] = (short) ((-(i_268_ * (aShortArray5493[i_261_])) + (aShortArray5436[i_261_]) * i_269_ - -16383) >> 14);
                                        aShortArray5493[i_261_] = (short) i_270_;
                                    }
                                }
                            }
                        }
                    }
                    updateState((byte) 69);
                }
            } else if (i == 3) {
                for (int i_271_ = 0; i_216_ > i_271_; i_271_++) {
                    int i_272_ = is[i_271_];
                    if (i_272_ < anIntArrayArray5413.length) {
                        int[] is_273_ = anIntArrayArray5413[i_272_];
                        for (int i_274_ = 0; is_273_.length > i_274_; i_274_++) {
                            int i_275_ = is_273_[i_274_];
                            vertexX[i_275_] -= Component257.anInt4795;
                            vertexY[i_275_] -= AssetCacheLoader.anInt386;
                            vertexZ[i_275_] -= InputHandler.anInt4274;
                            vertexX[i_275_] = (vertexX[i_275_] * i_212_ >> 7);
                            vertexY[i_275_] = vertexY[i_275_] * i_213_ >> 7;
                            vertexZ[i_275_] = i_214_ * vertexZ[i_275_] >> 7;
                            vertexX[i_275_] += Component257.anInt4795;
                            vertexY[i_275_] += AssetCacheLoader.anInt386;
                            vertexZ[i_275_] += InputHandler.anInt4274;
                        }
                    }
                }
            } else if (i == 5) {
                if (anIntArrayArray5492 != null) {
                    boolean bool_276_ = false;
                    for (int i_277_ = 0; i_277_ < i_216_; i_277_++) {
                        int i_278_ = is[i_277_];
                        if (anIntArrayArray5492.length > i_278_) {
                            int[] is_279_ = anIntArrayArray5492[i_278_];
                            for (int i_280_ = 0; is_279_.length > i_280_; i_280_++) {
                                int i_281_ = is_279_[i_280_];
                                int i_282_ = ((0xff & aByteArray5515[i_281_]) - -(8 * i_212_));
                                if (i_282_ >= 0) {
                                    if (i_282_ > 255) i_282_ = 255;
                                } else i_282_ = 0;
                                aByteArray5515[i_281_] = (byte) i_282_;
                            }
                            bool_276_ = bool_276_ | is_279_.length > 0;
                        }
                    }
                    if (bool_276_) {
                        if (aClass353Array5524 != null) {
                            for (int i_283_ = 0; anInt5406 > i_283_; i_283_++) {
                                Component45 class353 = aClass353Array5524[i_283_];
                                NativeLibLoader class334 = aClass334Array5442[i_283_];
                                class334.anInt4156 = ((0xffffff & class334.anInt4156) | (255 + -(0xff & (aByteArray5515[(class353.anInt4342)])) << 24));
                            }
                        }
                        clearVisibility(-86);
                    }
                }
            } else if (i == 7) {
                if (anIntArrayArray5492 != null) {
                    boolean bool_284_ = false;
                    for (int i_285_ = 0; i_216_ > i_285_; i_285_++) {
                        int i_286_ = is[i_285_];
                        if (anIntArrayArray5492.length > i_286_) {
                            int[] is_287_ = anIntArrayArray5492[i_286_];
                            for (int i_288_ = 0; i_288_ < is_287_.length; i_288_++) {
                                int i_289_ = is_287_[i_288_];
                                int i_290_ = aShortArray5486[i_289_] & 0xffff;
                                int i_291_ = (0xfc26 & i_290_) >> 10;
                                int i_292_ = 0x7 & i_290_ >> 7;
                                int i_293_ = 0x7f & i_290_;
                                i_292_ += i_213_ / 4;
                                i_291_ = i_212_ + i_291_ & 0x3f;
                                if (i_292_ >= 0) {
                                    if (i_292_ > 7) i_292_ = 7;
                                } else i_292_ = 0;
                                i_293_ += i_214_;
                                if (i_293_ >= 0) {
                                    if (i_293_ > 127) i_293_ = 127;
                                } else i_293_ = 0;
                                aShortArray5486[i_289_] = (short) (Component224.bitwiseOr(i_293_, (Component224.bitwiseOr(i_291_ << 10, i_292_ << 7))));
                            }
                            bool_284_ = bool_284_ | is_287_.length > 0;
                        }
                    }
                    if (bool_284_) {
                        if (aClass353Array5524 != null) {
                            for (int i_294_ = 0; anInt5406 > i_294_; i_294_++) {
                                Component45 class353 = aClass353Array5524[i_294_];
                                NativeLibLoader class334 = aClass334Array5442[i_294_];
                                class334.anInt4156 = (0xffffff & (RunescapeInfo.anIntArray179[(aShortArray5486[(class353.anInt4342)]) & 0xffff]) | (~0xffffff & class334.anInt4156));
                            }
                        }
                        clearVisibility(-100);
                    }
                }
            } else if (i == 8) {
                if (anIntArrayArray5412 != null) {
                    for (int i_295_ = 0; i_216_ > i_295_; i_295_++) {
                        int i_296_ = is[i_295_];
                        if (anIntArrayArray5412.length > i_296_) {
                            int[] is_297_ = anIntArrayArray5412[i_296_];
                            for (int i_298_ = 0; (is_297_.length > i_298_); i_298_++) {
                                NativeLibLoader class334 = aClass334Array5442[is_297_[i_298_]];
                                class334.anInt4158 += i_212_;
                                class334.anInt4154 += i_213_;
                            }
                        }
                    }
                }
            } else if (i == 10) {
                if (anIntArrayArray5412 != null) {
                    for (int i_299_ = 0; i_216_ > i_299_; i_299_++) {
                        int i_300_ = is[i_299_];
                        if (i_300_ < anIntArrayArray5412.length) {
                            int[] is_301_ = anIntArrayArray5412[i_300_];
                            for (int i_302_ = 0; is_301_.length > i_302_; i_302_++) {
                                NativeLibLoader class334 = aClass334Array5442[is_301_[i_302_]];
                                class334.anInt4165 = (i_212_ * class334.anInt4165 >> 7);
                                class334.anInt4162 = (i_213_ * class334.anInt4162 >> 7);
                            }
                        }
                    }
                }
            } else if (i == 9) {
                if (anIntArrayArray5412 != null) {
                    for (int i_303_ = 0; i_303_ < i_216_; i_303_++) {
                        int i_304_ = is[i_303_];
                        if (anIntArrayArray5412.length > i_304_) {
                            int[] is_305_ = anIntArrayArray5412[i_304_];
                            for (int i_306_ = 0; (i_306_ < is_305_.length); i_306_++) {
                                NativeLibLoader class334 = aClass334Array5442[is_305_[i_306_]];
                                class334.anInt4151 = 0x3fff & i_212_ + (class334.anInt4151);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.BB(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_212_ + ',' + i_213_ + ',' + i_214_ + ',' + i_215_ + ',' + bool + ')'));
        }
    }

    final void render(DisplayModeManagerContainer204 class101, RenderableSub3 class318_sub3, int i) {
        try {
            anInt5471++;
            if (anInt5475 != 0) {
                MatrixSub2 class101_sub2 = aHa_Sub3_5419.aClass101_Sub2_8080;
                MatrixSub2 class101_sub2_307_ = (MatrixSub2) class101;
                if (!aBoolean5477) computeBoundingBox(0);
                Component45.aFloat4338 = ((class101_sub2.aFloat5736 * class101_sub2_307_.aFloat5700) + (class101_sub2.aFloat5691 * class101_sub2_307_.aFloat5722) + (class101_sub2_307_.aFloat5691 * class101_sub2.aFloat5716));
                Component49.aFloat4673 = ((class101_sub2_307_.aFloat5724 * class101_sub2.aFloat5716) + ((class101_sub2.aFloat5691 * class101_sub2_307_.aFloat5710) + (class101_sub2_307_.aFloat5729 * class101_sub2.aFloat5736)) + class101_sub2.aFloat5724);
                float f = (Component45.aFloat4338 * (float) anInt5461 + Component49.aFloat4673);
                float f_308_ = ((float) anInt5509 * Component45.aFloat4338 + Component49.aFloat4673);
                float f_309_;
                float f_310_;
                if (f > f_308_) {
                    f_309_ = (float) anInt5510 + f;
                    f_310_ = f_308_ - (float) anInt5510;
                } else {
                    f_309_ = (float) anInt5510 + f_308_;
                    f_310_ = f - (float) anInt5510;
                }
                if (!(aHa_Sub3_5419.aFloat8169 <= f_310_) && !(f_309_ <= (float) aHa_Sub3_5419.anInt8095)) {
                    Component35.aFloat4268 = (class101_sub2.aFloat5729 + ((class101_sub2.aFloat5700 * (class101_sub2_307_.aFloat5710)) + (class101_sub2.aFloat5711 * (class101_sub2_307_.aFloat5729)) + (class101_sub2.aFloat5704 * (class101_sub2_307_.aFloat5724))));
                    Component252.aFloat10199 = ((class101_sub2.aFloat5704 * class101_sub2_307_.aFloat5691) + ((class101_sub2_307_.aFloat5700 * class101_sub2.aFloat5711) + (class101_sub2.aFloat5700 * (class101_sub2_307_.aFloat5722))));
                    float f_311_ = (((float) anInt5461 * Component252.aFloat10199) + Component35.aFloat4268);
                    float f_312_ = (Component35.aFloat4268 + (Component252.aFloat10199 * (float) anInt5509));
                    float f_313_;
                    float f_314_;
                    if (f_311_ > f_312_) {
                        f_313_ = ((f_311_ + (float) anInt5510) * (float) aHa_Sub3_5419.anInt8129);
                        f_314_ = ((float) aHa_Sub3_5419.anInt8129 * ((float) -anInt5510 + f_312_));
                    } else {
                        f_313_ = ((f_312_ + (float) anInt5510) * (float) aHa_Sub3_5419.anInt8129);
                        f_314_ = ((float) aHa_Sub3_5419.anInt8129 * ((float) -anInt5510 + f_311_));
                    }
                    if (!(aHa_Sub3_5419.aFloat8158 <= f_314_ / f_309_) && !(f_313_ / f_309_ <= aHa_Sub3_5419.aFloat8126)) {
                        Component200.aFloat3710 = ((class101_sub2_307_.aFloat5691 * class101_sub2.aFloat5732) + ((class101_sub2.aFloat5722 * (class101_sub2_307_.aFloat5722)) + (class101_sub2.aFloat5708 * (class101_sub2_307_.aFloat5700))));
                        NodeSub12.aFloat6752 = ((class101_sub2_307_.aFloat5724 * class101_sub2.aFloat5732) + (((class101_sub2_307_.aFloat5729) * (class101_sub2.aFloat5708)) + ((class101_sub2_307_.aFloat5710) * (class101_sub2.aFloat5722))) + class101_sub2.aFloat5710);
                        float f_315_ = ((float) anInt5461 * Component200.aFloat3710 + NodeSub12.aFloat6752);
                        float f_316_ = (Component200.aFloat3710 * (float) anInt5509 + NodeSub12.aFloat6752);
                        float f_317_;
                        float f_318_;
                        if (f_316_ < f_315_) {
                            f_317_ = ((float) aHa_Sub3_5419.anInt8134 * ((float) anInt5510 + f_315_));
                            f_318_ = ((float) aHa_Sub3_5419.anInt8134 * ((float) -anInt5510 + f_316_));
                        } else {
                            f_317_ = (((float) anInt5510 + f_316_) * (float) (aHa_Sub3_5419.anInt8134));
                            f_318_ = ((f_315_ - (float) anInt5510) * (float) (aHa_Sub3_5419.anInt8134));
                        }
                        if (!(aHa_Sub3_5419.aFloat8185 <= f_318_ / f_309_) && !(f_317_ / f_309_ <= aHa_Sub3_5419.aFloat8103)) {
                            if (class318_sub3 != null || aClass353Array5524 != null) {
                                ShaderCompilerSub3.aFloat6523 = (((class101_sub2.aFloat5716) * (class101_sub2_307_.aFloat5736)) + ((class101_sub2_307_.aFloat5711 * (class101_sub2.aFloat5736)) + ((class101_sub2.aFloat5691) * (class101_sub2_307_.aFloat5708))));
                                RenderableSub6.aFloat6430 = (((class101_sub2.aFloat5708) * (class101_sub2_307_.aFloat5704)) + ((class101_sub2_307_.aFloat5732) * (class101_sub2.aFloat5722)) + ((class101_sub2.aFloat5732) * class101_sub2_307_.aFloat5716));
                                JagTheoraDecoder.aFloat1010 = (((class101_sub2.aFloat5704) * (class101_sub2_307_.aFloat5736)) + (((class101_sub2.aFloat5700) * class101_sub2_307_.aFloat5708) + ((class101_sub2.aFloat5711) * (class101_sub2_307_.aFloat5711))));
                                HashNodeSub4.aFloat9516 = (((class101_sub2.aFloat5711) * (class101_sub2_307_.aFloat5704)) + ((class101_sub2_307_.aFloat5732) * (class101_sub2.aFloat5700)) + ((class101_sub2.aFloat5704) * class101_sub2_307_.aFloat5716));
                                NodeSub20.aFloat6835 = (((class101_sub2.aFloat5708) * (class101_sub2_307_.aFloat5711)) + ((class101_sub2.aFloat5722) * class101_sub2_307_.aFloat5708) + ((class101_sub2.aFloat5732) * class101_sub2_307_.aFloat5736));
                                GraphicsToolkit.aFloat4582 = (((class101_sub2_307_.aFloat5716) * (class101_sub2.aFloat5716)) + ((class101_sub2_307_.aFloat5704 * (class101_sub2.aFloat5736)) + (class101_sub2_307_.aFloat5732 * (class101_sub2.aFloat5691))));
                            }
                            if (class318_sub3 != null) {
                                boolean bool = false;
                                boolean bool_319_ = true;
                                int i_320_ = anInt5507 - -anInt5467 >> 1;
                                int i_321_ = anInt5418 + anInt5443 >> 1;
                                int i_322_ = (int) (((float) anInt5461 * (Component252.aFloat10199)) + (Component35.aFloat4268 + (JagTheoraDecoder.aFloat1010 * (float) i_320_)) + (HashNodeSub4.aFloat9516 * (float) i_321_));
                                int i_323_ = (int) ((RenderableSub6.aFloat6430 * (float) i_321_) + (((float) i_320_ * NodeSub20.aFloat6835) + NodeSub12.aFloat6752 + (Component200.aFloat3710 * (float) anInt5461)));
                                int i_324_ = (int) (Component49.aFloat4673 + ((float) i_320_ * ShaderCompilerSub3.aFloat6523) + ((float) anInt5461 * Component45.aFloat4338) + (float) i_321_ * GraphicsToolkit.aFloat4582);
                                if (aHa_Sub3_5419.anInt8095 > i_324_) bool = true;
                                else {
                                    class318_sub3.anInt6402 = (aHa_Sub3_5419.anInt8130 - -(i_323_ * (aHa_Sub3_5419.anInt8134) / i_324_));
                                    class318_sub3.anInt6405 = ((aHa_Sub3_5419.anInt8129 * i_322_ / i_324_) + (aHa_Sub3_5419.anInt8094));
                                }
                                int i_325_ = (int) ((Component252.aFloat10199) * (float) anInt5509 + (Component35.aFloat4268 + (JagTheoraDecoder.aFloat1010 * (float) i_320_)) + ((float) i_321_ * (HashNodeSub4.aFloat9516)));
                                int i_326_ = (int) ((Component200.aFloat3710 * (float) anInt5509) + (NodeSub12.aFloat6752 + ((float) i_320_ * (NodeSub20.aFloat6835))) + ((float) i_321_ * RenderableSub6.aFloat6430));
                                int i_327_ = (int) (((float) anInt5509 * Component45.aFloat4338) + (Component49.aFloat4673 + ((float) i_320_ * ShaderCompilerSub3.aFloat6523)) + GraphicsToolkit.aFloat4582 * (float) i_321_);
                                if (aHa_Sub3_5419.anInt8095 > i_327_) bool = true;
                                else {
                                    class318_sub3.anInt6406 = (aHa_Sub3_5419.anInt8094 + (i_325_ * (aHa_Sub3_5419.anInt8129) / i_327_));
                                    class318_sub3.anInt6404 = (aHa_Sub3_5419.anInt8130 - -(i_326_ * (aHa_Sub3_5419.anInt8134) / i_327_));
                                }
                                if (bool) {
                                    if ((aHa_Sub3_5419.anInt8095 > i_324_) && ((aHa_Sub3_5419.anInt8095) > i_327_)) bool_319_ = false;
                                    else if (i_324_ >= (aHa_Sub3_5419.anInt8095)) {
                                        if (aHa_Sub3_5419.anInt8095 > i_327_) {
                                            int i_328_ = ((i_324_ + -(aHa_Sub3_5419.anInt8095) << 16) / (-i_327_ + i_324_));
                                            int i_329_ = i_322_ + (((i_322_ - i_325_) * i_328_) >> 16);
                                            int i_330_ = (((-i_326_ + i_323_) * i_328_ >> 16) + i_323_);
                                            class318_sub3.anInt6405 = ((aHa_Sub3_5419.anInt8094) + (aHa_Sub3_5419.anInt8129 * i_329_ / (aHa_Sub3_5419.anInt8095)));
                                            class318_sub3.anInt6402 = ((aHa_Sub3_5419.anInt8130) + (i_330_ * (aHa_Sub3_5419.anInt8134) / (aHa_Sub3_5419.anInt8095)));
                                        }
                                    } else {
                                        int i_331_ = ((-(aHa_Sub3_5419.anInt8095) + i_327_ << 16) / (-i_324_ + i_327_));
                                        int i_332_ = ((i_331_ * (-i_322_ + i_325_) >> 16) + i_325_);
                                        int i_333_ = (i_326_ - -(i_331_ * (-i_323_ + i_326_) >> 16));
                                        class318_sub3.anInt6405 = ((aHa_Sub3_5419.anInt8094) + (i_332_ * (aHa_Sub3_5419.anInt8129) / (aHa_Sub3_5419.anInt8095)));
                                        class318_sub3.anInt6402 = ((i_333_ * (aHa_Sub3_5419.anInt8134) / (aHa_Sub3_5419.anInt8095)) + (aHa_Sub3_5419.anInt8130));
                                    }
                                }
                                if (bool_319_) {
                                    if (i_324_ <= i_327_) class318_sub3.anInt6403 = (-class318_sub3.anInt6406 + (((aHa_Sub3_5419.anInt8129) * (i_325_ + anInt5510) / i_327_) + (aHa_Sub3_5419.anInt8094)));
                                    else class318_sub3.anInt6403 = (-class318_sub3.anInt6405 + (((i_322_ + anInt5510) * (aHa_Sub3_5419.anInt8129) / i_324_) + (aHa_Sub3_5419.anInt8094)));
                                    class318_sub3.aBoolean6401 = true;
                                }
                            }
                            aHa_Sub3_5419.bindBuffer(8);
                            aHa_Sub3_5419.setShaderUniform(0, class101_sub2_307_);
                            tick(416776206);
                            renderParticles(76);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.KA(" + (class101 != null ? "{...}" : "null") + ',' + (class318_sub3 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final void s(int i) {
        anInt5445++;
        if (aClass290_5520 != null) aClass290_5520.aBoolean3709 = Component235.method2015(i, anInt5472, 7);
        if (aClass290_5460 != null) aClass290_5460.aBoolean3709 = Component191.method1379(4, anInt5472, i);
        if (aClass290_5482 != null) aClass290_5482.aBoolean3709 = PacketReader.isPacketAllowed(i, anInt5472, (byte) 73);
        if (aClass290_5424 != null) aClass290_5424.aBoolean3709 = Component380.method1113(i, anInt5472, -10);
        anInt5463 = i;
        aBoolean5402 = true;
        if (aClass151_5503 != null && (anInt5463 & 0x10000) == 0) {
            aShortArray5438 = aClass151_5503.aShortArray2060;
            aShortArray5436 = aClass151_5503.aShortArray2058;
            aShortArray5493 = aClass151_5503.aShortArray2067;
            aByteArray5499 = aClass151_5503.aByteArray2069;
            aClass151_5503 = null;
        }
        beginFrame(262144);
    }

    final int V() {
        anInt5464++;
        if (!aBoolean5477) computeBoundingBox(0);
        return anInt5507;
    }

    final boolean areTexturesReady() {
        anInt5410++;
        if (aShortArray5423 == null) return true;
        for (int i = 0; i < aShortArray5423.length; i++) {
            if (aShortArray5423[i] != -1 && !aHa_Sub3_5419.modelProvider.isModelLoaded(-7953, aShortArray5423[i])) return false;
        }
        return true;
    }

    DisplayModeManagerContainer190(GlToolkitSub3 var_ha_Sub3, DisplayModeManagerContainer77 class124, int i, int i_334_, int i_335_, int i_336_) {
        this(var_ha_Sub3, i, i_336_, true, false);
        do {
            try {
                d var_d = var_ha_Sub3.modelProvider;
                int[] is = new int[class124.anInt1817];
                anIntArray5455 = new int[1 + class124.anInt1821];
                for (int i_337_ = 0; i_337_ < class124.anInt1817; i_337_++) {
                    if (class124.aByteArray1843 == null || class124.aByteArray1843[i_337_] != 2) {
                        if (class124.aShortArray1822 != null && (class124.aShortArray1822[i_337_] != -1)) {
                            Model class12 = var_d.getModel(((class124.aShortArray1822[i_337_]) & 0xffff), -6662);
                            if (((anInt5472 & 0x40) == 0 || !class12.aBoolean209) && class12.aBoolean204) continue;
                        }
                        is[anInt5478++] = i_337_;
                        anIntArray5455[(class124.aShortArray1863[i_337_])]++;
                        anIntArray5455[(class124.aShortArray1835[i_337_])]++;
                        anIntArray5455[(class124.aShortArray1855[i_337_])]++;
                    }
                }
                anInt5516 = anInt5478;
                long[] ls = new long[anInt5478];
                boolean bool = (0x100 & anInt5463) != 0;
                for (int i_338_ = 0; i_338_ < anInt5478; i_338_++) {
                    int i_339_ = is[i_338_];
                    Model class12 = null;
                    int i_340_ = 0;
                    int i_341_ = 0;
                    int i_342_ = 0;
                    int i_343_ = 0;
                    if (class124.aClass162Array1832 != null) {
                        boolean bool_344_ = false;
                        for (int i_345_ = 0; i_345_ < (class124.aClass162Array1832).length; i_345_++) {
                            DisplayModeManagerContainer133 class162 = (class124.aClass162Array1832[i_345_]);
                            if (class162.anInt2155 == i_339_) {
                                Component291 class189 = DisplayModeManagerContainer306.method742(104, (class162.anInt2153));
                                if (class189.aBoolean2531) bool_344_ = true;
                                if (class189.anInt2525 != -1) {
                                    Model class12_346_ = var_d.getModel((class189.anInt2525), -6662);
                                    if (class12_346_.anInt200 == 2) aBoolean5428 = true;
                                }
                            }
                        }
                        if (bool_344_) {
                            ls[i_338_] = 9223372036854775807L;
                            anInt5516--;
                            continue;
                        }
                    }
                    int i_347_ = -1;
                    if (class124.aShortArray1822 != null) {
                        i_347_ = class124.aShortArray1822[i_339_];
                        if (i_347_ != -1) {
                            class12 = var_d.getModel(0xffff & i_347_, -6662);
                            if ((0x40 & anInt5472) != 0 && class12.aBoolean209) {
                                i_347_ = -1;
                                class12 = null;
                            } else {
                                i_343_ = class12.aByte202;
                                i_342_ = class12.aByte213;
                            }
                        }
                    }
                    boolean bool_348_ = ((class124.aByteArray1834 != null && class124.aByteArray1834[i_339_] != 0) || (class12 != null && class12.anInt200 != 0));
                    if ((bool || bool_348_) && class124.aByteArray1839 != null) i_340_ += (class124.aByteArray1839[i_339_] << 17);
                    if (bool_348_) i_340_ += 65536;
                    i_340_ += 0xff00 & i_342_ << 8;
                    i_341_ += (i_347_ & 0xffff) << 16;
                    i_340_ += 0xff & i_343_;
                    i_341_ += 0xffff & i_338_;
                    ls[i_338_] = ((long) i_340_ << 32) + (long) i_341_;
                    DisplayModeManagerContainer190 class64_sub2_349_ = this;
                    class64_sub2_349_.aBoolean5502 = (class64_sub2_349_.aBoolean5502 | (class12 != null && (class12.aByte198 != 0 || class12.aByte211 != 0)));
                    aBoolean5428 |= bool_348_;
                }
                NodeSub16Sub2.method2832(is, ls, 0);
                anInt5497 = class124.anInt1836;
                vertexZ = class124.anIntArray1852;
                vertexY = class124.anIntArray1847;
                aShortArray5494 = class124.aShortArray1842;
                anInt5433 = class124.anInt1821;
                vertexX = class124.anIntArray1841;
                aClass342Array5474 = class124.aClass342Array1866;
                Component307[] class371s = new Component307[anInt5433];
                aClass129Array5457 = class124.aClass129Array1846;
                if (class124.aClass162Array1832 != null) {
                    anInt5406 = class124.aClass162Array1832.length;
                    aClass353Array5524 = new Component45[anInt5406];
                    aClass334Array5442 = new NativeLibLoader[anInt5406];
                    for (int i_350_ = 0; anInt5406 > i_350_; i_350_++) {
                        DisplayModeManagerContainer133 class162 = class124.aClass162Array1832[i_350_];
                        Component291 class189 = DisplayModeManagerContainer306.method742(104, (class162.anInt2153));
                        int i_351_ = -1;
                        for (int i_352_ = 0; i_352_ < anInt5478; i_352_++) {
                            if (class162.anInt2155 == is[i_352_]) {
                                i_351_ = i_352_;
                                break;
                            }
                        }
                        if (i_351_ == -1) throw new RuntimeException();
                        int i_353_ = (0xffffff & (RunescapeInfo.anIntArray179[((class124.aShortArray1862[class162.anInt2155]) & 0xffff)]));
                        i_353_ = (i_353_ | -(class124.aByteArray1834 == null ? 0 : (class124.aByteArray1834[(class162.anInt2155)])) + 255 << 24);
                        aClass353Array5524[i_350_] = new Component45(i_351_, (class124.aShortArray1863[class162.anInt2155]), (class124.aShortArray1835[class162.anInt2155]), (class124.aShortArray1855[class162.anInt2155]), class189.anInt2526, class189.anInt2530, class189.anInt2525, class189.anInt2533, class189.anInt2534, class189.aBoolean2531, class189.aBoolean2522, class162.anInt2158);
                        aClass334Array5442[i_350_] = new NativeLibLoader(i_353_);
                    }
                }
                int i_354_ = 3 * anInt5478;
                aShortArray5439 = new short[i_354_];
                aShortArray5508 = new short[anInt5478];
                aShortArray5423 = new short[anInt5478];
                aFloatArray5506 = new float[i_354_];
                aShortArray5436 = new short[i_354_];
                aShortArray5486 = new short[anInt5478];
                aByteArray5499 = new byte[i_354_];
                aShortArray5512 = new short[anInt5478];
                aShortArray5493 = new short[i_354_];
                if (class124.aShortArray1856 != null) aShortArray5432 = new short[anInt5478];
                aShortArray5470 = new short[i_354_];
                aShortArray5416 = new short[i_354_];
                DefinitionSub37.aLongArray9465 = new long[i_354_];
                aShortArray5495 = new short[anInt5478];
                aShort5452 = (short) i_334_;
                aByteArray5515 = new byte[anInt5478];
                aFloatArray5476 = new float[i_354_];
                aShort5427 = (short) i_335_;
                aShortArray5438 = new short[i_354_];
                int i_355_ = 0;
                for (int i_356_ = 0; (i_356_ < class124.anInt1821); i_356_++) {
                    int i_357_ = anIntArray5455[i_356_];
                    anIntArray5455[i_356_] = i_355_;
                    i_355_ += i_357_;
                    class371s[i_356_] = new Component307();
                }
                anIntArray5455[class124.anInt1821] = i_355_;
                Component142 class358 = Component54.method565(255, anInt5478, class124, is);
                Component227[] class63s = new Component227[class124.anInt1817];
                for (int i_358_ = 0; (class124.anInt1817 > i_358_); i_358_++) {
                    short i_359_ = class124.aShortArray1863[i_358_];
                    short i_360_ = class124.aShortArray1835[i_358_];
                    short i_361_ = class124.aShortArray1855[i_358_];
                    int i_362_ = vertexX[i_360_] - vertexX[i_359_];
                    int i_363_ = -vertexY[i_359_] + vertexY[i_360_];
                    int i_364_ = vertexZ[i_360_] - vertexZ[i_359_];
                    int i_365_ = -vertexX[i_359_] + vertexX[i_361_];
                    int i_366_ = -vertexY[i_359_] + vertexY[i_361_];
                    int i_367_ = -vertexZ[i_359_] + vertexZ[i_361_];
                    int i_368_ = i_363_ * i_367_ + -(i_366_ * i_364_);
                    int i_369_ = -(i_362_ * i_367_) + i_364_ * i_365_;
                    int i_370_;
                    for (i_370_ = i_362_ * i_366_ - i_365_ * i_363_; (i_368_ > 8192 || i_369_ > 8192 || i_370_ > 8192 || i_368_ < -8192 || i_369_ < -8192 || i_370_ < -8192); i_370_ >>= 1) {
                        i_369_ >>= 1;
                        i_368_ >>= 1;
                    }
                    int i_371_ = (int) Math.sqrt(i_369_ * i_369_ + (i_368_ * i_368_ - -(i_370_ * i_370_)));
                    if (i_371_ <= 0) i_371_ = 1;
                    i_370_ = 256 * i_370_ / i_371_;
                    i_369_ = 256 * i_369_ / i_371_;
                    i_368_ = i_368_ * 256 / i_371_;
                    byte i_372_ = (class124.aByteArray1843 != null ? class124.aByteArray1843[i_358_] : (byte) 0);
                    if (i_372_ == 0) {
                        Component307 class371 = class371s[i_359_];
                        class371.anInt4522++;
                        class371.anInt4525 += i_369_;
                        class371.anInt4520 += i_368_;
                        class371.anInt4524 += i_370_;
                        class371 = class371s[i_360_];
                        class371.anInt4520 += i_368_;
                        class371.anInt4522++;
                        class371.anInt4525 += i_369_;
                        class371.anInt4524 += i_370_;
                        class371 = class371s[i_361_];
                        class371.anInt4522++;
                        class371.anInt4520 += i_368_;
                        class371.anInt4525 += i_369_;
                        class371.anInt4524 += i_370_;
                    } else if (i_372_ == 1) {
                        Component227 class63 = class63s[i_358_] = new Component227();
                        class63.anInt1118 = i_368_;
                        class63.anInt1119 = i_369_;
                        class63.anInt1122 = i_370_;
                    }
                }
                for (int i_373_ = 0; i_373_ < anInt5478; i_373_++) {
                    int i_374_ = is[i_373_];
                    int i_375_ = (0xffff & class124.aShortArray1862[i_374_]);
                    int i_376_;
                    if (class124.aByteArray1820 != null) i_376_ = class124.aByteArray1820[i_374_];
                    else i_376_ = -1;
                    int i_377_;
                    if (class124.aByteArray1834 == null) i_377_ = 0;
                    else i_377_ = 0xff & (class124.aByteArray1834[i_374_]);
                    short i_378_ = (class124.aShortArray1822 != null ? class124.aShortArray1822[i_374_] : (short) -1);
                    if (i_378_ != -1 && (anInt5472 & 0x40) != 0) {
                        Model class12 = var_d.getModel(0xffff & i_378_, -6662);
                        if (class12.aBoolean209) i_378_ = (short) -1;
                    }
                    float f = 0.0F;
                    float f_379_ = 0.0F;
                    float f_380_ = 0.0F;
                    float f_381_ = 0.0F;
                    float f_382_ = 0.0F;
                    float f_383_ = 0.0F;
                    int i_384_ = 0;
                    int i_385_ = 0;
                    int i_386_ = 0;
                    if (i_378_ != -1) {
                        if (i_376_ == -1) {
                            f_380_ = 1.0F;
                            f_383_ = 0.0F;
                            i_384_ = 1;
                            i_385_ = 2;
                            f_382_ = 0.0F;
                            f = 0.0F;
                            f_381_ = 1.0F;
                            f_379_ = 1.0F;
                        } else {
                            i_376_ &= 0xff;
                            byte i_387_ = class124.aByteArray1823[i_376_];
                            if (i_387_ == 0) {
                                short i_415_ = (class124.aShortArray1863[i_374_]);
                                short i_416_ = (class124.aShortArray1835[i_374_]);
                                short i_417_ = (class124.aShortArray1855[i_374_]);
                                short i_418_ = (class124.aShortArray1829[i_376_]);
                                short i_419_ = (class124.aShortArray1849[i_376_]);
                                short i_420_ = (class124.aShortArray1825[i_376_]);
                                float f_421_ = (float) (class124.anIntArray1841[i_418_]);
                                float f_422_ = (float) (class124.anIntArray1847[i_418_]);
                                float f_423_ = (float) (class124.anIntArray1852[i_418_]);
                                float f_424_ = ((float) (class124.anIntArray1841[i_419_]) - f_421_);
                                float f_425_ = (-f_422_ + (float) (class124.anIntArray1847[i_419_]));
                                float f_426_ = (-f_423_ + (float) (class124.anIntArray1852[i_419_]));
                                float f_427_ = (-f_421_ + (float) (class124.anIntArray1841[i_420_]));
                                float f_428_ = ((float) (class124.anIntArray1847[i_420_]) - f_422_);
                                float f_429_ = (-f_423_ + (float) (class124.anIntArray1852[i_420_]));
                                float f_430_ = (-f_421_ + (float) (class124.anIntArray1841[i_415_]));
                                float f_431_ = ((float) (class124.anIntArray1847[i_415_]) - f_422_);
                                float f_432_ = (-f_423_ + (float) (class124.anIntArray1852[i_415_]));
                                float f_433_ = (-f_421_ + (float) (class124.anIntArray1841[i_416_]));
                                float f_434_ = ((float) (class124.anIntArray1847[i_416_]) - f_422_);
                                float f_435_ = ((float) (class124.anIntArray1852[i_416_]) - f_423_);
                                float f_436_ = (-f_421_ + (float) (class124.anIntArray1841[i_417_]));
                                float f_437_ = (-f_422_ + (float) (class124.anIntArray1847[i_417_]));
                                float f_438_ = ((float) (class124.anIntArray1852[i_417_]) - f_423_);
                                float f_439_ = f_425_ * f_429_ - f_428_ * f_426_;
                                float f_440_ = f_427_ * f_426_ - f_424_ * f_429_;
                                float f_441_ = -(f_427_ * f_425_) + f_428_ * f_424_;
                                float f_442_ = -(f_440_ * f_429_) + f_441_ * f_428_;
                                float f_443_ = -(f_441_ * f_427_) + f_439_ * f_429_;
                                float f_444_ = -(f_439_ * f_428_) + f_440_ * f_427_;
                                float f_445_ = 1.0F / (f_443_ * f_425_ + f_442_ * f_424_ + f_426_ * f_444_);
                                f = f_445_ * (f_444_ * f_432_ + (f_442_ * f_430_ + f_443_ * f_431_));
                                f_382_ = (f_444_ * f_438_ + (f_442_ * f_436_ + f_437_ * f_443_)) * f_445_;
                                f_380_ = f_445_ * (f_435_ * f_444_ + (f_443_ * f_434_ + f_442_ * f_433_));
                                f_442_ = f_441_ * f_425_ - f_440_ * f_426_;
                                f_443_ = -(f_424_ * f_441_) + f_426_ * f_439_;
                                f_444_ = -(f_439_ * f_425_) + f_440_ * f_424_;
                                f_445_ = 1.0F / (f_442_ * f_427_ + f_428_ * f_443_ + f_429_ * f_444_);
                                f_381_ = (f_433_ * f_442_ + f_434_ * f_443_ + f_444_ * f_435_) * f_445_;
                                f_383_ = (f_442_ * f_436_ + f_443_ * f_437_ + f_444_ * f_438_) * f_445_;
                                f_379_ = f_445_ * (f_432_ * f_444_ + (f_431_ * f_443_ + f_430_ * f_442_));
                            } else {
                                short i_388_ = (class124.aShortArray1863[i_374_]);
                                short i_389_ = (class124.aShortArray1835[i_374_]);
                                short i_390_ = (class124.aShortArray1855[i_374_]);
                                int i_391_ = (class358.anIntArray4416[i_376_]);
                                int i_392_ = (class358.anIntArray4415[i_376_]);
                                int i_393_ = (class358.anIntArray4414[i_376_]);
                                float[] fs = (class358.aFloatArrayArray4412[i_376_]);
                                byte i_394_ = (class124.aByteArray1853[i_376_]);
                                float f_395_ = ((float) (class124.anIntArray1867[i_376_]) / 256.0F);
                                if (i_387_ == 1) {
                                    float f_413_ = ((float) (class124.anIntArray1844[i_376_]) / 1024.0F);
                                    Component163.method1885(i_393_, (class124.anIntArray1852[i_388_]), i_394_, 8, (class124.anIntArray1841[i_388_]), Component69.aFloatArray3658, (class124.anIntArray1847[i_388_]), f_395_, i_392_, i_391_, f_413_, fs);
                                    f_379_ = Component69.aFloatArray3658[1];
                                    f = Component69.aFloatArray3658[0];
                                    Component163.method1885(i_393_, (class124.anIntArray1852[i_389_]), i_394_, 8, (class124.anIntArray1841[i_389_]), Component69.aFloatArray3658, (class124.anIntArray1847[i_389_]), f_395_, i_392_, i_391_, f_413_, fs);
                                    f_381_ = Component69.aFloatArray3658[1];
                                    f_380_ = Component69.aFloatArray3658[0];
                                    Component163.method1885(i_393_, (class124.anIntArray1852[i_390_]), i_394_, 8, (class124.anIntArray1841[i_390_]), Component69.aFloatArray3658, (class124.anIntArray1847[i_390_]), f_395_, i_392_, i_391_, f_413_, fs);
                                    f_382_ = Component69.aFloatArray3658[0];
                                    f_383_ = Component69.aFloatArray3658[1];
                                    float f_414_ = f_413_ / 2.0F;
                                    if ((i_394_ & 0x1) == 0) {
                                        if (f_414_ < -f + f_380_) {
                                            i_384_ = 1;
                                            f_380_ -= f_413_;
                                        } else if (f_414_ < -f_380_ + f) {
                                            f_380_ += f_413_;
                                            i_384_ = 2;
                                        }
                                        if (f_414_ < f_382_ - f) {
                                            f_382_ -= f_413_;
                                            i_385_ = 1;
                                        } else if (-f_382_ + f > f_414_) {
                                            i_385_ = 2;
                                            f_382_ += f_413_;
                                        }
                                    } else {
                                        if (f_414_ < -f_379_ + f_383_) {
                                            f_383_ -= f_413_;
                                            i_385_ = 1;
                                        } else if (-f_383_ + f_379_ > f_414_) {
                                            i_385_ = 2;
                                            f_383_ += f_413_;
                                        }
                                        if (-f_379_ + f_381_ > f_414_) {
                                            f_381_ -= f_413_;
                                            i_384_ = 1;
                                        } else if (-f_381_ + f_379_ > f_414_) {
                                            f_381_ += f_413_;
                                            i_384_ = 2;
                                        }
                                    }
                                } else if (i_387_ == 2) {
                                    float f_396_ = ((float) (class124.anIntArray1857[i_376_]) / 256.0F);
                                    float f_397_ = ((float) (class124.anIntArray1865[i_376_]) / 256.0F);
                                    int i_398_ = (-(class124.anIntArray1841[i_388_]) + (class124.anIntArray1841[i_389_]));
                                    int i_399_ = ((class124.anIntArray1847[i_389_]) + -(class124.anIntArray1847[i_388_]));
                                    int i_400_ = (-(class124.anIntArray1852[i_388_]) + (class124.anIntArray1852[i_389_]));
                                    int i_401_ = ((class124.anIntArray1841[i_390_]) + -(class124.anIntArray1841[i_388_]));
                                    int i_402_ = ((class124.anIntArray1847[i_390_]) - (class124.anIntArray1847[i_388_]));
                                    int i_403_ = (-(class124.anIntArray1852[i_388_]) + (class124.anIntArray1852[i_390_]));
                                    int i_404_ = (i_399_ * i_403_ + -(i_400_ * i_402_));
                                    int i_405_ = (i_401_ * i_400_ + -(i_398_ * i_403_));
                                    int i_406_ = (i_402_ * i_398_ + -(i_399_ * i_401_));
                                    float f_407_ = (64.0F / (float) (class124.anIntArray1859[i_376_]));
                                    float f_408_ = (64.0F / (float) (class124.anIntArray1816[i_376_]));
                                    float f_409_ = (64.0F / (float) (class124.anIntArray1844[i_376_]));
                                    float f_410_ = (((float) i_406_ * fs[2] + ((float) i_404_ * fs[0] + (float) i_405_ * fs[1])) / f_407_);
                                    float f_411_ = ((fs[5] * (float) i_406_ + (fs[3] * (float) i_404_ + (float) i_405_ * fs[4])) / f_408_);
                                    float f_412_ = (((float) i_405_ * fs[7] + fs[6] * (float) i_404_ + fs[8] * (float) i_406_) / f_409_);
                                    i_386_ = Component374.method2635(f_411_, false, f_412_, f_410_);
                                    NodeList.method1991(f_397_, f_395_, fs, (class124.anIntArray1852[i_388_]), i_393_, false, i_394_, i_391_, (class124.anIntArray1841[i_388_]), (class124.anIntArray1847[i_388_]), f_396_, Component69.aFloatArray3658, i_392_, i_386_);
                                    f_379_ = Component69.aFloatArray3658[1];
                                    f = Component69.aFloatArray3658[0];
                                    NodeList.method1991(f_397_, f_395_, fs, (class124.anIntArray1852[i_389_]), i_393_, false, i_394_, i_391_, (class124.anIntArray1841[i_389_]), (class124.anIntArray1847[i_389_]), f_396_, Component69.aFloatArray3658, i_392_, i_386_);
                                    f_381_ = Component69.aFloatArray3658[1];
                                    f_380_ = Component69.aFloatArray3658[0];
                                    NodeList.method1991(f_397_, f_395_, fs, (class124.anIntArray1852[i_390_]), i_393_, false, i_394_, i_391_, (class124.anIntArray1841[i_390_]), (class124.anIntArray1847[i_390_]), f_396_, Component69.aFloatArray3658, i_392_, i_386_);
                                    f_382_ = Component69.aFloatArray3658[0];
                                    f_383_ = Component69.aFloatArray3658[1];
                                } else if (i_387_ == 3) {
                                    Component113.method1367(i_393_, i_394_, f_395_, (class124.anIntArray1841[i_388_]), Component69.aFloatArray3658, (class124.anIntArray1852[i_388_]), i_391_, (class124.anIntArray1847[i_388_]), i_392_, -4, fs);
                                    f = Component69.aFloatArray3658[0];
                                    f_379_ = Component69.aFloatArray3658[1];
                                    Component113.method1367(i_393_, i_394_, f_395_, (class124.anIntArray1841[i_389_]), Component69.aFloatArray3658, (class124.anIntArray1852[i_389_]), i_391_, (class124.anIntArray1847[i_389_]), i_392_, -4, fs);
                                    f_380_ = Component69.aFloatArray3658[0];
                                    f_381_ = Component69.aFloatArray3658[1];
                                    Component113.method1367(i_393_, i_394_, f_395_, (class124.anIntArray1841[i_390_]), Component69.aFloatArray3658, (class124.anIntArray1852[i_390_]), i_391_, (class124.anIntArray1847[i_390_]), i_392_, -4, fs);
                                    f_382_ = Component69.aFloatArray3658[0];
                                    f_383_ = Component69.aFloatArray3658[1];
                                    if ((i_394_ & 0x1) == 0) {
                                        if (-f + f_382_ > 0.5F) {
                                            f_382_--;
                                            i_385_ = 1;
                                        } else if (f - f_382_ > 0.5F) {
                                            f_382_++;
                                            i_385_ = 2;
                                        }
                                        if (-f + f_380_ > 0.5F) {
                                            f_380_--;
                                            i_384_ = 1;
                                        } else if (-f_380_ + f > 0.5F) {
                                            f_380_++;
                                            i_384_ = 2;
                                        }
                                    } else {
                                        if (-f_379_ + f_383_ > 0.5F) {
                                            i_385_ = 1;
                                            f_383_--;
                                        } else if (f_379_ - f_383_ > 0.5F) {
                                            i_385_ = 2;
                                            f_383_++;
                                        }
                                        if (f_381_ - f_379_ > 0.5F) {
                                            f_381_--;
                                            i_384_ = 1;
                                        } else if (f_379_ - f_381_ > 0.5F) {
                                            i_384_ = 2;
                                            f_381_++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    byte i_446_;
                    if (class124.aByteArray1843 != null) i_446_ = class124.aByteArray1843[i_374_];
                    else i_446_ = (byte) 0;
                    if (i_446_ == 0) {
                        long l = ((long) (i_376_ << 2) + (((long) (i_375_ << 8) + ((long) (i_386_ << 24) - -(long) i_377_)) << 32));
                        short i_447_ = class124.aShortArray1863[i_374_];
                        short i_448_ = class124.aShortArray1835[i_374_];
                        short i_449_ = class124.aShortArray1855[i_374_];
                        Component307 class371 = class371s[i_447_];
                        aShortArray5508[i_373_] = method669(class371.anInt4524, l, i_373_, class371.anInt4522, class371.anInt4520, -114, f, i_447_, f_379_, class124, class371.anInt4525);
                        class371 = class371s[i_448_];
                        aShortArray5495[i_373_] = method669(class371.anInt4524, (long) i_384_ + l, i_373_, class371.anInt4522, class371.anInt4520, -68, f_380_, i_448_, f_381_, class124, class371.anInt4525);
                        class371 = class371s[i_449_];
                        aShortArray5512[i_373_] = method669(class371.anInt4524, (long) i_385_ + l, i_373_, class371.anInt4522, class371.anInt4520, -112, f_382_, i_449_, f_383_, class124, class371.anInt4525);
                    } else if (i_446_ == 1) {
                        Component227 class63 = class63s[i_374_];
                        long l = ((((long) i_377_ + ((long) (i_386_ << 24) - -(long) (i_375_ << 8))) << 32) + (long) (((256 + class63.anInt1119) << 12) + (class63.anInt1118 > 0 ? 1024 : 2048) + (i_376_ << 2) + ((class63.anInt1122 - -256) << 22)));
                        aShortArray5508[i_373_] = method669(class63.anInt1122, l, i_373_, 0, class63.anInt1118, -106, f, (class124.aShortArray1863[i_374_]), f_379_, class124, class63.anInt1119);
                        aShortArray5495[i_373_] = method669(class63.anInt1122, l + (long) i_384_, i_373_, 0, class63.anInt1118, -57, f_380_, (class124.aShortArray1835[i_374_]), f_381_, class124, class63.anInt1119);
                        aShortArray5512[i_373_] = method669(class63.anInt1122, l + (long) i_385_, i_373_, 0, class63.anInt1118, -109, f_382_, (class124.aShortArray1855[i_374_]), f_383_, class124, class63.anInt1119);
                    }
                    if (class124.aByteArray1834 != null) aByteArray5515[i_373_] = class124.aByteArray1834[i_374_];
                    if (class124.aShortArray1856 != null) aShortArray5432[i_373_] = class124.aShortArray1856[i_374_];
                    aShortArray5486[i_373_] = class124.aShortArray1862[i_374_];
                    aShortArray5423[i_373_] = i_378_;
                }
                if (anInt5516 > 0) {
                    int i_450_ = 1;
                    short i_451_ = aShortArray5423[0];
                    for (int i_452_ = 0; anInt5516 > i_452_; i_452_++) {
                        short i_453_ = aShortArray5423[i_452_];
                        if (i_453_ != i_451_) {
                            i_450_++;
                            i_451_ = i_453_;
                        }
                    }
                    anIntArray5415 = new int[i_450_];
                    anIntArray5404 = new int[i_450_ - -1];
                    anIntArray5473 = new int[i_450_];
                    anIntArray5404[0] = 0;
                    int i_454_ = anInt5475;
                    i_450_ = 0;
                    int i_455_ = 0;
                    i_451_ = aShortArray5423[0];
                    for (int i_456_ = 0; i_456_ < anInt5516; i_456_++) {
                        short i_457_ = aShortArray5423[i_456_];
                        if (i_457_ != i_451_) {
                            anIntArray5415[i_450_] = i_454_;
                            anIntArray5473[i_450_] = 1 + -i_454_ + i_455_;
                            anIntArray5404[++i_450_] = i_456_;
                            i_451_ = i_457_;
                            i_455_ = 0;
                            i_454_ = anInt5475;
                        }
                        int i_458_ = aShortArray5508[i_456_];
                        if (i_458_ > i_455_) i_455_ = i_458_;
                        if (i_454_ > i_458_) i_454_ = i_458_;
                        i_458_ = aShortArray5495[i_456_];
                        if (i_458_ > i_455_) i_455_ = i_458_;
                        if (i_458_ < i_454_) i_454_ = i_458_;
                        i_458_ = aShortArray5512[i_456_];
                        if (i_455_ < i_458_) i_455_ = i_458_;
                        if (i_454_ > i_458_) i_454_ = i_458_;
                    }
                    anIntArray5415[i_450_] = i_454_;
                    anIntArray5473[i_450_] = i_455_ + -i_454_ + 1;
                    anIntArray5404[++i_450_] = anInt5516;
                }
                DefinitionSub37.aLongArray9465 = null;
                aShortArray5470 = Component374.method2639((byte) -111, aShortArray5470, anInt5475);
                aShortArray5416 = Component374.method2639((byte) 26, aShortArray5416, anInt5475);
                aShortArray5493 = Component374.method2639((byte) 68, aShortArray5493, anInt5475);
                aShortArray5438 = Component374.method2639((byte) -125, aShortArray5438, anInt5475);
                aShortArray5436 = Component374.method2639((byte) 70, aShortArray5436, anInt5475);
                aByteArray5499 = OutputStream_Sub2.method135((byte) 111, aByteArray5499, anInt5475);
                aFloatArray5476 = HashNodeSub16.method3258(0, anInt5475, aFloatArray5476);
                aFloatArray5506 = HashNodeSub16.method3258(0, anInt5475, aFloatArray5506);
                if (class124.anIntArray1868 != null && Component214.method1257(-58, anInt5472, i)) anIntArrayArray5413 = class124.method1100(false, -20);
                if (class124.aClass162Array1832 != null && DisplayModeManagerContainer123.method780(anInt5472, 0, i)) anIntArrayArray5412 = class124.method1093((byte) -120);
                if (class124.anIntArray1824 == null || !MenuOpener.method1158(anInt5472, -1, i)) break;
                int i_459_ = 0;
                int[] is_460_ = new int[256];
                for (int i_461_ = 0; i_461_ < anInt5478; i_461_++) {
                    int i_462_ = class124.anIntArray1824[is[i_461_]];
                    if (i_462_ >= 0) {
                        is_460_[i_462_]++;
                        if (i_462_ > i_459_) i_459_ = i_462_;
                    }
                }
                anIntArrayArray5492 = new int[1 + i_459_][];
                for (int i_463_ = 0; i_459_ >= i_463_; i_463_++) {
                    anIntArrayArray5492[i_463_] = new int[is_460_[i_463_]];
                    is_460_[i_463_] = 0;
                }
                for (int i_464_ = 0; anInt5478 > i_464_; i_464_++) {
                    int i_465_ = class124.anIntArray1824[is[i_464_]];
                    if (i_465_ >= 0) anIntArrayArray5492[i_465_][is_460_[i_465_]++] = i_464_;
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + (class124 != null ? "{...}" : "null") + ',' + i + ',' + i_334_ + ',' + i_335_ + ',' + i_336_ + ')'));
            }
            break;
        } while (false);
    }

    private final boolean boundsCheck(int i, int i_466_, int i_467_, int i_468_, int i_469_, int i_470_, int i_471_, int i_472_, int i_473_) {
        anInt5518++;
        if (i_469_ > i_470_ && i_470_ < i_473_ && i_468_ > i_470_) return false;
        if (i_469_ < i_470_ && i_470_ > i_473_ && i_470_ > i_468_) return false;
        if (i_471_ != 0) return true;
        if (i < i_472_ && i_467_ > i && i < i_466_) return false;
        return i <= i_472_ || i <= i_467_ || i_466_ >= i;
    }

    final void prepareFrame() {
        anInt5447++;
        if (anInt5475 > 0 && anInt5516 > 0) {
            checkVisibility(-98);
            ensureInterface(-20);
            beginFrame(262144);
        }
    }

    private final void tick(int i) {
        if (i != 416776206) Interface4Impl();
        anInt5441++;
        if (anInt5516 != 0) {
            if (checkVisibility(i ^ ~0x18d78060) && ensureInterface(-128)) {
                aHa_Sub3_5419.waitNative(i + -416776294, (aClass290_5520.anInterface5_Impl1_3711), 0);
                aHa_Sub3_5419.waitNative(i ^ 0x18d78057, (aClass290_5482.anInterface5_Impl1_3711), 1);
                aHa_Sub3_5419.waitNative(i ^ ~0x18d78079, (aClass290_5460.anInterface5_Impl1_3711), 2);
                boolean bool;
                if ((anInt5472 & 0x37) == 0) {
                    bool = false;
                    aHa_Sub3_5419.getFramebufferParameter(false, true);
                    aHa_Sub3_5419.drawArraysInstanced(0, (aHa_Sub3_5419.aClass130_8191));
                } else {
                    bool = true;
                    aHa_Sub3_5419.getFramebufferParameter(true, true);
                    aHa_Sub3_5419.waitNative(i ^ ~0x18d7806c, (aClass290_5424.anInterface5_Impl1_3711), 3);
                    aHa_Sub3_5419.drawArraysInstanced(0, (aHa_Sub3_5419.aClass130_8208));
                }
                for (int i_474_ = 0; anIntArray5415.length > i_474_; i_474_++) {
                    int i_475_ = anIntArray5404[i_474_];
                    int i_476_ = anIntArray5404[1 + i_474_];
                    int i_477_ = aShortArray5423[i_475_] & 0xffff;
                    if (i_477_ == 65535) i_477_ = -1;
                    aHa_Sub3_5419.disableShader(true, bool, i_477_, (byte) 102);
                    aHa_Sub3_5419.showCursor(VideoAdDisplay.aClass21_3181, -i_475_ + i_476_, (aClass192_5485.anInterface5_Impl2_2572), anIntArray5415[i_474_], 3 * i_475_, anIntArray5473[i_474_], 54);
                }
            }
            beginFrame(262144);
        }
    }

    final boolean isInFrustumExt(int i, int i_478_, DisplayModeManagerContainer204 class101, boolean bool, int i_479_, int i_480_) {
        try {
            anInt5517++;
            return isInFrustum2(i, i_479_, i_480_, 126, i_478_, bool, class101);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.OA(" + i + ',' + i_478_ + ',' + (class101 != null ? "{...}" : "null") + ',' + bool + ',' + i_479_ + ',' + i_480_ + ')'));
        }
    }

    private final void updateState(byte i) {
        int i_481_ = 1 % ((25 - i) / 40);
        if ((anInt5472 & 0x37) == 0) {
            if (aClass290_5482 != null) aClass290_5482.aBoolean3714 = false;
        } else if (aClass290_5424 != null) aClass290_5424.aBoolean3714 = false;
        anInt5405++;
    }

    private final void clearInterface(int i) {
        if (aClass192_5485 != null) aClass192_5485.aBoolean2577 = false;
        int i_482_ = 28 % ((i - 18) / 43);
        anInt5505++;
    }

    final void method613(DisplayModeManagerContainer370 class64, int i, int i_483_, int i_484_, boolean bool) {
        try {
            anInt5417++;
            DisplayModeManagerContainer190 class64_sub2_485_ = (DisplayModeManagerContainer190) class64;
            if (anInt5478 != 0 && class64_sub2_485_.anInt5478 != 0) {
                int i_486_ = class64_sub2_485_.anInt5433;
                int[] is = class64_sub2_485_.vertexX;
                int[] is_487_ = class64_sub2_485_.vertexY;
                int[] is_488_ = class64_sub2_485_.vertexZ;
                short[] is_489_ = class64_sub2_485_.aShortArray5493;
                short[] is_490_ = class64_sub2_485_.aShortArray5438;
                short[] is_491_ = class64_sub2_485_.aShortArray5436;
                byte[] is_492_ = class64_sub2_485_.aByteArray5499;
                short[] is_493_;
                short[] is_494_;
                byte[] is_495_;
                short[] is_496_;
                if (aClass151_5503 == null) {
                    is_493_ = null;
                    is_494_ = null;
                    is_495_ = null;
                    is_496_ = null;
                } else {
                    is_495_ = aClass151_5503.aByteArray2069;
                    is_493_ = aClass151_5503.aShortArray2060;
                    is_494_ = aClass151_5503.aShortArray2067;
                    is_496_ = aClass151_5503.aShortArray2058;
                }
                short[] is_497_;
                byte[] is_498_;
                short[] is_499_;
                short[] is_500_;
                if (class64_sub2_485_.aClass151_5503 == null) {
                    is_497_ = null;
                    is_498_ = null;
                    is_499_ = null;
                    is_500_ = null;
                } else {
                    is_499_ = (class64_sub2_485_.aClass151_5503.aShortArray2058);
                    is_498_ = (class64_sub2_485_.aClass151_5503.aByteArray2069);
                    is_497_ = (class64_sub2_485_.aClass151_5503.aShortArray2060);
                    is_500_ = (class64_sub2_485_.aClass151_5503.aShortArray2067);
                }
                int[] is_501_ = class64_sub2_485_.anIntArray5455;
                short[] is_502_ = class64_sub2_485_.aShortArray5439;
                if (!class64_sub2_485_.aBoolean5477) class64_sub2_485_.computeBoundingBox(0);
                int i_503_ = class64_sub2_485_.anInt5461;
                int i_504_ = class64_sub2_485_.anInt5509;
                int i_505_ = class64_sub2_485_.anInt5507;
                int i_506_ = class64_sub2_485_.anInt5467;
                int i_507_ = class64_sub2_485_.anInt5418;
                int i_508_ = class64_sub2_485_.anInt5443;
                for (int i_509_ = 0; anInt5433 > i_509_; i_509_++) {
                    int i_510_ = vertexY[i_509_] - i_483_;
                    if (i_503_ <= i_510_ && i_510_ <= i_504_) {
                        int i_511_ = -i + vertexX[i_509_];
                        if (i_511_ >= i_505_ && i_511_ <= i_506_) {
                            int i_512_ = vertexZ[i_509_] - i_484_;
                            if (i_507_ <= i_512_ && i_512_ <= i_508_) {
                                int i_513_ = -1;
                                int i_514_ = anIntArray5455[i_509_];
                                int i_515_ = anIntArray5455[1 + i_509_];
                                for (int i_516_ = i_514_; i_515_ > i_516_; i_516_++) {
                                    i_513_ = -1 + aShortArray5439[i_516_];
                                    if (i_513_ == -1 || aByteArray5499[i_513_] != 0) break;
                                }
                                if (i_513_ != -1) {
                                    for (int i_517_ = 0; i_486_ > i_517_; i_517_++) {
                                        if ((is[i_517_] == i_511_) && (is_488_[i_517_] == i_512_) && (i_510_ == is_487_[i_517_])) {
                                            int i_518_ = -1;
                                            i_514_ = is_501_[i_517_];
                                            i_515_ = is_501_[1 + i_517_];
                                            for (int i_519_ = i_514_; i_519_ < i_515_; i_519_++) {
                                                i_518_ = is_502_[i_519_] + -1;
                                                if (i_518_ == -1 || is_492_[i_518_] != 0) break;
                                            }
                                            if (i_518_ != -1) {
                                                if (is_494_ == null) {
                                                    aClass151_5503 = new DisplayModeManagerContainer346();
                                                    is_494_ = aClass151_5503.aShortArray2067 = (DisplayModeManagerContainer368.method470(aShortArray5493, (byte) -123));
                                                    is_493_ = aClass151_5503.aShortArray2060 = (DisplayModeManagerContainer368.method470(aShortArray5438, (byte) -126));
                                                    is_496_ = aClass151_5503.aShortArray2058 = (DisplayModeManagerContainer368.method470(aShortArray5436, (byte) -111));
                                                    is_495_ = aClass151_5503.aByteArray2069 = (DisplayModeManagerContainer74.method2309(-106, aByteArray5499));
                                                }
                                                if (is_500_ == null) {
                                                    DisplayModeManagerContainer346 class151 = (class64_sub2_485_.aClass151_5503 = new DisplayModeManagerContainer346());
                                                    is_500_ = class151.aShortArray2067 = (DisplayModeManagerContainer368.method470(is_489_, (byte) -120));
                                                    is_497_ = class151.aShortArray2060 = (DisplayModeManagerContainer368.method470(is_490_, (byte) -104));
                                                    is_499_ = class151.aShortArray2058 = (DisplayModeManagerContainer368.method470(is_491_, (byte) -118));
                                                    is_498_ = class151.aByteArray2069 = (DisplayModeManagerContainer74.method2309(-114, is_492_));
                                                }
                                                short i_520_ = aShortArray5493[i_513_];
                                                short i_521_ = aShortArray5438[i_513_];
                                                short i_522_ = aShortArray5436[i_513_];
                                                i_514_ = is_501_[i_517_];
                                                i_515_ = is_501_[i_517_ + 1];
                                                byte i_523_ = aByteArray5499[i_513_];
                                                for (int i_524_ = i_514_; (i_515_ > i_524_); i_524_++) {
                                                    int i_525_ = -1 + is_502_[i_524_];
                                                    if (i_525_ == -1) break;
                                                    if (is_498_[i_525_] != 0) {
                                                        is_500_[i_525_] += i_520_;
                                                        is_497_[i_525_] += i_521_;
                                                        is_499_[i_525_] += i_522_;
                                                        is_498_[i_525_] += i_523_;
                                                    }
                                                }
                                                i_514_ = anIntArray5455[i_509_];
                                                i_522_ = is_491_[i_518_];
                                                i_523_ = is_492_[i_518_];
                                                i_520_ = is_489_[i_518_];
                                                i_521_ = is_490_[i_518_];
                                                i_515_ = (anIntArray5455[1 + i_509_]);
                                                for (int i_526_ = i_514_; i_515_ > i_526_; i_526_++) {
                                                    int i_527_ = ((aShortArray5439[i_526_]) - 1);
                                                    if (i_527_ == -1) break;
                                                    if (is_495_[i_527_] != 0) {
                                                        is_494_[i_527_] += i_520_;
                                                        is_493_[i_527_] += i_521_;
                                                        is_496_[i_527_] += i_522_;
                                                        is_495_[i_527_] += i_523_;
                                                    }
                                                }
                                                class64_sub2_485_.updateState((byte) 80);
                                                updateState((byte) -111);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.PA(" + (class64 != null ? "{...}" : "null") + ',' + i + ',' + i_483_ + ',' + i_484_ + ',' + bool + ')'));
        }
    }

    final void ia(short i, short i_528_) {
        anInt5459++;
        for (int i_529_ = 0; anInt5478 > i_529_; i_529_++) {
            if (i == aShortArray5486[i_529_]) aShortArray5486[i_529_] = i_528_;
        }
        if (aClass353Array5524 != null) {
            for (int i_530_ = 0; i_530_ < anInt5406; i_530_++) {
                Component45 class353 = aClass353Array5524[i_530_];
                NativeLibLoader class334 = aClass334Array5442[i_530_];
                class334.anInt4156 = ((RunescapeInfo.anIntArray179[0xffff & aShortArray5486[(class353.anInt4342)]]) & 0xffffff | class334.anInt4156 & ~0xffffff);
            }
        }
        clearVisibility(-119);
    }

    final DisplayModeManagerContainer370 createRenderPass(byte i, int i_531_, boolean bool) {
        anInt5426++;
        DisplayModeManagerContainer190 class64_sub2_532_;
        DisplayModeManagerContainer190 class64_sub2_533_;
        if (i == 1) {
            class64_sub2_532_ = aHa_Sub3_5419.aClass64_Sub2_8198;
            class64_sub2_533_ = aHa_Sub3_5419.aClass64_Sub2_8206;
        } else if (i == 2) {
            class64_sub2_532_ = aHa_Sub3_5419.aClass64_Sub2_8194;
            class64_sub2_533_ = aHa_Sub3_5419.aClass64_Sub2_8192;
        } else if (i == 3) {
            class64_sub2_532_ = aHa_Sub3_5419.aClass64_Sub2_8187;
            class64_sub2_533_ = aHa_Sub3_5419.aClass64_Sub2_8200;
        } else if (i == 4) {
            class64_sub2_532_ = aHa_Sub3_5419.aClass64_Sub2_8199;
            class64_sub2_533_ = aHa_Sub3_5419.aClass64_Sub2_8188;
        } else if (i == 5) {
            class64_sub2_533_ = aHa_Sub3_5419.aClass64_Sub2_8207;
            class64_sub2_532_ = aHa_Sub3_5419.aClass64_Sub2_8189;
        } else class64_sub2_533_ = class64_sub2_532_ = new DisplayModeManagerContainer190(aHa_Sub3_5419, 0, 0, true, false);
        return copyTo(i != 0, class64_sub2_532_, class64_sub2_533_, i_531_, bool, 26794);
    }

    final void p(int i, int i_534_, s var_s, s var_s_535_, int i_536_, int i_537_, int i_538_) {
        try {
            anInt5501++;
            if (!aBoolean5477) computeBoundingBox(0);
            int i_539_ = i_536_ - -anInt5507;
            int i_540_ = anInt5467 + i_536_;
            int i_541_ = anInt5418 + i_538_;
            int i_542_ = i_538_ - -anInt5443;
            if ((i != 1 && i != 2 && i != 3 && i != 5) || (i_539_ >= 0 && var_s.tileWidth > (i_540_ + var_s.tileSize >> var_s.tileSizeBits) && i_541_ >= 0 && var_s.tileLength > (var_s.tileSize + i_542_ >> var_s.tileSizeBits))) {
                if (i != 4 && i != 5) {
                    i_539_ >>= var_s.tileSizeBits;
                    i_540_ = (var_s.tileSize + -1 + i_540_ >> var_s.tileSizeBits);
                    i_541_ >>= var_s.tileSizeBits;
                    i_542_ = (var_s.tileSize - (1 - i_542_) >> var_s.tileSizeBits);
                    if ((var_s.getHeight((byte) -86, i_541_, i_539_) == i_537_) && i_537_ == var_s.getHeight((byte) -86, i_541_, i_540_) && (var_s.getHeight((byte) -86, i_542_, i_539_) == i_537_) && i_537_ == var_s.getHeight((byte) -86, i_542_, i_540_)) return;
                } else if (var_s_535_ == null || (i_539_ < 0 || (var_s_535_.tileWidth <= (var_s_535_.tileSize + i_540_ >> var_s_535_.tileSizeBits)) || i_541_ < 0 || (var_s_535_.tileLength <= (i_542_ - -var_s_535_.tileSize >> var_s_535_.tileSizeBits)))) return;
                if (i == 1) {
                    for (int i_559_ = 0; anInt5433 > i_559_; i_559_++)
                        vertexY[i_559_] = (vertexY[i_559_] + (var_s.getInterpolatedHeight((vertexX[i_559_] + i_536_), (vertexZ[i_559_] + i_538_), (byte) -93) - i_537_));
                } else if (i == 2) {
                    int i_543_ = anInt5461;
                    if (i_543_ == 0) return;
                    for (int i_544_ = 0; anInt5433 > i_544_; i_544_++) {
                        int i_545_ = ((vertexY[i_544_] << 16) / i_543_);
                        if (i_545_ < i_534_) vertexY[i_544_] = (vertexY[i_544_] - -((i_534_ + -i_545_) * (-i_537_ + (var_s.getInterpolatedHeight((i_536_ + vertexX[i_544_]), (vertexZ[i_544_] - -i_538_), (byte) -92))) / i_534_));
                    }
                } else if (i == 3) {
                    int i_555_ = 4 * (i_534_ & 0xff);
                    int i_556_ = (i_534_ >> 8 & 0xff) * 4;
                    int i_557_ = 0x3fc0 & i_534_ >> 16 << 6;
                    int i_558_ = 0x3fc0 & i_534_ >> 24 << 6;
                    if ((i_536_ - (i_555_ >> 1) < 0) || ((var_s.tileSize + (i_555_ >> 1) + i_536_) >= var_s.tileWidth << var_s.tileSizeBits) || -(i_556_ >> 1) + i_538_ < 0 || ((var_s.tileSize + ((i_556_ >> 1) + i_538_)) >= var_s.tileLength << var_s.tileSizeBits))
                        return;
                    this.method626(i_555_, 10947, i_558_, i_536_, i_556_, i_537_, i_557_, var_s, i_538_);
                } else if (i == 4) {
                    int i_553_ = -anInt5461 + anInt5509;
                    for (int i_554_ = 0; (i_554_ < anInt5433); i_554_++)
                        vertexY[i_554_] = (i_553_ + vertexY[i_554_] - (-(var_s_535_.getInterpolatedHeight(vertexX[i_554_] + i_536_, vertexZ[i_554_] - -i_538_, (byte) 92)) + i_537_));
                } else if (i == 5) {
                    int i_546_ = -anInt5461 + anInt5509;
                    for (int i_547_ = 0; anInt5433 > i_547_; i_547_++) {
                        int i_548_ = i_536_ + vertexX[i_547_];
                        int i_549_ = i_538_ + vertexZ[i_547_];
                        int i_550_ = var_s.getInterpolatedHeight(i_548_, i_549_, (byte) 57);
                        int i_551_ = var_s_535_.getInterpolatedHeight(i_548_, i_549_, (byte) -111);
                        int i_552_ = i_550_ - (i_551_ - -i_534_);
                        vertexY[i_547_] = ((i_552_ * ((vertexY[i_547_] << 8) / i_546_) >> 8) + (i_550_ + -i_537_));
                    }
                }
                setVisible(0);
                aBoolean5477 = false;
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.p(" + i + ',' + i_534_ + ',' + (var_s != null ? "{...}" : "null") + ',' + (var_s_535_ != null ? "{...}" : "null") + ',' + i_536_ + ',' + i_537_ + ',' + i_538_ + ')'));
        }
    }

    final boolean F() {
        anInt5446++;
        return aBoolean5428;
    }

    final void releaseRenderLock() {
        anInt5451++;
    }

    final void animateColors(int i, int i_560_, int i_561_, int i_562_) {
        anInt5522++;
        for (int i_563_ = 0; anInt5478 > i_563_; i_563_++) {
            int i_564_ = 0xffff & aShortArray5486[i_563_];
            int i_565_ = 0x3f & i_564_ >> 10;
            int i_566_ = (i_564_ & 0x3f5) >> 7;
            if (i != -1) i_565_ = (i_562_ * (i - i_565_) >> 7) + i_565_;
            int i_567_ = i_564_ & 0x7f;
            if (i_560_ != -1) i_566_ += (-i_566_ + i_560_) * i_562_ >> 7;
            if (i_561_ != -1) i_567_ = ((-i_567_ + i_561_) * i_562_ >> 7) + i_567_;
            aShortArray5486[i_563_] = (short) (Component224.bitwiseOr(Component224.bitwiseOr(i_565_ << 10, i_566_ << 7), i_567_));
        }
        if (aClass353Array5524 != null) {
            for (int i_568_ = 0; anInt5406 > i_568_; i_568_++) {
                Component45 class353 = aClass353Array5524[i_568_];
                NativeLibLoader class334 = aClass334Array5442[i_568_];
                class334.anInt4156 = (class334.anInt4156 & ~0xffffff | (RunescapeInfo.anIntArray179[(aShortArray5486[class353.anInt4342] & 0xffff)]) & 0xffffff);
            }
        }
        clearVisibility(-107);
    }

    final void v() {
        anInt5425++;
        for (int i = 0; i < anInt5433; i++)
            vertexZ[i] = -vertexZ[i];
        for (int i = 0; anInt5475 > i; i++)
            aShortArray5436[i] = (short) -aShortArray5436[i];
        for (int i = 0; anInt5478 > i; i++) {
            short i_569_ = aShortArray5508[i];
            aShortArray5508[i] = aShortArray5512[i];
            aShortArray5512[i] = i_569_;
        }
        setVisible(0);
        updateState((byte) -79);
        clearInterface(-55);
        aBoolean5477 = false;
    }

    final void Shader(short i, short i_570_) {
        anInt5403++;
        d var_d = aHa_Sub3_5419.modelProvider;
        for (int i_571_ = 0; anInt5478 > i_571_; i_571_++) {
            if (i == aShortArray5423[i_571_]) aShortArray5423[i_571_] = i_570_;
        }
        byte i_572_ = 0;
        byte i_573_ = 0;
        if (i != -1) {
            Model class12 = var_d.getModel(i & 0xffff, -6662);
            i_573_ = class12.aByte216;
            i_572_ = class12.aByte201;
        }
        byte i_574_ = 0;
        byte i_575_ = 0;
        if (i_570_ != -1) {
            Model class12 = var_d.getModel(0xffff & i_570_, -6662);
            i_575_ = class12.aByte216;
            if (class12.aByte198 != 0 || class12.aByte211 != 0) aBoolean5502 = true;
            i_574_ = class12.aByte201;
        }
        if (i_575_ != i_573_ | i_572_ != i_574_) {
            if (aClass353Array5524 != null) {
                for (int i_576_ = 0; i_576_ < anInt5406; i_576_++) {
                    Component45 class353 = aClass353Array5524[i_576_];
                    NativeLibLoader class334 = aClass334Array5442[i_576_];
                    class334.anInt4156 = (class334.anInt4156 & ~0xffffff | ((RunescapeInfo.anIntArray179[(aShortArray5486[class353.anInt4342]) & 0xffff]) & 0xffffff));
                }
            }
            clearVisibility(-109);
        }
    }

    final void C(int i) {
        anInt5448++;
        aShort5452 = (short) i;
        clearVisibility(-89);
    }

    private final void computeBoundingBox(int i) {
        anInt5514++;
        int i_577_ = 32767;
        int i_578_ = 32767;
        int i_579_ = 32767;
        int i_580_ = -32768;
        int i_581_ = -32768;
        int i_582_ = -32768;
        int i_583_ = 0;
        int i_584_ = i;
        for (int i_585_ = 0; i_585_ < anInt5433; i_585_++) {
            int i_586_ = vertexX[i_585_];
            int i_587_ = vertexY[i_585_];
            int i_588_ = vertexZ[i_585_];
            if (i_586_ > i_580_) i_580_ = i_586_;
            if (i_578_ > i_587_) i_578_ = i_587_;
            if (i_587_ > i_581_) i_581_ = i_587_;
            if (i_586_ < i_577_) i_577_ = i_586_;
            if (i_579_ > i_588_) i_579_ = i_588_;
            if (i_588_ > i_582_) i_582_ = i_588_;
            int i_589_ = i_588_ * i_588_ + i_586_ * i_586_;
            if (i_583_ < i_589_) i_583_ = i_589_;
            i_589_ = i_587_ * i_587_ + i_586_ * i_586_ + i_588_ * i_588_;
            if (i_589_ > i_584_) i_584_ = i_589_;
        }
        anInt5461 = i_578_;
        anInt5418 = i_579_;
        anInt5507 = i_577_;
        anInt5467 = i_580_;
        anInt5509 = i_581_;
        anInt5443 = i_582_;
        anInt5510 = (int) (Math.sqrt(i_583_) + 0.99);
        anInt5401 = (int) (Math.sqrt(i_584_) + 0.99);
        aBoolean5477 = true;
    }

    public static void clearString(int i) {
        aString5420 = null;
        if (i <= 11) resetNodeStates((byte) -43);
    }

    final void I(int i, int[] is, int i_590_, int i_591_, int i_592_, boolean bool, int i_593_, int[] is_594_) {
        try {
            anInt5521++;
            int i_595_ = is.length;
            if (i == 0) {
                i_590_ <<= 4;
                i_591_ <<= 4;
                i_592_ <<= 4;
                AssetCacheLoader.anInt386 = 0;
                int i_596_ = 0;
                InputHandler.anInt4274 = 0;
                Component257.anInt4795 = 0;
                for (int i_597_ = 0; i_595_ > i_597_; i_597_++) {
                    int i_598_ = is[i_597_];
                    if (i_598_ < anIntArrayArray5413.length) {
                        int[] is_599_ = anIntArrayArray5413[i_598_];
                        for (int i_600_ = 0; is_599_.length > i_600_; i_600_++) {
                            int i_601_ = is_599_[i_600_];
                            if (aShortArray5494 == null || (aShortArray5494[i_601_] & i_593_) != 0) {
                                Component257.anInt4795 += vertexX[i_601_];
                                AssetCacheLoader.anInt386 += vertexY[i_601_];
                                InputHandler.anInt4274 += vertexZ[i_601_];
                                i_596_++;
                            }
                        }
                    }
                }
                if (i_596_ > 0) {
                    InputHandler.anInt4274 = InputHandler.anInt4274 / i_596_ - -i_592_;
                    DisplayModeManagerContainer282.aBoolean5609 = true;
                    AssetCacheLoader.anInt386 = AssetCacheLoader.anInt386 / i_596_ + i_591_;
                    Component257.anInt4795 = i_590_ + Component257.anInt4795 / i_596_;
                } else {
                    InputHandler.anInt4274 = i_592_;
                    Component257.anInt4795 = i_590_;
                    AssetCacheLoader.anInt386 = i_591_;
                }
            } else if (i == 1) {
                if (is_594_ != null) {
                    int i_602_ = (is_594_[0] * i_590_ - (-(is_594_[1] * i_591_) - (i_592_ * is_594_[2] + 8192)) >> 14);
                    int i_603_ = ((i_592_ * is_594_[5] + is_594_[3] * i_590_ - -(is_594_[4] * i_591_) - -8192) >> 14);
                    int i_604_ = ((8192 + is_594_[8] * i_592_ + is_594_[6] * i_590_ + i_591_ * is_594_[7]) >> 14);
                    i_592_ = i_604_;
                    i_591_ = i_603_;
                    i_590_ = i_602_;
                }
                i_590_ <<= 4;
                i_592_ <<= 4;
                i_591_ <<= 4;
                for (int i_605_ = 0; i_605_ < i_595_; i_605_++) {
                    int i_606_ = is[i_605_];
                    if (anIntArrayArray5413.length > i_606_) {
                        int[] is_607_ = anIntArrayArray5413[i_606_];
                        for (int i_608_ = 0; is_607_.length > i_608_; i_608_++) {
                            int i_609_ = is_607_[i_608_];
                            if (aShortArray5494 == null || (aShortArray5494[i_609_] & i_593_) != 0) {
                                vertexX[i_609_] += i_590_;
                                vertexY[i_609_] += i_591_;
                                vertexZ[i_609_] += i_592_;
                            }
                        }
                    }
                }
            } else if (i == 2) {
                if (is_594_ == null) {
                    for (int i_658_ = 0; i_595_ > i_658_; i_658_++) {
                        int i_659_ = is[i_658_];
                        if (i_659_ < anIntArrayArray5413.length) {
                            int[] is_660_ = anIntArrayArray5413[i_659_];
                            for (int i_661_ = 0; is_660_.length > i_661_; i_661_++) {
                                int i_662_ = is_660_[i_661_];
                                if (aShortArray5494 == null || ((aShortArray5494[i_662_] & i_593_) != 0)) {
                                    vertexX[i_662_] -= Component257.anInt4795;
                                    vertexY[i_662_] -= AssetCacheLoader.anInt386;
                                    vertexZ[i_662_] -= InputHandler.anInt4274;
                                    if (i_592_ != 0) {
                                        int i_663_ = DisplayModeManagerContainer88.anIntArray1207[i_592_];
                                        int i_664_ = DisplayModeManagerContainer88.anIntArray1204[i_592_];
                                        int i_665_ = ((i_663_ * vertexY[i_662_] + ((i_664_ * vertexX[i_662_]) - -16383)) >> 14);
                                        vertexY[i_662_] = (-(vertexX[i_662_] * i_663_) + (vertexY[i_662_] * i_664_) - -16383) >> 14;
                                        vertexX[i_662_] = i_665_;
                                    }
                                    if (i_590_ != 0) {
                                        int i_666_ = DisplayModeManagerContainer88.anIntArray1207[i_590_];
                                        int i_667_ = DisplayModeManagerContainer88.anIntArray1204[i_590_];
                                        int i_668_ = ((16383 + ((i_667_ * vertexY[i_662_]) - i_666_ * (vertexZ[i_662_]))) >> 14);
                                        vertexZ[i_662_] = ((16383 + (i_667_ * vertexZ[i_662_]) + (i_666_ * vertexY[i_662_])) >> 14);
                                        vertexY[i_662_] = i_668_;
                                    }
                                    if (i_591_ != 0) {
                                        int i_669_ = DisplayModeManagerContainer88.anIntArray1207[i_591_];
                                        int i_670_ = DisplayModeManagerContainer88.anIntArray1204[i_591_];
                                        int i_671_ = ((16383 + (vertexZ[i_662_] * i_669_) + (i_670_ * vertexX[i_662_])) >> 14);
                                        vertexZ[i_662_] = (-(i_669_ * vertexX[i_662_]) + ((i_670_ * vertexZ[i_662_]) - -16383)) >> 14;
                                        vertexX[i_662_] = i_671_;
                                    }
                                    vertexX[i_662_] += Component257.anInt4795;
                                    vertexY[i_662_] += AssetCacheLoader.anInt386;
                                    vertexZ[i_662_] += InputHandler.anInt4274;
                                }
                            }
                        }
                    }
                    if (bool) {
                        for (int i_672_ = 0; i_672_ < i_595_; i_672_++) {
                            int i_673_ = is[i_672_];
                            if (i_673_ < anIntArrayArray5413.length) {
                                int[] is_674_ = anIntArrayArray5413[i_673_];
                                for (int i_675_ = 0; i_675_ < is_674_.length; i_675_++) {
                                    int i_676_ = is_674_[i_675_];
                                    if (aShortArray5494 == null || ((aShortArray5494[i_676_] & i_593_) != 0)) {
                                        int i_677_ = anIntArray5455[i_676_];
                                        int i_678_ = anIntArray5455[i_676_ - -1];
                                        for (int i_679_ = i_677_; (i_679_ < i_678_); i_679_++) {
                                            int i_680_ = -1 + aShortArray5439[i_679_];
                                            if (i_680_ == -1) break;
                                            if (i_592_ != 0) {
                                                int i_681_ = (DisplayModeManagerContainer88.anIntArray1207[i_592_]);
                                                int i_682_ = (DisplayModeManagerContainer88.anIntArray1204[i_592_]);
                                                int i_683_ = (((i_682_ * (aShortArray5493[i_680_])) + (aShortArray5438[i_680_]) * i_681_ - -16383) >> 14);
                                                aShortArray5438[i_680_] = (short) ((16383 + -((aShortArray5493[i_680_]) * i_681_) + (i_682_ * (aShortArray5438[i_680_]))) >> 14);
                                                aShortArray5493[i_680_] = (short) i_683_;
                                            }
                                            if (i_590_ != 0) {
                                                int i_684_ = (DisplayModeManagerContainer88.anIntArray1207[i_590_]);
                                                int i_685_ = (DisplayModeManagerContainer88.anIntArray1204[i_590_]);
                                                int i_686_ = ((16383 + ((aShortArray5438[i_680_]) * i_685_ - ((aShortArray5436[i_680_]) * i_684_))) >> 14);
                                                aShortArray5436[i_680_] = (short) (((i_684_ * (aShortArray5438[i_680_])) + (i_685_ * (aShortArray5436[i_680_])) - -16383) >> 14);
                                                aShortArray5438[i_680_] = (short) i_686_;
                                            }
                                            if (i_591_ != 0) {
                                                int i_687_ = (DisplayModeManagerContainer88.anIntArray1207[i_591_]);
                                                int i_688_ = (DisplayModeManagerContainer88.anIntArray1204[i_591_]);
                                                int i_689_ = ((16383 + ((aShortArray5436[i_680_]) * i_687_ + (i_688_ * (aShortArray5493[i_680_])))) >> 14);
                                                aShortArray5436[i_680_] = (short) (((i_688_ * (aShortArray5436[i_680_])) + (-(i_687_ * (aShortArray5493[i_680_])) - -16383)) >> 14);
                                                aShortArray5493[i_680_] = (short) i_689_;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        updateState((byte) -82);
                    }
                } else {
                    int i_610_ = is_594_[9] << 4;
                    int i_611_ = is_594_[10] << 4;
                    int i_612_ = is_594_[11] << 4;
                    int i_613_ = is_594_[12] << 4;
                    int i_614_ = is_594_[13] << 4;
                    int i_615_ = is_594_[14] << 4;
                    if (DisplayModeManagerContainer282.aBoolean5609) {
                        int i_616_ = ((is_594_[6] * InputHandler.anInt4274 + (Component257.anInt4795 * is_594_[0] - -(AssetCacheLoader.anInt386 * is_594_[3])) + 8192) >> 14);
                        int i_617_ = ((is_594_[7] * InputHandler.anInt4274 + (is_594_[1] * Component257.anInt4795 - -(is_594_[4] * AssetCacheLoader.anInt386) + 8192)) >> 14);
                        i_616_ += i_613_;
                        int i_618_ = ((8192 + InputHandler.anInt4274 * is_594_[8] + Component257.anInt4795 * is_594_[2] + AssetCacheLoader.anInt386 * is_594_[5]) >> 14);
                        i_617_ += i_614_;
                        i_618_ += i_615_;
                        Component257.anInt4795 = i_616_;
                        AssetCacheLoader.anInt386 = i_617_;
                        DisplayModeManagerContainer282.aBoolean5609 = false;
                        InputHandler.anInt4274 = i_618_;
                    }
                    int[] is_619_ = new int[9];
                    int i_620_ = DisplayModeManagerContainer88.anIntArray1204[i_590_];
                    int i_621_ = DisplayModeManagerContainer88.anIntArray1207[i_590_];
                    int i_622_ = DisplayModeManagerContainer88.anIntArray1204[i_591_];
                    int i_623_ = DisplayModeManagerContainer88.anIntArray1207[i_591_];
                    int i_624_ = DisplayModeManagerContainer88.anIntArray1204[i_592_];
                    int i_625_ = DisplayModeManagerContainer88.anIntArray1207[i_592_];
                    int i_626_ = i_621_ * i_624_ + 8192 >> 14;
                    int i_627_ = 8192 + i_621_ * i_625_ >> 14;
                    is_619_[5] = -i_621_;
                    is_619_[4] = 8192 + i_620_ * i_624_ >> 14;
                    is_619_[1] = (8192 + -i_622_ * i_625_ + i_623_ * i_626_ >> 14);
                    is_619_[6] = (8192 + -i_623_ * i_624_ + i_627_ * i_622_ >> 14);
                    is_619_[7] = (i_625_ * i_623_ - (-(i_622_ * i_626_) - 8192) >> 14);
                    is_619_[0] = (8192 + (i_627_ * i_623_ + i_624_ * i_622_) >> 14);
                    is_619_[2] = i_620_ * i_623_ + 8192 >> 14;
                    is_619_[8] = i_622_ * i_620_ + 8192 >> 14;
                    is_619_[3] = 8192 + i_625_ * i_620_ >> 14;
                    int i_628_ = ((-InputHandler.anInt4274 * is_619_[2] + is_619_[1] * -AssetCacheLoader.anInt386 + (is_619_[0] * -Component257.anInt4795 + 8192)) >> 14);
                    int i_629_ = ((8192 + -InputHandler.anInt4274 * is_619_[5] + (-Component257.anInt4795 * is_619_[3] - -(is_619_[4] * -AssetCacheLoader.anInt386))) >> 14);
                    int i_630_ = ((8192 + -InputHandler.anInt4274 * is_619_[8] + (-Component257.anInt4795 * is_619_[6] + -AssetCacheLoader.anInt386 * is_619_[7])) >> 14);
                    int i_631_ = Component257.anInt4795 + i_628_;
                    int i_632_ = i_629_ + AssetCacheLoader.anInt386;
                    int i_633_ = i_630_ - -InputHandler.anInt4274;
                    int[] is_634_ = new int[9];
                    for (int i_635_ = 0; i_635_ < 3; i_635_++) {
                        for (int i_636_ = 0; i_636_ < 3; i_636_++) {
                            int i_637_ = 0;
                            for (int i_638_ = 0; i_638_ < 3; i_638_++)
                                i_637_ += (is_594_[i_636_ * 3 - -i_638_] * is_619_[3 * i_635_ - -i_638_]);
                            is_634_[3 * i_635_ - -i_636_] = 8192 + i_637_ >> 14;
                        }
                    }
                    int i_639_ = ((is_619_[2] * i_615_ + is_619_[0] * i_613_ - (-(i_614_ * is_619_[1]) + -8192)) >> 14);
                    int i_640_ = ((8192 + is_619_[4] * i_614_ + (is_619_[3] * i_613_ - -(i_615_ * is_619_[5]))) >> 14);
                    i_639_ += i_631_;
                    int i_641_ = (i_615_ * is_619_[8] + (is_619_[6] * i_613_ + (is_619_[7] * i_614_ + 8192)) >> 14);
                    i_640_ += i_632_;
                    i_641_ += i_633_;
                    int[] is_642_ = new int[9];
                    for (int i_643_ = 0; i_643_ < 3; i_643_++) {
                        for (int i_644_ = 0; i_644_ < 3; i_644_++) {
                            int i_645_ = 0;
                            for (int i_646_ = 0; i_646_ < 3; i_646_++)
                                i_645_ += (is_594_[i_646_ + 3 * i_643_] * is_634_[3 * i_646_ + i_644_]);
                            is_642_[3 * i_643_ - -i_644_] = i_645_ - -8192 >> 14;
                        }
                    }
                    int i_647_ = ((i_640_ * is_594_[1] + (is_594_[0] * i_639_ - -(i_641_ * is_594_[2])) - -8192) >> 14);
                    int i_648_ = (8192 + is_594_[5] * i_641_ + (is_594_[4] * i_640_ + i_639_ * is_594_[3]) >> 14);
                    int i_649_ = ((is_594_[7] * i_640_ + is_594_[6] * i_639_ - -(i_641_ * is_594_[8]) - -8192) >> 14);
                    i_647_ += i_610_;
                    i_648_ += i_611_;
                    i_649_ += i_612_;
                    for (int i_650_ = 0; i_595_ > i_650_; i_650_++) {
                        int i_651_ = is[i_650_];
                        if (i_651_ < anIntArrayArray5413.length) {
                            int[] is_652_ = anIntArrayArray5413[i_651_];
                            for (int i_653_ = 0; i_653_ < is_652_.length; i_653_++) {
                                int i_654_ = is_652_[i_653_];
                                if (aShortArray5494 == null || (i_593_ & aShortArray5494[i_654_]) != 0) {
                                    int i_655_ = ((8192 + (vertexY[i_654_] * is_642_[1]) + ((vertexX[i_654_] * is_642_[0]) - -(is_642_[2] * vertexZ[i_654_]))) >> 14);
                                    int i_656_ = ((8192 + (is_642_[3] * vertexX[i_654_]) + ((is_642_[4] * vertexY[i_654_]) + (vertexZ[i_654_] * is_642_[5]))) >> 14);
                                    i_655_ += i_647_;
                                    int i_657_ = ((8192 + ((is_642_[6] * vertexX[i_654_]) + (vertexY[i_654_] * is_642_[7])) + (vertexZ[i_654_] * is_642_[8])) >> 14);
                                    i_656_ += i_648_;
                                    i_657_ += i_649_;
                                    vertexX[i_654_] = i_655_;
                                    vertexY[i_654_] = i_656_;
                                    vertexZ[i_654_] = i_657_;
                                }
                            }
                        }
                    }
                }
            } else if (i == 3) {
                if (is_594_ == null) {
                    for (int i_690_ = 0; i_595_ > i_690_; i_690_++) {
                        int i_691_ = is[i_690_];
                        if (anIntArrayArray5413.length > i_691_) {
                            int[] is_692_ = anIntArrayArray5413[i_691_];
                            for (int i_693_ = 0; is_692_.length > i_693_; i_693_++) {
                                int i_694_ = is_692_[i_693_];
                                if (aShortArray5494 == null || ((i_593_ & aShortArray5494[i_694_]) != 0)) {
                                    vertexX[i_694_] -= Component257.anInt4795;
                                    vertexY[i_694_] -= AssetCacheLoader.anInt386;
                                    vertexZ[i_694_] -= InputHandler.anInt4274;
                                    vertexX[i_694_] = (i_590_ * vertexX[i_694_] >> 7);
                                    vertexY[i_694_] = (vertexY[i_694_] * i_591_ >> 7);
                                    vertexZ[i_694_] = (i_592_ * vertexZ[i_694_] >> 7);
                                    vertexX[i_694_] += Component257.anInt4795;
                                    vertexY[i_694_] += AssetCacheLoader.anInt386;
                                    vertexZ[i_694_] += InputHandler.anInt4274;
                                }
                            }
                        }
                    }
                } else {
                    int i_695_ = is_594_[9] << 4;
                    int i_696_ = is_594_[10] << 4;
                    int i_697_ = is_594_[11] << 4;
                    int i_698_ = is_594_[12] << 4;
                    int i_699_ = is_594_[13] << 4;
                    int i_700_ = is_594_[14] << 4;
                    if (DisplayModeManagerContainer282.aBoolean5609) {
                        int i_701_ = ((InputHandler.anInt4274 * is_594_[6] + (Component257.anInt4795 * is_594_[0] + (is_594_[3] * AssetCacheLoader.anInt386 + 8192))) >> 14);
                        int i_702_ = (8192 + (Component257.anInt4795 * is_594_[1] + (AssetCacheLoader.anInt386 * is_594_[4] - -(is_594_[7] * InputHandler.anInt4274))) >> 14);
                        i_701_ += i_698_;
                        i_702_ += i_699_;
                        int i_703_ = ((8192 + is_594_[2] * Component257.anInt4795 - -(is_594_[5] * AssetCacheLoader.anInt386) - -(InputHandler.anInt4274 * is_594_[8])) >> 14);
                        i_703_ += i_700_;
                        Component257.anInt4795 = i_701_;
                        AssetCacheLoader.anInt386 = i_702_;
                        DisplayModeManagerContainer282.aBoolean5609 = false;
                        InputHandler.anInt4274 = i_703_;
                    }
                    int i_704_ = i_590_ << 15 >> 7;
                    int i_705_ = i_591_ << 15 >> 7;
                    int i_706_ = i_592_ << 15 >> 7;
                    int i_707_ = -Component257.anInt4795 * i_704_ + 8192 >> 14;
                    int i_708_ = 8192 + -AssetCacheLoader.anInt386 * i_705_ >> 14;
                    int i_709_ = 8192 + -InputHandler.anInt4274 * i_706_ >> 14;
                    int i_710_ = i_707_ + Component257.anInt4795;
                    int i_711_ = i_708_ + AssetCacheLoader.anInt386;
                    int i_712_ = InputHandler.anInt4274 + i_709_;
                    int[] is_713_ = new int[9];
                    is_713_[0] = 8192 + i_704_ * is_594_[0] >> 14;
                    is_713_[1] = is_594_[3] * i_704_ + 8192 >> 14;
                    is_713_[2] = 8192 + is_594_[6] * i_704_ >> 14;
                    is_713_[6] = i_706_ * is_594_[2] + 8192 >> 14;
                    is_713_[5] = i_705_ * is_594_[7] - -8192 >> 14;
                    is_713_[3] = 8192 + i_705_ * is_594_[1] >> 14;
                    is_713_[4] = i_705_ * is_594_[4] - -8192 >> 14;
                    is_713_[7] = i_706_ * is_594_[5] - -8192 >> 14;
                    is_713_[8] = 8192 + i_706_ * is_594_[8] >> 14;
                    int i_714_ = i_698_ * i_704_ + 8192 >> 14;
                    int i_715_ = i_699_ * i_705_ - -8192 >> 14;
                    i_714_ += i_710_;
                    int i_716_ = 8192 + i_706_ * i_700_ >> 14;
                    i_715_ += i_711_;
                    i_716_ += i_712_;
                    int[] is_717_ = new int[9];
                    for (int i_718_ = 0; i_718_ < 3; i_718_++) {
                        for (int i_719_ = 0; i_719_ < 3; i_719_++) {
                            int i_720_ = 0;
                            for (int i_721_ = 0; i_721_ < 3; i_721_++)
                                i_720_ += (is_713_[i_719_ - -(3 * i_721_)] * is_594_[i_721_ + i_718_ * 3]);
                            is_717_[i_718_ * 3 - -i_719_] = i_720_ + 8192 >> 14;
                        }
                    }
                    int i_722_ = ((i_715_ * is_594_[1] + i_714_ * is_594_[0] + is_594_[2] * i_716_ - -8192) >> 14);
                    int i_723_ = (i_716_ * is_594_[5] + (is_594_[3] * i_714_ - -(i_715_ * is_594_[4]) - -8192) >> 14);
                    int i_724_ = (i_714_ * is_594_[6] + (i_715_ * is_594_[7] + is_594_[8] * i_716_ + 8192) >> 14);
                    i_723_ += i_696_;
                    i_722_ += i_695_;
                    i_724_ += i_697_;
                    for (int i_725_ = 0; i_595_ > i_725_; i_725_++) {
                        int i_726_ = is[i_725_];
                        if (anIntArrayArray5413.length > i_726_) {
                            int[] is_727_ = anIntArrayArray5413[i_726_];
                            for (int i_728_ = 0; i_728_ < is_727_.length; i_728_++) {
                                int i_729_ = is_727_[i_728_];
                                if (aShortArray5494 == null || ((i_593_ & aShortArray5494[i_729_]) != 0)) {
                                    int i_730_ = ((is_717_[1] * vertexY[i_729_] + (vertexX[i_729_] * is_717_[0]) - (-(vertexZ[i_729_] * is_717_[2]) - 8192)) >> 14);
                                    int i_731_ = ((8192 + ((is_717_[5] * vertexZ[i_729_]) + (is_717_[4] * vertexY[i_729_]) + (is_717_[3] * vertexX[i_729_]))) >> 14);
                                    i_731_ += i_723_;
                                    i_730_ += i_722_;
                                    int i_732_ = ((vertexY[i_729_] * is_717_[7] + ((vertexX[i_729_] * is_717_[6]) - (-(is_717_[8] * vertexZ[i_729_]) - 8192))) >> 14);
                                    vertexX[i_729_] = i_730_;
                                    i_732_ += i_724_;
                                    vertexY[i_729_] = i_731_;
                                    vertexZ[i_729_] = i_732_;
                                }
                            }
                        }
                    }
                }
            } else if (i == 5) {
                if (anIntArrayArray5492 != null) {
                    boolean bool_733_ = false;
                    for (int i_734_ = 0; i_595_ > i_734_; i_734_++) {
                        int i_735_ = is[i_734_];
                        if (anIntArrayArray5492.length > i_735_) {
                            int[] is_736_ = anIntArrayArray5492[i_735_];
                            for (int i_737_ = 0; (i_737_ < is_736_.length); i_737_++) {
                                int i_738_ = is_736_[i_737_];
                                if (aShortArray5432 == null || (aShortArray5432[i_738_] & i_593_) != 0) {
                                    int i_739_ = ((aByteArray5515[i_738_] & 0xff) - -(8 * i_590_));
                                    if (i_739_ < 0) i_739_ = 0;
                                    else if (i_739_ > 255) i_739_ = 255;
                                    aByteArray5515[i_738_] = (byte) i_739_;
                                }
                            }
                            bool_733_ = bool_733_ | is_736_.length > 0;
                        }
                    }
                    if (bool_733_) {
                        if (aClass353Array5524 != null) {
                            for (int i_740_ = 0; i_740_ < anInt5406; i_740_++) {
                                Component45 class353 = aClass353Array5524[i_740_];
                                NativeLibLoader class334 = aClass334Array5442[i_740_];
                                class334.anInt4156 = ((-(0xff & (aByteArray5515[(class353.anInt4342)])) + 255 << 24) | (class334.anInt4156 & 0xffffff));
                            }
                        }
                        clearVisibility(-126);
                    }
                }
            } else if (i == 7) {
                if (anIntArrayArray5492 != null) {
                    boolean bool_741_ = false;
                    for (int i_742_ = 0; i_595_ > i_742_; i_742_++) {
                        int i_743_ = is[i_742_];
                        if (anIntArrayArray5492.length > i_743_) {
                            int[] is_744_ = anIntArrayArray5492[i_743_];
                            for (int i_745_ = 0; is_744_.length > i_745_; i_745_++) {
                                int i_746_ = is_744_[i_745_];
                                if (aShortArray5432 == null || ((aShortArray5432[i_746_] & i_593_) != 0)) {
                                    int i_747_ = 0xffff & aShortArray5486[i_746_];
                                    int i_748_ = (i_747_ & 0xfdd5) >> 10;
                                    int i_749_ = i_747_ >> 7 & 0x7;
                                    i_749_ += i_591_ / 4;
                                    i_748_ = 0x3f & i_590_ + i_748_;
                                    int i_750_ = i_747_ & 0x7f;
                                    if (i_749_ >= 0) {
                                        if (i_749_ > 7) i_749_ = 7;
                                    } else i_749_ = 0;
                                    i_750_ += i_592_;
                                    if (i_750_ >= 0) {
                                        if (i_750_ > 127) i_750_ = 127;
                                    } else i_750_ = 0;
                                    aShortArray5486[i_746_] = (short) (Component224.bitwiseOr((Component224.bitwiseOr(i_749_ << 7, i_748_ << 10)), i_750_));
                                }
                            }
                            bool_741_ = (bool_741_ | is_744_.length > 0);
                        }
                    }
                    if (bool_741_) {
                        if (aClass353Array5524 != null) {
                            for (int i_751_ = 0; anInt5406 > i_751_; i_751_++) {
                                Component45 class353 = aClass353Array5524[i_751_];
                                NativeLibLoader class334 = aClass334Array5442[i_751_];
                                class334.anInt4156 = ((class334.anInt4156 & ~0xffffff) | (0xffffff & (RunescapeInfo.anIntArray179[0xffff & (aShortArray5486[(class353.anInt4342)])])));
                            }
                        }
                        clearVisibility(-90);
                    }
                }
            } else if (i == 8) {
                if (anIntArrayArray5412 != null) {
                    for (int i_752_ = 0; i_595_ > i_752_; i_752_++) {
                        int i_753_ = is[i_752_];
                        if (i_753_ < anIntArrayArray5412.length) {
                            int[] is_754_ = anIntArrayArray5412[i_753_];
                            for (int i_755_ = 0; (i_755_ < is_754_.length); i_755_++) {
                                NativeLibLoader class334 = aClass334Array5442[is_754_[i_755_]];
                                class334.anInt4158 += i_590_;
                                class334.anInt4154 += i_591_;
                            }
                        }
                    }
                }
            } else if (i == 10) {
                if (anIntArrayArray5412 != null) {
                    for (int i_756_ = 0; i_595_ > i_756_; i_756_++) {
                        int i_757_ = is[i_756_];
                        if (anIntArrayArray5412.length > i_757_) {
                            int[] is_758_ = anIntArrayArray5412[i_757_];
                            for (int i_759_ = 0; (i_759_ < is_758_.length); i_759_++) {
                                NativeLibLoader class334 = aClass334Array5442[is_758_[i_759_]];
                                class334.anInt4162 = (i_591_ * class334.anInt4162 >> 7);
                                class334.anInt4165 = (i_590_ * class334.anInt4165 >> 7);
                            }
                        }
                    }
                }
            } else if (i == 9) {
                if (anIntArrayArray5412 != null) {
                    for (int i_760_ = 0; i_760_ < i_595_; i_760_++) {
                        int i_761_ = is[i_760_];
                        if (anIntArrayArray5412.length > i_761_) {
                            int[] is_762_ = anIntArrayArray5412[i_761_];
                            for (int i_763_ = 0; (is_762_.length > i_763_); i_763_++) {
                                NativeLibLoader class334 = aClass334Array5442[is_762_[i_763_]];
                                class334.anInt4151 = 0x3fff & i_590_ + (class334.anInt4151);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.I(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_590_ + ',' + i_591_ + ',' + i_592_ + ',' + bool + ',' + i_593_ + ',' + (is_594_ != null ? "{...}" : "null") + ')'));
        }
    }

    DisplayModeManagerContainer190(GlToolkitSub3 var_ha_Sub3, int i, int i_764_, boolean bool, boolean bool_765_) {
        aBoolean5428 = false;
        aBoolean5477 = false;
        anInt5478 = 0;
        anInt5475 = 0;
        anInt5516 = 0;
        aBoolean5502 = false;
        anInt5497 = 0;
        aBoolean5462 = false;
        try {
            anInt5463 = i;
            aBoolean5462 = bool_765_;
            anInt5472 = i_764_;
            aHa_Sub3_5419 = var_ha_Sub3;
            if (bool || DisplayModeManagerContainer254.method1258(anInt5463, -9301, anInt5472)) aClass290_5520 = new Component200(Component235.method2015(anInt5463, anInt5472, 7));
            if (bool || RadixText.method1837(anInt5472, 102, anInt5463)) aClass290_5460 = new Component200(Component191.method1379(4, anInt5472, anInt5463));
            if (bool || HuffmanDecoder.method2224(anInt5463, (byte) 110, anInt5472)) aClass290_5482 = new Component200(PacketReader.isPacketAllowed(anInt5463, anInt5472, (byte) -82));
            if (bool || ReliefShader.method1412((byte) -35, anInt5472, anInt5463)) aClass290_5424 = new Component200(Component380.method1113(anInt5463, anInt5472, -21));
            if (bool || Component63.method3563(anInt5463, (byte) 56, anInt5472)) aClass192_5485 = new Component353(SceneNode.method2783(anInt5472, (byte) -97, anInt5463));
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nca.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ',' + i_764_ + ',' + bool + ',' + bool_765_ + ')'));
        }
    }
}
