/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class171 {
    static int anInt2267;
    private final ha_Sub2 aHa_Sub2_2268;
    static short aShort2269 = 32767;
    int anInt2270;
    static int anInt2271;
    static int[] anIntArray2272;
    static int anInt2273;
    static int anInt2274;
    static int anInt2275;
    /*synthetic*/ static Class aClass2276;

    static final int method1319(int i, boolean bool, byte[] is, int i_0_) {
        anInt2267++;
        if (bool != true) return 63;
        int i_1_ = -1;
        for (int i_2_ = i_0_; i_2_ < i; i_2_++)
            i_1_ = (i_1_ >>> -677827672 ^ Class89.anIntArray1508[(i_1_ ^ is[i_2_]) & 0xff]);
        i_1_ ^= 0xffffffff;
        return i_1_;
    }

    static final void method1320() {
        for (int i = 0; i < Class331.anInt4135; i++) {
            if (!r.aBooleanArray9718[i]) {
                Class211 class211 = Class239_Sub14.aClass211Array5993[i];
                Class348_Sub1 class348_sub1 = class211.aClass348_Sub1_2745;
                int i_3_ = class211.anInt2731;
                int i_4_ = (class348_sub1.method2723(-1) - Class348_Sub23_Sub2.anInt9037);
                int i_5_ = 1 + (2 * i_4_ >> Class362.anInt4459);
                int i_6_ = 0;
                int[] is = new int[i_5_ * i_5_];
                int i_7_ = (class348_sub1.method2724(-1) - i_4_ >> Class362.anInt4459);
                int i_8_ = (class348_sub1.method2717((byte) 79) - i_4_ >> Class362.anInt4459);
                int i_9_ = (class348_sub1.method2717((byte) 113) + i_4_ >> Class362.anInt4459);
                if (i_8_ < 0) {
                    i_6_ -= i_8_;
                    i_8_ = 0;
                }
                if (i_9_ >= Class348_Sub41.anInt7054) i_9_ = Class348_Sub41.anInt7054 - 1;
                for (int i_10_ = i_8_; i_10_ <= i_9_; i_10_++) {
                    int i_11_ = class211.aShortArray2742[i_6_];
                    int i_12_ = i_11_ >>> 8;
                    int i_13_ = i_6_ * i_5_ + i_12_;
                    int i_14_ = i_7_ + (i_11_ >>> 8);
                    int i_15_ = i_14_ + (i_11_ & 0xff) - 1;
                    if (i_14_ < 0) {
                        i_13_ -= i_14_;
                        i_14_ = 0;
                    }
                    if (i_15_ >= Class318_Sub7.anInt6451) i_15_ = Class318_Sub7.anInt6451 - 1;
                    for (int i_16_ = i_14_; i_16_ <= i_15_; i_16_++) {
                        int i_17_ = 1;
                        Class318_Sub1_Sub3 class318_sub1_sub3 = (Class177.method1353(i_3_, i_16_, i_10_, (aClass2276 != null ? aClass2276 : (aClass2276 = method1324("Class318_Sub1_Sub3")))));
                        if (class318_sub1_sub3 != null && (class318_sub1_sub3.aByte8745) != 0) {
                            if ((class318_sub1_sub3.aByte8745) == 1) {
                                boolean bool = i_16_ - 1 >= i_14_;
                                boolean bool_18_ = i_16_ + 1 <= i_15_;
                                if (!bool && i_10_ + 1 <= i_9_) {
                                    int i_19_ = (class211.aShortArray2742[i_6_ + 1]);
                                    int i_20_ = i_7_ + (i_19_ >>> 8);
                                    int i_21_ = i_20_ + (i_19_ & 0xff);
                                    bool = i_16_ > i_20_ && i_16_ < i_21_;
                                }
                                if (!bool_18_ && i_10_ - 1 >= i_8_) {
                                    int i_22_ = (class211.aShortArray2742[i_6_ - 1]);
                                    int i_23_ = i_7_ + (i_22_ >>> 8);
                                    int i_24_ = i_23_ + (i_22_ & 0xff);
                                    bool_18_ = i_16_ > i_23_ && i_16_ < i_24_;
                                }
                                if (bool && !bool_18_) i_17_ = 4;
                                else if (bool_18_ && !bool) i_17_ = 2;
                            } else {
                                boolean bool = i_16_ - 1 >= i_14_;
                                boolean bool_25_ = i_16_ + 1 <= i_15_;
                                if (!bool && i_10_ - 1 >= i_8_) {
                                    int i_26_ = (class211.aShortArray2742[i_6_ - 1]);
                                    int i_27_ = i_7_ + (i_26_ >>> 8);
                                    int i_28_ = i_27_ + (i_26_ & 0xff);
                                    bool = i_16_ > i_27_ && i_16_ < i_28_;
                                }
                                if (!bool_25_ && i_10_ + 1 <= i_9_) {
                                    int i_29_ = (class211.aShortArray2742[i_6_ + 1]);
                                    int i_30_ = i_7_ + (i_29_ >>> 8);
                                    int i_31_ = i_30_ + (i_29_ & 0xff);
                                    bool_25_ = i_16_ > i_30_ && i_16_ < i_31_;
                                }
                                if (bool && !bool_25_) i_17_ = 3;
                                else if (bool_25_ && !bool) i_17_ = 5;
                            }
                        }
                        is[i_13_++] = i_17_;
                    }
                    i_6_++;
                }
                r.aBooleanArray9718[i] = true;
                aa_Sub1.aSArray5191[i_3_].method3981(class348_sub1, is);
            }
        }
    }

    protected final void finalize() throws Throwable {
        aHa_Sub2_2268.method3765((byte) 65, this.anInt2270);
        anInt2274++;
        super.finalize();
    }

    static final int method1321(byte i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
        int i_37_ = 4 / ((-51 - i) / 63);
        anInt2273++;
        if (aa_Sub1.aSArray5191 == null) return 0;
        if (i_35_ < 3) {
            int i_38_ = i_32_ >> 1180576809;
            int i_39_ = i_33_ >> 188458601;
            if (i_34_ < 0 || i_36_ < 0 || -1 + Class367_Sub4.anInt7319 < i_34_ || (i_36_ > Class348_Sub40_Sub3.anInt9109 - 1)) return 0;
            if (i_38_ < 1 || i_39_ < 1 || -1 + Class367_Sub4.anInt7319 < i_38_ || -1 + Class348_Sub40_Sub3.anInt9109 < i_39_) return 0;
            boolean bool = ((0x2 & (Class348_Sub33.aByteArrayArrayArray6962[1][i_32_ >> -1561487767][i_33_ >> 1692295945])) != 0);
            if ((i_32_ & 0x1ff) == 0) {
                boolean bool_40_ = ((0x2 & (Class348_Sub33.aByteArrayArrayArray6962[1][-1 + i_38_][i_33_ >> 720652841])) != 0);
                boolean bool_41_ = ((0x2 & (Class348_Sub33.aByteArrayArrayArray6962[1][i_38_][i_33_ >> -769339767])) != 0);
                if (bool_40_ == !bool_41_) bool = (0x2 & (Class348_Sub33.aByteArrayArrayArray6962[1][i_34_][i_36_])) != 0;
            }
            if ((i_33_ & 0x1ff) == 0) {
                boolean bool_42_ = ((Class348_Sub33.aByteArrayArrayArray6962[1][i_32_ >> -239805847][-1 + i_39_]) & 0x2) != 0;
                boolean bool_43_ = ((0x2 & (Class348_Sub33.aByteArrayArrayArray6962[1][i_32_ >> -691907255][i_39_])) != 0);
                if (bool_42_ == !bool_43_) bool = (0x2 & (Class348_Sub33.aByteArrayArrayArray6962[1][i_34_][i_36_])) != 0;
            }
            if (bool) i_35_++;
        }
        return aa_Sub1.aSArray5191[i_35_].method3986(i_32_, i_33_, (byte) 22);
    }

    public static void method1322(byte i) {
        if (i == -28) anIntArray2272 = null;
    }

    static final void method1323(int i, int i_44_) {
        synchronized (Class342.aClass60_4254) {
            Class342.aClass60_4254.method578(2, i);
        }
        if (i_44_ == 26603) anInt2271++;
    }

    Class171(ha_Sub2 var_ha_Sub2, int i, int i_45_) {
        aHa_Sub2_2268 = var_ha_Sub2;
        this.anInt2270 = i_45_;
    }

    /*synthetic*/
    static Class method1324(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
