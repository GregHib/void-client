/* AbstractShaderSub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AbstractShaderSub4
/**
 * RENAMED from `Class367_Sub4` (JODE-obfuscated).
 * Evidence: subclass of AbstractShader (hierarchy)
 */ extends AbstractShader {
    static int anInt7308;
    static int anInt7309;
    static int anInt7310;
    private boolean aBoolean7311;
    static int anInt7312;
    static int anInt7313;
    static int anInt7314;
    private Interface18_Impl2[] anInterface18_Impl2Array7315;
    static int anInt7316;
    private boolean aBoolean7317 = false;
    static StringCache aClass351_7318 = new StringCache(21, 2);
    static int anInt7319 = 104;
    static boolean aBoolean7320 = false;
    static int anInt7321;
    static int anInt7322;
    static Component183 aClass114_7323 = new Component183(105, -2);
    static Component183 aClass114_7324 = new Component183(96, 8);
    static HashTable aClass107_7325 = new HashTable();

    AbstractShaderSub4(GlToolkitSub3 var_ha_Sub3) {
        super(var_ha_Sub3);
        if (var_ha_Sub3.aBoolean8101) {
            aBoolean7311 = var_ha_Sub3.anInt8090 < 3;
            int i = aBoolean7311 ? 48 : 127;
            int[][] is = new int[6][4096];
            int[][] is_0_ = new int[6][4096];
            int[][] is_1_ = new int[6][4096];
            int i_2_ = 0;
            for (int i_3_ = 0; i_3_ < 64; i_3_++) {
                for (int i_4_ = 0; i_4_ < 64; i_4_++) {
                    float f = -1.0F + (float) i_3_ * 2.0F / 64.0F;
                    float f_5_ = 2.0F * (float) i_4_ / 64.0F - 1.0F;
                    float f_6_ = (float) (1.0 / Math.sqrt(f * f + (1.0F + f_5_ * f_5_)));
                    f *= f_6_;
                    f_5_ *= f_6_;
                    for (int i_7_ = 0; i_7_ < 6; i_7_++) {
                        float f_8_;
                        if (i_7_ != 0) {
                            if (i_7_ != 1) {
                                if (i_7_ == 2) f_8_ = f;
                                else if (i_7_ == 3) f_8_ = -f;
                                else if (i_7_ != 4) f_8_ = -f_6_;
                                else f_8_ = f_6_;
                            } else f_8_ = f_5_;
                        } else f_8_ = -f_5_;
                        int i_9_;
                        int i_10_;
                        int i_11_;
                        if (f_8_ > 0.0F) {
                            i_9_ = (int) ((double) i * Math.pow(f_8_, 96.0));
                            i_10_ = (int) ((double) i * Math.pow(f_8_, 36.0));
                            i_11_ = (int) (Math.pow(f_8_, 12.0) * (double) i);
                        } else i_9_ = i_10_ = i_11_ = 0;
                        is_0_[i_7_][i_2_] = i_9_ << 24;
                        is_1_[i_7_][i_2_] = i_10_ << 24;
                        is[i_7_][i_2_] = i_11_ << 24;
                    }
                    i_2_++;
                }
            }
            anInterface18_Impl2Array7315 = new Interface18_Impl2[3];
            anInterface18_Impl2Array7315[0] = this.aHa_Sub3_4479.hint(is_0_, false, 52, 64);
            anInterface18_Impl2Array7315[1] = this.aHa_Sub3_4479.hint(is_1_, false, 3, 64);
            anInterface18_Impl2Array7315[2] = this.aHa_Sub3_4479.hint(is, false, 17, 64);
        }
    }

    final boolean method3530(int i) {
        anInt7314++;
        if (i > -57) method3525(91, false);
        return true;
    }

    public static void method3541(byte i) {
        aClass114_7323 = null;
        aClass114_7324 = null;
        aClass107_7325 = null;
        if (i == 23) aClass351_7318 = null;
    }

    final void method3525(int i, boolean bool) {
        if (i != 15192) method3527(-85, null, -72);
        if (anInterface18_Impl2Array7315 != null && bool) {
            this.aHa_Sub3_4479.setActiveTextureUnit(1, -4382);
            this.aHa_Sub3_4479.getTexParameter(Component82.aClass113_430, 0);
            MatrixSub2 class101_sub2 = this.aHa_Sub3_4479.getUniformLocation(false);
            class101_sub2.method899(1024);
            this.aHa_Sub3_4479.deleteVertexArrays(-32, DefinitionSub38.aClass251_9477);
            if (aBoolean7311) {
                this.aHa_Sub3_4479.texStorage3D((ShaderCompilerSub3.aClass229_6519), 113, (DisplayModeManagerContainer64.aClass229_9011));
                this.aHa_Sub3_4479.getSwapInterval(true, false, 0, DisplayModeManagerContainer173.aClass70_4247, false);
                this.aHa_Sub3_4479.setTextureEnvironment(0, true, DebugPanicSub2.aClass70_8503);
            } else {
                this.aHa_Sub3_4479.texStorage3D((Component385.aClass229_2207), 117, (ShaderCompilerSub3.aClass229_6519));
                this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, (DisplayModeManagerContainer343.aClass70_8737));
                this.aHa_Sub3_4479.setActiveTextureUnit(2, -4382);
                this.aHa_Sub3_4479.texStorage3D((ShaderCompilerSub3.aClass229_6519), 122, (DisplayModeManagerContainer64.aClass229_9011));
                this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, (DisplayModeManagerContainer343.aClass70_8737));
                this.aHa_Sub3_4479.getSwapInterval(true, false, 1, (DisplayModeManagerContainer343.aClass70_8737), false);
                this.aHa_Sub3_4479.setTextureEnvironment(0, true, DebugPanicSub2.aClass70_8503);
                this.aHa_Sub3_4479.setActiveTexture((byte) -61, (this.aHa_Sub3_4479.anInterface18_8147));
            }
            this.aHa_Sub3_4479.setActiveTextureUnit(0, i + -19574);
            aBoolean7317 = true;
        } else this.aHa_Sub3_4479.setTextureEnvironment(0, true, DebugPanicSub2.aClass70_8503);
        anInt7313++;
    }

    final void method3527(int i, Interface18 interface18, int i_12_) {
        anInt7316++;
        this.aHa_Sub3_4479.setActiveTexture((byte) 91, interface18);
        this.aHa_Sub3_4479.swapInterval2(true, i);
        if (i_12_ != -16776) method3525(61, true);
    }

    final void method3520(byte i) {
        if (aBoolean7317) {
            this.aHa_Sub3_4479.setActiveTextureUnit(1, i ^ ~0x114a);
            this.aHa_Sub3_4479.setActiveTexture((byte) -121, null);
            this.aHa_Sub3_4479.getTexParameter(Component324.aClass113_2047, 0);
            this.aHa_Sub3_4479.getProgramInfoLog(-8629);
            if (aBoolean7311) {
                this.aHa_Sub3_4479.texStorage3D(Component385.aClass229_2207, 120, Component385.aClass229_2207);
                this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DisplayModeManagerContainer173.aClass70_4247);
                this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer173.aClass70_4247);
            } else {
                this.aHa_Sub3_4479.texStorage3D(Component385.aClass229_2207, 115, Component385.aClass229_2207);
                this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DisplayModeManagerContainer173.aClass70_4247);
                this.aHa_Sub3_4479.setActiveTextureUnit(2, i + -4469);
                this.aHa_Sub3_4479.texStorage3D((Component385.aClass229_2207), i ^ 0x21, (Component385.aClass229_2207));
                this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DisplayModeManagerContainer173.aClass70_4247);
                this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 1, (DisplayModeManagerContainer343.aClass70_8737));
                this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer173.aClass70_4247);
                this.aHa_Sub3_4479.setActiveTexture((byte) 64, null);
            }
            this.aHa_Sub3_4479.setActiveTextureUnit(0, i ^ ~0x114a);
            aBoolean7317 = false;
        } else this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer173.aClass70_4247);
        anInt7312++;
        if (i != 87) aBoolean7311 = true;
        this.aHa_Sub3_4479.texStorage3D(Component385.aClass229_2207, i + 13, Component385.aClass229_2207);
    }

    static final boolean method3542(int i, Component186[][][] class357s, int i_13_, int i_14_, int i_15_, boolean bool) {
        anInt7310++;
        byte i_16_ = bool ? (byte) 1 : (byte) (DisplayModeManagerContainer341.anInt6006 & 0xff);
        if (i_16_ == Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_13_][i]) return false;
        if (((ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_13_][i]) & 0x4) == 0) return false;
        int i_17_ = i_14_;
        int i_18_ = 0;
        NodeSub16Sub2.anIntArray8862[i_17_] = i_13_;
        Exception_Sub1.anIntArray110[i_17_++] = i;
        Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_13_][i] = i_16_;
        while (i_17_ != i_18_) {
            int i_19_ = 0xffff & NodeSub16Sub2.anIntArray8862[i_18_];
            int i_20_ = ((NodeSub16Sub2.anIntArray8862[i_18_] & 0xff3677) >> 16);
            int i_21_ = (0xff & NodeSub16Sub2.anIntArray8862[i_18_] >> 24);
            int i_22_ = 0xffff & Exception_Sub1.anIntArray110[i_18_];
            int i_23_ = ((0xff5347 & Exception_Sub1.anIntArray110[i_18_]) >> 16);
            i_18_ = i_18_ + 1 & 0xfff;
            boolean bool_24_ = false;
            if ((0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_19_][i_22_])) == 0) bool_24_ = true;
            boolean bool_25_ = false;
            if (class357s != null) {
                int i_26_ = Component117.anInt4372 + 1;
                while_223_:
                for (/**/; i_26_ <= 3; i_26_++) {
                    if (class357s[i_26_] != null && (0x8 & (ObjectDeserializer.aByteArrayArrayArray6962[i_26_][i_19_][i_22_])) == 0) {
                        if (bool_24_ && class357s[i_26_][i_19_][i_22_] != null) {
                            if ((class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4406) != null) {
                                int i_27_ = Component135.method3492(i_20_, 226);
                                if (((class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4406.aShort8759) == i_27_) || ((class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4403) != null && (i_27_ == (class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4403.aShort8759)))) continue;
                                if (i_21_ != 0) {
                                    int i_28_ = Component135.method3492(i_21_, 226);
                                    if (((class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4406.aShort8759) == i_28_) || ((class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4403) != null && ((class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4403.aShort8759) == i_28_))) continue;
                                }
                                if (i_23_ != 0) {
                                    int i_29_ = Component135.method3492(i_23_, 226);
                                    if ((class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4406.aShort8759) == i_29_ || ((class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4403) != null && (i_29_ == (class357s[i_26_][i_19_][i_22_].aClass318_Sub1_Sub4_4403.aShort8759)))) continue;
                                }
                            }
                            Component186 class357 = class357s[i_26_][i_19_][i_22_];
                            if (class357.aClass148_4396 != null) {
                                for (Component3 class148 = (class357.aClass148_4396); class148 != null; class148 = (class148.aClass148_2038)) {
                                    Component327 class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040);
                                    if (class318_sub1_sub3 instanceof Interface10) {
                                        Interface10 interface10 = (Interface10) class318_sub1_sub3;
                                        int i_30_ = interface10.method39(59);
                                        int i_31_ = interface10.method41(-32228);
                                        if (i_30_ == 21) i_30_ = 19;
                                        int i_32_ = i_31_ << 6 | i_30_;
                                        if (i_32_ == i_20_ || i_21_ != 0 && i_21_ == i_32_ || i_23_ != 0 && i_23_ == i_32_) continue while_223_;
                                    }
                                }
                            }
                        }
                        Component186 class357 = class357s[i_26_][i_19_][i_22_];
                        if (class357 != null && class357.aClass148_4396 != null) {
                            for (Component3 class148 = class357.aClass148_4396; class148 != null; class148 = class148.aClass148_2038) {
                                Component327 class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040);
                                if (((class318_sub1_sub3.aShort8743) != class318_sub1_sub3.aShort8751) || (class318_sub1_sub3.aShort8750 != class318_sub1_sub3.aShort8747)) {
                                    for (int i_33_ = (class318_sub1_sub3.aShort8743); (i_33_ <= class318_sub1_sub3.aShort8751); i_33_++) {
                                        for (int i_34_ = (class318_sub1_sub3.aShort8750); (i_34_ <= class318_sub1_sub3.aShort8747); i_34_++)
                                            Component156.aByteArrayArrayArray3700[i_26_][i_33_][i_34_] = i_16_;
                                    }
                                }
                            }
                        }
                        Component156.aByteArrayArrayArray3700[i_26_][i_19_][i_22_] = i_16_;
                        bool_25_ = true;
                    }
                }
            }
            if (bool_25_) {
                int i_35_ = ShaderSub1.aSArray5191[1 + Component117.anInt4372].getHeight((byte) -86, i_22_, i_19_);
                if (i_35_ > DisplayModeManagerContainer363.anIntArray4097[i_15_]) DisplayModeManagerContainer363.anIntArray4097[i_15_] = i_35_;
                int i_36_ = i_19_ << 9;
                if (i_36_ < ClientErrorReporter.anIntArray2117[i_15_]) ClientErrorReporter.anIntArray2117[i_15_] = i_36_;
                else if (i_36_ > DefinitionSub19.anIntArray9259[i_15_]) DefinitionSub19.anIntArray9259[i_15_] = i_36_;
                int i_37_ = i_22_ << 9;
                if (i_37_ >= DisplayModeManagerContainer370.anIntArray1127[i_15_]) {
                    if (LoadingState.anIntArray1045[i_15_] < i_37_) LoadingState.anIntArray1045[i_15_] = i_37_;
                } else DisplayModeManagerContainer370.anIntArray1127[i_15_] = i_37_;
            }
            if (!bool_24_) {
                if (i_19_ >= 1 && (Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_ - 1][i_22_]) != i_16_) {
                    NodeSub16Sub2.anIntArray8862[i_17_] = Component224.bitwiseOr(Component224.bitwiseOr(1179648, i_19_ + -1), -754974720);
                    Exception_Sub1.anIntArray110[i_17_] = Component224.bitwiseOr(i_22_, 1245184);
                    i_17_ = 0xfff & 1 + i_17_;
                    Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_ - 1][i_22_] = i_16_;
                }
                if (++i_22_ < ParametricDefinition.anInt9109) {
                    if (i_19_ - 1 >= 0 && i_16_ != (Component156.aByteArrayArrayArray3700[Component117.anInt4372][-1 + i_19_][i_22_]) && ((ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_19_][i_22_]) & 0x4) == 0 && (0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][-1 + i_19_][-1 + i_22_])) == 0) {
                        NodeSub16Sub2.anIntArray8862[i_17_] = (Component224.bitwiseOr(1375731712, Component224.bitwiseOr(i_19_ + -1, 1179648)));
                        Exception_Sub1.anIntArray110[i_17_] = Component224.bitwiseOr(i_22_, 1245184);
                        Component156.aByteArrayArrayArray3700[Component117.anInt4372][-1 + i_19_][i_22_] = i_16_;
                        i_17_ = 0xfff & 1 + i_17_;
                    }
                    if ((Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_][i_22_]) != i_16_) {
                        NodeSub16Sub2.anIntArray8862[i_17_] = (Component224.bitwiseOr(318767104, Component224.bitwiseOr(i_19_, 5373952)));
                        Exception_Sub1.anIntArray110[i_17_] = Component224.bitwiseOr(i_22_, 5439488);
                        Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_][i_22_] = i_16_;
                        i_17_ = i_17_ + 1 & 0xfff;
                    }
                    if (1 + i_19_ < anInt7319 && ((Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_ + 1][i_22_]) != i_16_) && (0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_19_][i_22_])) == 0 && (0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][1 + i_19_][i_22_ + -1])) == 0) {
                        NodeSub16Sub2.anIntArray8862[i_17_] = (Component224.bitwiseOr(-1845493760, Component224.bitwiseOr(1 + i_19_, 5373952)));
                        Exception_Sub1.anIntArray110[i_17_] = Component224.bitwiseOr(5439488, i_22_);
                        i_17_ = 1 + i_17_ & 0xfff;
                        Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_ - -1][i_22_] = i_16_;
                    }
                }
                i_22_--;
                if (i_19_ - -1 < anInt7319 && (Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_ - -1][i_22_]) != i_16_) {
                    NodeSub16Sub2.anIntArray8862[i_17_] = Component224.bitwiseOr(1392508928, Component224.bitwiseOr(9568256, 1 + i_19_));
                    Exception_Sub1.anIntArray110[i_17_] = Component224.bitwiseOr(i_22_, 9633792);
                    i_17_ = 1 + i_17_ & 0xfff;
                    Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_ - -1][i_22_] = i_16_;
                }
                if (--i_22_ >= 0) {
                    if (i_19_ + -1 >= 0 && i_16_ != (Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_ - 1][i_22_]) && (0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_19_][i_22_])) == 0 && (0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][-1 + i_19_][1 + i_22_])) == 0) {
                        NodeSub16Sub2.anIntArray8862[i_17_] = (Component224.bitwiseOr(301989888, Component224.bitwiseOr(13762560, -1 + i_19_)));
                        Exception_Sub1.anIntArray110[i_17_] = Component224.bitwiseOr(i_22_, 13828096);
                        Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_ - 1][i_22_] = i_16_;
                        i_17_ = i_17_ - -1 & 0xfff;
                    }
                    if ((Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_][i_22_]) != i_16_) {
                        NodeSub16Sub2.anIntArray8862[i_17_] = Component224.bitwiseOr(Component224.bitwiseOr(13762560, i_19_), -1828716544);
                        Exception_Sub1.anIntArray110[i_17_] = Component224.bitwiseOr(13828096, i_22_);
                        Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_][i_22_] = i_16_;
                        i_17_ = 0xfff & i_17_ - -1;
                    }
                    if (anInt7319 > 1 + i_19_ && (Component156.aByteArrayArrayArray3700[Component117.anInt4372][1 + i_19_][i_22_]) != i_16_ && ((ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_19_][i_22_]) & 0x4) == 0 && ((ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_19_ + 1][i_22_ + 1]) & 0x4) == 0) {
                        NodeSub16Sub2.anIntArray8862[i_17_] = (Component224.bitwiseOr(-771751936, Component224.bitwiseOr(i_19_ - -1, 9568256)));
                        Exception_Sub1.anIntArray110[i_17_] = Component224.bitwiseOr(i_22_, 9633792);
                        Component156.aByteArrayArrayArray3700[Component117.anInt4372][i_19_ - -1][i_22_] = i_16_;
                        i_17_ = 0xfff & i_17_ - -1;
                    }
                }
            }
        }
        if (DisplayModeManagerContainer363.anIntArray4097[i_15_] != -1000000) {
            DisplayModeManagerContainer363.anIntArray4097[i_15_] += 40;
            ClientErrorReporter.anIntArray2117[i_15_] -= 512;
            DefinitionSub19.anIntArray9259[i_15_] += 512;
            LoadingState.anIntArray1045[i_15_] += 512;
            DisplayModeManagerContainer370.anIntArray1127[i_15_] -= 512;
        }
        return true;
    }

    /** Close the developer console and refresh related UI. */
    static final void closeDevConsole(byte i) {
        anInt7309++;
        if (i == -89) {
            StringCache.devConsoleOpen = false;
            Component160.method3466(i + 6);
        }
    }

    /** Write {@code string} as Huffman-compressed CP1252; returns bytes written. */
    static final int writeHuffmanString(Buffer class348_sub49, int i, String string) {
        try {
            anInt7321++;
            int i_38_ = class348_sub49.offset;
            byte[] is = ClientSystemInfo.encodeCp1252(string, (byte) -20);
            int i_39_ = 1 % ((-6 - i) / 63);
            class348_sub49.writeSmart(5537, is.length);
            class348_sub49.offset += (DisplayModeManagerContainer370.huffman.compress(is.length, 0, class348_sub49.offset, is, 103, class348_sub49.payload));
            return class348_sub49.offset + -i_38_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bk.O(" + (class348_sub49 != null ? "{...}" : "null") + ',' + i + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    final void method3521(boolean bool, byte i) {
        this.aHa_Sub3_4479.texStorage3D((ShaderCompilerSub3.aClass229_6519), 126, Component385.aClass229_2207);
        if (i != -103) method3542(74, null, 65, 65, -77, true);
        anInt7308++;
    }

    final void method3526(int i, int i_40_, int i_41_) {
        if (i != 10756) method3520((byte) -127);
        if (aBoolean7317) {
            this.aHa_Sub3_4479.setActiveTextureUnit(1, i + -15138);
            this.aHa_Sub3_4479.setActiveTexture((byte) -67, anInterface18_Impl2Array7315[-1 + i_40_]);
            this.aHa_Sub3_4479.setActiveTextureUnit(0, i ^ ~0x3b19);
        }
        anInt7322++;
    }
}
