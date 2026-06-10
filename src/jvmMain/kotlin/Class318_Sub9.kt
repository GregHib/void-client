/* Class318_Sub9 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class318_Sub9 : Class318() {
    var aClass318_Sub9_6468: Class318_Sub9? = null
    var aClass318_Sub9_6469: Class318_Sub9? = null

    fun method2514(i: Int) {
        anInt6467++
        if (this.aClass318_Sub9_6468 != null) {
            this.aClass318_Sub9_6468!!.aClass318_Sub9_6469 = this.aClass318_Sub9_6469
            this.aClass318_Sub9_6469!!.aClass318_Sub9_6468 = this.aClass318_Sub9_6468
            this.aClass318_Sub9_6469 = null
            this.aClass318_Sub9_6468 = null
            val i_0_ = 123 / ((6 - i) / 37)
        }
    }

    companion object {
        var anInt6467: Int = 0
    }
}
