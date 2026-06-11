/* Class348 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class348 {
    var aLong4291: Long = 0
    var aClass348_4294: Class348? = null
    var aClass348_4295: Class348? = null
    fun method2712(i: Byte): Boolean {
        if (i.toInt() != 4) return true
        anInt4297++
        return this.aClass348_4295 != null
    }

    fun method2715(i: Byte) {
        anInt4285++
        if (this.aClass348_4295 != null) {
            this.aClass348_4295!!.aClass348_4294 = this.aClass348_4294
            this.aClass348_4294!!.aClass348_4295 = this.aClass348_4295
            if (i < 18) method2712(46.toByte())
            this.aClass348_4294 = null
            this.aClass348_4295 = null
        }
    }

    companion object {
        var anInt4285: Int = 0
        var anInt4297: Int = 0
    }
}
