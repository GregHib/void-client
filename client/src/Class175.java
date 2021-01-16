/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class175 {
    static int anInt2310;
    private int anInt2311;
    private final Class356 aClass356_2312;
    static int anInt2313;
    static int anInt2314;
    static Class351 aClass351_2315;
    private Class107 aClass107_2316 = new Class107();
    static int anInt2317;
    static int anInt2318;
    static int anInt2319;
    static int anInt2320;
    static int anInt2321;
    static int anInt2322;
    static int anInt2323;
    private final int anInt2324;
    static int anInt2325;
    static boolean[] aBooleanArray2326 = new boolean[100];
    static Class340 aClass340_2327;
    static int anInt2328;
    static boolean aBoolean2329;
    static int[] anIntArray2330;

    private final void method1338(int i, Interface14 interface14) {
        anInt2321++;
        long l = interface14.method52((byte) 117);
        for (Class348_Sub42_Sub9 class348_sub42_sub9
             = (Class348_Sub42_Sub9) aClass356_2312.method3480(l, -6008);
             class348_sub42_sub9 != null;
             class348_sub42_sub9
                     = (Class348_Sub42_Sub9) aClass356_2312.method3476(true)) {
            if (class348_sub42_sub9
                    .anInterface14_9559.method53(78, interface14)) {
                method1342(class348_sub42_sub9, (byte) 79);
                break;
            }
        }
        if (i != 7)
            method1340(-127, null);
    }

    final int method1339(int i) {
        if (i != 100)
            return -3;
        anInt2310++;
        return anInt2324;
    }

    final Object method1340(int i, Interface14 interface14) {
        anInt2313++;
        long l = interface14.method52((byte) 64);
        for (Class348_Sub42_Sub9 class348_sub42_sub9
             = (Class348_Sub42_Sub9) aClass356_2312.method3480(l, -6008);
             class348_sub42_sub9 != null;
             class348_sub42_sub9
                     = (Class348_Sub42_Sub9) aClass356_2312.method3476(true)) {
            if (class348_sub42_sub9
                    .anInterface14_9559.method53(94, interface14)) {
                Object object = class348_sub42_sub9.method3205(65536);
                if (object == null) {
                    class348_sub42_sub9.method2715((byte) 36);
                    class348_sub42_sub9.method3162(true);
                    anInt2311 += (class348_sub42_sub9
                            .anInt9556);
                } else {
                    if (class348_sub42_sub9.method3206((byte) -128)) {
                        Class348_Sub42_Sub9_Sub1 class348_sub42_sub9_sub1
                                = (new Class348_Sub42_Sub9_Sub1
                                (interface14, object,
                                        (class348_sub42_sub9
                                                .anInt9556)));
                        aClass356_2312.method3483((byte) 125,
                                (class348_sub42_sub9
                                        .aLong4291),
                                class348_sub42_sub9_sub1);
                        aClass107_2316.method1005(true,
                                class348_sub42_sub9_sub1);
                        class348_sub42_sub9_sub1.aLong7057
                                = 0L;
                        class348_sub42_sub9.method2715((byte) 65);
                        class348_sub42_sub9.method3162(true);
                    } else {
                        aClass107_2316.method1005(true, class348_sub42_sub9);
                        class348_sub42_sub9.aLong7057 = 0L;
                    }
                    return object;
                }
            }
        }
        if (i < 66)
            return null;
        return null;
    }

    private final void method1341(Object object, Interface14 interface14,
                                  int i, int i_0_) {
        try {
            if (i < -84) {
                anInt2314++;
                if ((i_0_ ^ 0xffffffff) < (anInt2324 ^ 0xffffffff))
                    throw new IllegalStateException("s>cs");
                method1338(7, interface14);
                anInt2311 -= i_0_;
                while (anInt2311 < 0) {
                    Class348_Sub42_Sub9 class348_sub42_sub9
                            = (Class348_Sub42_Sub9) aClass107_2316.method1008(20);
                    method1342(class348_sub42_sub9, (byte) 60);
                }
                Class348_Sub42_Sub9_Sub1 class348_sub42_sub9_sub1
                        = new Class348_Sub42_Sub9_Sub1(interface14, object, i_0_);
                aClass356_2312.method3483((byte) 120,
                        interface14.method52((byte) 120),
                        class348_sub42_sub9_sub1);
                aClass107_2316.method1005(true, class348_sub42_sub9_sub1);
                class348_sub42_sub9_sub1.aLong7057 = 0L;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("pq.L("
                            + (object != null ? "{...}"
                            : "null")
                            + ','
                            + (interface14 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_0_ + ')'));
        }
    }

    private final void method1342(Class348_Sub42_Sub9 class348_sub42_sub9,
                                  byte i) {
        anInt2317++;
        if (i < 51)
            method1341(null, null, -110, 119);
        if (class348_sub42_sub9 != null) {
            class348_sub42_sub9.method2715((byte) 42);
            class348_sub42_sub9.method3162(true);
            anInt2311 += class348_sub42_sub9.anInt9556;
        }
    }

    static final void method1343(int i, Class46 class46, int i_1_, int i_2_) {
        Class32.anInt451 = i;
        Class348_Sub36.aClass46_6990 = class46;
        Class332.anInt4141 = i_2_;
        anInt2328++;
        if (i_1_ != 1)
            method1349((byte) 119);
    }

    final void method1344(byte i) {
        anInt2319++;
        for (Class348_Sub42_Sub9 class348_sub42_sub9
             = (Class348_Sub42_Sub9) aClass107_2316.method1011(-87);
             class348_sub42_sub9 != null;
             class348_sub42_sub9 = ((Class348_Sub42_Sub9)
                     aClass107_2316.method1003((byte) 69))) {
            if (class348_sub42_sub9.method3206((byte) 5)) {
                class348_sub42_sub9.method2715((byte) 127);
                class348_sub42_sub9.method3162(true);
                anInt2311
                        += class348_sub42_sub9.anInt9556;
            }
        }
        if (i > -34)
            aBooleanArray2326 = null;
    }

    final void method1345(byte i) {
        aClass107_2316.method1009(2110355138);
        anInt2325++;
        aClass356_2312.method3481(0);
        int i_3_ = 18 % ((i - -89) / 35);
        anInt2311 = anInt2324;
    }

    final void method1346(int i, int i_4_) {
        anInt2322++;
        if (Class103.aClass345_1607 != null) {
            for (Class348_Sub42_Sub9 class348_sub42_sub9
                 = (Class348_Sub42_Sub9) aClass107_2316.method1011(-72);
                 class348_sub42_sub9 != null;
                 class348_sub42_sub9
                         = ((Class348_Sub42_Sub9)
                         aClass107_2316.method1003((byte) 59))) {
                if (class348_sub42_sub9.method3206((byte) -124)) {
                    if (class348_sub42_sub9.method3205(i + 67027) == null) {
                        class348_sub42_sub9.method2715((byte) 103);
                        class348_sub42_sub9.method3162(true);
                        anInt2311
                                += (class348_sub42_sub9
                                .anInt9556);
                    }
                } else if (((long) i_4_ ^ 0xffffffffffffffffL)
                        > (++class348_sub42_sub9
                        .aLong7057
                        ^ 0xffffffffffffffffL)) {
                    Class348_Sub42_Sub9 class348_sub42_sub9_5_
                            = Class103.aClass345_1607
                            .method2694(-1, class348_sub42_sub9);
                    aClass356_2312.method3483((byte) 120,
                            (class348_sub42_sub9
                                    .aLong4291),
                            class348_sub42_sub9_5_);
                    Class59_Sub2_Sub2.method573(class348_sub42_sub9_5_,
                            class348_sub42_sub9,
                            (byte) 63);
                    class348_sub42_sub9.method2715((byte) 70);
                    class348_sub42_sub9.method3162(true);
                }
            }
        }
        if (i != -1491)
            method1342(null, (byte) 51);
    }

    static final float[] method1347(int i, int i_6_, float f, float f_7_,
                                    int i_8_, float f_9_, int i_10_,
                                    int i_11_) {
        anInt2323++;
        float[] fs = new float[9];
        float[] fs_12_ = new float[9];
        float f_13_
                = (float) Math.cos((float) i_11_ * 0.024543693F);
        int i_14_ = -94 / ((i_8_ - 57) / 62);
        float f_15_
                = (float) Math.sin(0.024543693F * (float) i_11_);
        fs[6] = -f_15_;
        float f_16_ = -f_13_ + 1.0F;
        fs[8] = f_13_;
        fs[3] = 0.0F;
        fs[1] = 0.0F;
        fs[2] = f_15_;
        fs[4] = 1.0F;
        fs[5] = 0.0F;
        fs[0] = f_13_;
        fs[7] = 0.0F;
        float[] fs_17_ = new float[9];
        float f_18_ = 1.0F;
        f_13_ = (float) i_6_ / 32767.0F;
        float f_19_ = 0.0F;
        f_16_ = -f_13_ + 1.0F;
        f_15_ = -(float) Math.sqrt(1.0F - f_13_ * f_13_);
        float f_20_ = (float) Math.sqrt(i_10_ * i_10_ + i * i);
        if (f_20_ == 0.0F && f_13_ == 0.0F)
            fs_12_ = fs;
        else {
            if (f_20_ != 0.0F) {
                f_18_ = (float) -i / f_20_;
                f_19_ = (float) i_10_ / f_20_;
            }
            fs_17_[5] = f_18_ * f_15_;
            fs_17_[2] = f_18_ * f_19_ * f_16_;
            fs_17_[8] = f_13_ + f_16_ * (f_19_ * f_19_);
            fs_17_[4] = f_13_;
            fs_17_[0] = f_16_ * (f_18_ * f_18_) + f_13_;
            fs_17_[6] = f_16_ * (f_19_ * f_18_);
            fs_17_[3] = f_15_ * -f_19_;
            fs_17_[1] = f_15_ * f_19_;
            fs_17_[7] = f_15_ * -f_18_;
            fs_12_[0]
                    = fs_17_[0] * fs[0] + fs[1] * fs_17_[3] + fs_17_[6] * fs[2];
            fs_12_[1]
                    = fs_17_[7] * fs[2] + (fs[1] * fs_17_[4] + fs[0] * fs_17_[1]);
            fs_12_[2]
                    = fs[1] * fs_17_[5] + fs[0] * fs_17_[2] + fs[2] * fs_17_[8];
            fs_12_[3]
                    = fs_17_[0] * fs[3] + fs[4] * fs_17_[3] + fs_17_[6] * fs[5];
            fs_12_[4]
                    = fs[5] * fs_17_[7] + (fs[3] * fs_17_[1] + fs[4] * fs_17_[4]);
            fs_12_[6]
                    = fs_17_[0] * fs[6] + fs[7] * fs_17_[3] + fs_17_[6] * fs[8];
            fs_12_[5]
                    = fs[4] * fs_17_[5] + fs_17_[2] * fs[3] + fs[5] * fs_17_[8];
            fs_12_[7]
                    = fs_17_[1] * fs[6] + fs_17_[4] * fs[7] + fs[8] * fs_17_[7];
            fs_12_[8]
                    = fs_17_[5] * fs[7] + fs[6] * fs_17_[2] + fs[8] * fs_17_[8];
        }
        fs_12_[7] *= f;
        fs_12_[4] *= f_9_;
        fs_12_[3] *= f_9_;
        fs_12_[5] *= f_9_;
        fs_12_[2] *= f_7_;
        fs_12_[8] *= f;
        fs_12_[6] *= f;
        fs_12_[1] *= f_7_;
        fs_12_[0] *= f_7_;
        return fs_12_;
    }

    final void method1348(int i, Object object, Interface14 interface14) {
        do {
            try {
                anInt2318++;
                method1341(object, interface14, -114, 1);
                if (i > 62)
                    break;
                aClass107_2316 = null;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("pq.K(" + i + ','
                                + (object != null ? "{...}"
                                : "null")
                                + ','
                                + (interface14 != null
                                ? "{...}" : "null")
                                + ')'));
            }
            break;
        } while (false);
    }

    public static void method1349(byte i) {
        anIntArray2330 = null;
        aClass340_2327 = null;
        aBooleanArray2326 = null;
        aClass351_2315 = null;
        if (i > -103)
            aBooleanArray2326 = null;
    }

    final int method1350(byte i) {
        int i_21_ = -9 % ((73 - i) / 53);
        anInt2320++;
        return anInt2311;
    }

    Class175(int i) {
        anInt2311 = i;
        anInt2324 = i;
        int i_22_;
        for (i_22_ = 1; i_22_ + i_22_ < i; i_22_ += i_22_) {
            /* empty */
        }
        aClass356_2312 = new Class356(i_22_);
    }

    static {
        aClass351_2315 = new Class351(18, 3);
    }
}
