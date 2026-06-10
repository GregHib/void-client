import kotlin.math.atan2
import kotlin.math.min

/* Class318_Sub1_Sub3_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class318_Sub1_Sub3_Sub3 : Class318_Sub1_Sub3(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0.toByte()) {
    @JvmField
    var anInt10201: Int = 0
    @JvmField
    var anInt10202: Int = 0
    @JvmField
    var anInt10203: Int = 0
    @JvmField
    var aByte10206: Byte = 0
    @JvmField
    var anInt10207: Int
    @JvmField
    var anInt10208: Int = 0
    @JvmField
    var anInt10210: Int = 0
    @JvmField
    var anInt10211: Int = 0
    @JvmField
    var aBoolean10213: Boolean = false
    var anInt10215: Int
    @JvmField
    var aClass264_10217: Class264
    @JvmField
    var anInt10218: Int = 0
    var anIntArray10219: IntArray
    @JvmField
    var anInt10220: Int = 0
    private var aByte10222: Byte
    @JvmField
    var anInt10223: Int
    @JvmField
    var anInt10224: Int = 0
    @JvmField
    var anInt10225: Int = 0
    @JvmField
    var aBoolean10226: Boolean = false
    @JvmField
    var anInt10227: Int = 0
    var anIntArray10229: IntArray
    @JvmField
    var anInt10230: Int = 0
    @JvmField
    var anInt10231: Int = 0
    @JvmField
    var anInt10232: Int = 0
    @JvmField
    var anInt10234: Int = 0
    @JvmField
    var anIntArray10236: IntArray? = null
    @JvmField
    var anInt10237: Int = 0
    @JvmField
    var anInt10239: Int = 0
    @JvmField
    var anInt10240: Int = 0
    @JvmField
    var anInt10241: Int = 0
    var anIntArray10242: IntArray? = null
    @JvmField
    var anInt10243: Int = 0
    @JvmField
    var anInt10244: Int
    @JvmField
    var anInt10245: Int = 0
    @JvmField
    var anInt10247: Int = 0
    @JvmField
    var anInt10248: Int
    @JvmField
    var anInt10250: Int
    @JvmField
    var anInt10252: Int = 0
    @JvmField
    var aByte10255: Byte = 0
    var anIntArray10259: IntArray
    @JvmField
    var anInt10260: Int = 0
    @JvmField
    var anInt10261: Int = 0
    @JvmField
    var anInt10264: Int = 100
    @JvmField
    var anInt10265: Int = 0
    @JvmField
    var anInt10267: Int = 0
    @JvmField
    var anInt10268: Int
    @JvmField
    var anInt10269: Int
    @JvmField
    var aByte10270: Byte = 0
    @JvmField
    var anInt10271: Int = 0
    @JvmField
    var anInt10273: Int = 0
    @JvmField
    var anInt10274: Int = 0
    @JvmField
    var anInt10275: Int
    @JvmField
    var anInt10276: Int
    @JvmField
    var anInt10278: Int
    @JvmField
    var aByte10279: Byte
    private var anInt10280 = 1
    @JvmField
    var anInt10282: Int = 0
    @JvmField
    var anInt10283: Int
    var anIntArray10284: IntArray
    @JvmField
    var anInt10285: Int = 0
    @JvmField
    var anInt10286: Int
    @JvmField
    var anInt10287: Int
    @JvmField
    var anInt10288: Int = 0
    @JvmField
    var anInt10289: Int
    @JvmField
    var anInt10290: Int = 0
    @JvmField
    var anInt10291: Int
    @JvmField
    var aString10292: String? = null
    @JvmField
    var anInt10293: Int = 0
    @JvmField
    var anInt10294: Int = 0
    var anInt10295: Int = 0
    @JvmField
    var anIntArray10296: IntArray? = null
    @JvmField
    var anInt10300: Int = 0
    @JvmField
    var anInt10301: Int = 0
    @JvmField
    var anInt10302: Int = 0
    var anIntArray10303: IntArray
    var anIntArray10304: IntArray
    @JvmField
    var anInt10305: Int = 0
    @JvmField
    var anInt10306: Int = 0
    @JvmField
    var aClass182Array10308: Array<Class182?>?
    @JvmField
    var aBoolean10309: Boolean = true
    @JvmField
    var anInt10310: Int = 256
    @JvmField
    var anInt10312: Int
    @JvmField
    var anInt10314: Int = 0
    private val aClass264_10315: Class264
    private val aClass264_10316: Class264
    @JvmField
    var anIntArray10317: IntArray?
    @JvmField
    var aBoolean10318: Boolean
    @JvmField
    var anInt10319: Int
    @JvmField
    var anIntArray10320: IntArray?
    @JvmField
    var aByteArray10321: ByteArray?
    @JvmField
    var anInt10322: Int
    @JvmField
    var aClass64Array10323: Array<Class64?>
    @JvmField
    var aBoolean10324: Boolean
    @JvmField
    var anInt10325: Int
    @JvmField
    var anInt10326: Int
    @JvmField
    var aClass318_Sub10_10327: Class318_Sub10? = null

    abstract fun method2421(i: Byte): Int

    fun method2422(i: Byte): Class225 {
        if (i.toInt() != 72) method2438(-88, 93, -127, 68, 7, -76, 116, 122.toByte())
        anInt10249++
        val i_1_ = method2421(127.toByte())
        if (i_1_ != -1) return Class64_Sub3.aClass261_5558!!.method1983(i_1_, 32)
        return Class225.aClass225_2931!!
    }

    override fun method2409(i: Byte) {
        anInt10307++
        val i_2_ = 240 + (-1 + anInt10280 shl 8)
        this.aShort8747 = (i_2_ + this.y shr 9).toShort()
        this.aShort8750 = (-i_2_ + this.y shr 9).toShort()
        this.aShort8751 = (i_2_ + this.x shr 9).toShort()
        if (i >= -109) aShortArrayArray10258 = null
        this.aShort8743 = (this.x + -i_2_ shr 9).toShort()
    }

    fun method2423(i: Int, i_3_: Int, i_4_: Int): Boolean {
        anInt10251++
        if (this.anIntArray10296 == null) {
            if (i_4_ == -1) return true
            this.anIntArray10296 = IntArray(12)
            for (i_5_ in 0..11) this.anIntArray10296!![i_5_] = -1
        }
        val i_6_ = 3 / ((-22 - i) / 58)
        val class225 = method2422(72.toByte())
        var i_7_ = 256
        if (class225.anIntArray2907 != null && class225.anIntArray2907!![i_3_] > 0) i_7_ = class225.anIntArray2907!![i_3_]
        if (i_4_ == -1) {
            if (this.anIntArray10296!![i_3_] == -1) return true
            val i_8_ = this.aClass264_10217.method2019((-41).toByte())
            val i_9_ = this.anIntArray10296!![i_3_]
            val i_10_ = -i_9_ + i_8_
            if (i_10_ >= -i_7_ && i_10_ <= i_7_) {
                this.anIntArray10296!![i_3_] = -1
                for (i_11_ in 0..11) {
                    if (this.anIntArray10296!![i_11_] != -1) return true
                }
                this.anIntArray10296 = null
                return true
            }
            if (i_10_ > 0 && i_10_ <= 8192 || i_10_ <= -8192) this.anIntArray10296!![i_3_] = Class139.method1166(16383, i_9_ - -i_7_)
            else this.anIntArray10296!![i_3_] = Class139.method1166(-i_7_ + i_9_, 16383)
            return false
        }
        if (this.anIntArray10296!![i_3_] == -1) this.anIntArray10296!![i_3_] = this.aClass264_10217.method2019((-104).toByte())
        val i_12_ = this.anIntArray10296!![i_3_]
        val i_13_ = -i_12_ + i_4_
        if (i_13_ >= -i_7_ && i_7_ >= i_13_) {
            this.anIntArray10296!![i_3_] = i_4_
            return true
        }
        if ((i_13_ <= 0 || i_13_ > 8192) && i_13_ > -8192) this.anIntArray10296!![i_3_] = Class139.method1166(16383, i_12_ - i_7_)
        else this.anIntArray10296!![i_3_] = Class139.method1166(16383, i_12_ - -i_7_)
        return false
    }

    fun method2424(i: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Byte, i_18_: Int) {
        anInt10263++
        val i_19_ = ((this.aShort8743 + this.aShort8751) shr 1)
        val i_20_ = ((this.aShort8750 + this.aShort8747) shr 1)
        val i_21_ = Class70.anIntArray1207!![i]
        val i_22_ = Class70.anIntArray1204!![i]
        val i_23_ = -i_14_ / 2
        val i_24_ = -i_16_ / 2
        val i_25_ = i_23_ * i_22_ + i_24_ * i_21_ shr 14
        val i_26_ = -(i_21_ * i_23_) + i_24_ * i_22_ shr 14
        val i_27_ = Class171.method1321((-125).toByte(), i_25_ + this.x, i_26_ + this.y, i_19_, this.plane.toInt(), i_20_)
        val i_28_ = i_14_ / 2
        val i_29_ = -i_16_ / 2
        val i_30_ = i_28_ * i_22_ + i_21_ * i_29_ shr 14
        val i_31_ = -(i_21_ * i_28_) + i_29_ * i_22_ shr 14
        val i_32_ = Class171.method1321((-119).toByte(), i_30_ + this.x, this.y + i_31_, i_19_, this.plane.toInt(), i_20_)
        val i_33_ = -i_14_ / 2
        val i_34_ = i_16_ / 2
        val i_35_ = i_34_ * i_21_ - -(i_33_ * i_22_) shr 14
        val i_36_ = -(i_33_ * i_21_) + i_34_ * i_22_ shr 14
        val i_37_ = Class171.method1321(101.toByte(), i_35_ + this.x, this.y + i_36_, i_19_, this.plane.toInt(), i_20_)
        if (i_17_ <= 63) this.anInt10243 = -62
        val i_38_ = i_14_ / 2
        val i_39_ = i_16_ / 2
        val i_40_ = i_22_ * i_38_ + i_39_ * i_21_ shr 14
        val i_41_ = i_22_ * i_39_ + -(i_21_ * i_38_) shr 14
        val i_42_ = Class171.method1321((-114).toByte(), i_40_ + this.x, this.y + i_41_, i_19_, this.plane.toInt(), i_20_)
        val i_43_ = min(i_32_, i_27_)
        val i_44_ = min(i_37_, i_42_)
        val i_45_ = min(i_42_, i_32_)
        this.anInt10302 = 0x3fff and (atan2((i_43_ + -i_44_).toDouble(), i_16_.toDouble()) * 2607.5945876176133).toInt()
        val i_46_ = min(i_27_, i_37_)
        this.anInt10208 = 0x3fff and (2607.5945876176133 * atan2((i_46_ - i_45_).toDouble(), i_14_.toDouble())).toInt()
        if (this.anInt10302 != 0 && i_18_ != 0) {
            val i_47_ = -i_18_ + 16384
            if (this.anInt10302 <= 8192) {
                if (this.anInt10302 > i_18_) this.anInt10302 = i_18_
            } else if (this.anInt10302 < i_47_) this.anInt10302 = i_47_
        }
        if (this.anInt10208 != 0 && i_15_ != 0) {
            val i_48_ = -i_15_ + 16384
            if (this.anInt10208 > 8192) {
                if (i_48_ > this.anInt10208) this.anInt10208 = i_48_
            } else if (this.anInt10208 > i_15_) this.anInt10208 = i_15_
        }
        this.anInt10252 = i_27_ - -i_42_
        if (i_32_ - -i_37_ < this.anInt10252) this.anInt10252 = i_32_ - -i_37_
        this.anInt10252 = (-this.anInt6382 + (this.anInt10252 shr 1))
    }

    abstract fun method2425(i: Int): Int

    open fun method2426(i: Int): Int {
        anInt10214++
        val class225 = method2422(72.toByte())
        if (class225.anInt2928 != -1) return class225.anInt2928
        if (this.anInt10207 == -32768) return 200
        if (i != 200) method2377((-40).toByte())
        return -this.anInt10207
    }

    fun method2427(i: Int) {
        anInt10313++
        if (i < 13) method2429(6)
        this.anInt10319 = 0
        this.anInt10322 = 0
    }

    fun method2428(i: Int): Int {
        anInt10200++
        val class225 = method2422(72.toByte())
        if (i != 2) method2376(11)
        val i_49_ = (this.aClass264_10217.anInt3370)
        val bool: Boolean
        if (class225.anInt2948 == 0) bool = (this.aClass264_10217.method2020(this.anInt10310, this.anInt10282, this.anInt10310, (-113).toByte()))
        else bool = (this.aClass264_10217.method2020(class225.anInt2917, this.anInt10282, class225.anInt2948, (-107).toByte()))
        val i_50_ = -i_49_ + this.aClass264_10217.anInt3370
        if (i_50_ == 0) {
            this.anInt10247 = 0
            this.aClass264_10217.method2016(15615, this.anInt10282)
        } else this.anInt10247++
        if (bool) {
            if (class225.anInt2901 != 0) {
                if (i_50_ <= 0) aClass264_10315.method2020(class225.anInt2935, -(class225.anInt2950), class225.anInt2901, (-47).toByte())
                else aClass264_10315.method2020(class225.anInt2935, class225.anInt2950, class225.anInt2901, (-77).toByte())
            }
            if (class225.anInt2936 != 0) aClass264_10316.method2020(class225.anInt2904, class225.anInt2926, class225.anInt2936, (-127).toByte())
        } else {
            if (class225.anInt2901 == 0) aClass264_10315.method2016(15615, 0)
            else aClass264_10315.method2020(class225.anInt2935, 0, class225.anInt2901, (-26).toByte())
            if (class225.anInt2936 != 0) aClass264_10316.method2020(class225.anInt2904, 0, class225.anInt2936, (-66).toByte())
            else aClass264_10316.method2016(15615, 0)
        }
        return i_50_
    }

    fun method2430(`is`: IntArray?, is_51_: IntArray?, i: Int) {
        do {
            try {
                anInt10233++
                if (this.anIntArray10242 != null || is_51_ == null) {
                    if (is_51_ == null) {
                        this.anIntArray10242 = null
                        break
                    }
                } else this.anIntArray10242 = IntArray(12)
                for (i_52_ in (this.anIntArray10242)!!.indices) this.anIntArray10242!![i_52_] = -1
                for (i_53_ in is_51_.indices) {
                    var i_54_ = `is`!![i_53_]
                    for (i_55_ in (this.anIntArray10242)!!.indices) {
                        if ((0x1 and i_54_) != 0) this.anIntArray10242!![i_55_] = is_51_[i_53_]
                        i_54_ = i_54_ shr 1
                    }
                }
                if (i < -71) break
                this.anIntArray10236 = null
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("kda.DB(" + (if (`is` != null) "{...}" else "null") + ',' + (if (is_51_ != null) "{...}" else "null") + ',' + i + ')'))
            }
            break
        } while (false)
    }

    fun method2432(var_ha: ha?, i: Int, class101: Class101?, bool: Boolean, class64s: Array<Class64?>?) {
        do {
            try {
                if (i == -15074) {
                    anInt10256++
                    if (!bool) {
                        val class64 = class64s!![0]
                        val class64_65_ = class64s[1]
                        val class64_66_ = class64s[2]
                        if (class64 != null) {
                            class64.method620(class101)
                            var i_67_ = 0
                            var i_68_ = 0
                            var i_69_ = 0
                            var i_70_ = 0
                            val class129s = class64.method619()
                            val class342s = class64.method604()
                            if (class342s != null) {
                                i_70_++
                                i_69_ += class342s.size
                            }
                            if (class129s != null) {
                                i_67_ += class129s.size
                                i_68_++
                            }
                            var class129s_71_: Array<Class129?>? = null
                            var class342s_72_: Array<Class342?>? = null
                            if (class64_65_ != null) {
                                class64_65_.method620(class101)
                                class129s_71_ = class64_65_.method619()
                                class342s_72_ = class64_65_.method604()
                            }
                            if (class342s_72_ != null) {
                                i_70_++
                                i_69_ += class342s_72_.size
                            }
                            if (class129s_71_ != null) {
                                i_68_++
                                i_67_ += class129s_71_.size
                            }
                            var class129s_73_: Array<Class129?>? = null
                            var class342s_74_: Array<Class342?>? = null
                            if (class64_66_ != null) {
                                class64_66_.method620(class101)
                                class129s_73_ = class64_66_.method619()
                                class342s_74_ = class64_66_.method604()
                            }
                            if (class342s_74_ != null) {
                                i_70_++
                                i_69_ += class342s_74_.size
                            }
                            if (class129s_73_ != null) {
                                i_67_ += class129s_73_.size
                                i_68_++
                            }
                            if (((this.aClass318_Sub10_10327) == null || this.aClass318_Sub10_10327!!.aBoolean6470) && (i_68_ > 0 || i_70_ > 0)) this.aClass318_Sub10_10327 = Class318_Sub10.method2526((Class367_Sub11.anInt7396), true)
                            if ((this.aClass318_Sub10_10327) != null) {
                                val `object`: Any? = null
                                val class129s_75_: Array<Class129?>?
                                if (i_68_ != 1) {
                                    class129s_75_ = arrayOfNulls<Class129>(i_67_)
                                    var i_76_ = 0
                                    if (class129s != null) {
                                        Class214.method1575(class129s, 0, class129s_75_, i_76_, class129s.size)
                                        i_76_ += class129s.size
                                    }
                                    if (class129s_71_ != null) {
                                        Class214.method1575(class129s_71_, 0, class129s_75_, i_76_, class129s_71_.size)
                                        i_76_ += class129s_71_.size
                                    }
                                    if (class129s_73_ != null) Class214.method1575(class129s_73_, 0, class129s_75_, i_76_, class129s_73_.size)
                                } else if (class129s_71_ != null) class129s_75_ = class129s_71_
                                else if (class129s_73_ != null) class129s_75_ = class129s_73_
                                else class129s_75_ = class129s
                                val object_77_: Any? = null
                                val class342s_78_: Array<Class342?>?
                                if (i_70_ == 1) {
                                    if (class342s_72_ != null) class342s_78_ = class342s_72_
                                    else if (class342s_74_ == null) class342s_78_ = class342s
                                    else class342s_78_ = class342s_74_
                                } else {
                                    class342s_78_ = arrayOfNulls<Class342>(i_69_)
                                    var i_79_ = 0
                                    if (class342s != null) {
                                        Class214.method1575(class342s, 0, class342s_78_, i_79_, class342s.size)
                                        i_79_ += class342s.size
                                    }
                                    if (class342s_72_ != null) {
                                        Class214.method1575(class342s_72_, 0, class342s_78_, i_79_, class342s_72_.size)
                                        i_79_ += class342s_72_.size
                                    }
                                    if (class342s_74_ != null) Class214.method1575(class342s_74_, 0, class342s_78_, i_79_, class342s_74_.size)
                                }
                                this.aClass318_Sub10_10327!!.method2536(var_ha, Class367_Sub11.anInt7396.toLong(), class129s_75_, class342s_78_, false)
                            }
                            this.aBoolean10318 = true
                        }
                    } else if ((this.aClass318_Sub10_10327) != null) this.aClass318_Sub10_10327!!.method2540(Class367_Sub11.anInt7396.toLong())
                    if (this.aClass318_Sub10_10327 == null) break
                    this.aClass318_Sub10_10327!!.method2533(this.plane.toInt(), this.aShort8743.toInt(), this.aShort8751.toInt(), this.aShort8750.toInt(), this.aShort8747.toInt())
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("kda.L(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + (if (class101 != null) "{...}" else "null") + ',' + bool + ',' + (if (class64s != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    protected fun finalize() {
        if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327!!.method2534()
        anInt10297++
    }

    fun method2434(i: Byte, i_86_: Int) {
        if (i <= 20) this.anInt10295 = -101
        anInt10235++
        anInt10280 = i_86_
    }

    fun method2435(i: Byte, i_87_: Int, bool: Boolean) {
        anInt10298++
        val class225 = method2422(72.toByte())
        if (bool || class225.anInt2948 != 0 || this.anInt10310 != 0) {
            if (i.toInt() != -108) method2438(-11, -118, -110, -2, -57, -110, 126, 93.toByte())
            this.anInt10282 = 0x3fff and i_87_
            this.aClass264_10217.method2016(15615, this.anInt10282)
        }
    }

    override fun method2379(i: Int): Int {
        if (i != -25675) return -109
        anInt10311++
        return this.anInt10230
    }

    override fun method2394(bool: Boolean): Int {
        anInt10254++
        if (bool != true) this.anIntArray10296 = null
        if (this.anInt10207 == -32768) return 0
        return this.anInt10207
    }

    open fun method2436(i: Byte): Int {
        anInt10299++
        if (i < 39) method2420(-75, 84)
        return anInt10280
    }

    override fun method2376(i: Int): Boolean {
        anInt10281++
        return i > -12
    }

    override fun method2377(i: Byte): Boolean {
        if (i.toInt() != 122) anInt10257 = -72
        anInt10262++
        return this.aBoolean10324
    }

    fun method2437(i: Int, i_88_: Int, i_89_: Int, i_90_: Int, bool: Boolean, i_91_: Int) {
        anInt10216++
        val i_92_ = (if (!bool) this.anInt10269 else this.anInt10291)
        if (i_88_ != -1 && i_92_ != -1) {
            if (i_92_ == i_88_) {
                val class368 = Class348_Sub40_Sub18.aClass319_9245!!.method2543(65.toByte(), i_88_)
                if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                    val class17 = Class10.aClass87_191!!.method835(class368.anInt4503, 7)
                    val i_95_ = class17.anInt248
                    if (i_95_ == 0) return
                    if (i_95_ == 2) {
                        if (bool) {
                            this.anInt10265 = 0
                            return
                        } else this.anInt10305 = 0
                        return
                    }
                }
            } else {
                val class368 = Class348_Sub40_Sub18.aClass319_9245!!.method2543(109.toByte(), i_88_)
                val class368_93_ = Class348_Sub40_Sub18.aClass319_9245!!.method2543(99.toByte(), i_92_)
                if (class368.anInt4503 != -1 && class368_93_.anInt4503 != -1) {
                    val class17 = Class10.aClass87_191!!.method835(class368.anInt4503, 7)
                    val class17_94_ = Class10.aClass87_191!!.method835((class368_93_.anInt4503), i_89_ xor 0x3c5664d6.inv())
                    if (class17_94_.anInt239 > class17.anInt239) return
                }
            }
        }
        val i_96_ = Class367_Sub11.anInt7396
        if (i_89_ != -1012294866) method2423(84, 124, 113)
        if (bool) {
            this.anInt10276 = 1
            this.anInt10260 = i_91_ shr 16
            this.anInt10291 = i_88_
            this.anInt10211 = (0xffff and i_91_) + i_96_
            this.anInt10224 = 0
            this.anInt10289 = i_90_
            this.anInt10202 = i
            this.anInt10273 = 0
            if (i_96_ < this.anInt10211) this.anInt10224 = -1
            if (this.anInt10291 != -1 && (this.anInt10211 == i_96_)) {
                val i_97_ = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(98.toByte(), this.anInt10291).anInt4503)
                if (i_97_ != -1) {
                    val class17 = Class10.aClass87_191!!.method835(i_97_, 7)
                    if (class17 != null && class17.anIntArray237 != null && !this.aBoolean10309) Class287.method2178(this, 0, class17, i_89_ + 1012294835)
                }
            }
        } else {
            this.anInt10243 = 0
            this.anInt10278 = i_90_
            this.anInt10237 = i
            this.anInt10225 = (0xffff and i_91_) + i_96_
            this.anInt10283 = 1
            this.anInt10240 = 0
            this.anInt10269 = i_88_
            this.anInt10220 = i_91_ shr 16
            if (i_96_ < this.anInt10225) this.anInt10240 = -1
            if (this.anInt10269 != -1 && this.anInt10225 == i_96_) {
                val i_98_ = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(103.toByte(), this.anInt10269).anInt4503)
                if (i_98_ != -1) {
                    val class17 = Class10.aClass87_191!!.method835(i_98_, 7)
                    if (class17 != null && class17.anIntArray237 != null && !this.aBoolean10309) Class287.method2178(this, 0, class17, -128)
                }
            }
        }
    }

    fun method2438(i: Int, i_99_: Int, i_100_: Int, i_101_: Int, i_102_: Int, i_103_: Int, i_104_: Int, i_105_: Byte) {
        anInt10228++
        var bool = true
        var bool_106_ = true
        if (i_105_ > 91) {
            var i_107_ = 0
            while (Class132.anInt1905 > i_107_) {
                if (this.anIntArray10219[i_107_] > i_99_) bool = false
                else bool_106_ = false
                i_107_++
            }
            var i_108_ = -1
            var i_109_ = -1
            var i_110_ = 0
            if (i_100_ >= 0) {
                val class31 = Class73.aClass219_4782!!.method1601(46, i_100_)
                i_109_ = class31.anInt431
                i_110_ = class31.anInt434
            }
            if (bool_106_) {
                if (i_109_ == -1) return
                i_108_ = 0
                var i_113_ = 0
                if (i_109_ != 0) {
                    if (i_109_ == 1) i_113_ = (this.anIntArray10229[0])
                } else i_113_ = this.anIntArray10219[0]
                for (i_114_ in 1..<Class132.anInt1905) {
                    if (i_109_ == 0) {
                        if (i_113_ > (this.anIntArray10219[i_114_])) {
                            i_113_ = (this.anIntArray10219[i_114_])
                            i_108_ = i_114_
                        }
                    } else if (i_109_ == 1 && (this.anIntArray10229[i_114_]) < i_113_) {
                        i_113_ = (this.anIntArray10229[i_114_])
                        i_108_ = i_114_
                    }
                }
                if (i_109_ == 1 && i_113_ >= i) return
            } else {
                if (bool) aByte10222 = 0.toByte()
                for (i_111_ in 0..<Class132.anInt1905) {
                    val i_112_ = aByte10222.toInt()
                    aByte10222 = ((aByte10222 + 1) % Class132.anInt1905).toByte()
                    if (i_99_ >= (this.anIntArray10219[i_112_])) {
                        i_108_ = i_112_
                        break
                    }
                }
            }
            if (i_108_ >= 0) {
                this.anIntArray10259[i_108_] = i_100_
                this.anIntArray10229[i_108_] = i
                this.anIntArray10304[i_108_] = i_102_
                this.anIntArray10284[i_108_] = i_101_
                this.anIntArray10219[i_108_] = i_103_ + (i_110_ + i_99_)
                this.anIntArray10303[i_108_] = i_104_
            }
        }
    }

    fun method2439(i: Int, class64: Class64?) {
        try {
            anInt10205++
            val i_115_ = aClass264_10315.anInt3370
            if (i >= -110) this.anInt10325 = 90
            val i_116_ = aClass264_10316.anInt3370
            if (i_115_ != 0 || i_116_ != 0) {
                val i_117_ = class64!!.fa() / 2
                class64.H(0, -i_117_, 0)
                class64.VA(0x3fff and i_115_)
                class64.FA(0x3fff and i_116_)
                class64.H(0, i_117_, 0)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("kda.GB(" + i + ',' + (if (class64 != null) "{...}" else "null") + ')'))
        }
    }

    fun method2440(i: Byte, i_118_: Int) {
        anInt10277++
        val class225 = method2422(72.toByte())
        if (class225.anInt2948 != 0 || this.anInt10310 != 0) {
            this.aClass264_10217.method2021(119.toByte())
            if (i.toInt() != 49) method2376(113)
            val i_119_ = (0x3fff and i_118_ - this.aClass264_10217.anInt3370)
            if (i_119_ <= 8192) this.anInt10282 = this.aClass264_10217.anInt3370 - -i_119_
            else this.anInt10282 = (this.aClass264_10217.anInt3370 - 16384 - -i_119_)
        }
    }

    init {
        this.anInt10250 = -1
        this.anInt10268 = -1
        this.anInt10215 = -1
        this.anInt10269 = -1
        this.anIntArray10229 = IntArray(Class132.anInt1905)
        this.anInt10278 = -1
        this.anInt10244 = -1
        this.anIntArray10259 = IntArray(Class132.anInt1905)
        this.anInt10287 = -1000
        this.anInt10291 = -1
        aByte10222 = 0.toByte()
        this.anInt10276 = -1
        this.anInt10289 = -1
        this.aByte10279 = 0.toByte()
        this.anInt10248 = -1
        this.anInt10275 = -1
        this.anIntArray10219 = IntArray(Class132.anInt1905)
        this.anIntArray10303 = IntArray(Class132.anInt1905)
        this.anInt10286 = -1
        this.anInt10283 = -1
        this.aClass182Array10308 = arrayOfNulls<Class182>(12)
        this.anInt10312 = -1
        this.anInt10207 = -32768
        this.anIntArray10304 = IntArray(Class132.anInt1905)
        this.anIntArray10284 = IntArray(Class132.anInt1905)
        this.anInt10223 = -1000
        this.aClass264_10217 = Class264()
        aClass264_10315 = Class264()
        aClass264_10316 = Class264()
        this.aBoolean10318 = false
        this.anIntArray10317 = IntArray(10)
        this.anInt10322 = 0
        this.aBoolean10324 = false
        this.aByteArray10321 = ByteArray(10)
        this.anInt10325 = 0
        this.aClass64Array10323 = arrayOfNulls<Class64>(3)
        this.anInt10319 = 0
        this.anIntArray10320 = IntArray(10)
        this.anInt10326 = 0
    }

    companion object {
        @JvmField
        var anInt10200: Int = 0
        private var aShortArrayArray10204: Array<ShortArray?>?
        @JvmField
        var anInt10205: Int = 0
        @JvmField
        var aClass170_10209: Class170? = null
        @JvmField
        var anInt10212: Int = 0
        @JvmField
        var anInt10214: Int = 0
        @JvmField
        var anInt10216: Int = 0
        @JvmField
        var aBoolean10221: Boolean = false
        @JvmField
        var anInt10228: Int = 0
        @JvmField
        var anInt10233: Int = 0
        @JvmField
        var anInt10235: Int = 0
        @JvmField
        var aBoolean10238: Boolean
        private var aShortArrayArray10246: Array<ShortArray?>? = arrayOf<ShortArray?>(ShortArray(0), ShortArray(0), ShortArray(0), ShortArray(0), ShortArray(0))
        @JvmField
        var anInt10249: Int = 0
        @JvmField
        var anInt10251: Int = 0
        @JvmField
        var aShortArrayArrayArray10253: Array<Array<ShortArray?>?>?
        @JvmField
        var anInt10254: Int = 0
        @JvmField
        var anInt10256: Int = 0
        @JvmField
        var anInt10257: Int = 0
        private var aShortArrayArray10258: Array<ShortArray?>?
        @JvmField
        var anInt10262: Int = 0
        @JvmField
        var anInt10263: Int = 0
        @JvmField
        var anIntArray10266: IntArray? = IntArray(256)
        @JvmField
        var anInt10272: Int = 0
        @JvmField
        var anInt10277: Int = 0
        @JvmField
        var anInt10281: Int = 0
        @JvmField
        var anInt10297: Int = 0
        @JvmField
        var anInt10298: Int = 0
        @JvmField
        var anInt10299: Int = 0
        @JvmField
        var anInt10307: Int = 0
        @JvmField
        var anInt10311: Int = 0
        @JvmField
        var anInt10313: Int = 0
        @JvmStatic
        fun method2420(i: Int, i_0_: Int) {
            if (i_0_ != -1) aBoolean10238 = false
            Class14_Sub3.anInt8628 = i
            anInt10272++
            Class358.aClass60_4417!!.method590(0)
        }

        @JvmStatic
        fun method2429(i: Int) {
            aClass170_10209 = null
            aShortArrayArray10246 = null
            anIntArray10266 = null
            aShortArrayArray10204 = null
            aShortArrayArrayArray10253 = null
            if (i > -101) aShortArrayArray10246 = null
            aShortArrayArray10258 = null
        }

        @JvmStatic
        fun method2431(i: Int, i_56_: Int, class348_sub42_sub13: Class348_Sub42_Sub13?, i_57_: Int, i_58_: Int, i_59_: Int, i_60_: Int, var_ha: ha?, i_61_: Int, i_62_: Int, i_63_: Int, i_64_: Int) {
            var i = i
            try {
                if (i_62_ < 111) aShortArrayArray10246 = null
                if (i_63_ < i_57_ && i_57_ < i_58_ + i_63_ && i_60_ > i_56_ - 13 && i_60_ < 3 + i_56_) i = i_59_
                anInt10212++
                val string = Class348_Sub15.method2812(-44, class348_sub42_sub13!!)
                Class262.aClass324_3326!!.method2567(i_56_, string, 120.toByte(), i, 0, i_63_ - -3, Class341.aClass105Array4234, Class175.anIntArray2330)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("kda.VA(" + i + ',' + i_56_ + ',' + (if (class348_sub42_sub13 != null) "{...}" else "null") + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_61_ + ',' + i_62_ + ',' + i_63_ + ',' + i_64_ + ')'))
            }
        }

        @JvmStatic
        fun method2433() {
            if (Class65.aClass357ArrayArrayArray1148 != null) {
                for (i in Class65.aClass357ArrayArrayArray1148!!.indices) {
                    for (i_80_ in 0..<Class318_Sub7.anInt6451) {
                        for (i_81_ in 0..<Class348_Sub41.anInt7054) {
                            if ((Class65.aClass357ArrayArrayArray1148!![i]!![i_80_]!![i_81_]) != null) Class65.aClass357ArrayArrayArray1148!![i]!![i_80_]!![i_81_]!!.method3485(true)
                            Class65.aClass357ArrayArrayArray1148!![i]!![i_80_]!![i_81_] = null
                        }
                    }
                }
            }
            Class65.aClass357ArrayArrayArray1148 = null
            Class348_Sub1_Sub1.aSArray8801 = null
            if (Class348_Sub31_Sub2.aClass357ArrayArrayArray9082 != null) {
                for (i in Class348_Sub31_Sub2.aClass357ArrayArrayArray9082!!.indices) {
                    for (i_82_ in 0..<Class318_Sub7.anInt6451) {
                        for (i_83_ in 0..<Class348_Sub41.anInt7054) {
                            if ((Class348_Sub31_Sub2.aClass357ArrayArrayArray9082!![i]!![i_82_]!![i_83_]) != null) Class348_Sub31_Sub2.aClass357ArrayArrayArray9082!![i]!![i_82_]!![i_83_]!!.method3485(true)
                            Class348_Sub31_Sub2.aClass357ArrayArrayArray9082!![i]!![i_82_]!![i_83_] = null
                        }
                    }
                }
            }
            Class348_Sub31_Sub2.aClass357ArrayArrayArray9082 = null
            Class332.aSArray4142 = null
            Class147.aClass357ArrayArrayArray2029 = null
            aa_Sub1.aSArray5191 = null
            Class99.aBooleanArrayArray1572 = null
            Class348_Sub8.aBooleanArrayArray6656 = null
            Class171.anIntArray2272 = null
            Class115.aBooleanArrayArrayArray1751 = null
            Class5_Sub2.aBooleanArrayArrayArray8361 = null
            Class274.method2062(89.toByte())
            if (Class24.aClass318_Sub1_Sub3Array357 != null) {
                for (i in 0..<Class86.anInt1477) Class24.aClass318_Sub1_Sub3Array357!![i] = null
                Class86.anInt1477 = 0
            }
            Class348.aClass318_Sub1Array4293 = null
            Class250.aClass318_Sub1Array3226 = null
            Class115.aClass318_Sub1Array1754 = null
            if (Class239_Sub21.aClass318_Sub1Array6066 != null) {
                for (i in Class239_Sub21.aClass318_Sub1Array6066!!.indices) Class239_Sub21.aClass318_Sub1Array6066!![i] = null
                Class5_Sub1_Sub1.anInt9930 = 0
            }
            if (Class291.aClass318_Sub1Array3737 != null) {
                for (i in Class291.aClass318_Sub1Array3737!!.indices) Class291.aClass318_Sub1Array3737!![i] = null
                Class348_Sub42_Sub3.anInt9504 = 0
            }
            if (Class239_Sub14.aClass211Array5993 != null) {
                for (i in 0..<Class331.anInt4135) Class239_Sub14.aClass211Array5993!![i] = null
                for (i in 0..<Class189.anInt2524) {
                    for (i_84_ in 0..<Class318_Sub7.anInt6451) {
                        for (i_85_ in 0..<Class348_Sub41.anInt7054) Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431!![i]!![i_84_]!![i_85_] = 0L
                    }
                }
                Class331.anInt4135 = 0
            }
            Class363.method3513(-120)
            Class71.aClass76_1208 = Class71.aClass76_1210
            Class71.aClass76_1208!!.method775(69.toByte())
            Class348_Sub1_Sub2.aByteArrayArray8816 = null
            Class342.anIntArrayArray4253 = null
            Class239_Sub1.aShortArrayArray5847 = null
            if (Class348_Sub40_Sub34.aClass293Array9432 != null) {
                Class260.method1978()
                Class9.aHa171!!.method3631(1)
                Class9.aHa171!!.method3659(0)
            }
            if (Class319.aClass315Array3982 != null) Class319.aClass315Array3982 = null
            Class9.aHa171 = null
        }

        init {
            aBoolean10238 = false
            aShortArrayArray10258 = (arrayOf<ShortArray?>(
                shortArrayOf(6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545),
                shortArrayOf(8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545),
                shortArrayOf(25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545),
                shortArrayOf(4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545),
                shortArrayOf(4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545)
            ))
            aShortArrayArray10204 = arrayOf<ShortArray?>(ShortArray(0), ShortArray(0), ShortArray(0), ShortArray(0), ShortArray(0))
            aShortArrayArrayArray10253 = arrayOf<Array<ShortArray?>?>(aShortArrayArray10258, aShortArrayArray10204, aShortArrayArray10246)
        }
    }
}
