/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class281 {
    static Class351 aClass351_3644 = new Class351(42, 8);
    static int anInt3645;
    static int anInt3646;
    static int anInt3647;
    static Class351 aClass351_3648 = new Class351(55, 4);
    static Class143 aClass143_3649;
    static int anInt3650;

    static final void method2106(String string, int i) {
        anInt3645++;
        Class348_Sub47 class348_sub47 = Class203.method1478(true);
        class348_sub47.aClass348_Sub49_Sub2_7116
                .method3378(false, Class178.aClass29_2353.anInt400);
        class348_sub47.aClass348_Sub49_Sub2_7116
                .method3337((byte) 107, 0);
        int i_0_ = (class348_sub47
                .aClass348_Sub49_Sub2_7116
                .anInt7197);
        class348_sub47.aClass348_Sub49_Sub2_7116
                .method3337((byte) 107, 634);
        int[] is = Class50_Sub1.method463(class348_sub47, false);
        int i_1_ = (class348_sub47
                .aClass348_Sub49_Sub2_7116
                .anInt7197);
        class348_sub47.aClass348_Sub49_Sub2_7116
                .method3333((byte) -5, string);
        class348_sub47.aClass348_Sub49_Sub2_7116
                .method3378(false, Class348_Sub33.anInt6967);
        class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197
                += 7;
        class348_sub47.aClass348_Sub49_Sub2_7116.method3350
                (i_1_, true, is,
                        class348_sub47
                                .aClass348_Sub49_Sub2_7116.anInt7197);
        class348_sub47.aClass348_Sub49_Sub2_7116.method3383
                (1809639944,
                        -i_0_ + (class348_sub47
                                .aClass348_Sub49_Sub2_7116
                                .anInt7197));
        Class348_Sub42_Sub14.method3243(118, class348_sub47);
        if (i <= 99)
            method2108(null, 70);
        Class367_Sub2.anInt7297 = 1;
        Class352.anInt4337 = -3;
        Class169.anInt2264 = 0;
        Class105_Sub1.anInt8398 = 0;
    }

    public static void method2107(byte i) {
        aClass351_3648 = null;
        aClass143_3649 = null;
        aClass351_3644 = null;
        if (i != 77)
            method2107((byte) -107);
    }

    static final int method2108(String string, int i) {
        anInt3646++;
        int i_2_ = string.length();
        int i_3_ = 0;
        for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_4_++)
            i_3_ = (Class354.method3464(string.charAt(i_4_), false)
                    + ((i_3_ << -126731387) - i_3_));
        if (i != -29286)
            return 0;
        return i_3_;
    }
}
