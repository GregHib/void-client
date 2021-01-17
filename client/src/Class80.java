/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class80 {
    int anInt1407 = 0;
    private Class197 aClass197_1408;
    private static int[] anIntArray1409;
    private final int[] anIntArray1410 = new int[5];
    private final int[] anIntArray1411 = new int[5];
    private static int[] anIntArray1412;
    private Class197 aClass197_1413;
    private Class197 aClass197_1414;
    private Class197 aClass197_1415;
    private static int[] anIntArray1416 = new int[32768];
    private Class197 aClass197_1417;
    private Class197 aClass197_1418;
    private Class349 aClass349_1419;
    private Class197 aClass197_1420;
    int anInt1421;
    private int anInt1422 = 100;
    private Class197 aClass197_1423;
    private static int[] anIntArray1424;
    private Class197 aClass197_1425;
    private static int[] anIntArray1426;
    private int anInt1427;
    private final int[] anIntArray1428;
    private static int[] anIntArray1429;
    private static int[] anIntArray1430;
    private static int[] anIntArray1431;

    private final int method806(int i, int i_0_, int i_1_) {
        if (i_1_ == 1) {
            if ((i & 0x7fff) < 16384) return i_0_;
            return -i_0_;
        }
        if (i_1_ == 2) return anIntArray1412[i & 0x7fff] * i_0_ >> 14;
        if (i_1_ == 3) return ((i & 0x7fff) * i_0_ >> 14) - i_0_;
        if (i_1_ == 4) return anIntArray1416[i / 2607 & 0x7fff] * i_0_;
        return 0;
    }

    final void method807(Class348_Sub49 class348_sub49) {
        aClass197_1418 = new Class197();
        aClass197_1418.method1452(class348_sub49);
        aClass197_1408 = new Class197();
        aClass197_1408.method1452(class348_sub49);
        int i = class348_sub49.readUnsignedByte(255);
        if (i != 0) {
            class348_sub49.anInt7197--;
            aClass197_1415 = new Class197();
            aClass197_1415.method1452(class348_sub49);
            aClass197_1425 = new Class197();
            aClass197_1425.method1452(class348_sub49);
        }
        i = class348_sub49.readUnsignedByte(255);
        if (i != 0) {
            class348_sub49.anInt7197--;
            aClass197_1413 = new Class197();
            aClass197_1413.method1452(class348_sub49);
            aClass197_1423 = new Class197();
            aClass197_1423.method1452(class348_sub49);
        }
        i = class348_sub49.readUnsignedByte(255);
        if (i != 0) {
            class348_sub49.anInt7197--;
            aClass197_1414 = new Class197();
            aClass197_1414.method1452(class348_sub49);
            aClass197_1420 = new Class197();
            aClass197_1420.method1452(class348_sub49);
        }
        for (int i_2_ = 0; i_2_ < 10; i_2_++) {
            int i_3_ = class348_sub49.method3382(-118);
            if (i_3_ == 0) break;
            anIntArray1410[i_2_] = i_3_;
            anIntArray1411[i_2_] = class348_sub49.method3362((byte) 77);
            anIntArray1428[i_2_] = class348_sub49.method3382(-121);
        }
        anInt1427 = class348_sub49.method3382(-120);
        anInt1422 = class348_sub49.method3382(-122);
        this.anInt1421 = class348_sub49.readShort(842397944);
        this.anInt1407 = class348_sub49.readShort(842397944);
        aClass349_1419 = new Class349();
        aClass197_1417 = new Class197();
        aClass349_1419.method3446(class348_sub49, aClass197_1417);
    }

    public static void method808() {
        anIntArray1409 = null;
        anIntArray1416 = null;
        anIntArray1412 = null;
        anIntArray1431 = null;
        anIntArray1424 = null;
        anIntArray1430 = null;
        anIntArray1429 = null;
        anIntArray1426 = null;
    }

    final int[] method809(int i, int i_4_) {
        Class214.method1573(anIntArray1409, 0, i);
        if (i_4_ < 10) return anIntArray1409;
        double d = (double) i / ((double) i_4_ + 0.0);
        aClass197_1418.method1453();
        aClass197_1408.method1453();
        int i_5_ = 0;
        int i_6_ = 0;
        int i_7_ = 0;
        if (aClass197_1415 != null) {
            aClass197_1415.method1453();
            aClass197_1425.method1453();
            i_5_ = (int) ((double) (aClass197_1415.anInt2606 - aClass197_1415.anInt2607) * 32.768 / d);
            i_6_ = (int) ((double) aClass197_1415.anInt2607 * 32.768 / d);
        }
        int i_8_ = 0;
        int i_9_ = 0;
        int i_10_ = 0;
        if (aClass197_1413 != null) {
            aClass197_1413.method1453();
            aClass197_1423.method1453();
            i_8_ = (int) ((double) (aClass197_1413.anInt2606 - aClass197_1413.anInt2607) * 32.768 / d);
            i_9_ = (int) ((double) aClass197_1413.anInt2607 * 32.768 / d);
        }
        for (int i_11_ = 0; i_11_ < 5; i_11_++) {
            if (anIntArray1410[i_11_] != 0) {
                anIntArray1431[i_11_] = 0;
                anIntArray1424[i_11_] = (int) ((double) anIntArray1428[i_11_] * d);
                anIntArray1430[i_11_] = (anIntArray1410[i_11_] << 14) / 100;
                anIntArray1429[i_11_] = (int) ((double) (aClass197_1418.anInt2606 - aClass197_1418.anInt2607) * 32.768 * Math.pow(1.0057929410678534, anIntArray1411[i_11_]) / d);
                anIntArray1426[i_11_] = (int) ((double) aClass197_1418.anInt2607 * 32.768 / d);
            }
        }
        for (int i_12_ = 0; i_12_ < i; i_12_++) {
            int i_13_ = aClass197_1418.method1451(i);
            int i_14_ = aClass197_1408.method1451(i);
            if (aClass197_1415 != null) {
                int i_15_ = aClass197_1415.method1451(i);
                int i_16_ = aClass197_1425.method1451(i);
                i_13_ += method806(i_7_, i_16_, aClass197_1415.anInt2603) >> 1;
                i_7_ += (i_15_ * i_5_ >> 16) + i_6_;
            }
            if (aClass197_1413 != null) {
                int i_17_ = aClass197_1413.method1451(i);
                int i_18_ = aClass197_1423.method1451(i);
                i_14_ = (i_14_ * ((method806(i_10_, i_18_, aClass197_1413.anInt2603) >> 1) + 32768)) >> 15;
                i_10_ += (i_17_ * i_8_ >> 16) + i_9_;
            }
            for (int i_19_ = 0; i_19_ < 5; i_19_++) {
                if (anIntArray1410[i_19_] != 0) {
                    int i_20_ = i_12_ + anIntArray1424[i_19_];
                    if (i_20_ < i) {
                        anIntArray1409[i_20_] += method806(anIntArray1431[i_19_], i_14_ * anIntArray1430[i_19_] >> 15, (aClass197_1418.anInt2603));
                        anIntArray1431[i_19_] += ((i_13_ * anIntArray1429[i_19_] >> 16) + anIntArray1426[i_19_]);
                    }
                }
            }
        }
        if (aClass197_1414 != null) {
            aClass197_1414.method1453();
            aClass197_1420.method1453();
            int i_21_ = 0;
            boolean bool = false;
            boolean bool_22_ = true;
            for (int i_23_ = 0; i_23_ < i; i_23_++) {
                int i_24_ = aClass197_1414.method1451(i);
                int i_25_ = aClass197_1420.method1451(i);
                int i_26_;
                if (bool_22_) i_26_ = (aClass197_1414.anInt2607 + ((aClass197_1414.anInt2606 - aClass197_1414.anInt2607) * i_24_ >> 8));
                else i_26_ = (aClass197_1414.anInt2607 + ((aClass197_1414.anInt2606 - aClass197_1414.anInt2607) * i_25_ >> 8));
                i_21_ += 256;
                if (i_21_ >= i_26_) {
                    i_21_ = 0;
                    bool_22_ = !bool_22_;
                }
                if (bool_22_) anIntArray1409[i_23_] = 0;
            }
        }
        if (anInt1427 > 0 && anInt1422 > 0) {
            int i_27_ = (int) ((double) anInt1427 * d);
            for (int i_28_ = i_27_; i_28_ < i; i_28_++)
                anIntArray1409[i_28_] += anIntArray1409[i_28_ - i_27_] * anInt1422 / 100;
        }
        if (aClass349_1419.anIntArray4299[0] > 0 || aClass349_1419.anIntArray4299[1] > 0) {
            aClass197_1417.method1453();
            int i_29_ = aClass197_1417.method1451(i + 1);
            int i_30_ = aClass349_1419.method3451(0, (float) i_29_ / 65536.0F);
            int i_31_ = aClass349_1419.method3451(1, (float) i_29_ / 65536.0F);
            if (i >= i_30_ + i_31_) {
                int i_32_ = 0;
                int i_33_ = i_31_;
                if (i_33_ > i - i_30_) i_33_ = i - i_30_;
                for (/**/; i_32_ < i_33_; i_32_++) {
                    int i_34_ = (int) (((long) anIntArray1409[i_32_ + i_30_] * (long) Class349.anInt4303) >> 16);
                    for (int i_35_ = 0; i_35_ < i_30_; i_35_++)
                        i_34_ += (int) (((long) (anIntArray1409[i_32_ + i_30_ - 1 - i_35_]) * (long) (Class349.anIntArrayArray4301[0][i_35_])) >> 16);
                    for (int i_36_ = 0; i_36_ < i_32_; i_36_++)
                        i_34_ -= (int) (((long) anIntArray1409[i_32_ - 1 - i_36_] * (long) (Class349.anIntArrayArray4301[1][i_36_])) >> 16);
                    anIntArray1409[i_32_] = i_34_;
                    i_29_ = aClass197_1417.method1451(i + 1);
                }
                i_33_ = 128;
                for (; ; ) {
                    if (i_33_ > i - i_30_) i_33_ = i - i_30_;
                    for (/**/; i_32_ < i_33_; i_32_++) {
                        int i_37_ = (int) (((long) anIntArray1409[i_32_ + i_30_] * (long) Class349.anInt4303) >> 16);
                        for (int i_38_ = 0; i_38_ < i_30_; i_38_++)
                            i_37_ += (int) (((long) (anIntArray1409[i_32_ + i_30_ - 1 - i_38_]) * (long) (Class349.anIntArrayArray4301[0][i_38_])) >> 16);
                        for (int i_39_ = 0; i_39_ < i_31_; i_39_++)
                            i_37_ -= (int) (((long) (anIntArray1409[i_32_ - 1 - i_39_]) * (long) (Class349.anIntArrayArray4301[1][i_39_])) >> 16);
                        anIntArray1409[i_32_] = i_37_;
                        i_29_ = aClass197_1417.method1451(i + 1);
                    }
                    if (i_32_ >= i - i_30_) break;
                    i_30_ = aClass349_1419.method3451(0, (float) i_29_ / 65536.0F);
                    i_31_ = aClass349_1419.method3451(1, (float) i_29_ / 65536.0F);
                    i_33_ += 128;
                }
                for (/**/; i_32_ < i; i_32_++) {
                    int i_40_ = 0;
                    for (int i_41_ = i_32_ + i_30_ - i; i_41_ < i_30_; i_41_++)
                        i_40_ += (int) (((long) (anIntArray1409[i_32_ + i_30_ - 1 - i_41_]) * (long) (Class349.anIntArrayArray4301[0][i_41_])) >> 16);
                    for (int i_42_ = 0; i_42_ < i_31_; i_42_++)
                        i_40_ -= (int) (((long) anIntArray1409[i_32_ - 1 - i_42_] * (long) (Class349.anIntArrayArray4301[1][i_42_])) >> 16);
                    anIntArray1409[i_32_] = i_40_;
                    i_29_ = aClass197_1417.method1451(i + 1);
                }
            }
        }
        for (int i_43_ = 0; i_43_ < i; i_43_++) {
            if (anIntArray1409[i_43_] < -32768) anIntArray1409[i_43_] = -32768;
            if (anIntArray1409[i_43_] > 32767) anIntArray1409[i_43_] = 32767;
        }
        return anIntArray1409;
    }

    public Class80() {
        this.anInt1421 = 500;
        anIntArray1428 = new int[5];
        anInt1427 = 0;
    }

    static {
        Random random = new Random(0L);
        for (int i = 0; i < 32768; i++)
            anIntArray1416[i] = (random.nextInt() & 0x2) - 1;
        anIntArray1412 = new int[32768];
        for (int i = 0; i < 32768; i++)
            anIntArray1412[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
        anIntArray1409 = new int[220500];
        anIntArray1424 = new int[5];
        anIntArray1426 = new int[5];
        anIntArray1429 = new int[5];
        anIntArray1431 = new int[5];
        anIntArray1430 = new int[5];
    }
}
