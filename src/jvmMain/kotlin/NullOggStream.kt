import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import java.io.IOException
import java.net.Socket

class NullOggStream internal constructor(oggstreamstate: OggStreamState) : OggBitstreamDecoder(oggstreamstate) {
    override fun method2964(i: Byte, oggpacket: OggPacket) {
        if (i >= -91) anInt9041 = -51
        anInt9046++
    }

    override fun method2961(i: Byte) {
        anInt9045++
        if (i.toInt() != 13) method2961((-50).toByte())
    }

    companion object {

        var anInt9040: Int = 0

        var anInt9041: Int = 0

        var anIntArray9042: IntArray? = null

        var aString9043: String? = null

        var aShort9044: Short = 256

        var anInt9045: Int = 0

        var anInt9046: Int = 0

        @JvmStatic
        fun method2981(bool: Boolean) {
            anIntArray9042 = null
            if (bool != false) anInt9041 = -95
            aString9043 = null
        }

        @JvmStatic
        @Throws(IOException::class)
        fun method2982(socket: Socket, i: Byte, i_0_: Int): AbstractGameSocket {
            val i_1_ = -41 / ((i - -40) / 42)
            anInt9040++
            return SocketGameConnection(socket, i_0_)
        }
    }
}
