/* Class239_Sub8 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub8 : Class239 {
    override fun method1710(i: Int): Int {
        if (i != 20014) Companion.method1749(null, null, false, 94, (-39).toByte())
        anInt5914++
        if (this.aClass348_Sub51_3136.method3428((-80).toByte())!!.method1456(111.toByte())) return 3
        return 2
    }

    fun method1751(i: Int): Int {
        anInt5917++
        if (i != -32350) anInt5911 = 114
        return this.anInt3138
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1712(i: Int, i_7_: Int) {
        val i_8_ = -87 / ((i - 82) / 35)
        anInt5915++
        this.anInt3138 = i_7_
    }

    override fun method1714(i: Int, i_9_: Int): Int {
        if (i != 3) anInt5911 = 95
        anInt5923++
        return 1
    }

    override fun method1716(bool: Boolean) {
        anInt5913++
        if (this.anInt3138 < 1 || this.anInt3138 > 3) this.anInt3138 = method1710(20014)
        if (bool != false) anIntArrayArray5921 = null
    }

    companion object {
        @JvmField
        var anInt5911: Int = 0
        @JvmField
        var anInt5912: Int = 0
        @JvmField
        var anInt5913: Int = 0
        @JvmField
        var anInt5914: Int = 0
        @JvmField
        var anInt5915: Int = 0
        @JvmField
        var anInt5916: Int = 0
        @JvmField
        var anInt5917: Int = 0
        @JvmField
        var anInt5918: Int = 0
        @JvmField
        var anInt5919: Int = 0
        @JvmField
        var anInt5920: Int = 0
        @JvmField
        var anIntArrayArray5921: Array<IntArray?>? = null
        @JvmField
        var anInt5922: Int = 0
        @JvmField
        var anInt5923: Int = 0
        @JvmField
        var anInt5924: Int = 0

        @JvmStatic
        fun method1749(class110_sub1: Class110_Sub1?, class110_sub1_0_: Class110_Sub1?, bool: Boolean, i: Int, i_1_: Byte): Int {
            try {
                anInt5916++
                if (i == 1) {
                    var i_2_ = class110_sub1!!.anInt1704
                    var i_3_ = class110_sub1_0_!!.anInt1704
                    if (!bool) {
                        if (i_2_ == -1) i_2_ = 2001
                        if (i_3_ == -1) i_3_ = 2001
                    }
                    return -i_3_ + i_2_
                }
                if (i == 2) return (Class239_Sub21.method1811(9152, (class110_sub1_0_!!.method1038(false).aString3663), Class348_Sub33.anInt6967, (class110_sub1!!.method1038(false).aString3663)))
                if (i == 3) {
                    if (class110_sub1!!.aString5787 == "-") {
                        if (class110_sub1_0_!!.aString5787 == "-") return 0
                        if (bool) return -1
                        return 1
                    } else if (class110_sub1_0_!!.aString5787 == "-") {
                        if (!bool) return -1
                        return 1
                    }
                    return (Class239_Sub21.method1811(9152, class110_sub1_0_.aString5787, Class348_Sub33.anInt6967, class110_sub1.aString5787))
                }
                if (i == 4) {
                    if (!class110_sub1!!.method1033(-85)) {
                        if (!class110_sub1_0_!!.method1033(101)) return 0
                        return -1
                    }
                    if (class110_sub1_0_!!.method1033(70)) return 0
                    return 1
                }
                if (i == 5) {
                    if (class110_sub1!!.method1036((-35).toByte())) {
                        if (!class110_sub1_0_!!.method1036((-35).toByte())) return 1
                        return 0
                    }
                    if (!class110_sub1_0_!!.method1036((-35).toByte())) return 0
                    return -1
                }
                if (i == 6) {
                    if (class110_sub1!!.method1031(i_1_.toInt() xor 0x61.inv())) {
                        if (class110_sub1_0_!!.method1031(-105)) return 0
                        return 1
                    }
                    if (class110_sub1_0_!!.method1031(i_1_.toInt() xor 0x60.inv())) return -1
                    return 0
                }
                if (i_1_.toInt() != -30) return 63
                if (i == 7) {
                    if (class110_sub1!!.method1029(true)) {
                        if (!class110_sub1_0_!!.method1029(true)) return 1
                        return 0
                    }
                    if (class110_sub1_0_!!.method1029(true)) return -1
                    return 0
                }
                if (i == 8) {
                    var i_4_ = class110_sub1!!.anInt5788
                    var i_5_ = class110_sub1_0_!!.anInt5788
                    if (bool) {
                        if (i_5_ == 1000) i_5_ = -1
                        if (i_4_ == 1000) i_4_ = -1
                    } else {
                        if (i_5_ == -1) i_5_ = 1000
                        if (i_4_ == -1) i_4_ = 1000
                    }
                    return -i_5_ + i_4_
                }
                return (class110_sub1!!.anInt5786 + -class110_sub1_0_!!.anInt5786)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("mfa.L(" + (if (class110_sub1 != null) "{...}" else "null") + ',' + (if (class110_sub1_0_ != null) "{...}" else "null") + ',' + bool + ',' + i + ',' + i_1_ + ')'))
            }
        }

        @JvmStatic
        fun method1750(i: Int, i_6_: Int) {
            anInt5912++
            Class348_Sub42_Sub1.anInt9488 = i_6_
            Class202.aClass60_2671!!.method590(0)
        }

        @JvmStatic
        fun method1752(i: Int, i_10_: Int, i_11_: Int) {
            Class59_Sub1.anInt5283 = i_11_
            anInt5922++
            Class107.anInt1651 = i_10_
            if (i == -1) {
                if (Class348_Sub49.anInt7207 == 0) {
                    Class239_Sub16.anInt6008 = (2 * Class348_Sub42_Sub9_Sub1.anInt10444 + Class107.anInt1651)
                    Class348_Sub16_Sub1.anInt8854 = Class211.anInt2747 * 2 + Class59_Sub1.anInt5283
                } else if (Class348_Sub49.anInt7207 == 1) {
                    Class31.anInt425 = (Class239_Sub12.anInt5965 + Class59_Sub1.anInt5283 / Class58.anInt1067 - -2)
                    Class250.anInt3225 = (Class73.anInt4784 + Class107.anInt1651 / Class344.anInt4267 - -2)
                    Class348_Sub16_Sub1.anInt8854 = Class58.anInt1067 * Class31.anInt425
                    Class239_Sub16.anInt6008 = Class344.anInt4267 * Class250.anInt3225
                    Class211.anInt2747 = (-Class59_Sub1.anInt5283 + Class348_Sub16_Sub1.anInt8854 shr 1)
                    Class348_Sub42_Sub9_Sub1.anInt10444 = (Class239_Sub16.anInt6008 - Class107.anInt1651 shr 1)
                } else if (Class348_Sub49.anInt7207 == 2) {
                    Class348_Sub16_Sub1.anInt8854 = Class59_Sub1.anInt5283
                    Class239_Sub16.anInt6008 = Class107.anInt1651
                }
            }
        }

        @JvmStatic
        fun method1753(i: Int, class46: Class46): String? {
            anInt5924++
            if (Client.method105(class46)!!.method3307(116) == 0) return null
            if (class46.aString780 == null || class46.aString780!!.trim { it <= ' ' }.length == 0) {
                if (Class299_Sub2.aBoolean6327) return "Hidden-use"
                return null
            }
            if (i != 0) return null
            return class46.aString780
        }

        @JvmStatic
        fun method1754(bool: Boolean, i: Int, i_12_: Int, i_13_: Int): Int {
            anInt5920++
            if (Class348.anInt4290 < 100) return -2
            if (bool != true) method1754(false, 115, 112, -104)
            var i_14_ = -2
            var i_15_ = 2147483647
            val i_16_ = i_12_ - Class75.anInt1266
            val i_17_ = i_13_ - Class75.anInt1263
            var class348_sub21 = Class75.aClass262_1254!!.method1995(4) as Class348_Sub21?
            while (class348_sub21 != null) {
                if (class348_sub21.anInt6847 == i) {
                    val i_18_ = class348_sub21.anInt6852
                    val i_19_ = class348_sub21.anInt6851
                    val i_20_ = (i_19_ - -Class75.anInt1263 or (Class75.anInt1266 + i_18_ shl 14))
                    val i_21_ = ((-i_19_ + i_17_) * (-i_19_ + i_17_) + (i_16_ - i_18_) * (-i_18_ + i_16_))
                    if (i_14_ < 0 || i_15_ > i_21_) {
                        i_15_ = i_21_
                        i_14_ = i_20_
                    }
                }
                class348_sub21 = Class75.aClass262_1254!!.method1990(113.toByte()) as Class348_Sub21?
            }
            return i_14_
        }

        @JvmStatic
        fun method1755(i: Int) {
            anIntArrayArray5921 = null
            if (i != 1) method1749(null, null, false, -43, 102.toByte())
        }

        @JvmStatic
        fun method1756(`is`: ByteArray?, i: Int, i_22_: Int, i_23_: Int, is_24_: Array<ByteArray>, is_25_: Array<ByteArray>, is_26_: IntArray?, is_27_: IntArray?): Int {
            try {
                anInt5918++
                val i_28_ = -19 % ((i - 64) / 39)
                val i_29_ = is_26_!![i_23_]
                val i_30_ = is_27_!![i_23_] + i_29_
                val i_31_ = is_26_[i_22_]
                val i_32_ = is_27_[i_22_] + i_31_
                var i_33_ = i_29_
                if (i_29_ < i_31_) i_33_ = i_31_
                var i_34_ = i_30_
                if (i_32_ < i_30_) i_34_ = i_32_
                var i_35_ = 0xff and `is`!![i_23_].toInt()
                if (i_35_ > (`is`[i_22_].toInt() and 0xff)) i_35_ = 0xff and `is`[i_22_].toInt()
                val is_36_ = is_25_!![i_23_]
                val is_37_ = is_24_!![i_22_]
                var i_38_ = i_33_ + -i_29_
                var i_39_ = -i_31_ + i_33_
                var i_40_ = i_33_
                while (i_34_ > i_40_) {
                    val i_41_ = is_37_[i_39_++] + is_36_[i_38_++]
                    if (i_41_ < i_35_) i_35_ = i_41_
                    i_40_++
                }
                return -i_35_
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("mfa.K(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_22_ + ',' + i_23_ + ',' + (if (is_24_ != null) "{...}" else "null") + ',' + (if (is_25_ != null) "{...}" else "null") + ',' + (if (is_26_ != null) "{...}" else "null") + ',' + (if (is_27_ != null) "{...}" else "null") + ')'))
            }
        }
    }
}
