/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Exception_Sub1 extends Exception {
    static int anInt109;
    static int[] anIntArray110 = new int[4096];
    static int[][] anIntArrayArray111 = {{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
    static Class255 aClass255_112;

    public Exception_Sub1() {
        /* empty */
    }

    public static void method140(byte i) {
        aClass255_112 = null;
        anIntArray110 = null;
        if (i == -126) anIntArrayArray111 = null;
    }

    static final Class46 method141(Class46 class46, byte i) {
        anInt109++;
        int i_0_ = 98 / ((i - -14) / 41);
        Class46 class46_1_ = client.method108(class46);
        if (class46_1_ == null) class46_1_ = class46.aClass46_782;
        return class46_1_;
    }
}
