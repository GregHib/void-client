/* Class73 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class73 internal constructor(class45: Class45?, string: String?) : Interface7 {
    private val aString4778: String?
    private val aClass45_4785: Class45?
    override fun method31(i: Int): Int {
        val i_1_ = -62 / ((i - -43) / 62)
        anInt4774++
        if (aClass45_4785!!.method416((-74).toByte(), aString4778)) return 100
        return 0
    }

    override fun method32(i: Int): Class69? {
        anInt4781++
        if (i != -15004) aFloatArray4772 = null
        return Class69.Companion.aClass69_1197
    }

    init {
        try {
            aClass45_4785 = class45
            aString4778 = string
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("kk.<init>(" + (if (class45 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var aFloatArray4772: FloatArray?
        @JvmField
        var anInt4773: Int = 0
        @JvmField
        var anInt4774: Int = 0
        @JvmField
        var anInt4775: Int = 0
        @JvmField
        var anInt4776: Int
        @JvmField
        var anInt4777: Int = 0
        var aClass114_4779: Class114?
        var anIntArray4780: IntArray?
        @JvmField
        var anInt4781: Int = 0
        @JvmField
        var aClass219_4782: Class219? = null
        @JvmField
        var aLong4783: Long = 20000000L
        var anInt4784: Int = 0
        var anInt4786: Int = 0

        @JvmStatic
        fun method741(i: Byte) {
            aFloatArray4772 = null
            anIntArray4780 = null
            if (i.toInt() != -128) method743(113, -98)
            aClass114_4779 = null
            aClass219_4782 = null
        }

        fun method742(i: Int, i_0_: Int): Class189 {
            anInt4777++
            var class189 = Class217.aClass60_2844!!.method583(i_0_.toLong(), -104) as Class189?
            if (class189 != null) return class189
            val `is` = Class369_Sub3.aClass45_8601!!.method410(-1860, 0, i_0_)
            if (i != 104) method741(98.toByte())
            class189 = Class189()
            if (`is` != null) class189.method1419(i_0_, Class348_Sub49(`is`), 64.toByte())
            Class217.aClass60_2844!!.method582(class189, i_0_.toLong(), (-114).toByte())
            return class189
        }

        fun method743(i: Int, i_2_: Int) {
            anInt4775++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_2_, 105.toByte(), i) //9
            class348_sub42_sub15.method3251(i xor 0x3eb0.inv())
        }

        init {
            anInt4776 = 0
            aFloatArray4772 = FloatArray(16)
            anIntArray4780 = intArrayOf(104, 120, 136, 168)
            aClass114_4779 = Class114(76, 6)
        }
    }
}
