import WaterMaterialPassStatics.method2148
import CollisionFlagQueryStatics.method721
import ManagedGlResourceStatics.anInt3151

/* Class242 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ManagedGlResource internal constructor(var_ha_Sub2: OpenGlRenderer?, l: Long, i: Int) {
    private val aHa_Sub2_3153: OpenGlRenderer?
    @JvmField
    var aLong3156: Long = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt3151++
        aHa_Sub2_3153!!.method3769(this.aLong3156, false)
//        super.finalize()
    }

    init {
        try {
            aHa_Sub2_3153 = var_ha_Sub2
            this.aLong3156 = l
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("tba.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + l + ',' + i + ')'))
        }
    }
}
