/* Class348_Sub40_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub39 extends Class348_Sub40 {
    private Class50[] aClass50Array9481;
    static int anInt9482;
    static int anInt9483;
    static int anInt9484;
    static Class70 aClass70_9485 = new Class70();
    static int anInt9486;
    static int anInt9487;

    private final void method3151(int[][] is, byte i) {
        anInt9487++;
        if (i != -27)
            method3152(86);
        int i_0_ = Class348_Sub40_Sub6.anInt9139;
        int i_1_ = Class286_Sub2.anInt6212;
        Class12.method224((byte) -40, is);
        Class348_Sub27.method3000(Class239_Sub22.anInt6076, 0,
                Class299_Sub2.anInt6325, 0, i ^ 0x28);
        if (aClass50Array9481 != null) {
            for (int i_2_ = 0; aClass50Array9481.length > i_2_; i_2_++) {
                Class50 class50 = aClass50Array9481[i_2_];
                int i_3_ = class50.anInt864;
                int i_4_ = class50.anInt865;
                if (i_3_ < 0) {
                    if (i_4_ >= 0)
                        class50.method457(i_1_, i_0_, -43);
                } else if (i_4_ < 0)
                    class50.method456(i ^ ~0x6a, i_0_, i_1_);
                else
                    class50.method455(i_0_, i_1_, -124);
            }
        }
    }

    public static void method3152(int i) {
        aClass70_9485 = null;
        if (i != 255)
            method3152(-42);
    }

    final int[] method3042(int i, int i_5_) {
        anInt9486++;
        int[] is
                = this.aClass191_7032.method1433(i_5_ + -255,
                i);
        if (this.aClass191_7032.aBoolean2570)
            method3151(this.aClass191_7032
                            .method1427((byte) 16),
                    (byte) -27);
        if (i_5_ != 255)
            method3049(null, 66, -50);
        return is;
    }

    static final void method3153(int i) {
        anInt9482++;
        for (Class348_Sub42_Sub13 class348_sub42_sub13
             = ((Class348_Sub42_Sub13)
                Class233.aClass107_3022.method1011(-49));
             class348_sub42_sub13 != null;
             class348_sub42_sub13
                     = ((Class348_Sub42_Sub13)
                     Class233.aClass107_3022.method1003((byte) 51))) {
            if (class348_sub42_sub13.anInt9615 > 1) {
                class348_sub42_sub13.anInt9615 = 0;
                Class259.aClass60_3301.method582
                        (class348_sub42_sub13,
                                ((Class348_Sub42_Sub12) class348_sub42_sub13
                                        .aClass107_9621
                                        .aClass348_Sub42_1647
                                        .aClass348_Sub42_7063).aLong9600,
                                (byte) -108);
                class348_sub42_sub13
                        .aClass107_9621.method1009(i ^ 0x7dc976c2);
            }
        }
        Class8.anInt166 = 0;
        Class73.anInt4776 = i;
        Class348_Sub40_Sub4.aClass262_9111.method1996(125);
        Class348_Sub42_Sub12.aClass356_9603.method3481(0);
        Class233.aClass107_3022.method1009(2110355138);
        Class5_Sub1.aBoolean8335 = false;
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_6_) {
        if (i_6_ != 31015)
            aClass70_9485 = null;
        if (i == 0) {
            aClass50Array9481 = new Class50[class348_sub49.method3387(255)];
            while_216_:
            for (int i_7_ = 0; aClass50Array9481.length > i_7_; i_7_++) {
                int i_8_ = class348_sub49.method3387(255);
                int i_9_ = i_8_;
                while_214_:
                do {
                    do {
                        if (i_9_ == 0) {
                            aClass50Array9481[i_7_]
                                    = Class182.method1374(107, class348_sub49);
                            continue while_216_;
                        } else {
                            if (i_9_ != 1) {
                                if (i_9_ != 2) {
                                    if (i_9_ != 3)
                                        continue while_216_;
                                } else
                                    break;
                                break while_214_;
                            }
                        }
                        aClass50Array9481[i_7_]
                                = (Class348_Sub23_Sub1.method2970
                                (Class348_Sub21.method2955(i_6_, 31013),
                                        class348_sub49));
                        continue while_216_;
                    } while (false);
                    aClass50Array9481[i_7_]
                            = (Class348_Sub40.method3036
                            (class348_sub49,
                                    Class348_Sub21.method2955(i_6_, -31102)));
                    continue while_216_;
                } while (false);
                aClass50Array9481[i_7_]
                        = Class265.method2022(class348_sub49, 0);
            }
        } else if (i == 1)
            this.aBoolean7045
                    = class348_sub49.method3387(255) == 1;
        anInt9484++;
    }

    final int[][] method3047(int i, int i_10_) {
        anInt9483++;
        int[][] is = this.aClass322_7033
                .method2557(i_10_ + 1564598923, i);
        if (i_10_ != -1564599039)
            aClass70_9485 = null;
        if (this.aClass322_7033.aBoolean4035) {
            int i_11_ = Class348_Sub40_Sub6.anInt9139;
            int i_12_ = Class286_Sub2.anInt6212;
            int[][] is_13_ = new int[i_12_][i_11_];
            int[][][] is_14_
                    = this.aClass322_7033.method2553(0);
            method3151(is_13_, (byte) -27);
            for (int i_15_ = 0;
                 Class286_Sub2.anInt6212 > i_15_;
                 i_15_++) {
                int[] is_16_ = is_13_[i_15_];
                int[][] is_17_ = is_14_[i_15_];
                int[] is_18_ = is_17_[0];
                int[] is_19_ = is_17_[1];
                int[] is_20_ = is_17_[2];
                for (int i_21_ = 0; i_21_ < Class348_Sub40_Sub6.anInt9139;
                     i_21_++) {
                    int i_22_ = is_16_[i_21_];
                    is_20_[i_21_]
                            = Class139.method1166(i_22_, 255) << -1027400764;
                    is_19_[i_21_]
                            = Class139.method1166(i_22_ >> 1794601060, 4080);
                    is_18_[i_21_]
                            = Class139.method1166(4080, i_22_ >> 2055996268);
                }
            }
        }
        return is;
    }

    public Class348_Sub40_Sub39() {
        super(0, true);
    }
}
