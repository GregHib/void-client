/* DisplayModeManagerContainer295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer295
/**
 * RENAMED from `Class239_Sub8` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int canvasWidth;
    static int anInt5912;
    static int anInt5913;
    static int anInt5914;
    static int anInt5915;
    static int anInt5916;
    static int anInt5917;
    static int anInt5918;
    static int anInt5919;
    static int anInt5920;
    static int[][] anIntArrayArray5921;
    static int anInt5922;
    static int anInt5923;
    static int anInt5924;

    static final int method1749(Component362 class110_sub1, Component362 class110_sub1_0_, boolean bool, int i, byte i_1_) {
        try {
            anInt5916++;
            if (i == 1) {
                int i_2_ = class110_sub1.anInt1704;
                int i_3_ = class110_sub1_0_.anInt1704;
                if (!bool) {
                    if (i_2_ == -1) i_2_ = 2001;
                    if (i_3_ == -1) i_3_ = 2001;
                }
                return -i_3_ + i_2_;
            }
            if (i == 2) return (Component71.method1811(9152, (class110_sub1_0_.method1038(false).aString3663), ObjectDeserializer.languageId, (class110_sub1.method1038(false).aString3663)));
            if (i == 3) {
                if (class110_sub1.aString5787.equals("-")) {
                    if (class110_sub1_0_.aString5787.equals("-")) return 0;
                    if (bool) return -1;
                    return 1;
                } else if (class110_sub1_0_.aString5787.equals("-")) {
                    if (!bool) return -1;
                    return 1;
                }
                return (Component71.method1811(9152, class110_sub1_0_.aString5787, ObjectDeserializer.languageId, class110_sub1.aString5787));
            }
            if (i == 4) {
                if (!class110_sub1.method1033(-85)) {
                    if (!class110_sub1_0_.method1033(101)) return 0;
                    return -1;
                }
                if (class110_sub1_0_.method1033(70)) return 0;
                return 1;
            }
            if (i == 5) {
                if (class110_sub1.method1036((byte) -35)) {
                    if (!class110_sub1_0_.method1036((byte) -35)) return 1;
                    return 0;
                }
                if (!class110_sub1_0_.method1036((byte) -35)) return 0;
                return -1;
            }
            if (i == 6) {
                if (class110_sub1.method1031(i_1_ ^ ~0x61)) {
                    if (class110_sub1_0_.method1031(-105)) return 0;
                    return 1;
                }
                if (class110_sub1_0_.method1031(i_1_ ^ ~0x60)) return -1;
                return 0;
            }
            if (i_1_ != -30) return 63;
            if (i == 7) {
                if (class110_sub1.method1029(true)) {
                    if (!class110_sub1_0_.method1029(true)) return 1;
                    return 0;
                }
                if (class110_sub1_0_.method1029(true)) return -1;
                return 0;
            }
            if (i == 8) {
                int i_4_ = class110_sub1.anInt5788;
                int i_5_ = class110_sub1_0_.anInt5788;
                if (bool) {
                    if (i_5_ == 1000) i_5_ = -1;
                    if (i_4_ == 1000) i_4_ = -1;
                } else {
                    if (i_5_ == -1) i_5_ = 1000;
                    if (i_4_ == -1) i_4_ = 1000;
                }
                return -i_5_ + i_4_;
            }
            return (class110_sub1.anInt5786 + -class110_sub1_0_.anInt5786);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("mfa.L(" + (class110_sub1 != null ? "{...}" : "null") + ',' + (class110_sub1_0_ != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_1_ + ')'));
        }
    }

    final int getDefaultValue(int i) {
        if (i != 20014) method1749(null, null, false, 94, (byte) -39);
        anInt5914++;
        // Prefer fullscreen 800x600 on mobile (voidawt fakes exclusive FS).
        return 3;
    }

    static final void method1750(int i, int i_6_) {
        anInt5912++;
        HashNodeSub1.anInt9488 = i_6_;
        Connection.aClass60_2671.clear(0);
    }

    final int method1751(int i) {
        anInt5917++;
        if (i != -32350) canvasWidth = 114;
        return this.preferenceValue;
    }

    DisplayModeManagerContainer295(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    DisplayModeManagerContainer295(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void setValue(int i, int i_7_) {
        int i_8_ = -87 / ((i - 82) / 35);
        anInt5915++;
        this.preferenceValue = i_7_;
    }

    final int getValue(int i, int i_9_) {
        if (i != 3) canvasWidth = 95;
        anInt5923++;
        return 1;
    }

    static final void method1752(int i, int i_10_, int i_11_) {
        Component210.anInt5283 = i_11_;
        anInt5922++;
        HashTable.anInt1651 = i_10_;
        if (i == -1) {
            if (Buffer.anInt7207 == 0) {
                Component25.anInt6008 = (2 * Component140.anInt10444 + HashTable.anInt1651);
                GpiLogger.anInt8854 = DisplayModeManagerContainer159.anInt2747 * 2 + Component210.anInt5283;
            } else if (Buffer.anInt7207 == 1) {
                Component82.anInt425 = (Component205.anInt5965 + Component210.anInt5283 / Component255.anInt1067 - -2);
                AudioMixer.anInt3225 = (DisplayModeManagerContainer306.anInt4784 + HashTable.anInt1651 / AbstractBuffer.anInt4267 - -2);
                GpiLogger.anInt8854 = Component255.anInt1067 * Component82.anInt425;
                Component25.anInt6008 = AbstractBuffer.anInt4267 * AudioMixer.anInt3225;
                DisplayModeManagerContainer159.anInt2747 = (-Component210.anInt5283 + GpiLogger.anInt8854 >> 1);
                Component140.anInt10444 = (Component25.anInt6008 - HashTable.anInt1651 >> 1);
            } else if (Buffer.anInt7207 == 2) {
                GpiLogger.anInt8854 = Component210.anInt5283;
                Component25.anInt6008 = HashTable.anInt1651;
            }
        }
    }

    /** "Use" / target-verb string for {@code class46} ({@link DisplayModeManagerContainer57#useOption}). */
    static final String getUseOption(int i, DisplayModeManagerContainer57 class46) {
        anInt5924++;
        if (client.getComponentSettings(class46).getClickMask(116) == 0) return null;
        if (class46.useOption == null || class46.useOption.trim().length() == 0) {
            if (DisplayModeManagerContainer356.aBoolean6327) return "Hidden-use";
            return null;
        }
        if (i != 0) return null;
        return class46.useOption;
    }

    final void validateValue(boolean bool) {
        anInt5913++;
        if (this.preferenceValue < 1 || this.preferenceValue > 3) this.preferenceValue = getDefaultValue(20014);
        if (bool != false) anIntArrayArray5921 = null;
    }

    static final int method1754(boolean bool, int i, int i_12_, int i_13_) {
        anInt5920++;
        if (Node.anInt4290 < 100) return -2;
        if (bool != true) method1754(false, 115, 112, -104);
        int i_14_ = -2;
        int i_15_ = 2147483647;
        int i_16_ = i_12_ - DisplayModeManagerContainer229.anInt1266;
        int i_17_ = i_13_ - DisplayModeManagerContainer229.anInt1263;
        for (NodeSub21 class348_sub21 = (NodeSub21) DisplayModeManagerContainer229.aClass262_1254.first(4); class348_sub21 != null; class348_sub21 = (NodeSub21) DisplayModeManagerContainer229.aClass262_1254.next((byte) 113)) {
            if (class348_sub21.anInt6847 == i) {
                int i_18_ = class348_sub21.anInt6852;
                int i_19_ = class348_sub21.anInt6851;
                int i_20_ = (i_19_ - -DisplayModeManagerContainer229.anInt1263 | DisplayModeManagerContainer229.anInt1266 + i_18_ << 14);
                int i_21_ = ((-i_19_ + i_17_) * (-i_19_ + i_17_) + (i_16_ - i_18_) * (-i_18_ + i_16_));
                if (i_14_ < 0 || i_15_ > i_21_) {
                    i_15_ = i_21_;
                    i_14_ = i_20_;
                }
            }
        }
        return i_14_;
    }

    public static void method1755(int i) {
        anIntArrayArray5921 = null;
        if (i != 1) method1749(null, null, false, -43, (byte) 102);
    }

    static final int method1756(byte[] is, int i, int i_22_, int i_23_, byte[][] is_24_, byte[][] is_25_, int[] is_26_, int[] is_27_) {
        try {
            anInt5918++;
            int i_28_ = -19 % ((i - 64) / 39);
            int i_29_ = is_26_[i_23_];
            int i_30_ = is_27_[i_23_] + i_29_;
            int i_31_ = is_26_[i_22_];
            int i_32_ = is_27_[i_22_] + i_31_;
            int i_33_ = i_29_;
            if (i_29_ < i_31_) i_33_ = i_31_;
            int i_34_ = i_30_;
            if (i_32_ < i_30_) i_34_ = i_32_;
            int i_35_ = 0xff & is[i_23_];
            if (i_35_ > (is[i_22_] & 0xff)) i_35_ = 0xff & is[i_22_];
            byte[] is_36_ = is_25_[i_23_];
            byte[] is_37_ = is_24_[i_22_];
            int i_38_ = i_33_ + -i_29_;
            int i_39_ = -i_31_ + i_33_;
            for (int i_40_ = i_33_; i_34_ > i_40_; i_40_++) {
                int i_41_ = is_37_[i_39_++] + is_36_[i_38_++];
                if (i_41_ < i_35_) i_35_ = i_41_;
            }
            return -i_35_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("mfa.K(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_22_ + ',' + i_23_ + ',' + (is_24_ != null ? "{...}" : "null") + ',' + (is_25_ != null ? "{...}" : "null") + ',' + (is_26_ != null ? "{...}" : "null") + ',' + (is_27_ != null ? "{...}" : "null") + ')'));
        }
    }
}
