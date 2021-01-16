/* Class239_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub10 extends Class239 {
    static int anInt5935;
    static int anInt5936;
    static int anInt5937;
    static Class351 aClass351_5938 = new Class351(0, 0);
    static int anInt5939;
    static int anInt5940;
    static int anInt5941;
    static int anInt5942;
    static int anInt5943 = 1337;
    static int anInt5944;
    static float aFloat5945;
    static int anInt5946;
    static int anInt5947;
    static int anInt5948;

    Class239_Sub10(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    static final void method1760(int i, int i_0_, boolean bool, int i_1_,
                                 byte i_2_, int i_3_, int i_4_, int i_5_) {
        if (i_2_ > -85)
            method1762(-14, 70, 13, -100);
        anInt5940++;
        if (((bool
                ? Class316.aClass348_Sub51_3959
                .aClass239_Sub26_7215.method1838(-32350)
                : Class316.aClass348_Sub51_3959
                .aClass239_Sub26_7272.method1838(-32350))
                ^ 0xffffffff) != -1
                && i_3_ != 0 && (Class147.anInt2021 ^ 0xffffffff) > -51 && i != -1)
            Class258_Sub2.aClass10Array8531[Class147.anInt2021++]
                    = new Class10(!bool ? (byte) 2 : (byte) 3, i, i_3_, i_5_, i_0_,
                    i_1_, i_4_, null);
    }

    final void method1716(boolean bool) {
        anInt5941++;
        if (bool != false)
            method1712(-34, -61);
        if ((this.anInt3138 ^ 0xffffffff) > -1
                || (this.anInt3138 ^ 0xffffffff) < -5)
            this.anInt3138 = method1710(20014);
    }

    static final void method1761(int i) {
        anInt5935++;
        Class348_Sub47.method3324(Class348_Sub8.aHa6654, (byte) 105,
                Class367_Sub11.anInt7396);
        if (i != 85)
            anInt5943 = -99;
        if (r.anInt9721 != -1)
            Class75_Sub1.method769(r.anInt9721, (byte) 118);
        for (int i_6_ = 0;
             (i_6_ ^ 0xffffffff) > (Class348_Sub38.anInt7008 ^ 0xffffffff);
             i_6_++) {
            if (Class152.aBooleanArray2076[i_6_])
                Class268.aBooleanArray3438[i_6_] = true;
            Class175.aBooleanArray2326[i_6_]
                    = Class152.aBooleanArray2076[i_6_];
            Class152.aBooleanArray2076[i_6_] = false;
        }
        Class58.anInt1064 = Class367_Sub11.anInt7396;
        if (r.anInt9721 != -1) {
            Class348_Sub38.anInt7008 = 0;
            Class88.method842(false);
        }
        Class348_Sub8.aHa6654.la();
        Class348_Sub42_Sub20.method3281((byte) 77, Class348_Sub8.aHa6654);
        int i_7_ = Class112.method1053(3112);
        if ((i_7_ ^ 0xffffffff) == 0)
            i_7_ = Class362.anInt4458;
        if (i_7_ == -1)
            i_7_ = Class348_Sub42_Sub16_Sub1.anInt10447;
        Class33.method338(0, i_7_);
        Class348_Sub51.anInt7267 = 0;
    }

    final void method1712(int i, int i_8_) {
        anInt5939++;
        this.anInt3138 = i_8_;
        int i_9_ = -17 / ((82 - i) / 35);
    }

    static final int method1762(int i, int i_10_, int i_11_, int i_12_) {
        int i_13_ = 56 / ((i - 74) / 43);
        anInt5947++;
        if ((0x8
                & Class348_Sub33.aByteArrayArrayArray6962[i_10_][i_12_][i_11_])
                != 0)
            return 0;
        if ((i_10_ ^ 0xffffffff) < -1
                && ((0x2
                & Class348_Sub33.aByteArrayArrayArray6962[1][i_12_][i_11_])
                != 0))
            return i_10_ + -1;
        return i_10_;
    }

    public static void method1763(int i) {
        aClass351_5938 = null;
        if (i != -15596)
            method1763(-92);
    }

    final int method1764(int i) {
        anInt5942++;
        if (i != -32350)
            method1763(18);
        return this.anInt3138;
    }

    final int method1714(int i, int i_14_) {
        anInt5936++;
        if (i != 3)
            method1710(-95);
        return 1;
    }

    static final char method1765(char c, int i, int i_15_) {
        anInt5946++;
        if (c >= 192 && c <= 255) {
            if (c >= 192 && (c ^ 0xffffffff) >= -199)
                return 'A';
            if ((c ^ 0xffffffff) == -200)
                return 'C';
            if (c >= 200 && c <= 203)
                return 'E';
            if ((c ^ 0xffffffff) <= -205 && c <= 207)
                return 'I';
            if ((c ^ 0xffffffff) <= -211 && c <= 214)
                return 'O';
            if ((c ^ 0xffffffff) <= -218 && (c ^ 0xffffffff) >= -221)
                return 'U';
            if (c == 221)
                return 'Y';
            if (c == 223)
                return 's';
            if ((c ^ 0xffffffff) <= -225 && (c ^ 0xffffffff) >= -231)
                return 'a';
            if (c == 231)
                return 'c';
            if ((c ^ 0xffffffff) <= -233 && c <= 235)
                return 'e';
            if (c >= 236 && c <= 239)
                return 'i';
            if (c >= 242 && c <= 246)
                return 'o';
            if (c >= 249 && (c ^ 0xffffffff) >= -253)
                return 'u';
            if (c == 253 || c == 255)
                return 'y';
        }
        if (i_15_ != 105)
            aClass351_5938 = null;
        if ((c ^ 0xffffffff) == -339)
            return 'O';
        if (c == 339)
            return 'o';
        if (c == 376)
            return 'Y';
        return c;
    }

    static final Class143 method1766(byte i, int i_16_, Class45 class45) {
        anInt5944++;
        if (i >= -24)
            return null;
        byte[] is = class45.method415((byte) 73, i_16_);
        if (is == null)
            return null;
        return new Class143(is);
    }

    final int method1710(int i) {
        if (i != 20014)
            return 118;
        anInt5937++;
        return 3;
    }

    Class239_Sub10(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }
}
