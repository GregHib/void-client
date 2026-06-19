import WidgetDefinitionStatics.method268
import LocDefinitionCacheStatics.method2035
import LocDefinitionCacheStatics.anInt3431
import LocDefinitionCacheStatics.anInt3434
import LocDefinitionCacheStatics.anInt3436
import LocDefinitionCacheStatics.aShortArray3437
import LocDefinitionCacheStatics.anInt3440

/* Class268 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LocDefinitionCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    var anInt3429: Int = 0
    private val aLruByteCache_3433 = LruByteCache(64)
    private val aJs5Archive_3442: Js5Archive?
    @JvmField
    var anInt3447: Int = 0
    fun method2032(i: Int, i_3_: Int) {
        synchronized(aLruByteCache_3433) {
            aLruByteCache_3433.method578(2, i)
            if (i_3_ > -10) method2035(116, 38)
        }
        anInt3436++
    }

    fun method2033(i: Byte) {
        anInt3434++
        synchronized(aLruByteCache_3433) {
            if (i.toInt() != 46) method2037(-66)
            aLruByteCache_3433.method587(-94)
        }
    }

    fun method2034(i: Int, bool: Boolean): LocTypeConfig {
        if (bool != false) aShortArray3437 = null
        anInt3431++
        var locTypeConfig: LocTypeConfig?
        synchronized(aLruByteCache_3433) {
            locTypeConfig = aLruByteCache_3433.method583(i.toLong(), 64) as LocTypeConfig?
        }
        if (locTypeConfig != null) return locTypeConfig
        val `is`: ByteArray?
        synchronized(aJs5Archive_3442!!) {
            `is` = aJs5Archive_3442.method410(-1860, 4, i)
        }
        locTypeConfig = LocTypeConfig()
        locTypeConfig.anInt3573 = i
        locTypeConfig.aLocDefinitionCache_3562 = this
        if (`is` != null) locTypeConfig.method2070(true, ByteBuffer(`is`))
        locTypeConfig.method2067(-4860)
        synchronized(aLruByteCache_3433) {
            aLruByteCache_3433.method582(locTypeConfig, i.toLong(), (-111).toByte())
        }
        return locTypeConfig
    }

    fun method2037(i: Int) {
        synchronized(aLruByteCache_3433) {
            aLruByteCache_3433.method590(0)
        }
        anInt3440++
    }

    init {
        try {
            aJs5Archive_3442 = js5Archive
            this.anInt3429 = aJs5Archive_3442!!.method407(0, 4)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("cb.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}
