/*
 * Class262
 */
class NodeDeque {
    var aLinkedListNode_3334: LinkedListNode = LinkedListNode()
    private var aLinkedListNode_3342: LinkedListNode? = null

    fun method1988(nodeDeque_0_: NodeDeque?, i: Byte) {
        if (i.toInt() != -115) method1995(-53)
        method1989((this.aLinkedListNode_3334.aLinkedListNode_4294), nodeDeque_0_)
        anInt3340++
    }

    private fun method1989(linkedListNode: LinkedListNode?, nodeDeque_1_: NodeDeque?) {
        do {
            try {
                anInt3325++
                val class348_2_ = (this.aLinkedListNode_3334.aLinkedListNode_4295)
                this.aLinkedListNode_3334.aLinkedListNode_4295 = linkedListNode!!.aLinkedListNode_4295
                linkedListNode.aLinkedListNode_4295!!.aLinkedListNode_4294 = this.aLinkedListNode_3334
                if (this.aLinkedListNode_3334 !== linkedListNode) {
                    linkedListNode.aLinkedListNode_4295 = (nodeDeque_1_!!.aLinkedListNode_3334.aLinkedListNode_4295)
                    linkedListNode.aLinkedListNode_4295!!.aLinkedListNode_4294 = linkedListNode
                    nodeDeque_1_.aLinkedListNode_3334.aLinkedListNode_4295 = class348_2_
                    class348_2_!!.aLinkedListNode_4294 = nodeDeque_1_.aLinkedListNode_3334
                }
                break
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("uh.K(" + (if (linkedListNode != null) "{...}" else "null") + ',' + (if (nodeDeque_1_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    fun method1990(i: Byte): LinkedListNode? {
        anInt3329++
        if (i < 29) aLinkedListNode_3342 = null
        val class348 = aLinkedListNode_3342
        if (this.aLinkedListNode_3334 === class348) {
            aLinkedListNode_3342 = null
            return null
        }
        aLinkedListNode_3342 = class348!!.aLinkedListNode_4294
        return class348
    }

    fun method1993(i: Int): LinkedListNode? {
        anInt3336++
        val class348 = this.aLinkedListNode_3334.aLinkedListNode_4295
        if (this.aLinkedListNode_3334 === class348) {
            aLinkedListNode_3342 = null
            return null
        }
        aLinkedListNode_3342 = class348!!.aLinkedListNode_4295
        if (i > -65) method1993(67)
        return class348
    }

    fun method1995(i: Int): LinkedListNode? {
        anInt3332++
        val class348 = this.aLinkedListNode_3334.aLinkedListNode_4294
        if (class348 === this.aLinkedListNode_3334) {
            aLinkedListNode_3342 = null
            return null
        }
        aLinkedListNode_3342 = class348!!.aLinkedListNode_4294
        return class348
    }

    fun method1996(i: Int) {
        if (i > 97) {
            anInt3339++
            while (true) {
                val class348 = (this.aLinkedListNode_3334.aLinkedListNode_4294)
                if (this.aLinkedListNode_3334 === class348) break
                class348!!.method2715(24.toByte())
            }
            aLinkedListNode_3342 = null
        }
    }

    fun method1997(i: Int): LinkedListNode? {
        anInt3341++
        val class348 = this.aLinkedListNode_3334.aLinkedListNode_4294
        if (this.aLinkedListNode_3334 === class348) return null
        class348!!.method2715(114.toByte())
        return class348
    }

    fun method1998(i: Int): Int {
        anInt3333++
        var i_22_ = i
        var class348 = this.aLinkedListNode_3334.aLinkedListNode_4294
        while (class348 !== this.aLinkedListNode_3334) {
            class348 = class348!!.aLinkedListNode_4294
            i_22_++
        }
        return i_22_
    }

    fun method1999(linkedListNode: LinkedListNode, i: Int) {
        if (linkedListNode.aLinkedListNode_4295 != null) linkedListNode.method2715(91.toByte())
        anInt3328++
        linkedListNode.aLinkedListNode_4294 = this.aLinkedListNode_3334
        linkedListNode.aLinkedListNode_4295 = this.aLinkedListNode_3334.aLinkedListNode_4295
        linkedListNode.aLinkedListNode_4295!!.aLinkedListNode_4294 = linkedListNode
        linkedListNode.aLinkedListNode_4294!!.aLinkedListNode_4295 = linkedListNode
    }

    fun method2001(linkedListNode: LinkedListNode, i: Int) {
        anInt3330++
        if (linkedListNode.aLinkedListNode_4295 != null) linkedListNode.method2715(63.toByte())
        linkedListNode.aLinkedListNode_4295 = this.aLinkedListNode_3334
        linkedListNode.aLinkedListNode_4294 = this.aLinkedListNode_3334.aLinkedListNode_4294
        linkedListNode.aLinkedListNode_4295!!.aLinkedListNode_4294 = linkedListNode
        linkedListNode.aLinkedListNode_4294!!.aLinkedListNode_4295 = linkedListNode
    }

    fun method2002(i: Byte): Boolean {
        anInt3327++
        return this.aLinkedListNode_3334 === this.aLinkedListNode_3334.aLinkedListNode_4294
    }

    fun method2003(i: Int): LinkedListNode? {
        anInt3337++
        val class348 = aLinkedListNode_3342
        if (class348 === this.aLinkedListNode_3334) {
            aLinkedListNode_3342 = null
            return null
        }
        val i_24_ = -111 / ((i - -88) / 38)
        aLinkedListNode_3342 = class348!!.aLinkedListNode_4295
        return class348
    }

    init {
        this.aLinkedListNode_3334.aLinkedListNode_4295 = this.aLinkedListNode_3334
        this.aLinkedListNode_3334.aLinkedListNode_4294 = this.aLinkedListNode_3334
    }

    companion object {
        var anInt3328: Int = 0
        var anInt3337: Int = 0
        var anInt3327: Int = 0
        var anInt3330: Int = 0
        var anInt3332: Int = 0
        var anInt3333: Int = 0
        var anInt3341: Int = 0
        var anInt3339: Int = 0
        var anInt3340: Int = 0
        var anInt3325: Int = 0
        var anInt3329: Int = 0
        var anInt3336: Int = 0
    }
}