package jagtheora.vorbis

import jagtheora.misc.SimplePeer

expect class VorbisComment() : SimplePeer {

    override fun clear()

    companion object {
        fun init()
    }
}
