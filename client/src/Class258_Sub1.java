/* Class258_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class258_Sub1 extends Class258 {
    int anInt8522;
    int anInt8523;
    static int anInt8524;
    private int anInt8525 = -1;
    static int anInt8526;
    static FontMetrics aFontMetrics_8527;
    private int anInt8528 = -1;
    int anInt8529;

    final void method1958(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        this.aHa_Sub2_4851.method3771((byte) -110, this);
        anInt8526++;
        OpenGL.glCopyTexSubImage3D(this.anInt4849, 0, i_2_, i_6_, i_4_, i_3_, i_0_, i_1_, i_5_);
        OpenGL.glFlush();
        if (i != -26823) aFontMetrics_8527 = null;
    }

    public final void method37(int i) {
        anInt8524++;
        OpenGL.glFramebufferTexture3DEXT(anInt8528, anInt8525, this.anInt4849, 0, 0, 0);
        anInt8525 = -1;
        if (i != -3022) method1960(112, -107, -46, -98, null, null, null, null, null, null, -114, (byte) 75, -105, 62, true, false, 110, -31, true);
        anInt8528 = -1;
    }

    Class258_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_7_, int i_8_, int i_9_, byte[] is, int i_10_) {
        super(var_ha_Sub2, 32879, i, i_7_ * (i_8_ * i_9_), false);
        try {
            this.anInt8523 = i_7_;
            this.anInt8522 = i_9_;
            this.anInt8529 = i_8_;
            this.aHa_Sub2_4851.method3771((byte) -84, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, i_10_, 5121, is, 0);
            OpenGL.glPixelStorei(3317, 4);
            this.method1957(9728, true);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("gj.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (is != null ? "{...}" : "null") + ',' + i_10_ + ')'));
        }
    }

    public static void method1959(int i) {
        int i_11_ = -121 / ((-52 - i) / 60);
        aFontMetrics_8527 = null;
    }

    static final void method1960(int i, int i_12_, int i_13_, int i_14_, byte[][][] is, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int i_20_, byte i_21_, int i_22_, int i_23_, boolean bool, boolean bool_24_, int i_25_, int i_26_, boolean bool_27_) {
        Class23.aBoolean351 = true;
        Class318_Sub1_Sub3_Sub3.aBoolean10221 = Class9.aHa171.method3704() > 0;
        Class348_Sub40_Sub17.aBoolean9242 = bool_24_;
        Class239_Sub25.anInt6111 = i_12_ >> Class362.anInt4459;
        Class285_Sub2.anInt8502 = i_14_ >> Class362.anInt4459;
        Class141.anInt1974 = i_12_;
        Class348_Sub40_Sub27.anInt9360 = i_14_;
        Class232.anInt3006 = i_13_;
        Class37.anInt492 = Class239_Sub25.anInt6111 - Class318_Sub1_Sub4_Sub1.anInt10084;
        if (Class37.anInt492 < 0) {
            Sprite_Sub1.anInt8412 = -Class37.anInt492;
            Class37.anInt492 = 0;
        } else Sprite_Sub1.anInt8412 = 0;
        Class348_Sub34.anInt6974 = Class285_Sub2.anInt8502 - Class318_Sub1_Sub4_Sub1.anInt10084;
        if (Class348_Sub34.anInt6974 < 0) {
            Class240.anInt4686 = -Class348_Sub34.anInt6974;
            Class348_Sub34.anInt6974 = 0;
        } else Class240.anInt4686 = 0;
        Class27.anInt387 = Class239_Sub25.anInt6111 + Class318_Sub1_Sub4_Sub1.anInt10084;
        if (Class27.anInt387 > Class318_Sub7.anInt6451) Class27.anInt387 = Class318_Sub7.anInt6451;
        Class59_Sub1.anInt5293 = Class285_Sub2.anInt8502 + Class318_Sub1_Sub4_Sub1.anInt10084;
        if (Class59_Sub1.anInt5293 > Class348_Sub41.anInt7054) Class59_Sub1.anInt5293 = Class348_Sub41.anInt7054;
        boolean[][] bools = Class99.aBooleanArrayArray1572;
        boolean[][] bools_28_ = Class348_Sub8.aBooleanArrayArray6656;
        if (Class348_Sub40_Sub17.aBoolean9242) {
            for (int i_29_ = 0; i_29_ < (Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 2); i_29_++) {
                int i_30_ = 0;
                int i_31_ = 0;
                for (int i_32_ = 0; i_32_ < (Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 2); i_32_++) {
                    if (i_32_ > 1) Class171.anIntArray2272[i_32_ - 2] = i_30_;
                    i_30_ = i_31_;
                    int i_33_ = (Class239_Sub25.anInt6111 - Class318_Sub1_Sub4_Sub1.anInt10084 + i_29_);
                    int i_34_ = (Class285_Sub2.anInt8502 - Class318_Sub1_Sub4_Sub1.anInt10084 + i_32_);
                    if (i_33_ >= 0 && i_34_ >= 0 && i_33_ < Class318_Sub7.anInt6451 && i_34_ < Class348_Sub41.anInt7054) {
                        int i_35_ = i_33_ << Class362.anInt4459;
                        int i_36_ = i_34_ << Class362.anInt4459;
                        int i_37_ = (Class348_Sub1_Sub1.aSArray8801[Class348_Sub1_Sub1.aSArray8801.length - 1].method3982((byte) -86, i_34_, i_33_) - (1000 << Class362.anInt4459 - 7));
                        int i_38_ = (Class332.aSArray4142 != null ? (Class332.aSArray4142[0].method3982((byte) -86, i_34_, i_33_) + Class270.anInt3465) : (Class348_Sub1_Sub1.aSArray8801[0].method3982((byte) -86, i_34_, i_33_) + Class270.anInt3465));
                        i_31_ = (i_25_ >= 0 ? Class9.aHa171.r(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_, i_25_) : Class9.aHa171.JA(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_));
                        Class348_Sub8.aBooleanArrayArray6656[i_29_][i_32_] = i_31_ == 0;
                    } else {
                        i_31_ = -1;
                        Class348_Sub8.aBooleanArrayArray6656[i_29_][i_32_] = false;
                    }
                    if (i_29_ > 0 && i_32_ > 0) {
                        int i_39_ = (Class171.anIntArray2272[i_32_ - 1] & Class171.anIntArray2272[i_32_] & i_30_ & i_31_);
                        Class99.aBooleanArrayArray1572[i_29_ - 1][i_32_ - 1] = i_39_ == 0;
                    }
                }
                Class171.anIntArray2272[(Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084)] = i_30_;
                Class171.anIntArray2272[(Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 1)] = i_31_;
            }
            if (i_25_ >= 0) Class23.aBoolean351 = false;
            else {
                Player.anIntArray10566 = is_15_;
                Class250.anIntArray3220 = is_16_;
                Class59_Sub1_Sub2.anIntArray8666 = is_17_;
                Class299_Sub2_Sub1.anIntArray8712 = is_18_;
                client.anIntArray5176 = is_19_;
                Class348_Sub42_Sub14.method3241(i_20_, (byte) 39, Class9.aHa171);
            }
        } else {
            if (Class369_Sub3.aBooleanArrayArray8596 == null) Class369_Sub3.aBooleanArrayArray8596 = (new boolean
                    [Class318_Sub7.anInt6451 + Class318_Sub7.anInt6451 + 1]
                    [(Class348_Sub41.anInt7054 + Class318_Sub7.anInt6451 + 1)]);
            for (int i_40_ = 0; i_40_ < Class369_Sub3.aBooleanArrayArray8596.length; i_40_++) {
                for (int i_41_ = 0; i_41_ < Class369_Sub3.aBooleanArrayArray8596[0].length; i_41_++)
                    Class369_Sub3.aBooleanArrayArray8596[i_40_][i_41_] = true;
            }
            Class348_Sub8.aBooleanArrayArray6656 = Class369_Sub3.aBooleanArrayArray8596;
            Class99.aBooleanArrayArray1572 = Class369_Sub3.aBooleanArrayArray8596;
            Class37.anInt492 = 0;
            Class348_Sub34.anInt6974 = 0;
            Class27.anInt387 = Class318_Sub7.anInt6451;
            Class59_Sub1.anInt5293 = Class348_Sub41.anInt7054;
            Class23.aBoolean351 = false;
        }
        Class243.method1877(Class9.aHa171, -69);
        if (!Class71.aClass76_1208.aBoolean1283) {
            Class243 class243 = Class71.aClass76_1208.aClass243_1282;
            for (Class318_Sub4 class318_sub4 = (Class318_Sub4) class243.method1872(8); class318_sub4 != null; class318_sub4 = (Class318_Sub4) class243.method1878((byte) 125)) {
                class318_sub4.method2373(false);
                Class59_Sub1_Sub1.method560(class318_sub4, 6);
            }
        }
        if (Class318_Sub1_Sub3_Sub3.aBoolean10221) {
            for (int i_42_ = 0; i_42_ < Class331.anInt4135; i_42_++)
                Class239_Sub14.aClass211Array5993[i_42_].method1544(8688, bool, i);
        }
        if (Class348_Sub40_Sub5.aBoolean9121) {
            Class52.anIntArray4906 = Class9.aHa171.Y();
            Class9.aHa171.K(Class348_Sub40_Sub10.anIntArray9183);
            int i_43_ = ((Class348_Sub40_Sub10.anIntArray9183[2] - Class348_Sub40_Sub10.anIntArray9183[0]) / Class75_Sub1.anInt5652);
            for (int i_44_ = 0; i_44_ < Class75_Sub1.anInt5652 - 1; i_44_++)
                Class17.anIntArray256[i_44_] = i_43_ * (i_44_ + 1) + Class345.anIntArray4271[i_44_];
            for (int i_45_ = 0; i_45_ < Class348_Sub40_Sub34.aClass293Array9432.length; i_45_++)
                Class348_Sub40_Sub34.aClass293Array9432[i_45_].method2209();
        }
        if (Class348_Sub31_Sub2.aClass357ArrayArrayArray9082 != null) {
            if (Class348_Sub40_Sub5.aBoolean9121) Class285_Sub1.method2131(0);
            Class243.method1879(true);
            Class9.aHa171.ra(-1, 1583160, 40, 127);
            Class348_Sub49_Sub1.method3398(true, is, i_20_, i_21_, i_25_, i_26_, bool_27_);
            if (Class348_Sub40_Sub5.aBoolean9121) Class304.method2290();
            Class9.aHa171.pa();
            Class243.method1879(false);
        }
        Class348_Sub49_Sub1.method3398(false, is, i_20_, i_21_, i_25_, i_26_, bool_27_);
        if (Class348_Sub40_Sub5.aBoolean9121) {
            for (int i_46_ = 0; i_46_ < Class189.anInt2524; i_46_++)
                Class5_Sub2.aBooleanArrayArrayArray8361[i_46_] = Class115.aBooleanArrayArrayArray1751[i_46_];
            Class285_Sub1.method2131(0);
            for (int i_47_ = 0; i_47_ < Class348_Sub40_Sub34.aClass293Array9432.length; i_47_++)
                Class348_Sub40_Sub34.aClass293Array9432[i_47_].method2209();
        }
        if (Class348_Sub40_Sub5.aBoolean9121) {
            Class304.method2290();
            for (int i_48_ = 0; i_48_ < Class189.anInt2524; i_48_++)
                Class115.aBooleanArrayArrayArray1751[i_48_] = Class5_Sub2.aBooleanArrayArrayArray8361[i_48_];
            if (Npc.anInt10503 == 2) {
                if (Class146.aLongArray2013[0] < Class146.aLongArray2013[1]) {
                    if (Class17.anIntArray256[0] + Class345.anIntArray4271[0] > Class348_Sub40_Sub10.anIntArray9183[0]) Class345.anIntArray4271[0]++;
                } else if ((Class146.aLongArray2013[0] > Class146.aLongArray2013[1]) && ((Class17.anIntArray256[0] + Class345.anIntArray4271[0]) < Class348_Sub40_Sub10.anIntArray9183[2])) Class345.anIntArray4271[0]--;
            }
        }
        if (!Class348_Sub40_Sub17.aBoolean9242) {
            Class99.aBooleanArrayArray1572 = bools;
            Class348_Sub8.aBooleanArrayArray6656 = bools_28_;
        }
        Class245.method1884();
    }

    Class258_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_49_, int i_50_, int i_51_) {
        super(var_ha_Sub2, 32879, i, i_51_ * i_49_ * i_50_, false);
        this.anInt8523 = i_49_;
        this.anInt8529 = i_50_;
        this.anInt8522 = i_51_;
        this.aHa_Sub2_4851.method3771((byte) -123, this);
        OpenGL.glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, Class348_Sub9.method2779(true, (this.anInt4858)), 5121, null, 0);
        this.method1957(9728, true);
    }
}
