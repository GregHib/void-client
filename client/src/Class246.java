/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246 {
    static int[] anIntArray3173 = {0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
    static boolean aBoolean3174 = false;
    static int anInt3175;
    static int anInt3176;
    static float aFloat3177;
    static int anInt3178;
    static Class143 aClass143_3179;

    static final void method1885(int i, int i_0_, int i_1_, int i_2_, int i_3_, float[] fs, int i_4_, float f, int i_5_, int i_6_, float f_7_, float[] fs_8_) {
        try {
            i_4_ -= i_5_;
            i_0_ -= i;
            anInt3175++;
            i_3_ -= i_6_;
            float f_9_ = fs_8_[2] * (float) i_0_ + (fs_8_[1] * (float) i_4_ + (float) i_3_ * fs_8_[0]);
            float f_10_ = (fs_8_[5] * (float) i_0_ + (fs_8_[3] * (float) i_3_ + (float) i_4_ * fs_8_[4]));
            float f_11_ = ((float) i_3_ * fs_8_[6] + fs_8_[7] * (float) i_4_ + (float) i_0_ * fs_8_[i_2_]);
            float f_12_ = 0.5F + ((float) Math.atan2(f_9_, f_11_) / 6.2831855F);
            if (f_7_ != 1.0F) f_12_ *= f_7_;
            float f_13_ = 0.5F + f_10_ + f;
            if (i_1_ == 1) {
                float f_14_ = f_12_;
                f_12_ = -f_13_;
                f_13_ = f_14_;
            } else if (i_1_ == 2) {
                f_12_ = -f_12_;
                f_13_ = -f_13_;
            } else if (i_1_ == 3) {
                float f_15_ = f_12_;
                f_12_ = f_13_;
                f_13_ = -f_15_;
            }
            fs[1] = f_13_;
            fs[0] = f_12_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ca.D(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + (fs != null ? "{...}" : "null") + ',' + i_4_ + ',' + f + ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + (fs_8_ != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1886(int i) {
        if (i != 4908) method1885(-84, 89, 50, 37, 107, null, -109, 0.5058839F, -21, -30, 0.003914575F, null);
        anIntArray3173 = null;
        aClass143_3179 = null;
    }

    static final boolean method1887(int i, int i_16_, int i_17_) {
        anInt3178++;
        if (i != 0) return true;
        return Class348_Sub40_Sub3.method3056(63, i_17_, i_16_) | (0x70000 & i_17_) != 0 || Class264.method2015(i_17_, i_16_, i + 7);
    }

    abstract Class348_Sub42_Sub8 method1888(int i, Class348_Sub42_Sub8 class348_sub42_sub8);
}
