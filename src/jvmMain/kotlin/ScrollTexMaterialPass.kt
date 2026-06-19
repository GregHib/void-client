import BrightnessOptionStateStatics.method1745
import GlVertexBufferArbStatics.method2127
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glScalef
import jaggl.OpenGLStatics.glTexEnvf
import jaggl.OpenGLStatics.glTexGenfv
import jaggl.OpenGLStatics.glTexGeni
import ScrollTexMaterialPassStatics.anInt6279
import ScrollTexMaterialPassStatics.anInt6280
import ScrollTexMaterialPassStatics.anInt6282
import ScrollTexMaterialPassStatics.anInt6283
import ScrollTexMaterialPassStatics.anInt6286
import ScrollTexMaterialPassStatics.anInt6288
import ScrollTexMaterialPassStatics.anInt6291

class ScrollTexMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer, waterTextureSet: WaterTextureSet?) : MaterialPass(var_ha_Sub2) {
    private val aWaterTextureSet_6278: WaterTextureSet?
    private var aGlDisplayListFont_6284: GlDisplayListFont? = null
    private var aClass258_Sub4_6285: GlTexture1D? = null
    override fun method2136(i: Int, i_3_: Int, i_4_: Byte) {
        if (i_4_ >= -42) aClass258_Sub4_6285 = null
        if ((0x1 and i) == 1) {
            if (aWaterTextureSet_6278!!.aBoolean1442) {
                this.aHa_Sub2_3684.method3771((-83).toByte(), aWaterTextureSet_6278.aClass258_Sub1_1440)
                KeyboardLayoutConfigStatics.aFloatArray2131!![2] = 0.0f
                KeyboardLayoutConfigStatics.aFloatArray2131!![3] = ((this.aHa_Sub2_3684.anInt7735) % 4000).toFloat() / 4000.0f
                KeyboardLayoutConfigStatics.aFloatArray2131!![0] = 0.0f
                KeyboardLayoutConfigStatics.aFloatArray2131!![1] = 0.0f
                glTexGenfv(8194, 9473, KeyboardLayoutConfigStatics.aFloatArray2131, 0)
            } else {
                val i_5_ = (16 * (this.aHa_Sub2_3684.anInt7735 % 4000) / 4000)
                this.aHa_Sub2_3684.method3771((-95).toByte(), aWaterTextureSet_6278.aClass258_Sub3Array1444!![i_5_])
            }
        } else if (aWaterTextureSet_6278!!.aBoolean1442) {
            this.aHa_Sub2_3684.method3771((-126).toByte(), (aWaterTextureSet_6278.aClass258_Sub1_1440))
            KeyboardLayoutConfigStatics.aFloatArray2131!![0] = 0.0f
            KeyboardLayoutConfigStatics.aFloatArray2131!![2] = 0.0f
            KeyboardLayoutConfigStatics.aFloatArray2131!![1] = 0.0f
            KeyboardLayoutConfigStatics.aFloatArray2131!![3] = 0.0f
            glTexGenfv(8194, 9473, KeyboardLayoutConfigStatics.aFloatArray2131, 0)
        } else this.aHa_Sub2_3684.method3771((-110).toByte(), aWaterTextureSet_6278.aClass258_Sub3Array1444!![0])
        anInt6291++
    }

    override fun method2134(bool: Boolean, bool_6_: Boolean) {
        if (this.aHa_Sub2_3684.anInt7782 > 0) {
            val f = -0.5f / (this.aHa_Sub2_3684.anInt7782).toFloat()
            this.aHa_Sub2_3684.method3738(-15039, 1)
            KeyboardLayoutConfigStatics.aFloatArray2131!![3] = 0.25f + (this.aHa_Sub2_3684.aFloat7792) * f
            KeyboardLayoutConfigStatics.aFloatArray2131!![0] = 0.0f
            KeyboardLayoutConfigStatics.aFloatArray2131!![2] = f
            KeyboardLayoutConfigStatics.aFloatArray2131!![1] = 0.0f
            glPushMatrix()
            glLoadIdentity()
            glTexGenfv(8192, 9474, KeyboardLayoutConfigStatics.aFloatArray2131, 0)
            glPopMatrix()
            this.aHa_Sub2_3684.method3744(this.aHa_Sub2_3684.anInt7782.toFloat(), 770, 0.5f)
            this.aHa_Sub2_3684.method3771((-99).toByte(), aClass258_Sub4_6285)
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
        anInt6286++
        aGlDisplayListFont_6284!!.method594('\u0000', 28666)
        glMatrixMode(5890)
        glPushMatrix()
        if (bool_6_ == false) {
            glScalef(0.25f, 0.25f, 1.0f)
            glMatrixMode(5888)
        }
    }

    private fun method2167(i: Int) {
        aGlDisplayListFont_6284 = GlDisplayListFont(this.aHa_Sub2_3684, 2)
        anInt6283++
        aGlDisplayListFont_6284!!.method595(109.toByte(), 0)
        this.aHa_Sub2_3684.method3738(i + 6366, 1)
        this.aHa_Sub2_3684.method3729(7681, 98.toByte(), 260)
        this.aHa_Sub2_3684.method3762(34168, 768, (-87).toByte(), 0)
        glTexGeni(8192, 9472, 9216)
        glEnable(3168)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        glTexEnvf(8960, 34163, 2.0f)
        if (aWaterTextureSet_6278!!.aBoolean1442) {
            glTexGeni(8194, 9472, 9217)
            glTexGeni(8195, 9472, 9217)
            glTexGenfv(8195, 9473, floatArrayOf(0.0f, 0.0f, 0.0f, 1.0f), 0)
            glEnable(3170)
            glEnable(3171)
        }
        aGlDisplayListFont_6284!!.method591(-1)
        aGlDisplayListFont_6284!!.method595(117.toByte(), 1)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        if (i != -21405) method2137(-18)
        this.aHa_Sub2_3684.method3729(8448, (-115).toByte(), 8448)
        this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
        glDisable(3168)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        glTexEnvf(8960, 34163, 1.0f)
        if (aWaterTextureSet_6278.aBoolean1442) {
            glDisable(3170)
            glDisable(3171)
        }
        aGlDisplayListFont_6284!!.method591(i + 21404)
    }

    init {
        try {
            aWaterTextureSet_6278 = waterTextureSet
            method2167(-21405)
            aClass258_Sub4_6285 = GlTexture1D(this.aHa_Sub2_3684, 6406, 2, byteArrayOf(0, -1), 6406)
            aClass258_Sub4_6285!!.method1972((-91).toByte(), false)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("tn.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (waterTextureSet != null) "{...}" else "null") + ')'))
        }
    }

    override fun method2137(i: Int): Boolean {
        anInt6288++
        if (i > -5) return true
        return true
    }

    override fun method2133(i: Int) {
        aGlDisplayListFont_6284!!.method594('\u0001', 28666)
        anInt6282++
        if (this.aHa_Sub2_3684.anInt7782 > 0) {
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-115).toByte(), null)
            this.aHa_Sub2_3684.method3744(0.0f, 770, 1.0f)
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
        if (i > -75) aClass258_Sub4_6285 = null
        this.aHa_Sub2_3684.method3729(8448, 102.toByte(), 8448)
        glMatrixMode(5890)
        glPopMatrix()
        glMatrixMode(5888)
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_9_: Int) {
        if (i < -89) anInt6280++
    }

    override fun method2139(bool: Boolean, i: Byte) {
        this.aHa_Sub2_3684.method3729(260, (-94).toByte(), 8448)
        anInt6279++
        val i_18_ = 107 % ((-60 - i) / 38)
    }
}
