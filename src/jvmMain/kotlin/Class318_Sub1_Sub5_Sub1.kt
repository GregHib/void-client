import Class130.Companion.method1130
import Class148.Companion.method1197
import Class169.Companion.method1301
import Class239_Sub17.Companion.method1796
import Class239_Sub21.Companion.method1813
import Class348_Sub23_Sub1.Companion.method2967
import Class367_Sub8.Companion.method3549
import OutputStream_Sub2.Companion.method136

/* Class318_Sub1_Sub5_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub1_Sub5_Sub1 internal constructor(var_ha: ha?, class51: Class51?, i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, bool: Boolean, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int) : Class318_Sub1_Sub5(i_8_, i_9_, i_10_, i, i_7_, i_11_, i_12_), Interface10 {
    private val aByte10118: Byte
    private var aClass64_10124: Class64? = null
    private var aClass30_10127: Class30? = null
    private var aR10128: r? = null
    private val aShort10129: Short
    private var aBoolean10130 = false
    private var aBoolean10137 = false
    private var aBoolean10138 = false
    private var aByte10145: Byte = 0
    private fun method2488(i: Int, i_0_: Int, var_ha: ha): Class64? {
        if (i_0_ != 0) return null
        anInt10126++
        if (aClass64_10124 != null && var_ha.method3667(aClass64_10124!!.ua(), i) == 0) return aClass64_10124
        val class2 = method2491((-51).toByte(), false, i, var_ha)
        if (class2 == null) return null
        return class2.aClass64_119
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt10122++
        if (aClass64_10124 == null) return null
        val class101 = var_ha!!.method3705()
        class101.method894((this.x - -this.aShort8781), this.anInt6382, (this.y - -this.aShort8769))
        val class318_sub4 = method136(i, aBoolean10130, false)
        if (Class305.aBoolean3870) aClass64_10124!!.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), Class132.anInt1906, 0)
        else aClass64_10124!!.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        return class318_sub4
    }

    override fun method40(i: Int) {
        if (i != -12031) aByte10145 = (-104).toByte()
        anInt10147++
        if (aClass64_10124 != null) aClass64_10124!!.method612()
    }

    public override fun method2377(i: Byte): Boolean {
        if (i.toInt() != 122) aBoolean10137 = false
        anInt10131++
        if (aClass64_10124 != null) return aClass64_10124!!.F()
        return false
    }

    override fun method42(i: Int): Int {
        anInt10143++
        if (i >= -62) method39(-120)
        return 0xffff and aShort10129.toInt()
    }

    public override fun method2379(i: Int): Int {
        anInt10123++
        if (i != -25675) aClass64_10124 = null
        if (aClass64_10124 != null) return aClass64_10124!!.ma()
        return 0
    }

    public override fun method2391(var_ha: ha?, i: Int, i_2_: Int, i_3_: Int): Boolean {
        anInt10119++
        val class64 = method2488(131072, i_3_, var_ha!!)
        if (class64 != null) {
            val class101 = var_ha.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            if (Class305.aBoolean3870) return class64.method623(i_2_, i, class101, false, 0, Class132.anInt1906)
            return class64.method628(i_2_, i, class101, false, 0)
        }
        return false
    }

    public override fun method2376(i: Int): Boolean {
        anInt10136++
        if (i > -12) return false
        if (aClass64_10124 != null) {
            return !aClass64_10124!!.r()
        }
        return true
    }

    override fun method39(i: Int): Int {
        anInt10141++
        val i_4_ = -57 % ((-91 - i) / 35)
        return aByte10145.toInt()
    }

    override fun method43(var_ha: ha?, i: Int) {
        if (i != -14218) aClass30_10127 = null
        anInt10144++
        val `object`: Any? = null
        val var_r: r?
        if (aR10128 != null || !aBoolean10137) {
            var_r = aR10128
            aR10128 = null
        } else {
            val class2 = method2491((-51).toByte(), true, 262144, var_ha)
            var_r = if (class2 == null) null else class2.aR118
        }
        if (var_r != null) method1301(var_r, this.aByte6376.toInt(), this.x, this.y, null)
    }

    public override fun method2387(var_ha: ha?, i: Int) {
        if (i < -125) anInt10133++
    }

    override fun method44(i: Int, var_ha: ha?) {
        anInt10121++
        val `object`: Any? = null
        val var_r: r?
        if (aR10128 == null && aBoolean10137) {
            val class2 = method2491((-51).toByte(), true, 262144, var_ha)
            var_r = if (class2 == null) null else class2.aR118
        } else {
            var_r = aR10128
            aR10128 = null
        }
        if (var_r != null) method1130(var_r, this.aByte6376.toInt(), this.x, this.y, null)
        if (i != 836) method2391(null, -123, 0, -64)
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        if (i != 7) method2381(null, -71)
        if (aClass30_10127 == null) aClass30_10127 = (method2967(this.x, method2488(0, 0, var_ha!!), this.y, this.anInt6382, 2))
        anInt10140++
        return aClass30_10127
    }

    private fun method2491(i: Byte, bool: Boolean, i_5_: Int, var_ha: ha?): Class2? {
        if (i.toInt() != -51) aClass262_10125 = null
        anInt10142++
        val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, 0xffff and aShort10129.toInt())
        val var_s: s?
        val var_s_6_: s?
        if (aBoolean10138) {
            var_s = Class332.aSArray4142!![this.aByte6376.toInt()]
            var_s_6_ = Class348_Sub1_Sub1.aSArray8801!![0]
        } else {
            var_s = (Class348_Sub1_Sub1.aSArray8801!![this.aByte6376.toInt()])
            if (this.aByte6376 < 3) var_s_6_ = (Class348_Sub1_Sub1.aSArray8801!![this.aByte6376 - -1])
            else var_s_6_ = null
        }
        return class51.method476(var_ha, var_s_6_, aByte10145.toInt(), i_5_, this.x, bool, var_s, this.anInt6382, this.y, aByte10118.toInt(), 128)
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) aBoolean10138 = false
        anInt10139++
        if (aClass64_10124 != null) return aClass64_10124!!.fa()
        return 0
    }

    init {
        do {
            try {
                aBoolean10130 = class51!!.anInt874 != 0 && !bool
                aByte10145 = i_13_.toByte()
                aShort10129 = class51.anInt941.toShort()
                this.y = i_10_
                aBoolean10138 = bool
                this.x = i_8_
                aByte10118 = i_14_.toByte()
                aBoolean10137 = (var_ha!!.method3682() && class51.aBoolean894 && !aBoolean10138 && Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350) != 0)
                val class2 = method2491((-51).toByte(), aBoolean10137, 2048, var_ha)
                if (class2 == null) break
                aClass64_10124 = class2.aClass64_119
                aR10128 = class2.aR118
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("co.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class51 != null) "{...}" else "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'))
            }
            break
        } while (false)
    }

    override fun method41(i: Int): Int {
        if (i != -32228) aBoolean10130 = true
        anInt10146++
        return aByte10118.toInt()
    }

    override fun method38(i: Int): Boolean {
        anInt10132++
        if (i != -18443) aClass30_10127 = null
        return aBoolean10137
    }

    companion object {
        var anInt10119: Int = 0
        var aDouble10120: Double = 0.0
        var anInt10121: Int = 0
        var anInt10122: Int = 0
        var anInt10123: Int = 0
        @JvmField
        var aClass262_10125: Class262? = Class262()
        var anInt10126: Int = 0
        var anInt10131: Int = 0
        var anInt10132: Int = 0
        var anInt10133: Int = 0
        @JvmField
        var aClass351_10134: Class351? = Class351(62, 3)
        var anInt10135: Int = 0
        var anInt10136: Int = 0
        var anInt10139: Int = 0
        var anInt10140: Int = 0
        var anInt10141: Int = 0
        var anInt10142: Int = 0
        var anInt10143: Int = 0
        var anInt10144: Int = 0
        var anInt10146: Int = 0
        var anInt10147: Int = 0

        fun method2489(i: Byte): Int {
            anInt10135++
            if (Class5_Sub1.aBoolean8335) return 6
            if (Class316.aClass348_Sub42_Sub12_3963 == null) return 0
            if (i >= -11) return -42
            val i_1_ = (Class316.aClass348_Sub42_Sub12_3963!!.anInt9608)
            if (method1796(80, i_1_)) return 1
            if (method1197(-12081, i_1_)) return 2
            if (method1813(8806, i_1_)) return 3
            if (method3549(i_1_, 126.toByte())) return 4
            return 5
        }

        @JvmStatic
        fun method2490(i: Int) {
            aClass351_10134 = null
            if (i != 4) method2490(-26)
            aClass262_10125 = null
        }
    }
}
