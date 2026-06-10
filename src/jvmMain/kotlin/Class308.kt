/* Class308 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class308 internal constructor(private var anInt3891: Int) {
    private var aClass348_Sub42_3887 = Class348_Sub42()
    private val aClass356_3888: Class356
    private var aClass107_3889: Class107? = Class107()
    private val anInt3890: Int

    fun method2302(l: Long, i: Byte): Class348_Sub42? {
        try {
            if (i > -25) aClass107_3889 = null
            anInt3885++
            val class348_sub42 = aClass356_3888.method3480(l, -6008) as Class348_Sub42?
            if (class348_sub42 != null) aClass107_3889!!.method1005(true, class348_sub42)
            return class348_sub42
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "wu.D(" + l + ',' + i + ')')
        }
    }

    fun method2303(bool: Boolean) {
        anInt3879++
        if (bool != true) method2305(-121L, null, -1)
        aClass107_3889!!.method1009(2110355138)
        aClass356_3888.method3481(0)
        aClass348_Sub42_3887 = Class348_Sub42()
        anInt3891 = anInt3890
    }

    fun method2304(i: Int, l: Long) {
        do {
            try {
                anInt3880++
                val class348_sub42 = aClass356_3888.method3480(l, -6008) as Class348_Sub42?
                if (class348_sub42 != null) {
                    class348_sub42.method2715(73.toByte())
                    class348_sub42.method3162(true)
                    anInt3891++
                }
                if (i <= -110) break
                method2304(36, -86L)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "wu.C(" + i + ',' + l + ')')
            }
            break
        } while (false)
    }

    fun method2305(l: Long, class348_sub42: Class348_Sub42?, i: Int) {
        try {
            anInt3881++
            if ((anInt3891.inv()) == i) {
                var class348_sub42_0_ = aClass107_3889!!.method1008(20)
                class348_sub42_0_!!.method2715(113.toByte())
                class348_sub42_0_.method3162(true)
                if (class348_sub42_0_ === aClass348_Sub42_3887) {
                    class348_sub42_0_ = aClass107_3889!!.method1008(20)
                    class348_sub42_0_!!.method2715(79.toByte())
                    class348_sub42_0_.method3162(true)
                }
            } else anInt3891--
            aClass356_3888.method3483(37.toByte(), l, class348_sub42)
            aClass107_3889!!.method1005(true, class348_sub42!!)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wu.E(" + l + ',' + (if (class348_sub42 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    init {
        anInt3890 = anInt3891
        var i_1_: Int
        i_1_ = 1
        while (i_1_ + i_1_ < anInt3891) {
            i_1_ += i_1_
        }
        aClass356_3888 = Class356(i_1_)
    }

    companion object {
        var anInt3879: Int = 0
        var anInt3880: Int = 0
        var anInt3881: Int = 0
        @JvmField
        var aByteArrayArray3882: Array<ByteArray?>? = null
        var anIntArray3883: IntArray?
        @JvmField
        var anInterface6Array3884: Array<Interface6?>? = arrayOfNulls<Interface6>(75)
        var anInt3885: Int = 0
        var anInt3886: Int = 0
        @JvmStatic
        fun method2306(i: Byte) {
            if (i.toInt() != -90) Companion.method2306((-74).toByte())
            anIntArray3883 = null
            anInterface6Array3884 = null
            aByteArrayArray3882 = null
        }

        init {
            anIntArray3883 = IntArray(6)
        }
    }
}
