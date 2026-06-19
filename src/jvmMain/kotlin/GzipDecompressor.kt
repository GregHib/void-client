import java.util.zip.Inflater
import GzipDecompressorStatics.anInt2073
import GzipDecompressorStatics.anInt2074
import GzipDecompressorStatics.aFloatArray2075

/*
 * Class152
 */
class GzipDecompressor private constructor(i: Int, i_6_: Int, i_7_: Int) {
    private var anInflater2072: Inflater? = null
    fun method1214(i: Int, `is`: ByteArray): ByteArray {
        anInt2074++
        val class348_sub49 = ByteBuffer(`is`)
        class348_sub49.anInt7197 = `is`.size - 4
        val i_0_ = class348_sub49.method3359(-86)
        class348_sub49.anInt7197 = 0
        if (i != 9) aFloatArray2075 = null
        val is_1_ = ByteArray(i_0_)
        method1218(is_1_, 29123, class348_sub49)
        return is_1_
    }

    constructor() : this(-1, 1000000, 1000000)

    fun method1218(`is`: ByteArray?, i: Int, class348_sub49: ByteBuffer?) {
        try {
            anInt2073++
            if ((class348_sub49!!.aByteArray7154!![class348_sub49.anInt7197]).toInt() != 31 || (class348_sub49.aByteArray7154!![1 + class348_sub49.anInt7197]).toInt() != -117) throw RuntimeException("Invalid GZIP header!")
            if (anInflater2072 == null) anInflater2072 = Inflater(true)
            try {
                anInflater2072!!.setInput(class348_sub49.aByteArray7154, class348_sub49.anInt7197 - -10, -8 - (10 + class348_sub49.anInt7197 - (class348_sub49.aByteArray7154)!!.size))
                anInflater2072!!.inflate(`is`)
            } catch (exception: Exception) {
                anInflater2072!!.reset()
                throw RuntimeException("Invalid GZIP compressed data!")
            }
            anInflater2072!!.reset()
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("ol.A(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (class348_sub49 != null) "{...}" else "null") + ')'))
        }
    }
}
