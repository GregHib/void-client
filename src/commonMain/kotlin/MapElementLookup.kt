/* Class333 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapElementLookup {
    private var aHashtable_4146: Hashtable? = null
    private var anInt4148 = 0
    private var aLinkedListNode_4150: LinkedListNode? = null

    fun method2644(i: Byte): LinkedListNode? {
        anInt4148 = 0
        anInt4145++
        return method2646(117.toByte())
    }

    fun method2646(i: Byte): LinkedListNode? {
        anInt4149++
        val i_4_ = -49 / ((i - 44) / 40)
        if (anInt4148 > 0 && (aHashtable_4146!!.aLinkedListNodeArray4374[-1 + anInt4148] !== aLinkedListNode_4150)) {
            val class348 = aLinkedListNode_4150
            aLinkedListNode_4150 = class348!!.aLinkedListNode_4294
            return class348
        }
        while (aHashtable_4146!!.anInt4377 > anInt4148) {
            val class348 = (aHashtable_4146!!.aLinkedListNodeArray4374[anInt4148++].aLinkedListNode_4294)
            if (aHashtable_4146!!.aLinkedListNodeArray4374[anInt4148 + -1] !== class348) {
                aLinkedListNode_4150 = class348!!.aLinkedListNode_4294
                return class348
            }
        }
        return null
    }

    constructor()

    internal constructor(hashtable: Hashtable) {
        aHashtable_4146 = hashtable
    }

    companion object {
        var anInt4145: Int = 0
        var anInt4149: Int = 0
    }
}