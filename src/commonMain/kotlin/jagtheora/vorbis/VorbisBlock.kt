package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

expect class VorbisBlock(arg0: DSPState?) : SimplePeer {

    override fun clear()

    fun init(arg0: DSPState?)

    fun synthesis(arg0: OggPacket?): Int
}
