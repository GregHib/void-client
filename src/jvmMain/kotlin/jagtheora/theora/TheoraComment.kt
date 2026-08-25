package jagtheora.theora

import jagtheora.misc.SimplePeer

actual class TheoraComment : SimplePeer() {
    init {
        init()
        check(!this.b())
    }

    actual external override fun clear()

    companion object {
        /*protected*/ actual external fun init()
    }
}
