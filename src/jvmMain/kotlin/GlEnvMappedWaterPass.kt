import FontStatics.method2582
import jaggl.OpenGLStatics.glGetUniformLocationARB
import jaggl.OpenGLStatics.glUniform1fARB
import jaggl.OpenGLStatics.glUniform1iARB
import jaggl.OpenGLStatics.glUniform3fARB
import jaggl.OpenGLStatics.glUniform4fARB
import jaggl.OpenGLStatics.glUseProgramObjectARB
import kotlin.math.abs
import GlEnvMappedWaterPassStatics.method3551
import GlEnvMappedWaterPassStatics.method3552
import GlEnvMappedWaterPassStatics.anInt7366
import GlEnvMappedWaterPassStatics.anInt7368
import GlEnvMappedWaterPassStatics.anInt7370
import GlEnvMappedWaterPassStatics.anInt7372
import GlEnvMappedWaterPassStatics.anInt7377
import GlEnvMappedWaterPassStatics.anInt7379
import GlEnvMappedWaterPassStatics.anInt7380

class GlEnvMappedWaterPass internal constructor(glRenderDevice: GlRenderDevice, js5Archive: Js5Archive?, normalMapGenerator: NormalMapGenerator?) : AbstractRenderPass(glRenderDevice) {
    private var aNativeBufferHandle_7369: NativeBufferHandle? = null
    private var aBoolean7373 = false
    private var aNormalMapGenerator_7375: NormalMapGenerator? = null
    private var aBoolean7376 = false
    override fun method3526(i: Int, i_0_: Int, i_1_: Int) {
        anInt7372++
        if (aBoolean7373) {
            val i_2_ = 1 shl (i_0_ and 0x3)
            val f = (1 shl (0x7 and (i_0_ shr 3))).toFloat() / 32.0f
            val i_3_ = i_1_ and 0xffff
            val f_4_ = (0x3 and (i_1_ shr 16)).toFloat() / 8.0f
            val l = aNativeBufferHandle_7369!!.aLong1510
            glUniform1fARB(glGetUniformLocationARB(l, "time"), ((this.aHa_Sub3_4479.anInt8146) * i_2_ % 40000).toFloat() / 40000.0f)
            glUniform1fARB(glGetUniformLocationARB(l, "scale"), f)
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterDepth"), i_3_.toFloat())
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterOffset"), f_4_)
        }
        if (i != 10756) aNormalMapGenerator_7375 = null
    }

    override fun method3520(i: Byte) {
        if (i.toInt() != 87) aBoolean7376 = true
        if (aBoolean7373) {
            this.aHa_Sub3_4479.method3897(1, -4382)
            this.aHa_Sub3_4479.method3850(70.toByte(), null)
            this.aHa_Sub3_4479.method3897(0, -4382)
            this.aHa_Sub3_4479.method3850(107.toByte(), null)
            glUseProgramObjectARB(0L)
            aBoolean7373 = false
        }
        anInt7368++
    }

    override fun method3530(i: Int): Boolean {
        if (i >= -57) aBoolean7373 = true
        anInt7366++
        return aBoolean7376
    }

    override fun method3527(i: Int, renderable: Renderable?, i_12_: Int) {
        if (i_12_ != -16776) method3552(-90)
        anInt7380++
        if (!aBoolean7373) {
            this.aHa_Sub3_4479.method3850(102.toByte(), renderable)
            this.aHa_Sub3_4479.method3923(true, i)
        }
    }

    override fun method3521(bool: Boolean, i: Byte) {
        anInt7377++
        if (i.toInt() != -103) anInt7379 = -84
    }

    init {
        try {
            aNormalMapGenerator_7375 = normalMapGenerator
            if (js5Archive != null && glRenderDevice!!.aBoolean9921 && glRenderDevice.aBoolean9922) {
                val class39 = (ShaderObjectStatics.method2608(glRenderDevice, js5Archive.method391("gl", "environment_mapped_water_v", -29832), -108, 35633))
                val class39_13_ = (ShaderObjectStatics.method2608(glRenderDevice, js5Archive.method391("gl", "environment_mapped_water_f", -29832), -122, 35632))
                aNativeBufferHandle_7369 = method2582(glRenderDevice, arrayOf<GlShaderObjectHandle?>(class39, class39_13_), -2113)
                aBoolean7376 = (aNativeBufferHandle_7369 != null && aNormalMapGenerator_7375!!.method2041(120.toByte()))
            } else aBoolean7376 = false
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("ko.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (normalMapGenerator != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7370++
        if (i != 15192) method3551(58, -50, 40, true)
        val interface18_impl2 = this.aHa_Sub3_4479.method3834(-16777216)
        if (aBoolean7376 && interface18_impl2 != null) {
            this.aHa_Sub3_4479.method3897(1, i + -19574)
            this.aHa_Sub3_4479.method3850((-63).toByte(), interface18_impl2)
            this.aHa_Sub3_4479.method3897(0, -4382)
            this.aHa_Sub3_4479.method3850((-107).toByte(), aNormalMapGenerator_7375!!.anInterface18_Impl1_3455)
            val l = aNativeBufferHandle_7369!!.aLong1510
            glUseProgramObjectARB(l)
            glUniform1iARB(glGetUniformLocationARB(l, "normalSampler"), 0)
            glUniform1iARB(glGetUniformLocationARB(l, "envMapSampler"), 1)
            glUniform3fARB(glGetUniformLocationARB(l, "sunDir"), -(this.aHa_Sub3_4479.aFloatArray8170[0]), -(this.aHa_Sub3_4479.aFloatArray8170[1]), -(this.aHa_Sub3_4479.aFloatArray8170[2]))
            glUniform4fARB(glGetUniformLocationARB(l, "sunColour"), this.aHa_Sub3_4479.aFloat8180, this.aHa_Sub3_4479.aFloat8087, this.aHa_Sub3_4479.aFloat8168, 1.0f)
            glUniform1fARB(glGetUniformLocationARB(l, "sunExponent"), 928.0f * abs(this.aHa_Sub3_4479.aFloatArray8170[1]) + 96.0f)
            aBoolean7373 = true
        }
    }
}
