/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class97 {
    private int anInt1544;
    static int anInt1545;
    private int anInt1546;
    private int anInt1547;
    static int anInt1548 = -1;
    static int anInt1549;
    static int anInt1550 = 0;
    private Interface5_Impl2 anInterface5_Impl2_1551;
    static int anInt1552;
    static int anInt1553;
    static int anInt1554;
    static int anInt1555;
    private Interface18_Impl3 anInterface18_Impl3_1556;
    static int anInt1557;
    private int anInt1558 = -1;
    private int anInt1559;
    private Class330 aClass330_1560;
    private ha_Sub3 aHa_Sub3_1561;
    boolean aBoolean1562 = true;
    int anInt1563;

    final void method871(byte i) {
        anInt1552++;
        if (i >= 77)
            method875(-126, anInterface5_Impl2_1551,
                    ((Class97) this).anInt1563);
    }

    static final void method872(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                int i_4_, int i_5_) {
        anInt1554++;
        if (i_5_ >= Class369.anInt4960
                && (i_4_ ^ 0xffffffff) >= (Class113.anInt1745 ^ 0xffffffff)
                && Class132.anInt1910 <= i_2_
                && (i_3_ ^ 0xffffffff) >= (Class38.anInt513 ^ 0xffffffff)) {
            if ((i_1_ ^ 0xffffffff) == -2)
                Class184.method1388(i_2_, i, i_0_ + 107, i_4_, i_5_, i_3_);
            else
                Class89.method849(i_1_, i_2_, i_5_, i_4_, i_3_, 100, i);
        } else if (i_1_ != 1)
            Class58.method535(i_5_, i_3_, i_1_, i_4_, i, i_2_, (byte) -106);
        else
            Class369_Sub3_Sub1.method3575((byte) 103, i_4_, i, i_3_, i_2_,
                    i_5_);
        if (i_0_ != 1)
            method873(47, 5, null, 1);
    }

    static final void method873(int i, int i_6_, ha var_ha, int i_7_) {
        Class60.aHa1098 = var_ha;
        Class262.aClass190ArrayArray3335 = new Class190[i][i_7_];
        if (i_6_ == 21719) {
            anInt1549++;
            if (Class81.anIntArray1432 != null)
                Class348_Sub42_Sub10.aClass299_9571
                        = Class230.method1636(Class81.anIntArray1432[4],
                        Class81.anIntArray1432[3],
                        Class81.anIntArray1432[0],
                        Class81.anIntArray1432[5],
                        Class81.anIntArray1432[1], -1,
                        Class81.anIntArray1432[2]);
            Class274.aClass190_3547 = new Class190();
            ha_Sub3.method3936(0);
        }
    }

    private final void method874(int i) {
        anInt1553++;
        if (((Class97) this).aBoolean1562) {
            ((Class97) this).aBoolean1562 = false;
            byte[] is = ((Class330) aClass330_1560).aByteArray4112;
            int i_8_ = 0;
            int i_9_ = ((Class330) aClass330_1560).anInt4113;
            int i_10_ = (((Class330) aClass330_1560).anInt4113 * anInt1559
                    + anInt1544);
            for (int i_11_ = -128; (i_11_ ^ 0xffffffff) > -1; i_11_++) {
                i_8_ = (i_8_ << 859744648) - i_8_;
                for (int i_12_ = -128; i_12_ < 0; i_12_++) {
                    if ((is[i_10_++] ^ 0xffffffff) != -1)
                        i_8_++;
                }
                i_10_ += i_9_ - 128;
            }
            if (anInterface18_Impl3_1556 != null
                    && (anInt1558 ^ 0xffffffff) == (i_8_ ^ 0xffffffff))
                ((Class97) this).aBoolean1562 = false;
            else {
                anInt1558 = i_8_;
                if (i != -12763)
                    anInt1546 = -8;
                int i_13_ = 0;
                i_10_ = anInt1544 + anInt1559 * i_9_;
                if (aHa_Sub3_1561.method3880(Class68.aClass68_1183,
                        (Class348_Sub40_Sub38
                                .aClass304_9471),
                        (byte) 122)) {
                    if (Class367_Sub11.aByteArray7394 == null)
                        Class367_Sub11.aByteArray7394 = new byte[16384];
                    byte[] is_14_ = Class367_Sub11.aByteArray7394;
                    for (int i_15_ = -128; (i_15_ ^ 0xffffffff) > -1;
                         i_15_++) {
                        for (int i_16_ = -128; (i_16_ ^ 0xffffffff) > -1;
                             i_16_++) {
                            if ((is[i_10_] ^ 0xffffffff) == -1) {
                                int i_17_ = 0;
                                if ((is[i_10_ + -1] ^ 0xffffffff) != -1)
                                    i_17_++;
                                if (is[1 + i_10_] != 0)
                                    i_17_++;
                                if ((is[i_10_ + -i_9_] ^ 0xffffffff) != -1)
                                    i_17_++;
                                if ((is[i_9_ + i_10_] ^ 0xffffffff) != -1)
                                    i_17_++;
                                is_14_[i_13_++] = (byte) (17 * i_17_);
                            } else
                                is_14_[i_13_++] = (byte) 68;
                            i_10_++;
                        }
                        i_10_ += -128 + ((Class330) aClass330_1560).anInt4113;
                    }
                    if (anInterface18_Impl3_1556 == null) {
                        anInterface18_Impl3_1556
                                = aHa_Sub3_1561.method3944((Class367_Sub11
                                        .aByteArray7394),
                                128,
                                (Class348_Sub40_Sub38
                                        .aClass304_9471),
                                i ^ ~0x31d8, false,
                                128);
                        anInterface18_Impl3_1556.method66(false, false,
                                i ^ ~0x5582);
                    } else
                        anInterface18_Impl3_1556.method70(0, 0, (byte) -45,
                                128, 128, 128, 0,
                                (Class367_Sub11
                                        .aByteArray7394),
                                (Class348_Sub40_Sub38
                                        .aClass304_9471));
                } else {
                    if (Class40.anIntArray543 == null)
                        Class40.anIntArray543 = new int[16384];
                    int[] is_18_ = Class40.anIntArray543;
                    for (int i_19_ = -128; i_19_ < 0; i_19_++) {
                        for (int i_20_ = -128; (i_20_ ^ 0xffffffff) > -1;
                             i_20_++) {
                            if (is[i_10_] == 0) {
                                int i_21_ = 0;
                                if ((is[i_10_ + -1] ^ 0xffffffff) != -1)
                                    i_21_++;
                                if (is[i_10_ - -1] != 0)
                                    i_21_++;
                                if ((is[i_10_ + -i_9_] ^ 0xffffffff) != -1)
                                    i_21_++;
                                if (is[i_9_ + i_10_] != 0)
                                    i_21_++;
                                is_18_[i_13_++] = i_21_ * 17 << -1915178344;
                            } else
                                is_18_[i_13_++] = 1140850688;
                            i_10_++;
                        }
                        i_10_ += -128 + ((Class330) aClass330_1560).anInt4113;
                    }
                    if (anInterface18_Impl3_1556 == null) {
                        anInterface18_Impl3_1556
                                = aHa_Sub3_1561.method3839(128, 128, -15137, false,
                                Class40.anIntArray543);
                        anInterface18_Impl3_1556.method66(false, false,
                                i + 38451);
                    } else
                        anInterface18_Impl3_1556.method68(128, i + 35572,
                                (Class40
                                        .anIntArray543),
                                0, 0, 128, 0, 128);
                }
            }
        }
    }

    final void method875(int i, Interface5_Impl2 interface5_impl2, int i_22_) {
        if (i_22_ > 0) {
            method874(-12763);
            aHa_Sub3_1561.method3850((byte) 119, anInterface18_Impl3_1556);
            aHa_Sub3_1561.method3938(Class247.aClass21_3181, i_22_,
                    interface5_impl2, anInt1547, 0,
                    -anInt1547 + (anInt1546 - -1), 47);
        }
        anInt1545++;
        if (i > -47)
            ((Class97) this).anInt1563 = 75;
    }

    static final void method876(int i, int i_23_) {
        anInt1557++;
        synchronized (Class24.aClass60_355) {
            Class24.aClass60_355.method578(2, i);
        }
        synchronized (Class130.aClass60_1894) {
            Class130.aClass60_1894.method578(2, i);
            if (i_23_ != 0)
                method876(51, 108);
        }
    }

    Class97(ha_Sub3 var_ha_Sub3, Class330 class330, s_Sub3 var_s_Sub3, int i,
            int i_24_, int i_25_, int i_26_, int i_27_) {
        try {
            aHa_Sub3_1561 = var_ha_Sub3;
            anInt1544 = i_26_;
            anInt1559 = i_27_;
            aClass330_1560 = class330;
            int i_28_ = 1 << i_25_;
            int i_29_ = 0;
            int i_30_ = i << i_25_;
            int i_31_ = i_24_ << i_25_;
            for (int i_32_ = 0; i_28_ > i_32_; i_32_++) {
                int i_33_
                        = i_30_ + (i_32_ + i_31_) * ((s) var_s_Sub3).anInt4587;
                for (int i_34_ = 0; i_28_ > i_34_; i_34_++) {
                    short[] is
                            = ((s_Sub3) var_s_Sub3).aShortArrayArray8299[i_33_++];
                    if (is != null)
                        i_29_ += is.length;
                }
            }
            if (i_29_ <= 0) {
                ((Class97) this).anInt1563 = 0;
                anInterface18_Impl3_1556 = null;
            } else {
                anInt1546 = -2147483648;
                anInt1547 = 2147483647;
                anInterface5_Impl2_1551
                        = aHa_Sub3_1561.method3840(-28633, false);
                anInterface5_Impl2_1551.method23(15959, i_29_);
                for (int i_35_ = 0; i_35_ < 4; i_35_++) {
                    Buffer buffer
                            = anInterface5_Impl2_1551.method24(true, false);
                    if (buffer != null) {
                        Stream stream = aHa_Sub3_1561.method3893(buffer, 9179);
                        if (!Stream.c()) {
                            for (int i_36_ = 0;
                                 (i_28_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff);
                                 i_36_++) {
                                int i_37_
                                        = (((s) var_s_Sub3).anInt4587 * (i_31_
                                        - -i_36_)
                                        + i_30_);
                                for (int i_38_ = 0;
                                     ((i_28_ ^ 0xffffffff)
                                             < (i_38_ ^ 0xffffffff));
                                     i_38_++) {
                                    short[] is
                                            = (((s_Sub3) var_s_Sub3)
                                            .aShortArrayArray8299[i_37_++]);
                                    if (is != null) {
                                        for (int i_39_ = 0;
                                             ((is.length ^ 0xffffffff)
                                                     < (i_39_ ^ 0xffffffff));
                                             i_39_++) {
                                            int i_40_ = 0xffff & is[i_39_];
                                            if ((i_40_ ^ 0xffffffff)
                                                    > (anInt1547 ^ 0xffffffff))
                                                anInt1547 = i_40_;
                                            if (i_40_ > anInt1546)
                                                anInt1546 = i_40_;
                                            stream.a(i_40_);
                                        }
                                    }
                                }
                            }
                        } else {
                            for (int i_41_ = 0; i_41_ < i_28_; i_41_++) {
                                int i_42_
                                        = (((s) var_s_Sub3).anInt4587 * (i_41_
                                        + i_31_)
                                        - -i_30_);
                                for (int i_43_ = 0;
                                     ((i_43_ ^ 0xffffffff)
                                             > (i_28_ ^ 0xffffffff));
                                     i_43_++) {
                                    short[] is
                                            = (((s_Sub3) var_s_Sub3)
                                            .aShortArrayArray8299[i_42_++]);
                                    if (is != null) {
                                        for (int i_44_ = 0;
                                             ((i_44_ ^ 0xffffffff)
                                                     > (is.length ^ 0xffffffff));
                                             i_44_++) {
                                            int i_45_ = 0xffff & is[i_44_];
                                            if (anInt1546 < i_45_)
                                                anInt1546 = i_45_;
                                            if (i_45_ < anInt1547)
                                                anInt1547 = i_45_;
                                            stream.d(i_45_);
                                        }
                                    }
                                }
                            }
                        }
                        stream.a();
                        if (anInterface5_Impl2_1551.method22(-23))
                            break;
                    }
                }
                ((Class97) this).anInt1563 = i_29_ / 3;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("mc.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null")
                                    + ',' + (class330 != null ? "{...}" : "null") + ','
                                    + (var_s_Sub3 != null ? "{...}" : "null") + ',' + i
                                    + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_
                                    + ')'));
        }
    }
}
