/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class292 implements Interface7 {
    static int anInt4797 = 0;
    static Class114 aClass114_4798;
    static int anInt4799;
    static int anInt4800;
    static int anInt4801;
    static int anInt4802;
    static int anInt4803 = -1;
    private Class45 aClass45_4804;
    static int anInt4805;

    static final int method2201(int i) {
        anInt4805++;
        synchronized (Class24.aClass60_355) {
            if (i != 2121)
                method2202(-113);
            return Class24.aClass60_355.method575(0);
        }
    }

    public final int method31(int i) {
        anInt4801++;
        int i_0_ = 16 / ((i - -43) / 62);
        if (aClass45_4804.method401(125))
            return 100;
        return aClass45_4804.method398((byte) -31);
    }

    public static void method2202(int i) {
        aClass114_4798 = null;
        if (i != -17902)
            anInt4803 = 78;
    }

    public final Class69 method32(int i) {
        if (i != -15004)
            return null;
        anInt4800++;
        return Class69.aClass69_1195;
    }

    static final boolean method2203(byte i) {
        int i_1_ = 11 % ((12 - i) / 53);
        anInt4802++;
        try {
            return Class348_Sub42_Sub8_Sub2.method3201(true);
        } catch (java.io.IOException ioexception) {
            Class272.method2049(106);
            return true;
        } catch (Exception exception) {
            String string
                    = ("T2 - "
                    + (Class348_Sub3.aClass114_6584 != null
                    ? Class348_Sub3.aClass114_6584.method1058((byte) 119)
                    : -1)
                    + ","
                    + (Class239.aClass114_3145 != null
                    ? Class239.aClass114_3145.method1058((byte) 119) : -1)
                    + ","
                    + (Class348_Sub40_Sub36.aClass114_9456 == null ? -1
                    : Class348_Sub40_Sub36.aClass114_9456
                    .method1058((byte) 113))
                    + " - " + Class348_Sub40_Sub25.anInt9341 + ","
                    + ((((Class318_Sub1_Sub3_Sub3)
                    Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907)
                    .anIntArray10320[0])
                    + za_Sub2.anInt9780)
                    + ","
                    + (Class90.anInt1517
                    - -(((Class318_Sub1_Sub3_Sub3)
                    Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907)
                    .anIntArray10317[0]))
                    + " - ");
            for (int i_2_ = 0;
                 Class348_Sub40_Sub25.anInt9341 > i_2_ && i_2_ < 50; i_2_++)
                string
                        += (((Class348_Sub49) Class299.aClass348_Sub49_Sub2_3813)
                        .aByteArray7154[i_2_]) + ",";
            Class156.method1242(string, exception, 15004);
            Class348_Sub40_Sub34.method3141(false, (byte) 11);
            return true;
        }
    }

    Class292(Class45 class45) {
        aClass45_4804 = class45;
    }

    static {
        aClass114_4798 = new Class114(29, 7);
    }
}
