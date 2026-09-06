/* Component192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component192
/**
 * RENAMED from `Class316` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3958;
    static NodeSub51 preferences;
    static int anInt3960;
    /** Open-addressed hash → id pairs for archive names. */
    private final int[] buckets;
    static int anInt3962;
    /**
     * Left-click / tip menu row — the action that fires when the user clicks
     * without opening the full menu. Set in {@link DisplayModeManagerContainer1#updateMenuTip};
     * consumed by {@link Component272#method1731} → {@link ColoredTextBuilder#processMenuAction}.
     * Microbot forces this to {@link Microbot#targetMenu} when injecting.
     */
    static MenuEntry menuTip;
    static int anInt3964;
    static int anInt3965;
    static int anInt3966;

    /** Open the in-game developer console when available. */
    static final void openDevConsole(int i) {
        if (i <= -39) {
            anInt3958++;
            if (Component300.method2066((byte) 106)) {
                if (ArbShaderProgram.consoleLines == null) DisplayModeManagerContainer288.initDevConsole(2);
                Component39.consoleFadeAlpha = 0;
                StringCache.devConsoleOpen = true;
            }
        }
    }

    /** Plot a cubic Bezier segment (12.12 fixed) via {@link NewsFetcher#method2665}. */
    static final void drawBezier(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        if (i_7_ == 3) {
            if (i_3_ != i_1_ || i_2_ != i_6_ || i_5_ != i_0_ || i_8_ != i_4_) {
                int i_9_ = i_1_;
                int i_10_ = i_6_;
                int i_11_ = i_1_ * 3;
                int i_12_ = 3 * i_6_;
                int i_13_ = i_3_ * 3;
                int i_14_ = 3 * i_2_;
                int i_15_ = 3 * i_0_;
                int i_16_ = i_4_ * 3;
                int i_17_ = -i_1_ + (i_13_ + i_5_) + -i_15_;
                int i_18_ = -i_6_ + (i_8_ + (-i_16_ - -i_14_));
                int i_19_ = -i_13_ + -i_13_ + (i_15_ + i_11_);
                int i_20_ = i_12_ + -i_14_ + (i_16_ - i_14_);
                int i_21_ = -i_11_ + i_13_;
                int i_22_ = -i_12_ + i_14_;
                for (int i_23_ = 128; i_23_ <= 4096; i_23_ += 128) {
                    int i_24_ = i_23_ * i_23_ >> 12;
                    int i_25_ = i_24_ * i_23_ >> 12;
                    int i_26_ = i_17_ * i_25_;
                    int i_27_ = i_18_ * i_25_;
                    int i_28_ = i_19_ * i_24_;
                    int i_29_ = i_24_ * i_20_;
                    int i_30_ = i_23_ * i_21_;
                    int i_31_ = i_22_ * i_23_;
                    int i_32_ = i_1_ - -(i_26_ - (-i_28_ + -i_30_) >> 12);
                    int i_33_ = i_6_ - -(i_29_ + (i_27_ - -i_31_) >> 12);
                    NewsFetcher.method2665(i_9_, (byte) 109, i, i_10_, i_33_, i_32_);
                    i_9_ = i_32_;
                    i_10_ = i_33_;
                }
            } else NewsFetcher.method2665(i_1_, (byte) 73, i, i_6_, i_8_, i_5_);
            anInt3964++;
        }
    }

    Component192(int[] is) {
        int i;
        for (i = 1; is.length - -(is.length >> 1) >= i; i <<= 1) {
            /* empty */
        }
        buckets = new int[i + i];
        for (int i_34_ = 0; i_34_ < i + i; i_34_++)
            buckets[i_34_] = -1;
        for (int i_35_ = 0; is.length > i_35_; i_35_++) {
            int i_36_;
            for (i_36_ = is[i_35_] & -1 + i; buckets[i_36_ - -i_36_ - -1] != -1; i_36_ = -1 + i & 1 + i_36_) {
                /* empty */
            }
            buckets[i_36_ + i_36_] = is[i_35_];
            buckets[i_36_ - (-i_36_ + -1)] = i_35_;
        }
    }

    /** Name-table lookup: hash → child id, or {@code -1}. */
    final int lookup(int i, int i_37_) {
        anInt3960++;
        if (i != 1) lookup(-74, 111);
        int i_38_ = -1 + (buckets.length >> 1);
        int i_39_ = i_38_ & i_37_;
        for (; ; ) {
            int i_40_ = buckets[i_39_ + i_39_ - -1];
            if (i_40_ == -1) return -1;
            if (i_37_ == buckets[i_39_ + i_39_]) return i_40_;
            i_39_ = i_38_ & 1 + i_39_;
        }
    }

    public static void clearStatics(boolean bool) {
        menuTip = null;
        preferences = null;
        if (bool != true) clearSoftCache(46);
    }

    /** Format a menu row as {@code option -> target -> extraTarget} with localized separators. */
    static final String formatMenuEntry(byte i, MenuEntry class348_sub42_sub12) {
        anInt3962++;
        int i_41_ = 9 / ((79 - i) / 46);
        if (class348_sub42_sub12 == null) return "";
        if (class348_sub42_sub12.extraTarget == null || class348_sub42_sub12.extraTarget.length() == 0) {
            if ((class348_sub42_sub12.target == null) || class348_sub42_sub12.target.length() <= 0) return (class348_sub42_sub12.option);
            return (class348_sub42_sub12.option + FriendsIgnoreList.aClass274_3515.getLocalized(ObjectDeserializer.languageId, 544) + (class348_sub42_sub12.target));
        }
        if (class348_sub42_sub12.target == null || class348_sub42_sub12.target.length() <= 0) return (class348_sub42_sub12.option + FriendsIgnoreList.aClass274_3515.getLocalized(ObjectDeserializer.languageId, 544) + (class348_sub42_sub12.extraTarget));
        return (class348_sub42_sub12.option + FriendsIgnoreList.aClass274_3515.getLocalized(ObjectDeserializer.languageId, 544) + class348_sub42_sub12.target + FriendsIgnoreList.aClass274_3515.getLocalized(ObjectDeserializer.languageId, 544) + class348_sub42_sub12.extraTarget);
    }

    static final void clearSoftCache(int i) {
        Component279.aClass60_225.clear(0);
        anInt3965++;
        if (i != -1) preferences = null;
    }
}
