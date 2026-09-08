/* DisplayModeManagerContainer341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class239_Sub15` (JODE-obfuscated).
 * Preference subclass; also hosts {@link #selectMapLabelFont} (world-map Helvetica ladder).
 */
final class DisplayModeManagerContainer341 extends Component339 {
    static int anInt5996;
    static Component183 aClass114_5997 = new Component183(115, 11);
    static int anInt5998;
    static int anInt5999;
    static int anInt6000;
    static int anInt6001;
    static int anInt6002;
    static int anInt6003;
    static int anInt6004;
    static int anInt6005;
    static int anInt6006 = 0;

    /**
     * Pick a baked Helvetica {@link FontGlyphCache} for a world-map label.
     *
     * @param sizeTier label importance 0/1/2 (larger tier → bigger pt at same zoom)
     * @param magic    must be {@code 10144} (opaque gate)
     * @return cache for current map zoom ({@code aFloat1247} ∈ {3,4,6,≥8}), or null
     */
    static final FontGlyphCache selectMapLabelFont(int sizeTier, int magic) {
        if (magic != 10144) return null;
        anInt6004++;
        if (sizeTier == 0) {
            if ((double) DisplayModeManagerContainer229.aFloat1247 == 3.0) return Component15.helveticaGlyphs11;
            if ((double) DisplayModeManagerContainer229.aFloat1247 == 4.0) return WorldNameText.helveticaGlyphs12;
            if ((double) DisplayModeManagerContainer229.aFloat1247 == 6.0) return DisplayModeManagerContainer271.helveticaGlyphs14;
            if ((double) DisplayModeManagerContainer229.aFloat1247 >= 8.0) return Component39.helveticaGlyphs17;
        } else if (sizeTier == 1) {
            if ((double) DisplayModeManagerContainer229.aFloat1247 == 3.0) return DisplayModeManagerContainer271.helveticaGlyphs14;
            if ((double) DisplayModeManagerContainer229.aFloat1247 == 4.0) return Component39.helveticaGlyphs17;
            if ((double) DisplayModeManagerContainer229.aFloat1247 == 6.0) return Component218.helveticaGlyphs19;
            if ((double) DisplayModeManagerContainer229.aFloat1247 >= 8.0) return DebugPanic.helveticaGlyphs22;
        } else if (sizeTier == 2) {
            if ((double) DisplayModeManagerContainer229.aFloat1247 == 3.0) return Component218.helveticaGlyphs19;
            if ((double) DisplayModeManagerContainer229.aFloat1247 == 4.0) return DebugPanic.helveticaGlyphs22;
            if ((double) DisplayModeManagerContainer229.aFloat1247 == 6.0) return NodeSub3.helveticaGlyphs26;
            if ((double) DisplayModeManagerContainer229.aFloat1247 >= 8.0) return Component49.helveticaGlyphs30;
        }
        return null;
    }

    final void validateValue(boolean bool) {
        if (bool != false) method1783(115, -122, -59, 41, -49, 92);
        anInt5999++;
        if (this.preferences.method3428((byte) -84).method1458(-23688) < 96) this.preferenceValue = 0;
        if (this.preferenceValue < 0 || this.preferenceValue > 2) this.preferenceValue = getDefaultValue(20014);
    }

    final int getValue(int i, int i_1_) {
        anInt6005++;
        if (i != 3) method1784(99);
        if (this.preferences.method3428((byte) -85).method1458(-23688) < 96) return 3;
        return 1;
    }

    DisplayModeManagerContainer341(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
        Component380.method1114(this.preferenceValue, -122);
    }

    static final void method1783(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt5998++;
        int i_7_ = -i_3_ + i_4_;
        int i_8_ = i_5_ + -i;
        if ((~i_8_) == i_2_) {
            if (i_7_ != 0) Component9.method2641(i_4_, i_3_, -117, i, i_6_);
            return;
        } else if (i_7_ == 0) {
            Model.method223(i_5_, i_6_, i_3_, i, (byte) 47);
            return;
        }
        if (i_7_ < 0) i_7_ = -i_7_;
        if (i_8_ < 0) i_8_ = -i_8_;
        boolean bool = i_8_ < i_7_;
        if (bool) {
            int i_9_ = i;
            int i_10_ = i_5_;
            i = i_3_;
            i_5_ = i_4_;
            i_3_ = i_9_;
            i_4_ = i_10_;
        }
        if (i_5_ < i) {
            int i_11_ = i;
            i = i_5_;
            int i_12_ = i_3_;
            i_5_ = i_11_;
            i_3_ = i_4_;
            i_4_ = i_12_;
        }
        int i_13_ = i_3_;
        int i_14_ = -i + i_5_;
        int i_15_ = -i_3_ + i_4_;
        int i_16_ = -(i_14_ >> 1);
        if (i_15_ < 0) i_15_ = -i_15_;
        int i_17_ = i_4_ <= i_3_ ? -1 : 1;
        if (bool) {
            for (int i_19_ = i; i_5_ >= i_19_; i_19_++) {
                DisplayModeManagerContainer167.anIntArrayArray255[i_19_][i_13_] = i_6_;
                i_16_ += i_15_;
                if (i_16_ > 0) {
                    i_13_ += i_17_;
                    i_16_ -= i_14_;
                }
            }
        } else {
            for (int i_18_ = i; i_18_ <= i_5_; i_18_++) {
                i_16_ += i_15_;
                DisplayModeManagerContainer167.anIntArrayArray255[i_13_][i_18_] = i_6_;
                if (i_16_ > 0) {
                    i_13_ += i_17_;
                    i_16_ -= i_14_;
                }
            }
        }
    }

    final void setValue(int i, int i_20_) {
        anInt6003++;
        this.preferenceValue = i_20_;
        int i_21_ = 33 % ((i - 82) / 35);
        Component380.method1114(this.preferenceValue, -122);
    }

    final int getDefaultValue(int i) {
        anInt5996++;
        if (i != 20014) selectMapLabelFont(-76, -103);
        if (this.preferences.method3428((byte) -105).method1458(-23688) < 96) return 0;
        return 2;
    }

    DisplayModeManagerContainer341(NodeSub51 class348_sub51) {
        super(class348_sub51);
        Component380.method1114(this.preferenceValue, -120);
    }

    final int method1784(int i) {
        anInt6000++;
        if (i != -32350) return -82;
        return this.preferenceValue;
    }

    public static void method1785(int i) {
        aClass114_5997 = null;
        if (i != 8) aClass114_5997 = null;
    }

    final boolean method1786(int i) {
        if (i < 85) method1784(-69);
        anInt6001++;
        return this.preferences.method3428((byte) -104).method1458(-23688) >= 96;
    }

    static final void method1787(int i, int i_22_) {
        anInt6002++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i, (byte) 105, i_22_);//8
        class348_sub42_sub15.method3251(-16058);
    }
}
