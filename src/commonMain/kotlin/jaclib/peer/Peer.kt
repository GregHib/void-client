package jaclib.peer

import kotlin.jvm.JvmStatic

abstract expect class Peer constructor() {
    var reference: PeerReference?

    fun a(arg0: Boolean): Boolean 

    open fun a(): Long 

    companion object {
        @JvmStatic
        fun init(arg0: Class<*>?)
    }
}
