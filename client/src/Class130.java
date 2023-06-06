/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class130 {
    static Class60 aClass60_1894 = new Class60(5);
    static Class356 aClass356_1895 = new Class356(64);
    static int anInt1896;
    static Class45 aClass45_1897;
    static int anInt1898;
    static boolean aBoolean1899 = false;
    static boolean membersWorld = false;

    public static void method1127(int i) {
        aClass45_1897 = null;
        aClass356_1895 = null;
        if (i == 5125) aClass60_1894 = null;
    }

    public Class130() {
        /* empty */
    }

    static final int method1128(int i, Class68 class68) {
        anInt1896++;
        if (Class68.aClass68_1179 != class68) {
            if (class68 != Class68.aClass68_1181) {
                if (class68 == Class68.aClass68_1182) return 5124;
                if (Class68.aClass68_1183 != class68) {
                    if (class68 != Class68.aClass68_1184) {
                        if (class68 == Class68.aClass68_1185) return 5125;
                        if (Class68.aClass68_1186 != class68) {
                            if (Class68.aClass68_1187 == class68) return 5126;
                        } else return 5131;
                    } else return 5123;
                } else return 5121;
            } else return 5122;
        } else return 5120;
        if (i > -19) method1129(-7, -90);
        throw new IllegalArgumentException("");
    }

    static final void method1129(int i, int i_0_) {
        Class367_Sub9.anInt7379 = 3;
        Class164.anInt2173 = i_0_;
        Class34.anInt481 = -1;
        Class348_Sub40_Sub30.anInt9399 = i;
        anInt1898++;
    }

    static final boolean method1130(r var_r, int i, int i_1_, int i_2_, boolean[] bools) {
        boolean bool = false;
        if (aa_Sub1.aSArray5191 != Class332.aSArray4142) {
            int i_3_ = Class348_Sub1_Sub1.aSArray8801[i].method3986(i_1_, i_2_, (byte) -109);
            int i_4_ = 0;
            for (/**/; i_4_ <= i; i_4_++) {
                s var_s = Class348_Sub1_Sub1.aSArray8801[i_4_];
                if (var_s != null) {
                    int i_5_ = i_3_ - var_s.method3986(i_1_, i_2_, (byte) 72);
                    if (bools != null) {
                        bools[i_4_] = var_s.method3989(var_r, i_1_, i_5_, i_2_, 0, false);
                        if (!bools[i_4_]) continue;
                    }
                    var_s.CA(var_r, i_1_, i_5_, i_2_, 0, false);
                    bool = true;
                }
            }
        }
        return bool;
    }
}
