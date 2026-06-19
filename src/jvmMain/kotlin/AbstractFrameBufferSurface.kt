import TextureQualityOptionStateStatics.method1783
import java.awt.Canvas
import java.awt.Graphics
import java.math.BigInteger

abstract class AbstractFrameBufferSurface : LinkedListNode() {
    @JvmField
    var anIntArray6916: IntArray? = null
    @JvmField
    var anInt6917: Int = 0
    var anInt6920: Int = 0
    abstract fun method3008(canvas: Canvas?, i: Int, i_1_: Int, i_2_: Int)

    abstract fun method3011(i: Int, i_38_: Int, i_39_: Int, graphics: Graphics?, i_40_: Int, i_41_: Int, i_42_: Int, i_43_: Int)
}
