import kotlin.math.max

/* Class219 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class219 internal constructor(class230: Class230?, i: Int, class45: Class45?, class45_17_: Class45?) {
    var aClass60_2862: Class60 = Class60(20)
    private val aClass45_2866: Class45?
    var aClass45_2873: Class45? = null
    private val aClass60_2875 = Class60(64)

    fun method1598(i: Int) {
        anInt2863++
        synchronized(aClass60_2875) {
            aClass60_2875.method587(-103)
        }
        synchronized(this.aClass60_2862) {
            if (i <= 42) method1598(36)
            this.aClass60_2862.method587(-126)
        }
    }

    fun method1601(i: Int, i_15_: Int): Class31 {
        anInt2874++
        var class31: Class31?
        synchronized(aClass60_2875) {
            class31 = aClass60_2875.method583(i_15_.toLong(), i + -148) as Class31?
        }
        if (class31 != null) return class31
        val `is`: ByteArray?
        synchronized(aClass45_2866!!) {
            `is` = aClass45_2866.method410(-1860, i, i_15_)
        }
        class31 = Class31()
        class31.aClass219_438 = this
        if (`is` != null) class31.method332(i xor 0x55.inv(), Class348_Sub49(`is`))
        synchronized(aClass60_2875) {
            aClass60_2875.method582(class31, i_15_.toLong(), (-109).toByte())
        }
        return class31
    }

    fun method1602(i: Int) {
        synchronized(aClass60_2875) {
            aClass60_2875.method590(i)
        }
        anInt2865++
        synchronized(this.aClass60_2862) {
            this.aClass60_2862.method590(0)
        }
    }

    fun method1603(i: Int, i_16_: Int) {
        anInt2870++
        synchronized(aClass60_2875) {
            aClass60_2875.method578(2, i)
            if (i_16_ >= -22) this.aClass45_2873 = null
        }
        synchronized(this.aClass60_2862) {
            this.aClass60_2862.method578(2, i)
        }
    }

    init {
        try {
            this.aClass45_2873 = class45_17_
            aClass45_2866 = class45
            aClass45_2866!!.method407(0, 46)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sb.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_17_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2863: Int = 0
        var aClass196_2864: Class196? = Class196()
        var anInt2865: Int = 0
        var anInt2867: Int = 0
        @JvmField
        var aClass223_2868: Class223? = Class223(0, 1)
        var anInt2869: Int = 0
        var anInt2870: Int = 0
        var aByte2871: Byte = 0
        @JvmField
        var anInt2872: Int = 0
        var anInt2874: Int = 0
        fun method1599(i: Byte, i_0_: Int, i_1_: Int): Boolean {
            anInt2869++
            if (i > -65) return false
            return (i_0_ and 0xc580) != 0
        }

        @JvmStatic
        fun method1600(bool: Boolean, i: Int, class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3) {
            anInt2867++
            val class225 = class318_sub1_sub3_sub3.method2422(72.toByte())
            if (class318_sub1_sub3_sub3.anInt10319 == 0) {
                class318_sub1_sub3_sub3.anInt10326 = 0
                Class235.anInt3062 = -1
                Class127_Sub1.anInt8387 = 0
            } else {
                if (i != ((class318_sub1_sub3_sub3.anInt10286).inv()) && (class318_sub1_sub3_sub3.anInt10218) == 0) {
                    val class17 = (Class10.aClass87_191!!.method835((class318_sub1_sub3_sub3.anInt10286), i + 7))
                    if ((class318_sub1_sub3_sub3.anInt10322) > 0 && class17.anInt262 == 0) {
                        Class235.anInt3062 = -1
                        Class127_Sub1.anInt8387 = 0
                        class318_sub1_sub3_sub3.anInt10326++
                        return
                    }
                    if ((class318_sub1_sub3_sub3.anInt10322) <= 0 && class17.anInt245 == 0) {
                        Class127_Sub1.anInt8387 = 0
                        Class235.anInt3062 = -1
                        class318_sub1_sub3_sub3.anInt10326++
                        return
                    }
                }
                if (class318_sub1_sub3_sub3.anInt10269 != -1 && (class318_sub1_sub3_sub3.anInt10225) <= Class367_Sub11.anInt7396) {
                    val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(118.toByte(), (class318_sub1_sub3_sub3.anInt10269)))
                    if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                        val class17 = Class10.aClass87_191!!.method835(class368.anInt4503, 7)
                        if ((class318_sub1_sub3_sub3.anInt10322) > 0 && class17.anInt262 == 0) {
                            Class127_Sub1.anInt8387 = 0
                            class318_sub1_sub3_sub3.anInt10326++
                            Class235.anInt3062 = -1
                            return
                        }
                        if ((class318_sub1_sub3_sub3.anInt10322) <= 0 && class17.anInt245 == 0) {
                            Class235.anInt3062 = -1
                            Class127_Sub1.anInt8387 = 0
                            class318_sub1_sub3_sub3.anInt10326++
                            return
                        }
                    }
                }
                if (class318_sub1_sub3_sub3.anInt10269 != -1 && ((class318_sub1_sub3_sub3.anInt10225) <= Class367_Sub11.anInt7396)) {
                    val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(98.toByte(), (class318_sub1_sub3_sub3.anInt10269)))
                    if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                        val class17 = Class10.aClass87_191!!.method835((class368.anInt4503), i xor 0x7)
                        if ((class318_sub1_sub3_sub3.anInt10322) > 0 && class17.anInt262 == 0) {
                            Class127_Sub1.anInt8387 = 0
                            class318_sub1_sub3_sub3.anInt10326++
                            Class235.anInt3062 = -1
                            return
                        }
                        if ((class318_sub1_sub3_sub3.anInt10322) <= 0 && class17.anInt245 == 0) {
                            Class235.anInt3062 = -1
                            Class127_Sub1.anInt8387 = 0
                            class318_sub1_sub3_sub3.anInt10326++
                            return
                        }
                    }
                }
                val i_2_ = class318_sub1_sub3_sub3.x
                val i_3_ = class318_sub1_sub3_sub3.y
                val i_4_ = (512 * (class318_sub1_sub3_sub3.anIntArray10320!![-1 + class318_sub1_sub3_sub3.anInt10319]) + class318_sub1_sub3_sub3.method2436(117.toByte()) * 256)
                val i_5_ = (512 * (class318_sub1_sub3_sub3.anIntArray10317!![-1 + class318_sub1_sub3_sub3.anInt10319]) - -(class318_sub1_sub3_sub3.method2436(72.toByte()) * 256))
                if (i_2_ >= i_4_) {
                    if (i_4_ < i_2_) {
                        if (i_5_ > i_3_) class318_sub1_sub3_sub3.method2440(49.toByte(), 6144)
                        else if (i_5_ < i_3_) class318_sub1_sub3_sub3.method2440(49.toByte(), 2048)
                        else class318_sub1_sub3_sub3.method2440(49.toByte(), 4096)
                    } else if (i_5_ <= i_3_) {
                        if (i_3_ > i_5_) class318_sub1_sub3_sub3.method2440(49.toByte(), 0)
                    } else class318_sub1_sub3_sub3.method2440(49.toByte(), 8192)
                } else if (i_3_ >= i_5_) {
                    if (i_5_ < i_3_) class318_sub1_sub3_sub3.method2440(49.toByte(), 14336)
                    else class318_sub1_sub3_sub3.method2440(49.toByte(), 12288)
                } else class318_sub1_sub3_sub3.method2440(49.toByte(), 10240)
                val i_6_ = (class318_sub1_sub3_sub3.aByteArray10321!![-1 + (class318_sub1_sub3_sub3.anInt10319)])
                if (!bool && (i_4_ - i_2_ > 1024 || i_4_ + -i_2_ < -1024 || -i_3_ + i_5_ > 1024 || i_5_ + -i_3_ < -1024)) {
                    class318_sub1_sub3_sub3.y = i_5_
                    class318_sub1_sub3_sub3.x = i_4_
                    class318_sub1_sub3_sub3.method2435((-108).toByte(), (class318_sub1_sub3_sub3.anInt10282), false)
                    Class235.anInt3062 = -1
                    class318_sub1_sub3_sub3.anInt10319--
                    if ((class318_sub1_sub3_sub3.anInt10322) > 0) class318_sub1_sub3_sub3.anInt10322--
                    Class127_Sub1.anInt8387 = 0
                } else {
                    var i_7_ = 16
                    var bool_8_ = true
                    if (class318_sub1_sub3_sub3 is Npc) bool_8_ = class318_sub1_sub3_sub3.aClass79_10505!!.aBoolean1331
                    if (bool_8_) {
                        val i_9_ = ((class318_sub1_sub3_sub3.anInt10282) - class318_sub1_sub3_sub3.aClass264_10217.anInt3370)
                        if (i_9_ != 0 && class318_sub1_sub3_sub3.anInt10275 == -1 && (class318_sub1_sub3_sub3.anInt10310) != 0) i_7_ = 8
                        if (!bool && (class318_sub1_sub3_sub3.anInt10319) > 2) i_7_ = 24
                        if (!bool && (class318_sub1_sub3_sub3.anInt10319) > 3) i_7_ = 32
                    } else {
                        if (!bool && class318_sub1_sub3_sub3.anInt10319 > 1) i_7_ = 24
                        if (!bool && class318_sub1_sub3_sub3.anInt10319 > 2) i_7_ = 32
                    }
                    if ((class318_sub1_sub3_sub3.anInt10326) > 0 && (class318_sub1_sub3_sub3.anInt10319) > 1) {
                        i_7_ = 32
                        class318_sub1_sub3_sub3.anInt10326--
                    }
                    if (i_6_.toInt() == 2) i_7_ = i_7_ shl 1
                    else if (i_6_.toInt() == 0) i_7_ = i_7_ shr 1
                    Class127_Sub1.anInt8387 = 0
                    if (class225.anInt2945 != -1) {
                        i_7_ = i_7_ shl 9
                        if ((class318_sub1_sub3_sub3.anInt10319) == 1) {
                            val i_10_ = (class318_sub1_sub3_sub3.anInt10325 * class318_sub1_sub3_sub3.anInt10325)
                            val i_11_ = ((if (i_4_ >= class318_sub1_sub3_sub3.x) -(class318_sub1_sub3_sub3.x) + i_4_ else (class318_sub1_sub3_sub3.x) + -i_4_) shl 9)
                            val i_12_ = ((if ((class318_sub1_sub3_sub3.y) <= i_5_) i_5_ - class318_sub1_sub3_sub3.y else (class318_sub1_sub3_sub3.y) + -i_5_) shl 9)
                            val i_13_ = max(i_12_, i_11_)
                            val i_14_ = class225.anInt2945 * 2 * i_13_
                            if (i_10_ <= i_14_) {
                                if (i_13_ < i_10_ / 2) {
                                    class318_sub1_sub3_sub3.anInt10325 -= class225.anInt2945
                                    if (class318_sub1_sub3_sub3.anInt10325 < 0) class318_sub1_sub3_sub3.anInt10325 = 0
                                } else if (i_7_ > class318_sub1_sub3_sub3.anInt10325) {
                                    class318_sub1_sub3_sub3.anInt10325 += class225.anInt2945
                                    if (class318_sub1_sub3_sub3.anInt10325 > i_7_) class318_sub1_sub3_sub3.anInt10325 = i_7_
                                }
                            } else class318_sub1_sub3_sub3.anInt10325 /= 2
                        } else if (i_7_ <= class318_sub1_sub3_sub3.anInt10325) {
                            if (class318_sub1_sub3_sub3.anInt10325 > 0) {
                                class318_sub1_sub3_sub3.anInt10325 -= class225.anInt2945
                                if (class318_sub1_sub3_sub3.anInt10325 < 0) class318_sub1_sub3_sub3.anInt10325 = 0
                            }
                        } else {
                            class318_sub1_sub3_sub3.anInt10325 += class225.anInt2945
                            if (i_7_ < class318_sub1_sub3_sub3.anInt10325) class318_sub1_sub3_sub3.anInt10325 = i_7_
                        }
                        i_7_ = (class318_sub1_sub3_sub3.anInt10325) shr 9
                        if (i_7_ < 1) i_7_ = 1
                    }
                    if (i_2_ == i_4_ && i_5_ == i_3_) Class235.anInt3062 = -1
                    else {
                        if (i_4_ > i_2_) {
                            Class127_Sub1.anInt8387 = Class127_Sub1.anInt8387 or 0x4
                            class318_sub1_sub3_sub3.x += i_7_
                            if (i_4_ < (class318_sub1_sub3_sub3.x)) class318_sub1_sub3_sub3.x = i_4_
                        } else if (i_4_ < i_2_) {
                            Class127_Sub1.anInt8387 = Class127_Sub1.anInt8387 or 0x8
                            class318_sub1_sub3_sub3.x -= i_7_
                            if (class318_sub1_sub3_sub3.x < i_4_) class318_sub1_sub3_sub3.x = i_4_
                        }
                        if (i_7_ >= 32) Class235.anInt3062 = 2
                        else Class235.anInt3062 = i_6_.toInt()
                        if (i_3_ < i_5_) {
                            Class127_Sub1.anInt8387 = Class127_Sub1.anInt8387 or 0x1
                            class318_sub1_sub3_sub3.y += i_7_
                            if (i_5_ < (class318_sub1_sub3_sub3.y)) class318_sub1_sub3_sub3.y = i_5_
                        } else if (i_5_ < i_3_) {
                            Class127_Sub1.anInt8387 = Class127_Sub1.anInt8387 or 0x2
                            class318_sub1_sub3_sub3.y -= i_7_
                            if (i_5_ > (class318_sub1_sub3_sub3.y)) class318_sub1_sub3_sub3.y = i_5_
                        }
                    }
                    if (i_4_ == class318_sub1_sub3_sub3.x && i_5_ == (class318_sub1_sub3_sub3.y)) {
                        if ((class318_sub1_sub3_sub3.anInt10322) > 0) class318_sub1_sub3_sub3.anInt10322--
                        class318_sub1_sub3_sub3.anInt10319--
                    }
                }
            }
        }

        @JvmStatic
        fun method1604(i: Int) {
            aClass196_2864 = null
            aClass223_2868 = null
            if (i != 11868) anInt2872 = -94
        }
    }
}
