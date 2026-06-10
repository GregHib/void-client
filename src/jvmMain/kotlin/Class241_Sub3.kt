/* Class241_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class241_Sub3 internal constructor() : Class241() {
    private var aLong6166 = 0L
    private var aLong6167 = 0L
    private var anInt6168 = 1
    private var aLong6169 = 0L
    private var anInt6170 = 0
    private val aLongArray6171: LongArray

    override fun method1858(i: Int): Long {
        aLong6166 += method1865(10)
        if (i > -60) aLong6169 = 17L
        if (aLong6167 > aLong6166) return (-aLong6166 + aLong6167) / 1000000L
        return 0L
    }

    override fun method1856(i: Byte) {
        aLong6169 = 0L
        if (i < 88) method1856((-4).toByte())
        if (aLong6166 < aLong6167) aLong6166 += aLong6167 + -aLong6166
    }

    private fun method1865(i: Int): Long {
        val l = System.nanoTime()
        val l_0_ = -aLong6169 + l
        if (i != 10) return -56L
        aLong6169 = l
        if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
            aLongArray6171[anInt6170] = l_0_
            if (anInt6168 < 1) anInt6168++
            anInt6170 = (1 + anInt6170) % 10
        }
        var l_1_ = 0L
        for (i_2_ in 1..anInt6168) l_1_ += aLongArray6171[(-i_2_ + anInt6170 - -10) % 10]
        return l_1_ / anInt6168.toLong()
    }

    override fun method1859(i: Int, l: Long): Int {
        if (i != 71) return 22
        if (aLong6167 <= aLong6166) {
            var i_3_ = 0
            do {
                i_3_++
                aLong6167 += l
            } while (i_3_ < 10 && (aLong6167 < aLong6166))
            if (aLong6167 < aLong6166) aLong6167 = aLong6166
            return i_3_
        }
        aLong6169 += -aLong6166 + aLong6167
        aLong6166 += aLong6167 + -aLong6166
        aLong6167 += l
        return 1
    }

    override fun method1862(i: Int): Long {
        if (i != -18931) return -36L
        return aLong6166
    }

    init {
        aLongArray6171 = LongArray(10)
        aLong6166 = System.nanoTime()
        aLong6167 = System.nanoTime()
    }
}
