import Texture2DProviderStatics.method2259

object ConfigDefinitionLoaderStatics {
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
                return method2259(0, i_4_, i_3_) or ((i_3_ and 0x70000) != 0) || ParticleEmitterDefStatics.method2187(i_3_, -79, i_4_)
            }
    
            fun method1223(i: Int, i_5_: Int, i_6_: Int, boundsConstraintEntry: BoundsConstraintEntry): MinimapAreaMarkerNode? {
                anInt2086++
                var i_7_ = boundsConstraintEntry.anInt5167 or (i shl 10)
                var class348_sub42_sub19 = (ImageFrameCacheStatics.aCacheLruCache_4036!!.method2302(i_7_.toLong() shl 16, (-91).toByte()) as MinimapAreaMarkerNode?)
                if (class348_sub42_sub19 != null) return class348_sub42_sub19
                var `is` = (CameraNodeListStatics.aJs5Archive_1743!!.method415(73.toByte(), CameraNodeListStatics.aJs5Archive_1743!!.method423(i_7_, (-90).toByte())))
                if (`is` != null) {
                    if (`is`.size <= 1) return null
                    try {
                        class348_sub42_sub19 = SceneEntityModelStatics.method2502(`is`, -85)
                    } catch (exception: Exception) {
                        throw RuntimeException(exception.message + " S: " + i_7_)
                    }
                    class348_sub42_sub19!!.aBoundsConstraintEntry_9691 = boundsConstraintEntry
                    ImageFrameCacheStatics.aCacheLruCache_4036!!.method2305(i_7_.toLong() shl 16, class348_sub42_sub19, -1)
                    return class348_sub42_sub19
                }
                i_7_ = boundsConstraintEntry.anInt5167 or (65536 + i_5_ shl 10)
                class348_sub42_sub19 = (ImageFrameCacheStatics.aCacheLruCache_4036!!.method2302(i_7_.toLong() shl 16, (-31).toByte()) as MinimapAreaMarkerNode?)
                if (class348_sub42_sub19 != null) return class348_sub42_sub19
                `is` = (CameraNodeListStatics.aJs5Archive_1743!!.method415(73.toByte(), CameraNodeListStatics.aJs5Archive_1743!!.method423(i_7_, (-107).toByte())))
                if (`is` != null) {
                    if (`is`.size <= 1) return null
                    try {
                        class348_sub42_sub19 = SceneEntityModelStatics.method2502(`is`, -101)
                    } catch (exception: Exception) {
                        throw RuntimeException(exception.message + " S: " + i_7_)
                    }
                    class348_sub42_sub19!!.aBoundsConstraintEntry_9691 = boundsConstraintEntry
                    ImageFrameCacheStatics.aCacheLruCache_4036!!.method2305(i_7_.toLong() shl 16, class348_sub42_sub19, -1)
                    return class348_sub42_sub19
                }
                i_7_ = boundsConstraintEntry.anInt5167 or 0x3fffc00
                class348_sub42_sub19 = (ImageFrameCacheStatics.aCacheLruCache_4036!!.method2302(i_7_.toLong() shl 16, (-107).toByte()) as MinimapAreaMarkerNode?)
                if (class348_sub42_sub19 != null) return class348_sub42_sub19
                `is` = (CameraNodeListStatics.aJs5Archive_1743!!.method415(73.toByte(), CameraNodeListStatics.aJs5Archive_1743!!.method423(i_7_, 104.toByte())))
                if (`is` != null) {
                    if (`is`.size <= 1) return null
                    try {
                        class348_sub42_sub19 = SceneEntityModelStatics.method2502(`is`, -110)
                    } catch (exception: Exception) {
                        throw RuntimeException(exception.message + " S: " + i_7_)
                    }
                    class348_sub42_sub19!!.aBoundsConstraintEntry_9691 = boundsConstraintEntry
                    ImageFrameCacheStatics.aCacheLruCache_4036!!.method2305(i_7_.toLong() shl 16, class348_sub42_sub19, -1)
                    return class348_sub42_sub19
                }
                if (i_6_ != 96837648) return null
                return null
            }
}
