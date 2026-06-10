import java.awt.Canvas
import java.awt.Rectangle

class p(var_oa: oa?, @JvmField var aCanvas5147: Canvas?, @JvmField var anInt5145: Int, @JvmField var anInt5148: Int) : Class348(), Interface19 {
    var nativeid: Long = 0

    private external fun sa(var_oa: oa?, canvas: Canvas?, i: Int, i_0_: Int)

    external override fun w(bool: Boolean)

    private external fun H(i: Int, i_1_: Int, i_2_: Int, i_3_: Int)

    private external fun oa(canvas: Canvas?, i: Int, i_4_: Int)

    private fun method3432(exception: Exception) {
        if (!aBoolean5144) {
            aLong5146 = Class62.method599(-54)
            aBoolean5144 = true
        } else if (Class62.method599(-88) - aLong5146 < 30000L) this.aCanvas5147!!.repaint()
        else throw RuntimeException(exception.message)
    }

    private external fun K(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int)

    fun method3433(i: Int, i_10_: Int) {
        try {
            synchronized(this.aCanvas5147!!.getTreeLock()) {
                val dimension = this.aCanvas5147!!.getSize()
                H(i, i_10_, dimension.width, dimension.height)
                aBoolean5144 = false
            }
        } catch (exception: Exception) {
            method3432(exception)
        }
    }

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    init {
        sa(var_oa, this.aCanvas5147, anInt5145, anInt5148)
    }

    fun method3434(rectangles: Array<Rectangle?>, i: Int, i_12_: Int, i_13_: Int) {
        try {
            synchronized(this.aCanvas5147!!.getTreeLock()) {
                for (i_14_ in 0..<i) {
                    val rectangle = rectangles[i_14_]!!
                    if (rectangle.width > 0 && rectangle.height > 0) K(rectangle.x, rectangle.y, rectangle.width, rectangle.height, i_12_, i_13_)
                }
                aBoolean5144 = false
            }
        } catch (exception: Exception) {
            method3432(exception)
        }
    }

    fun method3435(canvas: Canvas?, i: Int, i_15_: Int) {
        this.anInt5145 = i
        this.anInt5148 = i_15_
        oa(canvas, i, i_15_)
    }

    fun method3436() {
        w(true)
        this.nativeid = 0L
        this.aCanvas5147 = null
    }

    companion object {
        private var aBoolean5144 = false
        private var aLong5146: Long = 0
    }
}
