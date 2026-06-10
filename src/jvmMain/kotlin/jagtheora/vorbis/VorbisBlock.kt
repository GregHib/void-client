package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

class VorbisBlock(arg0: DSPState?) : SimplePeer() {
    init {
        this.init(arg0)
        check(!this.b())
    }

    external override fun clear()

    private external fun init(arg0: DSPState?)

    external fun synthesis(arg0: OggPacket?): Int
}
