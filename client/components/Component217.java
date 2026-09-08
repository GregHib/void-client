/* Component217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component217
/**
 * RENAMED from `Class249` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3216;
    static Component158 aClass21_3217 = new Component158();

    public static void method1907(byte i) {
        aClass21_3217 = null;
        int i_0_ = -55 / ((i - -39) / 60);
    }

    static final int method1908(int i, int i_1_, int i_2_, boolean bool, int i_3_, int i_4_, int i_5_) {
        i_2_ &= 0x3;
        anInt3216++;
        if (bool != true) aClass21_3217 = null;
        if ((i_5_ & 0x1) == 1) {
            int i_6_ = i_4_;
            i_4_ = i_3_;
            i_3_ = i_6_;
        }
        if (i_2_ == 0) return i_1_;
        if (i_2_ == 1) return i;
        if (i_2_ == 2) return 7 + -i_1_ + (-i_4_ + 1);
        return -i_3_ - (-1 - (7 - i));
    }
}
