/* Class369_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class369_Sub2 extends Class369 {
    static Class46[][] aClass46ArrayArray8584;
    int anInt8585;
    static int anInt8586;
    static int anInt8587 = 0;
    static int anInt8588;
    static Class45 aClass45_8589;
    static Class114 aClass114_8590 = new Class114(58, 2);
    int anInt8591;
    static Object anObject8592;
    static int anInt8593;

    public final Class223 method51(byte i) {
        if (i < 116)
            method3572(118);
        anInt8586++;
        return Class348_Sub49.aClass223_7175;
    }

    static final Class45 method3571(boolean bool, int i, byte i_0_, int i_1_) {
        anInt8593++;
        if (i_0_ != -23)
            return null;
        Class137 class137 = null;
        if (Class299_Sub2.aClass78_6328 != null)
            class137 = new Class137(i, Class299_Sub2.aClass78_6328,
                    Class100.aClass78Array1579[i], 1000000);
        Class13.aClass314_Sub1Array223[i]
                = Class175.aClass340_2327.method2673(class137, i,
                Class277.aClass137_3568, 255);
        Class13.aClass314_Sub1Array223[i].method2346(27872);
        return new Class45(Class13.aClass314_Sub1Array223[i], bool, i_1_);
    }

    Class369_Sub2(Class221 class221, Class341 class341, int i, int i_2_,
                  int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
                  int i_9_) {
        super(class221, class341, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_);
        try {
            this.anInt8585 = i_9_;
            this.anInt8591 = i_8_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ou.<init>("
                            + (class221 != null ? "{...}"
                            : "null")
                            + ','
                            + (class341 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_2_ + ','
                            + i_3_ + ',' + i_4_ + ',' + i_5_
                            + ',' + i_6_ + ',' + i_7_ + ','
                            + i_8_ + ',' + i_9_ + ')'));
        }
    }

    public static void method3572(int i) {
        aClass114_8590 = null;
        aClass45_8589 = null;
        if (i != 1000000)
            method3571(false, -66, (byte) 13, 13);
        aClass46ArrayArray8584 = null;
        anObject8592 = null;
    }
}
