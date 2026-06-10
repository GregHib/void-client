/* Class348_Sub42_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
abstract class Class348_Sub42_Sub9 internal constructor(@JvmField var anInterface14_9559: Interface14?, @JvmField var anInt9556: Int) : Class348_Sub42() {
    abstract fun method3205(i: Int): Any?

    abstract fun method3206(i: Byte): Boolean

    companion object {
        @JvmField
        var anInt9557: Int = 0
        @JvmField
        var anIntArray9558: IntArray? = intArrayOf(3, 7, 15)
        @JvmStatic
        fun method3203(i: Int, i_0_: Byte, i_1_: Int): Boolean {
            anInt9557++
            if (i_0_ < 109) return false
            return (i_1_ and 0x10000) != 0
        }

        @JvmStatic
        fun method3204(i: Int) {
            if (i > -64) method3203(-45, 72.toByte(), -104)
            anIntArray9558 = null
        }
    }
}
