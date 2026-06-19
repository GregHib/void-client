
/* Class125 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapSpriteRenderer internal constructor(i: Int, screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, bool: Boolean) : ConfigTypeProvider {
    @JvmField
    var anInt4913: Int = 0
    @JvmField
    var aBoolean4914: Boolean = false
    @JvmField
    var anInt4917: Int = 0
    @JvmField
    var anInt4918: Int = 0
    @JvmField
    var anInt4920: Int = 0
    @JvmField
    var aScreenAnchorAlignment_4922: ScreenAnchorAlignment? = null
    @JvmField
    var anInt4923: Int = 0
    @JvmField
    var anInt4924: Int = 0
    @JvmField
    var aTileRenderState_4925: TileRenderState? = null
    @JvmField
    var anInt4928: Int = 0
    @JvmField
    var anInt4929: Int = 0
    override fun method51(i: Byte): ProjectileFactory? {
        if (i <= 116) return null
        anInt4927++
        return MatrixCameraTransform.aProjectileFactory_5689
    }

    init {
        try {
            this.aBoolean4914 = bool
            this.anInt4923 = i_15_
            this.anInt4918 = i
            this.anInt4924 = i_12_
            this.anInt4913 = i_16_
            this.anInt4929 = i_14_
            this.anInt4920 = i_13_
            this.anInt4917 = i_18_
            this.aTileRenderState_4925 = tileRenderState
            this.anInt4928 = i_17_
            this.aScreenAnchorAlignment_4922 = screenAnchorAlignment
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("nha.<init>(" + i + ',' + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + bool + ')'))
        }
    }

    companion object {
        @JvmField
        var aHashtable_4915: Hashtable?
        @JvmField
        var anInt4916: Int = 0
        var anInt4919: Int = 0
        @JvmField
        var aSystemFontGlyphs_4921: SystemFontGlyphs? = null
        @JvmField
        var anInt4926: Int = 0
        @JvmField
        var anInt4927: Int = 0
        @JvmField
        var anInt4930: Int = 0

        @JvmStatic
        fun method1109(i: Byte) {
            aSystemFontGlyphs_4921 = null
            if (i.toInt() != -22) method1111(127, -73, -7, -77, -85, 79)
            aHashtable_4915 = null
        }

        fun method1110(i: Int, i_0_: Int, i_1_: Int, i_2_: Byte, i_3_: Int): Boolean {
            anInt4916++
            if (!ActorEntity.aBoolean9307 || !ActorEntity.aBoolean351) return false
            if (ActorEntity.anInt2946 < 100) return false
            if (!ActorEntity.method164(i_1_, i_3_, (-97).toByte(), i)) return false
            val i_4_ = i_3_ shl ActorEntity.anInt4459
            val i_5_ = i shl ActorEntity.anInt4459
            if (i_2_.toInt() != -79) anInt4919 = 64
            if (ActorEntity.method1084(i_0_, ActorEntity.anInt3465, i_5_, i_4_, ActorEntity.aTerrainTileArray5191!![i_1_]!!.method3982((-86).toByte(), i, i_3_), ActorEntity.anInt3465, 18507)) {
                SourceRowTextureNode.anInt9112++
                return true
            }
            return false
        }

        fun method1111(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int) {
            var i_11_ = i_9_
            while (i >= i_11_) {
                GlElementArrayBuffer.method1156(-27, i_7_, WidgetDefinition.anIntArrayArray255!![i_11_]!!, i_8_, i_10_)
                i_11_++
            }
            if (i_6_ != 0) anInt4930 = 29
            anInt4926++
        }

        init {
            aHashtable_4915 = Hashtable(8)
        }
    }
}
