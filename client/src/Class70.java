/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class70 {
    static int anInt1203;
    static int[] anIntArray1204;
    static int anInt1205;
    static int anInt1206;
    static int[] anIntArray1207 = new int[16384];

    public static void method725(int i) {
        anIntArray1207 = null;
        anIntArray1204 = null;
        if (i != 16384)
            anIntArray1207 = null;
    }

    static final void method726(int i) {
        if (i <= 88)
            anIntArray1204 = null;
        anInt1206++;
        if (Class348_Sub42_Sub15.aClass56_9660 != null) {
            Class51.aClass311_897 = new Class311();
            Class51.aClass311_897.method2316
                    (Class348_Sub42_Sub15.aClass56_9660,
                            ((Class56) Class348_Sub42_Sub15.aClass56_9660)
                                    .aClass274_1012.method2063(Class348_Sub33.anInt6967, 544),
                            ((Class56) Class348_Sub42_Sub15.aClass56_9660).anInt1025,
                            Class283.aLong3660, false);
            Class348_Sub32.aThread6946 = new Thread(Class51.aClass311_897, "");
            Class348_Sub32.aThread6946.start();
        }
    }

    static final void method727(byte i, int i_0_, int i_1_, int i_2_) {
        anInt1205++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(i_2_, (byte) 105, 9);
        class348_sub42_sub15.method3246(i + -25427);
        ((Class348_Sub42_Sub15) class348_sub42_sub15).anInt9652 = i_1_;
        ((Class348_Sub42_Sub15) class348_sub42_sub15).anInt9651 = i_0_;
        if (i != -63)
            anIntArray1207 = null;
    }

    public final String toString() {
        anInt1203++;
        throw new IllegalStateException();
    }

    public Class70() {
        /* empty */
    }

    static {
        anIntArray1204 = new int[16384];
        double d = 3.834951969714103E-4;
        for (int i = 0; (i ^ 0xffffffff) > -16385; i++) {
            anIntArray1207[i] = (int) (16384.0 * Math.sin(d * (double) i));
            anIntArray1204[i] = (int) (Math.cos(d * (double) i) * 16384.0);
        }
    }
}
