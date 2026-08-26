import Disposable
import LinkedListNode
import awt.Canvas
import awt.Rectangle

/*
 * NativeFrameBuffer
 */
expect class p(var_oa: oa?, aCanvas5147: Canvas?, anInt5145: Int, anInt5148: Int) : LinkedListNode, Disposable {
    var aCanvas5147: Canvas?
    var anInt5145: Int
    var anInt5148: Int
    var nativeid: Long

    fun sa(var_oa: oa?, canvas: Canvas?, i: Int, i_0_: Int)

    override fun w(bool: Boolean)

    fun H(i: Int, i_1_: Int, i_2_: Int, i_3_: Int)

    fun oa(canvas: Canvas?, i: Int, i_4_: Int)

    fun method3432(exception: Exception) 

    fun K(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int)

    fun method3433(i: Int, i_10_: Int) 

    fun finalize()

    fun method3434(rectangles: Array<Rectangle?>, i: Int, i_12_: Int, i_13_: Int) 

    fun method3435(canvas: Canvas?, i: Int, i_15_: Int) 

    fun method3436()
}
