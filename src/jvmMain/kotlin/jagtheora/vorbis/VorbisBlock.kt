package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

actual class VorbisBlock actual constructor(arg0: DSPState?) : SimplePeer() {
    init {
        this.init(arg0)
        check(!this.b())
    }

    actual external override fun clear()

    /*private*/ actual external fun init(arg0: DSPState?)

    actual external fun synthesis(arg0: OggPacket?): Int
}
