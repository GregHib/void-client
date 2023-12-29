/* Class318_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub7 extends Class318 {
    Class243 aClass243_6433;
    private int anInt6434 = 0;
    private final long aLong6435;
    Class129 aClass129_6436;
    static int anInt6437;
    static int anInt6438;
    Class318_Sub10 aClass318_Sub10_6439;
    static int anInt6440;
    Class181 aClass181_6441;
    static int anInt6442;
    static Class351 aClass351_6443 = new Class351(68, 2);
    Class284 aClass284_6444;
    static int anInt6445;
    boolean aBoolean6446 = false;
    int anInt6447;
    static int anInt6448;
    private Class284 aClass284_6449;
    static int anInt6450 = 0;
    static int anInt6451;
    private int anInt6452;
    private boolean aBoolean6453;
    private int anInt6454;
    private int anInt6455;
    private int anInt6456;
    private int anInt6457;
    private int anInt6458;
    private int anInt6459;

    final void method2507(boolean bool) {
        this.aClass284_6444.anInt3670 = this.aClass129_6436.anInt1890;
        anInt6448++;
        this.aClass284_6444.anInt3666 = this.aClass129_6436.anInt1889;
        this.aClass284_6444.anInt3668 = this.aClass129_6436.anInt1883;
        this.aClass284_6444.anInt3669 = this.aClass129_6436.anInt1874;
        this.aClass284_6444.anInt3680 = this.aClass129_6436.anInt1876;
        this.aClass284_6444.anInt3679 = this.aClass129_6436.anInt1880;
        this.aClass284_6444.anInt3678 = this.aClass129_6436.anInt1891;
        this.aClass284_6444.anInt3672 = this.aClass129_6436.anInt1884;
        if (bool == true) {
            this.aClass284_6444.anInt3675 = this.aClass129_6436.anInt1882;
            if ((this.aClass284_6444.anInt3675 == (this.aClass284_6444.anInt3668)) && ((this.aClass284_6444.anInt3680) == (this.aClass284_6444.anInt3668)) && ((this.aClass284_6444.anInt3670) == (this.aClass284_6444.anInt3678)) && ((this.aClass284_6444.anInt3669) == (this.aClass284_6444.anInt3670)) && ((this.aClass284_6444.anInt3679) == (this.aClass284_6444.anInt3666)) && ((this.aClass284_6444.anInt3679) == (this.aClass284_6444.anInt3672)))
                aBoolean6453 = true;
            else if (aBoolean6453) {
                aClass284_6449.anInt3678 = (this.aClass284_6444.anInt3678);
                aBoolean6453 = false;
                aClass284_6449.anInt3672 = (this.aClass284_6444.anInt3672);
                aClass284_6449.anInt3666 = (this.aClass284_6444.anInt3666);
                aClass284_6449.anInt3670 = (this.aClass284_6444.anInt3670);
                aClass284_6449.anInt3668 = (this.aClass284_6444.anInt3668);
                aClass284_6449.anInt3679 = (this.aClass284_6444.anInt3679);
                aClass284_6449.anInt3675 = (this.aClass284_6444.anInt3675);
                aClass284_6449.anInt3669 = (this.aClass284_6444.anInt3669);
                aClass284_6449.anInt3680 = (this.aClass284_6444.anInt3680);
            }
        }
    }

    public static void method2508(int i) {
        if (i != 32767) method2512(null, null, 5);
        aClass351_6443 = null;
    }

    static final void method2509(int i, int i_0_, ha var_ha, int i_1_, int i_2_, boolean bool, int i_3_, int i_4_) {
        anInt6438++;
        if (bool != true) anInt6451 = -14;
        var_ha.method3675(i, (byte) -125, i_1_, i_0_, i_3_, i_2_);
        var_ha.method3675(i - 2, (byte) -125, 1 + i_1_, 1 + i_0_, 16, i_4_);
        var_ha.method3668(-2 + i, 18 + i_0_, i_4_, 1 + i_1_, -19 + i_3_, 115);
    }

    static final boolean method2510(Index index, Class348_Sub16_Sub3 class348_sub16_sub3, Index index_5_, boolean bool, Class279 class279, Index index_6_) {
        try {
            Class318_Sub1_Sub4.aClass279_8764 = class279;
            Class98.aClass348_Sub16_Sub3_1564 = class348_sub16_sub3;
            Class43.aIndex_611 = index;
            Class367_Sub9.aIndex_7371 = index_6_;
            Class333.aIndex_4147 = index_5_;
            Class367_Sub3.anIntArray7299 = new int[16];
            if (bool != false) anInt6451 = 71;
            anInt6442++;
            for (int i = 0; i < 16; i++)
                Class367_Sub3.anIntArray7299[i] = 255;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("rba.G(" + (index != null ? "{...}" : "null") + ',' + (class348_sub16_sub3 != null ? "{...}" : "null") + ',' + (index_5_ != null ? "{...}" : "null") + ',' + bool + ',' + (class279 != null ? "{...}" : "null") + ',' + (index_6_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method2511(boolean bool, ha var_ha, long l) {
        try {
            anInt6437++;
            if (bool != true) this.aClass243_6433 = null;
            for (Class318_Sub9_Sub2_Sub1 class318_sub9_sub2_sub1 = ((Class318_Sub9_Sub2_Sub1) this.aClass243_6433.method1872(8)); class318_sub9_sub2_sub1 != null; class318_sub9_sub2_sub1 = (Class318_Sub9_Sub2_Sub1) this.aClass243_6433.method1878((byte) 126))
                class318_sub9_sub2_sub1.method2522(var_ha, l);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("rba.F(" + bool + ',' + (var_ha != null ? "{...}" : "null") + ',' + l + ')'));
        }
    }

    static final void method2512(d var_d, ha var_ha, int i) {
        try {
            anInt6440++;
            if (Class75.aClass348_Sub42_Sub14_1243 != null) {
                if (Class348.anInt4290 < 10) {
                    if (!Class75.aIndex_1237.method413(100, Class75.aClass348_Sub42_Sub14_1243.aString9625)) {
                        Class348.anInt4290 = (Class348_Sub32.WORLD_MAP.method397((Class75.aClass348_Sub42_Sub14_1243.aString9625), 0)) / 10;
                        return;
                    }
                    InputStream_Sub1.method126(-16203);
                    Class348.anInt4290 = 10;
                }
                if (Class348.anInt4290 == 10) {
                    Class75.anInt1266 = (Class75.aClass348_Sub42_Sub14_1243.anInt9644 >> 6 << 6);
                    Class75.anInt1263 = (Class75.aClass348_Sub42_Sub14_1243.anInt9643 >> 6 << 6);
                    Class75.anInt1259 = 64 + ((Class75.aClass348_Sub42_Sub14_1243.anInt9635 >> 6 << 6) - Class75.anInt1266);
                    Class75.anInt1267 = 64 + ((Class75.aClass348_Sub42_Sub14_1243.anInt9627 >> 6 << 6) - Class75.anInt1263);
                    int[] is = new int[3];
                    int i_7_ = -1;
                    int i_8_ = -1;
                    if (Class75.aClass348_Sub42_Sub14_1243.method3236(is, (za_Sub2.regionTileX - -((Class132.aPlayer_1907.x) >> 9)), ((Class132.aPlayer_1907.y) >> 9) + Class90.regionTileY, (Class132.aPlayer_1907.plane), (byte) -28)) {
                        i_7_ = -Class75.anInt1266 + is[1];
                        i_8_ = -Class75.anInt1263 + is[2];
                    }
                    if (Class88.aBoolean1500 || i_7_ < 0 || Class75.anInt1259 <= i_7_ || i_8_ < 0 || Class75.anInt1267 <= i_8_) {
                        if (Class239_Sub7.anInt5909 == -1 || Class339.anInt4202 == -1) {
                            Class75.aClass348_Sub42_Sub14_1243.method3242(is, 123, 0x3fff & (Class75.aClass348_Sub42_Sub14_1243.anInt9640), (Class75.aClass348_Sub42_Sub14_1243.anInt9640) >> 14 & 0x3fff);
                            Class245.anInt3170 = is[2] - Class75.anInt1263;
                            Class348_Sub36.anInt6992 = is[1] - Class75.anInt1266;
                        } else {
                            Class75.aClass348_Sub42_Sub14_1243.method3242(is, 88, Class339.anInt4202, Class239_Sub7.anInt5909);
                            Class239_Sub7.anInt5909 = Class339.anInt4202 = -1;
                            if (is != null) {
                                Class348_Sub36.anInt6992 = -Class75.anInt1266 + is[1];
                                Class245.anInt3170 = -Class75.anInt1263 + is[2];
                            }
                            Class88.aBoolean1500 = false;
                        }
                    } else {
                        i_7_ += (int) (10.0 * Math.random()) + -5;
                        i_8_ += (int) (Math.random() * 10.0) + -5;
                        Class348_Sub36.anInt6992 = i_7_;
                        Class245.anInt3170 = i_8_;
                    }
                    if (Class75.aClass348_Sub42_Sub14_1243.anInt9631 != 37) {
                        if (Class75.aClass348_Sub42_Sub14_1243.anInt9631 != 50) {
                            if (Class75.aClass348_Sub42_Sub14_1243.anInt9631 != 75) {
                                if ((Class75.aClass348_Sub42_Sub14_1243.anInt9631) == 100) Class75.aFloat1249 = Class75.aFloat1247 = 8.0F;
                                else if ((Class75.aClass348_Sub42_Sub14_1243.anInt9631) != 200) Class75.aFloat1249 = Class75.aFloat1247 = 8.0F;
                                else Class75.aFloat1249 = Class75.aFloat1247 = 16.0F;
                            } else Class75.aFloat1249 = Class75.aFloat1247 = 6.0F;
                        } else Class75.aFloat1249 = Class75.aFloat1247 = 4.0F;
                    } else Class75.aFloat1249 = Class75.aFloat1247 = 3.0F;
                    Class75.anInt1255 = (int) Class75.aFloat1247 >> 1;
                    Class75.aByteArrayArrayArray1251 = Class325.method2596(Class75.anInt1255, 12871);
                    Class348_Sub15.method2811(false);
                    Class75.method760();
                    Class289.aClass262_3705 = new Class262();
                    Class75.anInt1250 += (int) (Math.random() * 5.0) + -2;
                    if (Class75.anInt1250 < -8) Class75.anInt1250 = -8;
                    if (Class75.anInt1250 > 8) Class75.anInt1250 = 8;
                    Class75.anInt1253 += -2 + (int) (5.0 * Math.random());
                    if (Class75.anInt1253 < -16) Class75.anInt1253 = -16;
                    if (Class75.anInt1253 > 16) Class75.anInt1253 = 16;
                    Class75.method764(var_d, (Class75.anInt1250 >> 2 << 10), Class75.anInt1253 >> 1);
                    Class75.aClass153_1238.method1220((byte) 73, 256, 1024);
                    Class75.aClass141_1242.method1178(256, 1, 256);
                    Class75.aClass263_1245.method2014(4096, true);
                    Class229.aClass194_2981.method1444(256, 123);
                    Class348.anInt4290 = 20;
                } else if (Class348.anInt4290 == 20) {
                    Class289.method2193(true, (byte) -123);
                    Class75.method756(var_ha, Class75.anInt1250, Class75.anInt1253);
                    Class348.anInt4290 = 60;
                    Class289.method2193(true, (byte) -122);
                    Class94.method867(true);
                } else if (i <= -43) {
                    if (Class348.anInt4290 == 60) {
                        if (Class75.aIndex_1237.method400(-18308, (Class75.aClass348_Sub42_Sub14_1243.aString9625) + "_staticelements")) {
                            if (!Class75.aIndex_1237.method413(100, (Class75.aClass348_Sub42_Sub14_1243.aString9625) + "_staticelements")) return;
                            Class75.aClass252_1246 = (Class307.method2300(Class75.aIndex_1237, (Class75.aClass348_Sub42_Sub14_1243.aString9625) + "_staticelements", Class130.aBoolean1900, (byte) -91));
                        } else Class75.aClass252_1246 = new Class252(0);
                        Class75.method761();
                        Class348.anInt4290 = 70;
                        Class289.method2193(true, (byte) -127);
                        Class94.method867(true);
                    } else if (Class348.anInt4290 == 70) {
                        Class125.aClass323_4921 = new Class323(var_ha, 11, true, Class305.aCanvas3869);
                        Class348.anInt4290 = 73;
                        Class289.method2193(true, (byte) -123);
                        Class94.method867(true);
                    } else if (Class348.anInt4290 == 73) {
                        Class14_Sub4.aClass323_8644 = new Class323(var_ha, 12, true, Class305.aCanvas3869);
                        Class348.anInt4290 = 76;
                        Class289.method2193(true, (byte) -125);
                        Class94.method867(true);
                    } else if (Class348.anInt4290 == 76) {
                        Class39.aClass323_521 = new Class323(var_ha, 14, true, Class305.aCanvas3869);
                        Class348.anInt4290 = 79;
                        Class289.method2193(true, (byte) -123);
                        Class94.method867(true);
                    } else if (Class348.anInt4290 == 79) {
                        Class168.aClass323_2252 = new Class323(var_ha, 17, true, Class305.aCanvas3869);
                        Class348.anInt4290 = 82;
                        Class289.method2193(true, (byte) -124);
                        Class94.method867(true);
                    } else if (Class348.anInt4290 == 82) {
                        Class176.aClass323_2333 = new Class323(var_ha, 19, true, Class305.aCanvas3869);
                        Class348.anInt4290 = 85;
                        Class289.method2193(true, (byte) -128);
                        Class94.method867(true);
                    } else if (Class348.anInt4290 == 85) {
                        Class285.aClass323_4754 = new Class323(var_ha, 22, true, Class305.aCanvas3869);
                        Class348.anInt4290 = 88;
                        Class289.method2193(true, (byte) -124);
                        Class94.method867(true);
                    } else if (Class348.anInt4290 == 88) {
                        Class348_Sub3.aClass323_6581 = new Class323(var_ha, 26, true, Class305.aCanvas3869);
                        Class348.anInt4290 = 91;
                        Class289.method2193(true, (byte) -125);
                        Class94.method867(true);
                    } else {
                        Class240.aClass323_4672 = new Class323(var_ha, 30, true, Class305.aCanvas3869);
                        Class348.anInt4290 = 100;
                        Class289.method2193(true, (byte) -119);
                        Class94.method867(true);
                        System.gc();
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("rba.A(" + (var_d != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final void method2513(ha var_ha, int i, long l, int i_9_, boolean bool) {
        do {
            try {
                if (!this.aBoolean6446) {
                    if (Class348_Sub6.anInt6637 < (this.aClass181_6441.anInt2379)) bool = false;
                    else if (Class292.anInt4797 <= (Class275.anIntArray3551[Class348_Sub6.anInt6637])) {
                        if (!aBoolean6453) {
                            if (this.aClass181_6441.anInt2425 != -1) {
                                int i_10_ = (int) (-aLong6435 + l);
                                if (!(this.aClass181_6441.aBoolean2411) && (this.aClass181_6441.anInt2425) < i_10_) bool = false;
                                else i_10_ %= (this.aClass181_6441.anInt2425);
                                if (!(this.aClass181_6441.aBoolean2406) && ((this.aClass181_6441.anInt2393) > i_10_)) bool = false;
                                if (this.aClass181_6441.aBoolean2406 && (this.aClass181_6441.anInt2393) <= i_10_) bool = false;
                            }
                        } else bool = false;
                    } else bool = false;
                } else bool = false;
                anInt6445++;
                if (bool) {
                    Class122.anInt1803++;
                    int i_11_ = (((this.aClass284_6444.anInt3675) + this.aClass284_6444.anInt3668 + this.aClass284_6444.anInt3680) / 3);
                    int i_12_ = (((this.aClass284_6444.anInt3669) + this.aClass284_6444.anInt3678 + this.aClass284_6444.anInt3670) / 3);
                    int i_13_ = (((this.aClass284_6444.anInt3672) + this.aClass284_6444.anInt3679 + this.aClass284_6444.anInt3666) / 3);
                    if (i_11_ != (this.aClass284_6444.anInt3673) || i_12_ != this.aClass284_6444.anInt3667 || i_13_ != (this.aClass284_6444.anInt3671)) {
                        this.aClass284_6444.anInt3667 = i_12_;
                        this.aClass284_6444.anInt3673 = i_11_;
                        this.aClass284_6444.anInt3671 = i_13_;
                        int i_14_ = (-this.aClass284_6444.anInt3675 + this.aClass284_6444.anInt3668);
                        int i_15_ = (-this.aClass284_6444.anInt3678 + this.aClass284_6444.anInt3670);
                        int i_16_ = (-this.aClass284_6444.anInt3666 + this.aClass284_6444.anInt3679);
                        int i_17_ = (this.aClass284_6444.anInt3680 - this.aClass284_6444.anInt3675);
                        int i_18_ = (this.aClass284_6444.anInt3669 - this.aClass284_6444.anInt3678);
                        int i_19_ = (-this.aClass284_6444.anInt3666 + this.aClass284_6444.anInt3672);
                        anInt6457 = i_17_ * i_16_ + -(i_14_ * i_19_);
                        anInt6455 = i_15_ * i_19_ + -(i_18_ * i_16_);
                        for (anInt6458 = -(i_17_ * i_15_) + i_18_ * i_14_; (anInt6455 > 32767 || anInt6457 > 32767 || anInt6458 > 32767 || anInt6455 < -32767 || anInt6457 < -32767 || anInt6458 < -32767); anInt6455 >>= 1) {
                            anInt6458 >>= 1;
                            anInt6457 >>= 1;
                        }
                        int i_20_ = (int) Math.sqrt(anInt6455 * anInt6455 - (-(anInt6457 * anInt6457) + -(anInt6458 * anInt6458)));
                        if (i_20_ <= 0) i_20_ = 1;
                        anInt6455 = anInt6455 * 32767 / i_20_;
                        anInt6458 = 32767 * anInt6458 / i_20_;
                        anInt6457 = 32767 * anInt6457 / i_20_;
                        if ((this.aClass181_6441.aShort2415) > 0 || this.aClass181_6441.aShort2441 > 0) {
                            int i_21_ = (int) (2607.5945876176133 * Math.atan2(anInt6458, anInt6455));
                            int i_22_ = (int) (2607.5945876176133 * (Math.atan2(anInt6457, (Math.sqrt(anInt6458 * anInt6458 + (anInt6455 * anInt6455))))));
                            anInt6456 = (this.aClass181_6441.aShort2415 - (this.aClass181_6441.aShort2431));
                            anInt6459 = (this.aClass181_6441.aShort2431 + i_21_ - (anInt6456 >> 1));
                            anInt6454 = (-this.aClass181_6441.aShort2418 + (this.aClass181_6441.aShort2441));
                            anInt6452 = i_22_ - (-(this.aClass181_6441.aShort2418) - -(anInt6454 >> 1));
                        }
                    }
                    anInt6434 += (int) ((((double) (-this.aClass181_6441.anInt2391 + this.aClass181_6441.anInt2389) * Math.random()) + (double) this.aClass181_6441.anInt2391) * (double) i);
                    if (anInt6434 > 63) {
                        int i_23_ = anInt6434 >> 6;
                        anInt6434 &= 0x3f;
                        for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
                            int i_25_;
                            int i_26_;
                            int i_27_;
                            if (this.aClass181_6441.aShort2415 <= 0 && this.aClass181_6441.aShort2441 <= 0) {
                                i_25_ = anInt6455;
                                i_27_ = anInt6458;
                                i_26_ = anInt6457;
                            } else {
                                int i_28_ = ((int) (Math.random() * (double) anInt6456) + anInt6459);
                                i_28_ &= 0x3fff;
                                int i_29_ = Class70.anIntArray1207[i_28_];
                                int i_30_ = Class70.anIntArray1204[i_28_];
                                int i_31_ = anInt6452 + (int) ((double) anInt6454 * Math.random());
                                i_31_ &= 0x1fff;
                                int i_32_ = Class70.anIntArray1207[i_31_];
                                int i_33_ = Class70.anIntArray1204[i_31_];
                                int i_34_ = 13;
                                i_25_ = i_32_ * i_30_ >> i_34_;
                                i_26_ = -1 * (i_33_ << 1);
                                i_27_ = i_32_ * i_29_ >> i_34_;
                            }
                            float f = (float) Math.random();
                            float f_35_ = (float) Math.random();
                            if (f + f_35_ > 1.0F) {
                                f_35_ = 1.0F - f_35_;
                                f = -f + 1.0F;
                            }
                            float f_36_ = 1.0F - (f + f_35_);
                            int i_37_ = (int) (((float) this.aClass284_6444.anInt3680 * f_36_) + (f * (float) (this.aClass284_6444.anInt3675) + (f_35_ * (float) (this.aClass284_6444.anInt3668))));
                            int i_38_ = (int) (f * (float) (this.aClass284_6444.anInt3678) + (float) (this.aClass284_6444.anInt3670) * f_35_ + (float) (this.aClass284_6444.anInt3669) * f_36_);
                            int i_39_ = (int) (((float) this.aClass284_6444.anInt3666 * f) + (float) (this.aClass284_6444.anInt3679) * f_35_ + (f_36_ * (float) (this.aClass284_6444.anInt3672)));
                            int i_40_ = (int) ((float) (aClass284_6449.anInt3680) * f_36_ + (f_35_ * (float) (aClass284_6449.anInt3668) + f * (float) (aClass284_6449.anInt3675)));
                            int i_41_ = (int) ((float) (aClass284_6449.anInt3670) * f_35_ + (float) (aClass284_6449.anInt3678) * f + (float) (aClass284_6449.anInt3669) * f_36_);
                            int i_42_ = (int) ((float) (aClass284_6449.anInt3672) * f_36_ + (((float) aClass284_6449.anInt3666 * f) + (float) (aClass284_6449.anInt3679) * f_35_));
                            int i_43_ = i_37_ - i_40_;
                            int i_44_ = -i_41_ + i_38_;
                            int i_45_ = i_39_ + -i_42_;
                            int i_46_ = (int) ((double) i_43_ * Math.random() + (double) i_40_);
                            int i_47_ = (int) ((double) i_41_ + (double) i_44_ * Math.random());
                            int i_48_ = (int) ((double) i_42_ + (double) i_45_ * Math.random());
                            int i_49_ = ((int) (Math.random() * (double) ((this.aClass181_6441.anInt2438) + -(this.aClass181_6441.anInt2392))) + this.aClass181_6441.anInt2392);
                            int i_50_ = (this.aClass181_6441.anInt2394 + (int) ((double) (-(this.aClass181_6441.anInt2394) + (this.aClass181_6441.anInt2407)) * Math.random()));
                            int i_51_ = ((int) ((double) ((this.aClass181_6441.anInt2417) - (this.aClass181_6441.anInt2442)) * Math.random()) + this.aClass181_6441.anInt2442);
                            int i_52_;
                            if (this.aClass181_6441.aBoolean2443) {
                                double d = Math.random();
                                i_52_ = ((int) (d * (double) (this.aClass181_6441.anInt2408) + (double) (this.aClass181_6441.anInt2399)) | (((int) ((double) (this.aClass181_6441.anInt2433) * d + (double) (this.aClass181_6441.anInt2429)) << 16) | (int) ((double) (this.aClass181_6441.anInt2390) + ((double) (this.aClass181_6441.anInt2403) * d)) << 8) | (int) ((double) (this.aClass181_6441.anInt2413) + ((double) (this.aClass181_6441.anInt2410) * (Math.random()))) << 24);
                            } else
                                i_52_ = (((int) (((double) (this.aClass181_6441.anInt2410) * Math.random()) + (double) (this.aClass181_6441.anInt2413)) << 24) | (((int) ((Math.random() * (double) (this.aClass181_6441.anInt2433)) + (double) (this.aClass181_6441.anInt2429)) << 16) | ((int) ((Math.random() * (double) (this.aClass181_6441.anInt2403)) + (double) (this.aClass181_6441.anInt2390)) << 8) | (int) (((double) (this.aClass181_6441.anInt2408) * Math.random()) + (double) (this.aClass181_6441.anInt2399))));
                            int i_53_ = (this.aClass181_6441.anInt2414);
                            if (!var_ha.method3644() && !(this.aClass181_6441.aBoolean2382)) i_53_ = -1;
                            if (client.anInt5171 == Class348_Sub1_Sub1.anInt8808) {
                                Class318_Sub9_Sub2_Sub1 class318_sub9_sub2_sub1 = (new Class318_Sub9_Sub2_Sub1(this, i_46_, i_47_, i_48_, i_25_, i_26_, i_27_, i_49_, i_50_, i_52_, i_51_, i_53_, (this.aClass181_6441.aBoolean2435), (this.aClass181_6441.aBoolean2430)));
                            } else {
                                Class318_Sub9_Sub2_Sub1 class318_sub9_sub2_sub1 = (Class239_Sub25.aClass318_Sub9_Sub2_Sub1Array6103[Class348_Sub1_Sub1.anInt8808]);
                                Class348_Sub1_Sub1.anInt8808 = 0x3ff & 1 + Class348_Sub1_Sub1.anInt8808;
                                class318_sub9_sub2_sub1.method2523(this, i_46_, i_47_, i_48_, i_25_, i_26_, i_27_, i_49_, i_50_, i_52_, i_51_, i_53_, (this.aClass181_6441.aBoolean2435), (this.aClass181_6441.aBoolean2430));
                            }
                        }
                    }
                }
                if (!this.aClass284_6444.method2115(aClass284_6449, true)) {
                    Class284 class284 = aClass284_6449;
                    aClass284_6449 = this.aClass284_6444;
                    this.aClass284_6444 = class284;
                    this.aClass284_6444.anInt3678 = (this.aClass129_6436.anInt1891);
                    this.aClass284_6444.anInt3675 = (this.aClass129_6436.anInt1882);
                    this.aClass284_6444.anInt3670 = (this.aClass129_6436.anInt1890);
                    this.aClass284_6444.anInt3672 = (this.aClass129_6436.anInt1884);
                    this.aClass284_6444.anInt3680 = (this.aClass129_6436.anInt1876);
                    this.aClass284_6444.anInt3679 = (this.aClass129_6436.anInt1880);
                    this.aClass284_6444.anInt3666 = (this.aClass129_6436.anInt1889);
                    this.aClass284_6444.anInt3673 = aClass284_6449.anInt3673;
                    this.aClass284_6444.anInt3669 = (this.aClass129_6436.anInt1874);
                    this.aClass284_6444.anInt3671 = aClass284_6449.anInt3671;
                    this.aClass284_6444.anInt3667 = aClass284_6449.anInt3667;
                    this.aClass284_6444.anInt3668 = (this.aClass129_6436.anInt1883);
                }
                this.anInt6447 = 0;
                for (Class318_Sub9_Sub2_Sub1 class318_sub9_sub2_sub1 = (Class318_Sub9_Sub2_Sub1) this.aClass243_6433.method1872(i_9_ + 5); class318_sub9_sub2_sub1 != null; class318_sub9_sub2_sub1 = ((Class318_Sub9_Sub2_Sub1) this.aClass243_6433.method1878((byte) 122))) {
                    class318_sub9_sub2_sub1.method2524(l, i);
                    this.anInt6447++;
                }
                Class313.anInt3936 += this.anInt6447;
                if (i_9_ == 3) break;
                method2508(124);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("rba.C(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + l + ',' + i_9_ + ',' + bool + ')'));
            }
            break;
        } while (false);
    }

    Class318_Sub7(ha var_ha, Class129 class129, Class318_Sub10 class318_sub10, long l) {
        this.aClass284_6444 = new Class284();
        aClass284_6449 = new Class284();
        aBoolean6453 = false;
        try {
            aLong6435 = l;
            this.aClass129_6436 = class129;
            this.aClass318_Sub10_6439 = class318_sub10;
            this.aClass181_6441 = this.aClass129_6436.method1125((byte) 59);
            if (!var_ha.method3644() && (this.aClass181_6441.anInt2387) != -1) this.aClass181_6441 = Class373.method3591((this.aClass181_6441.anInt2387), 0);
            this.aClass243_6433 = new Class243();
            anInt6434 += 64.0 * Math.random();
            method2507(true);
            aClass284_6449.anInt3680 = this.aClass284_6444.anInt3680;
            aClass284_6449.anInt3669 = this.aClass284_6444.anInt3669;
            aClass284_6449.anInt3668 = this.aClass284_6444.anInt3668;
            aClass284_6449.anInt3675 = this.aClass284_6444.anInt3675;
            aClass284_6449.anInt3670 = this.aClass284_6444.anInt3670;
            aClass284_6449.anInt3678 = this.aClass284_6444.anInt3678;
            aClass284_6449.anInt3666 = this.aClass284_6444.anInt3666;
            aClass284_6449.anInt3672 = this.aClass284_6444.anInt3672;
            aClass284_6449.anInt3679 = this.aClass284_6444.anInt3679;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("rba.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class129 != null ? "{...}" : "null") + ',' + (class318_sub10 != null ? "{...}" : "null") + ',' + l + ')'));
        }
    }
}
