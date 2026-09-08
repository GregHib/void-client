/* Component19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Component19
/**
 * RENAMED from `Class14_Sub1` (JODE-obfuscated).
 * Evidence: subclass of DisplayModeManagerContainer194 (hierarchy)
 */ extends DisplayModeManagerContainer194 implements Interface18_Impl3 {
    private int anInt8604;
    static String aString8605 = null;
    static int anInt8606;
    static int anInt8607;
    static int anInt8608;
    static int anInt8609;
    static int anInt8610;
    static int anInt8611;
    private int anInt8612;
    static int anInt8613;
    static int anInt8614;
    static int anInt8615;
    static int anInt8616;
    static int anInt8617;
    static int anInt8618;

    public final float method71(byte i, float f) {
        anInt8606++;
        if (i >= -24) method242(false);
        return f / (float) anInt8604;
    }

    Component19(GlExtensionManager class377, int i, int i_0_, boolean bool, int[] is, int i_1_, int i_2_) {
        super(class377, 3553, Component83.aClass304_1662, Component342.aClass68_1183, i * i_0_, bool);
        try {
            anInt8612 = i;
            anInt8604 = i_0_;
            this.aClass377_5082.setActiveTexture((byte) 79, this);
            if (bool && i_2_ == 0 && i_1_ == 0) this.method233(i, i_0_, is, this.anInt5093, 255);
            else {
                OpenGL.glPixelStorei(3314, i_2_);
                OpenGL.glTexImage2Di(this.anInt5093, 0, 6408, anInt8612, anInt8604, 0, 32993, this.aClass377_5082.anInt9918, is, 4 * i_1_);
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bm.<init>(" + (class377 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ')'));
        }
    }

    static final void method239(byte i, int i_3_, int i_4_, DisplayModeManagerContainer57 class46) {
        anInt8610++;
        if (class46.xMode != 0) {
            if (class46.xMode == 1) class46.absoluteX = ((-class46.width + i_3_) / 2 + class46.relativeX);
            else if (class46.xMode != 2) {
                if (class46.xMode != 3) {
                    if (class46.xMode != 4) class46.absoluteX = (-class46.width + i_3_ + -(i_3_ * class46.relativeX >> 14));
                    else class46.absoluteX = ((-class46.width + i_3_) / 2 - -(i_3_ * class46.relativeX >> 14));
                } else class46.absoluteX = i_3_ * class46.relativeX >> 14;
            } else class46.absoluteX = (-class46.relativeX + (-class46.width + i_3_));
        } else class46.absoluteX = class46.relativeX;
        int i_5_ = 83 % ((i - 50) / 50);
        if (class46.yMode != 0) {
            if (class46.yMode == 1) class46.absoluteY = ((i_4_ + -class46.height) / 2 - -class46.relativeY);
            else if (class46.yMode == 2) class46.absoluteY = (i_4_ - class46.height - class46.relativeY);
            else if (class46.yMode != 3) {
                if (class46.yMode != 4) class46.absoluteY = (-(i_4_ * class46.relativeY >> 14) + (i_4_ + -class46.height));
                else class46.absoluteY = ((i_4_ * class46.relativeY >> 14) + (-class46.height + i_4_) / 2);
            } else class46.absoluteY = class46.relativeY * i_4_ >> 14;
        } else class46.absoluteY = class46.relativeY;
        if (DisplayModeManagerContainer356.aBoolean6327 && (client.getComponentSettings(class46).optionFlags != 0 || class46.type == 0)) {
            if (class46.absoluteY < 0) class46.absoluteY = 0;
            else if (i_4_ < (class46.height + class46.absoluteY)) class46.absoluteY = i_4_ - class46.height;
            if (class46.absoluteX >= 0) {
                if (i_3_ < (class46.absoluteX - -class46.width)) class46.absoluteX = i_3_ + -class46.width;
            } else class46.absoluteX = 0;
        }
    }

    Component19(GlExtensionManager class377, DisplayModeManagerContainer42 class304, int i, int i_6_, boolean bool, byte[] is, int i_7_, int i_8_) {
        super(class377, 3553, class304, Component342.aClass68_1183, i_6_ * i, bool);
        try {
            anInt8612 = i;
            anInt8604 = i_6_;
            this.aClass377_5082.setActiveTexture((byte) -102, this);
            OpenGL.glPixelStorei(3317, 1);
            if (!bool || i_8_ != 0 || i_7_ != 0) {
                OpenGL.glPixelStorei(3314, i_8_);
                OpenGL.glTexImage2Dub(this.anInt5093, 0, this.method228(109), i, i_6_, 0, (ParametricDefinition.method3055(121, this.aClass304_5084)), 5121, is, i_7_);
                OpenGL.glPixelStorei(3314, 0);
            } else this.method230(7365, i, is, i_6_, this.anInt5093);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bm.<init>(" + (class377 != null ? "{...}" : "null") + ',' + (class304 != null ? "{...}" : "null") + ',' + i + ',' + i_6_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_7_ + ',' + i_8_ + ')'));
        }
    }

    public final float method67(float f, int i) {
        anInt8611++;
        if (i <= 69) method72(84);
        return f / (float) anInt8612;
    }

    final void method240(int i, byte i_9_, float[] fs, DisplayModeManagerContainer42 class304, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
        try {
            int i_15_ = 108 / ((-45 - i_9_) / 49);
            anInt8614++;
            this.aClass377_5082.setActiveTexture((byte) -106, this);
            OpenGL.glPixelStorei(3314, i);
            OpenGL.glTexSubImage2Df(this.anInt5093, 0, i_12_, i_10_, i_13_, i_14_, ParametricDefinition.method3055(106, class304), 5121, fs, i_11_);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bm.CA(" + i + ',' + i_9_ + ',' + (fs != null ? "{...}" : "null") + ',' + (class304 != null ? "{...}" : "null") + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
        }
    }

    static final void method241(byte i) {
        anInt8617++;
        int i_16_ = NodeSub35.anInt6981 * 512 + 256;
        int i_17_ = 512 * Component300.anInt3550 + 256;
        int i_18_ = (Component300.method2064(i_16_, Component117.anInt4372, 11219, i_17_) + -HashNodeSub4.anInt9515);
        if (GlFramebufferTexture.anInt8537 >= 100) {
            Component317.anInt8685 = 256 + 512 * Component300.anInt3550;
            WaterSurfaceShader.anInt6246 = NodeSub35.anInt6981 * 512 + 256;
            DisplayModeManagerContainer50.anInt3855 = (Component300.method2064(WaterSurfaceShader.anInt6246, Component117.anInt4372, 11219, Component317.anInt8685) + -HashNodeSub4.anInt9515);
        } else {
            if (WaterSurfaceShader.anInt6246 < i_16_) {
                WaterSurfaceShader.anInt6246 += (DefinitionSub31.anInt9406 + (GlFramebufferTexture.anInt8537 * (i_16_ + -WaterSurfaceShader.anInt6246) / 1000));
                if (i_16_ < WaterSurfaceShader.anInt6246) WaterSurfaceShader.anInt6246 = i_16_;
            }
            if (WaterSurfaceShader.anInt6246 > i_16_) {
                WaterSurfaceShader.anInt6246 -= (DefinitionSub31.anInt9406 - -(GlFramebufferTexture.anInt8537 * (-i_16_ + WaterSurfaceShader.anInt6246) / 1000));
                if (WaterSurfaceShader.anInt6246 < i_16_) WaterSurfaceShader.anInt6246 = i_16_;
            }
            if (DisplayModeManagerContainer50.anInt3855 < i_18_) {
                DisplayModeManagerContainer50.anInt3855 += ((-DisplayModeManagerContainer50.anInt3855 + i_18_) * GlFramebufferTexture.anInt8537 / 1000) + DefinitionSub31.anInt9406;
                if (i_18_ < DisplayModeManagerContainer50.anInt3855) DisplayModeManagerContainer50.anInt3855 = i_18_;
            }
            if (Component317.anInt8685 < i_17_) {
                Component317.anInt8685 += (DefinitionSub31.anInt9406 - -((i_17_ + -Component317.anInt8685) * GlFramebufferTexture.anInt8537 / 1000));
                if (Component317.anInt8685 > i_17_) Component317.anInt8685 = i_17_;
            }
            if (i_18_ < DisplayModeManagerContainer50.anInt3855) {
                DisplayModeManagerContainer50.anInt3855 -= ((DisplayModeManagerContainer50.anInt3855 - i_18_) * GlFramebufferTexture.anInt8537 / 1000) + DefinitionSub31.anInt9406;
                if (i_18_ > DisplayModeManagerContainer50.anInt3855) DisplayModeManagerContainer50.anInt3855 = i_18_;
            }
            if (Component317.anInt8685 > i_17_) {
                Component317.anInt8685 -= (DefinitionSub31.anInt9406 + ((Component317.anInt8685 - i_17_) * GlFramebufferTexture.anInt8537 / 1000));
                if (i_17_ > Component317.anInt8685) Component317.anInt8685 = i_17_;
            }
        }
        i_17_ = 256 + Component337.anInt3647 * 512;
        i_16_ = 256 + 512 * Component48.anInt4336;
        i_18_ = (Component300.method2064(i_16_, Component117.anInt4372, 11219, i_17_) - Component221.anInt1797);
        int i_19_ = -WaterSurfaceShader.anInt6246 + i_16_;
        int i_20_ = -DisplayModeManagerContainer50.anInt3855 + i_18_;
        int i_21_ = -Component317.anInt8685 + i_17_;
        int i_22_ = (int) Math.sqrt(i_19_ * i_19_ - -(i_21_ * i_21_));
        int i_23_ = ((int) (Math.atan2(i_20_, i_22_) * 2607.5945876176133) & 0x3fff);
        if (i < 126) aString8605 = null;
        if (i_23_ < 1024) i_23_ = 1024;
        int i_24_ = 0x3fff & (int) (-2607.5945876176133 * Math.atan2(i_19_, i_21_));
        if (i_23_ > 3072) i_23_ = 3072;
        if (i_23_ > HashNodeSub19.anInt9701) {
            HashNodeSub19.anInt9701 += (Component205.anInt5973 * (i_23_ - HashNodeSub19.anInt9701 >> 3) / 1000) + OpenGlShader.anInt7403 << 3;
            if (i_23_ < HashNodeSub19.anInt9701) HashNodeSub19.anInt9701 = i_23_;
        }
        if (HashNodeSub19.anInt9701 > i_23_) {
            HashNodeSub19.anInt9701 -= (((-i_23_ + HashNodeSub19.anInt9701 >> 3) * Component205.anInt5973 / 1000) + OpenGlShader.anInt7403) << 3;
            if (HashNodeSub19.anInt9701 < i_23_) HashNodeSub19.anInt9701 = i_23_;
        }
        int i_25_ = -Component298.anInt4638 + i_24_;
        if (i_25_ > 8192) i_25_ -= 16384;
        if (i_25_ < -8192) i_25_ += 16384;
        i_25_ >>= 3;
        if (i_25_ > 0) {
            Component298.anInt4638 += (OpenGlShader.anInt7403 + Component205.anInt5973 * i_25_ / 1000) << 3;
            Component298.anInt4638 &= 0x3fff;
        }
        if (i_25_ < 0) {
            Component298.anInt4638 -= OpenGlShader.anInt7403 - -(-i_25_ * Component205.anInt5973 / 1000) << 3;
            Component298.anInt4638 &= 0x3fff;
        }
        int i_26_ = i_24_ - Component298.anInt4638;
        if (i_26_ > 8192) i_26_ -= 16384;
        if (i_26_ < -8192) i_26_ += 16384;
        Component103.anInt4186 = 0;
        if (i_26_ < 0 && i_25_ > 0 || i_26_ > 0 && i_25_ < 0) Component298.anInt4638 = i_24_;
    }

    public final void method70(int i, int i_27_, byte i_28_, int i_29_, int i_30_, int i_31_, int i_32_, byte[] is, DisplayModeManagerContainer42 class304) {
        try {
            anInt8608++;
            this.aClass377_5082.setActiveTexture((byte) -24, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, i_29_);
            OpenGL.glTexSubImage2Dub(this.anInt5093, 0, i_32_, i, i_31_, i_30_, ParametricDefinition.method3055(103, class304), 5121, is, i_27_);
            if (i_28_ >= -4) anInt8612 = 33;
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bm.T(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + (is != null ? "{...}" : "null") + ',' + (class304 != null ? "{...}" : "null") + ')'));
        }
    }

    public final void method65(int i, int[] is, int i_33_, int i_34_, int i_35_, byte i_36_, int i_37_) {
        anInt8613++;
        int[] is_38_ = new int[anInt8612 * anInt8604];
        this.aClass377_5082.setActiveTexture((byte) -32, this);
        OpenGL.glGetTexImagei(this.anInt5093, 0, 32993, 5121, is_38_, 0);
        if (i_36_ == 112) {
            for (int i_39_ = 0; i_35_ > i_39_; i_39_++)
                Component313.method1578(is_38_, ((-i_39_ + i_35_ + (-1 + i_34_)) * anInt8612), is, i_33_ * i_39_ + i_37_, i_33_);
        }
    }

    public final int method69(boolean bool) {
        anInt8607++;
        if (bool != false) return -121;
        return anInt8612;
    }

    public final int method72(int i) {
        anInt8609++;
        int i_40_ = -48 / ((55 - i) / 63);
        return anInt8604;
    }

    public final boolean method73(int i) {
        anInt8618++;
        return i >= 84;
    }

    public static void method242(boolean bool) {
        if (bool == true) aString8605 = null;
    }

    public final void method68(int i, int i_41_, int[] is, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
        this.aClass377_5082.setActiveTexture((byte) -116, this);
        if (i_41_ != 22809) aString8605 = null;
        anInt8616++;
        OpenGL.glPixelStorei(3314, i);
        OpenGL.glTexSubImage2Di(this.anInt5093, 0, i_42_, i_45_, i_44_, i_46_, 32993, (this.aClass377_5082.anInt9918), is, i_43_);
        OpenGL.glPixelStorei(3314, 0);
    }

    Component19(GlExtensionManager class377, DisplayModeManagerContainer42 class304, Component342 class68, int i, int i_47_) {
        super(class377, 3553, class304, class68, i_47_ * i, false);
        try {
            anInt8612 = i;
            anInt8604 = i_47_;
            this.aClass377_5082.setActiveTexture((byte) 110, this);
            OpenGL.glTexImage2Dub(this.anInt5093, 0, this.method228(113), i, i_47_, 0, ParametricDefinition.method3055(113, this.aClass304_5084), Component387.method1128(-112, this.aClass68_5088), null, 0);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bm.<init>(" + (class377 != null ? "{...}" : "null") + ',' + (class304 != null ? "{...}" : "null") + ',' + (class68 != null ? "{...}" : "null") + ',' + i + ',' + i_47_ + ')'));
        }
    }

    public final void method66(boolean bool, boolean bool_48_, int i) {
        this.aClass377_5082.setActiveTexture((byte) -29, this);
        anInt8615++;
        OpenGL.glTexParameteri(this.anInt5093, 10242, !bool ? 33071 : 10497);
        OpenGL.glTexParameteri(this.anInt5093, 10243, !bool_48_ ? 33071 : 10497);
        if (i != 25688) anInt8604 = -90;
    }

    Component19(GlExtensionManager class377, DisplayModeManagerContainer42 class304, int i, int i_49_, boolean bool, float[] fs, int i_50_, int i_51_) {
        super(class377, 3553, class304, Component342.aClass68_1187, i * i_49_, bool);
        try {
            anInt8612 = i;
            anInt8604 = i_49_;
            this.aClass377_5082.setActiveTexture((byte) -67, this);
            if (bool || i_51_ != 0 || i_50_ != 0) {
                OpenGL.glPixelStorei(3314, i_51_);
                OpenGL.glTexImage2Df(this.anInt5093, 0, this.method228(111), i, i_49_, 0, (ParametricDefinition.method3055(106, this.aClass304_5084)), 5126, fs, 4 * i_50_);
                OpenGL.glPixelStorei(3314, 0);
            } else this.method238(this.anInt5093, 1, i, fs, i_49_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bm.<init>(" + (class377 != null ? "{...}" : "null") + ',' + (class304 != null ? "{...}" : "null") + ',' + i + ',' + i_49_ + ',' + bool + ',' + (fs != null ? "{...}" : "null") + ',' + i_50_ + ',' + i_51_ + ')'));
        }
    }
}
