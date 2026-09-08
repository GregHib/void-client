/* Component66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component66
/**
 * RENAMED from `Class239_Sub17` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static Component224 aClass273_6018 = new Component224("", 14);
    static int anInt6019;
    static int anInt6020;
    static int[] anIntArray6021;
    static int anInt6022;
    static int anInt6023;
    static int anInt6024;
    static int anInt6025;
    static int anInt6026;
    static int anInt6027;
    static int anInt6028;

    static final String method1793(byte[] is, int i, int i_0_, int i_1_) {
        anInt6020++;
        char[] cs = new char[i_1_];
        int i_2_ = 0;
        if (i_0_ >= -82) return null;
        int i_3_ = i;
        int i_4_ = i_1_ + i;
        while (i_4_ > i_3_) {
            int i_5_ = 0xff & is[i_3_++];
            int i_6_;
            if (i_5_ < 128) {
                if (i_5_ == 0) i_6_ = 65533;
                else i_6_ = i_5_;
            } else if (i_5_ >= 192) {
                if (i_5_ >= 224) {
                    if (i_5_ < 240) {
                        if (i_3_ + 1 < i_4_ && (is[i_3_] & 0xc0) == 128 && (0xc0 & is[1 + i_3_]) == 128) {
                            i_6_ = ((i_5_ & 0xf) << 12 | is[i_3_++] << 6 & 0xfc0 | is[i_3_++] & 0x3f);
                            if (i_6_ < 2048) i_6_ = 65533;
                        } else i_6_ = 65533;
                    } else if (i_5_ >= 248) i_6_ = 65533;
                    else if (i_4_ <= i_3_ - -2 || (0xc0 & is[i_3_]) != 128 || (0xc0 & is[1 + i_3_]) != 128 || (is[2 + i_3_] & 0xc0) != 128) i_6_ = 65533;
                    else {
                        i_6_ = (i_5_ << 18 & 0x1c0000 | (is[i_3_++] & 0x3f) << 12 | 0xfc0 & is[i_3_++] << 6 | 0x3f & is[i_3_++]);
                        if (i_6_ >= 65536 && i_6_ <= 1114111) i_6_ = 65533;
                        else i_6_ = 65533;
                    }
                } else if (i_3_ >= i_4_ || (0xc0 & is[i_3_]) != 128) i_6_ = 65533;
                else {
                    i_6_ = is[i_3_++] & 0x3f | i_5_ << 6 & 0x7c0;
                    if (i_6_ < 128) i_6_ = 65533;
                }
            } else i_6_ = 65533;
            cs[i_2_++] = (char) i_6_;
        }
        return new String(cs, 0, i_2_);
    }

    final int getValue(int i, int i_7_) {
        anInt6023++;
        if (i != 3) return 49;
        return 1;
    }

    final void setValue(int i, int i_8_) {
        int i_9_ = -117 % ((82 - i) / 35);
        this.preferenceValue = i_8_;
        anInt6025++;
    }

    public static void method1794(int i) {
        if (i != 63) anIntArray6021 = null;
        aClass273_6018 = null;
        anIntArray6021 = null;
    }

    final void validateValue(boolean bool) {
        if (bool != false) method1793(null, 50, -30, -126);
        if (this.preferenceValue < 0 && this.preferenceValue > 4) this.preferenceValue = getDefaultValue(20014);
        anInt6024++;
    }

    static final String method1795(byte[] is, boolean bool) {
        if (bool != true) buildComponentMenu(4, -104, null, (byte) -82);
        anInt6026++;
        return WaterShaderSub8.decodeCp1252(is, 0, is.length, 0);
    }

    /** True when {@code i_10_} is an interface-item menu opcode (CC_OP 18/1011, Use 13, Continue 16, …). */
    static final boolean isInterfaceItemOpcode(int i, int i_10_) {
        if (i < 53) return true;
        anInt6019++;
        return i_10_ == 18 || i_10_ == 6 || i_10_ == 1011 || i_10_ == 13 || i_10_ == 16;
    }

    /**
     * Builds right-click options for an interface component (inventory, bank, …).
     * When the component holds an item ({@code itemId}), preferred left-click
     * is boosted and {@link DefaultClickSwapper} / {@link JoystickAlias} rows are injected.
     */
    static final void buildComponentMenu(int i, int i_11_, DisplayModeManagerContainer57 class46, byte i_12_) {
        // Preferred inventory/bank action for this item id (Wear, Withdraw-All, …).
        String preferredItem = DefaultClickSwapper.getPreferredItemAction(class46.itemId);
        if (r.aBoolean9722) {
            Component355 class254 = (Component163.anInt3176 != -1 ? MatrixSub3.aClass326_5764.method2600(Component163.anInt3176, 28364) : null);
            if (client.getComponentSettings(class46).canBeTargeted(1) && (PauseTimer.anInt500 & 0x20) != 0 && (class254 == null || (class46.method428(class254.anInt3256, Component163.anInt3176, -128) != class254.anInt3256))) {
                Component82.anInt436++;
                DisplayModeManagerContainer368.addMenuEntry(false, (DisplayModeManagerContainer332.aString5000 + " -> " + class46.text) + Loader.getDebug(class46.packedId >> 16, class46.packedId & 0xffff), class46.packedId, (byte) -90, false, class46.childIndex, class46.itemId, true, 6, class46.packedId | (class46.childIndex << 0), DisplayModeManagerContainer332.aString5001, 0L, Component182.anInt9747);
            }
        }
        anInt6022++;
        for (int i_13_ = 9; i_13_ >= 5; i_13_--) {
            String string = Component63.getComponentOption(i_13_, class46, true);
            if (string != null) {
                // Keep stock option priority (cursor sprite id). Tip force is in applySwaps.
                int prio = Component265.getOptionPriority((byte) 57, i_13_, class46);
                // Preferred must use opcode 18 — 1011 makes left-click open the menu.
                int opcode = 1011;
                if (preferredItem != null && preferredItem.equalsIgnoreCase(string)) {
                    opcode = 18;
                }
                DisplayModeManagerContainer368.addMenuEntry(false, class46.text + Loader.getDebug(class46.packedId >> 16, class46.packedId & 0xffff), class46.packedId, (byte) -122, false, class46.childIndex, class46.itemId, true, opcode, (class46.childIndex << 0) | class46.packedId, string, 1 + i_13_, prio);
                DisplayModeManagerContainer147.anInt4169++;
            }
        }
        String string = DisplayModeManagerContainer295.getUseOption(0, class46);
        if (string != null) {
            int usePrio = class46.usePriority;
            DisplayModeManagerContainer368.addMenuEntry(false, class46.text + Loader.getDebug(class46.packedId >> 16, class46.packedId & 0xffff), class46.packedId, (byte) -83, false, class46.childIndex, class46.itemId, true, 13, (class46.childIndex << 0) | class46.packedId, string, 0L, usePrio);
            DisplayModeManagerContainer109.anInt2340++;
        }
        if (i_12_ >= -55) method1793(null, -19, 70, -103);
        for (int i_14_ = 4; i_14_ >= 0; i_14_--) {
            String string_15_ = Component63.getComponentOption(i_14_, class46, true);
            if (string_15_ != null) {
                int prio = Component265.getOptionPriority((byte) 57, i_14_, class46);
                DisplayModeManagerContainer368.addMenuEntry(false, class46.text, class46.packedId, (byte) -67, false, class46.childIndex, class46.itemId, true, 18, (class46.childIndex << 0) | class46.packedId, string_15_, 1 + i_14_, prio);
                DisplayModeManagerContainer147.anInt4169++;
            }
        }
        if (client.getComponentSettings(class46).hasContinue(0)) {
            if (class46.continueOption != null) DisplayModeManagerContainer368.addMenuEntry(false, "", class46.packedId, (byte) -118, false, class46.childIndex, class46.itemId, true, 16, (class46.childIndex << 0) | class46.packedId, class46.continueOption, 0L, -1);
            else DisplayModeManagerContainer368.addMenuEntry(false, "", class46.packedId, (byte) -79, false, class46.childIndex, class46.itemId, true, 16, class46.childIndex << 0 | class46.packedId, FriendsIgnoreList.aClass274_3492.getLocalized(ObjectDeserializer.languageId, 544), 0L, -1);
            RSARequest.anInt9655++;
        }
        // Inventory / bank item: inject lilac Default: Wear / Withdraw-All / …
        if (class46.itemId > 0) {
            DefaultClickSwapper.injectItemMenu(class46);
        }
        // Pad connected → Learn alias on Eat/Drink/Summon/prayer (quick + individual)
        JoystickAlias.injectItemMenu(class46);
    }

    Component66(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    Component66(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final int method1798(int i) {
        anInt6028++;
        if (i != -32350) return 61;
        return this.preferenceValue;
    }

    final int getDefaultValue(int i) {
        if (i != 20014) aClass273_6018 = null;
        anInt6027++;
        if (this.preferences.method3428((byte) -96).method1462(-113) > 1) return 4;
        return 2;
    }
}
