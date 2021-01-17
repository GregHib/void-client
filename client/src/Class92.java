/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class92 {
    static int anInt1524;
    static Interface4[] anInterface4Array1525;
    static int anInt1526;
    static int anInt1527;
    static float[] aFloatArray1528 = {0.0F, -1.0F, 0.0F, 0.0F};

    static final void method858(boolean bool, Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2) {
        anInt1526++;
        Class348_Sub9 class348_sub9 = ((Class348_Sub9) (Class348_Sub42_Sub16_Sub2.aClass356_10465.method3480(class318_sub1_sub3_sub3_sub2.anInt10290, -6008)));
        if (bool == true) {
            if (class348_sub9 == null) Class223.method1614(979190089, null, class318_sub1_sub3_sub3_sub2.aByte6381, (class318_sub1_sub3_sub3_sub2.anIntArray10317[0]), (class318_sub1_sub3_sub3_sub2.anIntArray10320[0]), class318_sub1_sub3_sub3_sub2, null, 0);
            else class348_sub9.method2781((byte) 21);
        }
    }

    static final void method859(int i) {
        anInt1527++;
        int i_0_ = Class348_Sub50.aByteArrayArray7212.length;
        if (i < -125) {
            for (int i_1_ = 0; i_0_ > i_1_; i_1_++) {
                if (Class348_Sub50.aByteArrayArray7212[i_1_] != null) {
                    int i_2_ = -1;
                    for (int i_3_ = 0; i_3_ < Class27.anInt388; i_3_++) {
                        if (Class342.anIntArray4250[i_3_] == Class348_Sub23_Sub3.anIntArray9042[i_1_]) {
                            i_2_ = i_3_;
                            break;
                        }
                    }
                    if (i_2_ == -1) {
                        Class342.anIntArray4250[Class27.anInt388] = Class348_Sub23_Sub3.anIntArray9042[i_1_];
                        i_2_ = Class27.anInt388++;
                    }
                    Class348_Sub49 class348_sub49 = new Class348_Sub49(Class348_Sub50.aByteArrayArray7212[i_1_]);
                    int i_4_ = 0;
                    while (class348_sub49.anInt7197 < Class348_Sub50.aByteArrayArray7212[i_1_].length) {
                        if (i_4_ >= 511 || Class150.anInt2057 >= 1023) break;
                        int i_5_ = i_2_ | i_4_++ << 6;
                        int i_6_ = class348_sub49.readShort(842397944);
                        int i_7_ = i_6_ >> 14;
                        int i_8_ = 0x3f & i_6_ >> 7;
                        int i_9_ = i_6_ & 0x3f;
                        int i_10_ = (i_8_ + (-za_Sub2.anInt9780 + (Class348_Sub23_Sub3.anIntArray9042[i_1_] >> 8) * 64));
                        int i_11_ = (-Class90.anInt1517 + (64 * (0xff & (Class348_Sub23_Sub3.anIntArray9042[i_1_])) - -i_9_));
                        Class79 class79 = (Class189.aClass278_2529.method2079(class348_sub49.readShort(842397944), -1));
                        Class348_Sub22 class348_sub22 = ((Class348_Sub22) Class282.aClass356_3654.method3480(i_5_, -6008));
                        if (class348_sub22 == null && (class79.aByte1325 & 0x1) > 0 && i_7_ == Class167.anInt2204 && i_10_ >= 0 && (Class367_Sub4.anInt7319 > i_10_ - -class79.anInt1399) && i_11_ >= 0 && (Class348_Sub40_Sub3.anInt9109 > i_11_ + class79.anInt1399)) {
                            Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = new Class318_Sub1_Sub3_Sub3_Sub1();
                            class318_sub1_sub3_sub3_sub1.anInt10290 = i_5_;
                            Class348_Sub22 class348_sub22_12_ = (new Class348_Sub22(class318_sub1_sub3_sub3_sub1));
                            Class282.aClass356_3654.method3483((byte) 91, i_5_, class348_sub22_12_);
                            Class348_Sub40_Sub23.aClass348_Sub22Array9319[Class348_Sub32.anInt6930++] = class348_sub22_12_;
                            Class74.anIntArray1233[Class150.anInt2057++] = i_5_;
                            class318_sub1_sub3_sub3_sub1.anInt10306 = Class367_Sub11.anInt7396;
                            class318_sub1_sub3_sub3_sub1.method2448(class79, -2);
                            class318_sub1_sub3_sub3_sub1.method2434((byte) 120, class318_sub1_sub3_sub3_sub1.aClass79_10505.anInt1399);
                            class318_sub1_sub3_sub3_sub1.anInt10310 = (class318_sub1_sub3_sub3_sub1.aClass79_10505.anInt1329 << 3);
                            class318_sub1_sub3_sub3_sub1.method2435((byte) -108, (class318_sub1_sub3_sub3_sub1.aClass79_10505.aByte1355 - -4 & ~0x631ffff8) << 11, true);
                            class318_sub1_sub3_sub3_sub1.method2444(i_11_, true, i_10_, 123, class318_sub1_sub3_sub3_sub1.method2436((byte) 54), i_7_);
                        }
                    }
                }
            }
        }
    }

    public static void method860(byte i) {
        anInterface4Array1525 = null;
        if (i > 43) aFloatArray1528 = null;
    }

    static {
        anInt1524 = 765;
    }
}
