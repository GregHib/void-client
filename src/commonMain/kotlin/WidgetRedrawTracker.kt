/* Class312 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WidgetRedrawTracker {
    private var aLinkedListNode_3922: LinkedListNode? = null
    private var aNodeDeque_3923: NodeDeque? = null
    fun method2327(i: Byte): LinkedListNode? {
        anInt3929++
        val class348 = (aNodeDeque_3923!!.aLinkedListNode_3334.aLinkedListNode_4294)
        if (i.toInt() != -53) method2329(-21)
        if (aNodeDeque_3923!!.aLinkedListNode_3334 === class348) {
            aLinkedListNode_3922 = null
            return null
        }
        aLinkedListNode_3922 = class348!!.aLinkedListNode_4294
        return class348
    }

    fun method2328(nodeDeque: NodeDeque, i: Int) {
        anInt3927++
        if (i <= 73) method2327((-67).toByte())
        aNodeDeque_3923 = nodeDeque
    }

    fun method2329(i: Int): LinkedListNode? {
        anInt3928++
//        if (i != 10) method2330((-25).toByte())
        val class348 = aLinkedListNode_3922
        if (aNodeDeque_3923!!.aLinkedListNode_3334 === class348) {
            aLinkedListNode_3922 = null
            return null
        }
        aLinkedListNode_3922 = class348!!.aLinkedListNode_4294
        return class348
    }

    constructor()

    internal constructor(nodeDeque: NodeDeque) {
        aNodeDeque_3923 = nodeDeque
    }

    companion object {

        var anInt3927: Int = 0
        var anInt3928: Int = 0
        var anInt3929: Int = 0
    }
}