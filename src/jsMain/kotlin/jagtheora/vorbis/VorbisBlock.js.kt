package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

actual class VorbisBlock actual constructor(arg0: DSPState?) : SimplePeer() {
    actual override fun clear() {
    }

    actual fun init(arg0: DSPState?) {
    }

    actual fun synthesis(arg0: OggPacket?): Int {
        TODO("Not yet implemented")
    }
}