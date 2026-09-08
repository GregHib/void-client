/* CookieManager - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
/**
 * RENAMED from `Class286_Sub8` (JODE-obfuscated).
 * HTTP cookie manager. Builds 'document.cookie' strings with '; version=1; path=/; domain=' for web requests made by the client.
 */

import jaggl.OpenGL;

final class CookieManager extends ShaderProgram {
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
    private Component128 aClass61_6302;
    static int anInt6303;
    static float aFloat6304;
    static int anInt6305;

    final void method2133(int i) {
        if (i <= -75) {
            if (aBoolean6301) {
                aClass61_6302.callDisplayList('\001', 28666);
                this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
                this.aHa_Sub2_3684.bindTexture((byte) -92, null);
                this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
            } else this.aHa_Sub2_3684.glTexEnvCombineMode(false, 0, 770, 5890);
            anInt6297++;
            this.aHa_Sub2_3684.glTexEnvi(8448, (byte) 116, 8448);
            aBoolean6301 = false;
        }
    }

    static final void method2170(int i, byte i_0_) {
        Component377.anInt859 = -1;
        anInt6300++;
        if (i_0_ != 3) method2170(-109, (byte) 7);
        DebugOverlay.anInt3170 = i;
        Component377.anInt859 = -1;
        ColorTagNode.method2811(false);
    }

    public static void method2171(int i) {
        if (i != 0) method2172(-6);
        anIntArray6296 = null;
    }

    final void method2140(AbstractGlTexture class258, byte i, int i_1_) {
        anInt6303++;
        this.aHa_Sub2_3684.bindTexture((byte) -86, class258);
        this.aHa_Sub2_3684.setTextureEnvMode(0, i_1_);
        if (i >= -89) method2172(12);
    }

    static final void method2172(int i) {
        int i_2_ = 27 / ((i - -12) / 57);
        anInt6295++;
        if (ToolkitFactory.anApplet1530 != null) {
            try {
                String string = ToolkitFactory.anApplet1530.getParameter("cookiehost");
                int i_3_ = (int) (Component240.currentTimeMillis(-74) / 86400000L) - 11745;
                String string_4_ = ("usrdob=" + i_3_ + "; version=1; path=/; domain=" + string);
                AppletInvoker.invokeApplet(ToolkitFactory.anApplet1530, -15092, "document.cookie=\"" + string_4_ + "\"");
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    CookieManager(GlToolkitSub2 var_ha_Sub2) {
        super(var_ha_Sub2);
        if (var_ha_Sub2.aBoolean7863) {
            aClass61_6302 = new Component128(var_ha_Sub2, 2);
            aClass61_6302.beginDisplayList((byte) 123, 0);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
            this.aHa_Sub2_3684.glTexEnvi(34165, (byte) -35, 7681);
            this.aHa_Sub2_3684.glTexEnvCombine(34168, 770, (byte) -87, 2);
            this.aHa_Sub2_3684.glTexEnvCombineMode(false, 0, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
            aClass61_6302.endDisplayList(-1);
            aClass61_6302.beginDisplayList((byte) 126, 1);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
            this.aHa_Sub2_3684.glTexEnvi(8448, (byte) -73, 8448);
            this.aHa_Sub2_3684.glTexEnvCombine(34166, 770, (byte) -87, 2);
            this.aHa_Sub2_3684.glTexEnvCombineMode(false, 0, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
            aClass61_6302.endDisplayList(-1);
        }
    }

    final void method2139(boolean bool, byte i) {
        anInt6298++;
        int i_5_ = 94 / ((i - -60) / 38);
        this.aHa_Sub2_3684.glTexEnvi(8448, (byte) -28, 7681);
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
            AssetCacheLoader.anInt383--;
            if (AssetCacheLoader.anInt383 == 0) RunescapeInfo.anIntArray179 = null;
        }
        if (bool_6_) {
            DefinitionSub26.anInt9346--;
            if (DefinitionSub26.anInt9346 == 0) Component380.anIntArray4983 = null;
        }
    }

    final void method2134(boolean bool, boolean bool_8_) {
        if (bool_8_ != false) method2171(85);
        anInt6293++;
        GlFramebufferTexture class258_sub2 = this.aHa_Sub2_3684.method3741(444720536);
        if (aClass61_6302 != null && class258_sub2 != null && bool) {
            aClass61_6302.callDisplayList('\0', 28666);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
            this.aHa_Sub2_3684.bindTexture((byte) -77, class258_sub2);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(this.aHa_Sub2_3684.aClass101_Sub3_7767.method945(true), 0);
            OpenGL.glMatrixMode(5888);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
            aBoolean6301 = true;
        } else this.aHa_Sub2_3684.glTexEnvCombineMode(false, 0, 770, 34168);
    }

    final void method2136(int i, int i_9_, byte i_10_) {
        anInt6305++;
        if (i_10_ > -42) aBoolean6301 = false;
    }
}
