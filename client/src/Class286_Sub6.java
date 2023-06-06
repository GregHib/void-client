/* Class286_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class286_Sub6 extends Class286 {
    static Game aGame_6262 = new Game("game3", 2);
    static int anInt6263;
    static int anInt6264;
    static int anInt6265;
    private boolean aBoolean6266;
    static int anInt6267;
    private final Class83 aClass83_6268;
    static int anInt6269;
    static boolean[] aBooleanArray6270;
    static int anInt6271;
    private boolean aBoolean6272 = false;
    static int anInt6273;
    private Class337 aClass337_6274;
    static int anInt6275;
    static long aLong6276;

    final void method2140(Class258 class258, byte i, int i_0_) {
        if (!aBoolean6266) {
            this.aHa_Sub2_3684.method3771((byte) -128, class258);
            this.aHa_Sub2_3684.method3761(0, i_0_);
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
        if (bool != false) aLong6276 = -88L;
        anInt6271++;
        String string = "www";
        if (Class367_Sub8.aWhereMode_7361 != Class8.whereMode) {
            if (Class8.whereMode != Class26.aWhereMode_382) {
                if (Class8.whereMode == Class108.wipWhereMode) string = "www-wtwip";
            } else string = "www-wtqa";
        } else string = "www-wtrc";
        String string_2_ = "";
        if (Class239_Sub12.aString5966 != null) string_2_ = "/p=" + Class239_Sub12.aString5966;
        return ("http://" + string + "." + (Class348_Sub42_Sub8_Sub2.aGame_10434.aString2985) + ".com/l=" + Class348_Sub33.anInt6967 + "/a=" + Class202.anInt2670 + string_2_ + "/");
    }

    static final boolean method2163(boolean bool) {
        anInt6273++;
        try {
            if (Class348_Sub43.anInt7068 == 2) {
                if (Class286.aClass348_Sub2_3683 == null) {
                    Class286.aClass348_Sub2_3683 = Class348_Sub2.method2734(Class124.aClass45_1848, (Class318_Sub1_Sub4_Sub1.anInt10074), Class318.anInt3971);
                    if (Class286.aClass348_Sub2_3683 == null) return false;
                }
                if (Class141.aClass26_1977 == null) Class141.aClass26_1977 = new Class26(Class43.aClass45_611, Class333.aClass45_4147);
                Class348_Sub16_Sub3 class348_sub16_sub3 = Class98.aClass348_Sub16_Sub3_1564;
                if (Class285.aClass348_Sub16_Sub3_4743 != null) class348_sub16_sub3 = Class285.aClass348_Sub16_Sub3_4743;
                if (class348_sub16_sub3.method2866((Class286.aClass348_Sub2_3683), 22050, Class141.aClass26_1977, Class367_Sub9.aClass45_7371, -35)) {
                    Class98.aClass348_Sub16_Sub3_1564 = class348_sub16_sub3;
                    Class98.aClass348_Sub16_Sub3_1564.method2864((byte) 52);
                    if (Class348_Sub40_Sub35.anInt9444 <= 0) {
                        Class348_Sub43.anInt7068 = 0;
                        Class98.aClass348_Sub16_Sub3_1564.method2861(0, Class58.anInt1059);
                        for (int i = 0; i < Class367_Sub3.anIntArray7299.length; i++) {
                            Class98.aClass348_Sub16_Sub3_1564.method2843(Class367_Sub3.anIntArray7299[i], i, -7836);
                            Class367_Sub3.anIntArray7299[i] = 255;
                        }
                    } else {
                        Class348_Sub43.anInt7068 = 3;
                        Class98.aClass348_Sub16_Sub3_1564.method2861(0, (Math.min(Class58.anInt1059, Class348_Sub40_Sub35.anInt9444)));
                        for (int i = 0; (Class367_Sub3.anIntArray7299.length > i); i++) {
                            Class98.aClass348_Sub16_Sub3_1564.method2843(Class367_Sub3.anIntArray7299[i], i, -7836);
                            Class367_Sub3.anIntArray7299[i] = 255;
                        }
                    }
                    if (Class285.aClass348_Sub16_Sub3_4743 == null) {
                        if (Class239_Sub12.aLong5971 <= 0) Class98.aClass348_Sub16_Sub3_1564.method2869(Class286.aClass348_Sub2_3683, Class346.aBoolean4275, false);
                        else Class98.aClass348_Sub16_Sub3_1564.method2870(Class286.aClass348_Sub2_3683, Class239_Sub12.aLong5971, Class346.aBoolean4275, true, (byte) 24);
                    }
                    if (Class318_Sub1_Sub4.aClass279_8764 != null) Class318_Sub1_Sub4.aClass279_8764.method2088(bool, Class98.aClass348_Sub16_Sub3_1564);
                    Class124.aClass45_1848 = null;
                    Class286.aClass348_Sub2_3683 = null;
                    Class239_Sub12.aLong5971 = 0L;
                    Class141.aClass26_1977 = null;
                    Class285.aClass348_Sub16_Sub3_4743 = null;
                    return true;
                }
            }
            if (bool != false) aBooleanArray6270 = null;
        } catch (Exception exception) {
            exception.printStackTrace();
            Class98.aClass348_Sub16_Sub3_1564.method2877(-128);
            Class285.aClass348_Sub16_Sub3_4743 = null;
            Class141.aClass26_1977 = null;
            Class286.aClass348_Sub2_3683 = null;
            Class124.aClass45_1848 = null;
            Class348_Sub43.anInt7068 = 0;
        }
        return false;
    }

    final void method2134(boolean bool, boolean bool_3_) {
        if (bool_3_ == false) {
            anInt6264++;
            Class258_Sub2 class258_sub2 = this.aHa_Sub2_3684.method3741(444720536);
            if (aBoolean6272 && class258_sub2 != null) {
                this.aHa_Sub2_3684.method3738(-15039, 1);
                this.aHa_Sub2_3684.method3771((byte) -126, class258_sub2);
                this.aHa_Sub2_3684.method3738(-15039, 0);
                this.aHa_Sub2_3684.method3771((byte) -75, aClass83_6268.aClass258_Sub1_1443);
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
                this.aHa_Sub2_3684.method3738(-15039, 1);
                this.aHa_Sub2_3684.method3771((byte) -108, null);
                this.aHa_Sub2_3684.method3738(-15039, 0);
                this.aHa_Sub2_3684.method3771((byte) -121, null);
                OpenGL.glUseProgramObjectARB(0L);
                aBoolean6266 = false;
            }
        }
    }

    public static void method2164(boolean bool) {
        if (bool == true) {
            aGame_6262 = null;
            aBooleanArray6270 = null;
        }
    }

    Class286_Sub6(ha_Sub2 var_ha_Sub2, Class83 class83) {
        super(var_ha_Sub2);
        aBoolean6266 = false;
        do {
            try {
                aClass83_6268 = class83;
                if (aClass83_6268.aClass258_Sub1_1443 == null || !(this.aHa_Sub2_3684.aBoolean7791) || !(this.aHa_Sub2_3684.aBoolean7783)) break;
                Class242 class242 = (Class348_Sub42_Sub15.method3249(35633, -110, this.aHa_Sub2_3684, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
                Class242 class242_4_ = (Class348_Sub42_Sub15.method3249(35632, -38, this.aHa_Sub2_3684, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
                aClass337_6274 = Class318_Sub1_Sub5_Sub2.method2493((this.aHa_Sub2_3684), -1, (new Class242[]{class242, class242_4_}));
                aBoolean6272 = aClass337_6274 != null;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("tia.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + (class83 != null ? "{...}" : "null") + ')'));
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
