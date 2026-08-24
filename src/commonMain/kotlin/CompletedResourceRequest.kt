import kotlin.jvm.JvmStatic
/* Class348_Sub42_Sub16_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CompletedResourceRequest : AsyncResourceRequest() {

    var anInt10457: Int = 0

    var aIndexedFileCache_10458: IndexedFileCache? = null

    var aByteArray10461: ByteArray? = null

    override fun method3257(i: Int): Int {
        anInt10460++
        if (i != 16) this.aIndexedFileCache_10458 = null
        if (this.aBoolean9664) return 0
        return 100
    }

    override fun method3259(i: Int): ByteArray? {
        anInt10464++
        if (i != 16) method3259(8)
        if (this.aBoolean9664) throw RuntimeException()
        return this.aByteArray10461
    }

    companion object {

        var anInt10459: Int = 0

        var anInt10460: Int = 0

        var anInt10463: Int = 0

        var anInt10464: Int = 0

        var aHashtable_10465: Hashtable? = Hashtable(16)

        @JvmStatic
        fun method3263(bool: Boolean): Boolean {
            if (bool != true) return false
            anInt10459++
            return FontMetaRef.aBoolean4328
        }

        @JvmStatic
        fun method3264(i: Byte) {
            aHashtable_10465 = null
        }

    }
}
