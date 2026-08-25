package jagtheora.theora

import jagtheora.misc.SimplePeer

actual class GranulePos : SimplePeer() {
    /*private*/ actual val position: Long = 0

    actual external override fun clear()

    companion object {
        init {
            init()
        }

        /*protected*/ actual external fun init()
    }
}
