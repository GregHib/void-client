/* StringDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub42_Sub11` (JODE-obfuscated).
 * Text/string definition node (extends renamed HashNode). Parses char[]/String fields from a Buffer (method3221); holds char arrays and a StringCache for cached string table entries.
 */

final class StringDefinition extends HashNode {
    static int anInt9579;
    int[] anIntArray9580;
    static int anInt9581;
    char[] aCharArray9582;
    static int anInt9583;
    static int anInt9584;
    static int anInt9585;
    static int anInt9586;
    String aString9587;
    char[] aCharArray9588;
    static int anInt9589;
    static StringCache aClass351_9590 = new StringCache(83, -1);
    static int anInt9591 = -1;
    int[] anIntArray9592;

    public static void method3220(byte i) {
        if (i < 96) anInt9591 = 45;
        aClass351_9590 = null;
    }

    final void method3221(int i, Buffer class348_sub49) {
        int i_0_ = 81 / ((-39 - i) / 52);
        anInt9583++;
        for (; ; ) {
            int i_1_ = class348_sub49.readUnsignedByte(255);
            if (i_1_ == 0) break;
            method3227(-5847, class348_sub49, i_1_);
        }
    }

    final int method3222(byte i, char c) {
        anInt9585++;
        if (this.anIntArray9580 == null) return -1;
        int i_2_ = 0;
        if (i > -97) method3221(126, null);
        for (/**/; this.anIntArray9580.length > i_2_; i_2_++) {
            if (this.aCharArray9582[i_2_] == c) return this.anIntArray9580[i_2_];
        }
        return -1;
    }

    static final void method3223() {
        for (int i = 0; i < Component328.dynamicOnscreenCount; i++) {
            Component327 class318_sub1_sub3 = DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357[i];
            NodeSub46.method3320(class318_sub1_sub3, true);
            DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357[i] = null;
        }
        Component328.dynamicOnscreenCount = 0;
    }

    final void method3224(byte i) {
        if (this.anIntArray9580 != null) {
            for (int i_3_ = 0; (this.anIntArray9580.length > i_3_); i_3_++)
                this.anIntArray9580[i_3_] = Component224.bitwiseOr((this.anIntArray9580[i_3_]), 32768);
        }
        anInt9579++;
        if (this.anIntArray9592 != null) {
            for (int i_4_ = 0; (this.anIntArray9592.length > i_4_); i_4_++)
                this.anIntArray9592[i_4_] = Component224.bitwiseOr((this.anIntArray9592[i_4_]), 32768);
        }
        if (i <= 102) method3222((byte) 78, '\uffc1');
    }

    static final void method3225(int i) {
        anInt9589++;
        if (Component192.preferences.aClass239_Sub14_7264.method1778(-32350) == 2) {
            byte i_5_ = (byte) (0xff & -4 + DisplayModeManagerContainer341.anInt6006);
            int i_6_ = DisplayModeManagerContainer341.anInt6006 % AbstractShaderSub4.anInt7319;
            for (int i_7_ = 0; i_7_ < 4; i_7_++) {
                for (int i_8_ = 0; ParametricDefinition.anInt9109 > i_8_; i_8_++)
                    Component156.aByteArrayArrayArray3700[i_7_][i_6_][i_8_] = i_5_;
            }
            if (Component117.anInt4372 != 3) {
                for (int i_9_ = 0; i_9_ < 2; i_9_++) {
                    DisplayModeManagerContainer363.anIntArray4097[i_9_] = -1000000;
                    ClientErrorReporter.anIntArray2117[i_9_] = 1000000;
                    DefinitionSub19.anIntArray9259[i_9_] = 0;
                    DisplayModeManagerContainer370.anIntArray1127[i_9_] = 1000000;
                    LoadingState.anIntArray1045[i_9_] = 0;
                }
                int i_10_ = (Component72.localPlayer.x);
                int i_11_ = (Component72.localPlayer.y);
                if (i >= 100) {
                    if (DefinitionSub21.cameraMode == 1 || JaclibLoader.anInt167 != -1) {
                        if (DefinitionSub21.cameraMode != 1) {
                            i_11_ = ShaderLinker.anInt10163;
                            i_10_ = JaclibLoader.anInt167;
                        }
                        if ((0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_10_ >> 9][i_11_ >> 9])) != 0) AbstractShaderSub4.method3542(i_11_ >> 9, Component335.aClass357ArrayArrayArray2029, i_10_ >> 9, 0, 0, false);
                        if (HashNodeSub19.anInt9701 < 2560) {
                            int i_12_ = WaterSurfaceShader.anInt6246 >> 9;
                            int i_13_ = Component317.anInt8685 >> 9;
                            int i_14_ = i_10_ >> 9;
                            int i_15_ = i_11_ >> 9;
                            int i_16_;
                            if (i_14_ > i_12_) i_16_ = i_14_ + -i_12_;
                            else i_16_ = i_12_ + -i_14_;
                            int i_17_;
                            if (i_15_ <= i_13_) i_17_ = -i_15_ + i_13_;
                            else i_17_ = i_15_ + -i_13_;
                            if (i_16_ == 0 && i_17_ == 0 || -AbstractShaderSub4.anInt7319 >= i_16_ || (AbstractShaderSub4.anInt7319 <= i_16_) || i_17_ <= -ParametricDefinition.anInt9109 || ParametricDefinition.anInt9109 <= i_17_)
                                ClientErrorReporter.reportError(("RC: " + i_12_ + "," + i_13_ + " " + i_14_ + "," + i_15_ + " " + NodeBaseSub2.regionTileX + "," + Component330.regionTileY), null, 15004);
                            else if (i_16_ <= i_17_) {
                                int i_18_ = i_16_ * 65536 / i_17_;
                                int i_19_ = 32768;
                                while (i_15_ != i_13_) {
                                    if (i_15_ > i_13_) i_13_++;
                                    else if (i_15_ < i_13_) i_13_--;
                                    if ((0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_12_][i_13_])) != 0) {
                                        AbstractShaderSub4.method3542(i_13_, (Component335.aClass357ArrayArrayArray2029), i_12_, 0, 1, false);
                                        break;
                                    }
                                    i_19_ += i_18_;
                                    if (i_19_ >= 65536) {
                                        if (i_12_ < i_14_) i_12_++;
                                        else if (i_14_ < i_12_) i_12_--;
                                        i_19_ -= 65536;
                                        if ((0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_12_][i_13_])) != 0) {
                                            AbstractShaderSub4.method3542(i_13_, (Component335.aClass357ArrayArrayArray2029), i_12_, 0, 1, false);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                int i_20_ = 65536 * i_17_ / i_16_;
                                int i_21_ = 32768;
                                while (i_14_ != i_12_) {
                                    if (i_12_ >= i_14_) {
                                        if (i_12_ > i_14_) i_12_--;
                                    } else i_12_++;
                                    if ((0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_12_][i_13_])) != 0) {
                                        AbstractShaderSub4.method3542(i_13_, (Component335.aClass357ArrayArrayArray2029), i_12_, 0, 1, false);
                                        break;
                                    }
                                    i_21_ += i_20_;
                                    if (i_21_ >= 65536) {
                                        if (i_15_ > i_13_) i_13_++;
                                        else if (i_13_ > i_15_) i_13_--;
                                        i_21_ -= 65536;
                                        if ((0x4 & (ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][i_12_][i_13_])) != 0) {
                                            AbstractShaderSub4.method3542(i_13_, (Component335.aClass357ArrayArrayArray2029), i_12_, 0, 1, false);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int i_22_ = Component300.method2064(WaterSurfaceShader.anInt6246, Component117.anInt4372, 11219, Component317.anInt8685);
                        if (i_22_ - DisplayModeManagerContainer50.anInt3855 < 3200 && ((ObjectDeserializer.aByteArrayArrayArray6962[Component117.anInt4372][WaterSurfaceShader.anInt6246 >> 9][Component317.anInt8685 >> 9]) & 0x4) != 0)
                            AbstractShaderSub4.method3542(Component317.anInt8685 >> 9, Component335.aClass357ArrayArrayArray2029, WaterSurfaceShader.anInt6246 >> 9, 0, 1, false);
                    }
                }
            }
        }
    }

    final int method3226(char c, int i) {
        anInt9584++;
        if (this.anIntArray9592 == null) return -1;
        for (int i_23_ = 0; this.anIntArray9592.length > i_23_; i_23_++) {
            if (this.aCharArray9588[i_23_] == c) return this.anIntArray9592[i_23_];
        }
        if (i != 57249897) method3221(-16, null);
        return -1;
    }

    private final void method3227(int i, Buffer class348_sub49, int i_24_) {
        if (i_24_ != 1) {
            if (i_24_ == 2) {
                int i_25_ = class348_sub49.readUnsignedByte(255);
                this.anIntArray9592 = new int[i_25_];
                this.aCharArray9588 = new char[i_25_];
                for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
                    this.anIntArray9592[i_26_] = class348_sub49.readUnsignedShort(842397944);
                    byte i_27_ = class348_sub49.readByte(-121);
                    this.aCharArray9588[i_26_] = (i_27_ != 0 ? Cp1252Decoder.method462(i_27_, -128) : '\0');
                }
            } else if (i_24_ == 3) {
                int i_28_ = class348_sub49.readUnsignedByte(255);
                this.aCharArray9582 = new char[i_28_];
                this.anIntArray9580 = new int[i_28_];
                for (int i_29_ = 0; i_28_ > i_29_; i_29_++) {
                    this.anIntArray9580[i_29_] = class348_sub49.readUnsignedShort(842397944);
                    byte i_30_ = class348_sub49.readByte(-115);
                    this.aCharArray9582[i_29_] = (i_30_ != 0 ? Cp1252Decoder.method462(i_30_, -128) : '\0');
                }
            }
        } else this.aString9587 = class348_sub49.readString((byte) 100);
        if (i != -5847) anInt9586 = 12;
        anInt9581++;
    }

    public StringDefinition() {
        /* empty */
    }
}
