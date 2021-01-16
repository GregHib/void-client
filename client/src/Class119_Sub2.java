/* Class119_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119_Sub2 extends Class119 implements Interface8 {
    static int anInt4826;
    private int anInt4827;
    static int anInt4828;
    static int anInt4829;
    static int anInt4830;
    static int anInt4831;
    static int anInt4832;

    static final short[] method1078(short[] is, int i, int i_0_) {
        anInt4829++;
        if (i_0_ < 87)
            method1078(null, 22, -24);
        short[] is_1_ = new short[i];
        Class214.method1576(is, 0, is_1_, 0, i);
        return is_1_;
    }

    public final int method33(int i) {
        if (i != -23923)
            return 92;
        anInt4830++;
        return 0;
    }

    public final long method36(byte i) {
        if (i <= 76)
            anInt4827 = 68;
        anInt4832++;
        return ((Class119) this).aBuffer1792.getAddress();
    }

    static final int method1079(int i, int i_2_, int i_3_, int i_4_) {
        anInt4826++;
        if (i != 4095)
            return 14;
        i_2_ &= 0x3;
        if (i_2_ == 0)
            return i_3_;
        if ((i_2_ ^ 0xffffffff) == -2)
            return 4095 - i_4_;
        if ((i_2_ ^ 0xffffffff) == -3)
            return 4095 + -i_3_;
        return i_4_;
    }

    public final int method34(int i) {
        anInt4831++;
        if (i != -5711)
            method35(null, -107, -123, -39);
        return anInt4827;
    }

    public final void method35(byte[] is, int i, int i_5_, int i_6_) {
        this.method1076(is, i_6_);
        anInt4828++;
        anInt4827 = i;
        if (i_5_ < 18)
            anInt4827 = -41;
    }

    Class119_Sub2(ha_Sub2 var_ha_Sub2, int i, byte[] is, int i_7_) {
        super(var_ha_Sub2, is, i_7_);
        try {
            anInt4827 = i;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("wv.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_7_ + ')'));
        }
    }
}
