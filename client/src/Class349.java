/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class349 {
    int[] anIntArray4299 = new int[2];
    private final int[][][] anIntArrayArrayArray4300;
    static int[][] anIntArrayArray4301 = new int[2][8];
    private final int[][][] anIntArrayArrayArray4302;
    static int anInt4303;
    private final int[] anIntArray4304 = new int[2];
    private static float aFloat4305;
    private static float[][] aFloatArrayArray4306 = new float[2][8];

    final void method3446(Class348_Sub49 class348_sub49, Class197 class197) {
        int i = class348_sub49.method3387(255);
        this.anIntArray4299[0] = i >> 4;
        this.anIntArray4299[1] = i & 0xf;
        if (i != 0) {
            anIntArray4304[0] = class348_sub49.method3330(842397944);
            anIntArray4304[1] = class348_sub49.method3330(842397944);
            int i_0_ = class348_sub49.method3387(255);
            for (int i_1_ = 0; i_1_ < 2; i_1_++) {
                for (int i_2_ = 0;
                     i_2_ < this.anIntArray4299[i_1_]; i_2_++) {
                    anIntArrayArrayArray4302[i_1_][0][i_2_]
                            = class348_sub49.method3330(842397944);
                    anIntArrayArrayArray4300[i_1_][0][i_2_]
                            = class348_sub49.method3330(842397944);
                }
            }
            for (int i_3_ = 0; i_3_ < 2; i_3_++) {
                for (int i_4_ = 0;
                     i_4_ < this.anIntArray4299[i_3_]; i_4_++) {
                    if ((i_0_ & 1 << i_3_ * 4 << i_4_) == 0) {
                        anIntArrayArrayArray4302[i_3_][1][i_4_]
                                = anIntArrayArrayArray4302[i_3_][0][i_4_];
                        anIntArrayArrayArray4300[i_3_][1][i_4_]
                                = anIntArrayArrayArray4300[i_3_][0][i_4_];
                    } else {
                        anIntArrayArrayArray4302[i_3_][1][i_4_]
                                = class348_sub49.method3330(842397944);
                        anIntArrayArrayArray4300[i_3_][1][i_4_]
                                = class348_sub49.method3330(842397944);
                    }
                }
            }
            if (i_0_ != 0 || anIntArray4304[1] != anIntArray4304[0])
                class197.method1454(class348_sub49);
        } else
            anIntArray4304[0] = anIntArray4304[1] = 0;
    }

    private final float method3447(int i, int i_5_, float f) {
        float f_6_ = ((float) anIntArrayArrayArray4302[i][0][i_5_]
                + f * (float) (anIntArrayArrayArray4302[i][1][i_5_]
                - anIntArrayArrayArray4302[i][0][i_5_]));
        f_6_ *= 1.2207031E-4F;
        return method3448(f_6_);
    }

    private static final float method3448(float f) {
        float f_7_ = 32.703197F * (float) Math.pow(2.0, f);
        return f_7_ * 3.1415927F / 11025.0F;
    }

    private final float method3449(int i, int i_8_, float f) {
        float f_9_ = ((float) anIntArrayArrayArray4300[i][0][i_8_]
                + f * (float) (anIntArrayArrayArray4300[i][1][i_8_]
                - anIntArrayArrayArray4300[i][0][i_8_]));
        f_9_ *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0, -f_9_ / 20.0F);
    }

    public static void method3450() {
        aFloatArrayArray4306 = null;
        anIntArrayArray4301 = null;
    }

    final int method3451(int i, float f) {
        if (i == 0) {
            float f_10_
                    = ((float) anIntArray4304[0]
                    + (float) (anIntArray4304[1] - anIntArray4304[0]) * f);
            f_10_ *= 0.0030517578F;
            aFloat4305 = (float) Math.pow(0.1, f_10_ / 20.0F);
            anInt4303 = (int) (aFloat4305 * 65536.0F);
        }
        if (this.anIntArray4299[i] == 0)
            return 0;
        float f_11_ = method3449(i, 0, f);
        aFloatArrayArray4306[i][0]
                = -2.0F * f_11_ * (float) Math.cos(method3447(i, 0, f));
        aFloatArrayArray4306[i][1] = f_11_ * f_11_;
        for (int i_12_ = 1; i_12_ < this.anIntArray4299[i];
             i_12_++) {
            f_11_ = method3449(i, i_12_, f);
            float f_13_
                    = (-2.0F * f_11_
                    * (float) Math.cos(method3447(i, i_12_, f)));
            float f_14_ = f_11_ * f_11_;
            aFloatArrayArray4306[i][i_12_ * 2 + 1]
                    = aFloatArrayArray4306[i][i_12_ * 2 - 1] * f_14_;
            aFloatArrayArray4306[i][i_12_ * 2]
                    = (aFloatArrayArray4306[i][i_12_ * 2 - 1] * f_13_
                    + aFloatArrayArray4306[i][i_12_ * 2 - 2] * f_14_);
            for (int i_15_ = i_12_ * 2 - 1; i_15_ >= 2; i_15_--)
                aFloatArrayArray4306[i][i_15_]
                        += (aFloatArrayArray4306[i][i_15_ - 1] * f_13_
                        + aFloatArrayArray4306[i][i_15_ - 2] * f_14_);
            aFloatArrayArray4306[i][1]
                    += aFloatArrayArray4306[i][0] * f_13_ + f_14_;
            aFloatArrayArray4306[i][0] += f_13_;
        }
        if (i == 0) {
            for (int i_16_ = 0;
                 i_16_ < this.anIntArray4299[0] * 2; i_16_++)
                aFloatArrayArray4306[0][i_16_] *= aFloat4305;
        }
        for (int i_17_ = 0; i_17_ < this.anIntArray4299[i] * 2;
             i_17_++)
            anIntArrayArray4301[i][i_17_]
                    = (int) (aFloatArrayArray4306[i][i_17_] * 65536.0F);
        return this.anIntArray4299[i] * 2;
    }

    public Class349() {
        anIntArrayArrayArray4302 = new int[2][2][4];
        anIntArrayArrayArray4300 = new int[2][2][4];
    }
}
