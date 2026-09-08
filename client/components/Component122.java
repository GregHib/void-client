/* Component122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component122
/**
 * RENAMED from `Class98` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static BrowserUrlOpener aClass348_Sub16_Sub3_1564;
    /**
     * Frame-accumulated mouse-wheel notches (event type 6 / {@code getClickCount}).
     * Positive ≈ wheel toward user. Reset each input drain in {@code client}.
     * Consumers: interface scroll scripts, console history ({@link PauseTimer}),
     * Ctrl+Shift plane change ({@link ClientSystemInfo}). Sibling per-event value:
     * {@link Component233#scrollWheelDiff}.
     */
    static int mouseWheelDelta;
    static int[][] anIntArrayArray1566 = {{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
    static int anInt1567;
    static int anInt1568;
    TheoraVideoPlayer aClass88_1569 = new TheoraVideoPlayer();
    static int anInt1570;
    static int anInt1571;

    static final boolean method877(int i, int i_0_, byte i_1_) {
        if (i_1_ != -127) anIntArrayArray1566 = null;
        anInt1567++;
        return ShaderProgramSub9.method2174((byte) 126, i, i_0_) || Connection.method1475((byte) -107, i_0_, i);
    }

    static final byte[] method878(String string, int i) {
        anInt1571++;
        int i_2_ = string.length();
        if (i_2_ == 0) return new byte[0];
        int i_3_ = ~0x3 & 3 + i_2_;
        int i_4_ = i_3_ / 4 * 3;
        if (i_3_ + -2 >= i_2_ || Component134.method1399(7, string.charAt(i_3_ + -2)) == -1) i_4_ -= 2;
        else if (i_2_ <= i_3_ + -1 || Component134.method1399(7, string.charAt(i_3_ - 1)) == -1) i_4_--;
        if (i > -92) method877(-51, -45, (byte) -74);
        byte[] is = new byte[i_4_];
        RenderableSub2.method2497(is, (byte) 0, string, 0);
        return is;
    }

    public Component122() {
        /* empty */
    }

    public static void method879(int i) {
        aClass348_Sub16_Sub3_1564 = null;
        if (i > 67) anIntArrayArray1566 = null;
    }

    static {
        mouseWheelDelta = 0;
    }
}
