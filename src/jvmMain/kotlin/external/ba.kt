package external

import Disposable
import RenderNode

/* ba - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeRenderTarget
*/
actual class ba internal actual constructor(var_oa: oa?) : RenderNode(), Disposable {
    actual var nativeid: Long = 0

    /*protected*/ actual fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    actual external override fun w(bool: Boolean)
}
