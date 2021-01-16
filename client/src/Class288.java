/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class288 implements Interface12 {
    int anInt4950;
    int anInt4951;
    Class341 aClass341_4952;
    static Class231 aClass231_4953 = new Class231("WIP", 2);
    static int anInt4954;
    Class221 aClass221_4955;
    static int anInt4956;
    static int anInt4957;
    int anInt4958;

    public static void method2185(int i) {
        aClass231_4953 = null;
        if (i != 2)
            aClass231_4953 = null;
    }

    static final int method2186(byte i, String string) {
        anInt4954++;
        if (i != -114)
            method2187(-85, -44, 56);
        return string.length() + 2;
    }

    static final boolean method2187(int i, int i_0_, int i_1_) {
        anInt4956++;
        if (i_0_ > -70)
            method2187(-57, -121, 54);
        return ((Class348.method2709(i_1_, i, -1)
                | Class223.method1613(false, i_1_, i)
                | Class299_Sub1.method2259(0, i_1_, i))
                & Class64.method616(2, i, i_1_));
    }

    public Class223 method51(byte i) {
        if (i <= 116)
            method2186((byte) 116, null);
        anInt4957++;
        return Class348_Sub40_Sub21.aClass223_9274;
    }

    Class288(int i, Class221 class221, Class341 class341, int i_2_, int i_3_) {
        try {
            this.anInt4950 = i_2_;
            this.anInt4958 = i;
            this.anInt4951 = i_3_;
            this.aClass221_4955 = class221;
            this.aClass341_4952 = class341;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("vr.<init>(" + i + ','
                            + (class221 != null ? "{...}"
                            : "null")
                            + ','
                            + (class341 != null ? "{...}"
                            : "null")
                            + ',' + i_2_ + ',' + i_3_ + ')'));
        }
    }
}
