/* Class348_Sub40_Sub31 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub31 : Class348_Sub40(1, false) {
    private var anInt9405 = 4
    private var anInt9410 = 4
    override fun method3047(i: Int, i_0_: Int): Array<IntArray?>? {
        anInt9407++
        if (i_0_ != -1564599039) return null
        val `is` = this.aClass322_7033!!.method2557(-111, i)!!
        if (this.aClass322_7033!!.aBoolean4035) {
            val i_1_: Int = Class348_Sub40_Sub6.Companion.anInt9139 / anInt9405
            val i_2_ = Class286_Sub2.anInt6212 / anInt9410
            val is_3_: Array<IntArray?>?
            if (i_2_ > 0) {
                val i_4_ = i % i_2_
                is_3_ = this.method3039((-86).toByte(), Class286_Sub2.anInt6212 * i_4_ / i_2_, 0)
            } else is_3_ = this.method3039(105.toByte(), 0, 0)
            val is_5_ = is_3_!![0]!!
            val is_6_ = is_3_[1]!!
            val is_7_ = is_3_[2]!!
            val is_8_ = `is`[0]!!
            val is_9_ = `is`[1]!!
            val is_10_ = `is`[2]!!
            var i_11_ = 0
            while ((i_11_ < Class348_Sub40_Sub6.Companion.anInt9139)) {
                val i_12_: Int
                if (i_1_ <= 0) i_12_ = 0
                else {
                    val i_13_ = i_11_ % i_1_
                    i_12_ = Class348_Sub40_Sub6.Companion.anInt9139 * i_13_ / i_1_
                }
                is_8_[i_11_] = is_5_[i_12_]
                is_9_[i_11_] = is_6_[i_12_]
                is_10_[i_11_] = is_7_[i_12_]
                i_11_++
            }
        }
        return `is`
    }

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_14_: Int) {
        if (i_14_ == 31015) {
            val i_15_ = i
            do {
                if (i_15_ == 0) {
                    anInt9405 = class348_sub49.readUnsignedByte(255)
                    break
                } else if (i_15_ != 1) break
                anInt9410 = class348_sub49.readUnsignedByte(255)
            } while (false)
            anInt9413++
        }
    }

    override fun method3042(i: Int, i_16_: Int): IntArray? {
        if (i_16_ != 255) return null
        anInt9409++
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (this.aClass191_7032!!.aBoolean2570) {
            val i_17_: Int = Class348_Sub40_Sub6.Companion.anInt9139 / anInt9405
            val i_18_ = Class286_Sub2.anInt6212 / anInt9410
            val is_19_: IntArray
            if (i_18_ > 0) {
                val i_20_ = i % i_18_
                is_19_ = this.method3048(i_20_ * Class286_Sub2.anInt6212 / i_18_, 633706337, 0)!!
            } else is_19_ = this.method3048(0, 633706337, 0)!!
            var i_21_ = 0
            while (Class348_Sub40_Sub6.Companion.anInt9139 > i_21_) {
                if (i_17_ <= 0) `is`[i_21_] = is_19_[0]
                else {
                    val i_22_ = i_21_ % i_17_
                    `is`[i_21_] = is_19_[(Class348_Sub40_Sub6.Companion.anInt9139 * i_22_ / i_17_)]
                }
                i_21_++
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9404: Int = 0
        @JvmField
        var anInt9406: Int = 0
        @JvmField
        var anInt9407: Int = 0
        var anInt9408: Int = 0
        @JvmField
        var anInt9409: Int = 0
        var anInt9411: Int
        @JvmField
        var anInt9412: Int = 0
        @JvmField
        var anInt9413: Int = 0

        @JvmStatic
        fun method3131(i: Byte, string: String?): Boolean {
            if (i.toInt() != 50) Companion.method3131((-33).toByte(), null)
            anInt9404++
            return Player.aHashtable10565!!.containsKey(string)
        }

        init {
            anInt9411 = 0
        }
    }
}
