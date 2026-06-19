import FixedFunctionMaterialPassStatics.anInt6204
import FixedFunctionMaterialPassStatics.anInt6206
import FixedFunctionMaterialPassStatics.anInt6207
import FixedFunctionMaterialPassStatics.anInt6208
import FixedFunctionMaterialPassStatics.anInt6209
import FixedFunctionMaterialPassStatics.anInt6211
import FixedFunctionMaterialPassStatics.anInt6212

/* Class286_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FixedFunctionMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer) : MaterialPass(var_ha_Sub2) {
    override fun method2133(i: Int) {
        if (i < -75) {
            this.aHa_Sub2_3684.method3804(false, (-61).toByte())
            anInt6211++
        }
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_5_: Int) {
        anInt6206++
        this.aHa_Sub2_3684.method3771((-80).toByte(), glTexture)
        if (i >= -89) method2136(-67, -39, 18.toByte())
        this.aHa_Sub2_3684.method3761(0, i_5_)
    }

    override fun method2136(i: Int, i_7_: Int, i_8_: Byte) {
        anInt6209++
        if (i_8_ > -42) method2133(35)
    }

    override fun method2137(i: Int): Boolean {
        anInt6208++
        if (i > -5) anInt6212 = 1
        return true
    }

    override fun method2134(bool: Boolean, bool_9_: Boolean) {
        this.aHa_Sub2_3684.method3804(true, (-83).toByte())
        if (bool_9_ != false) method2136(-78, 73, 12.toByte())
        anInt6204++
    }

    override fun method2139(bool: Boolean, i: Byte) {
        val i_10_ = 23 / ((-60 - i) / 38)
        anInt6207++
    }
}
