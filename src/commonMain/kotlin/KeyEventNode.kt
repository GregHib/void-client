/* Class348_Sub11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class KeyEventNode : LinkedListNode(), CharStreamReader {
    var aChar4761: Char = 0.toChar()
    var aLong4764: Long = 0
    var anInt4766: Int = 0
    var anInt4767: Int = 0
    var anInt4771: Int = 0

    override fun method27(i: Int): Int {
        if (i != 26276) method27(113)
        anInt4769++
        return this.anInt4771
    }

    override fun method28(i: Byte): Char {
        anInt4768++
        if (i < 8) method27(113)
        return this.aChar4761
    }

    override fun method26(i: Int): Int {
        anInt4762++
        if (i != -7616) method29(38.toByte())
        return this.anInt4766
    }

    override fun method29(i: Byte): Long {
        val i_0_ = 17 / ((i - 46) / 58)
        anInt4765++
        return this.aLong4764
    }

    override fun method30(bool: Boolean): Int {
        anInt4760++
        if (bool != false) return -114
        return this.anInt4767
    }

    companion object {
        var anInt4760: Int = 0
        var anInt4762: Int = 0
        var anInt4765: Int = 0
        var anInt4768: Int = 0
        var anInt4769: Int = 0
    }
}