package external

import Disposable
import Marker

/* xa - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeTextureHandle
*/
class xa(i: Int, i_1_: Int) : Marker, Disposable {
    @JvmField
    var nativeid: Long = 0L

    private external fun r(i: Int, i_0_: Int)

    private external fun va(l: Long, bool: Boolean)

    override fun w(bool: Boolean) {
        va(this.nativeid, bool)
    }

    protected fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    init {
        r(i, i_1_)
    }
}
