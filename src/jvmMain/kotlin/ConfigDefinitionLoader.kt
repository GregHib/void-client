import Texture2DProvider.Companion.method2259

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
        withLock(aLruByteCache_2083) {
            aLruByteCache_2083.method590(0)
        }
        withLock(this.aLruByteCache_2089) {
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
        withLock(aLruByteCache_2083) {
            aLruByteCache_2083.method587(-99)
        }
        anInt2082++
        withLock(this.aLruByteCache_2089) {
            this.aLruByteCache_2089.method587(-78)
        }
    }

    fun method1224(i: Int, i_8_: Byte) {
        withLock(aLruByteCache_2083) {
            if (i_8_ > -95) method1225(-75, (-61).toByte())
            aLruByteCache_2083.method578(2, i)
        }
        anInt2079++
        withLock(this.aLruByteCache_2089) {
            this.aLruByteCache_2089.method578(2, i)
        }
    }

    fun method1225(i: Int, i_9_: Byte): StructConfig? {
        anInt2085++
        var structConfig: StructConfig?
        withLock(aLruByteCache_2083) {
            structConfig = aLruByteCache_2083.method583(i.toLong(), 91) as StructConfig?
        }
        if (structConfig != null) return structConfig
        if (i_9_ < 36) return null
        val `is`: ByteArray?
        withLock(aJs5Archive_2084!!) {
            `is` = aJs5Archive_2084.method410(-1860, 36, i)
        }
        structConfig = StructConfig()
        structConfig.aConfigDefinitionLoader_593 = this
        structConfig.anInt581 = i
        if (`is` != null) structConfig.method379(ByteBuffer(`is`), 109)
        structConfig.method372(-25359)
        withLock(aLruByteCache_2083) {
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
            throw SoundBankPatch.method2929(runtimeexception, ("on.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_10_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2079: Int = 0
        var anInt2080: Int = 0
        var anInt2081: Int = 0
        var anInt2082: Int = 0
        var anInt2085: Int = 0
        var anInt2086: Int = 0
        var anInt2088: Int = 0
        fun method1221(i: Int, i_3_: Int, i_4_: Int): Boolean {
            if (i != -3157) return false
            anInt2088++
            return method2259(0, i_4_, i_3_) or ((i_3_ and 0x70000) != 0) || ParticleEmitterDef.method2187(i_3_, -79, i_4_)
        }

        fun method1223(i: Int, i_5_: Int, i_6_: Int, boundsConstraintEntry: BoundsConstraintEntry): MinimapAreaMarkerNode? {
            anInt2086++
            var i_7_ = boundsConstraintEntry.anInt5167 or (i shl 10)
            var class348_sub42_sub19 = (ImageFrameCache.aCacheLruCache_4036!!.method2302(i_7_.toLong() shl 16, (-91).toByte()) as MinimapAreaMarkerNode?)
            if (class348_sub42_sub19 != null) return class348_sub42_sub19
            var `is` = (CameraNodeList.aJs5Archive_1743!!.method415(73.toByte(), CameraNodeList.aJs5Archive_1743!!.method423(i_7_, (-90).toByte())))
            if (`is` != null) {
                if (`is`.size <= 1) return null
                try {
                    class348_sub42_sub19 = SceneEntityModel.method2502(`is`, -85)
                } catch (exception: Exception) {
                    throw RuntimeException(exception.message + " S: " + i_7_)
                }
                class348_sub42_sub19!!.aBoundsConstraintEntry_9691 = boundsConstraintEntry
                ImageFrameCache.aCacheLruCache_4036!!.method2305(i_7_.toLong() shl 16, class348_sub42_sub19, -1)
                return class348_sub42_sub19
            }
            i_7_ = boundsConstraintEntry.anInt5167 or (65536 + i_5_ shl 10)
            class348_sub42_sub19 = (ImageFrameCache.aCacheLruCache_4036!!.method2302(i_7_.toLong() shl 16, (-31).toByte()) as MinimapAreaMarkerNode?)
            if (class348_sub42_sub19 != null) return class348_sub42_sub19
            `is` = (CameraNodeList.aJs5Archive_1743!!.method415(73.toByte(), CameraNodeList.aJs5Archive_1743!!.method423(i_7_, (-107).toByte())))
            if (`is` != null) {
                if (`is`.size <= 1) return null
                try {
                    class348_sub42_sub19 = SceneEntityModel.method2502(`is`, -101)
                } catch (exception: Exception) {
                    throw RuntimeException(exception.message + " S: " + i_7_)
                }
                class348_sub42_sub19!!.aBoundsConstraintEntry_9691 = boundsConstraintEntry
                ImageFrameCache.aCacheLruCache_4036!!.method2305(i_7_.toLong() shl 16, class348_sub42_sub19, -1)
                return class348_sub42_sub19
            }
            i_7_ = boundsConstraintEntry.anInt5167 or 0x3fffc00
            class348_sub42_sub19 = (ImageFrameCache.aCacheLruCache_4036!!.method2302(i_7_.toLong() shl 16, (-107).toByte()) as MinimapAreaMarkerNode?)
            if (class348_sub42_sub19 != null) return class348_sub42_sub19
            `is` = (CameraNodeList.aJs5Archive_1743!!.method415(73.toByte(), CameraNodeList.aJs5Archive_1743!!.method423(i_7_, 104.toByte())))
            if (`is` != null) {
                if (`is`.size <= 1) return null
                try {
                    class348_sub42_sub19 = SceneEntityModel.method2502(`is`, -110)
                } catch (exception: Exception) {
                    throw RuntimeException(exception.message + " S: " + i_7_)
                }
                class348_sub42_sub19!!.aBoundsConstraintEntry_9691 = boundsConstraintEntry
                ImageFrameCache.aCacheLruCache_4036!!.method2305(i_7_.toLong() shl 16, class348_sub42_sub19, -1)
                return class348_sub42_sub19
            }
            if (i_6_ != 96837648) return null
            return null
        }
    }
}
