import lang.StringBuffer

/* Class179 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GrowableStringList internal constructor(private val anInt2365: Int, bool: Boolean) {
    private var aBoolean2360 = false
    private var anInt2364 = -1
    private var aStringArray2367 = arrayOfNulls<String>(0)
    private fun method1358(i: Int, i_0_: Int): Int {
        val i_1_ = 71 % ((i_0_ - -4) / 53)
        anInt2362++
        var i_2_ = aStringArray2367.size
        while (i_2_ <= i) {
            if (!aBoolean2360) i_2_ += anInt2365
            else if (i_2_ != 0) i_2_ *= anInt2365
            else i_2_ = 1
        }
        return i_2_
    }

    fun method1361(i: Int): Array<String?> {
        anInt2359++
        val i_7_ = 95 % ((15 - i) / 32)
        val strings = arrayOfNulls<String>(1 + anInt2364)
        ArrayCopyUtil.method1575(aStringArray2367, 0, strings, 0, anInt2364 - -1)
        return strings
    }

    private fun method1362(string: String?, i: Int, i_8_: Int) {
        if (i >= -56) aBoolean2360 = true
        anInt2366++
        if (i_8_ > anInt2364) anInt2364 = i_8_
        if (aStringArray2367.size <= i_8_) method1363(i_8_, -107)
        aStringArray2367[i_8_] = string
    }

    private fun method1363(i: Int, i_9_: Int) {
        val i_10_ = 50 % ((3 - i_9_) / 63)
        anInt2358++
        val strings = arrayOfNulls<String>(method1358(i, 108))
        ArrayCopyUtil.method1575(aStringArray2367, 0, strings, 0, aStringArray2367.size)
        aStringArray2367 = strings
    }

    fun method1364(i: Int, string: String?) {
        method1362(string, -99, 1 + anInt2364)
        anInt2356++
        if (i != -1) aBoolean2360 = true
    }

    init {
        aBoolean2360 = bool
    }

    override fun toString(): String {
        anInt2357++
        val stringbuffer = StringBuffer()
        stringbuffer.append("[")
        var i = 0
        while (anInt2364 > i) {
            if (i != 0) stringbuffer.append(", ")
            stringbuffer.append(aStringArray2367[i])
            i++
        }
        stringbuffer.append("]")
        return stringbuffer.toString()
    }

    companion object {
        var anInt2356: Int = 0
        var anInt2357: Int = 0
        var anInt2358: Int = 0
        var anInt2359: Int = 0
        var anInt2361: Int = 1
        var anInt2362: Int = 0
        var anInt2366: Int = 0
    }
}