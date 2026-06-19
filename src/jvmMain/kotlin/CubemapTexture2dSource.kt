import CubemapTexture2dSourceStatics.anInt8692

/* Class299_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CubemapTexture2dSource internal constructor(private val aHa_Sub2_8693: OpenGlRenderer, private val anInt8689: Int, private val anInt8695: Int, private val anInt8691: Int, private val anInt8690: Int, private val anInt8686: Int, private val anInt8697: Int) : Texture2DProvider() {
    private var aClass258_Sub2_8688: GlTextureCubeMap? = null

    override fun method2256(i: Byte): GlTextureCubeMap? {
        anInt8692++
        if (i.toInt() != -121) method2256(33.toByte())
        if (aClass258_Sub2_8688 == null) {
            val var_d = aHa_Sub2_8693.aRenderConfig4579!!
            CacheLruCacheStatics.anIntArray3883!![3] = anInt8690
            CacheLruCacheStatics.anIntArray3883!![4] = anInt8686
            CacheLruCacheStatics.anIntArray3883!![2] = anInt8691
            CacheLruCacheStatics.anIntArray3883!![5] = anInt8697
            CacheLruCacheStatics.anIntArray3883!![1] = anInt8695
            CacheLruCacheStatics.anIntArray3883!![0] = anInt8689
            var bool = false
            var i_0_ = 0
            for (i_1_ in 0..5) {
                if (!var_d.method4(i.toInt() xor 0x1f68, CacheLruCacheStatics.anIntArray3883!![i_1_])) return null
                val class12 = var_d.method3(CacheLruCacheStatics.anIntArray3883!![i_1_], -6662)
                val i_2_ = if (!class12!!.aBoolean199) 128 else 64
                if (i_0_ < i_2_) i_0_ = i_2_
                if (class12.aByte205 > 0) bool = true
            }
            for (i_3_ in 0..5) TileRenderStateStatics.anIntArrayArray4233!![i_3_] = var_d.method5(false, CacheLruCacheStatics.anIntArray3883!![i_3_], 1.0f, i_0_, i_0_, i + 192)
            aClass258_Sub2_8688 = GlTextureCubeMap(aHa_Sub2_8693, 6407, i_0_, bool, TileRenderStateStatics.anIntArrayArray4233)
        }
        return aClass258_Sub2_8688
    }
}
