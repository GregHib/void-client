import kotlin.jvm.JvmStatic
/* Class328_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class ShaderState : ShaderObject() {
    companion object {

        var anInt6513: Int = 0
        var aFloatArray6514: FloatArray? = FloatArray(4)

        @JvmStatic
        fun method2610(bool: Boolean) {
            if (bool != true) method2610(false)
            aFloatArray6514 = null
        }
    }
}
