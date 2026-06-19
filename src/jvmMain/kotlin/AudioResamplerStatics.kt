import TerrainTileShapeStatics.method2726
import kotlin.math.ceil
import kotlin.math.cos
import kotlin.math.floor
import kotlin.math.sin

object AudioResamplerStatics {
    var anInt2160: Int = 0
            var anInt2161: Int = 0
            @JvmField
            var aBooleanArray2162: BooleanArray? = null
            @JvmField
            var anIntArrayArray2165: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(2, 4, 6, 0), intArrayOf(0, 2, 3, 5, 6, 4), intArrayOf(0, 1, 4, 5), intArrayOf(4, 6, 0, 2), intArrayOf(2, 4, 0), intArrayOf(0, 2, 4), intArrayOf(6, 0, 1, 2, 4, 5), intArrayOf(0, 1, 2, 4, 6, 7), intArrayOf(4, 7, 6, 0), intArrayOf(0, 8, 6, 1, 9, 2, 9, 4), intArrayOf(2, 9, 4, 0, 8, 6), intArrayOf(2, 11, 3, 7, 10, 10, 6, 6), intArrayOf(2, 4, 6, 0))
            var anInt2166: Int = 0
            var anInt2167: Int = 0
            var anInt2168: Int = 0
            var aWidgetDefinitionArray2169s: Array<WidgetDefinition?>? = arrayOfNulls<WidgetDefinition>(14)
            var anInt2170: Int = 0
            var anInt2171: Int = 0
    
            @JvmStatic
            fun method1269(i: Int): InterfaceComponentGroup? {
                if (i != -17096) return null
                anInt2168++
                return MapRegionLoaderStatics.aClass348_Sub42_Sub14_1243
            }
    
            fun method1271(i: Int) {
                anInt2166++
                synchronized(WidgetRedrawRegionStatics.aLruByteCache_4254!!) {
                    WidgetRedrawRegionStatics.aLruByteCache_4254!!.method587(-86)
                    if (i != 0) method1276(25)
                }
            }
    
            @JvmStatic
            fun method1273(`is`: IntArray, bool: Boolean): String {
                anInt2161++
                val stringbuffer = StringBuffer()
                var i = BooleanGraphicsOptionStateStatics.anInt5850
                var i_24_ = 0
                while (`is`.size > i_24_) {
                    val class321 = TheoraVideoStreamStatics.aLocTypeDefLoader_9036!!.method1408(-12637, `is`[i_24_])
                    if (class321.anInt4000 != -1) {
                        var abstractModelRenderer = (SkeletalAnimFrameLoaderStatics.aLruByteCache_463!!.method583(class321.anInt4000.toLong(), -74) as? AbstractModelRenderer?)
                        if (abstractModelRenderer == null) {
                            val spriteImage = SpriteImageStatics.method1521(CameraRotationStubStatics.aJs5Archive_322!!, class321.anInt4000, 0)
                            if (spriteImage != null) {
                                abstractModelRenderer = FacingDirectionNodeStatics.aRenderer6654!!.method3691(spriteImage, true)
                                SkeletalAnimFrameLoaderStatics.aLruByteCache_463!!.method582(abstractModelRenderer, class321.anInt4000.toLong(), (-127).toByte())
                            }
                        }
                        if (abstractModelRenderer != null) {
                            TileRenderStateStatics.aAbstractModelRendererArray4234!![i] = abstractModelRenderer
                            stringbuffer.append(" <img=").append(i).append(">")
                            i++
                        }
                    }
                    i_24_++
                }
                if (bool != true) aBooleanArray2162 = null
                return stringbuffer.toString()
            }
    
            @JvmStatic
            fun method1274(sceneObjectSpawner: SceneObjectSpawner?) {
                PlayerSequenceSelector.aSceneObjectSpawner_1208 = sceneObjectSpawner
            }
    
            @JvmStatic
            fun method1276(i: Int) {
                val i_35_ = 101 % ((i - -20) / 49)
                aWidgetDefinitionArray2169s = null
                anIntArrayArray2165 = null
                aBooleanArray2162 = null
            }
}
