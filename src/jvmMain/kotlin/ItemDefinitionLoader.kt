import SceneTilePlaneManager.method260
import java.io.File
import ItemDefinitionLoaderStatics.method1286
import ItemDefinitionLoaderStatics.anInt2178
import ItemDefinitionLoaderStatics.anInt2182
import ItemDefinitionLoaderStatics.aIntRange_2183
import ItemDefinitionLoaderStatics.anInt2184
import ItemDefinitionLoaderStatics.anInt2189

/*
 * Class166
 */
class ItemDefinitionLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_9_: Js5Archive?) {
    @JvmField
    var aJs5Archive_2180: Js5Archive? = null
    private val aLruByteCache_2185 = LruByteCache(64)
    private val aJs5Archive_2188: Js5Archive?
    @JvmField
    var aLruByteCache_2190: LruByteCache? = LruByteCache(2)

    fun method1283(i: Int) {
        synchronized(aLruByteCache_2185) {
            aLruByteCache_2185.method587(-76)
        }
        anInt2178++
        synchronized(this.aLruByteCache_2190!!) {
            this.aLruByteCache_2190!!.method587(-110)
        }
        if (i != 1) method1286(null, -124, null)
    }

    fun method1285(i: Int, i_0_: Int) {
        anInt2189++
        synchronized(aLruByteCache_2185) {
            aLruByteCache_2185.method578(2, i)
        }
        synchronized(this.aLruByteCache_2190!!) {
            if (i_0_ != 8) this.aJs5Archive_2180 = null
            this.aLruByteCache_2190!!.method578(i_0_ + -6, i)
        }
    }

    fun method1287(i: Byte, i_1_: Int): UnderlayDefinition {
        anInt2182++
        var underlayDefinition: UnderlayDefinition?
        synchronized(aLruByteCache_2185) {
            underlayDefinition = aLruByteCache_2185.method583(i_1_.toLong(), i.toInt() xor 0x1d.inv()) as? UnderlayDefinition?
        }
        if (underlayDefinition != null) return underlayDefinition
        if (i.toInt() != -104) this.aLruByteCache_2190 = null
        val `is`: ByteArray?
        synchronized(aJs5Archive_2188!!) {
            `is` = aJs5Archive_2188.method410(-1860, 33, i_1_)
        }
        underlayDefinition = UnderlayDefinition()
        underlayDefinition.aItemDefinitionLoader_2886 = this
        if (`is` != null) underlayDefinition.method1611(ByteBuffer(`is`), false)
        synchronized(aLruByteCache_2185) {
            aLruByteCache_2185.method582(underlayDefinition, i_1_.toLong(), (-116).toByte())
        }
        return underlayDefinition
    }

    fun method1290(i: Int) {
        anInt2184++
        synchronized(aLruByteCache_2185) {
            aLruByteCache_2185.method590(0)
        }
        synchronized(this.aLruByteCache_2190!!) {
            this.aLruByteCache_2190!!.method590(0)
            if (i != -8) aIntRange_2183 = null
        }
    }

    init {
        try {
            aJs5Archive_2188 = js5Archive
            this.aJs5Archive_2180 = js5Archive_9_
            aJs5Archive_2188!!.method407(0, 33)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("pg.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_9_ != null) "{...}" else "null") + ')'))
        }
    }
}
