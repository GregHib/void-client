import WorldMapPolygonIconLabelStatics.method3575
import DirectionPathStatics.method535
import NativeBufferHandleStatics.method849
import NativeRendererStatics.method3936
import jaclib.memory.StreamStatics.c

object TerrainChunkBuilderStatics {
    @JvmField
            var anInt1545: Int = 0
            @JvmField
            var anInt1548: Int = -1
            @JvmField
            var anInt1549: Int = 0
            @JvmField
            var anInt1550: Int = 0
            @JvmField
            var anInt1552: Int = 0
            @JvmField
            var anInt1553: Int = 0
            @JvmField
            var anInt1554: Int = 0
            @JvmField
            var anInt1555: Int = 0
            @JvmField
            var anInt1557: Int = 0
            fun method872(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
                anInt1554++
                if (i_5_ >= WorldMapLabelStatics.anInt4960 && CameraNodeListStatics.anInt1745 >= i_4_ && LocalPlayerState.anInt1910 <= i_2_ && WidgetTextConfigStatics.anInt513 >= i_3_) {
                    if (i_1_ == 1) ScanlineRasterFillerStatics.method1388(i_2_, i, i_0_ + 107, i_4_, i_5_, i_3_)
                    else method849(i_1_, i_2_, i_5_, i_4_, i_3_, 100, i)
                } else if (i_1_ != 1) method535(i_5_, i_3_, i_1_, i_4_, i, i_2_, ((-106).toByte()).toByte())
                else method3575(103.toByte(), i_4_, i, i_3_, i_2_, i_5_)
                if (i_0_ != 1) method873(47, 5, null, 1)
            }
    
            fun method873(i: Int, i_6_: Int, var_renderer: Renderer?, i_7_: Int) {
                LruByteCacheStatics.aRenderer1098 = var_renderer
                NodeDequeStatics.aModelLightingConfigArrayArray3335 = Array(i) { arrayOfNulls(i_7_) }
                if (i_6_ == 21719) {
                    anInt1549++
                    if (FogState.anIntArray1432 != null) ParameterizedTextStatics.aCircleRasterizer_9571 = SceneProjectorStatics.method1636(FogState.anIntArray1432!![4], FogState.anIntArray1432!![3], FogState.anIntArray1432!![0], FogState.anIntArray1432!![5], FogState.anIntArray1432!![1], -1, FogState.anIntArray1432!![2])
                    LocalizedTextStatics.aModelLightingConfig_3547 = ModelLightingConfig()
                    method3936(0)
                }
            }
    
            @JvmStatic
            fun method876(i: Int, i_23_: Int) {
                anInt1557++
                synchronized(ModelDataCache.aLruByteCache_355!!) {
                    ModelDataCache.aLruByteCache_355!!.method578(2, i)
                }
                synchronized(ModelBatchBaseStatics.aLruByteCache_1894!!) {
                    ModelBatchBaseStatics.aLruByteCache_1894!!.method578(2, i)
                    if (i_23_ != 0) method876(51, 108)
                }
            }
}
