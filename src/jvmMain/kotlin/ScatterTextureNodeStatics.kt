import java.util.*

object ScatterTextureNodeStatics {
    @JvmField
            var anInt9361: Int = 0
            @JvmField
            var anInt9363: Int = 0
            @JvmField
            var aJs5Archive_9365: Js5Archive? = null
            @JvmField
            var anInt9366: Int = 0
            @JvmField
            var anInt9370: Int = 0
    
            fun method3122(i: Byte): Array<NamedIdRecord?> {
                if (i < 86) aJs5Archive_9365 = null
                anInt9361++
                return (arrayOf<NamedIdRecord?>(OggCacheStreamStatics.aNamedIdRecord_5271, FixedFunctionWaterPassStatics.aNamedIdRecord_7361, SpriteArchiveLoaderStatics.aNamedIdRecord_382, GroundItemRenderState.aNamedIdRecord_1657, SceneObjectSpawnerStatics.aNamedIdRecord_1279, WidgetRedrawRegionStatics.aNamedIdRecord_4246))
            }
    
            @JvmStatic
            fun method3123(i: Int) {
                aJs5Archive_9365 = null
                if (i != 0) method3122((-98).toByte())
            }
}
