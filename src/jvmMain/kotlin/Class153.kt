import Class299_Sub1.Companion.method2259

/* Class153 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class153 internal constructor(class230: Class230?, i: Int, class45: Class45?, class45_10_: Class45?) {
    private var aClass60_2083 = Class60(128)
    private val aClass45_2084: Class45?
    var aClass45_2087: Class45? = null
    var aClass60_2089: Class60 = Class60(64)

    fun method1219(i: Int) {
        anInt2080++
        synchronized(aClass60_2083) {
            aClass60_2083.method590(0)
        }
        synchronized(this.aClass60_2089) {
            if (i != 7851) {
                /* empty */
            } else this.aClass60_2089.method590(i + -7851)
        }
    }

    fun method1220(i: Byte, i_0_: Int, i_1_: Int) {
        anInt2081++
        aClass60_2083 = Class60(i_1_)
        this.aClass60_2089 = Class60(i_0_)
        val i_2_ = 11 / ((i - -46) / 43)
    }

    fun method1222(bool: Boolean) {
        if (bool != true) method1222(false)
        synchronized(aClass60_2083) {
            aClass60_2083.method587(-99)
        }
        anInt2082++
        synchronized(this.aClass60_2089) {
            this.aClass60_2089.method587(-78)
        }
    }

    fun method1224(i: Int, i_8_: Byte) {
        synchronized(aClass60_2083) {
            if (i_8_ > -95) method1225(-75, (-61).toByte())
            aClass60_2083.method578(2, i)
        }
        anInt2079++
        synchronized(this.aClass60_2089) {
            this.aClass60_2089.method578(2, i)
        }
    }

    fun method1225(i: Int, i_9_: Byte): Class42? {
        anInt2085++
        var class42: Class42?
        synchronized(aClass60_2083) {
            class42 = aClass60_2083.method583(i.toLong(), 91) as Class42?
        }
        if (class42 != null) return class42
        if (i_9_ < 36) return null
        val `is`: ByteArray?
        synchronized(aClass45_2084!!) {
            `is` = aClass45_2084.method410(-1860, 36, i)
        }
        class42 = Class42()
        class42.aClass153_593 = this
        class42.anInt581 = i
        if (`is` != null) class42.method379(Class348_Sub49(`is`), 109)
        class42.method372(-25359)
        synchronized(aClass60_2083) {
            aClass60_2083.method582(class42, i.toLong(), (-106).toByte())
        }
        return class42
    }

    init {
        try {
            aClass45_2084 = class45
            this.aClass45_2087 = class45_10_
            aClass45_2084!!.method407(0, 36)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("on.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_10_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2079: Int = 0
        var anInt2080: Int = 0
        var anInt2081: Int = 0
        var anInt2082: Int = 0
        var anInt2085: Int = 0
        var anInt2086: Int = 0
        var anInt2088: Int = 0
        fun method1221(i: Int, i_3_: Int, i_4_: Int): Boolean {
            if (i != -3157) return false
            anInt2088++
            return method2259(0, i_4_, i_3_) or ((i_3_ and 0x70000) != 0) || Class288.method2187(i_3_, -79, i_4_)
        }

        fun method1223(i: Int, i_5_: Int, i_6_: Int, class273: Class273): Class348_Sub42_Sub19? {
            anInt2086++
            var i_7_ = class273.anInt5167 or (i shl 10)
            var class348_sub42_sub19 = (Class322.aClass308_4036!!.method2302(i_7_.toLong() shl 16, (-91).toByte()) as Class348_Sub42_Sub19?)
            if (class348_sub42_sub19 != null) return class348_sub42_sub19
            var `is` = (Class113.aClass45_1743!!.method415(73.toByte(), Class113.aClass45_1743!!.method423(i_7_, (-90).toByte())))
            if (`is` != null) {
                if (`is`.size <= 1) return null
                try {
                    class348_sub42_sub19 = Class318_Sub4.method2502(`is`, -85)
                } catch (exception: Exception) {
                    throw RuntimeException(exception.message + " S: " + i_7_)
                }
                class348_sub42_sub19!!.aClass273_9691 = class273
                Class322.aClass308_4036!!.method2305(i_7_.toLong() shl 16, class348_sub42_sub19, -1)
                return class348_sub42_sub19
            }
            i_7_ = class273.anInt5167 or (65536 + i_5_ shl 10)
            class348_sub42_sub19 = (Class322.aClass308_4036!!.method2302(i_7_.toLong() shl 16, (-31).toByte()) as Class348_Sub42_Sub19?)
            if (class348_sub42_sub19 != null) return class348_sub42_sub19
            `is` = (Class113.aClass45_1743!!.method415(73.toByte(), Class113.aClass45_1743!!.method423(i_7_, (-107).toByte())))
            if (`is` != null) {
                if (`is`.size <= 1) return null
                try {
                    class348_sub42_sub19 = Class318_Sub4.method2502(`is`, -101)
                } catch (exception: Exception) {
                    throw RuntimeException(exception.message + " S: " + i_7_)
                }
                class348_sub42_sub19!!.aClass273_9691 = class273
                Class322.aClass308_4036!!.method2305(i_7_.toLong() shl 16, class348_sub42_sub19, -1)
                return class348_sub42_sub19
            }
            i_7_ = class273.anInt5167 or 0x3fffc00
            class348_sub42_sub19 = (Class322.aClass308_4036!!.method2302(i_7_.toLong() shl 16, (-107).toByte()) as Class348_Sub42_Sub19?)
            if (class348_sub42_sub19 != null) return class348_sub42_sub19
            `is` = (Class113.aClass45_1743!!.method415(73.toByte(), Class113.aClass45_1743!!.method423(i_7_, 104.toByte())))
            if (`is` != null) {
                if (`is`.size <= 1) return null
                try {
                    class348_sub42_sub19 = Class318_Sub4.method2502(`is`, -110)
                } catch (exception: Exception) {
                    throw RuntimeException(exception.message + " S: " + i_7_)
                }
                class348_sub42_sub19!!.aClass273_9691 = class273
                Class322.aClass308_4036!!.method2305(i_7_.toLong() shl 16, class348_sub42_sub19, -1)
                return class348_sub42_sub19
            }
            if (i_6_ != 96837648) return null
            return null
        }
    }
}
