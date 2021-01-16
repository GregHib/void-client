/* Class348_Sub40_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub30 extends Class348_Sub40 {
    static int anInt9383 = 0;
    static int anInt9384;
    static int anInt9385 = 0;
    private int anInt9386;
    static int anInt9387;
    static int anInt9388;
    private int anInt9389;
    private int anInt9390 = 0;
    static int anInt9391;
    private int anInt9392;
    static int anInt9393;
    static int anInt9394;
    static int anInt9395;
    private int anInt9396;
    static int anInt9397;
    private int anInt9398 = 0;
    static int anInt9399 = -1;
    private int anInt9400;
    private int anInt9401;
    private int anInt9402 = 0;
    static boolean aBoolean9403 = false;

    static final void method3126(byte i) {
        if (i != 98) anInt9388 = 46;
        Class60.aHa1098.method3700(Class239_Sub10.aFloat5945, Class348_Sub3.aFloat6586, Class269.aFloat3462);
        anInt9387++;
    }

    public Class348_Sub40_Sub30() {
        super(1, false);
    }

    static final Class348_Sub42_Sub15 method3127(int i) {
        anInt9395++;
        if (i != 2681) aBoolean9403 = true;
        Class348_Sub42_Sub15 class348_sub42_sub15 = ((Class348_Sub42_Sub15) Class367_Sub4.aClass107_7325.method1011(-47));
        if (class348_sub42_sub15 != null) {
            class348_sub42_sub15.method2715((byte) 81);
            class348_sub42_sub15.method3162(true);
            return class348_sub42_sub15;
        }
        do {
            class348_sub42_sub15 = (Class348_Sub42_Sub15) s_Sub2.aClass107_8241.method1011(-87);
            if (class348_sub42_sub15 == null) return null;
            if (Class62.method599(-59) < class348_sub42_sub15.method3250((byte) -51)) return null;
            class348_sub42_sub15.method2715((byte) 113);
            class348_sub42_sub15.method3162(true);
        } while ((~0x7fffffffffffffffL & class348_sub42_sub15.aLong7057) == 0L);
        return class348_sub42_sub15;
    }

    static final void method3128(int i, String string) {
        do {
            try {
                anInt9391++;
                if (string != null) {
                    if (anInt9383 >= 200 && !Class206.aBoolean4888 || anInt9383 >= 200) {
                        Class59.method544((Class274.aClass274_3493.method2063(Class348_Sub33.anInt6967, 544)), false, 4);
                        String string_0_ = Class274.aClass274_3494.method2063(Class348_Sub33.anInt6967, 544);
                        if (string_0_ != null) Class59.method544(string_0_, false, 4);
                    } else {
                        String string_1_ = Class285_Sub1.method2127(2, string);
                        if (string_1_ != null) {
                            for (int i_2_ = 0; (anInt9383 > i_2_); i_2_++) {
                                String string_3_ = (Class285_Sub1.method2127(2, Class83.aStringArray1441[i_2_]));
                                if (string_3_ != null && string_3_.equals(string_1_)) {
                                    Class59.method544((string + (Class274.aClass274_3521.method2063((Class348_Sub33.anInt6967), 544))), false, 4);
                                    return;
                                }
                                if (Class286_Sub2.aStringArray6205[i_2_] != null) {
                                    String string_4_ = (Class285_Sub1.method2127(2, (Class286_Sub2.aStringArray6205[i_2_])));
                                    if (string_4_ != null && string_4_.equals(string_1_)) {
                                        Class59.method544((string + (Class274.aClass274_3521.method2063(Class348_Sub33.anInt6967, 544))), false, 4);
                                        return;
                                    }
                                }
                            }
                            for (int i_5_ = 0; i_5_ < Class348_Sub42_Sub12.anInt9604; i_5_++) {
                                String string_6_ = (Class285_Sub1.method2127(2, Class51.aStringArray932[i_5_]));
                                if (string_6_ != null && string_6_.equals(string_1_)) {
                                    Class59.method544(((Class274.aClass274_3526.method2063(Class348_Sub33.anInt6967, 544)) + string + (Class274.aClass274_3527.method2063(Class348_Sub33.anInt6967, 544))), false, 4);
                                    return;
                                }
                                if (Class348_Sub40_Sub21.aStringArray9275[i_5_] != null) {
                                    String string_7_ = (Class285_Sub1.method2127(2, (Class348_Sub40_Sub21.aStringArray9275[i_5_])));
                                    if (string_7_ != null && string_7_.equals(string_1_)) {
                                        Class59.method544(((Class274.aClass274_3526.method2063(Class348_Sub33.anInt6967, 544)) + string + (Class274.aClass274_3527.method2063(Class348_Sub33.anInt6967, 544))), false, 4);
                                        return;
                                    }
                                }
                            }
                            if (Class285_Sub1.method2127(2, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.aString10544)).equals(string_1_)) Class59.method544((Class274.aClass274_3524.method2063(Class348_Sub33.anInt6967, 544)), false, 4);
                            else {
                                Class146.anInt2012++;
                                Class348_Sub47 class348_sub47 = (Class286_Sub3.method2148(Class294.aClass351_5057, Class348_Sub23_Sub2.aClass77_9029, -85));
                                class348_sub47.aClass348_Sub49_Sub2_7116.method3378(false, Class239_Sub6.method1745(string, -65));
                                class348_sub47.aClass348_Sub49_Sub2_7116.method3333((byte) -5, string);
                                Class348_Sub42_Sub14.method3243(123, class348_sub47);
                                if (i <= -31) break;
                                method3127(-4);
                            }
                        }
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("vj.B(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final int[][] method3047(int i, int i_8_) {
        anInt9393++;
        int[][] is = this.aClass322_7033.method2557(-105, i);
        if (this.aClass322_7033.aBoolean4035) {
            int[][] is_9_ = this.method3039((byte) 50, i, 0);
            int[] is_10_ = is_9_[0];
            int[] is_11_ = is_9_[1];
            int[] is_12_ = is_9_[2];
            int[] is_13_ = is[0];
            int[] is_14_ = is[1];
            int[] is_15_ = is[2];
            for (int i_16_ = 0; (i_16_ < Class348_Sub40_Sub6.anInt9139); i_16_++) {
                method3129(is_10_[i_16_], is_11_[i_16_], (byte) 82, is_12_[i_16_]);
                anInt9401 += anInt9390;
                anInt9400 += anInt9402;
                anInt9389 += anInt9398;
                for (/**/; anInt9400 < 0; anInt9400 += 4096) {
                    /* empty */
                }
                if (anInt9401 < 0) anInt9401 = 0;
                for (/**/; anInt9400 > 4096; anInt9400 -= 4096) {
                    /* empty */
                }
                if (anInt9389 < 0) anInt9389 = 0;
                if (anInt9401 > 4096) anInt9401 = 4096;
                if (anInt9389 > 4096) anInt9389 = 4096;
                method3130(anInt9389, anInt9400, (byte) -120, anInt9401);
                is_13_[i_16_] = anInt9386;
                is_14_[i_16_] = anInt9396;
                is_15_[i_16_] = anInt9392;
            }
        }
        if (i_8_ != -1564599039) anInt9399 = 25;
        return is;
    }

    private final void method3129(int i, int i_17_, byte i_18_, int i_19_) {
        anInt9394++;
        int i_20_ = Math.max(i_17_, i);
        if (i_18_ == 82) {
            i_20_ = Math.max(i_19_, i_20_);
            int i_21_ = Math.min(i, i_17_);
            i_21_ = Math.min(i_19_, i_21_);
            anInt9389 = (i_20_ + i_21_) / 2;
            int i_22_ = i_20_ - i_21_;
            if (i_22_ > 0) {
                int i_23_ = (i_20_ + -i << -747580724) / i_22_;
                int i_24_ = (i_20_ + -i_17_ << -350784244) / i_22_;
                int i_25_ = (-i_19_ + i_20_ << -1252014868) / i_22_;
                if (i == i_20_) anInt9400 = (i_17_ != i_21_ ? 4096 + -i_24_ : i_25_ + 20480);
                else if (i_17_ != i_20_) anInt9400 = i != i_21_ ? -i_23_ + 20480 : 12288 - -i_24_;
                else anInt9400 = (i_21_ == i_19_ ? 4096 + i_23_ : -i_25_ + 12288);
                anInt9400 /= 6;
            } else anInt9400 = 0;
            if (anInt9389 > 0 && anInt9389 < 4096) anInt9401 = (i_22_ << 1825032396) / (anInt9389 > 2048 ? 8192 - anInt9389 * 2 : anInt9389 * 2);
            else anInt9401 = 0;
        }
    }

    private final void method3130(int i, int i_26_, byte i_27_, int i_28_) {
        anInt9397++;
        int i_29_ = 31 / ((i_27_ - -74) / 40);
        int i_30_ = (i > 2048 ? i_28_ + (i - (i * i_28_ >> -947995028)) : i * (4096 - -i_28_) >> -1900506004);
        if (i_30_ <= 0) anInt9386 = anInt9396 = anInt9392 = i;
        else {
            i_26_ *= 6;
            int i_31_ = -i_30_ + i - -i;
            int i_32_ = (-i_31_ + i_30_ << 44203052) / i_30_;
            int i_33_ = i_26_ >> 1177620780;
            int i_34_ = i_26_ + -(i_33_ << 1663702028);
            int i_35_ = i_30_;
            i_35_ = i_35_ * i_32_ >> -598033268;
            i_35_ = i_35_ * i_34_ >> 236386604;
            int i_36_ = i_35_ + i_31_;
            int i_37_ = i_30_ - i_35_;
            int i_38_ = i_33_;
            while_208_:
            do {
                while_207_:
                do {
                    while_206_:
                    do {
                        while_205_:
                        do {
                            do {
                                if (i_38_ == 0) {
                                    anInt9396 = i_36_;
                                    anInt9386 = i_30_;
                                    anInt9392 = i_31_;
                                    return;
                                } else if (i_38_ != 1) {
                                    if (i_38_ != 2) {
                                        if (i_38_ != 3) {
                                            if (i_38_ != 4) {
                                                if (i_38_ != 5) break while_208_;
                                            } else break while_206_;
                                            break while_207_;
                                        }
                                    } else break;
                                    break while_205_;
                                }
                                anInt9392 = i_31_;
                                anInt9386 = i_37_;
                                anInt9396 = i_30_;
                                return;
                            } while (false);
                            anInt9392 = i_36_;
                            anInt9386 = i_31_;
                            anInt9396 = i_30_;
                            return;
                        } while (false);
                        anInt9396 = i_37_;
                        anInt9386 = i_31_;
                        anInt9392 = i_30_;
                        return;
                    } while (false);
                    anInt9396 = i_31_;
                    anInt9386 = i_36_;
                    anInt9392 = i_30_;
                    return;
                } while (false);
                anInt9386 = i_30_;
                anInt9392 = i_37_;
                anInt9396 = i_31_;
            } while (false);
        }
    }

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_39_) {
        while_209_:
        do {
            try {
                anInt9384++;
                if (i_39_ == 31015) {
                    int i_40_ = i;
                    do {
                        if (i_40_ == 0) {
                            anInt9402 = class348_sub49.method3372(13638);
                            return;
                        } else if (i_40_ != 1) {
                            if (i_40_ == 2) break;
                            break while_209_;
                        }
                        anInt9390 = (class348_sub49.method3388(-83) << 1365062124) / 100;
                        return;
                    } while (false);
                    anInt9398 = (class348_sub49.method3388(i_39_ + -31101) << 1792937036) / 100;
                    break;
                }
                break;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("vj.F(" + (class348_sub49 != null ? "{...}" : "null") + ',' + i + ',' + i_39_ + ')'));
            }
        } while (false);
    }
}
