/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class295 {
    static Class114 aClass114_3751;
    static int anInt3752;
    static Class348_Sub42_Sub17[] aClass348_Sub42_Sub17Array3753
            = new Class348_Sub42_Sub17[14];
    String aString3754;
    static int anInt3755;
    String aString3756;
    static int anInt3757;
    String aString3758;
    static int[] anIntArray3759;
    static int anInt3760;
    static double aDouble3761;
    static int anInt3762;
    static boolean aBoolean3763;
    static int anInt3764;

    static final int method2220(int i, int i_0_, int i_1_, byte i_2_) {
        anInt3757++;
        if (i_2_ != 71)
            return -122;
        i_0_ &= 0x3;
        if (i_0_ == 0)
            return i_1_;
        if (i_0_ == 1)
            return i;
        if (i_0_ == 2)
            return 7 + -i_1_;
        return 7 + -i;
    }

    static final void method2221
            (Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2, int i) {
        anInt3752++;
        if (i != -28482)
            aClass348_Sub42_Sub17Array3753 = null;
        Class348_Sub9 class348_sub9
                = ((Class348_Sub9)
                (Class348_Sub42_Sub16_Sub2.aClass356_10465.method3480
                        ((long) ((Class318_Sub1_Sub3_Sub3)
                                        class318_sub1_sub3_sub3_sub2).anInt10290,
                                -6008)));
        if (class348_sub9 != null) {
            if (((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
                    != null) {
                Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
                        (((Class348_Sub9) class348_sub9)
                                .aClass348_Sub16_Sub5_6676);
                ((Class348_Sub9) class348_sub9).aClass348_Sub16_Sub5_6676
                        = null;
            }
            class348_sub9.method2715((byte) 82);
        }
    }

    static final void method2222(int i, byte i_3_) {
        anInt3755++;
        Class73.aLong4783 = 1000000000L / (long) i;
        if (i_3_ != -124)
            method2223(-83);
    }

    public static void method2223(int i) {
        aClass348_Sub42_Sub17Array3753 = null;
        anIntArray3759 = null;
        aClass114_3751 = null;
        if (i < 100)
            aBoolean3763 = false;
    }

    Class295(String string, String string_4_, String string_5_) {
        try {
            ((Class295) this).aString3754 = string_4_;
            ((Class295) this).aString3758 = string_5_;
            ((Class295) this).aString3756 = string;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("wc.<init>(" + (string != null ? "{...}" : "null")
                                    + ',' + (string_4_ != null ? "{...}" : "null") + ','
                                    + (string_5_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aClass114_3751 = new Class114(1, 2);
        anInt3760 = -1;
        anInt3764 = 0;
    }
}
