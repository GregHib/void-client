import Class286_Sub5.Companion.method2161

/* Class112 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class112 internal constructor(class297: Class297) : Runnable {
    private val aClass107_1730 = Class107()
    private var aThread1733: Thread?
    var anInt1734: Int = 0
    private var aBoolean1738 = false

    fun method1049(`is`: ByteArray?, class137: Class137?, i: Byte, i_0_: Int): Class348_Sub42_Sub16_Sub2 {
        try {
            if (i.toInt() != 10) aBoolean1738 = false
            anInt1732++
            val class348_sub42_sub16_sub2 = Class348_Sub42_Sub16_Sub2()
            class348_sub42_sub16_sub2.aByteArray10461 = `is`
            class348_sub42_sub16_sub2.aBoolean9663 = false
            class348_sub42_sub16_sub2.aClass137_10458 = class137
            class348_sub42_sub16_sub2.aLong7057 = i_0_.toLong()
            class348_sub42_sub16_sub2.anInt10457 = 2
            method1050(class348_sub42_sub16_sub2, i + -123)
            return class348_sub42_sub16_sub2
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("aca.G(" + (if (`is` != null) "{...}" else "null") + ',' + (if (class137 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ')'))
        }
    }

    private fun method1050(class348_sub42_sub16_sub2: Class348_Sub42_Sub16_Sub2, i: Int) {
        anInt1735++
        synchronized(aClass107_1730) {
            aClass107_1730.method1005(true, class348_sub42_sub16_sub2)
            anInt1734++
            if (i > -100) aClass207_1727 = null
            (aClass107_1730 as Object).notifyAll()
        }
    }

    fun method1051(bool: Boolean) {
        aBoolean1738 = bool
        anInt1731++
        synchronized(aClass107_1730) {
            (aClass107_1730 as Object).notifyAll()
        }
        try {
            aThread1733!!.join()
        } catch (interruptedexception: InterruptedException) {
            /* empty */
        }
        aThread1733 = null
    }

    fun method1054(class137: Class137?, i: Int, i_19_: Byte): Class348_Sub42_Sub16_Sub2? {
        anInt1729++
        val class348_sub42_sub16_sub2 = Class348_Sub42_Sub16_Sub2()
        if (i_19_.toInt() != -112) return null
        class348_sub42_sub16_sub2.aBoolean9663 = false
        class348_sub42_sub16_sub2.anInt10457 = 3
        class348_sub42_sub16_sub2.aLong7057 = i.toLong()
        class348_sub42_sub16_sub2.aClass137_10458 = class137
        method1050(class348_sub42_sub16_sub2, -101)
        return class348_sub42_sub16_sub2
    }

    fun runClass348() : Class348_Sub42_Sub16_Sub2? {
        val class348_sub42_sub16_sub2: Class348_Sub42_Sub16_Sub2?
        synchronized(aClass107_1730) {
            class348_sub42_sub16_sub2 = (aClass107_1730.method1008(20) as? Class348_Sub42_Sub16_Sub2?)
            if (class348_sub42_sub16_sub2 == null) {
                try {
                    (aClass107_1730 as Object).wait()
                } catch (interruptedexception: InterruptedException) {
                    /* empty */
                }
                return null
            } else anInt1734--
        }
        return class348_sub42_sub16_sub2
    }

    override fun run() {
        while (!aBoolean1738) {
            val class348_sub42_sub16_sub2 = runClass348() ?: continue
            try {
                if ((class348_sub42_sub16_sub2!!.anInt10457) != 2) {
                    if (class348_sub42_sub16_sub2.anInt10457 == 3) class348_sub42_sub16_sub2.aByteArray10461 = (class348_sub42_sub16_sub2.aClass137_10458!!.method1161(((-4).toByte()).toByte(), class348_sub42_sub16_sub2.aLong7057.toInt()))
                } else class348_sub42_sub16_sub2.aClass137_10458!!.method1160(class348_sub42_sub16_sub2.aByteArray10461!!.size, (class348_sub42_sub16_sub2.aLong7057).toInt(), class348_sub42_sub16_sub2.aByteArray10461, -7305)
            } catch (exception: Exception) {
                Class156.method1242(null, exception, 15004)
            }
            class348_sub42_sub16_sub2!!.aBoolean9664 = false
        }
        anInt1736++
    }

    fun method1055(class137: Class137, i: Int, i_20_: Byte): Class348_Sub42_Sub16_Sub2 {
        if (i_20_ >= -98) method1052(110.toByte())
        anInt1737++
        val class348_sub42_sub16_sub2 = Class348_Sub42_Sub16_Sub2()
        class348_sub42_sub16_sub2.anInt10457 = 1
        synchronized(aClass107_1730) {
            var class348_sub42_sub16_sub2_21_ = (aClass107_1730.method1011(-95) as Class348_Sub42_Sub16_Sub2?)
            while (class348_sub42_sub16_sub2_21_ != null) {
                if ((class348_sub42_sub16_sub2_21_.aLong7057 == i.toLong()) && (class348_sub42_sub16_sub2_21_.aClass137_10458 == class137) && class348_sub42_sub16_sub2_21_.anInt10457 == 2) {
                    class348_sub42_sub16_sub2.aByteArray10461 = class348_sub42_sub16_sub2_21_.aByteArray10461
                    class348_sub42_sub16_sub2.aBoolean9664 = false
                    return class348_sub42_sub16_sub2
                }
                class348_sub42_sub16_sub2_21_ = (aClass107_1730.method1003(73.toByte()) as Class348_Sub42_Sub16_Sub2?)
            }
        }
        class348_sub42_sub16_sub2.aByteArray10461 = class137.method1161(((-4).toByte()).toByte(), i)
        class348_sub42_sub16_sub2.aBoolean9663 = true
        class348_sub42_sub16_sub2.aBoolean9664 = false
        return class348_sub42_sub16_sub2
    }

    init {
        val class144 = class297.method2236(this, -10240, 5)
        while (class144.anInt1997 == 0) method2161(43.toByte(), 10L)
        if (class144.anInt1997 == 2) throw RuntimeException()
        aThread1733 = class144.anObject1998 as Thread
    }

    companion object {
        @JvmField
        var anInt1726: Int = 0
        @JvmField
        var aClass207_1727: Class207? = null
        @JvmField
        var anInt1728: Int = 0
        @JvmField
        var anInt1729: Int = 0
        @JvmField
        var anInt1731: Int = 0
        @JvmField
        var anInt1732: Int = 0
        @JvmField
        var anInt1735: Int = 0
        @JvmField
        var anInt1736: Int = 0
        @JvmField
        var anInt1737: Int = 0
        @JvmStatic
        fun method1052(i: Byte) {
            aClass207_1727 = null
            val i_1_ = 107 % ((i - -20) / 50)
        }

        @JvmStatic
        fun method1053(i: Int): Int {
            anInt1728++
            if (i != 3112) method1052(121.toByte())
            if (Class289.aClass46_3701 == null) {
                if (!Class5_Sub1.aBoolean8335 && Class316.aClass348_Sub42_Sub12_3963 != null) return (Class316.aClass348_Sub42_Sub12_3963!!.anInt9609)
                val i_2_ = Class258_Sub4.aClass373_8552!!.method3597(true)
                val i_3_ = Class258_Sub4.aClass373_8552!!.method3594(81.toByte())
                if (Class348_Sub42_Sub6.aBoolean9535) {
                    if (i_2_ > Class135_Sub1.anInt4717 && i_2_ < Class63.anInt1117 + Class135_Sub1.anInt4717) {
                        var i_9_ = -1
                        var i_10_ = 0
                        while (Class8.anInt166 > i_10_) {
                            if (Class71.aBoolean1211) {
                                val i_11_ = (Class348_Sub42_Sub5.anInt9532 - -33 - -(i_10_ * 16))
                                if (i_3_ > -13 + i_11_ && i_3_ <= i_11_ + 3) i_9_ = i_10_
                            } else {
                                val i_12_ = (i_10_ * 16 + 31 + Class348_Sub42_Sub5.anInt9532)
                                if (i_3_ > -13 + i_12_ && i_3_ <= i_12_ + 3) i_9_ = i_10_
                            }
                            i_10_++
                        }
                        if (i_9_ != -1) {
                            var i_13_ = 0
                            val class156 = Class156(Class233.aClass107_3022!!)
                            var class348_sub42_sub13 = (class156.method1240(110) as? Class348_Sub42_Sub13)
                            while (class348_sub42_sub13 != null) {
                                if (i_9_ == i_13_++) return (class348_sub42_sub13.aClass107_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as Class348_Sub42_Sub12).anInt9609
                                class348_sub42_sub13 = (class156.method1243(77.toByte()) as? Class348_Sub42_Sub13)
                            }
                        }
                    } else if (Class242.aClass348_Sub42_Sub13_3152 != null && Class50_Sub3.anInt5252 < i_2_ && (Class348_Sub1_Sub1.anInt8806 + Class50_Sub3.anInt5252) > i_2_) {
                        var i_4_ = -1
                        var i_5_ = 0
                        while (((Class242.aClass348_Sub42_Sub13_3152!!.anInt9615) > i_5_)) {
                            if (Class71.aBoolean1211) {
                                val i_7_ = Class373.anInt4534 + (33 + 16 * i_5_)
                                if (-13 + i_7_ < i_3_ && 3 + i_7_ >= i_3_) i_4_ = i_5_
                            } else {
                                val i_6_ = i_5_ * 16 + 31 + Class373.anInt4534
                                if (-13 + i_6_ < i_3_ && i_6_ - -3 >= i_3_) i_4_ = i_5_
                            }
                            i_5_++
                        }
                        if (i_4_ != -1) {
                            var i_8_ = 0
                            val class156 = Class156(Class242.aClass348_Sub42_Sub13_3152!!.aClass107_9621)
                            var class348_sub42_sub12 = (class156.method1240(9) as? Class348_Sub42_Sub12)
                            while (class348_sub42_sub12 != null) {
                                if (i_8_++ == i_4_) return (class348_sub42_sub12.anInt9609)
                                class348_sub42_sub12 = (class156.method1243(90.toByte()) as? Class348_Sub42_Sub12)
                            }
                        }
                    }
                } else if (i_2_ > Class135_Sub1.anInt4717 && (i_2_ < Class135_Sub1.anInt4717 - -Class63.anInt1117)) {
                    var i_14_ = -1
                    var i_15_ = 0
                    while (Class73.anInt4776 > i_15_) {
                        if (Class71.aBoolean1211) {
                            val i_17_ = ((-i_15_ + (-1 + Class73.anInt4776)) * 16 + Class348_Sub42_Sub5.anInt9532 + 33)
                            if (i_3_ > i_17_ - 13 && i_17_ + 3 >= i_3_) i_14_ = i_15_
                        } else {
                            val i_16_ = 31 + (Class348_Sub42_Sub5.anInt9532 + (-i_15_ + (Class73.anInt4776 - 1)) * 16)
                            if (-13 + i_16_ < i_3_ && i_16_ + 3 >= i_3_) i_14_ = i_15_
                        }
                        i_15_++
                    }
                    if (i_14_ != -1) {
                        var i_18_ = 0
                        val class312 = Class312(Class348_Sub40_Sub4.aClass262_9111!!)
                        var class348_sub42_sub12 = (class312.method2327(((-53).toByte()).toByte()) as? Class348_Sub42_Sub12)
                        while (class348_sub42_sub12 != null) {
                            if (i_14_ == i_18_++) return (class348_sub42_sub12.anInt9609)
                            class348_sub42_sub12 = (class312.method2329(i + -3102) as? Class348_Sub42_Sub12)
                        }
                    }
                }
            }
            return -1
        }
    }
}
