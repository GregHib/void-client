import Class239_Sub17.Companion.method1793
import Class286_Sub3.Companion.method2152
import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState

class Class348_Sub23_Sub4 internal constructor(oggstreamstate: OggStreamState) : Class348_Sub23(oggstreamstate) {
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
            val class348_sub49 = Class348_Sub49(oggpacket.data)
            val i_2_ = class348_sub49.readUnsignedByte(255)
            if (this.anInt6868 <= 8) {
                check((i_2_ or 0x80) != 0)
                if (this.anInt6868 == 0) {
                    class348_sub49.anInt7197 += 23
                    anInt9055 = class348_sub49.method3359(-89)
                    anInt9054 = class348_sub49.method3359(-41)
                    check(!(anInt9055 == 0 || anInt9054 == 0))
                    val class348_sub49_3_ = Class348_Sub49(16)
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

    companion object {
        @JvmField
        var anInt9047: Int = 0
        @JvmField
        var anInt9049: Int = 0
        @JvmField
        var anIntArray9050: IntArray? = IntArray(14)
        @JvmField
        var anInt9052: Int = 0
        @JvmField
        var anInt9053: Int = 0
        @JvmField
        var anInt9056: Int = 0
        @JvmField
        var anInt9059: Int = 0
        @JvmField
        var anInt9060: Int = 0
        @JvmField
        var anInt9061: Int = 0
        @JvmField
        var anInt9063: Int = 0

        @JvmStatic
        fun method2985(i: Int, i_0_: Int, i_1_: Int): Boolean {
            if (i != -31735) Companion.method2990((-62).toByte())
            anInt9059++
            return (0x100 and i_1_) != 0
        }

        @JvmStatic
        fun method2987(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int) {
            anInt9047++
            if (i_7_ == 8 || i_7_ == 16) {
                var i_11_ = 0
                while ((Class348_Sub44.anInt7101 > i_11_)) {
                    val class338 = Class294.aClass338Array5060!![i_11_]!!
                    if ((class338.aByte4192.toInt() == i_7_ && i_10_ == class338.aShort4185.toInt() && i_8_ == class338.aShort4193.toInt()) || ((class338.aShort4182.toInt() == i_10_) && (class338.aShort4193.toInt() == i_8_))) {
                        if (i_11_ != Class348_Sub44.anInt7101) Class214.method1575(Class294.aClass338Array5060!!, 1 + i_11_, Class294.aClass338Array5060!!, i_11_, (Class294.aClass338Array5060!!.size + -i_11_ - 1))
                        Class348_Sub44.anInt7101--
                        return
                    }
                    i_11_++
                }
            } else {
                val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_10_]!![i_8_]
                if (class357 != null) {
                    if (i_7_ != 1) {
                        if (i_7_ == 2) class357.aShort4398 = 0.toShort()
                    } else class357.aShort4409 = 0.toShort()
                }
                method2152(false)
            }
            if (i_9_ != -3951) anIntArray9050 = null
        }

        @JvmStatic
        fun method2988(bool: Boolean) {
            Class60.aHa1098!!.xa((Class316.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!.method1764(-32350).toFloat() * 0.1f + 0.7f) * Class160.aFloat2137)
            anInt9049++
            Class60.aHa1098!!.ZA(Class119_Sub1.anInt4703, Class244.aFloat4626, Class361.aFloat4455, (Class21.anInt325 shl 2).toFloat(), (Class318_Sub1_Sub3_Sub1.anInt10023 shl 2).toFloat(), (Class196.anInt2601 shl 2).toFloat())
            Class60.aHa1098!!.method3653(Class158.aClass299_4938)
            if (bool != true) anIntArray9050 = null
        }

        @JvmStatic
        fun method2990(i: Byte) {
            anIntArray9050 = null
            if (i <= 101) anIntArray9050 = null
        }
    }
}
