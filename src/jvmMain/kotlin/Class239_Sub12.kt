/* Class239_Sub12 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub12 : Class239 {
    override fun method1714(i: Int, i_0_: Int): Int {
        anInt5972++
        if (i != 3) return 121
        if (!Class348.method2714(7351, this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) return 3
        return 1
    }

    fun method1771(i: Int): Int {
        anInt5960++
        if (i != -32350) method1714(80, -99)
        return this.anInt3138
    }

    override fun method1712(i: Int, i_1_: Int) {
        val i_2_ = -19 % ((82 - i) / 35)
        this.anInt3138 = i_1_
        anInt5963++
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1716(bool: Boolean) {
        if (bool != false) method1716(false)
        anInt5962++
        if (this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1830((-119).toByte()) && !Class348.method2714(7351, this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) this.anInt3138 = 0
        if (this.anInt3138 < 0 || this.anInt3138 > 1) this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    fun method1774(i: Int): Boolean {
        if (i < 85) method1773(116.toByte())
        anInt5961++
        return Class348.method2714(7351, this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))
    }

    override fun method1710(i: Int): Int {
        anInt5970++
        if (i != 20014) anInt5965 = -58
        return 0
    }

    companion object {
        @JvmField
        var anInt5960: Int = 0
        @JvmField
        var anInt5961: Int = 0
        @JvmField
        var anInt5962: Int = 0
        @JvmField
        var anInt5963: Int = 0
        @JvmField
        var aClass45_5964: Class45? = null
        @JvmField
        var anInt5965: Int = 0
        @JvmField
        var aString5966: String? = null
        @JvmField
        var anInt5967: Int = 0
        @JvmField
        var anInt5968: Int = 0
        @JvmField
        var anInt5969: Int = 0
        @JvmField
        var anInt5970: Int = 0
        @JvmField
        var aLong5971: Long = 0
        @JvmField
        var anInt5972: Int = 0
        @JvmField
        var anInt5973: Int = 0

        @JvmStatic
        fun method1772(i: Int) {
            anInt5968++
            var class348_sub15 = Class27.aClass356_389!!.method3484(0) as Class348_Sub15?
            if (i <= 4) aString5966 = null
            while ( /**/class348_sub15 != null) {
                Class64_Sub3.method690(108.toByte(), (class348_sub15.anInt6773))
                class348_sub15 = Class27.aClass356_389!!.method3482(0) as Class348_Sub15?
            }
        }

        @JvmStatic
        fun method1773(i: Byte) {
            val i_3_ = -86 / ((i - 13) / 45)
            aString5966 = null
            aClass45_5964 = null
        }

        @JvmStatic
        fun method1775(i: Byte, i_4_: Int, i_5_: Int) {
            anInt5967++
            if (i.toInt() == -8 && Class320.method2547(i_4_, 84.toByte())) Class348_Sub40_Sub19.method3097((Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_4_]!!), i_5_, 119)
        }
    }
}
