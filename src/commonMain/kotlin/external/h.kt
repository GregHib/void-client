package external

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
expect class h(var_oa: oa?, var_ya: ya?, fontDefinition: FontDefinition?, spriteImages: Array<SpriteImage>, abstractModelRenderers: Array<AbstractModelRenderer?>?) : RSFont, Disposable {
    var nativeid: Long

    fun finalize()

    override fun w(bool: Boolean)

    override fun fa(c: Char, i: Int, i_4_: Int, i_5_: Int, bool: Boolean)

    override fun method2578(c: Char, i: Int, i_6_: Int, i_7_: Int, bool: Boolean, var_sprite: Sprite?, i_8_: Int, i_9_: Int)

    fun NA(c: Char, i: Int, i_10_: Int, i_11_: Int, bool: Boolean, var_sprite: Sprite?, i_12_: Int, i_13_: Int)

    fun JA(var_oa: oa?, var_ya: ya?, `is`: Array<ByteArray?>?, is_14_: IntArray?, is_15_: IntArray?, is_16_: IntArray?, is_17_: IntArray?)
}
