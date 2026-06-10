import Class17.Companion.method268

/* Class268 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class268 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    var anInt3429: Int = 0
    private val aClass60_3433 = Class60(64)
    private val aClass45_3442: Class45?
    @JvmField
    var anInt3447: Int = 0
    fun method2032(i: Int, i_3_: Int) {
        synchronized(aClass60_3433) {
            aClass60_3433.method578(2, i)
            if (i_3_ > -10) method2035(116, 38)
        }
        anInt3436++
    }

    fun method2033(i: Byte) {
        anInt3434++
        synchronized(aClass60_3433) {
            if (i.toInt() != 46) method2037(-66)
            aClass60_3433.method587(-94)
        }
    }

    fun method2034(i: Int, bool: Boolean): Class277 {
        if (bool != false) aShortArray3437 = null
        anInt3431++
        var class277: Class277?
        synchronized(aClass60_3433) {
            class277 = aClass60_3433.method583(i.toLong(), 64) as Class277?
        }
        if (class277 != null) return class277
        val `is`: ByteArray?
        synchronized(aClass45_3442!!) {
            `is` = aClass45_3442.method410(-1860, 4, i)
        }
        class277 = Class277()
        class277.anInt3573 = i
        class277.aClass268_3562 = this
        if (`is` != null) class277.method2070(true, Class348_Sub49(`is`))
        class277.method2067(-4860)
        synchronized(aClass60_3433) {
            aClass60_3433.method582(class277, i.toLong(), (-111).toByte())
        }
        return class277
    }

    fun method2037(i: Int) {
        synchronized(aClass60_3433) {
            aClass60_3433.method590(0)
        }
        anInt3440++
    }

    init {
        try {
            aClass45_3442 = class45
            this.anInt3429 = aClass45_3442!!.method407(0, 4)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("cb.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        private var aShortArray3430: ShortArray? = shortArrayOf(-1, -1, -1, -1, -1)
        var anInt3431: Int = 0
        @JvmField
        var anIntArray3432: IntArray? = IntArray(500)
        var anInt3434: Int = 0
        var anInt3435: Int
        var anInt3436: Int = 0
        private var aShortArray3437: ShortArray?
        @JvmField
        var aBooleanArray3438: BooleanArray?
        @JvmField
        var anInt3439: Int = 16777215
        var anInt3440: Int = 0
        @JvmField
        var anInt3441: Int = 0
        @JvmField
        var aShortArrayArray3443: Array<ShortArray?>?
        @JvmField
        var anInt3444: Int
        var anInt3445: Int = 0
        var anInt3446: Int = 0
        var anInt3448: Int = 0
        private var aShortArray3449: ShortArray?

        fun method2031(i: Int, string: String): Long {
            anInt3448++
            var l = 0L
            val i_0_ = string.length
            for (i_1_ in 0..<i_0_) {
                l *= 37L
                val i_2_ = string.get(i_1_).code
                if (i_2_ < 65 || i_2_ > 90) {
                    if (i_2_ >= 97 && i_2_ <= 122) l += (1 - (-i_2_ + 97)).toLong()
                    else if (i_2_ >= 48 && i_2_ <= 57) l += (i_2_ + 27 - 48).toLong()
                } else l += (1 + (i_2_ + -65)).toLong()
                if (l >= 177917621779460413L) break
            }
            if (i != -1994) aShortArrayArray3443 = null
            while ( /**/(l % 37L == 0L && l != 0L)) {
                l /= 37L
            }
            return l
        }

        fun method2035(i: Int, i_4_: Int) {
            anInt3445++
            val i_5_ = Class367_Sub11.anInt7396 - Class348_Sub49_Sub1.anInt9751
            if (i_5_ >= 100) {
                Class348_Sub40_Sub21.anInt9282 = 1
                Class318_Sub1_Sub5_Sub2.anInt10163 = -1
                Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163
            } else {
                var i_6_ = Class76.aFloat1287.toInt()
                if (i_6_ < Class348_Sub35.anInt6979 shr 8) i_6_ = Class348_Sub35.anInt6979 shr 8
                if (Class181.aBooleanArray2374!![4] && Class255.anIntArray3273!![4] - -128 > i_6_) i_6_ = Class255.anIntArray3273!![4] + 128
                val i_7_ = 0x3fff and Class314.aFloat3938.toInt() + Class195.anInt5016
                method268(i_6_, -200 + (Class275.method2064((Class132.aPlayer_1907!!.x), Class355.anInt4372, 11219, (Class132.aPlayer_1907!!.y))), i_7_, Class192.anInt2578, i, -19360, Class130_Sub1.anInt5799, 3 * (i_6_ shr 3) + 600 shl 2)
                val f = (-(((100 + -i_5_) * (100 - i_5_) * (-i_5_ + 100)).toFloat() / 1000000.0f) + 1.0f)
                Class286_Sub4.anInt6246 = (Class318_Sub1_Sub3_Sub2.anInt10047.toFloat() + f * (-Class318_Sub1_Sub3_Sub2.anInt10047 + Class286_Sub4.anInt6246).toFloat()).toInt()
                Class305.anInt3855 = ((-Class5_Sub3.anInt8368 + Class305.anInt3855).toFloat() * f + Class5_Sub3.anInt8368.toFloat()).toInt()
                Class348_Sub42_Sub19.anInt9701 = (Class283.anInt3662.toFloat() + (Class348_Sub42_Sub19.anInt9701 - Class283.anInt3662).toFloat() * f).toInt()
                Class59_Sub2_Sub2.anInt8685 = (Class359.anInt4424.toFloat() + f * (-Class359.anInt4424 + Class59_Sub2_Sub2.anInt8685).toFloat()).toInt()
                var i_8_ = Class5.anInt4638 - Class253.anInt3253
                if (i_8_ <= 8192) {
                    if (i_8_ < -8192) i_8_ += 16384
                } else i_8_ -= 16384
                Class5.anInt4638 = (i_8_.toFloat() * f + Class253.anInt3253.toFloat()).toInt()
                Class5.anInt4638 = Class5.anInt4638 and 0x3fff
            }
        }

        @JvmStatic
        fun method2036(i: Byte) {
            aShortArrayArray3443 = null
            aShortArray3437 = null
            if (i.toInt() != 121) method2035(57, 35)
            aShortArray3449 = null
            aShortArray3430 = null
            anIntArray3432 = null
            aBooleanArray3438 = null
        }

        fun method2038(i: Int) {
            if (i <= -47) {
                for (i_9_ in 0..<Class147.anInt2021) {
                    val class10 = Class258_Sub2.aClass10Array8531!![i_9_]
                    if (class10!!.aByte180.toInt() == 3) {
                        if (class10.aClass348_Sub16_Sub5_176 == null) class10.anInt188 = -2147483648
                        else Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class10.aClass348_Sub16_Sub5_176!!)
                    }
                }
                anInt3446++
            }
        }

        init {
            aShortArray3437 = shortArrayOf(-1, -1, -1, -1, -1)
            anInt3444 = 13156520
            anInt3435 = -1
            aBooleanArray3438 = BooleanArray(100)
            aShortArray3449 = shortArrayOf(6798, 8741, 25238, 4626, 4550)
            aShortArrayArray3443 = arrayOf<ShortArray?>(aShortArray3449, aShortArray3437, aShortArray3430)
        }
    }
}
