import ObjectSpawnDecoder.method1087
import BoundsConstraintEntry.Companion.method2056
import kotlin.concurrent.Volatile

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
        withLock(aDoublyLinkedNodeList_3946) {
            aDoublyLinkedNodeList_3946.method1869(-90, class318_sub1)
            anInt3957++
        }
        if (aSceneLoaderThread_3956 != null) {
            withLock(aSceneLoaderThread_3956!!) {
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
        withLock(aDoublyLinkedNodeList_3946) {
            aDoublyLinkedNodeList_3946.method1869(-127, class318_sub2)
            anInt3957++
        }
        anInt3947++
        if (aSceneLoaderThread_3956 != null) {
            withLock(aSceneLoaderThread_3956!!) {
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
        withLock(aDoublyLinkedNodeList_3946) {
            aDoublyLinkedNodeList_3946.method1869(-122, class318_sub1)
            anInt3957++
        }
        if (i != -15481) this.aString3953 = null
        if (aSceneLoaderThread_3956 != null) {
            withLock(aSceneLoaderThread_3956!!) {
                (aSceneLoaderThread_3956 as Object).notify()
            }
        }
    }

    fun method2362(i: Int): SceneLinkedListNode {
        anInt3952++
        val `object`: Any? = null
        val sceneLinkedListNode: SceneLinkedListNode?
        withLock(aDoublyLinkedNodeList_3946) {
            sceneLinkedListNode = aDoublyLinkedNodeList_3946.method1872(8)
            sceneLinkedListNode!!.method2373(false)
            anInt3957--
        }
        return sceneLinkedListNode!!
    }

    companion object {
        var anInt3944: Int = 0
        var anInt3945: Int = 0
        var anInt3947: Int = 0
        var anInt3948: Int = 0
        var anInt3949: Int = 0
        var anInt3950: Int = 0
        var anInt3951: Int = 0
        var anInt3952: Int = 0
        var anInt3954: Int = 0
        var anInt3955: Int = 0
        @JvmStatic
        fun method2354(namedIdRecord: NamedIdRecord?, i: Int): Boolean {
            anInt3954++
            if (i != -1) method2355(-93, 115.toByte(), true, null, -92, -67, 6)
            return FixedFunctionWaterPass.aNamedIdRecord_7361 == namedIdRecord || SpriteArchiveLoader.aNamedIdRecord_382 == namedIdRecord || GroundItemRenderState.aNamedIdRecord_1657 == namedIdRecord || namedIdRecord == WidgetRedrawRegion.aNamedIdRecord_4246
        }

        @JvmStatic
        fun method2355(i: Int, i_0_: Byte, bool: Boolean, js5Archive: Js5Archive?, i_1_: Int, i_2_: Int, i_3_: Int) {
            DirectionPath.anInt1059 = i
            anInt3948++
            KeyboardInputSource.aBoolean4275 = bool
            GlBufferObject.aClass348_Sub16_Sub3_4743 = null
            NpcActorEntity.anInt10074 = i_1_
            WaterDetailOptionState.anInt5994 = i_3_
            SpriteDefinition.anInt7068 = 1
            SceneLinkedListNode.anInt3971 = i_2_
            ModelDefinition.aJs5Archive_1848 = js5Archive
        }

        @JvmStatic
        fun method2357(i: Int, player: Player): Int {
            anInt3951++
            var i_4_ = (player.anInt10560)
            val class225 = player.method2422(72.toByte())
            if (i != (player.anInt10268) && !(player.aBoolean10213)) {
                if ((player.anInt10268) != class225.anInt2919 && (player.anInt10268 != class225.anInt2920) && (class225.anInt2949 != (player.anInt10268)) && (player.anInt10268 != class225.anInt2914)) {
                    if ((class225.anInt2940 == (player.anInt10268)) || (player.anInt10268 == class225.anInt2924) || (player.anInt10268 == class225.anInt2947) || (player.anInt10268 == class225.anInt2958)) i_4_ = player.anInt10526
                } else i_4_ = player.anInt10519
            } else i_4_ = player.anInt10535
            return i_4_
        }

        fun method2358(i: Int, i_5_: Int, i_6_: Int): Boolean {
            if (i >= -106) return true
            anInt3945++
            return method1087(12644, i_6_, i_5_) || method2056(i_5_, 107, i_6_)
        }
    }
}
