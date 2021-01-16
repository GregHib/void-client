/* Class348_Sub42_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Date;

final class Class348_Sub42_Sub16_Sub1 extends Class348_Sub42_Sub16 {
    static int anInt10447 = -1;
    static int anInt10448;
    byte aByte10449;
    static boolean aBoolean10450;
    static int anInt10451;
    static int anInt10452;
    Class348_Sub49 aClass348_Sub49_10453;
    static int anInt10454;
    static int anInt10455;
    int anInt10456;

    final byte[] method3259(int i) {
        anInt10454++;
        if (i != 16)
            return null;
        if (this.aBoolean9664 || (this.aClass348_Sub49_10453.anInt7197
                < (-this.aByte10449 + (this.aClass348_Sub49_10453.aByteArray7154).length)))
            throw new RuntimeException();
        return (this.aClass348_Sub49_10453
                .aByteArray7154);
    }

    static final void method3260(int i) {
        for (Class348_Sub15 class348_sub15
             = (Class348_Sub15) Class27.aClass356_389.method3484(0);
             class348_sub15 != null;
             class348_sub15
                     = (Class348_Sub15) Class27.aClass356_389.method3482(0)) {
            if (class348_sub15.aClass55_Sub1_6768
                    .method510((byte) -125))
                Class64_Sub3.method690((byte) 70,
                        (class348_sub15
                                .anInt6773));
            else {
                class348_sub15.aClass55_Sub1_6768
                        .method522((byte) -91);
                try {
                    class348_sub15.aClass55_Sub1_6768
                            .method517(-2);
                } catch (Exception exception) {
                    Class156.method1242("TV: " + class348_sub15.anInt6773,
                            exception, 15004);
                    Class64_Sub3.method690((byte) 15,
                            (class348_sub15
                                    .anInt6773));
                }
                if (!class348_sub15.aBoolean6783
                        && !class348_sub15.aBoolean6781) {
                    Class348_Sub23_Sub1 class348_sub23_sub1
                            = class348_sub15
                            .aClass55_Sub1_6768.method512(0);
                    if (class348_sub23_sub1 != null) {
                        Class348_Sub16_Sub2 class348_sub16_sub2
                                = class348_sub23_sub1.method2971(-61);
                        if (class348_sub16_sub2 != null) {
                            class348_sub16_sub2.method2827(-17708,
                                    (class348_sub15
                                            .anInt6782));
                            Class348_Sub43.aClass348_Sub16_Sub4_7065
                                    .method2883(class348_sub16_sub2);
                            class348_sub15.aBoolean6783
                                    = true;
                        }
                    }
                }
            }
        }
        int i_0_ = 48 % ((-17 - i) / 63);
        anInt10448++;
    }

    static final String method3261(long l, int i) {
        try {
            Class286_Sub3.aCalendar6221.setTime(new Date(l));
            anInt10455++;
            int i_1_ = Class286_Sub3.aCalendar6221.get(7);
            int i_2_ = Class286_Sub3.aCalendar6221.get(5);
            if (i <= 53)
                aBoolean10450 = false;
            int i_3_ = Class286_Sub3.aCalendar6221.get(2);
            int i_4_ = Class286_Sub3.aCalendar6221.get(1);
            int i_5_ = Class286_Sub3.aCalendar6221.get(11);
            int i_6_ = Class286_Sub3.aCalendar6221.get(12);
            int i_7_ = Class286_Sub3.aCalendar6221.get(13);
            return (Class93.aStringArray1531[i_1_ - 1] + ", " + i_2_ / 10
                    + i_2_ % 10 + "-" + Class331.aStringArray4129[i_3_] + "-"
                    + i_4_ + " " + i_5_ / 10 + i_5_ % 10 + ":" + i_6_ / 10
                    + i_6_ % 10 + ":" + i_7_ / 10 + i_7_ % 10 + " GMT");
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "mba.I(" + l + ',' + i + ')');
        }
    }

    final int method3257(int i) {
        if (i != 16)
            this.aByte10449 = (byte) -4;
        anInt10452++;
        if (this.aClass348_Sub49_10453 == null)
            return 0;
        return (100
                * this
                .aClass348_Sub49_10453.anInt7197
                / (-this.aByte10449
                + (this
                .aClass348_Sub49_10453
                .aByteArray7154).length));
    }

    static final boolean method3262(int i, int i_8_, int i_9_) {
        if (i_9_ <= 75)
            aBoolean10450 = false;
        anInt10451++;
        return (i & 0x10) != 0;
    }
}
