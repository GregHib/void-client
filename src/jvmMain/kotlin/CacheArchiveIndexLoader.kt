import AbstractFrameBufferSurfaceStatics.method3013
import SpriteComponentStatics.method200
import java.awt.Point
import CacheArchiveIndexLoaderStatics.anInt457

/*
 * Class33
 */
class CacheArchiveIndexLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_458: Js5Archive?
    private val aLruByteCache_460 = LruByteCache(128)
    fun method337(bool: Boolean, i: Int): CacheArchiveIndex {
        anInt457++
        var cacheArchiveIndex: CacheArchiveIndex?
        synchronized(aLruByteCache_460) {
            cacheArchiveIndex = aLruByteCache_460.method583(i.toLong(), 111) as CacheArchiveIndex?
        }
        if (cacheArchiveIndex != null) return cacheArchiveIndex
        val `is` = aJs5Archive_458!!.method410(-1860, method200(-107, i), method3013(i, bool))
        cacheArchiveIndex = CacheArchiveIndex()
        if (`is` != null) cacheArchiveIndex.method1069(0, ByteBuffer(`is`))
        synchronized(aLruByteCache_460) {
            aLruByteCache_460.method582(cacheArchiveIndex, i.toLong(), (-102).toByte())
        }
        return cacheArchiveIndex
    }

    init {
        do {
            try {
                aJs5Archive_458 = js5Archive
                if (aJs5Archive_458 == null) break
                val i_6_ = -1 + aJs5Archive_458.method414(-1)
                aJs5Archive_458.method407(0, i_6_)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("iba.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }
}
