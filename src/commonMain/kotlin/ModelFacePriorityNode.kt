import kotlin.jvm.JvmField
/* Class129 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ModelFacePriorityNode internal constructor(private val anInt1886: Int, var anInt1881: Int, var anInt1877: Int, var anInt1892: Int, @JvmField var aByte1875: Byte) {

    var anInt1874: Int = 0

    var anInt1876: Int = 0

    var anInt1880: Int = 0

    var anInt1882: Int = 0

    var anInt1883: Int = 0

    var anInt1884: Int = 0

    var aModelFacePriorityNode_1888: ModelFacePriorityNode? = null

    var anInt1889: Int = 0

    var anInt1890: Int = 0

    var anInt1891: Int = 0
    fun method1124(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): ModelFacePriorityNode? {
        anInt1893++
        if (i_0_ != -1) return null
        return ModelFacePriorityNode(anInt1886, i_2_, i, i_1_, this.aByte1875)
    }

    fun method1125(i: Byte): SpotAnimDefinition {
        anInt1873++
        if (i.toInt() != 59) this.anInt1880 = -51
        return method3591(anInt1886, i.toInt() xor 0x3b)
    }

    companion object {
        var anInt1873: Int = 0
        var anInt1893: Int = 0
        var anInt4535: Int = 0
        var aLruByteCache_4636: LruByteCache? = LruByteCache(64)
        var aJs5Archive_5964: Js5Archive? = null

        fun method3591(i: Int, i_0_: Int): SpotAnimDefinition {
            anInt4535++
            var spotAnimDefinition = aLruByteCache_4636!!.method583(i.toLong(), i_0_ + -128) as SpotAnimDefinition?
            if (spotAnimDefinition != null) return spotAnimDefinition
            val `is` = aJs5Archive_5964!!.method410(-1860, i_0_, i)
            spotAnimDefinition = SpotAnimDefinition()
            if (`is` != null) spotAnimDefinition.method1370(24, ByteBuffer(`is`))
            spotAnimDefinition.method1371(4)
            aLruByteCache_4636!!.method582(spotAnimDefinition, i.toLong(), (-103).toByte())
            return spotAnimDefinition
        }
    }
}