import Class130.Companion.method1130
import Class169.Companion.method1301

/* Class235 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class235 internal constructor(var_ha: ha?, class51: Class51?, i: Int, i_15_: Int, i_16_: Int, i_17_: Int, class318_sub1: Class318_Sub1?, bool: Boolean, i_18_: Int) {
    private val aClass318_Sub1_3051: Class318_Sub1?
    @JvmField
    var anInt3052: Int = 0
    private var anInt3053: Int
    private var anInt3054 = 0
    private var anInt3055 = 0
    private var anInt3056: Int
    private var aClass17_3057: Class17? = null
    private var aClass64_3059: Class64? = null
    private var anInt3060 = 0
    @JvmField
    var anInt3063: Int = 0
    private var aBoolean3064 = false
    private val aBoolean3065: Boolean
    private val aByte3067: Byte
    private var aBoolean3069 = false
    private var aR3071: r? = null
    private var aBooleanArray3072: BooleanArray? = null
    private var anInt3073: Int
    private var anInt3074 = 0
    @JvmField
    var anInt3079: Int = 0
    @JvmField
    var aClass318_Sub10_3081: Class318_Sub10? = null
    private var anInt3083 = 0
    private var anInt3084 = 0
    private val aByte3085: Byte
    fun method1663(i: Int): Int {
        if (i < 31) return 48
        anInt3087++
        return anInt3060
    }

    fun method1664(i: Int): Int {
        if (i > -20) finalize()
        anInt3076++
        return anInt3055
    }

    fun method1665(i: Int): Boolean {
        if (i != 2) anInt3056 = -73
        anInt3070++
        return aBoolean3065
    }

    private fun method1666(i: Byte, i_0_: Int) {
        anInt3077++
        if (i.toInt() != 69) aClass64_3059 = null
        var i_1_ = i_0_
        var bool = false
        if (i_1_ == -1) {
            var class51: Class51? = Class348_Sub40_Sub12.aClass263_9195!!.method2005(i.toInt() xor 0x45, this.anInt3063)
            var class51_2_ = class51
            if (class51!!.anIntArray945 != null) class51 = class51.method480((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), 47.toByte())
            if (class51 == null) return
            if (class51_2_ == class51) class51_2_ = null
            if (class51.anIntArray943 == null) {
                if (class51.anInt868 != -1) {
                    if (anInt3053 != class51.anInt941) {
                        i_1_ = class51.anInt868
                        bool = class51.aBoolean924
                    }
                } else if (class51_2_ != null && class51_2_.anIntArray943 != null) {
                    if (aClass17_3057 != null && class51_2_.method481(105.toByte(), (aClass17_3057!!.anInt269))) return
                    i_1_ = class51_2_.method489(i.toInt() xor 0x45.inv())
                    if (anInt3053 != class51_2_.anInt941) bool = class51_2_.aBoolean924
                } else if (class51_2_ != null && (class51_2_.anInt868 != -1) && (anInt3053 != class51_2_.anInt941)) {
                    bool = class51_2_.aBoolean924
                    i_1_ = class51_2_.anInt868
                }
            } else {
                if (aClass17_3057 != null && class51.method481(73.toByte(), aClass17_3057!!.anInt269)) return
                i_1_ = class51.method489(i + -70)
                if (anInt3053 != class51.anInt941) bool = class51.aBoolean924
            }
        }
        if (i_1_ == -1) aClass17_3057 = null
        else {
            aClass64_3059 = null
            if (aClass17_3057 != null && i_1_ == aClass17_3057!!.anInt269) {
                if (aClass17_3057!!.anInt248 == 0) return
            } else aClass17_3057 = Class10.aClass87_191!!.method835(i_1_, i + -62)
            if (aClass17_3057!!.anIntArray237 == null) aClass17_3057 = null
            else {
                if (bool) {
                    anInt3084 = ((aClass17_3057!!.anIntArray237).size.toDouble() * Math.random()).toInt()
                    anInt3054 = 1 + ((aClass17_3057!!.anIntArray267!![anInt3084]).toDouble() * Math.random()).toInt()
                } else {
                    anInt3084 = 0
                    anInt3054 = 1
                }
                anInt3083 = anInt3084 - -1
                if (anInt3083 < 0 || anInt3083 >= aClass17_3057!!.anIntArray237.size) anInt3083 = -1
                anInt3074 = -anInt3054 + Class367_Sub11.anInt7396
            }
        }
    }

    fun method1667(i: Byte, var_ha: ha?) {
        anInt3061++
        method1668(true, true, i + -244, 262144, var_ha)
        if (i.toInt() != 116) this.anInt3063 = 99
    }

    fun method1668(bool: Boolean, bool_3_: Boolean, i: Int, i_4_: Int, var_ha: ha?): Class64? {
        var bool_3_ = bool_3_
        var i_4_ = i_4_
        anInt3082++
        var class51: Class51? = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, this.anInt3063)
        if (class51!!.anIntArray945 != null) class51 = class51.method480(Class318_Sub1_Sub3_Sub3.aClass170_10209!!, 47.toByte())
        if (class51 == null) {
            method1674(-1, var_ha)
            anInt3073 = -1
            anInt3056 = -1
            anInt3053 = -1
            return null
        }
        if (!aBoolean3064 && class51.anInt941 != anInt3053) {
            aClass64_3059 = null
            method1666(69.toByte(), -1)
        }
        method1672(aClass318_Sub1_3051, true)
        if (bool_3_) {
            bool_3_ = bool_3_ and (aBoolean3065 and (Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350) != 0))
            bool_3_ = (bool_3_ and (class51.anInt941 != anInt3056 || (aClass17_3057 != null && Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350) >= 2 && (anInt3084 != anInt3073 || ((aClass17_3057!!.aBoolean254 || Class28.aBoolean5002) && (anInt3083 != anInt3084))))))
        }
        if (bool && !bool_3_) {
            anInt3053 = class51.anInt941
            return null
        }
        if (bool_3_) {
            method1301(aR3071, aByte3067.toInt(), (aClass318_Sub1_3051!!.x), (aClass318_Sub1_3051.y), aBooleanArray3072)
            anInt3056 = -1
            anInt3073 = -1
        }
        if (i > -126) return null
        val var_s = aa_Sub1.aSArray5191!![aByte3067.toInt()]
        val var_s_5_: s?
        if (!aBoolean3069) var_s_5_ = if (aByte3067 >= 3) null else aa_Sub1.aSArray5191!![1 + aByte3067]
        else var_s_5_ = Class348_Sub1_Sub1.aSArray8801!![0]
        var class64: Class64? = null
        if (aClass17_3057 == null) {
            if (aClass64_3059 == null || i_4_ != (i_4_ and aClass64_3059!!.ua()) || (anInt3053 != class51.anInt941)) {
                if (aClass64_3059 != null) i_4_ = i_4_ or aClass64_3059!!.ua()
                val class2 = (class51.method476(var_ha, var_s_5_, (if (this.anInt3079 != 11) this.anInt3079 else 10), i_4_, aClass318_Sub1_3051!!.x, bool_3_, var_s, var_s!!.method3986((aClass318_Sub1_3051.x), (aClass318_Sub1_3051.y), (-114).toByte()), aClass318_Sub1_3051.y, (if (this.anInt3079 == 11) 4 + this.anInt3052 else this.anInt3052), 128))
                if (class2 == null) {
                    anInt3055 = 0
                    aBooleanArray3072 = null
                    aR3071 = null
                    anInt3060 = 0
                    aClass64_3059 = null
                } else {
                    class64 = class2.aClass64_119
                    aClass64_3059 = class64
                    if (bool_3_) {
                        aBooleanArray3072 = null
                        aR3071 = class2.aR118
                        method1130(aR3071, aByte3067.toInt(), aClass318_Sub1_3051.x, aClass318_Sub1_3051.y, null)
                        anInt3073 = -1
                        anInt3056 = class51.anInt941
                    }
                    anInt3060 = class64!!.fa()
                    anInt3055 = class64.ma()
                }
            } else class64 = aClass64_3059
        } else {
            if (bool_3_) i_4_ = i_4_ or 0x40000
            class64 = (class51.method483(anInt3083, anInt3054, (if (this.anInt3079 == 11) 10 else this.anInt3079), var_s!!.method3986((aClass318_Sub1_3051!!.x), (aClass318_Sub1_3051.y), (-2).toByte()), var_ha, (if (this.anInt3079 == 11) this.anInt3052 + 4 else this.anInt3052), i_4_, 76.toByte(), var_s_5_, aClass318_Sub1_3051.y, anInt3084, aClass318_Sub1_3051.x, aClass17_3057, var_s))
            if (class64 == null) {
                anInt3055 = 0
                aBooleanArray3072 = null
                anInt3060 = 0
                aR3071 = null
            } else {
                if (bool_3_) {
                    if (aBooleanArray3072 == null) aBooleanArray3072 = BooleanArray(4)
                    aR3071 = class64.ba(aR3071)
                    method1130(aR3071, aByte3067.toInt(), (aClass318_Sub1_3051.x), (aClass318_Sub1_3051.y), aBooleanArray3072)
                    anInt3073 = anInt3084
                    anInt3056 = class51.anInt941
                }
                anInt3060 = class64.fa()
                anInt3055 = class64.ma()
            }
            aClass64_3059 = null
        }
        anInt3053 = class51.anInt941
        return class64
    }

    fun method1670(i: Int, class101: Class101?, i_7_: Int, var_ha: ha?, i_8_: Int, class64: Class64?, bool: Boolean, i_9_: Byte, i_10_: Int) {
        do {
            try {
                anInt3058++
                if (i_9_.toInt() != -73) this.anInt3052 = 62
                val class129s = class64!!.method619()
                val class342s = class64.method604()
                if ((this.aClass318_Sub10_3081 == null || this.aClass318_Sub10_3081!!.aBoolean6470) && (class129s != null || class342s != null)) {
                    var class51: Class51? = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, this.anInt3063)
                    if (class51!!.anIntArray945 != null) class51 = class51.method480((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), 47.toByte())
                    if (class51 != null) this.aClass318_Sub10_3081 = Class318_Sub10.method2526(Class367_Sub11.anInt7396, true)
                }
                if (this.aClass318_Sub10_3081 == null) break
                class64.method620(class101)
                if (bool) this.aClass318_Sub10_3081!!.method2536(var_ha, Class367_Sub11.anInt7396.toLong(), class129s, class342s, false)
                else this.aClass318_Sub10_3081!!.method2540(Class367_Sub11.anInt7396.toLong())
                this.aClass318_Sub10_3081!!.method2533(aByte3085.toInt(), i_8_, i, i_10_, i_7_)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("bv.E(" + i + ',' + (if (class101 != null) "{...}" else "null") + ',' + i_7_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_8_ + ',' + (if (class64 != null) "{...}" else "null") + ',' + bool + ',' + i_9_ + ',' + i_10_ + ')'))
            }
            break
        } while (false)
    }

    fun method1671(i: Int, i_11_: Int) {
        aBoolean3064 = true
        anInt3078++
        method1666(69.toByte(), i_11_)
        if (i != 262144) aClass78_3075 = null
    }

    protected fun finalize() {
        anInt3080++
        if (this.aClass318_Sub10_3081 != null) this.aClass318_Sub10_3081!!.method2534()
    }

    private fun method1672(class318_sub1: Class318_Sub1?, bool: Boolean) {
        if (bool != true) method1674(-55, null)
        anInt3086++
        var i: Int
        while_76_@ while (true) {
            if (aClass17_3057 == null) {
                if (aBoolean3064) return
                method1666(69.toByte(), -1)
                if (aClass17_3057 == null) return
            }
            i = -anInt3074 + Class367_Sub11.anInt7396
            if (i > 100 && aClass17_3057!!.anInt238 > 0) {
                val i_12_: Int
                i_12_ = (-aClass17_3057!!.anInt238 + aClass17_3057!!.anIntArray237.size)
                while ((anInt3084 < i_12_ && (aClass17_3057!!.anIntArray267!![anInt3084] < i))) {
                    i -= aClass17_3057!!.anIntArray267!![anInt3084]
                    anInt3084++
                }
                if (i_12_ <= anInt3084) {
                    var i_13_ = 0
                    var i_14_ = i_12_
                    while ((aClass17_3057!!.anIntArray237.size > i_14_)) {
                        i_13_ += aClass17_3057!!.anIntArray267!![i_14_]
                        i_14_++
                    }
                    i %= i_13_
                }
                anInt3083 = 1 + anInt3084
                if (anInt3083 >= aClass17_3057!!.anIntArray237.size) {
                    anInt3083 -= aClass17_3057!!.anInt238
                    if (anInt3083 < 0 || anInt3083 >= aClass17_3057!!.anIntArray237.size) anInt3083 = -1
                }
            }
            while (true) {
                if (aClass17_3057!!.anIntArray267!![anInt3084] >= i) break@while_76_
                Class287.method2178(class318_sub1, anInt3084, aClass17_3057, -99)
                i -= aClass17_3057!!.anIntArray267!![anInt3084]
                anInt3084++
                if (aClass17_3057!!.anIntArray237.size <= anInt3084) {
                    anInt3084 -= aClass17_3057!!.anInt238
                    if (anInt3084 < 0 || anInt3084 >= aClass17_3057!!.anIntArray237.size) {
                        aClass17_3057 = null
                        break
                    }
                }
                anInt3083 = anInt3084 + 1
                if (aClass17_3057!!.anIntArray237.size <= anInt3083) {
                    anInt3083 -= aClass17_3057!!.anInt238
                    if (anInt3083 < 0 || (anInt3083 >= aClass17_3057!!.anIntArray237.size)) anInt3083 = -1
                }
            }
        }
        anInt3054 = i
        anInt3074 = -i + Class367_Sub11.anInt7396
    }

    init {
        anInt3053 = -1
        anInt3056 = -1
        anInt3073 = -1
        try {
            this.anInt3079 = i
            this.anInt3063 = class51!!.anInt941
            aClass318_Sub1_3051 = class318_sub1
            aByte3085 = i_16_.toByte()
            aByte3067 = i_17_.toByte()
            aBoolean3069 = bool
            this.anInt3052 = i_15_
            aBoolean3065 = (var_ha!!.method3682() && class51.aBoolean894 && !aBoolean3069)
            if (i_18_ != -1) aBoolean3064 = true
            method1666(69.toByte(), i_18_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bv.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class51 != null) "{...}" else "null") + ',' + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + bool + ',' + i_18_ + ')'))
        }
    }

    fun method1674(i: Int, var_ha: ha?) {
        if (i != -1) aBoolean3064 = false
        if (aR3071 != null) {
            method1301(aR3071, aByte3067.toInt(), (aClass318_Sub1_3051!!.x), (aClass318_Sub1_3051.y), aBooleanArray3072)
            aR3071 = null
            aBooleanArray3072 = null
        }
        anInt3050++
    }

    companion object {
        var anInt3050: Int = 0
        var anInt3058: Int = 0
        var anInt3061: Int = 0
        @JvmField
        var anInt3062: Int = 0
        var anInt3066: Int = 0
        var anIntArray3068: IntArray? = null
        var anInt3070: Int = 0
        @JvmField
        var aClass78_3075: Class78? = null
        var anInt3076: Int = 0
        var anInt3077: Int = 0
        var anInt3078: Int = 0
        var anInt3080: Int = 0
        var anInt3082: Int = 0
        var anInt3086: Int = 0
        var anInt3087: Int = 0

        fun method1669(i: Int, i_6_: Int): String {
            if (i != -19918) method1669(75, 33)
            anInt3066++
            return ((0xff and (i_6_ shr 24)).toString() + "." + ((i_6_ and 0xffb428) shr 16) + "." + (i_6_ shr 8 and 0xff) + "." + (i_6_ and 0xff))
        }

        @JvmStatic
        fun method1673(i: Int) {
            aClass78_3075 = null
            anIntArray3068 = null
            if (i >= -19) method1669(-110, -13)
        }
    }
}
