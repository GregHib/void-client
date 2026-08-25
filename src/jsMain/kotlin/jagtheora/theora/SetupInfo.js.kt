package jagtheora.theora

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

actual class SetupInfo : SimplePeer() {
    actual fun decodeHeader(arg0: TheoraInfo?, arg1: TheoraComment?, arg2: OggPacket?): Int {
        TODO("Not yet implemented")
    }

    actual override fun clear() {
    }
}