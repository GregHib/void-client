import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glLoadMatrixf
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glTexGeni
import CubeMapMaterialPassStatics.method2171
import CubeMapMaterialPassStatics.method2172
import CubeMapMaterialPassStatics.anInt6293
import CubeMapMaterialPassStatics.anInt6294
import CubeMapMaterialPassStatics.anInt6297
import CubeMapMaterialPassStatics.anInt6298
import CubeMapMaterialPassStatics.anInt6303
import CubeMapMaterialPassStatics.aFloat6304
import CubeMapMaterialPassStatics.anInt6305

class CubeMapMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer) : MaterialPass(var_ha_Sub2) {
    private var aBoolean6301 = false
    private var aGlDisplayListFont_6302: GlDisplayListFont? = null
    override fun method2133(i: Int) {
        if (i <= -75) {
            if (aBoolean6301) {
                aGlDisplayListFont_6302!!.method594('\u0001', 28666)
                this.aHa_Sub2_3684.method3738(-15039, 1)
                this.aHa_Sub2_3684.method3771((-92).toByte(), null)
                this.aHa_Sub2_3684.method3738(-15039, 0)
            } else this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
            anInt6297++
            this.aHa_Sub2_3684.method3729(8448, 116.toByte(), 8448)
            aBoolean6301 = false
        }
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_1_: Int) {
        anInt6303++
        this.aHa_Sub2_3684.method3771((-86).toByte(), glTexture)
        this.aHa_Sub2_3684.method3761(0, i_1_)
        if (i >= -89) method2172(12)
    }

    init {
        if (var_ha_Sub2.aBoolean7863) {
            aGlDisplayListFont_6302 = GlDisplayListFont(var_ha_Sub2, 2)
            aGlDisplayListFont_6302!!.method595(123.toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3729(34165, (-35).toByte(), 7681)
            this.aHa_Sub2_3684.method3762(34168, 770, (-87).toByte(), 2)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 34167)
            glTexGeni(8192, 9472, 34066)
            glTexGeni(8193, 9472, 34066)
            glTexGeni(8194, 9472, 34066)
            glEnable(3168)
            glEnable(3169)
            glEnable(3170)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aGlDisplayListFont_6302!!.method591(-1)
            aGlDisplayListFont_6302!!.method595(126.toByte(), 1)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3729(8448, (-73).toByte(), 8448)
            this.aHa_Sub2_3684.method3762(34166, 770, (-87).toByte(), 2)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
            glDisable(3168)
            glDisable(3169)
            glDisable(3170)
            glMatrixMode(5890)
            glLoadIdentity()
            glMatrixMode(5888)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aGlDisplayListFont_6302!!.method591(-1)
        }
    }

    override fun method2139(bool: Boolean, i: Byte) {
        anInt6298++
        val i_5_ = 94 / ((i - -60) / 38)
        this.aHa_Sub2_3684.method3729(8448, (-28).toByte(), 7681)
    }

    override fun method2137(i: Int): Boolean {
        if (i > -5) aFloat6304 = -0.3934622f
        anInt6294++
        return true
    }

    override fun method2134(bool: Boolean, bool_8_: Boolean) {
        if (bool_8_ != false) method2171(85)
        anInt6293++
        val class258_sub2 = this.aHa_Sub2_3684.method3741(444720536)
        if (aGlDisplayListFont_6302 != null && class258_sub2 != null && bool) {
            aGlDisplayListFont_6302!!.method594('\u0000', 28666)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-77).toByte(), class258_sub2)
            glMatrixMode(5890)
            glLoadMatrixf(this.aHa_Sub2_3684.aClass101_Sub3_7767.method945(true), 0)
            glMatrixMode(5888)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aBoolean6301 = true
        } else this.aHa_Sub2_3684.method3775(false, 0, 770, 34168)
    }

    override fun method2136(i: Int, i_9_: Int, i_10_: Byte) {
        anInt6305++
        if (i_10_ > -42) aBoolean6301 = false
    }
}
