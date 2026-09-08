/* SoftwareFallbackShader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class367_Sub10` (JODE-obfuscated).
 * Software fallback shader. Extends AbstractShader; used when the native toolkit falls back to software rendering (logged as 'void-osrs: toolkit ... -> software (macOS)').
 */

final class SoftwareFallbackShader extends AbstractShader {
    static int anInt7381;
    static CacheStore aClass45_7382;
    static int anInt7383;
    static int anInt7384;
    private boolean aBoolean7385 = false;
    static int anInt7386;
    static int anInt7387;
    static int anInt7388;
    static int anInt7389;

    final void method3527(int i, Interface18 interface18, int i_0_) {
        this.aHa_Sub3_4479.setActiveTexture((byte) 79, interface18);
        if (i_0_ != -16776) aBoolean7385 = false;
        anInt7381++;
        this.aHa_Sub3_4479.swapInterval2(true, i);
    }

    static final void method3553(boolean bool, byte i, int i_1_) {
        if (i <= 98) method3553(true, (byte) 34, 120);
        // Toolkit 1 = OpenGL (GlToolkitSub2), 2 = SW3D (libsw3d). Both break JAWT on macOS.
        if ((i_1_ == 1 || i_1_ == 2) && Loader.isMacOs()) {
            Component85.aBoolean2881 = true;
            Component301.aBoolean4117 = true;
            System.out.println("void-osrs: toolkit " + i_1_ + " → software (macOS)");
            i_1_ = 0;
        }
        GlRectangleTexture.method1971(-2, FriendsIgnoreList.aClass274_3495.getLocalized(ObjectDeserializer.languageId, 544), bool, i_1_);
        anInt7388++;
    }

    final void method3525(int i, boolean bool) {
        anInt7384++;
        Interface18_Impl2 interface18_impl2 = this.aHa_Sub3_4479.deleteFramebuffer(-16777216);
        if (i != 15192) aBoolean7385 = false;
        if (interface18_impl2 != null && bool) {
            this.aHa_Sub3_4479.setActiveTextureUnit(1, i + -19574);
            this.aHa_Sub3_4479.setActiveTexture((byte) 96, interface18_impl2);
            this.aHa_Sub3_4479.getTexParameter(DisplayModeManagerContainer1.aClass113_3314, i + -15192);
            this.aHa_Sub3_4479.setActiveTextureUnit(1, -4382);
            this.aHa_Sub3_4479.texStorage3D(ShaderCompilerSub3.aClass229_6519, 104, Component253.aClass229_3196);
            this.aHa_Sub3_4479.getSwapInterval(true, false, 2, (DisplayModeManagerContainer343.aClass70_8737), false);
            this.aHa_Sub3_4479.setTextureEnvironment(0, true, DebugPanicSub2.aClass70_8503);
            MatrixSub2 class101_sub2 = this.aHa_Sub3_4479.getUniformLocation(false);
            class101_sub2.method926(i + -30891, this.aHa_Sub3_4479.genBuffers((byte) -44));
            this.aHa_Sub3_4479.deleteVertexArrays(i ^ ~0x3b47, DefinitionSub38.aClass251_9477);
            this.aHa_Sub3_4479.setActiveTextureUnit(0, -4382);
            aBoolean7385 = true;
        } else this.aHa_Sub3_4479.setTextureEnvironment(0, true, DebugPanicSub2.aClass70_8503);
    }

    public static void method3554(int i) {
        if (i != 1) aClass45_7382 = null;
        aClass45_7382 = null;
    }

    final void method3520(byte i) {
        if (i != 87) aClass45_7382 = null;
        anInt7386++;
        if (aBoolean7385) {
            this.aHa_Sub3_4479.setActiveTextureUnit(1, -4382);
            this.aHa_Sub3_4479.getTexParameter(Component324.aClass113_2047, i ^ 0x57);
            this.aHa_Sub3_4479.texStorage3D(Component385.aClass229_2207, 103, (Component385.aClass229_2207));
            this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 2, DefinitionSub39.aClass70_9485);
            this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer173.aClass70_4247);
            this.aHa_Sub3_4479.getProgramInfoLog(-8629);
            this.aHa_Sub3_4479.setActiveTexture((byte) -111, null);
            this.aHa_Sub3_4479.setActiveTextureUnit(0, -4382);
            aBoolean7385 = false;
        } else this.aHa_Sub3_4479.setTextureEnvironment(0, true, DisplayModeManagerContainer173.aClass70_4247);
        this.aHa_Sub3_4479.texStorage3D(Component385.aClass229_2207, i ^ 0x2c, Component385.aClass229_2207);
    }

    final void method3526(int i, int i_2_, int i_3_) {
        anInt7389++;
        if (i != 10756) aBoolean7385 = false;
    }

    final boolean method3530(int i) {
        anInt7387++;
        if (i > -57) aClass45_7382 = null;
        return true;
    }

    final void method3521(boolean bool, byte i) {
        if (i == -103) {
            anInt7383++;
            this.aHa_Sub3_4479.texStorage3D(ShaderCompilerSub3.aClass229_6519, 99, Component385.aClass229_2207);
        }
    }

    SoftwareFallbackShader(GlToolkitSub3 var_ha_Sub3) {
        super(var_ha_Sub3);
    }
}
