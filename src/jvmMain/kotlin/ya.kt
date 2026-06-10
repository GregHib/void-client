/* ya - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ya(var_oa: oa?, i: Int) : za(), Interface19 {
    var nativeid: Long = 0

    external override fun w(bool: Boolean)

    external fun ga()

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    private external fun aa(var_oa: oa?, i: Int)

    external fun r()

    init {
        aa(var_oa, i)
    }
}
