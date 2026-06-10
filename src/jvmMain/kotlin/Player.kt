import java.util.*
import kotlin.math.atan2

class Player : Class318_Sub1_Sub3_Sub3() {
    @JvmField
    var anInt10516: Int = 0
    @JvmField
    var aBoolean10517: Boolean = false
    @JvmField
    var anInt10519: Int
    private var anInt10520 = 0
    @JvmField
    var aBoolean10521: Boolean = false
    @JvmField
    var anInt10522: Int
    @JvmField
    var anInt10524: Int
    @JvmField
    var anInt10526: Int
    @JvmField
    var anInt10531: Int = 0
    @JvmField
    var anInt10535: Int
    @JvmField
    var aClass154_10536: Class154? = null
    @JvmField
    var aString10537: String? = null
    private var aByte10538: Byte
    @JvmField
    var aBoolean10539: Boolean = false
    @JvmField
    var anInt10540: Int
    @JvmField
    var anInt10542: Int = 0
    @JvmField
    var aString10544: String? = null
    @JvmField
    var anInt10549: Int = 0
    @JvmField
    var aBoolean10551: Boolean = false
    private var aByte10552: Byte
    @JvmField
    var anInt10553: Int = 0
    @JvmField
    var aBoolean10554: Boolean = false
    private var aByte10556: Byte
    @JvmField
    var anInt10557: Int = 0
    @JvmField
    var anInt10558: Int = 255
    @JvmField
    var anInt10560: Int
    @JvmField
    var anInt10561: Int
    @JvmField
    var anInt10564: Int = 0
    override fun method2387(var_ha: ha?, i: Int) {
        anInt10533++
        if (this.aClass154_10536 != null && (this.aBoolean10318 || method2459(0, var_ha, -123))) {
            val class101 = var_ha!!.method3705()!!
            if (i >= -125) method2457((-106).toByte())
            class101.method895(this.aClass264_10217.method2019((-116).toByte()))
            class101.method891(this.x, -5 + this.anInt6382, this.y)
            this.method2432(var_ha, -15074, class101, this.aBoolean10318, (this.aClass64Array10323))
            this.aClass64Array10323!![2] = null
            this.aClass64Array10323!![1] = this.aClass64Array10323!![2]
            this.aClass64Array10323!![0] = this.aClass64Array10323!![1]
        }
    }

    fun method2449(i: Int, i_0_: Int, i_1_: Byte) {
        anInt10541++
        this.anInt10322 = 0
        this.anIntArray10320!![0] = i_0_
        this.anInt10319 = 0
        this.anInt10326 = 0
        this.anIntArray10317!![0] = i
        if (i_1_ <= 55) anInt10567 = -3
        val i_2_ = method2436(103.toByte())
        this.y = (256 * i_2_ + 512 * this.anIntArray10317!![0])
        this.x = (this.anIntArray10320!![0] * 512 + i_2_ * 256)
        if (Class132.aPlayer_1907 == this) Class76.method773(true)
        if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327!!.method2529()
    }

    fun method2450(bool: Boolean, i: Int): String? {
        if (i > -67) this.aBoolean10554 = false
        anInt10555++
        if (bool) return this.aString10537
        return this.aString10544
    }

    fun method2451(i: Byte, i_3_: Int, i_4_: Int, i_5_: Int) {
        if (i_4_ != -29034) this.anInt10557 = -47
        anInt10528++
        if (this.anInt10319 < 9) this.anInt10319++
        for (i_6_ in this.anInt10319 downTo 1) {
            this.anIntArray10320!![i_6_] = this.anIntArray10320!![-1 + i_6_]
            this.anIntArray10317!![i_6_] = this.anIntArray10317!![i_6_ + -1]
            this.aByteArray10321!![i_6_] = this.aByteArray10321!![-1 + i_6_]
        }
        this.anIntArray10320!![0] = i_3_
        this.aByteArray10321!![0] = i
        this.anIntArray10317!![0] = i_5_
    }

    override fun method2391(var_ha: ha?, i: Int, i_7_: Int, i_8_: Int): Boolean {
        anInt10562++
        if (this.aClass154_10536 == null || !method2459(131072, var_ha, 113)) return false
        val class101 = var_ha!!.method3705()
        val i_9_ = this.aClass264_10217.method2019((-31).toByte())
        class101.method895(i_9_)
        class101.method891(this.x, this.anInt6382, this.y)
        var bool = false
        var i_10_ = 0
        while ((this.aClass64Array10323!!.size > i_10_)) {
            if ((this.aClass64Array10323!![i_10_] != null) && (if (Class305.aBoolean3870) (this.aClass64Array10323!![i_10_]!!.method623(i_7_, i, class101, true, 0, Class132.anInt1906)) else this.aClass64Array10323!![i_10_]!!.method628(i_7_, i, class101, true, 0))) {
                bool = true
                break
            }
            i_10_++
        }
        this.aClass64Array10323!![2] = null
        this.aClass64Array10323!![1] = this.aClass64Array10323!![2]
        this.aClass64Array10323!![i_8_] = this.aClass64Array10323!![1]
        return bool
    }

    fun method2452(i: Byte, class348_sub49: Class348_Sub49) {
        anInt10547++
        class348_sub49.anInt7197 = 0
        val i_11_ = class348_sub49.readUnsignedByte(255)
        aByte10538 = (i_11_ and 0x1).toByte()
        val bool = this.aBoolean10517
        this.aBoolean10517 = (0x2 and i_11_) != 0
        val bool_12_ = (i_11_ and 0x4) != 0
        val i_13_ = super.method2436(68.toByte())
        this.method2434(51.toByte(), 1 + ((0x3f and i_11_) shr 3))
        aByte10552 = (i_11_ shr 6 and 0x3).toByte()
        this.x += -i_13_ + method2436(47.toByte()) shl 8
        this.y += method2436(96.toByte()) + -i_13_ shl 8
        aByte10556 = class348_sub49.readByte(-114)
        this.anInt10540 = class348_sub49.readByte(-89).toInt()
        this.anInt10522 = class348_sub49.readByte(i.toInt() xor 0x1.inv()).toInt()
        this.aBoolean10551 = class348_sub49.readByte(i + -199).toInt() == 1
        if (Class8.aClass364_165 == Class55_Sub1.aClass364_5271 && Class192.anInt2581 >= 2) this.aBoolean10551 = false
        this.anInt10542 = 0
        var i_14_ = -1
        val `is` = IntArray(12)
        for (i_15_ in 0..11) {
            val i_16_ = class348_sub49.readUnsignedByte(255)
            if (i_16_ == 0) `is`[i_15_] = 0
            else {
                val i_17_ = class348_sub49.readUnsignedByte(255)
                var i_18_ = i_17_ + (i_16_ shl 8)
                if (i_15_ == 0 && i_18_ == 65535) {
                    i_14_ = class348_sub49.readUnsignedShort(842397944)
                    this.anInt10542 = class348_sub49.readUnsignedByte(255)
                    break
                }
                if (i_18_ >= 32768) {
                    i_18_ = Class25.anIntArray369!![-32768 + i_18_]
                    `is`[i_15_] = Class273.method2057(1073741824, i_18_)
                    val i_19_ = (Exception_Sub1.aClass255_112!!.method1940(-111, i_18_).anInt2827)
                    if (i_19_ != 0) this.anInt10542 = i_19_
                } else `is`[i_15_] = Class273.method2057(-256 + i_18_, -2147483648)
            }
        }
        val is_20_ = IntArray(5)
        for (i_21_ in 0..4) {
            var i_22_ = class348_sub49.readUnsignedByte(255)
            if (Class367_Sub2.aShortArrayArrayArray7290!!.size < 1 || i_22_ < 0 || i_22_ >= Class367_Sub2.aShortArrayArrayArray7290!![0]!![i_21_]!!.size) i_22_ = 0
            is_20_[i_21_] = i_22_
        }
        anInt10520 = class348_sub49.readUnsignedShort(842397944)
        this.aString10537 = class348_sub49.readString((-47).toByte())
        this.aString10544 = this.aString10537
        if (this == Class132.aPlayer_1907) s_Sub2.aString8265 = this.aString10537
        this.anInt10516 = class348_sub49.readUnsignedByte(i.toInt() xor 0xab)
        if (i.toInt() != 84) anInt10520 = 87
        if (bool_12_) {
            this.anInt10564 = class348_sub49.readUnsignedShort(842397944)
            this.anInt10557 = this.anInt10516
            if (this.anInt10564 == 65535) this.anInt10564 = -1
            this.anInt10561 = -1
        } else {
            this.anInt10564 = 0
            this.anInt10557 = class348_sub49.readUnsignedByte(255)
            this.anInt10561 = class348_sub49.readUnsignedByte(255)
            if (this.anInt10561 == 255) this.anInt10561 = -1
        }
        val i_23_ = this.anInt10553
        this.anInt10553 = class348_sub49.readUnsignedByte(255)
        if (this.anInt10553 == 0) Class295.method2221(this, -28482)
        else {
            val i_24_ = this.anInt10535
            val i_25_ = this.anInt10526
            val i_26_ = this.anInt10560
            val i_27_ = this.anInt10519
            val i_28_ = this.anInt10558
            this.anInt10535 = class348_sub49.readUnsignedShort(842397944)
            this.anInt10526 = class348_sub49.readUnsignedShort(842397944)
            this.anInt10560 = class348_sub49.readUnsignedShort(842397944)
            this.anInt10519 = class348_sub49.readUnsignedShort(842397944)
            this.anInt10558 = class348_sub49.readUnsignedByte(i.toInt() xor 0xab)
            if (!this.aBoolean10517 != !bool || this.anInt10553 != i_23_ || i_24_ != this.anInt10535 || i_25_ != this.anInt10526 || (this.anInt10560 != i_26_) || this.anInt10519 != i_27_ || i_28_ != this.anInt10558) Class92.method858(true, this)
        }
        if (this.aClass154_10536 == null) this.aClass154_10536 = Class154()
        val i_29_ = (this.aClass154_10536!!.anInt2093)
        val is_30_ = (this.aClass154_10536!!.anIntArray2095)
        this.aClass154_10536!!.method1228(i_14_, 105, method2421(121.toByte()), `is`, aByte10538.toInt() == 1, is_20_)
        if (i_14_ != i_29_) {
            this.x = (this.anIntArray10320!![0] shl 9) - -(method2436(89.toByte()) shl 8)
            this.y = (this.anIntArray10317!![0] shl 9) - -(method2436(98.toByte()) shl 8)
        }
        if ((Class348_Sub42_Sub11.anInt9591 == this.anInt10290) && is_30_ != null) {
            for (i_31_ in is_20_.indices) {
                if (is_20_[i_31_] != is_30_[i_31_]) {
                    Exception_Sub1.aClass255_112!!.method1936(72)
                    break
                }
            }
        }
        if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327!!.method2529()
        if (this.anInt10268 != -1 && this.aBoolean10213) {
            val class225 = this.method2422(72.toByte())
            if (!class225.method1623((this.anInt10268), -40)) {
                this.aBoolean10213 = false
                this.anInt10268 = -1
            }
        }
    }

    private fun method2453(i: Int, var_ha: ha?, i_32_: Int, class64: Class64?, i_33_: Int, i_34_: Int, class101: Class101?, i_35_: Int) {
        do {
            try {
                anInt10548++
                if (i_33_ == 0) {
                    val i_36_ = i * i + i_34_ * i_34_
                    if (i_36_ >= 262144 && i_32_ >= i_36_) {
                        val i_37_ = 0x3fff and (atan2(i.toDouble(), i_34_.toDouble()) * 2607.5945876176133).toInt()
                        val class64_38_ = (Canvas_Sub1.method122(this.anInt10252, this.anInt10302, this.anInt10208, i_37_, i_35_, (-35).toByte(), var_ha!!))
                        if (class64_38_ == null) break
                        var_ha!!.C(false)
                        class64_38_.method615(class101, null, 0)
                        var_ha.C(true)
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ke.OB(" + i + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_32_ + ',' + (if (class64 != null) "{...}" else "null") + ',' + i_33_ + ',' + i_34_ + ',' + (if (class101 != null) "{...}" else "null") + ',' + i_35_ + ')'))
            }
            break
        } while (false)
    }

    private fun method2454(i: Int, i_39_: Int, i_40_: Int, i_41_: Int, class64: Class64?, i_42_: Int, class101: Class101?, var_ha: ha?, i_43_: Int) {
        do {
            try {
                if (i != 6253) this.aString10544 = null
                anInt10563++
                val i_44_ = i_43_ * i_43_ + i_39_ * i_39_
                if (i_44_ >= 262144 && i_44_ <= i_42_) {
                    val i_45_ = ((2607.5945876176133 * atan2(i_39_.toDouble(), i_43_.toDouble())).toInt() and 0x3fff)
                    val class64_46_ = (Canvas_Sub1.method122(this.anInt10252, this.anInt10302, this.anInt10208, i_45_, i_41_, (-35).toByte(), var_ha!!))
                    if (class64_46_ == null) break
                    var_ha!!.C(false)
                    class64_46_.method608(class101, null, i_40_, 0)
                    var_ha.C(true)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ke.V(" + i + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ',' + (if (class64 != null) "{...}" else "null") + ',' + i_42_ + ',' + (if (class101 != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_43_ + ')'))
            }
            break
        } while (false)
    }

    override fun method2381(var_ha: ha?, i: Int): Class30? {
        if (i != 7) this.aString10544 = null
        anInt10518++
        return null
    }

    override fun method2392(bool: Boolean) {
        if (bool != true) this.aString10544 = null
        anInt10534++
        throw IllegalStateException()
    }

    override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_47_: Int, i_48_: Byte, i_49_: Int) {
        try {
            if (i_48_ >= -106) anInt10520 = 116
            anInt10545++
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ke.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ')'))
        }
    }

    fun method2455(i: Int, i_50_: Int, i_51_: Byte, i_52_: Int) {
        anInt10529++
        if (i_50_ != -26443) method2451((-35).toByte(), 9, 26, 87)
        if (this.anInt10286 != -1 && Class10.aClass87_191!!.method835(this.anInt10286, 7).anInt245 == 1) {
            this.anInt10286 = -1
            this.anIntArray10236 = null
        }
        if (this.anInt10269 != -1) {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(59.toByte(), this.anInt10269))
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && Class10.aClass87_191!!.method835((class368.anInt4503), i_50_ xor 0x674d.inv()).anInt245 == 1) this.anInt10269 = -1
        }
        if (this.anInt10291 != -1) {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(124.toByte(), this.anInt10291))
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (Class10.aClass87_191!!.method835(class368.anInt4503, 7).anInt245) == 1) this.anInt10291 = -1
        }
        this.anInt10524 = -1
        if (i_52_ >= 0 && Class367_Sub4.anInt7319 > i_52_ && i >= 0 && Class348_Sub40_Sub3.anInt9109 > i) {
            if (this.anIntArray10320!![0] >= 0 && (this.anIntArray10320!![0] < Class367_Sub4.anInt7319) && this.anIntArray10317!![0] >= 0 && (Class348_Sub40_Sub3.anInt9109 > this.anIntArray10317!![0])) {
                if (i_51_.toInt() == 2) Class218.method1592(2.toByte(), i, 4, i_52_, this)
                method2451(i_51_, i_52_, -29034, i)
            } else method2449(i, i_52_, 111.toByte())
        } else method2449(i, i_52_, 112.toByte())
    }

    override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt10527++
        if (this.aClass154_10536 == null || !method2459(2048, var_ha, -95)) return null
        val class101 = var_ha!!.method3705()
        val i_53_ = this.aClass264_10217.method2019((-126).toByte())
        class101.method895(i_53_)
        val class357 = (Class147.aClass357ArrayArrayArray2029!![this.plane.toInt()]!![this.x shr Class362.anInt4459]!![this.y shr Class362.anInt4459])
        if (class357 == null || class357.aClass318_Sub1_Sub1_4402 == null) this.anInt10274 = (this.anInt10274 - this.anInt10274.toFloat() / 10.0f).toInt()
        else {
            val i_54_ = (this.anInt10274 + -(class357.aClass318_Sub1_Sub1_4402!!.aShort8727))
            this.anInt10274 = (this.anInt10274 - i_54_.toFloat() / 10.0f).toInt()
        }
        class101.method891(this.x, (-20 + (this.anInt6382 - this.anInt10274)), this.y)
        var class318_sub4: Class318_Sub4? = null
        this.aBoolean10324 = false
        if (Class316.aClass348_Sub51_3959!!.aClass239_Sub21_7270!!.method1812(-32350) == 1) {
            val class225 = this.method2422(72.toByte())
            if (class225.aBoolean2913 && (this.aClass154_10536!!.anInt2093 == -1 || Class189.aClass278_2529!!.method2079(this.aClass154_10536!!.anInt2093, i + -2).aBoolean1369)) {
                val class17 = (if (this.anInt10286 != -1 && this.anInt10218 == 0) (Class10.aClass87_191!!.method835(this.anInt10286, 7)) else null)
                val class17_55_ = (if (this.anInt10268 == -1 || this.aBoolean10521 || (this.aBoolean10213 && class17 != null)) null else (Class10.aClass87_191!!.method835(this.anInt10268, 7)))
                val class64 = (Class348.method2711(this.anInt10302, i_53_, this.aClass64Array10323[0], this.anInt10208, false, (if (class17_55_ == null) this.anInt10267 else this.anInt10245), 0, 1, this.anInt10252, var_ha, 160, 0, 240, if (class17_55_ == null) class17 else class17_55_))
                if (class64 != null) {
                    class318_sub4 = (OutputStream_Sub2.method136(1 + (this.aClass64Array10323).size, true, false))
                    this.aBoolean10324 = true
                    var_ha.C(false)
                    if (Class305.aBoolean3870) class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![(this.aClass64Array10323).size]), Class132.anInt1906, 0)
                    else class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![(this.aClass64Array10323).size]), 0)
                    var_ha.C(true)
                }
            }
        }
        if (this == Class132.aPlayer_1907) {
            class101.method894(this.x, this.anInt6382, this.y)
            for (i_56_ in -1 + Class348_Sub27.aClass302Array6897!!.size downTo 0) {
                val class302 = Class348_Sub27.aClass302Array6897!![i_56_]
                if (class302 != null && class302.anInt3834 != -1) {
                    if (class302.anInt3840 == 1) {
                        val class348_sub22 = ((Class282.aClass356_3654!!.method3480(class302.anInt3833.toLong(), -6008)) as? Class348_Sub22?)
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)!!
                            val i_57_ = (-(Class132.aPlayer_1907!!.x) + npc.x)
                            val i_58_ = (-(Class132.aPlayer_1907!!.y) + npc.y)
                            if (Class305.aBoolean3870) method2454(6253, i_57_, Class132.anInt1906, class302.anInt3834, (this.aClass64Array10323[0]), 92160000, class101, var_ha, i_58_)
                            else method2453(i_57_, var_ha, 92160000, (this.aClass64Array10323[0]), 0, i_58_, class101, class302.anInt3834)
                        }
                    }
                    if (class302.anInt3840 == 2) {
                        val i_59_ = (-(Class132.aPlayer_1907!!.x) + 256 + class302.anInt3835)
                        val i_60_ = (-(Class132.aPlayer_1907!!.y) + 256 + class302.anInt3832)
                        var i_61_ = class302.anInt3837 shl 9
                        i_61_ *= i_61_
                        if (Class305.aBoolean3870) method2454(6253, i_59_, Class132.anInt1906, class302.anInt3834, (this.aClass64Array10323[0]), i_61_, class101, var_ha, i_60_)
                        else method2453(i_59_, var_ha, i_61_, (this.aClass64Array10323[0]), 0, i_60_, class101, class302.anInt3834)
                    }
                    if (class302.anInt3840 == 10 && class302.anInt3833 >= 0 && (class302.anInt3833 < (Class294.aPlayerArray5058)!!.size)) {
                        val player_62_ = (Class294.aPlayerArray5058!![class302.anInt3833])
                        if (player_62_ != null) {
                            val i_63_ = (-(Class132.aPlayer_1907!!.x) + (player_62_.x))
                            val i_64_ = (-(Class132.aPlayer_1907!!.y) + (player_62_.y))
                            if (Class305.aBoolean3870) method2454(6253, i_63_, Class132.anInt1906, class302.anInt3834, (this.aClass64Array10323[0]), 92160000, class101, var_ha, i_64_)
                            else method2453(i_63_, var_ha, 92160000, (this.aClass64Array10323[0]), i xor 0x1, i_64_, class101, class302.anInt3834)
                        }
                    }
                }
            }
            class101.method895(i_53_)
            class101.method891(this.x, this.anInt6382, this.y)
        }
        class101.method895(i_53_)
        class101.method891(this.x, (this.anInt6382 + (-5 + -(this.anInt10274))), this.y)
        if (class318_sub4 == null) class318_sub4 = OutputStream_Sub2.method136((this.aClass64Array10323).size, true, false)
        this.method2432(var_ha, -15074, class101, false, this.aClass64Array10323)
        if (Class305.aBoolean3870) {
            for (i_65_ in (this.aClass64Array10323).indices) {
                if (this.aClass64Array10323[i_65_] != null) this.aClass64Array10323[i_65_]!!.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![i_65_]), Class132.anInt1906, (if (this != Class132.aPlayer_1907) 0 else 1))
            }
        } else {
            for (i_66_ in (this.aClass64Array10323).indices) {
                if (this.aClass64Array10323[i_66_] != null) this.aClass64Array10323[i_66_]!!.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![i_66_]), (if (this == Class132.aPlayer_1907) 1 else 0))
            }
        }
        if (this.aClass318_Sub10_10327 != null) {
            val class98 = this.aClass318_Sub10_10327!!.method2525()
            if (Class305.aBoolean3870) var_ha.method3685(class98, Class132.anInt1906)
            else var_ha.method3684(class98)
        }
        var i_67_ = 0
        while ((i_67_ < this.aClass64Array10323.size)) {
            if (this.aClass64Array10323[i_67_] != null) this.aBoolean10324 = this.aBoolean10324 or this.aClass64Array10323[i_67_]!!.F()
            i_67_++
        }
        this.aClass64Array10323[2] = null
        this.aClass64Array10323[i] = this.aClass64Array10323[2]
        this.aClass64Array10323[0] = this.aClass64Array10323[i]
        this.anInt10301 = Class239_Sub15.anInt6006
        return class318_sub4
    }

    fun method2456(bool: Boolean, i: Int): String {
        anInt10550++
        var string: String? = ""
        if (Class367_Sub9.aStringArray7378 != null) string += Class367_Sub9.aStringArray7378!![aByte10552.toInt()]
        val `is`: IntArray?
        if (aByte10538.toInt() != 1 || Class239_Sub17.anIntArray6021 == null) `is` = RuntimeException_Sub1.anIntArray4603
        else `is` = Class239_Sub17.anIntArray6021
        if (i != 255) anInt10567 = 81
        if (`is` != null && `is`[aByte10552.toInt()] != -1) {
            val class117 = Class348_Sub7.aClass33_6653!!.method337(true, `is`[aByte10552.toInt()])
            if (class117.aChar1779.code != 115) {
                Class156.method1242("gdn1", Throwable(), 15004)
                `is`[aByte10552.toInt()] = -1
            } else string += class117.method1074(0xff and aByte10556.toInt(), i + -145)
        }
        if (!bool) string += this.aString10544
        else string += this.aString10537
        if (Class54.aStringArray974 != null) string += Class54.aStringArray974!![aByte10552.toInt()]
        return string
    }

    override fun method2425(i: Int): Int {
        anInt10532++
        if (i != -1) return 82
        return -1
    }

    fun method2457(i: Byte): Boolean {
        anInt10530++
        val i_68_ = 86 / ((-44 - i) / 38)
        return this.aClass154_10536 != null
    }

    override fun method2388(i: Int): Boolean {
        anInt10523++
        if (i >= -65) method2449(-64, -39, 37.toByte())
        return false
    }

    public override fun method2436(i: Byte): Int {
        if (i <= 39) method2455(-97, -62, 0.toByte(), 103)
        anInt10546++
        if (this.aClass154_10536 != null && this.aClass154_10536!!.anInt2093 != -1) return (Class189.aClass278_2529!!.method2079(this.aClass154_10536!!.anInt2093, -1).anInt1399)
        return super.method2436(72.toByte())
    }

    private fun method2459(i: Int, var_ha: ha?, i_69_: Int): Boolean {
        var i = i
        anInt10525++
        val i_70_ = i
        val class225 = this.method2422(72.toByte())
        val class17 = (if (this.anInt10286 == -1 || this.anInt10218 != 0) null else Class10.aClass87_191!!.method835(this.anInt10286, 7))
        val class17_71_ = (if (this.anInt10268 != -1 && !this.aBoolean10521 && (!this.aBoolean10213 || class17 == null)) Class10.aClass87_191!!.method835(this.anInt10268, 7) else null)
        val i_72_ = class225.anInt2932
        val i_73_ = class225.anInt2941
        if (i_72_ != 0 || i_73_ != 0 || class225.anInt2950 != 0 || class225.anInt2926 != 0) i = i or 0x7
        val i_74_ = this.aClass264_10217.method2019((-106).toByte())
        val bool = (this.aByte10279.toInt() != 0 && (this.anInt10248 <= Class367_Sub11.anInt7396) && (Class367_Sub11.anInt7396 < this.anInt10250))
        if (bool) i = i or 0x80000
        val class64 =
            (this.aClass154_10536!!.method1226(aClass170_10209, class17_71_, this.aClass182Array10308, true, Exception_Sub1.aClass255_112, i_74_, class17, this.anInt10244, true, this.anInt10312, this.anIntArray10296, i, Class348_Sub40_Sub25.aClass150_9342, this.anInt10232, var_ha, Class189.aClass278_2529, Class10.aClass87_191, this.anInt10245, this.anInt10267, this.anInt10203, Class64_Sub3.aClass261_5558).also { this.aClass64Array10323[0] = it })
        val i_75_ = Class292.method2201(2121)
        if (Class226.anInt2964 < 96 && i_75_ > 50) Class299_Sub2_Sub1.method2271(31268)
        val i_76_ = 3 % ((63 - i_69_) / 47)
        if (Class55_Sub1.aClass364_5271 != Class8.aClass364_165 && i_75_ < 50) {
            val i_77_: Int
            i_77_ = -i_75_ + 50
            while (Class127_Sub1.anInt8388 < i_77_) {
                Class308.aByteArrayArray3882!![Class127_Sub1.anInt8388] = ByteArray(102400)
                Class127_Sub1.anInt8388++
            }
            while (Class127_Sub1.anInt8388 > i_77_) {
                Class127_Sub1.anInt8388--
                Class308.aByteArrayArray3882!![Class127_Sub1.anInt8388] = null
            }
        } else if (Class8.aClass364_165 != Class55_Sub1.aClass364_5271) {
            Class127_Sub1.anInt8388 = 0
            Class308.aByteArrayArray3882 = arrayOfNulls<ByteArray>(50)
        }
        if (class64 == null) return false
        this.anInt10207 = class64.fa()
        this.anInt10230 = class64.ma()
        this.method2439(-115, class64)
        if (i_72_ != 0 || i_73_ != 0) {
            this.method2424(i_74_, i_72_, class225.anInt2943, i_73_, 108.toByte(), class225.anInt2912)
            if (this.anInt10302 != 0) class64.FA(this.anInt10302)
            if (this.anInt10208 != 0) class64.VA(this.anInt10208)
            if (this.anInt10252 != 0) class64.H(0, this.anInt10252, 0)
        } else this.method2424(i_74_, method2436(124.toByte()) shl 9, 0, method2436(58.toByte()) shl 9, 65.toByte(), 0)
        if (bool) class64.method624(this.aByte10255.toInt(), this.aByte10206.toInt(), this.aByte10270.toInt(), (this.aByte10279.toInt() and 0xff))
        if (!this.aBoolean10521 && this.anInt10269 != -1 && this.anInt10240 != -1) {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(76.toByte(), this.anInt10269))
            val bool_78_ = (class368.aByte4488.toInt() == 3 && (i_72_ != 0 || i_73_ != 0))
            var i_79_ = i_70_
            if (!bool_78_) {
                if (this.anInt10237 != 0) i_79_ = i_79_ or 0x5
                if (this.anInt10220 != 0) i_79_ = i_79_ or 0x2
                if (this.anInt10278 >= 0) i_79_ = i_79_ or 0x7
            } else i_79_ = i_79_ or 0x7
            val class64_80_ = (class368.method3562(this.anInt10240, var_ha, this.anInt10243, i_79_, this.anInt10283, Class10.aClass87_191, 46.toByte()).also { this.aClass64Array10323[1] = it })
            if (class64_80_ != null) {
                if (this.anInt10278 >= 0 && class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939!![this.anInt10278]) != null)) {
                    var i_81_ = 0
                    var i_82_ = 0
                    var i_83_ = 0
                    if (class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939!![this.anInt10278]) != null)) {
                        i_82_ += (class225.anIntArrayArray2939!![this.anInt10278]!![1])
                        i_83_ += (class225.anIntArrayArray2939!![this.anInt10278]!![2])
                        i_81_ += (class225.anIntArrayArray2939!![this.anInt10278]!![0])
                    }
                    if (class225.anIntArrayArray2910 != null && ((class225.anIntArrayArray2910!![this.anInt10278]) != null)) {
                        i_82_ += (class225.anIntArrayArray2910!![this.anInt10278]!![1])
                        i_83_ += (class225.anIntArrayArray2910!![this.anInt10278]!![2])
                        i_81_ += (class225.anIntArrayArray2910!![this.anInt10278]!![0])
                    }
                    if (i_83_ != 0 || i_81_ != 0) {
                        var i_84_ = i_74_
                        if ((this.anIntArray10296 != null) && ((this.anIntArray10296!![this.anInt10278]) != -1)) i_84_ = (this.anIntArray10296!![(this.anInt10278)])
                        val i_85_ = (i_84_ + (this.anInt10237) * 2048 + -i_74_ and 0x3fff)
                        if (i_85_ != 0) class64_80_.a(i_85_)
                        val i_86_ = Class70.anIntArray1207!![i_85_]
                        val i_87_ = Class70.anIntArray1204!![i_85_]
                        val i_88_ = i_87_ * i_81_ + i_83_ * i_86_ shr 14
                        i_83_ = -(i_81_ * i_86_) + i_83_ * i_87_ shr 14
                        i_81_ = i_88_
                    }
                    class64_80_.H(i_81_, i_82_, i_83_)
                } else if (this.anInt10237 != 0) class64_80_.a(2048 * this.anInt10237)
                if (this.anInt10220 != 0) class64_80_.H(0, (-this.anInt10220 shl 2), 0)
                if (bool_78_) {
                    if (this.anInt10302 != 0) class64_80_.FA(this.anInt10302)
                    if (this.anInt10208 != 0) class64_80_.VA(this.anInt10208)
                    if (this.anInt10252 != 0) class64_80_.H(0, (this.anInt10252), 0)
                }
            }
        } else this.aClass64Array10323[1] = null
        if (this.aBoolean10521 || this.anInt10291 == -1 || this.anInt10224 == -1) this.aClass64Array10323[2] = null
        else {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(76.toByte(), this.anInt10291))
            val bool_89_ = (class368.aByte4488.toInt() == 3 && (i_72_ != 0 || i_73_ != 0))
            var i_90_ = i_70_
            if (bool_89_) i_90_ = i_90_ or 0x7
            else {
                if (this.anInt10202 != 0) i_90_ = i_90_ or 0x5
                if (this.anInt10260 != 0) i_90_ = i_90_ or 0x2
                if (this.anInt10289 >= 0) i_90_ = i_90_ or 0x7
            }
            val class64_91_ = (class368.method3558(this.anInt10273, this.anInt10276, var_ha, i_90_, 3172, Class10.aClass87_191, this.anInt10224).also { this.aClass64Array10323[2] = it })
            if (class64_91_ != null) {
                if (this.anInt10289 < 0 || class225.anIntArrayArray2939 == null || ((class225.anIntArrayArray2939!![this.anInt10289]) == null)) {
                    if (this.anInt10202 != 0) class64_91_.a(2048 * (this.anInt10202))
                } else {
                    var i_92_ = 0
                    var i_93_ = 0
                    var i_94_ = 0
                    if (class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939!![this.anInt10289]) != null)) {
                        i_92_ += (class225.anIntArrayArray2939!![this.anInt10289]!![0])
                        i_93_ += (class225.anIntArrayArray2939!![this.anInt10289]!![1])
                        i_94_ += (class225.anIntArrayArray2939!![this.anInt10289]!![2])
                    }
                    if (class225.anIntArrayArray2910 != null && ((class225.anIntArrayArray2910!![this.anInt10289]) != null)) {
                        i_92_ += (class225.anIntArrayArray2910!![this.anInt10289]!![0])
                        i_93_ += (class225.anIntArrayArray2910!![this.anInt10289]!![1])
                        i_94_ += (class225.anIntArrayArray2910!![this.anInt10289]!![2])
                    }
                    if (i_94_ != 0 || i_92_ != 0) {
                        var i_95_ = i_74_
                        if ((this.anIntArray10296 != null) && ((this.anIntArray10296!![this.anInt10289]) != -1)) i_95_ = (this.anIntArray10296!![(this.anInt10289)])
                        val i_96_ = (0x3fff and -i_74_ + ((this.anInt10202) * 2048 + i_95_))
                        if (i_96_ != 0) class64_91_.a(i_96_)
                        val i_97_ = Class70.anIntArray1207!![i_96_]
                        val i_98_ = Class70.anIntArray1204!![i_96_]
                        val i_99_ = i_94_ * i_97_ + i_98_ * i_92_ shr 14
                        i_94_ = -(i_97_ * i_92_) + i_98_ * i_94_ shr 14
                        i_92_ = i_99_
                    }
                    class64_91_.H(i_92_, i_93_, i_94_)
                }
                if (this.anInt10260 != 0) class64_91_.H(0, (-this.anInt10260 shl 2), 0)
                if (bool_89_) {
                    if (this.anInt10302 != 0) class64_91_.FA(this.anInt10302)
                    if (this.anInt10208 != 0) class64_91_.VA(this.anInt10208)
                    if (this.anInt10252 != 0) class64_91_.H(0, (this.anInt10252), 0)
                }
            }
        }
        return true
    }

    override fun method2421(i: Byte): Int {
        if (i < 113) this.anInt10535 = 60
        anInt10543++
        return anInt10520
    }

    init {
        this.anInt10535 = -1
        this.anInt10526 = -1
        this.anInt10519 = -1
        this.anInt10522 = -1
        this.anInt10524 = -1
        this.anInt10560 = -1
        aByte10556 = 0.toByte()
        this.anInt10540 = -1
        aByte10552 = 0.toByte()
        aByte10538 = 0.toByte()
        this.anInt10561 = -1
    }

    companion object {
        @JvmField
        var anInt10518: Int = 0
        @JvmField
        var anInt10523: Int = 0
        @JvmField
        var anInt10525: Int = 0
        @JvmField
        var anInt10527: Int = 0
        @JvmField
        var anInt10528: Int = 0
        @JvmField
        var anInt10529: Int = 0
        @JvmField
        var anInt10530: Int = 0
        @JvmField
        var anInt10532: Int = 0
        @JvmField
        var anInt10533: Int = 0
        @JvmField
        var anInt10534: Int = 0
        @JvmField
        var anInt10541: Int = 0
        @JvmField
        var anInt10543: Int = 0
        @JvmField
        var anInt10545: Int = 0
        @JvmField
        var anInt10546: Int = 0
        @JvmField
        var anInt10547: Int = 0
        @JvmField
        var anInt10548: Int = 0
        @JvmField
        var anInt10550: Int = 0
        @JvmField
        var anInt10555: Int = 0
        @JvmField
        var anInt10559: Int = 0
        @JvmField
        var anInt10562: Int = 0
        @JvmField
        var anInt10563: Int = 0
        @JvmField
        var aHashtable10565: Hashtable<Any?, Any?>? = Hashtable<Any?, Any?>()
        @JvmField
        var anIntArray10566: IntArray? = null
        @JvmField
        var anInt10567: Int = -1

        @JvmStatic
        fun method2458(bool: Boolean) {
            anIntArray10566 = null
            if (bool != true) method2458(false)
            aHashtable10565 = null
        }

        @JvmStatic
        fun method2460(f: Float, i: Int, f_100_: Float, i_101_: Int, i_102_: Int, f_103_: Float, class186: Class186?, i_104_: Int, i_105_: Byte, i_106_: Int, f_107_: Float, `is`: ByteArray?, i_108_: Int, f_109_: Float) {
            var f = f
            var f_100_ = f_100_
            var f_107_ = f_107_
            var f_109_ = f_109_
            do {
                try {
                    anInt10559++
                    val i_110_ = i_102_ * i_106_
                    val fs = FloatArray(i_110_)
                    var i_111_ = 0
                    while (i_101_ > i_111_) {
                        var i_112_ = i
                        class186!!.method1398(i_108_, i_102_, f_100_ / i_106_.toFloat(), f_109_ / i_108_.toFloat(), 0, f * 127.0f, 1, f_107_ / i_102_.toFloat(), i_106_, i_104_, fs)
                        f_107_ *= 2.0f
                        f_100_ *= 2.0f
                        var i_113_ = 0
                        while (i_110_ > i_113_) {
                            `is`!![i_112_] = (`is`[i_112_] + fs[i_113_]).toInt().toByte()
                            i_112_++
                            i_113_++
                        }
                        f_109_ *= 2.0f
                        f *= f_103_
                        i_111_++
                    }
                    var i_114_ = i
                    for (i_115_ in 0..<i_110_) {
                        `is`!![i_114_] = (127 + `is`[i_114_]).toByte()
                        i_114_++
                    }
                    if (i_105_.toInt() == 30) break
                    aHashtable10565 = null
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("ke.LB(" + f + ',' + i + ',' + f_100_ + ',' + i_101_ + ',' + i_102_ + ',' + f_103_ + ',' + (if (class186 != null) "{...}" else "null") + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ',' + f_107_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_108_ + ',' + f_109_ + ')'))
                }
                break
            } while (false)
        }
    }
}
