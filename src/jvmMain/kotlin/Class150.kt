/* Class150 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class150 internal constructor(class230: Class230?, i: Int, class45: Class45?, class45_9_: Class45?) {
    private var aClass45_2048: Class45? = null
    private val aClass60_2050 = Class60(64)
    var aClass45_2054: Class45? = null
    fun method1203(i: Byte, i_3_: Int): Class34 {
        anInt2056++
        if (i.toInt() != 33) aClass45_2048 = null
        var class34: Class34?
        synchronized(aClass60_2050) {
            class34 = aClass60_2050.method583(i_3_.toLong(), -58) as Class34?
        }
        if (class34 != null) return class34
        val `is`: ByteArray?
        synchronized(aClass45_2048!!) {
            `is` = aClass45_2048!!.method410(i + -1893, 3, i_3_)
        }
        class34 = Class34()
        class34.aClass150_475 = this
        if (`is` != null) class34.method346(i.toInt().inv(), Class348_Sub49(`is`))
        synchronized(aClass60_2050) {
            aClass60_2050.method582(class34, i_3_.toLong(), (-109).toByte())
        }
        return class34
    }

    fun method1204(i: Int) {
        synchronized(aClass60_2050) {
            aClass60_2050.method587(-93)
        }
        anInt2049++
        if (i != 0) aClass45_2048 = null
    }

    fun method1206(i: Byte) {
        if (i.toInt() != -37) aClass45_2048 = null
        anInt2051++
        synchronized(aClass60_2050) {
            aClass60_2050.method590(0)
        }
    }

    fun method1207(i: Int, i_7_: Int) {
        anInt2055++
        if (i == -17452) {
            synchronized(aClass60_2050) {
                aClass60_2050.method578(i + 17454, i_7_)
            }
        }
    }

    init {
        try {
            this.aClass45_2054 = class45_9_
            aClass45_2048 = class45
            aClass45_2048!!.method407(0, 3)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oha.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_9_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var aClass113_2047: Class113?
        var anInt2049: Int = 0
        var anInt2051: Int = 0
        var anInt2052: Int = 0
        var anInt2053: Int = 0
        var anInt2055: Int = 0
        var anInt2056: Int = 0
        @JvmField
        var anInt2057: Int = 0

        @JvmStatic
        fun method1202(i: Int) {
            anInt2052++
            val `is` = IntArray(Exception_Sub1.aClass255_112!!.anInt3271)
            var i_0_ = i
            var i_1_ = 0
            while (Exception_Sub1.aClass255_112!!.anInt3271 > i_1_) {
                val class213 = Exception_Sub1.aClass255_112!!.method1940(-104, i_1_)
                if (class213.anInt2815 >= 0 || class213.anInt2788 >= 0) `is`[i_0_++] = i_1_
                i_1_++
            }
            Class25.anIntArray369 = IntArray(i_0_)
            for (i_2_ in 0..<i_0_) Class25.anIntArray369!![i_2_] = `is`[i_2_]
        }

        fun method1205(i: Int, bool: Boolean, class45: Class45, i_4_: Int): Class348_Sub42_Sub14 {
            anInt2053++
            val class348_sub49 = Class348_Sub49(class45.method410(-1860, i_4_, i))
            if (bool != true) method1208(102)
            val class348_sub42_sub14 = Class348_Sub42_Sub14(i, class348_sub49.readString(88.toByte()), class348_sub49.readString(120.toByte()), class348_sub49.readInt((-126).toByte()), class348_sub49.readInt((-126).toByte()), class348_sub49.readUnsignedByte(255) == 1, class348_sub49.readUnsignedByte(255), class348_sub49.readUnsignedByte(255))
            val i_5_ = class348_sub49.readUnsignedByte(255)
            for (i_6_ in 0..<i_5_) class348_sub42_sub14.aClass262_9629!!.method1999(
                Class348_Sub18(
                    class348_sub49.readUnsignedByte(255),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944),
                    class348_sub49.readUnsignedShort(842397944)
                ), -20180
            )
            class348_sub42_sub14.method3240(37.toByte())
            return class348_sub42_sub14
        }

        @JvmStatic
        fun method1208(i: Int) {
            aClass113_2047 = null
            val i_8_ = -65 / ((i - -58) / 57)
        }

        init {
            aClass113_2047 = Class113()
        }
    }
}
