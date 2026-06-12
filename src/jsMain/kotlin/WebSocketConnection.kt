/**
 * JS [Class238] backed by a browser `WebSocket`.
 *
 * ## Why this shape
 *
 * The JVM connection (`Class238_Sub1`) owns two worker threads: `Class376` pumps the
 * socket's [InputStream] into a ring buffer, and `Class208` drains an outgoing ring to
 * the [OutputStream]. The web is single-threaded, so there are no pumps — the browser
 * does the I/O on the event loop:
 *
 *  - **Reads:** every binary `message` event appends its bytes to [readBuffer]. The game
 *    polls [method1701] synchronously (returns 0 when empty, never blocks), so we just
 *    drain whatever has arrived. This reproduces the `Class376` ring-buffer behaviour
 *    without a thread: callers already busy-wait/yield when 0 bytes are ready (see
 *    Class202.method1474).
 *  - **Writes:** [method1706] calls `WebSocket.send` directly. If the socket is still
 *    CONNECTING, the bytes are queued in [pendingWrites] and flushed on `open` — so
 *    callers never have to care that the handshake is async.
 *  - **Errors / EOF:** a failed connect, `error`, or `close` records [failure]; every
 *    subsequent read/write throws [IOException], and a clean remote close after the
 *    buffer drains surfaces as EOF — matching how the JVM reader pump turns a closed
 *    socket into an [IOException]/[EOFException].
 *
 * ## Wire format
 *
 * Binary passthrough: the bytes carried by each WebSocket frame are the raw game
 * protocol bytes, 1:1. The far end is a WebSocket-native game server or a
 * WebSocket->TCP proxy. WebSocket framing already preserves message boundaries, but the
 * game protocol is a byte stream, so we concatenate all received frames into one
 * continuous buffer and never assume a read maps to a single frame.
 *
 * Uses `dynamic` for the WebSocket / typed-array interop to match the existing jsMain
 * style (JsKeyboardInput etc.) and avoid pulling in typed DOM bindings.
 *
 * @param url the fully-built ws(s):// endpoint.
 * @param bufferKey buffer-size hint from callers (e.g. GAME_CONNECTION_KEY); the web
 *        impl grows its buffer dynamically, so this is informational only.
 */
class WebSocketConnection(url: String, @Suppress("UNUSED_PARAMETER") bufferKey: Int) : Class238() {

    /** Bytes received but not yet consumed. A simple growable byte deque. */
    private var readBuffer = ByteArray(INITIAL_CAPACITY)
    private var readHead = 0   // next byte to hand out
    private var readTail = 0   // one past the last valid byte

    /** Writes issued before the socket finished opening. */
    private val pendingWrites = ArrayList<ByteArray>()

    /** First fatal error seen (connect failure / error / unexpected close). */
    private var failure: IOException? = null

    /** Set once the remote closes; EOF is reported only after the buffer drains. */
    private var remoteClosed = false

    private var closedByUs = false

    private val socket: dynamic = js("new WebSocket(url)")

    init {
        socket.binaryType = "arraybuffer"
        socket.onopen = {
            // Flush anything queued while CONNECTING, preserving order.
            for (chunk in pendingWrites) sendRaw(chunk)
            pendingWrites.clear()
            Unit
        }
        socket.onmessage = { event: dynamic ->
            val data = event.data
            // Binary frames arrive as ArrayBuffer (binaryType="arraybuffer").
            if (data != null && jsTypeOf(data) == "object") appendBytes(data)
            Unit
        }
        socket.onerror = {
            if (failure == null) failure = IOException("WebSocket error")
            Unit
        }
        socket.onclose = {
            if (!closedByUs) remoteClosed = true
            Unit
        }
    }

    // ---- Class238 contract ---------------------------------------------------

    /**
     * Read up to [i] (=len) bytes into [is] starting at [i_off] (=off). Returns the
     * number actually copied (0 if nothing is buffered yet — caller is expected to
     * retry). Mirrors Class376.method3617: non-blocking, drains what's available.
     */
    override fun method1701(i: Int, i_off: Int, i_1_: Byte, `is`: ByteArray): Int {
        val len = i
        val off = i_off
        if (len < 0 || off < 0 || `is`.size < off + len) throw IOException()

        val available = readTail - readHead
        if (available <= 0) {
            failure?.let { throw IOException(it.message) }
            if (remoteClosed) throw EOFException()
            return 0
        }
        val n = if (len < available) len else available
        copyBytes(readBuffer, readHead, `is`, off, n)
        readHead += n
        if (readHead == readTail) {
            readHead = 0
            readTail = 0
        }
        return n
    }

    /**
     * Write [i] (=len) bytes from [is] starting at [i_1_] (=off). Mirrors
     * Class208.method1528 -> the OutputStream write, but goes straight to the WebSocket
     * (queued if still connecting).
     */
    override fun method1706(i: Int, i_0_: Int, i_1_: Int, `is`: ByteArray) {
        val len = i
        val off = i_1_
        if (len < 0 || off < 0 || off + len > `is`.size) throw IOException()
        failure?.let { throw IOException(it.message) }

        val chunk = `is`.copyOfRange(off, off + len)
        // WebSocket.CONNECTING == 0
        if (socket.readyState == 0) {
            pendingWrites.add(chunk)
        } else {
            sendRaw(chunk)
        }
    }

    /**
     * True iff at least [i] bytes are readable. Returns false (not an error) when fewer
     * are buffered but the stream is still alive; throws when the stream has failed.
     * Mirrors Class376.method3619.
     */
    override fun method1705(i: Int, i_6_: Int): Boolean {
        val available = readTail - readHead
        if (i > available) {
            failure?.let { throw IOException(it.message) }
            if (remoteClosed) throw EOFException()
            return false
        }
        return true
    }

    /** Bytes readable right now. Mirrors Class376.availableCount. */
    override fun availableCount(): Int {
        failure?.let { throw IOException(it.message) }
        return readTail - readHead
    }

    /** Close the connection. Mirrors Class238_Sub1.method1700. */
    override fun method1700(i: Byte) {
        closedByUs = true
        try {
            socket.close()
        } catch (e: Throwable) {
            /* empty */
        }
    }

    /**
     * In the JVM impl this swaps the reader's stream to a dead stub (method3618) to
     * unblock the pump on shutdown. There is no pump here, so there is nothing to do
     * beyond marking the stream closed.
     */
    override fun method1702(i: Int) {
        closedByUs = true
    }

    // ---- internals -----------------------------------------------------------

    private fun sendRaw(chunk: ByteArray) {
        // Build an Int8Array view and send its underlying ArrayBuffer.
        val view = js("new Int8Array(chunk.length)")
        for (k in chunk.indices) view[k] = chunk[k]
        socket.send(view.buffer)
    }

    /** Append the bytes of an incoming ArrayBuffer to the read buffer. */
    private fun appendBytes(arrayBuffer: dynamic) {
        val bytes = js("new Int8Array(arrayBuffer)")
        val n: Int = bytes.length as Int
        ensureCapacity(n)
        var w = readTail
        for (k in 0 until n) {
            readBuffer[w++] = (bytes[k] as Int).toByte()
        }
        readTail = w
    }

    /** Make sure [extra] more bytes fit after [readTail], compacting/growing as needed. */
    private fun ensureCapacity(extra: Int) {
        if (readTail + extra <= readBuffer.size) return
        val used = readTail - readHead
        if (used + extra <= readBuffer.size) {
            copyBytes(readBuffer, readHead, readBuffer, 0, used)
            readHead = 0
            readTail = used
            return
        }
        var newCap = if (readBuffer.size == 0) INITIAL_CAPACITY else readBuffer.size
        while (used + extra > newCap) newCap *= 2
        val grown = ByteArray(newCap)
        copyBytes(readBuffer, readHead, grown, 0, used)
        readBuffer = grown
        readHead = 0
        readTail = used
    }

    private fun copyBytes(src: ByteArray, srcPos: Int, dst: ByteArray, dstPos: Int, n: Int) {
        if (src === dst && dstPos < srcPos) {
            for (k in 0 until n) dst[dstPos + k] = src[srcPos + k]
        } else {
            for (k in n - 1 downTo 0) dst[dstPos + k] = src[srcPos + k]
        }
    }

    companion object {
        private const val INITIAL_CAPACITY = 8192
    }
}
