/* Class348 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class LinkedListNode {
    var aLong4291: Long = 0
    var aLinkedListNode_4294: LinkedListNode? = null
    var aLinkedListNode_4295: LinkedListNode? = null
    fun method2712(i: Byte): Boolean {
        if (i.toInt() != 4) return true
        anInt4297++
        return this.aLinkedListNode_4295 != null
    }

    fun method2715(i: Byte) {
        anInt4285++
        if (this.aLinkedListNode_4295 != null) {
            this.aLinkedListNode_4295!!.aLinkedListNode_4294 = this.aLinkedListNode_4294
            this.aLinkedListNode_4294!!.aLinkedListNode_4295 = this.aLinkedListNode_4295
            if (i < 18) method2712(46.toByte())
            this.aLinkedListNode_4294 = null
            this.aLinkedListNode_4295 = null
        }
    }

    companion object {
        var anInt4285: Int = 0
        var anInt4297: Int = 0
    }
}
