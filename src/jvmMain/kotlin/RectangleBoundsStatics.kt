object RectangleBoundsStatics {
    var anInt2152: Int = 0
            var anInt2154: Int = 0
            @JvmField
            var aRgbColorPalette_2157: RgbColorPalette? = RgbColorPalette(5, 16)
            @JvmStatic
            fun method1265(i: Int) {
                anInt2152++
                if (i != 16) aRgbColorPalette_2157 = null
                if (AbstractProceduralTextureNodeStatics.aSoundChannelMixer_7042 != null) AbstractProceduralTextureNodeStatics.aSoundChannelMixer_7042!!.method2093(true)
                if (VarbitDefLoaderStatics.aSoundChannelMixer_2596 != null) VarbitDefLoaderStatics.aSoundChannelMixer_2596!!.method2093(true)
            }
    
            @JvmStatic
            fun method1267(i: Byte) {
                aRgbColorPalette_2157 = null
                if (i.toInt() != 85) method1267(121.toByte())
            }
}
