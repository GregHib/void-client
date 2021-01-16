/* s_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class s_Sub1 extends s {
    private float aFloat8212;
    private float aFloat8213;
    private float aFloat8214;
    private Class102[][] aClass102ArrayArray8215;
    private float aFloat8216;
    private final ha_Sub1 aHa_Sub1_8217;
    private float aFloat8218;
    private Class198[][] aClass198ArrayArray8219;
    private byte[][] aByteArrayArray8220;
    private float aFloat8221;
    private Class236[][] aClass236ArrayArray8222;
    private final int anInt8223;
    private float aFloat8224;
    private Class145[][] aClass145ArrayArray8225;
    private float aFloat8226;
    private float aFloat8227;
    private int anInt8228 = -1;
    private float aFloat8229;
    private Class266[][] aClass266ArrayArray8230;
    private float aFloat8231;
    private byte[][] aByteArrayArray8232;
    private float aFloat8233;

    final void method3981(Class348_Sub1 class348_sub1, int[] is) {
        /* empty */
    }

    final void U(int i, int i_0_, int[] is, int[] is_1_, int[] is_2_,
                 int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_,
                 int[] is_7_, int i_8_, int i_9_, int i_10_, boolean bool) {
        boolean bool_11_ = (anInt8223 & 0x20) == 0;
        if (aClass266ArrayArray8230 == null && !bool_11_) {
            aClass266ArrayArray8230
                    = new Class266[this.anInt4587][this.anInt4590];
            aClass145ArrayArray8225
                    = new Class145[this.anInt4587][this.anInt4590];
        } else if (aClass198ArrayArray8219 == null && bool_11_)
            aClass198ArrayArray8219
                    = new Class198[this.anInt4587][this.anInt4590];
        else if (aClass102ArrayArray8215 != null)
            throw new IllegalStateException();
        if (is != null && is.length != 0) {
            for (int i_12_ = 0; i_12_ < is_4_.length; i_12_++) {
                if (is_4_[i_12_] == -1)
                    is_4_[i_12_] = 0;
                else
                    is_4_[i_12_]
                            = ((Class126.anIntArray4983
                            [Class25.method303(is_4_[i_12_], 30) & 0xffff])
                            << 8) | 0xff;
            }
            if (is_5_ != null) {
                for (int i_13_ = 0; i_13_ < is_5_.length; i_13_++) {
                    if (is_5_[i_13_] == -1)
                        is_5_[i_13_] = 0;
                    else
                        is_5_[i_13_]
                                = ((Class126.anIntArray4983
                                [Class25.method303(is_5_[i_13_], 30) & 0xffff])
                                << 8) | 0xff;
                }
            }
            if (bool_11_) {
                Class198 class198 = new Class198();
                class198.aShort2620 = (short) is.length;
                class198.aShort2619 = (short) (is.length / 3);
                class198.aShortArray2622
                        = new short[class198.aShort2620];
                class198.aShortArray2618
                        = new short[class198.aShort2620];
                class198.aShortArray2613
                        = new short[class198.aShort2620];
                class198.anIntArray2623
                        = new int[class198.aShort2620];
                class198.aShortArray2616
                        = new short[class198.aShort2620];
                class198.aShortArray2614
                        = new short[class198.aShort2620];
                class198.aByteArray2617
                        = new byte[class198.aShort2620];
                if (is_3_ != null)
                    class198.aShortArray2621
                            = new short[class198.aShort2620];
                for (int i_14_ = 0; i_14_ < class198.aShort2620;
                     i_14_++) {
                    int i_15_ = is[i_14_];
                    int i_16_ = is_2_[i_14_];
                    boolean bool_17_ = false;
                    int i_18_;
                    if (i_15_ == 0 && i_16_ == 0)
                        i_18_ = (aByteArrayArray8220[i][i_0_]
                                - aByteArrayArray8232[i][i_0_]);
                    else if (i_15_ == 0 && i_16_ == this.anInt4592)
                        i_18_ = (aByteArrayArray8220[i][i_0_ + 1]
                                - aByteArrayArray8232[i][i_0_ + 1]);
                    else if (i_15_ == this.anInt4592
                            && i_16_ == this.anInt4592)
                        i_18_ = (aByteArrayArray8220[i + 1][i_0_ + 1]
                                - aByteArrayArray8232[i + 1][i_0_ + 1]);
                    else if (i_15_ == this.anInt4592 && i_16_ == 0)
                        i_18_ = (aByteArrayArray8220[i + 1][i_0_]
                                - aByteArrayArray8232[i + 1][i_0_]);
                    else {
                        int i_19_
                                = (((aByteArrayArray8220[i][i_0_]
                                - aByteArrayArray8232[i][i_0_])
                                * (this.anInt4592 - i_15_))
                                + (aByteArrayArray8220[i + 1][i_0_]
                                - aByteArrayArray8232[i + 1][i_0_]) * i_15_);
                        int i_20_
                                = (((aByteArrayArray8220[i][i_0_ + 1]
                                - aByteArrayArray8232[i][i_0_ + 1])
                                * (this.anInt4592 - i_15_))
                                + ((aByteArrayArray8220[i + 1][i_0_ + 1]
                                - aByteArrayArray8232[i + 1][i_0_ + 1])
                                * i_15_));
                        i_18_ = (i_19_ * (this.anInt4592 - i_16_)
                                + i_20_ * i_16_) >> 2 * this.anInt4588;
                    }
                    int i_21_ = (i << this.anInt4588) + i_15_;
                    int i_22_ = (i_0_ << this.anInt4588) + i_16_;
                    class198.aShortArray2622[i_14_]
                            = (short) i_15_;
                    class198.aShortArray2613[i_14_]
                            = (short) i_16_;
                    class198.aShortArray2618[i_14_]
                            = (short) (this.method3986(i_21_, i_22_, (byte) 64)
                            + (is_1_ != null ? is_1_[i_14_] : 0));
                    if (i_18_ < 0)
                        i_18_ = 0;
                    if (is_4_[i_14_] == 0) {
                        class198.anIntArray2623[i_14_] = 0;
                        if (is_5_ != null)
                            class198.aByteArray2617[i_14_]
                                    = (byte) i_18_;
                    } else {
                        int i_23_ = 0;
                        if (is_3_ != null) {
                            int i_24_
                                    = (class198.aShortArray2621[i_14_]
                                    = (short) is_3_[i_14_]);
                            if (i_9_ != 0) {
                                i_23_ = 255 * i_24_ / i_9_;
                                if (i_23_ < 0)
                                    i_23_ = 0;
                                else if (i_23_ > 255)
                                    i_23_ = 255;
                            }
                        }
                        int i_25_ = -16777216;
                        if (is_6_[i_14_] != -1
                                && method3997(aHa_Sub1_8217.aD4579
                                        .method3(is_6_[i_14_], -6662)
                                .aByte213))
                            i_25_ = -1694498816;
                        class198.anIntArray2623[i_14_]
                                = (i_25_
                                | Class298.method2250(method3991((is_4_[i_14_]
                                        >> 8),
                                i_18_),
                                118, i_23_, i_8_));
                        if (is_5_ != null)
                            class198.aByteArray2617[i_14_]
                                    = (byte) i_18_;
                    }
                    class198.aShortArray2616[i_14_]
                            = (short) is_6_[i_14_];
                    class198.aShortArray2614[i_14_]
                            = (short) is_7_[i_14_];
                }
                if (is_5_ != null)
                    class198.anIntArray2615
                            = new int[class198.aShort2619];
                for (int i_26_ = 0; i_26_ < class198.aShort2619;
                     i_26_++) {
                    int i_27_ = i_26_ * 3;
                    if (is_5_ != null && is_5_[i_27_] != 0)
                        class198.anIntArray2615[i_26_]
                                = ~0xffffff | is_5_[i_27_] >> 8;
                }
                aClass198ArrayArray8219[i][i_0_] = class198;
            } else {
                boolean bool_28_ = true;
                int i_29_ = -1;
                int i_30_ = -1;
                int i_31_ = -1;
                int i_32_ = -1;
                if (is.length == 6) {
                    for (int i_33_ = 0; i_33_ < 6; i_33_++) {
                        if (is[i_33_] == 0 && is_2_[i_33_] == 0) {
                            if (i_29_ != -1 && is_4_[i_29_] != is_4_[i_33_]) {
                                bool_28_ = false;
                                break;
                            }
                            i_29_ = i_33_;
                        } else if (is[i_33_] == this.anInt4592
                                && is_2_[i_33_] == 0) {
                            if (i_30_ != -1 && is_4_[i_30_] != is_4_[i_33_]) {
                                bool_28_ = false;
                                break;
                            }
                            i_30_ = i_33_;
                        } else if (is[i_33_] == this.anInt4592
                                && is_2_[i_33_] == this.anInt4592) {
                            if (i_31_ != -1 && is_4_[i_31_] != is_4_[i_33_]) {
                                bool_28_ = false;
                                break;
                            }
                            i_31_ = i_33_;
                        } else if (is[i_33_] == 0
                                && is_2_[i_33_] == this.anInt4592) {
                            if (i_32_ != -1 && is_4_[i_32_] != is_4_[i_33_]) {
                                bool_28_ = false;
                                break;
                            }
                            i_32_ = i_33_;
                        }
                    }
                    if (i_29_ == -1 || i_30_ == -1 || i_31_ == -1
                            || i_32_ == -1)
                        bool_28_ = false;
                    if (bool_28_) {
                        if (is_1_ != null) {
                            for (int i_34_ = 0; i_34_ < 4; i_34_++) {
                                if (is_1_[i_34_] != 0) {
                                    bool_28_ = false;
                                    break;
                                }
                            }
                        }
                        if (bool_28_) {
                            for (int i_35_ = 1; i_35_ < 4; i_35_++) {
                                if (is[i_35_] != is[0]
                                        && (is[i_35_]
                                        != is[0] + this.anInt4592)
                                        && (is[i_35_]
                                        != is[0] - this.anInt4592)) {
                                    bool_28_ = false;
                                    break;
                                }
                                if (is_2_[i_35_] != is_2_[0]
                                        && (is_2_[i_35_]
                                        != is_2_[0] + this.anInt4592)
                                        && (is_2_[i_35_]
                                        != is_2_[0] - this.anInt4592)) {
                                    bool_28_ = false;
                                    break;
                                }
                            }
                        }
                    }
                } else
                    bool_28_ = false;
                if (bool_28_) {
                    Class266 class266 = new Class266();
                    int i_36_ = is_4_[0];
                    int i_37_ = is_6_[0];
                    if (is_5_ != null) {
                        class266.anInt3388 = is_5_[0] >> 8;
                        if (i_36_ == 0)
                            class266.aByte3386 |= 0x2;
                    } else if (i_36_ == 0)
                        return;
                    if ((this.anIntArrayArray4584[i][i_0_]
                            == this.anIntArrayArray4584[i + 1][i_0_])
                            && (this.anIntArrayArray4584[i][i_0_]
                            == this.anIntArrayArray4584[i + 1][i_0_ + 1])
                            && (this.anIntArrayArray4584[i][i_0_]
                            == this.anIntArrayArray4584[i][i_0_ + 1]))
                        class266.aByte3386 |= 0x1;
                    if (i_37_ != -1
                            && (class266.aByte3386 & 0x2) == 0
                            && !(aHa_Sub1_8217.aD4579
                            .method3(i_37_, -6662)
                            .aBoolean209)) {
                        int i_38_;
                        if (is_3_ != null && i_9_ != 0) {
                            i_38_ = 255 * is_3_[i_29_] / i_9_;
                            if (i_38_ < 0)
                                i_38_ = 0;
                            else if (i_38_ > 255)
                                i_38_ = 255;
                        } else
                            i_38_ = 0;
                        class266.anInt3389
                                = (Class298.method2250
                                (method3991(is_4_[i_29_] >> 8,
                                        (aByteArrayArray8220[i][i_0_]
                                                - aByteArrayArray8232[i][i_0_])),
                                        88, i_38_, i_8_));
                        if (class266.anInt3388 != 0)
                            class266.anInt3389
                                    |= (255 - (aByteArrayArray8220[i][i_0_]
                                    - aByteArrayArray8232[i][i_0_])
                                    << 25);
                        if (is_3_ != null && i_9_ != 0) {
                            i_38_ = 255 * is_3_[i_30_] / i_9_;
                            if (i_38_ < 0)
                                i_38_ = 0;
                            else if (i_38_ > 255)
                                i_38_ = 255;
                        } else
                            i_38_ = 0;
                        class266.anInt3387
                                = (Class298.method2250
                                (method3991(is_4_[i_30_] >> 8,
                                        (aByteArrayArray8220[i + 1][i_0_]
                                                - (aByteArrayArray8232[i + 1]
                                                [i_0_]))),
                                        97, i_38_, i_8_));
                        if (class266.anInt3388 != 0)
                            class266.anInt3387
                                    |= (255 - (aByteArrayArray8220[i + 1][i_0_]
                                    - aByteArrayArray8232[i + 1][i_0_])
                                    << 25);
                        if (is_3_ != null && i_9_ != 0) {
                            i_38_ = 255 * is_3_[i_31_] / i_9_;
                            if (i_38_ < 0)
                                i_38_ = 0;
                            else if (i_38_ > 255)
                                i_38_ = 255;
                        } else
                            i_38_ = 0;
                        class266.anInt3380
                                = (Class298.method2250
                                (method3991(is_4_[i_31_] >> 8,
                                        ((aByteArrayArray8220[i + 1]
                                                [i_0_ + 1])
                                                - (aByteArrayArray8232[i + 1]
                                                [i_0_ + 1]))),
                                        103, i_38_, i_8_));
                        if (class266.anInt3388 != 0)
                            class266.anInt3380
                                    |= 255 - (aByteArrayArray8220[i + 1][i_0_ + 1]
                                    - (aByteArrayArray8232[i + 1]
                                    [i_0_ + 1])) << 25;
                        if (is_3_ != null && i_9_ != 0) {
                            i_38_ = 255 * is_3_[i_32_] / i_9_;
                            if (i_38_ < 0)
                                i_38_ = 0;
                            else if (i_38_ > 255)
                                i_38_ = 255;
                        } else
                            i_38_ = 0;
                        class266.anInt3381
                                = (Class298.method2250
                                (method3991(is_4_[i_32_] >> 8,
                                        (aByteArrayArray8220[i][i_0_ + 1]
                                                - (aByteArrayArray8232[i]
                                                [i_0_ + 1]))),
                                        42, i_38_, i_8_));
                        class266.aShort3379 = (short) i_37_;
                    } else {
                        int i_39_;
                        if (is_3_ != null && i_9_ != 0) {
                            i_39_ = 255 * is_3_[i_29_] / i_9_;
                            if (i_39_ < 0)
                                i_39_ = 0;
                            else if (i_39_ > 255)
                                i_39_ = 255;
                        } else
                            i_39_ = 0;
                        class266.anInt3389
                                = (Class298.method2250
                                (method3991(is_4_[i_29_] >> 8,
                                        (aByteArrayArray8220[i][i_0_]
                                                - aByteArrayArray8232[i][i_0_])),
                                        68, i_39_, i_8_));
                        if (class266.anInt3388 != 0)
                            class266.anInt3389
                                    |= (255 - (aByteArrayArray8220[i][i_0_]
                                    - aByteArrayArray8232[i][i_0_])
                                    << 25);
                        if (is_3_ != null && i_9_ != 0) {
                            i_39_ = 255 * is_3_[i_30_] / i_9_;
                            if (i_39_ < 0)
                                i_39_ = 0;
                            else if (i_39_ > 255)
                                i_39_ = 255;
                        } else
                            i_39_ = 0;
                        class266.anInt3387
                                = (Class298.method2250
                                (method3991(is_4_[i_30_] >> 8,
                                        (aByteArrayArray8220[i + 1][i_0_]
                                                - (aByteArrayArray8232[i + 1]
                                                [i_0_]))),
                                        112, i_39_, i_8_));
                        if (class266.anInt3388 != 0)
                            class266.anInt3387
                                    |= (255 - (aByteArrayArray8220[i + 1][i_0_]
                                    - aByteArrayArray8232[i + 1][i_0_])
                                    << 25);
                        if (is_3_ != null && i_9_ != 0) {
                            i_39_ = 255 * is_3_[i_31_] / i_9_;
                            if (i_39_ < 0)
                                i_39_ = 0;
                            else if (i_39_ > 255)
                                i_39_ = 255;
                        } else
                            i_39_ = 0;
                        class266.anInt3380
                                = (Class298.method2250
                                (method3991(is_4_[i_31_] >> 8,
                                        ((aByteArrayArray8220[i + 1]
                                                [i_0_ + 1])
                                                - (aByteArrayArray8232[i + 1]
                                                [i_0_ + 1]))),
                                        62, i_39_, i_8_));
                        if (class266.anInt3388 != 0)
                            class266.anInt3380
                                    |= 255 - (aByteArrayArray8220[i + 1][i_0_ + 1]
                                    - (aByteArrayArray8232[i + 1]
                                    [i_0_ + 1])) << 25;
                        if (is_3_ != null && i_9_ != 0) {
                            i_39_ = 255 * is_3_[i_32_] / i_9_;
                            if (i_39_ < 0)
                                i_39_ = 0;
                            else if (i_39_ > 255)
                                i_39_ = 255;
                        } else
                            i_39_ = 0;
                        class266.anInt3381
                                = (Class298.method2250
                                (method3991(is_4_[i_32_] >> 8,
                                        (aByteArrayArray8220[i][i_0_ + 1]
                                                - (aByteArrayArray8232[i]
                                                [i_0_ + 1]))),
                                        84, i_39_, i_8_));
                        if (class266.anInt3388 != 0)
                            class266.anInt3381
                                    |= (255 - (aByteArrayArray8220[i][i_0_ + 1]
                                    - aByteArrayArray8232[i][i_0_ + 1])
                                    << 25);
                        class266.aShort3379 = (short) -1;
                    }
                    if (is_3_ != null) {
                        class266.aShort3384
                                = (short) is_3_[i_31_];
                        class266.aShort3385
                                = (short) is_3_[i_32_];
                        class266.aShort3383
                                = (short) is_3_[i_30_];
                        class266.aShort3382
                                = (short) is_3_[i_29_];
                    }
                    aClass266ArrayArray8230[i][i_0_] = class266;
                } else {
                    Class145 class145 = new Class145();
                    class145.aShort2003 = (short) is.length;
                    class145.aShort2010 = (short) (is.length / 3);
                    class145.aShortArray2009
                            = new short[class145.aShort2003];
                    class145.aShortArray2007
                            = new short[class145.aShort2003];
                    class145.aShortArray2002
                            = new short[class145.aShort2003];
                    class145.anIntArray2001
                            = new int[class145.aShort2003];
                    if (is_3_ != null)
                        class145.aShortArray2006
                                = new short[class145.aShort2003];
                    for (int i_40_ = 0;
                         i_40_ < class145.aShort2003; i_40_++) {
                        int i_41_ = is[i_40_];
                        int i_42_ = is_2_[i_40_];
                        boolean bool_43_ = false;
                        int i_44_;
                        if (i_41_ == 0 && i_42_ == 0)
                            i_44_ = (aByteArrayArray8220[i][i_0_]
                                    - aByteArrayArray8232[i][i_0_]);
                        else if (i_41_ == 0 && i_42_ == this.anInt4592)
                            i_44_ = (aByteArrayArray8220[i][i_0_ + 1]
                                    - aByteArrayArray8232[i][i_0_ + 1]);
                        else if (i_41_ == this.anInt4592
                                && i_42_ == this.anInt4592)
                            i_44_ = (aByteArrayArray8220[i + 1][i_0_ + 1]
                                    - aByteArrayArray8232[i + 1][i_0_ + 1]);
                        else if (i_41_ == this.anInt4592 && i_42_ == 0)
                            i_44_ = (aByteArrayArray8220[i + 1][i_0_]
                                    - aByteArrayArray8232[i + 1][i_0_]);
                        else {
                            int i_45_
                                    = (((aByteArrayArray8220[i][i_0_]
                                    - aByteArrayArray8232[i][i_0_])
                                    * (this.anInt4592 - i_41_))
                                    + ((aByteArrayArray8220[i + 1][i_0_]
                                    - aByteArrayArray8232[i + 1][i_0_])
                                    * i_41_));
                            int i_46_
                                    = (((aByteArrayArray8220[i][i_0_ + 1]
                                    - aByteArrayArray8232[i][i_0_ + 1])
                                    * (this.anInt4592 - i_41_))
                                    + ((aByteArrayArray8220[i + 1][i_0_ + 1]
                                    - aByteArrayArray8232[i + 1][i_0_ + 1])
                                    * i_41_));
                            i_44_ = ((i_45_ * (this.anInt4592 - i_42_)
                                    + i_46_ * i_42_)
                                    >> 2 * this.anInt4588);
                        }
                        int i_47_ = (i << this.anInt4588) + i_41_;
                        int i_48_ = (i_0_ << this.anInt4588) + i_42_;
                        class145.aShortArray2009[i_40_]
                                = (short) i_41_;
                        class145.aShortArray2002[i_40_]
                                = (short) i_42_;
                        class145.aShortArray2007[i_40_]
                                = (short) (this.method3986(i_47_, i_48_,
                                (byte) 126)
                                + (is_1_ != null ? is_1_[i_40_] : 0));
                        if (i_44_ < 0)
                            i_44_ = 0;
                        if (is_4_[i_40_] == 0) {
                            if (is_5_ != null)
                                class145.anIntArray2001[i_40_]
                                        = i_44_ << 25;
                            else
                                class145.anIntArray2001[i_40_]
                                        = 0;
                        } else {
                            int i_49_ = 0;
                            if (is_3_ != null) {
                                int i_50_ = (class145
                                        .aShortArray2006[i_40_]
                                        = (short) is_3_[i_40_]);
                                if (i_9_ != 0) {
                                    i_49_ = 255 * i_50_ / i_9_;
                                    if (i_49_ < 0)
                                        i_49_ = 0;
                                    else if (i_49_ > 255)
                                        i_49_ = 255;
                                }
                            }
                            class145.anIntArray2001[i_40_]
                                    = Class298.method2250(method3991((is_4_[i_40_]
                                            >> 8),
                                    i_44_),
                                    40, i_49_, i_8_);
                            if (is_5_ != null)
                                class145.anIntArray2001[i_40_]
                                        |= i_44_ << 25;
                        }
                    }
                    boolean bool_51_ = false;
                    for (int i_52_ = 0;
                         i_52_ < class145.aShort2010; i_52_++) {
                        if (is_6_[i_52_ * 3] != -1
                                && !(aHa_Sub1_8217.aD4579
                                        .method3(is_6_[i_52_ * 3], -6662)
                                .aBoolean209))
                            bool_51_ = true;
                    }
                    if (is_5_ != null)
                        class145.anIntArray2011
                                = new int[class145.aShort2010];
                    if (bool_51_) {
                        class145.aShortArray2008
                                = new short[class145.aShort2010];
                        class145.aShortArray2005
                                = new short[class145.aShort2010];
                    }
                    for (int i_53_ = 0;
                         i_53_ < class145.aShort2010; i_53_++) {
                        int i_54_ = i_53_ * 3;
                        if (is_5_ != null && is_5_[i_54_] != 0)
                            class145.anIntArray2011[i_53_]
                                    = is_5_[i_54_] >> 8;
                        if (bool_51_) {
                            int i_55_ = i_54_ + 1;
                            int i_56_ = i_55_ + 1;
                            boolean bool_57_ = false;
                            boolean bool_58_ = true;
                            int i_59_ = is_6_[i_54_];
                            if (i_59_ == -1
                                    || (aHa_Sub1_8217.aD4579
                                    .method3(i_59_, -6662)
                                    .aBoolean209))
                                bool_58_ = false;
                            else
                                bool_57_ = true;
                            i_59_ = is_6_[i_55_];
                            if (i_59_ == -1
                                    || (aHa_Sub1_8217.aD4579
                                    .method3(i_59_, -6662)
                                    .aBoolean209))
                                bool_58_ = false;
                            else
                                bool_57_ = true;
                            i_59_ = is_6_[i_56_];
                            if (i_59_ == -1
                                    || (aHa_Sub1_8217.aD4579
                                    .method3(i_59_, -6662)
                                    .aBoolean209))
                                bool_58_ = false;
                            else
                                bool_57_ = true;
                            if (bool_58_) {
                                class145.aShortArray2008[i_53_]
                                        = (short) i_59_;
                                class145.aShortArray2005[i_53_]
                                        = (short) is_7_[i_54_];
                            } else {
                                if (bool_57_) {
                                    i_59_ = is_6_[i_54_];
                                    if (i_59_ != -1
                                            && !(aHa_Sub1_8217.aD4579
                                                    .method3(i_59_, -6662)
                                            .aBoolean209))
                                        class145
                                                .anIntArray2001[i_54_]
                                                = (Class126.anIntArray4983
                                                [(Class25.method303
                                                ((aHa_Sub1_8217
                                                        .aD4579
                                                        .method3(i_59_, -6662)
                                                                .aShort208) & 0xffff,
                                                        30)) & 0xffff]);
                                    i_59_ = is_6_[i_55_];
                                    if (i_59_ != -1
                                            && !(aHa_Sub1_8217.aD4579
                                                    .method3(i_59_, -6662)
                                            .aBoolean209))
                                        class145
                                                .anIntArray2001[i_55_]
                                                = (Class126.anIntArray4983
                                                [(Class25.method303
                                                ((aHa_Sub1_8217
                                                        .aD4579
                                                        .method3(i_59_, -6662)
                                                                .aShort208) & 0xffff,
                                                        30)) & 0xffff]);
                                    i_59_ = is_6_[i_56_];
                                    if (i_59_ != -1
                                            && !(aHa_Sub1_8217.aD4579
                                                    .method3(i_59_, -6662)
                                            .aBoolean209))
                                        class145
                                                .anIntArray2001[i_56_]
                                                = (Class126.anIntArray4983
                                                [(Class25.method303
                                                ((aHa_Sub1_8217
                                                        .aD4579
                                                        .method3(i_59_, -6662)
                                                                .aShort208) & 0xffff,
                                                        30)) & 0xffff]);
                                }
                                class145.aShortArray2008[i_53_]
                                        = (short) -1;
                            }
                        }
                    }
                    aClass145ArrayArray8225[i][i_0_] = class145;
                }
            }
        }
    }

    final void method3978(int i, int i_60_, int[] is, int[] is_61_,
                          int[] is_62_, int[] is_63_, int[] is_64_,
                          int[] is_65_, int[] is_66_, int[] is_67_,
                          int[] is_68_, int[] is_69_, int[] is_70_, int i_71_,
                          int i_72_, int i_73_, boolean bool) {
        if (aClass102ArrayArray8215 == null) {
            aClass102ArrayArray8215
                    = new Class102[this.anInt4587][this.anInt4590];
            aClass236ArrayArray8222
                    = new Class236[this.anInt4587][this.anInt4590];
        } else if (aClass266ArrayArray8230 != null
                || aClass198ArrayArray8219 != null)
            throw new IllegalStateException();
        boolean bool_74_ = false;
        if (is_67_.length == 2 && is_64_.length == 2
                && (is_67_[0] == is_67_[1]
                || is_69_[0] != -1 && is_69_[0] == is_69_[1])) {
            bool_74_ = true;
            for (int i_75_ = 1; i_75_ < 2; i_75_++) {
                int i_76_ = is[is_64_[i_75_]];
                int i_77_ = is_62_[is_64_[i_75_]];
                if (i_76_ != 0 && i_76_ != this.anInt4592
                        || i_77_ != 0 && i_77_ != this.anInt4592) {
                    bool_74_ = false;
                    break;
                }
            }
        }
        if (!bool_74_) {
            Class236 class236 = new Class236();
            short i_78_ = (short) is.length;
            int i_79_ = (short) is_67_.length;
            class236.aShort3089 = i_78_;
            class236.aShortArray3088 = new short[i_78_];
            class236.aShortArray3096 = new short[i_78_];
            class236.aShortArray3097 = new short[i_78_];
            class236.aShortArray3094 = new short[i_78_];
            for (int i_80_ = 0; i_80_ < i_78_; i_80_++) {
                int i_81_ = is[i_80_];
                int i_82_ = is_62_[i_80_];
                if (i_81_ == 0 && i_82_ == 0)
                    class236.aShortArray3088[i_80_]
                            = (short) (aByteArrayArray8220[i][i_60_]
                            - aByteArrayArray8232[i][i_60_]);
                else if (i_81_ == 0 && i_82_ == this.anInt4592)
                    class236.aShortArray3088[i_80_]
                            = (short) (aByteArrayArray8220[i][i_60_ + 1]
                            - aByteArrayArray8232[i][i_60_ + 1]);
                else if (i_81_ == this.anInt4592
                        && i_82_ == this.anInt4592)
                    class236.aShortArray3088[i_80_]
                            = (short) (aByteArrayArray8220[i + 1][i_60_ + 1]
                            - aByteArrayArray8232[i + 1][i_60_ + 1]);
                else if (i_81_ == this.anInt4592 && i_82_ == 0)
                    class236.aShortArray3088[i_80_]
                            = (short) (aByteArrayArray8220[i + 1][i_60_]
                            - aByteArrayArray8232[i + 1][i_60_]);
                else {
                    int i_83_
                            = (((aByteArrayArray8220[i][i_60_]
                            - aByteArrayArray8232[i][i_60_])
                            * (this.anInt4592 - i_81_))
                            + (aByteArrayArray8220[i + 1][i_60_]
                            - aByteArrayArray8232[i + 1][i_60_]) * i_81_);
                    int i_84_ = (((aByteArrayArray8220[i][i_60_ + 1]
                            - aByteArrayArray8232[i][i_60_ + 1])
                            * (this.anInt4592 - i_81_))
                            + ((aByteArrayArray8220[i + 1][i_60_ + 1]
                            - aByteArrayArray8232[i + 1][i_60_ + 1])
                            * i_81_));
                    class236.aShortArray3088[i_80_]
                            = (short) ((i_83_ * (this.anInt4592 - i_82_)
                            + i_84_ * i_82_)
                            >> 2 * this.anInt4588);
                }
                int i_85_ = (i << this.anInt4588) + i_81_;
                int i_86_ = (i_60_ << this.anInt4588) + i_82_;
                class236.aShortArray3096[i_80_] = (short) i_81_;
                class236.aShortArray3094[i_80_] = (short) i_82_;
                class236.aShortArray3097[i_80_]
                        = (short) (this.method3986(i_85_, i_86_, (byte) 67)
                        + (is_61_ != null ? is_61_[i_80_] : 0));
                if (class236.aShortArray3088[i_80_] < 2)
                    class236.aShortArray3088[i_80_] = (short) 2;
            }
            boolean bool_87_ = false;
            int i_88_ = 0;
            for (int i_89_ = 0; i_89_ < i_79_; i_89_++) {
                if (is_67_[i_89_] >= 0 || is_68_ != null && is_68_[i_89_] >= 0)
                    i_88_++;
                int i_90_ = is_69_[i_89_];
                if (i_90_ != -1) {
                    Class12 class12
                            = aHa_Sub1_8217.aD4579.method3(i_90_, -6662);
                    if (!class12.aBoolean209) {
                        bool_87_ = true;
                        if (method3997(class12.aByte213)
                                || class12.aByte198 != 0
                                || class12.aByte211 != 0)
                            class236.aByte3100 |= 0x4;
                    }
                }
            }
            class236.anIntArray3093 = new int[i_88_];
            if (is_68_ != null)
                class236.anIntArray3092 = new int[i_88_];
            class236.aShortArray3091 = new short[i_88_];
            class236.aShortArray3090 = new short[i_88_];
            class236.aShortArray3101 = new short[i_88_];
            if (bool_87_) {
                class236.aShortArray3095 = new short[i_88_];
                class236.aShortArray3098 = new short[i_88_];
            }
            for (int i_91_ = 0; i_91_ < i_79_; i_91_++) {
                if (is_67_[i_91_] >= 0
                        || is_68_ != null && is_68_[i_91_] >= 0) {
                    if (is_67_[i_91_] >= 0)
                        class236.anIntArray3093
                                [class236.aShort3099]
                                = Class25.method303(is_67_[i_91_], 30);
                    else
                        class236.anIntArray3093
                                [class236.aShort3099]
                                = -1;
                    if (is_68_ != null) {
                        if (is_68_[i_91_] != -1)
                            class236.anIntArray3092
                                    [class236.aShort3099]
                                    = Class25.method303(is_68_[i_91_], 30);
                        else
                            class236.anIntArray3092
                                    [class236.aShort3099]
                                    = -1;
                    }
                    class236.aShortArray3091
                            [class236.aShort3099]
                            = (short) is_64_[i_91_];
                    class236.aShortArray3090
                            [class236.aShort3099]
                            = (short) is_65_[i_91_];
                    class236.aShortArray3101
                            [class236.aShort3099]
                            = (short) is_66_[i_91_];
                    if (bool_87_) {
                        if (is_69_[i_91_] != -1
                                && !(aHa_Sub1_8217.aD4579
                                .method3(is_69_[i_91_], -6662)
                                .aBoolean209)) {
                            class236.aShortArray3095
                                    [class236.aShort3099]
                                    = (short) is_69_[i_91_];
                            class236.aShortArray3098
                                    [class236.aShort3099]
                                    = (short) is_70_[i_91_];
                        } else
                            class236.aShortArray3095
                                    [class236.aShort3099]
                                    = (short) -1;
                    }
                    class236.aShort3099++;
                }
            }
            aClass236ArrayArray8222[i][i_60_] = class236;
        } else if (is_67_[0] >= 0 || is_68_ != null && is_68_[0] >= 0) {
            Class102 class102 = new Class102();
            int i_92_ = is_67_[0];
            int i_93_ = is_69_[0];
            if (is_68_ != null) {
                class102.anInt1600
                        = Class291.method2198(0,
                        (aByteArrayArray8220[i][i_60_]
                                - aByteArrayArray8232[i][i_60_]),
                        Class25.method303(is_68_[0], 30));
                if (i_92_ == -1)
                    class102.aByte1606 |= 0x2;
            }
            if ((this.anIntArrayArray4584[i][i_60_]
                    == this.anIntArrayArray4584[i + 1][i_60_])
                    && (this.anIntArrayArray4584[i][i_60_]
                    == this.anIntArrayArray4584[i + 1][i_60_ + 1])
                    && (this.anIntArrayArray4584[i][i_60_]
                    == this.anIntArrayArray4584[i][i_60_ + 1]))
                class102.aByte1606 |= 0x1;
            Class12 class12 = null;
            if (i_93_ != -1)
                class12 = aHa_Sub1_8217.aD4579.method3(i_93_, -6662);
            if (class12 != null && (class102.aByte1606 & 0x2) == 0
                    && !class12.aBoolean209) {
                class102.aShort1601
                        = (short) (aByteArrayArray8220[i][i_60_]
                        - aByteArrayArray8232[i][i_60_]);
                class102.aShort1603
                        = (short) (aByteArrayArray8220[i + 1][i_60_]
                        - aByteArrayArray8232[i + 1][i_60_]);
                class102.aShort1602
                        = (short) (aByteArrayArray8220[i + 1][i_60_ + 1]
                        - aByteArrayArray8232[i + 1][i_60_ + 1]);
                class102.aShort1604
                        = (short) (aByteArrayArray8220[i][i_60_ + 1]
                        - aByteArrayArray8232[i][i_60_ + 1]);
                class102.aShort1605 = (short) i_93_;
                if (method3997(class12.aByte213)
                        || class12.aByte198 != 0
                        || class12.aByte211 != 0)
                    class102.aByte1606 |= 0x4;
            } else {
                short i_94_ = Class25.method303(i_92_, 30);
                class102.aShort1601
                        = (short) Class291.method2198(0, ((aByteArrayArray8220[i]
                        [i_60_])
                        - (aByteArrayArray8232[i]
                        [i_60_])), i_94_);
                class102.aShort1603
                        = (short) Class291.method2198(0,
                        ((aByteArrayArray8220[i + 1]
                                [i_60_])
                                - (aByteArrayArray8232
                                [i + 1][i_60_])),
                        i_94_);
                class102.aShort1602
                        = (short) Class291.method2198(0,
                        ((aByteArrayArray8220[i + 1]
                                [i_60_ + 1])
                                - (aByteArrayArray8232
                                [i + 1][i_60_ + 1])),
                        i_94_);
                class102.aShort1604
                        = (short) Class291.method2198(0, ((aByteArrayArray8220[i]
                        [i_60_ + 1])
                        - (aByteArrayArray8232[i]
                        [i_60_ + 1])), i_94_);
                class102.aShort1605 = (short) -1;
            }
            aClass102ArrayArray8215[i][i_60_] = class102;
        }
    }

    final void method3984(int i, int i_95_, int i_96_, boolean[][] bools,
                          boolean bool, int i_97_, int i_98_) {
        Class101_Sub1 class101_sub1
                = aHa_Sub1_8217.aClass101_Sub1_7492;
        anInt8228 = i_97_;
        aFloat8212 = class101_sub1.aFloat5672;
        aFloat8216 = class101_sub1.aFloat5673;
        aFloat8224 = class101_sub1.aFloat5669;
        aFloat8213 = class101_sub1.aFloat5686;
        aFloat8214 = class101_sub1.aFloat5655;
        aFloat8221 = class101_sub1.aFloat5678;
        aFloat8229 = class101_sub1.aFloat5666;
        aFloat8226 = class101_sub1.aFloat5685;
        aFloat8233 = class101_sub1.aFloat5662;
        aFloat8227 = class101_sub1.aFloat5680;
        aFloat8231 = class101_sub1.aFloat5664;
        aFloat8218 = class101_sub1.aFloat5681;
        for (int i_99_ = 0; i_99_ < i_96_ + i_96_; i_99_++) {
            for (int i_100_ = 0; i_100_ < i_96_ + i_96_; i_100_++) {
                if (bools[i_99_][i_100_]) {
                    int i_101_ = i - i_96_ + i_99_;
                    int i_102_ = i_95_ - i_96_ + i_100_;
                    if (i_101_ >= 0 && i_101_ < this.anInt4587
                            && i_102_ >= 0 && i_102_ < this.anInt4590)
                        method3992(i_101_, i_102_, i_98_);
                }
            }
        }
    }

    final void ka(int i, int i_103_, int i_104_) {
        if (aByteArrayArray8232[i][i_103_] < i_104_)
            aByteArrayArray8232[i][i_103_] = (byte) i_104_;
    }

    private final void method3990
            (int i, int i_105_, boolean bool, Class167 class167, Class109 class109,
             int[] is, int[] is_106_, int[] is_107_, int[] is_108_, int i_109_) {
        Class266 class266 = aClass266ArrayArray8230[i][i_105_];
        if (class266 == null) {
            Class145 class145 = aClass145ArrayArray8225[i][i_105_];
            if (class145 != null) {
                if (i_109_ != 0) {
                    if ((class145.aByte2004 & 0x4) != 0) {
                        if ((i_109_ & 0x1) != 0)
                            return;
                    } else if ((i_109_ & 0x2) != 0)
                        return;
                }
                if (anInt8228 == -1) {
                    for (int i_187_ = 0;
                         i_187_ < class145.aShort2003; i_187_++) {
                        int i_188_
                                = (class145.aShortArray2009[i_187_]
                                + (i << this.anInt4588));
                        int i_189_
                                = class145.aShortArray2007[i_187_];
                        int i_190_
                                = (class145.aShortArray2002[i_187_]
                                + (i_105_ << this.anInt4588));
                        float f = aFloat8218 + (aFloat8233 * (float) i_188_
                                + aFloat8227 * (float) i_189_
                                + aFloat8231 * (float) i_190_);
                        if (f <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        is_108_[i_187_] = 0;
                        if (bool) {
                            int i_191_
                                    = (int) (f - (float) (class167
                                    .anInt2210));
                            if (i_191_ > 255)
                                i_191_ = 255;
                            if (i_191_ > 0) {
                                is_108_[i_187_] = i_191_;
                                int i_192_ = ((class145
                                        .aShortArray2006[i_187_])
                                        * i_191_ / 255);
                                if (i_192_ > 0)
                                    i_189_ -= i_192_;
                            }
                        } else if (class167.aBoolean2201) {
                            int i_193_
                                    = (int) (f - (float) (class167
                                    .anInt2210));
                            if (i_193_ > 0) {
                                is_108_[i_187_] = i_193_;
                                if (is_108_[i_187_] > 255)
                                    is_108_[i_187_] = 255;
                            }
                        }
                        float f_194_
                                = aFloat8213 + (aFloat8212 * (float) i_188_
                                + aFloat8216 * (float) i_189_
                                + aFloat8224 * (float) i_190_);
                        float f_195_
                                = aFloat8226 + (aFloat8214 * (float) i_188_
                                + aFloat8221 * (float) i_189_
                                + aFloat8229 * (float) i_190_);
                        is[i_187_]
                                = (class109.anInt1665
                                + (int) (f_194_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f));
                        is_106_[i_187_]
                                = (class109.anInt1668
                                + (int) (f_195_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f));
                        is_107_[i_187_] = (int) f;
                    }
                } else {
                    for (int i_196_ = 0;
                         i_196_ < class145.aShort2003; i_196_++) {
                        int i_197_
                                = (class145.aShortArray2009[i_196_]
                                + (i << this.anInt4588));
                        int i_198_
                                = class145.aShortArray2007[i_196_];
                        int i_199_
                                = (class145.aShortArray2002[i_196_]
                                + (i_105_ << this.anInt4588));
                        float f = aFloat8218 + (aFloat8233 * (float) i_197_
                                + aFloat8227 * (float) i_198_
                                + aFloat8231 * (float) i_199_);
                        is_108_[i_196_] = 0;
                        if (bool) {
                            int i_200_
                                    = anInt8228 - class167.anInt2210;
                            if (i_200_ > 255)
                                i_200_ = 255;
                            if (i_200_ > 0) {
                                is_108_[i_196_] = i_200_;
                                int i_201_ = ((class145
                                        .aShortArray2006[i_196_])
                                        * i_200_ / 255);
                                if (i_201_ > 0)
                                    i_198_ -= i_201_;
                            }
                        } else if (class167.aBoolean2201) {
                            int i_202_
                                    = anInt8228 - class167.anInt2210;
                            if (i_202_ > 0) {
                                is_108_[i_196_] = i_202_;
                                if (is_108_[i_196_] > 255)
                                    is_108_[i_196_] = 255;
                            }
                        }
                        float f_203_
                                = aFloat8213 + (aFloat8212 * (float) i_197_
                                + aFloat8216 * (float) i_198_
                                + aFloat8224 * (float) i_199_);
                        float f_204_
                                = aFloat8226 + (aFloat8214 * (float) i_197_
                                + aFloat8221 * (float) i_198_
                                + aFloat8229 * (float) i_199_);
                        is[i_196_]
                                = (class109.anInt1665
                                + (int) (f_203_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        is_106_[i_196_]
                                = (class109.anInt1668
                                + (int) (f_204_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        is_107_[i_196_] = (int) f;
                    }
                }
                if (class145.aShortArray2008 == null) {
                    for (int i_233_ = 0;
                         i_233_ < class145.aShort2010; i_233_++) {
                        int i_234_ = i_233_ * 3;
                        int i_235_ = i_234_ + 1;
                        int i_236_ = i_235_ + 1;
                        int i_237_ = is[i_234_];
                        int i_238_ = is[i_235_];
                        int i_239_ = is[i_236_];
                        int i_240_ = is_106_[i_234_];
                        int i_241_ = is_106_[i_235_];
                        int i_242_ = is_106_[i_236_];
                        int i_243_ = (is_108_[i_234_] + is_108_[i_235_]
                                + is_108_[i_236_]);
                        if (((i_237_ - i_238_) * (i_242_ - i_241_)
                                - (i_240_ - i_241_) * (i_239_ - i_238_))
                                > 0) {
                            class109.aBoolean1671
                                    = (i_237_ < 0 || i_238_ < 0 || i_239_ < 0
                                    || i_237_ > class109.anInt1679
                                    || i_238_ > class109.anInt1679
                                    || (i_239_
                                    > class109.anInt1679));
                            if (i_243_ < 765) {
                                if (i_243_ > 0) {
                                    if (((class145.anIntArray2001
                                            [i_234_])
                                            & 0xffffff)
                                            != 0)
                                        class109.method1027
                                                ((float) i_240_, (float) i_241_,
                                                        (float) i_242_, (float) i_237_,
                                                        (float) i_238_, (float) i_239_,
                                                        (float) is_107_[i_234_],
                                                        (float) is_107_[i_235_],
                                                        (float) is_107_[i_236_],
                                                        (Class298.method2250
                                                                ((class145
                                                                                .anIntArray2001[i_234_]),
                                                                        117, is_108_[i_234_],
                                                                        (class167
                                                                                .anInt2192))),
                                                        (Class298.method2250
                                                                ((class145
                                                                                .anIntArray2001[i_235_]),
                                                                        60, is_108_[i_235_],
                                                                        (class167
                                                                                .anInt2192))),
                                                        (Class298.method2250
                                                                ((class145
                                                                                .anIntArray2001[i_236_]),
                                                                        95, is_108_[i_236_],
                                                                        (class167
                                                                                .anInt2192))));
                                } else if (((class145
                                        .anIntArray2001[i_234_])
                                        & 0xffffff)
                                        != 0)
                                    class109.method1027
                                            ((float) i_240_, (float) i_241_,
                                                    (float) i_242_, (float) i_237_,
                                                    (float) i_238_, (float) i_239_,
                                                    (float) is_107_[i_234_],
                                                    (float) is_107_[i_235_],
                                                    (float) is_107_[i_236_],
                                                    (class145.anIntArray2001
                                                            [i_234_]),
                                                    (class145.anIntArray2001
                                                            [i_235_]),
                                                    (class145.anIntArray2001
                                                            [i_236_]));
                            } else
                                class109.method1018((float) i_240_,
                                        (float) i_241_,
                                        (float) i_242_,
                                        (float) i_237_,
                                        (float) i_238_,
                                        (float) i_239_,
                                        (float) is_107_[i_234_],
                                        (float) is_107_[i_235_],
                                        (float) is_107_[i_236_],
                                        (class167
                                                .anInt2192));
                        }
                    }
                } else {
                    if (anInt8228 == -1) {
                        for (int i_205_ = 0;
                             i_205_ < class145.aShort2010;
                             i_205_++) {
                            int i_206_ = i_205_ * 3;
                            int i_207_ = i_206_ + 1;
                            int i_208_ = i_207_ + 1;
                            int i_209_ = is[i_206_];
                            int i_210_ = is[i_207_];
                            int i_211_ = is[i_208_];
                            int i_212_ = is_106_[i_206_];
                            int i_213_ = is_106_[i_207_];
                            int i_214_ = is_106_[i_208_];
                            int i_215_ = (is_108_[i_206_] + is_108_[i_207_]
                                    + is_108_[i_208_]);
                            if (((i_209_ - i_210_) * (i_214_ - i_213_)
                                    - (i_212_ - i_213_) * (i_211_ - i_210_))
                                    > 0) {
                                class109.aBoolean1671
                                        = (i_209_ < 0 || i_210_ < 0 || i_211_ < 0
                                        || (i_209_
                                        > class109.anInt1679)
                                        || (i_210_
                                        > class109.anInt1679)
                                        || (i_211_
                                        > class109.anInt1679));
                                short i_216_ = (class145
                                        .aShortArray2008[i_205_]);
                                if (i_215_ < 765) {
                                    if (i_215_ > 0) {
                                        if (i_216_ != -1) {
                                            int i_217_ = -16777216;
                                            if (i_216_ != -1
                                                    && method3997(aHa_Sub1_8217
                                                            .aD4579
                                                            .method3
                                                                    (i_216_,
                                                                            -6662)
                                                    .aByte213))
                                                i_217_ = -1694498816;
                                            class109.method1024
                                                    ((float) i_212_,
                                                            (float) i_213_,
                                                            (float) i_214_,
                                                            (float) i_209_,
                                                            (float) i_210_,
                                                            (float) i_211_,
                                                            (float) is_107_[i_206_],
                                                            (float) is_107_[i_207_],
                                                            (float) is_107_[i_208_],
                                                            ((float) (class145
                                                                    .aShortArray2009
                                                                    [i_206_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2009
                                                                    [i_207_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2009
                                                                    [i_208_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2002
                                                                    [i_206_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2002
                                                                    [i_207_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2002
                                                                    [i_208_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            (i_217_
                                                                    | ((class145
                                                                    .anIntArray2001[i_206_])
                                                                    & 0xffffff)),
                                                            (i_217_
                                                                    | ((class145
                                                                    .anIntArray2001[i_207_])
                                                                    & 0xffffff)),
                                                            (i_217_
                                                                    | ((class145
                                                                    .anIntArray2001[i_208_])
                                                                    & 0xffffff)),
                                                            (class167
                                                                    .anInt2192),
                                                            is_108_[i_206_],
                                                            is_108_[i_207_],
                                                            is_108_[i_208_], i_216_);
                                        } else if (((class145
                                                .anIntArray2001[i_206_])
                                                & 0xffffff)
                                                != 0) {
                                            if (i_216_ != -1
                                                    && method3997(aHa_Sub1_8217
                                                            .aD4579
                                                            .method3
                                                                    (i_216_,
                                                                            -6662)
                                                    .aByte213))
                                                class109.anInt1674
                                                        = -1694498816;
                                            class109.method1027
                                                    ((float) i_212_,
                                                            (float) i_213_,
                                                            (float) i_214_,
                                                            (float) i_209_,
                                                            (float) i_210_,
                                                            (float) i_211_,
                                                            (float) is_107_[i_206_],
                                                            (float) is_107_[i_207_],
                                                            (float) is_107_[i_208_],
                                                            (Class6.method206
                                                                    ((class145
                                                                                    .anIntArray2001[i_206_]),
                                                                            (is_108_[i_206_] << 24
                                                                                    | (class167
                                                                                    .anInt2192)),
                                                                            255)),
                                                            (Class6.method206
                                                                    ((class145
                                                                                    .anIntArray2001[i_207_]),
                                                                            (is_108_[i_207_] << 24
                                                                                    | (class167
                                                                                    .anInt2192)),
                                                                            255)),
                                                            (Class6.method206
                                                                    ((class145
                                                                                    .anIntArray2001[i_208_]),
                                                                            (is_108_[i_208_] << 24
                                                                                    | (class167
                                                                                    .anInt2192)),
                                                                            255)));
                                            class109.anInt1674
                                                    = 0;
                                        }
                                    } else if (i_216_ != -1) {
                                        int i_218_ = -16777216;
                                        if (i_216_ != -1
                                                && (method3997
                                                (aHa_Sub1_8217
                                                        .aD4579
                                                        .method3(i_216_, -6662)
                                                        .aByte213)))
                                            i_218_ = -1694498816;
                                        class109.method1024
                                                ((float) i_212_, (float) i_213_,
                                                        (float) i_214_, (float) i_209_,
                                                        (float) i_210_, (float) i_211_,
                                                        (float) is_107_[i_206_],
                                                        (float) is_107_[i_207_],
                                                        (float) is_107_[i_208_],
                                                        ((float) (class145
                                                                .aShortArray2009
                                                                [i_206_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2009
                                                                [i_207_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2009
                                                                [i_208_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2002
                                                                [i_206_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2002
                                                                [i_207_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2002
                                                                [i_208_])
                                                                / (float) this.anInt4592),
                                                        i_218_ | (class145
                                                                .anIntArray2001
                                                                [i_206_]) & 0xffffff,
                                                        i_218_ | (class145
                                                                .anIntArray2001
                                                                [i_207_]) & 0xffffff,
                                                        i_218_ | (class145
                                                                .anIntArray2001
                                                                [i_208_]) & 0xffffff,
                                                        0, 0, 0, 0, i_216_);
                                    } else if (((class145
                                            .anIntArray2001[i_206_])
                                            & 0xffffff)
                                            != 0) {
                                        if (i_216_ != -1
                                                && (method3997
                                                (aHa_Sub1_8217
                                                        .aD4579
                                                        .method3(i_216_, -6662)
                                                        .aByte213)))
                                            class109.anInt1674
                                                    = -1694498816;
                                        class109.method1027
                                                ((float) i_212_, (float) i_213_,
                                                        (float) i_214_, (float) i_209_,
                                                        (float) i_210_, (float) i_211_,
                                                        (float) is_107_[i_206_],
                                                        (float) is_107_[i_207_],
                                                        (float) is_107_[i_208_],
                                                        (class145
                                                                .anIntArray2001[i_206_]),
                                                        (class145
                                                                .anIntArray2001[i_207_]),
                                                        (class145
                                                                .anIntArray2001[i_208_]));
                                        class109.anInt1674 = 0;
                                    }
                                } else
                                    class109.method1018
                                            ((float) i_212_, (float) i_213_,
                                                    (float) i_214_, (float) i_209_,
                                                    (float) i_210_, (float) i_211_,
                                                    (float) is_107_[i_206_],
                                                    (float) is_107_[i_207_],
                                                    (float) is_107_[i_208_],
                                                    class167.anInt2192);
                            }
                        }
                    } else {
                        for (int i_219_ = 0;
                             i_219_ < class145.aShort2010;
                             i_219_++) {
                            int i_220_ = i_219_ * 3;
                            int i_221_ = i_220_ + 1;
                            int i_222_ = i_221_ + 1;
                            int i_223_ = is[i_220_];
                            int i_224_ = is[i_221_];
                            int i_225_ = is[i_222_];
                            int i_226_ = is_106_[i_220_];
                            int i_227_ = is_106_[i_221_];
                            int i_228_ = is_106_[i_222_];
                            int i_229_ = (is_108_[i_220_] + is_108_[i_221_]
                                    + is_108_[i_222_]);
                            if (((i_223_ - i_224_) * (i_228_ - i_227_)
                                    - (i_226_ - i_227_) * (i_225_ - i_224_))
                                    > 0) {
                                class109.aBoolean1671
                                        = (i_223_ < 0 || i_224_ < 0 || i_225_ < 0
                                        || (i_223_
                                        > class109.anInt1679)
                                        || (i_224_
                                        > class109.anInt1679)
                                        || (i_225_
                                        > class109.anInt1679));
                                short i_230_ = (class145
                                        .aShortArray2008[i_219_]);
                                if (i_229_ < 765) {
                                    if (i_230_ != -1
                                            && method3997(aHa_Sub1_8217
                                                    .aD4579.method3
                                                            (i_230_, -6662)
                                            .aByte213))
                                        class109.anInt1674
                                                = -1694498816;
                                    if (i_229_ > 0) {
                                        if (i_230_ != -1) {
                                            int i_231_ = -16777216;
                                            if (i_230_ != -1
                                                    && method3997(aHa_Sub1_8217
                                                            .aD4579
                                                            .method3
                                                                    (i_230_,
                                                                            -6662)
                                                    .aByte213))
                                                i_231_ = -1694498816;
                                            class109.method1024
                                                    ((float) i_226_,
                                                            (float) i_227_,
                                                            (float) i_228_,
                                                            (float) i_223_,
                                                            (float) i_224_,
                                                            (float) i_225_,
                                                            (float) is_107_[i_220_],
                                                            (float) is_107_[i_221_],
                                                            (float) is_107_[i_222_],
                                                            ((float) (class145
                                                                    .aShortArray2009
                                                                    [i_220_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2009
                                                                    [i_221_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2009
                                                                    [i_222_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2002
                                                                    [i_220_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2002
                                                                    [i_221_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            ((float) (class145
                                                                    .aShortArray2002
                                                                    [i_222_])
                                                                    / (float) (this
                                                                    .anInt4592)),
                                                            (i_231_
                                                                    | ((class145
                                                                    .anIntArray2001[i_220_])
                                                                    & 0xffffff)),
                                                            (i_231_
                                                                    | ((class145
                                                                    .anIntArray2001[i_221_])
                                                                    & 0xffffff)),
                                                            (i_231_
                                                                    | ((class145
                                                                    .anIntArray2001[i_222_])
                                                                    & 0xffffff)),
                                                            (class167
                                                                    .anInt2192),
                                                            is_108_[i_220_],
                                                            is_108_[i_221_],
                                                            is_108_[i_222_], i_230_);
                                        } else if (((class145
                                                .anIntArray2001[i_220_])
                                                & 0xffffff)
                                                != 0) {
                                            if (i_230_ != -1
                                                    && method3997(aHa_Sub1_8217
                                                            .aD4579
                                                            .method3
                                                                    (i_230_,
                                                                            -6662)
                                                    .aByte213))
                                                class109.anInt1674
                                                        = -1694498816;
                                            class109.method1027
                                                    ((float) i_226_,
                                                            (float) i_227_,
                                                            (float) i_228_,
                                                            (float) i_223_,
                                                            (float) i_224_,
                                                            (float) i_225_,
                                                            (float) is_107_[i_220_],
                                                            (float) is_107_[i_221_],
                                                            (float) is_107_[i_222_],
                                                            (Class6.method206
                                                                    ((class145
                                                                                    .anIntArray2001[i_220_]),
                                                                            (is_108_[i_220_] << 24
                                                                                    | (class167
                                                                                    .anInt2192)),
                                                                            255)),
                                                            (Class6.method206
                                                                    ((class145
                                                                                    .anIntArray2001[i_221_]),
                                                                            (is_108_[i_221_] << 24
                                                                                    | (class167
                                                                                    .anInt2192)),
                                                                            255)),
                                                            (Class6.method206
                                                                    ((class145
                                                                                    .anIntArray2001[i_222_]),
                                                                            (is_108_[i_222_] << 24
                                                                                    | (class167
                                                                                    .anInt2192)),
                                                                            255)));
                                            class109.anInt1674
                                                    = 0;
                                        }
                                    } else if (i_230_ != -1) {
                                        int i_232_ = -16777216;
                                        if (i_230_ != -1
                                                && (method3997
                                                (aHa_Sub1_8217
                                                        .aD4579
                                                        .method3(i_230_, -6662)
                                                        .aByte213)))
                                            i_232_ = -1694498816;
                                        class109.method1024
                                                ((float) i_226_, (float) i_227_,
                                                        (float) i_228_, (float) i_223_,
                                                        (float) i_224_, (float) i_225_,
                                                        (float) is_107_[i_220_],
                                                        (float) is_107_[i_221_],
                                                        (float) is_107_[i_222_],
                                                        ((float) (class145
                                                                .aShortArray2009
                                                                [i_220_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2009
                                                                [i_221_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2009
                                                                [i_222_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2002
                                                                [i_220_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2002
                                                                [i_221_])
                                                                / (float) this.anInt4592),
                                                        ((float) (class145
                                                                .aShortArray2002
                                                                [i_222_])
                                                                / (float) this.anInt4592),
                                                        i_232_ | (class145
                                                                .anIntArray2001
                                                                [i_220_]) & 0xffffff,
                                                        i_232_ | (class145
                                                                .anIntArray2001
                                                                [i_221_]) & 0xffffff,
                                                        i_232_ | (class145
                                                                .anIntArray2001
                                                                [i_222_]) & 0xffffff,
                                                        0, 0, 0, 0, i_230_);
                                    } else if (((class145
                                            .anIntArray2001[i_220_])
                                            & 0xffffff)
                                            != 0) {
                                        if (i_230_ != -1
                                                && (method3997
                                                (aHa_Sub1_8217
                                                        .aD4579
                                                        .method3(i_230_, -6662)
                                                        .aByte213)))
                                            class109.anInt1674
                                                    = -1694498816;
                                        class109.method1027
                                                ((float) i_226_, (float) i_227_,
                                                        (float) i_228_, (float) i_223_,
                                                        (float) i_224_, (float) i_225_,
                                                        (float) is_107_[i_220_],
                                                        (float) is_107_[i_221_],
                                                        (float) is_107_[i_222_],
                                                        (class145
                                                                .anIntArray2001[i_220_]),
                                                        (class145
                                                                .anIntArray2001[i_221_]),
                                                        (class145
                                                                .anIntArray2001[i_222_]));
                                        class109.anInt1674 = 0;
                                    }
                                    class109.anInt1674 = 0;
                                } else
                                    class109.method1018
                                            ((float) i_226_, (float) i_227_,
                                                    (float) i_228_, (float) i_223_,
                                                    (float) i_224_, (float) i_225_,
                                                    (float) is_107_[i_220_],
                                                    (float) is_107_[i_221_],
                                                    (float) is_107_[i_222_],
                                                    class167.anInt2192);
                            }
                        }
                    }
                }
            }
        } else {
            if ((class266.aByte3386 & 0x2) == 0) {
                if (i_109_ != 0) {
                    if ((class266.aByte3386 & 0x4) != 0) {
                        if ((i_109_ & 0x1) != 0)
                            return;
                    } else if ((i_109_ & 0x2) != 0)
                        return;
                }
                int i_110_ = i * this.anInt4592;
                int i_111_ = i_110_ + this.anInt4592;
                int i_112_ = i_105_ * this.anInt4592;
                int i_113_ = i_112_ + this.anInt4592;
                int i_114_ = 0;
                int i_115_ = 0;
                int i_116_ = 0;
                int i_117_ = 0;
                float f;
                float f_118_;
                float f_119_;
                float f_120_;
                int i_121_;
                int i_122_;
                int i_123_;
                int i_124_;
                int i_125_;
                int i_126_;
                int i_127_;
                int i_128_;
                if ((class266.aByte3386 & 0x1) == 0 || bool) {
                    int i_150_ = this.anIntArrayArray4584[i][i_105_];
                    int i_151_ = this.anIntArrayArray4584[i + 1][i_105_];
                    int i_152_
                            = this.anIntArrayArray4584[i + 1][i_105_ + 1];
                    int i_153_ = this.anIntArrayArray4584[i][i_105_ + 1];
                    if (anInt8228 == -1) {
                        f = aFloat8218 + (aFloat8233 * (float) i_110_
                                + aFloat8227 * (float) i_150_
                                + aFloat8231 * (float) i_112_);
                        if (f <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_118_ = aFloat8218 + (aFloat8233 * (float) i_111_
                                + aFloat8227 * (float) i_151_
                                + aFloat8231 * (float) i_112_);
                        if (f_118_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_119_ = aFloat8218 + (aFloat8233 * (float) i_111_
                                + aFloat8227 * (float) i_152_
                                + aFloat8231 * (float) i_113_);
                        if (f_119_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_120_ = aFloat8218 + (aFloat8233 * (float) i_110_
                                + aFloat8227 * (float) i_153_
                                + aFloat8231 * (float) i_113_);
                        if (f_120_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                    } else {
                        f = aFloat8218 + (aFloat8233 * (float) i_110_
                                + aFloat8227 * (float) i_150_
                                + aFloat8231 * (float) i_112_);
                        f_118_ = aFloat8218 + (aFloat8233 * (float) i_111_
                                + aFloat8227 * (float) i_151_
                                + aFloat8231 * (float) i_112_);
                        f_119_ = aFloat8218 + (aFloat8233 * (float) i_111_
                                + aFloat8227 * (float) i_152_
                                + aFloat8231 * (float) i_113_);
                        f_120_ = aFloat8218 + (aFloat8233 * (float) i_110_
                                + aFloat8227 * (float) i_153_
                                + aFloat8231 * (float) i_113_);
                    }
                    if (bool) {
                        int i_154_ = (int) (f - (float) (class167
                                .anInt2210));
                        if (i_154_ > 255)
                            i_154_ = 255;
                        if (i_154_ > 0) {
                            i_114_ = i_154_;
                            int i_155_ = (class266.aShort3382
                                    * i_154_ / 255);
                            if (i_155_ > 0)
                                i_150_ -= i_155_;
                        }
                        i_154_ = (int) (f_118_ - (float) (class167
                                .anInt2210));
                        if (i_154_ > 255)
                            i_154_ = 255;
                        if (i_154_ > 0) {
                            i_115_ = i_154_;
                            int i_156_ = (class266.aShort3383
                                    * i_154_ / 255);
                            if (i_156_ > 0)
                                i_151_ -= i_156_;
                        }
                        i_154_ = (int) (f_119_ - (float) (class167
                                .anInt2210));
                        if (i_154_ > 255)
                            i_154_ = 255;
                        if (i_154_ > 0) {
                            i_116_ = i_154_;
                            int i_157_ = (class266.aShort3384
                                    * i_154_ / 255);
                            if (i_157_ > 0)
                                i_152_ -= i_157_;
                        }
                        i_154_ = (int) (f_120_ - (float) (class167
                                .anInt2210));
                        if (i_154_ > 255)
                            i_154_ = 255;
                        if (i_154_ > 0) {
                            i_117_ = i_154_;
                            int i_158_ = (class266.aShort3385
                                    * i_154_ / 255);
                            if (i_158_ > 0)
                                i_153_ -= i_158_;
                        }
                    } else if (class167.aBoolean2201) {
                        int i_159_ = (int) (f - (float) (class167
                                .anInt2210));
                        if (i_159_ > 0) {
                            i_114_ = i_159_;
                            if (i_114_ > 255)
                                i_114_ = 255;
                        }
                        i_159_ = (int) (f_118_ - (float) (class167
                                .anInt2210));
                        if (i_159_ > 0) {
                            i_115_ = i_159_;
                            if (i_115_ > 255)
                                i_115_ = 255;
                        }
                        i_159_ = (int) (f_119_ - (float) (class167
                                .anInt2210));
                        if (i_159_ > 0) {
                            i_116_ = i_159_;
                            if (i_116_ > 255)
                                i_116_ = 255;
                        }
                        i_159_ = (int) (f_120_ - (float) (class167
                                .anInt2210));
                        if (i_159_ > 0) {
                            i_117_ = i_159_;
                            if (i_117_ > 255)
                                i_117_ = 255;
                        }
                    }
                    if (anInt8228 == -1) {
                        float f_160_
                                = aFloat8213 + (aFloat8212 * (float) i_110_
                                + aFloat8216 * (float) i_150_
                                + aFloat8224 * (float) i_112_);
                        i_121_ = (class109.anInt1665
                                + (int) (f_160_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f));
                        float f_161_
                                = aFloat8226 + (aFloat8214 * (float) i_110_
                                + aFloat8221 * (float) i_150_
                                + aFloat8229 * (float) i_112_);
                        i_122_ = (class109.anInt1668
                                + (int) (f_161_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f));
                        float f_162_
                                = aFloat8213 + (aFloat8212 * (float) i_111_
                                + aFloat8216 * (float) i_151_
                                + aFloat8224 * (float) i_112_);
                        i_123_ = (class109.anInt1665
                                + (int) (f_162_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_118_));
                        float f_163_
                                = aFloat8226 + (aFloat8214 * (float) i_111_
                                + aFloat8221 * (float) i_151_
                                + aFloat8229 * (float) i_112_);
                        i_124_ = (class109.anInt1668
                                + (int) (f_163_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_118_));
                        float f_164_
                                = aFloat8213 + (aFloat8212 * (float) i_111_
                                + aFloat8216 * (float) i_152_
                                + aFloat8224 * (float) i_113_);
                        i_125_ = (class109.anInt1665
                                + (int) (f_164_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_119_));
                        float f_165_
                                = aFloat8226 + (aFloat8214 * (float) i_111_
                                + aFloat8221 * (float) i_152_
                                + aFloat8229 * (float) i_113_);
                        i_126_ = (class109.anInt1668
                                + (int) (f_165_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_119_));
                        float f_166_
                                = aFloat8213 + (aFloat8212 * (float) i_110_
                                + aFloat8216 * (float) i_153_
                                + aFloat8224 * (float) i_113_);
                        i_127_ = (class109.anInt1665
                                + (int) (f_166_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_120_));
                        float f_167_
                                = aFloat8226 + (aFloat8214 * (float) i_110_
                                + aFloat8221 * (float) i_153_
                                + aFloat8229 * (float) i_113_);
                        i_128_ = (class109.anInt1668
                                + (int) (f_167_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_120_));
                    } else {
                        float f_168_
                                = aFloat8213 + (aFloat8212 * (float) i_110_
                                + aFloat8216 * (float) i_150_
                                + aFloat8224 * (float) i_112_);
                        i_121_ = (class109.anInt1665
                                + (int) (f_168_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_169_
                                = aFloat8226 + (aFloat8214 * (float) i_110_
                                + aFloat8221 * (float) i_150_
                                + aFloat8229 * (float) i_112_);
                        i_122_ = (class109.anInt1668
                                + (int) (f_169_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_170_
                                = aFloat8213 + (aFloat8212 * (float) i_111_
                                + aFloat8216 * (float) i_151_
                                + aFloat8224 * (float) i_112_);
                        i_123_ = (class109.anInt1665
                                + (int) (f_170_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_171_
                                = aFloat8226 + (aFloat8214 * (float) i_111_
                                + aFloat8221 * (float) i_151_
                                + aFloat8229 * (float) i_112_);
                        i_124_ = (class109.anInt1668
                                + (int) (f_171_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_172_
                                = aFloat8213 + (aFloat8212 * (float) i_111_
                                + aFloat8216 * (float) i_152_
                                + aFloat8224 * (float) i_113_);
                        i_125_ = (class109.anInt1665
                                + (int) (f_172_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_173_
                                = aFloat8226 + (aFloat8214 * (float) i_111_
                                + aFloat8221 * (float) i_152_
                                + aFloat8229 * (float) i_113_);
                        i_126_ = (class109.anInt1668
                                + (int) (f_173_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_174_
                                = aFloat8213 + (aFloat8212 * (float) i_110_
                                + aFloat8216 * (float) i_153_
                                + aFloat8224 * (float) i_113_);
                        i_127_ = (class109.anInt1665
                                + (int) (f_174_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_175_
                                = aFloat8226 + (aFloat8214 * (float) i_110_
                                + aFloat8221 * (float) i_153_
                                + aFloat8229 * (float) i_113_);
                        i_128_ = (class109.anInt1668
                                + (int) (f_175_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                    }
                } else {
                    int i_129_ = this.anIntArrayArray4584[i][i_105_];
                    float f_130_ = aFloat8227 * (float) i_129_;
                    if (anInt8228 == -1) {
                        f = aFloat8218 + (aFloat8233 * (float) i_110_ + f_130_
                                + aFloat8231 * (float) i_112_);
                        if (f <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_118_ = aFloat8218 + (aFloat8233 * (float) i_111_
                                + f_130_
                                + aFloat8231 * (float) i_112_);
                        if (f_118_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_119_ = aFloat8218 + (aFloat8233 * (float) i_111_
                                + f_130_
                                + aFloat8231 * (float) i_113_);
                        if (f_119_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_120_ = aFloat8218 + (aFloat8233 * (float) i_110_
                                + f_130_
                                + aFloat8231 * (float) i_113_);
                        if (f_120_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                    } else {
                        f = aFloat8218 + (aFloat8233 * (float) i_110_ + f_130_
                                + aFloat8231 * (float) i_112_);
                        f_118_ = aFloat8218 + (aFloat8233 * (float) i_111_
                                + f_130_
                                + aFloat8231 * (float) i_112_);
                        f_119_ = aFloat8218 + (aFloat8233 * (float) i_111_
                                + f_130_
                                + aFloat8231 * (float) i_113_);
                        f_120_ = aFloat8218 + (aFloat8233 * (float) i_110_
                                + f_130_
                                + aFloat8231 * (float) i_113_);
                    }
                    if (class167.aBoolean2201) {
                        int i_131_ = (int) (f - (float) (class167
                                .anInt2210));
                        if (i_131_ > 0) {
                            i_114_ = i_131_;
                            if (i_114_ > 255)
                                i_114_ = 255;
                        }
                        i_131_ = (int) (f_118_ - (float) (class167
                                .anInt2210));
                        if (i_131_ > 0) {
                            i_115_ = i_131_;
                            if (i_115_ > 255)
                                i_115_ = 255;
                        }
                        i_131_ = (int) (f_119_ - (float) (class167
                                .anInt2210));
                        if (i_131_ > 0) {
                            i_116_ = i_131_;
                            if (i_116_ > 255)
                                i_116_ = 255;
                        }
                        i_131_ = (int) (f_120_ - (float) (class167
                                .anInt2210));
                        if (i_131_ > 0) {
                            i_117_ = i_131_;
                            if (i_117_ > 255)
                                i_117_ = 255;
                        }
                    }
                    float f_132_ = aFloat8216 * (float) i_129_;
                    float f_133_ = aFloat8221 * (float) i_129_;
                    if (anInt8228 == -1) {
                        float f_134_ = (aFloat8213
                                + (aFloat8212 * (float) i_110_ + f_132_
                                + aFloat8224 * (float) i_112_));
                        i_121_ = (class109.anInt1665
                                + (int) (f_134_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f));
                        float f_135_ = (aFloat8226
                                + (aFloat8214 * (float) i_110_ + f_133_
                                + aFloat8229 * (float) i_112_));
                        i_122_ = (class109.anInt1668
                                + (int) (f_135_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f));
                        float f_136_ = (aFloat8213
                                + (aFloat8212 * (float) i_111_ + f_132_
                                + aFloat8224 * (float) i_112_));
                        i_123_ = (class109.anInt1665
                                + (int) (f_136_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_118_));
                        float f_137_ = (aFloat8226
                                + (aFloat8214 * (float) i_111_ + f_133_
                                + aFloat8229 * (float) i_112_));
                        i_124_ = (class109.anInt1668
                                + (int) (f_137_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_118_));
                        float f_138_ = (aFloat8213
                                + (aFloat8212 * (float) i_111_ + f_132_
                                + aFloat8224 * (float) i_113_));
                        i_125_ = (class109.anInt1665
                                + (int) (f_138_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_119_));
                        float f_139_ = (aFloat8226
                                + (aFloat8214 * (float) i_111_ + f_133_
                                + aFloat8229 * (float) i_113_));
                        i_126_ = (class109.anInt1668
                                + (int) (f_139_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_119_));
                        float f_140_ = (aFloat8213
                                + (aFloat8212 * (float) i_110_ + f_132_
                                + aFloat8224 * (float) i_113_));
                        i_127_ = (class109.anInt1665
                                + (int) (f_140_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_120_));
                        float f_141_ = (aFloat8226
                                + (aFloat8214 * (float) i_110_ + f_133_
                                + aFloat8229 * (float) i_113_));
                        i_128_ = (class109.anInt1668
                                + (int) (f_141_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_120_));
                    } else {
                        float f_142_ = (aFloat8213
                                + (aFloat8212 * (float) i_110_ + f_132_
                                + aFloat8224 * (float) i_112_));
                        i_121_ = (class109.anInt1665
                                + (int) (f_142_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_143_ = (aFloat8226
                                + (aFloat8214 * (float) i_110_ + f_133_
                                + aFloat8229 * (float) i_112_));
                        i_122_ = (class109.anInt1668
                                + (int) (f_143_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_144_ = (aFloat8213
                                + (aFloat8212 * (float) i_111_ + f_132_
                                + aFloat8224 * (float) i_112_));
                        i_123_ = (class109.anInt1665
                                + (int) (f_144_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_145_ = (aFloat8226
                                + (aFloat8214 * (float) i_111_ + f_133_
                                + aFloat8229 * (float) i_112_));
                        i_124_ = (class109.anInt1668
                                + (int) (f_145_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_146_ = (aFloat8213
                                + (aFloat8212 * (float) i_111_ + f_132_
                                + aFloat8224 * (float) i_113_));
                        i_125_ = (class109.anInt1665
                                + (int) (f_146_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_147_ = (aFloat8226
                                + (aFloat8214 * (float) i_111_ + f_133_
                                + aFloat8229 * (float) i_113_));
                        i_126_ = (class109.anInt1668
                                + (int) (f_147_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_148_ = (aFloat8213
                                + (aFloat8212 * (float) i_110_ + f_132_
                                + aFloat8224 * (float) i_113_));
                        i_127_ = (class109.anInt1665
                                + (int) (f_148_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_149_ = (aFloat8226
                                + (aFloat8214 * (float) i_110_ + f_133_
                                + aFloat8229 * (float) i_113_));
                        i_128_ = (class109.anInt1668
                                + (int) (f_149_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                    }
                }
                boolean bool_176_
                        = (class266.aShort3379 != -1
                        && method3997(aHa_Sub1_8217.aD4579.method3
                                (class266.aShort3379,
                                        -6662).aByte213));
                if (anInt8228 == -1) {
                    int i_177_ = i_115_ + i_116_ + i_117_;
                    if (((i_125_ - i_127_) * (i_124_ - i_128_)
                            - (i_126_ - i_128_) * (i_123_ - i_127_))
                            > 0) {
                        class109.aBoolean1671
                                = (i_125_ < 0 || i_127_ < 0 || i_123_ < 0
                                || i_125_ > class109.anInt1679
                                || i_127_ > class109.anInt1679
                                || i_123_ > class109.anInt1679);
                        if (i_177_ < 765) {
                            if (i_177_ > 0) {
                                if (class266.aShort3379 >= 0) {
                                    int i_178_ = -16777216;
                                    if (bool_176_)
                                        i_178_ = -1694498816;
                                    class109.method1024
                                            ((float) i_126_, (float) i_128_,
                                                    (float) i_124_, (float) i_125_,
                                                    (float) i_127_, (float) i_123_,
                                                    f_119_, f_120_, f_118_, 1.0F, 0.0F,
                                                    1.0F, 1.0F, 1.0F, 0.0F,
                                                    i_178_ | (class266
                                                            .anInt3380) & 0xffffff,
                                                    i_178_ | (class266
                                                            .anInt3381) & 0xffffff,
                                                    i_178_ | (class266
                                                            .anInt3387) & 0xffffff,
                                                    class167.anInt2192,
                                                    i_116_, i_117_, i_115_,
                                                    class266.aShort3379);
                                } else {
                                    if (bool_176_)
                                        class109.anInt1674 = 100;
                                    class109.method1027
                                            ((float) i_126_, (float) i_128_,
                                                    (float) i_124_, (float) i_125_,
                                                    (float) i_127_, (float) i_123_,
                                                    (float) (int) f_119_,
                                                    (float) (int) f_120_,
                                                    (float) (int) f_118_,
                                                    (Class6.method206
                                                            (class266.anInt3380,
                                                                    (i_116_ << 24
                                                                            | class167.anInt2192),
                                                                    255)),
                                                    (Class6.method206
                                                            (class266.anInt3381,
                                                                    (i_117_ << 24
                                                                            | class167.anInt2192),
                                                                    255)),
                                                    (Class6.method206
                                                            (class266.anInt3387,
                                                                    (i_115_ << 24
                                                                            | class167.anInt2192),
                                                                    255)));
                                    class109.anInt1674 = 0;
                                }
                            } else if (class266.aShort3379 >= 0) {
                                int i_179_ = -16777216;
                                if (bool_176_)
                                    i_179_ = -1694498816;
                                class109.method1024
                                        ((float) i_126_, (float) i_128_,
                                                (float) i_124_, (float) i_125_,
                                                (float) i_127_, (float) i_123_, f_119_,
                                                f_120_, f_118_, 1.0F, 0.0F, 1.0F, 1.0F,
                                                1.0F, 0.0F,
                                                i_179_ | (class266.anInt3380
                                                        & 0xffffff),
                                                i_179_ | (class266.anInt3381
                                                        & 0xffffff),
                                                i_179_ | (class266.anInt3387
                                                        & 0xffffff),
                                                0, 0, 0, 0,
                                                class266.aShort3379);
                            } else {
                                if (bool_176_)
                                    class109.anInt1674 = 100;
                                class109.method1027
                                        ((float) i_126_, (float) i_128_,
                                                (float) i_124_, (float) i_125_,
                                                (float) i_127_, (float) i_123_,
                                                (float) (int) f_119_,
                                                (float) (int) f_120_,
                                                (float) (int) f_118_,
                                                class266.anInt3380,
                                                class266.anInt3381,
                                                class266.anInt3387);
                                class109.anInt1674 = 0;
                            }
                        } else
                            class109.method1018((float) i_126_, (float) i_128_,
                                    (float) i_124_, (float) i_125_,
                                    (float) i_127_, (float) i_123_,
                                    (float) (int) f_119_,
                                    (float) (int) f_120_,
                                    (float) (int) f_118_,
                                    (class167
                                            .anInt2192));
                    }
                    i_177_ = i_114_ + i_115_ + i_117_;
                    if (((i_121_ - i_123_) * (i_128_ - i_124_)
                            - (i_122_ - i_124_) * (i_127_ - i_123_))
                            > 0) {
                        class109.aBoolean1671
                                = (i_121_ < 0 || i_123_ < 0 || i_127_ < 0
                                || i_121_ > class109.anInt1679
                                || i_123_ > class109.anInt1679
                                || i_127_ > class109.anInt1679);
                        if (i_177_ < 765) {
                            if (bool_176_)
                                class109.anInt1674 = -1694498816;
                            if (i_177_ > 0) {
                                if (class266.aShort3379 >= 0) {
                                    int i_180_ = -16777216;
                                    if (bool_176_)
                                        i_180_ = -1694498816;
                                    class109.method1024
                                            ((float) i_122_, (float) i_124_,
                                                    (float) i_128_, (float) i_121_,
                                                    (float) i_123_, (float) i_127_, f,
                                                    f_118_, f_120_, 0.0F, 1.0F, 1.0F,
                                                    0.0F, 0.0F, 1.0F,
                                                    i_180_ | (class266
                                                            .anInt3389) & 0xffffff,
                                                    i_180_ | (class266
                                                            .anInt3387) & 0xffffff,
                                                    i_180_ | (class266
                                                            .anInt3381) & 0xffffff,
                                                    class167.anInt2192,
                                                    i_114_, i_115_, i_117_,
                                                    class266.aShort3379);
                                } else {
                                    if (bool_176_)
                                        class109.anInt1674 = 100;
                                    class109.method1027
                                            ((float) i_122_, (float) i_124_,
                                                    (float) i_128_, (float) i_121_,
                                                    (float) i_123_, (float) i_127_,
                                                    (float) (int) f, (float) (int) f_118_,
                                                    (float) (int) f_120_,
                                                    (Class6.method206
                                                            (class266.anInt3389,
                                                                    (i_114_ << 24
                                                                            | class167.anInt2192),
                                                                    255)),
                                                    (Class6.method206
                                                            (class266.anInt3387,
                                                                    (i_115_ << 24
                                                                            | class167.anInt2192),
                                                                    255)),
                                                    (Class6.method206
                                                            (class266.anInt3381,
                                                                    (i_117_ << 24
                                                                            | class167.anInt2192),
                                                                    255)));
                                    class109.anInt1674 = 0;
                                }
                            } else if (class266.aShort3379 >= 0) {
                                int i_181_ = -16777216;
                                if (bool_176_)
                                    i_181_ = -1694498816;
                                class109.method1024
                                        ((float) i_122_, (float) i_124_,
                                                (float) i_128_, (float) i_121_,
                                                (float) i_123_, (float) i_127_, f, f_118_,
                                                f_120_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F,
                                                1.0F,
                                                i_181_ | (class266.anInt3389
                                                        & 0xffffff),
                                                i_181_ | (class266.anInt3387
                                                        & 0xffffff),
                                                i_181_ | (class266.anInt3381
                                                        & 0xffffff),
                                                0, 0, 0, 0,
                                                class266.aShort3379);
                            } else {
                                if (bool_176_)
                                    class109.anInt1674 = 100;
                                class109.method1027
                                        ((float) i_122_, (float) i_124_,
                                                (float) i_128_, (float) i_121_,
                                                (float) i_123_, (float) i_127_,
                                                (float) (int) f, (float) (int) f_118_,
                                                (float) (int) f_120_,
                                                class266.anInt3389,
                                                class266.anInt3387,
                                                class266.anInt3381);
                                class109.anInt1674 = 0;
                            }
                        } else
                            class109.method1018((float) i_122_, (float) i_124_,
                                    (float) i_128_, (float) i_121_,
                                    (float) i_123_, (float) i_127_,
                                    (float) (int) f,
                                    (float) (int) f_118_,
                                    (float) (int) f_120_,
                                    (class167
                                            .anInt2192));
                    }
                } else {
                    int i_182_ = i_115_ + i_116_ + i_117_;
                    if (((i_125_ - i_127_) * (i_124_ - i_128_)
                            - (i_126_ - i_128_) * (i_123_ - i_127_))
                            > 0) {
                        class109.aBoolean1671
                                = (i_125_ < 0 || i_127_ < 0 || i_123_ < 0
                                || i_125_ > class109.anInt1679
                                || i_127_ > class109.anInt1679
                                || i_123_ > class109.anInt1679);
                        if (i_182_ < 765) {
                            if (bool_176_)
                                class109.anInt1674 = -1694498816;
                            if (i_182_ > 0) {
                                if (class266.aShort3379 >= 0) {
                                    int i_183_ = -16777216;
                                    if (bool_176_)
                                        i_183_ = -1694498816;
                                    class109.method1024
                                            ((float) i_126_, (float) i_128_,
                                                    (float) i_124_, (float) i_125_,
                                                    (float) i_127_, (float) i_123_,
                                                    f_119_, f_120_, f_118_, 1.0F, 0.0F,
                                                    1.0F, 1.0F, 1.0F, 0.0F,
                                                    i_183_ | (class266
                                                            .anInt3380) & 0xffffff,
                                                    i_183_ | (class266
                                                            .anInt3381) & 0xffffff,
                                                    i_183_ | (class266
                                                            .anInt3387) & 0xffffff,
                                                    class167.anInt2192,
                                                    i_116_, i_117_, i_115_,
                                                    class266.aShort3379);
                                } else {
                                    if (bool_176_)
                                        class109.anInt1674 = 100;
                                    class109.method1027
                                            ((float) i_126_, (float) i_128_,
                                                    (float) i_124_, (float) i_125_,
                                                    (float) i_127_, (float) i_123_,
                                                    (float) (int) f_119_,
                                                    (float) (int) f_120_,
                                                    (float) (int) f_118_,
                                                    (Class6.method206
                                                            (class266.anInt3380,
                                                                    (i_116_ << 24
                                                                            | class167.anInt2192),
                                                                    255)),
                                                    (Class6.method206
                                                            (class266.anInt3381,
                                                                    (i_117_ << 24
                                                                            | class167.anInt2192),
                                                                    255)),
                                                    (Class6.method206
                                                            (class266.anInt3387,
                                                                    (i_115_ << 24
                                                                            | class167.anInt2192),
                                                                    255)));
                                    class109.anInt1674 = 0;
                                }
                            } else if (class266.aShort3379 >= 0) {
                                int i_184_ = -16777216;
                                if (bool_176_)
                                    i_184_ = -1694498816;
                                class109.method1024
                                        ((float) i_126_, (float) i_128_,
                                                (float) i_124_, (float) i_125_,
                                                (float) i_127_, (float) i_123_, f_119_,
                                                f_120_, f_118_, 1.0F, 0.0F, 1.0F, 1.0F,
                                                1.0F, 0.0F,
                                                i_184_ | (class266.anInt3380
                                                        & 0xffffff),
                                                i_184_ | (class266.anInt3381
                                                        & 0xffffff),
                                                i_184_ | (class266.anInt3387
                                                        & 0xffffff),
                                                0, 0, 0, 0,
                                                class266.aShort3379);
                            } else {
                                if (bool_176_)
                                    class109.anInt1674 = 100;
                                class109.method1027
                                        ((float) i_126_, (float) i_128_,
                                                (float) i_124_, (float) i_125_,
                                                (float) i_127_, (float) i_123_,
                                                (float) (int) f_119_,
                                                (float) (int) f_120_,
                                                (float) (int) f_118_,
                                                class266.anInt3380,
                                                class266.anInt3381,
                                                class266.anInt3387);
                                class109.anInt1674 = 0;
                            }
                        } else
                            class109.method1018((float) i_126_, (float) i_128_,
                                    (float) i_124_, (float) i_125_,
                                    (float) i_127_, (float) i_123_,
                                    (float) (int) f_119_,
                                    (float) (int) f_120_,
                                    (float) (int) f_118_,
                                    (class167
                                            .anInt2192));
                    }
                    i_182_ = i_114_ + i_115_ + i_117_;
                    if (((i_121_ - i_123_) * (i_128_ - i_124_)
                            - (i_122_ - i_124_) * (i_127_ - i_123_))
                            > 0) {
                        class109.aBoolean1671
                                = (i_121_ < 0 || i_123_ < 0 || i_127_ < 0
                                || i_121_ > class109.anInt1679
                                || i_123_ > class109.anInt1679
                                || i_127_ > class109.anInt1679);
                        if (i_182_ < 765) {
                            if (bool_176_)
                                class109.anInt1674 = -1694498816;
                            if (i_182_ > 0) {
                                if (class266.aShort3379 >= 0) {
                                    int i_185_ = -16777216;
                                    if (bool_176_)
                                        i_185_ = -1694498816;
                                    class109.method1024
                                            ((float) i_122_, (float) i_124_,
                                                    (float) i_128_, (float) i_121_,
                                                    (float) i_123_, (float) i_127_, f,
                                                    f_118_, f_120_, 0.0F, 1.0F, 1.0F,
                                                    0.0F, 0.0F, 1.0F,
                                                    i_185_ | (class266
                                                            .anInt3389) & 0xffffff,
                                                    i_185_ | (class266
                                                            .anInt3387) & 0xffffff,
                                                    i_185_ | (class266
                                                            .anInt3381) & 0xffffff,
                                                    class167.anInt2192,
                                                    i_114_, i_115_, i_117_,
                                                    class266.aShort3379);
                                } else {
                                    if (bool_176_)
                                        class109.anInt1674 = 100;
                                    class109.method1027
                                            ((float) i_122_, (float) i_124_,
                                                    (float) i_128_, (float) i_121_,
                                                    (float) i_123_, (float) i_127_,
                                                    (float) (int) f, (float) (int) f_118_,
                                                    (float) (int) f_120_,
                                                    (Class6.method206
                                                            (class266.anInt3389,
                                                                    (i_114_ << 24
                                                                            | class167.anInt2192),
                                                                    255)),
                                                    (Class6.method206
                                                            (class266.anInt3387,
                                                                    (i_115_ << 24
                                                                            | class167.anInt2192),
                                                                    255)),
                                                    (Class6.method206
                                                            (class266.anInt3381,
                                                                    (i_117_ << 24
                                                                            | class167.anInt2192),
                                                                    255)));
                                    class109.anInt1674 = 0;
                                }
                            } else if (class266.aShort3379 >= 0) {
                                int i_186_ = -16777216;
                                if (bool_176_)
                                    i_186_ = -1694498816;
                                class109.method1024
                                        ((float) i_122_, (float) i_124_,
                                                (float) i_128_, (float) i_121_,
                                                (float) i_123_, (float) i_127_, f, f_118_,
                                                f_120_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F,
                                                1.0F,
                                                i_186_ | (class266.anInt3389
                                                        & 0xffffff),
                                                i_186_ | (class266.anInt3387
                                                        & 0xffffff),
                                                i_186_ | (class266.anInt3381
                                                        & 0xffffff),
                                                0, 0, 0, 0,
                                                class266.aShort3379);
                            } else {
                                if (bool_176_)
                                    class109.anInt1674 = 100;
                                class109.method1027
                                        ((float) i_122_, (float) i_124_,
                                                (float) i_128_, (float) i_121_,
                                                (float) i_123_, (float) i_127_,
                                                (float) (int) f, (float) (int) f_118_,
                                                (float) (int) f_120_,
                                                class266.anInt3389,
                                                class266.anInt3387,
                                                class266.anInt3381);
                                class109.anInt1674 = 0;
                            }
                        } else
                            class109.method1018((float) i_122_, (float) i_124_,
                                    (float) i_128_, (float) i_121_,
                                    (float) i_123_, (float) i_127_,
                                    (float) (int) f,
                                    (float) (int) f_118_,
                                    (float) (int) f_120_,
                                    (class167
                                            .anInt2192));
                    }
                }
            }
        }
    }

    private static final int method3991(int i, int i_244_) {
        int i_245_ = (i & 0xff0000) * i_244_ >> 23;
        if (i_245_ < 2)
            i_245_ = 2;
        else if (i_245_ > 253)
            i_245_ = 253;
        int i_246_ = (i & 0xff00) * i_244_ >> 15;
        if (i_246_ < 2)
            i_246_ = 2;
        else if (i_246_ > 253)
            i_246_ = 253;
        int i_247_ = (i & 0xff) * i_244_ >> 7;
        if (i_247_ < 2)
            i_247_ = 2;
        else if (i_247_ > 253)
            i_247_ = 253;
        return i_245_ << 16 | i_246_ << 8 | i_247_;
    }

    final void method3983(int i, int i_248_, int i_249_, boolean[][] bools,
                          boolean bool, int i_250_) {
        Class101_Sub1 class101_sub1
                = aHa_Sub1_8217.aClass101_Sub1_7492;
        anInt8228 = -1;
        aFloat8212 = class101_sub1.aFloat5672;
        aFloat8216 = class101_sub1.aFloat5673;
        aFloat8224 = class101_sub1.aFloat5669;
        aFloat8213 = class101_sub1.aFloat5686;
        aFloat8214 = class101_sub1.aFloat5655;
        aFloat8221 = class101_sub1.aFloat5678;
        aFloat8229 = class101_sub1.aFloat5666;
        aFloat8226 = class101_sub1.aFloat5685;
        aFloat8233 = class101_sub1.aFloat5662;
        aFloat8227 = class101_sub1.aFloat5680;
        aFloat8231 = class101_sub1.aFloat5664;
        aFloat8218 = class101_sub1.aFloat5681;
        for (int i_251_ = 0; i_251_ < i_249_ + i_249_; i_251_++) {
            for (int i_252_ = 0; i_252_ < i_249_ + i_249_; i_252_++) {
                if (bools[i_251_][i_252_]) {
                    int i_253_ = i - i_249_ + i_251_;
                    int i_254_ = i_248_ - i_249_ + i_252_;
                    if (i_253_ >= 0 && i_253_ < this.anInt4587
                            && i_254_ >= 0 && i_254_ < this.anInt4590)
                        method3992(i_253_, i_254_, i_250_);
                }
            }
        }
    }

    private final void method3992(int i, int i_255_, int i_256_) {
        Class167 class167 = aHa_Sub1_8217.method3724(Thread.currentThread());
        class167.aClass109_2220.anInt1674 = 0;
        if (aClass266ArrayArray8230 != null)
            method3990(i, i_255_, class167.aBoolean2195, class167,
                    class167.aClass109_2220,
                    class167.anIntArray2212,
                    class167.anIntArray2228,
                    class167.anIntArray2217,
                    class167.anIntArray2232, i_256_);
        else if (aClass102ArrayArray8215 != null)
            method3994(i, i_255_, class167.aClass109_2220,
                    class167.anIntArray2212,
                    class167.anIntArray2228,
                    class167.anIntArray2217,
                    class167.anIntArray2232, i_256_);
        else if (aClass198ArrayArray8219 != null)
            method3995(i, i_255_, class167.aBoolean2195, class167,
                    class167.aClass109_2220,
                    class167.anIntArray2212,
                    class167.anIntArray2228,
                    class167.anIntArray2217,
                    class167.anIntArray2232, i_256_);
    }

    final void wa(r var_r, int i, int i_257_, int i_258_, int i_259_,
                  boolean bool) {
        /* empty */
    }

    private final void method3993(int i, int i_260_, int i_261_, int i_262_,
                                  int i_263_, int i_264_, int i_265_,
                                  boolean[][] bools, Class167 class167,
                                  Class109 class109, int[] is, int[] is_266_) {
        int i_267_ = (i_265_ - i_263_) * i_261_ / 256;
        int i_268_ = i_261_ >> 8;
        boolean bool = class167.aBoolean2202;
        aHa_Sub1_8217.C(false);
        class109.aBoolean1669 = false;
        class109.aBoolean1667 = false;
        int i_269_ = i;
        int i_270_ = i_260_ + i_267_;
        for (int i_271_ = i_262_; i_271_ < i_264_; i_271_++) {
            for (int i_272_ = i_263_; i_272_ < i_265_; i_272_++) {
                if (bools[i_271_ - i_262_][i_272_ - i_263_]) {
                    if (aClass266ArrayArray8230 != null) {
                        if (aClass266ArrayArray8230[i_271_][i_272_] != null) {
                            Class266 class266
                                    = aClass266ArrayArray8230[i_271_][i_272_];
                            if (class266.aShort3379 != -1
                                    && (class266.aByte3386 & 0x2) == 0
                                    && class266.anInt3388 == 0) {
                                int i_273_
                                        = aHa_Sub1_8217.method3722(class266
                                        .aShort3379);
                                class109.method1022
                                        ((float) (i_270_ - i_268_),
                                                (float) (i_270_ - i_268_), (float) i_270_,
                                                (float) (i_269_ + i_268_), (float) i_269_,
                                                (float) (i_269_ + i_268_), 100.0F, 100.0F,
                                                100.0F,
                                                (float) Class291.method2198(0,
                                                        (class266
                                                                .anInt3380),
                                                        i_273_),
                                                (float) Class291.method2198(0,
                                                        (class266
                                                                .anInt3381),
                                                        i_273_),
                                                (float) Class291.method2198(0,
                                                        (class266
                                                                .anInt3387),
                                                        i_273_));
                                class109.method1022
                                        ((float) i_270_, (float) i_270_,
                                                (float) (i_270_ - i_268_), (float) i_269_,
                                                (float) (i_269_ + i_268_), (float) i_269_,
                                                100.0F, 100.0F, 100.0F,
                                                (float) Class291.method2198(0,
                                                        (class266
                                                                .anInt3389),
                                                        i_273_),
                                                (float) Class291.method2198(0,
                                                        (class266
                                                                .anInt3387),
                                                        i_273_),
                                                (float) Class291.method2198(0,
                                                        (class266
                                                                .anInt3381),
                                                        i_273_));
                            } else if (class266.anInt3388 == 0) {
                                class109.method1027
                                        ((float) (i_270_ - i_268_),
                                                (float) (i_270_ - i_268_), (float) i_270_,
                                                (float) (i_269_ + i_268_), (float) i_269_,
                                                (float) (i_269_ + i_268_), 100.0F, 100.0F,
                                                100.0F, class266.anInt3380,
                                                class266.anInt3381,
                                                class266.anInt3387);
                                class109.method1027
                                        ((float) i_270_, (float) i_270_,
                                                (float) (i_270_ - i_268_), (float) i_269_,
                                                (float) (i_269_ + i_268_), (float) i_269_,
                                                100.0F, 100.0F, 100.0F,
                                                class266.anInt3389,
                                                class266.anInt3387,
                                                class266.anInt3381);
                            } else {
                                int i_274_ = class266.anInt3388;
                                class109.method1027
                                        ((float) (i_270_ - i_268_),
                                                (float) (i_270_ - i_268_), (float) i_270_,
                                                (float) (i_269_ + i_268_), (float) i_269_,
                                                (float) (i_269_ + i_268_), 100.0F, 100.0F,
                                                100.0F,
                                                Class6.method206(i_274_,
                                                        (class266
                                                                .anInt3380) & ~0xffffff,
                                                        255),
                                                Class6.method206(i_274_,
                                                        (class266
                                                                .anInt3381) & ~0xffffff,
                                                        255),
                                                Class6.method206(i_274_,
                                                        (class266
                                                                .anInt3387) & ~0xffffff,
                                                        255));
                                class109.method1027
                                        ((float) i_270_, (float) i_270_,
                                                (float) (i_270_ - i_268_), (float) i_269_,
                                                (float) (i_269_ + i_268_), (float) i_269_,
                                                100.0F, 100.0F, 100.0F,
                                                Class6.method206(i_274_,
                                                        (class266
                                                                .anInt3389) & ~0xffffff,
                                                        255),
                                                Class6.method206(i_274_,
                                                        (class266
                                                                .anInt3387) & ~0xffffff,
                                                        255),
                                                Class6.method206(i_274_,
                                                        (class266
                                                                .anInt3381) & ~0xffffff,
                                                        255));
                            }
                        } else if (aClass145ArrayArray8225[i_271_][i_272_]
                                != null) {
                            Class145 class145
                                    = aClass145ArrayArray8225[i_271_][i_272_];
                            for (int i_275_ = 0;
                                 i_275_ < class145.aShort2003;
                                 i_275_++) {
                                is[i_275_]
                                        = i_269_ + ((class145
                                        .aShortArray2009[i_275_])
                                        * i_268_
                                        / this.anInt4592);
                                is_266_[i_275_]
                                        = i_270_ - ((class145
                                        .aShortArray2002[i_275_])
                                        * i_268_
                                        / this.anInt4592);
                            }
                            for (int i_276_ = 0;
                                 i_276_ < class145.aShort2010;
                                 i_276_++) {
                                int i_277_ = i_276_ * 3;
                                int i_278_ = i_277_ + 1;
                                int i_279_ = i_278_ + 1;
                                int i_280_ = is[i_277_];
                                int i_281_ = is[i_278_];
                                int i_282_ = is[i_279_];
                                int i_283_ = is_266_[i_277_];
                                int i_284_ = is_266_[i_278_];
                                int i_285_ = is_266_[i_279_];
                                if ((class145.anIntArray2011
                                        != null)
                                        && (class145.anIntArray2011
                                        [i_276_]) != 0
                                        && ((class145.aShortArray2008
                                        == null)
                                        || ((class145
                                        .aShortArray2008) != null
                                        && ((class145
                                        .aShortArray2008[i_276_])
                                        == -1)))) {
                                    int i_286_ = (class145
                                            .anIntArray2011[i_276_]);
                                    class109.method1027
                                            ((float) i_283_, (float) i_284_,
                                                    (float) i_285_, (float) i_280_,
                                                    (float) i_281_, (float) i_282_,
                                                    100.0F, 100.0F, 100.0F,
                                                    Class6.method206(i_286_,
                                                            (-16777216
                                                                    - ((class145
                                                                    .anIntArray2001
                                                                    [i_277_])
                                                                    & ~0xffffff)),
                                                            255),
                                                    Class6.method206(i_286_,
                                                            (-16777216
                                                                    - ((class145
                                                                    .anIntArray2001
                                                                    [i_278_])
                                                                    & ~0xffffff)),
                                                            255),
                                                    Class6.method206(i_286_,
                                                            (-16777216
                                                                    - ((class145
                                                                    .anIntArray2001
                                                                    [i_279_])
                                                                    & ~0xffffff)),
                                                            255));
                                } else if ((class145
                                        .aShortArray2008) != null
                                        && ((class145
                                        .aShortArray2008[i_276_])
                                        != -1)) {
                                    int i_287_ = (aHa_Sub1_8217.method3722
                                            (class145
                                                    .aShortArray2008[i_276_]));
                                    class109.method1022((float) i_283_,
                                            (float) i_284_,
                                            (float) i_285_,
                                            (float) i_280_,
                                            (float) i_281_,
                                            (float) i_282_, 100.0F,
                                            100.0F, 100.0F,
                                            (float) i_287_,
                                            (float) i_287_,
                                            (float) i_287_);
                                } else
                                    class109.method1027
                                            ((float) i_283_, (float) i_284_,
                                                    (float) i_285_, (float) i_280_,
                                                    (float) i_281_, (float) i_282_,
                                                    100.0F, 100.0F, 100.0F,
                                                    (class145.anIntArray2001
                                                            [i_277_]),
                                                    (class145.anIntArray2001
                                                            [i_278_]),
                                                    (class145.anIntArray2001
                                                            [i_279_]));
                            }
                        }
                    } else if (aClass198ArrayArray8219[i_271_][i_272_]
                            != null) {
                        Class198 class198
                                = aClass198ArrayArray8219[i_271_][i_272_];
                        for (int i_288_ = 0;
                             i_288_ < class198.aShort2620;
                             i_288_++) {
                            is[i_288_]
                                    = i_269_ + ((class198
                                    .aShortArray2622[i_288_])
                                    * i_268_ / this.anInt4592);
                            is_266_[i_288_]
                                    = i_270_ - ((class198
                                    .aShortArray2613[i_288_])
                                    * i_268_ / this.anInt4592);
                        }
                        for (int i_289_ = 0;
                             i_289_ < class198.aShort2619;
                             i_289_++) {
                            int i_290_ = i_289_ * 3;
                            int i_291_ = i_290_ + 1;
                            int i_292_ = i_291_ + 1;
                            int i_293_ = is[i_290_];
                            int i_294_ = is[i_291_];
                            int i_295_ = is[i_292_];
                            int i_296_ = is_266_[i_290_];
                            int i_297_ = is_266_[i_291_];
                            int i_298_ = is_266_[i_292_];
                            if (class198.anIntArray2615 != null
                                    && (class198.anIntArray2615
                                    [i_289_]) != 0) {
                                int i_299_ = (class198
                                        .anIntArray2615[i_289_]);
                                class109.method1027((float) i_296_,
                                        (float) i_297_,
                                        (float) i_298_,
                                        (float) i_293_,
                                        (float) i_294_,
                                        (float) i_295_, 100.0F,
                                        100.0F, 100.0F, i_299_,
                                        i_299_, i_299_);
                            } else
                                class109.method1027((float) i_296_,
                                        (float) i_297_,
                                        (float) i_298_,
                                        (float) i_293_,
                                        (float) i_294_,
                                        (float) i_295_, 100.0F,
                                        100.0F, 100.0F,
                                        (class198
                                                .anIntArray2623[i_290_]),
                                        (class198
                                                .anIntArray2623[i_291_]),
                                        (class198
                                                .anIntArray2623[i_292_]));
                        }
                    }
                }
                i_270_ -= i_268_;
            }
            i_270_ = i_260_ + i_267_;
            i_269_ += i_268_;
        }
        class109.aBoolean1669 = true;
        aHa_Sub1_8217.C(bool);
    }

    private final void method3994(int i, int i_300_, Class109 class109,
                                  int[] is, int[] is_301_, int[] is_302_,
                                  int[] is_303_, int i_304_) {
        Class102 class102 = aClass102ArrayArray8215[i][i_300_];
        if (class102 == null) {
            Class236 class236 = aClass236ArrayArray8222[i][i_300_];
            if (class236 != null) {
                if (i_304_ != 0) {
                    if ((class236.aByte3100 & 0x4) != 0) {
                        if ((i_304_ & 0x1) != 0)
                            return;
                    } else if ((i_304_ & 0x2) != 0)
                        return;
                }
                if (anInt8228 == -1) {
                    for (int i_360_ = 0;
                         i_360_ < class236.aShort3089; i_360_++) {
                        int i_361_
                                = (class236.aShortArray3096[i_360_]
                                + (i << this.anInt4588));
                        short i_362_
                                = class236.aShortArray3097[i_360_];
                        int i_363_
                                = (class236.aShortArray3094[i_360_]
                                + (i_300_ << this.anInt4588));
                        float f = aFloat8218 + (aFloat8233 * (float) i_361_
                                + aFloat8227 * (float) i_362_
                                + aFloat8231 * (float) i_363_);
                        if (f <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        float f_364_
                                = aFloat8213 + (aFloat8212 * (float) i_361_
                                + aFloat8216 * (float) i_362_
                                + aFloat8224 * (float) i_363_);
                        float f_365_
                                = aFloat8226 + (aFloat8214 * (float) i_361_
                                + aFloat8221 * (float) i_362_
                                + aFloat8229 * (float) i_363_);
                        is[i_360_]
                                = (class109.anInt1665
                                + (int) (f_364_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f));
                        is_301_[i_360_]
                                = (class109.anInt1668
                                + (int) (f_365_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f));
                        is_302_[i_360_] = (int) f;
                    }
                } else {
                    for (int i_366_ = 0;
                         i_366_ < class236.aShort3089; i_366_++) {
                        int i_367_
                                = (class236.aShortArray3096[i_366_]
                                + (i << this.anInt4588));
                        short i_368_
                                = class236.aShortArray3097[i_366_];
                        int i_369_
                                = (class236.aShortArray3094[i_366_]
                                + (i_300_ << this.anInt4588));
                        float f = aFloat8218 + (aFloat8233 * (float) i_367_
                                + aFloat8227 * (float) i_368_
                                + aFloat8231 * (float) i_369_);
                        float f_370_
                                = aFloat8213 + (aFloat8212 * (float) i_367_
                                + aFloat8216 * (float) i_368_
                                + aFloat8224 * (float) i_369_);
                        float f_371_
                                = aFloat8226 + (aFloat8214 * (float) i_367_
                                + aFloat8221 * (float) i_368_
                                + aFloat8229 * (float) i_369_);
                        is[i_366_]
                                = (class109.anInt1665
                                + (int) (f_370_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        is_301_[i_366_]
                                = (class109.anInt1668
                                + (int) (f_371_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        is_302_[i_366_] = (int) f;
                    }
                }
                if (class236.aShortArray3095 == null) {
                    for (int i_396_ = 0;
                         i_396_ < class236.aShort3099; i_396_++) {
                        short i_397_
                                = class236.aShortArray3091[i_396_];
                        short i_398_
                                = class236.aShortArray3090[i_396_];
                        short i_399_
                                = class236.aShortArray3101[i_396_];
                        int i_400_ = is[i_397_];
                        int i_401_ = is[i_398_];
                        int i_402_ = is[i_399_];
                        int i_403_ = is_301_[i_397_];
                        int i_404_ = is_301_[i_398_];
                        int i_405_ = is_301_[i_399_];
                        if (((i_400_ - i_401_) * (i_405_ - i_404_)
                                - (i_403_ - i_404_) * (i_402_ - i_401_))
                                > 0) {
                            int i_406_
                                    = class236.anIntArray3093[i_396_];
                            if (i_406_ != -1) {
                                class109.aBoolean1671
                                        = (i_400_ < 0 || i_401_ < 0 || i_402_ < 0
                                        || (i_400_
                                        > class109.anInt1679)
                                        || (i_401_
                                        > class109.anInt1679)
                                        || (i_402_
                                        > class109.anInt1679));
                                class109.method1022
                                        ((float) i_403_, (float) i_404_,
                                                (float) i_405_, (float) i_400_,
                                                (float) i_401_, (float) i_402_,
                                                (float) is_302_[i_397_],
                                                (float) is_302_[i_398_],
                                                (float) is_302_[i_399_],
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_397_]),
                                                                i_406_)),
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_398_]),
                                                                i_406_)),
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_399_]),
                                                                i_406_)));
                            }
                        }
                    }
                } else {
                    if (anInt8228 == -1) {
                        for (int i_372_ = 0;
                             i_372_ < class236.aShort3099;
                             i_372_++) {
                            short i_373_ = (class236
                                    .aShortArray3091[i_372_]);
                            short i_374_ = (class236
                                    .aShortArray3090[i_372_]);
                            short i_375_ = (class236
                                    .aShortArray3101[i_372_]);
                            int i_376_ = is[i_373_];
                            int i_377_ = is[i_374_];
                            int i_378_ = is[i_375_];
                            int i_379_ = is_301_[i_373_];
                            int i_380_ = is_301_[i_374_];
                            int i_381_ = is_301_[i_375_];
                            if (((i_376_ - i_377_) * (i_381_ - i_380_)
                                    - (i_379_ - i_380_) * (i_378_ - i_377_))
                                    > 0) {
                                class109.aBoolean1671
                                        = (i_376_ < 0 || i_377_ < 0 || i_378_ < 0
                                        || (i_376_
                                        > class109.anInt1679)
                                        || (i_377_
                                        > class109.anInt1679)
                                        || (i_378_
                                        > class109.anInt1679));
                                short i_382_ = (class236
                                        .aShortArray3095[i_372_]);
                                if (i_382_ == -1) {
                                    int i_383_ = (class236
                                            .anIntArray3093[i_372_]);
                                    if (i_383_ != -1)
                                        class109.method1022
                                                ((float) i_379_, (float) i_380_,
                                                        (float) i_381_, (float) i_376_,
                                                        (float) i_377_, (float) i_378_,
                                                        (float) is_302_[i_373_],
                                                        (float) is_302_[i_374_],
                                                        (float) is_302_[i_375_],
                                                        (float) (Class291.method2198
                                                                (0,
                                                                        (class236
                                                                                .aShortArray3088
                                                                                [i_373_]),
                                                                        i_383_)),
                                                        (float) (Class291.method2198
                                                                (0,
                                                                        (class236
                                                                                .aShortArray3088
                                                                                [i_374_]),
                                                                        i_383_)),
                                                        (float) (Class291.method2198
                                                                (0,
                                                                        (class236
                                                                                .aShortArray3088
                                                                                [i_375_]),
                                                                        i_383_)));
                                } else class109.method1024
                                            ((float) i_379_, (float) i_380_,
                                                    (float) i_381_, (float) i_376_,
                                                    (float) i_377_, (float) i_378_,
                                                    (float) is_302_[i_373_],
                                                    (float) is_302_[i_374_],
                                                    (float) is_302_[i_375_],
                                                    ((float) (class236
                                                            .aShortArray3096[i_373_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3096[i_374_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3096[i_375_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3094[i_373_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3094[i_374_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3094[i_375_])
                                                            / (float) this.anInt4592),
                                                    ~0xffffff | ((Class126.anIntArray4983
                                                            [(class236
                                                            .aShortArray3088
                                                            [i_373_]) & 0xffff])
                                                            & 0xffffff),
                                                    ~0xffffff | ((Class126.anIntArray4983
                                                            [(class236
                                                            .aShortArray3088
                                                            [i_374_]) & 0xffff])
                                                            & 0xffffff),
                                                    ~0xffffff | ((Class126.anIntArray4983
                                                            [(class236
                                                            .aShortArray3088
                                                            [i_375_]) & 0xffff])
                                                            & 0xffffff),
                                                    0, 0, 0, 0, i_382_);
                            }
                        }
                    } else {
                        for (int i_384_ = 0;
                             i_384_ < class236.aShort3099;
                             i_384_++) {
                            short i_385_ = (class236
                                    .aShortArray3091[i_384_]);
                            short i_386_ = (class236
                                    .aShortArray3090[i_384_]);
                            short i_387_ = (class236
                                    .aShortArray3101[i_384_]);
                            int i_388_ = is[i_385_];
                            int i_389_ = is[i_386_];
                            int i_390_ = is[i_387_];
                            int i_391_ = is_301_[i_385_];
                            int i_392_ = is_301_[i_386_];
                            int i_393_ = is_301_[i_387_];
                            if (((i_388_ - i_389_) * (i_393_ - i_392_)
                                    - (i_391_ - i_392_) * (i_390_ - i_389_))
                                    > 0) {
                                class109.aBoolean1671
                                        = (i_388_ < 0 || i_389_ < 0 || i_390_ < 0
                                        || (i_388_
                                        > class109.anInt1679)
                                        || (i_389_
                                        > class109.anInt1679)
                                        || (i_390_
                                        > class109.anInt1679));
                                short i_394_ = (class236
                                        .aShortArray3095[i_384_]);
                                if (i_394_ == -1) {
                                    int i_395_ = (class236
                                            .anIntArray3093[i_384_]);
                                    if (i_395_ != -1)
                                        class109.method1022
                                                ((float) i_391_, (float) i_392_,
                                                        (float) i_393_, (float) i_388_,
                                                        (float) i_389_, (float) i_390_,
                                                        (float) is_302_[i_385_],
                                                        (float) is_302_[i_386_],
                                                        (float) is_302_[i_387_],
                                                        (float) (Class291.method2198
                                                                (0,
                                                                        (class236
                                                                                .aShortArray3088
                                                                                [i_385_]),
                                                                        i_395_)),
                                                        (float) (Class291.method2198
                                                                (0,
                                                                        (class236
                                                                                .aShortArray3088
                                                                                [i_386_]),
                                                                        i_395_)),
                                                        (float) (Class291.method2198
                                                                (0,
                                                                        (class236
                                                                                .aShortArray3088
                                                                                [i_387_]),
                                                                        i_395_)));
                                } else class109.method1024
                                            ((float) i_391_, (float) i_392_,
                                                    (float) i_393_, (float) i_388_,
                                                    (float) i_389_, (float) i_390_,
                                                    (float) is_302_[i_385_],
                                                    (float) is_302_[i_386_],
                                                    (float) is_302_[i_387_],
                                                    ((float) (class236
                                                            .aShortArray3096[i_385_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3096[i_386_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3096[i_387_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3094[i_385_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3094[i_386_])
                                                            / (float) this.anInt4592),
                                                    ((float) (class236
                                                            .aShortArray3094[i_387_])
                                                            / (float) this.anInt4592),
                                                    ~0xffffff | ((Class126.anIntArray4983
                                                            [(class236
                                                            .aShortArray3088
                                                            [i_385_]) & 0xffff])
                                                            & 0xffffff),
                                                    ~0xffffff | ((Class126.anIntArray4983
                                                            [(class236
                                                            .aShortArray3088
                                                            [i_386_]) & 0xffff])
                                                            & 0xffffff),
                                                    ~0xffffff | ((Class126.anIntArray4983
                                                            [(class236
                                                            .aShortArray3088
                                                            [i_387_]) & 0xffff])
                                                            & 0xffffff),
                                                    0, 0, 0, 0, i_394_);
                            }
                        }
                    }
                }
            }
        } else {
            if ((class102.aByte1606 & 0x2) == 0) {
                if (i_304_ != 0) {
                    if ((class102.aByte1606 & 0x4) != 0) {
                        if ((i_304_ & 0x1) != 0)
                            return;
                    } else if ((i_304_ & 0x2) != 0)
                        return;
                }
                int i_305_ = i * this.anInt4592;
                int i_306_ = i_305_ + this.anInt4592;
                int i_307_ = i_300_ * this.anInt4592;
                int i_308_ = i_307_ + this.anInt4592;
                float f;
                float f_309_;
                float f_310_;
                float f_311_;
                int i_312_;
                int i_313_;
                int i_314_;
                int i_315_;
                int i_316_;
                int i_317_;
                int i_318_;
                int i_319_;
                if ((class102.aByte1606 & 0x1) == 0) {
                    int i_340_ = this.anIntArrayArray4584[i][i_300_];
                    int i_341_ = this.anIntArrayArray4584[i + 1][i_300_];
                    int i_342_
                            = this.anIntArrayArray4584[i + 1][i_300_ + 1];
                    int i_343_ = this.anIntArrayArray4584[i][i_300_ + 1];
                    if (anInt8228 == -1) {
                        f = aFloat8218 + (aFloat8233 * (float) i_305_
                                + aFloat8227 * (float) i_340_
                                + aFloat8231 * (float) i_307_);
                        if (f <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_309_ = aFloat8218 + (aFloat8233 * (float) i_306_
                                + aFloat8227 * (float) i_341_
                                + aFloat8231 * (float) i_307_);
                        if (f_309_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_310_ = aFloat8218 + (aFloat8233 * (float) i_306_
                                + aFloat8227 * (float) i_342_
                                + aFloat8231 * (float) i_308_);
                        if (f_310_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_311_ = aFloat8218 + (aFloat8233 * (float) i_305_
                                + aFloat8227 * (float) i_343_
                                + aFloat8231 * (float) i_308_);
                        if (f_311_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        float f_344_
                                = aFloat8213 + (aFloat8212 * (float) i_305_
                                + aFloat8216 * (float) i_340_
                                + aFloat8224 * (float) i_307_);
                        i_312_ = (class109.anInt1665
                                + (int) (f_344_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f));
                        float f_345_
                                = aFloat8226 + (aFloat8214 * (float) i_305_
                                + aFloat8221 * (float) i_340_
                                + aFloat8229 * (float) i_307_);
                        i_313_ = (class109.anInt1668
                                + (int) (f_345_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f));
                        float f_346_
                                = aFloat8213 + (aFloat8212 * (float) i_306_
                                + aFloat8216 * (float) i_341_
                                + aFloat8224 * (float) i_307_);
                        i_314_ = (class109.anInt1665
                                + (int) (f_346_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_309_));
                        float f_347_
                                = aFloat8226 + (aFloat8214 * (float) i_306_
                                + aFloat8221 * (float) i_341_
                                + aFloat8229 * (float) i_307_);
                        i_315_ = (class109.anInt1668
                                + (int) (f_347_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_309_));
                        float f_348_
                                = aFloat8213 + (aFloat8212 * (float) i_306_
                                + aFloat8216 * (float) i_342_
                                + aFloat8224 * (float) i_308_);
                        i_316_ = (class109.anInt1665
                                + (int) (f_348_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_310_));
                        float f_349_
                                = aFloat8226 + (aFloat8214 * (float) i_306_
                                + aFloat8221 * (float) i_342_
                                + aFloat8229 * (float) i_308_);
                        i_317_ = (class109.anInt1668
                                + (int) (f_349_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_310_));
                        float f_350_
                                = aFloat8213 + (aFloat8212 * (float) i_305_
                                + aFloat8216 * (float) i_343_
                                + aFloat8224 * (float) i_308_);
                        i_318_ = (class109.anInt1665
                                + (int) (f_350_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_311_));
                        float f_351_
                                = aFloat8226 + (aFloat8214 * (float) i_305_
                                + aFloat8221 * (float) i_343_
                                + aFloat8229 * (float) i_308_);
                        i_319_ = (class109.anInt1668
                                + (int) (f_351_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_311_));
                    } else {
                        f = aFloat8218 + (aFloat8233 * (float) i_305_
                                + aFloat8227 * (float) i_340_
                                + aFloat8231 * (float) i_307_);
                        f_309_ = aFloat8218 + (aFloat8233 * (float) i_306_
                                + aFloat8227 * (float) i_341_
                                + aFloat8231 * (float) i_307_);
                        f_310_ = aFloat8218 + (aFloat8233 * (float) i_306_
                                + aFloat8227 * (float) i_342_
                                + aFloat8231 * (float) i_308_);
                        f_311_ = aFloat8218 + (aFloat8233 * (float) i_305_
                                + aFloat8227 * (float) i_343_
                                + aFloat8231 * (float) i_308_);
                        float f_352_
                                = aFloat8213 + (aFloat8212 * (float) i_305_
                                + aFloat8216 * (float) i_340_
                                + aFloat8224 * (float) i_307_);
                        i_312_ = (class109.anInt1665
                                + (int) (f_352_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_353_
                                = aFloat8226 + (aFloat8214 * (float) i_305_
                                + aFloat8221 * (float) i_340_
                                + aFloat8229 * (float) i_307_);
                        i_313_ = (class109.anInt1668
                                + (int) (f_353_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_354_
                                = aFloat8213 + (aFloat8212 * (float) i_306_
                                + aFloat8216 * (float) i_341_
                                + aFloat8224 * (float) i_307_);
                        i_314_ = (class109.anInt1665
                                + (int) (f_354_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_355_
                                = aFloat8226 + (aFloat8214 * (float) i_306_
                                + aFloat8221 * (float) i_341_
                                + aFloat8229 * (float) i_307_);
                        i_315_ = (class109.anInt1668
                                + (int) (f_355_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_356_
                                = aFloat8213 + (aFloat8212 * (float) i_306_
                                + aFloat8216 * (float) i_342_
                                + aFloat8224 * (float) i_308_);
                        i_316_ = (class109.anInt1665
                                + (int) (f_356_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_357_
                                = aFloat8226 + (aFloat8214 * (float) i_306_
                                + aFloat8221 * (float) i_342_
                                + aFloat8229 * (float) i_308_);
                        i_317_ = (class109.anInt1668
                                + (int) (f_357_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_358_
                                = aFloat8213 + (aFloat8212 * (float) i_305_
                                + aFloat8216 * (float) i_343_
                                + aFloat8224 * (float) i_308_);
                        i_318_ = (class109.anInt1665
                                + (int) (f_358_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_359_
                                = aFloat8226 + (aFloat8214 * (float) i_305_
                                + aFloat8221 * (float) i_343_
                                + aFloat8229 * (float) i_308_);
                        i_319_ = (class109.anInt1668
                                + (int) (f_359_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                    }
                } else {
                    int i_320_ = this.anIntArrayArray4584[i][i_300_];
                    float f_321_ = aFloat8227 * (float) i_320_;
                    if (anInt8228 == -1) {
                        f = aFloat8218 + (aFloat8233 * (float) i_305_ + f_321_
                                + aFloat8231 * (float) i_307_);
                        if (f <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_309_ = aFloat8218 + (aFloat8233 * (float) i_306_
                                + f_321_
                                + aFloat8231 * (float) i_307_);
                        if (f_309_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_310_ = aFloat8218 + (aFloat8233 * (float) i_306_
                                + f_321_
                                + aFloat8231 * (float) i_308_);
                        if (f_310_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        f_311_ = aFloat8218 + (aFloat8233 * (float) i_305_
                                + f_321_
                                + aFloat8231 * (float) i_308_);
                        if (f_311_
                                <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                    } else {
                        f = aFloat8218 + (aFloat8233 * (float) i_305_ + f_321_
                                + aFloat8231 * (float) i_307_);
                        f_309_ = aFloat8218 + (aFloat8233 * (float) i_306_
                                + f_321_
                                + aFloat8231 * (float) i_307_);
                        f_310_ = aFloat8218 + (aFloat8233 * (float) i_306_
                                + f_321_
                                + aFloat8231 * (float) i_308_);
                        f_311_ = aFloat8218 + (aFloat8233 * (float) i_305_
                                + f_321_
                                + aFloat8231 * (float) i_308_);
                    }
                    float f_322_ = aFloat8216 * (float) i_320_;
                    float f_323_ = aFloat8221 * (float) i_320_;
                    if (anInt8228 == -1) {
                        float f_324_ = (aFloat8213
                                + (aFloat8212 * (float) i_305_ + f_322_
                                + aFloat8224 * (float) i_307_));
                        i_312_ = (class109.anInt1665
                                + (int) (f_324_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f));
                        float f_325_ = (aFloat8226
                                + (aFloat8214 * (float) i_305_ + f_323_
                                + aFloat8229 * (float) i_307_));
                        i_313_ = (class109.anInt1668
                                + (int) (f_325_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f));
                        float f_326_ = (aFloat8213
                                + (aFloat8212 * (float) i_306_ + f_322_
                                + aFloat8224 * (float) i_307_));
                        i_314_ = (class109.anInt1665
                                + (int) (f_326_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_309_));
                        float f_327_ = (aFloat8226
                                + (aFloat8214 * (float) i_306_ + f_323_
                                + aFloat8229 * (float) i_307_));
                        i_315_ = (class109.anInt1668
                                + (int) (f_327_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_309_));
                        float f_328_ = (aFloat8213
                                + (aFloat8212 * (float) i_306_ + f_322_
                                + aFloat8224 * (float) i_308_));
                        i_316_ = (class109.anInt1665
                                + (int) (f_328_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_310_));
                        float f_329_ = (aFloat8226
                                + (aFloat8214 * (float) i_306_ + f_323_
                                + aFloat8229 * (float) i_308_));
                        i_317_ = (class109.anInt1668
                                + (int) (f_329_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_310_));
                        float f_330_ = (aFloat8213
                                + (aFloat8212 * (float) i_305_ + f_322_
                                + aFloat8224 * (float) i_308_));
                        i_318_ = (class109.anInt1665
                                + (int) (f_330_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f_311_));
                        float f_331_ = (aFloat8226
                                + (aFloat8214 * (float) i_305_ + f_323_
                                + aFloat8229 * (float) i_308_));
                        i_319_ = (class109.anInt1668
                                + (int) (f_331_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f_311_));
                    } else {
                        float f_332_ = (aFloat8213
                                + (aFloat8212 * (float) i_305_ + f_322_
                                + aFloat8224 * (float) i_307_));
                        i_312_ = (class109.anInt1665
                                + (int) (f_332_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_333_ = (aFloat8226
                                + (aFloat8214 * (float) i_305_ + f_323_
                                + aFloat8229 * (float) i_307_));
                        i_313_ = (class109.anInt1668
                                + (int) (f_333_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_334_ = (aFloat8213
                                + (aFloat8212 * (float) i_306_ + f_322_
                                + aFloat8224 * (float) i_307_));
                        i_314_ = (class109.anInt1665
                                + (int) (f_334_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_335_ = (aFloat8226
                                + (aFloat8214 * (float) i_306_ + f_323_
                                + aFloat8229 * (float) i_307_));
                        i_315_ = (class109.anInt1668
                                + (int) (f_335_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_336_ = (aFloat8213
                                + (aFloat8212 * (float) i_306_ + f_322_
                                + aFloat8224 * (float) i_308_));
                        i_316_ = (class109.anInt1665
                                + (int) (f_336_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_337_ = (aFloat8226
                                + (aFloat8214 * (float) i_306_ + f_323_
                                + aFloat8229 * (float) i_308_));
                        i_317_ = (class109.anInt1668
                                + (int) (f_337_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        float f_338_ = (aFloat8213
                                + (aFloat8212 * (float) i_305_ + f_322_
                                + aFloat8224 * (float) i_308_));
                        i_318_ = (class109.anInt1665
                                + (int) (f_338_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        float f_339_ = (aFloat8226
                                + (aFloat8214 * (float) i_305_ + f_323_
                                + aFloat8229 * (float) i_308_));
                        i_319_ = (class109.anInt1668
                                + (int) (f_339_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                    }
                }
                if (anInt8228 == -1) {
                    if (((i_316_ - i_318_) * (i_315_ - i_319_)
                            - (i_317_ - i_319_) * (i_314_ - i_318_))
                            > 0) {
                        class109.aBoolean1671
                                = (i_316_ < 0 || i_318_ < 0 || i_314_ < 0
                                || i_316_ > class109.anInt1679
                                || i_318_ > class109.anInt1679
                                || i_314_ > class109.anInt1679);
                        if (class102.aShort1605 >= 0)
                            class109.method1024
                                    ((float) i_317_, (float) i_319_,
                                            (float) i_315_, (float) i_316_,
                                            (float) i_318_, (float) i_314_, f_310_,
                                            f_311_, f_309_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
                                            0.0F,
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1602
                                                    & 0xffff)]) & 0xffffff),
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1604
                                                    & 0xffff)]) & 0xffffff),
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1603
                                                    & 0xffff)]) & 0xffffff),
                                            0, 0, 0, 0, class102.aShort1605);
                        else
                            class109.method1022
                                    ((float) i_317_, (float) i_319_,
                                            (float) i_315_, (float) i_316_,
                                            (float) i_318_, (float) i_314_,
                                            (float) (int) f_310_, (float) (int) f_311_,
                                            (float) (int) f_309_,
                                            (float) (class102.aShort1602
                                                    & 0xffff),
                                            (float) (class102.aShort1604
                                                    & 0xffff),
                                            (float) (class102.aShort1603
                                                    & 0xffff));
                    }
                    if (((i_312_ - i_314_) * (i_319_ - i_315_)
                            - (i_313_ - i_315_) * (i_318_ - i_314_))
                            > 0) {
                        class109.aBoolean1671
                                = (i_312_ < 0 || i_314_ < 0 || i_318_ < 0
                                || i_312_ > class109.anInt1679
                                || i_314_ > class109.anInt1679
                                || i_318_ > class109.anInt1679);
                        if (class102.aShort1605 >= 0)
                            class109.method1024
                                    ((float) i_313_, (float) i_315_,
                                            (float) i_319_, (float) i_312_,
                                            (float) i_314_, (float) i_318_, f, f_309_,
                                            f_311_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1601
                                                    & 0xffff)]) & 0xffffff),
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1603
                                                    & 0xffff)]) & 0xffffff),
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1604
                                                    & 0xffff)]) & 0xffffff),
                                            0, 0, 0, 0, class102.aShort1605);
                        else
                            class109.method1022
                                    ((float) i_313_, (float) i_315_,
                                            (float) i_319_, (float) i_312_,
                                            (float) i_314_, (float) i_318_,
                                            (float) (int) f, (float) (int) f_309_,
                                            (float) (int) f_311_,
                                            (float) (class102.aShort1601
                                                    & 0xffff),
                                            (float) (class102.aShort1603
                                                    & 0xffff),
                                            (float) (class102.aShort1604
                                                    & 0xffff));
                    }
                } else {
                    if (((i_316_ - i_318_) * (i_315_ - i_319_)
                            - (i_317_ - i_319_) * (i_314_ - i_318_))
                            > 0) {
                        class109.aBoolean1671
                                = (i_316_ < 0 || i_318_ < 0 || i_314_ < 0
                                || i_316_ > class109.anInt1679
                                || i_318_ > class109.anInt1679
                                || i_314_ > class109.anInt1679);
                        if (class102.aShort1605 >= 0)
                            class109.method1024
                                    ((float) i_317_, (float) i_319_,
                                            (float) i_315_, (float) i_316_,
                                            (float) i_318_, (float) i_314_, f_310_,
                                            f_311_, f_309_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
                                            0.0F,
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1602
                                                    & 0xffff)]) & 0xffffff),
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1604
                                                    & 0xffff)]) & 0xffffff),
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1603
                                                    & 0xffff)]) & 0xffffff),
                                            0, 0, 0, 0, class102.aShort1605);
                        else
                            class109.method1022
                                    ((float) i_317_, (float) i_319_,
                                            (float) i_315_, (float) i_316_,
                                            (float) i_318_, (float) i_314_,
                                            (float) (int) f_310_, (float) (int) f_311_,
                                            (float) (int) f_309_,
                                            (float) (class102.aShort1602
                                                    & 0xffff),
                                            (float) (class102.aShort1604
                                                    & 0xffff),
                                            (float) (class102.aShort1603
                                                    & 0xffff));
                    }
                    if (((i_312_ - i_314_) * (i_319_ - i_315_)
                            - (i_313_ - i_315_) * (i_318_ - i_314_))
                            > 0) {
                        class109.aBoolean1671
                                = (i_312_ < 0 || i_314_ < 0 || i_318_ < 0
                                || i_312_ > class109.anInt1679
                                || i_314_ > class109.anInt1679
                                || i_318_ > class109.anInt1679);
                        if (class102.aShort1605 >= 0)
                            class109.method1024
                                    ((float) i_313_, (float) i_315_,
                                            (float) i_319_, (float) i_312_,
                                            (float) i_314_, (float) i_318_, f, f_309_,
                                            f_311_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1601
                                                    & 0xffff)]) & 0xffffff),
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1603
                                                    & 0xffff)]) & 0xffffff),
                                            (~0xffffff
                                                    | (Class126.anIntArray4983
                                                    [(class102.aShort1604
                                                    & 0xffff)]) & 0xffffff),
                                            0, 0, 0, 0, class102.aShort1605);
                        else
                            class109.method1022
                                    ((float) i_313_, (float) i_315_,
                                            (float) i_319_, (float) i_312_,
                                            (float) i_314_, (float) i_318_,
                                            (float) (int) f, (float) (int) f_309_,
                                            (float) (int) f_311_,
                                            (float) (class102.aShort1601
                                                    & 0xffff),
                                            (float) (class102.aShort1603
                                                    & 0xffff),
                                            (float) (class102.aShort1604
                                                    & 0xffff));
                    }
                }
            }
        }
    }

    final boolean method3989(r var_r, int i, int i_407_, int i_408_,
                             int i_409_, boolean bool) {
        return false;
    }

    final r fa(int i, int i_410_, r var_r) {
        return null;
    }

    final void method3987(int i, int i_411_, int i_412_, int i_413_,
                          int i_414_, int i_415_, int i_416_,
                          boolean[][] bools) {
        Class167 class167 = aHa_Sub1_8217.method3724(Thread.currentThread());
        Class109 class109 = class167.aClass109_2220;
        class109.anInt1674 = 0;
        class109.aBoolean1671 = true;
        aHa_Sub1_8217.ya();
        if (aClass266ArrayArray8230 != null || aClass198ArrayArray8219 != null)
            method3993(i, i_411_, i_412_, i_413_, i_414_, i_415_, i_416_,
                    bools, class167, class109,
                    class167.anIntArray2212,
                    class167.anIntArray2228);
        else if (aClass102ArrayArray8215 != null)
            method3996(i, i_411_, i_412_, i_413_, i_414_, i_415_, i_416_,
                    bools, class167, class109,
                    class167.anIntArray2212,
                    class167.anIntArray2228);
    }

    private final void method3995
            (int i, int i_417_, boolean bool, Class167 class167, Class109 class109,
             int[] is, int[] is_418_, int[] is_419_, int[] is_420_, int i_421_) {
        Class198 class198 = aClass198ArrayArray8219[i][i_417_];
        if (i_421_ == 0 || (i_421_ & 0x2) == 0) {
            if (class198 != null) {
                if (anInt8228 == -1) {
                    for (int i_422_ = 0;
                         i_422_ < class198.aShort2620; i_422_++) {
                        int i_423_
                                = (class198.aShortArray2622[i_422_]
                                + (i << this.anInt4588));
                        int i_424_
                                = class198.aShortArray2618[i_422_];
                        int i_425_
                                = (class198.aShortArray2613[i_422_]
                                + (i_417_ << this.anInt4588));
                        float f = aFloat8218 + (aFloat8233 * (float) i_423_
                                + aFloat8227 * (float) i_424_
                                + aFloat8231 * (float) i_425_);
                        if (f <= (float) aHa_Sub1_8217.anInt7482)
                            return;
                        is_420_[i_422_] = 0;
                        if (bool) {
                            int i_426_
                                    = (int) (f - (float) (class167
                                    .anInt2210));
                            if (i_426_ > 255)
                                i_426_ = 255;
                            if (i_426_ > 0) {
                                is_420_[i_422_] = i_426_;
                                int i_427_ = ((class198
                                        .aShortArray2621[i_422_])
                                        * i_426_ / 255);
                                if (i_427_ > 0)
                                    i_424_ -= i_427_;
                            }
                        } else if (class167.aBoolean2201) {
                            int i_428_
                                    = (int) (f - (float) (class167
                                    .anInt2210));
                            if (i_428_ > 0) {
                                is_420_[i_422_] = i_428_;
                                if (is_420_[i_422_] > 255)
                                    is_420_[i_422_] = 255;
                            }
                        }
                        float f_429_
                                = aFloat8213 + (aFloat8212 * (float) i_423_
                                + aFloat8216 * (float) i_424_
                                + aFloat8224 * (float) i_425_);
                        float f_430_
                                = aFloat8226 + (aFloat8214 * (float) i_423_
                                + aFloat8221 * (float) i_424_
                                + aFloat8229 * (float) i_425_);
                        is[i_422_]
                                = (class109.anInt1665
                                + (int) (f_429_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / f));
                        is_418_[i_422_]
                                = (class109.anInt1668
                                + (int) (f_430_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / f));
                        is_419_[i_422_] = (int) f;
                    }
                } else {
                    for (int i_431_ = 0;
                         i_431_ < class198.aShort2620; i_431_++) {
                        int i_432_
                                = (class198.aShortArray2622[i_431_]
                                + (i << this.anInt4588));
                        int i_433_
                                = class198.aShortArray2618[i_431_];
                        int i_434_
                                = (class198.aShortArray2613[i_431_]
                                + (i_417_ << this.anInt4588));
                        float f = aFloat8218 + (aFloat8233 * (float) i_432_
                                + aFloat8227 * (float) i_433_
                                + aFloat8231 * (float) i_434_);
                        is_420_[i_431_] = 0;
                        if (bool) {
                            int i_435_
                                    = anInt8228 - class167.anInt2210;
                            if (i_435_ > 255)
                                i_435_ = 255;
                            if (i_435_ > 0) {
                                is_420_[i_431_] = i_435_;
                                int i_436_ = ((class198
                                        .aShortArray2621[i_431_])
                                        * i_435_ / 255);
                                if (i_436_ > 0)
                                    i_433_ -= i_436_;
                            }
                        } else if (class167.aBoolean2201) {
                            int i_437_
                                    = anInt8228 - class167.anInt2210;
                            if (i_437_ > 0) {
                                is_420_[i_431_] = i_437_;
                                if (is_420_[i_431_] > 255)
                                    is_420_[i_431_] = 255;
                            }
                        }
                        float f_438_
                                = aFloat8213 + (aFloat8212 * (float) i_432_
                                + aFloat8216 * (float) i_433_
                                + aFloat8224 * (float) i_434_);
                        float f_439_
                                = aFloat8226 + (aFloat8214 * (float) i_432_
                                + aFloat8221 * (float) i_433_
                                + aFloat8229 * (float) i_434_);
                        is[i_431_]
                                = (class109.anInt1665
                                + (int) (f_438_
                                * (float) (aHa_Sub1_8217
                                .anInt7491)
                                / (float) anInt8228));
                        is_418_[i_431_]
                                = (class109.anInt1668
                                + (int) (f_439_
                                * (float) (aHa_Sub1_8217
                                .anInt7497)
                                / (float) anInt8228));
                        is_419_[i_431_] = (int) f;
                    }
                }
                float f = (float) this.anInt4592;
                for (int i_440_ = 0; i_440_ < class198.aShort2619;
                     i_440_++) {
                    int i_441_ = i_440_ * 3;
                    int i_442_ = i_441_ + 1;
                    int i_443_ = i_442_ + 1;
                    int i_444_ = is[i_441_];
                    int i_445_ = is[i_442_];
                    int i_446_ = is[i_443_];
                    int i_447_ = is_418_[i_441_];
                    int i_448_ = is_418_[i_442_];
                    int i_449_ = is_418_[i_443_];
                    if (((i_444_ - i_445_) * (i_449_ - i_448_)
                            - (i_447_ - i_448_) * (i_446_ - i_445_))
                            > 0) {
                        class109.aBoolean1671
                                = (i_444_ < 0 || i_445_ < 0 || i_446_ < 0
                                || i_444_ > class109.anInt1679
                                || i_445_ > class109.anInt1679
                                || i_446_ > class109.anInt1679);
                        if (is_420_[i_441_] + is_420_[i_442_] + is_420_[i_443_]
                                < 765) {
                            int i_450_ = i << this.anInt4588;
                            int i_451_ = i_417_ << this.anInt4588;
                            if ((class198.anIntArray2623[i_441_]
                                    & 0xffffff)
                                    != 0) {
                                if (((class198.aShortArray2616
                                        [i_441_])
                                        == (class198.aShortArray2616
                                        [i_442_]))
                                        && ((class198.aShortArray2616
                                        [i_441_])
                                        == (class198
                                        .aShortArray2616[i_443_]))
                                        && ((class198.aShortArray2614
                                        [i_441_])
                                        == (class198
                                        .aShortArray2614[i_442_]))
                                        && ((class198.aShortArray2614
                                        [i_441_])
                                        == (class198
                                        .aShortArray2614[i_443_])))
                                    class109.method1024
                                            ((float) i_447_, (float) i_448_,
                                                    (float) i_449_, (float) i_444_,
                                                    (float) i_445_, (float) i_446_,
                                                    (float) is_419_[i_441_],
                                                    (float) is_419_[i_442_],
                                                    (float) is_419_[i_443_],
                                                    ((float) (i_450_
                                                            + (class198
                                                            .aShortArray2622
                                                            [i_441_]))
                                                            / (float) (class198
                                                            .aShortArray2614
                                                            [i_441_])),
                                                    ((float) (i_450_
                                                            + (class198
                                                            .aShortArray2622
                                                            [i_442_]))
                                                            / (float) (class198
                                                            .aShortArray2614
                                                            [i_442_])),
                                                    ((float) (i_450_
                                                            + (class198
                                                            .aShortArray2622
                                                            [i_443_]))
                                                            / (float) (class198
                                                            .aShortArray2614
                                                            [i_443_])),
                                                    ((float) (i_451_
                                                            + (class198
                                                            .aShortArray2613
                                                            [i_441_]))
                                                            / (float) (class198
                                                            .aShortArray2614
                                                            [i_441_])),
                                                    ((float) (i_451_
                                                            + (class198
                                                            .aShortArray2613
                                                            [i_442_]))
                                                            / (float) (class198
                                                            .aShortArray2614
                                                            [i_442_])),
                                                    ((float) (i_451_
                                                            + (class198
                                                            .aShortArray2613
                                                            [i_443_]))
                                                            / (float) (class198
                                                            .aShortArray2614
                                                            [i_443_])),
                                                    (class198.anIntArray2623
                                                            [i_441_]),
                                                    (class198.anIntArray2623
                                                            [i_442_]),
                                                    (class198.anIntArray2623
                                                            [i_443_]),
                                                    class167.anInt2192,
                                                    is_420_[i_441_], is_420_[i_442_],
                                                    is_420_[i_443_],
                                                    (class198.aShortArray2616
                                                            [i_441_]));
                                else
                                    class109.method1020
                                            ((float) i_447_, (float) i_448_,
                                                    (float) i_449_, (float) i_444_,
                                                    (float) i_445_, (float) i_446_,
                                                    (float) is_419_[i_441_],
                                                    (float) is_419_[i_442_],
                                                    (float) is_419_[i_443_],
                                                    (float) (i_450_
                                                            + (class198
                                                            .aShortArray2622
                                                            [i_441_])) / f,
                                                    (float) (i_450_
                                                            + (class198
                                                            .aShortArray2622
                                                            [i_442_])) / f,
                                                    (float) (i_450_
                                                            + (class198
                                                            .aShortArray2622
                                                            [i_443_])) / f,
                                                    (float) (i_451_
                                                            + (class198
                                                            .aShortArray2613
                                                            [i_441_])) / f,
                                                    (float) (i_451_
                                                            + (class198
                                                            .aShortArray2613
                                                            [i_442_])) / f,
                                                    (float) (i_451_
                                                            + (class198
                                                            .aShortArray2613
                                                            [i_443_])) / f,
                                                    (class198.anIntArray2623
                                                            [i_441_]),
                                                    (class198.anIntArray2623
                                                            [i_442_]),
                                                    (class198.anIntArray2623
                                                            [i_443_]),
                                                    class167.anInt2192,
                                                    is_420_[i_441_], is_420_[i_442_],
                                                    is_420_[i_443_],
                                                    (class198.aShortArray2616
                                                            [i_441_]),
                                                    f / (float) (class198
                                                            .aShortArray2614
                                                            [i_441_]),
                                                    (class198.aShortArray2616
                                                            [i_442_]),
                                                    f / (float) (class198
                                                            .aShortArray2614
                                                            [i_442_]),
                                                    (class198.aShortArray2616
                                                            [i_443_]),
                                                    f / (float) (class198
                                                            .aShortArray2614
                                                            [i_443_]));
                            }
                        } else
                            class109.method1018((float) i_447_, (float) i_448_,
                                    (float) i_449_, (float) i_444_,
                                    (float) i_445_, (float) i_446_,
                                    (float) is_419_[i_441_],
                                    (float) is_419_[i_442_],
                                    (float) is_419_[i_443_],
                                    (class167
                                            .anInt2192));
                    }
                }
            }
        }
    }

    final void method3979(int i, int i_452_) {
        method3992(i, i_452_, 0);
    }

    private final void method3996(int i, int i_453_, int i_454_, int i_455_,
                                  int i_456_, int i_457_, int i_458_,
                                  boolean[][] bools, Class167 class167,
                                  Class109 class109, int[] is, int[] is_459_) {
        int i_460_ = (i_458_ - i_456_) * i_454_ / 256;
        int i_461_ = i_454_ >> 8;
        boolean bool = class167.aBoolean2202;
        aHa_Sub1_8217.C(false);
        class109.aBoolean1669 = false;
        class109.aBoolean1667 = false;
        int i_462_ = i;
        int i_463_ = i_453_ + i_460_;
        for (int i_464_ = i_455_; i_464_ < i_457_; i_464_++) {
            for (int i_465_ = i_456_; i_465_ < i_458_; i_465_++) {
                if (bools[i_464_ - i_455_][i_465_ - i_456_]) {
                    if (aClass102ArrayArray8215[i_464_][i_465_] != null) {
                        Class102 class102
                                = aClass102ArrayArray8215[i_464_][i_465_];
                        if (class102.aShort1605 != -1
                                && (class102.aByte1606 & 0x2) == 0
                                && class102.anInt1600 == -1) {
                            int i_466_ = aHa_Sub1_8217.method3722(class102
                                    .aShort1605);
                            class109.method1022
                                    ((float) (i_463_ - i_461_),
                                            (float) (i_463_ - i_461_), (float) i_463_,
                                            (float) (i_462_ + i_461_), (float) i_462_,
                                            (float) (i_462_ + i_461_), 100.0F, 100.0F,
                                            100.0F,
                                            (float) Class291.method2198(0,
                                                    ((class102
                                                            .aShort1602)
                                                            & 0xffff),
                                                    i_466_),
                                            (float) Class291.method2198(0,
                                                    ((class102
                                                            .aShort1604)
                                                            & 0xffff),
                                                    i_466_),
                                            (float) Class291.method2198(0,
                                                    ((class102
                                                            .aShort1603)
                                                            & 0xffff),
                                                    i_466_));
                            class109.method1022
                                    ((float) i_463_, (float) i_463_,
                                            (float) (i_463_ - i_461_), (float) i_462_,
                                            (float) (i_462_ + i_461_), (float) i_462_,
                                            100.0F, 100.0F, 100.0F,
                                            (float) Class291.method2198(0,
                                                    ((class102
                                                            .aShort1601)
                                                            & 0xffff),
                                                    i_466_),
                                            (float) Class291.method2198(0,
                                                    ((class102
                                                            .aShort1603)
                                                            & 0xffff),
                                                    i_466_),
                                            (float) Class291.method2198(0,
                                                    ((class102
                                                            .aShort1604)
                                                            & 0xffff),
                                                    i_466_));
                        } else if (class102.anInt1600 == -1) {
                            class109.method1022
                                    ((float) (i_463_ - i_461_),
                                            (float) (i_463_ - i_461_), (float) i_463_,
                                            (float) (i_462_ + i_461_), (float) i_462_,
                                            (float) (i_462_ + i_461_), 100.0F, 100.0F,
                                            100.0F,
                                            (float) (class102.aShort1602
                                                    & 0xffff),
                                            (float) (class102.aShort1604
                                                    & 0xffff),
                                            (float) (class102.aShort1603
                                                    & 0xffff));
                            class109.method1022
                                    ((float) i_463_, (float) i_463_,
                                            (float) (i_463_ - i_461_), (float) i_462_,
                                            (float) (i_462_ + i_461_), (float) i_462_,
                                            100.0F, 100.0F, 100.0F,
                                            (float) (class102.aShort1601
                                                    & 0xffff),
                                            (float) (class102.aShort1603
                                                    & 0xffff),
                                            (float) (class102.aShort1604
                                                    & 0xffff));
                        } else {
                            int i_467_ = class102.anInt1600;
                            class109.method1022((float) (i_463_ - i_461_),
                                    (float) (i_463_ - i_461_),
                                    (float) i_463_,
                                    (float) (i_462_ + i_461_),
                                    (float) i_462_,
                                    (float) (i_462_ + i_461_),
                                    100.0F, 100.0F, 100.0F,
                                    (float) i_467_, (float) i_467_,
                                    (float) i_467_);
                            class109.method1022((float) i_463_, (float) i_463_,
                                    (float) (i_463_ - i_461_),
                                    (float) i_462_,
                                    (float) (i_462_ + i_461_),
                                    (float) i_462_, 100.0F, 100.0F,
                                    100.0F, (float) i_467_,
                                    (float) i_467_,
                                    (float) i_467_);
                        }
                    } else if (aClass236ArrayArray8222[i_464_][i_465_]
                            != null) {
                        Class236 class236
                                = aClass236ArrayArray8222[i_464_][i_465_];
                        for (int i_468_ = 0;
                             i_468_ < class236.aShort3089;
                             i_468_++) {
                            is[i_468_]
                                    = i_462_ + ((class236
                                    .aShortArray3096[i_468_])
                                    * i_461_ / this.anInt4592);
                            is_459_[i_468_]
                                    = i_463_ - ((class236
                                    .aShortArray3094[i_468_])
                                    * i_461_ / this.anInt4592);
                        }
                        for (int i_469_ = 0;
                             i_469_ < class236.aShort3099;
                             i_469_++) {
                            short i_470_ = (class236
                                    .aShortArray3091[i_469_]);
                            short i_471_ = (class236
                                    .aShortArray3090[i_469_]);
                            short i_472_ = (class236
                                    .aShortArray3101[i_469_]);
                            int i_473_ = is[i_470_];
                            int i_474_ = is[i_471_];
                            int i_475_ = is[i_472_];
                            int i_476_ = is_459_[i_470_];
                            int i_477_ = is_459_[i_471_];
                            int i_478_ = is_459_[i_472_];
                            if (class236.anIntArray3092 != null
                                    && (class236.anIntArray3092
                                    [i_469_]) != -1) {
                                int i_479_ = (class236
                                        .anIntArray3092[i_469_]);
                                class109.method1022
                                        ((float) i_476_, (float) i_477_,
                                                (float) i_478_, (float) i_473_,
                                                (float) i_474_, (float) i_475_, 100.0F,
                                                100.0F, 100.0F,
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_470_]),
                                                                i_479_)),
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_471_]),
                                                                i_479_)),
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_472_]),
                                                                i_479_)));
                            } else if ((class236.aShortArray3095
                                    != null)
                                    && (class236
                                    .aShortArray3095[i_469_]) != -1) {
                                int i_480_
                                        = aHa_Sub1_8217.method3722(class236
                                        .aShortArray3095
                                        [i_469_]);
                                class109.method1022
                                        ((float) i_476_, (float) i_477_,
                                                (float) i_478_, (float) i_473_,
                                                (float) i_474_, (float) i_475_, 100.0F,
                                                100.0F, 100.0F,
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_470_]),
                                                                i_480_)),
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_471_]),
                                                                i_480_)),
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_472_]),
                                                                i_480_)));
                            } else {
                                int i_481_ = (class236
                                        .anIntArray3093[i_469_]);
                                class109.method1022
                                        ((float) i_476_, (float) i_477_,
                                                (float) i_478_, (float) i_473_,
                                                (float) i_474_, (float) i_475_, 100.0F,
                                                100.0F, 100.0F,
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_470_]),
                                                                i_481_)),
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_471_]),
                                                                i_481_)),
                                                (float) (Class291.method2198
                                                        (0,
                                                                (class236
                                                                        .aShortArray3088[i_472_]),
                                                                i_481_)));
                            }
                        }
                    }
                }
                i_463_ -= i_461_;
            }
            i_463_ = i_453_ + i_460_;
            i_462_ += i_461_;
        }
        class109.aBoolean1669 = true;
        aHa_Sub1_8217.C(bool);
    }

    final void YA() {
        aByteArrayArray8220 = null;
        aByteArrayArray8232 = null;
    }

    final void CA(r var_r, int i, int i_482_, int i_483_, int i_484_,
                  boolean bool) {
        /* empty */
    }

    private final boolean method3997(int i) {
        if ((anInt8223 & 0x8) == 0)
            return false;
        if (i == 4)
            return true;
        if (i == 8)
            return true;
        return i == 9;
    }

    s_Sub1(ha_Sub1 var_ha_Sub1, int i, int i_485_, int i_486_, int i_487_,
           int[][] is, int[][] is_488_, int i_489_) {
        super(i_486_, i_487_, i_489_, is);
        aHa_Sub1_8217 = var_ha_Sub1;
        anInt8223 = i_485_;
        aByteArrayArray8220 = new byte[i_486_ + 1][i_487_ + 1];
        int i_490_ = aHa_Sub1_8217.anInt7500 >> 9;
        for (int i_491_ = 1; i_491_ < i_487_; i_491_++) {
            for (int i_492_ = 1; i_492_ < i_486_; i_492_++) {
                int i_493_ = i_490_;
                int i_494_ = (is_488_[i_492_ + 1][i_491_]
                        - is_488_[i_492_ - 1][i_491_]);
                int i_495_ = (is_488_[i_492_][i_491_ + 1]
                        - is_488_[i_492_][i_491_ - 1]);
                int i_496_
                        = (int) Math.sqrt(i_494_ * i_494_ + 512 * i_489_
                        + i_495_ * i_495_);
                int i_497_ = (i_494_ << 8) / i_496_;
                int i_498_ = -512 * i_489_ / i_496_;
                int i_499_ = (i_495_ << 8) / i_496_;
                i_493_
                        += (aHa_Sub1_8217.anInt7484 * i_497_
                        + aHa_Sub1_8217.anInt7473 * i_498_
                        + aHa_Sub1_8217.anInt7479 * i_499_) >> 17;
                i_493_ >>= 1;
                if (i_493_ < 2)
                    i_493_ = 2;
                else if (i_493_ > 126)
                    i_493_ = 126;
                aByteArrayArray8220[i_492_][i_491_] = (byte) i_493_;
            }
        }
        aByteArrayArray8232 = new byte[i_486_ + 1][i_487_ + 1];
    }
}
