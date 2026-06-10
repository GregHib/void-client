/* Class25 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class25 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private var aClass60_360: Class60? = Class60(16)
    private var aClass45_366: Class45? = null
    fun method299(i: Int, i_0_: Int) {
        if (i_0_ != 16) aClass45_366 = null
        synchronized(aClass60_360!!) {
            aClass60_360!!.method578(2, i)
        }
        anInt365++
    }

    fun method300(i: Byte) {
        anInt371++
        val i_1_ = 111 % ((i - -40) / 57)
        synchronized(aClass60_360!!) {
            aClass60_360!!.method590(0)
        }
    }

    fun method301(i: Int, i_2_: Int): Class38 {
        anInt361++
        var class38: Class38?
        synchronized(aClass60_360!!) {
            class38 = aClass60_360!!.method583(i.toLong(), -91) as Class38?
        }
        if (class38 != null) return class38
        val `is`: ByteArray?
        synchronized(aClass45_366!!) {
            `is` = aClass45_366!!.method410(-1860, 30, i)
        }
        if (i_2_ < 6) aClass60_360 = null
        class38 = Class38()
        if (`is` != null) class38.method364(Class348_Sub49(`is`), 54.toByte())
        synchronized(aClass60_360!!) {
            aClass60_360!!.method582(class38, i.toLong(), (-109).toByte())
        }
        return class38
    }

    fun method302(i: Int) {
        synchronized(aClass60_360!!) {
            if (i != -797644856) aClass105Array367 = null
            aClass60_360!!.method587(i xor 0x2f8b186f)
        }
        anInt372++
    }

    init {
        try {
            aClass45_366 = class45
            aClass45_366!!.method407(0, 30)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("hq.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt361: Int = 0
        @JvmField
        var anInt362: Int = 0
        @JvmField
        var anInt363: Int = 0
        @JvmField
        var aClass351_364: Class351? = Class351(12, 3)
        @JvmField
        var anInt365: Int = 0
        @JvmField
        var aClass105Array367: Array<Class105?>? = null
        @JvmField
        var aBoolean368: Boolean = false
        @JvmField
        var anIntArray369: IntArray? = null
        @JvmField
        var anInt370: Int = 0
        @JvmField
        var anInt371: Int = 0
        @JvmField
        var anInt372: Int = 0

        @JvmStatic
        fun method303(i: Int, i_3_: Int): Short {
            anInt362++
            val i_4_ = (i and 0xfe66) shr 10
            var i_5_ = i shr 3 and 0x70
            val i_6_ = i and 0x7f
            i_5_ = (if (i_6_ <= 64) i_6_ * i_5_ shr 7 else i_5_ * (127 + -i_6_) shr 7)
            val i_7_ = i_5_ + i_6_
            val i_8_: Int
            if (i_7_ != 0) i_8_ = (i_5_ shl 8) / i_7_
            else i_8_ = i_5_ shl 1
            val i_9_ = i_7_
            if (i_3_ != 30) return 79.toShort()
            return (i_9_ or (i_8_ shr 4 shl 7 or (i_4_ shl 10))).toShort()
        }

        fun method304(i: Int, i_10_: Int, i_11_: Int) {
            anInt363++
            if (i_10_ != 437853543) aBoolean368 = true
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_11_, 105.toByte(), 16)
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9652 = i
        }

        @JvmStatic
        fun method305(i: Byte) {
            anIntArray369 = null
            if (i.toInt() != 79) method303(-22, -13)
            aClass351_364 = null
            aClass105Array367 = null
        }
    }
}
