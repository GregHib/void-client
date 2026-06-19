object KeyboardLayoutCacheStatics {
    @JvmField
            var aByteArray3300: ByteArray? = ByteArray(2048)
            @JvmField
            var aLruByteCache_3301: LruByteCache? = LruByteCache(30)
            var anInt3302: Int = 0
            @JvmField
            var aParticleSystemRenderer_3304: ParticleSystemRenderer? = null
            @JvmField
            var anInt3306: Int = 0
    
            @JvmStatic
            fun method1975(i: Byte) {
                aLruByteCache_3301 = null
                val i_0_ = -54 / ((i - 77) / 37)
                aParticleSystemRenderer_3304 = null
                aByteArray3300 = null
            }
}
