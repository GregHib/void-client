package jagtheora.theora

import jagtheora.misc.SimplePeer

expect class GranulePos() : SimplePeer {
    val position: Long

    override fun clear()

    companion object {
        /*protected*/ fun init()
    }
}
