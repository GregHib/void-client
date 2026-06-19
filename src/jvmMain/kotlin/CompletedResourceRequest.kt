import CompletedResourceRequestStatics.anInt10460
import CompletedResourceRequestStatics.anInt10464

/* Class348_Sub42_Sub16_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CompletedResourceRequest : AsyncResourceRequest() {
    @JvmField
    var anInt10457: Int = 0
    @JvmField
    var aIndexedFileCache_10458: IndexedFileCache? = null
    @JvmField
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
}
