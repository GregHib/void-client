/* Class348_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class Class348_Sub19_Sub1 : Class348_Sub19 {
    @JvmField
    var aByteArray8984: ByteArray?
    var anInt8985: Int
    var anInt8986: Int
    var aBoolean8987: Boolean = false
    var anInt8988: Int

    fun method2944(class163: Class163): Class348_Sub19_Sub1 {
        this.aByteArray8984 = class163.method1272(this.aByteArray8984!!, 1)
        this.anInt8988 = class163.method1270(this.anInt8988, (-85).toByte())
        if (this.anInt8986 == this.anInt8985) {
            this.anInt8985 = class163.method1275(-114, this.anInt8986)
            this.anInt8986 = this.anInt8985
        } else {
            this.anInt8986 = class163.method1275(-83, this.anInt8986)
            this.anInt8985 = class163.method1275(-80, this.anInt8985)
            if (this.anInt8986 == this.anInt8985) this.anInt8986--
        }
        return this
    }

    internal constructor(i: Int, `is`: ByteArray?, i_0_: Int, i_1_: Int) {
        this.anInt8988 = i
        this.aByteArray8984 = `is`
        this.anInt8986 = i_0_
        this.anInt8985 = i_1_
    }

    internal constructor(i: Int, `is`: ByteArray?, i_2_: Int, i_3_: Int, bool: Boolean) {
        this.anInt8988 = i
        this.aByteArray8984 = `is`
        this.anInt8986 = i_2_
        this.anInt8985 = i_3_
        this.aBoolean8987 = bool
    }
}
