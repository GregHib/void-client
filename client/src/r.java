/* r - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class r extends Class348_Sub42 {
    static Class312 aClass312_9716 = new Class312();
    static int anInt9717;
    static boolean[] aBooleanArray9718;
    static boolean aBoolean9719 = true;
    static Class101 aClass101_9720;
    static volatile int anInt9721;
    static boolean aBoolean9722 = false;
    static int[][] anIntArrayArray9723;
    static int[] mapUndergroundLocations;

    public r() {
        /* empty */
    }

    static final void method3284(boolean bool, double d) {
        Class44.aClass101_624.method898(Class51.aClass101_905);
        anInt9717++;
        if (bool != true) method3285(10);
        Class44.aClass101_624.method891(0, 0, (int) d);
        Class21.aHa326.method3638(Class44.aClass101_624);
    }

    public static void method3285(int i) {
        int i_0_ = -61 % ((i - -73) / 32);
        aClass101_9720 = null;
        mapUndergroundLocations = null;
        aBooleanArray9718 = null;
        aClass312_9716 = null;
        anIntArrayArray9723 = null;
    }

    static {
        anInt9721 = -1;
        anIntArrayArray9723 = new int[128][128];
    }
}
