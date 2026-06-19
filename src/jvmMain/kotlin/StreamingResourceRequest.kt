import java.util.*
import StreamingResourceRequestStatics.anInt10452
import StreamingResourceRequestStatics.anInt10454

class StreamingResourceRequest : AsyncResourceRequest() {
    @JvmField
    var aByte10449: Byte = 0
    @JvmField
    var aClass348_Sub49_10453: ByteBuffer? = null
    @JvmField
    var anInt10456: Int = 0

    override fun method3259(i: Int): ByteArray? {
        anInt10454++
        if (i != 16) return null
        if (this.aBoolean9664 || (this.aClass348_Sub49_10453!!.anInt7197 < (-this.aByte10449 + (this.aClass348_Sub49_10453!!.aByteArray7154)!!.size))) throw RuntimeException()
        return (this.aClass348_Sub49_10453!!.aByteArray7154)
    }

    override fun method3257(i: Int): Int {
        if (i != 16) this.aByte10449 = (-4).toByte()
        anInt10452++
        if (this.aClass348_Sub49_10453 == null) return 0
        return (100 * this.aClass348_Sub49_10453!!.anInt7197 / (-this.aByte10449 + (this.aClass348_Sub49_10453!!.aByteArray7154)!!.size))
    }
}
