/**
 * JVM-bound static state and helpers split out of [r]'s companion so the bare [r] abstract class
 * could move to commonMain.
 *
 * [aClass312_9716], [aClass101_9720], [aBooleanArray9718], [anIntArrayArray9723] depend on JVM
 * types (Class312, Class101). [method3284] calls into AWT/ha rendering. They stay on JVM; the pure
 * counters/flags (anInt9717, aBoolean9719, anInt9721, aBoolean9722, anIntArray9724) are in the
 * commonMain [r] companion. Members keep their original names and @JvmStatic so call sites work
 * unchanged reading `rStatics.methodNNNN(...)`.
 */
object rStatics {
    var aClass312_9716: Class312? = Class312()
    var aBooleanArray9718: BooleanArray? = null
    var aClass101_9720: Class101? = null
    var anIntArrayArray9723: Array<IntArray?>?

    fun method3284(bool: Boolean, d: Double) {
        Class44.aClass101_624!!.method898(Class51.aClass101_905)
        r.anInt9717++
        if (bool != true) method3285(10)
        Class44.aClass101_624!!.method891(0, 0, d.toInt())
        Class21.aHa326!!.method3638(Class44.aClass101_624)
    }

    fun method3285(i: Int) {
        val i_0_ = -61 % ((i - -73) / 32)
        aClass101_9720 = null
        r.anIntArray9724 = null
        aBooleanArray9718 = null
        aClass312_9716 = null
        anIntArrayArray9723 = null
    }

    init {
        anIntArrayArray9723 = Array<IntArray?>(128) { IntArray(128) }
    }
}
