import java.io.File

class Class239_Sub24 : Class239 {
    override fun method1712(i: Int, i_0_: Int) {
        val i_1_ = -73 % ((i - 82) / 35)
        this.anInt3138 = i_0_
        anInt6085++
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    fun method1820(i: Int): Int {
        if (i != -32350) return -43
        anInt6091++
        return this.anInt3138
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) return -20
        anInt6084++
        return 1
    }

    override fun method1714(i: Int, i_3_: Int): Int {
        anInt6092++
        if (this.aClass348_Sub51_3136.method3422(674) == Class10.aClass230_186) {
            if (this.aClass348_Sub51_3136.method3425(i + -70)) return 3
            if (i_3_ == 0 || this.aClass348_Sub51_3136.aClass239_Sub9_7256!!.method1759(-32350) == 1) return 1
            return 2
        }
        if (i != 3) method1716(true)
        return 3
    }

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.method3422(674) != Class10.aClass230_186) this.anInt3138 = 1
        else if (this.aClass348_Sub51_3136.method3425(-95)) this.anInt3138 = 0
        anInt6090++
        if (this.anInt3138 != 0 && this.anInt3138 != 1) this.anInt3138 = method1710(20014)
        if (bool != false) aClass60_6096 = null
    }

    fun method1824(i: Int): Boolean {
        anInt6087++
        if (this.aClass348_Sub51_3136.method3422(674) == Class10.aClass230_186) {
            return !this.aClass348_Sub51_3136.method3425(-96)
        }
        return false
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    companion object {
        @JvmField
        var anInt6084: Int = 0
        @JvmField
        var anInt6085: Int = 0
        @JvmField
        var anInt6086: Int = 0
        @JvmField
        var anInt6087: Int = 0
        @JvmField
        var anInt6088: Int = 0
        @JvmField
        var aClass114_6089: Class114? = Class114(41, 3)
        @JvmField
        var anInt6090: Int = 0
        @JvmField
        var anInt6091: Int = 0
        @JvmField
        var anInt6092: Int = 0
        @JvmField
        var aStringArrayArray6093: Array<Array<String?>?>? = arrayOf<Array<String?>?>(arrayOf<String?>("M1", "M2", "S1", "F"), arrayOf<String?>("M1", "M2", "M3", "S1", "S2", "F"), arrayOf<String?>("M1", "M2", "M3", "M4", "S1", "S2", "S3", "F"))
        @JvmField
        var anInt6094: Int = 0
        @JvmField
        var anInt6095: Int = 0
        @JvmField
        var aClass60_6096: Class60? = Class60(8)
        @JvmField
        var aClass105_6097: Class105? = null
        @JvmField
        var aClass299_6098: Class299? = null

        @JvmStatic
        fun method1821(i: Int, file: File): ByteArray? {
            anInt6086++
            val i_2_ = 34 % ((i - 31) / 39)
            return Class327.method2607(file.length().toInt(), file, 121)
        }

        @JvmStatic
        fun method1822(i: Byte) {
            aClass114_6089 = null
            aClass60_6096 = null
            aClass105_6097 = null
            aStringArrayArray6093 = null
            aClass299_6098 = null
            if (i.toInt() != 110) aClass299_6098 = null
        }

        @JvmStatic
        fun method1823(var_ha: ha, i: Int, i_4_: Int, i_5_: Byte) {
            anInt6088++
            val i_6_ = 56 % ((68 - i_5_) / 58)
            if (i >= 0 && i_4_ >= 0 && Class18.anInt282 != 0 && Class305.anInt3861 != 0) {
                val class101: Class101
                val i_7_: Int
                val i_8_: Int
                var i_9_: Int
                var i_10_: Int
                val i_11_: Int
                val i_12_: Int
                if (Class59_Sub1.aBoolean5300) {
                    Class107.method1010(false, false)
                    class101 = var_ha.method3640()!!
                    val `is` = var_ha.Y()
                    i_7_ = `is`[0]
                    i_8_ = `is`[1]
                    i_9_ = `is`[3]
                    i_10_ = `is`[2]
                    i_11_ = i + Class121.method1082(-81, false)
                    i_12_ = Class348_Sub23.method2960(false, -52) + i_4_
                } else {
                    var_ha.DA(Class336.anInt4171, Class205.anInt2688, Class18.anInt282, Class305.anInt3861)
                    i_8_ = Class205.anInt2688
                    i_9_ = Class305.anInt3861
                    i_7_ = Class336.anInt4171
                    i_10_ = Class18.anInt282
                    var_ha.KA(Class120.anInt4911, Class238_Sub1.anInt5832, Class18.anInt282, Class305.anInt3861)
                    class101 = var_ha.method3654()
                    class101.method903(Class14_Sub4.anInt8633, Class59_Sub2_Sub1.anInt8668, Class43.anInt620, Class348_Sub44.anInt7092, Class281.anInt3650, Class348_Sub51.anInt7244)
                    var_ha.method3638(class101)
                    i_12_ = i_4_
                    i_11_ = i
                }
                Class226.method1626(1, true)
                if (i_10_ == 0) i_10_ = 1
                if (i_9_ == 0) i_9_ = 1
                if (Class348_Sub1_Sub1.aSArray8801 != null && (!r.aBoolean9722 || (0x40 and Class38.anInt500) != 0)) {
                    var i_13_ = -1
                    var i_14_ = -1
                    val i_15_ = var_ha.i()
                    val i_16_ = var_ha.XA()
                    val i_17_: Int
                    val i_18_: Int
                    val i_19_: Int
                    val i_20_: Int
                    if (Class305.aBoolean3870) {
                        i_18_ = Class132.anInt1906 * (-i_7_ + i_11_) / i_10_
                        i_17_ = i_18_
                        i_20_ = Class132.anInt1906 * (-i_8_ + i_12_) / i_9_
                        i_19_ = i_20_
                    } else {
                        i_17_ = i_15_ * (-i_7_ + i_11_) / i_10_
                        i_19_ = i_15_ * (i_12_ + -i_8_) / i_9_
                        i_20_ = i_16_ * (-i_8_ + i_12_) / i_9_
                        i_18_ = (i_11_ - i_7_) * i_16_ / i_10_
                    }
                    val `is` = intArrayOf(i_17_, i_19_, i_15_)
                    val is_21_ = intArrayOf(i_18_, i_20_, i_16_)
                    class101.method890(`is`)
                    class101.method890(is_21_)
                    val f = Class108.method1012(`is`[1].toFloat(), is_21_[0].toFloat(), `is`[2].toFloat(), is_21_[2].toFloat(), 4, `is`[0].toFloat(), 123.toByte(), is_21_[1].toFloat())
                    if (f > 0.0f) {
                        val i_22_ = is_21_[0] + -`is`[0]
                        val i_23_ = -`is`[2] + is_21_[2]
                        val i_24_ = (`is`[0].toFloat() + i_22_.toFloat() * f).toInt()
                        val i_25_ = (`is`[2].toFloat() + i_23_.toFloat() * f).toInt()
                        i_13_ = (Class132.aPlayer_1907!!.method2436(71.toByte()) + -1 shl 8) + i_24_ shr 9
                        i_14_ = i_25_ - -(Class132.aPlayer_1907!!.method2436(73.toByte()) + -1 shl 8) shr 9
                        var i_26_ = (Class132.aPlayer_1907!!.plane).toInt()
                        if (i_26_ < 3 && ((0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_24_ shr 9]!![i_25_ shr 9]).toInt()) != 0)) i_26_++
                    }
                    if (i_13_ != -1 && i_14_ != -1) {
                        if (!r.aBoolean9722 || (0x40 and Class38.anInt500) == 0) {
                            if (Class122.aBoolean1801) Class50_Sub3.method466(false, "", i_14_, (-109).toByte(), true, i_13_, -1, true, 12, (i_14_ or (i_13_ shl 0)).toLong(), (Class274.aClass274_3510!!.method2063(Class348_Sub33.anInt6967, 544)), 0L, -1)
                            Class352.anInt4334++
                            Class50_Sub3.method466(false, "", i_14_, (-82).toByte(), true, i_13_, -1, true, 19, (i_14_ or (i_13_ shl 0)).toLong(), Class239_Sub4.aString5882, 0L, Class333.anInt4144)
                        } else {
                            val class46 = Class348_Sub22.method2957(Class9.anInt169, (-54).toByte(), Class149.anInt2046)
                            if (class46 == null) Class341.method2678(-2049)
                            else Class50_Sub3.method466(false, " ->", i_14_, (-101).toByte(), true, i_13_, -1, true, 15, (i_13_ shl 0 or i_14_).toLong(), Class28.aString5001, 0L, (Class348_Sub49_Sub1.anInt9747))
                        }
                    }
                }
                if (Class59_Sub1.aBoolean5300) Class285_Sub1.method2129(86.toByte())
                var i_27_ = 0
                while ((i_27_ < (if (!Class59_Sub1.aBoolean5300) 1 else 2))) {
                    val bool = i_27_ == 0
                    val class76 = (if (bool) Class71.aClass76_1208 else Class348_Sub42_Sub8_Sub2.aClass76_10436)
                    var i_28_ = i
                    var i_29_ = i_4_
                    if (Class59_Sub1.aBoolean5300) {
                        Class107.method1010(false, bool)
                        i_28_ += Class121.method1082(-92, bool)
                        i_29_ += Class348_Sub23.method2960(bool, -48)
                    }
                    val class243 = class76!!.aClass243_1282
                    var class318_sub4 = class243.method1872(8) as Class318_Sub4?
                    while (class318_sub4 != null) {
                        if ((RuntimeException_Sub1.aBoolean4599 || ((Class132.aPlayer_1907!!.plane) == class318_sub4.aClass318_Sub1_6410!!.plane)) && class318_sub4.method2504(i_29_, i_28_, var_ha, -115)) {
                            val bool_30_ = false
                            val bool_31_ = false
                            val i_32_: Int
                            val i_33_: Int
                            if (class318_sub4.aClass318_Sub1_6410 is Class318_Sub1_Sub3) {
                                i_32_ = (class318_sub4.aClass318_Sub1_6410 as Class318_Sub1_Sub3).aShort8750.toInt()
                                i_33_ = (class318_sub4.aClass318_Sub1_6410 as Class318_Sub1_Sub3).aShort8743.toInt()
                            } else {
                                i_32_ = (class318_sub4.aClass318_Sub1_6410!!.y shr 9)
                                i_33_ = (class318_sub4.aClass318_Sub1_6410!!.x shr 9)
                            }
                            if (class318_sub4.aClass318_Sub1_6410 is Player) {
                                val player = ((class318_sub4.aClass318_Sub1_6410) as Player)
                                val i_34_ = player.method2436(78.toByte())
                                if (((0x1 and i_34_) == 0 && (0x1ff and (player.x)) == 0 && (0x1ff and (player.y)) == 0) || ((i_34_ and 0x1) == 1 && ((player.x) and 0x1ff) == 256 && ((player.y) and 0x1ff) == 256)) {
                                    val i_35_ = (player.x - (-1 + player.method2436(82.toByte()) shl 8))
                                    val i_36_ = (player.y + -(-1 + player.method2436(105.toByte()) shl 8))
                                    var i_37_ = 0
                                    while ((Class150.anInt2057 > i_37_)) {
                                        val class348_sub22 = ((Class282.aClass356_3654!!.method3480(Class74.anIntArray1233!![i_37_].toLong(), -6008)) as? Class348_Sub22?)
                                        if (class348_sub22 != null) {
                                            val npc = (class348_sub22.aNpc_6859)!!
                                            if ((Class367_Sub11.anInt7396 != (npc.anInt10215)) && (npc.aBoolean10309)) {
                                                val i_38_ = ((npc.x) - ((npc.aClass79_10505!!.anInt1399) + -1 shl 8))
                                                val i_39_ = (-((-1 + (npc.aClass79_10505!!.anInt1399)) shl 8) + (npc.y))
                                                if (i_35_ <= i_38_ && ((-(i_38_ + -i_35_ shr 9) + (player.method2436(68.toByte()))) >= (npc.aClass79_10505!!.anInt1399)) && i_36_ <= i_39_ && ((-(-i_36_ + i_39_ shr 9) + (player.method2436(97.toByte()))) >= (npc.aClass79_10505!!.anInt1399))) {
                                                    Class286_Sub3.method2150(((class318_sub4.aClass318_Sub1_6410!!.plane) != (Class132.aPlayer_1907!!.plane)), false, npc)
                                                    npc.anInt10215 = Class367_Sub11.anInt7396
                                                }
                                            }
                                        }
                                        i_37_++
                                    }
                                    val i_40_ = Class328_Sub1.anInt6513
                                    val `is` = Class286_Sub7.anIntArray6290!!
                                    var i_41_ = 0
                                    while ((i_40_ > i_41_)) {
                                        val player_42_ = (Class294.aPlayerArray5058!![`is`[i_41_]])
                                        if ((player_42_ != null) && (Class367_Sub11.anInt7396 != (player_42_.anInt10215)) && (player != player_42_) && (player_42_.aBoolean10309)) {
                                            val i_43_ = ((player_42_.x) + -((player_42_.method2436(94.toByte()) - 1) shl 8))
                                            val i_44_ = ((player_42_.y) + -((-1 + (player_42_.method2436(82.toByte()))) shl 8))
                                            if ((i_43_ >= i_35_) && ((player.method2436(70.toByte()) - (-i_35_ + i_43_ shr 9)) >= player_42_.method2436(89.toByte())) && (i_44_ >= i_36_) && ((player.method2436(42.toByte()) - (i_44_ - i_36_ shr 9)) >= player_42_.method2436(127.toByte()))) {
                                                Class348_Sub43.method3298(114.toByte(), ((class318_sub4.aClass318_Sub1_6410!!.plane) != (Class132.aPlayer_1907!!.plane)), player_42_)
                                                player_42_.anInt10215 = Class367_Sub11.anInt7396
                                            }
                                        }
                                        i_41_++
                                    }
                                }
                                if (Class367_Sub11.anInt7396 == player.anInt10215) {
                                    class318_sub4 = class243.method1878((-123).toByte()) as Class318_Sub4?
                                    continue
                                }
                                Class348_Sub43.method3298(96.toByte(), ((Class132.aPlayer_1907!!.plane) != class318_sub4.aClass318_Sub1_6410!!.plane), player)
                                player.anInt10215 = Class367_Sub11.anInt7396
                            }
                            if (class318_sub4.aClass318_Sub1_6410 is Npc) {
                                val npc = ((class318_sub4.aClass318_Sub1_6410) as Npc)
                                if (npc.aClass79_10505 != null) {
                                    if (((npc.aClass79_10505!!.anInt1399 and 0x1) == 0 && (0x1ff and (npc.x)) == 0 && (0x1ff and (npc.y)) == 0) || ((0x1 and npc.aClass79_10505!!.anInt1399) == 1 && (0x1ff and (npc.x)) == 256 && ((npc.y) and 0x1ff) == 256)) {
                                        val i_45_ = ((npc.x) - ((-1 + npc.aClass79_10505!!.anInt1399) shl 8))
                                        val i_46_ = ((npc.y) - (npc.aClass79_10505!!.anInt1399 - 1 shl 8))
                                        for (i_47_ in 0..<Class150.anInt2057) {
                                            val class348_sub22 = ((Class282.aClass356_3654!!.method3480(Class74.anIntArray1233!![i_47_].toLong(), -6008)) as Class348_Sub22?)
                                            if (class348_sub22 != null) {
                                                val npc_48_ = (class348_sub22.aNpc_6859)!!
                                                if (((npc_48_.anInt10215) != Class367_Sub11.anInt7396) && (npc != npc_48_) && (npc_48_.aBoolean10309)) {
                                                    val i_49_ = (-((npc_48_.aClass79_10505!!.anInt1399) - 1 shl 8) + (npc_48_.x))
                                                    val i_50_ = ((npc_48_.y) + -((npc_48_.aClass79_10505!!.anInt1399) - 1 shl 8))
                                                    if (i_49_ >= i_45_ && ((npc_48_.aClass79_10505!!.anInt1399) <= ((npc.aClass79_10505!!.anInt1399) - (-i_45_ + i_49_ shr 9))) && (i_46_ <= i_50_) && ((npc_48_.aClass79_10505!!.anInt1399) <= ((npc.aClass79_10505!!.anInt1399) + -(i_50_ + -i_46_ shr 9)))) {
                                                        Class286_Sub3.method2150(((class318_sub4.aClass318_Sub1_6410!!.plane) != (Class132.aPlayer_1907!!.plane)), false, npc_48_)
                                                        npc_48_.anInt10215 = (Class367_Sub11.anInt7396)
                                                    }
                                                }
                                            }
                                        }
                                        val i_51_ = Class328_Sub1.anInt6513
                                        val `is` = Class286_Sub7.anIntArray6290!!
                                        var i_52_ = 0
                                        while ((i_51_ > i_52_)) {
                                            val player = (Class294.aPlayerArray5058!![`is`[i_52_]])
                                            if ((player != null) && (Class367_Sub11.anInt7396 != (player.anInt10215)) && (player.aBoolean10309)) {
                                                val i_53_ = ((player.x) - ((-1 + (player.method2436(116.toByte()))) shl 8))
                                                val i_54_ = ((player.y) + -((player.method2436(121.toByte())) + -1 shl 8))
                                                if ((i_53_ >= i_45_) && ((-(-i_45_ + i_53_ shr 9) + (npc.aClass79_10505!!.anInt1399)) >= player.method2436(114.toByte())) && (i_54_ >= i_46_) && (player.method2436(58.toByte()) <= ((npc.aClass79_10505!!.anInt1399) - (i_54_ + -i_46_ shr 9)))) {
                                                    Class348_Sub43.method3298(125.toByte(), ((class318_sub4.aClass318_Sub1_6410!!.plane) != (Class132.aPlayer_1907!!.plane)), player)
                                                    player.anInt10215 = Class367_Sub11.anInt7396
                                                }
                                            }
                                            i_52_++
                                        }
                                    }
                                    if (Class367_Sub11.anInt7396 == npc.anInt10215) {
                                        class318_sub4 = class243.method1878((-123).toByte()) as Class318_Sub4?
                                        continue
                                    }
                                    Class286_Sub3.method2150((class318_sub4.aClass318_Sub1_6410!!.plane != (Class132.aPlayer_1907!!.plane)), false, npc)
                                    npc.anInt10215 = Class367_Sub11.anInt7396
                                }
                            }
                            if (class318_sub4.aClass318_Sub1_6410 is Class318_Sub1_Sub2_Sub1) {
                                val i_55_ = za_Sub2.regionTileX + i_33_
                                val i_56_ = i_32_ - -Class90.regionTileY
                                val class348_sub37 = ((Class130.aClass356_1895!!.method3480(((class318_sub4.aClass318_Sub1_6410!!.plane).toInt() shl 28 or (i_56_ shl 14) or i_55_).toLong(), -6008)) as Class348_Sub37?)
                                if (class348_sub37 != null) {
                                    var i_57_ = 0
                                    var class348_sub34 = (class348_sub37.aClass262_6998.method1993(-92) as Class348_Sub34?)
                                    while (class348_sub34 != null) {
                                        val class213 = (Exception_Sub1.aClass255_112!!.method1940(79, (class348_sub34.anInt6973)))
                                        if (r.aBoolean9722 && ((Class132.aPlayer_1907!!.plane) == class318_sub4.aClass318_Sub1_6410!!.plane)) {
                                            val class254 = (if (Class246.anInt3176 != -1) (Class101_Sub3.aClass326_5764!!.method2600(Class246.anInt3176, 28364)) else null)
                                            if ((Class38.anInt500 and 0x1) != 0 && (class254 == null || ((class254.anInt3256) != (class213.method1567((class254.anInt3256), 29, Class246.anInt3176))))) {
                                                Class97.anInt1555++
                                                Class50_Sub3.method466(false, (Class28.aString5000 + " -> <col=ff9040>" + (class213.aString2795)), i_32_, (-76).toByte(), false, i_33_, -1, true, 49, i_57_.toLong(), Class28.aString5001, class348_sub34.anInt6973.toLong(), (Class348_Sub49_Sub1.anInt9747))
                                            }
                                        }
                                        if (class318_sub4.aClass318_Sub1_6410!!.plane == (Class132.aPlayer_1907!!.plane)) {
                                            val strings = (class213.aStringArray2811)
                                            for (i_58_ in 4 downTo 0) {
                                                if (strings != null && strings[i_58_] != null) {
                                                    var i_59_ = 0
                                                    if (i_58_ == 0) i_59_ = 21
                                                    var i_60_ = Class38.anInt506
                                                    if (i_58_ == 1) i_59_ = 10
                                                    if (i_58_ == 2) i_59_ = 47
                                                    if (i_58_ == 3) i_59_ = 22
                                                    if (i_58_ == (class213.anInt2752)) i_60_ = class213.anInt2759
                                                    if (i_58_ == 4) i_59_ = 5
                                                    if ((class213.anInt2764) == i_58_) i_60_ = class213.anInt2830
                                                    Class50_Sub3.method466(false, ("<col=ff9040>" + (class213.aString2795)), i_32_, (-119).toByte(), false, i_33_, -1, true, i_59_, i_57_.toLong(), strings[i_58_], class348_sub34.anInt6973.toLong(), i_60_)
                                                    Class348_Sub42_Sub8.anInt9548++
                                                }
                                            }
                                        }
                                        Class348_Sub33.anInt6956++
                                        Class50_Sub3.method466(((Class132.aPlayer_1907!!.plane) != class318_sub4.aClass318_Sub1_6410!!.plane), ("<col=ff9040>" + class213.aString2795) + Loader.getDebug(class213.anInt2769), i_32_, (-122).toByte(), false, i_33_, -1, true, 1010, i_57_.toLong(), (Class274.aClass274_3505!!.method2063(Class348_Sub33.anInt6967, 544)), class348_sub34.anInt6973.toLong(), Class286_Sub8.anInt6299)
                                        class348_sub34 = (class348_sub37.aClass262_6998.method2003(-127) as Class348_Sub34?)
                                        i_57_++
                                    }
                                }
                            }
                            if (class318_sub4.aClass318_Sub1_6410 is Interface10) {
                                val interface10 = ((class318_sub4.aClass318_Sub1_6410) as Interface10)
                                var class51: Class51? = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, interface10.method42(-100)))
                                if (class51!!.anIntArray945 != null) class51 = (class51.method480((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), 47.toByte()))
                                if (class51 != null) {
                                    if (r.aBoolean9722 && ((Class132.aPlayer_1907!!.plane) == (class318_sub4.aClass318_Sub1_6410!!.plane))) {
                                        val class254 = (if (Class246.anInt3176 != -1) (Class101_Sub3.aClass326_5764!!.method2600(Class246.anInt3176, 28364)) else null)
                                        if (((0x4 and Class38.anInt500) != 0) && (class254 == null || ((class254.anInt3256) != (class51.method487(Class246.anInt3176, (class254.anInt3256), 54))))) {
                                            Class220.anInt2877++
                                            Class50_Sub3.method466(false, (Class28.aString5000 + " -> <col=00ffff>" + (class51.aString884)), i_32_, (-94).toByte(), false, i_33_, -1, true, 2, interface10.hashCode().toLong(), Class28.aString5001, (Class348_Sub40_Sub21.method3107(95.toByte(), interface10, i_32_, i_33_)), Class348_Sub49_Sub1.anInt9747)
                                        }
                                    }
                                    if (class318_sub4.aClass318_Sub1_6410!!.plane == (Class132.aPlayer_1907!!.plane)) {
                                        val strings = class51.aStringArray913
                                        if (strings != null) {
                                            for (i_61_ in 4 downTo 0) {
                                                if (strings[i_61_] != null) {
                                                    var i_62_ = 0
                                                    if (i_61_ == 0) i_62_ = 3
                                                    var i_63_ = Class38.anInt506
                                                    if (i_61_ == 1) i_62_ = 4
                                                    if (i_61_ == 2) i_62_ = 9
                                                    if (i_61_ == 3) i_62_ = 59
                                                    if (i_61_ == 4) i_62_ = 1007
                                                    if ((class51.anInt950) == i_61_) i_63_ = (class51.anInt869)
                                                    if (i_61_ == (class51.anInt951)) i_63_ = (class51.anInt877)
                                                    Class50_Sub3.method466(false, ("<col=00ffff>" + (class51.aString884)), i_32_, (-100).toByte(), false, i_33_, -1, true, i_62_, interface10.hashCode().toLong(), strings[i_61_], (Class348_Sub40_Sub21.method3107((-116).toByte(), interface10, i_32_, i_33_)), i_63_)
                                                    Class83.anInt1445++
                                                }
                                            }
                                        }
                                        val x = i_33_ + za_Sub2.regionTileX
                                        val y = i_32_ + Class90.regionTileY
                                        Class50_Sub3.method466(
                                            ((Class132.aPlayer_1907!!.plane) != class318_sub4.aClass318_Sub1_6410!!.plane),
                                            ("<col=00ffff>" + class51.aString884 + Loader.getDebug(class51.anInt941, x, y, class318_sub4.aClass318_Sub1_6410!!.plane.toInt())),
                                            i_32_,
                                            (-120).toByte(),
                                            false,
                                            i_33_,
                                            -1,
                                            true,
                                            1001,
                                            interface10.hashCode().toLong(),
                                            (Class274.aClass274_3505!!.method2063(Class348_Sub33.anInt6967, 544)),
                                            class51.anInt941.toLong(),
                                            Class286_Sub8.anInt6299
                                        )
                                        anInt6094++
                                    }
                                }
                            }
                        }
                        class318_sub4 = class243.method1878((-123).toByte()) as Class318_Sub4?
                    }
                    if (Class59_Sub1.aBoolean5300) Class285_Sub1.method2129(86.toByte())
                    i_27_++
                }
                Class226.method1626(1, false)
            }
        }
    }
}
