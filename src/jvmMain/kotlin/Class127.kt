import Class14_Sub4.Companion.method253
import Class6.Companion.method203

/* Class127 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class127(class45: Class45?, class288: Class288?) : Interface1 {
    var aClass105_4655: Class105? = null
    var aClass288_4659: Class288? = null
    private val aClass45_4661: Class45?
    override fun method8(i: Byte): Boolean {
        val i_0_ = -79 / ((i - 25) / 52)
        anInt4658++
        return aClass45_4661!!.method421(false, (this.aClass288_4659!!.anInt4958))
    }

    override fun method9(i: Byte, bool: Boolean) {
        anInt4653++
        if (bool) {
            val i_1_ = ((this.aClass288_4659!!.aClass221_4955!!.method1607(Class92.anInt1524, this.aClass105_4655!!.method966(), (-117).toByte())) + this.aClass288_4659!!.anInt4950)
            val i_2_ = ((this.aClass288_4659!!.aClass341_4952!!.method2679(ha_Sub2.anInt7666, this.aClass105_4655!!.method980(), 1595)) - -this.aClass288_4659!!.anInt4951)
            this.aClass105_4655!!.method974(i_1_, i_2_)
        }
        if (i.toInt() != -49) anInt4656 = 26
    }

    override fun method7(i: Int) {
        if (i != 10286) anInt4656 = -123
        this.aClass105_4655 = Class369_Sub3_Sub1.method3577((this.aClass288_4659!!.anInt4958), (-60).toByte(), aClass45_4661!!)
        anInt4660++
    }

    init {
        try {
            aClass45_4661 = class45
            this.aClass288_4659 = class288
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nl.<init>(" + (if (class45 != null) "{...}" else "null") + ',' + (if (class288 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4652: Int = 0
        @JvmField
        var anInt4653: Int = 0
        @JvmField
        var anIntArray4654: IntArray? = null
        @JvmField
        var anInt4656: Int = 0
        @JvmField
        var anInt4657: Int = 0
        @JvmField
        var anInt4658: Int = 0
        @JvmField
        var anInt4660: Int = 0
        @JvmField
        var anInt4662: Int = 0

        fun method1115(i: Int, i_3_: Int, i_4_: Byte): Int {
            anInt4652++
            var i_5_ = i - -(57 * i_3_)
            i_5_ = i_5_ xor (i_5_ shl 13)
            val i_6_ = -76 / ((i_4_ - 22) / 60)
            val i_7_ = 1376312589 + i_5_ * (15731 * i_5_ * i_5_ + 789221) and 0x7fffffff
            return (i_7_ and 0x7fa112f) shr 19
        }

        fun method1116(i: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Byte) {
            if (Class369.anInt4960 > i_9_ + -i_10_ || Class113.anInt1745 < i_10_ + i_9_ || Class132.anInt1910 > i - i_10_ || i - -i_10_ > Class38.anInt513) method203(-107, i_9_, i_8_, i, i_10_)
            else method253(i, i_9_, -648, i_8_, i_10_)
            anInt4662++
            val i_12_ = -68 / ((40 - i_11_) / 36)
        }

        @JvmStatic
        fun method1117(i: Int) {
            anIntArray4654 = null
            val i_13_ = -13 / ((i - 57) / 47)
        }
    }
}
