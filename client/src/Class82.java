/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.io.File;
import java.io.FileOutputStream;

final class Class82 {
    static Index QUICK_CHAT_MENUS;
    static int anInt1435;
    private final Index aIndex_1436;
    static int anInt1437;
    static int anInt1438;
    int anInt1439;

    public static void method811(byte i) {
        if (i > -109) anInt1435 = 69;
        QUICK_CHAT_MENUS = null;
    }

    static final void method812(String string, boolean bool, boolean bool_0_, byte i) {
        do {
            try {
                if (i != -79) method814((byte) -79, 126L);
                anInt1437++;
                try {
                    if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
                        Applet_Sub1.method94("commands - This command", i ^ 0x1);
                        Applet_Sub1.method94("cls - Clear console", -54);
                        Applet_Sub1.method94("displayfps - Toggle FPS and other information", -89);
                        Applet_Sub1.method94("renderer - Print graphics renderer information", 122);
                        Applet_Sub1.method94("heap - Print java memory information", -88);
                        break;
                    }
                    if (string.equalsIgnoreCase("cls")) {
                        Class284.anInt3676 = 0;
                        Class369_Sub2.anInt8587 = 0;
                        break;
                    }
                    if (string.equalsIgnoreCase("displayfps")) {
                        Class298.aBoolean3811 = !Class298.aBoolean3811;
                        if (Class298.aBoolean3811) Applet_Sub1.method94("FPS on", 83);
                        else {
                            Applet_Sub1.method94("FPS off", -69);
                            break;
                        }
                        break;
                    }
                    if (string.equals("renderer")) {
                        Class365 class365 = Class348_Sub8.aHa6654.c();
                        Applet_Sub1.method94("Vendor: " + class365.anInt4476, 89);
                        Applet_Sub1.method94("Name: " + (class365.aString4470), 71);
                        Applet_Sub1.method94(("Version: " + (class365.anInt4475)), -110);
                        Applet_Sub1.method94(("Device: " + (class365.aString4472)), i + 146);
                        Applet_Sub1.method94(("Driver Version: " + (class365.aLong4471)), i + -32);
                        break;
                    }
                    if (string.equals("heap")) {
                        Applet_Sub1.method94(("Heap: " + Class226.anInt2964 + "MB"), 69);
                        break;
                    }
                } catch (Exception exception) {
                    Applet_Sub1.method94((Class274.aClass274_3485.method2063(Class348_Sub33.anInt6967, 544)), -99);
                    break;
                }
                if (Class8.aClass364_165 != Class55_Sub1.aClass364_5271 || Class192.anInt2581 >= 2) {
                    if (string.equalsIgnoreCase("errortest")) throw new RuntimeException();
                    if (string.equals("nativememerror")) throw new OutOfMemoryError("native(MPR");
                    try {
                        if (string.equalsIgnoreCase("printfps")) {
                            Applet_Sub1.method94(("FPS: " + Class239_Sub5.anInt5891), -58);
                            break;
                        }
                        if (string.equalsIgnoreCase("occlude")) {
                            Class348_Sub40_Sub23.aBoolean9307 = !Class348_Sub40_Sub23.aBoolean9307;
                            if (Class348_Sub40_Sub23.aBoolean9307) {
                                Applet_Sub1.method94("Occlsion now on!", -102);
                                break;
                            } else Applet_Sub1.method94("Occlsion now off!", -106);
                            break;
                        }
                        if (string.equalsIgnoreCase("fpson")) {
                            Class298.aBoolean3811 = true;
                            Applet_Sub1.method94("fps debug enabled", -115);
                            break;
                        }
                        if (string.equalsIgnoreCase("fpsoff")) {
                            Class298.aBoolean3811 = false;
                            Applet_Sub1.method94("fps debug disabled", 125);
                            break;
                        }
                        if (string.equals("systemmem")) {
                            try {
                                Applet_Sub1.method94(("System memory: " + (jagmisc.getAvailablePhysicalMemory() / 1048576L) + "/" + Class348_Sub40_Sub20.aClass348_Sub4_9264.anInt6609 + "Mb"), i + 26);
                            } catch (Throwable throwable) {
                                /* empty */
                            }
                            break;
                        }
                        if (string.equalsIgnoreCase("cleartext")) {
                            Class225.aClass243_2957.method1876((byte) -45);
                            Applet_Sub1.method94("Text coords cleared", i + 21);
                            break;
                        }
                        if (string.equalsIgnoreCase("gc")) {
                            Class46.method427(i + 180);
                            for (int i_1_ = 0; i_1_ < 10; i_1_++)
                                System.gc();
                            Runtime runtime = Runtime.getRuntime();
                            int i_2_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                            Applet_Sub1.method94("mem=" + i_2_ + "k", 110);
                            break;
                        }
                        if (string.equalsIgnoreCase("compact")) {
                            Class46.method427(-41);
                            for (int i_3_ = 0; i_3_ < 10; i_3_++)
                                System.gc();
                            Runtime runtime = Runtime.getRuntime();
                            int i_4_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                            Applet_Sub1.method94(("Memory before cleanup=" + i_4_ + "k"), 115);
                            Class299_Sub2_Sub1.method2271(31268);
                            Class46.method427(96);
                            for (int i_5_ = 0; i_5_ < 10; i_5_++)
                                System.gc();
                            i_4_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                            Applet_Sub1.method94(("Memory after cleanup=" + i_4_ + "k"), -110);
                            break;
                        }
                        if (string.equalsIgnoreCase("unloadnatives")) {
                            Applet_Sub1.method94((Class228.method1629(true) ? "Libraries unloaded" : "Library unloading failed!"), 63);
                            break;
                        }
                        if (string.equalsIgnoreCase("clientdrop")) {
                            Applet_Sub1.method94("Dropped client connection", -119);
                            if (Class240.anInt4674 == 10) Class272.method2049(105);
                            else {
                                if (Class240.anInt4674 == 11) Class110.aBoolean1712 = true;
                                break;
                            }
                            break;
                        }
                        if (string.equalsIgnoreCase("rotateconnectmethods")) {
                            Class3.aClass161_125.method1259(0);
                            Applet_Sub1.method94("Rotated connection methods", i ^ ~0x13);
                            break;
                        }
                        if (string.equalsIgnoreCase("clientjs5drop")) {
                            Class348_Sub4.aClass248_6601.method1901(-83);
                            Applet_Sub1.method94("Dropped client js5 net queue", -116);
                            break;
                        }
                        if (string.equalsIgnoreCase("serverjs5drop")) {
                            Class348_Sub4.aClass248_6601.method1905(0);
                            Applet_Sub1.method94("Dropped server js5 net queue", -100);
                            break;
                        }
                        if (string.equalsIgnoreCase("breakcon")) {
                            Class348_Sub23_Sub1.aClass297_8992.method2239(-95);
                            Class348_Sub40_Sub8.aClass238_9165.method1702(i + 123);
                            Class348_Sub4.aClass248_6601.method1898(true);
                            Applet_Sub1.method94("Breaking new connections for 5 seconds", i + -4);
                            break;
                        }
                        if (string.equalsIgnoreCase("rebuild")) {
                            Class348_Sub20.method2953((byte) -117);
                            Class50_Sub2.method464(-1);
                            Applet_Sub1.method94("Rebuilding map", -113);
                            break;
                        }
                        if (string.equalsIgnoreCase("rebuildprofile")) {
                            Class90.aLong1516 = Class62.method599(-75);
                            Class258_Sub4.aBoolean8558 = true;
                            Class348_Sub20.method2953((byte) -114);
                            Class50_Sub2.method464(-1);
                            Applet_Sub1.method94("Rebuilding map (with profiling)", -117);
                            break;
                        }
                        if (string.equalsIgnoreCase("wm1")) {
                            Class85.method830(1, -1, (byte) 102, false, -1);
                            if (Class348_Sub42_Sub12.method3229(-61) == 1) {
                                Applet_Sub1.method94("wm1 succeeded", -65);
                                break;
                            } else Applet_Sub1.method94("wm1 failed", i ^ ~0x17);
                            break;
                        }
                        if (string.equalsIgnoreCase("wm2")) {
                            Class85.method830(2, -1, (byte) 102, false, -1);
                            if (Class348_Sub42_Sub12.method3229(-119) == 2) Applet_Sub1.method94("wm2 succeeded", -109);
                            else {
                                Applet_Sub1.method94("wm2 failed", i + 154);
                                break;
                            }
                            break;
                        }
                        if (string.equalsIgnoreCase("wm3")) {
                            Class85.method830(3, 1024, (byte) 102, false, 768);
                            if (Class348_Sub42_Sub12.method3229(i ^ 0x3d) == 3) Applet_Sub1.method94("wm3 succeeded", 111);
                            else {
                                Applet_Sub1.method94("wm3 failed", 83);
                                break;
                            }
                            break;
                        }
                        if (string.equalsIgnoreCase("tk0")) {
                            Class367_Sub10.method3553(false, (byte) 104, 0);
                            if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 0) {
                                Applet_Sub1.method94("Entered tk0", 101);
                                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub25_7251), 0);
                                Class14_Sub2.method243(37);
                                r.aBoolean9719 = false;
                                break;
                            } else Applet_Sub1.method94("Failed to enter tk0", 69);
                            break;
                        }
                        if (string.equalsIgnoreCase("tk1")) {
                            Class367_Sub10.method3553(false, (byte) 109, 1);
                            if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 1) {
                                Applet_Sub1.method94("Entered tk1", -65);
                                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub25_7251), 1);
                                Class14_Sub2.method243(i ^ ~0x6b);
                                r.aBoolean9719 = false;
                                break;
                            } else Applet_Sub1.method94("Failed to enter tk1", -56);
                            break;
                        }
                        if (string.equalsIgnoreCase("tk2")) {
                            Class367_Sub10.method3553(false, (byte) 115, 2);
                            if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 2) {
                                Applet_Sub1.method94("Entered tk2", i + 151);
                                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub25_7251), 2);
                                Class14_Sub2.method243(37);
                                r.aBoolean9719 = false;
                            } else {
                                Applet_Sub1.method94("Failed to enter tk2", i ^ 0x22);
                                break;
                            }
                            break;
                        }
                        if (string.equalsIgnoreCase("tk3")) {
                            Class367_Sub10.method3553(false, (byte) 107, 3);
                            if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 3) {
                                Applet_Sub1.method94("Entered tk3", 78);
                                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub25_7251), 3);
                                Class14_Sub2.method243(37);
                                r.aBoolean9719 = false;
                                break;
                            } else Applet_Sub1.method94("Failed to enter tk3", 54);
                            break;
                        }
                        if (string.equalsIgnoreCase("tk5")) {
                            Class367_Sub10.method3553(false, (byte) 113, 5);
                            if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(i ^ 0x7e13) == 5) {
                                Applet_Sub1.method94("Entered tk5", -108);
                                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub25_7251), 5);
                                Class14_Sub2.method243(37);
                                r.aBoolean9719 = false;
                            } else {
                                Applet_Sub1.method94("Failed to enter tk5", 63);
                                break;
                            }
                            break;
                        }
                        if (string.startsWith("setba")) {
                            if (string.length() < 6) Applet_Sub1.method94("Invalid buildarea value", i + -36);
                            else {
                                int i_6_ = (Class348_Sub41.parseInt(true, string.substring(6)));
                                if (i_6_ < 0 || (Class348.method2710(-126, Class226.anInt2964) < i_6_)) Applet_Sub1.method94("Invalid buildarea value", 53);
                                else {
                                    Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub6_7226), i_6_);
                                    Class14_Sub2.method243(37);
                                    r.aBoolean9719 = false;
                                    Applet_Sub1.method94(("maxbuildarea=" + Class316.aClass348_Sub51_3959.aClass239_Sub6_7226.method1743(-32350)), 98);
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        if (string.startsWith("rect_debug")) {
                            if (string.length() < 10) Applet_Sub1.method94("Invalid rect_debug value", -94);
                            else {
                                ha_Sub3.anInt8045 = Class348_Sub41.parseInt(true, string.substring(10).trim());
                                Applet_Sub1.method94(("rect_debug=" + ha_Sub3.anInt8045), -124);
                                break;
                            }
                            break;
                        }
                        if (string.equalsIgnoreCase("qa_op_test")) {
                            Class299_Sub2.aBoolean6327 = true;
                            Applet_Sub1.method94(("qa_op_test=" + (Class299_Sub2.aBoolean6327)), -114);
                            break;
                        }
                        if (string.equalsIgnoreCase("clipcomponents")) {
                            Class318_Sub1_Sub3_Sub2.aBoolean10046 = !Class318_Sub1_Sub3_Sub2.aBoolean10046;
                            Applet_Sub1.method94(("clipcomponents=" + (Class318_Sub1_Sub3_Sub2.aBoolean10046)), 88);
                            break;
                        }
                        if (string.startsWith("bloom")) {
                            boolean bool_7_ = Class348_Sub8.aHa6654.method3666();
                            if (Class348_Sub40_Sub33.method3137(!bool_7_, (byte) -24)) {
                                if (bool_7_) {
                                    Applet_Sub1.method94("Bloom disabled", i + -49);
                                    break;
                                } else Applet_Sub1.method94("Bloom enabled", 71);
                                break;
                            } else Applet_Sub1.method94("Failed to enable bloom", 52);
                            break;
                        }
                        if (string.equalsIgnoreCase("tween")) {
                            if (Class28.aBoolean5002) {
                                Class28.aBoolean5002 = false;
                                Applet_Sub1.method94("Forced tweening disabled.", i ^ ~0x71);
                                break;
                            } else {
                                Class28.aBoolean5002 = true;
                                Applet_Sub1.method94("Forced tweening ENABLED!", -89);
                            }
                            break;
                        }
                        if (string.equalsIgnoreCase("shiftclick")) {
                            if (Class116.shiftClick) {
                                Applet_Sub1.method94("Shift-click disabled.", i ^ ~0x24);
                                Class116.shiftClick = false;
                            } else {
                                Applet_Sub1.method94("Shift-click ENABLED!", 106);
                                Class116.shiftClick = true;
                                break;
                            }
                            break;
                        }
                        if (string.equalsIgnoreCase("getcgcoord")) {
                            Applet_Sub1.method94(("x:" + ((Class132.aPlayer_1907.x) >> 9) + " z:" + ((Class132.aPlayer_1907.y) >> 9)), -117);
                            break;
                        }
                        if (string.equalsIgnoreCase("getheight")) {
                            Applet_Sub1.method94(("Height: " + (aa_Sub1.aSArray5191[(Class132.aPlayer_1907.plane)].method3982((byte) -86, (Class132.aPlayer_1907.y) >> 9, (Class132.aPlayer_1907.x) >> 9))), i ^ 0x1);
                            break;
                        }
                        if (string.equalsIgnoreCase("resetminimap")) {
                            Class21.SPRITES.method405(i ^ ~0x4e);
                            Class21.SPRITES.method412((byte) 127);
                            Class2.aClass141_117.method1175((byte) 125);
                            Class348_Sub23_Sub2.aClass153_9031.method1219(7851);
                            Class50_Sub2.method464(-1);
                            Applet_Sub1.method94("Minimap reset", 70);
                            break;
                        }
                        if (string.startsWith("mc")) {
                            if (Class348_Sub8.aHa6654.method3708()) {
                                int i_8_ = Integer.parseInt(string.substring(3));
                                if (i_8_ >= 1) {
                                    if (i_8_ > 4) i_8_ = 4;
                                } else i_8_ = 1;
                                Class239_Sub16.anInt6012 = i_8_;
                                Class348_Sub20.method2953((byte) -128);
                                Applet_Sub1.method94(("Render cores now: " + (Class239_Sub16.anInt6012)), -77);
                            } else {
                                Applet_Sub1.method94("Current toolkit doesn't support multiple cores", i + 138);
                                break;
                            }
                            break;
                        }
                        if (string.startsWith("cachespace")) {
                            Applet_Sub1.method94(("I(s): " + Class351.aClass60_4327.method581(-18529) + "/" + Class351.aClass60_4327.method577(-4)), -101);
                            Applet_Sub1.method94(("I(m): " + Class358.aClass60_4417.method581(-18529) + "/" + Class358.aClass60_4417.method577(i ^ 0x4d)), 127);
                            Applet_Sub1.method94(("O(s): " + Exception_Sub1.aClass255_112.aClass175_3288.method1350((byte) 126) + "/" + Exception_Sub1.aClass255_112.aClass175_3288.method1339(100)), i + 203);
                            break;
                        }
                        if (string.equalsIgnoreCase("getcamerapos")) {
                            Applet_Sub1.method94(("Pos: " + (Class132.aPlayer_1907.plane) + "," + (((Class286_Sub4.anInt6246 >> 9) - -za_Sub2.regionTileX) >> 6) + "," + ((Class59_Sub2_Sub2.anInt8685 >> 9) + Class90.regionTileY >> 6) + "," + (((Class286_Sub4.anInt6246 >> 9) - -za_Sub2.regionTileX) & 0x3f) + "," + ((Class59_Sub2_Sub2.anInt8685 >> 9) - -Class90.regionTileY & 0x3f) + " Height: " + ((Class275.method2064(Class286_Sub4.anInt6246, (Class132.aPlayer_1907.plane), 11219, Class59_Sub2_Sub2.anInt8685)) - Class305.anInt3855)), 126);
                            Applet_Sub1.method94(("Look: " + (Class132.aPlayer_1907.plane) + "," + (Class352.anInt4336 - -za_Sub2.regionTileX >> 6) + "," + (Class90.regionTileY + Class281.anInt3647 >> 6) + "," + (0x3f & Class352.anInt4336 - -za_Sub2.regionTileX) + "," + (0x3f & Class281.anInt3647 - -Class90.regionTileY) + " Height: " + ((Class275.method2064(Class352.anInt4336, (Class132.aPlayer_1907.plane), 11219, Class281.anInt3647)) - Class121.anInt1797)), -90);
                            break;
                        }
                        if (string.equals("renderprofile") || string.equals("rp")) {
                            Class188.aBoolean2514 = !Class188.aBoolean2514;
                            Class348_Sub8.aHa6654.method3647(Class188.aBoolean2514);
                            Class110_Sub1.method1042((byte) 23);
                            Applet_Sub1.method94(("showprofiling=" + Class188.aBoolean2514), 106);
                            break;
                        }
                        if (string.startsWith("performancetest")) {
                            int i_9_ = -1;
                            int i_10_ = 1000;
                            if (string.length() > 15) {
                                String[] strings = Class348_Sub40_Sub23.method3113(' ', true, string);
                                try {
                                    if (strings.length > 1) i_10_ = Integer.parseInt(strings[1]);
                                } catch (Throwable throwable) {
                                    /* empty */
                                }
                                try {
                                    if (strings.length > 2) i_9_ = Integer.parseInt(strings[2]);
                                } catch (Throwable throwable) {
                                    /* empty */
                                }
                            }
                            if (i_9_ == -1) {
                                Applet_Sub1.method94(("Java toolkit: " + Class239_Sub14.method1781(0, -85, i_10_)), i + -32);
                                Applet_Sub1.method94(("SSE toolkit:  " + Class239_Sub14.method1781(2, -73, i_10_)), 60);
                                Applet_Sub1.method94(("D3D toolkit:  " + Class239_Sub14.method1781(3, i + -24, i_10_)), i ^ ~0x11);
                                Applet_Sub1.method94(("GL toolkit:   " + Class239_Sub14.method1781(1, -84, i_10_)), -121);
                                Applet_Sub1.method94(("GLX toolkit:  " + Class239_Sub14.method1781(5, -77, i_10_)), -101);
                                break;
                            } else Applet_Sub1.method94(("Performance: " + Class239_Sub14.method1781(i_9_, -69, i_10_)), -84);
                            break;
                        }
                        if (string.equals("nonpcs")) {
                            Class373_Sub2.aBoolean7444 = !Class373_Sub2.aBoolean7444;
                            Applet_Sub1.method94("nonpcs=" + (Class373_Sub2.aBoolean7444), -120);
                            break;
                        }
                        if (string.equals("autoworld")) {
                            Class348_Sub42_Sub20.method3283(127);
                            Applet_Sub1.method94("auto world selected", -59);
                            break;
                        }
                        if (string.startsWith("switchworld")) {
                            int i_11_ = Integer.parseInt(string.substring(12));
                            Class348_Sub23_Sub1.method2972((Class239_Sub5.method1742(false, i_11_).aString5794), i_11_, -93);
                            Applet_Sub1.method94("switched", 70);
                            break;
                        }
                        if (string.equals("getworld")) {
                            Applet_Sub1.method94(("w: " + (Class3.aClass161_125.anInt2143)), -120);
                            break;
                        }
                        if (string.startsWith("pc")) {
                            Class348_Sub47 class348_sub47 = (Class286_Sub3.method2148(Class348_Sub40_Sub22.aClass351_9304, Class348_Sub23_Sub2.aClass77_9029, -97));
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                            int i_12_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
                            int i_13_ = string.indexOf(" ", 4);
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string.substring(3, i_13_));
                            Class367_Sub4.method3544((class348_sub47.aClass348_Sub49_Sub2_7116), i + -12, string.substring(i_13_));
                            class348_sub47.aClass348_Sub49_Sub2_7116.method3339(114, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197 + -i_12_));
                            Class348_Sub42_Sub14.method3243(i ^ ~0x49, class348_sub47);
                            break;
                        }
                        if (string.equals("savevarcs")) {
                            Class318_Sub1_Sub2.method2405(119);
                            Applet_Sub1.method94("perm varcs saved", -103);
                            break;
                        }
                        if (string.equals("scramblevarcs")) {
                            for (int i_14_ = 0; (i_14_ < Class77.anIntArray1303.length); i_14_++) {
                                if (Class286_Sub6.aBooleanArray6270[i_14_]) {
                                    Class77.anIntArray1303[i_14_] = (int) (Math.random() * 99999.0);
                                    if (Math.random() > 0.5) Class77.anIntArray1303[i_14_] *= -1;
                                }
                            }
                            Class318_Sub1_Sub2.method2405(-61);
                            Applet_Sub1.method94("perm varcs scrambled", -74);
                            break;
                        }
                        if (string.equals("showcolmap")) {
                            Class375.aBoolean4542 = true;
                            Class50_Sub2.method464(-1);
                            Applet_Sub1.method94("colmap is shown", 53);
                            break;
                        }
                        if (string.equals("hidecolmap")) {
                            Class375.aBoolean4542 = false;
                            Class50_Sub2.method464(i ^ 0x4e);
                            Applet_Sub1.method94("colmap is hidden", 61);
                            break;
                        }
                        if (string.equals("resetcache")) {
                            Class348_Sub18.method2938((byte) 122);
                            Applet_Sub1.method94("Caches reset", -113);
                            break;
                        }
                        if (string.equals("profilecpu")) {
                            Applet_Sub1.method94((Class284.method2116(-26584) + "ms"), 87);
                            break;
                        }
                        if (string.startsWith("getclientvarpbit")) {
                            int i_15_ = Integer.parseInt(string.substring(17));
                            Applet_Sub1.method94("varpbit=" + Class318_Sub1_Sub3_Sub3.aClass170_10209.method62(i_15_, i ^ 0xffb1), i + 198);
                            break;
                        }
                        if (string.startsWith("getclientvarp")) {
                            int i_16_ = Integer.parseInt(string.substring(14));
                            Applet_Sub1.method94("varp=" + Class318_Sub1_Sub3_Sub3.aClass170_10209.method61(i_16_, (byte) -16), -68);
                            break;
                        }
                        if (string.startsWith("directlogin")) {
                            String[] strings = (Class348_Sub40_Sub23.method3113(' ', true, string.substring(12)));
                            if (strings.length >= 2) {
                                int i_17_ = (strings.length > 2 ? Integer.parseInt(strings[2]) : 0);
                                Class253.method1922(strings[1], i_17_, strings[0], true);
                                break;
                            }
                        }
                        if (string.startsWith("csprofileclear")) {
                            Class66.method706();
                            break;
                        }
                        if (string.startsWith("csprofileoutputc")) {
                            Class66.method715(100, false);
                            break;
                        }
                        if (string.startsWith("csprofileoutputt")) {
                            Class66.method715(10, true);
                            break;
                        }
                        if (string.startsWith("texsize")) {
                            int i_18_ = Integer.parseInt(string.substring(8));
                            Class348_Sub8.aHa6654.method3696(i_18_);
                            break;
                        }
                        if (string.equals("soundstreamcount")) {
                            Applet_Sub1.method94(("Active streams: " + Class348_Sub43.aClass348_Sub16_Sub4_7065.method2887()), 84);
                            break;
                        }
                        if (string.equals("autosetup")) {
                            Class318_Sub1_Sub4.method2478(1000);
                            Applet_Sub1.method94(("Complete. Toolkit now: " + Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(i + -32271)), -97);
                            break;
                        }
                        if (string.equals("errormessage")) {
                            Applet_Sub1.method94(Class79.aClient1367.method81((byte) 102), 102);
                            break;
                        }
                        if (string.equals("heapdump")) {
                            if (!Class297.aString3803.startsWith("win")) Class158.method1247(new File("/tmp/heap.dump"), false, false);
                            else Class158.method1247(new File("C:\\Temp\\heap.dump"), false, false);
                            Applet_Sub1.method94("Done", 74);
                            break;
                        }
                        if (string.equals("os")) {
                            Applet_Sub1.method94("Name: " + Class297.aString3803, 59);
                            Applet_Sub1.method94(("Arch: " + Class297.aString3780), i ^ ~0x1);
                            Applet_Sub1.method94("Ver: " + Class297.aString3778, 79);
                            break;
                        }
                        if (string.startsWith("w2debug")) {
                            int i_19_ = Integer.parseInt(string.substring(8, 9));
                            Class318_Sub1_Sub4_Sub2.anInt10096 = i_19_;
                            Class348_Sub20.method2953((byte) -103);
                            Applet_Sub1.method94("Toggled!", -99);
                            break;
                        }
                        if (string.startsWith("ortho ")) {
                            int i_20_ = string.indexOf(' ');
                            if (i_20_ < 0) Applet_Sub1.method94("Syntax: ortho <n>", 66);
                            else {
                                int i_21_ = (Class348_Sub41.parseInt(true, string.substring(1 + i_20_)));
                                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub3_7222), i_21_);
                                Class14_Sub2.method243(37);
                                r.aBoolean9719 = false;
                                Class348_Sub42_Sub3.method3179(i + 79);
                                if (Class316.aClass348_Sub51_3959.aClass239_Sub3_7222.method1727(-32350) == i_21_) {
                                    Applet_Sub1.method94("Successfully changed ortho mode", -82);
                                    break;
                                } else Applet_Sub1.method94("Failed to change ortho mode", -112);
                                break;
                            }
                            break;
                        }
                        if (string.startsWith("orthozoom ")) {
                            if (Class316.aClass348_Sub51_3959.aClass239_Sub3_7222.method1727(i + -32271) == 0) Applet_Sub1.method94("enable ortho mode first (use 'ortho <n>')", i + 182);
                            else {
                                int i_22_ = (Class348_Sub41.parseInt(true, string.substring(string.indexOf(' ') - -1)));
                                Class132.anInt1911 = i_22_;
                                Applet_Sub1.method94(("orthozoom=" + Class132.anInt1911), 68);
                                break;
                            }
                            break;
                        }
                        if (string.startsWith("orthotilesize ")) {
                            int i_23_ = (Class348_Sub41.parseInt(true, string.substring(1 + string.indexOf(' '))));
                            Class186_Sub1.anInt5812 = Index.anInt666 = i_23_;
                            Applet_Sub1.method94("ortho tile size=" + i_23_, -70);
                            Class348_Sub42_Sub3.method3179(0);
                            break;
                        }
                        if (string.equals("orthocamlock")) {
                            Class348_Sub49_Sub1.aBoolean9746 = !Class348_Sub49_Sub1.aBoolean9746;
                            Applet_Sub1.method94(("ortho camera lock is " + (!(Class348_Sub49_Sub1.aBoolean9746) ? "off" : "on")), -92);
                            break;
                        }
                        if (string.startsWith("setoutput ")) {
                            File file = new File(string.substring(10));
                            if (file.exists()) {
                                file = new File(string.substring(10) + "." + Class62.method599(-76) + ".log");
                                if (file.exists()) {
                                    Applet_Sub1.method94("file already exists!", 80);
                                    break;
                                }
                            }
                            if (Class299_Sub1.aFileOutputStream6323 != null) {
                                Class299_Sub1.aFileOutputStream6323.close();
                                Class299_Sub1.aFileOutputStream6323 = null;
                            }
                            try {
                                Class299_Sub1.aFileOutputStream6323 = new FileOutputStream(file);
                            } catch (java.io.FileNotFoundException filenotfoundexception) {
                                Applet_Sub1.method94(("Could not create " + file.getName()), 81);
                            } catch (SecurityException securityexception) {
                                Applet_Sub1.method94(("Cannot write to " + file.getName()), i ^ ~0x22);
                            }
                            break;
                        }
                        if (string.equals("closeoutput")) {
                            if (Class299_Sub1.aFileOutputStream6323 != null) Class299_Sub1.aFileOutputStream6323.close();
                            Class299_Sub1.aFileOutputStream6323 = null;
                            break;
                        }
                        if (string.startsWith("runscript ")) {
                            File file = new File(string.substring(10));
                            if (!file.exists()) {
                                Applet_Sub1.method94("No such file", 120);
                                break;
                            }
                            byte[] is = Class239_Sub24.method1821(i ^ 0x41, file);
                            if (is == null) {
                                Applet_Sub1.method94("Failed to read file", 119);
                                break;
                            }
                            String[] strings = (Class348_Sub40_Sub23.method3113('\n', true, (Class261.method1981(Class239_Sub17.method1795(is, true), (byte) -89, '\r', ""))));
                            Class348_Sub42_Sub6.method3189(0, strings);
                        }
                        if (string.startsWith("zoom ")) {
                            short i_24_ = (short) (Class348_Sub41.parseInt(true, string.substring(5)));
                            if (i_24_ > 0) Class320.aShort3992 = i_24_;
                            break;
                        }
                        if (Class240.anInt4674 == 10) {
                            Class292.anInt4799++;
                            Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class101_Sub2.aClass351_5699), (Class348_Sub23_Sub2.aClass77_9029), i ^ 0x24);
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, string.length() + 3);
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, bool ? 1 : 0);
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, bool_0_ ? 1 : 0);
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                            Class348_Sub42_Sub14.method3243(120, class348_sub47);
                        }
                        if (string.startsWith("fps ") && (Class8.aClass364_165 != Class55_Sub1.aClass364_5271)) {
                            Class295.method2222((Class348_Sub41.parseInt(true, string.substring(4))), (byte) -124);
                            break;
                        }
                    } catch (Exception exception) {
                        Applet_Sub1.method94(Class274.aClass274_3485.method2063(Class348_Sub33.anInt6967, 544), -92);
                        break;
                    }
                }
                if (Class240.anInt4674 == 10) break;
                Applet_Sub1.method94(Class274.aClass274_3486.method2063(Class348_Sub33.anInt6967, 544) + string, 57);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("lba.B(" + (string != null ? "{...}" : "null") + ',' + bool + ',' + bool_0_ + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    static final Class318_Sub1_Sub4 method813(int i, int i_25_, int i_26_) {
        Class357 class357 = Class147.aClass357ArrayArrayArray2029[i][i_25_][i_26_];
        if (class357 == null) return null;
        return class357.aClass318_Sub1_Sub4_4403;
    }

    static final void method814(byte i, long l) {
        try {
            anInt1438++;
            int i_27_ = Class348_Sub6.anInt6633;
            if (i > 106) {
                if (Class130_Sub1.anInt5799 != i_27_) {
                    int i_28_ = i_27_ - Class130_Sub1.anInt5799;
                    int i_29_ = (int) ((long) i_28_ * l / 320L);
                    if (i_28_ <= 0) {
                        if (i_29_ != 0) {
                            if (i_29_ < i_28_) i_29_ = i_28_;
                        } else i_29_ = -1;
                    } else if (i_29_ == 0) i_29_ = 1;
                    else if (i_28_ < i_29_) i_29_ = i_28_;
                    Class130_Sub1.anInt5799 += i_29_;
                }
                int i_30_ = Class348_Sub7.anInt6652;
                Class76.aFloat1287 += Class348_Sub27.aFloat6898 * (float) l / 40.0F * 8.0F;
                Class314.aFloat3938 += Class205.aFloat2687 * (float) l / 40.0F * 8.0F;
                if (Class192.anInt2578 != i_30_) {
                    int i_31_ = -Class192.anInt2578 + i_30_;
                    int i_32_ = (int) (l * (long) i_31_ / 320L);
                    if (i_31_ <= 0) {
                        if (i_32_ == 0) i_32_ = -1;
                        else if (i_32_ < i_31_) i_32_ = i_31_;
                    } else if (i_32_ != 0) {
                        if (i_31_ < i_32_) i_32_ = i_31_;
                    } else i_32_ = 1;
                    Class192.anInt2578 += i_32_;
                }
                Class239_Sub2.method1725(262144);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "lba.A(" + i + ',' + l + ')');
        }
    }

    Class82(Class230 class230, int i, Index index) {
        new Class60(64);
        try {
            aIndex_1436 = index;
            this.anInt1439 = aIndex_1436.method407(0, 15);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("lba.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (index != null ? "{...}" : "null") + ')'));
        }
    }
}
