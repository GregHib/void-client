/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class89 {
    private final Class377 aClass377_1506;
    static long aLong1507;
    static int[] anIntArray1508 = new int[256];
    static int anInt1509;
    long aLong1510;
    static int anInt1511;

    static final void method849(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt1511++;
        if (i_4_ <= 80) method851(-7);
        int i_6_ = i_0_ + i;
        int i_7_ = -i + i_3_;
        for (int i_8_ = i_0_; i_8_ < i_6_; i_8_++)
            Class135_Sub2.method1156(-27, i_2_, Class17.anIntArrayArray255[i_8_], i_1_, i_5_);
        int i_9_ = -i + i_2_;
        for (int i_10_ = i_3_; i_10_ > i_7_; i_10_--)
            Class135_Sub2.method1156(-27, i_2_, Class17.anIntArrayArray255[i_10_], i_1_, i_5_);
        int i_11_ = i + i_1_;
        for (int i_12_ = i_6_; i_7_ >= i_12_; i_12_++) {
            int[] is = Class17.anIntArrayArray255[i_12_];
            Class135_Sub2.method1156(-27, i_11_, is, i_1_, i_5_);
            Class135_Sub2.method1156(-27, i_2_, is, i_9_, i_5_);
        }
    }

    protected final void finalize() throws Throwable {
        anInt1509++;
        aClass377_1506.method3966(this.aLong1510, 34192);
        super.finalize();
    }

    static final boolean method850(Class318_Sub1_Sub3 class318_sub1_sub3, boolean bool) {
        boolean bool_13_ = aa_Sub1.aSArray5191 == Class332.aSArray4142;
        int i = 0;
        short i_14_ = 0;
        byte i_15_ = 0;
        class318_sub1_sub3.method2409((byte) -116);
        if (class318_sub1_sub3.aShort8743 < 0 || class318_sub1_sub3.aShort8750 < 0 || (class318_sub1_sub3.aShort8751 >= Class318_Sub7.anInt6451) || (class318_sub1_sub3.aShort8747 >= Class348_Sub41.anInt7054)) return false;
        short i_16_ = 0;
        for (int i_17_ = class318_sub1_sub3.aShort8743; i_17_ <= class318_sub1_sub3.aShort8751; i_17_++) {
            for (int i_18_ = class318_sub1_sub3.aShort8750; i_18_ <= class318_sub1_sub3.aShort8747; i_18_++) {
                Class357 class357 = Class348_Sub46.method3321(class318_sub1_sub3.plane, i_17_, i_18_);
                if (class357 != null) {
                    Class148 class148 = InputStreamBuffer.method3620(class318_sub1_sub3, 118);
                    Class148 class148_19_ = class357.aClass148_4396;
                    if (class148_19_ == null) class357.aClass148_4396 = class148;
                    else {
                        for (/**/; class148_19_.aClass148_2038 != null; class148_19_ = class148_19_.aClass148_2038) {
                            /* empty */
                        }
                        class148_19_.aClass148_2038 = class148;
                    }
                    if (bool_13_ && (Class342.anIntArrayArray4253[i_17_][i_18_] & ~0xffffff) != 0) {
                        i = Class342.anIntArrayArray4253[i_17_][i_18_];
                        i_14_ = Class239_Sub1.aShortArrayArray5847[i_17_][i_18_];
                        i_15_ = (Class348_Sub1_Sub2.aByteArrayArray8816[i_17_][i_18_]);
                    }
                    if (!bool && (class357.aClass318_Sub1_Sub1_4402 != null) && (class357.aClass318_Sub1_Sub1_4402.aShort8727) > i_16_) i_16_ = (class357.aClass318_Sub1_Sub1_4402.aShort8727);
                }
            }
        }
        if (bool_13_ && (i & ~0xffffff) != 0) {
            for (int i_20_ = class318_sub1_sub3.aShort8743; i_20_ <= class318_sub1_sub3.aShort8751; i_20_++) {
                for (int i_21_ = (class318_sub1_sub3.aShort8750); (i_21_ <= class318_sub1_sub3.aShort8747); i_21_++) {
                    if ((Class342.anIntArrayArray4253[i_20_][i_21_] & ~0xffffff) == 0) {
                        Class342.anIntArrayArray4253[i_20_][i_21_] = i;
                        Class239_Sub1.aShortArrayArray5847[i_20_][i_21_] = i_14_;
                        Class348_Sub1_Sub2.aByteArrayArray8816[i_20_][i_21_] = i_15_;
                    }
                }
            }
        }
        if (bool) Class24.aClass318_Sub1_Sub3Array357[Class86.anInt1477++] = class318_sub1_sub3;
        else {
            int i_22_ = aa_Sub1.aSArray5191 == Class332.aSArray4142 ? 1 : 0;
            if (class318_sub1_sub3.method2376(-118)) {
                if (class318_sub1_sub3.method2377((byte) 122)) {
                    class318_sub1_sub3.aClass318_Sub1_6379 = Class250.aClass318_Sub1Array3226[i_22_];
                    Class250.aClass318_Sub1Array3226[i_22_] = class318_sub1_sub3;
                } else {
                    class318_sub1_sub3.aClass318_Sub1_6379 = Class348.aClass318_Sub1Array4293[i_22_];
                    Class348.aClass318_Sub1Array4293[i_22_] = class318_sub1_sub3;
                    Class348_Sub16_Sub2.aBoolean8870 = true;
                }
            } else {
                class318_sub1_sub3.aClass318_Sub1_6379 = Class115.aClass318_Sub1Array1754[i_22_];
                Class115.aClass318_Sub1Array1754[i_22_] = class318_sub1_sub3;
            }
        }
        if (bool) class318_sub1_sub3.anInt6382 -= i_16_;
        return true;
    }

    public static void method851(int i) {
        if (i == 1) anIntArray1508 = null;
    }

    Class89(Class377 class377, long l, Class39[] class39s) {
        try {
            this.aLong1510 = l;
            aClass377_1506 = class377;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("lha.<init>(" + (class377 != null ? "{...}" : "null") + ',' + l + ',' + (class39s != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        for (int i = 0; i < 256; i++) {
            int i_23_ = i;
            for (int i_24_ = 0; i_24_ < 8; i_24_++) {
                if ((i_23_ & 0x1) != 1) i_23_ >>>= 1;
                else i_23_ = i_23_ >>> 1 ^ ~0x12477cdf;
            }
            anIntArray1508[i] = i_23_;
        }
    }
}
