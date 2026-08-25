package awt.image

expect class DataBufferInt {
    constructor(size: Int)
    constructor(dataArray: IntArray, size: Int)

    fun getData(): IntArray
    fun getElem(i: Int): Int
    fun setElem(i: Int, value: Int)
}

expect val DataBufferInt.bufferSize: Int