/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class na(var_oa: oa?, var_ya: ya?, i: Int, i_2_: Int, `is`: IntArray?, is_3_: IntArray?) : aa(), Interface19 {
    @JvmField
    var nativeid: Long = 0

    external override fun w(bool: Boolean)

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    private external fun ma(var_oa: oa?, var_ya: ya?, i: Int, i_0_: Int, `is`: IntArray?, is_1_: IntArray?)

    init {
        ma(var_oa, var_ya, i, i_2_, `is`, is_3_)
    }
}
