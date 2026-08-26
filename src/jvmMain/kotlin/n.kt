import AbstractModelRenderer
import Disposable
import RSFont
import FontDefinition
import Sprite
import SpriteImage

/* n - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeFontRendererAlt
*/
actual class n actual constructor(var_oa: oa?, var_ya: ya?, fontDefinition: FontDefinition?, spriteImages: Array<SpriteImage>, abstractModelRenderers: Array<AbstractModelRenderer?>?) : RSFont(var_oa, fontDefinition), Disposable {
    actual var nativeid: Long = 0

    /*private*/ actual external fun S(var_oa: oa?, var_ya: ya?, `is`: Array<ByteArray?>?, is_0_: IntArray?, is_1_: IntArray?, is_2_: IntArray?, is_3_: IntArray?, is_4_: IntArray?)

    init {
        val `is` = arrayOfNulls<ByteArray>(spriteImages.size)
        val is_5_ = IntArray(spriteImages.size)
        val is_6_ = IntArray(spriteImages.size)
        val is_7_ = IntArray(spriteImages.size)
        val is_8_ = IntArray(spriteImages.size)
        for (i in spriteImages.indices) {
            `is`[i] = spriteImages[i]!!.aByteArray2699
            is_5_[i] = spriteImages[i]!!.anInt2702
            is_6_[i] = spriteImages[i]!!.anInt2696
            is_7_[i] = spriteImages[i]!!.anInt2703
            is_8_[i] = spriteImages[i]!!.anInt2700
        }
        S(var_oa, var_ya, `is`, spriteImages[0]!!.anIntArray2697, is_5_, is_6_, is_7_, is_8_)
    }

    actual external override fun w(bool: Boolean)

    /*protected*/ actual fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    actual external override fun fa(c: Char, i: Int, i_9_: Int, i_10_: Int, bool: Boolean)

    /*private*/ actual external fun PA(c: Char, i: Int, i_11_: Int, i_12_: Int, bool: Boolean, var_sprite: Sprite?, i_13_: Int, i_14_: Int)

    actual override fun method2578(c: Char, i: Int, i_15_: Int, i_16_: Int, bool: Boolean, var_sprite: Sprite?, i_17_: Int, i_18_: Int) {
        PA(c, i, i_15_, i_16_, bool, var_sprite, i_17_, i_18_)
    }
}
