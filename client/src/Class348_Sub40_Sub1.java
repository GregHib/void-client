/* Class348_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub1 extends Class348_Sub40 {
    private int anInt9084 = 4096;
    static int anInt9085;
    private final int[] anIntArray9086 = new int[3];
    static int anInt9087;
    static int anInt9088;
    static Class351 aClass351_9089 = new Class351(2, 6);
    static Class207 aClass207_9090;
    private int anInt9091 = 4096;
    private int anInt9092 = 4096;
    static int anInt9093;
    private int anInt9094 = 409;

    public Class348_Sub40_Sub1() {
        super(1, false);
    }

    public static void method3050(boolean bool) {
        aClass351_9089 = null;
        aClass207_9090 = null;
        if (bool != true) method3050(true);
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_0_) {
        anInt9087++;
        if (i_0_ != 31015) anInt9094 = 115;
        int i_1_ = i;
        while_131_:
        do {
            while_130_:
            do {
                while_129_:
                do {
                    do {
                        if (i_1_ == 0) {
                            anInt9094 = class348_sub49.readShort(i_0_ + 842366929);
                            return;
                        } else if (i_1_ != 1) {
                            if (i_1_ != 2) {
                                if (i_1_ != 3) {
                                    if (i_1_ == 4) break while_130_;
                                    break while_131_;
                                }
                            } else break;
                            break while_129_;
                        }
                        anInt9084 = class348_sub49.readShort(842397944);
                        return;
                    } while (false);
                    anInt9091 = class348_sub49.readShort(842397944);
                    return;
                } while (false);
                anInt9092 = class348_sub49.readShort(i_0_ + 842366929);
                return;
            } while (false);
            int i_2_ = class348_sub49.method3351(-1);
            anIntArray9086[2] = Class139.method1166(0, i_2_ >> 12);
            anIntArray9086[1] = Class139.method1166(i_2_, 65280) >> 4;
            anIntArray9086[0] = Class139.method1166(i_2_ << 4, 267386880);
        } while (false);
    }

    static final int method3051(int i, int i_3_) {
        if (i_3_ != 4096) return -68;
        anInt9085++;
        int i_4_ = i >>> 1;
        i_4_ |= i_4_ >>> 1;
        i_4_ |= i_4_ >>> 2;
        i_4_ |= i_4_ >>> 4;
        i_4_ |= i_4_ >>> 8;
        i_4_ |= i_4_ >>> 16;
        return (~i_4_) & i;
    }

    final int[][] method3047(int i, int i_5_) {
        if (i_5_ != -1564599039) anInt9091 = 64;
        anInt9093++;
        int[][] is = this.aClass322_7033.method2557(-127, i);
        if (this.aClass322_7033.aBoolean4035) {
            int[][] is_6_ = this.method3039((byte) 62, i, 0);
            int[] is_7_ = is_6_[0];
            int[] is_8_ = is_6_[1];
            int[] is_9_ = is_6_[2];
            int[] is_10_ = is[0];
            int[] is_11_ = is[1];
            int[] is_12_ = is[2];
            for (int i_13_ = 0; Class348_Sub40_Sub6.anInt9139 > i_13_; i_13_++) {
                int i_14_ = is_7_[i_13_];
                int i_15_ = i_14_ - anIntArray9086[0];
                if (i_15_ < 0) i_15_ = -i_15_;
                if (anInt9094 < i_15_) {
                    is_10_[i_13_] = i_14_;
                    is_11_[i_13_] = is_8_[i_13_];
                    is_12_[i_13_] = is_9_[i_13_];
                } else {
                    int i_16_ = is_8_[i_13_];
                    i_15_ = -anIntArray9086[1] + i_16_;
                    if (i_15_ < 0) i_15_ = -i_15_;
                    if (anInt9094 < i_15_) {
                        is_10_[i_13_] = i_14_;
                        is_11_[i_13_] = i_16_;
                        is_12_[i_13_] = is_9_[i_13_];
                    } else {
                        int i_17_ = is_9_[i_13_];
                        i_15_ = -anIntArray9086[2] + i_17_;
                        if (i_15_ < 0) i_15_ = -i_15_;
                        if (i_15_ > anInt9094) {
                            is_10_[i_13_] = i_14_;
                            is_11_[i_13_] = i_16_;
                            is_12_[i_13_] = i_17_;
                        } else {
                            is_10_[i_13_] = i_14_ * anInt9092 >> 12;
                            is_11_[i_13_] = i_16_ * anInt9091 >> 12;
                            is_12_[i_13_] = i_17_ * anInt9084 >> 12;
                        }
                    }
                }
            }
        }
        return is;
    }

    static final Class method3052(int i, String string) throws ClassNotFoundException {
        if (i != 11012) aClass351_9089 = null;
        anInt9088++;
        if (string.equals("B")) return Byte.TYPE;
        if (string.equals("I")) return Integer.TYPE;
        if (string.equals("S")) return Short.TYPE;
        if (string.equals("J")) return Long.TYPE;
        if (string.equals("Z")) return Boolean.TYPE;
        if (string.equals("F")) return Float.TYPE;
        if (string.equals("D")) return Double.TYPE;
        if (string.equals("C")) return Character.TYPE;
        return Class.forName(string);
    }
}
