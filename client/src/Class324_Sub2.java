/* Class324_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class324_Sub2 extends Class324 {
    private final Interface18_Impl3 anInterface18_Impl3_6492;
    private final boolean aBoolean6493;
    private final ha_Sub3 aHa_Sub3_6494;
    private final Interface5_Impl1 anInterface5_Impl1_6495;

    final void method2578(char c, int i, int i_0_, int i_1_, boolean bool,
                          aa var_aa, int i_2_, int i_3_) {
        /* empty */
    }

    Class324_Sub2(ha_Sub3 var_ha_Sub3, Class143 class143, Class207[] class207s,
                  boolean bool) {
        super(var_ha_Sub3, class143);
        aHa_Sub3_6494 = var_ha_Sub3;
        int i = 0;
        for (int i_4_ = 0; i_4_ < 256; i_4_++) {
            Class207 class207 = class207s[i_4_];
            if (class207.anInt2696 > i)
                i = class207.anInt2696;
            if (class207.anInt2702 > i)
                i = class207.anInt2702;
        }
        int i_5_ = i * 16;
        if (bool) {
            byte[] is = new byte[i_5_ * i_5_];
            for (int i_6_ = 0; i_6_ < 256; i_6_++) {
                Class207 class207 = class207s[i_6_];
                int i_7_ = class207.anInt2696;
                int i_8_ = class207.anInt2702;
                int i_9_ = i_6_ % 16 * i;
                int i_10_ = i_6_ / 16 * i;
                int i_11_ = i_10_ * i_5_ + i_9_;
                int i_12_ = 0;
                if (class207.aByteArray2695 == null) {
                    byte[] is_13_ = class207.aByteArray2699;
                    for (int i_14_ = 0; i_14_ < i_7_; i_14_++) {
                        for (int i_15_ = 0; i_15_ < i_8_; i_15_++)
                            is[i_11_++]
                                    = (byte) (is_13_[i_12_++] == 0 ? 0 : -1);
                        i_11_ += i_5_ - i_8_;
                    }
                } else {
                    byte[] is_16_ = class207.aByteArray2695;
                    for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
                        for (int i_18_ = 0; i_18_ < i_8_; i_18_++)
                            is[i_11_++] = is_16_[i_12_++];
                        i_11_ += i_5_ - i_8_;
                    }
                }
            }
            if (!var_ha_Sub3.method3880(Class68.aClass68_1183,
                    Class348_Sub40_Sub38.aClass304_9471,
                    (byte) 126)) {
                int[] is_19_ = new int[is.length];
                for (int i_20_ = 0; i_20_ < is.length; i_20_++)
                    is_19_[i_20_] = is[i_20_] << 24;
                anInterface18_Impl3_6492
                        = var_ha_Sub3.method3839(i_5_, i_5_, -15137, false,
                        is_19_);
            } else
                anInterface18_Impl3_6492
                        = var_ha_Sub3.method3944(is, i_5_,
                        (Class348_Sub40_Sub38
                                .aClass304_9471),
                        2, false, i_5_);
            aBoolean6493 = true;
        } else {
            int[] is = new int[i_5_ * i_5_];
            for (int i_21_ = 0; i_21_ < 256; i_21_++) {
                Class207 class207 = class207s[i_21_];
                int[] is_22_ = class207.anIntArray2697;
                byte[] is_23_ = class207.aByteArray2695;
                byte[] is_24_ = class207.aByteArray2699;
                int i_25_ = class207.anInt2696;
                int i_26_ = class207.anInt2702;
                int i_27_ = i_21_ % 16 * i;
                int i_28_ = i_21_ / 16 * i;
                int i_29_ = i_28_ * i_5_ + i_27_;
                int i_30_ = 0;
                if (is_23_ != null) {
                    for (int i_31_ = 0; i_31_ < i_25_; i_31_++) {
                        for (int i_32_ = 0; i_32_ < i_26_; i_32_++) {
                            is[i_29_++] = (is_23_[i_30_] << 24
                                    | is_22_[is_24_[i_30_] & 0xff]);
                            i_30_++;
                        }
                        i_29_ += i_5_ - i_26_;
                    }
                } else {
                    for (int i_33_ = 0; i_33_ < i_25_; i_33_++) {
                        for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
                            int i_35_;
                            if ((i_35_ = is_24_[i_30_++]) != 0)
                                is[i_29_++] = ~0xffffff | is_22_[i_35_ & 0xff];
                            else
                                i_29_++;
                        }
                        i_29_ += i_5_ - i_26_;
                    }
                }
            }
            anInterface18_Impl3_6492
                    = var_ha_Sub3.method3839(i_5_, i_5_, -15137, false, is);
            aBoolean6493 = false;
        }
        anInterface18_Impl3_6492.method64(Class206.aClass209_4874, -22095);
        anInterface5_Impl1_6495 = var_ha_Sub3.method3889(false, 16711680);
        anInterface5_Impl1_6495.method20(20480, (byte) 126, 20);
        for (int i_36_ = 0; i_36_ < 4; i_36_++) {
            Buffer buffer = anInterface5_Impl1_6495.method19(true, 26775);
            if (buffer != null) {
                Stream stream = aHa_Sub3_6494.method3893(buffer, 9179);
                float f = (anInterface18_Impl3_6492.method67((float) i_5_, 96)
                        / (float) i_5_);
                float f_37_ = (anInterface18_Impl3_6492.method71((byte) -45,
                        (float) i_5_)
                        / (float) i_5_);
                for (int i_38_ = 0; i_38_ < 256; i_38_++) {
                    Class207 class207 = class207s[i_38_];
                    int i_39_ = class207.anInt2696;
                    int i_40_ = class207.anInt2702;
                    int i_41_ = class207.anInt2700;
                    int i_42_ = class207.anInt2703;
                    float f_43_ = (float) (i_38_ % 16 * i);
                    float f_44_ = (float) (i_38_ / 16 * i);
                    float f_45_ = f_43_ * f;
                    float f_46_ = f_44_ * f_37_;
                    float f_47_ = (f_43_ + (float) i_40_) * f;
                    float f_48_ = (f_44_ + (float) i_39_) * f_37_;
                    if (Stream.c()) {
                        stream.a((float) i_42_);
                        stream.a((float) i_41_);
                        stream.a(0.0F);
                        stream.a(f_45_);
                        stream.a(f_46_);
                        stream.a((float) i_42_);
                        stream.a((float) (i_41_ + i_39_));
                        stream.a(0.0F);
                        stream.a(f_45_);
                        stream.a(f_48_);
                        stream.a((float) (i_42_ + i_40_));
                        stream.a((float) (i_41_ + i_39_));
                        stream.a(0.0F);
                        stream.a(f_47_);
                        stream.a(f_48_);
                        stream.a((float) (i_42_ + i_40_));
                        stream.a((float) i_41_);
                        stream.a(0.0F);
                        stream.a(f_47_);
                        stream.a(f_46_);
                    } else {
                        stream.b((float) i_42_);
                        stream.b((float) i_41_);
                        stream.b(0.0F);
                        stream.b(f_45_);
                        stream.b(f_46_);
                        stream.b((float) i_42_);
                        stream.b((float) (i_41_ + i_39_));
                        stream.b(0.0F);
                        stream.b(f_45_);
                        stream.b(f_48_);
                        stream.b((float) (i_42_ + i_40_));
                        stream.b((float) (i_41_ + i_39_));
                        stream.b(0.0F);
                        stream.b(f_47_);
                        stream.b(f_48_);
                        stream.b((float) (i_42_ + i_40_));
                        stream.b((float) i_41_);
                        stream.b(0.0F);
                        stream.b(f_47_);
                        stream.b(f_46_);
                    }
                }
                stream.a();
                if (anInterface5_Impl1_6495.method18(6331))
                    break;
            }
        }
    }

    final void fa(char c, int i, int i_49_, int i_50_, boolean bool) {
        aHa_Sub3_6494.method3927(true);
        aHa_Sub3_6494.method3850((byte) -41, anInterface18_Impl3_6492);
        if (aBoolean6493 || bool) {
            aHa_Sub3_6494.method3874(Class167.aClass229_2207, 112,
                    Class328_Sub3.aClass229_6519);
            aHa_Sub3_6494.method3849((byte) 47, 0,
                    Class348_Sub40_Sub39.aClass70_9485);
            aHa_Sub3_6494.method3894(-28186, i_50_);
        } else
            aHa_Sub3_6494.method3874(Class328_Sub3.aClass229_6519, 126,
                    Class328_Sub3.aClass229_6519);
        Class101_Sub2 class101_sub2 = aHa_Sub3_6494.method3934(-99);
        class101_sub2.method894(i, i_49_, 0);
        aHa_Sub3_6494.method3915(0);
        aHa_Sub3_6494.method3925(54, anInterface5_Impl1_6495, 0);
        aHa_Sub3_6494.method3862(0, aHa_Sub3_6494.aClass130_8204);
        aHa_Sub3_6494.method3899(2, c * '\004',
                Class348_Sub42_Sub16.aClass21_9661, true);
        if (aBoolean6493 || bool)
            aHa_Sub3_6494.method3849((byte) 47, 0, Class342.aClass70_4247);
    }
}
