/* NodeSub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub41
/**
 * RENAMED from `Class348_Sub41` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    static int anInt7046;
    static int anInt7047;
    static String aString7048;
    static int anInt7049;
    int anInt7050;
    static int anInt7051;
    static Component183 aClass114_7052 = new Component183(86, 6);
    int anInt7053;
    static int anInt7054;
    static int anInt7055;
    /*synthetic*/ static Class aClass7056;

    static final boolean method3154(int i, int i_0_, int i_1_, int i_2_, byte[] is, byte i_3_) {
        anInt7047++;
        if (i_3_ != 39) aClass114_7052 = null;
        boolean bool = true;
        Buffer class348_sub49 = new Buffer(is);
        int i_4_ = -1;
        for (; ; ) {
            int i_5_ = class348_sub49.readLargeSmart(107);
            if (i_5_ == 0) break;
            i_4_ += i_5_;
            int i_6_ = 0;
            boolean bool_7_ = false;
            for (; ; ) {
                if (bool_7_) {
                    int i_8_ = class348_sub49.readSmart(-118);
                    if (i_8_ == 0) break;
                    class348_sub49.readUnsignedByte(255);
                } else {
                    int i_9_ = class348_sub49.readSmart(i_3_ ^ ~0x58);
                    if (i_9_ == 0) break;
                    i_6_ += -1 + i_9_;
                    int i_10_ = i_6_ & 0x3f;
                    int i_11_ = i_6_ >> 6 & 0x3f;
                    int i_12_ = class348_sub49.readUnsignedByte(255) >> 2;
                    int i_13_ = i_11_ - -i_0_;
                    int i_14_ = i_2_ + i_10_;
                    if (i_13_ > 0 && i_14_ > 0 && i_13_ < -1 + i && -1 + i_1_ > i_14_) {
                        ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(0, i_4_);
                        if (i_12_ != 22 || Component192.preferences.aClass239_Sub4_7220.method1737(-32350) != 0 || class51.anInt874 != 0 || (class51.anInt920 == 1) || class51.aBoolean947) {
                            bool_7_ = true;
                            if (!class51.method485(9773)) {
                                Component101.anInt2101++;
                                bool = false;
                            }
                        }
                    }
                }
            }
        }
        return bool;
    }

    public static void method3155(int i) {
        aString7048 = null;
        aClass114_7052 = null;
        if (i != -5) anInt7054 = 110;
    }

    /** Parse decimal int ({@link RadixText#parseIntRadix} radix 10). */
    static final int parseInt(boolean bool, String string) {
        anInt7055++;
        if (bool != true) aClass114_7052 = null;
        return RadixText.parseIntRadix(-123, 10, true, string);
    }

    static final void method3157(int i, byte i_15_, int i_16_, int i_17_, boolean bool) {
        anInt7049++;
        if (bool || i_16_ != GraphicsToolkit.anInt4581 || DisplayModeManagerContainer363.anInt4095 != i || (Component117.anInt4372 != Component385.anInt2204 && Component192.preferences.aClass239_Sub27_7261.method1840(-32350) != 1)) {
            GraphicsToolkit.anInt4581 = i_16_;
            DisplayModeManagerContainer363.anInt4095 = i;
            Component385.anInt2204 = Component117.anInt4372;
            if (Component192.preferences.aClass239_Sub27_7261.method1840(-32350) == 1) Component385.anInt2204 = 0;
            Buffer.setClientState(2, i_17_);
            Component149.method3511(true, Applet_Sub1.aClass324_20, Component163.aClass143_3179, FriendsIgnoreList.aClass274_3495.getLocalized(ObjectDeserializer.languageId, 544), 2, NodeSub8.toolkit);
            int i_18_ = NodeBaseSub2.regionTileX;
            int i_19_ = Component330.regionTileY;
            NodeBaseSub2.regionTileX = (-(AbstractShaderSub4.anInt7319 >> 4) + GraphicsToolkit.anInt4581) * 8;
            Component330.regionTileY = 8 * (DisplayModeManagerContainer363.anInt4095 - (ParametricDefinition.anInt9109 >> 4));
            Request.aClass348_Sub42_Sub14_6885 = DisplayModeManagerContainer229.findAreaAt(GraphicsToolkit.anInt4581 * 8, DisplayModeManagerContainer363.anInt4095 * 8);
            CacheNodeSub2.aClass252_10488 = null;
            int i_20_ = NodeBaseSub2.regionTileX - i_18_;
            int i_21_ = -i_19_ + Component330.regionTileY;
            if (i_17_ == 11) {
                for (int i_22_ = 0; NodeSub32.anInt6930 > i_22_; i_22_++) {
                    NpcNode class348_sub22 = DefinitionSub23.aClass348_Sub22Array9319[i_22_];
                    if (class348_sub22 != null) {
                        Npc npc = (class348_sub22.npc);
                        for (int i_23_ = 0; i_23_ < 10; i_23_++) {
                            npc.anIntArray10320[i_23_] -= i_20_;
                            npc.anIntArray10317[i_23_] -= i_21_;
                        }
                        npc.y -= i_21_ * 512;
                        npc.x -= i_20_ * 512;
                    }
                }
            } else {
                Component324.anInt2057 = 0;
                boolean bool_24_ = false;
                int i_25_ = AbstractShaderSub4.anInt7319 * 512 - 512;
                int i_26_ = 512 * (-1 + ParametricDefinition.anInt9109);
                for (int i_27_ = 0; (NodeSub32.anInt6930 > i_27_); i_27_++) {
                    NpcNode class348_sub22 = DefinitionSub23.aClass348_Sub22Array9319[i_27_];
                    if (class348_sub22 != null) {
                        Npc npc = (class348_sub22.npc);
                        npc.y -= 512 * i_21_;
                        npc.x -= 512 * i_20_;
                        if ((npc.x) < 0 || i_25_ < (npc.x) || (npc.y) < 0 || i_26_ < (npc.y)) {
                            npc.method2448(null, -2);
                            class348_sub22.unlink((byte) 80);
                            bool_24_ = true;
                        } else {
                            boolean bool_28_ = true;
                            for (int i_29_ = 0; i_29_ < 10; i_29_++) {
                                npc.anIntArray10320[i_29_] -= i_20_;
                                npc.anIntArray10317[i_29_] -= i_21_;
                                if ((npc.anIntArray10320[i_29_]) < 0 || ((npc.anIntArray10320[i_29_]) >= AbstractShaderSub4.anInt7319) || (npc.anIntArray10317[i_29_]) < 0 || (ParametricDefinition.anInt9109 <= (npc.anIntArray10317[i_29_])))
                                    bool_28_ = false;
                            }
                            if (!bool_28_) {
                                npc.method2448(null, -2);
                                bool_24_ = true;
                                class348_sub22.unlink((byte) 113);
                            } else DisplayModeManagerContainer238.anIntArray1233[Component324.anInt2057++] = (npc.anInt10290);
                        }
                    }
                }
                if (bool_24_) {
                    NodeSub32.anInt6930 = Component21.aClass356_3654.size(1);
                    Component21.aClass356_3654.method3477(3, DefinitionSub23.aClass348_Sub22Array9319);
                }
            }
            if (i_15_ > 122) {
                for (int i_30_ = 0; i_30_ < 2048; i_30_++) {
                    Player player = (InterfaceRenderer.players[i_30_]);
                    if (player != null) {
                        for (int i_31_ = 0; i_31_ < 10; i_31_++) {
                            player.anIntArray10320[i_31_] -= i_20_;
                            player.anIntArray10317[i_31_] -= i_21_;
                        }
                        player.x -= i_20_ * 512;
                        player.y -= 512 * i_21_;
                    }
                }
                Component114[] class302s = NodeSub27.aClass302Array6897;
                for (int i_32_ = 0; class302s.length > i_32_; i_32_++) {
                    Component114 class302 = class302s[i_32_];
                    if (class302 != null) {
                        class302.anInt3832 -= i_21_ * 512;
                        class302.anInt3835 -= 512 * i_20_;
                    }
                }
                for (NodeSub27 class348_sub27 = ((NodeSub27) HashNodeSub20.aClass262_9711.first(4)); class348_sub27 != null; class348_sub27 = (NodeSub27) HashNodeSub20.aClass262_9711.next((byte) 68)) {
                    class348_sub27.anInt6896 -= i_21_;
                    class348_sub27.anInt6905 -= i_20_;
                    if (Component37.anInt3931 != 4 && (class348_sub27.anInt6905 < 0 || class348_sub27.anInt6896 < 0 || (class348_sub27.anInt6905 >= AbstractShaderSub4.anInt7319) || (ParametricDefinition.anInt9109 <= (class348_sub27.anInt6896)))) class348_sub27.unlink((byte) 101);
                }
                if (Component37.anInt3931 != 4) {
                    for (NodeSub37 class348_sub37 = ((NodeSub37) Component387.aClass356_1895.first(0)); class348_sub37 != null; class348_sub37 = ((NodeSub37) Component387.aClass356_1895.next(0))) {
                        int i_33_ = (int) (0x3fffL & class348_sub37.key);
                        int i_34_ = -NodeBaseSub2.regionTileX + i_33_;
                        int i_35_ = (int) (0x3fffL & (class348_sub37.key >> 14));
                        int i_36_ = i_35_ + -Component330.regionTileY;
                        if (i_34_ < 0 || i_36_ < 0 || (i_34_ >= AbstractShaderSub4.anInt7319) || i_36_ >= ParametricDefinition.anInt9109) class348_sub37.unlink((byte) 37);
                    }
                }
                if (Component253.anInt3203 != 0) {
                    Component253.anInt3203 -= i_20_;
                    Component263.anInt1548 -= i_21_;
                }
                NpcDefinition.method2928(true);
                if (i_17_ != 11) {
                    Component300.anInt3550 -= i_21_;
                    WaterSurfaceShader.anInt6246 -= 512 * i_20_;
                    Component48.anInt4336 -= i_20_;
                    Component337.anInt3647 -= i_21_;
                    NodeSub35.anInt6981 -= i_20_;
                    Component317.anInt8685 -= 512 * i_21_;
                    if ((AbstractShaderSub4.anInt7319 < Math.abs(i_20_)) || Math.abs(i_21_) > ParametricDefinition.anInt9109) DisplayModeManagerContainer154.method773(true);
                } else if (DefinitionSub21.cameraMode == 4) {
                    NodeSub7.anInt6652 -= i_21_ * 512;
                    DisplayModeManagerContainer273.cameraFocusX -= i_20_ * 512;
                    Component353.cameraFocusZ -= 512 * i_21_;
                    NodederUtil.anInt6633 -= i_20_ * 512;
                } else {
                    DefinitionSub21.cameraMode = 1;
                    JaclibLoader.anInt167 = ShaderLinker.anInt10163 = -1;
                }
                DefinitionSub39.method3153(0);
                Component308.method464(-1);
                CacheNodeSub2.aClass262_10492.clear(107);
                DefinitionSub17.aClass262_9240.clear(103);
                Component241.aClass243_2957.method1876((byte) -45);
                AudioMixer.method1911((byte) 99);
            }
        }
    }

    /**
     * JS5 container: type 0 = raw, 1 = bzip2, else GZIP.
     * Header: {@code type}, uncompressed length, optional compressed length.
     */
    static final byte[] decompressContainer(byte[] is, int i) {
        anInt7046++;
        Buffer class348_sub49 = new Buffer(is);
        int i_37_ = class348_sub49.readUnsignedByte(255);
        if (i > -74) parseInt(true, null);
        int i_38_ = class348_sub49.readInt((byte) -126);
        if (i_38_ < 0 || (Component336.anInt401 != 0 && i_38_ > Component336.anInt401)) {
            throw new RuntimeException();
        }
        if (i_37_ != 0) {
            int i_39_ = class348_sub49.readInt((byte) -126);
            if (i_39_ < 0 || (Component336.anInt401 != 0 && i_39_ > Component336.anInt401) || i_39_ > 10000000) {
                return new byte[4];
            }
            byte[] is_40_ = new byte[i_39_];
            if (i_37_ == 1) Component187.decompressBzip2(is_40_, i_39_, is, i_38_, 9);
            else {
                synchronized (ObjectDeserializer.gzipDecompressor) {
                    ObjectDeserializer.gzipDecompressor.inflateGzip(is_40_, 29123, class348_sub49);
                }
            }
            return is_40_;
        }
        byte[] is_41_ = new byte[i_38_];
        class348_sub49.readBytes(2147483647, 0, i_38_, is_41_);
        return is_41_;
    }

    static final void method3159(int i, int i_42_, boolean bool, int i_43_, int i_44_, int i_45_, GraphicsToolkit var_ha, int i_46_, int i_47_) {
        anInt7051++;
        Interface10 interface10 = (Interface10) CacheNodeSub2.method3297(i_43_, i_45_, i_44_);
        if (interface10 != null) {
            ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(0, interface10.method42(-124));
            int i_48_ = 0x3 & interface10.method41(-32228);
            int i_49_ = interface10.method39(35);
            if (class51.anInt875 == -1) {
                int i_50_ = i_47_;
                if (class51.anInt874 > 0) i_50_ = i;
                if (i_49_ == 0 || i_49_ == 2) {
                    if (i_48_ != 0) {
                        if (i_48_ == 1) var_ha.method3649((byte) -79, 4, i_42_, i_50_, i_46_);
                        else if (i_48_ == 2) var_ha.method3660(3 + i_46_, i_50_, 4, i_42_, true);
                        else if (i_48_ == 3) var_ha.method3649((byte) -121, 4, i_42_ + 3, i_50_, i_46_);
                    } else var_ha.method3660(i_46_, i_50_, 4, i_42_, !bool);
                }
                if (i_49_ == 3) {
                    if (i_48_ != 0) {
                        if (i_48_ == 1) var_ha.method3675(1, (byte) -125, 3 + i_46_, i_42_, 1, i_50_);
                        else if (i_48_ != 2) {
                            if (i_48_ == 3) var_ha.method3675(1, (byte) -125, i_46_, 3 + i_42_, 1, i_50_);
                        } else var_ha.method3675(1, (byte) -125, 3 + i_46_, 3 + i_42_, 1, i_50_);
                    } else var_ha.method3675(1, (byte) -125, i_46_, i_42_, 1, i_50_);
                }
                if (i_49_ == 2) {
                    if (i_48_ != 0) {
                        if (i_48_ == 1) var_ha.method3660(3 + i_46_, i_50_, 4, i_42_, true);
                        else if (i_48_ != 2) {
                            if (i_48_ == 3) var_ha.method3660(i_46_, i_50_, 4, i_42_, true);
                        } else var_ha.method3649((byte) -106, 4, 3 + i_42_, i_50_, i_46_);
                    } else var_ha.method3649((byte) -96, 4, i_42_, i_50_, i_46_);
                }
            } else Component119.method2028(i_46_, class51, i_42_, var_ha, i_48_, 126);
        }
        if (bool != false) anInt7054 = 122;
        interface10 = ((Interface10) DisplayModeManagerContainer249.method1353(i_43_, i_45_, i_44_, (aClass7056 != null ? aClass7056 : (aClass7056 = Interface10.class))));
        if (interface10 != null) {
            ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(0, interface10.method42(-88));
            int i_51_ = interface10.method41(-32228) & 0x3;
            int i_52_ = interface10.method39(-126);
            if (class51.anInt875 != -1) Component119.method2028(i_46_, class51, i_42_, var_ha, i_51_, -86);
            else if (i_52_ == 9) {
                int i_53_ = -1118482;
                if (class51.anInt874 > 0) i_53_ = -1179648;
                if (i_51_ != 0 && i_51_ != 2) var_ha.method3645(i_42_, i_46_, 3 + i_46_, -8003, i_53_, i_42_ + 3);
                else var_ha.method3645(i_42_ + 3, i_46_, 3 + i_46_, -8003, i_53_, i_42_);
            }
        }
        interface10 = (Interface10) BrowserUrlOpener.method2878(i_43_, i_45_, i_44_);
        if (interface10 != null) {
            ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(0, interface10.method42(-118));
            int i_54_ = interface10.method41(-32228) & 0x3;
            if (class51.anInt875 != -1) Component119.method2028(i_46_, class51, i_42_, var_ha, i_54_, -5);
        }
    }

    public NodeSub41() {
        /* empty */
    }

}
