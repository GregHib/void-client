import ParticleDetailOptionStateStatics.method1793
import WaterMaterialPassStatics.method2152
import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import KaraokeSubtitleStreamStatics.anInt9052
import KaraokeSubtitleStreamStatics.anInt9053
import KaraokeSubtitleStreamStatics.anInt9056
import KaraokeSubtitleStreamStatics.anInt9060
import KaraokeSubtitleStreamStatics.anInt9061
import KaraokeSubtitleStreamStatics.anInt9063

class KaraokeSubtitleStream internal constructor(oggstreamstate: OggStreamState) : OggBitstreamDecoder(oggstreamstate) {
    private var aFloat9048 = 0f
    private var aString9051: String? = null
    private var anInt9054 = 0
    private var anInt9055 = 0
    private var aString9057: String? = null
    private var aString9058: String? = null
    private var aFloat9062 = 0f
    override fun method2961(i: Byte) {
        anInt9056++
        if (i.toInt() != 13) aString9058 = null
    }

    fun method2983(i: Byte): Float {
        if (i <= 61) return -0.49539495f
        anInt9052++
        return aFloat9062
    }

    fun method2984(i: Byte): Float {
        anInt9060++
        if (i.toInt() != 97) aFloat9048 = -0.6790166f
        return aFloat9048
    }

    override fun method2964(i: Byte, oggpacket: OggPacket) {
        anInt9063++
        if (this.anInt6868 <= 0 || "SUB" == aString9057) {
            val class348_sub49 = ByteBuffer(oggpacket.data)
            val i_2_ = class348_sub49.readUnsignedByte(255)
            if (this.anInt6868 <= 8) {
                check((i_2_ or 0x80) != 0)
                if (this.anInt6868 == 0) {
                    class348_sub49.anInt7197 += 23
                    anInt9055 = class348_sub49.method3359(-89)
                    anInt9054 = class348_sub49.method3359(-41)
                    check(!(anInt9055 == 0 || anInt9054 == 0))
                    val class348_sub49_3_ = ByteBuffer(16)
                    class348_sub49.method3389(2147483647, 0, 16, (class348_sub49_3_.aByteArray7154!!))
                    aString9051 = class348_sub49_3_.readString((-91).toByte())
                    class348_sub49_3_.anInt7197 = 0
                    class348_sub49.method3389(2147483647, 0, 16, (class348_sub49_3_.aByteArray7154!!))
                    aString9057 = class348_sub49_3_.readString((-40).toByte())
                }
            } else {
                if (i_2_ == 0) {
                    val l = class348_sub49.method3332(109.toByte())
                    val l_4_ = class348_sub49.method3332(90.toByte())
                    val l_5_ = class348_sub49.method3332(122.toByte())
                    check(!(l < 0 || l_4_ < 0 || l_5_ < 0 || l_5_ > l))
                    aFloat9062 = (anInt9054.toLong() * l).toFloat() / anInt9055.toFloat()
                    aFloat9048 = (((l - -l_4_) * anInt9054.toLong()).toFloat() / anInt9055.toFloat())
                    val i_6_ = class348_sub49.method3359(-93)
                    check(!(i_6_ < 0 || i_6_ > (-class348_sub49.anInt7197 + (class348_sub49.aByteArray7154)!!.size)))
                    aString9058 = (method1793(class348_sub49.aByteArray7154!!, class348_sub49.anInt7197, -123, i_6_))
                }
                if ((i_2_ or 0x80) != 0) return
            }
            if (i >= -91) anInt9055 = 88
        }
    }

    fun method2986(i: Int): String? {
        anInt9053++
        if (i < 26) method2986(-122)
        return aString9051
    }

    fun method2989(i: Int): String? {
        val i_12_ = 4 / ((i - -63) / 50)
        anInt9061++
        return aString9058
    }
}
