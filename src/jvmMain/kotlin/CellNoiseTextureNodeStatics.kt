import GraphicsOptionStateStatics.method1717
import java.util.*

object CellNoiseTextureNodeStatics {
    @JvmField
            var aIntRange_9285: IntRange? = IntRange(104, 1)
            @JvmField
            var anInt9289: Int = 0
            @JvmField
            var anInt9290: Int = 0
            @JvmField
            var anInt9292: Int = 0
            @JvmField
            var anInt9295: Int = 0
            @JvmField
            var anInt9296: Int = 0
            var aTextureFormatInfo_9303: TextureFormatInfo? = TextureFormatInfo(1)
            @JvmField
            var aFontMetaRef_9304: FontMetaRef? = FontMetaRef(20, -1)
            @JvmStatic
            fun method3110(i: Int) {
                aFontMetaRef_9304 = null
                aTextureFormatInfo_9303 = null
                if (i != -1633784916) aTextureFormatInfo_9303 = null
                aIntRange_9285 = null
            }
    
            @JvmStatic
            fun method3111(i: Int, i_23_: Int) {
                anInt9290++
                if (i_23_ != MenuActionNodeStatics.anInt6769) {
                    if (i < 18) aTextureFormatInfo_9303 = null
                    RangeThresholdTextureNodeStatics.anInt9109 = FileExistsConditionStatics.anIntArray4780!![i_23_]
                    GlCubemapLightPassStatics.anInt7319 = RangeThresholdTextureNodeStatics.anInt9109
                    BufferToggleStateStatics.method2196((-9).toByte())
                    GameClock.anIntArrayArrayArray1116 = (Array<Array<IntArray?>?>(4) { Array<IntArray?>(GlCubemapLightPassStatics.anInt7319 shr 3) { IntArray(RangeThresholdTextureNodeStatics.anInt9109 shr 3) } })
                    FlickeringEffectsOptionStateStatics.anIntArrayArray5921 = (Array<IntArray?>(GlCubemapLightPassStatics.anInt7319) { IntArray(RangeThresholdTextureNodeStatics.anInt9109) })
                    TextureMaterialGroupStatics.anIntArrayArray9678 = (Array<IntArray?>(GlCubemapLightPassStatics.anInt7319) { IntArray(RangeThresholdTextureNodeStatics.anInt9109) })
                    for (i_24_ in 0..3) TimedRecordAccessorStatics.aCollisionMapArray7108s!![i_24_] = AnimatedModelRendererStatics.method988(RangeThresholdTextureNodeStatics.anInt9109, 1, GlCubemapLightPassStatics.anInt7319)
                    RegionSceneLoader.aByteArrayArrayArray3700 = (Array<Array<ByteArray?>?>(4) { Array<ByteArray?>(GlCubemapLightPassStatics.anInt7319) { ByteArray(RangeThresholdTextureNodeStatics.anInt9109) } })
                    method1717(19278, RangeThresholdTextureNodeStatics.anInt9109, GlCubemapLightPassStatics.anInt7319, 4)
                    TerrainChunkBuilderStatics.method873(GlCubemapLightPassStatics.anInt7319 shr 3, 21719, FacingDirectionNodeStatics.aRenderer6654, RangeThresholdTextureNodeStatics.anInt9109 shr 3)
                    MenuActionNodeStatics.anInt6769 = i_23_
                }
            }
}
