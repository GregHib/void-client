import kotlin.math.max

/* Class265 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SplashImageLoadable internal constructor(js5Archive: Js5Archive?, configValueProvider: ConfigValueProvider?) : Lifecycle {
    private val aConfigValueProvider_4687: ConfigValueProvider?
    private var aAbstractModelRenderer_4688: AbstractModelRenderer? = null
    private val aJs5Archive_4694: Js5Archive?
    override fun method7(i: Int) {
        aAbstractModelRenderer_4688 = WorldMapPolygonIconLabel.method3577((aConfigValueProvider_4687!!.anInt4912), 116.toByte(), aJs5Archive_4694!!)
        if (i != 10286) aBooleanArrayArray4693 = null
        anInt4695++
    }

    override fun method9(i: Byte, bool: Boolean) {
        anInt4696++
        if (bool) {
            val i_0_ = (max(LocTypeDefinition.anInt4017, NpcSpawnDecoder.anInt1524))
            val i_1_ = (max(GameDisplayManager.anInt10432, OpenGlRenderer.anInt7666))
            val i_2_ = aAbstractModelRenderer_4688!!.method966()
            val i_3_ = aAbstractModelRenderer_4688!!.method980()
            var i_4_ = 0
            var i_5_ = i_0_
            var i_6_ = i_0_ * i_3_ / i_2_
            var i_7_ = (i_1_ + -i_6_) / 2
            if (i_1_ < i_6_) {
                i_6_ = i_1_
                i_5_ = i_1_ * i_2_ / i_3_
                i_7_ = 0
                i_4_ = (i_0_ - i_5_) / 2
            }
            aAbstractModelRenderer_4688!!.method973(i_4_, i_7_, i_5_, i_6_)
        }
    }

    init {
        try {
            aJs5Archive_4694 = js5Archive
            aConfigValueProvider_4687 = configValueProvider
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("uk.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (configValueProvider != null) "{...}" else "null") + ')'))
        }
    }

    override fun method8(i: Byte): Boolean {
        val i_8_ = -105 % ((25 - i) / 52)
        anInt4690++
        return aJs5Archive_4694!!.method421(false, aConfigValueProvider_4687!!.anInt4912)
    }

    companion object {
        var aRgbColorPalette_4689: RgbColorPalette? = RgbColorPalette(2, 4)
        var anInt4690: Int = 0
        var anInt4691: Int = 0
        @JvmField
        var anIntArray4692: IntArray? = null
        var aBooleanArrayArray4693: Array<BooleanArray?>? =
            arrayOf<BooleanArray?>(BooleanArray(4), BooleanArray(4), booleanArrayOf(false, false, true, false), booleanArrayOf(false, false, true, false), booleanArrayOf(false, false, true, false), booleanArrayOf(false, false, true, false), booleanArrayOf(true, false, true, false), booleanArrayOf(true, false, false, true), booleanArrayOf(true, false, false, true), BooleanArray(4), BooleanArray(4), BooleanArray(4), BooleanArray(4))
        var anInt4695: Int = 0
        var anInt4696: Int = 0

        fun method2022(class348_sub49: ByteBuffer, i: Int): MinimapSquareDrawer? {
            if (i != 0) return null
            anInt4691++
            return MinimapSquareDrawer(class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(i + 13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255))
        }

        @JvmStatic
        fun method2023(i: Byte) {
            if (i > -13) aRgbColorPalette_4689 = null
            aRgbColorPalette_4689 = null
            anIntArray4692 = null
            aBooleanArrayArray4693 = null
        }
    }
}
