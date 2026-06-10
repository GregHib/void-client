import Class285_Sub1.Companion.method2131
import jaggl.OpenGL.Companion.glCopyTexSubImage3D
import jaggl.OpenGL.Companion.glFlush
import jaggl.OpenGL.Companion.glFramebufferTexture3DEXT
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage3Dub

class Class258_Sub1 : Class258 {
    @JvmField
    var anInt8522: Int = 0
    @JvmField
    var anInt8523: Int = 0
    private var anInt8525 = -1
    private var anInt8528 = -1
    @JvmField
    var anInt8529: Int = 0

    fun method1958(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
        this.aHa_Sub2_4851.method3771((-110).toByte(), this)
        anInt8526++
        glCopyTexSubImage3D(this.anInt4849, 0, i_2_, i_6_, i_4_, i_3_, i_0_, i_1_, i_5_)
        glFlush()
        if (i != -26823) aClass143_8527 = null
    }

    override fun method37(i: Int) {
        anInt8524++
        glFramebufferTexture3DEXT(anInt8528, anInt8525, this.anInt4849, 0, 0, 0)
        anInt8525 = -1
        if (i != -3022) method1960(112, -107, -46, -98, null, null, null, null, null, null, -114, 75.toByte(), -105, 62, true, false, 110, -31, true)
        anInt8528 = -1
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_7_: Int, i_8_: Int, i_9_: Int, `is`: ByteArray?, i_10_: Int) : super(var_ha_Sub2, 32879, i, i_7_ * (i_8_ * i_9_), false) {
        try {
            this.anInt8523 = i_7_
            this.anInt8522 = i_9_
            this.anInt8529 = i_8_
            this.aHa_Sub2_4851.method3771((-84).toByte(), this)
            glPixelStorei(3317, 1)
            glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, i_10_, 5121, `is`, 0)
            glPixelStorei(3317, 4)
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("gj.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_10_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_49_: Int, i_50_: Int, i_51_: Int) : super(var_ha_Sub2, 32879, i, i_51_ * i_49_ * i_50_, false) {
        this.anInt8523 = i_49_
        this.anInt8529 = i_50_
        this.anInt8522 = i_51_
        this.aHa_Sub2_4851.method3771((-123).toByte(), this)
        glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, Class348_Sub9.method2779(true, (this.anInt4858)), 5121, null, 0)
        this.method1957(9728, true)
    }

    companion object {
        @JvmField
        var anInt8524: Int = 0
        @JvmField
        var anInt8526: Int = 0
        @JvmField
        var aClass143_8527: Class143? = null
        @JvmStatic
        fun method1959(i: Int) {
            val i_11_ = -121 / ((-52 - i) / 60)
            aClass143_8527 = null
        }

        @JvmStatic
        fun method1960(i: Int, i_12_: Int, i_13_: Int, i_14_: Int, `is`: Array<Array<ByteArray?>?>?, is_15_: IntArray?, is_16_: IntArray?, is_17_: IntArray?, is_18_: IntArray?, is_19_: IntArray?, i_20_: Int, i_21_: Byte, i_22_: Int, i_23_: Int, bool: Boolean, bool_24_: Boolean, i_25_: Int, i_26_: Int, bool_27_: Boolean) {
            Class23.aBoolean351 = true
            Class318_Sub1_Sub3_Sub3.aBoolean10221 = Class9.aHa171!!.method3704() > 0
            Class348_Sub40_Sub17.aBoolean9242 = bool_24_
            Class239_Sub25.anInt6111 = i_12_ shr Class362.anInt4459
            Class285_Sub2.anInt8502 = i_14_ shr Class362.anInt4459
            Class141.anInt1974 = i_12_
            Class348_Sub40_Sub27.anInt9360 = i_14_
            Class232.anInt3006 = i_13_
            Class37.anInt492 = Class239_Sub25.anInt6111 - Class318_Sub1_Sub4_Sub1.anInt10084
            if (Class37.anInt492 < 0) {
                Class105_Sub1.anInt8412 = -Class37.anInt492
                Class37.anInt492 = 0
            } else Class105_Sub1.anInt8412 = 0
            Class348_Sub34.anInt6974 = Class285_Sub2.anInt8502 - Class318_Sub1_Sub4_Sub1.anInt10084
            if (Class348_Sub34.anInt6974 < 0) {
                Class240.anInt4686 = -Class348_Sub34.anInt6974
                Class348_Sub34.anInt6974 = 0
            } else Class240.anInt4686 = 0
            Class27.anInt387 = Class239_Sub25.anInt6111 + Class318_Sub1_Sub4_Sub1.anInt10084
            if (Class27.anInt387 > Class318_Sub7.anInt6451) Class27.anInt387 = Class318_Sub7.anInt6451
            Class59_Sub1.anInt5293 = Class285_Sub2.anInt8502 + Class318_Sub1_Sub4_Sub1.anInt10084
            if (Class59_Sub1.anInt5293 > Class348_Sub41.anInt7054) Class59_Sub1.anInt5293 = Class348_Sub41.anInt7054
            val bools = Class99.aBooleanArrayArray1572
            val bools_28_ = Class348_Sub8.aBooleanArrayArray6656
            if (Class348_Sub40_Sub17.aBoolean9242) {
                for (i_29_ in 0..<(Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 2)) {
                    var i_30_ = 0
                    var i_31_ = 0
                    for (i_32_ in 0..<(Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 2)) {
                        if (i_32_ > 1) Class171.anIntArray2272!![i_32_ - 2] = i_30_
                        i_30_ = i_31_
                        val i_33_ = (Class239_Sub25.anInt6111 - Class318_Sub1_Sub4_Sub1.anInt10084 + i_29_)
                        val i_34_ = (Class285_Sub2.anInt8502 - Class318_Sub1_Sub4_Sub1.anInt10084 + i_32_)
                        if (i_33_ >= 0 && i_34_ >= 0 && i_33_ < Class318_Sub7.anInt6451 && i_34_ < Class348_Sub41.anInt7054) {
                            val i_35_ = i_33_ shl Class362.anInt4459
                            val i_36_ = i_34_ shl Class362.anInt4459
                            val i_37_ = (Class348_Sub1_Sub1.aSArray8801!![Class348_Sub1_Sub1.aSArray8801!!.size - 1]!!.method3982((-86).toByte(), i_34_, i_33_) - (1000 shl Class362.anInt4459 - 7))
                            val i_38_ = (if (Class332.aSArray4142 != null) (Class332.aSArray4142!![0]!!.method3982((-86).toByte(), i_34_, i_33_) + Class270.anInt3465) else (Class348_Sub1_Sub1.aSArray8801!![0]!!.method3982((-86).toByte(), i_34_, i_33_) + Class270.anInt3465))
                            i_31_ = (if (i_25_ >= 0) Class9.aHa171!!.r(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_, i_25_) else Class9.aHa171!!.JA(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_))
                            Class348_Sub8.aBooleanArrayArray6656!![i_29_]!![i_32_] = i_31_ == 0
                        } else {
                            i_31_ = -1
                            Class348_Sub8.aBooleanArrayArray6656!![i_29_]!![i_32_] = false
                        }
                        if (i_29_ > 0 && i_32_ > 0) {
                            val i_39_ = (Class171.anIntArray2272!![i_32_ - 1] and Class171.anIntArray2272!![i_32_] and i_30_ and i_31_)
                            Class99.aBooleanArrayArray1572!![i_29_ - 1]!![i_32_ - 1] = i_39_ == 0
                        }
                    }
                    Class171.anIntArray2272!![(Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084)] = i_30_
                    Class171.anIntArray2272!![(Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 1)] = i_31_
                }
                if (i_25_ >= 0) Class23.aBoolean351 = false
                else {
                    Player.anIntArray10566 = is_15_
                    Class250.anIntArray3220 = is_16_
                    Class59_Sub1_Sub2.anIntArray8666 = is_17_
                    Class299_Sub2_Sub1.anIntArray8712 = is_18_
                    Client.anIntArray5176 = is_19_
                    Class348_Sub42_Sub14.method3241(i_20_, 39.toByte(), Class9.aHa171!!)
                }
            } else {
                if (Class369_Sub3.aBooleanArrayArray8596 == null) Class369_Sub3.aBooleanArrayArray8596 = (Array<BooleanArray?>(Class318_Sub7.anInt6451 + Class318_Sub7.anInt6451 + 1) { BooleanArray((Class348_Sub41.anInt7054 + Class318_Sub7.anInt6451 + 1)) })
                for (i_40_ in Class369_Sub3.aBooleanArrayArray8596!!.indices) {
                    for (i_41_ in Class369_Sub3.aBooleanArrayArray8596!![0]!!.indices) Class369_Sub3.aBooleanArrayArray8596!![i_40_]!![i_41_] = true
                }
                Class348_Sub8.aBooleanArrayArray6656 = Class369_Sub3.aBooleanArrayArray8596
                Class99.aBooleanArrayArray1572 = Class369_Sub3.aBooleanArrayArray8596!!
                Class37.anInt492 = 0
                Class348_Sub34.anInt6974 = 0
                Class27.anInt387 = Class318_Sub7.anInt6451
                Class59_Sub1.anInt5293 = Class348_Sub41.anInt7054
                Class23.aBoolean351 = false
            }
            Class243.method1877(Class9.aHa171, -69)
            if (!Class71.aClass76_1208!!.aBoolean1283) {
                val class243 = Class71.aClass76_1208!!.aClass243_1282
                var class318_sub4 = class243.method1872(8) as Class318_Sub4?
                while (class318_sub4 != null) {
                    class318_sub4.method2373(false)
                    Class59_Sub1_Sub1.method560(class318_sub4, 6)
                    class318_sub4 = class243.method1878(125.toByte()) as Class318_Sub4?
                }
            }
            if (Class318_Sub1_Sub3_Sub3.aBoolean10221) {
                for (i_42_ in 0..<Class331.anInt4135) Class239_Sub14.aClass211Array5993!![i_42_]!!.method1544(8688, bool, i)
            }
            if (Class348_Sub40_Sub5.aBoolean9121) {
                Class52.anIntArray4906 = Class9.aHa171!!.Y()
                Class9.aHa171!!.K(Class348_Sub40_Sub10.anIntArray9183)
                val i_43_ = ((Class348_Sub40_Sub10.anIntArray9183!![2] - Class348_Sub40_Sub10.anIntArray9183!![0]) / Class75_Sub1.anInt5652)
                for (i_44_ in 0..<Class75_Sub1.anInt5652 - 1) Class17.anIntArray256!![i_44_] = i_43_ * (i_44_ + 1) + Class345.anIntArray4271!![i_44_]
                for (i_45_ in Class348_Sub40_Sub34.aClass293Array9432!!.indices) Class348_Sub40_Sub34.aClass293Array9432!![i_45_]!!.method2209()
            }
            if (Class348_Sub31_Sub2.aClass357ArrayArrayArray9082 != null) {
                if (Class348_Sub40_Sub5.aBoolean9121) method2131(0)
                Class243.method1879(true)
                Class9.aHa171!!.ra(-1, 1583160, 40, 127)
                Class348_Sub49_Sub1.method3398(true, `is`, i_20_, i_21_, i_25_, i_26_, bool_27_)
                if (Class348_Sub40_Sub5.aBoolean9121) Class304.method2290()
                Class9.aHa171!!.pa()
                Class243.method1879(false)
            }
            Class348_Sub49_Sub1.method3398(false, `is`, i_20_, i_21_, i_25_, i_26_, bool_27_)
            if (Class348_Sub40_Sub5.aBoolean9121) {
                for (i_46_ in 0..<Class189.anInt2524) Class5_Sub2.aBooleanArrayArrayArray8361!![i_46_] = Class115.aBooleanArrayArrayArray1751!![i_46_]
                method2131(0)
                for (i_47_ in Class348_Sub40_Sub34.aClass293Array9432!!.indices) Class348_Sub40_Sub34.aClass293Array9432!![i_47_]!!.method2209()
            }
            if (Class348_Sub40_Sub5.aBoolean9121) {
                Class304.method2290()
                for (i_48_ in 0..<Class189.anInt2524) Class115.aBooleanArrayArrayArray1751!![i_48_] = Class5_Sub2.aBooleanArrayArrayArray8361!![i_48_]!!
                if (Npc.anInt10503 == 2) {
                    if (Class146.aLongArray2013!![0] < Class146.aLongArray2013!![1]) {
                        if (Class17.anIntArray256!![0] + Class345.anIntArray4271!![0] > Class348_Sub40_Sub10.anIntArray9183!![0]) Class345.anIntArray4271!![0]++
                    } else if ((Class146.aLongArray2013!![0] > Class146.aLongArray2013!![1]) && ((Class17.anIntArray256!![0] + Class345.anIntArray4271!![0]) < Class348_Sub40_Sub10.anIntArray9183!![2])) Class345.anIntArray4271!![0]--
                }
            }
            if (!Class348_Sub40_Sub17.aBoolean9242) {
                Class99.aBooleanArrayArray1572 = bools
                Class348_Sub8.aBooleanArrayArray6656 = bools_28_
            }
            Class245.method1884()
        }
    }
}
