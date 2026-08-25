package jaclib.peer

import kotlin.jvm.JvmStatic

actual abstract class Peer actual constructor() {
    actual var reference: PeerReference?
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun a(arg0: Boolean): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun a(): Long {
        TODO("Not yet implemented")
    }

    actual companion object {
        @JvmStatic
        actual fun init(arg0: Class<*>) {
        }
    }
}