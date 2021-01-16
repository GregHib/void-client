/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class280 {
    static int anInt3625;
    private int anInt3626;
    private final int[] anIntArray3627 = new int[64];
    static int anInt3628;
    static int anInt3629;
    private final Interface5_Impl1 anInterface5_Impl1_3630;
    private int[] anIntArray3631;
    private final Class318_Sub9_Sub2[][] aClass318_Sub9_Sub2ArrayArray3632;
    static int anInt3633;
    static int anInt3634;
    private final Interface5_Impl2 anInterface5_Impl2_3635;
    private final int[] anIntArray3636;
    private final Class130 aClass130_3637;
    private final Interface5_Impl1 anInterface5_Impl1_3638;
    static int anInt3639;
    static int anInt3640;
    static Class114 aClass114_3641 = new Class114(79, 3);
    private Class318_Sub9_Sub2[][] aClass318_Sub9_Sub2ArrayArray3642;
    static int anInt3643 = 0;

    private final void method2098(ha_Sub3 var_ha_Sub3, int i, int i_0_) {
        anInt3629++;
        Class59_Sub1.aFloat5299 = var_ha_Sub3.aFloat8093;
        int i_1_ = 75 % ((2 - i) / 34);
        var_ha_Sub3.method3867((float) i_0_, -86);
        var_ha_Sub3.method3857((byte) 92);
        var_ha_Sub3.method3865(false, 36);
        var_ha_Sub3.method3946(-32, false);
        var_ha_Sub3.method3942(5);
    }

    private final void method2099(int i, ha_Sub3 var_ha_Sub3) {
        anInt3628++;
        var_ha_Sub3.method3946(i + -26358, true);
        var_ha_Sub3.method3865(true, 54);
        if (i != 26326)
            anIntArray3631 = null;
        if (Class59_Sub1.aFloat5299 != var_ha_Sub3.aFloat8093)
            var_ha_Sub3.xa(Class59_Sub1.aFloat5299);
    }

    final void method2100(byte i, ha_Sub3 var_ha_Sub3) {
        anInterface5_Impl1_3638.method20(786336, (byte) 123, 24);
        int i_2_ = -125 / ((i - 65) / 49);
        anInt3625++;
    }

    final void method2101(ha_Sub3 var_ha_Sub3, Class98 class98, int i,
                          int i_3_) {
        try {
            anInt3633++;
            if (var_ha_Sub3.aClass101_Sub2_8080 != null) {
                if (i >= 0)
                    method2098(var_ha_Sub3, -121, i);
                else
                    method2103((byte) -33, var_ha_Sub3);
                float f = (var_ha_Sub3.aClass101_Sub2_8080
                        .aFloat5736);
                float f_4_ = (var_ha_Sub3.aClass101_Sub2_8080
                        .aFloat5691);
                float f_5_ = (var_ha_Sub3.aClass101_Sub2_8080
                        .aFloat5716);
                float f_6_ = (var_ha_Sub3.aClass101_Sub2_8080
                        .aFloat5724);
                try {
                    int i_7_ = 0;
                    int i_8_ = 2147483647;
                    int i_9_ = i_3_;
                    Class318_Sub9 class318_sub9
                            = (class98.aClass88_1569
                            .aClass318_Sub9_1503);
                    for (Class318_Sub9 class318_sub9_10_
                         = (class318_sub9
                            .aClass318_Sub9_6469);
                         class318_sub9 != class318_sub9_10_;
                         class318_sub9_10_
                                 = (class318_sub9_10_
                                 .aClass318_Sub9_6469)) {
                        Class318_Sub9_Sub2 class318_sub9_sub2
                                = (Class318_Sub9_Sub2) class318_sub9_10_;
                        int i_11_
                                = (int) ((float) (class318_sub9_sub2.anInt8791
                                >> -1269979284) * f
                                + f_4_ * (float) ((class318_sub9_sub2
                                .anInt8796)
                                >> 1246085868)
                                + (float) (class318_sub9_sub2.anInt8789
                                >> 66762796) * f_5_
                                + f_6_);
                        if (i_9_ < i_11_)
                            i_9_ = i_11_;
                        anIntArray3631[i_7_++] = i_11_;
                        if (i_8_ > i_11_)
                            i_8_ = i_11_;
                    }
                    int i_12_ = -i_8_ + i_9_;
                    int i_13_;
                    if (2 + i_12_ > 1600) {
                        i_13_ = (Class299.method2253(i_12_, i_3_ + 119) + 1
                                + -Class169.anInt2265);
                        i_12_ = 2 + (i_12_ >> i_13_);
                    } else {
                        i_13_ = 0;
                        i_12_ += 2;
                    }
                    Class318_Sub9 class318_sub9_14_
                            = class318_sub9.aClass318_Sub9_6469;
                    i_7_ = 0;
                    int i_15_ = -2;
                    boolean bool = true;
                    boolean bool_16_ = true;
                    while (class318_sub9_14_ != class318_sub9) {
                        anInt3626 = 0;
                        for (int i_17_ = 0;
                             i_12_ > i_17_;
                             i_17_++)
                            anIntArray3636[i_17_] = 0;
                        for (int i_18_ = 0; i_18_ < 64; i_18_++)
                            anIntArray3627[i_18_] = 0;
                        for (/**/; class318_sub9_14_ != class318_sub9;
                                 class318_sub9_14_
                                         = (class318_sub9_14_
                                         .aClass318_Sub9_6469)) {
                            Class318_Sub9_Sub2 class318_sub9_sub2
                                    = (Class318_Sub9_Sub2) class318_sub9_14_;
                            if (bool_16_) {
                                bool = class318_sub9_sub2.aBoolean8794;
                                i_15_ = class318_sub9_sub2.anInt8792;
                                bool_16_ = false;
                            }
                            if (i_7_ > 0
                                    && (i_15_ != class318_sub9_sub2.anInt8792
                                    || !bool != !(class318_sub9_sub2
                                    .aBoolean8794))) {
                                bool_16_ = true;
                                break;
                            }
                            int i_19_
                                    = -i_8_ + anIntArray3631[i_7_++] >> i_13_;
                            if (i_19_ < 1600) {
                                if (anIntArray3636[i_19_] < 64)
                                    aClass318_Sub9_Sub2ArrayArray3632
                                            [i_19_][anIntArray3636[i_19_]++]
                                            = class318_sub9_sub2;
                                else {
                                    if (anIntArray3636[i_19_] == 64) {
                                        if (anInt3626 == 64)
                                            continue;
                                        anIntArray3636[i_19_]
                                                += anInt3626++ + 1;
                                    }
                                    aClass318_Sub9_Sub2ArrayArray3642
                                            [-65 + anIntArray3636[i_19_]]
                                            [anIntArray3627[(anIntArray3636[i_19_]
                                            + -65)]++]
                                            = class318_sub9_sub2;
                                }
                            }
                        }
                        var_ha_Sub3.method3814(false, false,
                                i_15_ >= 0 ? i_15_ : -1,
                                (byte) 117);
                        if (bool && (Class59_Sub1.aFloat5299
                                != var_ha_Sub3.aFloat8093))
                            var_ha_Sub3.xa(Class59_Sub1.aFloat5299);
                        else if (var_ha_Sub3.aFloat8093 != 1.0F)
                            var_ha_Sub3.xa(1.0F);
                        method2102(false, var_ha_Sub3, i_12_);
                    }
                } catch (Exception exception) {
                    /* empty */
                }
                method2099(i_3_ ^ 0x66d6, var_ha_Sub3);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ve.G("
                            + (var_ha_Sub3 != null ? "{...}"
                            : "null")
                            + ','
                            + (class98 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_3_ + ')'));
        }
    }

    private final void method2102(boolean bool, ha_Sub3 var_ha_Sub3, int i) {
        anInt3640++;
        if (bool != false)
            method2098(null, 21, -85);
        int i_20_ = 0;
        Class101_Sub2 class101_sub2 = var_ha_Sub3.method3948(-22036);
        float f = class101_sub2.aFloat5711;
        float f_21_ = class101_sub2.aFloat5700;
        float f_22_ = class101_sub2.aFloat5704;
        float f_23_ = class101_sub2.aFloat5708;
        float f_24_ = class101_sub2.aFloat5722;
        float f_25_ = class101_sub2.aFloat5732;
        float f_26_ = f_23_ + f;
        float f_27_ = f_21_ + f_24_;
        float f_28_ = f_22_ + f_25_;
        float f_29_ = f - f_23_;
        float f_30_ = f_21_ - f_24_;
        float f_31_ = -f_25_ + f_22_;
        float f_32_ = f_23_ - f;
        float f_33_ = -f_21_ + f_24_;
        float f_34_ = -f_22_ + f_25_;
        Buffer buffer = anInterface5_Impl1_3638.method19(true, 26775);
        if (buffer != null) {
            Stream stream = var_ha_Sub3.method3893(buffer, 9179);
            if (Stream.c()) {
                for (int i_58_ = i + -1; i_58_ >= 0; i_58_--) {
                    int i_59_ = (Math.min(anIntArray3636[i_58_], 64));
                    if (i_59_ > 0) {
                        for (int i_60_ = i_59_ + -1; i_60_ >= 0; i_60_--) {
                            Class318_Sub9_Sub2 class318_sub9_sub2
                                    = (aClass318_Sub9_Sub2ArrayArray3632[i_58_]
                                    [i_60_]);
                            int i_61_
                                    = (class318_sub9_sub2
                                    .anInt8790);
                            byte i_62_ = (byte) (i_61_ >> 1814567952);
                            byte i_63_ = (byte) (i_61_ >> -832218584);
                            byte i_64_ = (byte) i_61_;
                            byte i_65_ = (byte) (i_61_ >>> 2034244920);
                            float f_66_
                                    = (float) (class318_sub9_sub2.anInt8791
                                    >> -78374836);
                            float f_67_
                                    = (float) (class318_sub9_sub2.anInt8796
                                    >> -140447572);
                            float f_68_
                                    = (float) (class318_sub9_sub2.anInt8789
                                    >> 989328140);
                            int i_69_
                                    = ((class318_sub9_sub2
                                    .anInt8793)
                                    >> 927822636);
                            stream.a(f_26_ * (float) -i_69_ + f_66_);
                            stream.a(f_67_ + f_27_ * (float) -i_69_);
                            stream.a(f_68_ + (float) -i_69_ * f_28_);
                            if (var_ha_Sub3.anInt8178 != 0)
                                stream.a(i_62_, i_63_, i_64_, i_65_);
                            else
                                stream.b(i_62_, i_63_, i_64_, i_65_);
                            stream.a(0.0F);
                            stream.a(0.0F);
                            stream.a(f_29_ * (float) i_69_ + f_66_);
                            stream.a((float) i_69_ * f_30_ + f_67_);
                            stream.a(f_68_ + f_31_ * (float) i_69_);
                            if (var_ha_Sub3.anInt8178 != 0)
                                stream.a(i_62_, i_63_, i_64_, i_65_);
                            else
                                stream.b(i_62_, i_63_, i_64_, i_65_);
                            stream.a(1.0F);
                            stream.a(0.0F);
                            stream.a(f_66_ + f_26_ * (float) i_69_);
                            stream.a(f_67_ + f_27_ * (float) i_69_);
                            stream.a(f_28_ * (float) i_69_ + f_68_);
                            if (var_ha_Sub3.anInt8178 != 0)
                                stream.a(i_62_, i_63_, i_64_, i_65_);
                            else
                                stream.b(i_62_, i_63_, i_64_, i_65_);
                            stream.a(1.0F);
                            stream.a(1.0F);
                            stream.a(f_66_ + f_32_ * (float) i_69_);
                            stream.a(f_67_ + f_33_ * (float) i_69_);
                            stream.a(f_68_ + f_34_ * (float) i_69_);
                            if (var_ha_Sub3.anInt8178 != 0)
                                stream.a(i_62_, i_63_, i_64_, i_65_);
                            else
                                stream.b(i_62_, i_63_, i_64_, i_65_);
                            stream.a(0.0F);
                            i_20_++;
                            stream.a(1.0F);
                        }
                        if (anIntArray3636[i_58_] > 64) {
                            int i_70_ = anIntArray3636[i_58_] - 65;
                            for (int i_71_ = -1 + anIntArray3627[i_70_];
                                 i_71_ >= 0; i_71_--) {
                                Class318_Sub9_Sub2 class318_sub9_sub2
                                        = (aClass318_Sub9_Sub2ArrayArray3642[i_70_]
                                        [i_71_]);
                                int i_72_ = (class318_sub9_sub2
                                        .anInt8790);
                                byte i_73_ = (byte) (i_72_ >> 2110732976);
                                byte i_74_ = (byte) (i_72_ >> 1078642568);
                                byte i_75_ = (byte) i_72_;
                                byte i_76_ = (byte) (i_72_ >>> -2009136648);
                                float f_77_
                                        = (float) (class318_sub9_sub2.anInt8791
                                        >> 707732940);
                                float f_78_
                                        = (float) (class318_sub9_sub2.anInt8796
                                        >> 1530985548);
                                float f_79_
                                        = (float) (class318_sub9_sub2.anInt8789
                                        >> 1258372492);
                                int i_80_ = (class318_sub9_sub2.anInt8793
                                        >> -2009271764);
                                stream.a(f_26_ * (float) -i_80_ + f_77_);
                                stream.a((float) -i_80_ * f_27_ + f_78_);
                                stream.a(f_79_ + f_28_ * (float) -i_80_);
                                if (var_ha_Sub3.anInt8178 == 0)
                                    stream.b(i_73_, i_74_, i_75_, i_76_);
                                else
                                    stream.a(i_73_, i_74_, i_75_, i_76_);
                                stream.a(0.0F);
                                stream.a(0.0F);
                                stream.a(f_29_ * (float) i_80_ + f_77_);
                                stream.a((float) i_80_ * f_30_ + f_78_);
                                stream.a((float) i_80_ * f_31_ + f_79_);
                                if (var_ha_Sub3.anInt8178 == 0)
                                    stream.b(i_73_, i_74_, i_75_, i_76_);
                                else
                                    stream.a(i_73_, i_74_, i_75_, i_76_);
                                stream.a(1.0F);
                                stream.a(0.0F);
                                stream.a(f_77_ + (float) i_80_ * f_26_);
                                stream.a((float) i_80_ * f_27_ + f_78_);
                                stream.a((float) i_80_ * f_28_ + f_79_);
                                if (var_ha_Sub3.anInt8178 != 0)
                                    stream.a(i_73_, i_74_, i_75_, i_76_);
                                else
                                    stream.b(i_73_, i_74_, i_75_, i_76_);
                                stream.a(1.0F);
                                stream.a(1.0F);
                                stream.a((float) i_80_ * f_32_ + f_77_);
                                stream.a((float) i_80_ * f_33_ + f_78_);
                                stream.a(f_79_ + (float) i_80_ * f_34_);
                                if (var_ha_Sub3.anInt8178 != 0)
                                    stream.a(i_73_, i_74_, i_75_, i_76_);
                                else
                                    stream.b(i_73_, i_74_, i_75_, i_76_);
                                stream.a(0.0F);
                                i_20_++;
                                stream.a(1.0F);
                            }
                        }
                    }
                }
            } else {
                for (int i_35_ = -1 + i; i_35_ >= 0; i_35_--) {
                    int i_36_ = (Math.min(anIntArray3636[i_35_], 64));
                    if (i_36_ > 0) {
                        for (int i_37_ = i_36_ + -1; i_37_ >= 0; i_37_--) {
                            Class318_Sub9_Sub2 class318_sub9_sub2
                                    = (aClass318_Sub9_Sub2ArrayArray3632[i_35_]
                                    [i_37_]);
                            int i_38_
                                    = (class318_sub9_sub2
                                    .anInt8790);
                            byte i_39_ = (byte) (i_38_ >> -736715792);
                            byte i_40_ = (byte) (i_38_ >> -1063337784);
                            byte i_41_ = (byte) i_38_;
                            byte i_42_ = (byte) (i_38_ >>> -1252471048);
                            float f_43_
                                    = (float) (class318_sub9_sub2.anInt8791
                                    >> -2025421812);
                            float f_44_
                                    = (float) (class318_sub9_sub2.anInt8796
                                    >> -415207028);
                            float f_45_
                                    = (float) (class318_sub9_sub2.anInt8789
                                    >> 392344716);
                            int i_46_
                                    = ((class318_sub9_sub2
                                    .anInt8793)
                                    >> -1509143636);
                            stream.b((float) -i_46_ * f_26_ + f_43_);
                            stream.b(f_44_ + (float) -i_46_ * f_27_);
                            stream.b((float) -i_46_ * f_28_ + f_45_);
                            if (var_ha_Sub3.anInt8178 == 0)
                                stream.b(i_39_, i_40_, i_41_, i_42_);
                            else
                                stream.a(i_39_, i_40_, i_41_, i_42_);
                            stream.b(0.0F);
                            stream.b(0.0F);
                            stream.b(f_43_ + (float) i_46_ * f_29_);
                            stream.b(f_44_ + (float) i_46_ * f_30_);
                            stream.b(f_45_ + (float) i_46_ * f_31_);
                            if (var_ha_Sub3.anInt8178 != 0)
                                stream.a(i_39_, i_40_, i_41_, i_42_);
                            else
                                stream.b(i_39_, i_40_, i_41_, i_42_);
                            stream.b(1.0F);
                            stream.b(0.0F);
                            stream.b(f_43_ + f_26_ * (float) i_46_);
                            stream.b(f_27_ * (float) i_46_ + f_44_);
                            stream.b(f_28_ * (float) i_46_ + f_45_);
                            if (var_ha_Sub3.anInt8178 == 0)
                                stream.b(i_39_, i_40_, i_41_, i_42_);
                            else
                                stream.a(i_39_, i_40_, i_41_, i_42_);
                            stream.b(1.0F);
                            stream.b(1.0F);
                            stream.b(f_32_ * (float) i_46_ + f_43_);
                            stream.b((float) i_46_ * f_33_ + f_44_);
                            stream.b(f_45_ + f_34_ * (float) i_46_);
                            if (var_ha_Sub3.anInt8178 == 0)
                                stream.b(i_39_, i_40_, i_41_, i_42_);
                            else
                                stream.a(i_39_, i_40_, i_41_, i_42_);
                            stream.b(0.0F);
                            i_20_++;
                            stream.b(1.0F);
                        }
                        if (anIntArray3636[i_35_] > 64) {
                            int i_47_ = -64 + anIntArray3636[i_35_] + -1;
                            for (int i_48_ = anIntArray3627[i_47_] + -1;
                                 i_48_ >= 0; i_48_--) {
                                Class318_Sub9_Sub2 class318_sub9_sub2
                                        = (aClass318_Sub9_Sub2ArrayArray3642[i_47_]
                                        [i_48_]);
                                int i_49_ = (class318_sub9_sub2
                                        .anInt8790);
                                byte i_50_ = (byte) (i_49_ >> 320854256);
                                byte i_51_ = (byte) (i_49_ >> -482279800);
                                byte i_52_ = (byte) i_49_;
                                byte i_53_ = (byte) (i_49_ >>> -1552108456);
                                float f_54_
                                        = (float) (class318_sub9_sub2.anInt8791
                                        >> 1057100684);
                                float f_55_
                                        = (float) (class318_sub9_sub2.anInt8796
                                        >> -1217417812);
                                float f_56_
                                        = (float) (class318_sub9_sub2.anInt8789
                                        >> 159979852);
                                int i_57_ = (class318_sub9_sub2.anInt8793
                                        >> 525024908);
                                stream.b(f_54_ + (float) -i_57_ * f_26_);
                                stream.b((float) -i_57_ * f_27_ + f_55_);
                                stream.b(f_56_ + f_28_ * (float) -i_57_);
                                if (var_ha_Sub3.anInt8178 == 0)
                                    stream.b(i_50_, i_51_, i_52_, i_53_);
                                else
                                    stream.a(i_50_, i_51_, i_52_, i_53_);
                                stream.b(0.0F);
                                stream.b(0.0F);
                                stream.b(f_54_ + (float) i_57_ * f_29_);
                                stream.b(f_30_ * (float) i_57_ + f_55_);
                                stream.b(f_31_ * (float) i_57_ + f_56_);
                                if (var_ha_Sub3.anInt8178 != 0)
                                    stream.a(i_50_, i_51_, i_52_, i_53_);
                                else
                                    stream.b(i_50_, i_51_, i_52_, i_53_);
                                stream.b(1.0F);
                                stream.b(0.0F);
                                stream.b(f_54_ + (float) i_57_ * f_26_);
                                stream.b((float) i_57_ * f_27_ + f_55_);
                                stream.b(f_28_ * (float) i_57_ + f_56_);
                                if (var_ha_Sub3.anInt8178 == 0)
                                    stream.b(i_50_, i_51_, i_52_, i_53_);
                                else
                                    stream.a(i_50_, i_51_, i_52_, i_53_);
                                stream.b(1.0F);
                                stream.b(1.0F);
                                stream.b(f_54_ + f_32_ * (float) i_57_);
                                stream.b(f_55_ + (float) i_57_ * f_33_);
                                stream.b((float) i_57_ * f_34_ + f_56_);
                                if (var_ha_Sub3.anInt8178 != 0)
                                    stream.a(i_50_, i_51_, i_52_, i_53_);
                                else
                                    stream.b(i_50_, i_51_, i_52_, i_53_);
                                stream.b(0.0F);
                                stream.b(1.0F);
                                i_20_++;
                            }
                        }
                    }
                }
            }
            stream.a();
            if (anInterface5_Impl1_3638.method18(6331)) {
                var_ha_Sub3.method3925(66, anInterface5_Impl1_3638, 0);
                var_ha_Sub3.method3925(68, anInterface5_Impl1_3630, 1);
                var_ha_Sub3.method3862(0, aClass130_3637);
                var_ha_Sub3.method3938(Class247.aClass21_3181, 2 * i_20_,
                        anInterface5_Impl2_3635, 0, 0,
                        i_20_ * 4, 118);
            }
        }
    }

    private final void method2103(byte i, ha_Sub3 var_ha_Sub3) {
        if (i != -33)
            aClass318_Sub9_Sub2ArrayArray3642 = null;
        anInt3639++;
        Class59_Sub1.aFloat5299 = var_ha_Sub3.aFloat8093;
        var_ha_Sub3.method3825(8);
        var_ha_Sub3.method3865(false, i + 89);
        var_ha_Sub3.method3946(-32, false);
        var_ha_Sub3.method3942(5);
    }

    public static void method2104(int i) {
        aClass114_3641 = null;
        if (i < 66)
            method2104(127);
    }

    final void method2105(int i) {
        if (i > -118)
            aClass114_3641 = null;
        anInt3634++;
        anInterface5_Impl1_3638.method21(23315);
    }

    Class280(ha_Sub3 var_ha_Sub3) {
        anInt3626 = 0;
        aClass318_Sub9_Sub2ArrayArray3632 = new Class318_Sub9_Sub2[1600][64];
        anIntArray3631 = new int[8191];
        aClass318_Sub9_Sub2ArrayArray3642 = new Class318_Sub9_Sub2[64][768];
        anIntArray3636 = new int[1600];
        aClass130_3637
                = (var_ha_Sub3.method3812
                (0, (new Class58[]
                        {new Class58(new Class325[]{Class325.aClass325_4073,
                                Class325.aClass325_4076,
                                Class325.aClass325_4078}),
                                new Class58(Class325.aClass325_4075)})));
        anInterface5_Impl1_3638 = var_ha_Sub3.method3889(true, 16711680);
        anInterface5_Impl1_3630 = var_ha_Sub3.method3889(false, 16711680);
        anInterface5_Impl1_3630.method20(393168, (byte) 124, 12);
        anInterface5_Impl2_3635 = var_ha_Sub3.method3840(-28633, false);
        anInterface5_Impl2_3635.method23(15959, 49146);
        Buffer buffer = anInterface5_Impl2_3635.method24(true, false);
        if (buffer != null) {
            Stream stream = var_ha_Sub3.method3893(buffer, 9179);
            if (Stream.c()) {
                for (int i = 0; i < 8191; i++) {
                    int i_82_ = i * 4;
                    stream.d(i_82_);
                    stream.d(i_82_ + 1);
                    stream.d(i_82_ + 2);
                    stream.d(2 + i_82_);
                    stream.d(3 + i_82_);
                    stream.d(i_82_);
                }
            } else {
                for (int i = 0; i < 8191; i++) {
                    int i_81_ = 4 * i;
                    stream.a(i_81_);
                    stream.a(1 + i_81_);
                    stream.a(2 + i_81_);
                    stream.a(2 + i_81_);
                    stream.a(3 + i_81_);
                    stream.a(i_81_);
                }
            }
            stream.a();
            anInterface5_Impl2_3635.method22(-23);
        }
        Buffer buffer_83_ = anInterface5_Impl1_3630.method19(true, 26775);
        if (buffer_83_ != null) {
            Stream stream = var_ha_Sub3.method3893(buffer_83_, 9179);
            if (Stream.c()) {
                for (int i = 0; i < 8191; i++) {
                    stream.a(0.0F);
                    stream.a(-1.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(-1.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(-1.0F);
                    stream.a(0.0F);
                    stream.a(0.0F);
                    stream.a(-1.0F);
                    stream.a(0.0F);
                }
            } else {
                for (int i = 0; i < 8191; i++) {
                    stream.b(0.0F);
                    stream.b(-1.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(-1.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(-1.0F);
                    stream.b(0.0F);
                    stream.b(0.0F);
                    stream.b(-1.0F);
                    stream.b(0.0F);
                }
            }
            stream.a();
            anInterface5_Impl1_3630.method18(6331);
        }
    }
}
