package external

import Disposable
import RenderNode

/* ba - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeRenderTarget
*/
expect class ba internal constructor(var_oa: oa?) : RenderNode, Disposable {
    var nativeid: Long

    fun finalize()

    override fun w(bool: Boolean)
}
