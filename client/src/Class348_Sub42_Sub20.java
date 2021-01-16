/* Class348_Sub42_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub20 extends Class348_Sub42 {
    Class342 aClass342_9702;
    static int anInt9703;
    Class174 aClass174_9704;
    int anInt9705;
    int anInt9706;
    int anInt9707;
    static int anInt9708;
    static int anInt9709;
    int anInt9710;
    static Class262 aClass262_9711 = new Class262();
    int anInt9712;
    static int anInt9713;
    static int[] anIntArray9714 = {1, 2, 4, 8};
    static int anInt9715;

    final void method3279(int i) {
        ((Class348_Sub42_Sub20) this).anInt9706
                = (((Class342) ((Class348_Sub42_Sub20) this).aClass342_9702)
                .anInt4239);
        anInt9708++;
        ((Class348_Sub42_Sub20) this).anInt9710
                = (((Class342) ((Class348_Sub42_Sub20) this).aClass342_9702)
                .anInt4240);
        ((Class348_Sub42_Sub20) this).anInt9712
                = (((Class342) ((Class348_Sub42_Sub20) this).aClass342_9702)
                .anInt4238);
        if ((((Class342) ((Class348_Sub42_Sub20) this).aClass342_9702)
                .aClass101_4252)
                != null)
            ((Class342) ((Class348_Sub42_Sub20) this).aClass342_9702)
                    .aClass101_4252.method905
                    ((((Class174) ((Class348_Sub42_Sub20) this).aClass174_9704)
                                    .anInt2291),
                            (((Class174) ((Class348_Sub42_Sub20) this).aClass174_9704)
                                    .anInt2290),
                            (((Class174) ((Class348_Sub42_Sub20) this).aClass174_9704)
                                    .anInt2294),
                            Class348_Sub8.anIntArray6666);
        ((Class348_Sub42_Sub20) this).anInt9705
                = Class348_Sub8.anIntArray6666[0];
        ((Class348_Sub42_Sub20) this).anInt9707
                = Class348_Sub8.anIntArray6666[i];
    }

    public static void method3280(int i) {
        aClass262_9711 = null;
        anIntArray9714 = null;
        int i_0_ = 112 / ((i - 16) / 57);
    }

    static final void method3281(byte i, ha var_ha) {
        if (Class5_Sub1.aBoolean8335)
            Class303.method2288(false, var_ha);
        else
            Class119_Sub1.method1077(var_ha, (byte) -123);
        anInt9709++;
        if (i < 29)
            method3280(81);
    }

    static final void method3282(int i, int i_1_, int i_2_, int i_3_, int i_4_,
                                 int i_5_, int i_6_) {
        Class348_Sub51.anInt7244 = i_6_;
        Class14_Sub4.anInt8633 = i_5_;
        Class59_Sub2_Sub1.anInt8668 = i_2_;
        Class348_Sub44.anInt7092 = i;
        Class281.anInt3650 = i_4_;
        Class43.anInt620 = i_1_;
        if (i_3_ != 0)
            method3281((byte) 92, null);
        anInt9703++;
    }

    Class348_Sub42_Sub20(Class342 class342, Class318_Sub10 class318_sub10) {
        try {
            ((Class348_Sub42_Sub20) this).aClass342_9702 = class342;
            ((Class348_Sub42_Sub20) this).aClass174_9704
                    = ((Class348_Sub42_Sub20) this).aClass342_9702
                    .method2685((byte) -13);
            method3279(2);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("jo.<init>("
                            + (class342 != null ? "{...}"
                            : "null")
                            + ','
                            + (class318_sub10 != null
                            ? "{...}" : "null")
                            + ')'));
        }
    }

    static final void method3283(int i) {
        if (((Class297) Class348_Sub23_Sub1.aClass297_8992).aBoolean3777
                && ((((Class161) aa_Sub2.aClass161_5199).anInt2143 ^ 0xffffffff)
                != 0))
            Class348_Sub23_Sub1.method2972((((Class161) aa_Sub2.aClass161_5199)
                            .aString2147),
                    (((Class161) aa_Sub2.aClass161_5199)
                            .anInt2143),
                    -54);
        anInt9713++;
        int i_7_ = 9 / ((i - 60) / 50);
    }
}
