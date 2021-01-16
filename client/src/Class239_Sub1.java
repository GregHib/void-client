/* Class239_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub1 extends Class239 {
    static int anInt5841;
    static int anInt5842;
    static int anInt5843;
    static int anInt5844;
    static int anInt5845;
    static int anInt5846;
    static short[][] aShortArrayArray5847;
    static int anInt5848;
    static int anInt5849;
    static int anInt5850;

    static final void method1719(boolean bool, String string, String string_0_,
                                 int i, int i_1_) {
        try {
            Class178.method1356(true, string_0_, i_1_, i, bool, string, true);
            anInt5845++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("aj.G(" + bool + ','
                            + (string != null ? "{...}"
                            : "null")
                            + ','
                            + (string_0_ != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_1_ + ')'));
        }
    }

    final int method1720(int i) {
        anInt5843++;
        if (i != -32350)
            method1714(82, -89);
        return this.anInt3138;
    }

    static final void method1721(String string, byte i) {
        anInt5849++;
        if (r.aBoolean9722 && (0x18 & Class38.anInt500) != 0) {
            int i_2_ = -88 / ((i - -33) / 37);
            boolean bool = false;
            int i_3_ = Class328_Sub1.anInt6513;
            int[] is = Class286_Sub7.anIntArray6290;
            for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
                Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2
                        = (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058
                        [is[i_4_]]);
                if (class318_sub1_sub3_sub3_sub2.aString10544 != null
                        && class318_sub1_sub3_sub3_sub2
                        .aString10544.equalsIgnoreCase(string)
                        && (((class318_sub1_sub3_sub3_sub2
                        == Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907)
                        && (0x10 & Class38.anInt500) != 0)
                        || (class318_sub1_sub3_sub3_sub2 != null
                        && (Class38.anInt500 & 0x8) != 0))) {
                    Class228.anInt2975++;
                    Class348_Sub47 class348_sub47
                            = Class286_Sub3.method2148(Class52.aClass351_4907,
                            (Class348_Sub23_Sub2
                                    .aClass77_9029),
                            -102);
                    class348_sub47
                            .aClass348_Sub49_Sub2_7116
                            .method3349(4325, Class9.anInt169);
                    class348_sub47
                            .aClass348_Sub49_Sub2_7116
                            .method3353(is[i_4_], (byte) 3);
                    class348_sub47
                            .aClass348_Sub49_Sub2_7116
                            .method3353(Class301.anInt3829, (byte) 3);
                    class348_sub47
                            .aClass348_Sub49_Sub2_7116
                            .method3356(Class149.anInt2046, -4086);
                    class348_sub47
                            .aClass348_Sub49_Sub2_7116.method3374((byte) -64, 0);
                    Class348_Sub42_Sub14.method3243(116, class348_sub47);
                    bool = true;
                    Class298.method2252
                            (true,
                                    class318_sub1_sub3_sub3_sub2.anIntArray10320[0],
                                    class318_sub1_sub3_sub3_sub2.anIntArray10317[0],
                                    (byte) -99,
                                    class318_sub1_sub3_sub3_sub2.method2436((byte) 54), 0,
                                    class318_sub1_sub3_sub3_sub2.method2436((byte) 91),
                                    -2, 0);
                    break;
                }
            }
            if (!bool)
                Class59.method544((Class274.aClass274_3504.method2063
                                (Class348_Sub33.anInt6967, 544)) + string,
                        false, 4);
            if (r.aBoolean9722)
                Class341.method2678(-2049);
        }
    }

    final void method1716(boolean bool) {
        if (this.anInt3138 != 1
                && this.anInt3138 != 0)
            this.anInt3138 = method1710(20014);
        if (bool == false)
            anInt5846++;
    }

    Class239_Sub1(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    static final boolean method1722(int i, int i_5_, byte i_6_) {
        int i_7_ = 92 % ((i_6_ - 48) / 32);
        anInt5848++;
        return (0x10000 & i) != 0;
    }

    public static void method1723(byte i) {
        aShortArrayArray5847 = null;
        if (i != 119)
            anInt5850 = -51;
    }

    final int method1714(int i, int i_8_) {
        if (i != 3)
            anInt5850 = 94;
        anInt5841++;
        return 1;
    }

    final void method1712(int i, int i_9_) {
        int i_10_ = -57 / ((82 - i) / 35);
        anInt5844++;
        this.anInt3138 = i_9_;
    }

    Class239_Sub1(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final int method1710(int i) {
        if (i != 20014)
            anInt5850 = -72;
        anInt5842++;
        return 1;
    }
}
