import TextureDefinitionCacheStatics.method1626
import BufferToggleStateStatics.anInt3715
import BufferToggleStateStatics.anInt3718

/* Class290 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BufferToggleState internal constructor(var aBoolean3709: Boolean) {
    var anInterface5_Impl1_3708: VertexBufferResource? = null
    var anInterface5_Impl1_3711: VertexBufferResource? = null
    var aBoolean3714: Boolean = false
    fun method2195(bool: Boolean) {
        if (this.anInterface5_Impl1_3708 != null) this.anInterface5_Impl1_3708!!.method21(23315)
        anInt3715++
        this.aBoolean3714 = bool
    }

    fun method2197(i: Byte): Boolean {
        if (i >= -4) method2195(true)
        anInt3718++
        return this.aBoolean3714 && !this.aBoolean3709
    }
}
