import Class220.method1606
import Class255.Companion.method1935
import Class348_Sub23_Sub1.Companion.method2967
import OutputStream_Sub2.Companion.method136

/* Class318_Sub1_Sub3_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub1_Sub3_Sub2 internal constructor(var_ha: ha?, class51: Class51, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, bool: Boolean, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int) : Class318_Sub1_Sub3(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, class51.anInt895 == 1, method1606(i_9_, -27939, i_8_)), Interface10 {
    var aClass235_10045: Class235? = null
    private var aClass30_10051: Class30? = null
    private var aBoolean10055 = false
    private val aBoolean10056: Boolean
    public override fun method2376(i: Int): Boolean {
        anInt10041++
        if (i > -12) return false
        return false
    }

    init {
        try {
            this.aClass235_10045 = Class235(var_ha, class51, i_8_, i_9_, this.plane.toInt(), i_0_, this, bool, i_10_)
            aBoolean10056 = class51.anInt874 != 0 && !bool
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fea.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class51 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'))
        }
    }

    public override fun method2379(i: Int): Int {
        if (i != -25675) return -125
        anInt10061++
        return this.aClass235_10045!!.method1664(i xor 0x6462)
    }

    public override fun method2388(i: Int): Boolean {
        anInt10050++
        if (i > -65) return false
        return false
    }

    override fun method40(i: Int) {
        anInt10048++
        if (i != -12031) this.aClass235_10045 = null
    }

    public override fun method2391(var_ha: ha?, i: Int, i_11_: Int, i_12_: Int): Boolean {
        anInt10040++
        val class64 = this.aClass235_10045!!.method1668(false, false, i_12_ + -127, 131072, var_ha)
        if (class64 == null) return false
        if (i_12_ != 0) return false
        val class101 = var_ha!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        if (!Class305.aBoolean3870) return class64.method628(i_11_, i, class101, false, 0)
        return class64.method623(i_11_, i, class101, false, 0, Class132.anInt1906)
    }

    override fun method41(i: Int): Int {
        if (i != -32228) aClass30_10051 = null
        anInt10044++
        return (this.aClass235_10045!!.anInt3052)
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        anInt10053++
        if (i != 7) return null
        return aClass30_10051
    }

    public override fun method2377(i: Byte): Boolean {
        anInt10052++
        if (i.toInt() != 122) method41(-49)
        return aBoolean10055
    }

    override fun method43(var_ha: ha?, i: Int) {
        anInt10049++
        if (i != -14218) aClass30_10051 = null
        this.aClass235_10045!!.method1674(-1, var_ha)
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt10057++
        val class64 = this.aClass235_10045!!.method1668(false, true, -127, 2048, var_ha)
        if (class64 == null) return null
        val class101 = var_ha!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        val class318_sub4 = method136(i, aBoolean10056, false)
        this.aClass235_10045!!.method1670(this.aShort8751.toInt(), class101, this.aShort8747.toInt(), var_ha, this.aShort8743.toInt(), class64, true, (-73).toByte(), this.aShort8750.toInt())
        if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), Class132.anInt1906, 0)
        if ((this.aClass235_10045!!.aClass318_Sub10_3081) != null) {
            val class98 = this.aClass235_10045!!.aClass318_Sub10_3081!!.method2525()
            if (Class305.aBoolean3870) var_ha.method3685(class98, Class132.anInt1906)
            else var_ha.method3684(class98)
        }
        aBoolean10055 = class64.F() || (this.aClass235_10045!!.aClass318_Sub10_3081) != null
        if (aClass30_10051 != null) method1935(this.y, this.anInt6382, aClass30_10051, class64, false, this.x)
        else aClass30_10051 = (method2967(this.x, class64, this.y, this.anInt6382, 2))
        return class318_sub4
    }

    override fun method39(i: Int): Int {
        anInt10058++
        val i_13_ = -40 / ((i - -91) / 35)
        return (this.aClass235_10045!!.anInt3079)
    }

    public override fun method2392(bool: Boolean) {
        if (bool == true) {
            anInt10060++
            throw IllegalStateException()
        }
    }

    override fun method42(i: Int): Int {
        anInt10042++
        if (i >= -62) method2377(97.toByte())
        return (this.aClass235_10045!!.anInt3063)
    }

    override fun method44(i: Int, var_ha: ha?) {
        if (i != 836) method44(-65, null)
        anInt10059++
        this.aClass235_10045!!.method1667(116.toByte(), var_ha)
    }

    public override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_14_: Int, i_15_: Byte, i_16_: Int) {
        try {
            anInt10054++
            if (i_15_ >= -106) method44(97, null)
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fea.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'))
        }
    }

    override fun method38(i: Int): Boolean {
        if (i != -18443) return true
        anInt10043++
        return this.aClass235_10045!!.method1665(2)
    }

    public override fun method2387(var_ha: ha?, i: Int) {
        anInt10039++
        val class64 = this.aClass235_10045!!.method1668(true, true, -127, 262144, var_ha)
        if (class64 != null) {
            val class101 = var_ha!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            this.aClass235_10045!!.method1670(this.aShort8751.toInt(), class101, this.aShort8747.toInt(), var_ha, this.aShort8743.toInt(), class64, false, (-73).toByte(), this.aShort8750.toInt())
        }
        if (i >= -125) method2380(null, -30, false, null, 74, (-52).toByte(), 38)
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) return 68
        anInt10038++
        return this.aClass235_10045!!.method1663(80)
    }

    companion object {
        var anInt10038: Int = 0
        var anInt10039: Int = 0
        var anInt10040: Int = 0
        var anInt10041: Int = 0
        var anInt10042: Int = 0
        var anInt10043: Int = 0
        var anInt10044: Int = 0
        var aBoolean10046: Boolean = false
        var anInt10047: Int = 0
        var anInt10048: Int = 0
        var anInt10049: Int = 0
        var anInt10050: Int = 0
        var anInt10052: Int = 0
        var anInt10053: Int = 0
        var anInt10054: Int = 0
        var anInt10057: Int = 0
        var anInt10058: Int = 0
        var anInt10059: Int = 0
        var anInt10060: Int = 0
        var anInt10061: Int = 0
    }
}
