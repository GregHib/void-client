/* Class286_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class286_Sub5 extends Class286 {
    static d aD6247;
    static int anInt6248 = -1;
    static int anInt6249;
    static int anInt6250;
    static int anInt6251;
    static int anInt6252;
    static int anInt6253;
    private final Class61 aClass61_6254;
    static int anInt6255;
    static int anInt6256;
    static int anInt6257;
    static int anInt6258;
    private final Class83 aClass83_6259;
    static int[] anIntArray6260 = new int[1];
    static int anInt6261;

    static final void method2158(byte i) {
        anInt6256++;
        int i_0_ = 0;
        if (Class316.aClass348_Sub51_3959 != null) i_0_ = Class316.aClass348_Sub51_3959.aClass239_Sub23_7231.method1818(-32350);
        if (i == 56) {
            if (i_0_ == 2) {
                int i_1_ = (Math.min(Class272.anInt3473, 800));
                Class321.anInt4017 = i_1_;
                Class348_Sub48.anInt7129 = (Class272.anInt3473 + -i_1_) / 2;
                int i_2_ = (Math.min(Class348_Sub22.anInt6857, 600));
                Class348_Sub42_Sub8_Sub2.anInt10432 = i_2_;
                Class335.anInt4167 = 0;
            } else if (i_0_ == 1) {
                int i_3_ = Math.min(Class272.anInt3473, 1024);
                Class348_Sub48.anInt7129 = (Class272.anInt3473 + -i_3_) / 2;
                int i_4_ = (Math.min(Class348_Sub22.anInt6857, 768));
                Class321.anInt4017 = i_3_;
                Class335.anInt4167 = 0;
                Class348_Sub42_Sub8_Sub2.anInt10432 = i_4_;
            } else {
                Class335.anInt4167 = 0;
                Class348_Sub42_Sub8_Sub2.anInt10432 = Class348_Sub22.anInt6857;
                Class348_Sub48.anInt7129 = 0;
                Class321.anInt4017 = Class272.anInt3473;
            }
        }
    }

    final void method2136(int i, int i_5_, byte i_6_) {
        anInt6252++;
        float f = -5.0E-4F * (float) (1 + (i & 0x3));
        float f_7_ = 5.0E-4F * (float) (1 + ((i & 0x18) >> 3));
        float f_8_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean bool = (i & 0x80) != 0;
        this.aHa_Sub2_3684.method3738(-15039, 1);
        if (bool) {
            Class110_Sub1.aFloatArray5791[1] = 0.0F;
            Class110_Sub1.aFloatArray5791[0] = f_8_;
            Class110_Sub1.aFloatArray5791[3] = 0.0F;
            Class110_Sub1.aFloatArray5791[2] = 0.0F;
        } else {
            Class110_Sub1.aFloatArray5791[1] = 0.0F;
            Class110_Sub1.aFloatArray5791[0] = 0.0F;
            Class110_Sub1.aFloatArray5791[2] = f_8_;
            Class110_Sub1.aFloatArray5791[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, Class110_Sub1.aFloatArray5791, 0);
        Class110_Sub1.aFloatArray5791[0] = 0.0F;
        Class110_Sub1.aFloatArray5791[1] = f_8_;
        Class110_Sub1.aFloatArray5791[3] = (f * (float) this.aHa_Sub2_3684.anInt7735 % 1.0F);
        if (i_6_ >= -42) method2136(-27, -15, (byte) -43);
        Class110_Sub1.aFloatArray5791[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, Class110_Sub1.aFloatArray5791, 0);
        if (aClass83_6259.aBoolean1442) {
            Class110_Sub1.aFloatArray5791[0] = 0.0F;
            Class110_Sub1.aFloatArray5791[3] = (float) (this.aHa_Sub2_3684.anInt7735) * f_7_ % 1.0F;
            Class110_Sub1.aFloatArray5791[2] = 0.0F;
            Class110_Sub1.aFloatArray5791[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, Class110_Sub1.aFloatArray5791, 0);
        } else {
            int i_9_ = (int) (16.0F * ((float) this.aHa_Sub2_3684.anInt7735 * f_7_));
            this.aHa_Sub2_3684.method3771((byte) -81, aClass83_6259.aClass258_Sub3Array1448[i_9_ % 16]);
        }
        this.aHa_Sub2_3684.method3738(-15039, 0);
    }

    final void method2140(Class258 class258, byte i, int i_10_) {
        anInt6257++;
        this.aHa_Sub2_3684.method3771((byte) -118, class258);
        this.aHa_Sub2_3684.method3761(0, i_10_);
        if (i > -89) method2140(null, (byte) 109, -112);
    }

    final void method2133(int i) {
        anInt6249++;
        aClass61_6254.method594('\001', 28666);
        this.aHa_Sub2_3684.method3738(-15039, 1);
        this.aHa_Sub2_3684.method3771((byte) -113, null);
        if (i > -75) anInt6248 = -7;
        this.aHa_Sub2_3684.method3738(-15039, 0);
    }

    Class286_Sub5(ha_Sub2 var_ha_Sub2, Class83 class83) {
        super(var_ha_Sub2);
        try {
            aClass83_6259 = class83;
            aClass61_6254 = new Class61(var_ha_Sub2, 2);
            aClass61_6254.method595((byte) 104, 0);
            this.aHa_Sub2_3684.method3738(-15039, 1);
            if (aClass83_6259.aBoolean1442) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glEnable(3170);
            }
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glTexGeni(8193, 9472, 9216);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            this.aHa_Sub2_3684.method3738(-15039, 0);
            aClass61_6254.method591(-1);
            aClass61_6254.method595((byte) 117, 1);
            this.aHa_Sub2_3684.method3738(-15039, 1);
            if (aClass83_6259.aBoolean1442) OpenGL.glDisable(3170);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            this.aHa_Sub2_3684.method3738(-15039, 0);
            aClass61_6254.method591(-1);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("gn.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + (class83 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method2159(byte i, Class45 class45) {
        Class348_Sub22.anInt6862 = class45.method417("hitmarks", 0);
        anInt6258++;
        Class106.anInt1639 = class45.method417("hitbar_default", 0);
        Class373_Sub2.anInt7429 = class45.method417("timerbar_default", 0);
        ha.anInt4562 = class45.method417("headicons_pk", 0);
        Class82.anInt1435 = class45.method417("headicons_prayer", 0);
        Class115.anInt1756 = class45.method417("hint_headicons", 0);
        Class291.anInt3739 = class45.method417("hint_mapmarkers", 0);
        Class86.anInt1481 = class45.method417("mapflag", 0);
        Class239_Sub10.anInt5948 = class45.method417("cross", 0);
        Class113.anInt1742 = class45.method417("mapdots", 0);
        WhereMode.anInt4469 = class45.method417("scrollbar", 0);
        Class348_Sub40_Sub38.anInt9473 = class45.method417("name_icons", 0);
        Class187.anInt2510 = class45.method417("floorshadows", 0);
        Class52.anInt4895 = class45.method417("compass", 0);
        if (i > -72) method2161((byte) 106, 125L);
        Class186_Sub1.anInt5814 = class45.method417("otherlevel", 0);
        Class5_Sub3.anInt8370 = class45.method417("hint_mapedge", 0);
    }

    final void method2134(boolean bool, boolean bool_11_) {
        anInt6250++;
        aClass61_6254.method594('\0', 28666);
        if (aClass83_6259.aBoolean1442) {
            this.aHa_Sub2_3684.method3738(-15039, 1);
            this.aHa_Sub2_3684.method3771((byte) -117, (aClass83_6259.aClass258_Sub1_1446));
            this.aHa_Sub2_3684.method3738(-15039, 0);
        }
        if (bool_11_ != false) anInt6248 = -68;
    }

    public static void method2160(int i) {
        if (i == 0) {
            aD6247 = null;
            anIntArray6260 = null;
        }
    }

    final void method2139(boolean bool, byte i) {
        anInt6261++;
        int i_12_ = -52 % ((i - -60) / 38);
    }

    final boolean method2137(int i) {
        if (i >= -5) anInt6248 = 124;
        anInt6253++;
        return true;
    }

    static final void method2161(byte i, long l) {
        try {
            anInt6251++;
            if (l > 0L) {
                if (l % 10L == 0) {
                    Class327.method2606(-125, -1L + l);
                    Class327.method2606(-125, 1L);
                } else Class327.method2606(59, l);
                int i_13_ = 70 % ((i - -52) / 32);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "gn.D(" + i + ',' + l + ')');
        }
    }
}
