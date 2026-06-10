import Class16.method259

/* Class217 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class217 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass45_2842: Class45?
    var anInt2845: Int = 0
    private var aClass60_2848: Class60? = Class60(64)

    fun method1587(i: Int, i_0_: Int) {
        if (i_0_ != 3758) aClass60_2848 = null
        synchronized(aClass60_2848!!) {
            aClass60_2848!!.method578(2, i)
        }
        anInt2841++
    }

    fun method1588(i: Int, i_1_: Int): Class159 {
        anInt2847++
        var class159: Class159?
        synchronized(aClass60_2848!!) {
            class159 = aClass60_2848!!.method583(i_1_.toLong(), -126) as Class159?
        }
        if (class159 != null) return class159
        val `is`: ByteArray?
        synchronized(aClass45_2842!!) {
            `is` = aClass45_2842.method410(-1860, 16, i_1_)
            if (i >= -17) aClass60_2848 = null
        }
        class159 = Class159()
        if (`is` != null) class159.method1253(Class348_Sub49(`is`), true)
        synchronized(aClass60_2848!!) {
            aClass60_2848!!.method582(class159, i_1_.toLong(), (-124).toByte())
        }
        return class159
    }

    fun method1589(i: Byte) {
        anInt2843++
        synchronized(aClass60_2848!!) {
            aClass60_2848!!.method590(0)
        }
        if (i < 126) method1588(-98, -35)
    }

    fun method1590(i: Int) {
        anInt2846++
        if (i != 0) this.anInt2845 = -97
        synchronized(aClass60_2848!!) {
            aClass60_2848!!.method587(i xor 0x6b.inv())
        }
    }

    init {
        try {
            aClass45_2842 = class45
            if (aClass45_2842 != null) this.anInt2845 = aClass45_2842.method407(0, 16)
            else this.anInt2845 = 0
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rv.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2840: Int = 0
        var anInt2841: Int = 0
        var anInt2843: Int = 0
        var aClass60_2844: Class60? = Class60(64)
        var anInt2846: Int = 0
        var anInt2847: Int = 0
        @JvmStatic
        fun method1585(i: Int) {
            if (i != -1) method1585(-34)
            aClass60_2844 = null
        }

        fun method1586(bool: Boolean, i: Byte, string: String?) {
            if (i >= -51) aClass60_2844 = null
            anInt2840++
            method259(-1, 113, bool, string, -1)
        }
    }
}
