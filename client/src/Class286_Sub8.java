/* Class286_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class286_Sub8 extends Class286 {
    static int anInt6292;
    static int anInt6293;
    static int anInt6294;
    static int anInt6295;
    static int[] anIntArray6296 = {32, 39, 44, 47};
    static int anInt6297;
    static int anInt6298;
    static int anInt6299 = -1;
    static int anInt6300;
    private boolean aBoolean6301 = false;
    private Class61 aClass61_6302;
    static int anInt6303;
    static float aFloat6304;
    static int anInt6305;

    final void method2133(int i) {
        if (i <= -75) {
            if (aBoolean6301) {
                aClass61_6302.method594('\001', 28666);
                this.aHa_Sub2_3684.method3738(-15039, 1);
                this.aHa_Sub2_3684.method3771((byte) -92, null);
                this.aHa_Sub2_3684.method3738(-15039, 0);
            } else this.aHa_Sub2_3684.method3775(false, 0, 770, 5890);
            anInt6297++;
            this.aHa_Sub2_3684.method3729(8448, (byte) 116, 8448);
            aBoolean6301 = false;
        }
    }

    static final void method2170(int i, byte i_0_) {
        Class48.anInt859 = -1;
        anInt6300++;
        if (i_0_ != 3) method2170(-109, (byte) 7);
        Class245.anInt3170 = i;
        Class48.anInt859 = -1;
        Class348_Sub15.method2811(false);
    }

    public static void method2171(int i) {
        if (i != 0) method2172(-6);
        anIntArray6296 = null;
    }

    final void method2140(Class258 class258, byte i, int i_1_) {
        anInt6303++;
        this.aHa_Sub2_3684.method3771((byte) -86, class258);
        this.aHa_Sub2_3684.method3761(0, i_1_);
        if (i >= -89) method2172(12);
    }

    static final void method2172(int i) {
        int i_2_ = 27 / ((i - -12) / 57);
        anInt6295++;
        if (Class93.anApplet1530 != null) {
            try {
                String string = Class93.anApplet1530.getParameter("cookiehost");
                int i_3_ = (int) (Class62.method599(-74) / 86400000L) - 11745;
                String string_4_ = ("usrdob=" + i_3_ + "; version=1; path=/; domain=" + string);
                Class224.method1615(Class93.anApplet1530, -15092, "document.cookie=\"" + string_4_ + "\"");
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    Class286_Sub8(ha_Sub2 var_ha_Sub2) {
        super(var_ha_Sub2);
        if (var_ha_Sub2.aBoolean7863) {
            aClass61_6302 = new Class61(var_ha_Sub2, 2);
            aClass61_6302.method595((byte) 123, 0);
            this.aHa_Sub2_3684.method3738(-15039, 1);
            this.aHa_Sub2_3684.method3729(34165, (byte) -35, 7681);
            this.aHa_Sub2_3684.method3762(34168, 770, (byte) -87, 2);
            this.aHa_Sub2_3684.method3775(false, 0, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            this.aHa_Sub2_3684.method3738(-15039, 0);
            aClass61_6302.method591(-1);
            aClass61_6302.method595((byte) 126, 1);
            this.aHa_Sub2_3684.method3738(-15039, 1);
            this.aHa_Sub2_3684.method3729(8448, (byte) -73, 8448);
            this.aHa_Sub2_3684.method3762(34166, 770, (byte) -87, 2);
            this.aHa_Sub2_3684.method3775(false, 0, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.aHa_Sub2_3684.method3738(-15039, 0);
            aClass61_6302.method591(-1);
        }
    }

    final void method2139(boolean bool, byte i) {
        anInt6298++;
        int i_5_ = 94 / ((i - -60) / 38);
        this.aHa_Sub2_3684.method3729(8448, (byte) -28, 7681);
    }

    final boolean method2137(int i) {
        if (i > -5) aFloat6304 = -0.3934622F;
        anInt6294++;
        return true;
    }

    static final void method2173(boolean bool, int i, boolean bool_6_) {
        int i_7_ = 111 % ((i - -62) / 38);
        anInt6292++;
        if (bool) {
            Class26.anInt383--;
            if (Class26.anInt383 == 0) Class10.anIntArray179 = null;
        }
        if (bool_6_) {
            Class348_Sub40_Sub26.anInt9346--;
            if (Class348_Sub40_Sub26.anInt9346 == 0) Class126.anIntArray4983 = null;
        }
    }

    final void method2134(boolean bool, boolean bool_8_) {
        if (bool_8_ != false) method2171(85);
        anInt6293++;
        Class258_Sub2 class258_sub2 = this.aHa_Sub2_3684.method3741(444720536);
        if (aClass61_6302 != null && class258_sub2 != null && bool) {
            aClass61_6302.method594('\0', 28666);
            this.aHa_Sub2_3684.method3738(-15039, 1);
            this.aHa_Sub2_3684.method3771((byte) -77, class258_sub2);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(this.aHa_Sub2_3684.aClass101_Sub3_7767.method945(true), 0);
            OpenGL.glMatrixMode(5888);
            this.aHa_Sub2_3684.method3738(-15039, 0);
            aBoolean6301 = true;
        } else this.aHa_Sub2_3684.method3775(false, 0, 770, 34168);
    }

    final void method2136(int i, int i_9_, byte i_10_) {
        anInt6305++;
        if (i_10_ > -42) aBoolean6301 = false;
    }
}
