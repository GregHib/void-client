object TextureDefinitionCacheStatics {
    @JvmField
            var aHashtable_2959: Hashtable? = Hashtable(512)
            var anInt2962: Int = 0
            var anInt2963: Int = 0
            @JvmField
            var anInt2964: Int = 64
            @JvmStatic
            fun method1624(i: Int) {
                aHashtable_2959 = null
                if (i != 28962) aHashtable_2959 = null
            }
    
            @JvmStatic
            fun method1626(i: Int, bool: Boolean) {
                anInt2962++
                var i_1_ = NoOpGraphicsOptionStateStatics.anInt6043
                var i_2_ = AnimationFrameDefinitionStatics.anInt6964
                if (i == 1) {
                    if (bool && ParticleSystemRendererStatics.aBoolean3870) {
                        i_1_ = i_1_ shl 1
                        i_2_ = -i_1_
                    }
                    FacingDirectionNodeStatics.aRenderer6654!!.f(i_2_, i_1_)
                }
            }
}
