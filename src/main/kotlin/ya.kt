/* ya - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeTextureManager
*/
class ya(var_oa: oa?, i: Int) : ShaderProgram(), Interface19 {
    var nativeid: Long = 0

    external override fun w(bool: Boolean)

    external fun ga()

    protected fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    private external fun aa(var_oa: oa?, i: Int)

    external fun r()

    init {
        aa(var_oa, i)
    }
}
