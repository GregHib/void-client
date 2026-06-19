import SceneTilePlaneManager.method259
import ParticleAmountCacheStatics.anInt2841
import ParticleAmountCacheStatics.anInt2843
import ParticleAmountCacheStatics.anInt2846
import ParticleAmountCacheStatics.anInt2847

/* Class217 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleAmountCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_2842: Js5Archive?
    var anInt2845: Int = 0
    private var aLruByteCache_2848: LruByteCache? = LruByteCache(64)

    fun method1587(i: Int, i_0_: Int) {
        if (i_0_ != 3758) aLruByteCache_2848 = null
        synchronized(aLruByteCache_2848!!) {
            aLruByteCache_2848!!.method578(2, i)
        }
        anInt2841++
    }

    fun method1588(i: Int, i_1_: Int): ParticleAmountConfig {
        anInt2847++
        var particleAmountConfig: ParticleAmountConfig?
        synchronized(aLruByteCache_2848!!) {
            particleAmountConfig = aLruByteCache_2848!!.method583(i_1_.toLong(), -126) as ParticleAmountConfig?
        }
        if (particleAmountConfig != null) return particleAmountConfig
        val `is`: ByteArray?
        synchronized(aJs5Archive_2842!!) {
            `is` = aJs5Archive_2842.method410(-1860, 16, i_1_)
            if (i >= -17) aLruByteCache_2848 = null
        }
        particleAmountConfig = ParticleAmountConfig()
        if (`is` != null) particleAmountConfig.method1253(ByteBuffer(`is`), true)
        synchronized(aLruByteCache_2848!!) {
            aLruByteCache_2848!!.method582(particleAmountConfig, i_1_.toLong(), (-124).toByte())
        }
        return particleAmountConfig
    }

    fun method1589(i: Byte) {
        anInt2843++
        synchronized(aLruByteCache_2848!!) {
            aLruByteCache_2848!!.method590(0)
        }
        if (i < 126) method1588(-98, -35)
    }

    fun method1590(i: Int) {
        anInt2846++
        if (i != 0) this.anInt2845 = -97
        synchronized(aLruByteCache_2848!!) {
            aLruByteCache_2848!!.method587(i xor 0x6b.inv())
        }
    }

    init {
        try {
            aJs5Archive_2842 = js5Archive
            if (aJs5Archive_2842 != null) this.anInt2845 = aJs5Archive_2842.method407(0, 16)
            else this.anInt2845 = 0
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("rv.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}
