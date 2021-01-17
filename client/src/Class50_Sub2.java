/* Class50_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50_Sub2 extends Class50 {
    private final int anInt5227;
    static int anInt5228;
    static int anInt5229;
    private final int anInt5230;
    private int anInt5231;
    private final int anInt5232;
    static boolean aBoolean5233 = false;
    static int anInt5234;
    static int anInt5235;

    final void method455(int i, int i_0_, int i_1_) {
        anInt5228++;
        int i_2_ = i * anInt5231 >> 12;
        int i_3_ = anInt5232 * i >> 12;
        int i_4_ = i_0_ * anInt5227 >> 12;
        if (i_1_ > -98) aBoolean5233 = false;
        int i_5_ = i_0_ * anInt5230 >> 12;
        Class170.method1308(this.anInt864, i_4_, i_2_, this.anInt865, (byte) -123, this.anInt862, i_3_, i_5_);
    }

    static final void method464(int i) {
        anInt5229++;
        Class334.anInt4155 = i;
        Class108.aClass105_1664 = null;
    }

    Class50_Sub2(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        super(i_9_, i_10_, i_11_);
        anInt5231 = i;
        anInt5227 = i_6_;
        anInt5230 = i_8_;
        anInt5232 = i_7_;
    }

    final void method457(int i, int i_12_, int i_13_) {
        anInt5235++;
        int i_14_ = i_12_ * anInt5231 >> 12;
        if (i_13_ <= -29) {
            int i_15_ = i_12_ * anInt5232 >> 12;
            int i_16_ = i * anInt5227 >> 12;
            int i_17_ = i * anInt5230 >> 12;
            Class97.method872(this.anInt865, 1, this.anInt862, i_16_, i_17_, i_15_, i_14_);
        }
    }

    final void method456(int i, int i_18_, int i_19_) {
        anInt5234++;
        int i_20_ = i_18_ * anInt5231 >> 12;
        int i_21_ = anInt5232 * i_18_ >> 12;
        if (i <= 87) anInt5231 = 56;
        int i_22_ = i_19_ * anInt5227 >> 12;
        int i_23_ = i_19_ * anInt5230 >> 12;
        Class318_Sub1_Sub5.method2486(0, i_21_, this.anInt864, i_23_, i_20_, i_22_);
    }
}
