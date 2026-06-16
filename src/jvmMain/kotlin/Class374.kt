import java.io.*

internal object Class374 {
    var anInt4536: Int = 0
    var aClass74_4537: Class74? = Class74(3, 2)
    var aClass78_4538: Class78? = null

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
            throw Class348_Sub17.method2929(runtimeexception, ("gca.A(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + (if (file != null) "{...}" else "null") + ')'))
        }
    }

    fun method3611(bool: Boolean) {
        if (bool != true) aClass74_4537 = null
        aClass74_4537 = null
        aClass78_4538 = null
    }
}
