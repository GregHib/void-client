import Class346.Companion.method2699
import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import jagtheora.vorbis.DSPState
import jagtheora.vorbis.VorbisBlock
import jagtheora.vorbis.VorbisComment
import jagtheora.vorbis.VorbisInfo
import java.net.URL

class Class348_Sub23_Sub1 internal constructor(oggstreamstate: OggStreamState) : Class348_Sub23(oggstreamstate) {
    private var aDSPState8993: DSPState? = null
    private var aClass163_8994: Class163? = null
    private var aClass348_Sub16_Sub2_8995: Class348_Sub16_Sub2? = null
    private var aVorbisBlock9000: VorbisBlock? = null
    private var anInt9001 = 0
    private var aVorbisComment9002: VorbisComment?
    private var aDouble9005 = 0.0
    private val aVorbisInfo9006 = VorbisInfo()

    init {
        aVorbisComment9002 = VorbisComment()
    }

    fun method2969(i: Int): Int {
        if (i != -11020) aVorbisComment9002 = null
        anInt8989++
        if (aClass348_Sub16_Sub2_8995 != null) return aClass348_Sub16_Sub2_8995!!.method2829(i + 10949)
        return 0
    }

    fun method2971(i: Int): Class348_Sub16_Sub2? {
        if (i > -6) return null
        anInt8997++
        return aClass348_Sub16_Sub2_8995
    }

    fun method2973(i: Byte): Double {
        anInt8999++
        var d = aDouble9005
        if (i.toInt() != 123) return 0.20418061173976032
        if (aClass348_Sub16_Sub2_8995 != null) {
            d = aClass348_Sub16_Sub2_8995!!.method2837(i.toInt() xor 0x5599.inv())
            if (d < 0.0) d = aDouble9005
        }
        return -(256.0f / Class22.anInt339.toFloat()).toDouble() + d
    }

    override fun method2961(i: Byte) {
        if (aVorbisBlock9000 != null) aVorbisBlock9000!!.a()
        anInt9003++
        if (aDSPState8993 != null) aDSPState8993!!.a()
        aVorbisComment9002!!.a()
        if (i.toInt() != 13) method2967(-99, null, -83, -13, 63)
        aVorbisInfo9006.a()
        if (aClass348_Sub16_Sub2_8995 != null) aClass348_Sub16_Sub2_8995!!.method2836(-1)
    }

    override fun method2964(i: Byte, oggpacket: OggPacket) {
        anInt8990++
        if (this.anInt6868 < 3) {
            val i_7_ = aVorbisInfo9006.headerIn(aVorbisComment9002, oggpacket)
            check(i_7_ >= 0) { i_7_.toString() }
            if (this.anInt6868 == 2) {
                if (aVorbisInfo9006.channels > 2 || aVorbisInfo9006.channels < 1) throw RuntimeException(aVorbisInfo9006.channels.toString())
                aDSPState8993 = DSPState(aVorbisInfo9006)
                aVorbisBlock9000 = VorbisBlock(aDSPState8993)
                aClass163_8994 = Class163(aVorbisInfo9006.rate, Class22.anInt339)
                aClass348_Sub16_Sub2_8995 = Class348_Sub16_Sub2(aVorbisInfo9006.channels)
            }
        } else {
            if (aVorbisBlock9000!!.synthesis(oggpacket) == 0) aDSPState8993!!.blockIn(aVorbisBlock9000)
            val fs = aDSPState8993!!.pcmOut(aVorbisInfo9006.channels)
            aDouble9005 = aDSPState8993!!.granuleTime()
            if (aDouble9005 == -1.0) aDouble9005 = (anInt9001.toFloat() / aVorbisInfo9006.rate.toFloat()).toDouble()
            aDSPState8993!!.read(fs!![0]!!.size)
            anInt9001 += fs[0]!!.size
            val class348_sub42_sub4 = aClass348_Sub16_Sub2_8995!!.method2838(fs[0]!!.size, aDouble9005, 1401320384)
            method2699(16383, (class348_sub42_sub4!!.aShortArrayArray9518), fs)
            for (i_8_ in 0..<aVorbisInfo9006.channels) class348_sub42_sub4.aShortArrayArray9518[i_8_] = aClass163_8994!!.method1268(-56, (class348_sub42_sub4.aShortArrayArray9518[i_8_]!!))
            aClass348_Sub16_Sub2_8995!!.method2835(class348_sub42_sub4, 30700)
        }
        if (i > -91) method2961((-106).toByte())
    }

    companion object {
        @JvmField
        var anInt8989: Int = 0
        @JvmField
        var anInt8990: Int = 0
        @JvmField
        var anInt8991: Int = 0
        @JvmField
        var aClass297_8992: Class297? = null
        @JvmField
        var aByteArrayArray8996: Array<ByteArray?>? = null
        @JvmField
        var anInt8997: Int = 0
        @JvmField
        var anInt8998: Int = 0
        @JvmField
        var anInt8999: Int = 0
        @JvmField
        var anInt9003: Int = 0
        @JvmField
        var anInt9004: Int = 0
        @JvmStatic
        fun method2967(i: Int, class64: Class64?, i_0_: Int, i_1_: Int, i_2_: Int): Class30? {
            anInt8991++
            if (i_2_ != 2) aByteArrayArray8996 = null
            if (class64 == null) return null
            val class30 = Class30(i, i_1_, i_0_, class64.na(), class64.V(), class64.RA(), class64.fa(), class64.EA(), class64.HA(), class64.G())
            return class30
        }

        @JvmStatic
        fun method2968(i: Byte) {
            aClass297_8992 = null
            aByteArrayArray8996 = null
            if (i > -114) Companion.method2968((-12).toByte())
        }

        @JvmStatic
        fun method2970(i: Int, class348_sub49: Class348_Sub49): Class50_Sub3 {
            anInt8998++
            if (i != 2) Companion.method2972(null, -114, 15)
            return Class50_Sub3(class348_sub49.readShort(13638), class348_sub49.readShort(i + 13636), class348_sub49.readShort(13638), class348_sub49.readShort(i xor 0x3544), class348_sub49.readShort(13638), class348_sub49.readShort(i + 13636), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255))
        }

        @JvmStatic
        fun method2972(string: String?, i: Int, i_3_: Int): Boolean {
            anInt9004++
            if (aClass297_8992!!.aBoolean3777) {
                Class3.aClass161_125 = Class161()
                Class3.aClass161_125!!.anInt2143 = i
                Class3.aClass161_125!!.aString2147 = string
                if (Class8.aClass364_165 != Class55_Sub1.aClass364_5271) {
                    Class3.aClass161_125!!.anInt2138 = 50000 - -Class3.aClass161_125!!.anInt2143
                    Class3.aClass161_125!!.anInt2148 = 40000 - -Class3.aClass161_125!!.anInt2143
                }
                if (i < Class65.aClass110_Sub1Array1146!!.size && Class65.aClass110_Sub1Array1146!![i] != null) Class251.anInt3234 = (Class65.aClass110_Sub1Array1146!![i]!!.anInt1708)
                return true
            }
            var string_4_ = ""
            if (Class55_Sub1.aClass364_5271 != Class8.aClass364_165) string_4_ = ":" + (7000 + i)
            var string_5_ = ""
            if (Class239_Sub12.aString5966 != null) string_5_ = "/p=" + Class239_Sub12.aString5966
            val string_6_ = ("http://" + string + string_4_ + "/l=" + Class348_Sub33.anInt6967 + "/a=" + Class202.anInt2670 + string_5_ + "/j" + (if (!Class289.aBoolean3697) "0" else "1") + ",o" + (if (Class348_Sub37.aBoolean6997) "1" else "0") + ",a2")
            try {
                Class79.aClient1367!!.showDocument(URL(string_6_), "_self")
                if (i_3_ >= -17) aClass297_8992 = null
            } catch (exception: Exception) {
                return false
            }
            return true
        }
    }
}
