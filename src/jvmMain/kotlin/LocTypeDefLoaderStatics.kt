import GlTexture1DStatics.method1974

object LocTypeDefLoaderStatics {
    @JvmField
            var anInt2499: Int = 0
            var anInt2500: Int = 0
            var anInt2502: Int = 0
            var anInt2503: Int = 0
            var anInt2504: Int = 0
            var anInt2505: Int = 0
            var anInt2506: Int = 0
            @JvmField
            var aProjectileFactory_2507: ProjectileFactory? = ProjectileFactory(9, 2)
            var anInt2508: Int = 0
            @JvmField
            var anIntArray2509: IntArray? = IntArray(2)
            @JvmField
            var anInt2510: Int = 0
    
            fun method1405(i: Int, bool: Boolean, bool_0_: Boolean) {
                anInt2506++
                val class348_sub13 = method1974(42.toByte(), i, bool)
                if (class348_sub13 != null && bool_0_ == true) {
                    var i_1_ = 0
                    while ((class348_sub13.anIntArray6757!!.size > i_1_)) {
                        class348_sub13.anIntArray6757!![i_1_] = -1
                        class348_sub13.anIntArray6758[i_1_] = 0
                        i_1_++
                    }
                }
            }
    
            @JvmStatic
            fun method1406(bool: Boolean) {
                if (bool == true) {
                    CacheStateResetter.method175((-6).toByte())
                    anInt2505++
                    GrayscaleNoiseTextureStatics.aBoolean5300 = false
                }
            }
    
            @JvmStatic
            fun method1407(i: Byte) {
                val i_2_ = 92 / ((-3 - i) / 60)
                anIntArray2509 = null
                aProjectileFactory_2507 = null
            }
}
