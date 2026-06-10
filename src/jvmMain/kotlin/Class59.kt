import java.io.File
import java.util.*
import kotlin.math.atan2
import kotlin.math.pow

abstract class Class59(i: Int, i_73_: Int, i_74_: Int, i_75_: Int, i_76_: Int) {
    private var aShortArray1069: ShortArray? = null
    @JvmField
    var anInt1071: Int = 4
    private var anInt1074 = 4
    private var anInt1078 = 4
    private var anInt1079 = 4
    private var anInt1081 = 0
    private val aShortArray1082: ShortArray
    private fun method539(i: Int) {
        anInt1070++
        val random = Random(anInt1081.toLong())
        for (i_0_ in 0..254) aShortArray1082[i_0_] = i_0_.toShort()
        for (i_1_ in 0..254) {
            val i_2_ = -i_1_ + 255
            val i_3_ = Class124.method1097(106.toByte(), i_2_, random)
            val i_4_ = aShortArray1082[i_3_]
            aShortArray1082[i_3_] = aShortArray1082[i_2_]
            aShortArray1082[256 + i_2_] = i_4_
            aShortArray1082[i_2_] = aShortArray1082[256 + i_2_]
        }
        if (i <= 6) this.anInt1071 = -11
    }

    private fun method540(i: Int) {
        aShortArray1069 = ShortArray(this.anInt1071)
        anInt1072++
        var i_5_ = i
        while (this.anInt1071 > i_5_) {
            aShortArray1069!![i_5_] = 2.0.pow(i_5_.toDouble()).toInt().toShort()
            i_5_++
        }
    }

    abstract fun method541(i: Int)

    fun method542(i: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
        anInt1073++
        val `is` = IntArray(i_6_)
        val is_9_ = IntArray(i)
        for (i_10_ in 0..<i_6_) `is`[i_10_] = (i_10_ shl 12) / i_6_
        val is_11_ = IntArray(i_8_)
        var i_12_ = 0
        while (i > i_12_) {
            is_9_[i_12_] = (i_12_ shl 12) / i
            i_12_++
        }
        for (i_13_ in i_7_..<i_8_) is_11_[i_13_] = (i_13_ shl 12) / i_8_
        method543(true)
        var i_14_ = 0
        while (i_8_ > i_14_) {
            var i_15_ = 0
            while (i > i_15_) {
                var i_16_ = 0
                while (i_6_ > i_16_) {
                    var i_17_ = 0
                    while ((this.anInt1071 > i_17_)) {
                        val i_18_ = aShortArray1069!![i_17_].toInt() shl 12
                        var i_19_ = i_18_ * is_11_[i_14_] shr 12
                        val i_20_ = anInt1074 * i_18_ shr 12
                        val i_21_ = anInt1078 * i_18_ shr 12
                        var i_22_ = `is`[i_16_] * i_18_ shr 12
                        val i_23_ = i_18_ * anInt1079 shr 12
                        var i_24_ = i_18_ * is_9_[i_15_] shr 12
                        i_22_ *= anInt1079
                        i_24_ *= anInt1078
                        i_19_ *= anInt1074
                        var i_25_ = i_22_ shr 12
                        var i_26_ = i_25_ + 1
                        i_25_ = i_25_ and 0xff
                        var i_27_ = i_24_ shr 12
                        var i_28_ = 1 + i_27_
                        i_27_ = i_27_ and 0xff
                        var i_29_ = i_19_ shr 12
                        var i_30_ = i_29_ + 1
                        i_22_ = i_22_ and 0xfff
                        i_24_ = i_24_ and 0xfff
                        if (i_28_ >= i_21_) i_28_ = 0
                        else i_28_ = i_28_ and 0xff
                        if (i_26_ >= i_23_) i_26_ = 0
                        else i_26_ = i_26_ and 0xff
                        i_29_ = i_29_ and 0xff
                        if (i_20_ > i_30_) i_30_ = i_30_ and 0xff
                        else i_30_ = 0
                        i_19_ = i_19_ and 0xfff
                        val i_31_ = -4096 + i_24_
                        val i_32_ = aShortArray1082[i_30_].toInt()
                        val i_33_ = i_22_ + -4096
                        val i_34_ = Class199.anIntArray2631!![i_19_]
                        val i_35_ = Class199.anIntArray2631!![i_22_]
                        val i_36_ = Class199.anIntArray2631!![i_24_]
                        val i_37_ = i_19_ + -4096
                        val i_38_ = aShortArray1082[i_29_].toInt()
                        val i_39_ = aShortArray1082[i_38_ + i_28_].toInt()
                        val i_40_ = aShortArray1082[i_32_ + i_27_].toInt()
                        val i_41_ = aShortArray1082[i_28_ - -i_32_].toInt()
                        val i_42_ = aShortArray1082[i_38_ + i_27_].toInt()
                        var i_43_ = Class301.method2279(true, (aShortArray1082[i_25_ - -i_42_]).toInt(), i_19_, i_24_, i_22_)
                        var i_44_ = Class301.method2279(true, (aShortArray1082[i_26_ + i_42_]).toInt(), i_19_, i_24_, i_33_)
                        var i_45_ = i_43_ - -((i_44_ - i_43_) * i_35_ shr 12)
                        i_43_ = Class301.method2279(true, (aShortArray1082[i_39_ + i_25_]).toInt(), i_19_, i_31_, i_22_)
                        i_44_ = Class301.method2279(true, (aShortArray1082[i_26_ + i_39_]).toInt(), i_19_, i_31_, i_33_)
                        var i_46_ = i_43_ + ((i_44_ + -i_43_) * i_35_ shr 12)
                        i_43_ = Class301.method2279(true, (aShortArray1082[i_40_ + i_25_]).toInt(), i_37_, i_24_, i_22_)
                        val i_47_ = ((i_46_ + -i_45_) * i_36_ shr 12) + i_45_
                        i_44_ = Class301.method2279(true, (aShortArray1082[i_40_ + i_26_]).toInt(), i_37_, i_24_, i_33_)
                        i_45_ = i_43_ + (i_35_ * (i_44_ - i_43_) shr 12)
                        i_43_ = Class301.method2279(true, (aShortArray1082[i_25_ - -i_41_]).toInt(), i_37_, i_31_, i_22_)
                        i_44_ = Class301.method2279(true, (aShortArray1082[i_26_ - -i_41_]).toInt(), i_37_, i_31_, i_33_)
                        i_46_ = (((-i_43_ + i_44_) * i_35_ shr 12) + i_43_)
                        val i_48_ = ((i_46_ - i_45_) * i_36_ shr 12) + i_45_
                        method546(i_47_ + ((-i_47_ + i_48_) * i_34_ shr 12), i_17_, i_7_ xor 0x1.inv())
                        i_17_++
                    }
                    method541(-1538606516)
                    i_16_++
                }
                i_15_++
            }
            i_14_++
        }
    }

    abstract fun method543(bool: Boolean)

    abstract fun method546(i: Int, i_50_: Int, i_51_: Int)

    init {
        aShortArray1082 = ShortArray(512)
        this.anInt1071 = i_73_
        anInt1078 = i_75_
        anInt1079 = i_74_
        anInt1081 = i
        anInt1074 = i_76_
        method540(0)
        method539(85)
    }

    companion object {
        @JvmField
        var aClass114_1068: Class114? = Class114(35, 0)
        @JvmField
        var anInt1070: Int = 0
        @JvmField
        var anInt1072: Int = 0
        @JvmField
        var anInt1073: Int = 0
        @JvmField
        var anInt1075: Int = 0
        @JvmField
        var anInt1076: Int = 0
        @JvmField
        var anInt1077: Int = 0
        @JvmField
        var anInt1080: Int = 0
        @JvmField
        var aDouble1083: Double = 0.0

        @JvmStatic
        fun method544(string: String?, bool: Boolean, i: Int) {
            anInt1075++
            Class286_Sub2.method2144("", i, (-96).toByte(), 0, string, "", "")
            if (bool != false) method547(null, -103)
        }

        @JvmStatic
        fun method545(i: Int, i_49_: Int) {
            Class351.aClass60_4327!!.method578(2, i)
            anInt1077++
            Class358.aClass60_4417!!.method578(2, i)
            if (i_49_ != -1) aClass114_1068 = null
            Class239_Sub24.aClass60_6096!!.method578(2, i)
            Class348_Sub40_Sub9.aClass60_9171!!.method578(i_49_ xor 0x2.inv(), i)
        }

        @JvmStatic
        fun method547(string: String?, i: Int): Int {
            anInt1076++
            if (!Class59_Sub1.aClass297_5297!!.aBoolean3777) return -1
            if (Class275.aHashtable3548!!.containsKey(string)) return 100
            val string_52_ = Class334.method2651(string, 3)
            if (string_52_ == null) return -1
            val string_53_ = Class348_Sub41.aString7048 + string_52_
            if (!Class167.aClass45_2208!!.method422("", string_53_, -88)) return -1
            if (!Class167.aClass45_2208!!.method413(i xor 0x1d48, string_53_)) return Class167.aClass45_2208!!.method397(string_53_, 0)
            val `is` = Class167.aClass45_2208!!.method391(string_53_, "", -29832)
            val `object`: Any? = null
            val file: File?
            try {
                file = Class201.method1466(i + -7470, string_52_)
            } catch (runtimeexception: RuntimeException) {
                if (Loader.trace) {
                    runtimeexception.printStackTrace()
                }
                return -1
            }
            if (`is` != null && file != null) {
                var bool = true
                val is_54_ = Class239_Sub24.method1821(i xor 0x1d5b, file)
                if (is_54_ == null || is_54_.size != `is`.size) bool = false
                else {
                    for (i_55_ in is_54_.indices) {
                        if (is_54_[i_55_] != `is`[i_55_]) {
                            bool = false
                            break
                        }
                    }
                }
                try {
                    if (!bool) Class59_Sub1.aClass297_5297!!.method2242(`is`, (-104).toByte(), file)
                } catch (throwable: Throwable) {
                    if (Loader.trace) {
                        throwable.printStackTrace()
                    }
                    return -1
                }
                Class166.method1286(file, 64, string)
                return 100
            }
            return -1
        }

        @JvmStatic
        fun method548(i: Int) {
            aClass114_1068 = null
            if (i != 10) aClass114_1068 = null
        }

        @JvmStatic
        fun method549(i: Byte, class348_sub21: Class348_Sub21?, var_ha: ha, class42: Class42?) {
            try {
                anInt1080++
                val class105 = class42!!.method375(var_ha, false)
                if (class105 != null) {
                    var i_56_ = class105.method971()
                    if (i_56_ < class105.method969()) i_56_ = class105.method969()
                    val i_57_ = 10
                    var i_58_ = class348_sub21!!.anInt6853
                    var i_59_ = class348_sub21.anInt6855
                    var i_60_ = 0
                    var i_61_ = 0
                    var i_62_ = 0
                    if (class42.aString597 != null) {
                        i_60_ = (Class258_Sub1.aClass143_8527!!.method1188(class42.aString597, null, ha_Sub3.aStringArray8019, 87.toByte(), null))
                        var i_63_ = 0
                        while (i_60_ > i_63_) {
                            var string = ha_Sub3.aStringArray8019!![i_63_]!!
                            if (i_60_ + -1 > i_63_) string = string.substring(0, string.length - 4)
                            val i_64_ = Class39.aClass323_521!!.method2564(string)
                            if (i_61_ < i_64_) i_61_ = i_64_
                            i_63_++
                        }
                        i_62_ = (i_60_ * Class39.aClass323_521!!.method2565() - -(Class39.aClass323_521!!.method2560() / 2))
                    }
                    var i_65_ = i_56_ / 2 + class348_sub21.anInt6853
                    var i_66_ = class348_sub21.anInt6855
                    if (Class75.anInt1272 - -i_56_ <= i_58_) {
                        if (i_58_ > -i_56_ + Class75.anInt1276) {
                            i_58_ = -i_56_ + Class75.anInt1276
                            i_65_ = (-(i_56_ / 2) + Class75.anInt1276 + (-i_57_ + -(i_61_ / 2) - 5))
                        }
                    } else {
                        i_58_ = Class75.anInt1272
                        i_65_ = i_61_ / 2 + i_57_ + i_56_ / 2 + (Class75.anInt1272 + 5)
                    }
                    if (i_59_ < i_56_ + Class75.anInt1262) {
                        i_59_ = Class75.anInt1262
                        i_66_ = i_56_ / 2 + i_57_ + Class75.anInt1262
                    } else if (i_59_ > Class75.anInt1268 + -i_56_) {
                        i_59_ = -i_56_ + Class75.anInt1268
                        i_66_ = -(i_56_ / 2) + Class75.anInt1268 - (i_57_ - -i_62_)
                    }
                    val i_67_ = (32767.0 * (atan2((i_58_ - (class348_sub21.anInt6853)).toDouble(), (-(class348_sub21.anInt6855) + i_59_).toDouble()) / 3.141592653589793)).toInt() and 0xffff
                    class105.method981(i_56_.toFloat() / 2.0f + i_58_.toFloat(), i_56_.toFloat() / 2.0f + i_59_.toFloat(), 4096, i_67_)
                    var i_68_ = -2
                    var i_69_ = -2
                    var i_70_ = -2
                    if (i.toInt() != -43) method545(-91, -16)
                    var i_71_ = -2
                    if (class42.aString597 != null) {
                        i_69_ = i_66_
                        i_68_ = i_65_ + -(i_61_ / 2) - 5
                        i_71_ = 3 + (i_60_ * Class39.aClass323_521!!.method2565() + i_69_)
                        i_70_ = i_61_ + (i_68_ + 10)
                        if (class42.anInt602 != 0) var_ha!!.method3675(-i_68_ + i_70_, (-125).toByte(), i_68_, i_69_, i_71_ - i_69_, class42.anInt602)
                        if (class42.anInt604 != 0) var_ha!!.method3668(-i_68_ + i_70_, i_69_, class42.anInt604, i_68_, -i_69_ + i_71_, 67)
                        var i_72_ = 0
                        while (i_60_ > i_72_) {
                            var string = ha_Sub3.aStringArray8019!![i_72_]!!
                            if (i_72_ < i_60_ + -1) string = string.substring(0, -4 + string.length)
                            Class39.aClass323_521!!.method2563(var_ha, string, i_65_, i_66_, (class42.anInt580), true)
                            i_66_ += Class39.aClass323_521!!.method2565()
                            i_72_++
                        }
                    }
                    if (class42.anInt578 != -1 || class42.aString597 != null) {
                        i_56_ = i_56_ shr 1
                        val class348_sub12 = Class348_Sub12(class348_sub21)
                        class348_sub12.anInt6737 = i_70_
                        class348_sub12.anInt6746 = -i_56_ + i_59_
                        class348_sub12.anInt6735 = i_59_ - -i_56_
                        class348_sub12.anInt6750 = i_58_ - -i_56_
                        class348_sub12.anInt6738 = i_71_
                        class348_sub12.anInt6753 = i_69_
                        class348_sub12.anInt6747 = i_58_ - i_56_
                        class348_sub12.anInt6745 = i_68_
                        Class289.aClass262_3705!!.method1999(class348_sub12, -20180)
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("jp.I(" + i + ',' + (if (class348_sub21 != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + (if (class42 != null) "{...}" else "null") + ')'))
            }
        }
    }
}
