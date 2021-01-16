/* Class348_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub15 extends Class348 {
    Class55_Sub1 aClass55_Sub1_6768;
    static int anInt6769;
    static int[] anIntArray6770 = new int[1000];
    static int anInt6771;
    boolean aBoolean6772;
    int anInt6773;
    static double aDouble6774;
    static int[] anIntArray6775 = new int[13];
    boolean aBoolean6776;
    static int anInt6777;
    static int anInt6778;
    static int anInt6779;
    static int[][] anIntArrayArray6780
            = {{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1},
            {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5},
            {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12},
            {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9},
            {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
    boolean aBoolean6781;
    int anInt6782;
    boolean aBoolean6783;

    public static void method2810(byte i) {
        anIntArray6770 = null;
        anIntArray6775 = null;
        if (i != 79)
            method2814(null, 57);
        anIntArrayArray6780 = null;
    }

    static final void method2811(boolean bool) {
        anInt6777++;
        if (Class348_Sub36.anInt6992 < 0) {
            Class348_Sub36.anInt6992 = 0;
            Class244.anInt4609 = -1;
            Class48.anInt859 = -1;
        }
        if (Class348_Sub36.anInt6992 > Class75.anInt1259) {
            Class348_Sub36.anInt6992 = Class75.anInt1259;
            Class48.anInt859 = -1;
            Class244.anInt4609 = -1;
        }
        if (Class245.anInt3170 < 0) {
            Class48.anInt859 = -1;
            Class245.anInt3170 = 0;
            Class244.anInt4609 = -1;
        }
        if (Class75.anInt1267 < Class245.anInt3170) {
            Class245.anInt3170 = Class75.anInt1267;
            Class244.anInt4609 = -1;
            Class48.anInt859 = -1;
        }
        if (bool != false)
            aDouble6774 = 1.5874482848681375;
    }

    static final String method2812(int i,
                                   Class348_Sub42_Sub13 class348_sub42_sub13) {
        anInt6779++;
        if (i != -44)
            method2812(91, null);
        return (class348_sub42_sub13.aString9617
                + " <col=ffffff>>");
    }

    static final void method2813(boolean bool, int i, int i_0_) {
        anInt6778++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(i_0_, (byte) 105, 7);
        class348_sub42_sub15.method3246(-25490);
        if (bool != true)
            anInt6769 = -113;
        class348_sub42_sub15.anInt9652 = i;
    }

    static final void method2814(Class348_Sub16 class348_sub16, int i) {
        class348_sub16.aBoolean6784 = false;
        if (i >= 39) {
            if (class348_sub16.aClass348_Sub19_6787 != null)
                class348_sub16
                        .aClass348_Sub19_6787.anInt6824
                        = 0;
            anInt6771++;
            for (Class348_Sub16 class348_sub16_1_
                 = class348_sub16.method2816();
                 class348_sub16_1_ != null;
                 class348_sub16_1_ = class348_sub16.method2818())
                method2814(class348_sub16_1_, 40);
        }
    }

    Class348_Sub15(int i, Class55_Sub1 class55_sub1, int i_2_, boolean bool) {
        this.anInt6782 = i_2_;
        this.aClass55_Sub1_6768 = class55_sub1;
        this.anInt6773 = i;
        this.aBoolean6776 = bool;
    }

    static {
        anInt6769 = -1;
    }
}
