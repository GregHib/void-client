import Class255.Companion.method1935
import Class348_Sub23_Sub1.Companion.method2967
import Class95.method868
import OutputStream_Sub2.Companion.method136

/* Class318_Sub1_Sub4_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub1_Sub4_Sub2 internal constructor(var_ha: ha?, class51: Class51?, i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, bool: Boolean, i_9_: Int, i_10_: Int, i_11_: Int) : Class318_Sub1_Sub4(i_6_, i_7_, i_8_, i, i_5_, method868(i_9_, i_10_, false)), Interface10 {
    private var aBoolean10095 = false
    private var aBoolean10114 = false
    var aClass235_10115: Class235? = null
    private var aClass30_10116: Class30? = null
    override fun method39(i: Int): Int {
        anInt10105++
        val i_0_ = -66 / ((-91 - i) / 35)
        return (this.aClass235_10115!!.anInt3079)
    }

    override fun method44(i: Int, var_ha: ha?) {
        this.aClass235_10115!!.method1667(116.toByte(), var_ha)
        if (i != 836) method2379(42)
        anInt10099++
    }

    public override fun method2387(var_ha: ha?, i: Int) {
        anInt10113++
        if (i >= -125) method2386(111, null)
        val class64 = this.aClass235_10115!!.method1668(true, true, -128, 262144, var_ha)
        if (class64 != null) {
            val i_1_ = this.x shr 9
            val i_2_ = this.y shr 9
            val class101 = var_ha!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            this.aClass235_10115!!.method1670(i_1_, class101, i_2_, var_ha, i_1_, class64, false, (-73).toByte(), i_2_)
        }
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) method2381(null, -82)
        anInt10107++
        return this.aClass235_10115!!.method1663(109)
    }

    public override fun method2391(var_ha: ha?, i: Int, i_3_: Int, i_4_: Int): Boolean {
        anInt10101++
        val class64 = this.aClass235_10115!!.method1668(false, false, -127, 131072, var_ha)
        if (class64 == null) return false
        val class101 = var_ha!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        if (i_4_ != 0) return true
        if (Class305.aBoolean3870) return class64.method623(i_3_, i, class101, false, 0, Class132.anInt1906)
        return class64.method628(i_3_, i, class101, false, 0)
    }

    public override fun method2376(i: Int): Boolean {
        if (i > -12) method2394(true)
        anInt10108++
        return false
    }

    init {
        try {
            this.aClass235_10115 = Class235(var_ha, class51, i_9_, i_10_, this.plane.toInt(), i_5_, this, bool, i_11_)
            aBoolean10114 = class51!!.anInt874 != 0 && !bool
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ju.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class51 != null) "{...}" else "null") + ',' + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'))
        }
    }

    public override fun method2379(i: Int): Int {
        anInt10097++
        if (i != -25675) aBoolean10114 = false
        return this.aClass235_10115!!.method1664(-71)
    }

    override fun method38(i: Int): Boolean {
        anInt10117++
        if (i != -18443) aBoolean10095 = true
        return this.aClass235_10115!!.method1665(2)
    }

    override fun method42(i: Int): Int {
        if (i > -62) aClass30_10116 = null
        anInt10098++
        return (this.aClass235_10115!!.anInt3063)
    }

    override fun method43(var_ha: ha?, i: Int) {
        anInt10110++
        this.aClass235_10115!!.method1674(-1, var_ha)
        if (i != -14218) aBoolean10114 = true
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt10111++
        val class64 = this.aClass235_10115!!.method1668(false, true, i xor 0x7f.inv(), 2048, var_ha)
        if (class64 == null) return null
        val class101 = var_ha!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        val class318_sub4 = method136(i, aBoolean10114, false)
        val i_12_ = this.x shr 9
        val i_13_ = this.y shr 9
        this.aClass235_10115!!.method1670(i_12_, class101, i_13_, var_ha, i_12_, class64, true, (-73).toByte(), i_13_)
        if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), Class132.anInt1906, 0)
        if ((this.aClass235_10115!!.aClass318_Sub10_3081) != null) {
            val class98 = this.aClass235_10115!!.aClass318_Sub10_3081!!.method2525()
            if (Class305.aBoolean3870) var_ha.method3685(class98, Class132.anInt1906)
            else var_ha.method3684(class98)
        }
        aBoolean10095 = class64.F() || (this.aClass235_10115!!.aClass318_Sub10_3081) != null
        if (aClass30_10116 != null) method1935(this.y, this.anInt6382, aClass30_10116, class64, false, this.x)
        else aClass30_10116 = (method2967(this.x, class64, this.y, this.anInt6382, 2))
        return class318_sub4
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        anInt10109++
        if (i != 7) return null
        return aClass30_10116
    }

    override fun method41(i: Int): Int {
        anInt10100++
        if (i != -32228) this.aClass235_10115 = null
        return (this.aClass235_10115!!.anInt3052)
    }

    override fun method40(i: Int) {
        if (i != -12031) aBoolean10114 = false
        anInt10102++
    }

    public override fun method2388(i: Int): Boolean {
        if (i >= -65) return true
        anInt10106++
        return false
    }

    public override fun method2392(bool: Boolean) {
        anInt10103++
        if (bool != true) aBoolean10114 = false
        throw IllegalStateException()
    }

    public override fun method2377(i: Byte): Boolean {
        if (i.toInt() != 122) return false
        anInt10104++
        return aBoolean10095
    }

    public override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_14_: Int, i_15_: Byte, i_16_: Int) {
        try {
            anInt10112++
            check(i_15_ >= -106)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ju.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'))
        }
    }

    companion object {
        var anInt10096: Int = 0
        var anInt10097: Int = 0
        var anInt10098: Int = 0
        var anInt10099: Int = 0
        var anInt10100: Int = 0
        var anInt10101: Int = 0
        var anInt10102: Int = 0
        var anInt10103: Int = 0
        var anInt10104: Int = 0
        var anInt10105: Int = 0
        var anInt10106: Int = 0
        var anInt10107: Int = 0
        var anInt10108: Int = 0
        var anInt10109: Int = 0
        var anInt10110: Int = 0
        var anInt10111: Int = 0
        var anInt10112: Int = 0
        var anInt10113: Int = 0
        var anInt10117: Int = 0
    }
}
