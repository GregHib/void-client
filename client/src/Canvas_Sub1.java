/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Canvas_Sub1 extends Canvas {
    static int[] anIntArray60;
    static int anInt61;
    static int anInt62;
    static int anInt63;
    private final Component aComponent64;
    static int anInt65;
    static int anInt66;
    static int anInt67 = 0;
    static int anInt68;
    static int anInt69;
    static int anInt70;

    /**
     * Lerp camera focus toward the local player and apply yaw/pitch rates (follow mode).
     * Snaps if focus is more than 2000 units away; {@code l} is elapsed ms.
     */
    static final void updateFollowCamera(int i, long l) {
        try {
            anInt66++;
            int i_0_ = (Component120.cameraShakeX + Component72.localPlayer.x);
            int i_1_ = (Component92.cameraShakeZ + Component72.localPlayer.y);
            if (-i_0_ + DisplayModeManagerContainer273.cameraFocusX < -2000 || -i_0_ + DisplayModeManagerContainer273.cameraFocusX > 2000 || Component353.cameraFocusZ - i_1_ < -2000 || -i_1_ + Component353.cameraFocusZ > 2000) {
                Component353.cameraFocusZ = i_1_;
                DisplayModeManagerContainer273.cameraFocusX = i_0_;
            }
            if (DisplayModeManagerContainer273.cameraFocusX != i_0_) {
                int i_2_ = i_0_ - DisplayModeManagerContainer273.cameraFocusX;
                int i_3_ = (int) ((long) i_2_ * l / 320L);
                if (i_2_ <= 0) {
                    if (i_3_ == 0) i_3_ = -1;
                    else if (i_3_ < i_2_) i_3_ = i_2_;
                } else if (i_3_ == 0) i_3_ = 1;
                else if (i_3_ > i_2_) i_3_ = i_2_;
                DisplayModeManagerContainer273.cameraFocusX += i_3_;
            }
            if (i == -1) {
                Component112.cameraYaw += Component275.cameraYawRate * (float) l / 6.0F;
                if (i_1_ != Component353.cameraFocusZ) {
                    int i_4_ = i_1_ - Component353.cameraFocusZ;
                    int i_5_ = (int) ((long) i_4_ * l / 320L);
                    if (i_4_ > 0) {
                        if (i_5_ != 0) {
                            if (i_5_ > i_4_) i_5_ = i_4_;
                        } else i_5_ = 1;
                    } else if (i_5_ != 0) {
                        if (i_5_ < i_4_) i_5_ = i_4_;
                    } else i_5_ = -1;
                    Component353.cameraFocusZ += i_5_;
                }
                DisplayModeManagerContainer154.cameraPitch += NodeSub27.cameraPitchRate * (float) l / 6.0F;
                DisplayModeManagerContainer199.clampCameraAngles(262144);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "vg.A(" + i + ',' + l + ')');
        }
    }

    public final void update(Graphics graphics) {
        anInt61++;
        aComponent64.update(graphics);
    }

    /** Null shared statics for GC / shutdown. */
    public static void clearStatics(boolean bool) {
        anIntArray60 = null;
        if (bool != false) anIntArray60 = null;
    }

    /**
     * Set one inventory/container slot: id {@code i}, optional high-bit key when {@code bool},
     * slot {@code i_7_}, amount {@code i_8_}, itemId {@code i_9_}. Used by UPDATE_INV packets.
     */
    static final void setContainerSlot(int i, int i_6_, boolean bool, int i_7_, int i_8_, int i_9_) {
        if (i_6_ != -364570972) anInt70 = -4;
        anInt68++;
        long l = i | (!bool ? 0 : -2147483648);
        NodeSub13 class348_sub13 = ((NodeSub13) Definition.containers.get(l, -6008));
        if (class348_sub13 == null) {
            class348_sub13 = new NodeSub13();
            Definition.containers.put((byte) 109, l, class348_sub13);
        }
        if (class348_sub13.itemIds.length <= i_7_) {
            int[] is = new int[1 + i_7_];
            int[] is_10_ = new int[1 + i_7_];
            for (int i_11_ = 0; (class348_sub13.itemIds.length > i_11_); i_11_++) {
                is[i_11_] = class348_sub13.itemIds[i_11_];
                is_10_[i_11_] = class348_sub13.amounts[i_11_];
            }
            for (int i_12_ = class348_sub13.itemIds.length; i_12_ < i_7_; i_12_++) {
                is[i_12_] = -1;
                is_10_[i_12_] = 0;
            }
            class348_sub13.itemIds = is;
            class348_sub13.amounts = is_10_;
        }
        class348_sub13.itemIds[i_7_] = i_9_;
        class348_sub13.amounts[i_7_] = i_8_;
    }

    public final void paint(Graphics graphics) {
        aComponent64.paint(graphics);
        anInt65++;
    }

    /**
     * Load (or reuse) a model from the model cache by archive id {@code i_16_}, then apply
     * optional rotations/height ({@code i_15_}/{@code i_13_}/{@code i_14_}/{@code i}).
     */
    static final DisplayModeManagerContainer370 getCachedModel(int i, int i_13_, int i_14_, int i_15_, int i_16_, byte i_17_, GraphicsToolkit var_ha) {
        anInt62++;
        if (i_17_ != -35) anInt70 = 10;
        long l = i_16_;
        DisplayModeManagerContainer370 class64 = (DisplayModeManagerContainer370) Component279.aClass60_225.get(l, 81);
        int i_18_ = 2055;
        if (class64 == null) {
            DisplayModeManagerContainer77 class124 = Component189.loadFromCache(0, ShaderSub3.aClass45_5207, i_16_, -1);
            if (class124 == null) return null;
            if (class124.anInt1830 < 13) class124.method1092(2, 105);
            class64 = var_ha.method3625(class124, i_18_, Component382.anInt2275, 64, 768);
            Component279.aClass60_225.putOne(class64, l, (byte) -122);
        }
        class64 = class64.createRenderPass((byte) 2, i_18_, true);
        if (i_15_ != 0) class64.a(i_15_);
        if (i_13_ != 0) class64.FA(i_13_);
        if (i_14_ != 0) class64.VA(i_14_);
        if (i != 0) class64.H(0, i, 0);
        return class64;
    }

    /**
     * Prefetch region landscape/loc archives, then build the scene graph when all groups are ready.
     * Called while entering the game world ({@code clientState} map-load path).
     */
    static final void loadAndBuildScene(int i) {
        anInt63++;
        Component156.method2193(false, (byte) -125);
        DisplayModeManagerContainer259.anInt3441 = 0;
        boolean bool = true;
        for (int i_19_ = 0; DisplayModeManagerContainer322.aByteArrayArray4281.length > i_19_; i_19_++) {
            if (ShaderSub1.anIntArray5192[i_19_] != -1 && DisplayModeManagerContainer322.aByteArrayArray4281[i_19_] == null) {
                DisplayModeManagerContainer322.aByteArrayArray4281[i_19_] = SoftwareFallbackShader.aClass45_7382.getFile(-1860, ShaderSub1.anIntArray5192[i_19_], 0);
                if (DisplayModeManagerContainer322.aByteArrayArray4281[i_19_] == null) {
                    bool = false;
                    DisplayModeManagerContainer259.anInt3441++;
                }
            }
            if (Applet_Sub1.anIntArray38[i_19_] != -1 && WorldNameText.aByteArrayArray8642[i_19_] == null) {
                WorldNameText.aByteArrayArray8642[i_19_] = (SoftwareFallbackShader.aClass45_7382.getFile(Applet_Sub1.anIntArray38[i_19_], 0, i + 2, Component31.anIntArrayArray5894[i_19_]));
                if (WorldNameText.aByteArrayArray8642[i_19_] == null) {
                    DisplayModeManagerContainer259.anInt3441++;
                    bool = false;
                }
            }
            if (DisplayModeManagerContainer61.anIntArray3759[i_19_] != -1 && Component30.aByteArrayArray1887[i_19_] == null) {
                Component30.aByteArrayArray1887[i_19_] = SoftwareFallbackShader.aClass45_7382.getFile(-1860, DisplayModeManagerContainer61.anIntArray3759[i_19_], 0);
                if (Component30.aByteArrayArray1887[i_19_] == null) {
                    DisplayModeManagerContainer259.anInt3441++;
                    bool = false;
                }
            }
            if (r.anIntArray9724[i_19_] != -1 && OggUrlStream.aByteArrayArray8996[i_19_] == null) {
                OggUrlStream.aByteArrayArray8996[i_19_] = SoftwareFallbackShader.aClass45_7382.getFile(-1860, r.anIntArray9724[i_19_], 0);
                if (OggUrlStream.aByteArrayArray8996[i_19_] == null) {
                    bool = false;
                    DisplayModeManagerContainer259.anInt3441++;
                }
            }
            if (ImageCacheStore.anIntArray4031 != null && NodeSub50.aByteArrayArray7212[i_19_] == null && ImageCacheStore.anIntArray4031[i_19_] != -1) {
                NodeSub50.aByteArrayArray7212[i_19_] = (SoftwareFallbackShader.aClass45_7382.getFile(ImageCacheStore.anIntArray4031[i_19_], 0, i + 2, Component31.anIntArrayArray5894[i_19_]));
                if (NodeSub50.aByteArrayArray7212[i_19_] == null) {
                    bool = false;
                    DisplayModeManagerContainer259.anInt3441++;
                }
            }
        }
        if (CacheNodeSub2.aClass252_10488 == null) {
            if (Request.aClass348_Sub42_Sub14_6885 != null && (NodeSub32.aClass45_6950.hasGroup(-18308, (Request.aClass348_Sub42_Sub14_6885.aString9625) + "_staticelements"))) {
                if (NodeSub32.aClass45_6950.isGroupReadyByName(100, (Request.aClass348_Sub42_Sub14_6885.aString9625) + "_staticelements"))
                    CacheNodeSub2.aClass252_10488 = Component358.loadStaticElements(NodeSub32.aClass45_6950, ((Request.aClass348_Sub42_Sub14_6885.aString9625) + "_staticelements"), Component387.aBoolean1900, (byte) -91);
                else {
                    bool = false;
                    DisplayModeManagerContainer259.anInt3441++;
                }
            } else CacheNodeSub2.aClass252_10488 = new Component278(0);
        }
        if (bool) {
            bool = true;
            Component101.anInt2101 = 0;
            for (int i_20_ = 0; i_20_ < DisplayModeManagerContainer322.aByteArrayArray4281.length; i_20_++) {
                byte[] is = WorldNameText.aByteArrayArray8642[i_20_];
                if (is != null) {
                    int i_21_ = 64 * (OggStreamReader.anIntArray9042[i_20_] >> 8) - NodeBaseSub2.regionTileX;
                    int i_22_ = 64 * (OggStreamReader.anIntArray9042[i_20_] & 0xff) - Component330.regionTileY;
                    if (Component37.anInt3931 != 0) {
                        i_22_ = 10;
                        i_21_ = 10;
                    }
                    bool &= NodeSub41.method3154(AbstractShaderSub4.anInt7319, i_21_, (ParametricDefinition.anInt9109), i_22_, is, (byte) 39);
                }
                is = OggUrlStream.aByteArrayArray8996[i_20_];
                if (is != null) {
                    int i_23_ = 64 * (OggStreamReader.anIntArray9042[i_20_] >> 8) - NodeBaseSub2.regionTileX;
                    int i_24_ = 64 * (OggStreamReader.anIntArray9042[i_20_] & 0xff) + -Component330.regionTileY;
                    if (Component37.anInt3931 != 0) {
                        i_24_ = 10;
                        i_23_ = 10;
                    }
                    bool &= NodeSub41.method3154(AbstractShaderSub4.anInt7319, i_23_, (ParametricDefinition.anInt9109), i_24_, is, (byte) 39);
                }
            }
            if (bool) {
                if (Component129.anInt489 != 0) Component149.method3511(true, Applet_Sub1.aClass324_20, Component163.aClass143_3179, ((FriendsIgnoreList.aClass274_3495.getLocalized(ObjectDeserializer.languageId, 544)) + "<br>(100%)"), 2, NodeSub8.toolkit);
                Component381.method3570(false);
                NodeSub18.method2938((byte) 102);
                Component205.method1772(i ^ 0x41);
                boolean bool_25_ = false;
                if (NodeSub8.toolkit.method3639() && Component192.preferences.aClass239_Sub18_7259.method1800(-32350) == 2) {
                    for (int i_26_ = 0; (i_26_ < DisplayModeManagerContainer322.aByteArrayArray4281.length); i_26_++) {
                        if ((OggUrlStream.aByteArrayArray8996[i_26_] != null) || Component30.aByteArrayArray1887[i_26_] != null) {
                            bool_25_ = true;
                            break;
                        }
                    }
                }
                int i_27_;
                if (Component192.preferences.aClass239_Sub16_7247.method1789(-32350) != 1) i_27_ = JaclibLoader.anIntArray168[ColorTagNode.anInt6769];
                else i_27_ = (CookieManager.anIntArray6296[ColorTagNode.anInt6769]);
                if (NodeSub8.toolkit.method3670()) i_27_++;
                i_27_ = (int) (Loader.RENDER_DISTANCE_MULTIPLIER * i_27_);
                HashNodeSub2.method3171(NodeSub8.toolkit, Component25.anInt6012, 9, 4, AbstractShaderSub4.anInt7319, ParametricDefinition.anInt9109, i_27_, bool_25_, NodeSub8.toolkit.method3704() > 0);
                NodeSub32.method3018(Component171.anInt10096);
                if (Component171.anInt10096 != 0) NodeSub48.setDebugOverlayFont(Component49.aClass324_4684);
                else NodeSub48.setDebugOverlayFont(null);
                for (int i_28_ = 0; i_28_ < 4; i_28_++)
                    NodeSub45.aClass361Array7108[i_28_].method3500(i ^ 0x2bc);
                RSACipher.method491((byte) -86);
                MatrixSub2.method921((byte) 99, false);
                GlToolkitSub3.createCursor(i + i);
                Component293.aClass305_3304 = null;
                Component326.aBoolean5265 = false;
                Component381.method3570(false);
                BuildInfo.maybeGc();
                Component156.method2193(true, (byte) -128);
                Component129.method354(2);
                ReferenceTable.anInt3720 = Component192.preferences.aClass239_Sub7_7238.method1748(-32350);
                HuffmanDecoder.aBoolean3767 = Component127.anInt2964 >= 96;
                Component27.aBoolean4972 = Component192.preferences.aClass239_Sub18_7259.method1800(-32350) == 2;
                DisplayModeManagerContainer51.aBoolean2492 = Component192.preferences.aClass239_Sub28_7230.method1845(i + -32350) == 1;
                OutputStream_Sub2.anInt101 = Component192.preferences.aClass239_Sub27_7261.method1840(-32350) == 1 ? -1 : Component385.anInt2204;
                IOException_Sub1.aBoolean86 = Component192.preferences.aClass239_Sub9_7256.method1759(-32350) == 1;
                DisplayModeManagerContainer32.aBoolean845 = Component192.preferences.aClass239_Sub24_7235.method1820(i ^ ~0x7e5d) == 1;
                Component103.aClass237_Sub1_4197 = new Component251(4, AbstractShaderSub4.anInt7319, ParametricDefinition.anInt9109, false);
                if (Component37.anInt3931 != 0) Component352.method385(false, Component103.aClass237_Sub1_4197, DisplayModeManagerContainer322.aByteArrayArray4281);
                else NodeSub1Sub1.method2727((byte) -65, Component103.aClass237_Sub1_4197, (DisplayModeManagerContainer322.aByteArrayArray4281));
                Component83.method1015(AbstractShaderSub4.anInt7319 >> 4, (ParametricDefinition.anInt9109 >> 4), true);
                HashNodeSub3.method3175((byte) -77);
                if (bool_25_) {
                    Component315.method1879(true);
                    DisplayModeManagerContainer292.aClass237_Sub1_5067 = new Component251(1, AbstractShaderSub4.anInt7319, ParametricDefinition.anInt9109, true);
                    if (Component37.anInt3931 == 0) {
                        NodeSub1Sub1.method2727((byte) -44, (DisplayModeManagerContainer292.aClass237_Sub1_5067), (Component30.aByteArrayArray1887));
                        Component156.method2193(true, (byte) -119);
                    } else {
                        Component352.method385(false, DisplayModeManagerContainer292.aClass237_Sub1_5067, Component30.aByteArrayArray1887);
                        Component156.method2193(true, (byte) -125);
                    }
                    DisplayModeManagerContainer292.aClass237_Sub1_5067.method1679(0, 0, (Component103.aClass237_Sub1_4197.anIntArrayArrayArray3122[0]));
                    DisplayModeManagerContainer292.aClass237_Sub1_5067.method1685(NodeSub8.toolkit, null, 21407, null);
                    Component315.method1879(false);
                }
                Component103.aClass237_Sub1_4197.method1685(NodeSub8.toolkit, (!bool_25_ ? null : (DisplayModeManagerContainer292.aClass237_Sub1_5067.anIntArrayArrayArray3122)), 21407, NodeSub45.aClass361Array7108);
                if (Component37.anInt3931 == 0) {
                    Component156.method2193(true, (byte) -128);
                    DisplayModeManagerContainer145.method1090(WorldNameText.aByteArrayArray8642, i + 65536, Component103.aClass237_Sub1_4197);
                    if (NodeSub50.aByteArrayArray7212 != null) DisplayModeManagerContainer23.method859(i ^ ~0x7e);
                } else {
                    Component156.method2193(true, (byte) -121);
                    MatrixSub3.method944(i + -8212, WorldNameText.aByteArrayArray8642, Component103.aClass237_Sub1_4197);
                }
                NodeSub18.method2938((byte) 66);
                if (Component127.anInt2964 < 96) Component201.method2271(31268);
                Component156.method2193(true, (byte) -119);
                Component103.aClass237_Sub1_4197.method1680(null, (byte) -125, (!bool_25_ ? null : (Component9.aSArray4142[0])), NodeSub8.toolkit);
                Component103.aClass237_Sub1_4197.method1697(false, NodeSub8.toolkit, -36);
                Component156.method2193(true, (byte) -122);
                if (bool_25_) {
                    Component315.method1879(true);
                    Component156.method2193(true, (byte) -124);
                    if (Component37.anInt3931 != 0) MatrixSub3.method944(-8212, (OggUrlStream.aByteArrayArray8996), DisplayModeManagerContainer292.aClass237_Sub1_5067);
                    else DisplayModeManagerContainer145.method1090((OggUrlStream.aByteArrayArray8996), i + 65536, DisplayModeManagerContainer292.aClass237_Sub1_5067);
                    NodeSub18.method2938((byte) 73);
                    Component156.method2193(true, (byte) -121);
                    DisplayModeManagerContainer292.aClass237_Sub1_5067.method1680((NodeSub1Sub1.aSArray8801[0]), (byte) -127, null, (NodeSub8.toolkit));
                    DisplayModeManagerContainer292.aClass237_Sub1_5067.method1697(true, NodeSub8.toolkit, i + -60);
                    Component156.method2193(true, (byte) -126);
                    Component315.method1879(false);
                }
                NodeSub50.method3419(13022);
                int i_29_ = Component103.aClass237_Sub1_4197.anInt5824;
                if (i_29_ > Component117.anInt4372) i_29_ = Component117.anInt4372;
                if (i_29_ < -1 + Component117.anInt4372) i_29_ = Component117.anInt4372 - 1;
                if (Component192.preferences.aClass239_Sub27_7261.method1840(-32350) == 0) DisplayModeManagerContainer26.method824(i_29_);
                else DisplayModeManagerContainer26.method824(0);
                for (int i_30_ = 0; i_30_ < 4; i_30_++) {
                    for (int i_31_ = 0; AbstractShaderSub4.anInt7319 > i_31_; i_31_++) {
                        for (int i_32_ = 0; ParametricDefinition.anInt9109 > i_32_; i_32_++)
                            DisplayModeManagerContainer351.method1479(i_32_, (byte) -126, i_31_, i_30_);
                    }
                }
                DefinitionSub9.method3072((byte) -99);
                Component381.method3570(false);
                Component126.method3514((byte) -105);
                NodeSub18.method2938((byte) 62);
                DisplayModeManagerContainer273.method1131(99);
                if (RSACipher.aFrame4904 != null && DefinitionSub8.aClass238_9165 != null && Component49.clientState == 11) {
                    Component48.anInt4335++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(DisplayModeManagerContainer363.aClass351_4094, (DisplayModeManagerContainer64.aClass77_9029), i ^ ~0x55);
                    class348_sub47.particleBuffer.writeInt((byte) 108, 1057001181);
                    HashNodeSub14.enqueueOutboundPacket(-122, class348_sub47);
                }
                if (Component37.anInt3931 == 0) {
                    int i_33_ = ((GraphicsToolkit.anInt4581 + -(AbstractShaderSub4.anInt7319 >> 4)) / 8);
                    int i_34_ = ((GraphicsToolkit.anInt4581 - -(AbstractShaderSub4.anInt7319 >> 4)) / 8);
                    int i_35_ = ((DisplayModeManagerContainer363.anInt4095 + -(ParametricDefinition.anInt9109 >> 4)) / 8);
                    int i_36_ = (((ParametricDefinition.anInt9109 >> 4) + DisplayModeManagerContainer363.anInt4095) / 8);
                    for (int i_37_ = i_33_ - 1; i_37_ <= i_34_ - -1; i_37_++) {
                        for (int i_38_ = i_35_ + -1; i_38_ <= i_36_ - -1; i_38_++) {
                            if (i_33_ > i_37_ || i_34_ < i_37_ || i_38_ < i_35_ || i_38_ > i_36_) {
                                SoftwareFallbackShader.aClass45_7382.requestGroupByName("m" + i_37_ + "_" + i_38_, true);
                                SoftwareFallbackShader.aClass45_7382.requestGroupByName("l" + i_37_ + "_" + i_38_, true);
                            }
                        }
                    }
                }
                if (Component49.clientState != 4) {
                    if (Component49.clientState != 8) {
                        Buffer.setClientState(2, 10);
                        if (DefinitionSub8.aClass238_9165 != null) {
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((CacheFileStore.aClass351_4223), (DisplayModeManagerContainer64.aClass77_9029), -106);
                            HashNodeSub14.enqueueOutboundPacket(127, class348_sub47);
                        }
                    } else Buffer.setClientState(2, 7);
                } else Buffer.setClientState(i ^ 0x2, 3);
                NodeSub1.method2718(-106);
                Component381.method3570(false);
                Component97.method867(true);
                NodeSub16Sub2.aBoolean8870 = true;
                if (AbstractGlTextureSub4.aBoolean8558) {
                    Applet_Sub1.printConsole(("Took: " + (Component240.currentTimeMillis(-117) + -Component330.aLong1516) + "ms"), i + 52);
                    AbstractGlTextureSub4.aBoolean8558 = false;
                }
            } else Component129.anInt489 = 2;
        } else Component129.anInt489 = 1;
    }

    Canvas_Sub1(Component component) {
        aComponent64 = component;
    }

    static {
        anIntArray60 = new int[8];
    }
}
