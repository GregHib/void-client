import kotlin.math.max

object SplashImageLoadableStatics {
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
