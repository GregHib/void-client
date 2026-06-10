import Class179.Companion.method1359

/* Class194 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class194 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private var aClass60_2594: Class60? = Class60(64)
    private val aClass45_2597: Class45?
    fun method1442(i: Int, i_0_: Byte) {
        anInt2598++
        synchronized(aClass60_2594!!) {
            if (i_0_.toInt() != 1) aClass60_2594 = null
            aClass60_2594!!.method578(2, i)
        }
    }

    fun method1443(i: Int) {
        anInt2595++
        val i_1_ = 14 % ((-39 - i) / 51)
        synchronized(aClass60_2594!!) {
            aClass60_2594!!.method587(-80)
        }
    }

    fun method1444(i: Int, i_2_: Int) {
        val i_3_ = -6 % ((67 - i_2_) / 47)
        anInt2591++
        synchronized(aClass60_2594!!) {
            aClass60_2594!!.method590(0)
            aClass60_2594 = Class60(i)
        }
    }

    fun method1445(i: Int) {
        anInt2592++
        if (i == 64) {
            synchronized(aClass60_2594!!) {
                aClass60_2594!!.method590(0)
            }
        }
    }

    fun method1446(i: Int, i_4_: Int): Class146? {
        anInt2593++
        var class146: Class146?
        synchronized(aClass60_2594!!) {
            class146 = aClass60_2594!!.method583(i.toLong(), 76) as Class146?
        }
        if (class146 != null) return class146
        val `is`: ByteArray?
        synchronized(aClass45_2597!!) {
            `is` = aClass45_2597.method410(i_4_ xor 0x743, method1359(true, i), Class348_Sub14.method2806(false, i))
        }
        class146 = Class146()
        if (i_4_ != -1) return null
        if (`is` != null) class146.method1191(i_4_ xor 0x800.inv(), Class348_Sub49(`is`))
        synchronized(aClass60_2594!!) {
            aClass60_2594!!.method582(class146, i.toLong(), (-105).toByte())
        }
        return class146
    }

    init {
        do {
            try {
                aClass45_2597 = class45
                if (aClass45_2597 == null) break
                val i_5_ = aClass45_2597.method414(-1) + -1
                aClass45_2597.method407(0, i_5_)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qs.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt2591: Int = 0
        var anInt2592: Int = 0
        var anInt2593: Int = 0
        var anInt2595: Int = 0
        var aClass279_2596: Class279? = null
        var anInt2598: Int = 0

        @JvmStatic
        fun method1441(i: Byte) {
            aClass279_2596 = null
            if (i.toInt() != 18) aClass279_2596 = null
        }
    }
}
