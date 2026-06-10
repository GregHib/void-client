/* Class239_Sub20 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub20 : Class239 {
    override fun method1710(i: Int): Int {
        if (i != 20014) return -9
        anInt6055++
        return 0
    }

    override fun method1714(i: Int, i_0_: Int): Int {
        anInt6051++
        if (!Class348.method2714(7351, this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) return 3
        if (i != 3) method1807(64.toByte())
        return 1
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    fun method1806(i: Int): Boolean {
        if (i < 85) method1714(-53, -119)
        anInt6049++
        return Class348.method2714(7351, this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    fun method1808(i: Int): Int {
        anInt6053++
        if (i != -32350) anInt6048 = -97
        return this.anInt3138
    }

    override fun method1712(i: Int, i_1_: Int) {
        val i_2_ = 38 / ((82 - i) / 35)
        anInt6052++
        this.anInt3138 = i_1_
    }

    override fun method1716(bool: Boolean) {
        anInt6050++
        if (bool != false) method1714(-51, -128)
        if (this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1830((-123).toByte()) && !Class348.method2714(7351, this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) this.anInt3138 = 0
        if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014)
    }

    companion object {
        @JvmField
        var anInt6048: Int = 0
        @JvmField
        var anInt6049: Int = 0
        @JvmField
        var anInt6050: Int = 0
        @JvmField
        var anInt6051: Int = 0
        @JvmField
        var anInt6052: Int = 0
        @JvmField
        var anInt6053: Int = 0
        @JvmField
        var anIntArrayArray6054: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(12, 12, 12, 12), intArrayOf(12, 12, 12, 12), intArrayOf(5, 5, 5), intArrayOf(5, 5, 5), intArrayOf(5, 5, 5), intArrayOf(5, 5, 5), intArrayOf(12, 12, 12, 12, 12, 12), intArrayOf(1, 1, 1, 7), intArrayOf(1, 1, 7, 1), intArrayOf(8, 9, 9, 8, 8, 9), intArrayOf(8, 8, 9, 8, 9, 9), intArrayOf(10, 10, 11, 11, 11, 10), intArrayOf(12, 12, 12, 12))
        @JvmField
        var anInt6055: Int = 0
        @JvmField
        var aClass114_6056: Class114? = Class114(26, 11)

        @JvmStatic
        fun method1807(i: Byte) {
            anIntArrayArray6054 = null
            if (i.toInt() != -121) anIntArrayArray6054 = null
            aClass114_6056 = null
        }
    }
}
