/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class221 {
    static int anInt2879;
    static int anInt2880;
    static boolean aBoolean2881 = false;
    static int anInt2882;

    public Class221() {
        /* empty */
    }

    final int method1607(int i, int i_0_, byte i_1_) {
        anInt2882++;
        int i_2_ = (Class321.anInt4017 > i
                ? Class321.anInt4017 : i);
        if (Class5_Sub1.aClass221_8344 == this)
            return 0;
        if (i_1_ >= -103)
            aBoolean2881 = true;
        if (this == Class223.aClass221_2893)
            return i_2_ - i_0_;
        if (Class104.aClass221_1620 == this)
            return (-i_0_ + i_2_) / 2;
        return 0;
    }

    public final String toString() {
        anInt2879++;
        throw new IllegalStateException();
    }
}
