/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.awt.*;

final class Class377 extends ha_Sub3 {
    static int anInt9812;
    static int anInt9813;
    static int anInt9814;
    static int anInt9815;
    static int anInt9816;
    static int anInt9817;
    static int anInt9818;
    static int anInt9819;
    static int anInt9820;
    static int anInt9821;
    static int anInt9822;
    static int anInt9823;
    static int anInt9824;
    static int anInt9825;
    static int anInt9826;
    static int anInt9827;
    static int anInt9828;
    static int anInt9829;
    static int anInt9830;
    static int anInt9831;
    static int anInt9832;
    static int anInt9833;
    static int anInt9834;
    static int anInt9835;
    static int anInt9836;
    static int anInt9837;
    static int anInt9838;
    static int anInt9839;
    static int anInt9840;
    static int anInt9841;
    static int anInt9842;
    static int anInt9843;
    static int anInt9844;
    static int anInt9845;
    static int anInt9846;
    static int anInt9847;
    static int anInt9848;
    static int anInt9849;
    static int anInt9850;
    static int anInt9851;
    static int anInt9852;
    static int anInt9853;
    static int anInt9854;
    static int anInt9855;
    private OpenGL anOpenGL9856;
    static int anInt9857;
    static int anInt9858;
    static int anInt9859;
    static Class138 aClass138_9860 = new Class138(15, 0, 1, 0);
    static int anInt9861;
    static int anInt9862;
    static int anInt9863;
    static int anInt9864;
    static int anInt9865;
    static int anInt9866;
    static int anInt9867;
    static int anInt9868;
    private final Class262 aClass262_9869 = new Class262();
    static int anInt9870;
    static int anInt9871;
    static int anInt9872;
    static int anInt9873;
    static int anInt9874;
    static int anInt9875;
    static int anInt9876;
    static int anInt9877;
    static int anInt9878;
    static int anInt9879;
    static int anInt9880;
    static int anInt9881;
    static int anInt9882;
    static int anInt9883;
    static int anInt9884;
    static int anInt9885;
    static int anInt9886;
    static int anInt9887;
    static int anInt9888;
    static int anInt9889;
    static int anInt9890;
    static int anInt9891;
    static int anInt9892;
    static int anInt9893;
    static int anInt9894;
    static int anInt9895;
    static int anInt9896;
    static int anInt9897;
    static int anInt9898;
    private Class262 aClass262_9899 = new Class262();
    static int anInt9900;
    private final Class262 aClass262_9901 = new Class262();
    private Class262 aClass262_9902 = new Class262();
    private Class262 aClass262_9903 = new Class262();
    private final Class262 aClass262_9904 = new Class262();
    private Class262 aClass262_9905 = new Class262();
    private long aLong9906;
    private Class285_Sub1[] aClass285_Sub1Array9907 = new Class285_Sub1[16];
    private boolean aBoolean9908;
    private int anInt9909;
    private boolean aBoolean9910;
    private boolean aBoolean9911;
    private boolean aBoolean9912;
    MapBuffer aMapBuffer9913 = new MapBuffer();
    private boolean aBoolean9914;
    MapBuffer aMapBuffer9915 = new MapBuffer();
    private String aString9916;
    private final String aString9917;
    int anInt9918;
    private boolean aBoolean9919;
    boolean aBoolean9920;
    boolean aBoolean9921;
    boolean aBoolean9922;
    boolean aBoolean9923;
    private int anInt9924;
    private int anInt9925 = 0;
    private final boolean aBoolean9926;
    int[] anIntArray9927;

    final synchronized void method3646(int i) {
        anInt9870++;
        int i_0_ = 0;
        i &= 0x7fffffff;
        while (!aClass262_9899.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35
                    = (Class348_Sub35) aClass262_9899.method1997(8);
            Class107.anIntArray1650[i_0_++]
                    = (int) class348_sub35.aLong4291;
            this.anInt8063
                    -= class348_sub35.anInt6976;
            if (i_0_ == 1000) {
                OpenGL.glDeleteBuffersARB(i_0_, Class107.anIntArray1650, 0);
                i_0_ = 0;
            }
        }
        if (i_0_ > 0) {
            OpenGL.glDeleteBuffersARB(i_0_, Class107.anIntArray1650, 0);
            i_0_ = 0;
        }
        while (!aClass262_9901.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35
                    = (Class348_Sub35) aClass262_9901.method1997(8);
            Class107.anIntArray1650[i_0_++]
                    = (int) class348_sub35.aLong4291;
            this.anInt8062
                    -= class348_sub35.anInt6976;
            if (i_0_ == 1000) {
                OpenGL.glDeleteTextures(i_0_, Class107.anIntArray1650, 0);
                i_0_ = 0;
            }
        }
        if (i_0_ > 0) {
            OpenGL.glDeleteTextures(i_0_, Class107.anIntArray1650, 0);
            i_0_ = 0;
        }
        while (!aClass262_9902.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35
                    = (Class348_Sub35) aClass262_9902.method1997(8);
            Class107.anIntArray1650[i_0_++]
                    = class348_sub35.anInt6976;
            if (i_0_ == 1000) {
                OpenGL.glDeleteFramebuffersEXT(i_0_, Class107.anIntArray1650,
                        0);
                i_0_ = 0;
            }
        }
        if (i_0_ > 0) {
            OpenGL.glDeleteFramebuffersEXT(i_0_, Class107.anIntArray1650, 0);
            i_0_ = 0;
        }
        while (!aClass262_9903.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35
                    = (Class348_Sub35) aClass262_9903.method1997(8);
            Class107.anIntArray1650[i_0_++]
                    = (int) class348_sub35.aLong4291;
            this.anInt8079
                    -= class348_sub35.anInt6976;
            if (i_0_ == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(i_0_, Class107.anIntArray1650,
                        0);
                i_0_ = 0;
            }
        }
        if (i_0_ > 0) {
            OpenGL.glDeleteRenderbuffersEXT(i_0_, Class107.anIntArray1650, 0);
            boolean bool = false;
        }
        while (!aClass262_9869.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35
                    = (Class348_Sub35) aClass262_9869.method1997(8);
            OpenGL.glDeleteLists((int) class348_sub35.aLong4291,
                    class348_sub35.anInt6976);
        }
        while (!aClass262_9904.method2002((byte) 18)) {
            Class348 class348 = aClass262_9904.method1997(8);
            OpenGL.glDeleteProgramARB((int) class348.aLong4291);
        }
        while (!aClass262_9905.method2002((byte) 18)) {
            Class348 class348 = aClass262_9905.method1997(8);
            OpenGL.glDeleteObjectARB(class348.aLong4291);
        }
        while (!aClass262_9869.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35
                    = (Class348_Sub35) aClass262_9869.method1997(8);
            OpenGL.glDeleteLists((int) class348_sub35.aLong4291,
                    class348_sub35.anInt6976);
        }
        if (this.E() > 100663296
                && (Class62.method599(-82) > 60000L + aLong9906)) {
            System.gc();
            aLong9906 = Class62.method599(-96);
        }
        super.method3646(i);
    }

    final void method3841(byte i) {
        if (i == -116) {
            OpenGL.glDepthMask(this.aBoolean8124
                    && this.aBoolean8118);
            anInt9837++;
        }
    }

    final Class130 method3812(int i, Class58[] class58s) {
        try {
            anInt9875++;
            if (i != 0)
                this.aMapBuffer9913 = null;
            return new Class130_Sub1(class58s);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.KD(" + i + ','
                            + (class58s != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method3818(boolean bool) {
        anInt9844++;
        if (bool != true)
            aClass262_9899 = null;
        if (this.aBoolean8110) {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        } else {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        }
    }

    static final void method3965(String string, int i, int i_1_) {
        try {
            anInt9841++;
            Class348_Sub42_Sub15 class348_sub42_sub15
                    = Class318_Sub9_Sub1.method2516(i, (byte) 105, i_1_);
            class348_sub42_sub15.method3246(-25490);
            class348_sub42_sub15.aString9654 = string;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.AA("
                            + (string != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_1_ + ')'));
        }
    }

    final void method3881(Object object, byte i, Canvas canvas) {
        try {
            anInt9880++;
            if (i == 99) {
                Long var_long = (Long) object;
                if (!anOpenGL9856.setSurface(var_long.longValue()))
                    throw new RuntimeException();
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.UB("
                            + (object != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (canvas != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method3901(byte i) {
        anInt9831++;
        if (i <= -18)
            method3970(1);
    }

    final void method3924(boolean bool, boolean bool_2_, int i,
                          Class70 class70, boolean bool_3_) {
        try {
            anInt9852++;
            if (bool_2_ == false) {
                OpenGL.glTexEnvi(8960, i + 34176,
                        Class57.method531((byte) 101, class70));
                if (bool)
                    OpenGL.glTexEnvi(8960, i + 34192, !bool_3_ ? 770 : 771);
                else
                    OpenGL.glTexEnvi(8960, i + 34192, !bool_3_ ? 768 : 769);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.DD(" + bool + ',' + bool_2_
                            + ',' + i + ','
                            + (class70 != null ? "{...}"
                            : "null")
                            + ',' + bool_3_ + ')'));
        }
    }

    final boolean method3880(Class68 class68, Class304 class304, byte i) {
        try {
            anInt9849++;
            int i_4_ = -21 / ((85 - i) / 37);
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.FB("
                            + (class68 != null ? "{...}"
                            : "null")
                            + ','
                            + (class304 != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    final void method3813(boolean bool) {
        OpenGL.glMatrixMode(5889);
        if (bool != true)
            method3652();
        anInt9884++;
        OpenGL.glLoadMatrixf(this.aFloatArray8135, 0);
        OpenGL.glMatrixMode(5888);
    }

    final void ya() {
        anInt9839++;
        this.method3946(-32, true);
        OpenGL.glClear(256);
    }

    final synchronized void method3966(long l, int i) {
        try {
            anInt9853++;
            Class348 class348 = new Class348();
            class348.aLong4291 = l;
            if (i == 34192)
                aClass262_9905.method1999(class348, i ^ ~0xcb43);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "bga.N(" + l + ',' + i + ')');
        }
    }

    final Interface13 method3624(int i, int i_5_) {
        anInt9893++;
        return null;
    }

    final void method3935(int i) {
        anInt9861++;
        OpenGL.glTexEnvi(8960, 34162,
                Class348_Sub32.method3021((byte) 32,
                        (this
                                .aClass229Array8092
                                [(this
                                .anInt8175)])));
        if (i >= -99)
            method3658(-123, -102, -33, -112);
    }

    final Interface18_Impl1 method3872(int i, int i_6_, Class304 class304,
                                       boolean bool, int i_7_, byte[] is) {
        try {
            if (bool != true)
                aString9916 = null;
            anInt9832++;
            return new Class14_Sub3(this, class304, i_6_, i_7_, i, is);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.ND(" + i + ',' + i_6_ + ','
                            + (class304 != null ? "{...}"
                            : "null")
                            + ',' + bool + ',' + i_7_ + ','
                            + (is != null ? "{...}" : "null")
                            + ')'));
        }
    }

    final synchronized void method3967(int i, byte i_8_, int i_9_) {
        anInt9898++;
        Class348_Sub35 class348_sub35 = new Class348_Sub35(i);
        if (i_8_ != 59)
            method3818(false);
        class348_sub35.aLong4291 = i_9_;
        aClass262_9901.method1999(class348_sub35, -20180);
    }

    final void method3884(byte i) {
        anInt9896++;
        if (i != 101)
            method3967(52, (byte) -47, 49);
    }

    final void method3928(int i) {
        RuntimeException_Sub1.aFloatArray4602[0]
                = this.aFloat8180 * this.aFloat8093;
        anInt9864++;
        RuntimeException_Sub1.aFloatArray4602[2]
                = this.aFloat8093 * this.aFloat8168;
        RuntimeException_Sub1.aFloatArray4602[1]
                = this.aFloat8087 * this.aFloat8093;
        RuntimeException_Sub1.aFloatArray4602[3] = 1.0F;
        OpenGL.glLightModelfv(2899, RuntimeException_Sub1.aFloatArray4602, i);
    }

    public static void method3968(int i) {
        int i_10_ = 69 % ((-67 - i) / 57);
        aClass138_9860 = null;
    }

    final Interface18_Impl3 method3843(int i, int i_11_, int i_12_, int i_13_,
                                       byte[] is, Class304 class304, int i_14_,
                                       boolean bool) {
        try {
            anInt9846++;
            if (i_14_ != 32)
                anOpenGL9856 = null;
            if (!aBoolean9926 && (!Class192.method1436(i_14_ ^ 0x46, i_12_)
                    || !Class192.method1436(i_14_ + 83, i))) {
                if (aBoolean9919)
                    return new Class14_Sub4(this, class304, i_12_, i, is,
                            i_11_, i_13_);
                Class14_Sub1 class14_sub1
                        = new Class14_Sub1(this, class304, Class68.aClass68_1183,
                        Class33.method340(i_12_, (byte) 108),
                        Class33.method340(i, (byte) 108));
                class14_sub1.method70(0, i_11_, (byte) -45, i_13_, i, i_12_, 0,
                        is, class304);
                return class14_sub1;
            }
            return new Class14_Sub1(this, class304, i_12_, i, bool, is, i_11_,
                    i_13_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.B(" + i + ',' + i_11_ + ','
                            + i_12_ + ',' + i_13_ + ','
                            + (is != null ? "{...}" : "null")
                            + ','
                            + (class304 != null ? "{...}"
                            : "null")
                            + ',' + i_14_ + ',' + bool
                            + ')'));
        }
    }

    final void method3910(byte i, int i_15_) {
        if (i == -26)
            anInt9834++;
    }

    final void method3871(Class113 class113, int i) {
        try {
            if (i == 0) {
                anInt9836++;
                if (class113 == Class150.aClass113_2047) {
                    OpenGL.glDisable(3168);
                    OpenGL.glDisable(3169);
                    OpenGL.glDisable(3170);
                } else {
                    int i_16_ = Class318_Sub1_Sub3.method2411(class113, 25602);
                    OpenGL.glTexGeni(8192, 9472, i_16_);
                    OpenGL.glEnable(3168);
                    OpenGL.glTexGeni(8193, 9472, i_16_);
                    OpenGL.glEnable(3169);
                    OpenGL.glTexGeni(8194, 9472, i_16_);
                    OpenGL.glEnable(3170);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.CD("
                            + (class113 != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    final void method3926(byte i, boolean bool) {
        anInt9847++;
        if (i <= 34)
            aBoolean9914 = false;
        if (bool)
            OpenGL.glEnable(32925);
        else
            OpenGL.glDisable(32925);
    }

    final void method3940(int i) {
        OpenGL.glMatrixMode(5890);
        anInt9888++;
        if (Class348_Sub42_Sub18.aClass251_9685
                != this.aClass251Array8113[this.anInt8175])
            OpenGL.glLoadMatrixf(this.aClass101_Sub2Array8131
                            [this.anInt8175]
                            .method918(Class233.aFloatArray3015, 0),
                    0);
        else
            OpenGL.glLoadIdentity();
        if (i != 1)
            method3862(37, null);
        OpenGL.glMatrixMode(5888);
    }

    final void method3925(int i, Interface5_Impl1 interface5_impl1,
                          int i_17_) {
        try {
            anInt9814++;
            int i_18_ = 86 / ((i - -26) / 39);
            aClass285_Sub1Array9907[i_17_] = (Class285_Sub1) interface5_impl1;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.WB(" + i + ','
                            + (interface5_impl1 != null
                            ? "{...}" : "null")
                            + ',' + i_17_ + ')'));
        }
    }

    final void method3920(int i) {
        anInt9862++;
        if (i != 10)
            method3911(null, 34, null);
        OpenGL.glTexEnvi(8960, 34161,
                Class348_Sub32.method3021((byte) 32,
                        (this
                                .aClass229Array8086
                                [(this
                                .anInt8175)])));
    }

    final Interface3 method3665(int i, int i_19_) {
        anInt9891++;
        return null;
    }

    final void method3819(byte i) {
        anInt9887++;
        int i_20_
                = this.anIntArray9927[this.anInt8175];
        if (i_20_ != 0) {
            this.anIntArray9927[this.anInt8175] = 0;
            OpenGL.glBindTexture(i_20_, 0);
            OpenGL.glDisable(i_20_);
        }
        if (i >= -19)
            aLong9906 = 83L;
    }

    final void method3882(byte i) {
        anInt9874++;
        for (int i_21_ = -1 + this.anInt8090; i_21_ >= 0;
             i_21_--) {
            OpenGL.glActiveTexture(i_21_ + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] fs = {0.0F, 0.0F, 0.0F, 1.0F};
        int i_22_ = 0;
        if (i < 45)
            anInt9925 = 51;
        for (/**/; i_22_ < 8; i_22_++) {
            int i_23_ = i_22_ + 16384;
            OpenGL.glLightfv(i_23_, 4608, fs, 0);
            OpenGL.glLightf(i_23_, 4615, 0.0F);
            OpenGL.glLightf(i_23_, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        anOpenGL9856.setSwapInterval(0);
        super.method3882((byte) 122);
    }

    final void method3827(byte i) {
        anInt9879++;
        if (this.aBoolean8148 && this.aBoolean8123
                && this.anInt8091 >= 0)
            OpenGL.glEnable(2912);
        else
            OpenGL.glDisable(2912);
        if (i > -30)
            ya();
    }

    final Interface4 method3634(Interface3 interface3,
                                Interface13 interface13) {
        try {
            anInt9897++;
            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.NB("
                            + (interface3 != null ? "{...}"
                            : "null")
                            + ','
                            + (interface13 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final Object method3876(int i, Canvas canvas) {
        try {
            anInt9894++;
            if (i != -1)
                GA(-118);
            long l = anOpenGL9856.prepareSurface(canvas);
            if (l == -1)
                throw new RuntimeException();
            return new Long(l);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.MC(" + i + ','
                            + (canvas != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final Class365 c() {
        anInt9843++;
        int i = -1;
        if (aString9917.indexOf("nvidia") != -1)
            i = 4318;
        else if (aString9917.indexOf("intel") != -1)
            i = 32902;
        else if (aString9917.indexOf("ati") != -1)
            i = 4098;
        return new Class365(i, "OpenGL", anInt9924, aString9916, 0L);
    }

    final Class299 method3706(Class299 class299, Class299 class299_24_,
                              float f, Class299 class299_25_) {
        try {
            anInt9873++;
            if (f < 0.5F)
                return class299;
            return class299_24_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("bga.SD(" + (class299 != null ? "{...}" : "null") + ','
                                    + (class299_24_ != null ? "{...}" : "null") + ',' + f
                                    + ',' + (class299_25_ != null ? "{...}" : "null")
                                    + ')'));
        }
    }

    final synchronized void method3969(int i, int i_26_, int i_27_) {
        if (i_27_ != 3089)
            this.anIntArray9927 = null;
        anInt9850++;
        Class348_Sub35 class348_sub35 = new Class348_Sub35(i);
        class348_sub35.aLong4291 = i_26_;
        aClass262_9899.method1999(class348_sub35, i_27_ ^ ~0x42c2);
    }

    final void method3842(boolean bool) {
        RuntimeException_Sub1.aFloatArray4602[2]
                = this.aFloat8168 * this.aFloat8174;
        RuntimeException_Sub1.aFloatArray4602[3] = 1.0F;
        RuntimeException_Sub1.aFloatArray4602[0]
                = this.aFloat8180 * this.aFloat8174;
        anInt9825++;
        RuntimeException_Sub1.aFloatArray4602[1]
                = this.aFloat8087 * this.aFloat8174;
        OpenGL.glLightfv(16384, 4609, RuntimeException_Sub1.aFloatArray4602,
                0);
        RuntimeException_Sub1.aFloatArray4602[0]
                = this.aFloat8180 * -this.aFloat8186;
        RuntimeException_Sub1.aFloatArray4602[2]
                = -this.aFloat8186 * this.aFloat8168;
        if (bool == true) {
            RuntimeException_Sub1.aFloatArray4602[3] = 1.0F;
            RuntimeException_Sub1.aFloatArray4602[1]
                    = -this.aFloat8186 * this.aFloat8087;
            OpenGL.glLightfv(16385, 4609,
                    RuntimeException_Sub1.aFloatArray4602, 0);
        }
    }

    private final void method3970(int i) {
        if (aBoolean9911)
            OpenGL.glPopMatrix();
        anInt9840++;
        if (i != 1)
            method3950(69);
        if (this.aClass196_8184.method1450(-98)) {
            if (!aBoolean9914) {
                OpenGL.glLoadMatrixf
                        (this.aClass101_Sub2_8083
                                        .method918(Class233.aFloatArray3015, 0),
                                0);
                aBoolean9914 = true;
                method3892(0);
                method3823((byte) -104);
            }
            if (!this.aBoolean8069) {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf
                        (this.aClass101_Sub2_8074
                                        .method918(Class233.aFloatArray3015, i ^ 0x1),
                                0);
                aBoolean9911 = true;
            } else
                aBoolean9911 = false;
        } else {
            if (this.aBoolean8069) {
                OpenGL.glLoadIdentity();
                aBoolean9911 = false;
            } else {
                OpenGL.glLoadMatrixf
                        (this.aClass101_Sub2_8074
                                        .method918(Class233.aFloatArray3015, 0),
                                0);
                aBoolean9911 = false;
            }
        }
    }

    final void method3652() {
        super.method3652();
        anInt9868++;
        if (anOpenGL9856 != null) {
            anOpenGL9856.a();
            anOpenGL9856.release();
            anOpenGL9856 = null;
        }
    }

    final void method3851(int i) {
        if (i != 25644)
            this.aBoolean9921 = false;
        anInt9871++;
        this.aFloat8115 = (float) (this.anInt8154
                + -this.anInt8105);
        this.aFloat8173 = ((float) -this.anInt8091
                + this.aFloat8115);
        if (this.aFloat8173 < (float) this.anInt8095)
            this.aFloat8173 = (float) this.anInt8095;
        OpenGL.glFogf(2915, this.aFloat8173);
        OpenGL.glFogf(2916, this.aFloat8115);
        RuntimeException_Sub1.aFloatArray4602[2]
                = ((float) Class139.method1166(this.anInt8144, 255)
                / 255.0F);
        RuntimeException_Sub1.aFloatArray4602[0]
                = ((float) Class139.method1166(16711680,
                this.anInt8144)
                / 1.671168E7F);
        RuntimeException_Sub1.aFloatArray4602[1]
                = ((float) Class139.method1166(65280, this.anInt8144)
                / 65280.0F);
        OpenGL.glFogfv(2918, RuntimeException_Sub1.aFloatArray4602, 0);
    }

    final boolean method3671() {
        anInt9829++;
        return false;
    }

    final void method3883(int i) {
        if (!this.aBoolean8145 || this.aBoolean8149)
            OpenGL.glDisable(2896);
        else
            OpenGL.glEnable(2896);
        anInt9818++;
        int i_28_ = -61 / ((i - 20) / 36);
    }

    final void method3921(int i) {
        anInt9824++;
        if (i == 1) {
            if (!this.aBoolean8209)
                OpenGL.glDisable(3089);
            else
                OpenGL.glEnable(3089);
        }
    }

    final void method3937(byte i) {
        if (i != -33)
            method3832(35, (byte) -122);
        OpenGL.glViewport(this.anInt8181,
                this.anInt8109,
                this.anInt7931,
                this.anInt7962);
        anInt9827++;
    }

    final void method3658(int i, int i_29_, int i_30_, int i_31_) {
        anInt9833++;
    }

    Class377(OpenGL opengl, Canvas canvas, long l, d var_d, Class45 class45,
             int i) {
        super(canvas, new Long(l), var_d, class45, i, 1);
        try {
            try {
                anOpenGL9856 = opengl;
                anOpenGL9856.b();
                aString9917 = OpenGL.glGetString(7936).toLowerCase();
                aString9916 = OpenGL.glGetString(7937).toLowerCase();
                if (aString9917.indexOf("microsoft") != -1
                        || aString9917.indexOf("brian paul") != -1
                        || aString9917.indexOf("mesa") != -1)
                    throw new RuntimeException("");
                String string = OpenGL.glGetString(7938);
                String[] strings
                        = Class348_Sub40_Sub23
                        .method3113(' ', true, string.replace('.', ' '));
                if (strings.length < 2)
                    throw new RuntimeException("");
                try {
                    int i_32_ = Class348_Sub41.method3156(true, strings[0]);
                    int i_33_ = Class348_Sub41.method3156(true, strings[1]);
                    anInt9924 = i_32_ * 10 - -i_33_;
                } catch (NumberFormatException numberformatexception) {
                    throw new RuntimeException("");
                }
                if (anInt9924 < 12)
                    throw new RuntimeException("");
                if (!anOpenGL9856.a("GL_ARB_multitexture"))
                    throw new RuntimeException("");
                if (!anOpenGL9856.a("GL_ARB_texture_env_combine"))
                    throw new RuntimeException("");
                int[] is = new int[1];
                OpenGL.glGetIntegerv(34018, is, 0);
                this.anInt8090 = is[0];
                if (this.anInt8090 < 2)
                    throw new RuntimeException("");
                this.anInt8138 = 8;
                this.aBoolean9920
                        = anOpenGL9856.a("GL_ARB_vertex_buffer_object");
                this.aBoolean8182
                        = anOpenGL9856.a("GL_ARB_multisample");
                aBoolean9919 = anOpenGL9856.a("GL_ARB_texture_rectangle");
                this.aBoolean8101
                        = anOpenGL9856.a("GL_ARB_texture_cube_map");
                aBoolean9926
                        = anOpenGL9856.a("GL_ARB_texture_non_power_of_two");
                this.aBoolean8159
                        = anOpenGL9856.a("GL_EXT_texture3D");
                this.aBoolean9921
                        = anOpenGL9856.a("GL_ARB_vertex_shader");
                this.aBoolean9923
                        = anOpenGL9856.a("GL_ARB_vertex_program");
                this.aBoolean9922
                        = anOpenGL9856.a("GL_ARB_fragment_shader");
                anOpenGL9856.a("GL_ARB_fragment_program");
                this.anIntArray9927
                        = new int[this.anInt8090];
                this.anInt9918 = Stream.c() ? 33639 : 5121;
                if (aString9916.indexOf("radeon") != -1) {
                    int i_34_ = 0;
                    boolean bool = false;
                    boolean bool_35_ = false;
                    String[] strings_36_
                            = (Class348_Sub40_Sub23.method3113
                            (' ', true, aString9916.replace('/', ' ')));
                    for (int i_37_ = 0; (i_37_ < strings_36_.length); i_37_++) {
                        String string_38_ = strings_36_[i_37_];
                        try {
                            if (string_38_.length() > 0) {
                                if (string_38_.charAt(0) == 'x'
                                        && string_38_.length() >= 3
                                        && (Class50_Sub3.method468
                                        (string_38_.substring(1, 3), -115))) {
                                    bool_35_ = true;
                                    string_38_ = string_38_.substring(1);
                                }
                                if (string_38_.equals("hd"))
                                    bool = true;
                                else {
                                    if (string_38_.startsWith("hd")) {
                                        bool = true;
                                        string_38_ = string_38_.substring(2);
                                    }
                                    if (string_38_.length() >= 4
                                            && (Class50_Sub3.method468
                                            (string_38_.substring(0, 4),
                                                    92))) {
                                        i_34_ = (Class348_Sub41.method3156
                                                (true,
                                                        string_38_.substring(0, 4)));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                    if (!bool_35_ && !bool) {
                        if (i_34_ >= 7000 && i_34_ <= 7999)
                            this.aBoolean9920 = false;
                        if (i_34_ >= 7000 && i_34_ <= 9250)
                            this.aBoolean8159 = false;
                    }
                    aBoolean9919 &= anOpenGL9856.a("GL_ARB_half_float_pixel");
                }
                aString9917.indexOf("intel");
                if (this.aBoolean9920) {
                    try {
                        int[] is_39_ = new int[1];
                        OpenGL.glGenBuffersARB(1, is_39_, 0);
                    } catch (Throwable throwable) {
                        throw new RuntimeException("");
                    }
                }
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                this.method3635((byte) -28);
                throw new RuntimeException("");
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("bga.<init>(" + (opengl != null ? "{...}" : "null")
                                    + ',' + (canvas != null ? "{...}" : "null") + ',' + l
                                    + ',' + (var_d != null ? "{...}" : "null") + ','
                                    + (class45 != null ? "{...}" : "null") + ',' + i
                                    + ')'));
        }
    }

    final void method3938(Class21 class21, int i,
                          Interface5_Impl2 interface5_impl2, int i_40_,
                          int i_41_, int i_42_, int i_43_) {
        try {
            if (i_43_ <= 46)
                aClass262_9903 = null;
            anInt9867++;
            int i_44_;
            int i_45_;
            if (Class249.aClass21_3217 == class21) {
                i_44_ = 1;
                i_45_ = i * 2;
            } else {
                if (class21 == Class348_Sub5_Sub1.aClass21_8832) {
                    i_45_ = 1 + i;
                    i_44_ = 3;
                } else if (class21 == Class247.aClass21_3181) {
                    i_44_ = 4;
                    i_45_ = i * 3;
                } else if (Class348_Sub42_Sub16.aClass21_9661 == class21) {
                    i_44_ = 6;
                    i_45_ = 2 + i;
                } else if (class21 == s_Sub3.aClass21_8320) {
                    i_45_ = 2 + i;
                    i_44_ = 5;
                } else {
                    i_45_ = i;
                    i_44_ = 0;
                }
            }
            Class68 class68 = interface5_impl2.method25((byte) 51);
            Class285_Sub2 class285_sub2 = (Class285_Sub2) interface5_impl2;
            class285_sub2.method2125(0);
            OpenGL.glDrawElements(i_44_, i_45_,
                    Class130.method1128(-20, class68),
                    (class285_sub2.method2122(27819)
                            + (long) (i_41_ * (class68
                            .anInt1178))));
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.JC("
                            + (class21 != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (interface5_impl2 != null
                            ? "{...}" : "null")
                            + ',' + i_40_ + ',' + i_41_ + ','
                            + i_42_ + ',' + i_43_ + ')'));
        }
    }

    final void method3823(byte i) {
        anInt9812++;
        int i_46_ = -79 / ((i - -39) / 62);
        this.method3942(5);
        int i_47_;
        for (i_47_ = 0; this.anInt8151 > i_47_; i_47_++) {
            Class348_Sub1 class348_sub1
                    = this.aClass348_Sub1Array8132[i_47_];
            int i_48_ = class348_sub1.method2720(-1);
            int i_49_ = i_47_ + 16386;
            float f = class348_sub1.method2721(-37) / 255.0F;
            RuntimeException_Sub1.aFloatArray4602[0]
                    = (float) class348_sub1.method2724(-1);
            RuntimeException_Sub1.aFloatArray4602[1]
                    = (float) class348_sub1.method2722(124);
            RuntimeException_Sub1.aFloatArray4602[2]
                    = (float) class348_sub1.method2717((byte) 111);
            RuntimeException_Sub1.aFloatArray4602[3] = 1.0F;
            OpenGL.glLightfv(i_49_, 4611,
                    RuntimeException_Sub1.aFloatArray4602, 0);
            RuntimeException_Sub1.aFloatArray4602[2]
                    = (float) Class139.method1166(255, i_48_) * f;
            RuntimeException_Sub1.aFloatArray4602[1]
                    = f * (float) (Class139.method1166(i_48_, 65338)
                    >> 1736677832);
            RuntimeException_Sub1.aFloatArray4602[0]
                    = (float) Class139.method1166(255, i_48_ >> 1806447760) * f;
            RuntimeException_Sub1.aFloatArray4602[3] = 1.0F;
            OpenGL.glLightfv(i_49_, 4609,
                    RuntimeException_Sub1.aFloatArray4602, 0);
            OpenGL.glLightf(i_49_, 4617,
                    1.0F / (float) (class348_sub1.method2723(-1)
                            * class348_sub1.method2723(-1)));
            OpenGL.glEnable(i_49_);
        }
        for (/**/;
                 i_47_ < this.anInt8122;
                 i_47_++)
            OpenGL.glDisable(16386 - -i_47_);
        super.method3823((byte) 107);
    }

    final void method3844(int i, Canvas canvas, Object object) {
        try {
            if (i != 12727)
                anInt9925 = 5;
            anInt9821++;
            Long var_long = (Long) object;
            anOpenGL9856.surfaceResized(var_long.longValue());
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.FC(" + i + ','
                            + (canvas != null ? "{...}"
                            : "null")
                            + ','
                            + (object != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method3633() {
        OpenGL.glFinish();
        anInt9876++;
    }

    final boolean method3931(boolean bool, Class304 class304,
                             Class68 class68) {
        try {
            if (bool != true)
                aClass262_9905 = null;
            anInt9855++;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.RA(" + bool + ','
                            + (class304 != null ? "{...}"
                            : "null")
                            + ','
                            + (class68 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method3899(int i, int i_50_, Class21 class21, boolean bool) {
        try {
            anInt9854++;
            if (bool != true)
                this.aBoolean9921 = true;
            int i_51_;
            int i_52_;
            if (class21 == Class249.aClass21_3217) {
                i_51_ = 2 * i;
                i_52_ = 1;
            } else {
                if (Class348_Sub5_Sub1.aClass21_8832 == class21) {
                    i_51_ = i - -1;
                    i_52_ = 3;
                } else {
                    if (Class247.aClass21_3181 == class21) {
                        i_52_ = 4;
                        i_51_ = i * 3;
                    } else if (class21 == Class348_Sub42_Sub16.aClass21_9661) {
                        i_52_ = 6;
                        i_51_ = 2 + i;
                    } else if (s_Sub3.aClass21_8320 == class21) {
                        i_51_ = 2 + i;
                        i_52_ = 5;
                    } else {
                        i_51_ = i;
                        i_52_ = 0;
                    }
                }
            }
            OpenGL.glDrawArrays(i_52_, i_50_, i_51_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.V(" + i + ',' + i_50_ + ','
                            + (class21 != null ? "{...}"
                            : "null")
                            + ',' + bool + ')'));
        }
    }

    final Interface18_Impl2 method3900(int[][] is, boolean bool, int i,
                                       int i_53_) {
        try {
            if (i <= 1)
                aClass262_9902 = null;
            anInt9883++;
            return new Class14_Sub2(this, i_53_, bool, is);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.HB("
                            + (is != null ? "{...}" : "null")
                            + ',' + bool + ',' + i + ','
                            + i_53_ + ')'));
        }
    }

    final Interface18_Impl3 method3855(Class304 class304, int i, int i_54_,
                                       float[] fs, boolean bool, int i_55_,
                                       int i_56_, int i_57_) {
        try {
            anInt9890++;
            if (i_56_ != 2)
                this.aMapBuffer9913 = null;
            if (!aBoolean9926 && (!Class192.method1436(60, i)
                    || !Class192.method1436(-73, i_57_))) {
                if (aBoolean9919)
                    return new Class14_Sub4(this, class304, i, i_57_, fs,
                            i_54_, i_55_);
                Class14_Sub1 class14_sub1
                        = new Class14_Sub1(this, class304, Class68.aClass68_1187,
                        Class33.method340(i, (byte) 108),
                        Class33.method340(i_57_, (byte) 108));
                class14_sub1.method240(i_55_, (byte) -126, fs, class304, 0,
                        i_54_, 0, i, i_57_);
                return class14_sub1;
            }
            return new Class14_Sub1(this, class304, i, i_57_, bool, fs, i_54_,
                    i_55_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.WC("
                            + (class304 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_54_ + ','
                            + (fs != null ? "{...}" : "null")
                            + ',' + bool + ',' + i_55_ + ','
                            + i_56_ + ',' + i_57_ + ')'));
        }
    }

    final boolean method3666() {
        anInt9881++;
        return false;
    }

    final Class367 method3832(int i, byte i_58_) {
        anInt9900++;
        if (i_58_ >= -57)
            method3832(-96, (byte) 20);
        int i_59_ = i;
        while_237_:
        do {
            do {
                if (i_59_ != 3) {
                    if (i_59_ != 4) {
                        if (i_59_ == 8)
                            break;
                        break while_237_;
                    }
                } else
                    return new Class367_Sub11(this,
                            this.aClass45_8039);
                return new Class367_Sub2(this, this.aClass45_8039,
                        this.aClass269_7937);
            } while (false);
            return new Class367_Sub9(this, this.aClass45_8039,
                    this.aClass269_7937);
        } while (false);
        return super.method3832(i, (byte) -73);
    }

    final Interface18_Impl3 method3830(int i, int[] is, boolean bool,
                                       byte i_60_, int i_61_, int i_62_,
                                       int i_63_) {
        try {
            int i_64_ = 101 / ((i_60_ - -21) / 46);
            anInt9830++;
            if (aBoolean9926
                    || Class192.method1436(103, i) && Class192.method1436(-53,
                    i_63_))
                return new Class14_Sub1(this, i, i_63_, bool, is, i_61_,
                        i_62_);
            if (!aBoolean9919) {
                Class14_Sub1 class14_sub1
                        = new Class14_Sub1(this, Class108.aClass304_1662,
                        Class68.aClass68_1183,
                        Class33.method340(i, (byte) 108),
                        Class33.method340(i_63_, (byte) 108));
                class14_sub1.method68(i_62_, 22809, is, 0, i_61_, i, 0, i_63_);
                return class14_sub1;
            }
            return new Class14_Sub4(this, i, i_63_, is, i_61_, i_62_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.R(" + i + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + bool + ',' + i_60_ + ','
                            + i_61_ + ',' + i_62_ + ','
                            + i_63_ + ')'));
        }
    }

    final void F(int i, int i_65_) {
        anInt9848++;
    }

    final void method3626(int i, int i_66_) throws Exception_Sub1 {
        anOpenGL9856.swapBuffers();
        anInt9857++;
    }

    final void method3673() {
        anInt9892++;
        if (this.anInt7931 > 0
                || this.anInt7962 > 0) {
            int i = this.anInt8106;
            int i_67_ = this.anInt8183;
            int i_68_ = this.anInt8165;
            int i_69_ = this.anInt8096;
            this.la();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3932((byte) -107);
            this.method3838(true, false);
            this.method3866(false, true);
            this.method3890(false, (byte) 127);
            this.method3946(-32, false);
            this.method3850((byte) 110, null);
            this.method3814(false, false, -2, (byte) 42);
            this.method3923(true, 1);
            this.method3817(117, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.anInt7931,
                    this.anInt7962, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.KA(i, i_68_, i_67_, i_69_);
        }
    }

    final void method3947(int i) {
        if (i != 4)
            method3950(-83);
        if (!this.aBoolean8116)
            OpenGL.glDisable(3042);
        else
            OpenGL.glEnable(3042);
        anInt9878++;
    }

    final synchronized void method3971(int i, int i_70_) {
        anInt9819++;
        Class348 class348 = new Class348();
        class348.aLong4291 = i_70_;
        aClass262_9904.method1999(class348, -20180);
        if (i != 16386)
            method3928(-86);
    }

    final void method3859(int i) {
        if (this.aBoolean8164)
            OpenGL.glEnable(2929);
        else
            OpenGL.glDisable(2929);
        if (i != 3)
            method3937((byte) -23);
        anInt9828++;
    }

    final void method3829(Class70 class70, int i, byte i_71_, boolean bool) {
        try {
            if (i_71_ == 80) {
                OpenGL.glTexEnvi(8960, i + 34184,
                        Class57.method531((byte) 123, class70));
                anInt9885++;
                OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.AD("
                            + (class70 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_71_ + ','
                            + bool + ')'));
        }
    }

    final void method3707
            (Rectangle[] rectangles, int i, int i_72_, int i_73_)
            throws Exception_Sub1 {
        try {
            anInt9823++;
            method3626(i_72_, i_73_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.UA("
                            + (rectangles != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_72_ + ','
                            + i_73_ + ')'));
        }
    }

    final void method3862(int i, Class130 class130) {
        try {
            anInt9866++;
            Class58[] class58s
                    = ((Class130_Sub1) class130).aClass58Array5801;
            int i_74_ = 0;
            boolean bool = false;
            boolean bool_75_ = false;
            boolean bool_76_ = false;
            for (int i_77_ = i; i_77_ < class58s.length; i_77_++) {
                Class58 class58 = class58s[i_77_];
                Class285_Sub1 class285_sub1 = aClass285_Sub1Array9907[i_77_];
                int i_78_ = 0;
                int i_79_ = class285_sub1.method2130(3545);
                long l = class285_sub1.method2122(27819);
                class285_sub1.method2125(0);
                for (int i_80_ = 0;
                     (i_80_ < class58.method538((byte) -119));
                     i_80_++) {
                    Class325 class325 = class58.method537(i_80_, -119);
                    if (class325 == Class325.aClass325_4073) {
                        OpenGL.glVertexPointer(3, 5126, i_79_,
                                (long) i_78_ + l);
                        bool_76_ = true;
                    } else if (Class325.aClass325_4075 == class325) {
                        bool_75_ = true;
                        OpenGL.glNormalPointer(5126, i_79_, (long) i_78_ + l);
                    } else if (class325 == Class325.aClass325_4076) {
                        OpenGL.glColorPointer(4, 5121, i_79_,
                                (long) i_78_ + l);
                        bool = true;
                    } else {
                        if (Class325.aClass325_4077 == class325) {
                            OpenGL.glClientActiveTexture(33984 + i_74_++);
                            OpenGL.glTexCoordPointer(1, 5126, i_79_,
                                    (long) i_78_ + l);
                        } else if (Class325.aClass325_4078 == class325) {
                            OpenGL.glClientActiveTexture(i_74_++ + 33984);
                            OpenGL.glTexCoordPointer(2, 5126, i_79_,
                                    (long) i_78_ + l);
                        } else {
                            if (Class325.aClass325_4079 == class325) {
                                OpenGL.glClientActiveTexture(i_74_++ + 33984);
                                OpenGL.glTexCoordPointer(3, 5126, i_79_,
                                        (long) i_78_ + l);
                            } else if (class325 == Class325.aClass325_4080) {
                                OpenGL.glClientActiveTexture(33984 - -i_74_++);
                                OpenGL.glTexCoordPointer(4, 5126, i_79_,
                                        l + (long) i_78_);
                            }
                        }
                    }
                    i_78_ += class325.anInt4069;
                }
            }
            if (aBoolean9910 != bool_76_) {
                if (bool_76_)
                    OpenGL.glEnableClientState(32884);
                else
                    OpenGL.glDisableClientState(32884);
                aBoolean9910 = bool_76_;
            }
            if (aBoolean9912 == !bool_75_) {
                if (bool_75_)
                    OpenGL.glEnableClientState(32885);
                else
                    OpenGL.glDisableClientState(32885);
                aBoolean9912 = bool_75_;
            }
            if (!bool != !aBoolean9908) {
                if (!bool)
                    OpenGL.glDisableClientState(32886);
                else
                    OpenGL.glEnableClientState(32886);
                aBoolean9908 = bool;
            }
            if (i_74_ <= anInt9909) {
                if (anInt9909 > i_74_) {
                    for (int i_81_ = i_74_; anInt9909 > i_81_; i_81_++) {
                        OpenGL.glClientActiveTexture(i_81_ + 33984);
                        OpenGL.glDisableClientState(32888);
                    }
                    anInt9909 = i_74_;
                }
            } else {
                for (int i_82_ = anInt9909;
                     i_82_ < i_74_; i_82_++) {
                    OpenGL.glClientActiveTexture(33984 - -i_82_);
                    OpenGL.glEnableClientState(32888);
                }
                anInt9909 = i_74_;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.KC(" + i + ','
                            + (class130 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void b(int i, int i_83_, int i_84_, int i_85_, double d) {
        anInt9859++;
    }

    final Interface5_Impl2 method3840(int i, boolean bool) {
        anInt9826++;
        if (i != -28633)
            return null;
        return new Class285_Sub2(this, Class68.aClass68_1184, bool);
    }

    final int I() {
        anInt9845++;
        return anInt9925;
    }

    final void method3868(boolean bool) {
        if (bool != false)
            aBoolean9919 = false;
        OpenGL.glActiveTexture(33984 + this.anInt8175);
        anInt9838++;
    }

    final void method3898(int i) {
        if (i != 12)
            anInt9924 = 75;
        anInt9842++;
        aBoolean9914 = false;
        method3970(1);
    }

    final void method3700(float f, float f_86_, float f_87_) {
        anInt9895++;
    }

    final void method3911(Canvas canvas, int i, Object object) {
        try {
            anInt9822++;
            Long var_long = (Long) object;
            if (i != 1)
                this.anInt9918 = -120;
            anOpenGL9856.releaseSurface(canvas, var_long.longValue());
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.QD("
                            + (canvas != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (object != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method3945(int i) {
        RuntimeException_Sub1.aFloatArray4602[1]
                = ((float) Class139.method1166(65280, this.anInt8119)
                / 65280.0F);
        RuntimeException_Sub1.aFloatArray4602[2]
                = ((float) Class139.method1166(255, this.anInt8119)
                / 255.0F);
        RuntimeException_Sub1.aFloatArray4602[3]
                = (float) (this.anInt8119 >>> 1199324056) / 255.0F;
        anInt9889++;
        RuntimeException_Sub1.aFloatArray4602[0]
                = ((float) Class139.method1166(16711680,
                this.anInt8119)
                / 1.671168E7F);
        if (i >= -107)
            anInt9909 = -64;
        OpenGL.glTexEnvfv(8960, 8705, RuntimeException_Sub1.aFloatArray4602,
                0);
    }

    final void method3892(int i) {
        anInt9865++;
        OpenGL.glLightfv(16384, 4611, this.aFloatArray8170, i);
        OpenGL.glLightfv(16385, 4611, this.aFloatArray8102, 0);
    }

    final void GA(int i) {
        OpenGL.glClearColor((float) (0xff0000 & i) / 1.671168E7F,
                (float) (0xff00 & i) / 65280.0F,
                (float) (i & 0xff) / 255.0F,
                (float) (i >>> 1909717048) / 255.0F);
        anInt9835++;
        OpenGL.glClear(16384);
    }

    final void method3672() {
        anInt9851++;
    }

    final void method3939(byte i) {
        if (this.aBoolean8141)
            OpenGL.glEnable(3008);
        else
            OpenGL.glDisable(3008);
        if (i == 100)
            anInt9858++;
    }

    final void method3710() {
        anInt9872++;
    }

    final Interface18_Impl3 method3861(int i, byte i_88_, int i_89_,
                                       Class68 class68, Class304 class304) {
        try {
            if (i_88_ != -84)
                method3842(false);
            anInt9882++;
            if (aBoolean9926 || (Class192.method1436(i_88_ + 15, i_89_)
                    && Class192.method1436(65, i)))
                return new Class14_Sub1(this, class304, class68, i_89_, i);
            if (!aBoolean9919)
                return new Class14_Sub1(this, class304, class68,
                        Class33.method340(i_89_, (byte) 108),
                        Class33.method340(i, (byte) 108));
            return new Class14_Sub4(this, class304, class68, i_89_, i);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("bga.NC(" + i + ',' + i_88_ + ','
                            + i_89_ + ','
                            + (class68 != null ? "{...}"
                            : "null")
                            + ','
                            + (class304 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    final void method3698() {
        anInt9863++;
    }

    final void method3888(int i) {
        if (i != 6259)
            aClass285_Sub1Array9907 = null;
        anInt9817++;
        OpenGL.glScissor
                (this.anInt8181 - -this.anInt8106,
                        -this.anInt8096 + (this.anInt8109
                                - -this.anInt7962),
                        -this.anInt8106 + this.anInt8183,
                        this.anInt8096 - this.anInt8165);
    }

    final void method3647(boolean bool) {
        anInt9813++;
    }

    final void method3950(int i) {
        anInt9886++;
        if (Class348_Sub4.aClass173_6602 == this.aClass173_8163)
            OpenGL.glBlendFunc(770, 771);
        else if (Class69.aClass173_1201 == this.aClass173_8163)
            OpenGL.glBlendFunc(1, 1);
        else if (Class273.aClass173_5169 == this.aClass173_8163)
            OpenGL.glBlendFunc(774, 1);
        if (i != 0)
            this.anInt9918 = 74;
    }

    final Interface5_Impl1 method3889(boolean bool, int i) {
        anInt9815++;
        if (i != 16711680)
            return null;
        return new Class285_Sub1(this, bool);
    }

    final float method3858(boolean bool) {
        anInt9877++;
        if (bool != false)
            method3935(45);
        return 0.0F;
    }

    final int[] na(int i, int i_90_, int i_91_, int i_92_) {
        anInt9820++;
        int[] is = new int[i_92_ * i_91_];
        for (int i_93_ = 0; i_93_ < i_92_;
             i_93_++)
            OpenGL.glReadPixelsi(i,
                    (-1 + (-i_93_ + -i_90_)
                            + this.anInt7962),
                    i_91_, 1, 32993, this.anInt9918,
                    is, i_91_ * i_93_);
        return is;
    }

    final void method3687(Interface4 interface4) {
        try {
            anInt9816++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "bga.IA(" + (interface4 != null
                            ? "{...}"
                            : "null") + ')');
        }
    }
}
