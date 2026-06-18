package jaclib.peer

import java.lang.ref.WeakReference


abstract class PeerReference protected constructor(arg0: Peer?, arg1: hb?) : WeakReference<Any?>(arg0, arg1?.a) {
    var a: PeerReference? = null

    private var peer: Long = 0

    var b: PeerReference? = null

    init {
        arg1?.a(this, -22143)
    }

    protected abstract fun releasePeer(arg0: Long): Long

    fun a(arg0: Byte): Boolean {
        return this.peer != 0L
    }

    private fun setPeer(arg0: Long) {
        this.a(false)
        this.peer = arg0
    }

    fun a(arg0: Boolean): Long {
        val local11: Long
        if (this.peer == 0L) {
            local11 = 0L
        } else {
            local11 = this.releasePeer(this.peer)
            this.peer = 0L
        }
        return local11
    }
}
