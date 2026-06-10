/* Class239_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class Class239_Sub6 : Class239 {
    override fun method1710(i: Int): Int {
        if (i != 20014) method1712(-15, 91)
        anInt5898++
        return 0
    }

    fun method1743(i: Int): Int {
        anInt5896++
        if (i != -32350) return -65
        return this.anInt3138
    }

    fun method1744(i: Int): Boolean {
        if (i <= 85) method1743(-113)
        anInt5903++
        val i_0_ = this.aClass348_Sub51_3136.method3428((-93).toByte())!!.method1458(-23688)
        return i_0_ >= 96
    }

    override fun method1716(bool: Boolean) {
        anInt5897++
        val i = this.aClass348_Sub51_3136.method3428((-105).toByte())!!.method1458(-23688)
        if (i < 96) this.anInt3138 = 0
        if (bool != false) aClass355_5900 = null
        if (this.anInt3138 > 1 && i < 128) this.anInt3138 = 1
        if (this.anInt3138 > 2 && i < 192) this.anInt3138 = 2
        if (this.anInt3138 < 0 || this.anInt3138 > 3) this.anInt3138 = method1710(20014)
    }

    override fun method1714(i: Int, i_1_: Int): Int {
        anInt5899++
        val i_2_ = this.aClass348_Sub51_3136.method3428((-104).toByte())!!.method1458(i xor 0x5c84.inv())
        if (i_2_ < 96) return 3
        if (i_1_ > 1 && i_2_ < 128) return 3
        if (i_1_ > i && i_2_ < 192) return 3
        return 1
    }

    override fun method1712(i: Int, i_3_: Int) {
        val i_4_ = -32 / ((82 - i) / 35)
        anInt5901++
        this.anInt3138 = i_3_
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    companion object {
        @JvmField
        var anIntArrayArray5894: Array<IntArray?>? = null
        @JvmField
        var anInt5895: Int = 0
        @JvmField
        var anInt5896: Int = 0
        @JvmField
        var anInt5897: Int = 0
        @JvmField
        var anInt5898: Int = 0
        @JvmField
        var anInt5899: Int = 0
        @JvmField
        var aClass355_5900: Class355? = null
        @JvmField
        var anInt5901: Int = 0
        @JvmField
        var anIntArray5902: IntArray? = IntArray(128)
        @JvmField
        var anInt5903: Int = 0

        @JvmStatic
        fun method1745(string: String, i: Int): Int {
            anInt5895++
            return string.length + 1
        }

        @JvmStatic
        fun method1746(i: Int) {
            anIntArray5902 = null
            if (i != -15628) aClass355_5900 = null
            aClass355_5900 = null
            anIntArrayArray5894 = null
        }

        init {
            run {
                var i = 0
                while (Companion.anIntArray5902!!.size > i) {
                    Companion.anIntArray5902!![i] = -1
                    i++
                }
            }
            for (i in 65..90) anIntArray5902!![i] = -65 + i
            for (i in 97..122) anIntArray5902!![i] = i - 97 + 26
            for (i in 48..57) anIntArray5902!![i] = i + -48 - -52
            anIntArray5902!![43] = 62
            anIntArray5902!![42] = anIntArray5902!![43]
            anIntArray5902!![47] = 63
            anIntArray5902!![45] = anIntArray5902!![47]
        }
    }
}
