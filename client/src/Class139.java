/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class139 {
    byte[] aByteArray1948;
    static int anInt1949 = 0;
    static int anInt1950;
    short[] aShortArray1951;
    static boolean aBoolean1952 = false;
    short[] aShortArray1953;
    short[] aShortArray1954;
    static int anInt1955;

    static final void method1165(int i) {
        Class299.aClass348_Sub49_Sub2_3813.method3417(i ^ ~0x79);
        anInt1950++;
        int i_0_
                = Class299.aClass348_Sub49_Sub2_3813.method3410((byte) -24, 8);
        if (i == 1) {
            if (i_0_ < Class150.anInt2057) {
                for (int i_1_ = i_0_; Class150.anInt2057 > i_1_; i_1_++)
                    Class5_Sub1_Sub1.anIntArray9932[Class358.anInt4411++]
                            = Class74.anIntArray1233[i_1_];
            }
            if (i_0_ > Class150.anInt2057)
                throw new RuntimeException("gnpov1");
            Class150.anInt2057 = 0;
            for (int i_2_ = 0; i_2_ < i_0_;
                 i_2_++) {
                int i_3_ = Class74.anIntArray1233[i_2_];
                Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1
                        = (((Class348_Sub22) Class282.aClass356_3654.method3480(i_3_, -6008))
                        .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
                int i_4_
                        = Class299.aClass348_Sub49_Sub2_3813.method3410((byte) -24,
                        1);
                if (i_4_ == 0) {
                    Class74.anIntArray1233[Class150.anInt2057++] = i_3_;
                    class318_sub1_sub3_sub3_sub1
                            .anInt10306
                            = Class348_Sub23_Sub3.anInt9041;
                } else {
                    int i_5_ = Class299.aClass348_Sub49_Sub2_3813
                            .method3410((byte) -24, 2);
                    if (i_5_ == 0) {
                        Class74.anIntArray1233[Class150.anInt2057++] = i_3_;
                        class318_sub1_sub3_sub3_sub1.anInt10306
                                = Class348_Sub23_Sub3.anInt9041;
                        Class13.anIntArray224[Class101.anInt1597++] = i_3_;
                    } else if (i_5_ == 1) {
                        Class74.anIntArray1233[Class150.anInt2057++] = i_3_;
                        class318_sub1_sub3_sub3_sub1.anInt10306
                                = Class348_Sub23_Sub3.anInt9041;
                        int i_6_ = Class299.aClass348_Sub49_Sub2_3813
                                .method3410((byte) -24, 3);
                        class318_sub1_sub3_sub3_sub1.method2443(i_6_, 1, -10);
                        int i_7_ = Class299.aClass348_Sub49_Sub2_3813
                                .method3410((byte) -24, 1);
                        if (i_7_ == 1)
                            Class13.anIntArray224[Class101.anInt1597++] = i_3_;
                    } else if (i_5_ == 2) {
                        Class74.anIntArray1233[Class150.anInt2057++] = i_3_;
                        class318_sub1_sub3_sub3_sub1.anInt10306
                                = Class348_Sub23_Sub3.anInt9041;
                        if (Class299.aClass348_Sub49_Sub2_3813
                                .method3410((byte) -24, 1) == 1) {
                                    int i_9_ = Class299.aClass348_Sub49_Sub2_3813
                                            .method3410((byte) -24, 3);
                                    class318_sub1_sub3_sub3_sub1.method2443(i_9_, 2,
                                            -10);
                                    int i_10_ = Class299.aClass348_Sub49_Sub2_3813
                                            .method3410((byte) -24, 3);
                                    class318_sub1_sub3_sub3_sub1.method2443(i_10_, 2,
                                            -10);
                                } else {
                            int i_8_ = Class299.aClass348_Sub49_Sub2_3813
                                    .method3410((byte) -24, 3);
                            class318_sub1_sub3_sub3_sub1.method2443(i_8_, 0,
                                    i + -11);
                        }
                        int i_11_ = Class299.aClass348_Sub49_Sub2_3813
                                .method3410((byte) -24, 1);
                        if (i_11_ == 1)
                            Class13.anIntArray224[Class101.anInt1597++] = i_3_;
                    } else if (i_5_ == 3)
                        Class5_Sub1_Sub1.anIntArray9932[Class358.anInt4411++]
                                = i_3_;
                }
            }
        }
    }

    static int method1166(int i, int i_12_) {
        return i & i_12_;
    }

    static final boolean method1167(int i, byte i_13_) {
        anInt1955++;
        if (i_13_ >= -45)
            anInt1949 = 88;
        return i == 0 || i == 1 || i == 2;
    }
}
