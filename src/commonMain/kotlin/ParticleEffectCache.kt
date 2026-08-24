/* Class271 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleEffectCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aLruByteCache_3466 = LruByteCache(64)
    private val aJs5Archive_3468: Js5Archive?
    fun method2044(i: Int, i_0_: Int): ConfigShortValueNode {
        anInt3469++
        var class348_sub42_sub7: ConfigShortValueNode? = withLock(aLruByteCache_3466) {
            aLruByteCache_3466.method583(i_0_.toLong(), -85) as ConfigShortValueNode?
        }
        if (class348_sub42_sub7 != null) return class348_sub42_sub7
        val `is`: ByteArray? = withLock(aJs5Archive_3468!!) {
            aJs5Archive_3468.method410(-1860, 5, i_0_)
        }
        class348_sub42_sub7 = ConfigShortValueNode()
        if (i < 78) method2046()
        if (`is` != null) class348_sub42_sub7.method3192(16.toByte(), ByteBuffer(`is`))
        withLock(aLruByteCache_3466) {
            aLruByteCache_3466.method582(class348_sub42_sub7, i_0_.toLong(), (-93).toByte())
        }
        return class348_sub42_sub7
    }

    init {
        try {
            aJs5Archive_3468 = js5Archive
            aJs5Archive_3468!!.method407(0, 5)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("ut.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt3469: Int = 0

        @JvmStatic
        fun method2045(i: Byte) {
            InboundPacketHeader.aInboundPacketHeader_3467 = null
            if (i.toInt() != 62) method2046()
        }

        fun method2046() {
            PlayerSequenceSelector.aSceneObjectSpawner_1208 = PlayerSequenceSelector.aSceneObjectSpawner_1210
        }
    }
}
