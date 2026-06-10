/* Class232 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class232 internal constructor(var_ha_Sub2: ha_Sub2?, class104: Class104?, var_s_Sub2: s_Sub2?, i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int) {
    private var aClass258_Sub3_2998: Class258_Sub3? = null
    private val aClass104_2999: Class104?
    private val aHa_Sub2_3000: ha_Sub2?
    private var anInterface8_3001: Interface8? = null
    private val anInt3002: Int
    private val anInt3003: Int
    private val anInt3008: Int
    var aBoolean3009: Boolean = true
    private var anInt3010 = -1
    private var aClass119_Sub2_3011: Class119_Sub2? = null
    fun method1643(`is`: ByteArray?, i: Int, i_0_: Int, i_1_: Byte) {
        aClass119_Sub2_3011!!.method35(`is`, i, 110, aHa_Sub2_3000!!.method3785(i, 4) * i_0_)
        anInt3005++
        method1646(aClass119_Sub2_3011, 113, i_0_)
        if (i_1_ < 8) method1648(82.toByte())
    }

    fun method1644(i: Byte) {
        if (i > -83) anInt3006 = -60
        anInt3013++
        method1646(anInterface8_3001, 115, anInt3008)
    }

    private fun method1646(interface8: Interface8?, i: Int, i_2_: Int) {
        anInt3007++
        if (i_2_ != 0) {
            method1648(121.toByte())
            if (i <= 107) method1647(-124, -86)
            aHa_Sub2_3000!!.method3771((-93).toByte(), aClass258_Sub3_2998)
            aHa_Sub2_3000.method3759(i_2_, -128, 4, interface8, 0)
        }
    }

    init {
        try {
            aHa_Sub2_3000 = var_ha_Sub2
            aClass104_2999 = class104
            anInt3003 = i_6_
            anInt3002 = i_7_
            val i_8_ = 1 shl i_5_
            var i_9_ = 0
            val i_10_ = i shl i_5_
            val i_11_ = i_4_ shl i_5_
            var i_12_ = 0
            while (i_8_ > i_12_) {
                var i_13_ = var_s_Sub2!!.anInt4587 * (i_11_ - -i_12_) - -i_10_
                for (i_14_ in 0..<i_8_) {
                    val `is` = var_s_Sub2.aShortArrayArray8267[i_13_++]
                    if (`is` != null) i_9_ += `is`.size
                }
                i_12_++
            }
            anInt3008 = i_9_
            if (i_9_ <= 0) aClass258_Sub3_2998 = null
            else {
                val class348_sub49 = Class348_Sub49(i_9_ * 2)
                if (aHa_Sub2_3000!!.aBoolean7775) {
                    var i_19_ = 0
                    while (i_8_ > i_19_) {
                        var i_20_ = (i_10_ + (i_19_ + i_11_) * var_s_Sub2!!.anInt4587)
                        var i_21_ = 0
                        while (i_8_ > i_21_) {
                            val `is` = (var_s_Sub2.aShortArrayArray8267[i_20_++])
                            if (`is` != null) {
                                var i_22_ = 0
                                while ((i_22_ < `is`.size)) {
                                    class348_sub49.writeShort(107.toByte(), (`is`[i_22_].toInt() and 0xffff))
                                    i_22_++
                                }
                            }
                            i_21_++
                        }
                        i_19_++
                    }
                } else {
                    var i_15_ = 0
                    while (i_8_ > i_15_) {
                        var i_16_ = ((i_11_ - -i_15_) * var_s_Sub2!!.anInt4587 - -i_10_)
                        var i_17_ = 0
                        while (i_8_ > i_17_) {
                            val `is` = (var_s_Sub2.aShortArrayArray8267[i_16_++])
                            if (`is` != null) {
                                var i_18_ = 0
                                while (`is`.size > i_18_) {
                                    class348_sub49.method3397(87, `is`[i_18_].toInt() and 0xffff)
                                    i_18_++
                                }
                            }
                            i_17_++
                        }
                        i_15_++
                    }
                }
                anInterface8_3001 = (aHa_Sub2_3000.method3733(5123, -39, class348_sub49.anInt7197, class348_sub49.aByteArray7154, false))
                aClass119_Sub2_3011 = Class119_Sub2(aHa_Sub2_3000, 5123, null, 1)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sm.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (class104 != null) "{...}" else "null") + ',' + (if (var_s_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'))
        }
    }

    private fun method1648(i: Byte) {
        anInt3004++
        if (this.aBoolean3009) {
            this.aBoolean3009 = false
            val `is` = aClass104_2999!!.aByteArray1617
            val is_23_ = aHa_Sub2_3000!!.aByteArray7879
            if (i > 115) {
                var i_24_ = 0
                val i_25_ = aClass104_2999.anInt1624
                var i_26_ = (anInt3003 - -(anInt3002 * aClass104_2999.anInt1624))
                for (i_27_ in -128..-1) {
                    i_24_ = (i_24_ shl 8) + -i_24_
                    for (i_28_ in -128..-1) {
                        if (`is`[i_26_++].toInt() != 0) i_24_++
                    }
                    i_26_ += i_25_ - 128
                }
                if (aClass258_Sub3_2998 != null && i_24_ == anInt3010) this.aBoolean3009 = false
                else {
                    anInt3010 = i_24_
                    i_26_ = anInt3003 - -(i_25_ * anInt3002)
                    var i_29_ = 0
                    for (i_30_ in -128..-1) {
                        for (i_31_ in -128..-1) {
                            if (`is`[i_26_].toInt() == 0) {
                                var i_32_ = 0
                                if (`is`[i_26_ - 1].toInt() != 0) i_32_++
                                if (`is`[1 + i_26_].toInt() != 0) i_32_++
                                if (`is`[-i_25_ + i_26_].toInt() != 0) i_32_++
                                if (`is`[i_25_ + i_26_].toInt() != 0) i_32_++
                                is_23_!![i_29_++] = (i_32_ * 17).toByte()
                            } else is_23_!![i_29_++] = 68.toByte()
                            i_26_++
                        }
                        i_26_ += aClass104_2999.anInt1624 - 128
                    }
                    if (aClass258_Sub3_2998 == null) {
                        aClass258_Sub3_2998 = Class258_Sub3(aHa_Sub2_3000, 3553, 6406, 128, 128, false, (aHa_Sub2_3000.aByteArray7879), 6406, false)
                        aClass258_Sub3_2998!!.method1965(false, false, 10243)
                        aClass258_Sub3_2998!!.method1957(9728, true)
                    } else aClass258_Sub3_2998!!.method1970(0, 0, 128, false, 0, 128, 6406, -69, aHa_Sub2_3000.aByteArray7879, 0)
                }
            }
        }
    }

    companion object {
        var anInt3004: Int = 0
        var anInt3005: Int = 0
        @JvmField
        var anInt3006: Int = 0
        var anInt3007: Int = 0
        var anInt3012: Int = 0
        var anInt3013: Int = 0
        var anIntArray3014: IntArray? = IntArray(1)

        @JvmStatic
        fun method1645(i: Int) {
            if (i >= 35) anIntArray3014 = null
        }

        fun method1647(i: Int, i_3_: Int) {
            if (i != -128) anIntArray3014 = null
            anInt3012++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_3_, 105.toByte(), 1)
            class348_sub42_sub15.method3251(-16058)
        }
    }
}
