package jagtheora.vorbis

import jagtheora.misc.SimplePeer

class VorbisComment : SimplePeer() {
    init {
        init()
        check(!this.b())
    }

    external override fun clear()

    companion object {
        protected external fun init()
    }
}
