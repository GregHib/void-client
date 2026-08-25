package external

import Disposable
import ShaderProgram

/* ya - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeTextureManager
*/
actual class ya actual constructor(var_oa: oa?, i: Int) : ShaderProgram(), Disposable {
    actual var nativeid: Long = 0

    actual external override fun w(bool: Boolean)

    actual external fun ga()

    /*protected*/ actual fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    /*private*/ actual external fun aa(var_oa: oa?, i: Int)

    actual external fun r()

    init {
        aa(var_oa, i)
    }
}
