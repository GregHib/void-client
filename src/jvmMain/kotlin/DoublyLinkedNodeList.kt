import DoublyLinkedNodeListStatics.method1879
import DoublyLinkedNodeListStatics.anInt3157
import DoublyLinkedNodeListStatics.anInt3158
import DoublyLinkedNodeListStatics.anInt3159
import DoublyLinkedNodeListStatics.anInt3160
import DoublyLinkedNodeListStatics.anInt3161
import DoublyLinkedNodeListStatics.anInt3162
import DoublyLinkedNodeListStatics.anInt3163
import DoublyLinkedNodeListStatics.anInt3168

/* Class243 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class DoublyLinkedNodeList {
    private val aSceneLinkedListNode_3166 = SceneLinkedListNode()
    private var aSceneLinkedListNode_3167: SceneLinkedListNode? = null
    fun method1869(i: Int, sceneLinkedListNode: SceneLinkedListNode) {
        if (sceneLinkedListNode.aSceneLinkedListNode_3976 != null) sceneLinkedListNode.method2373(false)
        anInt3158++
        sceneLinkedListNode.aSceneLinkedListNode_3976 = aSceneLinkedListNode_3166.aSceneLinkedListNode_3976
        if (i > -81) aSceneLinkedListNode_3167 = null
        sceneLinkedListNode.aSceneLinkedListNode_3970 = aSceneLinkedListNode_3166
        sceneLinkedListNode.aSceneLinkedListNode_3976!!.aSceneLinkedListNode_3970 = sceneLinkedListNode
        sceneLinkedListNode.aSceneLinkedListNode_3970!!.aSceneLinkedListNode_3976 = sceneLinkedListNode
    }

    fun method1870(i: Int): SceneLinkedListNode? {
        if (i > -103) aSceneLinkedListNode_3167 = null
        anInt3162++
        val class318 = aSceneLinkedListNode_3166.aSceneLinkedListNode_3976
        if (aSceneLinkedListNode_3166 === class318) {
            aSceneLinkedListNode_3167 = null
            return null
        }
        aSceneLinkedListNode_3167 = class318!!.aSceneLinkedListNode_3976
        return class318
    }

    fun method1871(i: Byte): Boolean {
        anInt3157++
        if (i <= 98) method1879(true)
        return aSceneLinkedListNode_3166 === aSceneLinkedListNode_3166.aSceneLinkedListNode_3970
    }

    fun method1872(i: Int): SceneLinkedListNode? {
        anInt3163++
        val class318 = aSceneLinkedListNode_3166.aSceneLinkedListNode_3970
        if (i != 8) method1878(126.toByte())
        if (class318 === aSceneLinkedListNode_3166) {
            aSceneLinkedListNode_3167 = null
            return null
        }
        aSceneLinkedListNode_3167 = class318!!.aSceneLinkedListNode_3970
        return class318
    }

    fun method1874(i: Int): Int {
        anInt3161++
        var i_0_ = i
        var class318 = aSceneLinkedListNode_3166.aSceneLinkedListNode_3970
        while (aSceneLinkedListNode_3166 !== class318) {
            i_0_++
            class318 = class318!!.aSceneLinkedListNode_3970
        }
        return i_0_
    }

    fun method1875(i: Int): SceneLinkedListNode? {
        anInt3160++
        val class318 = aSceneLinkedListNode_3166.aSceneLinkedListNode_3970
        if (class318 === aSceneLinkedListNode_3166) return null
        class318!!.method2373(false)
        if (i != 60) method1878(16.toByte())
        return class318
    }

    fun method1876(i: Byte) {
        if (i.toInt() == -45) {
            anInt3168++
            while (true) {
                val class318 = aSceneLinkedListNode_3166.aSceneLinkedListNode_3970
                if (class318 === aSceneLinkedListNode_3166) break
                class318!!.method2373(false)
            }
            aSceneLinkedListNode_3167 = null
        }
    }

    fun method1878(i: Byte): SceneLinkedListNode? {
        anInt3159++
        val class318 = aSceneLinkedListNode_3167
        val i_1_ = -59 % ((67 - i) / 55)
        if (class318 === aSceneLinkedListNode_3166) {
            aSceneLinkedListNode_3167 = null
            return null
        }
        aSceneLinkedListNode_3167 = class318!!.aSceneLinkedListNode_3970
        return class318
    }

    init {
        aSceneLinkedListNode_3166.aSceneLinkedListNode_3976 = aSceneLinkedListNode_3166
        aSceneLinkedListNode_3166.aSceneLinkedListNode_3970 = aSceneLinkedListNode_3166
    }
}
