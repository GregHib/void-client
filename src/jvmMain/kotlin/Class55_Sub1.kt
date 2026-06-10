import java.io.IOException

class Class55_Sub1 private constructor(i: Int, class45: Class45, i_1_: Int) : Class55(i) {
    private val aClass45_5267: Class45
    private var anIntArray5269: IntArray? = null
    private var anInt5270 = 0
    private val anInt5272: Int
    private val aClass348_Sub49_5274: Class348_Sub49
    private var aByteArrayArray5275: Array<ByteArray?>? = arrayOfNulls<ByteArray>(10)
    private val aClass348_Sub49_5276: Class348_Sub49

    fun method522(i: Byte) {
        anInt5266++
        if (anIntArray5269 != null && i < -27) {
            var i_0_ = 0
            while (i_0_ < 10 && anIntArray5269!!.size > anInt5270 + i_0_) {
                if (aByteArrayArray5275!![i_0_] == null && aClass45_5267.method420(-10499, (anIntArray5269!![i_0_ + anInt5270]), 0)) aByteArrayArray5275!![i_0_] = aClass45_5267.method410(-1860, (anIntArray5269!![anInt5270 + i_0_]), 0)
                i_0_++
            }
        }
    }

    init {
        aClass348_Sub49_5274 = Class348_Sub49(null)
        aClass348_Sub49_5276 = Class348_Sub49(null)
        aClass45_5267 = class45
        anInt5272 = i_1_
    }

    @Throws(IOException::class)
    public override fun method516(i: Byte, `is`: ByteArray?): Int {
        anInt5273++
        if (anIntArray5269 == null) {
            if (!aClass45_5267.method420(-10499, anInt5272, 0)) return 0
            val is_4_ = aClass45_5267.method410(-1860, anInt5272, 0)
            checkNotNull(is_4_) { "" }
            aClass348_Sub49_5276.aByteArray7154 = is_4_
            aClass348_Sub49_5276.anInt7197 = 0
            val i_5_ = is_4_.size shr 1
            anIntArray5269 = IntArray(i_5_)
            for (i_6_ in 0..<i_5_) anIntArray5269!![i_6_] = aClass348_Sub49_5276.readUnsignedShort(842397944)
        }
        if (anInt5270 >= anIntArray5269!!.size) return -1
        method522((-74).toByte())
        if (i.toInt() != 21) aByteArrayArray5275 = null
        aClass348_Sub49_5276.aByteArray7154 = `is`
        aClass348_Sub49_5276.anInt7197 = 0
        while (aClass348_Sub49_5276.anInt7197 < aClass348_Sub49_5276.aByteArray7154!!.size) {
            if (aClass348_Sub49_5274.aByteArray7154 == null) {
                if (aByteArrayArray5275!![0] == null) {
                    aClass348_Sub49_5276.aByteArray7154 = null
                    return aClass348_Sub49_5276.anInt7197
                }
                aClass348_Sub49_5274.aByteArray7154 = aByteArrayArray5275!![0]
            }
            val i_7_ = (-aClass348_Sub49_5276.anInt7197 + (aClass348_Sub49_5276.aByteArray7154)!!.size)
            val i_8_ = (-aClass348_Sub49_5274.anInt7197 + (aClass348_Sub49_5274.aByteArray7154)!!.size)
            if (i_8_ <= i_7_) {
                aClass348_Sub49_5276.writeBytes(i_8_, aClass348_Sub49_5274.anInt7197, aClass348_Sub49_5274.aByteArray7154!!, -58)
                aClass348_Sub49_5274.anInt7197 = 0
                aClass348_Sub49_5274.aByteArray7154 = null
                anInt5270++
                for (i_9_ in 0..8) aByteArrayArray5275!![i_9_] = aByteArrayArray5275!![i_9_ - -1]
                aByteArrayArray5275!![9] = null
                if (anInt5270 >= anIntArray5269!!.size) {
                    aClass348_Sub49_5276.aByteArray7154 = null
                    return aClass348_Sub49_5276.anInt7197
                }
            } else {
                aClass348_Sub49_5274.method3389(2147483647, aClass348_Sub49_5276.anInt7197, i_7_, aClass348_Sub49_5276.aByteArray7154!!)
                aClass348_Sub49_5276.aByteArray7154 = null
                return `is`!!.size
            }
        }
        aClass348_Sub49_5276.aByteArray7154 = null
        return `is`!!.size
    }

    companion object {
        var aBoolean5265: Boolean = false
        @JvmField
        var anInt5266: Int = 0
        @JvmField
        var anInt5268: Int = 0
        @JvmField
        var aClass364_5271: Class364? = Class364("LIVE", 0)
        @JvmField
        var anInt5273: Int = 0
        @JvmStatic
        fun method523(i: Int) {
            if (i <= 80) method524(-87, true, 104, 0)
            aClass364_5271 = null
        }

        @JvmStatic
        fun method524(i: Int, bool: Boolean, i_2_: Int, i_3_: Int) {
            if (i_3_ > -108) aBoolean5265 = false
            if (Class27.aClass356_389!!.method3480(i_2_.toLong(), -6008) == null) {
                if (Class38.aBoolean510) {
                    val class348_sub15 = Class348_Sub15(i_2_, Class55_Sub1(4096, (Class146.aClass45_2015!!), i_2_), i, bool)
                    class348_sub15.aClass55_Sub1_6768!!.method509(-92, Class59_Sub2.aStringArray5305!![Class348_Sub33.anInt6967])
                    Class27.aClass356_389!!.method3483(35.toByte(), i_2_.toLong(), class348_sub15)
                } else Class303.method2285(bool, (-90).toByte(), i_2_)
            }
            anInt5268++
        }
    }
}
