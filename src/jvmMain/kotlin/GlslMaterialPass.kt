import jaggl.OpenGLStatics.glGetUniformLocationARB
import jaggl.OpenGLStatics.glUniform1fARB
import jaggl.OpenGLStatics.glUniform1iARB
import jaggl.OpenGLStatics.glUniform2fARB
import jaggl.OpenGLStatics.glUniform3fARB
import jaggl.OpenGLStatics.glUniform4fARB
import jaggl.OpenGLStatics.glUseProgramObjectARB
import kotlin.math.abs
import GlslMaterialPassStatics.anInt6235
import GlslMaterialPassStatics.anInt6236
import GlslMaterialPassStatics.anInt6239
import GlslMaterialPassStatics.anInt6240
import GlslMaterialPassStatics.anInt6243
import GlslMaterialPassStatics.anInt6245
import GlslMaterialPassStatics.anInt6246

class GlslMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer, waterTextureSet: WaterTextureSet?) : MaterialPass(var_ha_Sub2) {
    private var aBoolean6233 = false
    private var aGlShaderProgramHandle_6234: GlShaderProgramHandle? = null
    private var aBoolean6237 = false
    private val aWaterTextureSet_6242: WaterTextureSet?
    override fun method2140(glTexture: GlTexture?, i: Byte, i_0_: Int) {
        if (!aBoolean6233) {
            this.aHa_Sub2_3684.method3771((-124).toByte(), glTexture)
            this.aHa_Sub2_3684.method3761(0, i_0_)
        }
        anInt6240++
        if (i > -89) anInt6246 = 45
    }

    override fun method2133(i: Int) {
        anInt6236++
        if (i >= -75) method2137(-39)
        if (aBoolean6233) {
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-92).toByte(), null)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            this.aHa_Sub2_3684.method3771((-123).toByte(), null)
            glUseProgramObjectARB(0L)
            aBoolean6233 = false
        }
    }

    override fun method2134(bool: Boolean, bool_4_: Boolean) {
        if (bool_4_ != false) aBoolean6237 = false
        anInt6235++
        val class258_sub2 = this.aHa_Sub2_3684.method3741(444720536)
        if (aBoolean6237 && class258_sub2 != null) {
            val f = 2.0f * (-abs(this.aHa_Sub2_3684.aFloatArray7825[1]) + 1.0f) + 1.0f
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-114).toByte(), class258_sub2)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            this.aHa_Sub2_3684.method3771((-87).toByte(), (aWaterTextureSet_6242!!.aClass258_Sub1_1443))
            val l = aGlShaderProgramHandle_6234!!.aLong4178
            glUseProgramObjectARB(l)
            glUniform1iARB(glGetUniformLocationARB(l, "normalSampler"), 0)
            glUniform1iARB(glGetUniformLocationARB(l, "envMapSampler"), 1)
            glUniform3fARB(glGetUniformLocationARB(l, "sunDir"), -(this.aHa_Sub2_3684.aFloatArray7825[0]), -(this.aHa_Sub2_3684.aFloatArray7825[1]), -(this.aHa_Sub2_3684.aFloatArray7825[2]))
            glUniform4fARB(glGetUniformLocationARB(l, "sunColour"), this.aHa_Sub2_3684.aFloat7781 * f, this.aHa_Sub2_3684.aFloat7816 * f, this.aHa_Sub2_3684.aFloat7823 * f, 1.0f)
            glUniform1fARB(glGetUniformLocationARB(l, "sunExponent"), 64.0f + 928.0f * abs(this.aHa_Sub2_3684.aFloatArray7825[1]))
            aBoolean6233 = true
        }
    }

    override fun method2139(bool: Boolean, i: Byte) {
        val i_5_ = 126 / ((i - -60) / 38)
        anInt6239++
    }

    init {
        do {
            try {
                aWaterTextureSet_6242 = waterTextureSet
                if (aWaterTextureSet_6242!!.aClass258_Sub1_1443 == null || !(this.aHa_Sub2_3684.aBoolean7791) || !(this.aHa_Sub2_3684.aBoolean7783)) break
                val class242 = (TimedTileQueueEntryStatics.method3249(
                    35633,
                    -21,
                    this.aHa_Sub2_3684,
                    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"
                ))
                val class242_6_ = (TimedTileQueueEntryStatics.method3249(
                    35632,
                    -53,
                    this.aHa_Sub2_3684,
                    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"
                ))
                aGlShaderProgramHandle_6234 = SequencedWallEntityStatics.method2493((this.aHa_Sub2_3684), -1, (arrayOf<ManagedGlResource?>(class242, class242_6_)))
                aBoolean6237 = aGlShaderProgramHandle_6234 != null
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("er.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (waterTextureSet != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    override fun method2136(i: Int, i_7_: Int, i_8_: Byte) {
        if (aBoolean6233) {
            val i_9_ = 1 shl (0x3 and i)
            val f = (1 shl (0x7 and (i shr 3))).toFloat() / 32.0f
            val i_10_ = i_7_ and 0xffff
            val f_11_ = (0x3 and (i_7_ shr 16)).toFloat() / 8.0f
            val f_12_ = ((i_7_ and 0x7c05fa) shr 19).toFloat() / 16.0f
            val f_13_ = ((0x784c903 and i_7_) shr 23).toFloat() / 16.0f
            val i_14_ = (0x79631502 and i_7_) shr 27
            val l = aGlShaderProgramHandle_6234!!.aLong4178
            glUniform1fARB(glGetUniformLocationARB(l, "time"), (i_9_ * (this.aHa_Sub2_3684.anInt7735) % 40000).toFloat() / 40000.0f)
            glUniform1fARB(glGetUniformLocationARB(l, "scale"), f)
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterDepth"), i_10_.toFloat())
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterOffset"), f_11_)
            glUniform2fARB(glGetUniformLocationARB(l, "waveIntensity"), f_13_, f_12_)
            glUniform1fARB(glGetUniformLocationARB(l, "waveExponent"), i_14_.toFloat())
        }
        anInt6243++
        if (i_8_ > -42) method2140(null, (-69).toByte(), -63)
    }

    override fun method2137(i: Int): Boolean {
        anInt6245++
        if (i >= -5) method2136(94, 3, 11.toByte())
        return aBoolean6237
    }
}
