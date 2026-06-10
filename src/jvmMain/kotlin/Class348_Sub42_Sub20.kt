import Class303.method2288
import Class348_Sub17.Companion.method2929
import Class348_Sub23_Sub1.Companion.method2972

/* Class348_Sub42_Sub20 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub20 internal constructor(class342: Class342?, class318_sub10: Class318_Sub10?) : Class348_Sub42() {
    var aClass342_9702: Class342? = null
    var aClass174_9704: Class174? = null
    var anInt9705: Int = 0
    var anInt9706: Int = 0
    var anInt9707: Int = 0
    var anInt9710: Int = 0
    var anInt9712: Int = 0
    fun method3279(i: Int) {
        this.anInt9706 = (this.aClass342_9702!!.anInt4239)
        anInt9708++
        this.anInt9710 = (this.aClass342_9702!!.anInt4240)
        this.anInt9712 = (this.aClass342_9702!!.anInt4238)
        if ((this.aClass342_9702!!.aClass101_4252) != null) this.aClass342_9702!!.aClass101_4252!!.method905((this.aClass174_9704!!.anInt2291), (this.aClass174_9704!!.anInt2290), (this.aClass174_9704!!.anInt2294), Class348_Sub8.anIntArray6666!!)
        this.anInt9705 = Class348_Sub8.anIntArray6666!![0]
        this.anInt9707 = Class348_Sub8.anIntArray6666!![i]
    }

    init {
        try {
            this.aClass342_9702 = class342
            this.aClass174_9704 = this.aClass342_9702!!.method2685((-13).toByte())
            method3279(2)
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("jo.<init>(" + (if (class342 != null) "{...}" else "null") + ',' + (if (class318_sub10 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt9703: Int = 0
        var anInt9708: Int = 0
        var anInt9709: Int = 0
        @JvmField
        var aClass262_9711: Class262? = Class262()
        var anInt9713: Int = 0
        var anIntArray9714: IntArray? = intArrayOf(1, 2, 4, 8)
        var anInt9715: Int = 0

        @JvmStatic
        fun method3280(i: Int) {
            aClass262_9711 = null
            anIntArray9714 = null
            val i_0_ = 112 / ((i - 16) / 57)
        }

        fun method3281(i: Byte, var_ha: ha) {
            if (Class5_Sub1.aBoolean8335) method2288(false, var_ha)
            else Class119_Sub1.method1077(var_ha, (-123).toByte())
            anInt9709++
            if (i < 29) method3280(81)
        }

        fun method3282(i: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            Class348_Sub51.anInt7244 = i_6_
            Class14_Sub4.anInt8633 = i_5_
            Class59_Sub2_Sub1.anInt8668 = i_2_
            Class348_Sub44.anInt7092 = i
            Class281.anInt3650 = i_4_
            Class43.anInt620 = i_1_
            anInt9703++
        }

        fun method3283(i: Int) {
            if (Class348_Sub23_Sub1.aClass297_8992!!.aBoolean3777 && (aa_Sub2.aClass161_5199!!.anInt2143 != -1)) method2972((aa_Sub2.aClass161_5199!!.aString2147), (aa_Sub2.aClass161_5199!!.anInt2143), -54)
            anInt9713++
            val i_7_ = 9 / ((i - 60) / 50)
        }
    }
}
