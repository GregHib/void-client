import java.io.*

/*
 * Class374
 */
internal object BufferedFileReader {

    var anInt4536: Int = 0

    var aRgbColorPalette_4537: RgbColorPalette? = RgbColorPalette(3, 2)

    var aBufferedRandomAccessFile_4538: BufferedRandomAccessFile? = null

    @JvmStatic
    @Throws(IOException::class)
    fun method3610(`is`: ByteArray?, i: Byte, i_0_: Int, file: File?) {
        try {
            anInt4536++
            val datainputstream = (DataInputStream(BufferedInputStream(FileInputStream(file))))
            try {
                val i_1_ = -11 % ((-43 - i) / 33)
                datainputstream.readFully(`is`, 0, i_0_)
            } catch (eofexception: EOFException) {
                /* empty */
            }
            datainputstream.close()
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("gca.A(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + (if (file != null) "{...}" else "null") + ')'))
        }
    }

    @JvmStatic
    fun method3611(bool: Boolean) {
        if (bool != true) aRgbColorPalette_4537 = null
        aRgbColorPalette_4537 = null
        aBufferedRandomAccessFile_4538 = null
    }
}
