/* Class59_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class59_Sub2 extends Class59 {
    static int anInt5301;
    private int anInt5302;
    private final int[] anIntArray5303 = new int[this.anInt1071];
    static int anInt5304;
    static String[] aStringArray5305 = {"en", "de", "fr", "pt", "nl"};
    static int[] anIntArray5306 = {36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    static int anInt5307;
    private int anInt5308;
    private byte[] aByteArray5309;
    static int anInt5310;

    final void method546(int i, int i_0_, int i_1_) {
        if (i_1_ != -2) method543(false);
        anInt5302 += anIntArray5303[i_0_] * i >> 12;
        anInt5304++;
    }

    final void method543(boolean bool) {
        anInt5307++;
        anInt5302 = 0;
        anInt5308 = 0;
        if (bool != true) anInt5302 = -121;
    }

    final void method541(int i) {
        anInt5302 = Math.abs(anInt5302);
        anInt5301++;
        if (anInt5302 >= 4096) anInt5302 = 4095;
        method563((byte) 92, anInt5308++, (byte) (anInt5302 >> 4));
        if (i != -1538606516) method546(-74, -93, 118);
        anInt5302 = 0;
    }

    Class59_Sub2(int i, int i_2_, int i_3_, int i_4_, int i_5_, float f) {
        super(i, i_2_, i_3_, i_4_, i_5_);
        for (int i_6_ = 0; i_6_ < this.anInt1071; i_6_++)
            anIntArray5303[i_6_] = (short) (int) (Math.pow(f, i_6_) * 4096.0);
    }

    void method563(byte i, int i_7_, byte i_8_) {
        aByteArray5309[anInt5308++] = (byte) (Class139.method1166(127, i_8_ >> 1) + 127);
        if (i < 79) method543(true);
        anInt5310++;
    }

    public static void method564(byte i) {
        aStringArray5305 = null;
        anIntArray5306 = null;
        if (i >= -39) method564((byte) 50);
    }
}
