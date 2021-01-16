/* Class348_Sub40_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub13 extends Class348_Sub40 {
    static Class262 aClass262_9201;
    static int anInt9202;
    static int anInt9203 = -1;
    static float aFloat9204;

    public static void method3080(byte i) {
        aClass262_9201 = null;
        if (i < 39)
            method3080((byte) 100);
    }

    public Class348_Sub40_Sub13() {
        super(1, true);
    }

    final int[] method3042(int i, int i_0_) {
        anInt9202++;
        int[] is
                = ((Class348_Sub40) this).aClass191_7032.method1433(i_0_ + -255,
                i);
        if (i_0_ != 255)
            method3042(19, -84);
        if (((Class191) ((Class348_Sub40) this).aClass191_7032).aBoolean2570) {
            int[][] is_1_ = this.method3039((byte) -119, i, 0);
            int[] is_2_ = is_1_[0];
            int[] is_3_ = is_1_[1];
            int[] is_4_ = is_1_[2];
            for (int i_5_ = 0; Class348_Sub40_Sub6.anInt9139 > i_5_; i_5_++)
                is[i_5_] = (is_2_[i_5_] - (-is_3_[i_5_] - is_4_[i_5_])) / 3;
        }
        return is;
    }

    static {
        aClass262_9201 = new Class262();
        aFloat9204 = 0.25F;
    }
}
