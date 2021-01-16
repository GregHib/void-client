/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class206 implements Interface11 {
    static int anInt4864;
    static int anInt4865;
    static int anInt4866;
    static int anInt4867;
    static int anInt4868;
    static int anInt4869;
    static int anInt4870;
    static int anInt4871;
    private int anInt4872;
    private int anInt4873;
    static Class209 aClass209_4874;
    private final Interface9[] anInterface9Array4875 = new Interface9[9];
    static int anInt4876;
    static int anInt4877;
    static int anInt4878;
    static int anInt4879;
    static int anInt4880;
    static int anInt4881;
    private int anInt4882;
    private final ha_Sub2 aHa_Sub2_4883;
    private int anInt4884;
    static int anInt4885;
    private int anInt4886;
    static int anInt4887;
    static boolean aBoolean4888 = false;
    static int anInt4889;
    static int anInt4890;
    private int anInt4891;
    static int anInt4892;
    static int anInt4893;

    public final void method45(byte i) {
        anInt4865++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (i == -47) {
            anInt4872 &= ~0x1;
            anInt4873 = method1504(-114);
        }
    }

    final void method1498(int i, int i_0_, int i_1_,
                          Class258_Sub2 class258_sub2) {
        method1502(0, (byte) -38, class258_sub2, i, i_1_);
        if (i_0_ < -49)
            anInt4887++;
    }

    public final void method46(int i) {
        OpenGL.glBindFramebufferEXT(36160, anInt4891);
        anInt4867++;
        anInt4872 |= 0x4;
        if (i != -11762)
            anInt4889 = 110;
        anInt4873 = method1504(-115);
    }

    public static void method1499(int i) {
        if (i < -124)
            aClass209_4874 = null;
    }

    final void method1500(int i, int i_2_) {
        if (anInterface9Array4875[i_2_] != null)
            anInterface9Array4875[i_2_].method37(-3022);
        if (i != 2983)
            anInt4891 = -116;
        anInt4866++;
        anInt4884 &= 1 << i_2_ ^ 0xffffffff;
        anInterface9Array4875[i_2_] = null;
    }

    static final void method1501(int i) {
        int i_3_ = 56 / ((i - -56) / 42);
        for (int i_4_ = 0;
             i_4_ < Class147.anInt2021; i_4_++) {
            Class10 class10 = Class258_Sub2.aClass10Array8531[i_4_];
            boolean bool = false;
            if (class10.aClass348_Sub16_Sub5_176 != null) {
                if (!class10.aClass348_Sub16_Sub5_176
                        .method2712((byte) 4))
                    bool = true;
            } else {
                class10.anInt188--;
                if (class10.anInt188
                        >= (!class10.method220((byte) -66) ? -10 : -1500)) {
                    if (class10.aByte180 == 1
                            && class10.aClass317_183 == null) {
                        class10.aClass317_183
                                = Class317.method2372(Class129.aClass45_1878,
                                class10.anInt185,
                                0);
                        if (class10.aClass317_183 == null)
                            continue;
                        class10.anInt188
                                += class10.aClass317_183.method2370();
                    } else if (class10.method220((byte) -39)
                            && ((class10.aClass348_Sub10_192
                            == null)
                            || (class10
                            .aClass348_Sub19_Sub1_189) == null)) {
                        if (class10.aClass348_Sub10_192 == null)
                            class10.aClass348_Sub10_192
                                    = Class348_Sub10.method2793((Class239_Sub4
                                            .aClass45_5878),
                                    (class10
                                            .anInt185));
                        if (class10.aClass348_Sub10_192 == null)
                            continue;
                        if (class10.aClass348_Sub19_Sub1_189
                                == null) {
                            class10.aClass348_Sub19_Sub1_189
                                    = class10.aClass348_Sub10_192
                                    .method2791(new int[]{22050});
                            if (class10.aClass348_Sub19_Sub1_189
                                    == null)
                                continue;
                        }
                    }
                    if (class10.anInt188 < 0) {
                        int i_5_ = 8192;
                        int i_6_;
                        if (class10.anInt178 == 0)
                            i_6_ = ((class10.anInt184
                                    * (class10.aByte180 == 3
                                    ? Class316.aClass348_Sub51_3959
                                    .aClass239_Sub26_7215
                                    .method1838(-32350)
                                    : Class316.aClass348_Sub51_3959
                                    .aClass239_Sub26_7272
                                    .method1838(-32350)))
                                    >> -520945758);
                        else {
                            int i_7_ = 0x3 & (class10.anInt178
                                    >> 262440888);
                            if ((Class132
                                    .aClass318_Sub1_Sub3_Sub3_Sub2_1907
                                    .aByte6381) == i_7_) {
                                int i_8_
                                        = 0x1fe00 & (class10.anInt178
                                        << 1928411817);
                                int i_9_
                                        = (Class132
                                        .aClass318_Sub1_Sub3_Sub3_Sub2_1907
                                        .method2436((byte) 52)
                                        << 1410573576);
                                int i_10_ = ((class10.anInt178
                                        & 0xff7e29)
                                        >> -1370832976);
                                int i_11_
                                        = (-(Class132
                                                .aClass318_Sub1_Sub3_Sub3_Sub2_1907
                                        .anInt6377)
                                        + 256 + (i_10_ << 1971089481) + i_9_);
                                int i_12_
                                        = ((class10.anInt178 & 0xffc1)
                                        >> -1236313432);
                                int i_13_
                                        = (256 + (i_12_ << 351836265)
                                        - ((Class132
                                                .aClass318_Sub1_Sub3_Sub3_Sub2_1907
                                        .anInt6388)
                                        - i_9_));
                                int i_14_ = (Math.abs(i_11_)
                                        + (Math.abs(i_13_) + -512));
                                if (i_8_ < i_14_) {
                                    class10.anInt188 = -99999;
                                    continue;
                                }
                                if (i_14_ < 0)
                                    i_14_ = 0;
                                i_6_ = ((i_8_ + -i_14_)
                                        * (Class316.aClass348_Sub51_3959
                                        .aClass239_Sub26_7234
                                        .method1838(-32350)
                                        * class10.anInt184)
                                        / i_8_) >> -504009758;
                                if ((class10.aClass318_Sub1_172
                                        != null)
                                        && (class10.aClass318_Sub1_172
                                        instanceof Class318_Sub1_Sub3)) {
                                    Class318_Sub1_Sub3 class318_sub1_sub3
                                            = ((Class318_Sub1_Sub3)
                                            (class10
                                                    .aClass318_Sub1_172));
                                    short i_15_ = (class318_sub1_sub3
                                            .aShort8743);
                                    short i_16_ = (class318_sub1_sub3
                                            .aShort8750);
                                }
                                if (i_11_ != 0 || i_13_ != 0) {
                                    int i_17_
                                            = (0x3fff
                                            & (-4096 + -Class5.anInt4638
                                            + -(int) (2607.5945876176133
                                            * (Math.atan2
                                            (i_11_,
                                                    i_13_)))));
                                    if (i_17_ > 8192)
                                        i_17_ = 16384 + -i_17_;
                                    int i_18_;
                                    if (i_14_ <= 0)
                                        i_18_ = 8192;
                                    else if (i_14_ >= 4096)
                                        i_18_ = 16384;
                                    else
                                        i_18_ = 8192 + (-i_14_ + 8192) / 4096;
                                    i_5_ = ((-i_18_ + 16384 >> 1269717825)
                                            + i_18_ * i_17_ / 8192);
                                }
                            } else
                                i_6_ = 0;
                        }
                        if (i_6_ > 0) {
                            Class348_Sub19_Sub1 class348_sub19_sub1 = null;
                            if (class10.aByte180 != 1) {
                                if (class10.method220((byte) -112))
                                    class348_sub19_sub1
                                            = (class10
                                            .aClass348_Sub19_Sub1_189);
                            } else
                                class348_sub19_sub1
                                        = class10.aClass317_183
                                        .method2369
                                                ()
                                        .method2944(Class57.aClass163_1050);
                            Class348_Sub16_Sub5 class348_sub16_sub5
                                    = (class10.aClass348_Sub16_Sub5_176
                                    = (Class348_Sub16_Sub5.method2911
                                    (class348_sub19_sub1,
                                            class10.anInt173, i_6_,
                                            i_5_)));
                            class348_sub16_sub5
                                    .method2917(-1 + class10.anInt177);
                            Class348_Sub43.aClass348_Sub16_Sub4_7065
                                    .method2883(class348_sub16_sub5);
                        }
                    }
                } else
                    bool = true;
            }
            if (bool) {
                Class147.anInt2021--;
                for (int i_19_ = i_4_; Class147.anInt2021 > i_19_; i_19_++)
                    Class258_Sub2.aClass10Array8531[i_19_]
                            = Class258_Sub2.aClass10Array8531[i_19_ - -1];
                i_4_--;
            }
        }
        anInt4890++;
        if (Class74.aBoolean1236 && !Class167.method1296(true)) {
            if (Class316.aClass348_Sub51_3959
                    .aClass239_Sub26_7260.method1838(-32350) != 0
                    && Class267.anInt3428 != -1) {
                if (Class209.aClass348_Sub16_Sub3_2718 != null)
                    Class348_Sub40_Sub15.method3086
                            (2, Class209.aClass348_Sub16_Sub3_2718,
                                    Class316.aClass348_Sub51_3959
                                            .aClass239_Sub26_7260.method1838(-32350),
                                    Class59_Sub2_Sub1.aClass45_8667, false, 0,
                                    Class267.anInt3428);
                else
                    Class348_Sub1_Sub3.method2732
                            (0, Class267.anInt3428, false, 124,
                                    Class59_Sub2_Sub1.aClass45_8667,
                                    Class316.aClass348_Sub51_3959
                                            .aClass239_Sub26_7260.method1838(-32350));
            }
            Class74.aBoolean1236 = false;
            Class209.aClass348_Sub16_Sub3_2718 = null;
        } else if (Class316.aClass348_Sub51_3959
                .aClass239_Sub26_7260.method1838(-32350) != 0
                && Class267.anInt3428 != -1
                && !Class167.method1296(true)) {
            Class318.anInt3973++;
            Class348_Sub47 class348_sub47
                    = Class286_Sub3.method2148(ha_Sub2.aClass351_7554,
                    Class348_Sub23_Sub2.aClass77_9029,
                    -107);
            class348_sub47.aClass348_Sub49_Sub2_7116
                    .method3391((byte) 118, Class267.anInt3428);
            Class348_Sub42_Sub14.method3243(-54, class348_sub47);
            Class267.anInt3428 = -1;
        }
    }

    private final void method1502(int i, byte i_20_,
                                  Class258_Sub2 class258_sub2, int i_21_,
                                  int i_22_) {
        anInt4876++;
        if (anInt4873 == -1)
            throw new RuntimeException();
        int i_23_ = 1 << i_21_;
        if (i_20_ > -16)
            aBoolean4888 = false;
        if ((anInt4884 & (i_23_ ^ 0xffffffff)) != 0) {
            if (class258_sub2.anInt8538 != anInt4882
                    || anInt4886 != class258_sub2.anInt8538)
                throw new RuntimeException();
        } else {
            anInt4882 = class258_sub2.anInt8538;
            anInt4886 = class258_sub2.anInt8538;
        }
        class258_sub2.method1961(anInt4873, i_22_,
                Class59_Sub2.anIntArray5306[i_21_], i, -1);
        anInterface9Array4875[i_21_] = class258_sub2;
        anInt4884 |= i_23_;
    }

    final void method1503(int i, byte i_24_) {
        anInt4885++;
        if (i_24_ != 3)
            aClass209_4874 = null;
        if (anInt4873 == -1)
            throw new RuntimeException();
        OpenGL.glDrawBuffer(Class59_Sub2.anIntArray5306[i]);
    }

    public final void method48(int i) {
        anInt4871++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        int i_25_ = 46 % ((84 - i) / 32);
        anInt4872 &= ~0x4;
        anInt4873 = method1504(-124);
    }

    private final int method1504(int i) {
        anInt4869++;
        if ((0x4 & anInt4872) != 0)
            return 36160;
        if (i >= -112)
            method1502(84, (byte) -103, null, 17, 11);
        if ((0x2 & anInt4872) != 0)
            return 36009;
        if ((0x1 & anInt4872) != 0)
            return 36008;
        return -1;
    }

    public final void method50(int i) {
        if (i != -32502)
            method1498(-50, 9, 123, null);
        OpenGL.glBindFramebufferEXT(36009, 0);
        anInt4878++;
        anInt4872 &= ~0x2;
        anInt4873 = method1504(i + 32374);
    }

    final void method1505(int i, int i_26_) {
        anInt4880++;
        if ((anInt4873 ^ 0xffffffff) == i)
            throw new RuntimeException();
        OpenGL.glReadBuffer(Class59_Sub2.anIntArray5306[i_26_]);
    }

    private final void method1506(int i, Class258_Sub3 class258_sub3,
                                  int i_27_, int i_28_) {
        anInt4892++;
        if (anInt4873 == -1)
            throw new RuntimeException();
        int i_29_ = 1 << i_27_;
        if (i_28_ == ((i_29_ ^ 0xffffffff) & anInt4884 ^ 0xffffffff)) {
            anInt4882 = class258_sub3.anInt8547;
            anInt4886 = class258_sub3.anInt8551;
        } else if ((anInt4882 != class258_sub3.anInt8547)
                || class258_sub3.anInt8551 != anInt4886)
            throw new RuntimeException();
        class258_sub3.method1963(anInt4873, i, 0,
                Class59_Sub2.anIntArray5306[i_27_]);
        anInterface9Array4875[i_27_] = class258_sub3;
        anInt4884 |= i_29_;
    }

    public final void method47(int i) {
        OpenGL.glBindFramebufferEXT(36009, anInt4891);
        if (i != -11421)
            method1508(119, null, 117);
        anInt4877++;
        anInt4872 |= 0x2;
        anInt4873 = method1504(i ^ 0x2cec);
    }

    final boolean method1507(int i) {
        anInt4868++;
        int i_30_ = OpenGL.glCheckFramebufferStatusEXT(anInt4873);
        int i_31_ = -56 / ((71 - i) / 45);
        return i_30_ == 36053;
    }

    final void method1508(int i, Class348_Sub42_Sub2 class348_sub42_sub2,
                          int i_32_) {
        anInt4881++;
        if (anInt4873 == -1)
            throw new RuntimeException();
        int i_33_ = 1 << i;
        if ((anInt4884 & (i_33_ ^ 0xffffffff)) != 0) {
            if ((class348_sub42_sub2.anInt8572 != anInt4882)
                    || (anInt4886
                    != class348_sub42_sub2.anInt8565))
                throw new RuntimeException();
        } else {
            anInt4886 = class348_sub42_sub2.anInt8565;
            anInt4882 = class348_sub42_sub2.anInt8572;
        }
        int i_34_ = -68 / ((i_32_ - 64) / 49);
        class348_sub42_sub2.method3173(36161, Class59_Sub2.anIntArray5306[i],
                anInt4873);
        anInterface9Array4875[i] = class348_sub42_sub2;
        anInt4884 |= i_33_;
    }

    final void method1509(Class258_Sub3 class258_sub3, int i, int i_35_) {
        method1506(i, class258_sub3, i_35_, -1);
        anInt4879++;
    }

    public final void method49(int i) {
        anInt4893++;
        OpenGL.glBindFramebufferEXT(36008, anInt4891);
        anInt4872 |= 0x1;
        anInt4873 = method1504(i ^ 0x6a7c);
        if (i != -27141)
            aBoolean4888 = false;
    }

    protected final void finalize() throws Throwable {
        anInt4864++;
        aHa_Sub2_4883.method3800(96, anInt4891);
        super.finalize();
    }

    Class206(ha_Sub2 var_ha_Sub2) {
        anInt4872 = 0;
        anInt4873 = -1;
        if (!var_ha_Sub2.aBoolean7820)
            throw new IllegalStateException("");
        aHa_Sub2_4883 = var_ha_Sub2;
        OpenGL.glGenFramebuffersEXT(1, Class106.anIntArray1635, 0);
        anInt4891 = Class106.anIntArray1635[0];
    }

    static {
        aClass209_4874 = new Class209();
        anInt4889 = 0;
    }
}
