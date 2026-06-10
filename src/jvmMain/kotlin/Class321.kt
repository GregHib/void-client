import Class33.Companion.method340

/* Class321 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class321 {
    private lateinit var anIntArrayArray3996: Array<IntArray?>
    private lateinit var anIntArrayArray3997: Array<IntArray?>
    private lateinit var anIntArray3998: IntArray
    var anInt4000: Int = -1
    private lateinit var anIntArray4001: IntArray
    private lateinit var anIntArrayArray4002: Array<IntArray?>
    private lateinit var anIntArray4003: IntArray
    private lateinit var anIntArray4004: IntArray
    private var aClass356_4006: Class356? = null
    private lateinit var anIntArray4007: IntArray
    private lateinit var anIntArray4008: IntArray
    private lateinit var anIntArray4009: IntArray
    private var aString4010: String? = null
    private lateinit var aStringArray4011: Array<String?>
    private var aString4012: String? = null
    private var anIntArray4014: IntArray? = null
    private lateinit var aStringArray4016: Array<String?>
    fun method2548(i: Byte) {
        anInt3999++
        if (aString4010 == null) aString4010 = aString4012
    }

    private fun method2550(class348_sub49: Class348_Sub49, i: Int, i_0_: Byte) {
        if (i_0_.toInt() != 52) anIntArray4014 = null
        anInt4013++
        if (i != 1) {
            if (i == 2) aString4010 = class348_sub49.method3371(i_0_.toInt() xor 0x349a.inv())
            else if (i == 3) {
                val i_1_ = class348_sub49.readUnsignedByte(i_0_.toInt() xor 0xcb)
                anIntArrayArray3997 = Array<IntArray?>(i_1_) { IntArray(3) }
                var i_2_ = 0
                while (i_1_ > i_2_) {
                    anIntArrayArray3997[i_2_]!![0] = class348_sub49.readUnsignedShort(842397944)
                    anIntArrayArray3997[i_2_]!![1] = class348_sub49.readInt((-126).toByte())
                    anIntArrayArray3997[i_2_]!![2] = class348_sub49.readInt((-126).toByte())
                    i_2_++
                }
            } else if (i == 4) {
                val i_17_ = class348_sub49.readUnsignedByte(255)
                anIntArrayArray3996 = Array<IntArray?>(i_17_) { IntArray(3) }
                var i_18_ = 0
                while (i_17_ > i_18_) {
                    anIntArrayArray3996[i_18_]!![0] = class348_sub49.readUnsignedShort(842397944)
                    anIntArrayArray3996[i_18_]!![1] = class348_sub49.readInt((-126).toByte())
                    anIntArrayArray3996[i_18_]!![2] = class348_sub49.readInt((-126).toByte())
                    i_18_++
                }
            } else if (i != 5) {
                if (i == 6) class348_sub49.readUnsignedByte(255)
                else if (i == 7) class348_sub49.readUnsignedByte(255)
                else if (i != 8) {
                    if (i != 9) {
                        if (i == 10) {
                            val i_3_ = class348_sub49.readUnsignedByte(i_0_ + 203)
                            anIntArray4008 = IntArray(i_3_)
                            var i_4_ = 0
                            while (i_3_ > i_4_) {
                                anIntArray4008[i_4_] = class348_sub49.readInt((-126).toByte())
                                i_4_++
                            }
                        } else if (i != 12) {
                            if (i == 13) {
                                val i_15_ = class348_sub49.readUnsignedByte(255)
                                anIntArray4004 = IntArray(i_15_)
                                for (i_16_ in 0..<i_15_) anIntArray4004[i_16_] = class348_sub49.readUnsignedShort(842397944)
                            } else if (i == 14) {
                                val i_13_ = class348_sub49.readUnsignedByte(i_0_.toInt() xor 0xcb)
                                anIntArrayArray4002 = Array<IntArray?>(i_13_) { IntArray(2) }
                                for (i_14_ in 0..<i_13_) {
                                    anIntArrayArray4002[i_14_]!![0] = class348_sub49.readUnsignedByte(255)
                                    anIntArrayArray4002[i_14_]!![1] = (class348_sub49.readUnsignedByte(Class348_Sub21.method2955(i_0_.toInt(), 203)))
                                }
                            } else if (i == 15) class348_sub49.readUnsignedShort(842397944)
                            else if (i == 17) this.anInt4000 = class348_sub49.readUnsignedShort(842397944)
                            else if (i == 18) {
                                val i_5_ = class348_sub49.readUnsignedByte(255)
                                anIntArray4014 = IntArray(i_5_)
                                aStringArray4011 = arrayOfNulls<String>(i_5_)
                                anIntArray4007 = IntArray(i_5_)
                                anIntArray4001 = IntArray(i_5_)
                                var i_6_ = 0
                                while ((i_6_ < i_5_)) {
                                    anIntArray4014!![i_6_] = (class348_sub49.readInt((-126).toByte()))
                                    anIntArray4001[i_6_] = (class348_sub49.readInt((-126).toByte()))
                                    anIntArray4007[i_6_] = (class348_sub49.readInt((-126).toByte()))
                                    aStringArray4011[i_6_] = (class348_sub49.readString(123.toByte()))
                                    i_6_++
                                }
                            } else if (i == 19) {
                                val i_7_ = class348_sub49.readUnsignedByte(255)
                                aStringArray4016 = arrayOfNulls<String>(i_7_)
                                anIntArray4003 = IntArray(i_7_)
                                anIntArray4009 = IntArray(i_7_)
                                anIntArray3998 = IntArray(i_7_)
                                var i_8_ = 0
                                while ((i_8_ < i_7_)) {
                                    anIntArray4009[i_8_] = (class348_sub49.readInt((-126).toByte()))
                                    anIntArray3998[i_8_] = (class348_sub49.readInt((-126).toByte()))
                                    anIntArray4003[i_8_] = (class348_sub49.readInt((-126).toByte()))
                                    aStringArray4016[i_8_] = (class348_sub49.readString((-25).toByte()))
                                    i_8_++
                                }
                            } else if (i == 249) {
                                val i_9_ = class348_sub49.readUnsignedByte(255)
                                if (aClass356_4006 == null) {
                                    val i_10_ = (method340(i_9_, 108.toByte()))
                                    aClass356_4006 = Class356(i_10_)
                                }
                                var i_11_ = 0
                                while (i_9_ > i_11_) {
                                    val bool = (class348_sub49.readUnsignedByte(255) == 1)
                                    val i_12_ = class348_sub49.readMedium(-1)
                                    val class348: Class348?
                                    if (!bool) class348 = (Class348_Sub35(class348_sub49.readInt((-126).toByte())))
                                    else class348 = (Class348_Sub50(class348_sub49.readString((-98).toByte())))
                                    aClass356_4006!!.method3483(123.toByte(), i_12_.toLong(), class348)
                                    i_11_++
                                }
                            }
                        } else class348_sub49.readInt((-126).toByte())
                    } else class348_sub49.readUnsignedByte(255)
                }
            } else class348_sub49.readUnsignedShort(842397944)
        } else aString4012 = class348_sub49.method3371(-13487)
    }

    fun method2551(i: Int, class348_sub49: Class348_Sub49) {
        val i_19_ = -14 / ((i - -56) / 61)
        anInt3995++
        while (true) {
            val i_20_ = class348_sub49.readUnsignedByte(255)
            if (i_20_ == 0) break
            method2550(class348_sub49, i_20_, 52.toByte())
        }
    }

    companion object {
        var anInt3995: Int = 0
        var anInt3999: Int = 0
        @JvmField
        var anInt4005: Int = -1
        var anInt4013: Int = 0
        var aClass114_4015: Class114? = Class114(116, 6)
        @JvmField
        var anInt4017: Int = 0

        @JvmStatic
        fun method2549(i: Byte) {
            if (i > -74) method2549(75.toByte())
            aClass114_4015 = null
        }
    }
}
