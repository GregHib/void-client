/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class203 {
    static int anInt2672;
    static int anInt2673;
    static volatile boolean aBoolean2674 = false;
    static int anInt2675;

    static final void method1477(int i, int i_0_) {
        anInt2672++;
        Class348_Sub42_Sub15 class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, (byte) 105, i_0_);
        class348_sub42_sub15.method3251(-16058);
    }

    static final Class348_Sub47 method1478(boolean bool) {
        anInt2673++;
        Class348_Sub47 class348_sub47 = Class300.method2273((byte) -103);
        if (bool != true) return null;
        class348_sub47.anInt7122 = 0;
        class348_sub47.aClass351_7118 = null;
        class348_sub47.aClass348_Sub49_Sub2_7116 = new Class348_Sub49_Sub2(5000);
        return class348_sub47;
    }

    static final void method1479(int i, byte i_1_, int i_2_, int i_3_) {
        anInt2675++;
        int i_4_ = i_2_ - -za_Sub2.anInt9780;
        int i_5_ = Class90.anInt1517 + i;
        if (Class147.aClass357ArrayArrayArray2029 != null && i_2_ >= 0 && i >= 0 && Class367_Sub4.anInt7319 > i_2_ && Class348_Sub40_Sub3.anInt9109 > i && (Class316.aClass348_Sub51_3959.aClass239_Sub27_7261.method1840(-32350) != 0 || i_3_ == (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aByte6381))) {
            long l = i_5_ << 14 | i_3_ << 28 | i_4_;
            Class348_Sub37 class348_sub37 = ((Class348_Sub37) Class130.aClass356_1895.method3480(l, -6008));
            if (class348_sub37 == null) Class282.method2110(i_3_, i_2_, i);
            else {
                Class348_Sub34 class348_sub34 = (Class348_Sub34) class348_sub37.aClass262_6998.method1995(4);
                if (class348_sub34 == null) Class282.method2110(i_3_, i_2_, i);
                else {
                    Class318_Sub1_Sub2_Sub1 class318_sub1_sub2_sub1 = ((Class318_Sub1_Sub2_Sub1) Class282.method2110(i_3_, i_2_, i));
                    if (class318_sub1_sub2_sub1 == null) class318_sub1_sub2_sub1 = (new Class318_Sub1_Sub2_Sub1(i_2_ << 9, aa_Sub1.aSArray5191[i_3_].method3982((byte) -86, i, i_2_), i << 9, i_3_, i_3_));
                    else class318_sub1_sub2_sub1.anInt10189 = class318_sub1_sub2_sub1.anInt10180 = -1;
                    class318_sub1_sub2_sub1.anInt10181 = class348_sub34.anInt6973;
                    if (i_1_ >= -112) aBoolean2674 = true;
                    class318_sub1_sub2_sub1.anInt10185 = class348_sub34.anInt6971;
                    for (; ; ) {
                        Class348_Sub34 class348_sub34_6_ = ((Class348_Sub34) class348_sub37.aClass262_6998.method1990((byte) 55));
                        if (class348_sub34_6_ == null) break;
                        if (class348_sub34_6_.anInt6973 != class318_sub1_sub2_sub1.anInt10181) {
                            class318_sub1_sub2_sub1.anInt10189 = (class348_sub34_6_.anInt6973);
                            class318_sub1_sub2_sub1.anInt10190 = (class348_sub34_6_.anInt6971);
                            for (; ; ) {
                                Class348_Sub34 class348_sub34_7_ = ((Class348_Sub34) class348_sub37.aClass262_6998.method1990((byte) 55));
                                if (class348_sub34_7_ == null) break;
                                if ((class318_sub1_sub2_sub1.anInt10181 != (class348_sub34_7_.anInt6973)) && ((class318_sub1_sub2_sub1.anInt10189) != (class348_sub34_7_.anInt6973))) {
                                    class318_sub1_sub2_sub1.anInt10180 = (class348_sub34_7_.anInt6973);
                                    class318_sub1_sub2_sub1.anInt10186 = (class348_sub34_7_.anInt6971);
                                }
                            }
                            break;
                        }
                    }
                    int i_8_ = Class275.method2064(256 + (i_2_ << 9), i_3_, 11219, 256 + (i << 9));
                    class318_sub1_sub2_sub1.anInt6388 = i << 9;
                    class318_sub1_sub2_sub1.aByte6381 = (byte) i_3_;
                    class318_sub1_sub2_sub1.anInt10196 = 0;
                    class318_sub1_sub2_sub1.anInt6377 = i_2_ << 9;
                    class318_sub1_sub2_sub1.anInt6382 = i_8_;
                    class318_sub1_sub2_sub1.aByte6376 = (byte) i_3_;
                    if (Class79.method802(i, i_2_, true)) class318_sub1_sub2_sub1.aByte6376++;
                    Class367_Sub2.method3536(i_3_, i_2_, i, i_8_, class318_sub1_sub2_sub1);
                }
            }
        }
    }
}
