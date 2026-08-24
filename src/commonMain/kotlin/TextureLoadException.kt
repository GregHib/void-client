import kotlin.jvm.JvmField
/* RuntimeException_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TextureLoadException(@JvmField var aThrowable4595: Throwable?, @JvmField var aString4594: String?) : RuntimeException() {
    companion object {
        val trace: Boolean = false
        var anInt6789: Int = 0
        fun method2929(throwable: Throwable, string: String?): TextureLoadException {
            anInt6789++
            if (trace) {
                throwable.printStackTrace()
            }
            val runtimeexception_sub1: TextureLoadException
            if (throwable is TextureLoadException) {
                runtimeexception_sub1 = throwable
                runtimeexception_sub1.aString4594 += " $string"
            } else runtimeexception_sub1 = TextureLoadException(throwable, string)
            return runtimeexception_sub1
        }
    }
}