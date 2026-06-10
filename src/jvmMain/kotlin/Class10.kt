import Class348_Sub42_Sub8_Sub2.Companion.method3200

/* Class10 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class10 internal constructor(@JvmField var aByte180: Byte, @JvmField var anInt185: Int, @JvmField var anInt177: Int, @JvmField var anInt188: Int, @JvmField var anInt184: Int, @JvmField var anInt178: Int, @JvmField var anInt173: Int, @JvmField var aClass318_Sub1_172: Class318_Sub1?) {
    @JvmField
    var aClass348_Sub16_Sub5_176: Class348_Sub16_Sub5? = null
    @JvmField
    var aClass317_183: Class317? = null
    @JvmField
    var aClass348_Sub19_Sub1_189: Class348_Sub19_Sub1? = null
    @JvmField
    var aClass348_Sub10_192: Class348_Sub10? = null

    fun method220(i: Byte): Boolean {
        anInt181++
        if (i >= -12) method218(101.toByte())
        return this.aByte180.toInt() == 2 || this.aByte180.toInt() == 3
    }

    companion object {
        @JvmField
        var anIntArrayArray174: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(0, 2), intArrayOf(0, 2), intArrayOf(0, 0, 2), intArrayOf(2, 0, 0), intArrayOf(0, 2, 0), intArrayOf(0, 0, 2), intArrayOf(0, 5, 1, 4), intArrayOf(0, 4, 4, 4), intArrayOf(4, 4, 4, 0), intArrayOf(6, 6, 6, 2, 2, 2), intArrayOf(2, 2, 2, 6, 6, 6), intArrayOf(0, 11, 6, 6, 6, 4), intArrayOf(0, 2), intArrayOf(0, 4, 4, 4), intArrayOf(0, 4, 4, 4))
        @JvmField
        var anInt175: Int = 0
        @JvmField
        var anIntArray179: IntArray? = null
        @JvmField
        var anInt181: Int = 0
        @JvmField
        var anInt182: Int = 0
        @JvmField
        var aClass230_186: Class230?
        @JvmField
        var anIntArray187: IntArray? = intArrayOf(-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048)
        @JvmField
        var anInt190: Int = 0
        @JvmField
        var aClass87_191: Class87? = null
        @JvmStatic
        fun method217(i: Byte): String? {
            anInt175++
            if (Class5_Sub1.aBoolean8335 || Class316.aClass348_Sub42_Sub12_3963 == null) return ""
            if (i < 51) return null
            return (Class316.aClass348_Sub42_Sub12_3963!!.aString9593)
        }

        @JvmStatic
        fun method218(i: Byte) {
            if (i < 101) Companion.method218((-85).toByte())
            anIntArray187 = null
            anIntArray179 = null
            aClass230_186 = null
            aClass87_191 = null
            anIntArrayArray174 = null
        }

        @JvmStatic
        fun method219(i: Int, bool: Boolean, i_0_: Int): Boolean {
            if (bool != false) return false
            anInt190++
            return ((i and 0x800) != 0) or Class278.method2077(-106, i_0_, i) || method3200(i, i_0_, 88.toByte())
        }

        init {
            aClass230_186 = Class230("runescape", 0)
        }
    }
}
