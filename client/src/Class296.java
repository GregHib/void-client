/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class296 {
    static int anInt3765;
    private final int[] anIntArray3766;
    static boolean aBoolean3767 = false;
    static int anInt3768;
    private final byte[] aByteArray3769;
    static int anInt3770;
    static int anInt3771;
    static int anInt3772;
    static Class114 aClass114_3773 = new Class114(55, 0);
    private int[] anIntArray3774;
    static int anInt3775;

    static final boolean method2224(int i, byte i_0_, int i_1_) {
        int i_2_ = 41 / ((59 - i_0_) / 37);
        anInt3765++;
        return (i & 0x800) != 0;
    }

    public static void method2225(int i) {
        if (i != 32)
            aClass114_3773 = null;
        aClass114_3773 = null;
    }

    final int method2226(byte[] is, int i, byte[] is_3_, int i_4_, int i_5_,
                         int i_6_) {
        try {
            anInt3770++;
            if (i_4_ == 0)
                return 0;
            i_4_ += i_6_;
            int i_7_ = 0;
            if (i_5_ != -1)
                anIntArray3774 = null;
            int i_8_ = i;
            for (; ; ) {
                byte i_9_ = is_3_[i_8_];
                if ((i_9_ ^ 0xffffffff) <= -1)
                    i_7_++;
                else
                    i_7_ = anIntArray3774[i_7_];
                int i_10_;
                if (((i_10_ = anIntArray3774[i_7_]) ^ 0xffffffff) > -1) {
                    is[i_6_++] = (byte) (i_10_ ^ 0xffffffff);
                    if ((i_6_ ^ 0xffffffff) <= (i_4_ ^ 0xffffffff))
                        break;
                    i_7_ = 0;
                }
                if ((0x40 & i_9_ ^ 0xffffffff) != -1)
                    i_7_ = anIntArray3774[i_7_];
                else
                    i_7_++;
                if (((i_10_ = anIntArray3774[i_7_]) ^ 0xffffffff) > -1) {
                    is[i_6_++] = (byte) (i_10_ ^ 0xffffffff);
                    if (i_6_ >= i_4_)
                        break;
                    i_7_ = 0;
                }
                if ((0x20 & i_9_ ^ 0xffffffff) == -1)
                    i_7_++;
                else
                    i_7_ = anIntArray3774[i_7_];
                if (((i_10_ = anIntArray3774[i_7_]) ^ 0xffffffff) > -1) {
                    is[i_6_++] = (byte) (i_10_ ^ 0xffffffff);
                    if (i_6_ >= i_4_)
                        break;
                    i_7_ = 0;
                }
                if ((i_9_ & 0x10) == 0)
                    i_7_++;
                else
                    i_7_ = anIntArray3774[i_7_];
                if (((i_10_ = anIntArray3774[i_7_]) ^ 0xffffffff) > -1) {
                    is[i_6_++] = (byte) (i_10_ ^ 0xffffffff);
                    if ((i_4_ ^ 0xffffffff) >= (i_6_ ^ 0xffffffff))
                        break;
                    i_7_ = 0;
                }
                if ((0x8 & i_9_ ^ 0xffffffff) == -1)
                    i_7_++;
                else
                    i_7_ = anIntArray3774[i_7_];
                if ((i_10_ = anIntArray3774[i_7_]) < 0) {
                    is[i_6_++] = (byte) (i_10_ ^ 0xffffffff);
                    if (i_4_ <= i_6_)
                        break;
                    i_7_ = 0;
                }
                if ((i_9_ & 0x4 ^ 0xffffffff) != -1)
                    i_7_ = anIntArray3774[i_7_];
                else
                    i_7_++;
                if ((i_10_ = anIntArray3774[i_7_]) < 0) {
                    is[i_6_++] = (byte) (i_10_ ^ 0xffffffff);
                    if (i_4_ <= i_6_)
                        break;
                    i_7_ = 0;
                }
                if ((i_9_ & 0x2) == 0)
                    i_7_++;
                else
                    i_7_ = anIntArray3774[i_7_];
                if ((i_10_ = anIntArray3774[i_7_]) < 0) {
                    is[i_6_++] = (byte) (i_10_ ^ 0xffffffff);
                    if ((i_6_ ^ 0xffffffff) <= (i_4_ ^ 0xffffffff))
                        break;
                    i_7_ = 0;
                }
                if ((i_9_ & 0x1) != 0)
                    i_7_ = anIntArray3774[i_7_];
                else
                    i_7_++;
                if (((i_10_ = anIntArray3774[i_7_]) ^ 0xffffffff) > -1) {
                    is[i_6_++] = (byte) (i_10_ ^ 0xffffffff);
                    if (i_6_ >= i_4_)
                        break;
                    i_7_ = 0;
                }
                i_8_++;
            }
            return i_8_ + 1 + -i;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("wda.A("
                            + (is != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (is_3_ != null ? "{...}"
                            : "null")
                            + ',' + i_4_ + ',' + i_5_ + ','
                            + i_6_ + ')'));
        }
    }

    final int method2227(int i, int i_11_, int i_12_, byte[] is, int i_13_,
                         byte[] is_14_) {
        try {
            anInt3771++;
            int i_15_ = 0;
            i += i_11_;
            int i_16_ = i_12_ << 12223459;
            if (i_13_ <= 14)
                method2226(null, 61, null, 89, 122, 10);
            for (/**/; (i_11_ ^ 0xffffffff) > (i ^ 0xffffffff); i_11_++) {
                int i_17_ = 0xff & is[i_11_];
                int i_18_ = anIntArray3766[i_17_];
                int i_19_ = aByteArray3769[i_17_];
                if (i_19_ == 0)
                    throw new RuntimeException("No codeword for data value "
                            + i_17_);
                int i_20_ = i_16_ >> -198850077;
                int i_21_ = i_16_ & 0x7;
                i_15_ &= -i_21_ >> -1249434113;
                int i_22_ = (i_21_ - -i_19_ + -1 >> 1825582691) + i_20_;
                i_16_ += i_19_;
                i_21_ += 24;
                is_14_[i_20_]
                        = (byte) (i_15_
                        = Class273.method2057(i_15_, i_18_ >>> i_21_));
                if ((i_20_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
                    i_20_++;
                    i_21_ -= 8;
                    is_14_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
                    if ((i_22_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff)) {
                        i_20_++;
                        i_21_ -= 8;
                        is_14_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
                        if (i_22_ > i_20_) {
                            i_21_ -= 8;
                            i_20_++;
                            is_14_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
                            if (i_20_ < i_22_) {
                                i_21_ -= 8;
                                i_20_++;
                                is_14_[i_20_]
                                        = (byte) (i_15_ = i_18_ << -i_21_);
                            }
                        }
                    }
                }
            }
            return -i_12_ + (i_16_ - -7 >> 1600726371);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("wda.C(" + i + ',' + i_11_ + ','
                            + i_12_ + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_13_ + ','
                            + (is_14_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    static final void method2228(int i) {
        if (i == 0) {
            Class215.method1582(7851);
            anInt3772++;
            Class369_Sub1.method3570(false);
        }
    }

    Class296(byte[] is) {
        int i = is.length;
        anIntArray3766 = new int[i];
        aByteArray3769 = is;
        anIntArray3774 = new int[8];
        int[] is_23_ = new int[33];
        int i_24_ = 0;
        for (int i_25_ = 0; (i ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
            int i_26_ = is[i_25_];
            if (i_26_ != 0) {
                int i_27_ = 1 << 32 - i_26_;
                int i_28_ = is_23_[i_26_];
                anIntArray3766[i_25_] = i_28_;
                int i_29_;
                if ((i_27_ & i_28_ ^ 0xffffffff) != -1)
                    i_29_ = is_23_[-1 + i_26_];
                else {
                    for (int i_30_ = -1 + i_26_; i_30_ >= 1; i_30_--) {
                        int i_31_ = is_23_[i_30_];
                        if (i_31_ != i_28_)
                            break;
                        int i_32_ = 1 << 32 + -i_30_;
                        if ((i_31_ & i_32_ ^ 0xffffffff) != -1) {
                            is_23_[i_30_] = is_23_[i_30_ - 1];
                            break;
                        }
                        is_23_[i_30_] = Class273.method2057(i_31_, i_32_);
                    }
                    i_29_ = i_27_ | i_28_;
                }
                is_23_[i_26_] = i_29_;
                for (int i_33_ = i_26_ + 1; (i_33_ ^ 0xffffffff) >= -33;
                     i_33_++) {
                    if ((is_23_[i_33_] ^ 0xffffffff) == (i_28_ ^ 0xffffffff))
                        is_23_[i_33_] = i_29_;
                }
                int i_34_ = 0;
                for (int i_35_ = 0; i_35_ < i_26_; i_35_++) {
                    int i_36_ = -2147483648 >>> i_35_;
                    if ((i_28_ & i_36_) == 0)
                        i_34_++;
                    else {
                        if (anIntArray3774[i_34_] == 0)
                            anIntArray3774[i_34_] = i_24_;
                        i_34_ = anIntArray3774[i_34_];
                    }
                    i_36_ >>>= 1;
                    if ((i_34_ ^ 0xffffffff)
                            <= (anIntArray3774.length ^ 0xffffffff)) {
                        int[] is_37_ = new int[anIntArray3774.length * 2];
                        for (int i_38_ = 0; anIntArray3774.length > i_38_;
                             i_38_++)
                            is_37_[i_38_] = anIntArray3774[i_38_];
                        anIntArray3774 = is_37_;
                    }
                }
                anIntArray3774[i_34_] = i_25_ ^ 0xffffffff;
                if ((i_24_ ^ 0xffffffff) >= (i_34_ ^ 0xffffffff))
                    i_24_ = 1 + i_34_;
            }
        }
    }
}
