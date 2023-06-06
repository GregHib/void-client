/* Class348_Sub42_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub10 extends Class348_Sub42 {
    static int anInt9560;
    static int anInt9561;
    boolean aBoolean9562 = true;
    static int anInt9563;
    private String[] aStringArray9564;
    private int[][] anIntArrayArray9565;
    int[] anIntArray9566;
    Class355 aClass355_9567;
    static int anInt9568;
    static int anInt9569;
    static int anInt9570;
    static Class299 aClass299_9571;
    static int[] anIntArray9572;
    static int anInt9573;
    private int[] anIntArray9574;
    static int anInt9575;
    static int anInt9576;
    static int anInt9577 = 0;
    static int anInt9578;

    final void method3209(boolean bool) {
        if (bool != false) anInt9577 = 26;
        anInt9563++;
        if (this.anIntArray9566 != null) {
            for (int i = 0; this.anIntArray9566.length > i; i++)
                this.anIntArray9566[i] = Class273.method2057((this.anIntArray9566[i]), 32768);
        }
    }

    final void method3210(byte i, int[] is, Class348_Sub49 class348_sub49) {
        while_221_:
        do {
            try {
                anInt9560++;
                int i_0_ = -107 / ((-71 - i) / 50);
                if (anIntArray9574 != null) {
                    int i_1_ = 0;
                    for (; ; ) {
                        if (anIntArray9574.length <= i_1_) break while_221_;
                        if (i_1_ >= is.length) break;
                        int i_2_ = method3212(0, i_1_).anInt1945;
                        if (i_2_ > 0) class348_sub49.method3357(i_2_, is[i_1_], (byte) 116);
                        i_1_++;
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("td.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (class348_sub49 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static final void method3211(byte i) {
        Class79.aClient1367.method83(true);
        anInt9569++;
        Class348_Sub3.method2739(0);
        Class289.anInt3699 = 0;
        Class348_Sub40_Sub36.aClass114_9456 = null;
        Class348_Sub50.anInt7213 = 0;
        Class239.aClass114_3145 = null;
        Class299.aClass348_Sub49_Sub2_3813.anInt7197 = 0;
        int i_3_ = -122 % ((i - 13) / 45);
        NetworkChannel.aClass114_3133 = null;
        Class305.method2296(-99);
        Class348_Sub40_Sub30.anInt9383 = 0;
        Class50.aString863 = null;
        Class37.anInt496 = 0;
        Class169.aClass19Array2261 = null;
        Class125.anInt4930 = 0;
    }

    final Class138 method3212(int i, int i_4_) {
        anInt9561++;
        if (i != 0) anIntArray9572 = null;
        if (anIntArray9574 == null || i_4_ < 0 || anIntArray9574.length < i_4_) return null;
        return Class348_Sub5.method2752(anIntArray9574[i_4_], 0);
    }

    final int method3213(int i, int i_5_, boolean bool) {
        anInt9576++;
        if (bool != true) method3213(41, 104, true);
        if (anIntArray9574 == null || i_5_ < 0 || i_5_ > anIntArray9574.length) return -1;
        if (anIntArrayArray9565[i_5_] == null || i < 0 || (i > anIntArrayArray9565[i_5_].length)) return -1;
        return anIntArrayArray9565[i_5_][i];
    }

    private final void method3214(int i, Class348_Sub49 class348_sub49, int i_6_) {
        if (i_6_ == 60) {
            if (i != 1) {
                if (i == 2) {
                    int i_7_ = class348_sub49.readUnsignedByte(255);
                    this.anIntArray9566 = new int[i_7_];
                    for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
                        this.anIntArray9566[i_8_] = class348_sub49.readUnsignedShort(i_6_ + 842397884);
                } else if (i == 3) {
                    int i_9_ = class348_sub49.readUnsignedByte(i_6_ + 195);
                    anIntArrayArray9565 = new int[i_9_][];
                    anIntArray9574 = new int[i_9_];
                    for (int i_10_ = 0; i_9_ > i_10_; i_10_++) {
                        int i_11_ = class348_sub49.readUnsignedShort(842397944);
                        Class138 class138 = Class348_Sub5.method2752(i_11_, i_6_ + -60);
                        if (class138 != null) {
                            anIntArray9574[i_10_] = i_11_;
                            anIntArrayArray9565[i_10_] = new int[class138.anInt1944];
                            for (int i_12_ = 0; (class138.anInt1944 > i_12_); i_12_++)
                                anIntArrayArray9565[i_10_][i_12_] = class348_sub49.readUnsignedShort(i_6_ + 842397884);
                        }
                    }
                } else if (i == 4) this.aBoolean9562 = false;
            } else aStringArray9564 = (Class348_Sub40_Sub23.method3113('<', true, class348_sub49.readString((byte) -82)));
            anInt9575++;
        }
    }

    public Class348_Sub42_Sub10() {
        /* empty */
    }

    final int method3215(byte i) {
        anInt9570++;
        if (i > -32) this.anIntArray9566 = null;
        if (anIntArray9574 == null) return 0;
        return anIntArray9574.length;
    }

    final String method3216(Class348_Sub49 class348_sub49, byte i) {
        anInt9578++;
        if (i < 33) method3219(-91);
        StringBuffer stringbuffer = new StringBuffer(80);
        if (anIntArray9574 != null) {
            for (int i_13_ = 0; i_13_ < anIntArray9574.length; i_13_++) {
                stringbuffer.append(aStringArray9564[i_13_]);
                stringbuffer.append(this.aClass355_9567.method3472((class348_sub49.method3368((Class348_Sub5.method2752(anIntArray9574[i_13_], 0).anInt1943), 3060)), anIntArrayArray9565[i_13_], -1, method3212(0, i_13_)));
            }
        }
        stringbuffer.append(aStringArray9564[aStringArray9564.length + -1]);
        return stringbuffer.toString();
    }

    public static void method3217(byte i) {
        if (i != 61) method3211((byte) -95);
        aClass299_9571 = null;
        anIntArray9572 = null;
    }

    final void method3218(Class348_Sub49 class348_sub49, int i) {
        anInt9568++;
        for (; ; ) {
            int i_14_ = class348_sub49.readUnsignedByte(i ^ 0xff);
            if (i_14_ == 0) break;
            method3214(i_14_, class348_sub49, 60);
        }
        if (i != 0) method3217((byte) -66);
    }

    final String method3219(int i) {
        anInt9573++;
        if (i < 66) aStringArray9564 = null;
        StringBuffer stringbuffer = new StringBuffer(80);
        if (aStringArray9564 == null) return "";
        stringbuffer.append(aStringArray9564[0]);
        for (int i_15_ = 1; i_15_ < aStringArray9564.length; i_15_++) {
            stringbuffer.append("...");
            stringbuffer.append(aStringArray9564[i_15_]);
        }
        return stringbuffer.toString();
    }

    static {
        anIntArray9572 = new int[]{16, 32, 64, 128};
    }
}
