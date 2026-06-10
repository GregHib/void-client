/* Class348 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class348 {
    @JvmField
    var aLong4291: Long = 0
    @JvmField
    var aClass348_4294: Class348? = null
    @JvmField
    var aClass348_4295: Class348? = null
    fun method2712(i: Byte): Boolean {
        if (i.toInt() != 4) return true
        anInt4297++
        return this.aClass348_4295 != null
    }

    fun method2715(i: Byte) {
        anInt4285++
        if (this.aClass348_4295 != null) {
            this.aClass348_4295!!.aClass348_4294 = this.aClass348_4294
            this.aClass348_4294!!.aClass348_4295 = this.aClass348_4295
            if (i < 18) method2712(46.toByte())
            this.aClass348_4294 = null
            this.aClass348_4295 = null
        }
    }

    companion object {
        @JvmField
        var anInt4285: Int = 0
        @JvmField
        var aClass45_4286: Class45? = null
        @JvmField
        var anInt4287: Int = 0
        @JvmField
        var anIntArray4288: IntArray?
        @JvmField
        var anInt4289: Int = 0
        @JvmField
        var anInt4290: Int
        @JvmField
        var anInt4292: Int = 0
        @JvmField
        var aClass318_Sub1Array4293: Array<Class318_Sub1?>? = null
        @JvmField
        var anInt4296: Int = 0
        @JvmField
        var anInt4297: Int = 0
        @JvmField
        var anInt4298: Int = 0

        @JvmStatic
        fun method2709(i: Int, i_0_: Int, i_1_: Int): Boolean {
            anInt4287++
            if (i_1_ != -1) method2711(-42, 89, null, -113, true, -22, -35, 27, -109, null, 74, -94, -119, null)
            return (0x21 and i_0_) != 0
        }

        @JvmStatic
        fun method2710(i: Int, i_2_: Int): Int {
            anInt4289++
            if (i_2_ < 96) return 0
            if (i >= -113) aClass318_Sub1Array4293 = null
            if (i_2_ < 128) return 2
            return 3
        }

        @JvmStatic
        fun method2711(i: Int, i_3_: Int, class64: Class64?, i_4_: Int, bool: Boolean, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, var_ha: ha?, i_9_: Int, i_10_: Int, i_11_: Int, class17: Class17?): Class64? {
            var i_5_ = i_5_
            try {
                anInt4298++
                if (class64 == null) return null
                var i_12_ = 2055
                if (bool != false) return null
                if (class17 != null) {
                    i_12_ = i_12_ or class17.method263(-1, 103, i_5_, false)
                    i_12_ = i_12_ and 0x200.inv()
                }
                val l = ((i_10_.toLong() shl 48) + (i_7_ + ((i_9_ shl 16) + (i_11_ shl 24))).toLong() - -(i_6_.toLong() shl 32))
                var class64_13_: Class64?
                synchronized(Class342.aClass60_4254!!) {
                    class64_13_ = Class342.aClass60_4254!!.method583(l, -64) as Class64?
                }
                if (class64_13_ == null || (var_ha!!.method3667(class64_13_.ua(), i_12_) != 0)) {
                    if (class64_13_ != null) i_12_ = var_ha!!.method3679(i_12_, class64_13_.ua())
                    val i_14_: Int
                    if (i_7_ != 1) {
                        if (i_7_ == 2) i_14_ = 12
                        else if (i_7_ != 3) {
                            if (i_7_ == 4) i_14_ = 18
                            else i_14_ = 21
                        } else i_14_ = 15
                    } else i_14_ = 9
                    val i_15_ = 3
                    val `is` = intArrayOf(64, 96, 128)
                    val class124 = Class124(1 + i_14_ * i_15_, 2 * i_14_ * i_15_ + -i_14_, 0)
                    val i_16_ = class124.method1101(0, 0, 0, -44)
                    val is_17_ = Array<IntArray?>(i_15_) { IntArray(i_14_) }
                    for (i_18_ in 0..<i_15_) {
                        val i_19_ = `is`[i_18_]
                        val i_20_ = `is`[i_18_]
                        var i_21_ = 0
                        while (i_14_ > i_21_) {
                            val i_22_ = (i_21_ shl 14) / i_14_
                            val i_23_ = (Class70.anIntArray1207!![i_22_] * i_19_ shr 14)
                            val i_24_ = (Class70.anIntArray1204!![i_22_] * i_20_ shr 14)
                            is_17_[i_18_]!![i_21_] = class124.method1101(0, i_24_, i_23_, 123)
                            i_21_++
                        }
                    }
                    var i_25_ = 0
                    while (i_15_ > i_25_) {
                        val i_26_ = (i_25_ * 256 + 128) / i_15_
                        val i_27_ = -i_26_ + 256
                        val i_28_ = (i_26_ * i_11_ + i_9_ * i_27_ shr 8).toByte()
                        val i_29_ = (((0xfc0000 and ((i_10_ and 0xfc00) * i_26_ + i_27_ * (0xfc00 and i_6_))) + (((i_10_ and 0x380) * i_26_ + i_27_ * (0x380 and i_6_)) and 0x38000) + ((i_26_ * (i_10_ and 0x7f) + (0x7f and i_6_) * i_27_) and 0x7f00)) shr 8).toShort()
                        for (i_30_ in 0..<i_14_) {
                            if (i_25_ == 0) class124.method1102(i_16_, 1.toByte(), (-1).toByte(), (-1).toShort(), 45.toByte(), i_29_, is_17_[0]!![(1 + i_30_) % i_14_], i_28_, is_17_[0]!![i_30_])
                            else {
                                class124.method1102(is_17_[i_25_ - 1]!![i_30_], 1.toByte(), (-1).toByte(), (-1).toShort(), 48.toByte(), i_29_, is_17_[i_25_ + -1]!![(1 + i_30_) % i_14_], i_28_, is_17_[i_25_]!![(1 + i_30_) % i_14_])
                                class124.method1102(is_17_[-1 + i_25_]!![i_30_], 1.toByte(), (-1).toByte(), (-1).toShort(), 100.toByte(), i_29_, (is_17_[i_25_]!![(1 + i_30_) % i_14_]), i_28_, is_17_[i_25_]!![i_30_])
                            }
                        }
                        i_25_++
                    }
                    class64_13_ = var_ha!!.method3625(class124, i_12_, Class185.anInt2482, 64, 768)
                    synchronized(Class342.aClass60_4254!!) {
                        Class342.aClass60_4254!!.method582(class64_13_, l, (-103).toByte())
                    }
                }
                val i_31_ = class64.V()
                val i_32_ = class64.RA()
                val i_33_ = class64.HA()
                val i_34_ = class64.G()
                var class348_sub42_sub17: Class348_Sub42_Sub17? = null
                if (class17 != null) {
                    i_5_ = class17.anIntArray237[i_5_]
                    class348_sub42_sub17 = Class10.aClass87_191!!.method839(i_5_ shr 16, 3)
                    i_5_ = i_5_ and 0xffff
                }
                if (class348_sub42_sub17 == null) {
                    class64_13_ = class64_13_.method614(3.toByte(), i_12_, true)
                    class64_13_!!.O(-i_31_ + i_32_ shr 1, 128, -i_33_ + i_34_ shr 1)
                    class64_13_.H(i_32_ + i_31_ shr 1, 0, i_34_ + i_33_ shr 1)
                } else {
                    class64_13_ = class64_13_.method614(3.toByte(), i_12_, true)
                    class64_13_!!.O(-i_31_ + i_32_ shr 1, 128, i_34_ - i_33_ shr 1)
                    class64_13_.H(i_32_ + i_31_ shr 1, 0, i_34_ + i_33_ shr 1)
                    class64_13_.method611(i_5_, -8700, class348_sub42_sub17)
                }
                if (i != 0) class64_13_.FA(i)
                if (i_4_ != 0) class64_13_.VA(i_4_)
                if (i_8_ != 0) class64_13_.H(0, i_8_, 0)
                return class64_13_
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("eh.PC(" + i + ',' + i_3_ + ',' + (if (class64 != null) "{...}" else "null") + ',' + i_4_ + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + (if (class17 != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method2713(i: Int) {
            aClass45_4286 = null
            aClass318_Sub1Array4293 = null
            if (i != 0) method2711(-47, 87, null, 85, false, -126, -116, -51, -44, null, 75, -69, 87, null)
            anIntArray4288 = null
        }

        fun method2714(i: Int, i_35_: Int): Boolean {
            if (i != 7351) method2709(-15, 59, 58)
            anInt4296++
            return i_35_ == 1 || i_35_ == 3 || i_35_ == 5
        }

        init {
            anIntArray4288 = IntArray(6)
            anInt4290 = 0
        }
    }
}
