import Class258_Sub4.Companion.method1974

/* Class187 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class187 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private var aClass45_2498: Class45? = null
    private var aClass60_2501: Class60? = Class60(64)
    fun method1404(i: Byte) {
        synchronized(aClass60_2501!!) {
            aClass60_2501!!.method590(0)
            if (i >= -20) Companion.method1407((-33).toByte())
        }
        anInt2508++
    }

    fun method1408(i: Int, i_3_: Int): Class321 {
        anInt2504++
        var class321: Class321?
        synchronized(aClass60_2501!!) {
            class321 = aClass60_2501!!.method583(i_3_.toLong(), 76) as Class321?
        }
        if (class321 != null) return class321
        val `is`: ByteArray?
        synchronized(aClass45_2498!!) {
            `is` = aClass45_2498!!.method410(-1860, 35, i_3_)
        }
        class321 = Class321()
        if (`is` != null) class321.method2551(-125, Class348_Sub49(`is`))
        if (i != -12637) aClass60_2501 = null
        class321.method2548(127.toByte())
        synchronized(aClass60_2501!!) {
            aClass60_2501!!.method582(class321, i_3_.toLong(), (-99).toByte())
        }
        return class321
    }

    fun method1409(i: Int, i_4_: Int) {
        synchronized(aClass60_2501!!) {
            if (i_4_ != -20721) aClass45_2498 = null
            aClass60_2501!!.method578(i_4_ + 20723, i)
        }
        anInt2503++
    }

    fun method1410(i: Int) {
        synchronized(aClass60_2501!!) {
            if (i != -27995) method1409(-42, 23)
            aClass60_2501!!.method587(-85)
        }
        anInt2502++
    }

    init {
        do {
            try {
                aClass45_2498 = class45
                if (aClass45_2498 == null) break
                aClass45_2498!!.method407(0, 35)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qga.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var anInt2499: Int = 0
        var anInt2500: Int = 0
        var anInt2502: Int = 0
        var anInt2503: Int = 0
        var anInt2504: Int = 0
        var anInt2505: Int = 0
        var anInt2506: Int = 0
        @JvmField
        var aClass223_2507: Class223? = Class223(9, 2)
        var anInt2508: Int = 0
        @JvmField
        var anIntArray2509: IntArray? = IntArray(2)
        @JvmField
        var anInt2510: Int = 0

        fun method1405(i: Int, bool: Boolean, bool_0_: Boolean) {
            anInt2506++
            val class348_sub13 = method1974(42.toByte(), i, bool)
            if (class348_sub13 != null && bool_0_ == true) {
                var i_1_ = 0
                while ((class348_sub13.anIntArray6757!!.size > i_1_)) {
                    class348_sub13.anIntArray6757!![i_1_] = -1
                    class348_sub13.anIntArray6758[i_1_] = 0
                    i_1_++
                }
            }
        }

        @JvmStatic
        fun method1406(bool: Boolean) {
            if (bool == true) {
                Class3.method175((-6).toByte())
                anInt2505++
                Class59_Sub1.aBoolean5300 = false
            }
        }

        @JvmStatic
        fun method1407(i: Byte) {
            val i_2_ = 92 / ((-3 - i) / 60)
            anIntArray2509 = null
            aClass223_2507 = null
        }
    }
}
