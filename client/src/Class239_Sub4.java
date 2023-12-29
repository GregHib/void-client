/* Class239_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub4 extends Class239 {
    static int anInt5872;
    static int anInt5873;
    static float[] aFloatArray5874 = new float[16384];
    static int anInt5875;
    static float[] aFloatArray5876 = new float[16384];
    static int anInt5877;
    static Index MIDI_INSTRUMENTS;
    static int anInt5879;
    static int anInt5880;
    static Class348_Sub26 aClass348_Sub26_5881;
    static String aString5882;
    static Class114 aClass114_5883;

    final void method1716(boolean bool) {
        if (bool != false) method1736(-57);
        anInt5880++;
        if (this.aClass348_Sub51_3136.method3422(674) != Class10.aClass230_186) this.anInt3138 = 1;
        else if (this.aClass348_Sub51_3136.method3425(-95)) this.anInt3138 = 0;
        if (this.anInt3138 != 0 && this.anInt3138 != 1) this.anInt3138 = method1710(20014);
    }

    final void method1712(int i, int i_0_) {
        int i_1_ = 107 / ((i - 82) / 35);
        anInt5879++;
        this.anInt3138 = i_0_;
    }

    final boolean method1736(int i) {
        anInt5873++;
        if (this.aClass348_Sub51_3136.method3425(-80)) return false;
        if (i < 85) method1716(true);
        return this.aClass348_Sub51_3136.method3422(674) == Class10.aClass230_186;
    }

    Class239_Sub4(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    final int method1710(int i) {
        if (i != 20014) aClass114_5883 = null;
        anInt5877++;
        return 1;
    }

    final int method1737(int i) {
        if (i != -32350) method1716(true);
        anInt5875++;
        return this.anInt3138;
    }

    final int method1714(int i, int i_2_) {
        if (i != 3) aString5882 = null;
        anInt5872++;
        if (this.aClass348_Sub51_3136.method3425(-63)) return 3;
        if (this.aClass348_Sub51_3136.method3422(674) == Class10.aClass230_186) return 1;
        return 3;
    }

    public static void method1738(int i) {
        MIDI_INSTRUMENTS = null;
        aFloatArray5874 = null;
        aString5882 = null;
        if (i != 21921) method1738(11);
        aFloatArray5876 = null;
        aClass348_Sub26_5881 = null;
        aClass114_5883 = null;
    }

    Class239_Sub4(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    static {
        double d = 3.834951969714103E-4;
        for (int i = 0; i < 16384; i++) {
            aFloatArray5874[i] = (float) Math.sin(d * (double) i);
            aFloatArray5876[i] = (float) Math.cos((double) i * d);
        }
        aClass114_5883 = new Class114(34, 12);
    }
}
