/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;
import java.net.URL;

final class Class88 {
    static int anInt1492;
    static int anInt1493;
    static int anInt1494;
    static int anInt1495;
    static int anInt1496;
    static int anInt1497 = 0;
    static int anInt1498;
    static int anInt1499;
    static boolean aBoolean1500 = false;
    static int anInt1501;
    static int anInt1502;
    Class318_Sub9 aClass318_Sub9_1503 = new Class318_Sub9();
    static int anInt1504;
    private Class318_Sub9 aClass318_Sub9_1505;

    final int method840(int i) {
        anInt1496++;
        int i_0_ = i;
        Class318_Sub9 class318_sub9
                = (this.aClass318_Sub9_1503
                .aClass318_Sub9_6469);
        while (this.aClass318_Sub9_1503 != class318_sub9) {
            class318_sub9
                    = class318_sub9.aClass318_Sub9_6469;
            i_0_++;
        }
        return i_0_;
    }

    static final Class227[] method841(int i) {
        if (i > -126)
            method847(null, -66);
        anInt1504++;
        return (new Class227[]
                {Class191.aClass227_2568, Class100.aClass227_1591,
                        Class6.aClass227_151});
    }

    static final void method842(boolean bool) {
        anInt1501++;
        Class138.aClass46Array1942 = null;
        if (Class59_Sub1.aBoolean5300
                && (Class348_Sub42_Sub12.method3229(-82) ^ 0xffffffff) != -2)
            OutputStream_Sub1.method132(106,
                    ((Class240.anInt4674 ^ 0xffffffff)
                            == -4) || Class240.anInt4674 == 7,
                    za_Sub1.method3439(107), 0,
                    Class348_Sub44.method3306((byte) -111),
                    0);
        int i = 0;
        if (bool != false)
            method847(null, -110);
        int i_1_ = 0;
        if (Class59_Sub1.aBoolean5300) {
            i = s_Sub3.method4008((byte) -124);
            i_1_ = Class16.method260(false);
        }
        Class159.method1252(i_1_, r.anInt9721, i_1_, -1, i,
                i + Class321.anInt4017,
                i_1_ - -Class348_Sub42_Sub8_Sub2.anInt10432,
                (byte) 116, i);
        if (Class138.aClass46Array1942 != null) {
            Class348_Sub40_Sub7.method3064
                    (i, Class136.anInt4792, true, Class348_Sub1.anInt6555, i_1_,
                            Class331.aClass46_4130.anInt760,
                            i + Class321.anInt4017, false, Class138.aClass46Array1942,
                            -1412584499, i_1_ - -Class348_Sub42_Sub8_Sub2.anInt10432);
            Class138.aClass46Array1942 = null;
        }
    }

    static final void method843(byte i) {
        anInt1499++;
        if (Class225.anInt2955 != 0
                && (Class225.anInt2955 ^ 0xffffffff) != -6) {
            try {
                int i_2_;
                if (Class318_Sub1_Sub1_Sub2.anInt9971 != 0)
                    i_2_ = 2000;
                else
                    i_2_ = 250;
                if (i_2_ < ++Class11.anInt197) {
                    if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                        Class348_Sub40_Sub8.aClass238_9165
                                .method1700((byte) 36);
                        Class348_Sub40_Sub8.aClass238_9165 = null;
                    }
                    if (Class318_Sub1_Sub1_Sub2.anInt9971 >= 3) {
                        Class225.anInt2955 = 0;
                        Class14_Sub4.method254(-5, (byte) -111);
                        return;
                    }
                    if ((Class239_Sub12.anInt5969 ^ 0xffffffff) != -3)
                        Class255.aClass161_3285.method1259(0);
                    else
                        Class3.aClass161_125.method1259(0);
                    Class318_Sub1_Sub1_Sub2.anInt9971++;
                    Class225.anInt2955 = 1;
                    Class11.anInt197 = 0;
                }
                if (Class225.anInt2955 == 1) {
                    if (Class239_Sub12.anInt5969 == 2)
                        Class130_Sub1.aClass144_5800
                                = (Class3.aClass161_125.method1262
                                (Class348_Sub23_Sub1.aClass297_8992,
                                        (byte) 36));
                    else
                        Class130_Sub1.aClass144_5800
                                = (Class255.aClass161_3285.method1262
                                (Class348_Sub23_Sub1.aClass297_8992,
                                        (byte) 36));
                    Class225.anInt2955 = 2;
                }
                if ((Class225.anInt2955 ^ 0xffffffff) == -3) {
                    if (Class130_Sub1.aClass144_5800.anInt1997 == 2)
                        throw new IOException();
                    if (Class130_Sub1.aClass144_5800.anInt1997 != 1)
                        return;
                    Class348_Sub40_Sub8.aClass238_9165
                            = Class348_Sub23_Sub3.method2982(((Socket)
                                    (Class130_Sub1
                                            .aClass144_5800
                                            .anObject1998)),
                            (byte) -118, 7500);
                    Class130_Sub1.aClass144_5800 = null;
                    Class348_Sub3.method2739(0);
                    Class348_Sub47 class348_sub47 = Class203.method1478(true);
                    class348_sub47
                            .aClass348_Sub49_Sub2_7116.method3378
                            (false, Class178.aClass29_2339.anInt400);
                    Class348_Sub42_Sub14.method3243(9, class348_sub47);
                    Class239_Sub18.method1802(0);
                    Class225.anInt2955 = 3;
                }
                if ((Class225.anInt2955 ^ 0xffffffff) == -4) {
                    if (!Class348_Sub40_Sub8.aClass238_9165.method1705(1, 107))
                        return;
                    Class348_Sub40_Sub8.aClass238_9165.method1701
                            (1, 0, (byte) -118,
                                    (Class299.aClass348_Sub49_Sub2_3813
                                            .aByteArray7154));
                    int i_3_ = ((Class299.aClass348_Sub49_Sub2_3813
                            .aByteArray7154[0])
                            & 0xff);
                    if (i_3_ != 0) {
                        Class225.anInt2955 = 0;
                        Class14_Sub4.method254(i_3_, (byte) -113);
                        Class348_Sub40_Sub8.aClass238_9165
                                .method1700((byte) 36);
                        Class348_Sub40_Sub8.aClass238_9165 = null;
                        Class152.method1215((byte) 3);
                        return;
                    }
                    Class299.aClass348_Sub49_Sub2_3813
                            .anInt7197
                            = 0;
                    Class348_Sub49 class348_sub49 = new Class348_Sub49(518);
                    int[] is = new int[4];
                    is[0] = (int) (Math.random() * 9.9999999E7);
                    is[1] = (int) (9.9999999E7 * Math.random());
                    is[3] = (int) (9.9999999E7 * Math.random());
                    is[2] = (int) (9.9999999E7 * Math.random());
                    class348_sub49.method3378(false, 10);
                    class348_sub49.method3391((byte) 91, is[0]);
                    class348_sub49.method3391((byte) 96, is[1]);
                    class348_sub49.method3391((byte) 95, is[2]);
                    class348_sub49.method3391((byte) 127, is[3]);
                    class348_sub49.method3392(0L, (byte) 70);
                    class348_sub49.method3333((byte) -5, Class186.aString2496);
                    class348_sub49.method3392(Class348_Sub33.aLong6966,
                            (byte) -124);
                    class348_sub49.method3392(OutputStream_Sub2.aLong108,
                            (byte) -112);
                    class348_sub49.method3390(Class348_Sub31.aBigInteger6921,
                            (byte) -76,
                            (Class318_Sub1_Sub4
                                    .aBigInteger8762));
                    Class348_Sub3.method2739(0);
                    Class348_Sub47 class348_sub47 = Class203.method1478(true);
                    Class348_Sub49_Sub2 class348_sub49_sub2
                            = (class348_sub47
                            .aClass348_Sub49_Sub2_7116);
                    if ((Class239_Sub12.anInt5969 ^ 0xffffffff) != -3) {
                        class348_sub49_sub2.method3378
                                (false,
                                        Class178.aClass29_2345.anInt400);
                        class348_sub49_sub2.method3337((byte) 107, 0);
                        int i_4_
                                = class348_sub49_sub2.anInt7197;
                        class348_sub49_sub2.method3391((byte) 119, 634);
                        class348_sub49_sub2.method3380
                                (class348_sub49.anInt7197, 0,
                                        class348_sub49.aByteArray7154,
                                        -109);
                        int i_5_
                                = class348_sub49_sub2.anInt7197;
                        class348_sub49_sub2
                                .method3333((byte) -5, Class64_Sub3.aString5600);
                        class348_sub49_sub2.method3378
                                (false, Class348_Sub42_Sub8_Sub2
                                        .aClass230_10434.anInt2987);
                        class348_sub49_sub2
                                .method3378(false, Class348_Sub33.anInt6967);
                        s_Sub2.method4002(class348_sub49_sub2, (byte) 55);
                        class348_sub49_sub2
                                .method3333((byte) -5, Class239_Sub12.aString5966);
                        class348_sub49_sub2.method3391((byte) 106,
                                Class202.anInt2670);
                        Class157.method1244(92, class348_sub49_sub2);
                        class348_sub49_sub2.method3350(i_5_, true, is,
                                (class348_sub49_sub2
                                        .anInt7197));
                        class348_sub49_sub2.method3383
                                (1809639944,
                                        -i_4_ + (class348_sub49_sub2
                                                .anInt7197));
                    } else {
                        if (Class240.anInt4674 != 13)
                            class348_sub49_sub2.method3378
                                    (false,
                                            Class178.aClass29_2342.anInt400);
                        else
                            class348_sub49_sub2.method3378
                                    (false,
                                            Class178.aClass29_2344.anInt400);
                        class348_sub49_sub2.method3337((byte) 107, 0);
                        int i_6_
                                = class348_sub49_sub2.anInt7197;
                        class348_sub49_sub2.method3391((byte) 117, 634);
                        class348_sub49_sub2.method3380
                                (class348_sub49.anInt7197, 0,
                                        class348_sub49.aByteArray7154,
                                        92);
                        int i_7_
                                = class348_sub49_sub2.anInt7197;
                        class348_sub49_sub2
                                .method3333((byte) -5, Class64_Sub3.aString5600);
                        class348_sub49_sub2.method3378(false,
                                (RuntimeException_Sub1
                                        .anInt4596));
                        class348_sub49_sub2.method3378(false,
                                Class348_Sub42_Sub12
                                        .method3229(-71));
                        class348_sub49_sub2.method3337((byte) 107,
                                Class321.anInt4017);
                        class348_sub49_sub2.method3337
                                ((byte) 107, Class348_Sub42_Sub8_Sub2.anInt10432);
                        class348_sub49_sub2.method3378
                                (false,
                                        Class316.aClass348_Sub51_3959
                                                .aClass239_Sub20_7248.method1808(-32350));
                        s_Sub2.method4002(class348_sub49_sub2, (byte) 55);
                        class348_sub49_sub2
                                .method3333((byte) -5, Class239_Sub12.aString5966);
                        class348_sub49_sub2.method3391((byte) 120,
                                Class202.anInt2670);
                        Class348_Sub49 class348_sub49_8_
                                = Class316.aClass348_Sub51_3959.method3427(24);
                        class348_sub49_sub2.method3378(false,
                                (class348_sub49_8_
                                        .anInt7197));
                        class348_sub49_sub2.method3380
                                (class348_sub49_8_.anInt7197, 0,
                                        (class348_sub49_8_
                                                .aByteArray7154),
                                        74);
                        r.aBoolean9719 = true;
                        Class348_Sub49 class348_sub49_9_
                                = new Class348_Sub49(Class348_Sub40_Sub20
                                .aClass348_Sub4_9264
                                .method2746((byte) -76));
                        Class348_Sub40_Sub20.aClass348_Sub4_9264
                                .method2747(1, class348_sub49_9_);
                        class348_sub49_sub2.method3380
                                ((class348_sub49_9_
                                                .aByteArray7154).length,
                                        0,
                                        (class348_sub49_9_
                                                .aByteArray7154),
                                        -73);
                        class348_sub49_sub2
                                .method3337((byte) 107, Class135_Sub1.anInt4718);
                        class348_sub49_sub2.method3392(Class244.aLong4615,
                                (byte) -63);
                        class348_sub49_sub2.method3378
                                (false, Class14_Sub1.aString8605 == null ? 0 : 1);
                        if (Class14_Sub1.aString8605 != null)
                            class348_sub49_sub2.method3333((byte) -5,
                                    (Class14_Sub1
                                            .aString8605));
                        class348_sub49_sub2.method3378
                                (false,
                                        (!Class348_Sub40_Sub31.method3131((byte) 50,
                                                "jagtheora")
                                                ? 0 : 1));
                        Class157.method1244(64, class348_sub49_sub2);
                        class348_sub49_sub2.method3350(i_7_, true, is,
                                (class348_sub49_sub2
                                        .anInt7197));
                        class348_sub49_sub2.method3383
                                (1809639944,
                                        -i_6_ + (class348_sub49_sub2
                                                .anInt7197));
                    }
                    Class348_Sub42_Sub14.method3243(-48, class348_sub47);
                    Class239_Sub18.method1802(0);
                    Class348_Sub23_Sub2.aClass77_9029 = new Class77(is);
                    for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -5; i_10_++)
                        is[i_10_] += 50;
                    Class299.aClass348_Sub49_Sub2_3813.method3406(-111, is);
                    Class225.anInt2955 = 4;
                }
                if (Class225.anInt2955 == 4) {
                    if (!Class348_Sub40_Sub8.aClass238_9165.method1705(1, 94))
                        return;
                    Class348_Sub40_Sub8.aClass238_9165.method1701
                            (1, 0, (byte) -117,
                                    (Class299.aClass348_Sub49_Sub2_3813
                                            .aByteArray7154));
                    int i_11_ = ((Class299.aClass348_Sub49_Sub2_3813
                            .aByteArray7154[0])
                            & 0xff);
                    if (i_11_ != 21) {
                        if (i_11_ == 29)
                            Class225.anInt2955 = 13;
                        else {
                            if ((i_11_ ^ 0xffffffff) == -2) {
                                Class225.anInt2955 = 5;
                                Class14_Sub4.method254(i_11_, (byte) -125);
                                return;
                            }
                            if (i_11_ != 2) {
                                if ((i_11_ ^ 0xffffffff) != -16) {
                                    if ((i_11_ ^ 0xffffffff) == -24
                                            && (Class318_Sub1_Sub1_Sub2.anInt9971
                                            ^ 0xffffffff) > -4) {
                                        Class225.anInt2955 = 1;
                                        Class318_Sub1_Sub1_Sub2.anInt9971++;
                                        Class11.anInt197 = 0;
                                        Class348_Sub40_Sub8.aClass238_9165
                                                .method1700((byte) 36);
                                        Class348_Sub40_Sub8.aClass238_9165
                                                = null;
                                    } else {
                                        Class225.anInt2955 = 0;
                                        Class14_Sub4.method254(i_11_,
                                                (byte) -87);
                                        Class348_Sub40_Sub8.aClass238_9165
                                                .method1700((byte) 36);
                                        Class348_Sub40_Sub8.aClass238_9165
                                                = null;
                                        Class152.method1215((byte) 3);
                                        return;
                                    }
                                    return;
                                }
                                Class225.anInt2955 = 14;
                                Class348_Sub40_Sub25.anInt9341 = -2;
                            } else
                                Class225.anInt2955 = 8;
                        }
                    } else
                        Class225.anInt2955 = 7;
                }
                if ((Class225.anInt2955 ^ 0xffffffff) == -7) {
                    Class348_Sub3.method2739(0);
                    Class348_Sub47 class348_sub47 = Class203.method1478(true);
                    Class348_Sub49_Sub2 class348_sub49_sub2
                            = (class348_sub47
                            .aClass348_Sub49_Sub2_7116);
                    class348_sub49_sub2
                            .method3416(-18, Class348_Sub23_Sub2.aClass77_9029);
                    class348_sub49_sub2.method3408((Class178.aClass29_2351
                                    .anInt400),
                            18676);
                    Class348_Sub42_Sub14.method3243(-87, class348_sub47);
                    Class239_Sub18.method1802(0);
                    Class225.anInt2955 = 4;
                } else if (Class225.anInt2955 == 7) {
                    if (Class348_Sub40_Sub8.aClass238_9165.method1705(1,
                            118)) {
                        Class348_Sub40_Sub8.aClass238_9165.method1701
                                (1, 0, (byte) -109,
                                        (Class299.aClass348_Sub49_Sub2_3813
                                                .aByteArray7154));
                        int i_12_
                                = 0xff & (Class299.aClass348_Sub49_Sub2_3813
                                .aByteArray7154[0]);
                        Class225.anInt2955 = 0;
                        Class63.anInt1121 = (3 + i_12_) * 60;
                        Class14_Sub4.method254(21, (byte) -95);
                        Class348_Sub40_Sub8.aClass238_9165
                                .method1700((byte) 36);
                        Class348_Sub40_Sub8.aClass238_9165 = null;
                        Class152.method1215((byte) 3);
                    }
                } else if (Class225.anInt2955 == 13) {
                    if (Class348_Sub40_Sub8.aClass238_9165.method1705(1,
                            102)) {
                        Class348_Sub40_Sub8.aClass238_9165.method1701
                                (1, 0, (byte) -128,
                                        (Class299.aClass348_Sub49_Sub2_3813
                                                .aByteArray7154));
                        Class225.anInt2955 = 0;
                        Class348_Sub42_Sub7.anInt9541
                                = 0xff & (Class299.aClass348_Sub49_Sub2_3813
                                .aByteArray7154[0]);
                        Class14_Sub4.method254(29, (byte) -97);
                        Class348_Sub40_Sub8.aClass238_9165
                                .method1700((byte) 36);
                        Class348_Sub40_Sub8.aClass238_9165 = null;
                        Class152.method1215((byte) 3);
                    }
                } else if ((Class225.anInt2955 ^ 0xffffffff) == -9) {
                    if (Class348_Sub40_Sub8.aClass238_9165.method1705(1,
                            107)) {
                        Class348_Sub40_Sub8.aClass238_9165.method1701
                                (1, 0, (byte) -107,
                                        (Class299.aClass348_Sub49_Sub2_3813
                                                .aByteArray7154));
                        Class76.anInt1288
                                = 0xff & (Class299.aClass348_Sub49_Sub2_3813
                                .aByteArray7154[0]);
                        Class225.anInt2955 = 9;
                    }
                } else {
                    if ((Class225.anInt2955 ^ 0xffffffff) == -10) {
                        Class348_Sub49_Sub2 class348_sub49_sub2
                                = Class299.aClass348_Sub49_Sub2_3813;
                        if ((Class239_Sub12.anInt5969 ^ 0xffffffff) != -3) {
                            if (!Class348_Sub40_Sub8.aClass238_9165
                                    .method1705(Class76.anInt1288, 107))
                                return;
                            Class348_Sub40_Sub8.aClass238_9165.method1701
                                    (Class76.anInt1288, 0, (byte) 85,
                                            (class348_sub49_sub2
                                                    .aByteArray7154));
                            class348_sub49_sub2.anInt7197
                                    = 0;
                            Class192.anInt2581
                                    = class348_sub49_sub2.method3387(255);
                            Class125.anInt4919
                                    = class348_sub49_sub2.method3387(255);
                            Class348_Sub40_Sub3.aBoolean9103
                                    = class348_sub49_sub2.method3387(255) == 1;
                            Class133.aBoolean1915
                                    = class348_sub49_sub2.method3387(255) == 1;
                            Class52.aBoolean4903
                                    = (class348_sub49_sub2.method3387(255)
                                    ^ 0xffffffff) == -2;
                            Class116.anInt1758
                                    = class348_sub49_sub2.method3372(13638);
                            Class206.aBoolean4888
                                    = (Class116.anInt1758 ^ 0xffffffff) < -1;
                            Class135_Sub1.anInt4716
                                    = class348_sub49_sub2.method3330(842397944);
                            Class322.anInt4026
                                    = class348_sub49_sub2.method3330(842397944);
                            Class206.anInt4870
                                    = class348_sub49_sub2.method3330(842397944);
                            Class170.anInt5065
                                    = class348_sub49_sub2.method3385((byte) -126);
                            Class348_Sub42_Sub6.aClass144_9536
                                    = Class348_Sub23_Sub1.aClass297_8992
                                    .method2232(116, Class170.anInt5065);
                            Class216.anInt4976
                                    = class348_sub49_sub2.method3387(255);
                            Class130_Sub1.anInt5797
                                    = class348_sub49_sub2.method3330(842397944);
                            Class348_Sub6.anInt6632
                                    = class348_sub49_sub2.method3330(842397944);
                            Class290.aBoolean3706
                                    = (class348_sub49_sub2.method3387(255)
                                    ^ 0xffffffff) == -2;
                            Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907
                                    .aString10544
                                    = Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907
                                    .aString10537
                                    = s_Sub2.aString8265
                                    = class348_sub49_sub2.method3371(-13487);
                            Applet_Sub1.anInt37
                                    = class348_sub49_sub2.method3387(255);
                            Class348_Sub1.anInt6551
                                    = class348_sub49_sub2.method3385((byte) -126);
                            aa_Sub2.aClass161_5199 = new Class161();
                            aa_Sub2.aClass161_5199.anInt2143
                                    = class348_sub49_sub2.method3330(842397944);
                            if ((aa_Sub2.aClass161_5199.anInt2143
                                    ^ 0xffffffff)
                                    == -65536)
                                aa_Sub2.aClass161_5199.anInt2143
                                        = -1;
                            aa_Sub2.aClass161_5199.aString2147
                                    = class348_sub49_sub2.method3371(-13487);
                            if (Class55_Sub1.aClass364_5271
                                    != Class8.aClass364_165) {
                                aa_Sub2.aClass161_5199.anInt2138
                                        = (50000
                                        + (aa_Sub2.aClass161_5199
                                        .anInt2143));
                                aa_Sub2.aClass161_5199.anInt2148
                                        = (40000
                                        + (aa_Sub2.aClass161_5199
                                        .anInt2143));
                            }
                            if (Class8.aClass364_165 != Class76.aClass364_1279
                                    && ((Class3.aClass161_125.method1264
                                    ((byte) 94, Class135_Sub2.aClass161_4839))
                                    || (Class3.aClass161_125.method1264
                                    ((byte) 112, (Class348_Sub40_Sub35
                                            .aClass161_9443)))))
                                Class348_Sub42_Sub20.method3283(114);
                        } else {
                            if (!Class348_Sub40_Sub8.aClass238_9165
                                    .method1705(Class76.anInt1288, 93))
                                return;
                            Class348_Sub40_Sub8.aClass238_9165.method1701
                                    (Class76.anInt1288, 0, (byte) 60,
                                            (class348_sub49_sub2
                                                    .aByteArray7154));
                            class348_sub49_sub2.anInt7197
                                    = 0;
                            Class192.anInt2581
                                    = class348_sub49_sub2.method3387(255);
                            Class125.anInt4919
                                    = class348_sub49_sub2.method3387(255);
                            Class348_Sub40_Sub3.aBoolean9103
                                    = class348_sub49_sub2.method3387(255) == 1;
                            Class133.aBoolean1915
                                    = class348_sub49_sub2.method3387(255) == 1;
                            Class52.aBoolean4903
                                    = class348_sub49_sub2.method3387(255) == 1;
                            Class50_Sub2.aBoolean5233
                                    = (class348_sub49_sub2.method3387(255)
                                    ^ 0xffffffff) == -2;
                            Class348_Sub42_Sub11.anInt9591
                                    = class348_sub49_sub2.method3330(842397944);
                            Class206.aBoolean4888
                                    = class348_sub49_sub2.method3387(255) == 1;
                            Class24.anInt359
                                    = class348_sub49_sub2.method3369((byte) 125);
                            Class130.aBoolean1900
                                    = class348_sub49_sub2.method3387(255) == 1;
                            Class348_Sub40_Sub12.aClass263_9195
                                    .method2004(Class130.aBoolean1900, (byte) 25);
                            Exception_Sub1.aClass255_112
                                    .method1934((byte) 11, Class130.aBoolean1900);
                            Class189.aClass278_2529
                                    .method2072((byte) 88, Class130.aBoolean1900);
                        }
                        if ((!Class348_Sub40_Sub3.aBoolean9103
                                || Class52.aBoolean4903)
                                && !Class206.aBoolean4888) {
                            try {
                                Class224.method1617((byte) 125,
                                        Class93.anApplet1530,
                                        "unzap");
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        } else {
                            try {
                                Class224.method1617((byte) 125,
                                        Class93.anApplet1530,
                                        "zap");
                            } catch (Throwable throwable) {
                                if (Class318_Sub1_Sub5.aBoolean8773) {
                                    try {
                                        Class93.anApplet1530.getAppletContext
                                                ().showDocument
                                                (new URL(Class93.anApplet1530
                                                                .getCodeBase(),
                                                                "blank.ws"),
                                                        "tbi");
                                    } catch (Exception exception) {
                                        /* empty */
                                    }
                                }
                            }
                        }
                        if (Class8.aClass364_165
                                == Class55_Sub1.aClass364_5271) {
                            try {
                                Class224.method1617((byte) 125,
                                        Class93.anApplet1530,
                                        "loggedin");
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                        }
                        if ((Class239_Sub12.anInt5969 ^ 0xffffffff) == -3)
                            Class225.anInt2955 = 11;
                        else {
                            Class225.anInt2955 = 0;
                            Class14_Sub4.method254(2, (byte) -92);
                            Class239_Sub19.method1804(8839);
                            Class348_Sub49.method3379(2, 7);
                            Class348_Sub3.aClass114_6584 = null;
                            return;
                        }
                    }
                    if (Class225.anInt2955 == 11) {
                        if (!Class348_Sub40_Sub8.aClass238_9165.method1705(3,
                                94))
                            return;
                        Class348_Sub40_Sub8.aClass238_9165.method1701
                                (3, 0, (byte) 11,
                                        (Class299.aClass348_Sub49_Sub2_3813
                                                .aByteArray7154));
                        Class225.anInt2955 = 12;
                    }
                    if (Class225.anInt2955 == 12) {
                        Class348_Sub49_Sub2 class348_sub49_sub2
                                = Class299.aClass348_Sub49_Sub2_3813;
                        class348_sub49_sub2.anInt7197 = 0;
                        if (class348_sub49_sub2.method3404(-1510)) {
                            if (!Class348_Sub40_Sub8.aClass238_9165
                                    .method1705(1, 110))
                                return;
                            Class348_Sub40_Sub8.aClass238_9165.method1701
                                    (1, 3, (byte) -127,
                                            (class348_sub49_sub2
                                                    .aByteArray7154));
                        }
                        Class348_Sub3.aClass114_6584
                                = (Class14_Sub3.method248(-11271)
                                [class348_sub49_sub2.method3407(15295)]);
                        Class348_Sub40_Sub25.anInt9341
                                = class348_sub49_sub2.method3330(842397944);
                        Class225.anInt2955 = 10;
                    }
                    if ((Class225.anInt2955 ^ 0xffffffff) == -11) {
                        if (Class348_Sub40_Sub8.aClass238_9165.method1705
                                (Class348_Sub40_Sub25.anInt9341, 96)) {
                            Class348_Sub40_Sub8.aClass238_9165.method1701
                                    (Class348_Sub40_Sub25.anInt9341, 0, (byte) 28,
                                            (Class299.aClass348_Sub49_Sub2_3813
                                                    .aByteArray7154));
                            Class299.aClass348_Sub49_Sub2_3813.anInt7197
                                    = 0;
                            Class225.anInt2955 = 0;
                            int i_13_ = Class348_Sub40_Sub25.anInt9341;
                            Class14_Sub4.method254(2, (byte) -124);
                            Class130_Sub1.method1135(0);
                            Class239_Sub5.method1741
                                    (Class299.aClass348_Sub49_Sub2_3813,
                                            (byte) 118);
                            ha.anInt4581 = -1;
                            if (Class348_Sub3.aClass114_6584
                                    != Class19.aClass114_304)
                                Class348_Sub40_Sub26.method3120(-92);
                            else
                                Class90.method853((byte) 99);
                            if ((Class299.aClass348_Sub49_Sub2_3813.anInt7197
                                    ^ 0xffffffff)
                                    != (i_13_ ^ 0xffffffff))
                                throw new RuntimeException
                                        ("lswp pos:"
                                                + (Class299
                                                        .aClass348_Sub49_Sub2_3813
                                                .anInt7197)
                                                + " psize:" + i_13_);
                            Class348_Sub3.aClass114_6584 = null;
                        }
                    } else {
                        int i_14_ = -128 / (-i / 53);
                        if (Class225.anInt2955 == 14) {
                            if ((Class348_Sub40_Sub25.anInt9341 ^ 0xffffffff)
                                    == 1) {
                                if (!Class348_Sub40_Sub8.aClass238_9165
                                        .method1705(2, 106))
                                    return;
                                Class348_Sub40_Sub8.aClass238_9165.method1701
                                        (2, 0, (byte) -128,
                                                (Class299.aClass348_Sub49_Sub2_3813
                                                        .aByteArray7154));
                                Class299.aClass348_Sub49_Sub2_3813.anInt7197
                                        = 0;
                                Class348_Sub40_Sub25.anInt9341
                                        = Class299.aClass348_Sub49_Sub2_3813
                                        .method3330(842397944);
                            }
                            if (Class348_Sub40_Sub8.aClass238_9165.method1705
                                    (Class348_Sub40_Sub25.anInt9341, 117)) {
                                Class348_Sub40_Sub8.aClass238_9165.method1701
                                        (Class348_Sub40_Sub25.anInt9341, 0,
                                                (byte) -104,
                                                (Class299.aClass348_Sub49_Sub2_3813
                                                        .aByteArray7154));
                                Class299.aClass348_Sub49_Sub2_3813.anInt7197
                                        = 0;
                                int i_15_ = Class348_Sub40_Sub25.anInt9341;
                                Class225.anInt2955 = 0;
                                Class14_Sub4.method254(15, (byte) -120);
                                Class312.method2330((byte) 86);
                                Class239_Sub5.method1741
                                        (Class299.aClass348_Sub49_Sub2_3813,
                                                (byte) 118);
                                if (((Class299.aClass348_Sub49_Sub2_3813
                                        .anInt7197)
                                        ^ 0xffffffff)
                                        != (i_15_ ^ 0xffffffff))
                                    throw new RuntimeException
                                            ("lswpr pos:"
                                                    + (Class299
                                                            .aClass348_Sub49_Sub2_3813
                                                    .anInt7197)
                                                    + " psize:" + i_15_);
                                Class348_Sub3.aClass114_6584 = null;
                            }
                        }
                    }
                }
            } catch (IOException ioexception) {
                if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                    Class348_Sub40_Sub8.aClass238_9165.method1700((byte) 36);
                    Class348_Sub40_Sub8.aClass238_9165 = null;
                }
                if (Class318_Sub1_Sub1_Sub2.anInt9971 >= 3) {
                    Class225.anInt2955 = 0;
                    Class14_Sub4.method254(-4, (byte) -87);
                    Class152.method1215((byte) 3);
                } else {
                    if (Class239_Sub12.anInt5969 != 2)
                        Class255.aClass161_3285.method1259(0);
                    else
                        Class3.aClass161_125.method1259(0);
                    Class318_Sub1_Sub1_Sub2.anInt9971++;
                    Class11.anInt197 = 0;
                    Class225.anInt2955 = 1;
                }
            }
        }
    }

    final void method844(Class318_Sub9 class318_sub9, boolean bool) {
        try {
            anInt1495++;
            if (class318_sub9.aClass318_Sub9_6468 != null)
                class318_sub9.method2514(93);
            class318_sub9.aClass318_Sub9_6469
                    = this.aClass318_Sub9_1503;
            class318_sub9.aClass318_Sub9_6468
                    = (this.aClass318_Sub9_1503
                    .aClass318_Sub9_6468);
            if (bool != true)
                this.aClass318_Sub9_1503 = null;
            class318_sub9
                    .aClass318_Sub9_6468.aClass318_Sub9_6469
                    = class318_sub9;
            class318_sub9
                    .aClass318_Sub9_6469.aClass318_Sub9_6468
                    = class318_sub9;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("lh.A("
                            + (class318_sub9 != null ? "{...}"
                            : "null")
                            + ',' + bool + ')'));
        }
    }

    final void method845(byte i) {
        for (; ; ) {
            Class318_Sub9 class318_sub9
                    = (this.aClass318_Sub9_1503
                    .aClass318_Sub9_6469);
            if (class318_sub9 == this.aClass318_Sub9_1503)
                break;
            class318_sub9.method2514(54);
        }
        if (i < 23)
            aClass318_Sub9_1505 = null;
        anInt1493++;
        aClass318_Sub9_1505 = null;
    }

    final Class318_Sub9 method846(byte i) {
        anInt1494++;
        Class318_Sub9 class318_sub9 = aClass318_Sub9_1505;
        if (class318_sub9 == this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null;
            return null;
        }
        if (i > -34)
            aClass318_Sub9_1505 = null;
        aClass318_Sub9_1505
                = class318_sub9.aClass318_Sub9_6469;
        return class318_sub9;
    }

    static final void method847(String string, int i) {
        System.out.println("Error: " + Class341.method2680("\n", true, "%0a",
                string));
        anInt1492++;
        if (i != -5192)
            method843((byte) 17);
    }

    final Class318_Sub9 method848(int i) {
        if (i != 8)
            return null;
        anInt1502++;
        Class318_Sub9 class318_sub9
                = (this.aClass318_Sub9_1503
                .aClass318_Sub9_6469);
        if (class318_sub9 == this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null;
            return null;
        }
        aClass318_Sub9_1505
                = class318_sub9.aClass318_Sub9_6469;
        return class318_sub9;
    }

    public Class88() {
        this.aClass318_Sub9_1503
                .aClass318_Sub9_6468
                = this.aClass318_Sub9_1503;
        this.aClass318_Sub9_1503
                .aClass318_Sub9_6469
                = this.aClass318_Sub9_1503;
    }
}
