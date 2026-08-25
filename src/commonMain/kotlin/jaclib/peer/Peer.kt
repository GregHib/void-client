package jaclib.peer

import lang.Class
import kotlin.jvm.JvmStatic

expect abstract class Peer constructor() {
    var reference: PeerReference?

    fun a(arg0: Boolean): Boolean 

    open fun a(): Long 

    companion object {
        @JvmStatic
        fun init(arg0: Class<*>?)
    }
}
