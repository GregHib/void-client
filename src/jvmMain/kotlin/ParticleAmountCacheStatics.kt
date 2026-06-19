import SceneTilePlaneManager.method259

object ParticleAmountCacheStatics {
    var anInt2840: Int = 0
            var anInt2841: Int = 0
            var anInt2843: Int = 0
            var aLruByteCache_2844: LruByteCache? = LruByteCache(64)
            var anInt2846: Int = 0
            var anInt2847: Int = 0
            @JvmStatic
            fun method1585(i: Int) {
                if (i != -1) method1585(-34)
                aLruByteCache_2844 = null
            }
    
            fun method1586(bool: Boolean, i: Byte, string: String?) {
                if (i >= -51) aLruByteCache_2844 = null
                anInt2840++
                method259(-1, 113, bool, string, -1)
            }
}
