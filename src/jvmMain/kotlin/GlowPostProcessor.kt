import RefCountedHandleStatics.method1323
import ModelOrSpriteHolderStatics.method174
import NoiseTextureGeneratorStatics.method545
import AnimationFrameState.method865
import TerrainChunkBuilderStatics.method876
import jaggl.OpenGLStatics.glBegin
import jaggl.OpenGLStatics.glEnd
import jaggl.OpenGLStatics.glGetUniformLocationARB
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glOrtho
import jaggl.OpenGLStatics.glPopAttrib
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushAttrib
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glTexCoord3f
import jaggl.OpenGLStatics.glUniform1fARB
import jaggl.OpenGLStatics.glUniform1iARB
import jaggl.OpenGLStatics.glUniform2fARB
import jaggl.OpenGLStatics.glUseProgramObjectARB
import jaggl.OpenGLStatics.glVertex2f
import jaggl.OpenGLStatics.glViewport
import GlowPostProcessorStatics.anInt2517
import GlowPostProcessorStatics.anInt2518

/*
 * Class188
 */
class GlowPostProcessor internal constructor(private val aHa_Sub2_2511: OpenGlRenderer) {
    private var aGlShaderProgramHandle_2513: GlShaderProgramHandle? = null
    fun method1413(class258_sub1: GlTexture3D?, class258_sub1_2_: GlTexture3D?, i: Int, f: Float): Boolean {
        try {
            anInt2517++
            if (!method1414(35632)) return false
            val class206 = aHa_Sub2_2511.aFrameBufferObject_7778
            val i_3_ = 30 % ((-55 - i) / 59)
            val class348_sub42_sub2 = RenderbufferObject(aHa_Sub2_2511, 6408, (class258_sub1!!.anInt8523), (class258_sub1.anInt8529))
            aHa_Sub2_2511.method3773(-1, class206)
            var bool = false
            class206!!.method1508(0, class348_sub42_sub2, -12)
            if (class206.method1507(117)) {
                glPushMatrix()
                glLoadIdentity()
                glMatrixMode(5889)
                glPushMatrix()
                glLoadIdentity()
                glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0)
                glPushAttrib(2048)
                glViewport(0, 0, class258_sub1.anInt8523, class258_sub1.anInt8529)
                glUseProgramObjectARB(aGlShaderProgramHandle_2513!!.aLong4178)
                glUniform1iARB((glGetUniformLocationARB(aGlShaderProgramHandle_2513!!.aLong4178, "heightMap")), 0)
                glUniform1fARB((glGetUniformLocationARB(aGlShaderProgramHandle_2513!!.aLong4178, "rcpRelief")), 1.0f / f)
                glUniform2fARB(glGetUniformLocationARB(aGlShaderProgramHandle_2513!!.aLong4178, "sampleSize"), (1.0f / class258_sub1_2_!!.anInt8523.toFloat()), (1.0f / class258_sub1_2_.anInt8529.toFloat()))
                for (i_4_ in 0..<class258_sub1.anInt8522) {
                    val f_5_ = (i_4_.toFloat() / (class258_sub1.anInt8522).toFloat())
                    aHa_Sub2_2511.method3771((-118).toByte(), class258_sub1_2_)
                    glBegin(7)
                    glTexCoord3f(0.0f, 0.0f, f_5_)
                    glVertex2f(0.0f, 0.0f)
                    glTexCoord3f(1.0f, 0.0f, f_5_)
                    glVertex2f(1.0f, 0.0f)
                    glTexCoord3f(1.0f, 1.0f, f_5_)
                    glVertex2f(1.0f, 1.0f)
                    glTexCoord3f(0.0f, 1.0f, f_5_)
                    glVertex2f(0.0f, 1.0f)
                    glEnd()
                    class258_sub1.method1958(-26823, 0, class258_sub1.anInt8523, 0, 0, i_4_, class258_sub1.anInt8529, 0)
                }
                glUseProgramObjectARB(0L)
                glPopAttrib()
                glPopMatrix()
                glMatrixMode(5888)
                glPopMatrix()
                bool = true
            }
            class206.method1500(2983, 0)
            aHa_Sub2_2511.method3770(-422613672, class206)
            return bool
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("qi.D(" + (if (class258_sub1 != null) "{...}" else "null") + ',' + (if (class258_sub1_2_ != null) "{...}" else "null") + ',' + i + ',' + f + ')'))
        }
    }

    fun method1414(i: Int): Boolean {
        if (aHa_Sub2_2511.aBoolean7820 && aHa_Sub2_2511.aBoolean7783 && aGlShaderProgramHandle_2513 == null) {
            val class242 = (TimedTileQueueEntryStatics.method3249(
                35632,
                121,
                aHa_Sub2_2511,
                "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"
            ))
            if (class242 != null) aGlShaderProgramHandle_2513 = SequencedWallEntityStatics.method2493(aHa_Sub2_2511, i + -35633, (arrayOf<ManagedGlResource?>(class242)))
        }
        anInt2518++
        if (i != 35632) method1413(null, null, 102, 0.17865802f)
        return aGlShaderProgramHandle_2513 != null
    }
}
