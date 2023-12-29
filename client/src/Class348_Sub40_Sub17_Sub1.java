/* Class348_Sub40_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub17_Sub1 extends Class348_Sub40_Sub17 {
    static int anInt10425;
    static Index aIndex_10426;
    static int anInt10427;

    public Class348_Sub40_Sub17_Sub1() {
        /* empty */
    }

    final int[][] method3047(int i, int i_0_) {
        if (i_0_ != -1564599039) method3093(54);
        anInt10425++;
        int[][] is = this.aClass322_7033.method2557(-93, i);
        if (this.aClass322_7033.aBoolean4035 && this.method3090(true)) {
            int[] is_1_ = is[0];
            int[] is_2_ = is[1];
            int[] is_3_ = is[2];
            int i_4_ = (this.anInt9241 * (i % this.anInt9241));
            for (int i_5_ = 0; i_5_ < Class348_Sub40_Sub6.anInt9139; i_5_++) {
                int i_6_ = (this.anIntArray9232[(i_5_ % this.anInt9237 + i_4_)]);
                is_3_[i_5_] = Class139.method1166(4080, i_6_ << 4);
                is_2_[i_5_] = Class139.method1166(65280, i_6_) >> 4;
                is_1_[i_5_] = Class139.method1166(4080, i_6_ >> 12);
            }
        }
        return is;
    }

    public static void method3092(int i) {
        if (i != -1) aIndex_10426 = null;
        aIndex_10426 = null;
    }

    static final void method3093(int i) {
        if (i > 85) {
            anInt10427++;
            Class348_Sub5.method2755(-1, 255, -1);
        }
    }
}
