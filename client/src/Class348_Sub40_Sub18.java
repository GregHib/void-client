/* Class348_Sub40_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub18 extends Class348_Sub40 {
    private int anInt9244;
    static Class319 aClass319_9245;
    static int anInt9246;
    static int anInt9247;
    static int anInt9248;
    static int[] anIntArray9249
            = {2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
    private int anInt9250;
    static int anInt9251;
    private int anInt9252;

    static final void method3094(int i,
                                 Class348_Sub49_Sub2 class348_sub49_sub2) {
        anInt9247++;
        int i_0_ = 0;
        class348_sub49_sub2.method3417(-87);
        for (int i_1_ = 0;
             (Class328_Sub1.anInt6513 ^ 0xffffffff) < (i_1_ ^ 0xffffffff);
             i_1_++) {
            int i_2_ = Class286_Sub7.anIntArray6290[i_1_];
            if ((0x1 & Class348_Sub5.aByteArray6624[i_2_] ^ 0xffffffff)
                    == -1) {
                if (i_0_ > 0) {
                    Class348_Sub5.aByteArray6624[i_2_]
                            = (byte) Class273.method2057((Class348_Sub5
                                    .aByteArray6624[i_2_]),
                            2);
                    i_0_--;
                } else {
                    int i_3_ = class348_sub49_sub2.method3410((byte) -24, 1);
                    if ((i_3_ ^ 0xffffffff) == -1) {
                        i_0_ = Class318_Sub1_Sub3
                                .method2413(1, class348_sub49_sub2);
                        Class348_Sub5.aByteArray6624[i_2_]
                                = (byte) Class273.method2057((Class348_Sub5
                                        .aByteArray6624
                                        [i_2_]),
                                2);
                    } else
                        Class286_Sub9.method2177(1, i_2_, class348_sub49_sub2);
                }
            }
        }
        class348_sub49_sub2.method3412(false);
        if ((i_0_ ^ 0xffffffff) != -1)
            throw new RuntimeException("nsn0");
        class348_sub49_sub2.method3417(-65);
        for (int i_4_ = 0; i_4_ < Class328_Sub1.anInt6513; i_4_++) {
            int i_5_ = Class286_Sub7.anIntArray6290[i_4_];
            if ((0x1 & Class348_Sub5.aByteArray6624[i_5_] ^ 0xffffffff)
                    != -1) {
                if (i_0_ > 0) {
                    Class348_Sub5.aByteArray6624[i_5_]
                            = (byte) Class273.method2057((Class348_Sub5
                                    .aByteArray6624[i_5_]),
                            2);
                    i_0_--;
                } else {
                    int i_6_ = class348_sub49_sub2.method3410((byte) -24, 1);
                    if (i_6_ == 0) {
                        i_0_ = Class318_Sub1_Sub3
                                .method2413(1, class348_sub49_sub2);
                        Class348_Sub5.aByteArray6624[i_5_]
                                = (byte) Class273.method2057((Class348_Sub5
                                        .aByteArray6624
                                        [i_5_]),
                                2);
                    } else
                        Class286_Sub9.method2177(i ^ ~0x53e4, i_5_,
                                class348_sub49_sub2);
                }
            }
        }
        class348_sub49_sub2.method3412(false);
        if (i_0_ != 0)
            throw new RuntimeException("nsn1");
        class348_sub49_sub2.method3417(i ^ ~0x5398);
        for (int i_7_ = 0; ((Class348_Sub42_Sub4.anInt9513 ^ 0xffffffff)
                < (i_7_ ^ 0xffffffff)); i_7_++) {
            int i_8_ = Class135_Sub1.anIntArray4709[i_7_];
            if ((0x1 & Class348_Sub5.aByteArray6624[i_8_]) != 0) {
                if ((i_0_ ^ 0xffffffff) < -1) {
                    Class348_Sub5.aByteArray6624[i_8_]
                            = (byte) Class273.method2057((Class348_Sub5
                                    .aByteArray6624[i_8_]),
                            2);
                    i_0_--;
                } else {
                    int i_9_ = class348_sub49_sub2.method3410((byte) -24, 1);
                    if (i_9_ == 0) {
                        i_0_ = Class318_Sub1_Sub3
                                .method2413(i + 21479, class348_sub49_sub2);
                        Class348_Sub5.aByteArray6624[i_8_]
                                = (byte) Class273.method2057((Class348_Sub5
                                        .aByteArray6624
                                        [i_8_]),
                                2);
                    } else if (Class211.method1538(i_8_, (byte) 105,
                            class348_sub49_sub2))
                        Class348_Sub5.aByteArray6624[i_8_]
                                = (byte) Class273.method2057((Class348_Sub5
                                        .aByteArray6624
                                        [i_8_]),
                                2);
                }
            }
        }
        class348_sub49_sub2.method3412(false);
        if (i == -21478) {
            if (i_0_ != 0)
                throw new RuntimeException("nsn2");
            class348_sub49_sub2.method3417(36);
            for (int i_10_ = 0;
                 ((i_10_ ^ 0xffffffff)
                         > (Class348_Sub42_Sub4.anInt9513 ^ 0xffffffff));
                 i_10_++) {
                int i_11_ = Class135_Sub1.anIntArray4709[i_10_];
                if ((Class348_Sub5.aByteArray6624[i_11_] & 0x1) == 0) {
                    if (i_0_ > 0) {
                        Class348_Sub5.aByteArray6624[i_11_]
                                = (byte) Class273.method2057((Class348_Sub5
                                        .aByteArray6624
                                        [i_11_]),
                                2);
                        i_0_--;
                    } else {
                        int i_12_
                                = class348_sub49_sub2.method3410((byte) -24, 1);
                        if ((i_12_ ^ 0xffffffff) == -1) {
                            i_0_ = Class318_Sub1_Sub3
                                    .method2413(1, class348_sub49_sub2);
                            Class348_Sub5.aByteArray6624[i_11_]
                                    = (byte) Class273.method2057((Class348_Sub5
                                            .aByteArray6624
                                            [i_11_]),
                                    2);
                        } else if (Class211.method1538(i_11_, (byte) 105,
                                class348_sub49_sub2))
                            Class348_Sub5.aByteArray6624[i_11_]
                                    = (byte) Class273.method2057((Class348_Sub5
                                            .aByteArray6624
                                            [i_11_]),
                                    2);
                    }
                }
            }
            class348_sub49_sub2.method3412(false);
            if ((i_0_ ^ 0xffffffff) != -1)
                throw new RuntimeException("nsn3");
            Class328_Sub1.anInt6513 = 0;
            Class348_Sub42_Sub4.anInt9513 = 0;
            for (int i_13_ = 1; i_13_ < 2048; i_13_++) {
                Class348_Sub5.aByteArray6624[i_13_] >>= 1;
                Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2
                        = Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i_13_];
                if (class318_sub1_sub3_sub3_sub2 == null)
                    Class135_Sub1.anIntArray4709
                            [Class348_Sub42_Sub4.anInt9513++]
                            = i_13_;
                else
                    Class286_Sub7.anIntArray6290[Class328_Sub1.anInt6513++]
                            = i_13_;
            }
        }
    }

    private Class348_Sub40_Sub18(int i) {
        super(0, false);
        method3095(-104, i);
    }

    final int[][] method3047(int i, int i_14_) {
        anInt9246++;
        int[][] is = ((Class348_Sub40) this).aClass322_7033
                .method2557(i_14_ ^ 0x5d41e2b0, i);
        if (((Class322) ((Class348_Sub40) this).aClass322_7033).aBoolean4035) {
            int[] is_15_ = is[0];
            int[] is_16_ = is[1];
            int[] is_17_ = is[2];
            for (int i_18_ = 0; i_18_ < Class348_Sub40_Sub6.anInt9139;
                 i_18_++) {
                is_15_[i_18_] = anInt9244;
                is_16_[i_18_] = anInt9252;
                is_17_[i_18_] = anInt9250;
            }
        }
        if (i_14_ != -1564599039)
            method3095(102, 6);
        return is;
    }

    private final void method3095(int i, int i_19_) {
        anInt9244 = 0xff0 & i_19_ >> -2106963764;
        anInt9252 = i_19_ >> 1732680260 & 0xff0;
        anInt9248++;
        anInt9250 = (i_19_ & 0xff) << 1427078244;
        if (i >= -54)
            anInt9250 = -42;
    }

    public static void method3096(int i) {
        anIntArray9249 = null;
        aClass319_9245 = null;
        if (i != 32462)
            aClass319_9245 = null;
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_20_) {
        int i_21_ = i;
        if (i_21_ == 0)
            method3095(-124, class348_sub49.method3351(-1));
        anInt9251++;
        if (i_20_ != 31015)
            anInt9250 = 105;
    }

    public Class348_Sub40_Sub18() {
        this(0);
    }
}
