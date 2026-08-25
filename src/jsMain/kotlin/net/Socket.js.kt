package net

import io.InputStream
import io.OutputStream

actual open class Socket actual constructor(host: String?, port: Int) {
    actual open fun getInputStream(): InputStream {
        TODO("Not yet implemented")
    }

    actual open fun getOutputStream(): OutputStream {
        TODO("Not yet implemented")
    }

    actual open fun close() {
    }

    actual open fun isConnected(): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun isClosed(): Boolean {
        TODO("Not yet implemented")
    }

    actual open fun getPort(): Int {
        TODO("Not yet implemented")
    }

    actual open fun getLocalPort(): Int {
        TODO("Not yet implemented")
    }

    actual open fun setSoTimeout(timeout: Int) {
    }

    actual open fun setTcpNoDelay(on: Boolean) {
    }

    actual open fun shutdownInput() {
    }

    actual open fun shutdownOutput() {
    }

    actual constructor(address: InetAddress, port: Int) : this(address.getHostName(), port) {
        TODO("Not yet implemented")
    }
}