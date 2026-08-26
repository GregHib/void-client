package net

import io.IOException
import io.InputStream
import io.OutputStream

/**
 * A browser cannot open a raw TCP socket, and there is no WebSocket bridge yet. Every method fails
 * with IOException rather than TODO() so the failure lands where the client already expects one:
 * the connect runs as a PrivilegedOperationWorker task whose catch marks the node failed, which
 * Client.method114 turns into a retry-with-backoff and eventually method82("js5connect").
 */
actual open class Socket actual constructor(host: String?, port: Int) {

    init {
        throw IOException("No TCP transport available in the browser ($host:$port)")
    }

    actual constructor(address: InetAddress, port: Int) : this(address.getHostName(), port)

    actual open fun getInputStream(): InputStream = throw IOException("Socket is not connected")

    actual open fun getOutputStream(): OutputStream = throw IOException("Socket is not connected")

    actual open fun close() {
    }

    actual open fun isConnected(): Boolean = false

    actual open fun isClosed(): Boolean = true

    actual open fun getPort(): Int = -1

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
