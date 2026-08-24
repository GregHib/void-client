import kotlin.jvm.JvmStatic
/* Class241 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class BufferPositionTracker {
    abstract fun method1856(i: Byte)

    abstract fun method1858(i: Int): Long

    abstract fun method1859(i: Int, l: Long): Int

    fun method1861(i: Int, l: Long): Int {
        try {
            anInt3149++
            val l_1_ = method1858(-73)
            if (i.toLong() < l_1_) TexGenMaterialPass.method2161(61.toByte(), l_1_)
            return method1859(71, l)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "tb.H(" + i + ',' + l + ')')
        }
    }

    abstract fun method1862(i: Int): Long

    companion object {

        var anInt3148: Int = 0

        var anInt3149: Int = 0

        var aFontMetaRef_3150: FontMetaRef? = FontMetaRef(71, 2)

        @JvmStatic
        fun method1857(i: Byte): Long {
            anInt3148++
            if (i.toInt() != -45) return -58L
            return FacingDirectionNode.aBufferPositionTracker_6660!!.method1862(-18931)
        }

        @JvmStatic
        fun method1860(i: Byte) {
            aFontMetaRef_3150 = null
            val i_0_ = -52 / ((-22 - i) / 55)
        }
    }
}
