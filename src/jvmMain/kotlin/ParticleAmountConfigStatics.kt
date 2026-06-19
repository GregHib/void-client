import FlipTextureNodeStatics.method3064

object ParticleAmountConfigStatics {
    var anInt2124: Int = 0
            var anInt2126: Int = 0
            var anInt2127: Int = 500
            var anInt2128: Int = 0
    
            fun method1252(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Byte, i_9_: Int) {
                anInt2124++
                if (TextureLoaderUtil.method2547(i_2_, 84.toByte())) {
                    var i_11_ = 0
                    var i_12_ = 0
                    var i_13_ = 0
                    var i_14_ = 0
                    var i_15_ = 0
                    if (GrayscaleNoiseTextureStatics.aBoolean5300) {
                        i_11_ = ResourceProviderStatics.anInt3941
                        i_15_ = CompletedResourceRequestStatics.anInt10463
                        i_13_ = ResourceProviderStatics.anInt3939
                        i_12_ = GraphicsOptionStateStatics.anInt3142
                        i_14_ = ModelVertexColorBufferStatics.anInt6585
                        CompletedResourceRequestStatics.anInt10463 = 1
                    }
                    if (WorldMapTextLabelStatics.aWidgetComponentArrayArray8584!![i_2_] == null) method3064(i_9_, i, i_4_ < 0, i_5_, i_3_, i_4_, i_6_, false, (WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i_2_]), -1, i_7_)
                    else method3064(i_9_, i, i_4_ < 0, i_5_, i_3_, i_4_, i_6_, false, (WorldMapTextLabelStatics.aWidgetComponentArrayArray8584!![i_2_]), -1, i_7_)
                    if (i_8_ <= 58) anInt2127 = -84
                    if (GrayscaleNoiseTextureStatics.aBoolean5300) {
                        if (i_4_ >= 0 && CompletedResourceRequestStatics.anInt10463 == 2) MapTileShapeStatics.method2663(-5590, ResourceProviderStatics.anInt3941, ResourceProviderStatics.anInt3939, GraphicsOptionStateStatics.anInt3142, ModelVertexColorBufferStatics.anInt6585)
                        CompletedResourceRequestStatics.anInt10463 = i_15_
                        ResourceProviderStatics.anInt3939 = i_13_
                        GraphicsOptionStateStatics.anInt3142 = i_12_
                        ModelVertexColorBufferStatics.anInt6585 = i_14_
                        ResourceProviderStatics.anInt3941 = i_11_
                    }
                } else if (i_4_ == -1) {
                    for (i_10_ in 0..99) GzipDecompressorStatics.aBooleanArray2076!![i_10_] = true
                } else GzipDecompressorStatics.aBooleanArray2076!![i_4_] = true
            }
}
