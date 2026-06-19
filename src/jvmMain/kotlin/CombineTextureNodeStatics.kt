import kotlin.concurrent.Volatile
import kotlin.math.max
import kotlin.math.min

object CombineTextureNodeStatics {
    @JvmField
            var anInt9222: Int = 0
            @JvmField
            var anInt9223: Int = 0
            @JvmField
            var anInt9224: Int = 0
            @JvmField
            var aIntRange_9225: IntRange?
            @JvmField
            var anInt9227: Int = 0
            @JvmField
            var anInt9228: Int = 0
    
            @Volatile
            var aBoolean9229: Boolean = true
            @JvmField
            var anIntArray9230: IntArray? = intArrayOf(0, -1, 0, 1)
            @JvmField
            var anInt9231: Int = 0
    
            @JvmStatic
            fun method3087(bool: Boolean) {
                anIntArray9230 = null
                aIntRange_9225 = null
                if (bool != false) method3089(-42)
            }
    
            @JvmStatic
            fun method3088(i: Int) {
                anInt9228++
                if (SceneObjectSpawnerStatics.aNamedIdRecord_1279 != NpcAnimationResolverStatics.aNamedIdRecord_165 && i == 9) {
                    try {
                        JavaScriptBridge.method1617(125.toByte(), NpcTypeStatics.aClient1367, "tbrefresh")
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                }
            }
    
            @JvmStatic
            fun method3089(i: Int) {
                MediaStreamClientStatics.anInt3203 = -1
                TerrainChunkBuilderStatics.anInt1548 = -1
                CameraOrModelTransformStatics.anInt4155 = -1
                anInt9222++
                KeyboardLayoutCacheStatics.anInt3306 = 0
                val i_67_ = -95 % ((i - -46) / 52)
            }
    
            init {
                aIntRange_9225 = IntRange(28, -2)
            }
}
