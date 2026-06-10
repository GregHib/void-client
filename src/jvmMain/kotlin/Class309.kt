import Class214.method1577
import Class59.Companion.method547
import Class60.Companion.method589

/* Class309 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class309 internal constructor(private val aString4807: String?) : Interface7 {
    private var aBoolean4824 = false
    override fun method31(i: Int): Int {
        val i_9_ = 88 % ((-43 - i) / 62)
        anInt4821++
        val i_10_ = method547(aString4807, 7468)
        if (i_10_ >= 0 && i_10_ <= 100) return i_10_
        aBoolean4824 = true
        return 100
    }

    override fun method32(i: Int): Class69? {
        anInt4809++
        if (i != -15004) aStringArray4818 = null
        return Class69.aClass69_1199
    }

    fun method2313(i: Int): Boolean {
        if (i <= 99) method2309(-35, null)
        anInt4815++
        return aBoolean4824
    }

    companion object {
        var anIntArray4806: IntArray?
        var aClass105_4808: Class105? = null
        var anInt4809: Int = 0
        var anInt4810: Int = 0
        var anInt4811: Int = 0
        var anIntArray4812: IntArray?
        var anIntArray4813: IntArray?
        var anInt4814: Int = 50
        var anInt4815: Int = 0
        var anInt4816: Int
        var anIntArray4817: IntArray?
        var aStringArray4818: Array<String?>?
        var anIntArray4819: IntArray?
        var anInt4820: Int = 0
        var anInt4821: Int = 0
        var anIntArray4822: IntArray?
        var anInt4823: Int = 0
        var anInt4825: Int = 0

        @JvmStatic
        fun method2307(i: Int, l: Long, i_0_: Int, i_1_: Int) {
            try {
                anInt4823++
                if (i_1_ <= 3) Companion.method2308((-121).toByte(), 59)
                val i_2_ = l.toInt() shr 14 and 0x1f
                val i_3_ = (0x37d8b0 and l.toInt()) shr 20
                val i_4_ = 0x7fffffff and (l ushr 32).toInt()
                if (i_2_ != 10 && i_2_ != 11 && i_2_ != 22) Class298.method2252(true, i_0_, i, (-119).toByte(), 0, 0, 0, i_2_, i_3_)
                else {
                    val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, i_4_)
                    val i_5_: Int
                    val i_6_: Int
                    if (i_3_ == 0 || i_3_ == 2) {
                        i_5_ = class51.anInt926
                        i_6_ = class51.anInt961
                    } else {
                        i_5_ = class51.anInt961
                        i_6_ = class51.anInt926
                    }
                    var i_7_ = class51.anInt914
                    if (i_3_ != 0) i_7_ = (0xf and (i_7_ shl i_3_)) + (i_7_ shr 4 + -i_3_)
                    Class298.method2252(true, i_0_, i, (-99).toByte(), i_5_, i_7_, i_6_, 0, 0)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("cf.B(" + i + ',' + l + ',' + i_0_ + ',' + i_1_ + ')'))
            }
        }

        @JvmStatic
        fun method2308(i: Byte, i_8_: Int): Boolean {
            if (i.toInt() != 26) anIntArray4822 = null
            anInt4810++
            return i_8_ == 15 || i_8_ == 2 || i_8_ == 30 || i_8_ == 49 || i_8_ == 51 || i_8_ == 50 || i_8_ == 6
        }

        fun method2309(i: Int, `is`: ByteArray?): ByteArray? {
            anInt4825++
            if (`is` == null) return null
            val is_11_ = ByteArray(`is`.size)
            if (i >= -9) anInt4814 = 49
            method1577(`is`, 0, is_11_, 0, `is`.size)
            return is_11_
        }

        @JvmStatic
        fun method2310(i: Byte) {
            if (i < 65) anIntArray4819 = null
            aStringArray4818 = null
            anIntArray4819 = null
            anIntArray4822 = null
            anIntArray4813 = null
            anIntArray4817 = null
            aClass105_4808 = null
            anIntArray4806 = null
            anIntArray4812 = null
        }

        fun method2311(i: Byte, i_12_: Int) {
            anInt4820++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_12_, 105.toByte(), 16)
            class348_sub42_sub15.method3251(-16058)
            val i_13_ = 126 / ((i - -54) / 38)
        }

        @JvmStatic
        fun method2312(i: Int, i_14_: Int, class262: Class262?, i_15_: Int, var_ha: ha?) {
            do {
                try {
                    anInt4811++
                    Class289.aClass262_3705!!.method1996(125)
                    if (!Class348_Sub1_Sub1.aBoolean8805) {
                        var class348_sub21 = class262!!.method1995(4) as Class348_Sub21?
                        while (class348_sub21 != null) {
                            val class42 = (Class75.aClass153_1238!!.method1225(class348_sub21.anInt6847, 82.toByte()))
                            if (method589(class42, -4)) {
                                val bool = Class190.method1425((-31).toByte(), class42, class348_sub21, i_14_, var_ha, i_15_)
                                if (bool) Class59.method549((-43).toByte(), class348_sub21, var_ha!!, class42)
                            }
                            class348_sub21 = (class262.method1990(104.toByte()) as Class348_Sub21?)
                        }
                        if (i == -13084) break
                        aStringArray4818 = null
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("cf.G(" + i + ',' + i_14_ + ',' + (if (class262 != null) "{...}" else "null") + ',' + i_15_ + ',' + (if (var_ha != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        init {
            anIntArray4812 = IntArray(anInt4814)
            anIntArray4806 = IntArray(anInt4814)
            anIntArray4813 = IntArray(anInt4814)
            anIntArray4817 = IntArray(anInt4814)
            anInt4816 = 0
            aStringArray4818 = arrayOfNulls<String>(anInt4814)
            anIntArray4822 = IntArray(anInt4814)
            anIntArray4819 = IntArray(anInt4814)
        }
    }
}
