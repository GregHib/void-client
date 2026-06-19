import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import java.io.IOException
import java.net.Socket
import NullOggStreamStatics.anInt9041
import NullOggStreamStatics.anInt9045
import NullOggStreamStatics.anInt9046

class NullOggStream internal constructor(oggstreamstate: OggStreamState) : OggBitstreamDecoder(oggstreamstate) {
    override fun method2964(i: Byte, oggpacket: OggPacket) {
        if (i >= -91) anInt9041 = -51
        anInt9046++
    }

    override fun method2961(i: Byte) {
        anInt9045++
        if (i.toInt() != 13) method2961((-50).toByte())
    }
}
