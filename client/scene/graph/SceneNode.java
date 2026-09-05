/* SceneNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub9` (JODE-obfuscated).
 * Scene-graph node (extends Node) wrapping a RenderableObject. method2778 inserts a renderable into the tile heightmap / render list after visibility checks.
 */

final class SceneNode extends Node {
    int anInt6668;
    static int anInt6669;
    int anInt6670;
    static int anInt6671;
    static int anInt6672;
    NodeSub16Sub5 aClass348_Sub16_Sub5_6673;
    boolean aBoolean6674;
    int anInt6675 = 0;
    NodeSub16Sub5 aClass348_Sub16_Sub5_6676;
    int anInt6677;
    int anInt6678;
    Player aPlayer_6679;
    int anInt6680;
    int anInt6681;
    static int anInt6682;
    NodeSub10 aClass348_Sub10_6683;
    boolean aBoolean6684;
    int anInt6685;
    NodeSub19Sub1 aClass348_Sub19_Sub1_6686;
    int anInt6687;
    NodeSub10 aClass348_Sub10_6688;
    int anInt6689;
    static int anInt6690;
    Npc aNpc_6691;
    NodeSub19Sub1 aClass348_Sub19_Sub1_6692;
    int anInt6693;
    int anInt6694;
    ObjectDefinition aClass51_6695;
    int anInt6696;
    int[] anIntArray6697;
    int anInt6698;
    boolean aBoolean6699;

    static final boolean method2778(RenderableObject class318_sub1, boolean bool, byte[][][] is, int i, byte i_0_) {
        if (!DefinitionSub17.aBoolean9242) return false;
        int i_1_ = class318_sub1.x >> Component149.anInt4459;
        int i_2_ = i_1_;
        int i_3_ = class318_sub1.y >> Component149.anInt4459;
        int i_4_ = i_3_;
        if (class318_sub1 instanceof Component327) {
            i_2_ = (((Component327) class318_sub1).aShort8751);
            i_4_ = (((Component327) class318_sub1).aShort8747);
            i_1_ = (((Component327) class318_sub1).aShort8743);
            i_3_ = (((Component327) class318_sub1).aShort8750);
        }
        for (int i_5_ = i_1_; i_5_ <= i_2_; i_5_++) {
            for (int i_6_ = i_3_; i_6_ <= i_4_; i_6_++) {
                if ((class318_sub1.aByte6376 < Component291.anInt2524) && i_5_ >= NameFormatter.anInt492 && i_5_ < DisplayModeManagerContainer91.anInt387 && i_6_ >= NodeSub34.anInt6974 && i_6_ < Component210.anInt5293) {
                    if ((is != null && class318_sub1.plane >= i && (is[class318_sub1.plane][i_5_][i_6_]) == i_0_) || !class318_sub1.method2378(0) || class318_sub1.method2382((byte) -79)) {
                        if (!bool && i_5_ >= Component256.anInt6111 - 16 && i_5_ <= Component256.anInt6111 + 16 && i_6_ >= DebugPanicSub2.anInt8502 - 16 && i_6_ <= DebugPanicSub2.anInt8502 + 16) {
                            if (DefinitionSub5.aBoolean9121) {
                                Component144.aClass315Array3982[GpsOverlay.anInt1949++].method2361(-15481, class318_sub1);
                                GpsOverlay.anInt1949 %= DisplayModeManagerContainer216.anInt5652;
                            } else class318_sub1.method2387(JaclibLoader.toolkit, -128);
                        }
                    } else return false;
                }
            }
        }
        return true;
    }

    static final int method2779(boolean bool, int i) {
        anInt6672++;
        if (i == 6407 || i == 34843 || i == 34837) return 6407;
        if (i == 6408 || i == 34842 || i == 34836) return 6408;
        if (i == 6406 || i == 34844) return 6406;
        if (i == 6409 || i == 34846) return 6409;
        if (i == 6410 || i == 34847) return 6410;
        if (bool != true) method2780(36, null, (byte) -28, -58, -120);
        if (i == 6402) return 6402;
        throw new IllegalArgumentException("");
    }

    static final void method2780(int i, String string, byte i_7_, int i_8_, int i_9_) {
        do {
            try {
                anInt6669++;
                DisplayModeManagerContainer57 class46 = NpcNode.getChildComponent(i, (byte) -54, i_9_);
                if (class46 != null) {
                    if (class46.optionScripts != null) {
                        NodeSub36 class348_sub36 = new NodeSub36();
                        class348_sub36.aClass46_6989 = class46;
                        class348_sub36.aString6994 = string;
                        class348_sub36.anObjectArray6987 = class46.optionScripts;
                        class348_sub36.anInt6986 = i_8_;
                        ClientScriptExecutor.runHook(class348_sub36);
                    }
                    if (Component49.clientState == 10 && client.getComponentSettings(class46).hasOption(-1 + i_8_, false)) {
                        if (i_8_ == 1) {
                            Component162.anInt8380++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((DisplayModeManagerContainer91.aClass351_398), (DisplayModeManagerContainer64.aClass77_9029), -93);
                            Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                            HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
                        }
                        if (i_8_ == 2) {
                            InputStream_Sub1.anInt71++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component33.aClass351_2638), (DisplayModeManagerContainer64.aClass77_9029), -98);
                            Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                            HashNodeSub14.enqueueOutboundPacket(126, class348_sub47);
                        }
                        if (i_8_ == 3) {
                            Component156.anInt3703++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((WaterSurfaceShader.aClass351_6244), (DisplayModeManagerContainer64.aClass77_9029), -93);
                            Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                            HashNodeSub14.enqueueOutboundPacket(-80, class348_sub47);
                        }
                        if (i_8_ == 4) {
                            Component330.anInt1514++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((ShaderSub3.aClass351_5204), (DisplayModeManagerContainer64.aClass77_9029), -82);
                            Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                            HashNodeSub14.enqueueOutboundPacket(116, class348_sub47);
                        }
                        int i_10_ = -80 / ((64 - i_7_) / 43);
                        if (i_8_ == 5) {
                            MatrixSub2.anInt5714++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Cp1252Decoder.aClass351_5217), (DisplayModeManagerContainer64.aClass77_9029), -94);
                            Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                            HashNodeSub14.enqueueOutboundPacket(123, class348_sub47);
                        }
                        if (i_8_ == 6) {
                            Component49.anInt4680++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((CursorDefinition.aClass351_2892), (DisplayModeManagerContainer64.aClass77_9029), -100);
                            Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                            HashNodeSub14.enqueueOutboundPacket(-4, class348_sub47);
                        }
                        if (i_8_ == 7) {
                            Component374.anInt4134++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component142.aClass351_4418), (DisplayModeManagerContainer64.aClass77_9029), -84);
                            Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                            HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
                        }
                        if (i_8_ == 8) {
                            DisplayModeManagerContainer67.anInt1726++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component315.aClass351_3165), (DisplayModeManagerContainer64.aClass77_9029), -117);
                            Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                            HashNodeSub14.enqueueOutboundPacket(-96, class348_sub47);
                        }
                        if (i_8_ == 9) {
                            NewsFetcher.anInt4198++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((ResourceLoader.aClass351_3898), (DisplayModeManagerContainer64.aClass77_9029), -107);
                            Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                            HashNodeSub14.enqueueOutboundPacket(119, class348_sub47);
                        }
                        if (i_8_ != 10) break;
                        Component17.anInt3886++;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component337.aClass351_3644, (DisplayModeManagerContainer64.aClass77_9029), -120);
                        Component121.method3614(i_9_, i, class46.itemId, class348_sub47, -19692);
                        HashNodeSub14.enqueueOutboundPacket(117, class348_sub47);
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("hf.D(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
            }
            break;
        } while (false);
    }

    final void method2781(byte i) {
        anInt6671++;
        int i_11_ = this.anInt6685;
        if (i == 21) {
            boolean bool = this.aBoolean6674;
            if (this.aClass51_6695 == null) {
                if (this.aNpc_6691 == null) {
                    if ((this.aPlayer_6679) != null) {
                        this.anInt6685 = (Component168.method2357(-1, (this.aPlayer_6679)));
                        this.anInt6694 = (this.aPlayer_6679.anInt10553) << 9;
                        this.anInt6677 = (this.aPlayer_6679.anInt10558);
                        this.anInt6681 = 256;
                        this.anInt6696 = 256;
                        this.aBoolean6674 = (this.aPlayer_6679.aBoolean10517);
                    }
                } else {
                    int i_12_ = (DisplayModeManagerContainer345.method214((this.aNpc_6691), -1));
                    if (i_12_ != i_11_) {
                        this.anInt6685 = i_12_;
                        NpcComposition class79 = (this.aNpc_6691.definition);
                        if (class79.anIntArray1377 != null) class79 = class79.method794((DisplayModeManagerContainer58.aClass170_10209), -1);
                        if (class79 == null) {
                            this.anInt6677 = this.anInt6694 = 0;
                            this.anInt6681 = 256;
                            this.anInt6696 = 256;
                            this.aBoolean6674 = this.aNpc_6691.definition.aBoolean1370;
                        } else {
                            this.anInt6694 = class79.anInt1392 << 9;
                            this.anInt6681 = class79.anInt1363;
                            this.anInt6677 = class79.anInt1356;
                            this.aBoolean6674 = class79.aBoolean1370;
                            this.anInt6696 = class79.anInt1340;
                        }
                    }
                }
            } else {
                ObjectDefinition class51 = (this.aClass51_6695.getTransformedDefinition(DisplayModeManagerContainer58.aClass170_10209, (byte) 47));
                if (class51 == null) {
                    this.anInt6681 = 256;
                    this.aBoolean6674 = false;
                    this.aBoolean6699 = false;
                    this.anIntArray6697 = null;
                    this.anInt6668 = 0;
                    this.anInt6677 = 0;
                    this.anInt6696 = 256;
                    this.anInt6680 = 0;
                    this.anInt6685 = -1;
                    this.anInt6694 = 0;
                } else {
                    this.anInt6681 = class51.anInt916;
                    this.anInt6685 = class51.anInt887;
                    this.anInt6696 = class51.anInt878;
                    this.anInt6694 = class51.anInt889 << 9;
                    this.aBoolean6674 = class51.aBoolean888;
                    this.anInt6680 = class51.anInt962;
                    this.anInt6677 = class51.anInt936;
                    this.anInt6668 = class51.anInt937;
                    this.aBoolean6699 = class51.aBoolean903;
                    this.anIntArray6697 = class51.anIntArray904;
                }
            }
            if (((i_11_ != this.anInt6685) || bool == !this.aBoolean6674) && this.aClass348_Sub16_Sub5_6676 != null) {
                PlayerState.aClass348_Sub16_Sub4_7065.method2880(this.aClass348_Sub16_Sub5_6676);
                this.aClass348_Sub19_Sub1_6686 = null;
                this.aClass348_Sub16_Sub5_6676 = null;
                this.aClass348_Sub10_6688 = null;
            }
        }
    }

    static final byte method2782(int i, int i_13_, int i_14_) {
        if (i_14_ != 0) method2783(-96, (byte) -65, -96);
        anInt6690++;
        if (i_13_ != 9) return (byte) 0;
        if ((i & 0x1) == 0) return (byte) 1;
        return (byte) 2;
    }

    static final boolean method2783(int i, byte i_15_, int i_16_) {
        anInt6682++;
        int i_17_ = 53 / ((15 - i_15_) / 55);
        return (HashNodeSub16Sub1.hasFlag0x10(i_16_, i, 118) & Component63.method3563(i_16_, (byte) 56, i));
    }

    public SceneNode() {
        /* empty */
    }
}
