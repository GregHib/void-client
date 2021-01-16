/* Class348_Sub42_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class348_Sub42_Sub16 extends Class348_Sub42 {
    static Class21 aClass21_9661;
    static int anInt9662;
    boolean aBoolean9663;
    volatile boolean aBoolean9664 = true;
    static String aString9665 = null;
    static int anInt9666;
    boolean aBoolean9667;
    static int anInt9668;

    public static void method3252(int i) {
        aClass21_9661 = null;
        aString9665 = null;
        if (i != 353)
            aClass21_9661 = null;
    }

    static final void method3253(int i, int i_0_, int i_1_, Class var_class) {
        Class357 class357
                = Class147.aClass357ArrayArrayArray2029[i][i_0_][i_1_];
        if (class357 != null) {
            for (Class148 class148 = ((Class357) class357).aClass148_4396;
                 class148 != null;
                 class148 = ((Class148) class148).aClass148_2038) {
                Class318_Sub1_Sub3 class318_sub1_sub3
                        = ((Class148) class148).aClass318_Sub1_Sub3_2040;
                if (var_class.isAssignableFrom(class318_sub1_sub3.getClass())
                        && (((Class318_Sub1_Sub3) class318_sub1_sub3).aShort8743
                        == i_0_)
                        && (((Class318_Sub1_Sub3) class318_sub1_sub3).aShort8750
                        == i_1_)) {
                    Class348_Sub46.method3320(class318_sub1_sub3, false);
                    break;
                }
            }
        }
    }

    static final void method3254(int i, int i_2_, int i_3_,
                                 Class318_Sub1_Sub4 class318_sub1_sub4,
                                 Class318_Sub1_Sub4 class318_sub1_sub4_4_) {
        Class357 class357 = Class348_Sub46.method3321(i, i_2_, i_3_);
        if (class357 != null) {
            ((Class357) class357).aClass318_Sub1_Sub4_4406
                    = class318_sub1_sub4;
            ((Class357) class357).aClass318_Sub1_Sub4_4403
                    = class318_sub1_sub4_4_;
            int i_5_ = aa_Sub1.aSArray5191 == Class332.aSArray4142 ? 1 : 0;
            if (class318_sub1_sub4.method2376(-109)) {
                if (class318_sub1_sub4.method2377((byte) 122)) {
                    ((Class318_Sub1) class318_sub1_sub4).aClass318_Sub1_6379
                            = Class250.aClass318_Sub1Array3226[i_5_];
                    Class250.aClass318_Sub1Array3226[i_5_]
                            = class318_sub1_sub4;
                } else {
                    ((Class318_Sub1) class318_sub1_sub4).aClass318_Sub1_6379
                            = Class348.aClass318_Sub1Array4293[i_5_];
                    Class348.aClass318_Sub1Array4293[i_5_]
                            = class318_sub1_sub4;
                    Class348_Sub16_Sub2.aBoolean8870 = true;
                }
            } else {
                ((Class318_Sub1) class318_sub1_sub4).aClass318_Sub1_6379
                        = Class115.aClass318_Sub1Array1754[i_5_];
                Class115.aClass318_Sub1Array1754[i_5_] = class318_sub1_sub4;
            }
            if (class318_sub1_sub4_4_ != null) {
                if (class318_sub1_sub4_4_.method2376(-118)) {
                    if (class318_sub1_sub4_4_.method2377((byte) 122)) {
                        ((Class318_Sub1) class318_sub1_sub4_4_)
                                .aClass318_Sub1_6379
                                = Class250.aClass318_Sub1Array3226[i_5_];
                        Class250.aClass318_Sub1Array3226[i_5_]
                                = class318_sub1_sub4_4_;
                    } else {
                        ((Class318_Sub1) class318_sub1_sub4_4_)
                                .aClass318_Sub1_6379
                                = Class348.aClass318_Sub1Array4293[i_5_];
                        Class348.aClass318_Sub1Array4293[i_5_]
                                = class318_sub1_sub4_4_;
                        Class348_Sub16_Sub2.aBoolean8870 = true;
                    }
                } else {
                    ((Class318_Sub1) class318_sub1_sub4_4_).aClass318_Sub1_6379
                            = Class115.aClass318_Sub1Array1754[i_5_];
                    Class115.aClass318_Sub1Array1754[i_5_]
                            = class318_sub1_sub4_4_;
                }
            }
        }
    }

    static final int method3255(int i, byte[] is, int i_6_, boolean bool,
                                String string, int i_7_) {
        try {
            anInt9666++;
            if (bool != false)
                return -119;
            int i_8_ = -i + i_6_;
            for (int i_9_ = 0; i_8_ > i_9_; i_9_++) {
                int i_10_ = string.charAt(i_9_ + i);
                if ((i_10_ ^ 0xffffffff) < -1 && (i_10_ ^ 0xffffffff) > -129
                        || i_10_ >= 160 && i_10_ <= 255)
                    is[i_7_ + i_9_] = (byte) i_10_;
                else if ((i_10_ ^ 0xffffffff) == -8365)
                    is[i_9_ + i_7_] = (byte) -128;
                else if ((i_10_ ^ 0xffffffff) == -8219)
                    is[i_9_ + i_7_] = (byte) -126;
                else if (i_10_ == 402)
                    is[i_7_ - -i_9_] = (byte) -125;
                else if (i_10_ != 8222) {
                    if ((i_10_ ^ 0xffffffff) != -8231) {
                        if (i_10_ != 8224) {
                            if ((i_10_ ^ 0xffffffff) == -8226)
                                is[i_9_ + i_7_] = (byte) -121;
                            else if (i_10_ == 710)
                                is[i_7_ + i_9_] = (byte) -120;
                            else if (i_10_ == 8240)
                                is[i_7_ - -i_9_] = (byte) -119;
                            else if (i_10_ != 352) {
                                if (i_10_ == 8249)
                                    is[i_9_ + i_7_] = (byte) -117;
                                else if ((i_10_ ^ 0xffffffff) == -339)
                                    is[i_9_ + i_7_] = (byte) -116;
                                else if (i_10_ == 381)
                                    is[i_7_ + i_9_] = (byte) -114;
                                else if ((i_10_ ^ 0xffffffff) != -8217) {
                                    if (i_10_ == 8217)
                                        is[i_7_ - -i_9_] = (byte) -110;
                                    else if (i_10_ == 8220)
                                        is[i_7_ + i_9_] = (byte) -109;
                                    else if ((i_10_ ^ 0xffffffff) == -8222)
                                        is[i_7_ + i_9_] = (byte) -108;
                                    else if (i_10_ == 8226)
                                        is[i_7_ + i_9_] = (byte) -107;
                                    else if (i_10_ != 8211) {
                                        if (i_10_ == 8212)
                                            is[i_7_ + i_9_] = (byte) -105;
                                        else if ((i_10_ ^ 0xffffffff)
                                                != -733) {
                                            if ((i_10_ ^ 0xffffffff)
                                                    != -8483) {
                                                if (i_10_ != 353) {
                                                    if (i_10_ == 8250)
                                                        is[i_7_ - -i_9_]
                                                                = (byte) -101;
                                                    else if (i_10_ == 339)
                                                        is[i_7_ - -i_9_]
                                                                = (byte) -100;
                                                    else if (i_10_ != 382) {
                                                        if ((i_10_
                                                                ^ 0xffffffff)
                                                                != -377)
                                                            is[i_9_ + i_7_]
                                                                    = (byte) 63;
                                                        else
                                                            is[i_7_ + i_9_]
                                                                    = (byte) -97;
                                                    } else
                                                        is[i_7_ - -i_9_]
                                                                = (byte) -98;
                                                } else
                                                    is[i_9_ + i_7_]
                                                            = (byte) -102;
                                            } else
                                                is[i_9_ + i_7_] = (byte) -103;
                                        } else
                                            is[i_9_ + i_7_] = (byte) -104;
                                    } else
                                        is[i_7_ - -i_9_] = (byte) -106;
                                } else
                                    is[i_7_ + i_9_] = (byte) -111;
                            } else
                                is[i_7_ - -i_9_] = (byte) -118;
                        } else
                            is[i_9_ + i_7_] = (byte) -122;
                    } else
                        is[i_7_ - -i_9_] = (byte) -123;
                } else
                    is[i_7_ - -i_9_] = (byte) -124;
            }
            return i_8_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ffa.E(" + i + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_6_ + ',' + bool + ','
                            + (string != null ? "{...}"
                            : "null")
                            + ',' + i_7_ + ')'));
        }
    }

    static final int method3256(int i) {
        anInt9662++;
        if (Class348_Sub1.anIntArray6547 == null)
            return 0;
        if (i != 2)
            aClass21_9661 = null;
        return 2 * Class348_Sub1.anIntArray6547.length;
    }

    abstract int method3257(int i);

    public Class348_Sub42_Sub16() {
        /* empty */
    }

    static final float[] method3258(int i, int i_11_, float[] fs) {
        anInt9668++;
        float[] fs_12_ = new float[i_11_];
        Class214.method1574(fs, 0, fs_12_, i, i_11_);
        return fs_12_;
    }

    abstract byte[] method3259(int i);

    static {
        aClass21_9661 = new Class21();
    }
}
