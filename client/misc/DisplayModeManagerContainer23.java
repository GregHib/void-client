/* DisplayModeManagerContainer23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer23
/**
 * RENAMED from `Class92` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int canvasWidth;
    static Interface4[] anInterface4Array1525;
    static int anInt1526;
    static int anInt1527;
    static float[] aFloatArray1528 = {0.0F, -1.0F, 0.0F, 0.0F};

    static final void method858(boolean bool, Player player) {
        anInt1526++;
        SceneNode class348_sub9 = ((SceneNode) (HashNodeSub16Sub2.aClass356_10465.get(player.anInt10290, -6008)));
        if (bool == true) {
            if (class348_sub9 == null) DisplayModeManagerContainer369.method1614(979190089, null, player.plane, (player.anIntArray10317[0]), (player.anIntArray10320[0]), player, null, 0);
            else class348_sub9.method2781((byte) 21);
        }
    }

    static final void method859(int i) {
        anInt1527++;
        int i_0_ = NodeSub50.aByteArrayArray7212.length;
        if (i < -125) {
            for (int i_1_ = 0; i_0_ > i_1_; i_1_++) {
                if (NodeSub50.aByteArrayArray7212[i_1_] != null) {
                    int i_2_ = -1;
                    for (int i_3_ = 0; i_3_ < DisplayModeManagerContainer91.anInt388; i_3_++) {
                        if (DisplayModeManagerContainer173.anIntArray4250[i_3_] == OggStreamReader.anIntArray9042[i_1_]) {
                            i_2_ = i_3_;
                            break;
                        }
                    }
                    if (i_2_ == -1) {
                        DisplayModeManagerContainer173.anIntArray4250[DisplayModeManagerContainer91.anInt388] = OggStreamReader.anIntArray9042[i_1_];
                        i_2_ = DisplayModeManagerContainer91.anInt388++;
                    }
                    Buffer class348_sub49 = new Buffer(NodeSub50.aByteArrayArray7212[i_1_]);
                    int i_4_ = 0;
                    while (class348_sub49.offset < NodeSub50.aByteArrayArray7212[i_1_].length) {
                        if (i_4_ >= 511 || Component324.anInt2057 >= 1023) break;
                        int i_5_ = i_2_ | i_4_++ << 6;
                        int i_6_ = class348_sub49.readUnsignedShort(842397944);
                        int i_7_ = i_6_ >> 14;
                        int i_8_ = 0x3f & i_6_ >> 7;
                        int i_9_ = i_6_ & 0x3f;
                        int i_10_ = (i_8_ + (-NodeBaseSub2.regionTileX + (OggStreamReader.anIntArray9042[i_1_] >> 8) * 64));
                        int i_11_ = (-Component330.regionTileY + (64 * (0xff & (OggStreamReader.anIntArray9042[i_1_])) - -i_9_));
                        NpcComposition class79 = (Component291.aClass278_2529.method2079(class348_sub49.readUnsignedShort(842397944), -1));
                        NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_5_, -6008));
                        if (class348_sub22 == null && (class79.aByte1325 & 0x1) > 0 && i_7_ == Component385.anInt2204 && i_10_ >= 0 && (AbstractShaderSub4.anInt7319 > i_10_ - -class79.anInt1399) && i_11_ >= 0 && (ParametricDefinition.anInt9109 > i_11_ + class79.anInt1399)) {
                            Npc npc = new Npc();
                            npc.anInt10290 = i_5_;
                            NpcNode class348_sub22_12_ = (new NpcNode(npc));
                            Component21.aClass356_3654.put((byte) 91, i_5_, class348_sub22_12_);
                            DefinitionSub23.aClass348_Sub22Array9319[NodeSub32.anInt6930++] = class348_sub22_12_;
                            DisplayModeManagerContainer238.anIntArray1233[Component324.anInt2057++] = i_5_;
                            npc.anInt10306 = OpenGlShader.clientCycle;
                            npc.method2448(class79, -2);
                            npc.method2434((byte) 120, npc.definition.anInt1399);
                            npc.anInt10310 = (npc.definition.anInt1329 << 3);
                            npc.method2435((byte) -108, (npc.definition.aByte1355 - -4 & ~0x631ffff8) << 11, true);
                            npc.method2444(i_11_, true, i_10_, 123, npc.getSize((byte) 54), i_7_);
                        }
                    }
                }
            }
        }
    }

    public static void method860(byte i) {
        anInterface4Array1525 = null;
        if (i > 43) aFloatArray1528 = null;
    }

    static {
        canvasWidth = 765;
    }
}
