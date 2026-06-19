import AbstractCameraTransformStatics.method901
import WorldMapLabelStatics.method3568
import RingBufferInputStreamStatics.method3616

object GlTexture2DRegionStatics {
    @JvmField
            var anInt9942: Int = 0
    
            @JvmStatic
            fun method1971(i: Int, string: String?, bool: Boolean, i_11_: Int) {
                anInt9942++
                ScrollingNoiseTextureStatics.method556(false)
                TileRenderStateStatics.method2681(9864)
                NpcReferenceStatics.method2959(-1)
                OggBitstreamDecoderStatics.method2965(string, i_11_, bool, 0)
                ClientGameLoopNodeStatics.method2994(2)
                VarpStoreStatics.method1311(5139, FacingDirectionNodeStatics.aRenderer6654!!)
                method3568(FacingDirectionNodeStatics.aRenderer6654, 4)
                ModelHeaderCacheStatics.method1933(CameraRotationStubStatics.aJs5Archive_322, FacingDirectionNodeStatics.aRenderer6654, true)
                LocalizedTextStatics.method2061(-128)
                method901(CameraNodeListStatics.aAbstractModelRendererArray1744, 515880227)
                TextureCacheStatics.method3466(i xor 0x4f.inv())
                AbstractProceduralTextureNodeStatics.method3038(-1)
                if (WorldMapRendererStatics.anInt4674 == 3) ByteBufferStatics.method3379(2, 4)
                else if (WorldMapRendererStatics.anInt4674 == 7) ByteBufferStatics.method3379(2, 8)
                else if (WorldMapRendererStatics.anInt4674 != 10) {
                    if (WorldMapRendererStatics.anInt4674 == 1 || WorldMapRendererStatics.anInt4674 == 2) method3616(12639)
                } else ByteBufferStatics.method3379(2, 11)
            }
}
