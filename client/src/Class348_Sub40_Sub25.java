/* Class348_Sub40_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub25 extends Class348_Sub40 {
    static int anInt9335 = -1;
    static int anInt9336;
    static int anInt9337;
    private int anInt9338 = 0;
    private int anInt9339 = 0;
    private int anInt9340 = 1365;
    static int anInt9341 = 0;
    static Class150 aClass150_9342;
    private int anInt9343 = 20;

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_0_) {
        if (i_0_ != 31015) method3049(null, 44, 80);
        int i_1_ = i;
        while_200_:
        do {
            while_199_:
            do {
                do {
                    if (i_1_ == 0) {
                        anInt9340 = class348_sub49.readUnsignedShort(842397944);
                        break while_200_;
                    } else if (i_1_ != 1) {
                        if (i_1_ != 2) {
                            if (i_1_ != 3) break while_200_;
                        } else break;
                        break while_199_;
                    }
                    anInt9343 = class348_sub49.readUnsignedShort(i_0_ + 842366929);
                    break while_200_;
                } while (false);
                anInt9339 = class348_sub49.readUnsignedShort(i_0_ + 842366929);
                break while_200_;
            } while (false);
            anInt9338 = class348_sub49.readUnsignedShort(842397944);
        } while (false);
        anInt9337++;
    }

    final int[] method3042(int i, int i_2_) {
        anInt9336++;
        int[] is = this.aClass191_7032.method1433(0, i);
        if (i_2_ != 255) return null;
        if (this.aClass191_7032.aBoolean2570) {
            for (int i_3_ = 0; i_3_ < Class348_Sub40_Sub6.anInt9139; i_3_++) {
                int i_4_ = anInt9339 + (Class318_Sub6.anIntArray6432[i_3_] << 12) / anInt9340;
                int i_5_ = anInt9338 + (Class239_Sub18.anIntArray6035[i] << 12) / anInt9340;
                int i_6_ = i_4_;
                int i_7_ = i_5_;
                int i_8_ = i_4_;
                int i_9_ = i_5_;
                int i_10_ = i_4_ * i_4_ >> 12;
                int i_11_ = i_5_ * i_5_ >> 12;
                int i_12_;
                for (i_12_ = 0; (i_11_ + i_10_ < 16384 && anInt9343 > i_12_); i_10_ = i_8_ * i_8_ >> 12) {
                    i_9_ = i_7_ + 2 * (i_9_ * i_8_ >> 12);
                    i_8_ = i_6_ + i_10_ - i_11_;
                    i_12_++;
                    i_11_ = i_9_ * i_9_ >> 12;
                }
                is[i_3_] = (i_12_ >= anInt9343 - 1 ? 0 : (i_12_ << 12) / anInt9343);
            }
        }
        return is;
    }

    public static void method3117(int i) {
        aClass150_9342 = null;
        if (i < 10) anInt9335 = 113;
    }

    public Class348_Sub40_Sub25() {
        super(0, true);
    }
}
