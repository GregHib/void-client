/* SpriteAtlasShader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class286_Sub5` (JODE-obfuscated).
 * Sprite-atlas sampling shader (ShaderProgram subclass). Binds named sprite atlases (headicons_prayer, timerbar_default, hint_mapmarkers, hint_headicons) via method2159(CacheStore).
 */

import jaggl.OpenGL;

final class SpriteAtlasShader extends ShaderProgram {
    static d modelProvider;
    static int anInt6248 = -1;
    static int anInt6249;
    static int anInt6250;
    static int anInt6251;
    static int anInt6252;
    static int anInt6253;
    private final Component128 aClass61_6254;
    static int anInt6255;
    static int anInt6256;
    static int anInt6257;
    static int anInt6258;
    private final Component178 aClass83_6259;
    static int[] anIntArray6260 = new int[1];
    static int anInt6261;

    static final void method2158(byte i) {
        anInt6256++;
        if (i == 56) {
            // Always fill the container (no letterboxed max-size caps).
            DisplayModeManagerContainer147.perDrawReset = 0;
            NodeSub48.perFrameReset = 0;
            Component236.canvasWidth = SocketConnector.canvasWidth;
            PacketReader.canvasHeight = NpcNode.canvasHeight;
            DisplayModeManagerContainer23.canvasWidth = SocketConnector.canvasWidth;
            GlToolkitSub2.canvasHeight = NpcNode.canvasHeight;
        }
    }

    final void method2136(int i, int i_5_, byte i_6_) {
        anInt6252++;
        float f = -5.0E-4F * (float) (1 + (i & 0x3));
        float f_7_ = 5.0E-4F * (float) (1 + ((i & 0x18) >> 3));
        float f_8_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean bool = (i & 0x80) != 0;
        this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
        if (bool) {
            Component362.aFloatArray5791[1] = 0.0F;
            Component362.aFloatArray5791[0] = f_8_;
            Component362.aFloatArray5791[3] = 0.0F;
            Component362.aFloatArray5791[2] = 0.0F;
        } else {
            Component362.aFloatArray5791[1] = 0.0F;
            Component362.aFloatArray5791[0] = 0.0F;
            Component362.aFloatArray5791[2] = f_8_;
            Component362.aFloatArray5791[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, Component362.aFloatArray5791, 0);
        Component362.aFloatArray5791[0] = 0.0F;
        Component362.aFloatArray5791[1] = f_8_;
        Component362.aFloatArray5791[3] = (f * (float) this.aHa_Sub2_3684.anInt7735 % 1.0F);
        if (i_6_ >= -42) method2136(-27, -15, (byte) -43);
        Component362.aFloatArray5791[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, Component362.aFloatArray5791, 0);
        if (aClass83_6259.aBoolean1442) {
            Component362.aFloatArray5791[0] = 0.0F;
            Component362.aFloatArray5791[3] = (float) (this.aHa_Sub2_3684.anInt7735) * f_7_ % 1.0F;
            Component362.aFloatArray5791[2] = 0.0F;
            Component362.aFloatArray5791[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, Component362.aFloatArray5791, 0);
        } else {
            int i_9_ = (int) (16.0F * ((float) this.aHa_Sub2_3684.anInt7735 * f_7_));
            this.aHa_Sub2_3684.bindTexture((byte) -81, aClass83_6259.aClass258_Sub3Array1448[i_9_ % 16]);
        }
        this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
    }

    final void method2140(AbstractGlTexture class258, byte i, int i_10_) {
        anInt6257++;
        this.aHa_Sub2_3684.bindTexture((byte) -118, class258);
        this.aHa_Sub2_3684.setTextureEnvMode(0, i_10_);
        if (i > -89) method2140(null, (byte) 109, -112);
    }

    final void method2133(int i) {
        anInt6249++;
        aClass61_6254.callDisplayList('\001', 28666);
        this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
        this.aHa_Sub2_3684.bindTexture((byte) -113, null);
        if (i > -75) anInt6248 = -7;
        this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
    }

    SpriteAtlasShader(GlToolkitSub2 var_ha_Sub2, Component178 class83) {
        super(var_ha_Sub2);
        try {
            aClass83_6259 = class83;
            aClass61_6254 = new Component128(var_ha_Sub2, 2);
            aClass61_6254.beginDisplayList((byte) 104, 0);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
            if (aClass83_6259.aBoolean1442) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glEnable(3170);
            }
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glTexGeni(8193, 9472, 9216);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
            aClass61_6254.endDisplayList(-1);
            aClass61_6254.beginDisplayList((byte) 117, 1);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
            if (aClass83_6259.aBoolean1442) OpenGL.glDisable(3170);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
            aClass61_6254.endDisplayList(-1);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("gn.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + (class83 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method2159(byte i, CacheStore class45) {
        NpcNode.anInt6862 = class45.getGroupId("hitmarks", 0);
        anInt6258++;
        KeyStoreLoader.anInt1639 = class45.getGroupId("hitbar_default", 0);
        BasicMouseHandler.anInt7429 = class45.getGroupId("timerbar_default", 0);
        GraphicsToolkit.anInt4562 = class45.getGroupId("headicons_pk", 0);
        CommandHandler.anInt1435 = class45.getGroupId("headicons_prayer", 0);
        Component95.anInt1756 = class45.getGroupId("hint_headicons", 0);
        ReferenceTable.anInt3739 = class45.getGroupId("hint_mapmarkers", 0);
        Component328.anInt1481 = class45.getGroupId("mapflag", 0);
        Component98.anInt5948 = class45.getGroupId("cross", 0);
        Component22.anInt1742 = class45.getGroupId("mapdots", 0);
        NamedInteger.anInt4469 = class45.getGroupId("scrollbar", 0);
        DefinitionSub38.anInt9473 = class45.getGroupId("name_icons", 0);
        Component38.anInt2510 = class45.getGroupId("floorshadows", 0);
        RSACipher.anInt4895 = class45.getGroupId("compass", 0);
        if (i > -72) sleep((byte) 106, 125L);
        Component134.anInt5814 = class45.getGroupId("otherlevel", 0);
        DisplayModeManagerContainer89.anInt8370 = class45.getGroupId("hint_mapedge", 0);
    }

    final void method2134(boolean bool, boolean bool_11_) {
        anInt6250++;
        aClass61_6254.callDisplayList('\0', 28666);
        if (aClass83_6259.aBoolean1442) {
            this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
            this.aHa_Sub2_3684.bindTexture((byte) -117, (aClass83_6259.aClass258_Sub1_1446));
            this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
        }
        if (bool_11_ != false) anInt6248 = -68;
    }

    public static void method2160(int i) {
        if (i == 0) {
            modelProvider = null;
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

    /** Sleep {@code l} ms (splits multiples of 10 to dodge scheduler quirks). */
    static final void sleep(byte i, long l) {
        try {
            anInt6251++;
            if (l > 0L) {
                if (l % 10L == 0) {
                    DisplayModeManagerContainer363.sleepMillis(-125, -1L + l);
                    DisplayModeManagerContainer363.sleepMillis(-125, 1L);
                } else DisplayModeManagerContainer363.sleepMillis(59, l);
                int i_13_ = 70 % ((i - -52) / 32);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "gn.D(" + i + ',' + l + ')');
        }
    }
}
