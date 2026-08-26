package net

import io.IOException
import io.InputStream
import io.OutputStream
import io.asUint8Array
import io.checkBounds
import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.Int8Array
import org.w3c.dom.MessageEvent
import org.w3c.dom.WebSocket

/**
 * Test relay: tailscale serve fronts a fixed WebSocket<->TCP bridge that always forwards to "the
 * games tcp server", so the host/port a caller asks for is not sent anywhere - every Socket opens
 * the same WebSocket. When there's a real JS5 bridge that can route by target, this constant (and
 * the ignored host/port) is what needs to grow a query string or path segment.
 */
private const val RELAY_URL = "ws://localhost:8081/bridge"

/**
 * A browser cannot open a raw TCP socket, so this tunnels through a WebSocket relay instead. The
 * relay is expected to forward raw binary frames 1:1 onto the real TCP stream in both directions.
 *
 * Reads cannot literally block a JS thread the way java.net.Socket blocks a real one - doing so
 * would freeze the tab and starve the very WebSocket callback that would deliver the data. Instead
 * getInputStream().read() is non-blocking: it returns 0 when nothing is buffered yet. That is only
 * safe because RingBufferInputStream.run() (the sole caller of a raw Socket InputStream in this
 * codebase) yields back to the event loop whenever a read comes back empty - see the comment there.
 */
actual open class Socket actual constructor(host: String?, port: Int) {

    private val port: Int = port
    private var connectedOnce = false
    private var closed = false
    private var error: IOException? = null

    private val ws: WebSocket = WebSocket(RELAY_URL)
    private val outQueue = mutableListOf<ByteArray>()
    private val inChunks = ArrayDeque<Int8Array>()
    private var inChunkOffset = 0

    init {
        ws.asDynamic().binaryType = "arraybuffer"
        ws.onopen = {
            connectedOnce = true
            for (chunk in outQueue) ws.send(chunk.asUint8Array())
            outQueue.clear()
            Unit
        }
        ws.onmessage = { event ->
            val data = (event as MessageEvent).data
            if (data is ArrayBuffer) inChunks.addLast(Int8Array(data))
            Unit
        }
        ws.onerror = {
            if (error == null) error = IOException("WebSocket relay error connecting to $host:$port")
            Unit
        }
        ws.onclose = {
            closed = true
            Unit
        }
    }

    actual constructor(address: InetAddress, port: Int) : this(address.getHostName(), port)

    private val input = object : InputStream() {
        override fun read(): Int {
            val buf = ByteArray(1)
            val n = read(buf, 0, 1)
            return if (n <= 0) -1 else buf[0].toInt() and 0xff
        }

        override fun read(b: ByteArray, off: Int, len: Int): Int {
            checkBounds(b.size, off, len)
            if (len == 0) return 0
            var copied = 0
            while (copied < len && inChunks.isNotEmpty()) {
                val chunk = inChunks.first()
                val available = chunk.length - inChunkOffset
                val toCopy = minOf(available, len - copied)
                for (i in 0 until toCopy) b[off + copied + i] = (chunk.asDynamic()[inChunkOffset + i] as Int).toByte()
                inChunkOffset += toCopy
                copied += toCopy
                if (inChunkOffset >= chunk.length) {
                    inChunks.removeFirst()
                    inChunkOffset = 0
                }
            }
            if (copied > 0) return copied
            error?.let { throw it }
            if (closed) return -1
            return 0
        }

        override fun available(): Int {
            if (inChunks.isEmpty()) return 0
            var total = -inChunkOffset
            for (chunk in inChunks) total += chunk.length
            return total
        }

        override fun close() {
            this@Socket.close()
        }
    }

    private val output = object : OutputStream() {
        override fun write(b: Int) {
            write(byteArrayOf(b.toByte()), 0, 1)
        }

        override fun write(b: ByteArray?, off: Int, len: Int) {
            b ?: return
            checkBounds(b.size, off, len)
            error?.let { throw it }
            if (closed) throw IOException("Socket is closed")
            val slice = b.copyOfRange(off, off + len)
            if (connectedOnce) ws.send(slice.asUint8Array()) else outQueue.add(slice)
        }

        override fun close() {
            this@Socket.close()
        }
    }

    actual open fun getInputStream(): InputStream = input

    actual open fun getOutputStream(): OutputStream = output

    actual open fun close() {
        closed = true
        ws.close()
    }

    actual open fun isConnected(): Boolean = connectedOnce

    actual open fun isClosed(): Boolean = closed

    actual open fun getPort(): Int = port

    actual open fun getLocalPort(): Int = -1

    actual open fun setSoTimeout(timeout: Int) {
    }

    actual open fun setTcpNoDelay(on: Boolean) {
    }

    actual open fun shutdownInput() {
    }

    actual open fun shutdownOutput() {
    }
}
