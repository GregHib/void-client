/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;

public final class client extends Applet_Sub1 {
    static int anInt5170;
    static int anInt5171 = 0;
    static int anInt5172;
    static int anInt5173;
    static int anInt5174;
    static int anInt5175;
    static int[] anIntArray5176;
    static int anInt5177;
    static int anInt5178;
    static int anInt5179;
    static int anInt5180;
    static int anInt5181;
    static int anInt5182;
    static int anInt5183;
    static int anInt5184;
    static Class262 aClass262_5185 = new Class262();
    static int anInt5186;
    static int anInt5187;
    static int anInt5188;
    /*synthetic*/ static Class aClass5189;
    public static int anInt5190;

    private final void method101(byte i) {
        anInt5179++;
        if (Class348_Sub4.aClass248_6601.anInt3213 > Class239_Sub11.anInt5959) {
            Class3.aClass161_125.method1259(0);
            Class341.anInt4235 = (Class348_Sub4.aClass248_6601.anInt3213 * 50 + -50) * 5;
            if (Class341.anInt4235 > 3000) Class341.anInt4235 = 3000;
            if (Class348_Sub4.aClass248_6601.anInt3213 >= 2 && Class348_Sub4.aClass248_6601.anInt3214 == 6) {
                this.method82(-80, "js5connect_outofdate");
                Class240.anInt4674 = 14;
                return;
            }
            if (Class348_Sub4.aClass248_6601.anInt3213 >= 4 && Class348_Sub4.aClass248_6601.anInt3214 == -1) {
                this.method82(81, "js5crc");
                Class240.anInt4674 = 14;
                return;
            }
            if (Class348_Sub4.aClass248_6601.anInt3213 >= 4 && Class139.method1167(Class240.anInt4674, (byte) -81)) {
                if (Class348_Sub4.aClass248_6601.anInt3214 != 7 && Class348_Sub4.aClass248_6601.anInt3214 != 9) {
                    if (Class348_Sub4.aClass248_6601.anInt3214 <= 0) this.method82(72, "js5io");
                    else if (Class348_Sub31.aString6926 == null) this.method82(-116, "js5connect");
                    else this.method82(113, ("js5proxy_" + Class348_Sub31.aString6926.trim()));
                } else this.method82(-93, "js5connect_full");
                Class240.anInt4674 = 14;
                return;
            }
        }
        Class239_Sub11.anInt5959 = Class348_Sub4.aClass248_6601.anInt3213;
        if (Class341.anInt4235 > 0) Class341.anInt4235--;
        else {
            try {
                if (Class47.anInt846 == 0) {
                    aa.aClass144_114 = Class3.aClass161_125.method1262((Class348_Sub23_Sub1.aClass297_8992), (byte) 36);
                    Class47.anInt846++;
                }
                if (Class47.anInt846 == 1) {
                    if (aa.aClass144_114.anInt1997 == 2) {
                        if (aa.aClass144_114.anObject1998 != null) Class348_Sub31.aString6926 = (String) aa.aClass144_114.anObject1998;
                        method103(1000, (byte) 100);
                        return;
                    }
                    if (aa.aClass144_114.anInt1997 == 1) Class47.anInt846++;
                }
                if (Class47.anInt846 == 2) {
                    Class193.aClass202_2589 = new Class202((Socket) aa.aClass144_114.anObject1998, Class348_Sub23_Sub1.aClass297_8992, 25000);
                    Class348_Sub49 class348_sub49 = new Class348_Sub49(5);
                    class348_sub49.method3378(false, (Class178.aClass29_2341.anInt400));
                    class348_sub49.method3391((byte) 103, 634);
                    Class193.aClass202_2589.method1470((class348_sub49.aByteArray7154), 5, 0, -1);
                    Class47.anInt846++;
                    Class45.aLong667 = Class62.method599(-70);
                }
                if (Class47.anInt846 == 3) {
                    if (Class139.method1167(Class240.anInt4674, (byte) -100) || Class193.aClass202_2589.method1467((byte) 83) > 0) {
                        int i_0_ = Class193.aClass202_2589.method1473(0);
                        if (i_0_ != 0) {
                            method103(i_0_, (byte) 111);
                            return;
                        }
                        Class47.anInt846++;
                    } else if (Class62.method599(-63) - Class45.aLong667 > 30000) {
                        method103(1001, (byte) 85);
                        return;
                    }
                }
                if (Class47.anInt846 == 4) {
                    boolean bool = (Class139.method1167(Class240.anInt4674, (byte) -100) || Class348_Sub42_Sub8.method3196(Class240.anInt4674, -87) || Class340.method2672(Class240.anInt4674, -127));
                    Class267[] class267s = Class267.method2029(105);
                    Class348_Sub49 class348_sub49 = new Class348_Sub49(class267s.length * 4);
                    Class193.aClass202_2589.method1474(class348_sub49.aByteArray7154, 0, (byte) -72, (class348_sub49.aByteArray7154).length);
                    for (int i_1_ = 0; i_1_ < class267s.length; i_1_++)
                        class267s[i_1_].method2030(1, class348_sub49.readInt((byte) -126));
                    Class348_Sub4.aClass248_6601.method1903(false, !bool, Class193.aClass202_2589);
                    Class47.anInt846 = 0;
                    aa.aClass144_114 = null;
                    Class193.aClass202_2589 = null;
                }
                int i_2_ = 127 / ((1 - i) / 60);
            } catch (java.io.IOException ioexception) {
                method103(1002, (byte) 127);
            }
        }
    }

    final void method92(int i) {
        if (Class161.aBoolean2151) Class226.anInt2964 = 64;
        anInt5177++;
        Frame frame = new Frame("Jagex");
        frame.pack();
        frame.dispose();
        Class367_Sub11.method3556(false);
        Class39.aClass112_520 = new Class112(Class348_Sub23_Sub1.aClass297_8992);
        Class348_Sub4.aClass248_6601 = new Class248();
        Class348_Sub42_Sub12.method3230(new int[]{20, 260}, new int[]{1000, 100}, 0);
        if (Class8.aClass364_165 != Class55_Sub1.aClass364_5271) Class308.aByteArrayArray3882 = new byte[50][];
        Class316.aClass348_Sub51_3959 = Class14_Sub3.method247(24916);
        if (Class8.aClass364_165 == Class55_Sub1.aClass364_5271) Class135_Sub2.aClass161_4839.aString2147 = this.getCodeBase().getHost();
        else if (Class315.method2354(Class8.aClass364_165, i ^ ~0x7044)) {
            Class135_Sub2.aClass161_4839.aString2147 = this.getCodeBase().getHost();
            Class135_Sub2.aClass161_4839.anInt2148 = 40000 - -Class135_Sub2.aClass161_4839.anInt2143;
            Class255.aClass161_3285.anInt2148 = Class255.aClass161_3285.anInt2143 + 40000;
            Class135_Sub2.aClass161_4839.anInt2138 = 50000 - -Class135_Sub2.aClass161_4839.anInt2143;
            Class348_Sub40_Sub35.aClass161_9443.anInt2148 = (Class348_Sub40_Sub35.aClass161_9443.anInt2143 + 40000);
            Class255.aClass161_3285.anInt2138 = 50000 - -Class255.aClass161_3285.anInt2143;
            Class348_Sub40_Sub35.aClass161_9443.anInt2138 = (Class348_Sub40_Sub35.aClass161_9443.anInt2143 + 50000);
        } else if (Class76.aClass364_1279 == Class8.aClass364_165) {
            Class135_Sub2.aClass161_4839.aString2147 = "127.0.0.1";
            Class255.aClass161_3285.aString2147 = "127.0.0.1";
            Class135_Sub2.aClass161_4839.anInt2148 = (40000 + Class135_Sub2.aClass161_4839.anInt2143);
            Class348_Sub40_Sub35.aClass161_9443.aString2147 = "127.0.0.1";
            Class255.aClass161_3285.anInt2148 = 40000 - -Class255.aClass161_3285.anInt2143;
            Class348_Sub40_Sub35.aClass161_9443.anInt2148 = 40000 - -Class348_Sub40_Sub35.aClass161_9443.anInt2143;
            Class135_Sub2.aClass161_4839.anInt2138 = (Class135_Sub2.aClass161_4839.anInt2143 + 50000);
            Class255.aClass161_3285.anInt2138 = Class255.aClass161_3285.anInt2143 + 50000;
            Class348_Sub40_Sub35.aClass161_9443.anInt2138 = 50000 - -Class348_Sub40_Sub35.aClass161_9443.anInt2143;
        }
        Class318_Sub6.aShortArray6428 = Class348_Sub26.aShortArray6889 = Class348_Sub42_Sub3.aShortArray9502 = Class336.aShortArray4172 = new short[256];
        if (Class348_Sub42_Sub8_Sub2.aClass230_10434 == Class10.aClass230_186) RuntimeException_Sub1.aBoolean4599 = false;
        if (Class14_Sub4.aClass230_8638 == Class348_Sub42_Sub8_Sub2.aClass230_10434) {
            Class116.aBoolean1759 = true;
            Class136.aShortArrayArray4791 = Class348_Sub8.aShortArrayArray6664;
            Class268.anInt3439 = 16777215;
            Class367_Sub2.aShortArrayArrayArray7290 = Class348_Sub51.aShortArrayArrayArray7262;
            Class268.anInt3444 = 0;
        } else if (Class348_Sub42_Sub8_Sub2.aClass230_10434 == Class239_Sub9.aClass230_5932) {
            Class136.aShortArrayArray4791 = Class268.aShortArrayArray3443;
            Class367_Sub2.aShortArrayArrayArray7290 = Class318_Sub1_Sub3_Sub3.aShortArrayArrayArray10253;
        } else {
            Class136.aShortArrayArray4791 = Class348_Sub40_Sub32.aShortArrayArray9424;
            Class367_Sub2.aShortArrayArrayArray7290 = Class348_Sub12.aShortArrayArrayArray6736;
        }
        Class3.aClass161_125 = Class135_Sub2.aClass161_4839;
        try {
            Class348_Sub40_Sub27.aClipboard9357 = Class79.aClient1367.getToolkit().getSystemClipboard();
        } catch (Exception exception) {
            /* empty */
        }
        Class182.aClass346_2449 = Class348_Sub3.method2743(Class305.aCanvas3869, (byte) -124);
        Class258_Sub4.aClass373_8552 = Class348_Sub18.method2941(Class305.aCanvas3869, 0, true);
        try {
            if (Class348_Sub23_Sub1.aClass297_8992.aClass234_3785 != null) {
                Class299_Sub2.aClass78_6328 = new Class78((Class348_Sub23_Sub1.aClass297_8992.aClass234_3785), 5200, 0);
                for (int i_3_ = 0; i_3_ < 37; i_3_++)
                    Class100.aClass78Array1579[i_3_] = new Class78((Class348_Sub23_Sub1.aClass297_8992.aClass234Array3795[i_3_]), 6000, 0);
                Class235.aClass78_3075 = new Class78((Class348_Sub23_Sub1.aClass297_8992.aClass234_3779), 6000, 0);
                Class277.aClass137_3568 = new Class137(255, Class299_Sub2.aClass78_6328, Class235.aClass78_3075, 500000);
                Class374.aClass78_4538 = new Class78((Class348_Sub23_Sub1.aClass297_8992.aClass234_3788), 24, 0);
                Class348_Sub23_Sub1.aClass297_8992.aClass234_3779 = null;
                Class348_Sub23_Sub1.aClass297_8992.aClass234_3785 = null;
                Class348_Sub23_Sub1.aClass297_8992.aClass234Array3795 = null;
                Class348_Sub23_Sub1.aClass297_8992.aClass234_3788 = null;
            }
        } catch (java.io.IOException ioexception) {
            Class299_Sub2.aClass78_6328 = null;
            Class235.aClass78_3075 = null;
            Class374.aClass78_4538 = null;
            Class277.aClass137_3568 = null;
        }
        if (Class8.aClass364_165 != Class55_Sub1.aClass364_5271) Class298.aBoolean3811 = true;
        Class348_Sub42_Sub16.aString9665 = Class274.aClass274_3495.method2063(Class348_Sub33.anInt6967, 544);
    }

    final void method91(byte i) {
        int i_4_ = anInt5190;
        anInt5181++;
        method110(31);
        Class205.method1497(16384);
        Class260.method1979((byte) 125);
        Class348_Sub42_Sub15.method3247(-74);
        Class274.method2059(i ^ ~0x1f);
        Class9.method216(false);
        Class267.method2026(23377);
        Class31.method328(i ^ 0x6c);
        Class219.method1604(11868);
        Class157.method1246(-83);
        Class348_Sub42.method3161(0);
        Class348.method2713(0);
        Class107.method1004((byte) 16);
        Class356.method3478(false);
        Applet_Sub1.method98(i + 32609);
        Class241.method1860((byte) -89);
        Class231.method1641((byte) 85);
        Class101.method906(-31777);
        ha.method3680(-24016);
        Class348_Sub51.method3430(false);
        Class348_Sub4.method2748(-86);
        Class170.method1310(true);
        Class262.method1994(-13722);
        Class202.method1471((byte) 124);
        Class248.method1897((byte) 119);
        Class112.method1052((byte) -124);
        Class340.method2671(0);
        Class314_Sub1.method2344(i + -108);
        Class45.method390((byte) 10);
        Class78.method786((byte) 0);
        Class60.method584((byte) 116);
        Class261.method1980(i ^ 0xe);
        Class166.method1284(-21165);
        Class268.method2036((byte) 121);
        Class183.method1378(14);
        Class150.method1208(55);
        Class271.method2045((byte) 62);
        Class185.method1395((byte) 82);
        Class263.method2011((byte) -71);
        Class141.method1179((byte) -124);
        Class255.method1931(true);
        Class187.method1407((byte) 124);
        Class84.method825(i + -204);
        Class25.method305((byte) 79);
        Class319.method2545(true);
        Class65.method698(i + -106);
        Class82.method811((byte) -123);
        Class259.method1975((byte) -15);
        Class194.method1441((byte) 18);
        Class217.method1585(-1);
        Class226.method1624(28962);
        Class355.method3473(12949);
        Class238.method1704((byte) -95);
        Class77.method782(1);
        Class348_Sub49_Sub2.method3414(21515);
        Class169.method1300((byte) -128);
        Class348_Sub26.method2998((byte) -35);
        Class361.method3508(2);
        Class237_Sub1.method1698(1);
        Class348_Sub42_Sub14.method3237((byte) 42);
        Class252.method1917(40960);
        Class305.method2294(126);
        Class243.method1873((byte) -120);
        Class46.method442((byte) -84);
        Class57.method530(14);
        Class318_Sub1_Sub3_Sub3_Sub2.method2458(true);
        Class227.method1627((byte) 116);
        Class19.method284((byte) 51);
        Class54.method501(1);
        Class348_Sub49.method3376(i ^ ~0x6d);
        Class348_Sub47.method3323(-44);
        Class318_Sub1_Sub3_Sub3.method2429(-123);
        Class357.method3487(-65);
        Class74.method744((byte) 115);
        Class348_Sub27.method3001(0);
        Class348_Sub34.method3026(true);
        Class348_Sub41.method3155(i + -113);
        Class348_Sub42_Sub8.method3199(i ^ 0x70);
        Class94.method866(-14603);
        Class93.method861(-76);
        Class318.method2374((byte) -125);
        Class81.method810(true);
        Class62.method597((byte) -122);
        Class122.method1086(true);
        Class13.method225((byte) 57);
        Class110_Sub1.method1040(i + 404);
        Class298.method2251(16711680);
        Class161.method1261((byte) 108);
        Class306.method2299((byte) -128);
        RuntimeException_Sub1.method4010(-3);
        Class99.method883((byte) 66);
        Class348_Sub42_Sub16_Sub2.method3264((byte) -24);
        Class172.method1325(-128);
        Class154.method1235((byte) 7);
        Class348_Sub42_Sub17.method3269(true);
        Class17.method265(false);
        Class182.method1375(5616);
        Class64.method609((byte) -52);
        Class36.method355(i + 4189);
        Class190.method1426(25165);
        Class299.method2254(i ^ ~0x39bf);
        Class375.method3613(64);
        Class51.method486(-123);
        Class124.method1096(i ^ 0x11);
        Class2.method171((byte) 72);
        s.method3988(i + -182);
        Class79.method804(-3752);
        Class213.method1564(104);
        Class324.method2572((byte) 23);
        Class234.method1659((byte) -71);
        Class199.method1461((byte) 112);
        Class239_Sub20.method1807((byte) -121);
        Class239_Sub12.method1773((byte) 120);
        Class239_Sub10.method1763(-15596);
        Class239_Sub6.method1746(-15628);
        Class239_Sub1.method1723((byte) 119);
        Class239_Sub9.method1758(-16211);
        Class239_Sub4.method1738(i + 21813);
        Class239_Sub15.method1785(i ^ 0x64);
        Class239_Sub14.method1780(i + -48);
        Class239_Sub21.method1814((byte) -70);
        Class239_Sub2.method1724(-4);
        Class239_Sub24.method1822((byte) 110);
        Class239_Sub25.method1832(1);
        Class239_Sub27.method1841(16878);
        Class239_Sub18.method1799(124);
        Class239_Sub8.method1755(i + -107);
        Class239_Sub22.method1816(1);
        Class239_Sub17.method1794(63);
        Class239_Sub11.method1769(100);
        Class239_Sub26.method1835(i + -28702);
        Class239.method1715(103);
        Class90.method852(6);
        Class365.method3518(i ^ 0x34);
        Exception_Sub1.method140((byte) -126);
        aa.method158((byte) -67);
        za.method3438((byte) 59);
        Class143.method1180((byte) -76);
        Class98.method879(96);
        Class348_Sub1.method2719(11339);
        Class318_Sub1_Sub3.method2412(true);
        Class318_Sub1.method2389(1);
        Class348_Sub16_Sub3.method2871(-65);
        Class163.method1276(i + -199);
        Class10.method218((byte) 119);
        Class66.method713();
        Class351.method3457(true);
        Class273.method2055(1);
        Class348_Sub23_Sub4.method2990((byte) 125);
        Class55_Sub1.method523(119);
        Class348_Sub23_Sub2.method2974(1);
        Class348_Sub23_Sub1.method2968((byte) -116);
        Class348_Sub16_Sub2.method2830(i ^ 0x6c);
        Class363.method3516(124);
        Class15.method255(6725);
        Class20.method287(51);
        Class56.method526(85);
        Class336.method2657((byte) 124);
        Class16.method261((byte) -120);
        Class244.method1880(i + -221);
        Class296.method2225(i + -76);
        Class131.method1136((byte) -98);
        Class106.method999(21745);
        Class28.method318(122);
        Class111.method1047(1);
        Class160.method1254((byte) 62);
        Class75.method746();
        Class311.method2317((byte) 79);
        Class301.method2281(1);
        Class140.method1169(false);
        Class176.method1351(1);
        Class26.method306(true);
        Class250.method1910(0);
        Class121.method1081((byte) 121);
        Class132.method1137(3);
        Class341.method2677(i ^ 0x33);
        Class149.method1200(false);
        Class180.method1366((byte) -43);
        Class76.method772((byte) -113);
        Class30.method322(1);
        Class264.method2018(0);
        Class318_Sub10.method2527();
        Class225.method1619((byte) 108);
        Class27.method316((byte) -94);
        Class291.method2199((byte) 63);
        Class152.method1216((byte) -97);
        Class303.method2286(114);
        Class333.method2645(i + -16777324);
        Class312.method2331(true);
        Class348_Sub21.method2956((byte) 53);
        Class323.method2562();
        Class69.method722(13569);
        Class184.method1386(true);
        Class43.method380(0);
        Class348_Sub36.method3029(126);
        Class348_Sub42_Sub19.method3278(1);
        Class168.method1298(-1);
        Class348_Sub42_Sub16.method3252(353);
        Class47.method445(i ^ 0x6e);
        Class211.method1543(-4524);
        Class318_Sub1_Sub1.method2395((byte) 50);
        Class318_Sub1_Sub2.method2406(i ^ ~0x12);
        Class318_Sub1_Sub4.method2479(i + 19316);
        Class318_Sub1_Sub5.method2484(0);
        Class148.method1198(1010);
        r.method3285(88);
        Class178.method1355(-108);
        Class72.method731();
        Class129.method1126(32);
        Class342.method2682(i ^ 0x29);
        Class162.method1267((byte) 85);
        Class348_Sub33.method3024(-100);
        Class4.method177();
        Class222.method1609((byte) -121);
        Class175.method1349((byte) -121);
        Class368.method3560(-13);
        Class116.method1062((byte) 35);
        Class108.method1013((byte) 114);
        Class348_Sub10.method2785();
        Class359.method3491(1);
        Class348_Sub14.method2805((byte) 113);
        Class277.method2071(-128);
        Class22.method293((byte) -83);
        Class34.method351(80);
        Class146.method1194(10);
        Class218.method1594(-1966608624);
        Class254.method1926(-127);
        Class321.method2549((byte) -85);
        Class348_Sub42_Sub1.method3165((byte) 44);
        Class181.method1369((byte) 2);
        Class174.method1334((byte) -110);
        Class115.method1061(16711680);
        Class308.method2306((byte) -90);
        Class103.method948(false);
        Class281.method2107((byte) 77);
        Class282.method2111((byte) 68);
        Class147.method1195((byte) 127);
        Class91.method857(126);
        Class289.method2191(0);
        Class155.method1236((byte) -110);
        Class200.method1463((byte) 25);
        Class318_Sub6.method2506((byte) -46);
        Class318_Sub1_Sub3_Sub4.method2469(true);
        Class332.method2640(true);
        Class95.method869(3);
        Class327.method2604((byte) -102);
        Class348_Sub42_Sub10.method3217((byte) 61);
        Class138.method1164((byte) -52);
        Class318_Sub1_Sub2_Sub1.method2407(false);
        Class235.method1673(i ^ ~0x75);
        Class318_Sub1_Sub5_Sub2.method2492(1);
        Class318_Sub1_Sub1_Sub1.method2398((byte) -83);
        Class247.method1889(255);
        Class346_Sub1.method2705(i + 14537);
        Class373_Sub2.method3609((byte) 48);
        Class223.method1612((byte) -9);
        Class287.method2180((byte) -72);
        Class195.method1447(i ^ 0x20);
        Class52.method492(i + -216);
        Class369_Sub3.method3574(i ^ 0x4c47);
        Class125.method1109((byte) -22);
        Class288_Sub1.method2190(true);
        Class369_Sub2.method3572(1000000);
        Class288.method2185(2);
        Class158.method1249(true);
        Class339.method2664(i ^ 0x6f);
        Class348_Sub42_Sub5.method3187((byte) -52);
        Class117.method1064(-3);
        Class189.method1421((byte) -85);
        Class348_Sub42_Sub11.method3220((byte) 102);
        if (i != 108) anInt5171 = -60;
        Class348_Sub23.method2962(-31055);
        Class256.method1944(1);
        Class338.method2662(4);
        Canvas_Sub1.method120(false);
        Class44.method387(67);
        Class272.method2048(1);
        IOException_Sub1.method130(i + -100);
        Class331.method2637(i + -108);
        Class313.method2333(false);
        Class24.method296((byte) -99);
        Class3.method176(-1);
        Class316.method2366(true);
        Class344.method2690(-124);
        Class212.method1551();
        Class40.method370(true);
        Class348_Sub42_Sub8_Sub2.method3202((byte) 79);
        Class246.method1886(4908);
        Class348_Sub42_Sub9.method3204(-112);
        Class348_Sub40_Sub8.method3068(i + 13607);
        Class318_Sub1_Sub1_Sub2.method2400((byte) 3);
        Class318_Sub1_Sub3_Sub1.method2415(61);
        Class92.method860((byte) 44);
        Class318_Sub1_Sub5_Sub1.method2490(4);
        Class348_Sub18.method2936((byte) -25);
        Class348_Sub35.method3028(-11677);
        Class348_Sub50.method3418(114);
        Class110.method1030(-24);
        Class283.method2113((byte) 74);
        Class348_Sub43.method3300(0);
        Class204.method1493();
        Class348_Sub16_Sub1.method2823(i + -108);
        Class348_Sub17.method2930((byte) -87);
        Class80.method808();
        Class210.method1536();
        Class348_Sub8.method2775((byte) -127);
        Class279_Sub2.method2097();
        Class245.method1882(25365);
        Class348_Sub23_Sub3.method2981(false);
        Class133.method1139(2767);
        Class348_Sub40.method3040(true);
        Class309.method2310((byte) 69);
        Class292.method2202(-17902);
        Class73.method741((byte) -128);
        Class136.method1159((byte) 112);
        Class177.method1354((byte) -22);
        Class240.method1853((byte) 48);
        Class127.method1117(105);
        Class127_Sub1.method1120(1);
        Class5_Sub2.method193(i + -78);
        Class5.method180(-19960);
        Class369.method3567(i ^ ~0x24);
        Class5_Sub1.method189((byte) 121);
        Class67.method716(1);
        Class265.method2023((byte) -78);
        Class5_Sub1_Sub1.method190((byte) 32);
        Class295.method2223(i ^ 0x5);
        Class71.method728(true);
        Class329.method2621();
        Class294.method2214(0);
        Class128.method1123(-1);
        Class374.method3611(true);
        Class348_Sub42_Sub20.method3280(-109);
        Class318_Sub9_Sub2.method2518(137);
        Class318_Sub7.method2508(i ^ 0x7f93);
        Class156.method1239(30114);
        Class318_Sub2.method2495((byte) 113);
        Class275.method2065(31913);
        Class59.method548(10);
        Class322.method2555((byte) 28);
        Class191.method1431(0);
        Class348_Sub42_Sub9_Sub1.method3207((byte) -120);
        Class345.method2693(3);
        Class348_Sub40_Sub15.method3085(0);
        Class348_Sub40_Sub17.method3091(true);
        Class348_Sub46.method3318((byte) -80);
        Class348_Sub31.method3010(-1316);
        Class49.method453(-2001);
        Class101_Sub1.method911(0);
        Class167.method1293(1);
        ha_Sub2.method3736((byte) 100);
        Class354.method3468(-1401);
        Class100.method886(16);
        Class18.method277((byte) 115);
        Class348_Sub5_Sub1.method2765(2048);
        Class233.method1653(i + 1489574628);
        Class101_Sub3.method938(47);
        Class188.method1411(true);
        Class206.method1499(i + -235);
        Class299_Sub1.method2258((byte) -122);
        Class64_Sub3.method681(i + -14);
        Class123.method1091(-9341);
        Class348_Sub49_Sub1.method3403(84);
        Class258_Sub2.method1962(-1);
        ha_Sub3.method3870(113);
        Class325.method2597(-27327);
        Class68.method719((byte) 72);
        Class269.method2042((byte) -67);
        Class101_Sub2.method925(i + -6105);
        Class251.method1912(8549);
        Class229.method1632(-11);
        Class299_Sub2.method2268(-24054);
        Class173.method1329(4);
        Class280.method2104(88);
        Class130.method1127(5125);
        Class64_Sub2.method676(126);
        Class70.method725(16384);
        Class113.method1057(true);
        Class21.method288((byte) 119);
        Class377.method3968(15);
        Class349.method3450();
        Class348_Sub40_Sub18.method3096(i ^ 0x7ea2);
        Class348_Sub40_Sub19.method3099((byte) -121);
        Class348_Sub40_Sub4.method3057((byte) -54);
        Class348_Sub40_Sub22.method3110(-1633784916);
        Class348_Sub40_Sub37.method3148(true);
        Class348_Sub40_Sub38.method3149(104);
        Class348_Sub40_Sub16.method3087(false);
        Class348_Sub40_Sub7.method3066(-1);
        Class348_Sub40_Sub12.method3077((byte) -98);
        Class348_Sub40_Sub26.method3118((byte) 127);
        Class348_Sub40_Sub36.method3145(0);
        Class348_Sub40_Sub20.method3104(false);
        Class348_Sub40_Sub11.method3075(false);
        Class348_Sub40_Sub5.method3059(-120);
        Class348_Sub40_Sub2.method3053(4);
        Class348_Sub40_Sub17_Sub1.method3092(-1);
        Class348_Sub40_Sub6.method3062(true);
        Class348_Sub40_Sub27.method3121((byte) 104);
        Class348_Sub40_Sub32.method3133((byte) -109);
        Class348_Sub40_Sub33.method3138((byte) -115);
        Class348_Sub40_Sub13.method3080((byte) 111);
        Class348_Sub40_Sub1.method3050(true);
        Class348_Sub40_Sub24.method3115(-114);
        Class348_Sub40_Sub23.method3114((byte) -123);
        Class348_Sub40_Sub39.method3152(255);
        Class348_Sub40_Sub10.method3074(i ^ 0x6c);
        Class348_Sub40_Sub25.method3117(109);
        Class348_Sub40_Sub35.method3144((byte) 119);
        Class348_Sub40_Sub34.method3142(0);
        Class348_Sub40_Sub9.method3071((byte) 59);
        Class348_Sub40_Sub21.method3106((byte) 97);
        Class348_Sub40_Sub28.method3123(i + -108);
        Class348_Sub25.method2996();
        Class216.method1584((byte) -64);
        aa_Sub3.method167(19612);
        Class6.method208((byte) 0);
        Class348_Sub31_Sub2.method3016(65280);
        Class348_Sub1_Sub2.method2731((byte) -23);
        Class11.method221(0);
        Class232.method1645(121);
        Class104.method953((byte) 9);
        s_Sub2.method4000(i ^ 0x216c);
        Class337.method2658(true);
        Class258_Sub1.method1959(-112);
        Class348_Sub5.method2762(108);
        Class286.method2135(0);
        Class83.method815(false);
        Class286_Sub1.method2142((byte) -126);
        Class118.method1075((byte) 17);
        Class48.method448((byte) -16);
        r_Sub2.method3295(i + -109);
        za_Sub1.method3441(1);
        aa_Sub1.method161(114);
        Class348_Sub20.method2950(71);
        Class171.method1322((byte) -28);
        Class348_Sub1_Sub1.method2728((byte) 9);
        Class299_Sub1_Sub2.method2265(-10794);
        Class135_Sub2.method1155((byte) -125);
        Class135.method1149(99);
        Class135_Sub1.method1154((byte) 11);
        Class286_Sub3.method2151(-86);
        Class286_Sub7.method2166(i ^ 0x18ac);
        Class258_Sub4.method1973(24885);
        Class286_Sub5.method2160(0);
        Class286_Sub2.method2147(i ^ ~0x6c);
        Class286_Sub8.method2171(i + -108);
        Class286_Sub6.method2164(true);
        Class286_Sub4.method2156(77);
        Class242.method1866(0);
        Class228.method1628((byte) 54);
        Class209.method1529(true);
        za_Sub2.method3444(i + -198);
        Class353.method3462(-30094);
        Class334.method2654(-6896);
        r_Sub1.method3288((byte) 74);
        Class362.method3512(4);
        Class186_Sub1.method1400(i + -107);
        aa_Sub2.method162((byte) -112);
        s_Sub3.method4006(-43);
        Class348_Sub3.method2738((byte) 82);
        Class330.method2631(127);
        Class299_Sub2_Sub1.method2272(88);
        Class367_Sub3.method3539((byte) -32);
        Class367_Sub4.method3541((byte) 23);
        Class367_Sub8.method3550((byte) -122);
        Class367_Sub10.method3554(i + -107);
        Class59_Sub1.method553(0);
        Class59_Sub2.method564((byte) -54);
        Class186.method1396(25);
        Class249.method1907((byte) 49);
        Class14_Sub1.method242(true);
        Class14.method237(false);
        Class14_Sub4.method251((byte) 2);
        Class367_Sub11.method3557(true);
        Class193.method1440(-127);
        Class367_Sub2.method3537(i ^ 0x864c);
        Class367_Sub9.method3552(i ^ 0x3b);
        Class89.method851(i + -107);
        Class285.method2124(0);
        Class285_Sub2.method2132(-125);
        Class130_Sub1.method1133(96);
        Class328_Sub1.method2610(true);
        Class328_Sub1_Sub1.method2611(-123);
        Class328_Sub3.method2617((byte) 93);
        Class328_Sub2_Sub1.method2614(i ^ 0x4d);
        Class328_Sub2.method2613(-1);
        Class348_Sub29.method3003(-4587);
        Class348_Sub32.method3020((byte) -64);
        Class348_Sub38.method3035(1);
        Class39.method367(-15833);
        Class318_Sub9_Sub1.method2517((byte) 4);
        Class348_Sub42_Sub18.method3274(true);
        Class348_Sub42_Sub6.method3190(false);
        Class348_Sub45.method3314(5);
        Class348_Sub15.method2810((byte) 79);
        Class352.method3458(i + 2564);
        InputStream_Sub2.method127((byte) 118);
        OutputStream_Sub2.method139(88);
        Class126.method1112(1);
        Class358.method3488(64);
        Class348_Sub42_Sub4.method3181((byte) 2);
        Class348_Sub7.method2773(0);
        Class348_Sub12.method2798(122);
        Class348_Sub42_Sub12.method3228(75);
        Class348_Sub11.method2796((byte) 104);
        Class208.method1525((byte) 4);
        OutputStream_Sub1.method133((byte) -41);
        InputStream_Sub1.method124(i ^ 0x6e);
        Class284.method2117(0);
        Class348_Sub24.method2993((byte) 50);
        Class348_Sub6.method2768(3);
        Class348_Sub42_Sub3.method3176(true);
        Class347.method2707(false);
        Class8.method213((byte) -106);
        Class270.method2043(true);
        Class59_Sub2_Sub2.method570(105);
        Class192.method1438(-120);
        Class63.method601((byte) -85);
        Class151.method1209(i + -51);
        Class50.method458(-14487);
        Class50_Sub4.method471(i ^ ~0x751c);
        Class50_Sub3.method469((byte) -62);
        Class50_Sub1.method460(i ^ 0x6e);
        Class59_Sub1_Sub2.method561(120);
        Class59_Sub2_Sub1.method568(true);
        if (Applet_Sub1.aBoolean41) anInt5190 = ++i_4_;
    }

    private final void method102(byte i) {
        if (i != 61) method106();
        anInt5184++;
        boolean bool = Class348_Sub4.aClass248_6601.method1893((byte) 99);
        if (!bool) method101((byte) -112);
    }

    private final void method103(int i, byte i_5_) {
        anInt5182++;
        Class348_Sub4.aClass248_6601.anInt3213++;
        aa.aClass144_114 = null;
        Class348_Sub4.aClass248_6601.anInt3214 = i;
        if (i_5_ > 74) {
            Class47.anInt846 = 0;
            Class193.aClass202_2589 = null;
        }
    }

    final void method80(int i) {
        if (Class184.aBoolean2469) Class318_Sub1_Sub2.method2405(i + -110);
        anInt5170++;
        Class59_Sub1_Sub1.method556(false);
        if (Class348_Sub8.aHa6654 != null) Class348_Sub8.aHa6654.method3635((byte) 89);
        if (Class34.aFrame476 != null) {
            Class56.method527(Class34.aFrame476, Class348_Sub23_Sub1.aClass297_8992, false);
            Class34.aFrame476 = null;
        }
        if (Class348_Sub40_Sub8.aClass238_9165 != null) {
            Class348_Sub40_Sub8.aClass238_9165.method1700((byte) 36);
            Class348_Sub40_Sub8.aClass238_9165 = null;
        }
        Class162.method1265(16);
        Class348_Sub4.aClass248_6601.method1901(i ^ ~0x44);
        Class39.aClass112_520.method1051(true);
        if (Class76.aClass169_1286 != null) {
            Class76.aClass169_1286.method1303((byte) 16);
            Class76.aClass169_1286 = null;
        }
        try {
            Class299_Sub2.aClass78_6328.method790((byte) -62);
            for (int i_6_ = i; i_6_ < 37; i_6_++)
                Class100.aClass78Array1579[i_6_].method790((byte) 118);
            Class235.aClass78_3075.method790((byte) -84);
            Class374.aClass78_4538.method790((byte) 80);
            Class348_Sub46.method3317((byte) -53);
        } catch (Exception exception) {
            /* empty */
        }
    }

    static final void method104(int i) {
        int i_7_ = Class328_Sub1.anInt6513;
        int[] is = Class286_Sub7.anIntArray6290;
        int i_8_ = Class373_Sub2.aBoolean7444 ? i_7_ : i_7_ + Class150.anInt2057;
        for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
            Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3;
            if (i_9_ < i_7_) class318_sub1_sub3_sub3 = (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[is[i_9_]]);
            else class318_sub1_sub3_sub3 = (((Class348_Sub22) Class282.aClass356_3654.method3480(Class74.anIntArray1233[i_9_ - i_7_], -6008)).aClass318_Sub1_Sub3_Sub3_Sub1_6859);
            if (class318_sub1_sub3_sub3.aByte6381 == i) {
                class318_sub1_sub3_sub3.anInt10261 = 0;
                if ((class318_sub1_sub3_sub3.anInt10285) < 0) class318_sub1_sub3_sub3.aBoolean10309 = false;
                else {
                    int i_10_ = class318_sub1_sub3_sub3.method2436((byte) 71);
                    if ((i_10_ & 0x1) == 0) {
                        if (((class318_sub1_sub3_sub3.anInt6377) & 0x1ff) != 0 || ((class318_sub1_sub3_sub3.anInt6388) & 0x1ff) != 0) {
                            class318_sub1_sub3_sub3.aBoolean10309 = false;
                            continue;
                        }
                    } else if (((class318_sub1_sub3_sub3.anInt6377) & 0x1ff) != 256 || ((class318_sub1_sub3_sub3.anInt6388) & 0x1ff) != 256) {
                        class318_sub1_sub3_sub3.aBoolean10309 = false;
                        continue;
                    }
                    if (i_10_ == 1) {
                        int i_11_ = ((class318_sub1_sub3_sub3.anInt6377) >> 9);
                        int i_12_ = ((class318_sub1_sub3_sub3.anInt6388) >> 9);
                        if (class318_sub1_sub3_sub3.anInt10285 != (Class348_Sub42_Sub17.anIntArrayArray9678[i_11_][i_12_])) {
                            class318_sub1_sub3_sub3.aBoolean10309 = true;
                            continue;
                        }
                        if (Class239_Sub8.anIntArrayArray5921[i_11_][i_12_] > 1) {
                            Class239_Sub8.anIntArrayArray5921[i_11_][i_12_]--;
                            class318_sub1_sub3_sub3.aBoolean10309 = true;
                            continue;
                        }
                    } else {
                        int i_13_ = (i_10_ - 1) * 256 + 252;
                        int i_14_ = ((class318_sub1_sub3_sub3.anInt6377) - i_13_ >> 9);
                        int i_15_ = ((class318_sub1_sub3_sub3.anInt6388) - i_13_ >> 9);
                        int i_16_ = ((class318_sub1_sub3_sub3.anInt6377) + i_13_ >> 9);
                        int i_17_ = ((class318_sub1_sub3_sub3.anInt6388) + i_13_ >> 9);
                        if (!Class103.method949(i_15_, i_16_, (class318_sub1_sub3_sub3.anInt10285), (byte) 124, i_14_, i_17_)) {
                            for (int i_18_ = i_14_; i_18_ <= i_16_; i_18_++) {
                                for (int i_19_ = i_15_; i_19_ <= i_17_; i_19_++) {
                                    if (class318_sub1_sub3_sub3.anInt10285 == (Class348_Sub42_Sub17.anIntArrayArray9678[i_18_][i_19_])) Class239_Sub8.anIntArrayArray5921[i_18_][i_19_]--;
                                }
                            }
                            class318_sub1_sub3_sub3.aBoolean10309 = true;
                            continue;
                        }
                    }
                    class318_sub1_sub3_sub3.aBoolean10309 = false;
                    class318_sub1_sub3_sub3.anInt6382 = Class275.method2064((class318_sub1_sub3_sub3.anInt6377), (class318_sub1_sub3_sub3.aByte6381), 11219, (class318_sub1_sub3_sub3.anInt6388));
                    Class89.method850(class318_sub1_sub3_sub3, true);
                }
            }
        }
    }

    static final Class348_Sub44 method105(Class46 class46) {
        Class348_Sub44 class348_sub44 = (Class348_Sub44) (Class226.aClass356_2959.method3480((((long) class46.anInt830 << 32) + (long) class46.anInt704), -6008));
        if (class348_sub44 != null) return class348_sub44;
        return class46.aClass348_Sub44_748;
    }

    static final void method106() {
        Class45.anInt669 = 0;
        for (int i = 0; i < Class150.anInt2057; i++) {
            Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = (((Class348_Sub22) Class282.aClass356_3654.method3480(Class74.anIntArray1233[i], -6008)).aClass318_Sub1_Sub3_Sub3_Sub1_6859);
            if ((class318_sub1_sub3_sub3_sub1.aBoolean10309) && class318_sub1_sub3_sub3_sub1.method2425(-1) != -1) {
                int i_20_ = ((class318_sub1_sub3_sub3_sub1.method2436((byte) 119) - 1) * 256 + 252);
                int i_21_ = (class318_sub1_sub3_sub3_sub1.anInt6377 - i_20_) >> 9;
                int i_22_ = (class318_sub1_sub3_sub3_sub1.anInt6388 - i_20_) >> 9;
                Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3 = Class84.method817(252, i_21_, (class318_sub1_sub3_sub3_sub1.aByte6381), i_22_);
                if (class318_sub1_sub3_sub3 != null) {
                    int i_23_ = (class318_sub1_sub3_sub3.anInt10290);
                    if (class318_sub1_sub3_sub3 instanceof Class318_Sub1_Sub3_Sub3_Sub1) i_23_ += 2048;
                    if ((class318_sub1_sub3_sub3.anInt10261) == 0 && class318_sub1_sub3_sub3.method2425(-1) != -1) {
                        Class258_Sub4.anIntArray8557[Class45.anInt669] = i_23_;
                        Class268.anIntArray3432[Class45.anInt669] = i_23_;
                        Class45.anInt669++;
                        class318_sub1_sub3_sub3.anInt10261++;
                    }
                    Class258_Sub4.anIntArray8557[Class45.anInt669] = i_23_;
                    Class268.anIntArray3432[Class45.anInt669] = class318_sub1_sub3_sub3_sub1.anInt10290 + 2048;
                    Class45.anInt669++;
                    class318_sub1_sub3_sub3.anInt10261++;
                }
            }
        }
        Class34.method347(Class268.anIntArray3432, Class258_Sub4.anIntArray8557, 0, -22222, Class45.anInt669 - 1);
    }

    public static final void main(String[] strings) {
        try {
            try {
                if (strings.length != 6) Class55.method518("Argument count", (byte) 44);
                Class135_Sub2.aClass161_4839 = new Class161();
                Class135_Sub2.aClass161_4839.anInt2143 = Integer.parseInt(strings[0]);
                Class255.aClass161_3285 = new Class161();
                Class255.aClass161_3285.anInt2143 = Integer.parseInt(strings[1]);
                Class348_Sub40_Sub35.aClass161_9443 = new Class161();
                Class348_Sub40_Sub35.aClass161_9443.anInt2143 = Integer.parseInt(strings[2]);
                Class8.aClass364_165 = Class76.aClass364_1279;
                if (strings[3].equals("live")) Class11.aClass231_196 = Class68.aClass231_1189;
                else if (!strings[3].equals("rc")) {
                    if (strings[3].equals("wip")) Class11.aClass231_196 = Class288.aClass231_4953;
                    else Class55.method518("modewhat", (byte) 41);
                } else Class11.aClass231_196 = Class348_Sub40_Sub20.aClass231_9263;
                Class348_Sub33.anInt6967 = Class27.method315((byte) 103, strings[4]);
                if (Class348_Sub33.anInt6967 == -1) {
                    if (!strings[4].equals("english")) {
                        if (strings[4].equals("german")) Class348_Sub33.anInt6967 = 1;
                        else Class55.method518("language", (byte) -128);
                    } else Class348_Sub33.anInt6967 = 0;
                }
                Class348_Sub37.aBoolean6997 = false;
                Class289.aBoolean3697 = false;
                if (!strings[5].equals("game0")) {
                    if (!strings[5].equals("game1")) {
                        if (!strings[5].equals("game2")) {
                            if (!strings[5].equals("game3")) Class55.method518("game", (byte) -124);
                            else Class348_Sub42_Sub8_Sub2.aClass230_10434 = Class239_Sub9.aClass230_5932;
                        } else Class348_Sub42_Sub8_Sub2.aClass230_10434 = Class286_Sub6.aClass230_6262;
                    } else Class348_Sub42_Sub8_Sub2.aClass230_10434 = Class14_Sub4.aClass230_8638;
                } else Class348_Sub42_Sub8_Sub2.aClass230_10434 = Class10.aClass230_186;
                Class161.aBoolean2151 = false;
                Class239_Sub12.aString5966 = "";
                Class244.aLong4615 = 0L;
                Class348_Sub23_Sub3.aString9043 = null;
                Class202.anInt2670 = 0;
                Class206.aBoolean4888 = Class155.aBoolean2110 = true;
                Class375.aBoolean4540 = false;
                Class251.anInt3234 = 0;
                Class222.anInt2884 = (Class348_Sub42_Sub8_Sub2.aClass230_10434.anInt2987);
                ha.anInt4583 = 0;
                Class14_Sub1.aString8605 = null;
                client var_client = new client();
                Class79.aClient1367 = var_client;
                var_client.method96(Class11.aClass231_196.method1640(0) + 32, 1024, false, 634, 37, (Class348_Sub42_Sub8_Sub2.aClass230_10434.aString2985), 23499, 768);
                Class52.aFrame4904.setLocation(40, 40);
            } catch (Exception exception) {
                Class156.method1242(null, exception, 15004);
            }
            anInt5178++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "client.main(" + (strings != null ? "{...}" : "null") + ')');
        }
    }

    final void method99(byte i) {
        if (i != 93) anIntArray5176 = null;
        anInt5183++;
        if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 2) {
            try {
                method114(i ^ 0x66);
            } catch (Throwable throwable) {
                Class156.method1242((throwable.getMessage() + " (Recovered) " + method81((byte) 115)), throwable, 15004);
                Class139.aBoolean1952 = true;
                Class367_Sub10.method3553(false, (byte) 102, 0);
            }
        } else method114(123);
    }

    public final void init() {
        anInt5180++;
        if (this.method89(48)) {
            Class135_Sub2.aClass161_4839 = new Class161();
            Class135_Sub2.aClass161_4839.anInt2143 = Integer.parseInt(this.getParameter("worldid"));
            Class255.aClass161_3285 = new Class161();
            Class255.aClass161_3285.anInt2143 = Integer.parseInt(this.getParameter("lobbyid"));
            Class255.aClass161_3285.aString2147 = this.getParameter("lobbyaddress");
            Class348_Sub40_Sub35.aClass161_9443 = new Class161();
            Class348_Sub40_Sub35.aClass161_9443.anInt2143 = Integer.parseInt(this.getParameter("demoid"));
            Class348_Sub40_Sub35.aClass161_9443.aString2147 = this.getParameter("demoaddress");
            Class8.aClass364_165 = (Class348_Sub8.method2776((byte) -93, Integer.parseInt(this.getParameter("modewhere"))));
            if (Class76.aClass364_1279 == Class8.aClass364_165) Class8.aClass364_165 = Class108.aClass364_1657;
            else if (!Class315.method2354(Class8.aClass364_165, -1) && Class55_Sub1.aClass364_5271 != Class8.aClass364_165) Class8.aClass364_165 = Class55_Sub1.aClass364_5271;
            Class11.aClass231_196 = (Class237.method1677(-121, Integer.parseInt(this.getParameter("modewhat"))));
            if (Class11.aClass231_196 != Class288.aClass231_4953 && Class11.aClass231_196 != Class348_Sub40_Sub20.aClass231_9263 && Class68.aClass231_1189 != Class11.aClass231_196) Class11.aClass231_196 = Class68.aClass231_1189;
            try {
                Class348_Sub33.anInt6967 = Integer.parseInt(this.getParameter("lang"));
            } catch (Exception exception) {
                Class348_Sub33.anInt6967 = 0;
            }
            String string = this.getParameter("objecttag");
            Class348_Sub37.aBoolean6997 = string != null && string.equals("1");
            String string_24_ = this.getParameter("js");
            Class289.aBoolean3697 = string_24_ != null && string_24_.equals("1");
            String string_25_ = this.getParameter("advert");
            Class318_Sub1_Sub5.aBoolean8773 = string_25_ != null && string_25_.equals("1");
            String string_26_ = this.getParameter("game");
            if (string_26_ != null) {
                if (string_26_.equals("0")) Class348_Sub42_Sub8_Sub2.aClass230_10434 = Class10.aClass230_186;
                else if (string_26_.equals("1")) Class348_Sub42_Sub8_Sub2.aClass230_10434 = Class14_Sub4.aClass230_8638;
                else if (!string_26_.equals("2")) {
                    if (string_26_.equals("3")) Class348_Sub42_Sub8_Sub2.aClass230_10434 = Class239_Sub9.aClass230_5932;
                } else Class348_Sub42_Sub8_Sub2.aClass230_10434 = Class286_Sub6.aClass230_6262;
            }
            try {
                Class202.anInt2670 = Integer.parseInt(this.getParameter("affid"));
            } catch (Exception exception) {
                Class202.anInt2670 = 0;
            }
            Class116.aString1761 = this.getParameter("quiturl");
            Class239_Sub12.aString5966 = this.getParameter("settings");
            if (Class239_Sub12.aString5966 == null) Class239_Sub12.aString5966 = "";
            Class330.aBoolean4127 = "1".equals(this.getParameter("under"));
            String string_27_ = this.getParameter("country");
            if (string_27_ != null) {
                try {
                    ha.anInt4583 = Integer.parseInt(string_27_);
                } catch (Exception exception) {
                    ha.anInt4583 = 0;
                }
            }
            Class222.anInt2884 = Integer.parseInt(this.getParameter("colourid"));
            if (Class222.anInt2884 < 0 || Class135.aColorArray1928.length <= Class222.anInt2884) Class222.anInt2884 = 0;
            if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) Class206.aBoolean4888 = Class155.aBoolean2110 = true;
            String string_28_ = this.getParameter("frombilling");
            if (string_28_ != null && string_28_.equals("true")) Class375.aBoolean4540 = true;
            Class348_Sub23_Sub3.aString9043 = this.getParameter("sskey");
            if (Class348_Sub23_Sub3.aString9043 != null && Class348_Sub23_Sub3.aString9043.length() < 2) Class348_Sub23_Sub3.aString9043 = null;
            String string_29_ = this.getParameter("force64mb");
            if (string_29_ != null && string_29_.equals("true")) Class161.aBoolean2151 = true;
            String string_30_ = this.getParameter("worldflags");
            if (string_30_ != null) {
                try {
                    Class251.anInt3234 = Integer.parseInt(string_30_);
                } catch (Exception exception) {
                    /* empty */
                }
            }
            String string_31_ = this.getParameter("userFlow");
            if (string_31_ != null) {
                try {
                    Class244.aLong4615 = Long.parseLong(string_31_);
                } catch (NumberFormatException numberformatexception) {
                    /* empty */
                }
            }
            Class14_Sub1.aString8605 = this.getParameter("additionalInfo");
            if (Class14_Sub1.aString8605 != null && Class14_Sub1.aString8605.length() > 50) Class14_Sub1.aString8605 = null;
            if (Class10.aClass230_186 == Class348_Sub42_Sub8_Sub2.aClass230_10434) {
                ha_Sub2.anInt7666 = 503;
                Class92.anInt1524 = 765;
            } else if (Class348_Sub42_Sub8_Sub2.aClass230_10434 == Class14_Sub4.aClass230_8638) {
                Class92.anInt1524 = 640;
                ha_Sub2.anInt7666 = 480;
            }
            Class79.aClient1367 = this;
            this.method95(Class92.anInt1524, 634, ha_Sub2.anInt7666, Class11.aClass231_196.method1640(0) + 32, 37, Class348_Sub42_Sub8_Sub2.aClass230_10434.aString2985, 50);
        }
    }

    static final void method107(Class46[] class46s, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
        for (int i_42_ = 0; i_42_ < class46s.length; i_42_++) {
            Class46 class46 = class46s[i_42_];
            if (class46 != null && class46.anInt834 == i) {
                int i_43_ = class46.anInt800 + i_36_;
                int i_44_ = class46.anInt750 + i_37_;
                int i_45_;
                int i_46_;
                int i_47_;
                int i_48_;
                if (class46.anInt774 == 2) {
                    i_45_ = i_32_;
                    i_46_ = i_33_;
                    i_47_ = i_34_;
                    i_48_ = i_35_;
                } else {
                    int i_49_ = i_43_ + class46.anInt709;
                    int i_50_ = i_44_ + class46.anInt789;
                    if (class46.anInt774 == 9) {
                        i_49_++;
                        i_50_++;
                    }
                    i_45_ = Math.max(i_43_, i_32_);
                    i_46_ = Math.max(i_44_, i_33_);
                    i_47_ = Math.min(i_49_, i_34_);
                    i_48_ = Math.min(i_50_, i_35_);
                }
                if (class46.anInt774 != 0 && !class46.aBoolean682 && method105(class46).anInt7098 == 0 && class46 != Class331.aClass46_4130 && class46.anInt765 != Class290.anInt3717 && (class46.anInt765 != Class348_Sub47.anInt7125)) {
                    if (i_45_ < i_47_ && i_46_ < i_48_) Class18.method273(class46, -2835);
                } else if (!method111(class46)) {
                    int i_51_ = 0;
                    int i_52_ = 0;
                    if (Class59_Sub1.aBoolean5300) {
                        i_51_ = s_Sub3.method4008((byte) -128);
                        i_52_ = Class16.method260(false);
                    }
                    if (class46 == Class289.aClass46_3701 && Exception_Sub1.method141(Class289.aClass46_3701, (byte) 125) != null) {
                        Class50_Sub1.aBoolean5221 = true;
                        ha_Sub3.anInt8001 = i_43_;
                        Class348_Sub40_Sub13.anInt9203 = i_44_;
                    }
                    if (class46.aBoolean676 || i_45_ < i_47_ && i_46_ < i_48_) {
                        if (class46.aBoolean776 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) {
                            for (Class348_Sub36 class348_sub36 = (Class348_Sub36) Class348_Sub1_Sub2.aClass262_8810.method1995(4); class348_sub36 != null; class348_sub36 = ((Class348_Sub36) Class348_Sub1_Sub2.aClass262_8810.method1990((byte) 71))) {
                                if (class348_sub36.aBoolean6993) {
                                    class348_sub36.method2715((byte) 65);
                                    class348_sub36.aClass46_6989.aBoolean737 = false;
                                }
                            }
                            if (Class318_Sub1.anInt6392 == 0) {
                                Class289.aClass46_3701 = null;
                                Class331.aClass46_4130 = null;
                            }
                            Class348_Sub42.anInt7059 = 0;
                            Class246.aBoolean3174 = false;
                            Class237.aBoolean3103 = false;
                            if (!Class5_Sub1.aBoolean8335) Class64_Sub2.method661((byte) 111);
                        }
                        boolean bool;
                        bool = (Class258_Sub4.aClass373_8552.method3597(true) + i_51_) >= i_45_ && Class258_Sub4.aClass373_8552.method3594((byte) 89) + i_52_ >= i_46_ && (Class258_Sub4.aClass373_8552.method3597(true) + i_51_) < i_47_ && Class258_Sub4.aClass373_8552.method3594((byte) 74) + i_52_ < i_48_;
                        if (!r.aBoolean9722 && bool) {
                            if (class46.anInt719 >= 0) Class362.anInt4458 = class46.anInt719;
                            else if (class46.aBoolean776) Class362.anInt4458 = -1;
                        }
                        if (!Class5_Sub1.aBoolean8335 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) Class239_Sub17.method1797(i_41_ - i_44_, i_40_ - i_43_, class46, (byte) -95);
                        boolean bool_53_ = false;
                        if (Class258_Sub4.aClass373_8552.method3595(-91) && bool) bool_53_ = true;
                        boolean bool_54_ = false;
                        Class348_Sub45 class348_sub45 = ((Class348_Sub45) Class318_Sub1_Sub3.aClass262_8744.method1995(4));
                        if (class348_sub45 != null && class348_sub45.method3310(109) == 0 && (class348_sub45.method3308((byte) -128) + i_51_ >= i_45_) && class348_sub45.method3311(33) + i_52_ >= i_46_ && (class348_sub45.method3308((byte) -127) + i_51_ < i_47_) && class348_sub45.method3311(8) + i_52_ < i_48_)
                            bool_54_ = true;
                        if (class46.aByteArray746 != null && !Class348_Sub42_Sub16_Sub2.method3263(true)) {
                            for (int i_55_ = 0; (i_55_ < class46.aByteArray746.length); i_55_++) {
                                if (!Class182.aClass346_2449.method2696(class46.aByteArray746[i_55_], -122)) {
                                    if (class46.anIntArray801 != null) class46.anIntArray801[i_55_] = 0;
                                } else if ((class46.anIntArray801 == null) || (Class367_Sub11.anInt7396 >= (class46.anIntArray801[i_55_]))) {
                                    byte i_56_ = (class46.aByteArray832[i_55_]);
                                    if (i_56_ == 0 || (((i_56_ & 0x8) == 0 || (!Class182.aClass346_2449.method2696(86, -124) && !Class182.aClass346_2449.method2696(82, -123) && !(Class182.aClass346_2449.method2696(81, -122)))) && ((i_56_ & 0x2) == 0 || Class182.aClass346_2449.method2696(86, -127)) && ((i_56_ & 0x1) == 0 || Class182.aClass346_2449.method2696(82, -124)) && ((i_56_ & 0x4) == 0 || (Class182.aClass346_2449.method2696(81, -126))))) {
                                        if (i_55_ < 10) Class348_Sub9.method2780(-1, "", (byte) 122, i_55_ + 1, class46.anInt830);
                                        else if (i_55_ == 10) {
                                            Class341.method2678(-2049);
                                            Class348_Sub44 class348_sub44 = method105(class46);
                                            Class339.method2666(class348_sub44.anInt7093, class348_sub44.method3307(110), class46, (byte) 21);
                                            Class28.aString5001 = Class239_Sub8.method1753(0, class46);
                                            if (Class28.aString5001 == null) Class28.aString5001 = "Null";
                                            Class28.aString5000 = ((class46.aString752) + "<col=ffffff>");
                                        }
                                        int i_57_ = (class46.anIntArray707[i_55_]);
                                        if (class46.anIntArray801 == null) class46.anIntArray801 = (new int
                                                [(class46.aByteArray746).length]);
                                        if (i_57_ != 0) class46.anIntArray801[i_55_] = (Class367_Sub11.anInt7396 + i_57_);
                                        else class46.anIntArray801[i_55_] = 2147483647;
                                    }
                                }
                            }
                        }
                        if (bool_54_) Class100.method887(class46, (i_51_ + class348_sub45.method3308((byte) -127) - i_43_), (i_52_ + class348_sub45.method3311(-114) - i_44_), 2147483647);
                        if (Class289.aClass46_3701 != null && Class289.aClass46_3701 != class46 && bool && method105(class46).method3302(17356)) Class318_Sub1_Sub3_Sub4.aClass46_10336 = class46;
                        if (class46 == Class331.aClass46_4130) {
                            Class127_Sub1.aBoolean8386 = true;
                            Class348_Sub40_Sub37.anInt9461 = i_43_;
                            Class40.anInt558 = i_44_;
                        }
                        if (class46.aBoolean682 || class46.anInt765 != 0) {
                            if (bool && Class98.anInt1565 != 0 && (class46.anObjectArray803 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aBoolean6993 = true;
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anInt6995 = Class98.anInt1565;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray803;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                            if (Class289.aClass46_3701 != null || Class5_Sub1.aBoolean8335 || ((class46.anInt765 != Class348_Sub45.anInt7102) && Class348_Sub42.anInt7059 > 0)) {
                                bool_54_ = false;
                                bool_53_ = false;
                                bool = false;
                            }
                            if (class46.anInt765 != 0) {
                                if ((class46.anInt765 == Class239_Sub10.anInt5943) || (class46.anInt765 == Class312.anInt3932)) {
                                    Class348_Sub1.aClass46_6561 = class46;
                                    if (Class259.aClass305_3304 != null) Class259.aClass305_3304.method2292(123, Class348_Sub8.aHa6654, class46.anInt789);
                                    if (class46.anInt765 == Class239_Sub10.anInt5943) {
                                        if (!Class5_Sub1.aBoolean8335 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) {
                                            Class239_Sub24.method1823(Class348_Sub8.aHa6654, i_38_, i_39_, (byte) -50);
                                            for (Class318_Sub6 class318_sub6 = ((Class318_Sub6) InputStream_Sub2.aClass243_83.method1872(8)); class318_sub6 != null; class318_sub6 = ((Class318_Sub6) (InputStream_Sub2.aClass243_83.method1878((byte) -67)))) {
                                                if (i_40_ >= (class318_sub6.anInt6429) && (i_40_ < (class318_sub6.anInt6426)) && (i_41_ >= (class318_sub6.anInt6427)) && (i_41_ < (class318_sub6.anInt6425))) {
                                                    Class64_Sub2.method661((byte) 107);
                                                    Class239_Sub13.method1777(-3, (class318_sub6.aClass318_Sub1_Sub3_Sub3_6431));
                                                }
                                            }
                                        }
                                        continue;
                                    }
                                }
                                if (class46.anInt765 == Class290.anInt3717) {
                                    if (class46.method425((Class348_Sub8.aHa6654), (byte) 3) != null && (Class259.anInt3306 == 0 || Class259.anInt3306 == 3) && !Class5_Sub1.aBoolean8335 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) {
                                        int i_58_ = i_40_ - i_43_;
                                        int i_59_ = i_41_ - i_44_;
                                        int i_60_ = (class46.anIntArray677[i_59_]);
                                        if (i_58_ >= i_60_ && (i_58_ <= i_60_ + (class46.anIntArray772[i_59_]))) {
                                            i_58_ -= (class46.anInt709) / 2;
                                            i_59_ -= (class46.anInt789) / 2;
                                            int i_61_;
                                            if (Class348_Sub40_Sub21.anInt9282 == 4) i_61_ = ((int) (Class314.aFloat3938) & 0x3fff);
                                            else i_61_ = (((int) (Class314.aFloat3938) + r_Sub2.anInt10483) & 0x3fff);
                                            int i_62_ = (Class70.anIntArray1207[i_61_]);
                                            int i_63_ = (Class70.anIntArray1204[i_61_]);
                                            if (Class348_Sub40_Sub21.anInt9282 != 4) {
                                                i_62_ = (i_62_ * ((Class348_Sub49_Sub1.anInt9750) + 256)) >> 8;
                                                i_63_ = (i_63_ * ((Class348_Sub49_Sub1.anInt9750) + 256)) >> 8;
                                            }
                                            int i_64_ = ((i_59_ * i_62_ + i_58_ * i_63_) >> 14);
                                            int i_65_ = ((i_59_ * i_63_ - i_58_ * i_62_) >> 14);
                                            int i_66_;
                                            int i_67_;
                                            if (Class348_Sub40_Sub21.anInt9282 == 4) {
                                                i_66_ = (Class348_Sub6.anInt6633 >> 9) + (i_64_ >> 2);
                                                i_67_ = (Class348_Sub7.anInt6652 >> 9) - (i_65_ >> 2);
                                            } else {
                                                int i_68_ = ((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.method2436((byte) 51)) - 1) * 256;
                                                i_66_ = ((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6377) - i_68_ >> 9) + (i_64_ >> 2);
                                                i_67_ = ((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6388) - i_68_ >> 9) - (i_65_ >> 2);
                                            }
                                            if (r.aBoolean9722 && ((Class38.anInt500 & 0x40) != 0)) {
                                                Class46 class46_69_ = (Class348_Sub22.method2957(Class9.anInt169, (byte) -54, Class149.anInt2046));
                                                if (class46_69_ != null) Class50_Sub3.method466(false, " ->", i_67_, (byte) -109, true, i_66_, (class46.anInt812), true, 15, ((class46.anInt704) << 0) | (class46.anInt830), Class28.aString5001, 1L, (Class348_Sub49_Sub1.anInt9747));
                                                else Class341.method2678(-2049);
                                            } else {
                                                if ((Class348_Sub42_Sub8_Sub2.aClass230_10434) == (Class14_Sub4.aClass230_8638)) Class50_Sub3.method466(false, "", i_67_, (byte) -116, true, i_66_, -1, true, 12, 0L, (Class274.aClass274_3510.method2063((Class348_Sub33.anInt6967), 544)), 1L, -1);
                                                Class50_Sub3.method466(false, "", i_67_, (byte) -93, true, i_66_, -1, true, 19, 0L, Class239_Sub4.aString5882, 1L, Class333.anInt4144);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (class46.anInt765 == Class348_Sub45.anInt7102) {
                                    Class168.aClass46_2249 = class46;
                                    if (bool) Class246.aBoolean3174 = true;
                                    if (bool_54_) {
                                        int i_70_ = (int) ((double) (i_51_ + (class348_sub45.method3308((byte) -127)) - i_43_ - ((class46.anInt709) / 2)) * 2.0 / (double) (Class75.aFloat1247));
                                        int i_71_ = (int) -((double) (i_52_ + (class348_sub45.method3311(-111)) - i_44_ - ((class46.anInt789) / 2)) * 2.0 / (double) (Class75.aFloat1247));
                                        int i_72_ = (Class348_Sub36.anInt6992 + i_70_ + Class75.anInt1266);
                                        int i_73_ = (Class245.anInt3170 + i_71_ + Class75.anInt1263);
                                        Class348_Sub42_Sub14 class348_sub42_sub14 = Class163.method1269(-17096);
                                        if (class348_sub42_sub14 != null) {
                                            int[] is = new int[3];
                                            class348_sub42_sub14.method3239(true, i_73_, i_72_, is);
                                            if (is != null) {
                                                if (Class182.aClass346_2449.method2696(82, -128) && (Class192.anInt2581 > 0)) {
                                                    Class361.method3502(is[2], 2, is[0], is[1]);
                                                    continue;
                                                }
                                                Class237.aBoolean3103 = true;
                                                Class348_Sub40_Sub26.anInt9349 = is[0];
                                                InputStream_Sub2.anInt85 = is[1];
                                                Class79.anInt1404 = is[2];
                                            }
                                            Class348_Sub42.anInt7059 = 1;
                                            Class348_Sub17.aBoolean6788 = false;
                                            Class318_Sub4.anInt6411 = Class258_Sub4.aClass373_8552.method3597(true);
                                            Class219.anInt2872 = Class258_Sub4.aClass373_8552.method3594((byte) 72);
                                        }
                                    } else if (bool_53_ && (Class348_Sub42.anInt7059 > 0)) {
                                        if (Class348_Sub42.anInt7059 == 1 && ((Class318_Sub4.anInt6411 != Class258_Sub4.aClass373_8552.method3597(true)) || (Class219.anInt2872 != (Class258_Sub4.aClass373_8552.method3594((byte) 117))))) {
                                            Class183.anInt2464 = Class348_Sub36.anInt6992;
                                            s_Sub2.anInt8237 = Class245.anInt3170;
                                            Class348_Sub42.anInt7059 = 2;
                                        }
                                        if (Class348_Sub42.anInt7059 == 2) {
                                            Class348_Sub17.aBoolean6788 = true;
                                            Class64_Sub3.method689((byte) -59, (Class183.anInt2464 + (int) ((double) ((Class318_Sub4.anInt6411) - (Class258_Sub4.aClass373_8552.method3597(true))) * 2.0 / (double) (Class75.aFloat1249))));
                                            Class286_Sub8.method2170((s_Sub2.anInt8237 - (int) ((double) ((Class219.anInt2872) - (Class258_Sub4.aClass373_8552.method3594((byte) 83))) * 2.0 / (double) (Class75.aFloat1249))), (byte) 3);
                                        }
                                    } else {
                                        if (Class348_Sub42.anInt7059 > 0 && !Class348_Sub17.aBoolean6788) {
                                            if (((Class318_Sub1_Sub5.anInt8770 == 1) || Class318_Sub1_Sub5.method2485(-124)) && Class73.anInt4776 > 2) Class5_Sub2.method191(true, Class318_Sub4.anInt6411, Class219.anInt2872);
                                            else if (Class101_Sub1.method913((byte) 117)) Class5_Sub2.method191(true, Class318_Sub4.anInt6411, Class219.anInt2872);
                                        }
                                        Class348_Sub42.anInt7059 = 0;
                                    }
                                    continue;
                                }
                                if (class46.anInt765 == Class218.anInt2861) {
                                    if (bool_53_) Class341.method2676(class46.anInt709, class46.anInt789, (i_51_ + Class258_Sub4.aClass373_8552.method3597(true) - i_43_), (byte) 58, (i_52_ + Class258_Sub4.aClass373_8552.method3594((byte) 111) - i_44_));
                                    continue;
                                }
                                if (class46.anInt765 == Class348_Sub47.anInt7125) {
                                    Class175.method1343(i_44_, class46, 1, i_43_);
                                    continue;
                                }
                            }
                            if (!class46.aBoolean793 && bool_54_) {
                                class46.aBoolean793 = true;
                                if (class46.anObjectArray763 != null) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aBoolean6993 = true;
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6984 = (i_51_ + class348_sub45.method3308((byte) -128) - i_43_);
                                    class348_sub36.anInt6995 = (i_52_ + class348_sub45.method3311(-123) - i_44_);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray763;
                                    Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                }
                            }
                            if (class46.aBoolean793 && bool_53_ && (class46.anObjectArray785 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aBoolean6993 = true;
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anInt6984 = i_51_ + Class258_Sub4.aClass373_8552.method3597(true) - i_43_;
                                class348_sub36.anInt6995 = (i_52_ + Class258_Sub4.aClass373_8552.method3594((byte) 98) - i_44_);
                                class348_sub36.anObjectArray6987 = class46.anObjectArray785;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                            if (class46.aBoolean793 && !bool_53_) {
                                class46.aBoolean793 = false;
                                if (class46.anObjectArray742 != null) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aBoolean6993 = true;
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6984 = (i_51_ + Class258_Sub4.aClass373_8552.method3597(true) - i_43_);
                                    class348_sub36.anInt6995 = (i_52_ + Class258_Sub4.aClass373_8552.method3594((byte) 75) - i_44_);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray742;
                                    Class365.aClass262_4473.method1999(class348_sub36, -20180);
                                }
                            }
                            if (bool_53_ && (class46.anObjectArray805 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aBoolean6993 = true;
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anInt6984 = i_51_ + Class258_Sub4.aClass373_8552.method3597(true) - i_43_;
                                class348_sub36.anInt6995 = (i_52_ + Class258_Sub4.aClass373_8552.method3594((byte) 80) - i_44_);
                                class348_sub36.anObjectArray6987 = class46.anObjectArray805;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                            if (!class46.aBoolean737 && bool) {
                                class46.aBoolean737 = true;
                                if (class46.anObjectArray811 != null) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aBoolean6993 = true;
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6984 = (i_51_ + Class258_Sub4.aClass373_8552.method3597(true) - i_43_);
                                    class348_sub36.anInt6995 = (i_52_ + Class258_Sub4.aClass373_8552.method3594((byte) 112) - i_44_);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray811;
                                    Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                }
                            }
                            if (class46.aBoolean737 && bool && (class46.anObjectArray839 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aBoolean6993 = true;
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anInt6984 = i_51_ + Class258_Sub4.aClass373_8552.method3597(true) - i_43_;
                                class348_sub36.anInt6995 = (i_52_ + Class258_Sub4.aClass373_8552.method3594((byte) 95) - i_44_);
                                class348_sub36.anObjectArray6987 = class46.anObjectArray839;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                            if (class46.aBoolean737 && !bool) {
                                class46.aBoolean737 = false;
                                if (class46.anObjectArray683 != null) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aBoolean6993 = true;
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6984 = (i_51_ + Class258_Sub4.aClass373_8552.method3597(true) - i_43_);
                                    class348_sub36.anInt6995 = (i_52_ + Class258_Sub4.aClass373_8552.method3594((byte) 90) - i_44_);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray683;
                                    Class365.aClass262_4473.method1999(class348_sub36, -20180);
                                }
                            }
                            if (class46.anObjectArray764 != null) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray764;
                                Class208.aClass262_2707.method1999(class348_sub36, -20180);
                            }
                            if (class46.anObjectArray685 != null && (Class5_Sub1.anInt8352 > class46.anInt738)) {
                                if (class46.anIntArray818 == null || (Class5_Sub1.anInt8352 - class46.anInt738) > 32) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray685;
                                    Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                } else {
                                    while_224_:
                                    for (int i_74_ = class46.anInt738; i_74_ < Class5_Sub1.anInt8352; i_74_++) {
                                        int i_75_ = (Class348_Sub26.anIntArray6890[i_74_ & 0x1f]);
                                        for (int i_76_ = 0; i_76_ < (class46.anIntArray818).length; i_76_++) {
                                            if ((class46.anIntArray818[i_76_]) == i_75_) {
                                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray685);
                                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                                break while_224_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt738 = Class5_Sub1.anInt8352;
                            }
                            if (class46.anObjectArray708 != null && (Class348_Sub40_Sub30.anInt9385 > class46.anInt814)) {
                                if (class46.anIntArray831 == null || (Class348_Sub40_Sub30.anInt9385 - class46.anInt814) > 32) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray708;
                                    Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                } else {
                                    while_225_:
                                    for (int i_77_ = class46.anInt814; (i_77_ < Class348_Sub40_Sub30.anInt9385); i_77_++) {
                                        int i_78_ = (Class239_Sub21.anIntArray6061[i_77_ & 0x1f]);
                                        for (int i_79_ = 0; i_79_ < (class46.anIntArray831).length; i_79_++) {
                                            if ((class46.anIntArray831[i_79_]) == i_78_) {
                                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray708);
                                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                                break while_225_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt814 = Class348_Sub40_Sub30.anInt9385;
                            }
                            if (class46.anObjectArray777 != null && (Class287.anInt3695 > class46.anInt725)) {
                                if (class46.anIntArray686 == null || (Class287.anInt3695 - class46.anInt725) > 32) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray777;
                                    Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                } else {
                                    while_226_:
                                    for (int i_80_ = class46.anInt725; i_80_ < Class287.anInt3695; i_80_++) {
                                        int i_81_ = (Class327.anIntArray4096[i_80_ & 0x1f]);
                                        for (int i_82_ = 0; i_82_ < (class46.anIntArray686).length; i_82_++) {
                                            if ((class46.anIntArray686[i_82_]) == i_81_) {
                                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray777);
                                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                                break while_226_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt725 = Class287.anInt3695;
                            }
                            if (class46.anObjectArray751 != null && (Class106.anInt1631 > class46.anInt723)) {
                                if (class46.anIntArray771 == null || (Class106.anInt1631 - class46.anInt723) > 32) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray751;
                                    Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                } else {
                                    while_227_:
                                    for (int i_83_ = class46.anInt723; i_83_ < Class106.anInt1631; i_83_++) {
                                        int i_84_ = (Class199.anIntArray2633[i_83_ & 0x1f]);
                                        for (int i_85_ = 0; i_85_ < (class46.anIntArray771).length; i_85_++) {
                                            if ((class46.anIntArray771[i_85_]) == i_84_) {
                                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray751);
                                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                                break while_227_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt723 = Class106.anInt1631;
                            }
                            if (class46.anObjectArray671 != null && (Class326.anInt4086 > class46.anInt715)) {
                                if (class46.anIntArray731 == null || (Class326.anInt4086 - class46.anInt715) > 32) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray671;
                                    Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                } else {
                                    while_228_:
                                    for (int i_86_ = class46.anInt715; i_86_ < Class326.anInt4086; i_86_++) {
                                        int i_87_ = (Class199.anIntArray2632[i_86_ & 0x1f]);
                                        for (int i_88_ = 0; i_88_ < (class46.anIntArray731).length; i_88_++) {
                                            if ((class46.anIntArray731[i_88_]) == i_87_) {
                                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                                class348_sub36.aClass46_6989 = class46;
                                                class348_sub36.anObjectArray6987 = (class46.anObjectArray671);
                                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                                break while_228_;
                                            }
                                        }
                                    }
                                }
                                class46.anInt715 = Class326.anInt4086;
                            }
                            if ((Class348_Sub42_Sub3.anInt9501 > class46.anInt726) && (class46.anObjectArray820 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray820;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                            if ((Class126.anInt4985 > class46.anInt726) && (class46.anObjectArray734 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray734;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                            if ((Class230.anInt2986 > class46.anInt726) && (class46.anObjectArray761 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray761;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                            if ((Class189.anInt2523 > class46.anInt726) && (class46.anObjectArray807 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray807;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                            if ((Class348_Sub40_Sub23.anInt9313 > class46.anInt726) && (class46.anObjectArray836 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray836;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                            class46.anInt726 = Class311.anInt3918;
                            if (class46.anObjectArray822 != null) {
                                for (int i_89_ = 0; i_89_ < Class348_Sub42_Sub19.anInt9699; i_89_++) {
                                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                    class348_sub36.aClass46_6989 = class46;
                                    class348_sub36.anInt6991 = Class348_Sub42_Sub5.anInterface6Array9534[i_89_].method30(false);
                                    class348_sub36.anInt6982 = Class348_Sub42_Sub5.anInterface6Array9534[i_89_].method28((byte) 39);
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray822;
                                    Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                                }
                            }
                            if (Class347.aBoolean4284 && (class46.anObjectArray687 != null)) {
                                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                                class348_sub36.aClass46_6989 = class46;
                                class348_sub36.anObjectArray6987 = class46.anObjectArray687;
                                Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                            }
                        }
                        if (class46.anInt774 == 5 && class46.anInt705 != -1) class46.method444(false, Class123.aClass25_1813, Class30.aClass84_413).method2292(84, Class348_Sub8.aHa6654, class46.anInt789);
                        Class18.method273(class46, -2835);
                        if (class46.anInt774 == 0) {
                            method107(class46s, class46.anInt830, i_45_, i_46_, i_47_, i_48_, i_43_ - class46.anInt747, i_44_ - class46.anInt755, i_38_, i_39_, i_40_, i_41_);
                            if (class46.aClass46Array798 != null) method107(class46.aClass46Array798, class46.anInt830, i_45_, i_46_, i_47_, i_48_, i_43_ - class46.anInt747, i_44_ - class46.anInt755, i_38_, i_39_, i_40_, i_41_);
                            Class348_Sub41 class348_sub41 = ((Class348_Sub41) (Class125.aClass356_4915.method3480(class46.anInt830, -6008)));
                            if (class348_sub41 != null) {
                                if ((Class348_Sub42_Sub8_Sub2.aClass230_10434 == Class10.aClass230_186) && (class348_sub41.anInt7053) == 0 && !Class5_Sub1.aBoolean8335 && bool && !Class299_Sub2.aBoolean6327) Class64_Sub2.method661((byte) 105);
                                Class182.method1373(class348_sub41.anInt7050, i_43_, i_45_, i_47_, i_39_, i_38_, -1391, i_40_, i_48_, i_44_, i_41_, i_46_);
                            }
                        }
                    }
                }
            }
        }
    }

    static final Class46 method108(Class46 class46) {
        int i = method105(class46).method3304((byte) 125);
        if (i == 0) return null;
        for (int i_90_ = 0; i_90_ < i; i_90_++) {
            class46 = Class324.method2570(1512932720, class46.anInt834);
            if (class46 == null) return null;
        }
        return class46;
    }

    static final void method109() {
        for (int i = 0; i < Class367_Sub4.anInt7319; i++) {
            int[] is = Class348_Sub42_Sub17.anIntArrayArray9678[i];
            for (int i_91_ = 0; i_91_ < Class348_Sub40_Sub3.anInt9109; i_91_++)
                is[i_91_] = 0;
        }
    }

    public static void method110(int i) {
        aClass262_5185 = null;
        if (i == 31) anIntArray5176 = null;
    }

    static final boolean method111(Class46 class46) {
        if (Class299_Sub2.aBoolean6327) {
            if (method105(class46).anInt7098 != 0) return false;
            if (class46.anInt774 == 0) return false;
        }
        return class46.aBoolean813;
    }

    final void method93(int i) {
        if (i != -11018) method80(9);
        anInt5186++;
        if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 2) {
            try {
                method116(true);
            } catch (Throwable throwable) {
                Class156.method1242((throwable.getMessage() + " (Recovered) " + method81((byte) 52)), throwable, 15004);
                Class139.aBoolean1952 = true;
                Class367_Sub10.method3553(false, (byte) 123, 0);
            }
        } else method116(true);
    }

    static final void method112() {
        int i = Class328_Sub1.anInt6513;
        int[] is = Class286_Sub7.anIntArray6290;
        int i_92_ = Class373_Sub2.aBoolean7444 ? i : i + Class150.anInt2057;
        for (int i_93_ = 0; i_93_ < i_92_; i_93_++) {
            Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3;
            if (i_93_ < i) class318_sub1_sub3_sub3 = (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[is[i_93_]]);
            else class318_sub1_sub3_sub3 = (((Class348_Sub22) Class282.aClass356_3654.method3480(Class74.anIntArray1233[i_93_ - i], -6008)).aClass318_Sub1_Sub3_Sub3_Sub1_6859);
            if (class318_sub1_sub3_sub3.anInt10285 >= 0) {
                int i_94_ = class318_sub1_sub3_sub3.method2436((byte) 74);
                if ((i_94_ & 0x1) == 0) {
                    if ((class318_sub1_sub3_sub3.anInt6377 & 0x1ff) == 0 && (class318_sub1_sub3_sub3.anInt6388 & 0x1ff) == 0) continue;
                } else if ((class318_sub1_sub3_sub3.anInt6377 & 0x1ff) == 256 && ((class318_sub1_sub3_sub3.anInt6388) & 0x1ff) == 256) continue;
                class318_sub1_sub3_sub3.anInt6382 = (Class275.method2064(class318_sub1_sub3_sub3.anInt6377, class318_sub1_sub3_sub3.aByte6381, 11219, class318_sub1_sub3_sub3.anInt6388));
                Class89.method850(class318_sub1_sub3_sub3, true);
            }
        }
    }

    private final void method113(byte i) {
        if (Class240.anInt4674 == 7 && Class225.anInt2955 == 0) {
            if (Class289.anInt3699 > 1) {
                Class348_Sub40_Sub23.anInt9313 = Class311.anInt3918;
                Class289.anInt3699--;
            }
            if (!Class5_Sub1.aBoolean8335) Class64_Sub2.method661((byte) 111);
            for (int i_95_ = 0; i_95_ < 100; i_95_++) {
                if (!Class292.method2203((byte) -85)) break;
            }
        }
        anInt5174++;
        Class348_Sub51.anInt7267++;
        Class5_Sub2.method198(null, false, -1, -1);
        Class175.method1343(-1, null, 1, -1);
        Class216.method1583((byte) -73);
        Class311.anInt3918++;
        for (int i_96_ = 0; Class348_Sub32.anInt6930 > i_96_; i_96_++) {
            Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = (Class348_Sub40_Sub23.aClass348_Sub22Array9319[i_96_].aClass318_Sub1_Sub3_Sub3_Sub1_6859);
            if (class318_sub1_sub3_sub3_sub1 != null) {
                byte i_97_ = (class318_sub1_sub3_sub3_sub1.aClass79_10505.aByte1325);
                if ((i_97_ & 0x1) != 0) {
                    int i_98_ = class318_sub1_sub3_sub3_sub1.method2436((byte) 117);
                    if ((0x2 & i_97_) != 0 && class318_sub1_sub3_sub3_sub1.anInt10319 == 0 && Math.random() * 1000.0 < 10.0) {
                        int i_99_ = (int) Math.round(-5.0 + 10.0 * Math.random());
                        int i_100_ = (int) Math.round(10.0 * Math.random() - 5.0);
                        if (i_99_ != 0 || i_100_ != 0) {
                            int i_101_ = ((class318_sub1_sub3_sub3_sub1.anIntArray10320[0]) - -i_99_);
                            if (i_101_ < 0) i_101_ = 0;
                            else if (i_101_ > Class367_Sub4.anInt7319 + -i_98_ + -1) i_101_ = -1 + (-i_98_ + Class367_Sub4.anInt7319);
                            int i_102_ = i_100_ + (class318_sub1_sub3_sub3_sub1.anIntArray10317[0]);
                            if (i_102_ < 0) i_102_ = 0;
                            else if ((-i_98_ + Class348_Sub40_Sub3.anInt9109 - 1) < i_102_) i_102_ = (-i_98_ + Class348_Sub40_Sub3.anInt9109 - 1);
                            int i_103_ = (Class59_Sub2_Sub2.method574(i_101_, i_98_, i_98_, Class348_Sub40_Sub11.anIntArray9185, true, (byte) 120, -1, (class318_sub1_sub3_sub3_sub1.anIntArray10320[0]), (class318_sub1_sub3_sub3_sub1.anIntArray10317[0]), Class348_Sub42_Sub14.anIntArray9626, i_102_, (Class348_Sub45.aClass361Array7108[(class318_sub1_sub3_sub3_sub1.aByte6381)]), i_98_, 0, 0));
                            if (i_103_ > 0) {
                                if (i_103_ > 9) i_103_ = 9;
                                for (int i_104_ = 0; i_103_ > i_104_; i_104_++) {
                                    class318_sub1_sub3_sub3_sub1.anIntArray10320[i_104_] = (Class348_Sub42_Sub14.anIntArray9626[-1 + (-i_104_ + i_103_)]);
                                    class318_sub1_sub3_sub3_sub1.anIntArray10317[i_104_] = (Class348_Sub40_Sub11.anIntArray9185[-1 + (-i_104_ + i_103_)]);
                                    class318_sub1_sub3_sub3_sub1.aByteArray10321[i_104_] = (byte) 1;
                                }
                                class318_sub1_sub3_sub3_sub1.anInt10319 = i_103_;
                            }
                        }
                    }
                    Class219.method1600(true, 0, class318_sub1_sub3_sub3_sub1);
                    int i_105_ = (Class348_Sub8.method2774((byte) 108, class318_sub1_sub3_sub3_sub1));
                    za_Sub2.method3443(true, class318_sub1_sub3_sub3_sub1);
                    Class71.method729(Class235.anInt3062, i_105_, (byte) 122, class318_sub1_sub3_sub3_sub1, Class127_Sub1.anInt8387);
                    Class348_Sub42_Sub9_Sub1.method3208(class318_sub1_sub3_sub3_sub1, Class235.anInt3062, -84);
                    Class230.method1635(-106, class318_sub1_sub3_sub3_sub1);
                }
            }
        }
        if (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0) {
            if (Class348_Sub40_Sub21.anInt9282 == 2) Class14_Sub1.method241((byte) 127);
            else Class348_Sub21.method2954((byte) -127);
            if (Class286_Sub4.anInt6246 >> 9 < 14 || (Class286_Sub4.anInt6246 >> 9 >= -14 + Class367_Sub4.anInt7319) || (Class59_Sub2_Sub2.anInt8685 >> 9 < 14) || (Class348_Sub40_Sub3.anInt9109 + -14 <= Class59_Sub2_Sub2.anInt8685 >> 9))
                Class101.method893((byte) -49);
        }
        if (i != 112) anInt5171 = 22;
        for (; ; ) {
            Class348_Sub36 class348_sub36 = (Class348_Sub36) Class208.aClass262_2707.method1997(8);
            if (class348_sub36 == null) break;
            Class46 class46 = class348_sub36.aClass46_6989;
            if (class46.anInt704 >= 0) {
                Class46 class46_106_ = Class324.method2570(i ^ 0x5a2d8500, class46.anInt834);
                if (class46_106_ == null || class46_106_.aClass46Array798 == null || (class46_106_.aClass46Array798.length <= class46.anInt704) || class46 != (class46_106_.aClass46Array798[class46.anInt704])) continue;
            }
            Class66.method705(class348_sub36);
        }
        for (; ; ) {
            Class348_Sub36 class348_sub36 = ((Class348_Sub36) Class365.aClass262_4473.method1997(i + -104));
            if (class348_sub36 == null) break;
            Class46 class46 = class348_sub36.aClass46_6989;
            if (class46.anInt704 >= 0) {
                Class46 class46_107_ = Class324.method2570(1512932720, class46.anInt834);
                if (class46_107_ == null || class46_107_.aClass46Array798 == null || (class46_107_.aClass46Array798.length <= class46.anInt704) || class46 != (class46_107_.aClass46Array798[class46.anInt704])) continue;
            }
            Class66.method705(class348_sub36);
        }
        for (; ; ) {
            Class348_Sub36 class348_sub36 = ((Class348_Sub36) Class348_Sub1_Sub2.aClass262_8810.method1997(i ^ 0x78));
            if (class348_sub36 == null) break;
            Class46 class46 = class348_sub36.aClass46_6989;
            if (class46.anInt704 >= 0) {
                Class46 class46_108_ = Class324.method2570(1512932720, class46.anInt834);
                if (class46_108_ == null || class46_108_.aClass46Array798 == null || (class46_108_.aClass46Array798.length <= class46.anInt704) || class46 != (class46_108_.aClass46Array798[class46.anInt704])) continue;
            }
            Class66.method705(class348_sub36);
        }
        if (Class289.aClass46_3701 != null) Class347.method2708(-30206);
        if (Class367_Sub11.anInt7396 % 1500 == 0) Class348_Sub40_Sub16.method3088(9);
        if (Class240.anInt4674 == 7 && Class225.anInt2955 == 0) Class261.method1987(-124);
        Class101.method909(3553);
        if (Class184.aBoolean2469 && (Class34.aLong482 < Class62.method599(-107) + -60000L)) Class318_Sub1_Sub2.method2405(41);
        for (Class318_Sub9_Sub1 class318_sub9_sub1 = ((Class318_Sub9_Sub1) Class348_Sub42_Sub14.aClass243_9642.method1872(8)); class318_sub9_sub1 != null; class318_sub9_sub1 = (Class318_Sub9_Sub1) Class348_Sub42_Sub14.aClass243_9642.method1878((byte) -43)) {
            if ((long) class318_sub9_sub1.anInt8787 < -5L + Class62.method599(-80) / 1000L) {
                if (class318_sub9_sub1.aShort8786 > 0) Class286_Sub2.method2144("", 5, (byte) -91, 0, (class318_sub9_sub1.aString8783 + Class274.aClass274_3502.method2063(Class348_Sub33.anInt6967, 544)), "", "");
                if (class318_sub9_sub1.aShort8786 == 0) Class286_Sub2.method2144("", 5, (byte) -105, 0, (class318_sub9_sub1.aString8783 + Class274.aClass274_3503.method2063((Class348_Sub33.anInt6967), i ^ 0x250)), "", "");
                class318_sub9_sub1.method2373(false);
            }
        }
        do {
            if (Class240.anInt4674 == 7 && Class225.anInt2955 == 0) {
                if (Class348_Sub40_Sub8.aClass238_9165 == null) Class348_Sub40_Sub34.method3141(false, (byte) 11);
                else {
                    Class11.anInt193++;
                    if (Class11.anInt193 > 50) {
                        IOException_Sub1.anInt88++;
                        Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class239_Sub10.aClass351_5938), (Class348_Sub23_Sub2.aClass77_9029), -104);
                        Class348_Sub42_Sub14.method3243(-49, class348_sub47);
                    }
                    try {
                        Class239_Sub18.method1802(0);
                    } catch (java.io.IOException ioexception) {
                        Class348_Sub40_Sub34.method3141(false, (byte) 11);
                        break;
                    }
                    break;
                }
                break;
            }
        } while (false);
    }

    private final void method114(int i) {
        anInt5188++;
        if (Class240.anInt4674 != 14) {
            Class367_Sub11.anInt7396++;
            if (Class367_Sub11.anInt7396 % 1000 == 1) {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                Class356.anInt4383 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6);
                OutputStream_Sub1.aRandom93.setSeed(Class356.anInt4383);
            }
            if (Class367_Sub11.anInt7396 % 50 == 0) {
                Class348_Sub48.anInt7134 = Class81.anInt1433;
                Class81.anInt1433 = 0;
                Class264.anInt3372 = Class13.anInt221;
                Class13.anInt221 = 0;
            }
            method102((byte) 61);
            if (Class175.aClass340_2327 != null) Class175.aClass340_2327.method2670(0);
            Class296.method2228(0);
            Class348_Sub42_Sub16_Sub1.method3260(66);
            Class182.aClass346_2449.method2695(67);
            Class258_Sub4.aClass373_8552.method3589(0);
            if (Class348_Sub8.aHa6654 != null) Class348_Sub8.aHa6654.method3646((int) Class62.method599(-74));
            Class170.method1315(93);
            Class253.anInt3246 = 0;
            Class348_Sub42_Sub19.anInt9699 = 0;
            for (Interface6 interface6 = Class182.aClass346_2449.method2697(0); interface6 != null; interface6 = Class182.aClass346_2449.method2697(0)) {
                int i_109_ = interface6.method27(26276);
                if (i_109_ == 2 || i_109_ == 3) {
                    int i_110_ = interface6.method28((byte) 96);
                    if (!Class275.method2066((byte) 116) || (i_110_ != 96 && i_110_ != 167 && i_110_ != 178)) {
                        if (Class348_Sub42_Sub19.anInt9699 < 128) {
                            Class348_Sub42_Sub5.anInterface6Array9534[Class348_Sub42_Sub19.anInt9699] = interface6;
                            Class348_Sub42_Sub19.anInt9699++;
                        }
                    } else if (!Class348_Sub42_Sub16_Sub2.method3263(true)) Class316.method2363(-84);
                    else Class367_Sub4.method3543((byte) -89);
                } else if (i_109_ == 0 && Class253.anInt3246 < 75) {
                    Class308.anInterface6Array3884[Class253.anInt3246] = interface6;
                    Class253.anInt3246++;
                }
            }
            Class98.anInt1565 = 0;
            for (Class348_Sub45 class348_sub45 = Class258_Sub4.aClass373_8552.method3596(0); class348_sub45 != null; class348_sub45 = Class258_Sub4.aClass373_8552.method3596(0)) {
                int i_111_ = class348_sub45.method3310(86);
                if (i_111_ != -1) {
                    if (i_111_ != 6) {
                        if (Class371.method3584(i_111_, 1)) {
                            Class318_Sub1_Sub3.aClass262_8744.method1999(class348_sub45, -20180);
                            if (Class318_Sub1_Sub3.aClass262_8744.method1998(0) > 10) Class318_Sub1_Sub3.aClass262_8744.method1997(8);
                        }
                    } else Class98.anInt1565 += class348_sub45.method3315(0);
                } else r_Sub1.aClass262_10479.method1999(class348_sub45, -20180);
            }
            if (Class348_Sub42_Sub16_Sub2.method3263(true)) Class38.method363(125);
            if (Class139.method1167(Class240.anInt4674, (byte) -51)) {
                Class52.method493(true);
                Class94.method867(true);
            } else if (Class318_Sub1_Sub1_Sub2.method2402(Class240.anInt4674, (byte) -120)) Canvas_Sub1.method123(0);
            if (i < 32) aClass262_5185 = null;
            if (Class348_Sub42_Sub8.method3196(Class240.anInt4674, -74) && !Class318_Sub1_Sub1_Sub2.method2402(Class240.anInt4674, (byte) -55)) {
                method113((byte) 112);
                Class348_Sub5.method2757(110);
                Class88.method843((byte) 102);
            } else if (!Class340.method2672(Class240.anInt4674, -123) || Class318_Sub1_Sub1_Sub2.method2402(Class240.anInt4674, (byte) -115)) {
                if (Class240.anInt4674 == 12) Class88.method843((byte) 113);
                else if (Class334.method2653(true, Class240.anInt4674) && !Class318_Sub1_Sub1_Sub2.method2402(Class240.anInt4674, (byte) -86)) Class348_Sub24.method2991(11432);
                else if (Class240.anInt4674 == 13) {
                    Class88.method843((byte) -75);
                    if (Class348_Sub6.anInt6634 != -3 && Class348_Sub6.anInt6634 != 2 && Class348_Sub6.anInt6634 != 15) Class348_Sub40_Sub34.method3141(false, (byte) 11);
                }
            } else {
                method113((byte) 112);
                Class88.method843((byte) 67);
            }
            Class22.method294(Class348_Sub8.aHa6654, 0);
            Class318_Sub1_Sub3.aClass262_8744.method1997(8);
        }
    }

    static final void method115() {
        int i = Class328_Sub1.anInt6513;
        int[] is = Class286_Sub7.anIntArray6290;
        int i_112_ = Class316.aClass348_Sub51_3959.aClass239_Sub13_7236.method1776(-32350);
        boolean bool = i_112_ == 1 && i > 200 || i_112_ == 0 && i > 50;
        for (int i_113_ = 0; i_113_ < i; i_113_++) {
            Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2 = Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[is[i_113_]];
            if (!class318_sub1_sub3_sub3_sub2.method2457((byte) -90)) class318_sub1_sub3_sub3_sub2.anInt10285 = -1;
            else if (class318_sub1_sub3_sub3_sub2.aBoolean10551) class318_sub1_sub3_sub3_sub2.anInt10285 = -1;
            else {
                class318_sub1_sub3_sub3_sub2.method2409((byte) -126);
                if ((class318_sub1_sub3_sub3_sub2.aShort8743) < 0 || (class318_sub1_sub3_sub3_sub2.aShort8750) < 0 || (class318_sub1_sub3_sub3_sub2.aShort8751) >= Class367_Sub4.anInt7319 || (class318_sub1_sub3_sub3_sub2.aShort8747) >= Class348_Sub40_Sub3.anInt9109)
                    class318_sub1_sub3_sub3_sub2.anInt10285 = -1;
                else {
                    class318_sub1_sub3_sub3_sub2.aBoolean10521 = (class318_sub1_sub3_sub3_sub2.aBoolean10213 && bool);
                    if (class318_sub1_sub3_sub3_sub2 == Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907) class318_sub1_sub3_sub3_sub2.anInt10285 = 2147483647;
                    else {
                        int i_114_ = 0;
                        if (!class318_sub1_sub3_sub3_sub2.aBoolean10309) i_114_++;
                        if (class318_sub1_sub3_sub3_sub2.anInt10223 > Class367_Sub11.anInt7396) i_114_ += 2;
                        i_114_ += 5 - class318_sub1_sub3_sub3_sub2.method2436((byte) 101) << 2;
                        if (class318_sub1_sub3_sub3_sub2.aBoolean10554) i_114_ += 512;
                        else {
                            if (Class37.anInt495 == 0) i_114_ += 32;
                            else i_114_ += 128;
                            i_114_ += 256;
                        }
                        class318_sub1_sub3_sub3_sub2.anInt10285 = i_114_ + 1;
                    }
                }
            }
        }
        for (int i_115_ = 0; i_115_ < Class150.anInt2057; i_115_++) {
            Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = (((Class348_Sub22) Class282.aClass356_3654.method3480(Class74.anIntArray1233[i_115_], -6008)).aClass318_Sub1_Sub3_Sub3_Sub1_6859);
            if (!class318_sub1_sub3_sub3_sub1.method2445((byte) -4) || !(class318_sub1_sub3_sub3_sub1.aClass79_10505.method796(Class318_Sub1_Sub3_Sub3.aClass170_10209, 18627))) class318_sub1_sub3_sub3_sub1.anInt10285 = -1;
            else {
                class318_sub1_sub3_sub3_sub1.method2409((byte) -118);
                if ((class318_sub1_sub3_sub3_sub1.aShort8743) < 0 || (class318_sub1_sub3_sub3_sub1.aShort8750) < 0 || (class318_sub1_sub3_sub3_sub1.aShort8751) >= Class367_Sub4.anInt7319 || (class318_sub1_sub3_sub3_sub1.aShort8747) >= Class348_Sub40_Sub3.anInt9109)
                    class318_sub1_sub3_sub3_sub1.anInt10285 = -1;
                else {
                    int i_116_ = 0;
                    if (!class318_sub1_sub3_sub3_sub1.aBoolean10309) i_116_++;
                    if (class318_sub1_sub3_sub3_sub1.anInt10223 > Class367_Sub11.anInt7396) i_116_ += 2;
                    i_116_ += 5 - class318_sub1_sub3_sub3_sub1.method2436((byte) 82) << 2;
                    if (Class37.anInt495 == 0) {
                        if (class318_sub1_sub3_sub3_sub1.aClass79_10505.aBoolean1362) i_116_ += 64;
                        else i_116_ += 128;
                    } else if (Class37.anInt495 == 1) {
                        if (class318_sub1_sub3_sub3_sub1.aClass79_10505.aBoolean1362) i_116_ += 32;
                        else i_116_ += 64;
                    }
                    if (class318_sub1_sub3_sub3_sub1.aClass79_10505.aBoolean1345) i_116_ += 1024;
                    else if (!class318_sub1_sub3_sub3_sub1.aClass79_10505.aBoolean1381) i_116_ += 256;
                    class318_sub1_sub3_sub3_sub1.anInt10285 = i_116_ + 1;
                }
            }
        }
        for (int i_117_ = 0; i_117_ < Class348_Sub27.aClass302Array6897.length; i_117_++) {
            Class302 class302 = Class348_Sub27.aClass302Array6897[i_117_];
            if (class302 != null) {
                if (class302.anInt3840 == 1) {
                    Class348_Sub22 class348_sub22 = ((Class348_Sub22) (Class282.aClass356_3654.method3480(class302.anInt3833, -6008)));
                    if (class348_sub22 != null) {
                        Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = (class348_sub22.aClass318_Sub1_Sub3_Sub3_Sub1_6859);
                        if (class318_sub1_sub3_sub3_sub1.anInt10285 >= 0) class318_sub1_sub3_sub3_sub1.anInt10285 += 2048;
                    }
                } else if (class302.anInt3840 == 10) {
                    Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2 = (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[class302.anInt3833]);
                    if (class318_sub1_sub3_sub3_sub2 != null && (class318_sub1_sub3_sub3_sub2 != Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907) && class318_sub1_sub3_sub3_sub2.anInt10285 >= 0) class318_sub1_sub3_sub3_sub2.anInt10285 += 2048;
                }
            }
        }
    }

    final synchronized void method87(byte i) {
        if (i > -11) aClass262_5185 = null;
        anInt5173++;
        if (Class93.anApplet1530 != null && Class305.aCanvas3869 == null && !Class348_Sub23_Sub1.aClass297_8992.aBoolean3794) {
            try {
                Class var_class = Class93.anApplet1530.getClass();
                Field field = var_class.getDeclaredField("canvas");
                Class305.aCanvas3869 = (Canvas) field.get(Class93.anApplet1530);
                field.set(Class93.anApplet1530, null);
                if (Class305.aCanvas3869 != null) return;
            } catch (Exception exception) {
                exception.printStackTrace();
                /* empty */
            }
        }
        super.method87((byte) -28);
    }

    private final void method116(boolean bool) {
        anInt5172++;
        if (Class240.anInt4674 != 14) {
            long l = (Class241.method1857((byte) -45) / 1000000L + -Class348_Sub42_Sub2.aLong8573);
            Class348_Sub42_Sub2.aLong8573 = Class241.method1857((byte) -45) / 1000000L;
            boolean bool_118_ = Class286_Sub6.method2163(!bool);
            if (bool_118_ && Class74.aBoolean1236 && Class348_Sub40.aClass279_7042 != null) Class348_Sub40.aClass279_7042.method2087(-115);
            if (Class260.method1977((byte) -79, Class240.anInt4674)) {
                if ((Class348_Sub16_Sub2.aLong8866 != 0) && Class62.method599(-98) > Class348_Sub16_Sub2.aLong8866) Class85.method830(Class348_Sub42_Sub12.method3229(-128), Class321.anInt4005, (byte) 102, false, Class348_Sub40_Sub25.anInt9335);
                else if (!Class348_Sub8.aHa6654.method3655() && Class203.aBoolean2674) Class348_Sub47.method3327(1406);
            }
            if (Class34.aFrame476 == null) {
                java.awt.Container container;
                if (Class52.aFrame4904 == null) {
                    if (Class93.anApplet1530 == null) container = Class348_Sub40_Sub9.anApplet_Sub1_9169;
                    else container = Class93.anApplet1530;
                } else container = Class52.aFrame4904;
                int i = container.getSize().width;
                int i_119_ = container.getSize().height;
                if (container == Class52.aFrame4904) {
                    Insets insets = Class52.aFrame4904.getInsets();
                    i -= insets.left + insets.right;
                    i_119_ -= insets.top - -insets.bottom;
                }
                if (i != Class272.anInt3473 || i_119_ != Class348_Sub22.anInt6857 || RuntimeException_Sub1.aBoolean4604) {
                    if (Class348_Sub8.aHa6654 == null || Class348_Sub8.aHa6654.method3695()) Class367_Sub11.method3556(false);
                    else {
                        Class348_Sub22.anInt6857 = i_119_;
                        Class272.anInt3473 = i;
                    }
                    Class348_Sub16_Sub2.aLong8866 = Class62.method599(-66) - -500L;
                    RuntimeException_Sub1.aBoolean4604 = false;
                }
            }
            if (Class34.aFrame476 != null && !Class175.aBoolean2329 && Class260.method1977((byte) -79, Class240.anInt4674)) Class85.method830(Class316.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
            boolean bool_120_ = false;
            if (Class49.aBoolean4726) {
                bool_120_ = true;
                Class49.aBoolean4726 = false;
            }
            if (bool_120_) Class140.method1170((byte) -116);
            if ((Class348_Sub8.aHa6654 != null && Class348_Sub8.aHa6654.method3655()) || Class348_Sub42_Sub12.method3229(-91) != 1) Class354.method3466(-77);
            if (Class139.method1167(Class240.anInt4674, (byte) -113)) Class170.method1309(bool_120_, 117);
            else if (!Class283.method2114(Class240.anInt4674, bool)) {
                if (!Class348_Sub42_Sub8.method3197(Class240.anInt4674, (byte) 56)) {
                    if (Class318_Sub1_Sub1_Sub2.method2402(Class240.anInt4674, (byte) -78)) {
                        if (Class36.anInt489 == 1) {
                            if (Class268.anInt3441 > Class348_Sub46.anInt7115) Class348_Sub46.anInt7115 = Class268.anInt3441;
                            int i = ((-Class268.anInt3441 + Class348_Sub46.anInt7115) * 50 / Class348_Sub46.anInt7115);
                            Class362.method3511(true, Applet_Sub1.aClass324_20, Class246.aClass143_3179, (Class274.aClass274_3495.method2063(Class348_Sub33.anInt6967, 544)) + "<br>(" + i + "%)", 2, Class348_Sub8.aHa6654);
                        } else if (Class36.anInt489 == 2) {
                            if (Class31.anInt443 < Class154.anInt2101) Class31.anInt443 = Class154.anInt2101;
                            int i = (((Class31.anInt443 - Class154.anInt2101) * 50 / Class31.anInt443) + 50);
                            Class362.method3511(true, Applet_Sub1.aClass324_20, Class246.aClass143_3179, (Class274.aClass274_3495.method2063(Class348_Sub33.anInt6967, 544)) + "<br>(" + i + "%)", 2, Class348_Sub8.aHa6654);
                        } else Class362.method3511(true, Applet_Sub1.aClass324_20, Class246.aClass143_3179, (Class274.aClass274_3495.method2063(Class348_Sub33.anInt6967, 544)), 2, Class348_Sub8.aHa6654);
                    } else if (Class240.anInt4674 != 10) {
                        if (Class240.anInt4674 == 13)
                            Class362.method3511(false, Applet_Sub1.aClass324_20, Class246.aClass143_3179, ((Class274.aClass274_3497.method2063(Class348_Sub33.anInt6967, 544)) + "<br>" + (Class274.aClass274_3498.method2063(Class348_Sub33.anInt6967, 544))), 2, Class348_Sub8.aHa6654);
                    } else Class302.method2284((byte) -43, l);
                } else Class239_Sub10.method1761(85);
            } else Class239_Sub10.method1761(85);
            if (ha_Sub3.anInt8045 == 3) {
                for (int i = 0; Class348_Sub38.anInt7008 > i; i++) {
                    Rectangle rectangle = Class180.aRectangleArray2371[i];
                    if (Class175.aBooleanArray2326[i]) Class348_Sub8.aHa6654.method3668(rectangle.width, rectangle.y, -65281, rectangle.x, rectangle.height, 46);
                    else if (!Class268.aBooleanArray3438[i]) Class348_Sub8.aHa6654.method3668(rectangle.width, rectangle.y, -16711936, rectangle.x, rectangle.height, 66);
                    else Class348_Sub8.aHa6654.method3668(rectangle.width, rectangle.y, -65536, rectangle.x, rectangle.height, 40);
                }
            }
            if (Class348_Sub42_Sub16_Sub2.method3263(bool)) Class6.method207(Class348_Sub8.aHa6654, (byte) 124);
            if (Class348_Sub23_Sub1.aClass297_8992.aBoolean3794 && Class260.method1977((byte) -79, Class240.anInt4674) && ha_Sub3.anInt8045 == 0 && Class348_Sub42_Sub12.method3229(-85) == 1 && !bool_120_) {
                int i = 0;
                for (int i_121_ = 0; (Class348_Sub38.anInt7008 > i_121_); i_121_++) {
                    if (Class268.aBooleanArray3438[i_121_]) {
                        Class268.aBooleanArray3438[i_121_] = false;
                        Class190.aRectangleArray2554[i++] = Class180.aRectangleArray2371[i_121_];
                    }
                }
                try {
                    if (!Class59_Sub1.aBoolean5300) Class348_Sub8.aHa6654.method3657(Class190.aRectangleArray2554, i, 66);
                    else Class140.method1168(i, 0, Class190.aRectangleArray2554);
                } catch (Exception_Sub1 exception_sub1) {
                    /* empty */
                }
            } else if (!Class139.method1167(Class240.anInt4674, (byte) -59)) {
                for (int i = 0; Class348_Sub38.anInt7008 > i; i++)
                    Class268.aBooleanArray3438[i] = false;
                try {
                    if (Class59_Sub1.aBoolean5300) Class45.method395(107);
                    else Class348_Sub8.aHa6654.method3689((byte) 104);
                } catch (Exception_Sub1 exception_sub1) {
                    Class156.method1242((exception_sub1.getMessage() + " (Recovered) " + method81((byte) 79)), exception_sub1, 15004);
                    Class367_Sub10.method3553(false, (byte) 113, 0);
                }
            }
            Class62.method598(9013);
            int i = Class316.aClass348_Sub51_3959.aClass239_Sub17_7263.method1798(-32350);
            if (i == 0) Class286_Sub5.method2161((byte) -127, 15L);
            else if (i != 1) {
                if (i != 2) {
                    if (i == 3) Class286_Sub5.method2161((byte) -102, 2L);
                } else Class286_Sub5.method2161((byte) -97, 5L);
            } else Class286_Sub5.method2161((byte) -104, 10L);
            if (Class319.aBoolean3988) Class188.method1416(5);
            if (Class316.aClass348_Sub51_3959.aClass239_Sub11_7265.method1768(-32350) == 1 && Class240.anInt4674 == 3 && r.anInt9721 != -1) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub11_7265), 0);
                Class14_Sub2.method243(37);
            }
        }
    }

    static final void method117(int i) {
        int i_122_ = Class328_Sub1.anInt6513;
        int[] is = Class286_Sub7.anIntArray6290;
        for (int i_123_ = 0; i_123_ < i_122_ + Class150.anInt2057; i_123_++) {
            Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3;
            if (i_123_ < i_122_) class318_sub1_sub3_sub3 = (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[is[i_123_]]);
            else class318_sub1_sub3_sub3 = ((Class348_Sub22) Class282.aClass356_3654.method3480(Class74.anIntArray1233[i_123_ - i_122_], -6008)).aClass318_Sub1_Sub3_Sub3_Sub1_6859;
            if (class318_sub1_sub3_sub3.aByte6381 == i && (class318_sub1_sub3_sub3.anInt10285) >= 0) {
                int i_124_ = class318_sub1_sub3_sub3.method2436((byte) 114);
                if ((i_124_ & 0x1) == 0) {
                    if ((class318_sub1_sub3_sub3.anInt6377 & 0x1ff) != 0 || (class318_sub1_sub3_sub3.anInt6388 & 0x1ff) != 0) continue;
                } else if ((class318_sub1_sub3_sub3.anInt6377 & 0x1ff) != 256 || ((class318_sub1_sub3_sub3.anInt6388) & 0x1ff) != 256) continue;
                if (i_124_ == 1) {
                    int i_125_ = (class318_sub1_sub3_sub3.anInt6377 >> 9);
                    int i_126_ = (class318_sub1_sub3_sub3.anInt6388 >> 9);
                    if ((class318_sub1_sub3_sub3.anInt10285) > (Class348_Sub42_Sub17.anIntArrayArray9678[i_125_][i_126_])) {
                        Class348_Sub42_Sub17.anIntArrayArray9678[i_125_][i_126_] = class318_sub1_sub3_sub3.anInt10285;
                        Class239_Sub8.anIntArrayArray5921[i_125_][i_126_] = 1;
                    } else if (class318_sub1_sub3_sub3.anInt10285 == (Class348_Sub42_Sub17.anIntArrayArray9678[i_125_][i_126_])) Class239_Sub8.anIntArrayArray5921[i_125_][i_126_]++;
                } else {
                    int i_127_ = (i_124_ - 1) * 256 + 60;
                    int i_128_ = ((class318_sub1_sub3_sub3.anInt6377 - i_127_) >> 9);
                    int i_129_ = ((class318_sub1_sub3_sub3.anInt6388 - i_127_) >> 9);
                    int i_130_ = ((class318_sub1_sub3_sub3.anInt6377 + i_127_) >> 9);
                    int i_131_ = ((class318_sub1_sub3_sub3.anInt6388 + i_127_) >> 9);
                    for (int i_132_ = i_128_; i_132_ <= i_130_; i_132_++) {
                        for (int i_133_ = i_129_; i_133_ <= i_131_; i_133_++) {
                            if (class318_sub1_sub3_sub3.anInt10285 > (Class348_Sub42_Sub17.anIntArrayArray9678[i_132_][i_133_])) {
                                Class348_Sub42_Sub17.anIntArrayArray9678[i_132_][i_133_] = class318_sub1_sub3_sub3.anInt10285;
                                Class239_Sub8.anIntArrayArray5921[i_132_][i_133_] = 1;
                            } else if (class318_sub1_sub3_sub3.anInt10285 == (Class348_Sub42_Sub17.anIntArrayArray9678[i_132_][i_133_])) Class239_Sub8.anIntArrayArray5921[i_132_][i_133_]++;
                        }
                    }
                }
            }
        }
    }

    final String method81(byte i) {
        anInt5175++;
        String string = null;
        try {
            string = ("[1)" + za_Sub2.anInt9780 + "," + Class90.anInt1517 + "," + Class367_Sub4.anInt7319 + "," + Class348_Sub40_Sub3.anInt9109 + "|");
            if (i < 40) aClass262_5185 = null;
            if (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907 != null)
                string += ("2)" + Class355.anInt4372 + "," + (za_Sub2.anInt9780 + (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anIntArray10320[0])) + "," + (Class90.anInt1517 + (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anIntArray10317[0])) + "|");
            string += ("3)" + Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) + "|4)" + Class316.aClass348_Sub51_3959.aClass239_Sub20_7216.method1808(-32350) + "|5)" + Class348_Sub42_Sub12.method3229(-65) + "|6)" + Class321.anInt4017 + "," + Class348_Sub42_Sub8_Sub2.anInt10432 + "|");
            string += "7)" + Class316.aClass348_Sub51_3959.aClass239_Sub28_7230.method1845(-32350) + "|";
            string += "8)" + Class316.aClass348_Sub51_3959.aClass239_Sub7_7238.method1748(-32350) + "|";
            string += "9)" + Class316.aClass348_Sub51_3959.aClass239_Sub18_7259.method1800(-32350) + "|";
            string += "10)" + Class316.aClass348_Sub51_3959.aClass239_Sub24_7235.method1820(-32350) + "|";
            string += "11)" + Class316.aClass348_Sub51_3959.aClass239_Sub12_7243.method1771(-32350) + "|";
            string += "12)" + Class316.aClass348_Sub51_3959.aClass239_Sub27_7261.method1840(-32350) + "|";
            string += "13)" + Class226.anInt2964 + "|";
            string += "14)" + Class240.anInt4674;
            if (Class348_Sub40_Sub20.aClass348_Sub4_9264 != null) string += "|15)" + (Class348_Sub40_Sub20.aClass348_Sub4_9264.anInt6609);
            try {
                if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 2) {
                    Class var_class = Class.forName("java.lang.ClassLoader");
                    Field field = var_class.getDeclaredField("nativeLibraries");
                    Class var_class_134_ = Class.forName("java.lang.reflect.AccessibleObject");
                    Method method = var_class_134_.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    method.invoke(field, Boolean.TRUE);
                    Vector vector = ((Vector) field.get((aClass5189 != null ? aClass5189 : (aClass5189 = method118("client"))).getClassLoader()));
                    for (int i_135_ = 0; i_135_ < vector.size(); i_135_++) {
                        try {
                            Object object = vector.elementAt(i_135_);
                            Field field_136_ = object.getClass().getDeclaredField("name");
                            method.invoke(field_136_, Boolean.TRUE);
                            try {
                                String string_137_ = (String) field_136_.get(object);

                                if (string_137_ != null && string_137_.indexOf("sw3d.dll") != -1) {
                                    Field field_138_ = object.getClass().getDeclaredField("handle");


                                    method.invoke(field_138_, Boolean.TRUE);
                                    string += ("|16)" + (Long.toHexString(field_138_.getLong(object))));
                                    method.invoke(field_138_, Boolean.FALSE);
                                }
                            } catch (Throwable throwable) {
                                throwable.printStackTrace();
                                /* empty */
                            }
                            method.invoke(field_136_, Boolean.FALSE);
                        } catch (Throwable throwable) {
                            throwable.printStackTrace();
                            /* empty */
                        }
                    }
                }
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                /* empty */
            }
            string += "]";
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            /* empty */
        }
        return string;
    }

    /*synthetic*/
    static Class method118(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
