package jagtheora.theora

import jagtheora.misc.SimplePeer

class Frame(@JvmField val a: Int, @JvmField val b: Int) : SimplePeer() {
    @JvmField
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
