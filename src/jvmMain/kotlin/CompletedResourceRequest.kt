/* Class348_Sub42_Sub16_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CompletedResourceRequest : AsyncResourceRequest() {
    @JvmField
    var anInt10457: Int = 0
    @JvmField
    var aIndexedFileCache_10458: IndexedFileCache? = null
    @JvmField
    var aByteArray10461: ByteArray? = null

    override fun method3257(i: Int): Int {
        anInt10460++
        if (i != 16) this.aIndexedFileCache_10458 = null
        if (this.aBoolean9664) return 0
        return 100
    }

    override fun method3259(i: Int): ByteArray? {
        anInt10464++
        if (i != 16) method3259(8)
        if (this.aBoolean9664) throw RuntimeException()
        return this.aByteArray10461
    }

    companion object {
        @JvmField
        var anInt10459: Int = 0
        @JvmField
        var anInt10460: Int = 0
        @JvmField
        var anInt10462: Int = 0
        @JvmField
        var anInt10463: Int = 0
        @JvmField
        var anInt10464: Int = 0
        @JvmField
        var aHashtable_10465: Hashtable? = Hashtable(16)

        @JvmStatic
        fun method3263(bool: Boolean): Boolean {
            if (bool != true) return false
            anInt10459++
            return FontMetaRef.aBoolean4328
        }

        @JvmStatic
        fun method3264(i: Byte) {
            aHashtable_10465 = null
            if (i.toInt() != -24) method3265(-70, null, null)
        }

        @JvmStatic
        fun method3265(i: Int, linkedListNode: LinkedListNode?, linkedListNode_0_: LinkedListNode?) {
            try {
                if (linkedListNode!!.aLinkedListNode_4295 != null) linkedListNode.method2715(27.toByte())
                val i_1_ = -109 % ((6 - i) / 43)
                anInt10462++
                linkedListNode.aLinkedListNode_4295 = linkedListNode_0_!!.aLinkedListNode_4295
                linkedListNode.aLinkedListNode_4294 = linkedListNode_0_
                linkedListNode.aLinkedListNode_4295!!.aLinkedListNode_4294 = linkedListNode
                linkedListNode.aLinkedListNode_4294!!.aLinkedListNode_4295 = linkedListNode
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("qh.K(" + i + ',' + (if (linkedListNode != null) "{...}" else "null") + ',' + (if (linkedListNode_0_ != null) "{...}" else "null") + ')'))
            }
        }
    }
}
