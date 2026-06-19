import CacheArchiveIndexLoaderStatics.method340
import kotlin.math.sqrt

object TerrainShadowBuilderGl2Statics {
    @JvmField
            var anInt6930: Int = 0
            var anInt6931: Int = 0
            var anInt6933: Int = 0
            @JvmField
            var anInt6938: Int = 0
            var anInt6939: Int = 0
            var anInt6941: Int = 0
            var aThread6946: Thread? = null
            var aJs5Archive_6950: Js5Archive? = null
            fun method3018(i: Int) {
                InterfaceBoundsStatics.anInt6818 = i
            }
    
            @JvmStatic
            fun method3020(i: Byte) {
                if (i.toInt() == -64) {
                    aJs5Archive_6950 = null
                    aThread6946 = null
                }
            }
    
            fun method3021(i: Byte, renderConfigFactory: RenderConfigFactory?): Int {
                anInt6931++
                if (renderConfigFactory != RenderQueueState.aRenderConfigFactory_6519) {
                    if (ParticleSystemStateStatics.aRenderConfigFactory_2207 == renderConfigFactory) return 8448
                    if (renderConfigFactory == MediaStreamClientStatics.aRenderConfigFactory_3196) return 34165
                    if (TheoraVideoStreamStatics.aRenderConfigFactory_9011 == renderConfigFactory) return 260
                    if (renderConfigFactory == RegionTileNodeStatics.aRenderConfigFactory_6644) return 34023
                } else return 7681
                if (i.toInt() != 32) method3021((-21).toByte(), null)
                throw IllegalArgumentException()
            }
}
