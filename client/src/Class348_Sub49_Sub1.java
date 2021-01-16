/* Class348_Sub49_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;

final class Class348_Sub49_Sub1 extends Class348_Sub49 {
    static int anInt9741;
    static int anInt9742;
    static Class351 aClass351_9743 = new Class351(84, -1);
    static int anInt9744;
    static int anInt9745;
    static boolean aBoolean9746 = true;
    static int anInt9747;
    static Class138 aClass138_9748 = new Class138(7, 0, 1, 1);
    static Class351 aClass351_9749;
    static int anInt9750;
    static int anInt9751 = 0;

    static final void method3398(boolean bool, byte[][][] is, int i, byte i_0_,
                                 int i_1_, int i_2_, boolean bool_3_) {
        int i_4_ = bool ? 1 : 0;
        Class5_Sub1_Sub1.anInt9930 = 0;
        Class348_Sub42_Sub3.anInt9504 = 0;
        Class234.anInt3049++;
        if ((i_2_ & 0x2) == 0) {
            for (Class318_Sub1 class318_sub1
                 = Class348.aClass318_Sub1Array4293[i_4_];
                 class318_sub1 != null;
                 class318_sub1
                         = class318_sub1.aClass318_Sub1_6379) {
                if (!Class348_Sub9.method2778(class318_sub1, bool, is, i,
                        i_0_)) {
                    s_Sub2.method4001(class318_sub1);
                    if (class318_sub1.anInt6389 != -1)
                        Class239_Sub21.aClass318_Sub1Array6066
                                [Class5_Sub1_Sub1.anInt9930++]
                                = class318_sub1;
                }
            }
        }
        if ((i_2_ & 0x1) == 0) {
            for (Class318_Sub1 class318_sub1
                 = Class250.aClass318_Sub1Array3226[i_4_];
                 class318_sub1 != null;
                 class318_sub1
                         = class318_sub1.aClass318_Sub1_6379) {
                if (!Class348_Sub9.method2778(class318_sub1, bool, is, i,
                        i_0_)) {
                    s_Sub2.method4001(class318_sub1);
                    if (class318_sub1.anInt6389 != -1)
                        Class291.aClass318_Sub1Array3737
                                [Class348_Sub42_Sub3.anInt9504++]
                                = class318_sub1;
                }
            }
            for (Class318_Sub1 class318_sub1
                 = Class115.aClass318_Sub1Array1754[i_4_];
                 class318_sub1 != null;
                 class318_sub1
                         = class318_sub1.aClass318_Sub1_6379) {
                if (!Class348_Sub9.method2778(class318_sub1, bool, is, i,
                        i_0_)) {
                    if (class318_sub1.method2377((byte) 122)) {
                        s_Sub2.method4001(class318_sub1);
                        if (class318_sub1.anInt6389 != -1)
                            Class291.aClass318_Sub1Array3737
                                    [Class348_Sub42_Sub3.anInt9504++]
                                    = class318_sub1;
                    } else {
                        s_Sub2.method4001(class318_sub1);
                        if (class318_sub1.anInt6389 != -1)
                            Class239_Sub21.aClass318_Sub1Array6066
                                    [Class5_Sub1_Sub1.anInt9930++]
                                    = class318_sub1;
                    }
                }
            }
            if (!bool) {
                for (int i_5_ = 0; i_5_ < Class86.anInt1477; i_5_++) {
                    if (!Class348_Sub9.method2778((Class24
                                    .aClass318_Sub1_Sub3Array357
                                    [i_5_]),
                            bool, is, i, i_0_)) {
                        s_Sub2.method4001(Class24.aClass318_Sub1_Sub3Array357
                                [i_5_]);
                        if ((Class24.aClass318_Sub1_Sub3Array357[i_5_]
                                .anInt6389)
                                != -1) {
                            if (Class24.aClass318_Sub1_Sub3Array357[i_5_]
                                    .method2377((byte) 122))
                                Class291.aClass318_Sub1Array3737
                                        [Class348_Sub42_Sub3.anInt9504++]
                                        = (Class24.aClass318_Sub1_Sub3Array357
                                        [i_5_]);
                            else
                                Class239_Sub21.aClass318_Sub1Array6066
                                        [Class5_Sub1_Sub1.anInt9930++]
                                        = (Class24.aClass318_Sub1_Sub3Array357
                                        [i_5_]);
                        }
                    }
                }
            }
        }
        if (Class5_Sub1_Sub1.anInt9930 > 0) {
            Class167.method1295(Class239_Sub21.aClass318_Sub1Array6066, 0,
                    Class5_Sub1_Sub1.anInt9930 - 1);
            for (int i_6_ = 0; i_6_ < Class5_Sub1_Sub1.anInt9930; i_6_++)
                Class13.method227(Class239_Sub21.aClass318_Sub1Array6066[i_6_],
                        true, bool_3_);
        }
        if (Class318_Sub1_Sub3_Sub3.aBoolean10221)
            Class9.aHa171.method3642(0, null);
        if ((i_2_ & 0x2) == 0) {
            for (int i_7_ = Canvas_Sub1.anInt67; i_7_ < Class189.anInt2524;
                 i_7_++) {
                if (i_7_ >= i && is != null) {
                    int i_8_ = Class99.aBooleanArrayArray1572.length;
                    if ((Class37.anInt492
                            + Class99.aBooleanArrayArray1572.length)
                            > Class318_Sub7.anInt6451)
                        i_8_ -= (Class37.anInt492
                                + Class99.aBooleanArrayArray1572.length
                                - Class318_Sub7.anInt6451);
                    int i_9_ = Class99.aBooleanArrayArray1572[0].length;
                    if ((Class348_Sub34.anInt6974
                            + Class99.aBooleanArrayArray1572[0].length)
                            > Class348_Sub41.anInt7054)
                        i_9_ -= (Class348_Sub34.anInt6974
                                + Class99.aBooleanArrayArray1572[0].length
                                - Class348_Sub41.anInt7054);
                    boolean[][] bools = Class348_Sub8.aBooleanArrayArray6656;
                    if (Class348_Sub40_Sub17.aBoolean9242) {
                        if (Class348_Sub40_Sub5.aBoolean9121)
                            bools = Class115.aBooleanArrayArrayArray1751[i_7_];
                        for (int i_10_ = Class105_Sub1.anInt8412; i_10_ < i_8_;
                             i_10_++) {
                            int i_11_ = (i_10_ + Class37.anInt492
                                    - Class105_Sub1.anInt8412);
                            for (int i_12_ = Class240.anInt4686; i_12_ < i_9_;
                                 i_12_++) {
                                bools[i_10_][i_12_] = false;
                                if (Class99.aBooleanArrayArray1572[i_10_]
                                        [i_12_]) {
                                    int i_13_
                                            = (i_12_ + Class348_Sub34.anInt6974
                                            - Class240.anInt4686);
                                    for (int i_14_ = i_7_; i_14_ >= 0;
                                         i_14_--) {
                                        if ((Class147
                                                .aClass357ArrayArrayArray2029
                                                [i_14_][i_11_][i_13_]) != null
                                                && (Class147
                                                        .aClass357ArrayArrayArray2029
                                                        [i_14_][i_11_][i_13_]
                                                .aByte4399) == i_7_) {
                                            bools[i_10_][i_12_] = (i_14_ < i || (is[i_14_][i_11_]
                                                    [i_13_]) != i_0_)
                                                    && (!aa_Sub2.method164
                                                    (i_7_, i_11_, (byte) -97,
                                                            i_13_));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (Class348_Sub40_Sub5.aBoolean9121) {
                        if (i_1_ >= 0)
                            aa_Sub1.aSArray5191[i_7_]
                                    .method3984(0, 0, 0, null, false, i_1_, i_2_);
                        else
                            aa_Sub1.aSArray5191[i_7_].method3983(0, 0, 0, null,
                                    false, i_2_);
                        for (int i_15_ = 0;
                             i_15_ < Class318_Sub1_Sub3_Sub3_Sub1.anInt10503;
                             i_15_++)
                            Class319.aClass315Array3982[i_15_]
                                    .method2359(new Class318_Sub2(i_7_ + 1), -1);
                    } else if (i_1_ >= 0)
                        aa_Sub1.aSArray5191[i_7_].method3984
                                (Class239_Sub25.anInt6111, Class285_Sub2.anInt8502,
                                        Class318_Sub1_Sub4_Sub1.anInt10084,
                                        Class348_Sub8.aBooleanArrayArray6656, false, i_1_,
                                        i_2_);
                    else
                        aa_Sub1.aSArray5191[i_7_].method3983
                                (Class239_Sub25.anInt6111, Class285_Sub2.anInt8502,
                                        Class318_Sub1_Sub4_Sub1.anInt10084,
                                        Class348_Sub8.aBooleanArrayArray6656, false,
                                        i_2_);
                } else {
                    int i_16_ = Class99.aBooleanArrayArray1572.length;
                    if ((Class37.anInt492
                            + Class99.aBooleanArrayArray1572.length)
                            > Class318_Sub7.anInt6451)
                        i_16_ -= (Class37.anInt492
                                + Class99.aBooleanArrayArray1572.length
                                - Class318_Sub7.anInt6451);
                    int i_17_ = Class99.aBooleanArrayArray1572[0].length;
                    if ((Class348_Sub34.anInt6974
                            + Class99.aBooleanArrayArray1572[0].length)
                            > Class348_Sub41.anInt7054)
                        i_17_ -= (Class348_Sub34.anInt6974
                                + Class99.aBooleanArrayArray1572[0].length
                                - Class348_Sub41.anInt7054);
                    boolean[][] bools = Class348_Sub8.aBooleanArrayArray6656;
                    if (Class348_Sub40_Sub17.aBoolean9242) {
                        if (Class348_Sub40_Sub5.aBoolean9121)
                            bools = Class115.aBooleanArrayArrayArray1751[i_7_];
                        for (int i_18_ = Class105_Sub1.anInt8412;
                             i_18_ < i_16_; i_18_++) {
                            int i_19_ = (i_18_ + Class37.anInt492
                                    - Class105_Sub1.anInt8412);
                            for (int i_20_ = Class240.anInt4686; i_20_ < i_17_;
                                 i_20_++) {
                                bools[i_18_][i_20_] = (Class99.aBooleanArrayArray1572[i_18_]
                                        [i_20_])
                                        && !aa_Sub2.method164(i_7_, i_19_,
                                        (byte) -97,
                                        (i_20_
                                                + (Class348_Sub34
                                                .anInt6974)
                                                - (Class240
                                                .anInt4686)));
                            }
                        }
                    }
                    if (Class348_Sub40_Sub5.aBoolean9121) {
                        if (i_1_ >= 0)
                            aa_Sub1.aSArray5191[i_7_]
                                    .method3984(0, 0, 0, null, false, i_1_, i_2_);
                        else
                            aa_Sub1.aSArray5191[i_7_].method3983(0, 0, 0, null,
                                    false, i_2_);
                        for (int i_21_ = 0;
                             i_21_ < Class318_Sub1_Sub3_Sub3_Sub1.anInt10503;
                             i_21_++)
                            Class319.aClass315Array3982[i_21_]
                                    .method2359(new Class318_Sub2(i_7_ + 1), -1);
                    } else if (i_1_ >= 0)
                        aa_Sub1.aSArray5191[i_7_].method3984
                                (Class239_Sub25.anInt6111, Class285_Sub2.anInt8502,
                                        Class318_Sub1_Sub4_Sub1.anInt10084,
                                        Class348_Sub8.aBooleanArrayArray6656, true, i_1_,
                                        i_2_);
                    else
                        aa_Sub1.aSArray5191[i_7_].method3983
                                (Class239_Sub25.anInt6111, Class285_Sub2.anInt8502,
                                        Class318_Sub1_Sub4_Sub1.anInt10084,
                                        Class348_Sub8.aBooleanArrayArray6656, true, i_2_);
                }
            }
        }
        if (Class348_Sub42_Sub3.anInt9504 > 0) {
            Class67.method718(Class291.aClass318_Sub1Array3737, 0,
                    Class348_Sub42_Sub3.anInt9504 - 1);
            for (int i_22_ = 0; i_22_ < Class348_Sub42_Sub3.anInt9504; i_22_++)
                Class13.method227(Class291.aClass318_Sub1Array3737[i_22_],
                        true, bool_3_);
        }
    }

    final void method3399(int i, float f) {
        anInt9741++;
        int i_23_ = Stream.floatToRawIntBits(f);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i_23_;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_23_ >> -625325816);
        if (i != 18291)
            aBoolean9746 = true;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_23_ >> -1343777264);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_23_ >> 1134918776);
    }

    Class348_Sub49_Sub1(int i) {
        super(i);
    }

    final void method3400(float f, byte i) {
        anInt9744++;
        int i_24_ = Stream.floatToRawIntBits(f);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_24_ >> 573844344);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_24_ >> 1420388720);
        if (i >= -76)
            aBoolean9746 = true;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_24_ >> 29185928);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i_24_;
    }

    static final int method3401(int i, int i_25_, byte i_26_) {
        anInt9745++;
        if (i_26_ <= 10)
            return -118;
        if (i == -1)
            return 12345678;
        i_25_ = (i & 0x7f) * i_25_ >> -598107193;
        if (i_25_ < 2)
            i_25_ = 2;
        else if (i_25_ > 126)
            i_25_ = 126;
        return i_25_ + (i & 0xff80);
    }

    static final void method3402(byte i) {
        if (Class297.aString3782.toLowerCase().indexOf("microsoft") != -1) {
            Class285_Sub2.anIntArray8507[222] = 59;
            Class285_Sub2.anIntArray8507[187] = 27;
            Class285_Sub2.anIntArray8507[186] = 57;
            Class285_Sub2.anIntArray8507[221] = 43;
            Class285_Sub2.anIntArray8507[219] = 42;
            Class285_Sub2.anIntArray8507[191] = 73;
            Class285_Sub2.anIntArray8507[190] = 72;
            Class285_Sub2.anIntArray8507[220] = 74;
            Class285_Sub2.anIntArray8507[188] = 71;
            Class285_Sub2.anIntArray8507[189] = 26;
            Class285_Sub2.anIntArray8507[192] = 58;
            Class285_Sub2.anIntArray8507[223] = 28;
        } else {
            Class285_Sub2.anIntArray8507[46] = 72;
            Class285_Sub2.anIntArray8507[92] = 74;
            Class285_Sub2.anIntArray8507[44] = 71;
            Class285_Sub2.anIntArray8507[61] = 27;
            Class285_Sub2.anIntArray8507[91] = 42;
            if (Class297.aMethod3783 == null) {
                Class285_Sub2.anIntArray8507[192] = 58;
                Class285_Sub2.anIntArray8507[222] = 59;
            } else {
                Class285_Sub2.anIntArray8507[520] = 59;
                Class285_Sub2.anIntArray8507[192] = 28;
                Class285_Sub2.anIntArray8507[222] = 58;
            }
            Class285_Sub2.anIntArray8507[45] = 26;
            Class285_Sub2.anIntArray8507[47] = 73;
            Class285_Sub2.anIntArray8507[59] = 57;
            Class285_Sub2.anIntArray8507[93] = 43;
        }
        anInt9742++;
        if (i > -20)
            aBoolean9746 = false;
    }

    public static void method3403(int i) {
        if (i >= 58) {
            aClass138_9748 = null;
            aClass351_9749 = null;
            aClass351_9743 = null;
        }
    }

    static {
        anInt9750 = 0;
        aClass351_9749 = new Class351(45, 7);
    }
}
