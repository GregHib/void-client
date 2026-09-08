/* Component94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Component94
/**
 * RENAMED from `Class284` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3664;
    static int anInt3665;
    int anInt3666;
    int anInt3667;
    int anInt3668;
    int anInt3669;
    int anInt3670;
    int anInt3671;
    int anInt3672;
    int anInt3673;
    static int anInt3674;
    int anInt3675;
    /**
     * First visible line index into {@link ArbShaderProgram#consoleLines}.
     * 0 = newest at bottom (near prompt); higher = scrolled into older history.
     * Wheel ({@link PauseTimer#processDevConsoleInput}) and one-finger drag adjust this.
     */
    static int consoleScroll = 0;
    static int[][] anIntArrayArray3677 = {{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
    int anInt3678;
    int anInt3679;
    int anInt3680;

    final boolean method2115(Component94 class284_0_, boolean bool) {
        if (bool != true) return true;
        anInt3664++;
        return class284_0_.anInt3673 == this.anInt3673 && (this.anInt3667 == class284_0_.anInt3667) && (this.anInt3671 == class284_0_.anInt3671);
    }

    /** Time (ms) to draw 10k triangles with the current/fallback toolkit. */
    static final int benchmarkToolkitMs(int i) {
        anInt3665++;
        GraphicsToolkit var_ha = NodeSub8.toolkit;
        boolean bool = false;
        if (Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(i + -5766) != 0) {
            Canvas canvas = new Canvas();
            canvas.setSize(100, 100);
            var_ha = Component65.method958(true, 0, null, 0, canvas, null);
            bool = true;
        }
        long l = Component240.currentTimeMillis(i + 26482);
        for (int i_1_ = 0; i_1_ < 10000; i_1_++)
            var_ha.draw3DTriangle(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        int i_2_ = (int) (-l + Component240.currentTimeMillis(-71));
        if (i != -26584) benchmarkToolkitMs(-124);
        var_ha.method3675(100, (byte) -125, 0, 0, 100, -16777216);
        if (bool) var_ha.method3635((byte) 121);
        return i_2_;
    }

    public static void method2117(int i) {
        if (i == 0) anIntArrayArray3677 = null;
    }

    static final Component163 method2118(byte i) {
        anInt3674++;
        try {
            if (i != -42) consoleScroll = -23;
            return new Component215();
        } catch (Throwable throwable) {
            return null;
        }
    }

    public Component94() {
        /* empty */
    }
}
