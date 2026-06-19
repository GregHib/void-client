import AntialiasOptionStateStatics.method1819
import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import kotlin.math.cos
import kotlin.math.sin
import OggBitstreamDecoderStatics.anInt6863
import OggBitstreamDecoderStatics.aFloatArray6867

abstract class OggBitstreamDecoder internal constructor(var anOggStreamState6869: OggStreamState) : LinkedListNode() {
    var anInt6868: Int = 0
    abstract fun method2961(i: Byte)

    fun method2963(oggpacket: OggPacket, i: Int) {
        method2964((-120).toByte(), oggpacket)
        if (i != 16384) aFloatArray6867 = null
        anInt6863++
        this.anInt6868++
    }

    abstract fun method2964(i: Byte, oggpacket: OggPacket)
}
