package jagtheora.theora

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

actual class DecoderContext actual constructor(arg0: TheoraInfo?, arg1: SetupInfo?) : SimplePeer() {
    init {
        this.init(arg0, arg1)
        require(!this.b()) { "" }
    }

    actual external fun granuleFrame(arg0: GranulePos?): Long

    actual external override fun clear()

    actual external fun setPostProcessingLevel(arg0: Int): Int

    actual external fun decodePacketIn(arg0: OggPacket?, arg1: GranulePos?): Int

    actual val maxPostProcessingLevel: Int
        external get

    actual external fun granuleTime(arg0: GranulePos?): Double

    /*private*/ actual external fun setGranulePosition(arg0: Long): Int

    /*private*/ actual external fun init(arg0: TheoraInfo?, arg1: SetupInfo?)

    actual external fun decodeFrame(arg0: Frame?): Int
}
