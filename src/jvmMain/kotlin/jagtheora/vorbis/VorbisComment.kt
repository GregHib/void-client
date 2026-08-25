package jagtheora.vorbis

import jagtheora.misc.SimplePeer

actual class VorbisComment : SimplePeer() {
    init {
        init()
        check(!this.b())
    }

    actual external override fun clear()

    actual companion object {
        /*protected*/ actual external fun init()
    }
}
