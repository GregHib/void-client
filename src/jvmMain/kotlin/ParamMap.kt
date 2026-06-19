import CacheArchiveIndexLoaderStatics.method340
import ParamMapStatics.method3165
import ParamMapStatics.method3169
import ParamMapStatics.anInt9489
import ParamMapStatics.anInt9490
import ParamMapStatics.anInt9493
import ParamMapStatics.anInt9497

/* Class348_Sub42_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParamMap : HashLinkedListNode() {
    private var aHashtable_9494: Hashtable? = null
    fun method3166(i: Int, i_0_: Int, i_1_: Byte): Int {
        anInt9490++
        if (aHashtable_9494 == null) return i_0_
        val class348_sub35 = aHashtable_9494!!.method3480(i.toLong(), -6008) as IntKeyNode?
        if (i_1_ < 91) return 72
        if (class348_sub35 == null) return i_0_
        return class348_sub35.anInt6976
    }

    private fun method3167(i: Int, class348_sub49: ByteBuffer, i_2_: Byte) {
        if (i_2_.toInt() == -86) {
            anInt9489++
            if (i == 249) {
                val i_3_ = class348_sub49.readUnsignedByte(255)
                if (aHashtable_9494 == null) {
                    val i_4_ = method340(i_3_, 108.toByte())
                    aHashtable_9494 = Hashtable(i_4_)
                }
                for (i_5_ in 0..<i_3_) {
                    val bool = class348_sub49.readUnsignedByte(i_2_ + 341) == 1
                    val i_6_ = class348_sub49.readMedium(-1)
                    val linkedListNode: LinkedListNode?
                    if (bool) linkedListNode = StringCacheNode(class348_sub49.readString((-39).toByte()))
                    else linkedListNode = IntKeyNode(class348_sub49.readInt((-126).toByte()))
                    aHashtable_9494!!.method3483(29.toByte(), i_6_.toLong(), linkedListNode)
                }
            }
        }
    }

    fun method3168(class348_sub49: ByteBuffer, i: Byte) {
        while (true) {
            val i_7_ = class348_sub49.readUnsignedByte(255)
            if (i_7_ == 0) break
            method3167(i_7_, class348_sub49, (-86).toByte())
        }
        anInt9497++
        if (i >= -59) method3169(-56, -67)
    }

    fun method3170(i: Int, string: String?, i_9_: Int): String? {
        anInt9493++
        if (aHashtable_9494 == null) return string
        if (i != -250) method3165(0.toByte())
        val class348_sub50 = aHashtable_9494!!.method3480(i_9_.toLong(), -6008) as StringCacheNode?
        if (class348_sub50 == null) return string
        return class348_sub50.aString7211
    }
}
