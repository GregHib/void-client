package jagtheora.theora

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

actual class DecoderContext actual constructor(arg0: TheoraInfo?, arg1: SetupInfo?) : SimplePeer() {
    actual fun granuleFrame(arg0: GranulePos?): Long {
        TODO("Not yet implemented")
    }

    actual override fun clear() {
    }

    actual fun setPostProcessingLevel(arg0: Int): Int {
        TODO("Not yet implemented")
    }

    actual fun decodePacketIn(arg0: OggPacket?, arg1: GranulePos?): Int {
        TODO("Not yet implemented")
    }

    actual val maxPostProcessingLevel: Int
        get() = TODO("Not yet implemented")

    actual fun granuleTime(arg0: GranulePos?): Double {
        TODO("Not yet implemented")
    }

    actual fun setGranulePosition(arg0: Long): Int {
        TODO("Not yet implemented")
    }

    actual fun init(arg0: TheoraInfo?, arg1: SetupInfo?) {
    }

    actual fun decodeFrame(arg0: Frame?): Int {
        TODO("Not yet implemented")
    }
}