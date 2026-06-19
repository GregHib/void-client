import InputTrackerStatics.anInt4533

/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
abstract class InputTracker {
    abstract fun method3588(i: Int): Boolean

    abstract fun method3589(i: Int)

    abstract fun method3590(i: Byte): Boolean

    abstract fun method3592(i: Int)

    fun method3593(i: Int): Boolean {
        anInt4533++
        if (i <= 91) method3593(53)
        return method3595(-83) || method3588(-121) || method3590(125.toByte())
    }

    abstract fun method3594(i: Byte): Int

    abstract fun method3595(i: Int): Boolean

    abstract fun method3596(i: Int): TimedRecordAccessor?

    abstract fun method3597(bool: Boolean): Int
}
