/* Class318 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class SceneLinkedListNode {
    var aSceneLinkedListNode_3970: SceneLinkedListNode? = null
    var aSceneLinkedListNode_3976: SceneLinkedListNode? = null
    fun method2373(bool: Boolean) {
        anInt3975++
        if (this.aSceneLinkedListNode_3976 != null) {
            this.aSceneLinkedListNode_3976!!.aSceneLinkedListNode_3970 = this.aSceneLinkedListNode_3970
            this.aSceneLinkedListNode_3970!!.aSceneLinkedListNode_3976 = this.aSceneLinkedListNode_3976
            this.aSceneLinkedListNode_3970 = null
            if (bool == false) this.aSceneLinkedListNode_3976 = null
        }
    }

    companion object {
        var anInt3971: Int = 0
        var anInt3972: Int = 0
        var anInt3973: Int = 0
        @JvmField
        var aDoublyLinkedNodeListArray3974s: Array<DoublyLinkedNodeList?>? = arrayOfNulls<DoublyLinkedNodeList>(5)
        var anInt3975: Int = 0
        var aTextureFormatInfo_3977: TextureFormatInfo?

        @JvmStatic
        fun method2374(i: Byte) {
            aTextureFormatInfo_3977 = null
            val i_0_ = 108 / ((i - -83) / 41)
            aDoublyLinkedNodeListArray3974s = null
        }

        @JvmStatic
        fun method2375(i: Int) {
            anInt3972++
            SocketStreamWorker.aClass60_2671!!.method590(0)
            if (i != 16127) anInt3971 = -113
        }

        init {
            var i = 0
            while (aDoublyLinkedNodeListArray3974s!!.size > i) {
                aDoublyLinkedNodeListArray3974s!![i] = DoublyLinkedNodeList()
                i++
            }
            aTextureFormatInfo_3977 = TextureFormatInfo(1)
        }
    }
}
