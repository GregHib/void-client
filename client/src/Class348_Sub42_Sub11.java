/* Class348_Sub42_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub11 extends Class348_Sub42 {
    static int anInt9579;
    int[] anIntArray9580;
    static int anInt9581;
    char[] aCharArray9582;
    static int anInt9583;
    static int anInt9584;
    static int anInt9585;
    static int anInt9586;
    String aString9587;
    char[] aCharArray9588;
    static int anInt9589;
    static Class351 aClass351_9590 = new Class351(83, -1);
    static int anInt9591 = -1;
    int[] anIntArray9592;

    public static void method3220(byte i) {
        if (i < 96)
            anInt9591 = 45;
        aClass351_9590 = null;
    }

    final void method3221(int i, Class348_Sub49 class348_sub49) {
        int i_0_ = 81 / ((-39 - i) / 52);
        anInt9583++;
        for (; ; ) {
            int i_1_ = class348_sub49.method3387(255);
            if ((i_1_ ^ 0xffffffff) == -1)
                break;
            method3227(-5847, class348_sub49, i_1_);
        }
    }

    final int method3222(byte i, char c) {
        anInt9585++;
        if (((Class348_Sub42_Sub11) this).anIntArray9580 == null)
            return -1;
        int i_2_ = 0;
        if (i > -97)
            method3221(126, null);
        for (/**/; ((Class348_Sub42_Sub11) this).anIntArray9580.length > i_2_;
                 i_2_++) {
            if ((c ^ 0xffffffff)
                    == (((Class348_Sub42_Sub11) this).aCharArray9582[i_2_]
                    ^ 0xffffffff))
                return ((Class348_Sub42_Sub11) this).anIntArray9580[i_2_];
        }
        return -1;
    }

    static final void method3223() {
        for (int i = 0; i < Class86.anInt1477; i++) {
            Class318_Sub1_Sub3 class318_sub1_sub3
                    = Class24.aClass318_Sub1_Sub3Array357[i];
            Class348_Sub46.method3320(class318_sub1_sub3, true);
            Class24.aClass318_Sub1_Sub3Array357[i] = null;
        }
        Class86.anInt1477 = 0;
    }

    final void method3224(byte i) {
        if (((Class348_Sub42_Sub11) this).anIntArray9580 != null) {
            for (int i_3_ = 0;
                 ((i_3_ ^ 0xffffffff)
                         > (((Class348_Sub42_Sub11) this).anIntArray9580.length
                         ^ 0xffffffff));
                 i_3_++)
                ((Class348_Sub42_Sub11) this).anIntArray9580[i_3_]
                        = Class273.method2057((((Class348_Sub42_Sub11) this)
                                .anIntArray9580[i_3_]),
                        32768);
        }
        anInt9579++;
        if (((Class348_Sub42_Sub11) this).anIntArray9592 != null) {
            for (int i_4_ = 0;
                 ((i_4_ ^ 0xffffffff)
                         > (((Class348_Sub42_Sub11) this).anIntArray9592.length
                         ^ 0xffffffff));
                 i_4_++)
                ((Class348_Sub42_Sub11) this).anIntArray9592[i_4_]
                        = Class273.method2057((((Class348_Sub42_Sub11) this)
                                .anIntArray9592[i_4_]),
                        32768);
        }
        if (i <= 102)
            method3222((byte) 78, '\uffc1');
    }

    static final void method3225(int i) {
        anInt9589++;
        if (((Class348_Sub51) Class316.aClass348_Sub51_3959)
                .aClass239_Sub14_7264.method1778(-32350)
                == 2) {
            byte i_5_ = (byte) (0xff & -4 + Class239_Sub15.anInt6006);
            int i_6_ = Class239_Sub15.anInt6006 % Class367_Sub4.anInt7319;
            for (int i_7_ = 0; i_7_ < 4; i_7_++) {
                for (int i_8_ = 0; Class348_Sub40_Sub3.anInt9109 > i_8_;
                     i_8_++)
                    Class289.aByteArrayArrayArray3700[i_7_][i_6_][i_8_] = i_5_;
            }
            if (Class355.anInt4372 != 3) {
                for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -3; i_9_++) {
                    Class327.anIntArray4097[i_9_] = -1000000;
                    Class156.anIntArray2117[i_9_] = 1000000;
                    Class348_Sub40_Sub19.anIntArray9259[i_9_] = 0;
                    Class64.anIntArray1127[i_9_] = 1000000;
                    Class56.anIntArray1045[i_9_] = 0;
                }
                int i_10_ = (((Class318_Sub1)
                        Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907)
                        .anInt6377);
                int i_11_ = (((Class318_Sub1)
                        Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907)
                        .anInt6388);
                if (i >= 100) {
                    if ((Class348_Sub40_Sub21.anInt9282 ^ 0xffffffff) == -2
                            || Class9.anInt167 != -1) {
                        if (Class348_Sub40_Sub21.anInt9282 != 1) {
                            i_11_ = Class318_Sub1_Sub5_Sub2.anInt10163;
                            i_10_ = Class9.anInt167;
                        }
                        if ((0x4 & (Class348_Sub33.aByteArrayArrayArray6962
                                [Class355.anInt4372][i_10_ >> -504285367]
                                [i_11_ >> -1016460983]))
                                != 0)
                            Class367_Sub4.method3542
                                    (i_11_ >> 1382553737,
                                            Class147.aClass357ArrayArrayArray2029,
                                            i_10_ >> -2113770807, 0, 0, false);
                        if ((Class348_Sub42_Sub19.anInt9701 ^ 0xffffffff)
                                > -2561) {
                            int i_12_ = Class286_Sub4.anInt6246 >> 1549184105;
                            int i_13_
                                    = Class59_Sub2_Sub2.anInt8685 >> -651476279;
                            int i_14_ = i_10_ >> 248970249;
                            int i_15_ = i_11_ >> -1537591159;
                            int i_16_;
                            if (i_14_ > i_12_)
                                i_16_ = i_14_ + -i_12_;
                            else
                                i_16_ = i_12_ + -i_14_;
                            int i_17_;
                            if (i_15_ <= i_13_)
                                i_17_ = -i_15_ + i_13_;
                            else
                                i_17_ = i_15_ + -i_13_;
                            if (i_16_ == 0 && (i_17_ ^ 0xffffffff) == -1
                                    || -Class367_Sub4.anInt7319 >= i_16_
                                    || ((i_16_ ^ 0xffffffff)
                                    <= (Class367_Sub4.anInt7319 ^ 0xffffffff))
                                    || (-Class348_Sub40_Sub3.anInt9109
                                    ^ 0xffffffff) <= (i_17_ ^ 0xffffffff)
                                    || Class348_Sub40_Sub3.anInt9109 <= i_17_)
                                Class156.method1242(("RC: " + i_12_ + ","
                                                + i_13_ + " " + i_14_
                                                + "," + i_15_ + " "
                                                + za_Sub2.anInt9780 + ","
                                                + Class90.anInt1517),
                                        null, 15004);
                            else if ((i_17_ ^ 0xffffffff)
                                    <= (i_16_ ^ 0xffffffff)) {
                                int i_18_ = i_16_ * 65536 / i_17_;
                                int i_19_ = 32768;
                                while (i_15_ != i_13_) {
                                    if (i_15_ > i_13_)
                                        i_13_++;
                                    else if ((i_13_ ^ 0xffffffff)
                                            < (i_15_ ^ 0xffffffff))
                                        i_13_--;
                                    if ((0x4 & (Class348_Sub33
                                            .aByteArrayArrayArray6962
                                            [Class355.anInt4372][i_12_]
                                            [i_13_]))
                                            != 0) {
                                        Class367_Sub4.method3542
                                                (i_13_,
                                                        (Class147
                                                                .aClass357ArrayArrayArray2029),
                                                        i_12_, 0, 1, false);
                                        break;
                                    }
                                    i_19_ += i_18_;
                                    if (i_19_ >= 65536) {
                                        if (i_12_ < i_14_)
                                            i_12_++;
                                        else if (i_14_ < i_12_)
                                            i_12_--;
                                        i_19_ -= 65536;
                                        if ((0x4 & (Class348_Sub33
                                                .aByteArrayArrayArray6962
                                                [Class355.anInt4372][i_12_]
                                                [i_13_])
                                                ^ 0xffffffff)
                                                != -1) {
                                            Class367_Sub4.method3542
                                                    (i_13_,
                                                            (Class147
                                                                    .aClass357ArrayArrayArray2029),
                                                            i_12_, 0, 1, false);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                int i_20_ = 65536 * i_17_ / i_16_;
                                int i_21_ = 32768;
                                while ((i_12_ ^ 0xffffffff)
                                        != (i_14_ ^ 0xffffffff)) {
                                    if (i_12_ >= i_14_) {
                                        if (i_12_ > i_14_)
                                            i_12_--;
                                    } else
                                        i_12_++;
                                    if ((0x4 & (Class348_Sub33
                                            .aByteArrayArrayArray6962
                                            [Class355.anInt4372][i_12_]
                                            [i_13_])
                                            ^ 0xffffffff)
                                            != -1) {
                                        Class367_Sub4.method3542
                                                (i_13_,
                                                        (Class147
                                                                .aClass357ArrayArrayArray2029),
                                                        i_12_, 0, 1, false);
                                        break;
                                    }
                                    i_21_ += i_20_;
                                    if (i_21_ >= 65536) {
                                        if (i_15_ > i_13_)
                                            i_13_++;
                                        else if ((i_15_ ^ 0xffffffff)
                                                > (i_13_ ^ 0xffffffff))
                                            i_13_--;
                                        i_21_ -= 65536;
                                        if ((0x4 & (Class348_Sub33
                                                .aByteArrayArrayArray6962
                                                [Class355.anInt4372][i_12_]
                                                [i_13_]))
                                                != 0) {
                                            Class367_Sub4.method3542
                                                    (i_13_,
                                                            (Class147
                                                                    .aClass357ArrayArrayArray2029),
                                                            i_12_, 0, 1, false);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int i_22_
                                = Class275.method2064(Class286_Sub4.anInt6246,
                                Class355.anInt4372, 11219,
                                Class59_Sub2_Sub2.anInt8685);
                        if (i_22_ - Class305.anInt3855 < 3200
                                && ((Class348_Sub33.aByteArrayArrayArray6962
                                [Class355.anInt4372]
                                [Class286_Sub4.anInt6246 >> 378417865]
                                [Class59_Sub2_Sub2.anInt8685 >> -1035753239])
                                & 0x4) != 0)
                            Class367_Sub4.method3542
                                    (Class59_Sub2_Sub2.anInt8685 >> -280539447,
                                            Class147.aClass357ArrayArrayArray2029,
                                            Class286_Sub4.anInt6246 >> 57249897, 0, 1,
                                            false);
                    }
                }
            }
        }
    }

    final int method3226(char c, int i) {
        anInt9584++;
        if (((Class348_Sub42_Sub11) this).anIntArray9592 == null)
            return -1;
        for (int i_23_ = 0;
             ((Class348_Sub42_Sub11) this).anIntArray9592.length > i_23_;
             i_23_++) {
            if (((Class348_Sub42_Sub11) this).aCharArray9588[i_23_] == c)
                return ((Class348_Sub42_Sub11) this).anIntArray9592[i_23_];
        }
        if (i != 57249897)
            method3221(-16, null);
        return -1;
    }

    private final void method3227(int i, Class348_Sub49 class348_sub49,
                                  int i_24_) {
        if ((i_24_ ^ 0xffffffff) != -2) {
            if ((i_24_ ^ 0xffffffff) == -3) {
                int i_25_ = class348_sub49.method3387(255);
                ((Class348_Sub42_Sub11) this).anIntArray9592 = new int[i_25_];
                ((Class348_Sub42_Sub11) this).aCharArray9588 = new char[i_25_];
                for (int i_26_ = 0;
                     (i_25_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
                    ((Class348_Sub42_Sub11) this).anIntArray9592[i_26_]
                            = class348_sub49.method3330(842397944);
                    byte i_27_ = class348_sub49.method3388(-121);
                    ((Class348_Sub42_Sub11) this).aCharArray9588[i_26_]
                            = ((i_27_ ^ 0xffffffff) != -1
                            ? Class50_Sub1.method462(i_27_, -128) : '\0');
                }
            } else if ((i_24_ ^ 0xffffffff) == -4) {
                int i_28_ = class348_sub49.method3387(255);
                ((Class348_Sub42_Sub11) this).aCharArray9582 = new char[i_28_];
                ((Class348_Sub42_Sub11) this).anIntArray9580 = new int[i_28_];
                for (int i_29_ = 0;
                     (i_29_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff); i_29_++) {
                    ((Class348_Sub42_Sub11) this).anIntArray9580[i_29_]
                            = class348_sub49.method3330(842397944);
                    byte i_30_ = class348_sub49.method3388(-115);
                    ((Class348_Sub42_Sub11) this).aCharArray9582[i_29_]
                            = (i_30_ != 0 ? Class50_Sub1.method462(i_30_, -128)
                            : '\0');
                }
            }
        } else
            ((Class348_Sub42_Sub11) this).aString9587
                    = class348_sub49.method3377((byte) 100);
        if (i != -5847)
            anInt9586 = 12;
        anInt9581++;
    }

    public Class348_Sub42_Sub11() {
        /* empty */
    }
}
