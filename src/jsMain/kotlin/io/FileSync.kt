package io

import org.khronos.webgl.Uint8Array

internal const val DEFAULT_BUFFER_SIZE: Int = 8 * 1024

external interface Stats {
    val size: Double
}

external fun openSync(path: String, flags: String): Int

external fun closeSync(fd: Int)

external fun existsSync(path: String): Boolean

external fun readSync(fd: Int, buffer: Uint8Array, offset: Int, length: Int, position: Double?): Int

external fun writeSync(fd: Int, buffer: Uint8Array, offset: Int, length: Int, position: Double?): Int

external fun fstatSync(fd: Int): Stats

external fun ftruncateSync(fd: Int, len: Double)

external fun fsyncSync(fd: Int)
