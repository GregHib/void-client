/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62 {
    static int anInt1110;
    static int anInt1111;
    static int anInt1112;
    static int anInt1113;
    static Class243 aClass243_1114 = new Class243();
    static int anInt1115;
    static int[][][] anIntArrayArrayArray1116;

    static final Class341[] method596(int i) {
        if (i != 20000)
            anIntArrayArrayArray1116 = null;
        anInt1112++;
        return (new Class341[]
                {Class186_Sub1.aClass341_5808, Class27.aClass341_399,
                        Class237_Sub1.aClass341_5821});
    }

    public static void method597(byte i) {
        aClass243_1114 = null;
        anIntArrayArrayArray1116 = null;
        int i_0_ = -116 / ((6 - i) / 60);
    }

    static final void method598(int i) {
        anInt1111++;
        if (i != 9013)
            method597((byte) 86);
        for (Class348_Sub15 class348_sub15
             = (Class348_Sub15) Class27.aClass356_389.method3484(0);
             class348_sub15 != null;
             class348_sub15
                     = (Class348_Sub15) Class27.aClass356_389.method3482(0)) {
            if (!((Class348_Sub15) class348_sub15).aBoolean6772)
                Class64_Sub3.method690((byte) -94,
                        (((Class348_Sub15) class348_sub15)
                                .anInt6773));
            else
                ((Class348_Sub15) class348_sub15).aBoolean6772 = false;
        }
    }

    static final synchronized long method599(int i) {
        if (i > -52)
            return -121L;
        anInt1113++;
        long l = System.currentTimeMillis();
        if ((l ^ 0xffffffffffffffffL)
                > (Class101_Sub1.aLong5663 ^ 0xffffffffffffffffL))
            Class318_Sub1_Sub1.aLong8728 += Class101_Sub1.aLong5663 - l;
        Class101_Sub1.aLong5663 = l;
        return l + Class318_Sub1_Sub1.aLong8728;
    }

    static final int method600(byte i, int i_1_, int i_2_) {
        anInt1115++;
        int i_3_;
        if (i_2_ <= 20000) {
            if (i_2_ <= 10000) {
                if ((i_2_ ^ 0xffffffff) >= -5001) {
                    Class348_Sub40_Sub12.method3076(0, true);
                    i_3_ = 1;
                } else {
                    i_3_ = 2;
                    Class161.method1263(true);
                }
            } else {
                i_3_ = 3;
                Class47.method447((byte) -59);
            }
        } else {
            Class133.method1140(120);
            i_3_ = 4;
        }
        if ((((Class348_Sub51) Class316.aClass348_Sub51_3959)
                .aClass239_Sub25_7271.method1829(-32350)
                ^ 0xffffffff)
                != (i_1_ ^ 0xffffffff)) {
            Class316.aClass348_Sub51_3959.method3429((byte) 74,
                    (((Class348_Sub51)
                            (Class316
                                    .aClass348_Sub51_3959))
                            .aClass239_Sub25_7251),
                    i_1_);
            Class367_Sub10.method3553(false, (byte) 122, i_1_);
        }
        if (i >= -20)
            aClass243_1114 = null;
        Class14_Sub2.method243(37);
        return i_3_;
    }
}
