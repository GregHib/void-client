import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glTexGenfv
import jaggl.OpenGLStatics.glTexGeni
import kotlin.math.min
import TexGenMaterialPassStatics.anInt6248
import TexGenMaterialPassStatics.anInt6249
import TexGenMaterialPassStatics.anInt6250
import TexGenMaterialPassStatics.anInt6252
import TexGenMaterialPassStatics.anInt6253
import TexGenMaterialPassStatics.anInt6257
import TexGenMaterialPassStatics.anInt6261

class TexGenMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer, waterTextureSet: WaterTextureSet?) : MaterialPass(var_ha_Sub2) {
    private val aGlDisplayListFont_6254: GlDisplayListFont
    private val aWaterTextureSet_6259: WaterTextureSet?
    override fun method2136(i: Int, i_5_: Int, i_6_: Byte) {
        anInt6252++
        val f = -5.0E-4f * (1 + (i and 0x3)).toFloat()
        val f_7_ = 5.0E-4f * (1 + ((i and 0x18) shr 3)).toFloat()
        val f_8_ = if ((i and 0x40) == 0) 4.8828125E-4f else 9.765625E-4f
        val bool = (i and 0x80) != 0
        this.aHa_Sub2_3684.method3738(-15039, 1)
        if (bool) {
            MapLabelMenuEntryStatics.aFloatArray5791!![1] = 0.0f
            MapLabelMenuEntryStatics.aFloatArray5791!![0] = f_8_
            MapLabelMenuEntryStatics.aFloatArray5791!![3] = 0.0f
            MapLabelMenuEntryStatics.aFloatArray5791!![2] = 0.0f
        } else {
            MapLabelMenuEntryStatics.aFloatArray5791!![1] = 0.0f
            MapLabelMenuEntryStatics.aFloatArray5791!![0] = 0.0f
            MapLabelMenuEntryStatics.aFloatArray5791!![2] = f_8_
            MapLabelMenuEntryStatics.aFloatArray5791!![3] = 0.0f
        }
        glTexGenfv(8192, 9474, MapLabelMenuEntryStatics.aFloatArray5791, 0)
        MapLabelMenuEntryStatics.aFloatArray5791!![0] = 0.0f
        MapLabelMenuEntryStatics.aFloatArray5791!![1] = f_8_
        MapLabelMenuEntryStatics.aFloatArray5791!![3] = (f * this.aHa_Sub2_3684.anInt7735.toFloat() % 1.0f)
        if (i_6_ >= -42) method2136(-27, -15, (-43).toByte())
        MapLabelMenuEntryStatics.aFloatArray5791!![2] = 0.0f
        glTexGenfv(8193, 9474, MapLabelMenuEntryStatics.aFloatArray5791, 0)
        if (aWaterTextureSet_6259!!.aBoolean1442) {
            MapLabelMenuEntryStatics.aFloatArray5791!![0] = 0.0f
            MapLabelMenuEntryStatics.aFloatArray5791!![3] = (this.aHa_Sub2_3684.anInt7735).toFloat() * f_7_ % 1.0f
            MapLabelMenuEntryStatics.aFloatArray5791!![2] = 0.0f
            MapLabelMenuEntryStatics.aFloatArray5791!![1] = 0.0f
            glTexGenfv(8194, 9473, MapLabelMenuEntryStatics.aFloatArray5791, 0)
        } else {
            val i_9_ = (16.0f * (this.aHa_Sub2_3684.anInt7735.toFloat() * f_7_)).toInt()
            this.aHa_Sub2_3684.method3771((-81).toByte(), aWaterTextureSet_6259.aClass258_Sub3Array1448!![i_9_ % 16])
        }
        this.aHa_Sub2_3684.method3738(-15039, 0)
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_10_: Int) {
        anInt6257++
        this.aHa_Sub2_3684.method3771((-118).toByte(), glTexture)
        this.aHa_Sub2_3684.method3761(0, i_10_)
        if (i > -89) method2140(null, 109.toByte(), -112)
    }

    override fun method2133(i: Int) {
        anInt6249++
        aGlDisplayListFont_6254.method594('\u0001', 28666)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        this.aHa_Sub2_3684.method3771((-113).toByte(), null)
        if (i > -75) anInt6248 = -7
        this.aHa_Sub2_3684.method3738(-15039, 0)
    }

    init {
        try {
            aWaterTextureSet_6259 = waterTextureSet
            aGlDisplayListFont_6254 = GlDisplayListFont(var_ha_Sub2, 2)
            aGlDisplayListFont_6254.method595(104.toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            if (aWaterTextureSet_6259!!.aBoolean1442) {
                glTexGeni(8194, 9472, 9217)
                glEnable(3170)
            }
            glTexGeni(8192, 9472, 9216)
            glTexGeni(8193, 9472, 9216)
            glEnable(3168)
            glEnable(3169)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aGlDisplayListFont_6254.method591(-1)
            aGlDisplayListFont_6254.method595(117.toByte(), 1)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            if (aWaterTextureSet_6259.aBoolean1442) glDisable(3170)
            glDisable(3168)
            glDisable(3169)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aGlDisplayListFont_6254.method591(-1)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("gn.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (waterTextureSet != null) "{...}" else "null") + ')'))
        }
    }

    override fun method2134(bool: Boolean, bool_11_: Boolean) {
        anInt6250++
        aGlDisplayListFont_6254.method594('\u0000', 28666)
        if (aWaterTextureSet_6259!!.aBoolean1442) {
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-117).toByte(), (aWaterTextureSet_6259.aClass258_Sub1_1446))
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
        if (bool_11_ != false) anInt6248 = -68
    }

    override fun method2139(bool: Boolean, i: Byte) {
        anInt6261++
        val i_12_ = -52 % ((i - -60) / 38)
    }

    override fun method2137(i: Int): Boolean {
        if (i >= -5) anInt6248 = 124
        anInt6253++
        return true
    }
}
