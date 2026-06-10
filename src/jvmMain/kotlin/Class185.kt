/* Class185 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class185 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass60_2479 = Class60(64)
    private val aClass45_2480: Class45?
    fun method1390(i: Int) {
        synchronized(aClass60_2479) {
            val i_0_ = 25 / ((i - 69) / 33)
            aClass60_2479.method587(-98)
        }
        anInt2486++
    }

    fun method1391(i: Byte, i_1_: Int): Class253 {
        anInt2485++
        var class253: Class253?
        synchronized(aClass60_2479) {
            class253 = aClass60_2479.method583(i_1_.toLong(), 96) as Class253?
        }
        if (class253 != null) return class253
        val `is`: ByteArray?
        synchronized(aClass45_2480!!) {
            `is` = aClass45_2480.method410(-1860, 31, i_1_)
        }
        class253 = Class253()
        val i_2_ = 50 / ((i - -63) / 56)
        if (`is` != null) class253.method1921((-69).toByte(), Class348_Sub49(`is`))
        synchronized(aClass60_2479) {
            aClass60_2479.method582(class253, i_1_.toLong(), (-108).toByte())
        }
        return class253
    }

    fun method1392(i: Int, i_3_: Int) {
        synchronized(aClass60_2479) {
            aClass60_2479.method578(2, i_3_)
        }
        if (i >= 12) anInt2484++
    }

    fun method1393(i: Byte) {
        synchronized(aClass60_2479) {
            aClass60_2479.method590(0)
            val i_4_ = -89 % ((42 - i) / 50)
        }
        anInt2487++
    }

    init {
        try {
            aClass45_2480 = class45
            aClass45_2480!!.method407(0, 31)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qf.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2481: Int = 0
        @JvmField
        var anInt2482: Int = 0
        var aClass114_2483: Class114?
        var anInt2484: Int = 0
        var anInt2485: Int = 0
        var anInt2486: Int = 0
        var anInt2487: Int = 0
        var aCharArray2488: CharArray? = charArrayOf(
            ' ',
            '\u00a0',
            '_',
            '-',
            '\u00e0',
            '\u00e1',
            '\u00e2',
            '\u00e4',
            '\u00e3',
            '\u00c0',
            '\u00c1',
            '\u00c2',
            '\u00c4',
            '\u00c3',
            '\u00e8',
            '\u00e9',
            '\u00ea',
            '\u00eb',
            '\u00c8',
            '\u00c9',
            '\u00ca',
            '\u00cb',
            '\u00ed',
            '\u00ee',
            '\u00ef',
            '\u00cd',
            '\u00ce',
            '\u00cf',
            '\u00f2',
            '\u00f3',
            '\u00f4',
            '\u00f6',
            '\u00f5',
            '\u00d2',
            '\u00d3',
            '\u00d4',
            '\u00d6',
            '\u00d5',
            '\u00f9',
            '\u00fa',
            '\u00fb',
            '\u00fc',
            '\u00d9',
            '\u00da',
            '\u00db',
            '\u00dc',
            '\u00e7',
            '\u00c7',
            '\u00ff',
            '\u0178',
            '\u00f1',
            '\u00d1',
            '\u00df'
        )
        @JvmField
        var aClass223_2489: Class223?

        @JvmStatic
        fun method1394(i: Int, i_5_: Int, i_6_: Int) {
            val bool = (Class147.aClass357ArrayArrayArray2029!![0]!![i_5_]!![i_6_] != null && Class147.aClass357ArrayArrayArray2029!![0]!![i_5_]!![i_6_]!!.aClass357_4400 != null)
            for (i_7_ in i downTo 0) {
                if (Class147.aClass357ArrayArrayArray2029!![i_7_]!![i_5_]!![i_6_] == null) {
                    val class357 = (Class357(i_7_).also { Class147.aClass357ArrayArrayArray2029!![i_7_]!![i_5_]!![i_6_] = it })
                    if (bool) class357.aByte4399++
                }
            }
        }

        @JvmStatic
        fun method1395(i: Byte) {
            aClass114_2483 = null
            aCharArray2488 = null
            aClass223_2489 = null
            if (i.toInt() != 82) method1394(120, -36, -100)
        }

        init {
            aClass114_2483 = Class114(47, 6)
            aClass223_2489 = Class223(3, 2)
        }
    }
}
