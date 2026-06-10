import Class130.Companion.method1130
import Class169.Companion.method1301
import Class348_Sub23_Sub1.Companion.method2967
import Class348_Sub9.Companion.method2782
import OutputStream_Sub2.Companion.method136

/* Class318_Sub1_Sub3_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub1_Sub3_Sub1 internal constructor(var_ha: ha?, class51: Class51, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, bool: Boolean, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, bool_10_: Boolean) : Class318_Sub1_Sub3(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, class51.anInt895 == 1, method2782(i_9_, i_8_, 0)), Interface10 {
    private val aBoolean10003: Boolean
    private val aBoolean10014: Boolean
    private var aByte10015: Byte = 0
    private val aBoolean10017: Boolean
    private var aBoolean10019 = false
    private val aByte10024: Byte
    private var aClass30_10025: Class30? = null
    var aClass64_10028: Class64? = null
    private var aShort10032: Short = 0
    private var aR10036: r? = null
    override fun method40(i: Int) {
        if (i == -12031) {
            if (this.aClass64_10028 != null) this.aClass64_10028!!.method612()
            anInt10022++
        }
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) return 109
        anInt10006++
        if (this.aClass64_10028 == null) return 0
        return this.aClass64_10028!!.fa()
    }

    override fun method44(i: Int, var_ha: ha?) {
        anInt10008++
        val `object`: Any? = null
        val var_r: r?
        if (aR10036 != null || !aBoolean10003) {
            var_r = aR10036
            aR10036 = null
        } else {
            val class2 = method2417(0, var_ha, 262144, true)
            var_r = if (class2 != null) class2.aR118 else null
        }
        if (i != 836) method41(-125)
        if (var_r != null) method1130(var_r, this.aByte6376.toInt(), this.x, this.y, null)
    }

    init {
        do {
            try {
                aShort10032 = class51.anInt941.toShort()
                aByte10015 = i_9_.toByte()
                aByte10024 = i_8_.toByte()
                aBoolean10014 = class51.anInt874 != 0 && !bool
                aBoolean10017 = bool
                aBoolean10019 = bool_10_
                this.aByte6376 = i_0_.toByte()
                aBoolean10003 = (var_ha!!.method3682() && class51.aBoolean894 && !aBoolean10017 && Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350) != 0)
                var i_11_ = 2048
                if (aBoolean10019) i_11_ = i_11_ or 0x10000
                val class2 = method2417(0, var_ha, i_11_, aBoolean10003)
                if (class2 == null) break
                this.aClass64_10028 = class2.aClass64_119
                aR10036 = class2.aR118
                if (!aBoolean10019) break
                this.aClass64_10028 = this.aClass64_10028!!.method614(0.toByte(), i_11_, false)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("dm.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class51 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + bool_10_ + ')'))
            }
            break
        } while (false)
    }

    public override fun method2379(i: Int): Int {
        anInt10027++
        if (this.aClass64_10028 != null) return this.aClass64_10028!!.ma()
        return 0
    }

    override fun method38(i: Int): Boolean {
        if (i != -18443) return false
        anInt10037++
        return aBoolean10003
    }

    public override fun method2391(var_ha: ha?, i: Int, i_12_: Int, i_13_: Int): Boolean {
        anInt10005++
        if (i_13_ != 0) return false
        val class64 = method2414(-1, var_ha!!, 131072)
        if (class64 != null) {
            val class101 = var_ha!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            if (Class305.aBoolean3870) return class64.method623(i_12_, i, class101, false, 0, Class132.anInt1906)
            return class64.method628(i_12_, i, class101, false, 0)
        }
        return false
    }

    private fun method2414(i: Int, var_ha: ha, i_14_: Int): Class64? {
        if (i != -1) method2392(false)
        anInt10004++
        if (this.aClass64_10028 != null && var_ha.method3667(this.aClass64_10028!!.ua(), i_14_) == 0) return this.aClass64_10028
        val class2 = method2417(0, var_ha, i_14_, false)
        if (class2 == null) return null
        return class2.aClass64_119
    }

    public override fun method2387(var_ha: ha?, i: Int) {
        anInt10033++
        if (i > -125) aShort10032 = (-95).toShort()
    }

    fun method2416(i: Int): Int {
        if (i != 15) aByte10015 = 66.toByte()
        anInt10009++
        if (this.aClass64_10028 != null) return this.aClass64_10028!!.na() / 4
        return 15
    }

    public override fun method2388(i: Int): Boolean {
        anInt10035++
        if (i > -65) return true
        return aBoolean10019
    }

    override fun method41(i: Int): Int {
        if (i != -32228) this.aClass64_10028 = null
        anInt10030++
        return aByte10015.toInt()
    }

    public override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_16_: Int, i_17_: Byte, i_18_: Int) {
        do {
            try {
                anInt10034++
                if (class318_sub1 is Class318_Sub1_Sub4_Sub1) {
                    val class318_sub1_sub4_sub1 = class318_sub1
                    if (this.aClass64_10028 != null && (class318_sub1_sub4_sub1.aClass64_10071) != null) this.aClass64_10028!!.method613(class318_sub1_sub4_sub1.aClass64_10071, i_18_, i, i_16_, bool)
                } else if (class318_sub1 is Class318_Sub1_Sub3_Sub1) {
                    val class318_sub1_sub3_sub1_19_ = class318_sub1
                    if (this.aClass64_10028 != null && (class318_sub1_sub3_sub1_19_.aClass64_10028 != null)) this.aClass64_10028!!.method613(class318_sub1_sub3_sub1_19_.aClass64_10028, i_18_, i, i_16_, bool)
                }
                if (i_17_ < -106) break
                method2392(false)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("dm.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ')'))
            }
            break
        } while (false)
    }

    override fun method42(i: Int): Int {
        if (i > -62) return 126
        anInt10012++
        return aShort10032.toInt() and 0xffff
    }

    public override fun method2392(bool: Boolean) {
        anInt10020++
        if (bool != true) method38(120)
        aBoolean10019 = false
        if (this.aClass64_10028 != null) this.aClass64_10028!!.s(0x10000.inv() and this.aClass64_10028!!.ua())
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        if (aClass30_10025 == null) aClass30_10025 = (method2967(this.x, method2414(i + -8, var_ha!!, 0), this.y, this.anInt6382, 2))
        if (i != 7) return null
        anInt10013++
        return aClass30_10025
    }

    private fun method2417(i: Int, var_ha: ha?, i_20_: Int, bool: Boolean): Class2? {
        anInt10007++
        val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(i, 0xffff and aShort10032.toInt())
        val var_s: s?
        val var_s_21_: s?
        if (aBoolean10017) {
            var_s = Class332.aSArray4142!![this.aByte6376.toInt()]
            var_s_21_ = Class348_Sub1_Sub1.aSArray8801!![0]
        } else {
            var_s = (Class348_Sub1_Sub1.aSArray8801!![this.aByte6376.toInt()])
            if (this.aByte6376 >= 3) var_s_21_ = null
            else var_s_21_ = (Class348_Sub1_Sub1.aSArray8801!![this.aByte6376 - -1])
        }
        return class51.method476(var_ha, var_s_21_, (if (aByte10024.toInt() != 11) aByte10024 else 10).toInt(), i_20_, this.x, bool, var_s, this.anInt6382, this.y, (if (aByte10024.toInt() != 11) aByte10015.toInt() else aByte10015 + 4), 128)
    }

    public override fun method2376(i: Int): Boolean {
        if (i > -12) return false
        anInt10029++
        if (this.aClass64_10028 != null) {
            return !this.aClass64_10028!!.r()
        }
        return true
    }

    public override fun method2377(i: Byte): Boolean {
        if (i.toInt() != 122) method2381(null, -44)
        anInt10021++
        if (this.aClass64_10028 != null) return this.aClass64_10028!!.F()
        return false
    }

    override fun method43(var_ha: ha?, i: Int) {
        if (i != -14218) aBoolean10019 = false
        anInt10016++
        val `object`: Any? = null
        val var_r: r?
        if (aR10036 == null && aBoolean10003) {
            val class2 = method2417(i + 14218, var_ha, 262144, true)
            var_r = if (class2 != null) class2.aR118 else null
        } else {
            var_r = aR10036
            aR10036 = null
        }
        if (var_r != null) method1301(var_r, this.aByte6376.toInt(), this.x, this.y, null)
    }

    override fun method39(i: Int): Int {
        val i_27_ = -116 / ((-91 - i) / 35)
        anInt10026++
        return aByte10024.toInt()
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt10031++
        if (this.aClass64_10028 == null) return null
        val class101 = var_ha!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        val class318_sub4 = method136(i, aBoolean10014, false)
        if (!Class305.aBoolean3870) this.aClass64_10028!!.method615(class101, class318_sub4.aClass318_Sub3Array6414!![0], 0)
        else this.aClass64_10028!!.method608(class101, class318_sub4.aClass318_Sub3Array6414!![0], Class132.anInt1906, 0)
        return class318_sub4
    }

    companion object {
        var anInt10004: Int = 0
        var anInt10005: Int = 0
        var anInt10006: Int = 0
        var anInt10007: Int = 0
        var anInt10008: Int = 0
        var anInt10009: Int = 0
        var aClass348_Sub42_Sub17Array10010: Array<Class348_Sub42_Sub17?>? = arrayOfNulls<Class348_Sub42_Sub17>(14)
        var anInt10011: Int = 0
        var anInt10012: Int = 0
        var anInt10013: Int = 0
        var anInt10016: Int = 0
        var anInt10018: Int = 0
        var anInt10020: Int = 0
        var anInt10021: Int = 0
        var anInt10022: Int = 0
        var anInt10023: Int = -60
        var anInt10026: Int = 0
        var anInt10027: Int = 0
        var anInt10029: Int = 0
        var anInt10030: Int = 0
        var anInt10031: Int = 0
        var anInt10033: Int = 0
        var anInt10034: Int = 0
        var anInt10035: Int = 0
        var anInt10037: Int = 0

        @JvmStatic
        fun method2415(i: Int) {
            aClass348_Sub42_Sub17Array10010 = null
            val i_15_ = 93 / ((i - -62) / 35)
        }

        @JvmStatic
        fun method2418(string: String, i: Byte): Int {
            anInt10011++
            val i_22_ = -51 / ((i - 3) / 42)
            val i_23_ = string.length
            var i_24_ = 0
            var i_25_ = 0
            while (i_23_ > i_25_) {
                i_24_ = string.get(i_25_).code + ((i_24_ shl 5) + -i_24_)
                i_25_++
            }
            return i_24_
        }

        @JvmStatic
        fun method2419(i: Byte, i_26_: Int): Int {
            anInt10018++
            if (i < 122) return -49
            return i_26_ ushr 8
        }
    }
}
