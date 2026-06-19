object GlShaderObjectHandleStatics {
    @JvmField
            var anInt514: Int = 0
            @JvmField
            var aRgbColorPalette_515: RgbColorPalette? = RgbColorPalette(7, 7)
            @JvmField
            var anInt516: Int = 0
            @JvmField
            var aJs5Archive_518: Js5Archive? = null
            @JvmField
            var aScriptCompilerThread_520: ScriptCompilerThread? = null
            @JvmField
            var aSystemFontGlyphs_521: SystemFontGlyphs? = null
    
            @JvmStatic
            fun method366(objects: Array<Any?>?, i: Byte, `is`: IntArray?) {
                do {
                    try {
                        SoundChannelMixerStatics.method2092(`is`!!.size - 1, 0, `is`, -119, objects)
                        anInt514++
                        if (i <= -97) break
                        method367(-67)
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("ifa.B(" + (if (objects != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method367(i: Int) {
                aJs5Archive_518 = null
                aRgbColorPalette_515 = null
                aSystemFontGlyphs_521 = null
                if (i == -15833) aScriptCompilerThread_520 = null
            }
}
