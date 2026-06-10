import Class239_Sub8.Companion.method1753
import Class368.Companion.method3561

/* Class239_Sub17 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub17 : Class239 {
    override fun method1714(i: Int, i_7_: Int): Int {
        anInt6023++
        if (i != 3) return 49
        return 1
    }

    override fun method1712(i: Int, i_8_: Int) {
        val i_9_ = -117 % ((82 - i) / 35)
        this.anInt3138 = i_8_
        anInt6025++
    }

    override fun method1716(bool: Boolean) {
        if (this.anInt3138 < 0 && this.anInt3138 > 4) this.anInt3138 = method1710(20014)
        anInt6024++
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    fun method1798(i: Int): Int {
        anInt6028++
        if (i != -32350) return 61
        return this.anInt3138
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) aClass273_6018 = null
        anInt6027++
        if (this.aClass348_Sub51_3136.method3428((-96).toByte())!!.method1462(-113) > 1) return 4
        return 2
    }

    companion object {
        @JvmField
        var aClass273_6018: Class273? = Class273("", 14)
        @JvmField
        var anInt6019: Int = 0
        @JvmField
        var anInt6020: Int = 0
        @JvmField
        var anIntArray6021: IntArray? = null
        @JvmField
        var anInt6022: Int = 0
        @JvmField
        var anInt6023: Int = 0
        @JvmField
        var anInt6024: Int = 0
        @JvmField
        var anInt6025: Int = 0
        @JvmField
        var anInt6026: Int = 0
        @JvmField
        var anInt6027: Int = 0
        @JvmField
        var anInt6028: Int = 0

        @JvmStatic
        fun method1793(`is`: ByteArray, i: Int, i_0_: Int, i_1_: Int): String? {
            anInt6020++
            val cs = CharArray(i_1_)
            var i_2_ = 0
            if (i_0_ >= -82) return null
            var i_3_ = i
            val i_4_ = i_1_ + i
            while (i_4_ > i_3_) {
                val i_5_ = 0xff and `is`[i_3_++].toInt()
                var i_6_: Int
                if (i_5_ < 128) {
                    if (i_5_ == 0) i_6_ = 65533
                    else i_6_ = i_5_
                } else if (i_5_ >= 192) {
                    if (i_5_ >= 224) {
                        if (i_5_ < 240) {
                            if (i_3_ + 1 < i_4_ && (`is`[i_3_].toInt() and 0xc0) == 128 && (0xc0 and `is`[1 + i_3_].toInt()) == 128) {
                                i_6_ = ((i_5_ and 0xf) shl 12 or (`is`[i_3_++].toInt() shl 6 and 0xfc0) or (`is`[i_3_++].toInt() and 0x3f))
                                if (i_6_ < 2048) i_6_ = 65533
                            } else i_6_ = 65533
                        } else if (i_5_ >= 248) i_6_ = 65533
                        else if (i_4_ <= i_3_ - -2 || (0xc0 and `is`[i_3_].toInt()) != 128 || (0xc0 and `is`[1 + i_3_].toInt()) != 128 || (`is`[2 + i_3_].toInt() and 0xc0) != 128) i_6_ = 65533
                        else {
                            i_6_ = (i_5_ shl 18 and 0x1c0000 or ((`is`[i_3_++].toInt() and 0x3f) shl 12) or (0xfc0 and (`is`[i_3_++].toInt() shl 6)) or (0x3f and `is`[i_3_++].toInt()))
                            if (i_6_ >= 65536 && i_6_ <= 1114111) i_6_ = 65533
                            else i_6_ = 65533
                        }
                    } else if (i_3_ >= i_4_ || (0xc0 and `is`[i_3_].toInt()) != 128) i_6_ = 65533
                    else {
                        i_6_ = `is`[i_3_++].toInt() and 0x3f or (i_5_ shl 6 and 0x7c0)
                        if (i_6_ < 128) i_6_ = 65533
                    }
                } else i_6_ = 65533
                cs[i_2_++] = i_6_.toChar()
            }
            return String(cs, 0, i_2_)
        }

        @JvmStatic
        fun method1794(i: Int) {
            if (i != 63) anIntArray6021 = null
            aClass273_6018 = null
            anIntArray6021 = null
        }

        @JvmStatic
        fun method1795(`is`: ByteArray, bool: Boolean): String {
            anInt6026++
            return Class367_Sub8.method3546(`is`, 0, `is`.size, 0)
        }

        @JvmStatic
        fun method1796(i: Int, i_10_: Int): Boolean {
            if (i < 53) return true
            anInt6019++
            return i_10_ == 18 || i_10_ == 6 || i_10_ == 1011 || i_10_ == 13 || i_10_ == 16
        }

        @JvmStatic
        fun method1797(i: Int, i_11_: Int, class46: Class46, i_12_: Byte) {
            if (r.aBoolean9722) {
                val class254 = (if (Class246.anInt3176 != -1) Class101_Sub3.aClass326_5764!!.method2600(Class246.anInt3176, 28364) else null)
                if (Client.method105(class46)!!.method3303(1) && (Class38.anInt500 and 0x20) != 0 && (class254 == null || (class46.method428(class254.anInt3256, Class246.anInt3176, -128) != class254.anInt3256))) {
                    Class31.anInt436++
                    Class50_Sub3.method466(false, (Class28.aString5000 + " -> " + class46.aString752) + Loader.getDebug(class46.anInt830 shr 16, class46.anInt830 and 0xffff), class46.anInt830, (-90).toByte(), false, class46.anInt704, class46.anInt812, true, 6, (class46.anInt830 or (class46.anInt704 shl 0)).toLong(), Class28.aString5001, 0L, Class348_Sub49_Sub1.anInt9747)
                }
            }
            anInt6022++
            for (i_13_ in 9 downTo 5) {
                val string = method3561(i_13_, class46, true)
                if (string != null) {
                    Class50_Sub3.method466(false, class46.aString752 + Loader.getDebug(class46.anInt830 shr 16, class46.anInt830 and 0xffff), class46.anInt830, (-122).toByte(), false, class46.anInt704, class46.anInt812, true, 1011, ((class46.anInt704 shl 0) or class46.anInt830).toLong(), string, (1 + i_13_).toLong(), Class100.method888(57.toByte(), i_13_, class46))
                    Class335.anInt4169++
                }
            }
            val string = method1753(0, class46)
            if (string != null) {
                Class50_Sub3.method466(false, class46.aString752 + Loader.getDebug(class46.anInt830 shr 16, class46.anInt830 and 0xffff), class46.anInt830, (-83).toByte(), false, class46.anInt704, class46.anInt812, true, 13, ((class46.anInt704 shl 0) or class46.anInt830).toLong(), string, 0L, class46.anInt713)
                Class178.anInt2340++
            }
            for (i_14_ in 4 downTo 0) {
                val string_15_ = method3561(i_14_, class46, true)
                if (string_15_ != null) {
                    Class50_Sub3.method466(false, class46.aString752, class46.anInt830, (-67).toByte(), false, class46.anInt704, class46.anInt812, true, 18, ((class46.anInt704 shl 0) or class46.anInt830).toLong(), string_15_, (1 + i_14_).toLong(), Class100.method888(57.toByte(), i_14_, class46))
                    Class335.anInt4169++
                }
            }
            if (Client.method105(class46)!!.method3305(0)) {
                if (class46.aString816 != null) Class50_Sub3.method466(false, "", class46.anInt830, (-118).toByte(), false, class46.anInt704, class46.anInt812, true, 16, ((class46.anInt704 shl 0) or class46.anInt830).toLong(), class46.aString816, 0L, -1)
                else Class50_Sub3.method466(false, "", class46.anInt830, (-79).toByte(), false, class46.anInt704, class46.anInt812, true, 16, (class46.anInt704 shl 0 or class46.anInt830).toLong(), Class274.aClass274_3492!!.method2063(Class348_Sub33.anInt6967, 544), 0L, -1)
                Class348_Sub42_Sub15.anInt9655++
            }
        }
    }
}
