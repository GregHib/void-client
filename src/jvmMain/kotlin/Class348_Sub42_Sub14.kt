import Class348_Sub17.Companion.method2929
import Class348_Sub5.Companion.method2755

/* Class348_Sub42_Sub14 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub14 internal constructor(i: Int, string: String?, string_20_: String?, i_21_: Int, i_22_: Int, bool: Boolean, i_23_: Int, i_24_: Int) : Class348_Sub42() {
    var aString9625: String? = null
    var anInt9627: Int = 0
    var anInt9628: Int = 0
    var aClass262_9629: Class262? = null
    var anInt9631: Int
    var aString9632: String? = null
    var anInt9634: Int = -1
    var anInt9635: Int = 0
    var aBoolean9639: Boolean = true
    var anInt9640: Int = 0
    var anInt9643: Int = 12800
    var anInt9644: Int = 12800
    fun method3236(`is`: IntArray, i: Int, i_0_: Int, i_1_: Int, i_2_: Byte): Boolean {
        anInt9623++
        var class348_sub18 = this.aClass262_9629!!.method1995(4) as? Class348_Sub18?
        while (class348_sub18 != null) {
            if (class348_sub18.method2935(i_0_, i, i_1_, true)) {
                class348_sub18.method2940(i_0_, true, `is`, i)
                return true
            }
            class348_sub18 = this.aClass262_9629!!.method1990(117.toByte()) as? Class348_Sub18?
        }
        if (i_2_.toInt() != -28) method3244(123, -16, 116)
        return false
    }

    fun method3238(i: Byte, i_3_: Int, i_4_: Int): Boolean {
        val i_5_ = 113 % ((-26 - i) / 46)
        anInt9641++
        var class348_sub18 = this.aClass262_9629!!.method1995(4) as? Class348_Sub18?
        while (class348_sub18 != null) {
            if (class348_sub18.method2934(3589, i_3_, i_4_)) return true
            class348_sub18 = this.aClass262_9629!!.method1990(117.toByte()) as? Class348_Sub18?
        }
        return false
    }

    fun method3239(bool: Boolean, i: Int, i_6_: Int, `is`: IntArray): Boolean {
        anInt9638++
        if (bool != true) method3238(9.toByte(), -26, -68)
        var class348_sub18 = this.aClass262_9629!!.method1995(4) as? Class348_Sub18?
        while (class348_sub18 != null) {
            if (class348_sub18.method2939(i_6_, 2, i)) {
                class348_sub18.method2937(i_6_, i, -3069, `is`)
                return true
            }
            class348_sub18 = this.aClass262_9629!!.method1990(126.toByte()) as? Class348_Sub18?
        }
        return false
    }

    fun method3240(i: Byte) {
        this.anInt9643 = 12800
        this.anInt9644 = 12800
        this.anInt9627 = 0
        anInt9636++
        this.anInt9635 = 0
        if (i.toInt() != 37) method3244(30, -85, -43)
        var class348_sub18 = this.aClass262_9629!!.method1995(i + -33) as? Class348_Sub18?
        while (class348_sub18 != null) {
            if (this.anInt9643 > class348_sub18.anInt6812) this.anInt9643 = class348_sub18.anInt6812
            if (class348_sub18.anInt6813 > this.anInt9627) this.anInt9627 = class348_sub18.anInt6813
            if (this.anInt9635 < class348_sub18.anInt6819) this.anInt9635 = class348_sub18.anInt6819
            if (class348_sub18.anInt6809 < this.anInt9644) this.anInt9644 = class348_sub18.anInt6809
            class348_sub18 = this.aClass262_9629!!.method1990(52.toByte()) as? Class348_Sub18?
        }
    }

    fun method3242(`is`: IntArray, i: Int, i_15_: Int, i_16_: Int): Boolean {
        anInt9624++
        var class348_sub18 = this.aClass262_9629!!.method1995(4) as? Class348_Sub18?
        while (class348_sub18 != null) {
            if (class348_sub18.method2934(3589, i_16_, i_15_)) {
                class348_sub18.method2940(i_15_, true, `is`, i_16_)
                return true
            }
            class348_sub18 = this.aClass262_9629!!.method1990(115.toByte()) as? Class348_Sub18?
        }
        return false
    }

    init {
        this.anInt9631 = -1
        try {
            this.anInt9631 = i_23_
            this.anInt9640 = i_21_
            this.aString9625 = string
            this.aString9632 = string_20_
            this.anInt9634 = i_22_
            this.anInt9628 = i
            this.aBoolean9639 = bool
            if (this.anInt9631 == 255) this.anInt9631 = 0
            this.aClass262_9629 = Class262()
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("dfa.<init>(" + i + ',' + (if (string != null) "{...}" else "null") + ',' + (if (string_20_ != null) "{...}" else "null") + ',' + i_21_ + ',' + i_22_ + ',' + bool + ',' + i_23_ + ',' + i_24_ + ')'))
        }
    }

    companion object {
        var aByteArray9622: ByteArray? = byteArrayOf(
            31,
            -117,
            8,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            -5,
            127,
            -29,
            -1,
            109,
            6,
            103,
            6,
            14,
            54,
            54,
            118,
            54,
            86,
            14,
            118,
            118,
            118,
            78,
            78,
            14,
            46,
            30,
            17,
            94,
            30,
            110,
            110,
            30,
            73,
            33,
            97,
            126,
            17,
            89,
            41,
            121,
            57,
            89,
            41,
            25,
            25,
            5,
            21,
            61,
            117,
            5,
            37,
            29,
            101,
            25,
            25,
            13,
            115,
            77,
            29,
            3,
            67,
            19,
            19,
            19,
            121,
            117,
            75,
            91,
            11,
            35,
            27,
            61,
            99,
            19,
            35,
            -112,
            33,
            -116,
            -100,
            -100,
            -100,
            60,
            -36,
            60,
            18,
            -68,
            -68,
            18,
            70,
            -118,
            50,
            -118,
            70,
            36,
            -125,
            -1,
            7,
            24,
            68,
            56,
            24,
            24,
            25,
            24,
            89,
            24,
            -107,
            24,
            -104,
            4,
            25,
            -103,
            5,
            25,
            89,
            -108,
            24,
            -2,
            31,
            97,
            -112,
            103,
            96,
            96,
            100,
            101,
            4,
            3,
            6,
            40,
            96,
            100,
            98,
            102,
            97,
            101,
            99,
            -25,
            -32,
            -28,
            -30,
            6,
            42,
            -40,
            42,
            -64,
            -64,
            -60,
            -56,
            -52,
            -52,
            -60,
            -62,
            -52,
            -54,
            -54,
            -62,
            2,
            -108,
            -83,
            5,
            -54,
            51,
            -80,
            8,
            -78,
            10,
            41,
            26,
            58,
            -78,
            9,
            7,
            38,
            -78,
            43,
            21,
            -118,
            24,
            53,
            78,
            92,
            -56,
            -95,
            -20,
            -76,
            -15,
            -96,
            104,
            -48,
            -59,
            15,
            42,
            -58,
            73,
            69,
            77,
            -100,
            92,
            98,
            -30,
            18,
            -110,
            82,
            -86,
            106,
            -22,
            26,
            -102,
            90,
            38,
            -90,
            102,
            -26,
            22,
            -106,
            86,
            -50,
            46,
            -82,
            110,
            -18,
            30,
            -98,
            94,
            -63,
            33,
            -95,
            97,
            -31,
            17,
            -111,
            81,
            -55,
            41,
            -87,
            105,
            -23,
            25,
            -103,
            89,
            -59,
            37,
            -91,
            101,
            -27,
            21,
            -107,
            85,
            -51,
            45,
            -83,
            109,
            -19,
            29,
            -99,
            93,
            -109,
            38,
            79,
            -103,
            58,
            109,
            -6,
            -116,
            -103,
            -77,
            22,
            45,
            94,
            -78,
            116,
            -39,
            -14,
            21,
            43,
            87,
            109,
            -38,
            -68,
            101,
            -21,
            -74,
            -19,
            59,
            118,
            -18,
            58,
            116,
            -8,
            -56,
            -47,
            99,
            -57,
            79,
            -100,
            60,
            117,
            -23,
            -14,
            -107,
            -85,
            -41,
            -82,
            -33,
            -72,
            121,
            -21,
            -31,
            -93,
            -57,
            79,
            -98,
            62,
            123,
            -2,
            -30,
            -27,
            -85,
            -113,
            -97,
            62,
            127,
            -7,
            -6,
            -19,
            -5,
            -113,
            -97,
            -65,
            64,
            -2,
            98,
            100,
            96,
            102,
            -124,
            1,
            -84,
            -2,
            18,
            4,
            -6,
            -117,
            -119,
            -123,
            -123,
            -103,
            -123,
            29,
            -28,
            47,
            70,
            -90,
            114,
            -112,
            2,
            65,
            22,
            86,
            69,
            67,
            54,
            33,
            -57,
            64,
            -10,
            -60,
            66,
            97,
            37,
            -93,
            70,
            14,
            17,
            -89,
            -119,
            11,
            55,
            30,
            -28,
            84,
            54,
            14,
            -6,
            32,
            -102,
            84,
            116,
            -111,
            75,
            76,
            -59,
            -28,
            -95,
            -22,
            71,
            -112,
            -41,
            -64,
            62,
            35,
            -50,
            99,
            77,
            100,
            -7,
            12,
            -18,
            49,
            -124,
            -65,
            110,
            49,
            -16,
            -79,
            48,
            2,
            -29,
            15,
            -24,
            78,
            6,
            6,
            123,
            -122,
            -97,
            -1,
            -70,
            52,
            22,
            -16,
            -49,
            127,
            -79,
            -88,
            -21,
            -1,
            77,
            0,
            38,
            27,
            -28,
            10,
            110,
            2,
            0,
            0
        )
        var anInt9623: Int = 0
        var anInt9624: Int = 0
        @JvmField
        var anIntArray9626: IntArray? = IntArray(50)
        var anInt9630: Int = 0
        var anInt9633: Int = 0
        var anInt9636: Int = 0
        var anInt9637: Int = 0
        var anInt9638: Int = 0
        var anInt9641: Int = 0
        @JvmField
        var aClass243_9642: Class243? = Class243()
        var anInt9645: Int = 1

        @JvmStatic
        fun method3237(i: Byte) {
            aClass243_9642 = null
            anIntArray9626 = null
            aByteArray9622 = null
            if (i.toInt() != 42) anInt9645 = -112
        }

        fun method3241(i: Int, i_7_: Byte, var_ha: ha) {
            anInt9637++
            if (!Class348_Sub40_Sub23.aBoolean9307 || !Class23.aBoolean351) Class348_Sub42_Sub10.Companion.anInt9577 = 0
            else {
                if (Class348_Sub40_Sub26.aBoolean9352) Class213.aLong2789 = Class50_Sub4.aClass47_5262!!.method446(1)
                Class42.anInt562 = 0
                Class348_Sub23_Sub2.anInt9039 = 0
                Class348_Sub40_Sub4.anInt9112 = 0
                val `is` = var_ha.Y()
                Class285_Sub2.anInt8498 = (`is`[3].toFloat() / 3.0f).toInt()
                Class140.anInt1962 = (`is`[2].toFloat() / 3.0f).toInt()
                var_ha.method3632(Class348_Sub40_Sub34.anIntArray9436)
                if ((Class306.anInt3872 != (Class348_Sub40_Sub34.anIntArray9436!![0].toFloat() / 3.0f).toInt()) || Class86.anInt1480 != (Class348_Sub40_Sub34.anIntArray9436!![1].toFloat() / 3.0f).toInt()) {
                    Class86.anInt1480 = (Class348_Sub40_Sub34.anIntArray9436!![1].toFloat() / 3.0f).toInt()
                    Class306.anInt3872 = (Class348_Sub40_Sub34.anIntArray9436!![0].toFloat() / 3.0f).toInt()
                    Class348_Sub49_Sub2.anInt9759 = Class86.anInt1480 shr 1
                    Class14.anIntArray5091 = IntArray(Class86.anInt1480 * Class306.anInt3872)
                    Class69.anInt1202 = Class306.anInt3872 shr 1
                }
                Class348_Sub40_Sub4.aClass101_9114 = var_ha.method3640()
                Class348_Sub42_Sub10.Companion.anInt9577 = 0
                var i_8_ = 0
                while ( /**/Class239_Sub26.anInt6115 > i_8_) {
                    Class318_Sub2.method2498(Class147.aClass338Array2034!![i_8_], var_ha, (-112).toByte(), i)
                    i_8_++
                }
                for (i_9_ in 0..<Class69.anInt1200) Class318_Sub2.method2498((Class318_Sub1_Sub3_Sub4.aClass338Array10330!![i_9_]), var_ha, (-127).toByte(), i)
                for (i_10_ in 0..<Class348_Sub44.anInt7101) Class318_Sub2.method2498(Class294.aClass338Array5060!![i_10_], var_ha, (-128).toByte(), i)
                Class225.anInt2946 = 0
                if (Class348_Sub42_Sub10.Companion.anInt9577 > 0) {
                    val i_11_ = Class14.anIntArray5091!!.size
                    val i_12_ = i_11_ + -i_11_ and 0x7
                    var i_13_ = 0
                    while (i_13_ < i_12_) {
                        Class14.anIntArray5091!![i_13_++] = 2147483647
                        Class14.anIntArray5091!![i_13_++] = 2147483647
                        Class14.anIntArray5091!![i_13_++] = 2147483647
                        Class14.anIntArray5091!![i_13_++] = 2147483647
                        Class14.anIntArray5091!![i_13_++] = 2147483647
                        Class14.anIntArray5091!![i_13_++] = 2147483647
                        Class14.anIntArray5091!![i_13_++] = 2147483647
                        Class14.anIntArray5091!![i_13_++] = 2147483647
                    }
                    while (i_11_ > i_13_) Class14.anIntArray5091!![i_13_++] = 2147483647
                    Class350.anInt4319 = 1
                    var i_14_ = 0
                    while ((i_14_ < Class348_Sub42_Sub10.Companion.anInt9577)) {
                        val class338: Class338 = Class348_Sub42_Sub19.Companion.aClass338Array9700!![i_14_]!!
                        Class348_Sub40_Sub29.method3125(class338.aShortArray4194!![3].toInt(), class338.aShortArray4183!![0].toInt(), class338.aShortArray4194!![1].toInt(), class338.aShortArray4188!![3].toInt(), class338.aShortArray4188!![1].toInt(), (-105).toByte(), class338.aShortArray4183!![1].toInt(), class338.aShortArray4188!![0].toInt(), class338.aShortArray4194!![0].toInt(), class338.aShortArray4183!![3].toInt())
                        Class348_Sub40_Sub29.method3125(class338.aShortArray4194!![3].toInt(), class338.aShortArray4183!![1].toInt(), class338.aShortArray4194!![2].toInt(), class338.aShortArray4188!![3].toInt(), class338.aShortArray4188!![2].toInt(), (-118).toByte(), class338.aShortArray4183!![2].toInt(), class338.aShortArray4188!![1].toInt(), class338.aShortArray4194!![1].toInt(), class338.aShortArray4183!![3].toInt())
                        i_14_++
                    }
                    Class350.anInt4319 = 2
                }
                if (Class348_Sub40_Sub26.aBoolean9352) Class286_Sub6.aLong6276 = (Class50_Sub4.aClass47_5262!!.method446(1) + -Class213.aLong2789)
            }
        }

        @JvmStatic
        fun method3243(i: Int, class348_sub47: Class348_Sub47) {
            anInt9630++
            Class348_Sub40_Sub13.aClass262_9201!!.method1999(class348_sub47, -20180)
            class348_sub47.anInt7119 = class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197
            class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 = 0
            Class348_Sub34.anInt6969 += class348_sub47.anInt7119
            val i_17_ = -41 / ((i - 79) / 37)
        }

        fun method3244(i: Int, i_18_: Int, i_19_: Int) {
            method2755(-1, i_18_, i)
            anInt9633++
        }
    }
}
