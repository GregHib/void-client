import Disposable
import Sprite

/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 * NativeSpriteRenderer
 */
actual class na actual constructor(var_oa: oa?, var_ya: ya?, i: Int, i_2_: Int, `is`: IntArray?, is_3_: IntArray?) : Sprite(), Disposable {

    actual var nativeid: Long = 0

    actual external override fun w(bool: Boolean)

    /*protected*/ actual fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    /*private*/ actual external fun ma(var_oa: oa?, var_ya: ya?, i: Int, i_0_: Int, `is`: IntArray?, is_1_: IntArray?)

    init {
        ma(var_oa, var_ya, i, i_2_, `is`, is_3_)
    }
}
