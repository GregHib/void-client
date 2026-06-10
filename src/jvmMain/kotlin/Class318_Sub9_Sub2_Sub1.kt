import Class256.method1943
import kotlin.math.sqrt

/* Class318_Sub9_Sub2_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub9_Sub2_Sub1 internal constructor(var aClass318_Sub7_10419: Class318_Sub7, i: Int, i_65_: Int, i_66_: Int, i_67_: Int, i_68_: Int, i_69_: Int, i_70_: Int, i_71_: Int, i_72_: Int, i_73_: Int, i_74_: Int, bool: Boolean, bool_75_: Boolean) : Class318_Sub9_Sub2() {
    private var aShort10416: Short = 0
    private var anInt10417 = 0
    private var aShort10418: Short
    private var aShort10420: Short
    private var anInt10421: Int
    private var aShort10422: Short
    private var aShort10423: Short
    private var aShort10424: Short

    fun method2520() {
        this.aClass318_Sub7_10419.aClass318_Sub10_6439!!.aClass318_Sub9_Sub2_Sub1Array6475[aShort10416.toInt()] = null
        Class239_Sub25.aClass318_Sub9_Sub2_Sub1Array6103!![Client.anInt5171] = this
        Client.anInt5171 = Client.anInt5171 + 1 and 0x3ff
        this.method2373(false)
        this.method2514(-108)
    }

    private fun method2521() {
        val i = (this.aClass318_Sub7_10419.aClass318_Sub10_6439!!.anInt6476)
        if ((this.aClass318_Sub7_10419.aClass318_Sub10_6439!!.aClass318_Sub9_Sub2_Sub1Array6475[i]) != null) this.aClass318_Sub7_10419.aClass318_Sub10_6439!!.aClass318_Sub9_Sub2_Sub1Array6475[i]!!.method2520()
        this.aClass318_Sub7_10419.aClass318_Sub10_6439!!.aClass318_Sub9_Sub2_Sub1Array6475[i] = this
        aShort10416 = this.aClass318_Sub7_10419.aClass318_Sub10_6439!!.anInt6476.toShort()
        this.aClass318_Sub7_10419.aClass318_Sub10_6439!!.anInt6476 = i + 1 and 0x1fff
        this.aClass318_Sub7_10419.aClass243_6433!!.method1869(-98, this)
    }

    fun method2522(var_ha: ha?, l: Long) {
        val i = this.anInt8791 shr 12 + Class362.anInt4459
        val i_0_ = this.anInt8789 shr 12 + Class362.anInt4459
        val i_1_ = this.anInt8796 shr 12
        if (i_1_ > 0 || i_1_ < -262144 || i < 0 || i >= Class318_Sub7.Companion.anInt6451 || i_0_ < 0 || i_0_ >= Class348_Sub41.anInt7054) method2520()
        else {
            val class318_sub10 = (this.aClass318_Sub7_10419.aClass318_Sub10_6439)!!
            val class181 = (this.aClass318_Sub7_10419.aClass181_6441)!!
            val var_ses = aa_Sub1.aSArray5191
            var i_2_ = class318_sub10.anInt6483
            var class357 = (Class147.aClass357ArrayArrayArray2029!![class318_sub10.anInt6483]!![i]!![i_0_])
            if (class357 != null) i_2_ = class357.aByte4399.toInt()
            val i_3_ = var_ses!![i_2_]!!.method3982((-86).toByte(), i_0_, i)
            val i_4_: Int
            if (i_2_ < Class189.anInt2524 - 1) i_4_ = var_ses[i_2_ + 1]!!.method3982((-86).toByte(), i_0_, i)
            else i_4_ = i_3_ - (8 shl Class362.anInt4459)
            if (class181.aBoolean2397) {
                if (class181.anInt2384 == -1 && i_1_ > i_3_) {
                    method2520()
                    return
                }
                if (class181.anInt2384 >= 0 && i_1_ > var_ses[class181.anInt2384]!!.method3982((-86).toByte(), i_0_, i)) {
                    method2520()
                    return
                }
                if (class181.anInt2423 == -1 && i_1_ < i_4_) {
                    method2520()
                    return
                }
                if (class181.anInt2423 >= 0 && i_1_ < var_ses[class181.anInt2423 + 1]!!.method3982((-86).toByte(), i_0_, i)) {
                    method2520()
                    return
                }
            }
            var i_5_: Int
            i_5_ = Class189.anInt2524 - 1
            while ((i_5_ > 0 && i_1_ > var_ses[i_5_]!!.method3982((-86).toByte(), i_0_, i))) {
                i_5_--
            }
            if (class181.aBoolean2376 && i_5_ == 0 && i_1_ > var_ses[0]!!.method3982((-86).toByte(), i_0_, i)) method2520()
            else if (i_5_ == Class189.anInt2524 - 1 && (var_ses[i_5_]!!.method3982((-86).toByte(), i_0_, i) - i_1_ > 8 shl Class362.anInt4459)) method2520()
            else {
                class357 = Class147.aClass357ArrayArrayArray2029!![i_5_]!![i]!![i_0_]
                if (class357 == null) {
                    if (i_5_ == 0 || (Class147.aClass357ArrayArrayArray2029!![0]!![i]!![i_0_] == null)) {
                        Class147.aClass357ArrayArrayArray2029!![0]!![i]!![i_0_] = Class357(0)
                        class357 = Class147.aClass357ArrayArrayArray2029!![0]!![i]!![i_0_]
                    }
                    val bool = (Class147.aClass357ArrayArrayArray2029!![0]!![i]!![i_0_]!!.aClass357_4400 != null)
                    if (i_5_ == 3 && bool) {
                        method2520()
                        return
                    }
                    for (i_6_ in 1..i_5_) {
                        if ((Class147.aClass357ArrayArrayArray2029!![i_6_]!![i]!![i_0_]) == null) {
                            Class147.aClass357ArrayArrayArray2029!![i_6_]!![i]!![i_0_] = Class357(i_6_)
                            class357 = Class147.aClass357ArrayArrayArray2029!![i_6_]!![i]!![i_0_]
                            if (bool) class357!!.aByte4399++
                        }
                    }
                }
                if (class181.aBoolean2424) {
                    val i_7_ = this.anInt8791 shr 12
                    val i_8_ = this.anInt8789 shr 12
                    if (class357!!.aClass318_Sub1_Sub4_4406 != null) {
                        val class30 = class357.aClass318_Sub1_Sub4_4406!!.method2381(var_ha, 7)
                        if (class30 != null && class30.method321(-14735, i_8_, i_1_, i_7_)) {
                            method2520()
                            return
                        }
                    }
                    if (class357.aClass318_Sub1_Sub4_4403 != null) {
                        val class30 = class357.aClass318_Sub1_Sub4_4403!!.method2381(var_ha, 7)
                        if (class30 != null && class30.method321(-14735, i_8_, i_1_, i_7_)) {
                            method2520()
                            return
                        }
                    }
                    if (class357.aClass318_Sub1_Sub1_4402 != null) {
                        val class30 = class357.aClass318_Sub1_Sub1_4402!!.method2381(var_ha, 7)
                        if (class30 != null && class30.method321(-14735, i_8_, i_1_, i_7_)) {
                            method2520()
                            return
                        }
                    }
                    var class148 = class357.aClass148_4396
                    while (class148 != null) {
                        val class30 = class148.aClass318_Sub1_Sub3_2040!!.method2381(var_ha, 7)
                        if (class30 != null && class30.method321(-14735, i_8_, i_1_, i_7_)) {
                            method2520()
                            return
                        }
                        class148 = class148.aClass148_2038
                    }
                }
                class318_sub10.aClass98_6481.aClass88_1569.method844(this, true)
            }
        }
    }

    fun method2523(class318_sub7: Class318_Sub7, i: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, bool: Boolean, bool_19_: Boolean) {
        this.aClass318_Sub7_10419 = class318_sub7
        this.anInt8791 = i shl 12
        this.anInt8796 = i_9_ shl 12
        this.anInt8789 = i_10_ shl 12
        this.anInt8790 = i_16_
        aShort10420 = i_15_.toShort()
        aShort10418 = aShort10420
        this.anInt8793 = i_17_
        this.anInt8792 = i_18_
        this.aBoolean8794 = bool_19_
        aShort10424 = i_11_.toShort()
        aShort10423 = i_12_.toShort()
        aShort10422 = i_13_.toShort()
        anInt10421 = i_14_
        this.aByte8795 = this.aClass318_Sub7_10419.aClass129_6436!!.aByte1875
        method2521()
    }

    fun method2524(l: Long, i: Int) {
        aShort10420 = (aShort10420 - i).toShort()
        if (aShort10420 <= 0) method2520()
        else {
            val i_20_ = this.anInt8791 shr 12
            val i_21_ = this.anInt8796 shr 12
            val i_22_ = this.anInt8789 shr 12
            val class318_sub10 = (this.aClass318_Sub7_10419.aClass318_Sub10_6439)!!
            val class181 = (this.aClass318_Sub7_10419.aClass181_6441)!!
            if (class181.anInt2386 != 0) {
                if (aShort10418 - aShort10420 <= class181.anInt2373) {
                    var i_23_ = ((this.anInt8790 shr 8 and 0xff00) + (anInt10417 shr 16 and 0xff) + class181.anInt2426 * i)
                    var i_24_ = ((this.anInt8790 and 0xff00) + (anInt10417 shr 8 and 0xff) + class181.anInt2421 * i)
                    var i_25_ = ((this.anInt8790 shl 8 and 0xff00) + (anInt10417 and 0xff) + class181.anInt2405 * i)
                    if (i_23_ < 0) i_23_ = 0
                    else if (i_23_ > 65535) i_23_ = 65535
                    if (i_24_ < 0) i_24_ = 0
                    else if (i_24_ > 65535) i_24_ = 65535
                    if (i_25_ < 0) i_25_ = 0
                    else if (i_25_ > 65535) i_25_ = 65535
                    this.anInt8790 = this.anInt8790 and 0xffffff.inv()
                    this.anInt8790 = this.anInt8790 or (((i_23_ and 0xff00) shl 8) + (i_24_ and 0xff00) + ((i_25_ and 0xff00) shr 8))
                    anInt10417 = anInt10417 and 0xffffff.inv()
                    anInt10417 = anInt10417 or (((i_23_ and 0xff) shl 16) + ((i_24_ and 0xff) shl 8) + (i_25_ and 0xff))
                }
                if (aShort10418 - aShort10420 <= class181.anInt2381) {
                    var i_26_ = ((this.anInt8790 shr 16 and 0xff00) + (anInt10417 shr 24 and 0xff) + class181.anInt2416 * i)
                    if (i_26_ < 0) i_26_ = 0
                    else if (i_26_ > 65535) i_26_ = 65535
                    this.anInt8790 = this.anInt8790 and 0xffffff
                    this.anInt8790 = this.anInt8790 or ((i_26_ and 0xff00) shl 16)
                    anInt10417 = anInt10417 and 0xffffff
                    anInt10417 = anInt10417 or ((i_26_ and 0xff) shl 24)
                }
            }
            if (class181.anInt2404 != -1 && (aShort10418 - aShort10420 <= class181.anInt2383)) anInt10421 += class181.anInt2377 * i
            if (class181.anInt2427 != -1 && (aShort10418 - aShort10420 <= class181.anInt2388)) this.anInt8793 += class181.anInt2439 * i
            var d = aShort10424.toDouble()
            var d_27_ = aShort10423.toDouble()
            var d_28_ = aShort10422.toDouble()
            var bool = false
            if (class181.anInt2436 == 1) {
                val i_29_ = i_20_ - this.aClass318_Sub7_10419.aClass284_6444.anInt3673
                val i_30_ = i_21_ - this.aClass318_Sub7_10419.aClass284_6444.anInt3667
                val i_31_ = i_22_ - this.aClass318_Sub7_10419.aClass284_6444.anInt3671
                val i_32_ = (sqrt((i_29_ * i_29_ + i_30_ * i_30_ + i_31_ * i_31_).toDouble()).toInt() shr 2)
                val l_33_ = (class181.anInt2437 * i_32_ * i).toLong()
                anInt10421 -= (anInt10421.toLong() * l_33_ shr 18).toInt()
            } else if (class181.anInt2436 == 2) {
                val i_34_ = i_20_ - this.aClass318_Sub7_10419.aClass284_6444.anInt3673
                val i_35_ = i_21_ - this.aClass318_Sub7_10419.aClass284_6444.anInt3667
                val i_36_ = i_22_ - this.aClass318_Sub7_10419.aClass284_6444.anInt3671
                val i_37_ = i_34_ * i_34_ + i_35_ * i_35_ + i_36_ * i_36_
                val l_38_ = (class181.anInt2437 * i_37_ * i).toLong()
                anInt10421 -= (anInt10421.toLong() * l_38_ shr 28).toInt()
            }
            if (class181.anIntArray2402 != null) {
                val class348 = (class318_sub10.aClass262_6479.aClass348_3334)
                var class348_39_ = class348.aClass348_4294
                while (class348_39_ !== class348) {
                    val class348_sub42_sub20 = class348_39_ as Class348_Sub42_Sub20?
                    val class174 = (class348_sub42_sub20!!.aClass174_9704)!!
                    if (class174.anInt2296 != 1) {
                        var bool_40_ = false
                        var i_41_ = 0
                        while ((i_41_ < class181.anIntArray2402.size)) {
                            if (class181.anIntArray2402[i_41_] == class174.anInt2303) {
                                bool_40_ = true
                                break
                            }
                            i_41_++
                        }
                        if (bool_40_) {
                            val d_42_ = (i_20_ - (class348_sub42_sub20.anInt9712)).toDouble()
                            val d_43_ = (i_21_ - (class348_sub42_sub20.anInt9706)).toDouble()
                            val d_44_ = (i_22_ - (class348_sub42_sub20.anInt9710)).toDouble()
                            val d_45_ = (d_42_ * d_42_ + d_43_ * d_43_ + d_44_ * d_44_)
                            if (!(d_45_ > (class174.aLong2301).toDouble())) {
                                var d_46_ = sqrt(d_45_)
                                if (d_46_ == 0.0) d_46_ = 1.0
                                val d_47_ = (((d_42_ * (class348_sub42_sub20.anInt9705).toDouble()) + d_43_ * class174.anInt2290.toDouble() + (d_44_ * (class348_sub42_sub20.anInt9707).toDouble())) * 65535.0 / ((class174.anInt2299).toDouble() * d_46_))
                                if (!(d_47_ < (class174.anInt2298).toDouble())) {
                                    var d_48_ = 0.0
                                    if (class174.anInt2289 == 1) d_48_ = (d_46_ / 16.0 * (class174.anInt2304).toDouble())
                                    else if (class174.anInt2289 == 2) d_48_ = (d_46_ / 16.0 * (d_46_ / 16.0) * (class174.anInt2304).toDouble())
                                    if (class174.anInt2292 == 0) {
                                        if (class174.anInt2297 == 0) {
                                            d += ((class348_sub42_sub20.anInt9705).toDouble() - d_48_) * i.toDouble()
                                            d_27_ += ((class174.anInt2290).toDouble() - d_48_) * i.toDouble()
                                            d_28_ += ((class348_sub42_sub20.anInt9707).toDouble() - d_48_) * i.toDouble()
                                            bool = true
                                        } else {
                                            this.anInt8791 = (this.anInt8791 + ((class348_sub42_sub20.anInt9705).toDouble() - d_48_) * i.toDouble()).toInt()
                                            this.anInt8796 = (this.anInt8796 + ((class174.anInt2290).toDouble() - d_48_) * i.toDouble()).toInt()
                                            this.anInt8789 = (this.anInt8789 + ((class348_sub42_sub20.anInt9707).toDouble() - d_48_) * i.toDouble()).toInt()
                                        }
                                    } else {
                                        val d_49_ = (d_42_ / d_46_ * (class174.anInt2299).toDouble())
                                        val d_50_ = (d_43_ / d_46_ * (class174.anInt2299).toDouble())
                                        val d_51_ = (d_44_ / d_46_ * (class174.anInt2299).toDouble())
                                        if (class174.anInt2297 == 0) {
                                            d += d_49_ * i.toDouble()
                                            d_27_ += d_50_ * i.toDouble()
                                            d_28_ += d_51_ * i.toDouble()
                                            bool = true
                                        } else {
                                            this.anInt8791 = (this.anInt8791 + d_49_ * i.toDouble()).toInt()
                                            this.anInt8796 = (this.anInt8796 + d_50_ * i.toDouble()).toInt()
                                            this.anInt8789 = (this.anInt8789 + d_51_ * i.toDouble()).toInt()
                                        }
                                    }
                                }
                            }
                        }
                    }
                    class348_39_ = class348_39_.aClass348_4294
                }
            }
            if (class181.anIntArray2380 != null) {
                for (i_52_ in class181.anIntArray2380.indices) {
                    var class348_sub42_sub20 = ((Class367_Sub11.aClass32_7415!!.method334(class181.anIntArray2380[i_52_].toLong(), 121.toByte())) as Class348_Sub42_Sub20?)
                    while (class348_sub42_sub20 != null) {
                        val class174 = (class348_sub42_sub20.aClass174_9704)!!
                        val d_53_ = (i_20_ - class348_sub42_sub20.anInt9712).toDouble()
                        val d_54_ = (i_21_ - class348_sub42_sub20.anInt9706).toDouble()
                        val d_55_ = (i_22_ - class348_sub42_sub20.anInt9710).toDouble()
                        val d_56_ = d_53_ * d_53_ + d_54_ * d_54_ + d_55_ * d_55_
                        if (d_56_ > class174.aLong2301.toDouble()) class348_sub42_sub20 = Class367_Sub11.aClass32_7415!!.method336(true) as Class348_Sub42_Sub20?
                        else {
                            var d_57_ = sqrt(d_56_)
                            if (d_57_ == 0.0) d_57_ = 1.0
                            val d_58_ = ((d_53_ * (class348_sub42_sub20.anInt9705).toDouble() + d_54_ * (class174.anInt2290).toDouble() + d_55_ * (class348_sub42_sub20.anInt9707).toDouble()) * 65535.0 / (class174.anInt2299.toDouble() * d_57_))
                            if (d_58_ < class174.anInt2298.toDouble()) class348_sub42_sub20 = (Class367_Sub11.aClass32_7415!!.method336(true) as Class348_Sub42_Sub20?)
                            else {
                                var d_59_ = 0.0
                                if (class174.anInt2289 == 1) d_59_ = (d_57_ / 16.0 * (class174.anInt2304).toDouble())
                                else if (class174.anInt2289 == 2) d_59_ = (d_57_ / 16.0 * (d_57_ / 16.0) * (class174.anInt2304).toDouble())
                                if (class174.anInt2292 == 0) {
                                    if (class174.anInt2297 == 0) {
                                        d += ((class348_sub42_sub20.anInt9705).toDouble() - d_59_) * i.toDouble()
                                        d_27_ += ((class174.anInt2290).toDouble() - d_59_) * i.toDouble()
                                        d_28_ += ((class348_sub42_sub20.anInt9707).toDouble() - d_59_) * i.toDouble()
                                        bool = true
                                    } else {
                                        this.anInt8791 = (this.anInt8791 + ((class348_sub42_sub20.anInt9705).toDouble() - d_59_) * i.toDouble()).toInt()
                                        this.anInt8796 = (this.anInt8796 + ((class174.anInt2290).toDouble() - d_59_) * i.toDouble()).toInt()
                                        this.anInt8789 = (this.anInt8789 + ((class348_sub42_sub20.anInt9707).toDouble() - d_59_) * i.toDouble()).toInt()
                                    }
                                } else {
                                    val d_60_ = (d_53_ / d_57_ * (class174.anInt2299).toDouble())
                                    val d_61_ = (d_54_ / d_57_ * (class174.anInt2299).toDouble())
                                    val d_62_ = (d_55_ / d_57_ * (class174.anInt2299).toDouble())
                                    if (class174.anInt2297 == 0) {
                                        d += d_60_ * i.toDouble()
                                        d_27_ += d_61_ * i.toDouble()
                                        d_28_ += d_62_ * i.toDouble()
                                        bool = true
                                    } else {
                                        this.anInt8791 = (this.anInt8791 + d_60_ * i.toDouble()).toInt()
                                        this.anInt8796 = (this.anInt8796 + d_61_ * i.toDouble()).toInt()
                                        this.anInt8789 = (this.anInt8789 + d_62_ * i.toDouble()).toInt()
                                    }
                                }
                                class348_sub42_sub20 = (Class367_Sub11.aClass32_7415!!.method336(true) as Class348_Sub42_Sub20?)
                            }
                        }
                    }
                }
            }
            if (class181.anIntArray2395 != null) {
                if (class181.anIntArray2385 == null) {
                    class181.anIntArray2385 = IntArray(class181.anIntArray2395.size)
                    for (i_63_ in class181.anIntArray2395.indices) {
                        method1943(false, (class181.anIntArray2395[i_63_]))
                        class181.anIntArray2385!![i_63_] = (Class59_Sub2_Sub2.aClass356_8679!!.method3480(class181.anIntArray2395[i_63_].toLong(), -6008) as Class348_Sub35).anInt6976
                    }
                }
                for (i_64_ in class181.anIntArray2385!!.indices) {
                    val class174 = (Class19.aClass174Array311!![class181.anIntArray2385!![i_64_]])
                    if (class174!!.anInt2297 == 0) {
                        d += (class174.anInt2291 * i).toDouble()
                        d_27_ += (class174.anInt2290 * i).toDouble()
                        d_28_ += (class174.anInt2294 * i).toDouble()
                        bool = true
                    } else {
                        this.anInt8791 += class174.anInt2291 * i
                        this.anInt8796 += class174.anInt2290 * i
                        this.anInt8789 += class174.anInt2294 * i
                    }
                }
            }
            if (bool) {
                while (d > 32767.0 || d_27_ > 32767.0 || d_28_ > 32767.0 || d < -32767.0 || d_27_ < -32767.0 || d_28_ < -32767.0) {
                    d /= 2.0
                    d_27_ /= 2.0
                    d_28_ /= 2.0
                    anInt10421 = anInt10421 shl 1
                }
                aShort10424 = d.toInt().toShort()
                aShort10423 = d_27_.toInt().toShort()
                aShort10422 = d_28_.toInt().toShort()
            }
            this.anInt8791 += ((aShort10424.toLong() * (anInt10421 shl 2).toLong() shr 23) * i.toLong()).toInt()
            this.anInt8796 += ((aShort10423.toLong() * (anInt10421 shl 2).toLong() shr 23) * i.toLong()).toInt()
            this.anInt8789 += ((aShort10422.toLong() * (anInt10421 shl 2).toLong() shr 23) * i.toLong()).toInt()
        }
    }

    init {
        this.anInt8791 = i shl 12
        this.anInt8796 = i_65_ shl 12
        this.anInt8789 = i_66_ shl 12
        this.anInt8790 = i_72_
        aShort10420 = i_71_.toShort()
        aShort10418 = aShort10420
        this.anInt8793 = i_73_
        this.anInt8792 = i_74_
        this.aBoolean8794 = bool_75_
        aShort10424 = i_67_.toShort()
        aShort10423 = i_68_.toShort()
        aShort10422 = i_69_.toShort()
        anInt10421 = i_70_
        this.aByte8795 = this.aClass318_Sub7_10419.aClass129_6436!!.aByte1875
        method2521()
    }
}
