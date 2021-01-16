/* Class110_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class110_Sub1 extends Class110 {
    int anInt5786;
    String aString5787;
    int anInt5788 = -1;
    static int anInt5789;
    static int anInt5790;
    static float[] aFloatArray5791 = new float[4];
    static int anInt5792;
    static int anInt5793;
    String aString5794;

    final Class283 method1038(boolean bool) {
        if (bool != false)
            method1040(-125);
        anInt5789++;
        return Class373_Sub2.aClass283Array7446[this.anInt1711];
    }

    static final String method1039(String string, boolean bool) {
        anInt5793++;
        StringBuffer stringbuffer = new StringBuffer();
        int i = string.length();
        if (bool != true)
            aFloatArray5791 = null;
        for (int i_0_ = 0; i > i_0_; i_0_++) {
            char c = string.charAt(i_0_);
            if (c == 37
                    && i > 2 + i_0_) {
                int i_1_ = string.charAt(i_0_ + 1);
                boolean bool_2_ = false;
                int i_3_;
                if (i_1_ < 48 || i_1_ > 57) {
                    if (i_1_ < 97 || i_1_ > 102) {
                        if (i_1_ >= 65 && i_1_ <= 70)
                            i_3_ = -55 + i_1_;
                        else {
                            stringbuffer.append('%');
                            continue;
                        }
                    } else
                        i_3_ = -97 + (10 + i_1_);
                } else
                    i_3_ = i_1_ - 48;
                i_1_ = string.charAt(i_0_ + 2);
                i_3_ *= 16;
                if (i_1_ >= 48 && i_1_ <= 57)
                    i_3_ += i_1_ - 48;
                else if (i_1_ < 97 || i_1_ > 102) {
                    if (i_1_ >= 65 && i_1_ <= 70)
                        i_3_ += -65 + (10 + i_1_);
                    else {
                        stringbuffer.append('%');
                        continue;
                    }
                } else
                    i_3_ += 10 + (i_1_ - 97);
                if (i_3_ != 0
                        && Class239_Sub3.method1732((byte) i_3_, -129))
                    stringbuffer.append(Class50_Sub1.method462((byte) i_3_,
                            -128));
                i_0_ += 2;
            } else if (c != 43)
                stringbuffer.append(c);
            else
                stringbuffer.append(' ');
        }
        return stringbuffer.toString();
    }

    public static void method1040(int i) {
        if (i == 512)
            aFloatArray5791 = null;
    }

    static final void method1041
            (int i, Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3) {
        anInt5790++;
        boolean bool = false;
        if ((Class367_Sub11.anInt7396
                != class318_sub1_sub3_sub3.anInt10300)
                && class318_sub1_sub3_sub3.anInt10286 != -1
                && class318_sub1_sub3_sub3.anInt10218 == 0) {
            Class17 class17
                    = Class10.aClass87_191.method835((class318_sub1_sub3_sub3
                            .anInt10286),
                    i + 8);
            if (class17.aBoolean241
                    || ((class17.anIntArray267
                    [(class318_sub1_sub3_sub3
                    .anInt10267)]) < 1 + (class318_sub1_sub3_sub3
                    .anInt10232)))
                bool = true;
        } else
            bool = true;
        if (bool) {
            int i_4_ = ((class318_sub1_sub3_sub3
                    .anInt10300)
                    + -(class318_sub1_sub3_sub3
                    .anInt10239));
            int i_5_ = (Class367_Sub11.anInt7396
                    + -(class318_sub1_sub3_sub3
                    .anInt10239));
            int i_6_ = ((class318_sub1_sub3_sub3
                    .anInt10293) * 512
                    + 256 * class318_sub1_sub3_sub3.method2436((byte) 90));
            int i_7_
                    = (512 * (class318_sub1_sub3_sub3
                    .anInt10314)
                    - -(class318_sub1_sub3_sub3.method2436((byte) 44) * 256));
            int i_8_
                    = (512 * (class318_sub1_sub3_sub3
                    .anInt10241)
                    + 256 * class318_sub1_sub3_sub3.method2436((byte) 98));
            int i_9_
                    = ((class318_sub1_sub3_sub3
                    .anInt10288) * 512
                    - -(class318_sub1_sub3_sub3.method2436((byte) 76) * 256));
            class318_sub1_sub3_sub3.anInt6377
                    = (i_8_ * i_5_ + (i_4_ - i_5_) * i_6_) / i_4_;
            class318_sub1_sub3_sub3.anInt6388
                    = (i_7_ * (-i_5_ + i_4_) - -(i_5_ * i_9_)) / i_4_;
        }
        class318_sub1_sub3_sub3.anInt10326 = 0;
        if ((class318_sub1_sub3_sub3.anInt10231
                ^ 0xffffffff)
                == i)
            class318_sub1_sub3_sub3.method2435((byte) -108, 8192, false);
        if (class318_sub1_sub3_sub3.anInt10231 == 1)
            class318_sub1_sub3_sub3.method2435((byte) -108, 12288, false);
        if (class318_sub1_sub3_sub3.anInt10231 == 2)
            class318_sub1_sub3_sub3.method2435((byte) -108, 0, false);
        if (class318_sub1_sub3_sub3.anInt10231
                == 3)
            class318_sub1_sub3_sub3.method2435((byte) -108, 4096, false);
    }

    static final void method1042(byte i) {
        anInt5792++;
        Class177.anInt4666 = Class86.anInt1482 = Class227.anInt2968
                = za_Sub1.anInt9776 = 0;
        int i_10_ = 58 % ((i - -66) / 39);
    }
}
