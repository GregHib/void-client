import Class239_Sub28.Companion.method1842
import Class239_Sub29.Companion.method1850

/* Class263 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class263 internal constructor(class230: Class230?, i: Int, bool: Boolean, class45: Class45?, class45_29_: Class45?) {
    private val aClass45_3343: Class45?
    var aClass45_3345: Class45? = null
    private var aClass60_3350: Class60?
    var aBoolean3355: Boolean = false
    var aBoolean3359: Boolean = false
    var aClass60_3360: Class60
    var aClass60_3361: Class60?
    var aClass60_3362: Class60?
    var anInt3363: Int = 0

    fun method2004(bool: Boolean, i: Byte) {
        anInt3346++
        if (bool == !this.aBoolean3359) {
            this.aBoolean3359 = bool
            if (i.toInt() != 25) aClass60_3350 = null
            method2012(i + -23853)
        }
    }

    fun method2005(i: Int, i_0_: Int): Class51 {
        anInt3351++
        var class51: Class51?
        synchronized(aClass60_3350!!) {
            class51 = aClass60_3350!!.method583(i_0_.toLong(), i xor 0x32) as Class51?
        }
        if (class51 != null) return class51
        val `is`: ByteArray?
        synchronized(aClass45_3343!!) {
            `is` = aClass45_3343.method410(i + -1860, method1850(i_0_, 111), Class5_Sub1.method185(i_0_, (-90).toByte()))
        }
        class51 = Class51()
        class51.anInt941 = i_0_
        class51.aClass263_933 = this
        if (`is` != null) class51.method479(0.toByte(), Class348_Sub49(`is`))
        class51.method488(-105)
        if (i != 0) this.aClass60_3361 = null
        if (!this.aBoolean3359 && class51.aBoolean942) {
            class51.anIntArray917 = null
            class51.aStringArray913 = null
        }
        if (class51.aBoolean876) {
            class51.anInt920 = 0
            class51.aBoolean896 = false
        }
        synchronized(aClass60_3350!!) {
            aClass60_3350!!.method582(class51, i_0_.toLong(), (-109).toByte())
        }
        return class51
    }

    fun method2006(i: Int) {
        if (i >= 68) {
            anInt3353++
            synchronized(aClass60_3350!!) {
                aClass60_3350!!.method587(-106)
            }
            synchronized(this.aClass60_3360) {
                this.aClass60_3360.method587(-125)
            }
            synchronized(this.aClass60_3361!!) {
                this.aClass60_3361!!.method587(-122)
            }
            synchronized(this.aClass60_3362!!) {
                this.aClass60_3362!!.method587(-101)
            }
        }
    }

    fun method2008(i: Int, bool: Boolean) {
        anInt3344++
        if (!this.aBoolean3355 == bool) {
            this.aBoolean3355 = bool
            if (i >= -27) this.aClass60_3361 = null
            method2012(-23828)
        }
    }

    fun method2009(i: Int, i_21_: Byte) {
        this.anInt3363 = i
        anInt3348++
        synchronized(this.aClass60_3360) {
            this.aClass60_3360.method590(0)
        }
        synchronized(this.aClass60_3361!!) {
            this.aClass60_3361!!.method590(0)
        }
        if (i_21_ < 94) anIntArray3347 = null
        synchronized(this.aClass60_3362!!) {
            this.aClass60_3362!!.method590(0)
        }
    }

    fun method2010(i: Int, i_22_: Int) {
        anInt3349++
        synchronized(aClass60_3350!!) {
            aClass60_3350!!.method578(2, i)
        }
        synchronized(this.aClass60_3360) {
            this.aClass60_3360.method578(i_22_ xor 0x2.inv(), i)
        }
        synchronized(this.aClass60_3361!!) {
            this.aClass60_3361!!.method578(i_22_ xor 0x2.inv(), i)
        }
        synchronized(this.aClass60_3362!!) {
            this.aClass60_3362!!.method578(2, i)
            if (i_22_ != -1) method2013(null, 96.toByte())
        }
    }

    fun method2012(i: Int) {
        synchronized(aClass60_3350!!) {
            aClass60_3350!!.method590(0)
        }
        anInt3356++
        synchronized(this.aClass60_3360) {
            this.aClass60_3360.method590(0)
        }
        synchronized(this.aClass60_3361!!) {
            this.aClass60_3361!!.method590(0)
        }
        synchronized(this.aClass60_3362!!) {
            this.aClass60_3362!!.method590(0)
        }
    }

    fun method2014(i: Int, bool: Boolean) {
        aClass60_3350 = Class60(i)
        anInt3358++
        if (bool != true) this.aClass60_3362 = null
    }

    init {
        aClass60_3350 = Class60(64)
        this.aClass60_3360 = Class60(500)
        this.aClass60_3361 = Class60(30)
        this.aClass60_3362 = Class60(50)
        do {
            try {
                this.aBoolean3359 = bool
                this.aClass45_3345 = class45_29_
                aClass45_3343 = class45
                if (aClass45_3343 == null) break
                val i_30_ = aClass45_3343.method414(-1) + -1
                aClass45_3343.method407(0, i_30_)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("uha.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_29_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt3344: Int = 0
        var anInt3346: Int = 0
        @JvmField
        var anIntArray3347: IntArray? = IntArray(1000)
        var anInt3348: Int = 0
        var anInt3349: Int = 0
        var anInt3351: Int = 0
        private var aCharArray3352: CharArray? = CharArray(64)
        var anInt3353: Int = 0
        var anInt3354: Int = 0
        var anInt3356: Int = 0
        var anInt3357: Int = 0
        var anInt3358: Int = 0
        fun method2007(i: Int, i_1_: Int, i_2_: Int, class361: Class361, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int): Boolean {
            anInt3354++
            var i_10_ = i_8_
            var i_11_ = i_4_
            var i_12_ = 64
            var i_13_ = 64
            val i_14_ = -i_12_ + i_8_
            val i_15_ = -i_13_ + i_4_
            r.anIntArrayArray9723!![i_12_]!![i_13_] = 99
            if (i_1_ >= -27) method2011(103.toByte())
            Class223.anIntArrayArray2900!![i_12_]!![i_13_] = 0
            var i_16_ = 0
            Class367_Sub11.anIntArray7397!![i_16_] = i_10_
            var i_17_ = 0
            Class205.anIntArray2694!![i_16_++] = i_11_
            val `is` = class361.anIntArrayArray4438!!
            while (i_16_ != i_17_) {
                i_11_ = Class205.anIntArray2694!![i_17_]
                i_10_ = Class367_Sub11.anIntArray7397!![i_17_]
                i_17_ = 0xfff and 1 + i_17_
                i_12_ = i_10_ - i_14_
                i_13_ = -i_15_ + i_11_
                val i_18_ = i_10_ + -class361.anInt4453
                val i_19_ = -class361.anInt4441 + i_11_
                var i_20_ = i
                while_85_@ do {
                    while_84_@ do {
                        while_83_@ do {
                            while_82_@ do {
                                do {
                                    if (i_20_ == -4) {
                                        if (i_10_ == i_3_ && i_2_ == i_11_) {
                                            Class348_Sub40_Sub30.anInt9388 = i_10_
                                            Class115.anInt1753 = i_11_
                                            return true
                                        }
                                        break@while_85_
                                    } else if (i_20_ != -3) {
                                        if (i_20_ != -2) {
                                            if (i_20_ != -1) {
                                                if (i_20_ == 0 || i_20_ == 1 || i_20_ == 2 || i_20_ == 3 || (i_20_ == 9)) break@while_83_
                                                break@while_84_
                                            }
                                        } else break
                                        break@while_82_
                                    }
                                    if (method1842(i_5_, i_2_, -1, 2, i_10_, i_11_, i_3_, 2, i_6_)) {
                                        Class115.anInt1753 = i_11_
                                        Class348_Sub40_Sub30.anInt9388 = i_10_
                                        return true
                                    }
                                    break@while_85_
                                } while (false)
                                if (class361.method3497(-28388, i_3_, i_7_, 2, i_6_, i_10_, 2, i_11_, i_2_, i_5_)) {
                                    Class348_Sub40_Sub30.anInt9388 = i_10_
                                    Class115.anInt1753 = i_11_
                                    return true
                                }
                                break@while_85_
                            } while (false)
                            if (class361.method3503(i_10_, (-82).toByte(), i_2_, 2, i_6_, i_5_, i_7_, i_11_, i_3_)) {
                                Class348_Sub40_Sub30.anInt9388 = i_10_
                                Class115.anInt1753 = i_11_
                                return true
                            }
                            break@while_85_
                        } while (false)
                        if (class361.method3495(i_3_, i_11_, 2, i_9_, i_10_, i_2_, i, -53)) {
                            Class348_Sub40_Sub30.anInt9388 = i_10_
                            Class115.anInt1753 = i_11_
                            return true
                        }
                        break@while_85_
                    } while (false)
                    if (class361.method3504(i_2_, i_11_, i_3_, i_10_, i, 1, i_9_, 2)) {
                        Class348_Sub40_Sub30.anInt9388 = i_10_
                        Class115.anInt1753 = i_11_
                        return true
                    }
                } while (false)
                i_20_ = Class223.anIntArrayArray2900!![i_12_]!![i_13_] + 1
                if (i_12_ > 0 && r.anIntArrayArray9723!![i_12_ + -1]!![i_13_] == 0 && (0x43a40000 and `is`[i_18_ - 1]!![i_19_]) == 0 && (0x4e240000 and `is`[i_18_ - 1]!![1 + i_19_]) == 0) {
                    Class367_Sub11.anIntArray7397!![i_16_] = -1 + i_10_
                    Class205.anIntArray2694!![i_16_] = i_11_
                    r.anIntArrayArray9723!![-1 + i_12_]!![i_13_] = 2
                    i_16_ = i_16_ + 1 and 0xfff
                    Class223.anIntArrayArray2900!![i_12_ + -1]!![i_13_] = i_20_
                }
                if (i_12_ < 126 && (r.anIntArrayArray9723!![i_12_ - -1]!![i_13_] == 0) && (0x60e40000 and `is`[2 + i_18_]!![i_19_]) == 0 && (`is`[i_18_ + 2]!![i_19_ + 1] and 0x78240000) == 0) {
                    Class367_Sub11.anIntArray7397!![i_16_] = 1 + i_10_
                    Class205.anIntArray2694!![i_16_] = i_11_
                    r.anIntArrayArray9723!![1 + i_12_]!![i_13_] = 8
                    i_16_ = i_16_ + 1 and 0xfff
                    Class223.anIntArrayArray2900!![1 + i_12_]!![i_13_] = i_20_
                }
                if (i_13_ > 0 && r.anIntArrayArray9723!![i_12_]!![-1 + i_13_] == 0 && (0x43a40000 and `is`[i_18_]!![i_19_ - 1]) == 0 && ((`is`[i_18_ + 1]!![-1 + i_19_] and 0x60e40000) == 0)) {
                    Class367_Sub11.anIntArray7397!![i_16_] = i_10_
                    Class205.anIntArray2694!![i_16_] = i_11_ - 1
                    r.anIntArrayArray9723!![i_12_]!![i_13_ + -1] = 1
                    i_16_ = 1 + i_16_ and 0xfff
                    Class223.anIntArrayArray2900!![i_12_]!![i_13_ + -1] = i_20_
                }
                if (i_13_ < 126 && r.anIntArrayArray9723!![i_12_]!![i_13_ + 1] == 0 && (`is`[i_18_]!![2 + i_19_] and 0x4e240000) == 0 && ((0x78240000 and `is`[1 + i_18_]!![2 + i_19_]) == 0)) {
                    Class367_Sub11.anIntArray7397!![i_16_] = i_10_
                    Class205.anIntArray2694!![i_16_] = 1 + i_11_
                    i_16_ = 1 + i_16_ and 0xfff
                    r.anIntArrayArray9723!![i_12_]!![1 + i_13_] = 4
                    Class223.anIntArrayArray2900!![i_12_]!![i_13_ - -1] = i_20_
                }
                if (i_12_ > 0 && i_13_ > 0 && r.anIntArrayArray9723!![-1 + i_12_]!![i_13_ + -1] == 0 && (`is`[i_18_ + -1]!![i_19_] and 0x4fa40000) == 0 && (`is`[i_18_ - 1]!![i_19_ - 1] and 0x43a40000) == 0 && (`is`[i_18_]!![i_19_ - 1] and 0x63e40000) == 0) {
                    Class367_Sub11.anIntArray7397!![i_16_] = -1 + i_10_
                    Class205.anIntArray2694!![i_16_] = i_11_ - 1
                    i_16_ = 0xfff and 1 + i_16_
                    r.anIntArrayArray9723!![i_12_ - 1]!![i_13_ - 1] = 3
                    Class223.anIntArrayArray2900!![-1 + i_12_]!![-1 + i_13_] = i_20_
                }
                if (i_12_ < 126 && i_13_ > 0 && (r.anIntArrayArray9723!![i_12_ + 1]!![-1 + i_13_] == 0) && (`is`[i_18_ - -1]!![i_19_ + -1] and 0x63e40000) == 0 && (0x60e40000 and `is`[2 + i_18_]!![-1 + i_19_]) == 0 && (`is`[i_18_ - -2]!![i_19_] and 0x78e40000) == 0) {
                    Class367_Sub11.anIntArray7397!![i_16_] = 1 + i_10_
                    Class205.anIntArray2694!![i_16_] = i_11_ + -1
                    r.anIntArrayArray9723!![1 + i_12_]!![-1 + i_13_] = 9
                    i_16_ = 0xfff and i_16_ - -1
                    Class223.anIntArrayArray2900!![i_12_ - -1]!![i_13_ - 1] = i_20_
                }
                if (i_12_ > 0 && i_13_ < 126 && r.anIntArrayArray9723!![i_12_ - 1]!![1 + i_13_] == 0 && (`is`[i_18_ - 1]!![1 + i_19_] and 0x4fa40000) == 0 && (0x4e240000 and `is`[i_18_ - 1]!![2 + i_19_]) == 0 && (`is`[i_18_]!![i_19_ - -2] and 0x7e240000) == 0) {
                    Class367_Sub11.anIntArray7397!![i_16_] = i_10_ - 1
                    Class205.anIntArray2694!![i_16_] = i_11_ + 1
                    r.anIntArrayArray9723!![i_12_ + -1]!![1 + i_13_] = 6
                    i_16_ = 1 + i_16_ and 0xfff
                    Class223.anIntArrayArray2900!![-1 + i_12_]!![1 + i_13_] = i_20_
                }
                if (i_12_ < 126 && i_13_ < 126 && r.anIntArrayArray9723!![i_12_ + 1]!![1 + i_13_] == 0 && (`is`[i_18_ - -1]!![i_19_ + 2] and 0x7e240000) == 0 && (`is`[i_18_ + 2]!![i_19_ - -2] and 0x78240000) == 0 && ((0x78e40000 and `is`[i_18_ + 2]!![1 + i_19_]) == 0)) {
                    Class367_Sub11.anIntArray7397!![i_16_] = i_10_ - -1
                    Class205.anIntArray2694!![i_16_] = 1 + i_11_
                    i_16_ = 1 + i_16_ and 0xfff
                    r.anIntArrayArray9723!![1 + i_12_]!![i_13_ - -1] = 12
                    Class223.anIntArrayArray2900!![1 + i_12_]!![1 + i_13_] = i_20_
                }
            }
            Class348_Sub40_Sub30.anInt9388 = i_10_
            Class115.anInt1753 = i_11_
            return false
        }

        @JvmStatic
        fun method2011(i: Byte) {
            anIntArray3347 = null
            if (i > -19) aCharArray3352 = null
            aCharArray3352 = null
        }

        fun method2013(`is`: ByteArray?, i: Byte) {
            anInt3357++
            val class348_sub49 = Class348_Sub49(`is`)
            while (true) {
                val i_23_ = class348_sub49.readUnsignedByte(255)
                if (i_23_ == 0) break
                if (i_23_ == 1) {
                    Class81.anIntArray1432 = IntArray(6)
                    val is_28_: IntArray = Class81.anIntArray1432!!
                    is_28_[0] = class348_sub49.readUnsignedShort(i + 842397832)
                    is_28_[1] = class348_sub49.readUnsignedShort(i + 842397832)
                    is_28_[2] = class348_sub49.readUnsignedShort(842397944)
                    is_28_[3] = class348_sub49.readUnsignedShort(842397944)
                    is_28_[4] = class348_sub49.readUnsignedShort(842397944)
                    is_28_[5] = class348_sub49.readUnsignedShort(842397944)
                } else if (i_23_ == 4) {
                    val i_24_ = class348_sub49.readUnsignedByte(255)
                    RuntimeException_Sub1.anIntArray4603 = IntArray(i_24_)
                    var i_25_ = 0
                    while (i_24_ > i_25_) {
                        RuntimeException_Sub1.anIntArray4603!![i_25_] = class348_sub49.readUnsignedShort(842397944)
                        if (RuntimeException_Sub1.anIntArray4603!![i_25_] == 65535) RuntimeException_Sub1.anIntArray4603!![i_25_] = -1
                        i_25_++
                    }
                } else if (i_23_ == 5) {
                    val i_26_ = class348_sub49.readUnsignedByte(255)
                    Class239_Sub17.anIntArray6021 = IntArray(i_26_)
                    for (i_27_ in 0..<i_26_) {
                        Class239_Sub17.anIntArray6021!![i_27_] = class348_sub49.readUnsignedShort(842397944)
                        if (Class239_Sub17.anIntArray6021!![i_27_] == 65535) Class239_Sub17.anIntArray6021!![i_27_] = -1
                    }
                }
            }
        }

        init {
            for (i in 0..25) aCharArray3352!![i] = (65 + i).toChar()
            for (i in 26..51) aCharArray3352!![i] = (97 + i - 26).toChar()
            for (i in 52..61) aCharArray3352!![i] = (-52 + (i + 48)).toChar()
            aCharArray3352!![62] = '+'
            aCharArray3352!![63] = '/'
        }
    }
}
