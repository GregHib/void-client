/* Class264 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CompassSmoother {
    private var anInt3365 = 0
    var anInt3370: Int = 0
    fun method2016(i: Int, i_2_: Int) {
//        if (i != 15615) method2019(98.toByte())
        anInt3365 = 0
        this.anInt3370 = i_2_
        anInt3377++
    }

    fun method2019(i: Byte): Int {
        if (i >= -18) anInt3373 = 32
        anInt3369++
        return this.anInt3370 and 0x3fff
    }

    fun method2020(i: Int, i_9_: Int, i_10_: Int, i_11_: Byte): Boolean {
        anInt3366++
        val i_12_ = anInt3365
        if (this.anInt3370 == i_9_ && anInt3365 == 0) return false
        if (i_11_ > -8) return true
        val bool: Boolean
        if (anInt3365 == 0) {
            if ((i_9_ > this.anInt3370 && i_9_ <= i_10_ + this.anInt3370) || (i_9_ < this.anInt3370 && (this.anInt3370 - i_10_ <= i_9_))) {
                this.anInt3370 = i_9_
                return false
            }
            bool = true
        } else if (anInt3365 > 0 && this.anInt3370 < i_9_) {
            val i_13_ = anInt3365 * anInt3365 / (2 * i_10_)
            val i_14_ = i_13_ + this.anInt3370
            bool = i_14_ < i_9_ && this.anInt3370 <= i_14_
        } else if (anInt3365 < 0 && i_9_ < this.anInt3370) {
            val i_15_ = anInt3365 * anInt3365 / (2 * i_10_)
            val i_16_ = this.anInt3370 - i_15_
            bool = i_9_ < i_16_ && i_16_ <= this.anInt3370
        } else bool = false
        if (bool) {
            if (this.anInt3370 >= i_9_) {
                anInt3365 -= i_10_
                if (i != 0 && anInt3365 < -i) anInt3365 = -i
            } else {
                anInt3365 += i_10_
                if (i != 0 && i < anInt3365) anInt3365 = i
            }
            if (i_12_ != anInt3365) {
                val i_17_ = anInt3365 * anInt3365 / (2 * i_10_)
                if (i_9_ > this.anInt3370) {
                    if (i_9_ < this.anInt3370 - -i_17_) anInt3365 = i_12_
                } else if (this.anInt3370 > i_9_ && i_9_ > this.anInt3370 - i_17_) anInt3365 = i_12_
            }
        } else if (anInt3365 <= 0) {
            anInt3365 += i_10_
            if (anInt3365 > 0) anInt3365 = 0
        } else {
            anInt3365 -= i_10_
            if (anInt3365 < 0) anInt3365 = 0
        }
        this.anInt3370 += anInt3365 + i_12_ shr 1
        return bool
    }

    fun method2021(i: Byte) {
        anInt3364++
        this.anInt3370 = this.anInt3370 and 0x3fff
        if (i < 77) method2021(36.toByte())
    }

    companion object {
        var anInt3364: Int = 0
        var anInt3366: Int = 0
        var anInt3369: Int = 0
        var anInt3373: Int = 0
        var anInt3377: Int = 0
    }
}