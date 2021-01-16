/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class351 {
    static int anInt4322;
    int anInt4323;
    static int anInt4324;
    static int anInt4325;
    private int anInt4326;
    static Class60 aClass60_4327 = new Class60(3000000, 200);
    static boolean aBoolean4328 = false;
    static Font aFont4329;

    static final boolean method3455(String string, int i) {
        anInt4324++;
        if (string == null) return false;
        for (int i_0_ = 0; (i_0_ < Class348_Sub42_Sub12.anInt9604); i_0_++) {
            if (string.equalsIgnoreCase(Class122.aStringArray1808[i_0_])) return true;
            if (string.equalsIgnoreCase(aa_Sub2.aStringArray5197[i_0_])) return true;
        }
        if (i != 28280) aBoolean4328 = false;
        return false;
    }

    public final String toString() {
        anInt4325++;
        throw new IllegalStateException();
    }

    final int method3456(int i) {
        anInt4322++;
        if (i != 200) anInt4326 = -78;
        return anInt4326;
    }

    public static void method3457(boolean bool) {
        aFont4329 = null;
        aClass60_4327 = null;
        if (bool != true) method3455(null, -16);
    }

    Class351(int i, int i_1_) {
        anInt4326 = i;
        this.anInt4323 = i_1_;
    }
}
