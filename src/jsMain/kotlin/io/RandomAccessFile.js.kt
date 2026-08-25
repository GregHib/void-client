package io

import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array
import kotlin.js.unsafeCast

actual open class RandomAccessFile actual constructor(name: String, mode: String) : AutoCloseable {

    private val path: String = name
    private val readOnly: Boolean = mode == "r"
    private val fd: Int
    private var pointer: Double = 0.0
    private var closed = false

    init {
        val flags = when (mode) {
            "r" -> "r"
            "rw" -> "r+"
            "rws", "rwd" -> "rs+"
            else -> throw IllegalArgumentException(
                "Illegal mode \"$mode\" must be one of \"r\", \"rw\", \"rws\" or \"rwd\""
            )
        }
        fd = mapNodeErrors(name) {
            // "rw*" creates the file if it is missing; Node has no create-without-truncate flag.
            if (!readOnly && !existsSync(name)) closeSync(openSync(name, "w"))
            openSync(name, flags)
        }
    }

    actual open fun read(): Int {
        val one = ByteArray(1)
        return if (read(one, 0, 1) <= 0) -1 else one[0].toInt() and 0xFF
    }

    actual open fun read(b: ByteArray): Int = read(b, 0, b.size)

    actual open fun read(b: ByteArray, off: Int, len: Int): Int {
        checkOpen()
        checkBounds(b.size, off, len)
        if (len == 0) return 0
        val n = mapNodeErrors(path) { readSync(fd, b.asUint8Array(), off, len, pointer) }
        if (n == 0) return -1
        pointer += n
        return n
    }

    actual fun readFully(b: ByteArray) {
        readFully(b, 0, b.size)
    }

    actual fun readFully(b: ByteArray, off: Int, len: Int) {
        checkBounds(b.size, off, len)
        var done = 0
        while (done < len) {
            val n = read(b, off + done, len - done)
            if (n < 0) throw EOFException("Unexpected end of $path")
            done += n
        }
    }

    actual open fun write(b: Int) {
        write(byteArrayOf(b.toByte()), 0, 1)
    }

    actual open fun write(b: ByteArray) {
        write(b, 0, b.size)
    }

    actual open fun write(b: ByteArray, off: Int, len: Int) {
        checkOpen()
        checkBounds(b.size, off, len)
        if (readOnly) throw IOException("File opened in read-only mode: $path")
        val view = b.asUint8Array()
        var written = 0
        while (written < len) {
            val n = mapNodeErrors(path) {
                writeSync(fd, view, off + written, len - written, pointer + written)
            }
            if (n <= 0) throw IOException("Failed to write to $path")
            written += n
        }
        pointer += len
    }

    actual open fun seek(pos: Long) {
        checkOpen()
        require(pos >= 0L) { "Negative seek offset: $pos" }
        pointer = pos.toDouble()
    }

    actual open fun getFilePointer(): Long {
        checkOpen()
        return pointer.toLong()
    }

    actual open fun length(): Long {
        checkOpen()
        return mapNodeErrors(path) { fstatSync(fd).size }.toLong()
    }

    actual open fun setLength(newLength: Long) {
        checkOpen()
        mapNodeErrors(path) { ftruncateSync(fd, newLength.toDouble()) }
        if (pointer > newLength.toDouble()) pointer = newLength.toDouble()
    }

    actual open fun skipBytes(n: Int): Int {
        if (n <= 0) return 0
        val current = getFilePointer()
        val target = minOf(current + n, length())
        seek(target)
        return (target - current).toInt()
    }

    actual override fun close() {
        if (closed) return
        closed = true
        mapNodeErrors(path) { closeSync(fd) }
    }

    private fun checkOpen() {
        if (closed) throw IOException("File closed: $path")
    }
}

internal fun checkBounds(size: Int, off: Int, len: Int) {
    if (off < 0 || len < 0 || off + len > size) {
        throw IndexOutOfBoundsException("size=$size, off=$off, len=$len")
    }
}

internal fun ByteArray.asUint8Array(): Uint8Array {
    val i8 = this.unsafeCast<Int8Array>()
    return Uint8Array(i8.buffer, i8.byteOffset, i8.length)
}

/** Translates Node's errno-style failures into the java.io exception hierarchy. */
internal inline fun <T> mapNodeErrors(path: String?, block: () -> T): T =
    try {
        block()
    } catch (e: Throwable) {
        val code = e.asDynamic().code as? String
        val message = (e.message ?: code).orEmpty()
        when (code) {
            null -> throw e // a Kotlin exception thrown by us - pass it through
            "ENOENT", "EACCES", "EISDIR", "EPERM" ->
                throw FileNotFoundException(if (path != null) "$path ($message)" else message)
            else -> throw IOException(message, e)
        }
    }

internal external class TextDecoder(label: String = definedExternally, options: dynamic = definedExternally) {
    fun decode(input: dynamic = definedExternally, options: dynamic = definedExternally): String
}