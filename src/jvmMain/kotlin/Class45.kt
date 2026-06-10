import java.util.*

/* Class45 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class45 internal constructor(class314: Class314, bool: Boolean, i: Int) {
    private var aClass291_629: Class291? = null
    @JvmField
    var anInt634: Int
    private val aBoolean655: Boolean
    private var anObjectArray656: Array<Any?>? = null
    private var aClass314_659: Class314 = class314
    private var anObjectArrayArray664: Array<Array<Any?>?>? = null
    fun method389(i: Int): Int {
        val i_0_ = -117 / ((-60 - i) / 33)
        anInt657++
        check(method399(false)) { "" }
        return aClass291_629!!.anInt3719
    }

    fun method391(string: String?, string_1_: String?, i: Int): ByteArray? {
        var string = string
        var string_1_ = string_1_
        try {
            anInt647++
            if (!method399(false)) return null
            string = string!!.lowercase(Locale.getDefault())
            string_1_ = string_1_!!.lowercase(Locale.getDefault())
            val i_2_ = aClass291_629!!.aClass316_3723!!.method2365(1, Class281.method2108(string, -29286))
            if (!method392(i_2_, (-40).toByte())) return null
            if (i != -29832) method392(22, 12.toByte())
            val i_3_ = (aClass291_629!!.aClass316Array3728!![i_2_]!!.method2365(i xor 0x7486.inv(), Class281.method2108(string_1_, -29286)))
            return method410(-1860, i_2_, i_3_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("in.EA(" + (if (string != null) "{...}" else "null") + ',' + (if (string_1_ != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    private fun method392(i: Int, i_4_: Byte): Boolean {
        anInt646++
        if (!method399(false)) return false
        if (i < 0 || aClass291_629!!.anIntArray3724.size <= i || (aClass291_629!!.anIntArray3724[i] == 0)) {
            require(!Class285.aBoolean4741) { i.toString() }
            return false
        }
        return i_4_.toInt() == -40
    }

    fun method393(i: Int, i_5_: Int, i_6_: Int, `is`: IntArray?): ByteArray? {
        anInt639++
        if (i_6_ != 2) anInt669 = 51
        if (!method418(i_5_, i_6_ + -2, i)) return null
        if (anObjectArrayArray664!![i] == null || anObjectArrayArray664!![i]!![i_5_] == null) {
            var bool = method394(i_5_, (-78).toByte(), `is`, i)
            if (!bool) {
                method406(i, -117)
                bool = method394(i_5_, (-103).toByte(), `is`, i)
                if (!bool) return null
            }
        }
        val is_7_ = Class50_Sub1.method461(false, anObjectArrayArray664!![i]!![i_5_], 53146732)
        if (this.anInt634 == 1) {
            anObjectArrayArray664!![i]!![i_5_] = null
            if (aClass291_629!!.anIntArray3724[i] == 1) anObjectArrayArray664!![i] = null
        } else if (this.anInt634 == 2) anObjectArrayArray664!![i] = null
        return is_7_
    }

    private fun method394(i: Int, i_8_: Byte, `is`: IntArray?, i_9_: Int): Boolean {
        anInt628++
        if (!method392(i_9_, (-40).toByte())) return false
        if (anObjectArray656!![i_9_] == null) return false
        val i_10_ = aClass291_629!!.anIntArray3725[i_9_]
        val is_11_ = aClass291_629!!.anIntArrayArray3721[i_9_]
        if (anObjectArrayArray664!![i_9_] == null) anObjectArrayArray664!![i_9_] = arrayOfNulls<Any>(aClass291_629!!.anIntArray3724[i_9_])
        val objects = anObjectArrayArray664!![i_9_]!!
        var bool = true
        var i_12_ = 0
        while (i_10_ > i_12_) {
            val i_13_: Int
            if (is_11_ == null) i_13_ = i_12_
            else i_13_ = is_11_[i_12_]
            if (objects[i_13_] == null) {
                bool = false
                break
            }
            i_12_++
        }
        if (bool) return true
        val is_14_: ByteArray
        if (`is` == null || (`is`[0] == 0 && `is`[1] == 0 && `is`[2] == 0 && `is`[3] == 0)) is_14_ = Class50_Sub1.method461(false, anObjectArray656!![i_9_], 53146732)!!
        else {
            is_14_ = Class50_Sub1.method461(true, anObjectArray656!![i_9_], 53146732)!!
            val class348_sub49 = Class348_Sub49(is_14_)
            class348_sub49.method3367(607818341, `is`, 5, (class348_sub49.aByteArray7154)!!.size)
        }
        val is_15_: ByteArray?
        try {
            is_15_ = Class348_Sub41.method3158(is_14_, -120)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("T3 - " + (`is` != null) + "," + i_9_ + "," + is_14_.size + "," + Class59_Sub1.method554(5126, is_14_.size, is_14_) + "," + Class59_Sub1.method554(5126, -2 + is_14_.size, is_14_) + "," + aClass291_629!!.anIntArray3729[i_9_] + "," + aClass291_629!!.anInt3719))
        }
        if (aBoolean655) anObjectArray656!![i_9_] = null
        if (i_8_ >= -17) method415(70.toByte(), -7)
        if (i_10_ > 1) {
            if (this.anInt634 == 2) {
                var i_30_ = is_15_.size
                val i_31_ = 0xff and is_15_[--i_30_].toInt()
                i_30_ -= 4 * (i_31_ * i_10_)
                val class348_sub49 = Class348_Sub49(is_15_)
                var i_32_ = 0
                var i_33_ = 0
                class348_sub49.anInt7197 = i_30_
                for (i_34_ in 0..<i_31_) {
                    var i_35_ = 0
                    for (i_36_ in 0..<i_10_) {
                        i_35_ += class348_sub49.readInt((-126).toByte())
                        val i_37_: Int
                        if (is_11_ == null) i_37_ = i_36_
                        else i_37_ = is_11_[i_36_]
                        if (i == i_37_) {
                            i_33_ = i_37_
                            i_32_ += i_35_
                        }
                    }
                }
                if (i_32_ == 0) return true
                val is_38_ = ByteArray(i_32_)
                class348_sub49.anInt7197 = i_30_
                i_32_ = 0
                var i_39_ = 0
                for (i_40_ in 0..<i_31_) {
                    var i_41_ = 0
                    for (i_42_ in 0..<i_10_) {
                        i_41_ += class348_sub49.readInt((-126).toByte())
                        val i_43_: Int
                        if (is_11_ != null) i_43_ = is_11_[i_42_]
                        else i_43_ = i_42_
                        if (i_43_ == i) {
                            Class214.method1577(is_15_, i_39_, is_38_, i_32_, i_41_)
                            i_32_ += i_41_
                        }
                        i_39_ += i_41_
                    }
                }
                objects[i_33_] = is_38_
            } else {
                var i_16_ = is_15_.size
                val i_17_ = 0xff and is_15_[--i_16_].toInt()
                i_16_ -= 4 * (i_10_ * i_17_)
                val class348_sub49 = Class348_Sub49(is_15_)
                val is_18_ = IntArray(i_10_)
                class348_sub49.anInt7197 = i_16_
                for (i_19_ in 0..<i_17_) {
                    var i_20_ = 0
                    for (i_21_ in 0..<i_10_) {
                        i_20_ += class348_sub49.readInt((-126).toByte())
                        is_18_[i_21_] += i_20_
                    }
                }
                val is_22_ = arrayOfNulls<ByteArray>(i_10_)
                var i_23_ = 0
                while (i_10_ > i_23_) {
                    is_22_[i_23_] = ByteArray(is_18_[i_23_])
                    is_18_[i_23_] = 0
                    i_23_++
                }
                class348_sub49.anInt7197 = i_16_
                var i_24_ = 0
                for (i_25_ in 0..<i_17_) {
                    var i_26_ = 0
                    var i_27_ = 0
                    while (i_10_ > i_27_) {
                        i_26_ += class348_sub49.readInt((-126).toByte())
                        Class214.method1577(is_15_, i_24_, is_22_[i_27_]!!, is_18_[i_27_], i_26_)
                        i_24_ += i_26_
                        is_18_[i_27_] += i_26_
                        i_27_++
                    }
                }
                var i_28_ = 0
                while (i_10_ > i_28_) {
                    val i_29_: Int
                    if (is_11_ == null) i_29_ = i_28_
                    else i_29_ = is_11_[i_28_]
                    if (this.anInt634 != 0) objects[i_29_] = is_22_[i_28_]
                    else objects[i_29_] = Class179.method1357(is_22_[i_28_], false, 126.toByte())
                    i_28_++
                }
            }
        } else {
            val i_44_: Int
            if (is_11_ != null) i_44_ = is_11_[0]
            else i_44_ = 0
            if (this.anInt634 != 0) objects[i_44_] = is_15_
            else objects[i_44_] = Class179.method1357(is_15_, false, 104.toByte())
        }
        return true
    }

    fun method396(i: Int, i_45_: Int): IntArray? {
        anInt640++
        if (i_45_ != 0) method389(-55)
        if (!method392(i, (-40).toByte())) return null
        var `is` = aClass291_629!!.anIntArrayArray3721[i]
        if (`is` == null) {
            `is` = IntArray(aClass291_629!!.anIntArray3725[i])
            for (i_46_ in `is`.indices) `is`[i_46_] = i_46_
        }
        return `is`
    }

    fun method397(string: String, i: Int): Int {
        var string = string
        anInt633++
        if (!method399(false)) return 0
        string = string.lowercase(Locale.getDefault())
        val i_47_ = aClass291_629!!.aClass316_3723!!.method2365(1, Class281.method2108(string, i xor 0x7265.inv()))
        return method419(i, i_47_)
    }

    fun method398(i: Byte): Int {
        anInt641++
        if (!method399(false)) return 0
        var i_48_ = 0
        var i_49_ = 0
        var i_50_ = 0
        if (i.toInt() != -31) return 50
        while ( /**/anObjectArray656!!.size > i_50_) {
            if (aClass291_629!!.anIntArray3725[i_50_] > 0) {
                i_49_ += method419(0, i_50_)
                i_48_ += 100
            }
            i_50_++
        }
        if (i_48_ == 0) return 100
        val i_51_ = i_49_ * 100 / i_48_
        return i_51_
    }

    private fun method399(bool: Boolean): Boolean {
        anInt652++
        if (aClass291_629 == null) {
            aClass291_629 = aClass314_659!!.method2340(56.toByte())
            if (aClass291_629 == null) return false
            anObjectArray656 = arrayOfNulls<Any>(aClass291_629!!.anInt3734)
            anObjectArrayArray664 = arrayOfNulls<Array<Any?>>(aClass291_629!!.anInt3734)
        }
        return true
    }

    fun method400(i: Int, string: String): Boolean {
        var string = string
        anInt635++
        if (!method399(false)) return false
        if (i != -18308) return false
        string = string.lowercase(Locale.getDefault())
        val i_52_ = aClass291_629!!.aClass316_3723!!.method2365(1, Class281.method2108(string, -29286))
        return i_52_ >= 0
    }

    fun method401(i: Int): Boolean {
        anInt648++
        if (!method399(false)) return false
        var bool = true
        var i_53_ = 0
        while ((i_53_ < aClass291_629!!.anIntArray3738.size)) {
            val i_54_ = aClass291_629!!.anIntArray3738[i_53_]
            if (anObjectArray656!![i_54_] == null) {
                method406(i_54_, -128)
                if (anObjectArray656!![i_54_] == null) bool = false
            }
            i_53_++
        }
        if (i < 33) method407(100, -92)
        return bool
    }

    private fun method402(i: Byte, i_55_: Int) {
        anInt658++
        if (i < -70) aClass314_659!!.method2338((-52).toByte(), i_55_)
    }

    private fun method403(string: String?, i: Int, string_56_: String?): Boolean {
        var string = string
        var string_56_ = string_56_
        try {
            anInt626++
            if (!method399(false)) return false
            string = string!!.lowercase(Locale.getDefault())
            string_56_ = string_56_!!.lowercase(Locale.getDefault())
            val i_57_ = (aClass291_629!!.aClass316_3723!!.method2365(i xor 0x1c1a, Class281.method2108(string, -29286)))
            if (i != 7195) method403(null, -20, null)
            if (!method392(i_57_, (-40).toByte())) return false
            val i_58_ = aClass291_629!!.aClass316Array3728!![i_57_]!!.method2365(1, Class281.method2108(string_56_, -29286))
            return method420(i + -17694, i_57_, i_58_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("in.Q(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + (if (string_56_ != null) "{...}" else "null") + ')'))
        }
    }

    fun method404(i: Int, bool: Boolean, bool_59_: Boolean) {
        anInt644++
        if (i != 0) method391(null, null, -3)
        if (method399(false)) {
            if (bool_59_) {
                aClass291_629!!.anIntArray3733 = null
                aClass291_629!!.aClass316_3723 = null
            }
            if (bool) {
                aClass291_629!!.anIntArrayArray3735 = null
                aClass291_629!!.aClass316Array3728 = null
            }
        }
    }

    fun method405(i: Int) {
        anInt650++
        if (i != 0) method416((-45).toByte(), null)
        if (anObjectArray656 != null) {
            for (i_60_ in anObjectArray656!!.indices) anObjectArray656!![i_60_] = null
        }
    }

    private fun method406(i: Int, i_61_: Int) {
        if (i_61_ > -105) anObjectArrayArray664 = null
        if (!aBoolean655) anObjectArray656!![i] = Class179.method1357(aClass314_659!!.method2339(i, 73.toByte()), false, 123.toByte())
        else anObjectArray656!![i] = aClass314_659!!.method2339(i, 12.toByte())
        anInt665++
    }

    fun method407(i: Int, i_62_: Int): Int {
        if (i != 0) method389(-61)
        anInt645++
        if (!method392(i_62_, (-40).toByte())) return 0
        return aClass291_629!!.anIntArray3724[i_62_]
    }

    fun method408(i: Byte, i_63_: Int): Boolean {
        anInt632++
        if (!method392(i_63_, (-40).toByte())) return false
        if (anObjectArray656!![i_63_] != null) return true
        method406(i_63_, -124)
        if (anObjectArray656!![i_63_] != null) return true
        if (i > -112) this.anInt634 = -26
        return false
    }

    fun method409(string: String, bool: Boolean) {
        var string = string
        anInt663++
        if (bool == true && method399(false)) {
            string = string.lowercase(Locale.getDefault())
            val i = aClass291_629!!.aClass316_3723!!.method2365(1, Class281.method2108(string, -29286))
            method402((-86).toByte(), i)
        }
    }

    fun method410(i: Int, i_64_: Int, i_65_: Int): ByteArray? {
        if (i != -1860) anObjectArrayArray664 = null
        anInt651++
        return method393(i_64_, i_65_, i xor 0x741.inv(), null)
    }

    fun method411(i: Int, i_66_: Int) {
        anInt627++
        if (i_66_ > -9) method394(-111, (-98).toByte(), null, -71)
        if (method392(i, (-40).toByte())) {
            if (anObjectArrayArray664 != null) anObjectArrayArray664!![i] = null
        }
    }

    fun method412(i: Byte) {
        if (anObjectArrayArray664 != null) {
            var i_67_ = 0
            while (anObjectArrayArray664!!.size > i_67_) {
                anObjectArrayArray664!![i_67_] = null
                i_67_++
            }
        }
        val i_68_ = 52 % ((-46 - i) / 62)
        anInt660++
    }

    fun method413(i: Int, string: String): Boolean {
        var string = string
        anInt636++
        if (!method399(false)) return false
        string = string.lowercase(Locale.getDefault())
        val i_69_ = aClass291_629!!.aClass316_3723!!.method2365(i + -99, Class281.method2108(string, -29286))
        if (i != 100) aFloat670 = 0.37849286f
        return method408((-120).toByte(), i_69_)
    }

    fun method414(i: Int): Int {
        anInt637++
        if (i != -1) return 49
        if (!method399(false)) return -1
        return aClass291_629!!.anIntArray3724.size
    }

    fun method415(i: Byte, i_70_: Int): ByteArray? {
        anInt630++
        if (!method399(false)) return null
        if (aClass291_629!!.anIntArray3724.size == 1) return method410(i.toInt() xor 0x70a.inv(), 0, i_70_)
        if (!method392(i_70_, (-40).toByte())) return null
        if (i.toInt() != 73) anObjectArrayArray664 = null
        if (aClass291_629!!.anIntArray3724[i_70_] == 1) return method410(i.toInt() xor 0x70a.inv(), i_70_, 0)
        throw RuntimeException()
    }

    fun method416(i: Byte, string: String?): Boolean {
        anInt631++
        val i_71_ = method417("", i + 74)
        if (i_71_ != -1) return method403("", 7195, string)
        if (i.toInt() != -74) return false
        return method403(string, 7195, "")
    }

    fun method417(string: String, i: Int): Int {
        var string = string
        if (i != 0) return 113
        anInt654++
        if (!method399(false)) return -1
        string = string.lowercase(Locale.getDefault())
        val i_72_ = aClass291_629!!.aClass316_3723!!.method2365(1, Class281.method2108(string, -29286))
        if (!method392(i_72_, (-40).toByte())) return -1
        return i_72_
    }

    private fun method418(i: Int, i_73_: Int, i_74_: Int): Boolean {
        anInt662++
        if (!method399(false)) return false
        if (i_74_ < i_73_ || i < 0 || (aClass291_629!!.anIntArray3724.size <= i_74_) || (aClass291_629!!.anIntArray3724[i_74_] <= i)) {
            require(!Class285.aBoolean4741) { i_74_.toString() + "," + i }
            return false
        }
        return true
    }

    private fun method419(i: Int, i_75_: Int): Int {
        if (i != 0) return -117
        anInt653++
        if (!method392(i_75_, (-40).toByte())) return 0
        if (anObjectArray656!![i_75_] != null) return 100
        return aClass314_659!!.method2335(i_75_, i + -22197)
    }

    fun method420(i: Int, i_76_: Int, i_77_: Int): Boolean {
        anInt638++
        if (!method418(i_77_, 0, i_76_)) return false
        if (anObjectArrayArray664!![i_76_] != null && anObjectArrayArray664!![i_76_]!![i_77_] != null) return true
        if (i != -10499) return true
        if (anObjectArray656!![i_76_] != null) return true
        method406(i_76_, -125)
        return anObjectArray656!![i_76_] != null
    }

    fun method421(bool: Boolean, i: Int): Boolean {
        anInt661++
        if (!method399(bool)) return false
        if (aClass291_629!!.anIntArray3724.size == 1) return method420(-10499, 0, i)
        if (!method392(i, (-40).toByte())) return false
        if (aClass291_629!!.anIntArray3724[i] == 1) return method420(-10499, i, 0)
        if (bool != false) return false
        throw RuntimeException()
    }

    fun method422(string: String?, string_78_: String?, i: Int): Boolean {
        var string = string
        var string_78_ = string_78_
        try {
            anInt668++
            if (!method399(false)) return false
            string_78_ = string_78_!!.lowercase(Locale.getDefault())
            if (i > -18) anInt669 = 40
            string = string!!.lowercase(Locale.getDefault())
            val i_79_ = aClass291_629!!.aClass316_3723!!.method2365(1, Class281.method2108(string_78_, -29286))
            if (i_79_ < 0) return false
            val i_80_ = aClass291_629!!.aClass316Array3728!![i_79_]!!.method2365(1, Class281.method2108(string, -29286))
            return i_80_ >= 0
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("in.M(" + (if (string != null) "{...}" else "null") + ',' + (if (string_78_ != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    fun method423(i: Int, i_81_: Byte): Int {
        anInt649++
        if (!method399(false)) return -1
        val i_82_ = aClass291_629!!.aClass316_3723!!.method2365(1, i)
        if (!method392(i_82_, (-40).toByte())) return -1
        val i_83_ = -60 / ((i_81_ - -4) / 56)
        return i_82_
    }

    init {
        require(!(i < 0 || i > 2)) { "js5: Invalid value " + i + " supplied for discardunpacked" }
        aBoolean655 = bool
        this.anInt634 = i
    }

    companion object {
        @JvmField
        var anInt626: Int = 0
        @JvmField
        var anInt627: Int = 0
        @JvmField
        var anInt628: Int = 0
        @JvmField
        var anInt630: Int = 0
        @JvmField
        var anInt631: Int = 0
        @JvmField
        var anInt632: Int = 0
        @JvmField
        var anInt633: Int = 0
        @JvmField
        var anInt635: Int = 0
        @JvmField
        var anInt636: Int = 0
        @JvmField
        var anInt637: Int = 0
        @JvmField
        var anInt638: Int = 0
        @JvmField
        var anInt639: Int = 0
        @JvmField
        var anInt640: Int = 0
        @JvmField
        var anInt641: Int = 0
        @JvmField
        var anInt642: Int = 0
        @JvmField
        var aClass351_643: Class351? = Class351(3, -1)
        @JvmField
        var anInt644: Int = 0
        @JvmField
        var anInt645: Int = 0
        @JvmField
        var anInt646: Int = 0
        @JvmField
        var anInt647: Int = 0
        @JvmField
        var anInt648: Int = 0
        @JvmField
        var anInt649: Int = 0
        @JvmField
        var anInt650: Int = 0
        @JvmField
        var anInt651: Int = 0
        @JvmField
        var anInt652: Int = 0
        @JvmField
        var anInt653: Int = 0
        @JvmField
        var anInt654: Int = 0
        @JvmField
        var anInt657: Int = 0
        @JvmField
        var anInt658: Int = 0
        @JvmField
        var anInt660: Int = 0
        @JvmField
        var anInt661: Int = 0
        @JvmField
        var anInt662: Int = 0
        @JvmField
        var anInt663: Int = 0
        @JvmField
        var anInt665: Int = 0
        @JvmField
        var anInt666: Int
        @JvmField
        var aLong667: Long = 0
        @JvmField
        var anInt668: Int = 0
        @JvmField
        var anInt669: Int = 0
        @JvmField
        var aFloat670: Float = 0f

        @JvmStatic
        fun method390(i: Byte) {
            aClass351_643 = null
            if (i.toInt() != 10) Companion.method390((-3).toByte())
        }

        @JvmStatic
        @Throws(Exception_Sub1::class)
        fun method395(i: Int) {
            if (Class348_Sub49.anInt7207 == 1) Class21.aHa326!!.method3626(Class339.anInt4211, Class348_Sub40_Sub8.anInt9157)
            else Class21.aHa326!!.method3626(0, 0)
            if (i >= 73) anInt642++
        }

        init {
            anInt666 = 100
        }
    }
}
