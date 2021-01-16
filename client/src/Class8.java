/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class8 {
    int anInt159;
    int anInt160;
    int anInt161;
    int anInt162;
    static int anInt163;
    static int[] anIntArray164
            = {4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
    static Class364 aClass364_165;
    static int anInt166 = 0;

    public static void method213(byte i) {
        anIntArray164 = null;
        if (i != -106)
            method214(null, 18);
        aClass364_165 = null;
    }

    static final int method214
            (Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1, int i) {
        anInt163++;
        Class79 class79
                = (class318_sub1_sub3_sub3_sub1
                .aClass79_10505);
        if (class79.anIntArray1377 != null) {
            class79
                    = class79.method794(Class318_Sub1_Sub3_Sub3.aClass170_10209,
                    i);
            if (class79 == null)
                return -1;
        }
        int i_0_ = class79.anInt1364;
        if (i != -1)
            return 14;
        Class225 class225 = class318_sub1_sub3_sub3_sub1.method2422((byte) 72);
        if ((class318_sub1_sub3_sub3_sub1
                .anInt10268) != -1
                && !(class318_sub1_sub3_sub3_sub1
                .aBoolean10213)) {
            if ((class318_sub1_sub3_sub3_sub1
                    .anInt10268) != class225.anInt2919
                    && (class225.anInt2920
                    != class318_sub1_sub3_sub3_sub1.anInt10268)
                    && (class225.anInt2949
                    != class318_sub1_sub3_sub3_sub1.anInt10268)
                    && (class225.anInt2914 != (class318_sub1_sub3_sub3_sub1
                    .anInt10268))) {
                if ((class225.anInt2940
                        == class318_sub1_sub3_sub3_sub1.anInt10268)
                        || (class225.anInt2924 == class318_sub1_sub3_sub3_sub1.anInt10268)
                        || (class318_sub1_sub3_sub3_sub1.anInt10268
                        == class225.anInt2947)
                        || (class318_sub1_sub3_sub3_sub1.anInt10268 == class225.anInt2958))
                    i_0_ = class79.anInt1395;
            } else
                i_0_ = class79.anInt1327;
        } else
            i_0_ = class79.anInt1343;
        return i_0_;
    }

    public Class8() {
        /* empty */
    }
}
