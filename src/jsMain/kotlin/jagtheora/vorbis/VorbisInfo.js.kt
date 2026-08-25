package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

actual class VorbisInfo : SimplePeer() {
    actual var rate: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    actual var channels: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun headerIn(arg0: VorbisComment?, arg1: OggPacket?): Int {
        TODO("Not yet implemented")
    }

    actual override fun clear() {
    }
}