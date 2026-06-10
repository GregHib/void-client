import Class62.method599

/* Class195 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class195 internal constructor(class287: Class287?, class106: Class106?) : Interface16 {
    private val aClass287_5006: Class287?
    private var aHa5010: ha? = null
    private var aBoolean5011 = false
    private val anInterface1Array5012: Array<Interface1?>
    override fun method57(i: Int) {
        anInt5004++
        if (aHa5010 !== Class348_Sub8.aHa6654) {
            aHa5010 = Class348_Sub8.aHa6654
            aBoolean5011 = true
        }
        aHa5010!!.GA(0)
        val interface1s = anInterface1Array5012
        var i_0_ = 0
        while (interface1s.size > i_0_) {
            val interface1 = interface1s[i_0_]
            if (interface1 != null) interface1.method7(10286)
            i_0_++
        }
        if (i <= 84) method56(2.toByte(), 40L)
    }

    override fun method58(bool: Boolean, i: Int) {
        var bool = bool
        anInt5018++
        bool = true
        val interface1s = anInterface1Array5012
        var i_1_ = 0
        while (interface1s.size > i_1_) {
            val interface1 = interface1s[i_1_]
            if (interface1 != null) interface1.method9((-49).toByte(), bool || aBoolean5011)
            i_1_++
        }
        if (i > -69) method1447(-38)
        aBoolean5011 = false
    }

    override fun method59(i: Int) {
        anInt5008++
        if (i != -9719) aClass351_5015 = null
    }

    override fun method55(i: Byte): Int {
        anInt5009++
        if (i.toInt() != -58) method58(false, -122)
        return aClass287_5006!!.anInt3687
    }

    override fun method56(i: Byte, l: Long): Boolean {
        try {
            anInt5005++
            if (i < 30) method1449(-81, 10, -115)
            return l - -aClass287_5006!!.anInt3690.toLong() <= method599(-97)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "qt.I(" + i + ',' + l + ')')
        }
    }

    override fun method60(i: Int): Int {
        if (i != -19079) method58(false, 116)
        anInt5014++
        var i_4_ = 0
        val interface1s = anInterface1Array5012
        var i_5_ = 0
        while (interface1s.size > i_5_) {
            val interface1 = interface1s[i_5_]
            if (interface1 == null || interface1.method8((-121).toByte())) i_4_++
            i_5_++
        }
        return i_4_ * 100 / anInterface1Array5012.size
    }

    init {
        try {
            aClass287_5006 = class287
            anInterface1Array5012 = arrayOfNulls<Interface1>((aClass287_5006!!.anInterface12Array3688).size)
            var i = 0
            while ((i < anInterface1Array5012.size)) {
                anInterface1Array5012[i] = class106!!.method1000(true, (aClass287_5006.anInterface12Array3688[i]))
                i++
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qt.<init>(" + (if (class287 != null) "{...}" else "null") + ',' + (if (class106 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt5003: Int = 0
        var anInt5004: Int = 0
        var anInt5005: Int = 0
        var anIntArray5007: IntArray? = IntArray(4)
        var anInt5008: Int = 0
        var anInt5009: Int = 0
        var aBoolean5013: Boolean = false
        var anInt5014: Int = 0
        @JvmField
        var aClass351_5015: Class351?
        @JvmField
        var anInt5016: Int = 0
        var aClass297_5017: Class297? = null
        var anInt5018: Int = 0
        @JvmField
        var anInt5019: Int

        @JvmStatic
        fun method1447(i: Int) {
            if (i == 76) {
                anIntArray5007 = null
                aClass297_5017 = null
                aClass351_5015 = null
            }
        }

        fun method1448(i: Int) {
            anInt5003++
            if (i <= -55) Class348_Sub40_Sub7.aClass348_Sub42_Sub12_9144 = Class348_Sub42_Sub12((Class274.aClass274_3487!!.method2063(Class348_Sub33.anInt6967, 544)), "", Class362.anInt4458, 1004, -1, 0L, 0, 0, true, false, 0L, true)
        }

        @JvmStatic
        fun method1449(i: Int, i_2_: Int, i_3_: Int): Class148? {
            val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_2_]!![i_3_]
            if (class357 == null) return null
            return class357.aClass148_4396
        }

        init {
            aClass351_5015 = Class351(76, 4)
            anInt5019 = 0
        }
    }
}
