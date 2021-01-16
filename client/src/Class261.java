/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class261 {
    static int anInt3313;
    static Class113 aClass113_3314 = new Class113();
    static int anInt3315;
    static int anInt3316;
    static int anInt3317;
    static int anInt3318;
    private final Class45 aClass45_3319;
    static int anInt3320;
    private final Class60 aClass60_3321 = new Class60(64);
    static int anInt3322;

    public static void method1980(int i) {
        if (i > 92)
            aClass113_3314 = null;
    }

    static final String method1981(String string, byte i, char c,
                                   String string_0_) {
        try {
            anInt3322++;
            int i_1_ = string.length();
            int i_2_ = string_0_.length();
            int i_3_ = i_1_;
            int i_4_ = -1 + i_2_;
            if (i_4_ != 0) {
                int i_5_ = 0;
                for (; ; ) {
                    i_5_ = string.indexOf(c, i_5_);
                    if (i_5_ < 0)
                        break;
                    i_5_++;
                    i_3_ += i_4_;
                }
            }
            StringBuffer stringbuffer = new StringBuffer(i_3_);
            int i_6_ = 0;
            if (i > -77)
                return null;
            for (; ; ) {
                int i_7_ = string.indexOf(c, i_6_);
                if (i_7_ < 0)
                    break;
                stringbuffer.append(string, i_6_, i_7_);
                stringbuffer.append(string_0_);
                i_6_ = i_7_ + 1;
            }
            stringbuffer.append(string.substring(i_6_));
            return stringbuffer.toString();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("uga.H("
                            + (string != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + c + ','
                            + (string_0_ != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    static final void method1982(int i, int i_8_, String string) {
        Class348_Sub42_Sub12.anInt9594++;
        anInt3318++;
        Class348_Sub47 class348_sub47
                = Class286_Sub3.method2148(Class117.aClass351_1766,
                Class348_Sub23_Sub2.aClass77_9029,
                i + -107);
        class348_sub47.aClass348_Sub49_Sub2_7116
                .method3378(false, 1 - -Class239_Sub6.method1745(string, -65));
        if (i == 16) {
            class348_sub47.aClass348_Sub49_Sub2_7116
                    .method3370((byte) -70, i_8_);
            class348_sub47.aClass348_Sub49_Sub2_7116
                    .method3333((byte) -5, string);
            Class348_Sub42_Sub14.method3243(117, class348_sub47);
        }
    }

    final Class225 method1983(int i, int i_9_) {
        anInt3320++;
        Class225 class225;
        synchronized (aClass60_3321) {
            class225 = (Class225) aClass60_3321.method583(i, 69);
        }
        if (class225 != null)
            return class225;
        byte[] is;
        synchronized (aClass45_3319) {
            is = aClass45_3319.method410(-1860, i_9_, i);
        }
        class225 = new Class225();
        if (is != null)
            class225.method1620(new Class348_Sub49(is), -108);
        synchronized (aClass60_3321) {
            aClass60_3321.method582(class225, i, (byte) -109);
        }
        return class225;
    }

    final void method1984(byte i, int i_10_) {
        synchronized (aClass60_3321) {
            aClass60_3321.method578(2, i_10_);
        }
        anInt3315++;
        if (i < 36)
            method1980(-32);
    }

    final void method1985(int i) {
        anInt3317++;
        synchronized (aClass60_3321) {
            aClass60_3321.method590(i);
        }
    }

    final void method1986(byte i) {
        synchronized (aClass60_3321) {
            aClass60_3321.method587(-112);
        }
        int i_11_ = 119 / ((i - 47) / 55);
        anInt3316++;
    }

    static final void method1987(int i) {
        int i_12_ = 81 % ((i - -70) / 35);
        anInt3313++;
        if (!Class5_Sub1.aBoolean8335)
            Class348_Sub42_Sub6.aBoolean9535
                    = ((Class332.anInt4143 != -1
                    && Class73.anInt4776 >= Class332.anInt4143)
                    || (Class348_Sub42_Sub8_Sub2.anInt10432
                    < 16 * Class73.anInt4776 - -(!Class71.aBoolean1211 ? 22
                    : 26)));
        Class166.aClass262_2187.method1996(103);
        Class348_Sub40_Sub38.aClass262_9478.method1996(104);
        for (Class348_Sub42_Sub12 class348_sub42_sub12
             = ((Class348_Sub42_Sub12)
                Class348_Sub40_Sub4.aClass262_9111.method1995(4));
             class348_sub42_sub12 != null;
             class348_sub42_sub12
                     = (Class348_Sub42_Sub12) Class348_Sub40_Sub4
                     .aClass262_9111
                     .method1990((byte) 83)) {
            int i_13_
                    = class348_sub42_sub12.anInt9608;
            if (i_13_ < 1000) {
                class348_sub42_sub12.method2715((byte) 97);
                if (i_13_ == 15 || i_13_ == 2 || i_13_ == 30
                        || i_13_ == 49 || i_13_ == 51
                        || i_13_ == 50 || i_13_ == 6)
                    Class348_Sub40_Sub38.aClass262_9478
                            .method1999(class348_sub42_sub12, -20180);
                else
                    Class166.aClass262_2187.method1999(class348_sub42_sub12,
                            -20180);
            }
        }
        Class166.aClass262_2187.method1988(Class348_Sub40_Sub4.aClass262_9111,
                (byte) -115);
        Class348_Sub40_Sub38.aClass262_9478
                .method1988(Class348_Sub40_Sub4.aClass262_9111, (byte) -115);
        if (Class73.anInt4776 > 1) {
            if (!Class116.aBoolean1759
                    || !Class182.aClass346_2449.method2696(81, -122)
                    || Class73.anInt4776 <= 2)
                Class316.aClass348_Sub42_Sub12_3963
                        = ((Class348_Sub42_Sub12)
                        Class348_Sub40_Sub4.aClass262_9111
                                .aClass348_3334.aClass348_4295);
            else
                Class316.aClass348_Sub42_Sub12_3963
                        = ((Class348_Sub42_Sub12)
                        Class348_Sub40_Sub4.aClass262_9111
                                .aClass348_3334.aClass348_4295.aClass348_4295);
            Class135_Sub2.aClass348_Sub42_Sub12_4846
                    = ((Class348_Sub42_Sub12)
                    Class348_Sub40_Sub4.aClass262_9111
                            .aClass348_3334.aClass348_4295);
        } else {
            Class316.aClass348_Sub42_Sub12_3963 = null;
            Class135_Sub2.aClass348_Sub42_Sub12_4846 = null;
        }
        int i_14_ = -1;
        Class348_Sub45 class348_sub45
                = (Class348_Sub45) Class318_Sub1_Sub3.aClass262_8744.method1995(4);
        if (class348_sub45 != null)
            i_14_ = class348_sub45.method3310(58);
        if (Class5_Sub1.aBoolean8335) {
            if (i_14_ == -1) {
                int i_15_ = Class258_Sub4.aClass373_8552.method3597(true);
                int i_16_
                        = Class258_Sub4.aClass373_8552.method3594((byte) 116);
                boolean bool = false;
                if (Class242.aClass348_Sub42_Sub13_3152 != null) {
                    if (Class50_Sub3.anInt5252 + -10 > i_15_
                            || ((Class50_Sub3.anInt5252
                            - -Class348_Sub1_Sub1.anInt8806 + 10) < i_15_)
                            || -10 + Class373.anInt4534 > i_16_
                            || (Class177.anInt4669 + Class373.anInt4534 + 10 < i_16_))
                        Class348_Sub42_Sub19.method3277((byte) -48);
                    else
                        bool = true;
                }
                if (!bool) {
                    if (Class135_Sub1.anInt4717 - 10 <= i_15_
                            && i_15_ <= (10 + Class135_Sub1.anInt4717
                            - -Class63.anInt1117)
                            && i_16_ >= -10 + Class348_Sub42_Sub5.anInt9532
                            && i_16_ <= (10 + Class348_Sub42_Sub5.anInt9532
                            - -Class237_Sub1.anInt5819)) {
                        if (Class348_Sub42_Sub6.aBoolean9535) {
                            int i_17_ = -1;
                            int i_18_ = -1;
                            for (int i_19_ = 0; i_19_ < Class8.anInt166;
                                 i_19_++) {
                                if (Class71.aBoolean1211) {
                                    int i_21_
                                            = (16 * i_19_ + 33
                                            + Class348_Sub42_Sub5.anInt9532);
                                    if ((i_16_ > -13 + i_21_)
                                            && i_21_ + 4 > i_16_) {
                                        i_18_ = -13 + i_21_;
                                        i_17_ = i_19_;
                                        break;
                                    }
                                } else {
                                    int i_20_
                                            = (16 * i_19_
                                            + Class348_Sub42_Sub5.anInt9532
                                            - -31);
                                    if (i_20_ + -13 < i_16_
                                            && (i_20_ + 3 > i_16_)) {
                                        i_18_ = i_20_ + -13;
                                        i_17_ = i_19_;
                                        break;
                                    }
                                }
                            }
                            if (i_17_ != -1) {
                                int i_22_ = 0;
                                Class156 class156
                                        = new Class156(Class233.aClass107_3022);
                                for (Class348_Sub42_Sub13 class348_sub42_sub13
                                     = ((Class348_Sub42_Sub13)
                                        class156.method1240(75));
                                     class348_sub42_sub13 != null;
                                     class348_sub42_sub13
                                             = ((Class348_Sub42_Sub13)
                                             class156.method1243((byte) 74))) {
                                    if (i_17_ == i_22_) {
                                        if (class348_sub42_sub13.anInt9615
                                                > 1)
                                            Class99.method881
                                                    (class348_sub42_sub13, i_16_,
                                                            true, i_18_);
                                        break;
                                    }
                                    i_22_++;
                                }
                            }
                        }
                    } else
                        Class286_Sub2.method2146((byte) 70);
                }
            }
            if (i_14_ == 0) {
                int i_23_ = class348_sub45.method3308((byte) -128);
                int i_24_ = class348_sub45.method3311(33);
                if (Class242.aClass348_Sub42_Sub13_3152 != null
                        && Class50_Sub3.anInt5252 <= i_23_
                        && (Class348_Sub1_Sub1.anInt8806 + Class50_Sub3.anInt5252
                        >= i_23_)
                        && i_24_ >= Class373.anInt4534
                        && Class373.anInt4534 + Class177.anInt4669 >= i_24_) {
                    int i_25_ = -1;
                    for (int i_26_ = 0;
                         (Class242.aClass348_Sub42_Sub13_3152.anInt9615
                                 > i_26_);
                         i_26_++) {
                        if (Class71.aBoolean1211) {
                            int i_27_ = 33 + (Class373.anInt4534 + i_26_ * 16);
                            if (i_24_ > -13 + i_27_
                                    && i_24_ < 4 + i_27_)
                                i_25_ = i_26_;
                        } else {
                            int i_28_ = i_26_ * 16 + 31 + Class373.anInt4534;
                            if (i_28_ + -13 < i_24_
                                    && i_24_ < 3 + i_28_)
                                i_25_ = i_26_;
                        }
                    }
                    if (i_25_ != -1) {
                        int i_29_ = 0;
                        Class156 class156
                                = new Class156(Class242
                                        .aClass348_Sub42_Sub13_3152
                                .aClass107_9621);
                        for (Class348_Sub42_Sub12 class348_sub42_sub12
                             = ((Class348_Sub42_Sub12)
                                class156.method1240(98));
                             class348_sub42_sub12 != null;
                             class348_sub42_sub12
                                     = ((Class348_Sub42_Sub12)
                                     class156.method1243((byte) 122))) {
                            if (i_29_ == i_25_) {
                                Class325.method2599((byte) 126,
                                        class348_sub42_sub12,
                                        i_24_, i_23_);
                                break;
                            }
                            i_29_++;
                        }
                    }
                    Class286_Sub2.method2146((byte) 78);
                } else if (Class135_Sub1.anInt4717 <= i_23_
                        && (i_23_
                        <= Class135_Sub1.anInt4717 - -Class63.anInt1117)
                        && i_24_ >= Class348_Sub42_Sub5.anInt9532
                        && ((Class348_Sub42_Sub5.anInt9532
                        - -Class237_Sub1.anInt5819) >= i_24_)) {
                    if (Class348_Sub42_Sub6.aBoolean9535) {
                        int i_30_ = -1;
                        for (int i_31_ = 0; i_31_ < Class8.anInt166; i_31_++) {
                            if (Class71.aBoolean1211) {
                                int i_33_ = (Class348_Sub42_Sub5.anInt9532 + 33
                                        - -(i_31_ * 16));
                                if (i_24_ > -13 + i_33_
                                        && i_33_ + 4 > i_24_) {
                                    i_30_ = i_31_;
                                    break;
                                }
                            } else {
                                int i_32_ = (Class348_Sub42_Sub5.anInt9532 + 31
                                        + i_31_ * 16);
                                if (i_24_ > i_32_ - 13
                                        && i_32_ + 3 > i_24_) {
                                    i_30_ = i_31_;
                                    break;
                                }
                            }
                        }
                        if (i_30_ != -1) {
                            int i_34_ = 0;
                            Class156 class156
                                    = new Class156(Class233.aClass107_3022);
                            for (Class348_Sub42_Sub13 class348_sub42_sub13
                                 = ((Class348_Sub42_Sub13)
                                    class156.method1240(18));
                                 class348_sub42_sub13 != null;
                                 class348_sub42_sub13
                                         = ((Class348_Sub42_Sub13)
                                         class156.method1243((byte) 55))) {
                                if (i_34_ == i_30_) {
                                    Class325.method2599
                                            ((byte) 122,
                                                    ((Class348_Sub42_Sub12)
                                                            (class348_sub42_sub13
                                                                    .aClass107_9621
                                                                    .aClass348_Sub42_1647
                                                                    .aClass348_Sub42_7063)),
                                                    i_24_, i_23_);
                                    Class286_Sub2.method2146((byte) 118);
                                    break;
                                }
                                i_34_++;
                            }
                        }
                    } else {
                        int i_35_ = -1;
                        for (int i_36_ = 0;
                             (i_36_ < Class73.anInt4776);
                             i_36_++) {
                            if (Class71.aBoolean1211) {
                                int i_37_ = (33 + Class348_Sub42_Sub5.anInt9532
                                        + 16 * (Class73.anInt4776
                                        - (1 - -i_36_)));
                                if (i_37_ - 13 < i_24_
                                        && 4 + i_37_ > i_24_)
                                    i_35_ = i_36_;
                            } else {
                                int i_38_ = (Class348_Sub42_Sub5.anInt9532
                                        + (31 - -((Class73.anInt4776 - 1
                                        - i_36_)
                                        * 16)));
                                if (i_38_ - 13 < i_24_
                                        && (i_24_ < i_38_ - -3))
                                    i_35_ = i_36_;
                            }
                        }
                        if (i_35_ != -1) {
                            int i_39_ = 0;
                            Class312 class312
                                    = new Class312(Class348_Sub40_Sub4
                                    .aClass262_9111);
                            for (Class348_Sub42_Sub12 class348_sub42_sub12
                                 = ((Class348_Sub42_Sub12)
                                    class312.method2327((byte) -53));
                                 class348_sub42_sub12 != null;
                                 class348_sub42_sub12
                                         = ((Class348_Sub42_Sub12)
                                         class312.method2329(10))) {
                                if (i_35_ == i_39_) {
                                    Class325.method2599((byte) 107,
                                            class348_sub42_sub12,
                                            i_24_, i_23_);
                                    break;
                                }
                                i_39_++;
                            }
                        }
                        Class286_Sub2.method2146((byte) -46);
                    }
                }
            }
        } else {
            if (i_14_ == 0 && ((Class318_Sub1_Sub5.anInt8770 == 1
                    && Class73.anInt4776 > 2)
                    || Class318_Sub1_Sub5.method2485(-100)))
                i_14_ = 2;
            if (i_14_ == 2 && Class73.anInt4776 > 0
                    && class348_sub45 != null) {
                if (Class289.aClass46_3701 == null
                        && Class348_Sub42.anInt7059 == 0)
                    Class304.method2291((byte) -124,
                            class348_sub45.method3308((byte) -127),
                            class348_sub45.method3311(-104));
                else
                    Class282.anInt3655 = 2;
            }
            if (i_14_ == 0) {
                if (Class316.aClass348_Sub42_Sub12_3963 != null)
                    Class239_Sub3.method1731(1);
                else if (r.aBoolean9722)
                    Class341.method2678(-2049);
            }
            if (Class289.aClass46_3701 == null
                    && Class348_Sub42.anInt7059 == 0) {
                Class138.aClass348_Sub42_Sub12_1946 = null;
                Class282.anInt3655 = 0;
            }
        }
    }

    Class261(Class230 class230, int i, Class45 class45) {
        try {
            aClass45_3319 = class45;
            aClass45_3319.method407(0, 32);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("uga.<init>("
                            + (class230 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (class45 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }
}
