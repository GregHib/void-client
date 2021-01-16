/* Class318_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class318_Sub1_Sub1 extends Class318_Sub1 {
    static int anInt8721;
    static int anInt8722;
    static int anInt8723;
    static Class351 aClass351_8724 = new Class351(50, -1);
    static float aFloat8725;
    static int anInt8726;
    short aShort8727;
    static long aLong8728;

    final boolean method2382(byte i) {
        if (i > -51)
            aClass351_8724 = null;
        anInt8723++;
        return aa_Sub2.method164(this.aByte6376,
                (this.anInt6377
                        >> Class362.anInt4459),
                (byte) -97,
                (this.anInt6388
                        >> Class362.anInt4459));
    }

    final int method2384(Class348_Sub1[] class348_sub1s, int i) {
        anInt8722++;
        int i_0_ = 88 % ((i - -14) / 61);
        return this.method2390(class348_sub1s,
                (this.anInt6377
                        >> Class362.anInt4459),
                -2,
                (this.anInt6388
                        >> Class362.anInt4459));
    }

    public static void method2395(byte i) {
        aClass351_8724 = null;
        if (i != 50)
            method2395((byte) 65);
    }

    static final void method2396(int i, int i_1_, int i_2_, int i_3_) {
        i <<= i_3_;
        anInt8726++;
        i_1_ <<= 3;
        i_2_ <<= 3;
        if (Class348_Sub40_Sub21.anInt9282 == 2) {
            Class5.anInt4638 = i_1_;
            Class338.anInt4186 = i_2_;
            Class348_Sub42_Sub19.anInt9701 = i;
        }
        Class314.aFloat3938 = (float) i_1_;
        Class76.aFloat1287 = (float) i;
        Class239_Sub2.method1725(262144);
        Class369_Sub3_Sub1.aBoolean10174 = true;
    }

    Class318_Sub1_Sub1(int i, int i_4_, int i_5_, int i_6_, int i_7_,
                       int i_8_) {
        this.aByte6376 = (byte) i_7_;
        this.anInt6377 = i;
        this.anInt6388 = i_5_;
        this.aShort8727 = (short) i_8_;
        this.anInt6382 = i_4_;
        this.aByte6381 = (byte) i_6_;
    }

    final boolean method2378(int i) {
        if (i != 0)
            aClass351_8724 = null;
        anInt8721++;
        return (Class99.aBooleanArrayArray1572
                [(Class318_Sub1_Sub4_Sub1.anInt10084
                + -Class239_Sub25.anInt6111
                + (this.anInt6377 >> Class362.anInt4459))]
                [((this.anInt6388 >> Class362.anInt4459)
                + -Class285_Sub2.anInt8502
                + Class318_Sub1_Sub4_Sub1.anInt10084)]);
    }
}
