/* ClientSystemInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub24` (JODE-obfuscated).
 * Client system-info collector. extends Node; reads System.getProperty('java.version') and 'os.version' and reports 'Unknown' fallbacks.
 */

import java.io.File;

final class ClientSystemInfo extends Node {
    static int anInt6871;
    int anInt6872;
    static int anInt6873;
    static int anInt6874;
    int anInt6875;
    static String aString6876;
    static String aString6877;
    static int[] anIntArray6878;

    static final void method2991(int i) {
        if (Component156.anInt3699 > 1) {
            DefinitionSub23.anInt9313 = ResourceLoader.anInt3918;
            Component156.anInt3699--;
        }
        anInt6874++;
        if (Component338.aBoolean1712) {
            Component338.aBoolean1712 = false;
            SocketConnector.forceLogout(67);
        } else {
            if (!Component364.aBoolean8335) DisplayModeManagerContainer190.resetNodeStates((byte) 95);
            for (int i_0_ = 0; i_0_ < 100; i_0_++) {
                if (!Component102.method2203((byte) -52)) break;
            }
            if (Component49.clientState == 10) {
                while (ShaderProgram.method2138(i ^ 0x2ca2)) {
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component211.aClass351_1961, (DisplayModeManagerContainer64.aClass77_9029), -92);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                    int i_1_ = (class348_sub47.aClass348_Sub49_Sub2_7116.offset);
                    ObjectDeserializer.writeReflectionCheckResults((byte) 121, (class348_sub47.aClass348_Sub49_Sub2_7116));
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeLengthByte(113, (class348_sub47.aClass348_Sub49_Sub2_7116.offset) + -i_1_);
                    HashNodeSub14.enqueueOutboundPacket(119, class348_sub47);
                }
                if (Component323.aClass348_Sub26_5881 != null) {
                    if ((Component323.aClass348_Sub26_5881.anInt6887) != -1) {
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((AbstractShaderSub4.aClass351_7318), (DisplayModeManagerContainer64.aClass77_9029), -81);
                        class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, Component323.aClass348_Sub26_5881.anInt6887);
                        HashNodeSub14.enqueueOutboundPacket(122, class348_sub47);
                        Component323.aClass348_Sub26_5881 = null;
                        MatrixSub2.aLong5745 = Component240.currentTimeMillis(-106) + 30000L;
                    }
                } else if (MatrixSub2.aLong5745 <= Component240.currentTimeMillis(-121)) Component323.aClass348_Sub26_5881 = DisplayModeManagerContainer154.aClass169_1286.enqueue(-5255, (Component223.aClass161_125.aString2147));
                NodeSub45 class348_sub45 = ((NodeSub45) Component327.aClass262_8744.first(4));
                if (class348_sub45 != null || (Component117.aLong4367 < -2000L + Component240.currentTimeMillis(-97))) {
                    ParticleSystem class348_sub47 = null;
                    int i_2_ = 0;
                    for (NodeSub45 class348_sub45_3_ = ((NodeSub45) CacheNodeSub1.aClass262_10479.first(4)); class348_sub45_3_ != null; class348_sub45_3_ = (NodeSub45) CacheNodeSub1.aClass262_10479.next((byte) 79)) {
                        if (class348_sub47 != null && (class348_sub47.aClass348_Sub49_Sub2_7116.offset - i_2_ >= 240)) break;
                        class348_sub45_3_.unlink((byte) 107);
                        int i_4_ = class348_sub45_3_.getY(-15);
                        if (i_4_ >= -1) {
                            if (i_4_ > 65534) i_4_ = 65534;
                        } else i_4_ = -1;
                        int i_5_ = class348_sub45_3_.getX((byte) -127);
                        if (i_5_ >= -1) {
                            if (i_5_ > 65534) i_5_ = 65534;
                        } else i_5_ = -1;
                        if (BufferCacheSub2.anInt8270 != i_5_ || i_4_ != ImageCacheStore.anInt4032) {
                            if (class348_sub47 == null) {
                                CollisionMap.anInt4450++;
                                class348_sub47 = (ParticleShader.createOutboundPacket(StringDefinition.aClass351_9590, DisplayModeManagerContainer64.aClass77_9029, -94));
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                                i_2_ = class348_sub47.aClass348_Sub49_Sub2_7116.offset;
                            }
                            int i_6_ = -BufferCacheSub2.anInt8270 + i_5_;
                            BufferCacheSub2.anInt8270 = i_5_;
                            int i_7_ = i_4_ - ImageCacheStore.anInt4032;
                            ImageCacheStore.anInt4032 = i_4_;
                            int i_8_ = (int) ((class348_sub45_3_.getWhen((byte) -107) + -Component117.aLong4367) / 20L);
                            if (i_8_ >= 8 || i_6_ < -32 || i_6_ > 31 || i_7_ < -32 || i_7_ > 31) {
                                if (i_8_ < 32 && i_6_ >= -128 && i_6_ <= 127 && i_7_ >= -128 && i_7_ <= 127) {
                                    i_6_ += 128;
                                    i_7_ += 128;
                                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 128 + i_8_);
                                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, i_7_ + (i_6_ << 8));
                                } else if (i_8_ >= 32) {
                                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, 57344 + i_8_);
                                    if (i_5_ == 1 || i_4_ == -1) class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 99, -2147483648);
                                    else class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 101, i_4_ << 16 | i_5_);
                                } else {
                                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 192 + i_8_);
                                    if (i_5_ != 1 && i_4_ != -1) class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 100, i_5_ | i_4_ << 16);
                                    else class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 114, -2147483648);
                                }
                            } else {
                                i_6_ += 32;
                                i_7_ += 32;
                                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, (i_7_ + (i_6_ << 6) + (i_8_ << 12)));
                            }
                            Component117.aLong4367 = class348_sub45_3_.getWhen((byte) -109);
                        }
                    }
                    if (class348_sub47 != null) {
                        class348_sub47.aClass348_Sub49_Sub2_7116.writeLengthByte(105, class348_sub47.aClass348_Sub49_Sub2_7116.offset + -i_2_);
                        HashNodeSub14.enqueueOutboundPacket(23, class348_sub47);
                    }
                }
                if (class348_sub45 != null) {
                    long l = ((class348_sub45.getWhen((byte) -110) + -DisplayModeManagerContainer194.aLong5089) / 50L);
                    DisplayModeManagerContainer194.aLong5089 = class348_sub45.getWhen((byte) -87);
                    if (l > 32767) l = 32767L;
                    int i_9_ = class348_sub45.getY(20);
                    if (i_9_ >= 0) {
                        if (i_9_ > 65535) i_9_ = 65535;
                    } else i_9_ = 0;
                    int i_10_ = class348_sub45.getX((byte) -128);
                    if (i_10_ < 0) i_10_ = 0;
                    else if (i_10_ > 65535) i_10_ = 65535;
                    int i_11_ = 0;
                    if (class348_sub45.getEventType(i ^ 0x2cee) == 2) i_11_ = 1;
                    int i_12_ = (int) l;
                    RunescapeInfo.anInt182++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(DisplayModeManagerContainer91.aClass351_395, (DisplayModeManagerContainer64.aClass77_9029), i + -11525);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, i_12_ | i_11_ << 15);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 121, i_9_ << 16 | i_10_);
                    HashNodeSub14.enqueueOutboundPacket(25, class348_sub47);
                }
                if (Component193.anInt3246 > 0) {
                    DefinitionSub26.anInt9348++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((ShaderCompilerSub1Sub1.aClass351_8798), (DisplayModeManagerContainer64.aClass77_9029), -111);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 3 * Component193.anInt3246);
                    for (int i_13_ = 0; (i_13_ < Component193.anInt3246); i_13_++) {
                        Interface6 interface6 = Component17.anInterface6Array3884[i_13_];
                        long l = ((interface6.getWhen((byte) -29) + -NodeSub7.aLong6651) / 50L);
                        NodeSub7.aLong6651 = interface6.getWhen((byte) 106);
                        if (l > 65535L) l = 65535L;
                        class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, interface6.getKeyCode(false));
                        class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, (int) l);
                    }
                    HashNodeSub14.enqueueOutboundPacket(-49, class348_sub47);
                }
                if (Component335.anInt2035 > 0) Component335.anInt2035--;
                if (DummyClass.aBoolean10174 && Component335.anInt2035 <= 0) {
                    Component302.anInt6033++;
                    DummyClass.aBoolean10174 = false;
                    Component335.anInt2035 = 20;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component337.aClass351_3648, (DisplayModeManagerContainer64.aClass77_9029), i + -11549);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShortAddLittle(i ^ 0x3c4d, (int) Component112.cameraYaw >> 3);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, (int) DisplayModeManagerContainer154.cameraPitch >> 3);
                    HashNodeSub14.enqueueOutboundPacket(-31, class348_sub47);
                }
                if (DisplayModeManagerContainer322.aBoolean4278 != Component143.aBoolean2329) {
                    Component209.anInt3460++;
                    DisplayModeManagerContainer322.aBoolean4278 = Component143.aBoolean2329;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((InputStream_Sub1.aClass351_77), (DisplayModeManagerContainer64.aClass77_9029), i ^ ~0x2cc8);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, !Component143.aBoolean2329 ? 0 : 1);
                    HashNodeSub14.enqueueOutboundPacket(i + -11501, class348_sub47);
                }
                if (!r.aBoolean9719) {
                    Component240.anInt1110++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component182.aClass351_9743), (DisplayModeManagerContainer64.aClass77_9029), -113);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                    int i_14_ = (class348_sub47.aClass348_Sub49_Sub2_7116.offset);
                    Buffer class348_sub49 = Component192.aClass348_Sub51_3959.method3427(i ^ 0x2cb0);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeBytes(class348_sub49.offset, 0, class348_sub49.payload, 82);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeLengthByte(96, (class348_sub47.aClass348_Sub49_Sub2_7116.offset) + -i_14_);
                    HashNodeSub14.enqueueOutboundPacket(i + -11473, class348_sub47);
                    r.aBoolean9719 = true;
                }
                if (Component335.aClass357ArrayArrayArray2029 != null) {
                    if (DefinitionSub21.cameraMode == 2) Component19.method241((byte) 127);
                    else if (DefinitionSub21.cameraMode == 3) NodeSub21.method2954((byte) -4);
                }
                if (!Component214.aBoolean2130) Component275.cameraYawRate /= 2.0F;
                else Component214.aBoolean2130 = false;
                if (!Cp1252Decoder.aBoolean5224) NodeSub27.cameraPitchRate /= 2.0F;
                else Cp1252Decoder.aBoolean5224 = false;
                NodeSub35.method3027((byte) 33);
                if (Component49.clientState == 10) {
                    HashNodeSub3.method3175((byte) 55);
                    PauseTimer.method362(i + -11335);
                    DisplayModeManagerContainer105.method1501(-123);
                    NodeSub50.anInt7213++;
                    if (NodeSub50.anInt7213 > 750) SocketConnector.forceLogout(83);
                    else {
                        Component225.method349(i + -6692);
                        DefinitionSub38.method3150(true);
                        DisplayModeManagerContainer51.method1397(0);
                        for (int i_15_ = DisplayModeManagerContainer58.aClass170_10209.method1305((byte) -126, true); i_15_ != -1; i_15_ = DisplayModeManagerContainer58.aClass170_10209.method1305((byte) -128, false)) {
                            LibraryCreditsText.method1767(true, i_15_);
                            DisplayModeManagerContainer363.anIntArray4096[GpsOverlay.bitwiseAnd(31, DisplayModeManagerContainer260.anInt3695++)] = i_15_;
                        }
                        for (RSARequest class348_sub42_sub15 = DefinitionSub30.method3127(2681); class348_sub42_sub15 != null; class348_sub42_sub15 = DefinitionSub30.method3127(2681)) {
                            int i_16_ = class348_sub42_sub15.method3245(true);
                            int i_17_ = class348_sub42_sub15.method3248(1);
                            if (i_16_ == 1) {
                                DisplayModeManagerContainer123.anIntArray1303[i_17_] = class348_sub42_sub15.anInt9652;
                                Component357.aBoolean2469 |= WaterShaderProgram.aBooleanArray6270[i_17_];
                                Request.anIntArray6890[GpsOverlay.bitwiseAnd(31, Component364.anInt8352++)] = i_17_;
                            } else if (i_16_ == 2) {
                                GlFramebufferTexture.aStringArray8532[i_17_] = class348_sub42_sub15.aString9654;
                                Component71.anIntArray6061[GpsOverlay.bitwiseAnd(DefinitionSub30.anInt9385++, 31)] = i_17_;
                            } else if (i_16_ == 3) {
                                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_17_);
                                if (!class348_sub42_sub15.aString9654.equals(class46.textContent)) {
                                    class46.textContent = class348_sub42_sub15.aString9654;
                                    Component111.markInterfaceDirty(-9343, class46);
                                }
                            } else if (i_16_ == 4) {
                                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_17_);
                                int i_18_ = (class348_sub42_sub15.anInt9652);
                                int i_19_ = (class348_sub42_sub15.anInt9651);
                                int i_20_ = (class348_sub42_sub15.anInt9650);
                                if (i_18_ != class46.anInt770 || (class46.anInt753 != i_19_) || (i_20_ != class46.anInt779)) {
                                    class46.anInt753 = i_19_;
                                    class46.anInt770 = i_18_;
                                    class46.anInt779 = i_20_;
                                    Component111.markInterfaceDirty(-9343, class46);
                                }
                            } else if (i_16_ == 5) {
                                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(i ^ 0x5a2da9d8, i_17_);
                                if ((class46.anInt699 != class348_sub42_sub15.anInt9652) || (class348_sub42_sub15.anInt9652 == -1)) {
                                    class46.anInt699 = class348_sub42_sub15.anInt9652;
                                    class46.anInt795 = 0;
                                    class46.anInt841 = 0;
                                    class46.anInt730 = 1;
                                    DisplayModeManagerContainer167 class17 = ((class46.anInt699 == -1) ? null : (RunescapeInfo.aClass87_191.getSequence((class46.anInt699), 7)));
                                    if (class17 != null) Component235.method2017((class46.anInt795), class17, 30);
                                    Component111.markInterfaceDirty(-9343, class46);
                                }
                            } else if (i_16_ == 6) {
                                int i_21_ = (class348_sub42_sub15.anInt9652);
                                int i_22_ = (0x7ff9 & i_21_) >> 10;
                                int i_23_ = 0x1f & i_21_ >> 5;
                                int i_24_ = 0x1f & i_21_;
                                int i_25_ = ((i_24_ << 3) + ((i_22_ << 19) - -(i_23_ << 11)));
                                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_17_);
                                if (class46.colour != i_25_) {
                                    class46.colour = i_25_;
                                    Component111.markInterfaceDirty(-9343, class46);
                                }
                            } else if (i_16_ == 7) {
                                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_17_);
                                boolean bool = (class348_sub42_sub15.anInt9652 == 1);
                                if (!class46.hidden == bool) {
                                    class46.hidden = bool;
                                    Component111.markInterfaceDirty(-9343, class46);
                                }
                            } else if (i_16_ == 8) {
                                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_17_);
                                if ((class46.anInt757 != class348_sub42_sub15.anInt9652) || (class46.anInt675 != class348_sub42_sub15.anInt9651) || (class46.anInt716 != class348_sub42_sub15.anInt9650)) {
                                    class46.anInt716 = class348_sub42_sub15.anInt9650;
                                    class46.anInt675 = class348_sub42_sub15.anInt9651;
                                    class46.anInt757 = class348_sub42_sub15.anInt9652;
                                    if (class46.itemId != -1) {
                                        if (class46.anInt796 <= 0) {
                                            if ((class46.baseWidth) > 0) class46.anInt716 = (32 * class46.anInt716 / (class46.baseWidth));
                                        } else class46.anInt716 = ((class46.anInt716) * 32 / (class46.anInt796));
                                    }
                                    Component111.markInterfaceDirty(-9343, class46);
                                }
                            } else if (i_16_ == 9) {
                                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_17_);
                                if ((class348_sub42_sub15.anInt9652 != class46.itemId) || (class348_sub42_sub15.anInt9651 != class46.itemAmount)) {
                                    class46.itemAmount = class348_sub42_sub15.anInt9651;
                                    class46.itemId = class348_sub42_sub15.anInt9652;
                                    Component111.markInterfaceDirty(-9343, class46);
                                }
                            } else if (i_16_ == 10) {
                                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_17_);
                                if ((class46.anInt808 != (class348_sub42_sub15.anInt9652)) || ((class46.anInt786) != (class348_sub42_sub15.anInt9651)) || ((class348_sub42_sub15.anInt9650) != class46.anInt717)) {
                                    class46.anInt786 = (class348_sub42_sub15.anInt9651);
                                    class46.anInt808 = (class348_sub42_sub15.anInt9652);
                                    class46.anInt717 = (class348_sub42_sub15.anInt9650);
                                    Component111.markInterfaceDirty(-9343, class46);
                                }
                            } else if (i_16_ == 11) {
                                DisplayModeManagerContainer57 class46 = (BitmapFont.getComponent(1512932720, i_17_));
                                class46.xMode = (byte) 0;
                                class46.absoluteY = class46.relativeY = (class348_sub42_sub15.anInt9651);
                                class46.yMode = (byte) 0;
                                class46.absoluteX = class46.relativeX = (class348_sub42_sub15.anInt9652);
                                Component111.markInterfaceDirty(-9343, class46);
                            } else if (i_16_ == 12) {
                                DisplayModeManagerContainer57 class46 = (BitmapFont.getComponent(1512932720, i_17_));
                                int i_26_ = (class348_sub42_sub15.anInt9652);
                                if (class46 != null && (class46.type) == 0) {
                                    if ((-(class46.height) + (class46.scrollHeight)) < i_26_) i_26_ = ((class46.scrollHeight) - (class46.height));
                                    if (i_26_ < 0) i_26_ = 0;
                                    if (i_26_ != (class46.scrollY)) {
                                        class46.scrollY = i_26_;
                                        Component111.markInterfaceDirty(-9343, class46);
                                    }
                                }
                            } else if (i_16_ == 14) {
                                DisplayModeManagerContainer57 class46 = (BitmapFont.getComponent(1512932720, i_17_));
                                class46.spriteId = (class348_sub42_sub15.anInt9652);
                            } else if (i_16_ == 15) {
                                Component263.anInt1548 = (class348_sub42_sub15.anInt9651);
                                Component253.anInt3203 = (class348_sub42_sub15.anInt9652);
                                NodeSub13.aBoolean6759 = true;
                            } else if (i_16_ == 16) {
                                DisplayModeManagerContainer57 class46 = (BitmapFont.getComponent(1512932720, i_17_));
                                class46.fontId = (class348_sub42_sub15.anInt9652);
                            } else if (i_16_ == 17) {
                                DisplayModeManagerContainer57 class46 = (BitmapFont.getComponent(1512932720, i_17_));
                                class46.anInt806 = (class348_sub42_sub15.anInt9652);
                            }
                        }
                        NodeSub51.anInt7267++;
                        if (Component20.anInt6048 != 0) {
                            Node.anInt4292 += 20;
                            if (Node.anInt4292 >= 400) Component20.anInt6048 = 0;
                        }
                        if (ResourceLoader.aClass46_3913 != null) {
                            Component83.anInt1656++;
                            if (Component83.anInt1656 >= 15) {
                                Component111.markInterfaceDirty(-9343, ResourceLoader.aClass46_3913);
                                ResourceLoader.aClass46_3913 = null;
                            }
                        }
                        DisplayModeManagerContainer104.aClass46_10336 = null;
                        Cp1252Decoder.aBoolean5221 = false;
                        Component39.aClass46_2249 = null;
                        Component162.aBoolean8386 = false;
                        Component2.method198(null, false, -1, -1);
                        Component143.method1343(-1, null, 1, -1);
                        if (!r.aBoolean9722) Component149.widgetCursorId = -1;
                        Component233.overGameScreen = false;
                        Component43.method1583((byte) -73);
                        ResourceLoader.anInt3918++;
                        if (Component233.overGameScreen && Component233.scrollWheelDiff != 0
                                && !StringCache.devConsoleOpen && !SceneEditorUi.isScrollOverUi()) {
                            if (Component353.anInt2581 <= 0 || !Component280.aClass346_2449.isKeyDown(82, -125) || !Component280.aClass346_2449.isKeyDown(81, -126)) {
                                Component233.zoomStep += -Component233.scrollWheelDiff * Loader.ZOOM_OFFSET_STEP;
                            }
                        }
                        if (DisplayModeManagerContainer87.aBoolean3103) {
                            Component122.anInt1568++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((GlToolkitSub2.aClass351_7715), (DisplayModeManagerContainer64.aClass77_9029), i + -11525);
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 117, (InputStream_Sub2.anInt85 << 14 | (DefinitionSub26.anInt9349 << 28) | NpcComposition.anInt1404));
                            HashNodeSub14.enqueueOutboundPacket(30, class348_sub47);
                            DisplayModeManagerContainer87.aBoolean3103 = false;
                        }
                        for (; ; ) {
                            NodeSub36 class348_sub36 = ((NodeSub36) Component222.aClass262_2707.peekFirst(8));
                            if (class348_sub36 == null) break;
                            DisplayModeManagerContainer57 class46 = (class348_sub36.aClass46_6989);
                            if (class46.childIndex >= 0) {
                                DisplayModeManagerContainer57 class46_27_ = BitmapFont.getComponent(1512932720, (class46.parentId));
                                if (class46_27_ == null || (class46_27_.children) == null || ((class46_27_.children).length <= class46.childIndex) || (class46 != (class46_27_.children[class46.childIndex]))) continue;
                            }
                            ClientScriptExecutor.runHook(class348_sub36);
                        }
                        for (; ; ) {
                            NodeSub36 class348_sub36 = ((NodeSub36) Component6.aClass262_4473.peekFirst(8));
                            if (class348_sub36 == null) break;
                            DisplayModeManagerContainer57 class46 = (class348_sub36.aClass46_6989);
                            if (class46.childIndex >= 0) {
                                DisplayModeManagerContainer57 class46_28_ = BitmapFont.getComponent(1512932720, (class46.parentId));
                                if (class46_28_ == null || (class46_28_.children) == null || (class46.childIndex >= (class46_28_.children).length) || ((class46_28_.children[class46.childIndex]) != class46)) continue;
                            }
                            ClientScriptExecutor.runHook(class348_sub36);
                        }
                        for (; ; ) {
                            NodeSub36 class348_sub36 = ((NodeSub36) NodeSub1Sub2.aClass262_8810.peekFirst(i + -11424));
                            if (class348_sub36 == null) break;
                            DisplayModeManagerContainer57 class46 = (class348_sub36.aClass46_6989);
                            if (class46.childIndex >= 0) {
                                DisplayModeManagerContainer57 class46_29_ = BitmapFont.getComponent(1512932720, (class46.parentId));
                                if (class46_29_ == null || (class46_29_.children) == null || (class46.childIndex >= (class46_29_.children).length) || ((class46_29_.children[class46.childIndex]) != class46)) continue;
                            }
                            ClientScriptExecutor.runHook(class348_sub36);
                        }
                        if (Component39.aClass46_2249 == null) HashNode.anInt7059 = 0;
                        if (Component156.aClass46_3701 != null) DisplayModeManagerContainer322.method2708(-30206);
                        // Ctrl+Shift + wheel: change local plane (debug teleport height).
                        if (Component353.anInt2581 > 0 && Component280.aClass346_2449.isKeyDown(82, i ^ ~0x2cd5) && Component280.aClass346_2449.isKeyDown(81, -121) && Component122.mouseWheelDelta != 0) {
                            int i_30_ = ((Component72.localPlayer.plane) - Component122.mouseWheelDelta);
                            if (i_30_ >= 0) {
                                if (i_30_ > 3) i_30_ = 3;
                            } else i_30_ = 0;
                            CollisionMap.method3502((Component72.localPlayer.anIntArray10317[0]) + Component330.regionTileY, i ^ 0x2caa, i_30_, (Component72.localPlayer.anIntArray10320[0]) + NodeBaseSub2.regionTileX);
                        }
                        DisplayModeManagerContainer1.updateMenuTip(-120);
                        int i_31_ = 0;
                        if (i == 11432) {
                            for (/**/; i_31_ < 5; i_31_++)
                                Component212.anIntArray9981[i_31_]++;
                            if (Component357.aBoolean2469 && (-60000L + Component240.currentTimeMillis(-84) > Component225.aLong482)) DisplayModeManagerContainer343.saveClientPreferences(i + -11313);
                            for (FriendLoginMessage class318_sub9_sub1 = ((FriendLoginMessage) HashNodeSub14.friendLoginMessages.method1872(i + -11424)); class318_sub9_sub1 != null; class318_sub9_sub1 = ((FriendLoginMessage) HashNodeSub14.friendLoginMessages.method1878((byte) -105))) {
                                if ((Component240.currentTimeMillis(i ^ ~0x2ce9) / 1000L + -5L) > (long) class318_sub9_sub1.timestampSeconds) {
                                    if (class318_sub9_sub1.worldId > 0) ShaderProgramSub2.addChatMessage("", 5, (byte) -128, 0, (class318_sub9_sub1.username + (FriendsIgnoreList.aClass274_3502.getLocalized(ObjectDeserializer.languageId, 544))), "", "");
                                    if (class318_sub9_sub1.worldId == 0) ShaderProgramSub2.addChatMessage("", 5, (byte) -105, 0, (class318_sub9_sub1.username + (FriendsIgnoreList.aClass274_3503.getLocalized(ObjectDeserializer.languageId, 544))), "", "");
                                    class318_sub9_sub1.unlink(false);
                                }
                            }
                            DisplayModeManagerContainer332.anInt4999++;
                            if (DisplayModeManagerContainer332.anInt4999 > 500) {
                                DisplayModeManagerContainer332.anInt4999 = 0;
                                int i_32_ = (int) (8.0 * Math.random());
                                if ((0x4 & i_32_) == 4) Component195.anInt5016 += DisplayModeManagerContainer165.anInt3844;
                                if ((i_32_ & 0x1) == 1) Component120.cameraShakeX += Component203.anInt8775;
                                if ((0x2 & i_32_) == 2) Component92.cameraShakeZ += AbstractBuffer.anInt4263;
                            }
                            if (Component120.cameraShakeX < -50) Component203.anInt8775 = 2;
                            if (Component120.cameraShakeX > 50) Component203.anInt8775 = -2;
                            if (Component92.cameraShakeZ < -55) AbstractBuffer.anInt4263 = 2;
                            if (Component195.anInt5016 < -40) DisplayModeManagerContainer165.anInt3844 = 1;
                            if (Component92.cameraShakeZ > 55) AbstractBuffer.anInt4263 = -2;
                            DebugPanic.anInt4753++;
                            if (Component195.anInt5016 > 40) DisplayModeManagerContainer165.anInt3844 = -1;
                            if (DebugPanic.anInt4753 > 500) {
                                DebugPanic.anInt4753 = 0;
                                int i_33_ = (int) (Math.random() * 8.0);
                                if ((i_33_ & 0x2) == 2) Component182.anInt9750 += HashNodeSub14.anInt9645;
                                if ((i_33_ & 0x1) == 1) CacheNodeSub2.anInt10483 += Component140.anInt10443;
                            }
                            if (CacheNodeSub2.anInt10483 < -60) Component140.anInt10443 = 2;
                            if (Component182.anInt9750 < -20) HashNodeSub14.anInt9645 = 1;
                            if (CacheNodeSub2.anInt10483 > 60) Component140.anInt10443 = -2;
                            if (Component182.anInt9750 > 10) HashNodeSub14.anInt9645 = -1;
                            Component53.anInt193++;
                            if (Component53.anInt193 > 50) {
                                IOException_Sub1.anInt88++;
                                ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(Component98.aClass351_5938, DisplayModeManagerContainer64.aClass77_9029, -125));
                                HashNodeSub14.enqueueOutboundPacket(i ^ ~0x2cc0, class348_sub47);
                            }
                            if (Component284.aBoolean6147) {
                                Component55.method2334(0);
                                Component284.aBoolean6147 = false;
                            }
                            try {
                                Component302.method1802(0);
                            } catch (java.io.IOException ioexception) {
                                SocketConnector.forceLogout(93);
                            }
                        }
                    }
                }
            }
        }
    }

    /** Encode {@code string} to Windows-1252 bytes (specials like € → 0x80). */
    static final byte[] encodeCp1252(String string, byte i) {
        try {
            anInt6873++;
            int i_34_ = string.length();
            byte[] is = new byte[i_34_];
            if (i != -20) method2991(-54);
            for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
                int i_36_ = string.charAt(i_35_);
                if (i_36_ > 0 && i_36_ < 128 || i_36_ >= 160 && i_36_ <= 255) is[i_35_] = (byte) i_36_;
                else if (i_36_ != 8364) {
                    if (i_36_ != 8218) {
                        if (i_36_ != 402) {
                            if (i_36_ == 8222) is[i_35_] = (byte) -124;
                            else if (i_36_ == 8230) is[i_35_] = (byte) -123;
                            else if (i_36_ != 8224) {
                                if (i_36_ != 8225) {
                                    if (i_36_ == 710) is[i_35_] = (byte) -120;
                                    else if (i_36_ == 8240) is[i_35_] = (byte) -119;
                                    else if (i_36_ == 352) is[i_35_] = (byte) -118;
                                    else if (i_36_ != 8249) {
                                        if (i_36_ != 338) {
                                            if (i_36_ != 381) {
                                                if (i_36_ == 8216) is[i_35_] = (byte) -111;
                                                else if (i_36_ == 8217) is[i_35_] = (byte) -110;
                                                else if (i_36_ != 8220) {
                                                    if (i_36_ != 8221) {
                                                        if (i_36_ == 8226) is[i_35_] = (byte) -107;
                                                        else if (i_36_ == 8211) is[i_35_] = (byte) -106;
                                                        else if (i_36_ != 8212) {
                                                            if (i_36_ != 732) {
                                                                if (i_36_ != 8482) {
                                                                    if (i_36_ == 353) is[i_35_] = (byte) -102;
                                                                    else if (i_36_ == 8250) is[i_35_] = (byte) -101;
                                                                    else if (i_36_ != 339) {
                                                                        if (i_36_ == 382) is[i_35_] = (byte) -98;
                                                                        else if (i_36_ != 376) is[i_35_] = (byte) 63;
                                                                        else is[i_35_] = (byte) -97;
                                                                    } else is[i_35_] = (byte) -100;
                                                                } else is[i_35_] = (byte) -103;
                                                            } else is[i_35_] = (byte) -104;
                                                        } else is[i_35_] = (byte) -105;
                                                    } else is[i_35_] = (byte) -108;
                                                } else is[i_35_] = (byte) -109;
                                            } else is[i_35_] = (byte) -114;
                                        } else is[i_35_] = (byte) -116;
                                    } else is[i_35_] = (byte) -117;
                                } else is[i_35_] = (byte) -121;
                            } else is[i_35_] = (byte) -122;
                        } else is[i_35_] = (byte) -125;
                    } else is[i_35_] = (byte) -126;
                } else is[i_35_] = (byte) -128;
            }
            return is;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ls.B(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    public static void method2993(byte i) {
        anIntArray6878 = null;
        aString6876 = null;
        aString6877 = null;
        int i_37_ = 31 % ((3 - i) / 37);
    }

    static final void method2994(int i) {
        anInt6871++;
        if (i == 2) HelveticaFont.aClass352Array2636 = null;
    }

    ClientSystemInfo(int i, int i_38_) {
        this.anInt6872 = i;
        this.anInt6875 = i_38_;
    }

    static {
        String string = "Unknown";
        try {
            string = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        aString6877 = string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        aString6876 = string.toLowerCase();
        string = "Unknown";
        try {
            string = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        string.toLowerCase();
        string = "~/";
        try {
            string = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
            /* empty */
        }
        new File(string);
    }
}
