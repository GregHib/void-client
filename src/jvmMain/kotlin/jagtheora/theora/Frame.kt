package jagtheora.theora

import jagtheora.misc.SimplePeer
import kotlin.jvm.JvmField

actual class Frame actual constructor(@JvmField actual val a: Int, @JvmField actual val b: Int) : SimplePeer() {

    actual val pixels: IntArray

    init {
        this.pixels = IntArray(this.a * this.b)
    }

    actual external override fun clear()

    companion object {
        init {
            init()
        }

        /*protected*/ actual external fun init()
    }
}
