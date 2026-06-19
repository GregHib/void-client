import ConfigFlagUtilStatics.method1916
import CompassSmootherStatics.method2017
import ActiveMapRegion.method769
import ShortMatrixNodeStatics.anInt9510
import ShortMatrixNodeStatics.anInt9515

/* Class348_Sub42_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ShortMatrixNode internal constructor(var aShortArrayArray9518: Array<ShortArray?>, var aDouble9512: Double) : HashLinkedListNode() {
    fun method3182(i: Int): Long {
        if (i < 76) anInt9515 = 111
        anInt9510++
        return ((this.aShortArrayArray9518).size shl 0 or (this.aShortArrayArray9518[0])!!.size).toLong()
    }
}
