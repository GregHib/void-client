import GlTexture1DStatics.method1974
import WorldMapRendererStatics.anInt4675
import WorldMapRendererStatics.anInt4676
import WorldMapRendererStatics.anInt4677
import WorldMapRendererStatics.anInt4678

/* Class240 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WorldMapRenderer internal constructor(mapRegionLoaderThread: MapRegionLoaderThread?, minimapSpriteRenderer: MinimapSpriteRenderer?) : Lifecycle {
    private val aMapRegionLoaderThread_4682: MapRegionLoaderThread?
    private val aMinimapSpriteRenderer_4685: MinimapSpriteRenderer?
    override fun method8(i: Byte): Boolean {
        anInt4678++
        val i_0_ = -50 / ((25 - i) / 52)
        return aMapRegionLoaderThread_4682!!.method2668(-21913)
    }

    override fun method7(i: Int) {
        if (i == 10286) anInt4675++
    }

    override fun method9(i: Byte, bool: Boolean) {
        anInt4676++
        val class295 = aMapRegionLoaderThread_4682!!.method2667(false, aMinimapSpriteRenderer_4685!!.anInt4918)
        if (class295 != null) {
            val i_7_ = ((aMinimapSpriteRenderer_4685.aScreenAnchorAlignment_4922!!.method1607(NpcSpawnDecoder.anInt1524, aMinimapSpriteRenderer_4685.anInt4929, (-118).toByte())) - -aMinimapSpriteRenderer_4685.anInt4924)
            var i_8_ = ((aMinimapSpriteRenderer_4685.aTileRenderState_4925!!.method2679(OpenGlRendererStatics.anInt7666, aMinimapSpriteRenderer_4685.anInt4923, i.toInt() xor 0x60b.inv())) - -aMinimapSpriteRenderer_4685.anInt4920)
            if (aMinimapSpriteRenderer_4685.aBoolean4914) FacingDirectionNodeStatics.aRenderer6654!!.method3628(i_7_, i_8_, aMinimapSpriteRenderer_4685.anInt4929, aMinimapSpriteRenderer_4685.anInt4923, aMinimapSpriteRenderer_4685.anInt4917, 0)
            i_8_ += method1855(5, class295.aString3756, true, NodeDequeStatics.aFont_3326, i_7_, i_8_) * 12
            i_8_ += 8
            if (aMinimapSpriteRenderer_4685.aBoolean4914) FacingDirectionNodeStatics.aRenderer6654!!.method3709(i_7_, i_8_, i_7_ + aMinimapSpriteRenderer_4685.anInt4929 + -1, i_8_, aMinimapSpriteRenderer_4685.anInt4917, 0)
            i_8_ = ++i_8_ + method1855(5, class295.aString3754, true, NodeDequeStatics.aFont_3326, i_7_, i_8_) * 12
            i_8_ += 5
            i_8_ += method1855(5, class295.aString3758, true, NodeDequeStatics.aFont_3326, i_7_, i_8_) * 12
        }
        if (i.toInt() != -49) method8(12.toByte())
    }

    private fun method1855(i: Int, string: String?, bool: Boolean, font: Font?, i_9_: Int, i_10_: Int): Int {
        try {
            if (bool != true) return -62
            anInt4677++
            return (font!!.method2584(null, 0, aMinimapSpriteRenderer_4685!!.anInt4928, null, aMinimapSpriteRenderer_4685.anInt4913, 0, -(i * 2) + aMinimapSpriteRenderer_4685.anInt4923, null, i + i_10_, 0, 0, -(i * 2) + aMinimapSpriteRenderer_4685.anInt4929, i_9_ + i, false, 0, string))
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("ta.A(" + i + ',' + (if (string != null) "{...}" else "null") + ',' + bool + ',' + (if (font != null) "{...}" else "null") + ',' + i_9_ + ',' + i_10_ + ')'))
        }
    }

    init {
        try {
            aMinimapSpriteRenderer_4685 = minimapSpriteRenderer
            aMapRegionLoaderThread_4682 = mapRegionLoaderThread
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("ta.<init>(" + (if (mapRegionLoaderThread != null) "{...}" else "null") + ',' + (if (minimapSpriteRenderer != null) "{...}" else "null") + ')'))
        }
    }
}
