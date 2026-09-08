/* WaterShaderProgram - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class286_Sub6` (JODE-obfuscated).
 * Environment-mapped water shader program. Extends ShaderProgram; GLSL program with envMapSampler for reflective water.
 */

import jaggl.OpenGL;

final class WaterShaderProgram extends ShaderProgram {
    /** Alternate product slot game3 ({@code id}=2). */
    static GameType GAME3 = new GameType("game3", 2);
    static int anInt6263;
    static int anInt6264;
    static int anInt6265;
    private boolean aBoolean6266;
    static int anInt6267;
    private final Component178 aClass83_6268;
    static int anInt6269;
    static boolean[] aBooleanArray6270;
    static int anInt6271;
    private boolean aBoolean6272 = false;
    static int anInt6273;
    private Component244 aClass337_6274;
    static int anInt6275;
    static long occludeCalcNanos;

    final void method2140(AbstractGlTexture class258, byte i, int i_0_) {
        if (!aBoolean6266) {
            this.aHa_Sub2_3684.bindTexture((byte) -128, class258);
            this.aHa_Sub2_3684.setTextureEnvMode(0, i_0_);
        }
        anInt6269++;
        if (i >= -89) method2140(null, (byte) -85, 27);
    }

    final void method2139(boolean bool, byte i) {
        int i_1_ = -57 / ((-60 - i) / 38);
        anInt6263++;
    }

    final boolean method2137(int i) {
        if (i >= -5) return true;
        anInt6267++;
        return false;
    }

    static final String method2162(boolean bool) {
        if (bool != false) occludeCalcNanos = -88L;
        anInt6271++;
        String string = "www";
        if (WaterShaderSub8.WTRC != DisplayModeManagerContainer345.aClass364_165) {
            if (DisplayModeManagerContainer345.aClass364_165 != AssetCacheLoader.WTQA) {
                if (DisplayModeManagerContainer345.aClass364_165 == Component83.WTWIP) string = "www-wtwip";
            } else string = "www-wtqa";
        } else string = "www-wtrc";
        String string_2_ = "";
        if (Component205.settingsCookie != null) string_2_ = "/p=" + Component205.settingsCookie;
        return ("http://" + string + "." + (PacketReader.currentGameType.domain) + ".com/l=" + ObjectDeserializer.languageId + "/a=" + Connection.affiliateId + string_2_ + "/");
    }

    static final boolean method2163(boolean bool) {
        anInt6273++;
        try {
            if (PlayerState.anInt7068 == 2) {
                if (ShaderProgram.aClass348_Sub2_3683 == null) {
                    ShaderProgram.aClass348_Sub2_3683 = NodeSub2.method2734(DisplayModeManagerContainer77.aClass45_1848, (Component197.anInt10074), Renderable.anInt3971);
                    if (ShaderProgram.aClass348_Sub2_3683 == null) return false;
                }
                if (Component258.aClass26_1977 == null) Component258.aClass26_1977 = new AssetCacheLoader(CookieBuilder.aClass45_611, Component79.aClass45_4147);
                BrowserUrlOpener class348_sub16_sub3 = Component122.aClass348_Sub16_Sub3_1564;
                if (DebugPanic.aClass348_Sub16_Sub3_4743 != null) class348_sub16_sub3 = DebugPanic.aClass348_Sub16_Sub3_4743;
                if (class348_sub16_sub3.loadDefinitions((ShaderProgram.aClass348_Sub2_3683), 22050, Component258.aClass26_1977, WaterShader.aClass45_7371, -35)) {
                    Component122.aClass348_Sub16_Sub3_1564 = class348_sub16_sub3;
                    Component122.aClass348_Sub16_Sub3_1564.flushAllDefinitions((byte) 52);
                    if (DefinitionSub35.anInt9444 <= 0) {
                        PlayerState.anInt7068 = 0;
                        Component122.aClass348_Sub16_Sub3_1564.setSampleRate(0, Component255.anInt1059);
                        for (int i = 0; i < AbstractShaderSub3.anIntArray7299.length; i++) {
                            Component122.aClass348_Sub16_Sub3_1564.setChannelPitchBendRange(AbstractShaderSub3.anIntArray7299[i], i, -7836);
                            AbstractShaderSub3.anIntArray7299[i] = 255;
                        }
                    } else {
                        PlayerState.anInt7068 = 3;
                        Component122.aClass348_Sub16_Sub3_1564.setSampleRate(0, (Math.min(Component255.anInt1059, DefinitionSub35.anInt9444)));
                        for (int i = 0; (AbstractShaderSub3.anIntArray7299.length > i); i++) {
                            Component122.aClass348_Sub16_Sub3_1564.setChannelPitchBendRange(AbstractShaderSub3.anIntArray7299[i], i, -7836);
                            AbstractShaderSub3.anIntArray7299[i] = 255;
                        }
                    }
                    if (DebugPanic.aClass348_Sub16_Sub3_4743 == null) {
                        if (Component205.aLong5971 <= 0) Component122.aClass348_Sub16_Sub3_1564.unloadDefinitions(ShaderProgram.aClass348_Sub2_3683, InputHandler.aBoolean4275, false);
                        else Component122.aClass348_Sub16_Sub3_1564.method2870(ShaderProgram.aClass348_Sub2_3683, Component205.aLong5971, InputHandler.aBoolean4275, true, (byte) 24);
                    }
                    if (Component269.aClass279_8764 != null) Component269.aClass279_8764.method2088(bool, Component122.aClass348_Sub16_Sub3_1564);
                    DisplayModeManagerContainer77.aClass45_1848 = null;
                    ShaderProgram.aClass348_Sub2_3683 = null;
                    Component205.aLong5971 = 0L;
                    Component258.aClass26_1977 = null;
                    DebugPanic.aClass348_Sub16_Sub3_4743 = null;
                    return true;
                }
            }
            if (bool != false) aBooleanArray6270 = null;
        } catch (Exception exception) {
            exception.printStackTrace();
            Component122.aClass348_Sub16_Sub3_1564.method2877(-128);
            DebugPanic.aClass348_Sub16_Sub3_4743 = null;
            Component258.aClass26_1977 = null;
            ShaderProgram.aClass348_Sub2_3683 = null;
            DisplayModeManagerContainer77.aClass45_1848 = null;
            PlayerState.anInt7068 = 0;
        }
        return false;
    }

    final void method2134(boolean bool, boolean bool_3_) {
        if (bool_3_ == false) {
            anInt6264++;
            GlFramebufferTexture class258_sub2 = this.aHa_Sub2_3684.method3741(444720536);
            if (aBoolean6272 && class258_sub2 != null) {
                this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
                this.aHa_Sub2_3684.bindTexture((byte) -126, class258_sub2);
                this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
                this.aHa_Sub2_3684.bindTexture((byte) -75, aClass83_6268.aClass258_Sub1_1443);
                long l = aClass337_6274.aLong4178;
                OpenGL.glUseProgramObjectARB(l);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(this.aHa_Sub2_3684.aFloatArray7825[0]), -(this.aHa_Sub2_3684.aFloatArray7825[1]), -(this.aHa_Sub2_3684.aFloatArray7825[2]));
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), this.aHa_Sub2_3684.aFloat7781, this.aHa_Sub2_3684.aFloat7816, this.aHa_Sub2_3684.aFloat7823, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), (96.0F + Math.abs(this.aHa_Sub2_3684.aFloatArray7825[1]) * 928.0F));
                aBoolean6266 = true;
            }
        }
    }

    final void method2133(int i) {
        if (i <= -75) {
            anInt6265++;
            if (aBoolean6266) {
                this.aHa_Sub2_3684.glActiveTexture(-15039, 1);
                this.aHa_Sub2_3684.bindTexture((byte) -108, null);
                this.aHa_Sub2_3684.glActiveTexture(-15039, 0);
                this.aHa_Sub2_3684.bindTexture((byte) -121, null);
                OpenGL.glUseProgramObjectARB(0L);
                aBoolean6266 = false;
            }
        }
    }

    public static void method2164(boolean bool) {
        if (bool == true) {
            GAME3 = null;
            aBooleanArray6270 = null;
        }
    }

    WaterShaderProgram(GlToolkitSub2 var_ha_Sub2, Component178 class83) {
        super(var_ha_Sub2);
        aBoolean6266 = false;
        do {
            try {
                aClass83_6268 = class83;
                if (aClass83_6268.aClass258_Sub1_1443 == null || !(this.aHa_Sub2_3684.aBoolean7791) || !(this.aHa_Sub2_3684.aBoolean7783)) break;
                Component359 class242 = (RSARequest.method3249(35633, -110, this.aHa_Sub2_3684, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
                Component359 class242_4_ = (RSARequest.method3249(35632, -38, this.aHa_Sub2_3684, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
                aClass337_6274 = ShaderLinker.linkProgram((this.aHa_Sub2_3684), -1, (new Component359[]{class242, class242_4_}));
                aBoolean6272 = aClass337_6274 != null;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("tia.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + (class83 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final void method2136(int i, int i_5_, byte i_6_) {
        if (aBoolean6266) {
            int i_7_ = 1 << (0x3 & i);
            float f = (float) (1 << ((i & 0x3d) >> 3)) / 32.0F;
            int i_8_ = i_5_ & 0xffff;
            float f_9_ = (float) (0x3 & i_5_ >> 16) / 8.0F;
            long l = aClass337_6274.aLong4178;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) (i_7_ * (this.aHa_Sub2_3684.anInt7735) % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) i_8_);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_9_);
        }
        if (i_6_ >= -42) method2163(false);
        anInt6275++;
    }
}
