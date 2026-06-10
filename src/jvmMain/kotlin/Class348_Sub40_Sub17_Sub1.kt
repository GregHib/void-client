import Class348_Sub5.Companion.method2755

/* Class348_Sub40_Sub17_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub17_Sub1 : Class348_Sub40_Sub17() {
    override fun method3047(i: Int, i_0_: Int): Array<IntArray?>? {
        if (i_0_ != -1564599039) method3093(54)
        anInt10425++
        val `is` = this.aClass322_7033!!.method2557(-93, i)!!
        if (this.aClass322_7033!!.aBoolean4035 && this.method3090(true)) {
            val is_1_ = `is`[0]!!
            val is_2_ = `is`[1]!!
            val is_3_ = `is`[2]!!
            val i_4_ = (this.anInt9241 * (i % this.anInt9241))
            for (i_5_ in 0..<Class348_Sub40_Sub6.Companion.anInt9139) {
                val i_6_ = (this.anIntArray9232!![(i_5_ % this.anInt9237 + i_4_)])
                is_3_[i_5_] = Class139.method1166(4080, i_6_ shl 4)
                is_2_[i_5_] = Class139.method1166(65280, i_6_) shr 4
                is_1_[i_5_] = Class139.method1166(4080, i_6_ shr 12)
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt10425: Int = 0
        @JvmField
        var aClass45_10426: Class45? = null
        @JvmField
        var anInt10427: Int = 0

        @JvmStatic
        fun method3092(i: Int) {
            if (i != -1) aClass45_10426 = null
            aClass45_10426 = null
        }

        @JvmStatic
        fun method3093(i: Int) {
            if (i > 85) {
                anInt10427++
                method2755(-1, 255, -1)
            }
        }
    }
}
