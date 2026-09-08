/* PacketReader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub42_Sub8_Sub2` (JODE-obfuscated).
 * Incoming packet reader node. extends CacheNode; logs 'Packet read: ' + packet id + length (NodeSub3.aClass114_6584.anInt1749).
 */

import java.io.IOException;

final class PacketReader extends CacheNode {
    private final Object anObject10429;
    static int anInt10430;
    static long[][][] aLongArrayArrayArray10431;
    static int canvasHeight;
    static int anInt10433;
    /** Active {@link GameType} for this session (applet modewhere / CLI). */
    static GameType currentGameType = null;
    static int anInt10435;
    static DisplayModeManagerContainer154 aClass76_10436 = new DisplayModeManagerContainer154(true);
    static DisplayModeManagerContainer238 aClass74_10437 = new DisplayModeManagerContainer238(0, 3);
    static int anInt10438;

    static final boolean isPacketAllowed(int i, int i_0_, byte i_1_) {
        anInt10433++;
        int i_2_ = 18 / ((i_1_ - 30) / 42);
        if (!HuffmanDecoder.method2224(i, (byte) -118, i_0_)) return false;
        if (RadixText.method1833((byte) -118, i, i_0_) | (0x9000 & i) != 0 | Component179.method2985(-31735, i_0_, i)) return true;
        return ((0x37 & i_0_) == 0 & ((0x2000 & i) != 0 | FriendsIgnoreList.hasCollisionBlockFlags(i, i_0_, 88) | ReferenceHolder.hasBit16(i_0_, (byte) 127, i)));
    }

    PacketReader(Object object, int i) {
        super(i);
        anObject10429 = object;
    }

    final boolean isSoft(int i) {
        if (i != -4) softDisconnect((byte) -58);
        anInt10438++;
        return false;
    }

    static final boolean readNextPacket(boolean bool) throws IOException {
        anInt10430++;
        if (DefinitionSub8.aClass238_9165 == null) return false;
        if (NodeSub3.aClass114_6584 == null) {
            if (Component83.aBoolean1661) {
                if (!DefinitionSub8.aClass238_9165.availableAtLeast(1, 119)) return false;
                DefinitionSub8.aClass238_9165.readBytes(1, 0, (byte) 6, (Component80.packetBuffer.payload));
                NodeSub50.anInt7213 = 0;
                Component83.aBoolean1661 = false;
                Component354.anInt221++;
            }
            Component80.packetBuffer.offset = 0;
            if (Component80.packetBuffer.method3404(-1510)) {
                if (!DefinitionSub8.aClass238_9165.availableAtLeast(1, 119)) return false;
                DefinitionSub8.aClass238_9165.readBytes(1, 1, (byte) 26, (Component80.packetBuffer.payload));
                Component354.anInt221++;
                NodeSub50.anInt7213 = 0;
            }
            Component83.aBoolean1661 = true;
            Component183[] class114s = DisplayModeManagerContainer288.allPacketTypes(-11271);
            int i = Component80.packetBuffer.method3407(15295);
            if (i < 0 || i >= class114s.length) throw new IOException("invo:" + i + " ip:" + (Component80.packetBuffer.offset));
            NodeSub3.aClass114_6584 = class114s[i];
            if (Loader.debug) {
                System.out.println("Packet read: " + i + " length: " + NodeSub3.aClass114_6584.anInt1749);
            }
            DefinitionSub25.anInt9341 = NodeSub3.aClass114_6584.anInt1749;
        }
        if (DefinitionSub25.anInt9341 == -1) {
            if (!DefinitionSub8.aClass238_9165.availableAtLeast(1, 116)) return false;
            DefinitionSub8.aClass238_9165.readBytes(1, 0, (byte) -118, (Component80.packetBuffer.payload));
            DefinitionSub25.anInt9341 = 0xff & (Component80.packetBuffer.payload[0]);
            Component354.anInt221++;
            NodeSub50.anInt7213 = 0;
        }
        if (DefinitionSub25.anInt9341 == -2) {
            if (!DefinitionSub8.aClass238_9165.availableAtLeast(2, 120)) return false;
            DefinitionSub8.aClass238_9165.readBytes(2, 0, (byte) 127, (Component80.packetBuffer.payload));
            Component80.packetBuffer.offset = 0;
            DefinitionSub25.anInt9341 = Component80.packetBuffer.readUnsignedShort(842397944);
            Component354.anInt221 += 2;
            NodeSub50.anInt7213 = 0;
        }
        if (DefinitionSub25.anInt9341 > 0) {
            if (!DefinitionSub8.aClass238_9165.availableAtLeast(DefinitionSub25.anInt9341, 104)) return false;
            Component80.packetBuffer.offset = 0;
            DefinitionSub8.aClass238_9165.readBytes(DefinitionSub25.anInt9341, 0, (byte) -123, (Component80.packetBuffer.payload));
            Component354.anInt221 += DefinitionSub25.anInt9341;
            NodeSub50.anInt7213 = 0;
        }
        DefinitionSub36.aClass114_9456 = Component339.aClass114_3145;
        Component339.aClass114_3145 = SocketStream.aClass114_3133;
        SocketStream.aClass114_3133 = NodeSub3.aClass114_6584;
        if (IOException_Sub1.aClass114_90 == NodeSub3.aClass114_6584) {
            CookieBuilder.setSettingsCookie(Component80.packetBuffer.readString((byte) 118), true);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == HashNodeSub3.aClass114_9503) {
            int i = Component80.packetBuffer.readUnsignedByte(255);
            boolean bool_3_ = (i & 0x1) == 1;
            String string = Component80.packetBuffer.readString((byte) 108);
            String string_4_ = Component80.packetBuffer.readString((byte) -92);
            if (string_4_.equals("")) string_4_ = string;
            String string_5_ = Component80.packetBuffer.readString((byte) -64);
            String string_6_ = Component80.packetBuffer.readString((byte) -97);
            if (string_6_.equals("")) string_6_ = string_5_;
            if (bool_3_) {
                for (int i_7_ = 0; (i_7_ < MenuEntry.ignoreCount); i_7_++) {
                    if (DisplayModeManagerContainer145.ignoreDisplayNames[i_7_].equals(string_6_)) {
                        ObjectDefinition.ignoreNames[i_7_] = string;
                        DisplayModeManagerContainer145.ignoreDisplayNames[i_7_] = string_4_;
                        DefinitionSub21.ignoreLastNames[i_7_] = string_5_;
                        ShaderSub2.ignoreLastDisplayNames[i_7_] = string_6_;
                        break;
                    }
                }
            } else {
                ObjectDefinition.ignoreNames[MenuEntry.ignoreCount] = string;
                DisplayModeManagerContainer145.ignoreDisplayNames[MenuEntry.ignoreCount] = string_4_;
                DefinitionSub21.ignoreLastNames[(MenuEntry.ignoreCount)] = string_5_;
                ShaderSub2.ignoreLastDisplayNames[MenuEntry.ignoreCount] = string_6_;
                AbstractShaderSub3.ignoreTemporary[MenuEntry.ignoreCount] = GpsOverlay.bitwiseAnd(i, 2) == 2;
                MenuEntry.ignoreCount++;
            }
            Component380.anInt4985 = ResourceLoader.anInt3918;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == RenderableSub6.aClass114_6424) {
            InputStream_Sub2.method128(Request.aClass74_6891, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (LruCache.aClass114_4388 == NodeSub3.aClass114_6584) {
            byte i = Component80.packetBuffer.readByte(-100);
            int i_8_ = Component80.packetBuffer.readShortAddLittle(-111);
            Component141.markDirty((byte) -126);
            DisplayModeManagerContainer368.method467(i_8_, -18075, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (DisplayModeManagerContainer136.aClass114_4707 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readIntLittle((byte) -123);
            int i_9_ = Component80.packetBuffer.readInt((byte) -126);
            Component141.markDirty((byte) -124);
            NodeSub41 class348_sub41 = ((NodeSub41) Component15.aClass356_4915.get(i_9_, -6008));
            NodeSub41 class348_sub41_10_ = ((NodeSub41) Component15.aClass356_4915.get(i, -6008));
            if (class348_sub41_10_ != null) Component162.method1118((class348_sub41 == null || (class348_sub41_10_.anInt7050 != class348_sub41.anInt7050)), false, class348_sub41_10_, 2533);
            if (class348_sub41 != null) {
                class348_sub41.unlink((byte) 32);
                Component15.aClass356_4915.put((byte) 102, i, class348_sub41);
            }
            DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_9_);
            if (class46 != null) Component111.markInterfaceDirty(-9343, class46);
            class46 = BitmapFont.getComponent(1512932720, i);
            if (class46 != null) {
                Component111.markInterfaceDirty(-9343, class46);
                Component111.layoutInterfaceTree(true, -123, class46);
            }
            if (r.anInt9721 != -1) Component205.method1775((byte) -8, r.anInt9721, 1);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (bool != true) currentGameType = null;
        if (NodeSub3.aClass114_6584 == Component262.aClass114_1762) {
            Component323.aString5882 = (DefinitionSub25.anInt9341 > 2 ? Component80.packetBuffer.readString((byte) -119) : FriendsIgnoreList.aClass274_3509.getLocalized(ObjectDeserializer.languageId, 544));
            Component79.anInt4144 = (DefinitionSub25.anInt9341 <= 0 ? -1 : Component80.packetBuffer.readUnsignedShort(842397944));
            if (Component79.anInt4144 == 65535) Component79.anInt4144 = -1;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component339.aClass114_3135 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readByteAdd((byte) 62);
            int i_11_ = Component80.packetBuffer.readIntLittle((byte) -126);
            Component141.markDirty((byte) -124);
            ColorTagNode.method2813(true, i, i_11_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component120.aClass114_316) {
            int i = Component80.packetBuffer.readIntInverseMiddle(255);
            int i_12_ = Component80.packetBuffer.readShortLittle(false);
            int i_13_ = Component80.packetBuffer.readShortAdd(10);
            int i_14_ = Component80.packetBuffer.readShortLittle(false);
            Component141.markDirty((byte) -127);
            SocketStream.method1703(7, i, i_13_ << 16 | i_14_, 4, i_12_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (DefinitionSub15.aClass114_9216 == NodeSub3.aClass114_6584) {
            Component59.anInt1872 = Component80.packetBuffer.readShort(13638);
            NodeSub3.aClass114_6584 = null;
            DefinitionSub23.anInt9313 = ResourceLoader.anInt3918;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component301.aClass114_4126) {
            InputStream_Sub2.method128(GpiLogger.aClass74_8853, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component75.aClass114_2285) {
            int i = Component80.packetBuffer.readIntMiddleEndian((byte) 82);
            Component141.markDirty((byte) -124);
            SocketStream.method1703(3, i, -1, 4, -1);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component231.aClass114_330) {
            boolean bool_15_ = Component80.packetBuffer.readUnsignedByte(255) == 1;
            String string = Component80.packetBuffer.readString((byte) -34);
            String string_16_ = string;
            if (bool_15_) string_16_ = Component80.packetBuffer.readString((byte) -64);
            long l = Component80.packetBuffer.readLong(-456577760);
            long l_17_ = Component80.packetBuffer.readUnsignedShort(842397944);
            long l_18_ = Component80.packetBuffer.readMedium(-1);
            int i = Component80.packetBuffer.readUnsignedByte(255);
            long l_19_ = l_18_ + (l_17_ << 32);
            boolean bool_20_ = false;
            while_217_:
            do {
                for (int i_21_ = 0; i_21_ < 100; i_21_++) {
                    if (l_19_ == Component186.aLongArray4410[i_21_]) {
                        bool_20_ = true;
                        break while_217_;
                    }
                }
                if (i <= 1) {
                    if ((ParametricDefinition.aBoolean9103 && !HeapDumper.aBoolean1915) || Component308.aBoolean5233) bool_20_ = true;
                    else if (StringCache.isOnIgnoreList(string_16_, 28280)) bool_20_ = true;
                }
            } while (false);
            if (!bool_20_ && AudioMixer.anInt3227 == 0) {
                Component186.aLongArray4410[NpcComposition.anInt1359] = l_19_;
                NpcComposition.anInt1359 = (1 + NpcComposition.anInt1359) % 100;
                String string_22_ = (Component317.escapeAngleBrackets((DefinitionSub32.method3136((byte) 64, Component80.packetBuffer)), 23034));
                if (i == 2 || i == 3) DisplayModeManagerContainer174.method2477("<img=1>" + string_16_, string_22_, (byte) -126, -1, "<img=1>" + string, Component25.method1788((byte) -76, l), 9, 0, string);
                else if (i != 1) DisplayModeManagerContainer174.method2477(string_16_, string_22_, (byte) -125, -1, string, Component25.method1788((byte) -83, l), 9, 0, string);
                else DisplayModeManagerContainer174.method2477("<img=0>" + string_16_, string_22_, (byte) -126, -1, "<img=0>" + string, Component25.method1788((byte) -75, l), 9, 0, string);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DisplayModeManagerContainer61.aClass114_3751) {
            int i = Component80.packetBuffer.readShortLittle(!bool);
            Component141.markDirty((byte) -126);
            Component184.method1189(-1, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == InputStream_Sub2.aClass114_82) {
            InputStream_Sub2.method128(DisplayModeManagerContainer271.aClass74_515, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DisplayModeManagerContainer306.aClass114_4779) {
            int i = Component80.packetBuffer.readByteAdd((byte) -78);
            int i_23_ = Component80.packetBuffer.readByteInverse((byte) 21);
            int i_24_ = Component80.packetBuffer.readShortAdd(127);
            int i_25_ = Component80.packetBuffer.readUnsignedByteSubtract((byte) -128);
            int i_26_ = Component80.packetBuffer.readByteInverse((byte) 21);
            Component141.markDirty((byte) -127);
            Component113.aBooleanArray2374[i_23_] = true;
            Component300.anIntArray3552[i_23_] = i;
            ItemDefinitionProvider.anIntArray3273[i_23_] = i_25_;
            Component103.anIntArray4196[i_23_] = i_26_;
            Component212.anIntArray9981[i_23_] = i_24_;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == ColoredText.aClass114_6089) {
            DisplayModeManagerContainer306.anInt4786 = (Component80.packetBuffer.readByteInverse(-622951480) << 3);
            GradientPreset.anInt9200 = Component80.packetBuffer.readByteAdd((byte) -84);
            DisplayModeManagerContainer347.anInt3581 = (Component80.packetBuffer.readByte128(-8679) << 3);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component248.aClass114_304) {
            Component330.method853((byte) 99);
            NodeSub3.aClass114_6584 = null;
            return false;
        }
        if (Component35.aClass114_4269 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readByteAdd((byte) 71);
            Component141.markDirty((byte) -128);
            NameFormatter.anInt495 = i;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component14.aClass114_8590 == NodeSub3.aClass114_6584) {
            InputStream_Sub2.method128(DisplayModeManagerContainer152.aClass74_4537, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component278.aClass114_3240) {
            int i = Component80.packetBuffer.readShortAddLittle(-117);
            int i_27_ = Component80.packetBuffer.readShortAdd(125);
            Component141.markDirty((byte) -128);
            DisplayModeManagerContainer28.method2396(i, i_27_, 0, 3);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (ImageCacheStore.aClass114_4027 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readShortLittle(false);
            if (i == 65535) i = -1;
            int i_28_ = Component80.packetBuffer.readIntInverseMiddle(255);
            int i_29_ = Component80.packetBuffer.readInt((byte) -126);
            Component141.markDirty((byte) -128);
            DisplayModeManagerContainer88.method727((byte) -63, i_29_, i, i_28_);
            ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(-126, i);
            DisplayModeManagerContainer145.method1085(class213.anInt2825, class213.anInt2787, (byte) -59, class213.anInt2781, i_28_);
            Component225.method350(class213.anInt2779, class213.anInt2826, 125, i_28_, class213.anInt2810);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (HeapDumper.aClass114_1917 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_30_ = Component80.packetBuffer.readUnsignedByte(255);
            boolean bool_31_ = (0x1 & i_30_) == 1;
            Component38.method1405(i, bool_31_, true);
            int i_32_ = Component80.packetBuffer.readUnsignedShort(842397944);
            for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
                int i_34_ = Component80.packetBuffer.readByteAdd((byte) -127);
                if (i_34_ == 255) {
                    int index = Component80.packetBuffer.offset;
                    byte[] data = Component80.packetBuffer.payload;
                    i_34_ = Component80.packetBuffer.readIntMiddleEndian((byte) 82);
                }
                int i_35_ = Component80.packetBuffer.readShortAdd(-78);
                Canvas_Sub1.setContainerSlot(i, -364570972, bool_31_, i_33_, i_34_, i_35_ - 1);
            }
            HelveticaFont.anIntArray2633[GpsOverlay.bitwiseAnd(31, KeyStoreLoader.anInt1631++)] = i;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == HuffmanDecoder.aClass114_3773) {
            LoggedOutDefinition.disconnectAndReset(false, (byte) 11);
            NodeSub3.aClass114_6584 = null;
            return false;
        }
        if (NodeSub3.aClass114_6584 == Component10.aClass114_3809) {
            int i = Component80.packetBuffer.readIntInverseMiddle(255);
            int i_36_ = Component80.packetBuffer.readShortAdd(124);
            DisplayModeManagerContainer58.aClass170_10209.method1313((byte) 42, i, i_36_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component20.aClass114_6056) {
            int i = Component80.packetBuffer.readUnsignedByteSubtract((byte) 75);
            int i_37_ = Component80.packetBuffer.readShortAdd(124);
            int i_38_ = Component80.packetBuffer.readShortAdd(125);
            int i_39_ = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_40_ = Component80.packetBuffer.readIntMiddleEndian((byte) 82);
            boolean bool_41_ = (0x80 & i) != 0;
            int i_42_ = 0x7 & i;
            int i_43_ = (i & 0x7e) >> 3;
            if (i_43_ == 15) i_43_ = -1;
            if (i_40_ >> 30 == 0) {
                if (i_40_ >> 29 != 0) {
                    int i_44_ = i_40_ & 0xffff;
                    NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_44_, -6008));
                    if (class348_sub22 != null) {
                        Npc npc = (class348_sub22.npc);
                        if (i_38_ == 65535) i_38_ = -1;
                        boolean bool_45_ = true;
                        int i_46_ = (!bool_41_ ? npc.anInt10269 : npc.anInt10291);
                        if (i_38_ != -1 && i_46_ != -1) {
                            if (i_46_ == i_38_) {
                                Component63 class368 = NsnDefinition.aClass319_9245.method2543((byte) 55, i_38_);
                                if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                    DisplayModeManagerContainer167 class17 = (RunescapeInfo.aClass87_191.getSequence(class368.anInt4503, 7));
                                    int i_47_ = class17.anInt248;
                                    if (i_47_ != 0 && i_47_ != 2) {
                                        if (i_47_ == 1) bool_45_ = true;
                                    } else bool_45_ = false;
                                }
                            } else {
                                Component63 class368 = NsnDefinition.aClass319_9245.method2543((byte) 105, i_38_);
                                Component63 class368_48_ = NsnDefinition.aClass319_9245.method2543((byte) 56, i_46_);
                                if (class368.anInt4503 != -1 && (class368_48_.anInt4503 != -1)) {
                                    DisplayModeManagerContainer167 class17 = (RunescapeInfo.aClass87_191.getSequence(class368.anInt4503, 7));
                                    DisplayModeManagerContainer167 class17_49_ = (RunescapeInfo.aClass87_191.getSequence((class368_48_.anInt4503), 7));
                                    if (class17.anInt239 < class17_49_.anInt239) bool_45_ = false;
                                }
                            }
                        }
                        if (bool_45_) {
                            if (bool_41_) {
                                npc.anInt10211 = i_39_ + OpenGlShader.clientCycle;
                                npc.anInt10260 = i_37_;
                                npc.anInt10291 = i_38_;
                                npc.anInt10289 = i_43_;
                                npc.anInt10202 = i_42_;
                                npc.anInt10273 = 0;
                                npc.anInt10276 = 1;
                                npc.anInt10224 = 0;
                                if (npc.anInt10211 > OpenGlShader.clientCycle) npc.anInt10224 = -1;
                                if (npc.anInt10291 != -1 && (OpenGlShader.clientCycle == (npc.anInt10211))) {
                                    int i_51_ = (NsnDefinition.aClass319_9245.method2543((byte) 103, (npc.anInt10291)).anInt4503);
                                    if (i_51_ != -1) {
                                        DisplayModeManagerContainer167 class17 = RunescapeInfo.aClass87_191.getSequence(i_51_, 7);
                                        if (class17 != null && (class17.anIntArray237) != null && !(npc.aBoolean10309)) DisplayModeManagerContainer260.method2178(npc, 0, class17, -17);
                                    }
                                }
                            } else {
                                npc.anInt10243 = 0;
                                npc.anInt10220 = i_37_;
                                npc.anInt10269 = i_38_;
                                npc.anInt10240 = 0;
                                npc.anInt10278 = i_43_;
                                npc.anInt10225 = OpenGlShader.clientCycle + i_39_;
                                npc.anInt10237 = i_42_;
                                npc.anInt10283 = 1;
                                if (npc.anInt10225 > OpenGlShader.clientCycle) npc.anInt10240 = -1;
                                if (npc.anInt10269 != -1 && (OpenGlShader.clientCycle == (npc.anInt10225))) {
                                    int i_50_ = (NsnDefinition.aClass319_9245.method2543((byte) 87, (npc.anInt10269)).anInt4503);
                                    if (i_50_ != -1) {
                                        DisplayModeManagerContainer167 class17 = RunescapeInfo.aClass87_191.getSequence(i_50_, 7);
                                        if (class17 != null && (class17.anIntArray237) != null && !(npc.aBoolean10309)) DisplayModeManagerContainer260.method2178(npc, 0, class17, -44);
                                    }
                                }
                            }
                        }
                    }
                } else if (i_40_ >> 28 != 0) {
                    int i_52_ = i_40_ & 0xffff;
                    Player player;
                    if (StringDefinition.anInt9591 != i_52_) player = (InterfaceRenderer.players[i_52_]);
                    else player = Component72.localPlayer;
                    if (player != null) {
                        if (i_38_ == 65535) i_38_ = -1;
                        boolean bool_53_ = true;
                        int i_54_ = (!bool_41_ ? player.anInt10269 : player.anInt10291);
                        if (i_38_ != -1 && i_54_ != -1) {
                            if (i_38_ == i_54_) {
                                Component63 class368 = NsnDefinition.aClass319_9245.method2543((byte) 111, i_38_);
                                if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                    DisplayModeManagerContainer167 class17 = (RunescapeInfo.aClass87_191.getSequence(class368.anInt4503, 7));
                                    int i_57_ = class17.anInt248;
                                    if (i_57_ != 0 && i_57_ != 2) {
                                        if (i_57_ == 1) bool_53_ = true;
                                    } else bool_53_ = false;
                                }
                            } else {
                                Component63 class368 = NsnDefinition.aClass319_9245.method2543((byte) 105, i_38_);
                                Component63 class368_55_ = NsnDefinition.aClass319_9245.method2543((byte) 118, i_54_);
                                if (class368.anInt4503 != -1 && class368_55_.anInt4503 != -1) {
                                    DisplayModeManagerContainer167 class17 = (RunescapeInfo.aClass87_191.getSequence(class368.anInt4503, 7));
                                    DisplayModeManagerContainer167 class17_56_ = (RunescapeInfo.aClass87_191.getSequence((class368_55_.anInt4503), 7));
                                    if (class17.anInt239 < class17_56_.anInt239) bool_53_ = false;
                                }
                            }
                        }
                        if (bool_53_) {
                            if (bool_41_) {
                                player.anInt10224 = 0;
                                player.anInt10260 = i_37_;
                                player.anInt10289 = i_43_;
                                player.anInt10273 = 0;
                                player.anInt10276 = 1;
                                player.anInt10291 = i_38_;
                                player.anInt10211 = i_39_ + OpenGlShader.clientCycle;
                                player.anInt10202 = i_42_;
                                if (player.anInt10211 > OpenGlShader.clientCycle) player.anInt10224 = -1;
                                if (player.anInt10291 == 65535) player.anInt10291 = -1;
                                if ((player.anInt10291 != -1) && ((player.anInt10211) == OpenGlShader.clientCycle)) {
                                    int i_58_ = (NsnDefinition.aClass319_9245.method2543((byte) 45, (player.anInt10291)).anInt4503);
                                    if (i_58_ != -1) {
                                        DisplayModeManagerContainer167 class17 = RunescapeInfo.aClass87_191.getSequence(i_58_, 7);
                                        if (class17 != null && (class17.anIntArray237) != null && !(player.aBoolean10309)) DisplayModeManagerContainer260.method2178(player, 0, class17, -120);
                                    }
                                }
                            } else {
                                player.anInt10269 = i_38_;
                                player.anInt10243 = 0;
                                player.anInt10220 = i_37_;
                                player.anInt10240 = 0;
                                player.anInt10278 = i_43_;
                                player.anInt10237 = i_42_;
                                player.anInt10283 = 1;
                                player.anInt10225 = i_39_ + OpenGlShader.clientCycle;
                                if (player.anInt10269 == 65535) player.anInt10269 = -1;
                                if (OpenGlShader.clientCycle < (player.anInt10225)) player.anInt10240 = -1;
                                if ((player.anInt10269 != -1) && (OpenGlShader.clientCycle == (player.anInt10225))) {
                                    int i_59_ = (NsnDefinition.aClass319_9245.method2543((byte) 81, (player.anInt10269)).anInt4503);
                                    if (i_59_ != -1) {
                                        DisplayModeManagerContainer167 class17 = RunescapeInfo.aClass87_191.getSequence(i_59_, 7);
                                        if (class17 != null && (class17.anIntArray237) != null && !(player.aBoolean10309)) DisplayModeManagerContainer260.method2178(player, 0, class17, -101);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int i_60_ = (i_40_ & 0x33705717) >> 28;
                int i_61_ = -NodeBaseSub2.regionTileX + ((0xffff4fe & i_40_) >> 14);
                int i_62_ = -Component330.regionTileY + (0x3fff & i_40_);
                if (i_61_ >= 0 && i_62_ >= 0 && AbstractShaderSub4.anInt7319 > i_61_ && ParametricDefinition.anInt9109 > i_62_) {
                    int i_63_ = 256 + 512 * i_61_;
                    int i_64_ = 512 * i_62_ + 256;
                    int i_65_ = i_60_;
                    if (i_65_ < 3 && NpcComposition.method802(i_62_, i_61_, true)) i_65_++;
                    DisplayModeManagerContainer104 class318_sub1_sub3_sub4 = (new DisplayModeManagerContainer104(i_38_, i_39_, OpenGlShader.clientCycle, i_60_, i_65_, i_63_, -i_37_ + Component300.method2064(i_63_, i_60_, 11219, i_64_), i_64_, i_61_, i_61_, i_62_, i_62_, i_42_));
                    CacheNodeSub2.aClass262_10492.addTail(new PauseHandler(class318_sub1_sub3_sub4), -20180);
                }
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component227.aClass114_1120) {
            int i = Component80.packetBuffer.readShortAddLittle(-116);
            String string = Component80.packetBuffer.readString((byte) -85);
            Component141.markDirty((byte) -125);
            GlExtensionManager.method3965(string, i, 2);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DisplayModeManagerContainer238.aClass114_1234) {
            DisplayModeManagerContainer310.anInt359 = Component80.packetBuffer.readSignedMedium((byte) 125);
            ParametricDefinition.aBoolean9103 = Component80.packetBuffer.readUnsignedByte(255) == 1;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component48.aClass114_4331 == NodeSub3.aClass114_6584) {
            String string = Component80.packetBuffer.readString((byte) 122);
            boolean bool_66_ = Component80.packetBuffer.readUnsignedByte(255) == 1;
            String string_67_;
            if (!bool_66_) string_67_ = string;
            else string_67_ = Component80.packetBuffer.readString((byte) 125);
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            byte i_68_ = Component80.packetBuffer.readByte(-128);
            boolean bool_69_ = false;
            if (i_68_ == -128) bool_69_ = true;
            if (bool_69_) {
                if (NameFormatter.anInt496 == 0) {
                    NodeSub3.aClass114_6584 = null;
                    return true;
                }
                boolean bool_70_ = false;
                int i_71_;
                for (i_71_ = 0; NameFormatter.anInt496 > i_71_; i_71_++) {
                    if (RequestProcessor.aClass19Array2261[i_71_].aString306.equals(string_67_) && i == (RequestProcessor.aClass19Array2261[i_71_].anInt308)) break;
                }
                if (NameFormatter.anInt496 > i_71_) {
                    for (/**/; -1 + NameFormatter.anInt496 > i_71_; i_71_++)
                        RequestProcessor.aClass19Array2261[i_71_] = RequestProcessor.aClass19Array2261[i_71_ - -1];
                    NameFormatter.anInt496--;
                    RequestProcessor.aClass19Array2261[NameFormatter.anInt496] = null;
                }
            } else {
                String string_72_ = Component80.packetBuffer.readString((byte) -74);
                Component248 class19 = new Component248();
                class19.aString306 = string_67_;
                class19.aString314 = string;
                class19.aString312 = DebugPanicSub1.method2127(2, class19.aString306);
                class19.aString313 = string_72_;
                class19.anInt308 = i;
                class19.aByte310 = i_68_;
                int i_73_;
                for (i_73_ = -1 + NameFormatter.anInt496; i_73_ >= 0; i_73_--) {
                    int i_74_ = RequestProcessor.aClass19Array2261[i_73_].aString312.compareTo(class19.aString312);
                    if (i_74_ == 0) {
                        RequestProcessor.aClass19Array2261[i_73_].anInt308 = i;
                        RequestProcessor.aClass19Array2261[i_73_].aByte310 = i_68_;
                        RequestProcessor.aClass19Array2261[i_73_].aString313 = string_72_;
                        if (string_67_.equals(Component72.localPlayer.username)) DisplayModeManagerContainer96.aByte4702 = i_68_;
                        GameType.anInt2986 = ResourceLoader.anInt3918;
                        NodeSub3.aClass114_6584 = null;
                        return true;
                    }
                    if (i_74_ < 0) break;
                }
                if (RequestProcessor.aClass19Array2261.length <= NameFormatter.anInt496) {
                    NodeSub3.aClass114_6584 = null;
                    return true;
                }
                for (int i_75_ = NameFormatter.anInt496 - 1; i_75_ > i_73_; i_75_--)
                    RequestProcessor.aClass19Array2261[1 + i_75_] = RequestProcessor.aClass19Array2261[i_75_];
                if (NameFormatter.anInt496 == 0) RequestProcessor.aClass19Array2261 = new Component248[100];
                RequestProcessor.aClass19Array2261[i_73_ - -1] = class19;
                NameFormatter.anInt496++;
                if (string_67_.equals(Component72.localPlayer.username)) DisplayModeManagerContainer96.aByte4702 = i_68_;
            }
            GameType.anInt2986 = ResourceLoader.anInt3918;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (LibraryCreditsText.aClass114_5949 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readUnsignedByte(255);
            int i_76_ = i >> 5;
            int i_77_ = 0x1f & i;
            if (i_77_ == 0) {
                NodeSub27.aClass302Array6897[i_76_] = null;
                NodeSub3.aClass114_6584 = null;
                return true;
            }
            Component114 class302 = new Component114();
            class302.anInt3840 = i_77_;
            class302.anInt3831 = Component80.packetBuffer.readUnsignedByte(255);
            if (class302.anInt3831 >= 0 && (class302.anInt3831 < Component379.aClass105Array5933.length)) {
                if (class302.anInt3840 == 1 || class302.anInt3840 == 10) {
                    class302.anInt3833 = Component80.packetBuffer.readUnsignedShort(842397944);
                    Component80.packetBuffer.offset += 6;
                } else if (class302.anInt3840 >= 2 && class302.anInt3840 <= 6) {
                    if (class302.anInt3840 == 2) {
                        class302.anInt3832 = 256;
                        class302.anInt3835 = 256;
                    }
                    if (class302.anInt3840 == 3) {
                        class302.anInt3835 = 0;
                        class302.anInt3832 = 256;
                    }
                    if (class302.anInt3840 == 4) {
                        class302.anInt3835 = 512;
                        class302.anInt3832 = 256;
                    }
                    if (class302.anInt3840 == 5) {
                        class302.anInt3835 = 256;
                        class302.anInt3832 = 0;
                    }
                    if (class302.anInt3840 == 6) {
                        class302.anInt3835 = 256;
                        class302.anInt3832 = 512;
                    }
                    class302.anInt3840 = 2;
                    class302.anInt3838 = Component80.packetBuffer.readUnsignedByte(255);
                    class302.anInt3835 += (Component80.packetBuffer.readUnsignedShort(842397944) + -NodeBaseSub2.regionTileX << 9);
                    class302.anInt3832 += (Component80.packetBuffer.readUnsignedShort(842397944) - Component330.regionTileY << 9);
                    class302.anInt3839 = Component80.packetBuffer.readUnsignedByte(255) << 2;
                    class302.anInt3837 = Component80.packetBuffer.readUnsignedShort(842397944);
                }
                class302.anInt3834 = Component80.packetBuffer.readUnsignedShort(842397944);
                if (class302.anInt3834 == 65535) class302.anInt3834 = -1;
                NodeSub27.aClass302Array6897[i_76_] = class302;
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component16.aClass114_2279 == NodeSub3.aClass114_6584) {
            LoggedOutDefinition.disconnectAndReset(DisplayModeManagerContainer369.aBoolean2895, (byte) 11);
            NodeSub3.aClass114_6584 = null;
            return false;
        }

        if (AbstractShaderSub4.aClass114_7323 == NodeSub3.aClass114_6584) {
            GpiLogger.method2822(-101, Component80.packetBuffer, DefinitionSub25.anInt9341);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == RadixText.aClass114_6121) {
            int i = Component80.packetBuffer.readShortAdd(124);
            int i_78_ = Component80.packetBuffer.readIntLittle((byte) -118);
            Component141.markDirty((byte) -128);
            GnpPositionLogger.method855(6, i, i_78_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component235.aClass114_3371 == NodeSub3.aClass114_6584) {
            InputStream_Sub2.method128(DisplayModeManagerContainer34.aClass74_8662, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == AbstractShaderSub4.aClass114_7324) {
            int i = Component80.packetBuffer.readInt((byte) -126);
            int i_79_ = Component80.packetBuffer.readShortAddLittle(-120);
            int i_80_ = Component80.packetBuffer.readShortAdd(125);
            Component141.markDirty((byte) -125);
            DisplayModeManagerContainer159.method1540(-101, i, i_79_ + (i_80_ << 16));
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == CollisionMap.aClass114_4433) {
            DisplayModeManagerContainer58.aClass170_10209.method1314((byte) 80);
            DisplayModeManagerContainer260.anInt3695 += 32;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DisplayModeManagerContainer165.aClass114_3842) {
            int i = Component80.packetBuffer.readIntInverseMiddle(255);
            Component141.markDirty((byte) -128);
            SocketStream.method1703(5, i, StringDefinition.anInt9591, 4, 0);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (KeyFocusHandler.aClass114_6528 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readShortAdd(-124);
            Component141.markDirty((byte) -124);
            DisplayModeManagerContainer282.getColorTag((byte) -107, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component2.aClass114_8365 == NodeSub3.aClass114_6584) {
            boolean bool_81_ = (Component80.packetBuffer.readUnsignedByte(255) == 1);
            String string = Component80.packetBuffer.readString((byte) -29);
            String string_82_ = string;
            if (bool_81_) string_82_ = Component80.packetBuffer.readString((byte) -98);
            int i = Component80.packetBuffer.readUnsignedByte(255);
            boolean bool_83_ = false;
            if (i <= 1) {
                if (ParametricDefinition.aBoolean9103 && !HeapDumper.aBoolean1915 || Component308.aBoolean5233) bool_83_ = true;
                else if (i <= 1 && StringCache.isOnIgnoreList(string_82_, 28280)) bool_83_ = true;
            }
            if (!bool_83_ && AudioMixer.anInt3227 == 0) {
                String string_84_ = (Component317.escapeAngleBrackets((DefinitionSub32.method3136((byte) 64, Component80.packetBuffer)), 23034));
                if (i == 2) DisplayModeManagerContainer174.method2477("<img=1>" + string_82_, string_84_, (byte) -119, -1, "<img=1>" + string, null, 24, 0, string);
                else if (i == 1) DisplayModeManagerContainer174.method2477("<img=0>" + string_82_, string_84_, (byte) -119, -1, "<img=0>" + string, null, 24, 0, string);
                else DisplayModeManagerContainer174.method2477(string_82_, string_84_, (byte) -115, -1, string, null, 24, 0, string);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component279.aClass114_229 == NodeSub3.aClass114_6584) {
            InputStream_Sub2.method128(ArbShaderProgram.aClass74_6201, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == MatrixSub2.aClass114_5742) {
            int i = Component80.packetBuffer.readUnsignedByteSubtract((byte) 31);
            int i_85_ = Component80.packetBuffer.readUnsignedByteSubtract((byte) -104);
            int i_86_ = Component80.packetBuffer.readByteInverse((byte) 21);
            int i_87_ = Component80.packetBuffer.readByteInverse((byte) 21);
            int i_88_ = (Component80.packetBuffer.readShortAdd(126) << 2);
            Component141.markDirty((byte) -127);
            Component188.method1844(i_85_, i_86_, true, i_88_, !bool, i_87_, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component331.aClass114_1722) {
            String string = Component80.packetBuffer.readString((byte) -100);
            Object[] objects = new Object[1 + string.length()];
            for (int i = -1 + string.length(); i >= 0; i--) {
                if (string.charAt(i) != 's') objects[i + 1] = new Integer(Component80.packetBuffer.readInt((byte) -126));
                else objects[1 + i] = Component80.packetBuffer.readString((byte) 122);
            }
            objects[0] = new Integer(Component80.packetBuffer.readInt((byte) -126));
            Component141.markDirty((byte) -127);
            NodeSub36 class348_sub36 = new NodeSub36();
            class348_sub36.anObjectArray6987 = objects;
            ClientScriptExecutor.runHook(class348_sub36);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (CustomCursorSetting.aClass114_6075 == NodeSub3.aClass114_6584) {
            Component141.markDirty((byte) -127);
            Component284.method1851((byte) 125);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == NodeSub41.aClass114_7052) {
            int i = Component80.packetBuffer.readIntLittle((byte) -118);
            int i_89_ = Component80.packetBuffer.readShortAdd(127);
            if (i_89_ == 65535) i_89_ = -1;
            Component141.markDirty((byte) -126);
            SocketStream.method1703(2, i, i_89_, 4, -1);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component235.aClass114_3368) {
            int i = Component80.packetBuffer.readInt((byte) -126);
            Component141.markDirty((byte) -124);
            NodeSub41 class348_sub41 = ((NodeSub41) Component15.aClass356_4915.get(i, -6008));
            if (class348_sub41 != null) Component162.method1118(true, false, class348_sub41, 2533);
            if (Component297.aClass46_4730 != null) {
                Component111.markInterfaceDirty(-9343, Component297.aClass46_4730);
                Component297.aClass46_4730 = null;
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (InputStream_Sub1.aClass114_79 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readShortAdd(-86);
            int i_90_ = Component80.packetBuffer.readIntInverseMiddle(255);
            Component141.markDirty((byte) -124);
            OggStream.method2966(i_90_, i, false);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component37.aClass114_3925 == NodeSub3.aClass114_6584) {
            InputStream_Sub2.method128(aClass74_10437, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == NativeLibraryLoader.aClass114_2972) {
            int i = Component80.packetBuffer.readInt((byte) -126);
            PauseHandler.aClass144_9536 = OggUrlStream.aClass297_8992.reverseDns(80, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component286.aClass114_1901) {
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            Player player;
            if (i != StringDefinition.anInt9591) player = InterfaceRenderer.players[i];
            else player = Component72.localPlayer;
            if (player == null) {
                NodeSub3.aClass114_6584 = null;
                return true;
            }
            int i_91_ = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_92_ = Component80.packetBuffer.readUnsignedByte(255);
            boolean bool_93_ = (0x8000 & i_91_) != 0;
            if ((player.username) != null && player.appearance != null) {
                boolean bool_94_ = false;
                if (i_92_ <= 1) {
                    if (!bool_93_ && ((ParametricDefinition.aBoolean9103 && !HeapDumper.aBoolean1915) || Component308.aBoolean5233)) bool_94_ = true;
                    else if (StringCache.isOnIgnoreList(player.username, 28280)) bool_94_ = true;
                }
                if (!bool_94_ && AudioMixer.anInt3227 == 0) {
                    int i_95_ = -1;
                    String string;
                    if (bool_93_) {
                        i_91_ &= 0x7fff;
                        CookieBuilder class43 = RSACipher.method490((byte) -104, (Component80.packetBuffer));
                        i_95_ = class43.anInt615;
                        string = (class43.aClass348_Sub42_Sub10_614.method3216(Component80.packetBuffer, (byte) 119));
                    } else string = (Component317.escapeAngleBrackets((DefinitionSub32.method3136((byte) 64, Component80.packetBuffer)), 23034));
                    player.aString10292 = string.trim();
                    player.anInt10201 = i_91_ >> 8;
                    player.anInt10234 = i_91_ & 0xff;
                    player.anInt10264 = 150;
                    int i_96_;
                    if (i_92_ != 1 && i_92_ != 2) i_96_ = !bool_93_ ? 2 : 17;
                    else i_96_ = bool_93_ ? 17 : 1;
                    if (i_92_ != 2) {
                        if (i_92_ != 1) DisplayModeManagerContainer174.method2477(player.getName(false, -121), string, (byte) -126, i_95_, player.method2456(true, 255), null, i_96_, 0, player.displayName);
                        else DisplayModeManagerContainer174.method2477("<img=0>" + player.getName(false, -93), string, (byte) -111, i_95_, "<img=0>" + player.method2456(true, 255), null, i_96_, 0, player.displayName);
                    } else DisplayModeManagerContainer174.method2477("<img=1>" + player.getName(false, -95), string, (byte) -120, i_95_, "<img=1>" + player.method2456(true, 255), null, i_96_, 0, player.displayName);
                }
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component227.aClass114_1123 == NodeSub3.aClass114_6584) {
            boolean bool_97_ = (Component80.packetBuffer.readUnsignedByte(255) == 1);
            String string = Component80.packetBuffer.readString((byte) 126);
            String string_98_ = string;
            if (bool_97_) string_98_ = Component80.packetBuffer.readString((byte) 86);
            long l = Component80.packetBuffer.readUnsignedShort(842397944);
            long l_99_ = Component80.packetBuffer.readMedium(-1);
            int i = Component80.packetBuffer.readUnsignedByte(255);
            long l_100_ = (l << 32) - -l_99_;
            boolean bool_101_ = false;
            while_218_:
            do {
                for (int i_102_ = 0; i_102_ < 100; i_102_++) {
                    if (l_100_ == Component186.aLongArray4410[i_102_]) {
                        bool_101_ = true;
                        break while_218_;
                    }
                }
                if (i <= 1) {
                    if ((ParametricDefinition.aBoolean9103 && !HeapDumper.aBoolean1915) || Component308.aBoolean5233) bool_101_ = true;
                    else if (StringCache.isOnIgnoreList(string_98_, 28280)) bool_101_ = true;
                }
            } while (false);
            if (!bool_101_ && AudioMixer.anInt3227 == 0) {
                Component186.aLongArray4410[NpcComposition.anInt1359] = l_100_;
                NpcComposition.anInt1359 = (1 + NpcComposition.anInt1359) % 100;
                String string_103_ = (Component317.escapeAngleBrackets((DefinitionSub32.method3136((byte) 64, Component80.packetBuffer)), 23034));
                if (i == 2) DisplayModeManagerContainer174.method2477("<img=1>" + string_98_, string_103_, (byte) -127, -1, "<img=1>" + string, null, 7, 0, string);
                else if (i == 1) DisplayModeManagerContainer174.method2477("<img=0>" + string_98_, string_103_, (byte) -115, -1, "<img=0>" + string, null, 7, 0, string);
                else DisplayModeManagerContainer174.method2477(string_98_, string_103_, (byte) -128, -1, string, null, 3, 0, string);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (CacheNode.aClass114_9552 == NodeSub3.aClass114_6584) {
            if (r.anInt9721 != -1) Component205.method1775((byte) -8, r.anInt9721, 0);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component39.aClass114_2248 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readUnsignedByte(255);
            int i_104_ = Component80.packetBuffer.readUnsignedByteSubtract((byte) -87);
            int i_105_ = Component80.packetBuffer.readUnsignedByte(255);
            int i_106_ = (Component80.packetBuffer.readShortLittle(!bool) << 2);
            int i_107_ = Component80.packetBuffer.readByteInverse((byte) 21);
            Component141.markDirty((byte) -125);
            MenuEntry.setCutsceneCamera(i_104_, i, i_106_, i_107_, i_105_, -127);
            NodeSub3.aClass114_6584 = null;
            return true;
        }

        if (NodeSub3.aClass114_6584 == NodeSub46.aClass114_7113) {
            NodeSub3.aClass114_6584 = null;
            return false;
        }
        if (Component119.aClass114_3427 == NodeSub3.aClass114_6584) {
            Component338.method1034(DefinitionSub25.anInt9341, Component80.packetBuffer, OggUrlStream.aClass297_8992, 110);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component291.aClass114_2527 == NodeSub3.aClass114_6584) {
            boolean bool_108_ = (Component80.packetBuffer.readUnsignedByte(255) == 1);
            byte[] is = new byte[DefinitionSub25.anInt9341 - 1];
            Component80.packetBuffer.readBytes(2147483647, 0, (DefinitionSub25.anInt9341) + -1, is);
            Component357.method1385(bool_108_, is, (byte) -104);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component355.aClass114_3264) {
            int i = Component80.packetBuffer.readUnsignedByte(255);
            byte i_109_ = Component80.packetBuffer.readByte128(-8679);
            Component141.markDirty((byte) -128);
            HashNodeSub14.method3244(i_109_, i, 120);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (ItemDefinitionProvider.aClass114_3265 == NodeSub3.aClass114_6584) {
            DisplayModeManagerContainer347.anInt3581 = (Component80.packetBuffer.readByteInverse(-622951480) << 3);
            GradientPreset.anInt9200 = Component80.packetBuffer.readUnsignedByteSubtract((byte) 98);
            DisplayModeManagerContainer306.anInt4786 = (Component80.packetBuffer.readByteSubtract(-27697) << 3);
            while ((Component80.packetBuffer.offset) < DefinitionSub25.anInt9341) {
                DisplayModeManagerContainer238 class74 = (ItemDefinitionProvider.method1929((byte) -19)[Component80.packetBuffer.readUnsignedByte(255)]);
                InputStream_Sub2.method128(class74, (byte) 8);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (DisplayModeManagerContainer130.aClass114_3467 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readShort(13638);
            int i_110_ = Component80.packetBuffer.readInt((byte) -126);
            int i_111_ = Component80.packetBuffer.readShort128((byte) 84);
            Component141.markDirty((byte) -124);
            Component247.method1080(i_111_, -23697, i, i_110_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (DisplayModeManagerContainer109.aClass114_2338 == NodeSub3.aClass114_6584) {
            String string = Component80.packetBuffer.readString((byte) 100);
            int i = Component80.packetBuffer.readShortAdd(124);
            Component141.markDirty((byte) -127);
            GlExtensionManager.method3965(string, i, 2);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == ShaderLinker.aClass114_10168) {
            int i = Component80.packetBuffer.readShortAddLittle(-117);
            int i_112_ = Component80.packetBuffer.readInt((byte) -126);
            Component141.markDirty((byte) -127);
            DefinitionSub15.method3084(i, (byte) -88, i_112_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component385.aClass114_2196 == NodeSub3.aClass114_6584) {
            boolean bool_113_ = Component80.packetBuffer.readUnsignedByte(255) == 1;
            String string = Component80.packetBuffer.readString((byte) -81);
            String string_114_ = string;
            if (bool_113_) string_114_ = Component80.packetBuffer.readString((byte) -39);
            long l = Component80.packetBuffer.readLong(-456577760);
            long l_115_ = Component80.packetBuffer.readUnsignedShort(842397944);
            long l_116_ = Component80.packetBuffer.readMedium(-1);
            int i = Component80.packetBuffer.readUnsignedByte(255);
            int i_117_ = Component80.packetBuffer.readUnsignedShort(842397944);
            long l_118_ = (l_115_ << 32) - -l_116_;
            boolean bool_119_ = false;
            while_219_:
            do {
                for (int i_120_ = 0; i_120_ < 100; i_120_++) {
                    if (Component186.aLongArray4410[i_120_] == l_118_) {
                        bool_119_ = true;
                        break while_219_;
                    }
                }
                if (i <= 1 && StringCache.isOnIgnoreList(string_114_, 28280)) bool_119_ = true;
            } while (false);
            if (!bool_119_ && AudioMixer.anInt3227 == 0) {
                Component186.aLongArray4410[NpcComposition.anInt1359] = l_118_;
                NpcComposition.anInt1359 = (NpcComposition.anInt1359 + 1) % 100;
                String string_121_ = (Component31.aClass355_5900.method3471(i_117_, (byte) -106).method3216(Component80.packetBuffer, (byte) 42));
                if (i == 2) DisplayModeManagerContainer174.method2477("<img=1>" + string_114_, string_121_, (byte) -120, i_117_, "<img=1>" + string, Component25.method1788((byte) 87, l), 20, 0, string);
                else if (i != 1) DisplayModeManagerContainer174.method2477(string_114_, string_121_, (byte) -111, i_117_, string, Component25.method1788((byte) 80, l), 20, 0, string);
                else DisplayModeManagerContainer174.method2477("<img=0>" + string_114_, string_121_, (byte) -116, i_117_, "<img=0>" + string, Component25.method1788((byte) -98, l), 20, 0, string);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (ParticleSystem.aClass114_7124 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readIntInverseMiddle(255);
            Component141.markDirty((byte) -125);
            if (i == -1) {
                JaclibLoader.anInt167 = -1;
                ShaderLinker.anInt10163 = -1;
            } else {
                int i_122_ = 0x3fff & i >> 14;
                i_122_ -= NodeBaseSub2.regionTileX;
                int i_123_ = 0x3fff & i;
                i_123_ -= Component330.regionTileY;
                if (i_122_ >= 0) {
                    if (AbstractShaderSub4.anInt7319 <= i_122_) i_122_ = AbstractShaderSub4.anInt7319;
                } else i_122_ = 0;
                JaclibLoader.anInt167 = (i_122_ << 9) - -256;
                if (i_123_ >= 0) {
                    if (i_123_ >= ParametricDefinition.anInt9109) i_123_ = ParametricDefinition.anInt9109;
                } else i_123_ = 0;
                ShaderLinker.anInt10163 = 256 + (i_123_ << 9);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DefinitionSub19.aClass114_9254) {
            int i = Component80.packetBuffer.readByteAdd((byte) -88);
            int i_124_ = Component80.packetBuffer.readShortLittle(!bool);
            DisplayModeManagerContainer58.aClass170_10209.method1316((byte) -58, i_124_, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (HeapDumper.aClass114_1914 == NodeSub3.aClass114_6584) {
            InputStream_Sub2.method128(DefinitionSub38.aClass74_9475, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component102.aClass114_4798) {
            int i = Component80.packetBuffer.readShortAddLittle(-107);
            if (i == 65535) i = -1;
            int i_125_ = Component80.packetBuffer.readByteAdd((byte) -121);
            int i_126_ = i_125_ >> 2;
            int i_127_ = i_125_ & 0x3;
            int i_128_ = Component129.anIntArray487[i_126_];
            int i_129_ = Component80.packetBuffer.readIntInverseMiddle(255);
            int i_130_ = (0x36079814 & i_129_) >> 28;
            int i_131_ = i_129_ >> 14 & 0x3fff;
            int i_132_ = 0x3fff & i_129_;
            i_131_ -= NodeBaseSub2.regionTileX;
            i_132_ -= Component330.regionTileY;
            GlToolkitSub3.vertexAttribPointer(i_132_, i, i_126_, i_131_, i_127_, 102, i_130_, i_128_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component39.aClass114_2255) {
            String string = Component80.packetBuffer.readString((byte) -104);
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            String string_133_ = (Component31.aClass355_5900.method3471(i, (byte) -98).method3216(Component80.packetBuffer, (byte) 42));
            DisplayModeManagerContainer174.method2477(string, string_133_, (byte) -122, i, string, null, 19, 0, string);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == CacheNode.aClass114_9550) {
            InputStream_Sub2.method128(DisplayModeManagerContainer363.aClass74_4098, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Connection.aClass114_2665 == NodeSub3.aClass114_6584) {
            for (int i = 0; i < InterfaceRenderer.players.length; i++) {
                if (InterfaceRenderer.players[i] != null) {
                    InterfaceRenderer.players[i].anIntArray10236 = null;
                    InterfaceRenderer.players[i].anInt10286 = -1;
                }
            }
            for (int i = 0; NodeSub32.anInt6930 > i; i++) {
                DefinitionSub23.aClass348_Sub22Array9319[i].npc.anIntArray10236 = null;
                DefinitionSub23.aClass348_Sub22Array9319[i].npc.anInt10286 = -1;
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component6.aClass114_4477 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readIntInverseMiddle(255);
            int i_134_ = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_135_ = Component80.packetBuffer.readShortAddLittle(-109);
            int i_136_ = Component80.packetBuffer.readShortAdd(16);
            Component141.markDirty((byte) -125);
            DisplayModeManagerContainer145.method1085(i_136_, i_134_, (byte) -86, i_135_, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component181.aClass114_1540 == NodeSub3.aClass114_6584) {
            DisplayModeInfo.aClass227_1055 = PauseTimer.method360((byte) -57, Component80.packetBuffer.readUnsignedByte(255));
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component71.aClass114_6058 == NodeSub3.aClass114_6584) {
            InputStream_Sub2.method128(DisplayModeManagerContainer51.aClass74_2491, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component218.aClass114_2331 == NodeSub3.aClass114_6584) {
            MenuEntry.ignoreCount = Component80.packetBuffer.readUnsignedByte(255);
            for (int i = 0; MenuEntry.ignoreCount > i; i++) {
                ObjectDefinition.ignoreNames[i] = Component80.packetBuffer.readString((byte) -36);
                DisplayModeManagerContainer145.ignoreDisplayNames[i] = Component80.packetBuffer.readString((byte) 112);
                if (DisplayModeManagerContainer145.ignoreDisplayNames[i].equals("")) DisplayModeManagerContainer145.ignoreDisplayNames[i] = ObjectDefinition.ignoreNames[i];
                DefinitionSub21.ignoreLastNames[i] = Component80.packetBuffer.readString((byte) 84);
                ShaderSub2.ignoreLastDisplayNames[i] = Component80.packetBuffer.readString((byte) -111);
                if (ShaderSub2.ignoreLastDisplayNames[i].equals("")) ShaderSub2.ignoreLastDisplayNames[i] = DefinitionSub21.ignoreLastNames[i];
                AbstractShaderSub3.ignoreTemporary[i] = false;
            }
            Component380.anInt4985 = ResourceLoader.anInt3918;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == CursorDefinitionCache.aClass114_2183) {
            int i = Component80.packetBuffer.readShortAddLittle(-121);
            if (i == 65535) i = -1;
            String string = Component80.packetBuffer.readString((byte) 103);
            int i_137_ = Component80.packetBuffer.readUnsignedByteSubtract((byte) -91);
            int i_138_ = Component80.packetBuffer.readByteAdd((byte) 13);
            if (i_137_ >= 1 && i_137_ <= 8) {
                if (string.equalsIgnoreCase("null")) string = null;
                Component252.aStringArray10195[i_137_ + -1] = string;
                Canvas_Sub1.anIntArray60[i_137_ + -1] = i;
                DisplayModeManagerContainer5.aBooleanArray1214[i_137_ - 1] = i_138_ == 0;
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component59.aClass114_1871 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readSmart(-117);
            int i_139_ = Component80.packetBuffer.readInt((byte) -126);
            int i_140_ = Component80.packetBuffer.readUnsignedByte(255);
            String string = "";
            String string_141_ = string;
            if ((i_140_ & 0x1) != 0) {
                string = Component80.packetBuffer.readString((byte) 92);
                if ((i_140_ & 0x2) != 0) string_141_ = Component80.packetBuffer.readString((byte) 126);
                else string_141_ = string;
            }
            String string_142_ = Component80.packetBuffer.readString((byte) -95);
            if (i == 99) Applet_Sub1.printConsole(string_142_, -93);
            else if (i == 98) Applet_Sub1.set(string_142_);
            else {
                if (!string_141_.equals("") && StringCache.isOnIgnoreList(string_141_, 28280)) {
                    NodeSub3.aClass114_6584 = null;
                    return true;
                }
                ShaderProgramSub2.addChatMessage(string_141_, i, (byte) -92, i_139_, string_142_, string, string);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == NodeSub45.aClass114_7105) {
            int i = Component80.packetBuffer.readUnsignedByte(255);
            if (Component80.packetBuffer.readUnsignedByte(255) == 0) RadixText.aClass54Array6114[i] = new Component285();
            else {
                Component80.packetBuffer.offset--;
                RadixText.aClass54Array6114[i] = new Component285(Component80.packetBuffer);
            }
            NodeSub3.aClass114_6584 = null;
            Component291.anInt2523 = ResourceLoader.anInt3918;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component338.aClass114_1702) {
            int i = Component80.packetBuffer.readShort(13638);
            int i_143_ = Component80.packetBuffer.readIntMiddleEndian((byte) 82);
            Component141.markDirty((byte) -126);
            Component75.method1330(i, -19906, i_143_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component223.aClass114_123) {
            int i = Component80.packetBuffer.readIntMiddleEndian((byte) 82);
            int i_144_ = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_145_ = Component80.packetBuffer.readUnsignedShort(842397944);
            if (i_145_ == 65535) i_145_ = -1;
            int i_146_ = Component80.packetBuffer.readShortAdd(124);
            Component141.markDirty((byte) -128);
            if (i_146_ == 65535) i_146_ = -1;
            for (int i_147_ = i_146_; i_145_ >= i_147_; i_147_++) {
                long l = ((long) i << 32) - -(long) i_147_;
                ComponentSettings class348_sub44 = ((ComponentSettings) Component127.aClass356_2959.get(l, -6008));
                ComponentSettings class348_sub44_148_;
                if (class348_sub44 == null) {
                    if (i_147_ == -1) class348_sub44_148_ = (new ComponentSettings(BitmapFont.getComponent(1512932720, i).settings.optionFlags, i_144_));
                    else class348_sub44_148_ = new ComponentSettings(0, i_144_);
                } else {
                    class348_sub44_148_ = new ComponentSettings((class348_sub44.optionFlags), i_144_);
                    class348_sub44.unlink((byte) 91);
                }
                Component127.aClass356_2959.put((byte) 125, l, class348_sub44_148_);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == NodeSub45.aClass114_7106) {
            while ((Component80.packetBuffer.offset) < DefinitionSub25.anInt9341) {
                boolean bool_149_ = Component80.packetBuffer.readUnsignedByte(255) == 1;
                String string = Component80.packetBuffer.readString((byte) -95);
                String string_150_ = Component80.packetBuffer.readString((byte) 118);
                int i = Component80.packetBuffer.readUnsignedShort(842397944);
                int i_151_ = Component80.packetBuffer.readUnsignedByte(255);
                String string_152_ = "";
                boolean bool_153_ = false;
                if (i > 0) {
                    string_152_ = Component80.packetBuffer.readString((byte) 119);
                    bool_153_ = (Component80.packetBuffer.readUnsignedByte(255) == 1);
                }
                for (int i_154_ = 0; (i_154_ < DefinitionSub30.friendCount); i_154_++) {
                    if (!bool_149_) {
                        if (string.equals(Component178.friendNames[i_154_])) {
                            if (i != GraphicsToolkit.friendWorldIds[i_154_]) {
                                boolean bool_155_ = true;
                                for (FriendLoginMessage class318_sub9_sub1 = ((FriendLoginMessage) HashNodeSub14.friendLoginMessages.method1872(8)); class318_sub9_sub1 != null; class318_sub9_sub1 = ((FriendLoginMessage) HashNodeSub14.friendLoginMessages.method1878((byte) 124))) {
                                    if (class318_sub9_sub1.username.equals(string)) {
                                        if (i == 0 || (class318_sub9_sub1.worldId != 0)) {
                                            if (i == 0 && (class318_sub9_sub1.worldId) != 0) {
                                                bool_155_ = false;
                                                class318_sub9_sub1.unlink(false);
                                            }
                                        } else {
                                            bool_155_ = false;
                                            class318_sub9_sub1.unlink(false);
                                        }
                                    }
                                }
                                if (bool_155_) HashNodeSub14.friendLoginMessages.method1869(-95, new FriendLoginMessage(string, i));
                                GraphicsToolkit.friendWorldIds[i_154_] = i;
                            }
                            ShaderProgramSub2.friendFormerNames[i_154_] = string_150_;
                            DebugPanic.friendWorldNames[i_154_] = string_152_;
                            Component16.friendRanks[i_154_] = i_151_;
                            string = null;
                            DisplayModeManagerContainer145.friendReferred[i_154_] = bool_153_;
                            break;
                        }
                    } else if (string_150_.equals(Component178.friendNames[i_154_])) {
                        Component178.friendNames[i_154_] = string;
                        ShaderProgramSub2.friendFormerNames[i_154_] = string_150_;
                        string = null;
                        break;
                    }
                }
                if (string != null && DefinitionSub30.friendCount < 200) {
                    Component178.friendNames[DefinitionSub30.friendCount] = string;
                    ShaderProgramSub2.friendFormerNames[(DefinitionSub30.friendCount)] = string_150_;
                    GraphicsToolkit.friendWorldIds[DefinitionSub30.friendCount] = i;
                    DebugPanic.friendWorldNames[DefinitionSub30.friendCount] = string_152_;
                    Component16.friendRanks[DefinitionSub30.friendCount] = i_151_;
                    DisplayModeManagerContainer145.friendReferred[DefinitionSub30.friendCount] = bool_153_;
                    DefinitionSub30.friendCount++;
                }
            }
            Component15.anInt4930 = 2;
            Component380.anInt4985 = ResourceLoader.anInt3918;
            boolean bool_156_ = false;
            int i = DefinitionSub30.friendCount;
            while (i > 0) {
                i--;
                bool_156_ = true;
                for (int i_157_ = 0; i > i_157_; i_157_++) {
                    if (((Component223.aClass161_125.anInt2143 != GraphicsToolkit.friendWorldIds[i_157_]) && (GraphicsToolkit.friendWorldIds[i_157_ - -1] == Component223.aClass161_125.anInt2143)) || (GraphicsToolkit.friendWorldIds[i_157_] == 0 && (GraphicsToolkit.friendWorldIds[1 + i_157_] != 0))) {
                        int i_158_ = GraphicsToolkit.friendWorldIds[i_157_];
                        GraphicsToolkit.friendWorldIds[i_157_] = GraphicsToolkit.friendWorldIds[1 + i_157_];
                        GraphicsToolkit.friendWorldIds[i_157_ - -1] = i_158_;
                        String string = DebugPanic.friendWorldNames[i_157_];
                        DebugPanic.friendWorldNames[i_157_] = DebugPanic.friendWorldNames[1 + i_157_];
                        DebugPanic.friendWorldNames[1 + i_157_] = string;
                        String string_159_ = Component178.friendNames[i_157_];
                        Component178.friendNames[i_157_] = Component178.friendNames[i_157_ + 1];
                        Component178.friendNames[i_157_ + 1] = string_159_;
                        String string_160_ = ShaderProgramSub2.friendFormerNames[i_157_];
                        ShaderProgramSub2.friendFormerNames[i_157_] = ShaderProgramSub2.friendFormerNames[i_157_ + 1];
                        ShaderProgramSub2.friendFormerNames[i_157_ - -1] = string_160_;
                        int i_161_ = Component16.friendRanks[i_157_];
                        Component16.friendRanks[i_157_] = Component16.friendRanks[1 + i_157_];
                        Component16.friendRanks[i_157_ + 1] = i_161_;
                        boolean bool_162_ = DisplayModeManagerContainer145.friendReferred[i_157_];
                        DisplayModeManagerContainer145.friendReferred[i_157_] = DisplayModeManagerContainer145.friendReferred[1 + i_157_];
                        bool_156_ = false;
                        DisplayModeManagerContainer145.friendReferred[i_157_ + 1] = bool_162_;
                    }
                }
                if (bool_156_) break;
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component317.aClass114_8683 == NodeSub3.aClass114_6584) {
            if (Component225.aFrame476 != null) LogicError.method830(Component192.preferences.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
            byte[] is = new byte[DefinitionSub25.anInt9341];
            Component80.packetBuffer.method3409(DefinitionSub25.anInt9341, is, 0, -32769);
            String string = WaterShaderSub8.decodeCp1252(is, 0, DefinitionSub25.anInt9341, 0);
            BrowserDetector.openBrowserUrl(string, OggUrlStream.aClass297_8992, Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350) == 1, true, 99);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (WaterShaderSub8.aClass114_7363 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            if (i == 65535) i = -1;
            int i_163_ = Component80.packetBuffer.readUnsignedByte(255);
            int i_164_ = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_165_ = Component80.packetBuffer.readUnsignedByte(255);
            int i_166_ = Component80.packetBuffer.readUnsignedShort(842397944);
            NodeSub20.method2947(true, i_165_, i, i_163_, i_164_, i_166_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component339.aClass114_3143) {
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            byte i_167_ = Component80.packetBuffer.readByte(-83);
            DisplayModeManagerContainer58.aClass170_10209.method1313((byte) 42, i_167_, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component327.aClass114_8756) {
            int i = Component80.packetBuffer.readShortLittle(false);
            if (i == 65535) i = -1;
            int i_168_ = Component80.packetBuffer.readIntInverseMiddle(255);
            Component141.markDirty((byte) -127);
            Component361.method304(i, 437853543, i_168_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component333.aClass114_3641) {
            InputStream_Sub2.method128(NodeSub35.aClass74_6977, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == SceneManager.aClass114_2860) {
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            if (i == 65535) i = -1;
            int i_169_ = Component80.packetBuffer.readUnsignedByte(255);
            int i_170_ = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_171_ = Component80.packetBuffer.readUnsignedByte(255);
            int i_172_ = Component80.packetBuffer.readUnsignedShort(842397944);
            AudioLine.method2090(i_169_, i_172_, false, (byte) -35, i_171_, i_170_, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }

        if (NodeSub3.aClass114_6584 == Component120.aClass114_318) {
            DefinitionSub26.method3120(-86);
            NodeSub3.aClass114_6584 = null;
            return false;
        }
        if (NodeSub3.aClass114_6584 == Component35.aClass114_4272) {
            int i = Component80.packetBuffer.readShortAdd(-127);
            int i_173_ = Component80.packetBuffer.readUnsignedByte(255);
            Component141.markDirty((byte) -128);
            Component326.method524(i_173_, true, i, -127);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component275.aClass114_2693 == NodeSub3.aClass114_6584) {
            boolean bool_174_ = (Component80.packetBuffer.readUnsignedByte(255) == 1);
            String string = Component80.packetBuffer.readString((byte) 107);
            String string_175_ = string;
            if (bool_174_) string_175_ = Component80.packetBuffer.readString((byte) -71);
            long l = Component80.packetBuffer.readUnsignedShort(842397944);
            long l_176_ = Component80.packetBuffer.readMedium(-1);
            int i = Component80.packetBuffer.readUnsignedByte(255);
            int i_177_ = Component80.packetBuffer.readUnsignedShort(842397944);
            long l_178_ = l_176_ + (l << 32);
            boolean bool_179_ = false;
            while_220_:
            do {
                for (int i_180_ = 0; i_180_ < 100; i_180_++) {
                    if (l_178_ == Component186.aLongArray4410[i_180_]) {
                        bool_179_ = true;
                        break while_220_;
                    }
                }
                if (i <= 1 && StringCache.isOnIgnoreList(string_175_, 28280)) bool_179_ = true;
            } while (false);
            if (!bool_179_ && AudioMixer.anInt3227 == 0) {
                Component186.aLongArray4410[NpcComposition.anInt1359] = l_178_;
                NpcComposition.anInt1359 = (NpcComposition.anInt1359 - -1) % 100;
                String string_181_ = (Component31.aClass355_5900.method3471(i_177_, (byte) -93).method3216(Component80.packetBuffer, (byte) 62));
                if (i == 2) DisplayModeManagerContainer174.method2477("<img=1>" + string_175_, string_181_, (byte) -110, i_177_, "<img=1>" + string, null, 18, 0, string);
                else if (i == 1) DisplayModeManagerContainer174.method2477("<img=0>" + string_175_, string_181_, (byte) -112, i_177_, "<img=0>" + string, null, 18, 0, string);
                else DisplayModeManagerContainer174.method2477(string_175_, string_181_, (byte) -118, i_177_, string, null, 18, 0, string);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == WaterShader.aClass114_7367) {
            int i = Component80.packetBuffer.readShortLittle(false);
            int i_182_ = Component80.packetBuffer.readIntLittle((byte) -122);
            int i_183_ = Component80.packetBuffer.readByteAdd((byte) -95);
            Component141.markDirty((byte) -125);
            NodeSub41 class348_sub41 = ((NodeSub41) Component15.aClass356_4915.get(i_182_, -6008));
            if (class348_sub41 != null) Component162.method1118(i != (class348_sub41.anInt7050), false, class348_sub41, 2533);
            Component103.method2661(i, i_182_, i_183_, false, 2);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component162.aClass114_8384) {
            NodeSub3.aClass114_6584 = null;
            Component15.anInt4930 = 1;
            Component380.anInt4985 = ResourceLoader.anInt3918;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component218.aClass114_2335) {
            Component141.markDirty((byte) -125);
            Component59.method1122(0);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component354.aClass114_220 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_184_ = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_185_ = Component80.packetBuffer.readUnsignedShort(842397944);
            Component141.markDirty((byte) -125);
            if (DefinitionSub33.openInterfaces[i] != null) {
                for (int i_186_ = i_184_; i_185_ > i_186_; i_186_++) {
                    int i_187_ = Component80.packetBuffer.readMedium(-1);
                    if ((DefinitionSub33.openInterfaces[i]).length > i_186_ && (DefinitionSub33.openInterfaces[i][i_186_]) != null) DefinitionSub33.openInterfaces[i][i_186_].anInt732 = i_187_;
                }
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component329.aClass114_5992) {
            InputStream_Sub2.method128(DisplayModeManagerContainer232.aClass74_4689, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub38.aClass114_7015 == NodeSub3.aClass114_6584) {
            GradientPreset.anInt9200 = Component80.packetBuffer.readByteAdd((byte) 126);
            DisplayModeManagerContainer306.anInt4786 = (Component80.packetBuffer.readByteInverse(-622951480) << 3);
            DisplayModeManagerContainer347.anInt3581 = (Component80.packetBuffer.readByteInverse(-622951480) << 3);
            for (NodeSub37 class348_sub37 = (NodeSub37) Component387.aClass356_1895.first(0); class348_sub37 != null; class348_sub37 = ((NodeSub37) Component387.aClass356_1895.next(0))) {
                int i = (int) ((class348_sub37.key >> 28) & 0x3L);
                int i_188_ = (int) (class348_sub37.key & 0x3fffL);
                int i_189_ = i_188_ + -NodeBaseSub2.regionTileX;
                int i_190_ = (int) (0x3fffL & (class348_sub37.key >> 14));
                int i_191_ = -Component330.regionTileY + i_190_;
                if (i == GradientPreset.anInt9200 && DisplayModeManagerContainer347.anInt3581 <= i_189_ && 8 + DisplayModeManagerContainer347.anInt3581 > i_189_ && DisplayModeManagerContainer306.anInt4786 <= i_191_ && DisplayModeManagerContainer306.anInt4786 - -8 > i_191_) {
                    class348_sub37.unlink((byte) 89);
                    if (i_189_ >= 0 && i_191_ >= 0 && i_189_ < AbstractShaderSub4.anInt7319 && (i_191_ < ParametricDefinition.anInt9109)) DisplayModeManagerContainer351.method1479(i_191_, (byte) -118, i_189_, GradientPreset.anInt9200);
                }
            }
            for (NodeSub27 class348_sub27 = ((NodeSub27) HashNodeSub20.aClass262_9711.first(4)); class348_sub27 != null; class348_sub27 = (NodeSub27) HashNodeSub20.aClass262_9711.next((byte) 31)) {
                if ((DisplayModeManagerContainer347.anInt3581 <= class348_sub27.anInt6905) && (class348_sub27.anInt6905 < DisplayModeManagerContainer347.anInt3581 - -8) && (class348_sub27.anInt6896 >= DisplayModeManagerContainer306.anInt4786) && (class348_sub27.anInt6896 < DisplayModeManagerContainer306.anInt4786 + 8) && (class348_sub27.anInt6899 == GradientPreset.anInt9200))
                    class348_sub27.anInt6893 = 0;
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DisplayModeManagerContainer341.aClass114_5997) {
            int i = Component80.packetBuffer.readByteInverse((byte) 21);
            int[] is = new int[4];
            for (int i_192_ = 0; i_192_ < 4; i_192_++)
                is[i_192_] = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_193_ = Component80.packetBuffer.readShortLittle(false);
            NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_193_, -6008));
            if (class348_sub22 != null) NpcDefinition.method2931(i, (byte) 110, is, (class348_sub22.npc));
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DefinitionSub22.aClass114_9285) {
            Component293.anInt3306 = Component80.packetBuffer.readUnsignedByte(255);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (DefinitionSub24.aClass114_9324 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readUnsignedByteSubtract((byte) -104);
            int i_194_ = Component80.packetBuffer.readUnsignedByteSubtract((byte) -92);
            int i_195_ = Component80.packetBuffer.readShortAddLittle(-127);
            if (i_195_ == 65535) i_195_ = -1;
            DisplayModeManagerContainer346.method1212(i_194_, i_195_, -1, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component236.aClass114_4015 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readMediumLittle(-13309);
            int i_196_ = Component80.packetBuffer.readShortAddLittle(-124);
            if (i_196_ == 65535) i_196_ = -1;
            int i_197_ = Component80.packetBuffer.readByteInverse((byte) 21);
            DisplayModeManagerContainer249.method1352(i_196_, i_197_, i, (byte) -98);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (GradientPreset.aClass114_9197 == NodeSub3.aClass114_6584) {
            String string = Component80.packetBuffer.readString((byte) -43);
            String string_198_ = Component317.escapeAngleBrackets((DefinitionSub32.method3136((byte) 64, (Component80.packetBuffer))), 23034);
            ShaderProgramSub2.addChatMessage(string, 6, (byte) -101, 0, string_198_, string, string);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component162.aClass114_8385) {
            int i = Component80.packetBuffer.readIntLittle((byte) -124);
            String string = Component80.packetBuffer.readString((byte) -97);
            Component141.markDirty((byte) -125);
            Component372.method1803(i, string, -32394);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == RadixParser.aClass114_2305) {
            int i = Component80.packetBuffer.readIntMiddleEndian((byte) 82);
            int i_199_ = Component80.packetBuffer.readIntInverseMiddle(255);
            int i_200_ = Component80.packetBuffer.readShortLittle(false);
            Component141.markDirty((byte) -126);
            SocketStream.method1703(5, i, i_200_, 4, i_199_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component63.aClass114_4500 == NodeSub3.aClass114_6584) {
            boolean bool_201_ = (Component80.packetBuffer.readByteInverse((byte) 21) == 1);
            Component141.markDirty((byte) -124);
            DisplayModeManagerContainer145.aBoolean1801 = bool_201_;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DisplayModeManagerContainer213.aClass114_1068) {
            DisplayModeManagerContainer259.method2038(-103);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub1Sub2.aClass114_8817 == NodeSub3.aClass114_6584) {
            NodeBase.anInt7276 = Component80.packetBuffer.readUnsignedByteSubtract((byte) 69);
            Component200.anInt3713 = Component80.packetBuffer.readByteAdd((byte) -82);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DefinitionSub19.aClass114_9257) {
            int i = Component80.packetBuffer.readByteInverse((byte) 21);
            int i_202_ = Component80.packetBuffer.readShortAdd(127);
            Component141.markDirty((byte) -125);
            if (i == 2) DisplayModeManagerContainer273.method1134(92);
            r.anInt9721 = i_202_;
            NodeSub7.method2772(i_202_, (byte) 123);
            Component339.method1713(false, 520);
            ClientScriptExecutor.runInterfaceScripts(r.anInt9721);
            for (int i_203_ = 0; i_203_ < 100; i_203_++)
                InflaterDecompressor.aBooleanArray2076[i_203_] = true;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component92.aClass114_3307) {
            if (!CacheFileStore.isReconnectState(Component49.clientState, -105)) Component156.anInt3699 = (Component80.packetBuffer.readUnsignedShort(842397944) * 30);
            else Component156.anInt3699 = (int) ((float) Component80.packetBuffer.readUnsignedShort(842397944) * 2.5F);
            DefinitionSub23.anInt9313 = ResourceLoader.anInt3918;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == RenderableObject.aClass114_6383) {
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            if (i == 65535) i = -1;
            int i_204_ = Component80.packetBuffer.readUnsignedByte(255);
            int i_205_ = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_206_ = Component80.packetBuffer.readUnsignedByte(255);
            AudioLine.method2090(i_204_, 256, true, (byte) -35, i_206_, i_205_, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (ShaderLinker.aClass114_10149 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readShortAdd(-16);
            if (i == 65535) i = -1;
            int i_207_ = Component80.packetBuffer.readIntMiddleEndian((byte) 82);
            Component141.markDirty((byte) -125);
            SocketStream.method1703(1, i_207_, i, 4, -1);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DisplayModeManagerContainer32.aClass114_843) {
            InputStream_Sub2.method128(GnpPositionLogger.aClass74_1519, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component323.aClass114_5883) {
            int i = Component80.packetBuffer.readShortAdd(125);
            if (i == 65535) i = -1;
            int i_208_ = Component80.packetBuffer.readShortLittle(false);
            if (i_208_ == 65535) i_208_ = -1;
            int i_209_ = Component80.packetBuffer.readInt((byte) -126);
            int i_210_ = Component80.packetBuffer.readIntInverseMiddle(255);
            Component141.markDirty((byte) -127);
            for (int i_211_ = i_208_; i_211_ <= i; i_211_++) {
                long l = (long) i_211_ + ((long) i_209_ << 32);
                ComponentSettings class348_sub44 = ((ComponentSettings) Component127.aClass356_2959.get(l, -6008));
                ComponentSettings class348_sub44_212_;
                if (class348_sub44 != null) {
                    class348_sub44_212_ = new ComponentSettings(i_210_, (class348_sub44.anInt7093));
                    class348_sub44.unlink((byte) 80);
                } else if (i_211_ == -1) class348_sub44_212_ = (new ComponentSettings(i_210_, BitmapFont.getComponent(1512932720, i_209_).settings.anInt7093));
                else class348_sub44_212_ = new ComponentSettings(i_210_, -1);
                Component127.aClass356_2959.put((byte) 114, l, class348_sub44_212_);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DisplayModeManagerContainer346.aClass114_2068) {
            int i = Component80.packetBuffer.readShortAdd(-103);
            int i_213_ = Component80.packetBuffer.readIntInverseMiddle(255);
            DisplayModeManagerContainer58.aClass170_10209.method1316((byte) -124, i, i_213_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component219.aClass114_6340) {
            Component80.packetBuffer.offset += 28;
            if (Component80.packetBuffer.checkCrc(-25541)) BrowserDetector.method1365((Component80.packetBuffer.offset) + -28, (byte) -126, Component80.packetBuffer);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == DisplayModeManagerContainer167.aClass114_250) {
            DisplayModeManagerContainer74.anInt4816 = Component80.packetBuffer.readUnsignedByte(255);
            DefinitionSub23.anInt9313 = ResourceLoader.anInt3918;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component316.aClass114_2483 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readUnsignedByteSubtract((byte) 20);
            int i_214_ = Component80.packetBuffer.readByteInverse((byte) 21);
            int i_215_ = Component80.packetBuffer.readIntMiddleEndian((byte) 82);
            DisplayModeManagerContainer51.anIntArray2497[i_214_] = i_215_;
            DisplayModeManagerContainer254.anIntArray2145[i_214_] = i;
            Component52.anIntArray3295[i_214_] = 1;
            int i_216_ = OutputStream_Sub1.anIntArray100[i_214_] + -1;
            for (int i_217_ = 0; i_216_ > i_217_; i_217_++) {
                if (DisplayModeManagerContainer34.anIntArray8663[i_217_] <= i_215_) Component52.anIntArray3295[i_214_] = i_217_ - -2;
            }
            HelveticaFont.anIntArray2632[GpsOverlay.bitwiseAnd(31, Component311.anInt4086++)] = i_214_;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component248.aClass114_315 == NodeSub3.aClass114_6584) {
            InputStream_Sub2.method128(DisplayModeManagerContainer133.aClass74_2157, (byte) 8);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (DisplayModeManagerContainer332.aClass114_4998 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readShortAdd(10);
            int i_218_ = Component80.packetBuffer.readUnsignedByteSubtract((byte) 70);
            boolean bool_219_ = (0x1 & i_218_) == 1;
            ParametricDefinition.method3054(bool_219_, i, -128);
            HelveticaFont.anIntArray2633[GpsOverlay.bitwiseAnd(31, KeyStoreLoader.anInt1631++)] = i;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (ToolbarRefreshDefinition.aClass114_9225 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readUnsignedShort(842397944);
            int i_220_ = Component80.packetBuffer.readUnsignedByte(255);
            boolean bool_221_ = (i_220_ & 0x1) == 1;
            while ((Component80.packetBuffer.offset) < DefinitionSub25.anInt9341) {
                int i_222_ = Component80.packetBuffer.readSmart(-125);
                int i_223_ = Component80.packetBuffer.readUnsignedShort(842397944);
                int i_224_ = 0;
                if (i_223_ != 0) {
                    i_224_ = Component80.packetBuffer.readUnsignedByte(255);
                    if (i_224_ == 255) i_224_ = Component80.packetBuffer.readInt((byte) -126);
                }
                Canvas_Sub1.setContainerSlot(i, -364570972, bool_221_, i_222_, i_224_, -1 + i_223_);
            }
            HelveticaFont.anIntArray2633[GpsOverlay.bitwiseAnd(31, KeyStoreLoader.anInt1631++)] = i;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (LibraryCreditsText.aClass114_5950 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readUnsignedByteSubtract((byte) -113);
            int i_225_ = Component80.packetBuffer.readByteAdd((byte) 127);
            if (i == 255) {
                i_225_ = -1;
                i = -1;
            }
            Component256.method1825(120, i_225_, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (OpenGlShader.aClass114_7398 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readIntLittle((byte) -124);
            int i_226_ = Component80.packetBuffer.readShortLittle(false);
            Component141.markDirty((byte) -124);
            DisplayModeManagerContainer368.method467(i_226_, -18075, i);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component246.aClass114_2717 == NodeSub3.aClass114_6584) {
            GnpPositionLogger.method856((byte) 63);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (AbstractShaderSub3.aClass114_7301 == NodeSub3.aClass114_6584) {
            boolean bool_227_ = (Component80.packetBuffer.readUnsignedByte(255) == 1);
            String string = Component80.packetBuffer.readString((byte) 89);
            String string_228_ = string;
            if (bool_227_) string_228_ = Component80.packetBuffer.readString((byte) 98);
            int i = Component80.packetBuffer.readUnsignedByte(255);
            int i_229_ = Component80.packetBuffer.readUnsignedShort(842397944);
            boolean bool_230_ = false;
            if (i <= 1 && StringCache.isOnIgnoreList(string_228_, 28280)) bool_230_ = true;
            if (!bool_230_ && AudioMixer.anInt3227 == 0) {
                String string_231_ = (Component31.aClass355_5900.method3471(i_229_, (byte) -108).method3216(Component80.packetBuffer, (byte) 93));
                if (i == 2) DisplayModeManagerContainer174.method2477("<img=1>" + string_228_, string_231_, (byte) -127, i_229_, "<img=1>" + string, null, 25, 0, string);
                else if (i != 1) DisplayModeManagerContainer174.method2477(string_228_, string_231_, (byte) -119, i_229_, string, null, 25, 0, string);
                else DisplayModeManagerContainer174.method2477("<img=0>" + string_228_, string_231_, (byte) -125, i_229_, "<img=0>" + string, null, 25, 0, string);
            }
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (Component211.aClass114_1959 == NodeSub3.aClass114_6584) {
            int i = Component80.packetBuffer.readIntInverseMiddle(255);
            int i_232_ = Component80.packetBuffer.readShortAdd(-110);
            Component141.markDirty((byte) -124);
            DisplayModeManagerContainer207.method3411(i, 12, i_232_);
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        if (NodeSub3.aClass114_6584 == Component135.aClass114_4421) {
            GameType.anInt2986 = ResourceLoader.anInt3918;
            if (DefinitionSub25.anInt9341 == 0) {
                NameFormatter.anInt496 = 0;
                Component47.aString863 = null;
                RequestProcessor.aClass19Array2261 = null;
                NodeSub21.aString6854 = null;
                NodeSub3.aClass114_6584 = null;
                return true;
            }
            NodeSub21.aString6854 = Component80.packetBuffer.readString((byte) -112);
            boolean bool_233_ = Component80.packetBuffer.readUnsignedByte(255) == 1;
            if (bool_233_) Component80.packetBuffer.readString((byte) 108);
            long l = Component80.packetBuffer.readLong(-456577760);
            Component47.aString863 = DisplayModeManagerContainer91.method313(l, -104);
            Component386.aByte2871 = Component80.packetBuffer.readByte(-90);
            int i = Component80.packetBuffer.readUnsignedByte(255);
            if (i == 255) {
                NodeSub3.aClass114_6584 = null;
                return true;
            }
            NameFormatter.anInt496 = i;
            Component248[] class19s = new Component248[100];
            for (int i_234_ = 0; NameFormatter.anInt496 > i_234_; i_234_++) {
                class19s[i_234_] = new Component248();
                class19s[i_234_].aString314 = Component80.packetBuffer.readString((byte) 103);
                bool_233_ = Component80.packetBuffer.readUnsignedByte(255) == 1;
                if (!bool_233_) class19s[i_234_].aString306 = class19s[i_234_].aString314;
                else class19s[i_234_].aString306 = Component80.packetBuffer.readString((byte) 107);
                class19s[i_234_].aString312 = DebugPanicSub1.method2127(2, (class19s[i_234_].aString306));
                class19s[i_234_].anInt308 = Component80.packetBuffer.readUnsignedShort(842397944);
                class19s[i_234_].aByte310 = Component80.packetBuffer.readByte(-118);
                class19s[i_234_].aString313 = Component80.packetBuffer.readString((byte) -124);
                if (class19s[i_234_].aString306.equals(Component72.localPlayer.username)) DisplayModeManagerContainer96.aByte4702 = class19s[i_234_].aByte310;
            }
            boolean bool_235_ = false;
            int i_236_ = NameFormatter.anInt496;
            while (i_236_ > 0) {
                i_236_--;
                bool_235_ = true;
                for (int i_237_ = 0; i_236_ > i_237_; i_237_++) {
                    if ((class19s[i_237_].aString312.compareTo(class19s[1 + i_237_].aString312)) > 0) {
                        Component248 class19 = class19s[i_237_];
                        class19s[i_237_] = class19s[i_237_ - -1];
                        class19s[1 + i_237_] = class19;
                        bool_235_ = false;
                    }
                }
                if (bool_235_) break;
            }
            RequestProcessor.aClass19Array2261 = class19s;
            NodeSub3.aClass114_6584 = null;
            return true;
        }
        ClientErrorReporter.reportError(("T1 - " + (NodeSub3.aClass114_6584 == null ? -1 : NodeSub3.aClass114_6584.method1058((byte) 110)) + "," + (Component339.aClass114_3145 == null ? -1 : Component339.aClass114_3145.method1058((byte) 127)) + "," + (DefinitionSub36.aClass114_9456 == null ? -1 : DefinitionSub36.aClass114_9456.method1058((byte) 125)) + " - " + DefinitionSub25.anInt9341), null, 15004);
        LoggedOutDefinition.disconnectAndReset(false, (byte) 11);
        return true;
    }

    public static void softDisconnect(byte i) {
        currentGameType = null;
        if (i > 38) {
            aLongArrayArrayArray10431 = null;
            aClass76_10436 = null;
            aClass74_10437 = null;
        }
    }

    final Object getValue(int i) {
        anInt10435++;
        if (i < 75) getValue(-128);
        return anObject10429;
    }
}
