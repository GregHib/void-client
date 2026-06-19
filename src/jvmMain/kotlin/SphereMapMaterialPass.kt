import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glRotatef
import jaggl.OpenGLStatics.glTexGeni
import kotlin.math.pow
import kotlin.math.sqrt
import SphereMapMaterialPassStatics.anInt6306
import SphereMapMaterialPassStatics.anInt6307
import SphereMapMaterialPassStatics.anInt6309
import SphereMapMaterialPassStatics.anInt6312
import SphereMapMaterialPassStatics.anInt6314
import SphereMapMaterialPassStatics.anInt6315
import SphereMapMaterialPassStatics.anInt6318

class SphereMapMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer) : MaterialPass(var_ha_Sub2) {
    private var aBoolean6308 = false
    private var aGlDisplayListFont_6310: GlDisplayListFont? = null
    private var aBoolean6316 = false
    private var aClass258_Sub2Array6317: Array<GlTextureCubeMap?>? = null
    override fun method2133(i: Int) {
        anInt6318++
        if (aBoolean6316) {
            if (!aBoolean6308) {
                this.aHa_Sub2_3684.method3738(-15039, 2)
                this.aHa_Sub2_3684.method3771((-84).toByte(), null)
            }
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-87).toByte(), null)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aGlDisplayListFont_6310!!.method594('\u0001', 28666)
            aBoolean6316 = false
        } else this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
        if (i < -75) this.aHa_Sub2_3684.method3729(8448, (-75).toByte(), 8448)
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_5_: Int) {
        if (i >= -89) aClass258_Sub2Array6317 = null
        this.aHa_Sub2_3684.method3771((-115).toByte(), glTexture)
        anInt6312++
        this.aHa_Sub2_3684.method3761(0, i_5_)
    }

    private fun method2176(i: Int) {
        aGlDisplayListFont_6310 = GlDisplayListFont(this.aHa_Sub2_3684, 2)
        if (i >= -7) method2140(null, 112.toByte(), -64)
        anInt6314++
        aGlDisplayListFont_6310!!.method595(105.toByte(), 0)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        glTexGeni(8192, 9472, 34065)
        glTexGeni(8193, 9472, 34065)
        glTexGeni(8194, 9472, 34065)
        glEnable(3168)
        glEnable(3169)
        glEnable(3170)
        glMatrixMode(5890)
        glLoadIdentity()
        glRotatef(22.5f, 1.0f, 0.0f, 0.0f)
        glMatrixMode(5888)
        if (aBoolean6308) {
            this.aHa_Sub2_3684.method3729(260, 104.toByte(), 7681)
            this.aHa_Sub2_3684.method3762(5890, 770, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 34167)
        } else {
            this.aHa_Sub2_3684.method3729(7681, 126.toByte(), 8448)
            this.aHa_Sub2_3684.method3762(34168, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 2)
            this.aHa_Sub2_3684.method3729(260, 124.toByte(), 7681)
            this.aHa_Sub2_3684.method3762(34168, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3762(34168, 770, (-87).toByte(), 1)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 34167)
        }
        this.aHa_Sub2_3684.method3738(-15039, 0)
        aGlDisplayListFont_6310!!.method591(-1)
        aGlDisplayListFont_6310!!.method595(114.toByte(), 1)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        glDisable(3168)
        glDisable(3169)
        glDisable(3170)
        glMatrixMode(5890)
        glLoadIdentity()
        glMatrixMode(5888)
        if (aBoolean6308) {
            this.aHa_Sub2_3684.method3729(8448, 115.toByte(), 8448)
            this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
        } else {
            this.aHa_Sub2_3684.method3729(8448, (-9).toByte(), 8448)
            this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 2)
            this.aHa_Sub2_3684.method3729(8448, 92.toByte(), 8448)
            this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3762(34168, 768, (-87).toByte(), 1)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
        }
        this.aHa_Sub2_3684.method3738(-15039, 0)
        aGlDisplayListFont_6310!!.method591(-1)
    }

    override fun method2136(i: Int, i_6_: Int, i_7_: Byte) {
        anInt6307++
        if (aBoolean6316) {
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-91).toByte(), aClass258_Sub2Array6317!![i + -1])
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
        if (i_7_ > -42) method2134(true, true)
    }

    override fun method2137(i: Int): Boolean {
        anInt6315++
        return i <= -5
    }

    override fun method2134(bool: Boolean, bool_8_: Boolean) {
        if (bool_8_ == false) {
            anInt6306++
            if (aGlDisplayListFont_6310 == null || !bool) this.aHa_Sub2_3684.method3775(false, 0, 770, 34168)
            else {
                if (!aBoolean6308) {
                    this.aHa_Sub2_3684.method3738(-15039, 2)
                    this.aHa_Sub2_3684.method3771((-120).toByte(), (this.aHa_Sub2_3684.aClass258_Sub3_7827))
                    this.aHa_Sub2_3684.method3738(-15039, 0)
                }
                aGlDisplayListFont_6310!!.method594('\u0000', 28666)
                aBoolean6316 = true
            }
        }
    }

    override fun method2139(bool: Boolean, i: Byte) {
        this.aHa_Sub2_3684.method3729(8448, 121.toByte(), 7681)
        anInt6309++
        val i_9_ = 96 / ((i - -60) / 38)
    }

    init {
        if (var_ha_Sub2.aBoolean7863) {
            aBoolean6308 = var_ha_Sub2.anInt7795 < 3
            val i = if (aBoolean6308) 48 else 127
            val `is` = Array<ByteArray?>(6) { ByteArray(4096) }
            val is_10_ = Array<ByteArray?>(6) { ByteArray(4096) }
            val is_11_ = Array<ByteArray?>(6) { ByteArray(4096) }
            var i_12_ = 0
            for (i_13_ in 0..63) {
                for (i_14_ in 0..63) {
                    var f = i_13_.toFloat() * 2.0f / 64.0f - 1.0f
                    var f_15_ = -1.0f + 2.0f * i_14_.toFloat() / 64.0f
                    val f_16_ = (1.0 / sqrt((f * f + (1.0f + (f_15_ * f_15_))).toDouble())).toFloat()
                    f_15_ *= f_16_
                    f *= f_16_
                    for (i_17_ in 0..5) {
                        val f_18_: Float
                        if (i_17_ == 0) f_18_ = -f_15_
                        else if (i_17_ == 1) f_18_ = f_15_
                        else if (i_17_ != 2) {
                            if (i_17_ != 3) {
                                if (i_17_ != 4) f_18_ = -f_16_
                                else f_18_ = f_16_
                            } else f_18_ = -f
                        } else f_18_ = f
                        val i_19_: Int
                        val i_20_: Int
                        val i_21_: Int
                        if (f_18_ > 0.0f) {
                            i_19_ = (i.toDouble() * f_18_.toDouble().pow(96.0)).toInt()
                            i_20_ = (i.toDouble() * f_18_.toDouble().pow(36.0)).toInt()
                            i_21_ = (i.toDouble() * f_18_.toDouble().pow(12.0)).toInt()
                        } else {
                            i_21_ = 0
                            i_20_ = i_21_
                            i_19_ = i_20_
                        }
                        is_10_[i_17_]!![i_12_] = i_19_.toByte()
                        is_11_[i_17_]!![i_12_] = i_20_.toByte()
                        `is`[i_17_]!![i_12_] = i_21_.toByte()
                    }
                    i_12_++
                }
            }
            aClass258_Sub2Array6317 = arrayOfNulls<GlTextureCubeMap>(3)
            aClass258_Sub2Array6317!![0] = GlTextureCubeMap(this.aHa_Sub2_3684, 6406, 64, false, is_10_, 6406)
            aClass258_Sub2Array6317!![1] = GlTextureCubeMap(this.aHa_Sub2_3684, 6406, 64, false, is_11_, 6406)
            aClass258_Sub2Array6317!![2] = GlTextureCubeMap(this.aHa_Sub2_3684, 6406, 64, false, `is`, 6406)
            method2176(-88)
        }
    }
}
