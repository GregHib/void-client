import ConfigFlagUtil.Companion.method1915

/* Class354 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TextureCache internal constructor(var_ha_Sub2: OpenGlRenderer?, var_renderConfig: RenderConfig?) {
    private val aHa_Sub2_4355: OpenGlRenderer?
    private val aRenderConfig4359: RenderConfig?
    private var aLruByteCache_4361: LruByteCache? = LruByteCache(256)

    fun method3463(i: Byte) {
        anInt4360++
        aLruByteCache_4361!!.method590(0)
        if (i.toInt() != -110) aLruByteCache_4361 = null
    }

    fun method3467(i: Int, i_4_: Int): GlTexture2D? {
        anInt4357++
        val `object` = aLruByteCache_4361!!.method583(i.toLong(), -127)
        if (`object` != null) return `object` as GlTexture2D
        if (!aRenderConfig4359!!.method4(-7953, i)) return null
        val class12 = aRenderConfig4359.method3(i, -6662)
        val i_5_ = (if (!class12!!.aBoolean199) aHa_Sub2_4355!!.anInt7712 else 64)
        val class258_sub3: GlTexture2D?
        if (class12.aBoolean218 && aHa_Sub2_4355!!.method3666()) {
            val fs = aRenderConfig4359.method1(i_5_, 0.7f, false, -30824, i_5_, i)
            class258_sub3 = GlTexture2D(aHa_Sub2_4355, 3553, 34842, i_5_, i_5_, class12.aByte205.toInt() != 0, fs!!, 6408)
        } else {
            val `is`: IntArray?
            if (class12.anInt200 == 2 || !method1915(4.toByte(), class12.aByte213.toInt())) `is` = aRenderConfig4359.method6(-21540, i_5_, 0.7f, i, false, i_5_)
            else `is` = aRenderConfig4359.method5(true, i, 0.7f, i_5_, i_5_, i_4_ + -196)
            class258_sub3 = GlTexture2D(aHa_Sub2_4355!!, 3553, 6408, i_5_, i_5_, class12.aByte205.toInt() != 0, `is`, 0, 0, false)
        }
        class258_sub3.method1965(class12.aBoolean215, class12.aBoolean217, 10243)
        if (i_4_ != 256) method3466(22)
        aLruByteCache_4361!!.method582(class258_sub3, i.toLong(), (-114).toByte())
        return class258_sub3
    }

    fun method3469(i: Int) {
        if (i == 8218) {
            anInt4353++
            aLruByteCache_4361!!.method578(2, 5)
        }
    }

    init {
        try {
            aHa_Sub2_4355 = var_ha_Sub2
            aRenderConfig4359 = var_renderConfig
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("eo.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (var_renderConfig != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt4352: Int = 0
        var anInt4353: Int = 0
        var anIntArrayArrayArray4356: Array<Array<IntArray?>?>? = null
        var anInt4357: Int = 0
        var anInt4358: Int = 0
        var anInt4360: Int = 0


        fun method3465(i: Int, i_0_: Int, mapTileShape: MapTileShape): Boolean {
            anInt4358++
            SourceRowTextureNode.aAbstractCameraTransform_9114!!.method897(mapTileShape.anIntArray4187!![i], mapTileShape.anIntArray4191[i], mapTileShape.anIntArray4184[i], SequencedWallEntity.anIntArray10172!!)
            val i_1_ = SequencedWallEntity.anIntArray10172!![2]
            if (i_1_ < 50) return false
            mapTileShape.aShortArray4194!![i] = (CollisionFlagQuery.anInt1202 + (SequencedWallEntity.anIntArray10172!![0] * ScreenBorderFiller.anInt1962 / i_1_)).toShort()
            mapTileShape.aShortArray4183!![i] = ((GlIndexBufferArb.anInt8498 * SequencedWallEntity.anIntArray10172!![i_0_] / i_1_) + CipheredPacketBuffer.anInt9759).toShort()
            mapTileShape.aShortArray4188!![i] = i_1_.toShort()
            return true
        }

        @JvmStatic
        fun method3466(i: Int) {
            val i_2_ = 22 / ((-2 - i) / 52)
            anInt4352++
            for (i_3_ in 0..99) OpenGlModel.aBooleanArray2076!![i_3_] = true
        }

        @JvmStatic
        fun method3468(i: Int) {
            anIntArrayArrayArray4356 = null
            if (i != -1401) anIntArrayArrayArray4356 = null
        }
    }
}
