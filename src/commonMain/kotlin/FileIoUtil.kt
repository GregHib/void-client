import kotlin.jvm.JvmStatic
import BufferedFileReader.method3610
import io.File
import io.IOException
import lang.InterruptedException
import lang.sleep

/*
 * Class327
 */
object FileIoUtil {
    var anInt4090: Int = 0
    var aBoundsConstraintEntry_4091: BoundsConstraintEntry? = BoundsConstraintEntry("", 10)
    var anInt4092: Int = 0
    var anInt4093: Int = 0
    var aFontMetaRef_4094: FontMetaRef? = FontMetaRef(47, 4)

    var anInt4095: Int = 0

    var anIntArray4096: IntArray? = IntArray(32)

    var anIntArray4097: IntArray? = IntArray(2)
    var aRgbColorPalette_4098: RgbColorPalette? = RgbColorPalette(4, 7)

    @JvmStatic
    fun method2604(i: Byte) {
        aBoundsConstraintEntry_4091 = null
        if (i >= -49) method2606(31, -15L)
        aRgbColorPalette_4098 = null
        aFontMetaRef_4094 = null
        anIntArray4096 = null
        anIntArray4097 = null
    }

    fun method2605(i: Byte): Boolean {
        anInt4092++
        if (i.toInt() != -99) anIntArray4097 = null
        return SpriteDefinition.anInt7068 != 0
    }

    fun method2606(i: Int, l: Long) {
        try {
            anInt4090++
            try {
                sleep(l)
                val i_0_ = 107 % ((-80 - i) / 35)
            } catch (interruptedexception: InterruptedException) {
                /* empty */
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "de.A(" + i + ',' + l + ')')
        }
    }

    fun method2607(i: Int, file: File?, i_1_: Int): ByteArray? {
        anInt4093++
        try {
            val i_2_ = -87 / ((28 - i_1_) / 54)
            val `is` = ByteArray(i)
            method3610(`is`, 7.toByte(), i, file)
            return `is`
        } catch (ioexception: IOException) {
            return null
        }
    }
}
