/* Class241_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class241_Sub1 internal constructor() : Class241() {
    private var aLong6154 = 0L
    private var aLong6155 = 0L
    private var anInt6156 = 1
    private val aLongArray6157: LongArray
    private var aLong6158 = 0L
    private var anInt6159 = 0

    override fun method1862(i: Int): Long {
        if (i != -18931) anInt6159 = 65
        return aLong6158
    }

    override fun method1859(i: Int, l: Long): Int {
        if (i != 71) return 127
        if (aLong6154 > aLong6158) {
            aLong6155 += aLong6154 - aLong6158
            aLong6158 += -aLong6158 + aLong6154
            aLong6154 += l
            return 1
        }
        var i_0_ = 0
        do {
            i_0_++
            aLong6154 += l
        } while (i_0_ < 10 && (aLong6154 < aLong6158))
        if (aLong6154 < aLong6158) aLong6154 = aLong6158
        return i_0_
    }

    override fun method1858(i: Int): Long {
        if (i >= -60) anInt6156 = 64
        aLong6158 += method1863(56)
        if (aLong6158 < aLong6154) return (aLong6154 - aLong6158) / 1000000L
        return 0L
    }

    override fun method1856(i: Byte) {
        aLong6155 = 0L
        if (aLong6154 > aLong6158) aLong6158 += -aLong6158 + aLong6154
        if (i < 88) aLong6158 = -33L
    }

    private fun method1863(i: Int): Long {
        val l = Class62.method599(-56) * 1000000L
        val l_1_ = l + -aLong6155
        aLong6155 = l
        if (l_1_ > -5000000000L && l_1_ < 5000000000L) {
            aLongArray6157[anInt6159] = l_1_
            if (anInt6156 < 10) anInt6156++
            anInt6159 = (anInt6159 - -1) % 10
        }
        var l_2_ = 0L
        var i_3_ = 1
        if (i <= 0) method1859(91, -39L)
        while ( /**/anInt6156 >= i_3_) {
            l_2_ += aLongArray6157[(10 + (anInt6159 + -i_3_)) % 10]
            i_3_++
        }
        return l_2_ / anInt6156.toLong()
    }

    init {
        aLongArray6157 = LongArray(10)
    }
}
