/* Class314_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class314_Sub1 internal constructor(i: Int, class137: Class137?, class137_23_: Class137?, class248: Class248?, class112: Class112?, i_24_: Int, `is`: ByteArray?, i_25_: Int, bool: Boolean) : Class314() {
    private var aClass291_6342: Class291? = null
    private val anInt6344: Int
    private val aByteArray6346: ByteArray?
    private val aClass248_6347: Class248?
    private val anInt6350: Int
    private var aByteArray6351: ByteArray? = null
    private var anInt6352 = 0
    private val aClass112_6354: Class112?
    private var aClass348_Sub42_Sub16_6355: Class348_Sub42_Sub16? = null
    private val aClass356_6360: Class356
    private var anInt6361 = 0
    private val aClass137_6364: Class137?
    private val aClass137_6365: Class137?
    private var aBoolean6368 = false
    private val aClass262_6369: Class262
    private var aBoolean6371 = false
    private var aClass262_6372: Class262? = null
    private var anInt6373: Int
    private var aLong6374: Long
    private var aBoolean6375 = false

    fun method2341(i: Int): Int {
        anInt6370++
        if (aClass291_6342 == null) return 0
        if (!aBoolean6368) return aClass291_6342!!.anInt3727
        if (i != 24940) method2345(-32)
        val class348 = aClass262_6372!!.method1995(i xor 0x6168)
        if (class348 == null) return 0
        return class348.aLong4291.toInt()
    }

    fun method2342(i: Int) {
        anInt6349++
        if (i != 0) aBoolean6375 = false
        if (aClass262_6372 != null && method2340(56.toByte()) != null) {
            var class348 = aClass262_6369.method1995(4)
            while (class348 != null) {
                val i_0_ = class348.aLong4291.toInt()
                if (i_0_ < 0 || (aClass291_6342!!.anInt3734 <= i_0_) || aClass291_6342!!.anIntArray3725[i_0_] == 0) class348.method2715(37.toByte())
                else {
                    if (aByteArray6351!![i_0_].toInt() == 0) method2350(i_0_, 65.toByte(), 1)
                    if (aByteArray6351!![i_0_].toInt() == -1) method2350(i_0_, 65.toByte(), 2)
                    if (aByteArray6351!![i_0_].toInt() == 1) class348.method2715(29.toByte())
                }
                class348 = aClass262_6369.method1990(112.toByte())
            }
        }
    }

    fun method2343(i: Int) {
        anInt6356++
        if (aClass262_6372 != null) {
            if (method2340(56.toByte()) == null) return
            if (aBoolean6368) {
                var bool = true
                var class348 = aClass262_6372!!.method1995(4)
                while (class348 != null) {
                    val i_1_ = class348.aLong4291.toInt()
                    if (aByteArray6351!![i_1_].toInt() == 0) method2350(i_1_, 65.toByte(), 1)
                    if (aByteArray6351!![i_1_].toInt() != 0) class348.method2715(22.toByte())
                    else bool = false
                    class348 = aClass262_6372!!.method1990(106.toByte())
                }
                while (aClass291_6342!!.anIntArray3725.size > anInt6373) {
                    if (aClass291_6342!!.anIntArray3725[anInt6373] == 0) anInt6373++
                    else {
                        if (aClass112_6354!!.anInt1734 >= 250) {
                            bool = false
                            break
                        }
                        if (aByteArray6351!![anInt6373].toInt() == 0) method2350(anInt6373, 65.toByte(), 1)
                        if (aByteArray6351!![anInt6373].toInt() == 0) {
                            val class348 = Class348()
                            class348.aLong4291 = anInt6373.toLong()
                            aClass262_6372!!.method1999(class348, -20180)
                            bool = false
                        }
                        anInt6373++
                    }
                }
                if (bool) {
                    anInt6373 = 0
                    aBoolean6368 = false
                }
            } else if (aBoolean6371) {
                var bool = true
                var class348 = aClass262_6372!!.method1995(4)
                while (class348 != null) {
                    val i_2_ = class348.aLong4291.toInt()
                    if (aByteArray6351!![i_2_].toInt() != 1) method2350(i_2_, 65.toByte(), 2)
                    if (aByteArray6351!![i_2_].toInt() != 1) bool = false
                    else class348.method2715(60.toByte())
                    class348 = aClass262_6372!!.method1990(43.toByte())
                }
                while (aClass291_6342!!.anIntArray3725.size > anInt6373) {
                    if (aClass291_6342!!.anIntArray3725[anInt6373] == 0) anInt6373++
                    else {
                        if (aClass248_6347!!.method1899(-124)) {
                            bool = false
                            break
                        }
                        if (aByteArray6351!![anInt6373].toInt() != 1) method2350(anInt6373, 65.toByte(), 2)
                        if (aByteArray6351!![anInt6373].toInt() != 1) {
                            val class348 = Class348()
                            class348.aLong4291 = anInt6373.toLong()
                            bool = false
                            aClass262_6372!!.method1999(class348, i + -20179)
                        }
                        anInt6373++
                    }
                }
                if (bool) {
                    anInt6373 = 0
                    aBoolean6371 = false
                }
            } else aClass262_6372 = null
        }
        if (i == -1) {
            if (aBoolean6375 && Class62.method599(-94) >= aLong6374) {
                var class348_sub42_sub16 = aClass356_6360.method3484(0) as Class348_Sub42_Sub16?
                while (class348_sub42_sub16 != null) {
                    if (!class348_sub42_sub16.aBoolean9664) {
                        if (class348_sub42_sub16.aBoolean9667) {
                            if (!class348_sub42_sub16.aBoolean9663) throw RuntimeException()
                            class348_sub42_sub16.method2715(116.toByte())
                        } else class348_sub42_sub16.aBoolean9667 = true
                    }
                    class348_sub42_sub16 = (aClass356_6360.method3482(0) as Class348_Sub42_Sub16?)
                }
                aLong6374 = Class62.method599(-82) - -1000L
            }
        }
    }

    fun method2345(i: Int): Int {
        anInt6357++
        if (aClass291_6342 == null) return 0
        if (i != 0) method2338((-34).toByte(), 120)
        return aClass291_6342!!.anInt3727
    }

    override fun method2339(i: Int, i_3_: Byte): ByteArray? {
        val i_4_ = -16 / ((i_3_ - -44) / 37)
        anInt6363++
        val class348_sub42_sub16 = method2350(i, 65.toByte(), 0)
        if (class348_sub42_sub16 == null) return null
        val `is` = class348_sub42_sub16.method3259(16)
        class348_sub42_sub16.method2715(33.toByte())
        return `is`
    }

    fun method2346(i: Int) {
        if (i == 27872) {
            anInt6366++
            if (aClass137_6365 != null) {
                aBoolean6371 = true
                if (aClass262_6372 == null) aClass262_6372 = Class262()
            }
        }
    }

    override fun method2338(i: Byte, i_5_: Int) {
        anInt6345++
        if (i.toInt() != -52) aClass291_6342 = null
        if (aClass137_6365 != null) {
            run {
                var class348 = aClass262_6369.method1995(i.toInt() xor 0x37.inv())
                while (class348 != null) {
                    if (i_5_.toLong() == class348.aLong4291) return
                    class348 = aClass262_6369.method1990(124.toByte())
                }
            }
            val class348 = Class348()
            class348.aLong4291 = i_5_.toLong()
            aClass262_6369.method1999(class348, -20180)
        }
    }

    fun method2349(i: Int): Int {
        if (i != 1) method2335(11, -116)
        anInt6367++
        if (method2340(56.toByte()) == null) {
            if (aClass348_Sub42_Sub16_6355 == null) return 0
            return aClass348_Sub42_Sub16_6355!!.method3257(16)
        }
        return 100
    }

    override fun method2335(i: Int, i_8_: Int): Int {
        anInt6341++
        val class348_sub42_sub16 = (aClass356_6360.method3480(i.toLong(), -6008) as Class348_Sub42_Sub16?)
        if (i_8_ != -22197) anInt6352 = 21
        if (class348_sub42_sub16 != null) return class348_sub42_sub16.method3257(16)
        return 0
    }

    private fun method2350(i: Int, i_9_: Byte, i_10_: Int): Class348_Sub42_Sub16? {
        if (i_9_.toInt() != 65) aByteArray6351 = null
        anInt6362++
        var class348_sub42_sub16 = (aClass356_6360.method3480(i.toLong(), -6008) as Class348_Sub42_Sub16?)
        if (class348_sub42_sub16 != null && i_10_ == 0 && !class348_sub42_sub16.aBoolean9663 && class348_sub42_sub16.aBoolean9664) {
            class348_sub42_sub16.method2715(66.toByte())
            class348_sub42_sub16 = null
        }
        if (class348_sub42_sub16 == null) {
            if (i_10_ == 0) {
                if (aClass137_6365 == null || aByteArray6351!![i].toInt() == -1) {
                    if (aClass248_6347!!.method1900(-9)) return null
                    class348_sub42_sub16 = aClass248_6347.method1906((-125).toByte(), 2.toByte(), true, i, anInt6350)
                } else class348_sub42_sub16 = aClass112_6354!!.method1055(aClass137_6365, i, (-110).toByte())
            } else if (i_10_ == 1) {
                if (aClass137_6365 == null) throw RuntimeException()
                class348_sub42_sub16 = aClass112_6354!!.method1054(aClass137_6365, i, (-112).toByte())
            } else {
                if (i_10_ != 2) throw RuntimeException()
                if (aClass137_6365 == null) throw RuntimeException()
                if (aByteArray6351!![i].toInt() != -1) throw RuntimeException()
                if (aClass248_6347!!.method1899(-120)) return null
                class348_sub42_sub16 = aClass248_6347.method1906(97.toByte(), 2.toByte(), false, i, anInt6350)
            }
            aClass356_6360.method3483(73.toByte(), i.toLong(), class348_sub42_sub16)
        }
        if (class348_sub42_sub16!!.aBoolean9664) return null
        val `is` = class348_sub42_sub16.method3259(16)
        if (class348_sub42_sub16 !is Class348_Sub42_Sub16_Sub2) {
            try {
                if (`is` == null || `is`.size <= 2) throw RuntimeException()
                Class287.aCRC32_3691!!.reset()
                Class287.aCRC32_3691!!.update(`is`, 0, -2 + `is`.size)
                val i_11_ = Class287.aCRC32_3691!!.getValue().toInt()
                if (aClass291_6342!!.anIntArray3729[i] != i_11_) throw RuntimeException()
                if (aClass291_6342!!.aByteArrayArray3730 != null && (aClass291_6342!!.aByteArrayArray3730!![i] != null)) {
                    val is_12_ = aClass291_6342!!.aByteArrayArray3730!![i]!!
                    val is_13_ = Class348_Sub1_Sub2.method2730(i_9_.toInt() xor 0x1196, 0, `is`, `is`.size + -2)
                    for (i_14_ in 0..63) {
                        if (is_12_[i_14_] != is_13_[i_14_]) throw RuntimeException()
                    }
                }
                aClass248_6347!!.anInt3213 = 0
                aClass248_6347.anInt3214 = 0
            } catch (runtimeexception: RuntimeException) {
                aClass248_6347!!.method1904(-1)
                class348_sub42_sub16.method2715(44.toByte())
                if (class348_sub42_sub16.aBoolean9663 && !aClass248_6347.method1900(i_9_.toInt() xor 0x1f)) {
                    val class348_sub42_sub16_sub1 = aClass248_6347.method1906(111.toByte(), 2.toByte(), true, i, anInt6350)
                    aClass356_6360.method3483(84.toByte(), i.toLong(), class348_sub42_sub16_sub1)
                }
                return null
            }
            `is`[`is`.size - 2] = (aClass291_6342!!.anIntArray3722[i] ushr 8).toByte()
            `is`[`is`.size - 1] = aClass291_6342!!.anIntArray3722[i].toByte()
            if (aClass137_6365 != null) {
                aClass112_6354!!.method1049(`is`, aClass137_6365, 10.toByte(), i)
                if (aByteArray6351!![i].toInt() != 1) {
                    anInt6361++
                    aByteArray6351!![i] = 1.toByte()
                }
            }
            if (!class348_sub42_sub16.aBoolean9663) class348_sub42_sub16.method2715(110.toByte())
            return class348_sub42_sub16
        }
        try {
            if (`is` == null || `is`.size <= 2) throw RuntimeException()
            Class287.aCRC32_3691!!.reset()
            Class287.aCRC32_3691!!.update(`is`, 0, `is`.size + -2)
            val i_15_ = Class287.aCRC32_3691!!.getValue().toInt()
            if (i_15_ != aClass291_6342!!.anIntArray3729[i]) throw RuntimeException()
            if (aClass291_6342!!.aByteArrayArray3730 != null && (aClass291_6342!!.aByteArrayArray3730!![i] != null)) {
                val is_16_ = aClass291_6342!!.aByteArrayArray3730!![i]!!
                val is_17_ = Class348_Sub1_Sub2.method2730(i_9_ + 4502, 0, `is`, `is`.size - 2)
                for (i_18_ in 0..63) {
                    if (is_17_[i_18_] != is_16_[i_18_]) throw RuntimeException()
                }
            }
            val i_19_ = ((0xff00 and (`is`[-2 + `is`.size].toInt() shl 8)) + (0xff and `is`[`is`.size + -1].toInt()))
            if ((aClass291_6342!!.anIntArray3722[i] and 0xffff) != i_19_) throw RuntimeException()
            if (aByteArray6351!![i].toInt() != 1) {
                anInt6361++
                aByteArray6351!![i] = 1.toByte()
            }
            if (!class348_sub42_sub16.aBoolean9663) class348_sub42_sub16.method2715(115.toByte())
            return class348_sub42_sub16
        } catch (exception: Exception) {
            aByteArray6351!![i] = (-1).toByte()
            class348_sub42_sub16.method2715(121.toByte())
            if (class348_sub42_sub16.aBoolean9663 && !aClass248_6347!!.method1900(-30)) {
                val class348_sub42_sub16_sub1 = aClass248_6347.method1906(99.toByte(), 2.toByte(), true, i, anInt6350)
                aClass356_6360.method3483(66.toByte(), i.toLong(), class348_sub42_sub16_sub1)
            }
            return null
        }
    }

    fun method2351(i: Int): Int {
        if (i != 0) return -19
        anInt6359++
        return anInt6361
    }

    override fun method2340(i: Byte): Class291? {
        anInt6348++
        if (aClass291_6342 != null) return aClass291_6342
        if (i.toInt() != 56) return null
        if (aClass348_Sub42_Sub16_6355 == null) {
            if (aClass248_6347!!.method1900(-14)) return null
            aClass348_Sub42_Sub16_6355 = aClass248_6347.method1906((-114).toByte(), 0.toByte(), true, anInt6350, 255)
        }
        if (aClass348_Sub42_Sub16_6355!!.aBoolean9664) return null
        val `is` = aClass348_Sub42_Sub16_6355!!.method3259(16)
        do {
            if (aClass348_Sub42_Sub16_6355 is Class348_Sub42_Sub16_Sub2) {
                try {
                    if (`is` == null) throw RuntimeException()
                    aClass291_6342 = Class291(`is`, anInt6344, aByteArray6346)
                    if (anInt6352 != aClass291_6342!!.anInt3732) throw RuntimeException()
                    break
                } catch (runtimeexception: RuntimeException) {
                    aClass291_6342 = null
                    if (aClass248_6347!!.method1900(i + 66)) aClass348_Sub42_Sub16_6355 = null
                    else aClass348_Sub42_Sub16_6355 = aClass248_6347.method1906((-95).toByte(), 0.toByte(), true, anInt6350, 255)
                    return null
                }
            }
            try {
                if (`is` == null) throw RuntimeException()
                aClass291_6342 = Class291(`is`, anInt6344, aByteArray6346)
            } catch (runtimeexception: RuntimeException) {
                aClass248_6347!!.method1904(i + -57)
                aClass291_6342 = null
                if (aClass248_6347.method1900(i.toInt() xor 0x16.inv())) aClass348_Sub42_Sub16_6355 = null
                else aClass348_Sub42_Sub16_6355 = aClass248_6347.method1906(47.toByte(), 0.toByte(), true, anInt6350, 255)
                return null
            }
            if (aClass137_6364 != null) aClass112_6354!!.method1049(`is`, aClass137_6364, 10.toByte(), anInt6350)
        } while (false)
        aClass348_Sub42_Sub16_6355 = null
        if (aClass137_6365 != null) {
            anInt6361 = 0
            aByteArray6351 = ByteArray(aClass291_6342!!.anInt3734)
        }
        return aClass291_6342
    }

    init {
        aClass356_6360 = Class356(16)
        anInt6373 = 0
        aClass262_6369 = Class262()
        aLong6374 = 0L
        do {
            try {
                anInt6350 = i
                aClass137_6365 = class137
                if (aClass137_6365 != null) {
                    aBoolean6368 = true
                    aClass262_6372 = Class262()
                } else aBoolean6368 = false
                anInt6344 = i_24_
                aByteArray6346 = `is`
                anInt6352 = i_25_
                aClass137_6364 = class137_23_
                aBoolean6375 = bool
                aClass248_6347 = class248
                aClass112_6354 = class112
                if (aClass137_6364 == null) break
                aClass348_Sub42_Sub16_6355 = aClass112_6354!!.method1055(aClass137_6364, anInt6350, (-112).toByte())
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("bja.<init>(" + i + ',' + (if (class137 != null) "{...}" else "null") + ',' + (if (class137_23_ != null) "{...}" else "null") + ',' + (if (class248 != null) "{...}" else "null") + ',' + (if (class112 != null) "{...}" else "null") + ',' + i_24_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_25_ + ',' + bool + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var aClass114_6340: Class114? = Class114(74, 28)
        @JvmField
        var anInt6341: Int = 0
        @JvmField
        var anInt6343: Int = 0
        @JvmField
        var anInt6345: Int = 0
        @JvmField
        var anInt6348: Int = 0
        @JvmField
        var anInt6349: Int = 0
        @JvmField
        var anInt6353: Int = 0
        @JvmField
        var anInt6356: Int = 0
        @JvmField
        var anInt6357: Int = 0
        @JvmField
        var anInt6358: Int = 0
        @JvmField
        var anInt6359: Int = 0
        @JvmField
        var anInt6362: Int = 0
        @JvmField
        var anInt6363: Int = 0
        @JvmField
        var anInt6366: Int = 0
        @JvmField
        var anInt6367: Int = 0
        @JvmField
        var anInt6370: Int = 0
        @JvmStatic
        fun method2344(i: Int) {
            if (i == 0) aClass114_6340 = null
        }

        @JvmStatic
        fun method2347(i: Byte): String? {
            if (i.toInt() != -119) return null
            anInt6343++
            if (Class5_Sub1.aBoolean8335 || Class316.aClass348_Sub42_Sub12_3963 == null) return ""
            if (((Class316.aClass348_Sub42_Sub12_3963!!.aString9601) == null || Class316.aClass348_Sub42_Sub12_3963!!.aString9601!!.length == 0) && (Class316.aClass348_Sub42_Sub12_3963!!.aString9595) != null && Class316.aClass348_Sub42_Sub12_3963!!.aString9595!!.length > 0) return (Class316.aClass348_Sub42_Sub12_3963!!.aString9595)
            return (Class316.aClass348_Sub42_Sub12_3963!!.aString9601)
        }

        @JvmStatic
        fun method2348(i: Int): Int {
            anInt6353++
            if (i != -8454) method2352(44, -11, 126)
            val i_6_: Int
            if (Class226.anInt2964 < 96) {
                Class348_Sub40_Sub12.method3076(0, true)
                i_6_ = 1
            } else {
                val i_7_ = Class284.method2116(-26584)
                if (i_7_ > 100) {
                    if (i_7_ <= 500) {
                        i_6_ = 3
                        Class47.method447((-59).toByte())
                    } else if (i_7_ <= 1000) {
                        i_6_ = 2
                        Class161.method1263(true)
                    } else {
                        Class348_Sub40_Sub12.method3076(0, true)
                        i_6_ = 1
                    }
                } else {
                    i_6_ = 4
                    Class133.method1140(58)
                }
            }
            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) != 0) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
                Class367_Sub10.method3553(false, 120.toByte(), 0)
            }
            Class14_Sub2.method243(37)
            return i_6_
        }

        @JvmStatic
        fun method2352(i: Int, i_20_: Int, i_21_: Int): Boolean {
            anInt6358++
            val i_22_ = -38 / ((60 - i) / 40)
            return (0x10 and i_21_) != 0
        }
    }
}
