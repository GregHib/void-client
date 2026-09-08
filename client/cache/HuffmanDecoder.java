/* HuffmanDecoder - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
/**
 * RENAMED from `Class296` (JODE-obfuscated).
 * Huffman codec for Jagex string / packet compression.
 * {@link #decompress} expands bitstreams; {@link #compress} emits codewords
 * (throws {@code No codeword for data value} when a byte has length 0).
 */

final class HuffmanDecoder {
    static int anInt3765;
    private final int[] codewords;
    static boolean aBoolean3767 = false;
    static int anInt3768;
    private final byte[] codeLengths;
    static int anInt3770;
    static int anInt3771;
    static int anInt3772;
    static Component183 aClass114_3773 = new Component183(55, 0);
    private int[] decodeTree;
    static int anInt3775;

    static final boolean method2224(int i, byte i_0_, int i_1_) {
        int i_2_ = 41 / ((59 - i_0_) / 37);
        anInt3765++;
        return (i & 0x800) != 0;
    }

    public static void clearStatics(int i) {
        if (i != 32) aClass114_3773 = null;
        aClass114_3773 = null;
    }

    /** Decode {@code is_3_} bits into {@code is}; returns bytes consumed from input. */
    final int decompress(byte[] is, int i, byte[] is_3_, int i_4_, int i_5_, int i_6_) {
        try {
            anInt3770++;
            if (i_4_ == 0) return 0;
            i_4_ += i_6_;
            int i_7_ = 0;
            if (i_5_ != -1) decodeTree = null;
            int i_8_ = i;
            for (; ; ) {
                byte i_9_ = is_3_[i_8_];
                if (i_9_ >= 0) i_7_++;
                else i_7_ = decodeTree[i_7_];
                int i_10_;
                if ((i_10_ = decodeTree[i_7_]) < 0) {
                    is[i_6_++] = (byte) (~i_10_);
                    if (i_4_ <= i_6_) break;
                    i_7_ = 0;
                }
                if ((0x40 & i_9_) != 0) i_7_ = decodeTree[i_7_];
                else i_7_++;
                if ((i_10_ = decodeTree[i_7_]) < 0) {
                    is[i_6_++] = (byte) (~i_10_);
                    if (i_6_ >= i_4_) break;
                    i_7_ = 0;
                }
                if ((0x20 & i_9_) == 0) i_7_++;
                else i_7_ = decodeTree[i_7_];
                if ((i_10_ = decodeTree[i_7_]) < 0) {
                    is[i_6_++] = (byte) (~i_10_);
                    if (i_6_ >= i_4_) break;
                    i_7_ = 0;
                }
                if ((i_9_ & 0x10) == 0) i_7_++;
                else i_7_ = decodeTree[i_7_];
                if ((i_10_ = decodeTree[i_7_]) < 0) {
                    is[i_6_++] = (byte) (~i_10_);
                    if (i_6_ >= i_4_) break;
                    i_7_ = 0;
                }
                if ((0x8 & i_9_) == 0) i_7_++;
                else i_7_ = decodeTree[i_7_];
                if ((i_10_ = decodeTree[i_7_]) < 0) {
                    is[i_6_++] = (byte) (~i_10_);
                    if (i_4_ <= i_6_) break;
                    i_7_ = 0;
                }
                if ((i_9_ & 0x4) != 0) i_7_ = decodeTree[i_7_];
                else i_7_++;
                if ((i_10_ = decodeTree[i_7_]) < 0) {
                    is[i_6_++] = (byte) (~i_10_);
                    if (i_4_ <= i_6_) break;
                    i_7_ = 0;
                }
                if ((i_9_ & 0x2) == 0) i_7_++;
                else i_7_ = decodeTree[i_7_];
                if ((i_10_ = decodeTree[i_7_]) < 0) {
                    is[i_6_++] = (byte) (~i_10_);
                    if (i_4_ <= i_6_) break;
                    i_7_ = 0;
                }
                if ((i_9_ & 0x1) != 0) i_7_ = decodeTree[i_7_];
                else i_7_++;
                if ((i_10_ = decodeTree[i_7_]) < 0) {
                    is[i_6_++] = (byte) (~i_10_);
                    if (i_6_ >= i_4_) break;
                    i_7_ = 0;
                }
                i_8_++;
            }
            return i_8_ + 1 + -i;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("wda.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (is_3_ != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
        }
    }

    /** Encode {@code is} into bitstream {@code is_14_}; returns bit length. */
    final int compress(int i, int i_11_, int i_12_, byte[] is, int i_13_, byte[] is_14_) {
        try {
            anInt3771++;
            int i_15_ = 0;
            i += i_11_;
            int i_16_ = i_12_ << 3;
            if (i_13_ <= 14) decompress(null, 61, null, 89, 122, 10);
            for (/**/; i > i_11_; i_11_++) {
                int i_17_ = 0xff & is[i_11_];
                int i_18_ = codewords[i_17_];
                int i_19_ = codeLengths[i_17_];
                if (i_19_ == 0) throw new RuntimeException("No codeword for data value " + i_17_);
                int i_20_ = i_16_ >> 3;
                int i_21_ = i_16_ & 0x7;
                i_15_ &= -i_21_ >> 31;
                int i_22_ = (i_21_ - -i_19_ + -1 >> 3) + i_20_;
                i_16_ += i_19_;
                i_21_ += 24;
                is_14_[i_20_] = (byte) (i_15_ = Component224.bitwiseOr(i_15_, i_18_ >>> i_21_));
                if (i_22_ > i_20_) {
                    i_20_++;
                    i_21_ -= 8;
                    is_14_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
                    if (i_20_ < i_22_) {
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
                                is_14_[i_20_] = (byte) (i_15_ = i_18_ << -i_21_);
                            }
                        }
                    }
                }
            }
            return -i_12_ + (i_16_ - -7 >> 3);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("wda.C(" + i + ',' + i_11_ + ',' + i_12_ + ',' + (is != null ? "{...}" : "null") + ',' + i_13_ + ',' + (is_14_ != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method2228(int i) {
        if (i == 0) {
            ScreenModeManager.method1582(7851);
            anInt3772++;
            Component381.method3570(false);
        }
    }

    HuffmanDecoder(byte[] is) {
        int i = is.length;
        codewords = new int[i];
        codeLengths = is;
        decodeTree = new int[8];
        int[] is_23_ = new int[33];
        int i_24_ = 0;
        for (int i_25_ = 0; i_25_ < i; i_25_++) {
            int i_26_ = is[i_25_];
            if (i_26_ != 0) {
                int i_27_ = 1 << 32 - i_26_;
                int i_28_ = is_23_[i_26_];
                codewords[i_25_] = i_28_;
                int i_29_;
                if ((i_27_ & i_28_) == 0) {
                    for (int i_30_ = -1 + i_26_; i_30_ >= 1; i_30_--) {
                        int i_31_ = is_23_[i_30_];
                        if (i_31_ != i_28_) break;
                        int i_32_ = 1 << 32 + -i_30_;
                        if ((i_31_ & i_32_) != 0) {
                            is_23_[i_30_] = is_23_[i_30_ - 1];
                            break;
                        }
                        is_23_[i_30_] = Component224.bitwiseOr(i_31_, i_32_);
                    }
                    i_29_ = i_27_ | i_28_;
                } else i_29_ = is_23_[-1 + i_26_];
                is_23_[i_26_] = i_29_;
                for (int i_33_ = i_26_ + 1; i_33_ <= 32; i_33_++) {
                    if (i_28_ == is_23_[i_33_]) is_23_[i_33_] = i_29_;
                }
                int i_34_ = 0;
                for (int i_35_ = 0; i_35_ < i_26_; i_35_++) {
                    int i_36_ = -2147483648 >>> i_35_;
                    if ((i_28_ & i_36_) == 0) i_34_++;
                    else {
                        if (decodeTree[i_34_] == 0) decodeTree[i_34_] = i_24_;
                        i_34_ = decodeTree[i_34_];
                    }
                    i_36_ >>>= 1;
                    if (decodeTree.length <= i_34_) {
                        int[] is_37_ = new int[decodeTree.length * 2];
                        for (int i_38_ = 0; decodeTree.length > i_38_; i_38_++)
                            is_37_[i_38_] = decodeTree[i_38_];
                        decodeTree = is_37_;
                    }
                }
                decodeTree[i_34_] = ~i_25_;
                if (i_34_ >= i_24_) i_24_ = 1 + i_34_;
            }
        }
    }
}
