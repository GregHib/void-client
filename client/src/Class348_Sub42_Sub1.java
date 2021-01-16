/* Class348_Sub42_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub1 extends Class348_Sub42 {
    static int anInt9488;
    static int anInt9489;
    static int anInt9490;
    static float[] aFloatArray9491;
    static int anInt9492 = 0;
    static int anInt9493;
    private Class356 aClass356_9494;
    static boolean[][] aBooleanArrayArray9495;
    static int anInt9496;
    static int anInt9497;

    public static void method3165(byte i) {
        if (i > 39) {
            aFloatArray9491 = null;
            aBooleanArrayArray9495 = null;
        }
    }

    final int method3166(int i, int i_0_, byte i_1_) {
        anInt9490++;
        if (aClass356_9494 == null) return i_0_;
        Class348_Sub35 class348_sub35 = (Class348_Sub35) aClass356_9494.method3480(i, -6008);
        if (i_1_ < 91) return 72;
        if (class348_sub35 == null) return i_0_;
        return class348_sub35.anInt6976;
    }

    private final void method3167(int i, Class348_Sub49 class348_sub49, byte i_2_) {
        if (i_2_ == -86) {
            anInt9489++;
            if (i == 249) {
                int i_3_ = class348_sub49.method3387(255);
                if (aClass356_9494 == null) {
                    int i_4_ = Class33.method340(i_3_, (byte) 108);
                    aClass356_9494 = new Class356(i_4_);
                }
                for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
                    boolean bool = class348_sub49.method3387(i_2_ + 341) == 1;
                    int i_6_ = class348_sub49.method3351(-1);
                    Class348 class348;
                    if (bool) class348 = new Class348_Sub50(class348_sub49.method3377((byte) -39));
                    else class348 = new Class348_Sub35(class348_sub49.method3385((byte) -126));
                    aClass356_9494.method3483((byte) 29, i_6_, class348);
                }
            }
        }
    }

    final void method3168(Class348_Sub49 class348_sub49, byte i) {
        for (; ; ) {
            int i_7_ = class348_sub49.method3387(255);
            if (i_7_ == 0) break;
            method3167(i_7_, class348_sub49, (byte) -86);
        }
        anInt9497++;
        if (i >= -59) method3169(-56, -67);
    }

    public Class348_Sub42_Sub1() {
        /* empty */
    }

    static final boolean method3169(int i, int i_8_) {
        if (i_8_ != 0) return true;
        anInt9496++;
        for (Class348_Sub42_Sub12 class348_sub42_sub12 = ((Class348_Sub42_Sub12) Class348_Sub40_Sub4.aClass262_9111.method1995(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (Class348_Sub42_Sub12) Class348_Sub40_Sub4.aClass262_9111.method1990((byte) 99)) {
            if (Class367_Sub8.method3549(class348_sub42_sub12.anInt9608, (byte) -28) && (long) i == (class348_sub42_sub12.aLong9605)) return true;
        }
        return false;
    }

    final String method3170(int i, String string, int i_9_) {
        anInt9493++;
        if (aClass356_9494 == null) return string;
        if (i != -250) method3165((byte) 0);
        Class348_Sub50 class348_sub50 = (Class348_Sub50) aClass356_9494.method3480(i_9_, -6008);
        if (class348_sub50 == null) return string;
        return class348_sub50.aString7211;
    }

    static {
        aFloatArray9491 = new float[4];
        aBooleanArrayArray9495 = new boolean[][]{new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};
    }
}
