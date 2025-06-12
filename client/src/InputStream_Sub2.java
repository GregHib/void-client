/* InputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.InputStream;

final class InputStream_Sub2 extends InputStream {
    static int anInt80;
    static int anInt81;
    static Class114 aClass114_82 = new Class114(71, 7);
    static Class243 aClass243_83 = new Class243();
    static float[] aFloatArray84 = new float[4];
    static int anInt85;

    public static void method127(byte i) {
        if (i != 118) method128(null, (byte) -48);
        aFloatArray84 = null;
        aClass243_83 = null;
        aClass114_82 = null;
    }

    static final void method128(Class74 class74, byte i) {
        try {
            anInt81++;
            if (class74 == Class348_Sub26.aClass74_6891) {
                int i_0_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -124);
                int i_1_ = i_0_ >> 2;
                int i_2_ = 0x3 & i_0_;
                int i_3_ = Class36.anIntArray487[i_1_];
                int i_4_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_5_ = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) 65);
                int i_6_ = Class278.anInt3581 + (0x7 & i_5_ >> 4);
                int i_7_ = Class73.anInt4786 - -(i_5_ & 0x7);
                if (Class282.method2112(126, Class312.anInt3931) || (i_6_ >= 0 && i_7_ >= 0 && Class367_Sub4.anInt7319 > i_6_ && (i_7_ < Class348_Sub40_Sub3.anInt9109))) Class348_Sub12.method2800(Class348_Sub40_Sub12.anInt9200, 0, i_7_, -1, i_1_, i_3_, i_2_, i_4_, (byte) 121, i_6_);
            } else if (class74 == Class348_Sub40_Sub38.aClass74_9475) {
                int i_8_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                int i_9_ = Class278.anInt3581 + ((0x7a & i_8_) >> 4);
                int i_10_ = Class73.anInt4786 - -(i_8_ & 0x7);
                int i_11_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_12_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_13_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_14_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i ^ 0xf7);
                if (i_9_ >= 0 && i_10_ >= 0 && i_9_ < Class367_Sub4.anInt7319 && Class348_Sub40_Sub3.anInt9109 > i_10_) {
                    int i_15_ = 512 * i_9_ - -256;
                    int i_16_ = 256 + 512 * i_10_;
                    int i_17_ = Class348_Sub40_Sub12.anInt9200;
                    if (i_17_ < 3 && NPCDefinition.method802(i_10_, i_9_, true)) i_17_++;
                    Class318_Sub1_Sub3_Sub4 class318_sub1_sub3_sub4 = (new Class318_Sub1_Sub3_Sub4(i_11_, i_13_, Class367_Sub11.anInt7396, Class348_Sub40_Sub12.anInt9200, i_17_, i_15_, Class275.method2064(i_15_, Class348_Sub40_Sub12.anInt9200, 11219, i_16_) + -i_12_, i_16_, i_9_, i_9_, i_10_, i_10_, i_14_));
                    r_Sub2.aClass262_10492.method1999(new Class348_Sub42_Sub6(class318_sub1_sub3_sub4), -20180);
                }
            } else if (class74 == Class91.aClass74_1519) {
                int i_18_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_19_ = Class278.anInt3581 - -(i_18_ >> 4 & 0x7);
                int i_20_ = (0x7 & i_18_) + Class73.anInt4786;
                int i_21_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                if (i_21_ == 65535) i_21_ = -1;
                int i_22_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                int i_23_ = i_22_ >> 4 & 0xf;
                int i_24_ = 0x7 & i_22_;
                int i_25_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_26_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_27_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                if (i_19_ >= 0 && i_20_ >= 0 && i_19_ < Class367_Sub4.anInt7319 && (i_20_ < Class348_Sub40_Sub3.anInt9109)) {
                    int i_28_ = 1 + i_23_;
                    if (((Class132.aPlayer_1907.anIntArray10320[0]) >= i_19_ + -i_28_) && i_28_ + i_19_ >= (Class132.aPlayer_1907.anIntArray10320[0]) && ((Class132.aPlayer_1907.anIntArray10317[0]) >= -i_28_ + i_20_) && i_20_ + i_28_ >= (Class132.aPlayer_1907.anIntArray10317[0]))
                        Class239_Sub10.method1760(i_21_, i_26_, false, ((i_20_ << 8) + (((Class348_Sub40_Sub12.anInt9200) << 24) + ((i_19_ << 16) - -i_23_))), (byte) -98, i_24_, i_27_, i_25_);
                }
            } else if (class74 == Class348_Sub35.aClass74_6977) {
                int i_29_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_30_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                Class348_Sub40_Sub12.aClass263_9195.method2005(0, i_29_).method478(i_30_, -31076);
            } else if (Class348_Sub16_Sub1.aClass74_8853 == class74) {
                int i_31_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                int i_32_ = Class278.anInt3581 + ((i_31_ & 0x7b) >> 4);
                int i_33_ = (i_31_ & 0x7) + Class73.anInt4786;
                int i_34_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                if (i_34_ == 65535) i_34_ = -1;
                int i_35_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                int i_36_ = 0xf & i_35_ >> 4;
                int i_37_ = 0x7 & i_35_;
                int i_38_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_39_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i ^ 0xf7);
                int i_40_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                if (i_32_ >= 0 && i_33_ >= 0 && i_32_ < Class367_Sub4.anInt7319 && i_33_ < Class348_Sub40_Sub3.anInt9109) {
                    int i_41_ = i_36_ + 1;
                    if ((Class132.aPlayer_1907.anIntArray10320[0]) >= i_32_ - i_41_ && (Class132.aPlayer_1907.anIntArray10320[0]) <= i_41_ + i_32_ && ((Class132.aPlayer_1907.anIntArray10317[0]) >= -i_41_ + i_33_) && (i_33_ - -i_41_ >= (Class132.aPlayer_1907.anIntArray10317[0])))
                        Class37.method358(i_37_, (i_36_ + (i_33_ << 8) + ((Class348_Sub40_Sub12.anInt9200 << 24) + (i_32_ << 16))), i_38_, i_39_, i_40_, i_34_, -29494);
                }
            } else if (Class265.aClass74_4689 == class74) {
                int i_42_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                if (i_42_ == 65535) i_42_ = -1;
                int i_43_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 65);
                int i_44_ = ((i_43_ & 0x71) >> 4) + Class278.anInt3581;
                int i_45_ = Class73.anInt4786 + (i_43_ & 0x7);
                int i_46_ = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
                int i_47_ = i_46_ >> 2;
                int i_48_ = i_46_ & 0x3;
                int i_49_ = Class36.anIntArray487[i_47_];
                ha_Sub3.method3824(i_45_, i_42_, i_47_, i_44_, i_48_, 115, Class348_Sub40_Sub12.anInt9200, i_49_);
            } else if (class74 == Class286_Sub1.aClass74_6201) {
                int i_50_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_51_ = (i_50_ >> 4 & 0xf) + Class278.anInt3581 * 2;
                int i_52_ = (i_50_ & 0xf) + Class73.anInt4786 * 2;
                int i_53_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                boolean bool = (0x1 & i_53_) != 0;
                boolean bool_54_ = (i_53_ & 0x2) != 0;
                int i_55_ = bool_54_ ? i_53_ >> 2 : -1;
                int i_56_ = (Class299.aClass348_Sub49_Sub2_3813.readByte(-77) + i_51_);
                int i_57_ = (Class299.aClass348_Sub49_Sub2_3813.readByte(-88) + i_52_);
                int i_58_ = Class299.aClass348_Sub49_Sub2_3813.readShort(13638);
                int i_59_ = Class299.aClass348_Sub49_Sub2_3813.readShort(13638);
                int i_60_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                int i_61_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                if (!bool_54_) i_61_ *= 4;
                else i_61_ = (byte) i_61_;
                int i_62_ = (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i ^ 0xf7) * 4);
                int i_63_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                int i_64_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_65_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_66_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                if (i_65_ == 255) i_65_ = -1;
                if (i_51_ >= 0 && i_52_ >= 0 && (i_51_ < 2 * Class367_Sub4.anInt7319) && (i_52_ < Class367_Sub4.anInt7319 * 2) && i_56_ >= 0 && i_57_ >= 0 && (i_56_ < Class348_Sub40_Sub3.anInt9109 * 2) && 2 * Class348_Sub40_Sub3.anInt9109 > i_57_ && i_60_ != 65535) {
                    i_57_ *= 256;
                    i_56_ = 256 * i_56_;
                    i_62_ <<= 2;
                    i_51_ = 256 * i_51_;
                    i_66_ <<= 2;
                    i_61_ <<= 2;
                    i_52_ *= 256;
                    if (i_58_ != 0 && i_55_ != -1) {
                        Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3 = null;
                        if (i_58_ < 0) {
                            int i_67_ = -i_58_ + -1;
                            if (Class348_Sub42_Sub11.anInt9591 != i_67_) class318_sub1_sub3_sub3 = (Class294.aPlayerArray5058[i_67_]);
                            else class318_sub1_sub3_sub3 = (Class132.aPlayer_1907);
                        } else {
                            int i_68_ = i_58_ + -1;
                            Class348_Sub22 class348_sub22 = ((Class348_Sub22) Class282.aClass356_3654.method3480(i_68_, -6008));
                            if (class348_sub22 != null) class318_sub1_sub3_sub3 = (class348_sub22.aNpc_6859);
                        }
                        if (class318_sub1_sub3_sub3 != null) {
                            Class225 class225 = class318_sub1_sub3_sub3.method2422((byte) 72);
                            if ((class225.anIntArrayArray2939 != null) && (class225.anIntArrayArray2939[i_55_]) != null) i_61_ -= (class225.anIntArrayArray2939[i_55_][1]);
                            if ((class225.anIntArrayArray2910 != null) && (class225.anIntArrayArray2910[i_55_]) != null) i_61_ -= (class225.anIntArrayArray2910[i_55_][1]);
                        }
                    }
                    Class318_Sub1_Sub3_Sub5 class318_sub1_sub3_sub5 = (new Class318_Sub1_Sub3_Sub5(i_60_, Class348_Sub40_Sub12.anInt9200, Class348_Sub40_Sub12.anInt9200, i_51_, i_52_, i_61_, i_63_ - -Class367_Sub11.anInt7396, i_64_ + Class367_Sub11.anInt7396, i_65_, i_66_, i_58_, i_59_, i_62_, bool, i_55_));
                    class318_sub1_sub3_sub5.method2471((byte) -103, (-i_62_ + Class275.method2064(i_56_, Class348_Sub40_Sub12.anInt9200, 11219, i_57_)), i_57_, i_63_ + Class367_Sub11.anInt7396, i_56_);
                    Class348_Sub40_Sub17.aClass262_9240.method1999(new Class348_Sub42_Sub18(class318_sub1_sub3_sub5), -20180);
                }
            } else if (class74 == Class348_Sub42_Sub8_Sub2.aClass74_10437) {
                int i_69_ = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-128);
                int i_70_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 31);
                int i_71_ = Class73.anInt4786 + (i_70_ & 0x7);
                int i_72_ = Class90.regionTileY + i_71_;
                int i_73_ = Class278.anInt3581 + (i_70_ >> 4 & 0x7);
                int i_74_ = za_Sub2.regionTileX + i_73_;
                Class348_Sub37 class348_sub37 = ((Class348_Sub37) (Class130.aClass356_1895.method3480(i_72_ << 14 | Class348_Sub40_Sub12.anInt9200 << 28 | i_74_, -6008)));
                if (class348_sub37 != null) {
                    for (Class348_Sub34 class348_sub34 = ((Class348_Sub34) class348_sub37.aClass262_6998.method1995(4)); class348_sub34 != null; class348_sub34 = ((Class348_Sub34) class348_sub37.aClass262_6998.method1990((byte) 49))) {
                        if ((0x7fff & i_69_) == class348_sub34.anInt6973) {
                            class348_sub34.method2715((byte) 127);
                            break;
                        }
                    }
                    if (class348_sub37.aClass262_6998.method2002((byte) 18)) class348_sub37.method2715((byte) 62);
                    if (i_73_ >= 0 && i_71_ >= 0 && Class367_Sub4.anInt7319 > i_73_ && Class348_Sub40_Sub3.anInt9109 > i_71_) Class203.method1479(i_71_, (byte) -125, i_73_, Class348_Sub40_Sub12.anInt9200);
                }
            } else if (Class59_Sub1_Sub2.aClass74_8662 == class74) {
                int i_75_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                int i_76_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                int i_77_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_78_ = Class73.anInt4786 - -(0x7 & i_77_);
                int i_79_ = i_78_ + Class90.regionTileY;
                int i_80_ = Class278.anInt3581 - -((i_77_ & 0x79) >> 4);
                int i_81_ = za_Sub2.regionTileX - -i_80_;
                boolean bool = (i_80_ >= 0 && i_78_ >= 0 && Class367_Sub4.anInt7319 > i_80_ && Class348_Sub40_Sub3.anInt9109 > i_78_);
                if (bool || Class282.method2112(124, Class312.anInt3931)) {
                    Class352.method3459(new Class348_Sub34(i_76_, i_75_), Class348_Sub40_Sub12.anInt9200, i_79_, i_81_, -2);
                    if (bool) Class203.method1479(i_78_, (byte) -124, i_80_, Class348_Sub40_Sub12.anInt9200);
                }
            } else if (class74 == Class374.aClass74_4537) {
                int i_82_ = Class299.aClass348_Sub49_Sub2_3813.readByteAdd((byte) 83);
                int i_83_ = i_82_ >> 2;
                int i_84_ = 0x3 & i_82_;
                int i_85_ = Class36.anIntArray487[i_83_];
                int i_86_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i ^ 0xf7);
                int i_87_ = Class278.anInt3581 + (i_86_ >> 4 & 0x7);
                int i_88_ = Class73.anInt4786 - -(0x7 & i_86_);
                if (Class282.method2112(i ^ 0x73, Class312.anInt3931) || (i_87_ >= 0 && i_88_ >= 0 && Class367_Sub4.anInt7319 > i_87_ && (i_88_ < Class348_Sub40_Sub3.anInt9109))) Class348_Sub12.method2800(Class348_Sub40_Sub12.anInt9200, 0, i_88_, -1, i_83_, i_85_, i_84_, -1, (byte) 125, i_87_);
            } else {
                if (i != 8) aClass114_82 = null;
                if (Class39.aClass74_515 == class74) {
                    int i_89_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    int i_90_ = Class73.anInt4786 + (0x7 & i_89_);
                    int i_91_ = i_90_ + Class90.regionTileY;
                    int i_92_ = (Class278.anInt3581 - -((i_89_ & 0x7a) >> 4));
                    int i_93_ = za_Sub2.regionTileX + i_92_;
                    int i_94_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                    int i_95_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                    int i_96_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                    if (Class130.aClass356_1895 != null) {
                        Class348_Sub37 class348_sub37 = ((Class348_Sub37) (Class130.aClass356_1895.method3480(i_93_ | ((Class348_Sub40_Sub12.anInt9200 << 28) | i_91_ << 14), -6008)));
                        if (class348_sub37 != null) {
                            for (Class348_Sub34 class348_sub34 = ((Class348_Sub34) class348_sub37.aClass262_6998.method1995(4)); class348_sub34 != null; class348_sub34 = ((Class348_Sub34) class348_sub37.aClass262_6998.method1990((byte) 34))) {
                                if ((class348_sub34.anInt6973) == (0x7fff & i_94_) && i_95_ == class348_sub34.anInt6971) {
                                    class348_sub34.method2715((byte) 32);
                                    class348_sub34.anInt6971 = i_96_;
                                    Class352.method3459(class348_sub34, (Class348_Sub40_Sub12.anInt9200), i_91_, i_93_, i ^ ~0x9);
                                    break;
                                }
                            }
                            if (i_92_ >= 0 && i_90_ >= 0 && (i_92_ < Class367_Sub4.anInt7319) && (Class348_Sub40_Sub3.anInt9109 > i_90_)) Class203.method1479(i_90_, (byte) -125, i_92_, (Class348_Sub40_Sub12.anInt9200));
                        }
                    }
                } else if (class74 == Class327.aClass74_4098) {
                    int i_97_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                    int i_98_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    int i_99_ = (0x7 & i_98_) + Class73.anInt4786;
                    int i_100_ = Class90.regionTileY + i_99_;
                    int i_101_ = Class278.anInt3581 - -((i_98_ & 0x7b) >> 4);
                    int i_102_ = za_Sub2.regionTileX + i_101_;
                    int i_103_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(-25);
                    int i_104_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(123);
                    if (i_104_ != Class348_Sub42_Sub11.anInt9591) {
                        boolean bool = (i_101_ >= 0 && i_99_ >= 0 && (i_101_ < Class367_Sub4.anInt7319) && (i_99_ < Class348_Sub40_Sub3.anInt9109));
                        if (bool || Class282.method2112(122, Class312.anInt3931)) {
                            Class352.method3459(new Class348_Sub34(i_103_, i_97_), Class348_Sub40_Sub12.anInt9200, i_100_, i_102_, i + -10);
                            if (bool) Class203.method1479(i_99_, (byte) -120, i_101_, (Class348_Sub40_Sub12.anInt9200));
                        }
                    }
                } else if (class74 == Class162.aClass74_2157) {
                    int i_105_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                    boolean bool = (0x80 & i_105_) != 0;
                    int i_106_ = Class278.anInt3581 - -(i_105_ >> 3 & 0x7);
                    int i_107_ = (0x7 & i_105_) + Class73.anInt4786;
                    int i_108_ = i_106_ - -Class299.aClass348_Sub49_Sub2_3813.readByte(-94);
                    int i_109_ = (Class299.aClass348_Sub49_Sub2_3813.readByte(-87) + i_107_);
                    int i_110_ = Class299.aClass348_Sub49_Sub2_3813.readShort(13638);
                    int i_111_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                    int i_112_ = (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) * 4);
                    int i_113_ = (Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) * 4);
                    int i_114_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                    int i_115_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                    int i_116_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    if (i_116_ == 255) i_116_ = -1;
                    int i_117_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                    if (i_106_ >= 0 && i_107_ >= 0 && (i_106_ < Class367_Sub4.anInt7319) && i_107_ < Class348_Sub40_Sub3.anInt9109 && i_108_ >= 0 && i_109_ >= 0 && Class367_Sub4.anInt7319 > i_108_ && (Class348_Sub40_Sub3.anInt9109 > i_109_) && i_111_ != 65535) {
                        i_117_ <<= 2;
                        i_109_ = 256 + i_109_ * 512;
                        i_113_ <<= 2;
                        i_108_ = 256 + 512 * i_108_;
                        i_107_ = i_107_ * 512 + 256;
                        i_106_ = i_106_ * 512 + 256;
                        i_112_ <<= 2;
                        Class318_Sub1_Sub3_Sub5 class318_sub1_sub3_sub5 = (new Class318_Sub1_Sub3_Sub5(i_111_, Class348_Sub40_Sub12.anInt9200, Class348_Sub40_Sub12.anInt9200, i_106_, i_107_, i_112_, i_114_ + Class367_Sub11.anInt7396, Class367_Sub11.anInt7396 + i_115_, i_116_, i_117_, 0, i_110_, i_113_, bool, -1));
                        class318_sub1_sub3_sub5.method2471((byte) -103, Class275.method2064(i_108_, (Class348_Sub40_Sub12.anInt9200), 11219, i_109_) + -i_113_, i_109_, i_114_ + Class367_Sub11.anInt7396, i_108_);
                        Class348_Sub40_Sub17.aClass262_9240.method1999(new Class348_Sub42_Sub18(class318_sub1_sub3_sub5), -20180);
                    }
                } else if (Class186.aClass74_2491 == class74) {
                    Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    int i_118_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                    int i_119_ = (i_118_ >> 4 & 0x7) + Class278.anInt3581;
                    int i_120_ = (0x7 & i_118_) + Class73.anInt4786;
                    int i_121_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(i ^ 0x3235f8f0);
                    int i_122_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    int i_123_ = Class299.aClass348_Sub49_Sub2_3813.readMedium(-1);
                    String string = Class299.aClass348_Sub49_Sub2_3813.readString((byte) -126);
                    Class6.method205(i_121_, i_119_, i_123_, string, i_122_, -109, i_120_, Class348_Sub40_Sub12.anInt9200);
                } else {
                    Class156.method1242("T3 - " + class74, null, 15004);
                    Class348_Sub40_Sub34.method3141(false, (byte) 11);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("sfa.A(" + (class74 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    public final int read() {
        Class286_Sub5.method2161((byte) -118, 30000L);
        anInt80++;
        return -1;
    }
}
