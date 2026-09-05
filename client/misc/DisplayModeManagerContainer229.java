/* DisplayModeManagerContainer229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class DisplayModeManagerContainer229
/**
 * RENAMED from `Class75` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static CacheStore aClass45_1237;
    static Component62 aClass153_1238;
    private static DisplayModeManagerContainer259 aClass268_1239;
    private static Component191 aClass183_1240;
    private static LruCache aClass356_1241 = new LruCache(16);
    static Component258 aClass141_1242;
    static HashNodeSub14 aClass348_Sub42_Sub14_1243;
    static Interface17 anInterface17_1244;
    static ObjectDefinitionProvider aClass263_1245;
    static Component278 aClass252_1246;
    static float aFloat1247;
    private static byte[] aByteArray1248;
    static float aFloat1249;
    static int anInt1250;
    static byte[][][] aByteArrayArrayArray1251;
    private static short[] aShortArray1252;
    static int anInt1253 = (int) (Math.random() * 17.0) - 8;
    static NodeList aClass262_1254;
    static int anInt1255;
    private static byte[] aByteArray1256;
    static int anInt1257;
    private static byte[] aByteArray1258;
    static int anInt1259;
    private static int[] anIntArray1260;
    private static short[] aShortArray1261;
    static int anInt1262;
    static int anInt1263;
    private static byte[] aByteArray1264;
    static int anInt1265;
    static int anInt1266;
    static int anInt1267;
    static int anInt1268;
    private static Component315[][][] aClass243ArrayArrayArray1269;
    private static short[] aShortArray1270;
    private static LruCache aClass356_1271;
    static int anInt1272;
    private static byte[] aByteArray1273;
    static int anInt1274;
    private static byte[] aByteArray1275;
    static int anInt1276;
    static int anInt1277;

    static final void transformPolygon(GraphicsToolkit var_ha, NodeSub21 class348_sub21, Component274 class42) {
        if (class42.anIntArray591 != null) {
            int[] is = new int[class42.anIntArray591.length];
            for (int i = 0; i < is.length / 2; i++) {
                int i_0_ = (class42.anIntArray591[i * 2] + class348_sub21.anInt6852);
                int i_1_ = (class42.anIntArray591[i * 2 + 1] + class348_sub21.anInt6851);
                is[i * 2] = anInt1272 + ((anInt1276 - anInt1272) * (i_0_ - anInt1274) / (anInt1265 - anInt1274));
                is[i * 2 + 1] = anInt1268 - ((anInt1268 - anInt1262) * (i_1_ - anInt1257) / (anInt1277 - anInt1257));
            }
            Component68.method2620(var_ha, is, class42.anInt582);
            if (class42.anInt584 > 0) {
                for (int i = 0; i < is.length / 2 - 1; i++) {
                    int i_2_ = is[i * 2];
                    int i_3_ = is[i * 2 + 1];
                    int i_4_ = is[(i + 1) * 2];
                    int i_5_ = is[(i + 1) * 2 + 1];
                    if (i_4_ < i_2_) {
                        int i_6_ = i_2_;
                        int i_7_ = i_3_;
                        i_2_ = i_4_;
                        i_3_ = i_5_;
                        i_4_ = i_6_;
                        i_5_ = i_7_;
                    } else if (i_4_ == i_2_ && i_5_ < i_3_) {
                        int i_8_ = i_3_;
                        i_3_ = i_5_;
                        i_5_ = i_8_;
                    }
                    var_ha.method3674(i_2_, i_3_, i_4_, i_5_, (class42.anIntArray572[(class42.aByteArray564[i] & 0xff)]), 1, class42.anInt584, class42.anInt575, class42.anInt601);
                }
                int i = is[is.length - 2];
                int i_9_ = is[is.length - 1];
                int i_10_ = is[0];
                int i_11_ = is[1];
                if (i_10_ < i) {
                    int i_12_ = i;
                    int i_13_ = i_9_;
                    i = i_10_;
                    i_9_ = i_11_;
                    i_10_ = i_12_;
                    i_11_ = i_13_;
                } else if (i_10_ == i && i_11_ < i_9_) {
                    int i_14_ = i_9_;
                    i_9_ = i_11_;
                    i_11_ = i_14_;
                }
                var_ha.method3674(i, i_9_, i_10_, i_11_, (class42.anIntArray572[(class42.aByteArray564[(class42.aByteArray564.length - 1)]) & 0xff]), 1, class42.anInt584, class42.anInt575, class42.anInt601);
            } else {
                for (int i = 0; i < is.length / 2 - 1; i++)
                    var_ha.method3645(is[i * 2 + 1], is[i * 2], is[(i + 1) * 2], -8003, (class42.anIntArray572[(class42.aByteArray564[i] & 0xff)]), is[(i + 1) * 2 + 1]);
                var_ha.method3645(is[is.length - 1], is[is.length - 2], is[0], -8003, (class42.anIntArray572[(class42.aByteArray564[(class42.aByteArray564.length - 1)]) & 0xff]), is[1]);
            }
        }
    }

    public static void clearWorld() {
        aClass268_1239 = null;
        aClass183_1240 = null;
        aClass263_1245 = null;
        aClass153_1238 = null;
        aClass141_1242 = null;
        anInterface17_1244 = null;
        aClass348_Sub42_Sub14_1243 = null;
        aClass45_1237 = null;
        aClass356_1241 = null;
        aByteArrayArrayArray1251 = null;
        aShortArray1252 = null;
        aByteArray1248 = null;
        aClass252_1246 = null;
        aClass262_1254 = null;
        anIntArray1260 = null;
        aByteArray1273 = null;
        aByteArray1264 = null;
        aShortArray1270 = null;
        aByteArray1256 = null;
        aByteArray1275 = null;
        aShortArray1261 = null;
        aByteArray1258 = null;
        aClass356_1271 = null;
        aClass243ArrayArrayArray1269 = null;
    }

    private static final void transformNode(GraphicsToolkit var_ha, NodeSub21 class348_sub21, int i, int i_15_, int i_16_, int i_17_) {
        class348_sub21.anInt6853 = (anInt1272 + (i_16_ + i * (class348_sub21.anInt6852 - anInt1274) >> 16));
        class348_sub21.anInt6855 = (anInt1268 - (i_17_ + i_15_ * (class348_sub21.anInt6851 - anInt1257) >> 16));
    }

    static final void computeTransform(GraphicsToolkit var_ha) {
        int i = anInt1265 - anInt1274;
        int i_18_ = anInt1277 - anInt1257;
        int i_19_ = (anInt1276 - anInt1272 << 16) / i;
        int i_20_ = (anInt1268 - anInt1262 << 16) / i_18_;
        computeMinimap(var_ha, i_19_, i_20_, 0, 0);
    }

    static final void clearBuffers() {
        aByteArray1273 = null;
        aByteArray1264 = null;
        aShortArray1270 = null;
        aByteArray1256 = null;
        aByteArray1275 = null;
        aShortArray1261 = null;
        aByteArray1258 = null;
        aClass356_1271 = null;
        aClass243ArrayArrayArray1269 = null;
        anIntArray1260 = null;
    }

    private static final void readTileFlags(GraphicsToolkit var_ha, Buffer class348_sub49, int i, int i_21_, int i_22_, int i_23_, int[] is, int[] is_24_) {
        int i_25_ = class348_sub49.readUnsignedByte(255);
        if ((i_25_ & 0x1) == 0) {
            boolean bool = (i_25_ & 0x2) == 0;
            int i_26_ = i_25_ >> 2 & 0x3f;
            if (i_26_ != 62) {
                if (i_26_ == 63) i_26_ = class348_sub49.readUnsignedByte(255);
                else if (bool) i_26_ = is[i_26_];
                else i_26_ = is_24_[i_26_];
                if (bool) {
                    aByteArray1273[i_22_ + i_23_ * anInt1259] = (byte) i_26_;
                    aByteArray1256[i_22_ + i_23_ * anInt1259] = (byte) 0;
                } else {
                    aByteArray1256[i_22_ + i_23_ * anInt1259] = (byte) i_26_;
                    aByteArray1275[i_22_ + i_23_ * anInt1259] = (byte) 0;
                    aByteArray1273[i_22_ + i_23_ * anInt1259] = class348_sub49.readByte(-115);
                }
            }
        } else {
            int i_27_ = (i_25_ >> 1 & 0x3) + 1;
            boolean bool = (i_25_ & 0x8) != 0;
            boolean bool_28_ = (i_25_ & 0x10) != 0;
            for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
                int i_30_ = class348_sub49.readUnsignedByte(255);
                int i_31_ = 0;
                int i_32_ = 0;
                if (bool) {
                    i_31_ = class348_sub49.readUnsignedByte(255);
                    i_32_ = class348_sub49.readUnsignedByte(255);
                }
                int i_33_ = 0;
                if (bool_28_) i_33_ = class348_sub49.readUnsignedByte(255);
                if (i_29_ == 0) {
                    aByteArray1273[i_22_ + i_23_ * anInt1259] = (byte) i_30_;
                    aByteArray1256[i_22_ + i_23_ * anInt1259] = (byte) i_31_;
                    aByteArray1275[i_22_ + i_23_ * anInt1259] = (byte) i_32_;
                    if (i_33_ == 1) {
                        aShortArray1261[i_22_ + i_23_ * anInt1259] = (short) (class348_sub49.readUnsignedShort(842397944) + 1);
                        aByteArray1258[i_22_ + i_23_ * anInt1259] = class348_sub49.readByte(-122);
                    } else if (i_33_ > 1) {
                        aShortArray1261[i_22_ + i_23_ * anInt1259] = (short) -1;
                        short[] is_34_ = new short[i_33_];
                        byte[] is_35_ = new byte[i_33_];
                        for (int i_36_ = 0; i_36_ < i_33_; i_36_++) {
                            is_34_[i_36_] = (short) class348_sub49.readUnsignedShort(842397944);
                            is_35_[i_36_] = class348_sub49.readByte(-120);
                        }
                        aClass356_1271.put((byte) 33, i_22_ << 16 | i_23_, new NodeSub39(is_34_, is_35_));
                    }
                } else {
                    short[] is_37_ = null;
                    byte[] is_38_ = null;
                    if (i_33_ > 0) {
                        is_37_ = new short[i_33_];
                        is_38_ = new byte[i_33_];
                        for (int i_39_ = 0; i_39_ < i_33_; i_39_++) {
                            is_37_[i_39_] = (short) class348_sub49.readUnsignedShort(842397944);
                            is_38_[i_39_] = class348_sub49.readByte(-92);
                        }
                    }
                    if ((aClass243ArrayArrayArray1269[i_29_ - 1][i - (anInt1266 >> 6)][i_21_ - (anInt1263 >> 6)]) == null) aClass243ArrayArrayArray1269[i_29_ - 1][i - (anInt1266 >> 6)][i_21_ - (anInt1263 >> 6)] = new Component315();
                    RenderableSub8 class318_sub8 = new RenderableSub8(i_22_ & 0x3f, i_23_ & 0x3f, i_30_, i_31_, i_32_, is_37_, is_38_);
                    aClass243ArrayArrayArray1269[i_29_ - 1][i - (anInt1266 >> 6)][i_21_ - (anInt1263 >> 6)].method1869(-86, class318_sub8);
                }
            }
        }
    }

    static final void setWorldBounds(int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
        anInt1274 = i - anInt1266;
        anInt1277 = i_40_ - anInt1263;
        anInt1265 = i_41_ - anInt1266;
        anInt1257 = i_42_ - anInt1263;
        anInt1272 = i_43_;
        anInt1262 = i_44_;
        anInt1276 = i_45_;
        anInt1268 = i_46_;
    }

    static final void initWorld(CacheStore class45, DisplayModeManagerContainer259 class268, Component191 class183, ObjectDefinitionProvider class263, Component62 class153, Component258 class141, Interface17 interface17) {
        aClass45_1237 = class45;
        aClass268_1239 = class268;
        aClass183_1240 = class183;
        aClass263_1245 = class263;
        aClass153_1238 = class153;
        aClass141_1242 = class141;
        anInterface17_1244 = interface17;
        aClass356_1241.clear(0);
        int i = aClass45_1237.getGroupId("details", 0);
        int[] is = aClass45_1237.getFileIds(i, 0);
        if (is != null) {
            for (int i_47_ = 0; i_47_ < is.length; i_47_++) {
                HashNodeSub14 class348_sub42_sub14 = Component324.method1205(is[i_47_], true, aClass45_1237, i);
                aClass356_1241.put((byte) 25, class348_sub42_sub14.anInt9628, class348_sub42_sub14);
            }
        }
        Component54.method566(true, false, (byte) 11);
    }

    private static final void buildOverlay() {
        for (int i = 0; i < anInt1259; i++) {
            for (int i_48_ = 0; i_48_ < anInt1267; i_48_++) {
                int i_49_ = aShortArray1261[i + i_48_ * anInt1259] & 0xffff;
                if (i_49_ != 0) {
                    if (i_49_ == 65535) {
                        NodeSub39 class348_sub39 = ((NodeSub39) aClass356_1271.get(i << 16 | i_48_, -6008));
                        if (class348_sub39 != null) {
                            for (int i_50_ = 0; i_50_ < (class348_sub39.aShortArray7024).length; i_50_++) {
                                ObjectDefinition class51 = (aClass263_1245.getObjectDefinition(0, (class348_sub39.aShortArray7024[i_50_]) & 0xffff));
                                int i_51_ = class51.anInt921;
                                if (class51.anIntArray945 != null) {
                                    class51 = class51.getTransformedDefinition(anInterface17_1244, (byte) 47);
                                    if (class51 != null) i_51_ = class51.anInt921;
                                }
                                if (i_51_ != -1) {
                                    NodeSub21 class348_sub21 = new NodeSub21(i_51_);
                                    class348_sub21.anInt6852 = i;
                                    class348_sub21.anInt6851 = i_48_;
                                    aClass262_1254.addTail(class348_sub21, -20180);
                                }
                            }
                        }
                    } else {
                        ObjectDefinition class51 = aClass263_1245.getObjectDefinition(0, i_49_ - 1);
                        int i_52_ = class51.anInt921;
                        if (class51.anIntArray945 != null) {
                            class51 = class51.getTransformedDefinition(anInterface17_1244, (byte) 47);
                            if (class51 != null) i_52_ = class51.anInt921;
                        }
                        if (i_52_ != -1) {
                            NodeSub21 class348_sub21 = new NodeSub21(i_52_);
                            class348_sub21.anInt6852 = i;
                            class348_sub21.anInt6851 = i_48_;
                            aClass262_1254.addTail(class348_sub21, -20180);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int i_53_ = 0; i_53_ < aClass243ArrayArrayArray1269[0].length; i_53_++) {
                for (int i_54_ = 0; i_54_ < aClass243ArrayArrayArray1269[0][0].length; i_54_++) {
                    Component315 class243 = aClass243ArrayArrayArray1269[i][i_53_][i_54_];
                    if (class243 != null) {
                        for (RenderableSub8 class318_sub8 = (RenderableSub8) class243.method1872(8); class318_sub8 != null; class318_sub8 = ((RenderableSub8) class243.method1878((byte) 127))) {
                            if (class318_sub8.aShortArray6461 != null) {
                                for (int i_55_ = 0; i_55_ < (class318_sub8.aShortArray6461).length; i_55_++) {
                                    ObjectDefinition class51 = (aClass263_1245.getObjectDefinition(0, (class318_sub8.aShortArray6461[i_55_]) & 0xffff));
                                    int i_56_ = class51.anInt921;
                                    if (class51.anIntArray945 != null) {
                                        class51 = (class51.getTransformedDefinition(anInterface17_1244, (byte) 47));
                                        if (class51 != null) i_56_ = class51.anInt921;
                                    }
                                    if (i_56_ != -1) {
                                        NodeSub21 class348_sub21 = new NodeSub21(i_56_);
                                        class348_sub21.anInt6852 = ((i_53_ + (anInt1266 >> 6)) * 64 + class318_sub8.aByte6466 - anInt1266);
                                        class348_sub21.anInt6851 = ((i_54_ + (anInt1263 >> 6)) * 64 + class318_sub8.aByte6464 - anInt1263);
                                        aClass262_1254.addTail(class348_sub21, -20180);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static final void selectArea(int i) {
        aClass348_Sub42_Sub14_1243 = (HashNodeSub14) aClass356_1241.get(i, -6008);
    }

    private static final void drawMinimapTile(GraphicsToolkit var_ha, int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, short[] is, byte[] is_63_, boolean bool) {
        if (bool || i_60_ != 0 || i_61_ > 0) {
            if (i_61_ == 0) var_ha.fillRect2D(i, i_57_, i_58_, i_59_, i_60_, 0);
            else {
                int i_64_ = i_62_ & 0x3f;
                if (i_64_ == 0 || i_58_ <= 1 || i_59_ <= 1) {
                    int i_65_ = anIntArray1260[i_61_];
                    if (bool || i_65_ != 0) var_ha.fillRect2D(i, i_57_, i_58_, i_59_, i_65_, 0);
                } else {
                    int i_66_ = bool ? 0 : 1;
                    DisplayModeManagerContainer57.method424(anIntArray1260[i_61_], i_60_, var_ha, 0, i_66_, anInt1255, i_62_ >> 6 & 0x3, aByteArrayArrayArray1251, i_58_, i, i_64_, i_59_, i_57_);
                }
            }
        }
        if (is != null) {
            int i_67_;
            if (i_58_ == 1) i_67_ = i;
            else i_67_ = i + i_58_ - 1;
            int i_68_;
            if (i_59_ == 1) i_68_ = i_57_;
            else i_68_ = i_57_ + i_59_ - 1;
            for (int i_69_ = 0; i_69_ < is.length; i_69_++) {
                int i_70_ = is_63_[i_69_] & 0x3f;
                if (i_70_ == 0 || i_70_ == 2 || i_70_ == 3 || i_70_ == 9) {
                    ObjectDefinition class51 = aClass263_1245.getObjectDefinition(0, is[i_69_] & 0xffff);
                    if (class51.anInt875 == -1) {
                        int i_71_ = -3355444;
                        if (class51.anInt874 == 1) i_71_ = -3407872;
                        int i_72_ = is_63_[i_69_] >> 6 & 0x3;
                        if (i_70_ == 0) {
                            if (i_72_ == 0) var_ha.P(i, i_57_, i_59_, i_71_, 0);
                            else if (i_72_ == 1) var_ha.U(i, i_57_, i_58_, i_71_, 0);
                            else if (i_72_ == 2) var_ha.P(i_67_, i_57_, i_59_, i_71_, 0);
                            else var_ha.U(i, i_68_, i_58_, i_71_, 0);
                        } else if (i_70_ == 2) {
                            if (i_72_ == 0) {
                                var_ha.P(i, i_57_, i_59_, -1, 0);
                                var_ha.U(i, i_57_, i_58_, i_71_, 0);
                            } else if (i_72_ == 1) {
                                var_ha.P(i_67_, i_57_, i_59_, -1, 0);
                                var_ha.U(i, i_57_, i_58_, i_71_, 0);
                            } else if (i_72_ == 2) {
                                var_ha.P(i_67_, i_57_, i_59_, -1, 0);
                                var_ha.U(i, i_68_, i_58_, i_71_, 0);
                            } else {
                                var_ha.P(i, i_57_, i_59_, -1, 0);
                                var_ha.U(i, i_68_, i_58_, i_71_, 0);
                            }
                        } else if (i_70_ == 3) {
                            if (i_72_ == 0) var_ha.U(i, i_57_, 1, i_71_, 0);
                            else if (i_72_ == 1) var_ha.U(i_67_, i_57_, 1, i_71_, 0);
                            else if (i_72_ == 2) var_ha.U(i_67_, i_68_, 1, i_71_, 0);
                            else var_ha.U(i, i_68_, 1, i_71_, 0);
                        } else if (i_70_ == 9) {
                            if (i_72_ == 0 || i_72_ == 2) {
                                for (int i_73_ = 0; i_73_ < i_59_; i_73_++)
                                    var_ha.U(i + i_73_, i_68_ - i_73_, 1, i_71_, 0);
                            } else {
                                for (int i_74_ = 0; i_74_ < i_59_; i_74_++)
                                    var_ha.U(i + i_74_, i_57_ + i_74_, 1, i_71_, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    static final void loadArea(GraphicsToolkit var_ha, int i, int i_75_) {
        Buffer class348_sub49 = (new Buffer(aClass45_1237.getFile((aClass348_Sub42_Sub14_1243.aString9625), "area", -29832)));
        int i_76_ = class348_sub49.readUnsignedByte(255);
        int[] is = new int[i_76_];
        for (int i_77_ = 0; i_77_ < i_76_; i_77_++)
            is[i_77_] = class348_sub49.readUnsignedByte(255);
        int i_78_ = class348_sub49.readUnsignedByte(255);
        int[] is_79_ = new int[i_78_];
        for (int i_80_ = 0; i_80_ < i_78_; i_80_++)
            is_79_[i_80_] = class348_sub49.readUnsignedByte(255);
        while (class348_sub49.offset < class348_sub49.payload.length) {
            if (class348_sub49.readUnsignedByte(255) == 0) {
                int i_81_ = class348_sub49.readUnsignedByte(255);
                int i_82_ = class348_sub49.readUnsignedByte(255);
                for (int i_83_ = 0; i_83_ < 64; i_83_++) {
                    for (int i_84_ = 0; i_84_ < 64; i_84_++) {
                        int i_85_ = i_81_ * 64 + i_83_ - anInt1266;
                        int i_86_ = i_82_ * 64 + i_84_ - anInt1263;
                        readTileFlags(var_ha, class348_sub49, i_81_, i_82_, i_85_, i_86_, is, is_79_);
                    }
                }
            } else {
                int i_87_ = class348_sub49.readUnsignedByte(255);
                int i_88_ = class348_sub49.readUnsignedByte(255);
                int i_89_ = class348_sub49.readUnsignedByte(255);
                int i_90_ = class348_sub49.readUnsignedByte(255);
                for (int i_91_ = 0; i_91_ < 8; i_91_++) {
                    for (int i_92_ = 0; i_92_ < 8; i_92_++) {
                        int i_93_ = i_87_ * 64 + i_89_ * 8 + i_91_ - anInt1266;
                        int i_94_ = i_88_ * 64 + i_90_ * 8 + i_92_ - anInt1263;
                        readTileFlags(var_ha, class348_sub49, i_87_, i_88_, i_93_, i_94_, is, is_79_);
                    }
                }
            }
        }
        Object object = null;
        aByteArray1264 = new byte[anInt1259 * anInt1267];
        aShortArray1270 = new short[anInt1259 * anInt1267];
        for (int i_95_ = 0; i_95_ < 3; i_95_++) {
            byte[] is_96_ = new byte[anInt1259 * anInt1267];
            for (int i_97_ = 0; i_97_ < aClass243ArrayArrayArray1269[i_95_].length; i_97_++) {
                for (int i_98_ = 0; i_98_ < aClass243ArrayArrayArray1269[i_95_][0].length; i_98_++) {
                    Component315 class243 = aClass243ArrayArrayArray1269[i_95_][i_97_][i_98_];
                    if (class243 != null) {
                        for (RenderableSub8 class318_sub8 = (RenderableSub8) class243.method1872(8); class318_sub8 != null; class318_sub8 = ((RenderableSub8) class243.method1878((byte) 1)))
                            is_96_[(i_97_ * 64 + class318_sub8.aByte6466 + (i_98_ * 64 + (class318_sub8.aByte6464)) * anInt1259)] = (byte) (class318_sub8.anInt6465);
                    }
                }
            }
            interpolateTiles(is_96_, aByteArray1264, aShortArray1270, i, i_75_);
            for (int i_99_ = 0; i_99_ < aClass243ArrayArrayArray1269[i_95_].length; i_99_++) {
                for (int i_100_ = 0; i_100_ < aClass243ArrayArrayArray1269[i_95_][0].length; i_100_++) {
                    Component315 class243 = aClass243ArrayArrayArray1269[i_95_][i_99_][i_100_];
                    if (class243 != null) {
                        for (RenderableSub8 class318_sub8 = (RenderableSub8) class243.method1872(8); class318_sub8 != null; class318_sub8 = ((RenderableSub8) class243.method1878((byte) 122))) {
                            int i_101_ = (i_99_ * 64 + class318_sub8.aByte6466 + (i_100_ * 64 + (class318_sub8.aByte6464)) * anInt1259);
                            class318_sub8.anInt6465 = ((aByteArray1264[i_101_] & 0xff) << 16 | aShortArray1270[i_101_] & 0xffff);
                            if (class318_sub8.anInt6465 != 0) class318_sub8.anInt6465 |= ~0xffffff;
                        }
                    }
                }
            }
        }
        interpolateTiles(aByteArray1273, aByteArray1264, aShortArray1270, i, i_75_);
        aByteArray1273 = null;
        buildOverlay();
    }

    static final HashNodeSub14 getArea(int i) {
        return ((HashNodeSub14) aClass356_1241.get(i, -6008));
    }

    static final NodeList getRenderList(GraphicsToolkit var_ha) {
        int i = anInt1265 - anInt1274;
        int i_102_ = anInt1277 - anInt1257;
        int i_103_ = (anInt1276 - anInt1272 << 16) / i;
        int i_104_ = (anInt1268 - anInt1262 << 16) / i_102_;
        return getTransformedNodes(var_ha, i_103_, i_104_, 0, 0);
    }

    private static final int getModelCount(d var_d, int i, int i_105_, int i_106_) {
        Component11 class277 = aClass268_1239.method2034(i, false);
        if (class277 == null) return 0;
        int i_107_ = class277.anInt3575;
        if (i_107_ >= 0 && var_d.getModel(i_107_, -6662).aBoolean209) i_107_ = -1;
        int i_108_;
        if (class277.anInt3569 >= 0) {
            int i_109_ = class277.anInt3569;
            int i_110_ = (i_109_ & 0x7f) + i_106_;
            if (i_110_ < 0) i_110_ = 0;
            else if (i_110_ > 127) i_110_ = 127;
            int i_111_ = (i_109_ + i_105_ & 0xfc00) + (i_109_ & 0x380) + i_110_;
            i_108_ = ~0xffffff | (Component380.anIntArray4983[Component361.method303(Component243.method353(96, -119, i_111_), 30) & 0xffff]);
        } else if (i_107_ >= 0) i_108_ = (~0xffffff | (Component380.anIntArray4983[(Component361.method303(Component243.method353(96, -85, (var_d.getModel(i_107_, -6662).aShort208)), 30)) & 0xffff]));
        else if (class277.anInt3563 == -1) i_108_ = 0;
        else {
            int i_112_ = class277.anInt3563;
            int i_113_ = (i_112_ & 0x7f) + i_106_;
            if (i_113_ < 0) i_113_ = 0;
            else if (i_113_ > 127) i_113_ = 127;
            int i_114_ = (i_112_ + i_105_ & 0xfc00) + (i_112_ & 0x380) + i_113_;
            i_108_ = ~0xffffff | (Component380.anIntArray4983[Component361.method303(Component243.method353(96, -80, i_114_), 30) & 0xffff]);
        }
        return i_108_;
    }

    static final void allocateTileBuffers() {
        aByteArray1273 = new byte[anInt1259 * anInt1267];
        aByteArray1256 = new byte[anInt1259 * anInt1267];
        aByteArray1275 = new byte[anInt1259 * anInt1267];
        aShortArray1261 = new short[anInt1259 * anInt1267];
        aByteArray1258 = new byte[anInt1259 * anInt1267];
        aClass356_1271 = new LruCache(1024);
        aClass243ArrayArrayArray1269 = new Component315[3][anInt1259 >> 6][anInt1267 >> 6];
        anIntArray1260 = new int[aClass268_1239.anInt3429 + 1];
    }

    static final void processOverlay() {
        int[] is = new int[3];
        for (int i = 0; i < aClass252_1246.anInt3241; i++) {
            boolean bool = (aClass348_Sub42_Sub14_1243.method3236(is, (aClass252_1246.anIntArray3238[i] >> 14 & 0x3fff), aClass252_1246.anIntArray3238[i] & 0x3fff, aClass252_1246.anIntArray3238[i] >> 28 & 0x3, (byte) -28));
            if (bool) {
                NodeSub21 class348_sub21 = new NodeSub21(aClass252_1246.anIntArray3239[i]);
                class348_sub21.anInt6852 = is[1] - anInt1266;
                class348_sub21.anInt6851 = is[2] - anInt1263;
                aClass262_1254.addTail(class348_sub21, -20180);
            }
        }
    }

    private static final NodeList getTransformedNodes(GraphicsToolkit var_ha, int i, int i_115_, int i_116_, int i_117_) {
        for (NodeSub21 class348_sub21 = (NodeSub21) aClass262_1254.first(4); class348_sub21 != null; class348_sub21 = (NodeSub21) aClass262_1254.next((byte) 74))
            transformNode(var_ha, class348_sub21, i, i_115_, i_116_, i_117_);
        return aClass262_1254;
    }

    private static final void drawLabels(GraphicsToolkit var_ha, int i, int i_118_, int i_119_, int i_120_, short[] is, byte[] is_121_) {
        if (is != null) {
            for (int i_122_ = 0; i_122_ < is.length; i_122_++) {
                ObjectDefinition class51 = aClass263_1245.getObjectDefinition(0, is[i_122_] & 0xffff);
                int i_123_ = class51.anInt875;
                if (i_123_ != -1) {
                    SceneManager class218 = aClass141_1242.method1173((byte) 31, i_123_);
                    Component24 class105 = class218.method1596((class51.aBoolean912 ? is_121_[i_122_] >> 6 & 0x3 : 0), (class51.aBoolean925 && (class51.aBoolean902)), 125, var_ha);
                    if (class105 != null) {
                        int i_124_ = i_119_ * class105.method966() >> 2;
                        int i_125_ = i_120_ * class105.method980() >> 2;
                        if (class218.aBoolean2854) {
                            int i_126_ = class51.anInt961;
                            int i_127_ = class51.anInt926;
                            if ((is_121_[i_122_] >> 6 & 0x1) == 1) {
                                int i_128_ = i_126_;
                                i_126_ = i_127_;
                                i_127_ = i_128_;
                            }
                            i_124_ = i_126_ * i_119_;
                            i_125_ = i_127_ * i_120_;
                        }
                        if (i_124_ != 0 && i_125_ != 0) {
                            if (class218.anInt2856 != 0) class105.method970(i, i_118_ - i_125_ + i_120_, i_124_, i_125_, 0, (~0xffffff | (class218.anInt2856)), 1);
                            else class105.method973(i, i_118_ - i_125_ + i_120_, i_124_, i_125_);
                        }
                    }
                }
            }
        }
    }

    static final void buildModelCounts(d var_d, int i, int i_129_) {
        for (int i_130_ = 0; i_130_ < aClass268_1239.anInt3429; i_130_++)
            anIntArray1260[i_130_ + 1] = getModelCount(var_d, i_130_, i, i_129_);
    }

    private static final void computeMinimap(GraphicsToolkit var_ha, int i, int i_131_, int i_132_, int i_133_) {
        int i_134_ = anInt1265 - anInt1274;
        int i_135_ = anInt1277 - anInt1257;
        if (anInt1265 < anInt1259) i_134_++;
        if (anInt1277 < anInt1267) i_135_++;
        for (int i_136_ = 0; i_136_ < i_134_; i_136_++) {
            int i_137_ = (i_132_ + i * i_136_ >> 16) + anInt1272;
            int i_138_ = (i_132_ + i * (i_136_ + 1) >> 16) + anInt1272;
            int i_139_ = i_138_ - i_137_;
            if (i_139_ > 0) {
                int i_140_ = anInt1274 + i_136_;
                if (i_140_ >= 0 && i_140_ < anInt1259) {
                    for (int i_146_ = 0; i_146_ < i_135_; i_146_++) {
                        int i_147_ = (anInt1268 - (i_133_ + i_131_ * (i_146_ + 1) >> 16));
                        int i_148_ = anInt1268 - (i_133_ + i_131_ * i_146_ >> 16);
                        int i_149_ = i_148_ - i_147_;
                        if (i_149_ > 0) {
                            int i_150_ = i_146_ + anInt1257;
                            int i_151_ = i_140_ + i_150_ * anInt1259;
                            int i_152_ = 0;
                            int i_153_ = 0;
                            int i_154_ = 0;
                            if (i_150_ >= 0 && i_150_ < anInt1267) {
                                i_152_ = ((aByteArray1264[i_151_] & 0xff) << 16 | aShortArray1270[i_151_] & 0xffff);
                                if (i_152_ != 0) i_152_ |= ~0xffffff;
                                i_153_ = aByteArray1256[i_151_] & 0xff;
                                i_154_ = aShortArray1261[i_151_] & 0xffff;
                            }
                            if (i_152_ == 0 && i_153_ == 0 && i_154_ == 0) {
                                if (aClass348_Sub42_Sub14_1243.anInt9634 != -1) i_152_ = (~0xffffff | (aClass348_Sub42_Sub14_1243.anInt9634));
                                else if ((i_136_ + anInt1274 & 0x4) != (i_146_ + anInt1277 & 0x4)) i_152_ = -11840664;
                                else i_152_ = (anIntArray1260[(aClass268_1239.anInt3447) + 1]);
                                if (i_152_ == 0) i_152_ = -16777216;
                                var_ha.fillRect2D(i_137_, i_147_, i_139_, i_149_, i_152_, 0);
                            } else if (i_154_ > 0) {
                                if (i_154_ == 65535) {
                                    NodeSub39 class348_sub39 = ((NodeSub39) (aClass356_1271.get(i_140_ << 16 | i_150_, -6008)));
                                    if (class348_sub39 != null) drawMinimapTile(var_ha, i_137_, i_147_, i_139_, i_149_, i_152_, i_153_, aByteArray1275[i_151_], (class348_sub39.aShortArray7024), (class348_sub39.aByteArray7025), true);
                                } else {
                                    aShortArray1252[0] = (short) (i_154_ - 1);
                                    aByteArray1248[0] = aByteArray1258[i_151_];
                                    drawMinimapTile(var_ha, i_137_, i_147_, i_139_, i_149_, i_152_, i_153_, aByteArray1275[i_151_], aShortArray1252, aByteArray1248, true);
                                }
                            } else drawMinimapTile(var_ha, i_137_, i_147_, i_139_, i_149_, i_152_, i_153_, aByteArray1275[i_151_], null, null, true);
                        }
                    }
                } else {
                    for (int i_141_ = 0; i_141_ < i_135_; i_141_++) {
                        int i_142_ = (anInt1268 - (i_133_ + i_131_ * (i_141_ + 1) >> 16));
                        int i_143_ = anInt1268 - (i_133_ + i_131_ * i_141_ >> 16);
                        int i_144_ = i_143_ - i_142_;
                        int i_145_;
                        if (aClass348_Sub42_Sub14_1243.anInt9634 != -1) i_145_ = ~0xffffff | (aClass348_Sub42_Sub14_1243.anInt9634);
                        else if ((i_136_ + anInt1274 & 0x4) != (i_141_ + anInt1277 & 0x4)) i_145_ = -11840664;
                        else i_145_ = anIntArray1260[(aClass268_1239.anInt3447) + 1];
                        if (i_145_ == 0) i_145_ = -16777216;
                        var_ha.fillRect2D(i_137_, i_142_, i_139_, i_144_, i_145_, 0);
                    }
                }
            }
        }
        for (int i_155_ = -16; i_155_ < i_134_ + 16; i_155_++) {
            int i_156_ = (i_132_ + i * i_155_ >> 16) + anInt1272;
            int i_157_ = (i_132_ + i * (i_155_ + 1) >> 16) + anInt1272;
            int i_158_ = i_157_ - i_156_;
            if (i_158_ > 0) {
                int i_159_ = i_155_ + anInt1274;
                if (i_159_ >= 0 && i_159_ < anInt1259) {
                    for (int i_160_ = -16; i_160_ < i_135_ + 16; i_160_++) {
                        int i_161_ = (anInt1268 - (i_133_ + i_131_ * (i_160_ + 1) >> 16));
                        int i_162_ = anInt1268 - (i_133_ + i_131_ * i_160_ >> 16);
                        int i_163_ = i_162_ - i_161_;
                        if (i_163_ > 0) {
                            int i_164_ = i_160_ + anInt1257;
                            if (i_164_ >= 0 && i_164_ < anInt1267) {
                                int i_165_ = ((aShortArray1261[i_159_ + i_164_ * anInt1259]) & 0xffff);
                                if (i_165_ > 0) {
                                    if (i_165_ == 65535) {
                                        NodeSub39 class348_sub39 = ((NodeSub39) (aClass356_1271.get(i_159_ << 16 | i_164_, -6008)));
                                        if (class348_sub39 != null) drawLabels(var_ha, i_156_, i_161_, i_158_, i_163_, (class348_sub39.aShortArray7024), (class348_sub39.aByteArray7025));
                                    } else {
                                        aShortArray1252[0] = (short) (i_165_ - 1);
                                        aByteArray1248[0] = (aByteArray1258[i_159_ + i_164_ * anInt1259]);
                                        drawLabels(var_ha, i_156_, i_161_, i_158_, i_163_, aShortArray1252, aByteArray1248);
                                    }
                                } else drawLabels(var_ha, i_156_, i_161_, i_158_, i_163_, null, null);
                            }
                        }
                    }
                }
            }
        }
        int i_166_ = anInt1274 >> 6;
        int i_167_ = anInt1257 >> 6;
        if (i_166_ < 0) i_166_ = 0;
        if (i_167_ < 0) i_167_ = 0;
        int i_168_ = anInt1265 >> 6;
        int i_169_ = anInt1277 >> 6;
        if (i_168_ >= aClass243ArrayArrayArray1269[0].length) i_168_ = aClass243ArrayArrayArray1269[0].length - 1;
        if (i_169_ >= aClass243ArrayArrayArray1269[0][0].length) i_169_ = aClass243ArrayArrayArray1269[0][0].length - 1;
        for (int i_170_ = 0; i_170_ < 3; i_170_++) {
            for (int i_171_ = i_166_; i_171_ <= i_168_; i_171_++) {
                for (int i_172_ = i_167_; i_172_ <= i_169_; i_172_++) {
                    Component315 class243 = aClass243ArrayArrayArray1269[i_170_][i_171_][i_172_];
                    if (class243 != null) {
                        int i_173_ = (i_171_ + (anInt1266 >> 6)) * 64;
                        int i_174_ = (i_172_ + (anInt1263 >> 6)) * 64;
                        for (RenderableSub8 class318_sub8 = (RenderableSub8) class243.method1872(8); class318_sub8 != null; class318_sub8 = ((RenderableSub8) class243.method1878((byte) -79))) {
                            int i_175_ = (i_173_ + class318_sub8.aByte6466 - anInt1266 - anInt1274);
                            int i_176_ = (i_174_ + class318_sub8.aByte6464 - anInt1263 - anInt1257);
                            int i_177_ = (i_132_ + i * i_175_ >> 16) + anInt1272;
                            int i_178_ = ((i_132_ + i * (i_175_ + 1) >> 16) + anInt1272);
                            int i_179_ = (anInt1268 - (i_133_ + i_131_ * (i_176_ + 1) >> 16));
                            int i_180_ = anInt1268 - (i_133_ + i_131_ * i_176_ >> 16);
                            drawMinimapTile(var_ha, i_177_, i_179_, i_178_ - i_177_, i_180_ - i_179_, (class318_sub8.anInt6465), (class318_sub8.aByte6460) & 0xff, (class318_sub8.aByte6463), (class318_sub8.aShortArray6461), (class318_sub8.aByteArray6462), false);
                        }
                    }
                }
            }
            for (int i_181_ = i_166_; i_181_ <= i_168_; i_181_++) {
                for (int i_182_ = i_167_; i_182_ <= i_169_; i_182_++) {
                    Component315 class243 = aClass243ArrayArrayArray1269[i_170_][i_181_][i_182_];
                    if (class243 != null) {
                        int i_183_ = (i_181_ + (anInt1266 >> 6)) * 64;
                        int i_184_ = (i_182_ + (anInt1263 >> 6)) * 64;
                        for (RenderableSub8 class318_sub8 = (RenderableSub8) class243.method1872(8); class318_sub8 != null; class318_sub8 = ((RenderableSub8) class243.method1878((byte) -75))) {
                            int i_185_ = (i_183_ + class318_sub8.aByte6466 - anInt1266 - anInt1274);
                            int i_186_ = (i_184_ + class318_sub8.aByte6464 - anInt1263 - anInt1257);
                            int i_187_ = (i_132_ + i * i_185_ >> 16) + anInt1272;
                            int i_188_ = ((i_132_ + i * (i_185_ + 1) >> 16) + anInt1272);
                            int i_189_ = (anInt1268 - (i_133_ + i_131_ * (i_186_ + 1) >> 16));
                            int i_190_ = anInt1268 - (i_133_ + i_131_ * i_186_ >> 16);
                            drawLabels(var_ha, i_187_, i_189_, i_188_ - i_187_, i_190_ - i_189_, (class318_sub8.aShortArray6461), (class318_sub8.aByteArray6462));
                        }
                    }
                }
            }
        }
    }

    static final HashNodeSub14 findAreaAt(int i, int i_191_) {
        for (HashNodeSub14 class348_sub42_sub14 = (HashNodeSub14) aClass356_1241.first(0); class348_sub42_sub14 != null; class348_sub42_sub14 = (HashNodeSub14) aClass356_1241.next(0)) {
            if (class348_sub42_sub14.aBoolean9639 && class348_sub42_sub14.method3238((byte) -120, i, i_191_)) return class348_sub42_sub14;
        }
        return null;
    }

    static final HashTable findAreasInRange(int i, int i_192_) {
        HashTable class107 = new HashTable();
        for (HashNodeSub14 class348_sub42_sub14 = (HashNodeSub14) aClass356_1241.first(0); class348_sub42_sub14 != null; class348_sub42_sub14 = (HashNodeSub14) aClass356_1241.next(0)) {
            if (class348_sub42_sub14.aBoolean9639 && class348_sub42_sub14.method3238((byte) 29, i, i_192_)) class107.add(true, class348_sub42_sub14);
        }
        return class107;
    }

    private static final void interpolateTiles(byte[] is, byte[] is_193_, short[] is_194_, int i, int i_195_) {
        int[] is_196_ = new int[anInt1267];
        int[] is_197_ = new int[anInt1267];
        int[] is_198_ = new int[anInt1267];
        int[] is_199_ = new int[anInt1267];
        int[] is_200_ = new int[anInt1267];
        for (int i_201_ = -5; i_201_ < anInt1259; i_201_++) {
            int i_202_ = i_201_ + 5;
            int i_203_ = i_201_ - 5;
            for (int i_204_ = 0; i_204_ < anInt1267; i_204_++) {
                if (i_202_ < anInt1259) {
                    int i_205_ = is[i_202_ + i_204_ * anInt1259] & 0xff;
                    if (i_205_ > 0) {
                        Component231 class22 = aClass183_1240.method1380(true, i_205_ - 1);
                        is_196_[i_204_] += class22.anInt341;
                        is_197_[i_204_] += class22.anInt332;
                        is_198_[i_204_] += class22.anInt335;
                        is_199_[i_204_] += class22.anInt343;
                        is_200_[i_204_]++;
                    }
                }
                if (i_203_ >= 0) {
                    int i_206_ = is[i_203_ + i_204_ * anInt1259] & 0xff;
                    if (i_206_ > 0) {
                        Component231 class22 = aClass183_1240.method1380(true, i_206_ - 1);
                        is_196_[i_204_] -= class22.anInt341;
                        is_197_[i_204_] -= class22.anInt332;
                        is_198_[i_204_] -= class22.anInt335;
                        is_199_[i_204_] -= class22.anInt343;
                        is_200_[i_204_]--;
                    }
                }
            }
            if (i_201_ >= 0) {
                int i_207_ = 0;
                int i_208_ = 0;
                int i_209_ = 0;
                int i_210_ = 0;
                int i_211_ = 0;
                for (int i_212_ = -5; i_212_ < anInt1267; i_212_++) {
                    int i_213_ = i_212_ + 5;
                    if (i_213_ < anInt1267) {
                        i_207_ += is_196_[i_213_];
                        i_208_ += is_197_[i_213_];
                        i_209_ += is_198_[i_213_];
                        i_210_ += is_199_[i_213_];
                        i_211_ += is_200_[i_213_];
                    }
                    int i_214_ = i_212_ - 5;
                    if (i_214_ >= 0) {
                        i_207_ -= is_196_[i_214_];
                        i_208_ -= is_197_[i_214_];
                        i_209_ -= is_198_[i_214_];
                        i_210_ -= is_199_[i_214_];
                        i_211_ -= is_200_[i_214_];
                    }
                    if (i_212_ >= 0 && i_211_ > 0) {
                        if ((is[i_201_ + i_212_ * anInt1259] & 0xff) == 0) {
                            int i_215_ = i_201_ + i_212_ * anInt1259;
                            is_193_[i_215_] = (byte) 0;
                            is_194_[i_215_] = (short) 0;
                        } else {
                            int i_216_ = (i_210_ == 0 ? 0 : VideoAdDisplay.method1890(i_209_ / i_211_, (byte) 76, i_208_ / i_211_, (i_207_ * 256 / i_210_)));
                            int i_217_ = (i_216_ & 0x7f) + i_195_;
                            if (i_217_ < 0) i_217_ = 0;
                            else if (i_217_ > 127) i_217_ = 127;
                            int i_218_ = ((i_216_ + i & 0xfc00) + (i_216_ & 0x380) + i_217_);
                            int i_219_ = i_201_ + i_212_ * anInt1259;
                            int i_220_ = (Component380.anIntArray4983[(Component361.method303(Component182.method3401(i_218_, 96, (byte) 76), 30)) & 0xffff]);
                            is_193_[i_219_] = (byte) (i_220_ >> 16 & 0xff);
                            is_194_[i_219_] = (short) (i_220_ & 0xffff);
                        }
                    }
                }
            }
        }
    }

    static {
        aShortArray1252 = new short[1];
        anInt1250 = (int) (Math.random() * 11.0) - 5;
        aByteArray1248 = new byte[1];
        aClass262_1254 = new NodeList();
    }
}
