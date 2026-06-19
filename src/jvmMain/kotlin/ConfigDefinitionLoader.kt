import Texture2DProviderStatics.method2259
import ConfigDefinitionLoaderStatics.anInt2079
import ConfigDefinitionLoaderStatics.anInt2080
import ConfigDefinitionLoaderStatics.anInt2081
import ConfigDefinitionLoaderStatics.anInt2082
import ConfigDefinitionLoaderStatics.anInt2085

/* Class153 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ConfigDefinitionLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_10_: Js5Archive?) {
    private var aLruByteCache_2083 = LruByteCache(128)
    private val aJs5Archive_2084: Js5Archive?
    var aJs5Archive_2087: Js5Archive? = null
    var aLruByteCache_2089: LruByteCache = LruByteCache(64)

    fun method1219(i: Int) {
        anInt2080++
        synchronized(aLruByteCache_2083) {
            aLruByteCache_2083.method590(0)
        }
        synchronized(this.aLruByteCache_2089) {
            if (i != 7851) {
                /* empty */
            } else this.aLruByteCache_2089.method590(i + -7851)
        }
    }

    fun method1220(i: Byte, i_0_: Int, i_1_: Int) {
        anInt2081++
        aLruByteCache_2083 = LruByteCache(i_1_)
        this.aLruByteCache_2089 = LruByteCache(i_0_)
        val i_2_ = 11 / ((i - -46) / 43)
    }

    fun method1222(bool: Boolean) {
        if (bool != true) method1222(false)
        synchronized(aLruByteCache_2083) {
            aLruByteCache_2083.method587(-99)
        }
        anInt2082++
        synchronized(this.aLruByteCache_2089) {
            this.aLruByteCache_2089.method587(-78)
        }
    }

    fun method1224(i: Int, i_8_: Byte) {
        synchronized(aLruByteCache_2083) {
            if (i_8_ > -95) method1225(-75, (-61).toByte())
            aLruByteCache_2083.method578(2, i)
        }
        anInt2079++
        synchronized(this.aLruByteCache_2089) {
            this.aLruByteCache_2089.method578(2, i)
        }
    }

    fun method1225(i: Int, i_9_: Byte): StructConfig? {
        anInt2085++
        var structConfig: StructConfig?
        synchronized(aLruByteCache_2083) {
            structConfig = aLruByteCache_2083.method583(i.toLong(), 91) as StructConfig?
        }
        if (structConfig != null) return structConfig
        if (i_9_ < 36) return null
        val `is`: ByteArray?
        synchronized(aJs5Archive_2084!!) {
            `is` = aJs5Archive_2084.method410(-1860, 36, i)
        }
        structConfig = StructConfig()
        structConfig.aConfigDefinitionLoader_593 = this
        structConfig.anInt581 = i
        if (`is` != null) structConfig.method379(ByteBuffer(`is`), 109)
        structConfig.method372(-25359)
        synchronized(aLruByteCache_2083) {
            aLruByteCache_2083.method582(structConfig, i.toLong(), (-106).toByte())
        }
        return structConfig
    }

    init {
        try {
            aJs5Archive_2084 = js5Archive
            this.aJs5Archive_2087 = js5Archive_10_
            aJs5Archive_2084!!.method407(0, 36)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("on.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_10_ != null) "{...}" else "null") + ')'))
        }
    }
}
