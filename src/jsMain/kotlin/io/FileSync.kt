package io

import org.khronos.webgl.Uint8Array

internal const val DEFAULT_BUFFER_SIZE: Int = 8 * 1024

/**
 * These used to be `external fun` bindings to Node's `fs` module. In a browser those are undefined
 * globals, and the resulting ReferenceError is not a kotlin.Exception - so it would blow straight
 * through the per-candidate `catch (Exception)` in FileStoreLocator.method1464. They are now backed
 * by [MemFs]; RandomAccessFile, FileInputStream and FileOutputStream call this same surface and
 * needed no changes.
 */

interface Stats {
    val size: Double
}

private class MemStats(override val size: Double) : Stats

private val descriptors: MutableMap<Int, MemFd> = mutableMapOf()
private var nextFd: Int = 3

fun openSync(path: String, flags: String): Int {
    val key = MemFs.normalise(path)
    if (MemFs.isDirectory(key)) throw FileNotFoundException("$key (Is a directory)")

    val existing = MemFs.files[key]
    val file = when (flags) {
        "r", "r+", "rs+" -> existing ?: throw FileNotFoundException("$key (No such file or directory)")
        "w", "w+" -> (existing ?: MemFile().also { MemFs.files[key] = it }).also { it.truncate(0) }
        "a", "a+" -> existing ?: MemFile().also { MemFs.files[key] = it }
        else -> throw IllegalArgumentException("Unsupported flags \"$flags\"")
    }

    val fd = nextFd++
    val descriptor = MemFd(key, file, append = flags.startsWith("a"))
    if (descriptor.append) descriptor.position = file.size
    descriptors[fd] = descriptor
    return fd
}

fun closeSync(fd: Int) {
    val descriptor = descriptors.remove(fd) ?: throw IOException("Bad file descriptor: $fd")
    descriptor.closed = true
}

fun existsSync(path: String): Boolean = MemFs.exists(path)

private fun descriptor(fd: Int): MemFd =
    descriptors[fd] ?: throw IOException("Bad file descriptor: $fd")

fun readSync(fd: Int, buffer: Uint8Array, offset: Int, length: Int, position: Double?): Int {
    val descriptor = descriptor(fd)
    val start = position?.toInt() ?: descriptor.position
    if (start >= descriptor.file.size) return 0
    val count = minOf(length, descriptor.file.size - start)
    for (i in 0 until count) {
        buffer.asDynamic()[offset + i] = descriptor.file.data[start + i].toInt() and 0xFF
    }
    if (position == null) descriptor.position = start + count
    return count
}

fun writeSync(fd: Int, buffer: Uint8Array, offset: Int, length: Int, position: Double?): Int {
    val descriptor = descriptor(fd)
    val start = position?.toInt() ?: descriptor.position
    val end = start + length
    descriptor.file.ensureCapacity(end)
    for (i in 0 until length) {
        descriptor.file.data[start + i] = (buffer.asDynamic()[offset + i] as Int).toByte()
    }
    if (end > descriptor.file.size) descriptor.file.size = end
    if (position == null) descriptor.position = end
    return length
}

fun fstatSync(fd: Int): Stats = MemStats(descriptor(fd).file.size.toDouble())

fun ftruncateSync(fd: Int, len: Double) {
    descriptor(fd).file.truncate(len.toInt())
}

fun fsyncSync(fd: Int) {
    descriptor(fd)
}
