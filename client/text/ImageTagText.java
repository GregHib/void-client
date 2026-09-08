/* ImageTagText - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class163` (JODE-obfuscated).
 * Image-tag text component. Extends the text base; renders '<img=...>' inline image tags inside chat/UI strings.
 */

final class ImageTagText {
    private int anInt2159;
    static int anInt2160;
    static int anInt2161;
    static boolean[] aBooleanArray2162;
    private int[][] anIntArrayArray2163;
    private int anInt2164;
    static int[][] anIntArrayArray2165 = {{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
    static int anInt2166;
    static int anInt2167;
    static int anInt2168;
    static DisplayModeManagerContainer167[] aClass17Array2169 = new DisplayModeManagerContainer167[14];
    static int anInt2170;
    static int anInt2171;

    final short[] method1268(int i, short[] is) {
        anInt2171++;
        int i_0_ = 14 % ((i - 48) / 33);
        if (anIntArrayArray2163 != null) {
            int i_1_ = 14 + (int) ((long) anInt2159 * (long) is.length / (long) anInt2164);
            int[] is_2_ = new int[i_1_];
            int i_3_ = 0;
            int i_4_ = 0;
            for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
                int i_6_ = is[i_5_];
                int[] is_7_ = anIntArrayArray2163[i_4_];
                for (int i_8_ = 0; i_8_ < 14; i_8_++)
                    is_2_[i_3_ + i_8_] += i_6_ * is_7_[i_8_] >> 2;
                i_4_ += anInt2159;
                int i_9_ = i_4_ / anInt2164;
                i_4_ -= anInt2164 * i_9_;
                i_3_ += i_9_;
            }
            is = new short[i_1_];
            for (int i_10_ = 0; i_10_ < i_1_; i_10_++) {
                int i_11_ = 8192 + is_2_[i_10_] >> 14;
                if (i_11_ >= -32768) {
                    if (i_11_ > 32767) is[i_10_] = (short) 32767;
                    else is[i_10_] = (short) i_11_;
                } else is[i_10_] = (short) -32768;
            }
        }
        return is;
    }

    static final HashNodeSub14 method1269(int i) {
        if (i != -17096) return null;
        anInt2168++;
        return DisplayModeManagerContainer229.aClass348_Sub42_Sub14_1243;
    }

    final int method1270(int i, byte i_12_) {
        if (i_12_ != -85) return 59;
        anInt2160++;
        if (anIntArrayArray2163 != null) i = (int) ((long) i * (long) anInt2159 / (long) anInt2164);
        return i;
    }

    static final void method1271(int i) {
        anInt2166++;
        synchronized (DisplayModeManagerContainer173.aClass60_4254) {
            DisplayModeManagerContainer173.aClass60_4254.purgeSoftReferences(-86);
            if (i != 0) method1276(25);
        }
    }

    final byte[] method1272(byte[] is, int i) {
        if (i != 1) method1276(71);
        anInt2167++;
        if (anIntArrayArray2163 != null) {
            int i_13_ = ((int) ((long) anInt2159 * (long) is.length / (long) anInt2164) + 14);
            int[] is_14_ = new int[i_13_];
            int i_15_ = 0;
            int i_16_ = 0;
            for (int i_17_ = 0; i_17_ < is.length; i_17_++) {
                int i_18_ = is[i_17_];
                int[] is_19_ = anIntArrayArray2163[i_16_];
                for (int i_20_ = 0; i_20_ < 14; i_20_++)
                    is_14_[i_15_ + i_20_] += i_18_ * is_19_[i_20_];
                i_16_ += anInt2159;
                int i_21_ = i_16_ / anInt2164;
                i_16_ -= anInt2164 * i_21_;
                i_15_ += i_21_;
            }
            is = new byte[i_13_];
            for (int i_22_ = 0; i_22_ < i_13_; i_22_++) {
                int i_23_ = is_14_[i_22_] - -32768 >> 16;
                if (i_23_ >= -128) {
                    if (i_23_ > 127) is[i_22_] = (byte) 127;
                    else is[i_22_] = (byte) i_23_;
                } else is[i_22_] = (byte) -128;
            }
        }
        return is;
    }

    static final String method1273(int[] is, boolean bool) {
        anInt2161++;
        StringBuffer stringbuffer = new StringBuffer();
        int i = Component175.anInt5850;
        for (int i_24_ = 0; is.length > i_24_; i_24_++) {
            Component236 class321 = DisplayModeManagerContainer64.aClass187_9036.method1408(-12637, is[i_24_]);
            if (class321.anInt4000 != -1) {
                Component24 class105 = ((Component24) Component225.aClass60_463.get(class321.anInt4000, -74));
                if (class105 == null) {
                    Component170 class207 = Component170.method1521(Component158.aClass45_322, class321.anInt4000, 0);
                    if (class207 != null) {
                        class105 = NodeSub8.toolkit.method3691(class207, true);
                        Component225.aClass60_463.putOne(class105, class321.anInt4000, (byte) -127);
                    }
                }
                if (class105 != null) {
                    DisplayModeManagerContainer196.aClass105Array4234[i] = class105;
                    stringbuffer.append(" <img=").append(i).append(">");
                    i++;
                }
            }
        }
        if (bool != true) aBooleanArray2162 = null;
        return stringbuffer.toString();
    }

    static final void method1274(DisplayModeManagerContainer154 class76) {
        DisplayModeManagerContainer5.aClass76_1208 = class76;
    }

    final int method1275(int i, int i_25_) {
        int i_26_ = 26 % ((i - -29) / 32);
        anInt2170++;
        if (anIntArrayArray2163 != null) i_25_ = ((int) ((long) i_25_ * (long) anInt2159 / (long) anInt2164) + 6);
        return i_25_;
    }

    ImageTagText(int i, int i_27_) {
        if (i != i_27_) {
            int i_28_ = NodeSub1Sub1.method2726(-21806, i, i_27_);
            i /= i_28_;
            i_27_ /= i_28_;
            anIntArrayArray2163 = new int[i][14];
            anInt2159 = i_27_;
            anInt2164 = i;
            for (int i_29_ = 0; i_29_ < i; i_29_++) {
                int[] is = anIntArrayArray2163[i_29_];
                double d = (double) i_29_ / (double) i + 6.0;
                int i_30_ = (int) Math.floor(1.0 + (-7.0 + d));
                if (i_30_ < 0) i_30_ = 0;
                int i_31_ = (int) Math.ceil(d + 7.0);
                if (i_31_ > 14) i_31_ = 14;
                double d_32_ = (double) i_27_ / (double) i;
                for (/**/; i_30_ < i_31_; i_30_++) {
                    double d_33_ = 3.141592653589793 * (-d + (double) i_30_);
                    double d_34_ = d_32_;
                    if (d_33_ < -1.0E-4 || d_33_ > 1.0E-4) d_34_ *= Math.sin(d_33_) / d_33_;
                    d_34_ *= (Math.cos(0.2243994752564138 * ((double) i_30_ - d)) * 0.46) + 0.54;
                    is[i_30_] = (int) Math.floor(0.5 + d_34_ * 65536.0);
                }
            }
        }
    }

    public static void method1276(int i) {
        int i_35_ = 101 % ((i - -20) / 49);
        aClass17Array2169 = null;
        anIntArrayArray2165 = null;
        aBooleanArray2162 = null;
    }
}
