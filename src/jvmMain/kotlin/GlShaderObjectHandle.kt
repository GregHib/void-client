import GlShaderObjectHandleStatics.anInt516

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
            throw SoundBankPatchStatics.method2929(runtimeexception, ("ifa.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + l + ',' + i + ')'))
        }
    }
}
