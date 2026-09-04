package jaggl

import org.khronos.webgl.Float32Array
import org.khronos.webgl.Int32Array
import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array
import org.khronos.webgl.Uint32Array

/**
 * The Kotlin/JS IR backend represents primitive arrays as the matching JS
 * typed array under the hood, so these casts are free (no copy).
 */
internal fun FloatArray.asFloat32Array(): Float32Array = this.unsafeCast<Float32Array>()
internal fun IntArray.asInt32Array(): Int32Array = this.unsafeCast<Int32Array>()
internal fun ByteArray.asInt8Array(): Int8Array = this.unsafeCast<Int8Array>()

internal fun ByteArray.asUint8Array(): Uint8Array {
    val i8 = this.unsafeCast<Int8Array>()
    return Uint8Array(i8.buffer, i8.byteOffset, i8.length)
}

internal fun IntArray.asUint8ArrayView(elementOffset: Int, elementCount: Int): Uint8Array {
    val i32 = this.unsafeCast<Int32Array>()
    val bytes = Uint8Array(i32.buffer, i32.byteOffset, i32.length * 4)
    return bytes.subarray(elementOffset * 4, (elementOffset + elementCount) * 4)
}

/** Reinterprets the first [elementCount] ints as unsigned (bit pattern is identical for non-negative values). */
internal fun IntArray.asUint32ArrayView(elementCount: Int): Uint32Array {
    val i32 = this.unsafeCast<Int32Array>()
    return Uint32Array(i32.buffer, i32.byteOffset, elementCount)
}
