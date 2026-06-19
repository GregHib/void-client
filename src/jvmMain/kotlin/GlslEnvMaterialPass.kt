import jaggl.OpenGLStatics.glGetUniformLocationARB
import jaggl.OpenGLStatics.glUniform1fARB
import jaggl.OpenGLStatics.glUniform1iARB
import jaggl.OpenGLStatics.glUniform3fARB
import jaggl.OpenGLStatics.glUniform4fARB
import jaggl.OpenGLStatics.glUseProgramObjectARB
import kotlin.math.abs
import kotlin.math.min
import GlslEnvMaterialPassStatics.method2163
import GlslEnvMaterialPassStatics.anInt6263
import GlslEnvMaterialPassStatics.anInt6264
import GlslEnvMaterialPassStatics.anInt6265
import GlslEnvMaterialPassStatics.anInt6267
import GlslEnvMaterialPassStatics.anInt6269
import GlslEnvMaterialPassStatics.anInt6275

class GlslEnvMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer, waterTextureSet: WaterTextureSet?) : MaterialPass(var_ha_Sub2) {
    private var aBoolean6266 = false
    private val aWaterTextureSet_6268: WaterTextureSet?
    private var aBoolean6272 = false
    private var aGlShaderProgramHandle_6274: GlShaderProgramHandle? = null
    override fun method2140(glTexture: GlTexture?, i: Byte, i_0_: Int) {
        if (!aBoolean6266) {
            this.aHa_Sub2_3684.method3771((-128).toByte(), glTexture)
            this.aHa_Sub2_3684.method3761(0, i_0_)
        }
        anInt6269++
        if (i >= -89) method2140(null, (-85).toByte(), 27)
    }

    override fun method2139(bool: Boolean, i: Byte) {
        val i_1_ = -57 / ((-60 - i) / 38)
        anInt6263++
    }

    override fun method2137(i: Int): Boolean {
        if (i >= -5) return true
        anInt6267++
        return false
    }

    override fun method2134(bool: Boolean, bool_3_: Boolean) {
        if (bool_3_ == false) {
            anInt6264++
            val class258_sub2 = this.aHa_Sub2_3684.method3741(444720536)
            if (aBoolean6272 && class258_sub2 != null) {
                this.aHa_Sub2_3684.method3738(-15039, 1)
                this.aHa_Sub2_3684.method3771((-126).toByte(), class258_sub2)
                this.aHa_Sub2_3684.method3738(-15039, 0)
                this.aHa_Sub2_3684.method3771((-75).toByte(), aWaterTextureSet_6268!!.aClass258_Sub1_1443)
                val l = aGlShaderProgramHandle_6274!!.aLong4178
                glUseProgramObjectARB(l)
                glUniform1iARB(glGetUniformLocationARB(l, "normalSampler"), 0)
                glUniform1iARB(glGetUniformLocationARB(l, "envMapSampler"), 1)
                glUniform3fARB(glGetUniformLocationARB(l, "sunDir"), -(this.aHa_Sub2_3684.aFloatArray7825[0]), -(this.aHa_Sub2_3684.aFloatArray7825[1]), -(this.aHa_Sub2_3684.aFloatArray7825[2]))
                glUniform4fARB(glGetUniformLocationARB(l, "sunColour"), this.aHa_Sub2_3684.aFloat7781, this.aHa_Sub2_3684.aFloat7816, this.aHa_Sub2_3684.aFloat7823, 1.0f)
                glUniform1fARB(glGetUniformLocationARB(l, "sunExponent"), (96.0f + abs(this.aHa_Sub2_3684.aFloatArray7825[1]) * 928.0f))
                aBoolean6266 = true
            }
        }
    }

    override fun method2133(i: Int) {
        if (i <= -75) {
            anInt6265++
            if (aBoolean6266) {
                this.aHa_Sub2_3684.method3738(-15039, 1)
                this.aHa_Sub2_3684.method3771((-108).toByte(), null)
                this.aHa_Sub2_3684.method3738(-15039, 0)
                this.aHa_Sub2_3684.method3771((-121).toByte(), null)
                glUseProgramObjectARB(0L)
                aBoolean6266 = false
            }
        }
    }

    init {
        do {
            try {
                aWaterTextureSet_6268 = waterTextureSet
                if (aWaterTextureSet_6268!!.aClass258_Sub1_1443 == null || !(this.aHa_Sub2_3684.aBoolean7791) || !(this.aHa_Sub2_3684.aBoolean7783)) break
                val class242 = (TimedTileQueueEntryStatics.method3249(
                    35633,
                    -110,
                    this.aHa_Sub2_3684,
                    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"
                ))
                val class242_4_ = (TimedTileQueueEntryStatics.method3249(
                    35632,
                    -38,
                    this.aHa_Sub2_3684,
                    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"
                ))
                aGlShaderProgramHandle_6274 = SequencedWallEntityStatics.method2493((this.aHa_Sub2_3684), -1, (arrayOf<ManagedGlResource?>(class242, class242_4_)))
                aBoolean6272 = aGlShaderProgramHandle_6274 != null
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("tia.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (waterTextureSet != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    override fun method2136(i: Int, i_5_: Int, i_6_: Byte) {
        if (aBoolean6266) {
            val i_7_ = 1 shl (0x3 and i)
            val f = (1 shl ((i and 0x3d) shr 3)).toFloat() / 32.0f
            val i_8_ = i_5_ and 0xffff
            val f_9_ = (0x3 and (i_5_ shr 16)).toFloat() / 8.0f
            val l = aGlShaderProgramHandle_6274!!.aLong4178
            glUniform1fARB(glGetUniformLocationARB(l, "time"), (i_7_ * (this.aHa_Sub2_3684.anInt7735) % 40000).toFloat() / 40000.0f)
            glUniform1fARB(glGetUniformLocationARB(l, "scale"), f)
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterDepth"), i_8_.toFloat())
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterOffset"), f_9_)
        }
        if (i_6_ >= -42) method2163(false)
        anInt6275++
    }
}
