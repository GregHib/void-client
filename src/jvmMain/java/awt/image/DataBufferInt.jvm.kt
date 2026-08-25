package awt.image

actual typealias DataBufferInt = java.awt.image.DataBufferInt

actual val DataBufferInt.bufferSize: Int
    get() = getSize()