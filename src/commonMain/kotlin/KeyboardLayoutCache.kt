/* Class259 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class KeyboardLayoutCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_3299: Js5Archive?
    private val aLruByteCache_3303 = LruByteCache(64)
    var anInt3305: Int = 0
    fun method1976(i: Int, i_1_: Int): KeyboardLayoutConfig {
        anInt3302++
        var keyboardLayoutConfig: KeyboardLayoutConfig? = withLock(aLruByteCache_3303) {
            aLruByteCache_3303.method583(i.toLong(), -51) as KeyboardLayoutConfig?
        }
        if (keyboardLayoutConfig != null) return keyboardLayoutConfig
        val i_2_ = 44 % ((-41 - i_1_) / 33)
        val `is`: ByteArray? = withLock(aJs5Archive_3299!!) {
            aJs5Archive_3299.method410(-1860, 19, i)
        }
        keyboardLayoutConfig = KeyboardLayoutConfig()
        if (`is` != null) keyboardLayoutConfig.method1255(ByteBuffer(`is`), -1)
        withLock(aLruByteCache_3303) {
            aLruByteCache_3303.method582(keyboardLayoutConfig, i.toLong(), (-120).toByte())
        }
        return keyboardLayoutConfig
    }

    init {
        try {
            aJs5Archive_3299 = js5Archive
            this.anInt3305 = aJs5Archive_3299!!.method407(0, 19)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("uea.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var aByteArray3300: ByteArray? = ByteArray(2048)

        var aLruByteCache_3301: LruByteCache? = LruByteCache(30)
        var anInt3302: Int = 0

        var aParticleSystemRenderer_3304: ParticleSystemRenderer? = null

        var anInt3306: Int = 0

        @JvmStatic
        fun method1975(i: Byte) {
            aLruByteCache_3301 = null
            val i_0_ = -54 / ((i - 77) / 37)
            aParticleSystemRenderer_3304 = null
            aByteArray3300 = null
        }
    }
}
