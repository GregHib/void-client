/* ColoredTextBuilder - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class325` (JODE-obfuscated).
 * Coloured-text builder. Assembles <col=ffffff> tagged strings for UI labels.
 */

final class ColoredTextBuilder {
    static int anInt4066;
    static int anInt4067;
    static int anInt4068;
    int anInt4069;
    int anInt4070;
    private final Component342 aClass68_4071;
    private final int anInt4072;
    static ColoredTextBuilder aClass325_4073 = new ColoredTextBuilder(0, 3, Component342.aClass68_1187);
    static int anInt4074;
    static ColoredTextBuilder aClass325_4075 = new ColoredTextBuilder(1, 3, Component342.aClass68_1187);
    static ColoredTextBuilder aClass325_4076 = new ColoredTextBuilder(2, 4, Component342.aClass68_1183);
    static ColoredTextBuilder aClass325_4077 = new ColoredTextBuilder(3, 1, Component342.aClass68_1187);
    static ColoredTextBuilder aClass325_4078 = new ColoredTextBuilder(4, 2, Component342.aClass68_1187);
    static ColoredTextBuilder aClass325_4079 = new ColoredTextBuilder(5, 3, Component342.aClass68_1187);
    static ColoredTextBuilder aClass325_4080 = new ColoredTextBuilder(6, 4, Component342.aClass68_1187);
    static int anInt4081 = Component80.method2253(16, 119);
    static Component161 aClass138_4082 = new Component161(8, 0, 4, 1);

    public final String toString() {
        anInt4066++;
        throw new IllegalStateException();
    }

    static final byte[][][] method2596(int i, int i_0_) {
        anInt4068++;
        byte[][][] is = new byte[8][4][];
        int i_1_ = i;
        int i_2_ = i;
        byte[] is_3_ = new byte[i_2_ * i_1_];
        int i_4_ = 0;
        for (int i_5_ = 0; i_2_ > i_5_; i_5_++) {
            for (int i_6_ = 0; i_6_ < i_1_; i_6_++) {
                if (i_6_ <= i_5_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[0][0] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_1_ * i_2_];
        for (int i_7_ = -1 + i_2_; i_7_ >= 0; i_7_--) {
            for (int i_8_ = 0; i_2_ > i_8_; i_8_++) {
                if (i_7_ >= i_8_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[0][1] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_2_ * i_1_];
        for (int i_9_ = 0; i_2_ > i_9_; i_9_++) {
            for (int i_10_ = 0; i_10_ < i_1_; i_10_++) {
                if (i_10_ >= i_9_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        if (i_0_ != 12871) aClass325_4078 = null;
        is[0][2] = is_3_;
        is_3_ = new byte[i_1_ * i_2_];
        i_4_ = 0;
        for (int i_11_ = -1 + i_2_; i_11_ >= 0; i_11_--) {
            for (int i_12_ = 0; i_12_ < i_1_; i_12_++) {
                if (i_12_ >= i_11_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[0][3] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_2_ * i_1_];
        for (int i_13_ = i_2_ + -1; i_13_ >= 0; i_13_--) {
            for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
                if (i_14_ <= i_13_ >> 1) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[1][0] = is_3_;
        is_3_ = new byte[i_1_ * i_2_];
        i_4_ = 0;
        for (int i_15_ = 0; i_2_ > i_15_; i_15_++) {
            for (int i_16_ = 0; i_1_ > i_16_; i_16_++) {
                if (i_4_ >= 0 && is_3_.length > i_4_) {
                    if (i_16_ >= i_15_ << 1) is_3_[i_4_] = (byte) -1;
                    i_4_++;
                } else i_4_++;
            }
        }
        is[1][1] = is_3_;
        is_3_ = new byte[i_2_ * i_1_];
        i_4_ = 0;
        for (int i_17_ = 0; i_17_ < i_2_; i_17_++) {
            for (int i_18_ = -1 + i_1_; i_18_ >= 0; i_18_--) {
                if (i_18_ <= i_17_ >> 1) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[1][2] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_2_ * i_1_];
        for (int i_19_ = -1 + i_2_; i_19_ >= 0; i_19_--) {
            for (int i_20_ = i_1_ + -1; i_20_ >= 0; i_20_--) {
                if (i_19_ << 1 <= i_20_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[1][3] = is_3_;
        is_3_ = new byte[i_1_ * i_2_];
        i_4_ = 0;
        for (int i_21_ = i_2_ - 1; i_21_ >= 0; i_21_--) {
            for (int i_22_ = i_1_ - 1; i_22_ >= 0; i_22_--) {
                if (i_21_ >> 1 >= i_22_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[2][0] = is_3_;
        is_3_ = new byte[i_1_ * i_2_];
        i_4_ = 0;
        for (int i_23_ = -1 + i_2_; i_23_ >= 0; i_23_--) {
            for (int i_24_ = 0; i_1_ > i_24_; i_24_++) {
                if (i_23_ << 1 <= i_24_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[2][1] = is_3_;
        is_3_ = new byte[i_2_ * i_1_];
        i_4_ = 0;
        for (int i_25_ = 0; i_25_ < i_2_; i_25_++) {
            for (int i_26_ = 0; i_1_ > i_26_; i_26_++) {
                if (i_25_ >> 1 >= i_26_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[2][2] = is_3_;
        is_3_ = new byte[i_2_ * i_1_];
        i_4_ = 0;
        for (int i_27_ = 0; i_27_ < i_2_; i_27_++) {
            for (int i_28_ = -1 + i_1_; i_28_ >= 0; i_28_--) {
                if (i_27_ << 1 <= i_28_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[2][3] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_1_ * i_2_];
        for (int i_29_ = -1 + i_2_; i_29_ >= 0; i_29_--) {
            for (int i_30_ = 0; i_1_ > i_30_; i_30_++) {
                if (i_29_ >> 1 <= i_30_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[3][0] = is_3_;
        is_3_ = new byte[i_1_ * i_2_];
        i_4_ = 0;
        for (int i_31_ = 0; i_2_ > i_31_; i_31_++) {
            for (int i_32_ = 0; i_32_ < i_1_; i_32_++) {
                if (i_32_ <= i_31_ << 1) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[3][1] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_1_ * i_2_];
        for (int i_33_ = 0; i_2_ > i_33_; i_33_++) {
            for (int i_34_ = i_1_ + -1; i_34_ >= 0; i_34_--) {
                if (i_34_ >= i_33_ >> 1) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[3][2] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_1_ * i_2_];
        for (int i_35_ = i_2_ - 1; i_35_ >= 0; i_35_--) {
            for (int i_36_ = i_1_ + -1; i_36_ >= 0; i_36_--) {
                if (i_36_ <= i_35_ << 1) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[3][3] = is_3_;
        is_3_ = new byte[i_1_ * i_2_];
        i_4_ = 0;
        for (int i_37_ = -1 + i_2_; i_37_ >= 0; i_37_--) {
            for (int i_38_ = i_1_ - 1; i_38_ >= 0; i_38_--) {
                if (i_37_ >> 1 <= i_38_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[4][0] = is_3_;
        is_3_ = new byte[i_2_ * i_1_];
        i_4_ = 0;
        for (int i_39_ = i_2_ + -1; i_39_ >= 0; i_39_--) {
            for (int i_40_ = 0; i_1_ > i_40_; i_40_++) {
                if (i_40_ <= i_39_ << 1) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[4][1] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_1_ * i_2_];
        for (int i_41_ = 0; i_2_ > i_41_; i_41_++) {
            for (int i_42_ = 0; i_42_ < i_1_; i_42_++) {
                if (i_41_ >> 1 <= i_42_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[4][2] = is_3_;
        is_3_ = new byte[i_1_ * i_2_];
        i_4_ = 0;
        for (int i_43_ = 0; i_43_ < i_2_; i_43_++) {
            for (int i_44_ = -1 + i_1_; i_44_ >= 0; i_44_--) {
                if (i_44_ <= i_43_ << 1) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[4][3] = is_3_;
        is_3_ = new byte[i_2_ * i_1_];
        i_4_ = 0;
        for (int i_45_ = 0; i_2_ > i_45_; i_45_++) {
            for (int i_46_ = 0; i_1_ > i_46_; i_46_++) {
                if (i_1_ / 2 >= i_46_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[5][0] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_1_ * i_2_];
        for (int i_47_ = 0; i_2_ > i_47_; i_47_++) {
            for (int i_48_ = 0; i_1_ > i_48_; i_48_++) {
                if (i_47_ <= i_2_ / 2) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[5][1] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_2_ * i_1_];
        for (int i_49_ = 0; i_49_ < i_2_; i_49_++) {
            for (int i_50_ = 0; i_50_ < i_1_; i_50_++) {
                if (i_1_ / 2 <= i_50_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[5][2] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_2_ * i_1_];
        for (int i_51_ = 0; i_51_ < i_2_; i_51_++) {
            for (int i_52_ = 0; i_1_ > i_52_; i_52_++) {
                if (i_51_ >= i_2_ / 2) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[5][3] = is_3_;
        is_3_ = new byte[i_1_ * i_2_];
        i_4_ = 0;
        for (int i_53_ = 0; i_53_ < i_2_; i_53_++) {
            for (int i_54_ = 0; i_54_ < i_1_; i_54_++) {
                if (i_54_ <= i_53_ - i_2_ / 2) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[6][0] = is_3_;
        is_3_ = new byte[i_2_ * i_1_];
        i_4_ = 0;
        for (int i_55_ = -1 + i_2_; i_55_ >= 0; i_55_--) {
            for (int i_56_ = 0; i_1_ > i_56_; i_56_++) {
                if (i_56_ <= i_55_ - i_2_ / 2) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[6][1] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_1_ * i_2_];
        for (int i_57_ = -1 + i_2_; i_57_ >= 0; i_57_--) {
            for (int i_58_ = i_1_ - 1; i_58_ >= 0; i_58_--) {
                if (i_58_ <= -(i_2_ / 2) + i_57_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[6][2] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_2_ * i_1_];
        for (int i_59_ = 0; i_2_ > i_59_; i_59_++) {
            for (int i_60_ = -1 + i_1_; i_60_ >= 0; i_60_--) {
                if (i_60_ <= -(i_2_ / 2) + i_59_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[6][3] = is_3_;
        is_3_ = new byte[i_1_ * i_2_];
        i_4_ = 0;
        for (int i_61_ = 0; i_61_ < i_2_; i_61_++) {
            for (int i_62_ = 0; i_62_ < i_1_; i_62_++) {
                if (i_62_ >= i_61_ + -(i_2_ / 2)) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[7][0] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_2_ * i_1_];
        for (int i_63_ = -1 + i_2_; i_63_ >= 0; i_63_--) {
            for (int i_64_ = 0; i_64_ < i_1_; i_64_++) {
                if (i_64_ >= i_63_ - i_2_ / 2) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[7][1] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_2_ * i_1_];
        for (int i_65_ = i_2_ + -1; i_65_ >= 0; i_65_--) {
            for (int i_66_ = -1 + i_1_; i_66_ >= 0; i_66_--) {
                if (-(i_2_ / 2) + i_65_ <= i_66_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[7][2] = is_3_;
        i_4_ = 0;
        is_3_ = new byte[i_2_ * i_1_];
        for (int i_67_ = 0; i_67_ < i_2_; i_67_++) {
            for (int i_68_ = i_1_ - 1; i_68_ >= 0; i_68_--) {
                if (i_68_ >= -(i_2_ / 2) + i_67_) is_3_[i_4_] = (byte) -1;
                i_4_++;
            }
        }
        is[7][3] = is_3_;
        return is;
    }

    public static void method2597(int i) {
        aClass325_4073 = null;
        aClass325_4080 = null;
        aClass325_4078 = null;
        aClass138_4082 = null;
        aClass325_4077 = null;
        aClass325_4079 = null;
        if (i == -27327) {
            aClass325_4076 = null;
            aClass325_4075 = null;
        }
    }

    static final ColoredTextBuilder method2598(int i, int i_69_) {
        anInt4074++;
        int i_70_ = -44 / ((-47 - i_69_) / 45);
        int i_71_ = i;
        while_118_:
        do {
            while_117_:
            do {
                while_116_:
                do {
                    while_115_:
                    do {
                        while_114_:
                        do {
                            do {
                                if (i_71_ != 0) {
                                    if (i_71_ != 1) {
                                        if (i_71_ != 2) {
                                            if (i_71_ != 3) {
                                                if (i_71_ != 4) {
                                                    if (i_71_ != 5) {
                                                        if (i_71_ == 6) break while_117_;
                                                        break while_118_;
                                                    }
                                                } else break while_115_;
                                                break while_116_;
                                            }
                                        } else break;
                                        break while_114_;
                                    }
                                } else return aClass325_4073;
                                return aClass325_4075;
                            } while (false);
                            return aClass325_4076;
                        } while (false);
                        return aClass325_4077;
                    } while (false);
                    return aClass325_4078;
                } while (false);
                return aClass325_4079;
            } while (false);
            return aClass325_4080;
        } while (false);
        return null;
    }

    /**
     * Executes a {@link MenuEntry}: custom 1900-ops first (DefaultClick / Microbot),
     * else builds the matching outbound packet (Attack, Walk, object, CC_OP, …).
     *
     * @param entry tip or explicitly chosen menu row
     * @param i_72_ click Y (cursor feedback)
     * @param i_73_ click X
     */
    static final void processMenuAction(byte i, MenuEntry class348_sub42_sub12, int i_72_, int i_73_) {
        do {
            try {
                anInt4067++;
                if (class348_sub42_sub12 != null && (class348_sub42_sub12 != (DefinitionSub4.menuEntries.sentinel))) {
                    // Client-only Default click config — do not send a game packet.
                    if (DefaultClickSwapper.handleMenuAction(class348_sub42_sub12)) {
                        ShaderProgramSub2.method2146((byte) 84);
                        break;
                    }
                    // Client-only joystick Learn alias — do not send a game packet.
                    if (JoystickAlias.handleMenuAction(class348_sub42_sub12)) {
                        ShaderProgramSub2.method2146((byte) 84);
                        break;
                    }
                    // Client-only Microbot toggle — do not send a game packet.
                    if (MicrobotRuntime.handleMenuAction(class348_sub42_sub12)) {
                        ShaderProgramSub2.method2146((byte) 84);
                        break;
                    }
                    // Client-only world-map teleport — do not send a game packet.
                    if (WorldMapTeleport.handle(class348_sub42_sub12)) {
                        ShaderProgramSub2.method2146((byte) 84);
                        break;
                    }
                    // Client-only scene editor (Move / Duplicate / Remove / Rotate).
                    if (SceneEditorMenu.handleMenuAction(class348_sub42_sub12)) {
                        ShaderProgramSub2.method2146((byte) 84);
                        break;
                    }
                    // Clear Microbot targetMenu after any real (or attempted) menu consume.
                    MicrobotMenu.onMenuOptionClicked();
                    int i_74_ = (class348_sub42_sub12.param0);
                    int i_75_ = (class348_sub42_sub12.param1);
                    int i_76_ = (class348_sub42_sub12.opcode);
                    int i_77_ = (int) (class348_sub42_sub12.identifier);
                    if (i_76_ >= 2000) i_76_ -= 2000;
                    long l = (class348_sub42_sub12.identifier);
                    if (i_76_ == 19) {
                        if (Component353.anInt2581 <= 0 || !Component280.aClass346_2449.isKeyDown(82, -125) || !Component280.aClass346_2449.isKeyDown(81, -126)) {
                            ParticleSystem class348_sub47 = NodeSub14.method2807(i_75_, i_74_, (byte) -110, i_77_);
                            if (i_77_ == 1) {
                                class348_sub47.particleBuffer.writeByte(false, -1);
                                class348_sub47.particleBuffer.writeByte(false, -1);
                                class348_sub47.particleBuffer.writeShort((byte) 107, (int) Component112.cameraYaw);
                                class348_sub47.particleBuffer.writeByte(false, 57);
                                class348_sub47.particleBuffer.writeByte(false, CacheNodeSub2.anInt10483);
                                class348_sub47.particleBuffer.writeByte(false, Component182.anInt9750);
                                class348_sub47.particleBuffer.writeByte(false, 89);
                                class348_sub47.particleBuffer.writeShort((byte) 107, (Component72.localPlayer.x));
                                class348_sub47.particleBuffer.writeShort((byte) 107, (Component72.localPlayer.y));
                                class348_sub47.particleBuffer.writeByte(false, 63);
                            } else {
                                ToolkitFactory.anInt1534 = i_72_;
                                AssetCacheLoader.anInt385 = i_73_;
                                Node.anInt4292 = 0;
                                Component20.anInt6048 = 1;
                            }
                            HashNodeSub14.enqueueOutboundPacket(123, class348_sub47);
                            Component10.method2252(true, i_74_, i_75_, (byte) -120, 1, 0, 1, -4, 0);
                        } else CollisionMap.method3502(i_75_ + Component330.regionTileY, 2, (Component72.localPlayer.plane), i_74_ + NodeBaseSub2.regionTileX);
                    }
                    if (i_76_ == 4) {
                        ToolkitFactory.anInt1534 = i_72_;
                        Component20.anInt6048 = 2;
                        AssetCacheLoader.anInt385 = i_73_;
                        Node.anInt4292 = 0;
                        Component158.anInt321++;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((CacheNode.aClass351_9553), (DisplayModeManagerContainer64.aClass77_9029), -113);
                        class348_sub47.particleBuffer.writeShortAddLittle(4325, Component330.regionTileY + i_75_);
                        class348_sub47.particleBuffer.writeShortAdd(120, i_74_ + NodeBaseSub2.regionTileX);
                        class348_sub47.particleBuffer.writeByteSubtract((byte) 117, (!Component280.aClass346_2449.isKeyDown(82, -122) ? 0 : 1));
                        class348_sub47.particleBuffer.writeShortAddLittle(4325, 0x7fffffff & (int) (l >>> 32));
                        HashNodeSub14.enqueueOutboundPacket(117, class348_sub47);
                        DisplayModeManagerContainer74.method2307(i_75_, l, i_74_, 51);
                    }
                    if (i_76_ == 1008) {
                        Component20.anInt6048 = 2;
                        ToolkitFactory.anInt1534 = i_72_;
                        AssetCacheLoader.anInt385 = i_73_;
                        Node.anInt4292 = 0;
                        NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_77_, -6008));
                        if (class348_sub22 != null) {
                            Npc npc = (class348_sub22.npc);
                            NpcComposition class79 = (npc.definition);
                            if (class79.anIntArray1377 != null) class79 = (class79.method794((DisplayModeManagerContainer58.aClass170_10209), -1));
                            if (class79 != null) {
                                Component314.anInt3874++;
                                ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(StaticElementRenderer.aClass351_6443, DisplayModeManagerContainer64.aClass77_9029, -111));
                                class348_sub47.particleBuffer.writeShort((byte) 107, class79.id);
                                HashNodeSub14.enqueueOutboundPacket(-99, class348_sub47);
                            }
                        }
                    }
                    if (i_76_ == 48) {
                        Player player = (InterfaceRenderer.players[i_77_]);
                        if (player != null) {
                            Node.anInt4292 = 0;
                            ToolkitFactory.anInt1534 = i_72_;
                            AssetCacheLoader.anInt385 = i_73_;
                            Component43.anInt4979++;
                            Component20.anInt6048 = 2;
                            ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(HashNodeSub18.aClass351_9684, DisplayModeManagerContainer64.aClass77_9029, -126));
                            class348_sub47.particleBuffer.writeShortAdd(81, i_77_);
                            class348_sub47.particleBuffer.writeByte(false, (!Component280.aClass346_2449.isKeyDown(82, -126) ? 0 : 1));
                            HashNodeSub14.enqueueOutboundPacket(116, class348_sub47);
                            Component10.method2252(true, (player.anIntArray10320[0]), (player.anIntArray10317[0]), (byte) -89, player.getSize((byte) 106), 0, player.getSize((byte) 43), -2, 0);
                        }
                    }
                    if (i_76_ == 49) {
                        AssetCacheLoader.anInt385 = i_73_;
                        Node.anInt4292 = 0;
                        Component20.anInt6048 = 2;
                        ToolkitFactory.anInt1534 = i_72_;
                        Component275.anInt2689++;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(AbstractBuffer.aClass351_4262, (DisplayModeManagerContainer64.aClass77_9029), -107);
                        class348_sub47.particleBuffer.writeShortLittle(i_74_ + NodeBaseSub2.regionTileX, (byte) 3);
                        class348_sub47.particleBuffer.writeShortAdd(-107, i_77_);
                        class348_sub47.particleBuffer.writeShortLittle(JaclibLoader.anInt169, (byte) 3);
                        class348_sub47.particleBuffer.writeShort((byte) 107, Component330.regionTileY + i_75_);
                        class348_sub47.particleBuffer.writeByte(false, (!Component280.aClass346_2449.isKeyDown(82, -126) ? 0 : 1));
                        class348_sub47.particleBuffer.writeShortAdd(90, Component281.anInt3829);
                        class348_sub47.particleBuffer.writeIntMiddle(Component90.anInt2046, (byte) 44);
                        HashNodeSub14.enqueueOutboundPacket(120, class348_sub47);
                        HashNodeSub18.method3275(1, i_75_, i_74_);
                    }
                    if (i_76_ == 6) {
                        DisplayModeManagerContainer57 class46 = NpcNode.getChildComponent(i_74_, (byte) -54, i_75_);
                        if (class46 != null) Component177.method1237((byte) 71, class46);
                    }
                    if (i_76_ == 5) {
                        Node.anInt4292 = 0;
                        Component279.anInt226++;
                        AssetCacheLoader.anInt385 = i_73_;
                        Component20.anInt6048 = 2;
                        ToolkitFactory.anInt1534 = i_72_;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(DisplayModeManagerContainer56.aClass351_2539, (DisplayModeManagerContainer64.aClass77_9029), -110);
                        class348_sub47.particleBuffer.writeShort((byte) 107, Component330.regionTileY + i_75_);
                        class348_sub47.particleBuffer.writeShortAdd(-110, i_74_ + NodeBaseSub2.regionTileX);
                        class348_sub47.particleBuffer.writeByteInverse((byte) -44, (!Component280.aClass346_2449.isKeyDown(82, -122) ? 0 : 1));
                        class348_sub47.particleBuffer.writeShortAdd(97, i_77_);
                        HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
                        HashNodeSub18.method3275(1, i_75_, i_74_);
                    }
                    if (i_76_ == 46) {
                        NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_77_, -6008));
                        if (class348_sub22 != null) {
                            Node.anInt4292 = 0;
                            Component38.anInt2499++;
                            AssetCacheLoader.anInt385 = i_73_;
                            Component20.anInt6048 = 2;
                            ToolkitFactory.anInt1534 = i_72_;
                            Npc npc = (class348_sub22.npc);
                            ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(Component289.aClass351_10134, DisplayModeManagerContainer64.aClass77_9029, -96));
                            class348_sub47.particleBuffer.writeShortLittle(i_77_, (byte) 3);
                            class348_sub47.particleBuffer.writeByteAdd((byte) 124, (Component280.aClass346_2449.isKeyDown(82, -121) ? 1 : 0));
                            HashNodeSub14.enqueueOutboundPacket(117, class348_sub47);
                            Component10.method2252(true, (npc.anIntArray10320[0]), (npc.anIntArray10317[0]), (byte) -100, npc.getSize((byte) 68), 0, npc.getSize((byte) 106), -2, 0);
                        }
                    }
                    if (i_76_ == 11) {
                        Player player = (InterfaceRenderer.players[i_77_]);
                        if (player != null) {
                            Node.anInt4292 = 0;
                            Component296.anInt4657++;
                            ToolkitFactory.anInt1534 = i_72_;
                            Component20.anInt6048 = 2;
                            AssetCacheLoader.anInt385 = i_73_;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component379.aClass351_5929), (DisplayModeManagerContainer64.aClass77_9029), -94);
                            class348_sub47.particleBuffer.writeShortAddLittle(4325, i_77_);
                            class348_sub47.particleBuffer.writeByteInverse((byte) -108, (Component280.aClass346_2449.isKeyDown(82, -124) ? 1 : 0));
                            HashNodeSub14.enqueueOutboundPacket(119, class348_sub47);
                            Component10.method2252(true, (player.anIntArray10320[0]), (player.anIntArray10317[0]), (byte) -128, player.getSize((byte) 53), 0, player.getSize((byte) 110), -2, 0);
                        }
                    }
                    if (i_76_ == 59) {
                        AssetCacheLoader.anInt385 = i_73_;
                        ToolkitFactory.anInt1534 = i_72_;
                        Node.anInt4292 = 0;
                        DisplayModeManagerContainer109.anInt2336++;
                        Component20.anInt6048 = 2;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((MatrixSub1.aClass351_5677), (DisplayModeManagerContainer64.aClass77_9029), -83);
                        class348_sub47.particleBuffer.writeByteAdd((byte) 86, (!Component280.aClass346_2449.isKeyDown(82, -121) ? 0 : 1));
                        class348_sub47.particleBuffer.writeShortAdd(31, (int) (l >>> 32) & 0x7fffffff);
                        class348_sub47.particleBuffer.writeShortAdd(-104, NodeBaseSub2.regionTileX + i_74_);
                        class348_sub47.particleBuffer.writeShortLittle(Component330.regionTileY + i_75_, (byte) 3);
                        HashNodeSub14.enqueueOutboundPacket(119, class348_sub47);
                        DisplayModeManagerContainer74.method2307(i_75_, l, i_74_, 93);
                    }
                    if (i_76_ == 30) {
                        NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_77_, -6008));
                        if (class348_sub22 != null) {
                            Node.anInt4292 = 0;
                            ToolkitFactory.anInt1534 = i_72_;
                            AssetCacheLoader.anInt385 = i_73_;
                            Npc npc = (class348_sub22.npc);
                            Component20.anInt6048 = 2;
                            NodeSub7.anInt6646++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component286.aClass351_1904), (DisplayModeManagerContainer64.aClass77_9029), -119);
                            class348_sub47.particleBuffer.writeShortAddLittle(4325, JaclibLoader.anInt169);
                            class348_sub47.particleBuffer.writeInt((byte) 108, Component90.anInt2046);
                            class348_sub47.particleBuffer.writeShortLittle(i_77_, (byte) 3);
                            class348_sub47.particleBuffer.writeByteAdd((byte) -89, (!Component280.aClass346_2449.isKeyDown(82, -127) ? 0 : 1));
                            class348_sub47.particleBuffer.writeShortAdd(-116, Component281.anInt3829);
                            HashNodeSub14.enqueueOutboundPacket(122, class348_sub47);
                            Component10.method2252(true, (npc.anIntArray10320[0]), (npc.anIntArray10317[0]), (byte) -107, npc.getSize((byte) 88), 0, npc.getSize((byte) 108), -2, 0);
                        }
                    }
                    if (i_76_ == 12) {
                        if (Component353.anInt2581 > 0 && Component280.aClass346_2449.isKeyDown(82, -127) && Component280.aClass346_2449.isKeyDown(81, -126)) CollisionMap.method3502(i_75_ + Component330.regionTileY, 2, (Component72.localPlayer.plane), NodeBaseSub2.regionTileX - -i_74_);
                        else {
                            ToolkitFactory.anInt1534 = i_72_;
                            AssetCacheLoader.anInt385 = i_73_;
                            JagTheoraDecoder.anInt994++;
                            Node.anInt4292 = 0;
                            Component20.anInt6048 = 1;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component195.aClass351_5015), (DisplayModeManagerContainer64.aClass77_9029), -123);
                            class348_sub47.particleBuffer.writeShortAdd(101, NodeBaseSub2.regionTileX + i_74_);
                            class348_sub47.particleBuffer.writeShort((byte) 107, Component330.regionTileY - -i_75_);
                            HashNodeSub14.enqueueOutboundPacket(6, class348_sub47);
                        }
                    }
                    if (i_76_ == 1001) {
                        ToolkitFactory.anInt1534 = i_72_;
                        Component243.anInt484++;
                        Component20.anInt6048 = 2;
                        Node.anInt4292 = 0;
                        AssetCacheLoader.anInt385 = i_73_;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component275.aClass351_2691, (DisplayModeManagerContainer64.aClass77_9029), -115);
                        class348_sub47.particleBuffer.writeShort((byte) 107, i_77_);
                        HashNodeSub14.enqueueOutboundPacket(-60, class348_sub47);
                    }
                    if (i_76_ == 51) {
                        Player player = (InterfaceRenderer.players[i_77_]);
                        if (player != null) {
                            AssetCacheLoader.anInt385 = i_73_;
                            Component20.anInt6048 = 2;
                            NativeLibraryLoader.anInt2975++;
                            Node.anInt4292 = 0;
                            ToolkitFactory.anInt1534 = i_72_;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((RSACipher.aClass351_4907), (DisplayModeManagerContainer64.aClass77_9029), -93);
                            class348_sub47.particleBuffer.writeShortAddLittle(4325, JaclibLoader.anInt169);
                            class348_sub47.particleBuffer.writeShortLittle(i_77_, (byte) 3);
                            class348_sub47.particleBuffer.writeShortLittle(Component281.anInt3829, (byte) 3);
                            class348_sub47.particleBuffer.writeIntInverseMiddle(Component90.anInt2046, -4086);
                            class348_sub47.particleBuffer.writeByteInverse((byte) -89, (Component280.aClass346_2449.isKeyDown(82, -127) ? 1 : 0));
                            HashNodeSub14.enqueueOutboundPacket(-33, class348_sub47);
                            Component10.method2252(true, (player.anIntArray10320[0]), (player.anIntArray10317[0]), (byte) -88, player.getSize((byte) 44), 0, player.getSize((byte) 110), -2, 0);
                        }
                    }
                    if (i_76_ == 45) {
                        Player player = (InterfaceRenderer.players[i_77_]);
                        if (player != null) {
                            Node.anInt4292 = 0;
                            ToolkitFactory.anInt1534 = i_72_;
                            DisplayModeManagerContainer204.anInt1596++;
                            Component20.anInt6048 = 2;
                            AssetCacheLoader.anInt385 = i_73_;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component264.aClass351_8706), (DisplayModeManagerContainer64.aClass77_9029), -84);
                            class348_sub47.particleBuffer.writeByteSubtract((byte) -125, (Component280.aClass346_2449.isKeyDown(82, -126) ? 1 : 0));
                            class348_sub47.particleBuffer.writeShortLittle(i_77_, (byte) 3);
                            HashNodeSub14.enqueueOutboundPacket(30, class348_sub47);
                            Component10.method2252(true, (player.anIntArray10320[0]), (player.anIntArray10317[0]), (byte) -91, player.getSize((byte) 70), 0, player.getSize((byte) 125), -2, 0);
                        }
                    }
                    if (i_76_ == 1007) {
                        Component20.anInt6048 = 2;
                        ShaderLinker.anInt10164++;
                        AssetCacheLoader.anInt385 = i_73_;
                        Node.anInt4292 = 0;
                        ToolkitFactory.anInt1534 = i_72_;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component321.aClass351_2587, (DisplayModeManagerContainer64.aClass77_9029), -112);
                        class348_sub47.particleBuffer.writeShortLittle(Component330.regionTileY + i_75_, (byte) 3);
                        class348_sub47.particleBuffer.writeByteAdd((byte) -96, (Component280.aClass346_2449.isKeyDown(82, -125) ? 1 : 0));
                        class348_sub47.particleBuffer.writeShortAddLittle(4325, NodeBaseSub2.regionTileX + i_74_);
                        class348_sub47.particleBuffer.writeShortAdd(68, 0x7fffffff & (int) (l >>> 32));
                        HashNodeSub14.enqueueOutboundPacket(-68, class348_sub47);
                        DisplayModeManagerContainer74.method2307(i_75_, l, i_74_, 25);
                    }
                    if (i_76_ == 23) {
                        Player player = (InterfaceRenderer.players[i_77_]);
                        if (player != null) {
                            Component20.anInt6048 = 2;
                            Component197.anInt10073++;
                            Node.anInt4292 = 0;
                            AssetCacheLoader.anInt385 = i_73_;
                            ToolkitFactory.anInt1534 = i_72_;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((RSACipher.aClass351_4905), (DisplayModeManagerContainer64.aClass77_9029), -113);
                            class348_sub47.particleBuffer.writeShort((byte) 107, i_77_);
                            class348_sub47.particleBuffer.writeByteAdd((byte) 60, (!Component280.aClass346_2449.isKeyDown(82, -121) ? 0 : 1));
                            HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
                            Component10.method2252(true, (player.anIntArray10320[0]), (player.anIntArray10317[0]), (byte) -106, player.getSize((byte) 45), 0, player.getSize((byte) 63), -2, 0);
                        }
                    }
                    if (i_76_ == 16 && Component297.aClass46_4730 == null) {
                        ImageDefinition.method3065(i_75_, false, i_74_);
                        Component297.aClass46_4730 = NpcNode.getChildComponent(i_74_, (byte) -54, i_75_);
                        Component111.markInterfaceDirty(-9343, Component297.aClass46_4730);
                    }
                    if (i_76_ == 8) {
                        Player player = (InterfaceRenderer.players[i_77_]);
                        if (player != null) {
                            ToolkitFactory.anInt1534 = i_72_;
                            AssetCacheLoader.anInt385 = i_73_;
                            Component20.anInt6048 = 2;
                            HuffmanDecoder.anInt3768++;
                            Node.anInt4292 = 0;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component111.aClass351_3232), (DisplayModeManagerContainer64.aClass77_9029), -84);
                            class348_sub47.particleBuffer.writeByte(false, (!Component280.aClass346_2449.isKeyDown(82, -128) ? 0 : 1));
                            class348_sub47.particleBuffer.writeShortAdd(-99, i_77_);
                            HashNodeSub14.enqueueOutboundPacket(127, class348_sub47);
                            Component10.method2252(true, (player.anIntArray10320[0]), (player.anIntArray10317[0]), (byte) -106, player.getSize((byte) 100), 0, player.getSize((byte) 99), -2, 0);
                        }
                    }
                    if (i_76_ == 21) {
                        ToolkitFactory.anInt1534 = i_72_;
                        DisplayModeManagerContainer295.anInt5919++;
                        Node.anInt4292 = 0;
                        Component20.anInt6048 = 2;
                        AssetCacheLoader.anInt385 = i_73_;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(CacheNodeSub1.aClass351_10477, (DisplayModeManagerContainer64.aClass77_9029), -107);
                        class348_sub47.particleBuffer.writeShort((byte) 107, i_77_);
                        class348_sub47.particleBuffer.writeShort((byte) 107, NodeBaseSub2.regionTileX + i_74_);
                        class348_sub47.particleBuffer.writeShort((byte) 107, i_75_ + Component330.regionTileY);
                        class348_sub47.particleBuffer.writeByteSubtract((byte) 120, (!Component280.aClass346_2449.isKeyDown(82, -123) ? 0 : 1));
                        HashNodeSub14.enqueueOutboundPacket(120, class348_sub47);
                        HashNodeSub18.method3275(1, i_75_, i_74_);
                    }
                    if (i_76_ == 15) {
                        Component20.anInt6048 = 1;
                        AssetCacheLoader.anInt385 = i_73_;
                        Node.anInt4292 = 0;
                        ToolkitFactory.anInt1534 = i_72_;
                        client.anInt5187++;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(AbstractBuffer.aClass351_4264, (DisplayModeManagerContainer64.aClass77_9029), -127);
                        class348_sub47.particleBuffer.writeShortLittle(NodeBaseSub2.regionTileX - -i_74_, (byte) 3);
                        class348_sub47.particleBuffer.writeShortAdd(-85, Component281.anInt3829);
                        class348_sub47.particleBuffer.writeShortLittle(JaclibLoader.anInt169, (byte) 3);
                        class348_sub47.particleBuffer.writeInt((byte) 127, Component90.anInt2046);
                        class348_sub47.particleBuffer.writeShortAdd(-84, Component330.regionTileY + i_75_);
                        HashNodeSub14.enqueueOutboundPacket(-62, class348_sub47);
                        Component10.method2252(true, i_74_, i_75_, (byte) -91, 1, 0, 1, -4, 0);
                    }
                    if (i_76_ == 60) {
                        NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_77_, -6008));
                        if (class348_sub22 != null) {
                            Component200.anInt3707++;
                            Node.anInt4292 = 0;
                            AssetCacheLoader.anInt385 = i_73_;
                            ToolkitFactory.anInt1534 = i_72_;
                            Npc npc = (class348_sub22.npc);
                            Component20.anInt6048 = 2;
                            ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(RuntimeException_Sub1.aClass351_4601, DisplayModeManagerContainer64.aClass77_9029, -123));
                            class348_sub47.particleBuffer.writeShort((byte) 107, i_77_);
                            class348_sub47.particleBuffer.writeByteInverse((byte) -67, (Component280.aClass346_2449.isKeyDown(82, -122) ? 1 : 0));
                            HashNodeSub14.enqueueOutboundPacket(119, class348_sub47);
                            Component10.method2252(true, (npc.anIntArray10320[0]), (npc.anIntArray10317[0]), (byte) -111, npc.getSize((byte) 65), 0, npc.getSize((byte) 42), -2, 0);
                        }
                    }
                    if (i_76_ == 2) {
                        Node.anInt4292 = 0;
                        Component20.anInt6048 = 2;
                        CacheNodeSub1.anInt10476++;
                        AssetCacheLoader.anInt385 = i_73_;
                        ToolkitFactory.anInt1534 = i_72_;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((GpiLogger.aClass351_8857), (DisplayModeManagerContainer64.aClass77_9029), -105);
                        class348_sub47.particleBuffer.writeShort((byte) 107, Component281.anInt3829);
                        class348_sub47.particleBuffer.writeShortAddLittle(4325, NodeBaseSub2.regionTileX + i_74_);
                        class348_sub47.particleBuffer.writeIntLittle(-128, Component90.anInt2046);
                        class348_sub47.particleBuffer.writeShortAdd(-82, Component330.regionTileY + i_75_);
                        class348_sub47.particleBuffer.writeByteSubtract((byte) -74, (!Component280.aClass346_2449.isKeyDown(82, -125) ? 0 : 1));
                        class348_sub47.particleBuffer.writeShortLittle(JaclibLoader.anInt169, (byte) 3);
                        class348_sub47.particleBuffer.writeShortLittle((int) (l >>> 32) & 0x7fffffff, (byte) 3);
                        HashNodeSub14.enqueueOutboundPacket(117, class348_sub47);
                        DisplayModeManagerContainer74.method2307(i_75_, l, i_74_, 4);
                    }
                    if (i_76_ == 58) {
                        Player player = (InterfaceRenderer.players[i_77_]);
                        if (player != null) {
                            Node.anInt4292 = 0;
                            ToolkitFactory.anInt1534 = i_72_;
                            AssetCacheLoader.anInt385 = i_73_;
                            Component20.anInt6048 = 2;
                            Component122.anInt1570++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component143.aClass351_2315), (DisplayModeManagerContainer64.aClass77_9029), -90);
                            class348_sub47.particleBuffer.writeByte(false, (!Component280.aClass346_2449.isKeyDown(82, -121) ? 0 : 1));
                            class348_sub47.particleBuffer.writeShortAdd(52, i_77_);
                            HashNodeSub14.enqueueOutboundPacket(-127, class348_sub47);
                            Component10.method2252(true, (player.anIntArray10320[0]), (player.anIntArray10317[0]), (byte) -93, player.getSize((byte) 119), 0, player.getSize((byte) 54), -2, 0);
                        }
                    }
                    if (i_76_ == 17) {
                        Player player = (InterfaceRenderer.players[i_77_]);
                        if (player != null) {
                            Component20.anInt6048 = 2;
                            ToolkitFactory.anInt1534 = i_72_;
                            DisplayModeManagerContainer288.anInt8625++;
                            AssetCacheLoader.anInt385 = i_73_;
                            Node.anInt4292 = 0;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component361.aClass351_364), (DisplayModeManagerContainer64.aClass77_9029), -113);
                            class348_sub47.particleBuffer.writeByte(false, (!Component280.aClass346_2449.isKeyDown(82, -126) ? 0 : 1));
                            class348_sub47.particleBuffer.writeShort((byte) 107, i_77_);
                            HashNodeSub14.enqueueOutboundPacket(121, class348_sub47);
                            Component10.method2252(true, (player.anIntArray10320[0]), (player.anIntArray10317[0]), (byte) -123, player.getSize((byte) 96), 0, player.getSize((byte) 97), -2, 0);
                        }
                    }
                    if (i_76_ == 47) {
                        AssetCacheLoader.anInt385 = i_73_;
                        Component20.anInt6048 = 2;
                        Node.anInt4292 = 0;
                        Component192.anInt3966++;
                        ToolkitFactory.anInt1534 = i_72_;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component182.aClass351_9749), (DisplayModeManagerContainer64.aClass77_9029), -81);
                        class348_sub47.particleBuffer.writeShort((byte) 107, i_77_);
                        class348_sub47.particleBuffer.writeShortAdd(106, i_74_ - -NodeBaseSub2.regionTileX);
                        class348_sub47.particleBuffer.writeByte(false, (!Component280.aClass346_2449.isKeyDown(82, -128) ? 0 : 1));
                        class348_sub47.particleBuffer.writeShortAddLittle(4325, i_75_ - -Component330.regionTileY);
                        HashNodeSub14.enqueueOutboundPacket(116, class348_sub47);
                        HashNodeSub18.method3275(1, i_75_, i_74_);
                    }
                    if (i_76_ == 3) {
                        DisplayModeManagerContainer346.anInt2065++;
                        AssetCacheLoader.anInt385 = i_73_;
                        Node.anInt4292 = 0;
                        Component20.anInt6048 = 2;
                        ToolkitFactory.anInt1534 = i_72_;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((HashNodeSub17.aClass351_9679), (DisplayModeManagerContainer64.aClass77_9029), -98);
                        class348_sub47.particleBuffer.writeByteSubtract((byte) -83, (!Component280.aClass346_2449.isKeyDown(82, -128) ? 0 : 1));
                        class348_sub47.particleBuffer.writeShortAddLittle(4325, NodeBaseSub2.regionTileX + i_74_);
                        class348_sub47.particleBuffer.writeShortLittle(i_75_ + Component330.regionTileY, (byte) 3);
                        class348_sub47.particleBuffer.writeShort((byte) 107, 0x7fffffff & (int) (l >>> 32));
                        HashNodeSub14.enqueueOutboundPacket(127, class348_sub47);
                        DisplayModeManagerContainer74.method2307(i_75_, l, i_74_, 63);
                    }
                    if (i_76_ == 20) {
                        NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_77_, -6008));
                        if (class348_sub22 != null) {
                            Component20.anInt6048 = 2;
                            AssetCacheLoader.anInt385 = i_73_;
                            ToolkitFactory.anInt1534 = i_72_;
                            Npc npc = (class348_sub22.npc);
                            Node.anInt4292 = 0;
                            ShaderCompilerSub2.anInt6516++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((NewsFetcher.aClass351_4207), (DisplayModeManagerContainer64.aClass77_9029), -81);
                            class348_sub47.particleBuffer.writeShortAddLittle(4325, i_77_);
                            class348_sub47.particleBuffer.writeByteAdd((byte) -119, (!Component280.aClass346_2449.isKeyDown(82, -123) ? 0 : 1));
                            HashNodeSub14.enqueueOutboundPacket(-85, class348_sub47);
                            Component10.method2252(true, (npc.anIntArray10320[0]), (npc.anIntArray10317[0]), (byte) -121, npc.getSize((byte) 99), 0, npc.getSize((byte) 99), -2, 0);
                        }
                    }
                    if (i > 97) {
                        if (i_76_ == 1010) {
                            Component20.anInt6048 = 2;
                            HashNodeSub18.anInt9686++;
                            ToolkitFactory.anInt1534 = i_72_;
                            AssetCacheLoader.anInt385 = i_73_;
                            Node.anInt4292 = 0;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component304.aClass351_1144), (DisplayModeManagerContainer64.aClass77_9029), -96);
                            class348_sub47.particleBuffer.writeShort((byte) 107, i_77_);
                            HashNodeSub14.enqueueOutboundPacket(125, class348_sub47);
                        }
                        if (i_76_ == 22) {
                            Component20.anInt6048 = 2;
                            Node.anInt4292 = 0;
                            ToolkitFactory.anInt1534 = i_72_;
                            AssetCacheLoader.anInt385 = i_73_;
                            HashNodeSub13.anInt9620++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Connection.aClass351_2661), (DisplayModeManagerContainer64.aClass77_9029), -117);
                            class348_sub47.particleBuffer.writeByteSubtract((byte) -101, (!Component280.aClass346_2449.isKeyDown(82, -125) ? 0 : 1));
                            class348_sub47.particleBuffer.writeShortAdd(-69, NodeBaseSub2.regionTileX + i_74_);
                            class348_sub47.particleBuffer.writeShortLittle(Component330.regionTileY + i_75_, (byte) 3);
                            class348_sub47.particleBuffer.writeShort((byte) 107, i_77_);
                            HashNodeSub14.enqueueOutboundPacket(116, class348_sub47);
                            HashNodeSub18.method3275(1, i_75_, i_74_);
                        }
                        if (i_76_ == 50) {
                            AssetCacheLoader.anInt385 = i_73_;
                            Component20.anInt6048 = 2;
                            Node.anInt4292 = 0;
                            ToolkitFactory.anInt1534 = i_72_;
                            NativeLibraryLoader.anInt2975++;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((RSACipher.aClass351_4907), (DisplayModeManagerContainer64.aClass77_9029), -127);
                            class348_sub47.particleBuffer.writeShortAddLittle(4325, JaclibLoader.anInt169);
                            class348_sub47.particleBuffer.writeShortLittle((Component72.localPlayer.anInt10290), (byte) 3);
                            class348_sub47.particleBuffer.writeShortLittle(Component281.anInt3829, (byte) 3);
                            class348_sub47.particleBuffer.writeIntInverseMiddle(Component90.anInt2046, -4086);
                            class348_sub47.particleBuffer.writeByteInverse((byte) -29, (Component280.aClass346_2449.isKeyDown(82, -121) ? 1 : 0));
                            HashNodeSub14.enqueueOutboundPacket(-40, class348_sub47);
                        }
                        if (i_76_ == 18 || i_76_ == 1011) SceneNode.method2780(i_74_, (class348_sub42_sub12.target), (byte) 5, i_77_, i_75_);
                        if (i_76_ == 13) {
                            DisplayModeManagerContainer57 class46 = NpcNode.getChildComponent(i_74_, (byte) -54, i_75_);
                            if (class46 != null) {
                                DisplayModeManagerContainer196.method2678(-2049);
                                ComponentSettings class348_sub44 = client.getComponentSettings(class46);
                                NewsFetcher.method2666(class348_sub44.anInt7093, class348_sub44.getClickMask(14), class46, (byte) 21);
                                DisplayModeManagerContainer332.aString5001 = DisplayModeManagerContainer295.getUseOption(0, class46);
                                DisplayModeManagerContainer332.aString5000 = (class46.text + "<col=ffffff>");
                                if (DisplayModeManagerContainer332.aString5001 == null) DisplayModeManagerContainer332.aString5001 = "Null";
                            }
                        } else {
                            if (i_76_ == 1009 || i_76_ == 1012 || i_76_ == 1002 || i_76_ == 1003 || i_76_ == 1006) Component304.method696(i_76_, i_74_, i_77_, -1007);
                            if (i_76_ == 25) {
                                NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_77_, -6008));
                                if (class348_sub22 != null) {
                                    Component20.anInt6048 = 2;
                                    ToolkitFactory.anInt1534 = i_72_;
                                    Component264.anInt8702++;
                                    Npc npc = (class348_sub22.npc);
                                    AssetCacheLoader.anInt385 = i_73_;
                                    Node.anInt4292 = 0;
                                    ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(NodeSub18.aClass351_6814, DisplayModeManagerContainer64.aClass77_9029, -125));
                                    class348_sub47.particleBuffer.writeByte(false, !Component280.aClass346_2449.isKeyDown(82, -125) ? 0 : 1);
                                    class348_sub47.particleBuffer.writeShortLittle(i_77_, (byte) 3);
                                    HashNodeSub14.enqueueOutboundPacket(-37, class348_sub47);
                                    Component10.method2252(true, (npc.anIntArray10320[0]), (npc.anIntArray10317[0]), (byte) -85, npc.getSize((byte) 124), 0, npc.getSize((byte) 84), -2, 0);
                                }
                            }
                            if (i_76_ == 57) {
                                Player player = (InterfaceRenderer.players[i_77_]);
                                if (player != null) {
                                    Component20.anInt6048 = 2;
                                    ToolkitFactory.anInt1534 = i_72_;
                                    Component14.anInt8588++;
                                    Node.anInt4292 = 0;
                                    AssetCacheLoader.anInt385 = i_73_;
                                    ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(DefinitionGroup.aClass351_9533, DisplayModeManagerContainer64.aClass77_9029, -115));
                                    class348_sub47.particleBuffer.writeShortAdd(-88, i_77_);
                                    class348_sub47.particleBuffer.writeByteAdd((byte) -111, Component280.aClass346_2449.isKeyDown(82, -127) ? 1 : 0);
                                    HashNodeSub14.enqueueOutboundPacket(125, class348_sub47);
                                    Component10.method2252(true, (player.anIntArray10320[0]), (player.anIntArray10317[0]), (byte) -98, player.getSize((byte) 83), 0, player.getSize((byte) 91), -2, 0);
                                }
                            }
                            if (i_76_ == 9) {
                                DisplayModeManagerContainer104.anInt10364++;
                                AssetCacheLoader.anInt385 = i_73_;
                                Node.anInt4292 = 0;
                                Component20.anInt6048 = 2;
                                ToolkitFactory.anInt1534 = i_72_;
                                ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(Component278.aClass351_3237, DisplayModeManagerContainer64.aClass77_9029, -125));
                                class348_sub47.particleBuffer.writeShortAdd(-96, Component330.regionTileY + i_75_);
                                class348_sub47.particleBuffer.writeShortAddLittle(4325, 0x7fffffff & (int) (l >>> 32));
                                class348_sub47.particleBuffer.writeShortLittle(i_74_ - -NodeBaseSub2.regionTileX, (byte) 3);
                                class348_sub47.particleBuffer.writeByteAdd((byte) -91, (!Component280.aClass346_2449.isKeyDown(82, -127) ? 0 : 1));
                                HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
                                DisplayModeManagerContainer74.method2307(i_75_, l, i_74_, 24);
                            }
                            if (i_76_ == 44) {
                                NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_77_, -6008));
                                if (class348_sub22 != null) {
                                    Npc npc = (class348_sub22.npc);
                                    ToolkitFactory.anInt1534 = i_72_;
                                    Node.anInt4292 = 0;
                                    AssetCacheLoader.anInt385 = i_73_;
                                    Component20.anInt6048 = 2;
                                    DisplayModeManagerContainer306.anInt4773++;
                                    ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(CookieBuilder.aClass351_618, DisplayModeManagerContainer64.aClass77_9029, -117));
                                    class348_sub47.particleBuffer.writeShort((byte) 107, i_77_);
                                    class348_sub47.particleBuffer.writeByte(false, Component280.aClass346_2449.isKeyDown(82, -124) ? 1 : 0);
                                    HashNodeSub14.enqueueOutboundPacket(-25, class348_sub47);
                                    Component10.method2252(true, (npc.anIntArray10320[0]), (npc.anIntArray10317[0]), (byte) -107, npc.getSize((byte) 104), 0, npc.getSize((byte) 50), -2, 0);
                                }
                            }
                            if (i_76_ == 10) {
                                Component20.anInt6048 = 2;
                                AssetCacheLoader.anInt385 = i_73_;
                                Node.anInt4292 = 0;
                                Component189.anInt3820++;
                                ToolkitFactory.anInt1534 = i_72_;
                                ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(ReliefShader.aClass351_2512, DisplayModeManagerContainer64.aClass77_9029, -91));
                                class348_sub47.particleBuffer.writeShortAdd(-108, i_75_ - -Component330.regionTileY);
                                class348_sub47.particleBuffer.writeShortAdd(-70, i_77_);
                                class348_sub47.particleBuffer.writeShortLittle(NodeBaseSub2.regionTileX + i_74_, (byte) 3);
                                class348_sub47.particleBuffer.writeByteInverse((byte) -70, (!Component280.aClass346_2449.isKeyDown(82, -128) ? 0 : 1));
                                HashNodeSub14.enqueueOutboundPacket(-22, class348_sub47);
                                HashNodeSub18.method3275(1, i_75_, i_74_);
                            }
                            if (r.aBoolean9722) DisplayModeManagerContainer196.method2678(-2049);
                            if (ResourceLoader.aClass46_3913 == null || Component83.anInt1656 != 0) break;
                            Component111.markInterfaceDirty(-9343, ResourceLoader.aClass46_3913);
                        }
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("daa.A(" + i + ',' + ((class348_sub42_sub12 != null) ? "{...}" : "null") + ',' + i_72_ + ',' + i_73_ + ')'));
            }
            break;
        } while (false);
    }

    private ColoredTextBuilder(int i, int i_78_, Component342 class68) {
        try {
            anInt4072 = i_78_;
            aClass68_4071 = class68;
            this.anInt4070 = i;
            this.anInt4069 = aClass68_4071.anInt1178 * anInt4072;
            if (this.anInt4070 >= 16) throw new RuntimeException();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("daa.<init>(" + i + ',' + i_78_ + ',' + (class68 != null ? "{...}" : "null") + ')'));
        }
    }
}
