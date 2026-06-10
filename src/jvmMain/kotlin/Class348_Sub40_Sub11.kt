/* Class348_Sub40_Sub11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub11 : Class348_Sub40(0, true) {
    private var anInt9187 = 585
    override fun method3042(i: Int, i_0_: Int): IntArray {
        anInt9186++
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (i_0_ != 255) anIntArray9185 = null
        if (this.aClass191_7032!!.aBoolean2570) {
            val i_1_ = Class239_Sub18.anIntArray6035!![i]
            var i_2_ = 0
            while ((i_2_ < Class348_Sub40_Sub6.Companion.anInt9139)) {
                val i_3_ = Class318_Sub6.anIntArray6432!![i_2_]
                if (anInt9187 < i_3_ && 4096 - anInt9187 > i_3_ && i_1_ > 2048 + -anInt9187 && i_1_ < 2048 + anInt9187) {
                    var i_4_ = -i_3_ + 2048
                    i_4_ = if (i_4_ < 0) -i_4_ else i_4_
                    i_4_ = i_4_ shl 12
                    i_4_ /= 2048 - anInt9187
                    `is`[i_2_] = -i_4_ + 4096
                } else if (2048 - anInt9187 < i_3_ && anInt9187 + 2048 > i_3_) {
                    var i_5_ = i_1_ + -2048
                    i_5_ = if (i_5_ < 0) -i_5_ else i_5_
                    i_5_ -= anInt9187
                    i_5_ = i_5_ shl 12
                    `is`[i_2_] = i_5_ / (2048 + -anInt9187)
                } else if (anInt9187 > i_1_ || i_1_ > 4096 - anInt9187) {
                    var i_6_ = -2048 + i_3_
                    i_6_ = if (i_6_ >= 0) i_6_ else -i_6_
                    i_6_ -= anInt9187
                    i_6_ = i_6_ shl 12
                    `is`[i_2_] = i_6_ / (2048 + -anInt9187)
                } else if (i_3_ < anInt9187 || i_3_ > 4096 + -anInt9187) {
                    var i_7_ = 2048 + -i_1_
                    i_7_ = if (i_7_ < 0) -i_7_ else i_7_
                    i_7_ = i_7_ shl 12
                    i_7_ /= 2048 + -anInt9187
                    `is`[i_2_] = 4096 - i_7_
                } else `is`[i_2_] = 0
                i_2_++
            }
        }
        return `is`
    }

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_8_: Int) {
        anInt9188++
        if (i_8_ == 31015) {
            val i_9_ = i
            if (i_9_ == 0) anInt9187 = class348_sub49.readUnsignedShort(842397944)
        }
    }

    companion object {
        @JvmField
        var anIntArray9185: IntArray? = IntArray(50)
        @JvmField
        var anInt9186: Int = 0
        @JvmField
        var anInt9188: Int = 0

        @JvmStatic
        fun method3075(bool: Boolean) {
            anIntArray9185 = null
            if (bool != false) anIntArray9185 = null
        }
    }
}
