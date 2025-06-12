/* Class367_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.awt.*;

final class Class367_Sub11 extends Class367 {
    private Interface18_Impl3 anInterface18_Impl3_7390;
    private final boolean aBoolean7391;
    private Class193 aClass193_7392;
    static int anInt7393;
    static byte[] aByteArray7394;
    private Class193 aClass193_7395;
    public static int anInt7396 = 0;
    static int[] anIntArray7397 = new int[4096];
    static Class114 aClass114_7398 = new Class114(16, 6);
    private boolean aBoolean7399 = false;
    static int anInt7400;
    static int anInt7401;
    static int anInt7402;
    static int anInt7403;
    private Class193 aClass193_7404;
    static int anInt7405;
    private boolean aBoolean7406;
    private Class193 aClass193_7407;
    static int anInt7408;
    static int anInt7409;
    static int anInt7410;
    private boolean aBoolean7411;
    static int anInt7412;
    private final float[] aFloatArray7413 = new float[4];
    static int anInt7414;
    static Class32 aClass32_7415 = new Class32(8);

    final void method3528(int i) {
        if (i <= 45) method3557(true);
        anInt7401++;
        int i_0_ = this.aHa_Sub3_4479.method3941(102);
        Class101_Sub2 class101_sub2 = this.aHa_Sub3_4479.method3887((byte) 98);
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
        this.aHa_Sub3_4479.method3897(1, -4382);
        this.aHa_Sub3_4479.method3850((byte) -128, null);
        this.aHa_Sub3_4479.method3874(Class167.aClass229_2207, 116, Class167.aClass229_2207);
        this.aHa_Sub3_4479.method3849((byte) 47, 0, Class342.aClass70_4247);
        this.aHa_Sub3_4479.method3849((byte) 47, 2, Class348_Sub40_Sub39.aClass70_9485);
        this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247);
        this.aHa_Sub3_4479.method3897(0, -4382);
        if (aBoolean7399) {
            this.aHa_Sub3_4479.method3849((byte) 47, 0, Class342.aClass70_4247);
            this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247);
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
                this.aHa_Sub3_4479.method3849((byte) 47, 0, Class342.aClass70_4247);
                this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247);
                aBoolean7399 = false;
            }
            this.aHa_Sub3_4479.method3850((byte) -122, interface18);
            this.aHa_Sub3_4479.method3923(true, i);
        } else if (!aBoolean7399) {
            this.aHa_Sub3_4479.method3850((byte) 99, (this.aHa_Sub3_4479.anInterface18_8147));
            this.aHa_Sub3_4479.method3923(true, 1);
            this.aHa_Sub3_4479.method3849((byte) 47, 0, Class318_Sub1_Sub2.aClass70_8737);
            this.aHa_Sub3_4479.method3885(0, true, Class318_Sub1_Sub2.aClass70_8737);
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
            OpenGL.glProgramLocalParameter4fARB(34336, 0, f_6_, f, 1.0F / (float) this.aHa_Sub3_4479.method3833((byte) -58), (float) this.aHa_Sub3_4479.method3826((byte) -70) / 255.0F);
            this.aHa_Sub3_4479.method3897(1, -4382);
            this.aHa_Sub3_4479.method3894(-28186, this.aHa_Sub3_4479.method3863(-104));
            this.aHa_Sub3_4479.method3897(0, -4382);
        }
        anInt7412++;
    }

    static final void method3555(Index index, int i, boolean bool, long l, int i_7_, int i_8_, int i_9_) {
        try {
            anInt7410++;
            Class299_Sub1_Sub1.method2260(i_9_, i_8_, l, 0, bool, index, (byte) 126, i_7_);
            int i_10_ = -35 / ((-41 - i) / 38);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("or.Q(" + (index != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + l + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
        }
    }

    static final void method3556(boolean bool) {
        anInt7405++;
        if (bool == false) {
            synchronized (NPCDefinition.aClient1367) {
                if (Class34.aFrame476 == null) {
                    Container container;
                    if (Class52.aFrame4904 != null) container = Class52.aFrame4904;
                    else if (Class93.anApplet1530 == null) container = Class348_Sub40_Sub9.anApplet_Sub1_9169;
                    else container = Class93.anApplet1530;
                    Class272.anInt3473 = container.getSize().width;
                    Class348_Sub22.anInt6857 = container.getSize().height;
                    if (Class52.aFrame4904 == container) {
                        Insets insets = Class52.aFrame4904.getInsets();
                        Class272.anInt3473 -= insets.left - -insets.right;
                        Class348_Sub22.anInt6857 -= insets.bottom + insets.top;
                    }
                    if (Class348_Sub42_Sub12.method3229(-86) == 1) {
                        Class321.anInt4017 = Class92.anInt1524;
                        Class335.anInt4167 = 0;
                        Class348_Sub48.anInt7129 = (Class272.anInt3473 - Class92.anInt1524) / 2;
                        Class348_Sub42_Sub8_Sub2.anInt10432 = ha_Sub2.anInt7666;
                    } else Class286_Sub5.method2158((byte) 56);
                    if (Class55_Sub1.aClass364_5271 != Class8.aClass364_165) {
                        if (Class321.anInt4017 < 1024 && Class348_Sub42_Sub8_Sub2.anInt10432 < 768) {
                            /* empty */
                        }
                    }
                    Class305.aCanvas3869.setSize(Class321.anInt4017, (Class348_Sub42_Sub8_Sub2.anInt10432));
                    if (Class348_Sub8.aHa6654 != null) {
                        if (Class59_Sub1.aBoolean5300) s.method3980(120, Class305.aCanvas3869);
                        else Class348_Sub8.aHa6654.method3669(Class305.aCanvas3869, Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432);
                    }
                    if (Class52.aFrame4904 == container) {
                        Insets insets = Class52.aFrame4904.getInsets();
                        Class305.aCanvas3869.setLocation(insets.left - -Class348_Sub48.anInt7129, Class335.anInt4167 + insets.top);
                    } else Class305.aCanvas3869.setLocation((Class348_Sub48.anInt7129), Class335.anInt4167);
                    if (r.anInt9721 != -1) Class239.method1713(true, 520);
                    Class140.method1170((byte) -78);
                } else {
                    /* empty */
                }
            }
        }
    }

    Class367_Sub11(Class377 class377, Index index) {
        super(class377);
        try {
            if (index != null && class377.aBoolean9923) {
                aClass193_7395 = za_Sub2.method3442(34336, index.method391("gl", "uw_ground_unlit", -29832), class377, 4);
                aClass193_7392 = za_Sub2.method3442(34336, index.method391("gl", "uw_ground_lit", -29832), class377, 4);
                aClass193_7404 = za_Sub2.method3442(34336, index.method391("gl", "uw_model_unlit", -29832), class377, 4);
                aClass193_7407 = za_Sub2.method3442(34336, index.method391("gl", "uw_model_lit", -29832), class377, 4);
                if (aClass193_7395 != null & aClass193_7392 != null & aClass193_7404 != null & aClass193_7407 != null) {
                    anInterface18_Impl3_7390 = this.aHa_Sub3_4479.method3839(1, 2, -15137, false, (new int[]{0, -1}));
                    anInterface18_Impl3_7390.method66(false, false, 25688);
                    aBoolean7391 = true;
                } else aBoolean7391 = false;
            } else aBoolean7391 = false;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("or.<init>(" + (class377 != null ? "{...}" : "null") + ',' + (index != null ? "{...}" : "null") + ')'));
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
        this.aHa_Sub3_4479.method3897(1, i ^ ~0x2a45);
        this.aHa_Sub3_4479.method3850((byte) -32, anInterface18_Impl3_7390);
        this.aHa_Sub3_4479.method3874((Class328_Sub3.aClass229_6519), 109, Class248.aClass229_3196);
        this.aHa_Sub3_4479.method3849((byte) 47, 0, Class348_Sub40_Sub39.aClass70_9485);
        if (i == 15192) {
            this.aHa_Sub3_4479.method3924(true, false, 2, Class342.aClass70_4247, false);
            this.aHa_Sub3_4479.method3885(0, true, Class318_Sub1_Sub2.aClass70_8737);
            this.aHa_Sub3_4479.method3897(0, i + -19574);
            method3528(75);
        }
    }

    final void method3521(boolean bool, byte i) {
        anInt7393++;
        if (i != -103) aClass193_7392 = null;
    }
}
