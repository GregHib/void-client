import RingBufferInputStreamStatics.method3620
import NativeBufferHandleStatics.anInt1509

/* Class89 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NativeBufferHandle internal constructor(glRenderDevice: GlRenderDevice?, l: Long, glShaderObjectHandles: Array<GlShaderObjectHandle?>?) {
    private val aGlRenderDevice_1506: GlRenderDevice?
    var aLong1510: Long = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt1509++
        aGlRenderDevice_1506!!.method3966(this.aLong1510, 34192)
//        super.finalize()
    }

    init {
        try {
            this.aLong1510 = l
            aGlRenderDevice_1506 = glRenderDevice
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("lha.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + l + ',' + (if (glShaderObjectHandles != null) "{...}" else "null") + ')'))
        }
    }
}
