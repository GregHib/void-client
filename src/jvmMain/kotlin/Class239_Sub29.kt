/* Class239_Sub29 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub29 : Class239 {
    fun method1848(i: Int): Int {
        if (i != -32350) method1714(100, 29)
        anInt6145++
        return this.anInt3138
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        anInt6153++
        if (i != 20014) method1716(true)
        return 0
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1712(i: Int, i_0_: Int) {
        val i_1_ = -10 / ((i - 82) / 35)
        this.anInt3138 = i_0_
        anInt6148++
    }

    override fun method1714(i: Int, i_10_: Int): Int {
        anInt6146++
        if (i != 3) aBoolean6147 = false
        return 1
    }

    override fun method1716(bool: Boolean) {
        if (this.anInt3138 < 0 || this.anInt3138 > 4) this.anInt3138 = method1710(20014)
        anInt6150++
        if (bool != false) anInt6151 = 62
    }

    companion object {
        @JvmField
        var anInt6144: Int = 0
        @JvmField
        var anInt6145: Int = 0
        @JvmField
        var anInt6146: Int = 0
        @JvmField
        var aBoolean6147: Boolean = false
        @JvmField
        var anInt6148: Int = 0
        @JvmField
        var anInt6149: Int = 0
        @JvmField
        var anInt6150: Int = 0
        @JvmField
        var anInt6151: Int = 0
        @JvmField
        var anInt6152: Int = 0
        @JvmField
        var anInt6153: Int = 0

        @JvmStatic
        fun method1849(c: Char, i: Int): Boolean {
            anInt6149++
            if (Character.isISOControl(c)) return false
            if (Npc.method2446(c, 105.toByte())) return true
            val cs = Class185.aCharArray2488!!
            var i_2_ = 0
            while (cs.size > i_2_) {
                val i_3_ = cs[i_2_].code
                if (c.code == i_3_) return true
                i_2_++
            }
            val i_4_ = -127 / ((i - 44) / 45)
            val cs_5_ = Class131.aCharArray1903!!
            var i_6_ = 0
            while (cs_5_.size > i_6_) {
                val i_7_ = cs_5_[i_6_].code
                if (i_7_ == c.code) return true
                i_6_++
            }
            return false
        }

        @JvmStatic
        fun method1850(i: Int, i_8_: Int): Int {
            anInt6144++
            val i_9_ = 101 % ((-20 - i_8_) / 37)
            return i ushr 8
        }

        @JvmStatic
        fun method1851(i: Byte) {
            anInt6152++
            for (i_11_ in 0..4) Class181.aBooleanArray2374!![i_11_] = false
            Class359.anInt4424 = Class59_Sub2_Sub2.anInt8685
            Class283.anInt3662 = Class348_Sub42_Sub19.anInt9701
            Class5_Sub3.anInt8368 = Class305.anInt3855
            Class348_Sub49_Sub1.anInt9751 = Class367_Sub11.anInt7396
            Class318_Sub1_Sub5_Sub2.anInt10163 = -1
            Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163
            Class318_Sub1_Sub3_Sub2.anInt10047 = Class286_Sub4.anInt6246
            val i_12_ = -99 % ((i - 11) / 56)
            Class239_Sub12.anInt5973 = 0
            Class253.anInt3253 = Class5.anInt4638
            Class367_Sub11.anInt7403 = 0
            Class348_Sub40_Sub21.anInt9282 = 5
            za_Sub1.anInt9775 = -1
            Class292.anInt4803 = -1
        }
    }
}
