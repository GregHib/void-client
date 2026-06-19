import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage1Dub
import jaggl.OpenGLStatics.glTexParameteri
import GlTexture1DStatics.anInt8554
import GlTexture1DStatics.anInt8555

class GlTexture1D internal constructor(var_ha_Sub2: OpenGlRenderer, i: Int, i_0_: Int, `is`: ByteArray?, i_1_: Int) : GlTexture(var_ha_Sub2, 3552, i, i_0_, false) {
    private val anInt8556: Int
    override fun method37(i: Int) {
        if (i == -3022) anInt8554++
    }

    fun method1972(i: Byte, bool: Boolean) {
        this.aHa_Sub2_4851.method3771((-114).toByte(), this)
        val i_2_ = 59 / ((-49 - i) / 40)
        anInt8555++
        glTexParameteri(this.anInt4849, 10242, if (!bool) 33071 else 10497)
    }

    init {
        try {
            anInt8556 = i_0_
            this.aHa_Sub2_4851.method3771((-94).toByte(), this)
            glPixelStorei(3317, 1)
            glTexImage1Dub(this.anInt4849, 0, this.anInt4858, anInt8556, 0, i_1_, 5121, `is`, 0)
            glPixelStorei(3317, 4)
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("wha.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_1_ + ')'))
        }
    }
}
