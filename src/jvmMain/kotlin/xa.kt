import Disposable
import Marker

/* xa - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeTextureHandle
*/
actual class xa actual constructor(i: Int, i_1_: Int) : Marker, Disposable {

    actual var nativeid: Long = 0L

    /*private*/ actual external fun r(i: Int, i_0_: Int)

    /*private*/ actual external fun va(l: Long, bool: Boolean)

    actual override fun w(bool: Boolean) {
        va(this.nativeid, bool)
    }

    /*protected*/ actual fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    init {
        r(i, i_1_)
    }
}
