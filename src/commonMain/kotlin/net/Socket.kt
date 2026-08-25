package net

import io.InputStream
import io.OutputStream

expect open class Socket(host: String?, port: Int) {
    constructor(address: InetAddress, port: Int)
    open fun getInputStream(): InputStream
    open fun getOutputStream(): OutputStream
    open fun close()
    open fun isConnected(): Boolean
    open fun isClosed(): Boolean
    open fun getPort(): Int
    open fun getLocalPort(): Int
    open fun setSoTimeout(timeout: Int)
    open fun setTcpNoDelay(on: Boolean)
    open fun shutdownInput()
    open fun shutdownOutput()
}
