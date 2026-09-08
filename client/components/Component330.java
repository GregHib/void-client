/* Component330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component330
/**
 * RENAMED from `Class90` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static Component224 aClass273_1512 = new Component224("", 15);
    static int anInt1513;
    static int anInt1514;
    static int anInt1515;
    static long aLong1516;
    static int regionTileY;
    static int[] anIntArray1518 = new int[14];

    public static void method852(int i) {
        aClass273_1512 = null;
        if (i != 6) aLong1516 = 20L;
        anIntArray1518 = null;
    }

    static final void method853(byte i) {
        anInt1515++;
        int i_0_ = Component80.packetBuffer.readUnsignedByte(255);
        int i_1_ = Component80.packetBuffer.readShortAddLittle(-121);
        boolean bool = Component80.packetBuffer.readUnsignedByte(i + 156) == 1;
        int i_2_ = Component80.packetBuffer.readShortAdd(i + -172);
        Component37.anInt3931 = Component80.packetBuffer.readByteAdd((byte) -112);
        ImageCacheStore.method2554((byte) -45);
        DefinitionSub22.method3111(125, i_0_);
        Component80.packetBuffer.startBitAccess(-122);
        for (int i_3_ = 0; i_3_ < 4; i_3_++) {
            for (int i_4_ = 0; (AbstractShaderSub4.anInt7319 >> 3 > i_4_); i_4_++) {
                for (int i_5_ = 0; (i_5_ < ParametricDefinition.anInt9109 >> 3); i_5_++) {
                    int i_6_ = Component80.packetBuffer.readBits((byte) -24, 1);
                    if (i_6_ != 1) Component240.anIntArrayArrayArray1116[i_3_][i_4_][i_5_] = -1;
                    else Component240.anIntArrayArrayArray1116[i_3_][i_4_][i_5_] = Component80.packetBuffer.readBits((byte) -24, 26);
                }
            }
        }
        Component80.packetBuffer.stopBitAccess(false);
        int i_7_ = (-Component80.packetBuffer.offset + DefinitionSub25.anInt9341) / 16;
        Component31.anIntArrayArray5894 = new int[i_7_][4];
        int i_8_ = 0;
        if (i != 99) method852(-55);
        for (/**/; i_8_ < i_7_; i_8_++) {
            for (int i_9_ = 0; i_9_ < 4; i_9_++)
                Component31.anIntArrayArray5894[i_8_][i_9_] = Component80.packetBuffer.readInt((byte) -126);
        }
        ImageCacheStore.anIntArray4031 = null;
        Applet_Sub1.anIntArray38 = new int[i_7_];
        r.anIntArray9724 = new int[i_7_];
        ShaderSub1.anIntArray5192 = new int[i_7_];
        OggStreamReader.anIntArray9042 = new int[i_7_];
        DisplayModeManagerContainer61.anIntArray3759 = new int[i_7_];
        NodeSub50.aByteArrayArray7212 = null;
        OggUrlStream.aByteArrayArray8996 = new byte[i_7_][];
        Component30.aByteArrayArray1887 = new byte[i_7_][];
        WorldNameText.aByteArrayArray8642 = new byte[i_7_][];
        DisplayModeManagerContainer322.aByteArrayArray4281 = new byte[i_7_][];
        i_7_ = 0;
        for (int i_10_ = 0; i_10_ < 4; i_10_++) {
            for (int i_11_ = 0; (AbstractShaderSub4.anInt7319 >> 3 > i_11_); i_11_++) {
                for (int i_12_ = 0; i_12_ < ParametricDefinition.anInt9109 >> 3; i_12_++) {
                    int i_13_ = (Component240.anIntArrayArrayArray1116[i_10_][i_11_][i_12_]);
                    if (i_13_ != -1) {
                        int i_14_ = i_13_ >> 14 & 0x3ff;
                        int i_15_ = (i_13_ & 0x3ff9) >> 3;
                        int i_16_ = i_15_ / 8 + (i_14_ / 8 << 8);
                        for (int i_17_ = 0; i_7_ > i_17_; i_17_++) {
                            if (i_16_ == OggStreamReader.anIntArray9042[i_17_]) {
                                i_16_ = -1;
                                break;
                            }
                        }
                        if (i_16_ != -1) {
                            OggStreamReader.anIntArray9042[i_7_] = i_16_;
                            int i_18_ = 0xff & i_16_ >> 8;
                            int i_19_ = 0xff & i_16_;
                            ShaderSub1.anIntArray5192[i_7_] = (SoftwareFallbackShader.aClass45_7382.getGroupId("m" + i_18_ + "_" + i_19_, NodeSub21.bitwiseXor(i, 99)));
                            Applet_Sub1.anIntArray38[i_7_] = SoftwareFallbackShader.aClass45_7382.getGroupId("l" + i_18_ + "_" + i_19_, 0);
                            DisplayModeManagerContainer61.anIntArray3759[i_7_] = (SoftwareFallbackShader.aClass45_7382.getGroupId("um" + i_18_ + "_" + i_19_, 0));
                            r.anIntArray9724[i_7_] = (SoftwareFallbackShader.aClass45_7382.getGroupId("ul" + i_18_ + "_" + i_19_, 0));
                            i_7_++;
                        }
                    }
                }
            }
        }
        NodeSub41.method3157(i_1_, (byte) 124, i_2_, 11, bool);
    }

    public Component330() {
        /* empty */
    }

    static final void method854(byte i) {
        anInt1513++;
        if (Component241.anInt2955 == 5 && i < -48) Component241.anInt2955 = 6;
    }
}
