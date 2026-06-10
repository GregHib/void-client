import Class367_Sub1.Companion.method3533

/* Class141 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class141 internal constructor(class230: Class230?, i: Int, class45: Class45?, class45_4_: Class45?) {
    private var aClass60_1963 = Class60(64)
    @JvmField
    var aClass45_1965: Class45? = null
    private val aClass45_1971: Class45?
    @JvmField
    var aClass60_1976: Class60 = Class60(64)
    fun method1173(i: Byte, i_0_: Int): Class218? {
        anInt1964++
        var class218: Class218?
        synchronized(aClass60_1963) {
            class218 = aClass60_1963.method583(i_0_.toLong(), 118) as Class218?
        }
        if (class218 != null) return class218
        val `is`: ByteArray?
        synchronized(aClass45_1971!!) {
            `is` = aClass45_1971.method410(i + -1891, 34, i_0_)
        }
        class218 = Class218()
        if (i.toInt() != 31) return null
        class218.aClass141_2851 = this
        if (`is` != null) class218.method1597((-114).toByte(), Class348_Sub49(`is`))
        synchronized(aClass60_1963) {
            aClass60_1963.method582(class218, i_0_.toLong(), (-108).toByte())
        }
        return class218
    }

    fun method1174(i: Byte) {
        synchronized(aClass60_1963) {
            aClass60_1963.method587(-87)
        }
        anInt1969++
        synchronized(this.aClass60_1976) {
            if (i > -89) {
                /* empty */
            } else this.aClass60_1976.method587(-79)
        }
    }

    fun method1175(i: Byte) {
        synchronized(aClass60_1963) {
            aClass60_1963.method590(i + -125)
        }
        anInt1967++
        if (i.toInt() == 125) {
            synchronized(this.aClass60_1976) {
                this.aClass60_1976.method590(0)
            }
        }
    }

    fun method1176(i: Int, i_1_: Byte) {
        if (i_1_ < 31) Companion.method1177((-119).toByte())
        synchronized(aClass60_1963) {
            aClass60_1963.method578(2, i)
        }
        anInt1968++
        synchronized(this.aClass60_1976) {
            this.aClass60_1976.method578(2, i)
        }
    }

    fun method1178(i: Int, i_2_: Int, i_3_: Int) {
        anInt1972++
        if (i_2_ != 1) aClass273_1966 = null
        aClass60_1963 = Class60(i_3_)
        this.aClass60_1976 = Class60(i)
    }

    init {
        try {
            this.aClass45_1965 = class45_4_
            aClass45_1971 = class45
            aClass45_1971!!.method407(0, 34)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oda.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_4_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt1964: Int = 0
        @JvmField
        var aClass273_1966: Class273?
        var anInt1967: Int = 0
        var anInt1968: Int = 0
        var anInt1969: Int = 0
        var anInt1970: Int = 0
        var anInt1972: Int = 0
        var anIntArray1973: IntArray? = intArrayOf(0, 1, 2, 3, 4, 5, 6, 14)
        @JvmField
        var anInt1974: Int = 0
        var anIntArray1975: IntArray?
        @JvmField
        var aClass26_1977: Class26? = null

        @JvmStatic
        fun method1177(i: Byte) {
            Class291.anIntArray3726 = method3533(127.toByte(), 2048, 4, 8, 0.4f, 35, true, 8)
            if (i.toInt() == 122) anInt1970++
        }

        @JvmStatic
        fun method1179(i: Byte) {
            anIntArray1975 = null
            aClass26_1977 = null
            anIntArray1973 = null
            aClass273_1966 = null
            if (i >= -111) method1177(47.toByte())
        }

        init {
            aClass273_1966 = Class273("", 18)
            anIntArray1975 = IntArray(1)
        }
    }
}
