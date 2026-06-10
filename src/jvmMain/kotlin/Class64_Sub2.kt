import Class10.Companion.method219
import Class239_Sub26.Companion.method1837
import Class239_Sub5.Companion.method1740
import Class246.Companion.method1885
import Class246.Companion.method1887
import Class348_Sub16_Sub2.Companion.method2832
import Class348_Sub23_Sub4.Companion.method2985
import Class348_Sub40_Sub26.Companion.method3119
import Class348_Sub40_Sub3.Companion.method3056
import Class348_Sub40_Sub9.Companion.method3073
import Class348_Sub42_Sub16.Companion.method3258
import Class348_Sub42_Sub16_Sub1.Companion.method3262
import Class348_Sub42_Sub8.Companion.method3194
import Class348_Sub42_Sub8_Sub2.Companion.method3200
import Class348_Sub9.Companion.method2783
import Class368.Companion.method3563
import Class59_Sub2_Sub1.Companion.method565
import OutputStream_Sub2.Companion.method135
import OutputStream_Sub2.Companion.method137
import ha_Sub2.Companion.method3743
import jaclib.memory.Stream.Companion.c
import kotlin.math.sqrt

class Class64_Sub2 internal constructor(var_ha_Sub3: ha_Sub3?, i: Int, i_764_: Int, bool: Boolean, bool_765_: Boolean) : Class64() {
    private var anInt5401 = 0
    private var aBoolean5402 = true
    private var anIntArray5404: IntArray? = null
    private var anInt5406 = 0
    private var anIntArrayArray5412: Array<IntArray?>? = null
    private var anIntArrayArray5413: Array<IntArray?>? = null
    private var anIntArray5415: IntArray? = null
    private var aShortArray5416: ShortArray? = null
    private var anInt5418 = 0
    private var aHa_Sub3_5419: ha_Sub3? = null
    private var aShortArray5423: ShortArray? = null
    private var aClass290_5424: Class290? = null
    private var aShort5427: Short = 0
    private var aBoolean5428 = false
    private var anIntArray5429: IntArray? = null
    private var aShortArray5432: ShortArray? = null
    private var anInt5433 = 0
    private var aShortArray5436: ShortArray? = null
    private var aShortArray5438: ShortArray? = null
    private var aShortArray5439: ShortArray? = null
    private var aClass334Array5442: Array<Class334?>? = null
    private var anInt5443 = 0
    private var aShort5452: Short = 0
    private var anIntArray5455: IntArray? = null
    private var aClass129Array5457: Array<Class129?>? = null
    private var aClass290_5460: Class290? = null
    private var anInt5461 = 0
    private var aBoolean5462 = false
    private var anInt5463 = 0
    private var anInt5467 = 0
    private var aShortArray5470: ShortArray? = null
    private var anInt5472 = 0
    private var anIntArray5473: IntArray? = null
    private var aClass342Array5474: Array<Class342?>? = null
    private var anInt5475 = 0
    private var aFloatArray5476: FloatArray? = null
    private var aBoolean5477 = false
    private var anInt5478 = 0
    private var aClass290_5482: Class290? = null
    private var aClass192_5485: Class192? = null
    private var aShortArray5486: ShortArray? = null
    private var anIntArrayArray5492: Array<IntArray?>? = null
    private var aShortArray5493: ShortArray? = null
    private var aShortArray5494: ShortArray? = null
    private var aShortArray5495: ShortArray? = null
    private var anInt5497 = 0
    private var aByteArray5499: ByteArray? = null
    private var aBoolean5502 = false
    private var aClass151_5503: Class151? = null
    private var aFloatArray5506: FloatArray? = null
    private var anInt5507 = 0
    private var aShortArray5508: ShortArray? = null
    private var anInt5509 = 0
    private var anInt5510 = 0
    private var anIntArray5511: IntArray? = null
    private var aShortArray5512: ShortArray? = null
    private var aByteArray5515: ByteArray? = null
    private var anInt5516 = 0
    private var anIntArray5519: IntArray? = null
    private var aClass290_5520: Class290? = null
    private var aClass353Array5524: Array<Class353?>? = null
    private fun method659(i: Int) {
        if (aClass353Array5524 != null) {
            aHa_Sub3_5419!!.C(!aBoolean5428)
            aHa_Sub3_5419!!.method3866(false, true)
            aHa_Sub3_5419!!.method3849(47.toByte(), 1, Class348_Sub40_Sub39.aClass70_9485)
            aHa_Sub3_5419!!.method3885(1, true, Class348_Sub40_Sub39.aClass70_9485)
            var i_0_ = 0
            while (anInt5406 > i_0_) {
                val class353 = aClass353Array5524!![i_0_]!!
                val class334 = aClass334Array5442!![i_0_]!!
                if (!class353.aBoolean4350 || !aHa_Sub3_5419!!.method3666()) {
                    val f = (0.3333333f * ((anIntArray5511!![class353.anInt4349]) - -(anIntArray5511!![class353.anInt4344]) + (anIntArray5511!![class353.anInt4339])).toFloat())
                    val f_1_ = (0.3333333f * ((anIntArray5519!![class353.anInt4344]) + (anIntArray5519!![class353.anInt4349]) + (anIntArray5519!![class353.anInt4339])).toFloat())
                    val f_2_ = (0.3333333f * ((anIntArray5429!![class353.anInt4339]) + (anIntArray5429!![class353.anInt4344]) + (anIntArray5429!![class353.anInt4349])).toFloat())
                    val f_3_ = (f_2_ * Class348_Sub42_Sub4.aFloat9516 + (Class55.aFloat1010 * f + f_1_ * Class318_Sub1_Sub2_Sub1.aFloat10199) + Class345.aFloat4268)
                    val f_4_ = (Class348_Sub12.aFloat6752 + (Class318_Sub6.aFloat6430 * f_2_ + (Class348_Sub20.aFloat6835 * f + f_1_ * Class290.aFloat3710)))
                    val f_5_ = Class240.aFloat4673 + (Class353.aFloat4338 * f_1_ + f * Class328_Sub3.aFloat6523 + f_2_ * ha.aFloat4582)
                    val f_6_ = ((1.0 / sqrt((f_5_ * f_5_ + (f_4_ * f_4_ + f_3_ * f_3_)).toDouble())).toFloat() * class353.anInt4347.toFloat())
                    val class101_sub2 = aHa_Sub3_5419!!.method3934(-96)
                    class101_sub2.method936(class334.anInt4151, 0, (class353.aShort4340 * class334.anInt4162) shr 7, (-(f_3_ * f_6_) + (class334.anInt4158.toFloat() + f_3_)), -(f_6_ * f_5_) + f_5_, (class334.anInt4154.toFloat() + f_4_ - f_4_ * f_6_), (class334.anInt4165 * class353.aShort4341) shr 7)
                    class101_sub2.method917((aHa_Sub3_5419!!.aClass101_Sub2_8082), 112.toByte())
                    aHa_Sub3_5419!!.method3915(0)
                    val i_7_ = class334.anInt4156
                    aHa_Sub3_5419!!.method3814(false, false, class353.aShort4348.toInt(), 108.toByte())
                    aHa_Sub3_5419!!.method3817(92, class353.aByte4343.toInt())
                    aHa_Sub3_5419!!.method3894(-28186, i_7_)
                    aHa_Sub3_5419!!.method3933(-114)
                }
                i_0_++
            }
            aHa_Sub3_5419!!.method3885(1, true, Class318_Sub1_Sub2.aClass70_8737)
            aHa_Sub3_5419!!.method3849(47.toByte(), 1, Class318_Sub1_Sub2.aClass70_8737)
            aHa_Sub3_5419!!.C(true)
        }
        if (i < 70) ia(112.toShort(), 86.toShort())
        anInt5454++
    }

    private fun method660(i: Int): Boolean {
        anInt5440++
        val bool = !aClass290_5482!!.aBoolean3714
        val bool_8_ = ((anInt5472 and 0x37) != 0 && !aClass290_5424!!.aBoolean3714)
        val bool_9_ = !aClass290_5520!!.aBoolean3714
        val bool_10_ = !aClass290_5460!!.aBoolean3714
        if (!bool_9_ && !bool && !bool_8_ && !bool_10_) return true
        var bool_11_ = true
        if (bool_9_) {
            if (aClass290_5520!!.anInterface5_Impl1_3708 == null) aClass290_5520!!.anInterface5_Impl1_3708 = aHa_Sub3_5419!!.method3889(aBoolean5462, 16711680)
            val interface5_impl1 = aClass290_5520!!.anInterface5_Impl1_3708!!
            interface5_impl1.method20(12 * anInt5475, 125.toByte(), 12)
            val buffer = interface5_impl1.method19(true, 26775)
            if (buffer != null) {
                aHa_Sub3_5419!!.aNativeInterface7924!!.copyPositions(anIntArray5511, anIntArray5519, anIntArray5429, aShortArray5470, 0, 12, anInt5475, buffer.getAddress())
                if (interface5_impl1.method18(6331)) {
                    aClass290_5520!!.anInterface5_Impl1_3711 = interface5_impl1
                    aClass290_5520!!.aBoolean3714 = true
                } else bool_11_ = false
            } else bool_11_ = false
        }
        if (bool) {
            if (aClass290_5482!!.anInterface5_Impl1_3708 == null) aClass290_5482!!.anInterface5_Impl1_3708 = aHa_Sub3_5419!!.method3889(aBoolean5462, 16711680)
            val interface5_impl1 = aClass290_5482!!.anInterface5_Impl1_3708!!
            interface5_impl1.method20(4 * anInt5475, 125.toByte(), 4)
            val buffer = interface5_impl1.method19(true, 26775)
            if (buffer == null) bool_11_ = false
            else {
                if ((anInt5472 and 0x37) == 0) {
                    val `is`: ShortArray?
                    val is_12_: ShortArray?
                    val is_13_: ByteArray?
                    val is_14_: ShortArray?
                    if (aClass151_5503 == null) {
                        is_13_ = aByteArray5499
                        `is` = aShortArray5436
                        is_14_ = aShortArray5493
                        is_12_ = aShortArray5438
                    } else {
                        `is` = aClass151_5503!!.aShortArray2058
                        is_12_ = aClass151_5503!!.aShortArray2060
                        is_13_ = aClass151_5503!!.aByteArray2069
                        is_14_ = aClass151_5503!!.aShortArray2067
                    }
                    aHa_Sub3_5419!!.aNativeInterface7924!!.copyLighting(aShortArray5486, aByteArray5515, aShortArray5423, is_14_, is_12_, `is`, is_13_, aShort5452.toInt(), aShort5427.toInt(), aShortArray5416, 0, 4, anInt5475, buffer.getAddress())
                } else aHa_Sub3_5419!!.aNativeInterface7924!!.copyColours(aShortArray5486, aByteArray5515, aShortArray5423, aShort5452.toInt(), aShortArray5416, 0, 4, anInt5475, buffer.getAddress())
                if (interface5_impl1.method18(6331)) {
                    aClass290_5482!!.aBoolean3714 = true
                    aClass290_5482!!.anInterface5_Impl1_3711 = interface5_impl1
                } else bool_11_ = false
            }
        }
        if (bool_8_) {
            if (aClass290_5424!!.anInterface5_Impl1_3708 == null) aClass290_5424!!.anInterface5_Impl1_3708 = aHa_Sub3_5419!!.method3889(aBoolean5462, 16711680)
            val interface5_impl1 = aClass290_5424!!.anInterface5_Impl1_3708!!
            interface5_impl1.method20(anInt5475 * 12, 125.toByte(), 12)
            val buffer = interface5_impl1.method19(true, 26775)
            if (buffer == null) bool_11_ = false
            else {
                val `is`: ShortArray?
                val is_15_: ShortArray?
                val is_16_: ByteArray?
                val is_17_: ShortArray?
                if (aClass151_5503 == null) {
                    `is` = aShortArray5436
                    is_15_ = aShortArray5493
                    is_16_ = aByteArray5499
                    is_17_ = aShortArray5438
                } else {
                    is_16_ = aClass151_5503!!.aByteArray2069
                    `is` = aClass151_5503!!.aShortArray2058
                    is_15_ = aClass151_5503!!.aShortArray2067
                    is_17_ = aClass151_5503!!.aShortArray2060
                }
                aHa_Sub3_5419!!.aNativeInterface7924!!.copyNormals(is_15_, is_17_, `is`, is_16_, 3.0f / aShort5427.toFloat(), 3.0f / (aShort5427 + aShort5427 / 2).toFloat(), 0, 12, anInt5475, buffer.getAddress())
                if (interface5_impl1.method18(6331)) {
                    aClass290_5424!!.aBoolean3714 = true
                    aClass290_5424!!.anInterface5_Impl1_3711 = interface5_impl1
                } else bool_11_ = false
            }
        }
        if (bool_10_) {
            if (aClass290_5460!!.anInterface5_Impl1_3708 == null) aClass290_5460!!.anInterface5_Impl1_3708 = aHa_Sub3_5419!!.method3889(aBoolean5462, 16711680)
            val interface5_impl1 = aClass290_5460!!.anInterface5_Impl1_3708!!
            interface5_impl1.method20(anInt5475 * 8, 126.toByte(), 8)
            val buffer = interface5_impl1.method19(true, 26775)
            if (buffer != null) {
                aHa_Sub3_5419!!.aNativeInterface7924!!.copyTexCoords(aFloatArray5476, aFloatArray5506, 0, 8, anInt5475, buffer.getAddress())
                if (interface5_impl1.method18(6331)) {
                    aClass290_5460!!.anInterface5_Impl1_3711 = interface5_impl1
                    aClass290_5460!!.aBoolean3714 = true
                } else bool_11_ = false
            } else bool_11_ = false
        }
        if (i >= -70) method623(-91, -89, null, false, 4, -45)
        return bool_11_
    }

    public override fun na(): Int {
        anInt5523++
        if (!aBoolean5477) method675(0)
        return anInt5510
    }

    public override fun NA(): Boolean {
        anInt5430++
        if (anIntArrayArray5413 == null) return false
        var i = 0
        while (anInt5497 > i) {
            anIntArray5511!![i] = anIntArray5511!![i] shl 4
            anIntArray5519!![i] = anIntArray5519!![i] shl 4
            anIntArray5429!![i] = anIntArray5429!![i] shl 4
            i++
        }
        Class136.anInt4795 = 0
        Class346.anInt4274 = 0
        Class26.anInt386 = 0
        return true
    }

    public override fun method622() {
        anInt5456++
    }

    public override fun method604(): Array<Class342?>? {
        anInt5449++
        return aClass342Array5474
    }

    public override fun LA(i: Int) {
        aShort5427 = i.toShort()
        anInt5431++
        method667(0)
        method673(65.toByte())
    }

    public override fun VA(i: Int) {
        anInt5479++
        val i_18_ = Class70.anIntArray1207!![i]
        val i_19_ = Class70.anIntArray1204!![i]
        var i_20_ = 0
        while (anInt5433 > i_20_) {
            val i_21_ = ((anIntArray5511!![i_20_] * i_19_ + i_18_ * anIntArray5519!![i_20_]) shr 14)
            anIntArray5519!![i_20_] = (i_19_ * anIntArray5519!![i_20_] + -(i_18_ * anIntArray5511!![i_20_]) shr 14)
            anIntArray5511!![i_20_] = i_21_
            i_20_++
        }
        method667(0)
        aBoolean5477 = false
    }

    public override fun method628(i: Int, i_22_: Int, class101: Class101?, bool: Boolean, i_23_: Int): Boolean {
        try {
            anInt5414++
            return method662(i, i_23_, -1, 127, i_22_, bool, class101)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.MA(" + i + ',' + i_22_ + ',' + (if (class101 != null) "{...}" else "null") + ',' + bool + ',' + i_23_ + ')'))
        }
    }

    public override fun ba(var_r: r?): r? {
        try {
            anInt5513++
            if (anInt5475 == 0) return null
            if (!aBoolean5477) method675(0)
            val i: Int
            val i_24_: Int
            if (aHa_Sub3_5419!!.anInt8133 <= 0) {
                i = (-(anInt5461 * aHa_Sub3_5419!!.anInt8133 shr 8) + anInt5507 shr aHa_Sub3_5419!!.anInt8107)
                i_24_ = ((anInt5467 - (aHa_Sub3_5419!!.anInt8133 * anInt5509 shr 8)) shr aHa_Sub3_5419!!.anInt8107)
            } else {
                i = (-(anInt5509 * aHa_Sub3_5419!!.anInt8133 shr 8) + anInt5507 shr aHa_Sub3_5419!!.anInt8107)
                i_24_ = ((anInt5467 - (anInt5461 * aHa_Sub3_5419!!.anInt8133 shr 8)) shr aHa_Sub3_5419!!.anInt8107)
            }
            val i_25_: Int
            val i_26_: Int
            if (aHa_Sub3_5419!!.anInt8114 > 0) {
                i_25_ = ((anInt5418 - (anInt5509 * aHa_Sub3_5419!!.anInt8114 shr 8)) shr aHa_Sub3_5419!!.anInt8107)
                i_26_ = (-(anInt5461 * aHa_Sub3_5419!!.anInt8114 shr 8) + anInt5443 shr aHa_Sub3_5419!!.anInt8107)
            } else {
                i_25_ = ((anInt5418 - (anInt5461 * aHa_Sub3_5419!!.anInt8114 shr 8)) shr aHa_Sub3_5419!!.anInt8107)
                i_26_ = ((anInt5443 + -(anInt5509 * aHa_Sub3_5419!!.anInt8114 shr 8)) shr aHa_Sub3_5419!!.anInt8107)
            }
            val i_27_ = 1 + (i_24_ - i)
            val i_28_ = 1 + -i_25_ + i_26_
            val var_r_Sub1 = var_r as r_Sub1?
            val var_r_Sub1_29_: r_Sub1
            if (var_r_Sub1 == null || !var_r_Sub1.method3291(i_27_, i_28_, (-59).toByte())) var_r_Sub1_29_ = r_Sub1(aHa_Sub3_5419, i_27_, i_28_)
            else {
                var_r_Sub1_29_ = var_r_Sub1
                var_r_Sub1_29_.method3289(108)
            }
            var_r_Sub1_29_.method3286(i_24_, -98, i_26_, i_25_, i)
            method665(41, var_r_Sub1_29_)
            return var_r_Sub1_29_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "nca.ba(" + (if (var_r != null) "{...}" else "null") + ')')
        }
    }

    public override fun wa() {
        anInt5484++
        var i = 0
        while (anInt5497 > i) {
            anIntArray5511!![i] = anIntArray5511!![i] + 7 shr 4
            anIntArray5519!![i] = 7 + anIntArray5519!![i] shr 4
            anIntArray5429!![i] = 7 + anIntArray5429!![i] shr 4
            i++
        }
        method667(0)
        aBoolean5477 = false
    }

    public override fun EA(): Int {
        anInt5408++
        if (!aBoolean5477) method675(0)
        return anInt5509
    }

    private fun method662(i: Int, i_30_: Int, i_31_: Int, i_32_: Int, i_33_: Int, bool: Boolean, class101: Class101?): Boolean {
        try {
            anInt5450++
            val class101_sub2 = class101 as Class101_Sub2
            val class101_sub2_34_ = aHa_Sub3_5419!!.aClass101_Sub2_8080
            val f = (class101_sub2_34_.aFloat5729 + ((class101_sub2_34_.aFloat5711 * class101_sub2.aFloat5729) + (class101_sub2_34_.aFloat5700 * class101_sub2.aFloat5710) + (class101_sub2_34_.aFloat5704 * class101_sub2.aFloat5724)))
            val f_35_ = ((class101_sub2_34_.aFloat5732 * class101_sub2.aFloat5724) + ((class101_sub2.aFloat5710 * class101_sub2_34_.aFloat5722) + (class101_sub2.aFloat5729 * class101_sub2_34_.aFloat5708)) + class101_sub2_34_.aFloat5710)
            Class348_Sub42_Sub4.aFloat9516 = ((class101_sub2_34_.aFloat5704 * class101_sub2.aFloat5716) + ((class101_sub2.aFloat5704 * class101_sub2_34_.aFloat5711) + (class101_sub2.aFloat5732 * class101_sub2_34_.aFloat5700)))
            Class328_Sub3.aFloat6523 = ((class101_sub2.aFloat5736 * class101_sub2_34_.aFloat5716) + ((class101_sub2_34_.aFloat5691 * class101_sub2.aFloat5708) + (class101_sub2.aFloat5711 * class101_sub2_34_.aFloat5736)))
            Class290.aFloat3710 = ((class101_sub2.aFloat5722 * class101_sub2_34_.aFloat5722) + (class101_sub2_34_.aFloat5708 * class101_sub2.aFloat5700) + (class101_sub2_34_.aFloat5732 * class101_sub2.aFloat5691))
            ha.aFloat4582 = ((class101_sub2.aFloat5704 * class101_sub2_34_.aFloat5736) + (class101_sub2_34_.aFloat5691 * class101_sub2.aFloat5732) + (class101_sub2.aFloat5716 * class101_sub2_34_.aFloat5716))
            Class318_Sub1_Sub2_Sub1.aFloat10199 = ((class101_sub2.aFloat5691 * class101_sub2_34_.aFloat5704) + ((class101_sub2_34_.aFloat5711 * class101_sub2.aFloat5700) + (class101_sub2_34_.aFloat5700 * class101_sub2.aFloat5722)))
            Class348_Sub20.aFloat6835 = ((class101_sub2_34_.aFloat5732 * class101_sub2.aFloat5736) + ((class101_sub2.aFloat5711 * class101_sub2_34_.aFloat5708) + (class101_sub2.aFloat5708 * class101_sub2_34_.aFloat5722)))
            Class55.aFloat1010 = ((class101_sub2_34_.aFloat5704 * class101_sub2.aFloat5736) + ((class101_sub2_34_.aFloat5700 * class101_sub2.aFloat5708) + (class101_sub2.aFloat5711 * class101_sub2_34_.aFloat5711)))
            val f_36_ = (class101_sub2_34_.aFloat5724 + ((class101_sub2_34_.aFloat5716 * class101_sub2.aFloat5724) + ((class101_sub2_34_.aFloat5736 * class101_sub2.aFloat5729) + (class101_sub2.aFloat5710 * (class101_sub2_34_.aFloat5691)))))
            Class318_Sub6.aFloat6430 = ((class101_sub2_34_.aFloat5722 * class101_sub2.aFloat5732) + (class101_sub2.aFloat5704 * class101_sub2_34_.aFloat5708) + (class101_sub2.aFloat5716 * class101_sub2_34_.aFloat5732))
            Class353.aFloat4338 = ((class101_sub2_34_.aFloat5691 * class101_sub2.aFloat5722) + (class101_sub2.aFloat5700 * class101_sub2_34_.aFloat5736) + (class101_sub2.aFloat5691 * class101_sub2_34_.aFloat5716))
            var bool_37_ = false
            var f_38_ = 3.4028235E38f
            var f_39_ = -3.4028235E38f
            var f_40_ = 3.4028235E38f
            var f_41_ = -3.4028235E38f
            val i_42_ = aHa_Sub3_5419!!.anInt8129
            val i_43_ = aHa_Sub3_5419!!.anInt8134
            if (!aBoolean5477) method675(0)
            val i_44_ = -anInt5507 + anInt5467 shr 1
            val i_45_ = anInt5509 + -anInt5461 shr 1
            if (i_32_ <= 121) O(86, -105, 66)
            val i_46_ = -anInt5418 + anInt5443 shr 1
            val i_47_ = i_44_ + anInt5507
            val i_48_ = i_45_ + anInt5461
            val i_49_ = i_46_ + anInt5418
            val i_50_ = i_47_ - (i_44_ shl i_30_)
            val i_51_ = i_48_ - (i_45_ shl i_30_)
            val i_52_ = -(i_46_ shl i_30_) + i_49_
            val i_53_ = (i_44_ shl i_30_) + i_47_
            val i_54_ = i_48_ + (i_45_ shl i_30_)
            s_Sub2.anIntArray8269!![0] = i_50_
            val i_55_ = (i_46_ shl i_30_) + i_49_
            Class348_Sub42_Sub12.anIntArray9612!![0] = i_51_
            s_Sub2.anIntArray8269!![1] = i_53_
            Class363.anIntArray4463!![0] = i_52_
            Class348_Sub42_Sub12.anIntArray9612!![1] = i_51_
            Class363.anIntArray4463!![1] = i_52_
            s_Sub2.anIntArray8269!![2] = i_50_
            Class348_Sub42_Sub12.anIntArray9612!![2] = i_54_
            Class363.anIntArray4463!![2] = i_52_
            s_Sub2.anIntArray8269!![3] = i_53_
            Class348_Sub42_Sub12.anIntArray9612!![3] = i_54_
            Class363.anIntArray4463!![3] = i_52_
            s_Sub2.anIntArray8269!![4] = i_50_
            Class348_Sub42_Sub12.anIntArray9612!![4] = i_51_
            Class363.anIntArray4463!![4] = i_55_
            s_Sub2.anIntArray8269!![5] = i_53_
            Class348_Sub42_Sub12.anIntArray9612!![5] = i_51_
            Class363.anIntArray4463!![5] = i_55_
            s_Sub2.anIntArray8269!![6] = i_50_
            Class348_Sub42_Sub12.anIntArray9612!![6] = i_54_
            s_Sub2.anIntArray8269!![7] = i_53_
            Class363.anIntArray4463!![6] = i_55_
            Class348_Sub42_Sub12.anIntArray9612!![7] = i_54_
            Class363.anIntArray4463!![7] = i_55_
            for (i_56_ in 0..7) {
                val f_57_ = s_Sub2.anIntArray8269!![i_56_].toFloat()
                val f_58_ = Class363.anIntArray4463!![i_56_].toFloat()
                val f_59_ = Class348_Sub42_Sub12.anIntArray9612!![i_56_].toFloat()
                val f_60_ = (f_57_ * Class348_Sub20.aFloat6835 + f_59_ * Class290.aFloat3710 + Class318_Sub6.aFloat6430 * f_58_ + f_35_)
                val f_61_ = (Class55.aFloat1010 * f_57_ + f_59_ * Class318_Sub1_Sub2_Sub1.aFloat10199 + f_58_ * Class348_Sub42_Sub4.aFloat9516 + f)
                var f_62_ = f_36_ + (f_58_ * ha.aFloat4582 + (Class353.aFloat4338 * f_59_ + Class328_Sub3.aFloat6523 * f_57_))
                if (f_62_ >= aHa_Sub3_5419!!.anInt8095.toFloat()) {
                    if (i_31_ > 0) f_62_ = i_31_.toFloat()
                    val f_63_ = (f_61_ * i_42_.toFloat() / f_62_ + aHa_Sub3_5419!!.anInt8094.toFloat())
                    val f_64_ = (aHa_Sub3_5419!!.anInt8130.toFloat() + i_43_.toFloat() * f_60_ / f_62_)
                    if (f_63_ < f_38_) f_38_ = f_63_
                    if (f_63_ > f_39_) f_39_ = f_63_
                    if (f_64_ < f_40_) f_40_ = f_64_
                    bool_37_ = true
                    if (f_41_ < f_64_) f_41_ = f_64_
                }
            }
            if (bool_37_ && f_38_ < i.toFloat() && f_39_ > i.toFloat() && f_40_ < i_33_.toFloat() && f_41_ > i_33_.toFloat()) {
                if (bool) return true
                if (anInt5475 > Class318_Sub1_Sub1_Sub1.anIntArray9949!!.size) {
                    Class101.anIntArray1593 = IntArray(anInt5475)
                    Class318_Sub1_Sub1_Sub1.anIntArray9949 = IntArray(anInt5475)
                }
                for (i_65_ in 0..<anInt5433) {
                    val f_66_ = anIntArray5429!![i_65_].toFloat()
                    val f_67_ = anIntArray5519!![i_65_].toFloat()
                    val f_68_ = anIntArray5511!![i_65_].toFloat()
                    var f_69_ = (ha.aFloat4582 * f_66_ + (f_68_ * Class328_Sub3.aFloat6523 + Class353.aFloat4338 * f_67_) + f_36_)
                    val f_70_ = f + (Class318_Sub1_Sub2_Sub1.aFloat10199 * f_67_ + Class55.aFloat1010 * f_68_ + f_66_ * Class348_Sub42_Sub4.aFloat9516)
                    val f_71_ = (Class318_Sub6.aFloat6430 * f_66_ + (f_68_ * Class348_Sub20.aFloat6835 + Class290.aFloat3710 * f_67_) + f_35_)
                    if (f_69_ >= aHa_Sub3_5419!!.anInt8095.toFloat()) {
                        if (i_31_ > 0) f_69_ = i_31_.toFloat()
                        val i_72_ = (i_42_.toFloat() * f_70_ / f_69_ + (aHa_Sub3_5419!!.anInt8094).toFloat()).toInt()
                        val i_73_ = ((aHa_Sub3_5419!!.anInt8130).toFloat() + f_71_ * i_43_.toFloat() / f_69_).toInt()
                        val i_74_ = anIntArray5455!![i_65_]
                        val i_75_ = anIntArray5455!![i_65_ + 1]
                        for (i_76_ in i_74_..<i_75_) {
                            val i_77_ = -1 + aShortArray5439!![i_76_]
                            if (i_77_ == -1) break
                            Class318_Sub1_Sub1_Sub1.anIntArray9949!![i_77_] = i_72_
                            Class101.anIntArray1593!![i_77_] = i_73_
                        }
                    } else {
                        val i_78_ = anIntArray5455!![i_65_]
                        val i_79_ = anIntArray5455!![i_65_ + 1]
                        var i_80_ = i_78_
                        while (i_79_ > i_80_) {
                            val i_81_ = aShortArray5439!![i_80_] + -1
                            if (i_81_ == -1) break
                            Class318_Sub1_Sub1_Sub1.anIntArray9949!![aShortArray5439!![i_80_] - 1] = -999999
                            i_80_++
                        }
                    }
                }
                var i_82_ = 0
                while (anInt5478 > i_82_) {
                    if ((Class318_Sub1_Sub1_Sub1.anIntArray9949!![aShortArray5508!![i_82_].toInt()]) != -999999 && (Class318_Sub1_Sub1_Sub1.anIntArray9949!![aShortArray5495!![i_82_].toInt()]) != -999999 && (Class318_Sub1_Sub1_Sub1.anIntArray9949!![aShortArray5512!![i_82_].toInt()]) != -999999 && method671(
                            i,
                            (Class318_Sub1_Sub1_Sub1.anIntArray9949!![aShortArray5512!![i_82_].toInt()]),
                            (Class318_Sub1_Sub1_Sub1.anIntArray9949!![aShortArray5495!![i_82_].toInt()]),
                            (Class101.anIntArray1593!![aShortArray5512!![i_82_].toInt()]),
                            (Class101.anIntArray1593!![aShortArray5508!![i_82_].toInt()]),
                            i_33_,
                            0,
                            (Class318_Sub1_Sub1_Sub1.anIntArray9949!![aShortArray5508!![i_82_].toInt()]),
                            (Class101.anIntArray1593!![aShortArray5495!![i_82_].toInt()])
                        )
                    ) return true
                    i_82_++
                }
            }
            return false
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.AB(" + i + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + bool + ',' + (if (class101 != null) "{...}" else "null") + ')'))
        }
    }

    private fun method663(i: Int) {
        anInt5500++
        if (aBoolean5402) {
            aBoolean5402 = false
            if (aClass129Array5457 == null && aClass342Array5474 == null && aClass353Array5524 == null) {
                if (anIntArray5511 != null && !Class170.method1317(anInt5472, (-91).toByte(), anInt5463)) {
                    if (aClass290_5520 == null || aClass290_5520!!.method2197((-62).toByte())) {
                        if (!aBoolean5477) method675(0)
                        anIntArray5511 = null
                    } else aBoolean5402 = true
                }
                if (anIntArray5519 != null && !method1887(0, anInt5472, anInt5463)) {
                    if (aClass290_5520 == null || aClass290_5520!!.method2197((-87).toByte())) {
                        if (!aBoolean5477) method675(0)
                        anIntArray5519 = null
                    } else aBoolean5402 = true
                }
                if (anIntArray5429 != null && !method137(anInt5472, -96, anInt5463)) {
                    if (aClass290_5520 == null || aClass290_5520!!.method2197((-34).toByte())) {
                        if (!aBoolean5477) method675(0)
                        anIntArray5429 = null
                    } else aBoolean5402 = true
                }
            }
            if (aShortArray5439 != null && anIntArray5511 == null && anIntArray5519 == null && anIntArray5429 == null) {
                anIntArray5455 = null
                aShortArray5439 = null
            }
            if (aByteArray5499 != null && !Class77.method776(anInt5472, anInt5463, i + -196608)) {
                if (if ((0x37 and anInt5472) != 0) (aClass290_5424 == null || aClass290_5424!!.method2197((-10).toByte())) else (aClass290_5482 == null || aClass290_5482!!.method2197((-73).toByte()))) {
                    aShortArray5436 = null
                    aShortArray5438 = aShortArray5436
                    aShortArray5493 = aShortArray5438
                    aByteArray5499 = null
                } else aBoolean5402 = true
            }
            if (aShortArray5486 != null && !method1740(anInt5472, anInt5463, false)) {
                if (aClass290_5482 != null && !aClass290_5482!!.method2197((-74).toByte())) aBoolean5402 = true
                else aShortArray5486 = null
            }
            if (aByteArray5515 != null && !Class348_Sub40_Sub29.method3124(anInt5472, (-119).toByte(), anInt5463)) {
                if (aClass290_5482 == null || aClass290_5482!!.method2197((-20).toByte())) aByteArray5515 = null
                else aBoolean5402 = true
            }
            if (aFloatArray5476 != null && !Class130_Sub1.method1132(1673, anInt5472, anInt5463)) {
                if (aClass290_5460 == null || aClass290_5460!!.method2197((-66).toByte())) {
                    aFloatArray5506 = null
                    aFloatArray5476 = aFloatArray5506
                } else aBoolean5402 = true
            }
            if (aShortArray5423 != null && !method219(anInt5463, false, anInt5472)) {
                if (aClass290_5482 != null && !aClass290_5482!!.method2197((-125).toByte())) aBoolean5402 = true
                else aShortArray5423 = null
            }
            if (i != 262144) method623(-95, 94, null, true, 116, 62)
            if (aShortArray5508 != null && !Class168.method1299(i + 131072, anInt5463, anInt5472)) {
                if ((aClass192_5485 == null || aClass192_5485!!.method1437((-100).toByte())) && (aClass290_5482 == null || aClass290_5482!!.method2197((-56).toByte()))) {
                    aShortArray5512 = null
                    aShortArray5495 = aShortArray5512
                    aShortArray5508 = aShortArray5495
                } else aBoolean5402 = true
            }
            if (aShortArray5470 != null) {
                if (aClass290_5520 == null || aClass290_5520!!.method2197((-83).toByte())) aShortArray5470 = null
                else aBoolean5402 = true
            }
            if (aShortArray5416 != null) {
                if (aClass290_5482 == null || aClass290_5482!!.method2197((-36).toByte())) aShortArray5416 = null
                else aBoolean5402 = true
            }
            if (anIntArrayArray5492 != null && !Class135_Sub2.method1158(anInt5472, -1, anInt5463)) {
                aShortArray5432 = null
                anIntArrayArray5492 = null
            }
            if (anIntArrayArray5413 != null && !Class160.method1257(-83, anInt5472, anInt5463)) {
                anIntArrayArray5413 = null
                aShortArray5494 = null
            }
            if (anIntArrayArray5412 != null && !Class77.method780(anInt5472, 0, anInt5463)) anIntArrayArray5412 = null
            if (anIntArray5404 != null && (0x800 and anInt5463) == 0 && (anInt5463 and 0x40000) == 0) {
                anIntArray5404 = null
                anIntArray5473 = null
                anIntArray5415 = null
            }
        }
    }

    public override fun a(i: Int) {
        anInt5435++
        val i_83_ = Class70.anIntArray1207!![i]
        val i_84_ = Class70.anIntArray1204!![i]
        var i_85_ = 0
        while (anInt5433 > i_85_) {
            val i_86_ = ((i_84_ * anIntArray5511!![i_85_] + anIntArray5429!![i_85_] * i_83_) shr 14)
            anIntArray5429!![i_85_] = (i_84_ * anIntArray5429!![i_85_] + -(i_83_ * anIntArray5511!![i_85_]) shr 14)
            anIntArray5511!![i_85_] = i_86_
            i_85_++
        }
        method667(0)
        aBoolean5477 = false
    }

    public override fun FA(i: Int) {
        anInt5488++
        val i_87_ = Class70.anIntArray1207!![i]
        val i_88_ = Class70.anIntArray1204!![i]
        for (i_89_ in 0..<anInt5433) {
            val i_90_ = (anIntArray5519!![i_89_] * i_88_ + -(anIntArray5429!![i_89_] * i_87_) shr 14)
            anIntArray5429!![i_89_] = (anIntArray5429!![i_89_] * i_88_ + anIntArray5519!![i_89_] * i_87_) shr 14
            anIntArray5519!![i_89_] = i_90_
        }
        method667(0)
        aBoolean5477 = false
    }

    public override fun ua(): Int {
        anInt5504++
        return anInt5463
    }

    public override fun G(): Int {
        anInt5437++
        if (!aBoolean5477) method675(0)
        return anInt5443
    }

    fun method664(i: Int) {
        anInt5483++
        if (aClass290_5520 != null) aClass290_5520!!.method2195(false)
        if (aClass290_5460 != null) aClass290_5460!!.method2195(false)
        if (aClass290_5482 != null) aClass290_5482!!.method2195(false)
        if (i != -23755) aBoolean5477 = false
        if (aClass290_5424 != null) aClass290_5424!!.method2195(false)
        if (aClass192_5485 != null) aClass192_5485!!.method1435((-95).toByte())
    }

    public override fun method619(): Array<Class129?>? {
        anInt5469++
        return aClass129Array5457
    }

    public override fun P(i: Int, i_91_: Int, i_92_: Int, i_93_: Int) {
        anInt5480++
        if (i == 0) {
            var i_94_ = 0
            Class136.anInt4795 = 0
            Class346.anInt4274 = 0
            Class26.anInt386 = 0
            for (i_95_ in 0..<anInt5433) {
                Class136.anInt4795 += anIntArray5511!![i_95_]
                Class26.anInt386 += anIntArray5519!![i_95_]
                Class346.anInt4274 += anIntArray5429!![i_95_]
                i_94_++
            }
            if (i_94_ > 0) {
                Class346.anInt4274 = i_93_ + Class346.anInt4274 / i_94_
                Class26.anInt386 = i_92_ + Class26.anInt386 / i_94_
                Class136.anInt4795 = i_91_ + Class136.anInt4795 / i_94_
            } else {
                Class26.anInt386 = i_92_
                Class346.anInt4274 = i_93_
                Class136.anInt4795 = i_91_
            }
        } else if (i == 1) {
            for (i_96_ in 0..<anInt5433) {
                anIntArray5511!![i_96_] += i_91_
                anIntArray5519!![i_96_] += i_92_
                anIntArray5429!![i_96_] += i_93_
            }
        } else if (i == 2) {
            var i_97_ = 0
            while (anInt5433 > i_97_) {
                anIntArray5511!![i_97_] -= Class136.anInt4795
                anIntArray5519!![i_97_] -= Class26.anInt386
                anIntArray5429!![i_97_] -= Class346.anInt4274
                if (i_93_ != 0) {
                    val i_98_ = Class70.anIntArray1207!![i_93_]
                    val i_99_ = Class70.anIntArray1204!![i_93_]
                    val i_100_ = ((16383 + i_99_ * anIntArray5511!![i_97_] + anIntArray5519!![i_97_] * i_98_) shr 14)
                    anIntArray5519!![i_97_] = (16383 + (-(anIntArray5511!![i_97_] * i_98_) + anIntArray5519!![i_97_] * i_99_) shr 14)
                    anIntArray5511!![i_97_] = i_100_
                }
                if (i_91_ != 0) {
                    val i_101_ = Class70.anIntArray1207!![i_91_]
                    val i_102_ = Class70.anIntArray1204!![i_91_]
                    val i_103_ = (16383 + (anIntArray5519!![i_97_] * i_102_ + -(i_101_ * anIntArray5429!![i_97_])) shr 14)
                    anIntArray5429!![i_97_] = (anIntArray5429!![i_97_] * i_102_ + (anIntArray5519!![i_97_] * i_101_ - -16383)) shr 14
                    anIntArray5519!![i_97_] = i_103_
                }
                if (i_92_ != 0) {
                    val i_104_ = Class70.anIntArray1207!![i_92_]
                    val i_105_ = Class70.anIntArray1204!![i_92_]
                    val i_106_ = ((i_105_ * anIntArray5511!![i_97_] + anIntArray5429!![i_97_] * i_104_ + 16383) shr 14)
                    anIntArray5429!![i_97_] = (16383 + -(i_104_ * anIntArray5511!![i_97_]) + i_105_ * anIntArray5429!![i_97_]) shr 14
                    anIntArray5511!![i_97_] = i_106_
                }
                anIntArray5511!![i_97_] += Class136.anInt4795
                anIntArray5519!![i_97_] += Class26.anInt386
                anIntArray5429!![i_97_] += Class346.anInt4274
                i_97_++
            }
        } else if (i == 3) {
            for (i_107_ in 0..<anInt5433) {
                anIntArray5511!![i_107_] -= Class136.anInt4795
                anIntArray5519!![i_107_] -= Class26.anInt386
                anIntArray5429!![i_107_] -= Class346.anInt4274
                anIntArray5511!![i_107_] = anIntArray5511!![i_107_] * i_91_ / 128
                anIntArray5519!![i_107_] = anIntArray5519!![i_107_] * i_92_ / 128
                anIntArray5429!![i_107_] = anIntArray5429!![i_107_] * i_93_ / 128
                anIntArray5511!![i_107_] += Class136.anInt4795
                anIntArray5519!![i_107_] += Class26.anInt386
                anIntArray5429!![i_107_] += Class346.anInt4274
            }
        } else if (i == 5) {
            var i_108_ = 0
            while (anInt5478 > i_108_) {
                var i_109_ = i_91_ * 8 + (0xff and aByteArray5515!![i_108_].toInt())
                if (i_109_ >= 0) {
                    if (i_109_ > 255) i_109_ = 255
                } else i_109_ = 0
                aByteArray5515!![i_108_] = i_109_.toByte()
                i_108_++
            }
            if (aClass353Array5524 != null) {
                var i_110_ = 0
                while (anInt5406 > i_110_) {
                    val class353 = aClass353Array5524!![i_110_]!!
                    val class334 = aClass334Array5442!![i_110_]!!
                    class334.anInt4156 = (class334.anInt4156 and 0xffffff or (255 - ((aByteArray5515!![class353.anInt4342]).toInt() and 0xff) shl 24))
                    i_110_++
                }
            }
            method670(-89)
        } else if (i == 7) {
            for (i_111_ in 0..<anInt5478) {
                val i_112_ = 0xffff and aShortArray5486!![i_111_].toInt()
                var i_113_ = 0x3f and (i_112_ shr 10)
                var i_114_ = (i_112_ and 0x3e6) shr 7
                i_114_ += i_92_ / 4
                var i_115_ = 0x7f and i_112_
                i_113_ = 0x3f and i_113_ + i_91_
                i_115_ += i_93_
                if (i_114_ >= 0) {
                    if (i_114_ > 7) i_114_ = 7
                } else i_114_ = 0
                if (i_115_ < 0) i_115_ = 0
                else if (i_115_ > 127) i_115_ = 127
                aShortArray5486!![i_111_] = (Class273.method2057(Class273.method2057(i_114_ shl 7, i_113_ shl 10), i_115_)).toShort()
            }
            if (aClass353Array5524 != null) {
                for (i_116_ in 0..<anInt5406) {
                    val class353 = aClass353Array5524!![i_116_]!!
                    val class334 = aClass334Array5442!![i_116_]!!
                    class334.anInt4156 = ((Class10.anIntArray179!![(aShortArray5486!![class353.anInt4342].toInt() and 0xffff)]) and 0xffffff or (0xffffff.inv() and class334.anInt4156))
                }
            }
            method670(-109)
        } else if (i == 8) {
            var i_117_ = 0
            while (anInt5406 > i_117_) {
                val class334 = aClass334Array5442!![i_117_]!!
                class334.anInt4154 += i_92_
                class334.anInt4158 += i_91_
                i_117_++
            }
        } else if (i == 10) {
            var i_118_ = 0
            while (anInt5406 > i_118_) {
                val class334 = aClass334Array5442!![i_118_]!!
                class334.anInt4162 = class334.anInt4162 * i_92_ shr 7
                class334.anInt4165 = class334.anInt4165 * i_91_ shr 7
                i_118_++
            }
        } else if (i == 9) {
            var i_119_ = 0
            while (anInt5406 > i_119_) {
                val class334 = aClass334Array5442!![i_119_]!!
                class334.anInt4151 = class334.anInt4151 + i_91_ and 0x3fff
                i_119_++
            }
        }
    }

    public override fun O(i: Int, i_120_: Int, i_121_: Int) {
        var i_122_ = 0
        while (anInt5433 > i_122_) {
            if (i != 128) anIntArray5511!![i_122_] = i * anIntArray5511!![i_122_] shr 7
            if (i_120_ != 128) anIntArray5519!![i_122_] = i_120_ * anIntArray5519!![i_122_] shr 7
            if (i_121_ != 128) anIntArray5429!![i_122_] = i_121_ * anIntArray5429!![i_122_] shr 7
            i_122_++
        }
        anInt5525++
        method667(0)
        aBoolean5477 = false
    }

    private fun method665(i: Int, var_r_Sub1: r_Sub1) {
        try {
            if (anInt5475 > Class318_Sub1_Sub1_Sub1.anIntArray9949!!.size) {
                Class101.anIntArray1593 = IntArray(anInt5475)
                Class318_Sub1_Sub1_Sub1.anIntArray9949 = IntArray(anInt5475)
            }
            anInt5453++
            if (i >= 0) {
                var i_123_ = 0
                while (anInt5433 > i_123_) {
                    val i_124_ = (-var_r_Sub1.anInt10468 + ((anIntArray5511!![i_123_] + -((aHa_Sub3_5419!!.anInt8133 * anIntArray5519!![i_123_]) shr 8)) shr aHa_Sub3_5419!!.anInt8107))
                    val i_125_ = (((anIntArray5429!![i_123_] + -((aHa_Sub3_5419!!.anInt8114 * anIntArray5519!![i_123_]) shr 8)) shr aHa_Sub3_5419!!.anInt8107) + -var_r_Sub1.anInt10474)
                    val i_126_ = anIntArray5455!![i_123_]
                    val i_127_ = anIntArray5455!![i_123_ - -1]
                    for (i_128_ in i_126_..<i_127_) {
                        val i_129_ = aShortArray5439!![i_128_] - 1
                        if (i_129_ == -1) break
                        Class318_Sub1_Sub1_Sub1.anIntArray9949!![i_129_] = i_124_
                        Class101.anIntArray1593!![i_129_] = i_125_
                    }
                    i_123_++
                }
                var i_130_ = 0
                while (anInt5516 > i_130_) {
                    if (aByteArray5515 == null || aByteArray5515!![i_130_] <= 128) {
                        val i_131_ = aShortArray5508!![i_130_]
                        val i_132_ = aShortArray5495!![i_130_]
                        val i_133_ = aShortArray5512!![i_130_]
                        val i_134_ = Class318_Sub1_Sub1_Sub1.anIntArray9949!![i_131_.toInt()]
                        val i_135_ = Class318_Sub1_Sub1_Sub1.anIntArray9949!![i_132_.toInt()]
                        val i_136_ = Class318_Sub1_Sub1_Sub1.anIntArray9949!![i_133_.toInt()]
                        val i_137_ = Class101.anIntArray1593!![i_131_.toInt()]
                        val i_138_ = Class101.anIntArray1593!![i_132_.toInt()]
                        val i_139_ = Class101.anIntArray1593!![i_133_.toInt()]
                        if ((-((i_136_ - i_135_) * (-i_137_ + i_138_)) + (i_138_ - i_139_) * (-i_135_ + i_134_)) > 0) var_r_Sub1.method3287(i_137_, 50, i_134_, i_135_, i_138_, i_139_, i_136_)
                    }
                    i_130_++
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.B(" + i + ',' + (if (var_r_Sub1 != null) "{...}" else "null") + ')'))
        }
    }

    public override fun k(i: Int) {
        anInt5490++
        val i_140_ = Class70.anIntArray1207!![i]
        val i_141_ = Class70.anIntArray1204!![i]
        for (i_142_ in 0..<anInt5433) {
            val i_143_ = ((anIntArray5511!![i_142_] * i_141_ + anIntArray5429!![i_142_] * i_140_) shr 14)
            anIntArray5429!![i_142_] = (i_141_ * anIntArray5429!![i_142_] + -(i_140_ * anIntArray5511!![i_142_])) shr 14
            anIntArray5511!![i_142_] = i_143_
        }
        for (i_144_ in 0..<anInt5475) {
            val i_145_ = (aShortArray5436!![i_144_] * i_140_ - -(aShortArray5493!![i_144_] * i_141_) shr 14)
            aShortArray5436!![i_144_] = ((i_141_ * aShortArray5436!![i_144_] + -(i_140_ * aShortArray5493!![i_144_])) shr 14).toShort()
            aShortArray5493!![i_144_] = i_145_.toShort()
        }
        method667(0)
        method673(112.toByte())
        aBoolean5477 = false
    }

    private fun method666(i: Int): Boolean {
        anInt5421++
        if (aClass192_5485!!.aBoolean2577) return true
        if (aClass192_5485!!.anInterface5_Impl2_2576 == null) aClass192_5485!!.anInterface5_Impl2_2576 = aHa_Sub3_5419!!.method3840(-28633, aBoolean5462)
        val interface5_impl2 = aClass192_5485!!.anInterface5_Impl2_2576!!
        interface5_impl2.method23(15959, 6 * anInt5516)
        val buffer = interface5_impl2.method24(true, false)
        val i_146_ = 84 / ((-70 - i) / 49)
        if (buffer != null) {
            val stream = aHa_Sub3_5419!!.method3893(buffer, 9179)
            if (c()) {
                var i_148_ = 0
                while (anInt5516 > i_148_) {
                    stream.d(aShortArray5508!![i_148_].toInt())
                    stream.d(aShortArray5495!![i_148_].toInt())
                    stream.d(aShortArray5512!![i_148_].toInt())
                    i_148_++
                }
            } else {
                var i_147_ = 0
                while (anInt5516 > i_147_) {
                    stream.a(aShortArray5508!![i_147_].toInt())
                    stream.a(aShortArray5495!![i_147_].toInt())
                    stream.a(aShortArray5512!![i_147_].toInt())
                    i_147_++
                }
            }
            stream.a()
            if (interface5_impl2.method22(-23)) {
                aClass192_5485!!.aBoolean2577 = true
                aBoolean5402 = true
                aClass192_5485!!.anInterface5_Impl2_2572 = interface5_impl2
                return true
            }
        }
        return false
    }

    public override fun method610(class101: Class101, i: Int, bool: Boolean) {
        try {
            anInt5434++
            if (aShortArray5494 != null) {
                val `is` = IntArray(3)
                for (i_149_ in 0..<anInt5433) {
                    if ((i and aShortArray5494!![i_149_].toInt()) != 0) {
                        if (!bool) class101.method897(anIntArray5511!![i_149_], anIntArray5519!![i_149_], anIntArray5429!![i_149_], `is`)
                        else class101.method892(anIntArray5511!![i_149_], anIntArray5519!![i_149_], anIntArray5429!![i_149_], `is`)
                        anIntArray5511!![i_149_] = `is`[0]
                        anIntArray5519!![i_149_] = `is`[1]
                        anIntArray5429!![i_149_] = `is`[2]
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.za(" + (if (class101 != null) "{...}" else "null") + ',' + i + ',' + bool + ')'))
        }
    }

    private fun method667(i: Int) {
        anInt5491++
        if (i == 0) {
            if (aClass290_5520 != null) aClass290_5520!!.aBoolean3714 = false
        }
    }

    public override fun H(i: Int, i_150_: Int, i_151_: Int) {
        anInt5481++
        var i_152_ = 0
        while (anInt5433 > i_152_) {
            if (i != 0) anIntArray5511!![i_152_] += i
            if (i_150_ != 0) anIntArray5519!![i_152_] += i_150_
            if (i_151_ != 0) anIntArray5429!![i_152_] += i_151_
            i_152_++
        }
        method667(0)
        aBoolean5477 = false
    }

    private fun method668(bool: Boolean, class64_sub2_153_: Class64_Sub2?, class64_sub2_154_: Class64_Sub2?, i: Int, bool_155_: Boolean, i_156_: Int): Class64? {
        try {
            class64_sub2_154_!!.anInt5497 = anInt5497
            class64_sub2_154_.anInt5478 = anInt5478
            class64_sub2_154_.anInt5475 = anInt5475
            class64_sub2_154_.aShort5427 = aShort5427
            class64_sub2_154_.anInt5433 = anInt5433
            anInt5411++
            class64_sub2_154_.anInt5516 = anInt5516
            class64_sub2_154_.anInt5463 = i
            class64_sub2_154_.anInt5472 = anInt5472
            class64_sub2_154_.anInt5406 = anInt5406
            class64_sub2_154_.aBoolean5502 = aBoolean5502
            if ((0x100 and i) == 0) class64_sub2_154_.aBoolean5428 = aBoolean5428
            else class64_sub2_154_.aBoolean5428 = true
            class64_sub2_154_.aShort5452 = aShort5452
            val bool_157_ = Class294.method2217(anInt5472, i, 0)
            val bool_158_ = method3056(i_156_ + -26704, i, anInt5472)
            val bool_159_ = method3073(anInt5472, i, 50.toByte())
            val bool_160_ = bool_157_ or bool_158_ or bool_159_
            if (bool_160_) {
                if (bool_157_) {
                    if (class64_sub2_153_!!.anIntArray5511 != null && anInt5497 <= class64_sub2_153_.anIntArray5511!!.size) class64_sub2_154_.anIntArray5511 = class64_sub2_153_.anIntArray5511
                    else {
                        class64_sub2_153_.anIntArray5511 = IntArray(anInt5497)
                        class64_sub2_154_.anIntArray5511 = class64_sub2_153_.anIntArray5511
                    }
                } else class64_sub2_154_.anIntArray5511 = anIntArray5511
                if (bool_158_) {
                    if (class64_sub2_153_!!.anIntArray5519 != null && (anInt5497 <= class64_sub2_153_.anIntArray5519!!.size)) class64_sub2_154_.anIntArray5519 = class64_sub2_153_.anIntArray5519
                    else {
                        class64_sub2_153_.anIntArray5519 = IntArray(anInt5497)
                        class64_sub2_154_.anIntArray5519 = class64_sub2_153_.anIntArray5519
                    }
                } else class64_sub2_154_.anIntArray5519 = anIntArray5519
                if (bool_159_) {
                    if (class64_sub2_153_!!.anIntArray5429 == null || anInt5497 > class64_sub2_153_.anIntArray5429!!.size) {
                        class64_sub2_153_.anIntArray5429 = IntArray(anInt5497)
                        class64_sub2_154_.anIntArray5429 = class64_sub2_153_.anIntArray5429
                    } else class64_sub2_154_.anIntArray5429 = class64_sub2_153_.anIntArray5429
                } else class64_sub2_154_.anIntArray5429 = anIntArray5429
                var i_161_ = 0
                while (anInt5497 > i_161_) {
                    if (bool_157_) class64_sub2_154_.anIntArray5511!![i_161_] = anIntArray5511!![i_161_]
                    if (bool_158_) class64_sub2_154_.anIntArray5519!![i_161_] = anIntArray5519!![i_161_]
                    if (bool_159_) class64_sub2_154_.anIntArray5429!![i_161_] = anIntArray5429!![i_161_]
                    i_161_++
                }
            } else {
                class64_sub2_154_.anIntArray5511 = anIntArray5511
                class64_sub2_154_.anIntArray5429 = anIntArray5429
                class64_sub2_154_.anIntArray5519 = anIntArray5519
            }
            if (Class264.method2015(i, anInt5472, 7)) {
                class64_sub2_154_.aClass290_5520 = class64_sub2_153_!!.aClass290_5520
                class64_sub2_154_.aClass290_5520!!.anInterface5_Impl1_3711 = aClass290_5520!!.anInterface5_Impl1_3711
                class64_sub2_154_.aClass290_5520!!.aBoolean3714 = aClass290_5520!!.aBoolean3714
                class64_sub2_154_.aClass290_5520!!.aBoolean3709 = true
            } else if (!Class161.method1258(i, -9301, anInt5472)) class64_sub2_154_.aClass290_5520 = null
            else class64_sub2_154_.aClass290_5520 = aClass290_5520
            if (Class239_Sub26.method1833((-122).toByte(), i, anInt5472)) {
                if (class64_sub2_153_!!.aShortArray5486 != null && (anInt5478 <= class64_sub2_153_.aShortArray5486!!.size)) class64_sub2_154_.aShortArray5486 = class64_sub2_153_.aShortArray5486
                else {
                    class64_sub2_153_.aShortArray5486 = ShortArray(anInt5478)
                    class64_sub2_154_.aShortArray5486 = class64_sub2_153_.aShortArray5486
                }
                var i_162_ = 0
                while (anInt5478 > i_162_) {
                    class64_sub2_154_.aShortArray5486!![i_162_] = aShortArray5486!![i_162_]
                    i_162_++
                }
            } else class64_sub2_154_.aShortArray5486 = aShortArray5486
            if (method2985(-31735, anInt5472, i)) {
                if (class64_sub2_153_!!.aByteArray5515 == null || class64_sub2_153_.aByteArray5515!!.size < anInt5478) {
                    class64_sub2_153_.aByteArray5515 = ByteArray(anInt5478)
                    class64_sub2_154_.aByteArray5515 = class64_sub2_153_.aByteArray5515
                } else class64_sub2_154_.aByteArray5515 = class64_sub2_153_.aByteArray5515
                for (i_163_ in 0..<anInt5478) class64_sub2_154_.aByteArray5515!![i_163_] = aByteArray5515!![i_163_]
            } else class64_sub2_154_.aByteArray5515 = aByteArray5515
            if (Class348_Sub42_Sub8_Sub2.method3200(i, anInt5472, (-75).toByte())) {
                class64_sub2_154_.aClass290_5482 = class64_sub2_153_!!.aClass290_5482
                class64_sub2_154_.aClass290_5482!!.aBoolean3709 = true
                class64_sub2_154_.aClass290_5482!!.aBoolean3714 = aClass290_5482!!.aBoolean3714
                class64_sub2_154_.aClass290_5482!!.anInterface5_Impl1_3711 = aClass290_5482!!.anInterface5_Impl1_3711
            } else if (Class296.method2224(i, 117.toByte(), anInt5472)) class64_sub2_154_.aClass290_5482 = aClass290_5482
            else class64_sub2_154_.aClass290_5482 = null
            if (Class274.method2058(i, anInt5472, 116)) {
                if (class64_sub2_153_!!.aShortArray5493 == null || (anInt5475 > class64_sub2_153_.aShortArray5493!!.size)) {
                    val i_164_ = anInt5475
                    class64_sub2_153_.aShortArray5436 = ShortArray(i_164_)
                    class64_sub2_154_.aShortArray5436 = class64_sub2_153_.aShortArray5436
                    class64_sub2_153_.aShortArray5493 = ShortArray(i_164_)
                    class64_sub2_154_.aShortArray5493 = class64_sub2_153_.aShortArray5493
                    class64_sub2_153_.aShortArray5438 = ShortArray(i_164_)
                    class64_sub2_154_.aShortArray5438 = class64_sub2_153_.aShortArray5438
                } else {
                    class64_sub2_154_.aShortArray5436 = class64_sub2_153_.aShortArray5436
                    class64_sub2_154_.aShortArray5493 = class64_sub2_153_.aShortArray5493
                    class64_sub2_154_.aShortArray5438 = class64_sub2_153_.aShortArray5438
                }
                if (aClass151_5503 == null) {
                    class64_sub2_154_.aClass151_5503 = null
                    var i_165_ = 0
                    while (anInt5475 > i_165_) {
                        class64_sub2_154_.aShortArray5493!![i_165_] = aShortArray5493!![i_165_]
                        class64_sub2_154_.aShortArray5438!![i_165_] = aShortArray5438!![i_165_]
                        class64_sub2_154_.aShortArray5436!![i_165_] = aShortArray5436!![i_165_]
                        i_165_++
                    }
                } else {
                    if (class64_sub2_153_.aClass151_5503 == null) class64_sub2_153_.aClass151_5503 = Class151()
                    val class151 = (class64_sub2_153_.aClass151_5503.also { class64_sub2_154_.aClass151_5503 = it })!!
                    if (class151.aShortArray2067 == null || (class151.aShortArray2067!!.size < anInt5475)) {
                        val i_166_ = anInt5475
                        class151.aByteArray2069 = ByteArray(i_166_)
                        class151.aShortArray2067 = ShortArray(i_166_)
                        class151.aShortArray2058 = ShortArray(i_166_)
                        class151.aShortArray2060 = ShortArray(i_166_)
                    }
                    for (i_167_ in 0..<anInt5475) {
                        class64_sub2_154_.aShortArray5493!![i_167_] = aShortArray5493!![i_167_]
                        class64_sub2_154_.aShortArray5438!![i_167_] = aShortArray5438!![i_167_]
                        class64_sub2_154_.aShortArray5436!![i_167_] = aShortArray5436!![i_167_]
                        class151.aShortArray2067!![i_167_] = (aClass151_5503!!.aShortArray2067!![i_167_])
                        class151.aShortArray2060!![i_167_] = (aClass151_5503!!.aShortArray2060!![i_167_])
                        class151.aShortArray2058!![i_167_] = (aClass151_5503!!.aShortArray2058!![i_167_])
                        class151.aByteArray2069!![i_167_] = (aClass151_5503!!.aByteArray2069!![i_167_])
                    }
                }
                class64_sub2_154_.aByteArray5499 = aByteArray5499
            } else {
                class64_sub2_154_.aByteArray5499 = aByteArray5499
                class64_sub2_154_.aClass151_5503 = aClass151_5503
                class64_sub2_154_.aShortArray5436 = aShortArray5436
                class64_sub2_154_.aShortArray5493 = aShortArray5493
                class64_sub2_154_.aShortArray5438 = aShortArray5438
            }
            if (Class126.method1113(i, anInt5472, -30)) {
                class64_sub2_154_.aClass290_5424 = class64_sub2_153_!!.aClass290_5424
                class64_sub2_154_.aClass290_5424!!.anInterface5_Impl1_3711 = aClass290_5424!!.anInterface5_Impl1_3711
                class64_sub2_154_.aClass290_5424!!.aBoolean3709 = true
                class64_sub2_154_.aClass290_5424!!.aBoolean3714 = aClass290_5424!!.aBoolean3714
            } else if (!Class188.method1412((-35).toByte(), anInt5472, i)) class64_sub2_154_.aClass290_5424 = null
            else class64_sub2_154_.aClass290_5424 = aClass290_5424
            if (method3194(i, anInt5472, 121.toByte())) {
                if (class64_sub2_153_!!.aFloatArray5476 == null || (class64_sub2_153_.aFloatArray5476!!.size < anInt5478)) {
                    val i_168_ = anInt5475
                    class64_sub2_153_.aFloatArray5506 = FloatArray(i_168_)
                    class64_sub2_154_.aFloatArray5506 = class64_sub2_153_.aFloatArray5506
                    class64_sub2_153_.aFloatArray5476 = FloatArray(i_168_)
                    class64_sub2_154_.aFloatArray5476 = class64_sub2_153_.aFloatArray5476
                } else {
                    class64_sub2_154_.aFloatArray5476 = class64_sub2_153_.aFloatArray5476
                    class64_sub2_154_.aFloatArray5506 = class64_sub2_153_.aFloatArray5506
                }
                for (i_169_ in 0..<anInt5475) {
                    class64_sub2_154_.aFloatArray5476!![i_169_] = aFloatArray5476!![i_169_]
                    class64_sub2_154_.aFloatArray5506!![i_169_] = aFloatArray5506!![i_169_]
                }
            } else {
                class64_sub2_154_.aFloatArray5476 = aFloatArray5476
                class64_sub2_154_.aFloatArray5506 = aFloatArray5506
            }
            if (Class183.method1379(4, anInt5472, i)) {
                class64_sub2_154_.aClass290_5460 = class64_sub2_153_!!.aClass290_5460
                class64_sub2_154_.aClass290_5460!!.anInterface5_Impl1_3711 = aClass290_5460!!.anInterface5_Impl1_3711
                class64_sub2_154_.aClass290_5460!!.aBoolean3714 = aClass290_5460!!.aBoolean3714
                class64_sub2_154_.aClass290_5460!!.aBoolean3709 = true
            } else if (method1837(anInt5472, 56, i)) class64_sub2_154_.aClass290_5460 = aClass290_5460
            else class64_sub2_154_.aClass290_5460 = null
            if (method3262(i, anInt5472, 94)) {
                if (class64_sub2_153_!!.aShortArray5508 != null && (class64_sub2_153_.aShortArray5508!!.size >= anInt5478)) {
                    class64_sub2_154_.aShortArray5508 = class64_sub2_153_.aShortArray5508
                    class64_sub2_154_.aShortArray5495 = class64_sub2_153_.aShortArray5495
                    class64_sub2_154_.aShortArray5512 = class64_sub2_153_.aShortArray5512
                } else {
                    val i_170_ = anInt5478
                    class64_sub2_153_.aShortArray5512 = ShortArray(i_170_)
                    class64_sub2_154_.aShortArray5512 = class64_sub2_153_.aShortArray5512
                    class64_sub2_153_.aShortArray5495 = ShortArray(i_170_)
                    class64_sub2_154_.aShortArray5495 = class64_sub2_153_.aShortArray5495
                    class64_sub2_153_.aShortArray5508 = ShortArray(i_170_)
                    class64_sub2_154_.aShortArray5508 = class64_sub2_153_.aShortArray5508
                }
                for (i_171_ in 0..<anInt5478) {
                    class64_sub2_154_.aShortArray5508!![i_171_] = aShortArray5508!![i_171_]
                    class64_sub2_154_.aShortArray5495!![i_171_] = aShortArray5495!![i_171_]
                    class64_sub2_154_.aShortArray5512!![i_171_] = aShortArray5512!![i_171_]
                }
            } else {
                class64_sub2_154_.aShortArray5495 = aShortArray5495
                class64_sub2_154_.aShortArray5512 = aShortArray5512
                class64_sub2_154_.aShortArray5508 = aShortArray5508
            }
            if (method2783(anInt5472, 80.toByte(), i)) {
                class64_sub2_154_.aClass192_5485 = class64_sub2_153_!!.aClass192_5485
                class64_sub2_154_.aClass192_5485!!.aBoolean2577 = aClass192_5485!!.aBoolean2577
                class64_sub2_154_.aClass192_5485!!.aBoolean2574 = true
                class64_sub2_154_.aClass192_5485!!.anInterface5_Impl2_2572 = aClass192_5485!!.anInterface5_Impl2_2572
            } else if (method3563(i, 56.toByte(), anInt5472)) class64_sub2_154_.aClass192_5485 = aClass192_5485
            else class64_sub2_154_.aClass192_5485 = null
            if (Class278.method2077(-122, anInt5472, i)) {
                if (class64_sub2_153_!!.aShortArray5423 != null && class64_sub2_153_.aShortArray5423!!.size >= anInt5478) class64_sub2_154_.aShortArray5423 = class64_sub2_153_.aShortArray5423
                else {
                    val i_172_ = anInt5478
                    class64_sub2_153_.aShortArray5423 = ShortArray(i_172_)
                    class64_sub2_154_.aShortArray5423 = class64_sub2_153_.aShortArray5423
                }
                var i_173_ = 0
                while (anInt5478 > i_173_) {
                    class64_sub2_154_.aShortArray5423!![i_173_] = aShortArray5423!![i_173_]
                    i_173_++
                }
            } else class64_sub2_154_.aShortArray5423 = aShortArray5423
            if (method3119(i, i_156_ xor 0x6897, anInt5472)) {
                if (class64_sub2_153_!!.aClass334Array5442 != null && (anInt5406 <= class64_sub2_153_.aClass334Array5442!!.size)) {
                    class64_sub2_154_.aClass334Array5442 = class64_sub2_153_!!.aClass334Array5442
                    var i_174_ = 0
                    while (anInt5406 > i_174_) {
                        class64_sub2_154_!!.aClass334Array5442!![i_174_]!!.method2648(aClass334Array5442!![i_174_]!!, 118.toByte())
                        i_174_++
                    }
                } else {
                    val i_175_ = anInt5406
                    class64_sub2_153_.aClass334Array5442 = arrayOfNulls<Class334>(i_175_)
                    class64_sub2_154_.aClass334Array5442 = class64_sub2_153_.aClass334Array5442
                    for (i_176_ in 0..<anInt5406) class64_sub2_154_.aClass334Array5442!![i_176_] = (aClass334Array5442!![i_176_]!!.method2649(Class348_Sub21.method2955(i_156_, 26792)))
                }
            } else class64_sub2_154_.aClass334Array5442 = aClass334Array5442
            if (aBoolean5477) {
                class64_sub2_154_.anInt5418 = anInt5418
                class64_sub2_154_.anInt5510 = anInt5510
                class64_sub2_154_.anInt5467 = anInt5467
                class64_sub2_154_.anInt5509 = anInt5509
                class64_sub2_154_.aBoolean5477 = true
                class64_sub2_154_.anInt5401 = anInt5401
                class64_sub2_154_.anInt5461 = anInt5461
                class64_sub2_154_.anInt5507 = anInt5507
                class64_sub2_154_.anInt5443 = anInt5443
            } else class64_sub2_154_.aBoolean5477 = false
            class64_sub2_154_.aClass342Array5474 = aClass342Array5474
            class64_sub2_154_.aShortArray5432 = aShortArray5432
            class64_sub2_154_.anIntArrayArray5492 = anIntArrayArray5492
            class64_sub2_154_.anIntArray5455 = anIntArray5455
            class64_sub2_154_.aShortArray5416 = aShortArray5416
            class64_sub2_154_.aShortArray5494 = aShortArray5494
            class64_sub2_154_.anIntArray5404 = anIntArray5404
            class64_sub2_154_.aShortArray5439 = aShortArray5439
            if (i_156_ != 26794) return null
            class64_sub2_154_.anIntArray5473 = anIntArray5473
            class64_sub2_154_.aClass353Array5524 = aClass353Array5524
            class64_sub2_154_.anIntArrayArray5413 = anIntArrayArray5413
            class64_sub2_154_.anIntArray5415 = anIntArray5415
            class64_sub2_154_.aClass129Array5457 = aClass129Array5457
            class64_sub2_154_.anIntArrayArray5412 = anIntArrayArray5412
            class64_sub2_154_.aShortArray5470 = aShortArray5470
            return class64_sub2_154_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.U(" + bool + ',' + (if (class64_sub2_153_ != null) "{...}" else "null") + ',' + (if (class64_sub2_154_ != null) "{...}" else "null") + ',' + i + ',' + bool_155_ + ',' + i_156_ + ')'))
        }
    }

    public override fun ma(): Int {
        if (!aBoolean5477) method675(0)
        anInt5468++
        return anInt5401
    }

    public override fun WA(): Int {
        anInt5496++
        return aShort5452.toInt()
    }

    public override fun method620(class101: Class101?) {
        do {
            try {
                anInt5444++
                val class101_sub2 = class101 as Class101_Sub2
                if (aClass129Array5457 != null) {
                    var i = 0
                    while ((aClass129Array5457!!.size > i)) {
                        val class129 = aClass129Array5457!![i]!!
                        var class129_177_: Class129? = class129
                        if (class129.aClass129_1888 != null) class129_177_ = class129.aClass129_1888
                        class129_177_!!.anInt1882 = (class101_sub2.aFloat5729 + (((anIntArray5429!![(class129.anInt1881)]).toFloat() * (class101_sub2.aFloat5704)) + (((anIntArray5511!![(class129.anInt1881)]).toFloat() * (class101_sub2.aFloat5711)) + ((class101_sub2.aFloat5700) * (anIntArray5519!![(class129.anInt1881)]).toFloat())))).toInt()
                        class129_177_.anInt1891 = (class101_sub2.aFloat5710 + (((anIntArray5429!![(class129.anInt1881)]).toFloat() * (class101_sub2.aFloat5732)) + (((anIntArray5511!![(class129.anInt1881)]).toFloat() * (class101_sub2.aFloat5708)) + ((anIntArray5519!![(class129.anInt1881)]).toFloat() * class101_sub2.aFloat5722)))).toInt()
                        class129_177_.anInt1889 = (((anIntArray5519!![(class129.anInt1881)]).toFloat() * (class101_sub2.aFloat5691)) + ((class101_sub2.aFloat5736) * (anIntArray5511!![(class129.anInt1881)]).toFloat()) + ((anIntArray5429!![(class129.anInt1881)]).toFloat() * (class101_sub2.aFloat5716)) + (class101_sub2.aFloat5724)).toInt()
                        class129_177_.anInt1883 = (((class101_sub2.aFloat5711) * (anIntArray5511!![(class129.anInt1877)]).toFloat()) + ((anIntArray5519!![(class129.anInt1877)]).toFloat() * (class101_sub2.aFloat5700)) + ((anIntArray5429!![(class129.anInt1877)]).toFloat() * (class101_sub2.aFloat5704)) + (class101_sub2.aFloat5729)).toInt()
                        class129_177_.anInt1890 = (class101_sub2.aFloat5710 + (((anIntArray5429!![(class129.anInt1877)]).toFloat() * (class101_sub2.aFloat5732)) + (((class101_sub2.aFloat5708) * (anIntArray5511!![(class129.anInt1877)]).toFloat()) + ((class101_sub2.aFloat5722) * (anIntArray5519!![(class129.anInt1877)]).toFloat())))).toInt()
                        class129_177_.anInt1880 = (class101_sub2.aFloat5724 + (((class101_sub2.aFloat5716) * (anIntArray5429!![(class129.anInt1877)]).toFloat()) + (((class101_sub2.aFloat5691) * (anIntArray5519!![(class129.anInt1877)]).toFloat()) + ((class101_sub2.aFloat5736) * (anIntArray5511!![(class129.anInt1877)]).toFloat())))).toInt()
                        class129_177_.anInt1876 = (class101_sub2.aFloat5729 + (((class101_sub2.aFloat5700) * (anIntArray5519!![(class129.anInt1892)]).toFloat()) + ((anIntArray5511!![(class129.anInt1892)]).toFloat() * (class101_sub2.aFloat5711)) + ((anIntArray5429!![(class129.anInt1892)]).toFloat() * (class101_sub2.aFloat5704)))).toInt()
                        class129_177_.anInt1874 = (((anIntArray5429!![(class129.anInt1892)]).toFloat() * (class101_sub2.aFloat5732)) + (((anIntArray5519!![(class129.anInt1892)]).toFloat() * (class101_sub2.aFloat5722)) + ((class101_sub2.aFloat5708) * (anIntArray5511!![(class129.anInt1892)]).toFloat())) + (class101_sub2.aFloat5710)).toInt()
                        class129_177_.anInt1884 = (((class101_sub2.aFloat5736) * (anIntArray5511!![(class129.anInt1892)]).toFloat()) + ((class101_sub2.aFloat5691) * (anIntArray5519!![(class129.anInt1892)]).toFloat()) + ((anIntArray5429!![(class129.anInt1892)]).toFloat() * (class101_sub2.aFloat5716)) + (class101_sub2.aFloat5724)).toInt()
                        i++
                    }
                }
                if (aClass342Array5474 == null) break
                var i = 0
                while (aClass342Array5474!!.size > i) {
                    val class342 = aClass342Array5474!![i]!!
                    var class342_178_: Class342? = class342
                    if (class342.aClass342_4248 != null) class342_178_ = class342.aClass342_4248
                    if (class342.aClass101_4252 != null) class342.aClass101_4252!!.method898(class101_sub2)
                    else class342.aClass101_4252 = class101_sub2.method907()
                    class342_178_!!.anInt4238 = (((anIntArray5519!![class342.anInt4244]).toFloat() * class101_sub2.aFloat5700) + ((anIntArray5511!![class342.anInt4244]).toFloat() * (class101_sub2.aFloat5711)) + ((anIntArray5429!![class342.anInt4244]).toFloat() * (class101_sub2.aFloat5704)) + class101_sub2.aFloat5729).toInt()
                    class342_178_.anInt4239 = (((anIntArray5429!![class342.anInt4244]).toFloat() * class101_sub2.aFloat5732) + ((class101_sub2.aFloat5722 * (anIntArray5519!![(class342.anInt4244)]).toFloat()) + ((anIntArray5511!![(class342.anInt4244)]).toFloat() * (class101_sub2.aFloat5708))) + class101_sub2.aFloat5710).toInt()
                    class342_178_.anInt4240 = (((anIntArray5519!![class342.anInt4244]).toFloat() * class101_sub2.aFloat5691) + ((anIntArray5511!![class342.anInt4244]).toFloat() * (class101_sub2.aFloat5736)) + ((anIntArray5429!![class342.anInt4244]).toFloat() * (class101_sub2.aFloat5716)) + class101_sub2.aFloat5724).toInt()
                    i++
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "nca.J(" + (if (class101 != null) "{...}" else "null") + ')')
            }
            break
        } while (false)
    }

    public override fun HA(): Int {
        if (!aBoolean5477) method675(0)
        anInt5465++
        return anInt5418
    }

    public override fun method608(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int, i_179_: Int) {
        try {
            anInt5487++
            if (anInt5475 != 0) {
                val class101_sub2 = aHa_Sub3_5419!!.aClass101_Sub2_8080
                val class101_sub2_180_ = class101 as Class101_Sub2
                if (!aBoolean5477) method675(0)
                Class240.aFloat4673 = (class101_sub2.aFloat5724 + ((class101_sub2_180_.aFloat5710 * class101_sub2.aFloat5691) + (class101_sub2_180_.aFloat5729 * class101_sub2.aFloat5736) + (class101_sub2_180_.aFloat5724 * class101_sub2.aFloat5716)))
                Class353.aFloat4338 = ((class101_sub2.aFloat5691 * class101_sub2_180_.aFloat5722) + (class101_sub2.aFloat5736 * class101_sub2_180_.aFloat5700) + (class101_sub2.aFloat5716 * class101_sub2_180_.aFloat5691))
                val f = (Class240.aFloat4673 + anInt5461.toFloat() * Class353.aFloat4338)
                val f_181_ = (Class353.aFloat4338 * anInt5509.toFloat() + Class240.aFloat4673)
                val f_182_: Float
                val f_183_: Float
                if (f_181_ < f) {
                    f_183_ = f + anInt5510.toFloat()
                    f_182_ = -anInt5510.toFloat() + f_181_
                } else {
                    f_182_ = -anInt5510.toFloat() + f
                    f_183_ = anInt5510.toFloat() + f_181_
                }
                if (!(aHa_Sub3_5419!!.aFloat8089 <= f_182_) && !(aHa_Sub3_5419!!.anInt8095.toFloat() >= f_183_)) {
                    Class318_Sub1_Sub2_Sub1.aFloat10199 = ((class101_sub2.aFloat5711 * class101_sub2_180_.aFloat5700) + (class101_sub2_180_.aFloat5722 * class101_sub2.aFloat5700) + (class101_sub2_180_.aFloat5691 * class101_sub2.aFloat5704))
                    Class345.aFloat4268 = ((class101_sub2_180_.aFloat5710 * class101_sub2.aFloat5700) + (class101_sub2.aFloat5711 * (class101_sub2_180_.aFloat5729)) + (class101_sub2.aFloat5704 * (class101_sub2_180_.aFloat5724)) + class101_sub2.aFloat5729)
                    val f_184_ = ((anInt5461.toFloat() * Class318_Sub1_Sub2_Sub1.aFloat10199) + Class345.aFloat4268)
                    val f_185_ = ((Class318_Sub1_Sub2_Sub1.aFloat10199 * anInt5509.toFloat()) + Class345.aFloat4268)
                    val f_186_: Float
                    val f_187_: Float
                    if (f_185_ < f_184_) {
                        f_186_ = (aHa_Sub3_5419!!.anInt8129.toFloat() * (anInt5510.toFloat() + f_184_))
                        f_187_ = (aHa_Sub3_5419!!.anInt8129.toFloat() * (f_185_ - anInt5510.toFloat()))
                    } else {
                        f_186_ = (aHa_Sub3_5419!!.anInt8129.toFloat() * (anInt5510.toFloat() + f_185_))
                        f_187_ = ((-anInt5510.toFloat() + f_184_) * aHa_Sub3_5419!!.anInt8129.toFloat())
                    }
                    if (!(aHa_Sub3_5419!!.aFloat8158 <= f_187_ / i.toFloat()) && !(f_186_ / i.toFloat() <= aHa_Sub3_5419!!.aFloat8126)) {
                        Class290.aFloat3710 = ((class101_sub2_180_.aFloat5691 * class101_sub2.aFloat5732) + ((class101_sub2.aFloat5722 * (class101_sub2_180_.aFloat5722)) + ((class101_sub2_180_.aFloat5700) * (class101_sub2.aFloat5708))))
                        Class348_Sub12.aFloat6752 = (class101_sub2.aFloat5710 + ((class101_sub2.aFloat5708 * (class101_sub2_180_.aFloat5729)) + ((class101_sub2_180_.aFloat5710) * (class101_sub2.aFloat5722)) + ((class101_sub2_180_.aFloat5724) * (class101_sub2.aFloat5732))))
                        val f_188_ = (Class348_Sub12.aFloat6752 + Class290.aFloat3710 * anInt5461.toFloat())
                        val f_189_ = (anInt5509.toFloat() * Class290.aFloat3710 + Class348_Sub12.aFloat6752)
                        val f_190_: Float
                        val f_191_: Float
                        if (f_189_ < f_188_) {
                            f_190_ = (aHa_Sub3_5419!!.anInt8134.toFloat() * (f_188_ + anInt5510.toFloat()))
                            f_191_ = ((-anInt5510.toFloat() + f_189_) * (aHa_Sub3_5419!!.anInt8134).toFloat())
                        } else {
                            f_190_ = ((f_189_ + anInt5510.toFloat()) * (aHa_Sub3_5419!!.anInt8134).toFloat())
                            f_191_ = (aHa_Sub3_5419!!.anInt8134.toFloat() * (f_188_ - anInt5510.toFloat()))
                        }
                        if (!(f_191_ / i.toFloat() >= aHa_Sub3_5419!!.aFloat8185) && !(f_190_ / i.toFloat() <= aHa_Sub3_5419!!.aFloat8103)) {
                            if (class318_sub3 != null || aClass353Array5524 != null) {
                                Class55.aFloat1010 = (((class101_sub2.aFloat5700) * (class101_sub2_180_.aFloat5708)) + ((class101_sub2.aFloat5711) * class101_sub2_180_.aFloat5711) + ((class101_sub2.aFloat5704) * class101_sub2_180_.aFloat5736))
                                Class348_Sub42_Sub4.aFloat9516 = (((class101_sub2.aFloat5711) * (class101_sub2_180_.aFloat5704)) + ((class101_sub2_180_.aFloat5732) * (class101_sub2.aFloat5700)) + ((class101_sub2_180_.aFloat5716) * (class101_sub2.aFloat5704)))
                                Class318_Sub6.aFloat6430 = (((class101_sub2.aFloat5708) * (class101_sub2_180_.aFloat5704)) + ((class101_sub2.aFloat5722) * class101_sub2_180_.aFloat5732) + ((class101_sub2.aFloat5732) * class101_sub2_180_.aFloat5716))
                                Class328_Sub3.aFloat6523 = (((class101_sub2_180_.aFloat5736) * (class101_sub2.aFloat5716)) + (((class101_sub2.aFloat5691) * class101_sub2_180_.aFloat5708) + ((class101_sub2.aFloat5736) * (class101_sub2_180_.aFloat5711))))
                                Class348_Sub20.aFloat6835 = (((class101_sub2_180_.aFloat5711) * (class101_sub2.aFloat5708)) + ((class101_sub2_180_.aFloat5708) * (class101_sub2.aFloat5722)) + ((class101_sub2.aFloat5732) * class101_sub2_180_.aFloat5736))
                                ha.aFloat4582 = (((class101_sub2.aFloat5736) * (class101_sub2_180_.aFloat5704)) + ((class101_sub2.aFloat5691) * class101_sub2_180_.aFloat5732) + ((class101_sub2_180_.aFloat5716) * (class101_sub2.aFloat5716)))
                            }
                            if (class318_sub3 != null) {
                                val i_192_ = anInt5467 + anInt5507 shr 1
                                val i_193_ = anInt5418 + anInt5443 shr 1
                                val i_194_ = (Class345.aFloat4268 + (i_192_.toFloat() * Class55.aFloat1010) + ((Class318_Sub1_Sub2_Sub1.aFloat10199) * anInt5461.toFloat()) + (i_193_.toFloat() * (Class348_Sub42_Sub4.aFloat9516))).toInt()
                                val i_195_ = (Class348_Sub12.aFloat6752 + (Class348_Sub20.aFloat6835 * i_192_.toFloat()) + (anInt5461.toFloat() * Class290.aFloat3710) + (Class318_Sub6.aFloat6430 * i_193_.toFloat())).toInt()
                                val i_196_ = ((anInt5461.toFloat() * Class353.aFloat4338) + ((Class328_Sub3.aFloat6523 * i_192_.toFloat()) + Class240.aFloat4673) + i_193_.toFloat() * ha.aFloat4582).toInt()
                                val i_197_ = ((anInt5509.toFloat() * (Class318_Sub1_Sub2_Sub1.aFloat10199)) + (Class345.aFloat4268 + (Class55.aFloat1010 * i_192_.toFloat())) + (Class348_Sub42_Sub4.aFloat9516 * i_193_.toFloat())).toInt()
                                val i_198_ = ((Class318_Sub6.aFloat6430 * i_193_.toFloat()) + (Class348_Sub12.aFloat6752 + (Class348_Sub20.aFloat6835 * i_192_.toFloat()) + (Class290.aFloat3710 * anInt5509.toFloat()))).toInt()
                                class318_sub3.anInt6402 = ((i_195_ * aHa_Sub3_5419!!.anInt8134 / i) + aHa_Sub3_5419!!.anInt8130)
                                class318_sub3.anInt6405 = (aHa_Sub3_5419!!.anInt8094 - -(i_194_ * (aHa_Sub3_5419!!.anInt8129) / i))
                                class318_sub3.anInt6404 = (aHa_Sub3_5419!!.anInt8130 - -(aHa_Sub3_5419!!.anInt8134 * i_198_ / i))
                                class318_sub3.anInt6406 = ((i_197_ * aHa_Sub3_5419!!.anInt8129 / i) + aHa_Sub3_5419!!.anInt8094)
                                val i_199_ = (ha.aFloat4582 * i_193_.toFloat() + ((anInt5509.toFloat() * Class353.aFloat4338) + ((Class328_Sub3.aFloat6523 * i_192_.toFloat()) + Class240.aFloat4673))).toInt()
                                if (i_196_ >= aHa_Sub3_5419!!.anInt8095 || (aHa_Sub3_5419!!.anInt8095 <= i_199_)) {
                                    class318_sub3.anInt6403 = (aHa_Sub3_5419!!.anInt8094 + (((anInt5510 + i_194_) * (aHa_Sub3_5419!!.anInt8129) / i) + -class318_sub3.anInt6405))
                                    class318_sub3.aBoolean6401 = true
                                }
                            }
                            aHa_Sub3_5419!!.method3867(i.toFloat(), -68)
                            aHa_Sub3_5419!!.method3857((-21).toByte())
                            aHa_Sub3_5419!!.method3815(0, class101_sub2_180_)
                            method672(416776206)
                            method659(94)
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.Q(" + (if (class101 != null) "{...}" else "null") + ',' + (if (class318_sub3 != null) "{...}" else "null") + ',' + i + ',' + i_179_ + ')'))
        }
    }

    private fun method669(i: Int, l: Long, i_200_: Int, i_201_: Int, i_202_: Int, i_203_: Int, f: Float, i_204_: Int, f_205_: Float, class124: Class124?, i_206_: Int): Short {
        try {
            if (i_203_ >= -49) anIntArray5519 = null
            anInt5407++
            val i_207_ = anIntArray5455!![i_204_]
            val i_208_ = anIntArray5455!![i_204_ + 1]
            var i_209_ = 0
            for (i_210_ in i_207_..<i_208_) {
                val i_211_ = aShortArray5439!![i_210_]
                if (i_211_.toInt() == 0) {
                    i_209_ = i_210_
                    break
                }
                if (Class348_Sub40_Sub37.aLongArray9465!![i_210_] == l) return (-1 + i_211_).toShort()
            }
            aShortArray5439!![i_209_] = (1 + anInt5475).toShort()
            Class348_Sub40_Sub37.aLongArray9465!![i_209_] = l
            aShortArray5416!![anInt5475] = i_200_.toShort()
            aShortArray5470!![anInt5475] = i_204_.toShort()
            aShortArray5493!![anInt5475] = i_202_.toShort()
            aShortArray5438!![anInt5475] = i_206_.toShort()
            aShortArray5436!![anInt5475] = i.toShort()
            aByteArray5499!![anInt5475] = i_201_.toByte()
            aFloatArray5476!![anInt5475] = f
            aFloatArray5506!![anInt5475] = f_205_
            return (anInt5475++).toShort()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.SA(" + i + ',' + l + ',' + i_200_ + ',' + i_201_ + ',' + i_202_ + ',' + i_203_ + ',' + f + ',' + i_204_ + ',' + f_205_ + ',' + (if (class124 != null) "{...}" else "null") + ',' + i_206_ + ')'))
        }
    }

    public override fun r(): Boolean {
        anInt5422++
        return aBoolean5502
    }

    public override fun da(): Int {
        anInt5409++
        return aShort5427.toInt()
    }

    public override fun RA(): Int {
        if (!aBoolean5477) method675(0)
        anInt5489++
        return anInt5467
    }

    public override fun fa(): Int {
        anInt5526++
        if (!aBoolean5477) method675(0)
        return anInt5461
    }

    private fun method670(i: Int) {
        if (aClass290_5482 != null) aClass290_5482!!.aBoolean3714 = false
        if (i > -82) LA(97)
        anInt5458++
    }

    public override fun method605(i: Int, `is`: IntArray, i_212_: Int, i_213_: Int, i_214_: Int, i_215_: Int, bool: Boolean) {
        var i_212_ = i_212_
        var i_213_ = i_213_
        var i_214_ = i_214_
        try {
            anInt5498++
            val i_216_ = `is`!!.size
            if (i == 0) {
                i_213_ = i_213_ shl 4
                i_212_ = i_212_ shl 4
                i_214_ = i_214_ shl 4
                Class26.anInt386 = 0
                Class136.anInt4795 = 0
                var i_217_ = 0
                Class346.anInt4274 = 0
                for (i_218_ in 0..<i_216_) {
                    val i_219_ = `is`[i_218_]
                    if (i_219_ < anIntArrayArray5413!!.size) {
                        val is_220_ = anIntArrayArray5413!![i_219_]!!
                        for (i_221_ in is_220_.indices) {
                            val i_222_ = is_220_[i_221_]
                            Class136.anInt4795 += anIntArray5511!![i_222_]
                            Class26.anInt386 += anIntArray5519!![i_222_]
                            Class346.anInt4274 += anIntArray5429!![i_222_]
                            i_217_++
                        }
                    }
                }
                if (i_217_ > 0) {
                    Class26.anInt386 = Class26.anInt386 / i_217_ - -i_213_
                    Class346.anInt4274 = Class346.anInt4274 / i_217_ + i_214_
                    Class136.anInt4795 = Class136.anInt4795 / i_217_ - -i_212_
                } else {
                    Class26.anInt386 = i_213_
                    Class346.anInt4274 = i_214_
                    Class136.anInt4795 = i_212_
                }
            } else if (i == 1) {
                i_213_ = i_213_ shl 4
                i_212_ = i_212_ shl 4
                i_214_ = i_214_ shl 4
                var i_223_ = 0
                while (i_216_ > i_223_) {
                    val i_224_ = `is`[i_223_]
                    if (anIntArrayArray5413!!.size > i_224_) {
                        val is_225_ = anIntArrayArray5413!![i_224_]!!
                        var i_226_ = 0
                        while ((i_226_ < is_225_.size)) {
                            val i_227_ = is_225_[i_226_]
                            anIntArray5511!![i_227_] += i_212_
                            anIntArray5519!![i_227_] += i_213_
                            anIntArray5429!![i_227_] += i_214_
                            i_226_++
                        }
                    }
                    i_223_++
                }
            } else if (i == 2) {
                for (i_228_ in 0..<i_216_) {
                    val i_229_ = `is`[i_228_]
                    if (anIntArrayArray5413!!.size > i_229_) {
                        val is_230_ = anIntArrayArray5413!![i_229_]!!
                        if ((0x1 and i_215_) == 0) {
                            var i_231_ = 0
                            while ((is_230_.size > i_231_)) {
                                val i_232_ = is_230_[i_231_]
                                anIntArray5511!![i_232_] -= Class136.anInt4795
                                anIntArray5519!![i_232_] -= Class26.anInt386
                                anIntArray5429!![i_232_] -= Class346.anInt4274
                                if (i_214_ != 0) {
                                    val i_233_ = Class70.anIntArray1207!![i_214_]
                                    val i_234_ = Class70.anIntArray1204!![i_214_]
                                    val i_235_ = ((16383 + (i_234_ * anIntArray5511!![i_232_] + (anIntArray5519!![i_232_] * i_233_))) shr 14)
                                    anIntArray5519!![i_232_] = ((16383 + (i_234_ * anIntArray5519!![i_232_] + -(i_233_ * anIntArray5511!![i_232_]))) shr 14)
                                    anIntArray5511!![i_232_] = i_235_
                                }
                                if (i_212_ != 0) {
                                    val i_236_ = Class70.anIntArray1207!![i_212_]
                                    val i_237_ = Class70.anIntArray1204!![i_212_]
                                    val i_238_ = (16383 + (-(i_236_ * anIntArray5429!![i_232_]) + i_237_ * (anIntArray5519!![i_232_])) shr 14)
                                    anIntArray5429!![i_232_] = (16383 + (i_236_ * anIntArray5519!![i_232_] - -(anIntArray5429!![i_232_] * i_237_))) shr 14
                                    anIntArray5519!![i_232_] = i_238_
                                }
                                if (i_213_ != 0) {
                                    val i_239_ = Class70.anIntArray1207!![i_213_]
                                    val i_240_ = Class70.anIntArray1204!![i_213_]
                                    val i_241_ = ((i_239_ * anIntArray5429!![i_232_] + i_240_ * anIntArray5511!![i_232_] + 16383) shr 14)
                                    anIntArray5429!![i_232_] = (16383 + (-(i_239_ * anIntArray5511!![i_232_]) + i_240_ * (anIntArray5429!![i_232_])) shr 14)
                                    anIntArray5511!![i_232_] = i_241_
                                }
                                anIntArray5511!![i_232_] += Class136.anInt4795
                                anIntArray5519!![i_232_] += Class26.anInt386
                                anIntArray5429!![i_232_] += Class346.anInt4274
                                i_231_++
                            }
                        } else {
                            for (i_242_ in is_230_.indices) {
                                val i_243_ = is_230_[i_242_]
                                anIntArray5511!![i_243_] -= Class136.anInt4795
                                anIntArray5519!![i_243_] -= Class26.anInt386
                                anIntArray5429!![i_243_] -= Class346.anInt4274
                                if (i_212_ != 0) {
                                    val i_244_ = Class70.anIntArray1207!![i_212_]
                                    val i_245_ = Class70.anIntArray1204!![i_212_]
                                    val i_246_ = (anIntArray5519!![i_243_] * i_245_ + -(i_244_ * anIntArray5429!![i_243_]) + 16383) shr 14
                                    anIntArray5429!![i_243_] = ((16383 + anIntArray5429!![i_243_] * i_245_ + i_244_ * anIntArray5519!![i_243_]) shr 14)
                                    anIntArray5519!![i_243_] = i_246_
                                }
                                if (i_214_ != 0) {
                                    val i_247_ = Class70.anIntArray1207!![i_214_]
                                    val i_248_ = Class70.anIntArray1204!![i_214_]
                                    val i_249_ = ((i_248_ * anIntArray5511!![i_243_] + i_247_ * anIntArray5519!![i_243_] + 16383) shr 14)
                                    anIntArray5519!![i_243_] = (anIntArray5519!![i_243_] * i_248_ - (anIntArray5511!![i_243_] * i_247_ + -16383)) shr 14
                                    anIntArray5511!![i_243_] = i_249_
                                }
                                if (i_213_ != 0) {
                                    val i_250_ = Class70.anIntArray1207!![i_213_]
                                    val i_251_ = Class70.anIntArray1204!![i_213_]
                                    val i_252_ = ((i_251_ * anIntArray5511!![i_243_] + i_250_ * anIntArray5429!![i_243_] - -16383) shr 14)
                                    anIntArray5429!![i_243_] = ((16383 + -(anIntArray5511!![i_243_] * i_250_) + anIntArray5429!![i_243_] * i_251_) shr 14)
                                    anIntArray5511!![i_243_] = i_252_
                                }
                                anIntArray5511!![i_243_] += Class136.anInt4795
                                anIntArray5519!![i_243_] += Class26.anInt386
                                anIntArray5429!![i_243_] += Class346.anInt4274
                            }
                        }
                    }
                }
                if (bool) {
                    var i_253_ = 0
                    while (i_216_ > i_253_) {
                        val i_254_ = `is`[i_253_]
                        if (i_254_ < anIntArrayArray5413!!.size) {
                            val is_255_ = anIntArrayArray5413!![i_254_]!!
                            for (i_256_ in is_255_.indices) {
                                val i_257_ = is_255_[i_256_]
                                val i_258_ = anIntArray5455!![i_257_]
                                val i_259_ = anIntArray5455!![1 + i_257_]
                                var i_260_ = i_258_
                                while ((i_259_ > i_260_)) {
                                    val i_261_ = aShortArray5439!![i_260_] + -1
                                    if (i_261_ == -1) break
                                    if (i_214_ != 0) {
                                        val i_262_ = Class70.anIntArray1207!![i_214_]
                                        val i_263_ = Class70.anIntArray1204!![i_214_]
                                        val i_264_ = ((16383 + (aShortArray5438!![i_261_] * i_262_) + (aShortArray5493!![i_261_] * i_263_)) shr 14)
                                        aShortArray5438!![i_261_] = (((i_263_ * (aShortArray5438!![i_261_])) + -((aShortArray5493!![i_261_]) * i_262_) + 16383) shr 14).toShort()
                                        aShortArray5493!![i_261_] = i_264_.toShort()
                                    }
                                    if (i_212_ != 0) {
                                        val i_265_ = Class70.anIntArray1207!![i_212_]
                                        val i_266_ = Class70.anIntArray1204!![i_212_]
                                        val i_267_ = ((16383 + (aShortArray5438!![i_261_] * i_266_) + -(i_265_ * aShortArray5436!![i_261_])) shr 14)
                                        aShortArray5436!![i_261_] = ((16383 + ((i_266_ * (aShortArray5436!![i_261_])) + ((aShortArray5438!![i_261_]) * i_265_))) shr 14).toShort()
                                        aShortArray5438!![i_261_] = i_267_.toShort()
                                    }
                                    if (i_213_ != 0) {
                                        val i_268_ = Class70.anIntArray1207!![i_213_]
                                        val i_269_ = Class70.anIntArray1204!![i_213_]
                                        val i_270_ = (i_269_ * aShortArray5493!![i_261_] + (i_268_ * aShortArray5436!![i_261_]) - -16383) shr 14
                                        aShortArray5436!![i_261_] = ((-(i_268_ * (aShortArray5493!![i_261_])) + (aShortArray5436!![i_261_]) * i_269_ - -16383) shr 14).toShort()
                                        aShortArray5493!![i_261_] = i_270_.toShort()
                                    }
                                    i_260_++
                                }
                            }
                        }
                        i_253_++
                    }
                    method673(69.toByte())
                }
            } else if (i == 3) {
                var i_271_ = 0
                while (i_216_ > i_271_) {
                    val i_272_ = `is`[i_271_]
                    if (i_272_ < anIntArrayArray5413!!.size) {
                        val is_273_ = anIntArrayArray5413!![i_272_]!!
                        var i_274_ = 0
                        while (is_273_.size > i_274_) {
                            val i_275_ = is_273_[i_274_]
                            anIntArray5511!![i_275_] -= Class136.anInt4795
                            anIntArray5519!![i_275_] -= Class26.anInt386
                            anIntArray5429!![i_275_] -= Class346.anInt4274
                            anIntArray5511!![i_275_] = (anIntArray5511!![i_275_] * i_212_ shr 7)
                            anIntArray5519!![i_275_] = anIntArray5519!![i_275_] * i_213_ shr 7
                            anIntArray5429!![i_275_] = i_214_ * anIntArray5429!![i_275_] shr 7
                            anIntArray5511!![i_275_] += Class136.anInt4795
                            anIntArray5519!![i_275_] += Class26.anInt386
                            anIntArray5429!![i_275_] += Class346.anInt4274
                            i_274_++
                        }
                    }
                    i_271_++
                }
            } else if (i == 5) {
                if (anIntArrayArray5492 != null) {
                    var bool_276_ = false
                    for (i_277_ in 0..<i_216_) {
                        val i_278_ = `is`[i_277_]
                        if (anIntArrayArray5492!!.size > i_278_) {
                            val is_279_ = anIntArrayArray5492!![i_278_]!!
                            var i_280_ = 0
                            while (is_279_.size > i_280_) {
                                val i_281_ = is_279_[i_280_]
                                var i_282_ = ((0xff and aByteArray5515!![i_281_].toInt()) - -(8 * i_212_))
                                if (i_282_ >= 0) {
                                    if (i_282_ > 255) i_282_ = 255
                                } else i_282_ = 0
                                aByteArray5515!![i_281_] = i_282_.toByte()
                                i_280_++
                            }
                            bool_276_ = bool_276_ or (is_279_.size > 0)
                        }
                    }
                    if (bool_276_) {
                        if (aClass353Array5524 != null) {
                            var i_283_ = 0
                            while (anInt5406 > i_283_) {
                                val class353 = aClass353Array5524!![i_283_]!!
                                val class334 = aClass334Array5442!![i_283_]!!
                                class334.anInt4156 = ((0xffffff and class334.anInt4156) or (255 + -(0xff and (aByteArray5515!![(class353.anInt4342)]).toInt()) shl 24))
                                i_283_++
                            }
                        }
                        method670(-86)
                    }
                }
            } else if (i == 7) {
                if (anIntArrayArray5492 != null) {
                    var bool_284_ = false
                    var i_285_ = 0
                    while (i_216_ > i_285_) {
                        val i_286_ = `is`[i_285_]
                        if (anIntArrayArray5492!!.size > i_286_) {
                            val is_287_ = anIntArrayArray5492!![i_286_]!!
                            for (i_288_ in is_287_.indices) {
                                val i_289_ = is_287_[i_288_]
                                val i_290_ = aShortArray5486!![i_289_].toInt() and 0xffff
                                var i_291_ = (0xfc26 and i_290_) shr 10
                                var i_292_ = 0x7 and (i_290_ shr 7)
                                var i_293_ = 0x7f and i_290_
                                i_292_ += i_213_ / 4
                                i_291_ = i_212_ + i_291_ and 0x3f
                                if (i_292_ >= 0) {
                                    if (i_292_ > 7) i_292_ = 7
                                } else i_292_ = 0
                                i_293_ += i_214_
                                if (i_293_ >= 0) {
                                    if (i_293_ > 127) i_293_ = 127
                                } else i_293_ = 0
                                aShortArray5486!![i_289_] = (Class273.method2057(i_293_, (Class273.method2057(i_291_ shl 10, i_292_ shl 7)))).toShort()
                            }
                            bool_284_ = bool_284_ or (is_287_.size > 0)
                        }
                        i_285_++
                    }
                    if (bool_284_) {
                        if (aClass353Array5524 != null) {
                            var i_294_ = 0
                            while (anInt5406 > i_294_) {
                                val class353 = aClass353Array5524!![i_294_]!!
                                val class334 = aClass334Array5442!![i_294_]!!
                                class334.anInt4156 = (0xffffff and (Class10.anIntArray179!![(aShortArray5486!![(class353.anInt4342)]).toInt() and 0xffff]) or (0xffffff.inv() and class334.anInt4156))
                                i_294_++
                            }
                        }
                        method670(-100)
                    }
                }
            } else if (i == 8) {
                if (anIntArrayArray5412 != null) {
                    var i_295_ = 0
                    while (i_216_ > i_295_) {
                        val i_296_ = `is`[i_295_]
                        if (anIntArrayArray5412!!.size > i_296_) {
                            val is_297_ = anIntArrayArray5412!![i_296_]!!
                            var i_298_ = 0
                            while ((is_297_.size > i_298_)) {
                                val class334 = aClass334Array5442!![is_297_[i_298_]]!!
                                class334.anInt4158 += i_212_
                                class334.anInt4154 += i_213_
                                i_298_++
                            }
                        }
                        i_295_++
                    }
                }
            } else if (i == 10) {
                if (anIntArrayArray5412 != null) {
                    var i_299_ = 0
                    while (i_216_ > i_299_) {
                        val i_300_ = `is`[i_299_]
                        if (i_300_ < anIntArrayArray5412!!.size) {
                            val is_301_ = anIntArrayArray5412!![i_300_]!!
                            var i_302_ = 0
                            while (is_301_.size > i_302_) {
                                val class334 = aClass334Array5442!![is_301_[i_302_]]!!
                                class334.anInt4165 = (i_212_ * class334.anInt4165 shr 7)
                                class334.anInt4162 = (i_213_ * class334.anInt4162 shr 7)
                                i_302_++
                            }
                        }
                        i_299_++
                    }
                }
            } else if (i == 9) {
                if (anIntArrayArray5412 != null) {
                    for (i_303_ in 0..<i_216_) {
                        val i_304_ = `is`[i_303_]
                        if (anIntArrayArray5412!!.size > i_304_) {
                            val is_305_ = anIntArrayArray5412!![i_304_]!!
                            var i_306_ = 0
                            while ((i_306_ < is_305_.size)) {
                                val class334 = aClass334Array5442!![is_305_[i_306_]]!!
                                class334.anInt4151 = 0x3fff and i_212_ + (class334.anInt4151)
                                i_306_++
                            }
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.BB(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_212_ + ',' + i_213_ + ',' + i_214_ + ',' + i_215_ + ',' + bool + ')'))
        }
    }

    public override fun method615(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int) {
        try {
            anInt5471++
            if (anInt5475 != 0) {
                val class101_sub2 = aHa_Sub3_5419!!.aClass101_Sub2_8080
                val class101_sub2_307_ = class101 as Class101_Sub2
                if (!aBoolean5477) method675(0)
                Class353.aFloat4338 = ((class101_sub2.aFloat5736 * class101_sub2_307_.aFloat5700) + (class101_sub2.aFloat5691 * class101_sub2_307_.aFloat5722) + (class101_sub2_307_.aFloat5691 * class101_sub2.aFloat5716))
                Class240.aFloat4673 = ((class101_sub2_307_.aFloat5724 * class101_sub2.aFloat5716) + ((class101_sub2.aFloat5691 * class101_sub2_307_.aFloat5710) + (class101_sub2_307_.aFloat5729 * class101_sub2.aFloat5736)) + class101_sub2.aFloat5724)
                val f = (Class353.aFloat4338 * anInt5461.toFloat() + Class240.aFloat4673)
                val f_308_ = (anInt5509.toFloat() * Class353.aFloat4338 + Class240.aFloat4673)
                val f_309_: Float
                val f_310_: Float
                if (f > f_308_) {
                    f_309_ = anInt5510.toFloat() + f
                    f_310_ = f_308_ - anInt5510.toFloat()
                } else {
                    f_309_ = anInt5510.toFloat() + f_308_
                    f_310_ = f - anInt5510.toFloat()
                }
                if (!(aHa_Sub3_5419!!.aFloat8169 <= f_310_) && !(f_309_ <= aHa_Sub3_5419!!.anInt8095.toFloat())) {
                    Class345.aFloat4268 = (class101_sub2.aFloat5729 + ((class101_sub2.aFloat5700 * (class101_sub2_307_.aFloat5710)) + (class101_sub2.aFloat5711 * (class101_sub2_307_.aFloat5729)) + (class101_sub2.aFloat5704 * (class101_sub2_307_.aFloat5724))))
                    Class318_Sub1_Sub2_Sub1.aFloat10199 = ((class101_sub2.aFloat5704 * class101_sub2_307_.aFloat5691) + ((class101_sub2_307_.aFloat5700 * class101_sub2.aFloat5711) + (class101_sub2.aFloat5700 * (class101_sub2_307_.aFloat5722))))
                    val f_311_ = ((anInt5461.toFloat() * Class318_Sub1_Sub2_Sub1.aFloat10199) + Class345.aFloat4268)
                    val f_312_ = (Class345.aFloat4268 + (Class318_Sub1_Sub2_Sub1.aFloat10199 * anInt5509.toFloat()))
                    val f_313_: Float
                    val f_314_: Float
                    if (f_311_ > f_312_) {
                        f_313_ = ((f_311_ + anInt5510.toFloat()) * aHa_Sub3_5419!!.anInt8129.toFloat())
                        f_314_ = (aHa_Sub3_5419!!.anInt8129.toFloat() * (-anInt5510.toFloat() + f_312_))
                    } else {
                        f_313_ = ((f_312_ + anInt5510.toFloat()) * aHa_Sub3_5419!!.anInt8129.toFloat())
                        f_314_ = (aHa_Sub3_5419!!.anInt8129.toFloat() * (-anInt5510.toFloat() + f_311_))
                    }
                    if (!(aHa_Sub3_5419!!.aFloat8158 <= f_314_ / f_309_) && !(f_313_ / f_309_ <= aHa_Sub3_5419!!.aFloat8126)) {
                        Class290.aFloat3710 = ((class101_sub2_307_.aFloat5691 * class101_sub2.aFloat5732) + ((class101_sub2.aFloat5722 * (class101_sub2_307_.aFloat5722)) + (class101_sub2.aFloat5708 * (class101_sub2_307_.aFloat5700))))
                        Class348_Sub12.aFloat6752 = ((class101_sub2_307_.aFloat5724 * class101_sub2.aFloat5732) + (((class101_sub2_307_.aFloat5729) * (class101_sub2.aFloat5708)) + ((class101_sub2_307_.aFloat5710) * (class101_sub2.aFloat5722))) + class101_sub2.aFloat5710)
                        val f_315_ = (anInt5461.toFloat() * Class290.aFloat3710 + Class348_Sub12.aFloat6752)
                        val f_316_ = (Class290.aFloat3710 * anInt5509.toFloat() + Class348_Sub12.aFloat6752)
                        val f_317_: Float
                        val f_318_: Float
                        if (f_316_ < f_315_) {
                            f_317_ = (aHa_Sub3_5419!!.anInt8134.toFloat() * (anInt5510.toFloat() + f_315_))
                            f_318_ = (aHa_Sub3_5419!!.anInt8134.toFloat() * (-anInt5510.toFloat() + f_316_))
                        } else {
                            f_317_ = ((anInt5510.toFloat() + f_316_) * (aHa_Sub3_5419!!.anInt8134).toFloat())
                            f_318_ = ((f_315_ - anInt5510.toFloat()) * (aHa_Sub3_5419!!.anInt8134).toFloat())
                        }
                        if (!(aHa_Sub3_5419!!.aFloat8185 <= f_318_ / f_309_) && !(f_317_ / f_309_ <= aHa_Sub3_5419!!.aFloat8103)) {
                            if (class318_sub3 != null || aClass353Array5524 != null) {
                                Class328_Sub3.aFloat6523 = (((class101_sub2.aFloat5716) * (class101_sub2_307_.aFloat5736)) + ((class101_sub2_307_.aFloat5711 * (class101_sub2.aFloat5736)) + ((class101_sub2.aFloat5691) * (class101_sub2_307_.aFloat5708))))
                                Class318_Sub6.aFloat6430 = (((class101_sub2.aFloat5708) * (class101_sub2_307_.aFloat5704)) + ((class101_sub2_307_.aFloat5732) * (class101_sub2.aFloat5722)) + ((class101_sub2.aFloat5732) * class101_sub2_307_.aFloat5716))
                                Class55.aFloat1010 = (((class101_sub2.aFloat5704) * (class101_sub2_307_.aFloat5736)) + (((class101_sub2.aFloat5700) * class101_sub2_307_.aFloat5708) + ((class101_sub2.aFloat5711) * (class101_sub2_307_.aFloat5711))))
                                Class348_Sub42_Sub4.aFloat9516 = (((class101_sub2.aFloat5711) * (class101_sub2_307_.aFloat5704)) + ((class101_sub2_307_.aFloat5732) * (class101_sub2.aFloat5700)) + ((class101_sub2.aFloat5704) * class101_sub2_307_.aFloat5716))
                                Class348_Sub20.aFloat6835 = (((class101_sub2.aFloat5708) * (class101_sub2_307_.aFloat5711)) + ((class101_sub2.aFloat5722) * class101_sub2_307_.aFloat5708) + ((class101_sub2.aFloat5732) * class101_sub2_307_.aFloat5736))
                                ha.aFloat4582 = (((class101_sub2_307_.aFloat5716) * (class101_sub2.aFloat5716)) + ((class101_sub2_307_.aFloat5704 * (class101_sub2.aFloat5736)) + (class101_sub2_307_.aFloat5732 * (class101_sub2.aFloat5691))))
                            }
                            if (class318_sub3 != null) {
                                var bool = false
                                var bool_319_ = true
                                val i_320_ = anInt5507 - -anInt5467 shr 1
                                val i_321_ = anInt5418 + anInt5443 shr 1
                                val i_322_ = ((anInt5461.toFloat() * (Class318_Sub1_Sub2_Sub1.aFloat10199)) + (Class345.aFloat4268 + (Class55.aFloat1010 * i_320_.toFloat())) + (Class348_Sub42_Sub4.aFloat9516 * i_321_.toFloat())).toInt()
                                val i_323_ = ((Class318_Sub6.aFloat6430 * i_321_.toFloat()) + ((i_320_.toFloat() * Class348_Sub20.aFloat6835) + Class348_Sub12.aFloat6752 + (Class290.aFloat3710 * anInt5461.toFloat()))).toInt()
                                val i_324_ = (Class240.aFloat4673 + (i_320_.toFloat() * Class328_Sub3.aFloat6523) + (anInt5461.toFloat() * Class353.aFloat4338) + i_321_.toFloat() * ha.aFloat4582).toInt()
                                if (aHa_Sub3_5419!!.anInt8095 > i_324_) bool = true
                                else {
                                    class318_sub3.anInt6402 = (aHa_Sub3_5419!!.anInt8130 - -(i_323_ * (aHa_Sub3_5419!!.anInt8134) / i_324_))
                                    class318_sub3.anInt6405 = ((aHa_Sub3_5419!!.anInt8129 * i_322_ / i_324_) + (aHa_Sub3_5419!!.anInt8094))
                                }
                                val i_325_ = ((Class318_Sub1_Sub2_Sub1.aFloat10199) * anInt5509.toFloat() + (Class345.aFloat4268 + (Class55.aFloat1010 * i_320_.toFloat())) + (i_321_.toFloat() * (Class348_Sub42_Sub4.aFloat9516))).toInt()
                                val i_326_ = ((Class290.aFloat3710 * anInt5509.toFloat()) + (Class348_Sub12.aFloat6752 + (i_320_.toFloat() * (Class348_Sub20.aFloat6835))) + (i_321_.toFloat() * Class318_Sub6.aFloat6430)).toInt()
                                val i_327_ = ((anInt5509.toFloat() * Class353.aFloat4338) + (Class240.aFloat4673 + (i_320_.toFloat() * Class328_Sub3.aFloat6523)) + ha.aFloat4582 * i_321_.toFloat()).toInt()
                                if (aHa_Sub3_5419!!.anInt8095 > i_327_) bool = true
                                else {
                                    class318_sub3.anInt6406 = (aHa_Sub3_5419!!.anInt8094 + (i_325_ * (aHa_Sub3_5419!!.anInt8129) / i_327_))
                                    class318_sub3.anInt6404 = (aHa_Sub3_5419!!.anInt8130 - -(i_326_ * (aHa_Sub3_5419!!.anInt8134) / i_327_))
                                }
                                if (bool) {
                                    if ((aHa_Sub3_5419!!.anInt8095 > i_324_) && ((aHa_Sub3_5419!!.anInt8095) > i_327_)) bool_319_ = false
                                    else if (i_324_ >= (aHa_Sub3_5419!!.anInt8095)) {
                                        if (aHa_Sub3_5419!!.anInt8095 > i_327_) {
                                            val i_328_ = ((i_324_ + -(aHa_Sub3_5419!!.anInt8095) shl 16) / (-i_327_ + i_324_))
                                            val i_329_ = i_322_ + (((i_322_ - i_325_) * i_328_) shr 16)
                                            val i_330_ = (((-i_326_ + i_323_) * i_328_ shr 16) + i_323_)
                                            class318_sub3.anInt6405 = ((aHa_Sub3_5419!!.anInt8094) + (aHa_Sub3_5419!!.anInt8129 * i_329_ / (aHa_Sub3_5419!!.anInt8095)))
                                            class318_sub3.anInt6402 = ((aHa_Sub3_5419!!.anInt8130) + (i_330_ * (aHa_Sub3_5419!!.anInt8134) / (aHa_Sub3_5419!!.anInt8095)))
                                        }
                                    } else {
                                        val i_331_ = ((-(aHa_Sub3_5419!!.anInt8095) + i_327_ shl 16) / (-i_324_ + i_327_))
                                        val i_332_ = ((i_331_ * (-i_322_ + i_325_) shr 16) + i_325_)
                                        val i_333_ = (i_326_ - -(i_331_ * (-i_323_ + i_326_) shr 16))
                                        class318_sub3.anInt6405 = ((aHa_Sub3_5419!!.anInt8094) + (i_332_ * (aHa_Sub3_5419!!.anInt8129) / (aHa_Sub3_5419!!.anInt8095)))
                                        class318_sub3.anInt6402 = ((i_333_ * (aHa_Sub3_5419!!.anInt8134) / (aHa_Sub3_5419!!.anInt8095)) + (aHa_Sub3_5419!!.anInt8130))
                                    }
                                }
                                if (bool_319_) {
                                    if (i_324_ <= i_327_) class318_sub3.anInt6403 = (-class318_sub3.anInt6406 + (((aHa_Sub3_5419!!.anInt8129) * (i_325_ + anInt5510) / i_327_) + (aHa_Sub3_5419!!.anInt8094)))
                                    else class318_sub3.anInt6403 = (-class318_sub3.anInt6405 + (((i_322_ + anInt5510) * (aHa_Sub3_5419!!.anInt8129) / i_324_) + (aHa_Sub3_5419!!.anInt8094)))
                                    class318_sub3.aBoolean6401 = true
                                }
                            }
                            aHa_Sub3_5419!!.method3825(8)
                            aHa_Sub3_5419!!.method3815(0, class101_sub2_307_)
                            method672(416776206)
                            method659(76)
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.KA(" + (if (class101 != null) "{...}" else "null") + ',' + (if (class318_sub3 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    public override fun s(i: Int) {
        anInt5445++
        if (aClass290_5520 != null) aClass290_5520!!.aBoolean3709 = Class264.method2015(i, anInt5472, 7)
        if (aClass290_5460 != null) aClass290_5460!!.aBoolean3709 = Class183.method1379(4, anInt5472, i)
        if (aClass290_5482 != null) aClass290_5482!!.aBoolean3709 = method3200(i, anInt5472, 73.toByte())
        if (aClass290_5424 != null) aClass290_5424!!.aBoolean3709 = Class126.method1113(i, anInt5472, -10)
        anInt5463 = i
        aBoolean5402 = true
        if (aClass151_5503 != null && (anInt5463 and 0x10000) == 0) {
            aShortArray5438 = aClass151_5503!!.aShortArray2060
            aShortArray5436 = aClass151_5503!!.aShortArray2058
            aShortArray5493 = aClass151_5503!!.aShortArray2067
            aByteArray5499 = aClass151_5503!!.aByteArray2069
            aClass151_5503 = null
        }
        method663(262144)
    }

    public override fun V(): Int {
        anInt5464++
        if (!aBoolean5477) method675(0)
        return anInt5507
    }

    public override fun method618(): Boolean {
        anInt5410++
        if (aShortArray5423 == null) return true
        for (i in aShortArray5423!!.indices) {
            if (aShortArray5423!![i].toInt() != -1 && !aHa_Sub3_5419!!.aD4579!!.method4(-7953, aShortArray5423!![i].toInt())) return false
        }
        return true
    }

    internal constructor(var_ha_Sub3: ha_Sub3?, class124: Class124?, i: Int, i_334_: Int, i_335_: Int, i_336_: Int) : this(var_ha_Sub3, i, i_336_, true, false) {
        do {
            try {
                val var_d: d = var_ha_Sub3!!.aD4579!!
                val `is` = IntArray(class124!!.anInt1817)
                anIntArray5455 = IntArray(1 + class124.anInt1821)
                for (i_337_ in 0..<class124.anInt1817) {
                    if (class124.aByteArray1843 == null || class124.aByteArray1843!![i_337_].toInt() != 2) {
                        if (class124.aShortArray1822 != null && (class124.aShortArray1822!![i_337_].toInt() != -1)) {
                            val class12 = var_d.method3(((class124.aShortArray1822!![i_337_]).toInt() and 0xffff), -6662)
                            if (((anInt5472 and 0x40) == 0 || !class12!!.aBoolean209) && class12!!.aBoolean204) continue
                        }
                        `is`[anInt5478++] = i_337_
                        anIntArray5455!![(class124.aShortArray1863[i_337_]).toInt()] = anIntArray5455!![(class124.aShortArray1863[i_337_]).toInt()] + 1
                        anIntArray5455!![(class124.aShortArray1835!![i_337_]).toInt()] = anIntArray5455!![(class124.aShortArray1835!![i_337_]).toInt()] + 1
                        anIntArray5455!![(class124.aShortArray1855[i_337_]).toInt()] = anIntArray5455!![(class124.aShortArray1855[i_337_]).toInt()] + 1
                    }
                }
                anInt5516 = anInt5478
                val ls = LongArray(anInt5478)
                val bool = (0x100 and anInt5463) != 0
                for (i_338_ in 0..<anInt5478) {
                    val i_339_ = `is`[i_338_]
                    var class12: Class12? = null
                    var i_340_ = 0
                    var i_341_ = 0
                    var i_342_ = 0
                    var i_343_ = 0
                    if (class124.aClass162Array1832 != null) {
                        var bool_344_ = false
                        for (i_345_ in (class124.aClass162Array1832)!!.indices) {
                            val class162 = (class124.aClass162Array1832!![i_345_])!!
                            if (class162.anInt2155 == i_339_) {
                                val class189 = Class73.method742(104, (class162.anInt2153))
                                if (class189.aBoolean2531) bool_344_ = true
                                if (class189.anInt2525 != -1) {
                                    val class12_346_ = var_d.method3((class189.anInt2525), -6662)
                                    if (class12_346_!!.anInt200 == 2) aBoolean5428 = true
                                }
                            }
                        }
                        if (bool_344_) {
                            ls[i_338_] = 9223372036854775807L
                            anInt5516--
                            continue
                        }
                    }
                    var i_347_ = -1
                    if (class124.aShortArray1822 != null) {
                        i_347_ = class124.aShortArray1822!![i_339_].toInt()
                        if (i_347_ != -1) {
                            class12 = var_d.method3(0xffff and i_347_, -6662)
                            if ((0x40 and anInt5472) != 0 && class12!!.aBoolean209) {
                                i_347_ = -1
                                class12 = null
                            } else {
                                i_343_ = class12!!.aByte202.toInt()
                                i_342_ = class12.aByte213.toInt()
                            }
                        }
                    }
                    val bool_348_ = ((class124.aByteArray1834 != null && class124.aByteArray1834!![i_339_].toInt() != 0) || (class12 != null && class12.anInt200 != 0))
                    if ((bool || bool_348_) && class124.aByteArray1839 != null) i_340_ += (class124.aByteArray1839!![i_339_].toInt() shl 17)
                    if (bool_348_) i_340_ += 65536
                    i_340_ += 0xff00 and (i_342_ shl 8)
                    i_341_ += (i_347_ and 0xffff) shl 16
                    i_340_ += 0xff and i_343_
                    i_341_ += 0xffff and i_338_
                    ls[i_338_] = (i_340_.toLong() shl 32) + i_341_.toLong()
                    val class64_sub2_349_ = this
                    class64_sub2_349_.aBoolean5502 = (class64_sub2_349_.aBoolean5502 or (class12 != null && (class12.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0)))
                    aBoolean5428 = aBoolean5428 or bool_348_
                }
                method2832(`is`, ls, 0)
                anInt5497 = class124.anInt1836
                anIntArray5429 = class124.anIntArray1852
                anIntArray5519 = class124.anIntArray1847
                aShortArray5494 = class124.aShortArray1842
                anInt5433 = class124.anInt1821
                anIntArray5511 = class124.anIntArray1841
                aClass342Array5474 = class124.aClass342Array1866
                val class371s: Array<Class371?> = arrayOfNulls<Class371>(anInt5433)
                aClass129Array5457 = class124.aClass129Array1846
                if (class124.aClass162Array1832 != null) {
                    anInt5406 = class124.aClass162Array1832!!.size
                    aClass353Array5524 = arrayOfNulls<Class353>(anInt5406)
                    aClass334Array5442 = arrayOfNulls<Class334>(anInt5406)
                    var i_350_ = 0
                    while (anInt5406 > i_350_) {
                        val class162 = class124.aClass162Array1832!![i_350_]!!
                        val class189 = Class73.method742(104, (class162.anInt2153))
                        var i_351_ = -1
                        for (i_352_ in 0..<anInt5478) {
                            if (class162.anInt2155 == `is`[i_352_]) {
                                i_351_ = i_352_
                                break
                            }
                        }
                        if (i_351_ == -1) throw RuntimeException()
                        var i_353_ = (0xffffff and (Class10.anIntArray179!![((class124.aShortArray1862[class162.anInt2155]).toInt() and 0xffff)]))
                        i_353_ = (i_353_ or (-(if (class124.aByteArray1834 == null) 0 else (class124.aByteArray1834!![(class162.anInt2155)])) + 255 shl 24))
                        aClass353Array5524!![i_350_] = Class353(i_351_, (class124.aShortArray1863[class162.anInt2155]).toInt(), (class124.aShortArray1835!![class162.anInt2155]).toInt(), (class124.aShortArray1855[class162.anInt2155]).toInt(), class189.anInt2526, class189.anInt2530, class189.anInt2525, class189.anInt2533, class189.anInt2534, class189.aBoolean2531, class189.aBoolean2522, class162.anInt2158)
                        aClass334Array5442!![i_350_] = Class334(i_353_)
                        i_350_++
                    }
                }
                val i_354_ = 3 * anInt5478
                aShortArray5439 = ShortArray(i_354_)
                aShortArray5508 = ShortArray(anInt5478)
                aShortArray5423 = ShortArray(anInt5478)
                aFloatArray5506 = FloatArray(i_354_)
                aShortArray5436 = ShortArray(i_354_)
                aShortArray5486 = ShortArray(anInt5478)
                aByteArray5499 = ByteArray(i_354_)
                aShortArray5512 = ShortArray(anInt5478)
                aShortArray5493 = ShortArray(i_354_)
                if (class124.aShortArray1856 != null) aShortArray5432 = ShortArray(anInt5478)
                aShortArray5470 = ShortArray(i_354_)
                aShortArray5416 = ShortArray(i_354_)
                Class348_Sub40_Sub37.aLongArray9465 = LongArray(i_354_)
                aShortArray5495 = ShortArray(anInt5478)
                aShort5452 = i_334_.toShort()
                aByteArray5515 = ByteArray(anInt5478)
                aFloatArray5476 = FloatArray(i_354_)
                aShort5427 = i_335_.toShort()
                aShortArray5438 = ShortArray(i_354_)
                var i_355_ = 0
                var i_356_ = 0
                while ((i_356_ < class124.anInt1821)) {
                    val i_357_ = anIntArray5455!![i_356_]
                    anIntArray5455!![i_356_] = i_355_
                    i_355_ += i_357_
                    class371s[i_356_] = Class371()
                    i_356_++
                }
                anIntArray5455!![class124.anInt1821] = i_355_
                val class358 = method565(255, anInt5478, class124, `is`)!!
                val class63s: Array<Class63?> = arrayOfNulls<Class63>(class124.anInt1817)
                var i_358_ = 0
                while ((class124.anInt1817 > i_358_)) {
                    val i_359_ = class124.aShortArray1863[i_358_]
                    val i_360_ = class124.aShortArray1835!![i_358_]
                    val i_361_ = class124.aShortArray1855[i_358_]
                    val i_362_ = anIntArray5511!![i_360_.toInt()] - anIntArray5511!![i_359_.toInt()]
                    val i_363_ = -anIntArray5519!![i_359_.toInt()] + anIntArray5519!![i_360_.toInt()]
                    val i_364_ = anIntArray5429!![i_360_.toInt()] - anIntArray5429!![i_359_.toInt()]
                    val i_365_ = -anIntArray5511!![i_359_.toInt()] + anIntArray5511!![i_361_.toInt()]
                    val i_366_ = -anIntArray5519!![i_359_.toInt()] + anIntArray5519!![i_361_.toInt()]
                    val i_367_ = -anIntArray5429!![i_359_.toInt()] + anIntArray5429!![i_361_.toInt()]
                    var i_368_ = i_363_ * i_367_ + -(i_366_ * i_364_)
                    var i_369_ = -(i_362_ * i_367_) + i_364_ * i_365_
                    var i_370_: Int
                    i_370_ = i_362_ * i_366_ - i_365_ * i_363_
                    while ((i_368_ > 8192 || i_369_ > 8192 || i_370_ > 8192 || i_368_ < -8192 || i_369_ < -8192 || i_370_ < -8192)) {
                        i_369_ = i_369_ shr 1
                        i_368_ = i_368_ shr 1
                        i_370_ = i_370_ shr 1
                    }
                    var i_371_ = sqrt((i_369_ * i_369_ + (i_368_ * i_368_ - -(i_370_ * i_370_))).toDouble()).toInt()
                    if (i_371_ <= 0) i_371_ = 1
                    i_370_ = 256 * i_370_ / i_371_
                    i_369_ = 256 * i_369_ / i_371_
                    i_368_ = i_368_ * 256 / i_371_
                    val i_372_ = (if (class124.aByteArray1843 != null) class124.aByteArray1843!![i_358_] else 0.toByte())
                    if (i_372_.toInt() == 0) {
                        var class371 = class371s[i_359_.toInt()]!!
                        class371.anInt4522++
                        class371.anInt4525 += i_369_
                        class371.anInt4520 += i_368_
                        class371.anInt4524 += i_370_
                        class371 = class371s[i_360_.toInt()]!!
                        class371.anInt4520 += i_368_
                        class371.anInt4522++
                        class371.anInt4525 += i_369_
                        class371.anInt4524 += i_370_
                        class371 = class371s[i_361_.toInt()]!!
                        class371.anInt4522++
                        class371.anInt4520 += i_368_
                        class371.anInt4525 += i_369_
                        class371.anInt4524 += i_370_
                    } else if (i_372_.toInt() == 1) {
                        class63s[i_358_] = Class63()
                        val class63 = class63s[i_358_]!!
                        class63.anInt1118 = i_368_
                        class63.anInt1119 = i_369_
                        class63.anInt1122 = i_370_
                    }
                    i_358_++
                }
                for (i_373_ in 0..<anInt5478) {
                    val i_374_ = `is`[i_373_]
                    val i_375_ = (0xffff and class124.aShortArray1862[i_374_].toInt())
                    var i_376_: Int
                    if (class124.aByteArray1820 != null) i_376_ = class124.aByteArray1820!![i_374_].toInt()
                    else i_376_ = -1
                    val i_377_: Int
                    if (class124.aByteArray1834 == null) i_377_ = 0
                    else i_377_ = 0xff and (class124.aByteArray1834!![i_374_]).toInt()
                    var i_378_: Short = (if (class124.aShortArray1822 != null) class124.aShortArray1822!![i_374_] else (-1).toShort())
                    if (i_378_.toInt() != -1 && (anInt5472 and 0x40) != 0) {
                        val class12 = var_d.method3(0xffff and i_378_.toInt(), -6662)
                        if (class12!!.aBoolean209) i_378_ = (-1).toShort()
                    }
                    var f = 0.0f
                    var f_379_ = 0.0f
                    var f_380_ = 0.0f
                    var f_381_ = 0.0f
                    var f_382_ = 0.0f
                    var f_383_ = 0.0f
                    var i_384_ = 0
                    var i_385_ = 0
                    var i_386_ = 0
                    if (i_378_.toInt() != -1) {
                        if (i_376_ == -1) {
                            f_380_ = 1.0f
                            f_383_ = 0.0f
                            i_384_ = 1
                            i_385_ = 2
                            f_382_ = 0.0f
                            f = 0.0f
                            f_381_ = 1.0f
                            f_379_ = 1.0f
                        } else {
                            i_376_ = i_376_ and 0xff
                            val i_387_ = class124.aByteArray1823[i_376_]
                            if (i_387_.toInt() == 0) {
                                val i_415_ = (class124.aShortArray1863[i_374_])
                                val i_416_ = (class124.aShortArray1835!![i_374_])
                                val i_417_ = (class124.aShortArray1855[i_374_])
                                val i_418_ = (class124.aShortArray1829[i_376_])
                                val i_419_ = (class124.aShortArray1849[i_376_])
                                val i_420_ = (class124.aShortArray1825[i_376_])
                                val f_421_ = (class124.anIntArray1841[i_418_.toInt()]).toFloat()
                                val f_422_ = (class124.anIntArray1847[i_418_.toInt()]).toFloat()
                                val f_423_ = (class124.anIntArray1852[i_418_.toInt()]).toFloat()
                                val f_424_ = ((class124.anIntArray1841[i_419_.toInt()]).toFloat() - f_421_)
                                val f_425_ = (-f_422_ + (class124.anIntArray1847[i_419_.toInt()]).toFloat())
                                val f_426_ = (-f_423_ + (class124.anIntArray1852[i_419_.toInt()]).toFloat())
                                val f_427_ = (-f_421_ + (class124.anIntArray1841[i_420_.toInt()]).toFloat())
                                val f_428_ = ((class124.anIntArray1847[i_420_.toInt()]).toFloat() - f_422_)
                                val f_429_ = (-f_423_ + (class124.anIntArray1852[i_420_.toInt()]).toFloat())
                                val f_430_ = (-f_421_ + (class124.anIntArray1841[i_415_.toInt()]).toFloat())
                                val f_431_ = ((class124.anIntArray1847[i_415_.toInt()]).toFloat() - f_422_)
                                val f_432_ = (-f_423_ + (class124.anIntArray1852[i_415_.toInt()]).toFloat())
                                val f_433_ = (-f_421_ + (class124.anIntArray1841[i_416_.toInt()]).toFloat())
                                val f_434_ = ((class124.anIntArray1847[i_416_.toInt()]).toFloat() - f_422_)
                                val f_435_ = ((class124.anIntArray1852[i_416_.toInt()]).toFloat() - f_423_)
                                val f_436_ = (-f_421_ + (class124.anIntArray1841[i_417_.toInt()]).toFloat())
                                val f_437_ = (-f_422_ + (class124.anIntArray1847[i_417_.toInt()]).toFloat())
                                val f_438_ = ((class124.anIntArray1852[i_417_.toInt()]).toFloat() - f_423_)
                                val f_439_ = f_425_ * f_429_ - f_428_ * f_426_
                                val f_440_ = f_427_ * f_426_ - f_424_ * f_429_
                                val f_441_ = -(f_427_ * f_425_) + f_428_ * f_424_
                                var f_442_ = -(f_440_ * f_429_) + f_441_ * f_428_
                                var f_443_ = -(f_441_ * f_427_) + f_439_ * f_429_
                                var f_444_ = -(f_439_ * f_428_) + f_440_ * f_427_
                                var f_445_ = 1.0f / (f_443_ * f_425_ + f_442_ * f_424_ + f_426_ * f_444_)
                                f = f_445_ * (f_444_ * f_432_ + (f_442_ * f_430_ + f_443_ * f_431_))
                                f_382_ = (f_444_ * f_438_ + (f_442_ * f_436_ + f_437_ * f_443_)) * f_445_
                                f_380_ = f_445_ * (f_435_ * f_444_ + (f_443_ * f_434_ + f_442_ * f_433_))
                                f_442_ = f_441_ * f_425_ - f_440_ * f_426_
                                f_443_ = -(f_424_ * f_441_) + f_426_ * f_439_
                                f_444_ = -(f_439_ * f_425_) + f_440_ * f_424_
                                f_445_ = 1.0f / (f_442_ * f_427_ + f_428_ * f_443_ + f_429_ * f_444_)
                                f_381_ = (f_433_ * f_442_ + f_434_ * f_443_ + f_444_ * f_435_) * f_445_
                                f_383_ = (f_442_ * f_436_ + f_443_ * f_437_ + f_444_ * f_438_) * f_445_
                                f_379_ = f_445_ * (f_432_ * f_444_ + (f_431_ * f_443_ + f_430_ * f_442_))
                            } else {
                                val i_388_ = (class124.aShortArray1863[i_374_])
                                val i_389_ = (class124.aShortArray1835!![i_374_])
                                val i_390_ = (class124.aShortArray1855[i_374_])
                                val i_391_ = (class358.anIntArray4416!![i_376_])
                                val i_392_ = (class358.anIntArray4415!![i_376_])
                                val i_393_ = (class358.anIntArray4414!![i_376_])
                                val fs = (class358.aFloatArrayArray4412!![i_376_])!!
                                val i_394_ = (class124.aByteArray1853[i_376_])
                                val f_395_ = ((class124.anIntArray1867[i_376_]).toFloat() / 256.0f)
                                if (i_387_.toInt() == 1) {
                                    val f_413_ = ((class124.anIntArray1844[i_376_]).toFloat() / 1024.0f)
                                    method1885(i_393_, (class124.anIntArray1852[i_388_.toInt()]), i_394_.toInt(), 8, (class124.anIntArray1841[i_388_.toInt()]), Class283.aFloatArray3658, (class124.anIntArray1847[i_388_.toInt()]), f_395_, i_392_, i_391_, f_413_, fs)
                                    f_379_ = Class283.aFloatArray3658!![1]
                                    f = Class283.aFloatArray3658!![0]
                                    method1885(i_393_, (class124.anIntArray1852[i_389_.toInt()]), i_394_.toInt(), 8, (class124.anIntArray1841[i_389_.toInt()]), Class283.aFloatArray3658, (class124.anIntArray1847[i_389_.toInt()]), f_395_, i_392_, i_391_, f_413_, fs)
                                    f_381_ = Class283.aFloatArray3658!![1]
                                    f_380_ = Class283.aFloatArray3658!![0]
                                    method1885(i_393_, (class124.anIntArray1852[i_390_.toInt()]), i_394_.toInt(), 8, (class124.anIntArray1841[i_390_.toInt()]), Class283.aFloatArray3658, (class124.anIntArray1847[i_390_.toInt()]), f_395_, i_392_, i_391_, f_413_, fs)
                                    f_382_ = Class283.aFloatArray3658!![0]
                                    f_383_ = Class283.aFloatArray3658!![1]
                                    val f_414_ = f_413_ / 2.0f
                                    if ((i_394_.toInt() and 0x1) == 0) {
                                        if (f_414_ < -f + f_380_) {
                                            i_384_ = 1
                                            f_380_ -= f_413_
                                        } else if (f_414_ < -f_380_ + f) {
                                            f_380_ += f_413_
                                            i_384_ = 2
                                        }
                                        if (f_414_ < f_382_ - f) {
                                            f_382_ -= f_413_
                                            i_385_ = 1
                                        } else if (-f_382_ + f > f_414_) {
                                            i_385_ = 2
                                            f_382_ += f_413_
                                        }
                                    } else {
                                        if (f_414_ < -f_379_ + f_383_) {
                                            f_383_ -= f_413_
                                            i_385_ = 1
                                        } else if (-f_383_ + f_379_ > f_414_) {
                                            i_385_ = 2
                                            f_383_ += f_413_
                                        }
                                        if (-f_379_ + f_381_ > f_414_) {
                                            f_381_ -= f_413_
                                            i_384_ = 1
                                        } else if (-f_381_ + f_379_ > f_414_) {
                                            f_381_ += f_413_
                                            i_384_ = 2
                                        }
                                    }
                                } else if (i_387_.toInt() == 2) {
                                    val f_396_ = ((class124.anIntArray1857[i_376_]).toFloat() / 256.0f)
                                    val f_397_ = ((class124.anIntArray1865[i_376_]).toFloat() / 256.0f)
                                    val i_398_ = (-(class124.anIntArray1841[i_388_.toInt()]) + (class124.anIntArray1841[i_389_.toInt()]))
                                    val i_399_ = ((class124.anIntArray1847[i_389_.toInt()]) + -(class124.anIntArray1847[i_388_.toInt()]))
                                    val i_400_ = (-(class124.anIntArray1852[i_388_.toInt()]) + (class124.anIntArray1852[i_389_.toInt()]))
                                    val i_401_ = ((class124.anIntArray1841[i_390_.toInt()]) + -(class124.anIntArray1841[i_388_.toInt()]))
                                    val i_402_ = ((class124.anIntArray1847[i_390_.toInt()]) - (class124.anIntArray1847[i_388_.toInt()]))
                                    val i_403_ = (-(class124.anIntArray1852[i_388_.toInt()]) + (class124.anIntArray1852[i_390_.toInt()]))
                                    val i_404_ = (i_399_ * i_403_ + -(i_400_ * i_402_))
                                    val i_405_ = (i_401_ * i_400_ + -(i_398_ * i_403_))
                                    val i_406_ = (i_402_ * i_398_ + -(i_399_ * i_401_))
                                    val f_407_ = (64.0f / (class124.anIntArray1859!![i_376_]).toFloat())
                                    val f_408_ = (64.0f / (class124.anIntArray1816[i_376_]).toFloat())
                                    val f_409_ = (64.0f / (class124.anIntArray1844[i_376_]).toFloat())
                                    val f_410_ = ((i_406_.toFloat() * fs[2] + (i_404_.toFloat() * fs[0] + i_405_.toFloat() * fs[1])) / f_407_)
                                    val f_411_ = ((fs[5] * i_406_.toFloat() + (fs[3] * i_404_.toFloat() + i_405_.toFloat() * fs[4])) / f_408_)
                                    val f_412_ = ((i_405_.toFloat() * fs[7] + fs[6] * i_404_.toFloat() + fs[8] * i_406_.toFloat()) / f_409_)
                                    i_386_ = Class331.method2635(f_411_, false, f_412_, f_410_)
                                    Class262.method1991(f_397_, f_395_, fs, (class124.anIntArray1852[i_388_.toInt()]), i_393_, false, i_394_.toInt(), i_391_, (class124.anIntArray1841[i_388_.toInt()]), (class124.anIntArray1847[i_388_.toInt()]), f_396_, Class283.aFloatArray3658, i_392_, i_386_)
                                    f_379_ = Class283.aFloatArray3658!![1]
                                    f = Class283.aFloatArray3658!![0]
                                    Class262.method1991(f_397_, f_395_, fs, (class124.anIntArray1852[i_389_.toInt()]), i_393_, false, i_394_.toInt(), i_391_, (class124.anIntArray1841[i_389_.toInt()]), (class124.anIntArray1847[i_389_.toInt()]), f_396_, Class283.aFloatArray3658, i_392_, i_386_)
                                    f_381_ = Class283.aFloatArray3658!![1]
                                    f_380_ = Class283.aFloatArray3658!![0]
                                    Class262.method1991(f_397_, f_395_, fs, (class124.anIntArray1852[i_390_.toInt()]), i_393_, false, i_394_.toInt(), i_391_, (class124.anIntArray1841[i_390_.toInt()]), (class124.anIntArray1847[i_390_.toInt()]), f_396_, Class283.aFloatArray3658, i_392_, i_386_)
                                    f_382_ = Class283.aFloatArray3658!![0]
                                    f_383_ = Class283.aFloatArray3658!![1]
                                } else if (i_387_.toInt() == 3) {
                                    Class181.method1367(i_393_, i_394_.toInt(), f_395_, (class124.anIntArray1841[i_388_.toInt()]), Class283.aFloatArray3658, (class124.anIntArray1852[i_388_.toInt()]), i_391_, (class124.anIntArray1847[i_388_.toInt()]), i_392_, -4, fs)
                                    f = Class283.aFloatArray3658!![0]
                                    f_379_ = Class283.aFloatArray3658!![1]
                                    Class181.method1367(i_393_, i_394_.toInt(), f_395_, (class124.anIntArray1841[i_389_.toInt()]), Class283.aFloatArray3658, (class124.anIntArray1852[i_389_.toInt()]), i_391_, (class124.anIntArray1847[i_389_.toInt()]), i_392_, -4, fs)
                                    f_380_ = Class283.aFloatArray3658!![0]
                                    f_381_ = Class283.aFloatArray3658!![1]
                                    Class181.method1367(i_393_, i_394_.toInt(), f_395_, (class124.anIntArray1841[i_390_.toInt()]), Class283.aFloatArray3658, (class124.anIntArray1852[i_390_.toInt()]), i_391_, (class124.anIntArray1847[i_390_.toInt()]), i_392_, -4, fs)
                                    f_382_ = Class283.aFloatArray3658!![0]
                                    f_383_ = Class283.aFloatArray3658!![1]
                                    if ((i_394_.toInt() and 0x1) == 0) {
                                        if (-f + f_382_ > 0.5f) {
                                            f_382_--
                                            i_385_ = 1
                                        } else if (f - f_382_ > 0.5f) {
                                            f_382_++
                                            i_385_ = 2
                                        }
                                        if (-f + f_380_ > 0.5f) {
                                            f_380_--
                                            i_384_ = 1
                                        } else if (-f_380_ + f > 0.5f) {
                                            f_380_++
                                            i_384_ = 2
                                        }
                                    } else {
                                        if (-f_379_ + f_383_ > 0.5f) {
                                            i_385_ = 1
                                            f_383_--
                                        } else if (f_379_ - f_383_ > 0.5f) {
                                            i_385_ = 2
                                            f_383_++
                                        }
                                        if (f_381_ - f_379_ > 0.5f) {
                                            f_381_--
                                            i_384_ = 1
                                        } else if (f_379_ - f_381_ > 0.5f) {
                                            i_384_ = 2
                                            f_381_++
                                        }
                                    }
                                }
                            }
                        }
                    }
                    val i_446_: Byte
                    if (class124.aByteArray1843 != null) i_446_ = class124.aByteArray1843!![i_374_]
                    else i_446_ = 0.toByte()
                    if (i_446_.toInt() == 0) {
                        val l = ((i_376_ shl 2).toLong() + (((i_375_ shl 8).toLong() + ((i_386_ shl 24).toLong() - -i_377_.toLong())) shl 32))
                        val i_447_ = class124.aShortArray1863[i_374_]
                        val i_448_ = class124.aShortArray1835!![i_374_]
                        val i_449_ = class124.aShortArray1855[i_374_]
                        var class371 = class371s[i_447_.toInt()]!!
                        aShortArray5508!![i_373_] = method669(class371.anInt4524, l, i_373_, class371.anInt4522, class371.anInt4520, -114, f, i_447_.toInt(), f_379_, class124, class371.anInt4525)
                        class371 = class371s[i_448_.toInt()]!!
                        aShortArray5495!![i_373_] = method669(class371.anInt4524, i_384_.toLong() + l, i_373_, class371.anInt4522, class371.anInt4520, -68, f_380_, i_448_.toInt(), f_381_, class124, class371.anInt4525)
                        class371 = class371s[i_449_.toInt()]!!
                        aShortArray5512!![i_373_] = method669(class371.anInt4524, i_385_.toLong() + l, i_373_, class371.anInt4522, class371.anInt4520, -112, f_382_, i_449_.toInt(), f_383_, class124, class371.anInt4525)
                    } else if (i_446_.toInt() == 1) {
                        val class63 = class63s[i_374_]!!
                        val l = (((i_377_.toLong() + ((i_386_ shl 24).toLong() - -(i_375_ shl 8).toLong())) shl 32) + (((256 + class63.anInt1119) shl 12) + (if (class63.anInt1118 > 0) 1024 else 2048) + (i_376_ shl 2) + ((class63.anInt1122 - -256) shl 22)).toLong())
                        aShortArray5508!![i_373_] = method669(class63.anInt1122, l, i_373_, 0, class63.anInt1118, -106, f, (class124.aShortArray1863[i_374_]).toInt(), f_379_, class124, class63.anInt1119)
                        aShortArray5495!![i_373_] = method669(class63.anInt1122, l + i_384_.toLong(), i_373_, 0, class63.anInt1118, -57, f_380_, (class124.aShortArray1835!![i_374_]).toInt(), f_381_, class124, class63.anInt1119)
                        aShortArray5512!![i_373_] = method669(class63.anInt1122, l + i_385_.toLong(), i_373_, 0, class63.anInt1118, -109, f_382_, (class124.aShortArray1855[i_374_]).toInt(), f_383_, class124, class63.anInt1119)
                    }
                    if (class124.aByteArray1834 != null) aByteArray5515!![i_373_] = class124.aByteArray1834!![i_374_]
                    if (class124.aShortArray1856 != null) aShortArray5432!![i_373_] = class124.aShortArray1856!![i_374_]
                    aShortArray5486!![i_373_] = class124.aShortArray1862[i_374_]
                    aShortArray5423!![i_373_] = i_378_
                }
                if (anInt5516 > 0) {
                    var i_450_ = 1
                    var i_451_ = aShortArray5423!![0]
                    var i_452_ = 0
                    while (anInt5516 > i_452_) {
                        val i_453_ = aShortArray5423!![i_452_]
                        if (i_453_ != i_451_) {
                            i_450_++
                            i_451_ = i_453_
                        }
                        i_452_++
                    }
                    anIntArray5415 = IntArray(i_450_)
                    anIntArray5404 = IntArray(i_450_ - -1)
                    anIntArray5473 = IntArray(i_450_)
                    anIntArray5404!![0] = 0
                    var i_454_ = anInt5475
                    i_450_ = 0
                    var i_455_ = 0
                    i_451_ = aShortArray5423!![0]
                    for (i_456_ in 0..<anInt5516) {
                        val i_457_ = aShortArray5423!![i_456_]
                        if (i_457_ != i_451_) {
                            anIntArray5415!![i_450_] = i_454_
                            anIntArray5473!![i_450_] = 1 + -i_454_ + i_455_
                            anIntArray5404!![++i_450_] = i_456_
                            i_451_ = i_457_
                            i_455_ = 0
                            i_454_ = anInt5475
                        }
                        var i_458_ = aShortArray5508!![i_456_].toInt()
                        if (i_458_ > i_455_) i_455_ = i_458_
                        if (i_454_ > i_458_) i_454_ = i_458_
                        i_458_ = aShortArray5495!![i_456_].toInt()
                        if (i_458_ > i_455_) i_455_ = i_458_
                        if (i_458_ < i_454_) i_454_ = i_458_
                        i_458_ = aShortArray5512!![i_456_].toInt()
                        if (i_455_ < i_458_) i_455_ = i_458_
                        if (i_454_ > i_458_) i_454_ = i_458_
                    }
                    anIntArray5415!![i_450_] = i_454_
                    anIntArray5473!![i_450_] = i_455_ + -i_454_ + 1
                    anIntArray5404!![++i_450_] = anInt5516
                }
                Class348_Sub40_Sub37.aLongArray9465 = null
                aShortArray5470 = Class331.method2639((-111).toByte(), aShortArray5470!!, anInt5475)
                aShortArray5416 = Class331.method2639(26.toByte(), aShortArray5416!!, anInt5475)
                aShortArray5493 = Class331.method2639(68.toByte(), aShortArray5493!!, anInt5475)
                aShortArray5438 = Class331.method2639((-125).toByte(), aShortArray5438!!, anInt5475)
                aShortArray5436 = Class331.method2639(70.toByte(), aShortArray5436!!, anInt5475)
                aByteArray5499 = method135(111.toByte(), aByteArray5499, anInt5475)
                aFloatArray5476 = method3258(0, anInt5475, aFloatArray5476)
                aFloatArray5506 = method3258(0, anInt5475, aFloatArray5506)
                if (class124.anIntArray1868 != null && Class160.method1257(-58, anInt5472, i)) anIntArrayArray5413 = class124.method1100(false, -20)
                if (class124.aClass162Array1832 != null && Class77.method780(anInt5472, 0, i)) anIntArrayArray5412 = class124.method1093((-120).toByte())
                if (class124.anIntArray1824 == null || !Class135_Sub2.method1158(anInt5472, -1, i)) break
                var i_459_ = 0
                val is_460_ = IntArray(256)
                for (i_461_ in 0..<anInt5478) {
                    val i_462_ = class124.anIntArray1824!![`is`[i_461_]]
                    if (i_462_ >= 0) {
                        is_460_[i_462_]++
                        if (i_462_ > i_459_) i_459_ = i_462_
                    }
                }
                anIntArrayArray5492 = arrayOfNulls<IntArray>(1 + i_459_)
                var i_463_ = 0
                while (i_459_ >= i_463_) {
                    anIntArrayArray5492!![i_463_] = IntArray(is_460_[i_463_])
                    is_460_[i_463_] = 0
                    i_463_++
                }
                var i_464_ = 0
                while (anInt5478 > i_464_) {
                    val i_465_ = class124.anIntArray1824!![`is`[i_464_]]
                    if (i_465_ >= 0) anIntArrayArray5492!![i_465_]!![is_460_[i_465_]++] = i_464_
                    i_464_++
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("nca.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (class124 != null) "{...}" else "null") + ',' + i + ',' + i_334_ + ',' + i_335_ + ',' + i_336_ + ')'))
            }
            break
        } while (false)
    }

    private fun method671(i: Int, i_466_: Int, i_467_: Int, i_468_: Int, i_469_: Int, i_470_: Int, i_471_: Int, i_472_: Int, i_473_: Int): Boolean {
        anInt5518++
        if (i_469_ > i_470_ && i_470_ < i_473_ && i_468_ > i_470_) return false
        if (i_469_ < i_470_ && i_470_ > i_473_ && i_470_ > i_468_) return false
        if (i_471_ != 0) return true
        if (i < i_472_ && i_467_ > i && i < i_466_) return false
        return i <= i_472_ || i <= i_467_ || i_466_ >= i
    }

    public override fun method612() {
        anInt5447++
        if (anInt5475 > 0 && anInt5516 > 0) {
            method660(-98)
            method666(-20)
            method663(262144)
        }
    }

    private fun method672(i: Int) {
        if (i != 416776206) wa()
        anInt5441++
        if (anInt5516 != 0) {
            if (method660(i xor 0x18d78060.inv()) && method666(-128)) {
                aHa_Sub3_5419!!.method3925(i + -416776294, (aClass290_5520!!.anInterface5_Impl1_3711), 0)
                aHa_Sub3_5419!!.method3925(i xor 0x18d78057, (aClass290_5482!!.anInterface5_Impl1_3711), 1)
                aHa_Sub3_5419!!.method3925(i xor 0x18d78079.inv(), (aClass290_5460!!.anInterface5_Impl1_3711), 2)
                val bool: Boolean
                if ((anInt5472 and 0x37) == 0) {
                    bool = false
                    aHa_Sub3_5419!!.method3866(false, true)
                    aHa_Sub3_5419!!.method3862(0, (aHa_Sub3_5419!!.aClass130_8191))
                } else {
                    bool = true
                    aHa_Sub3_5419!!.method3866(true, true)
                    aHa_Sub3_5419!!.method3925(i xor 0x18d7806c.inv(), (aClass290_5424!!.anInterface5_Impl1_3711), 3)
                    aHa_Sub3_5419!!.method3862(0, (aHa_Sub3_5419!!.aClass130_8208))
                }
                var i_474_ = 0
                while (anIntArray5415!!.size > i_474_) {
                    val i_475_ = anIntArray5404!![i_474_]
                    val i_476_ = anIntArray5404!![1 + i_474_]
                    var i_477_ = aShortArray5423!![i_475_].toInt() and 0xffff
                    if (i_477_ == 65535) i_477_ = -1
                    aHa_Sub3_5419!!.method3814(true, bool, i_477_, 102.toByte())
                    aHa_Sub3_5419!!.method3938(Class247.aClass21_3181, -i_475_ + i_476_, (aClass192_5485!!.anInterface5_Impl2_2572), anIntArray5415!![i_474_], 3 * i_475_, anIntArray5473!![i_474_], 54)
                    i_474_++
                }
            }
            method663(262144)
        }
    }

    public override fun method623(i: Int, i_478_: Int, class101: Class101?, bool: Boolean, i_479_: Int, i_480_: Int): Boolean {
        try {
            anInt5517++
            return method662(i, i_479_, i_480_, 126, i_478_, bool, class101)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.OA(" + i + ',' + i_478_ + ',' + (if (class101 != null) "{...}" else "null") + ',' + bool + ',' + i_479_ + ',' + i_480_ + ')'))
        }
    }

    private fun method673(i: Byte) {
        val i_481_ = 1 % ((25 - i) / 40)
        if ((anInt5472 and 0x37) == 0) {
            if (aClass290_5482 != null) aClass290_5482!!.aBoolean3714 = false
        } else if (aClass290_5424 != null) aClass290_5424!!.aBoolean3714 = false
        anInt5405++
    }

    private fun method674(i: Int) {
        if (aClass192_5485 != null) aClass192_5485!!.aBoolean2577 = false
        val i_482_ = 28 % ((i - 18) / 43)
        anInt5505++
    }

    public override fun method613(class64: Class64?, i: Int, i_483_: Int, i_484_: Int, bool: Boolean) {
        try {
            anInt5417++
            val class64_sub2_485_ = class64 as Class64_Sub2
            if (anInt5478 != 0 && class64_sub2_485_.anInt5478 != 0) {
                val i_486_ = class64_sub2_485_.anInt5433
                val `is` = class64_sub2_485_.anIntArray5511
                val is_487_ = class64_sub2_485_.anIntArray5519
                val is_488_ = class64_sub2_485_.anIntArray5429
                val is_489_ = class64_sub2_485_.aShortArray5493
                val is_490_ = class64_sub2_485_.aShortArray5438
                val is_491_ = class64_sub2_485_.aShortArray5436
                val is_492_ = class64_sub2_485_.aByteArray5499
                var is_493_: ShortArray?
                var is_494_: ShortArray?
                var is_495_: ByteArray?
                var is_496_: ShortArray?
                if (aClass151_5503 == null) {
                    is_493_ = null
                    is_494_ = null
                    is_495_ = null
                    is_496_ = null
                } else {
                    is_495_ = aClass151_5503!!.aByteArray2069
                    is_493_ = aClass151_5503!!.aShortArray2060
                    is_494_ = aClass151_5503!!.aShortArray2067
                    is_496_ = aClass151_5503!!.aShortArray2058
                }
                var is_497_: ShortArray?
                var is_498_: ByteArray?
                var is_499_: ShortArray?
                var is_500_: ShortArray?
                if (class64_sub2_485_.aClass151_5503 == null) {
                    is_497_ = null
                    is_498_ = null
                    is_499_ = null
                    is_500_ = null
                } else {
                    is_499_ = (class64_sub2_485_.aClass151_5503!!.aShortArray2058)
                    is_498_ = (class64_sub2_485_.aClass151_5503!!.aByteArray2069)
                    is_497_ = (class64_sub2_485_.aClass151_5503!!.aShortArray2060)
                    is_500_ = (class64_sub2_485_.aClass151_5503!!.aShortArray2067)
                }
                val is_501_ = class64_sub2_485_.anIntArray5455
                val is_502_ = class64_sub2_485_.aShortArray5439
                if (!class64_sub2_485_.aBoolean5477) class64_sub2_485_.method675(0)
                val i_503_ = class64_sub2_485_.anInt5461
                val i_504_ = class64_sub2_485_.anInt5509
                val i_505_ = class64_sub2_485_.anInt5507
                val i_506_ = class64_sub2_485_.anInt5467
                val i_507_ = class64_sub2_485_.anInt5418
                val i_508_ = class64_sub2_485_.anInt5443
                var i_509_ = 0
                while (anInt5433 > i_509_) {
                    val i_510_ = anIntArray5519!![i_509_] - i_483_
                    if (i_503_ <= i_510_ && i_510_ <= i_504_) {
                        val i_511_ = -i + anIntArray5511!![i_509_]
                        if (i_511_ >= i_505_ && i_511_ <= i_506_) {
                            val i_512_ = anIntArray5429!![i_509_] - i_484_
                            if (i_507_ <= i_512_ && i_512_ <= i_508_) {
                                var i_513_ = -1
                                var i_514_ = anIntArray5455!![i_509_]
                                var i_515_ = anIntArray5455!![1 + i_509_]
                                var i_516_ = i_514_
                                while (i_515_ > i_516_) {
                                    i_513_ = -1 + aShortArray5439!![i_516_]
                                    if (i_513_ == -1 || aByteArray5499!![i_513_].toInt() != 0) break
                                    i_516_++
                                }
                                if (i_513_ != -1) {
                                    var i_517_ = 0
                                    while (i_486_ > i_517_) {
                                        if ((`is`!![i_517_] == i_511_) && (is_488_!![i_517_] == i_512_) && (i_510_ == is_487_!![i_517_])) {
                                            var i_518_ = -1
                                            i_514_ = is_501_!![i_517_]
                                            i_515_ = is_501_[1 + i_517_]
                                            for (i_519_ in i_514_..<i_515_) {
                                                i_518_ = is_502_!![i_519_] + -1
                                                if (i_518_ == -1 || is_492_!![i_518_].toInt() != 0) break
                                            }
                                            if (i_518_ != -1) {
                                                if (is_494_ == null) {
                                                    aClass151_5503 = Class151()
                                                    aClass151_5503!!.aShortArray2067 = (Class50_Sub3.method470(aShortArray5493, (-123).toByte()))
                                                    is_494_ = aClass151_5503!!.aShortArray2067
                                                    aClass151_5503!!.aShortArray2060 = (Class50_Sub3.method470(aShortArray5438, (-126).toByte()))
                                                    is_493_ = aClass151_5503!!.aShortArray2060
                                                    aClass151_5503!!.aShortArray2058 = (Class50_Sub3.method470(aShortArray5436, (-111).toByte()))
                                                    is_496_ = aClass151_5503!!.aShortArray2058
                                                    aClass151_5503!!.aByteArray2069 = (Class309.method2309(-106, aByteArray5499))
                                                    is_495_ = aClass151_5503!!.aByteArray2069
                                                }
                                                if (is_500_ == null) {
                                                    val class151 = (Class151().also { class64_sub2_485_.aClass151_5503 = it })
                                                    class151.aShortArray2067 = (Class50_Sub3.method470(is_489_, (-120).toByte()))
                                                    is_500_ = class151.aShortArray2067
                                                    class151.aShortArray2060 = (Class50_Sub3.method470(is_490_, (-104).toByte()))
                                                    is_497_ = class151.aShortArray2060
                                                    class151.aShortArray2058 = (Class50_Sub3.method470(is_491_, (-118).toByte()))
                                                    is_499_ = class151.aShortArray2058
                                                    class151.aByteArray2069 = (Class309.method2309(-114, is_492_))
                                                    is_498_ = class151.aByteArray2069
                                                }
                                                var i_520_ = aShortArray5493!![i_513_]
                                                var i_521_ = aShortArray5438!![i_513_]
                                                var i_522_ = aShortArray5436!![i_513_]
                                                i_514_ = is_501_[i_517_]
                                                i_515_ = is_501_[i_517_ + 1]
                                                var i_523_ = aByteArray5499!![i_513_]
                                                var i_524_ = i_514_
                                                while ((i_515_ > i_524_)) {
                                                    val i_525_ = -1 + is_502_!![i_524_]
                                                    if (i_525_ == -1) break
                                                    if (is_498_!![i_525_].toInt() != 0) {
                                                        is_500_!![i_525_] = (is_500_[i_525_] + i_520_).toShort()
                                                        is_497_!![i_525_] = (is_497_[i_525_] + i_521_).toShort()
                                                        is_499_!![i_525_] = (is_499_[i_525_] + i_522_).toShort()
                                                        is_498_[i_525_] = (is_498_[i_525_] + i_523_).toByte()
                                                    }
                                                    i_524_++
                                                }
                                                i_514_ = anIntArray5455!![i_509_]
                                                i_522_ = is_491_!![i_518_]
                                                i_523_ = is_492_!![i_518_]
                                                i_520_ = is_489_!![i_518_]
                                                i_521_ = is_490_!![i_518_]
                                                i_515_ = (anIntArray5455!![1 + i_509_])
                                                var i_526_ = i_514_
                                                while (i_515_ > i_526_) {
                                                    val i_527_ = ((aShortArray5439!![i_526_]) - 1)
                                                    if (i_527_ == -1) break
                                                    if (is_495_!![i_527_].toInt() != 0) {
                                                        is_494_!![i_527_] = (is_494_[i_527_] + i_520_).toShort()
                                                        is_493_!![i_527_] = (is_493_[i_527_] + i_521_).toShort()
                                                        is_496_!![i_527_] = (is_496_[i_527_] + i_522_).toShort()
                                                        is_495_[i_527_] = (is_495_[i_527_] + i_523_).toByte()
                                                    }
                                                    i_526_++
                                                }
                                                class64_sub2_485_.method673(80.toByte())
                                                method673((-111).toByte())
                                            }
                                        }
                                        i_517_++
                                    }
                                }
                            }
                        }
                    }
                    i_509_++
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.PA(" + (if (class64 != null) "{...}" else "null") + ',' + i + ',' + i_483_ + ',' + i_484_ + ',' + bool + ')'))
        }
    }

    public override fun ia(i: Short, i_528_: Short) {
        anInt5459++
        var i_529_ = 0
        while (anInt5478 > i_529_) {
            if (i == aShortArray5486!![i_529_]) aShortArray5486!![i_529_] = i_528_
            i_529_++
        }
        if (aClass353Array5524 != null) {
            for (i_530_ in 0..<anInt5406) {
                val class353 = aClass353Array5524!![i_530_]!!
                val class334 = aClass334Array5442!![i_530_]!!
                class334.anInt4156 = ((Class10.anIntArray179!![0xffff and aShortArray5486!![(class353.anInt4342)].toInt()]) and 0xffffff or (class334.anInt4156 and 0xffffff.inv()))
            }
        }
        method670(-119)
    }

    public override fun method614(i: Byte, i_531_: Int, bool: Boolean): Class64? {
        anInt5426++
        val class64_sub2_532_: Class64_Sub2?
        val class64_sub2_533_: Class64_Sub2?
        if (i.toInt() == 1) {
            class64_sub2_532_ = aHa_Sub3_5419!!.aClass64_Sub2_8198
            class64_sub2_533_ = aHa_Sub3_5419!!.aClass64_Sub2_8206
        } else if (i.toInt() == 2) {
            class64_sub2_532_ = aHa_Sub3_5419!!.aClass64_Sub2_8194
            class64_sub2_533_ = aHa_Sub3_5419!!.aClass64_Sub2_8192
        } else if (i.toInt() == 3) {
            class64_sub2_532_ = aHa_Sub3_5419!!.aClass64_Sub2_8187
            class64_sub2_533_ = aHa_Sub3_5419!!.aClass64_Sub2_8200
        } else if (i.toInt() == 4) {
            class64_sub2_532_ = aHa_Sub3_5419!!.aClass64_Sub2_8199
            class64_sub2_533_ = aHa_Sub3_5419!!.aClass64_Sub2_8188
        } else if (i.toInt() == 5) {
            class64_sub2_533_ = aHa_Sub3_5419!!.aClass64_Sub2_8207
            class64_sub2_532_ = aHa_Sub3_5419!!.aClass64_Sub2_8189
        } else {
            class64_sub2_532_ = Class64_Sub2(aHa_Sub3_5419, 0, 0, true, false)
            class64_sub2_533_ = class64_sub2_532_
        }
        return method668(i.toInt() != 0, class64_sub2_532_, class64_sub2_533_, i_531_, bool, 26794)
    }

    public override fun p(i: Int, i_534_: Int, var_s: s?, var_s_535_: s?, i_536_: Int, i_537_: Int, i_538_: Int) {
        try {
            anInt5501++
            if (!aBoolean5477) method675(0)
            var i_539_ = i_536_ - -anInt5507
            var i_540_ = anInt5467 + i_536_
            var i_541_ = anInt5418 + i_538_
            var i_542_ = i_538_ - -anInt5443
            if ((i != 1 && i != 2 && i != 3 && i != 5) || (i_539_ >= 0 && var_s!!.anInt4587 > (i_540_ + var_s.anInt4592 shr var_s.anInt4588) && i_541_ >= 0 && var_s.anInt4590 > (var_s.anInt4592 + i_542_ shr var_s.anInt4588))) {
                if (i != 4 && i != 5) {
                    i_539_ = i_539_ shr var_s!!.anInt4588
                    i_540_ = (var_s.anInt4592 + -1 + i_540_ shr var_s.anInt4588)
                    i_541_ = i_541_ shr var_s.anInt4588
                    i_542_ = (var_s.anInt4592 - (1 - i_542_) shr var_s.anInt4588)
                    if ((var_s.method3982((-86).toByte(), i_541_, i_539_) == i_537_) && i_537_ == var_s.method3982((-86).toByte(), i_541_, i_540_) && (var_s.method3982((-86).toByte(), i_542_, i_539_) == i_537_) && i_537_ == var_s.method3982((-86).toByte(), i_542_, i_540_)) return
                } else if (var_s_535_ == null || (i_539_ < 0 || (var_s_535_.anInt4587 <= (var_s_535_.anInt4592 + i_540_ shr var_s_535_.anInt4588)) || i_541_ < 0 || (var_s_535_.anInt4590 <= (i_542_ - -var_s_535_.anInt4592 shr var_s_535_.anInt4588)))) return
                if (i == 1) {
                    var i_559_ = 0
                    while (anInt5433 > i_559_) {
                        anIntArray5519!![i_559_] = (anIntArray5519!![i_559_] + (var_s!!.method3986((anIntArray5511!![i_559_] + i_536_), (anIntArray5429!![i_559_] + i_538_), (-93).toByte()) - i_537_))
                        i_559_++
                    }
                } else if (i == 2) {
                    val i_543_ = anInt5461
                    if (i_543_ == 0) return
                    var i_544_ = 0
                    while (anInt5433 > i_544_) {
                        val i_545_ = ((anIntArray5519!![i_544_] shl 16) / i_543_)
                        if (i_545_ < i_534_) anIntArray5519!![i_544_] = (anIntArray5519!![i_544_] - -((i_534_ + -i_545_) * (-i_537_ + (var_s!!.method3986((i_536_ + anIntArray5511!![i_544_]), (anIntArray5429!![i_544_] - -i_538_), (-92).toByte()))) / i_534_))
                        i_544_++
                    }
                } else if (i == 3) {
                    val i_555_ = 4 * (i_534_ and 0xff)
                    val i_556_ = (i_534_ shr 8 and 0xff) * 4
                    val i_557_ = 0x3fc0 and (i_534_ shr 16 shl 6)
                    val i_558_ = 0x3fc0 and (i_534_ shr 24 shl 6)
                    if ((i_536_ - (i_555_ shr 1) < 0) || ((var_s!!.anInt4592 + (i_555_ shr 1) + i_536_) >= var_s.anInt4587 shl var_s.anInt4588) || -(i_556_ shr 1) + i_538_ < 0 || ((var_s.anInt4592 + ((i_556_ shr 1) + i_538_)) >= var_s.anInt4590 shl var_s.anInt4588)) return
                    this.method626(i_555_, 10947, i_558_, i_536_, i_556_, i_537_, i_557_, var_s, i_538_)
                } else if (i == 4) {
                    val i_553_ = -anInt5461 + anInt5509
                    var i_554_ = 0
                    while ((i_554_ < anInt5433)) {
                        anIntArray5519!![i_554_] = (i_553_ + anIntArray5519!![i_554_] - (-(var_s_535_!!.method3986(anIntArray5511!![i_554_] + i_536_, anIntArray5429!![i_554_] - -i_538_, 92.toByte())) + i_537_))
                        i_554_++
                    }
                } else if (i == 5) {
                    val i_546_ = -anInt5461 + anInt5509
                    var i_547_ = 0
                    while (anInt5433 > i_547_) {
                        val i_548_ = i_536_ + anIntArray5511!![i_547_]
                        val i_549_ = i_538_ + anIntArray5429!![i_547_]
                        val i_550_ = var_s!!.method3986(i_548_, i_549_, 57.toByte())
                        val i_551_ = var_s_535_!!.method3986(i_548_, i_549_, (-111).toByte())
                        val i_552_ = i_550_ - (i_551_ - -i_534_)
                        anIntArray5519!![i_547_] = ((i_552_ * ((anIntArray5519!![i_547_] shl 8) / i_546_) shr 8) + (i_550_ + -i_537_))
                        i_547_++
                    }
                }
                method667(0)
                aBoolean5477 = false
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.p(" + i + ',' + i_534_ + ',' + (if (var_s != null) "{...}" else "null") + ',' + (if (var_s_535_ != null) "{...}" else "null") + ',' + i_536_ + ',' + i_537_ + ',' + i_538_ + ')'))
        }
    }

    public override fun F(): Boolean {
        anInt5446++
        return aBoolean5428
    }

    public override fun method621() {
        anInt5451++
    }

    public override fun method624(i: Int, i_560_: Int, i_561_: Int, i_562_: Int) {
        anInt5522++
        var i_563_ = 0
        while (anInt5478 > i_563_) {
            val i_564_ = 0xffff and aShortArray5486!![i_563_].toInt()
            var i_565_ = 0x3f and (i_564_ shr 10)
            var i_566_ = (i_564_ and 0x3f5) shr 7
            if (i != -1) i_565_ = (i_562_ * (i - i_565_) shr 7) + i_565_
            var i_567_ = i_564_ and 0x7f
            if (i_560_ != -1) i_566_ += (-i_566_ + i_560_) * i_562_ shr 7
            if (i_561_ != -1) i_567_ = ((-i_567_ + i_561_) * i_562_ shr 7) + i_567_
            aShortArray5486!![i_563_] = (Class273.method2057(Class273.method2057(i_565_ shl 10, i_566_ shl 7), i_567_)).toShort()
            i_563_++
        }
        if (aClass353Array5524 != null) {
            var i_568_ = 0
            while (anInt5406 > i_568_) {
                val class353 = aClass353Array5524!![i_568_]!!
                val class334 = aClass334Array5442!![i_568_]!!
                class334.anInt4156 = (class334.anInt4156 and 0xffffff.inv() or ((Class10.anIntArray179!![(aShortArray5486!![class353.anInt4342].toInt() and 0xffff)]) and 0xffffff))
                i_568_++
            }
        }
        method670(-107)
    }

    public override fun v() {
        anInt5425++
        for (i in 0..<anInt5433) anIntArray5429!![i] = -anIntArray5429!![i]
        run {
            var i = 0
            while (anInt5475 > i) {
                aShortArray5436!![i] = (-aShortArray5436!![i]).toShort()
                i++
            }
        }
        var i = 0
        while (anInt5478 > i) {
            val i_569_ = aShortArray5508!![i]
            aShortArray5508!![i] = aShortArray5512!![i]
            aShortArray5512!![i] = i_569_
            i++
        }
        method667(0)
        method673((-79).toByte())
        method674(-55)
        aBoolean5477 = false
    }

    public override fun aa(i: Short, i_570_: Short) {
        anInt5403++
        val var_d = aHa_Sub3_5419!!.aD4579
        var i_571_ = 0
        while (anInt5478 > i_571_) {
            if (i == aShortArray5423!![i_571_]) aShortArray5423!![i_571_] = i_570_
            i_571_++
        }
        var i_572_: Byte = 0
        var i_573_: Byte = 0
        if (i.toInt() != -1) {
            val class12 = var_d!!.method3(i.toInt() and 0xffff, -6662)
            i_573_ = class12!!.aByte216
            i_572_ = class12.aByte201
        }
        var i_574_: Byte = 0
        var i_575_: Byte = 0
        if (i_570_.toInt() != -1) {
            val class12 = var_d!!.method3(0xffff and i_570_.toInt(), -6662)
            i_575_ = class12!!.aByte216
            if (class12.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0) aBoolean5502 = true
            i_574_ = class12.aByte201
        }
        if ((i_575_ != i_573_) or (i_572_ != i_574_)) {
            if (aClass353Array5524 != null) {
                for (i_576_ in 0..<anInt5406) {
                    val class353 = aClass353Array5524!![i_576_]!!
                    val class334 = aClass334Array5442!![i_576_]!!
                    class334.anInt4156 = (class334.anInt4156 and 0xffffff.inv() or ((Class10.anIntArray179!![(aShortArray5486!![class353.anInt4342]).toInt() and 0xffff]) and 0xffffff))
                }
            }
            method670(-109)
        }
    }

    public override fun C(i: Int) {
        anInt5448++
        aShort5452 = i.toShort()
        method670(-89)
    }

    private fun method675(i: Int) {
        anInt5514++
        var i_577_ = 32767
        var i_578_ = 32767
        var i_579_ = 32767
        var i_580_ = -32768
        var i_581_ = -32768
        var i_582_ = -32768
        var i_583_ = 0
        var i_584_ = i
        for (i_585_ in 0..<anInt5433) {
            val i_586_ = anIntArray5511!![i_585_]
            val i_587_ = anIntArray5519!![i_585_]
            val i_588_ = anIntArray5429!![i_585_]
            if (i_586_ > i_580_) i_580_ = i_586_
            if (i_578_ > i_587_) i_578_ = i_587_
            if (i_587_ > i_581_) i_581_ = i_587_
            if (i_586_ < i_577_) i_577_ = i_586_
            if (i_579_ > i_588_) i_579_ = i_588_
            if (i_588_ > i_582_) i_582_ = i_588_
            var i_589_ = i_588_ * i_588_ + i_586_ * i_586_
            if (i_583_ < i_589_) i_583_ = i_589_
            i_589_ = i_587_ * i_587_ + i_586_ * i_586_ + i_588_ * i_588_
            if (i_589_ > i_584_) i_584_ = i_589_
        }
        anInt5461 = i_578_
        anInt5418 = i_579_
        anInt5507 = i_577_
        anInt5467 = i_580_
        anInt5509 = i_581_
        anInt5443 = i_582_
        anInt5510 = (sqrt(i_583_.toDouble()) + 0.99).toInt()
        anInt5401 = (sqrt(i_584_.toDouble()) + 0.99).toInt()
        aBoolean5477 = true
    }

    public override fun I(i: Int, `is`: IntArray, i_590_: Int, i_591_: Int, i_592_: Int, bool: Boolean, i_593_: Int, is_594_: IntArray?) {
        var i_590_ = i_590_
        var i_591_ = i_591_
        var i_592_ = i_592_
        try {
            anInt5521++
            val i_595_ = `is`!!.size
            if (i == 0) {
                i_590_ = i_590_ shl 4
                i_591_ = i_591_ shl 4
                i_592_ = i_592_ shl 4
                Class26.anInt386 = 0
                var i_596_ = 0
                Class346.anInt4274 = 0
                Class136.anInt4795 = 0
                var i_597_ = 0
                while (i_595_ > i_597_) {
                    val i_598_ = `is`[i_597_]
                    if (i_598_ < anIntArrayArray5413!!.size) {
                        val is_599_ = anIntArrayArray5413!![i_598_]!!
                        var i_600_ = 0
                        while (is_599_.size > i_600_) {
                            val i_601_ = is_599_[i_600_]
                            if (aShortArray5494 == null || (aShortArray5494!![i_601_].toInt() and i_593_) != 0) {
                                Class136.anInt4795 += anIntArray5511!![i_601_]
                                Class26.anInt386 += anIntArray5519!![i_601_]
                                Class346.anInt4274 += anIntArray5429!![i_601_]
                                i_596_++
                            }
                            i_600_++
                        }
                    }
                    i_597_++
                }
                if (i_596_ > 0) {
                    Class346.anInt4274 = Class346.anInt4274 / i_596_ - -i_592_
                    Class64_Sub3.aBoolean5609 = true
                    Class26.anInt386 = Class26.anInt386 / i_596_ + i_591_
                    Class136.anInt4795 = i_590_ + Class136.anInt4795 / i_596_
                } else {
                    Class346.anInt4274 = i_592_
                    Class136.anInt4795 = i_590_
                    Class26.anInt386 = i_591_
                }
            } else if (i == 1) {
                if (is_594_ != null) {
                    val i_602_ = (is_594_[0] * i_590_ - (-(is_594_[1] * i_591_) - (i_592_ * is_594_[2] + 8192)) shr 14)
                    val i_603_ = ((i_592_ * is_594_[5] + is_594_[3] * i_590_ - -(is_594_[4] * i_591_) - -8192) shr 14)
                    val i_604_ = ((8192 + is_594_[8] * i_592_ + is_594_[6] * i_590_ + i_591_ * is_594_[7]) shr 14)
                    i_592_ = i_604_
                    i_591_ = i_603_
                    i_590_ = i_602_
                }
                i_590_ = i_590_ shl 4
                i_592_ = i_592_ shl 4
                i_591_ = i_591_ shl 4
                for (i_605_ in 0..<i_595_) {
                    val i_606_ = `is`[i_605_]
                    if (anIntArrayArray5413!!.size > i_606_) {
                        val is_607_ = anIntArrayArray5413!![i_606_]!!
                        var i_608_ = 0
                        while (is_607_.size > i_608_) {
                            val i_609_ = is_607_[i_608_]
                            if (aShortArray5494 == null || (aShortArray5494!![i_609_].toInt() and i_593_) != 0) {
                                anIntArray5511!![i_609_] += i_590_
                                anIntArray5519!![i_609_] += i_591_
                                anIntArray5429!![i_609_] += i_592_
                            }
                            i_608_++
                        }
                    }
                }
            } else if (i == 2) {
                if (is_594_ == null) {
                    var i_658_ = 0
                    while (i_595_ > i_658_) {
                        val i_659_ = `is`[i_658_]
                        if (i_659_ < anIntArrayArray5413!!.size) {
                            val is_660_ = anIntArrayArray5413!![i_659_]!!
                            var i_661_ = 0
                            while (is_660_.size > i_661_) {
                                val i_662_ = is_660_[i_661_]
                                if (aShortArray5494 == null || ((aShortArray5494!![i_662_].toInt() and i_593_) != 0)) {
                                    anIntArray5511!![i_662_] -= Class136.anInt4795
                                    anIntArray5519!![i_662_] -= Class26.anInt386
                                    anIntArray5429!![i_662_] -= Class346.anInt4274
                                    if (i_592_ != 0) {
                                        val i_663_ = Class70.anIntArray1207!![i_592_]
                                        val i_664_ = Class70.anIntArray1204!![i_592_]
                                        val i_665_ = ((i_663_ * anIntArray5519!![i_662_] + ((i_664_ * anIntArray5511!![i_662_]) - -16383)) shr 14)
                                        anIntArray5519!![i_662_] = (-(anIntArray5511!![i_662_] * i_663_) + (anIntArray5519!![i_662_] * i_664_) - -16383) shr 14
                                        anIntArray5511!![i_662_] = i_665_
                                    }
                                    if (i_590_ != 0) {
                                        val i_666_ = Class70.anIntArray1207!![i_590_]
                                        val i_667_ = Class70.anIntArray1204!![i_590_]
                                        val i_668_ = ((16383 + ((i_667_ * anIntArray5519!![i_662_]) - i_666_ * (anIntArray5429!![i_662_]))) shr 14)
                                        anIntArray5429!![i_662_] = ((16383 + (i_667_ * anIntArray5429!![i_662_]) + (i_666_ * anIntArray5519!![i_662_])) shr 14)
                                        anIntArray5519!![i_662_] = i_668_
                                    }
                                    if (i_591_ != 0) {
                                        val i_669_ = Class70.anIntArray1207!![i_591_]
                                        val i_670_ = Class70.anIntArray1204!![i_591_]
                                        val i_671_ = ((16383 + (anIntArray5429!![i_662_] * i_669_) + (i_670_ * anIntArray5511!![i_662_])) shr 14)
                                        anIntArray5429!![i_662_] = (-(i_669_ * anIntArray5511!![i_662_]) + ((i_670_ * anIntArray5429!![i_662_]) - -16383)) shr 14
                                        anIntArray5511!![i_662_] = i_671_
                                    }
                                    anIntArray5511!![i_662_] += Class136.anInt4795
                                    anIntArray5519!![i_662_] += Class26.anInt386
                                    anIntArray5429!![i_662_] += Class346.anInt4274
                                }
                                i_661_++
                            }
                        }
                        i_658_++
                    }
                    if (bool) {
                        for (i_672_ in 0..<i_595_) {
                            val i_673_ = `is`[i_672_]
                            if (i_673_ < anIntArrayArray5413!!.size) {
                                val is_674_ = anIntArrayArray5413!![i_673_]!!
                                for (i_675_ in is_674_.indices) {
                                    val i_676_ = is_674_[i_675_]
                                    if (aShortArray5494 == null || ((aShortArray5494!![i_676_].toInt() and i_593_) != 0)) {
                                        val i_677_ = anIntArray5455!![i_676_]
                                        val i_678_ = anIntArray5455!![i_676_ - -1]
                                        var i_679_ = i_677_
                                        while ((i_679_ < i_678_)) {
                                            val i_680_ = -1 + aShortArray5439!![i_679_]
                                            if (i_680_ == -1) break
                                            if (i_592_ != 0) {
                                                val i_681_ = (Class70.anIntArray1207!![i_592_])
                                                val i_682_ = (Class70.anIntArray1204!![i_592_])
                                                val i_683_ = (((i_682_ * (aShortArray5493!![i_680_])) + (aShortArray5438!![i_680_]) * i_681_ - -16383) shr 14)
                                                aShortArray5438!![i_680_] = ((16383 + -((aShortArray5493!![i_680_]) * i_681_) + (i_682_ * (aShortArray5438!![i_680_]))) shr 14).toShort()
                                                aShortArray5493!![i_680_] = i_683_.toShort()
                                            }
                                            if (i_590_ != 0) {
                                                val i_684_ = (Class70.anIntArray1207!![i_590_])
                                                val i_685_ = (Class70.anIntArray1204!![i_590_])
                                                val i_686_ = ((16383 + ((aShortArray5438!![i_680_]) * i_685_ - ((aShortArray5436!![i_680_]) * i_684_))) shr 14)
                                                aShortArray5436!![i_680_] = (((i_684_ * (aShortArray5438!![i_680_])) + (i_685_ * (aShortArray5436!![i_680_])) - -16383) shr 14).toShort()
                                                aShortArray5438!![i_680_] = i_686_.toShort()
                                            }
                                            if (i_591_ != 0) {
                                                val i_687_ = (Class70.anIntArray1207!![i_591_])
                                                val i_688_ = (Class70.anIntArray1204!![i_591_])
                                                val i_689_ = ((16383 + ((aShortArray5436!![i_680_]) * i_687_ + (i_688_ * (aShortArray5493!![i_680_])))) shr 14)
                                                aShortArray5436!![i_680_] = (((i_688_ * (aShortArray5436!![i_680_])) + (-(i_687_ * (aShortArray5493!![i_680_])) - -16383)) shr 14).toShort()
                                                aShortArray5493!![i_680_] = i_689_.toShort()
                                            }
                                            i_679_++
                                        }
                                    }
                                }
                            }
                        }
                        method673((-82).toByte())
                    }
                } else {
                    val i_610_ = is_594_[9] shl 4
                    val i_611_ = is_594_[10] shl 4
                    val i_612_ = is_594_[11] shl 4
                    val i_613_ = is_594_[12] shl 4
                    val i_614_ = is_594_[13] shl 4
                    val i_615_ = is_594_[14] shl 4
                    if (Class64_Sub3.aBoolean5609) {
                        var i_616_ = ((is_594_[6] * Class346.anInt4274 + (Class136.anInt4795 * is_594_[0] - -(Class26.anInt386 * is_594_[3])) + 8192) shr 14)
                        var i_617_ = ((is_594_[7] * Class346.anInt4274 + (is_594_[1] * Class136.anInt4795 - -(is_594_[4] * Class26.anInt386) + 8192)) shr 14)
                        i_616_ += i_613_
                        var i_618_ = ((8192 + Class346.anInt4274 * is_594_[8] + Class136.anInt4795 * is_594_[2] + Class26.anInt386 * is_594_[5]) shr 14)
                        i_617_ += i_614_
                        i_618_ += i_615_
                        Class136.anInt4795 = i_616_
                        Class26.anInt386 = i_617_
                        Class64_Sub3.aBoolean5609 = false
                        Class346.anInt4274 = i_618_
                    }
                    val is_619_ = IntArray(9)
                    val i_620_ = Class70.anIntArray1204!![i_590_]
                    val i_621_ = Class70.anIntArray1207!![i_590_]
                    val i_622_ = Class70.anIntArray1204!![i_591_]
                    val i_623_ = Class70.anIntArray1207!![i_591_]
                    val i_624_ = Class70.anIntArray1204!![i_592_]
                    val i_625_ = Class70.anIntArray1207!![i_592_]
                    val i_626_ = i_621_ * i_624_ + 8192 shr 14
                    val i_627_ = 8192 + i_621_ * i_625_ shr 14
                    is_619_[5] = -i_621_
                    is_619_[4] = 8192 + i_620_ * i_624_ shr 14
                    is_619_[1] = (8192 + -i_622_ * i_625_ + i_623_ * i_626_ shr 14)
                    is_619_[6] = (8192 + -i_623_ * i_624_ + i_627_ * i_622_ shr 14)
                    is_619_[7] = (i_625_ * i_623_ - (-(i_622_ * i_626_) - 8192) shr 14)
                    is_619_[0] = (8192 + (i_627_ * i_623_ + i_624_ * i_622_) shr 14)
                    is_619_[2] = i_620_ * i_623_ + 8192 shr 14
                    is_619_[8] = i_622_ * i_620_ + 8192 shr 14
                    is_619_[3] = 8192 + i_625_ * i_620_ shr 14
                    val i_628_ = ((-Class346.anInt4274 * is_619_[2] + is_619_[1] * -Class26.anInt386 + (is_619_[0] * -Class136.anInt4795 + 8192)) shr 14)
                    val i_629_ = ((8192 + -Class346.anInt4274 * is_619_[5] + (-Class136.anInt4795 * is_619_[3] - -(is_619_[4] * -Class26.anInt386))) shr 14)
                    val i_630_ = ((8192 + -Class346.anInt4274 * is_619_[8] + (-Class136.anInt4795 * is_619_[6] + -Class26.anInt386 * is_619_[7])) shr 14)
                    val i_631_ = Class136.anInt4795 + i_628_
                    val i_632_ = i_629_ + Class26.anInt386
                    val i_633_ = i_630_ - -Class346.anInt4274
                    val is_634_ = IntArray(9)
                    for (i_635_ in 0..2) {
                        for (i_636_ in 0..2) {
                            var i_637_ = 0
                            for (i_638_ in 0..2) i_637_ += (is_594_[i_636_ * 3 - -i_638_] * is_619_[3 * i_635_ - -i_638_])
                            is_634_[3 * i_635_ - -i_636_] = 8192 + i_637_ shr 14
                        }
                    }
                    var i_639_ = ((is_619_[2] * i_615_ + is_619_[0] * i_613_ - (-(i_614_ * is_619_[1]) + -8192)) shr 14)
                    var i_640_ = ((8192 + is_619_[4] * i_614_ + (is_619_[3] * i_613_ - -(i_615_ * is_619_[5]))) shr 14)
                    i_639_ += i_631_
                    var i_641_ = (i_615_ * is_619_[8] + (is_619_[6] * i_613_ + (is_619_[7] * i_614_ + 8192)) shr 14)
                    i_640_ += i_632_
                    i_641_ += i_633_
                    val is_642_ = IntArray(9)
                    for (i_643_ in 0..2) {
                        for (i_644_ in 0..2) {
                            var i_645_ = 0
                            for (i_646_ in 0..2) i_645_ += (is_594_[i_646_ + 3 * i_643_] * is_634_[3 * i_646_ + i_644_])
                            is_642_[3 * i_643_ - -i_644_] = i_645_ - -8192 shr 14
                        }
                    }
                    var i_647_ = ((i_640_ * is_594_[1] + (is_594_[0] * i_639_ - -(i_641_ * is_594_[2])) - -8192) shr 14)
                    var i_648_ = (8192 + is_594_[5] * i_641_ + (is_594_[4] * i_640_ + i_639_ * is_594_[3]) shr 14)
                    var i_649_ = ((is_594_[7] * i_640_ + is_594_[6] * i_639_ - -(i_641_ * is_594_[8]) - -8192) shr 14)
                    i_647_ += i_610_
                    i_648_ += i_611_
                    i_649_ += i_612_
                    var i_650_ = 0
                    while (i_595_ > i_650_) {
                        val i_651_ = `is`[i_650_]
                        if (i_651_ < anIntArrayArray5413!!.size) {
                            val is_652_ = anIntArrayArray5413!![i_651_]!!
                            for (i_653_ in is_652_.indices) {
                                val i_654_ = is_652_[i_653_]
                                if (aShortArray5494 == null || (i_593_ and aShortArray5494!![i_654_].toInt()) != 0) {
                                    var i_655_ = ((8192 + (anIntArray5519!![i_654_] * is_642_[1]) + ((anIntArray5511!![i_654_] * is_642_[0]) - -(is_642_[2] * anIntArray5429!![i_654_]))) shr 14)
                                    var i_656_ = ((8192 + (is_642_[3] * anIntArray5511!![i_654_]) + ((is_642_[4] * anIntArray5519!![i_654_]) + (anIntArray5429!![i_654_] * is_642_[5]))) shr 14)
                                    i_655_ += i_647_
                                    var i_657_ = ((8192 + ((is_642_[6] * anIntArray5511!![i_654_]) + (anIntArray5519!![i_654_] * is_642_[7])) + (anIntArray5429!![i_654_] * is_642_[8])) shr 14)
                                    i_656_ += i_648_
                                    i_657_ += i_649_
                                    anIntArray5511!![i_654_] = i_655_
                                    anIntArray5519!![i_654_] = i_656_
                                    anIntArray5429!![i_654_] = i_657_
                                }
                            }
                        }
                        i_650_++
                    }
                }
            } else if (i == 3) {
                if (is_594_ == null) {
                    var i_690_ = 0
                    while (i_595_ > i_690_) {
                        val i_691_ = `is`[i_690_]
                        if (anIntArrayArray5413!!.size > i_691_) {
                            val is_692_ = anIntArrayArray5413!![i_691_]!!
                            var i_693_ = 0
                            while (is_692_.size > i_693_) {
                                val i_694_ = is_692_[i_693_]
                                if (aShortArray5494 == null || ((i_593_ and aShortArray5494!![i_694_].toInt()) != 0)) {
                                    anIntArray5511!![i_694_] -= Class136.anInt4795
                                    anIntArray5519!![i_694_] -= Class26.anInt386
                                    anIntArray5429!![i_694_] -= Class346.anInt4274
                                    anIntArray5511!![i_694_] = (i_590_ * anIntArray5511!![i_694_] shr 7)
                                    anIntArray5519!![i_694_] = (anIntArray5519!![i_694_] * i_591_ shr 7)
                                    anIntArray5429!![i_694_] = (i_592_ * anIntArray5429!![i_694_] shr 7)
                                    anIntArray5511!![i_694_] += Class136.anInt4795
                                    anIntArray5519!![i_694_] += Class26.anInt386
                                    anIntArray5429!![i_694_] += Class346.anInt4274
                                }
                                i_693_++
                            }
                        }
                        i_690_++
                    }
                } else {
                    val i_695_ = is_594_[9] shl 4
                    val i_696_ = is_594_[10] shl 4
                    val i_697_ = is_594_[11] shl 4
                    val i_698_ = is_594_[12] shl 4
                    val i_699_ = is_594_[13] shl 4
                    val i_700_ = is_594_[14] shl 4
                    if (Class64_Sub3.aBoolean5609) {
                        var i_701_ = ((Class346.anInt4274 * is_594_[6] + (Class136.anInt4795 * is_594_[0] + (is_594_[3] * Class26.anInt386 + 8192))) shr 14)
                        var i_702_ = (8192 + (Class136.anInt4795 * is_594_[1] + (Class26.anInt386 * is_594_[4] - -(is_594_[7] * Class346.anInt4274))) shr 14)
                        i_701_ += i_698_
                        i_702_ += i_699_
                        var i_703_ = ((8192 + is_594_[2] * Class136.anInt4795 - -(is_594_[5] * Class26.anInt386) - -(Class346.anInt4274 * is_594_[8])) shr 14)
                        i_703_ += i_700_
                        Class136.anInt4795 = i_701_
                        Class26.anInt386 = i_702_
                        Class64_Sub3.aBoolean5609 = false
                        Class346.anInt4274 = i_703_
                    }
                    val i_704_ = i_590_ shl 15 shr 7
                    val i_705_ = i_591_ shl 15 shr 7
                    val i_706_ = i_592_ shl 15 shr 7
                    val i_707_ = -Class136.anInt4795 * i_704_ + 8192 shr 14
                    val i_708_ = 8192 + -Class26.anInt386 * i_705_ shr 14
                    val i_709_ = 8192 + -Class346.anInt4274 * i_706_ shr 14
                    val i_710_ = i_707_ + Class136.anInt4795
                    val i_711_ = i_708_ + Class26.anInt386
                    val i_712_ = Class346.anInt4274 + i_709_
                    val is_713_ = IntArray(9)
                    is_713_[0] = 8192 + i_704_ * is_594_[0] shr 14
                    is_713_[1] = is_594_[3] * i_704_ + 8192 shr 14
                    is_713_[2] = 8192 + is_594_[6] * i_704_ shr 14
                    is_713_[6] = i_706_ * is_594_[2] + 8192 shr 14
                    is_713_[5] = i_705_ * is_594_[7] - -8192 shr 14
                    is_713_[3] = 8192 + i_705_ * is_594_[1] shr 14
                    is_713_[4] = i_705_ * is_594_[4] - -8192 shr 14
                    is_713_[7] = i_706_ * is_594_[5] - -8192 shr 14
                    is_713_[8] = 8192 + i_706_ * is_594_[8] shr 14
                    var i_714_ = i_698_ * i_704_ + 8192 shr 14
                    var i_715_ = i_699_ * i_705_ - -8192 shr 14
                    i_714_ += i_710_
                    var i_716_ = 8192 + i_706_ * i_700_ shr 14
                    i_715_ += i_711_
                    i_716_ += i_712_
                    val is_717_ = IntArray(9)
                    for (i_718_ in 0..2) {
                        for (i_719_ in 0..2) {
                            var i_720_ = 0
                            for (i_721_ in 0..2) i_720_ += (is_713_[i_719_ - -(3 * i_721_)] * is_594_[i_721_ + i_718_ * 3])
                            is_717_[i_718_ * 3 - -i_719_] = i_720_ + 8192 shr 14
                        }
                    }
                    var i_722_ = ((i_715_ * is_594_[1] + i_714_ * is_594_[0] + is_594_[2] * i_716_ - -8192) shr 14)
                    var i_723_ = (i_716_ * is_594_[5] + (is_594_[3] * i_714_ - -(i_715_ * is_594_[4]) - -8192) shr 14)
                    var i_724_ = (i_714_ * is_594_[6] + (i_715_ * is_594_[7] + is_594_[8] * i_716_ + 8192) shr 14)
                    i_723_ += i_696_
                    i_722_ += i_695_
                    i_724_ += i_697_
                    var i_725_ = 0
                    while (i_595_ > i_725_) {
                        val i_726_ = `is`[i_725_]
                        if (anIntArrayArray5413!!.size > i_726_) {
                            val is_727_ = anIntArrayArray5413!![i_726_]!!
                            for (i_728_ in is_727_.indices) {
                                val i_729_ = is_727_[i_728_]
                                if (aShortArray5494 == null || ((i_593_ and aShortArray5494!![i_729_].toInt()) != 0)) {
                                    var i_730_ = ((is_717_[1] * anIntArray5519!![i_729_] + (anIntArray5511!![i_729_] * is_717_[0]) - (-(anIntArray5429!![i_729_] * is_717_[2]) - 8192)) shr 14)
                                    var i_731_ = ((8192 + ((is_717_[5] * anIntArray5429!![i_729_]) + (is_717_[4] * anIntArray5519!![i_729_]) + (is_717_[3] * anIntArray5511!![i_729_]))) shr 14)
                                    i_731_ += i_723_
                                    i_730_ += i_722_
                                    var i_732_ = ((anIntArray5519!![i_729_] * is_717_[7] + ((anIntArray5511!![i_729_] * is_717_[6]) - (-(is_717_[8] * anIntArray5429!![i_729_]) - 8192))) shr 14)
                                    anIntArray5511!![i_729_] = i_730_
                                    i_732_ += i_724_
                                    anIntArray5519!![i_729_] = i_731_
                                    anIntArray5429!![i_729_] = i_732_
                                }
                            }
                        }
                        i_725_++
                    }
                }
            } else if (i == 5) {
                if (anIntArrayArray5492 != null) {
                    var bool_733_ = false
                    var i_734_ = 0
                    while (i_595_ > i_734_) {
                        val i_735_ = `is`[i_734_]
                        if (anIntArrayArray5492!!.size > i_735_) {
                            val is_736_ = anIntArrayArray5492!![i_735_]!!
                            var i_737_ = 0
                            while ((i_737_ < is_736_.size)) {
                                val i_738_ = is_736_[i_737_]
                                if (aShortArray5432 == null || (aShortArray5432!![i_738_].toInt() and i_593_) != 0) {
                                    var i_739_ = ((aByteArray5515!![i_738_].toInt() and 0xff) - -(8 * i_590_))
                                    if (i_739_ < 0) i_739_ = 0
                                    else if (i_739_ > 255) i_739_ = 255
                                    aByteArray5515!![i_738_] = i_739_.toByte()
                                }
                                i_737_++
                            }
                            bool_733_ = bool_733_ or (is_736_.size > 0)
                        }
                        i_734_++
                    }
                    if (bool_733_) {
                        if (aClass353Array5524 != null) {
                            for (i_740_ in 0..<anInt5406) {
                                val class353 = aClass353Array5524!![i_740_]!!
                                val class334 = aClass334Array5442!![i_740_]!!
                                class334.anInt4156 = ((-(0xff and (aByteArray5515!![(class353.anInt4342)]).toInt()) + 255 shl 24) or (class334.anInt4156 and 0xffffff))
                            }
                        }
                        method670(-126)
                    }
                }
            } else if (i == 7) {
                if (anIntArrayArray5492 != null) {
                    var bool_741_ = false
                    var i_742_ = 0
                    while (i_595_ > i_742_) {
                        val i_743_ = `is`[i_742_]
                        if (anIntArrayArray5492!!.size > i_743_) {
                            val is_744_ = anIntArrayArray5492!![i_743_]!!
                            var i_745_ = 0
                            while (is_744_.size > i_745_) {
                                val i_746_ = is_744_[i_745_]
                                if (aShortArray5432 == null || ((aShortArray5432!![i_746_].toInt() and i_593_) != 0)) {
                                    val i_747_ = 0xffff and aShortArray5486!![i_746_].toInt()
                                    var i_748_ = (i_747_ and 0xfdd5) shr 10
                                    var i_749_ = i_747_ shr 7 and 0x7
                                    i_749_ += i_591_ / 4
                                    i_748_ = 0x3f and i_590_ + i_748_
                                    var i_750_ = i_747_ and 0x7f
                                    if (i_749_ >= 0) {
                                        if (i_749_ > 7) i_749_ = 7
                                    } else i_749_ = 0
                                    i_750_ += i_592_
                                    if (i_750_ >= 0) {
                                        if (i_750_ > 127) i_750_ = 127
                                    } else i_750_ = 0
                                    aShortArray5486!![i_746_] = (Class273.method2057((Class273.method2057(i_749_ shl 7, i_748_ shl 10)), i_750_)).toShort()
                                }
                                i_745_++
                            }
                            bool_741_ = (bool_741_ or (is_744_.size > 0))
                        }
                        i_742_++
                    }
                    if (bool_741_) {
                        if (aClass353Array5524 != null) {
                            var i_751_ = 0
                            while (anInt5406 > i_751_) {
                                val class353 = aClass353Array5524!![i_751_]!!
                                val class334 = aClass334Array5442!![i_751_]!!
                                class334.anInt4156 = ((class334.anInt4156 and 0xffffff.inv()) or (0xffffff and (Class10.anIntArray179!![0xffff and (aShortArray5486!![(class353.anInt4342)]).toInt()])))
                                i_751_++
                            }
                        }
                        method670(-90)
                    }
                }
            } else if (i == 8) {
                if (anIntArrayArray5412 != null) {
                    var i_752_ = 0
                    while (i_595_ > i_752_) {
                        val i_753_ = `is`[i_752_]
                        if (i_753_ < anIntArrayArray5412!!.size) {
                            val is_754_ = anIntArrayArray5412!![i_753_]!!
                            var i_755_ = 0
                            while ((i_755_ < is_754_.size)) {
                                val class334 = aClass334Array5442!![is_754_[i_755_]]!!
                                class334.anInt4158 += i_590_
                                class334.anInt4154 += i_591_
                                i_755_++
                            }
                        }
                        i_752_++
                    }
                }
            } else if (i == 10) {
                if (anIntArrayArray5412 != null) {
                    var i_756_ = 0
                    while (i_595_ > i_756_) {
                        val i_757_ = `is`[i_756_]
                        if (anIntArrayArray5412!!.size > i_757_) {
                            val is_758_ = anIntArrayArray5412!![i_757_]!!
                            var i_759_ = 0
                            while ((i_759_ < is_758_.size)) {
                                val class334 = aClass334Array5442!![is_758_[i_759_]]!!
                                class334.anInt4162 = (i_591_ * class334.anInt4162 shr 7)
                                class334.anInt4165 = (i_590_ * class334.anInt4165 shr 7)
                                i_759_++
                            }
                        }
                        i_756_++
                    }
                }
            } else if (i == 9) {
                if (anIntArrayArray5412 != null) {
                    for (i_760_ in 0..<i_595_) {
                        val i_761_ = `is`[i_760_]
                        if (anIntArrayArray5412!!.size > i_761_) {
                            val is_762_ = anIntArrayArray5412!![i_761_]!!
                            var i_763_ = 0
                            while ((is_762_.size > i_763_)) {
                                val class334 = aClass334Array5442!![is_762_[i_763_]]!!
                                class334.anInt4151 = 0x3fff and i_590_ + (class334.anInt4151)
                                i_763_++
                            }
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.I(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_590_ + ',' + i_591_ + ',' + i_592_ + ',' + bool + ',' + i_593_ + ',' + (if (is_594_ != null) "{...}" else "null") + ')'))
        }
    }

    init {
        try {
            anInt5463 = i
            aBoolean5462 = bool_765_
            anInt5472 = i_764_
            aHa_Sub3_5419 = var_ha_Sub3
            if (bool || Class161.method1258(anInt5463, -9301, anInt5472)) aClass290_5520 = Class290(Class264.method2015(anInt5463, anInt5472, 7))
            if (bool || method1837(anInt5472, 102, anInt5463)) aClass290_5460 = Class290(Class183.method1379(4, anInt5472, anInt5463))
            if (bool || Class296.method2224(anInt5463, 110.toByte(), anInt5472)) aClass290_5482 = Class290(Class348_Sub42_Sub8_Sub2.method3200(anInt5463, anInt5472, (-82).toByte()))
            if (bool || Class188.method1412((-35).toByte(), anInt5472, anInt5463)) aClass290_5424 = Class290(Class126.method1113(anInt5463, anInt5472, -21))
            if (bool || method3563(anInt5463, 56.toByte(), anInt5472)) aClass192_5485 = Class192(Class348_Sub9.method2783(anInt5472, (-97).toByte(), anInt5463))
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nca.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_764_ + ',' + bool + ',' + bool_765_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt5403: Int = 0
        @JvmField
        var anInt5405: Int = 0
        @JvmField
        var anInt5407: Int = 0
        @JvmField
        var anInt5408: Int = 0
        @JvmField
        var anInt5409: Int = 0
        @JvmField
        var anInt5410: Int = 0
        @JvmField
        var anInt5411: Int = 0
        @JvmField
        var anInt5414: Int = 0
        @JvmField
        var anInt5417: Int = 0
        var aString5420: String? = null
        @JvmField
        var anInt5421: Int = 0
        @JvmField
        var anInt5422: Int = 0
        @JvmField
        var anInt5425: Int = 0
        @JvmField
        var anInt5426: Int = 0
        @JvmField
        var anInt5430: Int = 0
        @JvmField
        var anInt5431: Int = 0
        @JvmField
        var anInt5434: Int = 0
        @JvmField
        var anInt5435: Int = 0
        @JvmField
        var anInt5437: Int = 0
        @JvmField
        var anInt5440: Int = 0
        @JvmField
        var anInt5441: Int = 0
        @JvmField
        var anInt5444: Int = 0
        @JvmField
        var anInt5445: Int = 0
        @JvmField
        var anInt5446: Int = 0
        @JvmField
        var anInt5447: Int = 0
        @JvmField
        var anInt5448: Int = 0
        @JvmField
        var anInt5449: Int = 0
        @JvmField
        var anInt5450: Int = 0
        @JvmField
        var anInt5451: Int = 0
        @JvmField
        var anInt5453: Int = 0
        @JvmField
        var anInt5454: Int = 0
        @JvmField
        var anInt5456: Int = 0
        @JvmField
        var anInt5458: Int = 0
        @JvmField
        var anInt5459: Int = 0
        @JvmField
        var anInt5464: Int = 0
        @JvmField
        var anInt5465: Int = 0
        @JvmField
        var anInt5466: Int = 0
        @JvmField
        var anInt5468: Int = 0
        @JvmField
        var anInt5469: Int = 0
        @JvmField
        var anInt5471: Int = 0
        @JvmField
        var anInt5479: Int = 0
        @JvmField
        var anInt5480: Int = 0
        @JvmField
        var anInt5481: Int = 0
        @JvmField
        var anInt5483: Int = 0
        @JvmField
        var anInt5484: Int = 0
        @JvmField
        var anInt5487: Int = 0
        @JvmField
        var anInt5488: Int = 0
        @JvmField
        var anInt5489: Int = 0
        @JvmField
        var anInt5490: Int = 0
        @JvmField
        var anInt5491: Int = 0
        @JvmField
        var anInt5496: Int = 0
        @JvmField
        var anInt5498: Int = 0
        @JvmField
        var anInt5500: Int = 0
        @JvmField
        var anInt5501: Int = 0
        @JvmField
        var anInt5504: Int = 0
        @JvmField
        var anInt5505: Int = 0
        @JvmField
        var anInt5513: Int = 0
        @JvmField
        var anInt5514: Int = 0
        @JvmField
        var anInt5517: Int = 0
        @JvmField
        var anInt5518: Int = 0
        @JvmField
        var anInt5521: Int = 0
        @JvmField
        var anInt5522: Int = 0
        @JvmField
        var anInt5523: Int = 0
        @JvmField
        var anInt5525: Int = 0
        @JvmField
        var anInt5526: Int = 0

        @JvmStatic
        fun method661(i: Byte) {
            anInt5466++
            var class348_sub42_sub13 = (Class233.aClass107_3022!!.method1011(-93) as Class348_Sub42_Sub13?)
            while (class348_sub42_sub13 != null) {
                if (class348_sub42_sub13.anInt9615 > 1) {
                    class348_sub42_sub13.anInt9615 = 0
                    Class259.aClass60_3301!!.method582(class348_sub42_sub13, (class348_sub42_sub13.aClass107_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as Class348_Sub42_Sub12).aLong9600, (-124).toByte())
                    class348_sub42_sub13.aClass107_9621.method1009(2110355138)
                }
                class348_sub42_sub13 = (Class233.aClass107_3022!!.method1003(46.toByte()) as Class348_Sub42_Sub13?)
            }
            Class8.anInt166 = 0
            if (i < 92) method661(114.toByte())
            Class73.anInt4776 = 0
            Class348_Sub40_Sub4.aClass262_9111!!.method1996(115)
            Class348_Sub42_Sub12.aClass356_9603!!.method3481(0)
            Class233.aClass107_3022!!.method1009(2110355138)
            method3743(6.toByte(), Class348_Sub40_Sub7.aClass348_Sub42_Sub12_9144)
        }

        @JvmStatic
        fun method676(i: Int) {
            aString5420 = null
            if (i <= 11) Companion.method661((-43).toByte())
        }
    }
}
