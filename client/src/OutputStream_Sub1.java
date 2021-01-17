/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

final class OutputStream_Sub1 extends OutputStream {
    static int anInt92;
    static Random aRandom93 = new Random();
    static int anInt94;
    static int anInt95;
    static int anInt96;
    static Class110_Sub1[] aClass110_Sub1Array97;
    static int anInt98;
    static int[] anIntArray99;
    static int[] anIntArray100 = {99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};

    static final void method132(int i, boolean bool, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt94++;
        if (Class147.aClass357ArrayArrayArray2029 == null) Class348_Sub8.aHa6654.method3675(i_0_, (byte) -125, i_1_, i_3_, i_2_, -16777216);
        else if (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6377 < 0 || (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6377 >= Class367_Sub4.anInt7319 * 512) || Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6388 < 0 || (512 * Class348_Sub40_Sub3.anInt9109 <= Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6388))
            Class348_Sub8.aHa6654.method3675(i_0_, (byte) -125, i_1_, i_3_, i_2_, -16777216);
        else {
            Class239_Sub15.anInt6006++;
            if (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907 != null && Class248.anInt3203 == (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6377 + -(256 * Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.method2436((byte) 90)) - -256) >> 9 && Class97.anInt1548 == (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6388 + 256 + -(256 * Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.method2436((byte) 112))) >> 9) {
                Class97.anInt1548 = -1;
                Class248.anInt3203 = -1;
                Class299_Sub1_Sub2.method2264(false);
            }
            Class192.method1434(-14988);
            if (!bool) Class282.method2109(512);
            Class108.method1014(-4);
            Class348_Sub42_Sub3.method3174(i_1_, i_3_, i_0_, true, (byte) -82, i_2_);
            i_3_ = Class234.anInt3047;
            i_1_ = Class295.anInt3764;
            i_2_ = Class280.anInt3643;
            Class132.anInt1906 = Class132.anInt1911;
            i_0_ = Class127.anInt4656;
            if (Class348_Sub40_Sub21.anInt9282 == 1) {
                int i_4_ = (int) Class76.aFloat1287;
                if (Class348_Sub35.anInt6979 >> 8 > i_4_) i_4_ = Class348_Sub35.anInt6979 >> 8;
                if (Class181.aBooleanArray2374[4] && Class255.anIntArray3273[4] + 128 > i_4_) i_4_ = Class255.anIntArray3273[4] + 128;
                int i_5_ = (int) Class314.aFloat3938 + Class195.anInt5016 & 0x3fff;
                Class17.method268(i_4_, -200 + (Class275.method2064((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6377), Class355.anInt4372, 11219, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6388))), i_5_, Class192.anInt2578, i_2_, -19360, Class130_Sub1.anInt5799, (i_4_ >> 3) * 3 + 600 << 2);
            } else if (Class348_Sub40_Sub21.anInt9282 == 4) {
                int i_6_ = (int) Class76.aFloat1287;
                if (i_6_ < Class348_Sub35.anInt6979 >> 8) i_6_ = Class348_Sub35.anInt6979 >> 8;
                if (Class181.aBooleanArray2374[4] && (i_6_ < Class255.anIntArray3273[4] + 128)) i_6_ = 128 + Class255.anIntArray3273[4];
                int i_7_ = (int) Class314.aFloat3938 & 0x3fff;
                Class17.method268(i_6_, -200 + Class275.method2064(Class348_Sub6.anInt6633, Class355.anInt4372, 11219, Class348_Sub7.anInt6652), i_7_, Class192.anInt2578, i_2_, -19360, Class130_Sub1.anInt5799, 600 - -((i_6_ >> 3) * 3) << 2);
            } else if (Class348_Sub40_Sub21.anInt9282 == 5) Class268.method2035(i_2_, 0);
            int i_8_ = Class286_Sub4.anInt6246;
            int i_9_ = Class305.anInt3855;
            int i_10_ = Class59_Sub2_Sub2.anInt8685;
            int i_11_ = Class348_Sub42_Sub19.anInt9701;
            int i_12_ = Class5.anInt4638;
            for (int i_13_ = 0; i_13_ < 5; i_13_++) {
                if (Class181.aBooleanArray2374[i_13_]) {
                    int i_14_ = (int) ((Math.random() * (double) ((Class275.anIntArray3552[i_13_] * 2) - -1)) - (double) Class275.anIntArray3552[i_13_] + (Math.sin((double) (Class318_Sub1_Sub1_Sub2.anIntArray9981[i_13_]) * ((double) (Class338.anIntArray4196[i_13_]) / 100.0)) * (double) (Class255.anIntArray3273[i_13_])));
                    if (i_13_ == 4) {
                        Class348_Sub42_Sub19.anInt9701 += i_14_;
                        if (Class348_Sub42_Sub19.anInt9701 >= 1024) {
                            if (Class348_Sub42_Sub19.anInt9701 > 3072) Class348_Sub42_Sub19.anInt9701 = 3072;
                        } else Class348_Sub42_Sub19.anInt9701 = 1024;
                    }
                    if (i_13_ == 0) Class286_Sub4.anInt6246 += i_14_ << 2;
                    if (i_13_ == 3) Class5.anInt4638 = 0x3fff & i_14_ + Class5.anInt4638;
                    if (i_13_ == 1) Class305.anInt3855 += i_14_ << 2;
                    if (i_13_ == 2) Class59_Sub2_Sub2.anInt8685 += i_14_ << 2;
                }
            }
            if (Class286_Sub4.anInt6246 < 0) Class286_Sub4.anInt6246 = 0;
            if (-1 + (Class318_Sub7.anInt6451 << 9) < Class286_Sub4.anInt6246) Class286_Sub4.anInt6246 = -1 + (Class318_Sub7.anInt6451 << 9);
            if (Class59_Sub2_Sub2.anInt8685 < 0) Class59_Sub2_Sub2.anInt8685 = 0;
            if (Class59_Sub2_Sub2.anInt8685 > (Class348_Sub41.anInt7054 << 9) + -1) Class59_Sub2_Sub2.anInt8685 = (Class348_Sub41.anInt7054 << 9) - 1;
            Class348_Sub42_Sub11.method3225(114);
            Class348_Sub42_Sub3.method3175((byte) -107);
            Class348_Sub8.aHa6654.KA(i_1_, i_3_, i_1_ - -i_0_, i_3_ + i_2_);
            Class226.method1626(1, true);
            if (Class59_Sub1.aBoolean5300) {
                Class101_Sub3.method941(124, Class187.anInt2500);
                if (Class132.anInt1906 != Class375.anInt4545) Class348_Sub16_Sub2.aBoolean8870 = true;
                Class375.anInt4545 = Class132.anInt1906;
            } else {
                Class348_Sub8.aHa6654.ya();
                int i_15_ = Class187.anInt2500;
                if (Class259.aClass305_3304 != null) Class259.aClass305_3304.method2293(Class185.anInt2481 << 3, Class348_Sub8.aHa6654, (byte) -72, i_1_, i_0_, i_3_, Class5.anInt4638, Class348_Sub42_Sub19.anInt9701, i_15_, i_2_);
                else Class348_Sub8.aHa6654.GA(i_15_);
            }
            Class369_Sub1.method3570(false);
            if (i >= 80) {
                Class157.aClass101_2123.method903(Class286_Sub4.anInt6246, Class305.anInt3855, Class59_Sub2_Sub2.anInt8685, -Class348_Sub42_Sub19.anInt9701 & 0x3fff, -Class5.anInt4638 & 0x3fff, 0x3fff & -Class338.anInt4186);
                Class348_Sub8.aHa6654.method3638(Class157.aClass101_2123);
                Class348_Sub8.aHa6654.DA(i_0_ / 2 + i_1_, i_3_ + i_2_ / 2, Class97.anInt1550 << 1, Class97.anInt1550 << 1);
                Class30.method319(Class97.anInt1550 << 1, Class97.anInt1550 << 1, (byte) -18, i_1_ + i_0_ / 2, i_3_ + i_2_ / 2);
                Class348_Sub42_Sub20.method3282(0x3fff & -(Class348_Sub42_Sub19.anInt9701), Class59_Sub2_Sub2.anInt8685, Class305.anInt3855, 0, -Class5.anInt4638 & 0x3fff, Class286_Sub4.anInt6246, -Class338.anInt4186 & 0x3fff);
                byte i_16_ = (Class316.aClass348_Sub51_3959.aClass239_Sub14_7264.method1778(-32350) != 2 ? (byte) 1 : (byte) Class239_Sub15.anInt6006);
                if (Class59_Sub1.aBoolean5300) {
                    Class21.method289(-15902, 0x3fff & -Class5.anInt4638, -Class338.anInt4186 & 0x3fff, (-Class348_Sub42_Sub19.anInt9701 & 0x3fff));
                    Class230.method1634(Class64.anIntArray1127, -2, Class289.aByteArrayArrayArray3700, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6388) >> 9, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381) - -1, Class327.anIntArray4097, Class286_Sub4.anInt6246, Class59_Sub2_Sub2.anInt8685, Class316.aClass348_Sub51_3959.aClass239_Sub1_7246.method1720(-32350) == 0, Class305.anInt3855, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6377) >> 9, Class156.anIntArray2117, Class348_Sub40_Sub19.anIntArray9259, i_16_, Class56.anIntArray1045, Class367_Sub11.anInt7396, true, Class132.anInt1906);
                } else
                    Class258_Sub1.method1960(Class367_Sub11.anInt7396, Class286_Sub4.anInt6246, Class305.anInt3855, Class59_Sub2_Sub2.anInt8685, Class289.aByteArrayArrayArray3700, Class327.anIntArray4097, Class156.anIntArray2117, Class348_Sub40_Sub19.anIntArray9259, Class56.anIntArray1045, Class64.anIntArray1127, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381) - -1, i_16_, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6377) >> 9, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anInt6388) >> 9, Class316.aClass348_Sub51_3959.aClass239_Sub1_7246.method1720(-32350) == 0, true, !Class305.aBoolean3870 ? -1 : Class132.anInt1906, 0, false);
                Class369_Sub1.method3570(false);
                if (Class240.anInt4674 == 10) {
                    Class19.method283(-127, i_0_, 256, i_2_, i_1_, i_3_, 256);
                    ha_Sub2.method3802(i_3_, i_2_, 2, i_1_, i_0_, 256, 256);
                    Class318_Sub1_Sub1_Sub2.method2403(i_1_, 256, i_3_, i_0_, 19206, i_2_, 256);
                    Class166.method1289(i_2_, i_0_, i_3_, 8, i_1_);
                }
                Class348_Sub42_Sub11.method3223();
                Class286_Sub4.anInt6246 = i_8_;
                Class348_Sub42_Sub19.anInt9701 = i_11_;
                Class5.anInt4638 = i_12_;
                Class305.anInt3855 = i_9_;
                Class59_Sub2_Sub2.anInt8685 = i_10_;
                if (Class238_Sub1.aBoolean5840 && Class348_Sub4.aClass248_6601.method1902(4) == 0) Class238_Sub1.aBoolean5840 = false;
                if (Class238_Sub1.aBoolean5840) {
                    Class348_Sub8.aHa6654.method3675(i_0_, (byte) -125, i_1_, i_3_, i_2_, -16777216);
                    Class362.method3511(false, Applet_Sub1.aClass324_20, Class246.aClass143_3179, (Class274.aClass274_3495.method2063(Class348_Sub33.anInt6967, 544)), 2, Class348_Sub8.aHa6654);
                }
                Class226.method1626(1, false);
            }
        }
    }

    public final void write(int i) throws IOException {
        anInt96++;
        throw new IOException();
    }

    public static void method133(byte i) {
        anIntArray100 = null;
        anIntArray99 = null;
        aClass110_Sub1Array97 = null;
        if (i != -41) anIntArray99 = null;
        aRandom93 = null;
    }

    static final void method134(byte i) {
        if (i != -126) method132(-95, true, 10, 28, 45, 100);
        if (Class355.anObject4366 == null) {
            Class59_Sub1_Sub1 class59_sub1_sub1 = new Class59_Sub1_Sub1();
            byte[] is = class59_sub1_sub1.method559(128, 128, (byte) 106, 16);
            Class355.anObject4366 = Class179.method1357(is, false, (byte) 111);
        }
        anInt92++;
        if (Class227.anObject2969 == null) {
            Class59_Sub2_Sub2 class59_sub2_sub2 = new Class59_Sub2_Sub2();
            byte[] is = class59_sub2_sub2.method571(128, (byte) -38, 16, 128);
            Class227.anObject2969 = Class179.method1357(is, false, (byte) 106);
        }
    }

    static {
        anIntArray99 = new int[]{1, -1, -1, 1};
    }
}
