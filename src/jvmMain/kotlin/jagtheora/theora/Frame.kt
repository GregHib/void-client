package jagtheora.theora

import jagtheora.misc.SimplePeer
import jagtheora.theora.FrameStatics.init

class Frame(@JvmField val a: Int, @JvmField val b: Int) : SimplePeer() {
    @JvmField
    val pixels: IntArray

    init {
        this.pixels = IntArray(this.a * this.b)
    }

    external override fun clear()
}
