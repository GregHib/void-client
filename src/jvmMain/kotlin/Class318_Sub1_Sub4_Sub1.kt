import Class130.Companion.method1130
import Class169.Companion.method1301
import Class348_Sub23_Sub1.Companion.method2967
import OutputStream_Sub2.Companion.method136

/* Class318_Sub1_Sub4_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub1_Sub4_Sub1 internal constructor(var_ha: ha?, class51: Class51?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, bool: Boolean, i_4_: Int, i_5_: Int, bool_6_: Boolean) : Class318_Sub1_Sub4(i_1_, i_2_, i_3_, i, i_0_, Class286_Sub9.method2175(i_5_, (-34).toByte(), i_4_)), Interface10 {
    private var aByte10062: Byte = 0
    private val aBoolean10064: Boolean
    private var aBoolean10066 = false
    var aClass64_10071: Class64? = null
    private val aBoolean10076: Boolean
    private var aByte10079: Byte = 0
    private var aShort10081: Short = 0
    private var aClass30_10082: Class30? = null
    private var aBoolean10090 = false
    private var aR10094: r? = null

    init {
        do {
            try {
                aShort10081 = class51!!.anInt941.toShort()
                aBoolean10066 = bool
                aBoolean10090 = bool_6_
                this.x = i_1_
                aBoolean10076 = (class51.anInt874 != 0 && !bool)
                this.y = i_3_
                aByte10079 = i_4_.toByte()
                aByte10062 = i_5_.toByte()
                aBoolean10064 = (var_ha!!.method3682() && class51.aBoolean894 && !aBoolean10066 && Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350) != 0)
                var i_7_ = 2048
                if (aBoolean10090) i_7_ = i_7_ or 0x10000
                val class2 = method2481(aBoolean10064, i_7_, -4, var_ha)
                if (class2 == null) break
                aR10094 = class2.aR118
                this.aClass64_10071 = class2.aClass64_119
                if (!aBoolean10090) break
                this.aClass64_10071 = this.aClass64_10071!!.method614(0.toByte(), i_7_, false)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ge.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class51 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ',' + bool_6_ + ')'))
            }
            break
        } while (false)
    }

    override fun method39(i: Int): Int {
        anInt10080++
        val i_8_ = 69 % ((i - -91) / 35)
        return aByte10079.toInt()
    }

    override fun method40(i: Int) {
        anInt10077++
        if (this.aClass64_10071 != null) this.aClass64_10071!!.method612()
        if (i != -12031) method38(-122)
    }

    public override fun method2391(var_ha: ha?, i: Int, i_9_: Int, i_10_: Int): Boolean {
        anInt10070++
        val class64 = method2482(var_ha!!, 126.toByte(), 131072)
        if (i_10_ != 0) method41(-96)
        if (class64 != null) {
            val class101 = var_ha!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            if (Class305.aBoolean3870) return class64.method623(i_9_, i, class101, false, 0, Class132.anInt1906)
            return class64.method628(i_9_, i, class101, false, 0)
        }
        return false
    }

    public override fun method2387(var_ha: ha?, i: Int) {
        if (i > -125) method42(115)
        anInt10067++
    }

    override fun method41(i: Int): Int {
        anInt10087++
        if (i != -32228) return 1
        return aByte10062.toInt()
    }

    public override fun method2392(bool: Boolean) {
        anInt10091++
        if (bool != true) method2394(true)
        aBoolean10090 = false
        if (this.aClass64_10071 != null) this.aClass64_10071!!.s(this.aClass64_10071!!.ua() and 0x10000.inv())
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        anInt10075++
        if (aClass30_10082 == null) aClass30_10082 = (method2967(this.x, method2482(var_ha!!, 117.toByte(), 0), this.y, this.anInt6382, i + -5))
        if (i != 7) aBoolean10066 = false
        return aClass30_10082
    }

    override fun method42(i: Int): Int {
        anInt10088++
        if (i > -62) return -96
        return aShort10081.toInt() and 0xffff
    }

    public override fun method2379(i: Int): Int {
        anInt10063++
        if (i != -25675) aByte10079 = 53.toByte()
        if (this.aClass64_10071 != null) return this.aClass64_10071!!.ma()
        return 0
    }

    override fun method38(i: Int): Boolean {
        anInt10078++
        if (i != -18443) aShort10081 = 37.toShort()
        return aBoolean10064
    }

    public override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_11_: Int, i_12_: Byte, i_13_: Int) {
        try {
            if (i_12_ > -106) method2388(-102)
            if (class318_sub1 is Class318_Sub1_Sub4_Sub1) {
                val class318_sub1_sub4_sub1_14_ = class318_sub1
                if (this.aClass64_10071 != null && (class318_sub1_sub4_sub1_14_.aClass64_10071) != null) this.aClass64_10071!!.method613(class318_sub1_sub4_sub1_14_.aClass64_10071, i_13_, i, i_11_, bool)
            } else if (class318_sub1 is Class318_Sub1_Sub3_Sub1) {
                val class318_sub1_sub3_sub1 = class318_sub1
                if (this.aClass64_10071 != null && (class318_sub1_sub3_sub1.aClass64_10028) != null) this.aClass64_10071!!.method613((class318_sub1_sub3_sub1.aClass64_10028), i_13_, i, i_11_, bool)
            }
            anInt10083++
        } catch (runtimeexception: RuntimeException) {
            runtimeexception.printStackTrace()
            throw Class348_Sub17.method2929(runtimeexception, ("ge.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'))
        }
    }

    override fun method44(i: Int, var_ha: ha?) {
        anInt10092++
        val `object`: Any? = null
        val var_r: r?
        if (aR10094 == null && aBoolean10064) {
            val class2 = method2481(true, 262144, -4, var_ha)
            var_r = if (class2 == null) null else class2.aR118
        } else {
            var_r = aR10094
            aR10094 = null
        }
        if (var_r != null) method1130(var_r, this.aByte6376.toInt(), this.x, this.y, null)
        if (i != 836) aR10094 = null
    }

    private fun method2481(bool: Boolean, i: Int, i_15_: Int, var_ha: ha?): Class2? {
        if (i_15_ != -4) aClass30_10082 = null
        anInt10086++
        val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, aShort10081.toInt() and 0xffff)
        val var_s: s?
        val var_s_16_: s?
        if (aBoolean10066) {
            var_s = Class348_Sub1_Sub1.aSArray8801!![0]
            var_s_16_ = Class332.aSArray4142!![this.aByte6376.toInt()]
        } else {
            var_s_16_ = (Class348_Sub1_Sub1.aSArray8801!![this.aByte6376.toInt()])
            if (this.aByte6376 < 3) var_s = (Class348_Sub1_Sub1.aSArray8801!![1 + this.aByte6376])
            else var_s = null
        }
        return class51.method476(var_ha, var_s, aByte10079.toInt(), i, this.x, bool, var_s_16_, this.anInt6382, this.y, aByte10062.toInt(), i_15_ + 132)
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt10069++
        if (this.aClass64_10071 == null) return null
        val class101 = var_ha!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        val class318_sub4 = method136(i, aBoolean10076, false)
        if (!Class305.aBoolean3870) this.aClass64_10071!!.method615(class101, class318_sub4.aClass318_Sub3Array6414!![0], 0)
        else this.aClass64_10071!!.method608(class101, class318_sub4.aClass318_Sub3Array6414!![0], Class132.anInt1906, 0)
        return class318_sub4
    }

    private fun method2482(var_ha: ha, i: Byte, i_17_: Int): Class64? {
        if (i <= 113) method2387(null, -99)
        anInt10072++
        if (this.aClass64_10071 != null && var_ha.method3667(this.aClass64_10071!!.ua(), i_17_) == 0) return this.aClass64_10071
        val class2 = method2481(false, i_17_, -4, var_ha)
        if (class2 != null) return class2.aClass64_119
        return null
    }

    public override fun method2394(bool: Boolean): Int {
        anInt10093++
        if (bool != true) aByte10062 = (-75).toByte()
        if (this.aClass64_10071 == null) return 0
        return this.aClass64_10071!!.fa()
    }

    public override fun method2388(i: Int): Boolean {
        anInt10089++
        if (i > -65) return true
        return aBoolean10090
    }

    public override fun method2377(i: Byte): Boolean {
        anInt10065++
        if (i.toInt() != 122) return true
        if (this.aClass64_10071 == null) return false
        return this.aClass64_10071!!.F()
    }

    public override fun method2376(i: Int): Boolean {
        if (i >= -12) method2388(-68)
        anInt10085++
        if (this.aClass64_10071 != null) {
            return !this.aClass64_10071!!.r()
        }
        return true
    }

    override fun method43(var_ha: ha?, i: Int) {
        if (i != -14218) aClass30_10082 = null
        anInt10068++
        val `object`: Any? = null
        val var_r: r?
        if (aR10094 == null && aBoolean10064) {
            val class2 = method2481(true, 262144, -4, var_ha)
            var_r = if (class2 == null) null else class2.aR118
        } else {
            var_r = aR10094
            aR10094 = null
        }
        if (var_r != null) method1301(var_r, this.aByte6376.toInt(), this.x, this.y, null)
    }

    companion object {
        var anInt10063: Int = 0
        var anInt10065: Int = 0
        var anInt10067: Int = 0
        var anInt10068: Int = 0
        var anInt10069: Int = 0
        var anInt10070: Int = 0
        var anInt10072: Int = 0
        @JvmField
        var anInt10073: Int = 0
        var anInt10074: Int = 0
        var anInt10075: Int = 0
        var anInt10077: Int = 0
        var anInt10078: Int = 0
        var anInt10080: Int = 0
        var anInt10083: Int = 0
        @JvmField
        var anInt10084: Int = 0
        var anInt10085: Int = 0
        var anInt10086: Int = 0
        var anInt10087: Int = 0
        var anInt10088: Int = 0
        var anInt10089: Int = 0
        var anInt10091: Int = 0
        var anInt10092: Int = 0
        var anInt10093: Int = 0
    }
}
