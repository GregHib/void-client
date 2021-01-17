/* Class348_Sub42_Sub8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class348_Sub42_Sub8_Sub2 extends Class348_Sub42_Sub8 {
    private final Object anObject10429;
    static int anInt10430;
    static long[][][] aLongArrayArrayArray10431;
    static int anInt10432;
    static int anInt10433;
    static Class230 aClass230_10434 = null;
    static int anInt10435;
    static Class76 aClass76_10436 = new Class76(true);
    static Class74 aClass74_10437 = new Class74(0, 3);
    static int anInt10438;

    static final boolean method3200(int i, int i_0_, byte i_1_) {
        anInt10433++;
        int i_2_ = 18 / ((i_1_ - 30) / 42);
        if (!Class296.method2224(i, (byte) -118, i_0_)) return false;
        if (Class239_Sub26.method1833((byte) -118, i, i_0_) | (0x9000 & i) != 0 | Class348_Sub23_Sub4.method2985(-31735, i_0_, i)) return true;
        return ((0x37 & i_0_) == 0 & ((0x2000 & i) != 0 | Class274.method2058(i, i_0_, 88) | Class348_Sub42_Sub9.method3203(i_0_, (byte) 127, i)));
    }

    Class348_Sub42_Sub8_Sub2(Object object, int i) {
        super(i);
        anObject10429 = object;
    }

    final boolean method3195(int i) {
        if (i != -4) method3202((byte) -58);
        anInt10438++;
        return false;
    }

    static final boolean method3201(boolean bool) throws IOException {
        anInt10430++;
        if (Class348_Sub40_Sub8.aClass238_9165 == null) return false;
        if (Class348_Sub3.aClass114_6584 == null) {
            if (Class108.aBoolean1661) {
                if (!Class348_Sub40_Sub8.aClass238_9165.method1705(1, 119)) return false;
                Class348_Sub40_Sub8.aClass238_9165.method1701(1, 0, (byte) 6, (Class299.aClass348_Sub49_Sub2_3813.aByteArray7154));
                Class348_Sub50.anInt7213 = 0;
                Class108.aBoolean1661 = false;
                Class13.anInt221++;
            }
            Class299.aClass348_Sub49_Sub2_3813.anInt7197 = 0;
            if (Class299.aClass348_Sub49_Sub2_3813.method3404(-1510)) {
                if (!Class348_Sub40_Sub8.aClass238_9165.method1705(1, 119)) return false;
                Class348_Sub40_Sub8.aClass238_9165.method1701(1, 1, (byte) 26, (Class299.aClass348_Sub49_Sub2_3813.aByteArray7154));
                Class13.anInt221++;
                Class348_Sub50.anInt7213 = 0;
            }
            Class108.aBoolean1661 = true;
            Class114[] class114s = Class14_Sub3.method248(-11271);
            int i = Class299.aClass348_Sub49_Sub2_3813.method3407(15295);
            if (i < 0 || i >= class114s.length) throw new IOException("invo:" + i + " ip:" + (Class299.aClass348_Sub49_Sub2_3813.anInt7197));
            Class348_Sub3.aClass114_6584 = class114s[i];
            if (Loader.debug) {
                System.out.println("Packet read:" + i + " length: " + Class348_Sub3.aClass114_6584.anInt1749);
            }
            Class348_Sub40_Sub25.anInt9341 = Class348_Sub3.aClass114_6584.anInt1749;
        }
        if (Class348_Sub40_Sub25.anInt9341 == -1) {
            if (!Class348_Sub40_Sub8.aClass238_9165.method1705(1, 116)) return false;
            Class348_Sub40_Sub8.aClass238_9165.method1701(1, 0, (byte) -118, (Class299.aClass348_Sub49_Sub2_3813.aByteArray7154));
            Class348_Sub40_Sub25.anInt9341 = 0xff & (Class299.aClass348_Sub49_Sub2_3813.aByteArray7154[0]);
            Class13.anInt221++;
            Class348_Sub50.anInt7213 = 0;
        }
        if (Class348_Sub40_Sub25.anInt9341 == -2) {
            if (!Class348_Sub40_Sub8.aClass238_9165.method1705(2, 120)) return false;
            Class348_Sub40_Sub8.aClass238_9165.method1701(2, 0, (byte) 127, (Class299.aClass348_Sub49_Sub2_3813.aByteArray7154));
            Class299.aClass348_Sub49_Sub2_3813.anInt7197 = 0;
            Class348_Sub40_Sub25.anInt9341 = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            Class13.anInt221 += 2;
            Class348_Sub50.anInt7213 = 0;
        }
        if (Class348_Sub40_Sub25.anInt9341 > 0) {
            if (!Class348_Sub40_Sub8.aClass238_9165.method1705(Class348_Sub40_Sub25.anInt9341, 104)) return false;
            Class299.aClass348_Sub49_Sub2_3813.anInt7197 = 0;
            Class348_Sub40_Sub8.aClass238_9165.method1701(Class348_Sub40_Sub25.anInt9341, 0, (byte) -123, (Class299.aClass348_Sub49_Sub2_3813.aByteArray7154));
            Class13.anInt221 += Class348_Sub40_Sub25.anInt9341;
            Class348_Sub50.anInt7213 = 0;
        }
        Class348_Sub40_Sub36.aClass114_9456 = Class239.aClass114_3145;
        Class239.aClass114_3145 = Class238.aClass114_3133;
        Class238.aClass114_3133 = Class348_Sub3.aClass114_6584;
        if (IOException_Sub1.aClass114_90 == Class348_Sub3.aClass114_6584) {
            Class43.method382(Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 118), true);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class348_Sub42_Sub3.aClass114_9503) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            boolean bool_3_ = (i & 0x1) == 1;
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 108);
            String string_4_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -92);
            if (string_4_.equals("")) string_4_ = string;
            String string_5_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -64);
            String string_6_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -97);
            if (string_6_.equals("")) string_6_ = string_5_;
            if (bool_3_) {
                for (int i_7_ = 0; (i_7_ < Class348_Sub42_Sub12.anInt9604); i_7_++) {
                    if (Class122.aStringArray1808[i_7_].equals(string_6_)) {
                        Class51.aStringArray932[i_7_] = string;
                        Class122.aStringArray1808[i_7_] = string_4_;
                        Class348_Sub40_Sub21.aStringArray9275[i_7_] = string_5_;
                        aa_Sub2.aStringArray5197[i_7_] = string_6_;
                        break;
                    }
                }
            } else {
                Class51.aStringArray932[Class348_Sub42_Sub12.anInt9604] = string;
                Class122.aStringArray1808[Class348_Sub42_Sub12.anInt9604] = string_4_;
                Class348_Sub40_Sub21.aStringArray9275[(Class348_Sub42_Sub12.anInt9604)] = string_5_;
                aa_Sub2.aStringArray5197[Class348_Sub42_Sub12.anInt9604] = string_6_;
                Class367_Sub3.aBooleanArray7304[Class348_Sub42_Sub12.anInt9604] = Class139.method1166(i, 2) == 2;
                Class348_Sub42_Sub12.anInt9604++;
            }
            Class126.anInt4985 = Class311.anInt3918;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class318_Sub6.aClass114_6424) {
            InputStream_Sub2.method128(Class348_Sub26.aClass74_6891, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class356.aClass114_4388 == Class348_Sub3.aClass114_6584) {
            byte i = Class299.aClass348_Sub49_Sub2_3813.readByte(-100);
            int i_8_ = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-111);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -126);
            Class50_Sub3.method467(i_8_, -18075, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class135_Sub1.aClass114_4707 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntLittle((byte) -123);
            int i_9_ = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class348_Sub41 class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3480(i_9_, -6008));
            Class348_Sub41 class348_sub41_10_ = ((Class348_Sub41) Class125.aClass356_4915.method3480(i, -6008));
            if (class348_sub41_10_ != null) Class127_Sub1.method1118((class348_sub41 == null || (class348_sub41_10_.anInt7050 != class348_sub41.anInt7050)), false, class348_sub41_10_, 2533);
            if (class348_sub41 != null) {
                class348_sub41.method2715((byte) 32);
                Class125.aClass356_4915.method3483((byte) 102, i, class348_sub41);
            }
            Class46 class46 = Class324.method2570(1512932720, i_9_);
            if (class46 != null) Class251.method1916(-9343, class46);
            class46 = Class324.method2570(1512932720, i);
            if (class46 != null) {
                Class251.method1916(-9343, class46);
                Class251.method1913(true, -123, class46);
            }
            if (r.anInt9721 != -1) Class239_Sub12.method1775((byte) -8, r.anInt9721, 1);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (bool != true) aClass230_10434 = null;
        if (Class348_Sub3.aClass114_6584 == Class116.aClass114_1762) {
            Class239_Sub4.aString5882 = (Class348_Sub40_Sub25.anInt9341 > 2 ? Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -119) : Class274.aClass274_3509.method2063(Class348_Sub33.anInt6967, 544));
            Class333.anInt4144 = (Class348_Sub40_Sub25.anInt9341 <= 0 ? -1 : Class299.aClass348_Sub49_Sub2_3813.readShort(842397944));
            if (Class333.anInt4144 == 65535) Class333.anInt4144 = -1;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class239.aClass114_3135 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) 62);
            int i_11_ = Class299.aClass348_Sub49_Sub2_3813.readIntLittle((byte) -126);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class348_Sub15.method2813(true, i, i_11_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class20.aClass114_316) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            int i_12_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            int i_13_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(10);
            int i_14_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -127);
            Class238.method1703(7, i, i_13_ << 16 | i_14_, 4, i_12_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub40_Sub15.aClass114_9216 == Class348_Sub3.aClass114_6584) {
            Class128.anInt1872 = Class299.aClass348_Sub49_Sub2_3813.method3372(13638);
            Class348_Sub3.aClass114_6584 = null;
            Class348_Sub40_Sub23.anInt9313 = Class311.anInt3918;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class330.aClass114_4126) {
            InputStream_Sub2.method128(Class348_Sub16_Sub1.aClass74_8853, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class173.aClass114_2285) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntInverse((byte) 82);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class238.method1703(3, i, -1, 4, -1);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class22.aClass114_330) {
            boolean bool_15_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1;
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -34);
            String string_16_ = string;
            if (bool_15_) string_16_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -64);
            long l = Class299.aClass348_Sub49_Sub2_3813.method3365(-456577760);
            long l_17_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            long l_18_ = Class299.aClass348_Sub49_Sub2_3813.method3351(-1);
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            long l_19_ = l_18_ + (l_17_ << 32);
            boolean bool_20_ = false;
            while_217_:
            do {
                for (int i_21_ = 0; i_21_ < 100; i_21_++) {
                    if (l_19_ == Class357.aLongArray4410[i_21_]) {
                        bool_20_ = true;
                        break while_217_;
                    }
                }
                if (i <= 1) {
                    if ((Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915) || Class50_Sub2.aBoolean5233) bool_20_ = true;
                    else if (Class351.method3455(string_16_, 28280)) bool_20_ = true;
                }
            } while (false);
            if (!bool_20_ && Class250.anInt3227 == 0) {
                Class357.aLongArray4410[Class79.anInt1359] = l_19_;
                Class79.anInt1359 = (1 + Class79.anInt1359) % 100;
                String string_22_ = (Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136((byte) 64, Class299.aClass348_Sub49_Sub2_3813)), 23034));
                if (i == 2 || i == 3) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_16_, string_22_, (byte) -126, -1, "<img=1>" + string, Class239_Sub16.method1788((byte) -76, l), 9, 0, string);
                else if (i != 1) Class318_Sub1_Sub3_Sub5.method2477(string_16_, string_22_, (byte) -125, -1, string, Class239_Sub16.method1788((byte) -83, l), 9, 0, string);
                else Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_16_, string_22_, (byte) -126, -1, "<img=0>" + string, Class239_Sub16.method1788((byte) -75, l), 9, 0, string);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class295.aClass114_3751) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(!bool);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -126);
            Class143.method1189(-1, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == InputStream_Sub2.aClass114_82) {
            InputStream_Sub2.method128(Class39.aClass74_515, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class73.aClass114_4779) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) -78);
            int i_23_ = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
            int i_24_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(127);
            int i_25_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -128);
            int i_26_ = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -127);
            Class181.aBooleanArray2374[i_23_] = true;
            Class275.anIntArray3552[i_23_] = i;
            Class255.anIntArray3273[i_23_] = i_25_;
            Class338.anIntArray4196[i_23_] = i_26_;
            Class318_Sub1_Sub1_Sub2.anIntArray9981[i_23_] = i_24_;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class239_Sub24.aClass114_6089) {
            Class73.anInt4786 = (Class299.aClass348_Sub49_Sub2_3813.method3361(-622951480) << 3);
            Class348_Sub40_Sub12.anInt9200 = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) -84);
            Class278.anInt3581 = (Class299.aClass348_Sub49_Sub2_3813.method3341(-8679) << 3);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class19.aClass114_304) {
            Class90.method853((byte) 99);
            Class348_Sub3.aClass114_6584 = null;
            return false;
        }
        if (Class345.aClass114_4269 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) 71);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -128);
            Class37.anInt495 = i;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class369_Sub2.aClass114_8590 == Class348_Sub3.aClass114_6584) {
            InputStream_Sub2.method128(Class374.aClass74_4537, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class252.aClass114_3240) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-117);
            int i_27_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(125);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -128);
            Class318_Sub1_Sub1.method2396(i, i_27_, 0, 3);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class322.aClass114_4027 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            if (i == 65535) i = -1;
            int i_28_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            int i_29_ = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -128);
            Class70.method727((byte) -63, i_29_, i, i_28_);
            Class213 class213 = Exception_Sub1.aClass255_112.method1940(-126, i);
            Class122.method1085(class213.anInt2825, class213.anInt2787, (byte) -59, class213.anInt2781, i_28_);
            Class34.method350(class213.anInt2779, class213.anInt2826, 125, i_28_, class213.anInt2810);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class133.aClass114_1917 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_30_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            boolean bool_31_ = (0x1 & i_30_) == 1;
            Class187.method1405(i, bool_31_, true);
            int i_32_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
                int i_34_ = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) -127);
                if (i_34_ == 255) i_34_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverse((byte) 82);
                int i_35_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(-78);
                Canvas_Sub1.method121(i, -364570972, bool_31_, i_33_, i_34_, i_35_ - 1);
            }
            Class199.anIntArray2633[Class139.method1166(31, Class106.anInt1631++)] = i;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class296.aClass114_3773) {
            Class348_Sub40_Sub34.method3141(false, (byte) 11);
            Class348_Sub3.aClass114_6584 = null;
            return false;
        }
        if (Class348_Sub3.aClass114_6584 == Class298.aClass114_3809) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            int i_36_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(124);
            Class318_Sub1_Sub3_Sub3.aClass170_10209.method1313((byte) 42, i, i_36_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class239_Sub20.aClass114_6056) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 75);
            int i_37_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(124);
            int i_38_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(125);
            int i_39_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_40_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverse((byte) 82);
            boolean bool_41_ = (0x80 & i) != 0;
            int i_42_ = 0x7 & i;
            int i_43_ = (i & 0x7e) >> 3;
            if (i_43_ == 15) i_43_ = -1;
            if (i_40_ >> 30 == 0) {
                if (i_40_ >> 29 != 0) {
                    int i_44_ = i_40_ & 0xffff;
                    Class348_Sub22 class348_sub22 = ((Class348_Sub22) Class282.aClass356_3654.method3480(i_44_, -6008));
                    if (class348_sub22 != null) {
                        Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = (class348_sub22.aClass318_Sub1_Sub3_Sub3_Sub1_6859);
                        if (i_38_ == 65535) i_38_ = -1;
                        boolean bool_45_ = true;
                        int i_46_ = (!bool_41_ ? class318_sub1_sub3_sub3_sub1.anInt10269 : class318_sub1_sub3_sub3_sub1.anInt10291);
                        if (i_38_ != -1 && i_46_ != -1) {
                            if (i_46_ == i_38_) {
                                Class368 class368 = Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 55, i_38_);
                                if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                    Class17 class17 = (Class10.aClass87_191.method835(class368.anInt4503, 7));
                                    int i_47_ = class17.anInt248;
                                    if (i_47_ != 0 && i_47_ != 2) {
                                        if (i_47_ == 1) bool_45_ = true;
                                    } else bool_45_ = false;
                                }
                            } else {
                                Class368 class368 = Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 105, i_38_);
                                Class368 class368_48_ = Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 56, i_46_);
                                if (class368.anInt4503 != -1 && (class368_48_.anInt4503 != -1)) {
                                    Class17 class17 = (Class10.aClass87_191.method835(class368.anInt4503, 7));
                                    Class17 class17_49_ = (Class10.aClass87_191.method835((class368_48_.anInt4503), 7));
                                    if (class17.anInt239 < class17_49_.anInt239) bool_45_ = false;
                                }
                            }
                        }
                        if (bool_45_) {
                            if (bool_41_) {
                                class318_sub1_sub3_sub3_sub1.anInt10211 = i_39_ + Class367_Sub11.anInt7396;
                                class318_sub1_sub3_sub3_sub1.anInt10260 = i_37_;
                                class318_sub1_sub3_sub3_sub1.anInt10291 = i_38_;
                                class318_sub1_sub3_sub3_sub1.anInt10289 = i_43_;
                                class318_sub1_sub3_sub3_sub1.anInt10202 = i_42_;
                                class318_sub1_sub3_sub3_sub1.anInt10273 = 0;
                                class318_sub1_sub3_sub3_sub1.anInt10276 = 1;
                                class318_sub1_sub3_sub3_sub1.anInt10224 = 0;
                                if (class318_sub1_sub3_sub3_sub1.anInt10211 > Class367_Sub11.anInt7396) class318_sub1_sub3_sub3_sub1.anInt10224 = -1;
                                if (class318_sub1_sub3_sub3_sub1.anInt10291 != -1 && (Class367_Sub11.anInt7396 == (class318_sub1_sub3_sub3_sub1.anInt10211))) {
                                    int i_51_ = (Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 103, (class318_sub1_sub3_sub3_sub1.anInt10291)).anInt4503);
                                    if (i_51_ != -1) {
                                        Class17 class17 = Class10.aClass87_191.method835(i_51_, 7);
                                        if (class17 != null && (class17.anIntArray237) != null && !(class318_sub1_sub3_sub3_sub1.aBoolean10309)) Class287.method2178(class318_sub1_sub3_sub3_sub1, 0, class17, -17);
                                    }
                                }
                            } else {
                                class318_sub1_sub3_sub3_sub1.anInt10243 = 0;
                                class318_sub1_sub3_sub3_sub1.anInt10220 = i_37_;
                                class318_sub1_sub3_sub3_sub1.anInt10269 = i_38_;
                                class318_sub1_sub3_sub3_sub1.anInt10240 = 0;
                                class318_sub1_sub3_sub3_sub1.anInt10278 = i_43_;
                                class318_sub1_sub3_sub3_sub1.anInt10225 = Class367_Sub11.anInt7396 + i_39_;
                                class318_sub1_sub3_sub3_sub1.anInt10237 = i_42_;
                                class318_sub1_sub3_sub3_sub1.anInt10283 = 1;
                                if (class318_sub1_sub3_sub3_sub1.anInt10225 > Class367_Sub11.anInt7396) class318_sub1_sub3_sub3_sub1.anInt10240 = -1;
                                if (class318_sub1_sub3_sub3_sub1.anInt10269 != -1 && (Class367_Sub11.anInt7396 == (class318_sub1_sub3_sub3_sub1.anInt10225))) {
                                    int i_50_ = (Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 87, (class318_sub1_sub3_sub3_sub1.anInt10269)).anInt4503);
                                    if (i_50_ != -1) {
                                        Class17 class17 = Class10.aClass87_191.method835(i_50_, 7);
                                        if (class17 != null && (class17.anIntArray237) != null && !(class318_sub1_sub3_sub3_sub1.aBoolean10309)) Class287.method2178(class318_sub1_sub3_sub3_sub1, 0, class17, -44);
                                    }
                                }
                            }
                        }
                    }
                } else if (i_40_ >> 28 != 0) {
                    int i_52_ = i_40_ & 0xffff;
                    Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2;
                    if (Class348_Sub42_Sub11.anInt9591 != i_52_) class318_sub1_sub3_sub3_sub2 = (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i_52_]);
                    else class318_sub1_sub3_sub3_sub2 = Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907;
                    if (class318_sub1_sub3_sub3_sub2 != null) {
                        if (i_38_ == 65535) i_38_ = -1;
                        boolean bool_53_ = true;
                        int i_54_ = (!bool_41_ ? class318_sub1_sub3_sub3_sub2.anInt10269 : class318_sub1_sub3_sub3_sub2.anInt10291);
                        if (i_38_ != -1 && i_54_ != -1) {
                            if (i_38_ == i_54_) {
                                Class368 class368 = Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 111, i_38_);
                                if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                    Class17 class17 = (Class10.aClass87_191.method835(class368.anInt4503, 7));
                                    int i_57_ = class17.anInt248;
                                    if (i_57_ != 0 && i_57_ != 2) {
                                        if (i_57_ == 1) bool_53_ = true;
                                    } else bool_53_ = false;
                                }
                            } else {
                                Class368 class368 = Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 105, i_38_);
                                Class368 class368_55_ = Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 118, i_54_);
                                if (class368.anInt4503 != -1 && class368_55_.anInt4503 != -1) {
                                    Class17 class17 = (Class10.aClass87_191.method835(class368.anInt4503, 7));
                                    Class17 class17_56_ = (Class10.aClass87_191.method835((class368_55_.anInt4503), 7));
                                    if (class17.anInt239 < class17_56_.anInt239) bool_53_ = false;
                                }
                            }
                        }
                        if (bool_53_) {
                            if (bool_41_) {
                                class318_sub1_sub3_sub3_sub2.anInt10224 = 0;
                                class318_sub1_sub3_sub3_sub2.anInt10260 = i_37_;
                                class318_sub1_sub3_sub3_sub2.anInt10289 = i_43_;
                                class318_sub1_sub3_sub3_sub2.anInt10273 = 0;
                                class318_sub1_sub3_sub3_sub2.anInt10276 = 1;
                                class318_sub1_sub3_sub3_sub2.anInt10291 = i_38_;
                                class318_sub1_sub3_sub3_sub2.anInt10211 = i_39_ + Class367_Sub11.anInt7396;
                                class318_sub1_sub3_sub3_sub2.anInt10202 = i_42_;
                                if (class318_sub1_sub3_sub3_sub2.anInt10211 > Class367_Sub11.anInt7396) class318_sub1_sub3_sub3_sub2.anInt10224 = -1;
                                if (class318_sub1_sub3_sub3_sub2.anInt10291 == 65535) class318_sub1_sub3_sub3_sub2.anInt10291 = -1;
                                if ((class318_sub1_sub3_sub3_sub2.anInt10291 != -1) && ((class318_sub1_sub3_sub3_sub2.anInt10211) == Class367_Sub11.anInt7396)) {
                                    int i_58_ = (Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 45, (class318_sub1_sub3_sub3_sub2.anInt10291)).anInt4503);
                                    if (i_58_ != -1) {
                                        Class17 class17 = Class10.aClass87_191.method835(i_58_, 7);
                                        if (class17 != null && (class17.anIntArray237) != null && !(class318_sub1_sub3_sub3_sub2.aBoolean10309)) Class287.method2178(class318_sub1_sub3_sub3_sub2, 0, class17, -120);
                                    }
                                }
                            } else {
                                class318_sub1_sub3_sub3_sub2.anInt10269 = i_38_;
                                class318_sub1_sub3_sub3_sub2.anInt10243 = 0;
                                class318_sub1_sub3_sub3_sub2.anInt10220 = i_37_;
                                class318_sub1_sub3_sub3_sub2.anInt10240 = 0;
                                class318_sub1_sub3_sub3_sub2.anInt10278 = i_43_;
                                class318_sub1_sub3_sub3_sub2.anInt10237 = i_42_;
                                class318_sub1_sub3_sub3_sub2.anInt10283 = 1;
                                class318_sub1_sub3_sub3_sub2.anInt10225 = i_39_ + Class367_Sub11.anInt7396;
                                if (class318_sub1_sub3_sub3_sub2.anInt10269 == 65535) class318_sub1_sub3_sub3_sub2.anInt10269 = -1;
                                if (Class367_Sub11.anInt7396 < (class318_sub1_sub3_sub3_sub2.anInt10225)) class318_sub1_sub3_sub3_sub2.anInt10240 = -1;
                                if ((class318_sub1_sub3_sub3_sub2.anInt10269 != -1) && (Class367_Sub11.anInt7396 == (class318_sub1_sub3_sub3_sub2.anInt10225))) {
                                    int i_59_ = (Class348_Sub40_Sub18.aClass319_9245.method2543((byte) 81, (class318_sub1_sub3_sub3_sub2.anInt10269)).anInt4503);
                                    if (i_59_ != -1) {
                                        Class17 class17 = Class10.aClass87_191.method835(i_59_, 7);
                                        if (class17 != null && (class17.anIntArray237) != null && !(class318_sub1_sub3_sub3_sub2.aBoolean10309)) Class287.method2178(class318_sub1_sub3_sub3_sub2, 0, class17, -101);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int i_60_ = (i_40_ & 0x33705717) >> 28;
                int i_61_ = -za_Sub2.anInt9780 + ((0xffff4fe & i_40_) >> 14);
                int i_62_ = -Class90.anInt1517 + (0x3fff & i_40_);
                if (i_61_ >= 0 && i_62_ >= 0 && Class367_Sub4.anInt7319 > i_61_ && Class348_Sub40_Sub3.anInt9109 > i_62_) {
                    int i_63_ = 256 + 512 * i_61_;
                    int i_64_ = 512 * i_62_ + 256;
                    int i_65_ = i_60_;
                    if (i_65_ < 3 && Class79.method802(i_62_, i_61_, true)) i_65_++;
                    Class318_Sub1_Sub3_Sub4 class318_sub1_sub3_sub4 = (new Class318_Sub1_Sub3_Sub4(i_38_, i_39_, Class367_Sub11.anInt7396, i_60_, i_65_, i_63_, -i_37_ + Class275.method2064(i_63_, i_60_, 11219, i_64_), i_64_, i_61_, i_61_, i_62_, i_62_, i_42_));
                    r_Sub2.aClass262_10492.method1999(new Class348_Sub42_Sub6(class318_sub1_sub3_sub4), -20180);
                }
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class63.aClass114_1120) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-116);
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -85);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            Class377.method3965(string, i, 2);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class74.aClass114_1234) {
            Class24.anInt359 = Class299.aClass348_Sub49_Sub2_3813.method3369((byte) 125);
            Class348_Sub40_Sub3.aBoolean9103 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class352.aClass114_4331 == Class348_Sub3.aClass114_6584) {
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 122);
            boolean bool_66_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1;
            String string_67_;
            if (!bool_66_) string_67_ = string;
            else string_67_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 125);
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            byte i_68_ = Class299.aClass348_Sub49_Sub2_3813.readByte(-128);
            boolean bool_69_ = false;
            if (i_68_ == -128) bool_69_ = true;
            if (bool_69_) {
                if (Class37.anInt496 == 0) {
                    Class348_Sub3.aClass114_6584 = null;
                    return true;
                }
                boolean bool_70_ = false;
                int i_71_;
                for (i_71_ = 0; Class37.anInt496 > i_71_; i_71_++) {
                    if (Class169.aClass19Array2261[i_71_].aString306.equals(string_67_) && i == (Class169.aClass19Array2261[i_71_].anInt308)) break;
                }
                if (Class37.anInt496 > i_71_) {
                    for (/**/; -1 + Class37.anInt496 > i_71_; i_71_++)
                        Class169.aClass19Array2261[i_71_] = Class169.aClass19Array2261[i_71_ - -1];
                    Class37.anInt496--;
                    Class169.aClass19Array2261[Class37.anInt496] = null;
                }
            } else {
                String string_72_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -74);
                Class19 class19 = new Class19();
                class19.aString306 = string_67_;
                class19.aString314 = string;
                class19.aString312 = Class285_Sub1.method2127(2, class19.aString306);
                class19.aString313 = string_72_;
                class19.anInt308 = i;
                class19.aByte310 = i_68_;
                int i_73_;
                for (i_73_ = -1 + Class37.anInt496; i_73_ >= 0; i_73_--) {
                    int i_74_ = Class169.aClass19Array2261[i_73_].aString312.compareTo(class19.aString312);
                    if (i_74_ == 0) {
                        Class169.aClass19Array2261[i_73_].anInt308 = i;
                        Class169.aClass19Array2261[i_73_].aByte310 = i_68_;
                        Class169.aClass19Array2261[i_73_].aString313 = string_72_;
                        if (string_67_.equals(Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aString10544)) Class119_Sub1.aByte4702 = i_68_;
                        Class230.anInt2986 = Class311.anInt3918;
                        Class348_Sub3.aClass114_6584 = null;
                        return true;
                    }
                    if (i_74_ < 0) break;
                }
                if (Class169.aClass19Array2261.length <= Class37.anInt496) {
                    Class348_Sub3.aClass114_6584 = null;
                    return true;
                }
                for (int i_75_ = Class37.anInt496 - 1; i_75_ > i_73_; i_75_--)
                    Class169.aClass19Array2261[1 + i_75_] = Class169.aClass19Array2261[i_75_];
                if (Class37.anInt496 == 0) Class169.aClass19Array2261 = new Class19[100];
                Class169.aClass19Array2261[i_73_ - -1] = class19;
                Class37.anInt496++;
                if (string_67_.equals(Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aString10544)) Class119_Sub1.aByte4702 = i_68_;
            }
            Class230.anInt2986 = Class311.anInt3918;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class239_Sub11.aClass114_5949 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_76_ = i >> 5;
            int i_77_ = 0x1f & i;
            if (i_77_ == 0) {
                Class348_Sub27.aClass302Array6897[i_76_] = null;
                Class348_Sub3.aClass114_6584 = null;
                return true;
            }
            Class302 class302 = new Class302();
            class302.anInt3840 = i_77_;
            class302.anInt3831 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            if (class302.anInt3831 >= 0 && (class302.anInt3831 < Class239_Sub9.aClass105Array5933.length)) {
                if (class302.anInt3840 == 1 || class302.anInt3840 == 10) {
                    class302.anInt3833 = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
                    Class299.aClass348_Sub49_Sub2_3813.anInt7197 += 6;
                } else if (class302.anInt3840 >= 2 && class302.anInt3840 <= 6) {
                    if (class302.anInt3840 == 2) {
                        class302.anInt3832 = 256;
                        class302.anInt3835 = 256;
                    }
                    if (class302.anInt3840 == 3) {
                        class302.anInt3835 = 0;
                        class302.anInt3832 = 256;
                    }
                    if (class302.anInt3840 == 4) {
                        class302.anInt3835 = 512;
                        class302.anInt3832 = 256;
                    }
                    if (class302.anInt3840 == 5) {
                        class302.anInt3835 = 256;
                        class302.anInt3832 = 0;
                    }
                    if (class302.anInt3840 == 6) {
                        class302.anInt3835 = 256;
                        class302.anInt3832 = 512;
                    }
                    class302.anInt3840 = 2;
                    class302.anInt3838 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    class302.anInt3835 += (Class299.aClass348_Sub49_Sub2_3813.readShort(842397944) + -za_Sub2.anInt9780 << 9);
                    class302.anInt3832 += (Class299.aClass348_Sub49_Sub2_3813.readShort(842397944) - Class90.anInt1517 << 9);
                    class302.anInt3839 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) << 2;
                    class302.anInt3837 = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
                }
                class302.anInt3834 = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
                if (class302.anInt3834 == 65535) class302.anInt3834 = -1;
                Class348_Sub27.aClass302Array6897[i_76_] = class302;
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class172.aClass114_2279 == Class348_Sub3.aClass114_6584) {
            Class348_Sub40_Sub34.method3141(Class223.aBoolean2895, (byte) 11);
            Class348_Sub3.aClass114_6584 = null;
            return false;
        }

        // 105 - gpi
        if (Class367_Sub4.aClass114_7323 == Class348_Sub3.aClass114_6584) {
            Class348_Sub16_Sub1.method2822(-101, Class299.aClass348_Sub49_Sub2_3813, Class348_Sub40_Sub25.anInt9341);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class239_Sub26.aClass114_6121) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(124);
            int i_78_ = Class299.aClass348_Sub49_Sub2_3813.readIntLittle((byte) -118);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -128);
            Class91.method855(6, i, i_78_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class264.aClass114_3371 == Class348_Sub3.aClass114_6584) {
            InputStream_Sub2.method128(Class59_Sub1_Sub2.aClass74_8662, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class367_Sub4.aClass114_7324) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
            int i_79_ = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-120);
            int i_80_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(125);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            Class211.method1540(-101, i, i_79_ + (i_80_ << 16));
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class361.aClass114_4433) {
            Class318_Sub1_Sub3_Sub3.aClass170_10209.method1314((byte) 80);
            Class287.anInt3695 += 32;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class303.aClass114_3842) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -128);
            Class238.method1703(5, i, Class348_Sub42_Sub11.anInt9591, 4, 0);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class346_Sub1.aClass114_6528 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(-124);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class64_Sub3.method690((byte) -107, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class5_Sub2.aClass114_8365 == Class348_Sub3.aClass114_6584) {
            boolean bool_81_ = (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1);
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -29);
            String string_82_ = string;
            if (bool_81_) string_82_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -98);
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            boolean bool_83_ = false;
            if (i <= 1) {
                if (Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915 || Class50_Sub2.aBoolean5233) bool_83_ = true;
                else if (i <= 1 && Class351.method3455(string_82_, 28280)) bool_83_ = true;
            }
            if (!bool_83_ && Class250.anInt3227 == 0) {
                String string_84_ = (Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136((byte) 64, Class299.aClass348_Sub49_Sub2_3813)), 23034));
                if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_82_, string_84_, (byte) -119, -1, "<img=1>" + string, null, 24, 0, string);
                else if (i == 1) Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_82_, string_84_, (byte) -119, -1, "<img=0>" + string, null, 24, 0, string);
                else Class318_Sub1_Sub3_Sub5.method2477(string_82_, string_84_, (byte) -115, -1, string, null, 24, 0, string);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class15.aClass114_229 == Class348_Sub3.aClass114_6584) {
            InputStream_Sub2.method128(Class286_Sub1.aClass74_6201, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class101_Sub2.aClass114_5742) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 31);
            int i_85_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -104);
            int i_86_ = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
            int i_87_ = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
            int i_88_ = (Class299.aClass348_Sub49_Sub2_3813.readShortAdd(126) << 2);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -127);
            Class239_Sub28.method1844(i_85_, i_86_, true, i_88_, !bool, i_87_, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class111.aClass114_1722) {
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -100);
            Object[] objects = new Object[1 + string.length()];
            for (int i = -1 + string.length(); i >= 0; i--) {
                if (string.charAt(i) != 's') objects[i + 1] = new Integer(Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126));
                else objects[1 + i] = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 122);
            }
            objects[0] = new Integer(Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126));
            Class318_Sub1_Sub1_Sub1.method2397((byte) -127);
            Class348_Sub36 class348_sub36 = new Class348_Sub36();
            class348_sub36.anObjectArray6987 = objects;
            Class66.method705(class348_sub36);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class239_Sub22.aClass114_6075 == Class348_Sub3.aClass114_6584) {
            Class318_Sub1_Sub1_Sub1.method2397((byte) -127);
            Class239_Sub29.method1851((byte) 125);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class348_Sub41.aClass114_7052) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntLittle((byte) -118);
            int i_89_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(127);
            if (i_89_ == 65535) i_89_ = -1;
            Class318_Sub1_Sub1_Sub1.method2397((byte) -126);
            Class238.method1703(2, i, i_89_, 4, -1);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class264.aClass114_3368) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class348_Sub41 class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3480(i, -6008));
            if (class348_sub41 != null) Class127_Sub1.method1118(true, false, class348_sub41, 2533);
            if (Class49.aClass46_4730 != null) {
                Class251.method1916(-9343, Class49.aClass46_4730);
                Class49.aClass46_4730 = null;
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (InputStream_Sub1.aClass114_79 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(-86);
            int i_90_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class348_Sub23.method2966(i_90_, i, false);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class312.aClass114_3925 == Class348_Sub3.aClass114_6584) {
            InputStream_Sub2.method128(aClass74_10437, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class228.aClass114_2972) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
            Class348_Sub42_Sub6.aClass144_9536 = Class348_Sub23_Sub1.aClass297_8992.method2232(80, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class131.aClass114_1901) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2;
            if (i != Class348_Sub42_Sub11.anInt9591) class318_sub1_sub3_sub3_sub2 = Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i];
            else class318_sub1_sub3_sub3_sub2 = Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907;
            if (class318_sub1_sub3_sub3_sub2 == null) {
                Class348_Sub3.aClass114_6584 = null;
                return true;
            }
            int i_91_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_92_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            boolean bool_93_ = (0x8000 & i_91_) != 0;
            if ((class318_sub1_sub3_sub3_sub2.aString10544) != null && class318_sub1_sub3_sub3_sub2.aClass154_10536 != null) {
                boolean bool_94_ = false;
                if (i_92_ <= 1) {
                    if (!bool_93_ && ((Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915) || Class50_Sub2.aBoolean5233)) bool_94_ = true;
                    else if (Class351.method3455(class318_sub1_sub3_sub3_sub2.aString10544, 28280)) bool_94_ = true;
                }
                if (!bool_94_ && Class250.anInt3227 == 0) {
                    int i_95_ = -1;
                    String string;
                    if (bool_93_) {
                        i_91_ &= 0x7fff;
                        Class43 class43 = Class52.method490((byte) -104, (Class299.aClass348_Sub49_Sub2_3813));
                        i_95_ = class43.anInt615;
                        string = (class43.aClass348_Sub42_Sub10_614.method3216(Class299.aClass348_Sub49_Sub2_3813, (byte) 119));
                    } else string = (Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136((byte) 64, Class299.aClass348_Sub49_Sub2_3813)), 23034));
                    class318_sub1_sub3_sub3_sub2.aString10292 = string.trim();
                    class318_sub1_sub3_sub3_sub2.anInt10201 = i_91_ >> 8;
                    class318_sub1_sub3_sub3_sub2.anInt10234 = i_91_ & 0xff;
                    class318_sub1_sub3_sub3_sub2.anInt10264 = 150;
                    int i_96_;
                    if (i_92_ != 1 && i_92_ != 2) i_96_ = !bool_93_ ? 2 : 17;
                    else i_96_ = bool_93_ ? 17 : 1;
                    if (i_92_ != 2) {
                        if (i_92_ != 1) Class318_Sub1_Sub3_Sub5.method2477(class318_sub1_sub3_sub3_sub2.method2450(false, -121), string, (byte) -126, i_95_, class318_sub1_sub3_sub3_sub2.method2456(true, 255), null, i_96_, 0, class318_sub1_sub3_sub3_sub2.aString10537);
                        else Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + class318_sub1_sub3_sub3_sub2.method2450(false, -93), string, (byte) -111, i_95_, "<img=0>" + class318_sub1_sub3_sub3_sub2.method2456(true, 255), null, i_96_, 0, class318_sub1_sub3_sub3_sub2.aString10537);
                    } else Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + class318_sub1_sub3_sub3_sub2.method2450(false, -95), string, (byte) -120, i_95_, "<img=1>" + class318_sub1_sub3_sub3_sub2.method2456(true, 255), null, i_96_, 0, class318_sub1_sub3_sub3_sub2.aString10537);
                }
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class63.aClass114_1123 == Class348_Sub3.aClass114_6584) {
            boolean bool_97_ = (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1);
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 126);
            String string_98_ = string;
            if (bool_97_) string_98_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 86);
            long l = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            long l_99_ = Class299.aClass348_Sub49_Sub2_3813.method3351(-1);
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            long l_100_ = (l << 32) - -l_99_;
            boolean bool_101_ = false;
            while_218_:
            do {
                for (int i_102_ = 0; i_102_ < 100; i_102_++) {
                    if (l_100_ == Class357.aLongArray4410[i_102_]) {
                        bool_101_ = true;
                        break while_218_;
                    }
                }
                if (i <= 1) {
                    if ((Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915) || Class50_Sub2.aBoolean5233) bool_101_ = true;
                    else if (Class351.method3455(string_98_, 28280)) bool_101_ = true;
                }
            } while (false);
            if (!bool_101_ && Class250.anInt3227 == 0) {
                Class357.aLongArray4410[Class79.anInt1359] = l_100_;
                Class79.anInt1359 = (1 + Class79.anInt1359) % 100;
                String string_103_ = (Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136((byte) 64, Class299.aClass348_Sub49_Sub2_3813)), 23034));
                if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_98_, string_103_, (byte) -127, -1, "<img=1>" + string, null, 7, 0, string);
                else if (i == 1) Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_98_, string_103_, (byte) -115, -1, "<img=0>" + string, null, 7, 0, string);
                else Class318_Sub1_Sub3_Sub5.method2477(string_98_, string_103_, (byte) -128, -1, string, null, 3, 0, string);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub42_Sub8.aClass114_9552 == Class348_Sub3.aClass114_6584) {
            if (r.anInt9721 != -1) Class239_Sub12.method1775((byte) -8, r.anInt9721, 0);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class168.aClass114_2248 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_104_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -87);
            int i_105_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_106_ = (Class299.aClass348_Sub49_Sub2_3813.readShortLittle(!bool) << 2);
            int i_107_ = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            Class348_Sub42_Sub12.method3231(i_104_, i, i_106_, i_107_, i_105_, -127);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }

        // ping
        if (Class348_Sub3.aClass114_6584 == Class348_Sub46.aClass114_7113) {
            Class348_Sub3.aClass114_6584 = null;
            return false;
        }
        if (Class267.aClass114_3427 == Class348_Sub3.aClass114_6584) {
            Class110.method1034(Class348_Sub40_Sub25.anInt9341, Class299.aClass348_Sub49_Sub2_3813, Class348_Sub23_Sub1.aClass297_8992, 110);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class189.aClass114_2527 == Class348_Sub3.aClass114_6584) {
            boolean bool_108_ = (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1);
            byte[] is = new byte[Class348_Sub40_Sub25.anInt9341 - 1];
            Class299.aClass348_Sub49_Sub2_3813.method3389(2147483647, 0, (Class348_Sub40_Sub25.anInt9341) + -1, is);
            Class184.method1385(bool_108_, is, (byte) -104);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class254.aClass114_3264) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            byte i_109_ = Class299.aClass348_Sub49_Sub2_3813.method3341(-8679);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -128);
            Class348_Sub42_Sub14.method3244(i_109_, i, 120);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class255.aClass114_3265 == Class348_Sub3.aClass114_6584) {
            Class278.anInt3581 = (Class299.aClass348_Sub49_Sub2_3813.method3361(-622951480) << 3);
            Class348_Sub40_Sub12.anInt9200 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 98);
            Class73.anInt4786 = (Class299.aClass348_Sub49_Sub2_3813.method3345(-27697) << 3);
            while ((Class299.aClass348_Sub49_Sub2_3813.anInt7197) < Class348_Sub40_Sub25.anInt9341) {
                Class74 class74 = (Class255.method1929((byte) -19)[Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255)]);
                InputStream_Sub2.method128(class74, (byte) 8);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class271.aClass114_3467 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.method3372(13638);
            int i_110_ = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
            int i_111_ = Class299.aClass348_Sub49_Sub2_3813.method3375((byte) 84);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class120.method1080(i_111_, -23697, i, i_110_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class178.aClass114_2338 == Class348_Sub3.aClass114_6584) {
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 100);
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(124);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -127);
            Class377.method3965(string, i, 2);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class318_Sub1_Sub5_Sub2.aClass114_10168) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-117);
            int i_112_ = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -127);
            Class348_Sub40_Sub15.method3084(i, (byte) -88, i_112_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class167.aClass114_2196 == Class348_Sub3.aClass114_6584) {
            boolean bool_113_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1;
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -81);
            String string_114_ = string;
            if (bool_113_) string_114_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -39);
            long l = Class299.aClass348_Sub49_Sub2_3813.method3365(-456577760);
            long l_115_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            long l_116_ = Class299.aClass348_Sub49_Sub2_3813.method3351(-1);
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_117_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            long l_118_ = (l_115_ << 32) - -l_116_;
            boolean bool_119_ = false;
            while_219_:
            do {
                for (int i_120_ = 0; i_120_ < 100; i_120_++) {
                    if (Class357.aLongArray4410[i_120_] == l_118_) {
                        bool_119_ = true;
                        break while_219_;
                    }
                }
                if (i <= 1 && Class351.method3455(string_114_, 28280)) bool_119_ = true;
            } while (false);
            if (!bool_119_ && Class250.anInt3227 == 0) {
                Class357.aLongArray4410[Class79.anInt1359] = l_118_;
                Class79.anInt1359 = (Class79.anInt1359 + 1) % 100;
                String string_121_ = (Class239_Sub6.aClass355_5900.method3471(i_117_, (byte) -106).method3216(Class299.aClass348_Sub49_Sub2_3813, (byte) 42));
                if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_114_, string_121_, (byte) -120, i_117_, "<img=1>" + string, Class239_Sub16.method1788((byte) 87, l), 20, 0, string);
                else if (i != 1) Class318_Sub1_Sub3_Sub5.method2477(string_114_, string_121_, (byte) -111, i_117_, string, Class239_Sub16.method1788((byte) 80, l), 20, 0, string);
                else Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_114_, string_121_, (byte) -116, i_117_, "<img=0>" + string, Class239_Sub16.method1788((byte) -98, l), 20, 0, string);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub47.aClass114_7124 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            if (i == -1) {
                Class9.anInt167 = -1;
                Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
            } else {
                int i_122_ = 0x3fff & i >> 14;
                i_122_ -= za_Sub2.anInt9780;
                int i_123_ = 0x3fff & i;
                i_123_ -= Class90.anInt1517;
                if (i_122_ >= 0) {
                    if (Class367_Sub4.anInt7319 <= i_122_) i_122_ = Class367_Sub4.anInt7319;
                } else i_122_ = 0;
                Class9.anInt167 = (i_122_ << 9) - -256;
                if (i_123_ >= 0) {
                    if (i_123_ >= Class348_Sub40_Sub3.anInt9109) i_123_ = Class348_Sub40_Sub3.anInt9109;
                } else i_123_ = 0;
                Class318_Sub1_Sub5_Sub2.anInt10163 = 256 + (i_123_ << 9);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class348_Sub40_Sub19.aClass114_9254) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) -88);
            int i_124_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(!bool);
            System.out.println("Read cvarbit " + i_124_ + " " + i);
            Class318_Sub1_Sub3_Sub3.aClass170_10209.method1316((byte) -58, i_124_, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class133.aClass114_1914 == Class348_Sub3.aClass114_6584) {
            InputStream_Sub2.method128(Class348_Sub40_Sub38.aClass74_9475, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class292.aClass114_4798) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-107);
            if (i == 65535) i = -1;
            int i_125_ = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) -121);
            int i_126_ = i_125_ >> 2;
            int i_127_ = i_125_ & 0x3;
            int i_128_ = Class36.anIntArray487[i_126_];
            int i_129_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            int i_130_ = (0x36079814 & i_129_) >> 28;
            int i_131_ = i_129_ >> 14 & 0x3fff;
            int i_132_ = 0x3fff & i_129_;
            i_131_ -= za_Sub2.anInt9780;
            i_132_ -= Class90.anInt1517;
            ha_Sub3.method3824(i_132_, i, i_126_, i_131_, i_127_, 102, i_130_, i_128_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class168.aClass114_2255) {
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -104);
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            String string_133_ = (Class239_Sub6.aClass355_5900.method3471(i, (byte) -98).method3216(Class299.aClass348_Sub49_Sub2_3813, (byte) 42));
            Class318_Sub1_Sub3_Sub5.method2477(string, string_133_, (byte) -122, i, string, null, 19, 0, string);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class348_Sub42_Sub8.aClass114_9550) {
            InputStream_Sub2.method128(Class327.aClass74_4098, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class202.aClass114_2665 == Class348_Sub3.aClass114_6584) {
            for (int i = 0; i < Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058.length; i++) {
                if (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i] != null) {
                    Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i].anIntArray10236 = null;
                    Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[i].anInt10286 = -1;
                }
            }
            for (int i = 0; Class348_Sub32.anInt6930 > i; i++) {
                Class348_Sub40_Sub23.aClass348_Sub22Array9319[i].aClass318_Sub1_Sub3_Sub3_Sub1_6859.anIntArray10236 = null;
                Class348_Sub40_Sub23.aClass348_Sub22Array9319[i].aClass318_Sub1_Sub3_Sub3_Sub1_6859.anInt10286 = -1;
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class365.aClass114_4477 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            int i_134_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_135_ = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-109);
            int i_136_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(16);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            Class122.method1085(i_136_, i_134_, (byte) -86, i_135_, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class95.aClass114_1540 == Class348_Sub3.aClass114_6584) {
            Class57.aClass227_1055 = Class38.method360((byte) -57, Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255));
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class239_Sub21.aClass114_6058 == Class348_Sub3.aClass114_6584) {
            InputStream_Sub2.method128(Class186.aClass74_2491, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class176.aClass114_2331 == Class348_Sub3.aClass114_6584) {
            Class348_Sub42_Sub12.anInt9604 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            for (int i = 0; Class348_Sub42_Sub12.anInt9604 > i; i++) {
                Class51.aStringArray932[i] = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -36);
                Class122.aStringArray1808[i] = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 112);
                if (Class122.aStringArray1808[i].equals("")) Class122.aStringArray1808[i] = Class51.aStringArray932[i];
                Class348_Sub40_Sub21.aStringArray9275[i] = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 84);
                aa_Sub2.aStringArray5197[i] = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -111);
                if (aa_Sub2.aStringArray5197[i].equals("")) aa_Sub2.aStringArray5197[i] = Class348_Sub40_Sub21.aStringArray9275[i];
                Class367_Sub3.aBooleanArray7304[i] = false;
            }
            Class126.anInt4985 = Class311.anInt3918;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class166.aClass114_2183) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-121);
            if (i == 65535) i = -1;
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 103);
            int i_137_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -91);
            int i_138_ = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) 13);
            if (i_137_ >= 1 && i_137_ <= 8) {
                if (string.equalsIgnoreCase("null")) string = null;
                Class318_Sub1_Sub2_Sub1.aStringArray10195[i_137_ + -1] = string;
                Canvas_Sub1.anIntArray60[i_137_ + -1] = i;
                Class71.aBooleanArray1214[i_137_ - 1] = i_138_ == 0;
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class128.aClass114_1871 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.method3382(-117);
            int i_139_ = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
            int i_140_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            String string = "";
            String string_141_ = string;
            if ((i_140_ & 0x1) != 0) {
                string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 92);
                if ((i_140_ & 0x2) != 0) string_141_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 126);
                else string_141_ = string;
            }
            String string_142_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -95);
            if (i == 99) Applet_Sub1.method94(string_142_, -93);
            else {
                if (!string_141_.equals("") && Class351.method3455(string_141_, 28280)) {
                    Class348_Sub3.aClass114_6584 = null;
                    return true;
                }
                Class286_Sub2.method2144(string_141_, i, (byte) -92, i_139_, string_142_, string, string);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class348_Sub45.aClass114_7105) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            if (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 0) Class239_Sub26.aClass54Array6114[i] = new Class54();
            else {
                Class299.aClass348_Sub49_Sub2_3813.anInt7197--;
                Class239_Sub26.aClass54Array6114[i] = new Class54(Class299.aClass348_Sub49_Sub2_3813);
            }
            Class348_Sub3.aClass114_6584 = null;
            Class189.anInt2523 = Class311.anInt3918;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class110.aClass114_1702) {
            int i = Class299.aClass348_Sub49_Sub2_3813.method3372(13638);
            int i_143_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverse((byte) 82);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -126);
            Class173.method1330(i, -19906, i_143_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class3.aClass114_123) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntInverse((byte) 82);
            int i_144_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_145_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            if (i_145_ == 65535) i_145_ = -1;
            int i_146_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(124);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -128);
            if (i_146_ == 65535) i_146_ = -1;
            for (int i_147_ = i_146_; i_145_ >= i_147_; i_147_++) {
                long l = ((long) i << 32) - -(long) i_147_;
                Class348_Sub44 class348_sub44 = ((Class348_Sub44) Class226.aClass356_2959.method3480(l, -6008));
                Class348_Sub44 class348_sub44_148_;
                if (class348_sub44 == null) {
                    if (i_147_ == -1) class348_sub44_148_ = (new Class348_Sub44(Class324.method2570(1512932720, i).aClass348_Sub44_748.anInt7098, i_144_));
                    else class348_sub44_148_ = new Class348_Sub44(0, i_144_);
                } else {
                    class348_sub44_148_ = new Class348_Sub44((class348_sub44.anInt7098), i_144_);
                    class348_sub44.method2715((byte) 91);
                }
                Class226.aClass356_2959.method3483((byte) 125, l, class348_sub44_148_);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class348_Sub45.aClass114_7106) {
            while ((Class299.aClass348_Sub49_Sub2_3813.anInt7197) < Class348_Sub40_Sub25.anInt9341) {
                boolean bool_149_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1;
                String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -95);
                String string_150_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 118);
                int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
                int i_151_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                String string_152_ = "";
                boolean bool_153_ = false;
                if (i > 0) {
                    string_152_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 119);
                    bool_153_ = (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1);
                }
                for (int i_154_ = 0; (i_154_ < Class348_Sub40_Sub30.anInt9383); i_154_++) {
                    if (!bool_149_) {
                        if (string.equals(Class83.aStringArray1441[i_154_])) {
                            if (i != ha.anIntArray4578[i_154_]) {
                                boolean bool_155_ = true;
                                for (Class318_Sub9_Sub1 class318_sub9_sub1 = ((Class318_Sub9_Sub1) Class348_Sub42_Sub14.aClass243_9642.method1872(8)); class318_sub9_sub1 != null; class318_sub9_sub1 = ((Class318_Sub9_Sub1) Class348_Sub42_Sub14.aClass243_9642.method1878((byte) 124))) {
                                    if (class318_sub9_sub1.aString8783.equals(string)) {
                                        if (i == 0 || (class318_sub9_sub1.aShort8786 != 0)) {
                                            if (i == 0 && (class318_sub9_sub1.aShort8786) != 0) {
                                                bool_155_ = false;
                                                class318_sub9_sub1.method2373(false);
                                            }
                                        } else {
                                            bool_155_ = false;
                                            class318_sub9_sub1.method2373(false);
                                        }
                                    }
                                }
                                if (bool_155_) Class348_Sub42_Sub14.aClass243_9642.method1869(-95, new Class318_Sub9_Sub1(string, i));
                                ha.anIntArray4578[i_154_] = i;
                            }
                            Class286_Sub2.aStringArray6205[i_154_] = string_150_;
                            Class285.aStringArray4744[i_154_] = string_152_;
                            Class172.anIntArray2280[i_154_] = i_151_;
                            string = null;
                            Class122.aBooleanArray1806[i_154_] = bool_153_;
                            break;
                        }
                    } else if (string_150_.equals(Class83.aStringArray1441[i_154_])) {
                        Class83.aStringArray1441[i_154_] = string;
                        Class286_Sub2.aStringArray6205[i_154_] = string_150_;
                        string = null;
                        break;
                    }
                }
                if (string != null && Class348_Sub40_Sub30.anInt9383 < 200) {
                    Class83.aStringArray1441[Class348_Sub40_Sub30.anInt9383] = string;
                    Class286_Sub2.aStringArray6205[(Class348_Sub40_Sub30.anInt9383)] = string_150_;
                    ha.anIntArray4578[Class348_Sub40_Sub30.anInt9383] = i;
                    Class285.aStringArray4744[Class348_Sub40_Sub30.anInt9383] = string_152_;
                    Class172.anIntArray2280[Class348_Sub40_Sub30.anInt9383] = i_151_;
                    Class122.aBooleanArray1806[Class348_Sub40_Sub30.anInt9383] = bool_153_;
                    Class348_Sub40_Sub30.anInt9383++;
                }
            }
            Class125.anInt4930 = 2;
            Class126.anInt4985 = Class311.anInt3918;
            boolean bool_156_ = false;
            int i = Class348_Sub40_Sub30.anInt9383;
            while (i > 0) {
                i--;
                bool_156_ = true;
                for (int i_157_ = 0; i > i_157_; i_157_++) {
                    if (((Class3.aClass161_125.anInt2143 != ha.anIntArray4578[i_157_]) && (ha.anIntArray4578[i_157_ - -1] == Class3.aClass161_125.anInt2143)) || (ha.anIntArray4578[i_157_] == 0 && (ha.anIntArray4578[1 + i_157_] != 0))) {
                        int i_158_ = ha.anIntArray4578[i_157_];
                        ha.anIntArray4578[i_157_] = ha.anIntArray4578[1 + i_157_];
                        ha.anIntArray4578[i_157_ - -1] = i_158_;
                        String string = Class285.aStringArray4744[i_157_];
                        Class285.aStringArray4744[i_157_] = Class285.aStringArray4744[1 + i_157_];
                        Class285.aStringArray4744[1 + i_157_] = string;
                        String string_159_ = Class83.aStringArray1441[i_157_];
                        Class83.aStringArray1441[i_157_] = Class83.aStringArray1441[i_157_ + 1];
                        Class83.aStringArray1441[i_157_ + 1] = string_159_;
                        String string_160_ = Class286_Sub2.aStringArray6205[i_157_];
                        Class286_Sub2.aStringArray6205[i_157_] = Class286_Sub2.aStringArray6205[i_157_ + 1];
                        Class286_Sub2.aStringArray6205[i_157_ - -1] = string_160_;
                        int i_161_ = Class172.anIntArray2280[i_157_];
                        Class172.anIntArray2280[i_157_] = Class172.anIntArray2280[1 + i_157_];
                        Class172.anIntArray2280[i_157_ + 1] = i_161_;
                        boolean bool_162_ = Class122.aBooleanArray1806[i_157_];
                        Class122.aBooleanArray1806[i_157_] = Class122.aBooleanArray1806[1 + i_157_];
                        bool_156_ = false;
                        Class122.aBooleanArray1806[i_157_ + 1] = bool_162_;
                    }
                }
                if (bool_156_) break;
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class59_Sub2_Sub2.aClass114_8683 == Class348_Sub3.aClass114_6584) {
            if (Class34.aFrame476 != null) Class85.method830(Class316.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
            byte[] is = new byte[Class348_Sub40_Sub25.anInt9341];
            Class299.aClass348_Sub49_Sub2_3813.method3409(Class348_Sub40_Sub25.anInt9341, is, 0, -32769);
            String string = Class367_Sub8.method3546(is, 0, Class348_Sub40_Sub25.anInt9341, 0);
            Class179.method1360(string, Class348_Sub23_Sub1.aClass297_8992, Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 1, true, 99);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class367_Sub8.aClass114_7363 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            if (i == 65535) i = -1;
            int i_163_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_164_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_165_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_166_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            Class348_Sub20.method2947(true, i_165_, i, i_163_, i_164_, i_166_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class239.aClass114_3143) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            byte i_167_ = Class299.aClass348_Sub49_Sub2_3813.readByte(-83);
            Class318_Sub1_Sub3_Sub3.aClass170_10209.method1313((byte) 42, i_167_, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class318_Sub1_Sub3.aClass114_8756) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            if (i == 65535) i = -1;
            int i_168_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -127);
            Class25.method304(i, 437853543, i_168_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class280.aClass114_3641) {
            InputStream_Sub2.method128(Class348_Sub35.aClass74_6977, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class218.aClass114_2860) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            if (i == 65535) i = -1;
            int i_169_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_170_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_171_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_172_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            Class279.method2090(i_169_, i_172_, false, (byte) -35, i_171_, i_170_, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }

        // 19 - region
        if (Class348_Sub3.aClass114_6584 == Class20.aClass114_318) {
            Class348_Sub40_Sub26.method3120(-86);
            Class348_Sub3.aClass114_6584 = null;
            return false;
        }
        if (Class348_Sub3.aClass114_6584 == Class345.aClass114_4272) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(-127);
            int i_173_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -128);
            Class55_Sub1.method524(i_173_, true, i, -127);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class205.aClass114_2693 == Class348_Sub3.aClass114_6584) {
            boolean bool_174_ = (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1);
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 107);
            String string_175_ = string;
            if (bool_174_) string_175_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -71);
            long l = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            long l_176_ = Class299.aClass348_Sub49_Sub2_3813.method3351(-1);
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_177_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            long l_178_ = l_176_ + (l << 32);
            boolean bool_179_ = false;
            while_220_:
            do {
                for (int i_180_ = 0; i_180_ < 100; i_180_++) {
                    if (l_178_ == Class357.aLongArray4410[i_180_]) {
                        bool_179_ = true;
                        break while_220_;
                    }
                }
                if (i <= 1 && Class351.method3455(string_175_, 28280)) bool_179_ = true;
            } while (false);
            if (!bool_179_ && Class250.anInt3227 == 0) {
                Class357.aLongArray4410[Class79.anInt1359] = l_178_;
                Class79.anInt1359 = (Class79.anInt1359 - -1) % 100;
                String string_181_ = (Class239_Sub6.aClass355_5900.method3471(i_177_, (byte) -93).method3216(Class299.aClass348_Sub49_Sub2_3813, (byte) 62));
                if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_175_, string_181_, (byte) -110, i_177_, "<img=1>" + string, null, 18, 0, string);
                else if (i == 1) Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_175_, string_181_, (byte) -112, i_177_, "<img=0>" + string, null, 18, 0, string);
                else Class318_Sub1_Sub3_Sub5.method2477(string_175_, string_181_, (byte) -118, i_177_, string, null, 18, 0, string);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class367_Sub9.aClass114_7367) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            int i_182_ = Class299.aClass348_Sub49_Sub2_3813.readIntLittle((byte) -122);
            int i_183_ = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) -95);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            Class348_Sub41 class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3480(i_182_, -6008));
            if (class348_sub41 != null) Class127_Sub1.method1118(i != (class348_sub41.anInt7050), false, class348_sub41, 2533);
            Class338.method2661(i, i_182_, i_183_, false, 2);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class127_Sub1.aClass114_8384) {
            Class348_Sub3.aClass114_6584 = null;
            Class125.anInt4930 = 1;
            Class126.anInt4985 = Class311.anInt3918;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class176.aClass114_2335) {
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            Class128.method1122(0);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class13.aClass114_220 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_184_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_185_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i] != null) {
                for (int i_186_ = i_184_; i_185_ > i_186_; i_186_++) {
                    int i_187_ = Class299.aClass348_Sub49_Sub2_3813.method3351(-1);
                    if ((Class348_Sub40_Sub33.aClass46ArrayArray9427[i]).length > i_186_ && (Class348_Sub40_Sub33.aClass46ArrayArray9427[i][i_186_]) != null) Class348_Sub40_Sub33.aClass46ArrayArray9427[i][i_186_].anInt732 = i_187_;
                }
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class239_Sub14.aClass114_5992) {
            InputStream_Sub2.method128(Class265.aClass74_4689, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub38.aClass114_7015 == Class348_Sub3.aClass114_6584) {
            Class348_Sub40_Sub12.anInt9200 = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) 126);
            Class73.anInt4786 = (Class299.aClass348_Sub49_Sub2_3813.method3361(-622951480) << 3);
            Class278.anInt3581 = (Class299.aClass348_Sub49_Sub2_3813.method3361(-622951480) << 3);
            for (Class348_Sub37 class348_sub37 = (Class348_Sub37) Class130.aClass356_1895.method3484(0); class348_sub37 != null; class348_sub37 = ((Class348_Sub37) Class130.aClass356_1895.method3482(0))) {
                int i = (int) ((class348_sub37.aLong4291 >> 28) & 0x3L);
                int i_188_ = (int) (class348_sub37.aLong4291 & 0x3fffL);
                int i_189_ = i_188_ + -za_Sub2.anInt9780;
                int i_190_ = (int) (0x3fffL & (class348_sub37.aLong4291 >> 14));
                int i_191_ = -Class90.anInt1517 + i_190_;
                if (i == Class348_Sub40_Sub12.anInt9200 && Class278.anInt3581 <= i_189_ && 8 + Class278.anInt3581 > i_189_ && Class73.anInt4786 <= i_191_ && Class73.anInt4786 - -8 > i_191_) {
                    class348_sub37.method2715((byte) 89);
                    if (i_189_ >= 0 && i_191_ >= 0 && i_189_ < Class367_Sub4.anInt7319 && (i_191_ < Class348_Sub40_Sub3.anInt9109)) Class203.method1479(i_191_, (byte) -118, i_189_, Class348_Sub40_Sub12.anInt9200);
                }
            }
            for (Class348_Sub27 class348_sub27 = ((Class348_Sub27) Class348_Sub42_Sub20.aClass262_9711.method1995(4)); class348_sub27 != null; class348_sub27 = (Class348_Sub27) Class348_Sub42_Sub20.aClass262_9711.method1990((byte) 31)) {
                if ((Class278.anInt3581 <= class348_sub27.anInt6905) && (class348_sub27.anInt6905 < Class278.anInt3581 - -8) && (class348_sub27.anInt6896 >= Class73.anInt4786) && (class348_sub27.anInt6896 < Class73.anInt4786 + 8) && (class348_sub27.anInt6899 == Class348_Sub40_Sub12.anInt9200))
                    class348_sub27.anInt6893 = 0;
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class239_Sub15.aClass114_5997) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
            int[] is = new int[4];
            for (int i_192_ = 0; i_192_ < 4; i_192_++)
                is[i_192_] = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_193_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            Class348_Sub22 class348_sub22 = ((Class348_Sub22) Class282.aClass356_3654.method3480(i_193_, -6008));
            if (class348_sub22 != null) Class348_Sub17.method2931(i, (byte) 110, is, (class348_sub22.aClass318_Sub1_Sub3_Sub3_Sub1_6859));
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class348_Sub40_Sub22.aClass114_9285) {
            Class259.anInt3306 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub40_Sub24.aClass114_9324 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -104);
            int i_194_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -92);
            int i_195_ = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-127);
            if (i_195_ == 65535) i_195_ = -1;
            Class151.method1212(i_194_, i_195_, -1, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class321.aClass114_4015 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.method3363(-13309);
            int i_196_ = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-124);
            if (i_196_ == 65535) i_196_ = -1;
            int i_197_ = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
            Class177.method1352(i_196_, i_197_, i, (byte) -98);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub40_Sub12.aClass114_9197 == Class348_Sub3.aClass114_6584) {
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -43);
            String string_198_ = Class59_Sub2_Sub2.method572((Class348_Sub40_Sub32.method3136((byte) 64, (Class299.aClass348_Sub49_Sub2_3813))), 23034);
            Class286_Sub2.method2144(string, 6, (byte) -101, 0, string_198_, string, string);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class127_Sub1.aClass114_8385) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntLittle((byte) -124);
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -97);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            Class239_Sub19.method1803(i, string, -32394);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class174.aClass114_2305) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntInverse((byte) 82);
            int i_199_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            int i_200_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -126);
            Class238.method1703(5, i, i_200_, 4, i_199_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class368.aClass114_4500 == Class348_Sub3.aClass114_6584) {
            boolean bool_201_ = (Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21) == 1);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class122.aBoolean1801 = bool_201_;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class59.aClass114_1068) {
            Class268.method2038(-103);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub1_Sub2.aClass114_8817 == Class348_Sub3.aClass114_6584) {
            za.anInt7276 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 69);
            Class290.anInt3713 = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) -82);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class348_Sub40_Sub19.aClass114_9257) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
            int i_202_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(127);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            if (i == 2) Class130_Sub1.method1134(92);
            r.anInt9721 = i_202_;
            Class348_Sub7.method2772(i_202_, (byte) 123);
            Class239.method1713(false, 520);
            Class66.method703(r.anInt9721);
            for (int i_203_ = 0; i_203_ < 100; i_203_++)
                Class152.aBooleanArray2076[i_203_] = true;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class260.aClass114_3307) {
            if (!Class340.method2672(Class240.anInt4674, -105)) Class289.anInt3699 = (Class299.aClass348_Sub49_Sub2_3813.readShort(842397944) * 30);
            else Class289.anInt3699 = (int) ((float) Class299.aClass348_Sub49_Sub2_3813.readShort(842397944) * 2.5F);
            Class348_Sub40_Sub23.anInt9313 = Class311.anInt3918;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class318_Sub1.aClass114_6383) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            if (i == 65535) i = -1;
            int i_204_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_205_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_206_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            Class279.method2090(i_204_, 256, true, (byte) -35, i_206_, i_205_, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class318_Sub1_Sub5_Sub2.aClass114_10149 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(-16);
            if (i == 65535) i = -1;
            int i_207_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverse((byte) 82);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -125);
            Class238.method1703(1, i_207_, i, 4, -1);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class47.aClass114_843) {
            InputStream_Sub2.method128(Class91.aClass74_1519, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class239_Sub4.aClass114_5883) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(125);
            if (i == 65535) i = -1;
            int i_208_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            if (i_208_ == 65535) i_208_ = -1;
            int i_209_ = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
            int i_210_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -127);
            for (int i_211_ = i_208_; i_211_ <= i; i_211_++) {
                long l = (long) i_211_ + ((long) i_209_ << 32);
                Class348_Sub44 class348_sub44 = ((Class348_Sub44) Class226.aClass356_2959.method3480(l, -6008));
                Class348_Sub44 class348_sub44_212_;
                if (class348_sub44 != null) {
                    class348_sub44_212_ = new Class348_Sub44(i_210_, (class348_sub44.anInt7093));
                    class348_sub44.method2715((byte) 80);
                } else if (i_211_ == -1) class348_sub44_212_ = (new Class348_Sub44(i_210_, Class324.method2570(1512932720, i_209_).aClass348_Sub44_748.anInt7093));
                else class348_sub44_212_ = new Class348_Sub44(i_210_, -1);
                Class226.aClass356_2959.method3483((byte) 114, l, class348_sub44_212_);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class151.aClass114_2068) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(-103);
            int i_213_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            System.out.println("Read client varbit large " + i + " " + i_213_);
            Class318_Sub1_Sub3_Sub3.aClass170_10209.method1316((byte) -124, i, i_213_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class314_Sub1.aClass114_6340) {
            Class299.aClass348_Sub49_Sub2_3813.anInt7197 += 28;
            if (Class299.aClass348_Sub49_Sub2_3813.method3352(-25541)) Class179.method1365((Class299.aClass348_Sub49_Sub2_3813.anInt7197) + -28, (byte) -126, Class299.aClass348_Sub49_Sub2_3813);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class17.aClass114_250) {
            Class309.anInt4816 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            Class348_Sub40_Sub23.anInt9313 = Class311.anInt3918;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class185.aClass114_2483 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 20);
            int i_214_ = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
            int i_215_ = Class299.aClass348_Sub49_Sub2_3813.readIntInverse((byte) 82);
            System.out.println("Read " + i + " " + i_214_ + " " + i_215_);
            Class186.anIntArray2497[i_214_] = i_215_;
            Class161.anIntArray2145[i_214_] = i;
            Class256.anIntArray3295[i_214_] = 1;
            int i_216_ = OutputStream_Sub1.anIntArray100[i_214_] + -1;
            for (int i_217_ = 0; i_216_ > i_217_; i_217_++) {
                if (Class59_Sub1_Sub2.anIntArray8663[i_217_] <= i_215_) Class256.anIntArray3295[i_214_] = i_217_ - -2;
            }
            Class199.anIntArray2632[Class139.method1166(31, Class326.anInt4086++)] = i_214_;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class19.aClass114_315 == Class348_Sub3.aClass114_6584) {
            InputStream_Sub2.method128(Class162.aClass74_2157, (byte) 8);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class28.aClass114_4998 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(10);
            int i_218_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 70);
            boolean bool_219_ = (0x1 & i_218_) == 1;
            Class348_Sub40_Sub3.method3054(bool_219_, i, -128);
            Class199.anIntArray2633[Class139.method1166(31, Class106.anInt1631++)] = i;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub40_Sub16.aClass114_9225 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            int i_220_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            boolean bool_221_ = (i_220_ & 0x1) == 1;
            while ((Class299.aClass348_Sub49_Sub2_3813.anInt7197) < Class348_Sub40_Sub25.anInt9341) {
                int i_222_ = Class299.aClass348_Sub49_Sub2_3813.method3382(-125);
                int i_223_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
                int i_224_ = 0;
                if (i_223_ != 0) {
                    i_224_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    if (i_224_ == 255) i_224_ = Class299.aClass348_Sub49_Sub2_3813.readInt((byte) -126);
                }
                Canvas_Sub1.method121(i, -364570972, bool_221_, i_222_, i_224_, -1 + i_223_);
            }
            Class199.anIntArray2633[Class139.method1166(31, Class106.anInt1631++)] = i;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class239_Sub11.aClass114_5950 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -113);
            int i_225_ = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) 127);
            if (i == 255) {
                i_225_ = -1;
                i = -1;
            }
            Class239_Sub25.method1825(120, i_225_, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class367_Sub11.aClass114_7398 == Class348_Sub3.aClass114_6584) {
            int i = Class299.aClass348_Sub49_Sub2_3813.readIntLittle((byte) -124);
            int i_226_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class50_Sub3.method467(i_226_, -18075, i);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class209.aClass114_2717 == Class348_Sub3.aClass114_6584) {
            Class91.method856((byte) 63);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class367_Sub3.aClass114_7301 == Class348_Sub3.aClass114_6584) {
            boolean bool_227_ = (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1);
            String string = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 89);
            String string_228_ = string;
            if (bool_227_) string_228_ = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 98);
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            int i_229_ = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
            boolean bool_230_ = false;
            if (i <= 1 && Class351.method3455(string_228_, 28280)) bool_230_ = true;
            if (!bool_230_ && Class250.anInt3227 == 0) {
                String string_231_ = (Class239_Sub6.aClass355_5900.method3471(i_229_, (byte) -108).method3216(Class299.aClass348_Sub49_Sub2_3813, (byte) 93));
                if (i == 2) Class318_Sub1_Sub3_Sub5.method2477("<img=1>" + string_228_, string_231_, (byte) -127, i_229_, "<img=1>" + string, null, 25, 0, string);
                else if (i != 1) Class318_Sub1_Sub3_Sub5.method2477(string_228_, string_231_, (byte) -119, i_229_, string, null, 25, 0, string);
                else Class318_Sub1_Sub3_Sub5.method2477("<img=0>" + string_228_, string_231_, (byte) -125, i_229_, "<img=0>" + string, null, 25, 0, string);
            }
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class140.aClass114_1959 == Class348_Sub3.aClass114_6584) {

            int i = Class299.aClass348_Sub49_Sub2_3813.readIntInverseMiddle(255);
            int i_232_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(-110);
            Class318_Sub1_Sub1_Sub1.method2397((byte) -124);
            Class348_Sub49_Sub2.method3411(i, 12, i_232_);
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        if (Class348_Sub3.aClass114_6584 == Class359.aClass114_4421) {
            Class230.anInt2986 = Class311.anInt3918;
            if (Class348_Sub40_Sub25.anInt9341 == 0) {
                Class37.anInt496 = 0;
                Class50.aString863 = null;
                Class169.aClass19Array2261 = null;
                Class348_Sub21.aString6854 = null;
                Class348_Sub3.aClass114_6584 = null;
                return true;
            }
            Class348_Sub21.aString6854 = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -112);
            boolean bool_233_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1;
            if (bool_233_) Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 108);
            long l = Class299.aClass348_Sub49_Sub2_3813.method3365(-456577760);
            Class50.aString863 = Class27.method313(l, -104);
            Class219.aByte2871 = Class299.aClass348_Sub49_Sub2_3813.readByte(-90);
            int i = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            if (i == 255) {
                Class348_Sub3.aClass114_6584 = null;
                return true;
            }
            Class37.anInt496 = i;
            Class19[] class19s = new Class19[100];
            for (int i_234_ = 0; Class37.anInt496 > i_234_; i_234_++) {
                class19s[i_234_] = new Class19();
                class19s[i_234_].aString314 = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 103);
                bool_233_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) == 1;
                if (!bool_233_) class19s[i_234_].aString306 = class19s[i_234_].aString314;
                else class19s[i_234_].aString306 = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) 107);
                class19s[i_234_].aString312 = Class285_Sub1.method2127(2, (class19s[i_234_].aString306));
                class19s[i_234_].anInt308 = Class299.aClass348_Sub49_Sub2_3813.readShort(842397944);
                class19s[i_234_].aByte310 = Class299.aClass348_Sub49_Sub2_3813.readByte(-118);
                class19s[i_234_].aString313 = Class299.aClass348_Sub49_Sub2_3813.method3377((byte) -124);
                if (class19s[i_234_].aString306.equals(Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aString10544)) Class119_Sub1.aByte4702 = class19s[i_234_].aByte310;
            }
            boolean bool_235_ = false;
            int i_236_ = Class37.anInt496;
            while (i_236_ > 0) {
                i_236_--;
                bool_235_ = true;
                for (int i_237_ = 0; i_236_ > i_237_; i_237_++) {
                    if ((class19s[i_237_].aString312.compareTo(class19s[1 + i_237_].aString312)) > 0) {
                        Class19 class19 = class19s[i_237_];
                        class19s[i_237_] = class19s[i_237_ - -1];
                        class19s[1 + i_237_] = class19;
                        bool_235_ = false;
                    }
                }
                if (bool_235_) break;
            }
            Class169.aClass19Array2261 = class19s;
            Class348_Sub3.aClass114_6584 = null;
            return true;
        }
        Class156.method1242(("T1 - " + (Class348_Sub3.aClass114_6584 == null ? -1 : Class348_Sub3.aClass114_6584.method1058((byte) 110)) + "," + (Class239.aClass114_3145 == null ? -1 : Class239.aClass114_3145.method1058((byte) 127)) + "," + (Class348_Sub40_Sub36.aClass114_9456 == null ? -1 : Class348_Sub40_Sub36.aClass114_9456.method1058((byte) 125)) + " - " + Class348_Sub40_Sub25.anInt9341), null, 15004);
        Class348_Sub40_Sub34.method3141(false, (byte) 11);
        return true;
    }

    public static void method3202(byte i) {
        aClass230_10434 = null;
        if (i > 38) {
            aLongArrayArrayArray10431 = null;
            aClass76_10436 = null;
            aClass74_10437 = null;
        }
    }

    final Object method3193(int i) {
        anInt10435++;
        if (i < 75) method3193(-128);
        return anObject10429;
    }
}
