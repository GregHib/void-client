/* Class259 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class259 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass45_3299: Class45?
    private val aClass60_3303 = Class60(64)
    var anInt3305: Int = 0
    fun method1976(i: Int, i_1_: Int): Class160 {
        anInt3302++
        var class160: Class160?
        synchronized(aClass60_3303) {
            class160 = aClass60_3303.method583(i.toLong(), -51) as Class160?
        }
        if (class160 != null) return class160
        val i_2_ = 44 % ((-41 - i_1_) / 33)
        val `is`: ByteArray?
        synchronized(aClass45_3299!!) {
            `is` = aClass45_3299.method410(-1860, 19, i)
        }
        class160 = Class160()
        if (`is` != null) class160.method1255(Class348_Sub49(`is`), -1)
        synchronized(aClass60_3303) {
            aClass60_3303.method582(class160, i.toLong(), (-120).toByte())
        }
        return class160
    }

    init {
        try {
            aClass45_3299 = class45
            this.anInt3305 = aClass45_3299!!.method407(0, 19)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("uea.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var aByteArray3300: ByteArray? = ByteArray(2048)
        @JvmField
        var aClass60_3301: Class60? = Class60(30)
        var anInt3302: Int = 0
        @JvmField
        var aClass305_3304: Class305? = null
        @JvmField
        var anInt3306: Int = 0

        @JvmStatic
        fun method1975(i: Byte) {
            aClass60_3301 = null
            val i_0_ = -54 / ((i - 77) / 37)
            aClass305_3304 = null
            aByteArray3300 = null
        }
    }
}
