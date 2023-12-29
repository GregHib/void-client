/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class170 implements Interface17 {
    static int anInt5062;
    int[] anIntArray5063;
    static int anInt5064;
    static int anInt5065;
    static int anInt5066;
    static Class237_Sub1 aClass237_Sub1_5067;
    static int anInt5068;
    static int anInt5069;
    private Class356 aClass356_5070 = new Class356(128);
    static int anInt5071;
    static int anInt5072;
    static int anInt5073;
    static int anInt5074;
    static int anInt5075;
    static int anInt5076;
    static int anInt5077;
    private final int[] anIntArray5078;
    static int anInt5079;
    static int anInt5080;
    static int anInt5081;

    final int method1305(byte i, boolean bool) {
        anInt5071++;
        if (i >= -124) method1308(-105, 89, -65, -52, (byte) 76, 37, -61, 73);
        long l = Class62.method599(-79);
        for (Class348_Sub14 class348_sub14 = (bool ? (Class348_Sub14) aClass356_5070.method3484(0) : (Class348_Sub14) aClass356_5070.method3482(0)); class348_sub14 != null; class348_sub14 = (Class348_Sub14) aClass356_5070.method3482(0)) {
            if (l > (class348_sub14.aLong6762 & 0x3fffffffffffffffL)) {
                if ((0x4000000000000000L & class348_sub14.aLong6762) != 0L) {
                    int i_0_ = (int) class348_sub14.aLong4291;
                    this.anIntArray5063[i_0_] = anIntArray5078[i_0_];
                    class348_sub14.method2715((byte) 31);
                    return i_0_;
                }
                class348_sub14.method2715((byte) 75);
            }
        }
        return -1;
    }

    final void method1306(byte i, int i_1_, int i_2_) {
        if (i == -78) {
            anInt5066++;
            this.anIntArray5063[i_2_] = i_1_;
            Class348_Sub14 class348_sub14 = ((Class348_Sub14) aClass356_5070.method3480(i_2_, -6008));
            if (class348_sub14 == null) {
                class348_sub14 = new Class348_Sub14(500L + Class62.method599(-122));
                aClass356_5070.method3483((byte) 73, i_2_, class348_sub14);
            } else class348_sub14.aLong6762 = Class62.method599(-88) - -500L;
        }
    }

    public final int method62(int i, int i_3_) {
        anInt5068++;
        Class146 class146 = Class229.aClass194_2981.method1446(i, -1);
        int i_4_ = class146.anInt2019;
        if (i_3_ != -65536) return -52;
        int i_5_ = class146.anInt2016;
        int i_6_ = class146.anInt2020;
        int i_7_ = Class129.anIntArray1885[-i_5_ + i_6_];
        return this.anIntArray5063[i_4_] >> i_5_ & i_7_;
    }

    final void method1307(int i, int i_8_, int i_9_) {
        anInt5074++;
        Class146 class146 = Class229.aClass194_2981.method1446(i, -1);
        int i_10_ = class146.anInt2019;
        int i_11_ = class146.anInt2016;
        int i_12_ = class146.anInt2020;
        int i_13_ = Class129.anIntArray1885[-i_11_ + i_12_];
        if (i_8_ < (~i_9_) || i_13_ < i_9_) i_9_ = 0;
        i_13_ <<= i_11_;
        method1306((byte) -78, i_9_ << i_11_ & i_13_ | (this.anIntArray5063[i_10_]) & (~i_13_), i_10_);
    }

    static final void method1308(int i, int i_14_, int i_15_, int i_16_, byte i_17_, int i_18_, int i_19_, int i_20_) {
        anInt5072++;
        if (Class369.anInt4960 <= i_15_ && i_19_ <= Class113.anInt1745 && i_14_ >= Class132.anInt1910 && Class38.anInt513 >= i_20_) Class239_Sub3.method1730(i_16_, i_20_, i_14_, i_19_, i, i_18_, -128, i_15_);
        else s_Sub3.method4004(i_20_, i_19_, i_14_, i, i_18_, -80, i_15_, i_16_);
        if (i_17_ > -113) aClass237_Sub1_5067 = null;
    }

    static final void method1309(boolean bool, int i) {
        if (Class51.aClass311_897 == null) Class70.method726(92);
        if (i < 116) aClass237_Sub1_5067 = null;
        anInt5062++;
        if (bool) Class51.aClass311_897.method2326(96);
    }

    public static void method1310(boolean bool) {
        if (bool == true) aClass237_Sub1_5067 = null;
    }

    static final void method1311(int i, ha var_ha) {
        Class199.aClass352Array2636 = new Class352[Class348_Sub1.anIntArray6547.length];
        anInt5064++;
        if (i != 5139) anInt5065 = 62;
        for (int i_21_ = 0; (i_21_ < Class348_Sub1.anIntArray6547.length); i_21_++) {
            int i_22_ = Class348_Sub1.anIntArray6547[i_21_];
            FontMetrics fontMetrics = Class239_Sub10.getFontMetrics((byte) -86, i_22_, s.aIndex_4585);
            FontRenderer fontRenderer = var_ha.method3686(fontMetrics, Class207.method1523(Class39.aIndex_518, i_22_), true);
            Class199.aClass352Array2636[i_21_] = new Class352(fontRenderer, fontMetrics);
        }
    }

    static final Class52 method1312(byte i, Class348_Sub49 class348_sub49) {
        anInt5075++;
        int i_23_ = class348_sub49.readInt((byte) -126);
        if (i < 47) method1315(4);
        return new Class52(i_23_);
    }

    final void method1313(byte i, int i_24_, int i_25_) {
        anInt5073++;
        if (i != 42) anInt5065 = -16;
        anIntArray5078[i_25_] = i_24_;
        Class348_Sub14 class348_sub14 = ((Class348_Sub14) aClass356_5070.method3480(i_25_, i + -6050));
        if (class348_sub14 == null) {
            class348_sub14 = new Class348_Sub14(4611686018427387905L);
            aClass356_5070.method3483((byte) 19, i_25_, class348_sub14);
        } else if (class348_sub14.aLong6762 != 4611686018427387905L) class348_sub14.aLong6762 = 0x4000000000000000L | 500L + Class62.method599(-108);
    }

    final void method1314(byte i) {
        for (int i_26_ = 0; (i_26_ < Class269.aClass217_3453.anInt2845); i_26_++) {
            Class159 class159 = Class269.aClass217_3453.method1588(-105, i_26_);
            if (class159 != null && class159.anInt2125 == 0) {
                anIntArray5078[i_26_] = 0;
                this.anIntArray5063[i_26_] = 0;
            }
        }
        anInt5076++;
        aClass356_5070 = new Class356(128);
        int i_27_ = -69 % ((25 - i) / 39);
    }

    public final int method61(int i, byte i_28_) {
        anInt5081++;
        if (i_28_ != -16) anInt5065 = 51;
        return this.anIntArray5063[i];
    }

    static final void method1315(int i) {
        anInt5077++;
        if (Class318_Sub1_Sub5.aClass144_8766 != null) {
            if (Class318_Sub1_Sub5.aClass144_8766.anInt1997 == 1) {
                Class318_Sub1_Sub5.aClass144_8766 = null;
                return;
            }
            if (Class318_Sub1_Sub5.aClass144_8766.anInt1997 == 2) {
                Class348_Sub16_Sub3.method2862(Class195.aClass297_5017, Class348_Sub42_Sub8.aString9554, -120, 2);
                Class318_Sub1_Sub5.aClass144_8766 = null;
                return;
            }
        }
        int i_29_ = -31 / ((-29 - i) / 61);
    }

    final void method1316(byte i, int i_30_, int i_31_) {
        anInt5069++;
        Class146 class146 = Class229.aClass194_2981.method1446(i_30_, -1);
        int i_32_ = class146.anInt2019;
        int i_33_ = class146.anInt2016;
        if (i < -56) {
            int i_34_ = class146.anInt2020;
            int i_35_ = Class129.anIntArray1885[i_34_ - i_33_];
            if (i_31_ < 0 || i_35_ < i_31_) i_31_ = 0;
            i_35_ <<= i_33_;
            method1313((byte) 42, (i_31_ << i_33_ & i_35_ | (~i_35_) & anIntArray5078[i_32_]), i_32_);
        }
    }

    static final boolean method1317(int i, byte i_36_, int i_37_) {
        anInt5079++;
        if (i_36_ >= -67) method1317(43, (byte) 36, 20);
        return Class294.method2217(i, i_37_, 0) | (i_37_ & 0x70000) != 0 || Class264.method2015(i_37_, i, 7);
    }

    static final void method1318(int i) {
        if (i != -65536) method1310(false);
        for (int i_38_ = 0; i_38_ < Class101.anInt1597; i_38_++) {
            int i_39_ = Class13.anIntArray224[i_38_];
            Npc npc = (((Class348_Sub22) Class282.aClass356_3654.method3480(i_39_, -6008)).aNpc_6859);
            int i_40_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
            if ((0x10 & i_40_) != 0) i_40_ += Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(i ^ ~0xff00) << 8;
            if ((0x2 & i_40_) != 0) {
                if (npc.aClass79_10505.method793(i ^ ~0xffff)) Class5.method181(true, npc);
                npc.method2448((Class189.aClass278_2529.method2079(Class299.aClass348_Sub49_Sub2_3813.readShortAdd(-1), -1)), -2);
                npc.method2434((byte) 95, npc.aClass79_10505.anInt1399);
                npc.anInt10310 = npc.aClass79_10505.anInt1329 << 3;
                if (npc.aClass79_10505.method793(0)) Class223.method1614(979190089, npc, (npc.plane), (npc.anIntArray10317[0]), (npc.anIntArray10320[0]), null, null, 0);
            }
            if ((0x8 & i_40_) != 0) {
                int[] is = new int[4];
                for (int i_41_ = 0; i_41_ < 4; i_41_++) {
                    is[i_41_] = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                    if (is[i_41_] == 65535) is[i_41_] = -1;
                }
                int i_42_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -121);
                Class348_Sub17.method2931(i_42_, (byte) 115, is, npc);
            }
            if ((i_40_ & 0x20) != 0) {
                int i_43_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                int i_44_ = Class299.aClass348_Sub49_Sub2_3813.readIntMiddleEndian((byte) 82);
                if (i_43_ == 65535) i_43_ = -1;
                int i_45_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_46_ = 0x7 & i_45_;
                int i_47_ = (i_45_ & 0x79) >> 3;
                if (i_47_ == 15) i_47_ = -1;
                npc.method2437(i_46_, i_43_, i ^ 0x3c569b2e, i_47_, false, i_44_);
            }
            if ((0x4000 & i_40_) != 0) {
                int i_48_ = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
                int[] is = new int[i_48_];
                int[] is_49_ = new int[i_48_];
                int[] is_50_ = new int[i_48_];
                for (int i_51_ = 0; i_48_ > i_51_; i_51_++) {
                    int i_52_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                    if (i_52_ == 65535) i_52_ = -1;
                    is[i_51_] = i_52_;
                    is_49_[i_51_] = Class299.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
                    is_50_[i_51_] = Class299.aClass348_Sub49_Sub2_3813.readShortAddLittle(-109);
                }
                Class367_Sub8.method3548(-7387, npc, is_50_, is, is_49_);
            }
            if ((i_40_ & 0x200) != 0) {
                int i_53_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -121);
                int[] is = new int[i_53_];
                int[] is_54_ = new int[i_53_];
                for (int i_55_ = 0; i_53_ > i_55_; i_55_++) {
                    int i_56_ = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(124);
                    if ((0xc000 & i_56_) == 49152) {
                        int i_57_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842463480);
                        is[i_55_] = Class273.method2057(i_57_, i_56_ << 16);
                    } else is[i_55_] = i_56_;
                    is_54_[i_55_] = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                }
                npc.method2430(is_54_, is, -100);
            }
            if ((0x4 & i_40_) != 0) {
                npc.anInt10499 = Class299.aClass348_Sub49_Sub2_3813.readShortAdd(124);
                npc.anInt10512 = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
            }
            if ((0x1000 & i_40_) != 0) {
                npc.anInt10293 = Class299.aClass348_Sub49_Sub2_3813.readByteSubtract(-27697);
                npc.anInt10314 = Class299.aClass348_Sub49_Sub2_3813.readByteSubtract(-27697);
                npc.anInt10241 = Class299.aClass348_Sub49_Sub2_3813.readByte(-128);
                npc.anInt10288 = Class299.aClass348_Sub49_Sub2_3813.readByteSubtract(-27697);
                npc.anInt10239 = (Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false) + Class367_Sub11.anInt7396);
                npc.anInt10300 = (Class299.aClass348_Sub49_Sub2_3813.readShortAdd(12) - -Class367_Sub11.anInt7396);
                npc.anInt10231 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 66);
                npc.anInt10314 += npc.anIntArray10317[0];
                npc.anInt10322 = 0;
                npc.anInt10288 += npc.anIntArray10317[0];
                npc.anInt10293 += npc.anIntArray10320[0];
                npc.anInt10241 += npc.anIntArray10320[0];
                npc.anInt10319 = 1;
            }
            if ((i_40_ & 0x2000) != 0) {
                npc.aByte10255 = Class299.aClass348_Sub49_Sub2_3813.readByteInverse(-622951480);
                npc.aByte10206 = Class299.aClass348_Sub49_Sub2_3813.readByteSubtract(-27697);
                npc.aByte10270 = Class299.aClass348_Sub49_Sub2_3813.readByteInverse(i + -622885944);
                npc.aByte10279 = (byte) Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                npc.anInt10248 = Class367_Sub11.anInt7396 + Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                npc.anInt10250 = Class367_Sub11.anInt7396 + Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
            }
            if ((i_40_ & 0x40) != 0) {
                int i_58_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -100);
                if (i_58_ > 0) {
                    for (int i_59_ = 0; i_58_ > i_59_; i_59_++) {
                        int i_60_ = -1;
                        int i_61_ = -1;
                        int i_62_ = -1;
                        int i_63_ = Class299.aClass348_Sub49_Sub2_3813.readSmart(-126);
                        if (i_63_ == 32767) {
                            i_63_ = Class299.aClass348_Sub49_Sub2_3813.readSmart(-118);
                            i_61_ = Class299.aClass348_Sub49_Sub2_3813.readSmart(-117);
                            i_60_ = Class299.aClass348_Sub49_Sub2_3813.readSmart(-122);
                            i_62_ = Class299.aClass348_Sub49_Sub2_3813.readSmart(-123);
                        } else if (i_63_ != 32766) i_61_ = Class299.aClass348_Sub49_Sub2_3813.readSmart(-123);
                        else i_63_ = -1;
                        int i_64_ = Class299.aClass348_Sub49_Sub2_3813.readSmart(-122);
                        int i_65_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                        npc.method2438(i_61_, Class367_Sub11.anInt7396, i_63_, i_62_, i_60_, i_64_, i_65_, (byte) 124);
                    }
                }
            }
            if ((i_40_ & 0x80) != 0) {
                npc.anInt10275 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                if ((npc.anInt10275) == 65535) npc.anInt10275 = -1;
            }
            if ((0x1 & i_40_) != 0) {
                npc.aString10292 = Class299.aClass348_Sub49_Sub2_3813.readString((byte) 121);
                npc.anInt10264 = 100;
            }
            if ((i_40_ & 0x800) != 0) {
                int i_66_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                npc.anInt10227 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -84);
                npc.anInt10271 = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -88);
                npc.anInt10210 = 0x7fff & i_66_;
                npc.aBoolean10226 = (0x8000 & i_66_) != 0;
                npc.anInt10287 = (npc.anInt10227 + Class367_Sub11.anInt7396 + npc.anInt10210);
            }
            if ((i_40_ & 0x400) != 0) {
                int i_67_ = Class299.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                int i_68_ = Class299.aClass348_Sub49_Sub2_3813.readIntLittle((byte) -127);
                if (i_67_ == 65535) i_67_ = -1;
                int i_69_ = Class299.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -116);
                int i_70_ = i_69_ & 0x7;
                int i_71_ = (i_69_ & 0x7e) >> 3;
                if (i_71_ == 15) i_71_ = -1;
                npc.method2437(i_70_, i_67_, i ^ 0x3c569b2e, i_71_, true, i_68_);
            }
        }
        anInt5080++;
    }

    public Class170() {
        this.anIntArray5063 = new int[Class269.aClass217_3453.anInt2845];
        System.out.println("Varp size " + Class269.aClass217_3453.anInt2845);
        anIntArray5078 = new int[Class269.aClass217_3453.anInt2845];
    }
}
