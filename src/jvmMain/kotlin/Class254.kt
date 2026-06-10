import Class50_Sub1.Companion.method462

/* Class254 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class254 {
    var anInt3256: Int = 0
    var aString3258: String? = null
    private var aChar3259 = 0.toChar()
    var aBoolean3261: Boolean = true
    fun method1924(class348_sub49: Class348_Sub49, i: Byte) {
        val i_0_ = -47 % ((i - -74) / 49)
        while (true) {
            val i_1_ = class348_sub49.readUnsignedByte(255)
            if (i_1_ == 0) break
            method1927(true, class348_sub49, i_1_)
        }
        anInt3263++
    }

    fun method1925(bool: Boolean): Boolean {
        anInt3262++
        if (bool != false) return true
        return aChar3259.code == 115
    }

    private fun method1927(bool: Boolean, class348_sub49: Class348_Sub49, i: Int) {
        anInt3257++
        if (i != 1) {
            if (i == 2) this.anInt3256 = class348_sub49.readInt((-126).toByte())
            else if (i == 4) this.aBoolean3261 = false
            else if (i == 5) this.aString3258 = class348_sub49.readString(91.toByte())
        } else aChar3259 = method462(class348_sub49.readByte(-115), -128)
        if (bool != true) this.aBoolean3261 = true
    }

    companion object {
        var anInt3257: Int = 0
        var anInt3260: Int = 0
        var anInt3262: Int = 0
        var anInt3263: Int = 0
        var aClass114_3264: Class114? = Class114(6, 2)

        @JvmStatic
        fun method1926(i: Int) {
            if (i >= -125) aClass114_3264 = null
            aClass114_3264 = null
        }

        @JvmStatic
        fun method1928(i: Int, i_2_: Int, i_3_: Int): Int {
            anInt3260++
            val i_4_ = i_3_ ushr 31
            if (i_2_ > 0) method1928(82, -44, -111)
            return (i_3_ - -i_4_) / i + -i_4_
        }
    }
}
