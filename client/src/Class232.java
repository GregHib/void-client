/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class232 {
    private Class258_Sub3 aClass258_Sub3_2998;
    private final Class104 aClass104_2999;
    private final ha_Sub2 aHa_Sub2_3000;
    private Interface8 anInterface8_3001;
    private final int anInt3002;
    private final int anInt3003;
    static int anInt3004;
    static int anInt3005;
    static int anInt3006;
    static int anInt3007;
    private final int anInt3008;
    boolean aBoolean3009 = true;
    private int anInt3010 = -1;
    private Class119_Sub2 aClass119_Sub2_3011;
    static int anInt3012;
    static int anInt3013;
    static int[] anIntArray3014 = new int[1];

    final void method1643(byte[] is, int i, int i_0_, byte i_1_) {
        aClass119_Sub2_3011.method35(is, i, 110,
                aHa_Sub2_3000.method3785(i, 4) * i_0_);
        anInt3005++;
        method1646(aClass119_Sub2_3011, 113, i_0_);
        if (i_1_ < 8)
            method1648((byte) 82);
    }

    final void method1644(byte i) {
        if (i > -83)
            anInt3006 = -60;
        anInt3013++;
        method1646(anInterface8_3001, 115, anInt3008);
    }

    public static void method1645(int i) {
        if (i >= 35)
            anIntArray3014 = null;
    }

    private final void method1646(Interface8 interface8, int i, int i_2_) {
        anInt3007++;
        if (i_2_ != 0) {
            method1648((byte) 121);
            if (i <= 107)
                method1647(-124, -86);
            aHa_Sub2_3000.method3771((byte) -93, aClass258_Sub3_2998);
            aHa_Sub2_3000.method3759(i_2_, -128, 4, interface8, 0);
        }
    }

    static final void method1647(int i, int i_3_) {
        if (i != -128)
            anIntArray3014 = null;
        anInt3012++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(i_3_, (byte) 105, 1);
        class348_sub42_sub15.method3251(-16058);
    }

    Class232(ha_Sub2 var_ha_Sub2, Class104 class104, s_Sub2 var_s_Sub2, int i,
             int i_4_, int i_5_, int i_6_, int i_7_) {
        try {
            aHa_Sub2_3000 = var_ha_Sub2;
            aClass104_2999 = class104;
            anInt3003 = i_6_;
            anInt3002 = i_7_;
            int i_8_ = 1 << i_5_;
            int i_9_ = 0;
            int i_10_ = i << i_5_;
            int i_11_ = i_4_ << i_5_;
            for (int i_12_ = 0; i_8_ > i_12_;
                 i_12_++) {
                int i_13_
                        = var_s_Sub2.anInt4587 * (i_11_ - -i_12_) - -i_10_;
                for (int i_14_ = 0; i_14_ < i_8_;
                     i_14_++) {
                    short[] is
                            = var_s_Sub2.aShortArrayArray8267[i_13_++];
                    if (is != null)
                        i_9_ += is.length;
                }
            }
            anInt3008 = i_9_;
            if (i_9_ <= 0)
                aClass258_Sub3_2998 = null;
            else {
                Class348_Sub49 class348_sub49 = new Class348_Sub49(i_9_ * 2);
                if (!aHa_Sub2_3000.aBoolean7775) {
                    for (int i_15_ = 0;
                         i_8_ > i_15_; i_15_++) {
                        int i_16_
                                = ((i_11_ - -i_15_) * var_s_Sub2.anInt4587
                                - -i_10_);
                        for (int i_17_ = 0;
                             i_8_ > i_17_;
                             i_17_++) {
                            short[] is = (var_s_Sub2
                                    .aShortArrayArray8267[i_16_++]);
                            if (is != null) {
                                for (int i_18_ = 0; is.length > i_18_; i_18_++)
                                    class348_sub49
                                            .method3397(87, is[i_18_] & 0xffff);
                            }
                        }
                    }
                } else {
                    for (int i_19_ = 0;
                         i_8_ > i_19_; i_19_++) {
                        int i_20_
                                = (i_10_
                                + (i_19_ + i_11_) * var_s_Sub2.anInt4587);
                        for (int i_21_ = 0; i_8_ > i_21_; i_21_++) {
                            short[] is = (var_s_Sub2
                                    .aShortArrayArray8267[i_20_++]);
                            if (is != null) {
                                for (int i_22_ = 0;
                                     (i_22_ < is.length);
                                     i_22_++)
                                    class348_sub49.method3337((byte) 107,
                                            (is[i_22_]
                                                    & 0xffff));
                            }
                        }
                    }
                }
                anInterface8_3001
                        = (aHa_Sub2_3000.method3733
                        (5123, -39, class348_sub49.anInt7197,
                                class348_sub49.aByteArray7154,
                                false));
                aClass119_Sub2_3011
                        = new Class119_Sub2(aHa_Sub2_3000, 5123, null, 1);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("sm.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null")
                                    + ',' + (class104 != null ? "{...}" : "null") + ','
                                    + (var_s_Sub2 != null ? "{...}" : "null") + ',' + i
                                    + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
                                    + ')'));
        }
    }

    private final void method1648(byte i) {
        anInt3004++;
        if (this.aBoolean3009) {
            this.aBoolean3009 = false;
            byte[] is = aClass104_2999.aByteArray1617;
            byte[] is_23_ = aHa_Sub2_3000.aByteArray7879;
            if (i > 115) {
                int i_24_ = 0;
                int i_25_ = aClass104_2999.anInt1624;
                int i_26_
                        = (anInt3003
                        - -(anInt3002 * aClass104_2999.anInt1624));
                for (int i_27_ = -128; i_27_ < 0; i_27_++) {
                    i_24_ = (i_24_ << 135697608) + -i_24_;
                    for (int i_28_ = -128; i_28_ < 0; i_28_++) {
                        if (is[i_26_++] != 0)
                            i_24_++;
                    }
                    i_26_ += i_25_ - 128;
                }
                if (aClass258_Sub3_2998 != null && i_24_ == anInt3010)
                    this.aBoolean3009 = false;
                else {
                    anInt3010 = i_24_;
                    i_26_ = anInt3003 - -(i_25_ * anInt3002);
                    int i_29_ = 0;
                    for (int i_30_ = -128; i_30_ < 0;
                         i_30_++) {
                        for (int i_31_ = -128; i_31_ < 0; i_31_++) {
                            if (is[i_26_] != 0)
                                is_23_[i_29_++] = (byte) 68;
                            else {
                                int i_32_ = 0;
                                if (is[i_26_ - 1] != 0)
                                    i_32_++;
                                if (is[1 + i_26_] != 0)
                                    i_32_++;
                                if (is[-i_25_ + i_26_] != 0)
                                    i_32_++;
                                if (is[i_25_ + i_26_] != 0)
                                    i_32_++;
                                is_23_[i_29_++] = (byte) (i_32_ * 17);
                            }
                            i_26_++;
                        }
                        i_26_ += aClass104_2999.anInt1624 - 128;
                    }
                    if (aClass258_Sub3_2998 != null)
                        aClass258_Sub3_2998.method1970
                                (0, 0, 128, false, 0, 128, 6406, -69,
                                        aHa_Sub2_3000.aByteArray7879, 0);
                    else {
                        aClass258_Sub3_2998
                                = new Class258_Sub3(aHa_Sub2_3000, 3553, 6406, 128,
                                128, false,
                                (aHa_Sub2_3000
                                        .aByteArray7879),
                                6406, false);
                        aClass258_Sub3_2998.method1965(false, false, 10243);
                        aClass258_Sub3_2998.method1957(9728, true);
                    }
                }
            }
        }
    }
}
