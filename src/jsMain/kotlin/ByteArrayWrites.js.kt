import org.khronos.webgl.DataView

// One-entry cache: callers write many values into the same array in a row (vertex packing),
// so this avoids building a DataView per call without tagging the typed array with expandos.
private var cachedArray: ByteArray? = null
private var cachedView: DataView? = null

private fun ByteArray.view(): DataView {
    if (this === cachedArray) return cachedView.unsafeCast<DataView>()
    val a = this.asDynamic()
    val view = DataView(a.buffer, a.byteOffset, a.byteLength)
    cachedArray = this
    cachedView = view
    return view
}

actual fun ByteArray.putIntLE(pos: Int, value: Int) = view().setInt32(pos, value, true)

actual fun ByteArray.putIntBE(pos: Int, value: Int) = view().setInt32(pos, value, false)

actual fun ByteArray.putFloatLE(pos: Int, value: Float) = view().setFloat32(pos, value, true)
