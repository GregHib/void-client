import Class348_Sub17.Companion.method2929

/* Class355 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class355 internal constructor(i: Int, class45: Class45?, class45_1_: Class45?, interface15: Interface15?) {
    private val aClass60_4362: Class60
    var anInt4364: Int = 0
    var anInt4365: Int = 0
    private var aClass45_4368: Class45? = null
    private val aClass45_4369: Class45?
    private var anInterface15_4373: Interface15?

    fun method3471(i: Int, i_0_: Byte): Class348_Sub42_Sub10 {
        anInt4363++
        var class348_sub42_sub10 = aClass60_4362.method583(i.toLong(), 70) as Class348_Sub42_Sub10?
        if (class348_sub42_sub10 != null) return class348_sub42_sub10
        val `is`: ByteArray?
        if (i >= 32768) `is` = aClass45_4369!!.method410(-1860, 1, 0x7fff and i)
        else `is` = aClass45_4368!!.method410(-1860, 1, i)
        class348_sub42_sub10 = Class348_Sub42_Sub10()
        class348_sub42_sub10.aClass355_9567 = this
        if (`is` != null) class348_sub42_sub10.method3218(Class348_Sub49(`is`), 0)
        if (i_0_ >= -86) method3473(-12)
        if (i >= 32768) class348_sub42_sub10.method3209(false)
        aClass60_4362.method582(class348_sub42_sub10, i.toLong(), (-125).toByte())
        return class348_sub42_sub10
    }

    fun method3472(l: Long, `is`: IntArray?, i: Int, class138: Class138?): String {
        try {
            if (i != -1) aClass45_4368 = null
            anInt4370++
            if (anInterface15_4373 != null) {
                val string = anInterface15_4373!!.method54(1, l, class138, `is`)
                if (string != null) return string
            }
            return l.toString()
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("aha.D(" + l + ',' + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (class138 != null) "{...}" else "null") + ')'))
        }
    }

    init {
        aClass60_4362 = Class60(64)
        anInterface15_4373 = null
        do {
            try {
                anInterface15_4373 = interface15
                aClass45_4368 = class45
                aClass45_4369 = class45_1_
                if (aClass45_4368 != null) this.anInt4365 = aClass45_4368!!.method407(0, 1)
                if (aClass45_4369 == null) break
                this.anInt4364 = aClass45_4369.method407(0, 1)
            } catch (runtimeexception: RuntimeException) {
                throw method2929(runtimeexception, ("aha.<init>(" + i + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_1_ != null) "{...}" else "null") + ',' + (if (interface15 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt4363: Int = 0
        var anObject4366: Any? = null
        var aLong4367: Long = -1L
        var anInt4370: Int = 0
        var anInt4371: Int = 0
        @JvmField
        var anInt4372: Int = 0
        fun method3470(i: Int) {
            if (i == 1) {
                anInt4371++
                if (!Class50_Sub1.aBoolean5224) {
                    Class50_Sub1.aBoolean5224 = true
                    Class369_Sub3_Sub1.aBoolean10174 = true
                    Class348_Sub27.aFloat6898 += (-12.0f - Class348_Sub27.aFloat6898) / 2.0f
                }
            }
        }

        @JvmStatic
        fun method3473(i: Int) {
            if (i != 12949) anInt4372 = -30
            anObject4366 = null
        }
    }
}
