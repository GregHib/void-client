import DualMaterialContainerStatics.anInt1632
import DualMaterialContainerStatics.anIntArray1636
import DualMaterialContainerStatics.anInt1640

/* Class106 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class DualMaterialContainer internal constructor(js5Archive: Js5Archive?, js5Archive_0_: Js5Archive?) {
    private var aMapRegionLoaderThread_1633: MapRegionLoaderThread? = null
    private val aJs5Archive_1637: Js5Archive?
    private val aJs5Archive_1641: Js5Archive?

    private fun method998(i: Int): MapRegionLoaderThread {
        anInt1632++
        if (aMapRegionLoaderThread_1633 == null) aMapRegionLoaderThread_1633 = MapRegionLoaderThread()
        return aMapRegionLoaderThread_1633!!
    }

    fun method1000(bool: Boolean, configTypeProvider: ConfigTypeProvider?): Lifecycle? {
        anInt1640++
        if (configTypeProvider == null) return null
        val class223 = configTypeProvider.method51(120.toByte())
        if (ModelDefinitionCacheStatics.aProjectileFactory_2868 == class223) return ClickFeedbackTask(configTypeProvider as RsaVarbitHandler)
        if (MatrixCameraTransformStatics.aProjectileFactory_5689 == class223) return WorldMapRenderer(method998(-107), configTypeProvider as MinimapSpriteRenderer)
        if (class223 == WeaveTextureNodeStatics.aProjectileFactory_9274) return WidgetComponentNode(aJs5Archive_1637, configTypeProvider as ParticleEmitterDef)
        if (class223 == ItemNameResolverStatics.aProjectileFactory_4997) return ScrollingWidgetComponentNode(aJs5Archive_1637, configTypeProvider as ParticleEmitterDefExt)
        if (class223 == ByteBufferStatics.aProjectileFactory_7175) return SolidFillComponent(aJs5Archive_1637!!, aJs5Archive_1641!!, configTypeProvider as WorldMapTextLabel)
        if (class223 == SkyboxGradient.aProjectileFactory_3934) return SpriteComponent(aJs5Archive_1637, aJs5Archive_1641!!, configTypeProvider as WorldMapAreaLabel)
        if (class223 == MapSceneDefLoaderStatics.aProjectileFactory_2489) return ScrollbarComponent(aJs5Archive_1637!!, aJs5Archive_1641!!, configTypeProvider as WorldMapIconLabel)
        if (class223 == SpotAnimVectorStatics.aProjectileFactory_2307) return TooltipComponentRenderer(aJs5Archive_1637, aJs5Archive_1641, configTypeProvider as HeapInfoRecord)
        if (bool != true) anIntArray1636 = null
        if (OrientationRotator.aProjectileFactory_2045 == class223) return SplashImageLoadable(aJs5Archive_1637, configTypeProvider as ConfigValueProvider)
        if (LocTypeDefLoaderStatics.aProjectileFactory_2507 == class223) return ProportionalScrollbarComponent(aJs5Archive_1637!!, aJs5Archive_1641!!, configTypeProvider as WorldMapPolygonIconLabel)
        return null
    }

    init {
        try {
            aJs5Archive_1637 = js5Archive
            aJs5Archive_1641 = js5Archive_0_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("mia.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_0_ != null) "{...}" else "null") + ')'))
        }
    }
}
