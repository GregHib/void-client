/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245 {
    private static int[] anIntArray3169 = new int[3];
    static int anInt3170;
    static int anInt3171;
    static float aFloat3172;

    public static void method1882(int i) {
        if (i != 25365) anInt3170 = 100;
        anIntArray3169 = null;
    }

    static final void method1883(Class318 class318, Class318 class318_0_, boolean bool) {
        try {
            anInt3171++;
            if (class318_0_.aClass318_3976 != null) class318_0_.method2373(false);
            class318_0_.aClass318_3970 = class318;
            if (bool != true) anIntArray3169 = null;
            class318_0_.aClass318_3976 = class318.aClass318_3976;
            class318_0_.aClass318_3976.aClass318_3970 = class318_0_;
            class318_0_.aClass318_3970.aClass318_3976 = class318_0_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("te.B(" + (class318 != null ? "{...}" : "null") + ',' + (class318_0_ != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    static final void method1884() {
        int i = 10;
        int i_1_ = 30;
        if (Class348_Sub18.anInt6818 != 0 && Class362.aClass324_4456 != null) {
            Class9.aHa171.K(Class348_Sub40_Sub10.anIntArray9183);
            for (int i_2_ = 0; i_2_ < Class17.anIntArray256.length; i_2_++)
                Class9.aHa171.method3660((Class17.anIntArray256[i_2_] + Class345.anIntArray4271[i_2_]), -256, (Class348_Sub40_Sub10.anIntArray9183[3] - Class348_Sub40_Sub10.anIntArray9183[1]), Class348_Sub40_Sub10.anIntArray9183[1], true);
            for (int i_3_ = 0; i_3_ < Class348_Sub42_Sub10.anInt9577; i_3_++) {
                Class338 class338 = Class348_Sub42_Sub19.aClass338Array9700[i_3_];
                Class9.aHa171.H(class338.anIntArray4187[0], class338.anIntArray4191[0], class338.anIntArray4184[0], Class177.anIntArray4670);
                Class9.aHa171.H(class338.anIntArray4187[1], class338.anIntArray4191[1], class338.anIntArray4184[1], Class13.anIntArray222);
                Class9.aHa171.H(class338.anIntArray4187[2], class338.anIntArray4191[2], class338.anIntArray4184[2], anIntArray3169);
                Class9.aHa171.H(class338.anIntArray4187[3], class338.anIntArray4191[3], class338.anIntArray4184[3], Class99.anIntArray1574);
                if (Class177.anIntArray4670[2] != -1 && Class13.anIntArray222[2] != -1 && anIntArray3169[2] != -1 && Class99.anIntArray1574[2] != -1) {
                    int i_4_ = -65536;
                    if (class338.aByte4192 == 4) i_4_ = -16776961;
                    Class9.aHa171.method3645(Class177.anIntArray4670[1], Class177.anIntArray4670[0], Class13.anIntArray222[0], -8003, i_4_, Class13.anIntArray222[1]);
                    Class9.aHa171.method3645(Class13.anIntArray222[1], Class13.anIntArray222[0], anIntArray3169[0], -8003, i_4_, anIntArray3169[1]);
                    Class9.aHa171.method3645(anIntArray3169[1], anIntArray3169[0], Class99.anIntArray1574[0], -8003, i_4_, Class99.anIntArray1574[1]);
                    Class9.aHa171.method3645(Class99.anIntArray1574[1], Class99.anIntArray1574[0], Class177.anIntArray4670[0], -8003, i_4_, Class177.anIntArray4670[1]);
                    Class9.aHa171.method3645(Class177.anIntArray4670[1], Class177.anIntArray4670[0], anIntArray3169[0], -8003, i_4_, anIntArray3169[1]);
                }
            }
            Class362.aClass324_4456.method2576(("Dynamic: " + Class86.anInt1477 + "/" + 5000), -256, i_1_ + 45, i, -16777216, -120);
            Class362.aClass324_4456.method2576(("Total Opaque Onscreen: " + Class5_Sub1_Sub1.anInt9930 + "/" + 10000), -256, i_1_ + 60, i, -16777216, -124);
            Class362.aClass324_4456.method2576(("Total Trans Onscreen: " + Class348_Sub42_Sub3.anInt9504 + "/" + 5000), -256, i_1_ + 75, i, -16777216, -111);
            Class362.aClass324_4456.method2576(("Occluders: " + (Class239_Sub26.anInt6115 + Class69.anInt1200) + " Active: " + (Class348_Sub42_Sub10.anInt9577)), -256, i_1_ + 90, i, -16777216, -111);
            Class362.aClass324_4456.method2576(("Occluded: Ground:" + Class348_Sub23_Sub2.anInt9039 + " Walls: " + Class42.anInt562 + " CPs: " + Class348_Sub40_Sub4.anInt9112 + " Pixels: " + Class225.anInt2946), -256, i_1_ + 105, i, -16777216, -115);
            Class362.aClass324_4456.method2576(("Occlude Calc Took: " + (Class286_Sub6.aLong6276 / 1000L) + "us"), -256, i_1_ + 120, i, -16777216, -123);
            if (Class348_Sub18.anInt6818 == 2 && Class14.anIntArray5091 != null) {
                for (int i_5_ = 0; i_5_ < Class14.anIntArray5091.length; i_5_++) {
                    float f = (float) Class14.anIntArray5091[i_5_];
                    f /= 4194304.0F;
                    if (f > 1.0F) f = 1.0F;
                    f *= 255.0F;
                    f = 255.0F - f;
                    int i_6_ = (int) f;
                    Class14.anIntArray5091[i_5_] = i_6_ | i_6_ << 8 | i_6_ << 16 | ~0xffffff;
                }
                Class105 class105 = Class9.aHa171.method3662(Class306.anInt3872, Class14.anIntArray5091, (byte) 94, 0, Class306.anInt3872, Class86.anInt1480);
                class105.method964(i, 170, 1, 0, 0);
            }
        }
    }
}
