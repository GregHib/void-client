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
        if (ModelDefinitionCache.aProjectileFactory_2868 == class223) return ClickFeedbackTask(configTypeProvider as RsaVarbitHandler)
        if (MatrixCameraTransform.aProjectileFactory_5689 == class223) return WorldMapRenderer(method998(-107), configTypeProvider as MinimapSpriteRenderer)
        if (class223 == WeaveTextureNode.aProjectileFactory_9274) return WidgetComponentNode(aJs5Archive_1637, configTypeProvider as ParticleEmitterDef)
        if (class223 == ItemNameResolver.aProjectileFactory_4997) return ScrollingWidgetComponentNode(aJs5Archive_1637, configTypeProvider as ParticleEmitterDefExt)
        if (class223 == ByteBufferStatics.aProjectileFactory_7175) return SolidFillComponent(aJs5Archive_1637!!, aJs5Archive_1641!!, configTypeProvider as WorldMapTextLabel)
        if (class223 == SkyboxGradient.aProjectileFactory_3934) return SpriteComponent(aJs5Archive_1637, aJs5Archive_1641!!, configTypeProvider as WorldMapAreaLabel)
        if (class223 == MapSceneDefLoader.aProjectileFactory_2489) return ScrollbarComponent(aJs5Archive_1637!!, aJs5Archive_1641!!, configTypeProvider as WorldMapIconLabel)
        if (class223 == SpotAnimVector.aProjectileFactory_2307) return TooltipComponentRenderer(aJs5Archive_1637, aJs5Archive_1641, configTypeProvider as HeapInfoRecord)
        if (bool != true) anIntArray1636 = null
        if (OrientationRotator.aProjectileFactory_2045 == class223) return SplashImageLoadable(aJs5Archive_1637, configTypeProvider as ConfigValueProvider)
        if (LocTypeDefLoader.aProjectileFactory_2507 == class223) return ProportionalScrollbarComponent(aJs5Archive_1637!!, aJs5Archive_1641!!, configTypeProvider as WorldMapPolygonIconLabel)
        return null
    }

    init {
        try {
            aJs5Archive_1637 = js5Archive
            aJs5Archive_1641 = js5Archive_0_
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("mia.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_0_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt1631: Int = 0
        @JvmField
        var anInt1632: Int = 0
        @JvmField
        var anInt1634: Int = 0
        @JvmField
        var anIntArray1635: IntArray? = IntArray(16)
        var anIntArray1636: IntArray? = null
        @JvmField
        var anIntArrayArray1638: Array<IntArray>? = arrayOf(intArrayOf(0, 1, 2, 3), intArrayOf(1, -1, -1, 0), intArrayOf(-1, 2, -1, 0), intArrayOf(-1, 0, -1, 2), intArrayOf(0, 1, -1, 2), intArrayOf(1, 2, -1, 0), intArrayOf(-1, 4, -1, 1), intArrayOf(-1, 3, 4, -1), intArrayOf(-1, 0, 2, -1), intArrayOf(-1, -1, 2, 0), intArrayOf(0, 2, 5, 3), intArrayOf(0, -1, 6, -1), intArrayOf(0, 1, 2, 3))
        @JvmField
        var anInt1639: Int = 0
        @JvmField
        var anInt1640: Int = 0
        @JvmStatic
        fun method999(i: Int) {
            anIntArray1636 = null
            anIntArray1635 = null
            anIntArrayArray1638 = null
        }

        @JvmStatic
        fun method1001(js5Archive: Js5Archive, i: Int) {
            anInt1634++
            ConnectionStateType.anInt1044 = js5Archive.method417("p11_full", i)
            WidgetDefinition.anInt235 = js5Archive.method417("p12_full", i)
            CutsceneSequenceData.anInt3736 = js5Archive.method417("b12_full", 0)
        }
    }
}
