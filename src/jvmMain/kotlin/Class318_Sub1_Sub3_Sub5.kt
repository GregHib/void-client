import Class275.method2064
import OutputStream_Sub2.Companion.method136
import kotlin.math.atan2
import kotlin.math.sqrt
import kotlin.math.tan

/* Class318_Sub1_Sub3_Sub5 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub1_Sub3_Sub5 internal constructor(i: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int, private val anInt10393: Int, i_31_: Int, var anInt10412: Int, i_33_: Int, private val aBoolean10398: Boolean, private val anInt10367: Int) :
    Class318_Sub1_Sub3(i_22_, i_23_, i_24_, method2064(i_24_, i_22_, 11219, i_25_) + -i_26_, i_25_, i_24_ shr 9, i_24_ shr 9, i_25_ shr 9, i_25_ shr 9, false, 0.toByte()) {
    private var anInt10365 = 0
    var anInt10366: Int
    private var anInt10368 = 0
    private var anInt10369 = -1
    private var aDouble10371 = 0.0
    private val aClass17_10375: Class17?
    private var aClass318_Sub10_10378: Class318_Sub10? = null
    private var anInt10381: Int
    private var aDouble10383 = 0.0
    private var aDouble10384 = 0.0
    private var anInt10386 = 0
    private val anInt10387: Int
    private val anInt10391: Int
    var anInt10392: Int
    private var anInt10396 = 0
    private var aBoolean10399 = false
    private var aDouble10400 = 0.0
    private var aDouble10401 = 0.0
    private var anInt10403 = 0
    private var aBoolean10407 = false
    private var aDouble10408 = 0.0
    private var aDouble10409 = 0.0
    private var anInt10410 = 0
    var anInt10411: Int
    private val anInt10413: Int
    private var aDouble10414 = 0.0
    public override fun method2387(var_ha: ha?, i: Int) {
        anInt10379++
        val class64 = method2476(0, var_ha, 127.toByte())
        if (class64 != null) {
            if (i >= -125) this.anInt10366 = 56
            val class101 = var_ha!!.method3705()
            class101.method899(anInt10396)
            class101.method896(anInt10386)
            class101.method891(aDouble10408.toInt(), aDouble10384.toInt(), aDouble10371.toInt())
            anInt10410 = class64.fa()
            anInt10368 = class64.ma()
            method2473(class101, class64, var_ha, -2393)
        }
    }

    fun method2471(i: Byte, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        if (!aBoolean10407) {
            val d = (i_3_ + -this.x).toDouble()
            val d_4_ = (i_1_ + -this.y).toDouble()
            val d_5_ = sqrt(d * d + d_4_ * d_4_)
            aDouble10408 = (this.x.toDouble() + anInt10393.toDouble() * d / d_5_)
            aDouble10371 = (anInt10393.toDouble() * d_4_ / d_5_ + this.y.toDouble())
            if (!aBoolean10398) aDouble10384 = this.anInt6382.toDouble()
            else aDouble10384 = (method2064(aDouble10408.toInt(), (this.plane).toInt(), 11219, aDouble10371.toInt()) - anInt10413).toDouble()
        }
        anInt10405++
        if (i.toInt() != -103) anInt10381 = 104
        val d = (-i_2_ + (1 + this.anInt10392)).toDouble()
        aDouble10414 = (i_1_.toDouble() - aDouble10371) / d
        aDouble10401 = (i_3_.toDouble() - aDouble10408) / d
        aDouble10400 = sqrt(aDouble10401 * aDouble10401 + aDouble10414 * aDouble10414)
        if (anInt10381 != -1) {
            if (!aBoolean10407) aDouble10409 = (-aDouble10400 * tan(0.02454369 * anInt10381.toDouble()))
            aDouble10383 = 2.0 * (i_0_.toDouble() - aDouble10384 - d * aDouble10409) / (d * d)
        } else aDouble10409 = (i_0_.toDouble() - aDouble10384) / d
    }

    public override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_6_: Int, i_7_: Byte, i_8_: Int) {
        try {
            if (i_7_ > -106) method2474(11.toByte())
            anInt10415++
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("to.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    protected fun finalize() {
        anInt10390++
        if (aClass318_Sub10_10378 != null) aClass318_Sub10_10378!!.method2534()
    }

    fun method2472(i: Int) {
        if (aClass318_Sub10_10378 != null) aClass318_Sub10_10378!!.method2534()
        anInt10404++
        if (i != -2159) aBoolean10399 = false
    }

    public override fun method2388(i: Int): Boolean {
        anInt10374++
        if (i >= -65) aDouble10401 = -1.299791202228721
        return false
    }

    private fun method2473(class101: Class101?, class64: Class64?, var_ha: ha?, i: Int) {
        do {
            try {
                anInt10406++
                class64!!.method620(class101)
                val class129s = class64.method619()
                val class342s = class64.method604()
                if ((aClass318_Sub10_10378 == null || aClass318_Sub10_10378!!.aBoolean6470) && (class129s != null || class342s != null)) aClass318_Sub10_10378 = Class318_Sub10.Companion.method2526(Class367_Sub11.anInt7396, true)
                if (aClass318_Sub10_10378 != null) {
                    aClass318_Sub10_10378!!.method2536(var_ha, Class367_Sub11.anInt7396.toLong(), class129s, class342s, false)
                    aClass318_Sub10_10378!!.method2533(this.plane.toInt(), this.aShort8743.toInt(), this.aShort8751.toInt(), this.aShort8750.toInt(), this.aShort8747.toInt())
                }
                if (i == -2393) break
                finalize()
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("to.L(" + (if (class101 != null) "{...}" else "null") + ',' + (if (class64 != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i + ')'))
            }
            break
        } while (false)
    }

    public override fun method2379(i: Int): Int {
        if (i != -25675) return -92
        anInt10385++
        return anInt10368
    }

    public override fun method2394(bool: Boolean): Int {
        anInt10372++
        if (bool != true) return 99
        return anInt10410
    }

    fun method2474(i: Byte) {
        anInt10394++
        if (!aBoolean10407 && i.toInt() == 121) {
            if (anInt10387 != 0) {
                var class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3? = null
                if (anInt10387 < 0) {
                    val i_9_ = -1 + -anInt10387
                    if (i_9_ == Class348_Sub42_Sub11.anInt9591) class318_sub1_sub3_sub3 = Class132.aPlayer_1907
                    else class318_sub1_sub3_sub3 = (Class294.aPlayerArray5058!![i_9_])
                } else {
                    val i_10_ = -1 + anInt10387
                    val class348_sub22 = (Class282.aClass356_3654!!.method3480(i_10_.toLong(), -6008) as Class348_Sub22?)
                    if (class348_sub22 != null) class318_sub1_sub3_sub3 = (class348_sub22.aNpc_6859)
                }
                if (class318_sub1_sub3_sub3 != null) {
                    this.y = class318_sub1_sub3_sub3.y
                    this.x = class318_sub1_sub3_sub3.x
                    this.anInt6382 = method2064((class318_sub1_sub3_sub3.x), this.plane.toInt(), 11219, (class318_sub1_sub3_sub3.y)) + -anInt10413
                    if (anInt10367 >= 0) {
                        val class225 = class318_sub1_sub3_sub3.method2422(72.toByte())
                        var i_11_ = 0
                        var i_12_ = 0
                        if (class225.anIntArrayArray2939 != null && (class225.anIntArrayArray2939!![anInt10367]) != null) {
                            i_11_ += (class225.anIntArrayArray2939!![anInt10367]!![0])
                            i_12_ += (class225.anIntArrayArray2939!![anInt10367]!![2])
                        }
                        if (class225.anIntArrayArray2910 != null && (class225.anIntArrayArray2910!![anInt10367]) != null) {
                            i_12_ += (class225.anIntArrayArray2910!![anInt10367]!![2])
                            i_11_ += (class225.anIntArrayArray2910!![anInt10367]!![0])
                        }
                        if (i_11_ != 0 || i_12_ != 0) {
                            val i_13_ = class318_sub1_sub3_sub3.aClass264_10217.method2019((-91).toByte())
                            var i_14_ = i_13_
                            if ((class318_sub1_sub3_sub3.anIntArray10296 != null) && (class318_sub1_sub3_sub3.anIntArray10296!![anInt10367]) != -1) i_14_ = (class318_sub1_sub3_sub3.anIntArray10296!![anInt10367])
                            val i_15_ = 0x3fff and -i_13_ + i_14_
                            val i_16_ = Class70.anIntArray1207!![i_15_]
                            val i_17_ = Class70.anIntArray1204!![i_15_]
                            val i_18_ = i_12_ * i_16_ + i_11_ * i_17_ shr 14
                            i_12_ = (-(i_11_ * i_16_) + i_12_ * i_17_ shr 14)
                            i_11_ = i_18_
                            this.x += i_11_
                            this.y += i_12_
                        }
                    }
                }
            }
        }
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        if (i != 7) aBoolean10407 = true
        anInt10376++
        return null
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt10397++
        val class64 = method2476(2048, var_ha, 127.toByte())
        if (class64 == null) return null
        val class101 = var_ha!!.method3705()
        class101.method899(anInt10396)
        class101.method896(anInt10386)
        class101.method891(aDouble10408.toInt(), aDouble10384.toInt(), aDouble10371.toInt())
        method2473(class101, class64, var_ha, -2393)
        val class318_sub4 = method136(i, false, false)
        if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), Class132.anInt1906, 0)
        if (aClass318_Sub10_10378 != null) {
            val class98 = aClass318_Sub10_10378!!.method2525()
            if (Class305.aBoolean3870) var_ha.method3685(class98, Class132.anInt1906)
            else var_ha.method3684(class98)
        }
        aBoolean10399 = class64.F()
        anInt10410 = class64.fa()
        anInt10368 = class64.ma()
        return class318_sub4
    }

    public override fun method2391(var_ha: ha?, i: Int, i_19_: Int, i_20_: Int): Boolean {
        if (i_20_ != 0) return true
        anInt10380++
        return false
    }

    fun method2475(i: Byte, i_21_: Int) {
        aBoolean10407 = true
        anInt10388++
        aDouble10408 += i_21_.toDouble() * aDouble10401
        aDouble10371 += i_21_.toDouble() * aDouble10414
        if (aBoolean10398) aDouble10384 = (method2064(aDouble10408.toInt(), (this.plane).toInt(), 11219, aDouble10371.toInt()) + -anInt10413).toDouble()
        else if (anInt10381 == -1) aDouble10384 += aDouble10409 * i_21_.toDouble()
        else {
            aDouble10384 += (i_21_.toDouble() * (aDouble10383 * 0.5) * i_21_.toDouble() + i_21_.toDouble() * aDouble10409)
            aDouble10409 += aDouble10383 * i_21_.toDouble()
        }
        anInt10386 = 0x3fff and 8192 + (atan2(aDouble10401, aDouble10414) * 2607.5945876176133).toInt()
        anInt10396 = (atan2(aDouble10409, aDouble10400) * 2607.5945876176133).toInt() and 0x3fff
        if (i <= 33) method2379(-27)
        if (aClass17_10375 != null) {
            anInt10403 += i_21_
            while (aClass17_10375.anIntArray267!![anInt10365] < anInt10403) {
                anInt10403 -= aClass17_10375.anIntArray267!![anInt10365]
                anInt10365++
                if (anInt10365 >= aClass17_10375.anIntArray237.size) {
                    anInt10365 -= aClass17_10375.anInt238
                    if (anInt10365 < 0 || anInt10365 >= (aClass17_10375.anIntArray237).size) anInt10365 = 0
                }
                anInt10369 = anInt10365 - -1
                if (aClass17_10375.anIntArray237.size <= anInt10369) {
                    anInt10369 -= aClass17_10375.anInt238
                    if (anInt10369 < 0 || anInt10369 >= aClass17_10375.anIntArray237.size) anInt10369 = -1
                }
            }
        }
    }

    public override fun method2392(bool: Boolean) {
        if (bool != true) this.anInt10411 = -29
        anInt10402++
        throw IllegalStateException()
    }

    init {
        aBoolean10407 = false
        this.anInt10366 = i_33_
        anInt10391 = i
        this.anInt10392 = i_28_
        anInt10413 = i_26_
        anInt10381 = i_29_
        this.anInt10411 = i_27_
        anInt10387 = i_31_
        val i_35_ = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(72.toByte(), anInt10391).anInt4503)
        if (i_35_ != -1) aClass17_10375 = Class10.aClass87_191!!.method835(i_35_, 7)
        else aClass17_10375 = null
    }

    public override fun method2376(i: Int): Boolean {
        if (i >= -12) return false
        anInt10373++
        return false
    }

    public override fun method2409(i: Byte) {
        this.aShort8751 = (aDouble10408 / 512.0).toInt().toShort()
        this.aShort8743 = this.aShort8751
        this.aShort8747 = (aDouble10371 / 512.0).toInt().toShort()
        this.aShort8750 = this.aShort8747
        if (i > -109) method2386(47, null)
        anInt10370++
    }

    private fun method2476(i: Int, var_ha: ha?, i_36_: Byte): Class64? {
        anInt10377++
        val class368 = Class348_Sub40_Sub18.aClass319_9245!!.method2543(75.toByte(), anInt10391)
        if (i_36_ < 126) aClass318_Sub10_10378 = null
        return class368.method3562(anInt10365, var_ha, anInt10403, i, anInt10369, Class10.aClass87_191, 121.toByte())
    }

    public override fun method2377(i: Byte): Boolean {
        anInt10389++
        if (i.toInt() != 122) aClass318_Sub10_10378 = null
        return aBoolean10399
    }

    companion object {
        var anInt10370: Int = 0
        var anInt10372: Int = 0
        var anInt10373: Int = 0
        var anInt10374: Int = 0
        var anInt10376: Int = 0
        var anInt10377: Int = 0
        var anInt10379: Int = 0
        var anInt10380: Int = 0
        var anInt10382: Int = 0
        var anInt10385: Int = 0
        var anInt10388: Int = 0
        var anInt10389: Int = 0
        var anInt10390: Int = 0
        var anInt10394: Int = 0
        @JvmField
        var anInt10395: Int = -1
        var anInt10397: Int = 0
        var anInt10402: Int = 0
        var anInt10404: Int = 0
        var anInt10405: Int = 0
        var anInt10406: Int = 0
        var anInt10415: Int = 0

        fun method2477(string: String?, string_37_: String?, i: Byte, i_38_: Int, string_39_: String?, string_40_: String?, i_41_: Int, i_42_: Int, string_43_: String?) {
            try {
                anInt10382++
                var class147: Class147? = Class318_Sub2.Companion.aClass147Array6400!![99]
                for (i_44_ in 99 downTo 1) Class318_Sub2.Companion.aClass147Array6400!![i_44_] = Class318_Sub2.Companion.aClass147Array6400!![i_44_ + -1]
                if (class147 == null) class147 = Class147(i_41_, i_42_, string_39_, string, string_43_, string_40_, i_38_, string_37_)
                else class147.method1196(i_41_, i_42_, string_43_, string, string_40_, -18691, i_38_, string_39_, string_37_)
                Class318_Sub2.Companion.aClass147Array6400!![0] = class147
                Class348_Sub42_Sub3.anInt9501 = Class311.anInt3918
                if (i <= -109) za_Sub1.anInt9774++
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("to.K(" + (if (string != null) "{...}" else "null") + ',' + (if (string_37_ != null) "{...}" else "null") + ',' + i + ',' + i_38_ + ',' + (if (string_39_ != null) "{...}" else "null") + ',' + (if (string_40_ != null) "{...}" else "null") + ',' + i_41_ + ',' + i_42_ + ',' + (if (string_43_ != null) "{...}" else "null") + ')'))
            }
        }
    }
}
