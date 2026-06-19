import ScanlineRasterFillerStatics.method1387
import kotlin.concurrent.Volatile
import BoundingBoxNodeStatics.anInt6739

/* Class348_Sub12 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BoundingBoxNode internal constructor(var aClass348_Sub21_6751: CameraSplineNode?) : LinkedListNode() {
    var anInt6735: Int
    var anInt6737: Int
    var anInt6738: Int = -2147483648
    var anInt6745: Int = 2147483647
    var anInt6746: Int = 2147483647
    var anInt6747: Int = 2147483647
    var anInt6750: Int
    var anInt6753: Int = 2147483647

    fun method2799(i: Int, i_1_: Int, i_2_: Int): Boolean {
        anInt6739++
        if (i_1_ >= this.anInt6747 && this.anInt6750 >= i_1_ && i >= this.anInt6746 && (i <= this.anInt6735)) return true
        if (this.anInt6745 <= i_1_ && this.anInt6737 >= i_1_ && this.anInt6753 <= i && this.anInt6738 >= i) return true
        if (i_2_ < 60) method2799(8, 24, -128)
        return false
    }

    init {
        this.anInt6735 = -2147483648
        this.anInt6750 = -2147483648
        this.anInt6737 = -2147483648
    }
}
