import Class205.method1496
import Class348.Companion.method2711
import Class348_Sub17.Companion.method2929
import Class79.Companion.method802
import OutputStream_Sub2.Companion.method136

/* Class318_Sub1_Sub3_Sub3_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Npc : Class318_Sub1_Sub3_Sub3() {
    var anInt10499: Int = -1
    var aClass79_10505: Class79? = null
    var anInt10512: Int = -1
    private fun method2442(i: Int): Boolean {
        if (i != 1810797122) this.anInt10499 = -103
        anInt10510++
        return (this.aClass79_10505!!.aBoolean1396)
    }

    public override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_6_: Int, i_7_: Byte, i_8_: Int) {
        try {
            if (i_7_ > -106) this.aClass79_10505 = null
            anInt10513++
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("ff.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    public override fun method2392(bool: Boolean) {
        anInt10507++
        if (bool != true) this.anInt10499 = -13
        throw IllegalStateException()
    }

    public override fun method2391(var_ha: ha?, i: Int, i_9_: Int, i_10_: Int): Boolean {
        anInt10514++
        if (this.aClass79_10505 == null || !method2447(97, 131072, var_ha)) return false
        val class101 = var_ha!!.method3705()
        val i_11_ = this.aClass264_10217.method2019((-78).toByte())
        class101.method895(i_11_)
        class101.method891(this.x, this.anInt6382, this.y)
        var bool = false
        var i_12_ = i_10_
        while ((this.aClass64Array10323.size > i_12_)) {
            if (this.aClass64Array10323[i_12_] != null) {
                val bool_13_ = (this.aClass79_10505!!.anInt1337 > 0 || (if (this.aClass79_10505!!.anInt1333 != -1) this.aClass79_10505!!.anInt1333 == 1 else this.aClass79_10505!!.anInt1399 == 1))
                val bool_14_: Boolean
                if (Class305.aBoolean3870) bool_14_ = (this.aClass64Array10323[i_12_]!!.method623(i_9_, i, class101, bool_13_, this.aClass79_10505!!.anInt1337, Class132.anInt1906))
                else bool_14_ = (this.aClass64Array10323[i_12_]!!.method628(i_9_, i, class101, bool_13_, this.aClass79_10505!!.anInt1337))
                if (bool_14_) {
                    bool = true
                    break
                }
            }
            i_12_++
        }
        this.aClass64Array10323[2] = null
        this.aClass64Array10323[1] = this.aClass64Array10323[2]
        this.aClass64Array10323[0] = this.aClass64Array10323[1]
        return bool
    }

    fun method2443(i: Int, i_15_: Int, i_16_: Int) {
        anInt10497++
        var i_17_ = this.anIntArray10320!![0]
        var i_18_ = this.anIntArray10317!![0]
        if (i == 0) i_18_++
        if (i == 1) {
            i_17_++
            i_18_++
        }
        if (i == 2) i_17_++
        if (i == 3) {
            i_17_++
            i_18_--
        }
        if (i == 4) i_18_--
        if (i == 5) {
            i_17_--
            i_18_--
        }
        if (i == 6) i_17_--
        if (i == 7) {
            i_17_--
            i_18_++
        }
        if (this.anInt10286 != -1 && Class10.aClass87_191!!.method835(this.anInt10286, 7).anInt245 == 1) {
            this.anInt10286 = -1
            this.anIntArray10236 = null
        }
        if (this.anInt10269 != -1) {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(118.toByte(), this.anInt10269))
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (Class10.aClass87_191!!.method835(class368.anInt4503, 7).anInt245) == 1) this.anInt10269 = -1
        }
        if (this.anInt10291 != -1) {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(77.toByte(), this.anInt10291))
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (Class10.aClass87_191!!.method835(class368.anInt4503, 7).anInt245) == 1) this.anInt10291 = -1
        }
        if ((this.anInt10319.inv()) > i_16_) this.anInt10319++
        for (i_19_ in this.anInt10319 downTo 1) {
            this.anIntArray10320!![i_19_] = this.anIntArray10320!![-1 + i_19_]
            this.anIntArray10317!![i_19_] = this.anIntArray10317!![-1 + i_19_]
            this.aByteArray10321!![i_19_] = this.aByteArray10321!![i_19_ + -1]
        }
        this.anIntArray10320!![0] = i_17_
        this.anIntArray10317!![0] = i_18_
        this.aByteArray10321!![0] = i_15_.toByte()
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt10501++
        if (this.aClass79_10505 == null || !method2447(i + 114, 2048, var_ha)) return null
        val class101 = var_ha!!.method3705()
        val i_20_ = this.aClass264_10217.method2019((-69).toByte())
        class101.method895(i_20_)
        val class357 = (Class147.aClass357ArrayArrayArray2029!![this.plane.toInt()]!![this.x shr Class362.anInt4459]!![this.y shr Class362.anInt4459])
        if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null) {
            val i_21_ = (-class357.aClass318_Sub1_Sub1_4402!!.aShort8727 + this.anInt10274)
            this.anInt10274 = (this.anInt10274 - i_21_.toFloat() / 10.0f).toInt()
        } else this.anInt10274 = (this.anInt10274 - this.anInt10274.toFloat() / 10.0f).toInt()
        class101.method891(this.x, (-this.anInt10274 + this.anInt6382 + -20), this.y)
        val class225 = this.method2422(72.toByte())
        val class79 = (if (this.aClass79_10505!!.anIntArray1377 != null) this.aClass79_10505!!.method794(aClass170_10209!!, -1) else this.aClass79_10505)
        this.aBoolean10324 = false
        var class318_sub4: Class318_Sub4? = null
        if (Class316.aClass348_Sub51_3959!!.aClass239_Sub21_7270!!.method1812(-32350) == i && class79!!.aBoolean1369 && class225.aBoolean2913) {
            val class17 = (if (this.anInt10286 == -1 || this.anInt10218 != 0) null else Class10.aClass87_191!!.method835(this.anInt10286, 7))
            val class17_22_ = (if (this.anInt10268 == -1 || (this.aBoolean10213 && class17 != null)) null else Class10.aClass87_191!!.method835(this.anInt10268, 7))
            val class64 = (method2711(
                this.anInt10302,
                i_20_,
                this.aClass64Array10323[0],
                this.anInt10208,
                false,
                (if (class17_22_ == null) this.anInt10267 else this.anInt10245),
                0xffff and this.aClass79_10505!!.aShort1339.toInt(),
                this.aClass79_10505!!.anInt1399,
                this.anInt10252,
                var_ha,
                0xff and this.aClass79_10505!!.aByte1353.toInt(),
                this.aClass79_10505!!.aShort1350.toInt() and 0xffff,
                this.aClass79_10505!!.aByte1347.toInt() and 0xff,
                if (class17_22_ == null) class17 else class17_22_
            ))
            if (class64 != null) {
                class318_sub4 = (method136(1 + (this.aClass64Array10323).size, method2442(1810797122), false))
                this.aBoolean10324 = true
                var_ha.C(false)
                if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![(this.aClass64Array10323).size]), 0)
                else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![(this.aClass64Array10323).size]), Class132.anInt1906, 0)
                var_ha.C(true)
            }
        }
        class101.method895(i_20_)
        class101.method891(this.x, (-this.anInt10274 + (-5 + this.anInt6382)), this.y)
        if (class318_sub4 == null) class318_sub4 = method136((this.aClass64Array10323).size, method2442(1810797122), false)
        this.method2432(var_ha, -15074, class101, false, this.aClass64Array10323)
        if (Class305.aBoolean3870) {
            var i_24_ = 0
            while ((this.aClass64Array10323.size > i_24_)) {
                if (this.aClass64Array10323[i_24_] != null) this.aClass64Array10323[i_24_]!!.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![i_24_]), Class132.anInt1906, 0)
                i_24_++
            }
        } else {
            var i_23_ = 0
            while ((this.aClass64Array10323.size > i_23_)) {
                if (this.aClass64Array10323[i_23_] != null) this.aClass64Array10323[i_23_]!!.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![i_23_]), 0)
                i_23_++
            }
        }
        if (this.aClass318_Sub10_10327 != null) {
            val class98 = this.aClass318_Sub10_10327!!.method2525()
            if (Class305.aBoolean3870) var_ha.method3685(class98, Class132.anInt1906)
            else var_ha.method3684(class98)
        }
        var i_25_ = 0
        while ((this.aClass64Array10323.size > i_25_)) {
            if (this.aClass64Array10323[i_25_] != null) this.aBoolean10324 = this.aBoolean10324 or this.aClass64Array10323[i_25_]!!.F()
            i_25_++
        }
        this.anInt10301 = Class239_Sub15.anInt6006
        this.aClass64Array10323[2] = null
        this.aClass64Array10323[1] = this.aClass64Array10323[2]
        this.aClass64Array10323[0] = this.aClass64Array10323[1]
        return class318_sub4
    }

    public override fun method2421(i: Byte): Int {
        anInt10495++
        if ((this.aClass79_10505!!.anIntArray1377) != null) {
            val class79 = this.aClass79_10505!!.method794(aClass170_10209!!, -1)
            if (class79 != null && class79.anInt1366 != -1) return class79.anInt1366
        }
        if (i < 113) method2448(null, 88)
        return (this.aClass79_10505!!.anInt1366)
    }

    public override fun method2393(i: Int): Int {
        anInt10506++
        if (i >= -109) this.anInt10499 = -47
        if (this.aClass79_10505 == null) return 0
        return (this.aClass79_10505!!.anInt1337)
    }

    fun method2444(i: Int, bool: Boolean, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int) {
        this.aByte6376 = i_29_.toByte()
        this.plane = this.aByte6376
        anInt10515++
        if (method802(i, i_26_, true)) this.aByte6376++
        if (this.anInt10286 != -1 && Class10.aClass87_191!!.method835(this.anInt10286, 7).anInt245 == 1) {
            this.anIntArray10236 = null
            this.anInt10286 = -1
        }
        if (this.anInt10269 != -1) {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(117.toByte(), this.anInt10269))
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (Class10.aClass87_191!!.method835(class368.anInt4503, 7).anInt245) == 1) this.anInt10269 = -1
        }
        if (this.anInt10291 != -1) {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(56.toByte(), this.anInt10291))
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (Class10.aClass87_191!!.method835(class368.anInt4503, 7).anInt245) == 1) this.anInt10291 = -1
        }
        if (!bool) {
            val i_30_ = i_26_ - this.anIntArray10320!![0]
            val i_31_ = i + -this.anIntArray10317!![0]
            if (i_30_ >= -8 && i_30_ <= 8 && i_31_ >= -8 && i_31_ <= 8) {
                if (this.anInt10319 < 9) this.anInt10319++
                for (i_32_ in this.anInt10319 downTo 1) {
                    this.anIntArray10320!![i_32_] = (this.anIntArray10320!![i_32_ - 1])
                    this.anIntArray10317!![i_32_] = (this.anIntArray10317!![i_32_ + -1])
                    this.aByteArray10321!![i_32_] = (this.aByteArray10321!![i_32_ + -1])
                }
                this.anIntArray10320!![0] = i_26_
                this.anIntArray10317!![0] = i
                this.aByteArray10321!![0] = 1.toByte()
                return
            }
        }
        this.anInt10322 = 0
        this.anInt10319 = 0
        this.anIntArray10320!![0] = i_26_
        if (i_27_ >= 91) {
            this.anInt10326 = 0
            this.anIntArray10317!![0] = i
            this.x = (this.anIntArray10320!![0] shl 9) + (i_28_ shl 8)
            this.y = (this.anIntArray10317!![0] shl 9) + (i_28_ shl 8)
            if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327!!.method2529()
        }
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        if (i != 7) this.anInt10512 = 102
        anInt10493++
        return null
    }

    fun method2445(i: Byte): Boolean {
        anInt10500++
        if (this.aClass79_10505 == null) return false
        val i_33_ = 116 % ((-44 - i) / 38)
        return true
    }

    public override fun method2425(i: Int): Int {
        anInt10496++
        if ((this.aClass79_10505!!.anIntArray1377) != null) {
            val class79 = this.aClass79_10505!!.method794(aClass170_10209!!, -1)
            if (class79 != null && class79.anInt1336 != -1) return class79.anInt1336
        }
        if (i != -1) this.anInt10499 = -69
        return (this.aClass79_10505!!.anInt1336)
    }

    public override fun method2388(i: Int): Boolean {
        anInt10502++
        return i > -65
    }

    public override fun method2426(i: Int): Int {
        anInt10504++
        if (i != 200) return 115
        if ((this.aClass79_10505!!.anIntArray1377) != null) {
            val class79 = this.aClass79_10505!!.method794(aClass170_10209!!, -1)
            if (class79 != null && class79.anInt1390 != -1) return class79.anInt1390
        }
        if ((this.aClass79_10505!!.anInt1390) == -1) return super.method2426(200)
        return (this.aClass79_10505!!.anInt1390)
    }

    public override fun method2387(var_ha: ha?, i: Int) {
        anInt10509++
        if (this.aClass79_10505 != null && (this.aBoolean10318 || method2447(123, 0, var_ha))) {
            if (i > -125) method2391(null, -2, -103, 34)
            val class101 = var_ha!!.method3705()
            class101.method895(this.aClass264_10217.method2019((-118).toByte()))
            class101.method891(this.x, -20 + this.anInt6382, this.y)
            this.method2432(var_ha, -15074, class101, this.aBoolean10318, (this.aClass64Array10323))
            this.aClass64Array10323[2] = null
            this.aClass64Array10323[1] = this.aClass64Array10323[2]
            this.aClass64Array10323[0] = this.aClass64Array10323[1]
        }
    }

    private fun method2447(i: Int, i_34_: Int, var_ha: ha?): Boolean {
        var i_34_ = i_34_
        if (i <= 84) this.aClass79_10505 = null
        anInt10494++
        val i_35_ = i_34_
        val class225 = this.method2422(72.toByte())
        val class17 = (if (this.anInt10286 == -1 || this.anInt10218 != 0) null else Class10.aClass87_191!!.method835(this.anInt10286, 7))
        val class17_36_ = (if (this.anInt10268 != -1 && (!this.aBoolean10213 || class17 == null)) Class10.aClass87_191!!.method835(this.anInt10268, 7) else null)
        val i_37_ = class225.anInt2932
        val i_38_ = class225.anInt2941
        if (i_37_ != 0 || i_38_ != 0 || class225.anInt2950 != 0 || class225.anInt2926 != 0) i_34_ = i_34_ or 0x7
        val bool = (this.aByte10279.toInt() != 0 && (Class367_Sub11.anInt7396 >= this.anInt10248) && (Class367_Sub11.anInt7396 < this.anInt10250))
        if (bool) i_34_ = i_34_ or 0x80000
        val i_39_ = this.aClass264_10217.method2019((-25).toByte())
        val class64 = (this.aClass79_10505!!.method800(i_39_, this.aClass182Array10308, Class10.aClass87_191, false, class17_36_, this.anInt10203, Class64_Sub3.aClass261_5558, this.anInt10267, class17, aClass170_10209, var_ha, this.anInt10312, this.anIntArray10296, this.anInt10244, this.anInt10245, i_34_, this.anInt10232).also { this.aClass64Array10323[0] = it })
        if (class64 == null) return false
        this.anInt10207 = class64.fa()
        this.anInt10230 = class64.ma()
        this.method2439(-125, class64)
        if (i_37_ != 0 || i_38_ != 0) {
            this.method2424(i_39_, i_37_, class225.anInt2943, i_38_, 78.toByte(), class225.anInt2912)
            if (this.anInt10302 != 0) this.aClass64Array10323[0]!!.FA(this.anInt10302)
            if (this.anInt10208 != 0) this.aClass64Array10323[0]!!.VA(this.anInt10208)
            if (this.anInt10252 != 0) this.aClass64Array10323[0]!!.H(0, this.anInt10252, 0)
        } else this.method2424(i_39_, this.method2436(78.toByte()) shl 9, 0, this.method2436(108.toByte()) shl 9, 92.toByte(), 0)
        if (bool) class64.method624(this.aByte10255.toInt(), this.aByte10206.toInt(), this.aByte10270.toInt(), (0xff and this.aByte10279.toInt()))
        if (this.anInt10269 == -1 || this.anInt10240 == -1) this.aClass64Array10323[1] = null
        else {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(56.toByte(), this.anInt10269))
            val bool_40_ = (class368.aByte4488.toInt() == 3 && (i_37_ != 0 || i_38_ != 0))
            var i_41_ = i_35_
            if (!bool_40_) {
                if (this.anInt10237 != 0) i_41_ = i_41_ or 0x5
                if (this.anInt10220 != 0) i_41_ = i_41_ or 0x2
                if (this.anInt10278 >= 0) i_41_ = i_41_ or 0x7
            } else i_41_ = i_41_ or 0x7
            val class64_42_ = (class368.method3562(this.anInt10240, var_ha, this.anInt10243, i_41_, this.anInt10283, Class10.aClass87_191, 78.toByte()).also { this.aClass64Array10323[1] = it })
            if (class64_42_ != null) {
                if (this.anInt10278 < 0) {
                    if (this.anInt10237 != 0) class64_42_.a(2048 * (this.anInt10237))
                } else {
                    var i_43_ = 0
                    var i_44_ = 0
                    var i_45_ = 0
                    if (class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939!![this.anInt10278]) != null)) {
                        i_45_ += (class225.anIntArrayArray2939!![this.anInt10278]!![2])
                        i_43_ += (class225.anIntArrayArray2939!![this.anInt10278]!![0])
                        i_44_ += (class225.anIntArrayArray2939!![this.anInt10278]!![1])
                    }
                    if (class225.anIntArrayArray2910 != null && ((class225.anIntArrayArray2910!![this.anInt10278]) != null)) {
                        i_44_ += (class225.anIntArrayArray2910!![this.anInt10278]!![1])
                        i_43_ += (class225.anIntArrayArray2910!![this.anInt10278]!![0])
                        i_45_ += (class225.anIntArrayArray2910!![this.anInt10278]!![2])
                    }
                    if (i_45_ != 0 || i_43_ != 0) {
                        var i_46_ = i_39_
                        if ((this.anIntArray10296 != null) && ((this.anIntArray10296!![this.anInt10278]) != -1)) i_46_ = (this.anIntArray10296!![(this.anInt10278)])
                        val i_47_ = (-i_39_ + (i_46_ + 2048 * this.anInt10237) and 0x3fff)
                        if (i_47_ != 0) class64_42_.a(i_47_)
                        val i_48_ = Class70.anIntArray1207!![i_47_]
                        val i_49_ = Class70.anIntArray1204!![i_47_]
                        val i_50_ = i_45_ * i_48_ - -(i_43_ * i_49_) shr 14
                        i_45_ = i_45_ * i_49_ + -(i_43_ * i_48_) shr 14
                        i_43_ = i_50_
                    }
                    class64_42_.H(i_43_, i_44_, i_45_)
                }
                if (this.anInt10220 != 0) class64_42_.H(0, (-this.anInt10220 shl 2), 0)
                if (bool_40_) {
                    if (this.anInt10302 != 0) class64_42_.FA(this.anInt10302)
                    if (this.anInt10208 != 0) class64_42_.VA(this.anInt10208)
                    if (this.anInt10252 != 0) class64_42_.H(0, (this.anInt10252), 0)
                }
            }
        }
        if (this.anInt10291 == -1 || this.anInt10224 == -1) this.aClass64Array10323[2] = null
        else {
            val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(98.toByte(), this.anInt10291))
            val bool_51_ = (class368.aByte4488.toInt() == 3 && (i_37_ != 0 || i_38_ != 0))
            var i_52_ = i_35_
            if (!bool_51_) {
                if (this.anInt10202 != 0) i_52_ = i_52_ or 0x5
                if (this.anInt10260 != 0) i_52_ = i_52_ or 0x2
                if (this.anInt10289 >= 0) i_52_ = i_52_ or 0x7
            } else i_52_ = i_52_ or 0x7
            val class64_53_ = (class368.method3558(this.anInt10273, this.anInt10276, var_ha, i_52_, 3172, Class10.aClass87_191, this.anInt10224).also { this.aClass64Array10323[2] = it })
            if (class64_53_ != null) {
                if (this.anInt10289 >= 0 && class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939!![this.anInt10289]) != null)) {
                    var i_54_ = 0
                    var i_55_ = 0
                    var i_56_ = 0
                    if (class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939!![this.anInt10289]) != null)) {
                        i_55_ += (class225.anIntArrayArray2939!![this.anInt10289]!![1])
                        i_54_ += (class225.anIntArrayArray2939!![this.anInt10289]!![0])
                        i_56_ += (class225.anIntArrayArray2939!![this.anInt10289]!![2])
                    }
                    if (class225.anIntArrayArray2910 != null && ((class225.anIntArrayArray2910!![this.anInt10289]) != null)) {
                        i_55_ += (class225.anIntArrayArray2910!![this.anInt10289]!![1])
                        i_54_ += (class225.anIntArrayArray2910!![this.anInt10289]!![0])
                        i_56_ += (class225.anIntArrayArray2910!![this.anInt10289]!![2])
                    }
                    if (i_56_ != 0 || i_54_ != 0) {
                        var i_57_ = i_39_
                        if ((this.anIntArray10296 != null) && ((this.anIntArray10296!![this.anInt10289]) != -1)) i_57_ = (this.anIntArray10296!![(this.anInt10289)])
                        val i_58_ = (0x3fff and -i_39_ + (i_57_ + 2048 * this.anInt10202))
                        if (i_58_ != 0) class64_53_.a(i_58_)
                        val i_59_ = Class70.anIntArray1207!![i_58_]
                        val i_60_ = Class70.anIntArray1204!![i_58_]
                        val i_61_ = i_56_ * i_59_ - -(i_60_ * i_54_) shr 14
                        i_56_ = i_60_ * i_56_ - i_59_ * i_54_ shr 14
                        i_54_ = i_61_
                    }
                    class64_53_.H(i_54_, i_55_, i_56_)
                } else if (this.anInt10202 != 0) class64_53_.a(2048 * this.anInt10202)
                if (this.anInt10260 != 0) class64_53_.H(0, (-this.anInt10260 shl 2), 0)
                if (bool_51_) {
                    if (this.anInt10302 != 0) class64_53_.FA(this.anInt10302)
                    if (this.anInt10208 != 0) class64_53_.VA(this.anInt10208)
                    if (this.anInt10252 != 0) class64_53_.H(0, (this.anInt10252), 0)
                }
            }
        }
        return true
    }

    fun method2448(class79: Class79?, i: Int) {
        anInt10511++
        this.aClass79_10505 = class79
        if (i != -2) this.anInt10512 = 69
        if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327!!.method2529()
    }

    companion object {
        var anInt10493: Int = 0
        var anInt10494: Int = 0
        var anInt10495: Int = 0
        var anInt10496: Int = 0
        var anInt10497: Int = 0
        var anInt10498: Int = 0
        var anInt10500: Int = 0
        var anInt10501: Int = 0
        var anInt10502: Int = 0
        var anInt10503: Int = 0
        var anInt10504: Int = 0
        var anInt10506: Int = 0
        var anInt10507: Int = 0
        var anInt10508: Int = 0
        var anInt10509: Int = 0
        var anInt10510: Int = 0
        var anInt10511: Int = 0
        var anInt10513: Int = 0
        var anInt10514: Int = 0
        var anInt10515: Int = 0

        fun method2441(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
            if (i_2_ != -22728) anInt10503 = 121
            if (i_5_ - i_0_ >= Class369.anInt4960 && Class113.anInt1745 >= i_0_ + i_5_ && -i_0_ + i_3_ >= Class132.anInt1910 && i_3_ + i_0_ <= Class38.anInt513) Class299.method2255(i_0_, i_5_, (-68).toByte(), i_1_, i_3_, i_4_, i)
            else method1496(i, i_3_, i_4_, i_0_, 2, i_1_, i_5_)
            anInt10498++
        }

        fun method2446(c: Char, i: Byte): Boolean {
            if (i.toInt() != 105) anInt10503 = 124
            anInt10508++
            return (c.code >= 48 && c.code <= 57) || (c.code >= 65 && c.code <= 90) || (c.code >= 97 && c.code <= 122)
        }
    }
}
