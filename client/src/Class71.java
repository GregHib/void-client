/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class71 {
    static Class76 aClass76_1208;
    static int anInt1209;
    static Class76 aClass76_1210;
    static boolean aBoolean1211 = false;
    static Class209 aClass209_1212;
    static Class138 aClass138_1213;
    static boolean[] aBooleanArray1214;

    public static void method728(boolean bool) {
        aClass209_1212 = null;
        aClass76_1208 = null;
        aClass76_1210 = null;
        aBooleanArray1214 = null;
        if (bool != true) aClass209_1212 = null;
        aClass138_1213 = null;
    }

    static final void method729(int i, int i_0_, byte i_1_, Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3, int i_2_) {
        if (i_1_ < 60) method728(true);
        anInt1209++;
        Class225 class225 = class318_sub1_sub3_sub3.method2422((byte) 72);
        int i_3_ = 0x3fff & ((class318_sub1_sub3_sub3.anInt10282) - class318_sub1_sub3_sub3.aClass264_10217.anInt3370);
        if (i != -1) {
            if ((class318_sub1_sub3_sub3.anInt10275 == -1) || (i_3_ < 10240 && i_3_ > 2048)) {
                if (i_3_ == 0 && (class318_sub1_sub3_sub3.anInt10247) <= 25) {
                    if (i == 2 && class225.anInt2919 != -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2919;
                    else if (i != 0 || class225.anInt2940 == -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2951;
                    else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2940;
                    class318_sub1_sub3_sub3.aBoolean10213 = false;
                } else {
                    if (i != 2 || class225.anInt2919 == -1) {
                        if (i != 0 || class225.anInt2940 == -1) {
                            if (i_0_ < 0 && class225.anInt2934 != -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2934;
                            else if (i_0_ <= 0 || class225.anInt2953 == -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2951;
                            else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2953;
                        } else if (i_0_ < 0 && class225.anInt2908 != -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2908;
                        else if (i_0_ > 0 && class225.anInt2927 != -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2927;
                        else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2940;
                    } else if (i_0_ >= 0 || class225.anInt2905 == -1) {
                        if (i_0_ <= 0 || class225.anInt2911 == -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2919;
                        else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2911;
                    } else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2905;
                    class318_sub1_sub3_sub3.aBoolean10213 = false;
                }
            } else {
                int i_4_ = 0x3fff & (Class10.anIntArray187[i_2_] - class318_sub1_sub3_sub3.aClass264_10217.anInt3370);
                if (i != 2 || class225.anInt2919 == -1) {
                    if (i == 0 && (class225.anInt2940 != -1)) {
                        if (i_4_ <= 2048 || i_4_ > 6144 || class225.anInt2947 == -1) {
                            if (i_4_ >= 10240 && i_4_ < 14336 && class225.anInt2958 != -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2958;
                            else if (i_4_ > 6144 && i_4_ < 10240 && class225.anInt2924 != -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2924;
                            else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2940;
                        } else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2947;
                    } else if (i_4_ > 2048 && i_4_ <= 6144 && class225.anInt2954 != -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2954;
                    else if (i_4_ >= 10240 && i_4_ < 14336 && (class225.anInt2937 != -1)) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2937;
                    else if (i_4_ > 6144 && i_4_ < 10240 && class225.anInt2938 != -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2938;
                    else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2951;
                } else if (i_4_ > 2048 && i_4_ <= 6144 && (class225.anInt2949 != -1)) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2949;
                else if (i_4_ < 10240 || i_4_ >= 14336 || class225.anInt2914 == -1) {
                    if (i_4_ <= 6144 || i_4_ >= 10240 || class225.anInt2920 == -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2919;
                    else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2920;
                } else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2914;
                class318_sub1_sub3_sub3.aBoolean10213 = false;
            }
        } else if (i_3_ != 0 || (class318_sub1_sub3_sub3.anInt10247) > 25) {
            if (i_0_ >= 0 || class225.anInt2916 == -1) {
                if (i_0_ <= 0 || class225.anInt2922 == -1) class318_sub1_sub3_sub3.anInt10268 = class225.anInt2951;
                else class318_sub1_sub3_sub3.anInt10268 = class225.anInt2922;
            } else {
                class318_sub1_sub3_sub3.aBoolean10213 = false;
                class318_sub1_sub3_sub3.anInt10268 = class225.anInt2916;
            }
            class318_sub1_sub3_sub3.aBoolean10213 = false;
        } else if (!(class318_sub1_sub3_sub3.aBoolean10213) || !class225.method1623((class318_sub1_sub3_sub3.anInt10268), -118)) {
            class318_sub1_sub3_sub3.anInt10268 = class225.method1621((byte) 37);
            class318_sub1_sub3_sub3.aBoolean10213 = (class318_sub1_sub3_sub3.anInt10268) != -1;
        }
    }

    static {
        aClass76_1208 = aClass76_1210 = new Class76(false);
        aClass209_1212 = new Class209();
        aClass138_1213 = new Class138(11, 0, 1, 2);
        aBooleanArray1214 = new boolean[8];
    }
}
