package jagtheora.theora

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

expect class DecoderContext(arg0: TheoraInfo?, arg1: SetupInfo?) : SimplePeer {

    fun granuleFrame(arg0: GranulePos?): Long

    override fun clear()

    fun setPostProcessingLevel(arg0: Int): Int

    fun decodePacketIn(arg0: OggPacket?, arg1: GranulePos?): Int

    val maxPostProcessingLevel: Int
        get

    fun granuleTime(arg0: GranulePos?): Double

    fun setGranulePosition(arg0: Long): Int

    fun init(arg0: TheoraInfo?, arg1: SetupInfo?)

    fun decodeFrame(arg0: Frame?): Int
}
