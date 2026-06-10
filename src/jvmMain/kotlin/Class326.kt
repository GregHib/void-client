/* Class326 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class326 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass45_4085: Class45?
    private var aClass60_4087: Class60? = Class60(64)
    fun method2600(i: Int, i_0_: Int): Class254 {
        anInt4084++
        var class254: Class254?
        synchronized(aClass60_4087!!) {
            class254 = aClass60_4087!!.method583(i.toLong(), -67) as Class254?
        }
        if (class254 != null) return class254
        if (i_0_ != 28364) anInt4086 = 117
        val `is`: ByteArray?
        synchronized(aClass45_4085!!) {
            `is` = aClass45_4085.method410(-1860, 11, i)
        }
        class254 = Class254()
        if (`is` != null) class254.method1924(Class348_Sub49(`is`), (-127).toByte())
        synchronized(aClass60_4087!!) {
            aClass60_4087!!.method582(class254, i.toLong(), (-114).toByte())
        }
        return class254
    }

    fun method2601(i: Byte) {
        synchronized(aClass60_4087!!) {
            aClass60_4087!!.method590(0)
            val i_1_ = -46 / ((i - 3) / 47)
        }
        anInt4088++
    }

    fun method2602(i: Int) {
        anInt4089++
        synchronized(aClass60_4087!!) {
            aClass60_4087!!.method587(-91)
            if (i != 0) aClass60_4087 = null
        }
    }

    fun method2603(i: Int, i_2_: Int) {
        synchronized(aClass60_4087!!) {
            if (i_2_ != 11) return
            aClass60_4087!!.method578(2, i)
        }
        anInt4083++
    }

    init {
        do {
            try {
                aClass45_4085 = class45
                if (aClass45_4085 == null) break
                aClass45_4085.method407(0, 11)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("dc.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt4083: Int = 0
        var anInt4084: Int = 0
        @JvmField
        var anInt4086: Int = 0
        var anInt4088: Int = 0
        var anInt4089: Int = 0
    }
}
