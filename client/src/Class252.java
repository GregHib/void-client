/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class252 {
    static Class351 aClass351_3237 = new Class351(80, 7);
    int[] anIntArray3238;
    int[] anIntArray3239;
    static Class114 aClass114_3240 = new Class114(43, 4);
    int anInt3241;
    static float aFloat3242;
    static int anInt3243;

    public static void method1917(int i) {
        if (i != 40960) aClass114_3240 = null;
        aClass351_3237 = null;
        aClass114_3240 = null;
    }

    static final int method1918(int i, int i_0_) {
        if (i != -3358) return 126;
        anInt3243++;
        int i_1_ = i_0_ * (i_0_ * i_0_ >> 12) >> 12;
        int i_2_ = i_0_ * 6 + -61440;
        int i_3_ = 40960 - -(i_2_ * i_0_ >> 12);
        return i_3_ * i_1_ >> 12;
    }

    Class252(int i) {
        this.anInt3241 = i;
        this.anIntArray3239 = new int[this.anInt3241];
        this.anIntArray3238 = new int[this.anInt3241];
    }
}
