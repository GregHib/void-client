/* Class286_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class286_Sub4 extends Class286 {
    private boolean aBoolean6233;
    private Class337 aClass337_6234;
    static int anInt6235;
    static int anInt6236;
    private boolean aBoolean6237 = false;
    static int anInt6238;
    static int anInt6239;
    static int anInt6240;
    static int anInt6241;
    private Class83 aClass83_6242;
    static int anInt6243;
    static Class351 aClass351_6244 = new Class351(9, 8);
    static int anInt6245;
    static int anInt6246;

    final void method2140(Class258 class258, byte i, int i_0_) {
        if (!aBoolean6233) {
            ((Class286) this).aHa_Sub2_3684.method3771((byte) -124, class258);
            ((Class286) this).aHa_Sub2_3684.method3761(0, i_0_);
        }
        anInt6240++;
        if (i > -89)
            anInt6246 = 45;
    }

    final void method2133(int i) {
        anInt6236++;
        if (i >= -75)
            method2137(-39);
        if (aBoolean6233) {
            ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
            ((Class286) this).aHa_Sub2_3684.method3771((byte) -92, null);
            ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
            ((Class286) this).aHa_Sub2_3684.method3771((byte) -123, null);
            OpenGL.glUseProgramObjectARB(0L);
            aBoolean6233 = false;
        }
    }

    static final int method2154(int i) {
        int i_1_ = -1;
        for (int i_2_ = 0; i_2_ < Class75_Sub1.anInt5652 - 1; i_2_++) {
            if (i < (Class17.anIntArray256[i_2_]
                    + Class345.anIntArray4271[i_2_])) {
                i_1_ = i_2_;
                break;
            }
        }
        if (i_1_ == -1)
            i_1_ = Class75_Sub1.anInt5652 - 1;
        return i_1_;
    }

    static final int method2155(int i, byte i_3_) {
        if (i_3_ != 43)
            return -54;
        i = (i & 0x55555555) + ((~0x55555554 & i) >>> -1508933023);
        anInt6241++;
        i = (0x33333333 & i >>> -1060983742) + (0x33333333 & i);
        i = 0xf0f0f0f & (i >>> -1446808796) + i;
        i += i >>> 1189483944;
        i += i >>> 2141644080;
        return i & 0xff;
    }

    public static void method2156(int i) {
        aClass351_6244 = null;
        if (i <= 57)
            aClass351_6244 = null;
    }

    final void method2134(boolean bool, boolean bool_4_) {
        if (bool_4_ != false)
            aBoolean6237 = false;
        anInt6235++;
        Class258_Sub2 class258_sub2
                = ((Class286) this).aHa_Sub2_3684.method3741(444720536);
        if (aBoolean6237 && class258_sub2 != null) {
            float f
                    = 2.0F * (-Math.abs(((ha_Sub2) ((Class286) this).aHa_Sub2_3684)
                    .aFloatArray7825[1])
                    + 1.0F) + 1.0F;
            ((Class286) this).aHa_Sub2_3684.method3738(-15039, 1);
            ((Class286) this).aHa_Sub2_3684.method3771((byte) -114,
                    class258_sub2);
            ((Class286) this).aHa_Sub2_3684.method3738(-15039, 0);
            ((Class286) this).aHa_Sub2_3684.method3771((byte) -87,
                    (((Class83)
                            aClass83_6242)
                            .aClass258_Sub1_1443));
            long l = ((Class337) aClass337_6234).aLong4178;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB
                    (OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
            OpenGL.glUniform1iARB
                    (OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"),
                    -(((ha_Sub2) ((Class286) this).aHa_Sub2_3684)
                            .aFloatArray7825[0]),
                    -(((ha_Sub2) ((Class286) this).aHa_Sub2_3684)
                            .aFloatArray7825[1]),
                    -(((ha_Sub2) ((Class286) this).aHa_Sub2_3684)
                            .aFloatArray7825[2]));
            OpenGL.glUniform4fARB
                    (OpenGL.glGetUniformLocationARB(l, "sunColour"),
                            ((ha_Sub2) ((Class286) this).aHa_Sub2_3684).aFloat7781 * f,
                            ((ha_Sub2) ((Class286) this).aHa_Sub2_3684).aFloat7816 * f,
                            ((ha_Sub2) ((Class286) this).aHa_Sub2_3684).aFloat7823 * f,
                            1.0F);
            OpenGL.glUniform1fARB
                    (OpenGL.glGetUniformLocationARB(l, "sunExponent"),
                            64.0F + 928.0F * Math.abs(((ha_Sub2)
                                    ((Class286) this).aHa_Sub2_3684)
                                    .aFloatArray7825[1]));
            aBoolean6233 = true;
        }
    }

    final void method2139(boolean bool, byte i) {
        int i_5_ = 126 / ((i - -60) / 38);
        anInt6239++;
    }

    Class286_Sub4(ha_Sub2 var_ha_Sub2, Class83 class83) {
        super(var_ha_Sub2);
        aBoolean6233 = false;
        do {
            try {
                aClass83_6242 = class83;
                if (((Class83) aClass83_6242).aClass258_Sub1_1443 == null
                        || !(((ha_Sub2) ((Class286) this).aHa_Sub2_3684)
                        .aBoolean7791)
                        || !(((ha_Sub2) ((Class286) this).aHa_Sub2_3684)
                        .aBoolean7783))
                    break;
                Class242 class242
                        = (Class348_Sub42_Sub15.method3249
                        (35633, -21, ((Class286) this).aHa_Sub2_3684,
                                "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
                Class242 class242_6_
                        = (Class348_Sub42_Sub15.method3249
                        (35632, -53, ((Class286) this).aHa_Sub2_3684,
                                "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
                aClass337_6234
                        = Class318_Sub1_Sub5_Sub2.method2493((((Class286) this)
                                .aHa_Sub2_3684),
                        -1,
                        (new Class242[]
                                {class242,
                                        class242_6_}));
                aBoolean6237 = aClass337_6234 != null;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("er.<init>("
                                + (var_ha_Sub2 != null
                                ? "{...}" : "null")
                                + ','
                                + (class83 != null ? "{...}"
                                : "null")
                                + ')'));
            }
            break;
        } while (false);
    }

    final void method2136(int i, int i_7_, byte i_8_) {
        if (aBoolean6233) {
            int i_9_ = 1 << (0x3 & i);
            float f = (float) (1 << (0x7 & i >> -1543365501)) / 32.0F;
            int i_10_ = i_7_ & 0xffff;
            float f_11_ = (float) (0x3 & i_7_ >> 1976938512) / 8.0F;
            float f_12_ = (float) ((i_7_ & 0x7c05fa) >> -1136962093) / 16.0F;
            float f_13_ = (float) ((0x784c903 & i_7_) >> -1176310281) / 16.0F;
            int i_14_ = (0x79631502 & i_7_) >> 884356891;
            long l = ((Class337) aClass337_6234).aLong4178;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"),
                    (float) (i_9_
                            * (((ha_Sub2)
                            ((Class286) this).aHa_Sub2_3684)
                            .anInt7735)
                            % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"),
                    f);
            OpenGL.glUniform1fARB
                    (OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"),
                            (float) i_10_);
            OpenGL.glUniform1fARB
                    (OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_11_);
            OpenGL.glUniform2fARB
                    (OpenGL.glGetUniformLocationARB(l, "waveIntensity"), f_13_,
                            f_12_);
            OpenGL.glUniform1fARB
                    (OpenGL.glGetUniformLocationARB(l, "waveExponent"),
                            (float) i_14_);
        }
        anInt6243++;
        if (i_8_ > -42)
            method2140(null, (byte) -69, -63);
    }

    static final String method2157(int i, int i_15_) {
        anInt6238++;
        if (i_15_ != -1431655765)
            method2157(-27, 75);
        Class348_Sub15 class348_sub15
                = ((Class348_Sub15)
                Class27.aClass356_389.method3480((long) i, -6008));
        if (class348_sub15 != null) {
            Class348_Sub23_Sub4 class348_sub23_sub4
                    = ((Class348_Sub15) class348_sub15).aClass55_Sub1_6768
                    .method513(i_15_ + 1431655815);
            if (class348_sub23_sub4 != null) {
                double d = ((Class348_Sub15) class348_sub15)
                        .aClass55_Sub1_6768
                        .method519(i_15_ ^ 0x55555524);
                if ((double) class348_sub23_sub4.method2983((byte) 85) <= d
                        && d <= (double) class348_sub23_sub4.method2984((byte) 97))
                    return class348_sub23_sub4.method2989(9);
            }
        }
        return null;
    }

    final boolean method2137(int i) {
        anInt6245++;
        if (i >= -5)
            method2136(94, 3, (byte) 11);
        return aBoolean6237;
    }
}
