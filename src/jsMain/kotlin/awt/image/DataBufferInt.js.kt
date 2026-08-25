package awt.image

actual class DataBufferInt {

    private val bank: IntArray
    internal val length: Int

    actual constructor(size: Int) {
        bank = IntArray(size)
        length = size
    }

    actual constructor(dataArray: IntArray, size: Int) {
        bank = dataArray
        length = size
    }

    actual fun getData(): IntArray = bank
    actual fun getElem(i: Int): Int = bank[i]
    actual fun setElem(i: Int, value: Int) {
        bank[i] = value
    }
}

actual val DataBufferInt.bufferSize: Int get() = length
