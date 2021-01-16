/* Class367_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class367_Sub9 extends Class367 {
    static int anInt7366;
    static Class114 aClass114_7367 = new Class114(37, 7);
    static int anInt7368;
    private Class89 aClass89_7369;
    static int anInt7370;
    static Class45 aClass45_7371;
    static int anInt7372;
    private boolean aBoolean7373;
    static int anInt7374;
    private Class269 aClass269_7375;
    private boolean aBoolean7376;
    static int anInt7377;
    static String[] aStringArray7378;
    static int anInt7379;
    static int anInt7380;

    final void method3526(int i, int i_0_, int i_1_) {
        anInt7372++;
        if (aBoolean7373) {
            int i_2_ = 1 << (i_0_ & 0x3);
            float f = (float) (1 << (0x7 & i_0_ >> 1410997091)) / 32.0F;
            int i_3_ = i_1_ & 0xffff;
            float f_4_ = (float) (0x3 & i_1_ >> 1922292912) / 8.0F;
            long l = ((Class89) aClass89_7369).aLong1510;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"),
                    (float) ((((ha_Sub3)
                            ((Class367) this).aHa_Sub3_4479)
                            .anInt8146)
                            * i_2_ % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"),
                    f);
            OpenGL.glUniform1fARB
                    (OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"),
                            (float) i_3_);
            OpenGL.glUniform1fARB
                    (OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_4_);
        }
        if (i != 10756)
            aClass269_7375 = null;
    }

    final void method3520(byte i) {
        if (i != 87)
            aBoolean7376 = true;
        if (aBoolean7373) {
            ((Class367) this).aHa_Sub3_4479.method3897(1, -4382);
            ((Class367) this).aHa_Sub3_4479.method3850((byte) 70, null);
            ((Class367) this).aHa_Sub3_4479.method3897(0, -4382);
            ((Class367) this).aHa_Sub3_4479.method3850((byte) 107, null);
            OpenGL.glUseProgramObjectARB(0L);
            aBoolean7373 = false;
        }
        anInt7368++;
    }

    static final String method3551(int i, int i_5_, int i_6_, boolean bool) {
        anInt7374++;
        if (i_5_ < 2 || i_5_ > 36)
            throw new IllegalArgumentException("Invalid radix:" + i_5_);
        if (!bool || (i_6_ ^ 0xffffffff) > -1)
            return Integer.toString(i_6_, i_5_);
        int i_7_ = 2;
        int i_8_ = i_6_ / i_5_;
        while (i_8_ != 0) {
            i_8_ /= i_5_;
            i_7_++;
        }
        char[] cs = new char[i_7_];
        cs[0] = '+';
        int i_9_ = i_7_ + -1;
        if (i != 8320)
            return null;
        for (/**/; i_9_ > 0; i_9_--) {
            int i_10_ = i_6_;
            i_6_ /= i_5_;
            int i_11_ = i_10_ + -(i_6_ * i_5_);
            if (i_11_ < 10)
                cs[i_9_] = (char) (i_11_ + 48);
            else
                cs[i_9_] = (char) (i_11_ + 87);
        }
        return new String(cs);
    }

    final boolean method3530(int i) {
        if (i >= -57)
            aBoolean7373 = true;
        anInt7366++;
        return aBoolean7376;
    }

    final void method3527(int i, Interface18 interface18, int i_12_) {
        if (i_12_ != -16776)
            method3552(-90);
        anInt7380++;
        if (!aBoolean7373) {
            ((Class367) this).aHa_Sub3_4479.method3850((byte) 102,
                    interface18);
            ((Class367) this).aHa_Sub3_4479.method3923(true, i);
        }
    }

    final void method3521(boolean bool, byte i) {
        anInt7377++;
        if (i != -103)
            anInt7379 = -84;
    }

    Class367_Sub9(Class377 class377, Class45 class45, Class269 class269) {
        super(class377);
        try {
            aClass269_7375 = class269;
            if (class45 != null && ((Class377) class377).aBoolean9921
                    && ((Class377) class377).aBoolean9922) {
                Class39 class39
                        = (Class328.method2608
                        (class377,
                                class45.method391("gl", "environment_mapped_water_v",
                                        -29832),
                                -108, 35633));
                Class39 class39_13_
                        = (Class328.method2608
                        (class377,
                                class45.method391("gl", "environment_mapped_water_f",
                                        -29832),
                                -122, 35632));
                aClass89_7369
                        = Class324.method2582(class377,
                        new Class39[]{class39,
                                class39_13_},
                        -2113);
                aBoolean7376 = (aClass89_7369 != null
                        && aClass269_7375.method2041((byte) 120));
            } else
                aBoolean7376 = false;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("ko.<init>(" + (class377 != null ? "{...}" : "null")
                                    + ',' + (class45 != null ? "{...}" : "null") + ','
                                    + (class269 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method3552(int i) {
        aClass45_7371 = null;
        aClass114_7367 = null;
        aStringArray7378 = null;
        if (i != 87)
            anInt7379 = 80;
    }

    final void method3525(int i, boolean bool) {
        anInt7370++;
        if (i != 15192)
            method3551(58, -50, 40, true);
        Interface18_Impl2 interface18_impl2
                = ((Class367) this).aHa_Sub3_4479.method3834(-16777216);
        if (aBoolean7376 && interface18_impl2 != null) {
            ((Class367) this).aHa_Sub3_4479.method3897(1, i + -19574);
            ((Class367) this).aHa_Sub3_4479.method3850((byte) -63,
                    interface18_impl2);
            ((Class367) this).aHa_Sub3_4479.method3897(0, -4382);
            ((Class367) this).aHa_Sub3_4479.method3850
                    ((byte) -107,
                            ((Class269) aClass269_7375).anInterface18_Impl1_3455);
            long l = ((Class89) aClass89_7369).aLong1510;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB
                    (OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
            OpenGL.glUniform1iARB
                    (OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"),
                    -(((ha_Sub3) ((Class367) this).aHa_Sub3_4479)
                            .aFloatArray8170[0]),
                    -(((ha_Sub3) ((Class367) this).aHa_Sub3_4479)
                            .aFloatArray8170[1]),
                    -(((ha_Sub3) ((Class367) this).aHa_Sub3_4479)
                            .aFloatArray8170[2]));
            OpenGL.glUniform4fARB
                    (OpenGL.glGetUniformLocationARB(l, "sunColour"),
                            ((ha_Sub3) ((Class367) this).aHa_Sub3_4479).aFloat8180,
                            ((ha_Sub3) ((Class367) this).aHa_Sub3_4479).aFloat8087,
                            ((ha_Sub3) ((Class367) this).aHa_Sub3_4479).aFloat8168, 1.0F);
            OpenGL.glUniform1fARB
                    (OpenGL.glGetUniformLocationARB(l, "sunExponent"),
                            928.0F * Math.abs(((ha_Sub3) ((Class367) this).aHa_Sub3_4479)
                                    .aFloatArray8170[1]) + 96.0F);
            aBoolean7373 = true;
        }
    }
}
