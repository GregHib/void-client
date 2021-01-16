/* Class135_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class135_Sub2 extends Class135 implements Interface8 {
    static int anInt4833;
    static int anInt4834;
    static Class251 aClass251_4835 = new Class251();
    static int anInt4836;
    private int anInt4837;
    static int anInt4838;
    static Class161 aClass161_4839;
    static int anInt4840;
    static int anInt4841;
    static int anInt4842;
    static Class45 aClass45_4843;
    static int anInt4844;
    private static char[] aCharArray4845 = new char[64];
    static Class348_Sub42_Sub12 aClass348_Sub42_Sub12_4846;

    final void method1152(int i) {
        anInt4840++;
        this.aHa_Sub2_1927.method3793(1, this);
        if (i >= -78)
            aClass161_4839 = null;
    }

    public final int method34(int i) {
        anInt4838++;
        if (i != -5711)
            method35(null, -82, 99, -89);
        return anInt4837;
    }

    public final void method35(byte[] is, int i, int i_0_, int i_1_) {
        if (i_0_ > 18) {
            this.method1150(is, 0, i_1_);
            anInt4833++;
            anInt4837 = i;
        }
    }

    public static void method1155(byte i) {
        aClass251_4835 = null;
        aClass161_4839 = null;
        int i_2_ = -29 / ((i - -49) / 43);
        aClass45_4843 = null;
        aCharArray4845 = null;
        aClass348_Sub42_Sub12_4846 = null;
    }

    public final int method33(int i) {
        if (i != -23923)
            method35(null, -47, -115, -72);
        anInt4836++;
        return this.anInt1929;
    }

    static final void method1156(int i, int i_3_, int[] is, int i_4_,
                                 int i_5_) {
        i_4_--;
        anInt4841++;
        int i_6_ = --i_3_ - 7;
        if (i == -27) {
            while (i_6_ > i_4_) {
                is[++i_4_] = i_5_;
                is[++i_4_] = i_5_;
                is[++i_4_] = i_5_;
                is[++i_4_] = i_5_;
                is[++i_4_] = i_5_;
                is[++i_4_] = i_5_;
                is[++i_4_] = i_5_;
                is[++i_4_] = i_5_;
            }
            while (i_3_ > i_4_)
                is[++i_4_] = i_5_;
        }
    }

    static final void method1157(int i, byte i_7_) {
        if (i_7_ < -77) {
            Class239_Sub12.anInt5969 = 2;
            anInt4834++;
            RuntimeException_Sub1.anInt4596 = i;
            long l = 0L;
            if (Class348_Sub23_Sub3.aString9043 != null) {
                Class348_Sub49 class348_sub49
                        = (new Class348_Sub49
                        (Class98.method878((Class110_Sub1.method1039
                                        (Class348_Sub23_Sub3.aString9043,
                                                true)),
                                -126)));
                l = class348_sub49.method3365(-456577760);
                Class348_Sub33.aLong6966
                        = class348_sub49.method3365(-456577760);
            } else {
                Class14_Sub4.method254(35, (byte) -87);
                return;
            }
            Class132.method1138(Class27.method313(l, -95), true, "",
                    (byte) 79);
        }
    }

    public final long method36(byte i) {
        if (i < 76)
            aClass251_4835 = null;
        anInt4842++;
        return 0L;
    }

    Class135_Sub2(ha_Sub2 var_ha_Sub2, int i, byte[] is, int i_8_,
                  boolean bool) {
        super(var_ha_Sub2, 34963, is, i_8_, bool);
        try {
            anInt4837 = i;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("kaa.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_8_ + ',' + bool + ')'));
        }
    }

    static final boolean method1158(int i, int i_9_, int i_10_) {
        if (i_9_ != -1)
            aClass161_4839 = null;
        anInt4844++;
        return (i_10_ & 0x180) != 0;
    }

    static {
        for (int i = 0; i < 26; i++)
            aCharArray4845[i] = (char) (65 + i);
        for (int i = 26; i < 52; i++)
            aCharArray4845[i] = (char) (i + 71);
        for (int i = 52; i < 62; i++)
            aCharArray4845[i] = (char) (-4 + i);
        aCharArray4845[63] = '-';
        aCharArray4845[62] = '*';
    }
}
