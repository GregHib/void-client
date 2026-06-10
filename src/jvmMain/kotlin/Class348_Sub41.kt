import Class177.Companion.method1353
import Class212.method1547
import Class239_Sub26.Companion.method1836
import Class250.Companion.method1911
import Class267.Companion.method2028
import Class348_Sub16_Sub3.Companion.method2878
import Class348_Sub40_Sub39.Companion.method3153
import Class50_Sub2.Companion.method464
import Class75.Companion.method766
import Class76.Companion.method773
import r_Sub2.Companion.method3297
import kotlin.math.abs

/* Class348_Sub41 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub41 : Class348() {
    @JvmField
    var anInt7050: Int = 0
    @JvmField
    var anInt7053: Int = 0

    companion object {
        var anInt7046: Int = 0
        var anInt7047: Int = 0
        var aString7048: String? = null
        var anInt7049: Int = 0
        var anInt7051: Int = 0
        var aClass114_7052: Class114? = Class114(86, 6)
        @JvmField
        var anInt7054: Int = 0
        var anInt7055: Int = 0

        /*synthetic*/
        var aClass7056: Class<*>? = null

        fun method3154(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, `is`: ByteArray?, i_3_: Byte): Boolean {
            anInt7047++
            if (i_3_.toInt() != 39) aClass114_7052 = null
            var bool = true
            val class348_sub49 = Class348_Sub49(`is`)
            var i_4_ = -1
            while (true) {
                val i_5_ = class348_sub49.method3334(107)
                if (i_5_ == 0) break
                i_4_ += i_5_
                var i_6_ = 0
                var bool_7_ = false
                while (true) {
                    if (bool_7_) {
                        val i_8_ = class348_sub49.readSmart(-118)
                        if (i_8_ == 0) break
                        class348_sub49.readUnsignedByte(255)
                    } else {
                        val i_9_ = class348_sub49.readSmart(i_3_.toInt() xor 0x58.inv())
                        if (i_9_ == 0) break
                        i_6_ += -1 + i_9_
                        val i_10_ = i_6_ and 0x3f
                        val i_11_ = i_6_ shr 6 and 0x3f
                        val i_12_ = class348_sub49.readUnsignedByte(255) shr 2
                        val i_13_ = i_11_ - -i_0_
                        val i_14_ = i_2_ + i_10_
                        if (i_13_ > 0 && i_14_ > 0 && i_13_ < -1 + i && -1 + i_1_ > i_14_) {
                            val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, i_4_)
                            if (i_12_ != 22 || Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1737(-32350) != 0 || class51.anInt874 != 0 || (class51.anInt920 == 1) || class51.aBoolean947) {
                                bool_7_ = true
                                if (!class51.method485(9773)) {
                                    Class154.anInt2101++
                                    bool = false
                                }
                            }
                        }
                    }
                }
            }
            return bool
        }

        @JvmStatic
        fun method3155(i: Int) {
            aString7048 = null
            aClass114_7052 = null
            if (i != -5) anInt7054 = 110
        }

        fun method3156(bool: Boolean, string: String): Int {
            anInt7055++
            if (bool != true) aClass114_7052 = null
            return method1836(-123, 10, true, string)
        }

        fun method3157(i: Int, i_15_: Byte, i_16_: Int, i_17_: Int, bool: Boolean) {
            anInt7049++
            if (bool || i_16_ != ha.anInt4581 || Class327.anInt4095 != i || (Class355.anInt4372 != Class167.anInt2204 && Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) != 1)) {
                ha.anInt4581 = i_16_
                Class327.anInt4095 = i
                Class167.anInt2204 = Class355.anInt4372
                if (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 1) Class167.anInt2204 = 0
                Class348_Sub49.method3379(2, i_17_)
                Class362.method3511(true, Applet_Sub1.aClass324_20, Class246.aClass143_3179, Class274.aClass274_3495!!.method2063(Class348_Sub33.Companion.anInt6967, 544), 2, Class348_Sub8.aHa6654)
                val i_18_ = za_Sub2.regionTileX
                val i_19_ = Class90.regionTileY
                za_Sub2.regionTileX = (-(Class367_Sub4.anInt7319 shr 4) + ha.anInt4581) * 8
                Class90.regionTileY = 8 * (Class327.anInt4095 - (Class348_Sub40_Sub3.anInt9109 shr 4))
                Class348_Sub26.Companion.aClass348_Sub42_Sub14_6885 = method766(ha.anInt4581 * 8, Class327.anInt4095 * 8)
                r_Sub2.aClass252_10488 = null
                val i_20_ = za_Sub2.regionTileX - i_18_
                val i_21_ = -i_19_ + Class90.regionTileY
                if (i_17_ == 11) {
                    var i_22_ = 0
                    while (Class348_Sub32.Companion.anInt6930 > i_22_) {
                        val class348_sub22 = Class348_Sub40_Sub23.aClass348_Sub22Array9319!![i_22_]
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)!!
                            for (i_23_ in 0..9) {
                                npc.anIntArray10320!![i_23_] -= i_20_
                                npc.anIntArray10317!![i_23_] -= i_21_
                            }
                            npc.y -= i_21_ * 512
                            npc.x -= i_20_ * 512
                        }
                        i_22_++
                    }
                } else {
                    Class150.anInt2057 = 0
                    var bool_24_ = false
                    val i_25_ = Class367_Sub4.anInt7319 * 512 - 512
                    val i_26_ = 512 * (-1 + Class348_Sub40_Sub3.anInt9109)
                    var i_27_ = 0
                    while ((Class348_Sub32.Companion.anInt6930 > i_27_)) {
                        val class348_sub22 = Class348_Sub40_Sub23.aClass348_Sub22Array9319!![i_27_]
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)!!
                            npc.y -= 512 * i_21_
                            npc.x -= 512 * i_20_
                            if ((npc.x) < 0 || i_25_ < (npc.x) || (npc.y) < 0 || i_26_ < (npc.y)) {
                                npc.method2448(null, -2)
                                class348_sub22.method2715(80.toByte())
                                bool_24_ = true
                            } else {
                                var bool_28_ = true
                                for (i_29_ in 0..9) {
                                    npc.anIntArray10320!![i_29_] -= i_20_
                                    npc.anIntArray10317!![i_29_] -= i_21_
                                    if ((npc.anIntArray10320!![i_29_]) < 0 || ((npc.anIntArray10320!![i_29_]) >= Class367_Sub4.anInt7319) || (npc.anIntArray10317!![i_29_]) < 0 || (Class348_Sub40_Sub3.anInt9109 <= (npc.anIntArray10317!![i_29_]))) bool_28_ = false
                                }
                                if (!bool_28_) {
                                    npc.method2448(null, -2)
                                    bool_24_ = true
                                    class348_sub22.method2715(113.toByte())
                                } else Class74.anIntArray1233!![Class150.anInt2057++] = (npc.anInt10290)
                            }
                        }
                        i_27_++
                    }
                    if (bool_24_) {
                        Class348_Sub32.Companion.anInt6930 = Class282.aClass356_3654!!.method3474(1)
                        Class282.aClass356_3654!!.method3477(3, Class348_Sub40_Sub23.aClass348_Sub22Array9319!! as Array<Class348?>)
                    }
                }
                if (i_15_ > 122) {
                    for (i_30_ in 0..2047) {
                        val player = (Class294.aPlayerArray5058!![i_30_])
                        if (player != null) {
                            for (i_31_ in 0..9) {
                                player.anIntArray10320!![i_31_] -= i_20_
                                player.anIntArray10317!![i_31_] -= i_21_
                            }
                            player.x -= i_20_ * 512
                            player.y -= 512 * i_21_
                        }
                    }
                    val class302s: Array<Class302?> = Class348_Sub27.Companion.aClass302Array6897!!
                    var i_32_ = 0
                    while (class302s.size > i_32_) {
                        val class302 = class302s[i_32_]
                        if (class302 != null) {
                            class302.anInt3832 -= i_21_ * 512
                            class302.anInt3835 -= 512 * i_20_
                        }
                        i_32_++
                    }
                    var class348_sub27 = (Class348_Sub42_Sub20.aClass262_9711!!.method1995(4) as? Class348_Sub27?)
                    while (class348_sub27 != null) {
                        class348_sub27.anInt6896 -= i_21_
                        class348_sub27.anInt6905 -= i_20_
                        if (Class312.anInt3931 != 4 && (class348_sub27.anInt6905 < 0 || class348_sub27.anInt6896 < 0 || (class348_sub27.anInt6905 >= Class367_Sub4.anInt7319) || (Class348_Sub40_Sub3.anInt9109 <= (class348_sub27.anInt6896)))) class348_sub27.method2715(101.toByte())
                        class348_sub27 = Class348_Sub42_Sub20.aClass262_9711!!.method1990(68.toByte()) as? Class348_Sub27?
                    }
                    if (Class312.anInt3931 != 4) {
                        var class348_sub37 = (Class130.aClass356_1895!!.method3484(0) as? Class348_Sub37?)
                        while (class348_sub37 != null) {
                            val i_33_ = (0x3fffL and class348_sub37.aLong4291).toInt()
                            val i_34_ = -za_Sub2.regionTileX + i_33_
                            val i_35_ = (0x3fffL and (class348_sub37.aLong4291 shr 14)).toInt()
                            val i_36_ = i_35_ + -Class90.regionTileY
                            if (i_34_ < 0 || i_36_ < 0 || (i_34_ >= Class367_Sub4.anInt7319) || i_36_ >= Class348_Sub40_Sub3.anInt9109) class348_sub37.method2715(37.toByte())
                            class348_sub37 = (Class130.aClass356_1895!!.method3482(0) as? Class348_Sub37?)
                        }
                    }
                    if (Class248.anInt3203 != 0) {
                        Class248.anInt3203 -= i_20_
                        Class97.anInt1548 -= i_21_
                    }
                    Class348_Sub17.Companion.method2928(true)
                    if (i_17_ != 11) {
                        Class275.anInt3550 -= i_21_
                        Class286_Sub4.anInt6246 -= 512 * i_20_
                        Class352.anInt4336 -= i_20_
                        Class281.anInt3647 -= i_21_
                        Class348_Sub35.Companion.anInt6981 -= i_20_
                        Class59_Sub2_Sub2.anInt8685 -= 512 * i_21_
                        if ((Class367_Sub4.anInt7319 < abs(i_20_)) || abs(i_21_) > Class348_Sub40_Sub3.anInt9109) method773(true)
                    } else if (Class348_Sub40_Sub21.anInt9282 == 4) {
                        Class348_Sub7.anInt6652 -= i_21_ * 512
                        Class130_Sub1.anInt5799 -= i_20_ * 512
                        Class192.anInt2578 -= 512 * i_21_
                        Class348_Sub6.anInt6633 -= i_20_ * 512
                    } else {
                        Class348_Sub40_Sub21.anInt9282 = 1
                        Class318_Sub1_Sub5_Sub2.anInt10163 = -1
                        Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163
                    }
                    method3153(0)
                    method464(-1)
                    r_Sub2.aClass262_10492!!.method1996(107)
                    Class348_Sub40_Sub17.aClass262_9240!!.method1996(103)
                    Class225.aClass243_2957!!.method1876((-45).toByte())
                    method1911(99.toByte())
                }
            }
        }

        fun method3158(`is`: ByteArray?, i: Int): ByteArray {
            anInt7046++
            val class348_sub49 = Class348_Sub49(`is`)
            val i_37_ = class348_sub49.readUnsignedByte(255)
            val i_38_ = class348_sub49.readInt((-126).toByte())
            if (i_38_ < 0 || (Class29.anInt401 != 0 && i_38_ > Class29.anInt401)) {
                throw RuntimeException()
            }
            if (i_37_ != 0) {
                val i_39_ = class348_sub49.readInt((-126).toByte())
                if (i_39_ < 0 || (Class29.anInt401 != 0 && i_39_ > Class29.anInt401) || i_39_ > 10000000) {
                    return ByteArray(4)
                }
                val is_40_ = ByteArray(i_39_)
                if (i_37_ == 1) method1547(is_40_, i_39_, `is`, i_38_, 9)
                else {
                    synchronized(Class348_Sub33.Companion.aClass152_6955!!) {
                        Class348_Sub33.Companion.aClass152_6955!!.method1218(is_40_, 29123, class348_sub49)
                    }
                }
                return is_40_
            }
            val is_41_ = ByteArray(i_38_)
            class348_sub49.method3389(2147483647, 0, i_38_, is_41_)
            return is_41_
        }

        fun method3159(i: Int, i_42_: Int, bool: Boolean, i_43_: Int, i_44_: Int, i_45_: Int, var_ha: ha, i_46_: Int, i_47_: Int) {
            anInt7051++
            var interface10 = method3297(i_43_, i_45_, i_44_) as Interface10?
            if (interface10 != null) {
                val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, interface10.method42(-124))
                val i_48_ = 0x3 and interface10.method41(-32228)
                val i_49_ = interface10.method39(35)
                if (class51.anInt875 == -1) {
                    var i_50_ = i_47_
                    if (class51.anInt874 > 0) i_50_ = i
                    if (i_49_ == 0 || i_49_ == 2) {
                        if (i_48_ != 0) {
                            if (i_48_ == 1) var_ha.method3649((-79).toByte(), 4, i_42_, i_50_, i_46_)
                            else if (i_48_ == 2) var_ha.method3660(3 + i_46_, i_50_, 4, i_42_, true)
                            else if (i_48_ == 3) var_ha.method3649((-121).toByte(), 4, i_42_ + 3, i_50_, i_46_)
                        } else var_ha.method3660(i_46_, i_50_, 4, i_42_, !bool)
                    }
                    if (i_49_ == 3) {
                        if (i_48_ != 0) {
                            if (i_48_ == 1) var_ha.method3675(1, (-125).toByte(), 3 + i_46_, i_42_, 1, i_50_)
                            else if (i_48_ != 2) {
                                if (i_48_ == 3) var_ha.method3675(1, (-125).toByte(), i_46_, 3 + i_42_, 1, i_50_)
                            } else var_ha.method3675(1, (-125).toByte(), 3 + i_46_, 3 + i_42_, 1, i_50_)
                        } else var_ha.method3675(1, (-125).toByte(), i_46_, i_42_, 1, i_50_)
                    }
                    if (i_49_ == 2) {
                        if (i_48_ != 0) {
                            if (i_48_ == 1) var_ha.method3660(3 + i_46_, i_50_, 4, i_42_, true)
                            else if (i_48_ != 2) {
                                if (i_48_ == 3) var_ha.method3660(i_46_, i_50_, 4, i_42_, true)
                            } else var_ha.method3649((-106).toByte(), 4, 3 + i_42_, i_50_, i_46_)
                        } else var_ha.method3649((-96).toByte(), 4, i_42_, i_50_, i_46_)
                    }
                } else method2028(i_46_, class51, i_42_, var_ha, i_48_, 126)
            }
            if (bool != false) anInt7054 = 122
            interface10 = (method1353(i_43_, i_45_, i_44_, (if (aClass7056 != null) aClass7056 else (Interface10::class.java.also { aClass7056 = it }))) as Interface10?)
            if (interface10 != null) {
                val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, interface10.method42(-88))
                val i_51_ = interface10.method41(-32228) and 0x3
                val i_52_ = interface10.method39(-126)
                if (class51.anInt875 != -1) method2028(i_46_, class51, i_42_, var_ha, i_51_, -86)
                else if (i_52_ == 9) {
                    var i_53_ = -1118482
                    if (class51.anInt874 > 0) i_53_ = -1179648
                    if (i_51_ != 0 && i_51_ != 2) var_ha.method3645(i_42_, i_46_, 3 + i_46_, -8003, i_53_, i_42_ + 3)
                    else var_ha.method3645(i_42_ + 3, i_46_, 3 + i_46_, -8003, i_53_, i_42_)
                }
            }
            interface10 = method2878(i_43_, i_45_, i_44_) as Interface10?
            if (interface10 != null) {
                val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, interface10.method42(-118))
                val i_54_ = interface10.method41(-32228) and 0x3
                if (class51.anInt875 != -1) method2028(i_46_, class51, i_42_, var_ha, i_54_, -5)
            }
        }
    }
}
