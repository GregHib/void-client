package jagtheora.theora

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

actual class SetupInfo : SimplePeer() {
    actual external fun decodeHeader(arg0: TheoraInfo?, arg1: TheoraComment?, arg2: OggPacket?): Int

    actual external override fun clear()
}
