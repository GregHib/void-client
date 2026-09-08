/* OpenGlShader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class367_Sub11` (JODE-obfuscated).
 * OpenGL implementation of AbstractShader. Imports jaggl.OpenGL; builds GL shader state (Interface18_Impl3, Component321) for the OpenGL toolkit.
 */

import jaggl.OpenGL;

import java.awt.*;

final class OpenGlShader extends AbstractShader {
    private Interface18_Impl3 anInterface18_Impl3_7390;
    private final boolean aBoolean7391;
    private Component321 aClass193_7392;
    static int anInt7393;
    static byte[] aByteArray7394;
    private Component321 aClass193_7395;
    /**
     * Monotonic client cycle — incremented once per {@link client#processGameTick}
     * while not in fatal state 14. Frame-rate coupled (not RS server tick).
     */
    public static int clientCycle = 0;
    static int[] anIntArray7397 = new int[4096];
    static Component183 aClass114_7398 = new Component183(16, 6);
    private boolean aBoolean7399 = false;
    static int anInt7400;
    static int anInt7401;
    static int anInt7402;
    static int anInt7403;
    private Component321 aClass193_7404;
    static int anInt7405;
    private boolean aBoolean7406;
    private Component321 aClass193_7407;
    static int anInt7408;
    static int anInt7409;
    static int anInt7410;
    private boolean aBoolean7411;
    static int anInt7412;
    private final float[] aFloatArray7413 = new float[4];
    static int anInt7414;
    static Component299 aClass32_7415 = new Component299(8);

    final void method3528(int i) {
        if (i <= 45) method3557(true);
        anInt7401++;
        int i_0_ = this.aHa_Sub3_4479.setWindowSize(102);
        MatrixSub2 class101_sub2 = this.aHa_Sub3_4479.uniform2f((byte) 98);
        if (!aBoolean7411) OpenGL.glBindProgramARB(34336, (i_0_ != 2147483647 ? aClass193_7404.anInt2584 : aClass193_7395.anInt2584));
        else OpenGL.glBindProgramARB(34336, (i_0_ == 2147483647 ? aClass193_7392.anInt2584 : aClass193_7407.anInt2584));
        OpenGL.glEnable(34336);
        aBoolean7406 = true;
        class101_sub2.method919(0.0F, aFloatArray7413, -1.0F, 0.0F, (float) i_0_, (byte) -120);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray7413[0], aFloatArray7413[1], aFloatArray7413[2], aFloatArray7413[3]);
        method3522(-16252);
    }

    final boolean method3530(int i) {
        anInt7414++;
        if (i > -57) return false;
        return aBoolean7391;
    }

    final void method3520(byte i) {
        anInt7408++;
        this.aHa_Sub3_4479.setActiveTextureUnit(1, -4382);
        this.aHa_Sub3_4479.setActiveTexture((byte) -128, null);
        this.aHa_Sub3_4479.texStorage3D(Component385.aClass229_2207, 116, Component385.aClass229_2207);
        this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DisplayModeManagerContainer173.aClass70_4247);
        this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 2, DefinitionSub39.aClass70_9485);
        this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer173.aClass70_4247);
        this.aHa_Sub3_4479.setActiveTextureUnit(0, -4382);
        if (aBoolean7399) {
            this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DisplayModeManagerContainer173.aClass70_4247);
            this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer173.aClass70_4247);
            aBoolean7399 = false;
        }
        if (i != 87) aClass32_7415 = null;
        if (aBoolean7406) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            aBoolean7406 = false;
        }
    }

    final void method3526(int i, int i_1_, int i_2_) {
        if (i != 10756) method3527(113, null, 113);
        anInt7402++;
    }

    final void method3527(int i, Interface18 interface18, int i_3_) {
        if (interface18 != null) {
            if (aBoolean7399) {
                this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DisplayModeManagerContainer173.aClass70_4247);
                this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer173.aClass70_4247);
                aBoolean7399 = false;
            }
            this.aHa_Sub3_4479.setActiveTexture((byte) -122, interface18);
            this.aHa_Sub3_4479.swapInterval2(true, i);
        } else if (!aBoolean7399) {
            this.aHa_Sub3_4479.setActiveTexture((byte) 99, (this.aHa_Sub3_4479.anInterface18_8147));
            this.aHa_Sub3_4479.swapInterval2(true, 1);
            this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DisplayModeManagerContainer343.aClass70_8737);
            this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer343.aClass70_8737);
            aBoolean7399 = true;
        }
        if (i_3_ != -16776) method3525(16, true);
        anInt7409++;
    }

    final void method3522(int i) {
        if (i != -16252) aBoolean7411 = true;
        if (aBoolean7406) {
            int i_4_ = this.aHa_Sub3_4479.XA();
            int i_5_ = this.aHa_Sub3_4479.i();
            float f = (float) i_4_ - 0.125F * (float) (-i_5_ + i_4_);
            float f_6_ = -(0.25F * (float) (-i_5_ + i_4_)) + (float) i_4_;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, f_6_, f, 1.0F / (float) this.aHa_Sub3_4479.checkFramebufferStatus((byte) -58), (float) this.aHa_Sub3_4479.bufferData((byte) -70) / 255.0F);
            this.aHa_Sub3_4479.setActiveTextureUnit(1, -4382);
            this.aHa_Sub3_4479.uniformMatrix4fv(-28186, this.aHa_Sub3_4479.drawElementsInstanced(-104));
            this.aHa_Sub3_4479.setActiveTextureUnit(0, -4382);
        }
        anInt7412++;
    }

    static final void method3555(CacheStore class45, int i, boolean bool, long l, int i_7_, int i_8_, int i_9_) {
        try {
            anInt7410++;
            Component100.method2260(i_9_, i_8_, l, 0, bool, class45, (byte) 126, i_7_);
            int i_10_ = -35 / ((-41 - i) / 38);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("or.Q(" + (class45 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + l + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
        }
    }

    static final void method3556(boolean bool) {
        anInt7405++;
        if (bool == false) {
            synchronized (NpcComposition.aClient1367) {
                if (Component225.aFrame476 == null) {
                    Container container;
                    if (RSACipher.aFrame4904 != null) container = RSACipher.aFrame4904;
                    else if (ToolkitFactory.anApplet1530 == null) container = DefinitionSub9.anApplet_Sub1_9169;
                    else container = ToolkitFactory.anApplet1530;
                    SocketConnector.canvasWidth = container.getSize().width;
                    NpcNode.canvasHeight = container.getSize().height;
                    if (RSACipher.aFrame4904 == container) {
                        Insets insets = RSACipher.aFrame4904.getInsets();
                        SocketConnector.canvasWidth -= insets.left - -insets.right;
                        NpcNode.canvasHeight -= insets.bottom + insets.top;
                    }
                    if (MenuEntry.getWindowMode(-86) == 1) {
                        DisplayModeManagerContainer23.canvasWidth = SocketConnector.canvasWidth;
                        GlToolkitSub2.canvasHeight = NpcNode.canvasHeight;
                        Component236.canvasWidth = SocketConnector.canvasWidth;
                        PacketReader.canvasHeight = NpcNode.canvasHeight;
                        NodeSub48.perFrameReset = 0;
                        DisplayModeManagerContainer147.perDrawReset = 0;
                    } else SpriteAtlasShader.method2158((byte) 56);
                    if (Component326.LIVE != DisplayModeManagerContainer345.aClass364_165) {
                        if (Component236.canvasWidth < 1024 && PacketReader.canvasHeight < 768) {
                            /* empty */
                        }
                    }
                    DisplayModeManagerContainer50.gameCanvas.setSize(Component236.canvasWidth, (PacketReader.canvasHeight));
                    if (NodeSub8.toolkit != null) {
                        if (Component210.gameCanvasAttached) s.method3980(120, DisplayModeManagerContainer50.gameCanvas);
                        else NodeSub8.toolkit.method3669(DisplayModeManagerContainer50.gameCanvas, Component236.canvasWidth, PacketReader.canvasHeight);
                    }
                    if (RSACipher.aFrame4904 == container) {
                        Insets insets = RSACipher.aFrame4904.getInsets();
                        DisplayModeManagerContainer50.gameCanvas.setLocation(insets.left - -NodeSub48.perFrameReset, DisplayModeManagerContainer147.perDrawReset + insets.top);
                    } else DisplayModeManagerContainer50.gameCanvas.setLocation((NodeSub48.perFrameReset), DisplayModeManagerContainer147.perDrawReset);
                    if (r.anInt9721 != -1) Component339.method1713(true, 520);
                    Component211.method1170((byte) -78);
                } else {
                    /* empty */
                }
            }
        }
    }

    OpenGlShader(GlExtensionManager class377, CacheStore class45) {
        super(class377);
        try {
            if (class45 != null && class377.aBoolean9923) {
                aClass193_7395 = NodeBaseSub2.method3442(34336, class45.getFile("gl", "uw_ground_unlit", -29832), class377, 4);
                aClass193_7392 = NodeBaseSub2.method3442(34336, class45.getFile("gl", "uw_ground_lit", -29832), class377, 4);
                aClass193_7404 = NodeBaseSub2.method3442(34336, class45.getFile("gl", "uw_model_unlit", -29832), class377, 4);
                aClass193_7407 = NodeBaseSub2.method3442(34336, class45.getFile("gl", "uw_model_lit", -29832), class377, 4);
                if (aClass193_7395 != null & aClass193_7392 != null & aClass193_7404 != null & aClass193_7407 != null) {
                    anInterface18_Impl3_7390 = this.aHa_Sub3_4479.deleteRenderbuffer(1, 2, -15137, false, (new int[]{0, -1}));
                    anInterface18_Impl3_7390.method66(false, false, 25688);
                    aBoolean7391 = true;
                } else aBoolean7391 = false;
            } else aBoolean7391 = false;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("or.<init>(" + (class377 != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method3557(boolean bool) {
        anIntArray7397 = null;
        aClass32_7415 = null;
        if (bool == true) {
            aClass114_7398 = null;
            aByteArray7394 = null;
        }
    }

    final void method3525(int i, boolean bool) {
        anInt7400++;
        aBoolean7411 = bool;
        this.aHa_Sub3_4479.setActiveTextureUnit(1, i ^ ~0x2a45);
        this.aHa_Sub3_4479.setActiveTexture((byte) -32, anInterface18_Impl3_7390);
        this.aHa_Sub3_4479.texStorage3D((ShaderCompilerSub3.aClass229_6519), 109, Component253.aClass229_3196);
        this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DefinitionSub39.aClass70_9485);
        if (i == 15192) {
            this.aHa_Sub3_4479.getSwapInterval(true, false, 2, DisplayModeManagerContainer173.aClass70_4247, false);
            this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer343.aClass70_8737);
            this.aHa_Sub3_4479.setActiveTextureUnit(0, i + -19574);
            method3528(75);
        }
    }

    final void method3521(boolean bool, byte i) {
        anInt7393++;
        if (i != -103) aClass193_7392 = null;
    }
}
