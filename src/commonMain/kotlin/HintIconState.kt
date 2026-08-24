import kotlin.jvm.JvmStatic
import java.awt.Rectangle

/*
 * Class180
 */
object HintIconState {

    var anIntArray2370: IntArray? = IntArray(13)

    var aRectangleArray2371: Array<Rectangle?>? = arrayOfNulls<Rectangle>(100)

    var aSingletonMarker_2372: SingletonMarker?

    @JvmStatic
    fun method1366(i: Byte) {
        aSingletonMarker_2372 = null
        anIntArray2370 = null
        aRectangleArray2371 = null
        if (i.toInt() != -43) aRectangleArray2371 = null
    }

    init {
        for (i in 0..99) aRectangleArray2371!![i] = Rectangle()
        aSingletonMarker_2372 = SingletonMarker()
    }
}
