/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

abstract class Class14 implements Interface18 {
    Class377 aClass377_5082;
    static int anInt5083;
    Class304 aClass304_5084;
    static int anInt5085;
    static int anInt5086;
    static int anInt5087;
    Class68 aClass68_5088;
    static long aLong5089 = -1L;
    private int anInt5090;
    static int[] anIntArray5091;
    static int anInt5092;
    int anInt5093;
    static int anInt5094;
    static int anInt5095;
    private int anInt5096;
    static int anInt5097;
    static int anInt5098;
    private boolean aBoolean5099;
    static int anInt5100;
    private Class209 aClass209_5101 = Class71.aClass209_1212;
    static int anInt5102;
    static int anInt5103;
    static int anInt5104;

    public final void method63(byte i) {
        anInt5104++;
        int i_0_ = ((Class14) this).aClass377_5082.method3877((byte) -126);
        if (i > -21)
            ((Class14) this).aClass377_5082 = null;
        int i_1_ = (((Class377) ((Class14) this).aClass377_5082).anIntArray9927
                [i_0_]);
        if ((i_1_ ^ 0xffffffff) != (((Class14) this).anInt5093 ^ 0xffffffff)) {
            if ((i_1_ ^ 0xffffffff) != -1) {
                OpenGL.glBindTexture(i_1_, 0);
                OpenGL.glDisable(i_1_);
            }
            OpenGL.glEnable(((Class14) this).anInt5093);
            ((Class377) ((Class14) this).aClass377_5082).anIntArray9927[i_0_]
                    = ((Class14) this).anInt5093;
        }
        OpenGL.glBindTexture(((Class14) this).anInt5093, anInt5096);
    }

    final int method228(int i) {
        anInt5085++;
        if (Class68.aClass68_1183 != ((Class14) this).aClass68_5088) {
            if (Class68.aClass68_1186 == ((Class14) this).aClass68_5088) {
                if (((Class14) this).aClass304_5084
                        == Class348_Sub45.aClass304_7103)
                    return 34843;
                if (Class108.aClass304_1662 == ((Class14) this).aClass304_5084)
                    return 34842;
                if (((Class14) this).aClass304_5084
                        != Class348_Sub40_Sub38.aClass304_9471) {
                    if (((Class14) this).aClass304_5084
                            != Class348_Sub40_Sub22.aClass304_9303) {
                        if (Class191.aClass304_2571
                                != ((Class14) this).aClass304_5084) {
                            if (((Class14) this).aClass304_5084
                                    == Class318.aClass304_3977)
                                return 6145;
                        } else
                            return 34847;
                    } else
                        return 34846;
                } else
                    return 34844;
            } else if (((Class14) this).aClass68_5088
                    == Class68.aClass68_1187) {
                if (Class348_Sub45.aClass304_7103
                        != ((Class14) this).aClass304_5084) {
                    if (((Class14) this).aClass304_5084
                            == Class108.aClass304_1662)
                        return 34836;
                    if (((Class14) this).aClass304_5084
                            != Class348_Sub40_Sub38.aClass304_9471) {
                        if (Class348_Sub40_Sub22.aClass304_9303
                                == ((Class14) this).aClass304_5084)
                            return 34840;
                        if (Class191.aClass304_2571
                                != ((Class14) this).aClass304_5084) {
                            if (Class318.aClass304_3977
                                    == ((Class14) this).aClass304_5084)
                                return 6145;
                        } else
                            return 34841;
                    } else
                        return 34838;
                } else
                    return 34837;
            }
        } else if (((Class14) this).aClass304_5084
                != Class348_Sub45.aClass304_7103) {
            if (((Class14) this).aClass304_5084 != Class108.aClass304_1662) {
                if (((Class14) this).aClass304_5084
                        != Class348_Sub40_Sub38.aClass304_9471) {
                    if (Class348_Sub40_Sub22.aClass304_9303
                            == ((Class14) this).aClass304_5084)
                        return 6409;
                    if (((Class14) this).aClass304_5084
                            == Class191.aClass304_2571)
                        return 6410;
                    if (((Class14) this).aClass304_5084
                            == Class318.aClass304_3977)
                        return 6145;
                } else
                    return 6406;
            } else
                return 6408;
        } else
            return 6407;
        if (i <= 104)
            method238(-54, 105, 2, null, 120);
        throw new IllegalStateException();
    }

    private final void method229(boolean bool) {
        ((Class14) this).aClass377_5082.method3850((byte) 107, this);
        anInt5083++;
        if (aClass209_5101 != Class71.aClass209_1212) {
            OpenGL.glTexParameteri(((Class14) this).anInt5093, 10241,
                    !aBoolean5099 ? 9728 : 9984);
            OpenGL.glTexParameteri(((Class14) this).anInt5093, 10240, 9728);
        } else {
            OpenGL.glTexParameteri(((Class14) this).anInt5093, 10241,
                    !aBoolean5099 ? 9729 : 9987);
            OpenGL.glTexParameteri(((Class14) this).anInt5093, 10240, 9729);
        }
        if (bool != true)
            method232(null, (byte) 106, true, 70);
    }

    final void method230(int i, int i_2_, byte[] is, int i_3_, int i_4_) {
        anInt5100++;
        if (i_2_ > 0 && !Class192.method1436(66, i_2_))
            throw new IllegalArgumentException("");
        if ((i_3_ ^ 0xffffffff) < -1 && !Class192.method1436(i ^ 0x1cb6, i_3_))
            throw new IllegalArgumentException("");
        int i_5_ = ((Class304) ((Class14) this).aClass304_5084).anInt3850;
        int i_6_ = 0;
        int i_7_ = i_2_ < i_3_ ? i_2_ : i_3_;
        int i_8_ = i_2_ >> -405349983;
        if (i != 7365)
            method236(0, (byte) -113);
        int i_9_ = i_3_ >> 1617553025;
        byte[] is_10_ = is;
        byte[] is_11_ = new byte[i_9_ * (i_8_ * i_5_)];
        for (; ; ) {
            OpenGL.glTexImage2Dub
                    (i_4_, i_6_, method228(108), i_2_, i_3_, 0,
                            Class348_Sub40_Sub3
                                    .method3055(i + -7265, ((Class14) this).aClass304_5084),
                            5121, is_10_, 0);
            if (i_7_ <= 1)
                break;
            int i_12_ = i_2_ * i_5_;
            for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff);
                 i_13_++) {
                int i_14_ = i_13_;
                int i_15_ = i_13_;
                int i_16_ = i_15_ - -i_12_;
                for (int i_17_ = 0; i_17_ < i_9_; i_17_++) {
                    for (int i_18_ = 0; i_8_ > i_18_; i_18_++) {
                        int i_19_ = is_10_[i_15_];
                        i_15_ += i_5_;
                        i_19_ += is_10_[i_15_];
                        i_19_ += is_10_[i_16_];
                        i_15_ += i_5_;
                        i_16_ += i_5_;
                        i_19_ += is_10_[i_16_];
                        is_11_[i_14_] = (byte) (i_19_ >> 2039303106);
                        i_16_ += i_5_;
                        i_14_ += i_5_;
                    }
                    i_15_ += i_12_;
                    i_16_ += i_12_;
                }
            }
            byte[] is_20_ = is_11_;
            is_11_ = is_10_;
            i_2_ = i_8_;
            i_3_ = i_9_;
            is_10_ = is_20_;
            i_8_ >>= 1;
            i_9_ >>= 1;
            i_6_++;
            i_7_ >>= 1;
        }
    }

    private final int method231(int i) {
        anInt5095++;
        int i_21_
                = (anInt5090
                * (((Class68) ((Class14) this).aClass68_5088).anInt1178
                * ((Class304) ((Class14) this).aClass304_5084).anInt3850));
        if (i >= -105)
            method232(null, (byte) 118, true, 16);
        if (aBoolean5099)
            return 4 * i_21_ / 3;
        return i_21_;
    }

    static final Class324 method232(ha var_ha, byte i, boolean bool,
                                    int i_22_) {
        if (i != -53)
            method237(true);
        anInt5094++;
        Class352 class352
                = Class239_Sub3.method1734(i_22_, var_ha, (byte) 55, bool);
        if (class352 == null)
            return null;
        return ((Class352) class352).aClass324_4332;
    }

    final void method233(int i, int i_23_, int[] is, int i_24_, int i_25_) {
        anInt5092++;
        if ((i ^ 0xffffffff) < -1 && !Class192.method1436(-43, i))
            throw new IllegalArgumentException("");
        if ((i_23_ ^ 0xffffffff) < -1
                && !Class192.method1436(i_25_ ^ ~0xd2, i_23_))
            throw new IllegalArgumentException("");
        if (Class108.aClass304_1662 != ((Class14) this).aClass304_5084)
            throw new IllegalArgumentException("");
        int i_26_ = 0;
        int i_27_ = (i_23_ ^ 0xffffffff) >= (i ^ 0xffffffff) ? i_23_ : i;
        int i_28_ = i >> 1089811809;
        int i_29_ = i_23_ >> -264056511;
        int[] is_30_ = is;
        int[] is_31_ = new int[i_29_ * i_28_];
        if (i_25_ != 255)
            aBoolean5099 = true;
        for (; ; ) {
            OpenGL.glTexImage2Di(i_24_, i_26_, method228(112), i, i_23_, 0,
                    32993,
                    (((Class377) ((Class14) this).aClass377_5082)
                            .anInt9918),
                    is_30_, 0);
            if (i_27_ <= 1)
                break;
            int i_32_ = 0;
            int i_33_ = 0;
            int i_34_ = i_33_ + i;
            for (int i_35_ = 0; i_29_ > i_35_; i_35_++) {
                for (int i_36_ = 0;
                     (i_36_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff); i_36_++) {
                    int i_37_ = is_30_[i_33_++];
                    int i_38_ = is_30_[i_33_++];
                    int i_39_ = is_30_[i_34_++];
                    int i_40_ = i_37_ >> 2144123728 & 0xff;
                    int i_41_ = 0xff & i_37_ >> 2031441784;
                    int i_42_ = 0xff & i_37_;
                    int i_43_ = (i_37_ & 0xff58) >> -370758264;
                    int i_44_ = is_30_[i_34_++];
                    i_42_ += i_38_ & 0xff;
                    i_40_ += (0xffba54 & i_38_) >> 1504541648;
                    i_41_ += 0xff & i_38_ >> -1964777448;
                    i_43_ += 0xff & i_38_ >> -471235224;
                    i_41_ += i_39_ >> -1881110568 & 0xff;
                    i_42_ += i_39_ & 0xff;
                    i_43_ += (0xff9c & i_39_) >> -1849973624;
                    i_40_ += i_39_ >> 1897894960 & 0xff;
                    i_41_ += i_44_ >> -467438504 & 0xff;
                    i_40_ += 0xff & i_44_ >> -1408161200;
                    i_43_ += 0xff & i_44_ >> 1265083336;
                    i_42_ += i_44_ & 0xff;
                    is_31_[i_32_++]
                            = (Class273.method2057
                            ((Class273.method2057
                                            (Class139.method1166(i_43_ << -1540493786, 65280),
                                                    Class273.method2057((Class139.method1166(i_41_,
                                                            1020)
                                                                    << -1408675754),
                                                            (Class139.method1166(1020,
                                                                    i_40_)
                                                                    << 1588792334)))),
                                    Class139.method1166(255, i_42_ >> -1111915006)));
                }
                i_33_ += i;
                i_34_ += i;
            }
            int[] is_45_ = is_31_;
            is_31_ = is_30_;
            i_23_ = i_29_;
            is_30_ = is_45_;
            i = i_28_;
            i_28_ >>= 1;
            i_26_++;
            i_27_ >>= 1;
            i_29_ >>= 1;
        }
    }

    private final void method234(int i) {
        if (i == 1617553025) {
            if ((anInt5096 ^ 0xffffffff) < -1) {
                ((Class14) this).aClass377_5082
                        .method3967(method231(-109), (byte) 59, anInt5096);
                anInt5096 = 0;
            }
            anInt5097++;
        }
    }

    static final void method235(int i, byte i_46_) {
        anInt5087++;
        if ((i ^ 0xffffffff) != 0 && Class163.aBooleanArray2162[i]) {
            Class229.aClass45_2978.method411(i, -120);
            Class348_Sub40_Sub33.aClass46ArrayArray9427[i] = null;
            Class369_Sub2.aClass46ArrayArray8584[i] = null;
            if (i_46_ <= -94)
                Class163.aBooleanArray2162[i] = false;
        }
    }

    private final void method236(int i, byte i_47_) {
        anInt5098++;
        ((ha_Sub3) ((Class14) this).aClass377_5082).anInt8062 -= i;
        ((ha_Sub3) ((Class14) this).aClass377_5082).anInt8062
                += method231(-119);
        if (i_47_ >= -124)
            aBoolean5099 = false;
    }

    public static void method237(boolean bool) {
        if (bool != false)
            aLong5089 = -54L;
        anIntArray5091 = null;
    }

    public final void method64(Class209 class209, int i) {
        anInt5086++;
        if (i != -22095)
            ((Class14) this).aClass304_5084 = null;
        if (class209 != aClass209_5101) {
            aClass209_5101 = class209;
            method229(true);
        }
    }

    final void method238(int i, int i_48_, int i_49_, float[] fs, int i_50_) {
        anInt5102++;
        if (i_49_ > 0 && !Class192.method1436(100, i_49_))
            throw new IllegalArgumentException("");
        if ((i_50_ ^ 0xffffffff) < -1
                && !Class192.method1436(i_48_ + 109, i_50_))
            throw new IllegalArgumentException("");
        int i_51_ = ((Class304) ((Class14) this).aClass304_5084).anInt3850;
        int i_52_ = 0;
        if (i_48_ != 1)
            method228(107);
        int i_53_
                = (i_49_ ^ 0xffffffff) > (i_50_ ^ 0xffffffff) ? i_49_ : i_50_;
        int i_54_ = i_49_ >> -1187902719;
        int i_55_ = i_50_ >> 1286076865;
        float[] fs_56_ = fs;
        float[] fs_57_ = new float[i_54_ * (i_55_ * i_51_)];
        for (; ; ) {
            OpenGL.glTexImage2Df(i, i_52_, method228(123), i_49_, i_50_, 0,
                    (Class348_Sub40_Sub3.method3055
                            (124, ((Class14) this).aClass304_5084)),
                    5126, fs_56_, 0);
            if (i_53_ <= 1)
                break;
            int i_58_ = i_49_ * i_51_;
            for (int i_59_ = 0; i_51_ > i_59_; i_59_++) {
                int i_60_ = i_59_;
                int i_61_ = i_59_;
                int i_62_ = i_61_ + i_58_;
                for (int i_63_ = 0; i_63_ < i_55_; i_63_++) {
                    for (int i_64_ = 0; i_54_ > i_64_; i_64_++) {
                        float f = fs_56_[i_61_];
                        i_61_ += i_51_;
                        f += fs_56_[i_61_];
                        f += fs_56_[i_62_];
                        i_61_ += i_51_;
                        i_62_ += i_51_;
                        f += fs_56_[i_62_];
                        i_62_ += i_51_;
                        fs_57_[i_60_] = 0.25F * f;
                        i_60_ += i_51_;
                    }
                    i_62_ += i_58_;
                    i_61_ += i_58_;
                }
            }
            float[] fs_65_ = fs_57_;
            fs_57_ = fs_56_;
            i_49_ = i_54_;
            i_50_ = i_55_;
            fs_56_ = fs_65_;
            i_54_ >>= 1;
            i_55_ >>= 1;
            i_53_ >>= 1;
            i_52_++;
        }
    }

    protected final void finalize() throws Throwable {
        anInt5103++;
        method234(1617553025);
        super.finalize();
    }

    Class14(Class377 class377, int i, Class304 class304, Class68 class68,
            int i_66_, boolean bool) {
        try {
            anInt5090 = i_66_;
            ((Class14) this).aClass377_5082 = class377;
            ((Class14) this).aClass304_5084 = class304;
            ((Class14) this).aClass68_5088 = class68;
            aBoolean5099 = bool;
            ((Class14) this).anInt5093 = i;
            OpenGL.glGenTextures(1, Class141.anIntArray1975, 0);
            anInt5096 = Class141.anIntArray1975[0];
            method229(true);
            method236(0, (byte) -126);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("hda.<init>(" + (class377 != null ? "{...}" : "null")
                                    + ',' + i + ',' + (class304 != null ? "{...}" : "null")
                                    + ',' + (class68 != null ? "{...}" : "null") + ','
                                    + i_66_ + ',' + bool + ')'));
        }
    }
}
