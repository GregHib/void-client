/* Class318_Sub1_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class318_Sub1_Sub3_Sub3 extends Class318_Sub1_Sub3 {
    static int anInt10200;
    int anInt10201;
    int anInt10202;
    int anInt10203;
    private static short[][] aShortArrayArray10204;
    static int anInt10205;
    byte aByte10206;
    int anInt10207;
    int anInt10208;
    static Class170 aClass170_10209;
    int anInt10210;
    int anInt10211;
    static int anInt10212;
    boolean aBoolean10213 = false;
    static int anInt10214;
    int anInt10215;
    static int anInt10216;
    Class264 aClass264_10217;
    int anInt10218;
    int[] anIntArray10219;
    int anInt10220;
    static boolean aBoolean10221;
    private byte aByte10222;
    int anInt10223;
    int anInt10224;
    int anInt10225;
    boolean aBoolean10226;
    int anInt10227;
    static int anInt10228;
    int[] anIntArray10229;
    int anInt10230;
    int anInt10231;
    int anInt10232;
    static int anInt10233;
    int anInt10234;
    static int anInt10235;
    int[] anIntArray10236 = null;
    int anInt10237;
    static boolean aBoolean10238;
    int anInt10239;
    int anInt10240;
    int anInt10241;
    int[] anIntArray10242;
    int anInt10243;
    int anInt10244;
    int anInt10245;
    private static short[][] aShortArrayArray10246 = {new short[0], new short[0], new short[0], new short[0], new short[0]};
    int anInt10247;
    int anInt10248;
    static int anInt10249;
    int anInt10250;
    static int anInt10251;
    int anInt10252;
    static short[][][] aShortArrayArrayArray10253;
    static int anInt10254;
    byte aByte10255;
    static int anInt10256;
    static int anInt10257;
    private static short[][] aShortArrayArray10258;
    int[] anIntArray10259;
    int anInt10260;
    int anInt10261;
    static int anInt10262;
    static int anInt10263;
    int anInt10264;
    int anInt10265;
    static int[] anIntArray10266 = new int[256];
    int anInt10267;
    int anInt10268;
    int anInt10269;
    byte aByte10270;
    int anInt10271;
    static int anInt10272;
    int anInt10273;
    int anInt10274;
    int anInt10275;
    int anInt10276;
    static int anInt10277;
    int anInt10278;
    byte aByte10279;
    private int anInt10280;
    static int anInt10281;
    int anInt10282;
    int anInt10283;
    int[] anIntArray10284;
    int anInt10285;
    int anInt10286;
    int anInt10287;
    int anInt10288;
    int anInt10289;
    int anInt10290;
    int anInt10291;
    String aString10292;
    int anInt10293;
    int anInt10294;
    int anInt10295;
    int[] anIntArray10296;
    static int anInt10297;
    static int anInt10298;
    static int anInt10299;
    int anInt10300;
    int anInt10301;
    int anInt10302;
    int[] anIntArray10303;
    int[] anIntArray10304;
    int anInt10305;
    int anInt10306;
    static int anInt10307;
    Class182[] aClass182Array10308;
    boolean aBoolean10309;
    int anInt10310;
    static int anInt10311;
    int anInt10312;
    static int anInt10313;
    int anInt10314;
    private final Class264 aClass264_10315;
    private final Class264 aClass264_10316;
    int[] anIntArray10317;
    boolean aBoolean10318;
    int anInt10319;
    int[] anIntArray10320;
    byte[] aByteArray10321;
    int anInt10322;
    Class64[] aClass64Array10323;
    boolean aBoolean10324;
    int anInt10325;
    int anInt10326;
    Class318_Sub10 aClass318_Sub10_10327;

    static final void method2420(int i, int i_0_) {
        if (i_0_ != -1) aBoolean10238 = false;
        Class14_Sub3.anInt8628 = i;
        anInt10272++;
        Class358.aClass60_4417.method590(0);
    }

    abstract int method2421(byte i);

    final Class225 method2422(byte i) {
        if (i != 72) method2438(-88, 93, -127, 68, 7, -76, 116, (byte) 122);
        anInt10249++;
        int i_1_ = method2421((byte) 127);
        if (i_1_ != -1) return Class64_Sub3.aClass261_5558.method1983(i_1_, 32);
        return Class225.aClass225_2931;
    }

    final void method2409(byte i) {
        anInt10307++;
        int i_2_ = 240 + (-1 + anInt10280 << 8);
        this.aShort8747 = (short) (i_2_ + this.anInt6388 >> 9);
        this.aShort8750 = (short) (-i_2_ + this.anInt6388 >> 9);
        this.aShort8751 = (short) (i_2_ + this.anInt6377 >> 9);
        if (i >= -109) aShortArrayArray10258 = null;
        this.aShort8743 = (short) (this.anInt6377 + -i_2_ >> 9);
    }

    final boolean method2423(int i, int i_3_, int i_4_) {
        anInt10251++;
        if (this.anIntArray10296 == null) {
            if (i_4_ == -1) return true;
            this.anIntArray10296 = new int[12];
            for (int i_5_ = 0; i_5_ < 12; i_5_++)
                this.anIntArray10296[i_5_] = -1;
        }
        int i_6_ = 3 / ((-22 - i) / 58);
        Class225 class225 = method2422((byte) 72);
        int i_7_ = 256;
        if (class225.anIntArray2907 != null && class225.anIntArray2907[i_3_] > 0) i_7_ = class225.anIntArray2907[i_3_];
        if (i_4_ == -1) {
            if (this.anIntArray10296[i_3_] == -1) return true;
            int i_8_ = this.aClass264_10217.method2019((byte) -41);
            int i_9_ = this.anIntArray10296[i_3_];
            int i_10_ = -i_9_ + i_8_;
            if (i_10_ >= -i_7_ && i_10_ <= i_7_) {
                this.anIntArray10296[i_3_] = -1;
                for (int i_11_ = 0; i_11_ < 12; i_11_++) {
                    if (this.anIntArray10296[i_11_] != -1) return true;
                }
                this.anIntArray10296 = null;
                return true;
            }
            if (i_10_ > 0 && i_10_ <= 8192 || i_10_ <= -8192) this.anIntArray10296[i_3_] = Class139.method1166(16383, i_9_ - -i_7_);
            else this.anIntArray10296[i_3_] = Class139.method1166(-i_7_ + i_9_, 16383);
            return false;
        }
        if (this.anIntArray10296[i_3_] == -1) this.anIntArray10296[i_3_] = this.aClass264_10217.method2019((byte) -104);
        int i_12_ = this.anIntArray10296[i_3_];
        int i_13_ = -i_12_ + i_4_;
        if (i_13_ >= -i_7_ && i_7_ >= i_13_) {
            this.anIntArray10296[i_3_] = i_4_;
            return true;
        }
        if ((i_13_ <= 0 || i_13_ > 8192) && i_13_ > -8192) this.anIntArray10296[i_3_] = Class139.method1166(16383, i_12_ - i_7_);
        else this.anIntArray10296[i_3_] = Class139.method1166(16383, i_12_ - -i_7_);
        return false;
    }

    final void method2424(int i, int i_14_, int i_15_, int i_16_, byte i_17_, int i_18_) {
        anInt10263++;
        int i_19_ = ((this.aShort8743 + this.aShort8751) >> 1);
        int i_20_ = ((this.aShort8750 + this.aShort8747) >> 1);
        int i_21_ = Class70.anIntArray1207[i];
        int i_22_ = Class70.anIntArray1204[i];
        int i_23_ = -i_14_ / 2;
        int i_24_ = -i_16_ / 2;
        int i_25_ = i_23_ * i_22_ + i_24_ * i_21_ >> 14;
        int i_26_ = -(i_21_ * i_23_) + i_24_ * i_22_ >> 14;
        int i_27_ = Class171.method1321((byte) -125, i_25_ + this.anInt6377, i_26_ + this.anInt6388, i_19_, this.aByte6381, i_20_);
        int i_28_ = i_14_ / 2;
        int i_29_ = -i_16_ / 2;
        int i_30_ = i_28_ * i_22_ + i_21_ * i_29_ >> 14;
        int i_31_ = -(i_21_ * i_28_) + i_29_ * i_22_ >> 14;
        int i_32_ = Class171.method1321((byte) -119, i_30_ + this.anInt6377, this.anInt6388 + i_31_, i_19_, this.aByte6381, i_20_);
        int i_33_ = -i_14_ / 2;
        int i_34_ = i_16_ / 2;
        int i_35_ = i_34_ * i_21_ - -(i_33_ * i_22_) >> 14;
        int i_36_ = -(i_33_ * i_21_) + i_34_ * i_22_ >> 14;
        int i_37_ = Class171.method1321((byte) 101, i_35_ + this.anInt6377, this.anInt6388 + i_36_, i_19_, this.aByte6381, i_20_);
        if (i_17_ <= 63) this.anInt10243 = -62;
        int i_38_ = i_14_ / 2;
        int i_39_ = i_16_ / 2;
        int i_40_ = i_22_ * i_38_ + i_39_ * i_21_ >> 14;
        int i_41_ = i_22_ * i_39_ + -(i_21_ * i_38_) >> 14;
        int i_42_ = Class171.method1321((byte) -114, i_40_ + this.anInt6377, this.anInt6388 + i_41_, i_19_, this.aByte6381, i_20_);
        int i_43_ = Math.min(i_32_, i_27_);
        int i_44_ = Math.min(i_37_, i_42_);
        int i_45_ = Math.min(i_42_, i_32_);
        this.anInt10302 = 0x3fff & (int) (Math.atan2(i_43_ + -i_44_, i_16_) * 2607.5945876176133);
        int i_46_ = Math.min(i_27_, i_37_);
        this.anInt10208 = 0x3fff & (int) (2607.5945876176133 * Math.atan2(i_46_ - i_45_, i_14_));
        if (this.anInt10302 != 0 && i_18_ != 0) {
            int i_47_ = -i_18_ + 16384;
            if (this.anInt10302 <= 8192) {
                if (this.anInt10302 > i_18_) this.anInt10302 = i_18_;
            } else if (this.anInt10302 < i_47_) this.anInt10302 = i_47_;
        }
        if (this.anInt10208 != 0 && i_15_ != 0) {
            int i_48_ = -i_15_ + 16384;
            if (this.anInt10208 > 8192) {
                if (i_48_ > this.anInt10208) this.anInt10208 = i_48_;
            } else if (this.anInt10208 > i_15_) this.anInt10208 = i_15_;
        }
        this.anInt10252 = i_27_ - -i_42_;
        if (i_32_ - -i_37_ < this.anInt10252) this.anInt10252 = i_32_ - -i_37_;
        this.anInt10252 = (-this.anInt6382 + (this.anInt10252 >> 1));
    }

    abstract int method2425(int i);

    int method2426(int i) {
        anInt10214++;
        Class225 class225 = method2422((byte) 72);
        if (class225.anInt2928 != -1) return class225.anInt2928;
        if (this.anInt10207 == -32768) return 200;
        if (i != 200) method2377((byte) -40);
        return -this.anInt10207;
    }

    final void method2427(int i) {
        anInt10313++;
        if (i < 13) method2429(6);
        this.anInt10319 = 0;
        this.anInt10322 = 0;
    }

    public Class318_Sub1_Sub3_Sub3() {
        super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        this.anInt10201 = 0;
        this.anInt10230 = 0;
        this.anInt10234 = 0;
        this.anInt10250 = -1;
        this.anInt10268 = -1;
        this.anInt10240 = 0;
        this.anInt10264 = 100;
        this.anInt10274 = 0;
        this.anInt10215 = -1;
        this.anInt10247 = 0;
        this.anInt10269 = -1;
        this.anInt10224 = 0;
        this.anIntArray10229 = new int[Class132.anInt1905];
        this.anInt10278 = -1;
        this.anInt10265 = 0;
        this.anInt10244 = -1;
        this.anIntArray10259 = new int[Class132.anInt1905];
        this.anInt10218 = 0;
        this.anInt10287 = -1000;
        this.anInt10291 = -1;
        this.anInt10261 = 0;
        aByte10222 = (byte) 0;
        this.anInt10276 = -1;
        this.anInt10285 = 0;
        this.aString10292 = null;
        this.anInt10289 = -1;
        this.aByte10279 = (byte) 0;
        this.anInt10203 = 0;
        anInt10280 = 1;
        this.aBoolean10226 = false;
        this.anInt10294 = 0;
        this.anInt10248 = -1;
        this.anInt10275 = -1;
        this.anIntArray10219 = new int[Class132.anInt1905];
        this.anInt10245 = 0;
        this.anIntArray10303 = new int[Class132.anInt1905];
        this.anInt10273 = 0;
        this.anInt10306 = 0;
        this.anInt10243 = 0;
        this.anInt10305 = 0;
        this.anInt10267 = 0;
        this.anInt10286 = -1;
        this.anInt10283 = -1;
        this.aBoolean10309 = true;
        this.anInt10232 = 0;
        this.anInt10310 = 256;
        this.aClass182Array10308 = new Class182[12];
        this.anInt10312 = -1;
        this.anInt10207 = -32768;
        this.anIntArray10304 = new int[Class132.anInt1905];
        this.anIntArray10284 = new int[Class132.anInt1905];
        this.anInt10223 = -1000;
        this.aClass264_10217 = new Class264();
        aClass264_10315 = new Class264();
        aClass264_10316 = new Class264();
        this.aBoolean10318 = false;
        this.anIntArray10317 = new int[10];
        this.anInt10322 = 0;
        this.aBoolean10324 = false;
        this.aByteArray10321 = new byte[10];
        this.anInt10325 = 0;
        this.aClass64Array10323 = new Class64[3];
        this.anInt10319 = 0;
        this.anIntArray10320 = new int[10];
        this.anInt10326 = 0;
    }

    final int method2428(int i) {
        anInt10200++;
        Class225 class225 = method2422((byte) 72);
        if (i != 2) method2376(11);
        int i_49_ = (this.aClass264_10217.anInt3370);
        boolean bool;
        if (class225.anInt2948 == 0) bool = (this.aClass264_10217.method2020(this.anInt10310, this.anInt10282, this.anInt10310, (byte) -113));
        else bool = (this.aClass264_10217.method2020(class225.anInt2917, this.anInt10282, class225.anInt2948, (byte) -107));
        int i_50_ = -i_49_ + this.aClass264_10217.anInt3370;
        if (i_50_ == 0) {
            this.anInt10247 = 0;
            this.aClass264_10217.method2016(15615, this.anInt10282);
        } else this.anInt10247++;
        if (bool) {
            if (class225.anInt2901 != 0) {
                if (i_50_ <= 0) aClass264_10315.method2020(class225.anInt2935, -(class225.anInt2950), class225.anInt2901, (byte) -47);
                else aClass264_10315.method2020(class225.anInt2935, class225.anInt2950, class225.anInt2901, (byte) -77);
            }
            if (class225.anInt2936 != 0) aClass264_10316.method2020(class225.anInt2904, class225.anInt2926, class225.anInt2936, (byte) -127);
        } else {
            if (class225.anInt2901 == 0) aClass264_10315.method2016(15615, 0);
            else aClass264_10315.method2020(class225.anInt2935, 0, class225.anInt2901, (byte) -26);
            if (class225.anInt2936 != 0) aClass264_10316.method2020(class225.anInt2904, 0, class225.anInt2936, (byte) -66);
            else aClass264_10316.method2016(15615, 0);
        }
        return i_50_;
    }

    public static void method2429(int i) {
        aClass170_10209 = null;
        aShortArrayArray10246 = null;
        anIntArray10266 = null;
        aShortArrayArray10204 = null;
        aShortArrayArrayArray10253 = null;
        if (i > -101) aShortArrayArray10246 = null;
        aShortArrayArray10258 = null;
    }

    final void method2430(int[] is, int[] is_51_, int i) {
        do {
            try {
                anInt10233++;
                if (this.anIntArray10242 != null || is_51_ == null) {
                    if (is_51_ == null) {
                        this.anIntArray10242 = null;
                        break;
                    }
                } else this.anIntArray10242 = new int[12];
                for (int i_52_ = 0; i_52_ < (this.anIntArray10242).length; i_52_++)
                    this.anIntArray10242[i_52_] = -1;
                for (int i_53_ = 0; i_53_ < is_51_.length; i_53_++) {
                    int i_54_ = is[i_53_];
                    for (int i_55_ = 0; i_55_ < (this.anIntArray10242).length; i_55_++) {
                        if ((0x1 & i_54_) != 0) this.anIntArray10242[i_55_] = is_51_[i_53_];
                        i_54_ >>= 1;
                    }
                }
                if (i < -71) break;
                this.anIntArray10236 = null;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("kda.DB(" + (is != null ? "{...}" : "null") + ',' + (is_51_ != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    static final void method2431(int i, int i_56_, Class348_Sub42_Sub13 class348_sub42_sub13, int i_57_, int i_58_, int i_59_, int i_60_, ha var_ha, int i_61_, int i_62_, int i_63_, int i_64_) {
        try {
            if (i_62_ < 111) aShortArrayArray10246 = null;
            if (i_63_ < i_57_ && i_57_ < i_58_ + i_63_ && i_60_ > i_56_ - 13 && i_60_ < 3 + i_56_) i = i_59_;
            anInt10212++;
            String string = Class348_Sub15.method2812(-44, class348_sub42_sub13);
            Class262.aClass324_3326.method2567(i_56_, string, (byte) 120, i, 0, i_63_ - -3, Class341.aClass105Array4234, Class175.anIntArray2330);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("kda.VA(" + i + ',' + i_56_ + ',' + (class348_sub42_sub13 != null ? "{...}" : "null") + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_61_ + ',' + i_62_ + ',' + i_63_ + ',' + i_64_ + ')'));
        }
    }

    final void method2432(ha var_ha, int i, Class101 class101, boolean bool, Class64[] class64s) {
        do {
            try {
                if (i == -15074) {
                    anInt10256++;
                    if (!bool) {
                        Class64 class64 = class64s[0];
                        Class64 class64_65_ = class64s[1];
                        Class64 class64_66_ = class64s[2];
                        if (class64 != null) {
                            class64.method620(class101);
                            int i_67_ = 0;
                            int i_68_ = 0;
                            int i_69_ = 0;
                            int i_70_ = 0;
                            Class129[] class129s = class64.method619();
                            Class342[] class342s = class64.method604();
                            if (class342s != null) {
                                i_70_++;
                                i_69_ += class342s.length;
                            }
                            if (class129s != null) {
                                i_67_ += class129s.length;
                                i_68_++;
                            }
                            Class129[] class129s_71_ = null;
                            Class342[] class342s_72_ = null;
                            if (class64_65_ != null) {
                                class64_65_.method620(class101);
                                class129s_71_ = class64_65_.method619();
                                class342s_72_ = class64_65_.method604();
                            }
                            if (class342s_72_ != null) {
                                i_70_++;
                                i_69_ += class342s_72_.length;
                            }
                            if (class129s_71_ != null) {
                                i_68_++;
                                i_67_ += class129s_71_.length;
                            }
                            Class129[] class129s_73_ = null;
                            Class342[] class342s_74_ = null;
                            if (class64_66_ != null) {
                                class64_66_.method620(class101);
                                class129s_73_ = class64_66_.method619();
                                class342s_74_ = class64_66_.method604();
                            }
                            if (class342s_74_ != null) {
                                i_70_++;
                                i_69_ += class342s_74_.length;
                            }
                            if (class129s_73_ != null) {
                                i_67_ += class129s_73_.length;
                                i_68_++;
                            }
                            if (((this.aClass318_Sub10_10327) == null || this.aClass318_Sub10_10327.aBoolean6470) && (i_68_ > 0 || i_70_ > 0)) this.aClass318_Sub10_10327 = Class318_Sub10.method2526((Class367_Sub11.anInt7396), true);
                            if ((this.aClass318_Sub10_10327) != null) {
                                Object object = null;
                                Class129[] class129s_75_;
                                if (i_68_ != 1) {
                                    class129s_75_ = new Class129[i_67_];
                                    int i_76_ = 0;
                                    if (class129s != null) {
                                        Class214.method1575(class129s, 0, class129s_75_, i_76_, class129s.length);
                                        i_76_ += class129s.length;
                                    }
                                    if (class129s_71_ != null) {
                                        Class214.method1575(class129s_71_, 0, class129s_75_, i_76_, class129s_71_.length);
                                        i_76_ += class129s_71_.length;
                                    }
                                    if (class129s_73_ != null) Class214.method1575(class129s_73_, 0, class129s_75_, i_76_, class129s_73_.length);
                                } else if (class129s_71_ != null) class129s_75_ = class129s_71_;
                                else if (class129s_73_ != null) class129s_75_ = class129s_73_;
                                else class129s_75_ = class129s;
                                Object object_77_ = null;
                                Class342[] class342s_78_;
                                if (i_70_ == 1) {
                                    if (class342s_72_ != null) class342s_78_ = class342s_72_;
                                    else if (class342s_74_ == null) class342s_78_ = class342s;
                                    else class342s_78_ = class342s_74_;
                                } else {
                                    class342s_78_ = new Class342[i_69_];
                                    int i_79_ = 0;
                                    if (class342s != null) {
                                        Class214.method1575(class342s, 0, class342s_78_, i_79_, class342s.length);
                                        i_79_ += class342s.length;
                                    }
                                    if (class342s_72_ != null) {
                                        Class214.method1575(class342s_72_, 0, class342s_78_, i_79_, class342s_72_.length);
                                        i_79_ += class342s_72_.length;
                                    }
                                    if (class342s_74_ != null) Class214.method1575(class342s_74_, 0, class342s_78_, i_79_, class342s_74_.length);
                                }
                                this.aClass318_Sub10_10327.method2536(var_ha, Class367_Sub11.anInt7396, class129s_75_, class342s_78_, false);
                            }
                            this.aBoolean10318 = true;
                        }
                    } else if ((this.aClass318_Sub10_10327) != null) this.aClass318_Sub10_10327.method2540(Class367_Sub11.anInt7396);
                    if (this.aClass318_Sub10_10327 == null) break;
                    this.aClass318_Sub10_10327.method2533(this.aByte6381, this.aShort8743, this.aShort8751, this.aShort8750, this.aShort8747);
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("kda.L(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + (class101 != null ? "{...}" : "null") + ',' + bool + ',' + (class64s != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    protected final void finalize() {
        if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327.method2534();
        anInt10297++;
    }

    static final void method2433() {
        if (Class65.aClass357ArrayArrayArray1148 != null) {
            for (int i = 0; i < Class65.aClass357ArrayArrayArray1148.length; i++) {
                for (int i_80_ = 0; i_80_ < Class318_Sub7.anInt6451; i_80_++) {
                    for (int i_81_ = 0; i_81_ < Class348_Sub41.anInt7054; i_81_++) {
                        if ((Class65.aClass357ArrayArrayArray1148[i][i_80_][i_81_]) != null) Class65.aClass357ArrayArrayArray1148[i][i_80_][i_81_].method3485(true);
                        Class65.aClass357ArrayArrayArray1148[i][i_80_][i_81_] = null;
                    }
                }
            }
        }
        Class65.aClass357ArrayArrayArray1148 = null;
        Class348_Sub1_Sub1.aSArray8801 = null;
        if (Class348_Sub31_Sub2.aClass357ArrayArrayArray9082 != null) {
            for (int i = 0; i < Class348_Sub31_Sub2.aClass357ArrayArrayArray9082.length; i++) {
                for (int i_82_ = 0; i_82_ < Class318_Sub7.anInt6451; i_82_++) {
                    for (int i_83_ = 0; i_83_ < Class348_Sub41.anInt7054; i_83_++) {
                        if ((Class348_Sub31_Sub2.aClass357ArrayArrayArray9082[i][i_82_][i_83_]) != null) Class348_Sub31_Sub2.aClass357ArrayArrayArray9082[i][i_82_][i_83_].method3485(true);
                        Class348_Sub31_Sub2.aClass357ArrayArrayArray9082[i][i_82_][i_83_] = null;
                    }
                }
            }
        }
        Class348_Sub31_Sub2.aClass357ArrayArrayArray9082 = null;
        Class332.aSArray4142 = null;
        Class147.aClass357ArrayArrayArray2029 = null;
        aa_Sub1.aSArray5191 = null;
        Class99.aBooleanArrayArray1572 = null;
        Class348_Sub8.aBooleanArrayArray6656 = null;
        Class171.anIntArray2272 = null;
        Class115.aBooleanArrayArrayArray1751 = null;
        Class5_Sub2.aBooleanArrayArrayArray8361 = null;
        Class274.method2062((byte) 89);
        if (Class24.aClass318_Sub1_Sub3Array357 != null) {
            for (int i = 0; i < Class86.anInt1477; i++)
                Class24.aClass318_Sub1_Sub3Array357[i] = null;
            Class86.anInt1477 = 0;
        }
        Class348.aClass318_Sub1Array4293 = null;
        Class250.aClass318_Sub1Array3226 = null;
        Class115.aClass318_Sub1Array1754 = null;
        if (Class239_Sub21.aClass318_Sub1Array6066 != null) {
            for (int i = 0; i < Class239_Sub21.aClass318_Sub1Array6066.length; i++)
                Class239_Sub21.aClass318_Sub1Array6066[i] = null;
            Class5_Sub1_Sub1.anInt9930 = 0;
        }
        if (Class291.aClass318_Sub1Array3737 != null) {
            for (int i = 0; i < Class291.aClass318_Sub1Array3737.length; i++)
                Class291.aClass318_Sub1Array3737[i] = null;
            Class348_Sub42_Sub3.anInt9504 = 0;
        }
        if (Class239_Sub14.aClass211Array5993 != null) {
            for (int i = 0; i < Class331.anInt4135; i++)
                Class239_Sub14.aClass211Array5993[i] = null;
            for (int i = 0; i < Class189.anInt2524; i++) {
                for (int i_84_ = 0; i_84_ < Class318_Sub7.anInt6451; i_84_++) {
                    for (int i_85_ = 0; i_85_ < Class348_Sub41.anInt7054; i_85_++)
                        Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431[i][i_84_][i_85_] = 0L;
                }
            }
            Class331.anInt4135 = 0;
        }
        Class363.method3513(-120);
        Class71.aClass76_1208 = Class71.aClass76_1210;
        Class71.aClass76_1208.method775((byte) 69);
        Class348_Sub1_Sub2.aByteArrayArray8816 = null;
        Class342.anIntArrayArray4253 = null;
        Class239_Sub1.aShortArrayArray5847 = null;
        if (Class348_Sub40_Sub34.aClass293Array9432 != null) {
            Class260.method1978();
            Class9.aHa171.method3631(1);
            Class9.aHa171.method3659(0);
        }
        if (Class319.aClass315Array3982 != null) Class319.aClass315Array3982 = null;
        Class9.aHa171 = null;
    }

    final void method2434(byte i, int i_86_) {
        if (i <= 20) this.anInt10295 = -101;
        anInt10235++;
        anInt10280 = i_86_;
    }

    final void method2435(byte i, int i_87_, boolean bool) {
        anInt10298++;
        Class225 class225 = method2422((byte) 72);
        if (bool || class225.anInt2948 != 0 || this.anInt10310 != 0) {
            if (i != -108) method2438(-11, -118, -110, -2, -57, -110, 126, (byte) 93);
            this.anInt10282 = 0x3fff & i_87_;
            this.aClass264_10217.method2016(15615, this.anInt10282);
        }
    }

    final int method2379(int i) {
        if (i != -25675) return -109;
        anInt10311++;
        return this.anInt10230;
    }

    final int method2394(boolean bool) {
        anInt10254++;
        if (bool != true) this.anIntArray10296 = null;
        if (this.anInt10207 == -32768) return 0;
        return this.anInt10207;
    }

    int method2436(byte i) {
        anInt10299++;
        if (i < 39) method2420(-75, 84);
        return anInt10280;
    }

    final boolean method2376(int i) {
        anInt10281++;
        return i > -12;
    }

    final boolean method2377(byte i) {
        if (i != 122) anInt10257 = -72;
        anInt10262++;
        return this.aBoolean10324;
    }

    final void method2437(int i, int i_88_, int i_89_, int i_90_, boolean bool, int i_91_) {
        anInt10216++;
        int i_92_ = (!bool ? this.anInt10269 : this.anInt10291);
        if (i_88_ != -1 && i_92_ != -1) {
            if (i_92_ == i_88_) {
                Class368 class368 = Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 65, i_88_);
                if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                    Class17 class17 = Class10.aClass87_191.method835(class368.anInt4503, 7);
                    int i_95_ = class17.anInt248;
                    if (i_95_ == 0) return;
                    if (i_95_ == 2) {
                        if (bool) {
                            this.anInt10265 = 0;
                            return;
                        } else this.anInt10305 = 0;
                        return;
                    }
                }
            } else {
                Class368 class368 = Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 109, i_88_);
                Class368 class368_93_ = Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 99, i_92_);
                if (class368.anInt4503 != -1 && class368_93_.anInt4503 != -1) {
                    Class17 class17 = Class10.aClass87_191.method835(class368.anInt4503, 7);
                    Class17 class17_94_ = Class10.aClass87_191.method835((class368_93_.anInt4503), i_89_ ^ ~0x3c5664d6);
                    if (class17_94_.anInt239 > class17.anInt239) return;
                }
            }
        }
        int i_96_ = Class367_Sub11.anInt7396;
        if (i_89_ != -1012294866) method2423(84, 124, 113);
        if (bool) {
            this.anInt10276 = 1;
            this.anInt10260 = i_91_ >> 16;
            this.anInt10291 = i_88_;
            this.anInt10211 = (0xffff & i_91_) + i_96_;
            this.anInt10224 = 0;
            this.anInt10289 = i_90_;
            this.anInt10202 = i;
            this.anInt10273 = 0;
            if (i_96_ < this.anInt10211) this.anInt10224 = -1;
            if (this.anInt10291 != -1 && (this.anInt10211 == i_96_)) {
                int i_97_ = (Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 98, this.anInt10291).anInt4503);
                if (i_97_ != -1) {
                    Class17 class17 = Class10.aClass87_191.method835(i_97_, 7);
                    if (class17 != null && class17.anIntArray237 != null && !this.aBoolean10309) Class287.method2178(this, 0, class17, i_89_ + 1012294835);
                }
            }
        } else {
            this.anInt10243 = 0;
            this.anInt10278 = i_90_;
            this.anInt10237 = i;
            this.anInt10225 = (0xffff & i_91_) + i_96_;
            this.anInt10283 = 1;
            this.anInt10240 = 0;
            this.anInt10269 = i_88_;
            this.anInt10220 = i_91_ >> 16;
            if (i_96_ < this.anInt10225) this.anInt10240 = -1;
            if (this.anInt10269 != -1 && this.anInt10225 == i_96_) {
                int i_98_ = (Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 103, this.anInt10269).anInt4503);
                if (i_98_ != -1) {
                    Class17 class17 = Class10.aClass87_191.method835(i_98_, 7);
                    if (class17 != null && class17.anIntArray237 != null && !this.aBoolean10309) Class287.method2178(this, 0, class17, -128);
                }
            }
        }
    }

    final void method2438(int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, byte i_105_) {
        anInt10228++;
        boolean bool = true;
        boolean bool_106_ = true;
        if (i_105_ > 91) {
            for (int i_107_ = 0; Class132.anInt1905 > i_107_; i_107_++) {
                if (this.anIntArray10219[i_107_] > i_99_) bool = false;
                else bool_106_ = false;
            }
            int i_108_ = -1;
            int i_109_ = -1;
            int i_110_ = 0;
            if (i_100_ >= 0) {
                Class31 class31 = Class73.aClass219_4782.method1601(46, i_100_);
                i_109_ = class31.anInt431;
                i_110_ = class31.anInt434;
            }
            if (bool_106_) {
                if (i_109_ == -1) return;
                i_108_ = 0;
                int i_113_ = 0;
                if (i_109_ != 0) {
                    if (i_109_ == 1) i_113_ = (this.anIntArray10229[0]);
                } else i_113_ = this.anIntArray10219[0];
                for (int i_114_ = 1; i_114_ < Class132.anInt1905; i_114_++) {
                    if (i_109_ == 0) {
                        if (i_113_ > (this.anIntArray10219[i_114_])) {
                            i_113_ = (this.anIntArray10219[i_114_]);
                            i_108_ = i_114_;
                        }
                    } else if (i_109_ == 1 && (this.anIntArray10229[i_114_]) < i_113_) {
                        i_113_ = (this.anIntArray10229[i_114_]);
                        i_108_ = i_114_;
                    }
                }
                if (i_109_ == 1 && i_113_ >= i) return;
            } else {
                if (bool) aByte10222 = (byte) 0;
                for (int i_111_ = 0; i_111_ < Class132.anInt1905; i_111_++) {
                    int i_112_ = aByte10222;
                    aByte10222 = (byte) ((aByte10222 + 1) % Class132.anInt1905);
                    if (i_99_ >= (this.anIntArray10219[i_112_])) {
                        i_108_ = i_112_;
                        break;
                    }
                }
            }
            if (i_108_ >= 0) {
                this.anIntArray10259[i_108_] = i_100_;
                this.anIntArray10229[i_108_] = i;
                this.anIntArray10304[i_108_] = i_102_;
                this.anIntArray10284[i_108_] = i_101_;
                this.anIntArray10219[i_108_] = i_103_ + (i_110_ + i_99_);
                this.anIntArray10303[i_108_] = i_104_;
            }
        }
    }

    final void method2439(int i, Class64 class64) {
        try {
            anInt10205++;
            int i_115_ = aClass264_10315.anInt3370;
            if (i >= -110) this.anInt10325 = 90;
            int i_116_ = aClass264_10316.anInt3370;
            if (i_115_ != 0 || i_116_ != 0) {
                int i_117_ = class64.fa() / 2;
                class64.H(0, -i_117_, 0);
                class64.VA(0x3fff & i_115_);
                class64.FA(0x3fff & i_116_);
                class64.H(0, i_117_, 0);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("kda.GB(" + i + ',' + (class64 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method2440(byte i, int i_118_) {
        anInt10277++;
        Class225 class225 = method2422((byte) 72);
        if (class225.anInt2948 != 0 || this.anInt10310 != 0) {
            this.aClass264_10217.method2021((byte) 119);
            if (i != 49) method2376(113);
            int i_119_ = (0x3fff & i_118_ - this.aClass264_10217.anInt3370);
            if (i_119_ <= 8192) this.anInt10282 = this.aClass264_10217.anInt3370 - -i_119_;
            else this.anInt10282 = (this.aClass264_10217.anInt3370 - 16384 - -i_119_);
        }
    }

    static {
        aBoolean10238 = false;
        aShortArrayArray10258 = (new short[][]{{6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}});
        aShortArrayArray10204 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
        aShortArrayArrayArray10253 = new short[][][]{aShortArrayArray10258, aShortArrayArray10204, aShortArrayArray10246};
    }
}
