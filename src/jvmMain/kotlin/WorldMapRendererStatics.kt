import GlTexture1DStatics.method1974

object WorldMapRendererStatics {
    @JvmField
            var aSystemFontGlyphs_4672: SystemFontGlyphs? = null
            var aFloat4673: Float = 0f
            @JvmField
            var anInt4674: Int = 0
            var anInt4675: Int = 0
            var anInt4676: Int = 0
            var anInt4677: Int = 0
            var anInt4678: Int = 0
            @JvmField
            var aAbstractModelRendererArray4679: Array<AbstractModelRenderer?>? = null
            var anInt4680: Int = 0
            var anInt4681: Int = 0
            var aLong4683: Long = 0
            var aFont_4684: Font? = null
            @JvmField
            var anInt4686: Int = 0
    
            fun method1852(i: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
                val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_1_]!![i_2_]
                if (class357 != null) {
                    val class318_sub1_sub5 = class357.aClass318_Sub1_Sub5_4395
                    val class318_sub1_sub5_4_ = class357.aClass318_Sub1_Sub5_4407
                    if (class318_sub1_sub5 != null) {
                        class318_sub1_sub5.aShort8781 = ((class318_sub1_sub5.aShort8781) * i_3_ / (16 shl Tooltip.anInt4459 - 7)).toShort()
                        class318_sub1_sub5.aShort8769 = ((class318_sub1_sub5.aShort8769) * i_3_ / (16 shl Tooltip.anInt4459 - 7)).toShort()
                    }
                    if (class318_sub1_sub5_4_ != null) {
                        class318_sub1_sub5_4_.aShort8781 = ((class318_sub1_sub5_4_.aShort8781) * i_3_ / (16 shl Tooltip.anInt4459 - 7)).toShort()
                        class318_sub1_sub5_4_.aShort8769 = ((class318_sub1_sub5_4_.aShort8769) * i_3_ / (16 shl Tooltip.anInt4459 - 7)).toShort()
                    }
                }
            }
    
            @JvmStatic
            fun method1853(i: Byte) {
                aAbstractModelRendererArray4679 = null
                if (i.toInt() != 48) anInt4674 = -62
                aSystemFontGlyphs_4672 = null
                aFont_4684 = null
            }
    
            fun method1854(i: Int, i_5_: Int, bool: Boolean, i_6_: Int): Int {
                if (i < 45) method1852(83, 33, 101, -55)
                anInt4681++
                val class348_sub13 = method1974(37.toByte(), i_5_, bool)
                if (class348_sub13 == null) return 0
                if (i_6_ < 0 || i_6_ >= class348_sub13.anIntArray6758.size) return 0
                return class348_sub13.anIntArray6758[i_6_]
            }
}
