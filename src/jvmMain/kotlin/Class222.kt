/* Class222 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class222 {
    var anInt2883: Int = 0
    var aClass166_2886: Class166? = null
    var anInt2890: Int = 0
    private var anInt2891 = 0
    private fun method1608(i: Int, class348_sub49: Class348_Sub49, i_0_: Byte) {
        anInt2887++
        if (i == 1) anInt2891 = class348_sub49.readUnsignedShort(842397944)
        else if (i == 2) {
            this.anInt2883 = class348_sub49.readUnsignedByte(255)
            this.anInt2890 = class348_sub49.readUnsignedByte(255)
        }
    }

    @Synchronized
    fun method1610(i: Byte): Class207? {
        anInt2888++
        var class207 = this.aClass166_2886!!.aClass60_2190!!.method583(anInt2891.toLong(), -70) as? Class207?
        if (class207 != null) return class207
        class207 = Class207.method1521(this.aClass166_2886!!.aClass45_2180!!, anInt2891, 0)
        if (i < 49) method1609(93.toByte())
        if (class207 != null) this.aClass166_2886!!.aClass60_2190!!.method582(class207, anInt2891.toLong(), (-120).toByte())
        return class207
    }

    fun method1611(class348_sub49: Class348_Sub49, bool: Boolean) {
        while (true) {
            val i = class348_sub49.readUnsignedByte(255)
            if (i == 0) break
            method1608(i, class348_sub49, 4.toByte())
        }
        anInt2889++
        if (bool != false) method1610((-86).toByte())
    }

    companion object {
        @JvmField
        var anInt2884: Int = 0
        @JvmField
        var aClass138_2885: Class138? = Class138(4, 1, 1, 1)
        var anInt2887: Int = 0
        var anInt2888: Int = 0
        var anInt2889: Int = 0
        var aClass351_2892: Class351? = Class351(39, 8)

        @JvmStatic
        fun method1609(i: Byte) {
            if (i <= -71) {
                aClass351_2892 = null
                aClass138_2885 = null
            }
        }
    }
}
