import Class373.Companion.method3591

/* Class129 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class129 internal constructor(private val anInt1886: Int, var anInt1881: Int, var anInt1877: Int, var anInt1892: Int, @JvmField var aByte1875: Byte) {
    @JvmField
    var anInt1874: Int = 0
    @JvmField
    var anInt1876: Int = 0
    @JvmField
    var anInt1880: Int = 0
    @JvmField
    var anInt1882: Int = 0
    @JvmField
    var anInt1883: Int = 0
    @JvmField
    var anInt1884: Int = 0
    @JvmField
    var aClass129_1888: Class129? = null
    @JvmField
    var anInt1889: Int = 0
    @JvmField
    var anInt1890: Int = 0
    @JvmField
    var anInt1891: Int = 0
    fun method1124(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): Class129? {
        anInt1893++
        if (i_0_ != -1) return null
        return Class129(anInt1886, i_2_, i, i_1_, this.aByte1875)
    }

    fun method1125(i: Byte): Class181 {
        anInt1873++
        if (i.toInt() != 59) this.anInt1880 = -51
        return method3591(anInt1886, i.toInt() xor 0x3b)
    }

    companion object {
        @JvmField
        var anInt1873: Int = 0
        @JvmField
        var aClass45_1878: Class45? = null
        @JvmField
        var anInt1879: Int = 0
        @JvmField
        var anIntArray1885: IntArray? = IntArray(32)
        var aByteArrayArray1887: Array<ByteArray?>? = null
        @JvmField
        var anInt1893: Int = 0

        @JvmStatic
        fun method1126(i: Int) {
            if (i == 32) {
                aClass45_1878 = null
                aByteArrayArray1887 = null
                anIntArray1885 = null
            }
        }

        init {
            var i = 2
            for (i_7_ in 0..31) {
                anIntArray1885!![i_7_] = -1 + i
                i += i
            }
        }
    }
}
