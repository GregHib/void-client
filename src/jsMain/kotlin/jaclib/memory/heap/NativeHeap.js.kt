package jaclib.memory.heap

private object NativeHeapMemory {
    private var nextHandle = 1
    val buffers = HashMap<Int, ByteArray>()

    fun allocate(size: Int): Int {
        val handle = nextHandle++
        buffers[handle] = ByteArray(size)
        return handle
    }

    fun get(handle: Int, dst: ByteArray?, dstOffset: Int, srcOffset: Int, length: Int) {
        val data = buffers[handle] ?: return
        if (dst == null) return
        data.copyInto(dst, dstOffset, srcOffset, srcOffset + length)
    }

    fun put(handle: Int, src: ByteArray?, srcOffset: Int, dstOffset: Int, length: Int) {
        val data = buffers[handle] ?: return
        if (src == null) return
        src.copyInto(data, dstOffset, srcOffset, srcOffset + length)
    }

    fun deallocate(handle: Int) {
        buffers.remove(handle)
    }
}

fun nativeHeapBytes(address: Long): ByteArray? = NativeHeapMemory.buffers[address.toInt()]

private external class FinalizationRegistry(cleanup: (Int) -> Unit) {
    fun register(target: Any, heldValue: Int)
}

/** FinalizationRegistry is ES2021; without it buffers simply stay allocated, as before. */
private val finalizationSupported: Boolean =
    js("typeof FinalizationRegistry === 'function'").unsafeCast<Boolean>()

/**
 * Frees a heap slot once the NativeHeapBuffer that owns it is collected.
 *
 * NativeHeapBuffer.finalize() does exactly this on the JVM, and finalizers never run on JS - so
 * every buffer ever allocated stayed in the table. OpenGlTerrainTile builds a fresh
 * NativeVertexBuffer for each textured terrain batch it draws, so that was a steady leak for as
 * long as the client ran.
 *
 * The handle is the held value rather than the buffer itself, since a registry entry must not
 * reference its own target. Nothing else frees a handle, so a slot cannot be freed twice and then
 * reused out from under a live buffer.
 */
private val bufferFinalizer: FinalizationRegistry? =
    if (finalizationSupported) FinalizationRegistry { handle -> NativeHeapMemory.deallocate(handle) } else null

actual class NativeHeap actual constructor(actual val b: Int) {
    private var allocated = true

    actual fun b() {
        allocated = false
    }

    actual val peer: Long
        get() = 0L

    actual fun a(): Boolean = allocated

    actual fun a(arg0: Int, arg1: Boolean): NativeHeapBuffer {
        check(allocated)
        val handle = this.allocateBuffer(arg0, arg1)
        val buffer = NativeHeapBuffer(this, handle, arg0)
        bufferFinalizer?.register(buffer, handle)
        return buffer
    }

    actual var a: Boolean
        get() = allocated
        set(value) { allocated = value }

    actual fun allocateHeap(arg0: Int) {
    }

    actual fun finalize() {
        this.b()
    }

    actual fun allocateBuffer(arg0: Int, arg1: Boolean): Int = NativeHeapMemory.allocate(arg0)

    actual fun get(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int) {
        NativeHeapMemory.get(arg0, arg1, arg2, arg3, arg4)
    }

    actual fun put(arg0: Int, arg1: ByteArray?, arg2: Int, arg3: Int, arg4: Int) {
        NativeHeapMemory.put(arg0, arg1, arg2, arg3, arg4)
    }

    actual fun deallocateHeap() {
    }

    actual fun getBufferAddress(arg0: Int): Long = arg0.toLong()

    actual fun deallocateBuffer(arg0: Int) {
        NativeHeapMemory.deallocate(arg0)
    }
}
