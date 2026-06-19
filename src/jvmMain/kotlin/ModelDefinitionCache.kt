import kotlin.math.max
import ModelDefinitionCacheStatics.anInt2863
import ModelDefinitionCacheStatics.anInt2865
import ModelDefinitionCacheStatics.anInt2870
import ModelDefinitionCacheStatics.anInt2874

/* Class219 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ModelDefinitionCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_17_: Js5Archive?) {
    var aLruByteCache_2862: LruByteCache = LruByteCache(20)
    private val aJs5Archive_2866: Js5Archive?
    var aJs5Archive_2873: Js5Archive? = null
    private val aLruByteCache_2875 = LruByteCache(64)

    fun method1598(i: Int) {
        anInt2863++
        synchronized(aLruByteCache_2875) {
            aLruByteCache_2875.method587(-103)
        }
        synchronized(this.aLruByteCache_2862) {
            if (i <= 42) method1598(36)
            this.aLruByteCache_2862.method587(-126)
        }
    }

    fun method1601(i: Int, i_15_: Int): ItemModelDefinition {
        anInt2874++
        var itemModelDefinition: ItemModelDefinition?
        synchronized(aLruByteCache_2875) {
            itemModelDefinition = aLruByteCache_2875.method583(i_15_.toLong(), i + -148) as ItemModelDefinition?
        }
        if (itemModelDefinition != null) return itemModelDefinition
        val `is`: ByteArray?
        synchronized(aJs5Archive_2866!!) {
            `is` = aJs5Archive_2866.method410(-1860, i, i_15_)
        }
        itemModelDefinition = ItemModelDefinition()
        itemModelDefinition.aModelDefinitionCache_438 = this
        if (`is` != null) itemModelDefinition.method332(i xor 0x55.inv(), ByteBuffer(`is`))
        synchronized(aLruByteCache_2875) {
            aLruByteCache_2875.method582(itemModelDefinition, i_15_.toLong(), (-109).toByte())
        }
        return itemModelDefinition
    }

    fun method1602(i: Int) {
        synchronized(aLruByteCache_2875) {
            aLruByteCache_2875.method590(i)
        }
        anInt2865++
        synchronized(this.aLruByteCache_2862) {
            this.aLruByteCache_2862.method590(0)
        }
    }

    fun method1603(i: Int, i_16_: Int) {
        anInt2870++
        synchronized(aLruByteCache_2875) {
            aLruByteCache_2875.method578(2, i)
            if (i_16_ >= -22) this.aJs5Archive_2873 = null
        }
        synchronized(this.aLruByteCache_2862) {
            this.aLruByteCache_2862.method578(2, i)
        }
    }

    init {
        try {
            this.aJs5Archive_2873 = js5Archive_17_
            aJs5Archive_2866 = js5Archive
            aJs5Archive_2866!!.method407(0, 46)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("sb.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_17_ != null) "{...}" else "null") + ')'))
        }
    }
}
