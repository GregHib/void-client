package jagtheora.theora

import jagtheora.misc.SimplePeer

class GranulePos : SimplePeer() {
    private val position: Long = 0

    external override fun clear()

    companion object {
        init {
            init()
        }

        protected external fun init()
    }
}
