import java.awt.Rectangle

object Class180 {
    @JvmField
    var anIntArray2370: IntArray? = IntArray(13)
    @JvmField
    var aRectangleArray2371: Array<Rectangle?>? = arrayOfNulls<Rectangle>(100)
    @JvmField
    var aClass196_2372: Class196?

    @JvmStatic
    fun method1366(i: Byte) {
        aClass196_2372 = null
        anIntArray2370 = null
        aRectangleArray2371 = null
        if (i.toInt() != -43) aRectangleArray2371 = null
    }

    init {
        for (i in 0..99) aRectangleArray2371!![i] = Rectangle()
        aClass196_2372 = Class196()
    }
}
