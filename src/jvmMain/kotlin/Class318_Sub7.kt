import Class373.Companion.method3591
import Class75.Companion.method756
import Class75.Companion.method760
import Class75.Companion.method761
import Class94.method867
import InputStream_Sub1.Companion.method126
import kotlin.math.atan2
import kotlin.math.sqrt

/* Class318_Sub7 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub7 internal constructor(var_ha: ha?, class129: Class129?, class318_sub10: Class318_Sub10?, l: Long) : Class318() {
    var aClass243_6433: Class243? = null
    private var anInt6434 = 0
    private val aLong6435: Long
    var aClass129_6436: Class129? = null
    var aClass318_Sub10_6439: Class318_Sub10? = null
    var aClass181_6441: Class181? = null
    var aClass284_6444: Class284
    var aBoolean6446: Boolean = false
    var anInt6447: Int = 0
    private var aClass284_6449: Class284
    private var anInt6452 = 0
    private var aBoolean6453: Boolean
    private var anInt6454 = 0
    private var anInt6455 = 0
    private var anInt6456 = 0
    private var anInt6457 = 0
    private var anInt6458 = 0
    private var anInt6459 = 0

    fun method2507(bool: Boolean) {
        this.aClass284_6444.anInt3670 = this.aClass129_6436!!.anInt1890
        anInt6448++
        this.aClass284_6444.anInt3666 = this.aClass129_6436!!.anInt1889
        this.aClass284_6444.anInt3668 = this.aClass129_6436!!.anInt1883
        this.aClass284_6444.anInt3669 = this.aClass129_6436!!.anInt1874
        this.aClass284_6444.anInt3680 = this.aClass129_6436!!.anInt1876
        this.aClass284_6444.anInt3679 = this.aClass129_6436!!.anInt1880
        this.aClass284_6444.anInt3678 = this.aClass129_6436!!.anInt1891
        this.aClass284_6444.anInt3672 = this.aClass129_6436!!.anInt1884
        if (bool == true) {
            this.aClass284_6444.anInt3675 = this.aClass129_6436!!.anInt1882
            if ((this.aClass284_6444.anInt3675 == (this.aClass284_6444.anInt3668)) && ((this.aClass284_6444.anInt3680) == (this.aClass284_6444.anInt3668)) && ((this.aClass284_6444.anInt3670) == (this.aClass284_6444.anInt3678)) && ((this.aClass284_6444.anInt3669) == (this.aClass284_6444.anInt3670)) && ((this.aClass284_6444.anInt3679) == (this.aClass284_6444.anInt3666)) && ((this.aClass284_6444.anInt3679) == (this.aClass284_6444.anInt3672))) aBoolean6453 =
                true
            else if (aBoolean6453) {
                aClass284_6449.anInt3678 = (this.aClass284_6444.anInt3678)
                aBoolean6453 = false
                aClass284_6449.anInt3672 = (this.aClass284_6444.anInt3672)
                aClass284_6449.anInt3666 = (this.aClass284_6444.anInt3666)
                aClass284_6449.anInt3670 = (this.aClass284_6444.anInt3670)
                aClass284_6449.anInt3668 = (this.aClass284_6444.anInt3668)
                aClass284_6449.anInt3679 = (this.aClass284_6444.anInt3679)
                aClass284_6449.anInt3675 = (this.aClass284_6444.anInt3675)
                aClass284_6449.anInt3669 = (this.aClass284_6444.anInt3669)
                aClass284_6449.anInt3680 = (this.aClass284_6444.anInt3680)
            }
        }
    }

    fun method2511(bool: Boolean, var_ha: ha?, l: Long) {
        try {
            anInt6437++
            if (bool != true) this.aClass243_6433 = null
            var class318_sub9_sub2_sub1 = (this.aClass243_6433!!.method1872(8) as Class318_Sub9_Sub2_Sub1?)
            while (class318_sub9_sub2_sub1 != null) {
                class318_sub9_sub2_sub1.method2522(var_ha, l)
                class318_sub9_sub2_sub1 = this.aClass243_6433!!.method1878(126.toByte()) as Class318_Sub9_Sub2_Sub1?
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rba.F(" + bool + ',' + (if (var_ha != null) "{...}" else "null") + ',' + l + ')'))
        }
    }

    fun method2513(var_ha: ha?, i: Int, l: Long, i_9_: Int, bool: Boolean) {
        var bool = bool
        do {
            try {
                if (!this.aBoolean6446) {
                    if (Class348_Sub6.anInt6637 < (this.aClass181_6441!!.anInt2379)) bool = false
                    else if (Class292.anInt4797 <= (Class275.anIntArray3551!![Class348_Sub6.anInt6637])) {
                        if (!aBoolean6453) {
                            if (this.aClass181_6441!!.anInt2425 != -1) {
                                var i_10_ = (-aLong6435 + l).toInt()
                                if (!(this.aClass181_6441!!.aBoolean2411) && (this.aClass181_6441!!.anInt2425) < i_10_) bool = false
                                else i_10_ %= (this.aClass181_6441!!.anInt2425)
                                if (!(this.aClass181_6441!!.aBoolean2406) && ((this.aClass181_6441!!.anInt2393) > i_10_)) bool = false
                                if (this.aClass181_6441!!.aBoolean2406 && (this.aClass181_6441!!.anInt2393) <= i_10_) bool = false
                            }
                        } else bool = false
                    } else bool = false
                } else bool = false
                anInt6445++
                if (bool) {
                    Class122.anInt1803++
                    val i_11_ = (((this.aClass284_6444.anInt3675) + this.aClass284_6444.anInt3668 + this.aClass284_6444.anInt3680) / 3)
                    val i_12_ = (((this.aClass284_6444.anInt3669) + this.aClass284_6444.anInt3678 + this.aClass284_6444.anInt3670) / 3)
                    val i_13_ = (((this.aClass284_6444.anInt3672) + this.aClass284_6444.anInt3679 + this.aClass284_6444.anInt3666) / 3)
                    if (i_11_ != (this.aClass284_6444.anInt3673) || i_12_ != this.aClass284_6444.anInt3667 || i_13_ != (this.aClass284_6444.anInt3671)) {
                        this.aClass284_6444.anInt3667 = i_12_
                        this.aClass284_6444.anInt3673 = i_11_
                        this.aClass284_6444.anInt3671 = i_13_
                        val i_14_ = (-this.aClass284_6444.anInt3675 + this.aClass284_6444.anInt3668)
                        val i_15_ = (-this.aClass284_6444.anInt3678 + this.aClass284_6444.anInt3670)
                        val i_16_ = (-this.aClass284_6444.anInt3666 + this.aClass284_6444.anInt3679)
                        val i_17_ = (this.aClass284_6444.anInt3680 - this.aClass284_6444.anInt3675)
                        val i_18_ = (this.aClass284_6444.anInt3669 - this.aClass284_6444.anInt3678)
                        val i_19_ = (-this.aClass284_6444.anInt3666 + this.aClass284_6444.anInt3672)
                        anInt6457 = i_17_ * i_16_ + -(i_14_ * i_19_)
                        anInt6455 = i_15_ * i_19_ + -(i_18_ * i_16_)
                        anInt6458 = -(i_17_ * i_15_) + i_18_ * i_14_
                        while ((anInt6455 > 32767 || anInt6457 > 32767 || anInt6458 > 32767 || anInt6455 < -32767 || anInt6457 < -32767 || anInt6458 < -32767)) {
                            anInt6458 = anInt6458 shr 1
                            anInt6457 = anInt6457 shr 1
                            anInt6455 = anInt6455 shr 1
                        }
                        var i_20_ = sqrt((anInt6455 * anInt6455 - (-(anInt6457 * anInt6457) + -(anInt6458 * anInt6458))).toDouble()).toInt()
                        if (i_20_ <= 0) i_20_ = 1
                        anInt6455 = anInt6455 * 32767 / i_20_
                        anInt6458 = 32767 * anInt6458 / i_20_
                        anInt6457 = 32767 * anInt6457 / i_20_
                        if ((this.aClass181_6441!!.aShort2415) > 0 || this.aClass181_6441!!.aShort2441 > 0) {
                            val i_21_ = (2607.5945876176133 * atan2(anInt6458.toDouble(), anInt6455.toDouble())).toInt()
                            val i_22_ = (2607.5945876176133 * (atan2(anInt6457.toDouble(), (sqrt((anInt6458 * anInt6458 + (anInt6455 * anInt6455)).toDouble()))))).toInt()
                            anInt6456 = (this.aClass181_6441!!.aShort2415 - (this.aClass181_6441!!.aShort2431))
                            anInt6459 = (this.aClass181_6441!!.aShort2431 + i_21_ - (anInt6456 shr 1))
                            anInt6454 = (-this.aClass181_6441!!.aShort2418 + (this.aClass181_6441!!.aShort2441))
                            anInt6452 = i_22_ - (-(this.aClass181_6441!!.aShort2418) - -(anInt6454 shr 1))
                        }
                    }
                    anInt6434 += ((((-this.aClass181_6441!!.anInt2391 + this.aClass181_6441!!.anInt2389).toDouble() * Math.random()) + this.aClass181_6441!!.anInt2391.toDouble()) * i.toDouble()).toInt()
                    if (anInt6434 > 63) {
                        val i_23_ = anInt6434 shr 6
                        anInt6434 = anInt6434 and 0x3f
                        for (i_24_ in 0..<i_23_) {
                            val i_25_: Int
                            val i_26_: Int
                            val i_27_: Int
                            if (this.aClass181_6441!!.aShort2415 <= 0 && this.aClass181_6441!!.aShort2441 <= 0) {
                                i_25_ = anInt6455
                                i_27_ = anInt6458
                                i_26_ = anInt6457
                            } else {
                                var i_28_ = ((Math.random() * anInt6456.toDouble()).toInt() + anInt6459)
                                i_28_ = i_28_ and 0x3fff
                                val i_29_ = Class70.anIntArray1207!![i_28_]
                                val i_30_ = Class70.anIntArray1204!![i_28_]
                                var i_31_ = anInt6452 + (anInt6454.toDouble() * Math.random()).toInt()
                                i_31_ = i_31_ and 0x1fff
                                val i_32_ = Class70.anIntArray1207!![i_31_]
                                val i_33_ = Class70.anIntArray1204!![i_31_]
                                val i_34_ = 13
                                i_25_ = i_32_ * i_30_ shr i_34_
                                i_26_ = -1 * (i_33_ shl 1)
                                i_27_ = i_32_ * i_29_ shr i_34_
                            }
                            var f = Math.random().toFloat()
                            var f_35_ = Math.random().toFloat()
                            if (f + f_35_ > 1.0f) {
                                f_35_ = 1.0f - f_35_
                                f = -f + 1.0f
                            }
                            val f_36_ = 1.0f - (f + f_35_)
                            val i_37_ = ((this.aClass284_6444.anInt3680.toFloat() * f_36_) + (f * (this.aClass284_6444.anInt3675).toFloat() + (f_35_ * (this.aClass284_6444.anInt3668).toFloat()))).toInt()
                            val i_38_ = (f * (this.aClass284_6444.anInt3678).toFloat() + (this.aClass284_6444.anInt3670).toFloat() * f_35_ + (this.aClass284_6444.anInt3669).toFloat() * f_36_).toInt()
                            val i_39_ = ((this.aClass284_6444.anInt3666.toFloat() * f) + (this.aClass284_6444.anInt3679).toFloat() * f_35_ + (f_36_ * (this.aClass284_6444.anInt3672).toFloat())).toInt()
                            val i_40_ = ((aClass284_6449.anInt3680).toFloat() * f_36_ + (f_35_ * (aClass284_6449.anInt3668).toFloat() + f * (aClass284_6449.anInt3675).toFloat())).toInt()
                            val i_41_ = ((aClass284_6449.anInt3670).toFloat() * f_35_ + (aClass284_6449.anInt3678).toFloat() * f + (aClass284_6449.anInt3669).toFloat() * f_36_).toInt()
                            val i_42_ = ((aClass284_6449.anInt3672).toFloat() * f_36_ + ((aClass284_6449.anInt3666.toFloat() * f) + (aClass284_6449.anInt3679).toFloat() * f_35_)).toInt()
                            val i_43_ = i_37_ - i_40_
                            val i_44_ = -i_41_ + i_38_
                            val i_45_ = i_39_ + -i_42_
                            val i_46_ = (i_43_.toDouble() * Math.random() + i_40_.toDouble()).toInt()
                            val i_47_ = (i_41_.toDouble() + i_44_.toDouble() * Math.random()).toInt()
                            val i_48_ = (i_42_.toDouble() + i_45_.toDouble() * Math.random()).toInt()
                            val i_49_ = ((Math.random() * ((this.aClass181_6441!!.anInt2438) + -(this.aClass181_6441!!.anInt2392)).toDouble()).toInt() + this.aClass181_6441!!.anInt2392)
                            val i_50_ = (this.aClass181_6441!!.anInt2394 + ((-(this.aClass181_6441!!.anInt2394) + (this.aClass181_6441!!.anInt2407)).toDouble() * Math.random()).toInt())
                            val i_51_ = ((((this.aClass181_6441!!.anInt2417) - (this.aClass181_6441!!.anInt2442)).toDouble() * Math.random()).toInt() + this.aClass181_6441!!.anInt2442)
                            val i_52_: Int
                            if (this.aClass181_6441!!.aBoolean2443) {
                                val d = Math.random()
                                i_52_ =
                                    ((d * (this.aClass181_6441!!.anInt2408).toDouble() + (this.aClass181_6441!!.anInt2399).toDouble()).toInt() or ((((this.aClass181_6441!!.anInt2433).toDouble() * d + (this.aClass181_6441!!.anInt2429).toDouble()).toInt() shl 16) or (((this.aClass181_6441!!.anInt2390).toDouble() + ((this.aClass181_6441!!.anInt2403).toDouble() * d)).toInt() shl 8)) or (((this.aClass181_6441!!.anInt2413).toDouble() + ((this.aClass181_6441!!.anInt2410).toDouble() * (Math.random()))).toInt() shl 24))
                            } else i_52_ =
                                (((((this.aClass181_6441!!.anInt2410).toDouble() * Math.random()) + (this.aClass181_6441!!.anInt2413).toDouble()).toInt() shl 24) or ((((Math.random() * (this.aClass181_6441!!.anInt2433).toDouble()) + (this.aClass181_6441!!.anInt2429).toDouble()).toInt() shl 16) or (((Math.random() * (this.aClass181_6441!!.anInt2403).toDouble()) + (this.aClass181_6441!!.anInt2390).toDouble()).toInt() shl 8) or (((this.aClass181_6441!!.anInt2408).toDouble() * Math.random()) + (this.aClass181_6441!!.anInt2399).toDouble()).toInt()))
                            var i_53_ = (this.aClass181_6441!!.anInt2414)
                            if (!var_ha!!.method3644() && !(this.aClass181_6441!!.aBoolean2382)) i_53_ = -1
                            if (Client.anInt5171 == Class348_Sub1_Sub1.anInt8808) {
                                val class318_sub9_sub2_sub1 = (Class318_Sub9_Sub2_Sub1(this, i_46_, i_47_, i_48_, i_25_, i_26_, i_27_, i_49_, i_50_, i_52_, i_51_, i_53_, (this.aClass181_6441!!.aBoolean2435), (this.aClass181_6441!!.aBoolean2430)))
                            } else {
                                val class318_sub9_sub2_sub1 = (Class239_Sub25.aClass318_Sub9_Sub2_Sub1Array6103!![Class348_Sub1_Sub1.anInt8808])
                                Class348_Sub1_Sub1.anInt8808 = 0x3ff and 1 + Class348_Sub1_Sub1.anInt8808
                                class318_sub9_sub2_sub1!!.method2523(this, i_46_, i_47_, i_48_, i_25_, i_26_, i_27_, i_49_, i_50_, i_52_, i_51_, i_53_, (this.aClass181_6441!!.aBoolean2435), (this.aClass181_6441!!.aBoolean2430))
                            }
                        }
                    }
                }
                if (!this.aClass284_6444.method2115(aClass284_6449, true)) {
                    val class284 = aClass284_6449
                    aClass284_6449 = this.aClass284_6444
                    this.aClass284_6444 = class284
                    this.aClass284_6444.anInt3678 = (this.aClass129_6436!!.anInt1891)
                    this.aClass284_6444.anInt3675 = (this.aClass129_6436!!.anInt1882)
                    this.aClass284_6444.anInt3670 = (this.aClass129_6436!!.anInt1890)
                    this.aClass284_6444.anInt3672 = (this.aClass129_6436!!.anInt1884)
                    this.aClass284_6444.anInt3680 = (this.aClass129_6436!!.anInt1876)
                    this.aClass284_6444.anInt3679 = (this.aClass129_6436!!.anInt1880)
                    this.aClass284_6444.anInt3666 = (this.aClass129_6436!!.anInt1889)
                    this.aClass284_6444.anInt3673 = aClass284_6449.anInt3673
                    this.aClass284_6444.anInt3669 = (this.aClass129_6436!!.anInt1874)
                    this.aClass284_6444.anInt3671 = aClass284_6449.anInt3671
                    this.aClass284_6444.anInt3667 = aClass284_6449.anInt3667
                    this.aClass284_6444.anInt3668 = (this.aClass129_6436!!.anInt1883)
                }
                this.anInt6447 = 0
                var class318_sub9_sub2_sub1 = this.aClass243_6433!!.method1872(i_9_ + 5) as Class318_Sub9_Sub2_Sub1?
                while (class318_sub9_sub2_sub1 != null) {
                    class318_sub9_sub2_sub1.method2524(l, i)
                    this.anInt6447++
                    class318_sub9_sub2_sub1 = (this.aClass243_6433!!.method1878(122.toByte()) as Class318_Sub9_Sub2_Sub1?)
                }
                Class313.anInt3936 += this.anInt6447
                if (i_9_ == 3) break
                method2508(124)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("rba.C(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + l + ',' + i_9_ + ',' + bool + ')'))
            }
            break
        } while (false)
    }

    init {
        this.aClass284_6444 = Class284()
        aClass284_6449 = Class284()
        aBoolean6453 = false
        try {
            aLong6435 = l
            this.aClass129_6436 = class129
            this.aClass318_Sub10_6439 = class318_sub10
            this.aClass181_6441 = this.aClass129_6436!!.method1125(59.toByte())
            if (!var_ha!!.method3644() && (this.aClass181_6441!!.anInt2387) != -1) this.aClass181_6441 = method3591((this.aClass181_6441!!.anInt2387), 0)
            this.aClass243_6433 = Class243()
            anInt6434 = (anInt6434 + 64.0 * Math.random()).toInt()
            method2507(true)
            aClass284_6449.anInt3680 = this.aClass284_6444.anInt3680
            aClass284_6449.anInt3669 = this.aClass284_6444.anInt3669
            aClass284_6449.anInt3668 = this.aClass284_6444.anInt3668
            aClass284_6449.anInt3675 = this.aClass284_6444.anInt3675
            aClass284_6449.anInt3670 = this.aClass284_6444.anInt3670
            aClass284_6449.anInt3678 = this.aClass284_6444.anInt3678
            aClass284_6449.anInt3666 = this.aClass284_6444.anInt3666
            aClass284_6449.anInt3672 = this.aClass284_6444.anInt3672
            aClass284_6449.anInt3679 = this.aClass284_6444.anInt3679
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("rba.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class129 != null) "{...}" else "null") + ',' + (if (class318_sub10 != null) "{...}" else "null") + ',' + l + ')'))
        }
    }

    companion object {
        var anInt6437: Int = 0
        var anInt6438: Int = 0
        var anInt6440: Int = 0
        var anInt6442: Int = 0
        @JvmField
        var aClass351_6443: Class351? = Class351(68, 2)
        var anInt6445: Int = 0
        var anInt6448: Int = 0
        var anInt6450: Int = 0
        @JvmField
        var anInt6451: Int = 0
        @JvmStatic
        fun method2508(i: Int) {
            if (i != 32767) method2512(null, null, 5)
            aClass351_6443 = null
        }

        fun method2509(i: Int, i_0_: Int, var_ha: ha, i_1_: Int, i_2_: Int, bool: Boolean, i_3_: Int, i_4_: Int) {
            anInt6438++
            if (bool != true) anInt6451 = -14
            var_ha.method3675(i, (-125).toByte(), i_1_, i_0_, i_3_, i_2_)
            var_ha.method3675(i - 2, (-125).toByte(), 1 + i_1_, 1 + i_0_, 16, i_4_)
            var_ha.method3668(-2 + i, 18 + i_0_, i_4_, 1 + i_1_, -19 + i_3_, 115)
        }

        @JvmStatic
        fun method2510(class45: Class45?, class348_sub16_sub3: Class348_Sub16_Sub3?, class45_5_: Class45?, bool: Boolean, class279: Class279?, class45_6_: Class45?): Boolean {
            try {
                Class318_Sub1_Sub4.aClass279_8764 = class279
                Class98.aClass348_Sub16_Sub3_1564 = class348_sub16_sub3
                Class43.aClass45_611 = class45
                Class367_Sub9.aClass45_7371 = class45_6_
                Class333.aClass45_4147 = class45_5_
                Class367_Sub3.anIntArray7299 = IntArray(16)
                if (bool != false) anInt6451 = 71
                anInt6442++
                for (i in 0..15) Class367_Sub3.anIntArray7299!![i] = 255
                return true
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("rba.G(" + (if (class45 != null) "{...}" else "null") + ',' + (if (class348_sub16_sub3 != null) "{...}" else "null") + ',' + (if (class45_5_ != null) "{...}" else "null") + ',' + bool + ',' + (if (class279 != null) "{...}" else "null") + ',' + (if (class45_6_ != null) "{...}" else "null") + ')'))
            }
        }

        fun method2512(var_d: d?, var_ha: ha?, i: Int) {
            try {
                anInt6440++
                if (Class75.aClass348_Sub42_Sub14_1243 != null) {
                    if (Class348.anInt4290 < 10) {
                        if (!Class75.aClass45_1237!!.method413(100, Class75.aClass348_Sub42_Sub14_1243!!.aString9625!!)) {
                            Class348.anInt4290 = (Class348_Sub32.aClass45_6950!!.method397((Class75.aClass348_Sub42_Sub14_1243!!.aString9625!!), 0)) / 10
                            return
                        }
                        method126(-16203)
                        Class348.anInt4290 = 10
                    }
                    if (Class348.anInt4290 == 10) {
                        Class75.anInt1266 = (Class75.aClass348_Sub42_Sub14_1243!!.anInt9644 shr 6 shl 6)
                        Class75.anInt1263 = (Class75.aClass348_Sub42_Sub14_1243!!.anInt9643 shr 6 shl 6)
                        Class75.anInt1259 = 64 + ((Class75.aClass348_Sub42_Sub14_1243!!.anInt9635 shr 6 shl 6) - Class75.anInt1266)
                        Class75.anInt1267 = 64 + ((Class75.aClass348_Sub42_Sub14_1243!!.anInt9627 shr 6 shl 6) - Class75.anInt1263)
                        val `is` = IntArray(3)
                        var i_7_ = -1
                        var i_8_ = -1
                        if (Class75.aClass348_Sub42_Sub14_1243!!.method3236(`is`, (za_Sub2.regionTileX - -((Class132.aPlayer_1907!!.x) shr 9)), ((Class132.aPlayer_1907!!.y) shr 9) + Class90.regionTileY, (Class132.aPlayer_1907!!.plane).toInt(), (-28).toByte())) {
                            i_7_ = -Class75.anInt1266 + `is`[1]
                            i_8_ = -Class75.anInt1263 + `is`[2]
                        }
                        if (Class88.aBoolean1500 || i_7_ < 0 || Class75.anInt1259 <= i_7_ || i_8_ < 0 || Class75.anInt1267 <= i_8_) {
                            if (Class239_Sub7.anInt5909 == -1 || Class339.anInt4202 == -1) {
                                Class75.aClass348_Sub42_Sub14_1243!!.method3242(`is`, 123, 0x3fff and (Class75.aClass348_Sub42_Sub14_1243!!.anInt9640), (Class75.aClass348_Sub42_Sub14_1243!!.anInt9640) shr 14 and 0x3fff)
                                Class245.anInt3170 = `is`[2] - Class75.anInt1263
                                Class348_Sub36.anInt6992 = `is`[1] - Class75.anInt1266
                            } else {
                                Class75.aClass348_Sub42_Sub14_1243!!.method3242(`is`, 88, Class339.anInt4202, Class239_Sub7.anInt5909)
                                Class339.anInt4202 = -1
                                Class239_Sub7.anInt5909 = Class339.anInt4202
                                if (`is` != null) {
                                    Class348_Sub36.anInt6992 = -Class75.anInt1266 + `is`[1]
                                    Class245.anInt3170 = -Class75.anInt1263 + `is`[2]
                                }
                                Class88.aBoolean1500 = false
                            }
                        } else {
                            i_7_ += (10.0 * Math.random()).toInt() + -5
                            i_8_ += (Math.random() * 10.0).toInt() + -5
                            Class348_Sub36.anInt6992 = i_7_
                            Class245.anInt3170 = i_8_
                        }
                        if (Class75.aClass348_Sub42_Sub14_1243!!.anInt9631 != 37) {
                            if (Class75.aClass348_Sub42_Sub14_1243!!.anInt9631 != 50) {
                                if (Class75.aClass348_Sub42_Sub14_1243!!.anInt9631 != 75) {
                                    if ((Class75.aClass348_Sub42_Sub14_1243!!.anInt9631) == 100) {
                                        Class75.aFloat1247 = 8.0f
                                        Class75.aFloat1249 = Class75.aFloat1247
                                    } else if ((Class75.aClass348_Sub42_Sub14_1243!!.anInt9631) != 200) {
                                        Class75.aFloat1247 = 8.0f
                                        Class75.aFloat1249 = Class75.aFloat1247
                                    } else {
                                        Class75.aFloat1247 = 16.0f
                                        Class75.aFloat1249 = Class75.aFloat1247
                                    }
                                } else {
                                    Class75.aFloat1247 = 6.0f
                                    Class75.aFloat1249 = Class75.aFloat1247
                                }
                            } else {
                                Class75.aFloat1247 = 4.0f
                                Class75.aFloat1249 = Class75.aFloat1247
                            }
                        } else {
                            Class75.aFloat1247 = 3.0f
                            Class75.aFloat1249 = Class75.aFloat1247
                        }
                        Class75.anInt1255 = Class75.aFloat1247.toInt() shr 1
                        Class75.aByteArrayArrayArray1251 = Class325.method2596(Class75.anInt1255, 12871)
                        Class348_Sub15.method2811(false)
                        method760()
                        Class289.aClass262_3705 = Class262()
                        Class75.anInt1250 += (Math.random() * 5.0).toInt() + -2
                        if (Class75.anInt1250 < -8) Class75.anInt1250 = -8
                        if (Class75.anInt1250 > 8) Class75.anInt1250 = 8
                        Class75.anInt1253 += -2 + (5.0 * Math.random()).toInt()
                        if (Class75.anInt1253 < -16) Class75.anInt1253 = -16
                        if (Class75.anInt1253 > 16) Class75.anInt1253 = 16
                        Class75.method764(var_d!!, (Class75.anInt1250 shr 2 shl 10), Class75.anInt1253 shr 1)
                        Class75.aClass153_1238!!.method1220(73.toByte(), 256, 1024)
                        Class75.aClass141_1242!!.method1178(256, 1, 256)
                        Class75.aClass263_1245!!.method2014(4096, true)
                        Class229.aClass194_2981!!.method1444(256, 123)
                        Class348.anInt4290 = 20
                    } else if (Class348.anInt4290 == 20) {
                        Class289.method2193(true, (-123).toByte())
                        method756(var_ha, Class75.anInt1250, Class75.anInt1253)
                        Class348.anInt4290 = 60
                        Class289.method2193(true, (-122).toByte())
                        method867(true)
                    } else if (i <= -43) {
                        if (Class348.anInt4290 == 60) {
                            if (Class75.aClass45_1237!!.method400(-18308, (Class75.aClass348_Sub42_Sub14_1243!!.aString9625) + "_staticelements")) {
                                if (!Class75.aClass45_1237!!.method413(100, (Class75.aClass348_Sub42_Sub14_1243!!.aString9625) + "_staticelements")) return
                                Class75.aClass252_1246 = (Class307.method2300(Class75.aClass45_1237, (Class75.aClass348_Sub42_Sub14_1243!!.aString9625) + "_staticelements", Class130.aBoolean1900, (-91).toByte()))
                            } else Class75.aClass252_1246 = Class252(0)
                            method761()
                            Class348.anInt4290 = 70
                            Class289.method2193(true, (-127).toByte())
                            method867(true)
                        } else if (Class348.anInt4290 == 70) {
                            Class125.aClass323_4921 = Class323(var_ha!!, 11, true, Class305.aCanvas3869!!)
                            Class348.anInt4290 = 73
                            Class289.method2193(true, (-123).toByte())
                            method867(true)
                        } else if (Class348.anInt4290 == 73) {
                            Class14_Sub4.aClass323_8644 = Class323(var_ha!!, 12, true, Class305.aCanvas3869!!)
                            Class348.anInt4290 = 76
                            Class289.method2193(true, (-125).toByte())
                            method867(true)
                        } else if (Class348.anInt4290 == 76) {
                            Class39.aClass323_521 = Class323(var_ha!!, 14, true, Class305.aCanvas3869!!)
                            Class348.anInt4290 = 79
                            Class289.method2193(true, (-123).toByte())
                            method867(true)
                        } else if (Class348.anInt4290 == 79) {
                            Class168.aClass323_2252 = Class323(var_ha!!, 17, true, Class305.aCanvas3869!!)
                            Class348.anInt4290 = 82
                            Class289.method2193(true, (-124).toByte())
                            method867(true)
                        } else if (Class348.anInt4290 == 82) {
                            Class176.aClass323_2333 = Class323(var_ha!!, 19, true, Class305.aCanvas3869!!)
                            Class348.anInt4290 = 85
                            Class289.method2193(true, (-128).toByte())
                            method867(true)
                        } else if (Class348.anInt4290 == 85) {
                            Class285.aClass323_4754 = Class323(var_ha!!, 22, true, Class305.aCanvas3869!!)
                            Class348.anInt4290 = 88
                            Class289.method2193(true, (-124).toByte())
                            method867(true)
                        } else if (Class348.anInt4290 == 88) {
                            Class348_Sub3.aClass323_6581 = Class323(var_ha!!, 26, true, Class305.aCanvas3869!!)
                            Class348.anInt4290 = 91
                            Class289.method2193(true, (-125).toByte())
                            method867(true)
                        } else {
                            Class240.aClass323_4672 = Class323(var_ha!!, 30, true, Class305.aCanvas3869!!)
                            Class348.anInt4290 = 100
                            Class289.method2193(true, (-119).toByte())
                            method867(true)
                            System.gc()
                        }
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("rba.A(" + (if (var_d != null) "{...}" else "null") + ',' + (if (var_ha!! != null) "{...}" else "null") + ',' + i + ')'))
            }
        }
    }
}
