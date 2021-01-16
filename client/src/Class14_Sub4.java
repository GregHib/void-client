/* Class14_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class14_Sub4 extends Class14 implements Interface18_Impl3 {
    static int anInt8633;
    private int anInt8634;
    static int anInt8635;
    static int anInt8636;
    static int anInt8637;
    static Class230 aClass230_8638 = new Class230("stellardawn", 1);
    static int anInt8639;
    private int anInt8640;
    static int anInt8641;
    static byte[][] aByteArrayArray8642;
    static int anInt8643;
    static Class323 aClass323_8644;
    static int anInt8645;
    static int anInt8646;
    static int anInt8647;
    static int anInt8648;
    static int anInt8649;
    static int anInt8650;
    static int anInt8651;

    static final String method250(int i, boolean bool, int i_0_) {
        if (bool != true)
            method251((byte) 96);
        anInt8641++;
        int i_1_ = -i_0_ + i;
        if ((i_1_ ^ 0xffffffff) > 8)
            return "<col=ff0000>";
        if (i_1_ < -6)
            return "<col=ff3000>";
        if ((i_1_ ^ 0xffffffff) > 2)
            return "<col=ff7000>";
        if ((i_1_ ^ 0xffffffff) > -1)
            return "<col=ffb000>";
        if ((i_1_ ^ 0xffffffff) < -10)
            return "<col=00ff00>";
        if ((i_1_ ^ 0xffffffff) < -7)
            return "<col=40ff00>";
        if ((i_1_ ^ 0xffffffff) < -4)
            return "<col=80ff00>";
        if (i_1_ > 0)
            return "<col=c0ff00>";
        return "<col=ffff00>";
    }

    public final int method72(int i) {
        anInt8649++;
        int i_2_ = 96 % ((i - 55) / 63);
        return anInt8634;
    }

    public static void method251(byte i) {
        if (i != 2)
            method250(-45, false, -102);
        aClass323_8644 = null;
        aClass230_8638 = null;
        aByteArrayArray8642 = null;
    }

    Class14_Sub4(Class377 class377, int i, int i_3_, int[] is, int i_4_,
                 int i_5_) {
        super(class377, 34037, Class108.aClass304_1662, Class68.aClass68_1183,
                i * i_3_, false);
        try {
            anInt8640 = i;
            anInt8634 = i_3_;
            ((Class14) this).aClass377_5082.method3850((byte) 76, this);
            OpenGL.glPixelStorei(3314, i_5_);
            OpenGL.glTexImage2Di(((Class14) this).anInt5093, 0, 6408,
                    anInt8640, anInt8634, 0, 32993,
                    (((Class377) ((Class14) this).aClass377_5082)
                            .anInt9918),
                    is, i_4_ * 4);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("tw.<init>("
                            + (class377 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_3_ + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_4_ + ',' + i_5_ + ')'));
        }
    }

    Class14_Sub4(Class377 class377, Class304 class304, int i, int i_6_,
                 byte[] is, int i_7_, int i_8_) {
        super(class377, 34037, class304, Class68.aClass68_1183, i * i_6_,
                false);
        try {
            anInt8634 = i_6_;
            anInt8640 = i;
            ((Class14) this).aClass377_5082.method3850((byte) -127, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, i_8_);
            OpenGL.glTexImage2Dub(((Class14) this).anInt5093, 0,
                    this.method228(126), i, i_6_, 0,
                    (Class348_Sub40_Sub3.method3055
                            (111, ((Class14) this).aClass304_5084)),
                    5121, is, i_7_);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("tw.<init>("
                            + (class377 != null ? "{...}"
                            : "null")
                            + ','
                            + (class304 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_6_ + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_7_ + ',' + i_8_ + ')'));
        }
    }

    public final void method66(boolean bool, boolean bool_9_, int i) {
        if (i != 25688)
            method254(-82, (byte) -35);
        anInt8639++;
    }

    Class14_Sub4(Class377 class377, Class304 class304, Class68 class68, int i,
                 int i_10_) {
        super(class377, 34037, class304, class68, i_10_ * i, false);
        try {
            anInt8634 = i_10_;
            anInt8640 = i;
            ((Class14) this).aClass377_5082.method3850((byte) 115, this);
            OpenGL.glTexImage2Dub
                    (((Class14) this).anInt5093, 0, this.method228(109), i, i_10_,
                            0,
                            Class348_Sub40_Sub3
                                    .method3055(105, ((Class14) this).aClass304_5084),
                            Class130.method1128(-54, ((Class14) this).aClass68_5088),
                            null, 0);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("tw.<init>(" + (class377 != null ? "{...}" : "null")
                                    + ',' + (class304 != null ? "{...}" : "null") + ','
                                    + (class68 != null ? "{...}" : "null") + ',' + i + ','
                                    + i_10_ + ')'));
        }
    }

    static final boolean method252(int i, int i_11_) {
        anInt8636++;
        if (i_11_ != 5126)
            aByteArrayArray8642 = null;
        if (i != 0 && (i ^ 0xffffffff) != -3)
            return false;
        return true;
    }

    static final void method253(int i, int i_12_, int i_13_, int i_14_,
                                int i_15_) {
        anInt8648++;
        if (i_13_ != -648)
            aClass323_8644 = null;
        int i_16_ = 0;
        int i_17_ = i_15_;
        int i_18_ = -i_15_;
        int i_19_ = -1;
        Class135_Sub2.method1156(i_13_ + 621, i_12_ + i_15_,
                Class17.anIntArrayArray255[i], i_12_ + -i_15_,
                i_14_);
        while ((i_17_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) {
            i_19_ += 2;
            i_18_ += i_19_;
            i_16_++;
            if ((i_18_ ^ 0xffffffff) <= -1) {
                i_17_--;
                i_18_ -= i_17_ << -13726015;
                int[] is = Class17.anIntArrayArray255[i - -i_17_];
                int[] is_20_ = Class17.anIntArrayArray255[i + -i_17_];
                int i_21_ = i_16_ + i_12_;
                int i_22_ = i_12_ + -i_16_;
                Class135_Sub2.method1156(-27, i_21_, is, i_22_, i_14_);
                Class135_Sub2.method1156(-27, i_21_, is_20_, i_22_, i_14_);
            }
            int i_23_ = i_17_ + i_12_;
            int i_24_ = i_12_ - i_17_;
            int[] is = Class17.anIntArrayArray255[i_16_ + i];
            int[] is_25_ = Class17.anIntArrayArray255[-i_16_ + i];
            Class135_Sub2.method1156(i_13_ + 621, i_23_, is, i_24_, i_14_);
            Class135_Sub2.method1156(-27, i_23_, is_25_, i_24_, i_14_);
        }
    }

    public final void method65(int i, int[] is, int i_26_, int i_27_,
                               int i_28_, byte i_29_, int i_30_) {
        anInt8645++;
        if (i_29_ != 112)
            anInt8634 = 49;
        int[] is_31_ = new int[anInt8634 * anInt8640];
        ((Class14) this).aClass377_5082.method3850((byte) -34, this);
        OpenGL.glGetTexImagei(((Class14) this).anInt5093, 0, 32993, 5121,
                is_31_, 0);
        for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff);
             i_32_++)
            Class214.method1578(is_31_,
                    anInt8640 * (i_28_ + -1 + (i_27_ + -i_32_)),
                    is, i_32_ * i_26_ + i_30_, i_26_);
    }

    public final float method67(float f, int i) {
        if (i <= 69)
            aByteArrayArray8642 = null;
        anInt8646++;
        return f;
    }

    Class14_Sub4(Class377 class377, Class304 class304, int i, int i_33_,
                 float[] fs, int i_34_, int i_35_) {
        super(class377, 34037, class304, Class68.aClass68_1187, i_33_ * i,
                false);
        try {
            anInt8640 = i;
            anInt8634 = i_33_;
            ((Class14) this).aClass377_5082.method3850((byte) -45, this);
            OpenGL.glPixelStorei(3314, i_35_);
            OpenGL.glTexImage2Df(((Class14) this).anInt5093, 0,
                    this.method228(107), i, i_33_, 0,
                    (Class348_Sub40_Sub3.method3055
                            (126, ((Class14) this).aClass304_5084)),
                    5126, fs, i_34_ * 4);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("tw.<init>(" + (class377 != null ? "{...}" : "null")
                                    + ',' + (class304 != null ? "{...}" : "null") + ',' + i
                                    + ',' + i_33_ + ',' + (fs != null ? "{...}" : "null")
                                    + ',' + i_34_ + ',' + i_35_ + ')'));
        }
    }

    public final float method71(byte i, float f) {
        if (i > -24)
            method67(-1.6376895F, -84);
        anInt8637++;
        return f;
    }

    public final boolean method73(int i) {
        if (i <= 84)
            method68(-26, 9, null, -21, 80, 34, 77, -73);
        anInt8635++;
        return false;
    }

    public final int method69(boolean bool) {
        anInt8651++;
        if (bool != false)
            anInt8640 = -103;
        return anInt8640;
    }

    public final void method68(int i, int i_36_, int[] is, int i_37_,
                               int i_38_, int i_39_, int i_40_, int i_41_) {
        ((Class14) this).aClass377_5082.method3850((byte) 118, this);
        anInt8650++;
        if ((i ^ 0xffffffff) == -1)
            i = i_39_;
        if (i_39_ != i)
            OpenGL.glPixelStorei(3314, i);
        OpenGL.glTexSubImage2Di(((Class14) this).anInt5093, 0, i_37_, i_40_,
                i_39_, i_41_, 32993,
                (((Class377) ((Class14) this).aClass377_5082)
                        .anInt9918),
                is, i_38_);
        if ((i_39_ ^ 0xffffffff) != (i ^ 0xffffffff))
            OpenGL.glPixelStorei(3314, 0);
        if (i_36_ != 22809)
            anInt8634 = 115;
    }

    public final void method70(int i, int i_42_, byte i_43_, int i_44_,
                               int i_45_, int i_46_, int i_47_, byte[] is,
                               Class304 class304) {
        try {
            ((Class14) this).aClass377_5082.method3850((byte) -39, this);
            anInt8647++;
            if ((i_44_ ^ 0xffffffff) == -1)
                i_44_ = i_46_;
            OpenGL.glPixelStorei(3317, 1);
            if (i_43_ >= -4)
                method250(74, false, -106);
            if (i_46_ != i_44_)
                OpenGL.glPixelStorei(3314, i_44_);
            OpenGL.glTexSubImage2Dub(((Class14) this).anInt5093, 0, i_47_, i,
                    i_46_, i_45_,
                    Class348_Sub40_Sub3.method3055(120,
                            class304),
                    5121, is, i_42_);
            if ((i_44_ ^ 0xffffffff) != (i_46_ ^ 0xffffffff))
                OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("tw.T(" + i + ',' + i_42_ + ','
                            + i_43_ + ',' + i_44_ + ','
                            + i_45_ + ',' + i_46_ + ','
                            + i_47_ + ','
                            + (is != null ? "{...}" : "null")
                            + ','
                            + (class304 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    static final void method254(int i, byte i_48_) {
        if (i_48_ > -79)
            method252(127, 53);
        if ((Class239_Sub12.anInt5969 ^ 0xffffffff) != -2) {
            if (Class239_Sub12.anInt5969 == 2)
                Class348_Sub6.anInt6634 = i;
        } else
            Class107.anInt1645 = i;
        anInt8643++;
    }
}
