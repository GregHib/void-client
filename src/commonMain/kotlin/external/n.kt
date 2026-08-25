package external

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
expect class n(var_oa: oa?, var_ya: ya?, fontDefinition: FontDefinition?, spriteImages: Array<SpriteImage>, abstractModelRenderers: Array<AbstractModelRenderer?>?) : RSFont, Disposable {
    var nativeid: Long

    fun S(var_oa: oa?, var_ya: ya?, `is`: Array<ByteArray?>?, is_0_: IntArray?, is_1_: IntArray?, is_2_: IntArray?, is_3_: IntArray?, is_4_: IntArray?)

    override fun w(bool: Boolean)

    fun finalize()

    override fun fa(c: Char, i: Int, i_9_: Int, i_10_: Int, bool: Boolean)

    fun PA(c: Char, i: Int, i_11_: Int, i_12_: Int, bool: Boolean, var_sprite: Sprite?, i_13_: Int, i_14_: Int)

    override fun method2578(c: Char, i: Int, i_15_: Int, i_16_: Int, bool: Boolean, var_sprite: Sprite?, i_17_: Int, i_18_: Int)
}
