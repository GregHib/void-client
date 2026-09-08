/* Component387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Component387
/**
 * RENAMED from `Class130` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static NodeCache aClass60_1894 = new NodeCache(5);
    static LruCache aClass356_1895 = new LruCache(64);
    static int anInt1896;
    static CacheStore aClass45_1897;
    static int anInt1898;
    static boolean aBoolean1899 = false;
    static boolean aBoolean1900 = false;

    public static void method1127(int i) {
        aClass45_1897 = null;
        aClass356_1895 = null;
        if (i == 5125) aClass60_1894 = null;
    }

    public Component387() {
        /* empty */
    }

    static final int method1128(int i, Component342 class68) {
        anInt1896++;
        if (Component342.aClass68_1179 != class68) {
            if (class68 != Component342.aClass68_1181) {
                if (class68 == Component342.aClass68_1182) return 5124;
                if (Component342.aClass68_1183 != class68) {
                    if (class68 != Component342.aClass68_1184) {
                        if (class68 == Component342.aClass68_1185) return 5125;
                        if (Component342.aClass68_1186 != class68) {
                            if (Component342.aClass68_1187 == class68) return 5126;
                        } else return 5131;
                    } else return 5123;
                } else return 5121;
            } else return 5122;
        } else return 5120;
        if (i > -19) method1129(-7, -90);
        throw new IllegalArgumentException("");
    }

    static final void method1129(int i, int i_0_) {
        WaterShader.anInt7379 = 3;
        LoadingManager.anInt2173 = i_0_;
        Component225.anInt481 = -1;
        DefinitionSub30.anInt9399 = i;
        anInt1898++;
    }

    static final boolean method1130(r var_r, int i, int i_1_, int i_2_, boolean[] bools) {
        boolean bool = false;
        if (ShaderSub1.aSArray5191 != Component9.aSArray4142) {
            int i_3_ = NodeSub1Sub1.aSArray8801[i].getInterpolatedHeight(i_1_, i_2_, (byte) -109);
            int i_4_ = 0;
            for (/**/; i_4_ <= i; i_4_++) {
                s var_s = NodeSub1Sub1.aSArray8801[i_4_];
                if (var_s != null) {
                    int i_5_ = i_3_ - var_s.getInterpolatedHeight(i_1_, i_2_, (byte) 72);
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
