/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class72 {
    private static Class105 aClass105_1215;
    private int anInt1216;
    private int anInt1217;
    private int anInt1218;
    private int anInt1219;
    private int anInt1220;
    private Class105 aClass105_1221;
    private int anInt1222;
    private boolean aBoolean1223;
    private int anInt1224;
    private int anInt1225;
    private static int[] anIntArray1226 = new int[4];
    private static Class64 aClass64_1227;
    private static Class105 aClass105_1228;
    private int anInt1229;
    private int anInt1230;
    private int anInt1231;
    int anInt1232;

    private final boolean method730(ha var_ha, Class72 class72_0_) {
        if (aClass105_1221 == null) {
            if (anInt1230 == 0) {
                if (Class101_Sub1.aD5684.method4(-7953, anInt1224)) {
                    int[] is = Class101_Sub1.aD5684.method6(-21540, anInt1220,
                            0.7F, anInt1224,
                            false, anInt1220);
                    aClass105_1221
                            = var_ha.method3662(anInt1220, is, (byte) 94, 0,
                            anInt1220, anInt1220);
                }
            } else if (anInt1230 == 2)
                method740(var_ha, class72_0_);
            else if (anInt1230 == 1)
                method735(var_ha, class72_0_);
        }
        if (aClass105_1221 == null)
            return false;
        return true;
    }

    public static void method731() {
        aClass64_1227 = null;
        aClass105_1215 = null;
        aClass105_1228 = null;
        anIntArray1226 = null;
    }

    private static final void method732(ha var_ha) {
        if (aClass105_1228 == null) {
            int[] is = new int[16384];
            int[] is_1_ = new int[16384];
            for (int i = 0; i < 64; i++) {
                int i_2_ = 64 - i;
                i_2_ *= i_2_;
                int i_3_ = 128 - i - 1;
                int i_4_ = i * 128;
                int i_5_ = i_3_ * 128;
                for (int i_6_ = 0; i_6_ < 64; i_6_++) {
                    int i_7_ = 64 - i_6_;
                    i_7_ *= i_7_;
                    int i_8_ = 128 - i_6_ - 1;
                    int i_9_ = 256 - (i_7_ + i_2_ << 8) / 4096;
                    i_9_ = i_9_ * 16 * 192 / 1536;
                    if (i_9_ < 0)
                        i_9_ = 0;
                    else if (i_9_ > 255)
                        i_9_ = 255;
                    int i_10_ = i_9_ / 2;
                    is_1_[i_4_ + i_6_] = is_1_[i_4_ + i_8_]
                            = is_1_[i_5_ + i_6_] = is_1_[i_5_ + i_8_]
                            = ~0xffffff | i_9_ << 16;
                    is[i_4_ + i_6_] = is[i_4_ + i_8_] = is[i_5_ + i_6_]
                            = is[i_5_ + i_8_] = 127 - i_10_ << 24 | 0xffffff;
                }
            }
            aClass105_1228
                    = var_ha.method3662(128, is_1_, (byte) 94, 0, 128, 128);
            aClass105_1215
                    = var_ha.method3662(128, is, (byte) 94, 0, 128, 128);
        }
    }

    final boolean method733(int i, int i_11_, int i_12_, int i_13_) {
        int i_14_;
        int i_15_;
        int i_16_;
        if (!aBoolean1223) {
            i_14_ = anInt1225 - i;
            i_15_ = anInt1216 - i_11_;
            i_16_ = anInt1229 - i_12_;
            ((Class72) this).anInt1232
                    = (int) Math.sqrt((double) (i_14_ * i_14_ + i_15_ * i_15_
                    + i_16_ * i_16_));
            if (((Class72) this).anInt1232 == 0)
                ((Class72) this).anInt1232 = 1;
            i_14_ = (i_14_ << 8) / ((Class72) this).anInt1232;
            i_15_ = (i_15_ << 8) / ((Class72) this).anInt1232;
            i_16_ = (i_16_ << 8) / ((Class72) this).anInt1232;
        } else {
            ((Class72) this).anInt1232 = 1073741823;
            i_14_ = anInt1225;
            i_15_ = anInt1216;
            i_16_ = anInt1229;
        }
        int i_17_ = (int) (Math.sqrt((double) (i_14_ * i_14_ + i_15_ * i_15_
                + i_16_ * i_16_))
                * 256.0);
        if (i_17_ > 128) {
            i_14_ = (i_14_ << 16) / i_17_;
            i_15_ = (i_15_ << 16) / i_17_;
            i_16_ = (i_16_ << 16) / i_17_;
            anInt1217 = anInt1218 * i_13_ / (aBoolean1223 ? 1024
                    : ((Class72) this).anInt1232);
        } else
            anInt1217 = 0;
        if (anInt1217 < 8) {
            aClass105_1221 = null;
            return false;
        }
        int i_18_ = Class33.method340(anInt1217, (byte) 108);
        if (i_18_ > i_13_)
            i_18_ = Class348_Sub40_Sub1.method3051(i_13_, 4096);
        if (i_18_ > 512)
            i_18_ = 512;
        if (i_18_ != anInt1220)
            anInt1220 = i_18_;
        anInt1231 = (int) (Math.asin((double) ((float) i_15_ / 256.0F))
                * 2607.5945876176133) & 0x3fff;
        anInt1219 = (int) (Math.atan2((double) i_14_, (double) -i_16_)
                * 2607.5945876176133) & 0x3fff;
        aClass105_1221 = null;
        return true;
    }

    final void method734() {
        aClass105_1221 = null;
    }

    private final void method735(ha var_ha, Class72 class72_19_) {
        method738(var_ha);
        method732(var_ha);
        var_ha.K(anIntArray1226);
        var_ha.KA(0, 0, anInt1220, anInt1220);
        var_ha.ya();
        var_ha.aa(0, 0, anInt1220, anInt1220, ~0xffffff | anInt1222, 0);
        int i = 0;
        int i_20_ = 0;
        int i_21_ = 256;
        if (class72_19_ != null) {
            if (class72_19_.aBoolean1223) {
                i = -class72_19_.anInt1225;
                i_20_ = -class72_19_.anInt1216;
                i_21_ = -class72_19_.anInt1229;
            } else {
                i = class72_19_.anInt1225 - anInt1225;
                i_20_ = class72_19_.anInt1216 - anInt1216;
                i_21_ = class72_19_.anInt1229 - anInt1229;
            }
        }
        if (anInt1231 != 0) {
            int i_22_ = Class70.anIntArray1207[anInt1231];
            int i_23_ = Class70.anIntArray1204[anInt1231];
            int i_24_ = i_20_ * i_23_ - i_21_ * i_22_ >> 14;
            i_21_ = i_20_ * i_22_ + i_21_ * i_23_ >> 14;
            i_20_ = i_24_;
        }
        if (anInt1219 != 0) {
            int i_25_ = Class70.anIntArray1207[anInt1219];
            int i_26_ = Class70.anIntArray1204[anInt1219];
            int i_27_ = i_21_ * i_25_ + i * i_26_ >> 14;
            i_21_ = i_21_ * i_26_ - i * i_25_ >> 14;
            i = i_27_;
        }
        Class64 class64 = aClass64_1227.method614((byte) 0, 51200, true);
        class64.aa((short) 0, (short) anInt1224);
        var_ha.xa(1.0F);
        var_ha.ZA(16777215, 1.0F, 1.0F, (float) i, (float) i_20_,
                (float) i_21_);
        int i_28_ = 1024 * anInt1220 / (class64.RA() - class64.V());
        if (anInt1222 != 0)
            i_28_ = i_28_ * 13 / 16;
        var_ha.DA(anInt1220 / 2, anInt1220 / 2, i_28_, i_28_);
        var_ha.method3638(var_ha.method3654());
        Class101 class101 = var_ha.method3654();
        class101.method894(0, 0, var_ha.i() - class64.HA());
        class64.method608(class101, null, 1024, 1);
        int i_29_ = anInt1220 * 13 / 16;
        int i_30_ = (anInt1220 - i_29_) / 2;
        aClass105_1215.method970(i_30_, i_30_, i_29_, i_29_, 0,
                ~0xffffff | anInt1222, 1);
        aClass105_1221 = var_ha.method3683(0, 0, anInt1220, anInt1220, true);
        var_ha.ya();
        var_ha.aa(0, 0, anInt1220, anInt1220, 0, 0);
        aClass105_1228.method970(0, 0, anInt1220, anInt1220, 1, 0, 0);
        aClass105_1221.method968(0, 0, 0);
        var_ha.KA(anIntArray1226[0], anIntArray1226[1], anIntArray1226[2],
                anIntArray1226[3]);
    }

    final boolean method736(ha var_ha, Class72 class72_31_) {
        if (aClass105_1221 == null && !method730(var_ha, class72_31_))
            return false;
        return true;
    }

    final void method737(ha var_ha, int i, int i_32_, int i_33_, int i_34_,
                         int i_35_, int i_36_) {
        if (aClass105_1221 != null) {
            int i_37_ = anInt1231 - i_35_ & 0x3fff;
            int i_38_ = anInt1219 - i_36_ & 0x3fff;
            if (i_38_ > 8192)
                i_38_ -= 16384;
            if (i_37_ > 8192)
                i_37_ -= 16384;
            int i_39_ = i_37_ * i_34_ / 4096 + (i_34_ - anInt1217) / 2;
            int i_40_ = i_38_ * i_34_ / -4096 + (i_33_ - anInt1217) / 2;
            if (i_39_ < i_34_ && i_39_ + anInt1217 > 0 && i_40_ < i_33_
                    && i_40_ + anInt1217 > 0)
                aClass105_1221.method973(i_40_ + i, i_39_ + i_32_, anInt1217,
                        anInt1217);
        }
    }

    private static final void method738(ha var_ha) {
        if (aClass64_1227 == null) {
            Class124 class124 = new Class124(580, 1104, 1);
            class124.method1105(109, (byte) 0, (byte) 0, (short) 0,
                    (short) 1024, (byte) 0, (short) 0,
                    (short) 32767, (short) 1024, (short) 1024);
            class124.method1101(128, 0, 0, -93);
            class124.method1101(-128, 0, 0, 108);
            for (int i = 0; i <= 24; i++) {
                int i_41_ = i * 8192 / 24;
                int i_42_ = Class70.anIntArray1207[i_41_];
                int i_43_ = Class70.anIntArray1204[i_41_];
                for (int i_44_ = 1; i_44_ < 24; i_44_++) {
                    int i_45_ = i_44_ * 8192 / 24;
                    int i_46_ = Class70.anIntArray1204[i_45_] >> 7;
                    int i_47_ = Class70.anIntArray1207[i_45_] * i_42_ >> 21;
                    int i_48_ = Class70.anIntArray1207[i_45_] * i_43_ >> 21;
                    class124.method1101(i_46_, -i_47_, i_48_, 127);
                }
                if (i > 0) {
                    int i_49_ = i * 23 + 2;
                    int i_50_ = i_49_ - 23;
                    class124.method1102(0, (byte) 0, (byte) 0, (short) 0,
                            (byte) 52, (short) 127, i_50_,
                            (byte) 0, i_49_);
                    for (int i_51_ = 1; i_51_ < 23; i_51_++) {
                        int i_52_ = i_50_ + 1;
                        int i_53_ = i_49_ + 1;
                        class124.method1102(i_50_, (byte) 0, (byte) 0,
                                (short) 0, (byte) 41, (short) 127,
                                i_52_, (byte) 0, i_49_);
                        class124.method1102(i_52_, (byte) 0, (byte) 0,
                                (short) 0, (byte) 67, (short) 127,
                                i_53_, (byte) 0, i_49_);
                        i_50_ = i_52_;
                        i_49_ = i_53_;
                    }
                    class124.method1102(i_49_, (byte) 0, (byte) 0, (short) 0,
                            (byte) 98, (short) 127, i_50_,
                            (byte) 0, 1);
                }
            }
            ((Class124) class124).anInt1821 = ((Class124) class124).anInt1836;
            ((Class124) class124).anIntArray1824 = null;
            ((Class124) class124).anIntArray1868 = null;
            ((Class124) class124).aByteArray1839 = null;
            aClass64_1227 = var_ha.method3625(class124, 51200, 33, 64, 768);
        }
    }

    static final void method739() {
        aClass64_1227 = null;
        aClass105_1228 = null;
    }

    Class72(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_,
            int i_59_, boolean bool) {
        anInt1225 = i_55_;
        anInt1216 = i_56_;
        anInt1229 = i_57_;
        aBoolean1223 = bool;
        anInt1224 = i_54_;
        anInt1222 = i_59_;
        anInt1218 = i_58_;
        anInt1230 = i;
    }

    private final void method740(ha var_ha, Class72 class72_60_) {
        Class124 class124
                = Class300.method2277(0, Class260.aClass45_3309, anInt1224, -1);
        if (class124 != null) {
            var_ha.K(anIntArray1226);
            var_ha.KA(0, 0, anInt1220, anInt1220);
            var_ha.aa(0, 0, anInt1220, anInt1220, 0, 0);
            int i = 0;
            int i_61_ = 0;
            int i_62_ = 256;
            if (class72_60_ != null) {
                if (class72_60_.aBoolean1223) {
                    i = -class72_60_.anInt1225;
                    i_61_ = -class72_60_.anInt1216;
                    i_62_ = -class72_60_.anInt1229;
                } else {
                    i = anInt1225 - class72_60_.anInt1225;
                    i_61_ = anInt1216 - class72_60_.anInt1216;
                    i_62_ = anInt1229 - class72_60_.anInt1229;
                }
            }
            if (anInt1231 != 0) {
                int i_63_ = -anInt1231 & 0x3fff;
                int i_64_ = Class70.anIntArray1207[i_63_];
                int i_65_ = Class70.anIntArray1204[i_63_];
                int i_66_ = i_61_ * i_65_ - i_62_ * i_64_ >> 14;
                i_62_ = i_61_ * i_64_ + i_62_ * i_65_ >> 14;
                i_61_ = i_66_;
            }
            if (anInt1219 != 0) {
                int i_67_ = -anInt1219 & 0x3fff;
                int i_68_ = Class70.anIntArray1207[i_67_];
                int i_69_ = Class70.anIntArray1204[i_67_];
                int i_70_ = i_62_ * i_68_ + i * i_69_ >> 14;
                i_62_ = i_62_ * i_69_ - i * i_68_ >> 14;
                i = i_70_;
            }
            var_ha.xa(1.0F);
            var_ha.ZA(16777215, 1.0F, 1.0F, (float) i, (float) i_61_,
                    (float) i_62_);
            Class64 class64 = var_ha.method3625(class124, 2048, 0, 64, 768);
            int i_71_ = class64.RA() - class64.V();
            int i_72_ = class64.EA() - class64.fa();
            int i_73_ = class64.V() + i_71_ / 2;
            int i_74_ = class64.fa() + i_72_ / 2;
            int i_75_ = i_71_ > i_72_ ? i_71_ : i_72_;
            var_ha.DA(i_73_, i_74_, i_75_, i_75_);
            var_ha.method3638(var_ha.method3654());
            Class101 class101 = var_ha.method3705();
            class101.method894(0, 0, var_ha.i() - class64.HA());
            class64.method608(class101, null, var_ha.i(), 1);
            aClass105_1221
                    = var_ha.method3683(0, 0, anInt1220, anInt1220, true);
            aClass105_1221.method968(0, 0, 3);
            var_ha.KA(anIntArray1226[0], anIntArray1226[1], anIntArray1226[2],
                    anIntArray1226[3]);
        }
    }
}
