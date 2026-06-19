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
            this.aSceneLinkedListNode_3976 = null
        }
    }

    companion object {
        var anInt3975: Int = 0
    }
}