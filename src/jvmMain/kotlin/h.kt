import AbstractModelRenderer
import Disposable
import RSFont
import FontDefinition
import Sprite
import SpriteImage

/* h - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeFontRenderer
*/
actual class h actual constructor(var_oa: oa?, var_ya: ya?, fontDefinition: FontDefinition?, spriteImages: Array<SpriteImage>, abstractModelRenderers: Array<AbstractModelRenderer?>?) : RSFont(var_oa, fontDefinition), Disposable {
    actual var nativeid: Long = 0

    init {
        val `is` = arrayOfNulls<ByteArray>(spriteImages.size)
        val is_0_ = IntArray(spriteImages.size)
        val is_1_ = IntArray(spriteImages.size)
        val is_2_ = IntArray(spriteImages.size)
        val is_3_ = IntArray(spriteImages.size)
        for (i in spriteImages.indices) {
            `is`[i] = spriteImages[i]!!.aByteArray2699
            is_0_[i] = spriteImages[i]!!.anInt2702
            is_1_[i] = spriteImages[i]!!.anInt2696
            is_2_[i] = spriteImages[i]!!.anInt2703
            is_3_[i] = spriteImages[i]!!.anInt2700
        }
        JA(var_oa, var_ya, `is`, is_0_, is_1_, is_2_, is_3_)
    }

    actual fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    actual external override fun w(bool: Boolean)

    actual external override fun fa(c: Char, i: Int, i_4_: Int, i_5_: Int, bool: Boolean)

    actual override fun method2578(c: Char, i: Int, i_6_: Int, i_7_: Int, bool: Boolean, var_sprite: Sprite?, i_8_: Int, i_9_: Int) {
        NA(c, i, i_6_, i_7_, bool, var_sprite, i_8_, i_9_)
    }

    /*private*/ actual external fun NA(c: Char, i: Int, i_10_: Int, i_11_: Int, bool: Boolean, var_sprite: Sprite?, i_12_: Int, i_13_: Int)

    /*private*/ actual external fun JA(var_oa: oa?, var_ya: ya?, `is`: Array<ByteArray?>?, is_14_: IntArray?, is_15_: IntArray?, is_16_: IntArray?, is_17_: IntArray?)
}
