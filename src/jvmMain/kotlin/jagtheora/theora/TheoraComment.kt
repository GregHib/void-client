package jagtheora.theora

import jagtheora.misc.SimplePeer

class TheoraComment : SimplePeer() {
    init {
        init()
        check(!this.b())
    }

    external override fun clear()

    companion object {
        protected external fun init()
    }
}
