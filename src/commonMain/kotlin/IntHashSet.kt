/* Class316 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class IntHashSet internal constructor(`is`: IntArray) {
    private val anIntArray3961: IntArray

    init {
        var i: Int
        i = 1
        while (`is`.size - -(`is`.size shr 1) >= i) {
            i = i shl 1
        }
        anIntArray3961 = IntArray(i + i)
        for (i_34_ in 0..<i + i) anIntArray3961[i_34_] = -1
        var i_35_ = 0
        while (`is`.size > i_35_) {
            var i_36_: Int
            i_36_ = `is`[i_35_] and -1 + i
            while (anIntArray3961[i_36_ - -i_36_ - -1] != -1) {
                i_36_ = -1 + i and 1 + i_36_
            }
            anIntArray3961[i_36_ + i_36_] = `is`[i_35_]
            anIntArray3961[i_36_ - (-i_36_ + -1)] = i_35_
            i_35_++
        }
    }

    fun method2365(i: Int, i_37_: Int): Int {
        anInt3960++
        val i_38_ = -1 + (anIntArray3961.size shr 1)
        var i_39_ = i_38_ and i_37_
        while (true) {
            val i_40_ = anIntArray3961[i_39_ + i_39_ - -1]
            if (i_40_ == -1) return -1
            if (i_37_ == anIntArray3961[i_39_ + i_39_]) return i_40_
            i_39_ = i_38_ and 1 + i_39_
        }
    }

    companion object {
        var anInt3960: Int = 0
    }
}