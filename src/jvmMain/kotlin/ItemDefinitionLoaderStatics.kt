import SceneTilePlaneManager.method260
import java.io.File

object ItemDefinitionLoaderStatics {
    var anInt2178: Int = 0
            var anInt2179: Int = 0
            var anInt2181: Int = 0
            var anInt2182: Int = 0
            var aIntRange_2183: IntRange? = IntRange(0, -1)
            var anInt2184: Int = 0
            var anInt2186: Int = 0
            @JvmField
            var aNodeDeque_2187: NodeDeque? = NodeDeque()
            var anInt2189: Int = 0
            @JvmStatic
            fun method1284(i: Int) {
                aIntRange_2183 = null
                if (i == -21165) aNodeDeque_2187 = null
            }
    
            fun method1286(file: File?, i: Int, string: String?) {
                do {
                    try {
                        anInt2181++
                        CollisionMapAccessor.aHashtable3548!!.put(string, file)
                        if (i == 64) break
                        aIntRange_2183 = null
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("pg.F(" + (if (file != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ')'))
                    }
                    break
                } while (false)
            }
    
            fun method1288(i: Int, i_2_: Int) {
                anInt2186++
                var class348 = TextureDefinitionCacheStatics.aHashtable_2959!!.method3484(0)
                while (class348 != null) {
                    if ((class348.aLong4291 shr 48 and 0xffffL) == i_2_.toLong()) class348.method2715(119.toByte())
                    class348 = TextureDefinitionCacheStatics.aHashtable_2959!!.method3482(0)
                }
            }
    
            fun method1289(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
                anInt2179++
                var i_7_ = SpriteArchiveLoaderStatics.anInt385
                if (i_5_ != 8) method1284(-59)
                var i_8_ = JagGlToolkitFactory.anInt1534
                if (GrayscaleNoiseTextureStatics.aBoolean5300) {
                    i_7_ += NativeTerrainTileStatics.method4008((-126).toByte())
                    i_8_ += method260(false)
                }
                if (FogOptionStateStatics.anInt6048 == 1) {
                    val class105 = (BoxBlurTextureNodeStatics.aAbstractModelRendererArray9467!![LinkedListNodeStatics.anInt4292 / 100])
                    class105!!.method974(i_7_ - 8, i_8_ + -8)
                    MapTileShapeStatics.method2663(-5590, -8 + i_7_, -8 + (i_7_ - -class105.method966()), -8 + i_8_, class105.method980() + -8 + i_8_)
                }
                if (FogOptionStateStatics.anInt6048 == 2) {
                    val class105 = (BoxBlurTextureNodeStatics.aAbstractModelRendererArray9467!![LinkedListNodeStatics.anInt4292 / 100 + 4])
                    class105!!.method974(i_7_ + -8, -8 + i_8_)
                    MapTileShapeStatics.method2663(-5590, i_7_ - 8, class105.method966() + i_7_ + -8, -8 + i_8_, class105.method980() + -8 + i_8_)
                }
                RegionSceneLoader.method2192(80.toByte())
            }
}
