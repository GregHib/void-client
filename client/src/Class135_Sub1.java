/* Class135_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class Class135_Sub1 extends Class135 implements Interface2 {
    static int anInt4706;
    static Class114 aClass114_4707;
    private int anInt4708;
    static int[] anIntArray4709 = new int[2048];
    static int anInt4710;
    static int anInt4711;
    static int anInt4712;
    static int anInt4713;
    static int anInt4714;
    static int anInt4715;
    static int anInt4716;
    static int anInt4717;
    static int anInt4718;

    public final int method13(byte i) {
        anInt4706++;
        if (i != -97)
            method10(false);
        return anInt4708;
    }

    final void method1152(int i) {
        ((Class135) this).aHa_Sub2_1927.method3750(91, this);
        if (i >= -78)
            method10(false);
        anInt4710++;
    }

    public final void method11(int i, int i_0_, byte[] is, int i_1_) {
        this.method1150(is, 0, i_0_);
        anInt4711++;
        anInt4708 = i;
        if (i_1_ != -9894)
            method12((byte) -37);
    }

    Class135_Sub1(ha_Sub2 var_ha_Sub2, int i, byte[] is, int i_2_,
                  boolean bool) {
        super(var_ha_Sub2, 34962, is, i_2_, bool);
        try {
            anInt4708 = i;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("jt.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_2_ + ',' + bool + ')'));
        }
    }

    Class135_Sub1(ha_Sub2 var_ha_Sub2, int i, Buffer buffer, int i_3_,
                  boolean bool) {
        super(var_ha_Sub2, 34962, buffer, i_3_, bool);
        try {
            anInt4708 = i;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("jt.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (buffer != null ? "{...}"
                            : "null")
                            + ',' + i_3_ + ',' + bool + ')'));
        }
    }

    static final void method1153(ha var_ha, int i) {
        anInt4713++;
        int i_4_ = 0;
        int i_5_ = 0;
        if (Class59_Sub1.aBoolean5300) {
            i_4_ = s_Sub3.method4008((byte) -122);
            i_5_ = Class16.method260(false);
        }
        int i_6_ = i_4_ + anInt4717;
        int i_7_ = Class348_Sub42_Sub5.anInt9532 + i_5_;
        int i_8_ = Class63.anInt1117;
        int i_9_ = -3 + Class237_Sub1.anInt5819;
        int i_10_ = 20;
        Class299_Sub2_Sub1.method2270
                (Class63.anInt1117, i_4_ + anInt4717, var_ha,
                        Class274.aClass274_3507.method2063(Class348_Sub33.anInt6967,
                                i + 528),
                        false, i_5_ + Class348_Sub42_Sub5.anInt9532,
                        Class237_Sub1.anInt5819, i_10_);
        int i_11_ = i_4_ + Class258_Sub4.aClass373_8552.method3597(true);
        if (i != 16)
            method1154((byte) 9);
        int i_12_ = i_5_ + Class258_Sub4.aClass373_8552.method3594((byte) 95);
        if (!Class348_Sub42_Sub6.aBoolean9535) {
            int i_13_ = 0;
            for (Class348_Sub42_Sub12 class348_sub42_sub12
                 = ((Class348_Sub42_Sub12)
                    Class348_Sub40_Sub4.aClass262_9111.method1995(4));
                 class348_sub42_sub12 != null;
                 class348_sub42_sub12
                         = (Class348_Sub42_Sub12) Class348_Sub40_Sub4
                         .aClass262_9111
                         .method1990((byte) 101)) {
                int i_14_ = (16 * (-1 + (Class73.anInt4776 - i_13_)) + 13
                        + (i_7_ + i_10_));
                if ((anInt4717 - -i_4_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff)
                        && anInt4717 + i_4_ - -Class63.anInt1117 > i_11_
                        && (i_14_ - 13 ^ 0xffffffff) > (i_12_ ^ 0xffffffff)
                        && 4 + i_14_ > i_12_
                        && (((Class348_Sub42_Sub12) class348_sub42_sub12)
                        .aBoolean9610))
                    var_ha.aa(i_4_ + anInt4717, -12 + i_14_, Class63.anInt1117,
                            16,
                            (255 + -Class348_Sub42_Sub4.anInt9511
                                    << 1707681656) | Class264.anInt3374,
                            1);
                i_13_++;
            }
        } else {
            int i_15_ = 0;
            for (Class348_Sub42_Sub13 class348_sub42_sub13
                 = ((Class348_Sub42_Sub13)
                    Class233.aClass107_3022.method1011(-73));
                 class348_sub42_sub13 != null;
                 class348_sub42_sub13
                         = ((Class348_Sub42_Sub13)
                         Class233.aClass107_3022.method1003((byte) 61))) {
                int i_16_ = 16 * i_15_ + i_7_ - (-i_10_ + -13);
                if ((i_11_ ^ 0xffffffff) < (i_4_ + anInt4717 ^ 0xffffffff)
                        && i_11_ < Class63.anInt1117 + (i_4_ + anInt4717)
                        && (-13 + i_16_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff)
                        && (i_12_ ^ 0xffffffff) > (i_16_ - -4 ^ 0xffffffff)
                        && (((((Class348_Sub42_Sub13) class348_sub42_sub13)
                        .anInt9615)
                        ^ 0xffffffff) < -2
                        || ((Class348_Sub42_Sub12) (Class348_Sub42_Sub12)
                        (((Class348_Sub42)
                                ((Class107)
                                        (((Class348_Sub42_Sub13) class348_sub42_sub13)
                                                .aClass107_9621)).aClass348_Sub42_1647)
                                .aClass348_Sub42_7063)).aBoolean9610))
                    var_ha.aa(anInt4717 + i_4_, -12 + i_16_, Class63.anInt1117,
                            16,
                            (255 + -Class348_Sub42_Sub4.anInt9511
                                    << 766164024) | Class264.anInt3374,
                            1);
                i_15_++;
            }
            if (Class242.aClass348_Sub42_Sub13_3152 != null) {
                i_15_ = 0;
                Class299_Sub2_Sub1.method2270(Class348_Sub1_Sub1.anInt8806,
                        Class50_Sub3.anInt5252, var_ha,
                        (((Class348_Sub42_Sub13)
                                (Class242
                                        .aClass348_Sub42_Sub13_3152))
                                .aString9617),
                        false, Class373.anInt4534,
                        Class177.anInt4669, i_10_);
                for (Class348_Sub42_Sub12 class348_sub42_sub12
                     = ((Class348_Sub42_Sub12)
                        ((Class348_Sub42_Sub13)
                                Class242.aClass348_Sub42_Sub13_3152)
                                .aClass107_9621.method1011(-44));
                     class348_sub42_sub12 != null;
                     class348_sub42_sub12
                             = ((Class348_Sub42_Sub12)
                             ((Class348_Sub42_Sub13)
                                     Class242.aClass348_Sub42_Sub13_3152)
                                     .aClass107_9621.method1003((byte) 71))) {
                    int i_17_
                            = i_15_ * 16 + (Class373.anInt4534 + i_10_ - -13);
                    if (Class50_Sub3.anInt5252 < i_11_
                            && (Class50_Sub3.anInt5252
                            - -Class348_Sub1_Sub1.anInt8806) > i_11_
                            && (i_12_ ^ 0xffffffff) < (-13 + i_17_ ^ 0xffffffff)
                            && i_17_ - -4 > i_12_
                            && (((Class348_Sub42_Sub12) class348_sub42_sub12)
                            .aBoolean9610))
                        var_ha.aa(Class50_Sub3.anInt5252, i_17_ - 12,
                                Class348_Sub1_Sub1.anInt8806, 16,
                                (-Class348_Sub42_Sub4.anInt9511 + 255
                                        << -1854364648) | Class264.anInt3374,
                                1);
                    i_15_++;
                }
                Class84.method826(i_10_, Class50_Sub3.anInt5252,
                        Class348_Sub1_Sub1.anInt8806,
                        Class177.anInt4669, 125, Class373.anInt4534,
                        var_ha);
            }
        }
        Class84.method826(i_10_, anInt4717 + i_4_, Class63.anInt1117,
                Class237_Sub1.anInt5819, -75,
                Class348_Sub42_Sub5.anInt9532 - -i_5_, var_ha);
        if (!Class348_Sub42_Sub6.aBoolean9535) {
            int i_18_ = 0;
            for (Class348_Sub42_Sub12 class348_sub42_sub12
                 = ((Class348_Sub42_Sub12)
                    Class348_Sub40_Sub4.aClass262_9111.method1995(4));
                 class348_sub42_sub12 != null;
                 class348_sub42_sub12
                         = (Class348_Sub42_Sub12) Class348_Sub40_Sub4
                         .aClass262_9111
                         .method1990((byte) 71)) {
                int i_19_
                        = (i_7_ - -i_10_
                        - (-13 - (Class73.anInt4776 + (-1 + -i_18_)) * 16));
                i_18_++;
                Class318_Sub2.method2494(i_7_,
                        ~0xffffff | Class5_Sub2.anInt8363,
                        i_19_, var_ha, class348_sub42_sub12,
                        i_8_, i_12_,
                        (~0xffffff
                                | Class348_Sub42_Sub11.anInt9586),
                        (byte) 125, i_9_, i_6_, i_11_);
            }
        } else {
            int i_20_ = 0;
            for (Class348_Sub42_Sub13 class348_sub42_sub13
                 = ((Class348_Sub42_Sub13)
                    Class233.aClass107_3022.method1011(-77));
                 class348_sub42_sub13 != null;
                 class348_sub42_sub13
                         = ((Class348_Sub42_Sub13)
                         Class233.aClass107_3022.method1003((byte) 111))) {
                int i_21_ = i_10_ + (i_5_ + Class348_Sub42_Sub5.anInt9532 + 13
                        - -(16 * i_20_));
                i_20_++;
                if (((Class348_Sub42_Sub13) class348_sub42_sub13).anInt9615
                        == 1)
                    Class318_Sub2.method2494
                            (Class348_Sub42_Sub5.anInt9532 - -i_5_,
                                    ~0xffffff | Class5_Sub2.anInt8363, i_21_, var_ha,
                                    ((Class348_Sub42_Sub12)
                                            ((Class348_Sub42)
                                                    (((Class107) ((Class348_Sub42_Sub13)
                                                            class348_sub42_sub13).aClass107_9621)
                                                            .aClass348_Sub42_1647)).aClass348_Sub42_7063),
                                    Class63.anInt1117, i_12_,
                                    Class348_Sub42_Sub11.anInt9586 | ~0xffffff,
                                    (byte) 125, Class237_Sub1.anInt5819,
                                    anInt4717 - -i_4_, i_11_);
                else
                    Class318_Sub1_Sub3_Sub3.method2431
                            (~0xffffff | Class348_Sub42_Sub11.anInt9586, i_21_,
                                    class348_sub42_sub13, i_11_, Class63.anInt1117,
                                    ~0xffffff | Class5_Sub2.anInt8363, i_12_, var_ha,
                                    Class348_Sub42_Sub5.anInt9532 - -i_5_, i ^ 0x60,
                                    i_4_ + anInt4717, Class237_Sub1.anInt5819);
            }
            if (Class242.aClass348_Sub42_Sub13_3152 != null) {
                i_20_ = 0;
                for (Class348_Sub42_Sub12 class348_sub42_sub12
                     = ((Class348_Sub42_Sub12)
                        ((Class348_Sub42_Sub13)
                                Class242.aClass348_Sub42_Sub13_3152)
                                .aClass107_9621.method1011(-118));
                     class348_sub42_sub12 != null;
                     class348_sub42_sub12
                             = ((Class348_Sub42_Sub12)
                             ((Class348_Sub42_Sub13)
                                     Class242.aClass348_Sub42_Sub13_3152)
                                     .aClass107_9621.method1003((byte) 111))) {
                    int i_22_ = i_20_ * 16 + 13 + (Class373.anInt4534 + i_10_);
                    i_20_++;
                    Class318_Sub2.method2494(Class373.anInt4534,
                            Class5_Sub2.anInt8363 | ~0xffffff,
                            i_22_, var_ha,
                            class348_sub42_sub12,
                            Class348_Sub1_Sub1.anInt8806,
                            i_12_,
                            (Class348_Sub42_Sub11.anInt9586
                                    | ~0xffffff),
                            (byte) 127, Class177.anInt4669,
                            Class50_Sub3.anInt5252, i_11_);
                }
                Class332.method2642(Class348_Sub1_Sub1.anInt8806,
                        Class373.anInt4534, true,
                        Class50_Sub3.anInt5252,
                        Class177.anInt4669);
            }
        }
        Class332.method2642(Class63.anInt1117,
                Class348_Sub42_Sub5.anInt9532 - -i_5_, true,
                i_4_ + anInt4717, Class237_Sub1.anInt5819);
    }

    public final int method10(boolean bool) {
        anInt4714++;
        if (bool != true)
            method12((byte) -54);
        return ((Class135) this).anInt1929;
    }

    public static void method1154(byte i) {
        int i_23_ = -93 / ((i - -75) / 36);
        anIntArray4709 = null;
        aClass114_4707 = null;
    }

    public final long method12(byte i) {
        if (i != 42)
            aClass114_4707 = null;
        anInt4712++;
        return 0L;
    }

    static {
        aClass114_4707 = new Class114(39, 8);
        anInt4718 = 0;
    }
}
