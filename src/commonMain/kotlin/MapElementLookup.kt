/* Class333 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapElementLookup {
    private var aHashtable_4146: Hashtable? = null
    private var anInt4148 = 0
    private var aLinkedListNode_4150: LinkedListNode? = null

    fun method2644(i: Byte): LinkedListNode? {
        anInt4148 = 0
        if (i.toInt() != 123) method2643(-115, 5, -49, 81, 25)
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

        var anInt4144: Int = -1
        var anInt4145: Int = 0
        var aJs5Archive_4147: Js5Archive? = null
        var anInt4149: Int = 0
        fun method2643(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            if (LoadingBarRenderer.anIntArrayArray4253 != null) LoadingBarRenderer.anIntArrayArray4253!![i]!![i_0_] = 0xffffff.inv() or i_1_
            if (BooleanGraphicsOptionState.aShortArrayArray5847 != null) BooleanGraphicsOptionState.aShortArrayArray5847!![i]!![i_0_] = i_2_.toShort()
            if (HashTileShape.aByteArrayArray8816 != null) HashTileShape.aByteArrayArray8816!![i]!![i_0_] = i_3_.toByte()
        }

        @JvmStatic
        fun method2645(i: Int) {
            if (i != -16777216) method2643(-59, 61, -83, 34, -32)
            aJs5Archive_4147 = null
        }
    }
}
