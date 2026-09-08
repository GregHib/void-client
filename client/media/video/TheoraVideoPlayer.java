/* TheoraVideoPlayer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class88` (JODE-obfuscated).
 * Theora video player. Uses the jagtheora native library to decode and play .ogg/theora video (cutscenes); wraps playback with Throwable/Exception guards.
 */

import java.io.IOException;
import java.net.Socket;
import java.net.URL;

final class TheoraVideoPlayer {
    static int anInt1492;
    static int anInt1493;
    static int anInt1494;
    static int anInt1495;
    static int anInt1496;
    static int anInt1497 = 0;
    static int anInt1498;
    static int anInt1499;
    static boolean aBoolean1500 = false;
    static int anInt1501;
    static int anInt1502;
    RenderableSub9 aClass318_Sub9_1503 = new RenderableSub9();
    static int anInt1504;
    private RenderableSub9 aClass318_Sub9_1505;

    final int method840(int i) {
        anInt1496++;
        int i_0_ = i;
        RenderableSub9 class318_sub9 = (this.aClass318_Sub9_1503.aClass318_Sub9_6469);
        while (this.aClass318_Sub9_1503 != class318_sub9) {
            class318_sub9 = class318_sub9.aClass318_Sub9_6469;
            i_0_++;
        }
        return i_0_;
    }

    static final Component150[] method841(int i) {
        if (i > -126) printClientError(null, -66);
        anInt1504++;
        return (new Component150[]{ImageCache.aClass227_2568, Component265.aClass227_1591, BuildInfo.aClass227_151});
    }

    static final void method842(boolean bool) {
        anInt1501++;
        Component161.aClass46Array1942 = null;
        if (Component210.gameCanvasAttached && MenuEntry.getWindowMode(-82) != 1) OutputStream_Sub1.method132(106, (Component49.clientState == 3) || Component49.clientState == 7, NodeBaseSub1.method3439(107), 0, ComponentSettings.method3306((byte) -111), 0);
        int i = 0;
        if (bool != false) printClientError(null, -110);
        int i_1_ = 0;
        if (Component210.gameCanvasAttached) {
            i = BufferCacheSub3.method4008((byte) -124);
            i_1_ = Component110.method260(false);
        }
        Component146.method1252(i_1_, r.anInt9721, i_1_, -1, i, i + Component236.canvasWidth, i_1_ - -PacketReader.canvasHeight, (byte) 116, i);
        if (Component161.aClass46Array1942 != null) {
            ImageDefinition.method3064(i, Component257.anInt4792, true, NodeSub1.anInt6555, i_1_, Component374.aClass46_4130.anInt760, i + Component236.canvasWidth, false, Component161.aClass46Array1942, -1412584499, i_1_ - -PacketReader.canvasHeight);
            Component161.aClass46Array1942 = null;
        }
    }

    static final void method843(byte i) {
        anInt1499++;
        LoginPrefs.tick();
        if (Component241.anInt2955 != 0 && Component241.anInt2955 != 5) {
            try {
                int i_2_;
                if (Component212.anInt9971 != 0) i_2_ = 2000;
                else i_2_ = 250;
                if (i_2_ < ++Component53.anInt197) {
                    if (DefinitionSub8.aClass238_9165 != null) {
                        DefinitionSub8.aClass238_9165.close((byte) 36);
                        DefinitionSub8.aClass238_9165 = null;
                    }
                    if (Component212.anInt9971 >= 3) {
                        Component241.anInt2955 = 0;
                        WorldNameText.method254(-5, (byte) -111);
                        return;
                    }
                    if (Component205.anInt5969 != 2) ItemDefinitionProvider.aClass161_3285.method1259(0);
                    else Component223.aClass161_125.method1259(0);
                    Component212.anInt9971++;
                    Component241.anInt2955 = 1;
                    Component53.anInt197 = 0;
                }
                if (Component241.anInt2955 == 1) {
                    if (Component205.anInt5969 == 2 && !Loader.splitPorts) DisplayModeManagerContainer273.aClass144_5800 = (Component223.aClass161_125.method1262(OggUrlStream.aClass297_8992, (byte) 36));
                    else DisplayModeManagerContainer273.aClass144_5800 = (ItemDefinitionProvider.aClass161_3285.method1262(OggUrlStream.aClass297_8992, (byte) 36));
                    Component241.anInt2955 = 2;
                }
                if (Component241.anInt2955 == 2) {
                    if (DisplayModeManagerContainer273.aClass144_5800.status == 2) throw new IOException();
                    if (DisplayModeManagerContainer273.aClass144_5800.status != 1) return;
                    DefinitionSub8.aClass238_9165 = OggStreamReader.openSocketStream(((Socket) (DisplayModeManagerContainer273.aClass144_5800.result)), (byte) -118, 7500);
                    DisplayModeManagerContainer273.aClass144_5800 = null;
                    NodeSub3.method2739(0);
                    ParticleSystem class348_sub47 = DisplayModeManagerContainer351.method1478(true);
                    class348_sub47.particleBuffer.writeByte(false, DisplayModeManagerContainer109.aClass29_2339.anInt400);
                    HashNodeSub14.enqueueOutboundPacket(9, class348_sub47);
                    Component302.method1802(0);
                    Component241.anInt2955 = 3;
                }
                if (Component241.anInt2955 == 3) {
                    if (!DefinitionSub8.aClass238_9165.availableAtLeast(1, 107)) return;
                    DefinitionSub8.aClass238_9165.readBytes(1, 0, (byte) -118, (Component80.packetBuffer.payload));
                    int i_3_ = ((Component80.packetBuffer.payload[0]) & 0xff);
                    if (i_3_ != 0) {
                        Component241.anInt2955 = 0;
                        WorldNameText.method254(i_3_, (byte) -113);
                        DefinitionSub8.aClass238_9165.close((byte) 36);
                        DefinitionSub8.aClass238_9165 = null;
                        InflaterDecompressor.returnFromLoginFailure((byte) 3);
                        return;
                    }
                    Component80.packetBuffer.offset = 0;
                    Buffer class348_sub49 = new Buffer(518);
                    int[] is = new int[4];
                    is[0] = (int) (Math.random() * 9.9999999E7);
                    is[1] = (int) (9.9999999E7 * Math.random());
                    is[3] = (int) (9.9999999E7 * Math.random());
                    is[2] = (int) (9.9999999E7 * Math.random());
                    class348_sub49.writeByte(false, 10);
                    class348_sub49.writeInt((byte) 91, is[0]);
                    class348_sub49.writeInt((byte) 96, is[1]);
                    class348_sub49.writeInt((byte) 95, is[2]);
                    class348_sub49.writeInt((byte) 127, is[3]);
                    class348_sub49.writeLong(0L, (byte) 70);
                    class348_sub49.writeString((byte) -5, DisplayModeManagerContainer51.password);
                    class348_sub49.writeLong(ObjectDeserializer.userHash, (byte) -124);
                    class348_sub49.writeLong(OutputStream_Sub2.aLong108, (byte) -112);
                    class348_sub49.applyRsa(Sprite.aBigInteger6921, (byte) -76, (Component269.aBigInteger8762));
                    NodeSub3.method2739(0);
                    ParticleSystem class348_sub47 = DisplayModeManagerContainer351.method1478(true);
                    DisplayModeManagerContainer207 class348_sub49_sub2 = (class348_sub47.particleBuffer);
                    if (Component205.anInt5969 == 2) {
                        if (Component49.clientState != 13) class348_sub49_sub2.writeByte(false, DisplayModeManagerContainer109.aClass29_2342.anInt400);
                        else class348_sub49_sub2.writeByte(false, DisplayModeManagerContainer109.aClass29_2344.anInt400);
                        class348_sub49_sub2.writeShort((byte) 107, 0);
                        int i_6_ = class348_sub49_sub2.offset;
                        class348_sub49_sub2.writeInt((byte) 117, 634);
                        class348_sub49_sub2.writeBytes(class348_sub49.offset, 0, class348_sub49.payload, 92);
                        int i_7_ = class348_sub49_sub2.offset;
                        class348_sub49_sub2.writeString((byte) -5, DisplayModeManagerContainer282.username);
                        class348_sub49_sub2.writeByte(false, (RuntimeException_Sub1.anInt4596));
                        class348_sub49_sub2.writeByte(false, MenuEntry.getWindowMode(-71));
                        class348_sub49_sub2.writeShort((byte) 107, Component236.canvasWidth);
                        class348_sub49_sub2.writeShort((byte) 107, PacketReader.canvasHeight);
                        class348_sub49_sub2.writeByte(false, Component192.preferences.aClass239_Sub20_7248.method1808(-32350));
                        BufferCacheSub2.method4002(class348_sub49_sub2, (byte) 55);
                        class348_sub49_sub2.writeString((byte) -5, Component205.settingsCookie);
                        class348_sub49_sub2.writeInt((byte) 120, Connection.affiliateId);
                        Buffer class348_sub49_8_ = Component192.preferences.method3427(24);
                        class348_sub49_sub2.writeByte(false, (class348_sub49_8_.offset));
                        class348_sub49_sub2.writeBytes(class348_sub49_8_.offset, 0, (class348_sub49_8_.payload), 74);
                        r.aBoolean9719 = true;
                        Buffer class348_sub49_9_ = new Buffer(DefinitionSub20.aClass348_Sub4_9264.method2746((byte) -76));
                        DefinitionSub20.aClass348_Sub4_9264.method2747(1, class348_sub49_9_);
                        class348_sub49_sub2.writeBytes((class348_sub49_9_.payload).length, 0, (class348_sub49_9_.payload), -73);
                        class348_sub49_sub2.writeShort((byte) 107, DisplayModeManagerContainer136.anInt4718);
                        class348_sub49_sub2.writeLong(ModelStore.aLong4615, (byte) -63);
                        class348_sub49_sub2.writeByte(false, Component19.aString8605 == null ? 0 : 1);
                        if (Component19.aString8605 != null) class348_sub49_sub2.writeString((byte) -5, (Component19.aString8605));
                        class348_sub49_sub2.writeByte(false, (!DefinitionSub31.method3131((byte) 50, "jagtheora") ? 0 : 1));
                        Component270.method1244(64, class348_sub49_sub2);
                        class348_sub49_sub2.xteaEncrypt(i_7_, true, is, (class348_sub49_sub2.offset));
                        class348_sub49_sub2.writeLengthShort(1809639944, -i_6_ + (class348_sub49_sub2.offset));
                    } else {
                        class348_sub49_sub2.writeByte(false, DisplayModeManagerContainer109.aClass29_2345.anInt400);
                        class348_sub49_sub2.writeShort((byte) 107, 0);
                        int i_4_ = class348_sub49_sub2.offset;
                        class348_sub49_sub2.writeInt((byte) 119, 634);
                        class348_sub49_sub2.writeBytes(class348_sub49.offset, 0, class348_sub49.payload, -109);
                        int i_5_ = class348_sub49_sub2.offset;
                        class348_sub49_sub2.writeString((byte) -5, DisplayModeManagerContainer282.username);
                        class348_sub49_sub2.writeByte(false, PacketReader.currentGameType.id);
                        class348_sub49_sub2.writeByte(false, ObjectDeserializer.languageId);
                        BufferCacheSub2.method4002(class348_sub49_sub2, (byte) 55);
                        class348_sub49_sub2.writeString((byte) -5, Component205.settingsCookie);
                        class348_sub49_sub2.writeInt((byte) 106, Connection.affiliateId);
                        Component270.method1244(92, class348_sub49_sub2);
                        class348_sub49_sub2.xteaEncrypt(i_5_, true, is, (class348_sub49_sub2.offset));
                        class348_sub49_sub2.writeLengthShort(1809639944, -i_4_ + (class348_sub49_sub2.offset));
                    }
                    HashNodeSub14.enqueueOutboundPacket(-48, class348_sub47);
                    Component302.method1802(0);
                    DisplayModeManagerContainer64.aClass77_9029 = new DisplayModeManagerContainer123(is);
                    for (int i_10_ = 0; i_10_ < 4; i_10_++)
                        is[i_10_] += 50;
                    Component80.packetBuffer.method3406(-111, is);
                    Component241.anInt2955 = 4;
                }
                if (Component241.anInt2955 == 4) {
                    if (!DefinitionSub8.aClass238_9165.availableAtLeast(1, 94)) return;
                    DefinitionSub8.aClass238_9165.readBytes(1, 0, (byte) -117, (Component80.packetBuffer.payload));
                    int i_11_ = ((Component80.packetBuffer.payload[0]) & 0xff);
                    if (i_11_ != 21) {
                        if (i_11_ == 29) Component241.anInt2955 = 13;
                        else {
                            if (i_11_ == 1) {
                                Component241.anInt2955 = 5;
                                WorldNameText.method254(i_11_, (byte) -125);
                                return;
                            }
                            if (i_11_ != 2) {
                                if (i_11_ != 15) {
                                    if (i_11_ == 23 && Component212.anInt9971 < 3) {
                                        Component241.anInt2955 = 1;
                                        Component212.anInt9971++;
                                        Component53.anInt197 = 0;
                                        DefinitionSub8.aClass238_9165.close((byte) 36);
                                        DefinitionSub8.aClass238_9165 = null;
                                    } else {
                                        Component241.anInt2955 = 0;
                                        WorldNameText.method254(i_11_, (byte) -87);
                                        DefinitionSub8.aClass238_9165.close((byte) 36);
                                        DefinitionSub8.aClass238_9165 = null;
                                        InflaterDecompressor.returnFromLoginFailure((byte) 3);
                                        return;
                                    }
                                    return;
                                }
                                Component241.anInt2955 = 14;
                                DefinitionSub25.anInt9341 = -2;
                            } else Component241.anInt2955 = 8;
                        }
                    } else Component241.anInt2955 = 7;
                }
                if (Component241.anInt2955 == 6) {
                    NodeSub3.method2739(0);
                    ParticleSystem class348_sub47 = DisplayModeManagerContainer351.method1478(true);
                    DisplayModeManagerContainer207 class348_sub49_sub2 = (class348_sub47.particleBuffer);
                    class348_sub49_sub2.method3416(-18, DisplayModeManagerContainer64.aClass77_9029);
                    class348_sub49_sub2.method3408((DisplayModeManagerContainer109.aClass29_2351.anInt400), 18676);
                    HashNodeSub14.enqueueOutboundPacket(-87, class348_sub47);
                    Component302.method1802(0);
                    Component241.anInt2955 = 4;
                } else if (Component241.anInt2955 == 7) {
                    if (DefinitionSub8.aClass238_9165.availableAtLeast(1, 118)) {
                        DefinitionSub8.aClass238_9165.readBytes(1, 0, (byte) -109, (Component80.packetBuffer.payload));
                        int i_12_ = 0xff & (Component80.packetBuffer.payload[0]);
                        Component241.anInt2955 = 0;
                        Component227.anInt1121 = (3 + i_12_) * 60;
                        WorldNameText.method254(21, (byte) -95);
                        DefinitionSub8.aClass238_9165.close((byte) 36);
                        DefinitionSub8.aClass238_9165 = null;
                        InflaterDecompressor.returnFromLoginFailure((byte) 3);
                    }
                } else if (Component241.anInt2955 == 13) {
                    if (DefinitionSub8.aClass238_9165.availableAtLeast(1, 102)) {
                        DefinitionSub8.aClass238_9165.readBytes(1, 0, (byte) -128, (Component80.packetBuffer.payload));
                        Component241.anInt2955 = 0;
                        HashNodeSub7.anInt9541 = 0xff & (Component80.packetBuffer.payload[0]);
                        WorldNameText.method254(29, (byte) -97);
                        DefinitionSub8.aClass238_9165.close((byte) 36);
                        DefinitionSub8.aClass238_9165 = null;
                        InflaterDecompressor.returnFromLoginFailure((byte) 3);
                    }
                } else if (Component241.anInt2955 == 8) {
                    if (DefinitionSub8.aClass238_9165.availableAtLeast(1, 107)) {
                        DefinitionSub8.aClass238_9165.readBytes(1, 0, (byte) -107, (Component80.packetBuffer.payload));
                        DisplayModeManagerContainer154.anInt1288 = 0xff & (Component80.packetBuffer.payload[0]);
                        Component241.anInt2955 = 9;
                    }
                } else {
                    if (Component241.anInt2955 == 9) {
                        DisplayModeManagerContainer207 class348_sub49_sub2 = Component80.packetBuffer;
                        if (Component205.anInt5969 == 2) {
                            if (!DefinitionSub8.aClass238_9165.availableAtLeast(DisplayModeManagerContainer154.anInt1288, 93)) return;
                            DefinitionSub8.aClass238_9165.readBytes(DisplayModeManagerContainer154.anInt1288, 0, (byte) 60, (class348_sub49_sub2.payload));
                            class348_sub49_sub2.offset = 0;
                            Component353.anInt2581 = class348_sub49_sub2.readUnsignedByte(255);
                            Component15.anInt4919 = class348_sub49_sub2.readUnsignedByte(255);
                            ParametricDefinition.aBoolean9103 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            HeapDumper.aBoolean1915 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            RSACipher.aBoolean4903 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            Component308.aBoolean5233 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            StringDefinition.anInt9591 = class348_sub49_sub2.readUnsignedShort(842397944);
                            DisplayModeManagerContainer105.aBoolean4888 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            DisplayModeManagerContainer310.anInt359 = class348_sub49_sub2.readSignedMedium((byte) 125);
                            Component387.aBoolean1900 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            GradientPreset.aClass263_9195.method2004(Component387.aBoolean1900, (byte) 25);
                            Exception_Sub1.itemDefinitions.method1934((byte) 11, Component387.aBoolean1900);
                            Component291.aClass278_2529.method2072((byte) 88, Component387.aBoolean1900);
                        } else {
                            if (!DefinitionSub8.aClass238_9165.availableAtLeast(DisplayModeManagerContainer154.anInt1288, 107)) return;
                            DefinitionSub8.aClass238_9165.readBytes(DisplayModeManagerContainer154.anInt1288, 0, (byte) 85, (class348_sub49_sub2.payload));
                            class348_sub49_sub2.offset = 0;
                            Component353.anInt2581 = class348_sub49_sub2.readUnsignedByte(255);
                            Component15.anInt4919 = class348_sub49_sub2.readUnsignedByte(255);
                            ParametricDefinition.aBoolean9103 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            HeapDumper.aBoolean1915 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            RSACipher.aBoolean4903 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            Component262.anInt1758 = class348_sub49_sub2.readShort(13638);
                            DisplayModeManagerContainer105.aBoolean4888 = Component262.anInt1758 > 0;
                            DisplayModeManagerContainer136.anInt4716 = class348_sub49_sub2.readUnsignedShort(842397944);
                            ImageCacheStore.anInt4026 = class348_sub49_sub2.readUnsignedShort(842397944);
                            DisplayModeManagerContainer105.anInt4870 = class348_sub49_sub2.readUnsignedShort(842397944);
                            DisplayModeManagerContainer292.anInt5065 = class348_sub49_sub2.readInt((byte) -126);
                            PauseHandler.aClass144_9536 = OggUrlStream.aClass297_8992.reverseDns(116, DisplayModeManagerContainer292.anInt5065);
                            Component43.anInt4976 = class348_sub49_sub2.readUnsignedByte(255);
                            DisplayModeManagerContainer273.anInt5797 = class348_sub49_sub2.readUnsignedShort(842397944);
                            NodederUtil.anInt6632 = class348_sub49_sub2.readUnsignedShort(842397944);
                            Component200.aBoolean3706 = class348_sub49_sub2.readUnsignedByte(255) == 1;
                            Component72.localPlayer.username = Component72.localPlayer.displayName = BufferCacheSub2.aString8265 = class348_sub49_sub2.readGjstr2(-13487);
                            Applet_Sub1.anInt37 = class348_sub49_sub2.readUnsignedByte(255);
                            NodeSub1.anInt6551 = class348_sub49_sub2.readInt((byte) -126);
                            ShaderSub2.aClass161_5199 = new DisplayModeManagerContainer254();
                            ShaderSub2.aClass161_5199.anInt2143 = class348_sub49_sub2.readUnsignedShort(842397944);
                            if (ShaderSub2.aClass161_5199.anInt2143 == 65535) ShaderSub2.aClass161_5199.anInt2143 = -1;
                            ShaderSub2.aClass161_5199.aString2147 = class348_sub49_sub2.readGjstr2(-13487);
                            if (Component326.LIVE != DisplayModeManagerContainer345.aClass364_165) {
                                ShaderSub2.aClass161_5199.anInt2138 = (50000 + (ShaderSub2.aClass161_5199.anInt2143));
                                ShaderSub2.aClass161_5199.anInt2148 = (40000 + (ShaderSub2.aClass161_5199.anInt2143));
                            }
                            if (DisplayModeManagerContainer345.aClass364_165 != DisplayModeManagerContainer154.LOCAL && ((Component223.aClass161_125.method1264((byte) 94, MenuOpener.aClass161_4839)) || (Component223.aClass161_125.method1264((byte) 112, (DefinitionSub35.aClass161_9443))))) HashNodeSub20.method3283(114);
                        }
                        if ((!ParametricDefinition.aBoolean9103 || RSACipher.aBoolean4903) && !DisplayModeManagerContainer105.aBoolean4888) {
                            try {
                                AppletInvoker.callAppletNoArgs((byte) 125, ToolkitFactory.anApplet1530, "unzap");
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        } else {
                            try {
                                AppletInvoker.callAppletNoArgs((byte) 125, ToolkitFactory.anApplet1530, "zap");
                            } catch (Throwable throwable) {
                                if (Component203.aBoolean8773) {
                                    try {
                                        ToolkitFactory.anApplet1530.getAppletContext().showDocument(new URL(ToolkitFactory.anApplet1530.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception exception) {
                                        /* empty */
                                    }
                                }
                            }
                        }
                        if (DisplayModeManagerContainer345.aClass364_165 == Component326.LIVE) {
                            try {
                                AppletInvoker.callAppletNoArgs((byte) 125, ToolkitFactory.anApplet1530, "loggedin");
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        }
                        if (Component205.anInt5969 == 2) Component241.anInt2955 = 11;
                        else {
                            Component241.anInt2955 = 0;
                            WorldNameText.method254(2, (byte) -92);
                            Component372.method1804(8839);
                            Buffer.setClientState(2, 7);
                            NodeSub3.aClass114_6584 = null;
                            return;
                        }
                    }
                    if (Component241.anInt2955 == 11) {
                        if (!DefinitionSub8.aClass238_9165.availableAtLeast(3, 94)) return;
                        DefinitionSub8.aClass238_9165.readBytes(3, 0, (byte) 11, (Component80.packetBuffer.payload));
                        Component241.anInt2955 = 12;
                    }
                    if (Component241.anInt2955 == 12) {
                        DisplayModeManagerContainer207 class348_sub49_sub2 = Component80.packetBuffer;
                        class348_sub49_sub2.offset = 0;
                        if (class348_sub49_sub2.method3404(-1510)) {
                            if (!DefinitionSub8.aClass238_9165.availableAtLeast(1, 110)) return;
                            DefinitionSub8.aClass238_9165.readBytes(1, 3, (byte) -127, (class348_sub49_sub2.payload));
                        }
                        NodeSub3.aClass114_6584 = (DisplayModeManagerContainer288.allPacketTypes(-11271)[class348_sub49_sub2.method3407(15295)]);
                        DefinitionSub25.anInt9341 = class348_sub49_sub2.readUnsignedShort(842397944);
                        Component241.anInt2955 = 10;
                    }
                    if (Component241.anInt2955 == 10) {
                        if (DefinitionSub8.aClass238_9165.availableAtLeast(DefinitionSub25.anInt9341, 96)) {
                            DefinitionSub8.aClass238_9165.readBytes(DefinitionSub25.anInt9341, 0, (byte) 28, (Component80.packetBuffer.payload));
                            Component80.packetBuffer.offset = 0;
                            Component241.anInt2955 = 0;
                            int i_13_ = DefinitionSub25.anInt9341;
                            WorldNameText.method254(2, (byte) -124);
                            DisplayModeManagerContainer273.method1135(0);
                            DisplayModeManagerContainer348.method1741(Component80.packetBuffer, (byte) 118);
                            GraphicsToolkit.anInt4581 = -1;
                            if (NodeSub3.aClass114_6584 != Component248.aClass114_304) DefinitionSub26.method3120(-92);
                            else Component330.method853((byte) 99);
                            if (i_13_ != Component80.packetBuffer.offset) throw new RuntimeException("lswp pos:" + (Component80.packetBuffer.offset) + " psize:" + i_13_);
                            NodeSub3.aClass114_6584 = null;
                        }
                    } else {
                        int i_14_ = -128 / (-i / 53);
                        if (Component241.anInt2955 == 14) {
                            if (DefinitionSub25.anInt9341 == -2) {
                                if (!DefinitionSub8.aClass238_9165.availableAtLeast(2, 106)) return;
                                DefinitionSub8.aClass238_9165.readBytes(2, 0, (byte) -128, (Component80.packetBuffer.payload));
                                Component80.packetBuffer.offset = 0;
                                DefinitionSub25.anInt9341 = Component80.packetBuffer.readUnsignedShort(842397944);
                            }
                            if (DefinitionSub8.aClass238_9165.availableAtLeast(DefinitionSub25.anInt9341, 117)) {
                                DefinitionSub8.aClass238_9165.readBytes(DefinitionSub25.anInt9341, 0, (byte) -104, (Component80.packetBuffer.payload));
                                Component80.packetBuffer.offset = 0;
                                int i_15_ = DefinitionSub25.anInt9341;
                                Component241.anInt2955 = 0;
                                WorldNameText.method254(15, (byte) -120);
                                Component37.method2330((byte) 86);
                                DisplayModeManagerContainer348.method1741(Component80.packetBuffer, (byte) 118);
                                if (i_15_ != (Component80.packetBuffer.offset)) throw new RuntimeException("lswpr pos:" + (Component80.packetBuffer.offset) + " psize:" + i_15_);
                                NodeSub3.aClass114_6584 = null;
                            }
                        }
                    }
                }
            } catch (IOException ioexception) {
                if (DefinitionSub8.aClass238_9165 != null) {
                    DefinitionSub8.aClass238_9165.close((byte) 36);
                    DefinitionSub8.aClass238_9165 = null;
                }
                if (Component212.anInt9971 >= 3) {
                    Component241.anInt2955 = 0;
                    WorldNameText.method254(-4, (byte) -87);
                    InflaterDecompressor.returnFromLoginFailure((byte) 3);
                } else {
                    if (Component205.anInt5969 != 2) ItemDefinitionProvider.aClass161_3285.method1259(0);
                    else Component223.aClass161_125.method1259(0);
                    Component212.anInt9971++;
                    Component53.anInt197 = 0;
                    Component241.anInt2955 = 1;
                }
            }
        }
    }

    final void method844(RenderableSub9 class318_sub9, boolean bool) {
        try {
            anInt1495++;
            if (class318_sub9.aClass318_Sub9_6468 != null) class318_sub9.method2514(93);
            class318_sub9.aClass318_Sub9_6469 = this.aClass318_Sub9_1503;
            class318_sub9.aClass318_Sub9_6468 = (this.aClass318_Sub9_1503.aClass318_Sub9_6468);
            if (bool != true) this.aClass318_Sub9_1503 = null;
            class318_sub9.aClass318_Sub9_6468.aClass318_Sub9_6469 = class318_sub9;
            class318_sub9.aClass318_Sub9_6469.aClass318_Sub9_6468 = class318_sub9;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lh.A(" + (class318_sub9 != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    final void method845(byte i) {
        for (; ; ) {
            RenderableSub9 class318_sub9 = (this.aClass318_Sub9_1503.aClass318_Sub9_6469);
            if (class318_sub9 == this.aClass318_Sub9_1503) break;
            class318_sub9.method2514(54);
        }
        if (i < 23) aClass318_Sub9_1505 = null;
        anInt1493++;
        aClass318_Sub9_1505 = null;
    }

    final RenderableSub9 method846(byte i) {
        anInt1494++;
        RenderableSub9 class318_sub9 = aClass318_Sub9_1505;
        if (class318_sub9 == this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null;
            return null;
        }
        if (i > -34) aClass318_Sub9_1505 = null;
        aClass318_Sub9_1505 = class318_sub9.aClass318_Sub9_6469;
        return class318_sub9;
    }

    static final void printClientError(String string, int i) {
        System.out.println("Error: " + DisplayModeManagerContainer196.replaceAll("\n", true, "%0a", string));
        anInt1492++;
        if (i != -5192) method843((byte) 17);
    }

    final RenderableSub9 method848(int i) {
        if (i != 8) return null;
        anInt1502++;
        RenderableSub9 class318_sub9 = (this.aClass318_Sub9_1503.aClass318_Sub9_6469);
        if (class318_sub9 == this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null;
            return null;
        }
        aClass318_Sub9_1505 = class318_sub9.aClass318_Sub9_6469;
        return class318_sub9;
    }

    public TheoraVideoPlayer() {
        this.aClass318_Sub9_1503.aClass318_Sub9_6468 = this.aClass318_Sub9_1503;
        this.aClass318_Sub9_1503.aClass318_Sub9_6469 = this.aClass318_Sub9_1503;
    }
}
