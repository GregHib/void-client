package jagtheora.theora

import jagtheora.misc.SimplePeer
import jagtheora.theora.TheoraCommentStatics.init

class TheoraComment : SimplePeer() {
    init {
        init()
        check(!this.b())
    }

    external override fun clear()
}
