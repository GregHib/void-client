import java.io.EOFException
import java.io.File
import java.io.IOException
import java.io.RandomAccessFile
import RandomAccessFileOnDiskStatics.anInt3038
import RandomAccessFileOnDiskStatics.anInt3040
import RandomAccessFileOnDiskStatics.anInt3041
import RandomAccessFileOnDiskStatics.anInt3042
import RandomAccessFileOnDiskStatics.anInt3043
import RandomAccessFileOnDiskStatics.anInt3045
import RandomAccessFileOnDiskStatics.anInt3048
import RandomAccessFileOnDiskStatics.method1659

/*
 * Class234
 */
class RandomAccessFileOnDisk internal constructor(file: File?, string: String?, l: Long) {
    private var aRandomAccessFile3036: RandomAccessFile? = null
    private val aLong3037: Long
    private var aLong3039: Long = 0
    private val aFile3046: File?

    @Throws(IOException::class)
    fun method1656(`is`: ByteArray?, i: Int, i_0_: Byte, i_1_: Int): Int {
        anInt3040++
        val i_2_ = aRandomAccessFile3036!!.read(`is`, i, i_1_)
        val i_3_ = 39 % ((75 - i_0_) / 39)
        if (i_2_ > 0) aLong3039 += i_2_.toLong()
        return i_2_
    }

    @Throws(IOException::class)
    fun method1657(bool: Boolean) {
        anInt3045++
        if (bool != false) method1660(-27)
        if (aRandomAccessFile3036 != null) {
            aRandomAccessFile3036!!.close()
            aRandomAccessFile3036 = null
        }
    }

    @Throws(IOException::class)
    fun method1658(i: Byte, i_4_: Int, i_5_: Int, `is`: ByteArray?) {
        anInt3043++
        if (aLong3037 < i_5_.toLong() - -aLong3039) {
            aRandomAccessFile3036!!.seek(aLong3037)
            aRandomAccessFile3036!!.write(1)
            throw EOFException()
        }
        if (i < 108) aLong3039 = 124L
        aRandomAccessFile3036!!.write(`is`, i_4_, i_5_)
        aLong3039 += i_5_.toLong()
    }

    fun method1660(i: Int): File {
        anInt3042++
        if (i <= 64) method1659((-48).toByte())
        return aFile3046!!
    }

    @Throws(IOException::class)
    fun method1661(i: Int, l: Long) {
        try {
            anInt3048++
            if (i != -18968) aRandomAccessFile3036 = null
            aRandomAccessFile3036!!.seek(l)
            aLong3039 = l
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, "so.B(" + i + ',' + l + ')')
        }
    }

    @Throws(IOException::class)
    fun method1662(i: Byte): Long {
        anInt3038++
        if (i.toInt() != -46) return 97L
        return aRandomAccessFile3036!!.length()
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        if (aRandomAccessFile3036 != null) {
            println("Warning! fileondisk " + aFile3046 + " not closed correctly using close(). Auto-closing instead. ")
            method1657(false)
        }
        anInt3041++
    }

    init {
        var l = l
        try {
            if (l == -1L) l = 9223372036854775807L
            if (l < file!!.length()) file.delete()
            aRandomAccessFile3036 = RandomAccessFile(file, string)
            aLong3037 = l
            aLong3039 = 0L
            aFile3046 = file
            val i = aRandomAccessFile3036!!.read()
            if (i != -1 && string != "r") {
                aRandomAccessFile3036!!.seek(0L)
                aRandomAccessFile3036!!.write(i)
            }
            aRandomAccessFile3036!!.seek(0L)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("so.<init>(" + (if (file != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + l + ')'))
        }
    }
}
