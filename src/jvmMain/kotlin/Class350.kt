/* Class350 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class350 {
    var anInt4307: Int = 0
    var anInt4308: Int = 0
    var anInt4309: Int = 0
    var anInt4310: Int = 0
    var anInt4311: Int = 128
    var anInt4312: Int = 0
    var anInt4313: Int
    var anInt4314: Int = 128
    var anInt4316: Int = 0
    var anInt4317: Int = 0
    var anInt4320: Int = 0
    fun method3453(bool: Boolean): Class350 {
        anInt4318++
        if (bool != true) method3453(false)
        return Class350(this.anInt4313, this.anInt4314, this.anInt4311, this.anInt4316, this.anInt4317, this.anInt4308)
    }

    fun method3454(class350_3_: Class350, bool: Boolean) {
        this.anInt4308 = class350_3_.anInt4308
        this.anInt4314 = class350_3_.anInt4314
        if (bool == true) {
            this.anInt4316 = class350_3_.anInt4316
            this.anInt4317 = class350_3_.anInt4317
            anInt4321++
            this.anInt4313 = class350_3_.anInt4313
            this.anInt4311 = class350_3_.anInt4311
        }
    }

    internal constructor(i: Int) {
        this.anInt4313 = i
    }

    private constructor(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
        this.anInt4317 = i_7_
        this.anInt4313 = i
        this.anInt4316 = i_6_
        this.anInt4311 = i_5_
        this.anInt4308 = i_8_
        this.anInt4314 = i_4_
    }

    companion object {
        var anInt4315: Int = 0
        var anInt4318: Int = 0
        var anInt4319: Int = 0
        var anInt4321: Int = 0

        fun method3452(i: Int, i_0_: Byte, i_1_: Int): Int {
            if (i_0_.toInt() != -15) method3452(80, 123.toByte(), -88)
            anInt4315++
            val i_2_ = i_1_ + -1 and (i shr 31)
            return (i + (i ushr 31)) % i_1_ + i_2_
        }
    }
}
