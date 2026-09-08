/* Component85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component85
/**
 * RENAMED from `Class221` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2879;
    static int anInt2880;
    static boolean aBoolean2881 = false;
    static int anInt2882;

    public Component85() {
        /* empty */
    }

    final int method1607(int i, int i_0_, byte i_1_) {
        anInt2882++;
        int i_2_ = (Math.max(Component236.canvasWidth, i));
        if (Component364.aClass221_8344 == this) return 0;
        if (i_1_ >= -103) aBoolean2881 = true;
        if (this == DisplayModeManagerContainer369.aClass221_2893) return i_2_ - i_0_;
        if (Component65.aClass221_1620 == this) return (-i_0_ + i_2_) / 2;
        return 0;
    }

    public final String toString() {
        anInt2879++;
        throw new IllegalStateException();
    }
}
