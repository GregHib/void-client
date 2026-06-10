import Class62.method599
import java.io.IOException
import kotlin.concurrent.Volatile

class Class248 {
    private val aClass107_3197 = Class107()
    private val aClass107_3204 = Class107()
    private val aClass107_3205 = Class107()
    private val aClass107_3206 = Class107()
    private var aLong3207: Long = 0
    private val aClass348_Sub49_3208 = Class348_Sub49(4)
    private var aClass202_3209: Class202? = null
    private var anInt3210 = 0
    private val aClass348_Sub49_3211: Class348_Sub49
    private var aByte3212: Byte = 0

    @JvmField
    @Volatile
    var anInt3213: Int = 0

    @JvmField
    @Volatile
    var anInt3214: Int = 0
    private var aClass348_Sub42_Sub16_Sub1_3215: Class348_Sub42_Sub16_Sub1? = null

    fun method1892(i: Int, bool: Boolean) {
        anInt3194++
        if (aClass202_3209 != null) {
            try {
                aClass348_Sub49_3208.anInt7197 = 0
                aClass348_Sub49_3208.writeByte(false, if (bool) 2 else 3)
                aClass348_Sub49_3208.method3340(-9912, 0)
                if (i < -66) aClass202_3209!!.method1470((aClass348_Sub49_3208.aByteArray7154!!), 4, 0, -1)
            } catch (ioexception: IOException) {
                try {
                    aClass202_3209!!.method1476((-121).toByte())
                } catch (exception: Exception) {
                    /* empty */
                }
                this.anInt3213++
                aClass202_3209 = null
                this.anInt3214 = -2
            }
        }
    }

    fun method1893(i: Byte): Boolean {
        if (aClass202_3209 != null) {
            val l = method599(-106)
            var i_0_ = (-aLong3207 + l).toInt()
            if (i_0_ > 200) i_0_ = 200
            aLong3207 = l
            anInt3210 += i_0_
            if (anInt3210 > 30000) {
                try {
                    aClass202_3209!!.method1476((-121).toByte())
                } catch (exception: Exception) {
                    /* empty */
                }
                aClass202_3209 = null
            }
        }
        anInt3190++
        if (aClass202_3209 == null) {
            return method1902(4) == 0 && method1894(4350) == 0
        }
        try {
            aClass202_3209!!.method1472(true)
            run {
                var class348_sub42_sub16_sub1 = (aClass107_3197.method1011(-30) as Class348_Sub42_Sub16_Sub1?)
                while (class348_sub42_sub16_sub1 != null) {
                    aClass348_Sub49_3208.anInt7197 = 0
                    aClass348_Sub49_3208.writeByte(false, 1)
                    aClass348_Sub49_3208.method3340(-9912, (class348_sub42_sub16_sub1.aLong7057).toInt())
                    aClass202_3209!!.method1470((aClass348_Sub49_3208.aByteArray7154!!), 4, 0, -1)
                    aClass107_3204.method1005(true, class348_sub42_sub16_sub1)
                    class348_sub42_sub16_sub1 = (aClass107_3197.method1003(65.toByte()) as Class348_Sub42_Sub16_Sub1?)
                }
            }
            var class348_sub42_sub16_sub1 = aClass107_3205.method1011(-75) as Class348_Sub42_Sub16_Sub1?
            if (i <= 72) return false
            while ( /**/class348_sub42_sub16_sub1 != null) {
                aClass348_Sub49_3208.anInt7197 = 0
                aClass348_Sub49_3208.writeByte(false, 0)
                aClass348_Sub49_3208.method3340(-9912, (class348_sub42_sub16_sub1.aLong7057).toInt())
                aClass202_3209!!.method1470((aClass348_Sub49_3208.aByteArray7154!!), 4, 0, -1)
                aClass107_3206.method1005(true, class348_sub42_sub16_sub1)
                class348_sub42_sub16_sub1 = (aClass107_3205.method1003(102.toByte()) as Class348_Sub42_Sub16_Sub1?)
            }
            for (i_1_ in 0..99) {
                val i_2_ = aClass202_3209!!.method1467(83.toByte())
                if (i_2_ < 0) throw IOException()
                if (i_2_ == 0) break
                anInt3210 = 0
                var i_3_ = 0
                if (aClass348_Sub42_Sub16_Sub1_3215 == null) i_3_ = 8
                else if (aClass348_Sub42_Sub16_Sub1_3215!!.anInt10456 == 0) i_3_ = 1
                if (i_3_ <= 0) {
                    val i_4_ = (aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.aByteArray7154!!.size + -aClass348_Sub42_Sub16_Sub1_3215!!.aByte10449)
                    var i_5_ = (-aClass348_Sub42_Sub16_Sub1_3215!!.anInt10456 + 512)
                    if (i_5_ > -(aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.anInt7197) + i_4_) i_5_ = i_4_ - aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.anInt7197
                    if (i_2_ < i_5_) i_5_ = i_2_
                    aClass202_3209!!.method1474((aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.aByteArray7154!!), aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.anInt7197, (-72).toByte(), i_5_)
                    if (aByte3212.toInt() != 0) {
                        var i_6_ = 0
                        while (i_5_ > i_6_) {
                            aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.aByteArray7154!![i_6_ + aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.anInt7197] = (Class348_Sub21.method2955((aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.aByteArray7154!![(i_6_ + (aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.anInt7197))]).toInt(), aByte3212.toInt())).toByte()
                            i_6_++
                        }
                    }
                    aClass348_Sub42_Sub16_Sub1_3215!!.anInt10456 += i_5_
                    aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.anInt7197 += i_5_
                    if (i_4_ == aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.anInt7197) {
                        aClass348_Sub42_Sub16_Sub1_3215!!.method3162(true)
                        aClass348_Sub42_Sub16_Sub1_3215!!.aBoolean9664 = false
                        aClass348_Sub42_Sub16_Sub1_3215 = null
                    } else if (aClass348_Sub42_Sub16_Sub1_3215!!.anInt10456 == 512) aClass348_Sub42_Sub16_Sub1_3215!!.anInt10456 = 0
                } else {
                    var i_7_ = i_3_ + -(aClass348_Sub49_3211.anInt7197)
                    if (i_2_ < i_7_) i_7_ = i_2_
                    aClass202_3209!!.method1474((aClass348_Sub49_3211.aByteArray7154!!), aClass348_Sub49_3211.anInt7197, (-72).toByte(), i_7_)
                    if (aByte3212.toInt() != 0) {
                        for (i_8_ in 0..<i_7_) aClass348_Sub49_3211.aByteArray7154!![i_8_ + aClass348_Sub49_3211.anInt7197] = (Class348_Sub21.method2955((aClass348_Sub49_3211.aByteArray7154!![i_8_ + (aClass348_Sub49_3211.anInt7197)]).toInt(), aByte3212.toInt())).toByte()
                    }
                    aClass348_Sub49_3211.anInt7197 += i_7_
                    if (aClass348_Sub49_3211.anInt7197 >= i_3_) {
                        if (aClass348_Sub42_Sub16_Sub1_3215 == null) {
                            aClass348_Sub49_3211.anInt7197 = 0
                            val i_9_ = aClass348_Sub49_3211.readUnsignedByte(255)
                            val i_10_ = aClass348_Sub49_3211.readUnsignedShort(842397944)
                            val i_11_ = aClass348_Sub49_3211.readUnsignedByte(255)
                            val i_12_ = aClass348_Sub49_3211.readInt((-126).toByte())
                            val i_13_ = 0x7f and i_11_
                            val bool = (0x80 and i_11_) != 0
                            val l = ((i_9_ shl 16) + i_10_).toLong()
                            val `object`: Any? = null
                            var class348_sub42_sub16_sub1_14_: Class348_Sub42_Sub16_Sub1?
                            if (bool) {
                                class348_sub42_sub16_sub1_14_ = (aClass107_3206.method1011(-89) as Class348_Sub42_Sub16_Sub1?)
                                while (class348_sub42_sub16_sub1_14_ != null) {
                                    if (l == (class348_sub42_sub16_sub1_14_.aLong7057)) break
                                    class348_sub42_sub16_sub1_14_ = (aClass107_3206.method1003(98.toByte()) as Class348_Sub42_Sub16_Sub1?)
                                }
                            } else {
                                class348_sub42_sub16_sub1_14_ = (aClass107_3204.method1011(-108) as Class348_Sub42_Sub16_Sub1?)
                                while (class348_sub42_sub16_sub1_14_ != null) {
                                    if (l == (class348_sub42_sub16_sub1_14_.aLong7057)) break
                                    class348_sub42_sub16_sub1_14_ = (aClass107_3204.method1003(90.toByte()) as Class348_Sub42_Sub16_Sub1?)
                                }
                            }
                            if (class348_sub42_sub16_sub1_14_ == null) throw IOException()
                            val i_15_ = if (i_13_ == 0) 5 else 9
                            aClass348_Sub42_Sub16_Sub1_3215 = class348_sub42_sub16_sub1_14_
                            aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453 = (Class348_Sub49((aClass348_Sub42_Sub16_Sub1_3215!!.aByte10449) + i_15_ + i_12_))
                            aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.writeByte(false, i_13_)
                            aClass348_Sub42_Sub16_Sub1_3215!!.aClass348_Sub49_10453!!.writeInt(97.toByte(), i_12_)
                            aClass348_Sub49_3211.anInt7197 = 0
                            aClass348_Sub42_Sub16_Sub1_3215!!.anInt10456 = 8
                        } else if ((aClass348_Sub42_Sub16_Sub1_3215!!.anInt10456) == 0) {
                            if ((aClass348_Sub49_3211.aByteArray7154!![0]).toInt() == -1) {
                                aClass348_Sub42_Sub16_Sub1_3215!!.anInt10456 = 1
                                aClass348_Sub49_3211.anInt7197 = 0
                            } else aClass348_Sub42_Sub16_Sub1_3215 = null
                        } else throw IOException()
                    }
                }
            }
            return true
        } catch (ioexception: IOException) {
            try {
                aClass202_3209!!.method1476((-122).toByte())
            } catch (exception: Exception) {
                /* empty */
            }
            this.anInt3214 = -2
            this.anInt3213++
            aClass202_3209 = null
            return method1902(4) == 0 && method1894(4350) == 0
        }
    }

    private fun method1894(i: Int): Int {
        anInt3199++
        if (i != 4350) return 29
        return aClass107_3205.method1002(0) - -aClass107_3206.method1002(0)
    }

    private fun method1896(i: Int) {
        if (i <= -58) {
            anInt3191++
            if (aClass202_3209 != null) {
                try {
                    aClass348_Sub49_3208.anInt7197 = 0
                    aClass348_Sub49_3208.writeByte(false, 6)
                    aClass348_Sub49_3208.method3340(-9912, 3)
                    aClass202_3209!!.method1470((aClass348_Sub49_3208.aByteArray7154!!), 4, 0, -1)
                } catch (ioexception: IOException) {
                    try {
                        aClass202_3209!!.method1476((-123).toByte())
                    } catch (exception: Exception) {
                        /* empty */
                    }
                    this.anInt3214 = -2
                    aClass202_3209 = null
                    this.anInt3213++
                }
            }
        }
    }

    fun method1898(bool: Boolean) {
        if (aClass202_3209 != null) aClass202_3209!!.method1468(72)
        if (bool != true) method1904(99)
        anInt3185++
    }

    fun method1899(i: Int): Boolean {
        if (i > -91) this.anInt3214 = -39
        anInt3186++
        return method1894(4350) >= 20
    }

    fun method1900(i: Int): Boolean {
        val i_27_ = -51 % ((41 - i) / 47)
        anInt3195++
        return method1902(4) >= 20
    }

    fun method1901(i: Int) {
        if (i > -27) method1901(21)
        if (aClass202_3209 != null) aClass202_3209!!.method1476((-122).toByte())
        anInt3200++
    }

    fun method1902(i: Int): Int {
        anInt3192++
        if (i != 4) this.anInt3213 = 18
        return aClass107_3197.method1002(0) + aClass107_3204.method1002(0)
    }

    fun method1903(bool: Boolean, bool_28_: Boolean, class202: Class202?) {
        if (aClass202_3209 != null) {
            try {
                aClass202_3209!!.method1476((-124).toByte())
            } catch (exception: Exception) {
                /* empty */
            }
            aClass202_3209 = null
        }
        anInt3193++
        aClass202_3209 = class202
        method1896(-92)
        method1892(-92, bool_28_)
        aClass348_Sub49_3211.anInt7197 = 0
        aClass348_Sub42_Sub16_Sub1_3215 = null
        if (bool != false) aLong3207 = -35L
        while (true) {
            val class348_sub42_sub16_sub1 = aClass107_3204.method1008(20) as? Class348_Sub42_Sub16_Sub1?
            if (class348_sub42_sub16_sub1 == null) break
            aClass107_3197.method1005(true, class348_sub42_sub16_sub1)
        }
        while (true) {
            val class348_sub42_sub16_sub1 = aClass107_3206.method1008(20) as? Class348_Sub42_Sub16_Sub1?
            if (class348_sub42_sub16_sub1 == null) break
            aClass107_3205.method1005(!bool, class348_sub42_sub16_sub1)
        }
        if (aByte3212.toInt() != 0) {
            try {
                aClass348_Sub49_3208.anInt7197 = 0
                aClass348_Sub49_3208.writeByte(bool, 4)
                aClass348_Sub49_3208.writeByte(bool, aByte3212.toInt())
                aClass348_Sub49_3208.writeShort(107.toByte(), 0)
                aClass202_3209!!.method1470((aClass348_Sub49_3208.aByteArray7154!!), 4, 0, -1)
            } catch (ioexception: IOException) {
                try {
                    aClass202_3209!!.method1476((-126).toByte())
                } catch (exception: Exception) {
                    /* empty */
                }
                this.anInt3214 = -2
                this.anInt3213++
                aClass202_3209 = null
            }
        }
        anInt3210 = 0
        aLong3207 = method599(-105)
    }

    fun method1904(i: Int) {
        try {
            aClass202_3209!!.method1476((-123).toByte())
        } catch (exception: Exception) {
            /* empty */
        }
        anInt3189++
        aClass202_3209 = null
        this.anInt3213++
        aByte3212 = (Math.random() * 255.0 + 1.0).toInt().toByte()
        this.anInt3214 = i
    }

    fun method1905(i: Int) {
        anInt3188++
        if (aClass202_3209 != null) {
            try {
                aClass348_Sub49_3208.anInt7197 = i
                aClass348_Sub49_3208.writeByte(false, 7)
                aClass348_Sub49_3208.method3340(-9912, 0)
                aClass202_3209!!.method1470((aClass348_Sub49_3208.aByteArray7154!!), 4, 0, i.inv())
            } catch (ioexception: IOException) {
                try {
                    aClass202_3209!!.method1476((-125).toByte())
                } catch (exception: Exception) {
                    /* empty */
                }
                this.anInt3214 = -2
                this.anInt3213++
                aClass202_3209 = null
            }
        }
    }

    fun method1906(i: Byte, i_29_: Byte, bool: Boolean, i_30_: Int, i_31_: Int): Class348_Sub42_Sub16_Sub1 {
        anInt3187++
        val i_32_ = -118 % ((i - -15) / 61)
        val l = ((i_31_ shl 16) - -i_30_).toLong()
        val class348_sub42_sub16_sub1 = Class348_Sub42_Sub16_Sub1()
        class348_sub42_sub16_sub1.aBoolean9663 = bool
        class348_sub42_sub16_sub1.aLong7057 = l
        class348_sub42_sub16_sub1.aByte10449 = i_29_
        if (bool) {
            if (method1902(4) >= 20) throw RuntimeException()
            aClass107_3197.method1005(true, class348_sub42_sub16_sub1)
        } else {
            if (method1894(4350) >= 20) throw RuntimeException()
            aClass107_3205.method1005(true, class348_sub42_sub16_sub1)
        }
        return class348_sub42_sub16_sub1
    }

    init {
        aClass348_Sub49_3211 = Class348_Sub49(8)
    }

    companion object {
        var anInt3185: Int = 0
        var anInt3186: Int = 0
        var anInt3187: Int = 0
        var anInt3188: Int = 0
        var anInt3189: Int = 0
        var anInt3190: Int = 0
        var anInt3191: Int = 0
        var anInt3192: Int = 0
        var anInt3193: Int = 0
        var anInt3194: Int = 0
        var anInt3195: Int = 0
        @JvmField
        var aClass229_3196: Class229? = Class229()
        var anInt3198: Int = 0
        var anInt3199: Int = 0
        var anInt3200: Int = 0
        var anInt3201: Int = 0
        var anInt3202: Int = 0
        @JvmField
        var anInt3203: Int = -1
        fun method1895(i: Int, `is`: ByteArray?, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, is_20_: ByteArray?, i_21_: Int, i_22_: Byte) {
            var i = i
            var i_17_ = i_17_
            var i_21_ = i_21_
            try {
                anInt3198++
                val i_23_ = -(i_21_ shr 2)
                i_21_ = -(0x3 and i_21_)
                if (i_22_.toInt() != 121) aClass229_3196 = null
                for (i_24_ in -i_16_..-1) {
                    for (i_25_ in i_23_..-1) {
                        `is`!![i_17_] = (`is`[i_17_++] + -is_20_!![i++]).toByte()
                        `is`[i_17_] = (`is`[i_17_++] + -is_20_[i++]).toByte()
                        `is`[i_17_] = (`is`[i_17_++] + -is_20_[i++]).toByte()
                        `is`[i_17_] = (`is`[i_17_++] + -is_20_[i++]).toByte()
                    }
                    for (i_26_ in i_21_..-1) `is`!![i_17_] = (`is`[i_17_++] + -is_20_!![i++]).toByte()
                    i_17_ += i_18_
                    i += i_19_
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("tha.M(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + (if (is_20_ != null) "{...}" else "null") + ',' + i_21_ + ',' + i_22_ + ')'))
            }
        }

        @JvmStatic
        fun method1897(i: Byte) {
            if (i.toInt() == 119) aClass229_3196 = null
        }
    }
}
