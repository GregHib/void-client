import jagex3.jagmisc.jagmisc.nanoTime

class Class241_Sub2 internal constructor() : Class241() {
    private var aLong6160 = 0L
    private var aLong6161 = 0L
    private var aLong6162 = 0L
    private var anInt6163 = 0
    private val aLongArray6164: LongArray
    private var anInt6165 = 1

    private fun method1864(i: Int): Long {
        val l = nanoTime()
        val l_0_ = l + -aLong6162
        aLong6162 = l
        if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
            aLongArray6164[anInt6163] = l_0_
            if (anInt6165 < 1) anInt6165++
            anInt6163 = (1 + anInt6163) % 10
        }
        var l_1_ = 0L
        if (i != 10) method1864(107)
        for (i_2_ in 1..anInt6165) l_1_ += aLongArray6164[(10 + (anInt6163 + -i_2_)) % 10]
        return l_1_ / anInt6165.toLong()
    }

    override fun method1858(i: Int): Long {
        aLong6161 += method1864(10)
        if (i > -60) return -8L
        if (aLong6161 < aLong6160) return (-aLong6161 + aLong6160) / 1000000L
        return 0L
    }

    override fun method1856(i: Byte) {
        if (i <= 88) method1856(111.toByte())
        aLong6162 = 0L
        if (aLong6160 > aLong6161) aLong6161 += -aLong6161 + aLong6160
    }

    override fun method1862(i: Int): Long {
        if (i != -18931) return -56L
        return aLong6161
    }

    init {
        aLongArray6164 = LongArray(10)
        aLong6161 = nanoTime()
        aLong6160 = aLong6161
        if (aLong6161 == 0L) throw RuntimeException()
    }

    override fun method1859(i: Int, l: Long): Int {
        if (i != 71) method1859(41, -7L)
        if (aLong6161 < aLong6160) {
            aLong6162 += aLong6160 + -aLong6161
            aLong6161 += -aLong6161 + aLong6160
            aLong6160 += l
            return 1
        }
        var i_3_ = 0
        do {
            i_3_++
            aLong6160 += l
        } while (i_3_ < 10 && aLong6161 > aLong6160)
        if (aLong6160 < aLong6161) aLong6160 = aLong6161
        return i_3_
    }
}
