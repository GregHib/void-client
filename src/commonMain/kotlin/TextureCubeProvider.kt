import kotlin.jvm.JvmStatic
/* Class299_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class TextureCubeProvider : CircleRasterizer() {
    abstract fun method2266(bool: Boolean): RenderableCubeTexture?

    companion object {

        var anInt6325: Int = 0

        var anInt6326: Int = 0

        var aBoolean6327: Boolean = false

        var aBufferedRandomAccessFile_6328: BufferedRandomAccessFile? = null

        @JvmStatic
        fun method2268(i: Int) {
            if (i == -24054) aBufferedRandomAccessFile_6328 = null
        }

        @JvmStatic
        fun method2269(bool: Boolean) {
            if (bool != true) anInt6325 = -78
            HintArrowRenderer.method739()
            anInt6326++
        }
    }
}
