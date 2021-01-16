/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class21 {
    static int anInt321;
    static Class45 aClass45_322;
    static Class46 aClass46_323 = null;
    static int anInt324;
    static int anInt325 = -50;
    static ha aHa326;
    static int anInt327;

    public final String toString() {
        anInt327++;
        throw new IllegalStateException();
    }

    public static void method288(byte i) {
        aClass45_322 = null;
        if (i > 93) {
            aHa326 = null;
            aClass46_323 = null;
        }
    }

    static final void method289(int i, int i_0_, int i_1_, int i_2_) {
        anInt324++;
        if (Class369_Sub1.anInt8583 != i_2_ || Class295.anInt3760 != i_0_ || i_1_ != Class27.anInt396) {
            Class369_Sub1.anInt8583 = i_2_;
            Class348_Sub16_Sub2.aBoolean8870 = true;
            Class27.anInt396 = i_1_;
            Class295.anInt3760 = i_0_;
            double d = -((double) (i_2_ * 2) * 3.141592653589793) / 16384.0;
            double d_3_ = -(3.141592653589793 * (double) (2 * i_0_)) / 16384.0;
            double d_4_ = Math.cos(d_3_);
            double d_5_ = Math.sin(d_3_);
            double d_6_ = Math.cos(d);
            double d_7_ = Math.sin(d);
            Class247.aDouble3182 = d_4_;
            Class348_Sub15.aDouble6774 = d_7_;
            Class295.aDouble3761 = d_6_;
            Class348_Sub16_Sub2.aDouble8869 = d_4_ * d_6_;
            if (i != -15902) method288((byte) -120);
            Class348_Sub42_Sub5.aDouble9531 = d_7_ * -d_4_;
            Class357.aDouble4404 = d_5_;
            Class319.aDouble3980 = 0.0;
            Class59.aDouble1083 = d_6_ * -d_5_;
            Class348_Sub23_Sub2.aDouble9023 = d_5_ * d_7_;
        }
    }

    public Class21() {
        /* empty */
    }
}
