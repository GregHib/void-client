package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.vorbis.VorbisCommentStatics.init

class VorbisComment : SimplePeer() {
    init {
        init()
        check(!this.b())
    }

    external override fun clear()
}
