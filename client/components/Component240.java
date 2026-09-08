/* Component240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component240
/**
 * RENAMED from `Class62` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1110;
    static int anInt1111;
    static int anInt1112;
    static int anInt1113;
    static Component315 aClass243_1114 = new Component315();
    static int anInt1115;
    static int[][][] anIntArrayArrayArray1116;

    static final DisplayModeManagerContainer196[] method596(int i) {
        if (i != 20000) anIntArrayArrayArray1116 = null;
        anInt1112++;
        return (new DisplayModeManagerContainer196[]{Component134.aClass341_5808, DisplayModeManagerContainer91.aClass341_399, Component251.aClass341_5821});
    }

    public static void method597(byte i) {
        aClass243_1114 = null;
        anIntArrayArrayArray1116 = null;
        int i_0_ = -116 / ((6 - i) / 60);
    }

    static final void method598(int i) {
        anInt1111++;
        if (i != 9013) method597((byte) 86);
        for (ColorTagNode class348_sub15 = (ColorTagNode) DisplayModeManagerContainer91.aClass356_389.first(0); class348_sub15 != null; class348_sub15 = (ColorTagNode) DisplayModeManagerContainer91.aClass356_389.next(0)) {
            if (!class348_sub15.aBoolean6772) DisplayModeManagerContainer282.getColorTag((byte) -94, (class348_sub15.anInt6773));
            else class348_sub15.aBoolean6772 = false;
        }
    }

    /** Monotonic millis: wall clock + {@link DisplayModeManagerContainer28#clockSkewMillis}. */
    static final synchronized long currentTimeMillis(int i) {
        if (i > -52) return -121L;
        anInt1113++;
        long l = System.currentTimeMillis();
        if (MatrixSub1.lastWallClockMillis > l) DisplayModeManagerContainer28.clockSkewMillis += MatrixSub1.lastWallClockMillis - l;
        MatrixSub1.lastWallClockMillis = l;
        return l + DisplayModeManagerContainer28.clockSkewMillis;
    }

    static final int method600(byte i, int i_1_, int i_2_) {
        anInt1115++;
        int i_3_;
        if (i_2_ <= 20000) {
            if (i_2_ <= 10000) {
                if (i_2_ <= 5000) {
                    GradientPreset.method3076(0, true);
                    i_3_ = 1;
                } else {
                    i_3_ = 2;
                    DisplayModeManagerContainer254.method1263(true);
                }
            } else {
                i_3_ = 3;
                DisplayModeManagerContainer32.method447((byte) -59);
            }
        } else {
            HeapDumper.resetGraphicsPreferences(120);
            i_3_ = 4;
        }
        if (i_1_ != Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350)) {
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub25_7251), i_1_);
            SoftwareFallbackShader.method3553(false, (byte) 122, i_1_);
        }
        if (i >= -20) aClass243_1114 = null;
        DisplayModeManagerContainer389.savePreferences(37);
        return i_3_;
    }
}
