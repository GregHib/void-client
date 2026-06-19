import java.util.*
import kotlin.math.pow
import kotlin.math.sin

object SynthSoundGeneratorStatics {
    var anIntArray1409: IntArray?
    var anIntArray1412: IntArray?
    var anIntArray1416: IntArray? = IntArray(32768)
    var anIntArray1424: IntArray?
    var anIntArray1426: IntArray?
    var anIntArray1429: IntArray?
    var anIntArray1430: IntArray?
    var anIntArray1431: IntArray?

    @JvmStatic
    fun method808() {
        anIntArray1409 = null
        anIntArray1416 = null
        anIntArray1412 = null
        anIntArray1431 = null
        anIntArray1424 = null
        anIntArray1430 = null
        anIntArray1429 = null
        anIntArray1426 = null
    }

    init {
        val random = Random(0L)
        for (i in 0..32767) anIntArray1416!![i] = (random.nextInt() and 0x2) - 1
        anIntArray1412 = IntArray(32768)
        for (i in 0..32767) anIntArray1412!![i] = (sin(i.toDouble() / 5215.1903) * 16384.0).toInt()
        anIntArray1409 = IntArray(220500)
        anIntArray1424 = IntArray(5)
        anIntArray1426 = IntArray(5)
        anIntArray1429 = IntArray(5)
        anIntArray1431 = IntArray(5)
        anIntArray1430 = IntArray(5)
    }
}
