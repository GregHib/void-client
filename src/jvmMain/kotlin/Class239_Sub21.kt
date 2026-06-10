import Class239_Sub10.Companion.method1765
import kotlin.math.min

/* Class239_Sub21 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub21 : Class239 {
    override fun method1710(i: Int): Int {
        anInt6065++
        if (i != 20014) return -81
        return 1
    }

    fun method1809(i: Int): Boolean {
        anInt6063++
        if (i < 85) method1813(11, 68)
        return !this.aClass348_Sub51_3136.method3425(-104)
    }

    override fun method1712(i: Int, i_35_: Int) {
        this.anInt3138 = i_35_
        anInt6059++
        val i_36_ = -103 % ((i - 82) / 35)
    }

    override fun method1714(i: Int, i_37_: Int): Int {
        if (i != 3) return 91
        anInt6064++
        if (this.aClass348_Sub51_3136.method3425(i xor 0x4b.inv())) return 3
        return 1
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.method3425(-112)) this.anInt3138 = 0
        anInt6057++
        if (bool != false) aClass318_Sub1Array6066 = null
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    fun method1812(i: Int): Int {
        if (i != -32350) anIntArray6062 = null
        anInt6068++
        return this.anInt3138
    }

    companion object {
        @JvmField
        var anInt6057: Int = 0
        @JvmField
        var aClass114_6058: Class114?
        @JvmField
        var anInt6059: Int = 0
        @JvmField
        var anInt6060: Int = 0
        @JvmField
        var anIntArray6061: IntArray?
        @JvmField
        var anIntArray6062: IntArray? = IntArray(3)
        @JvmField
        var anInt6063: Int = 0
        @JvmField
        var anInt6064: Int = 0
        @JvmField
        var anInt6065: Int = 0
        @JvmField
        var aClass318_Sub1Array6066: Array<Class318_Sub1?>? = null
        @JvmField
        var anInt6067: Int = 0
        @JvmField
        var anInt6068: Int = 0
        @JvmField
        var anInt6069: Int = 0

        @JvmStatic
        fun method1810(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
            if (i_5_ != 8 && i_5_ != 16) {
                var class357 = Class147.aClass357ArrayArrayArray2029!![i_4_]!![i]!![i_2_]
                if (class357 == null) class357 = Class357(i_4_)
                if (i_5_ == 1) {
                    class357.aShort4401 = i_0_.toShort()
                    class357.aShort4409 = i_1_.toShort()
                } else if (i_5_ == 2) {
                    class357.aShort4398 = i_1_.toShort()
                    class357.aShort4397 = i_0_.toShort()
                }
                if (Class50_Sub1.aBoolean5226) Class286_Sub3.method2152(false)
            } else if (i_5_ == 8) {
                val i_12_ = i shl Class362.anInt4459
                val i_13_ = Class270.anInt3465 + i_12_
                val i_14_ = i_2_ shl Class362.anInt4459
                val i_15_ = Class270.anInt3465 + i_14_
                val i_16_ = Class348_Sub1_Sub1.aSArray8801!![i_4_]!!.method3982((-86).toByte(), i_2_, i)
                val i_17_ = Class348_Sub1_Sub1.aSArray8801!![i_4_]!!.method3982((-86).toByte(), 1 + i_2_, i - -1)
                Class294.aClass338Array5060!![Class348_Sub44.anInt7101++] = Class338(i_5_, i_4_, i_12_, i_13_, i_13_, i_12_, i_16_, i_17_, -i_1_ + i_17_, -i_1_ + i_16_, i_14_, i_15_, i_15_, i_14_)
            } else {
                val i_6_ = Class270.anInt3465 + (i shl Class362.anInt4459)
                val i_7_ = -Class270.anInt3465 + i_6_
                val i_8_ = i_2_ shl Class362.anInt4459
                val i_9_ = i_8_ + Class270.anInt3465
                val i_10_ = Class348_Sub1_Sub1.aSArray8801!![i_4_]!!.method3982((-86).toByte(), i_2_, i + 1)
                val i_11_ = Class348_Sub1_Sub1.aSArray8801!![i_4_]!!.method3982((-86).toByte(), 1 + i_2_, i)
                Class294.aClass338Array5060!![Class348_Sub44.anInt7101++] = Class338(i_5_, i_4_, i_6_, i_7_, i_7_, i_6_, i_10_, i_11_, -i_1_ + i_11_, i_10_ - i_1_, i_8_, i_9_, i_9_, i_8_)
            }
            if (i_3_ != -1) method1811(31, null, 115, null)
            anInt6067++
        }

        @JvmStatic
        fun method1811(i: Int, string: String?, i_18_: Int, string_19_: String?): Int {
            try {
                anInt6060++
                val i_20_ = string_19_!!.length
                val i_21_ = string!!.length
                var i_22_ = 0
                var i_23_ = 0
                var c = '\u0000'
                var c_24_ = '\u0000'
                while_81_@ do {
                    var c_25_: Char
                    var c_26_: Char
                    while (true) {
                        if (-c.code + i_22_ >= i_20_ && -c_24_.code + i_23_ >= i_21_) break@while_81_
                        if (-c.code + i_22_ >= i_20_) return -1
                        if (i_21_ <= -c_24_.code + i_23_) return 1
                        if (c.code != 0) {
                            c_25_ = c
                            val bool = false
                        } else c_25_ = string_19_.get(i_22_++)
                        if (c_24_.code != 0) {
                            c_26_ = c_24_
                            val bool = false
                        } else c_26_ = string.get(i_23_++)
                        c = Class105_Sub2.method990(c_25_, (-39).toByte())
                        c_24_ = Class105_Sub2.method990(c_26_, (-127).toByte())
                        c_25_ = method1765(c_25_, i_18_, 105)
                        c_26_ = method1765(c_26_, i_18_, 105)
                        if (c_25_ != c_26_ && (c_26_.uppercaseChar() != c_25_.uppercaseChar())) {
                            c_25_ = c_25_.lowercaseChar()
                            c_26_ = c_26_.lowercaseChar()
                            if (c_25_ != c_26_) break
                        }
                    }
                    return (Class113.method1056(i_18_, 30316, c_25_) + -Class113.method1056(i_18_, i xor 0x55ac, c_26_))
                } while (false)
                val i_27_ = min(i_20_, i_21_)
                var i_28_ = 0
                while (i_27_ > i_28_) {
                    if (i_18_ == 2) {
                        i_23_ = -i_28_ + (i_21_ - 1)
                        i_22_ = i_20_ - (1 - -i_28_)
                    } else {
                        i_23_ = i_28_
                        i_22_ = i_23_
                    }
                    var c_29_ = string_19_.get(i_22_)
                    var c_30_ = string.get(i_23_)
                    if (c_29_ != c_30_ && (c_29_.uppercaseChar() != c_30_.uppercaseChar())) {
                        c_29_ = c_29_.lowercaseChar()
                        c_30_ = c_30_.lowercaseChar()
                        if (c_30_ != c_29_) return (Class113.method1056(i_18_, 30316, c_29_) + -Class113.method1056(i_18_, 30316, c_30_))
                    }
                    i_28_++
                }
                if (i != 9152) method1810(-67, 60, -16, -117, -17, -84, 39)
                val i_31_ = -i_21_ + i_20_
                if (i_31_ != 0) return i_31_
                var i_32_ = 0
                while (i_27_ > i_32_) {
                    val c_33_ = string_19_.get(i_32_)
                    val c_34_ = string.get(i_32_)
                    if (c_34_ != c_33_) return (Class113.method1056(i_18_, 30316, c_33_) - Class113.method1056(i_18_, 30316, c_34_))
                    i_32_++
                }
                return 0
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("vu.F(" + i + ',' + (if (string != null) "{...}" else "null") + ',' + i_18_ + ',' + (if (string_19_ != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method1813(i: Int, i_38_: Int): Boolean {
            anInt6069++
            if (i != 8806) method1813(-86, 33)
            if (i_38_ == 3 || i_38_ == 4 || i_38_ == 9 || i_38_ == 59 || i_38_ == 1007) return true
            return i_38_ == 2 || i_38_ == 1001
        }

        @JvmStatic
        fun method1814(i: Byte) {
            aClass318_Sub1Array6066 = null
            anIntArray6062 = null
            val i_39_ = 41 % ((i - -32) / 32)
            anIntArray6061 = null
            aClass114_6058 = null
        }

        init {
            anIntArray6061 = IntArray(32)
            aClass114_6058 = Class114(46, -1)
        }
    }
}
