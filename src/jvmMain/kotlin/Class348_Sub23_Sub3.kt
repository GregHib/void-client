import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import java.io.IOException
import java.net.Socket

class Class348_Sub23_Sub3 internal constructor(oggstreamstate: OggStreamState) : Class348_Sub23(oggstreamstate) {
    override fun method2964(i: Byte, oggpacket: OggPacket) {
        if (i >= -91) anInt9041 = -51
        anInt9046++
    }

    override fun method2961(i: Byte) {
        anInt9045++
        if (i.toInt() != 13) method2961((-50).toByte())
    }

    companion object {
        @JvmField
        var anInt9040: Int = 0
        @JvmField
        var anInt9041: Int = 0
        @JvmField
        var anIntArray9042: IntArray? = null
        @JvmField
        var aString9043: String? = null
        @JvmField
        var aShort9044: Short = 256
        @JvmField
        var anInt9045: Int = 0
        @JvmField
        var anInt9046: Int = 0

        @JvmStatic
        fun method2981(bool: Boolean) {
            anIntArray9042 = null
            if (bool != false) anInt9041 = -95
            aString9043 = null
        }

        @JvmStatic
        @Throws(IOException::class)
        fun method2982(socket: Socket, i: Byte, i_0_: Int): Class238 {
            val i_1_ = -41 / ((i - -40) / 42)
            anInt9040++
            return Class238_Sub1(socket, i_0_)
        }
    }
}
