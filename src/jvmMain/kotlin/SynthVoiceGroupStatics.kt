import PlayerAppearanceUpdateDecoder.method3612

object SynthVoiceGroupStatics {
    @JvmField
            var anInt8845: Int = 0
            @JvmField
            var anInt8846: Int = 0
            @JvmField
            var anInt8847: Int = 0
            @JvmField
            var anInt8849: Int = 0
            @JvmField
            var anInt8850: Int = 0
            @JvmField
            var anInt8851: Int = 0
            @JvmField
            var aRgbColorPalette_8853: RgbColorPalette? = RgbColorPalette(11, 8)
            @JvmField
            var anInt8854: Int = 0
            @JvmField
            var anInt8856: Int = 0
            @JvmField
            var aFontMetaRef_8857: FontMetaRef? = FontMetaRef(54, 15)
            @JvmField
            var anInt8858: Int = 0
            @JvmField
            var anInt8859: Int = 0
    
            fun method2822(i: Int, class348_sub49_sub2: CipheredPacketBuffer, i_3_: Int) {
                ProjectionCameraTransformStatics.anInt5768 = 0
                anInt8846++
                OggMediaStreamStatics.aBoolean979 = false
                if (i < -17) {
                    ConstantColourTextureNodeStatics.method3094(-21478, class348_sub49_sub2)
                    method3612(75, class348_sub49_sub2)
                    if (OggMediaStreamStatics.aBoolean979) println("---endgpp---")
                    if (class348_sub49_sub2.anInt7197 != i_3_) throw RuntimeException("gpi1 pos:" + class348_sub49_sub2.anInt7197 + " psize:" + i_3_)
                }
            }
    
            @JvmStatic
            fun method2823(i: Int) {
                if (i != 0) method2823(33)
                aFontMetaRef_8857 = null
                aRgbColorPalette_8853 = null
            }
    
            @JvmStatic
            fun method2826(i: Int): NanoTimer? {
                anInt8845++
                try {
                    return SystemNanoTimer()
                } catch (throwable: Throwable) {
                    if (i != 15) return null
                    return MillisNanoTimer()
                }
            }
}
