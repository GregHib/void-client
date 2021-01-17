/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class189 {
    static int anInt2521;
    boolean aBoolean2522 = false;
    static int anInt2523 = 0;
    static int anInt2524;
    int anInt2525;
    int anInt2526;
    static Class114 aClass114_2527 = new Class114(98, -2);
    static int anInt2528;
    static Class278 aClass278_2529;
    int anInt2530;
    boolean aBoolean2531 = false;
    static int anInt2532;
    int anInt2533 = 1;
    int anInt2534;

    private final void method1418(int i, int i_0_, Class348_Sub49 class348_sub49, byte i_1_) {
        if (i_1_ != 94) this.anInt2526 = -81;
        anInt2532++;
        if (i == 1) {
            this.anInt2525 = class348_sub49.readShort(842397944);
            if (this.anInt2525 == 65535) this.anInt2525 = -1;
        } else if (i == 2) {
            this.anInt2526 = 1 + class348_sub49.readShort(842397944);
            this.anInt2530 = class348_sub49.readShort(842397944) - -1;
        } else if (i != 3) {
            if (i == 4) this.anInt2534 = class348_sub49.readUnsignedByte(255);
            else if (i != 5) {
                if (i == 6) this.aBoolean2522 = true;
                else if (i == 7) this.aBoolean2531 = true;
            } else this.anInt2533 = class348_sub49.readUnsignedByte(255);
        } else class348_sub49.method3388(-106);
    }

    final void method1419(int i, Class348_Sub49 class348_sub49, byte i_2_) {
        anInt2528++;
        int i_3_ = 93 / ((i_2_ - -24) / 55);
        for (; ; ) {
            int i_4_ = class348_sub49.readUnsignedByte(255);
            if (i_4_ == 0) break;
            method1418(i_4_, i, class348_sub49, (byte) 94);
        }
    }

    static final boolean method1420(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, Class361 class361, int i_13_, int i_14_) {
        anInt2521++;
        int i_15_ = i_10_;
        int i_16_ = i_7_;
        int i_17_ = 64;
        int i_18_ = 64;
        int i_19_ = i_10_ - i_17_;
        if (i_6_ >= -65) method1420(115, 22, 74, 19, 100, -62, 111, 76, 26, null, -41, -28);
        r.anIntArrayArray9723[i_17_][i_18_] = 99;
        int i_20_ = i_7_ + -i_18_;
        Class223.anIntArrayArray2900[i_17_][i_18_] = 0;
        int i_21_ = 0;
        Class367_Sub11.anIntArray7397[i_21_] = i_15_;
        int i_22_ = 0;
        Class205.anIntArray2694[i_21_++] = i_16_;
        int[][] is = class361.anIntArrayArray4438;
        while_56_:
        while (i_22_ != i_21_) {
            i_16_ = Class205.anIntArray2694[i_22_];
            i_15_ = Class367_Sub11.anIntArray7397[i_22_];
            i_17_ = i_15_ + -i_19_;
            i_18_ = -i_20_ + i_16_;
            i_22_ = 0xfff & i_22_ - -1;
            int i_23_ = i_15_ - class361.anInt4453;
            int i_24_ = i_16_ - class361.anInt4441;
            int i_25_ = i_13_;
            while_48_:
            do {
                while_47_:
                do {
                    while_46_:
                    do {
                        while_45_:
                        do {
                            do {
                                if (i_25_ == -4) {
                                    if (i_15_ == i_9_ && (i_16_ == i_14_)) {
                                        Class348_Sub40_Sub30.anInt9388 = i_15_;
                                        Class115.anInt1753 = i_16_;
                                        return true;
                                    }
                                    break while_48_;
                                } else if (i_25_ != -3) {
                                    if (i_25_ != -2) {
                                        if (i_25_ != -1) {
                                            if (i_25_ == 0 || i_25_ == 1 || i_25_ == 2 || i_25_ == 3 || i_25_ == 9) break while_46_;
                                            break while_47_;
                                        }
                                    } else break;
                                    break while_45_;
                                }
                                if (Class239_Sub28.method1842(i, i_14_, -1, i_12_, i_15_, i_16_, i_9_, i_12_, i_8_)) {
                                    Class115.anInt1753 = i_16_;
                                    Class348_Sub40_Sub30.anInt9388 = i_15_;
                                    return true;
                                }
                                break while_48_;
                            } while (false);
                            if (class361.method3497(-28388, i_9_, i_11_, i_12_, i_8_, i_15_, i_12_, i_16_, i_14_, i)) {
                                Class348_Sub40_Sub30.anInt9388 = i_15_;
                                Class115.anInt1753 = i_16_;
                                return true;
                            }
                            break while_48_;
                        } while (false);
                        if (class361.method3503(i_15_, (byte) -98, i_14_, i_12_, i_8_, i, i_11_, i_16_, i_9_)) {
                            Class348_Sub40_Sub30.anInt9388 = i_15_;
                            Class115.anInt1753 = i_16_;
                            return true;
                        }
                        break while_48_;
                    } while (false);
                    if (class361.method3495(i_9_, i_16_, i_12_, i_5_, i_15_, i_14_, i_13_, -71)) {
                        Class348_Sub40_Sub30.anInt9388 = i_15_;
                        Class115.anInt1753 = i_16_;
                        return true;
                    }
                    break while_48_;
                } while (false);
                if (class361.method3504(i_14_, i_16_, i_9_, i_15_, i_13_, 1, i_5_, i_12_)) {
                    Class115.anInt1753 = i_16_;
                    Class348_Sub40_Sub30.anInt9388 = i_15_;
                    return true;
                }
            } while (false);
            i_25_ = Class223.anIntArrayArray2900[i_17_][i_18_] + 1;
            while_49_:
            do {
                if (i_17_ > 0 && r.anIntArrayArray9723[-1 + i_17_][i_18_] == 0 && (is[-1 + i_23_][i_24_] & 0x43a40000) == 0 && ((is[-1 + i_23_][-1 + i_12_ + i_24_] & 0x4e240000) == 0)) {
                    for (int i_26_ = 1; -1 + i_12_ > i_26_; i_26_++) {
                        if ((is[i_23_ - 1][i_26_ + i_24_] & 0x4fa40000) != 0) break while_49_;
                    }
                    Class367_Sub11.anIntArray7397[i_21_] = i_15_ - 1;
                    Class205.anIntArray2694[i_21_] = i_16_;
                    i_21_ = i_21_ - -1 & 0xfff;
                    r.anIntArrayArray9723[i_17_ - 1][i_18_] = 2;
                    Class223.anIntArrayArray2900[-1 + i_17_][i_18_] = i_25_;
                }
            } while (false);
            while_50_:
            do {
                if (i_17_ < -i_12_ + 128 && r.anIntArrayArray9723[i_17_ + 1][i_18_] == 0 && (is[i_23_ + i_12_][i_24_] & 0x60e40000) == 0 && ((is[i_12_ + i_23_][-1 + (i_24_ - -i_12_)] & 0x78240000) == 0)) {
                    for (int i_27_ = 1; i_12_ - 1 > i_27_; i_27_++) {
                        if ((is[i_12_ + i_23_][i_24_ - -i_27_] & 0x78e40000) != 0) break while_50_;
                    }
                    Class367_Sub11.anIntArray7397[i_21_] = 1 + i_15_;
                    Class205.anIntArray2694[i_21_] = i_16_;
                    r.anIntArrayArray9723[1 + i_17_][i_18_] = 8;
                    i_21_ = 0xfff & i_21_ - -1;
                    Class223.anIntArrayArray2900[i_17_ + 1][i_18_] = i_25_;
                }
            } while (false);
            while_51_:
            do {
                if (i_18_ > 0 && r.anIntArrayArray9723[i_17_][-1 + i_18_] == 0 && (0x43a40000 & is[i_23_][i_24_ - 1]) == 0 && (0x60e40000 & is[-1 + (i_23_ + i_12_)][i_24_ - 1]) == 0) {
                    for (int i_28_ = 1; i_12_ - 1 > i_28_; i_28_++) {
                        if ((0x63e40000 & is[i_23_ - -i_28_][-1 + i_24_]) != 0) break while_51_;
                    }
                    Class367_Sub11.anIntArray7397[i_21_] = i_15_;
                    Class205.anIntArray2694[i_21_] = -1 + i_16_;
                    r.anIntArrayArray9723[i_17_][-1 + i_18_] = 1;
                    i_21_ = 0xfff & 1 + i_21_;
                    Class223.anIntArrayArray2900[i_17_][-1 + i_18_] = i_25_;
                }
            } while (false);
            while_52_:
            do {
                if (i_18_ < -i_12_ + 128 && (r.anIntArrayArray9723[i_17_][1 + i_18_] == 0) && ((0x4e240000 & is[i_23_][i_24_ - -i_12_]) == 0) && ((0x78240000 & is[-1 + i_12_ + i_23_][i_24_ + i_12_]) == 0)) {
                    for (int i_29_ = 1; -1 + i_12_ > i_29_; i_29_++) {
                        if ((0x7e240000 & is[i_23_ + i_29_][i_12_ + i_24_]) != 0) break while_52_;
                    }
                    Class367_Sub11.anIntArray7397[i_21_] = i_15_;
                    Class205.anIntArray2694[i_21_] = i_16_ - -1;
                    r.anIntArrayArray9723[i_17_][1 + i_18_] = 4;
                    i_21_ = i_21_ - -1 & 0xfff;
                    Class223.anIntArrayArray2900[i_17_][i_18_ + 1] = i_25_;
                }
            } while (false);
            while_53_:
            do {
                if (i_17_ > 0 && i_18_ > 0 && r.anIntArrayArray9723[i_17_ - 1][-1 + i_18_] == 0 && ((is[i_23_ + -1][-1 + i_24_] & 0x43a40000) == 0)) {
                    for (int i_30_ = 1; i_12_ > i_30_; i_30_++) {
                        if ((0x4fa40000 & is[-1 + i_23_][i_24_ + (-1 + i_30_)]) != 0 || (0x63e40000 & is[i_23_ - (1 + -i_30_)][i_24_ - 1]) != 0) break while_53_;
                    }
                    Class367_Sub11.anIntArray7397[i_21_] = i_15_ - 1;
                    Class205.anIntArray2694[i_21_] = -1 + i_16_;
                    i_21_ = 1 + i_21_ & 0xfff;
                    r.anIntArrayArray9723[i_17_ - 1][-1 + i_18_] = 3;
                    Class223.anIntArrayArray2900[i_17_ + -1][-1 + i_18_] = i_25_;
                }
            } while (false);
            while_54_:
            do {
                if (128 - i_12_ > i_17_ && i_18_ > 0 && r.anIntArrayArray9723[1 + i_17_][i_18_ + -1] == 0 && (0x60e40000 & is[i_23_ + i_12_][-1 + i_24_]) == 0) {
                    for (int i_31_ = 1; i_12_ > i_31_; i_31_++) {
                        if ((0x78e40000 & is[i_23_ - -i_12_][i_31_ + (i_24_ - 1)]) != 0 || ((is[i_23_ + i_31_][-1 + i_24_] & 0x63e40000) != 0)) break while_54_;
                    }
                    Class367_Sub11.anIntArray7397[i_21_] = i_15_ - -1;
                    Class205.anIntArray2694[i_21_] = -1 + i_16_;
                    r.anIntArrayArray9723[1 + i_17_][-1 + i_18_] = 9;
                    i_21_ = 0xfff & i_21_ - -1;
                    Class223.anIntArrayArray2900[1 + i_17_][-1 + i_18_] = i_25_;
                }
            } while (false);
            while_55_:
            do {
                if (i_17_ > 0 && i_18_ < -i_12_ + 128 && r.anIntArrayArray9723[-1 + i_17_][1 + i_18_] == 0 && (is[i_23_ - 1][i_12_ + i_24_] & 0x4e240000) == 0) {
                    for (int i_32_ = 1; i_32_ < i_12_; i_32_++) {
                        if ((is[-1 + i_23_][i_32_ + i_24_] & 0x4fa40000) != 0 || (is[i_32_ + (i_23_ + -1)][i_24_ - -i_12_] & 0x7e240000) != 0) break while_55_;
                    }
                    Class367_Sub11.anIntArray7397[i_21_] = i_15_ - 1;
                    Class205.anIntArray2694[i_21_] = i_16_ - -1;
                    r.anIntArrayArray9723[i_17_ - 1][i_18_ - -1] = 6;
                    i_21_ = i_21_ - -1 & 0xfff;
                    Class223.anIntArrayArray2900[-1 + i_17_][i_18_ - -1] = i_25_;
                }
            } while (false);
            if (i_17_ < 128 + -i_12_ && i_18_ < 128 + -i_12_ && (r.anIntArrayArray9723[i_17_ + 1][1 + i_18_] == 0) && (0x78240000 & is[i_12_ + i_23_][i_24_ + i_12_]) == 0) {
                for (int i_33_ = 1; i_12_ > i_33_; i_33_++) {
                    if ((0x7e240000 & is[i_23_ + i_33_][i_24_ - -i_12_]) != 0 || ((is[i_12_ + i_23_][i_24_ - -i_33_] & 0x78e40000) != 0)) continue while_56_;
                }
                Class367_Sub11.anIntArray7397[i_21_] = i_15_ - -1;
                Class205.anIntArray2694[i_21_] = i_16_ - -1;
                i_21_ = 0xfff & 1 + i_21_;
                r.anIntArrayArray9723[i_17_ - -1][1 + i_18_] = 12;
                Class223.anIntArrayArray2900[i_17_ + 1][i_18_ - -1] = i_25_;
            }
        }
        Class115.anInt1753 = i_16_;
        Class348_Sub40_Sub30.anInt9388 = i_15_;
        return false;
    }

    public static void method1421(byte i) {
        aClass278_2529 = null;
        if (i != -85) method1421((byte) 39);
        aClass114_2527 = null;
    }

    public Class189() {
        this.anInt2526 = 64;
        this.anInt2530 = 64;
        this.anInt2525 = -1;
        this.anInt2534 = 2;
    }
}
