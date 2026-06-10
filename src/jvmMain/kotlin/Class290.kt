import Class226.Companion.method1626

/* Class290 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class290 internal constructor(var aBoolean3709: Boolean) {
    var anInterface5_Impl1_3708: Interface5_Impl1? = null
    var anInterface5_Impl1_3711: Interface5_Impl1? = null
    var aBoolean3714: Boolean = false
    fun method2195(bool: Boolean) {
        if (this.anInterface5_Impl1_3708 != null) this.anInterface5_Impl1_3708!!.method21(23315)
        anInt3715++
        this.aBoolean3714 = bool
    }

    fun method2197(i: Byte): Boolean {
        if (i >= -4) method2195(true)
        anInt3718++
        return this.aBoolean3714 && !this.aBoolean3709
    }

    companion object {
        var aBoolean3706: Boolean = false
        @JvmField
        var anInt3707: Int = 0
        var aFloat3710: Float = 0f
        @JvmField
        var anInt3712: Int = 0
        var anInt3713: Int = 0
        var anInt3715: Int = 0
        var anInt3716: Int = 0
        @JvmField
        var anInt3717: Int = 1338
        var anInt3718: Int = 0

        @JvmStatic
        fun method2196(i: Byte) {
            Class239_Sub19.anInt6043 = (Class367_Sub4.anInt7319.toDouble() * 34.46).toInt()
            Class348_Sub33.anInt6964 = 200
            anInt3716++
            if (i.toInt() == -9) {
                Class239_Sub19.anInt6043 = Class239_Sub19.anInt6043 shl 2
                if (Class348_Sub8.aHa6654!!.method3670()) Class239_Sub19.anInt6043 += 512
                method1626(1, false)
            }
        }
    }
}
