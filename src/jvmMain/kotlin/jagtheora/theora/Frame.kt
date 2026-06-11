package jagtheora.theora

import jagtheora.misc.SimplePeer

class Frame(val a: Int, val b: Int) : SimplePeer() {
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
