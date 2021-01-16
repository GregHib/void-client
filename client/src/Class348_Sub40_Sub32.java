/* Class348_Sub40_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub32 extends Class348_Sub40 {
    static int anInt9414;
    static Class273 aClass273_9415 = new Class273("", 12);
    static int anInt9416;
    static int anInt9417;
    static int anInt9418;
    static int anInt9419;
    static int anInt9420;
    private static short[] aShortArray9421 = {-10304, 9104, 25485, 4620, 4540};
    private static short[] aShortArray9422 = {-1, -1, -1, -1, -1};
    private static short[] aShortArray9423 = {6798, 8741, 25238, 4626, 4550};
    static short[][] aShortArrayArray9424 = {aShortArray9423, aShortArray9421, aShortArray9422};

    static final Class258_Sub3_Sub1 method3132(int[] is, int i, int i_0_, int i_1_, int i_2_, ha_Sub2 var_ha_Sub2, boolean bool, byte i_3_) {
        try {
            if (i_3_ != 12) method3134(9);
            anInt9418++;
            if (!var_ha_Sub2.aBoolean7793 && (!Class192.method1436(-74, i_2_) || !Class192.method1436(127, i_1_))) {
                if (!var_ha_Sub2.aBoolean7837) return (new Class258_Sub3_Sub1(var_ha_Sub2, i_2_, i_1_, Class33.method340(i_2_, (byte) 108), Class33.method340(i_1_, (byte) 108), is));
                return new Class258_Sub3_Sub1(var_ha_Sub2, 34037, i_2_, i_1_, bool, is, i_0_, i);
            }
            return new Class258_Sub3_Sub1(var_ha_Sub2, 3553, i_2_, i_1_, bool, is, i_0_, i);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("wi.C(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + bool + ',' + i_3_ + ')'));
        }
    }

    public static void method3133(byte i) {
        aClass273_9415 = null;
        if (i != -109) aClass273_9415 = null;
        aShortArray9423 = null;
        aShortArray9421 = null;
        aShortArrayArray9424 = null;
        aShortArray9422 = null;
    }

    static final void method3134(int i) {
        anInt9419++;
        if ((~Class286_Sub5.anInt6248) <= i) {
            long l = Class62.method599(i ^ 0x3c);
            Class286_Sub5.anInt6248 -= -Class348_Sub33.aLong6963 + l;
            if (Class286_Sub5.anInt6248 > 0) {
                int i_4_ = ((Class286_Sub5.anInt6248 << 1553370600) / Class206.anInt4889);
                int i_5_ = -i_4_ + 255;
                float f = (float) i_4_ / 255.0F;
                float f_6_ = 1.0F - f;
                Class119_Sub1.anInt4703 = (((i_5_ * ((Class239_Sub14.aClass190_5990.anInt2540) & 0xff00ff) + (Class318_Sub1_Sub3.anInt8739 & 0xff00ff) * i_4_) & ~0xff00ff) - -(0xff0000 & (i_4_ * (0xff00 & Class318_Sub1_Sub3.anInt8739) + (0xff00 & (Class239_Sub14.aClass190_5990.anInt2540)) * i_5_))) >>> -2125200792;
                Class239_Sub10.aFloat5945 = (Class258_Sub4.aFloat8560 + f_6_ * ((Class239_Sub14.aClass190_5990.aFloat2551) - Class258_Sub4.aFloat8560));
                Class348_Sub3.aFloat6586 = (Class239_Sub14.aClass190_5990.aFloat2545 - Class45.aFloat670) * f_6_ + Class45.aFloat670;
                Class36.anInt486 = (i_4_ * Class239_Sub19.anInt6042 + (Class239_Sub14.aClass190_5990.anInt2546 * i_5_)) >> 1063786664;
                Class160.aFloat2137 = (Class318_Sub1_Sub1.aFloat8725 + (-Class318_Sub1_Sub1.aFloat8725 + (Class239_Sub14.aClass190_5990.aFloat2547)) * f_6_);
                Class244.aFloat4626 = (Class64.aFloat1136 + f_6_ * ((Class239_Sub14.aClass190_5990.aFloat2544) - Class64.aFloat1136));
                Class187.anInt2500 = (((i_4_ * (0xff00 & Canvas_Sub1.anInt70) + (0xff00 & (Class239_Sub14.aClass190_5990.anInt2549)) * i_5_) & 0xff0000) + (~0xff00ff & (i_4_ * (0xff00ff & Canvas_Sub1.anInt70) - -(i_5_ * (0xff00ff & (Class239_Sub14.aClass190_5990.anInt2549)))))) >>> -10587896;
                Class361.aFloat4455 = (Class246.aFloat3177 + f_6_ * (-Class246.aFloat3177 + (Class239_Sub14.aClass190_5990.aFloat2536)));
                Class269.aFloat3462 = (Class245.aFloat3172 + (Class239_Sub14.aClass190_5990.aFloat2542 - Class245.aFloat3172) * f_6_);
                if (Class239_Sub24.aClass299_6098 != (Class239_Sub14.aClass190_5990.aClass299_2541)) Class158.aClass299_4938 = (Class60.aHa1098.method3706(Class239_Sub24.aClass299_6098, (Class239_Sub14.aClass190_5990.aClass299_2541), f_6_, Class158.aClass299_4938));
            } else {
                Class158.aClass299_4938 = (Class239_Sub14.aClass190_5990.aClass299_2541);
                Class244.aFloat4626 = Class239_Sub14.aClass190_5990.aFloat2544;
                Class348_Sub3.aFloat6586 = Class239_Sub14.aClass190_5990.aFloat2545;
                Class239_Sub10.aFloat5945 = Class239_Sub14.aClass190_5990.aFloat2551;
                Class36.anInt486 = Class239_Sub14.aClass190_5990.anInt2546;
                Class269.aFloat3462 = Class239_Sub14.aClass190_5990.aFloat2542;
                Class361.aFloat4455 = Class239_Sub14.aClass190_5990.aFloat2536;
                Class286_Sub5.anInt6248 = -1;
                Class187.anInt2500 = Class239_Sub14.aClass190_5990.anInt2549;
                Class119_Sub1.anInt4703 = Class239_Sub14.aClass190_5990.anInt2540;
                Class160.aFloat2137 = Class239_Sub14.aClass190_5990.aFloat2547;
            }
            Class348_Sub33.aLong6963 = l;
        }
    }

    static final Class318_Sub1_Sub5 method3135(int i, int i_7_, int i_8_) {
        Class357 class357 = Class147.aClass357ArrayArrayArray2029[i][i_7_][i_8_];
        if (class357 == null) return null;
        return class357.aClass318_Sub1_Sub5_4395;
    }

    final int[][] method3047(int i, int i_9_) {
        if (i_9_ != -1564599039) method3133((byte) 4);
        anInt9417++;
        int[][] is = this.aClass322_7033.method2557(-78, i);
        if (this.aClass322_7033.aBoolean4035) {
            int[][] is_10_ = this.method3039((byte) -104, i, 0);
            int[] is_11_ = is_10_[0];
            int[] is_12_ = is_10_[1];
            int[] is_13_ = is_10_[2];
            int[] is_14_ = is[0];
            int[] is_15_ = is[1];
            int[] is_16_ = is[2];
            for (int i_17_ = 0; Class348_Sub40_Sub6.anInt9139 > i_17_; i_17_++) {
                is_14_[i_17_] = -is_11_[i_17_] + 4096;
                is_15_[i_17_] = 4096 + -is_12_[i_17_];
                is_16_[i_17_] = -is_13_[i_17_] + 4096;
            }
        }
        return is;
    }

    public Class348_Sub40_Sub32() {
        super(1, false);
    }

    final int[] method3042(int i, int i_18_) {
        anInt9420++;
        int[] is = this.aClass191_7032.method1433(0, i);
        if (i_18_ != 255) method3047(-113, -46);
        if (this.aClass191_7032.aBoolean2570) {
            int[] is_19_ = this.method3048(i, 633706337, 0);
            for (int i_20_ = 0; (i_20_ < Class348_Sub40_Sub6.anInt9139); i_20_++)
                is[i_20_] = 4096 + -is_19_[i_20_];
        }
        return is;
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_21_) {
        anInt9414++;
        if (i_21_ != 31015) aClass273_9415 = null;
        if (i == 0) this.aBoolean7045 = class348_sub49.method3387(255) == 1;
    }

    static final String method3136(byte i, Class348_Sub49 class348_sub49) {
        anInt9416++;
        if (i != 64) aShortArray9423 = null;
        return Class373_Sub2.method3607(32767, class348_sub49, -77);
    }
}
