/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Method;

final class Class133 {
    static int anInt1912;
    static int anInt1913;
    static Class114 aClass114_1914 = new Class114(84, 7);
    static boolean aBoolean1915 = false;
    static int anInt1916;
    static Class114 aClass114_1917 = new Class114(20, -2);
    static byte[][] aByteArrayArray1918 = new byte[250][];
    /*synthetic*/ static Class aClass1919;
    /*synthetic*/ static Class aClass1920;

    public static void method1139(int i) {
        if (i == 2767) {
            aByteArrayArray1918 = null;
            aClass114_1917 = null;
            aClass114_1914 = null;
        }
    }

    static final void method1140(int i) {
        anInt1916++;
        Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub27_7255), 1);
        Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub27_7261), 1);
        Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub14_7250), 2);
        Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub14_7264), 2);
        Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub4_7220), 1);
        Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub9_7256), 1);
        Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub13_7236), 1);
        Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub1_7246), 1);
        Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub21_7270), 1);
        if (i >= 45) {
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub24_7235), 1);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub7_7238), 2);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub28_7230), 1);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub18_7259), 2);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub16_7247), 1);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub20_7216), 0);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub20_7248), 0);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub15_7224), 2);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub6_7226), 0);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub12_7243), 0);
            Class237.method1686(-127);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub23_7231), 0);
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub29_7229), 4);
            Class348_Sub40.method3038(-1);
            Class76.method773(true);
            RuntimeException_Sub1.aBoolean4604 = true;
        }
    }

    static final void method1141(Class348_Sub49_Sub2 class348_sub49_sub2, int i, int i_0_, int i_1_, Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2) {
        do {
            try {
                anInt1912++;
                if (i_1_ >= 41) {
                    byte i_2_ = -1;
                    if ((i_0_ & 0x1) != 0) {
                        int i_3_ = class348_sub49_sub2.readShort(842397944);
                        if (i_3_ == 65535) i_3_ = -1;
                        class318_sub1_sub3_sub3_sub2.anInt10275 = i_3_;
                    }
                    if ((0x10000 & i_0_) != 0) {
                        int i_4_ = class348_sub49_sub2.readUnsignedByte(255);
                        int[] is = new int[i_4_];
                        int[] is_5_ = new int[i_4_];
                        for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
                            int i_7_ = class348_sub49_sub2.readShortAddLittle(-118);
                            if ((i_7_ & 0xc000) == 49152) {
                                int i_8_ = class348_sub49_sub2.readShortLittle(false);
                                is[i_6_] = Class273.method2057(i_7_ << -66426544, i_8_);
                            } else is[i_6_] = i_7_;
                            is_5_[i_6_] = class348_sub49_sub2.readShortLittle(false);
                        }
                        class318_sub1_sub3_sub3_sub2.method2430(is_5_, is, -116);
                    }
                    if ((0x400 & i_0_) != 0) {
                        int i_9_ = class348_sub49_sub2.readShortLittle(false);
                        class318_sub1_sub3_sub3_sub2.anInt10227 = class348_sub49_sub2.readUnsignedByteSubtract((byte) -94);
                        class318_sub1_sub3_sub3_sub2.anInt10271 = class348_sub49_sub2.readUnsignedByteSubtract((byte) -104);
                        class318_sub1_sub3_sub3_sub2.anInt10210 = 0x7fff & i_9_;
                        class318_sub1_sub3_sub3_sub2.aBoolean10226 = (i_9_ & 0x8000) != 0;
                        class318_sub1_sub3_sub3_sub2.anInt10287 = (class318_sub1_sub3_sub3_sub2.anInt10210 + (Class367_Sub11.anInt7396 + (class318_sub1_sub3_sub3_sub2.anInt10227)));
                    }
                    if ((0x1000 & i_0_) != 0) {
                        class318_sub1_sub3_sub3_sub2.aString10292 = class348_sub49_sub2.method3377((byte) 110);
                        if (class318_sub1_sub3_sub3_sub2.aString10292.charAt(0) == '~') {
                            class318_sub1_sub3_sub3_sub2.aString10292 = class318_sub1_sub3_sub3_sub2.aString10292.substring(1);
                            Class286_Sub2.method2144(class318_sub1_sub3_sub3_sub2.method2450(false, -70), 2, (byte) -116, 0, class318_sub1_sub3_sub3_sub2.aString10292, class318_sub1_sub3_sub3_sub2.method2456(true, 255), class318_sub1_sub3_sub3_sub2.aString10537);
                        } else if (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907 == class318_sub1_sub3_sub3_sub2)
                            Class286_Sub2.method2144(class318_sub1_sub3_sub3_sub2.method2450(false, -88), 2, (byte) -102, 0, (class318_sub1_sub3_sub3_sub2.aString10292), class318_sub1_sub3_sub3_sub2.method2456(true, 255), (class318_sub1_sub3_sub3_sub2.aString10537));
                        class318_sub1_sub3_sub3_sub2.anInt10264 = 150;
                        class318_sub1_sub3_sub3_sub2.anInt10234 = 0;
                        class318_sub1_sub3_sub3_sub2.anInt10201 = 0;
                    }
                    if ((i_0_ & 0x4) != 0) {
                        int i_10_ = class348_sub49_sub2.readShortInverse((byte) 21);
                        if (i_10_ > 0) {
                            for (int i_11_ = 0; i_10_ > i_11_; i_11_++) {
                                int i_12_ = -1;
                                int i_13_ = -1;
                                int i_14_ = class348_sub49_sub2.method3382(-127);
                                int i_15_ = -1;
                                if (i_14_ == 32767) {
                                    i_14_ = class348_sub49_sub2.method3382(-125);
                                    i_13_ = class348_sub49_sub2.method3382(-126);
                                    i_12_ = class348_sub49_sub2.method3382(-128);
                                    i_15_ = class348_sub49_sub2.method3382(-122);
                                } else if (i_14_ != 32766) i_13_ = class348_sub49_sub2.method3382(-117);
                                else i_14_ = -1;
                                int i_16_ = class348_sub49_sub2.method3382(-123);
                                int i_17_ = class348_sub49_sub2.readByteSubtract((byte) -98);
                                class318_sub1_sub3_sub3_sub2.method2438(i_13_, Class367_Sub11.anInt7396, i_14_, i_15_, i_12_, i_16_, i_17_, (byte) 102);
                            }
                        }
                    }
                    if ((i_0_ & 0x2) != 0) {
                        class318_sub1_sub3_sub3_sub2.anInt10524 = class348_sub49_sub2.readShort(842397944);
                        if (class318_sub1_sub3_sub3_sub2.anInt10319 == 0) {
                            class318_sub1_sub3_sub3_sub2.method2440((byte) 49, class318_sub1_sub3_sub3_sub2.anInt10524);
                            class318_sub1_sub3_sub3_sub2.anInt10524 = -1;
                        }
                    }
                    if ((0x8000 & i_0_) != 0) class318_sub1_sub3_sub3_sub2.aBoolean10554 = class348_sub49_sub2.readByteSubtract((byte) -94) == 1;
                    if ((i_0_ & 0x100) != 0) {
                        int i_18_ = class348_sub49_sub2.readShortInverse((byte) 21);
                        int[] is = new int[i_18_];
                        int[] is_19_ = new int[i_18_];
                        int[] is_20_ = new int[i_18_];
                        for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
                            int i_22_ = class348_sub49_sub2.readShort(842397944);
                            if (i_22_ == 65535) i_22_ = -1;
                            is[i_21_] = i_22_;
                            is_19_[i_21_] = class348_sub49_sub2.readShortInverse((byte) 21);
                            is_20_[i_21_] = class348_sub49_sub2.readShort(842397944);
                        }
                        Class167.method1297((byte) -116, class318_sub1_sub3_sub3_sub2, is_20_, is, is_19_);
                    }
                    if ((0x2000 & i_0_) != 0) {
                        class318_sub1_sub3_sub3_sub2.anInt10293 = class348_sub49_sub2.method3388(-121);
                        class318_sub1_sub3_sub3_sub2.anInt10314 = class348_sub49_sub2.method3345(-27697);
                        class318_sub1_sub3_sub3_sub2.anInt10241 = class348_sub49_sub2.method3361(-622951480);
                        class318_sub1_sub3_sub3_sub2.anInt10288 = class348_sub49_sub2.method3361(-622951480);
                        class318_sub1_sub3_sub3_sub2.anInt10239 = (class348_sub49_sub2.readShortAddLittle(-118) - -Class367_Sub11.anInt7396);
                        class318_sub1_sub3_sub3_sub2.anInt10300 = (class348_sub49_sub2.readByteAdd(19) - -Class367_Sub11.anInt7396);
                        class318_sub1_sub3_sub3_sub2.anInt10231 = class348_sub49_sub2.readUnsignedByte(255);
                        class318_sub1_sub3_sub3_sub2.anInt10322 = 0;
                        if (class318_sub1_sub3_sub3_sub2.aBoolean10539) {
                            class318_sub1_sub3_sub3_sub2.anInt10288 += class318_sub1_sub3_sub3_sub2.anInt10531;
                            class318_sub1_sub3_sub3_sub2.anInt10293 += class318_sub1_sub3_sub3_sub2.anInt10549;
                            class318_sub1_sub3_sub3_sub2.anInt10314 += class318_sub1_sub3_sub3_sub2.anInt10531;
                            class318_sub1_sub3_sub3_sub2.anInt10241 += class318_sub1_sub3_sub3_sub2.anInt10549;
                            class318_sub1_sub3_sub3_sub2.anInt10319 = 0;
                        } else {
                            class318_sub1_sub3_sub3_sub2.anInt10241 += (class318_sub1_sub3_sub3_sub2.anIntArray10320[0]);
                            class318_sub1_sub3_sub3_sub2.anInt10288 += (class318_sub1_sub3_sub3_sub2.anIntArray10317[0]);
                            class318_sub1_sub3_sub3_sub2.anInt10319 = 1;
                            class318_sub1_sub3_sub3_sub2.anInt10314 += (class318_sub1_sub3_sub3_sub2.anIntArray10317[0]);
                            class318_sub1_sub3_sub3_sub2.anInt10293 += (class318_sub1_sub3_sub3_sub2.anIntArray10320[0]);
                        }
                    }
                    if ((0x200 & i_0_) != 0) {
                        int i_23_ = class348_sub49_sub2.readShortAddLittle(-107);
                        if (i_23_ == 65535) i_23_ = -1;
                        int i_24_ = class348_sub49_sub2.method3364((byte) -121);
                        int i_25_ = class348_sub49_sub2.readUnsignedByteSubtract((byte) 54);
                        int i_26_ = i_25_ & 0x7;
                        int i_27_ = 0xf & i_25_ >> 946985891;
                        if (i_27_ == 15) i_27_ = -1;
                        class318_sub1_sub3_sub3_sub2.method2437(i_26_, i_23_, -1012294866, i_27_, true, i_24_);
                    }
                    if ((i_0_ & 0x40000) != 0) {
                        class318_sub1_sub3_sub3_sub2.aByte10255 = class348_sub49_sub2.method3361(-622951480);
                        class318_sub1_sub3_sub3_sub2.aByte10206 = class348_sub49_sub2.method3388(-99);
                        class318_sub1_sub3_sub3_sub2.aByte10270 = class348_sub49_sub2.method3388(-87);
                        class318_sub1_sub3_sub3_sub2.aByte10279 = (byte) class348_sub49_sub2.readUnsignedByte(255);
                        class318_sub1_sub3_sub3_sub2.anInt10248 = (Class367_Sub11.anInt7396 - -class348_sub49_sub2.readShortAddLittle(-120));
                        class318_sub1_sub3_sub3_sub2.anInt10250 = (Class367_Sub11.anInt7396 - -class348_sub49_sub2.readByteAdd(125));
                    }
                    if ((i_0_ & 0x80) != 0) Class259.aByteArray3300[i] = class348_sub49_sub2.method3345(-27697);
                    if ((i_0_ & 0x20) != 0) {
                        int i_28_ = class348_sub49_sub2.readShortAddLittle(-126);
                        if (i_28_ == 65535) i_28_ = -1;
                        int i_29_ = class348_sub49_sub2.method3346(255);
                        int i_30_ = class348_sub49_sub2.readByteSubtract((byte) -125);
                        int i_31_ = i_30_ & 0x7;
                        int i_32_ = (0x78 & i_30_) >> -1543635709;
                        if (i_32_ == 15) i_32_ = -1;
                        class318_sub1_sub3_sub3_sub2.method2437(i_31_, i_28_, -1012294866, i_32_, false, i_29_);
                    }
                    if ((0x8 & i_0_) != 0) {
                        int[] is = new int[4];
                        for (int i_33_ = 0; i_33_ < 4; i_33_++) {
                            is[i_33_] = class348_sub49_sub2.readByteAdd(123);
                            if (is[i_33_] == 65535) is[i_33_] = -1;
                        }
                        int i_34_ = class348_sub49_sub2.readByteSubtract((byte) -101);
                        Class239_Sub16.method1791(23946, is, i_34_, class318_sub1_sub3_sub3_sub2);
                    }
                    if ((i_0_ & 0x10) != 0) {
                        int i_35_ = class348_sub49_sub2.readUnsignedByte(255);
                        byte[] is = new byte[i_35_];
                        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
                        class348_sub49_sub2.method3347(is, 0, i_35_, (byte) -124);
                        Class154.aClass348_Sub49Array2105[i] = class348_sub49;
                        class318_sub1_sub3_sub3_sub2.method2452((byte) 84, class348_sub49);
                    }
                    if ((0x800 & i_0_) != 0) i_2_ = class348_sub49_sub2.method3361(-622951480);
                    if (!class318_sub1_sub3_sub3_sub2.aBoolean10539) break;
                    if (i_2_ != 127) {
                        byte i_36_;
                        if (i_2_ != -1) i_36_ = i_2_;
                        else i_36_ = Class259.aByteArray3300[i];
                        Class348_Sub42_Sub9_Sub1.method3208(class318_sub1_sub3_sub3_sub2, i_36_, -21);
                        class318_sub1_sub3_sub3_sub2.method2455(class318_sub1_sub3_sub3_sub2.anInt10531, -26443, i_36_, class318_sub1_sub3_sub3_sub2.anInt10549);
                    } else class318_sub1_sub3_sub3_sub2.method2449(class318_sub1_sub3_sub3_sub2.anInt10531, class318_sub1_sub3_sub3_sub2.anInt10549, (byte) 84);
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("ns.A(" + (class348_sub49_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (class318_sub1_sub3_sub3_sub2 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static final synchronized void method1142(byte i) {
        anInt1913++;
        if (Class168.anObject2256 == null) {
            try {
                Class var_class = Class.forName("java.lang.management.ManagementFactory");
                Method method = var_class.getDeclaredMethod("getPlatformMBeanServer", null);
                Object object = method.invoke(null, null);
                if (i == 26) {
                    Method method_37_ = (var_class.getMethod("newPlatformMXBeanProxy", (Class.forName("javax.management.MBeanServerConnection")), (aClass1919 != null ? aClass1919 : (aClass1919 = method1143("java.lang.String"))), (aClass1920 != null ? aClass1920 : (aClass1920 = method1143("java.lang.Class")))));
                    Class168.anObject2256 = (method_37_.invoke(null, object, "com.sun.management:type=HotSpotDiagnostic", (Class.forName("com.sun.management.HotSpotDiagnosticMXBean"))));
                }
            } catch (Exception exception) {
                System.out.println("HeapDump setup error:");
                exception.printStackTrace();
            }
        }
    }

    /*synthetic*/
    static Class method1143(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
