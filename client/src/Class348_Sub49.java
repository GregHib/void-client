/* Class348_Sub49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

class Class348_Sub49 extends Class348 {
    static int anInt7137;
    static int anInt7138;
    static int anInt7139;
    static int anInt7140;
    static int anInt7141;
    static int anInt7142;
    static int anInt7143;
    static int anInt7144;
    static int anInt7145;
    static int anInt7146;
    static int anInt7147;
    static int anInt7148;
    static int anInt7149;
    static int anInt7150;
    static int anInt7151;
    static int anInt7152;
    static int anInt7153;
    byte[] aByteArray7154;
    static int anInt7155;
    static int anInt7156;
    static int anInt7157;
    static int anInt7158;
    static int anInt7159;
    static int anInt7160;
    static int anInt7161;
    static int anInt7162;
    static int anInt7163;
    static int anInt7164;
    static int anInt7165;
    static int anInt7166;
    static int anInt7167;
    static int anInt7168;
    static int anInt7169;
    static int anInt7170;
    static int anInt7171;
    static int anInt7172;
    static int anInt7173;
    static int anInt7174;
    static Class223 aClass223_7175 = new Class223(1, 2);
    static int anInt7176;
    static int anInt7177;
    static int anInt7178;
    static int anInt7179;
    static int anInt7180;
    static int anInt7181;
    static int anInt7182;
    static int anInt7183;
    static int anInt7184;
    static int anInt7185;
    static int anInt7186;
    static int anInt7187;
    static int anInt7188;
    static int anInt7189;
    static int anInt7190;
    static int anInt7191;
    static int anInt7192;
    static int anInt7193;
    static int anInt7194;
    static int anInt7195;
    static int anInt7196;
    int anInt7197;
    static int anInt7198;
    static int anInt7199;
    static int anInt7200;
    static int anInt7201;
    static int anInt7202;
    static int anInt7203;
    static int anInt7204;
    static int anInt7205;
    static long[] aLongArray7206 = new long[32];
    static int anInt7207;
    static int anInt7208;
    static int anInt7209;

    final int method3329(byte i) {
        anInt7163++;
        if (i != 21)
            return -10;
        return (-(this.aByteArray7154
                [this.anInt7197++])
                & 0xff);
    }

    final int method3330(int i) {
        if (i != 842397944)
            return 111;
        this.anInt7197 += 2;
        anInt7186++;
        return ((0xff & (this.aByteArray7154
                [-1 + this.anInt7197]))
                + ((this.aByteArray7154
                [-2 + this.anInt7197]) << -423866104
                & 0xff00));
    }

    static final int method3331(int i, byte i_0_, int i_1_) {
        anInt7161++;
        int i_2_ = 1;
        for (/**/; i > 1; i >>= 1) {
            if ((0x1 & i) != 0)
                i_2_ *= i_1_;
            i_1_ *= i_1_;
        }
        int i_3_ = 3 / ((i_0_ - -24) / 46);
        if (i == 1)
            return i_2_ * i_1_;
        return i_2_;
    }

    final long method3332(byte i) {
        if (i <= 88)
            return -9L;
        anInt7179++;
        long l = 0xffffffffL & (long) method3359(-45);
        long l_4_ = 0xffffffffL & (long) method3359(-99);
        return (l_4_ << 1671660832) + l;
    }

    final void method3333(byte i, String string) {
        anInt7172++;
        if (i != -5)
            this.aByteArray7154 = null;
        int i_5_ = string.indexOf('\0');
        if (i_5_ >= 0)
            throw new IllegalArgumentException("NUL character at " + i_5_
                    + " - cannot pjstr");
        this.anInt7197
                += Class348_Sub42_Sub16.method3255(0,
                (this
                        .aByteArray7154),
                string.length(), false, string,
                (this
                        .anInt7197));
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) 0;
    }

    final int method3334(int i) {
        anInt7208++;
        int i_6_ = 0;
        int i_7_;
        for (i_7_ = method3382(-124); i_7_ == 32767; i_7_ = method3382(-127))
            i_6_ += 32767;
        int i_8_ = 112 % (i / 49);
        i_6_ += i_7_;
        return i_6_;
    }

    final void method3335(int i, int i_9_) {
        anInt7156++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_9_ >> 1735754632);
        int i_10_ = -35 % ((-17 - i) / 48);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (128 + i_9_);
    }

    final void method3336(int i, byte i_11_) {
        anInt7162++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i >> 2087552840);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i >> 170971960);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i >> 1925297808);
        if (i_11_ != 44)
            anInt7207 = 1;
    }

    final void method3337(byte i, int i_12_) {
        anInt7145++;
        if (i != 107)
            method3354(20);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_12_ >> -1309028440);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i_12_;
    }

    final void method3338(int i, int i_13_) {
        this.aByteArray7154
                [-4 + this.anInt7197 - i_13_]
                = (byte) (i_13_ >> -542723592);
        anInt7200++;
        this.aByteArray7154
                [this.anInt7197 - i_13_ - 3]
                = (byte) (i_13_ >> -2122166448);
        this.aByteArray7154
                [this.anInt7197 - (i_13_ - -2)]
                = (byte) (i_13_ >> -1715854296);
        this.aByteArray7154
                [i + (this.anInt7197 + -i_13_)]
                = (byte) i_13_;
    }

    final void method3339(int i, int i_14_) {
        if (i > 91) {
            this.aByteArray7154
                    [this.anInt7197 - i_14_ + -1]
                    = (byte) i_14_;
            anInt7185++;
        }
    }

    final void method3340(int i, int i_15_) {
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_15_ >> 609757392);
        anInt7148++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_15_ >> 2119602728);
        if (i == -9912)
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) i_15_;
    }

    final byte method3341(int i) {
        if (i != -8679)
            aClass223_7175 = null;
        anInt7195++;
        return (byte) (-128 + (this.aByteArray7154
                [this.anInt7197++]));
    }

    final int method3342(byte i) {
        anInt7174++;
        int i_16_ = 27 / ((-33 - i) / 51);
        return (-(this.aByteArray7154
                [this.anInt7197++]) + 128
                & 0xff);
    }

    final int method3343(byte i) {
        this.anInt7197 += 4;
        anInt7184++;
        if (i != 82)
            method3382(-12);
        return ((0xff0000
                & (this.aByteArray7154
                [this.anInt7197 - 1]) << -285487952)
                + (((this.aByteArray7154
                [this.anInt7197 - 2]) << 842397944
                & ~0xffffff)
                + ((0xff & (this.aByteArray7154
                [this.anInt7197 + -4]))
                << -780792312)
                + (0xff & (this.aByteArray7154
                [this.anInt7197 - 3]))));
    }

    final int method3344(int i, boolean bool) {
        anInt7165++;
        if (bool != false)
            this.aByteArray7154 = null;
        int i_17_
                = Class171.method1319(this.anInt7197, true,
                this.aByteArray7154, i);
        method3391((byte) 93, i_17_);
        return i_17_;
    }

    final byte method3345(int i) {
        if (i != -27697)
            anInt7207 = -57;
        anInt7138++;
        return (byte) (-(this.aByteArray7154
                [this.anInt7197++])
                + 128);
    }

    final int method3346(int i) {
        this.anInt7197 += 4;
        anInt7194++;
        if (i != 255)
            return 93;
        return (((0xff & (this.aByteArray7154
                [-1 + this.anInt7197]))
                << 891474632)
                + (((this.aByteArray7154
                [-3 + this.anInt7197])
                & 0xff)
                << -1077235208)
                - (-((0xff & (this.aByteArray7154
                [this.anInt7197 - 4]))
                << 1612198288)
                + -(0xff & (this.aByteArray7154
                [this.anInt7197 - 2]))));
    }

    final void method3347(byte[] is, int i, int i_18_, byte i_19_) {
        anInt7183++;
        for (int i_20_ = -1 + i_18_ + i; i_20_ >= i; i_20_--)
            is[i_20_] = (this.aByteArray7154
                    [this.anInt7197++]);
        int i_21_ = -53 / ((i_19_ - -72) / 47);
    }

    final void method3348(int i, int i_22_) {
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i_22_;
        anInt7164++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_22_ >> 939638280);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_22_ >> 82099344);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_22_ >> 624183032);
        int i_23_ = -32 / ((-74 - i) / 44);
    }

    final void method3349(int i, int i_24_) {
        if (i == 4325) {
            anInt7198++;
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (i_24_ - -128);
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (i_24_ >> 1484733832);
        }
    }

    final void method3350(int i, boolean bool, int[] is, int i_25_) {
        anInt7137++;
        int i_26_ = this.anInt7197;
        this.anInt7197 = i;
        int i_27_ = (-i + i_25_) / 8;
        for (int i_28_ = 0; i_27_ > i_28_; i_28_++) {
            int i_29_ = method3385((byte) -126);
            int i_30_ = method3385((byte) -126);
            int i_31_ = 0;
            int i_32_ = -1640531527;
            int i_33_ = 32;
            while (i_33_-- > 0) {
                i_29_
                        += (i_31_ - -is[i_31_ & 0x3]
                        ^ (i_30_ >>> 2045357733 ^ i_30_ << 54454276) - -i_30_);
                i_31_ += i_32_;
                i_30_ += (i_31_ - -is[(0x1a0b & i_31_) >>> -1809168789]
                        ^ i_29_ + (i_29_ >>> 297047045
                        ^ i_29_ << -1189890044));
            }
            this.anInt7197 -= 8;
            method3391((byte) 91, i_29_);
            method3391((byte) 98, i_30_);
        }
        if (bool != true)
            method3394(88, 83);
        this.anInt7197 = i_26_;
    }

    final int method3351(int i) {
        this.anInt7197 += 3;
        anInt7203++;
        if (i != -1)
            return -52;
        return ((0xff00
                & (this.aByteArray7154
                [-2 + this.anInt7197]) << -1798246168)
                + ((((this.aByteArray7154
                [-3 + this.anInt7197])
                & 0xff)
                << -963972240)
                - -((this.aByteArray7154
                [-1 + this.anInt7197])
                & 0xff)));
    }

    final boolean method3352(int i) {
        anInt7168++;
        this.anInt7197 -= 4;
        if (i != -25541)
            method3369((byte) 56);
        int i_34_
                = Class171.method1319(this.anInt7197, true,
                this.aByteArray7154, 0);
        int i_35_ = method3385((byte) -126);
        return i_35_ == i_34_;
    }

    final void method3353(int i, byte i_36_) {
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i;
        if (i_36_ != 3)
            this.aByteArray7154 = null;
        anInt7151++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i >> 1724647496);
    }

    static final void method3354(int i) {
        if (Class348_Sub34.aHa6968 != null) {
            Class348_Sub34.aHa6968.method3635((byte) -44);
            Class348_Sub40_Sub9.aClass324_9173 = null;
            Class348_Sub34.aHa6968 = null;
        }
        int i_37_ = -97 % ((i - -14) / 37);
        anInt7173++;
    }

    final int method3355(int i) {
        anInt7158++;
        int i_38_ = -108 / ((i - 73) / 50);
        this.anInt7197 += 2;
        return (((this.aByteArray7154
                [-2 + this.anInt7197]) << 623366216
                & 0xff00)
                - -(0xff & -128 + (this.aByteArray7154
                [this.anInt7197 + -1])));
    }

    final void method3356(int i, int i_39_) {
        anInt7190++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i >> 1701443792);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i >> 1037878616);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i;
        if (i_39_ != -4086)
            method3372(24);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i >> -517604728);
    }

    final void method3357(int i, long l, byte i_40_) {
        try {
            anInt7193++;
            if (--i < 0 || i > 7)
                throw new IllegalArgumentException();
            int i_41_ = 101 % ((-11 - i_40_) / 49);
            for (int i_42_ = 8 * i; i_42_ >= 0; i_42_ -= 8)
                this.aByteArray7154
                        [this.anInt7197++]
                        = (byte) (int) (l >> i_42_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("cea.JB(" + i + ',' + l + ','
                            + i_40_ + ')'));
        }
    }

    final int readLEShort128(int i) {
        anInt7181++;
        if (i > -105)
            this.aByteArray7154 = null;
        this.anInt7197 += 2;
        return (((this.aByteArray7154
                [this.anInt7197 + -2]) - 128
                & 0xff)
                + ((this.aByteArray7154
                [-1 + this.anInt7197]) << 1771940328
                & 0xff00));
    }

    final int method3359(int i) {
        if (i > -17)
            aLongArray7206 = null;
        anInt7188++;
        this.anInt7197 += 4;
        return (((this.aByteArray7154
                [-3 + this.anInt7197]) << -1639885432
                & 0xff00)
                + ((this.aByteArray7154
                [this.anInt7197 - 1]) << -1287952296
                & ~0xffffff)
                + (((0xff & (this.aByteArray7154
                [this.anInt7197 + -2]))
                << -645785616)
                + ((this.aByteArray7154
                [-4 + this.anInt7197])
                & 0xff)));
    }

    final void method3360(byte i) {
        if (this.aByteArray7154 != null)
            Class37.method357(0, this.aByteArray7154);
        anInt7177++;
        this.aByteArray7154 = null;
        if (i != -69)
            method3344(-115, true);
    }

    final byte method3361(int i) {
        anInt7150++;
        if (i != -622951480)
            aClass223_7175 = null;
        return (byte) -(this.aByteArray7154
                [this.anInt7197++]);
    }

    final int method3362(byte i) {
        anInt7155++;
        int i_43_ = ((this.aByteArray7154
                [this.anInt7197])
                & 0xff);
        if (i != 77)
            method3388(-48);
        if (i_43_ < 128)
            return -64 + method3387(255);
        return method3330(i ^ 0x3235f8b5) - 49152;
    }

    final int method3363(int i) {
        this.anInt7197 += 3;
        anInt7144++;
        if (i != -13309)
            method3379(94, 83);
        return (((this.aByteArray7154
                [this.anInt7197 - 3])
                & 0xff)
                + (((this.aByteArray7154
                [-2 + this.anInt7197]) << -1243326136
                & 0xff00)
                + ((this.aByteArray7154
                [-1 + this.anInt7197]) << -1985557744
                & 0xff0000)));
    }

    final int method3364(byte i) {
        if (i > -117)
            this.anInt7197 = 61;
        this.anInt7197 += 4;
        anInt7167++;
        return ((0xff & (this.aByteArray7154
                [this.anInt7197 - 4]))
                + (((0xff & (this.aByteArray7154
                [-3 + this.anInt7197]))
                << 1235332232)
                + (~0xffffff & ((this.aByteArray7154
                [this.anInt7197 - 1])
                << -386128104))
                + (((this.aByteArray7154
                [this.anInt7197 - 2])
                & 0xff)
                << 132057776)));
    }

    final long method3365(int i) {
        anInt7149++;
        if (i != -456577760)
            return 14L;
        long l = 0xffffffffL & (long) method3385((byte) -126);
        long l_44_ = (long) method3385((byte) -126) & 0xffffffffL;
        return l_44_ + (l << -456577760);
    }

    final int method3366(byte i) {
        anInt7170++;
        int i_45_ = (this.aByteArray7154
                [this.anInt7197++]);
        int i_46_ = 0;
        if (i < 23)
            return -99;
        for (/**/; i_45_ < 0; i_45_ = (this.aByteArray7154
                [this.anInt7197++]))
            i_46_ = (0x7f & i_45_ | i_46_) << -1218222233;
        return i_46_ | i_45_;
    }

    final void method3367(int i, int[] is, int i_47_, int i_48_) {
        anInt7178++;
        int i_49_ = this.anInt7197;
        this.anInt7197 = i_47_;
        int i_50_ = (i_48_ + -i_47_) / 8;
        for (int i_51_ = 0; i_50_ > i_51_;
             i_51_++) {
            int i_52_ = method3385((byte) -126);
            int i_53_ = method3385((byte) -126);
            int i_54_ = -957401312;
            int i_55_ = -1640531527;
            int i_56_ = 32;
            while (i_56_-- > 0) {
                i_53_ -= ((i_52_ << 870651652 ^ i_52_ >>> -1871304219) + i_52_
                        ^ i_54_ - -is[0x4d000003 & i_54_ >>> 1029019211]);
                i_54_ -= i_55_;
                i_52_
                        -= (i_54_ - -is[i_54_ & 0x3]
                        ^ (i_53_ << 180482788 ^ i_53_ >>> 607818341) - -i_53_);
            }
            this.anInt7197 -= 8;
            method3391((byte) 113, i_52_);
            method3391((byte) 126, i_53_);
        }
        if (i == 607818341)
            this.anInt7197 = i_49_;
    }

    final long method3368(int i, int i_57_) {
        i--;
        anInt7191++;
        if (i < 0 || i > 7)
            throw new IllegalArgumentException();
        if (i_57_ != 3060)
            return 99L;
        int i_58_ = 8 * i;
        long l = 0L;
        for (/**/; i_58_ >= 0; i_58_ -= 8)
            l |= ((long) (this.aByteArray7154
                    [this.anInt7197++])
                    & 0xffL) << i_58_;
        return l;
    }

    final int method3369(byte i) {
        if (i != 125)
            return 100;
        anInt7139++;
        this.anInt7197 += 3;
        int i_59_ = (((this.aByteArray7154
                [this.anInt7197 - 1])
                & 0xff)
                + ((0xff0000 & ((this.aByteArray7154
                [this.anInt7197 + -3])
                << 567264144))
                + ((0xff & (this.aByteArray7154
                [this.anInt7197 + -2]))
                << -270410424)));
        if (i_59_ > 8388607)
            i_59_ -= 16777216;
        return i_59_;
    }

    final void method3370(byte i, int i_60_) {
        int i_61_ = -4 % ((-35 - i) / 33);
        anInt7142++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (-i_60_ + 128);
    }

    final String method3371(int i) {
        anInt7152++;
        byte i_62_ = (this.aByteArray7154
                [this.anInt7197++]);
        if (i_62_ != 0)
            throw new IllegalStateException("Bad version number in gjstr2");
        int i_63_ = this.anInt7197;
        while ((this.aByteArray7154
                [this.anInt7197++]) != 0) {
            /* empty */
        }
        int i_64_ = this.anInt7197 - (i_63_ + 1);
        if (i != -13487)
            method3391((byte) 10, -125);
        if (i_64_ == 0)
            return "";
        return Class367_Sub8.method3546(this.aByteArray7154,
                0, i_64_, i_63_);
    }

    final int method3372(int i) {
        anInt7204++;
        if (i != 13638)
            method3350(-23, true, null, -10);
        this.anInt7197 += 2;
        int i_65_ = (((this.aByteArray7154
                [this.anInt7197 - 1])
                & 0xff)
                + (((this.aByteArray7154
                [-2 + this.anInt7197])
                & 0xff)
                << 2010075272));
        if (i_65_ > 32767)
            i_65_ -= 65536;
        return i_65_;
    }

    final int readLEShort(boolean bool) {
        if (bool != false)
            return 113;
        anInt7171++;
        this.anInt7197 += 2;
        return ((0xff00
                & (this.aByteArray7154
                [this.anInt7197 - 1]) << -622951480)
                + ((this.aByteArray7154
                [-2 + this.anInt7197])
                & 0xff));
    }

    final void method3374(byte i, int i_66_) {
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) -i_66_;
        if (i >= -27)
            this.aByteArray7154 = null;
        anInt7140++;
    }

    final int method3375(byte i) {
        anInt7187++;
        this.anInt7197 += 2;
        int i_67_ = ((0xff & -128 + (this.aByteArray7154
                [this.anInt7197 - 1]))
                + (((this.aByteArray7154
                [-2 + this.anInt7197])
                & 0xff)
                << 1003977064));
        if (i != 84)
            return 85;
        if (i_67_ > 32767)
            i_67_ -= 65536;
        return i_67_;
    }

    public static void method3376(int i) {
        aLongArray7206 = null;
        aClass223_7175 = null;
        if (i != -2)
            method3376(-87);
    }

    final String method3377(byte i) {
        anInt7166++;
        int i_68_ = -81 / ((i - 30) / 52);
        int i_69_ = this.anInt7197;
        while ((this.aByteArray7154
                [this.anInt7197++]) != 0) {
            /* empty */
        }
        int i_70_ = -1 + this.anInt7197 - i_69_;
        if (i_70_ == 0)
            return "";
        return Class367_Sub8.method3546(this.aByteArray7154,
                0, i_70_, i_69_);
    }

    final void method3378(boolean bool, int i) {
        anInt7160++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i;
        if (bool != false)
            this.anInt7197 = -121;
    }

    static final void method3379(int i, int i_71_) {
        anInt7201++;
        if (i_71_ != Class240.anInt4674) {
            if (i_71_ == 13) {
                if (Class348_Sub23_Sub3.aString9043 != null)
                    Class135_Sub2.method1157(RuntimeException_Sub1.anInt4596,
                            (byte) -81);
                else
                    Class253.method1922(Class186.aString2496,
                            RuntimeException_Sub1.anInt4596,
                            Class64_Sub3.aString5600, true);
            }
            if (i_71_ != 13 && Class213.aClass238_2773 != null) {
                Class213.aClass238_2773.method1700((byte) 36);
                Class213.aClass238_2773 = null;
            }
            if (i_71_ == 3)
                Class348_Sub42_Sub8.method3198((Class285.anInt4737 != r.anInt9721),
                        (byte) -45);
            if (i_71_ == 7)
                Class107.method1006((r.anInt9721 != Class54.anInt970),
                        (byte) 102);
            if (i_71_ == 5) {
                if (Class348_Sub23_Sub3.aString9043 == null)
                    Class151.method1213(Class64_Sub3.aString5600,
                            Class186.aString2496, -124);
                else
                    Class182.method1372(-1);
            } else if (i_71_ != 6) {
                if (i_71_ == 9) {
                    if (Class348_Sub23_Sub3.aString9043 != null)
                        Class135_Sub2.method1157((RuntimeException_Sub1
                                        .anInt4596),
                                (byte) -120);
                    else
                        Class253.method1922(Class186.aString2496,
                                RuntimeException_Sub1.anInt4596,
                                Class64_Sub3.aString5600, true);
                } else if (i_71_ == 12) {
                    if (Class348_Sub23_Sub3.aString9043 == null)
                        Class151.method1213(Class64_Sub3.aString5600,
                                Class186.aString2496, -98);
                    else
                        Class182.method1372(-1);
                }
            } else if (Class348_Sub23_Sub3.aString9043 == null)
                Class253.method1922(Class186.aString2496,
                        RuntimeException_Sub1.anInt4596,
                        Class64_Sub3.aString5600, true);
            else
                Class135_Sub2.method1157(RuntimeException_Sub1.anInt4596,
                        (byte) -99);
            if (Class318_Sub1_Sub1_Sub2.method2402(Class240.anInt4674,
                    (byte) -78)) {
                Class95.aClass45_1541.anInt634 = 2;
                Class247.aClass45_3183.anInt634 = 2;
                Class94.aClass45_1538.anInt634 = 2;
                Class216.aClass45_4975.anInt634 = 2;
                Class174.aClass45_2306.anInt634 = 2;
                r_Sub2.aClass45_10480.anInt634 = 2;
                Class78.aClass45_1322.anInt634 = 2;
            }
            if (Class318_Sub1_Sub1_Sub2.method2402(i_71_, (byte) -119)) {
                Class31.anInt443 = 1;
                Class36.anInt489 = 0;
                Class348_Sub46.anInt7115 = 1;
                Class154.anInt2101 = 0;
                Class268.anInt3441 = 0;
                Class348_Sub42_Sub3.method3177(-111, true);
                Class95.aClass45_1541.anInt634 = 1;
                Class247.aClass45_3183.anInt634 = 1;
                Class94.aClass45_1538.anInt634 = 1;
                Class216.aClass45_4975.anInt634 = 1;
                Class174.aClass45_2306.anInt634 = 1;
                r_Sub2.aClass45_10480.anInt634 = 1;
                Class78.aClass45_1322.anInt634 = 1;
            }
            if (i_71_ == 11 || i_71_ == 3)
                Class348_Sub40_Sub16.method3088(9);
            boolean bool = (i == i_71_
                    || Class348_Sub42_Sub8.method3196(i_71_, i ^ ~0x58)
                    || Class340.method2672(i_71_, -100));
            boolean bool_72_
                    = (Class240.anInt4674 == 2
                    || Class348_Sub42_Sub8.method3196(Class240.anInt4674, -110)
                    || Class340.method2672(Class240.anInt4674, -128));
            if (bool != bool_72_) {
                if (!bool) {
                    Class348_Sub31.method3007(2, 22684);
                    Class348_Sub4.aClass248_6601.method1892(i ^ ~0x4b, true);
                } else {
                    Class267.anInt3428 = Class345.anInt4270;
                    if (Class316.aClass348_Sub51_3959
                            .aClass239_Sub26_7245.method1838(-32350)
                            != 0) {
                        Class315.method2355(Class316.aClass348_Sub51_3959
                                        .aClass239_Sub26_7245
                                        .method1838(-32350),
                                (byte) 50, false,
                                Class59_Sub2_Sub1.aClass45_8667,
                                Class345.anInt4270, 0, 2);
                        Class348_Sub40_Sub17_Sub1.method3093(i ^ 0x66);
                    } else
                        Class348_Sub31.method3007(2, 22684);
                    Class348_Sub4.aClass248_6601.method1892(-117, false);
                }
            }
            if (Class318_Sub1_Sub1_Sub2.method2402(i_71_, (byte) -64)
                    || i_71_ == 13)
                Class348_Sub8.aHa6654.method3673();
            Class240.anInt4674 = i_71_;
        }
    }

    final void method3380(int i, int i_73_, byte[] is, int i_74_) {
        for (int i_75_ = i_73_; i_73_ + i > i_75_; i_75_++)
            this.aByteArray7154
                    [this.anInt7197++]
                    = is[i_75_];
        int i_76_ = -41 % ((8 - i_74_) / 52);
        anInt7199++;
    }

    final void method3381(int i, int i_77_) {
        anInt7180++;
        if (i_77_ >= 0 && i_77_ < 128)
            method3378(false, i_77_);
        else if (i_77_ >= 0 && i_77_ < 32768)
            method3337((byte) 107, i_77_ + 32768);
        else if (i == 5537)
            throw new IllegalArgumentException();
    }

    final int method3382(int i) {
        if (i > -116)
            return -4;
        anInt7176++;
        int i_78_ = 0xff & (this.aByteArray7154
                [this.anInt7197]);
        if (i_78_ < 128)
            return method3387(255);
        return method3330(842397944) + -32768;
    }

    final void method3383(int i, int i_79_) {
        anInt7157++;
        this.aByteArray7154
                [-2 + -i_79_ + this.anInt7197]
                = (byte) (i_79_ >> 1809639944);
        if (i != 1809639944)
            method3350(93, true, null, -39);
        this.aByteArray7154
                [this.anInt7197 - i_79_ + -1]
                = (byte) i_79_;
    }

    final String method3384(int i) {
        anInt7205++;
        if (i <= 105)
            aLongArray7206 = null;
        if ((this.aByteArray7154
                [this.anInt7197])
                == 0) {
            this.anInt7197++;
            return null;
        }
        return method3377((byte) 92);
    }

    final int method3385(byte i) {
        anInt7196++;
        this.anInt7197 += 4;
        if (i != -126)
            method3368(-61, -64);
        return ((0xff & (this.aByteArray7154
                [this.anInt7197 - 1]))
                + ((((this.aByteArray7154
                [-4 + this.anInt7197])
                & 0xff)
                << -684944360)
                + (0xff0000 & ((this.aByteArray7154
                [-3 + this.anInt7197])
                << -950421808)))
                - -(((this.aByteArray7154
                [-2 + this.anInt7197])
                & 0xff)
                << -1279370072));
    }

    final void method3386(String string, int i) {
        anInt7182++;
        int i_80_ = -21 % ((42 - i) / 52);
        int i_81_ = string.indexOf('\0');
        if (i_81_ >= 0)
            throw new IllegalArgumentException("NUL character at " + i_81_
                    + " - cannot pjstr2");
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) 0;
        this.anInt7197
                += Class348_Sub42_Sub16.method3255(0,
                (this
                        .aByteArray7154),
                string.length(), false, string,
                (this
                        .anInt7197));
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) 0;
    }

    final int method3387(int i) {
        if (i != 255)
            method3380(-101, 111, null, 33);
        anInt7153++;
        return ((this.aByteArray7154
                [this.anInt7197++])
                & 0xff);
    }

    final byte method3388(int i) {
        if (i >= -75)
            method3395((byte) -18, -24);
        anInt7143++;
        return (this.aByteArray7154
                [this.anInt7197++]);
    }

    final void method3389(int i, int i_82_, int i_83_, byte[] is) {
        anInt7159++;
        for (int i_84_ = i_82_;
             i_83_ + i_82_ > i_84_; i_84_++)
            is[i_84_] = (this.aByteArray7154
                    [this.anInt7197++]);
        if (i != 2147483647)
            anInt7207 = -47;
    }

    final void method3390(BigInteger biginteger, byte i,
                          BigInteger biginteger_85_) {
        try {
            if (Loader.loadRunescape) {
                anInt7147++;
                int i_86_ = this.anInt7197;
                this.anInt7197 = 0;
                byte[] is = new byte[i_86_];
                method3389(2147483647, 0, i_86_, is);
                if (i >= -33)
                    method3354(-73);
                BigInteger biginteger_87_ = new BigInteger(is);
                BigInteger biginteger_88_
                        = biginteger_87_.modPow(biginteger_85_, biginteger);
                byte[] is_89_ = biginteger_88_.toByteArray();
                this.anInt7197 = 0;
                method3337((byte) 107, is_89_.length);
                method3380(is_89_.length, 0, is_89_, 85);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("cea.SA("
                            + (biginteger != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (biginteger_85_ != null
                            ? "{...}" : "null")
                            + ')'));
        }
    }

    final void method3391(byte i, int i_90_) {
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_90_ >> 1721965944);
        if (i < 84)
            method3395((byte) -122, -112);
        anInt7202++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_90_ >> 45535056);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_90_ >> 987749704);
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i_90_;
    }

    final void method3392(long l, byte i) {
        try {
            int i_91_ = -16 % ((i - -5) / 52);
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (int) (l >> 138152824);
            anInt7209++;
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (int) (l >> -632684944);
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (int) (l >> -2057341784);
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (int) (l >> 715552864);
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (int) (l >> 1759137368);
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (int) (l >> -2116993776);
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (int) (l >> -686284600);
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (int) l;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "cea.BB(" + l + ',' + i + ')');
        }
    }

    final int method3393(byte i) {
        anInt7169++;
        int i_92_ = 18 / ((-28 - i) / 40);
        return ((this.aByteArray7154
                [this.anInt7197++]) - 128
                & 0xff);
    }

    Class348_Sub49(int i) {
        this.anInt7197 = 0;
        this.aByteArray7154 = Class37.method359(i, -1);
    }

    final void method3394(int i, int i_93_) {
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i_93_;
        anInt7141++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_93_ >> -708775544);
        if (i == -23892) {
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (i_93_ >> -463536752);
            this.aByteArray7154
                    [this.anInt7197++]
                    = (byte) (i_93_ >> -1758839336);
        }
    }

    final void method3395(byte i, int i_94_) {
        anInt7192++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_94_ + 128);
        int i_95_ = -21 % ((-8 - i) / 57);
    }

    final void method3396(int i, int i_96_) {
        if (i_96_ > -5)
            aClass223_7175 = null;
        anInt7146++;
        if ((i & ~0x7f) != 0) {
            if ((i & ~0x3fff) != 0) {
                if ((~0x1fffff & i) != 0) {
                    if ((i & ~0xfffffff) != 0)
                        method3378(false, 0x80 | i >>> 1028243868);
                    method3378(false, 0x80 | i >>> 955016565);
                }
                method3378(false, (0x2000f4 | i) >>> -1096734770);
            }
            method3378(false, 0x80 | i >>> -541352473);
        }
        method3378(false, i & 0x7f);
    }

    final void method3397(int i, int i_97_) {
        anInt7189++;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) i_97_;
        this.aByteArray7154
                [this.anInt7197++]
                = (byte) (i_97_ >> 811935240);
        if (i < 22)
            method3387(6);
    }

    Class348_Sub49(byte[] is) {
        this.aByteArray7154 = is;
        this.anInt7197 = 0;
    }
}
