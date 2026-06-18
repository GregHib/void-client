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

    companion object {
        @JvmField
        var anInt4533: Int = 0
        @JvmField
        var anInt4534: Int = 0
        @JvmField
        var anInt4535: Int = 0

        @JvmStatic
        fun method3591(i: Int, i_0_: Int): SpotAnimDefinition {
            anInt4535++
            var spotAnimDefinition = WorldMapElement.aLruByteCache_4636!!.method583(i.toLong(), i_0_ + -128) as SpotAnimDefinition?
            if (spotAnimDefinition != null) return spotAnimDefinition
            val `is` = BloomGraphicsOptionState.aJs5Archive_5964!!.method410(-1860, i_0_, i)
            spotAnimDefinition = SpotAnimDefinition()
            if (`is` != null) spotAnimDefinition.method1370(24, ByteBuffer(`is`))
            spotAnimDefinition.method1371(4)
            WorldMapElement.aLruByteCache_4636!!.method582(spotAnimDefinition, i.toLong(), (-103).toByte())
            return spotAnimDefinition
        }
    }
}
