package jagtheora.theora

import jagtheora.misc.SimplePeer
import kotlin.jvm.JvmField

actual class Frame actual constructor(@JvmField actual val a: Int, @JvmField actual val b: Int) : SimplePeer() {

    actual val pixels: IntArray = IntArray(this.a * this.b)

    actual external override fun clear()

    actual companion object {
        init {
            init()
        }

        /*protected*/ actual external fun init()
    }
}
