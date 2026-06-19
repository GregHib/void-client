import kotlin.math.pow

object VorbisCodebookStatics {
    fun method3580(i: Int, i_18_: Int): Int {
        var i_19_: Int
        i_19_ = i.toDouble().pow(1.0 / i_18_.toDouble()).toInt() + 1
        while (ByteBufferStatics.method3331(i_18_, 64.toByte(), i_19_) > i) {
            i_19_--
        }
        return i_19_
    }
}
