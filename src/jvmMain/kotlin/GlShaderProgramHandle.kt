import ParticleEmitterDefStatics.method2187
import ParticleEmitterDefExtStatics.method2189
import LinkedListNodeStatics.method2709
import GlShaderProgramHandleStatics.anInt4175

/* Class337 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GlShaderProgramHandle internal constructor(var_ha_Sub2: OpenGlRenderer?, l: Long, managedGlResources: Array<ManagedGlResource?>?) {
    private val aHa_Sub2_4173: OpenGlRenderer?
    var aLong4178: Long = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        aHa_Sub2_4173!!.method3769(this.aLong4178, false)
        anInt4175++
//        super.finalize()
    }

    init {
        try {
            aHa_Sub2_4173 = var_ha_Sub2
            this.aLong4178 = l
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("dw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + l + ',' + (if (managedGlResources != null) "{...}" else "null") + ')'))
        }
    }
}
