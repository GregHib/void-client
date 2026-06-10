import java.awt.Canvas
import java.awt.Rectangle
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

class ha_Sub1 private constructor(var_d: d?) : ha(var_d) {
    private var anInt7465 = 0
    private var anInt7466 = 0
    private var aClass356_7467: Class356?
    private var aCanvas7468: Canvas? = null
    @JvmField
    var aClass348_Sub31_7469: Class348_Sub31? = null
    private var aBoolean7470 = false
    private var aBoolean7471 = false
    private var anInt7472 = 0
    @JvmField
    var anInt7473: Int = 0
    @JvmField
    var anInt7474: Int
    private var aClass49_7475: Class49? = null
    @JvmField
    var anInt7476: Int
    @JvmField
    var anInt7477: Int = 0
    @JvmField
    var anInt7478: Int
    @JvmField
    var anInt7479: Int = 0
    private var aClass167Array7480: Array<Class167?>? = null
    private var anInt7481 = 0
    @JvmField
    var anInt7482: Int
    @JvmField
    var anIntArray7483: IntArray? = null
    @JvmField
    var anInt7484: Int = 0
    @JvmField
    var anInt7485: Int = 0
    private var anInt7486 = 0
    private var anInt7487: Int
    private var anInt7488 = 0
    private var aBoolean7489: Boolean
    @JvmField
    var anInt7490: Int = 0
    @JvmField
    var anInt7491: Int
    @JvmField
    var aClass101_Sub1_7492: Class101_Sub1? = null
    private var anInt7493 = 0
    @JvmField
    var anInt7494: Int
    private var anInt7495 = 0
    @JvmField
    var anInt7496: Int
    @JvmField
    var anInt7497: Int
    private val aClass60_7498: Class60
    private val aClass60_7499: Class60
    @JvmField
    var anInt7500: Int
    @JvmField
    var anInt7501: Int
    @JvmField
    var aFloatArray7502: FloatArray? = null
    @JvmField
    var anInt7503: Int
    @JvmField
    var anInt7504: Int = 0
    private var anInt7505: Int
    @JvmField
    var anInt7506: Int = 0
    @JvmField
    var anInt7507: Int
    @JvmField
    var anInt7508: Int = 0
    @JvmField
    var anInt7509: Int = 0
    @JvmField
    var anInt7510: Int = 0
    @JvmField
    var aFloatArray7511: FloatArray? = null
    private var anInt7512: Int
    private var aClass105_7513: Class105? = null

    override fun method3695(): Boolean {
        return true
    }

    override fun GA(i: Int) {
        aa(0, 0, this.anInt7477, anInt7486, i, 0)
    }

    override fun na(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): IntArray {
        val `is` = IntArray(i_1_ * i_2_)
        var i_3_ = 0
        for (i_4_ in 0..<i_2_) {
            val i_5_ = (i_0_ + i_4_) * this.anInt7477 + i
            for (i_6_ in 0..<i_1_) `is`[i_3_++] = this.anIntArray7483!![i_5_ + i_6_]
        }
        return `is`
    }

    override fun method3628(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
        U(i, i_7_, i_8_, i_10_, i_11_)
        U(i, i_7_ + i_9_ - 1, i_8_, i_10_, i_11_)
        P(i, i_7_ + 1, i_9_ - 2, i_10_, i_11_)
        P(i + i_8_ - 1, i_7_ + 1, i_9_ - 2, i_10_, i_11_)
    }

    override fun pa() {
        for (i in aClass167Array7480!!.indices) {
            aClass167Array7480!![i]!!.anInt2192 = aClass167Array7480!![i]!!.anInt2205
            aClass167Array7480!![i]!!.aBoolean2195 = false
        }
    }

    override fun method3703(i: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, var_aa: aa?, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int) {
        var i = i
        var i_12_ = i_12_
        var i_13_ = i_13_
        var i_14_ = i_14_
        var i_15_ = i_15_
        var i_19_ = i_19_
        var i_20_ = i_20_
        var i_21_ = i_21_
        val var_aa_Sub3 = var_aa as aa_Sub3
        val `is` = var_aa_Sub3.anIntArray5201
        val is_22_ = var_aa_Sub3.anIntArray5202
        val i_23_ = (max(this.anInt7476, i_18_))
        val i_24_ = (min(this.anInt7503, i_18_ + `is`!!.size))
        i_21_ = i_21_ shl 8
        i_19_ = i_19_ shl 8
        i_20_ = i_20_ shl 8
        val i_25_ = i_19_ + i_20_
        i_21_ %= i_25_
        i_13_ -= i
        i_14_ -= i_12_
        if (i_13_ + i_14_ < 0) {
            val i_26_ = (sqrt((i_13_ * i_13_ + i_14_ * i_14_).toDouble()) * 256.0).toInt()
            val i_27_ = i_26_ % i_25_
            i_21_ = i_25_ + i_19_ - i_21_ - i_27_
            i_21_ %= i_25_
            if (i_21_ < 0) i_21_ += i_25_
            i += i_13_
            i_13_ = -i_13_
            i_12_ += i_14_
            i_14_ = -i_14_
        }
        if (i_13_ > i_14_) {
            i_12_ = i_12_ shl 16
            i_12_ += 32768
            i_14_ = i_14_ shl 16
            val i_28_ = floor(i_14_.toDouble() / i_13_.toDouble() + 0.5).toInt()
            i_13_ += i
            val i_29_ = i_15_ ushr 24
            val i_30_ = sqrt((65536 + (i_28_ shr 8) * (i_28_ shr 8)).toDouble()).toInt()
            if (i_16_ == 0 || i_16_ == 1 && i_29_ == 255) {
                while (i <= i_13_) {
                    val i_31_ = i_12_ shr 16
                    val i_32_ = i_31_ - i_18_
                    if (i >= this.anInt7496 && i < this.anInt7507 && i_31_ >= i_23_ && i_31_ < i_24_ && i_21_ < i_19_) {
                        val i_33_ = i_17_ + `is`[i_32_]
                        if (i >= i_33_ && i < i_33_ + is_22_!![i_32_]) this.anIntArray7483!![i + i_31_ * this.anInt7477] = i_15_
                    }
                    i_12_ += i_28_
                    i++
                    i_21_ += i_30_
                    i_21_ %= i_25_
                }
                return
            }
            if (i_16_ == 1) {
                i_15_ = (((i_15_ and 0xff00ff) * i_29_ shr 8 and 0xff00ff) + ((i_15_ and 0xff00) * i_29_ shr 8 and 0xff00) + (i_29_ shl 24))
                val i_34_ = 256 - i_29_
                while (i <= i_13_) {
                    val i_35_ = i_12_ shr 16
                    val i_36_ = i_35_ - i_18_
                    if (i >= this.anInt7496 && i < this.anInt7507 && i_35_ >= i_23_ && i_35_ < i_24_ && i_21_ < i_19_) {
                        val i_37_ = i_17_ + `is`[i_36_]
                        if (i >= i_37_ && i < i_37_ + is_22_!![i_36_]) {
                            val i_38_ = i + i_35_ * this.anInt7477
                            var i_39_ = this.anIntArray7483!![i_38_]
                            i_39_ = (((i_39_ and 0xff00ff) * i_34_ shr 8 and 0xff00ff) + ((i_39_ and 0xff00) * i_34_ shr 8 and 0xff00))
                            this.anIntArray7483!![i_38_] = i_15_ + i_39_
                        }
                    }
                    i_12_ += i_28_
                    i++
                    i_21_ += i_30_
                    i_21_ %= i_25_
                }
                return
            }
            if (i_16_ == 2) {
                while (i <= i_13_) {
                    val i_40_ = i_12_ shr 16
                    val i_41_ = i_40_ - i_18_
                    if (i >= this.anInt7496 && i < this.anInt7507 && i_40_ >= i_23_ && i_40_ < i_24_ && i_21_ < i_19_) {
                        val i_42_ = i_17_ + `is`[i_41_]
                        if (i >= i_42_ && i < i_42_ + is_22_!![i_41_]) {
                            val i_43_ = i + i_40_ * this.anInt7477
                            var i_44_ = this.anIntArray7483!![i_43_]
                            val i_45_ = i_15_ + i_44_
                            val i_46_ = (i_15_ and 0xff00ff) + (i_44_ and 0xff00ff)
                            i_44_ = (i_46_ and 0x1000100) + (i_45_ - i_46_ and 0x10000)
                            this.anIntArray7483!![i_43_] = i_45_ - i_44_ or i_44_ - (i_44_ ushr 8)
                        }
                    }
                    i_12_ += i_28_
                    i++
                    i_21_ += i_30_
                    i_21_ %= i_25_
                }
                return
            }
            throw IllegalArgumentException()
        }
        i = i shl 16
        i += 32768
        i_13_ = i_13_ shl 16
        val i_47_ = floor(i_13_.toDouble() / i_14_.toDouble() + 0.5).toInt()
        val i_48_ = sqrt((65536 + (i_47_ shr 8) * (i_47_ shr 8)).toDouble()).toInt()
        i_14_ += i_12_
        val i_49_ = i_15_ ushr 24
        if (i_16_ == 0 || i_16_ == 1 && i_49_ == 255) {
            while (i_12_ <= i_14_) {
                val i_50_ = i shr 16
                val i_51_ = i_12_ - i_18_
                if (i_12_ >= i_23_ && i_12_ < i_24_ && i_50_ >= this.anInt7496 && i_50_ < this.anInt7507 && i_21_ < i_19_ && i_50_ >= i_17_ + `is`[i_51_] && i_50_ < i_17_ + `is`[i_51_] + is_22_!![i_51_]) this.anIntArray7483!![i_50_ + i_12_ * this.anInt7477] = i_15_
                i += i_47_
                i_12_++
                i_21_ += i_48_
                i_21_ %= i_25_
            }
        } else if (i_16_ == 1) {
            i_15_ = (((i_15_ and 0xff00ff) * i_49_ shr 8 and 0xff00ff) + ((i_15_ and 0xff00) * i_49_ shr 8 and 0xff00) + (i_49_ shl 24))
            val i_52_ = 256 - i_49_
            while (i_12_ <= i_14_) {
                val i_53_ = i shr 16
                val i_54_ = i_12_ - i_18_
                if (i_12_ >= i_23_ && i_12_ < i_24_ && i_53_ >= this.anInt7496 && i_53_ < this.anInt7507 && i_21_ < i_19_ && i_53_ >= i_17_ + `is`[i_54_] && i_53_ < i_17_ + `is`[i_54_] + is_22_!![i_54_]) {
                    val i_55_ = i_53_ + i_12_ * this.anInt7477
                    var i_56_ = this.anIntArray7483!![i_55_]
                    i_56_ = (((i_56_ and 0xff00ff) * i_52_ shr 8 and 0xff00ff) + ((i_56_ and 0xff00) * i_52_ shr 8 and 0xff00))
                    this.anIntArray7483!![i_53_ + i_12_ * this.anInt7477] = i_15_ + i_56_
                }
                i += i_47_
                i_12_++
                i_21_ += i_48_
                i_21_ %= i_25_
            }
        } else if (i_16_ == 2) {
            while (i_12_ <= i_14_) {
                val i_57_ = i shr 16
                val i_58_ = i_12_ - i_18_
                if (i_12_ >= i_23_ && i_12_ < i_24_ && i_57_ >= this.anInt7496 && i_57_ < this.anInt7507 && i_21_ < i_19_ && i_57_ >= i_17_ + `is`[i_58_] && i_57_ < i_17_ + `is`[i_58_] + is_22_!![i_58_]) {
                    val i_59_ = i_57_ + i_12_ * this.anInt7477
                    var i_60_ = this.anIntArray7483!![i_59_]
                    val i_61_ = i_15_ + i_60_
                    val i_62_ = (i_15_ and 0xff00ff) + (i_60_ and 0xff00ff)
                    i_60_ = (i_62_ and 0x1000100) + (i_61_ - i_62_ and 0x10000)
                    this.anIntArray7483!![i_59_] = i_61_ - i_60_ or i_60_ - (i_60_ ushr 8)
                }
                i += i_47_
                i_12_++
                i_21_ += i_48_
                i_21_ %= i_25_
            }
        } else throw IllegalArgumentException()
    }

    override fun method3661(i: Int, i_63_: Int, `is`: IntArray?, is_64_: IntArray?): aa {
        return aa_Sub3(i, i_63_, `is`, is_64_)
    }

    override fun method3685(class98: Class98, i: Int) {
        val class167 = method3724(Thread.currentThread())
        val class318_sub9 = (class98.aClass88_1569.aClass318_Sub9_1503)!!
        var class318_sub9_65_ = class318_sub9.aClass318_Sub9_6469
        while (class318_sub9_65_ !== class318_sub9) {
            val class318_sub9_sub2 = class318_sub9_65_ as Class318_Sub9_Sub2
            val i_66_ = class318_sub9_sub2.anInt8791 shr 12
            val i_67_ = class318_sub9_sub2.anInt8796 shr 12
            val i_68_ = class318_sub9_sub2.anInt8789 shr 12
            var f = ((this.aClass101_Sub1_7492!!.aFloat5681) + ((this.aClass101_Sub1_7492!!.aFloat5662) * i_66_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5680) * i_67_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5664) * i_68_.toFloat()))
            if (!(f < this.anInt7482.toFloat()) && !(f > class167!!.anInt2210.toFloat())) {
                val i_69_ = (this.anInt7510 + (this.anInt7491.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5686) + ((this.aClass101_Sub1_7492!!.aFloat5672) * i_66_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5673) * i_67_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5669) * i_68_.toFloat())) / i.toFloat()).toInt())
                val i_70_ = (this.anInt7504 + (this.anInt7497.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5685) + ((this.aClass101_Sub1_7492!!.aFloat5655) * i_66_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5678) * i_67_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5666) * i_68_.toFloat())) / i.toFloat()).toInt())
                if (i_69_ >= this.anInt7496 && i_69_ <= this.anInt7507 && i_70_ >= this.anInt7476 && i_70_ <= this.anInt7503) {
                    if (f == 0.0f) f = 1.0f
                    method3712(class318_sub9_sub2, i_69_, i_70_, f.toInt(), ((class318_sub9_sub2.anInt8793) * this.anInt7491 shr 12) / i)
                }
            }
            class318_sub9_65_ = class318_sub9_65_.aClass318_Sub9_6469
        }
    }

    override fun method3642(i: Int, class348_sub1s: Array<Class348_Sub1?>?) {
        /* empty */
    }

    override fun method3693(): Boolean {
        return false
    }

    override fun method3710() {
        /* empty */
    }

    override fun P(i: Int, i_71_: Int, i_72_: Int, i_73_: Int, i_74_: Int) {
        var i_71_ = i_71_
        var i_72_ = i_72_
        var i_73_ = i_73_
        if (i >= this.anInt7496 && i < this.anInt7507) {
            if (i_71_ < this.anInt7476) {
                i_72_ -= this.anInt7476 - i_71_
                i_71_ = this.anInt7476
            }
            if (i_71_ + i_72_ > this.anInt7503) i_72_ = this.anInt7503 - i_71_
            val i_75_ = i + i_71_ * this.anInt7477
            val i_76_ = i_73_ ushr 24
            if (i_74_ == 0 || i_74_ == 1 && i_76_ == 255) {
                for (i_77_ in 0..<i_72_) this.anIntArray7483!![i_75_ + i_77_ * this.anInt7477] = i_73_
            } else if (i_74_ == 1) {
                i_73_ = (((i_73_ and 0xff00ff) * i_76_ shr 8 and 0xff00ff) + ((i_73_ and 0xff00) * i_76_ shr 8 and 0xff00) + (i_76_ shl 24))
                val i_78_ = 256 - i_76_
                for (i_79_ in 0..<i_72_) {
                    val i_80_ = i_75_ + i_79_ * this.anInt7477
                    var i_81_ = this.anIntArray7483!![i_80_]
                    i_81_ = (((i_81_ and 0xff00ff) * i_78_ shr 8 and 0xff00ff) + ((i_81_ and 0xff00) * i_78_ shr 8 and 0xff00))
                    this.anIntArray7483!![i_80_] = i_73_ + i_81_
                }
            } else if (i_74_ == 2) {
                for (i_82_ in 0..<i_72_) {
                    val i_83_ = i_75_ + i_82_ * this.anInt7477
                    var i_84_ = this.anIntArray7483!![i_83_]
                    val i_85_ = i_73_ + i_84_
                    val i_86_ = (i_73_ and 0xff00ff) + (i_84_ and 0xff00ff)
                    i_84_ = (i_86_ and 0x1000100) + (i_85_ - i_86_ and 0x10000)
                    this.anIntArray7483!![i_83_] = i_85_ - i_84_ or i_84_ - (i_84_ ushr 8)
                }
            } else throw IllegalArgumentException()
        }
    }

    override fun method3647(bool: Boolean) {
        /* empty */
    }

    override fun xa(f: Float) {
        this.anInt7500 = (f * 65535.0f).toInt()
    }

    override fun ra(i: Int, i_87_: Int, i_88_: Int, i_89_: Int) {
        for (i_90_ in aClass167Array7480!!.indices) {
            aClass167Array7480!![i_90_]!!.anInt2205 = aClass167Array7480!![i_90_]!!.anInt2192
            aClass167Array7480!![i_90_]!!.anInt2211 = i
            aClass167Array7480!![i_90_]!!.anInt2192 = i_87_
            aClass167Array7480!![i_90_]!!.anInt2197 = i_88_
            aClass167Array7480!![i_90_]!!.aBoolean2195 = true
        }
    }

    override fun method3651(var_za: za?) {
        /* empty */
    }

    private fun method3712(class318_sub9_sub2: Class318_Sub9_Sub2, i: Int, i_91_: Int, i_92_: Int, i_93_: Int) {
        var i_93_ = i_93_
        val i_94_ = class318_sub9_sub2.anInt8792
        val i_95_ = i_93_
        i_93_ = i_93_ shl 1
        if (i_94_ == -1) method3723(i, i_91_, i_92_, i_95_, class318_sub9_sub2.anInt8790, 1)
        else {
            if (anInt7512 != i_94_) {
                var class105 = aClass60_7499.method583(i_94_.toLong(), 117) as Class105?
                if (class105 == null) {
                    val `is` = method3719(i_94_)
                    if (`is` != null) {
                        val i_96_ = (if (method3727(i_94_)) 64 else this.anInt7501)
                        class105 = this.method3662(i_96_, `is`, 94.toByte(), 0, i_96_, i_96_)
                        aClass60_7499.method582(class105, i_94_.toLong(), (-121).toByte())
                    } else return
                }
                anInt7512 = i_94_
                aClass105_7513 = class105
            }
            i_93_++
            (aClass105_7513 as Class105_Sub3).method996(i - i_95_, i_91_ - i_95_, i_92_, i_93_, i_93_, 0, class318_sub9_sub2.anInt8790, 1, 1)
        }
    }

    private fun method3713() {
        this.anInt7509 = this.anInt7496 - this.anInt7510
        this.anInt7508 = this.anInt7507 - this.anInt7510
        this.anInt7490 = this.anInt7476 - this.anInt7504
        this.anInt7506 = this.anInt7503 - this.anInt7504
        for (i in 0..<this.anInt7485) {
            val class109 = aClass167Array7480!![i]!!.aClass109_2220!!
            class109.anInt1665 = this.anInt7510 - this.anInt7496
            class109.anInt1668 = this.anInt7504 - this.anInt7476
            class109.anInt1679 = this.anInt7507 - this.anInt7496
            class109.anInt1672 = this.anInt7503 - this.anInt7476
        }
        var i = (this.anInt7476 * this.anInt7477 + this.anInt7496)
        for (i_97_ in this.anInt7476..<this.anInt7503) {
            for (i_98_ in 0..<this.anInt7485) aClass167Array7480!![i_98_]!!.aClass109_2220!!.anIntArray1676[i_97_ - this.anInt7476] = i
            i += this.anInt7477
        }
    }

    override fun i(): Int {
        return this.anInt7482
    }

    override fun method3705(): Class101 {
        val class167 = method3724(Thread.currentThread())
        return class167!!.aClass101_Sub1_2209!!
    }

    fun method3714(i: Int): Boolean {
        return this.aD4579!!.method3(i, -6662)!!.aBoolean217 || this.aD4579!!.method3(i, -6662)!!.aBoolean215
    }

    override fun Q(i: Int, i_99_: Int, i_100_: Int, i_101_: Int, i_102_: Int, i_103_: Int, `is`: ByteArray?, i_104_: Int, i_105_: Int) {
        var i_100_ = i_100_
        var i_101_ = i_101_
        if (i_100_ > 0 && i_101_ > 0) {
            var i_106_ = 0
            var i_107_ = 0
            val i_108_ = (i_104_ shl 16) / i_100_
            val i_109_ = (`is`!!.size / i_104_ shl 16) / i_101_
            var i_110_ = i + i_99_ * this.anInt7477
            var i_111_ = this.anInt7477 - i_100_
            if (i_99_ + i_101_ > this.anInt7503) i_101_ -= i_99_ + i_101_ - this.anInt7503
            if (i_99_ < this.anInt7476) {
                val i_112_ = this.anInt7476 - i_99_
                i_101_ -= i_112_
                i_110_ += i_112_ * this.anInt7477
                i_107_ += i_109_ * i_112_
            }
            if (i + i_100_ > this.anInt7507) {
                val i_113_ = i + i_100_ - this.anInt7507
                i_100_ -= i_113_
                i_111_ += i_113_
            }
            if (i < this.anInt7496) {
                val i_114_ = this.anInt7496 - i
                i_100_ -= i_114_
                i_110_ += i_114_
                i_106_ += i_108_ * i_114_
                i_111_ += i_114_
            }
            val i_115_ = i_102_ ushr 24
            val i_116_ = i_103_ ushr 24
            if (i_105_ == 0 || i_105_ == 1 && i_115_ == 255 && i_116_ == 255) {
                val i_117_ = i_106_
                for (i_118_ in -i_101_..-1) {
                    val i_119_ = (i_107_ shr 16) * i_104_
                    for (i_120_ in -i_100_..-1) {
                        if (`is`[(i_106_ shr 16) + i_119_].toInt() != 0) this.anIntArray7483!![i_110_++] = i_103_
                        else this.anIntArray7483!![i_110_++] = i_102_
                        i_106_ += i_108_
                    }
                    i_107_ += i_109_
                    i_106_ = i_117_
                    i_110_ += i_111_
                }
            } else if (i_105_ == 1) {
                val i_121_ = i_106_
                for (i_122_ in -i_101_..-1) {
                    val i_123_ = (i_107_ shr 16) * i_104_
                    for (i_124_ in -i_100_..-1) {
                        var i_125_ = i_102_
                        if (`is`[(i_106_ shr 16) + i_123_].toInt() != 0) i_125_ = i_103_
                        val i_126_ = i_125_ ushr 24
                        val i_127_ = 255 - i_126_
                        val i_128_ = this.anIntArray7483!![i_110_]
                        this.anIntArray7483!![i_110_++] = ((((i_125_ and 0xff00ff) * i_126_ + (i_128_ and 0xff00ff) * i_127_) and 0xff00ff.inv()) + (((i_125_ and 0xff00) * i_126_ + (i_128_ and 0xff00) * i_127_) and 0xff0000)) shr 8
                        i_106_ += i_108_
                    }
                    i_107_ += i_109_
                    i_106_ = i_121_
                    i_110_ += i_111_
                }
            } else if (i_105_ == 2) {
                val i_129_ = i_106_
                for (i_130_ in -i_101_..-1) {
                    val i_131_ = (i_107_ shr 16) * i_104_
                    for (i_132_ in -i_100_..-1) {
                        var i_133_ = i_102_
                        if (`is`[(i_106_ shr 16) + i_131_].toInt() != 0) i_133_ = i_103_
                        if (i_133_ != 0) {
                            var i_134_ = this.anIntArray7483!![i_110_]
                            val i_135_ = i_133_ + i_134_
                            val i_136_ = (i_133_ and 0xff00ff) + (i_134_ and 0xff00ff)
                            i_134_ = (i_136_ and 0x1000100) + (i_135_ - i_136_ and 0x10000)
                            this.anIntArray7483!![i_110_++] = i_135_ - i_134_ or i_134_ - (i_134_ ushr 8)
                        } else i_110_++
                        i_106_ += i_108_
                    }
                    i_107_ += i_109_
                    i_106_ = i_129_
                    i_110_ += i_111_
                }
            } else throw IllegalArgumentException()
        }
    }

    override fun method3655(): Boolean {
        return false
    }

    override fun method3697(i: Int, i_137_: Int, i_138_: Int, i_139_: Int, i_140_: Int, i_141_: Int): Class299? {
        return null
    }

    public override fun KA(i: Int, i_142_: Int, i_143_: Int, i_144_: Int) {
        var i = i
        var i_142_ = i_142_
        var i_143_ = i_143_
        var i_144_ = i_144_
        if (i < 0) i = 0
        if (i_142_ < 0) i_142_ = 0
        if (i_143_ > this.anInt7477) i_143_ = this.anInt7477
        if (i_144_ > anInt7486) i_144_ = anInt7486
        this.anInt7496 = i
        this.anInt7507 = i_143_
        this.anInt7476 = i_142_
        this.anInt7503 = i_144_
        method3713()
    }

    override fun method3698() {
        /* empty */
    }

    override fun method3638(class101: Class101?) {
        this.aClass101_Sub1_7492 = class101 as Class101_Sub1
    }

    override fun A(i: Int, var_aa: aa?, i_145_: Int, i_146_: Int) {
        var i_146_ = i_146_
        val var_aa_Sub3 = var_aa as aa_Sub3
        val `is` = var_aa_Sub3.anIntArray5201
        val is_147_ = var_aa_Sub3.anIntArray5202
        val i_148_: Int
        if (this.anInt7503 < i_146_ + `is`!!.size) i_148_ = this.anInt7503 - i_146_
        else i_148_ = `is`.size
        val i_149_: Int
        if (this.anInt7476 > i_146_) {
            i_149_ = this.anInt7476 - i_146_
            i_146_ = this.anInt7476
        } else i_149_ = 0
        if (i_148_ - i_149_ > 0) {
            var i_150_ = i_146_ * this.anInt7477
            for (i_151_ in i_149_..<i_148_) {
                var i_152_ = i_145_ + `is`[i_151_]
                var i_153_ = is_147_!![i_151_]
                if (this.anInt7496 > i_152_) {
                    i_153_ -= this.anInt7496 - i_152_
                    i_152_ = this.anInt7496
                }
                if (this.anInt7507 < i_152_ + i_153_) i_153_ = this.anInt7507 - i_152_
                i_152_ += i_150_
                for (i_154_ in -i_153_..-1) this.anIntArray7483!![i_152_++] = i
                i_150_ += this.anInt7477
            }
        }
    }

    override fun method3667(i: Int, i_155_: Int): Int {
        var i = i
        i = i or 0x20800
        return i and i_155_ xor i_155_
    }

    override fun f(i: Int, i_156_: Int) {
        val class167 = method3724(Thread.currentThread())
        this.anInt7482 = i
        this.anInt7494 = i_156_
        class167!!.anInt2210 = this.anInt7494 - 255
    }

    private fun method3715(i: Int, i_157_: Int, i_158_: Int, i_159_: Int, i_160_: Int, i_161_: Int, i_162_: Int, i_163_: Int) {
        var i_159_ = i_159_
        if (i_157_ >= this.anInt7476 && i_157_ < this.anInt7503) {
            val i_164_ = i + i_157_ * this.anInt7477
            val i_165_ = i_159_ ushr 24
            val i_166_ = i_161_ + i_162_
            var i_167_ = i_163_ % i_166_
            if (i_160_ == 0 || i_160_ == 1 && i_165_ == 255) {
                var i_168_ = 0
                while (i_168_ < i_158_) {
                    if (i + i_168_ >= this.anInt7496 && i + i_168_ < this.anInt7507 && i_167_ < i_161_) this.anIntArray7483!![i_164_ + i_168_] = i_159_
                    i_168_++
                    i_167_ = ++i_167_ % i_166_
                }
            } else if (i_160_ == 1) {
                i_159_ = (((i_159_ and 0xff00ff) * i_165_ shr 8 and 0xff00ff) + ((i_159_ and 0xff00) * i_165_ shr 8 and 0xff00) + (i_165_ shl 24))
                val i_169_ = 256 - i_165_
                var i_170_ = 0
                while (i_170_ < i_158_) {
                    if (i + i_170_ >= this.anInt7496 && i + i_170_ < this.anInt7507 && i_167_ < i_161_) {
                        var i_171_ = this.anIntArray7483!![i_164_ + i_170_]
                        i_171_ = (((i_171_ and 0xff00ff) * i_169_ shr 8 and 0xff00ff) + ((i_171_ and 0xff00) * i_169_ shr 8 and 0xff00))
                        this.anIntArray7483!![i_164_ + i_170_] = i_159_ + i_171_
                    }
                    i_170_++
                    i_167_ = ++i_167_ % i_166_
                }
            } else if (i_160_ == 2) {
                var i_172_ = 0
                while (i_172_ < i_158_) {
                    if (i + i_172_ >= this.anInt7496 && i + i_172_ < this.anInt7507 && i_167_ < i_161_) {
                        var i_173_ = this.anIntArray7483!![i_164_ + i_172_]
                        val i_174_ = i_159_ + i_173_
                        val i_175_ = (i_159_ and 0xff00ff) + (i_173_ and 0xff00ff)
                        i_173_ = (i_175_ and 0x1000100) + (i_174_ - i_175_ and 0x10000)
                        this.anIntArray7483!![i_164_ + i_172_] = i_174_ - i_173_ or i_173_ - (i_173_ ushr 8)
                    }
                    i_172_++
                    i_167_ = ++i_167_ % i_166_
                }
            } else throw IllegalArgumentException()
        }
    }

    override fun Y(): IntArray {
        return (intArrayOf(this.anInt7510, this.anInt7504, this.anInt7491, this.anInt7497))
    }

    public override fun ya() {
        if (this.anInt7496 == 0 && this.anInt7507 == this.anInt7477 && this.anInt7476 == 0 && this.anInt7503 == anInt7486) {
            val i = this.aFloatArray7511!!.size
            val i_176_ = i - (i and 0x7)
            var i_177_ = 0
            while (i_177_ < i_176_) {
                this.aFloatArray7511!![i_177_++] = 2.14748365E9f
                this.aFloatArray7511!![i_177_++] = 2.14748365E9f
                this.aFloatArray7511!![i_177_++] = 2.14748365E9f
                this.aFloatArray7511!![i_177_++] = 2.14748365E9f
                this.aFloatArray7511!![i_177_++] = 2.14748365E9f
                this.aFloatArray7511!![i_177_++] = 2.14748365E9f
                this.aFloatArray7511!![i_177_++] = 2.14748365E9f
                this.aFloatArray7511!![i_177_++] = 2.14748365E9f
            }
            while (i_177_ < i) this.aFloatArray7511!![i_177_++] = 2.14748365E9f
        } else {
            var i = this.anInt7507 - this.anInt7496
            val i_178_ = this.anInt7503 - this.anInt7476
            val i_179_ = this.anInt7477 - i
            val i_180_ = (this.anInt7496 + this.anInt7476 * this.anInt7477)
            val i_181_ = i shr 3
            val i_182_ = i and 0x7
            i = i_180_ - 1
            for (i_183_ in -i_178_..-1) {
                if (i_181_ > 0) {
                    var i_184_ = i_181_
                    do {
                        this.aFloatArray7511!![++i] = 2.14748365E9f
                        this.aFloatArray7511!![++i] = 2.14748365E9f
                        this.aFloatArray7511!![++i] = 2.14748365E9f
                        this.aFloatArray7511!![++i] = 2.14748365E9f
                        this.aFloatArray7511!![++i] = 2.14748365E9f
                        this.aFloatArray7511!![++i] = 2.14748365E9f
                        this.aFloatArray7511!![++i] = 2.14748365E9f
                        this.aFloatArray7511!![++i] = 2.14748365E9f
                    } while (--i_184_ > 0)
                }
                if (i_182_ > 0) {
                    var i_185_ = i_182_
                    do this.aFloatArray7511!![++i] = 2.14748365E9f while (--i_185_ > 0)
                }
                i += i_179_
            }
        }
    }

    override fun method3639(): Boolean {
        return true
    }

    override fun U(i: Int, i_186_: Int, i_187_: Int, i_188_: Int, i_189_: Int) {
        var i = i
        var i_187_ = i_187_
        var i_188_ = i_188_
        if (i_186_ >= this.anInt7476 && i_186_ < this.anInt7503) {
            if (i < this.anInt7496) {
                i_187_ -= this.anInt7496 - i
                i = this.anInt7496
            }
            if (i + i_187_ > this.anInt7507) i_187_ = this.anInt7507 - i
            val i_190_ = i + i_186_ * this.anInt7477
            val i_191_ = i_188_ ushr 24
            if (i_189_ == 0 || i_189_ == 1 && i_191_ == 255) {
                for (i_192_ in 0..<i_187_) this.anIntArray7483!![i_190_ + i_192_] = i_188_
            } else if (i_189_ == 1) {
                i_188_ = (((i_188_ and 0xff00ff) * i_191_ shr 8 and 0xff00ff) + ((i_188_ and 0xff00) * i_191_ shr 8 and 0xff00) + (i_191_ shl 24))
                val i_193_ = 256 - i_191_
                for (i_194_ in 0..<i_187_) {
                    var i_195_ = this.anIntArray7483!![i_190_ + i_194_]
                    i_195_ = (((i_195_ and 0xff00ff) * i_193_ shr 8 and 0xff00ff) + ((i_195_ and 0xff00) * i_193_ shr 8 and 0xff00))
                    this.anIntArray7483!![i_190_ + i_194_] = i_188_ + i_195_
                }
            } else if (i_189_ == 2) {
                for (i_196_ in 0..<i_187_) {
                    var i_197_ = this.anIntArray7483!![i_190_ + i_196_]
                    val i_198_ = i_188_ + i_197_
                    val i_199_ = (i_188_ and 0xff00ff) + (i_197_ and 0xff00ff)
                    i_197_ = (i_199_ and 0x1000100) + (i_198_ - i_199_ and 0x10000)
                    this.anIntArray7483!![i_190_ + i_196_] = i_198_ - i_197_ or i_197_ - (i_197_ ushr 8)
                }
            } else throw IllegalArgumentException()
        }
    }

    override fun HA(i: Int, i_200_: Int, i_201_: Int, i_202_: Int, `is`: IntArray?) {
        val f = ((this.aClass101_Sub1_7492!!.aFloat5681) + ((this.aClass101_Sub1_7492!!.aFloat5662) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5680) * i_200_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5664) * i_201_.toFloat()))
        if (f >= this.anInt7482.toFloat() && f <= this.anInt7494.toFloat()) {
            val i_203_ = (this.anInt7491.toFloat() * (this.aClass101_Sub1_7492!!.aFloat5686 + ((this.aClass101_Sub1_7492!!.aFloat5672) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5673) * i_200_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5669) * i_201_.toFloat())) / i_202_.toFloat()).toInt()
            val i_204_ = (this.anInt7497.toFloat() * (this.aClass101_Sub1_7492!!.aFloat5685 + ((this.aClass101_Sub1_7492!!.aFloat5655) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5678) * i_200_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5666) * i_201_.toFloat())) / i_202_.toFloat()).toInt()
            if (i_203_ >= this.anInt7509 && i_203_ <= this.anInt7508 && i_204_ >= this.anInt7490 && i_204_ <= this.anInt7506) {
                `is`!![0] = i_203_ - this.anInt7509
                `is`[1] = i_204_ - this.anInt7490
                `is`[2] = f.toInt()
            } else {
                `is`!![2] = -1
                `is`[1] = `is`[2]
                `is`[0] = `is`[1]
            }
        } else {
            `is`!![2] = -1
            `is`[1] = `is`[2]
            `is`[0] = `is`[1]
        }
    }

    fun method3716(): Boolean {
        return aBoolean7470
    }

    override fun method3658(i: Int, i_205_: Int, i_206_: Int, i_207_: Int) {
        /* empty */
    }

    override fun method3684(class98: Class98) {
        val class167 = method3724(Thread.currentThread())
        val class318_sub9 = (class98.aClass88_1569.aClass318_Sub9_1503)!!
        var class318_sub9_208_ = class318_sub9.aClass318_Sub9_6469
        while (class318_sub9_208_ !== class318_sub9) {
            val class318_sub9_sub2 = class318_sub9_208_ as Class318_Sub9_Sub2
            val i = class318_sub9_sub2.anInt8791 shr 12
            val i_209_ = class318_sub9_sub2.anInt8796 shr 12
            val i_210_ = class318_sub9_sub2.anInt8789 shr 12
            var f = ((this.aClass101_Sub1_7492!!.aFloat5681) + ((this.aClass101_Sub1_7492!!.aFloat5662) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5680) * i_209_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5664) * i_210_.toFloat()))
            if (!(f < this.anInt7482.toFloat()) && !(f > class167!!.anInt2210.toFloat())) {
                val i_211_ = (this.anInt7510 + (this.anInt7491.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5686) + ((this.aClass101_Sub1_7492!!.aFloat5672) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5673) * i_209_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5669) * i_210_.toFloat())) / f).toInt())
                val i_212_ = (this.anInt7504 + (this.anInt7497.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5685) + ((this.aClass101_Sub1_7492!!.aFloat5655) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5678) * i_209_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5666) * i_210_.toFloat())) / f).toInt())
                if (i_211_ >= this.anInt7496 && i_211_ <= this.anInt7507 && i_212_ >= this.anInt7476 && i_212_ <= this.anInt7503) {
                    if (f == 0.0f) f = 1.0f
                    method3712(class318_sub9_sub2, i_211_, i_212_, f.toInt(), (((class318_sub9_sub2.anInt8793 * this.anInt7491) shr 12).toFloat() / f).toInt())
                }
            }
            class318_sub9_208_ = class318_sub9_208_.aClass318_Sub9_6469
        }
    }

    override fun method3700(f: Float, f_213_: Float, f_214_: Float) {
        /* empty */
    }

    override fun method3683(i: Int, i_215_: Int, i_216_: Int, i_217_: Int, bool: Boolean): Class105 {
        val `is` = IntArray(i_216_ * i_217_)
        var i_218_ = i_215_ * this.anInt7477 + i
        val i_219_ = this.anInt7477 - i_216_
        for (i_220_ in 0..<i_217_) {
            val i_221_ = i_220_ * i_216_
            for (i_222_ in 0..<i_216_) `is`[i_221_ + i_222_] = this.anIntArray7483!![i_218_++]
            i_218_ += i_219_
        }
        if (bool) return Class105_Sub3_Sub3(this, `is`, i_216_, i_217_)
        return Class105_Sub3_Sub1(this, `is`, i_216_, i_217_)
    }

    private fun method3717() {
        for (i in 0..<this.anInt7485) aClass167Array7480!![i]!!.method1292(64)
        la()
    }

    override fun method3682(): Boolean {
        return false
    }

    override fun method3670(): Boolean {
        return false
    }

    override fun DA(i: Int, i_223_: Int, i_224_: Int, i_225_: Int) {
        this.anInt7510 = i
        this.anInt7504 = i_223_
        this.anInt7491 = i_224_
        this.anInt7497 = i_225_
        method3713()
    }

    override fun method3701(canvas: Canvas?) {
        if (aCanvas7468 === canvas) method3677(null)
        val class348_sub31 = (aClass356_7467!!.method3480(canvas.hashCode().toLong(), -6008) as Class348_Sub31?)
        if (class348_sub31 != null) class348_sub31.method2715(100.toByte())
    }

    override fun L(i: Int, i_226_: Int, i_227_: Int) {
        for (i_228_ in aClass167Array7480!!.indices) {
            val class167 = aClass167Array7480!![i_228_]!!
            class167.anInt2192 = i and 0xffffff
            var i_229_ = class167.anInt2192 ushr 16 and 0xff
            if (i_229_ < 2) i_229_ = 2
            var i_230_ = class167.anInt2192 shr 8 and 0xff
            if (i_230_ < 2) i_230_ = 2
            var i_231_ = class167.anInt2192 and 0xff
            if (i_231_ < 2) i_231_ = 2
            class167.anInt2192 = i_229_ shl 16 or (i_230_ shl 8) or i_231_
            class167.aBoolean2201 = i_226_ >= 0
        }
    }

    override fun method3627(): Boolean {
        return false
    }

    override fun method3643(canvas: Canvas?, i: Int, i_232_: Int) {
        var class348_sub31 = (aClass356_7467!!.method3480(canvas.hashCode().toLong(), -6008) as Class348_Sub31?)
        if (class348_sub31 == null) {
            class348_sub31 = Class110.method1035(9029, i_232_, canvas, i)
            aClass356_7467!!.method3483(21.toByte(), canvas.hashCode().toLong(), class348_sub31)
        } else if (class348_sub31.anInt6917 != i || class348_sub31.anInt6920 != i_232_) method3669(canvas, i, i_232_)
    }

    override fun b(i: Int, i_233_: Int, i_234_: Int, i_235_: Int, d: Double) {
        val i_236_ = anInt7495 - i_234_
        var i_237_ = i_233_ * anInt7495 + i
        val fs = this.aFloatArray7511
        var i_238_ = 0
        while (i_238_ < i_235_) {
            var i_239_ = 0
            while (i_239_ < i_234_) {
                val f = fs!![i_237_]
                if (f != 2.14748365E9f) fs[i_237_] = (f.toDouble() + d).toFloat()
                i_239_++
                i_237_++
            }
            i_238_++
            i_237_ += i_236_
        }
    }

    override fun method3633() {
        /* empty */
    }

    override fun method3631(i: Int) {
        this.anInt7485 = i
        aClass167Array7480 = arrayOfNulls<Class167>(this.anInt7485)
        for (i_240_ in 0..<this.anInt7485) aClass167Array7480!![i_240_] = Class167(this)
    }

    override fun method3709(i: Int, i_241_: Int, i_242_: Int, i_243_: Int, i_244_: Int, i_245_: Int) {
        var i = i
        var i_241_ = i_241_
        var i_242_ = i_242_
        var i_243_ = i_243_
        var i_244_ = i_244_
        i_242_ -= i
        i_243_ -= i_241_
        if (i_243_ == 0) {
            if (i_242_ >= 0) U(i, i_241_, i_242_ + 1, i_244_, i_245_)
            else U(i + i_242_, i_241_, -i_242_ + 1, i_244_, i_245_)
        } else if (i_242_ == 0) {
            if (i_243_ >= 0) P(i, i_241_, i_243_ + 1, i_244_, i_245_)
            else P(i, i_241_ + i_243_, -i_243_ + 1, i_244_, i_245_)
        } else {
            if (i_242_ + i_243_ < 0) {
                i += i_242_
                i_242_ = -i_242_
                i_241_ += i_243_
                i_243_ = -i_243_
            }
            if (i_242_ > i_243_) {
                i_241_ = i_241_ shl 16
                i_241_ += 32768
                i_243_ = i_243_ shl 16
                val i_246_ = floor(i_243_.toDouble() / i_242_.toDouble() + 0.5).toInt()
                i_242_ += i
                if (i < this.anInt7496) {
                    i_241_ += i_246_ * (this.anInt7496 - i)
                    i = this.anInt7496
                }
                if (i_242_ >= this.anInt7507) i_242_ = this.anInt7507 - 1
                val i_247_ = i_244_ ushr 24
                if (i_245_ == 0 || i_245_ == 1 && i_247_ == 255) {
                    while ( /**/i <= i_242_) {
                        val i_248_ = i_241_ shr 16
                        if (i_248_ >= this.anInt7476 && i_248_ < this.anInt7503) this.anIntArray7483!![i + i_248_ * this.anInt7477] = i_244_
                        i_241_ += i_246_
                        i++
                    }
                    return
                }
                if (i_245_ == 1) {
                    i_244_ = (((i_244_ and 0xff00ff) * i_247_ shr 8 and 0xff00ff) + ((i_244_ and 0xff00) * i_247_ shr 8 and 0xff00) + (i_247_ shl 24))
                    val i_249_ = 256 - i_247_
                    while ( /**/i <= i_242_) {
                        val i_250_ = i_241_ shr 16
                        if (i_250_ >= this.anInt7476 && i_250_ < this.anInt7503) {
                            val i_251_ = i + i_250_ * this.anInt7477
                            var i_252_ = this.anIntArray7483!![i_251_]
                            i_252_ = (((i_252_ and 0xff00ff) * i_249_ shr 8 and 0xff00ff) + ((i_252_ and 0xff00) * i_249_ shr 8 and 0xff00))
                            this.anIntArray7483!![i_251_] = i_244_ + i_252_
                        }
                        i_241_ += i_246_
                        i++
                    }
                    return
                }
                if (i_245_ == 2) {
                    while ( /**/i <= i_242_) {
                        val i_253_ = i_241_ shr 16
                        if (i_253_ >= this.anInt7476 && i_253_ < this.anInt7503) {
                            val i_254_ = i + i_253_ * this.anInt7477
                            var i_255_ = this.anIntArray7483!![i_254_]
                            val i_256_ = i_244_ + i_255_
                            val i_257_ = (i_244_ and 0xff00ff) + (i_255_ and 0xff00ff)
                            i_255_ = (i_257_ and 0x1000100) + (i_256_ - i_257_ and 0x10000)
                            this.anIntArray7483!![i_254_] = i_256_ - i_255_ or i_255_ - (i_255_ ushr 8)
                        }
                        i_241_ += i_246_
                        i++
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            i = i shl 16
            i += 32768
            i_242_ = i_242_ shl 16
            val i_258_ = floor(i_242_.toDouble() / i_243_.toDouble() + 0.5).toInt()
            i_243_ += i_241_
            if (i_241_ < this.anInt7476) {
                i += i_258_ * (this.anInt7476 - i_241_)
                i_241_ = this.anInt7476
            }
            if (i_243_ >= this.anInt7503) i_243_ = this.anInt7503 - 1
            val i_259_ = i_244_ ushr 24
            if (i_245_ == 0 || i_245_ == 1 && i_259_ == 255) {
                while ( /**/i_241_ <= i_243_) {
                    val i_260_ = i shr 16
                    if (i_260_ >= this.anInt7496 && i_260_ < this.anInt7507) this.anIntArray7483!![i_260_ + i_241_ * this.anInt7477] = i_244_
                    i += i_258_
                    i_241_++
                }
            } else if (i_245_ == 1) {
                i_244_ = (((i_244_ and 0xff00ff) * i_259_ shr 8 and 0xff00ff) + ((i_244_ and 0xff00) * i_259_ shr 8 and 0xff00) + (i_259_ shl 24))
                val i_261_ = 256 - i_259_
                while ( /**/i_241_ <= i_243_) {
                    val i_262_ = i shr 16
                    if (i_262_ >= this.anInt7496 && i_262_ < this.anInt7507) {
                        val i_263_ = i_262_ + i_241_ * this.anInt7477
                        var i_264_ = this.anIntArray7483!![i_263_]
                        i_264_ = (((i_264_ and 0xff00ff) * i_261_ shr 8 and 0xff00ff) + ((i_264_ and 0xff00) * i_261_ shr 8 and 0xff00))
                        this.anIntArray7483!![i_262_ + i_241_ * this.anInt7477] = i_244_ + i_264_
                    }
                    i += i_258_
                    i_241_++
                }
            } else if (i_245_ == 2) {
                while ( /**/i_241_ <= i_243_) {
                    val i_265_ = i shr 16
                    if (i_265_ >= this.anInt7496 && i_265_ < this.anInt7507) {
                        val i_266_ = i_265_ + i_241_ * this.anInt7477
                        var i_267_ = this.anIntArray7483!![i_266_]
                        val i_268_ = i_244_ + i_267_
                        val i_269_ = (i_244_ and 0xff00ff) + (i_267_ and 0xff00ff)
                        i_267_ = (i_269_ and 0x1000100) + (i_268_ - i_269_ and 0x10000)
                        this.anIntArray7483!![i_266_] = i_268_ - i_267_ or i_267_ - (i_267_ ushr 8)
                    }
                    i += i_258_
                    i_241_++
                }
            } else throw IllegalArgumentException()
        }
    }

    override fun method3676(i: Int, i_270_: Int, i_271_: Int, i_272_: Int, i_273_: Int, i_274_: Int, i_275_: Int, i_276_: Int, i_277_: Int, i_278_: Int, i_279_: Int, i_280_: Int, i_281_: Int) {
        var i = i
        var i_270_ = i_270_
        var i_272_ = i_272_
        var i_273_ = i_273_
        var i_275_ = i_275_
        var i_276_ = i_276_
        val class167 = method3724(Thread.currentThread())
        val class109 = class167!!.aClass109_2220!!
        class109.aBoolean1669 = false
        i -= this.anInt7509
        i_272_ -= this.anInt7509
        i_275_ -= this.anInt7509
        i_270_ -= this.anInt7490
        i_273_ -= this.anInt7490
        i_276_ -= this.anInt7490
        class109.aBoolean1671 = (i < 0 || i > class109.anInt1679 || i_272_ < 0 || i_272_ > class109.anInt1679 || i_275_ < 0 || i_275_ > class109.anInt1679)
        val i_282_ = i_278_ ushr 24
        if (i_281_ == 0 || i_281_ == 1 && i_282_ == 255) {
            class109.anInt1674 = 0
            class109.aBoolean1667 = false
            class109.method1027(i_270_.toFloat(), i_273_.toFloat(), i_276_.toFloat(), i.toFloat(), i_272_.toFloat(), i_275_.toFloat(), i_271_.toFloat(), i_274_.toFloat(), i_277_.toFloat(), i_278_, i_279_, i_280_)
        } else if (i_281_ == 1) {
            class109.anInt1674 = 255 - i_282_
            class109.aBoolean1667 = false
            class109.method1027(i_270_.toFloat(), i_273_.toFloat(), i_276_.toFloat(), i.toFloat(), i_272_.toFloat(), i_275_.toFloat(), i_271_.toFloat(), i_274_.toFloat(), i_277_.toFloat(), i_278_, i_279_, i_280_)
        } else if (i_281_ == 2) {
            class109.anInt1674 = 128
            class109.aBoolean1667 = true
            class109.method1027(i_270_.toFloat(), i_273_.toFloat(), i_276_.toFloat(), i.toFloat(), i_272_.toFloat(), i_275_.toFloat(), i_271_.toFloat(), i_274_.toFloat(), i_277_.toFloat(), i_278_, i_279_, i_280_)
        } else throw IllegalArgumentException()
        class109.aBoolean1669 = true
    }

    override fun method3686(class143: Class143?, class207s: Array<Class207>?, bool: Boolean): Class324 {
        val `is` = IntArray(class207s!!.size)
        val is_283_ = IntArray(class207s.size)
        var bool_284_ = false
        for (i in class207s.indices) {
            `is`[i] = class207s[i]!!.anInt2702
            is_283_[i] = class207s[i]!!.anInt2696
            if (class207s[i]!!.aByteArray2695 != null) bool_284_ = true
        }
        if (bool) {
            if (bool_284_) return Class324_Sub4(this, class143, class207s, `is`, is_283_)
            return Class324_Sub1(this, class143, class207s, `is`, is_283_)
        }
        require(!bool_284_) { "" }
        return Class324_Sub3(this, class143, class207s, `is`, is_283_)
    }

    override fun method3634(interface3: Interface3?, interface13: Interface13?): Interface4 {
        return Class49(this, interface3 as Class105?, interface13 as Class216?)
    }

    public override fun C(bool: Boolean) {
        val class167 = method3724(Thread.currentThread())
        class167!!.aBoolean2202 = bool
    }

    override fun method3636(i: Int, i_285_: Int, i_286_: Int, i_287_: Int, i_288_: Int, i_289_: Int, var_aa: aa?, i_290_: Int, i_291_: Int) {
        var i = i
        var i_285_ = i_285_
        var i_286_ = i_286_
        var i_287_ = i_287_
        var i_288_ = i_288_
        val var_aa_Sub3 = var_aa as aa_Sub3
        val `is` = var_aa_Sub3.anIntArray5201
        val is_292_ = var_aa_Sub3.anIntArray5202
        val i_293_ = (max(this.anInt7476, i_291_))
        val i_294_ = (min(this.anInt7503, i_291_ + `is`!!.size))
        i_286_ -= i
        i_287_ -= i_285_
        if (i_286_ + i_287_ < 0) {
            i += i_286_
            i_286_ = -i_286_
            i_285_ += i_287_
            i_287_ = -i_287_
        }
        if (i_286_ > i_287_) {
            i_285_ = i_285_ shl 16
            i_285_ += 32768
            i_287_ = i_287_ shl 16
            val i_295_ = floor(i_287_.toDouble() / i_286_.toDouble() + 0.5).toInt()
            i_286_ += i
            if (i < this.anInt7496) {
                i_285_ += i_295_ * (this.anInt7496 - i)
                i = this.anInt7496
            }
            if (i_286_ >= this.anInt7507) i_286_ = this.anInt7507 - 1
            val i_296_ = i_288_ ushr 24
            if (i_289_ == 0 || i_289_ == 1 && i_296_ == 255) {
                while ( /**/i <= i_286_) {
                    val i_297_ = i_285_ shr 16
                    val i_298_ = i_297_ - i_291_
                    if (i_297_ >= i_293_ && i_297_ < i_294_) {
                        val i_299_ = i_290_ + `is`[i_298_]
                        if (i >= i_299_ && i < i_299_ + is_292_!![i_298_]) this.anIntArray7483!![i + i_297_ * this.anInt7477] = i_288_
                    }
                    i_285_ += i_295_
                    i++
                }
                return
            }
            if (i_289_ == 1) {
                i_288_ = (((i_288_ and 0xff00ff) * i_296_ shr 8 and 0xff00ff) + ((i_288_ and 0xff00) * i_296_ shr 8 and 0xff00) + (i_296_ shl 24))
                val i_300_ = 256 - i_296_
                while ( /**/i <= i_286_) {
                    val i_301_ = i_285_ shr 16
                    val i_302_ = i_301_ - i_291_
                    if (i_301_ >= i_293_ && i_301_ < i_294_) {
                        val i_303_ = i_290_ + `is`[i_302_]
                        if (i >= i_303_ && i < i_303_ + is_292_!![i_302_]) {
                            val i_304_ = i + i_301_ * this.anInt7477
                            var i_305_ = this.anIntArray7483!![i_304_]
                            i_305_ = (((i_305_ and 0xff00ff) * i_300_ shr 8 and 0xff00ff) + ((i_305_ and 0xff00) * i_300_ shr 8 and 0xff00))
                            this.anIntArray7483!![i_304_] = i_288_ + i_305_
                        }
                    }
                    i_285_ += i_295_
                    i++
                }
                return
            }
            if (i_289_ == 2) {
                while ( /**/i <= i_286_) {
                    val i_306_ = i_285_ shr 16
                    val i_307_ = i_306_ - i_291_
                    if (i_306_ >= i_293_ && i_306_ < i_294_) {
                        val i_308_ = i_290_ + `is`[i_307_]
                        if (i >= i_308_ && i < i_308_ + is_292_!![i_307_]) {
                            val i_309_ = i + i_306_ * this.anInt7477
                            var i_310_ = this.anIntArray7483!![i_309_]
                            val i_311_ = i_288_ + i_310_
                            val i_312_ = (i_288_ and 0xff00ff) + (i_310_ and 0xff00ff)
                            i_310_ = (i_312_ and 0x1000100) + (i_311_ - i_312_ and 0x10000)
                            this.anIntArray7483!![i_309_] = i_311_ - i_310_ or i_310_ - (i_310_ ushr 8)
                        }
                    }
                    i_285_ += i_295_
                    i++
                }
                return
            }
            throw IllegalArgumentException()
        }
        i = i shl 16
        i += 32768
        i_286_ = i_286_ shl 16
        val i_313_ = floor(i_286_.toDouble() / i_287_.toDouble() + 0.5).toInt()
        i_287_ += i_285_
        if (i_285_ < i_293_) {
            i += i_313_ * (i_293_ - i_285_)
            i_285_ = i_293_
        }
        if (i_287_ >= i_294_) i_287_ = i_294_ - 1
        val i_314_ = i_288_ ushr 24
        if (i_289_ == 0 || i_289_ == 1 && i_314_ == 255) {
            while ( /**/i_285_ <= i_287_) {
                val i_315_ = i shr 16
                val i_316_ = i_285_ - i_291_
                val i_317_ = i_290_ + `is`[i_316_]
                if (i_315_ >= this.anInt7496 && i_315_ < this.anInt7507 && i_315_ >= i_317_ && i_315_ < i_317_ + is_292_!![i_316_]) this.anIntArray7483!![i_315_ + i_285_ * this.anInt7477] = i_288_
                i += i_313_
                i_285_++
            }
        } else if (i_289_ == 1) {
            i_288_ = (((i_288_ and 0xff00ff) * i_314_ shr 8 and 0xff00ff) + ((i_288_ and 0xff00) * i_314_ shr 8 and 0xff00) + (i_314_ shl 24))
            val i_318_ = 256 - i_314_
            while ( /**/i_285_ <= i_287_) {
                val i_319_ = i shr 16
                val i_320_ = i_285_ - i_291_
                val i_321_ = i_290_ + `is`[i_320_]
                if (i_319_ >= this.anInt7496 && i_319_ < this.anInt7507 && i_319_ >= i_321_ && i_319_ < i_321_ + is_292_!![i_320_]) {
                    val i_322_ = i_319_ + i_285_ * this.anInt7477
                    var i_323_ = this.anIntArray7483!![i_322_]
                    i_323_ = (((i_323_ and 0xff00ff) * i_318_ shr 8 and 0xff00ff) + ((i_323_ and 0xff00) * i_318_ shr 8 and 0xff00))
                    this.anIntArray7483!![i_319_ + i_285_ * this.anInt7477] = i_288_ + i_323_
                }
                i += i_313_
                i_285_++
            }
        } else if (i_289_ == 2) {
            while ( /**/i_285_ <= i_287_) {
                val i_324_ = i shr 16
                val i_325_ = i_285_ - i_291_
                val i_326_ = i_290_ + `is`[i_325_]
                if (i_324_ >= this.anInt7496 && i_324_ < this.anInt7507 && i_324_ >= i_326_ && i_324_ < i_326_ + is_292_!![i_325_]) {
                    val i_327_ = i_324_ + i_285_ * this.anInt7477
                    var i_328_ = this.anIntArray7483!![i_327_]
                    val i_329_ = i_288_ + i_328_
                    val i_330_ = (i_288_ and 0xff00ff) + (i_328_ and 0xff00ff)
                    i_328_ = (i_330_ and 0x1000100) + (i_329_ - i_330_ and 0x10000)
                    this.anIntArray7483!![i_327_] = i_329_ - i_328_ or i_328_ - (i_328_ ushr 8)
                }
                i += i_313_
                i_285_++
            }
        } else throw IllegalArgumentException()
    }

    override fun XA(): Int {
        return this.anInt7494
    }

    public override fun T(i: Int, i_331_: Int, i_332_: Int, i_333_: Int) {
        if (this.anInt7496 < i) this.anInt7496 = i
        if (this.anInt7476 < i_331_) this.anInt7476 = i_331_
        if (this.anInt7507 > i_332_) this.anInt7507 = i_332_
        if (this.anInt7503 > i_333_) this.anInt7503 = i_333_
        method3713()
    }

    override fun aa(i: Int, i_334_: Int, i_335_: Int, i_336_: Int, i_337_: Int, i_338_: Int) {
        var i = i
        var i_334_ = i_334_
        var i_335_ = i_335_
        var i_336_ = i_336_
        var i_337_ = i_337_
        if (i < this.anInt7496) {
            i_335_ -= this.anInt7496 - i
            i = this.anInt7496
        }
        if (i_334_ < this.anInt7476) {
            i_336_ -= this.anInt7476 - i_334_
            i_334_ = this.anInt7476
        }
        if (i + i_335_ > this.anInt7507) i_335_ = this.anInt7507 - i
        if (i_334_ + i_336_ > this.anInt7503) i_336_ = this.anInt7503 - i_334_
        if (i_335_ > 0 && i_336_ > 0 && i <= this.anInt7507 && i_334_ <= this.anInt7503) {
            val i_339_ = this.anInt7477 - i_335_
            var i_340_ = i + i_334_ * this.anInt7477
            val i_341_ = i_337_ ushr 24
            if (i_338_ == 0 || i_338_ == 1 && i_341_ == 255) {
                val i_342_ = i_335_ shr 3
                val i_343_ = i_335_ and 0x7
                i_335_ = i_340_ - 1
                for (i_344_ in -i_336_..-1) {
                    if (i_342_ > 0) {
                        i = i_342_
                        do {
                            this.anIntArray7483!![++i_335_] = i_337_
                            this.anIntArray7483!![++i_335_] = i_337_
                            this.anIntArray7483!![++i_335_] = i_337_
                            this.anIntArray7483!![++i_335_] = i_337_
                            this.anIntArray7483!![++i_335_] = i_337_
                            this.anIntArray7483!![++i_335_] = i_337_
                            this.anIntArray7483!![++i_335_] = i_337_
                            this.anIntArray7483!![++i_335_] = i_337_
                        } while (--i > 0)
                    }
                    if (i_343_ > 0) {
                        i = i_343_
                        do this.anIntArray7483!![++i_335_] = i_337_ while (--i > 0)
                    }
                    i_335_ += i_339_
                }
            } else if (i_338_ == 1) {
                i_337_ = (((i_337_ and 0xff00ff) * i_341_ shr 8 and 0xff00ff) + (((i_337_ and 0xff00ff.inv()) ushr 8) * i_341_ and 0xff00ff.inv()))
                val i_345_ = 256 - i_341_
                for (i_346_ in 0..<i_336_) {
                    for (i_347_ in -i_335_..-1) {
                        var i_348_ = this.anIntArray7483!![i_340_]
                        i_348_ = (((i_348_ and 0xff00ff) * i_345_ shr 8 and 0xff00ff) + (((i_348_ and 0xff00ff.inv()) ushr 8) * i_345_ and 0xff00ff.inv()))
                        this.anIntArray7483!![i_340_++] = i_337_ + i_348_
                    }
                    i_340_ += i_339_
                }
            } else if (i_338_ == 2) {
                for (i_349_ in 0..<i_336_) {
                    for (i_350_ in -i_335_..-1) {
                        var i_351_ = this.anIntArray7483!![i_340_]
                        val i_352_ = i_337_ + i_351_
                        val i_353_ = (i_337_ and 0xff00ff) + (i_351_ and 0xff00ff)
                        i_351_ = (i_353_ and 0x1000100) + (i_352_ - i_353_ and 0x10000)
                        this.anIntArray7483!![i_340_++] = i_352_ - i_351_ or i_351_ - (i_351_ ushr 8)
                    }
                    i_340_ += i_339_
                }
            } else throw IllegalArgumentException()
        }
    }

    fun method3718(i: Int): IntArray? {
        var class348_sub25: Class348_Sub25?
        synchronized(aClass60_7498) {
            class348_sub25 = aClass60_7498.method583(i.toLong(), 77) as Class348_Sub25?
            if (class348_sub25 == null) {
                if (!this.aD4579!!.method4(-7953, i)) return null
                val class12 = this.aD4579!!.method3(i, -6662)
                val i_354_ = (if (class12!!.aBoolean199 || aBoolean7489) 64 else this.anInt7501)
                class348_sub25 = Class348_Sub25(i, i_354_, this.aD4579!!.method5(true, i, 0.7f, i_354_, i_354_, 71), class12.anInt200 != 1)
                aClass60_7498.method582(class348_sub25, i.toLong(), (-122).toByte())
            }
        }
        class348_sub25!!.aBoolean6882 = true
        return class348_sub25!!.method2997()
    }

    override fun method3652() {
        if (aBoolean7471) {
            Class286_Sub8.method2173(false, -101, true)
            aBoolean7471 = false
        }
        this.aClass348_Sub31_7469 = null
        aCanvas7468 = null
        anInt7465 = 0
        anInt7472 = 0
        aClass356_7467 = null
        aBoolean7470 = true
    }

    override fun method3640(): Class101 {
        return this.aClass101_Sub1_7492!!
    }

    constructor(canvas: Canvas, var_d: d?, i: Int, i_355_: Int) : this(var_d) {
        try {
            method3643(canvas, i, i_355_)
            method3677(canvas)
        } catch (throwable: Throwable) {
            throwable.printStackTrace()
            this.method3635((-115).toByte())
            throw RuntimeException("")
        }
    }

    fun method3719(i: Int): IntArray? {
        var class348_sub25: Class348_Sub25?
        synchronized(aClass60_7498) {
            class348_sub25 = (aClass60_7498.method583(i.toLong() or 0x7fffffffffffffffL.inv(), 107) as Class348_Sub25?)
            if (class348_sub25 == null) {
                if (!this.aD4579!!.method4(-7953, i)) return null
                val class12 = this.aD4579!!.method3(i, -6662)
                val i_356_ = (if (class12!!.aBoolean199 || aBoolean7489) 64 else this.anInt7501)
                class348_sub25 = Class348_Sub25(i, i_356_, this.aD4579!!.method6(-21540, i_356_, 0.7f, i, true, i_356_), class12.anInt200 != 1)
                aClass60_7498.method582(class348_sub25, i.toLong() or 0x7fffffffffffffffL.inv(), (-126).toByte())
            }
        }
        class348_sub25!!.aBoolean6882 = true
        return class348_sub25!!.method2997()
    }

    override fun method3648(i: Int, i_357_: Int, `is`: Array<IntArray?>, is_358_: Array<IntArray?>?, i_359_: Int, i_360_: Int, i_361_: Int): s {
        return s_Sub1(this, i_360_, i_361_, i, i_357_, `is`, is_358_!!, i_359_)
    }

    override fun H(i: Int, i_362_: Int, i_363_: Int, `is`: IntArray?) {
        val f = ((this.aClass101_Sub1_7492!!.aFloat5681) + ((this.aClass101_Sub1_7492!!.aFloat5662) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5680) * i_362_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5664) * i_363_.toFloat()))
        if (f == 0.0f) {
            `is`!![2] = -1
            `is`[1] = `is`[2]
            `is`[0] = `is`[1]
        } else {
            val i_364_ = (this.anInt7491.toFloat() * (this.aClass101_Sub1_7492!!.aFloat5686 + ((this.aClass101_Sub1_7492!!.aFloat5672) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5673) * i_362_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5669) * i_363_.toFloat())) / f).toInt()
            val i_365_ = (this.anInt7497.toFloat() * (this.aClass101_Sub1_7492!!.aFloat5685 + ((this.aClass101_Sub1_7492!!.aFloat5655) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5678) * i_362_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5666) * i_363_.toFloat())) / f).toInt()
            `is`!![0] = i_364_ - this.anInt7509
            `is`[1] = i_365_ - this.anInt7490
            `is`[2] = f.toInt()
        }
    }

    override fun method3654(): Class101 {
        return Class101_Sub1()
    }

    override fun la() {
        this.anInt7496 = 0
        this.anInt7476 = 0
        this.anInt7507 = this.anInt7477
        this.anInt7503 = anInt7486
        method3713()
    }

    override fun method3625(class124: Class124?, i: Int, i_366_: Int, i_367_: Int, i_368_: Int): Class64 {
        return Class64_Sub1(this, class124!!, i, i_367_, i_368_, i_366_)
    }

    override fun method3624(i: Int, i_369_: Int): Interface13 {
        return Class216(i, i_369_)
    }

    override fun method3632(`is`: IntArray?) {
        `is`!![0] = this.anInt7477
        `is`[1] = anInt7486
    }

    override fun F(i: Int, i_370_: Int) {
        val i_371_ = i_370_ * this.anInt7477 + i
        val i_372_ = i_370_ * anInt7495 + i
        if (i_371_ != 0 || i_372_ != 0) {
            val `is` = this.anIntArray7483
            val fs = this.aFloatArray7511
            if (i_371_ < 0) {
                val i_373_ = `is`!!.size + i_371_
                Class214.method1578(`is`, -i_371_, `is`, 0, i_373_)
            } else if (i_371_ > 0) {
                val i_374_ = `is`!!.size - i_371_
                Class214.method1578(`is`, 0, `is`, i_371_, i_374_)
            }
            if (i_372_ < 0) {
                val i_375_ = fs!!.size + i_372_
                Class214.method1574(fs, -i_372_, fs, 0, i_375_)
            } else if (i_372_ > 0) {
                val i_376_ = fs!!.size - i_372_
                Class214.method1574(fs, 0, fs, i_372_, i_376_)
            }
        }
    }

    override fun method3687(interface4: Interface4?) {
        val class49 = interface4 as Class49
        this.anInt7477 = class49.anInt4725
        anInt7486 = class49.anInt4722
        this.anIntArray7483 = class49.anIntArray4731
        aClass49_7475 = class49
        anInt7495 = class49.anInt4725
        anInt7488 = class49.anInt4722
        this.aFloatArray7511 = class49.aFloatArray4719
        method3717()
    }

    fun method3720(i: Int, i_377_: Int, i_378_: Int, i_379_: Int, i_380_: Int, i_381_: Int, i_382_: Int, i_383_: Int, i_384_: Int, i_385_: Int) {
        if (i_379_ != 0 && i_380_ != 0) {
            if (i_382_ != 65535 && !(this.aD4579!!.method3(i_382_, -6662)!!.aBoolean209)) {
                if (anInt7512 != i_382_) {
                    var class105 = (aClass60_7499.method583(i_382_.toLong(), 97) as Class105?)
                    if (class105 == null) {
                        val `is` = method3719(i_382_)
                        if (`is` == null) return
                        val i_386_ = (if (method3727(i_382_)) 64 else this.anInt7501)
                        class105 = this.method3662(i_386_, `is`, 94.toByte(), 0, i_386_, i_386_)
                        aClass60_7499.method582(class105, i_382_.toLong(), (-100).toByte())
                    }
                    anInt7512 = i_382_
                    aClass105_7513 = class105
                }
                (aClass105_7513 as Class105_Sub3).method996(i - i_379_, i_377_ - i_380_, i_378_, i_379_ shl 1, i_380_ shl 1, i_384_, i_383_, i_385_, 1)
            } else method3723(i, i_377_, i_378_, i_379_, i_383_, i_385_)
        }
    }

    override fun method3653(class299: Class299?) {
        /* empty */
    }

    override fun EA(i: Int, i_387_: Int, i_388_: Int, i_389_: Int) {
        val class167 = method3724(Thread.currentThread())
        class167!!.anInt2211 = i
        class167.anInt2192 = i_387_
        class167.anInt2197 = i_388_
    }

    private fun method3721(i: Int, i_390_: Int, i_391_: Int, i_392_: Int, i_393_: Int, i_394_: Int, i_395_: Int, i_396_: Int) {
        var i_392_ = i_392_
        if (i >= this.anInt7496 && i < this.anInt7507) {
            val i_397_ = i + i_390_ * this.anInt7477
            val i_398_ = i_392_ ushr 24
            val i_399_ = i_394_ + i_395_
            var i_400_ = i_396_ % i_399_
            if (i_393_ == 0 || i_393_ == 1 && i_398_ == 255) {
                var i_401_ = 0
                while (i_401_ < i_391_) {
                    if (i_390_ + i_401_ >= this.anInt7476 && i_390_ + i_401_ < this.anInt7503 && i_400_ < i_394_) this.anIntArray7483!![i_397_ + i_401_ * this.anInt7477] = i_392_
                    i_401_++
                    i_400_ = ++i_400_ % i_399_
                }
            } else if (i_393_ == 1) {
                i_392_ = (((i_392_ and 0xff00ff) * i_398_ shr 8 and 0xff00ff) + ((i_392_ and 0xff00) * i_398_ shr 8 and 0xff00) + (i_398_ shl 24))
                val i_402_ = 256 - i_398_
                var i_403_ = 0
                while (i_403_ < i_391_) {
                    if (i_390_ + i_403_ >= this.anInt7476 && i_390_ + i_403_ < this.anInt7503 && i_400_ < i_394_) {
                        val i_404_ = i_397_ + i_403_ * this.anInt7477
                        var i_405_ = this.anIntArray7483!![i_404_]
                        i_405_ = (((i_405_ and 0xff00ff) * i_402_ shr 8 and 0xff00ff) + ((i_405_ and 0xff00) * i_402_ shr 8 and 0xff00))
                        this.anIntArray7483!![i_404_] = i_392_ + i_405_
                    }
                    i_403_++
                    i_400_ = ++i_400_ % i_399_
                }
            } else if (i_393_ == 2) {
                var i_406_ = 0
                while (i_406_ < i_391_) {
                    if (i_390_ + i_406_ >= this.anInt7476 && i_390_ + i_406_ < this.anInt7503 && i_400_ < i_394_) {
                        val i_407_ = i_397_ + i_406_ * this.anInt7477
                        var i_408_ = this.anIntArray7483!![i_407_]
                        val i_409_ = i_392_ + i_408_
                        val i_410_ = (i_392_ and 0xff00ff) + (i_408_ and 0xff00ff)
                        i_408_ = (i_410_ and 0x1000100) + (i_409_ - i_410_ and 0x10000)
                        this.anIntArray7483!![i_407_] = i_409_ - i_408_ or i_408_ - (i_408_ ushr 8)
                    }
                    i_406_++
                    i_400_ = ++i_400_ % i_399_
                }
            } else throw IllegalArgumentException()
        }
    }

    override fun method3677(canvas: Canvas?) {
        if (canvas == null) {
            aCanvas7468 = null
            this.aClass348_Sub31_7469 = null
            if (aClass49_7475 == null) {
                this.anIntArray7483 = null
                anInt7486 = 1
                this.anInt7477 = anInt7486
                anInt7488 = 1
                anInt7495 = anInt7488
                method3717()
            }
        } else {
            val class348_sub31 = (aClass356_7467!!.method3480(canvas.hashCode().toLong(), -6008) as Class348_Sub31?)
            if (class348_sub31 != null) {
                aCanvas7468 = canvas
                val dimension = canvas.getSize()
                anInt7465 = dimension.width
                anInt7472 = dimension.height
                this.aClass348_Sub31_7469 = class348_sub31
                if (aClass49_7475 == null) {
                    this.anIntArray7483 = class348_sub31.anIntArray6916
                    this.anInt7477 = class348_sub31.anInt6917
                    anInt7486 = class348_sub31.anInt6920
                    if (this.anInt7477 != anInt7495 || anInt7486 != anInt7488) {
                        anInt7495 = this.anInt7477
                        anInt7481 = anInt7495
                        anInt7488 = anInt7486
                        anInt7493 = anInt7488
                        this.aFloatArray7511 = FloatArray(anInt7495 * anInt7488)
                        this.aFloatArray7502 = this.aFloatArray7511
                    }
                    method3717()
                }
            }
        }
    }

    override fun JA(i: Int, i_411_: Int, i_412_: Int, i_413_: Int, i_414_: Int, i_415_: Int): Int {
        var i_416_ = 0
        var f = ((this.aClass101_Sub1_7492!!.aFloat5662) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5680) * i_411_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5664) * i_412_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5681))
        if (f < 1.0f) f = 1.0f
        var f_417_ = ((this.aClass101_Sub1_7492!!.aFloat5662) * i_413_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5680) * i_414_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5664) * i_415_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5681))
        if (f_417_ < 1.0f) f_417_ = 1.0f
        if (f < this.anInt7482.toFloat() && f_417_ < this.anInt7482.toFloat()) i_416_ = i_416_ or 0x10
        else if (f > this.anInt7494.toFloat() && f_417_ > this.anInt7494.toFloat()) i_416_ = i_416_ or 0x20
        val i_418_ = (this.anInt7491.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5672) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5673 * i_411_.toFloat()) + (this.aClass101_Sub1_7492!!.aFloat5669 * i_412_.toFloat()) + this.aClass101_Sub1_7492!!.aFloat5686) / f).toInt()
        val i_419_ = (this.anInt7491.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5672) * i_413_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5673 * i_414_.toFloat()) + (this.aClass101_Sub1_7492!!.aFloat5669 * i_415_.toFloat()) + this.aClass101_Sub1_7492!!.aFloat5686) / f_417_).toInt()
        if (i_418_ < this.anInt7509 && i_419_ < this.anInt7509) i_416_ = i_416_ or 0x1
        else if (i_418_ > this.anInt7508 && i_419_ > this.anInt7508) i_416_ = i_416_ or 0x2
        val i_420_ = (this.anInt7497.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5655) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5678 * i_411_.toFloat()) + (this.aClass101_Sub1_7492!!.aFloat5666 * i_412_.toFloat()) + this.aClass101_Sub1_7492!!.aFloat5685) / f).toInt()
        val i_421_ = (this.anInt7497.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5655) * i_413_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5678 * i_414_.toFloat()) + (this.aClass101_Sub1_7492!!.aFloat5666 * i_415_.toFloat()) + this.aClass101_Sub1_7492!!.aFloat5685) / f_417_).toInt()
        if (i_420_ < this.anInt7490 && i_421_ < this.anInt7490) i_416_ = i_416_ or 0x4
        else if (i_420_ > this.anInt7506 && i_421_ > this.anInt7506) i_416_ = i_416_ or 0x8
        return i_416_
    }

    override fun method3678(i: Int) {
        aClass167Array7480!![i]!!.method1291(10000, null)
    }

    override fun method3672() {
        if (aCanvas7468 == null) {
            this.anInt7477 = 1
            anInt7486 = 1
            this.anIntArray7483 = null
            anInt7495 = 1
            anInt7488 = 1
            this.aFloatArray7511 = null
        } else {
            this.anIntArray7483 = (this.aClass348_Sub31_7469!!.anIntArray6916)
            this.anInt7477 = (this.aClass348_Sub31_7469!!.anInt6917)
            anInt7486 = (this.aClass348_Sub31_7469!!.anInt6920)
            this.aFloatArray7511 = this.aFloatArray7502
            anInt7495 = anInt7481
            anInt7488 = anInt7493
        }
        aClass49_7475 = null
        method3717()
    }

    fun method3722(i: Int): Int {
        return (this.aD4579!!.method3(i, -6662)!!.aShort208.toInt() and 0xffff)
    }

    override fun method3699(): Boolean {
        return false
    }

    override fun method3671(): Boolean {
        return false
    }

    override fun method3711(`is`: IntArray?, i: Int, i_422_: Int, i_423_: Int, i_424_: Int, bool: Boolean): Class105 {
        var bool_425_ = false
        var i_426_ = i
        while_229_@ for (i_427_ in 0..<i_424_) {
            for (i_428_ in 0..<i_423_) {
                val i_429_ = `is`!![i_426_++] ushr 24
                if (i_429_ != 0 && i_429_ != 255) {
                    bool_425_ = true
                    break@while_229_
                }
            }
        }
        if (bool_425_) return Class105_Sub3_Sub3(this, `is`!!, i, i_422_, i_423_, i_424_, bool)
        return Class105_Sub3_Sub1(this, `is`!!, i, i_422_, i_423_, i_424_, bool)
    }

    override fun method3691(class207: Class207?, bool: Boolean): Class105 {
        val `is` = class207!!.anIntArray2697
        val is_430_ = class207.aByteArray2699
        val i = class207.anInt2702
        val i_431_ = class207.anInt2696
        val class105_sub3: Class105_Sub3
        if (bool && class207.aByteArray2695 == null) {
            val is_432_ = IntArray(`is`.size)
            val is_433_ = ByteArray(i * i_431_)
            for (i_434_ in 0..<i_431_) {
                val i_435_ = i_434_ * i
                for (i_436_ in 0..<i) is_433_[i_435_ + i_436_] = is_430_[i_435_ + i_436_]
            }
            for (i_437_ in `is`.indices) is_432_[i_437_] = `is`[i_437_]
            class105_sub3 = Class105_Sub3_Sub2(this, is_433_, is_432_, i, i_431_)
        } else {
            val is_438_ = IntArray(i * i_431_)
            val is_439_ = class207.aByteArray2695
            if (is_439_ == null) {
                for (i_443_ in 0..<i_431_) {
                    val i_444_ = i_443_ * i
                    for (i_445_ in 0..<i) {
                        val i_446_ = `is`[is_430_[i_444_ + i_445_].toInt() and 0xff]
                        is_438_[i_444_ + i_445_] = if (i_446_ != 0) 0xffffff.inv() or i_446_ else 0
                    }
                }
                class105_sub3 = Class105_Sub3_Sub1(this, is_438_, i, i_431_)
            } else {
                for (i_440_ in 0..<i_431_) {
                    val i_441_ = i_440_ * i
                    for (i_442_ in 0..<i) is_438_[i_441_ + i_442_] = (`is`[is_430_[i_441_ + i_442_].toInt() and 0xff] or (is_439_[i_441_ + i_442_].toInt() shl 24))
                }
                class105_sub3 = Class105_Sub3_Sub3(this, is_438_, i, i_431_)
            }
        }
        class105_sub3.method985(class207.anInt2703, class207.anInt2700, class207.anInt2698, class207.anInt2701)
        return class105_sub3
    }

    private fun method3723(i: Int, i_447_: Int, i_448_: Int, i_449_: Int, i_450_: Int, i_451_: Int) {
        var i_447_ = i_447_
        var i_449_ = i_449_
        var i_450_ = i_450_
        if (i_449_ < 0) i_449_ = -i_449_
        var i_452_ = i_447_ - i_449_
        if (i_452_ < this.anInt7476) i_452_ = this.anInt7476
        var i_453_ = i_447_ + i_449_ + 1
        if (i_453_ > this.anInt7503) i_453_ = this.anInt7503
        var i_454_ = i_452_
        val i_455_ = i_449_ * i_449_
        var i_456_ = 0
        var i_457_ = i_447_ - i_454_
        var i_458_ = i_457_ * i_457_
        var i_459_ = i_458_ - i_457_
        if (i_447_ > i_453_) i_447_ = i_453_
        val i_460_ = i_450_ ushr 24
        if (i_451_ == 0 || i_451_ == 1 && i_460_ == 255) {
            while (i_454_ < i_447_) {
                while ( /**/i_459_ <= i_455_ || i_458_ <= i_455_) {
                    i_458_ += i_456_ + i_456_
                    i_459_ += i_456_++ + i_456_
                }
                var i_461_ = i - i_456_ + 1
                if (i_461_ < this.anInt7496) i_461_ = this.anInt7496
                var i_462_ = i + i_456_
                if (i_462_ > this.anInt7507) i_462_ = this.anInt7507
                var i_463_ = i_461_ + i_454_ * this.anInt7477
                for (i_464_ in i_461_..<i_462_) {
                    if (i_448_.toFloat() < this.aFloatArray7511!![i_463_]) this.anIntArray7483!![i_463_] = i_450_
                    i_463_++
                }
                i_454_++
                i_458_ -= i_457_-- + i_457_
                i_459_ -= i_457_ + i_457_
            }
            i_456_ = i_449_
            i_457_ = i_454_ - i_447_
            i_459_ = i_457_ * i_457_ + i_455_
            i_458_ = i_459_ - i_456_
            i_459_ -= i_457_
            while (i_454_ < i_453_) {
                while ( /**/i_459_ > i_455_ && i_458_ > i_455_) {
                    i_459_ -= i_456_-- + i_456_
                    i_458_ -= i_456_ + i_456_
                }
                var i_465_ = i - i_456_
                if (i_465_ < this.anInt7496) i_465_ = this.anInt7496
                var i_466_ = i + i_456_
                if (i_466_ > this.anInt7507 - 1) i_466_ = this.anInt7507 - 1
                var i_467_ = i_465_ + i_454_ * this.anInt7477
                for (i_468_ in i_465_..i_466_) {
                    if (i_448_.toFloat() < this.aFloatArray7511!![i_467_]) this.anIntArray7483!![i_467_] = i_450_
                    i_467_++
                }
                i_454_++
                i_459_ += i_457_ + i_457_
                i_458_ += i_457_++ + i_457_
            }
        } else if (i_451_ == 1) {
            i_450_ = (((i_450_ and 0xff00ff) * i_460_ shr 8 and 0xff00ff) + ((i_450_ and 0xff00) * i_460_ shr 8 and 0xff00) + (i_460_ shl 24))
            val i_469_ = 256 - i_460_
            while (i_454_ < i_447_) {
                while ( /**/i_459_ <= i_455_ || i_458_ <= i_455_) {
                    i_458_ += i_456_ + i_456_
                    i_459_ += i_456_++ + i_456_
                }
                var i_470_ = i - i_456_ + 1
                if (i_470_ < this.anInt7496) i_470_ = this.anInt7496
                var i_471_ = i + i_456_
                if (i_471_ > this.anInt7507) i_471_ = this.anInt7507
                var i_472_ = i_470_ + i_454_ * this.anInt7477
                for (i_473_ in i_470_..<i_471_) {
                    if (i_448_.toFloat() < this.aFloatArray7511!![i_472_]) {
                        var i_474_ = this.anIntArray7483!![i_472_]
                        i_474_ = (((i_474_ and 0xff00ff) * i_469_ shr 8 and 0xff00ff) + ((i_474_ and 0xff00) * i_469_ shr 8 and 0xff00))
                        this.anIntArray7483!![i_472_] = i_450_ + i_474_
                    }
                    i_472_++
                }
                i_454_++
                i_458_ -= i_457_-- + i_457_
                i_459_ -= i_457_ + i_457_
            }
            i_456_ = i_449_
            i_457_ = -i_457_
            i_459_ = i_457_ * i_457_ + i_455_
            i_458_ = i_459_ - i_456_
            i_459_ -= i_457_
            while (i_454_ < i_453_) {
                while ( /**/i_459_ > i_455_ && i_458_ > i_455_) {
                    i_459_ -= i_456_-- + i_456_
                    i_458_ -= i_456_ + i_456_
                }
                var i_475_ = i - i_456_
                if (i_475_ < this.anInt7496) i_475_ = this.anInt7496
                var i_476_ = i + i_456_
                if (i_476_ > this.anInt7507 - 1) i_476_ = this.anInt7507 - 1
                var i_477_ = i_475_ + i_454_ * this.anInt7477
                for (i_478_ in i_475_..i_476_) {
                    if (i_448_.toFloat() < this.aFloatArray7511!![i_477_]) {
                        var i_479_ = this.anIntArray7483!![i_477_]
                        i_479_ = (((i_479_ and 0xff00ff) * i_469_ shr 8 and 0xff00ff) + ((i_479_ and 0xff00) * i_469_ shr 8 and 0xff00))
                        this.anIntArray7483!![i_477_] = i_450_ + i_479_
                    }
                    i_477_++
                }
                i_454_++
                i_459_ += i_457_ + i_457_
                i_458_ += i_457_++ + i_457_
            }
        } else if (i_451_ == 2) {
            while (i_454_ < i_447_) {
                while ( /**/i_459_ <= i_455_ || i_458_ <= i_455_) {
                    i_458_ += i_456_ + i_456_
                    i_459_ += i_456_++ + i_456_
                }
                var i_480_ = i - i_456_ + 1
                if (i_480_ < this.anInt7496) i_480_ = this.anInt7496
                var i_481_ = i + i_456_
                if (i_481_ > this.anInt7507) i_481_ = this.anInt7507
                var i_482_ = i_480_ + i_454_ * this.anInt7477
                for (i_483_ in i_480_..<i_481_) {
                    if (i_448_.toFloat() < this.aFloatArray7511!![i_482_]) {
                        var i_484_ = this.anIntArray7483!![i_482_]
                        val i_485_ = i_450_ + i_484_
                        val i_486_ = (i_450_ and 0xff00ff) + (i_484_ and 0xff00ff)
                        i_484_ = (i_486_ and 0x1000100) + (i_485_ - i_486_ and 0x10000)
                        this.anIntArray7483!![i_482_] = i_485_ - i_484_ or i_484_ - (i_484_ ushr 8)
                    }
                    i_482_++
                }
                i_454_++
                i_458_ -= i_457_-- + i_457_
                i_459_ -= i_457_ + i_457_
            }
            i_456_ = i_449_
            i_457_ = -i_457_
            i_459_ = i_457_ * i_457_ + i_455_
            i_458_ = i_459_ - i_456_
            i_459_ -= i_457_
            while (i_454_ < i_453_) {
                while ( /**/i_459_ > i_455_ && i_458_ > i_455_) {
                    i_459_ -= i_456_-- + i_456_
                    i_458_ -= i_456_ + i_456_
                }
                var i_487_ = i - i_456_
                if (i_487_ < this.anInt7496) i_487_ = this.anInt7496
                var i_488_ = i + i_456_
                if (i_488_ > this.anInt7507 - 1) i_488_ = this.anInt7507 - 1
                var i_489_ = i_487_ + i_454_ * this.anInt7477
                for (i_490_ in i_487_..i_488_) {
                    if (i_448_.toFloat() < this.aFloatArray7511!![i_489_]) {
                        var i_491_ = this.anIntArray7483!![i_489_]
                        val i_492_ = i_450_ + i_491_
                        val i_493_ = (i_450_ and 0xff00ff) + (i_491_ and 0xff00ff)
                        i_491_ = (i_493_ and 0x1000100) + (i_492_ - i_493_ and 0x10000)
                        this.anIntArray7483!![i_489_] = i_492_ - i_491_ or i_491_ - (i_491_ ushr 8)
                    }
                    i_489_++
                }
                i_454_++
                i_459_ += i_457_ + i_457_
                i_458_ += i_457_++ + i_457_
            }
        } else throw IllegalArgumentException()
    }

    override fun method3688(i: Int, i_494_: Int, i_495_: Int, i_496_: Int, i_497_: Int, i_498_: Int, i_499_: Int) {
        var i = i
        var i_494_ = i_494_
        val class167 = method3724(Thread.currentThread())
        val class109 = class167!!.aClass109_2220!!
        var i_500_ = i_495_ - i
        var i_501_ = i_496_ - i_494_
        val i_502_ = if (i_500_ >= 0) i_500_ else -i_500_
        val i_503_ = if (i_501_ >= 0) i_501_ else -i_501_
        var i_504_ = i_502_
        if (i_504_ < i_503_) i_504_ = i_503_
        if (i_504_ != 0) {
            var i_505_ = (i_500_ shl 16) / i_504_
            var i_506_ = (i_501_ shl 16) / i_504_
            i_500_ += i_505_ shr 16
            i_501_ += i_506_ shr 16
            if (i_506_ <= i_505_) i_505_ = -i_505_
            else i_506_ = -i_506_
            val i_507_ = i_498_ * i_506_ shr 17
            val i_508_ = i_498_ * i_506_ + 1 shr 17
            val i_509_ = i_498_ * i_505_ shr 17
            val i_510_ = i_498_ * i_505_ + 1 shr 17
            i -= class109.method1028()
            i_494_ -= class109.method1017()
            val i_511_ = i + i_507_
            val i_512_ = i - i_508_
            val i_513_ = i + i_500_ - i_508_
            val i_514_ = i + i_500_ + i_507_
            val i_515_ = i_494_ + i_509_
            val i_516_ = i_494_ - i_510_
            val i_517_ = i_494_ + i_501_ - i_510_
            val i_518_ = i_494_ + i_501_ + i_509_
            if (i_499_ == 0) class109.anInt1674 = 0
            else if (i_499_ == 1) class109.anInt1674 = 255 - (i_497_ ushr 24)
            else throw IllegalArgumentException()
            C(false)
            class109.aBoolean1671 = (i_511_ < 0 || i_511_ > class109.anInt1679 || i_512_ < 0 || i_512_ > class109.anInt1679 || i_513_ < 0 || i_513_ > class109.anInt1679)
            class109.method1018(i_515_.toFloat(), i_516_.toFloat(), i_517_.toFloat(), i_511_.toFloat(), i_512_.toFloat(), i_513_.toFloat(), 100.0f, 100.0f, 100.0f, i_497_)
            class109.aBoolean1671 = (i_511_ < 0 || i_511_ > class109.anInt1679 || i_513_ < 0 || i_513_ > class109.anInt1679 || i_514_ < 0 || i_514_ > class109.anInt1679)
            class109.method1018(i_515_.toFloat(), i_517_.toFloat(), i_518_.toFloat(), i_511_.toFloat(), i_513_.toFloat(), i_514_.toFloat(), 100.0f, 100.0f, 100.0f, i_497_)
            C(true)
        }
    }

    override fun method3629(i: Int, i_519_: Int, bool: Boolean): Class105 {
        if (bool) return Class105_Sub3_Sub3(this, i, i_519_)
        return Class105_Sub3_Sub1(this, i, i_519_)
    }

    override fun method3630(bool: Boolean) {
        aBoolean7489 = bool
        aClass60_7498.method590(0)
    }

    override fun method3650(i: Int) {
        Class64_Sub1.anInt5350 = i
        Class64_Sub1.anInt5346 = Class64_Sub1.anInt5350
        check(this.anInt7485 <= 1) { "No MT" }
        method3631(this.anInt7485)
        method3659(0)
    }

    override fun method3690(i: Int, i_520_: Int, i_521_: Int, i_522_: Int, i_523_: Int, f: Float): Class348_Sub1? {
        return null
    }

    override fun method3666(): Boolean {
        return false
    }

    override fun method3706(class299: Class299?, class299_524_: Class299?, f: Float, class299_525_: Class299?): Class299? {
        return null
    }

    override fun za(i: Int, i_526_: Int, i_527_: Int, i_528_: Int, i_529_: Int) {
        var i_526_ = i_526_
        var i_527_ = i_527_
        var i_528_ = i_528_
        if (i_527_ < 0) i_527_ = -i_527_
        var i_530_ = i_526_ - i_527_
        if (i_530_ < this.anInt7476) i_530_ = this.anInt7476
        var i_531_ = i_526_ + i_527_ + 1
        if (i_531_ > this.anInt7503) i_531_ = this.anInt7503
        var i_532_ = i_530_
        val i_533_ = i_527_ * i_527_
        var i_534_ = 0
        var i_535_ = i_526_ - i_532_
        var i_536_ = i_535_ * i_535_
        var i_537_ = i_536_ - i_535_
        if (i_526_ > i_531_) i_526_ = i_531_
        val i_538_ = i_528_ ushr 24
        if (i_529_ == 0 || i_529_ == 1 && i_538_ == 255) {
            while (i_532_ < i_526_) {
                while ( /**/i_537_ <= i_533_ || i_536_ <= i_533_) {
                    i_536_ += i_534_ + i_534_
                    i_537_ += i_534_++ + i_534_
                }
                var i_539_ = i - i_534_ + 1
                if (i_539_ < this.anInt7496) i_539_ = this.anInt7496
                var i_540_ = i + i_534_
                if (i_540_ > this.anInt7507) i_540_ = this.anInt7507
                var i_541_ = i_539_ + i_532_ * this.anInt7477
                for (i_542_ in i_539_..<i_540_) this.anIntArray7483!![i_541_++] = i_528_
                i_532_++
                i_536_ -= i_535_-- + i_535_
                i_537_ -= i_535_ + i_535_
            }
            i_534_ = i_527_
            i_535_ = i_532_ - i_526_
            i_537_ = i_535_ * i_535_ + i_533_
            i_536_ = i_537_ - i_534_
            i_537_ -= i_535_
            while (i_532_ < i_531_) {
                while ( /**/i_537_ > i_533_ && i_536_ > i_533_) {
                    i_537_ -= i_534_-- + i_534_
                    i_536_ -= i_534_ + i_534_
                }
                var i_543_ = i - i_534_
                if (i_543_ < this.anInt7496) i_543_ = this.anInt7496
                var i_544_ = i + i_534_
                if (i_544_ > this.anInt7507 - 1) i_544_ = this.anInt7507 - 1
                var i_545_ = i_543_ + i_532_ * this.anInt7477
                for (i_546_ in i_543_..i_544_) this.anIntArray7483!![i_545_++] = i_528_
                i_532_++
                i_537_ += i_535_ + i_535_
                i_536_ += i_535_++ + i_535_
            }
        } else if (i_529_ == 1) {
            i_528_ = (((i_528_ and 0xff00ff) * i_538_ shr 8 and 0xff00ff) + ((i_528_ and 0xff00) * i_538_ shr 8 and 0xff00) + (i_538_ shl 24))
            val i_547_ = 256 - i_538_
            while (i_532_ < i_526_) {
                while ( /**/i_537_ <= i_533_ || i_536_ <= i_533_) {
                    i_536_ += i_534_ + i_534_
                    i_537_ += i_534_++ + i_534_
                }
                var i_548_ = i - i_534_ + 1
                if (i_548_ < this.anInt7496) i_548_ = this.anInt7496
                var i_549_ = i + i_534_
                if (i_549_ > this.anInt7507) i_549_ = this.anInt7507
                var i_550_ = i_548_ + i_532_ * this.anInt7477
                for (i_551_ in i_548_..<i_549_) {
                    var i_552_ = this.anIntArray7483!![i_550_]
                    i_552_ = (((i_552_ and 0xff00ff) * i_547_ shr 8 and 0xff00ff) + ((i_552_ and 0xff00) * i_547_ shr 8 and 0xff00))
                    this.anIntArray7483!![i_550_++] = i_528_ + i_552_
                }
                i_532_++
                i_536_ -= i_535_-- + i_535_
                i_537_ -= i_535_ + i_535_
            }
            i_534_ = i_527_
            i_535_ = -i_535_
            i_537_ = i_535_ * i_535_ + i_533_
            i_536_ = i_537_ - i_534_
            i_537_ -= i_535_
            while (i_532_ < i_531_) {
                while ( /**/i_537_ > i_533_ && i_536_ > i_533_) {
                    i_537_ -= i_534_-- + i_534_
                    i_536_ -= i_534_ + i_534_
                }
                var i_553_ = i - i_534_
                if (i_553_ < this.anInt7496) i_553_ = this.anInt7496
                var i_554_ = i + i_534_
                if (i_554_ > this.anInt7507 - 1) i_554_ = this.anInt7507 - 1
                var i_555_ = i_553_ + i_532_ * this.anInt7477
                for (i_556_ in i_553_..i_554_) {
                    var i_557_ = this.anIntArray7483!![i_555_]
                    i_557_ = (((i_557_ and 0xff00ff) * i_547_ shr 8 and 0xff00ff) + ((i_557_ and 0xff00) * i_547_ shr 8 and 0xff00))
                    this.anIntArray7483!![i_555_++] = i_528_ + i_557_
                }
                i_532_++
                i_537_ += i_535_ + i_535_
                i_536_ += i_535_++ + i_535_
            }
        } else if (i_529_ == 2) {
            while (i_532_ < i_526_) {
                while ( /**/i_537_ <= i_533_ || i_536_ <= i_533_) {
                    i_536_ += i_534_ + i_534_
                    i_537_ += i_534_++ + i_534_
                }
                var i_558_ = i - i_534_ + 1
                if (i_558_ < this.anInt7496) i_558_ = this.anInt7496
                var i_559_ = i + i_534_
                if (i_559_ > this.anInt7507) i_559_ = this.anInt7507
                var i_560_ = i_558_ + i_532_ * this.anInt7477
                for (i_561_ in i_558_..<i_559_) {
                    var i_562_ = this.anIntArray7483!![i_560_]
                    val i_563_ = i_528_ + i_562_
                    val i_564_ = (i_528_ and 0xff00ff) + (i_562_ and 0xff00ff)
                    i_562_ = (i_564_ and 0x1000100) + (i_563_ - i_564_ and 0x10000)
                    this.anIntArray7483!![i_560_++] = i_563_ - i_562_ or i_562_ - (i_562_ ushr 8)
                }
                i_532_++
                i_536_ -= i_535_-- + i_535_
                i_537_ -= i_535_ + i_535_
            }
            i_534_ = i_527_
            i_535_ = -i_535_
            i_537_ = i_535_ * i_535_ + i_533_
            i_536_ = i_537_ - i_534_
            i_537_ -= i_535_
            while (i_532_ < i_531_) {
                while ( /**/i_537_ > i_533_ && i_536_ > i_533_) {
                    i_537_ -= i_534_-- + i_534_
                    i_536_ -= i_534_ + i_534_
                }
                var i_565_ = i - i_534_
                if (i_565_ < this.anInt7496) i_565_ = this.anInt7496
                var i_566_ = i + i_534_
                if (i_566_ > this.anInt7507 - 1) i_566_ = this.anInt7507 - 1
                var i_567_ = i_565_ + i_532_ * this.anInt7477
                for (i_568_ in i_565_..i_566_) {
                    var i_569_ = this.anIntArray7483!![i_567_]
                    val i_570_ = i_528_ + i_569_
                    val i_571_ = (i_528_ and 0xff00ff) + (i_569_ and 0xff00ff)
                    i_569_ = (i_571_ and 0x1000100) + (i_570_ - i_571_ and 0x10000)
                    this.anIntArray7483!![i_567_++] = i_570_ - i_569_ or i_569_ - (i_569_ ushr 8)
                }
                i_532_++
                i_537_ += i_535_ + i_535_
                i_536_ += i_535_++ + i_535_
            }
        } else throw IllegalArgumentException()
    }

    fun method3724(runnable: Runnable?): Class167? {
        for (i in 0..<this.anInt7485) {
            if (aClass167Array7480!![i]!!.aRunnable2198 === runnable) return aClass167Array7480!![i]!!
        }
        return null
    }

    override fun E(): Int {
        return 0
    }

    @Throws(Exception_Sub1::class)
    override fun method3626(i: Int, i_572_: Int) {
        check(!(aCanvas7468 == null || this.aClass348_Sub31_7469 == null)) { "off" }
        try {
            val graphics = aCanvas7468!!.getGraphics()
            this.aClass348_Sub31_7469!!.method3011(0, i, anInt7472, graphics, -1, 0, anInt7465, i_572_)
        } catch (exception: Exception) {
            aCanvas7468!!.repaint()
        }
    }

    override fun ZA(i: Int, f: Float, f_573_: Float, f_574_: Float, f_575_: Float, f_576_: Float) {
        this.anInt7474 = (f * 65535.0f).toInt()
        this.anInt7478 = (f_573_ * 65535.0f).toInt()
        val f_577_ = sqrt((f_574_ * f_574_ + f_575_ * f_575_ + f_576_ * f_576_).toDouble()).toFloat()
        this.anInt7484 = (f_574_ * 65535.0f / f_577_).toInt()
        this.anInt7473 = (f_575_ * 65535.0f / f_577_).toInt()
        this.anInt7479 = (f_576_ * 65535.0f / f_577_).toInt()
    }

    override fun method3696(i: Int) {
        this.anInt7501 = i
        aClass60_7498.method590(0)
    }

    override fun method3669(canvas: Canvas?, i: Int, i_578_: Int) {
        var class348_sub31 = (aClass356_7467!!.method3480(canvas.hashCode().toLong(), -6008) as Class348_Sub31?)
        if (class348_sub31 != null) {
            class348_sub31.method2715(95.toByte())
            class348_sub31 = Class110.method1035(9029, i_578_, canvas, i)!!
            aClass356_7467!!.method3483(112.toByte(), canvas.hashCode().toLong(), class348_sub31)
            if (aCanvas7468 === canvas && aClass49_7475 == null) {
                val dimension = canvas!!.getSize()
                anInt7465 = dimension.width
                anInt7472 = dimension.height
                this.aClass348_Sub31_7469 = class348_sub31
                this.anIntArray7483 = class348_sub31.anIntArray6916
                this.anInt7477 = class348_sub31.anInt6917
                anInt7486 = class348_sub31.anInt6920
                if (this.anInt7477 != anInt7495 || anInt7486 != anInt7488) {
                    anInt7495 = this.anInt7477
                    anInt7481 = anInt7495
                    anInt7488 = anInt7486
                    anInt7493 = anInt7488
                    this.aFloatArray7511 = FloatArray(anInt7495 * anInt7488)
                    this.aFloatArray7502 = this.aFloatArray7511
                }
                method3717()
            }
        }
    }

    override fun r(i: Int, i_579_: Int, i_580_: Int, i_581_: Int, i_582_: Int, i_583_: Int, i_584_: Int): Int {
        val f = ((this.aClass101_Sub1_7492!!.aFloat5662) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5680) * i_579_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5664) * i_580_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5681))
        val f_585_ = ((this.aClass101_Sub1_7492!!.aFloat5662) * i_581_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5680) * i_582_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5664) * i_583_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5681))
        var i_586_ = 0
        if (f < this.anInt7482.toFloat() && f_585_ < this.anInt7482.toFloat()) i_586_ = i_586_ or 0x10
        else if (f > this.anInt7494.toFloat() && f_585_ > this.anInt7494.toFloat()) i_586_ = i_586_ or 0x20
        val i_587_ = (this.anInt7491.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5672) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5673 * i_579_.toFloat()) + (this.aClass101_Sub1_7492!!.aFloat5669 * i_580_.toFloat()) + this.aClass101_Sub1_7492!!.aFloat5686) / i_584_.toFloat()).toInt()
        val i_588_ = (this.anInt7491.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5672) * i_581_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5673 * i_582_.toFloat()) + (this.aClass101_Sub1_7492!!.aFloat5669 * i_583_.toFloat()) + this.aClass101_Sub1_7492!!.aFloat5686) / i_584_.toFloat()).toInt()
        if (i_587_ < this.anInt7509 && i_588_ < this.anInt7509) i_586_ = i_586_ or 0x1
        else if (i_587_ > this.anInt7508 && i_588_ > this.anInt7508) i_586_ = i_586_ or 0x2
        val i_589_ = (this.anInt7497.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5655) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5678 * i_579_.toFloat()) + (this.aClass101_Sub1_7492!!.aFloat5666 * i_580_.toFloat()) + this.aClass101_Sub1_7492!!.aFloat5685) / i_584_.toFloat()).toInt()
        val i_590_ = (this.anInt7497.toFloat() * ((this.aClass101_Sub1_7492!!.aFloat5655) * i_581_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5678 * i_582_.toFloat()) + (this.aClass101_Sub1_7492!!.aFloat5666 * i_583_.toFloat()) + this.aClass101_Sub1_7492!!.aFloat5685) / i_584_.toFloat()).toInt()
        if (i_589_ < this.anInt7490 && i_590_ < this.anInt7490) i_586_ = i_586_ or 0x4
        else if (i_589_ > this.anInt7506 && i_590_ > this.anInt7506) i_586_ = i_586_ or 0x8
        return i_586_
    }

    fun method3725(i: Int): Boolean {
        return this.aD4579!!.method4(-7953, i)
    }

    init {
        aClass356_7467 = Class356(4)
        this.anInt7474 = 45823
        aBoolean7489 = false
        anInt7487 = 0
        this.anInt7501 = 128
        this.anInt7476 = 0
        this.anInt7482 = 50
        this.anInt7503 = 0
        this.anInt7496 = 0
        this.anInt7497 = 512
        this.anInt7500 = 75518
        this.anInt7491 = 512
        anInt7505 = 0
        this.anInt7494 = 3500
        this.anInt7507 = 0
        this.anInt7478 = 78642
        aClass60_7499 = Class60(16)
        anInt7512 = -1
        try {
            aClass60_7498 = Class60(256)
            this.aClass101_Sub1_7492 = Class101_Sub1()
            method3631(1)
            method3659(0)
            Class59_Sub2_Sub1.method566(true, true, (-126).toByte())
            aBoolean7471 = true
            anInt7466 = Class62.method599(-70).toInt()
        } catch (throwable: Throwable) {
            throwable.printStackTrace()
            this.method3635((-98).toByte())
            throw RuntimeException("")
        }
    }

    override fun method3708(): Boolean {
        return true
    }

    public override fun K(`is`: IntArray?) {
        `is`!![0] = this.anInt7496
        `is`!![1] = this.anInt7476
        `is`!![2] = this.anInt7507
        `is`!![3] = this.anInt7503
    }

    override fun method3702(i: Int): za? {
        return null
    }

    override fun method3665(i: Int, i_591_: Int): Interface3 {
        return method3629(i, i_591_, false)
    }

    override fun method3674(i: Int, i_592_: Int, i_593_: Int, i_594_: Int, i_595_: Int, i_596_: Int, i_597_: Int, i_598_: Int, i_599_: Int) {
        var i = i
        var i_592_ = i_592_
        var i_593_ = i_593_
        var i_594_ = i_594_
        var i_595_ = i_595_
        var i_597_ = i_597_
        var i_598_ = i_598_
        var i_599_ = i_599_
        i_593_ -= i
        i_594_ -= i_592_
        if (i_594_ == 0) {
            if (i_593_ >= 0) method3715(i, i_592_, i_593_ + 1, i_595_, i_596_, i_597_, i_598_, i_599_)
            else {
                val i_600_ = i_597_ + i_598_
                i_599_ %= i_600_
                i_599_ = i_600_ + i_597_ - i_599_ - (-i_593_ + 1) % i_600_
                i_599_ %= i_600_
                if (i_599_ < 0) i_599_ += i_600_
                method3715(i + i_593_, i_592_, -i_593_ + 1, i_595_, i_596_, i_597_, i_598_, i_599_)
            }
        } else if (i_593_ == 0) {
            if (i_594_ >= 0) method3721(i, i_592_, i_594_ + 1, i_595_, i_596_, i_597_, i_598_, i_599_)
            else {
                val i_601_ = i_597_ + i_598_
                i_599_ %= i_601_
                i_599_ = i_601_ + i_597_ - i_599_ - (-i_594_ + 1) % i_601_
                i_599_ %= i_601_
                if (i_599_ < 0) i_599_ += i_601_
                method3721(i, i_592_ + i_594_, -i_594_ + 1, i_595_, i_596_, i_597_, i_598_, i_599_)
            }
        } else {
            i_599_ = i_599_ shl 8
            i_597_ = i_597_ shl 8
            i_598_ = i_598_ shl 8
            val i_602_ = i_597_ + i_598_
            i_599_ %= i_602_
            if (i_593_ + i_594_ < 0) {
                val i_603_ = (sqrt((i_593_ * i_593_ + i_594_ * i_594_).toDouble()) * 256.0).toInt()
                val i_604_ = i_603_ % i_602_
                i_599_ = i_602_ + i_597_ - i_599_ - i_604_
                i_599_ %= i_602_
                if (i_599_ < 0) i_599_ += i_602_
                i += i_593_
                i_593_ = -i_593_
                i_592_ += i_594_
                i_594_ = -i_594_
            }
            if (i_593_ > i_594_) {
                i_592_ = i_592_ shl 16
                i_592_ += 32768
                i_594_ = i_594_ shl 16
                val i_605_ = floor(i_594_.toDouble() / i_593_.toDouble() + 0.5).toInt()
                i_593_ += i
                val i_606_ = i_595_ ushr 24
                val i_607_ = sqrt((65536 + (i_605_ shr 8) * (i_605_ shr 8)).toDouble()).toInt()
                if (i_596_ == 0 || i_596_ == 1 && i_606_ == 255) {
                    while (i <= i_593_) {
                        val i_608_ = i_592_ shr 16
                        if (i >= this.anInt7496 && i < this.anInt7507 && i_608_ >= this.anInt7476 && i_608_ < this.anInt7503 && i_599_ < i_597_) this.anIntArray7483!![i + i_608_ * this.anInt7477] = i_595_
                        i_592_ += i_605_
                        i++
                        i_599_ += i_607_
                        i_599_ %= i_602_
                    }
                    return
                }
                if (i_596_ == 1) {
                    i_595_ = (((i_595_ and 0xff00ff) * i_606_ shr 8 and 0xff00ff) + ((i_595_ and 0xff00) * i_606_ shr 8 and 0xff00) + (i_606_ shl 24))
                    val i_609_ = 256 - i_606_
                    while (i <= i_593_) {
                        val i_610_ = i_592_ shr 16
                        if (i >= this.anInt7496 && i < this.anInt7507 && i_610_ >= this.anInt7476 && i_610_ < this.anInt7503 && i_599_ < i_597_) {
                            val i_611_ = i + i_610_ * this.anInt7477
                            var i_612_ = this.anIntArray7483!![i_611_]
                            i_612_ = (((i_612_ and 0xff00ff) * i_609_ shr 8 and 0xff00ff) + ((i_612_ and 0xff00) * i_609_ shr 8 and 0xff00))
                            this.anIntArray7483!![i_611_] = i_595_ + i_612_
                        }
                        i_592_ += i_605_
                        i++
                        i_599_ += i_607_
                        i_599_ %= i_602_
                    }
                    return
                }
                if (i_596_ == 2) {
                    while (i <= i_593_) {
                        val i_613_ = i_592_ shr 16
                        if (i >= this.anInt7496 && i < this.anInt7507 && i_613_ >= this.anInt7476 && i_613_ < this.anInt7503 && i_599_ < i_597_) {
                            val i_614_ = i + i_613_ * this.anInt7477
                            var i_615_ = this.anIntArray7483!![i_614_]
                            val i_616_ = i_595_ + i_615_
                            val i_617_ = (i_595_ and 0xff00ff) + (i_615_ and 0xff00ff)
                            i_615_ = (i_617_ and 0x1000100) + (i_616_ - i_617_ and 0x10000)
                            this.anIntArray7483!![i_614_] = i_616_ - i_615_ or i_615_ - (i_615_ ushr 8)
                        }
                        i_592_ += i_605_
                        i++
                        i_599_ += i_607_
                        i_599_ %= i_602_
                    }
                    return
                }
                throw IllegalArgumentException()
            }
            i = i shl 16
            i += 32768
            i_593_ = i_593_ shl 16
            val i_618_ = floor(i_593_.toDouble() / i_594_.toDouble() + 0.5).toInt()
            i_594_ += i_592_
            val i_619_ = i_595_ ushr 24
            val i_620_ = sqrt((65536 + (i_618_ shr 8) * (i_618_ shr 8)).toDouble()).toInt()
            if (i_596_ == 0 || i_596_ == 1 && i_619_ == 255) {
                while (i_592_ <= i_594_) {
                    val i_621_ = i shr 16
                    if (i_592_ >= this.anInt7476 && i_592_ < this.anInt7503 && i_621_ >= this.anInt7496 && i_621_ < this.anInt7507 && i_599_ < i_597_) this.anIntArray7483!![i_621_ + i_592_ * this.anInt7477] = i_595_
                    i += i_618_
                    i_592_++
                    i_599_ += i_620_
                    i_599_ %= i_602_
                }
            } else if (i_596_ == 1) {
                i_595_ = (((i_595_ and 0xff00ff) * i_619_ shr 8 and 0xff00ff) + ((i_595_ and 0xff00) * i_619_ shr 8 and 0xff00) + (i_619_ shl 24))
                val i_622_ = 256 - i_619_
                while (i_592_ <= i_594_) {
                    val i_623_ = i shr 16
                    if (i_592_ >= this.anInt7476 && i_592_ < this.anInt7503 && i_623_ >= this.anInt7496 && i_623_ < this.anInt7507 && i_599_ < i_597_) {
                        val i_624_ = i_623_ + i_592_ * this.anInt7477
                        var i_625_ = this.anIntArray7483!![i_624_]
                        i_625_ = (((i_625_ and 0xff00ff) * i_622_ shr 8 and 0xff00ff) + ((i_625_ and 0xff00) * i_622_ shr 8 and 0xff00))
                        this.anIntArray7483!![i_623_ + i_592_ * this.anInt7477] = i_595_ + i_625_
                    }
                    i += i_618_
                    i_592_++
                    i_599_ += i_620_
                    i_599_ %= i_602_
                }
            } else if (i_596_ == 2) {
                while (i_592_ <= i_594_) {
                    val i_626_ = i shr 16
                    if (i_592_ >= this.anInt7476 && i_592_ < this.anInt7503 && i_626_ >= this.anInt7496 && i_626_ < this.anInt7507 && i_599_ < i_597_) {
                        val i_627_ = i_626_ + i_592_ * this.anInt7477
                        var i_628_ = this.anIntArray7483!![i_627_]
                        val i_629_ = i_595_ + i_628_
                        val i_630_ = (i_595_ and 0xff00ff) + (i_628_ and 0xff00ff)
                        i_628_ = (i_630_ and 0x1000100) + (i_629_ - i_630_ and 0x10000)
                        this.anIntArray7483!![i_627_] = i_629_ - i_628_ or i_628_ - (i_628_ ushr 8)
                    }
                    i += i_618_
                    i_592_++
                    i_599_ += i_620_
                    i_599_ %= i_602_
                }
            } else throw IllegalArgumentException()
        }
    }

    override fun X(i: Int) {
        /* empty */
    }

    override fun c(): Class365 {
        return Class365(0, "Pure Java", 1, "CPU", 0L)
    }

    override fun method3659(i: Int) {
        aClass167Array7480!![i]!!.method1291(10000, Thread.currentThread())
    }

    @Throws(Exception_Sub1::class)
    override fun method3707(rectangles: Array<Rectangle?>?, i: Int, i_631_: Int, i_632_: Int) {
        check(!(aCanvas7468 == null || this.aClass348_Sub31_7469 == null)) { "off" }
        try {
            val graphics = aCanvas7468!!.getGraphics()
            for (i_633_ in 0..<i) {
                val rectangle = rectangles!![i_633_]!!
                if (rectangle.x + i_631_ <= this.anInt7477 && rectangle.y + i_632_ <= anInt7486 && rectangle.x + i_631_ + rectangle.width > 0 && rectangle.y + i_632_ + rectangle.height > 0) this.aClass348_Sub31_7469!!.method3011(rectangle.y, rectangle.x + i_631_, rectangle.height, graphics, -1, rectangle.x, rectangle.width, rectangle.y + i_632_)
            }
        } catch (exception: Exception) {
            aCanvas7468!!.repaint()
        }
    }

    override fun M(): Int {
        val i = anInt7505
        anInt7505 = 0
        return i
    }

    fun method3726(i: Int): Int {
        return this.aD4579!!.method3(i, -6662)!!.anInt200
    }

    override fun I(): Int {
        val i = anInt7487
        anInt7487 = 0
        return i
    }

    override fun method3704(): Int {
        return 0
    }

    override fun method3646(i: Int) {
        val i_634_ = i - anInt7466
        var `object` = aClass60_7498.method588(-5052)
        while (`object` != null) {
            val class348_sub25 = `object` as Class348_Sub25
            if (class348_sub25.aBoolean6882) {
                class348_sub25.anInt6879 += i_634_
                val i_635_ = class348_sub25.anInt6879 / 20
                if (i_635_ > 0) {
                    val class12 = this.aD4579!!.method3((class348_sub25.anInt6883), -6662)
                    class348_sub25.method2995((class12!!.aByte198 * i_634_ * 50 / 1000), (class12.aByte211 * i_634_ * 50 / 1000))
                    class348_sub25.anInt6879 -= i_635_ * 20
                }
                class348_sub25.aBoolean6882 = false
            }
            `object` = aClass60_7498.method579(-117)
        }
        anInt7466 = i
        aClass60_7499.method578(2, 5)
        aClass60_7498.method578(2, 5)
    }

    override fun method3694(): Boolean {
        return true
    }

    override fun da(i: Int, i_636_: Int, i_637_: Int, `is`: IntArray?) {
        val f = ((this.aClass101_Sub1_7492!!.aFloat5681) + ((this.aClass101_Sub1_7492!!.aFloat5662) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5680) * i_636_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5664) * i_637_.toFloat()))
        if (f >= this.anInt7482.toFloat() && f <= this.anInt7494.toFloat()) {
            val i_638_ = (this.anInt7491.toFloat() * (this.aClass101_Sub1_7492!!.aFloat5686 + ((this.aClass101_Sub1_7492!!.aFloat5672) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5673) * i_636_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5669) * i_637_.toFloat())) / f).toInt()
            val i_639_ = (this.anInt7497.toFloat() * (this.aClass101_Sub1_7492!!.aFloat5685 + ((this.aClass101_Sub1_7492!!.aFloat5655) * i.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5678) * i_636_.toFloat() + (this.aClass101_Sub1_7492!!.aFloat5666) * i_637_.toFloat())) / f).toInt()
            if (i_638_ >= this.anInt7509 && i_638_ <= this.anInt7508 && i_639_ >= this.anInt7490 && i_639_ <= this.anInt7506) {
                `is`!![0] = i_638_ - this.anInt7509
                `is`[1] = i_639_ - this.anInt7490
                `is`[2] = f.toInt()
            } else {
                `is`!![2] = -1
                `is`[1] = `is`[2]
                `is`[0] = `is`[1]
            }
        } else {
            `is`!![2] = -1
            `is`[1] = `is`[2]
            `is`[0] = `is`[1]
        }
    }

    override fun method3673() {
        /* empty */
    }

    override fun method3644(): Boolean {
        return false
    }

    override fun method3663() {
        aClass60_7498.method590(0)
        aClass60_7499.method590(0)
    }

    override fun method3679(i: Int, i_640_: Int): Int {
        return i or i_640_
    }

    fun method3727(i: Int): Boolean {
        return aBoolean7489 || this.aD4579!!.method3(i, -6662)!!.aBoolean199
    }
}
