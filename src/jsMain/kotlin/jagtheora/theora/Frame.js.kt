package jagtheora.theora

import jagtheora.misc.SimplePeer

actual class Frame actual constructor(actual val a: Int, actual val b: Int) : SimplePeer() {
    actual val pixels: IntArray
        get() = TODO("Not yet implemented")

    actual override fun clear() {
    }

    actual companion object {
        actual fun init() {
        }
    }
}