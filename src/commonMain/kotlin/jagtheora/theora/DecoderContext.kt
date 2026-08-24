package jagtheora.theora

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

class DecoderContext(arg0: TheoraInfo?, arg1: SetupInfo?) : SimplePeer() {
    init {
        this.init(arg0, arg1)
        require(!this.b()) { "" }
    }

    external fun granuleFrame(arg0: GranulePos?): Long

    external override fun clear()

    external fun setPostProcessingLevel(arg0: Int): Int

    external fun decodePacketIn(arg0: OggPacket?, arg1: GranulePos?): Int

    val maxPostProcessingLevel: Int
        external get

    external fun granuleTime(arg0: GranulePos?): Double

    private external fun setGranulePosition(arg0: Long): Int

    private external fun init(arg0: TheoraInfo?, arg1: SetupInfo?)

    external fun decodeFrame(arg0: Frame?): Int
}
