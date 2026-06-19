import InputTrackerStatics.method3591
import ModelFacePriorityNodeStatics.anInt1873
import ModelFacePriorityNodeStatics.anInt1893

/* Class129 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ModelFacePriorityNode internal constructor(private val anInt1886: Int, var anInt1881: Int, var anInt1877: Int, var anInt1892: Int, @JvmField var aByte1875: Byte) {
    @JvmField
    var anInt1874: Int = 0
    @JvmField
    var anInt1876: Int = 0
    @JvmField
    var anInt1880: Int = 0
    @JvmField
    var anInt1882: Int = 0
    @JvmField
    var anInt1883: Int = 0
    @JvmField
    var anInt1884: Int = 0
    @JvmField
    var aModelFacePriorityNode_1888: ModelFacePriorityNode? = null
    @JvmField
    var anInt1889: Int = 0
    @JvmField
    var anInt1890: Int = 0
    @JvmField
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
}
