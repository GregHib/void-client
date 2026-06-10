import Class318_Sub1_Sub3_Sub1.Companion.method2419
import Class348_Sub1_Sub2.Companion.method2729

/* Class319 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class319 internal constructor(class230: Class230?, i: Int, class45: Class45?, class45_3_: Class45?) {
    private val aClass45_3979: Class45?
    var aClass45_3981: Class45? = null
    private val aClass60_3989 = Class60(64)
    var aClass60_3990: Class60 = Class60(60)
    var anInt3991: Int = 0

    fun method2541(i: Int, i_0_: Int) {
        anInt3978++
        this.anInt3991 = i_0_
        synchronized(this.aClass60_3990) {
            this.aClass60_3990.method590(0)
        }
        if (i < 72) aClass315Array3982 = null
    }

    fun method2542(i: Int) {
        synchronized(aClass60_3989) {
            aClass60_3989.method587(-126)
        }
        if (i >= -99) aDouble3980 = 0.5896741197263589
        anInt3986++
        synchronized(this.aClass60_3990) {
            this.aClass60_3990.method587(-106)
        }
    }

    fun method2543(i: Byte, i_1_: Int): Class368 {
        if (i <= 38) method2542(-73)
        anInt3983++
        var class368: Class368?
        synchronized(aClass60_3989) {
            class368 = aClass60_3989.method583(i_1_.toLong(), 101) as Class368?
        }
        if (class368 != null) return class368
        val `is`: ByteArray?
        synchronized(aClass45_3979!!) {
            `is` = aClass45_3979.method410(-1860, method2419(127.toByte(), i_1_), method2729(i_1_, 16))
        }
        class368 = Class368()
        class368.aClass319_4513 = this
        class368.anInt4501 = i_1_
        if (`is` != null) class368.method3559(28105, Class348_Sub49(`is`))
        synchronized(aClass60_3989) {
            aClass60_3989.method582(class368, i_1_.toLong(), (-127).toByte())
        }
        return class368
    }

    fun method2544(i: Int, i_2_: Byte) {
        synchronized(aClass60_3989) {
            aClass60_3989.method578(2, i)
            if (i_2_ >= -11) this.aClass45_3981 = null
        }
        anInt3987++
        synchronized(this.aClass60_3990) {
            this.aClass60_3990.method578(2, i)
        }
    }

    fun method2546(i: Int) {
        anInt3984++
        synchronized(aClass60_3989) {
            aClass60_3989.method590(0)
        }
        synchronized(this.aClass60_3990) {
            this.aClass60_3990.method590(0)
        }
    }

    init {
        try {
            this.aClass45_3981 = class45_3_
            aClass45_3979 = class45
            val i_4_ = -1 + aClass45_3979!!.method414(-1)
            aClass45_3979.method407(0, i_4_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("cn.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_3_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt3978: Int = 0
        var aDouble3980: Double = 0.0
        @JvmField
        var aClass315Array3982: Array<Class315?>? = null
        var anInt3983: Int = 0
        var anInt3984: Int = 0
        @JvmField
        var anObject3985: Any? = null
        var anInt3986: Int = 0
        var anInt3987: Int = 0
        @JvmField
        var aBoolean3988: Boolean = false
        @JvmStatic
        fun method2545(bool: Boolean) {
            if (bool == true) {
                aClass315Array3982 = null
                anObject3985 = null
            }
        }
    }
}
