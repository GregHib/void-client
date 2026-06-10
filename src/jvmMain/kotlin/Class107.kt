import Class14.Companion.method235
import Class239.Companion.method1713
import Class318_Sub1.Companion.method2385
import Class66.method703
import Class99.method882
import r.Companion.method3284

/* Class107 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class107 {
    @JvmField
    var aClass348_Sub42_1647: Class348_Sub42 = Class348_Sub42()
    private var aClass348_Sub42_1652: Class348_Sub42? = null
    fun method1002(i: Int): Int {
        anInt1643++
        var i_0_ = i
        var class348_sub42 = (aClass348_Sub42_1647.aClass348_Sub42_7063)
        while (this.aClass348_Sub42_1647 !== class348_sub42) {
            i_0_++
            class348_sub42 = class348_sub42!!.aClass348_Sub42_7063
        }
        return i_0_
    }

    fun method1003(i: Byte): Class348_Sub42? {
        anInt1644++
        if (i <= 41) return null
        val class348_sub42 = aClass348_Sub42_1652
        if (class348_sub42 === this.aClass348_Sub42_1647) {
            aClass348_Sub42_1652 = null
            return null
        }
        aClass348_Sub42_1652 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    fun method1005(bool: Boolean, class348_sub42: Class348_Sub42) {
        if (class348_sub42.aClass348_Sub42_7060 != null) class348_sub42.method3162(bool)
        anInt1654++
        class348_sub42.aClass348_Sub42_7063 = this.aClass348_Sub42_1647
        class348_sub42.aClass348_Sub42_7060 = (aClass348_Sub42_1647.aClass348_Sub42_7060)
        if (bool == true) {
            class348_sub42.aClass348_Sub42_7060!!.aClass348_Sub42_7063 = class348_sub42
            class348_sub42.aClass348_Sub42_7063!!.aClass348_Sub42_7060 = class348_sub42
        }
    }

    fun method1008(i: Int): Class348_Sub42? {
        if (i != 20) aClass348_Sub42_1652 = null
        anInt1653++
        val class348_sub42 = (aClass348_Sub42_1647.aClass348_Sub42_7063)
        if (class348_sub42 === this.aClass348_Sub42_1647) return null
        class348_sub42!!.method3162(true)
        return class348_sub42
    }

    fun method1009(i: Int) {
        anInt1646++
        if (i == 2110355138) {
            while (true) {
                val class348_sub42 = (aClass348_Sub42_1647.aClass348_Sub42_7063)
                if (this.aClass348_Sub42_1647 === class348_sub42) break
                class348_sub42!!.method3162(true)
            }
            aClass348_Sub42_1652 = null
        }
    }

    fun method1011(i: Int): Class348_Sub42? {
        if (i > -23) method1006(false, ((-34).toByte()).toByte())
        anInt1649++
        val class348_sub42 = (aClass348_Sub42_1647.aClass348_Sub42_7063)
        if (class348_sub42 === this.aClass348_Sub42_1647) {
            aClass348_Sub42_1652 = null
            return null
        }
        aClass348_Sub42_1652 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    init {
        aClass348_Sub42_1647.aClass348_Sub42_7060 = this.aClass348_Sub42_1647
        aClass348_Sub42_1647.aClass348_Sub42_7063 = this.aClass348_Sub42_1647
    }

    companion object {
        @JvmField
        var anInt1642: Int = 0
        @JvmField
        var anInt1643: Int = 0
        @JvmField
        var anInt1644: Int = 0
        var anInt1645: Int = -2
        @JvmField
        var anInt1646: Int = 0
        @JvmField
        var anInt1648: Int = 0
        @JvmField
        var anInt1649: Int = 0
        var anIntArray1650: IntArray? = IntArray(1000)
        @JvmField
        var anInt1651: Int = 0
        @JvmField
        var anInt1653: Int = 0
        @JvmField
        var anInt1654: Int = 0
        @JvmField
        var anInt1655: Int = 0

        @JvmStatic
        fun method1004(i: Byte) {
            anIntArray1650 = null
            if (i.toInt() != 16) method1006(false, ((-62).toByte()).toByte())
        }

        @JvmStatic
        fun method1006(bool: Boolean, i: Byte) {
            anInt1655++
            if (bool) {
                if (r.anInt9721 != -1) method235(r.anInt9721, ((-108).toByte()).toByte())
                var class348_sub41 = Class125.aClass356_4915!!.method3484(0) as? Class348_Sub41
                while (class348_sub41 != null) {
                    if (!class348_sub41.method2712(4.toByte())) {
                        class348_sub41 = (Class125.aClass356_4915!!.method3484(0) as? Class348_Sub41)
                        if (class348_sub41 == null) break
                    }
                    Class127_Sub1.method1118(true, false, class348_sub41, 2533)
                    class348_sub41 = (Class125.aClass356_4915!!.method3482(0) as? Class348_Sub41)
                }
                r.anInt9721 = -1
                Class125.aClass356_4915 = Class356(8)
                method882(11.toByte())
                r.anInt9721 = Class54.anInt970
                method1713(false, 520)
                Class354.method3466(-119)
                method703(r.anInt9721)
            }
            Class223.aBoolean2895 = true
            if (i < 49) anInt1651 = 10
        }

        fun method1007(class46: Class46?, var_ha: ha?, i: Int, i_1_: Int, i_2_: Int) {
            try {
                anInt1648++
                val var_aa = class46!!.method425(var_ha!!, 40.toByte())
                if (var_aa != null) {
                    if (i_2_ != 22960) anIntArray1650 = null
                    var_ha.KA(i, i_1_, i + class46.anInt709, class46.anInt789 + i_1_)
                    if (Class259.anInt3306 != 2 && Class259.anInt3306 != 5 && Class108.aClass105_1664 != null) {
                        val i_3_: Int
                        val i_4_: Int
                        val i_5_: Int
                        val i_6_: Int
                        if (Class348_Sub40_Sub21.anInt9282 == 4) {
                            i_3_ = Class348_Sub7.anInt6652
                            i_4_ = Class348_Sub6.anInt6633
                            i_5_ = 4096
                            i_6_ = 0x3fff and -Class314.aFloat3938.toInt()
                        } else {
                            i_5_ = 4096 - 16 * Class348_Sub49_Sub1.anInt9750
                            i_3_ = (Class132.aPlayer_1907!!.y)
                            i_6_ = (-Class314.aFloat3938.toInt() - -r_Sub2.anInt10483 and 0x3fff)
                            i_4_ = (Class132.aPlayer_1907!!.x)
                        }
                        val i_7_ = 48 - (-(i_4_ / 128) - -(Class367_Sub4.anInt7319 * 2)) - -208
                        val i_8_ = (208 - (Class348_Sub40_Sub3.anInt9109 * 2 - 48) + 4 * Class348_Sub40_Sub3.anInt9109 - i_3_ / 128)
                        Class108.aClass105_1664!!.method967((class46.anInt709.toFloat() / 2.0f + i.toFloat()), (class46.anInt789.toFloat() / 2.0f + i_1_.toFloat()), i_7_.toFloat(), i_8_.toFloat(), i_5_, i_6_ shl 2, var_aa, i, i_1_)
                        var class348_sub35 = Class318_Sub1_Sub5_Sub1.aClass262_10125!!.method1995(i_2_ xor 0x59b4) as? Class348_Sub35
                        while (class348_sub35 != null) {
                            val i_9_ = class348_sub35.anInt6976
                            val i_10_ = (-za_Sub2.regionTileX + ((0xfffe5b0 and (r_Sub2.aClass252_10488!!.anIntArray3238!![i_9_])) shr 14))
                            val i_11_ = (-Class90.regionTileY + (0x3fff and (r_Sub2.aClass252_10488!!.anIntArray3238!![i_9_])))
                            val i_12_ = -(i_4_ / 128) + 2 + 4 * i_10_
                            val i_13_ = 2 + (4 * i_11_ - i_3_ / 128)
                            method2385(class46, i_1_, var_aa, (r_Sub2.aClass252_10488!!.anIntArray3239!![i_9_]), i_12_, i, ((-94).toByte()).toByte(), i_13_, var_ha)
                            class348_sub35 = Class318_Sub1_Sub5_Sub1.aClass262_10125!!.method1990(92.toByte()) as? Class348_Sub35
                        }
                        var i_14_ = 0
                        while ((Class348_Sub40_Sub38.anInt9479 > i_14_)) {
                            val i_15_ = (Class348_Sub15.anIntArray6770!![i_14_] * 4 - -2 - i_4_ / 128)
                            val i_16_ = (-(i_3_ / 128) + Class348_Sub40_Sub37.anIntArray9458!![i_14_] * 4 - -2)
                            var class51: Class51? = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, Class263.anIntArray3347!![i_14_]))
                            if (class51!!.anIntArray945 != null) {
                                class51 = class51.method480((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), 47.toByte())
                                if (class51 == null || (class51.anInt921 == -1)) {
                                    i_14_++
                                    continue
                                }
                            }
                            method2385(class46, i_1_, var_aa, class51.anInt921, i_15_, i, ((-113).toByte()).toByte(), i_16_, var_ha)
                            i_14_++
                        }
                        var class348_sub37 = Class130.aClass356_1895!!.method3484(i_2_ xor 0x59b0) as? Class348_Sub37
                        while (class348_sub37 != null) {
                            val i_17_ = (0x3L and ((class348_sub37.aLong4291) shr 28)).toInt()
                            if (Class334.anInt4155 == i_17_) {
                                val i_18_ = (-za_Sub2.regionTileX + ((class348_sub37.aLong4291) and 0x3fffL).toInt())
                                val i_19_ = (-Class90.regionTileY + ((class348_sub37.aLong4291) shr 14 and 0x3fffL).toInt())
                                val i_20_ = -(i_4_ / 128) + (2 + i_18_ * 4)
                                val i_21_ = -(i_3_ / 128) + (2 + i_19_ * 4)
                                Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742!![0]), i, class46, var_aa, i_21_, i_2_ xor 0x59b2, i_20_)
                            }
                            class348_sub37 = (Class130.aClass356_1895!!.method3482(0) as? Class348_Sub37)
                        }
                        var i_22_ = 0
                        while ((i_22_ < Class150.anInt2057)) {
                            val class348_sub22 = ((Class282.aClass356_3654!!.method3480(Class74.anIntArray1233!![i_22_].toLong(), -6008)) as? Class348_Sub22)
                            if (class348_sub22 != null) {
                                val npc = (class348_sub22.aNpc_6859)!!
                                if (npc.method2445(((-126).toByte()).toByte()) && ((npc.plane) == (Class132.aPlayer_1907!!.plane))) {
                                    var class79 = (npc.aClass79_10505)
                                    if (class79 != null && (class79.anIntArray1377 != null)) class79 = (class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), -1))
                                    if (class79 != null && class79.aBoolean1397 && class79.aBoolean1396) {
                                        val i_23_ = (-(i_4_ / 128) + (npc.x) / 128)
                                        val i_24_ = ((npc.y) / 128 + -(i_3_ / 128))
                                        if (class79.anInt1383 != -1) method2385(class46, i_1_, var_aa, class79.anInt1383, i_23_, i, ((-73).toByte()).toByte(), i_24_, var_ha)
                                        else Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742!![1]), i, class46, var_aa, i_24_, 2, i_23_)
                                    }
                                }
                            }
                            i_22_++
                        }
                        val i_25_ = Class328_Sub1.anInt6513
                        val `is` = Class286_Sub7.anIntArray6290
                        for (i_26_ in 0..<i_25_) {
                            val player = (Class294.aPlayerArray5058!![`is`!![i_26_]])
                            if (player != null && player.method2457(37.toByte()) && !player.aBoolean10551 && (Class132.aPlayer_1907 != player) && (player.plane == (Class132.aPlayer_1907!!.plane))) {
                                val i_27_ = (-(i_4_ / 128) + (player.x) / 128)
                                val i_28_ = (-(i_3_ / 128) + (player.y) / 128)
                                var bool = false
                                var i_29_ = 0
                                while ((Class348_Sub40_Sub30.anInt9383 > i_29_)) {
                                    if ((player.aString10544 == Class83.aStringArray1441!![i_29_]) && (ha.anIntArray4578!![i_29_] != 0)) {
                                        bool = true
                                        break
                                    }
                                    i_29_++
                                }
                                var bool_30_ = false
                                var i_31_ = 0
                                while (Class37.anInt496 > i_31_) {
                                    if (player.aString10544 == Class169.aClass19Array2261!![i_31_]!!.aString306) {
                                        bool_30_ = true
                                        break
                                    }
                                    i_31_++
                                }
                                var bool_32_ = false
                                if ((Class132.aPlayer_1907!!.anInt10542) != 0 && (player.anInt10542 != 0) && (player.anInt10542 == (Class132.aPlayer_1907!!.anInt10542))) bool_32_ = true
                                if (!player.aBoolean10554) {
                                    if (!bool) {
                                        if (bool_30_) Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742!![5]), i, class46, var_aa, i_28_, i_2_ + -22958, i_27_)
                                        else if (!bool_32_) Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742!![2]), i, class46, var_aa, i_28_, 2, i_27_)
                                        else Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742!![4]), i, class46, var_aa, i_28_, 2, i_27_)
                                    } else Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742!![3]), i, class46, var_aa, i_28_, 2, i_27_)
                                } else Class151.method1211(i_1_, (Class348_Sub12.aClass105Array6742!![6]), i, class46, var_aa, i_28_, i_2_ + -22958, i_27_)
                            }
                        }
                        val class302s = Class348_Sub27.aClass302Array6897
                        var i_33_ = 0
                        while ((i_33_ < class302s!!.size)) {
                            val class302 = class302s[i_33_]
                            if (class302 != null && (class302.anInt3840 != 0) && Class367_Sub11.anInt7396 % 20 < 10) {
                                if (class302.anInt3840 == 1) {
                                    val class348_sub22 = ((Class282.aClass356_3654!!.method3480(class302.anInt3833.toLong(), -6008)) as? Class348_Sub22)
                                    if (class348_sub22 != null) {
                                        val npc = (class348_sub22.aNpc_6859)!!
                                        val i_34_ = (-(i_4_ / 128) + (npc.x) / 128)
                                        val i_35_ = (-(i_3_ / 128) + (npc.y) / 128)
                                        Class287.method2181(360000L, i_1_, -125, i_35_, i, class46, i_34_, (class302.anInt3831), var_aa)
                                    }
                                }
                                if (class302.anInt3840 == 2) {
                                    val i_36_ = (-(i_4_ / 128) + (class302.anInt3835 / 128))
                                    val i_37_ = (-(i_3_ / 128) + (class302.anInt3832 / 128))
                                    var l = (class302.anInt3837 shl 7).toLong()
                                    l *= l
                                    Class287.method2181(l, i_1_, -112, i_37_, i, class46, i_36_, (class302.anInt3831), var_aa)
                                }
                                if ((class302.anInt3840 == 10) && class302.anInt3833 >= 0 && (class302.anInt3833 < (Class294.aPlayerArray5058)!!.size)) {
                                    val player = (Class294.aPlayerArray5058!![class302.anInt3833])
                                    if (player != null) {
                                        val i_38_ = (-(i_4_ / 128) + (player.x) / 128)
                                        val i_39_ = (-(i_3_ / 128) + (player.y) / 128)
                                        Class287.method2181(360000L, i_1_, -121, i_39_, i, class46, i_38_, (class302.anInt3831), var_aa)
                                    }
                                }
                            }
                            i_33_++
                        }
                        if (Class348_Sub40_Sub21.anInt9282 != 4) {
                            if (Class248.anInt3203 != 0) {
                                val i_40_ = (-(i_4_ / 128) + (Class248.anInt3203 * 4 + 2) - (-(2 * Class132.aPlayer_1907!!.method2436(77.toByte())) - -2))
                                val i_41_ = (4 * Class97.anInt1548 - (-2 + i_3_ / 128) + (2 * (Class132.aPlayer_1907!!.method2436(59.toByte()) - 1)))
                                Class151.method1211(i_1_, (Class25.aClass105Array367!![(if (!Class348_Sub13.aBoolean6759) 0 else 1)]), i, class46, var_aa, i_41_, 2, i_40_)
                            }
                            if (!Class132.aPlayer_1907!!.aBoolean10551) var_ha.method3675(3, ((-125).toByte()).toByte(), -1 + (i - -((class46.anInt709) / 2)), -1 + ((class46.anInt789) / 2 + i_1_), 3, -1)
                        }
                    } else var_ha.A(-16777216, var_aa, i, i_1_)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("mn.F(" + (if (class46 != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ')'))
            }
        }

        fun method1010(bool: Boolean, bool_42_: Boolean) {
            r.aClass101_9720!!.method898(Class21.aHa326!!.method3640())
            anInt1642++
            val `is` = Class21.aHa326!!.Y()
            Class14_Sub3.anInt8630 = `is`[2]
            Class248.anInt3202 = `is`[0]
            Class27.anInt394 = `is`[3]
            Class239_Sub5.anInt5886 = `is`[1]
            if (bool_42_) {
                Class21.aHa326!!.DA(Class94.anInt1537, Class318_Sub5.anInt6417, Class193.anInt2590, Class129.anInt1879)
                method3284(true, Class318_Sub1_Sub5_Sub1.aDouble10120)
            } else {
                Class21.aHa326!!.DA(Class120.anInt4910, Class328_Sub1_Sub1.anInt8799, Class286_Sub5.anInt6255, OutputStream_Sub1.anInt95)
                method3284(true, Class14_Sub2.aDouble8621)
            }
            if (bool != false) method1010(true, true)
        }
    }
}
