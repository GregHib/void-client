/* Class300 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class300 {
    var anInt3817: Int
    var anIntArray3821: IntArray? = null
    var anInt3823: Int = -1
    fun method2275(class348_sub49: Class348_Sub49, i: Byte) {
        anInt3818++
        while (true) {
            val i_1_ = class348_sub49.readUnsignedByte(255)
            if (i_1_ == 0) break
            method2276(0, class348_sub49, i_1_)
        }
        val i_2_ = -63 / ((72 - i) / 37)
    }

    private fun method2276(i: Int, class348_sub49: Class348_Sub49, i_3_: Int) {
        if (i_3_ == 1) this.anInt3817 = class348_sub49.readUnsignedShort(842397944)
        else if (i_3_ == 2) {
            this.anIntArray3821 = IntArray(class348_sub49.readUnsignedByte(255))
            var i_4_ = 0
            while ((i_4_ < this.anIntArray3821!!.size)) {
                this.anIntArray3821!![i_4_] = class348_sub49.readUnsignedShort(842397944)
                i_4_++
            }
        } else if (i_3_ == 3) this.anInt3823 = class348_sub49.readUnsignedByte(255)
        if (i != 0) aBoolean3819 = true
        anInt3822++
    }

    init {
        this.anInt3817 = -1
    }

    companion object {
        var anInt3815: Int = 0
        var anInt3816: Int = 0
        var anInt3818: Int = 0
        @JvmField
        var aBoolean3819: Boolean = false
        @JvmField
        var anInt3820: Int = 0
        var anInt3822: Int = 0
        var anInt3824: Int = 0

        fun method2273(i: Byte): Class348_Sub47? {
            anInt3824++
            if (i.toInt() != -103) return null
            if (Class239_Sub13.anInt5980 == 0) return Class348_Sub47()
            return Class176.aClass348_Sub47Array2334!![--Class239_Sub13.anInt5980]
        }

        fun method2274(string: String?, i: Int): Int {
            anInt3816++
            if (string == null) return -1
            if (i >= -41) return 97
            var i_0_ = 0
            while ((i_0_ < Class348_Sub40_Sub30.anInt9383)) {
                if (string.equals(Class83.aStringArray1441!![i_0_], ignoreCase = true)) return i_0_
                i_0_++
            }
            return -1
        }

        fun method2277(i: Int, class45: Class45, i_5_: Int, i_6_: Int): Class124? {
            if (i_6_ != -1) aBoolean3819 = true
            anInt3815++
            val `is` = class45.method410(-1860, i_5_, i)
            if (`is` == null) return null
            return Class124(`is`)
        }
    }
}
