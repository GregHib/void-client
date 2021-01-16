/* Class348_Sub40_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub38 extends Class348_Sub40 {
    static int anInt9468;
    static int anInt9469;
    private int anInt9470 = 4096;
    static Class304 aClass304_9471 = new Class304(1);
    static int anInt9472;
    static int anInt9473;
    private int anInt9474 = 0;
    static Class74 aClass74_9475 = new Class74(12, 7);
    static int anInt9476;
    static Class251 aClass251_9477 = new Class251();
    static Class262 aClass262_9478 = new Class262();
    static int anInt9479 = 0;
    static int[] anIntArray9480 = new int[13];

    public Class348_Sub40_Sub38() {
        super(1, false);
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_0_) {
        if (i_0_ != 31015)
            anInt9470 = -15;
        int i_1_ = i;
        while_213_:
        do {
            do {
                if (i_1_ != 0) {
                    if (i_1_ != 1) {
                        if (i_1_ == 2)
                            break;
                        break while_213_;
                    }
                } else {
                    anInt9474 = class348_sub49.method3330(i_0_ + 842366929);
                    break while_213_;
                }
                anInt9470 = class348_sub49.method3330(i_0_ + 842366929);
                break while_213_;
            } while (false);
            this.aBoolean7045
                    = class348_sub49.method3387(i_0_ + -30760) == 1;
        } while (false);
        anInt9472++;
    }

    final int[][] method3047(int i, int i_2_) {
        if (i_2_ != -1564599039)
            method3150(true);
        anInt9468++;
        int[][] is
                = this.aClass322_7033.method2557(-117, i);
        if (this.aClass322_7033.aBoolean4035) {
            int[][] is_3_ = this.method3039((byte) -88, i, 0);
            int[] is_4_ = is_3_[0];
            int[] is_5_ = is_3_[1];
            int[] is_6_ = is_3_[2];
            int[] is_7_ = is[0];
            int[] is_8_ = is[1];
            int[] is_9_ = is[2];
            for (int i_10_ = 0; (i_10_ < Class348_Sub40_Sub6.anInt9139); i_10_++) {
                int i_11_ = is_4_[i_10_];
                int i_12_ = is_5_[i_10_];
                int i_13_ = is_6_[i_10_];
                if (i_11_ < anInt9474)
                    is_7_[i_10_] = anInt9474;
                else is_7_[i_10_] = Math.min(i_11_, anInt9470);
                if (anInt9474 > i_12_)
                    is_8_[i_10_] = anInt9474;
                else is_8_[i_10_] = Math.min(i_12_, anInt9470);
                if (anInt9474 <= i_13_) {
                    is_9_[i_10_] = Math.min(i_13_, anInt9470);
                } else
                    is_9_[i_10_] = anInt9474;
            }
        }
        return is;
    }

    public static void method3149(int i) {
        aClass74_9475 = null;
        anIntArray9480 = null;
        aClass304_9471 = null;
        aClass251_9477 = null;
        aClass262_9478 = null;
        if (i < 32)
            method3149(58);
    }

    static final void method3150(boolean bool) {
        anInt9469++;
        int i = 0;
        if (bool != true)
            method3150(false);
        for (/**/; Class150.anInt2057 > i; i++) {
            int i_14_ = Class74.anIntArray1233[i];
            Class348_Sub22 class348_sub22
                    = ((Class348_Sub22)
                    Class282.aClass356_3654.method3480(i_14_, -6008));
            if (class348_sub22 != null) {
                Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1
                        = (class348_sub22
                        .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
                Class322.method2556(false,
                        class318_sub1_sub3_sub3_sub1
                                .aClass79_10505.anInt1399,
                        class318_sub1_sub3_sub3_sub1);
            }
        }
    }

    final int[] method3042(int i, int i_15_) {
        anInt9476++;
        int[] is
                = this.aClass191_7032.method1433(0,
                i);
        if (this.aClass191_7032.aBoolean2570) {
            int[] is_16_ = this.method3048(i, 633706337, 0);
            for (int i_17_ = 0; i_17_ < Class348_Sub40_Sub6.anInt9139;
                 i_17_++) {
                int i_18_ = is_16_[i_17_];
                if (anInt9474 > i_18_)
                    is[i_17_] = anInt9474;
                else is[i_17_] = Math.min(i_18_, anInt9470);
            }
        }
        return is;
    }
}
