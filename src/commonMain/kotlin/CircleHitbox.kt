/* Class30 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CircleHitbox internal constructor(private var anInt409: Int, private var anInt417: Int, private var anInt408: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
    private var anInt404: Int
    private var anInt405: Int
    private var anInt406: Int
    private var anInt412: Int
    private var anInt416: Int
    private var anInt418: Int
    private var anInt419: Int

    fun method320(i: Int, i_4_: Int, i_5_: Byte, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int) {
        anInt415++
        anInt409 = i_6_
        anInt417 = i_12_
        anInt405 = i_7_ * i_7_
        anInt408 = i_8_
        anInt404 = i_10_ + anInt408
        anInt412 = anInt408 + i_11_
        anInt419 = anInt409 + i_13_
        anInt418 = i_9_ + anInt409
        anInt416 = i_4_ + anInt417
        anInt406 = anInt417 - -i
    }

    fun method321(i: Int, i_14_: Int, i_15_: Int, i_16_: Int): Boolean {
        anInt411++
        if (anInt418 > i_16_ || i_16_ > anInt419) return false
        if (anInt416 > i_15_ || i_15_ > anInt406) return false
        if (i_14_ < anInt412 || anInt404 < i_14_) return false
        val i_17_ = -anInt409 + i_16_
        val i_18_ = i_14_ + -anInt408
        return anInt405 > i_17_ * i_17_ + i_18_ * i_18_
    }

    init {
        anInt405 = i_21_ * i_21_
        anInt412 = anInt408 + i_26_
        anInt406 = i_25_ + anInt417
        anInt416 = i_24_ + anInt417
        anInt404 = i_27_ + anInt408
        anInt419 = i_23_ + anInt409
        anInt418 = anInt409 - -i_22_
    }

    companion object {
        @JvmField
        var anInt411: Int = 0
        @JvmField
        var anInt415: Int = 0
    }
}