import DetailLevelOptionStateStatics.method1837
import CacheEntryReferenceStatics.method3194
import ParticleDefLoaderStatics.method1376
import ParticleDefLoaderStatics.method1382
import ParticleDefLoaderStatics.anInt2457
import ParticleDefLoaderStatics.anInt2460
import ParticleDefLoaderStatics.anInt2464
import ParticleDefLoaderStatics.anInt2465
import ParticleDefLoaderStatics.anInt2467

/* Class183 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleDefLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aLruByteCache_2458 = LruByteCache(128)
    private val aJs5Archive_2461: Js5Archive?
    fun method1377(i: Int) {
        anInt2457++
        if (i != 2) method1376(null)
        synchronized(aLruByteCache_2458) {
            aLruByteCache_2458.method587(-125)
        }
    }

    fun method1380(bool: Boolean, i: Int): HslColorConfig? {
        anInt2460++
        if (bool != true) return null
        var hslColorConfig: HslColorConfig?
        synchronized(aLruByteCache_2458) {
            hslColorConfig = aLruByteCache_2458.method583(i.toLong(), 77) as HslColorConfig?
        }
        if (hslColorConfig != null) return hslColorConfig
        val `is`: ByteArray?
        synchronized(aJs5Archive_2461!!) {
            `is` = aJs5Archive_2461.method410(-1860, 1, i)
        }
        hslColorConfig = HslColorConfig()
        if (`is` != null) hslColorConfig.method290(ByteBuffer(`is`), -1)
        synchronized(aLruByteCache_2458) {
            aLruByteCache_2458.method582(hslColorConfig, i.toLong(), (-124).toByte())
        }
        return hslColorConfig
    }

    fun method1381(bool: Boolean) {
        synchronized(aLruByteCache_2458) {
            if (bool != true) method1382(-96, 76)
            aLruByteCache_2458.method590(0)
        }
        anInt2465++
    }

    fun method1383(i: Int, i_7_: Int) {
        anInt2467++
        synchronized(aLruByteCache_2458) {
            aLruByteCache_2458.method578(2, i_7_)
        }
        if (i != 32841) anInt2464 = 86
    }

    init {
        try {
            aJs5Archive_2461 = js5Archive
            aJs5Archive_2461!!.method407(0, 1)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("qe.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}
