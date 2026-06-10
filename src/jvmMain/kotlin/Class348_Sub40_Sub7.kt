import Class135.Companion.method1151
import Class286_Sub3.Companion.method2148
import Class286_Sub4.Companion.method2157
import Class299_Sub1_Sub2.Companion.method2263
import Class369_Sub1.Companion.method3570
import Class59.Companion.method544
import OutputStream_Sub1.Companion.method132
import kotlin.math.max
import kotlin.math.min

/* Class348_Sub40_Sub7 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub7 : Class348_Sub40(1, false) {
    private var aBoolean9140 = true
    private var aBoolean9147 = true

    override fun method3047(i: Int, i_0_: Int): Array<IntArray?>? {
        anInt9141++
        val `is` = this.aClass322_7033!!.method2557(-119, i)!!
        if (this.aClass322_7033!!.aBoolean4035) {
            val is_1_ = this.method3039(120.toByte(), (if (aBoolean9147) -i + Class299_Sub2.anInt6325 else i), 0)!!
            val is_2_ = is_1_[0]!!
            val is_3_ = is_1_[1]!!
            val is_4_ = is_1_[2]!!
            val is_5_ = `is`[0]!!
            val is_6_ = `is`[1]!!
            val is_7_ = `is`[2]!!
            if (aBoolean9140) {
                for (i_8_ in 0..<Class348_Sub40_Sub6.Companion.anInt9139) {
                    is_5_[i_8_] = is_2_[Class239_Sub22.anInt6076 + -i_8_]
                    is_6_[i_8_] = is_3_[Class239_Sub22.anInt6076 - i_8_]
                    is_7_[i_8_] = is_4_[-i_8_ + Class239_Sub22.anInt6076]
                }
            } else {
                var i_9_ = 0
                while ((i_9_ < Class348_Sub40_Sub6.Companion.anInt9139)) {
                    is_5_[i_9_] = is_2_[i_9_]
                    is_6_[i_9_] = is_3_[i_9_]
                    is_7_[i_9_] = is_4_[i_9_]
                    i_9_++
                }
            }
        }
        if (i_0_ != -1564599039) method3065(-40, true, 93)
        return `is`
    }

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_72_: Int) {
        while_146_@ do {
            try {
                anInt9146++
                if (i_72_ == 31015) {
                    val i_73_ = i
                    do {
                        if (i_73_ == 0) {
                            aBoolean9140 = class348_sub49!!.readUnsignedByte(255) == 1
                            return
                        } else if (i_73_ != 1) {
                            if (i_73_ == 2) break
                            break@while_146_
                        }
                        aBoolean9147 = class348_sub49!!.readUnsignedByte(255) == 1
                        return
                    } while (false)
                    this.aBoolean7045 = class348_sub49!!.readUnsignedByte(255) == 1
                    break
                }
                break
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("jia.F(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + i_72_ + ')'))
            }
        } while (false)
    }

    override fun method3042(i: Int, i_75_: Int): IntArray {
        anInt9143++
        if (i_75_ != 255) aClass348_Sub42_Sub12_9144 = null
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (this.aClass191_7032!!.aBoolean2570) {
            val is_76_ = this.method3048((if (aBoolean9147) Class299_Sub2.anInt6325 - i else i), i_75_ + 633706082, 0)!!
            if (aBoolean9140) {
                var i_77_ = 0
                while ((i_77_ < Class348_Sub40_Sub6.Companion.anInt9139)) {
                    `is`[i_77_] = is_76_[Class239_Sub22.anInt6076 + -i_77_]
                    i_77_++
                }
            } else Class214.method1578(is_76_, 0, `is`, 0, Class348_Sub40_Sub6.Companion.anInt9139)
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9141: Int = 0
        @JvmField
        var anInt9142: Int = 0
        @JvmField
        var anInt9143: Int = 0
        @JvmField
        var aClass348_Sub42_Sub12_9144: Class348_Sub42_Sub12? = null
        @JvmField
        var anInt9145: Int = 0
        @JvmField
        var anInt9146: Int = 0

        @JvmStatic
        fun method3064(i: Int, i_10_: Int, bool: Boolean, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, bool_15_: Boolean, class46s: Array<Class46?>?, i_16_: Int, i_17_: Int) {
            try {
                Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                if (bool_15_ == false) {
                    anInt9145++
                    var i_18_ = 0
                    while ( /**/class46s!!.size > i_18_) {
                        val class46 = class46s[i_18_]
                        if (class46 != null && (class46.anInt834 == i_16_ || (i_16_ == -1412584499 && Class289.aClass46_3701 == class46))) {
                            val i_19_ = i_11_ + class46.anInt800
                            val i_20_ = class46.anInt750 + i_10_
                            val i_21_ = 1 + (class46.anInt709 + i_19_)
                            val i_22_ = class46.anInt789 + i_20_ - -1
                            val i_23_: Int
                            if (i_13_ == -1) {
                                Class180.aRectangleArray2371!![Class348_Sub38.anInt7008]!!.setBounds(i_11_ + class46.anInt800, i_10_ + class46.anInt750, class46.anInt709, class46.anInt789)
                                i_23_ = Class348_Sub38.anInt7008++
                            } else i_23_ = i_13_
                            class46.anInt794 = Class367_Sub11.anInt7396
                            class46.anInt760 = i_23_
                            if (!Client.method111(class46)) {
                                if (class46.anInt765 != 0) Class348_Sub18.method2942(class46, (-36).toByte())
                                var i_24_ = class46.anInt800 - -i_11_
                                var i_25_ = class46.anInt750 + i_10_
                                var i_26_ = 0
                                var i_27_ = 0
                                if (Class59_Sub1.aBoolean5300) {
                                    i_26_ = s_Sub3.method4008((-124).toByte())
                                    i_27_ = Class16.method260(bool_15_)
                                }
                                var i_28_ = class46.anInt696
                                if (Class299_Sub2.aBoolean6327 && (Client.method105(class46)!!.anInt7098 != 0 || class46.anInt774 == 0) && i_28_ > 127) i_28_ = 127
                                if (class46 == Class289.aClass46_3701) {
                                    if (i_16_ != -1412584499 && ((Class312.anInt3930 == class46.anInt797) || (InputStream_Sub1.anInt78 == (class46.anInt797)))) {
                                        Class136.anInt4792 = i_10_
                                        Class348_Sub1.anInt6555 = i_11_
                                        Class138.aClass46Array1942 = class46s
                                        i_18_++
                                        continue
                                    }
                                    if (Class300.aBoolean3819 && Class127_Sub1.aBoolean8386) {
                                        var i_29_ = (Class258_Sub4.aClass373_8552!!.method3597(true) - -i_26_)
                                        var i_30_ = (Class258_Sub4.aClass373_8552!!.method3594(101.toByte()) + i_27_)
                                        i_29_ -= Class318_Sub4.anInt6411
                                        i_30_ -= Class219.anInt2872
                                        if (Class348_Sub40_Sub37.Companion.anInt9461 > i_29_) i_29_ = Class348_Sub40_Sub37.Companion.anInt9461
                                        if (i_30_ < Class40.anInt558) i_30_ = Class40.anInt558
                                        if (class46.anInt709 + i_29_ > ((Class331.aClass46_4130!!.anInt709) + Class348_Sub40_Sub37.Companion.anInt9461)) i_29_ = (-class46.anInt709 + ((Class348_Sub40_Sub37.Companion.anInt9461) + (Class331.aClass46_4130!!.anInt709)))
                                        if (i_30_ + class46.anInt789 > (Class331.aClass46_4130!!.anInt789) + Class40.anInt558) i_30_ = (-class46.anInt789 + (Class40.anInt558 - -(Class331.aClass46_4130!!.anInt789)))
                                        i_24_ = i_29_
                                        i_25_ = i_30_
                                    }
                                    if (class46.anInt797 == InputStream_Sub1.anInt78) i_28_ = 128
                                }
                                val i_31_: Int
                                val i_32_: Int
                                val i_33_: Int
                                val i_34_: Int
                                if (class46.anInt774 == 2) {
                                    i_31_ = i
                                    i_32_ = i_12_
                                    i_33_ = i_17_
                                    i_34_ = i_14_
                                } else {
                                    var i_35_ = i_24_ - -class46.anInt709
                                    var i_36_ = i_25_ + class46.anInt789
                                    if (class46.anInt774 == 9) {
                                        i_36_++
                                        i_35_++
                                    }
                                    i_31_ = max(i, i_24_)
                                    i_32_ = (max(i_12_, i_25_))
                                    i_34_ = min(i_14_, i_35_)
                                    i_33_ = (min(i_17_, i_36_))
                                }
                                if (i_31_ < i_34_ && i_32_ < i_33_) {
                                    if (class46.anInt765 != 0) {
                                        if ((Class239_Sub10.anInt5943 == class46.anInt765) || (class46.anInt765 == Class312.anInt3932)) {
                                            Class5_Sub2.method198(class46, false, i_25_, i_24_)
                                            if (!Class59_Sub1.aBoolean5300) {
                                                method132(124, (Class312.anInt3932 == (class46.anInt765)), class46.anInt709, i_24_, class46.anInt789, i_25_)
                                                Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                                            }
                                            Class152.aBooleanArray2076!![i_23_] = true
                                            i_18_++
                                            continue
                                        }
                                        if (class46.anInt765 == Class290.anInt3717) {
                                            if (class46.method425((Class348_Sub8.aHa6654!!), 8.toByte()) != null) {
                                                method3570(false)
                                                Class107.method1007(class46, (Class348_Sub8.aHa6654), i_24_, i_25_, 22960)
                                                Class268.aBooleanArray3438!![i_23_] = true
                                                Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                                                if (Class59_Sub1.aBoolean5300) {
                                                    if (bool) Class338.method2663(-5590, i_19_, i_21_, i_20_, i_22_)
                                                    else Class54.method503(i_22_, i_19_, (-74).toByte(), i_21_, i_20_)
                                                }
                                            }
                                            i_18_++
                                            continue
                                        }
                                        if (class46.anInt765 == Class239_Sub11.anInt5951) {
                                            if (class46.method425((Class348_Sub8.aHa6654!!), 26.toByte()) != null) {
                                                Class18.method271(i_25_, class46, (-98).toByte(), i_24_)
                                                Class268.aBooleanArray3438!![i_23_] = true
                                                Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                                                if (Class59_Sub1.aBoolean5300) {
                                                    if (!bool) Class54.method503(i_22_, i_19_, (-74).toByte(), i_21_, i_20_)
                                                    else Class338.method2663(-5590, i_19_, i_21_, i_20_, i_22_)
                                                }
                                            }
                                            i_18_++
                                            continue
                                        }
                                        if (class46.anInt765 == Class348_Sub45.anInt7102) {
                                            Class318_Sub1_Sub3_Sub4.method2464((-7).toByte(), i_24_, class46.anInt709, class46.anInt789, Class348_Sub8.aHa6654, i_25_, Class348_Sub40_Sub4.Companion.aD9113)
                                            Class152.aBooleanArray2076!![i_23_] = true
                                            Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                                            i_18_++
                                            continue
                                        }
                                        if (Class218.anInt2861 == class46.anInt765) {
                                            Class361.method3498(class46.anInt789, Class348_Sub8.aHa6654, i_24_, class46.anInt709, true, i_25_)
                                            Class152.aBooleanArray2076!![i_23_] = true
                                            Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                                            i_18_++
                                            continue
                                        }
                                        if (Class136.anInt4793 == class46.anInt765) {
                                            if (Class298.aBoolean3811 || Class188.aBoolean2514) {
                                                val i_37_ = (class46.anInt709 + i_24_)
                                                var i_38_ = 15 + i_25_
                                                if (Class59_Sub1.aBoolean5300) {
                                                    if (!bool) Class54.method503(i_22_, i_19_, (-74).toByte(), i_21_, i_20_)
                                                    else Class338.method2663(-5590, i_19_, i_21_, i_20_, i_22_)
                                                }
                                                if (Class298.aBoolean3811) {
                                                    var i_39_ = -256
                                                    if (Class239_Sub5.anInt5891 < 20) i_39_ = -65536
                                                    Applet_Sub1.aClass324_20!!.method2569("Fps:" + (Class239_Sub5.anInt5891), i_38_, i_39_, i_37_, -128, -1)
                                                    i_38_ += 15
                                                    val runtime = Runtime.getRuntime()
                                                    var i_40_ = (((runtime.totalMemory()) + -(runtime.freeMemory())) / 1024L).toInt()
                                                    var i_41_ = -256
                                                    if (i_40_ > 98304) {
                                                        i_41_ = -65536
                                                        if (Class161.aBoolean2151) {
                                                            Class46.method427(-35)
                                                            for (i_42_ in 0..9) System.gc()
                                                            i_40_ = (((runtime.totalMemory()) - (runtime.freeMemory())) / 1024L).toInt()
                                                            if (i_40_ > 65536) method544("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", false, 4)
                                                        }
                                                    }
                                                    Applet_Sub1.aClass324_20!!.method2569("Mem:" + i_40_ + "k", i_38_, i_41_, i_37_, -124, -1)
                                                    i_38_ += 15
                                                    Applet_Sub1.aClass324_20!!.method2569(("In:" + Class264.anInt3372 + "B/s Out:" + (Class348_Sub48.anInt7134) + "B/s"), i_38_, -256, i_37_, -127, -1)
                                                    i_38_ += 15
                                                    val i_43_ = (Class348_Sub8.aHa6654!!.E() / 1024)
                                                    Applet_Sub1.aClass324_20!!.method2569("Offheap:" + i_43_ + "k", i_38_, (if (i_43_ <= 65536) -256 else -65536), i_37_, -125, -1)
                                                    i_38_ += 15
                                                    var i_44_ = 0
                                                    var i_45_ = 0
                                                    var i_46_ = 0
                                                    var i_47_ = 0
                                                    while ((i_47_ < 37)) {
                                                        if ((Class13.aClass314_Sub1Array223!![i_47_]) != null) {
                                                            i_44_ += (Class13.aClass314_Sub1Array223!![i_47_]!!.method2345(0))
                                                            i_45_ += (Class13.aClass314_Sub1Array223!![i_47_]!!.method2351(0))
                                                            i_46_ += (Class13.aClass314_Sub1Array223!![i_47_]!!.method2341(24940))
                                                        }
                                                        i_47_++
                                                    }
                                                    val i_48_ = i_46_ * 100 / i_44_
                                                    val i_49_ = 10000 * i_45_ / i_44_
                                                    val string = ("Cache:" + (Class357.method3486(2, true, 0, i_49_.toLong(), 16980)) + "% (" + i_48_ + "%)")
                                                    Class240.aClass324_4684!!.method2569(string, i_38_, -256, i_37_, -127, -1)
                                                    i_38_ += 12
                                                    if (Loader.showCoordinates) {
                                                        val playerX = (Class132.aPlayer_1907!!.x shr 9) + za_Sub2.regionTileX
                                                        val playerY = (Class132.aPlayer_1907!!.y shr 9) + Class90.regionTileY
                                                        Class240.aClass324_4684!!.method2569("Coordinates: " + playerX + ", " + playerY + ", " + Class132.aPlayer_1907!!.plane, i_38_, -256, i_37_, -127, -1)
                                                        i_38_ += 12
                                                        Class240.aClass324_4684!!.method2569("Region id: " + (((playerX shr 6) shl 8) + (playerY shr 6)) + " (" + (playerX shr 6) + ", " + (playerY shr 6) + ")", i_38_, -256, i_37_, -127, -1)
                                                        i_38_ += 12
                                                        Class240.aClass324_4684!!.method2569("Chunk: " + (playerX shr 3) + ", " + (playerY shr 3), i_38_, -256, i_37_, -127, -1)
                                                        i_38_ += 12
                                                    }
                                                }
                                                if (Class313.anInt3936 > 0) Class240.aClass324_4684!!.method2569(("Particles: " + (Class318_Sub1_Sub5.anInt8780) + " / " + Class313.anInt3936), i_38_, -256, i_37_, -121, -1)
                                                i_38_ += 12
                                                if (Class188.aBoolean2514) {
                                                    Class240.aClass324_4684!!.method2569(("Polys: " + Class348_Sub8.aHa6654!!.I() + " Models: " + Class348_Sub8.aHa6654!!.M()), i_38_, -256, i_37_, -127, -1)
                                                    i_38_ += 12
                                                    Class240.aClass324_4684!!.method2569(("Ls: " + Class177.anInt4666 + " La: " + Class86.anInt1482 + " NPC: " + Class227.anInt2968 + " Pl: " + za_Sub1.anInt9776), i_38_, -256, i_37_, -122, -1)
                                                    Class110_Sub1.method1042((-123).toByte())
                                                    i_38_ += 12
                                                }
                                                Class152.aBooleanArray2076!![i_23_] = true
                                            }
                                            i_18_++
                                            continue
                                        }
                                    }
                                    if (class46.anInt774 == 0) {
                                        if ((class46.anInt765 == Class372.anInt4532) && Class348_Sub8.aHa6654!!.method3666()) Class348_Sub8.aHa6654!!.method3658(i_24_, i_25_, class46.anInt709, class46.anInt789)
                                        method3064(i_31_, -class46.anInt755 + i_25_, bool, i_24_ - class46.anInt747, i_32_, i_23_, i_34_, false, class46s, class46.anInt830, i_33_)
                                        if (class46.aClass46Array798 != null) method3064(i_31_, -(class46.anInt755) + i_25_, bool, i_24_ - (class46.anInt747), i_32_, i_23_, i_34_, false, (class46.aClass46Array798), (class46.anInt830), i_33_)
                                        val class348_sub41 = ((Class125.aClass356_4915!!.method3480(class46.anInt830.toLong(), -6008)) as Class348_Sub41?)
                                        if (class348_sub41 != null) Class159.method1252(i_25_, (class348_sub41.anInt7050), i_32_, i_23_, i_24_, i_34_, i_33_, 60.toByte(), i_31_)
                                        if ((class46.anInt765 == Class372.anInt4532) && Class348_Sub8.aHa6654!!.method3666()) Class348_Sub8.aHa6654!!.method3698()
                                        Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                                    }
                                    if (Class175.aBooleanArray2326!![i_23_] || ha_Sub3.anInt8045 > 1) {
                                        if (class46.anInt774 == 3) {
                                            if (i_28_ == 0) {
                                                if (class46.aBoolean810) Class348_Sub8.aHa6654!!.aa(i_24_, i_25_, (class46.anInt709), (class46.anInt789), (class46.anInt749), 0)
                                                else Class348_Sub8.aHa6654!!.method3628(i_24_, i_25_, (class46.anInt709), (class46.anInt789), (class46.anInt749), 0)
                                            } else if (!class46.aBoolean810) Class348_Sub8.aHa6654!!.method3628(i_24_, i_25_, class46.anInt709, class46.anInt789, (0xffffff and class46.anInt749 or (-(i_28_ and 0xff) + 255 shl 24)), 1)
                                            else Class348_Sub8.aHa6654!!.aa(i_24_, i_25_, class46.anInt709, class46.anInt789, (0xffffff and class46.anInt749 or (-(0xff and i_28_) + 255 shl 24)), 1)
                                            if (Class59_Sub1.aBoolean5300) {
                                                if (bool) Class338.method2663(-5590, i_19_, i_21_, i_20_, i_22_)
                                                else Class54.method503(i_22_, i_19_, (-74).toByte(), i_21_, i_20_)
                                            }
                                        } else if (class46.anInt774 == 4) {
                                            val class324 = class46.method426((Class348_Sub8.aHa6654), 68.toByte())
                                            if (class324 == null) {
                                                if (Class348_Sub42_Sub13.aBoolean9616) Class251.method1916(-9343, class46)
                                            } else {
                                                var i_50_ = class46.anInt749
                                                var string = (class46.aString792)
                                                if (class46.anInt812 != -1) {
                                                    val class213 = (Exception_Sub1.aClass255_112!!.method1940(-67, (class46.anInt812)))
                                                    string = (class213.aString2795)
                                                    if (string == null) string = "null"
                                                    if (((class213.anInt2820) == 1 || (class46.anInt781) != 1) && (class46.anInt781) != -1) string = ("<col=ff9040>" + string + "</col> x" + (Class37.method356(-127, (class46.anInt781))))
                                                }
                                                if (class46.anInt806 != -1) {
                                                    string = (method2157((class46.anInt806), -1431655765))
                                                    if (string == null) string = ""
                                                }
                                                if (Class49.aClass46_4730 == class46) {
                                                    string = (Class274.aClass274_3514!!.method2063((Class348_Sub33.anInt6967), 544))
                                                    i_50_ = (class46.anInt749)
                                                }
                                                if (Class318_Sub1_Sub3_Sub2.aBoolean10046) Class348_Sub8.aHa6654!!.T(i_24_, i_25_, (class46.anInt709) + i_24_, (class46.anInt789) + i_25_)
                                                class324.method2568(null, class46.anInt789, (-77).toByte(), null, 0, Class113.aClass105Array1744, (-(i_28_ and 0xff) + 255 shl 24) or i_50_, i_25_, class46.anInt709, class46.anInt700, string, 0, i_24_, class46.anInt762, (if (!(class46.aBoolean769)) -1 else (-(0xff and i_28_) + 255 shl 24)), class46.anInt773, class46.anInt673)
                                                if (Class318_Sub1_Sub3_Sub2.aBoolean10046) Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                                                if (string!!.trim { it <= ' ' }.length > 0) {
                                                    if (Class318_Sub1_Sub3_Sub2.aBoolean10046) {
                                                        if (Class59_Sub1.aBoolean5300) {
                                                            if (!bool) Class54.method503(i_22_, i_19_, (-74).toByte(), i_21_, i_20_)
                                                            else Class338.method2663(-5590, i_19_, i_21_, i_20_, i_22_)
                                                        }
                                                    } else {
                                                        val class143 = (method1151(-25411, (Class348_Sub8.aHa6654), (class46.anInt702)))
                                                        val i_51_ = (class143!!.method1187(string, bool_15_, class46.anInt709, (Class113.aClass105Array1744)))
                                                        val i_52_ = (class143.method1185((Class113.aClass105Array1744), 0, class46.anInt673, class46.anInt709, string))
                                                        if (Class59_Sub1.aBoolean5300) {
                                                            if (!bool) Class54.method503(i_25_ + i_52_, i_24_, (-74).toByte(), (i_24_ - -i_51_), i_25_)
                                                            else Class338.method2663(-5590, i_24_, i_51_ + i_24_, i_25_, (i_25_ + i_52_))
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (class46.anInt774 == 5) {
                                            if (class46.anInt705 >= 0) class46.method444(bool_15_, Class123.aClass25_1813, Class30.aClass84_413)!!.method2293(0, Class348_Sub8.aHa6654!!, (-35).toByte(), i_24_, class46.anInt709, i_25_, (class46.anInt835 shl 3), (class46.anInt759 shl 3), 0, class46.anInt789)
                                            else {
                                                val class105: Class105?
                                                if (class46.anInt812 != -1) {
                                                    val class154 = (if (class46.aBoolean720) (Class132.aPlayer_1907!!.aClass154_10536) else null)
                                                    class105 = (Exception_Sub1.aClass255_112!!.method1941((class46.anInt672), (-74).toByte(), (class46.anInt812), (class46.anInt781), (0xffffff.inv() or (class46.anInt809)), (class46.anInt678), Class348_Sub8.aHa6654, class154))
                                                } else if ((class46.anInt806) == -1) class105 = (class46.method443(Class348_Sub8.aHa6654!!, (-57).toByte()))
                                                else class105 = (method2263(Class348_Sub8.aHa6654, 0, (class46.anInt806)))
                                                if (class105 == null) {
                                                    if (Class348_Sub42_Sub13.aBoolean9616) Class251.method1916(-9343, class46)
                                                } else {
                                                    val i_53_ = class105.method966()
                                                    val i_54_ = class105.method980()
                                                    val i_55_ = ((-(i_28_ and 0xff) + 255 shl 24) or (if ((class46.anInt749) != 0) (class46.anInt749 and 0xffffff) else 16777215))
                                                    if (class46.aBoolean697) {
                                                        Class348_Sub8.aHa6654!!.T(i_24_, i_25_, i_24_ - -(class46.anInt709), (class46.anInt789) + i_25_)
                                                        if ((class46.anInt828) != 0) {
                                                            val i_56_ = ((i_53_ - 1 + (class46.anInt709)) / i_53_)
                                                            val i_57_ = ((i_54_ - 1 + (class46.anInt789)) / i_54_)
                                                            for (i_58_ in 0..<i_56_) {
                                                                for (i_59_ in 0..<i_57_) {
                                                                    if ((class46.anInt749) == 0) class105.method981(((i_53_.toFloat() / 2.0f) + (i_24_ - -(i_53_ * i_58_)).toFloat()), ((i_54_.toFloat() / 2.0f) + (i_59_ * i_54_ + i_25_).toFloat()), 4096, (class46.anInt828))
                                                                    else class105.method977(((i_53_.toFloat() / 2.0f) + (i_53_ * i_58_ + i_24_).toFloat()), ((i_54_.toFloat() / 2.0f) + (i_25_ + i_59_ * i_54_).toFloat()), 4096, (class46.anInt828), 0, i_55_, 1)
                                                                }
                                                            }
                                                        } else if ((class46.anInt749) != 0 || (i_28_ != 0)) class105.method965(i_24_, i_25_, (class46.anInt709), (class46.anInt789), 0, i_55_, 1)
                                                        else class105.method972(i_24_, i_25_, (class46.anInt709), (class46.anInt789))
                                                        Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                                                    } else if ((class46.anInt749) == 0 && i_28_ == 0) {
                                                        if ((class46.anInt828) != 0) class105.method981((i_24_.toFloat() + ((class46.anInt709).toFloat() / 2.0f)), (((class46.anInt789).toFloat() / 2.0f) + i_25_.toFloat()), (4096 * (class46.anInt709) / i_53_), (class46.anInt828))
                                                        else if ((i_53_ == (class46.anInt709)) && ((class46.anInt789) == i_54_)) class105.method974(i_24_, i_25_)
                                                        else class105.method973(i_24_, i_25_, (class46.anInt709), (class46.anInt789))
                                                    } else if (class46.anInt828 != 0) class105.method977((i_24_.toFloat() + ((class46.anInt709).toFloat() / 2.0f)), (i_25_.toFloat() + ((class46.anInt789).toFloat() / 2.0f)), (4096 * class46.anInt709 / i_53_), (class46.anInt828), 0, i_55_, 1)
                                                    else if (((class46.anInt709) == i_53_) && (class46.anInt789 == i_54_)) class105.method964(i_24_, i_25_, 0, i_55_, 1)
                                                    else class105.method970(i_24_, i_25_, (class46.anInt709), (class46.anInt789), 0, i_55_, 1)
                                                }
                                            }
                                            if (Class59_Sub1.aBoolean5300) {
                                                if (!bool) Class54.method503(i_22_, i_19_, (-74).toByte(), i_21_, i_20_)
                                                else Class338.method2663(-5590, i_19_, i_21_, i_20_, i_22_)
                                            }
                                        } else if (class46.anInt774 == 6) {
                                            Class358.method3489(115)
                                            var class64: Class64? = null
                                            var i_60_ = 0
                                            if (class46.anInt812 != -1) {
                                                var class213 = (Exception_Sub1.aClass255_112!!.method1940(103, (class46.anInt812)))
                                                if (class213 != null) {
                                                    class213 = (class213.method1560((class46.anInt781), 97.toByte()))
                                                    val class17 = (if ((class46.anInt699) == -1) null else (Class10.aClass87_191!!.method835((class46.anInt699), 7)))
                                                    val class154 = (if (!(class46.aBoolean720)) null else (Class132.aPlayer_1907!!.aClass154_10536))
                                                    class64 = (class213.method1559(class154, class17, Class348_Sub8.aHa6654, 2048, (class46.anInt841), 1, (class46.anInt795), 88.toByte(), (class46.anInt730)))
                                                    if (class64 != null) i_60_ = (-class64.fa() shr 1)
                                                    else Class251.method1916(-9343, class46)
                                                }
                                            } else if ((class46.anInt770) == 5) {
                                                val i_61_ = class46.anInt753
                                                if (i_61_ >= 0 && (i_61_ < 2048)) {
                                                    val player = (Class294.aPlayerArray5058!![i_61_])
                                                    val class17 = (if ((class46.anInt699) == -1) null else (Class10.aClass87_191!!.method835((class46.anInt699), 7)))
                                                    if ((player != null) && ((i_61_ == (Class348_Sub42_Sub11.anInt9591)) || ((class46.anInt779) == (Class318_Sub1_Sub3_Sub1.method2418((player.aString10544!!), (-50).toByte()))))) class64 =
                                                        (player.aClass154_10536!!.method1226((Class318_Sub1_Sub3_Sub3.aClass170_10209), null, null, true, (Exception_Sub1.aClass255_112), 0, class17, class46.anInt730, true, -1, null, 2048, (Class348_Sub40_Sub25.Companion.aClass150_9342), class46.anInt841, (Class348_Sub8.aHa6654), (Class189.aClass278_2529), (Class10.aClass87_191), 0, class46.anInt795, 0, (Class64_Sub3.aClass261_5558)))
                                                }
                                            } else if ((class46.anInt770) == 8 || (class46.anInt770) == 9) {
                                                val class348_sub13 = (Class258_Sub4.method1974((-123).toByte(), (class46.anInt753), false))
                                                val class17 = (if ((class46.anInt699) == -1) null else (Class10.aClass87_191!!.method835((class46.anInt699), 7)))
                                                if (class348_sub13 != null) {
                                                    val class154 = (if (class46.aBoolean720) (Class132.aPlayer_1907!!.aClass154_10536) else null)
                                                    class64 = (class348_sub13.method2803(class17, class154, (class46.anInt779), (class46.anInt795), (class46.anInt841), (class46.anInt730), 2048, Class348_Sub8.aHa6654, (class46.anInt770) == 9, -1))
                                                }
                                            } else if (class46.anInt699 == -1) {
                                                class64 = (class46.method430((Class348_Sub40_Sub25.Companion.aClass150_9342), Class10.aClass87_191, 2048, Class348_Sub8.aHa6654, -1, 0, (Exception_Sub1.aClass255_112), (Class318_Sub1_Sub3_Sub3.aClass170_10209), 255, (Class132.aPlayer_1907!!.aClass154_10536), null, (Class64_Sub3.aClass261_5558), (Class189.aClass278_2529), -1))
                                                if (class64 == null && (Class348_Sub42_Sub13.aBoolean9616)) Class251.method1916(-9343, class46)
                                            } else {
                                                val class17 = (Class10.aClass87_191!!.method835((class46.anInt699), 7))
                                                class64 = (class46.method430((Class348_Sub40_Sub25.Companion.aClass150_9342), Class10.aClass87_191, 2048, Class348_Sub8.aHa6654, (class46.anInt795), (class46.anInt841), (Exception_Sub1.aClass255_112), (Class318_Sub1_Sub3_Sub3.aClass170_10209), 255, (Class132.aPlayer_1907!!.aClass154_10536), class17, (Class64_Sub3.aClass261_5558), (Class189.aClass278_2529), (class46.anInt730)))
                                                if (class64 == null && (Class348_Sub42_Sub13.aBoolean9616)) Class251.method1916(-9343, class46)
                                            }
                                            if (class64 != null) {
                                                val i_62_: Int
                                                if (class46.anInt796 > 0) i_62_ = (((class46.anInt709) shl 9) / (class46.anInt796))
                                                else i_62_ = 512
                                                val i_63_: Int
                                                if (class46.anInt826 <= 0) i_63_ = 512
                                                else i_63_ = (((class46.anInt789) shl 9) / (class46.anInt826))
                                                var i_64_ = (i_24_ - -((class46.anInt709) / 2))
                                                var i_65_ = i_25_ + (class46.anInt789) / 2
                                                if (!class46.aBoolean784) {
                                                    i_64_ += (i_62_ * (class46.anInt688) shr 9)
                                                    i_65_ += (i_63_ * (class46.anInt799) shr 9)
                                                }
                                                Class157.aClass101_2123!!.method910()
                                                Class348_Sub8.aHa6654!!.method3638(Class157.aClass101_2123)
                                                Class348_Sub8.aHa6654!!.DA(i_64_, i_65_, i_62_, i_63_)
                                                Class348_Sub8.aHa6654!!.ya()
                                                if (class46.aBoolean754) Class348_Sub8.aHa6654!!.C(false)
                                                if (class46.aBoolean784) {
                                                    Class50_Sub1.aClass101_5209!!.method899(class46.anInt757)
                                                    Class50_Sub1.aClass101_5209!!.method896(class46.anInt675)
                                                    Class50_Sub1.aClass101_5209!!.method908(class46.anInt717)
                                                    Class50_Sub1.aClass101_5209!!.method891((class46.anInt688), (class46.anInt799), (class46.anInt787))
                                                } else {
                                                    val i_66_ = ((((class46.anInt716) shl 2) * (Class70.anIntArray1207!![(class46.anInt757 shl 3)])) shr 14)
                                                    val i_67_ = (((Class70.anIntArray1204!![((class46.anInt757) shl 3)]) * ((class46.anInt716) shl 2)) shr 14)
                                                    Class50_Sub1.aClass101_5209!!.method902(-(class46.anInt717) shl 3)
                                                    Class50_Sub1.aClass101_5209!!.method896((class46.anInt675) shl 3)
                                                    Class50_Sub1.aClass101_5209!!.method891(((class46.anInt808) shl 2), (((class46.anInt786) shl 2) + (i_66_ + i_60_)), ((class46.anInt786) shl 2) + i_67_)
                                                    Class50_Sub1.aClass101_5209!!.method900((class46.anInt757) shl 3)
                                                }
                                                class46.method437(-20154, class64, Class348_Sub8.aHa6654, Class367_Sub11.anInt7396, Class50_Sub1.aClass101_5209)
                                                if (Class318_Sub1_Sub3_Sub2.aBoolean10046) Class348_Sub8.aHa6654!!.T(i_24_, i_25_, (class46.anInt709) + i_24_, (i_25_ + (class46.anInt789)))
                                                if (!class46.aBoolean784) {
                                                    if (!class46.aBoolean689) {
                                                        class64.method615((Class50_Sub1.aClass101_5209), null, 1)
                                                        if ((class46.aClass318_Sub10_740) != null) Class348_Sub8.aHa6654!!.method3684(class46.aClass318_Sub10_740!!.method2539())
                                                    } else class64.method608((Class50_Sub1.aClass101_5209), null, ((class46.anInt716) shl 2), 1)
                                                } else if (class46.aBoolean689) class64.method608((Class50_Sub1.aClass101_5209), null, (class46.anInt716), 1)
                                                else {
                                                    class64.method615((Class50_Sub1.aClass101_5209), null, 1)
                                                    if ((class46.aClass318_Sub10_740) != null) Class348_Sub8.aHa6654!!.method3684(class46.aClass318_Sub10_740!!.method2539())
                                                }
                                                if (Class318_Sub1_Sub3_Sub2.aBoolean10046) Class348_Sub8.aHa6654!!.KA(i, i_12_, i_14_, i_17_)
                                                if (class46.aBoolean754) Class348_Sub8.aHa6654!!.C(true)
                                            }
                                            if (Class59_Sub1.aBoolean5300) {
                                                if (bool) Class338.method2663(-5590, i_19_, i_21_, i_20_, i_22_)
                                                else Class54.method503(i_22_, i_19_, (-74).toByte(), i_21_, i_20_)
                                            }
                                        } else if (class46.anInt774 == 9) {
                                            val i_68_: Int
                                            val i_69_: Int
                                            val i_70_: Int
                                            val i_71_: Int
                                            if (class46.aBoolean744) {
                                                i_68_ = (class46.anInt789 + i_25_)
                                                i_69_ = i_24_
                                                i_70_ = (class46.anInt709 + i_24_)
                                                i_71_ = i_25_
                                            } else {
                                                i_71_ = i_25_ + (class46.anInt789)
                                                i_70_ = (class46.anInt709 + i_24_)
                                                i_68_ = i_25_
                                                i_69_ = i_24_
                                            }
                                            if (class46.anInt690 != 1) Class348_Sub8.aHa6654!!.method3688(i_69_, i_68_, i_70_, i_71_, class46.anInt749, class46.anInt690, 0)
                                            else Class348_Sub8.aHa6654!!.method3709(i_69_, i_68_, i_70_, i_71_, class46.anInt749, 0)
                                            if (Class59_Sub1.aBoolean5300) {
                                                if (bool) Class338.method2663(-5590, i_19_, i_21_, i_20_, i_22_)
                                                else Class54.method503(i_22_, i_19_, (-74).toByte(), i_21_, i_20_)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i_18_++
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                runtimeexception.printStackTrace()
                throw Class348_Sub17.method2929(runtimeexception, ("jia.B(" + i + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + bool_15_ + ',' + (if (class46s != null) "{...}" else "null") + ',' + i_16_ + ',' + i_17_ + ')'))
            }
        }

        @JvmStatic
        fun method3065(i: Int, bool: Boolean, i_74_: Int) {
            Class318_Sub1_Sub4.anInt8765++
            anInt9142++
            if (bool != false) method3065(-42, true, 43)
            val class348_sub47 = method2148(Class348_Sub40_Sub1.Companion.aClass351_9089, Class348_Sub23_Sub2.aClass77_9029, -97)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(52, i_74_)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntMiddle(i, 44.toByte())
            Class348_Sub42_Sub14.method3243(25, class348_sub47)
        }

        @JvmStatic
        fun method3066(i: Int) {
            if (i != -1) aClass348_Sub42_Sub12_9144 = null
            aClass348_Sub42_Sub12_9144 = null
        }
    }
}
