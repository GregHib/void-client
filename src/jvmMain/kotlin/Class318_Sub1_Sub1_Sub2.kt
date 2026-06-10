import Class130.Companion.method1130
import Class169.Companion.method1301
import Class348_Sub23_Sub1.Companion.method2967
import OutputStream_Sub2.Companion.method136

/* Class318_Sub1_Sub1_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub1_Sub1_Sub2 internal constructor(var_ha: ha?, class51: Class51, i: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, bool: Boolean, i_24_: Int, bool_25_: Boolean) : Class318_Sub1_Sub1(i_21_, i_22_, i_23_, i, i_20_, class51.anInt930), Interface10 {
    private val aBoolean9974: Boolean
    private var aR9976: r? = null
    private val aByte9980: Byte
    private var aBoolean9983 = false
    private val aBoolean9988: Boolean
    private var aBoolean9989 = false
    private var aShort9991: Short = 0
    private var aClass64_9993: Class64? = null
    private var aClass30_9999: Class30? = null
    public override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_0_: Int, i_1_: Byte, i_2_: Int) {
        do {
            try {
                anInt9970++
                if (i_1_ > -106) method2402(-5, 56.toByte())
                if (class318_sub1 !is Class318_Sub1_Sub1_Sub2) break
                val class318_sub1_sub1_sub2_3_ = class318_sub1
                if (aClass64_9993 == null || class318_sub1_sub1_sub2_3_.aClass64_9993 == null) break
                aClass64_9993!!.method613((class318_sub1_sub1_sub2_3_.aClass64_9993), i_2_, i, i_0_, bool)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("uo.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'))
            }
            break
        } while (false)
    }

    public override fun method2379(i: Int): Int {
        anInt10000++
        if (i != -25675) return -120
        if (aClass64_9993 == null) return 0
        return aClass64_9993!!.ma()
    }

    override fun method43(var_ha: ha?, i: Int) {
        anInt9995++
        val `object`: Any? = null
        val var_r: r?
        if (aR9976 == null && aBoolean9988) {
            val class2 = method2401(var_ha, 262144, true, 22)
            var_r = if (class2 == null) null else class2.aR118
        } else {
            var_r = aR9976
            aR9976 = null
        }
        if (var_r != null) method1301(var_r, this.aByte6376.toInt(), this.x, this.y, null)
    }

    private fun method2401(var_ha: ha?, i: Int, bool: Boolean, i_4_: Int): Class2? {
        anInt9985++
        val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, aShort9991.toInt() and 0xffff)
        val var_s: s?
        val var_s_5_: s?
        if (aBoolean9983) {
            var_s = Class332.aSArray4142!![this.aByte6376.toInt()]
            var_s_5_ = Class348_Sub1_Sub1.aSArray8801!![0]
        } else {
            var_s = (Class348_Sub1_Sub1.aSArray8801!![this.aByte6376.toInt()])
            if (this.aByte6376 < 3) var_s_5_ = (Class348_Sub1_Sub1.aSArray8801!![1 + this.aByte6376])
            else var_s_5_ = null
        }
        return class51.method476(var_ha, var_s_5_, 22, i, this.x, bool, var_s, this.anInt6382, this.y, aByte9980.toInt(), 128)
    }

    public override fun method2392(bool: Boolean) {
        anInt9972++
        if (bool == true) {
            aBoolean9989 = false
            if (aClass64_9993 != null) aClass64_9993!!.s(0x10000.inv() and aClass64_9993!!.ua())
        }
    }

    override fun method42(i: Int): Int {
        anInt9969++
        if (i >= -62) return -1
        return aShort9991.toInt() and 0xffff
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt9990++
        if (aClass64_9993 == null) return null
        val class101 = var_ha!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        val class318_sub4 = method136(i, aBoolean9974, false)
        if (Class305.aBoolean3870) aClass64_9993!!.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), Class132.anInt1906, 0)
        else aClass64_9993!!.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        return class318_sub4
    }

    override fun method38(i: Int): Boolean {
        if (i != -18443) aClass30_9999 = null
        anInt10002++
        return aBoolean9988
    }

    public override fun method2388(i: Int): Boolean {
        if (i > -65) return true
        anInt9978++
        return aBoolean9989
    }

    public override fun method2376(i: Int): Boolean {
        if (i >= -12) method2392(true)
        anInt9975++
        if (aClass64_9993 != null) {
            return !aClass64_9993!!.r()
        }
        return true
    }

    public override fun method2394(bool: Boolean): Int {
        anInt9979++
        if (bool != true) method38(-4)
        if (aClass64_9993 != null) return aClass64_9993!!.fa()
        return 0
    }

    override fun method41(i: Int): Int {
        anInt10001++
        if (i != -32228) method2394(false)
        return aByte9980.toInt()
    }

    override fun method40(i: Int) {
        if (i == -12031) {
            anInt9982++
            if (aClass64_9993 != null) aClass64_9993!!.method612()
        }
    }

    public override fun method2377(i: Byte): Boolean {
        if (i.toInt() != 122) method40(3)
        anInt9973++
        if (aClass64_9993 == null) return false
        return aClass64_9993!!.F()
    }

    override fun method44(i: Int, var_ha: ha?) {
        anInt9986++
        val `object`: Any? = null
        val var_r: r?
        if (aR9976 != null || !aBoolean9988) {
            var_r = aR9976
            aR9976 = null
        } else {
            val class2 = method2401(var_ha, 262144, true, 22)
            var_r = if (class2 == null) null else class2.aR118
        }
        if (var_r != null) method1130(var_r, this.aByte6376.toInt(), this.x, this.y, null)
        if (i != 836) aShort9991 = 86.toShort()
    }

    public override fun method2391(var_ha: ha?, i: Int, i_16_: Int, i_17_: Int): Boolean {
        if (i_17_ != 0) anInt9997 = -51
        anInt9996++
        val class64 = method2404(var_ha!!, 69, 131072)
        if (class64 != null) {
            val class101 = var_ha!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            if (Class305.aBoolean3870) return class64.method623(i_16_, i, class101, false, 0, Class132.anInt1906)
            return class64.method628(i_16_, i, class101, false, 0)
        }
        return false
    }

    private fun method2404(var_ha: ha, i: Int, i_18_: Int): Class64? {
        anInt9984++
        val i_19_ = 65 / ((-34 - i) / 53)
        if (aClass64_9993 != null && var_ha.method3667(aClass64_9993!!.ua(), i_18_) == 0) return aClass64_9993
        val class2 = method2401(var_ha, i_18_, false, 22)
        if (class2 != null) return class2.aClass64_119
        return null
    }

    init {
        do {
            try {
                aBoolean9983 = bool
                aBoolean9974 = (class51.anInt874 != 0 && !bool)
                this.y = i_23_
                aBoolean9989 = bool_25_
                this.x = i_21_
                aByte9980 = i_24_.toByte()
                aShort9991 = class51.anInt941.toShort()
                aBoolean9988 = (var_ha!!.method3682() && class51.aBoolean894 && !aBoolean9983 && Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350) != 0)
                var i_26_ = 2048
                if (aBoolean9989) i_26_ = i_26_ or 0x10000
                val class2 = method2401(var_ha, i_26_, aBoolean9988, 22)
                if (class2 == null) break
                aClass64_9993 = class2.aClass64_119
                aR9976 = class2.aR118
                if (!aBoolean9989) break
                aClass64_9993 = aClass64_9993!!.method614(0.toByte(), i_26_, false)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("uo.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class51 != null) "{...}" else "null") + ',' + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + bool + ',' + i_24_ + ',' + bool_25_ + ')'))
            }
            break
        } while (false)
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        if (aClass30_9999 == null) aClass30_9999 = (method2967(this.x, method2404(var_ha!!, 86, 0), this.y, this.anInt6382, i xor 0x5))
        if (i != 7) return null
        anInt9998++
        return aClass30_9999
    }

    public override fun method2387(var_ha: ha?, i: Int) {
        if (i >= -125) aBoolean9983 = false
        anInt9987++
    }

    override fun method39(i: Int): Int {
        val i_27_ = -125 % ((i - -91) / 35)
        anInt9992++
        return 22
    }

    companion object {
        var anInt9969: Int = 0
        var anInt9970: Int = 0
        var anInt9971: Int = 0
        var anInt9972: Int = 0
        var anInt9973: Int = 0
        var anInt9975: Int = 0
        var anInt9977: Int = 0
        var anInt9978: Int = 0
        var anInt9979: Int = 0
        @JvmField
        var anIntArray9981: IntArray? = IntArray(5)
        var anInt9982: Int = 0
        var anInt9984: Int = 0
        var anInt9985: Int = 0
        var anInt9986: Int = 0
        var anInt9987: Int = 0
        var anInt9990: Int = 0
        var anInt9992: Int = 0
        var anInt9994: Int = 0
        var anInt9995: Int = 0
        var anInt9996: Int = 0
        @JvmField
        var anInt9997: Int = 1
        var anInt9998: Int = 0
        var anInt10000: Int = 0
        var anInt10001: Int = 0
        var anInt10002: Int = 0

        @JvmStatic
        fun method2400(i: Byte) {
            if (i.toInt() != 3) anIntArray9981 = null
            anIntArray9981 = null
        }

        @JvmStatic
        fun method2402(i: Int, i_6_: Byte): Boolean {
            anInt9994++
            if (i_6_ >= -52) return true
            return i == 4 || i == 8 || i == 11
        }

        fun method2403(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int) {
            anInt9977++
            if (i_10_ != 19206) method2402(-3, 46.toByte())
            val class302s = Class348_Sub27.aClass302Array6897!!
            for (i_13_ in class302s.indices) {
                val class302 = class302s[i_13_]
                if (class302 != null && class302.anInt3840 == 2) {
                    Class318_Sub5.Companion.method2505(i_9_ shr 1, 2 * class302.anInt3839, 0, i_12_, i_11_ shr 1, class302.anInt3838, class302.anInt3832, i_7_, class302.anInt3835)
                    if (Class239_Sub21.anIntArray6062!![0] > -1 && Class367_Sub11.anInt7396 % 20 < 10) {
                        val class105 = (Class239_Sub9.aClass105Array5933!![class302.anInt3831])
                        val i_14_ = -12 + (i - -Class239_Sub21.anIntArray6062!![0])
                        val i_15_ = i_8_ - -Class239_Sub21.anIntArray6062!![1] - 28
                        class105!!.method974(i_14_, i_15_)
                        Class338.method2663(-5590, i_14_, i_14_ - -class105.method966(), i_15_, class105.method980() + i_15_)
                    }
                }
            }
        }
    }
}
