/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

final class Class164 {
    static int anInt2172;
    static int anInt2173;
    static int anInt2174;
    static int anInt2175;

    static final void method1277(byte i) {
        anInt2175++;
        Class351.aClass60_4327.method590(i + -62);
        Class358.aClass60_4417.method590(0);
        Class239_Sub24.aClass60_6096.method590(0);
        if (i != 62)
            method1277((byte) 43);
        Class348_Sub40_Sub9.aClass60_9171.method590(0);
    }

    static final int method1278(int i) {
        if ((Class316.aClass348_Sub51_3959
                .aClass239_Sub11_7265.method1768(i + -3690)
                ^ 0xffffffff)
                == -1) {
            for (int i_0_ = 0; ((Class348_Sub42_Sub19.anInt9699 ^ 0xffffffff)
                    < (i_0_ ^ 0xffffffff)); i_0_++) {
                if ((Class348_Sub42_Sub5.anInterface6Array9534[i_0_]
                        .method28((byte) 31)
                        ^ 0xffffffff) == -116
                        || (Class348_Sub42_Sub5.anInterface6Array9534[i_0_]
                        .method28((byte) 71)
                        ^ 0xffffffff) == -84) {
                    Class316.aClass348_Sub51_3959.method3429
                            ((byte) 74,
                                    (Class316.aClass348_Sub51_3959
                                            .aClass239_Sub11_7265),
                                    1);
                    Class304.aBoolean3847 = true;
                    break;
                }
            }
        }
        anInt2174++;
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1018) {
            Runtime runtime = Runtime.getRuntime();
            int i_1_ = (int) ((runtime.totalMemory() + -runtime.freeMemory())
                    / 1024L);
            long l = Class62.method599(i + 28559);
            if ((Class348_Sub17.aLong6791 ^ 0xffffffffffffffffL) == -1L)
                Class348_Sub17.aLong6791 = l;
            if (i_1_ > 16384 && (-Class348_Sub17.aLong6791 + l
                    ^ 0xffffffffffffffffL) > -5001L) {
                if (-Class173.aLong2286 + l > 1000L) {
                    System.gc();
                    Class173.aLong2286 = l;
                }
                return 0;
            }
        }
        if (Class56.aClass56_1023 == Class348_Sub42_Sub15.aClass56_9660) {
            if (Class175.aClass340_2327 == null)
                Class175.aClass340_2327
                        = new Class340(Class348_Sub4.aClass248_6601,
                        Class39.aClass112_520,
                        Class52.aBigInteger4896,
                        Class348_Sub42_Sub15.aBigInteger9657);
            if (!Class175.aClass340_2327.method2674(7))
                return 0;
            Class348_Sub23.method2965(null, 0, true, 0);
            Class286_Sub7.aBoolean6289
                    = !Class348_Sub14.method2804((byte) -63);
            Class286_Sub7.aClass45_6277
                    = Class369_Sub2.method3571(false, (Class286_Sub7.aBoolean6289
                    ? 34 : 32), (byte) -23, 1);
            Class348_Sub40_Sub17_Sub1.aClass45_10426
                    = Class369_Sub2.method3571(false, 33, (byte) -23, 1);
            Class104.aClass45_1627
                    = Class369_Sub2.method3571(false, 13, (byte) -23, 1);
        }
        if (Class56.aClass56_1024 == Class348_Sub42_Sub15.aClass56_9660) {
            boolean bool
                    = Class348_Sub40_Sub17_Sub1.aClass45_10426.method401(89);
            int i_2_ = Class13.aClass314_Sub1Array223[33].method2349(1);
            i_2_ = i_2_ + Class13.aClass314_Sub1Array223
                    [!Class286_Sub7.aBoolean6289 ? 32 : 34]
                    .method2349(1);
            i_2_ += Class13.aClass314_Sub1Array223[13].method2349(1);
            i_2_ = i_2_ + (!bool ? Class348_Sub40_Sub17_Sub1.aClass45_10426
                    .method398((byte) -31) : 100);
            if ((i_2_ ^ 0xffffffff) != -401)
                return i_2_ / 4;
            Class348_Sub31.anInt6924
                    = Class286_Sub7.aClass45_6277.method389(77);
            Class108.anInt1663 = Class348_Sub40_Sub17_Sub1.aClass45_10426
                    .method389(i + 28561);
            Class106.method1001(Class286_Sub7.aClass45_6277, 0);
            int i_3_ = Class316.aClass348_Sub51_3959
                    .aClass239_Sub19_7257.method1805(i ^ 0x11ae);
            Class186_Sub1.aClass111_5813
                    = new Class111(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class348_Sub40_Sub17_Sub1.aClass45_10426);
            int[] is = Class186_Sub1.aClass111_5813.method1046(i_3_, 0);
            if ((is.length ^ 0xffffffff) == -1)
                is = Class186_Sub1.aClass111_5813.method1046(0, 0);
            Class106 class106 = new Class106(Class286_Sub7.aClass45_6277,
                    Class104.aClass45_1627);
            if ((is.length ^ 0xffffffff) < -1) {
                Class182.anInterface16Array2447 = new Interface16[is.length];
                for (int i_4_ = 0;
                     ((i_4_ ^ 0xffffffff)
                             > (Class182.anInterface16Array2447.length ^ 0xffffffff));
                     i_4_++)
                    Class182.anInterface16Array2447[i_4_]
                            = new Class195(Class186_Sub1.aClass111_5813
                            .method1043(is[i_4_], (byte) 102),
                            class106);
            }
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1026)
            Class348_Sub42_Sub3.method3178(Class104.aClass45_1627, -81,
                    Class5_Sub1.method184(1084489728),
                    Class286_Sub7.aClass45_6277);
        if (Class56.aClass56_1027 == Class348_Sub42_Sub15.aClass56_9660) {
            int i_5_ = Class348_Sub50.method3420(0);
            int i_6_ = Class348_Sub42_Sub16.method3256(2);
            if ((i_5_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
                return 100 * i_5_ / i_6_;
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1028) {
            if (Class182.anInterface16Array2447 != null
                    && ((Class182.anInterface16Array2447.length ^ 0xffffffff)
                    < -1)) {
                if ((Class182.anInterface16Array2447[0].method60(-19079)
                        ^ 0xffffffff)
                        > -101)
                    return 0;
                if ((Class182.anInterface16Array2447.length ^ 0xffffffff) < -2
                        && Class186_Sub1.aClass111_5813.method1044(86)
                        && (Class182.anInterface16Array2447[1].method60(i + 9581)
                        < 100))
                    return 0;
            }
            Class170.method1311(5139, Class348_Sub8.aHa6654);
            Class369.method3568(Class348_Sub8.aHa6654, 4);
            Class348_Sub49.method3379(2, 1);
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1029) {
            for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -5; i_7_++)
                Class348_Sub45.aClass361Array7108[i_7_]
                        = Class105_Sub1.method988(Class348_Sub40_Sub3.anInt9109, 1,
                        Class367_Sub4.anInt7319);
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1030) {
            Class21.aClass45_322
                    = Class369_Sub2.method3571(false, 8, (byte) -23, 1);
            Class348_Sub29.aClass45_6909
                    = Class369_Sub2.method3571(false, 0, (byte) -23, 1);
            Class186.aClass45_2490
                    = Class369_Sub2.method3571(false, 1, (byte) -23, 1);
            Class95.aClass45_1541
                    = Class369_Sub2.method3571(false, 2, (byte) -23, 1);
            Class348_Sub35.aClass45_6980
                    = Class369_Sub2.method3571(false, 3, (byte) -23, 1);
            Class129.aClass45_1878
                    = Class369_Sub2.method3571(false, 4, (byte) -23, 1);
            Class367_Sub10.aClass45_7382
                    = Class369_Sub2.method3571(true, 5, (byte) -23, 1);
            Class59_Sub2_Sub1.aClass45_8667
                    = Class369_Sub2.method3571(true, 6, (byte) -23, 1);
            aa_Sub3.aClass45_5207
                    = Class369_Sub2.method3571(false, 7, (byte) -23, 1);
            Class369_Sub2.aClass45_8589
                    = Class369_Sub2.method3571(false, 9, (byte) -23, 1);
            Class16.aClass45_233
                    = Class369_Sub2.method3571(false, 10, (byte) -23, 1);
            Class348_Sub23_Sub2.aClass45_9033
                    = Class369_Sub2.method3571(false, 11, (byte) -23, 1);
            Class113.aClass45_1743
                    = Class369_Sub2.method3571(false, 12, (byte) -23, 1);
            Class239_Sub4.aClass45_5878
                    = Class369_Sub2.method3571(false, 14, (byte) -23, 1);
            Class123.aClass45_1815
                    = Class369_Sub2.method3571(false, 15, (byte) -23, 1);
            Class94.aClass45_1538
                    = Class369_Sub2.method3571(false, 16, (byte) -23, 1);
            Class247.aClass45_3183
                    = Class369_Sub2.method3571(false, 17, (byte) -23, 1);
            Class216.aClass45_4975
                    = Class369_Sub2.method3571(false, 18, (byte) -23, 1);
            Class174.aClass45_2306
                    = Class369_Sub2.method3571(false, 19, (byte) -23, 1);
            r_Sub2.aClass45_10480
                    = Class369_Sub2.method3571(false, 20, (byte) -23, 1);
            Class78.aClass45_1322
                    = Class369_Sub2.method3571(false, 21, (byte) -23, 1);
            Class348_Sub16_Sub3.aClass45_8926
                    = Class369_Sub2.method3571(false, 22, (byte) -23, 1);
            Class348_Sub32.aClass45_6950
                    = Class369_Sub2.method3571(true, 23, (byte) -23, 1);
            Class130.aClass45_1897
                    = Class369_Sub2.method3571(false, 24, (byte) -23, 1);
            Class82.aClass45_1434
                    = Class369_Sub2.method3571(false, 25, (byte) -23, 1);
            Class348_Sub11.aClass45_4770
                    = Class369_Sub2.method3571(true, 26, (byte) -23, 1);
            Class239.aClass45_3146
                    = Class369_Sub2.method3571(false, 27, (byte) -23, 1);
            Class367_Sub8.aClass45_7362
                    = Class369_Sub2.method3571(true, 28, (byte) -23, 1);
            Class262.aClass45_3323
                    = Class369_Sub2.method3571(false, 29, (byte) -23, 1);
            Class126.aClass45_4984
                    = Class369_Sub2.method3571(true, 30, (byte) -23, 1);
            Class136.aClass45_4796
                    = Class369_Sub2.method3571(true, 31, (byte) -23, 1);
            Class146.aClass45_2015
                    = Class369_Sub2.method3571(true, 36, (byte) -23, 2);
        }
        if (Class56.aClass56_1031 == Class348_Sub42_Sub15.aClass56_9660) {
            int i_8_ = 0;
            for (int i_9_ = 0; i_9_ < 37; i_9_++) {
                if (Class13.aClass314_Sub1Array223[i_9_] != null)
                    i_8_ += (Class13.aClass314_Sub1Array223[i_9_]
                            .method2349(i + 28661)
                            * Class8.anIntArray164[i_9_] / 100);
            }
            if ((i_8_ ^ 0xffffffff) != -101) {
                if (Class268.anInt3435 < 0)
                    Class268.anInt3435 = i_8_;
                return ((i_8_ + -Class268.anInt3435) * 100
                        / (-Class268.anInt3435 + 100));
            }
            Class286_Sub5.method2159((byte) -109, Class21.aClass45_322);
            Class348_Sub42_Sub3.method3178(Class104.aClass45_1627, -124,
                    Class5_Sub1
                            .method184(i ^ ~0x40a46ff3),
                    Class21.aClass45_322);
        }
        if (Class56.aClass56_1032 == Class348_Sub42_Sub15.aClass56_9660) {
            if ((Class345.anInt4270 ^ 0xffffffff) == 0)
                Class345.anInt4270
                        = Class59_Sub2_Sub1.aClass45_8667.method417("scape main",
                        0);
            r_Sub1.method3290(56);
            Class348_Sub49.method3379(2, 2);
        }
        if (Class56.aClass56_1033 == Class348_Sub42_Sub15.aClass56_9660)
            Class30.method323(Class126.aClass45_4984,
                    Class348_Sub23_Sub1.aClass297_8992, (byte) 95);
        if (Class56.aClass56_1034 == Class348_Sub42_Sub15.aClass56_9660) {
            int i_10_ = Class239_Sub11.method1770((byte) -25);
            if ((i_10_ ^ 0xffffffff) > -101)
                return i_10_;
            Class263.method2013(Class367_Sub8.aClass45_7362
                            .method415((byte) 73, 1),
                    (byte) 112);
            RuntimeException_Sub1.method4012(Class367_Sub8.aClass45_7362
                            .method415((byte) 73, 3),
                    (byte) -111);
        }
        if (i != -28660)
            return 2;
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1035) {
            if (Class348_Sub31.anInt6923 != -1
                    && !aa_Sub3.aClass45_5207
                    .method420(-10499, Class348_Sub31.anInt6923, 0))
                return 99;
            Class348_Sub40_Sub4.aD9113
                    = new Class244(Class348_Sub11.aClass45_4770,
                    Class369_Sub2.aClass45_8589,
                    Class21.aClass45_322);
            Class101_Sub3.aClass326_5764
                    = new Class326(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class95.aClass45_1541);
            Class64_Sub3.aClass261_5558
                    = new Class261(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class95.aClass45_1541);
            Class239.aClass166_3147
                    = new Class166(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class95.aClass45_1541,
                    Class21.aClass45_322);
            Class348_Sub7.aClass33_6653
                    = new Class33(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class247.aClass45_3183);
            Class229.aClass268_2979
                    = new Class268(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class95.aClass45_1541);
            Class362.aClass183_4460
                    = new Class183(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class95.aClass45_1541);
            Class73.aClass219_4782
                    = new Class219(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class95.aClass45_1541,
                    Class21.aClass45_322);
            Class348_Sub40_Sub25.aClass150_9342
                    = new Class150(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class95.aClass45_1541,
                    aa_Sub3.aClass45_5207);
            Class127_Sub1.aClass271_8378
                    = new Class271(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class95.aClass45_1541);
            Class348_Sub1.aClass185_6559
                    = new Class185(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class95.aClass45_1541);
            Class348_Sub40_Sub12.aClass263_9195
                    = new Class263(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, true,
                    Class94.aClass45_1538, aa_Sub3.aClass45_5207);
            Class348_Sub23_Sub2.aClass153_9031
                    = new Class153(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class95.aClass45_1541,
                    Class21.aClass45_322);
            Class2.aClass141_117
                    = new Class141(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class95.aClass45_1541,
                    Class21.aClass45_322);
            Class189.aClass278_2529
                    = new Class278(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, true,
                    Class216.aClass45_4975, aa_Sub3.aClass45_5207);
            Exception_Sub1.aClass255_112
                    = new Class255(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, true,
                    Class101_Sub3.aClass326_5764,
                    Class174.aClass45_2306, aa_Sub3.aClass45_5207);
            Class348_Sub23_Sub2.aClass187_9036
                    = new Class187(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class95.aClass45_1541);
            Class10.aClass87_191
                    = new Class87(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, r_Sub2.aClass45_10480,
                    Class348_Sub29.aClass45_6909,
                    Class186.aClass45_2490);
            Class30.aClass84_413
                    = new Class84(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class95.aClass45_1541);
            Class123.aClass25_1813
                    = new Class25(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class95.aClass45_1541);
            Class348_Sub40_Sub18.aClass319_9245
                    = new Class319(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class78.aClass45_1322,
                    aa_Sub3.aClass45_5207);
            Class136.aClass65_4787
                    = new Class65(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class95.aClass45_1541);
            Class91.aClass82_1523
                    = new Class82(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967, Class95.aClass45_1541);
            Class239_Sub14.aClass259_5995
                    = new Class259(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class95.aClass45_1541);
            Class229.aClass194_2981
                    = new Class194(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class348_Sub16_Sub3.aClass45_8926);
            Class269.aClass217_3453
                    = new Class217(Class348_Sub42_Sub8_Sub2.aClass230_10434,
                    Class348_Sub33.anInt6967,
                    Class95.aClass45_1541);
            Class65.method699(Class104.aClass45_1627, (byte) -100,
                    Class348_Sub35.aClass45_6980,
                    Class21.aClass45_322, aa_Sub3.aClass45_5207);
            Applet_Sub1.method85(0, Class262.aClass45_3323);
            Class200.aClass226_2639
                    = new Class226(Class348_Sub33.anInt6967,
                    Class130.aClass45_1897, Class82.aClass45_1434);
            Class239_Sub6.aClass355_5900
                    = new Class355(Class348_Sub33.anInt6967,
                    Class130.aClass45_1897, Class82.aClass45_1434,
                    new Class28());
            Class150.method1202(0);
            Class348_Sub40_Sub12.aClass263_9195.method2008
                    (i + 28539, (Class316.aClass348_Sub51_3959
                            .aClass239_Sub27_7261.method1840(i + -3690)
                            ^ 0xffffffff) == -1);
            Class318_Sub1_Sub3_Sub3.aClass170_10209 = new Class170();
            Class348_Sub40.method3038(-1);
            RuntimeException_Sub1.method4011(i + 29684,
                    Class239.aClass45_3146);
            Class348_Sub29.method3004(aa_Sub3.aClass45_5207, false,
                    Class348_Sub40_Sub4.aD9113);
            Class296 class296
                    = new Class296(Class16.aClass45_233.method391("huffman", "",
                    -29832));
            ha_Sub3.method3896(class296, (byte) 13);
            try {
                jagmisc.init();
            } catch (Throwable throwable) {
                /* empty */
            }
            Class348_Sub8.aClass241_6660 = Class229.method1631(false);
            Class348_Sub40_Sub20.aClass348_Sub4_9264
                    = new Class348_Sub4(true, Class348_Sub23_Sub1.aClass297_8992);
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1037) {
            int i_11_ = (Class348_Sub22.method2958(22388, Class21.aClass45_322)
                    + Class348_Sub49_Sub2.method3405(2012104999, true));
            int i_12_ = (Class288_Sub1.method2188(-30477)
                    - -Class348_Sub42_Sub16.method3256(2));
            if (i_11_ < i_12_)
                return i_11_ * 100 / i_12_;
        }
        if (Class56.aClass56_1038 == Class348_Sub42_Sub15.aClass56_9660)
            Class75.method752(Class348_Sub32.aClass45_6950,
                    Class229.aClass268_2979, Class362.aClass183_4460,
                    Class348_Sub40_Sub12.aClass263_9195,
                    Class348_Sub23_Sub2.aClass153_9031,
                    Class2.aClass141_117,
                    Class318_Sub1_Sub3_Sub3.aClass170_10209);
        if (Class56.aClass56_1039 == Class348_Sub42_Sub15.aClass56_9660) {
            Class77.anIntArray1303
                    = (new int
                    [Class239_Sub14.aClass259_5995.anInt3305]);
            Class286_Sub6.aBooleanArray6270
                    = (new boolean
                    [Class239_Sub14.aClass259_5995.anInt3305]);
            Class258_Sub2.aStringArray8532
                    = new String[Class91.aClass82_1523.anInt1439];
            for (int i_13_ = 0;
                 Class239_Sub14.aClass259_5995.anInt3305 > i_13_;
                 i_13_++) {
                if ((Class239_Sub14.aClass259_5995
                        .method1976(i_13_, i ^ ~0x6fc0).anInt2135
                        ^ 0xffffffff)
                        == -1) {
                    Class286_Sub6.aBooleanArray6270[i_13_] = true;
                    Class335.anInt4168++;
                }
                Class77.anIntArray1303[i_13_] = -1;
            }
            Class116.method1063(1);
            Class285.anInt4737
                    = Class348_Sub35.aClass45_6980.method417("loginscreen",
                    i ^ ~0x6ff3);
            Class54.anInt970
                    = Class348_Sub35.aClass45_6980.method417("lobbyscreen", 0);
            Class367_Sub10.aClass45_7382.method404(0, true, false);
            Class59_Sub2_Sub1.aClass45_8667.method404(0, true, true);
            Class21.aClass45_322.method404(i + 28660, true, true);
            Class104.aClass45_1627.method404(0, true, true);
            Class16.aClass45_233.method404(0, true, true);
            Class348_Sub35.aClass45_6980.method404(0, true, true);
            Class95.aClass45_1541.anInt634 = 2;
            Class319.aBoolean3988 = true;
            Class247.aClass45_3183.anInt634 = 2;
            Class94.aClass45_1538.anInt634 = 2;
            Class216.aClass45_4975.anInt634 = 2;
            Class174.aClass45_2306.anInt634 = 2;
            r_Sub2.aClass45_10480.anInt634 = 2;
            Class78.aClass45_1322.anInt634 = 2;
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1040) {
            if (!Class320.method2547(Class285.anInt4737, (byte) 84))
                return 0;
            boolean bool = true;
            for (int i_14_ = 0;
                 i_14_ < (Class348_Sub40_Sub33.aClass46ArrayArray9427
                         [Class285.anInt4737]).length;
                 i_14_++) {
                Class46 class46 = (Class348_Sub40_Sub33.aClass46ArrayArray9427
                        [Class285.anInt4737][i_14_]);
                if ((class46.anInt774 ^ 0xffffffff) == -6
                        && class46.anInt756 != -1
                        && !Class21.aClass45_322.method420(-10499,
                        (class46
                                .anInt756),
                        0))
                    bool = false;
            }
            if (!bool)
                return 0;
        }
        if (Class56.aClass56_1041 == Class348_Sub42_Sub15.aClass56_9660)
            Class348_Sub42_Sub8.method3198(true, (byte) -45);
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1042) {
            Class51.aClass311_897.method2319((byte) -56);
            try {
                Class348_Sub32.aThread6946.join();
            } catch (InterruptedException interruptedexception) {
                return 0;
            }
            Class186_Sub1.aClass111_5813 = null;
            Class348_Sub40_Sub17_Sub1.aClass45_10426 = null;
            Class51.aClass311_897 = null;
            Class182.anInterface16Array2447 = null;
            Class348_Sub32.aThread6946 = null;
            Class286_Sub7.aClass45_6277 = null;
            ha_Sub3.method3886(i + 28556);
            Class348_Sub23_Sub2.aBoolean9038
                    = Class316.aClass348_Sub51_3959
                    .aClass239_Sub11_7265.method1768(-32350) == 1;
            Class316.aClass348_Sub51_3959.method3429((byte) 74,
                    (Class316
							.aClass348_Sub51_3959
                            .aClass239_Sub11_7265),
                    1);
            if (Class348_Sub23_Sub2.aBoolean9038)
                Class316.aClass348_Sub51_3959.method3429
                        ((byte) 74,
                                (Class316.aClass348_Sub51_3959
                                        .aClass239_Sub25_7251),
                                0);
            else if (Class316.aClass348_Sub51_3959
					.aClass239_Sub25_7251.aBoolean6113
                    && (Class348_Sub40_Sub20.aClass348_Sub4_9264.anInt6609
                    ^ 0xffffffff) > -513
                    && (Class348_Sub40_Sub20.aClass348_Sub4_9264.anInt6609
                    ^ 0xffffffff) != -1)
                Class316.aClass348_Sub51_3959.method3429
                        ((byte) 74,
                                (Class316.aClass348_Sub51_3959
                                        .aClass239_Sub25_7251),
                                0);
            Class14_Sub2.method243(i ^ ~0x6fd6);
            if (Class348_Sub23_Sub2.aBoolean9038)
                Class367_Sub10.method3553(false, (byte) 108, 0);
            else
                Class367_Sub10.method3553(false, (byte) 102,
                        Class316.aClass348_Sub51_3959
                                .aClass239_Sub25_7251
                                .method1829(-32350));
            Class85.method830(Class316.aClass348_Sub51_3959
                            .aClass239_Sub8_7227.method1751(-32350),
                    -1, (byte) 102, false, -1);
            Class170.method1311(5139, Class348_Sub8.aHa6654);
            Class369.method3568(Class348_Sub8.aHa6654, i ^ ~0x6ff7);
            Class255.method1933(Class21.aClass45_322, Class348_Sub8.aHa6654,
                    true);
            Class101.method901(Class113.aClass105Array1744, 515880227);
        }
        return Class348_Sub40_Sub6.method3063(false);
    }

    static final String method1279(boolean bool, int i, String[] strings,
                                   int i_15_) {
        try {
            anInt2172++;
            if ((i ^ 0xffffffff) == -1)
                return "";
            if (i == 1) {
                String string = strings[i_15_];
                if (string == null)
                    return "null";
                return string;
            }
            int i_16_ = i + i_15_;
            int i_17_ = 0;
            for (int i_18_ = i_15_;
                 (i_18_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_18_++) {
                String string = strings[i_18_];
                if (string == null)
                    i_17_ += 4;
                else
                    i_17_ += string.length();
            }
            StringBuffer stringbuffer = new StringBuffer(i_17_);
            for (int i_19_ = i_15_;
                 (i_16_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
                String string = strings[i_19_];
                if (string == null)
                    stringbuffer.append("null");
                else
                    stringbuffer.append(string);
            }
            if (bool != true)
                method1277((byte) -20);
            return stringbuffer.toString();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("pea.C(" + bool + ',' + i + ','
                            + (strings != null ? "{...}"
                            : "null")
                            + ',' + i_15_ + ')'));
        }
    }
}
