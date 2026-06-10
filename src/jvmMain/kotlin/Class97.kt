import Class369_Sub3_Sub1.Companion.method3575
import Class58.Companion.method535
import Class89.Companion.method849
import ha_Sub3.Companion.method3936
import jaclib.memory.Stream.Companion.c

class Class97 internal constructor(var_ha_Sub3: ha_Sub3?, class330: Class330?, var_s_Sub3: s_Sub3?, i: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
    private val anInt1544: Int
    private var anInt1546 = 0
    private var anInt1547 = 0
    private var anInterface5_Impl2_1551: Interface5_Impl2? = null
    private var anInterface18_Impl3_1556: Interface18_Impl3? = null
    private var anInt1558 = -1
    private val anInt1559: Int
    private val aClass330_1560: Class330?
    private val aHa_Sub3_1561: ha_Sub3?
    @JvmField
    var aBoolean1562: Boolean = true
    @JvmField
    var anInt1563: Int = 0

    fun method871(i: Byte) {
        anInt1552++
        if (i >= 77) method875(-126, anInterface5_Impl2_1551, this.anInt1563)
    }

    private fun method874(i: Int) {
        anInt1553++
        if (this.aBoolean1562) {
            this.aBoolean1562 = false
            val `is` = aClass330_1560!!.aByteArray4112
            var i_8_ = 0
            val i_9_ = aClass330_1560.anInt4113
            var i_10_ = (aClass330_1560.anInt4113 * anInt1559 + anInt1544)
            for (i_11_ in -128..-1) {
                i_8_ = (i_8_ shl 8) - i_8_
                for (i_12_ in -128..-1) {
                    if (`is`[i_10_++].toInt() != 0) i_8_++
                }
                i_10_ += i_9_ - 128
            }
            if (anInterface18_Impl3_1556 != null && i_8_ == anInt1558) this.aBoolean1562 = false
            else {
                anInt1558 = i_8_
                if (i != -12763) anInt1546 = -8
                var i_13_ = 0
                i_10_ = anInt1544 + anInt1559 * i_9_
                if (aHa_Sub3_1561!!.method3880(Class68.aClass68_1183, (Class348_Sub40_Sub38.aClass304_9471), 122.toByte())) {
                    if (Class367_Sub11.aByteArray7394 == null) Class367_Sub11.aByteArray7394 = ByteArray(16384)
                    val is_14_ = Class367_Sub11.aByteArray7394!!
                    for (i_15_ in -128..-1) {
                        for (i_16_ in -128..-1) {
                            if (`is`[i_10_].toInt() == 0) {
                                var i_17_ = 0
                                if (`is`[i_10_ + -1].toInt() != 0) i_17_++
                                if (`is`[1 + i_10_].toInt() != 0) i_17_++
                                if (`is`[i_10_ + -i_9_].toInt() != 0) i_17_++
                                if (`is`[i_9_ + i_10_].toInt() != 0) i_17_++
                                is_14_[i_13_++] = (17 * i_17_).toByte()
                            } else is_14_[i_13_++] = 68.toByte()
                            i_10_++
                        }
                        i_10_ += -128 + aClass330_1560.anInt4113
                    }
                    if (anInterface18_Impl3_1556 == null) {
                        anInterface18_Impl3_1556 = aHa_Sub3_1561.method3944((Class367_Sub11.aByteArray7394), 128, (Class348_Sub40_Sub38.aClass304_9471), i xor 0x31d8.inv(), false, 128)
                        anInterface18_Impl3_1556!!.method66(false, false, i xor 0x5582.inv())
                    } else anInterface18_Impl3_1556!!.method70(0, 0, ((-45).toByte()).toByte(), 128, 128, 128, 0, (Class367_Sub11.aByteArray7394), (Class348_Sub40_Sub38.aClass304_9471))
                } else {
                    if (Class40.anIntArray543 == null) Class40.anIntArray543 = IntArray(16384)
                    val is_18_ = Class40.anIntArray543!!
                    for (i_19_ in -128..-1) {
                        for (i_20_ in -128..-1) {
                            if (`is`[i_10_].toInt() == 0) {
                                var i_21_ = 0
                                if (`is`[i_10_ + -1].toInt() != 0) i_21_++
                                if (`is`[i_10_ - -1].toInt() != 0) i_21_++
                                if (`is`[i_10_ + -i_9_].toInt() != 0) i_21_++
                                if (`is`[i_9_ + i_10_].toInt() != 0) i_21_++
                                is_18_[i_13_++] = i_21_ * 17 shl 24
                            } else is_18_[i_13_++] = 1140850688
                            i_10_++
                        }
                        i_10_ += -128 + aClass330_1560.anInt4113
                    }
                    if (anInterface18_Impl3_1556 == null) {
                        anInterface18_Impl3_1556 = aHa_Sub3_1561.method3839(128, 128, -15137, false, Class40.anIntArray543)
                        anInterface18_Impl3_1556!!.method66(false, false, i + 38451)
                    } else anInterface18_Impl3_1556!!.method68(128, i + 35572, (Class40.anIntArray543), 0, 0, 128, 0, 128)
                }
            }
        }
    }

    fun method875(i: Int, interface5_impl2: Interface5_Impl2?, i_22_: Int) {
        if (i_22_ > 0) {
            method874(-12763)
            aHa_Sub3_1561!!.method3850(119.toByte(), anInterface18_Impl3_1556)
            aHa_Sub3_1561.method3938(Class247.aClass21_3181, i_22_, interface5_impl2, anInt1547, 0, -anInt1547 + (anInt1546 - -1), 47)
        }
        anInt1545++
        if (i > -47) this.anInt1563 = 75
    }

    init {
        try {
            aHa_Sub3_1561 = var_ha_Sub3
            anInt1544 = i_26_
            anInt1559 = i_27_
            aClass330_1560 = class330
            val i_28_ = 1 shl i_25_
            var i_29_ = 0
            val i_30_ = i shl i_25_
            val i_31_ = i_24_ shl i_25_
            var i_32_ = 0
            while (i_28_ > i_32_) {
                var i_33_ = i_30_ + (i_32_ + i_31_) * var_s_Sub3!!.anInt4587
                var i_34_ = 0
                while (i_28_ > i_34_) {
                    val `is` = var_s_Sub3.aShortArrayArray8299[i_33_++]
                    if (`is` != null) i_29_ += `is`.size
                    i_34_++
                }
                i_32_++
            }
            if (i_29_ <= 0) {
                this.anInt1563 = 0
                anInterface18_Impl3_1556 = null
            } else {
                anInt1546 = -2147483648
                anInt1547 = 2147483647
                anInterface5_Impl2_1551 = aHa_Sub3_1561!!.method3840(-28633, false)
                anInterface5_Impl2_1551!!.method23(15959, i_29_)
                for (i_35_ in 0..3) {
                    val buffer = anInterface5_Impl2_1551!!.method24(true, false)
                    if (buffer != null) {
                        val stream = aHa_Sub3_1561.method3893(buffer, 9179)
                        if (c()) {
                            for (i_41_ in 0..<i_28_) {
                                var i_42_ = (var_s_Sub3!!.anInt4587 * (i_41_ + i_31_) - -i_30_)
                                var i_43_ = 0
                                while ((i_28_ > i_43_)) {
                                    val `is` = (var_s_Sub3.aShortArrayArray8299[i_42_++])
                                    if (`is` != null) {
                                        var i_44_ = 0
                                        while ((`is`.size > i_44_)) {
                                            val i_45_ = 0xffff and `is`[i_44_].toInt()
                                            if (anInt1546 < i_45_) anInt1546 = i_45_
                                            if (i_45_ < anInt1547) anInt1547 = i_45_
                                            stream.d(i_45_)
                                            i_44_++
                                        }
                                    }
                                    i_43_++
                                }
                            }
                        } else {
                            for (i_36_ in 0..<i_28_) {
                                var i_37_ = (var_s_Sub3!!.anInt4587 * (i_31_ - -i_36_) + i_30_)
                                var i_38_ = 0
                                while ((i_38_ < i_28_)) {
                                    val `is` = (var_s_Sub3.aShortArrayArray8299[i_37_++])
                                    if (`is` != null) {
                                        var i_39_ = 0
                                        while ((i_39_ < `is`.size)) {
                                            val i_40_ = 0xffff and `is`[i_39_].toInt()
                                            if (anInt1547 > i_40_) anInt1547 = i_40_
                                            if (i_40_ > anInt1546) anInt1546 = i_40_
                                            stream.a(i_40_)
                                            i_39_++
                                        }
                                    }
                                    i_38_++
                                }
                            }
                        }
                        stream.a()
                        if (anInterface5_Impl2_1551!!.method22(-23)) break
                    }
                }
                this.anInt1563 = i_29_ / 3
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("mc.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (class330 != null) "{...}" else "null") + ',' + (if (var_s_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt1545: Int = 0
        @JvmField
        var anInt1548: Int = -1
        @JvmField
        var anInt1549: Int = 0
        @JvmField
        var anInt1550: Int = 0
        @JvmField
        var anInt1552: Int = 0
        @JvmField
        var anInt1553: Int = 0
        @JvmField
        var anInt1554: Int = 0
        @JvmField
        var anInt1555: Int = 0
        @JvmField
        var anInt1557: Int = 0
        fun method872(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
            anInt1554++
            if (i_5_ >= Class369.anInt4960 && Class113.anInt1745 >= i_4_ && Class132.anInt1910 <= i_2_ && Class38.anInt513 >= i_3_) {
                if (i_1_ == 1) Class184.method1388(i_2_, i, i_0_ + 107, i_4_, i_5_, i_3_)
                else method849(i_1_, i_2_, i_5_, i_4_, i_3_, 100, i)
            } else if (i_1_ != 1) method535(i_5_, i_3_, i_1_, i_4_, i, i_2_, ((-106).toByte()).toByte())
            else method3575(103.toByte(), i_4_, i, i_3_, i_2_, i_5_)
            if (i_0_ != 1) method873(47, 5, null, 1)
        }

        fun method873(i: Int, i_6_: Int, var_ha: ha?, i_7_: Int) {
            Class60.aHa1098 = var_ha
            Class262.aClass190ArrayArray3335 = Array(i) { arrayOfNulls(i_7_) }
            if (i_6_ == 21719) {
                anInt1549++
                if (Class81.anIntArray1432 != null) Class348_Sub42_Sub10.aClass299_9571 = Class230.method1636(Class81.anIntArray1432!![4], Class81.anIntArray1432!![3], Class81.anIntArray1432!![0], Class81.anIntArray1432!![5], Class81.anIntArray1432!![1], -1, Class81.anIntArray1432!![2])
                Class274.aClass190_3547 = Class190()
                method3936(0)
            }
        }

        @JvmStatic
        fun method876(i: Int, i_23_: Int) {
            anInt1557++
            synchronized(Class24.aClass60_355!!) {
                Class24.aClass60_355!!.method578(2, i)
            }
            synchronized(Class130.aClass60_1894!!) {
                Class130.aClass60_1894!!.method578(2, i)
                if (i_23_ != 0) method876(51, 108)
            }
        }
    }
}
