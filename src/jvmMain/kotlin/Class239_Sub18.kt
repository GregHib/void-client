import java.io.IOException

class Class239_Sub18 : Class239 {
    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1714(i: Int, i_1_: Int): Int {
        anInt6034++
        if (i != 3) return -46
        if (this.aClass348_Sub51_3136.method3425(-62)) return 3
        if (i_1_ == 0 || this.aClass348_Sub51_3136.aClass239_Sub9_7256!!.method1759(-32350) == 1) return 1
        return 2
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) anIntArray6035 = null
        anInt6029++
        return 1
    }

    fun method1800(i: Int): Int {
        anInt6031++
        if (i != -32350) anIntArray6035 = null
        return this.anInt3138
    }

    override fun method1716(bool: Boolean) {
        anInt6036++
        if (bool == false) {
            if (this.aClass348_Sub51_3136.method3425(-94)) this.anInt3138 = 0
            if (this.anInt3138 < 0 && this.anInt3138 > 2) this.anInt3138 = method1710(20014)
        }
    }

    fun method1801(i: Int): Boolean {
        if (i <= 85) method1800(90)
        anInt6037++
        return !this.aClass348_Sub51_3136.method3425(-70)
    }

    override fun method1712(i: Int, i_3_: Int) {
        this.anInt3138 = i_3_
        anInt6032++
        val i_4_ = 65 / ((82 - i) / 35)
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    companion object {
        @JvmField
        var anInt6029: Int = 0
        @JvmField
        var aClass251_6030: Class251? = Class251()
        @JvmField
        var anInt6031: Int = 0
        @JvmField
        var anInt6032: Int = 0
        @JvmField
        var anInt6033: Int = 0
        @JvmField
        var anInt6034: Int = 0
        @JvmField
        var anIntArray6035: IntArray? = null
        @JvmField
        var anInt6036: Int = 0
        @JvmField
        var anInt6037: Int = 0
        @JvmField
        var anInt6038: Int = 0

        @JvmStatic
        fun method1799(i: Int) {
            val i_0_ = 51 / ((i - 33) / 40)
            anIntArray6035 = null
            aClass251_6030 = null
        }

        @JvmStatic
        @Throws(IOException::class)
        fun method1802(i: Int) {
            if (Class348_Sub40_Sub8.aClass238_9165 != null && Class348_Sub34.anInt6969 > 0) {
                var i_2_ = 0
                while (true) {
                    val class348_sub47 = Class348_Sub40_Sub13.aClass262_9201!!.method1995(i xor 0x4) as Class348_Sub47?
                    if (class348_sub47 == null) break
                    Class348_Sub40_Sub8.aClass238_9165!!.method1706(0, i xor 0x77, class348_sub47.anInt7119, (class348_sub47.aClass348_Sub49_Sub2_7116!!.aByteArray7154!!))
                    i_2_ += class348_sub47.anInt7119
                    Class348_Sub34.anInt6969 -= class348_sub47.anInt7119
                    class348_sub47.method2715(74.toByte())
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.method3360((-69).toByte())
                    class348_sub47.method3326((-45).toByte())
                }
                Class11.anInt193 = 0
                Class81.anInt1433 += i_2_
            }
            if (i != 0) method1799(58)
            anInt6038++
        }
    }
}
