/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class225 {
    int anInt2901;
    static int anInt2902;
    static int anInt2903;
    int anInt2904;
    int anInt2905;
    int[] anIntArray2906;
    int[] anIntArray2907;
    int anInt2908 = -1;
    int anInt2909;
    int[][] anIntArrayArray2910;
    int anInt2911;
    int anInt2912;
    boolean aBoolean2913;
    int anInt2914;
    int[] anIntArray2915;
    int anInt2916;
    int anInt2917;
    int anInt2918;
    int anInt2919;
    int anInt2920;
    static int anInt2921;
    int anInt2922;
    int anInt2923;
    int anInt2924;
    private Class101[] aClass101Array2925;
    int anInt2926;
    int anInt2927;
    int anInt2928;
    int[] anIntArray2929;
    private int anInt2930;
    static Class225 aClass225_2931 = new Class225();
    int anInt2932;
    static int anInt2933;
    int anInt2934;
    int anInt2935;
    int anInt2936;
    int anInt2937;
    int anInt2938;
    int[][] anIntArrayArray2939;
    int anInt2940;
    int anInt2941;
    private final int anInt2942;
    int anInt2943;
    static Class173 aClass173_2944;
    int anInt2945;
    static int anInt2946 = 0;
    int anInt2947;
    int anInt2948;
    int anInt2949;
    int anInt2950;
    int anInt2951;
    static int anInt2952;
    int anInt2953;
    int anInt2954;
    static int anInt2955;
    static int anInt2956;
    static Class243 aClass243_2957;
    int anInt2958;

    final Class101[] method1618(ha var_ha, int i) {
        anInt2952++;
        if (aClass101Array2925 != null
                && var_ha.anInt4567 == anInt2942)
            return aClass101Array2925;
        if (this.anIntArrayArray2939 == null)
            return null;
        aClass101Array2925
                = new Class101[this.anIntArrayArray2939.length];
        for (int i_0_ = i;
             (this.anIntArrayArray2939.length > i_0_);
             i_0_++) {
            int i_1_ = 0;
            int i_2_ = 0;
            int i_3_ = 0;
            int i_4_ = 0;
            int i_5_ = 0;
            int i_6_ = 0;
            if (this.anIntArrayArray2939[i_0_] != null) {
                i_2_ = this.anIntArrayArray2939[i_0_][1];
                i_3_ = this.anIntArrayArray2939[i_0_][2];
                i_4_ = (this.anIntArrayArray2939[i_0_][3]
                        << 1768174275);
                i_1_ = this.anIntArrayArray2939[i_0_][0];
                i_5_ = (this.anIntArrayArray2939[i_0_][4]
                        << -1947272285);
                i_6_ = (this.anIntArrayArray2939[i_0_][5]
                        << 285198467);
            }
            if (i_1_ != 0 || i_2_ != 0 || i_3_ != 0
                    || i_4_ != 0 || i_5_ != 0 || i_6_ != 0) {
                Class101 class101
                        = aClass101Array2925[i_0_] = var_ha.method3654();
                if (i_6_ != 0)
                    class101.method908(i_6_);
                if (i_4_ != 0)
                    class101.method900(i_4_);
                if (i_5_ != 0)
                    class101.method896(i_5_);
                class101.method891(i_1_, i_2_, i_3_);
            }
        }
        return aClass101Array2925;
    }

    public static void method1619(byte i) {
        aClass225_2931 = null;
        aClass173_2944 = null;
        int i_7_ = 86 / ((i - 41) / 40);
        aClass243_2957 = null;
    }

    final void method1620(Class348_Sub49 class348_sub49, int i) {
        for (; ; ) {
            int i_8_ = class348_sub49.method3387(255);
            if (i_8_ == 0)
                break;
            method1622(class348_sub49, 48, i_8_);
        }
        if (i >= -27)
            method1621((byte) 109);
        anInt2933++;
    }

    final int method1621(byte i) {
        anInt2921++;
        if (this.anInt2918 != -1)
            return this.anInt2918;
        if (this.anIntArray2915 != null) {
            int i_9_ = (int) ((double) anInt2930 * Math.random());
            int i_10_;
            for (i_10_ = 0; i_9_ >= this.anIntArray2929[i_10_];
                 i_10_++)
                i_9_ -= this.anIntArray2929[i_10_];
            return this.anIntArray2915[i_10_];
        }
        int i_11_ = -62 % ((-71 - i) / 52);
        return -1;
    }

    private final void method1622(Class348_Sub49 class348_sub49, int i,
                                  int i_12_) {
        anInt2903++;
        if (i_12_ != 1) {
            if (i_12_ != 2) {
                if (i_12_ == 3)
                    this.anInt2924
                            = class348_sub49.method3330(i + 842397896);
                else if (i_12_ == 4)
                    this.anInt2958
                            = class348_sub49.method3330(842397944);
                else if (i_12_ == 5)
                    this.anInt2947
                            = class348_sub49.method3330(842397944);
                else if (i_12_ != 6) {
                    if (i_12_ == 7)
                        this.anInt2920
                                = class348_sub49.method3330(842397944);
                    else if (i_12_ != 8) {
                        if (i_12_ != 9) {
                            if (i_12_ == 26) {
                                this.anInt2932
                                        = (short) (class348_sub49
                                        .method3387(i ^ 0xcf)
                                        * 4);
                                this.anInt2941
                                        = (short) (class348_sub49.method3387(255)
                                        * 4);
                            } else if (i_12_ == 27) {
                                if (this.anIntArrayArray2939
                                        == null)
                                    this.anIntArrayArray2939
                                            = new int[12][];
                                int i_13_ = class348_sub49.method3387(255);
                                this.anIntArrayArray2939[i_13_]
                                        = new int[6];
                                for (int i_14_ = 0; i_14_ < 6;
                                     i_14_++)
                                    this.anIntArrayArray2939
                                            [i_13_][i_14_]
                                            = class348_sub49.method3372(13638);
                            } else if (i_12_ != 28) {
                                if (i_12_ != 29) {
                                    if (i_12_ == 30)
                                        this.anInt2917
                                                = class348_sub49
                                                .method3330(842397944);
                                    else if (i_12_ != 31) {
                                        if (i_12_ == 32)
                                            this.anInt2935
                                                    = class348_sub49
                                                    .method3330(842397944);
                                        else if (i_12_ == 33)
                                            this.anInt2950
                                                    = class348_sub49
                                                    .method3372(13638);
                                        else if (i_12_ != 34) {
                                            if (i_12_ != 35) {
                                                if (i_12_ != 36) {
                                                    if (i_12_ == 37)
                                                        this
                                                                .anInt2945
                                                                = (class348_sub49
                                                                .method3387
                                                                        (255));
                                                    else if (i_12_ != 38) {
                                                        if (i_12_ != 39) {
                                                            if (i_12_ == 40)
                                                                this
                                                                        .anInt2938
                                                                        = (class348_sub49
                                                                        .method3330
                                                                                (842397944));
                                                            else if (i_12_
                                                                    == 41)
                                                                this
                                                                        .anInt2937
                                                                        = (class348_sub49
                                                                        .method3330
                                                                                (i
                                                                                        + 842397896));
                                                            else if (i_12_
                                                                    != 42) {
                                                                if (i_12_ == 43)
                                                                    this
                                                                            .anInt2909
                                                                            = (class348_sub49.method3330
                                                                            (842397944));
                                                                else if (i_12_ != 44) {
                                                                    if (i_12_
                                                                            != 45) {
                                                                        if (i_12_ != 46) {
                                                                            if (i_12_ == 47)
                                                                                this.anInt2927 = class348_sub49.method3330(842397944);
                                                                            else if (i_12_ != 48) {
                                                                                if (i_12_ == 49)
                                                                                    this.anInt2911 = class348_sub49.method3330(842397944);
                                                                                else if (i_12_ == 50)
                                                                                    this.anInt2934 = class348_sub49.method3330(842397944);
                                                                                else if (i_12_ != 51) {
                                                                                    if (i_12_ == 52) {
                                                                                        int i_15_ = class348_sub49.method3387(i ^ 0xcf);
                                                                                        this.anIntArray2915 = new int[i_15_];
                                                                                        this.anIntArray2929 = new int[i_15_];
                                                                                        for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
                                                                                            this.anIntArray2915[i_16_] = class348_sub49.method3330(842397944);
                                                                                            int i_17_ = class348_sub49.method3387(255);
                                                                                            this.anIntArray2929[i_16_] = i_17_;
                                                                                            anInt2930 += i_17_;
                                                                                        }
                                                                                    } else if (i_12_ == 53)
                                                                                        this.aBoolean2913 = false;
                                                                                    else if (i_12_ == 54) {
                                                                                        this.anInt2912 = class348_sub49.method3387(255) << -1300429466;
                                                                                        this.anInt2943 = class348_sub49.method3387(i + 207) << -59678202;
                                                                                    } else if (i_12_ == 55) {
                                                                                        if (this.anIntArray2907 == null)
                                                                                            this.anIntArray2907 = new int[12];
                                                                                        int i_18_ = class348_sub49.method3387(i ^ 0xcf);
                                                                                        this.anIntArray2907[i_18_] = class348_sub49.method3330(i + 842397896);
                                                                                    } else if (i_12_ == 56) {
                                                                                        if (this.anIntArrayArray2910 == null)
                                                                                            this.anIntArrayArray2910 = new int[12][];
                                                                                        int i_19_ = class348_sub49.method3387(255);
                                                                                        this.anIntArrayArray2910[i_19_] = new int[3];
                                                                                        for (int i_20_ = 0; i_20_ < 3; i_20_++)
                                                                                            this.anIntArrayArray2910[i_19_][i_20_] = class348_sub49.method3372(i + 13590);
                                                                                    }
                                                                                } else
                                                                                    this.anInt2953 = class348_sub49.method3330(842397944);
                                                                            } else
                                                                                this.anInt2905 = class348_sub49.method3330(842397944);
                                                                        } else
                                                                            this.anInt2908
                                                                                    = class348_sub49.method3330(842397944);
                                                                    } else
                                                                        this
                                                                                .anInt2928
                                                                                = class348_sub49.method3330(842397944);
                                                                } else
                                                                    this
                                                                            .anInt2923
                                                                            = (class348_sub49.method3330
                                                                            (842397944));
                                                            } else
                                                                this
                                                                        .anInt2954
                                                                        = (class348_sub49
                                                                        .method3330
                                                                                (842397944));
                                                        } else
                                                            this
                                                                    .anInt2922
                                                                    = (class348_sub49
                                                                    .method3330
                                                                            (842397944));
                                                    } else
                                                        this
                                                                .anInt2916
                                                                = (class348_sub49
                                                                .method3330
                                                                        (842397944));
                                                } else
                                                    this.anInt2926
                                                            = (class348_sub49
                                                            .method3372
                                                                    (i ^ 0x3576));
                                            } else
                                                this.anInt2904
                                                        = (class348_sub49
                                                        .method3330
                                                                (i + 842397896));
                                        } else
                                            this.anInt2936
                                                    = class348_sub49
                                                    .method3387(255);
                                    } else
                                        this.anInt2901
                                                = class348_sub49.method3387(255);
                                } else
                                    this.anInt2948
                                            = class348_sub49.method3387(255);
                            } else {
                                this.anIntArray2906 = new int[12];
                                for (int i_21_ = 0; i_21_ < 12; i_21_++) {
                                    this.anIntArray2906[i_21_]
                                            = class348_sub49.method3387(255);
                                    if ((this.anIntArray2906
                                            [i_21_]) == 255)
                                        this.anIntArray2906[i_21_]
                                                = -1;
                                }
                            }
                        } else
                            this.anInt2949
                                    = class348_sub49.method3330(842397944);
                    } else
                        this.anInt2914
                                = class348_sub49.method3330(842397944);
                } else
                    this.anInt2919
                            = class348_sub49.method3330(842397944);
            } else
                this.anInt2940
                        = class348_sub49.method3330(i + 842397896);
        } else {
            this.anInt2918
                    = class348_sub49.method3330(i ^ 0x3235f8c8);
            this.anInt2951 = class348_sub49.method3330(842397944);
            if (this.anInt2951 == 65535)
                this.anInt2951 = -1;
            if (this.anInt2918 == 65535)
                this.anInt2918 = -1;
        }
        if (i != 48)
            this.anInt2928 = -71;
    }

    final boolean method1623(int i, int i_22_) {
        if (i_22_ >= -32)
            method1618(null, 16);
        anInt2902++;
        if (i == -1)
            return false;
        if (this.anInt2918 == i)
            return true;
        if (this.anIntArray2915 != null) {
            for (int i_23_ = 0;
                 this.anIntArray2915.length > i_23_; i_23_++) {
                if (this.anIntArray2915[i_23_] == i)
                    return true;
            }
        }
        return false;
    }

    public Class225() {
        this.anInt2901 = 0;
        this.anInt2911 = -1;
        this.anIntArray2915 = null;
        this.anInt2904 = 0;
        this.anInt2923 = -1;
        this.anInt2918 = -1;
        this.anInt2909 = -1;
        this.anInt2920 = -1;
        this.anInt2916 = -1;
        this.anInt2922 = -1;
        this.anInt2932 = 0;
        this.anInt2912 = 0;
        this.anInt2917 = 0;
        this.anInt2914 = -1;
        this.anIntArray2929 = null;
        this.anInt2919 = -1;
        this.anInt2935 = 0;
        this.anInt2927 = -1;
        this.anInt2937 = -1;
        this.anInt2926 = 0;
        this.anInt2928 = -1;
        this.anInt2941 = 0;
        this.anInt2938 = -1;
        this.anInt2945 = -1;
        this.anInt2943 = 0;
        this.anInt2905 = -1;
        anInt2930 = 0;
        this.aBoolean2913 = true;
        this.anInt2950 = 0;
        this.anInt2940 = -1;
        this.anInt2934 = -1;
        anInt2942 = -1;
        this.anInt2951 = -1;
        this.anInt2949 = -1;
        this.anInt2948 = 0;
        this.anInt2947 = -1;
        this.anInt2924 = -1;
        this.anInt2954 = -1;
        this.anInt2953 = -1;
        this.anInt2936 = 0;
        this.anInt2958 = -1;
    }

    static {
        aClass173_2944 = new Class173();
        anInt2955 = 0;
        aClass243_2957 = new Class243();
    }
}
