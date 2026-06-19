import SoundBankPatchStatics.method2929
import HashtableStatics.method3478
import HashtableStatics.method3479
import HashtableStatics.anInt4375
import HashtableStatics.anInt4376
import HashtableStatics.anInt4379
import HashtableStatics.anInt4380
import HashtableStatics.anInt4381
import HashtableStatics.anInt4382
import HashtableStatics.anInt4383
import HashtableStatics.anInt4384
import HashtableStatics.anInt4386
import HashtableStatics.anInt4387

/* Class356 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Hashtable internal constructor(var anInt4377: Int) {
    var aLinkedListNodeArray4374: Array<LinkedListNode>
    private var aLong4385: Long = 0
    private var aLinkedListNode_4389: LinkedListNode? = null
    private var aLinkedListNode_4390: LinkedListNode? = null
    private var anInt4391 = 0

    fun method3474(i: Int): Int {
        if (i != 1) method3479(20)
        anInt4387++
        var i_0_ = 0
        var i_1_ = 0
        while (this.anInt4377 > i_1_) {
            val class348 = this.aLinkedListNodeArray4374[i_1_]
            var class348_2_ = class348.aLinkedListNode_4294
            while (class348 !== class348_2_) {
                i_0_++
                class348_2_ = class348_2_!!.aLinkedListNode_4294
            }
            i_1_++
        }
        return i_0_
    }

    fun method3475(bool: Boolean): Int {
        anInt4376++
        if (bool != true) method3478(false)
        return this.anInt4377
    }

    fun method3476(bool: Boolean): LinkedListNode? {
        anInt4384++
        if (aLinkedListNode_4389 == null) return null
        val class348 = (this.aLinkedListNodeArray4374[((this.anInt4377 - 1).toLong() and aLong4385).toInt()])
        if (bool != true) method3479(4)
        while ( /**/aLinkedListNode_4389 !== class348) {
            if (aLinkedListNode_4389!!.aLong4291 == aLong4385) {
                val class348_3_ = aLinkedListNode_4389
                aLinkedListNode_4389 = aLinkedListNode_4389!!.aLinkedListNode_4294
                return class348_3_
            }
            aLinkedListNode_4389 = aLinkedListNode_4389!!.aLinkedListNode_4294
        }
        aLinkedListNode_4389 = null
        return null
    }

    fun method3477(i: Int, linkedListNodes: Array<LinkedListNode?>): Int {
        if (i != 3) anInt4383 = -76
        anInt4380++
        var i_4_ = 0
        var i_5_ = 0
        while (this.anInt4377 > i_5_) {
            val class348 = this.aLinkedListNodeArray4374[i_5_]
            var class348_6_ = class348.aLinkedListNode_4294
            while (class348 !== class348_6_) {
                linkedListNodes[i_4_++] = class348_6_
                class348_6_ = class348_6_!!.aLinkedListNode_4294
            }
            i_5_++
        }
        return i_4_
    }

    fun method3480(l: Long, i: Int): LinkedListNode? {
        try {
            aLong4385 = l
            anInt4379++
            val class348 = (this.aLinkedListNodeArray4374[(l and (this.anInt4377 + -1).toLong()).toInt()])
            if (i != -6008) method3484(80)
            aLinkedListNode_4389 = class348.aLinkedListNode_4294
            while (aLinkedListNode_4389 !== class348) {
                if (l == aLinkedListNode_4389!!.aLong4291) {
                    val class348_7_ = aLinkedListNode_4389
                    aLinkedListNode_4389 = aLinkedListNode_4389!!.aLinkedListNode_4294
                    return class348_7_
                }
                aLinkedListNode_4389 = aLinkedListNode_4389!!.aLinkedListNode_4294
            }
            aLinkedListNode_4389 = null
            return null
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, "eq.C(" + l + ',' + i + ')')
        }
    }

    fun method3481(i: Int) {
        anInt4375++
        var i_8_ = i
        while (this.anInt4377 > i_8_) {
            val class348 = this.aLinkedListNodeArray4374[i_8_]
            while (true) {
                val class348_9_ = class348.aLinkedListNode_4294
                if (class348_9_ === class348) break
                class348_9_!!.method2715(54.toByte())
            }
            i_8_++
        }
        aLinkedListNode_4389 = null
        aLinkedListNode_4390 = null
    }

    fun method3482(i: Int): LinkedListNode? {
        anInt4381++
        if (anInt4391 > i && (aLinkedListNode_4390 !== this.aLinkedListNodeArray4374[-1 + anInt4391])) {
            val class348 = aLinkedListNode_4390
            aLinkedListNode_4390 = class348!!.aLinkedListNode_4294
            return class348
        }
        while (this.anInt4377 > anInt4391) {
            val class348 = (this.aLinkedListNodeArray4374[anInt4391++].aLinkedListNode_4294)
            if (this.aLinkedListNodeArray4374[-1 + anInt4391] !== class348) {
                aLinkedListNode_4390 = class348!!.aLinkedListNode_4294
                return class348
            }
        }
        return null
    }

    fun method3483(i: Byte, l: Long, linkedListNode: LinkedListNode?) {
        try {
            anInt4382++
            if (i < 18) method3481(71)
            if (linkedListNode!!.aLinkedListNode_4295 != null) linkedListNode.method2715(57.toByte())
            val class348_10_ = (this.aLinkedListNodeArray4374[(l and (-1 + this.anInt4377).toLong()).toInt()])
            linkedListNode.aLinkedListNode_4294 = class348_10_
            linkedListNode.aLinkedListNode_4295 = class348_10_.aLinkedListNode_4295
            linkedListNode.aLinkedListNode_4295!!.aLinkedListNode_4294 = linkedListNode
            linkedListNode.aLinkedListNode_4294!!.aLinkedListNode_4295 = linkedListNode
            linkedListNode.aLong4291 = l
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("eq.K(" + i + ',' + l + ',' + (if (linkedListNode != null) "{...}" else "null") + ')'))
        }
    }

    fun method3484(i: Int): LinkedListNode? {
        anInt4391 = i
        anInt4386++
        return method3482(0)
    }

    init {
        this.aLinkedListNodeArray4374 = Array<LinkedListNode>(anInt4377) {
            val linkedListNode = LinkedListNode()
            linkedListNode.aLinkedListNode_4294 = linkedListNode
            linkedListNode.aLinkedListNode_4295 = linkedListNode
            linkedListNode
        }
    }
}
