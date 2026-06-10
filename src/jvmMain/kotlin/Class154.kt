/* Class154 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class154 {
    private var anIntArray2092: IntArray? = null
    var anInt2093: Int = -1
    private var aLong2094: Long = 0
    @JvmField
    var anIntArray2095: IntArray? = null
    var aBoolean2100: Boolean = false
    private var aLong2102: Long = 0
    private var anInt2103 = 0
    fun method1226(interface17: Interface17?, class17: Class17?, class182s: Array<Class182?>?, bool: Boolean, class255: Class255?, i: Int, class17_0_: Class17?, i_1_: Int, bool_2_: Boolean, i_3_: Int, `is`: IntArray?, i_4_: Int, class150: Class150?, i_5_: Int, var_ha: ha?, class278: Class278?, class87: Class87?, i_6_: Int, i_7_: Int, i_8_: Int, class261: Class261?): Class64? {
        try {
            anInt2097++
            if (this.anInt2093 != -1) return (class278!!.method2079(this.anInt2093, -1).method800(i, class182s, class87, !bool_2_, class17, i_8_, class261, i_7_, class17_0_, interface17, var_ha, i_3_, `is`, i_1_, i_6_, i_4_, i_5_))
            var i_9_ = i_4_
            var l = aLong2102
            var is_10_ = anIntArray2092
            if (class17_0_ != null && (class17_0_.anInt249 >= 0 || class17_0_.anInt261 >= 0)) {
                is_10_ = IntArray(12)
                for (i_11_ in 0..11) is_10_[i_11_] = anIntArray2092!![i_11_]
                if (class17_0_.anInt249 >= 0) {
                    if (class17_0_.anInt249 == 65535) {
                        is_10_[5] = 0
                        l = l xor 0xffffffffL.inv()
                    } else {
                        is_10_[5] = Class273.method2057((class17_0_.anInt249), 1073741824)
                        l = l xor (is_10_[5].toLong() shl 32)
                    }
                }
                if (class17_0_.anInt261 >= 0) {
                    if (class17_0_.anInt261 == 65535) {
                        is_10_[3] = 0
                        l = l xor 0xffffffffL
                    } else {
                        is_10_[3] = Class273.method2057((class17_0_.anInt261), 1073741824)
                        l = l xor is_10_[3].toLong()
                    }
                }
            }
            var bool_12_ = false
            var bool_13_ = false
            var bool_14_ = false
            var bool_15_ = class17_0_ != null || class17 != null
            val i_16_ = if (class182s != null) class182s.size else 0
            var i_17_ = 0
            while (i_16_ > i_17_) {
                Class95.aClass348_Sub42_Sub17Array1543!![i_17_] = null
                if (class182s!![i_17_] != null) {
                    val class17_18_ = class87!!.method835((class182s[i_17_]!!.anInt2454), 7)
                    if (class17_18_.anIntArray237 != null) {
                        bool_15_ = true
                        Class57.aClass17Array1048!![i_17_] = class17_18_
                        val i_19_ = class182s[i_17_]!!.anInt2451
                        val i_20_ = class182s[i_17_]!!.anInt2455
                        var i_21_ = class17_18_.anIntArray237[i_19_]
                        Class95.aClass348_Sub42_Sub17Array1543!![i_17_] = class87.method839(i_21_ ushr 16, 3)
                        i_21_ = i_21_ and 0xffff
                        Class184.anIntArray2471!![i_17_] = i_21_
                        if (Class95.aClass348_Sub42_Sub17Array1543!![i_17_] != null) {
                            bool_13_ = bool_13_ or Class95.aClass348_Sub42_Sub17Array1543!![i_17_]!!.method3272(i_21_, 0)
                            bool_12_ = bool_12_ or Class95.aClass348_Sub42_Sub17Array1543!![i_17_]!!.method3271(i_21_, 14)
                            bool_14_ = bool_14_ or Class95.aClass348_Sub42_Sub17Array1543!![i_17_]!!.method3267((-109).toByte(), i_21_)
                        }
                        if ((class17_18_.aBoolean241 || Class28.aBoolean5002) && i_20_ != -1 && (class17_18_.anIntArray237.size > i_20_)) {
                            Class100.anIntArray1583!![i_17_] = class17_18_.anIntArray267!![i_19_]
                            Class50_Sub3.anIntArray5241!![i_17_] = class182s[i_17_]!!.anInt2456
                            var i_22_ = class17_18_.anIntArray237[i_20_]
                            Class295.aClass348_Sub42_Sub17Array3753!![i_17_] = class87.method839(i_22_ ushr 16, 3)
                            i_22_ = i_22_ and 0xffff
                            Class227.anIntArray2967!![i_17_] = i_22_
                            if (Class295.aClass348_Sub42_Sub17Array3753!![i_17_] != null) {
                                bool_13_ = bool_13_ or Class295.aClass348_Sub42_Sub17Array3753!![i_17_]!!.method3272(i_22_, 0)
                                bool_12_ = bool_12_ or Class295.aClass348_Sub42_Sub17Array3753!![i_17_]!!.method3271(i_22_, 14)
                                bool_14_ = bool_14_ or Class295.aClass348_Sub42_Sub17Array3753!![i_17_]!!.method3267((-115).toByte(), i_22_)
                            }
                        } else {
                            Class100.anIntArray1583!![i_17_] = 0
                            Class50_Sub3.anIntArray5241!![i_17_] = 0
                            Class295.aClass348_Sub42_Sub17Array3753!![i_17_] = null
                            Class227.anIntArray2967!![i_17_] = -1
                        }
                    }
                }
                i_17_++
            }
            var i_23_ = -1
            var i_24_ = -1
            var i_25_ = 0
            var class348_sub42_sub17: Class348_Sub42_Sub17? = null
            var class348_sub42_sub17_26_: Class348_Sub42_Sub17? = null
            var i_27_ = -1
            var i_28_ = -1
            var i_29_ = 0
            var class348_sub42_sub17_30_: Class348_Sub42_Sub17? = null
            var class348_sub42_sub17_31_: Class348_Sub42_Sub17? = null
            if (bool_15_) {
                if (class17_0_ != null) {
                    i_23_ = class17_0_.anIntArray237[i_7_]
                    val i_32_ = i_23_ ushr 16
                    class348_sub42_sub17 = class87!!.method839(i_32_, 3)
                    i_23_ = i_23_ and 0xffff
                    if (class348_sub42_sub17 != null) {
                        bool_13_ = bool_13_ or class348_sub42_sub17.method3272(i_23_, 0)
                        bool_12_ = bool_12_ or class348_sub42_sub17.method3271(i_23_, 14)
                        bool_14_ = bool_14_ or class348_sub42_sub17.method3267((-110).toByte(), i_23_)
                    }
                    if ((class17_0_.aBoolean241 || Class28.aBoolean5002) && i_1_ != -1 && i_1_ < class17_0_.anIntArray237.size) {
                        i_24_ = class17_0_.anIntArray237[i_1_]
                        i_25_ = class17_0_.anIntArray267!![i_7_]
                        val i_33_ = i_24_ ushr 16
                        class348_sub42_sub17_26_ = (if (i_32_ == i_33_) class348_sub42_sub17 else class87.method839(i_33_, 3))
                        i_24_ = i_24_ and 0xffff
                        if (class348_sub42_sub17_26_ != null) {
                            bool_13_ = bool_13_ or class348_sub42_sub17_26_.method3272(i_24_, 0)
                            bool_12_ = bool_12_ or class348_sub42_sub17_26_.method3271(i_24_, 14)
                            bool_14_ = bool_14_ or class348_sub42_sub17_26_.method3267((-106).toByte(), i_24_)
                        }
                    }
                }
                i_9_ = i_9_ or 0x20
                if (class17 != null) {
                    i_27_ = class17.anIntArray237[i_6_]
                    val i_34_ = i_27_ ushr 16
                    i_27_ = i_27_ and 0xffff
                    class348_sub42_sub17_30_ = class87!!.method839(i_34_, 3)
                    if (class348_sub42_sub17_30_ != null) {
                        bool_13_ = bool_13_ or class348_sub42_sub17_30_.method3272(i_27_, 0)
                        bool_12_ = bool_12_ or class348_sub42_sub17_30_.method3271(i_27_, 14)
                        bool_14_ = bool_14_ or class348_sub42_sub17_30_.method3267((-123).toByte(), i_27_)
                    }
                    if ((class17.aBoolean241 || Class28.aBoolean5002) && i_3_ != -1 && i_3_ < class17.anIntArray237.size) {
                        i_28_ = class17.anIntArray237[i_3_]
                        i_29_ = class17.anIntArray267!![i_6_]
                        val i_35_ = i_28_ ushr 16
                        i_28_ = i_28_ and 0xffff
                        class348_sub42_sub17_31_ = (if (i_35_ == i_34_) class348_sub42_sub17_30_ else class87.method839(i_35_, 3))
                        if (class348_sub42_sub17_31_ != null) {
                            bool_13_ = bool_13_ or class348_sub42_sub17_31_.method3272(i_28_, 0)
                            bool_12_ = bool_12_ or class348_sub42_sub17_31_.method3271(i_28_, 14)
                            bool_14_ = bool_14_ or class348_sub42_sub17_31_.method3267((-96).toByte(), i_28_)
                        }
                    }
                }
                if (bool_13_) i_9_ = i_9_ or 0x80
                if (bool_12_) i_9_ = i_9_ or 0x100
                if (bool_14_) i_9_ = i_9_ or 0x400
            }
            var class64: Class64?
            synchronized(Class24.aClass60_355!!) {
                class64 = Class24.aClass60_355!!.method583(l, -47) as Class64?
            }
            var class225: Class225? = null
            if (anInt2103 != -1) class225 = class261!!.method1983(anInt2103, 32)
            if (class64 == null || var_ha!!.method3667(class64.ua(), i_9_) != 0) {
                if (class64 != null) i_9_ = var_ha!!.method3679(i_9_, class64.ua())
                var i_36_ = i_9_
                var bool_37_ = false
                for (i_38_ in 0..11) {
                    val i_39_ = is_10_!![i_38_]
                    if ((0x40000000 and i_39_) == 0) {
                        if ((0x7fffffff.inv() and i_39_) != 0 && !class150!!.method1203(33.toByte(), i_39_ and 0x3fffffff).method348(34.toByte())) bool_37_ = true
                    } else if (!class255!!.method1940(94, 0x3fffffff and i_39_).method1565(this.aBoolean2100, -1)) bool_37_ = true
                }
                if (bool_37_) {
                    if (aLong2094 != -1L) {
                        synchronized(Class24.aClass60_355!!) {
                            class64 = Class24.aClass60_355!!.method583(aLong2094, -92) as Class64?
                        }
                    }
                    if (class64 == null || var_ha!!.method3667(class64.ua(), i_9_) != 0) return null
                } else {
                    val class124s = arrayOfNulls<Class124>(12)
                    for (i_40_ in 0..11) {
                        val i_41_ = is_10_!![i_40_]
                        if ((0x40000000 and i_41_) == 0) {
                            if ((0x7fffffff.inv() and i_41_) != 0) {
                                val class124 = class150!!.method1203(33.toByte(), i_41_ and 0x3fffffff).method341(91)
                                if (class124 != null) class124s[i_40_] = class124
                            }
                        } else {
                            val class124 = (class255!!.method1940(104, i_41_ and 0x3fffffff).method1558(this.aBoolean2100, !bool_2_))
                            if (class124 != null) class124s[i_40_] = class124
                        }
                    }
                    if (class225 != null && class225.anIntArrayArray2939 != null) {
                        var i_42_ = 0
                        while (((class225.anIntArrayArray2939!!).size > i_42_)) {
                            if (class124s[i_42_] != null) {
                                var i_43_ = 0
                                var i_44_ = 0
                                var i_45_ = 0
                                var i_46_ = 0
                                var i_47_ = 0
                                var i_48_ = 0
                                if ((class225.anIntArrayArray2939!![i_42_]) != null) {
                                    i_47_ = ((class225.anIntArrayArray2939!![i_42_]!![4]) shl 3)
                                    i_44_ = (class225.anIntArrayArray2939!![i_42_]!![1])
                                    i_48_ = ((class225.anIntArrayArray2939!![i_42_]!![5]) shl 3)
                                    i_43_ = (class225.anIntArrayArray2939!![i_42_]!![0])
                                    i_46_ = ((class225.anIntArrayArray2939!![i_42_]!![3]) shl 3)
                                    i_45_ = (class225.anIntArrayArray2939!![i_42_]!![2])
                                }
                                if (i_46_ != 0 || i_47_ != 0 || i_48_ != 0) class124s[i_42_]!!.method1107(6875, i_47_, i_48_, i_46_)
                                if (i_43_ != 0 || i_44_ != 0 || i_45_ != 0) class124s[i_42_]!!.method1099((-82).toByte(), i_45_, i_43_, i_44_)
                            }
                            i_42_++
                        }
                    }
                    val class124 = Class124(class124s, class124s.size)
                    i_36_ = i_36_ or 0x4000
                    class64 = var_ha!!.method3625(class124, i_36_, Class168.anInt2251, 64, 850)
                    for (i_49_ in 0..4) {
                        var i_50_ = 0
                        while ((Class367_Sub2.aShortArrayArrayArray7290!!.size > i_50_)) {
                            if ((Class367_Sub2.aShortArrayArrayArray7290!![i_50_]!![i_49_])!!.size > this.anIntArray2095!![i_49_]) class64.ia((Class136.aShortArrayArray4791!![i_50_]!![i_49_]), (Class367_Sub2.aShortArrayArrayArray7290!![i_50_]!![i_49_]!![(this.anIntArray2095!![i_49_])]))
                            i_50_++
                        }
                    }
                    if (bool) {
                        class64.s(i_9_)
                        synchronized(Class24.aClass60_355!!) {
                            Class24.aClass60_355!!.method582(class64, l, (-98).toByte())
                        }
                        aLong2094 = l
                    }
                }
            }
            val class64_51_ = class64.method614(4.toByte(), i_9_, bool_2_)
            var bool_52_ = false
            if (`is` != null) {
                for (i_53_ in 0..11) {
                    if (`is`[i_53_] != -1) bool_52_ = true
                }
            }
            if (!bool_15_ && !bool_52_) return class64_51_
            var class101s: Array<Class101?>? = null
            if (class225 != null) class101s = class225.method1618(var_ha, 0) as Array<Class101?>?
            if (bool_52_ && class101s != null) {
                for (i_54_ in 0..11) {
                    if (class101s[i_54_] != null) class64_51_!!.method610(class101s[i_54_]!!, 1 shl i_54_, true)
                }
            }
            var i_55_ = 0
            var i_56_ = 1
            while ( /**/i_16_ > i_55_) {
                if (Class95.aClass348_Sub42_Sub17Array1543!![i_55_] != null) class64_51_!!.method603((-55).toByte(), -1 + Class50_Sub3.anIntArray5241!![i_55_], null, i_56_, Class184.anIntArray2471!![i_55_], Class227.anIntArray2967!![i_55_], Class295.aClass348_Sub42_Sub17Array3753!![i_55_], 0, Class95.aClass348_Sub42_Sub17Array1543!![i_55_], false, Class100.anIntArray1583!![i_55_])
                i_56_ = i_56_ shl 1
                i_55_++
            }
            if (bool_52_) {
                for (i_57_ in 0..11) {
                    if (`is`!![i_57_] != -1) {
                        var i_58_ = `is`[i_57_] - i
                        i_58_ = i_58_ and 0x3fff
                        val class101 = var_ha.method3654()
                        class101.method895(i_58_)
                        class64_51_!!.method610(class101, 1 shl i_57_, false)
                    }
                }
            }
            if (bool_52_ && class101s != null) {
                for (i_59_ in 0..11) {
                    if (class101s[i_59_] != null) class64_51_!!.method610(class101s[i_59_]!!, 1 shl i_59_, false)
                }
            }
            if (class348_sub42_sub17 != null && class348_sub42_sub17_30_ != null) class64_51_!!.method625(class348_sub42_sub17_26_, i_25_, 121.toByte(), i_29_, class348_sub42_sub17_30_, i_23_, i_27_, i_5_ - 1, class348_sub42_sub17, false, i_24_, class348_sub42_sub17_31_, i_8_ + -1, class17_0_!!.aBooleanArray263, i_28_)
            else if (class348_sub42_sub17 != null) class64_51_!!.method617(i_23_, i_25_, class348_sub42_sub17_26_, 0, class348_sub42_sub17, false, false, i_24_, i_5_ + -1)
            else if (class348_sub42_sub17_30_ != null) class64_51_!!.method617(i_27_, i_29_, class348_sub42_sub17_31_, 0, class348_sub42_sub17_30_, false, false, i_28_, i_8_ + -1)
            var i_60_ = 0
            while (i_16_ > i_60_) {
                Class95.aClass348_Sub42_Sub17Array1543!![i_60_] = null
                Class295.aClass348_Sub42_Sub17Array3753!![i_60_] = null
                Class57.aClass17Array1048!![i_60_] = null
                i_60_++
            }
            return class64_51_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("oo.C(" + (if (interface17 != null) "{...}" else "null") + ',' + (if (class17 != null) "{...}" else "null") + ',' + (if (class182s != null) "{...}" else "null") + ',' + bool + ',' + (if (class255 != null) "{...}" else "null") + ',' + i + ',' + (if (class17_0_ != null) "{...}" else "null") + ',' + i_1_ + ',' + bool_2_ + ',' + i_3_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_4_ + ',' + (if (class150 != null) "{...}" else "null") + ',' + i_5_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + (if (class278 != null) "{...}" else "null") + ',' + (if (class87 != null) "{...}" else "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + (if (class261 != null) "{...}" else "null") + ')')
            )
        }
    }

    fun method1227(i: Byte, i_61_: Int, i_62_: Int, class255: Class255?) {
        try {
            if (i.toInt() == 42) {
                anInt2099++
                if (i_62_ == -1) anIntArray2092!![i_61_] = 0
                else if (class255!!.method1940(-125, i_62_) != null) {
                    anIntArray2092!![i_61_] = Class273.method2057(1073741824, i_62_)
                    method1234(-100)
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.H(" + i + ',' + i_61_ + ',' + i_62_ + ',' + (if (class255 != null) "{...}" else "null") + ')'))
        }
    }

    fun method1228(i: Int, i_63_: Int, i_64_: Int, `is`: IntArray?, bool: Boolean, is_65_: IntArray?) {
        try {
            if (i_64_ != anInt2103) anInt2103 = i_64_
            anIntArray2092 = `is`
            if (i_63_ <= 54) anIntArray2092 = null
            this.anIntArray2095 = is_65_
            anInt2090++
            this.anInt2093 = i
            this.aBoolean2100 = bool
            method1234(-25)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.F(" + i + ',' + i_63_ + ',' + i_64_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + bool + ',' + (if (is_65_ != null) "{...}" else "null") + ')'))
        }
    }

    fun method1229(i: Byte, bool: Boolean) {
        anInt2104++
        this.aBoolean2100 = bool
        if (i.toInt() != -17) this.aBoolean2100 = false
        method1234(-78)
    }

    fun method1230(class255: Class255?, i: Int, class87: Class87?, class150: Class150?, interface17: Interface17?, class278: Class278?, i_66_: Int, i_67_: Int, i_68_: Int, class17: Class17?, i_69_: Int, var_ha: ha?): Class64? {
        try {
            anInt2107++
            if (this.anInt2093 != -1) return (class278!!.method2079(this.anInt2093, -1).method803(interface17, var_ha, i_69_, i_67_, class17, class87, i_66_, 121, i_68_))
            var i_70_ = i_68_
            if (class17 != null) {
                var bool = false
                var bool_71_ = false
                var bool_72_ = false
                var bool_73_ = false
                var i_74_ = -1
                var i_75_ = -1
                val `object`: Any? = null
                i_70_ = i_70_ or 0x20
                val object_76_: Any? = null
                i_74_ = class17.anIntArray237[i_66_]
                val i_77_ = i_74_ ushr 16
                i_74_ = i_74_ and 0xffff
                val class348_sub42_sub17 = class87!!.method839(i_77_, 3)
                if (class348_sub42_sub17 != null) {
                    bool_71_ = bool_71_ or class348_sub42_sub17.method3272(i_74_, 0)
                    bool = bool or class348_sub42_sub17.method3271(i_74_, 14)
                    bool_73_ = bool_73_ or class348_sub42_sub17.method3267((-125).toByte(), i_74_)
                    bool_72_ = bool_72_ or class17.aBoolean242
                }
                if ((class17.aBoolean241 || Class28.aBoolean5002) && i_67_ != -1 && i_67_ < class17.anIntArray237.size) {
                    i_75_ = class17.anIntArray237[i_67_]
                    val i_78_ = i_75_ ushr 16
                    val class348_sub42_sub17_79_ = (if (i_78_ != i_77_) class87.method839(i_78_, i xor 0x17f6eb54.inv()) else class348_sub42_sub17)
                    i_75_ = i_75_ and 0xffff
                    if (class348_sub42_sub17_79_ != null) {
                        bool_71_ = bool_71_ or class348_sub42_sub17_79_.method3272(i_75_, 0)
                        bool = bool or class348_sub42_sub17_79_.method3271(i_75_, 14)
                        bool_73_ = bool_73_ or class348_sub42_sub17_79_.method3267((-127).toByte(), i_75_)
                    }
                }
                if (bool_71_) i_70_ = i_70_ or 0x80
                if (bool) i_70_ = i_70_ or 0x100
                if (bool_72_) i_70_ = i_70_ or 0x200
                if (bool_73_) i_70_ = i_70_ or 0x400
            }
            if (i != -402058072) aLong2094 = -101L
            var class64: Class64?
            synchronized(Class130.aClass60_1894!!) {
                class64 = Class130.aClass60_1894!!.method583(aLong2102, i xor 0x17f6eb29.inv()) as Class64?
            }
            if (class64 == null || var_ha!!.method3667(class64.ua(), i_70_) != 0) {
                if (class64 != null) i_70_ = var_ha!!.method3679(i_70_, class64.ua())
                var i_80_ = i_70_
                var bool = false
                for (i_81_ in 0..11) {
                    val i_82_ = anIntArray2092!![i_81_]
                    if ((i_82_ and 0x40000000) != 0) {
                        if (!class255!!.method1940(i xor 0x17f6eb2c, 0x3fffffff and i_82_).method1555(97.toByte(), this.aBoolean2100)) bool = true
                    } else if ((0x7fffffff.inv() and i_82_) != 0 && !class150!!.method1203(33.toByte(), i_82_ and 0x3fffffff).method342(110.toByte())) bool = true
                }
                if (bool) return null
                val class124s = arrayOfNulls<Class124>(12)
                var i_83_ = 0
                for (i_84_ in 0..11) {
                    val i_85_ = anIntArray2092!![i_84_]
                    if ((i_85_ and 0x40000000) == 0) {
                        if ((i_85_ and 0x7fffffff.inv()) != 0) {
                            val class124 = class150!!.method1203(33.toByte(), i_85_ and 0x3fffffff).method343((-73).toByte())
                            if (class124 != null) class124s[i_83_++] = class124
                        }
                    } else {
                        val class124 = (class255!!.method1940(-107, i_85_ and 0x3fffffff).method1554(this.aBoolean2100, -14))
                        if (class124 != null) class124s[i_83_++] = class124
                    }
                }
                i_80_ = i_80_ or 0x4000
                val class124 = Class124(class124s, i_83_)
                class64 = var_ha!!.method3625(class124, i_80_, Class168.anInt2251, 64, 768)
                for (i_86_ in 0..4) {
                    var i_87_ = 0
                    while ((Class367_Sub2.aShortArrayArrayArray7290!!.size > i_87_)) {
                        if (this.anIntArray2095!![i_86_] < (Class367_Sub2.aShortArrayArrayArray7290!![i_87_]!![i_86_])!!.size) class64.ia((Class136.aShortArrayArray4791!![i_87_]!![i_86_]), (Class367_Sub2.aShortArrayArrayArray7290!![i_87_]!![i_86_]!![(this.anIntArray2095!![i_86_])]))
                        i_87_++
                    }
                }
                class64.s(i_70_)
                synchronized(Class130.aClass60_1894!!) {
                    Class130.aClass60_1894!!.method582(class64, aLong2102, (-97).toByte())
                }
            }
            if (class17 == null) return class64
            var class64_88_ = class64.method614(4.toByte(), i_70_, true)
            class64_88_ = class17.method269(123, class64, i_67_, i_69_, i_68_, i_66_)
            return class64_88_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("oo.J(" + (if (class255 != null) "{...}" else "null") + ',' + i + ',' + (if (class87 != null) "{...}" else "null") + ',' + (if (class150 != null) "{...}" else "null") + ',' + (if (interface17 != null) "{...}" else "null") + ',' + (if (class278 != null) "{...}" else "null") + ',' + i_66_ + ',' + i_67_ + ',' + i_68_ + ',' + (if (class17 != null) "{...}" else "null") + ',' + i_69_ + ',' + (if (var_ha != null) "{...}" else "null") + ')')
            )
        }
    }

    fun method1231(i: Int, i_89_: Int, i_90_: Int) {
        this.anIntArray2095!![i] = i_90_
        if (i_89_ == 0) {
            anInt2091++
            method1234(-48)
        }
    }

    fun method1232(i: Int, i_91_: Int, i_92_: Int, i_93_: Int, class87: Class87?, class150: Class150?, i_94_: Int, i_95_: Int, i_96_: Int, var_ha: ha?, i_97_: Int, class17: Class17?): Class64? {
        try {
            anInt2106++
            var i_98_ = i_91_
            if (class17 != null) {
                var bool = false
                var bool_99_ = false
                var bool_100_ = false
                var bool_101_ = false
                var i_102_ = -1
                var i_103_ = -1
                val `object`: Any? = null
                val object_104_: Any? = null
                i_98_ = i_98_ or 0x20
                i_102_ = class17.anIntArray237[i_97_]
                val i_105_ = i_102_ ushr 16
                val class348_sub42_sub17 = class87!!.method839(i_105_, 3)
                i_102_ = i_102_ and 0xffff
                if (class348_sub42_sub17 != null) {
                    bool_99_ = bool_99_ or class348_sub42_sub17.method3272(i_102_, i_94_ xor 0x3be2.inv())
                    bool = bool or class348_sub42_sub17.method3271(i_102_, 14)
                    bool_101_ = bool_101_ or class348_sub42_sub17.method3267((-125).toByte(), i_102_)
                    bool_100_ = bool_100_ or class17.aBoolean242
                }
                if ((class17.aBoolean241 || Class28.aBoolean5002) && i != -1 && i < class17.anIntArray237.size) {
                    i_103_ = class17.anIntArray237[i]
                    val i_106_ = i_103_ ushr 16
                    i_103_ = i_103_ and 0xffff
                    val class348_sub42_sub17_107_: Class348_Sub42_Sub17?
                    if (i_105_ != i_106_) class348_sub42_sub17_107_ = class87.method839(i_103_ ushr 16, 3)
                    else class348_sub42_sub17_107_ = class348_sub42_sub17
                    if (class348_sub42_sub17_107_ != null) {
                        bool_99_ = bool_99_ or class348_sub42_sub17_107_.method3272(i_103_, 0)
                        bool = bool or class348_sub42_sub17_107_.method3271(i_103_, 14)
                        bool_101_ = bool_101_ or class348_sub42_sub17_107_.method3267((-123).toByte(), i_103_)
                    }
                }
                if (bool_99_) i_98_ = i_98_ or 0x80
                if (bool) i_98_ = i_98_ or 0x100
                if (bool_100_) i_98_ = i_98_ or 0x200
                if (bool_101_) i_98_ = i_98_ or 0x400
            }
            val l = i_95_.toLong() or ((i_93_ shl 16).toLong() or (i_92_.toLong() shl 32))
            var class64: Class64?
            synchronized(Class130.aClass60_1894!!) {
                class64 = Class130.aClass60_1894!!.method583(l, i_94_ xor 0x3bd4.inv()) as Class64?
            }
            if (class64 == null || var_ha!!.method3667(class64.ua(), i_98_) != 0) {
                if (class64 != null) i_98_ = var_ha!!.method3679(i_98_, class64.ua())
                var i_108_ = i_98_
                val class124s = arrayOfNulls<Class124>(3)
                var i_109_ = 0
                if (!class150!!.method1203(33.toByte(), i_95_).method342(114.toByte()) || !class150.method1203(33.toByte(), i_93_).method342(102.toByte()) || !class150.method1203(33.toByte(), i_92_).method342(94.toByte())) return null
                var class124 = class150.method1203(33.toByte(), i_95_).method343((-50).toByte())
                if (class124 != null) class124s[i_109_++] = class124
                class124 = class150.method1203(33.toByte(), i_93_).method343((-105).toByte())
                if (class124 != null) class124s[i_109_++] = class124
                class124 = class150.method1203(33.toByte(), i_92_).method343((-30).toByte())
                if (class124 != null) class124s[i_109_++] = class124
                class124 = Class124(class124s, i_109_)
                i_108_ = i_108_ or 0x4000
                class64 = var_ha!!.method3625(class124, i_108_, Class168.anInt2251, 64, 768)
                for (i_110_ in 0..4) {
                    var i_111_ = 0
                    while ((i_111_ < Class367_Sub2.aShortArrayArrayArray7290!!.size)) {
                        if (this.anIntArray2095!![i_110_] < (Class367_Sub2.aShortArrayArrayArray7290!![i_111_]!![i_110_])!!.size) class64.ia((Class136.aShortArrayArray4791!![i_111_]!![i_110_]), (Class367_Sub2.aShortArrayArrayArray7290!![i_111_]!![i_110_]!![(this.anIntArray2095!![i_110_])]))
                        i_111_++
                    }
                }
                class64.s(i_98_)
                synchronized(Class130.aClass60_1894!!) {
                    Class130.aClass60_1894!!.method582(class64, l, (-109).toByte())
                }
            }
            if (class17 == null) return class64
            if (i_94_ != -15331) return null
            class64 = class64.method614(4.toByte(), i_98_, true)
            class64 = class17.method269(-32, class64!!, i, i_96_, i_91_, i_97_)
            return class64
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.G(" + i + ',' + i_91_ + ',' + i_92_ + ',' + i_93_ + ',' + (if (class87 != null) "{...}" else "null") + ',' + (if (class150 != null) "{...}" else "null") + ',' + i_94_ + ',' + i_95_ + ',' + i_96_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_97_ + ',' + (if (class17 != null) "{...}" else "null") + ')'))
        }
    }

    fun method1233(class150: Class150?, i: Int, i_112_: Int, i_113_: Int) {
        try {
            anInt2098++
            val i_114_ = Class283.anIntArray3661!![i_113_]
            if (class150!!.method1203(33.toByte(), i) != null) {
                if (i_112_ != -1) aLong2094 = -53L
                anIntArray2092!![i_114_] = Class273.method2057(i, -2147483648)
                method1234(-54)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.D(" + (if (class150 != null) "{...}" else "null") + ',' + i + ',' + i_112_ + ',' + i_113_ + ')'))
        }
    }

    private fun method1234(i: Int) {
        anInt2096++
        aLong2102 = -1L
        val ls = Class348_Sub40_Sub21.aLongArray9283
        aLong2102 = ls!![(((anInt2103 shr 8).toLong() xor aLong2102) and 0xffL).toInt()] xor (aLong2102 ushr 8)
        if (i > -6) aLong2094 = 43L
        aLong2102 = aLong2102 ushr 8 xor ls[(0xffL and (anInt2103.toLong() xor aLong2102)).toInt()]
        for (i_115_ in 0..11) {
            aLong2102 = (aLong2102 ushr 8 xor ls[(((anIntArray2092!![i_115_] shr 24).toLong() xor aLong2102) and 0xffL).toInt()])
            aLong2102 = ls[(0xffL and ((anIntArray2092!![i_115_] shr 16).toLong() xor aLong2102)).toInt()] xor (aLong2102 ushr 8)
            aLong2102 = (aLong2102 ushr 8 xor ls[(0xffL and (aLong2102 xor (anIntArray2092!![i_115_] shr 8).toLong())).toInt()])
            aLong2102 = (ls[(0xffL and (aLong2102 xor anIntArray2092!![i_115_].toLong())).toInt()] xor (aLong2102 ushr 8))
        }
        for (i_116_ in 0..4) aLong2102 = (ls[(0xffL and (aLong2102 xor (this.anIntArray2095!![i_116_]).toLong())).toInt()] xor (aLong2102 ushr 8))
        aLong2102 = (aLong2102 ushr 8 xor ls[(0xffL and (aLong2102 xor (if (!this.aBoolean2100) 0 else 1).toLong())).toInt()])
    }

    companion object {
        var anInt2090: Int = 0
        var anInt2091: Int = 0
        var anInt2096: Int = 0
        var anInt2097: Int = 0
        var anInt2098: Int = 0
        var anInt2099: Int = 0
        @JvmField
        var anInt2101: Int = 0
        var anInt2104: Int = 0
        @JvmField
        var aClass348_Sub49Array2105: Array<Class348_Sub49?>? = arrayOfNulls<Class348_Sub49>(2048)
        var anInt2106: Int = 0
        var anInt2107: Int = 0

        @JvmStatic
        fun method1235(i: Byte) {
            if (i.toInt() != 7) anInt2101 = -42
            aClass348_Sub49Array2105 = null
        }
    }
}
