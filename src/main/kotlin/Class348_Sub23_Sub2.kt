import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import jagtheora.theora.*

class Class348_Sub23_Sub2 internal constructor(oggstreamstate: OggStreamState) : Class348_Sub23(oggstreamstate) {
    private var aTheoraInfo9007: TheoraInfo?
    private var aBoolean9008 = false
    private var anInt9009 = 0
    private val aTheoraComment9010: TheoraComment
    private var aBoolean9014 = false
    private var aDouble9015 = 0.0
    private var aBoolean9016 = false
    private var aLong9018: Long = 0
    private var aGranulePos9019: GranulePos? = null
    private var aClass105_9020: Class105? = null
    private var aFrame9024: Frame? = null
    private var anInt9027 = 0
    private val aBoolean9028 = false
    private var aDecoderContext9032: DecoderContext? = null
    private val aSetupInfo9035 = SetupInfo()
    fun method2975(var_ha: ha, i: Int): Class105? {
        anInt9026++
        if (aFrame9024 == null) return null
        if (!aBoolean9014 && aClass105_9020 != null) return aClass105_9020
        aClass105_9020 = var_ha.method3711(aFrame9024!!.pixels, i, aFrame9024!!.a, aFrame9024!!.a, aFrame9024!!.b, false)
        aBoolean9014 = false
        return aClass105_9020
    }

    init {
        aTheoraInfo9007 = TheoraInfo()
        aTheoraComment9010 = TheoraComment()
    }

    override fun method2961(i: Byte) {
        if (aFrame9024 != null) aFrame9024!!.a()
        anInt9021++
        if (aDecoderContext9032 != null) {
            aDecoderContext9032!!.a()
            aDecoderContext9032 = null
        }
        if (i.toInt() != 13) method2979(115)
        if (aGranulePos9019 != null) {
            aGranulePos9019!!.a()
            aGranulePos9019 = null
        }
        aTheoraInfo9007!!.a()
        aTheoraComment9010.a()
        aSetupInfo9035.a()
    }

    fun method2976(i: Int): Boolean {
        anInt9012++
        if (i != -1) aTheoraInfo9007 = null
        return aBoolean9016
    }

    fun method2977(i: Int): Float {
        anInt9022++
        if (!aBoolean9016 || aTheoraInfo9007!!.b()) return 0.0f
        if (i != 0) anInt9027 = -65
        return (aTheoraInfo9007!!.fpsNumerator.toFloat() / aTheoraInfo9007!!.fpsDenominator.toFloat())
    }

    private fun method2978(i: Int, i_0_: Byte) {
        anInt9030++
        anInt9009 = i
        if (aBoolean9016) {
            if (anInt9009 > anInt9027) anInt9009 = anInt9027
            if (anInt9009 < 0) anInt9009 = 0
            aDecoderContext9032!!.setPostProcessingLevel(anInt9009)
        }
        if (i_0_ > -127) aClass105_9020 = null
    }

    fun method2979(i: Int): Long {
        anInt9025++
        if (i != 30) method2978(-126, (-43).toByte())
        return aLong9018
    }

    fun method2980(i: Byte): Double {
        anInt9013++
        if (i.toInt() != 100) method2974(102)
        return aDouble9015
    }

    override fun method2964(i: Byte, oggpacket: OggPacket) {
        anInt9017++
        if (i < -91) {
            if (aBoolean9016) {
                aLong9018 = Class62.method599(-102)
                val i_1_ = aDecoderContext9032!!.decodePacketIn(oggpacket, aGranulePos9019)
                check(i_1_ >= 0) { i_1_.toString() }
                aDecoderContext9032!!.granuleFrame(aGranulePos9019)
                aDouble9015 = aDecoderContext9032!!.granuleTime(aGranulePos9019)
                if (aBoolean9008) {
                    val bool = oggpacket!!.isKeyFrame == 1
                    if (bool) aBoolean9008 = false
                    else return
                }
                if (!aBoolean9028 || oggpacket!!.isKeyFrame == 1) {
                    check(aDecoderContext9032!!.decodeFrame(aFrame9024) == 0) { i_1_.toString() }
                    aBoolean9014 = true
                }
            } else {
                val i_2_ = aSetupInfo9035.decodeHeader(aTheoraInfo9007, aTheoraComment9010, oggpacket)
                if (i_2_ == 0) {
                    aBoolean9016 = true
                    check(!(aTheoraInfo9007!!.frameWidth > 2048 || aTheoraInfo9007!!.frameHeight > 1024))
                    aDecoderContext9032 = DecoderContext(aTheoraInfo9007, aSetupInfo9035)
                    aGranulePos9019 = GranulePos()
                    aFrame9024 = Frame(aTheoraInfo9007!!.frameWidth, aTheoraInfo9007!!.frameHeight)
                    anInt9027 = aDecoderContext9032!!.maxPostProcessingLevel
                    method2978(anInt9009, (-128).toByte())
                } else check(i_2_ >= 0) { i_2_.toString() }
            }
        }
    }

    companion object {
        @JvmField
        var aClass229_9011: Class229? = Class229()
        @JvmField
        var anInt9012: Int = 0
        @JvmField
        var anInt9013: Int = 0
        @JvmField
        var anInt9017: Int = 0
        @JvmField
        var anInt9021: Int = 0
        @JvmField
        var anInt9022: Int = 0
        @JvmField
        var aDouble9023: Double = 0.0
        @JvmField
        var anInt9025: Int = 0
        @JvmField
        var anInt9026: Int = 0
        @JvmField
        var aClass77_9029: Class77? = null
        @JvmField
        var anInt9030: Int = 0
        @JvmField
        var aClass153_9031: Class153? = null
        @JvmField
        var aClass45_9033: Class45? = null
        @JvmField
        var aClass351_9034: Class351? = Class351(30, 4)
        @JvmField
        var aClass187_9036: Class187? = null
        @JvmField
        var anInt9037: Int = 0
        @JvmField
        var aBoolean9038: Boolean = false
        @JvmField
        var anInt9039: Int = 0

        @JvmStatic
        fun method2974(i: Int) {
            aClass351_9034 = null
            if (i != 1) aClass229_9011 = null
            aClass45_9033 = null
            aClass229_9011 = null
            aClass77_9029 = null
            aClass153_9031 = null
            aClass187_9036 = null
        }
    }
}
