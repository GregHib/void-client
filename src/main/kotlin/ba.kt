/* ba - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeRenderTarget
*/
class ba internal constructor(var_oa: oa?) : RenderNode(), Interface19 {
    var nativeid: Long = 0

    protected fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    external override fun w(bool: Boolean)
}
