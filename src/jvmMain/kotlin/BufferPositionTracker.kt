import BufferPositionTrackerStatics.anInt3149

/* Class241 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class BufferPositionTracker {
    abstract fun method1856(i: Byte)

    abstract fun method1858(i: Int): Long

    abstract fun method1859(i: Int, l: Long): Int

    fun method1861(i: Int, l: Long): Int {
        try {
            anInt3149++
            val l_1_ = method1858(-73)
            if (i.toLong() < l_1_) TexGenMaterialPassStatics.method2161(61.toByte(), l_1_)
            return method1859(71, l)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, "tb.H(" + i + ',' + l + ')')
        }
    }

    abstract fun method1862(i: Int): Long
}
