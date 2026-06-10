import Class115.method1060
import Class253.Companion.method1920

/* Class278 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class278 internal constructor(class230: Class230?, i: Int, bool: Boolean, class45: Class45?, class45_7_: Class45?) {
    var aClass45_3576: Class45? = null
    private var aClass60_3577: Class60? = Class60(64)
    var aClass230_3578: Class230? = null
    var aBoolean3583: Boolean = false
    private val aClass45_3585: Class45?
    var aClass60_3590: Class60? = Class60(50)
    var aClass60_3592: Class60 = Class60(5)
    var anInt3593: Int = 0

    fun method2072(i: Byte, bool: Boolean) {
        if (i >= 22) {
            anInt3580++
            if (this.aBoolean3583 != bool) {
                this.aBoolean3583 = bool
                method2078(-6080)
            }
        }
    }

    fun method2073(i: Int, i_0_: Int) {
        this.anInt3593 = i_0_
        anInt3591++
        synchronized(this.aClass60_3590!!) {
            this.aClass60_3590!!.method590(0)
        }
        synchronized(this.aClass60_3592) {
            this.aClass60_3592.method590(0)
        }
        if (i != -25032) method2079(-66, 101)
    }

    fun method2074(i: Int) {
        synchronized(this.aClass60_3590!!) {
            this.aClass60_3590!!.method590(0)
        }
        if (i < -94) {
            anInt3582++
            synchronized(this.aClass60_3592) {
                this.aClass60_3592.method590(0)
            }
        }
    }

    fun method2076(i: Int, bool: Boolean) {
        anInt3589++
        synchronized(aClass60_3577!!) {
            aClass60_3577!!.method578(2, i)
        }
        synchronized(this.aClass60_3590!!) {
            this.aClass60_3590!!.method578(2, i)
        }
        if (bool != true) method2072(120.toByte(), true)
        synchronized(this.aClass60_3592) {
            this.aClass60_3592.method578(2, i)
        }
    }

    fun method2078(i: Int) {
        anInt3579++
        synchronized(aClass60_3577!!) {
            if (i != -6080) this.aClass60_3590 = null
            aClass60_3577!!.method590(i + 6080)
        }
        synchronized(this.aClass60_3590!!) {
            this.aClass60_3590!!.method590(i + 6080)
        }
        synchronized(this.aClass60_3592) {
            this.aClass60_3592.method590(0)
        }
    }

    fun method2079(i: Int, i_6_: Int): Class79 {
        anInt3586++
        var class79: Class79?
        synchronized(aClass60_3577!!) {
            class79 = aClass60_3577!!.method583(i.toLong(), -104) as Class79?
        }
        if (class79 != null) return class79
        val `is`: ByteArray?
        synchronized(aClass45_3585!!) {
            `is` = aClass45_3585.method410(i_6_ + -1859, method1060(i, 69.toByte()), method1920(127, i))
        }
        class79 = Class79()
        class79.anInt1344 = i
        class79.aClass278_1348 = this
        if (`is` != null) class79.method798(111, Class348_Sub49(`is`))
        class79.method799(-117)
        synchronized(aClass60_3577!!) {
            aClass60_3577!!.method582(class79, i.toLong(), (-102).toByte())
            if (i_6_ != -1) aClass60_3577 = null
        }
        return class79
    }

    fun method2080(i: Int) {
        anInt3587++
        synchronized(aClass60_3577!!) {
            aClass60_3577!!.method587(-118)
        }
        synchronized(this.aClass60_3590!!) {
            this.aClass60_3590!!.method587(-100)
        }
        synchronized(this.aClass60_3592) {
            this.aClass60_3592.method587(-107)
        }
        if (i <= 122) method2075(-125, -46, 9)
    }

    init {
        do {
            try {
                this.aBoolean3583 = bool
                aClass45_3585 = class45
                this.aClass45_3576 = class45_7_
                this.aClass230_3578 = class230
                if (aClass45_3585 == null) break
                val i_8_ = aClass45_3585.method414(-1) + -1
                aClass45_3585.method407(0, i_8_)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("vda.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_7_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt3579: Int = 0
        var anInt3580: Int = 0
        var anInt3581: Int = 0
        var anInt3582: Int = 0
        var anInt3584: Int = 0
        var anInt3586: Int = 0
        var anInt3587: Int = 0
        var anInt3588: Int = 0
        var anInt3589: Int = 0
        var anInt3591: Int = 0
        fun method2075(i: Int, i_1_: Int, i_2_: Int): Boolean {
            anInt3584++
            if (i_1_ > -125) anInt3581 = -110
            return (i and 0x100100) != 0
        }

        fun method2077(i: Int, i_3_: Int, i_4_: Int): Boolean {
            val i_5_ = -75 % ((-43 - i) / 40)
            anInt3588++
            return (i_4_ and 0x8000) != 0
        }
    }
}
