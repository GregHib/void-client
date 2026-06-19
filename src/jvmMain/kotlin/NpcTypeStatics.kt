import CacheArchiveIndexLoaderStatics.method340

object NpcTypeStatics {
    @JvmField
            var anInt1326: Int = 0
            @JvmField
            var anInt1332: Int = 0
            @JvmField
            var anInt1334: Int = 0
            @JvmField
            var anInt1341: Int = 0
            @JvmField
            var anInt1351: Int = 0
            @JvmField
            var anInt1357: Int = 0
            var anInt1359: Int = 0
            @JvmField
            var aAbstractModelRenderer_1365: AbstractModelRenderer? = null
            @JvmField
            var aClient1367: Client? = null
            @JvmField
            var anInt1378: Int = 0
            @JvmField
            var anInt1379: Int = 0
            var anInt1387: Int = 0
            @JvmField
            var anInt1389: Int = 0
            @JvmField
            var anInt1394: Int = 0
            @JvmField
            var anInt1400: Int = 0
            @JvmField
            var anInt1403: Int = 0
            @JvmField
            var anInt1404: Int = 0
            @JvmStatic
            fun method797(i: Int, i_29_: Int, i_30_: Byte) {
                anInt1379++
                if (DisplaceTextureNodeStatics.anInt9139 != i_29_) {
                    SceneEffectMarkerStatics.anIntArray6432 = IntArray(i_29_)
                    for (i_31_ in 0..<i_29_) SceneEffectMarkerStatics.anIntArray6432!![i_31_] = (i_31_ shl 12) / i_29_
                    SimpleBinaryOptionStateStatics.anInt6076 = i_29_ + -1
                    DisplaceTextureNodeStatics.anInt9139 = i_29_
                    MediaStreamClientStatics.anInt3201 = 32 * i_29_
                }
                if (i_30_ <= 108) aClient1367 = null
                if (FixedFunctionMaterialPassStatics.anInt6212 != i) {
                    if (DisplaceTextureNodeStatics.anInt9139 != i) {
                        LightDetailOptionStateStatics.anIntArray6035 = IntArray(i)
                        for (i_32_ in 0..<i) LightDetailOptionStateStatics.anIntArray6035!![i_32_] = (i_32_ shl 12) / i
                    } else LightDetailOptionStateStatics.anIntArray6035 = SceneEffectMarkerStatics.anIntArray6432
                    FixedFunctionMaterialPassStatics.anInt6212 = i
                    TextureCubeProviderStatics.anInt6325 = -1 + i
                }
            }
    
            @JvmStatic
            fun method802(i: Int, i_93_: Int, bool: Boolean): Boolean {
                if (bool != true) return false
                anInt1332++
                if (i_93_ < 0 || i < 0 || i_93_ >= AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![1]!!.size || i >= AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![1]!![i_93_]!!.size) return false
                return (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![1]!![i_93_]!![i].toInt() and 0x2) != 0
            }
    
            @JvmStatic
            fun method804(i: Int) {
                aAbstractModelRenderer_1365 = null
                aClient1367 = null
                if (i != -3752) anInt1387 = 14
            }
}
