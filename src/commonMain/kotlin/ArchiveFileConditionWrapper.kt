import kotlin.jvm.JvmStatic
/* Class270 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ArchiveFileConditionWrapper {
    var anByteArrayCodec_3463: ByteArrayCodec? = null

    /** Set by DecorBatcher: keep a copy of the packed indices in [capturedIndices]. */
    var captureWanted = false
    var capturedIndices: ByteArray? = null

    companion object {
        var anIntArray3464: IntArray? = IntArray(6)

        @JvmStatic
        fun method2043(bool: Boolean) {
            if (bool != true) method2043(false)
            anIntArray3464 = null
        }
    }
}
