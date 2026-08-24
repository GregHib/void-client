import kotlin.jvm.JvmStatic
/* Class39 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GlShaderObjectHandle internal constructor(glRenderDevice: GlRenderDevice?, l: Long, i: Int) {
    var aLong517: Long = 0
    private val aGlRenderDevice_519: GlRenderDevice?

    @Throws(Throwable::class)
    protected fun finalize() {
        aGlRenderDevice_519!!.method3966(this.aLong517, 34192)
        anInt516++
//        super.finalize()
    }

    init {
        try {
            this.aLong517 = l
            aGlRenderDevice_519 = glRenderDevice
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("ifa.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + l + ',' + i + ')'))
        }
    }

    companion object {

        var anInt514: Int = 0

        var aRgbColorPalette_515: RgbColorPalette? = RgbColorPalette(7, 7)

        var anInt516: Int = 0

        var aJs5Archive_518: Js5Archive? = null

        var aScriptCompilerThread_520: ScriptCompilerThread? = null

        var aSystemFontGlyphs_521: SystemFontGlyphs? = null

        @JvmStatic
        fun method366(objects: Array<Any?>?, i: Byte, `is`: IntArray?) {
            do {
                try {
                    SoundChannelMixer.method2092(`is`!!.size - 1, 0, `is`, -119, objects)
                    anInt514++
                    if (i <= -97) break
                    method367(-67)
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(runtimeexception, ("ifa.B(" + (if (objects != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ')'))
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
}
