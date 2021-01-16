/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.zip.Inflater;

final class Class152 {
    static int anInt2070;
    static int anInt2071;
    private Inflater anInflater2072;
    static int anInt2073;
    static int anInt2074;
    static float[] aFloatArray2075 = new float[2];
    static boolean[] aBooleanArray2076 = new boolean[100];
    static Class243 aClass243_2077;
    static int anInt2078;

    final byte[] method1214(int i, byte[] is) {
        anInt2074++;
        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
        class348_sub49.anInt7197 = is.length - 4;
        int i_0_ = class348_sub49.method3359(-86);
        class348_sub49.anInt7197 = 0;
        if (i != 9)
            aFloatArray2075 = null;
        byte[] is_1_ = new byte[i_0_];
        method1218(is_1_, 29123, class348_sub49);
        return is_1_;
    }

    static final void method1215(byte i) {
        if (i != 3)
            method1217(-39, null);
        anInt2078++;
        if (Class240.anInt4674 != 9) {
            if ((Class240.anInt4674 ^ 0xffffffff) == -6
                    || Class240.anInt4674 == 6)
                Class348_Sub49.method3379(2, 3);
            else if (Class240.anInt4674 == 12)
                Class348_Sub49.method3379(2, 3);
        } else
            Class348_Sub49.method3379(2, 5);
    }

    public static void method1216(byte i) {
        if (i != -97)
            aFloatArray2075 = null;
        aClass243_2077 = null;
        aBooleanArray2076 = null;
        aFloatArray2075 = null;
    }

    static final void method1217(int i, Class357[][][] class357s) {
        anInt2070++;
        for (int i_2_ = i; i_2_ < class357s.length; i_2_++) {
            Class357[][] class357s_3_ = class357s[i_2_];
            for (int i_4_ = 0; i_4_ < class357s_3_.length; i_4_++) {
                for (int i_5_ = 0;
                     ((i_5_ ^ 0xffffffff)
                             > (class357s_3_[i_4_].length ^ 0xffffffff));
                     i_5_++) {
                    Class357 class357 = class357s_3_[i_4_][i_5_];
                    if (class357 != null) {
                        if (class357.aClass318_Sub1_Sub1_4402
                                instanceof Interface10)
                            ((Interface10)
                                    class357.aClass318_Sub1_Sub1_4402)
                                    .method40(-12031);
                        if (class357.aClass318_Sub1_Sub5_4395
                                instanceof Interface10)
                            ((Interface10)
                                    class357.aClass318_Sub1_Sub5_4395)
                                    .method40(-12031);
                        if (class357.aClass318_Sub1_Sub5_4407
                                instanceof Interface10)
                            ((Interface10)
                                    class357.aClass318_Sub1_Sub5_4407)
                                    .method40(-12031);
                        if (class357.aClass318_Sub1_Sub4_4406
                                instanceof Interface10)
                            ((Interface10)
                                    class357.aClass318_Sub1_Sub4_4406)
                                    .method40(-12031);
                        if (class357.aClass318_Sub1_Sub4_4403
                                instanceof Interface10)
                            ((Interface10)
                                    class357.aClass318_Sub1_Sub4_4403)
                                    .method40(-12031);
                        for (Class148 class148
                             = class357.aClass148_4396;
                             class148 != null;
                             class148 = class148.aClass148_2038) {
                            Class318_Sub1_Sub3 class318_sub1_sub3
                                    = (class148
                                    .aClass318_Sub1_Sub3_2040);
                            if (class318_sub1_sub3 instanceof Interface10)
                                ((Interface10) class318_sub1_sub3)
                                        .method40(i ^ ~0x2efe);
                        }
                    }
                }
            }
        }
    }

    public Class152() {
        this(-1, 1000000, 1000000);
    }

    final void method1218(byte[] is, int i, Class348_Sub49 class348_sub49) {
        try {
            if (i != 29123)
                method1217(-91, null);
            anInt2073++;
            if (((class348_sub49.aByteArray7154
                    [class348_sub49.anInt7197])
                    ^ 0xffffffff) != -32
                    || (class348_sub49.aByteArray7154
                    [1 + class348_sub49.anInt7197]) != -117)
                throw new RuntimeException("Invalid GZIP header!");
            if (anInflater2072 == null)
                anInflater2072 = new Inflater(true);
            try {
                anInflater2072.setInput
                        (class348_sub49.aByteArray7154,
                                class348_sub49.anInt7197 - -10,
                                -8 - (10 + class348_sub49.anInt7197
                                        - (class348_sub49
                                        .aByteArray7154).length));
                anInflater2072.inflate(is);
            } catch (Exception exception) {
                anInflater2072.reset();
                throw new RuntimeException("Invalid GZIP compressed data!");
            }
            anInflater2072.reset();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ol.A("
                            + (is != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (class348_sub49 != null
                            ? "{...}" : "null")
                            + ')'));
        }
    }

    private Class152(int i, int i_6_, int i_7_) {
        /* empty */
    }
}
