import Class239_Sub6.Companion.method1745
import Class255.Companion.method1935
import Class286_Sub3.Companion.method2148
import Class348_Sub23_Sub1.Companion.method2967
import OutputStream_Sub2.Companion.method136

/* Class318_Sub1_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub1_Sub1_Sub1 internal constructor(var_ha: ha?, class51: Class51, i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, bool: Boolean, i_11_: Int, i_12_: Int) : Class318_Sub1_Sub1(i_8_, i_9_, i_10_, i, i_7_, class51.anInt930), Interface10 {
    private var aBoolean9945 = false
    private var aClass30_9950: Class30? = null
    var aClass235_9955: Class235? = null
    private var aBoolean9966 = false
    override fun method42(i: Int): Int {
        anInt9943++
        if (i > -62) aClass30_9950 = null
        return (this.aClass235_9955!!.anInt3063)
    }

    public override fun method2387(var_ha: ha?, i: Int) {
        anInt9962++
        val class64 = this.aClass235_9955!!.method1668(true, true, -128, 262144, var_ha)
        if (class64 != null) {
            val i_0_ = this.x shr 9
            val i_1_ = this.y shr 9
            val class101 = var_ha!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            this.aClass235_9955!!.method1670(i_0_, class101, i_1_, var_ha, i_0_, class64, false, (-73).toByte(), i_1_)
        }
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) return -82
        anInt9963++
        return this.aClass235_9955!!.method1663(109)
    }

    override fun method40(i: Int) {
        anInt9954++
    }

    override fun method41(i: Int): Int {
        anInt9957++
        if (i != -32228) return -36
        return (this.aClass235_9955!!.anInt3052)
    }

    public override fun method2386(i: Int, var_ha: ha?): Class318_Sub4? {
        anInt9968++
        val class64 = this.aClass235_9955!!.method1668(false, true, -128, 2048, var_ha)
        if (class64 == null) return null
        val class101 = var_ha!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        val class318_sub4 = method136(i, aBoolean9966, false)
        val i_2_ = this.x shr 9
        val i_3_ = this.y shr 9
        this.aClass235_9955!!.method1670(i_2_, class101, i_3_, var_ha, i_2_, class64, true, (-73).toByte(), i_3_)
        if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), Class132.anInt1906, 0)
        if ((this.aClass235_9955!!.aClass318_Sub10_3081) != null) {
            val class98 = this.aClass235_9955!!.aClass318_Sub10_3081!!.method2525()
            if (Class305.aBoolean3870) var_ha.method3685(class98, Class132.anInt1906)
            else var_ha.method3684(class98)
        }
        aBoolean9945 = (class64.F() || (this.aClass235_9955!!.aClass318_Sub10_3081) != null)
        if (aClass30_9950 != null) method1935(this.y, this.anInt6382, aClass30_9950, class64, false, this.x)
        else aClass30_9950 = (method2967(this.x, class64, this.y, this.anInt6382, 2))
        return class318_sub4
    }

    public override fun method2380(var_ha: ha?, i: Int, bool: Boolean, class318_sub1: Class318_Sub1?, i_4_: Int, i_5_: Byte, i_6_: Int) {
        try {
            anInt9946++
            if (i_5_ > -106) this.aClass235_9955 = null
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("saa.N(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'))
        }
    }

    init {
        try {
            this.aClass235_9955 = Class235(var_ha, class51, 22, i_11_, i, i_7_, this, bool, i_12_)
            aBoolean9966 = class51.anInt874 != 0 && !bool
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("saa.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class51 != null) "{...}" else "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ')'))
        }
    }

    public override fun method2377(i: Byte): Boolean {
        anInt9964++
        if (i.toInt() != 122) this.aClass235_9955 = null
        return aBoolean9945
    }

    public override fun method2379(i: Int): Int {
        if (i != -25675) aClass105Array9959 = null
        anInt9965++
        return this.aClass235_9955!!.method1664(i xor 0x647d)
    }

    public override fun method2392(bool: Boolean) {
        if (bool != true) this.aClass235_9955 = null
        anInt9953++
        throw IllegalStateException()
    }

    public override fun method2391(var_ha: ha?, i: Int, i_13_: Int, i_14_: Int): Boolean {
        anInt9952++
        val class64 = this.aClass235_9955!!.method1668(false, false, -128, 131072, var_ha)
        if (class64 == null) return false
        val class101 = var_ha!!.method3705()
        if (i_14_ != 0) return true
        class101.method894(this.x, this.anInt6382, this.y)
        if (Class305.aBoolean3870) return class64.method623(i_13_, i, class101, false, 0, Class132.anInt1906)
        return class64.method628(i_13_, i, class101, false, 0)
    }

    public override fun method2381(var_ha: ha?, i: Int): Class30? {
        if (i != 7) return null
        anInt9960++
        return aClass30_9950
    }

    public override fun method2388(i: Int): Boolean {
        anInt9944++
        return i >= -65
    }

    override fun method38(i: Int): Boolean {
        anInt9948++
        if (i != -18443) method2381(null, -3)
        return this.aClass235_9955!!.method1665(2)
    }

    override fun method43(var_ha: ha?, i: Int) {
        if (i == -14218) {
            this.aClass235_9955!!.method1674(-1, var_ha)
            anInt9951++
        }
    }

    public override fun method2376(i: Int): Boolean {
        anInt9956++
        if (i >= -12) aClass30_9950 = null
        return false
    }

    override fun method39(i: Int): Int {
        val i_16_ = 7 / ((-91 - i) / 35)
        anInt9947++
        return (this.aClass235_9955!!.anInt3079)
    }

    override fun method44(i: Int, var_ha: ha?) {
        if (i != 836) aBoolean9966 = true
        this.aClass235_9955!!.method1667(116.toByte(), var_ha)
        anInt9961++
    }

    companion object {
        var anInt9943: Int = 0
        var anInt9944: Int = 0
        var anInt9946: Int = 0
        var anInt9947: Int = 0
        var anInt9948: Int = 0
        var anIntArray9949: IntArray? = IntArray(1)
        var anInt9951: Int = 0
        var anInt9952: Int = 0
        var anInt9953: Int = 0
        var anInt9954: Int = 0
        var anInt9956: Int = 0
        var anInt9957: Int = 0
        var anInt9958: Int = 0
        var aClass105Array9959: Array<Class105?>? = null
        var anInt9960: Int = 0
        var anInt9961: Int = 0
        var anInt9962: Int = 0
        var anInt9963: Int = 0
        var anInt9964: Int = 0
        var anInt9965: Int = 0
        var anInt9967: Int = 0
        var anInt9968: Int = 0

        fun method2397(i: Byte): Boolean {
            Class135_Sub1.anInt4718++
            Class239_Sub29.aBoolean6147 = true
            if (i > -123) anIntArray9949 = null
            anInt9967++
            return true
        }

        @JvmStatic
        fun method2398(i: Byte) {
            if (i.toInt() != -83) anIntArray9949 = null
            aClass105Array9959 = null
            anIntArray9949 = null
        }

        fun method2399(string: String, i: Int) {
            val i_15_ = 87 / ((i - -7) / 56)
            anInt9958++
            if (string != "") {
                Class88.anInt1498++
                val class348_sub47 = method2148(aClass351_8724, Class348_Sub23_Sub2.aClass77_9029, -124)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                Class348_Sub42_Sub14.method3243(121, class348_sub47)
            }
        }
    }
}
