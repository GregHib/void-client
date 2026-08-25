package jagtheora.theora

import jagtheora.misc.SimplePeer

expect class TheoraComment() : SimplePeer {
    override fun clear()

    companion object {
        /*protected*/ fun init()
    }
}
