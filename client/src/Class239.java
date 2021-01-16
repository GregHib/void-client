/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class239 {
    static int anInt3134;
    static Class114 aClass114_3135 = new Class114(108, 5);
    Class348_Sub51 aClass348_Sub51_3136;
    static int anInt3137;
    int anInt3138;
    static int anInt3139;
    static int anInt3140;
    static int anInt3141;
    static int anInt3142;
    static Class114 aClass114_3143;
    static byte[] aByteArray3144 = new byte[520];
    static Class114 aClass114_3145;
    static Class45 aClass45_3146;
    static Class166 aClass166_3147;

    static final Class231[] method1709(int i) {
        if (i > -110)
            method1715(97);
        anInt3141++;
        return (new Class231[]
                {Class68.aClass231_1189, Class348_Sub40_Sub20.aClass231_9263,
                        Class288.aClass231_4953});
    }

    abstract int method1710(int i);

    static final void method1711(int i, Class45 class45, int i_0_,
                                 Class45 class45_1_) {
        try {
            Class135_Sub2.aClass45_4843 = class45_1_;
            anInt3140++;
            if (i != 7)
                aClass45_3146 = null;
            Class138.aClass45_1940 = class45;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("su.Q(" + i + ','
                            + (class45 != null ? "{...}"
                            : "null")
                            + ',' + i_0_ + ','
                            + (class45_1_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    abstract void method1712(int i, int i_2_);

    static final void method1713(boolean bool, int i) {
        Class239_Sub3.method1728(Class348_Sub42_Sub8_Sub2.anInt10432, -1,
                r.anInt9721, bool, Class321.anInt4017);
        if (i == 520)
            anInt3137++;
    }

    abstract int method1714(int i, int i_3_);

    public static void method1715(int i) {
        aClass114_3145 = null;
        aClass114_3143 = null;
        aClass45_3146 = null;
        aClass114_3135 = null;
        aByteArray3144 = null;
        aClass166_3147 = null;
        if (i < 13)
            method1709(-99);
    }

    abstract void method1716(boolean bool);

    Class239(Class348_Sub51 class348_sub51) {
        this.aClass348_Sub51_3136 = class348_sub51;
        this.anInt3138 = method1710(20014);
    }

    static final void method1717(int i, int i_4_, int i_5_, int i_6_) {
        Class348_Sub33.aByteArrayArrayArray6962 = new byte[i_6_][i_5_][i_4_];
        if (i != 19278)
            method1717(35, 126, -83, 85);
        anInt3134++;
    }

    Class239(int i, Class348_Sub51 class348_sub51) {
        this.aClass348_Sub51_3136 = class348_sub51;
        this.anInt3138 = i;
    }

    final void method1718(int i, int i_7_) {
        if (i_7_ < 3)
            method1712(12, 42);
        anInt3139++;
        if (method1714(3, i) != 3)
            method1712(124, i);
    }

    static {
        aClass114_3143 = new Class114(7, 3);
    }
}
