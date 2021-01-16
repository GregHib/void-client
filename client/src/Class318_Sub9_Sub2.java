/* Class318_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class318_Sub9_Sub2 extends Class318_Sub9 {
    int anInt8789;
    int anInt8790;
    int anInt8791;
    int anInt8792;
    int anInt8793;
    boolean aBoolean8794;
    byte aByte8795 = 5;
    int anInt8796;
    static int[] anIntArray8797 = {19, 55, 38, 155, 255, 110, 137, 205, 76};

    public static void method2518(int i) {
        if (i == 137) anIntArray8797 = null;
    }

    static final void method2519(Class318_Sub1 class318_sub1, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        boolean bool = true;
        int i_4_ = i_0_;
        int i_5_ = i_0_ + i_2_;
        int i_6_ = i_1_ - 1;
        int i_7_ = i_1_ + i_3_;
        for (int i_8_ = i; i_8_ <= i + 1; i_8_++) {
            if (i_8_ != Class189.anInt2524) {
                for (int i_9_ = i_4_; i_9_ <= i_5_; i_9_++) {
                    if (i_9_ >= 0 && i_9_ < Class318_Sub7.anInt6451) {
                        for (int i_10_ = i_6_; i_10_ <= i_7_; i_10_++) {
                            if (i_10_ >= 0 && i_10_ < Class348_Sub41.anInt7054 && (!bool || i_9_ >= i_5_ || i_10_ >= i_7_ || i_10_ < i_1_ && i_9_ != i_0_)) {
                                Class357 class357 = (Class147.aClass357ArrayArrayArray2029[i_8_][i_9_][i_10_]);
                                if (class357 != null) {
                                    int i_11_ = (((aa_Sub1.aSArray5191[i_8_].method3982((byte) -86, i_10_, i_9_)) + (aa_Sub1.aSArray5191[i_8_].method3982((byte) -86, i_10_, i_9_ + 1)) + (aa_Sub1.aSArray5191[i_8_].method3982((byte) -86, i_10_ + 1, i_9_)) + (aa_Sub1.aSArray5191[i_8_].method3982((byte) -86, i_10_ + 1, i_9_ + 1))) / 4 - ((aa_Sub1.aSArray5191[i].method3982((byte) -86, i_1_, i_0_)) + (aa_Sub1.aSArray5191[i].method3982((byte) -86, i_1_, i_0_ + 1)) + (aa_Sub1.aSArray5191[i].method3982((byte) -86, i_1_ + 1, i_0_)) + (aa_Sub1.aSArray5191[i].method3982((byte) -86, i_1_ + 1, i_0_ + 1))) / 4);
                                    Class318_Sub1_Sub4 class318_sub1_sub4 = (class357.aClass318_Sub1_Sub4_4406);
                                    Class318_Sub1_Sub4 class318_sub1_sub4_12_ = (class357.aClass318_Sub1_Sub4_4403);
                                    if (class318_sub1_sub4 != null && class318_sub1_sub4.method2388(-127))
                                        class318_sub1.method2380(Class9.aHa171, i_11_, bool, class318_sub1_sub4, (((i_10_ - i_1_) * Class270.anInt3465) + ((1 - i_3_) * (Class348_Sub23_Sub2.anInt9037))), (byte) -112, (((i_9_ - i_0_) * Class270.anInt3465) + ((1 - i_2_) * (Class348_Sub23_Sub2.anInt9037))));
                                    if (class318_sub1_sub4_12_ != null && class318_sub1_sub4_12_.method2388(-100))
                                        class318_sub1.method2380(Class9.aHa171, i_11_, bool, class318_sub1_sub4_12_, (((i_10_ - i_1_) * Class270.anInt3465) + ((1 - i_3_) * (Class348_Sub23_Sub2.anInt9037))), (byte) -115, (((i_9_ - i_0_) * Class270.anInt3465) + ((1 - i_2_) * (Class348_Sub23_Sub2.anInt9037))));
                                    for (Class148 class148 = (class357.aClass148_4396); class148 != null; class148 = (class148.aClass148_2038)) {
                                        Class318_Sub1_Sub3 class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040);
                                        if (class318_sub1_sub3 != null && class318_sub1_sub3.method2388(-111) && (i_9_ == (class318_sub1_sub3.aShort8743) || i_9_ == i_4_) && (i_10_ == (class318_sub1_sub3.aShort8750) || i_10_ == i_6_)) {
                                            int i_13_ = ((class318_sub1_sub3.aShort8751) - (class318_sub1_sub3.aShort8743) + 1);
                                            int i_14_ = ((class318_sub1_sub3.aShort8747) - (class318_sub1_sub3.aShort8750) + 1);
                                            class318_sub1.method2380(Class9.aHa171, i_11_, bool, class318_sub1_sub3, (((class318_sub1_sub3.aShort8750) - i_1_) * Class270.anInt3465 + ((i_14_ - i_3_) * (Class348_Sub23_Sub2.anInt9037))), (byte) -115, (((class318_sub1_sub3.aShort8743) - i_0_) * Class270.anInt3465 + ((i_13_ - i_2_) * (Class348_Sub23_Sub2.anInt9037))));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i_4_--;
                bool = false;
            }
        }
    }

    public Class318_Sub9_Sub2() {
        /* empty */
    }
}
