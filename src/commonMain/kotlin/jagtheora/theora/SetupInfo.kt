package jagtheora.theora

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

expect class SetupInfo() : SimplePeer {
    fun decodeHeader(arg0: TheoraInfo?, arg1: TheoraComment?, arg2: OggPacket?): Int

    override fun clear()
}
