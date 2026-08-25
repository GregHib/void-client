package io

actual open class FileInputStream actual constructor(file: File) : InputStream() {

    actual constructor(name: String) : this(File(name))

    private val path: String = file.getPath()
    private val fd: Int = mapNodeErrors(path) { openSync(path, "r") }
    private var position: Double = 0.0
    private var closed = false

    actual override fun read(): Int {
        val one = ByteArray(1)
        return if (read(one, 0, 1) <= 0) -1 else one[0].toInt() and 0xFF
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        checkOpen()
        checkBounds(b.size, off, len)
        if (len == 0) return 0
        val n = mapNodeErrors(path) { readSync(fd, b.asUint8Array(), off, len, position) }
        if (n == 0) return -1
        position += n
        return n
    }

    override fun skip(n: Long): Long {
        checkOpen()
        if (n <= 0L) return 0L
        val size = mapNodeErrors(path) { fstatSync(fd).size }
        val target = minOf(position + n.toDouble(), size)
        val skipped = target - position
        position = target
        return skipped.toLong()
    }

    override fun available(): Int {
        checkOpen()
        val size = mapNodeErrors(path) { fstatSync(fd).size }
        return maxOf(0.0, size - position).toInt()
    }

    actual override fun close() {
        if (closed) return
        closed = true
        mapNodeErrors(path) { closeSync(fd) }
    }

    private fun checkOpen() {
        if (closed) throw IOException("Stream closed: $path")
    }
}
