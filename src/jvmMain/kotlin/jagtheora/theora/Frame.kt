package jagtheora.theora

import jagtheora.misc.SimplePeer
import kotlin.jvm.JvmField

class Frame(@JvmField val a: Int, @JvmField val b: Int) : SimplePeer() {

    val pixels: IntArray

    init {
        this.pixels = IntArray(this.a * this.b)
    }

    external override fun clear()

    companion object {
        init {
            init()
        }

        protected external fun init()
    }
}
