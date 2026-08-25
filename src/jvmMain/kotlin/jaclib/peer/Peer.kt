package jaclib.peer

import kotlin.jvm.JvmStatic

abstract actual class Peer /*protected*/ actual constructor() {
    /*protected*/ actual var reference: PeerReference? = null

    /*protected*/ actual fun a(arg0: Boolean): Boolean {
        return this.reference!!.a((-67).toByte())
    }

    /*protected*/ actual open fun a(): Long {
        return this.reference!!.a(false)
    }

    actual companion object {
        init {
            init(PeerReference::class.java)
        }

        @JvmStatic
        /*private*/ actual external fun init(arg0: Class<*>?)
    }
}
