import ObjectSpawnDecoder.method1087
import BoundsConstraintEntryStatics.method2056
import kotlin.concurrent.Volatile
import CacheIndexManagerStatics.method2358
import CacheIndexManagerStatics.anInt3944
import CacheIndexManagerStatics.anInt3947
import CacheIndexManagerStatics.anInt3949
import CacheIndexManagerStatics.anInt3950
import CacheIndexManagerStatics.anInt3952
import CacheIndexManagerStatics.anInt3955

/* Class315 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CacheIndexManager internal constructor(var aString3953: String?) {
    private val aDoublyLinkedNodeList_3946 = DoublyLinkedNodeList()
    private var aSceneLoaderThread_3956: SceneLoaderThread? = null

    @Volatile
    private var anInt3957 = 0

    fun method2353(class318_sub1: SceneEntity, bool: Boolean) {
        class318_sub1.aBoolean6387 = bool
        anInt3944++
        synchronized(aDoublyLinkedNodeList_3946) {
            aDoublyLinkedNodeList_3946.method1869(-90, class318_sub1)
            anInt3957++
        }
        if (aSceneLoaderThread_3956 != null) {
            synchronized(aSceneLoaderThread_3956!!) {
                (aSceneLoaderThread_3956 as Object).notify()
            }
        }
    }

    fun method2356(sceneLoaderThread: SceneLoaderThread?, i: Byte) {
        aSceneLoaderThread_3956 = sceneLoaderThread
        if (i.toInt() != -108) method2358(-10, -55, 5)
        anInt3949++
    }

    fun method2359(class318_sub2: SceneModelBuilder, i: Int) {
        if (i != -1) method2362(45)
        synchronized(aDoublyLinkedNodeList_3946) {
            aDoublyLinkedNodeList_3946.method1869(-127, class318_sub2)
            anInt3957++
        }
        anInt3947++
        if (aSceneLoaderThread_3956 != null) {
            synchronized(aSceneLoaderThread_3956!!) {
                (aSceneLoaderThread_3956 as Object).notify()
            }
        }
    }

    fun method2360(i: Int): Boolean {
        val i_7_ = 46 % ((i - 10) / 54)
        anInt3955++
        return anInt3957 == 0
    }

    fun method2361(i: Int, class318_sub1: SceneEntity) {
        class318_sub1.aBoolean6387 = true
        anInt3950++
        synchronized(aDoublyLinkedNodeList_3946) {
            aDoublyLinkedNodeList_3946.method1869(-122, class318_sub1)
            anInt3957++
        }
        if (i != -15481) this.aString3953 = null
        if (aSceneLoaderThread_3956 != null) {
            synchronized(aSceneLoaderThread_3956!!) {
                (aSceneLoaderThread_3956 as Object).notify()
            }
        }
    }

    fun method2362(i: Int): SceneLinkedListNode {
        anInt3952++
        val `object`: Any? = null
        val sceneLinkedListNode: SceneLinkedListNode?
        synchronized(aDoublyLinkedNodeList_3946) {
            sceneLinkedListNode = aDoublyLinkedNodeList_3946.method1872(8)
            sceneLinkedListNode!!.method2373(false)
            anInt3957--
        }
        return sceneLinkedListNode!!
    }
}
